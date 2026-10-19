package rip.breeze.client;

import rip.breeze.Util133;

public class Util120 {
   public String string_a;
   public String string_b;
   public final Object object_c;
   int fieldInt_d;
   float fieldFloat_e;
   boolean fieldBool_f;
   public final Util133 dataBuilder112_g = new Util133().getDataBuilder112();
   public final AnimationTimer dataBuilder15_h = new AnimationTimer(300.0F, true, EnumType3.BACK_OUT);
   public AnimationTimer dataBuilder15_i = new AnimationTimer(200.0F, false, EnumType3.QUAD_IN_OUT);
   boolean fieldBool_j;

   public Util120(String var1, String var2, Object var3) {
      this.string_b = var1;
      this.string_a = var2;
      this.object_c = var3;
   }

   public Util120(String var1, String var2) {
      this(var1, var2, null);
   }
}
