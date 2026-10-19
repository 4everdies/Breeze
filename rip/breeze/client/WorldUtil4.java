package rip.breeze.client;

import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;

class WorldUtil4 {
   BlockPos blockPos_a;
   Vec3 vec3_b;
   net.minecraft.util.EnumFacing enumFacing_c;
   final SelfTrap selfTrap_d;

   public WorldUtil4(SelfTrap var1, BlockPos var2, Vec3 var3, net.minecraft.util.EnumFacing var4) {
      this.selfTrap_d = var1;
      this.blockPos_a = var2;
      this.vec3_b = var3;
      this.enumFacing_c = var4;
   }
}
