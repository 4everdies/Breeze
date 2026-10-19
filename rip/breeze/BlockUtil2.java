package rip.breeze;

import net.minecraft.network.play.server.S03PacketTimeUpdate;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S03PacketTimeUpdate",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that updates the world time"
)
public class BlockUtil2 extends PacketUtil14<S03PacketTimeUpdate> {
   public BlockUtil2(S03PacketTimeUpdate var1) {
      super(var1);
   }

   @JSFunction(value = "getTotalWorldTime", description = "Gets the total time of the world in ticks", returns = "The total world time")
   public long getLong() {
      return ((S03PacketTimeUpdate)this.b()).getTotalWorldTime();
   }

   @JSFunction(value = "getWorldTime", description = "Gets the current world time in ticks", returns = "The current world time")
   public long getLong_2() {
      return ((S03PacketTimeUpdate)this.b()).getWorldTime();
   }
}
