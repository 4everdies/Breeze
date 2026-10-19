package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import rip.breeze.StringDecryptor;

public class BlockUtil10 {
   static double double_a;
   static double double_b;
   static double double_c;
   static boolean fieldBool_d;
   static boolean fieldBool_e;
   static boolean fieldBool_f;
   static boolean fieldBool_g;
   static boolean fieldBool_h;
   static boolean fieldBool_i;
   private static int[] arr_j;

   public static AxisAlignedBB getAxisAlignedBB(EntityLivingBase var0, int var1) {
      AxisAlignedBB[] var2 = getPredictedHitboxes(var0, var1);
      return var2[var2.length - 1];
   }

   public static AxisAlignedBB[] getPredictedHitboxes(EntityLivingBase var0, int var1) {
      return Arrays.stream(getHitPoints(var0, var1)).map(RangeValue::getAxisAlignedBB_j).toArray(BlockUtil10::lambda$predictedTargetBoxes_Inner0);
   }

   public static RangeValue[] getHitPoints(EntityLivingBase var0, int var1) {
      return getHitbox(var0, var1, 1.0);
   }

   public static RangeValue[] getHitbox(EntityLivingBase var0, int var1, double var2) {
      long var4 = 68188439096151L;
      boolean var10000 = BlockUtil7.checkCondition();
      RangeValue[] var6 = new RangeValue[var1 + 1];
      AxisAlignedBB var7 = var0.getEntityBoundingBox();
      double_a = var0.posX - var0.lastTickPosX;
      double_b = (var0.posY - var0.lastTickPosY - 0.08) * 0.98F;
      double_c = var0.posZ - var0.lastTickPosZ;
      boolean var8 = var10000;
      fieldBool_d = var0.onGround;
      fieldBool_e = var0.isCollidedHorizontally;
      fieldBool_f = var0.isCollidedVertically;
      fieldBool_g = var0.isCollided;
      if (var1 > 0 && !(Math.sqrt(double_a * double_a + double_c * double_c) > 5.0)) {
         double var9;
         float[] var11;
         label43: {
            var9 = Math.sqrt(Math.pow(double_a, 2.0) + Math.pow(double_c, 2.0) + Math.pow(double_b, 2.0));
            if (var0 != BreezeClient.CONST_A.thePlayer) {
               var11 = absValue(double_a, double_c, var0.rotationYaw, var0.isSneaking());
               if (!var8) {
                  break label43;
               }
            }

            var11 = new float[]{BreezeClient.CONST_A.thePlayer.moveForward, BreezeClient.CONST_A.thePlayer.moveStrafing};
         }

         var11[0] = (float)(var11[0] * var2);
         var11[1] = (float)(var11[1] * var2);
         var6[0] = getDataBuilder39(var7);
         boolean var12 = var9 > 0.31;
         int var13 = 0;

         while (var13 < var1) {
            label50: {
               if (var0 instanceof EntityPlayer) {
                  var7 = getAxisAlignedBB_2(var11[1], var11[0], (EntityPlayer)var0, var7);
                  if (!var8) {
                     break label50;
                  }
               }

               if (var0 instanceof EntityLivingBase) {
                  var7 = calculateAngles(var0.moveStrafing, var0.moveForward, var0, var7);
                  if (!var8) {
                     break label50;
                  }
               }

               var7 = getHitbox_2(double_a, double_b, double_c, var0, var7);
            }

            var6[var13 + 1] = getDataBuilder39(var7);
            var13++;
            if (var8) {
               break;
            }
         }

         return var6;
      } else {
         Arrays.fill(var6, getDataBuilder39(var7));
         return var6;
      }
   }

   private static RangeValue getDataBuilder39(AxisAlignedBB var0) {
      fieldBool_h = BreezeClient.CONST_A.theWorld.isMaterialInBB(var0.expand(-0.1, -0.4, -0.1), Material.water);
      fieldBool_i = BreezeClient.CONST_A.theWorld.isMaterialInBB(var0.expand(-0.1, -0.4, -0.1), Material.lava);
      return new RangeValue(double_a, double_b, double_c, fieldBool_d, fieldBool_e, fieldBool_f, fieldBool_g, fieldBool_h, fieldBool_i, var0);
   }

