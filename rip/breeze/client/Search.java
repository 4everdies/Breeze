package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "Search",
   b = "Finds the blocks you pick and draws them through the world.",
   d = rip.breeze.ModuleCategory.VISUAL,
   c = {"xray", "ore", "ores", "find", "esp", "blocks", "tracers"}
)
public class Search extends BreezeModule {
   private static final float CONST_N = 0.1F;
   private static Map<Block, Color> map_o;
   private Set<Block> set_p;
   private final GenericSetting<rip.breeze.ConfigMap> blocksSetting;
   private final GenericSetting<RenderMode2> fillAlphaSetting;
   private final GenericSetting<Integer> lineWidthSetting;
   private final GenericSetting<Double> tracersSetting;
   private final GenericSetting<Boolean> customColorSetting;
   private final GenericSetting<ClientMode> rangeSetting;
   private final GenericSetting<rip.breeze.BreezeColor> dataBuilder54_w;
   private final GenericSetting<Integer> dataBuilder54_x;
   private final Map<Long, Util44> map_y;
   private final Map<Block, Color> map_z;
   private final List<float[]> list_A;
   private final FloatBuffer floatBuffer_B;
   private final float[] arr_C;
   private boolean fieldBool_D;
   private boolean fieldBool_E;
   private boolean fieldBool_F;
   private boolean fieldBool_G;
   private boolean fieldBool_H;
   private boolean fieldBool_I;
   private boolean fieldBool_J;
   private boolean fieldBool_K;
   private float fieldFloat_L;
   private static final String[] CONST_N_2;
   private static final String[] CONST_O;
   private static final Map CONST_P = new HashMap(13);
   private static final long[] CONST_Q;
   private static final Integer[] CONST_R;
   private static final Map CONST_S;

