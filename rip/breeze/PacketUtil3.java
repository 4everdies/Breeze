package rip.breeze;

import net.minecraft.network.play.server.S2FPacketSetSlot;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S2FPacketSetSlot",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent when an item slot changes in a container"
)
public class PacketUtil3 extends PacketUtil14<S2FPacketSetSlot> {
   public PacketUtil3(S2FPacketSetSlot var1) {
      super(var1);
   }

   @JSFunction(value = "getWindowId", description = "Gets the ID of the window containing the slot", returns = "The window ID")
   public int getValue() {
      return ((S2FPacketSetSlot)this.b()).func_149175_c();
   }

   @JSFunction(value = "getSlot", description = "Gets the slot number that was changed", returns = "The slot number")
   public int getValue_2() {
      return ((S2FPacketSetSlot)this.b()).func_149173_d();
   }

   @JSFunction(value = "getItemStack", description = "Gets the new ItemStack in the slot", returns = "The ItemStack object")
   public ItemStack getBreezeUtil68() {
      return new ItemStack(((S2FPacketSetSlot)this.b()).func_149174_e());
   }
}
