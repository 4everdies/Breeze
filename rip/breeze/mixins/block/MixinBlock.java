package rip.breeze.mixins.block;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;

@CTransformer(Block.class)
public class MixinBlock {
   @CInject(
      method = "func_176225_a(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/BlockPos;Lnet/minecraft/util/EnumFacing;)Z",
      target = @CTarget("HEAD"),
      cancellable = true
   )
   public void shouldSideBeRendered(IBlockAccess var1, BlockPos var2, EnumFacing var3, InjectionCallback var4) {
      Object var5 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bu);
      if (var5 != null && MethodHandleStore.isValid_3(var5) && MethodHandleStore.isValid_8(var5, (Block)this)) {
         var4.setReturnValue(true);
      }
   }

   @CInject(method = "func_176207_c(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/BlockPos;)I", target = @CTarget("HEAD"), cancellable = true)
   public void getMixedBrightnessForBlock(IBlockAccess var1, BlockPos var2, InjectionCallback var3) {
      Object var4 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bu);
      if (var4 != null && MethodHandleStore.isValid_3(var4) && MethodHandleStore.isValid_16(var4) && MethodHandleStore.isValid_8(var4, (Block)this)) {
         var3.setReturnValue(15728880);
      }
   }
}
