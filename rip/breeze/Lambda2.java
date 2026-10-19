package rip.breeze;

import io.netty.buffer.Unpooled;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import org.mozilla.javascript.annotations.JSConstructor;

@ScriptObject(
   name = "C17PacketCustomPayload",
   superName = "Packet",
   group = "net/minecraft/network/client",
   description = "Packet for sending custom plugin messages to the server"
)
public class Lambda2 extends PacketUtil14<C17PacketCustomPayload> {
   public Lambda2(C17PacketCustomPayload var1) {
      super(var1);
   }

   @JSConstructor(
      description = "Creates a new custom payload packet",
      params = {"The plugin message channel", "The payload data as a string", "Whether to include string length"}
   )
   public Lambda2(String var1, String var2, boolean var3) {
      super(
         new C17PacketCustomPayload(
            var1, var3 ? new PacketBuffer(Unpooled.buffer()).writeString(var2) : new PacketBuffer(Unpooled.buffer().writeBytes(var2.getBytes()))
         )
      );
   }
}
