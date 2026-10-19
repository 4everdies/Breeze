package rip.breeze.mixins.client.renderer.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CShadow;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;

@CTransformer(RendererLivingEntity.class)
public abstract class MixinRendererLivingEntity<T extends Entity> extends Render<T> {
   @CShadow
   protected ModelBase field_77045_g;

   protected MixinRendererLivingEntity(RenderManager var1, ModelBase var2, float var3) {
      super(var1);
   }

   @CInject(method = "func_177070_b(Lnet/minecraft/entity/EntityLivingBase;)Z", target = @CTarget("HEAD"), cancellable = true)
   public void canRenderName(EntityLivingBase var1, InjectionCallback var2) {
      if (MethodHandleStore.isValid_11(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bw), var1)
         || MethodHandleStore.isValid_6(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bp))) {
         var2.setReturnValue(false);
      }
   }

   @CInject(method = "func_77036_a(Lnet/minecraft/entity/EntityLivingBase;FFFFFF)V", target = @CTarget("HEAD"), cancellable = true)
   protected void renderModel(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7, InjectionCallback var8) {
      Object var9 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bv);
      boolean var10 = !var1.isInvisible();
      boolean var11 = !var10 && (!var1.isInvisibleToPlayer(Minecraft.getMinecraft().thePlayer) || MethodHandleStore.isValid_7(var9, var1));
      if (var10 || var11) {
         if (!this.bindEntityTexture(var1)) {
            return;
         }

         if (var11) {
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, MethodHandleStore.isValid_7(var9, var1) ? MethodHandleStore.getFloat_2(var9) : 0.15F);
            GlStateManager.depthMask(false);
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(770, 771);
            GlStateManager.alphaFunc(516, 0.003921569F);
         }

         Object var12 = (Object)MethodHandleStore.methodHandle_a2
            .invoke((Object)this.mainModel, (Object)var1, (float)var2, (float)var3, (float)var4, (float)var5, (float)var6, (float)var7);
         if (!MethodHandleStore.isValid_23(var12)) {
            this.mainModel.render(var1, var2, var3, var4, var5, var6, var7);
         }

         if (var11) {
            GlStateManager.disableBlend();
            GlStateManager.alphaFunc(516, 0.1F);
            GlStateManager.popMatrix();
            GlStateManager.depthMask(true);
         }
      }

      var8.cancel();
   }
}
