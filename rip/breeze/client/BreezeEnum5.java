package rip.breeze.client;

enum BreezeEnum5 {
   ;
public double calculateDouble(double var1, long var3) {
      double var7;
      int var10000 = (var7 = var1 - 0.0) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
      if (var3 > 0L) {
         if (!var10000) {
            return 0.0;
         }

         if (var3 <= 0L) {
            return var1 + 1.0;
         }

         double var8;
         var10000 = (var8 = var1 - 1.0) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
      }

      return !var10000 ? 1.0 : Math.pow(2.0, -10.0 * var1) * Math.sin((var1 * 10.0 - 0.75) * (Math.PI * 2.0 / 3.0)) + 1.0;
   }
}
