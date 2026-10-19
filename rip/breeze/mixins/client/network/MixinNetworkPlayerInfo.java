package rip.breeze.mixins.client.network;

import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ResourceLocation;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;

@CTransformer(NetworkPlayerInfo.class)
public class MixinNetworkPlayerInfo {
   @CInject(method = "func_178861_h()Lnet/minecraft/util/ResourceLocation;", target = @CTarget("HEAD"), cancellable = true)
   private void getLocationCape(InjectionCallback var1) {
      ResourceLocation var2 = (ResourceLocation)MethodHandleStore.getObject_7(
         MethodHandleStore.getObject_11(), ((NetworkPlayerInfo)this).getGameProfile().getId()
      );
      if (var2 != null) {
         var1.setReturnValue(var2);
      }
   }
}
