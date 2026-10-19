package rip.breeze;

import net.minecraft.network.play.server.S3FPacketCustomPayload;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S3FPacketCustomPayload",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a custom payload packet sent from the server"
)
public class Packet extends PacketUtil14<S3FPacketCustomPayload> {
   public Packet(S3FPacketCustomPayload var1) {
      super(var1);
   }

   @JSFunction(value = "getChannelName", description = "Gets the channel name for this custom payload", returns = "The channel name")
   @Override
   public String getString() {
      return ((S3FPacketCustomPayload)this.b()).getChannelName();
   }

   @JSFunction(value = "getBufferData", description = "Gets the custom payload data as a byte array", returns = "The payload data bytes")
   public byte[] getBytes() {
      return ((S3FPacketCustomPayload)this.b()).getBufferData().readByteArray();
   }
}
