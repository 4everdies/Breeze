package rip.breeze.mixins.client.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.annotations.CShadow;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(ItemRenderer.class)
public abstract class MixinItemRenderer {
   @CShadow
   public Minecraft field_78455_a;

   @CShadow
   public abstract void func_178096_b(float var1, float var2);

   @CRedirect(method = "func_78440_a(F)V", target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;func_71052_bv()I"))
   public int getItemInUseCount(AbstractClientPlayer var1) {
      return MethodHandleStore.isValid_19(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bn))
         ? 1
         : var1.getItemInUseCount();
   }

   @CRedirect(
      method = "func_78440_a(F)V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;func_178096_b(FF)V", ordinal = 2)
   )
   public void transformFirstPersonItem1(ItemRenderer var1, float var2, float var3) {
      boolean var4 = MethodHandleStore.isValid_19(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bn));
      float var5 = MethodHandleStore.getFloat_5();
      if (var4) {
         GlStateManager.translate(0.0, 0.15, 0.0);
         var3 = Minecraft.getMinecraft().thePlayer.getSwingProgress(var5);
      }

      this.transformFirstPersonItem(var2, var3);
   }
}
