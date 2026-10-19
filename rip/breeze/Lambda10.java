package rip.breeze;

import net.minecraft.network.play.client.C03PacketPlayer.C04PacketPlayerPosition;
import org.mozilla.javascript.annotations.JSConstructor;

@ScriptObject(
   name = "C04PacketPlayerPosition",
   superName = "C03PacketPlayer",
   group = "net/minecraft/network/client",
   description = "Packet sent by the client to update the player's position",
   example = "var packet = new C04PacketPlayerPosition(0, 64, 0, true); // Create a packet for teleporting to 0,64,0"
)
public class Lambda10 extends RotationUtil5 {
   @JSConstructor(
      description = "Creates a new C04PacketPlayerPosition with the specified position",
      params = {"The X position", "The Y position", "The Z position", "Whether the player is on ground"}
   )
   public Lambda10(double var1, double var3, double var5, boolean var7) {
      super(new C04PacketPlayerPosition(var1, var3, var5, var7));
   }

   public Lambda10(C04PacketPlayerPosition var1) {
      super(var1);
   }
}
