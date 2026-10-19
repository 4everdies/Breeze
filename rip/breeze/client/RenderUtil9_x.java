package rip.breeze.client;

import net.minecraft.client.Minecraft;
import rip.breeze.KeepParameters;

public class RenderUtil9_x {
   static final Minecraft CONST_A = Minecraft.getMinecraft();

   @KeepParameters
   public static float getFloat() {
      return MinecraftAccessor.getTimer(CONST_A).renderPartialTicks;
   }
}
