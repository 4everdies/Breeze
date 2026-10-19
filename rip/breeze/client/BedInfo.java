package rip.breeze.client;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "BedInfo", b = "Shows bed information, useful for Bedwars!", d = rip.breeze.ModuleCategory.VISUAL, c = {"bed", "bedwars"})
public class BedInfo extends BreezeModule {
   private final GenericSetting<EnumType21> fontSetting;
   private final GenericSetting<Double> backgroundSetting;
   private final GenericSetting<Boolean> backgroundColorSetting;
   private final GenericSetting<rip.breeze.BreezeColor> roundingSetting;
   private final GenericSetting<Double> teamNameSetting;
   private final GenericSetting<Boolean> distanceSetting;
   private final GenericSetting<Boolean> breakTimeSetting;
   private final GenericSetting<Boolean> nukeReadySetting;
   private final GenericSetting<Boolean> dataBuilder54_v;
   private final GenericSetting<Boolean> dataBuilder54_w;
   private final Map<BlockPos, BlockUtil8> map_x;
   private final Map<BlockPos, Map<Integer, Float>> map_y;
   private final Map<UUID, MathUtil7> map_z;
   private int fieldInt_A;
   private ItemStack itemStack_B;
   private long fieldLong_C;
   private static final int CONST_D;
   private static final int CONST_E;
   private static final int CONST_F;
   private static final String CONST_G;
   private static final float CONST_H = 4.0F;
   private static final int CONST_I;
   private static final int CONST_J;
   private static final Color CONST_K;
   private static final int[][][] CONST_L;
   private static final String CONST_M;
   private static final Map<Integer, String> CONST_N;
   private static final float CONST_O = Float.MAX_VALUE;
   private static final double CONST_P = 36.0;
   private static final int CONST_Q;
   private static final int CONST_R;
   private static final float CONST_S = 4.0F;
   private static final float CONST_T = 2.0F;
   private static final float CONST_U = 1.0F;
   private static final float CONST_V = 0.2F;
   private static final float CONST_W = 1.0F;
   private static final float CONST_X = 1.5F;
   private static final double CONST_Y = 35.0;
   private static final double CONST_Z = 30.0;
   private static final double CONST_AA = 0.9976;
   private static final double CONST_AB = 0.9925;
   private static final double CONST_AC = 0.9781;
   private static final float CONST_AD = 1.0F;
   private static final float CONST_AE = 0.9F;
   private static final float CONST_AF = 0.2F;
   private static final float CONST_AG = 0.45F;
   private static final float CONST_AH = 0.14F;
   private static final float CONST_AI = 3.0F;
   private static final double CONST_AJ = 200.0;
   private static final double CONST_AK = 484.0;
   private static final String[] CONST_HB;
   private static final String[] CONST_IB;
   private static final Map CONST_JB = new HashMap(13);
   private static final long[] CONST_KB;
   private static final Integer[] CONST_LB;
   private static final Map CONST_MB;

