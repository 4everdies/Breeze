package rip.breeze;

import net.minecraft.network.play.server.S2CPacketSpawnGlobalEntity;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S2CPacketSpawnGlobalEntity",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent when a global entity (like lightning) is spawned"
)
public class EntityUtil1 extends PacketUtil14<S2CPacketSpawnGlobalEntity> {
   public EntityUtil1(S2CPacketSpawnGlobalEntity var1) {
      super(var1);
   }

   @JSFunction(value = "getEntityId", description = "Gets the ID of the spawned global entity", returns = "The entity ID")
   public int getValue() {
      return ((S2CPacketSpawnGlobalEntity)this.b()).func_149052_c();
   }

   @JSFunction(value = "getX", description = "Gets the X position of the global entity", returns = "The X coordinate")
   public int getValue_2() {
      return ((S2CPacketSpawnGlobalEntity)this.b()).func_149051_d();
   }

   @JSFunction(value = "getY", description = "Gets the Y position of the global entity", returns = "The Y coordinate")
   public int getValue_3() {
      return ((S2CPacketSpawnGlobalEntity)this.b()).func_149050_e();
   }

   @JSFunction(value = "getZ", description = "Gets the Z position of the global entity", returns = "The Z coordinate")
   public int getValue_4() {
      return ((S2CPacketSpawnGlobalEntity)this.b()).func_149049_f();
   }

   @JSFunction(value = "getType", description = "Gets the type ID of the global entity (1 = thunderbolt)", returns = "The global entity type ID")
   public int getValue_5() {
      return ((S2CPacketSpawnGlobalEntity)this.b()).func_149053_g();
   }
}
