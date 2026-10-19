package rip.breeze.mixins.world;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTarget$Shift;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;

@CTransformer(World.class)
public class MixinWorld {
   @CInject(
      method = "func_180501_a(Lnet/minecraft/util/BlockPos;Lnet/minecraft/block/state/IBlockState;I)Z",
      target = @CTarget(
         value = "INVOKE",
         shift = CTarget$Shift.BEFORE,
         target = "Lnet/minecraft/world/World;func_175726_f(Lnet/minecraft/util/BlockPos;)Lnet/minecraft/world/chunk/Chunk;"
      )
   )
   public void setBlockState(BlockPos var1, IBlockState var2, int var3, InjectionCallback var4) {
      MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_g.invoke((Object)var1, (Object)var2, (int)var3));
   }
}
