package rip.breeze.client;

// $VF: synthetic class
class Util49 {
   static final int[] CONST_A = new int[AimPitchMode.values().length];

   static {
      try {
         CONST_A[AimPitchMode.CHEST.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         CONST_A[AimPitchMode.NECK.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         CONST_A[AimPitchMode.HEAD.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }

      try {
         CONST_A[AimPitchMode.MULTI_POINT.ordinal()] = 4;
      } catch (NoSuchFieldError var2) {
      }

      try {
         CONST_A[AimPitchMode._OFF.ordinal()] = 5;
      } catch (NoSuchFieldError var1) {
      }
   }
}
