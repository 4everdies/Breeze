package rip.breeze.mixins.client.particle;

import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.client.particle.EntityFX;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;

@CTransformer(EffectRenderer.class)
public class MixinEffectRenderer {
   @CInject(method = "func_78873_a(Lnet/minecraft/client/particle/EntityFX;)V", target = @CTarget("HEAD"), cancellable = true)
   public void addEffect(EntityFX var1, InjectionCallback var2) {
      Object var3 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bs);
      if (MethodHandleStore.isValid_13(var3) && MethodHandleStore.isValid_29(var3)) {
         var2.cancel();
      }
   }
}