   public Search() {
      long var1 = 110156266071432L;
      super();
      this.set_p = Collections.emptySet();
      short var10002 = 11291;
      long var10003 = 3754495956259216315L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Blocks");
      var10002 = 19561;
      var10003 = 3060444055967529941L ^ var1;
      var10001 = var10001.getDataBuilder50_3("The blocks to look for.");
      String[] var10004 = new String[2];
      short var10007 = 16183;
      long var10008 = 8119194376814200982L ^ var1;
      var10004[0] = "minecraft:diamond_ore";
      var10007 = 25262;
      var10008 = 7902088537864918283L ^ var1;
      var10004[1] = "minecraft:emerald_ore";
      this.blocksSetting = var10001.getDataBuilder50_4(new rip.breeze.ConfigMap(var10004)).getDataBuilder50_10(this::lambda$new_Inner0).getDataBuilder54();
      var10002 = 30523;
      var10003 = 2260836978823676060L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "How the blocks that turn up are drawn.");
      var10002 = 7015;
      var10003 = 2987704104579443914L ^ var1;
      this.fillAlphaSetting = var10001.getDataBuilder50_3("FillAlpha").getDataBuilder50_4(RenderMode2.FULL).getDataBuilder54();
      var10002 = 20332;
      var10003 = 2567442639685679319L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "How solid the filled part of a box is.");
      var10002 = 9672;
      var10003 = 3467294462314680934L ^ var1;
      this.lineWidthSetting = var10001.getDataBuilder50_3("LineWidth")
         .getDataBuilder50_4(60)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 255))
         .getDataBuilder50_9(Search::lambda$new_Inner1)
         .getDataBuilder54();
      var10002 = 16694;
      var10003 = 7609983408864065178L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Tracers");
      var10002 = 22478;
      var10003 = 28689928257265777L ^ var1;
      this.tracersSetting = var10001.getDataBuilder50_3("Draw a line out to every vein found. One line per vein, not per block.")
         .getDataBuilder50_4(1.5)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.5, 5.0))
         .getDataBuilder50_9(Search::lambda$new_Inner2)
         .getDataBuilder54();
      var10002 = 26900;
      var10003 = 7550702769382973102L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "BLOCK takes each colour from the block's own texture, so ores come out the colour you would expect.");
      var10002 = 18596;
      var10003 = 6909155591756644107L ^ var1;
      this.customColorSetting = var10001.getDataBuilder50_3("CustomColor").getDataBuilder50_4(false).getDataBuilder54();
      short var18 = 114;
      var10003 = 617235035376138198L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "The one colour used for every block.");
      var18 = 2014;
      var10003 = 7280269084272701536L ^ var1;
      this.rangeSetting = var10001.getDataBuilder50_3("Range").getDataBuilder50_4(ClientMode.BLOCK).getDataBuilder54();
      var18 = 13318;
      var10003 = 6338102876395766701L ^ var1;
      this.dataBuilder54_w = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this, "How far out to draw, in blocks.")
         .getDataBuilder50_3("The one colour used for every block.")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(0, 200, 255))
         .getDataBuilder50_8()
         .getDataBuilder50_9(Search::lambda$new_Inner3)
         .getDataBuilder54();
      this.dataBuilder54_x = GenericSetting.<Integer>getDataBuilder50(this, "Range")
         .getDataBuilder50_3("How far out to draw, in blocks.")
         .getDataBuilder50_4(128)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(16, 256))
         .getDataBuilder54();
      this.map_y = new HashMap<>();
      this.map_z = new HashMap<>();
      this.list_A = new ArrayList<>();
      this.floatBuffer_B = BufferUtils.createFloatBuffer(16);
      this.arr_C = new float[16];
   }

   @Override
   protected void initialize() {
      this.processAll();
      BreezeClient.getCloudSyncWorker().update(this, this.set_p);
   }

   protected void initialize_2() {
      BreezeClient.getCloudSyncWorker().processNullable(this);
      this.map_y.clear();
   }

   public String buildString() {
      long var1 = 94639785842642L;
      int var3 = this.blocksSetting.getObject_m().getValue();
      return var3 == 1 ? "1 block" : var3 + " blocks";
   }

   private void processAll() {
      Set var1 = Collections.newSetFromMap(new IdentityHashMap());

      for (String var3 : this.blocksSetting.getObject_m().getList_c()) {
         Block var4 = Block.getBlockFromName(var3);
         if (var4 != null && var4 != Blocks.air) {
            var1.add(var4);
            if (var4 == Blocks.redstone_ore) {
               var1.add(Blocks.lit_redstone_ore);
            }
         }
      }

      this.set_p = var1;
      this.map_y.clear();
   }

   @EventListener
   public void update(PreTickEventEvent var1) {
      if (!this.map_y.isEmpty()) {
         CloudSyncWorker var2 = BreezeClient.getCloudSyncWorker();
         this.map_y.keySet().removeIf(Search::lambda$onTick_Inner4);
      }
   }

   @EventListener
   public void calculate(Render3DEventEvent var1) {
      if (BreezeClient.CONST_A.theWorld != null && BreezeClient.CONST_A.thePlayer != null) {
         if (!this.fillAlphaSetting.isValid(RenderMode2._OFF) || this.customColorSetting.getObject_m()) {
            CloudSyncWorker var2 = BreezeClient.getCloudSyncWorker();
            Collection var3 = var2.getCollection();
            if (!var3.isEmpty()) {
               Vec3 var4 = BreezeClient.CONST_A.getRenderViewEntity().getPositionEyes(var1.fieldFloat_h);
               double var5 = this.dataBuilder54_x.getObject_m().intValue();
               double var7 = var5 * var5;
               double var9 = (var5 + 16.0) * (var5 + 16.0);
               boolean var11 = !this.fillAlphaSetting.isValid(RenderMode2._OFF);
               boolean var12 = this.customColorSetting.getObject_m();
               this.list_A.clear();
               this.render();

               try {
                  for (BlockUtil9 var14 : var3) {
                     double var15 = (var14.fieldInt_a << 4) + 8 - var4.xCoord;
                     double var17 = (var14.fieldInt_b << 4) + 8 - var4.zCoord;
                     if (!(var15 * var15 + var17 * var17 > var9)) {
                        for (Entry var20 : this.searchModules(var2, var14).entrySet()) {
                           ImageUtil18 var21 = (ImageUtil18)var20.getValue();
                           if (!(clamp(var4, var21) > var7)) {
                              Color var22 = this.getColor((Block)var20.getKey());
                              if (var11
                                 && RenderUtil31.getHitbox_2(
                                    new AxisAlignedBB(var21.fieldFloat_f, var21.fieldFloat_g, var21.fieldFloat_h, var21.fieldFloat_i, var21.fieldFloat_j, var21.fieldFloat_k)
                                 )) {
                                 this.calculate_2(var21, var22);
                              }

                              if (var12) {
                                 for (float[] var26 : var21.arr_e) {
                                    this.list_A
                                       .add(new float[]{var26[0], var26[1], var26[2], var22.getRed(), var22.getGreen(), var22.getBlue(), var22.getAlpha()});
                                 }
                              }
                           }
                        }
                     }
                  }

                  if (var12 && !this.list_A.isEmpty()) {
                     this.calculate_3();
                  }
               } finally {
                  this.processAll_2();
               }
            }
         }
      }
   }

   private Map<Block, ImageUtil18> searchModules(CloudSyncWorker var1, BlockUtil9 var2) {
      long var3 = CloudSyncWorker.getLong(var2.fieldInt_a, var2.fieldInt_b);
      Util44 var5 = this.map_y.get(var3);
      if (var5 != null && var5.dataBuilder30_a == var2 && var5.fieldInt_b == var2.fieldInt_d) {
         return var5.map_c;
      }

      HashMap var6 = new HashMap();

      for (Block var8 : var2.getBlockSet()) {
         if (this.set_p.contains(var8)) {
            Set var9 = var2.getBlockData(var8).keySet();
            long[] var10 = new long[var9.size()];
            int var11 = 0;

            for (long var13 : var9) {
               if (var11 == var10.length) {
                  var10 = Arrays.copyOf(var10, var11 + 16);
               }

               var10[var11++] = var13;
            }

            if (var11 != var10.length) {
               var10 = Arrays.copyOf(var10, var11);
            }

            if (var11 != 0) {
               var6.put(var8, ImageUtil18.clamp(var10, Search::lambda$mesh_Inner5, var2.fieldInt_a, var2.fieldInt_b));
            }
         }
      }

      Util44 var15 = new Util44(null);
      var15.dataBuilder30_a = var2;
      var15.fieldInt_b = var2.fieldInt_d;
      var15.map_c = var6;
      this.map_y.put(var3, var15);
      return var6;
   }

   private void calculate_2(ImageUtil18 var1, Color var2) {
      int var3 = var2.getRed();
      int var4 = var2.getGreen();
      int var5 = var2.getBlue();
      Tessellator var6 = Tessellator.getInstance();
      WorldRenderer var7 = var6.getWorldRenderer();
      if ((this.fillAlphaSetting.isValid(RenderMode2.FILLED) || this.fillAlphaSetting.isValid(RenderMode2.FULL)) && var1.arr_c.length > 0) {
         int var8 = this.lineWidthSetting.getObject_m() * var2.getAlpha() / 255;
         var7.begin(7, DefaultVertexFormats.POSITION_COLOR);

         for (byte var9 = 0; var9 < var1.arr_c.length; var9 += 3) {
            var7.pos(var1.arr_c[var9], var1.arr_c[var9 + 1], var1.arr_c[var9 + 2]).color(var3, var4, var5, var8).endVertex();
         }

         var6.draw();
      }

      if ((this.fillAlphaSetting.isValid(RenderMode2.OUTLINE) || this.fillAlphaSetting.isValid(RenderMode2.FULL)) && var1.arr_d.length > 0) {
         GL11.glLineWidth(this.tracersSetting.getObject_m().floatValue());
         var7.begin(1, DefaultVertexFormats.POSITION_COLOR);

         for (byte var10 = 0; var10 < var1.arr_d.length; var10 += 3) {
            var7.pos(var1.arr_d[var10], var1.arr_d[var10 + 1], var1.arr_d[var10 + 2]).color(var3, var4, var5, var2.getAlpha()).endVertex();
         }

         var6.draw();
      }
   }

   private void calculate_3() {
      ((Buffer)this.floatBuffer_B).clear();
      GL11.glGetFloat(2982, this.floatBuffer_B);
      this.floatBuffer_B.get(this.arr_C);
      Tessellator var1 = Tessellator.getInstance();
      WorldRenderer var2 = var1.getWorldRenderer();
      GlStateManager.pushMatrix();

      try {
         GlStateManager.loadIdentity();
         GL11.glLineWidth(this.tracersSetting.getObject_m().floatValue());
         var2.begin(1, DefaultVertexFormats.POSITION_COLOR);

         for (float[] var4 : this.list_A) {
            float var5 = var4[0];
            float var6 = var4[1];
            float var7 = var4[2];
            float var8 = this.arr_C[0] * var5 + this.arr_C[4] * var6 + this.arr_C[8] * var7 + this.arr_C[12];
            float var9 = this.arr_C[1] * var5 + this.arr_C[5] * var6 + this.arr_C[9] * var7 + this.arr_C[13];
            float var10 = this.arr_C[2] * var5 + this.arr_C[6] * var6 + this.arr_C[10] * var7 + this.arr_C[14];
            int var11 = (int)var4[3];
            int var12 = (int)var4[4];
            int var13 = (int)var4[5];
            var2.pos(0.0, 0.0, -0.1F).color(var11, var12, var13, 0).endVertex();
            var2.pos(var8, var9, var10).color(var11, var12, var13, (int)var4[6]).endVertex();
         }

         var1.draw();
      } finally {
         GlStateManager.popMatrix();
      }
   }

   private Color getColor(Block var1) {
      if (this.rangeSetting.isValid(ClientMode.CUSTOM)) {
         return this.dataBuilder54_w.getObject_m();
      }

      Color var2 = this.map_z.get(var1);
      if (var2 != null) {
         return var2;
      }

      Color var3 = getColor_2(var1);
      this.map_z.put(var1, var3);
      return var3;
   }

   private static Color getColor_2(Block var0) {
      Color var1 = getCachedResults().get(var0);
      if (var1 != null) {
         return var1;
      }

      int var2 = ItemColorExtractor.getValue(new ItemStack(var0));
      int var3 = var0.getRenderColor(var0.getDefaultState());
      return new Color((var2 >> 16 & 0xFF) * (var3 >> 16 & 0xFF) / 255, (var2 >> 8 & 0xFF) * (var3 >> 8 & 0xFF) / 255, (var2 & 0xFF) * (var3 & 0xFF) / 255);
   }

   private static Map<Block, Color> getCachedResults() {
      long var0 = 137979781492427L;
      if (map_o != null) {
         return map_o;
      }

      IdentityHashMap var2 = new IdentityHashMap();
      var2.put(Blocks.coal_ore, new Color(1481662423));
      var2.put(Blocks.iron_ore, new Color(-1298464596));
      var2.put(Blocks.gold_ore, new Color(-942793476));
      var2.put(Blocks.diamond_ore, new Color(-255446763));
      var2.put(Blocks.emerald_ore, new Color(-679454727));
      var2.put(Blocks.lapis_ore, new Color(978562456));
      var2.put(Blocks.redstone_ore, new Color(1256211172));
      var2.put(Blocks.quartz_ore, new Color(382307725));
      var2.put(Blocks.lit_redstone_ore, new Color("7貋"));
      var2.put(Blocks.chest, new Color(2028857665));
      var2.put(Blocks.trapped_chest, new Color(820384507));
      var2.put(Blocks.ender_chest, new Color(-950328293));
      var2.put(Blocks.mob_spawner, new Color(-1305375313));
      map_o = var2;
      return var2;
   }

   private static double clamp(Vec3 var0, ImageUtil18 var1) {
      double var2 = Math.max(Math.max(var1.fieldFloat_f - var0.xCoord, 0.0), var0.xCoord - var1.fieldFloat_i);
      double var4 = Math.max(Math.max(var1.fieldFloat_g - var0.yCoord, 0.0), var0.yCoord - var1.fieldFloat_j);
      double var6 = Math.max(Math.max(var1.fieldFloat_h - var0.zCoord, 0.0), var0.zCoord - var1.fieldFloat_k);
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   private void render() {
      this.fieldBool_D = GL11.glIsEnabled(3042);
      this.fieldBool_E = GL11.glIsEnabled(3553);
      this.fieldBool_F = GL11.glIsEnabled(2896);
      this.fieldBool_G = GL11.glIsEnabled(2884);
      this.fieldBool_H = GL11.glIsEnabled(2929);
      this.fieldBool_I = GL11.glIsEnabled(3008);
      this.fieldBool_J = GL11.glIsEnabled(2848);
      this.fieldBool_K = GL11.glGetBoolean(2930);
      this.fieldFloat_L = GL11.glGetFloat(2849);
      GlStateManager.pushMatrix();
      GlStateManager.translate(
         -BreezeClient.CONST_A.getRenderManager().viewerPosX,
         -BreezeClient.CONST_A.getRenderManager().viewerPosY,
         -BreezeClient.CONST_A.getRenderManager().viewerPosZ
      );
      GlStateManager.enableBlend();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.disableTexture2D();
      GlStateManager.disableLighting();
      GlStateManager.disableAlpha();
      GlStateManager.disableCull();
      GlStateManager.depthMask(false);
      GlStateManager.disableDepth();
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
   }

   private void processAll_2() {
      GlStateManager.popMatrix();
      if (this.fieldBool_H) {
         GlStateManager.enableDepth();
      } else {
         GlStateManager.disableDepth();
      }

      GlStateManager.depthMask(this.fieldBool_K);
      if (this.fieldBool_G) {
         GlStateManager.enableCull();
      } else {
         GlStateManager.disableCull();
      }

      if (this.fieldBool_I) {
         GlStateManager.enableAlpha();
      } else {
         GlStateManager.disableAlpha();
      }

      if (this.fieldBool_F) {
         GlStateManager.enableLighting();
      } else {
         GlStateManager.disableLighting();
      }

      if (this.fieldBool_E) {
         GlStateManager.enableTexture2D();
      } else {
         GlStateManager.disableTexture2D();
      }

      if (this.fieldBool_D) {
         GlStateManager.enableBlend();
      } else {
         GlStateManager.disableBlend();
      }

      if (this.fieldBool_D) {
         GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      }

      GL11.glLineWidth(this.fieldFloat_L);
      if (this.fieldBool_J) {
         GL11.glEnable(2848);
      } else {
         GL11.glDisable(2848);
      }

      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private static boolean lambda$mesh_Inner5(CloudSyncWorker var0, Block var1, int var2, int var3, int var4) {
      return var0.checkCondition(var2, var3, var4, var1);
   }

   private static boolean lambda$onTick_Inner4(CloudSyncWorker var0, Long var1) {
      return var0.getDataBuilder30(CloudSyncWorker.getValue(var1), CloudSyncWorker.getValue_2(var1)) == null;
   }

   private static boolean lambda$new_Inner3(rip.breeze.DateUtil var0) {
      long var1 = 96247930712503L;
      return var0.getObject("Color", ClientMode.class) == ClientMode.CUSTOM;
   }

   private static boolean lambda$new_Inner2(rip.breeze.DateUtil var0) {
      long var1 = 83287847209437L;
      return var0.getObject("Box", RenderMode2.class) == RenderMode2.OUTLINE
         || var0.getObject("Box", RenderMode2.class) == RenderMode2.FULL;
   }

   private static boolean lambda$new_Inner1(rip.breeze.DateUtil var0) {
      long var1 = 56002104458345L;
      return var0.getObject("Box", RenderMode2.class) == RenderMode2.FILLED
         || var0.getObject("Box", RenderMode2.class) == RenderMode2.FULL;
   }

   private void lambda$new_Inner0(rip.breeze.ConfigMap var1) {
      this.processAll();
      if (this.f()) {
         BreezeClient.getCloudSyncWorker().update(this, this.set_p);
      }
   }

   static {
      long var0 = 117567143863582L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[22];
      int var5 = 0;
      String var6 = "¬\\\u00957ü2\u000b®\u0018z/À¾©.fÊþ²0\u0094®B=&¿-Ù¡xÎe#Nÿq×<KA=ÿ\r(Id\u009b¾^+Ô\u009e)þYö\u0082ÿ|\u0016±^\\¶\u0088ê¥ÝV°9\u0004í$>\u001akä\u008búd\u001dûÞüIq\u0098JO\u007fH¹\u0085jV_LÕöft\u00853G/Õ\u0002Þ\u000f\u0014\u001d@YZ!ª\u0013c\u009bâ{Ç3\u0099t\u0097ÞH5Ô\u009fêý\u0087Qjàè\rö\u0093MBÌäBRå\t5É\u0012E\u0087@m\u0087Wé¤\u001c¥Åþ|ñÅ(\u007fÄé5ÛsßÎ@\u0086P÷Ì+Üézb\u008bhí*¡ò\u0097<!¿Ô±ü»aè@\u0002:\u0007ÌÐ;\u0093\u008dô\u009a¢H+ÒY½\u0018øÈ<gR§B\u0019³Ë\u0018.\u009b\u0007W¯1=\u008c¨I â4\u0085×Læþþ)ïb\u008fXwIVdÉË\u0005[9\u009fXw±ç\bð\u000bOs ú\u000fÅÀ\u0005Áf\u008a\u009b\u0094\u0085Â©Ï7\u007f¨\u0003nÃßoÇ\u0000\u001fH+¢5\u000f\u0087D@ú\u0088v2uçO\nNHjo·%\u001fQ'Ù£0Uï\u0084[tJ)|j\u001fQ\u0088ÌöÙ¢Ü¶\u000fê°á2Ö\u009c\u0081\u000eCE%d¾¾©þ¤¯è\u001b@\u009bÇÒz\u0010\u0004S\u001fÁ2\u0014ôGÃA\"Ê\u0011\u009c\u001c\u00ad\u0010°¬Ó¬Ö!hÙËÁû\u0014ö½Ô¶\u0010Ö\u0015\u009cÍ2\u001bµ\u0013á1¹Ä\u0094e)u8¬ô=¡\u0099Í\u0099ä$\u0003V·ËdÜQÞô\u000bNT\u0007\u008eäø\n)|â\u0095C²Ã'\u0011XË´pû\u0093}KO\u0094½\u008a\rûH\u0003ÎIY{S(]7ö\u0012áñP¨N2zxw®ÙQ\u0013î\u0094Ïªa\u001f\u0003÷¢º^:\u009cÍ\nÚw\u001d\"¬æø}\u0010\u0007\u0010Ù¸Ý\u0083\tb\u0000\u001c\rêô)\u0092b\u0010\u00058üÔI\u0019©èAq\u0082F\u0006Zå5\u0010.Ø¼¯u\u008c@²û8\u009a\u007f+\u0095Në0ÊU\u001bwÅ¼ö¦\u0011\u009fð\u0091²´8W[\"y:©Lñ^/Xh\u009c®Ô-m\u0003Å\u008b\u0095y;Q\u008c`1ÑÑ\u0005$nm\u0010n¡V¯IÛ\u008f\u009d\u0083ÿ\u0004{\u001fÕÇ}8\u0090V\u0090©-¬J¼¾[B.ëB\u008b>¤\u0085.¶\u009cÛ[nú,Ùj~©øw\u0012\u00129\u009d²!\u0003Êì\u0083\u0098\u0001%û\u000bIöØ\u00124\\Ú\u008aö¨=þ@¯\u0014\u0085Ç\u009bW\u0094òB~bh÷\u00844&°\u001d\u0003ê£±oé\nK0R\u0001&v\u0087ÚOÞ\u000f<TëE\fì\u009d²(eÌ\u0083uÁAÙ\u0001\u00192æM9+«¹§æÂ¹¥yrr6<OOÔÊ\u0094Å\u0088BÃN¤Â÷#ãµ+\u0085õæÀ(0ì±ÊYï\u0091\u008a÷(Éo\u0083Ãå\u0094U\u0016öT2\u000e\u0001\u009cº7¹)\u0098°·äg?/Yu×zºÇ\u0080\u009a4#e\u0004\u0004¥jkª\u0089Î*ÓzU\fÓÊ\b\u0093tï¡8(W¼\u0088 \u0010ÃÇ¹\u0099t\u0089\u0097¡.°ÑÍr|ªÃ(\u007fè»Q\u0010ñ;ÜÙrs²º\u0087¨y\u009ae²\u0011¸ÑÕl§~V\u009cÔ¡852\u0003®\u009a}áCË";
      int var7 = "¬\\\u00957ü2\u000b®\u0018z/À¾©.fÊþ²0\u0094®B=&¿-Ù¡xÎe#Nÿq×<KA=ÿ\r(Id\u009b¾^+Ô\u009e)þYö\u0082ÿ|\u0016±^\\¶\u0088ê¥ÝV°9\u0004í$>\u001akä\u008búd\u001dûÞüIq\u0098JO\u007fH¹\u0085jV_LÕöft\u00853G/Õ\u0002Þ\u000f\u0014\u001d@YZ!ª\u0013c\u009bâ{Ç3\u0099t\u0097ÞH5Ô\u009fêý\u0087Qjàè\rö\u0093MBÌäBRå\t5É\u0012E\u0087@m\u0087Wé¤\u001c¥Åþ|ñÅ(\u007fÄé5ÛsßÎ@\u0086P÷Ì+Üézb\u008bhí*¡ò\u0097<!¿Ô±ü»aè@\u0002:\u0007ÌÐ;\u0093\u008dô\u009a¢H+ÒY½\u0018øÈ<gR§B\u0019³Ë\u0018.\u009b\u0007W¯1=\u008c¨I â4\u0085×Læþþ)ïb\u008fXwIVdÉË\u0005[9\u009fXw±ç\bð\u000bOs ú\u000fÅÀ\u0005Áf\u008a\u009b\u0094\u0085Â©Ï7\u007f¨\u0003nÃßoÇ\u0000\u001fH+¢5\u000f\u0087D@ú\u0088v2uçO\nNHjo·%\u001fQ'Ù£0Uï\u0084[tJ)|j\u001fQ\u0088ÌöÙ¢Ü¶\u000fê°á2Ö\u009c\u0081\u000eCE%d¾¾©þ¤¯è\u001b@\u009bÇÒz\u0010\u0004S\u001fÁ2\u0014ôGÃA\"Ê\u0011\u009c\u001c\u00ad\u0010°¬Ó¬Ö!hÙËÁû\u0014ö½Ô¶\u0010Ö\u0015\u009cÍ2\u001bµ\u0013á1¹Ä\u0094e)u8¬ô=¡\u0099Í\u0099ä$\u0003V·ËdÜQÞô\u000bNT\u0007\u008eäø\n)|â\u0095C²Ã'\u0011XË´pû\u0093}KO\u0094½\u008a\rûH\u0003ÎIY{S(]7ö\u0012áñP¨N2zxw®ÙQ\u0013î\u0094Ïªa\u001f\u0003÷¢º^:\u009cÍ\nÚw\u001d\"¬æø}\u0010\u0007\u0010Ù¸Ý\u0083\tb\u0000\u001c\rêô)\u0092b\u0010\u00058üÔI\u0019©èAq\u0082F\u0006Zå5\u0010.Ø¼¯u\u008c@²û8\u009a\u007f+\u0095Në0ÊU\u001bwÅ¼ö¦\u0011\u009fð\u0091²´8W[\"y:©Lñ^/Xh\u009c®Ô-m\u0003Å\u008b\u0095y;Q\u008c`1ÑÑ\u0005$nm\u0010n¡V¯IÛ\u008f\u009d\u0083ÿ\u0004{\u001fÕÇ}8\u0090V\u0090©-¬J¼¾[B.ëB\u008b>¤\u0085.¶\u009cÛ[nú,Ùj~©øw\u0012\u00129\u009d²!\u0003Êì\u0083\u0098\u0001%û\u000bIöØ\u00124\\Ú\u008aö¨=þ@¯\u0014\u0085Ç\u009bW\u0094òB~bh÷\u00844&°\u001d\u0003ê£±oé\nK0R\u0001&v\u0087ÚOÞ\u000f<TëE\fì\u009d²(eÌ\u0083uÁAÙ\u0001\u00192æM9+«¹§æÂ¹¥yrr6<OOÔÊ\u0094Å\u0088BÃN¤Â÷#ãµ+\u0085õæÀ(0ì±ÊYï\u0091\u008a÷(Éo\u0083Ãå\u0094U\u0016öT2\u000e\u0001\u009cº7¹)\u0098°·äg?/Yu×zºÇ\u0080\u009a4#e\u0004\u0004¥jkª\u0089Î*ÓzU\fÓÊ\b\u0093tï¡8(W¼\u0088 \u0010ÃÇ¹\u0099t\u0089\u0097¡.°ÑÍr|ªÃ(\u007fè»Q\u0010ñ;ÜÙrs²º\u0087¨y\u009ae²\u0011¸ÑÕl§~V\u009cÔ¡852\u0003®\u009a}áCË"
         .length();
      char var8 = 'p';
      int var23 = -1;

      label54:
      while (true) {
         String var25 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var36;
                  if ((var23 += var8) >= var7) {
                     CONST_N_2 = var4;
                     CONST_O = new String[22];
                     CONST_S = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[13];
                     int var14 = 0;
                     String var15 = "6Ý#\u0094ï-åuI\u000b$%ºVqÎ&Ç\u009c¸\u0017\u0011~ÿ$qo±¥\u0095[\u0083ÅÚ¾$\u0099}{A\u0087Ø4Æxhi\u0091}·öj\u001b\u0083£\u0085ÛÒÍ\u008d\u0081\u0094\f«\u008aG1\rÁ`¬Hêðò\u0012Þ\u001cÞ_Tø_Ìr8B\u000e";
                     int var16 = "6Ý#\u0094ï-åuI\u000b$%ºVqÎ&Ç\u009c¸\u0017\u0011~ÿ$qo±¥\u0095[\u0083ÅÚ¾$\u0099}{A\u0087Ø4Æxhi\u0091}·öj\u001b\u0083£\u0085ÛÒÍ\u008d\u0081\u0094\f«\u008aG1\rÁ`¬Hêðò\u0012Þ\u001cÞ_Tø_Ìr8B\u000e"
                        .length();
                     byte var17 = 0;

                     label36:
                     while (true) {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        long[] var28 = var13;
                        var10001 = var14++;
                        long var40 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var19 = var40;
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
                           long var45 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var17 >= var16) {
                                    CONST_Q = var13;
                                    CONST_R = new Integer[13];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "L\\c\u0093üÒÐ9¬\u0096ri=¼¡o";
                                 var16 = "L\\c\u0093üÒÐ9¬\u0096ri=¼¡o".length();
                                 var17 = 0;
                           }

                           byte var34 = var17;
                           var17 += 8;
                           var18 = var15.substring(var34, var17).getBytes("ISO-8859-1");
                           var28 = var13;
                           var10001 = var14++;
                           var40 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var36;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label54;
                  }

                  var6 = "\u009d3à¸¯\u0085óÌ\u009bX\u00996æ¬\u0013Cã\\µØÛ#½2Qýx\u001dwùàÄ\u0010ÎËòß(\u0015ã!Çj\"\u0094·\u0087qx";
                  var7 = "\u009d3à¸¯\u0085óÌ\u009bX\u00996æ¬\u0013Cã\\µØÛ#½2Qýx\u001dwùàÄ\u0010ÎËòß(\u0015ã!Çj\"\u0094·\u0087qx".length();
                  var8 = ' ';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21031;
      if (CONST_O[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_P.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_P.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/eb", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_N_2[var3].getBytes("ISO-8859-1");
         CONST_O[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_O[var3];
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
         throw new RuntimeException("rip/breeze/client/eb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4644;
      if (CONST_R[var3] == null) {
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
         long var5 = CONST_Q[var3];
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
         Object[] var9 = (Object[])CONST_S.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_S.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/eb", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_R[var3] = var15;
      }

      return CONST_R[var3];
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
         throw new RuntimeException("rip/breeze/client/eb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
