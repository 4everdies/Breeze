package rip.breeze.mixins.client.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.MovementInput;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CShadow;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(EntityPlayerSP.class)
public abstract class MixinEntityPlayerSP {
   @CShadow
   public MovementInput field_71158_b;

   @CRedirect(method = "func_70071_h_()V", target = @CTarget(value = "FIELD", target = "Lnet/minecraft/client/entity/EntityPlayerSP;field_70177_z:F"))
   public float getRotationYawUpdate(EntityPlayerSP var1) {
      return MethodHandleStore.isValid_27(MethodHandleStore.getObject()) && var1 == Minecraft.getMinecraft().thePlayer
         ? MethodHandleStore.getFloat_7(MethodHandleStore.getObject())
         : var1.rotationYaw;
   }

   @CRedirect(method = "func_70071_h_()V", target = @CTarget(value = "FIELD", target = "Lnet/minecraft/client/entity/EntityPlayerSP;field_70125_A:F"))
   public float getRotationPitchUpdate(EntityPlayerSP var1) {
      return MethodHandleStore.isValid_27(MethodHandleStore.getObject()) && var1 == Minecraft.getMinecraft().thePlayer
         ? MethodHandleStore.getFloat_12(MethodHandleStore.getObject())
         : var1.rotationPitch;
   }

   @CRedirect(method = "func_175161_p()V", target = @CTarget(value = "FIELD", target = "Lnet/minecraft/client/entity/EntityPlayerSP;field_70177_z:F"))
   public float getRotationYawUpdateWalking(EntityPlayerSP var1) {
      return MethodHandleStore.isValid_27(MethodHandleStore.getObject()) && var1 == Minecraft.getMinecraft().thePlayer
         ? MethodHandleStore.getFloat_7(MethodHandleStore.getObject())
         : var1.rotationYaw;
   }

   @CRedirect(method = "func_175161_p()V", target = @CTarget(value = "FIELD", target = "Lnet/minecraft/client/entity/EntityPlayerSP;field_70125_A:F"))
   public float getRotationPitchUpdateWalking(EntityPlayerSP var1) {
      return MethodHandleStore.isValid_27(MethodHandleStore.getObject()) && var1 == Minecraft.getMinecraft().thePlayer
         ? MethodHandleStore.getFloat_12(MethodHandleStore.getObject())
         : var1.rotationPitch;
   }

   @CInject(method = "func_175161_p()V", target = @CTarget("RETURN"))
   public void onUpdateWalkingPlayer(InjectionCallback var1) {
      MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_S.invoke());
   }

   @CRedirect(method = "func_70626_be()V", target = @CTarget(value = "FIELD", target = "Lnet/minecraft/util/MovementInput;field_78902_a:F"))
   public float getMoveStrafe(MovementInput var1) {
      Object var2 = MethodHandleStore.getObject();
      return MethodHandleStore.isValid_27(var2) && MethodHandleStore.isValid_20(var2) && this == Minecraft.getMinecraft().thePlayer
         ? MethodHandleStore.getFloat_3(var2)
         : var1.moveStrafe;
   }

   @CRedirect(method = "func_70626_be()V", target = @CTarget(value = "FIELD", target = "Lnet/minecraft/util/MovementInput;field_78900_b:F"))
   public float getMoveForward(MovementInput var1) {
      Object var2 = MethodHandleStore.getObject();
      return MethodHandleStore.isValid_27(var2) && MethodHandleStore.isValid_20(var2) && this == Minecraft.getMinecraft().thePlayer
         ? MethodHandleStore.getFloat_14(MethodHandleStore.getObject())
         : var1.moveForward;
   }

   @CRedirect(method = "func_70636_d()V", target = @CTarget(value = "GETFIELD", target = "Lnet/minecraft/util/MovementInput;field_78900_b:F"))
   public float getMoveForward2(MovementInput var1) {
      Object var2 = MethodHandleStore.getObject();
      return MethodHandleStore.isValid_27(var2) && MethodHandleStore.isValid_20(var2) && this == Minecraft.getMinecraft().thePlayer
         ? MethodHandleStore.getFloat_14(MethodHandleStore.getObject())
         : var1.moveForward;
   }

   @CRedirect(
      method = "func_70636_d()V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/client/settings/KeyBinding;func_151470_d()Z", ordinal = 1, optional = true)
   )
   public boolean isKeyDown(KeyBinding var1) {
      return var1.isKeyDown() || MethodHandleStore.isValid_24(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_br));
   }

   @CInject(method = "func_175160_A()Z", target = @CTarget("RETURN"), cancellable = true)
   public void isCurrentViewEntity(InjectionCallback var1) {
      if (this == Minecraft.getMinecraft().thePlayer) {
         var1.setReturnValue(
            (Boolean)var1.getReturnValue()
               || MethodHandleStore.isValid_4(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bj))
         );
      }
   }
}
