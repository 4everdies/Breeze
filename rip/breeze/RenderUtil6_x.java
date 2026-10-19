package rip.breeze;

import java.lang.invoke.MethodHandles;
import rip.breeze.client.EnumType3;

public class RenderUtil6_x extends Util28 {
   private final ImageUtil15 dataBuilder17_j;
   private final MathUtil13 dataBuilder70_k;
   private RenderUtil32 dataBuilder45_l;
   private rip.breeze.client.AnimationTimer dataBuilder15_m = new rip.breeze.client.AnimationTimer(500.0F, false, EnumType3.CUBIC_IN_OUT);
   private boolean fieldBool_n = false;

   public RenderUtil6_x(ImageUtil15 var1) {
      this.dataBuilder17_j = var1;
      this.dataBuilder45_l = new RenderUtil32(new LicenseState(), var1.dataBuilder51_k.list_a, var1.dataBuilder51_k.list_b);
      this.dataBuilder70_k = new MathUtil13(this, var1);
      this.a(new UIPanel[]{this.dataBuilder45_l, this.dataBuilder70_k});
   }

   public void update(boolean var1, boolean var2) {
      long var3 = 111750559258826L;
      long var5 = var3 ^ 116533167231485L;
      this.fieldBool_n = var1;
      if (var2) {
         this.dataBuilder15_m = new rip.breeze.client.AnimationTimer(500.0F, var1, EnumType3.CUBIC_IN_OUT);
      }

      this.dataBuilder15_m.toggle(var5, var1);
   }

   public boolean isBool_n() {
      return this.fieldBool_n;
   }

   public void update_1() {
      long var1 = 109733154511194L;
      if (this.fieldBool_n) {
         this.dataBuilder70_k.calculate_3();
      }

      this.dataBuilder45_l.processNullable(this.dataBuilder17_j.dataBuilder51_k.list_a, this.dataBuilder17_j.dataBuilder51_k.list_b);
   }

   public void processAll(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 46241641281725L;
      this.f = true;
      this.dataBuilder45_l.f = !this.fieldBool_n && this.dataBuilder15_m.getDouble(var6) == 0.0;
      this.dataBuilder70_k.f = this.fieldBool_n && this.dataBuilder15_m.getDouble(var6) == 1.0;
      BreezeContext.iRenderer_b.renderWithBounds(this, this::lambda$draw_Inner1);
   }

   public void update_1() {
      super.processNullable_4();
      this.dataBuilder45_l.a(this.a, this.b, this.c, this.d);
      this.dataBuilder70_k.a(this.a, this.b, this.c, this.d);
   }

   private void lambda$draw_Inner1(float var1, float var2, float var3) {
      long var4 = 51520553172435L;
      long var6 = var4 ^ 30809960282156L;
      float var8 = Math.max(0.0F, Math.min(1.0F, (float)this.dataBuilder15_m.getDouble(var6)));
      float var9 = this.d * (1.0F - var8);
      if (var8 <= 0.0F) {
         this.dataBuilder45_l.absValue(var1, var2, var3);
      } else if (var8 >= 1.0F) {
         this.dataBuilder70_k.calculate(var1, var2, var3, var9);
      } else {
         if (var9 > 0.0F) {
            BreezeContext.iRenderer_b.renderInRect(this.a, this.b + this.d * var8, this.c, var9, this::lambda$null_Inner0);
         }

         this.dataBuilder70_k.calculate(var1, var2, var3, var9);
      }
   }

   private void lambda$null_Inner0(float var1, float var2, float var3) {
      this.dataBuilder45_l.absValue(var1, var2, var3);
   }
}