   private static AxisAlignedBB getAxisAlignedBB_2(float var0, float var1, EntityPlayer var2, AxisAlignedBB var3) {
      long var4 = 128818947398911L;
      boolean var10000 = BlockUtil7.checkCondition();
      Vec3 var6 = BlockUtil7.getVec3_2(var3);
      double var7 = var6.xCoord;
      boolean var9 = var10000;
      double var10 = var3.minY;
      double var12 = var6.zCoord;
      if (var2.capabilities.isFlying && var2.ridingEntity == null) {
         double var14 = double_b;
         float var16 = var2.jumpMovementFactor;
         var3 = calculateAngles(var0, var1, var2, var3);
         double_b = var14 * 0.6;
         if (!var9) {
            return var3;
         }
      }

      return calculateAngles(var0, var1, var2, var3);
   }

   private static AxisAlignedBB calculateAngles(float var0, float var1, EntityLivingBase var2, AxisAlignedBB var3) {
      long var4 = 67344928106239L;
      boolean var10000 = BlockUtil7.isValid();
      Vec3 var6 = BlockUtil7.getVec3_2(var3);
      boolean var7 = var10000;
      if (!BreezeClient.CONST_A.theWorld.isMaterialInBB(var3.expand(-0.1F, -0.4F, -0.1F), Material.water)
         || var2 instanceof EntityPlayer && ((EntityPlayer)var2).capabilities.isFlying) {
         if (!BreezeClient.CONST_A.theWorld.isMaterialInBB(var3.expand(-0.1F, -0.4F, -0.1F), Material.lava)
            || var2 instanceof EntityPlayer && ((EntityPlayer)var2).capabilities.isFlying) {
            float var8 = 0.91F;
            if (fieldBool_d) {
               var8 = BreezeClient.CONST_A
                     .theWorld
                     .getBlockState(
                        new BlockPos(MathHelper.floor_double(var6.xCoord), MathHelper.floor_double(var3.minY) - 1, MathHelper.floor_double(var6.zCoord))
                     )
                     .getBlock()
                     .slipperiness
                  * 0.91F;
            }

            float var10;
            label84: {
               float var9 = 0.16277136F / (var8 * var8 * var8);
               if (fieldBool_d) {
                  var10 = var2.getAIMoveSpeed() * var9;
                  if (var7) {
                     break label84;
                  }
               }

               var10 = var2.jumpMovementFactor;
            }

            calculate(var0, var1, var10, var2);
            var8 = 0.91F;
            if (fieldBool_d) {
               var8 = BreezeClient.CONST_A
                     .theWorld
                     .getBlockState(
                        new BlockPos(MathHelper.floor_double(var6.xCoord), MathHelper.floor_double(var3.minY) - 1, MathHelper.floor_double(var6.zCoord))
                     )
                     .getBlock()
                     .slipperiness
                  * 0.91F;
            }

            if (var2.func_70617_f_()) {
               float var11 = 0.15F;
               double_a = MathHelper.clamp_double(double_a, -var11, var11);
               double_c = MathHelper.clamp_double(double_c, -var11, var11);
               if (double_b < -0.15) {
                  double_b = -0.15;
               }

               boolean var12 = var2.isSneaking() && var2 instanceof EntityPlayer;
               if (var12 && var2.motionY < 0.0) {
                  double_b = 0.0;
               }
            }

            var3 = getHitbox_2(double_a, double_b, double_c, var2, var3);
            if (fieldBool_e && var2.func_70617_f_()) {
               double_b = 0.2;
            }

            double_b -= 0.08;
            double_b *= 0.98F;
            double_a *= var8;
            double_c *= var8;
            if (var7) {
               return var3;
            }
         }

         double var13 = var3.minY;
         calculate(var0, var1, 0.02F, var2);
         var3 = getHitbox_2(double_a, double_b, double_c, var2, var3);
         double_a *= 0.5;
         double_b *= 0.5;
         double_c *= 0.5;
         double_b -= 0.02;
         if (fieldBool_e && MinecraftAccessor.isValid_7(var2, var3.offset(double_a, double_b + 0.6F - var3.minY + var13, double_c))) {
            double_b = 0.3F;
         }

         if (var7) {
            return var3;
         }
      }

      double var19 = var3.minY;
      float var16 = 0.8F;
      float var17 = 0.02F;
      float var18 = EnchantmentHelper.getDepthStriderModifier(var2);
      if (var18 > 3.0F) {
         var18 = 3.0F;
      }

      if (!fieldBool_d) {
         var18 *= 0.5F;
      }

      if (var18 > 0.0F) {
         var16 += (0.54600006F - var16) * var18 / 3.0F;
         var17 += (var2.getAIMoveSpeed() - var17) * var18 / 3.0F;
      }

      calculate(var0, var1, var17, var2);
      var3 = getHitbox_2(double_a, double_b, double_c, var2, var3);
      double_a *= var16;
      double_b *= 0.8F;
      double_c *= var16;
      double_b -= 0.02;
      if (fieldBool_e && MinecraftAccessor.isValid_7(var2, var3.offset(double_a, double_b + 0.6F - var3.minY + var19, double_c))) {
         double_b = 0.3F;
      }

      return var3;
   }

