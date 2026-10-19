package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Comparator;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

public class BlockUtil7 {
   private static boolean fieldBool_b;

   public static AxisAlignedBB getHitbox(Entity var0, double var1) {
      return var0.getEntityBoundingBox()
         .offset(
            (var0.posX - var0.lastTickPosX) * var1 - (var0.posX - var0.lastTickPosX),
            (var0.posY - var0.lastTickPosY) * var1 - (var0.posY - var0.lastTickPosY),
            (var0.posZ - var0.lastTickPosZ) * var1 - (var0.posZ - var0.lastTickPosZ)
         )
         .expand(0.1, 0.1, 0.1);
   }

   public static Vec3 getVec3(Entity var0, double var1) {
      return new Vec3(
         var0.lastTickPosX + (var0.posX - var0.lastTickPosX) * var1,
         var0.lastTickPosY + (var0.posY - var0.lastTickPosY) * var1,
         var0.lastTickPosZ + (var0.posZ - var0.lastTickPosZ) * var1
      );
   }

   public static double calculateDouble(double var0, double var2) {
      return var2 + (var0 - var2) * MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks;
   }

   public static Vec3 getVec3_2(AxisAlignedBB var0) {
      return new Vec3(var0.minX + (var0.maxX - var0.minX) * 0.5, var0.minY + (var0.maxY - var0.minY) * 0.5, var0.minZ + (var0.maxZ - var0.minZ) * 0.5);
   }

   public static float clamp(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public static int clamp_2(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public static double clamp_3(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static Vec3 rayTrace(Vec3 var0, AxisAlignedBB var1) {
      long var2 = 26905213233160L;
      double var4 = var1.maxY - var1.minY;
      double var6 = (var1.maxX - var1.minX) * 0.5;
      double var8 = (var1.minX + var1.maxX) * 0.5;
      double var10 = (var1.minZ + var1.maxZ) * 0.5;
      Vec3[] var12 = new Vec3[]{
         new Vec3(var8, var1.minY + var4 * 0.9, var10),
         new Vec3(var8, var1.minY + var4 * 0.8, var10),
         new Vec3(var8, var1.minY + var4 * 0.7, var10),
         new Vec3(var8, var1.minY + var4 * 0.6, var10),
         new Vec3(var8, var1.minY + var4 * 0.5, var10),
         new Vec3(var8, var1.minY + var4 * 0.4, var10),
         new Vec3(var8, var1.minY + var4 * 0.3, var10),
         new Vec3(var8, var1.minY + var4 * 0.2, var10),
         new Vec3(var8, var1.minY + var4 * 0.1, var10)
      };
      boolean var10000 = checkCondition();
      Arrays.sort(var12, Comparator.comparingDouble(var0::func_72438_d));
      Vec3[] var13 = var12;
      int var14 = var13.length;
      boolean var15 = var10000;
      int var16 = 0;

      while (var16 < var14) {
         Vec3 var17 = var13[var16];
         if (BreezeClient.CONST_A.theWorld.rayTraceBlocks(var0, var17, false) == null) {
            return var17;
         }

         var16++;
         if (var15) {
            LicenseState.toggle(LicenseState.isValid_2());
            break;
         }
      }

      var13 = new Vec3[]{
         new Vec3(var8 - var6 * 0.9, var1.minY + var4 * 0.9, var10 - var6 * 0.9),
         new Vec3(var8 + var6 * 0.9, var1.minY + var4 * 0.9, var10 - var6 * 0.9),
         new Vec3(var8 - var6 * 0.9, var1.minY + var4 * 0.9, var10 + var6 * 0.9),
         new Vec3(var8 + var6 * 0.9, var1.minY + var4 * 0.9, var10 + var6 * 0.9),
         new Vec3(var8 - var6 * 0.9, var1.minY + var4 * 0.5, var10 - var6 * 0.9),
         new Vec3(var8 + var6 * 0.9, var1.minY + var4 * 0.5, var10 - var6 * 0.9),
         new Vec3(var8 - var6 * 0.9, var1.minY + var4 * 0.5, var10 + var6 * 0.9),
         new Vec3(var8 + var6 * 0.9, var1.minY + var4 * 0.5, var10 + var6 * 0.9),
         new Vec3(var8 - var6 * 0.9, var1.minY + var4 * 0.1, var10 - var6 * 0.9),
         new Vec3(var8 + var6 * 0.9, var1.minY + var4 * 0.1, var10 - var6 * 0.9),
         new Vec3(var8 - var6 * 0.9, var1.minY + var4 * 0.1, var10 + var6 * 0.9),
         new Vec3(var8 + var6 * 0.9, var1.minY + var4 * 0.1, var10 + var6 * 0.9)
      };
      Arrays.sort(var13, Comparator.comparingDouble(var0::func_72438_d));

      for (Vec3 var18 : var13) {
         if (BreezeClient.CONST_A.theWorld.rayTraceBlocks(var0, var18, false) == null) {
            return var18;
         }

         if (var15) {
            break;
         }
      }

      Vec3[] var22 = new Vec3[]{
         new Vec3(var8 - var6 * 0.95, var1.minY + var4 * 0.95, var10 - var6 * 0.95),
         new Vec3(var8 + var6 * 0.95, var1.minY + var4 * 0.95, var10 - var6 * 0.95),
         new Vec3(var8 - var6 * 0.95, var1.minY + var4 * 0.95, var10 + var6 * 0.95),
         new Vec3(var8 + var6 * 0.95, var1.minY + var4 * 0.95, var10 + var6 * 0.95),
         new Vec3(var8 - var6 * 0.95, var1.minY + var4 * 0.5, var10 - var6 * 0.95),
         new Vec3(var8 + var6 * 0.95, var1.minY + var4 * 0.5, var10 - var6 * 0.95),
         new Vec3(var8 - var6 * 0.95, var1.minY + var4 * 0.5, var10 + var6 * 0.95),
         new Vec3(var8 + var6 * 0.95, var1.minY + var4 * 0.5, var10 + var6 * 0.95),
         new Vec3(var8 - var6 * 0.95, var1.minY + var4 * 0.1, var10 - var6 * 0.95),
         new Vec3(var8 + var6 * 0.95, var1.minY + var4 * 0.05, var10 - var6 * 0.95),
         new Vec3(var8 - var6 * 0.95, var1.minY + var4 * 0.05, var10 + var6 * 0.95),
         new Vec3(var8 + var6 * 0.95, var1.minY + var4 * 0.05, var10 + var6 * 0.95)
      };
      Arrays.sort(var22, Comparator.comparingDouble(var0::func_72438_d));

      for (Vec3 var19 : var22) {
         if (BreezeClient.CONST_A.theWorld.rayTraceBlocks(var0, var19, false) == null) {
            return var19;
         }

         if (var15) {
            break;
         }
      }

      return null;
   }

   public static void toggle(boolean var0) {
      fieldBool_b = var0;
   }

   public static boolean isValid() {
      return fieldBool_b;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid();
      return !var0;
   }

   static {
      if (checkCondition()) {
         toggle(true);
      }
   }
}
