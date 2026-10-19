package rip.breeze.client;

enum BreezeEnum37 {
   ;
public double calcDistance(double var1, long var3) {
      double var10000 = var1;
      double var10001 = 0.5;
      if (var3 >= 0L) {
         if (var1 < 0.5) {
            return (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var1, 2.0))) / 2.0;
         }

         var10000 = Math.sqrt(1.0 - Math.pow(-2.0 * var1 + 2.0, 2.0)) + 1.0;
         var10001 = 2.0;
      }

      return var10000 / var10001;
   }
}
