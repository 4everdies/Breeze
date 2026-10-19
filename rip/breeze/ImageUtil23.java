package rip.breeze;

import java.awt.Color;
import java.lang.invoke.MethodHandles;

public final class ImageUtil23 extends UIPanel {
   private static final Color CONST_H = new Color(0, 0, 0, 110);
   private final ImageUtil5 dataBuilder109_i;
   boolean fieldBool_j = false;

   public ImageUtil23(ImageUtil5 var1) {
      this.dataBuilder109_i = var1;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      super.toggle(var1, var2, var3);
      if (this.fieldBool_j && !this.dataBuilder109_i.isBool_f()) {
         this.dataBuilder109_i.initialize((var2 - this.b) / this.d);
      }

      float var6 = this.c / 2.0F;
      float var7 = this.dataBuilder109_i.getFloat();
      BreezeContext.iRenderer_b.clipRect(this, var6);
      if (this.dataBuilder109_i.isBool_f()) {
         BreezeContext.iRenderer_b.strokeRoundedRect(this, var6, CONST_H);
      }

      RenderUtil30.clamp(this.a, this.b, this.c, this.d, var6, RenderUtil30.CONST_T);
      ImageUtil1.calculate(this.c(), this.b + var7 * this.d, 9.0F, Color.getHSBColor(var7, 1.0F, 1.0F));
   }

   public boolean isActive(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.a(var1, var2) && var3 == 0 && !this.dataBuilder109_i.isBool_f()) {
         this.fieldBool_j = true;
         return true;
      } else {
         return false;
      }
   }

   public void toggle(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      if (var3 == 0) {
         this.fieldBool_j = false;
      }
   }

   @Override
   public void toggle_2() {
      super.toggle_2();
      this.fieldBool_j = false;
   }
}
