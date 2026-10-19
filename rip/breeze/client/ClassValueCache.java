package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import rip.breeze.MathUtil1;
import rip.breeze.StringDecryptor;

class ClassValueCache {
   private final BlockPos blockPos_a;
   private final net.minecraft.util.EnumFacing enumFacing_b;
   private final Vec3 vec3_c;
   private final boolean fieldBool_d;

   private ClassValueCache(BlockPos var1, net.minecraft.util.EnumFacing var2, Random var3) {
      long var4 = 30807241231006L;
      super();
      String var10000 = ScaffoldUtils.getString_2();
      this.blockPos_a = var1;
      this.enumFacing_b = var2;
      this.fieldBool_d = true;
      double var6 = 0.5;
      Vec3i var8 = var2.getDirectionVec();
      Vec3 var9 = new Vec3(var1.getX() + 0.5 + var8.getX() * 0.5, var1.getY() + 0.5 + var8.getY() * 0.5, var1.getZ() + 0.5 + var8.getZ() * 0.5);
      float var10 = (float)MathUtil1.clamp_3(var3.nextGaussian() * 0.075, -0.3, 0.3);
      String var11 = var10000;
      float var12 = (float)MathUtil1.clamp_3(var3.nextGaussian() * 0.075, -0.3, 0.3);
      switch (RotationUtil6.CONST_E[var2.getAxis().ordinal()]) {
         case 1:
            this.vec3_c = var9.addVector(0.0, var10, var12);
            if (var11 != null) {
               break;
            }
         case 2:
            this.vec3_c = var9.addVector(var10, 0.0, var12);
            if (var11 != null) {
               break;
            }
         case 3:
            this.vec3_c = var9.addVector(var10, var12, 0.0);
            if (var11 != null) {
               break;
            }
         default:
            this.vec3_c = var9;
      }
   }

   private ClassValueCache(BlockPos var1, net.minecraft.util.EnumFacing var2, Vec3 var3) {
      this.blockPos_a = var1;
      this.enumFacing_b = var2;
      this.vec3_c = var3;
      this.fieldBool_d = false;
   }

   private ClassValueCache(BlockPos var1, net.minecraft.util.EnumFacing var2, Vec3 var3, boolean var4) {
      this.blockPos_a = var1;
      this.enumFacing_b = var2;
      this.vec3_c = var3;
      this.fieldBool_d = var4;
   }

   static net.minecraft.util.EnumFacing getEnumFacing_b(ClassValueCache var0) {
      return var0.enumFacing_b;
   }

   static BlockPos getBlockPos_a(ClassValueCache var0) {
      return var0.blockPos_a;
   }

   static Vec3 getVec3_c(ClassValueCache var0) {
      return var0.vec3_c;
   }

   ClassValueCache(BlockPos var1, net.minecraft.util.EnumFacing var2, Vec3 var3, RotationUtil6 var4) {
      this(var1, var2, var3);
   }

   ClassValueCache(BlockPos var1, net.minecraft.util.EnumFacing var2, Vec3 var3, boolean var4, RotationUtil6 var5) {
      this(var1, var2, var3, var4);
   }

   ClassValueCache(BlockPos var1, net.minecraft.util.EnumFacing var2, Random var3, RotationUtil6 var4) {
      this(var1, var2, var3);
   }

   static boolean isBool_d(ClassValueCache var0) {
      return var0.fieldBool_d;
   }
}
