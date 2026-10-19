package rip.breeze.client;

// $VF: synthetic class
class Util47 {
   static final int[] CONST_A = new int[SpeedMode.values().length];

   static {
      try {
         CONST_A[SpeedMode.S_TAP.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         CONST_A[SpeedMode.W_TAP.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         CONST_A[SpeedMode.SNEAK.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
