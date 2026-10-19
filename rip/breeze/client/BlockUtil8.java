package rip.breeze.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;

final class BlockUtil8 {
   final BlockPos blockPos_a;
   final BlockPos blockPos_b;
   final net.minecraft.util.EnumFacing enumFacing_c;
   final Vec3 vec3_d;
   final List<List<ItemStack>> list_e = new ArrayList<>();
   final Set<BlockPos> set_f;
   float fieldFloat_g;
   float fieldFloat_h = -1.0F;
   float fieldFloat_i;
   boolean fieldBool_j;
   int fieldInt_k = -1;
   boolean fieldBool_l;
   boolean fieldBool_m;
   BlockPos blockPos_n;
   IBlockState iBlockState_o;

   BlockUtil8(BlockPos var1, net.minecraft.util.EnumFacing var2) {
      this.blockPos_a = var1;
      this.enumFacing_c = var2;
      this.blockPos_b = var1.offset(var2);
      this.set_f = new HashSet<>(BedNuker.getList(var1, var2));
      this.vec3_d = new Vec3((var1.getX() + this.blockPos_b.getX()) * 0.5 + 0.5, var1.getY() + 0.5625, (var1.getZ() + this.blockPos_b.getZ()) * 0.5 + 0.5);
   }
}
