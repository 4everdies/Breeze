package rip.breeze;

import net.minecraft.network.play.server.S0EPacketSpawnObject;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S0EPacketSpawnObject",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent when an object/entity is spawned"
)
public class MovementUtil4 extends PacketUtil14<S0EPacketSpawnObject> {
   public MovementUtil4(S0EPacketSpawnObject var1) {
      super(var1);
   }

   @JSFunction(value = "getEntityID", description = "Gets the ID of the spawned entity", returns = "The entity ID")
   public int getValue() {
      return ((S0EPacketSpawnObject)this.b()).getEntityID();
   }

   @JSFunction(value = "getX", description = "Gets the X position of the entity", returns = "The X coordinate")
   public int getValue_2() {
      return ((S0EPacketSpawnObject)this.b()).getX();
   }

   @JSFunction(value = "getY", description = "Gets the Y position of the entity", returns = "The Y coordinate")
   public int getValue_3() {
      return ((S0EPacketSpawnObject)this.b()).getY();
   }

   @JSFunction(value = "getZ", description = "Gets the Z position of the entity", returns = "The Z coordinate")
   public int getValue_4() {
      return ((S0EPacketSpawnObject)this.b()).getZ();
   }

   @JSFunction(value = "getSpeedX", description = "Gets the X velocity of the entity", returns = "The X velocity")
   public int getValue_5() {
      return ((S0EPacketSpawnObject)this.b()).getSpeedX();
   }

   @JSFunction(value = "getSpeedY", description = "Gets the Y velocity of the entity", returns = "The Y velocity")
   public int getValue_6() {
      return ((S0EPacketSpawnObject)this.b()).getSpeedY();
   }

   @JSFunction(value = "getSpeedZ", description = "Gets the Z velocity of the entity", returns = "The Z velocity")
   public int getValue_7() {
      return ((S0EPacketSpawnObject)this.b()).getSpeedZ();
   }

   @JSFunction(value = "getPitch", description = "Gets the pitch rotation of the entity", returns = "The pitch angle")
   public int getValue_8() {
      return ((S0EPacketSpawnObject)this.b()).getPitch();
   }

   @JSFunction(value = "getYaw", description = "Gets the yaw rotation of the entity", returns = "The yaw angle")
   public int getValue_9() {
      return ((S0EPacketSpawnObject)this.b()).getYaw();
   }

   @JSFunction(value = "getType", description = "Gets the type ID of the spawned entity", returns = "The entity type ID")
   public int getValue_10() {
      return ((S0EPacketSpawnObject)this.b()).getType();
   }

   @JSFunction(value = "setX", description = "Sets the X position of the entity", params = "The new X coordinate")
   public void update(int var1) {
      ((S0EPacketSpawnObject)this.b()).setX(var1);
   }

   @JSFunction(value = "setY", description = "Sets the Y position of the entity", params = "The new Y coordinate")
   public void update_1(int var1) {
      ((S0EPacketSpawnObject)this.b()).setY(var1);
   }

   @JSFunction(value = "setZ", description = "Sets the Z position of the entity", params = "The new Z coordinate")
   public void update_2(int var1) {
      ((S0EPacketSpawnObject)this.b()).setZ(var1);
   }

   @JSFunction(value = "setSpeedX", description = "Sets the X velocity of the entity", params = "The new X velocity")
   public void update_3(int var1) {
      ((S0EPacketSpawnObject)this.b()).setSpeedX(var1);
   }

   @JSFunction(value = "setSpeedY", description = "Sets the Y velocity of the entity", params = "The new Y velocity")
   public void update_4(int var1) {
      ((S0EPacketSpawnObject)this.b()).setSpeedY(var1);
   }

   @JSFunction(value = "setSpeedZ", description = "Sets the Z velocity of the entity", params = "The new Z velocity")
   public void update_5(int var1) {
      ((S0EPacketSpawnObject)this.b()).setSpeedZ(var1);
   }
}