   public BedInfo() {
      long var1 = 80372910240585L;
      super();
      short var10002 = 10007;
      long var10003 = 7134588670881526251L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Font");
      var10002 = 26419;
      var10003 = 903244611950719455L ^ var1;
      this.fontSetting = var10001.getDataBuilder50_3("Which font to draw the info with. HUD follows your HUD font style (which can itself be the ingame font).")
         .getDataBuilder50_4(EnumType21.HUD)
         .getDataBuilder50_10(BedInfo::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 23454;
      var10003 = 6107312850355359086L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "The size of the bed panels.");
      var10002 = 27221;
      var10003 = 8508098934169746598L ^ var1;
      this.backgroundSetting = var10001.getDataBuilder50_3("Background")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.5, 2.0))
         .getDataBuilder54();
      var10002 = 11518;
      var10003 = 1252446114899229246L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Background behind the billboard.");
      var10002 = 9181;
      var10003 = 7472540491534267675L ^ var1;
      this.backgroundColorSetting = var10001.getDataBuilder50_3("BackgroundColor").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 12911;
      var10003 = 5855583566270719106L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "The background color.");
      var10002 = 14503;
      var10003 = 4070101534210616905L ^ var1;
      this.roundingSetting = var10001.getDataBuilder50_3("Rounding")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(0, 0, 0, 120))
         .getDataBuilder50_8()
         .getDataBuilder50_9(BedInfo::lambda$new_Inner1)
         .getDataBuilder54();
      var10002 = 12086;
      var10003 = 1988916710788266455L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "TeamName");
      var10002 = 3954;
      var10003 = 6015829476112193925L ^ var1;
      this.teamNameSetting = var10001.getDataBuilder50_3(
            "Color the team label and the progress bar with the team the bed belongs to. Needs a team mode with colors (Hypixel or Generic) under Targeting."
         )
         .getDataBuilder50_4(3.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 8.0))
         .getDataBuilder50_9(BedInfo::lambda$new_Inner2)
         .getDataBuilder54();
      var10002 = 10677;
      var10003 = 6153883019123851072L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Show the blocks the bed is covered with, layer by layer.");
      var10002 = 27604;
      var10003 = 4615990562898197810L ^ var1;
      this.distanceSetting = var10001.getDataBuilder50_3("Distance").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 5684;
      var10003 = 7961612091036877022L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Show how far away the bed is.");
      var10002 = 20547;
      var10003 = 1356256122325567112L ^ var1;
      this.breakTimeSetting = var10001.getDataBuilder50_3("BreakTime").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 8733;
      var10003 = 3522210215847097567L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Show how long breaking through the cover and the bed still takes with the item you are holding.");
      var10002 = 2040;
      var10003 = 3545237920402657599L ^ var1;
      this.nukeReadySetting = var10001.getDataBuilder50_3("NukeReady").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 15751;
      var10003 = 8187362396446452604L ^ var1;
      this.dataBuilder54_v = GenericSetting.<Boolean>getDataBuilder50(
            this,
            "Show a nuke indicator icon on the panel: grayed out while the bed is still covered, glowing once a block touching it is gone and the bed can be broken."
         )
         .getDataBuilder50_3("Show how long breaking through the cover and the bed still takes with the item you are holding.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      this.dataBuilder54_w = GenericSetting.<Boolean>getDataBuilder50(this, "NukeReady")
         .getDataBuilder50_3("Show a nuke indicator icon on the panel: grayed out while the bed is still covered, glowing once a block touching it is gone and the bed can be broken.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      this.map_x = new HashMap<>();
      this.map_y = new HashMap<>();
      this.map_z = new HashMap<>();
   }

   @Override
   protected void initialize() {
      this.map_x.clear();
   }

   @EventListener
   public void processPlayers(WorldChangedEventEvent var1) {
      this.map_x.clear();
      this.map_y.clear();
      this.map_z.clear();
   }

   @EventListener
   public void calculate(PreTickEventEvent var1) {
      if (BreezeClient.CONST_A.theWorld != null && BreezeClient.CONST_A.thePlayer != null) {
         this.fieldInt_A++;
         this.processAll();
         this.updateRotation();

         for (BlockUtil8 var3 : this.map_x.values()) {
            if (var3.fieldBool_m) {
               this.calculate_4(var3);
               var3.fieldBool_m = false;
            }
         }

         this.processAll_2();
         if (this.fieldInt_A % 20 == 0) {
            for (BlockUtil8 var5 : this.map_x.values()) {
               this.calculate_3(var5);
            }
         }
      }
   }

   private void updateRotation() {
      for (EntityPlayer var2 : new ArrayList(BreezeClient.CONST_A.theWorld.playerEntities)) {
         UUID var3 = var2.getUniqueID();
         Vec3 var4 = new Vec3(var2.posX, var2.posY, var2.posZ);
         MathUtil7 var5 = this.map_z.get(var3);
         if (var5 == null) {
            var5 = new MathUtil7(var4, this.fieldInt_A);
            this.map_z.put(var3, var5);
            var5.update(var4, 1.0F, this.fieldInt_A);
         } else {
            if (this.fieldInt_A - var5.fieldInt_b == 1) {
               if (var5.vec3_a.squareDistanceTo(var4) > 36.0) {
                  var5.update(var4, 4.0F, this.fieldInt_A);
               }
            } else if (this.fieldInt_A - var5.fieldInt_b <= 200) {
               var5.update(var4, 2.0F, this.fieldInt_A);
            } else {
               var5.update(var4, 0.2F, this.fieldInt_A);
            }

            var5.initialize(var4, this.fieldInt_A);
         }

         this.calculate_2(var2, var5);
      }
   }

   private void calculate_2(EntityPlayer var1, MathUtil7 var2) {
      long var3 = 101304163890575L;
      if (var2.isValid() && this.fieldInt_A - var2.fieldInt_e >= 15) {
         Color var5 = BreezeClient.getAltManager().getColor_2(var1);
         if (var5 != null) {
            this.getDistance(var5.getRGB() & "svgs/nuke.svg", var2.vec3_c, var2.fieldFloat_d);
         }

         var2.initialize_2();
      }
   }

   private void getDistance(int var1, Vec3 var2, float var3) {
      BlockPos var4 = null;
      double var5 = 484.0;

      for (BlockUtil8 var8 : this.map_x.values()) {
         double var9 = var8.vec3_d.squareDistanceTo(var2);
         if (!(var9 >= var5)) {
            var5 = var9;
            var4 = var8.blockPos_a;
         }
      }

      if (var4 != null) {
         this.map_y.computeIfAbsent(var4, BedInfo::lambda$observe_Inner3).merge(var1, var3, Float::sum);
      }
   }

   private void processAll() {
      HashMap var1 = new HashMap<>(BreezeClient.getModuleInitializer().map_a);

      for (Entry var3 : var1.entrySet()) {
         if (!this.map_x.containsKey(var3.getKey())) {
            BlockUtil8 var4 = new BlockUtil8((BlockPos)var3.getKey(), (net.minecraft.util.EnumFacing)((IBlockState)var3.getValue()).getValue(BlockBed.FACING));
            this.calculate_4(var4);
            this.calculate_3(var4);
            this.map_x.put((BlockPos)var3.getKey(), var4);
         }
      }

      this.map_x.keySet().removeIf(BedInfo::lambda$syncBeds_Inner4);
   }

   @EventListener
   public void toggle(ScriptRenderEvent var1) {
      for (BlockUtil8 var3 : this.map_x.values()) {
         if (var1.blockPos_g.distanceSqToCenter(var3.vec3_d.xCoord, var3.vec3_d.yCoord, var3.vec3_d.zCoord) < 36.0) {
            var3.fieldBool_m = true;
         }
      }
   }

   private void calculate_3(BlockUtil8 var1) {
      Map var2 = this.map_y.get(var1.blockPos_a);
      if (var2 != null) {
         int var3 = -1;
         float var4 = 0.0F;
         float var5 = 0.0F;

         for (Entry var7 : var2.entrySet()) {
            float var8 = (Float)var7.getValue();
            if (var8 > var4) {
               var5 = var4;
               var4 = var8;
               var3 = (Integer)var7.getKey();
            } else if (var8 > var5) {
               var5 = var8;
            }
         }

         if (var3 != -1 && var4 >= 1.0F && var4 >= var5 * 1.5F) {
            var1.fieldInt_k = var3;
         }
      }
   }

   private void calculate_4(BlockUtil8 var1) {
      var1.list_e.clear();
      var1.fieldBool_l = BedNuker.checkCondition(var1.blockPos_a, var1.enumFacing_c);
      this.processAll_3(var1);
      int var2 = var1.enumFacing_c.getFrontOffsetX();
      int var3 = var1.enumFacing_c.getFrontOffsetZ();
      HashSet var4 = new HashSet();
      BlockPos[] var5 = new BlockPos[2];

      for (int var6 = 0; var6 < 4; var6++) {
         ArrayList var7 = new ArrayList();
         var4.clear();
         int var8 = 0;

         for (int[] var12 : CONST_L[var6]) {
            int var13 = var12[0] * var2 + var12[2] * var3;
            int var14 = 0;
            if (var13 <= 0) {
               var5[var14++] = var1.blockPos_a.add(var12[0], var12[1], var12[2]);
            }

            if (var13 >= 0) {
               var5[var14++] = var1.blockPos_a.add(var12[0] + var2, var12[1], var12[2] + var3);
            }

            for (int var15 = 0; var15 < var14; var15++) {
               IBlockState var16 = BreezeClient.CONST_A.theWorld.getBlockState(var5[var15]);
               Block var17 = var16.getBlock();
               if (var17.getMaterial() == Material.air) {
                  var8 -= 2;
               } else {
                  Item var18 = Item.getItemFromBlock(var17);
                  if (var18 == null) {
                     var8 -= 2;
                  } else {
                     var8++;
                     if (var4.add(Item.getIdFromItem(var18))) {
                        var7.add(var17.isFullBlock() ? new ItemStack(var18, 1, var17.getMetaFromState(var16)) : new ItemStack(var18));
                     }
                  }
               }
            }
         }

         if (var8 < 0 || var7.isEmpty()) {
            break;
         }

         var1.list_e.add(var7);
      }
   }

   @EventListener
   public void clamp(Render2DEventEvent var1) {
      if (BreezeClient.CONST_A.theWorld != null && BreezeClient.CONST_A.thePlayer != null && !this.map_x.isEmpty()) {
         Vec3 var2 = BreezeClient.CONST_A.getRenderViewEntity().getPositionEyes(var1.fieldFloat_g);
         Vec3 var3 = BreezeClient.CONST_A.getRenderViewEntity().getLook(var1.fieldFloat_g);
         long var4 = System.nanoTime();
         float var6 = this.fieldLong_C == 0L ? 0.0F : Math.min((float)(var4 - this.fieldLong_C) / 1.0E9F, 0.1F);
         this.fieldLong_C = var4;
         ArrayList var7 = new ArrayList();

         for (BlockUtil8 var9 : this.map_x.values()) {
            if (!(var2.distanceTo(var9.vec3_d) > 200.0) && (RenderUtil31.getHitbox_3(var9.blockPos_a) || RenderUtil31.getHitbox_3(var9.blockPos_b))) {
               var7.add(var9);
            }
         }

         if (!var7.isEmpty()) {
            var7.sort(BedInfo::lambda$onRender2D_Inner5);
            double var10 = Math.tan(Math.toRadians(MinecraftAccessor.getFloat_3(BreezeClient.CONST_A.entityRenderer, var1.fieldFloat_g, true) / 2.0));
            BreezeContext.iRenderer_b.endFrame();

            try {
               GlStateManager.enableBlend();
               GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
               GlStateManager.enableAlpha();
               GlStateManager.disableDepth();
               GlStateManager.depthMask(false);
               RenderUtil25.initialize();

               for (BlockUtil8 var13 : var7) {
                  this.clamp_2(var13, var2, var3, var2.distanceTo(var13.vec3_d), var6);
                  double[] var14 = RenderUtil31.vecToArray(var13.vec3_d.addVector(0.0, 0.6, 0.0));
                  if (var14 != null) {
                     this.clamp_3(var13, var2.distanceTo(var13.vec3_d), (float)var14[0], (float)var14[1], var10);
                  }
               }

               GlStateManager.disableDepth();
               RenderUtil25.processAll();
            } finally {
               BreezeContext.iRenderer_b.beginFrame();
            }
         }
      }
   }

   private void clamp_2(BlockUtil8 var1, Vec3 var2, Vec3 var3, double var4, float var6) {
      Vec3 var7 = var1.vec3_d.addVector(0.0, 0.6, 0.0).subtract(var2);
      double var8 = var4 > 35.0 ? var7.normalize().dotProduct(var3) : -1.0;
      double var10 = var1.fieldFloat_g > 0.9F ? 0.9781 : 0.9925;
      var1.fieldBool_j = var8 >= (var1.fieldBool_j ? var10 : 0.9976);
      if (var1.fieldBool_j) {
         if (var1.fieldFloat_h < 0.0F) {
            var1.fieldFloat_h = 0.0F;
         }

         var1.fieldFloat_h = Math.min(var1.fieldFloat_h + var6, 0.45F);
         var1.fieldFloat_i = 1.0F;
         var1.fieldFloat_g = Math.min(var1.fieldFloat_g + var6, 1.1F);
      } else {
         var1.fieldFloat_i = Math.max(var1.fieldFloat_i - var6, 0.0F);
         if (!(var1.fieldFloat_i > 0.0F)) {
            var1.fieldFloat_g = Math.max(var1.fieldFloat_g - var6 * 3.0F, 0.0F);
            if (var1.fieldFloat_g <= 0.0F) {
               var1.fieldFloat_h = -1.0F;
            }
         }
      }
   }

   private float calcDistance(BlockUtil8 var1, float var2, double var3) {
      if (var1.fieldFloat_g <= 0.0F && var1.fieldFloat_h < 0.0F) {
         return 1.0F;
      }

      float var5 = 1.0F;
      float var6 = (float)(var3 / Math.sqrt(30.0) * 15.0) * this.backgroundSetting.getObject_m().floatValue();
      if (var6 > var2) {
         float var7 = BlockUtil7.clamp((var1.fieldFloat_g - 0.9F) / 0.2F, 0.0F, 1.0F);
         var5 += (var6 / var2 - 1.0F) * (var7 * var7 * (3.0F - 2.0F * var7));
      }

      if (var1.fieldFloat_h >= 0.0F && var1.fieldFloat_h < 0.45F) {
         float var8 = (float)Math.sin(var1.fieldFloat_h / 0.45F * Math.PI);
         var5 *= 1.0F + var8 * var8 * 0.14F;
      }

      return var5;
   }

   private void clamp_3(BlockUtil8 var1, double var2, float var4, float var5, double var6) {
      long var8 = 35651143959728L;
      if (this.itemStack_B == null) {
         this.itemStack_B = new ItemStack(Items.bed);
      }

      boolean var10 = this.dataBuilder54_w.getObject_m();
      ArrayList var11 = new ArrayList();
      var11.add(this.itemStack_B);
      if (this.breakTimeSetting.getObject_m()) {
         for (List var13 : var1.list_e) {
            var11.add(null);
            var11.addAll(var13);
         }
      }

      float[] var55 = this.getBedBounds(var1);
      float var56 = var55 == null ? 0.0F : var55[0];
      float var14 = var55 != null && !(var55[1] <= 0.0F) ? BlockUtil7.clamp(1.0F - var56 / var55[1], 0.0F, 1.0F) : 0.0F;
      String var15 = "";
      if (this.nukeReadySetting.getObject_m()) {
         var15 = (int)var2 + "m";
      }

      if (this.dataBuilder54_v.getObject_m() && var55 != null && var56 > 0.0F) {
         var15 = var15
            + (var15.isEmpty() ? "" : " ")
            + ChatFormatting.GRAY
            + String.format(Locale.ROOT, "%.1fs", var56 / 20.0F);
      }

      double var16 = 1.0 / (2.0 * var6);
      float var18 = (float)(var16 / Math.sqrt(Math.max(var2, 0.1)) * 15.0) * this.backgroundSetting.getObject_m().floatValue();
      float var19 = var18 * this.calcDistance(var1, var18, var16);
      MathUtil2 var20 = RenderUtil25.clamp(this.fontSetting.getObject_m(), 9.0F * var19);
      float var21 = 3.0F * var19;
      float var22 = 16.0F * var19;
      float var23 = 18.0F * var19;
      float var24 = 5.0F * var19;
      String var25 = this.distanceSetting.getObject_m() ? buildString(var1) : "";
      float var26 = var20.calculateFloat_3();
      float var27 = 4.0F * var19;
      float var28 = var10 ? var26 * 1.2F : 0.0F;
      float var29 = var25.isEmpty() ? 0.0F : var20.calculateFloat(var25);
      float var30 = var15.isEmpty() ? 0.0F : var20.calculateFloat(var15);
      float var31 = var29;
      if (!var15.isEmpty()) {
         var31 += (var31 > 0.0F ? var27 : 0.0F) + var30;
      }

      if (var10) {
         var31 += (var31 > 0.0F ? var27 : 0.0F) + var28;
      }

      float var32 = var31 > 0.0F ? var26 : 0.0F;
      float var33 = clamp_4(var11);
      float var34 = var33 * var19;
      float var35 = Math.max(var34, var31) + var21 * 2.0F;
      float var36 = var21 * 2.0F + var22 + (var32 > 0.0F ? var19 + var32 : 0.0F);
      float var37 = var4 - var35 * 0.5F;
      float var38 = var5 - var36;
      float var39 = var5;
      Color var40 = this.getColor(var1);
      GlStateManager.disableDepth();
      if (this.backgroundColorSetting.getObject_m()) {
         RenderUtil28.render(var37, var38, var35, var36, (float)(this.teamNameSetting.getObject_m() * var19), this.roundingSetting.getObject_m());
      }

      float var41 = Math.max(2.0F, var20.calculateFloat_3() * 0.24F);
      float var42 = var35 * 0.66F;
      float var43 = var4 - var42 * 0.5F;
      float var44 = var39 - var41 * 0.5F;
      float var45 = var41 * 0.333F;
      RenderUtil28.render_1(var43, var44 + var41 / 2.0F, var42, var41 / 2.0F, 0.0F, 0.0F, var45, var45, this.roundingSetting.getObject_m());
      if (var14 > 0.0F) {
         float var46 = Math.max(var41, var42 * var14);
         RenderUtil28.render(var43, var44, var46, var41, var45, new Color(var40.getRed(), var40.getGreen(), var40.getBlue(), 255));
      }

      float var57 = var4 - var34 * 0.5F;
      float var47 = var38 + var21;
      Color var48 = new Color(255, 255, 255, 90);
      float var49 = Math.max(1.0F, var19);
      float var50 = var22 * 0.6F;
      float var51 = 0.0F;

      for (ItemStack var53 : var11) {
         if (var53 == null) {
            RenderUtil28.render(var57 + var51 + (var24 - var49) * 0.5F, var47 + (var22 - var50) * 0.5F, var49, var50, var49 * 0.5F, var48);
            var51 += var24;
         } else {
            var51 += var23;
         }
      }

      var51 = 0.0F;

      for (ItemStack var61 : var11) {
         if (var61 == null) {
            var51 += var24;
         } else {
            RenderUtil28.calculate_12(var61, var57 + var51, var47, var22, false);
            var51 += var23;
         }
      }

      if (var31 > 0.0F) {
         float var60 = var38 + var21 + var22 + var19;
         float var62 = var60 - var20.calculateFloat_4();
         float var54 = var4 - var31 * 0.5F;
         if (!var25.isEmpty()) {
            RenderUtil25.processNullable(var20, var54, var62, var25, this.getColor(var1), !this.backgroundColorSetting.getObject_m());
            var54 += var29 + var27;
         }

         if (!var15.isEmpty()) {
            RenderUtil25.processNullable(var20, var54, var62, var15, Color.WHITE, !this.backgroundColorSetting.getObject_m());
            var54 += var30 + var27;
         }

         if (var10) {
            this.render(var54, var60 + (var26 - var28) * 0.5F, var28, var1);
         }
      }
   }

   private void render(float var1, float var2, float var3, BlockUtil8 var4) {
      long var5 = 80850065143830L;
      GlStateManager.disableDepth();
      if (!var4.fieldBool_l) {
         RenderUtil28.calculate_13("svgs/nuke.svg", var1, var2, var3, var3, 4.0F, CONST_K, CONST_K, 0);
      } else {
         Color var7 = this.getColor(var4);
         Color var8 = new Color(var7.getRed(), var7.getGreen(), var7.getBlue(), 200);
         RenderUtil28.calculate_13("svgs/nuke.svg", var1, var2, var3, var3, 4.0F, var7, var8, 6);
      }
   }

   private void processAll_2() {
      if (MinecraftAccessor.isValid_5(BreezeClient.CONST_A.playerController)) {
         BlockPos var1 = MinecraftAccessor.getBlockPos(BreezeClient.CONST_A.playerController);
         if (var1 != null && BreezeClient.CONST_A.theWorld.isBlockFullCube(var1)) {
            for (BlockUtil8 var3 : this.map_x.values()) {
               if (!var3.fieldBool_l && !var1.equals(var3.blockPos_n) && var3.set_f.contains(var1)) {
                  var3.blockPos_n = var1;
                  var3.iBlockState_o = BreezeClient.CONST_A.theWorld.getBlockState(var1);
               }
            }
         }
      }
   }

   private void processAll_3(BlockUtil8 var1) {
      if (!var1.fieldBool_l) {
         if (var1.blockPos_n == null || !BreezeClient.CONST_A.theWorld.isBlockFullCube(var1.blockPos_n)) {
            float var2 = Float.MAX_VALUE;
            BlockPos var3 = null;

            for (BlockPos var5 : var1.set_f) {
               if (BreezeClient.CONST_A.theWorld.isBlockFullCube(var5)) {
                  float var6 = BreezeClient.CONST_A.theWorld.getBlockState(var5).getBlock().getBlockHardness(BreezeClient.CONST_A.theWorld, var5);
                  if (!(var6 < 0.0F) && var6 < var2) {
                     var2 = var6;
                     var3 = var5;
                  }
               }
            }

            if (var3 != null) {
               var1.blockPos_n = var3;
               var1.iBlockState_o = BreezeClient.CONST_A.theWorld.getBlockState(var3);
            }
         }
      }
   }

   private float[] getBedBounds(BlockUtil8 var1) {
      float var2 = calculateFloat(BreezeClient.CONST_A.theWorld.getBlockState(var1.blockPos_a), var1.blockPos_a);
      float var3 = var1.iBlockState_o == null ? 0.0F : calculateFloat(var1.iBlockState_o, var1.blockPos_n);
      if (var2 != Float.MAX_VALUE && var3 != Float.MAX_VALUE) {
         float var4 = var3 + var2;
         float var5 = (var1.fieldBool_l ? 0.0F : var3) + var2;
         BlockPos var6 = MinecraftAccessor.isValid_5(BreezeClient.CONST_A.playerController)
            ? MinecraftAccessor.getBlockPos(BreezeClient.CONST_A.playerController)
            : null;
         if (var6 != null) {
            float var7 = BlockUtil7.clamp(MinecraftAccessor.getFloat_2(BreezeClient.CONST_A.playerController), 0.0F, 1.0F);
            if (var6.equals(var1.blockPos_a) || var6.equals(var1.blockPos_b)) {
               var5 -= var7 * var2;
            } else if (!var1.fieldBool_l && var6.equals(var1.blockPos_n)) {
               var5 -= var7 * var3;
            }
         }

         return new float[]{BlockUtil7.clamp(var5, 0.0F, var4), var4};
      } else {
         return null;
      }
   }

   private static float calculateFloat(IBlockState var0, BlockPos var1) {
      if (var0 != null && var0.getBlock().getMaterial() != Material.air) {
         float var2 = var0.getBlock().getPlayerRelativeBlockHardness(BreezeClient.CONST_A.thePlayer, BreezeClient.CONST_A.theWorld, var1);
         return var2 <= 0.0F ? Float.MAX_VALUE : 1.0F / var2;
      } else {
         return 0.0F;
      }
   }

   private Color getColor(BlockUtil8 var1) {
      return this.distanceSetting.getObject_m() && var1.fieldInt_k != -1 ? new Color(var1.fieldInt_k) : BreezeClient.getKeybindSettings().getColor();
   }

   private static String buildString(BlockUtil8 var0) {
      long var1 = 11793361469773L;
      if (var0.fieldInt_k == -1) {
         return "Team Unknown";
      }

      String var3 = CONST_N.get(var0.fieldInt_k & "svgs/nuke.svg");
      return var3 == null ? "Team Unknown" : var3 + " Team";
   }

   private static int clamp_4(List<ItemStack> var0) {
      byte var1 = 0;

      for (ItemStack var3 : var0) {
         var1 += var3 == null ? 5 : 18;
      }

      return Math.max(0, var1 - 2);
   }

   private static int lambda$onRender2D_Inner5(Vec3 var0, BlockUtil8 var1, BlockUtil8 var2) {
      return Double.compare(var0.squareDistanceTo(var2.vec3_d), var0.squareDistanceTo(var1.vec3_d));
   }

   private static boolean lambda$syncBeds_Inner4(Map var0, BlockPos var1) {
      return !var0.containsKey(var1);
   }

   private static Map lambda$observe_Inner3(BlockPos var0) {
      return new HashMap<>();
   }

   private static boolean lambda$new_Inner2(rip.breeze.DateUtil var0) {
      long var1 = 136595797523038L;
      return var0.getObject("Background", Boolean.class);
   }

   private static boolean lambda$new_Inner1(rip.breeze.DateUtil var0) {
      long var1 = 64459689281553L;
      return var0.getObject("Background", Boolean.class);
   }

   private static void lambda$new_Inner0(EnumType21 var0) {
      RenderUtil25.toggle();
   }

   static {
      long var0 = 109701289892597L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[45];
      int var5 = 0;
      String var6 = "½%th\u0088å\u0004<?\u009fb²üÕ?: \u00adÖû!»\u008e¨³s\u009e?\u00037d¼\u000bÏbüjB\u0000pUg\"J¿\u009f\u0096h?\u0010>%\u0098ÚfX\u0092ôü\u0013É9\u0015\u0093E\u0017\u0010u\u009fK\u00902}Hþ\u0015<¡\u0014\u0089ÅaÜ \u0097M©\u0094%®+è\f¢\u0087³h§_Ò\u0002s@\u001cfML\u001aêKÍp\u008bt2É\u0010çû°ãD× \u0019\u0017ó=HÅ·aÐÐ\u00876Øë\u00ad\u0095à\u0087Nä\u0018\u0002a`\u0081\u0092â´°òÙ\u0017\u0097ªk¸+ènÆ(ÛD0éú¡¸^Ç?T¥p\u0005j=±\u0004ê³¨]n\u00ad\u000b4 \u0085 \u008f x¼\u0013þÂ\u0092=¯Á\u0006\u0007þ\u0099Vfù\u000b\u0002\u0006\u0097\u0080\u0081\u009aù¾9\u0087\u0007VXÈ|\u0080v\t\u0093þÓ)7^G_LìºJ\u001a\u0013ÊD\u0084\u001fM\u0001kGx\u0011Ú\u0089ÊÙüô\u008f>ï\u0090bÌ¬\b\u0099H\u0085ç\u0010d\u0012'çtò\u001e7¯\u001b\u0018N4FÉ\u0095åïÄ'\u001eXûF\u00adE\u0085[\u008enÍ\u0003Ü«g·D)I!\u0004\u0081>Á\u0016\u009d×®h\u0091âÿ\u00921}ç\u0097\u009d\u0099\u0011\"9\u0093âDÉ©} \u009a´x\u0080\u0086m\u008aU\u0017\u008d-fÁ\"\u0091\u008a[\u001aés¹v\u0089Ju\u0012¢\u009c\u0005!=/\u0010Ì3\u0093\u0006l½ÕýëÅïüÉ\u0000!A ;\u0012¦ÁdÑR¦\u0016X\u0089ZùKÀ{æ]TÏ£n}\\W3\u0006\u0082\u0012\u0011§w\u0010.\u0088©¹«f¯\u008dº\u0010\u008fÐF\u0091c8 (¡Ýjuòã<òÊºÝôsí`â\bËêÎ3fÅ3-Ý\u001f\u008d\u000fme¨¬´wËù¶ùÔ¥N²j,\u0013ro\t-¹NØÒò²KEÓ\u0095ööäÌ\u0085q\u0005Ç]°·\u0096@ªì½D¢\u008añæ}X£\u001cDô÷¯$³hS`Ï\u001b)Ê\u009c\u009e\u008a\u000fî,Ú0\u000fG1è{!Ï\u0099¶æ?À\u000bÅ¹º_Ð(\u0088'öNauìº|\u0010Ã\u0090(õzQSÄÛD©\u0098Ng¿\u001fÒ_Inner5\u008f\rËý\u0007r\u008dS\u008aï³*¬ß%)hPSnê\u0093ç\u000f\u001dI÷ä;\u0088\u0019¦Èå âoAÐ\n(÷¡¶\u0085Ï F\u0019\u0016«\u008f«`È\"éç yEÐZ\u008dF»·EÊËÞ¿ÅÔÝz\u007f¿h({løäQÁ\u0012%jìP¯mU/¦+\u0006}\u0014\u008a)\u0096ú\u008f\u0087ãè·Ï*\u0084&jK\u000eO\u0082Åk \u009d@ç\u0013æø\\ÆM¦+9~qÆ\u0016o/#¹,¬±EÜ*¼vÙoä\t\u0010?\u0013G$Â\u0087£\u0003àz\u0011°ÛüX\u0080\u0010¦\u000f\u0000í¥_7ÙÔý({\u000bªt\u0080\u0010\u009c hu½\u0015]5ºß\u0085Ç\u000b\u0081îZ0V#Ø\u0081!<¾êÌÅ5÷®¢ èÆ\u0004F\u009f#Iv\t\u008cNG\u0091/\u001e+-¤q|[¨àL3æ\u0097;\u0081\u0019pÚ>\u0010Ã\u008d\u008d·ÖÂ\u001a\fë\tàá\u0014·Sæ \u001fK\u0091g×«\u001d\u001axUgÞ\u0017'\u000fí`|Sè¼ÍÞtY~26YO]\u000e \u001e2\u0017[ÿ«oiBQ\u000f\u00ad¶¤\u008c\u0007\u008d\u008c¹*\u0090(¤b\u0003Ò¨9,»ë(h,\u0099\u00024p±ÁÄ2*Ù\rÊa]&\t¥{jfI\u0018PÂ³Î\u00199²Ø)m:taÒmuÔ©ÏÂdîQ\u0099@ñ¡\u0018\b\u0017æë¾E@Þ\u00053\u0083ïP\u0095ÎWØ¯ò¹ë\u001dÐ\u0017Ïc'\u009b«ØJ¬]¼ál»NS\u000fÓ5Þ\u00ad\u0090÷]\u0004\u0085L\u009b{ò\u0010\u0085ú4øk\u0087(WC¶\rÀØÔÀ\u00adè=§b¹é\u0011Ê\u0017\u0084õ\u001a«\u0007üúÞu®T\u008bs]÷JZ\u000eA(ó\u0003¦\u0094÷{ý\u00021\u009bm\u0099\u001aÂ}¦\u00ad\u009bktH©¬-vW$\u008b\u0093cTîá:mUÜ\u0083±\u008c¶.\bÚ%~\u0013\u0005\u001c@/õS\u009b,¹u\u0001\u0007\u000bV\u001e\"Í)\u0087:\u0099\u0090`5 _\u0080[4KT-\u001f8Å4\u0006À\u0083¸\u000eiúÎlEb/~¯\u009b^´\u001d\u0088,!´\u009e \u0085ÏE\u0005{\u0080*ã5àÕeùLLx^¿\u008e\u001bØþ\u0004\u009d\u0006º8å<\të\u00178\u008d\u001e_xÇ\u0010ãØôý\u001añyL\u0086\u009f<\u0088÷óNÄ4'\u0010u|\u0090Pdµ!o¦\u0095CèANÕÂ©'>ejÝc\u0081z\u000eÙ\u001e\u0010üQ§\u00ad!§\u009bSÒ\u0016 í\u0081ócæ:¸Ù#\u008c7@d\u000b~©3ÐÕóyFæø¿øù\u0092Ó\\\u0012×\u0018Çpq@s\byØãmÿN«´µù¡\r.\u009f\u0005ã@d\u0010#à@T¨ÞÂ\"\b´O\u001c´óEò\u0098Â`\u0003\u001b#¯¬Õ\u0000\u00867ißW~~þç\u0003\u0098\u0092iznÉ=BÌ*r.\\ùbÄÝ?´phÓ\u00adØ¨=³p-Ä\u0088¦I]â\u001eÄÃ\u0004ÖiÊeí²:U \u0013\u0097n&ó½ÂBÄñÊH\u008bú\u008d\u000fí\u000b-!\u0088[\u0091¥øÏY'BMnuZt¹~qaqd÷\u0093p\u0086\u0097ì0Û{ÐèåÙh5S\u0004ô\u00003N\u009böS\u0085¸ú½ÎßÖÜ\u008e>\u0016åJ\u0002·ÅImZñ\u0089\u0010£\u0002ë\u008fj\\[þ!C\u00adªªWu\u0087 ¦\u0017\u0096(;\u0005\u0006\u0014@\u001bù\u001d\u0096µy\u007flÎôä0:!'áS R¡\u007f\u0096Ñ í\u0011p\u0081®ßT´ÑÉ_\u008c\u0011\u001e\u0000³\tþA\n\u0080X\u0084çÎì-M`hÛl ·UïXä\u0002\u0081#v=?\u0082\u008dÂÜ\u008a\u008ey\bMÜíR\u0088´\u009d+ì²î2ô \u0005P \u001cob/\u0094ø\u0097ã·E;)ån[ùebù&³\u0007Rîry®Uý\u0010¬\u0084^\u0083úEá\u009ecíÏ[\u001d¸!\u0007 UkQ\u0082$/aÁÕZt\u001bø{mcüÄû\u009ev\u0090\u001c»§^¢f\u001b«\u0088\u008a\u0010oV}×\u0012ÃX\u0011£\u0000\u0084ýQè\u007fÍ@»{\u001d\u009c¡î(~í~X7J8þþ*íX¾¤ÂôxÑÈ\u000e\u0010%»\u009aÍ\u001aÁ¶a\u00943!Û[\u0098¶\u009bµVT\u00830\u000e\f¨¡éÀÃü\u008e6&eûS\u009f8.Õ/Î\u008d*R*øEÜ\nêOÉ\u0018þZ?Áà©x\u001b\u0011Ò\u0016¢Q#\u0081\u0093ÐÇÄY\u0019ñ\u0010?ò\u001a\u0086Í\u001bg{Y=C×áùb\u009ak\u0010\u0014~á\u001c&/\u0089¹ëÕ#a\u001b8\u0081\u0003\u0010QÀ\u008c#\u0015éÿ\u008e³}ÉÆ\u007fB \u009d\u0018\u008bß}»Ç\u0086¥ìëP§ýë\u00014O\u001f$½\u0090¬Xù\u0098";
      int var7 = "½%th\u0088å\u0004<?\u009fb²üÕ?: \u00adÖû!»\u008e¨³s\u009e?\u00037d¼\u000bÏbüjB\u0000pUg\"J¿\u009f\u0096h?\u0010>%\u0098ÚfX\u0092ôü\u0013É9\u0015\u0093E\u0017\u0010u\u009fK\u00902}Hþ\u0015<¡\u0014\u0089ÅaÜ \u0097M©\u0094%®+è\f¢\u0087³h§_Ò\u0002s@\u001cfML\u001aêKÍp\u008bt2É\u0010çû°ãD× \u0019\u0017ó=HÅ·aÐÐ\u00876Øë\u00ad\u0095à\u0087Nä\u0018\u0002a`\u0081\u0092â´°òÙ\u0017\u0097ªk¸+ènÆ(ÛD0éú¡¸^Ç?T¥p\u0005j=±\u0004ê³¨]n\u00ad\u000b4 \u0085 \u008f x¼\u0013þÂ\u0092=¯Á\u0006\u0007þ\u0099Vfù\u000b\u0002\u0006\u0097\u0080\u0081\u009aù¾9\u0087\u0007VXÈ|\u0080v\t\u0093þÓ)7^G_LìºJ\u001a\u0013ÊD\u0084\u001fM\u0001kGx\u0011Ú\u0089ÊÙüô\u008f>ï\u0090bÌ¬\b\u0099H\u0085ç\u0010d\u0012'çtò\u001e7¯\u001b\u0018N4FÉ\u0095åïÄ'\u001eXûF\u00adE\u0085[\u008enÍ\u0003Ü«g·D)I!\u0004\u0081>Á\u0016\u009d×®h\u0091âÿ\u00921}ç\u0097\u009d\u0099\u0011\"9\u0093âDÉ©} \u009a´x\u0080\u0086m\u008aU\u0017\u008d-fÁ\"\u0091\u008a[\u001aés¹v\u0089Ju\u0012¢\u009c\u0005!=/\u0010Ì3\u0093\u0006l½ÕýëÅïüÉ\u0000!A ;\u0012¦ÁdÑR¦\u0016X\u0089ZùKÀ{æ]TÏ£n}\\W3\u0006\u0082\u0012\u0011§w\u0010.\u0088©¹«f¯\u008dº\u0010\u008fÐF\u0091c8 (¡Ýjuòã<òÊºÝôsí`â\bËêÎ3fÅ3-Ý\u001f\u008d\u000fme¨¬´wËù¶ùÔ¥N²j,\u0013ro\t-¹NØÒò²KEÓ\u0095ööäÌ\u0085q\u0005Ç]°·\u0096@ªì½D¢\u008añæ}X£\u001cDô÷¯$³hS`Ï\u001b)Ê\u009c\u009e\u008a\u000fî,Ú0\u000fG1è{!Ï\u0099¶æ?À\u000bÅ¹º_Ð(\u0088'öNauìº|\u0010Ã\u0090(õzQSÄÛD©\u0098Ng¿\u001fÒ_Inner5\u008f\rËý\u0007r\u008dS\u008aï³*¬ß%)hPSnê\u0093ç\u000f\u001dI÷ä;\u0088\u0019¦Èå âoAÐ\n(÷¡¶\u0085Ï F\u0019\u0016«\u008f«`È\"éç yEÐZ\u008dF»·EÊËÞ¿ÅÔÝz\u007f¿h({løäQÁ\u0012%jìP¯mU/¦+\u0006}\u0014\u008a)\u0096ú\u008f\u0087ãè·Ï*\u0084&jK\u000eO\u0082Åk \u009d@ç\u0013æø\\ÆM¦+9~qÆ\u0016o/#¹,¬±EÜ*¼vÙoä\t\u0010?\u0013G$Â\u0087£\u0003àz\u0011°ÛüX\u0080\u0010¦\u000f\u0000í¥_7ÙÔý({\u000bªt\u0080\u0010\u009c hu½\u0015]5ºß\u0085Ç\u000b\u0081îZ0V#Ø\u0081!<¾êÌÅ5÷®¢ èÆ\u0004F\u009f#Iv\t\u008cNG\u0091/\u001e+-¤q|[¨àL3æ\u0097;\u0081\u0019pÚ>\u0010Ã\u008d\u008d·ÖÂ\u001a\fë\tàá\u0014·Sæ \u001fK\u0091g×«\u001d\u001axUgÞ\u0017'\u000fí`|Sè¼ÍÞtY~26YO]\u000e \u001e2\u0017[ÿ«oiBQ\u000f\u00ad¶¤\u008c\u0007\u008d\u008c¹*\u0090(¤b\u0003Ò¨9,»ë(h,\u0099\u00024p±ÁÄ2*Ù\rÊa]&\t¥{jfI\u0018PÂ³Î\u00199²Ø)m:taÒmuÔ©ÏÂdîQ\u0099@ñ¡\u0018\b\u0017æë¾E@Þ\u00053\u0083ïP\u0095ÎWØ¯ò¹ë\u001dÐ\u0017Ïc'\u009b«ØJ¬]¼ál»NS\u000fÓ5Þ\u00ad\u0090÷]\u0004\u0085L\u009b{ò\u0010\u0085ú4øk\u0087(WC¶\rÀØÔÀ\u00adè=§b¹é\u0011Ê\u0017\u0084õ\u001a«\u0007üúÞu®T\u008bs]÷JZ\u000eA(ó\u0003¦\u0094÷{ý\u00021\u009bm\u0099\u001aÂ}¦\u00ad\u009bktH©¬-vW$\u008b\u0093cTîá:mUÜ\u0083±\u008c¶.\bÚ%~\u0013\u0005\u001c@/õS\u009b,¹u\u0001\u0007\u000bV\u001e\"Í)\u0087:\u0099\u0090`5 _\u0080[4KT-\u001f8Å4\u0006À\u0083¸\u000eiúÎlEb/~¯\u009b^´\u001d\u0088,!´\u009e \u0085ÏE\u0005{\u0080*ã5àÕeùLLx^¿\u008e\u001bØþ\u0004\u009d\u0006º8å<\të\u00178\u008d\u001e_xÇ\u0010ãØôý\u001añyL\u0086\u009f<\u0088÷óNÄ4'\u0010u|\u0090Pdµ!o¦\u0095CèANÕÂ©'>ejÝc\u0081z\u000eÙ\u001e\u0010üQ§\u00ad!§\u009bSÒ\u0016 í\u0081ócæ:¸Ù#\u008c7@d\u000b~©3ÐÕóyFæø¿øù\u0092Ó\\\u0012×\u0018Çpq@s\byØãmÿN«´µù¡\r.\u009f\u0005ã@d\u0010#à@T¨ÞÂ\"\b´O\u001c´óEò\u0098Â`\u0003\u001b#¯¬Õ\u0000\u00867ißW~~þç\u0003\u0098\u0092iznÉ=BÌ*r.\\ùbÄÝ?´phÓ\u00adØ¨=³p-Ä\u0088¦I]â\u001eÄÃ\u0004ÖiÊeí²:U \u0013\u0097n&ó½ÂBÄñÊH\u008bú\u008d\u000fí\u000b-!\u0088[\u0091¥øÏY'BMnuZt¹~qaqd÷\u0093p\u0086\u0097ì0Û{ÐèåÙh5S\u0004ô\u00003N\u009böS\u0085¸ú½ÎßÖÜ\u008e>\u0016åJ\u0002·ÅImZñ\u0089\u0010£\u0002ë\u008fj\\[þ!C\u00adªªWu\u0087 ¦\u0017\u0096(;\u0005\u0006\u0014@\u001bù\u001d\u0096µy\u007flÎôä0:!'áS R¡\u007f\u0096Ñ í\u0011p\u0081®ßT´ÑÉ_\u008c\u0011\u001e\u0000³\tþA\n\u0080X\u0084çÎì-M`hÛl ·UïXä\u0002\u0081#v=?\u0082\u008dÂÜ\u008a\u008ey\bMÜíR\u0088´\u009d+ì²î2ô \u0005P \u001cob/\u0094ø\u0097ã·E;)ån[ùebù&³\u0007Rîry®Uý\u0010¬\u0084^\u0083úEá\u009ecíÏ[\u001d¸!\u0007 UkQ\u0082$/aÁÕZt\u001bø{mcüÄû\u009ev\u0090\u001c»§^¢f\u001b«\u0088\u008a\u0010oV}×\u0012ÃX\u0011£\u0000\u0084ýQè\u007fÍ@»{\u001d\u009c¡î(~í~X7J8þþ*íX¾¤ÂôxÑÈ\u000e\u0010%»\u009aÍ\u001aÁ¶a\u00943!Û[\u0098¶\u009bµVT\u00830\u000e\f¨¡éÀÃü\u008e6&eûS\u009f8.Õ/Î\u008d*R*øEÜ\nêOÉ\u0018þZ?Áà©x\u001b\u0011Ò\u0016¢Q#\u0081\u0093ÐÇÄY\u0019ñ\u0010?ò\u001a\u0086Í\u001bg{Y=C×áùb\u009ak\u0010\u0014~á\u001c&/\u0089¹ëÕ#a\u001b8\u0081\u0003\u0010QÀ\u008c#\u0015éÿ\u008e³}ÉÆ\u007fB \u009d\u0018\u008bß}»Ç\u0086¥ìëP§ýë\u00014O\u001f$½\u0090¬Xù\u0098"
         .length();
      char var8 = 16;
      int var23 = -1;

      label54:
      while (true) {
         String var25 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var25.getBytes("ISO-8859-1"));
            String var50 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var50;
                  if ((var23 += var8) >= var7) {
                     CONST_HB = var4;
                     CONST_IB = new String[45];
                     short var27 = 24552;
                     long var39 = 4723675131651874992L ^ var0;
                     CONST_M = "Team Unknown";
                     short var28 = 14867;
                     long var40 = 470049999518991680L ^ var0;
                     CONST_G = "svgs/nuke.svg";
                     CONST_MB = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[21];
                     int var14 = 0;
                     String var15 = "£xªX^\u0089ý\\:¦\u007f[\u0001¨|£\u0087\u008bú\u001a1\u009e¾íÿFJv6¨ækæ\u0002æ\u0080È¬éÐ\u000bÆÝ\u0092À¹\u0086@m¢\f/$Sl7AcÓ¤Æ¦ï\u0089ãIøS\u0086ë§Q\"\u0001\u0089\u0012À^ù\u001fÄ\u008aÇò'<a\u0013ZbæO\u009dIÇqRoê\u0016\u0003fÉÐ&\u0018\u0085 \u00181tÓM@uÃ\u0019wù\u0093%ÚJW_Y\u0082#¬b\u0092´Íãt¥\u0001¾¨bî¶Þÿ|\u0094\u0086v&À:t";
                     int var16 = "£xªX^\u0089ý\\:¦\u007f[\u0001¨|£\u0087\u008bú\u001a1\u009e¾íÿFJv6¨ækæ\u0002æ\u0080È¬éÐ\u000bÆÝ\u0092À¹\u0086@m¢\f/$Sl7AcÓ¤Æ¦ï\u0089ãIøS\u0086ë§Q\"\u0001\u0089\u0012À^ù\u001fÄ\u008aÇò'<a\u0013ZbæO\u009dIÇqRoê\u0016\u0003fÉÐ&\u0018\u0085 \u00181tÓM@uÃ\u0019wù\u0093%ÚJW_Y\u0082#¬b\u0092´Íãt¥\u0001¾¨bî¶Þÿ|\u0094\u0086v&À:t"
                        .length();
                     byte var17 = 0;

                     label36:
                     while (true) {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        long[] var30 = var13;
                        var10001 = var14++;
                        long var54 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var62 = -1;

                        while (true) {
                           long var19 = var54;
                           byte[] var21 = var11.doFinal(
                              new byte[]{
                                 (byte)(var19 >>> 56),
                                 (byte)(var19 >>> 48),
                                 (byte)(var19 >>> 40),
                                 (byte)(var19 >>> 32),
                                 (byte)(var19 >>> 24),
                                 (byte)(var19 >>> 16),
                                 (byte)(var19 >>> 8),
                                 (byte)var19
                              }
                           );
                           long var69 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var62) {
                              case 0:
                                 var30[var10001] = var69;
                                 if (var17 >= var16) {
                                    CONST_KB = var13;
                                    CONST_LB = new Integer[21];
                                    CONST_J = ((String)null);
                                    CONST_Q = ((String)null);
                                    CONST_I = ((String)null);
                                    CONST_E = ((String)null);
                                    CONST_R = ((String)null);
                                    CONST_F = ((String)null);
                                    CONST_D = ((String)null);
                                    CONST_K = new Color(145, 145, 145, 130);
                                    CONST_L = new int[][][]{
                                       {{0, 0, 1}, {0, 0, -1}, {1, 0, 0}, {-1, 0, 0}, {0, 1, 0}},
                                       {
                                             {0, 0, 2},
                                             {0, 0, -2},
                                             {2, 0, 0},
                                             {-2, 0, 0},
                                             {0, 2, 0},
                                             {1, 0, 1},
                                             {-1, 0, 1},
                                             {1, 0, -1},
                                             {-1, 0, -1},
                                             {0, 1, 1},
                                             {0, 1, -1},
                                             {1, 1, 0},
                                             {-1, 1, 0}
                                       },
                                       {
                                             {0, 0, 3},
                                             {0, 0, -3},
                                             {3, 0, 0},
                                             {-3, 0, 0},
                                             {0, 3, 0},
                                             {2, 0, 1},
                                             {2, 0, -1},
                                             {-2, 0, 1},
                                             {-2, 0, -1},
                                             {1, 0, 2},
                                             {-1, 0, 2},
                                             {1, 0, -2},
                                             {-1, 0, -2},
                                             {0, 1, 2},
                                             {0, 1, -2},
                                             {0, 2, 1},
                                             {0, 2, -1},
                                             {2, 1, 0},
                                             {-2, 1, 0},
                                             {1, 2, 0},
                                             {-1, 2, 0},
                                             {1, 1, 1},
                                             {-1, 1, 1},
                                             {1, 1, -1},
                                             {-1, 1, -1}
                                       },
                                       {
                                             {0, 0, 4},
                                             {0, 0, -4},
                                             {4, 0, 0},
                                             {-4, 0, 0},
                                             {0, 4, 0},
                                             {3, 0, 1},
                                             {3, 0, -1},
                                             {-3, 0, 1},
                                             {-3, 0, -1},
                                             {1, 0, 3},
                                             {-1, 0, 3},
                                             {1, 0, -3},
                                             {-1, 0, -3},
                                             {0, 1, 3},
                                             {0, 1, -3},
                                             {0, 3, 1},
                                             {0, 3, -1},
                                             {3, 1, 0},
                                             {-3, 1, 0},
                                             {1, 3, 0},
                                             {-1, 3, 0},
                                             {2, 0, 2},
                                             {2, 0, -2},
                                             {-2, 0, 2},
                                             {-2, 0, -2},
                                             {0, 2, 2},
                                             {0, 2, -2},
                                             {2, 2, 0},
                                             {-2, 2, 0},
                                             {2, 1, 1},
                                             {2, 1, -1},
                                             {-2, 1, 1},
                                             {-2, 1, -1},
                                             {1, 2, 1},
                                             {1, 2, -1},
                                             {-1, 2, 1},
                                             {-1, 2, -1},
                                             {1, 1, 2},
                                             {1, 1, -2},
                                             {-1, 1, 2},
                                             {-1, 1, -2}
                                       }
                                    };
                                    CONST_N = new HashMap<>();
                                    Map var31 = CONST_N;
                                    Integer var44 = 0;
                                    short var56 = 29945;
                                    long var64 = 4217630653166635943L ^ var0;
                                    var31.put(var44, "Gray");
                                    Map var32 = CONST_N;
                                    var44 = 170;
                                    short var57 = 26656;
                                    long var65 = 6757474088094488443L ^ var0;
                                    var32.put(var44, "Gray");
                                    Map var33 = CONST_N;
                                    var44 = "svgs/nuke.svg";
                                    short var58 = 10038;
                                    long var66 = 4132345227938568270L ^ var0;
                                    var33.put(var44, "Green");
                                    Map var34 = CONST_N;
                                    var44 = "svgs/nuke.svg";
                                    short var59 = 21641;
                                    long var67 = 7233852852818504697L ^ var0;
                                    var34.put(var44, "Red");
                                    Map var35 = CONST_N;
                                    var44 = "svgs/nuke.svg";
                                    short var60 = 27178;
                                    long var68 = 2192678588255851872L ^ var0;
                                    var35.put(var44, "Yellow");
                                    CONST_N.put("svgs/nuke.svg", "Purple");
                                    CONST_N.put("svgs/nuke.svg", "Gold");
                                    CONST_N.put("svgs/nuke.svg", "Gray");
                                    CONST_N.put("svgs/nuke.svg", "Gray");
                                    CONST_N.put("svgs/nuke.svg", "Blue");
                                    CONST_N.put("svgs/nuke.svg", "Green");
                                    CONST_N.put("svgs/nuke.svg", "Aqua");
                                    CONST_N.put("svgs/nuke.svg", "Red");
                                    CONST_N.put("svgs/nuke.svg", "Pink");
                                    CONST_N.put("svgs/nuke.svg", "Yellow");
                                    CONST_N.put("svgs/nuke.svg", "White");
                                    return;
                                 }
                                 break;
                              default:
                                 var30[var10001] = var69;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "d\u007fÚ\u001a\u0010\u0019ùÙK\u0091N\u0093Å\u009dõ>";
                                 var16 = "d\u007fÚ\u001a\u0010\u0019ùÙK\u0091N\u0093Å\u009dõ>".length();
                                 var17 = 0;
                           }

                           byte var43 = var17;
                           var17 += 8;
                           var18 = var15.substring(var43, var17).getBytes("ISO-8859-1");
                           var30 = var13;
                           var10001 = var14++;
                           var54 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var62 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var50;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label54;
                  }

                  var6 = "\bàí\u008eK,w\u0090uem¹\u0005\u0082\u0084V\u0019ü\u008có>Æ¢^å\\\u0014!¿×&\u008a\u001fft\u009bj\u0013int´\u008c[U\u0099C©\r7\u0012\u0083:X\u0086\u0082D½¨a5\u001dß¬\u000fè\u0084CMMv1+TºS\u0080x\u008a.i#-\u0010ãk\u008a\u0012Â'Tf\u001b\u0000öýMcË\r&Ä¢û\u0018Róã¯¾Mv\u009a*åN¡ù\u009a\b§Â\u0001®Ä¤\u009dÌ\u0088";
                  var7 = "\bàí\u008eK,w\u0090uem¹\u0005\u0082\u0084V\u0019ü\u008có>Æ¢^å\\\u0014!¿×&\u008a\u001fft\u009bj\u0013int´\u008c[U\u0099C©\r7\u0012\u0083:X\u0086\u0082D½¨a5\u001dß¬\u000fè\u0084CMMv1+TºS\u0080x\u008a.i#-\u0010ãk\u008a\u0012Â'Tf\u001b\u0000öýMcË\r&Ä¢û\u0018Róã¯¾Mv\u009a*åN¡ù\u009a\b§Â\u0001®Ä¤\u009dÌ\u0088"
                     .length();
                  var8 = 'h';
                  var23 = -1;
            }

            var25 = var6.substring(++var23, var23 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26025;
      if (CONST_IB[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_JB.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_JB.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/d3", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_HB[var3].getBytes("ISO-8859-1");
         CONST_IB[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_IB[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_3(var4, var5);
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
         throw new RuntimeException("rip/breeze/client/d3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31935;
      if (CONST_LB[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_KB[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_MB.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_MB.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/d3", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_LB[var3] = var15;
      }

      return CONST_LB[var3];
   }

   private static int getValue(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = decrypt(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getValue".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/d3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
