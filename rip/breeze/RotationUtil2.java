package rip.breeze;

import net.minecraft.network.play.server.S19PacketEntityHeadLook;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.BreezeClient;

@ScriptObject(
   name = "S19PacketEntityHeadLook",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet sent when an entity's head rotation changes"
)
public class RotationUtil2 extends PacketUtil14<S19PacketEntityHeadLook> {
   public RotationUtil2(S19PacketEntityHeadLook var1) {
      super(var1);
   }

   @JSFunction(value = "getEntity", description = "Gets the entity whose head rotation changed", returns = "The entity instance")
   public RotationUtils getRotationUtils() {
      return StringBuilderUtil.getDataBuilder12(((S19PacketEntityHeadLook)this.i).getEntity(BreezeClient.CONST_A.theWorld));
   }

   @JSFunction(value = "getHeadYaw", description = "Gets the new head yaw rotation in degrees", returns = "The head yaw angle")
   public float calculateFloat() {
      return ((S19PacketEntityHeadLook)this.i).getYaw() * 360 / 256.0F;
   }
}
