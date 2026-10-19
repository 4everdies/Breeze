package rip.breeze;

import net.minecraft.network.play.client.C0DPacketCloseWindow;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "C0DPacketCloseWindow",
   superName = "Packet",
   description = "A packet sent by the client to close a window (container/inventory).",
   group = "net/minecraft/network/client"
)
public class PacketUtil4 extends PacketUtil14<C0DPacketCloseWindow> {
   public PacketUtil4(C0DPacketCloseWindow var1) {
      super(var1);
   }

   @JSConstructor(description = "Creates a new C0DPacketCloseWindow packet", params = "The ID of the window to close")
   public PacketUtil4(int var1) {
      super(new C0DPacketCloseWindow(var1));
   }

   @JSFunction(value = "getWindowId", description = "Gets the ID of the window being closed", returns = "The window ID")
   public int getValue() {
      return MinecraftAccessor.getValue_10((C0DPacketCloseWindow)this.i);
   }

   @JSFunction(value = "setWindowId", description = "Sets the ID of the window being closed", params = "The new window ID")
   public void initialize(int var1) {
      MinecraftAccessor.initialize_54((C0DPacketCloseWindow)this.i, var1);
   }
}
