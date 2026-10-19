package rip.breeze.mixins.client.renderer.entity;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.Mapping;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(RenderPlayer.class)
public class MixinRenderPlayer {
   @CRedirect(
      method = "func_76986_a(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDFF)V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;func_175144_cb()Z"),
      mapping = {Mapping.FORGE, Mapping.FORGE_MOD, Mapping.VANILLA, Mapping.LOCAL}
   )
   public boolean isUser(AbstractClientPlayer var1) {
      return var1.isUser() && !MethodHandleStore.isValid_4(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bj));
   }
}
