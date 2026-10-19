package rip.breeze;

import java.awt.Color;

// $VF: synthetic class
final class ai$$Lambda_Inner219 implements Runnable {
   private final NanoVGRenderer arg_Inner1;
   private final float arg_Inner2;
   private final float arg_Inner3;
   private final float arg_Inner4;
   private final Color arg_Inner5;

   private ai$$Lambda_Inner219(NanoVGRenderer var1, float var2, float var3, float var4, Color var5) {
      this.arg_Inner1 = var1;
      this.arg_Inner2 = var2;
      this.arg_Inner3 = var3;
      this.arg_Inner4 = var4;
      this.arg_Inner5 = var5;
   }

   private static Runnable get$Lambda(NanoVGRenderer var0, float var1, float var2, float var3, Color var4) {
      return new ai$$Lambda_Inner219(var0, var1, var2, var3, var4);
   }

   @Override
   public void run() {
      this.arg_Inner1.lambda$checkIconAnimation_Inner3(this.arg_Inner2, this.arg_Inner3, this.arg_Inner4, this.arg_Inner5);
   }
}
