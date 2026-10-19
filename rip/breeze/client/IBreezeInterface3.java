package rip.breeze.client;

import java.util.ArrayList;
import net.minecraft.network.Packet;

public interface IBreezeInterface3 {
   EnumType27 onPacketSend(Packet<?> var1, boolean var2);

   EnumType27 onPacketReceive(Packet<?> var1, boolean var2);

   void processPacketQueue(ArrayList<DelayedPacket> var1);
}
