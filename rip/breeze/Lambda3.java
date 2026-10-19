package rip.breeze;

import net.minecraft.network.play.server.S00PacketKeepAlive;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S00PacketKeepAlive",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a keep-alive packet sent from the server to verify client connectivity"
)
public class Lambda3 extends PacketUtil14<S00PacketKeepAlive> {
   public Lambda3(S00PacketKeepAlive var1) {
      super(var1);
   }

   @JSFunction(value = "getId", description = "Gets the keep-alive ID number", returns = "The keep-alive ID")
   public int getValue() {
      return ((S00PacketKeepAlive)this.b()).func_149134_c();
   }
}
