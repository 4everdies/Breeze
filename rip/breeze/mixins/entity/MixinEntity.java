package rip.breeze.mixins.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CShadow;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTarget$Shift;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(Entity.class)
public abstract class MixinEntity {
   @CShadow
   public double field_70165_t;
   @CShadow
   public double field_70163_u;
   @CShadow
   public double field_70161_v;
   @CShadow
   public World field_70170_p;

   @CShadow
   public abstract Vec3 func_174806_f(float var1, float var2);

   @CInject(
      method = "func_70091_d(DDD)V",
      target = @CTarget(
         value = "INVOKE",
         shift = CTarget$Shift.BEFORE,
         target = "Lnet/minecraft/block/Block;func_176216_a(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)V"
      )
   )
   public void moveEntity(double var1, double var3, double var5, InjectionCallback var7) {
      if (!(this instanceof EntityPlayerSP) || this != Minecraft.getMinecraft().thePlayer) {
         BlockPos var8 = new BlockPos(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 0.2F), MathHelper.floor_double(this.posZ));
         Block var9 = this.worldObj.getBlockState(var8).getBlock();
         if (var9.getMaterial() == Material.air) {
            var9 = this.worldObj.getBlockState(var8.down()).getBlock();
            if (var9 instanceof BlockFence || var9 instanceof BlockWall || var9 instanceof BlockFenceGate) {
               var8 = var8.down();
            }
         }

         MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_aO.invoke((Object)var8));
      }
   }

   @CRedirect(method = "func_70060_a(FFF)V", target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/Entity;field_70177_z:F"))
   public float getRotationYaw(Entity var1) {
      if (var1 == Minecraft.getMinecraft().thePlayer) {
         Object var2 = MethodHandleStore.getObject();
         if (MethodHandleStore.isValid_27(var2) && MethodHandleStore.isValid_20(var2)) {
            return MethodHandleStore.getFloat_7(var2);
         }
      }

      return var1.rotationYaw;
   }

   @CRedirect(
      method = "func_174822_a(DF)Lnet/minecraft/util/MovingObjectPosition;",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;func_70676_i(F)Lnet/minecraft/util/Vec3;")
   )
   public Vec3 getLook(Entity var1, float var2) {
      if (var1 == Minecraft.getMinecraft().thePlayer) {
         Object var3 = MethodHandleStore.getObject();
         if (MethodHandleStore.isValid_27(var3)) {
            return this.getVectorForRotation(MethodHandleStore.getFloat_12(var3), MethodHandleStore.getFloat_7(var3));
         }
      }

      return var1.getLook(var2);
   }
}
