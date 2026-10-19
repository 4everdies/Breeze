package rip.breeze;

import net.minecraft.network.play.server.S06PacketUpdateHealth;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S06PacketUpdateHealth",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that updates the player's health, food, and saturation levels"
)
public class PacketUtil8 extends PacketUtil14<S06PacketUpdateHealth> {
   public PacketUtil8(S06PacketUpdateHealth var1) {
      super(var1);
   }

   @JSFunction(value = "getHealth", description = "Gets the player's health value", returns = "The health points")
   public float getFloat() {
      return ((S06PacketUpdateHealth)this.b()).getHealth();
   }

   @JSFunction(value = "getFoodLevel", description = "Gets the player's food level", returns = "The food level points")
   public float getFloat_2() {
      return ((S06PacketUpdateHealth)this.b()).getFoodLevel();
   }

   @JSFunction(value = "getSaturationLevel", description = "Gets the player's food saturation level", returns = "The saturation level")
   public float getFloat_3() {
      return ((S06PacketUpdateHealth)this.b()).getSaturationLevel();
   }
}
