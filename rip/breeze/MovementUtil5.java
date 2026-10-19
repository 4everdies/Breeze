package rip.breeze;

import net.minecraft.network.play.server.S0FPacketSpawnMob;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S0FPacketSpawnMob",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent when a mob entity is spawned"
)
public class MovementUtil5 extends PacketUtil14<S0FPacketSpawnMob> {
   public MovementUtil5(S0FPacketSpawnMob var1) {
      super(var1);
   }

   @JSFunction(value = "getEntityID", description = "Gets the ID of the spawned mob entity", returns = "The entity ID")
   public int getValue() {
      return ((S0FPacketSpawnMob)this.b()).getEntityID();
   }

   @JSFunction(
      value = "getEntityType",
      description = "Gets the type ID of the spawned mob",
      returns = "The mob type ID",
      see = "https://minecraft.fandom.com/wiki/Java_Edition_data_values/Pre-flattening/Entity_IDs"
   )
   public int getValue_2() {
      return ((S0FPacketSpawnMob)this.b()).getEntityType();
   }

   @JSFunction(value = "getX", description = "Gets the X position of the mob", returns = "The X coordinate")
   public int getValue_3() {
      return ((S0FPacketSpawnMob)this.b()).getX();
   }

   @JSFunction(value = "getY", description = "Gets the Y position of the mob", returns = "The Y coordinate")
   public int getValue_4() {
      return ((S0FPacketSpawnMob)this.b()).getY();
   }

   @JSFunction(value = "getZ", description = "Gets the Z position of the mob", returns = "The Z coordinate")
   public int getValue_5() {
      return ((S0FPacketSpawnMob)this.b()).getZ();
   }

   @JSFunction(value = "getVelocityX", description = "Gets the X velocity of the mob", returns = "The X velocity")
   public int getValue_6() {
      return ((S0FPacketSpawnMob)this.b()).getVelocityX();
   }

   @JSFunction(value = "getVelocityY", description = "Gets the Y velocity of the mob", returns = "The Y velocity")
   public int getValue_7() {
      return ((S0FPacketSpawnMob)this.b()).getVelocityY();
   }

   @JSFunction(value = "getVelocityZ", description = "Gets the Z velocity of the mob", returns = "The Z velocity")
   public int getValue_8() {
      return ((S0FPacketSpawnMob)this.b()).getVelocityZ();
   }

   @JSFunction(value = "getPitch", description = "Gets the pitch rotation of the mob in degrees", returns = "The pitch angle")
   public float calculateFloat() {
      return ((S0FPacketSpawnMob)this.i).getPitch() * 360 / 256.0F;
   }

   @JSFunction(value = "getHeadPitch", description = "Gets the head pitch rotation of the mob in degrees", returns = "The head pitch angle")
   public float calculateFloat_2() {
      return ((S0FPacketSpawnMob)this.i).getHeadPitch() * 360 / 256.0F;
   }

   @JSFunction(value = "getYaw", description = "Gets the yaw rotation of the mob in degrees", returns = "The yaw angle")
   public float calculateFloat_3() {
      return ((S0FPacketSpawnMob)this.i).getYaw() * 360 / 256.0F;
   }
}
