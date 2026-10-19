package rip.breeze.client;

import rip.breeze.WorldUtil6;

// $VF: synthetic class
class WorldUtil3 {
   static final int[] CONST_A;
   static final int[] CONST_B;
   static final int[] CONST_C = new int[EnumType5.values().length];

   static {
      try {
         CONST_C[EnumType5.Helmet.ordinal()] = 1;
      } catch (NoSuchFieldError var23) {
      }

      try {
         CONST_C[EnumType5.Chestplate.ordinal()] = 2;
      } catch (NoSuchFieldError var22) {
      }

      try {
         CONST_C[EnumType5.Leggings.ordinal()] = 3;
      } catch (NoSuchFieldError var21) {
      }

      try {
         CONST_C[EnumType5.Boots.ordinal()] = 4;
      } catch (NoSuchFieldError var20) {
      }

      CONST_B = new int[WorldUtil6.values().length];

      try {
         CONST_B[WorldUtil6.SWORD.ordinal()] = 1;
      } catch (NoSuchFieldError var19) {
      }

      try {
         CONST_B[WorldUtil6.PICKAXE.ordinal()] = 2;
      } catch (NoSuchFieldError var18) {
      }

      try {
         CONST_B[WorldUtil6.AXE.ordinal()] = 3;
      } catch (NoSuchFieldError var17) {
      }

      try {
         CONST_B[WorldUtil6.ROD.ordinal()] = 4;
      } catch (NoSuchFieldError var16) {
      }

      try {
         CONST_B[WorldUtil6.BOW.ordinal()] = 5;
      } catch (NoSuchFieldError var15) {
      }

      try {
         CONST_B[WorldUtil6.SHEARS.ordinal()] = 6;
      } catch (NoSuchFieldError var14) {
      }

      try {
         CONST_B[WorldUtil6.BLOCKS.ordinal()] = 7;
      } catch (NoSuchFieldError var13) {
      }

      try {
         CONST_B[WorldUtil6.FOOD.ordinal()] = 8;
      } catch (NoSuchFieldError var12) {
      }

      try {
         CONST_B[WorldUtil6.GAPPLE.ordinal()] = 9;
      } catch (NoSuchFieldError var11) {
      }

      try {
         CONST_B[WorldUtil6.THROWABLE.ordinal()] = 10;
      } catch (NoSuchFieldError var10) {
      }

      try {
         CONST_B[WorldUtil6.PEARL.ordinal()] = 11;
      } catch (NoSuchFieldError var9) {
      }

      try {
         CONST_B[WorldUtil6.FIREBALL.ordinal()] = 12;
      } catch (NoSuchFieldError var8) {
      }

      try {
         CONST_B[WorldUtil6.POTION_SPEED.ordinal()] = 13;
      } catch (NoSuchFieldError var7) {
      }

      try {
         CONST_B[WorldUtil6.POTION_HEAL.ordinal()] = 14;
      } catch (NoSuchFieldError var6) {
      }

      try {
         CONST_B[WorldUtil6.POTION_STRENGTH.ordinal()] = 15;
      } catch (NoSuchFieldError var5) {
      }

      CONST_A = new int[EnumType4.values().length];

      try {
         CONST_A[EnumType4.IMMEDIATE.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         CONST_A[EnumType4.AFTER_DELAY.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         CONST_A[EnumType4.HOLD.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         CONST_A[EnumType4.TOGGLE.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }
   }
}
