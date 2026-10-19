package rip.breeze.mixins.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.EntityLivingBase;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.annotations.CShadow;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(EntityLivingBase.class)
public abstract class MixinEntityLivingBase {
   @CShadow
   public float field_70701_bs;
   @CShadow
   public float field_70702_br;

   @CShadow
   protected abstract float func_110146_f(float var1, float var2);

   @CRedirect(method = "func_70612_e(FF)V", target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/entity/EntityLivingBase;func_70060_a(FFF)V"))
   public void moveFlying(EntityLivingBase var1, float var2, float var3, float var4) {
      if (var1 instanceof EntityPlayerSP && var1 == Minecraft.getMinecraft().thePlayer) {
         Object var5 = (Object)MethodHandleStore.methodHandle_aP.invoke((float)var3, (float)var2, (float)var4);
         MethodHandleStore.isValid_23(var5);
         var1.moveFlying(MethodHandleStore.getFloat_13(var5), MethodHandleStore.getFloat_11(var5), MethodHandleStore.getFloat(var5));
      } else {
         var1.moveFlying(var2, var3, var4);
      }
   }

   @CRedirect(method = "func_110146_f(FF)F", target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/EntityLivingBase;field_70177_z:F"))
   public float rotationYawU(EntityLivingBase var1) {
      Object var2 = MethodHandleStore.getObject();
      return MethodHandleStore.isValid_27(var2) && var1 == Minecraft.getMinecraft().thePlayer ? MethodHandleStore.getFloat_7(var2) : var1.rotationYaw;
   }

   @CRedirect(
      method = "func_70071_h_()V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/entity/EntityLivingBase;func_110146_f(FF)F", ordinal = 0)
   )
   public float updateDistance(EntityLivingBase var1, float var2, float var3) {
      Object var4 = MethodHandleStore.getObject();
      if (MethodHandleStore.isValid_27(var4) & var1.swingProgress > 0.0F && var1 == Minecraft.getMinecraft().thePlayer) {
         var2 = MethodHandleStore.getFloat_7(var4);
      }

      return this.updateDistance(var2, var3);
   }

   @CRedirect(method = "func_70612_e(FF)V", target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/entity/EntityLivingBase;func_70091_d(DDD)V"))
   public void moveEntity(EntityLivingBase var1, double var2, double var4, double var6) {
      if (var1 instanceof EntityPlayerSP && var1 == Minecraft.getMinecraft().thePlayer) {
         Object var8 = MethodHandleStore.getObject_4();
         if (!Minecraft.getMinecraft().thePlayer.capabilities.isFlying) {
            if (var1.isInWater()) {
               var8 = MethodHandleStore.getObject_6();
            } else if (var1.isInLava()) {
               var8 = MethodHandleStore.getObject_21();
            }
         }

         Object var9 = (Object)MethodHandleStore.methodHandle_aU.invoke((double)var1.motionX, (double)var1.motionY, (double)var1.motionZ, (Object)var8);
         MethodHandleStore.isValid_23(var9);
         var1.motionX = MethodHandleStore.getDouble_4(var9);
         var1.motionY = MethodHandleStore.getDouble_5(var9);
         var1.motionZ = MethodHandleStore.getDouble(var9);
         if (!MethodHandleStore.isValid_15(var9)) {
            var1.moveEntity(MethodHandleStore.getDouble_4(var9), MethodHandleStore.getDouble_5(var9), MethodHandleStore.getDouble(var9));
         }
      } else {
         var1.moveEntity(var2, var4, var6);
      }
   }

   @CRedirect(method = "func_70664_aZ()V", target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/EntityLivingBase;field_70177_z:F", ordinal = 0))
   public float rotationYaw(EntityLivingBase var1) {
      Object var2 = MethodHandleStore.getObject();
      return var1 == Minecraft.getMinecraft().thePlayer && MethodHandleStore.isValid_27(var2) && MethodHandleStore.isValid_20(var2)
         ? MethodHandleStore.getFloat_7(var2)
         : var1.rotationYaw;
   }
}
