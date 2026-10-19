package rip.breeze;

import java.lang.invoke.MethodHandles;

public class MathUtil1 {
   private static int[] arr_b;

   public static float clamp(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public static int clamp_2(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public static double clamp_3(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static float calculateFloat(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   public static double calculateDouble(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static float getFloat(float var0) {
      long var1 = 36516326839478L;
      return var0 < 0.0F ? 0.0F : (var0 > 1.0F ? 1.0F : var0);
   }

   public static float calcDistance(float var0, float var1, float var2, float var3) {
      float var4 = var2 - var0;
      float var5 = var3 - var1;
      return (float)Math.sqrt(var4 * var4 + var5 * var5);
   }

   public static double calculateDouble_2(double var0, double var2, double var4, double var6) {
      return var2 + (var0 - var2) * Math.exp(-var4 * var6);
   }

   public static void initialize(int[] var0) {
      arr_b = var0;
   }

   public static int[] values() {
      return arr_b;
   }

   static {
      if (values() == null) {
         initialize(new int[5]);
      }
   }
}
