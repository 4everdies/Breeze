package rip.breeze;

import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S08PacketPlayerPosLook",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that updates the player's position and rotation"
)
public class RotationUtil3 extends PacketUtil14<S08PacketPlayerPosLook> {
   public RotationUtil3(S08PacketPlayerPosLook var1) {
      super(var1);
   }

   @JSFunction(value = "getX", description = "Gets the X position of the player", returns = "The X coordinate")
   public double getDouble() {
      return ((S08PacketPlayerPosLook)this.b()).getX();
   }

   @JSFunction(value = "getY", description = "Gets the Y position of the player", returns = "The Y coordinate")
   public double getDouble_2() {
      return ((S08PacketPlayerPosLook)this.b()).getY();
   }

   @JSFunction(value = "getZ", description = "Gets the Z position of the player", returns = "The Z coordinate")
   public double getDouble_3() {
      return ((S08PacketPlayerPosLook)this.b()).getZ();
   }

   @JSFunction(value = "getYaw", description = "Gets the yaw rotation of the player", returns = "The yaw angle in degrees")
   public double getDouble_4() {
      return ((S08PacketPlayerPosLook)this.b()).getYaw();
   }

   @JSFunction(value = "getPitch", description = "Gets the pitch rotation of the player", returns = "The pitch angle in degrees")
   public double getDouble_5() {
      return ((S08PacketPlayerPosLook)this.b()).getPitch();
   }
}
