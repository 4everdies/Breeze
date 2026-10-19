package rip.breeze;

import net.minecraft.network.play.client.C0APacketAnimation;
import org.mozilla.javascript.annotations.JSConstructor;

@ScriptObject(name = "C0APacketAnimation", superName = "Packet", group = "net/minecraft/network/client")
public class Lambda13 extends PacketUtil14<C0APacketAnimation> {
   @JSConstructor
   public Lambda13() {
      super(new C0APacketAnimation());
   }

   public Lambda13(C0APacketAnimation var1) {
      super(var1);
   }
}
