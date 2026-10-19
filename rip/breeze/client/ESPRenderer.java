package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.GL11;
import rip.breeze.BreezeModule;
import rip.breeze.ConditionsSetting;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.MathUtil1;
import rip.breeze.ModuleInfo;
import rip.breeze.RenderUtil1;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "ESP", b = "Draws ESPs on entities.", d = rip.breeze.ModuleCategory.VISUAL)
public class ESPRenderer extends BreezeModule {
   private final GenericSetting<EnumType2> dimensionSetting;
   private final ConditionsSetting playersSetting;
   private final GenericSetting<RenderMode> modeSetting;
   private final GenericSetting<Boolean> teamColorsSetting;
   private final GenericSetting<rip.breeze.BreezeColor> colorSetting;
   private final GenericSetting<EnumType34> healthBarSetting;
   private final ConditionsSetting mobsSetting;
   private final GenericSetting<RenderMode> modeSetting_2;
   private final GenericSetting<rip.breeze.BreezeColor> colorSetting_2;
   private final ConditionsSetting animalsSetting;
   private final GenericSetting<RenderMode> modeSetting_3;
   private final GenericSetting<rip.breeze.BreezeColor> colorSetting_3;
   private final ConditionsSetting storageSetting;
   private final GenericSetting<RenderMode> modeSetting_4;
   private final GenericSetting<EnumType7[]> typesSetting;
   private final GenericSetting<rip.breeze.BreezeColor> chestColorSetting;
   private final GenericSetting<rip.breeze.BreezeColor> enderChestColorSetting;
   private final GenericSetting<rip.breeze.BreezeColor> hopperColorSetting;
   private final GenericSetting<rip.breeze.BreezeColor> furnaceColorSetting;
   private final GenericSetting<rip.breeze.BreezeColor> dispenserColorSetting;
   private final ConditionsSetting itemsSetting;
   private final GenericSetting<RenderMode> modeSetting_5;
   private final GenericSetting<Boolean> amountSetting;
   private final GenericSetting<Integer> alphaSetting;
   private final ConcurrentHashMap<Entity, Float> concurrentHashMap_L;
   private long fieldLong_M;
   private static final String[] CONST_O;
   private static final String[] CONST_P;
   private static final Map CONST_Q = new HashMap(13);

