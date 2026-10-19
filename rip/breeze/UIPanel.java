package rip.breeze;

import java.lang.invoke.MethodHandles;

public abstract class UIPanel extends LicenseState {
   public boolean fieldBool_f = true;
   private static String string_g;

   public UIPanel(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public UIPanel(LicenseState var1) {
      this(var1.fieldFloat_a, var1.fieldFloat_b, var1.fieldFloat_c, var1.fieldFloat_d);
   }

   public UIPanel() {
      this(new LicenseState());
   }

   public void toggle(float var1, float var2, float var3) {
      this.fieldBool_f = true;
   }

   protected boolean isValid(float var1, float var2, int var3) {
      return false;
   }

   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      return var4 ? true : this.isValid(var1, var2, var3);
   }

   public void noOp(float var1, float var2, int var3) {
   }

   public boolean isValid_2(int var1) {
      return false;
   }

   public boolean isValid_3(char var1) {
      return false;
   }

   public boolean isValid_4(int var1) {
      return false;
   }

   public boolean isValid_5(float var1, float var2, float var3) {
      return false;
   }

   public void noOp_2() {
   }

   public void toggle_2() {
      this.fieldBool_f = false;
   }

   public void update(LicenseState var1) {
      long var2 = 20429965317535L;
      this.a = var1.fieldFloat_a;
      getString();
      this.b = var1.fieldFloat_b;
      this.c = var1.fieldFloat_c;
      this.d = var1.fieldFloat_d;
      this.noOp_2();
      if (LicenseState.checkCondition()) {
         initialize("OmQbWc");
      }
   }

   public void drawColoredQuad(float var1, float var2, float var3, float var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.noOp_2();
   }

   public static void initialize(String var0) {
      string_g = var0;
   }

   public static String getString() {
      return string_g;
   }

   static {
      if (getString() != null) {
         initialize("eo1Quc");
      }
   }
}
