package rip.breeze;

import net.minecraft.network.play.server.S01PacketJoinGame;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S01PacketJoinGame",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet sent when joining a game/server"
)
public class EntityUtil2 extends PacketUtil14<S01PacketJoinGame> {
   public EntityUtil2(S01PacketJoinGame var1) {
      super(var1);
   }

   @JSFunction(value = "getEntityId", description = "Gets the entity ID assigned to the player", returns = "The player's entity ID")
   public int getValue() {
      return ((S01PacketJoinGame)this.i).getEntityId();
   }

   @JSFunction(
      value = "isHardcoreMode",
      description = "Checks if the world is in hardcore mode",
      returns = "True if hardcore mode is enabled, false otherwise"
   )
   public boolean isValid() {
      return ((S01PacketJoinGame)this.i).isHardcoreMode();
   }

   @JSFunction(value = "getGameType", description = "Gets the game type/mode ID", returns = "The game type ID")
   public int getValue_2() {
      return ((S01PacketJoinGame)this.i).getGameType().getID();
   }

   @JSFunction(value = "getDimension", description = "Gets the dimension ID", returns = "The dimension ID")
   public int getValue_3() {
      return ((S01PacketJoinGame)this.i).getDimension();
   }

   @JSFunction(value = "getDifficulty", description = "Gets the difficulty level ID", returns = "The difficulty ID")
   public int getValue_4() {
      return ((S01PacketJoinGame)this.i).getDifficulty().getDifficultyId();
   }

   @JSFunction(value = "getMaxPlayers", description = "Gets the maximum number of players allowed", returns = "The max player count")
   public int getValue_5() {
      return ((S01PacketJoinGame)this.i).getMaxPlayers();
   }

   @JSFunction(value = "getWorldType", description = "Gets the world type ID", returns = "The world type ID")
   public int getValue_6() {
      return ((S01PacketJoinGame)this.i).getWorldType().getWorldTypeID();
   }

   @JSFunction(
      value = "isReducedDebugInfo",
      description = "Checks if reduced debug info is enabled",
      returns = "True if reduced debug info is enabled, false otherwise"
   )
   public boolean isValid_2() {
      return ((S01PacketJoinGame)this.i).isReducedDebugInfo();
   }
}
