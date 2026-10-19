package rip.breeze.client;

final class RenderUtil23 {
   float fieldFloat_a;
   float fieldFloat_b;
   float fieldFloat_c = 1.0F;
   float fieldFloat_d = 0.0F;
   float fieldFloat_e = 1.0F;
   final float fieldFloat_f;
   final float fieldFloat_g;

   RenderUtil23(float var1, float var2) {
      this.fieldFloat_f = var1;
      this.fieldFloat_g = var2;
   }

   void update(float var1) {
      this.fieldFloat_a = var1;
      this.fieldFloat_b = 0.0F;
      this.fieldFloat_c = 1.0F;
      this.fieldFloat_d = 0.0F;
      this.fieldFloat_e = 1.0F;
   }

   void calculate(float var1, float var2) {
      float var3 = this.fieldFloat_a + this.fieldFloat_b * var2;
      float var4 = this.fieldFloat_f * var2 * var2 * var2 * var2 / 4.0F;
      float var5 = this.fieldFloat_f * var2 * var2 * var2 / 2.0F;
      float var6 = this.fieldFloat_f * var2 * var2;
      float var7 = this.fieldFloat_c + 2.0F * var2 * this.fieldFloat_d + var2 * var2 * this.fieldFloat_e + var4;
      float var8 = this.fieldFloat_d + var2 * this.fieldFloat_e + var5;
      float var9 = this.fieldFloat_e + var6;
      float var10 = var7 + this.fieldFloat_g;
      float var11 = var7 / var10;
      float var12 = var8 / var10;
      float var13 = var1 - var3;
      this.fieldFloat_a = var3 + var11 * var13;
      this.fieldFloat_b += var12 * var13;
      this.fieldFloat_c = (1.0F - var11) * var7;
      this.fieldFloat_d = (1.0F - var11) * var8;
      this.fieldFloat_e = var9 - var12 * var8;
   }

   float calculateFloat(float var1) {
      return this.fieldFloat_a + this.fieldFloat_b * var1;
   }
}
