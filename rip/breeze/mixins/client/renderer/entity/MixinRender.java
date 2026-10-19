package rip.breeze.mixins.client.renderer.entity;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;

@CTransformer(Render.class)
public class MixinRender {
   @CInject(method = "func_76977_a(Lnet/minecraft/entity/Entity;DDDF)V", target = @CTarget("HEAD"), cancellable = true)
   public void renderEntityOnFire(Entity var1, double var2, double var4, double var6, float var8, InjectionCallback var9) {
      Object var10 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bs);
      if (MethodHandleStore.isValid_13(var10) && MethodHandleStore.isValid_18(var10)) {
         var9.cancel();
      }
   }
}
