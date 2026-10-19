package rip.breeze;

import net.minecraft.network.play.server.S0DPacketCollectItem;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S0DPacketCollectItem",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent when an item is collected by an entity"
)
public class PacketUtil10 extends PacketUtil14<S0DPacketCollectItem> {
   public PacketUtil10(S0DPacketCollectItem var1) {
      super(var1);
   }

   @JSFunction(
      value = "getCollectedItemEntityID",
      description = "Gets the ID of the item entity that was collected",
      returns = "The collected item's entity ID"
   )
   public int getValue() {
      return ((S0DPacketCollectItem)this.b()).getCollectedItemEntityID();
   }

   @JSFunction(value = "getEntityID", description = "Gets the ID of the entity that collected the item", returns = "The collector's entity ID")
   public int getValue_2() {
      return ((S0DPacketCollectItem)this.b()).getEntityID();
   }
}
