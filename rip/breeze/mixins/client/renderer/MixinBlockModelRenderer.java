package rip.breeze.mixins.client.renderer;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.BlockModelRenderer;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(BlockModelRenderer.class)
public class MixinBlockModelRenderer {
   @CRedirect(
      method = "func_178267_a(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/client/resources/model/IBakedModel;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/BlockPos;Lnet/minecraft/client/renderer/WorldRenderer;Z)Z",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/block/Block;func_149750_m()I")
   )
   public int getLightValue(Block var1) {
      Object var2 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bu);
      return var2 != null && MethodHandleStore.isValid_3(var2) && MethodHandleStore.isValid_16(var2) && MethodHandleStore.isValid_8(var2, var1)
         ? 15
         : var1.getLightValue();
   }
}
