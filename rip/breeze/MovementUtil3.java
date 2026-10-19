package rip.breeze;

import net.minecraft.network.play.client.C0CPacketInput;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "C0CPacketInput",
   superName = "Packet",
   description = "Packet sent by the client to update player movement input",
   example = "var packet = new C0CPacketInput(0, 1, true, false); // Create a packet for moving forward and jumping",
   group = "net/minecraft/network/client"
)
public class MovementUtil3 extends PacketUtil14<C0CPacketInput> {
   public MovementUtil3(C0CPacketInput var1) {
      super(var1);
   }

   @JSConstructor(
      description = "Creates a new C0CPacketInput with the specified movement values",
      params = {"The strafe speed (-1.0 to 1.0)", "The forward speed (-1.0 to 1.0)", "Whether the player is jumping", "Whether the player is sneaking"}
   )
   public MovementUtil3(float var1, float var2, boolean var3, boolean var4) {
      super(new C0CPacketInput(var1, var2, var3, var4));
   }

   @JSFunction(value = "getStrafe", description = "Gets the strafe speed", returns = "The strafe speed (-1.0 to 1.0)")
   public float getFloat() {
      return ((C0CPacketInput)this.i).getStrafeSpeed();
   }

   @JSFunction(value = "getForward", description = "Gets the forward speed", returns = "The forward speed (-1.0 to 1.0)")
   public float getFloat_2() {
      return ((C0CPacketInput)this.i).getForwardSpeed();
   }

   @JSFunction(value = "isJumping", description = "Checks if jumping is enabled", returns = "True if the player is jumping")
   public boolean isValid() {
      return ((C0CPacketInput)this.i).isJumping();
   }

   @JSFunction(value = "isSneaking", description = "Checks if sneaking is enabled", returns = "True if the player is sneaking")
   public boolean isValid_2() {
      return ((C0CPacketInput)this.i).isSneaking();
   }

   @JSFunction(value = "setStrafe", description = "Sets the strafe speed", params = "The new strafe speed (-1.0 to 1.0)")
   public void initialize(float var1) {
      MinecraftAccessor.initialize_75((C0CPacketInput)this.i, var1);
   }

   @JSFunction(value = "setForward", description = "Sets the forward speed", params = "The new forward speed (-1.0 to 1.0)")
   public void initialize_2(float var1) {
      MinecraftAccessor.initialize_6((C0CPacketInput)this.i, var1);
   }

   @JSFunction(value = "setJumping", description = "Sets the jumping state", params = "Whether jumping should be enabled")
   public void initialize_3(boolean var1) {
      MinecraftAccessor.initialize_77((C0CPacketInput)this.i, var1);
   }

   @JSFunction(value = "setSneaking", description = "Sets the sneaking state", params = "Whether sneaking should be enabled")
   public void initialize_4(boolean var1) {
      MinecraftAccessor.initialize_10((C0CPacketInput)this.i, var1);
   }
}
