package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import rip.breeze.StringDecryptor;

public class TargetUtil {
   List<Vec3> list_a;

   public TargetUtil(EntityPlayer var1) {
      long var2 = 42027606251545L;
      int[] var10000 = AimAssist.getStateArray();
      super();
      int[] var4 = var10000;
      this.list_a = new ArrayList<>();
      AxisAlignedBB[] var5 = BlockUtil10.getPredictedHitboxes(var1, 40);

      for (AxisAlignedBB var9 : var5) {
         this.list_a.add(BlockUtil7.getVec3_2(var9).addVector(0.0, 0.3, 0.0));
         if (var4 == null) {
            break;
         }
      }
   }
}
