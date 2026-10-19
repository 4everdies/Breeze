package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.network.play.client.C02PacketUseEntity.Action;
import net.minecraft.util.Vec3;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "AntiFireball", b = "Automatically deflects incoming fireballs.", d = {rip.breeze.ModuleCategory.COMBAT, rip.breeze.ModuleCategory.MISC})
public class AntiFireball extends BreezeModule implements IBreezeInterface2 {
   private final GenericSetting<rip.breeze.RangeValue> cPSSetting;
   private final GenericSetting<Boolean> legitWalkSetting;
   private float fieldFloat_p;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);

   public AntiFireball() {
      long var1 = 10775051210062L;
      super();
      short var10002 = 10291;
      long var10003 = 2133032033786184966L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "CPS");
      var10002 = 21796;
      var10003 = 1987405559436654610L ^ var1;
      this.cPSSetting = var10001.getDataBuilder50_3("How many times per second to hit the fireball.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(12.0, 16.0))
         .clamp(rip.breeze.RangeValue.getPredicate_2(1.0, 20.0))
         .getDataBuilder54();
      var10002 = 32009;
      var10003 = 6798149958916247613L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "LegitWalk");
      var10002 = 9201;
      var10003 = 4276229771218636486L ^ var1;
      this.legitWalkSetting = var10001.getDataBuilder50_3(
            "Spoofs your movement to match your serverside rotation, making this module bypass almost any anti-cheat."
         )
         .getDataBuilder50_4(true)
         .getDataBuilder54();
   }

   public void getDistance() {
      BreezeClient.getModuleRegistry().applyRotation(this);
   }

   public void getDistance_1() {
      BreezeClient.getModuleRegistry().initialize(this);
   }

   public void sendPacket(ModuleRegistry var1) {
      long var2 = 117735033473270L;
      int[] var10000 = AimAssist.getStateArray();
      float var4 = 20.0F;
      int[] var5 = var10000;
      EntityFireball var6 = null;

      for (Entity var8 : BreezeClient.CONST_A.theWorld.loadedEntityList) {
         if ((var8 instanceof EntityFireball || var5 == null) && (!(var8.getDistanceToEntity(BreezeClient.CONST_A.thePlayer) > var4) || var5 == null)) {
            EntityFireball var9 = (EntityFireball)var8;
            Vec3 var10 = new Vec3(var9.motionX, var9.motionY, var9.motionZ).normalize();
            Vec3 var11 = BlockUtil7.getVec3_2(BreezeClient.CONST_A.thePlayer.getEntityBoundingBox());
            Vec3 var12 = var9.getPositionVector();
            Vec3 var13 = var11.subtract(var12);
            double var14 = var13.dotProduct(var10);
            if ((!(var14 < 0.0) || var5 == null) && (var9.ticksExisted >= 10 || var5 == null)) {
               var4 = var8.getDistanceToEntity(BreezeClient.CONST_A.thePlayer);
               var6 = var9;
               if (var5 == null) {
                  break;
               }
            }
         }
      }

      if (var6 != null) {
         Vec3 var16 = var6.getPositionVector().add(new Vec3(var6.motionX, var6.motionY, var6.motionZ));
         float[] var17 = RotationUtil7.calcDistance(var16, BreezeClient.CONST_A.thePlayer.getPositionVector(), true);
         BreezeClient.CONST_A.entityRenderer.getMouseOver(1.0F);
         Vec3 var18 = MinecraftAccessor.getVec3(BreezeClient.CONST_A.thePlayer, var1.getFloat(), var1.getFloat_g());
         float var19 = 6.0F;
         var1.isActive_2(this.legitWalkSetting.getObject_m());
         var1.isActive(false);
         var1.isValid(var17, 40.0F);
         this.fieldFloat_p = this.fieldFloat_p + (float)(this.cPSSetting.getObject_m().calculateDouble_2() / 20.0);
         if (!(this.fieldFloat_p < 1.0F)) {
            if (var6.getEntityBoundingBox()
                  .expand(1.0, 1.0, 1.0)
                  .calculateIntercept(
                     BreezeClient.CONST_A.thePlayer.getPositionEyes(1.0F).add(new Vec3(var18.xCoord * var19, var18.yCoord * var19, var18.zCoord * var19)),
                     BreezeClient.CONST_A.thePlayer.getPositionEyes(1.0F)
                  )
               != null) {
               this.fieldFloat_p--;
               if (this.fieldFloat_p > 1.0F) {
                  this.fieldFloat_p = 1.0F;
               }

               BreezeClient.getConfigManager().update_4(new C0APacketAnimation(), false);
               BreezeClient.getConfigManager().update_4(new C02PacketUseEntity(var6, Action.ATTACK), false);
            }
         }
      }
   }

   public int getValue() {
      return 35;
   }

   static {
      long var0 = 114344426384740L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "n©®oõ\u0095ñÞ?\u0000CÏãÍïÔ\u0005Ø`8x{\u0095pe\u008f®{\f\u0006kO\u0010\u008a~Ü\u0093} Ê\u007f\"\u0012\u008f©ÄeV{";
      int var7 = "n©®oõ\u0095ñÞ?\u0000CÏãÍïÔ\u0005Ø`8x{\u0095pe\u008f®{\f\u0006kO\u0010\u008a~Ü\u0093} Ê\u007f\"\u0012\u008f©ÄeV{".length();
      char var8 = ' ';
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
                     CONST_R = var4;
                     CONST_S = new String[4];
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

                  var6 = "yk ÜeW#\u001e\u0011ûZ¾\u0006!ZØ>h\u0095\u000f¤yn\u008f\u009f~Ë\u0083Púaep*¨8?\u007f-9\u0000¢âc\u0083\u007f\u0011éóÏè#¼Jo\u0000\"Áª8uº\u008dtý\u00867.\u0097Ëå»ÖÝ\u0092Õ\u008aé]2¨hß4ÚW×\u0091í.k-2\u001eØßü°{Ï^\u000fp¤$ªÙ\u007fX(Î^\u009c¿3\u001fÞ\\\u0010\u007f\u0004\u0097¡Ï\u0006G\u0087º\u0001\u001bü\u009aQEÆPvÉå+¥ß\u0091) ø)®\u0095¢\u0091û\u0083Û!ð\u0014\u000e\u001aÁh\u008e·\u0010#æ\u009e¤æwUn¯Bé§Ï¸«*\u0087ö£\u0086S¨F\"b&2Ú9}T\u0003lïJ¡ \u001f£ï\u007fÌÞÑ\u0011Jh\u001e\u0099 ¡+¦qÅa¦\rìO«L\u0000/\u001byAK?¢BÖIyâ¼\u000fý½ÝX)\u0002qC";
                  var7 = "yk ÜeW#\u001e\u0011ûZ¾\u0006!ZØ>h\u0095\u000f¤yn\u008f\u009f~Ë\u0083Púaep*¨8?\u007f-9\u0000¢âc\u0083\u007f\u0011éóÏè#¼Jo\u0000\"Áª8uº\u008dtý\u00867.\u0097Ëå»ÖÝ\u0092Õ\u008aé]2¨hß4ÚW×\u0091í.k-2\u001eØßü°{Ï^\u000fp¤$ªÙ\u007fX(Î^\u009c¿3\u001fÞ\\\u0010\u007f\u0004\u0097¡Ï\u0006G\u0087º\u0001\u001bü\u009aQEÆPvÉå+¥ß\u0091) ø)®\u0095¢\u0091û\u0083Û!ð\u0014\u000e\u001aÁh\u008e·\u0010#æ\u009e¤æwUn¯Bé§Ï¸«*\u0087ö£\u0086S¨F\"b&2Ú9}T\u0003lïJ¡ \u001f£ï\u007fÌÞÑ\u0011Jh\u001e\u0099 ¡+¦qÅa¦\rìO«L\u0000/\u001byAK?¢BÖIyâ¼\u000fý½ÝX)\u0002qC"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24698;
      if (CONST_S[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_T.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_T.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dg", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_R[var3].getBytes("ISO-8859-1");
         CONST_S[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_S[var3];
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
         throw new RuntimeException("rip/breeze/client/dg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
