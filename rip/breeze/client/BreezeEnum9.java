package rip.breeze.client;

enum BreezeEnum9 {
   ;
public double calculateDouble(double var1, long var3) {
      double var10000 = var1;
      double var10001 = 0.5;
      if (var3 > 0L) {
         if (var1 < 0.5) {
            return Math.pow(2.0 * var1, 2.0) * (7.189819 * var1 - 2.5949095) / 2.0;
         }

         var10000 = Math.pow(2.0 * var1 - 2.0, 2.0) * (3.5949095 * (var1 * 2.0 - 2.0) + 2.5949095) + 2.0;
         var10001 = 2.0;
      }

      return var10000 / var10001;
   }
}
