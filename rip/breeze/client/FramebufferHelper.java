package rip.breeze.client;

public class FramebufferHelper {
   private final int fieldInt_a;
   private final float[] arr_b;

   public FramebufferHelper(int var1) {
      this.fieldInt_a = var1;
      this.arr_b = new float[var1];
   }

   public void absValue() {
      float var1 = this.fieldInt_a / 2.0F;
      float var2 = 0.0F;

      for (int var3 = 0; var3 < this.fieldInt_a; var3++) {
         float var4 = var3 / var1;
         this.arr_b[var3] = 1.0F / (Math.abs(var1) * 2.5066283F) * (float)Math.exp(-0.5 * var4 * var4);
         var2 += var3 > 0 ? this.arr_b[var3] * 2.0F : this.arr_b[0];
      }

      for (int var5 = 0; var5 < this.fieldInt_a; var5++) {
         this.arr_b[var5] = this.arr_b[var5] / var2;
      }
   }

   public int getInt_a() {
      return this.fieldInt_a;
   }

   public float[] getArr_b() {
      return this.arr_b;
   }
}
