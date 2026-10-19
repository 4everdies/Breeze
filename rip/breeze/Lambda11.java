package rip.breeze;

import net.minecraft.network.play.client.C03PacketPlayer.C05PacketPlayerLook;
import org.mozilla.javascript.annotations.JSConstructor;

@ScriptObject(
   name = "C05PacketPlayerLook",
   superName = "C03PacketPlayer",
   group = "net/minecraft/network/client",
   description = "A packet sent by the client to update the player's rotation",
   example = "var packet = new C05PacketPlayerLook(180, 90, true); // Create a packet for looking straight down"
)
public class Lambda11 extends RotationUtil5 {
   @JSConstructor(
      description = "Creates a new C05PacketPlayerLook with rotation values",
      params = {"The yaw rotation (-180 to 180)", "The pitch rotation (-90 to 90)", "Whether the player is on ground"}
   )
   public Lambda11(float var1, float var2, boolean var3) {
      super(new C05PacketPlayerLook(var1, var2, var3));
   }

   public Lambda11(C05PacketPlayerLook var1) {
      super(var1);
   }
}
