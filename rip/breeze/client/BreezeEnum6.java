package rip.breeze.client;

enum BreezeEnum6 {
   ;
public double calculateDouble(double var1, long var3) {
      double var5 = Math.sin((20.0 * var1 - 11.125) * (Math.PI * 4.0 / 9.0));
      double var9;
      int var10000 = (var9 = var1 - 0.0) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
      if (var3 >= 0L) {
         if (var10000 == 0) {
            return 0.0;
         }

         double var10;
         var10000 = (var10 = var1 - 1.0) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
      }

      if (var3 > 0L) {
         if (var10000 == 0) {
            return 1.0;
         }

         if (var3 < 0L) {
            return var1 + 0.5;
         }

         double var11;
         var10000 = (var11 = var1 - 0.5) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
      }

      return var10000 < 0 ? -(Math.pow(2.0, 20.0 * var1 - 10.0) * var5) / 2.0 : Math.pow(2.0, -20.0 * var1 + 10.0) * var5 / 2.0 + 1.0;
   }
}
