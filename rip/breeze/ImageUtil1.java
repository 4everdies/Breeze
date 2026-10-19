package rip.breeze;

import java.awt.Color;

final class ImageUtil1 {
   private static final Color CONST_A = new Color(0, 0, 0, 80);

   private ImageUtil1() {
   }

   static void calculate(float var0, float var1, float var2, Color var3) {
      BreezeContext.iRenderer_b.fillCircle(var0, var1, var2 + 1.0F, CONST_A);
      BreezeContext.iRenderer_b.fillCircle(var0, var1, var2, Color.WHITE);
      BreezeContext.iRenderer_b.fillCircle(var0, var1, var2 - 2.5F, var3);
   }
}
