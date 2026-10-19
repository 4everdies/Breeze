package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.BlockBed;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.KeepParameters;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "BedNuker", b = "Automatically breaks down beds.", d = rip.breeze.ModuleCategory.MISC, c = {"nuker", "bedwars"})
public class BedNuker extends BreezeModule implements IBreezeInterface2 {
   private final GenericSetting<rip.breeze.BreezeColor> breakColorSetting;
   private final GenericSetting<rip.breeze.BreezeColor> bedColorSetting;
   private final Set<BlockPos> set_p;
   private BlockPos blockPos_q;
   private BlockPos blockPos_r;
   private int fieldInt_s;
   private boolean fieldBool_t;
   private static final String[] CONST_V;
   private static final String[] CONST_W;
   private static final Map CONST_X = new HashMap(13);

   public BedNuker() {
      long var1 = 40527945254829L;
      super();
      short var10002 = 28234;
      long var10003 = 2579280777707870107L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "BreakColor");
      var10002 = 29334;
      var10003 = 137766336973589316L ^ var1;
      this.breakColorSetting = var10001.getDataBuilder50_3("The color of the block breaking highlight.")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(49, 41, 172, 190))
         .getDataBuilder50_8()
         .getDataBuilder54();
      var10002 = 26977;
      var10003 = 5873027422221815986L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "BedColor");
      var10002 = 208;
      var10003 = 5504463242837408000L ^ var1;
      this.bedColorSetting = var10001.getDataBuilder50_3("The color of the bed highlight.")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(80, 87, 220))
         .getDataBuilder50_8()
         .getDataBuilder54();
      this.set_p = new HashSet<>();
      this.fieldInt_s = -1;
   }

   public void update() {
      long var1 = 23436370995847L;
      BreezeClient.getModuleRegistry().initialize(this);
      this.set_p.clear();
      this.fieldBool_t = false;
      if (this.fieldInt_s != -1) {
         BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_s;
         this.fieldInt_s = -1;
      }
   }

   @Override
   public void processAll() {
      BreezeClient.getModuleRegistry().applyRotation(this);
   }

   public int getValue() {
      return 40;
   }

   public void updateRotation(ModuleRegistry var1) {
      long var2 = 117735033473270L;
      int var4 = AntiBot.getValue();
      if (this.blockPos_r == null
         || !BreezeClient.getModuleInitializer().map_a.containsKey(this.blockPos_r)
         || !this.isValid(this.blockPos_r)
         || !this.isValid(
            this.blockPos_r.offset((net.minecraft.util.EnumFacing)BreezeClient.CONST_A.theWorld.getBlockState(this.blockPos_r).getValue(BlockBed.FACING))
         )) {
         this.blockPos_r = null;

         for (BlockPos var6 : BreezeClient.getModuleInitializer().map_a.keySet()) {
            if (BreezeClient.CONST_A.theWorld.getBlockState(var6).getBlock() instanceof BlockBed || var4 != 0) {
               if (this.isValid(var6)
                  || this.isValid(var6.offset((net.minecraft.util.EnumFacing)BreezeClient.CONST_A.theWorld.getBlockState(var6).getValue(BlockBed.FACING)))) {
                  this.blockPos_r = var6;
                  if (var4 == 0) {
                     break;
                  }
               }

               if (var4 != 0) {
                  break;
               }
            }
         }
      }

      if (this.blockPos_r == null) {
         this.blockPos_q = null;
         this.fieldBool_t = false;
         if (this.fieldInt_s != -1) {
            BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_s;
            this.fieldInt_s = -1;
         }
      } else {
         label130: {
            List var17 = this.getDistance(this.blockPos_r);
            if (this.set_p.contains(this.blockPos_r)
               || checkCondition(
                  this.blockPos_r, (net.minecraft.util.EnumFacing)BreezeClient.getModuleInitializer().map_a.get(this.blockPos_r).getValue(BlockBed.FACING)
               )) {
               label84: {
                  this.set_p.add(this.blockPos_r);
                  BlockPos var18 = this.blockPos_r
                     .offset((net.minecraft.util.EnumFacing)BreezeClient.CONST_A.theWorld.getBlockState(this.blockPos_r).getValue(BlockBed.FACING));
                  double var7 = BreezeClient.CONST_A.thePlayer.getDistanceSq(var18);
                  double var9 = BreezeClient.CONST_A.thePlayer.getDistanceSq(this.blockPos_r);
                  if (var9 <= var7) {
                     this.blockPos_q = this.blockPos_r;
                     if (var4 == 0) {
                        break label84;
                     }
                  }

                  this.blockPos_q = var18;
               }

               if (var4 == 0) {
                  break label130;
               }
            }

            if (!var17.contains(this.blockPos_q) || !this.isValid(this.blockPos_q)) {
               BlockPos var19 = null;
               double var21 = Float.MAX_VALUE;

               for (BlockPos var12 : var17) {
                  double var13 = BreezeClient.CONST_A.thePlayer.getDistanceSq(var12);
                  if (var13 < var21) {
                     var19 = var12;
                     var21 = var13;
                  }

                  if (var4 != 0) {
                     break;
                  }
               }

               if (var19 == null) {
                  this.blockPos_q = null;
                  this.fieldBool_t = false;
                  if (this.fieldInt_s != -1) {
                     BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_s;
                     this.fieldInt_s = -1;
                  }

                  return;
               }

               this.blockPos_q = var19;
            }
         }

         if (this.fieldInt_s == -1) {
            this.fieldInt_s = BreezeClient.CONST_A.thePlayer.inventory.currentItem;
         }

         BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.getValue_2(this.blockPos_q);
         MinecraftAccessor.initialize_68(BreezeClient.CONST_A.playerController);
         float[] var20 = RotationUtil7.getAnglesTo(
            new Vec3(this.blockPos_q.getX() + 0.5, this.blockPos_q.getY() + 0.5, this.blockPos_q.getZ() + 0.5), BreezeClient.CONST_A.thePlayer
         );
         var1.isActive(false).isActive_2(true).isValid(var20, 50.0F);
         AxisAlignedBB var15 = BreezeClient.CONST_A
            .theWorld
            .getBlockState(this.blockPos_q)
            .getBlock()
            .getCollisionBoundingBox(BreezeClient.CONST_A.theWorld, this.blockPos_q, BreezeClient.CONST_A.theWorld.getBlockState(this.blockPos_q));
         if (var15 != null) {
            Vec3 var16 = BreezeClient.CONST_A.thePlayer.getPositionEyes(MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks);
            Vec3 var22 = MinecraftAccessor.getVec3(BreezeClient.CONST_A.thePlayer, var1.getFloat(), var1.getFloat_g());
            MovingObjectPosition var23 = var15.calculateIntercept(var16, var16.addVector(var22.xCoord * 4.5, var22.yCoord * 4.5, var22.zCoord * 4.5));
            if (var23 != null) {
               this.fieldBool_t = true;
               BreezeClient.CONST_A.playerController.clickBlock(this.blockPos_q, var23.sideHit);
               if (BreezeClient.CONST_A.theWorld.getBlockState(this.blockPos_q).getBlock().getMaterial() != Material.air
                  && BreezeClient.CONST_A.playerController.onPlayerDamageBlock(this.blockPos_q, var23.sideHit)) {
                  BreezeClient.CONST_A.effectRenderer.addBlockHitEffects(this.blockPos_q, var23.sideHit);
                  BreezeClient.CONST_A.thePlayer.swingItem();
                  if (var4 == 0) {
                     return;
                  }
               }

               this.fieldBool_t = false;
               BreezeClient.CONST_A.playerController.resetBlockRemoving();
            }
         }
      }
   }

   @EventListener
   public void processAll_1(MouseClickedEventEvent var1) {
      long var2 = 100835340611509L;
      if (this.fieldBool_t) {
         var1.a();
      }
   }

   @EventListener
   public void processAll(ScriptRenderEvent var1) {
      long var2 = 114362755586513L;
      int var10000 = AntiBot.getValue_2();
      Iterator var4 = BreezeClient.getModuleInitializer().map_a.entrySet().iterator();
      int var5 = var10000;

      while (var4.hasNext()) {
         Entry var6 = (Entry)var4.next();
         if (!checkCondition((BlockPos)var6.getKey(), (net.minecraft.util.EnumFacing)((IBlockState)var6.getValue()).getValue(BlockBed.FACING))) {
            this.set_p.remove(var6.getKey());
         }

         if (var5 == 0) {
            break;
         }
      }
   }

   @EventListener
   public void getHitbox(Render3DEventEvent var1) {
      long var2 = 48807510995720L;
      int var10000 = AntiBot.getValue();
      Iterator var4 = new HashSet<>(this.set_p).iterator();
      int var5 = var10000;

      while (var4.hasNext()) {
         BlockPos var6 = (BlockPos)var4.next();
         if (!BreezeClient.getModuleInitializer().map_a.containsKey(var6)) {
            this.set_p.remove(var6);
         }

         if (var5 != 0) {
            break;
         }
      }

      if (this.blockPos_r != null && BreezeClient.getModuleInitializer().map_a.containsKey(this.blockPos_r)) {
         AxisAlignedBB var7;
         label45: {
            net.minecraft.util.EnumFacing var8 = (net.minecraft.util.EnumFacing)BreezeClient.getModuleInitializer()
               .map_a
               .get(this.blockPos_r)
               .getValue(BlockBed.FACING);
            BlockPos var10 = this.blockPos_r.offset(var8);
            if (var8 == net.minecraft.util.EnumFacing.WEST || var8 == net.minecraft.util.EnumFacing.NORTH) {
               var7 = new AxisAlignedBB(
                  var10.getX(), var10.getY(), var10.getZ(), this.blockPos_r.getX() + 1, this.blockPos_r.getY() + 0.5625F, this.blockPos_r.getZ() + 1
               );
               if (var5 == 0) {
                  break label45;
               }
            }

            var7 = new AxisAlignedBB(
               this.blockPos_r.getX(), this.blockPos_r.getY(), this.blockPos_r.getZ(), var10.getX() + 1, var10.getY() + 0.5625F, var10.getZ() + 1
            );
         }

         RenderUtil31.getHitbox_4(var7, this.bedColorSetting.getObject_m(), 5.0F, false);
      }

      if (this.blockPos_q != null && !BreezeClient.CONST_A.theWorld.isAirBlock(this.blockPos_q)) {
         IBlockState var9 = BreezeClient.CONST_A.theWorld.getBlockState(this.blockPos_q);
         AxisAlignedBB var11 = new AxisAlignedBB(
            this.blockPos_q.getX(),
            this.blockPos_q.getY(),
            this.blockPos_q.getZ(),
            this.blockPos_q.getX() + 1,
            this.blockPos_q.getY()
               + (var9.getBlock().getCollisionBoundingBox(BreezeClient.CONST_A.theWorld, this.blockPos_q, var9).maxY - this.blockPos_q.getY())
                  * MinecraftAccessor.getFloat_2(BreezeClient.CONST_A.playerController),
            this.blockPos_q.getZ() + 1
         );
         RenderUtil31.calculate_2(var11, this.breakColorSetting.getObject_m(), false);
      }
   }

   @KeepParameters
   public boolean isBool_t() {
      return this.fieldBool_t;
   }

   public static List<BlockPos> getList(BlockPos var0, net.minecraft.util.EnumFacing var1) {
      long var2 = 68461427221412L;
      ArrayList var4 = new ArrayList();
      BlockPos var5 = var0.offset(var1);
      net.minecraft.util.EnumFacing[] var6 = net.minecraft.util.EnumFacing.values();
      int var10000 = AntiBot.getValue_2();
      int var7 = var6.length;
      int var8 = var10000;
      int var9 = 0;

      while (var9 < var7) {
         net.minecraft.util.EnumFacing var10 = var6[var9];
         if (var10 != var1 && var10 != net.minecraft.util.EnumFacing.DOWN) {
            var4.add(var0.offset(var10));
         }

         if (var10 != var1.getOpposite() && var10 != net.minecraft.util.EnumFacing.DOWN) {
            var4.add(var5.offset(var10));
         }

         var9++;
         if (var8 == 0) {
            break;
         }
      }

      return var4;
   }

   public static boolean checkCondition(BlockPos var0, net.minecraft.util.EnumFacing var1) {
      long var2 = 43532155673796L;
      int var10000 = AntiBot.getValue_2();
      Iterator var4 = getList(var0, var1).iterator();
      int var5 = var10000;

      while (var4.hasNext()) {
         BlockPos var6 = (BlockPos)var4.next();
         if (!BreezeClient.CONST_A.theWorld.isBlockFullCube(var6)) {
            return true;
         }

         if (var5 == 0) {
            break;
         }
      }

      return false;
   }

   private List<BlockPos> getDistance(BlockPos var1) {
      long var2 = 84836652230237L;
      double var4 = Double.MIN_VALUE;
      int var6 = BreezeClient.CONST_A.thePlayer.inventory.currentItem;
      int var10000 = AntiBot.getValue();
      ArrayList var7 = new ArrayList();
      net.minecraft.util.EnumFacing var8 = (net.minecraft.util.EnumFacing)BreezeClient.getModuleInitializer().map_a.get(var1).getValue(BlockBed.FACING);
      int var9 = var10000;

      for (net.minecraft.util.EnumFacing var13 : net.minecraft.util.EnumFacing.values()) {
         if (var13 != var8 && (var13 != net.minecraft.util.EnumFacing.DOWN || var9 != 0)) {
            BlockPos var14 = var1.offset(var13);
            if (!(BreezeClient.CONST_A.thePlayer.getDistanceSq(var14.getX() + 0.5, var14.getY() + 0.5, var14.getZ() + 0.5) > 20.25) || var9 != 0) {
               BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.getValue_2(var14);
               double var15 = BreezeClient.CONST_A
                  .theWorld
                  .getBlockState(var14)
                  .getBlock()
                  .getPlayerRelativeBlockHardness(BreezeClient.CONST_A.thePlayer, BreezeClient.CONST_A.theWorld, var14);
               if (!(var15 < var4) || var9 != 0) {
                  if (var15 > var4) {
                     var7.clear();
                     var4 = var15;
                  }

                  var7.add(var14);
               }
            }
         }

         if (var9 != 0) {
            break;
         }
      }

      BlockPos var20 = var1.offset(var8);

      for (net.minecraft.util.EnumFacing var24 : net.minecraft.util.EnumFacing.values()) {
         if (var24 != var8.getOpposite() && (var24 != net.minecraft.util.EnumFacing.DOWN || var9 != 0)) {
            BlockPos var17 = var20.offset(var24);
            if (!(BreezeClient.CONST_A.thePlayer.getDistanceSq(var17.getX() + 0.5, var17.getY() + 0.5, var17.getZ() + 0.5) > 20.25) || var9 != 0) {
               BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.getValue_2(var17);
               double var18 = BreezeClient.CONST_A
                  .theWorld
                  .getBlockState(var17)
                  .getBlock()
                  .getPlayerRelativeBlockHardness(BreezeClient.CONST_A.thePlayer, BreezeClient.CONST_A.theWorld, var17);
               if (!(var18 < var4) || var9 != 0) {
                  if (var18 > var4) {
                     var7.clear();
                     var4 = var18;
                  }

                  var7.add(var17);
               }
            }
         }

         if (var9 != 0) {
            break;
         }
      }

      BreezeClient.CONST_A.thePlayer.inventory.currentItem = var6;
      return var7;
   }

   public int getValue_2(BlockPos var1) {
      long var2 = 113278323089131L;
      int var10000 = AntiBot.getValue();
      int var4 = -1;
      int var5 = var10000;
      float var6 = 1.0F;
      IBlockState var7 = BreezeClient.CONST_A.theWorld.getBlockState(var1);
      int var8 = 0;

      while (var8 < 9) {
         ItemStack var9 = BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var8);
         if (var9 != null || var5 != 0) {
            float var10 = var9.getStrVsBlock(var7.getBlock());
            if (var10 > var6 || var10 >= var6 && var8 == BreezeClient.CONST_A.thePlayer.inventory.currentItem) {
               var4 = var8;
               var6 = var10;
            }
         }

         var8++;
         if (var5 != 0) {
            break;
         }
      }

      return var4 == -1 ? BreezeClient.CONST_A.thePlayer.inventory.currentItem : var4;
   }

   private boolean isValid(BlockPos var1) {
      long var2 = 89750512256765L;
      return var1.distanceSqToCenter(
            BreezeClient.CONST_A.thePlayer.posX,
            BreezeClient.CONST_A.thePlayer.posY + BreezeClient.CONST_A.thePlayer.getEyeHeight(),
            BreezeClient.CONST_A.thePlayer.posZ
         )
         <= 20.25;
   }

   static {
      long var0 = 8720034000699L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "T1XÚ\rC7H\u008eà!VÔ\u008eÌËW\u0089ÆMªnÀ^êp\u0016¹EñÐKu\u0080ó¸à½¸\u0007\u001e¤®ÕÄ\u0019?p \u0098æy¤G¤d°sxY\u0018Û(2¤^©T\\<\u001a\u001c\u0092$ïìn\u008eÝ\u0006/";
      int var7 = "T1XÚ\rC7H\u008eà!VÔ\u008eÌËW\u0089ÆMªnÀ^êp\u0016¹EñÐKu\u0080ó¸à½¸\u0007\u001e¤®ÕÄ\u0019?p \u0098æy¤G¤d°sxY\u0018Û(2¤^©T\\<\u001a\u001c\u0092$ïìn\u008eÝ\u0006/"
         .length();
      char var8 = '0';
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
                     CONST_V = var4;
                     CONST_W = new String[4];
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

                  var6 = "\u009e\u0091\u0081K°Kñ}|\u001bPCcg¼\u00133õf\u008b\u0007ßîÉá\u0080ÃÌ\u0018¼G\ra=;9ãûv®\b´÷ó£Mç\u0095\u0088Î\u0081'°àÆ\u0088½EÉ\u008e\u000e©å\u009cìR\u0019\n\\\u0091>\u0098 &\u001b?´þ\u0097]Ôµ}0L@\b\u0090ì£ûÎt\u0081\u001c\u009fÄ¨\u0007U\u0089\u0006F\u0012\u0098";
                  var7 = "\u009e\u0091\u0081K°Kñ}|\u001bPCcg¼\u00133õf\u008b\u0007ßîÉá\u0080ÃÌ\u0018¼G\ra=;9ãûv®\b´÷ó£Mç\u0095\u0088Î\u0081'°àÆ\u0088½EÉ\u008e\u000e©å\u009cìR\u0019\n\\\u0091>\u0098 &\u001b?´þ\u0097]Ôµ}0L@\b\u0090ì£ûÎt\u0081\u001c\u009fÄ¨\u0007U\u0089\u0006F\u0012\u0098"
                     .length();
                  var8 = 'H';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32381;
      if (CONST_W[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_X.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_X.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dJ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_V[var3].getBytes("ISO-8859-1");
         CONST_W[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_W[var3];
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
         throw new RuntimeException("rip/breeze/client/dJ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
