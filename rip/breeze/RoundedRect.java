package rip.breeze;

import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(name = "RoundedRect", description = "A rounded rectangle used for HUD backgrounds.", group = "breeze/util")
public class RoundedRect extends Util132<Util8> {
   public RoundedRect(Util8 var1) {
      super(var1);
   }

   @JSConstructor
   public RoundedRect(double var1, double var3, double var5, double var7, double var9) {
      this(new Util8((float)var1, (float)var3, (float)var5, (float)var7, (float)var9));
   }

   @JSConstructor
   public RoundedRect(double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15) {
      this(new Util8((float)var1, (float)var3, (float)var5, (float)var7, (float)var9, (float)var11, (float)var13, (float)var15));
   }

   @JSFunction("getX")
   public double getDouble() {
      return ((Util8)this.i).fieldFloat_a;
   }

   @JSFunction("getY")
   public double getDouble_2() {
      return ((Util8)this.i).fieldFloat_b;
   }

   @JSFunction("getW")
   public double getDouble_3() {
      return ((Util8)this.i).fieldFloat_c;
   }

   @JSFunction("getH")
   public double getDouble_4() {
      return ((Util8)this.i).fieldFloat_d;
   }

   @JSFunction("getRTL")
   public double getDouble_5() {
      return ((Util8)this.i).fieldFloat_e;
   }

   @JSFunction("getRTR")
   public double getDouble_6() {
      return ((Util8)this.i).fieldFloat_f;
   }

   @JSFunction("getRBR")
   public double getDouble_7() {
      return ((Util8)this.i).fieldFloat_g;
   }

   @JSFunction("getRBL")
   public double getDouble_8() {
      return ((Util8)this.i).fieldFloat_h;
   }
}