   public ESPRenderer() {
      long var1 = 114695855753469L;
      super();
      short var10002 = 20376;
      long var10003 = 412811853105629082L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.<EnumType2>getDataBuilder50(this, "Dimension").getDataBuilder50_4(EnumType2._2D);
      var10002 = 17901;
      var10003 = 9148896575925751282L ^ var1;
      this.dimensionSetting = var10001.getDataBuilder50_3("The dimension to draw in (2D or 3D).").getDataBuilder54();
      short var10004 = 14740;
      long var10005 = 2026094835365376384L ^ var1;
      this.playersSetting = new ConditionsSetting(this, "Players");
      var10002 = 2365;
      var10003 = 8400527013555880251L ^ var1;
      var10001 = GenericSetting.<RenderMode>getDataBuilder50(this.playersSetting, "Mode").getDataBuilder50_4(RenderMode.FULL);
      var10002 = 3982;
      var10003 = 3751334648499259291L ^ var1;
      this.modeSetting = var10001.getDataBuilder50_3("The ESP mode to use for players.").getDataBuilder54();
      var10002 = 17286;
      var10003 = 7004338078880861093L ^ var1;
      var10001 = GenericSetting.<Boolean>getDataBuilder50(this.playersSetting, "TeamColors").getDataBuilder50_4(false);
      var10002 = 7187;
      var10003 = 6036530695003591706L ^ var1;
      this.teamColorsSetting = var10001.getDataBuilder50_3("Color enemies to the color of the team they are assigned to.").getDataBuilder54();
      var10002 = 20467;
      var10003 = 2429133315264808916L ^ var1;
      var10001 = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this.playersSetting, "Color")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(10, 88, 204, 140))
         .getDataBuilder50_8();
      var10002 = 17781;
      var10003 = 4404033478161894737L ^ var1;
      this.colorSetting = var10001.getDataBuilder50_3("The color for players, friends and teammates will be colored in a different color").getDataBuilder54();
      var10002 = 6155;
      var10003 = 7144882719554129948L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.playersSetting, "HealthBar");
      var10002 = 10412;
      var10003 = 5905578145916084364L ^ var1;
      this.healthBarSetting = var10001.getDataBuilder50_3("Draw a health bar next to the player.").getDataBuilder50_4(EnumType34.THICK).getDataBuilder54();
      var10004 = 8377;
      var10005 = 587841816594278565L ^ var1;
      this.mobsSetting = new ConditionsSetting(this, "Mobs");
      var10002 = 5127;
      var10003 = 4184909442463128588L ^ var1;
      var10001 = GenericSetting.<RenderMode>getDataBuilder50(this.mobsSetting, "Mode").getDataBuilder50_4(RenderMode._OFF);
      var10002 = 23070;
      var10003 = 250934433406947846L ^ var1;
      this.modeSetting_2 = var10001.getDataBuilder50_3("The ESP mode to use for mobs.").getDataBuilder54();
      var10002 = 7880;
      var10003 = 6866384106181744337L ^ var1;
      var10001 = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this.mobsSetting, "Color")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(204, 143, 10, 140))
         .getDataBuilder50_8();
      var10002 = 26518;
      var10003 = 2943411611315285910L ^ var1;
      this.colorSetting_2 = var10001.getDataBuilder50_3("The color for mobs").getDataBuilder54();
      var10004 = 5842;
      var10005 = 2548246906719821519L ^ var1;
      this.animalsSetting = new ConditionsSetting(this, "Animals");
      var10002 = 5127;
      var10003 = 4184909442463128588L ^ var1;
      var10001 = GenericSetting.<RenderMode>getDataBuilder50(this.animalsSetting, "Mode").getDataBuilder50_4(RenderMode._OFF);
      var10002 = 1866;
      var10003 = 6117529782636269400L ^ var1;
      this.modeSetting_3 = var10001.getDataBuilder50_3("The ESP mode to use for animals.").getDataBuilder54();
      var10002 = 7880;
      var10003 = 6866384106181744337L ^ var1;
      var10001 = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this.animalsSetting, "Color")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(96, 179, 2, 140))
         .getDataBuilder50_8();
      var10002 = 2236;
      var10003 = 3687107394690433196L ^ var1;
      this.colorSetting_3 = var10001.getDataBuilder50_3("The color for animals.").getDataBuilder54();
      var10004 = 20547;
      var10005 = 1569976989097957464L ^ var1;
      this.storageSetting = new ConditionsSetting(this, "Storage");
      var10002 = 5127;
      var10003 = 4184909442463128588L ^ var1;
      var10001 = GenericSetting.<RenderMode>getDataBuilder50(this.storageSetting, "Mode").getDataBuilder50_4(RenderMode._OFF);
      var10002 = 27456;
      var10003 = 1462498798115988310L ^ var1;
      this.modeSetting_4 = var10001.getDataBuilder50_3("The ESP mode to use for storage blocks.").getDataBuilder54();
      var10002 = 15055;
      var10003 = 5162598003276247746L ^ var1;
      var10001 = GenericSetting.<EnumType7[]>getDataBuilder50(this.storageSetting, "Types")
         .getDataBuilder50_4(new EnumType7[]{EnumType7.CHESTS, EnumType7.ENDER_CHESTS});
      var10002 = 22519;
      var10003 = 3072008021365497851L ^ var1;
      this.typesSetting = var10001.getDataBuilder50_3("The storage blocks to highlight.").getDataBuilder54();
      var10002 = 21169;
      var10003 = 121264941841390240L ^ var1;
      var10001 = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this.storageSetting, "ChestColor")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(204, 164, 10, 140))
         .getDataBuilder50_8();
      var10002 = 23190;
      var10003 = 1821434402208518807L ^ var1;
      this.chestColorSetting = var10001.getDataBuilder50_3("The color for chests.").getDataBuilder54();
      var10002 = 17975;
      var10003 = 4426302020018343472L ^ var1;
      var10001 = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this.storageSetting, "EnderChestColor")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(128, 0, 204, 140))
         .getDataBuilder50_8();
      var10002 = 16059;
      var10003 = 6371337301519169178L ^ var1;
      this.enderChestColorSetting = var10001.getDataBuilder50_3("The color for ender chests.").getDataBuilder54();
      var10002 = 4876;
      var10003 = 8640696741980232456L ^ var1;
      var10001 = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this.storageSetting, "HopperColor")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(128, 128, 128, 140))
         .getDataBuilder50_8();
      var10002 = 11891;
      var10003 = 8550002822897329769L ^ var1;
      this.hopperColorSetting = var10001.getDataBuilder50_3("The color for hoppers.").getDataBuilder54();
      var10002 = 27421;
      var10003 = 5342313603835077390L ^ var1;
      var10001 = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this.storageSetting, "FurnaceColor")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(160, 80, 0, 140))
         .getDataBuilder50_8();
      var10002 = 13647;
      var10003 = 2591788075607096685L ^ var1;
      this.furnaceColorSetting = var10001.getDataBuilder50_3("The color for furnaces.").getDataBuilder54();
      var10002 = 30679;
      var10003 = 1836417444681596873L ^ var1;
      var10001 = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this.storageSetting, "DispenserColor")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(100, 100, 100, 140))
         .getDataBuilder50_8();
      var10002 = 2077;
      var10003 = 4778702085521522707L ^ var1;
      this.dispenserColorSetting = var10001.getDataBuilder50_3("The color for dispensers and droppers.").getDataBuilder54();
      var10004 = 22471;
      var10005 = 5952080343352188877L ^ var1;
      this.itemsSetting = new ConditionsSetting(this, "Items");
      var10002 = 5127;
      var10003 = 4184909442463128588L ^ var1;
      var10001 = GenericSetting.<RenderMode>getDataBuilder50(this.itemsSetting, "Mode").getDataBuilder50_4(RenderMode._OFF);
      var10002 = 3776;
      var10003 = 6640551151288665807L ^ var1;
      this.modeSetting_5 = var10001.getDataBuilder50_3("The ESP mode to use for dropped items.").getDataBuilder54();
      var10002 = 26955;
      var10003 = 3777364678331343176L ^ var1;
      var10001 = GenericSetting.<Boolean>getDataBuilder50(this.itemsSetting, "Amount").getDataBuilder50_4(true);
      var10002 = 14529;
      var10003 = 7710278074419736807L ^ var1;
      this.amountSetting = var10001.getDataBuilder50_3("Show the stack size on top of each dropped item.").getDataBuilder54();
      var10002 = 978;
      var10003 = 7878409900078549978L ^ var1;
      var10001 = GenericSetting.<Integer>getDataBuilder50(this.itemsSetting, "Alpha")
         .getDataBuilder50_4(140)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 255));
      var10002 = 7867;
      var10003 = 8144947456869422782L ^ var1;
      this.alphaSetting = var10001.getDataBuilder50_3("Box opacity for item ESP. The tint comes from the item's texture.").getDataBuilder54();
      this.concurrentHashMap_L = new ConcurrentHashMap<>();
      this.fieldLong_M = 0L;
   }

   @Override
   public String getString() {
      return rip.breeze.RenderUtil27.CONST_G.apply(this.dimensionSetting.getObject_m());
   }

   @EventListener
   public void processNullable(PreTickEventEvent var1) {
      if (BreezeClient.CONST_A.theWorld == null) {
         this.concurrentHashMap_L.clear();
      } else {
         this.concurrentHashMap_L.keySet().removeIf(ESPRenderer::lambda$onTick_Inner0);
      }
   }

   @EventListener
   public void render(Render3DEventEvent var1) {
      if (!this.dimensionSetting.isValid(EnumType2._2D)) {
         this.calculate(var1.fieldFloat_h);
      }
   }

   @EventListener
   public void render_1(Render2DEventEvent var1) {
      if (this.dimensionSetting.isValid(EnumType2._2D)) {
         GlStateManager.enableBlend();
         GlStateManager.disableTexture2D();
         this.calculate(var1.fieldFloat_g);
         GlStateManager.enableTexture2D();
      }
   }

   private void calculate(float var1) {
      long var2 = System.currentTimeMillis() - this.fieldLong_M;
      this.fieldLong_M = System.currentTimeMillis();
      ArrayList var4 = this.modeSetting_5.isValid(RenderMode._OFF) ? null : new ArrayList();

      for (Entity var6 : BreezeClient.CONST_A.theWorld.loadedEntityList) {
         if (!var6.isDead && var6 != BreezeClient.CONST_A.thePlayer) {
            if (var6 instanceof EntityPlayer) {
               if (!this.calculateAngles((EntityPlayer)var6, var1, (float)var2)) {
                  this.concurrentHashMap_L.remove(var6);
               }
            } else if (var6 instanceof IMob) {
               this.processAll(var6, var1);
            } else if (var6 instanceof EntityAnimal) {
               this.processAll_2((EntityAnimal)var6, var1);
            } else if (var6 instanceof EntityItem && var4 != null) {
               EntityItem var7 = (EntityItem)var6;
               if (var7.getEntityItem() != null && RenderUtil31.getHitbox(var7)) {
                  var4.add(var7);
               }
            }
         }
      }

      if (var4 != null && !var4.isEmpty()) {
         this.getDistance(var4, var1);
      }

      if (!this.modeSetting_4.isValid(RenderMode._OFF)) {
         for (TileEntity var9 : BreezeClient.CONST_A.theWorld.loadedTileEntityList) {
            this.calculate_2(var9, var1);
         }
      }
   }

   private boolean calculateAngles(EntityPlayer var1, float var2, float var3) {
      if (this.modeSetting.isValid(RenderMode._OFF) && this.healthBarSetting.isValid(EnumType34._OFF)) {
         return false;
      }

      if (!AntiBot.isInvisible_2(var1)) {
         return false;
      }

      if (var1.isInvisible() && !AntiBot.isInvisible(var1)) {
         return false;
      }

      if (!RenderUtil31.getHitbox(var1)) {
         return false;
      }

      Color var4 = BreezeClient.getAltManager().getColor(var1, this.teamColorsSetting.getObject_m());
      var4 = var4 == null ? this.colorSetting.getObject_m() : RenderUtil1.getColor_7(var4, this.colorSetting.getObject_m().getAlpha());
      switch (Util48.CONST_A[this.dimensionSetting.getObject_m().ordinal()]) {
         case 1:
            float[] var25 = this.computeESPOutline(
               var1,
               var4,
               this.modeSetting.isValid(RenderMode.OUTLINE) || this.modeSetting.isValid(RenderMode.FULL),
               this.modeSetting.isValid(RenderMode.FILLED) || this.modeSetting.isValid(RenderMode.FULL),
               var2
            );
            if (this.healthBarSetting.isValid(EnumType34._OFF) || var1.getDistanceSqToEntity(BreezeClient.CONST_A.thePlayer) > 15000.0) {
               return var25 != null;
            }

            Vec3 var26 = BlockUtil7.getVec3(var1, var2);
            Vec3 var27 = var26.addVector(0.0, var1.height, 0.0);
            double[] var29 = RenderUtil31.vecToArray(var26);
            double[] var30 = RenderUtil31.vecToArray(var27);
            if (var29 == null && var30 == null) {
               return var25 != null;
            }

            float var14;
            float var35;
            float var36;
            if (var29 != null && var30 != null) {
               float var31 = (float)var29[1];
               float var33 = (float)var30[1];
               var35 = Math.abs(var31 - var33);
               var36 = (var31 + var33) * 0.5F;
               var14 = (float)Math.min(var29[0], var30[0]);
            } else {
               double[] var10 = var29 != null ? var29 : var30;
               float var11 = Math.max(1.0F, (float)Math.sqrt(var1.getDistanceSqToEntity(BreezeClient.CONST_A.thePlayer)));
               var35 = var1.height * 280.0F / var11;
               var36 = (float)var10[1] + (var29 != null ? -var35 * 0.5F : var35 * 0.5F);
               var14 = (float)var10[0];
            }

            boolean var32 = this.healthBarSetting.isValid(EnumType34.THIN);
            float var34 = var32 ? 18.0F : 26.0F;
            float var15 = Math.max(var35, var34);
            float var16 = var36 - var15 * 0.5F;
            float var17 = var36 + var15 * 0.5F;
            float var18 = var32 ? BlockUtil7.clamp(var15 * 0.005F, 1.0F, 20.0F) : BlockUtil7.clamp(var15 * 0.05F, 3.0F, 150.0F);
            float var19 = var32 ? 4.0F : 2.5F;
            if (this.modeSetting.isValid(RenderMode._OFF)) {
               var19 += var32 ? 6.0F : 3.0F;
            }

            float var20 = var35 * 0.28F;
            float var21 = var14 - var20 - var18 * var19;
            this.concurrentHashMap_L.putIfAbsent(var1, var1.getHealth());
            this.concurrentHashMap_L
               .put(var1, (float)MathUtil1.calculateDouble_2(this.concurrentHashMap_L.get(var1).floatValue(), var1.getHealth(), 0.007F, var3));
            this.concurrentHashMap_L.put(var1, BlockUtil7.clamp(this.concurrentHashMap_L.get(var1), 0.0F, var1.getMaxHealth()));
            float var22 = 1.0F - this.concurrentHashMap_L.get(var1) / var1.getMaxHealth();
            float var23 = Math.max(1.0F, var18 * 0.15F);
            RenderUtil31.render_1(var21, var16, var21 + var18, var17, new Color(20, 20, 20, 150));
            RenderUtil31.render_1(var21, var16 + var15 * var22, var21 + var18, var17, this.getColor(this.concurrentHashMap_L.get(var1)));
            RenderUtil31.calculate_3(var21, var16, var21 + var18, var17, Color.BLACK, var23);
            break;
         case 2:
            this.update(
               var1,
               var4,
               this.modeSetting.isValid(RenderMode.OUTLINE) || this.modeSetting.isValid(RenderMode.FULL),
               this.modeSetting.isValid(RenderMode.FILLED) || this.modeSetting.isValid(RenderMode.FULL),
               var2
            );
            if (this.healthBarSetting.isValid(EnumType34._OFF) || var1.getDistanceSqToEntity(BreezeClient.CONST_A.thePlayer) > 15000.0) {
               return false;
            }

            AxisAlignedBB var5 = BlockUtil7.getHitbox(var1, var2);
            this.concurrentHashMap_L.putIfAbsent(var1, var1.getHealth());
            float var6 = this.concurrentHashMap_L.get(var1);
            float var7 = var1.getHealth();
            float var8 = (float)MathUtil1.calculateDouble_2(var6, var7, 0.007F, var3);
            var8 = BlockUtil7.clamp(var8, 0.0F, var1.getMaxHealth());
            this.concurrentHashMap_L.put(var1, var8);
            float var9 = var8 / var1.getMaxHealth();
            boolean var12 = this.healthBarSetting.isValid(EnumType34.THIN);
            float var13 = var12 ? 0.22F : 0.15F;
            if (this.modeSetting.isValid(RenderMode._OFF)) {
               var13 += 0.25F;
            }

            GL11.glDepthMask(false);
            absValue(var5, var9, var12 ? 0.018F : 0.045F, var13, new Color(20, 20, 20, 150), this.getColor(var8), var12 ? 0.003F : 0.013F);
            GL11.glDepthMask(true);
      }

      return true;
   }

   private void processAll(Entity var1, float var2) {
      if (!this.modeSetting_2.isValid(RenderMode._OFF)) {
         if (RenderUtil31.getHitbox(var1)) {
            Color var3 = this.colorSetting_2.getObject_m();
            switch (Util48.CONST_A[this.dimensionSetting.getObject_m().ordinal()]) {
               case 1:
                  this.computeESPOutline(
                     var1,
                     var3,
                     this.modeSetting.isValid(RenderMode.OUTLINE) || this.modeSetting.isValid(RenderMode.FULL),
                     this.modeSetting.isValid(RenderMode.FILLED) || this.modeSetting.isValid(RenderMode.FULL),
                     var2
                  );
                  break;
               case 2:
                  this.update(
                     var1,
                     var3,
                     this.modeSetting.isValid(RenderMode.OUTLINE) || this.modeSetting.isValid(RenderMode.FULL),
                     this.modeSetting.isValid(RenderMode.FILLED) || this.modeSetting.isValid(RenderMode.FULL),
                     var2
                  );
            }
         }
      }
   }

   private void processAll_2(Entity var1, float var2) {
      if (!this.modeSetting_3.isValid(RenderMode._OFF)) {
         if (RenderUtil31.getHitbox(var1)) {
            Color var3 = this.colorSetting_3.getObject_m();
            switch (Util48.CONST_A[this.dimensionSetting.getObject_m().ordinal()]) {
               case 1:
                  this.computeESPOutline(
                     var1,
                     var3,
                     this.modeSetting.isValid(RenderMode.OUTLINE) || this.modeSetting.isValid(RenderMode.FULL),
                     this.modeSetting.isValid(RenderMode.FILLED) || this.modeSetting.isValid(RenderMode.FULL),
                     var2
                  );
                  break;
               case 2:
                  this.update(
                     var1,
                     var3,
                     this.modeSetting.isValid(RenderMode.OUTLINE) || this.modeSetting.isValid(RenderMode.FULL),
                     this.modeSetting.isValid(RenderMode.FILLED) || this.modeSetting.isValid(RenderMode.FULL),
                     var2
                  );
            }
         }
      }
   }

   private void calculate_2(TileEntity var1, float var2) {
      Color var3;
      if (var1 instanceof TileEntityChest && this.typesSetting.checkCondition(EnumType7.CHESTS)) {
         var3 = this.chestColorSetting.getObject_m();
      } else if (var1 instanceof TileEntityEnderChest && this.typesSetting.checkCondition(EnumType7.ENDER_CHESTS)) {
         var3 = this.enderChestColorSetting.getObject_m();
      } else if (var1 instanceof TileEntityHopper && this.typesSetting.checkCondition(EnumType7.HOPPERS)) {
         var3 = this.hopperColorSetting.getObject_m();
      } else if (var1 instanceof TileEntityFurnace && this.typesSetting.checkCondition(EnumType7.FURNACES)) {
         var3 = this.furnaceColorSetting.getObject_m();
      } else {
         if (!(var1 instanceof TileEntityDispenser) || !this.typesSetting.checkCondition(EnumType7.DISPENSERS)) {
            return;
         }

         var3 = this.dispenserColorSetting.getObject_m();
      }

      BlockPos var4 = var1.getPos();
      if (RenderUtil31.getHitbox_3(var4)) {
         AxisAlignedBB var5 = new AxisAlignedBB(var4.getX(), var4.getY(), var4.getZ(), var4.getX() + 1, var4.getY() + 1, var4.getZ() + 1);
         boolean var6 = this.modeSetting_4.isValid(RenderMode.OUTLINE) || this.modeSetting_4.isValid(RenderMode.FULL);
         boolean var7 = this.modeSetting_4.isValid(RenderMode.FILLED) || this.modeSetting_4.isValid(RenderMode.FULL);
         switch (Util48.CONST_A[this.dimensionSetting.getObject_m().ordinal()]) {
            case 1:
               float[] var8 = this.getBoundingBoxCorners(var5);
               if (var8 == null) {
                  return;
               }

               if (var7) {
                  RenderUtil31.render_1(var8[0], var8[1], var8[2], var8[3], var3);
               }

               if (var6) {
                  RenderUtil31.calculate_3(var8[0], var8[1], var8[2], var8[3], RenderUtil1.getColor_7(var3, 255), 1.0F);
               }
               break;
            case 2:
               if (var7) {
                  RenderUtil31.calculate_2(var5, var3, false);
               }

               if (var6) {
                  RenderUtil31.getHitbox_4(var5, RenderUtil1.getColor_7(var3, 255), 2.0F, false);
               }
         }
      }
   }

   private float[] getBoundingBoxCorners(AxisAlignedBB var1) {
      double[][] var2 = new double[][]{
         RenderUtil31.createVector(var1.minX, var1.minY, var1.minZ),
         RenderUtil31.createVector(var1.maxX, var1.minY, var1.minZ),
         RenderUtil31.createVector(var1.maxX, var1.maxY, var1.minZ),
         RenderUtil31.createVector(var1.minX, var1.maxY, var1.minZ),
         RenderUtil31.createVector(var1.minX, var1.minY, var1.maxZ),
         RenderUtil31.createVector(var1.maxX, var1.minY, var1.maxZ),
         RenderUtil31.createVector(var1.maxX, var1.maxY, var1.maxZ),
         RenderUtil31.createVector(var1.minX, var1.maxY, var1.maxZ)
      };
      float var3 = Float.POSITIVE_INFINITY;
      float var4 = Float.POSITIVE_INFINITY;
      float var5 = Float.NEGATIVE_INFINITY;
      float var6 = Float.NEGATIVE_INFINITY;
      boolean var7 = false;

      for (double[] var11 : var2) {
         if (var11 != null) {
            var7 = true;
            if (var11[0] < var3) {
               var3 = (float)var11[0];
            }

            if (var11[0] > var5) {
               var5 = (float)var11[0];
            }

            if (var11[1] < var4) {
               var4 = (float)var11[1];
            }

            if (var11[1] > var6) {
               var6 = (float)var11[1];
            }
         }
      }

      return !var7 ? null : new float[]{var3, var4, var5, var6};
   }

   private void getDistance(List<EntityItem> var1, float var2) {
      double var3 = 0.5;
      ArrayList var5 = new ArrayList();

      label34:
      for (EntityItem var7 : var1) {
         for (List var9 : var5) {
            EntityItem var10 = (EntityItem)var9.get(0);
            if (getHeldItem(var10.getEntityItem(), var7.getEntityItem()) && var10.getDistanceSqToEntity(var7) <= 0.5) {
               var9.add(var7);
               continue label34;
            }
         }

         ArrayList var13 = new ArrayList();
         var13.add(var7);
         var5.add(var13);
      }

      for (List var12 : var5) {
         this.calculate_3(var12, var2);
      }
   }

   private static boolean getHeldItem(ItemStack var0, ItemStack var1) {
      return var0 != null && var1 != null
         ? var0.getItem() == var1.getItem() && var0.getMetadata() == var1.getMetadata() && ItemStack.areItemStackTagsEqual(var0, var1)
         : false;
   }

   private void calculate_3(List<EntityItem> var1, float var2) {
      EntityItem var3 = (EntityItem)var1.get(0);
      int var4 = 0;

      for (EntityItem var6 : var1) {
         ItemStack var7 = var6.getEntityItem();
         if (var7 != null) {
            var4 += var7.stackSize;
         }

         if (var6.getEntityId() < var3.getEntityId()) {
            var3 = var6;
         }
      }

      ItemStack var16 = var3.getEntityItem();
      if (var16 != null) {
         AxisAlignedBB var17 = BlockUtil7.getHitbox(var3, var2);
         int var18 = ItemColorExtractor.getValue(var16);
         Color var8 = new Color(var18 >> 16 & 0xFF, var18 >> 8 & 0xFF, var18 & 0xFF, BlockUtil7.clamp_2(this.alphaSetting.getObject_m(), 0, 255));
         boolean var9 = this.modeSetting_5.isValid(RenderMode.OUTLINE) || this.modeSetting_5.isValid(RenderMode.FULL);
         boolean var10 = this.modeSetting_5.isValid(RenderMode.FILLED) || this.modeSetting_5.isValid(RenderMode.FULL);
         switch (Util48.CONST_A[this.dimensionSetting.getObject_m().ordinal()]) {
            case 1:
               float[] var11 = this.getBoundingBoxCorners(var17);
               if (var11 == null) {
                  return;
               }

               float var12 = var11[0];
               float var13 = var11[1];
               float var14 = var11[2];
               float var15 = var11[3];
               if (var10) {
                  RenderUtil31.render_1(var12, var13, var14, var15, var8);
               }

               if (var9) {
                  RenderUtil31.calculate_3(var12, var13, var14, var15, RenderUtil1.getColor_7(var8, 255), 1.0F);
               }

               if (this.amountSetting.getObject_m() && var4 >= 1) {
                  this.clamp(var12, var13, var14, var15, var4);
               }
               break;
            case 2:
               if (var10) {
                  RenderUtil31.calculate_2(var17, var8, false);
               }

               if (var9) {
                  RenderUtil31.getHitbox_4(var17, RenderUtil1.getColor_7(var8, 255), 2.0F, false);
               }

               if (this.amountSetting.getObject_m() && var4 >= 1) {
                  this.getDistance_2((var17.minX + var17.maxX) * 0.5, (var17.minY + var17.maxY) * 0.5, (var17.minZ + var17.maxZ) * 0.5, var4);
               }
         }
      }
   }

   private void clamp(float var1, float var2, float var3, float var4, int var5) {
      String var6 = String.valueOf(var5);
      FontRenderer var7 = BreezeClient.CONST_A.fontRendererObj;
      float var8 = var4 - var2;
      float var9 = Math.max(var8 * 0.05F, 1.5F);
      float var10 = (var1 + var3) * 0.5F;
      float var11 = (var2 + var4) * 0.5F;
      GlStateManager.enableTexture2D();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.pushMatrix();
      GlStateManager.translate(var10, var11, 0.0F);
      GlStateManager.scale(var9, var9, 1.0F);
      var7.drawStringWithShadow(var6, -var7.getStringWidth(var6) * 0.5F, -var7.FONT_HEIGHT * 0.5F, -1);
      GlStateManager.popMatrix();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.disableTexture2D();
   }

   private void getDistance_2(double var1, double var3, double var5, int var7) {
      double var8 = var1 - BreezeClient.CONST_A.getRenderManager().viewerPosX;
      double var10 = var3 - BreezeClient.CONST_A.getRenderManager().viewerPosY;
      double var12 = var5 - BreezeClient.CONST_A.getRenderManager().viewerPosZ;
      float var14 = 0.02666667F;
      float var15 = (float)BreezeClient.CONST_A.getRenderViewEntity().getDistance(var1, var3, var5);
      float var16 = BlockUtil7.clamp(1.0F + var15 * 0.035F, 1.0F, 4.0F);
      float var17 = var14 * var16;
      FontRenderer var18 = BreezeClient.CONST_A.fontRendererObj;
      String var19 = String.valueOf(var7);
      int var20 = var18.getStringWidth(var19);
      GlStateManager.pushMatrix();
      GlStateManager.translate(var8, var10, var12);
      GlStateManager.rotate(-BreezeClient.CONST_A.getRenderManager().playerViewY, 0.0F, 1.0F, 0.0F);
      GlStateManager.rotate(BreezeClient.CONST_A.getRenderManager().playerViewX, 1.0F, 0.0F, 0.0F);
      GlStateManager.scale(-var17, -var17, var17);
      GlStateManager.enableTexture2D();
      GlStateManager.enableBlend();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.depthMask(false);
      GlStateManager.disableDepth();
      var18.drawStringWithShadow(var19, -var20 * 0.5F, -var18.FONT_HEIGHT * 0.5F, -1);
      GlStateManager.depthMask(true);
      GlStateManager.enableDepth();
      GlStateManager.popMatrix();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float[] computeESPOutline(Entity var1, Color var2, boolean var3, boolean var4, float var5) {
      float[] var6 = this.getEntityBounds(var1, var5);
      if (var6 == null) {
         return null;
      }

      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      float var10 = var6[3];
      if (var4) {
         RenderUtil31.render_1(var7, var8, var9, var10, var2);
      }

      if (var3) {
         RenderUtil31.calculate_3(var7, var8, var9, var10, RenderUtil1.getColor_7(var2, 255), 2.0F);
      }

      return var6;
   }

   private void update(Entity var1, Color var2, boolean var3, boolean var4, float var5) {
      AxisAlignedBB var6 = BlockUtil7.getHitbox(var1, var5);
      if (var4) {
         RenderUtil31.calculate_2(var6, var2, false);
      }

      if (var3) {
         RenderUtil31.getHitbox_4(var6, RenderUtil1.getColor_7(var2, 255), 2.0F, false);
      }
   }

   private float[] getEntityBounds(Entity var1, float var2) {
      AxisAlignedBB var3 = BlockUtil7.getHitbox(var1, var2);
      double[][] var4 = new double[][]{
         RenderUtil31.createVector(var3.minX, var3.minY, var3.minZ),
         RenderUtil31.createVector(var3.maxX, var3.minY, var3.minZ),
         RenderUtil31.createVector(var3.maxX, var3.maxY, var3.minZ),
         RenderUtil31.createVector(var3.minX, var3.maxY, var3.minZ),
         RenderUtil31.createVector(var3.minX, var3.minY, var3.maxZ),
         RenderUtil31.createVector(var3.maxX, var3.minY, var3.maxZ),
         RenderUtil31.createVector(var3.maxX, var3.maxY, var3.maxZ),
         RenderUtil31.createVector(var3.minX, var3.maxY, var3.maxZ)
      };
      float var5 = Float.POSITIVE_INFINITY;
      float var6 = Float.POSITIVE_INFINITY;
      float var7 = Float.NEGATIVE_INFINITY;
      float var8 = Float.NEGATIVE_INFINITY;
      boolean var9 = false;

      for (double[] var13 : var4) {
         if (var13 != null) {
            var9 = true;
            if (var13[0] < var5) {
               var5 = (float)var13[0];
            }

            if (var13[0] > var7) {
               var7 = (float)var13[0];
            }

            if (var13[1] < var6) {
               var6 = (float)var13[1];
            }

            if (var13[1] > var8) {
               var8 = (float)var13[1];
            }
         }
      }

      return !var9 ? null : new float[]{var5, var6, var7, var8};
   }

   private Color getColor(float var1) {
      if (var1 <= 5.0F) {
         return Color.RED;
      } else if (var1 <= 10.0F) {
         return Color.ORANGE;
      } else if (var1 <= 15.0F) {
         return Color.YELLOW;
      } else {
         return var1 <= 20.0F ? Color.GREEN : Color.GREEN;
      }
   }

   public static void absValue(AxisAlignedBB var0, float var1, float var2, float var3, Color var4, Color var5, float var6) {
      double var7 = BreezeClient.CONST_A.getRenderManager().viewerPosX;
      double var9 = BreezeClient.CONST_A.getRenderManager().viewerPosY;
      double var11 = BreezeClient.CONST_A.getRenderManager().viewerPosZ;
      double var13 = (var0.minX + var0.maxX) * 0.5;
      double var15 = (var0.minZ + var0.maxZ) * 0.5;
      double var17 = var0.minY;
      double var19 = var0.maxY;
      double var21 = (var19 - var17) * 0.5;
      double var23 = (var0.maxX - var0.minX) * 0.5;
      double var25 = (var0.maxZ - var0.minZ) * 0.5;
      double var27 = Math.toRadians(BreezeClient.CONST_A.getRenderManager().playerViewY);
      double var29 = Math.cos(var27);
      double var31 = Math.sin(var27);
      double var33 = -var29;
      double var35 = -var31;
      double var37 = var23 * Math.abs(var29) + var25 * Math.abs(var31);
      double var39 = Math.max(0.02, (var23 + var25) * var3);
      double var41 = Math.max(0.01, (var23 + var25) * var2);
      double var43 = var13 - (var37 + var39 + var41) * var33;
      double var45 = var15 - (var37 + var39 + var41) * var35;
      double var47 = (var17 + var19) * 0.5;
      float var49 = Math.max(0.0F, Math.min(1.0F, var1));
      double var50 = var17 + (var19 - var17) * var49;
      boolean var52 = GL11.glIsEnabled(3553);
      boolean var53 = GL11.glIsEnabled(2884);
      boolean var54 = GL11.glIsEnabled(3042);
      double var55 = var7 - var43;
      double var57 = var9 - var47;
      double var59 = var11 - var45;
      double var61 = Math.sqrt(var55 * var55 + var57 * var57 + var59 * var59);
      if (var61 == 0.0) {
         var61 = 1.0;
      }

      var55 /= var61;
      var57 /= var61;
      var59 /= var61;
      double var63 = 0.001;
      GL11.glDisable(3553);
      GL11.glDisable(2884);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glPushMatrix();
      GL11.glTranslated(-var7, -var9, -var11);
      GL11.glColor4f(var4.getRed() / 255.0F, var4.getGreen() / 255.0F, var4.getBlue() / 255.0F, var4.getAlpha() / 255.0F);
      GL11.glBegin(7);
      GL11.glVertex3d(var43 - var41 * var33, var47 - var21, var45 - var41 * var35);
      GL11.glVertex3d(var43 + var41 * var33, var47 - var21, var45 + var41 * var35);
      GL11.glVertex3d(var43 + var41 * var33, var47 + var21, var45 + var41 * var35);
      GL11.glVertex3d(var43 - var41 * var33, var47 + var21, var45 - var41 * var35);
      GL11.glEnd();
      if (var6 > 0.0F) {
         double var65 = var6;
         double var67 = -var41 - var65;
         double var69 = -var41;
         double var71 = var41;
         double var73 = var41 + var65;
         double var75 = -var21;
         double var77 = -var21 - var65;
         double var79 = var21;
         double var81 = var21 + var65;
         GL11.glColor3f(0.0F, 0.0F, 0.0F);
         GL11.glBegin(7);
         GL11.glVertex3d(var43 + var67 * var33 + var63 * var55, var47 + var75 + var63 * var57, var45 + var67 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var67 * var33 + var63 * var55, var47 + var79 + var63 * var57, var45 + var67 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var69 * var33 + var63 * var55, var47 + var79 + var63 * var57, var45 + var69 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var69 * var33 + var63 * var55, var47 + var75 + var63 * var57, var45 + var69 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var71 * var33 + var63 * var55, var47 + var75 + var63 * var57, var45 + var71 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var71 * var33 + var63 * var55, var47 + var79 + var63 * var57, var45 + var71 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var73 * var33 + var63 * var55, var47 + var79 + var63 * var57, var45 + var73 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var73 * var33 + var63 * var55, var47 + var75 + var63 * var57, var45 + var73 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var67 * var33 + var63 * var55, var47 + var79 + var63 * var57, var45 + var67 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var67 * var33 + var63 * var55, var47 + var81 + var63 * var57, var45 + var67 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var73 * var33 + var63 * var55, var47 + var81 + var63 * var57, var45 + var73 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var73 * var33 + var63 * var55, var47 + var79 + var63 * var57, var45 + var73 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var67 * var33 + var63 * var55, var47 + var77 + var63 * var57, var45 + var67 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var67 * var33 + var63 * var55, var47 + var75 + var63 * var57, var45 + var67 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var73 * var33 + var63 * var55, var47 + var75 + var63 * var57, var45 + var73 * var35 + var63 * var59);
         GL11.glVertex3d(var43 + var73 * var33 + var63 * var55, var47 + var77 + var63 * var57, var45 + var73 * var35 + var63 * var59);
         GL11.glEnd();
      }

      GL11.glDisable(3042);
      GL11.glColor4f(var5.getRed() / 255.0F, var5.getGreen() / 255.0F, var5.getBlue() / 255.0F, var5.getAlpha() / 255.0F);
      GL11.glBegin(7);
      GL11.glVertex3d(var43 - var41 * var33 + var63 * var55, var17 + var63 * var57, var45 - var41 * var35 + var63 * var59);
      GL11.glVertex3d(var43 + var41 * var33 + var63 * var55, var17 + var63 * var57, var45 + var41 * var35 + var63 * var59);
      GL11.glVertex3d(var43 + var41 * var33 + var63 * var55, var50 + var63 * var57, var45 + var41 * var35 + var63 * var59);
      GL11.glVertex3d(var43 - var41 * var33 + var63 * var55, var50 + var63 * var57, var45 - var41 * var35 + var63 * var59);
      GL11.glEnd();
      GL11.glEnable(3042);
      GL11.glPopMatrix();
      if (!var54) {
         GL11.glDisable(3042);
      }

      if (var53) {
         GL11.glEnable(2884);
      } else {
         GL11.glDisable(2884);
      }

      if (var52) {
         GL11.glEnable(3553);
      } else {
         GL11.glDisable(3553);
      }
   }

   private static boolean lambda$onTick_Inner0(Entity var0) {
      return var0 == null || var0.isDead || !var0.isEntityAlive();
   }

   static {
      long var0 = 6766067706533L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[39];
      int var5 = 0;
      String var6 = "\u0002\u0098;)!\u00adm\u0012\u0006\u000bÕ\u000e&\u0014é¬½Cö~\u009bvè\u009d\u0010y5íh.E\u001cÌrØ\u0088ü\u008a{ÐB(\u0005\u001a÷TL\u000fé¼ÌOo±O\u00ad\u009e·)}\u0084J¿íÏ¶eÅkª\u008a\u008fÛ\u009cÚùÊ\u0092©ª\u0088\u0006(\u00ad\u001aÏ¿rÆ{>ÿ+Ú§û¢]ÖdF2²\u0018ÙwC\u008f{\b]¥sÇ\u0095\bû`áÏü\u0001D\u0010\u000eÌ=\u001f?Õ\u00924pA¼Õ¬>\u001cÓ\u0018ð£\u0099ÇS^Ãí\u0007^]¢\u001eº\u0012K¼\u0004»âÊ24ø\u0018Ü]û\u009b\u0089¯ðû¢\u0097\u001b¦OY°gNlçVX¶0Óp\u0012I{\u001d\u0098$ôOú\u009b\u0019\b\r\u0098\u0018-\u0086£·c6r¢\u008f\u0088\u001eÐÉ\u001bîxê§½ÊN{ÀíûÍ\tg¼\u0081aßÓ\u0010}ÖPPþVnX¼\u0001T\u008d\b·\u0090\u001e\u008bc\u0093\u001e[ò¦\u009e\u009cV\u0089ßæü\r`\u0094\u009cw\u009b\t\u0098¸\u009dË\bc#\u0014^x¸ª +\u0097@óEþ\u007f\u0089Ñ\u0093´\"\u0097\u0010ó+£²7P\u0082å÷Î6\u009b\u0096ÑÂÏ\u0010YÃí\u0004æ\u009bí\u001cØ_;ë;\u009fÒX\u0010cC1\u000eÐ\u0014\u009a_É\u0088þ\u0084_\u0019\u008a\u0080h\u009d\u001a\u0007\\¼rç\u0015h\u009cN!è)\u0007\f\u000f\bn^ï5ßÐL°/BÚ \u009cÂ\u001b,9þ\u0019ÐF\u001f\u0014ô\u00040\u0084\u009cÖvûÀo[fÛ%\"þ\u0096xðQ÷ü\u0016'¤XL¸Ñû4\u0095B}\u001e\u0094\fu\u0015ñâmÀ!lFÂD\u001c\u0015ØøJ¤]W\u009cÆôDÓ~C@\u0010¬¤\u0007\u008d\f+\u0091AM\r\u0005RU±P\u001b¡Ji&\u0080a\fëCf\u001e\u000bZÁ\u008fÏ+GNåt³\u0014\nF®ùPÆ>Ð\u001d\u0095¦IîZ9\u0001}\u009aa¼\u0086$Ñg@ÐÔ$³O\t®\u009b\u009aÜI\u0007\u0082M(o³È-HHaÞ\u009c\u0099\u0098ø\u0097OªØÛûl\u009e°\u0011*oèQ\tç$×j\u001er\u0088oPÍ¯\fåkJc&\u008f8h}á89í»\u0087{²À}\t°L\u0001÷ö!Íû,×Èÿ\u009dÙKT\u0019àðç£È\u0011\u0010Ó\fµw%Y\u008a«¾w`³\u009côÎ'\u0002×²n¯X)\u0010'*j\u0091\u001dßx\u009e$\u0083µ\u0005M\u0002 »@Dq5ZÂòøÏþôy7c£qßÚ&ÅõÆËVé\u0016~×\nùÝ\u009eÚ\n@\u0084\u0019\rÖÉh\u008f\u0011õ´Ù³áE\u0088¸3gà®zûò83t,}ý\u0085 \u0004\u0096\u0092\u0015lµ\u0085\u0095 #nÃ÷\b?\u009cÁáÐ\u0007]Ñ{(V\u0001òK¶ÌØ](ÿ\u009fÊya\nÐY}'\u0096ÎTÂðì\u00ad\u0082#|\u0007¥Â%ßÄt\r+AgN\u0000Àh\u0087ò\u0086y\u0001\u0018ïe*\u001e\u0004\u0088\u008bû~J¶Q\u0099¯+XÄ9\f\u008dªtXAH\u0011eI/å#a·@\u0010T'ø³ôäN½°kÒ¶\u0080Jyûp\u0084;=Ä{?î\u0099|*Hl75VwH\u009e¢\u0088ûì5ô\u001c)êª\u009f\u008a55ãÂT\u0099g+k\u00823Æë\u009f\u0094 «Åê_a÷=vYA¥EuÎsEk\u0097Þ\u0016zùÛ%ßÕå3}¬VF\u0010a\u0084oèÞ =\u0013Ñù\u0082î\u008b\u009a\u0098Ñ@¢-Í¤\u0084Á\u0013ðû\u008f_ÁÀÖaA|,·rgÆm\u0003\u0004\u0081¦Ç\u0014\u008d\b\u008b© 8\u001c¥Ç:\u007fï\u0096KÚ§~\u0098L·ÕvîÍ9\u0085½ÏY5¥»à+Î(\u0082MýÖ\u0003\u0013 nB\u0010äQ®S\u000b&Þ\u009d+\u0098\u009eë0nq\u0000\u0003¨÷}\"6\u0089ñ{ìã\u0013\"\u009a\u0010\"\t\u0087¾¸C[\u007f¼OqÀ\u001a\u008d\u001b@8ã\u0012¨«ÑôÒ]ÂV \u0088?\u0090\u0097Ô\u008b¥o\u0080\u0005Ë\u0096aZ\u0014a\u008b\u0084\r\u00157N)\u0018«¢£ÚÉÍj#JÎ\u0013JÎ³|\u0091zT4Ñ[\u0010§\u009cu¶\u001c\u000b¬NQ\u0003,þ6\u0092¹G ì\u0006\"I\u0098D°ð\f\u008d\u000f8µÕ\u0013Kà5Ä²cFGÑñ\u0086µ®nù\u0086ó@}\u001eòiÜb¾Ôåÿ{ ;\u009fþ=HÄ\u0095\f1ÇÊ\u0000\u008f.´°¥\u0081¤\u000eJ)¸J\u000f¿°±\u008cëÔD_Ê\u00ad\u0082?\u001e¬<\u009b7.xfZTvÏ\u0003¢T\u0010>\u001a\u0095öÎ{\u0095)UØÖ\u0084F{Q\b\u0010\u0018¤3\u0090|óç]$M¾\u0012ÌtkK(\u009fÀBÕù6wuý~¯ÃT®Q}Y¢f\u008dç5\u008eCE\u0091»ÕÖDi?\u0093\u0011ÚH\u0014,Æs ¾\u0014ó?>\u0095¯.Fu´u\u0092\u0002ÓÍS¶\u0000Áí\u00adÄ~Þ\u009eÌ\u001bôæ4¬@*£\u001bû8ºÖ®©êc\u0003M\u0007\u001b\u0014\u001fÏD\u0005¶¤I¹ò3 ÈN\u00065¬\nZ\u0087[©ÿq«\u0004\u0002·I\u009cÑV7\u009c\u0093!Ý\u00adj\u008b\u0083\u0091(5Å\u0001Gyã8þ(R=\u0018}oÙLÞzI!/1\u008dß\u0087}:æºµ¶æ\u001cà\u0089ºÄ4¨\u0091\tST¹G¢Ñ\u008b\u0081@\u0014LlÁZKT\u0092QC\\þ(XÅßaKÿBRçÐÀ¤Û\u0084\u0001º°J¸ú\u001eöis]Í_ác¿;\u0005º«P\u009aî\u0084Ñ&/]\u0013®ß·l§\u0004´X\u009b\u0000y0p\u009dÝU8®4ã\u0092PTjþ-¡\tP\u00800v\u0018U\u0007\u0080ªß¯\u0084uF\f\u008eíf";
      int var7 = "\u0002\u0098;)!\u00adm\u0012\u0006\u000bÕ\u000e&\u0014é¬½Cö~\u009bvè\u009d\u0010y5íh.E\u001cÌrØ\u0088ü\u008a{ÐB(\u0005\u001a÷TL\u000fé¼ÌOo±O\u00ad\u009e·)}\u0084J¿íÏ¶eÅkª\u008a\u008fÛ\u009cÚùÊ\u0092©ª\u0088\u0006(\u00ad\u001aÏ¿rÆ{>ÿ+Ú§û¢]ÖdF2²\u0018ÙwC\u008f{\b]¥sÇ\u0095\bû`áÏü\u0001D\u0010\u000eÌ=\u001f?Õ\u00924pA¼Õ¬>\u001cÓ\u0018ð£\u0099ÇS^Ãí\u0007^]¢\u001eº\u0012K¼\u0004»âÊ24ø\u0018Ü]û\u009b\u0089¯ðû¢\u0097\u001b¦OY°gNlçVX¶0Óp\u0012I{\u001d\u0098$ôOú\u009b\u0019\b\r\u0098\u0018-\u0086£·c6r¢\u008f\u0088\u001eÐÉ\u001bîxê§½ÊN{ÀíûÍ\tg¼\u0081aßÓ\u0010}ÖPPþVnX¼\u0001T\u008d\b·\u0090\u001e\u008bc\u0093\u001e[ò¦\u009e\u009cV\u0089ßæü\r`\u0094\u009cw\u009b\t\u0098¸\u009dË\bc#\u0014^x¸ª +\u0097@óEþ\u007f\u0089Ñ\u0093´\"\u0097\u0010ó+£²7P\u0082å÷Î6\u009b\u0096ÑÂÏ\u0010YÃí\u0004æ\u009bí\u001cØ_;ë;\u009fÒX\u0010cC1\u000eÐ\u0014\u009a_É\u0088þ\u0084_\u0019\u008a\u0080h\u009d\u001a\u0007\\¼rç\u0015h\u009cN!è)\u0007\f\u000f\bn^ï5ßÐL°/BÚ \u009cÂ\u001b,9þ\u0019ÐF\u001f\u0014ô\u00040\u0084\u009cÖvûÀo[fÛ%\"þ\u0096xðQ÷ü\u0016'¤XL¸Ñû4\u0095B}\u001e\u0094\fu\u0015ñâmÀ!lFÂD\u001c\u0015ØøJ¤]W\u009cÆôDÓ~C@\u0010¬¤\u0007\u008d\f+\u0091AM\r\u0005RU±P\u001b¡Ji&\u0080a\fëCf\u001e\u000bZÁ\u008fÏ+GNåt³\u0014\nF®ùPÆ>Ð\u001d\u0095¦IîZ9\u0001}\u009aa¼\u0086$Ñg@ÐÔ$³O\t®\u009b\u009aÜI\u0007\u0082M(o³È-HHaÞ\u009c\u0099\u0098ø\u0097OªØÛûl\u009e°\u0011*oèQ\tç$×j\u001er\u0088oPÍ¯\fåkJc&\u008f8h}á89í»\u0087{²À}\t°L\u0001÷ö!Íû,×Èÿ\u009dÙKT\u0019àðç£È\u0011\u0010Ó\fµw%Y\u008a«¾w`³\u009côÎ'\u0002×²n¯X)\u0010'*j\u0091\u001dßx\u009e$\u0083µ\u0005M\u0002 »@Dq5ZÂòøÏþôy7c£qßÚ&ÅõÆËVé\u0016~×\nùÝ\u009eÚ\n@\u0084\u0019\rÖÉh\u008f\u0011õ´Ù³áE\u0088¸3gà®zûò83t,}ý\u0085 \u0004\u0096\u0092\u0015lµ\u0085\u0095 #nÃ÷\b?\u009cÁáÐ\u0007]Ñ{(V\u0001òK¶ÌØ](ÿ\u009fÊya\nÐY}'\u0096ÎTÂðì\u00ad\u0082#|\u0007¥Â%ßÄt\r+AgN\u0000Àh\u0087ò\u0086y\u0001\u0018ïe*\u001e\u0004\u0088\u008bû~J¶Q\u0099¯+XÄ9\f\u008dªtXAH\u0011eI/å#a·@\u0010T'ø³ôäN½°kÒ¶\u0080Jyûp\u0084;=Ä{?î\u0099|*Hl75VwH\u009e¢\u0088ûì5ô\u001c)êª\u009f\u008a55ãÂT\u0099g+k\u00823Æë\u009f\u0094 «Åê_a÷=vYA¥EuÎsEk\u0097Þ\u0016zùÛ%ßÕå3}¬VF\u0010a\u0084oèÞ =\u0013Ñù\u0082î\u008b\u009a\u0098Ñ@¢-Í¤\u0084Á\u0013ðû\u008f_ÁÀÖaA|,·rgÆm\u0003\u0004\u0081¦Ç\u0014\u008d\b\u008b© 8\u001c¥Ç:\u007fï\u0096KÚ§~\u0098L·ÕvîÍ9\u0085½ÏY5¥»à+Î(\u0082MýÖ\u0003\u0013 nB\u0010äQ®S\u000b&Þ\u009d+\u0098\u009eë0nq\u0000\u0003¨÷}\"6\u0089ñ{ìã\u0013\"\u009a\u0010\"\t\u0087¾¸C[\u007f¼OqÀ\u001a\u008d\u001b@8ã\u0012¨«ÑôÒ]ÂV \u0088?\u0090\u0097Ô\u008b¥o\u0080\u0005Ë\u0096aZ\u0014a\u008b\u0084\r\u00157N)\u0018«¢£ÚÉÍj#JÎ\u0013JÎ³|\u0091zT4Ñ[\u0010§\u009cu¶\u001c\u000b¬NQ\u0003,þ6\u0092¹G ì\u0006\"I\u0098D°ð\f\u008d\u000f8µÕ\u0013Kà5Ä²cFGÑñ\u0086µ®nù\u0086ó@}\u001eòiÜb¾Ôåÿ{ ;\u009fþ=HÄ\u0095\f1ÇÊ\u0000\u008f.´°¥\u0081¤\u000eJ)¸J\u000f¿°±\u008cëÔD_Ê\u00ad\u0082?\u001e¬<\u009b7.xfZTvÏ\u0003¢T\u0010>\u001a\u0095öÎ{\u0095)UØÖ\u0084F{Q\b\u0010\u0018¤3\u0090|óç]$M¾\u0012ÌtkK(\u009fÀBÕù6wuý~¯ÃT®Q}Y¢f\u008dç5\u008eCE\u0091»ÕÖDi?\u0093\u0011ÚH\u0014,Æs ¾\u0014ó?>\u0095¯.Fu´u\u0092\u0002ÓÍS¶\u0000Áí\u00adÄ~Þ\u009eÌ\u001bôæ4¬@*£\u001bû8ºÖ®©êc\u0003M\u0007\u001b\u0014\u001fÏD\u0005¶¤I¹ò3 ÈN\u00065¬\nZ\u0087[©ÿq«\u0004\u0002·I\u009cÑV7\u009c\u0093!Ý\u00adj\u008b\u0083\u0091(5Å\u0001Gyã8þ(R=\u0018}oÙLÞzI!/1\u008dß\u0087}:æºµ¶æ\u001cà\u0089ºÄ4¨\u0091\tST¹G¢Ñ\u008b\u0081@\u0014LlÁZKT\u0092QC\\þ(XÅßaKÿBRçÐÀ¤Û\u0084\u0001º°J¸ú\u001eöis]Í_ác¿;\u0005º«P\u009aî\u0084Ñ&/]\u0013®ß·l§\u0004´X\u009b\u0000y0p\u009dÝU8®4ã\u0092PTjþ-¡\tP\u00800v\u0018U\u0007\u0080ªß¯\u0084uF\f\u008eíf"
         .length();
      char var8 = 24;
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
                     CONST_O = var4;
                     CONST_P = new String[39];
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

                  var6 = "\u0090gä¨~ú\u0085h{\u009fC3v\u009cEÒ\u0088¨î\u0091<ø\u0000ZÂµÃ¾\t\u0088\nIÚê¡u6;Ñã\u009d\u0096}þ\u000f\u008d+sWtãnø»\u0003/ö\u0081/\nþ`\u0080[ßé*NÖA¨\u008eªáYø\u008eÚæþÐw/]\u0086Ø+´OIëv÷Xä R¸¢[È¬½\u0013+ÆÄ\u0092ïàë\u009f\u0097Ò\u000fGÌ\u009dÙY\u0080ïÀà\u007f02Õ{¹ßÈ\u008a\u0007JiÏR\u0018u½ë\u0007j:ù\u0011jy\u0093\u0083\u0018¯";
                  var7 = "\u0090gä¨~ú\u0085h{\u009fC3v\u009cEÒ\u0088¨î\u0091<ø\u0000ZÂµÃ¾\t\u0088\nIÚê¡u6;Ñã\u009d\u0096}þ\u000f\u008d+sWtãnø»\u0003/ö\u0081/\nþ`\u0080[ßé*NÖA¨\u008eªáYø\u008eÚæþÐw/]\u0086Ø+´OIëv÷Xä R¸¢[È¬½\u0013+ÆÄ\u0092ïàë\u009f\u0097Ò\u000fGÌ\u009dÙY\u0080ïÀà\u007f02Õ{¹ßÈ\u008a\u0007JiÏR\u0018u½ë\u0007j:ù\u0011jy\u0093\u0083\u0018¯"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 255;
      if (CONST_P[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Q.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Q.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/d5", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_O[var3].getBytes("ISO-8859-1");
         CONST_P[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_P[var3];
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
         throw new RuntimeException("rip/breeze/client/d5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
