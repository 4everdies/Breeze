package rip.breeze;

import net.minecraft.util.MovingObjectPosition.MovingObjectType;

// $VF: synthetic class
class WorldUtil1 {
   static final int[] CONST_A = new int[MovingObjectType.values().length];

   static {
      try {
         CONST_A[MovingObjectType.BLOCK.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         CONST_A[MovingObjectType.ENTITY.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         CONST_A[MovingObjectType.MISS.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
