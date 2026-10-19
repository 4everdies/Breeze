package rip.breeze;

import net.minecraft.network.play.server.S14PacketEntity;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.BreezeClient;

@ScriptObject(
   name = "S14PacketEntity",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that contains entity movement information"
)
public class RotationUtil4 extends PacketUtil14<S14PacketEntity> {
   public RotationUtil4(S14PacketEntity var1) {
      super(var1);
   }

   @JSFunction(value = "getEntity", description = "Gets the entity this movement packet is about", returns = "The entity instance")
   public RotationUtils getRotationUtils() {
      return StringBuilderUtil.getDataBuilder12(((S14PacketEntity)this.i).getEntity(BreezeClient.CONST_A.theWorld));
   }

   @JSFunction(value = "getX", description = "Gets the relative X movement", returns = "The X movement delta")
   public double getDouble() {
      return ((S14PacketEntity)this.b()).func_149062_c();
   }

   @JSFunction(value = "getY", description = "Gets the relative Y movement", returns = "The Y movement delta")
   public double getDouble_2() {
      return ((S14PacketEntity)this.b()).func_149061_d();
   }

   @JSFunction(value = "getZ", description = "Gets the relative Z movement", returns = "The Z movement delta")
   public double getDouble_3() {
      return ((S14PacketEntity)this.b()).func_149064_e();
   }

   @JSFunction(value = "getYaw", description = "Gets the yaw rotation in degrees", returns = "The yaw angle")
   public double calculateDouble() {
      return ((S14PacketEntity)this.i).func_149060_h()
         ? ((S14PacketEntity)this.i).func_149066_f() * 360 / 256.0F
         : ((S14PacketEntity)this.i).getEntity(BreezeClient.CONST_A.theWorld).rotationYaw;
   }

   @JSFunction(value = "getPitch", description = "Gets the pitch rotation in degrees", returns = "The pitch angle")
   public double calculateDouble_2() {
      return ((S14PacketEntity)this.i).func_149060_h()
         ? ((S14PacketEntity)this.i).func_149063_g() * 360 / 256.0F
         : ((S14PacketEntity)this.i).getEntity(BreezeClient.CONST_A.theWorld).rotationPitch;
   }

   @JSFunction(value = "getOnGround", description = "Checks if the entity is on ground", returns = "True if the entity is on ground, false otherwise")
   public boolean isValid() {
      return ((S14PacketEntity)this.b()).func_149060_h();
   }
}
