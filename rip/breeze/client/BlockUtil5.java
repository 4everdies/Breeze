package rip.breeze.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;

public class BlockUtil5 {
   AxisAlignedBB axisAlignedBB_a;
   long fieldLong_b;
   float fieldFloat_c;
   float fieldFloat_d;
   float fieldFloat_e;

   public BlockUtil5(EntityPlayer var1) {
      this.axisAlignedBB_a = BlockUtil7.getHitbox(var1, MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks);
      this.fieldLong_b = System.currentTimeMillis();
      this.fieldFloat_c = (float)(var1.prevPosX - var1.posX);
      this.fieldFloat_d = (float)(var1.prevPosY - var1.posY);
      this.fieldFloat_e = (float)(var1.prevPosZ - var1.posZ);
   }
}
