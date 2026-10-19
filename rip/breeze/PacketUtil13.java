package rip.breeze;

import net.minecraft.network.play.client.C09PacketHeldItemChange;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "C09PacketHeldItemChange",
   superName = "Packet",
   group = "net/minecraft/network/client",
   description = "Packet sent when changing held item slot"
)
public class PacketUtil13 extends PacketUtil14<C09PacketHeldItemChange> {
   public PacketUtil13(C09PacketHeldItemChange var1) {
      super(var1);
   }

   @JSConstructor(description = "Creates a new C09PacketHeldItemChange packet", params = "The slot ID to change to (0-8)")
   public PacketUtil13(int var1) {
      super(new C09PacketHeldItemChange(var1));
   }

   @JSFunction(value = "getSlotId", description = "Gets the selected slot ID", returns = "The selected slot ID (0-8)")
   public int getValue() {
      return ((C09PacketHeldItemChange)this.i).getSlotId();
   }

   @JSFunction(value = "setSlotId", description = "Sets the selected slot ID", params = "The new slot ID to select (0-8)")
   public void initialize(int var1) {
      MinecraftAccessor.initialize_39((C09PacketHeldItemChange)this.i, var1);
   }
}
