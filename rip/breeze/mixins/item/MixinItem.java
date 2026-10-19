package rip.breeze.mixins.item;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(Item.class)
public class MixinItem {
   @CRedirect(
      method = "func_77621_a(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Z)Lnet/minecraft/util/MovingObjectPosition;",
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;field_70177_z:F")
   )
   public float yawOverride(EntityPlayer var1) {
      return MethodHandleStore.isValid_27(MethodHandleStore.getObject()) && var1 == Minecraft.getMinecraft().thePlayer
         ? MethodHandleStore.getFloat_7(MethodHandleStore.getObject())
         : var1.rotationYaw;
   }

   @CRedirect(
      method = "func_77621_a(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Z)Lnet/minecraft/util/MovingObjectPosition;",
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;field_70125_A:F")
   )
   public float pitchOverride(EntityPlayer var1) {
      return MethodHandleStore.isValid_27(MethodHandleStore.getObject()) && var1 == Minecraft.getMinecraft().thePlayer
         ? MethodHandleStore.getFloat_12(MethodHandleStore.getObject())
         : var1.rotationPitch;
   }
}
