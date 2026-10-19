package rip.breeze;

import net.minecraft.network.play.client.C01PacketChatMessage;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "C01PacketChatMessage",
   superName = "Packet",
   group = "net/minecraft/network/client",
   description = "Represents a chat message packet sent from client to server."
)
public class PacketUtil12 extends PacketUtil14<C01PacketChatMessage> {
   @JSConstructor(description = "Creates a new chat message packet with the specified message.")
   public PacketUtil12(String var1) {
      super(new C01PacketChatMessage(var1));
   }

   public PacketUtil12(C01PacketChatMessage var1) {
      super(var1);
   }

   @JSFunction(value = "getMessage", returns = "The message content of this packet.")
   @Override
   public String getString() {
      return ((C01PacketChatMessage)this.i).getMessage();
   }

   @JSFunction(value = "setMessage", description = "Sets the message content of this packet.")
   public void initialize(String var1) {
      MinecraftAccessor.initialize_14((C01PacketChatMessage)this.i, var1);
   }
}
