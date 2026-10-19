package rip.breeze.mixins.network;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.INetHandlerPlayClient;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;

@CTransformer(NetworkManager.class)
public class MixinNetworkManager {
   @CInject(method = "channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/Packet;)V", target = @CTarget("HEAD"), cancellable = true)
   public void channelRead0(ChannelHandlerContext var1, Packet<INetHandlerPlayClient> var2, InjectionCallback var3) {
      if (MethodHandleStore.isValid_25(MethodHandleStore.getObject_19(), var2, (NetworkManager)this)) {
         var3.cancel();
      }
   }

   @CInject(
      method = "func_150732_b(Lnet/minecraft/network/Packet;[Lio/netty/util/concurrent/GenericFutureListener;)V",
      target = @CTarget("HEAD"),
      cancellable = true
   )
   public void dispatchPacket(Packet<?> var1, GenericFutureListener<? extends Future<? super Void>>[] var2, InjectionCallback var3) {
      Object var4 = (Object)MethodHandleStore.methodHandle_aw.invoke((Object)var1);
      MethodHandleStore.initialize_18(MethodHandleStore.getObject_19(), var4, (NetworkManager)this);
      if (MethodHandleStore.isValid_22(var4)) {
         var3.cancel();
      } else {
         MethodHandleStore.initialize_3(MethodHandleStore.getObject_2(), var1);
      }
   }
}
