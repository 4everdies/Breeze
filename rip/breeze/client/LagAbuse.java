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
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "LagAbuse",
   b = "Simulates a bad internet connection to make it harder for enemies to hit you.",
   d = rip.breeze.ModuleCategory.COMBAT,
   c = "FakeLag"
)
public class LagAbuse extends BreezeModule implements IBreezeInterface3 {
   private final GenericSetting<Boolean> swordOnlySetting;
   private final GenericSetting<Integer> maxTimeSetting;
   private final GenericSetting<Boolean> renderSetting;
   private final GenericSetting<rip.breeze.BreezeColor> colorSetting;
   private final float fieldFloat_r;
   private final float fieldFloat_s;
   private Vec3 vec3_t;
   private AxisAlignedBB axisAlignedBB_u;
   private EntityPlayer entityPlayer_v;
   private long fieldLong_w;
   private static final String[] CONST_Y;
   private static final String[] CONST_Z;
   private static final Map CONST_A = new HashMap(13);
   private static final long eka_1;

   public LagAbuse() {
      long var1 = 30043606902187L;
      super();
      short var10002 = 2864;
      long var10003 = 2019490974406692925L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "SwordOnly");
      var10002 = 6602;
      var10003 = 8434877326814954179L ^ var1;
      this.swordOnlySetting = var10001.getDataBuilder50_3("Only lag when holding a sword.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 5759;
      var10003 = 2425529631963008371L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "MaxTime");
      var10002 = 23934;
      var10003 = 1546029785949406838L ^ var1;
      this.maxTimeSetting = var10001.getDataBuilder50_3("The maximum time to lag the player.")
         .getDataBuilder50_4(300)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 1000))
         .getDataBuilder54();
      var10002 = 24686;
      var10003 = 3905250260980349797L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Render");
      var10002 = 12806;
      var10003 = 7713341595263199500L ^ var1;
      this.renderSetting = var10001.getDataBuilder50_3("Render the server side position of the player.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 28821;
      var10003 = 8561738741103963035L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Color");
      var10002 = 18905;
      var10003 = 1071544170232779478L ^ var1;
      this.colorSetting = var10001.getDataBuilder50_3("The color of the render.")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(24, 0, 135, 59))
         .getDataBuilder50_8()
         .getDataBuilder50_9(this::lambda$new_Inner0)
         .getDataBuilder54();
      this.fieldFloat_r = 8.0F;
      this.fieldFloat_s = 3.0F;
      this.vec3_t = null;
      this.axisAlignedBB_u = null;
      BreezeClient.getConfigManager().update_1(this, 4);
   }

   @Override
   public void initialize() {
      this.entityPlayer_v = null;
      this.fieldLong_w = 0L;
   }

   private int clamp() {
      long var1 = 57229998130340L;
      if (this.fieldLong_w == 0L) {
         return 0;
      }

      long var3 = System.currentTimeMillis() - this.fieldLong_w;
      int var5 = (int)(var3 / 50L);
      return Math.max(0, 20 - var5);
   }

   private boolean isValid() {
      long var1 = 37802088707850L;
      return this.clamp() <= 12;
   }

   @EventListener
   public void updateRotation(PreTickEventEvent var1) {
      long var2 = 108141272856296L;
      boolean var4 = BreezeClient.getThemeManager().getEntity() instanceof EntityPlayer;
      int[] var10000 = AimAssist.getStateArray();
      EntityPlayer var5 = null;
      int[] var6 = var10000;
      if (var4) {
         var5 = (EntityPlayer)BreezeClient.getThemeManager().getEntity();
      }

      if (!this.swordOnlySetting.getObject_m()
         || BreezeClient.CONST_A.thePlayer.getHeldItem() != null && BreezeClient.CONST_A.thePlayer.getHeldItem().getItem() instanceof ItemSword) {
         if (this.entityPlayer_v != null
            && (
               BreezeClient.CONST_A.thePlayer.getDistanceToEntity(this.entityPlayer_v) > 8.0F
                  || this.entityPlayer_v.isDead
                  || var4 && this.entityPlayer_v != var5
                  || !BreezeClient.CONST_A.theWorld.getLoadedEntityList().contains(this.entityPlayer_v)
                  || !AntiBot.isInvisible_3(this.entityPlayer_v)
            )) {
            this.entityPlayer_v = null;
            this.fieldLong_w = 0L;
         }

         if (this.entityPlayer_v == null
            && var4
            && var5.getDistanceToEntity(BreezeClient.CONST_A.thePlayer) < 8.0F
            && var5.getDistanceToEntity(BreezeClient.CONST_A.thePlayer) > 3.0F
            && AntiBot.isInvisible_3(var5)) {
            this.entityPlayer_v = var5;
         }

         if (this.entityPlayer_v == null) {
            float var7 = 8.0F;

            for (EntityPlayer var9 : BreezeClient.CONST_A.theWorld.playerEntities) {
               if (var9 != BreezeClient.CONST_A.thePlayer
                  && var9.getDistanceToEntity(BreezeClient.CONST_A.thePlayer) < var7
                  && var9.getDistanceToEntity(BreezeClient.CONST_A.thePlayer) > 3.0F
                  && AntiBot.isInvisible_3(var9)) {
                  this.entityPlayer_v = var9;
                  var7 = var9.getDistanceToEntity(BreezeClient.CONST_A.thePlayer);
               }

               if (var6 == null) {
                  break;
               }
            }
         }
      } else {
         this.entityPlayer_v = null;
      }
   }

   @EventListener
   public void processNullable(Render3DEventEvent var1) {
      long var2 = 16760918765980L;
      if (this.axisAlignedBB_u != null
         && this.renderSetting.getObject_m()
         && this.entityPlayer_v != null
         && BreezeContext.moduleBase_a.getModuleByClass(FreeLook.class).getValue() != 0) {
         RenderUtil31.calculate_2(this.axisAlignedBB_u, this.colorSetting.getObject_m(), false);
         RenderUtil31.getHitbox_4(this.axisAlignedBB_u, this.colorSetting.getObject_m(), 2.0F, false);
      }
   }

   public EnumType27 getDistance(Packet<?> var1, boolean var2) {
      long var3 = 29844293304432L;
      boolean var5 = BreezeClient.getConfigManager().getArrayList(this).isEmpty();
      if (!(var1 instanceof C03PacketPlayer)) {
         return var5 ? EnumType27.PROCESS : EnumType27.DELAY;
      }

      if (this.entityPlayer_v == null) {
         return var5 ? EnumType27.PROCESS : EnumType27.DELAY;
      }

      if (this.vec3_t == null) {
         return var5 ? EnumType27.PROCESS : EnumType27.DELAY;
      }

      C03PacketPlayer var6 = (C03PacketPlayer)var1;
      double var7 = this.entityPlayer_v.getDistance(var6.getPositionX(), var6.getPositionY(), var6.getPositionZ());
      double var9 = this.entityPlayer_v.getDistance(this.vec3_t.xCoord, this.vec3_t.yCoord, this.vec3_t.zCoord);
      return !(var7 < var9) && var5 ? EnumType27.PROCESS : EnumType27.DELAY;
   }

   @EventListener
   public void sendPacket(PacketSendEventEvent var1) {
      long var2 = 51828514160540L;
      if (var1.getPacket_h() instanceof C03PacketPlayer) {
         C03PacketPlayer var4 = var1.getPacket_h();
         this.processAll(var4);
         if (!var4.isMoving()) {
            return;
         }

         float var5 = BreezeClient.CONST_A.thePlayer.width / 2.0F;
         float var6 = BreezeClient.CONST_A.thePlayer.height;
         this.axisAlignedBB_u = new AxisAlignedBB(
            var4.getPositionX() - var5,
            var4.getPositionY(),
            var4.getPositionZ() - var5,
            var4.getPositionX() + var5,
            var4.getPositionY() + var6,
            var4.getPositionZ() + var5
         );
      }
   }

   public void updateRotation_2(ArrayList<DelayedPacket> var1) {
      long var2 = 131090423664411L;
      int[] var4 = AimAssist.getStateArray();
      if (this.entityPlayer_v != null && this.f()) {
         if (!var1.isEmpty()) {
            double var5 = this.entityPlayer_v.getDistance(this.vec3_t.xCoord, this.vec3_t.yCoord, this.vec3_t.zCoord);
            double var7 = var5;
            DelayedPacket var9 = null;

            for (DelayedPacket var11 : var1) {
               label65: {
                  if (var11.packet_g instanceof C03PacketPlayer) {
                     C03PacketPlayer var12 = (C03PacketPlayer)var11.packet_g;
                     if (!var12.isMoving() && var4 != null) {
                        continue;
                     }

                     var5 = this.entityPlayer_v.getDistance(var12.getPositionX(), var12.getPositionY(), var12.getPositionZ());
                     if (var5 >= var7) {
                        var9 = var11;
                        var7 = var5;
                     }

                     if (var4 != null) {
                        break label65;
                     }
                  }

                  if (var11.packet_g instanceof C02PacketUseEntity && (this.isValid() || var5 < 2.5)) {
                     var7 = var5;
                     var9 = var11;
                  }
               }

               if (var4 == null) {
                  break;
               }
            }

            for (DelayedPacket var14 : var1) {
               if (System.currentTimeMillis() <= var14.fieldLong_h + this.maxTimeSetting.getObject_m().intValue()
                  && var14 != var9
                  && (var9 == null || var14.fieldLong_h >= var9.fieldLong_h)) {
                  break;
               }

               var14.update(this);
               if (var4 == null) {
                  break;
               }
            }
         }
      } else {
         if (!var1.isEmpty()) {
            BreezeClient.getConfigManager().processAll(this);
         }
      }
   }

   public EnumType27 getEnum_PROCESS(Packet<?> var1, boolean var2) {
      long var3 = 100277995698129L;
      if (var1 instanceof S19PacketEntityStatus) {
         S19PacketEntityStatus var5 = (S19PacketEntityStatus)var1;
         Entity var6 = var5.getEntity(BreezeClient.CONST_A.theWorld);
         if (var6 != null && var6 == this.entityPlayer_v && var5.getOpCode() == 2) {
            this.fieldLong_w = System.currentTimeMillis() - BreezeClient.getConfigManager().getDataBuilder31_j().getValue() / 2;
         }
      }

      return EnumType27.PROCESS;
   }

   private void processAll(C03PacketPlayer var1) {
      long var2 = 107010749971126L;
      if (var1.isMoving()) {
         this.vec3_t = new Vec3(var1.getPositionX(), var1.getPositionY(), var1.getPositionZ());
      }
   }

   private boolean lambda$new_Inner0(rip.breeze.DateUtil var1) {
      return this.renderSetting.getObject_m();
   }

   static {
      long var0 = 7455469180632L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[8];
      int var5 = 0;
      String var6 = "\u0088ó\u0094\u0088\f\u008c×ÅLV\u0004\u0086\u0017:¹\\\u0019Q($\"ã7@Á@P\u0001\u0019\t¿<Ïx{ïH@Rê\u008fAÅ\u007f·Ù\u001dbD\u00058`\u0080Ö\u0005?\u0094\u00901é6\u008eýþ\u001f\u0016ó86pøs\u0010\u001e\u0093\u0012üÏ\u0017{-\u0093éMxV(Pr@ê\u0014¦&¦W\u001d\u0090}\u0002ËÑ\u0010ì-ÊÒ4ì\u009e&Ø\u008dÛçå)44\u0018Á\u007fT<Ó\u0085\u008e\bRÿÈ/\u0010p×{\u0082Û$ý\u001c|NF\u00966f@S\u008f\u0090]ùÌ0¶\u0096d»\u0086\u0093\u00990ÍÅ\u008b¾å¢m\u008cÆÜ¡fêç\u009fÁb\u0005N½°W\u00198Si\u000e\u0095\u008eSV2\u0001ï\u000f\u007fG¶t\u0000\u0010j`½þ\u008en²\u0004y\u0019ÅY+¸ y0áÜ\u001d\u0094P¼$k²K7j[¶\u009f9yx\u001chA°«H%\u009d\fë9}ÁôóH·*¦!R\u0011_9èQ×ý³P";
      int var7 = "\u0088ó\u0094\u0088\f\u008c×ÅLV\u0004\u0086\u0017:¹\\\u0019Q($\"ã7@Á@P\u0001\u0019\t¿<Ïx{ïH@Rê\u008fAÅ\u007f·Ù\u001dbD\u00058`\u0080Ö\u0005?\u0094\u00901é6\u008eýþ\u001f\u0016ó86pøs\u0010\u001e\u0093\u0012üÏ\u0017{-\u0093éMxV(Pr@ê\u0014¦&¦W\u001d\u0090}\u0002ËÑ\u0010ì-ÊÒ4ì\u009e&Ø\u008dÛçå)44\u0018Á\u007fT<Ó\u0085\u008e\bRÿÈ/\u0010p×{\u0082Û$ý\u001c|NF\u00966f@S\u008f\u0090]ùÌ0¶\u0096d»\u0086\u0093\u00990ÍÅ\u008b¾å¢m\u008cÆÜ¡fêç\u009fÁb\u0005N½°W\u00198Si\u000e\u0095\u008eSV2\u0001ï\u000f\u007fG¶t\u0000\u0010j`½þ\u008en²\u0004y\u0019ÅY+¸ y0áÜ\u001d\u0094P¼$k²K7j[¶\u009f9yx\u001chA°«H%\u009d\fë9}ÁôóH·*¦!R\u0011_9èQ×ý³P"
         .length();
      char var8 = 'H';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var26;
                  if ((var17 += var8) >= var7) {
                     CONST_Y = var4;
                     CONST_Z = new String[8];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 6974128295532606580L;
                     byte[] var15 = var11.doFinal(
                        new byte[]{
                           (byte)(var13 >>> 56),
                           (byte)(var13 >>> 48),
                           (byte)(var13 >>> 40),
                           (byte)(var13 >>> 32),
                           (byte)(var13 >>> 24),
                           (byte)(var13 >>> 16),
                           (byte)(var13 >>> 8),
                           (byte)var13
                        }
                     );
                     long var30 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     50L = var30;
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var26;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "±©{hmÿ[2f\u0086<%+h®Q \u0013\u00ad']ÖÆ1\u00048÷Â\u0090¦¶ðQ\u0080³\u0090aßX\u0019Üh(FÅ,oÂ ";
                  var7 = "±©{hmÿ[2f\u0086<%+h®Q \u0013\u00ad']ÖÆ1\u00048÷Â\u0090¦¶ðQ\u0080³\u0090aßX\u0019Üh(FÅ,oÂ ".length();
                  var8 = 16;
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16033;
      if (CONST_Z[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_A.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_A.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dr", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Y[var3].getBytes("ISO-8859-1");
         CONST_Z[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Z[var3];
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
         throw new RuntimeException("rip/breeze/client/dr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
