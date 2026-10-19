package rip.breeze;

import net.minecraft.network.play.server.S2DPacketOpenWindow;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S2DPacketOpenWindow",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent when opening a new window/GUI"
)
public class PacketUtil2 extends PacketUtil14<S2DPacketOpenWindow> {
   public PacketUtil2(S2DPacketOpenWindow var1) {
      super(var1);
   }

   @JSFunction(value = "getWindowId", description = "Gets the ID of the window being opened", returns = "The window ID")
   public int getValue() {
      return ((S2DPacketOpenWindow)this.b()).getWindowId();
   }

   @JSFunction(value = "getGuiId", description = "Gets the identifier string for the GUI type", returns = "The GUI type ID string")
   @Override
   public String getString() {
      return ((S2DPacketOpenWindow)this.b()).getGuiId();
   }

   @JSFunction(value = "getWindowTitle", description = "Gets the title of the window without formatting codes", returns = "The window title text")
   public String getString_2() {
      return ((S2DPacketOpenWindow)this.b()).getWindowTitle().getUnformattedText();
   }

   @JSFunction(value = "getSlotCount", description = "Gets the number of slots in the window", returns = "The slot count")
   public int getValue_2() {
      return ((S2DPacketOpenWindow)this.b()).getSlotCount();
   }

   @JSFunction(value = "getEntityId", description = "Gets the ID of the entity associated with this window, if any", returns = "The entity ID")
   public int getValue_3() {
      return ((S2DPacketOpenWindow)this.b()).getEntityId();
   }

   @JSFunction(value = "hasSlots", description = "Checks if this window contains inventory slots", returns = "true if the window has slots, false otherwise")
   public boolean isValid() {
      return ((S2DPacketOpenWindow)this.b()).hasSlots();
   }
}
