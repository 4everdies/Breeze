package rip.breeze.client;

import net.minecraft.util.EnumFacing.Axis;

// $VF: synthetic class
class RotationUtil6 {
   static final int[] CONST_A;
   static final int[] CONST_B;
   static final int[] CONST_C;
   static final int[] CONST_D;
   static final int[] CONST_E;
   static final int[] CONST_F = new int[RotationUtil3_x.values().length];

   static {
      try {
         CONST_F[RotationUtil3_x.SIMPLE.ordinal()] = 1;
      } catch (NoSuchFieldError var22) {
      }

      try {
         CONST_F[RotationUtil3_x.REVERSE.ordinal()] = 2;
      } catch (NoSuchFieldError var21) {
      }

      try {
         CONST_F[RotationUtil3_x.STRAFE.ordinal()] = 3;
      } catch (NoSuchFieldError var20) {
      }

      CONST_E = new int[Axis.values().length];

      try {
         CONST_E[Axis.X.ordinal()] = 1;
      } catch (NoSuchFieldError var19) {
      }

      try {
         CONST_E[Axis.Y.ordinal()] = 2;
      } catch (NoSuchFieldError var18) {
      }

      try {
         CONST_E[Axis.Z.ordinal()] = 3;
      } catch (NoSuchFieldError var17) {
      }

      CONST_D = new int[RotationUtil1_x.values().length];

      try {
         CONST_D[RotationUtil1_x.TELLY_ROTATION.ordinal()] = 1;
      } catch (NoSuchFieldError var16) {
      }

      try {
         CONST_D[RotationUtil1_x.SIMPLE_ROTATION.ordinal()] = 2;
      } catch (NoSuchFieldError var15) {
      }

      try {
         CONST_D[RotationUtil1_x.BREEZILY_ROTATION.ordinal()] = 3;
      } catch (NoSuchFieldError var14) {
      }

      try {
         CONST_D[RotationUtil1_x.NINJA_ROTATION.ordinal()] = 4;
      } catch (NoSuchFieldError var13) {
      }

      try {
         CONST_D[RotationUtil1_x.STRAFE_ROTATION.ordinal()] = 5;
      } catch (NoSuchFieldError var12) {
      }

      try {
         CONST_D[RotationUtil1_x.REVERSE_ROTATION.ordinal()] = 6;
      } catch (NoSuchFieldError var11) {
      }

      CONST_C = new int[EnumType33.values().length];

      try {
         CONST_C[EnumType33.SILENT.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         CONST_C[EnumType33.SWITCHBACK.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         CONST_C[EnumType33.DEFAULT.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      CONST_B = new int[ClientMode2.values().length];

      try {
         CONST_B[ClientMode2.WATCHDOG.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         CONST_B[ClientMode2.TELLY.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         CONST_B[ClientMode2.BREEZILY.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         CONST_B[ClientMode2.NINJA.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      try {
         CONST_B[ClientMode2.GRIM.ordinal()] = 5;
      } catch (NoSuchFieldError var3) {
      }

      CONST_A = new int[EnumType13.values().length];

      try {
         CONST_A[EnumType13.DEFAULT.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         CONST_A[EnumType13.SILENT.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }
   }
}
