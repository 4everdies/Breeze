package rip.breeze.client;

import rip.breeze.LicenseState;

enum BreezeEnum8 {
   ;
public double calculateDouble(double var1, long var3) {
      double var5 = 1.70158;
      String[] var10000 = AnimationTimer.getTimerIds();
      double var7 = var5 + 1.0;
      String[] var9 = var10000;
      double var10 = 1.0 + var7 * Math.pow(var1 - 1.0, 3.0) + var5 * Math.pow(var1 - 1.0, 2.0);
      if (var9 != null) {
         boolean var10001 = LicenseState.checkCondition();
         if (var3 >= 0L) {
            ;
         }

         LicenseState.toggle(var10001);
      }

      return var10;
   }
}
