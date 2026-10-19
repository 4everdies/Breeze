package rip.breeze;

import java.lang.invoke.MethodHandles;

public final class ImageUtil22 extends UIPanel {
   private final GenericSetting<BreezeColor> dataBuilder54_h;
   private final ImageUtil5 dataBuilder109_i;
   boolean fieldBool_j = false;

   public ImageUtil22(GenericSetting<BreezeColor> var1, ImageUtil5 var2) {
      this.dataBuilder54_h = var1;
      this.dataBuilder109_i = var2;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      super.toggle(var1, var2, var3);
      if (this.fieldBool_j) {
         this.dataBuilder109_i.calculate((var1 - this.a) / this.c);
      }

      float var6 = this.d / 2.0F;
      BreezeContext.iRenderer_b.fillClipRect(this, var6, this.dataBuilder54_h.getObject_m());
      RenderUtil30.clamp(this.a, this.b, this.c, this.d, var6, RenderUtil30.CONST_T);
      float var7 = this.a + this.dataBuilder109_i.getInt_e() / 255.0F * this.c;
      ImageUtil1.calculate(var7, this.d(), 9.0F, this.dataBuilder109_i.getColor());
   }

   protected boolean isActive(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.a(var1, var2) && var3 == 0) {
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
