package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Vec3;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

public class RotationUtil7 {
   private static int[] arr_b;

   public static float[] getAnglesTo(Vec3 var0, EntityPlayer var1) {
      Vec3 var2 = var1.getPositionEyes(1.0F);
      return calcDistance(var0, var2, true);
   }

   public static float[] getAnglesWithMode(Vec3 var0, EntityPlayer var1, RangeValue var2) {
      Vec3 var3 = new Vec3(var2.calculateDouble(), var2.getDouble() + BreezeClient.CONST_A.thePlayer.getEyeHeight(), var2.calculateDouble_2());
      Vec3 var4 = var1.getPositionEyes(1.0F);
      return new float[]{calcDistance(var0, var3, true)[0], calcDistance(var0, var4, true)[1]};
   }

   public static float[] getAnglesTo(Vec3 var0, EntityPlayer var1, boolean var2) {
      Vec3 var3 = var1.getPositionEyes(MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks);
      return calcDistance(var0, var3, var2);
   }

   public static float[] calcDistance(Vec3 var0, Vec3 var1, boolean var2) {
      long var3 = 29722453532002L;
      boolean var10000 = BlockUtil7.isValid();
      double var5 = var0.xCoord - var1.xCoord;
      double var7 = var0.yCoord - var1.yCoord;
      double var9 = var0.zCoord - var1.zCoord;
      double var11 = Math.sqrt(var5 * var5 + var9 * var9);
      boolean var13 = var10000;
      float var14 = (float)Math.toDegrees(Math.atan2(var9, var5)) - 90.0F;
      float var15 = (float)(-Math.toDegrees(Math.atan2(var7, var11)));
      float[] var16 = var2
         ? new float[]{BreezeClient.getModuleRegistry().getFloat_g(), BreezeClient.getModuleRegistry().getFloat()}
         : new float[]{BreezeClient.CONST_A.thePlayer.rotationYaw, BreezeClient.CONST_A.thePlayer.rotationPitch};
      float[] var17 = new float[]{var16[0] + calculateFloat(var14 - var16[0]), var16[1] + calculateFloat(var15 - var16[1])};
      if (LicenseState.checkCondition()) {
         BlockUtil7.toggle(!var13);
      }

      return var17;
   }

   public static float calcAngle(Vec3 var0, Vec3 var1) {
      double var2 = var0.xCoord - var1.xCoord;
      double var4 = var0.zCoord - var1.zCoord;
      return (float)Math.toDegrees(Math.atan2(var4, var2)) - 90.0F;
   }

   public static float absValue(float var0, float var1) {
      long var2 = 47268861490979L;
      var0 = calculateFloat(var0);
      boolean var10000 = BlockUtil7.isValid();
      var1 = calculateFloat(var1);
      float var4 = var0 - var1;
      boolean var5 = var10000;

      while (var4 < -180.0F) {
         var4 += 360.0F;
         if (!var5) {
            break;
         }
      }

      while (var4 > 180.0F) {
         var4 -= 360.0F;
         if (!var5) {
            break;
         }
      }

      return Math.abs(var4);
   }

   public static double calculateDouble(double var0) {
      long var2 = 116036697489439L;
      var0 %= 360.0;
      if (var0 >= 180.0) {
         var0 -= 360.0;
      }

      if (var0 < -180.0) {
         var0 += 360.0;
      }

      return var0;
   }

   public static float calculateFloat(float var0) {
      long var1 = 41203036704729L;
      var0 %= 360.0F;
      if (var0 >= 180.0F) {
         var0 -= 360.0F;
      }

      if (var0 < -180.0F) {
         var0 += 360.0F;
      }

      return var0;
   }

   public static void initialize(int[] var0) {
      arr_b = var0;
   }

   public static int[] values() {
      return arr_b;
   }

   static {
      if (values() == null) {
         initialize(new int[3]);
      }
   }
}
