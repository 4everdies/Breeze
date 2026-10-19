package rip.breeze.client;

enum BreezeEnum3 {
   ;
public double calculateDouble(double var1, long var3) {
      double var7;
      int var10000 = (var7 = var1 - 0.0) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
      if (var3 > 0L) {
         if (var10000 == 0) {
            return 0.0;
         }

         double var8;
         var10000 = (var8 = var1 - 1.0) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
      }

      if (var3 >= 0L) {
         if (var10000 == 0) {
            return 1.0;
         }

         if (var3 < 0L) {
            return var1 / 0.5;
         }

         double var9;
         var10000 = (var9 = var1 - 0.5) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
      }

      return var10000 < 0 ? Math.pow(2.0, 20.0 * var1 - 10.0) / 2.0 : (2.0 - Math.pow(2.0, -20.0 * var1 + 10.0)) / 2.0;
   }
}
