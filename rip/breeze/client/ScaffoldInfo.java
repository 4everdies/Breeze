package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.RenderUtil18_x;
import rip.breeze.StringDecryptor;
import rip.breeze.Util8;

@ModuleInfo(
   a = "ScaffoldInfo",
   b = "Displays how many placeable blocks you have while scaffolding.",
   d = rip.breeze.ModuleCategory.HUD,
   c = {"scaffold", "blocks", "bridge", "hud", "scaffoldblocks"}
)
public class ScaffoldInfo extends BreezeModule implements rip.breeze.IBreezeInterface2 {
   private final GenericSetting<Boolean> backgroundSetting;
   private final GenericSetting<Double> roundingSetting;
   private final GenericSetting<Boolean> dataBuilder54_p;
   private final ModuleManager moduleManager_q;
   private final rip.breeze.RotationUtil8 dataBuilder14_r;
   private final AnimationTimer dataBuilder15_s;
   private final List<ItemStack> list_t;
   private int fieldInt_u;
   private final ImageUtil16 dataBuilder25_v;
   private static final int CONST_W;
   private static final float CONST_X = 0.5F;
   private final ArrayDeque<Float> arrayDeque_y;
   private int fieldInt_z;
   private float fieldFloat_A;
   private float fieldFloat_B;
   private static final String[] CONST_D;
   private static final String[] CONST_E;
   private static final Map CONST_F = new HashMap(13);
   private static final long[] CONST_G;
   private static final Integer[] CONST_H;
   private static final Map CONST_I;

