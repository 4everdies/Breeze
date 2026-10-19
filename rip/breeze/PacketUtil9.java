package rip.breeze;

import net.minecraft.network.play.server.S07PacketRespawn;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S07PacketRespawn",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent when the player respawns or changes dimensions"
)
public class PacketUtil9 extends PacketUtil14<S07PacketRespawn> {
   public PacketUtil9(S07PacketRespawn var1) {
      super(var1);
   }

   @JSFunction(value = "getDimensionID", description = "Gets the dimension ID that the player is respawning in", returns = "The dimension ID")
   public int getValue() {
      return ((S07PacketRespawn)this.b()).getDimensionID();
   }

   @JSFunction(value = "getDifficulty", description = "Gets the difficulty level of the dimension", returns = "The difficulty ID")
   public int getValue_2() {
      return ((S07PacketRespawn)this.b()).getDifficulty().getDifficultyId();
   }

   @JSFunction(value = "getGameType", description = "Gets the game type/mode of the player", returns = "The game type ID")
   public int getValue_3() {
      return ((S07PacketRespawn)this.b()).getGameType().getID();
   }

   @JSFunction(value = "getWorldType", description = "Gets the world type of the dimension", returns = "The world type ID")
   public int getValue_4() {
      return ((S07PacketRespawn)this.b()).getWorldType().getWorldTypeID();
   }
}
