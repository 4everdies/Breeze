package rip.breeze;

import java.awt.Color;
import java.lang.invoke.MethodHandles;

final class ImageUtil5 {
   private final GenericSetting<BreezeColor> dataBuilder54_a;
   private float fieldFloat_b;
   private float fieldFloat_c;
   private float fieldFloat_d;
   private int fieldInt_e;
   private boolean fieldBool_f;
   private int fieldInt_g;
   private boolean fieldBool_h;

   ImageUtil5(GenericSetting<BreezeColor> var1) {
      this.dataBuilder54_a = var1;
      this.toggle((BreezeColor)var1.getObject_m());
   }

   void update() {
      long var1 = 114857804259584L;
      BreezeColor var3 = this.dataBuilder54_a.getObject_m();
      if (var3.getValue() != this.fieldInt_g || var3.isBool_d() != this.fieldBool_h) {
         this.toggle(var3);
      }
   }

   private void toggle(BreezeColor var1) {
      long var2 = 87259912069358L;
      float[] var4 = Color.RGBtoHSB(var1.getValue_2(), var1.getValue_3(), var1.getValue_4(), null);
      if (var4[1] > 0.0F) {
         this.fieldFloat_b = var4[0];
      }

      if (var4[2] > 0.0F) {
         this.fieldFloat_c = var4[1];
      }

      this.fieldFloat_d = var4[2];
      this.fieldInt_e = var1.getValue_5();
      this.fieldBool_f = var1.isBool_d();
      this.fieldInt_g = var1.getValue();
      this.fieldBool_h = this.fieldBool_f;
   }

   float getFloat() {
      long var1 = 619732047349L;
      return this.fieldBool_f ? BreezeColor.calculateFloat() : this.fieldFloat_b;
   }

   float getFloat_c() {
      return this.fieldFloat_c;
   }

   float getFloat_d() {
      return this.fieldFloat_d;
   }

   int getInt_e() {
      return this.fieldInt_e;
   }

   boolean isBool_f() {
      return this.fieldBool_f;
   }

   Color getColor() {
      return Color.getHSBColor(this.getFloat(), this.fieldFloat_c, this.fieldFloat_d);
   }

   void initialize(float var1) {
      this.fieldFloat_b = getFloat_2(var1);
      this.update_2();
   }

   void update_1(float var1, float var2) {
      this.fieldFloat_c = getFloat_2(var1);
      this.fieldFloat_d = getFloat_2(var2);
      this.update_2();
   }

   void calculate(float var1) {
      this.fieldInt_e = (int)(getFloat_2(var1) * 255.0F);
      this.update_2();
   }

   void toggle_2(boolean var1) {
      this.fieldBool_f = var1;
      this.update_2();
   }

   private void update_2() {
      Color var1 = Color.getHSBColor(this.fieldFloat_b, this.fieldFloat_c, this.fieldFloat_d);
      BreezeColor var2 = new BreezeColor(var1.getRed(), var1.getGreen(), var1.getBlue(), this.fieldInt_e, this.fieldBool_f);
      this.fieldInt_g = var2.getValue();
      this.fieldBool_h = this.fieldBool_f;
      this.dataBuilder54_a.processAll(var2);
   }

   private static float getFloat_2(float var0) {
      long var1 = 12424781037851L;
      return var0 < 0.0F ? 0.0F : (var0 > 1.0F ? 1.0F : var0);
   }
}
