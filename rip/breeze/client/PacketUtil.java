package rip.breeze.client;

import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;

final class PacketUtil {
   final Packet packet_a;
   final NetworkManager networkManager_b;
   final EnumType19 enum_IN_c;

   PacketUtil(Packet<?> var1, NetworkManager var2, EnumType19 var3) {
      this.packet_a = var1;
      this.networkManager_b = var2;
      this.enum_IN_c = var3;
   }
}
