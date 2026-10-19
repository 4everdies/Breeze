package rip.breeze;

import net.minecraft.network.play.client.C00PacketKeepAlive;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "C00PacketKeepAlive",
   superName = "Packet",
   description = "Packet sent by the client to keep the connection alive",
   example = "var packet = new C00PacketKeepAlive(123);",
   group = "net/minecraft/network/client"
)
public class PacketUtil11 extends PacketUtil14<C00PacketKeepAlive> {
   @JSConstructor(params = "The key")
   public PacketUtil11(int var1) {
      super(new C00PacketKeepAlive(var1));
   }

   public PacketUtil11(C00PacketKeepAlive var1) {
      super(var1);
   }

   @JSFunction(value = "getKey", description = "Gets the key value", returns = "The key value")
   public int getValue() {
      return ((C00PacketKeepAlive)this.i).getKey();
   }

   @JSFunction(value = "setKey", description = "Sets the key value", params = "The key value to set")
   public void initialize(int var1) {
      MinecraftAccessor.initialize_8((C00PacketKeepAlive)this.i, var1);
   }
}
