package rip.breeze;

import net.minecraft.network.play.server.S13PacketDestroyEntities;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S13PacketDestroyEntities",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent when entities need to be destroyed/removed from the world"
)
public class Lambda6 extends PacketUtil14<S13PacketDestroyEntities> {
   public Lambda6(S13PacketDestroyEntities var1) {
      super(var1);
   }

   @JSFunction(value = "getEntityIDs", description = "Gets an array of entity IDs that should be destroyed", returns = "Array of entity IDs to be destroyed")
   public int[] values() {
      return ((S13PacketDestroyEntities)this.b()).getEntityIDs();
   }
}
