package rip.breeze;

import net.minecraft.network.play.server.S2EPacketCloseWindow;

@ScriptObject(name = "S2EPacketCloseWindow", superName = "Packet", group = "net/minecraft/network/server")
public class Lambda extends PacketUtil14<S2EPacketCloseWindow> {
   public Lambda(S2EPacketCloseWindow var1) {
      super(var1);
   }
}
