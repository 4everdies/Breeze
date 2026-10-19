package rip.breeze;

import java.lang.invoke.MethodHandles;

public final class RenderUtil5_x extends UIPanel {
   private final ImageUtil5 dataBuilder109_h;
   boolean fieldBool_i = false;

   public RenderUtil5_x(ImageUtil5 var1) {
      this.dataBuilder109_h = var1;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      super.toggle(var1, var2, var3);
      if (this.fieldBool_i) {
         this.dataBuilder109_h.update_1((var1 - this.a) / this.c, 1.0F - (var2 - this.b) / this.d);
      }

      BreezeContext.iRenderer_b.drawLine(this.a, this.b, this.c, this.d, 10.0F, this.dataBuilder109_h.getFloat());
      RenderUtil30.clamp(this.a, this.b, this.c, this.d, 10.0F, RenderUtil30.CONST_T);
      float var6 = this.a + this.dataBuilder109_h.getFloat_c() * this.c;
      float var7 = this.b + (1.0F - this.dataBuilder109_h.getFloat_d()) * this.d;
      ImageUtil1.calculate(var6, var7, 7.0F, this.dataBuilder109_h.getColor());
   }

   public boolean isActive(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.a(var1, var2) && var3 == 0) {
         this.fieldBool_i = true;
         return true;
      } else {
         return false;
      }
   }

   public void toggle(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      if (var3 == 0) {
         this.fieldBool_i = false;
      }
   }

   @Override
   public void toggle_2() {
      super.toggle_2();
      this.fieldBool_i = false;
   }
}
