package rip.breeze;

import net.minecraft.network.play.server.S18PacketEntityTeleport;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.BreezeClient;

@ScriptObject(
   name = "S18PacketEntityTeleport",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent when an entity teleports to a new position"
)
public class RotationUtil1 extends PacketUtil14<S18PacketEntityTeleport> {
   public RotationUtil1(S18PacketEntityTeleport var1) {
      super(var1);
   }

   @JSFunction(value = "getEntity", description = "Gets the entity that teleported", returns = "The teleported entity")
   public RotationUtils getRotationUtils() {
      return StringBuilderUtil.getDataBuilder12(BreezeClient.CONST_A.theWorld.getEntityByID(((S18PacketEntityTeleport)this.i).getEntityId()));
   }

   @JSFunction(value = "getX", description = "Gets the X coordinate the entity teleported to", returns = "The X coordinate")
   public double calculateDouble() {
      return ((S18PacketEntityTeleport)this.b()).getX() / 32.0;
   }

   @JSFunction(value = "getY", description = "Gets the Y coordinate the entity teleported to", returns = "The Y coordinate")
   public double calculateDouble_2() {
      return ((S18PacketEntityTeleport)this.b()).getY() / 32.0;
   }

   @JSFunction(value = "getZ", description = "Gets the Z coordinate the entity teleported to", returns = "The Z coordinate")
   public double calculateDouble_3() {
      return ((S18PacketEntityTeleport)this.b()).getZ() / 32.0;
   }

   @JSFunction(value = "getYaw", description = "Gets the yaw rotation of the entity in degrees", returns = "The yaw angle")
   public double calculateDouble_4() {
      return ((S18PacketEntityTeleport)this.b()).getYaw() * 360 / 256.0F;
   }

   @JSFunction(value = "getPitch", description = "Gets the pitch rotation of the entity in degrees", returns = "The pitch angle")
   public double calculateDouble_5() {
      return ((S18PacketEntityTeleport)this.b()).getPitch() * 360 / 256.0F;
   }

   @JSFunction(value = "getOnGround", description = "Checks if the entity is on ground after teleporting", returns = "true if on ground, false otherwise")
   public boolean isValid() {
      return ((S18PacketEntityTeleport)this.b()).getOnGround();
   }
}
