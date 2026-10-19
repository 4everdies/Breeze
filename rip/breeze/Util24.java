package rip.breeze;

// $VF: synthetic class
class Util24 {
   static final int[] CONST_A;
   static final int[] CONST_B = new int[AimYawMode2.values().length];

   static {
      try {
         CONST_B[AimYawMode2.TOP.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         CONST_B[AimYawMode2.BOTTOM.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         CONST_B[AimYawMode2.CENTER.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      CONST_A = new int[AimYawMode.values().length];

      try {
         CONST_A[AimYawMode.LEFT.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         CONST_A[AimYawMode.RIGHT.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         CONST_A[AimYawMode.CENTER.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
