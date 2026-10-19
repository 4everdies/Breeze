package rip.breeze;

import net.minecraft.network.play.client.C03PacketPlayer;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "C03PacketPlayer",
   superName = "Packet",
   group = "net/minecraft/network/client",
   description = "A packet sent by the client to update the player's position and/or rotation."
)
public class RotationUtil5 extends PacketUtil14<C03PacketPlayer> {
   @JSConstructor(description = "Creates a new C03PacketPlayer", params = "Whether the player is on ground")
   public RotationUtil5(boolean var1) {
      super(new C03PacketPlayer(var1));
   }

   public RotationUtil5(C03PacketPlayer var1) {
      super(var1);
   }

   @JSFunction(value = "getPositionX", description = "Gets the X position", returns = "The X position")
   public double getDouble() {
      return ((C03PacketPlayer)this.i).getPositionX();
   }

   @JSFunction(value = "getPositionY", description = "Gets the Y position", returns = "The Y position")
   public double getDouble_2() {
      return ((C03PacketPlayer)this.i).getPositionY();
   }

   @JSFunction(value = "getPositionZ", description = "Gets the Z position", returns = "The Z position")
   public double getDouble_3() {
      return ((C03PacketPlayer)this.i).getPositionZ();
   }

   @JSFunction(value = "getYaw", description = "Gets the yaw rotation", returns = "The yaw rotation")
   public double getDouble_4() {
      return ((C03PacketPlayer)this.i).getYaw();
   }

   @JSFunction(value = "getPitch", description = "Gets the pitch rotation", returns = "The pitch rotation")
   public double getDouble_5() {
      return ((C03PacketPlayer)this.i).getPitch();
   }

   @JSFunction(value = "isOnGround", description = "Checks if the player is on ground", returns = "True if the player is on ground")
   public boolean isValid() {
      return ((C03PacketPlayer)this.i).isOnGround();
   }

   @JSFunction(value = "isMoving", description = "Checks if the player is moving", returns = "True if the player is moving")
   public boolean isValid_2() {
      return ((C03PacketPlayer)this.i).isMoving();
   }

   @JSFunction(value = "getRotating", description = "Checks if the player is rotating", returns = "True if the player is rotating")
   public boolean isValid_3() {
      return ((C03PacketPlayer)this.i).getRotating();
   }

   @JSFunction(value = "setPosition", description = "Sets the player position", params = {"The X position", "The Y position", "The Z position"})
   public void update(double var1, double var3, double var5) {
      MinecraftAccessor.initialize_51((C03PacketPlayer)this.i, var1);
      MinecraftAccessor.initialize_60((C03PacketPlayer)this.i, var3);
      MinecraftAccessor.initialize_20((C03PacketPlayer)this.i, var5);
   }

   @JSFunction(value = "setRotations", description = "Sets the player rotation", params = {"The yaw rotation", "The pitch rotation"})
   public void update_1(float var1, float var2) {
      MinecraftAccessor.initialize_62((C03PacketPlayer)this.i, var1);
      MinecraftAccessor.initialize_61((C03PacketPlayer)this.i, var2);
   }

   @JSFunction(value = "setOnGround", description = "Sets if the player is on ground", params = "True to set the player on ground")
   public void initialize(boolean var1) {
      MinecraftAccessor.initialize_31((C03PacketPlayer)this.i, var1);
   }
}
