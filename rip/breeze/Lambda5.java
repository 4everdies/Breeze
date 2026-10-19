package rip.breeze;

import net.minecraft.network.play.server.S09PacketHeldItemChange;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S09PacketHeldItemChange",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet sent from the server when the held item hotbar slot changes"
)
public class Lambda5 extends PacketUtil14<S09PacketHeldItemChange> {
   public Lambda5(S09PacketHeldItemChange var1) {
      super(var1);
   }

   @JSFunction(value = "getHeldItemHotbarIndex", description = "Gets the new selected hotbar slot index", returns = "The hotbar slot index (0-8)")
   public int getHeldItem() {
      return ((S09PacketHeldItemChange)this.b()).getHeldItemHotbarIndex();
   }
}
