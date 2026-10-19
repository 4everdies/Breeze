package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import rip.breeze.BreezeModule;
import rip.breeze.ConditionsSetting;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "KnockbackDelay",
   b = "Delays your knockback when you get hit, reducing its effect.",
   d = rip.breeze.ModuleCategory.COMBAT,
   c = {"velocity", "kb", "anti", "antikb"}
)
public class KnockbackDelay extends BreezeModule implements IBreezeInterface3 {
   private final GenericSetting<Double> chanceSetting;
   private final GenericSetting<Integer> maxTimeSetting;
   private final ConditionsSetting conditionsSetting;
   private final GenericSetting<Boolean> weaponOnlySetting;
   private final GenericSetting<Boolean> lookingAtEnemySetting;
   private final GenericSetting<Boolean> inAirSetting;
   private boolean fieldBool_t;
   private static final String[] CONST_V;
   private static final String[] CONST_W;
   private static final Map CONST_X = new HashMap(13);

   public KnockbackDelay() {
      long var1 = 132632957641901L;
      super();
      short var10002 = 12660;
      long var10003 = 6489834441721733135L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Chance");
      var10002 = 22776;
      var10003 = 6569532722478188939L ^ var1;
      this.chanceSetting = var10001.getDataBuilder50_3("Chance that the module will be activated for a hit.")
         .getDataBuilder50_4(100.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 100.0))
         .getDataBuilder54();
      var10002 = 9819;
      var10003 = 3846911393336391458L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "MaxTime");
      var10002 = 757;
      var10003 = 7559982750721823620L ^ var1;
      this.maxTimeSetting = var10001.getDataBuilder50_3("The maximum time to lag the player.")
         .getDataBuilder50_4(300)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 1000))
         .getDataBuilder54();
      short var10004 = 19352;
      long var10005 = 2253814305931598574L ^ var1;
      this.conditionsSetting = new ConditionsSetting(this, "Conditions");
      var10002 = 1203;
      var10003 = 5551641295365920193L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.conditionsSetting, "WeaponOnly");
      var10002 = 13648;
      var10003 = 4265205527490487338L ^ var1;
      this.weaponOnlySetting = var10001.getDataBuilder50_3("Only activate when you are holding a weapon.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 26098;
      var10003 = 2517463713201534082L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.conditionsSetting, "LookingAtEnemy");
      var10002 = 20378;
      var10003 = 1513432732048039663L ^ var1;
      this.lookingAtEnemySetting = var10001.getDataBuilder50_3("Only stall packets while you are still looking at the enemy.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      var10002 = 32027;
      var10003 = 924177630547029103L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.conditionsSetting, "InAir");
      var10002 = 26241;
      var10003 = 23460018152880118L ^ var1;
      this.inAirSetting = var10001.getDataBuilder50_3("Only delay knockback while you are in air, than releases again when you hit the ground.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      this.fieldBool_t = false;
      BreezeClient.getConfigManager().update_1(this, 16);
   }

   public EnumType27 getEnum_PROCESS(Packet<?> var1, boolean var2) {
      long var3 = 29844293304432L;
      boolean var5 = BreezeClient.getConfigManager().getArrayList(this).isEmpty();
      return var5 ? EnumType27.PROCESS : EnumType27.DELAY;
   }

   public EnumType27 getEnum_PROCESS_2(Packet<?> var1, boolean var2) {
      long var3 = 100277995698129L;
      boolean var5 = BreezeClient.getConfigManager().getArrayList(this).isEmpty();
      if (!var5) {
         return EnumType27.DELAY;
      }

      if (!this.f() || BreezeClient.isValid()) {
         return EnumType27.PROCESS;
      }

      if (!(var1 instanceof S12PacketEntityVelocity)) {
         return EnumType27.PROCESS;
      }

      if (((S12PacketEntityVelocity)var1).getEntityID() != BreezeClient.CONST_A.thePlayer.getEntityId()) {
         return EnumType27.PROCESS;
      }

      if (!this.randomValue()) {
         return EnumType27.PROCESS;
      }

      Entity var6 = this.getDistance();
      if (var6 == null) {
         return EnumType27.PROCESS;
      }

      if (this.lookingAtEnemySetting.getObject_m() && !this.getHitbox(var6)) {
         return EnumType27.PROCESS;
      }

      if (this.weaponOnlySetting.getObject_m() && !BreezeClient.getThemeManager().getHeldItem(BreezeClient.CONST_A.thePlayer)) {
         return EnumType27.PROCESS;
      }

      if (this.inAirSetting.getObject_m() && BreezeClient.CONST_A.thePlayer.onGround) {
         return EnumType27.PROCESS;
      }

      this.fieldBool_t = false;
      return EnumType27.DELAY;
   }

   public void toggle(ArrayList<DelayedPacket> var1) {
      long var2 = 131090423664411L;
      if (!var1.isEmpty()) {
         if (BreezeClient.isValid()) {
            BreezeClient.getConfigManager().processAll(this);
         } else if (this.fieldBool_t) {
            BreezeClient.getConfigManager().processAll(this);
         } else if (BreezeClient.CONST_A.thePlayer.isDead) {
            this.fieldBool_t = true;
            BreezeClient.getConfigManager().processAll(this);
         } else if (this.lookingAtEnemySetting.getObject_m() && !this.getHitbox(this.getDistance())) {
            this.fieldBool_t = true;
            BreezeClient.getConfigManager().processAll(this);
         } else if (this.inAirSetting.getObject_m() && BreezeClient.CONST_A.thePlayer.onGround) {
            this.fieldBool_t = true;
            BreezeClient.getConfigManager().processAll(this);
         } else {
            DelayedPacket var4 = (DelayedPacket)var1.get(0);
            if (var4.isValid_3(this.maxTimeSetting.getObject_m().intValue())) {
               this.fieldBool_t = true;
               BreezeClient.getConfigManager().processAll(this);
            }
         }
      }
   }

   private boolean randomValue() {
      long var1 = 29010943370870L;
      return this.chanceSetting.getObject_m() / 100.0 >= Math.random();
   }

   private boolean getHitbox(Entity var1) {
      long var2 = 36787653847438L;
      if (var1 == null) {
         return false;
      }

      AxisAlignedBB var4 = var1.getEntityBoundingBox().expand(0.3, 0.3, 0.3);
      Vec3 var5 = BreezeClient.CONST_A.thePlayer.getPositionEyes(MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks);
      Vec3 var6 = BreezeClient.CONST_A.thePlayer.getLook(MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks);
      MovingObjectPosition var7 = var4.calculateIntercept(var5, var5.addVector(var6.xCoord * 5.0, var6.yCoord * 5.0, var6.zCoord * 5.0));
      return var7 != null && var7.entityHit == var1;
   }

   private Entity getDistance() {
      long var1 = 123317837680809L;
      int[] var3 = AimAssist.getStateArray();
      if (BreezeClient.CONST_A.objectMouseOver.entityHit instanceof EntityPlayer
         && AntiBot.isInvisible_3((EntityPlayer)BreezeClient.CONST_A.objectMouseOver.entityHit)) {
         return BreezeClient.CONST_A.objectMouseOver.entityHit;
      }

      if (BreezeClient.getThemeManager().getEntity() != null) {
         return BreezeClient.getThemeManager().getEntity();
      }

      float var4 = 5.0F;
      EntityPlayer var5 = null;

      for (EntityPlayer var7 : BreezeClient.CONST_A.theWorld.playerEntities) {
         float var8 = var7.getDistanceToEntity(BreezeClient.CONST_A.thePlayer);
         if (var7 != BreezeClient.CONST_A.thePlayer && var8 < var4) {
            var5 = var7;
            var4 = var8;
         }

         if (var3 == null) {
            break;
         }
      }

      return var5;
   }

   static {
      long var0 = 125300822501165L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[11];
      int var5 = 0;
      String var6 = "\u001d¾Gx\u0001÷,Å6Óh_VlrpåRú>\u009cO\u007f\u0016\u000bÎ\u0013}ÀON\u000b£¾g\u0005\u001b³{\u0086¨³\"zïÀ\u0015\u00885´DØcFnÄ\u0080WFå\u0010e/\u009fO|\u009dY£`A9\u009d¯_\u0093iyÞdo_j\u008d<íSx tqüæS²jy\u001d \u0004UW¡(\t½ÓZ±\u0013\u0081cä\u001aÙ\u009f\u0014v´\u0098\u0015@/~QQ\u00adcS>\u001c\u0082Ë\u0003Ó\fò\u0017¯ßYÍ\u009f~\u000635\u0002gà'\u0000`¼ªÍJ\u0012\u0096¢Öp'm\tR\f×ÚÝ\u001cÌw i)\u008b¥\u0091Ó&\u0019ñ\"?ß r3Õ\u0099³·ý )\u0001´ÊÞyïÒëÏzåUÎd£ë\u000b\u0004ãB?\u0006\u001b\u0090R\bN!°å\u0082\u0017VÜM®ÄÅw\u0090O\u0088]ZN«yÞÚt\u0089Öâ\u0012\u001b°x\u008f64Æ¬ê)wM¯\u0000È\u008e\u0097¿\u0097í\bÛd>Áú\u008f60ð\u0015:/-\u0083è1©¤ýÁÛÑûv>\u0092)¾<¡=Ùz\u0001çÓZ\u001fg¹\u0083w;\u0093\u0003å¥\u0099ÖÜ³¿e\u009f\u001b+\u0012v\u0082ö×¸:P\bx\u009b¯%xÒ´°,:þ\u0016\u00868Ôn9º{GÞ\u0005¾\u0000\u0000\u0088\u001f\u0082\u0018È$q%\u0085Mk \u0007D\u0088\u00ad\u0088q»\u0015\u0093z<\\YväDh\u0083Daêy½^Æïû£%A\u0080ðy2\u001di\u0005Ö¸Æb®ÝÖñ_!¶\u0013la u\u009e¼PÇ\u000bÓð°ÎØ\u0010¶Ú\u00941Á\u0006\u009b¶\u008b`¤\u0086\u009bäÁRß<\u0082\u001eO'¤ÆC+\u007fPÖZ\u009f\u0004-Ùw^vî\u000e\u008cþç\u008e\u0016½FîÇû\u001e`ºsJÈRø\u0010\u0006¢x{Ä\u008dR\u000f ü\u0013\u008b°u9\n\u0010É\u0081\u000fTëAIð\u0089iz¬\u0017S\r\u00ad";
      int var7 = "\u001d¾Gx\u0001÷,Å6Óh_VlrpåRú>\u009cO\u007f\u0016\u000bÎ\u0013}ÀON\u000b£¾g\u0005\u001b³{\u0086¨³\"zïÀ\u0015\u00885´DØcFnÄ\u0080WFå\u0010e/\u009fO|\u009dY£`A9\u009d¯_\u0093iyÞdo_j\u008d<íSx tqüæS²jy\u001d \u0004UW¡(\t½ÓZ±\u0013\u0081cä\u001aÙ\u009f\u0014v´\u0098\u0015@/~QQ\u00adcS>\u001c\u0082Ë\u0003Ó\fò\u0017¯ßYÍ\u009f~\u000635\u0002gà'\u0000`¼ªÍJ\u0012\u0096¢Öp'm\tR\f×ÚÝ\u001cÌw i)\u008b¥\u0091Ó&\u0019ñ\"?ß r3Õ\u0099³·ý )\u0001´ÊÞyïÒëÏzåUÎd£ë\u000b\u0004ãB?\u0006\u001b\u0090R\bN!°å\u0082\u0017VÜM®ÄÅw\u0090O\u0088]ZN«yÞÚt\u0089Öâ\u0012\u001b°x\u008f64Æ¬ê)wM¯\u0000È\u008e\u0097¿\u0097í\bÛd>Áú\u008f60ð\u0015:/-\u0083è1©¤ýÁÛÑûv>\u0092)¾<¡=Ùz\u0001çÓZ\u001fg¹\u0083w;\u0093\u0003å¥\u0099ÖÜ³¿e\u009f\u001b+\u0012v\u0082ö×¸:P\bx\u009b¯%xÒ´°,:þ\u0016\u00868Ôn9º{GÞ\u0005¾\u0000\u0000\u0088\u001f\u0082\u0018È$q%\u0085Mk \u0007D\u0088\u00ad\u0088q»\u0015\u0093z<\\YväDh\u0083Daêy½^Æïû£%A\u0080ðy2\u001di\u0005Ö¸Æb®ÝÖñ_!¶\u0013la u\u009e¼PÇ\u000bÓð°ÎØ\u0010¶Ú\u00941Á\u0006\u009b¶\u008b`¤\u0086\u009bäÁRß<\u0082\u001eO'¤ÆC+\u007fPÖZ\u009f\u0004-Ùw^vî\u000e\u008cþç\u008e\u0016½FîÇû\u001e`ºsJÈRø\u0010\u0006¢x{Ä\u008dR\u000f ü\u0013\u008b°u9\n\u0010É\u0081\u000fTëAIð\u0089iz¬\u0017S\r\u00ad"
         .length();
      char var8 = 'X';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_V = var4;
                     CONST_W = new String[11];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "*\u0016x\u009e?úF\u00ad\u009f\u0091\u009bHS]ð Õ®Æ7\u0002s\u001e8¿â\u0081D\b¢|</\u0016¯u^\u0095S\u008e±8º\u001c·çMÂ\u0087ý,\u000e\u0096â\\î¥ë O±Bzf8 \u0086v8¯{½X¼\f\u0013`¤Ó\r\u0010s\u001c9Öª\u001fÈé·òs´\n\u0000½Â";
                  var7 = "*\u0016x\u009e?úF\u00ad\u009f\u0091\u009bHS]ð Õ®Æ7\u0002s\u001e8¿â\u0081D\b¢|</\u0016¯u^\u0095S\u008e±8º\u001c·çMÂ\u0087ý,\u000e\u0096â\\î¥ë O±Bzf8 \u0086v8¯{½X¼\f\u0013`¤Ó\r\u0010s\u001c9Öª\u001fÈé·òs´\n\u0000½Â"
                     .length();
                  var8 = 'P';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13790;
      if (CONST_W[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_X.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_X.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dp", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_V[var3].getBytes("ISO-8859-1");
         CONST_W[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_W[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_2(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getObject".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/dp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
