package rip.breeze;

// $VF: synthetic class
class Util1 {
   static final int[] CONST_A = new int[EnumType15.values().length];

   static {
      try {
         CONST_A[EnumType15.DEV.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         CONST_A[EnumType15.BETA.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         CONST_A[EnumType15.STABLE.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
