package rip.breeze;

import net.minecraft.network.play.server.S05PacketSpawnPosition;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S05PacketSpawnPosition",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent to set the spawn position of a player"
)
public class Lambda4 extends PacketUtil14<S05PacketSpawnPosition> {
   public Lambda4(S05PacketSpawnPosition var1) {
      super(var1);
   }

   @JSFunction(value = "getSpawnPos", description = "Gets the spawn position coordinates", returns = "The BlockPos containing the spawn coordinates")
   public BlockPos getBreezeUtil80() {
      return new BlockPos(((S05PacketSpawnPosition)this.b()).getSpawnPos());
   }
}
