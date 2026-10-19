package rip.breeze;

import java.lang.invoke.MethodHandles;

public class LicenseState {
   public float fieldFloat_a;
   public float fieldFloat_b;
   public float fieldFloat_c;
   public float fieldFloat_d;
   private static boolean fieldBool_e;

   public LicenseState(float var1, float var2, float var3, float var4) {
      this.fieldFloat_a = var1;
      this.fieldFloat_b = var2;
      this.fieldFloat_c = var3;
      this.fieldFloat_d = var4;
   }

   public LicenseState() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public LicenseState(LicenseState var1) {
      this(var1.fieldFloat_a, var1.fieldFloat_b, var1.fieldFloat_c, var1.fieldFloat_d);
   }

   public boolean isValid(float var1, float var2) {
      long var3 = 107214831082458L;
      return var1 >= this.fieldFloat_a && var1 <= this.fieldFloat_a + this.fieldFloat_c && var2 >= this.fieldFloat_b && var2 <= this.fieldFloat_b + this.fieldFloat_d;
   }

   public float calculateFloat() {
      return this.fieldFloat_a + this.fieldFloat_c;
   }

   public float calculateFloat_2() {
      return this.fieldFloat_b + this.fieldFloat_d;
   }

   public float calculateFloat_3() {
      return this.fieldFloat_a + this.fieldFloat_c / 2.0F;
   }

   public float calculateFloat_4() {
      return this.fieldFloat_b + this.fieldFloat_d / 2.0F;
   }

   public static void toggle(boolean var0) {
      fieldBool_e = var0;
   }

   public static boolean isValid_2() {
      return fieldBool_e;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid_2();
      return !var0;
   }

   static {
      if (checkCondition()) {
         toggle(true);
      }
   }
}
