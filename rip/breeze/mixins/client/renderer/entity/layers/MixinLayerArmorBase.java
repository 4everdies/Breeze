package rip.breeze.mixins.client.renderer.entity.layers;

import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;

@CTransformer(LayerArmorBase.class)
public class MixinLayerArmorBase {
   @CInject(method = "func_177141_a(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V", target = @CTarget("HEAD"), cancellable = true)
   public void renderArmorLayer(
      EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, InjectionCallback var9
   ) {
      if (var1 instanceof EntityPlayer) {
         Object var10 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bs);
         if (MethodHandleStore.isValid_13(var10) && MethodHandleStore.isValid_14(var10)) {
            var9.cancel();
         }
      }
   }
}
