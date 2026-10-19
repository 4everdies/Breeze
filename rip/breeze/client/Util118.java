package rip.breeze.client;

abstract class Util118 {
   final AnimationTimer dataBuilder15_a;
   String string_b;
   int fieldInt_c;
   boolean fieldBool_d;
   boolean fieldBool_e;
   final ModuleList moduleList_f;

   private Util118(ModuleList var1) {
      this.moduleList_f = var1;
      this.dataBuilder15_a = new AnimationTimer(220.0F, false, EnumType3.CUBIC_IN_OUT);
      this.string_b = "";
      this.fieldInt_c = 0;
      this.fieldBool_d = true;
      this.fieldBool_e = true;
   }

   abstract boolean isReady();

   Util118(ModuleList var1, Lambda10 var2) {
      this(var1);
   }
}
