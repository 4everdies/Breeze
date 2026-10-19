package rip.breeze;

import java.awt.Color;

public class ImageUtil3 extends UIPanel {
   private RenderUtil20_x enum5Val_h;
   private final int fieldInt_i;

   public ImageUtil3(RenderUtil20_x var1) {
      this(var1, 11);
   }

   public ImageUtil3(RenderUtil20_x var1, int var2) {
      this.enum5Val_h = var1;
      this.fieldInt_i = var2;
      this.d = var2 + 5;
   }

   public void setEnum5Val_h(RenderUtil20_x var1) {
      this.enum5Val_h = var1;
   }

   public RenderUtil20_x getEnum5Val_h() {
      return this.enum5Val_h;
   }

   @Override
   public float calculateFloat() {
      return BreezeContext.iRenderer_b.measureText(this.enum5Val_h.getString_b(), EnumType32.SOURCE_SANS, this.fieldInt_i) + 8.0F;
   }

   public void calculate(float var1, float var2, float var3) {
      Color var4 = this.enum5Val_h.getColor_c();
      Color var5 = new Color(var4.getRed(), var4.getGreen(), var4.getBlue(), 45);
      BreezeContext.iRenderer_b.fillRoundedRectFull(this.a, this.b, this.c, this.d, (this.d - 6.0F) / 2.0F, var5);
      BreezeContext.iRenderer_b
         .drawText(this.enum5Val_h.getString_b(), this.a + 5.0F, this.b + this.d / 2.0F - this.fieldInt_i / 2.0F, var4, EnumType32.SOURCE_SANS, this.fieldInt_i);
   }
}
