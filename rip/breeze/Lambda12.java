package rip.breeze;

import net.minecraft.network.play.client.C03PacketPlayer.C06PacketPlayerPosLook;
import org.mozilla.javascript.annotations.JSConstructor;

@ScriptObject(name = "C06PacketPlayerPosition", group = "net/minecraft/network/client", superName = "C03PacketPlayer")
public class Lambda12 extends RotationUtil5 {
   @JSConstructor
   public Lambda12(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      super(new C06PacketPlayerPosLook(var1, var3, var5, var7, var8, var9));
   }

   public Lambda12(C06PacketPlayerPosLook var1) {
      super(var1);
   }
}
