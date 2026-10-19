package rip.breeze.mixins.client.renderer.entity.layers;

import java.awt.Color;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerCape;
import org.lwjgl.opengl.GL11;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTarget$Shift;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;

@CTransformer(LayerCape.class)
public class MixinLayerCape {
   @CInject(
      method = "func_177141_a(Lnet/minecraft/client/entity/AbstractClientPlayer;FFFFFFF)V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;func_179121_F()V", ordinal = 0, shift = CTarget$Shift.BEFORE)
   )
   public void doRenderLayer(
      AbstractClientPlayer var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, InjectionCallback var9
   ) {
      Object var10 = MethodHandleStore.getObject_16(MethodHandleStore.getObject_11(), var1);
      if (var10 != null && MethodHandleStore.getObject_13(var10) != MethodHandleStore.getObject_20()) {
         GlStateManager.disableTexture2D();
         GlStateManager.disableLighting();
         GlStateManager.shadeModel(7425);
         GL11.glBegin(7);
         Color var11 = MethodHandleStore.getColor((float)(System.currentTimeMillis() % 6000L) / 6000.0F, 1.0F, 1.0F);
         Color var12 = MethodHandleStore.getColor((float)((System.currentTimeMillis() - 1200L) % 6000L) / 6000.0F, 1.0F, 1.0F);
         GL11.glColor3f(var11.getRed() / 255.0F, var11.getGreen() / 255.0F, var11.getBlue() / 255.0F);
         GL11.glVertex3d(-0.3, 0.2, -0.05);
         GL11.glVertex3d(0.3, 0.2, -0.05);
         GL11.glColor3f(var12.getRed() / 255.0F, var12.getGreen() / 255.0F, var12.getBlue() / 255.0F);
         GL11.glVertex3d(0.3, 0.9, -0.05);
         GL11.glVertex3d(-0.3, 0.9, -0.05);
         GL11.glEnd();
         GL11.glColor3f(1.0F, 1.0F, 1.0F);
         GlStateManager.enableLighting();
         GlStateManager.enableTexture2D();
         GlStateManager.shadeModel(7424);
      }
   }
}
