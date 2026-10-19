package rip.breeze;

import net.minecraft.network.play.server.S0CPacketSpawnPlayer;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(name = "S0CPacketSpawnPlayer", superName = "Packet", group = "net/minecraft/network/server")
public class EntityUtil3 extends PacketUtil14<S0CPacketSpawnPlayer> {
   public EntityUtil3(S0CPacketSpawnPlayer var1) {
      super(var1);
   }

   @JSFunction(value = "getEntityID", description = "Gets the ID of the spawned player entity.")
   public int getValue() {
      return ((S0CPacketSpawnPlayer)this.b()).getEntityID();
   }

   @JSFunction(value = "getPlayer", returns = "The UUID of the spawned player.")
   @Override
   public String getString() {
      return ((S0CPacketSpawnPlayer)this.b()).getPlayer().toString();
   }

   @JSFunction(value = "getX", description = "Gets the X coordinate of the spawned player, divided by 32 for block position.")
   public double calculateDouble() {
      return ((S0CPacketSpawnPlayer)this.b()).getX() / 32.0;
   }

   @JSFunction(value = "getY", description = "Gets the Y coordinate of the spawned player, divided by 32 for block position.")
   public double calculateDouble_2() {
      return ((S0CPacketSpawnPlayer)this.b()).getY() / 32.0;
   }

   @JSFunction(value = "getZ", description = "Gets the Z coordinate of the spawned player, divided by 32 for block position.")
   public double calculateDouble_3() {
      return ((S0CPacketSpawnPlayer)this.b()).getZ() / 32.0;
   }

   @JSFunction(value = "getYaw", description = "Gets the yaw rotation of the spawned player, converted to degrees.")
   public float calculateFloat() {
      return ((S0CPacketSpawnPlayer)this.b()).getYaw() * 360 / 256.0F;
   }

   @JSFunction(value = "getPitch", description = "Gets the pitch rotation of the spawned player, converted to degrees.")
   public float calculateFloat_2() {
      return ((S0CPacketSpawnPlayer)this.b()).getPitch() * 360 / 256.0F;
   }

   @JSFunction(value = "getCurrentItemID", description = "Gets the ID of the item currently held by the spawned player.")
   public int getValue_2() {
      return ((S0CPacketSpawnPlayer)this.b()).getCurrentItemID();
   }
}
