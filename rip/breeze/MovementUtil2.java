package rip.breeze;

import net.minecraft.network.play.server.S2APacketParticles;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S2APacketParticles",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent when particles need to be spawned"
)
public class MovementUtil2 extends PacketUtil14<S2APacketParticles> {
   public MovementUtil2(S2APacketParticles var1) {
      super(var1);
   }

   @JSFunction(
      value = "isLongDistance",
      description = "Checks if the particle effect is rendered from a long distance",
      returns = "true if long distance, false otherwise"
   )
   public boolean getDistance() {
      return ((S2APacketParticles)this.b()).isLongDistance();
   }

   @JSFunction(value = "getXCoordinate", description = "Gets the X coordinate where the particles spawn", returns = "The X coordinate")
   public double getDouble() {
      return ((S2APacketParticles)this.b()).getXCoordinate();
   }

   @JSFunction(value = "getYCoordinate", description = "Gets the Y coordinate where the particles spawn", returns = "The Y coordinate")
   public double getDouble_2() {
      return ((S2APacketParticles)this.b()).getYCoordinate();
   }

   @JSFunction(value = "getZCoordinate", description = "Gets the Z coordinate where the particles spawn", returns = "The Z coordinate")
   public double getDouble_3() {
      return ((S2APacketParticles)this.b()).getZCoordinate();
   }

   @JSFunction(value = "getXOffset", description = "Gets the X offset for particle randomization", returns = "The X offset")
   public double getDouble_4() {
      return ((S2APacketParticles)this.b()).getXOffset();
   }

   @JSFunction(value = "getYOffset", description = "Gets the Y offset for particle randomization", returns = "The Y offset")
   public double getDouble_5() {
      return ((S2APacketParticles)this.b()).getYOffset();
   }

   @JSFunction(value = "getZOffset", description = "Gets the Z offset for particle randomization", returns = "The Z offset")
   public double getDouble_6() {
      return ((S2APacketParticles)this.b()).getZOffset();
   }

   @JSFunction(value = "getParticleSpeed", description = "Gets the speed of the particles", returns = "The particle speed")
   public float getFloat() {
      return ((S2APacketParticles)this.b()).getParticleSpeed();
   }

   @JSFunction(value = "getParticleArgs", description = "Gets additional arguments for particle effects", returns = "Array of particle arguments")
   public int[] values() {
      return ((S2APacketParticles)this.b()).getParticleArgs();
   }
}
