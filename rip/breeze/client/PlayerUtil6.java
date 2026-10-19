package rip.breeze.client;

import com.mojang.realmsclient.gui.ChatFormatting;

// $VF: synthetic class
class PlayerUtil6 {
   static final int[] CONST_A;
   static final int[] CONST_B;
   static final int[] CONST_C = new int[ChatFormatting.values().length];

   static {
      try {
         CONST_C[ChatFormatting.BLACK.ordinal()] = 1;
      } catch (NoSuchFieldError var23) {
      }

      try {
         CONST_C[ChatFormatting.DARK_BLUE.ordinal()] = 2;
      } catch (NoSuchFieldError var22) {
      }

      try {
         CONST_C[ChatFormatting.DARK_GREEN.ordinal()] = 3;
      } catch (NoSuchFieldError var21) {
      }

      try {
         CONST_C[ChatFormatting.DARK_AQUA.ordinal()] = 4;
      } catch (NoSuchFieldError var20) {
      }

      try {
         CONST_C[ChatFormatting.DARK_RED.ordinal()] = 5;
      } catch (NoSuchFieldError var19) {
      }

      try {
         CONST_C[ChatFormatting.DARK_PURPLE.ordinal()] = 6;
      } catch (NoSuchFieldError var18) {
      }

      try {
         CONST_C[ChatFormatting.GOLD.ordinal()] = 7;
      } catch (NoSuchFieldError var17) {
      }

      try {
         CONST_C[ChatFormatting.GRAY.ordinal()] = 8;
      } catch (NoSuchFieldError var16) {
      }

      try {
         CONST_C[ChatFormatting.DARK_GRAY.ordinal()] = 9;
      } catch (NoSuchFieldError var15) {
      }

      try {
         CONST_C[ChatFormatting.BLUE.ordinal()] = 10;
      } catch (NoSuchFieldError var14) {
      }

      try {
         CONST_C[ChatFormatting.GREEN.ordinal()] = 11;
      } catch (NoSuchFieldError var13) {
      }

      try {
         CONST_C[ChatFormatting.AQUA.ordinal()] = 12;
      } catch (NoSuchFieldError var12) {
      }

      try {
         CONST_C[ChatFormatting.RED.ordinal()] = 13;
      } catch (NoSuchFieldError var11) {
      }

      try {
         CONST_C[ChatFormatting.LIGHT_PURPLE.ordinal()] = 14;
      } catch (NoSuchFieldError var10) {
      }

      try {
         CONST_C[ChatFormatting.YELLOW.ordinal()] = 15;
      } catch (NoSuchFieldError var9) {
      }

      try {
         CONST_C[ChatFormatting.WHITE.ordinal()] = 16;
      } catch (NoSuchFieldError var8) {
      }

      CONST_B = new int[PlayerUtil10.values().length];

      try {
         CONST_B[PlayerUtil10.ENEMY.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         CONST_B[PlayerUtil10.TEAM.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         CONST_B[PlayerUtil10.FRIEND.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      CONST_A = new int[rip.breeze.ClientMode.values().length];

      try {
         CONST_A[rip.breeze.ClientMode.SIMPLE.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         CONST_A[rip.breeze.ClientMode.HYPIXEL.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         CONST_A[rip.breeze.ClientMode.GENERIC.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         CONST_A[rip.breeze.ClientMode.NONE.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }
   }
}
