package rip.breeze.mixins.client.multiplayer;

import net.minecraft.client.multiplayer.PlayerControllerMP;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CShadow;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;

@CTransformer(PlayerControllerMP.class)
public class MixinPlayerControllerMP {
   @CShadow
   public boolean field_78778_j;

   @CInject(method = "func_78767_c()V", target = @CTarget("HEAD"), cancellable = true)
   public void resetBlockRemoving(InjectionCallback var1) {
      if (!this.isHittingBlock && MethodHandleStore.isValid_17(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bt))) {
         var1.cancel();
      }
   }
}
