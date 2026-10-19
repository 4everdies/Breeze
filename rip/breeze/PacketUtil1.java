package rip.breeze;

import net.minecraft.network.play.server.S19PacketEntityStatus;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.BreezeClient;

@ScriptObject(
   name = "S1APacketEntityStatus",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that contains status information about an entity"
)
public class PacketUtil1 extends PacketUtil14<S19PacketEntityStatus> {
   public PacketUtil1(S19PacketEntityStatus var1) {
      super(var1);
   }

   @JSFunction(value = "getEntity", description = "Gets the entity this status packet is about", returns = "The entity instance")
   public RotationUtils getRotationUtils() {
      return StringBuilderUtil.getDataBuilder12(((S19PacketEntityStatus)this.i).getEntity(BreezeClient.CONST_A.theWorld));
   }

   @JSFunction(value = "getOpCode", description = "Gets the operation code that indicates what status change occurred", returns = "The status operation code")
   public int getValue() {
      return ((S19PacketEntityStatus)this.i).getOpCode();
   }
}
