package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockEnchantmentTable;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "MLG",
   b = "Automatically saves you from fall damage using water or a ladder.",
   c = {"water", "ladder", "mlg", "fall"},
   d = rip.breeze.ModuleCategory.MOVEMENT
)
public final class MLG extends BreezeModule implements IBreezeInterface2 {
   private final GenericSetting<EnumType36> modeSetting;
   private final GenericSetting<Double> fallThresholdSetting;
   private final GenericSetting<Integer> pickupDelaySetting;
   private final GenericSetting<Boolean> switchBackSetting;
   private final GenericSetting<Double> rotationSpeedSetting;
   private double double_s;
   private boolean fieldBool_t;
   private boolean fieldBool_u;
   private BlockPos blockPos_v;
   private int fieldInt_w;
   private int fieldInt_x;
   private int fieldInt_y;
   private static final String[] CONST_A;
   private static final String[] CONST_B;
   private static final Map CONST_C = new HashMap(13);

   public MLG() {
      long var1 = 126399234094655L;
      super();
      short var10002 = 5362;
      long var10003 = 5861005834222046928L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Mode");
      var10002 = 17691;
      var10003 = 7836196386938773299L ^ var1;
      this.modeSetting = var10001.getDataBuilder50_3("Which MLG method to use.").getDataBuilder50_4(EnumType36.BOTH).getDataBuilder54();
      var10002 = 18768;
      var10003 = 2946285830179246973L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "FallThreshold");
      var10002 = 6674;
      var10003 = 4733786604412534841L ^ var1;
      this.fallThresholdSetting = var10001.getDataBuilder50_3("The amount of blocks to fall down before MLG will be activated.")
         .getDataBuilder50_4(2.5)
         .clamp(rip.breeze.RenderUtil27.getPredicate_3(1.0, 5.0, 0.1))
         .getDataBuilder54();
      var10002 = 6213;
      var10003 = 8478945342055416427L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "PickupDelay");
      var10002 = 7726;
      var10003 = 3007799604333642754L ^ var1;
      this.pickupDelaySetting = var10001.getDataBuilder50_3("Ticks to wait on ground before picking up water.")
         .getDataBuilder50_4(3)
         .clamp(rip.breeze.RenderUtil27.getPredicate(0, 20, 1))
         .getDataBuilder54();
      var10002 = 14640;
      var10003 = 5983791988219487002L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "SwitchBack");
      var10002 = 13902;
      var10003 = 1152560677044726893L ^ var1;
      this.switchBackSetting = var10001.getDataBuilder50_3("Switch back to the previous slot after MLG.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 2051;
      var10003 = 8491195432940311082L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "RotationSpeed");
      var10002 = 5102;
      var10003 = 4164833128685898177L ^ var1;
      this.rotationSpeedSetting = var10001.getDataBuilder50_3("How fast to rotate towards your target rotation.")
         .getDataBuilder50_4(6.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_3(2.0, 10.0, 0.1))
         .getDataBuilder54();
      this.fieldBool_t = false;
      this.fieldBool_u = false;
      this.blockPos_v = null;
      this.fieldInt_w = -1;
      this.fieldInt_x = 0;
      this.fieldInt_y = 0;
   }

   public void update() {
      long var1 = 73912092874623L;
      BreezeClient.getModuleRegistry().applyRotation(this);
      if (!BreezeClient.isValid()) {
         this.double_s = BreezeClient.CONST_A.thePlayer.posY;
         this.update_1();
         this.fieldInt_y = 0;
      }
   }

   public void update_1() {
      BreezeClient.getModuleRegistry().initialize(this);
   }

   public void updateRotation_2(ModuleRegistry var1) {
      long var2 = 117735033473270L;
      String var4 = ScaffoldUtils.getString_2();
      if (!BreezeClient.isValid()) {
         if (BreezeClient.CONST_A.thePlayer.posY > this.double_s || BreezeClient.CONST_A.thePlayer.onGround) {
            this.double_s = BreezeClient.CONST_A.thePlayer.posY;
         }

         var1.isActive_2(true);
         if (this.fieldInt_y > 0) {
            this.fieldInt_y--;
            if (this.fieldInt_y == 0) {
               this.update();
            }
         } else if (this.fieldBool_t) {
            this.updateRotation_2(var1);
         } else if (BreezeClient.CONST_A.thePlayer.onGround) {
            this.fieldBool_u = false;
         } else if (this.fieldBool_u) {
            BreezeClient.CONST_A.thePlayer.setSneaking(PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindSneak));
         } else {
            RangeValue[] var5 = BlockUtil10.getHitPoints(BreezeClient.CONST_A.thePlayer, 20);
            RangeValue var6 = null;

            for (int var7 = 1; var7 < var5.length; var7++) {
               RangeValue var8 = var5[var7];
               if (var8.isBool_h() || var8.isBool_i() && var4 != null) {
                  break;
               }

               if (var8.isBool_d()) {
                  var6 = var8;
                  break;
               }
            }

            if (var6 != null) {
               double var9 = this.double_s - var6.getDouble();
               if (!(var9 < this.fallThresholdSetting.getObject_m())) {
                  if (!this.modeSetting.isValid(EnumType36.WATER) && !this.modeSetting.isValid(EnumType36.BOTH) || !this.getHitbox(var1, var6)) {
                     if (this.modeSetting.isValid(EnumType36.LADDER) || this.modeSetting.isValid(EnumType36.BOTH)) {
                        this.getHitbox_2(var1, var6);
                     }
                  }
               }
            }
         }
      }
   }

   private void updateRotation_2(ModuleRegistry var1) {
      long var2 = 39225980933300L;
      String var10000 = ScaffoldUtils.getString_2();
      this.fieldInt_x++;
      String var4 = var10000;
      if (this.fieldInt_x > 60) {
         this.update();
         this.update_1();
      } else {
         Block var5 = BreezeClient.CONST_A.theWorld.getBlockState(this.blockPos_v).getBlock();
         if (var5 != Blocks.water && var5 != Blocks.flowing_water) {
            this.update();
            this.update_1();
         } else {
            int var6 = this.getValue_2(false);
            if (var6 == -1) {
               this.update_1();
            } else {
               Vec3 var7 = BreezeClient.CONST_A.thePlayer.getPositionEyes(MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks);
               double var8 = Double.MAX_VALUE;
               float[] var10 = null;
               float var11 = 0.1F;

               label72:
               while (var11 <= 0.9F) {
                  float var12 = 0.1F;

                  while (true) {
                     if (var12 <= 0.9F) {
                        Vec3 var13 = new Vec3(this.blockPos_v.getX() + var11, this.blockPos_v.getY() + 0.5, this.blockPos_v.getZ() + var12);
                        float[] var14 = RotationUtil7.getAnglesTo(var13, BreezeClient.CONST_A.thePlayer, true);
                        double var15 = Math.abs(RotationUtil7.absValue(var14[0], var1.getFloat_g()));
                        double var17 = Math.abs(var1.getFloat() - var14[1]);
                        double var19 = var15 * 3.0 + var17;
                        if (var19 < var8) {
                           var8 = var19;
                           var10 = var14;
                        }

                        var12 += 0.2F;
                        if (var4 != null) {
                           continue;
                        }
                     }

                     var11 += 0.2F;
                     if (var4 == null) {
                        break label72;
                     }
                     break;
                  }
               }

               if (var10 == null) {
                  this.update();
                  this.update_1();
               } else {
                  var1.isValid(var10, this.calculateFloat());
                  if (BreezeClient.getThemeManager().getInt_d() > this.pickupDelaySetting.getObject_m()) {
                     if (this.fieldInt_w == -1) {
                        this.fieldInt_w = BreezeClient.CONST_A.thePlayer.inventory.currentItem;
                     }

                     BreezeClient.CONST_A.thePlayer.inventory.currentItem = var6;
                     MinecraftAccessor.initialize_68(BreezeClient.CONST_A.playerController);
                     Vec3 var21 = var1.getVec3();
                     MovingObjectPosition var22 = BreezeClient.CONST_A
                        .theWorld
                        .rayTraceBlocks(var7, var7.addVector(var21.xCoord * 5.0, var21.yCoord * 5.0, var21.zCoord * 5.0), true, false, false);
                     if (var22 != null && var22.typeOfHit == MovingObjectType.BLOCK) {
                        Block var23 = BreezeClient.CONST_A.theWorld.getBlockState(var22.getBlockPos()).getBlock();
                        if (var23 == Blocks.water || var23 == Blocks.flowing_water) {
                           if (BreezeClient.CONST_A
                              .playerController
                              .sendUseItem(BreezeClient.CONST_A.thePlayer, BreezeClient.CONST_A.theWorld, BreezeClient.CONST_A.thePlayer.getHeldItem())) {
                              this.fieldInt_y = this.switchBackSetting.getObject_m() ? 5 : 0;
                              this.update_1();
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void update() {
      long var1 = 50493548446051L;
      if (this.switchBackSetting.getObject_m() && this.fieldInt_w != -1) {
         BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_w;
         MinecraftAccessor.initialize_68(BreezeClient.CONST_A.playerController);
         this.fieldInt_w = -1;
      }
   }

   private void update_1() {
      this.fieldBool_t = false;
      this.blockPos_v = null;
      this.fieldInt_x = 0;
   }

   private boolean getHitbox(ModuleRegistry var1, RangeValue var2) {
      long var3 = 65161227065653L;
      String var10000 = ScaffoldUtils.getString_2();
      int var5 = this.getValue_2(true);
      String var6 = var10000;
      if (var5 == -1) {
         return false;
      }

      BreezeClient.CONST_A.thePlayer.inventory.currentItem = var5;
      MinecraftAccessor.initialize_68(BreezeClient.CONST_A.playerController);
      BlockPos var7 = new BlockPos(var2.calculateDouble(), var2.getDouble(), var2.calculateDouble_2()).down();
      Vec3 var8 = BreezeClient.CONST_A.thePlayer.getPositionEyes(MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks);
      IBlockState var9 = BreezeClient.CONST_A.theWorld.getBlockState(var7);
      AxisAlignedBB var10 = var9.getBlock().getCollisionBoundingBox(BreezeClient.CONST_A.theWorld, var7, var9);
      double var11 = var10 != null ? var10.maxY - 0.1 : var7.getY() + 0.9;
      double var13 = Double.MAX_VALUE;
      Vec3 var15 = null;
      float[] var16 = null;
      float var17 = 0.05F;

      label70:
      while (var17 <= 0.95) {
         float var18 = 0.05F;

         while (true) {
            if (var18 <= 0.95F) {
               Vec3 var19 = new Vec3(var7.getX() + var17, var11, var7.getZ() + var18);
               MovingObjectPosition var20 = BreezeClient.CONST_A.theWorld.rayTraceBlocks(var8, var19);
               if (var20 != null
                  && var20.typeOfHit == MovingObjectType.BLOCK
                  && var20.sideHit == net.minecraft.util.EnumFacing.UP
                  && var20.getBlockPos().equals(var7)) {
                  float[] var21 = RotationUtil7.getAnglesTo(var20.hitVec, BreezeClient.CONST_A.thePlayer, true);
                  double var22 = Math.hypot(RotationUtil7.absValue(var21[0], var1.getFloat_g()), Math.abs(var1.getFloat() - var21[1]));
                  double var24 = Math.hypot(var20.hitVec.zCoord - (var7.getZ() + 0.5), var20.hitVec.xCoord - (var7.getX() + 0.5)) * 15.0;
                  double var26 = var22 + var24;
                  if (var26 < var13) {
                     var13 = var26;
                     var15 = var20.hitVec;
                     var16 = var21;
                  }
               }

               var18 += 0.1F;
               if (var6 != null) {
                  continue;
               }
            }

            var17 += 0.1F;
            if (var6 == null) {
               break label70;
            }
            break;
         }
      }

      if (var15 == null) {
         return true;
      }

      if (this.checkCondition(var9)) {
         BreezeClient.CONST_A.thePlayer.setSneaking(true);
      }

      var1.isValid(var16, this.calculateFloat());
      Vec3 var28 = var1.getVec3();
      MovingObjectPosition var29 = BreezeClient.CONST_A
         .theWorld
         .rayTraceBlocks(var8, var8.addVector(var28.xCoord * 8.0, var28.yCoord * 8.0, var28.zCoord * 8.0), false, true, false);
      if (var29 == null) {
         return true;
      }

      if (var29.sideHit != net.minecraft.util.EnumFacing.UP) {
         return true;
      }

      BlockPos var30 = var29.getBlockPos().up();
      if (!var2.getAxisAlignedBB_j()
         .intersectsWith(new AxisAlignedBB(var30.getX(), var30.getY(), var30.getZ(), var30.getX() + 1, var30.getY() + 1, var30.getZ() + 1))) {
         return true;
      }

      if (BreezeClient.CONST_A
         .playerController
         .sendUseItem(BreezeClient.CONST_A.thePlayer, BreezeClient.CONST_A.theWorld, BreezeClient.CONST_A.thePlayer.getHeldItem())) {
         this.fieldBool_u = true;
         this.fieldBool_t = true;
         this.blockPos_v = var29.getBlockPos().up();
         this.fieldInt_x = 0;
      }

      return true;
   }

   private boolean getHitbox_2(ModuleRegistry var1, RangeValue var2) {
      long var3 = 51081063510444L;
      String var10000 = ScaffoldUtils.getString_2();
      int var5 = this.getValue();
      String var6 = var10000;
      if (var5 == -1) {
         return false;
      }

      ArrayList var7 = new ArrayList();
      int var8 = -1;

      label131:
      while (var8 <= 1) {
         int var9 = -1;

         while (true) {
            if (var9 <= 1) {
               BlockPos var10 = new BlockPos(var2.calculateDouble() + var8, var2.getDouble(), var2.calculateDouble_2() + var9);
               AxisAlignedBB var11 = new AxisAlignedBB(var10.getX(), var10.getY(), var10.getZ(), var10.getX() + 1, var10.getY() + 1, var10.getZ() + 1);
               if (var11.intersectsWith(var2.getAxisAlignedBB_j())) {
                  IBlockState var12 = BreezeClient.CONST_A.theWorld.getBlockState(var10.down());
                  IBlockState var13 = BreezeClient.CONST_A.theWorld.getBlockState(var10);
                  if (!var12.getBlock().isReplaceable(BreezeClient.CONST_A.theWorld, var10.down())
                     && var13.getBlock().isReplaceable(BreezeClient.CONST_A.theWorld, var10)) {
                     for (net.minecraft.util.EnumFacing var17 : new net.minecraft.util.EnumFacing[]{
                        net.minecraft.util.EnumFacing.SOUTH,
                        net.minecraft.util.EnumFacing.WEST,
                        net.minecraft.util.EnumFacing.NORTH,
                        net.minecraft.util.EnumFacing.EAST
                     }) {
                        BlockPos var18 = var10.offset(var17);
                        IBlockState var19 = BreezeClient.CONST_A.theWorld.getBlockState(var18);
                        if (!var19.getBlock().isReplaceable(BreezeClient.CONST_A.theWorld, var18)) {
                           var7.add(var10.down());
                           if (var6 != null) {
                              break;
                           }
                        }

                        if (var6 == null) {
                           break;
                        }
                     }
                  }
               }

               var9++;
               if (var6 != null) {
                  continue;
               }
            }

            var8++;
            if (var6 == null) {
               break label131;
            }
            break;
         }
      }

      if (var7.isEmpty()) {
         return false;
      }

      BreezeClient.CONST_A.thePlayer.inventory.currentItem = var5;
      MinecraftAccessor.initialize_68(BreezeClient.CONST_A.playerController);
      Vec3 var35 = BreezeClient.CONST_A.thePlayer.getPositionEyes(MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks);
      double var20 = Double.MAX_VALUE;
      Vec3 var36 = null;
      BlockPos var37 = null;
      IBlockState var38 = null;
      float[] var39 = null;

      label102:
      for (BlockPos var42 : var7) {
         IBlockState var44 = BreezeClient.CONST_A.theWorld.getBlockState(var42);
         AxisAlignedBB var46 = var44.getBlock().getCollisionBoundingBox(BreezeClient.CONST_A.theWorld, var42, var44);
         double var22 = var46 != null ? var46.maxY - 0.1 : var42.getY() + 0.9;
         float var24 = 0.05F;

         while (true) {
            if (var24 <= 0.95) {
               float var25 = 0.05F;

               while (var25 <= 0.95F) {
                  Vec3 var26 = new Vec3(var42.getX() + var24, var22, var42.getZ() + var25);
                  MovingObjectPosition var27 = BreezeClient.CONST_A.theWorld.rayTraceBlocks(var35, var26);
                  if (var27 != null
                     && var27.typeOfHit == MovingObjectType.BLOCK
                     && var27.sideHit == net.minecraft.util.EnumFacing.UP
                     && var27.getBlockPos().equals(var42)) {
                     float[] var28 = RotationUtil7.getAnglesTo(var27.hitVec, BreezeClient.CONST_A.thePlayer, true);
                     double var29 = Math.hypot(RotationUtil7.absValue(var28[0], var1.getFloat_g()), Math.abs(var1.getFloat() - var28[1]));
                     double var31 = Math.hypot(var27.hitVec.zCoord - (var42.getZ() + 0.5), var27.hitVec.xCoord - (var42.getX() + 0.5)) * 15.0;
                     double var33 = var29 + var31;
                     if (var33 < var20) {
                        var20 = var33;
                        var36 = var27.hitVec;
                        var39 = var28;
                        var37 = var42;
                        var38 = var44;
                     }
                  }

                  var25 += 0.1F;
                  if (var6 == null) {
                     break;
                  }
               }

               var24 += 0.1F;
               if (var6 != null) {
                  continue;
               }
            }

            if (var6 == null) {
               break label102;
            }
            break;
         }
      }

      if (var36 == null) {
         return true;
      }

      if (this.checkCondition(var38)) {
         BreezeClient.CONST_A.thePlayer.setSneaking(true);
      }

      var1.isValid(var39, this.calculateFloat());
      Vec3 var41 = var1.getVec3();
      float var43 = BreezeContext.moduleBase_a.getModuleByClass(Reach.class).getFloat();
      MovingObjectPosition var45 = BreezeClient.CONST_A
         .theWorld
         .rayTraceBlocks(var35, var35.addVector(var41.xCoord * var43, var41.yCoord * var43, var41.zCoord * var43), false, true, false);
      if (var45 == null) {
         return true;
      }

      if (var45.sideHit != net.minecraft.util.EnumFacing.UP) {
         return true;
      }

      if (!var45.getBlockPos().equals(var37)) {
         return true;
      }

      if (BreezeClient.CONST_A
         .playerController
         .onPlayerRightClick(
            BreezeClient.CONST_A.thePlayer,
            BreezeClient.CONST_A.theWorld,
            BreezeClient.CONST_A.thePlayer.getHeldItem(),
            var37,
            net.minecraft.util.EnumFacing.UP,
            var45.hitVec
         )) {
         this.fieldBool_u = true;
         this.fieldInt_x = 0;
      }

      return true;
   }

   private Vec3 getVec3(BlockPos var1, net.minecraft.util.EnumFacing var2, float var3, float var4) {
      long var5 = 35201821822349L;
      switch (Util55.CONST_A[var2.ordinal()]) {
         case 1:
            return new Vec3(var1.getX() + var3, var1.getY() + var4, var1.getZ());
         case 2:
            return new Vec3(var1.getX() + var3, var1.getY() + var4, var1.getZ() + 1);
         case 3:
            return new Vec3(var1.getX(), var1.getY() + var4, var1.getZ() + var3);
         case 4:
            return new Vec3(var1.getX() + 1, var1.getY() + var4, var1.getZ() + var3);
         default:
            return new Vec3(var1.getX() + 0.5, var1.getY() + 0.5, var1.getZ() + 0.5);
      }
   }

   private int getValue() {
      long var1 = 37855079653909L;
      String var10000 = ScaffoldUtils.getString_2();
      int var3 = 0;
      String var4 = var10000;

      while (var3 < 9) {
         ItemStack var5 = BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var3);
         if (var5 != null && var5.getItem() instanceof ItemBlock && ((ItemBlock)var5.getItem()).getBlock() == Blocks.ladder) {
            return var3;
         }

         var3++;
         if (var4 == null) {
            break;
         }
      }

      return -1;
   }

   private int getValue_2(boolean var1) {
      long var2 = 70158475814129L;
      String var10000 = ScaffoldUtils.getString_2();
      int var4 = 0;
      String var5 = var10000;

      while (var4 < 9) {
         ItemStack var6 = BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var4);
         if (var6 != null && var6.getItem() instanceof ItemBucket) {
            if (MinecraftAccessor.getBlock((ItemBucket)var6.getItem()) == Blocks.flowing_water && var1) {
               return var4;
            }

            if (MinecraftAccessor.getBlock((ItemBucket)var6.getItem()) == Blocks.air && !var1) {
               return var4;
            }
         }

         var4++;
         if (var5 == null) {
            break;
         }
      }

      return -1;
   }

   private float calculateFloat() {
      return (float)(Math.pow(this.rotationSpeedSetting.getObject_m() / 10.0, 1.5) * 180.0);
   }

   private boolean checkCondition(IBlockState var1) {
      long var2 = 129715571128546L;
      Block var4 = var1.getBlock();
      return var4 instanceof BlockContainer
         || var4 instanceof BlockWorkbench
         || var4 instanceof BlockAnvil
         || var4 instanceof BlockBed
         || var4 instanceof BlockDoor
         || var4 instanceof BlockFenceGate
         || var4 instanceof BlockTrapDoor
         || var4 instanceof BlockEnchantmentTable;
   }

   public int getValue_3() {
      return 20;
   }

   static {
      long var0 = 26131968155117L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[10];
      int var5 = 0;
      String var6 = "àÈ5Èº¼\u0007JP\u0092¬\u0084Ç\u008bÝì-N\u0017\u008eÚO²\u0016\f\u0082\u0002\u0090\u0096RÂqh\u000e|k6\u009dm)ü×\u0088qz\u00ad\u00014E^&\u0085ÃY\td(Ñ\u001a\u009f\u001b4yéXR>»\u0094ââ ~Ù{±\u007fMÑJ7[ry«\bÒ¼Î\u0088.,b7\u009b\ràìU\u008a\u000bMÒÇ7Fq»X^é³N}Î[èWCîâ·IÅfYb\u000eàÐ¡¦Ó#Ò\u007f_0x¹w\u0085\u0091Ný\u007f\u001eSt§\u0005\u000f\u0096P\u0098ÏÛ7\u0006J\u0090iQ¹æ\rý\u0006õáÞW«\u0005\u0096öà½Ë\u0095å6K]õ\u0087\u0018\ta%q+\u009fk¢Ì\u009df\u00029Z«¡y ê\u0085\u0015\u0085\u0091s\u0018\u001f½*m\u0000%VDq\u000fIÌü÷pý!¢\u008b¥Qj.HX'ª^©\u0094aë¬\u0000ÔÆ\u008d::\u009cf\u0000Ñ²\u001cFêÏùj\\j\tîÏ\u001fú³>_ù¼È\u001d\u0081yä#Tî6\u0081¥z£Úu\u0099]Äv\u0088o,ªñ$á\u000eìKj\u001c\u0081\u00ad\u0014Õ\"zÎÖåëUÚ-UÛ/\u0086\u0095P?X\u0094B\u0010 ×IZÀNçÁ ®µñeëD\u0083\u0099ñhJ\u0016\rTæï·ì\u0089ÐÒCë\u0014>¡\u008c\u001cÂªUý ÿ»\rå¥PÅ\u0092\u0010nBÙ\u009c\u0082\u008bò\u009eMa\u000bBdsA\bG8X¬ÀÄM\u0089²}\u0087ÈôK \u0016·0 ä\u0007\u0085ë7\u0017ÖÑ\u0019pòxÃÞ²\u001aãw\u000e»\u008e'ÿ\u0015Ý]]\\H\u000eì\u0015";
      int var7 = "àÈ5Èº¼\u0007JP\u0092¬\u0084Ç\u008bÝì-N\u0017\u008eÚO²\u0016\f\u0082\u0002\u0090\u0096RÂqh\u000e|k6\u009dm)ü×\u0088qz\u00ad\u00014E^&\u0085ÃY\td(Ñ\u001a\u009f\u001b4yéXR>»\u0094ââ ~Ù{±\u007fMÑJ7[ry«\bÒ¼Î\u0088.,b7\u009b\ràìU\u008a\u000bMÒÇ7Fq»X^é³N}Î[èWCîâ·IÅfYb\u000eàÐ¡¦Ó#Ò\u007f_0x¹w\u0085\u0091Ný\u007f\u001eSt§\u0005\u000f\u0096P\u0098ÏÛ7\u0006J\u0090iQ¹æ\rý\u0006õáÞW«\u0005\u0096öà½Ë\u0095å6K]õ\u0087\u0018\ta%q+\u009fk¢Ì\u009df\u00029Z«¡y ê\u0085\u0015\u0085\u0091s\u0018\u001f½*m\u0000%VDq\u000fIÌü÷pý!¢\u008b¥Qj.HX'ª^©\u0094aë¬\u0000ÔÆ\u008d::\u009cf\u0000Ñ²\u001cFêÏùj\\j\tîÏ\u001fú³>_ù¼È\u001d\u0081yä#Tî6\u0081¥z£Úu\u0099]Äv\u0088o,ªñ$á\u000eìKj\u001c\u0081\u00ad\u0014Õ\"zÎÖåëUÚ-UÛ/\u0086\u0095P?X\u0094B\u0010 ×IZÀNçÁ ®µñeëD\u0083\u0099ñhJ\u0016\rTæï·ì\u0089ÐÒCë\u0014>¡\u008c\u001cÂªUý ÿ»\rå¥PÅ\u0092\u0010nBÙ\u009c\u0082\u008bò\u009eMa\u000bBdsA\bG8X¬ÀÄM\u0089²}\u0087ÈôK \u0016·0 ä\u0007\u0085ë7\u0017ÖÑ\u0019pòxÃÞ²\u001aãw\u000e»\u008e'ÿ\u0015Ý]]\\H\u000eì\u0015"
         .length();
      char var8 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_A = var4;
                     CONST_B = new String[10];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\u0013É³£\u001bä|k\u0007úÂ%\tô\u0091\u0016Hï\u0012\u009d\u009f\u0013Õ¦F4|5Ö \u0017ú¤3j\u0089ç6¼¶±:D¡\u0083\u0091Lå¹í02\u0088uÜø¹±Ø\u0097ÕW\u0015<(4mNòÎ©LEv\u008fØS|\u009cº\u0001\u001bÝõX\u0016\u008d?ª";
                  var7 = "\u0013É³£\u001bä|k\u0007úÂ%\tô\u0091\u0016Hï\u0012\u009d\u009f\u0013Õ¦F4|5Ö \u0017ú¤3j\u0089ç6¼¶±:D¡\u0083\u0091Lå¹í02\u0088uÜø¹±Ø\u0097ÕW\u0015<(4mNòÎ©LEv\u008fØS|\u009cº\u0001\u001bÝõX\u0016\u008d?ª"
                     .length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11285;
      if (CONST_B[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_C.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_C.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dV", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_A[var3].getBytes("ISO-8859-1");
         CONST_B[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_B[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_2(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getObject".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/dV" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