   private static void calculate(float var0, float var1, float var2, Entity var3) {
      long var4 = 14816968466943L;
      float var6 = var0 * var0 + var1 * var1;
      if (var6 >= 1.0E-4F) {
         var6 = MathHelper.sqrt_float(var6);
         if (var6 < 1.0F) {
            var6 = 1.0F;
         }

         var6 = var2 / var6;
         var0 *= var6;
         var1 *= var6;
         float var7 = MathHelper.sin(var3.rotationYaw * (float) Math.PI / 180.0F);
         float var8 = MathHelper.cos(var3.rotationYaw * (float) Math.PI / 180.0F);
         double_a += var0 * var8 - var1 * var7;
         double_c += var1 * var8 + var0 * var7;
      }
   }

   private static AxisAlignedBB getHitbox_2(double var0, double var2, double var4, Entity var6, AxisAlignedBB var7) {
      long var8 = 23821039192336L;
      Vec3 var10 = BlockUtil7.getVec3_2(var7);
      double var11 = var10.xCoord;
      double var13 = var7.minY;
      boolean var10000 = BlockUtil7.isValid();
      double var15 = var10.zCoord;
      boolean var17 = var10000;
      if (BreezeClient.CONST_A.theWorld.isMaterialInBB(var7.expand(-0.1F, -0.4F, -0.1F), Material.web)) {
         var0 *= 0.25;
         var2 *= 0.05F;
         var4 *= 0.25;
         double_a = 0.0;
         double_b = 0.0;
         double_c = 0.0;
      }

      double var18 = var0;
      double var20 = var2;
      double var22 = var4;
      boolean var24 = fieldBool_d && var6.isSneaking() && var6 instanceof EntityPlayer;
      if (var24) {
         double var25 = 0.05;

         while (var0 != 0.0 && BreezeClient.CONST_A.theWorld.getCollidingBoundingBoxes(var6, var7.offset(var0, -1.0, 0.0)).isEmpty()) {
            label322: {
               if (var0 < var25 && var0 >= -var25) {
                  var0 = 0.0;
                  if (var17) {
                     break label322;
                  }
               }

               if (var0 > 0.0) {
                  var0 -= var25;
                  if (var17) {
                     break label322;
                  }
               }

               var0 += var25;
            }

            var18 = var0;
            if (!var17) {
               break;
            }
         }

         while (var4 != 0.0 && BreezeClient.CONST_A.theWorld.getCollidingBoundingBoxes(var6, var7.offset(0.0, -1.0, var4)).isEmpty()) {
            label324: {
               if (var4 < var25 && var4 >= -var25) {
                  var4 = 0.0;
                  if (var17) {
                     break label324;
                  }
               }

               if (var4 > 0.0) {
                  var4 -= var25;
                  if (var17) {
                     break label324;
                  }
               }

               var4 += var25;
            }

            var22 = var4;
            if (!var17) {
               break;
            }
         }

         while (var0 != 0.0 && var4 != 0.0 && BreezeClient.CONST_A.theWorld.getCollidingBoundingBoxes(var6, var7.offset(var0, -1.0, var4)).isEmpty()) {
            label326: {
               if (var0 < var25 && var0 >= -var25) {
                  var0 = 0.0;
                  if (var17) {
                     break label326;
                  }
               }

               if (var0 > 0.0) {
                  var0 -= var25;
                  if (var17) {
                     break label326;
                  }
               }

               var0 += var25;
            }

            label327: {
               var18 = var0;
               if (var4 < var25 && var4 >= -var25) {
                  var4 = 0.0;
                  if (var17) {
                     break label327;
                  }
               }

               if (var4 > 0.0) {
                  var4 -= var25;
                  if (var17) {
                     break label327;
                  }
               }

               var4 += var25;
            }

            var22 = var4;
            if (!var17) {
               break;
            }
         }
      }

      List var27 = BreezeClient.CONST_A.theWorld.getCollidingBoundingBoxes(var6, var7.addCoord(var0, var2, var4));
      AxisAlignedBB var28 = var7;

      for (AxisAlignedBB var30 : var27) {
         var2 = var30.calculateYOffset(var7, var2);
         if (!var17) {
            break;
         }
      }

      var7 = var7.offset(0.0, var2, 0.0);
      boolean var82 = fieldBool_d || var20 != var2 && var20 < 0.0;

      for (AxisAlignedBB var31 : var27) {
         var0 = var31.calculateXOffset(var7, var0);
         if (!var17) {
            break;
         }
      }

      var7 = var7.offset(var0, 0.0, 0.0);

      for (AxisAlignedBB var86 : var27) {
         var4 = var86.calculateZOffset(var7, var4);
         if (!var17) {
            break;
         }
      }

      var7 = var7.offset(0.0, 0.0, var4);
      if (var6.stepHeight > 0.0F && var82 && (var18 != var0 || var22 != var4)) {
         double var32 = var0;
         double var34 = var2;
         double var36 = var4;
         AxisAlignedBB var38 = var7;
         var7 = var28;
         var2 = var6.stepHeight;
         List var39 = BreezeClient.CONST_A.theWorld.getCollidingBoundingBoxes(var6, var7.addCoord(var18, var2, var22));
         AxisAlignedBB var40 = var7;
         AxisAlignedBB var41 = var40.addCoord(var18, 0.0, var22);
         double var42 = var2;

         for (AxisAlignedBB var45 : var39) {
            var42 = var45.calculateYOffset(var41, var42);
            if (!var17) {
               break;
            }
         }

         var40 = var40.offset(0.0, var42, 0.0);
         double var46 = var18;

         for (AxisAlignedBB var49 : var39) {
            var46 = var49.calculateXOffset(var40, var46);
            if (!var17) {
               break;
            }
         }

         var40 = var40.offset(var46, 0.0, 0.0);
         double var50 = var22;

         for (AxisAlignedBB var53 : var39) {
            var50 = var53.calculateZOffset(var40, var50);
            if (!var17) {
               break;
            }
         }

         var40 = var40.offset(0.0, 0.0, var50);
         AxisAlignedBB var92 = var7;
         double var54 = var2;

         for (AxisAlignedBB var57 : var39) {
            var54 = var57.calculateYOffset(var92, var54);
            if (!var17) {
               break;
            }
         }

         var92 = var92.offset(0.0, var54, 0.0);
         double var58 = var18;

         for (AxisAlignedBB var61 : var39) {
            var58 = var61.calculateXOffset(var92, var58);
            if (!var17) {
               break;
            }
         }

         var92 = var92.offset(var58, 0.0, 0.0);
         double var62 = var22;

         for (AxisAlignedBB var65 : var39) {
            var62 = var65.calculateZOffset(var92, var62);
            if (!var17) {
               break;
            }
         }

         label160: {
            var92 = var92.offset(0.0, 0.0, var62);
            double var66 = var46 * var46 + var50 * var50;
            double var68 = var58 * var58 + var62 * var62;
            if (var66 > var68) {
               var0 = var46;
               var4 = var50;
               var2 = -var42;
               var7 = var40;
               if (var17) {
                  break label160;
               }
            }

            var0 = var58;
            var4 = var62;
            var2 = -var54;
            var7 = var92;
         }

         for (AxisAlignedBB var71 : var39) {
            var2 = var71.calculateYOffset(var7, var2);
            if (!var17) {
               break;
            }
         }

         var7 = var7.offset(0.0, var2, 0.0);
         if (var32 * var32 + var36 * var36 >= var0 * var0 + var4 * var4) {
            var0 = var32;
            var2 = var34;
            var4 = var36;
            var7 = var38;
         }
      }

      fieldBool_e = var18 != var0 || var22 != var4;
      fieldBool_f = var20 != var2;
      fieldBool_d = fieldBool_f && var20 < 0.0;
      fieldBool_g = fieldBool_e || fieldBool_f;
      Vec3 var85 = BlockUtil7.getVec3_2(var7);
      int var87 = MathHelper.floor_double(var85.xCoord);
      int var72 = MathHelper.floor_double(var7.minY - 0.2F);
      int var73 = MathHelper.floor_double(var85.zCoord);
      BlockPos var74 = new BlockPos(var87, var72, var73);
      Block var75 = BreezeClient.CONST_A.theWorld.getBlockState(var74).getBlock();
      if (var75.getMaterial() == Material.air) {
         Block var88 = BreezeClient.CONST_A.theWorld.getBlockState(var74.down()).getBlock();
         if (var88 instanceof BlockFence || var88 instanceof BlockWall || var88 instanceof BlockFenceGate) {
            var74 = var74.down();
         }
      }

      if (var18 != var0) {
         double_a = 0.0;
      }

      if (var22 != var4) {
         double_c = 0.0;
      }

      if (var20 != var2) {
         double_b = 0.0;
      }

      return var7;
   }

