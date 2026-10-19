package rip.breeze.client;

import rip.breeze.ColorMode2;

// $VF: synthetic class
class Util122 {
   static final int[] CONST_A;
   static final int[] CONST_B = new int[rip.breeze.EnumType21.values().length];

   static {
      try {
         CONST_B[rip.breeze.EnumType21.PRODUCT.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         CONST_B[rip.breeze.EnumType21.PRODUCT_THIN.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         CONST_B[rip.breeze.EnumType21.INGAME.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      CONST_A = new int[ColorMode2.values().length];

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