   public ScaffoldInfo() {
      long var1 = 59625542810205L;
      super(false, false);
      short var10002 = 29682;
      long var10003 = 3507806766139425841L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Background");
      var10002 = 32574;
      var10003 = 2752908974501185777L ^ var1;
      this.backgroundSetting = var10001.getDataBuilder50_3("Draw a background behind the component.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 32290;
      var10003 = 589816608496404965L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Rounding");
      var10002 = 28510;
      var10003 = 8786616911857801372L ^ var1;
      this.roundingSetting = var10001.getDataBuilder50_3("Corner rounding of the background.")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 2.0))
         .getDataBuilder50_9(this::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 3200;
      var10003 = 5199231556247173957L ^ var1;
      this.dataBuilder54_p = GenericSetting.<Boolean>getDataBuilder50(this, "Show a live speed graph below the block list.")
         .getDataBuilder50_3("Show a live speed graph below the block list.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      this.moduleManager_q = BreezeClient.getModuleManager();
      this.dataBuilder14_r = new rip.breeze.RotationUtil8(this, rip.breeze.AimYawMode.CENTER, rip.breeze.AimYawMode2.CENTER, 0.0, 40.0);
      this.dataBuilder15_s = new AnimationTimer(300.0F, false, EnumType3.CUBIC_OUT);
      this.list_t = new ArrayList<>();
      this.fieldInt_u = 0;
      this.dataBuilder25_v = new ImageUtil16(0);
      this.arrayDeque_y = new ArrayDeque<>(50);
      this.fieldInt_z = -1;
      this.fieldFloat_A = 0.0F;
      this.fieldFloat_B = 0.0F;
   }

   public rip.breeze.RotationUtil8 getDataBuilder14() {
      return this.dataBuilder14_r;
   }

   private boolean checkCondition() {
      long var1 = 93727696838049L;
      ScaffoldUtils var3 = BreezeContext.moduleBase_a.getModuleByClass(ScaffoldUtils.class);
      BridgeAssist var4 = BreezeContext.moduleBase_a.getModuleByClass(BridgeAssist.class);
      return var3 != null && var3.f() || var4 != null && var4.checkCondition_3();
   }

   private int calculate_11() {
      return 4 * this.moduleManager_q.fieldInt_l;
   }

   private int calculate_2() {
      return 6 * this.moduleManager_q.fieldInt_l;
   }

   private int calculate_3() {
      long var1 = 24483233084414L;
      return (this.dataBuilder54_p.getObject_m() ? 20 : 16) * this.moduleManager_q.fieldInt_l;
   }

   private int calculate_4() {
      long var1 = 137882944692030L;
      return (this.dataBuilder54_p.getObject_m() ? 12 : 10) * this.moduleManager_q.fieldInt_l;
   }

   private int calculate_5() {
      return 6 * this.moduleManager_q.fieldInt_l;
   }

   private int calculate_6() {
      return 2 * this.moduleManager_q.fieldInt_l;
   }

   private int calculate_7() {
      return 20 * this.moduleManager_q.fieldInt_l;
   }

   private int calculate_8() {
      return 4 * this.moduleManager_q.fieldInt_l;
   }

   private int calculate_9() {
      long var1 = 65281367951075L;
      int var3 = this.moduleManager_q.fieldInt_k;
      return this.dataBuilder54_p.getObject_m() ? 2 * var3 + this.calculate_6() : var3;
   }

   private int clamp() {
      return Math.max(this.calculate_3(), this.calculate_9());
   }

   private int clamp_2() {
      long var1 = 83057006561236L;
      int var3 = this.moduleManager_q.dataBuilder46_j.clamp_8("Amount: 100");
      int var4 = this.dataBuilder54_p.getObject_m() ? this.moduleManager_q.dataBuilder46_j.clamp_8("0.00 BPS") : 0;
      return Math.max(var3, var4);
   }

   private int clamp_3() {
      int var1 = Math.max(1, this.list_t.size());
      return (var1 - 1) * this.calculate_4() + this.calculate_3();
   }

   public int calculate_10() {
      return this.calculate_2() + this.clamp_3() + this.calculate_5() + this.clamp_2() + this.calculate_2();
   }

   public int calculate_11() {
      long var1 = 84746312045769L;
      int var3 = this.calculate_11() + this.clamp() + this.calculate_11();
      return this.dataBuilder54_p.getObject_m() ? var3 + this.calculate_8() + this.calculate_7() : var3;
   }

   private boolean checkCondition_2() {
      long var1 = 44690592333519L;
      return BreezeClient.getClickGUI() != null && BreezeClient.getClickGUI().isBool_f();
   }

   public void calculate_12(List<Util8> var1) {
      long var2 = 123025407946278L;
      long var4 = var2 ^ 109653196793617L;
      long var6 = var2 ^ 102503777889241L;
      boolean var8 = this.checkCondition_2();
      this.dataBuilder15_s.toggle(var4, this.checkCondition());
      float var9 = var8 ? 1.0F : (float)this.dataBuilder15_s.getDouble(var6);
      if (this.backgroundSetting.getObject_m() && !(var9 <= 0.001F)) {
         float var10 = this.calculate_10();
         float var11 = this.calculate_11();
         float var12 = this.dataBuilder14_r.clamp_2() + var10 / 2.0F;
         float var13 = this.dataBuilder14_r.clamp_3() + var11 / 2.0F;
         float var14 = (float)(5.0F * this.moduleManager_q.fieldInt_l * this.roundingSetting.getObject_m()) * var9;
         var1.add(new Util8(var12 - var10 * var9 / 2.0F, var13 - var11 * var9 / 2.0F, var10 * var9, var11 * var9, var14));
      }
   }

   public void getHeldItem() {
      long var1 = 83095202467719L;
      long var3 = var1 ^ 133371837500024L;
      int[] var10000 = ModuleList.values();
      boolean var5 = this.checkCondition_2();
      int[] var6 = var10000;
      float var7 = var5 ? 1.0F : (float)this.dataBuilder15_s.getDouble(var3);
      if (var7 <= 0.001F) {
         this.arrayDeque_y.clear();
         this.fieldInt_z = -1;
      } else {
         label150: {
            if (var5) {
               this.list_t.clear();
               this.list_t.add(new ItemStack(Blocks.wool, 64));
               this.list_t.add(new ItemStack(Blocks.sandstone, 41));
               this.list_t.add(new ItemStack(Blocks.planks, 27));
               this.fieldInt_u = 50;
               if (this.arrayDeque_y.size() < 50) {
                  int var8 = this.arrayDeque_y.size();

                  while (var8 < 50) {
                     this.arrayDeque_y.addLast(0.18F + 0.08F * (float)Math.sin(var8 * 0.3));
                     var8++;
                     if (var6 == null) {
                        break;
                     }
                  }
               }

               this.fieldFloat_A = 0.2F;
               this.fieldFloat_B = 0.22F;
               if (var6 != null) {
                  break label150;
               }
            }

            if (BreezeClient.CONST_A.thePlayer == null) {
               return;
            }

            int var43 = BreezeClient.CONST_A.thePlayer.ticksExisted;
            if (var43 != this.fieldInt_z) {
               this.fieldFloat_A = this.fieldFloat_B;
               double var9 = BreezeClient.CONST_A.thePlayer.posX - BreezeClient.CONST_A.thePlayer.lastTickPosX;
               double var11 = BreezeClient.CONST_A.thePlayer.posZ - BreezeClient.CONST_A.thePlayer.lastTickPosZ;
               this.fieldFloat_B = (float)Math.hypot(var9, var11);
               if (this.arrayDeque_y.size() >= 50) {
                  this.arrayDeque_y.pollFirst();
               }

               this.arrayDeque_y.addLast(this.fieldFloat_B);
               this.fieldInt_z = var43;
            }

            this.list_t.clear();
            this.fieldInt_u = 0;
            int var13 = 0;

            while (var13 < 9) {
               ItemStack var14 = BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var13);
               if (var14 != null && var14.getItem() instanceof ItemBlock) {
                  ItemBlock var15 = (ItemBlock)var14.getItem();
                  if (var15.getBlock().getMaterial().isSolid()
                     && !var15.getBlock().getMaterial().isLiquid()
                     && !var15.getBlock().getMaterial().isReplaceable()
                     && !BlockUtil6.CONST_A.contains(var15.getBlock())) {
                     this.fieldInt_u = this.fieldInt_u + var14.stackSize;
                     boolean var16 = false;

                     for (ItemStack var18 : this.list_t) {
                        if (var18.getItem() == var14.getItem()
                           && var18.getItem().getColorFromItemStack(var18, 0) == var14.getItem().getColorFromItemStack(var14, 0)) {
                           var16 = true;
                           if (var6 != null) {
                              break;
                           }
                        }

                        if (var6 == null) {
                           break;
                        }
                     }

                     if (!var16) {
                        this.list_t.add(var14);
                     }
                  }
               }

               var13++;
               if (var6 == null) {
                  break;
               }
            }
         }

         float var44 = this.dataBuilder14_r.clamp_2() + this.calculate_10() / 2.0F;
         float var45 = this.dataBuilder14_r.clamp_3() + this.calculate_11() / 2.0F;
         this.moduleManager_q.initialize_3();
         GL11.glTranslatef(var44, var45, 0.0F);
         GL11.glScalef(var7, var7, 1.0F);
         GL11.glTranslatef(-var44, -var45, 0.0F);
         int var46 = this.clamp();
         int var47 = this.calculate_3();
         int var48 = this.moduleManager_q.fieldInt_k;
         int var49 = this.dataBuilder14_r.clamp_3() + this.calculate_11();
         int var50 = var49 + (var46 - var47) / 2;
         int var19 = this.dataBuilder14_r.clamp_2() + this.calculate_2();
         int var20 = var19;
         int var21 = 0;

         while (var21 < this.list_t.size()) {
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, 0.0F, var21 * 20 * this.moduleManager_q.fieldInt_l);
            RenderUtil28.calculate_12(this.list_t.get(var21), var20, var50, var47, false);
            GlStateManager.popMatrix();
            var20 += this.calculate_4();
            var21++;
            if (var6 == null) {
               break;
            }
         }

         var21 = var19 + this.clamp_3() + this.calculate_5();
         int var22 = this.calculate_9();
         int var23 = var49 + (var46 - var22) / 2;
         String var24 = RenderUtil18_x.ACCENT + "Amount:" + RenderUtil18_x.RESET;
         this.moduleManager_q.dataBuilder46_j.update(var21, var23, var24, Color.LIGHT_GRAY);
         this.dataBuilder25_v.setInt_b(this.fieldInt_u);
         int var25 = this.moduleManager_q.dataBuilder46_j.clamp_8("Amount: 0")
            - this.moduleManager_q.dataBuilder46_j.clamp_8("0");
         this.dataBuilder25_v.absValue(false, var21 + var25, var23, Color.LIGHT_GRAY, this.moduleManager_q.dataBuilder46_j, 300.0F);
         if (this.dataBuilder54_p.getObject_m()) {
            float var26 = var5 ? 0.0F : MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks;
            float var27 = var5 ? this.fieldFloat_B : this.fieldFloat_A + (this.fieldFloat_B - this.fieldFloat_A) * var26;
            String var28 = RenderUtil18_x.ACCENT
               + String.format("%.2f", this.fieldFloat_B * 20.0F)
               + RenderUtil18_x.RESET
               + " BPS";
            this.moduleManager_q.dataBuilder46_j.update(var21, var23 + var48 + this.calculate_6(), var28, Color.LIGHT_GRAY);
            if (this.arrayDeque_y.size() >= 2) {
               int var29 = this.dataBuilder14_r.clamp_2() + this.calculate_2();
               int var30 = var49 + var46 + this.calculate_8();
               int var31 = this.calculate_10() - 2 * this.calculate_2();
               int var32 = this.calculate_7();
               Float[] var33 = this.arrayDeque_y.toArray(new Float[0]);
               int var34 = var33.length;
               float var35 = (float)var31 / Math.max(1, 49);
               float var36 = var5 ? 0.0F : var26 * var35;
               ArrayList var37 = new ArrayList(var34 + 1);
               int var38 = 0;

               while (var38 < var34) {
                  var37.add(new float[]{var29 + (50 - var34 + var38) * var35 - var36, var33[var38]});
                  var38++;
                  if (var6 == null) {
                     break;
                  }
               }

               var37.add(new float[]{var29 + 50.0F * var35 - var36, var27});
               float var52 = 0.0F;

               for (Float var42 : var33) {
                  var52 += var42;
                  if (var6 == null) {
                     break;
                  }
               }

               Color var53 = getColor(Math.min(1.0F, var52 / var34 / 0.5F));
               Color var54 = new Color(var53.getRed(), var53.getGreen(), var53.getBlue(), 150);
               Color var55 = new Color(var53.getRed(), var53.getGreen(), var53.getBlue(), 40);
               float var56 = var44 + var7 * (var29 - var44);
               RenderUtil28.clamp(var56, 0.0F, var7 * var31, BreezeClient.CONST_A.displayHeight);
               RenderUtil28.clamp_2(var37, -0.05F, 0.5F, var30, var30 + var32, var53, var54, var55, 1.5F * this.moduleManager_q.fieldInt_l);
               RenderUtil28.render_4();
            }
         }

         this.moduleManager_q.initialize_4();
      }
   }

   private static Color getColor(float var0) {
      long var1 = 20698045971180L;
      if (var0 <= 0.5F) {
         float var4 = var0 * 2.0F;
         return new Color((int)(255.0F * var4), 220, 50);
      } else {
         float var3 = (var0 - 0.5F) * 2.0F;
         return new Color(255, (int)(220.0F * (1.0F - var3)), 50);
      }
   }

   private boolean lambda$new_Inner0(rip.breeze.DateUtil var1) {
      return this.backgroundSetting.getObject_m();
   }

   static {
      long var0 = 89179360813903L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[12];
      int var5 = 0;
      String var6 = "n\u008dE9\u00ads\u001c<¼á\u0014â\u009f'\u0095é\u00060\u0096:X\u001f1tû;±CÛiïÇ\u0010\u00ad0\u00895'\u009a\u0091\u0083lÍuo\u0010äoª \u0004\u0010(P8ynw¼ö\u009cÔ\f2KN$Ýü{8ßö\u008c¤%\u009d0\u0011c}\u008f\u0010¡\"\"ä\bø3õ{b~\u0091²\u0003u\r 7ê3ÏQMÅßýjÃ¡»\u000b\u008e9\u0011\u000eÂ³VyG\f9i®Ü=\u000f\u009e\u008a 1¬_ÃG½\u000e\u001e\u0090\u0099.,\u0097»=³Û1»Ô\u0006\u0081þtm ÐÁJ\u009e)©\u0018\u0010Ý\f&\u0004#\u009a¹\u0000\u0091\u0096jÜ\n\u0017£\u009c\u00adóvºRSôHÌgOûV<{KÂ\u0099´ê@6\u0001\u009c\u0011\u007f\u009dâ*%C\u0013\u001fg\u0019ç¾ÙÀ¸{\u0090qJö#=J\u00914Ö:Ù'K\u0015÷¡\u0098Ýµ³¦Pù7:Þã®ß\u00909\u0090~\u0089´\u007f^\u0096Hàíb¶å£\u008a\u0005ì9\u001esJ>,LdV^\u0098\u0013mUÿd\u0084â*´ü\u000fLN5\u008f\u0093\u001fTÉÈåyt5.\f\u0083\u0012\u008fe\u009dÛ°·X\u0091~Ê\u008e\u008e3¥¶f{¼\u000f(üC\u0093Ï f+ub¿¶\u0013°Ï_¸Ë¼\u001dkìO7\f\u001e\u0081\u001f§ÒÖÐ\u008fN_t\u0097\u009e";
      int var7 = "n\u008dE9\u00ads\u001c<¼á\u0014â\u009f'\u0095é\u00060\u0096:X\u001f1tû;±CÛiïÇ\u0010\u00ad0\u00895'\u009a\u0091\u0083lÍuo\u0010äoª \u0004\u0010(P8ynw¼ö\u009cÔ\f2KN$Ýü{8ßö\u008c¤%\u009d0\u0011c}\u008f\u0010¡\"\"ä\bø3õ{b~\u0091²\u0003u\r 7ê3ÏQMÅßýjÃ¡»\u000b\u008e9\u0011\u000eÂ³VyG\f9i®Ü=\u000f\u009e\u008a 1¬_ÃG½\u000e\u001e\u0090\u0099.,\u0097»=³Û1»Ô\u0006\u0081þtm ÐÁJ\u009e)©\u0018\u0010Ý\f&\u0004#\u009a¹\u0000\u0091\u0096jÜ\n\u0017£\u009c\u00adóvºRSôHÌgOûV<{KÂ\u0099´ê@6\u0001\u009c\u0011\u007f\u009dâ*%C\u0013\u001fg\u0019ç¾ÙÀ¸{\u0090qJö#=J\u00914Ö:Ù'K\u0015÷¡\u0098Ýµ³¦Pù7:Þã®ß\u00909\u0090~\u0089´\u007f^\u0096Hàíb¶å£\u008a\u0005ì9\u001esJ>,LdV^\u0098\u0013mUÿd\u0084â*´ü\u000fLN5\u008f\u0093\u001fTÉÈåyt5.\f\u0083\u0012\u008fe\u009dÛ°·X\u0091~Ê\u008e\u008e3¥¶f{¼\u000f(üC\u0093Ï f+ub¿¶\u0013°Ï_¸Ë¼\u001dkìO7\f\u001e\u0081\u001f§ÒÖÐ\u008fN_t\u0097\u009e"
         .length();
      char var8 = ' ';
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var33;
                  if ((var23 += var8) >= var7) {
                     CONST_D = var4;
                     CONST_E = new String[12];
                     CONST_I = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[2];
                     int var14 = 0;
                     String var15 = "ô#èR!\u0085DBb`°OÌöd\u0006";
                     int var16 = "ô#èR!\u0085DBb`°OÌöd\u0006".length();
                     byte var17 = 0;

                     do {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        var10001 = var14++;
                        long var19 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
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
                        long var10004 = (var21[0] & 255L) << 56
                           | (var21[1] & 255L) << 48
                           | (var21[2] & 255L) << 40
                           | (var21[3] & 255L) << 32
                           | (var21[4] & 255L) << 24
                           | (var21[5] & 255L) << 16
                           | (var21[6] & 255L) << 8
                           | var21[7] & 255L;
                        byte var38 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_G = var13;
                     CONST_H = new Integer[2];
                     CONST_W = ((String)null);
                     return;
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var33;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label45;
                  }

                  var6 = ",\u0019\u0087i\u0015\u008a\u001dyEd)\u001d\u0004Gý:\u000bÆitd \u0015ÝÒº\u009e~¡g^ÛåºUÅÇ\"\u0013¯=Ô\u009bÉ\u0097 f#[½\u00ad\u009b\u001aÊ\u0093\u009aO\u008e¡hêmYê \u0000Kû½\u001eD(rK\u000f\u0012¶Ú\u0015,pF\u0096x¼\u008c\u008eyÇ\u0092ÖMàÔ'9³";
                  var7 = ",\u0019\u0087i\u0015\u008a\u001dyEd)\u001d\u0004Gý:\u000bÆitd \u0015ÝÒº\u009e~¡g^ÛåºUÅÇ\"\u0013¯=Ô\u009bÉ\u0097 f#[½\u00ad\u009b\u001aÊ\u0093\u009aO\u008e¡hêmYê \u0000Kû½\u001eD(rK\u000f\u0012¶Ú\u0015,pF\u0096x¼\u008c\u008eyÇ\u0092ÖMàÔ'9³"
                     .length();
                  var8 = '@';
                  var23 = -1;
            }

            var24 = var6.substring(++var23, var23 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19864;
      if (CONST_E[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_F.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_F.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dB", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_D[var3].getBytes("ISO-8859-1");
         CONST_E[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_E[var3];
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
         throw new RuntimeException("rip/breeze/client/dB" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28136;
      if (CONST_H[var3] == null) {
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
         long var5 = CONST_G[var3];
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
         Object[] var9 = (Object[])CONST_I.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_I.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/dB", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_H[var3] = var15;
      }

      return CONST_H[var3];
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
         throw new RuntimeException("rip/breeze/client/dB" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
