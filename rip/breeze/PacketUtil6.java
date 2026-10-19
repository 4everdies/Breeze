package rip.breeze;

import net.minecraft.network.play.server.S02PacketChat;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S02PacketChat",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a chat message packet sent from the server"
)
public class PacketUtil6 extends PacketUtil14<S02PacketChat> {
   public PacketUtil6(S02PacketChat var1) {
      super(var1);
   }

   @JSFunction(value = "getChat", description = "Gets the chat message content without formatting", returns = "The unformatted chat message text")
   @Override
   public String getString() {
      return ((S02PacketChat)this.b()).getChatComponent().getUnformattedTextForChat();
   }

   @JSFunction(value = "isChat", description = "Checks if this packet represents a chat message", returns = "True if this is a chat message, false otherwise")
   public boolean isValid() {
      return ((S02PacketChat)this.b()).isChat();
   }

   @JSFunction(value = "getType", description = "Gets the type of this chat message", returns = "The chat message type ID")
   public int getValue() {
      return ((S02PacketChat)this.b()).getType();
   }
}
