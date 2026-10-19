package rip.breeze.client;

import rip.breeze.ColorMode2;

// $VF: synthetic class
class Util126 {
   static final int[] CONST_A = new int[ColorMode2.values().length];

   static {
      try {
         CONST_A[ColorMode2.RAINBOW.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         CONST_A[ColorMode2.GRADIENT.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         CONST_A[ColorMode2.PULSE.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
