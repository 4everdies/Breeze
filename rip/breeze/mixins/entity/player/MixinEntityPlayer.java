package rip.breeze.mixins.entity.player;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CShadow;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(EntityPlayer.class)
public abstract class MixinEntityPlayer {
   @CShadow
   public abstract String func_70005_c_();

   @CRedirect(
      method = "func_71059_n(Lnet/minecraft/entity/Entity;)V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/entity/player/EntityPlayer;func_70031_b(Z)V")
   )
   public void setSprinting(EntityPlayer var1, boolean var2) {
      if (var1 instanceof EntityPlayerSP
         && var1 == Minecraft.getMinecraft().thePlayer
         && MethodHandleStore.isValid_21(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bq))) {
         var1.motionX /= 0.6;
         var1.motionZ /= 0.6;
      } else {
         var1.setSprinting(false);
      }
   }

   @CInject(method = "func_70664_aZ()V", target = @CTarget("HEAD"), cancellable = true)
   public void jump(InjectionCallback var1) {
      if (MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_a5.invoke())) {
         var1.cancel();
      }
   }

   @CRedirect(
      method = "func_145748_c_()Lnet/minecraft/util/IChatComponent;",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/entity/player/EntityPlayer;func_70005_c_()Ljava/lang/String;", optional = true)
   )
   public String redirectGetName(EntityPlayer var1) {
      Object var2 = (Object)MethodHandleStore.methodHandle_X.invoke((String)this.func_70005_c_());
      MethodHandleStore.isValid_23(var2);
      return MethodHandleStore.getString(var2);
   }
}
