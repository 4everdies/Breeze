package rip.breeze.mixins.client.renderer.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.Mapping;
import rip.breeze.classtransform.annotations.injection.CInject;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(RenderManager.class)
public class MixinRenderManager {
   @CInject(method = "func_147936_a(Lnet/minecraft/entity/Entity;FZ)Z", target = @CTarget("HEAD"))
   public void renderEntityStaticPre(Entity var1, float var2, boolean var3, InjectionCallback var4) {
      if (var1 instanceof EntityPlayerSP && var1 == Minecraft.getMinecraft().thePlayer) {
         MethodHandleStore.initialize_20(MethodHandleStore.getObject());
      }
   }

   @CInject(method = "func_147936_a(Lnet/minecraft/entity/Entity;FZ)Z", target = @CTarget("RETURN"))
   public void renderEntityStaticPost(Entity var1, float var2, boolean var3, InjectionCallback var4) {
      if (var1 instanceof EntityPlayerSP && var1 == Minecraft.getMinecraft().thePlayer) {
         MethodHandleStore.initialize_14(MethodHandleStore.getObject());
      }
   }

   @CRedirect(
      method = "func_180597_a(Lnet/minecraft/world/World;Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;Lnet/minecraft/client/settings/GameSettings;F)V",
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/client/settings/GameSettings;field_74320_O:I"),
      mapping = {Mapping.FORGE, Mapping.FORGE_MOD, Mapping.VANILLA, Mapping.LOCAL}
   )
   public int getThirdPersonView(GameSettings var1) {
      return MethodHandleStore.getValue_2(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }

   @CRedirect(
      method = "func_180597_a(Lnet/minecraft/world/World;Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;Lnet/minecraft/client/settings/GameSettings;F)V",
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/Entity;field_70177_z:F"),
      mapping = {Mapping.FORGE, Mapping.FORGE_MOD, Mapping.VANILLA, Mapping.LOCAL}
   )
   public float getRotationYaw(Entity var1) {
      return MethodHandleStore.getFloat_18(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }

   @CRedirect(
      method = "func_180597_a(Lnet/minecraft/world/World;Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;Lnet/minecraft/client/settings/GameSettings;F)V",
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/Entity;field_70125_A:F"),
      mapping = {Mapping.FORGE, Mapping.FORGE_MOD, Mapping.VANILLA, Mapping.LOCAL}
   )
   public float getRotationPitch(Entity var1) {
      return MethodHandleStore.getFloat_8(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }

   @CRedirect(
      method = "func_180597_a(Lnet/minecraft/world/World;Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;Lnet/minecraft/client/settings/GameSettings;F)V",
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/Entity;field_70126_B:F"),
      mapping = {Mapping.FORGE, Mapping.FORGE_MOD, Mapping.VANILLA, Mapping.LOCAL}
   )
   public float getPrevRotationYaw(Entity var1) {
      return MethodHandleStore.getFloat_16(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }

   @CRedirect(
      method = "func_180597_a(Lnet/minecraft/world/World;Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;Lnet/minecraft/client/settings/GameSettings;F)V",
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/Entity;field_70127_C:F"),
      mapping = {Mapping.FORGE, Mapping.FORGE_MOD, Mapping.VANILLA, Mapping.LOCAL}
   )
   public float getPrevRotationPitch(Entity var1) {
      return MethodHandleStore.getFloat_15(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }
}
