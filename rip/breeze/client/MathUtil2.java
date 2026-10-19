package rip.breeze.client;

public final class MathUtil2 {
   private final MathUtil10 dataBuilder46_a;
   private final float fieldFloat_b;

   private MathUtil2(MathUtil10 var1, float var2) {
      this.dataBuilder46_a = var1;
      this.fieldFloat_b = var2;
   }

   public float calculateFloat(String var1) {
      return this.dataBuilder46_a.clamp_8(var1) * this.fieldFloat_b;
   }

   public float calculateFloat_2() {
      return this.dataBuilder46_a.getValue() * this.fieldFloat_b;
   }

   public float calculateFloat_3() {
      return this.dataBuilder46_a.clamp_6() * this.fieldFloat_b;
   }

   public float calculateFloat_4() {
      return this.dataBuilder46_a.calculateFloat() * this.fieldFloat_b;
   }

   MathUtil2(MathUtil10 var1, float var2, Util52 var3) {
      this(var1, var2);
   }

   static MathUtil10 getDataBuilder46_a(MathUtil2 var0) {
      return var0.dataBuilder46_a;
   }

   static float getFloat_b(MathUtil2 var0) {
      return var0.fieldFloat_b;
   }
}
