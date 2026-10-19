package rip.breeze.mixins.client.renderer.chunk;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.EnumWorldBlockLayer;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(RenderChunk.class)
public class MixinRenderChunk {
   @CRedirect(
      method = "func_178581_b(FFFLnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;)V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/block/Block;func_180664_k()Lnet/minecraft/util/EnumWorldBlockLayer;")
   )
   public EnumWorldBlockLayer getBlockLayer(Block var1) {
      Object var2 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bu);
      return var2 != null && MethodHandleStore.isValid_3(var2) && !MethodHandleStore.isValid_8(var2, var1)
         ? EnumWorldBlockLayer.TRANSLUCENT
         : var1.getBlockLayer();
   }

   @CRedirect(
      method = "func_178581_b(FFFLnet/minecraft/client/renderer/chunk/ChunkCompileTaskGenerator;)V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/block/Block;func_149662_c()Z")
   )
   public boolean isOpaqueCube(Block var1) {
      Object var2 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bu);
      return var2 != null && MethodHandleStore.isValid_3(var2) ? false : var1.isOpaqueCube();
   }
}