   private static float[] absValue(double var0, double var2, float var4, boolean var5) {
      boolean var9;
      float var10;
      float var12;
      label23: {
         long var6 = 117537230588150L;
         boolean var10000 = BlockUtil7.isValid();
         var12 = (float)(var2 * Math.cos(Math.toRadians(var4)) - var0 * Math.sin(Math.toRadians(var4)));
         var9 = var10000;
         var10 = (float)(var0 * Math.cos(Math.toRadians(var4)) + var2 * Math.sin(Math.toRadians(var4)));
         if (Math.abs(var12) > 0.1) {
            var12 = Math.signum(var12);
            if (var9) {
               break label23;
            }
         }

         var12 = 0.0F;
      }

      label18: {
         if (Math.abs(var10) > 0.1) {
            var10 = Math.signum(var10);
            if (var9) {
               break label18;
            }
         }

         var10 = 0.0F;
      }

      if (var5) {
         var12 = (float)(var12 * 0.3);
         var10 = (float)(var10 * 0.3);
      }

      return new float[]{var12, var10};
   }

   private static AxisAlignedBB[] lambda$predictedTargetBoxes_Inner0(int var0) {
      return new AxisAlignedBB[var0];
   }

   public static void initialize(int[] var0) {
      arr_j = var0;
   }

   public static int[] values() {
      return arr_j;
   }

   static {
      if (values() != null) {
         initialize(new int[1]);
      }
   }
}
