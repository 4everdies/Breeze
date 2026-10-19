package rip.breeze.mixins.client.network;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer.C06PacketPlayerPosLook;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(NetHandlerPlayClient.class)
public class MixinNetHandlerPlayClient {
   @CRedirect(
      method = "func_147258_a(Lnet/minecraft/network/play/server/S08PacketPlayerPosLook;)V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/entity/player/EntityPlayer;func_70080_a(DDDFF)V", optional = true)
   )
   public void setPositionAndRotation(EntityPlayer var1, double var2, double var4, double var6, float var8, float var9) {
      MethodHandleStore.initialize_6(MethodHandleStore.getObject(), var8, var9);
      var1.setPositionAndRotation(
         var2,
         var4,
         var6,
         MethodHandleStore.isValid_27(MethodHandleStore.getObject()) ? var1.rotationYaw : var8,
         MethodHandleStore.isValid_27(MethodHandleStore.getObject()) ? var1.rotationPitch : var9
      );
   }

   @CRedirect(
      method = "func_147258_a(Lnet/minecraft/network/play/server/S08PacketPlayerPosLook;)V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/network/NetworkManager;func_179290_a(Lnet/minecraft/network/Packet;)V")
   )
   public void sendPacket(NetworkManager var1, Packet var2) {
      if (MethodHandleStore.isValid_27(MethodHandleStore.getObject())) {
         C06PacketPlayerPosLook var3 = (C06PacketPlayerPosLook)var2;
         var1.sendPacket(
            new C06PacketPlayerPosLook(
               var3.getPositionX(),
               var3.getPositionY(),
               var3.getPositionZ(),
               MethodHandleStore.getFloat_7(MethodHandleStore.getObject()),
               MethodHandleStore.getFloat_12(MethodHandleStore.getObject()),
               false
            )
         );
      } else {
         var1.sendPacket(var2);
      }
   }

   @CRedirect(
      method = "func_147258_a(Lnet/minecraft/network/play/server/S08PacketPlayerPosLook;)V",
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;field_70177_z:F")
   )
   public float getRotationYaw(EntityPlayer var1) {
      return MethodHandleStore.isValid_27(MethodHandleStore.getObject()) ? MethodHandleStore.getFloat_7(MethodHandleStore.getObject()) : var1.rotationYaw;
   }

   @CRedirect(
      method = "func_147258_a(Lnet/minecraft/network/play/server/S08PacketPlayerPosLook;)V",
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;field_70125_A:F")
   )
   public float getRotationPitch(EntityPlayer var1) {
      return MethodHandleStore.isValid_27(MethodHandleStore.getObject()) ? MethodHandleStore.getFloat_12(MethodHandleStore.getObject()) : var1.rotationPitch;
   }
}
