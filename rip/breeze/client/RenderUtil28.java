package rip.breeze.client;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.BufferUtils;
import org.lwjgl.nanovg.NSVGImage;
import org.lwjgl.nanovg.NanoSVG;
import org.lwjgl.opengl.GL11;
import rip.breeze.ColorMode2;
import rip.breeze.KeybindSettings;
import rip.breeze.StringDecryptor;

public final class RenderUtil28 {
   private static FontManager fontManager_a;
   private static FontManager fontManager_b;
   private static FontManager fontManager_c;
   private static FontManager fontManager_d;
   private static FontManager fontManager_e;
   private static final FloatBuffer CONST_F;
   private static final ConcurrentHashMap<String, Integer> CONST_G;
   private static final ConcurrentHashMap<String, Util50> CONST_H;
   private static final ConcurrentHashMap<String, Util50> CONST_I;
   private static final ConcurrentHashMap<String, RenderUtil30> CONST_J;
   private static final ConcurrentHashMap<String, RenderUtil30> CONST_K;
   private static final ExecutorService CONST_L;
   private static final String[] CONST_N;
   private static final String[] CONST_O;
   private static final Map CONST_P = new HashMap(13);
   private static final long[] CONST_Q;
   private static final Integer[] CONST_R;
   private static final Map CONST_S;

   private RenderUtil28() {
   }

   private static void processNullable() {
      long var0 = 116043472682879L;
      if (fontManager_a == null) {
         fontManager_a = new FontManager("hud/rounded_rect.fsh", "hud/shape.vsh");
      }

      if (fontManager_b == null) {
         fontManager_b = new FontManager("hud/circle.fsh", "hud/shape.vsh");
      }

      if (fontManager_c == null) {
         fontManager_c = new FontManager("hud/texture.fsh", "hud/texture.vsh");
      }

      if (fontManager_d == null) {
         fontManager_d = new FontManager("hud/texture_rounded.fsh", "hud/texture.vsh");
      }

      if (fontManager_e == null) {
         fontManager_e = new FontManager("hud/texture_effect.fsh", "hud/texture.vsh");
      }
   }

   public static void render(float var0, float var1, float var2, float var3, float var4, Color var5) {
      render_1(var0, var1, var2, var3, var4, var4, var4, var4, var5);
   }

   public static void render_1(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, Color var8) {
      long var9 = 64361109607985L;
      processNullable();
      GL11.glPushAttrib(24576);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      fontManager_a.initialize();
      update(fontManager_a, var0, var1, var2, var3, var4, var5, var6, var7);
      fontManager_a.drawString("effectMode", 0);
      calculate_16(fontManager_a, var8);
      calculate_18(var0, var1, var2, var3);
      fontManager_a.bind();
      GL11.glPopAttrib();
   }

   public static void calculate(float var0, float var1, float var2, float var3, float var4, Color var5, Color var6, boolean var7) {
      long var8 = 60774908647670L;
      processNullable();
      GL11.glPushAttrib(24576);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      fontManager_a.initialize();
      update(fontManager_a, var0, var1, var2, var3, var4, var4, var4, var4);
      fontManager_a.drawString("effectMode", 4);
      fontManager_a.drawString("staticColor", 0.0F, 0.0F, 0.0F, var5.getAlpha() / 255.0F);
      fontManager_a.drawString("gradColor1", var5.getRed() / 255.0F, var5.getGreen() / 255.0F, var5.getBlue() / 255.0F);
      fontManager_a.drawString("gradColor2", var6.getRed() / 255.0F, var6.getGreen() / 255.0F, var6.getBlue() / 255.0F);
      fontManager_a.drawString("gradVertical", var7 ? 1 : 0);
      calculate_18(var0, var1, var2, var3);
      fontManager_a.bind();
      GL11.glPopAttrib();
   }

   public static void calculate_2(float var0, float var1, float var2, float var3, float var4, Color var5, Color var6, Color var7, Color var8) {
      long var9 = 42619510856841L;
      processNullable();
      GL11.glPushAttrib(24576);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      fontManager_a.initialize();
      update(fontManager_a, var0, var1, var2, var3, var4, var4, var4, var4);
      fontManager_a.drawString("effectMode", 5);
      fontManager_a.drawString("staticColor", 0.0F, 0.0F, 0.0F, 1.0F);
      fontManager_a.drawString("gradColorTL", var5.getRed() / 255.0F, var5.getGreen() / 255.0F, var5.getBlue() / 255.0F);
      fontManager_a.drawString("gradColorTR", var6.getRed() / 255.0F, var6.getGreen() / 255.0F, var6.getBlue() / 255.0F);
      fontManager_a.drawString("gradColorBR", var7.getRed() / 255.0F, var7.getGreen() / 255.0F, var7.getBlue() / 255.0F);
      fontManager_a.drawString("gradColorBL", var8.getRed() / 255.0F, var8.getGreen() / 255.0F, var8.getBlue() / 255.0F);
      calculate_18(var0, var1, var2, var3);
      fontManager_a.bind();
      GL11.glPopAttrib();
   }

   public static void calculate_3(float var0, float var1, float var2, float var3, float var4, Color var5, float var6, Color var7) {
      long var8 = 107588521397545L;
      processNullable();
      GL11.glPushAttrib(24576);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      fontManager_a.initialize();
      update(fontManager_a, var0, var1, var2, var3, var4, var4, var4, var4);
      fontManager_a.drawString("effectMode", 0);
      calculate_16(fontManager_a, var5);
      fontManager_a.drawString("glowRadius", var6);
      fontManager_a.drawString(
         "glowColor",
         var7.getRed() / 255.0F,
         var7.getGreen() / 255.0F,
         var7.getBlue() / 255.0F,
         var7.getAlpha() / 255.0F
      );
      calculate_19(var0, var1, var2, var3, var6 * 4.0F);
      fontManager_a.bind();
      GL11.glPopAttrib();
   }

   public static void render_2(float var0, float var1, float var2, float var3, float var4, float var5) {
      render_3(var0, var1, var2, var3, var4, var4, var4, var4, var5);
   }

   public static void render_3(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      processNullable();
      GL11.glPushAttrib(24576);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      fontManager_a.initialize();
      update(fontManager_a, var0, var1, var2, var3, var4, var5, var6, var7);
      calculate_17(fontManager_a, var8);
      calculate_18(var0, var1, var2, var3);
      fontManager_a.bind();
      GL11.glPopAttrib();
   }

   public static void calculate_4(float var0, float var1, float var2, Color var3) {
      long var4 = 12446550504761L;
      processNullable();
      GL11.glPushAttrib(24576);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      fontManager_b.initialize();
      update_1(fontManager_b, var0, var1, var2, 0.0F);
      fontManager_b.drawString("effectMode", 0);
      calculate_16(fontManager_b, var3);
      calculate_18(var0 - var2 - 2.0F, var1 - var2 - 2.0F, (var2 + 2.0F) * 2.0F, (var2 + 2.0F) * 2.0F);
      fontManager_b.bind();
      GL11.glPopAttrib();
   }

   public static void calculate_5(float var0, float var1, float var2, float var3, Color var4) {
      long var5 = 124926506427997L;
      processNullable();
      GL11.glPushAttrib(24576);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      fontManager_b.initialize();
      update_1(fontManager_b, var0, var1, var2, var3);
      fontManager_b.drawString("effectMode", 0);
      calculate_16(fontManager_b, var4);
      float var7 = var2 + var3 * 0.5F + 2.0F;
      calculate_18(var0 - var7, var1 - var7, var7 * 2.0F, var7 * 2.0F);
      fontManager_b.bind();
      GL11.glPopAttrib();
   }

   public static void calculate_6(float var0, float var1, float var2, float var3) {
      processNullable();
      GL11.glPushAttrib(24576);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      fontManager_b.initialize();
      update_1(fontManager_b, var0, var1, var2, 0.0F);
      calculate_17(fontManager_b, var3);
      calculate_18(var0 - var2 - 2.0F, var1 - var2 - 2.0F, (var2 + 2.0F) * 2.0F, (var2 + 2.0F) * 2.0F);
      fontManager_b.bind();
      GL11.glPopAttrib();
   }

   public static void clamp(float var0, float var1, float var2, float var3) {
      GL11.glEnable(3089);
      int var4 = Math.max(0, (int)var0);
      int var5 = Math.max(0, BreezeClient.CONST_A.displayHeight - (int)Math.ceil(var1 + var3));
      int var6 = Math.max(0, (int)Math.ceil(var2));
      int var7 = Math.max(0, (int)Math.ceil(var3));
      GL11.glScissor(var4, var5, var6, var7);
   }

   public static void render_4() {
      GL11.glDisable(3089);
   }

   public static void calculate_7(List<float[]> var0, Color var1, float var2) {
      if (var0.size() >= 2) {
         GL11.glPushAttrib(24580);
         GL11.glEnable(3042);
         GL11.glDisable(3553);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(2848);
         GL11.glHint(3154, 4354);
         GL11.glLineWidth(var2);
         GL11.glColor4f(var1.getRed() / 255.0F, var1.getGreen() / 255.0F, var1.getBlue() / 255.0F, var1.getAlpha() / 255.0F);
         GL11.glBegin(3);

         for (float[] var4 : var0) {
            GL11.glVertex2f(var4[0], var4[1]);
         }

         GL11.glEnd();
         GL11.glPopAttrib();
      }
   }

   public static void calculate_8(List<float[]> var0, Color var1, float var2) {
      if (var0.size() >= 2) {
         GL11.glPushAttrib(24580);
         GL11.glEnable(3042);
         GL11.glDisable(3553);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(2848);
         GL11.glHint(3154, 4354);
         GL11.glLineWidth(var2);
         GL11.glColor4f(var1.getRed() / 255.0F, var1.getGreen() / 255.0F, var1.getBlue() / 255.0F, var1.getAlpha() / 255.0F);
         GL11.glBegin(1);

         for (float[] var4 : var0) {
            GL11.glVertex2f(var4[0], var4[1]);
         }

         GL11.glEnd();
         GL11.glPopAttrib();
      }
   }

   public static void clamp_2(List<float[]> var0, float var1, float var2, float var3, float var4, Color var5, Color var6, Color var7, float var8) {
      if (var0.size() >= 2) {
         GL11.glPushAttrib(24580);
         GL11.glEnable(3042);
         GL11.glDisable(3553);
         GL11.glBlendFunc(770, 771);
         float var9 = var6.getRed() / 255.0F;
         float var10 = var6.getGreen() / 255.0F;
         float var11 = var6.getBlue() / 255.0F;
         float var12 = var6.getAlpha() / 255.0F;
         float var13 = var7.getRed() / 255.0F;
         float var14 = var7.getGreen() / 255.0F;
         float var15 = var7.getBlue() / 255.0F;
         float var16 = var7.getAlpha() / 255.0F;
         float var17 = var2 - var1;
         float var18 = var4 - var3;
         GL11.glShadeModel(7425);
         GL11.glBegin(7);

         for (int var19 = 0; var19 < var0.size() - 1; var19++) {
            float var20 = ((float[])var0.get(var19))[0];
            float var21 = ((float[])var0.get(var19))[1];
            float var22 = ((float[])var0.get(var19 + 1))[0];
            float var23 = ((float[])var0.get(var19 + 1))[1];
            float var24 = var17 > 0.0F ? Math.min(1.0F, Math.max(0.0F, (var21 - var1) / var17)) : 1.0F;
            float var25 = var17 > 0.0F ? Math.min(1.0F, Math.max(0.0F, (var23 - var1) / var17)) : 1.0F;
            float var26 = var4 - var24 * var18;
            float var27 = var4 - var25 * var18;
            float var28 = var24;
            float var29 = var25;
            GL11.glColor4f(var13, var14, var15, var16);
            GL11.glVertex2f(var20, var4);
            GL11.glColor4f(var13, var14, var15, var16);
            GL11.glVertex2f(var22, var4);
            GL11.glColor4f(
               var9 * var29 + var13 * (1.0F - var29),
               var10 * var29 + var14 * (1.0F - var29),
               var11 * var29 + var15 * (1.0F - var29),
               var12 * var29 + var16 * (1.0F - var29)
            );
            GL11.glVertex2f(var22, var27);
            GL11.glColor4f(
               var9 * var28 + var13 * (1.0F - var28),
               var10 * var28 + var14 * (1.0F - var28),
               var11 * var28 + var15 * (1.0F - var28),
               var12 * var28 + var16 * (1.0F - var28)
            );
            GL11.glVertex2f(var20, var26);
         }

         GL11.glEnd();
         GL11.glEnable(2848);
         GL11.glHint(3154, 4354);
         GL11.glLineWidth(var8);
         GL11.glColor4f(var5.getRed() / 255.0F, var5.getGreen() / 255.0F, var5.getBlue() / 255.0F, var5.getAlpha() / 255.0F);
         GL11.glBegin(3);

         for (int var30 = 0; var30 < var0.size(); var30++) {
            float var31 = ((float[])var0.get(var30))[1];
            float var32 = var17 > 0.0F ? Math.min(1.0F, Math.max(0.0F, (var31 - var1) / var17)) : 1.0F;
            GL11.glVertex2f(((float[])var0.get(var30))[0], var4 - var32 * var18);
         }

         GL11.glEnd();
         GL11.glPopAttrib();
      }
   }

   public static void initialize(RenderUtil30 var0, float var1, float var2, float var3, float var4, Color var5) {
      calculate_9(var0.fieldInt_a, var1, var2, var3, var4, var5);
   }

   public static void calculate_9(int var0, float var1, float var2, float var3, float var4, Color var5) {
      long var6 = 133081183917633L;
      processNullable();
      GL11.glPushAttrib(24576);
      GL11.glEnable(3042);
      GL11.glEnable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glBindTexture(3553, var0);
      fontManager_c.initialize();
      fontManager_c.drawString("tex", 0);
      fontManager_c.drawString(
         "tintColor",
         var5.getRed() / 255.0F,
         var5.getGreen() / 255.0F,
         var5.getBlue() / 255.0F,
         var5.getAlpha() / 255.0F
      );
      fontManager_c.drawString("gradientMode", 0);
      calculate_20(var1, var2, var3, var4);
      fontManager_c.bind();
      GlStateManager.bindTexture(0);
      GL11.glPopAttrib();
   }

   public static void processNullable_2(String var0, float var1, float var2, float var3, float var4, Color var5) {
      Integer var6 = clamp_3(var0);
      if (var6 != null) {
         calculate_9(var6, var1, var2, var3, var4, var5);
      }
   }

   public static void initialize_2(String var0, float var1, float var2, float var3, float var4) {
      processNullable_2(var0, var1, var2, var3, var4, Color.WHITE);
   }

   public static void initialize_3(NetworkPlayerInfo var0, float var1, float var2, float var3) {
      calculate_10(var0, var1, var2, var3, 0.0F, Color.WHITE);
   }

   public static void render_5(NetworkPlayerInfo var0, float var1, float var2, float var3, Color var4) {
      calculate_10(var0, var1, var2, var3, 0.0F, var4);
   }

   public static void initialize_4(NetworkPlayerInfo var0, float var1, float var2, float var3, float var4) {
      calculate_10(var0, var1, var2, var3, var4, Color.WHITE);
   }

   public static void calculate_10(NetworkPlayerInfo var0, float var1, float var2, float var3, float var4, Color var5) {
      long var6 = 10574003455642L;
      processNullable();
      ResourceLocation var8 = var0.getLocationSkin();
      boolean var9 = GL11.glIsEnabled(3553);
      GL11.glEnable(3042);
      GL11.glEnable(3553);
      GL11.glBlendFunc(770, 771);
      BreezeClient.CONST_A.getTextureManager().bindTexture(var8);
      fontManager_d.initialize();
      fontManager_d.drawString("tex", 0);
      fontManager_d.drawString(
         "tintColor",
         var5.getRed() / 255.0F,
         var5.getGreen() / 255.0F,
         var5.getBlue() / 255.0F,
         var5.getAlpha() / 255.0F
      );
      fontManager_d.drawString("resolution", BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight);
      fontManager_d.drawString("position", var1, var2);
      fontManager_d.drawString("size", var3, var3);
      fontManager_d.drawString("radii", var4, var4, var4, var4);
      float var10 = 0.015625F;
      calculate_15(var1, var2, var3, 8.0F * var10, 8.0F * var10, 16.0F * var10, 16.0F * var10);
      calculate_15(var1, var2, var3, 40.0F * var10, 8.0F * var10, 48.0F * var10, 16.0F * var10);
      fontManager_d.bind();
      GlStateManager.bindTexture(0);
      if (!var9) {
         GL11.glDisable(3553);
      }
   }

   public static void processNullable_3(String var0, float var1, float var2, float var3, float var4, Color var5, Color var6, boolean var7) {
      Integer var8 = clamp_3(var0);
      if (var8 != null) {
         calculate_11(RenderUtil30.getDataBuilder43(var8, (int)var3, (int)var4), var1, var2, var3, var4, var5, var6, var7);
      }
   }

   public static void calculate_11(RenderUtil30 var0, float var1, float var2, float var3, float var4, Color var5, Color var6, boolean var7) {
      long var8 = 18946268870655L;
      processNullable();
      GL11.glPushAttrib(24576);
      GL11.glEnable(3042);
      GL11.glEnable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glBindTexture(3553, var0.fieldInt_a);
      fontManager_c.initialize();
      fontManager_c.drawString("tex", 0);
      fontManager_c.drawString("tintColor", 1.0F, 1.0F, 1.0F, 1.0F);
      fontManager_c.drawString("gradientMode", 1);
      fontManager_c.drawString("gradColor1", var5.getRed() / 255.0F, var5.getGreen() / 255.0F, var5.getBlue() / 255.0F);
      fontManager_c.drawString("gradColo", var6.getRed() / 255.0F, var6.getGreen() / 255.0F, var6.getBlue() / 255.0F);
      fontManager_c.drawString("vertical", var7 ? 1 : 0);
      calculate_20(var1, var2, var3, var4);
      fontManager_c.bind();
      GlStateManager.bindTexture(0);
      GL11.glPopAttrib();
   }

   public static void render_6(ItemStack var0, float var1, float var2, float var3) {
      calculate_12(var0, var1, var2, var3, true);
   }

   public static void calculate_12(ItemStack var0, float var1, float var2, float var3, boolean var4) {
      if (var0 != null) {
         RenderItem var5 = BreezeClient.CONST_A.getRenderItem();
         float var6 = var3 / 16.0F;
         GlStateManager.pushMatrix();
         GlStateManager.translate(var1, var2, 0.0F);
         GlStateManager.scale(var6, var6, 1.0F);
         RenderHelper.enableGUIStandardItemLighting();
         OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
         GlStateManager.enableRescaleNormal();
         GlStateManager.enableDepth();
         float var7 = var5.zLevel;
         var5.zLevel = 0.0F;
         var5.renderItemAndEffectIntoGUI(var0, 0, 0);
         if (var4) {
            var5.renderItemOverlayIntoGUI(BreezeClient.CONST_A.fontRendererObj, var0, 0, 0, null);
         }

         var5.zLevel = var7;
         GlStateManager.enableDepth();
         GlStateManager.enableAlpha();
         GlStateManager.enableBlend();
         GlStateManager.enableLighting();
         GlStateManager.disableRescaleNormal();
         RenderHelper.disableStandardItemLighting();
         GlStateManager.popMatrix();
      }
   }

   public static void processNullable_4(String var0, float var1, float var2, float var3, Color var4) {
      RenderUtil30 var5 = clamp_4(var0, var3);
      if (var5 != null) {
         calculate_9(var5.fieldInt_a, var1, var2, var5.fieldInt_b, var5.fieldInt_c, var4);
      }
   }

   public static void processNullable_5(String var0, float var1, float var2, float var3, Color var4, int var5) {
      RenderUtil30 var6 = clamp_4(var0, var3);
      if (var6 != null) {
         calculate_13(var0, var1, var2, var6.fieldInt_b, var6.fieldInt_c, var3, var4, var4, var5);
      }
   }

   public static void calculate_13(String var0, float var1, float var2, float var3, float var4, float var5, Color var6, Color var7, int var8) {
      RenderUtil30 var9 = clamp_4(var0, var5);
      if (var9 != null) {
         if (var8 > 0) {
            RenderUtil30 var10 = getDataBuilder43(var0, var5, var8);
            if (var10 != null) {
               float var11 = var3 * var10.fieldInt_b / var9.fieldInt_b;
               float var12 = var4 * var10.fieldInt_c / var9.fieldInt_c;
               calculate_9(var10.fieldInt_a, var1 - (var11 - var3) * 0.5F, var2 - (var12 - var4) * 0.5F, var11, var12, var7);
            }
         }

         calculate_9(var9.fieldInt_a, var1, var2, var3, var4, var6);
      }
   }

   public static void processNullable_6(String var0, float var1, float var2, float var3, float var4) {
      long var5 = 110026420175968L;
      RenderUtil30 var7 = clamp_4(var0, var3);
      if (var7 != null) {
         processNullable();
         GL11.glPushAttrib(24576);
         GL11.glEnable(3042);
         GL11.glEnable(3553);
         GL11.glBlendFunc(770, 771);
         GL11.glBindTexture(3553, var7.fieldInt_a);
         fontManager_e.initialize();
         fontManager_e.drawString("tex", 0);
         fontManager_e.drawString("position", var1, var2);
         fontManager_e.drawString("size", var7.fieldInt_b, var7.fieldInt_c);
         calculate_17(fontManager_e, var4);
         calculate_20(var1, var2, var7.fieldInt_b, var7.fieldInt_c);
         fontManager_e.bind();
         GlStateManager.bindTexture(0);
         GL11.glPopAttrib();
      }
   }

   public static void calculate_14(String var0, float var1, float var2, float var3, float var4, int var5) {
      long var6 = 22472653082252L;
      RenderUtil30 var8 = clamp_4(var0, var3);
      if (var8 != null) {
         processNullable();
         GL11.glPushAttrib(24576);
         GL11.glEnable(3042);
         GL11.glEnable(3553);
         GL11.glBlendFunc(770, 771);
         fontManager_e.initialize();
         fontManager_e.drawString("tex", 0);
         calculate_17(fontManager_e, var4);
         RenderUtil30 var9 = var5 > 0 ? getDataBuilder43(var0, var3, var5) : null;
         if (var9 != null) {
            float var10 = (var9.fieldInt_b - var8.fieldInt_b) * 0.5F;
            GL11.glBindTexture(3553, var9.fieldInt_a);
            fontManager_e.drawString("position", var1 - var10, var2 - var10);
            fontManager_e.drawString("size", var9.fieldInt_b, var9.fieldInt_c);
            calculate_20(var1 - var10, var2 - var10, var9.fieldInt_b, var9.fieldInt_c);
         }

         GL11.glBindTexture(3553, var8.fieldInt_a);
         fontManager_e.drawString("position", var1, var2);
         fontManager_e.drawString("size", var8.fieldInt_b, var8.fieldInt_c);
         calculate_20(var1, var2, var8.fieldInt_b, var8.fieldInt_c);
         fontManager_e.bind();
         GlStateManager.bindTexture(0);
         GL11.glPopAttrib();
      }
   }

   private static Integer clamp_3(String var0) {
      long var1 = 24188179811954L;
      Integer var3 = CONST_G.get(var0);

      try {
         if (var3 != null) {
            return var3;
         }
      } catch (IOException var16) {
         throw getIOException(var16);
      }

      label86: {
         try {
            if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               break label86;
            }
         } catch (IOException var20) {
            throw getIOException(var20);
         }

         Util50 var4 = CONST_H.computeIfAbsent(var0, RenderUtil28::lambda$resolveTexture_Inner2);

         try {
            if (var4.enum_PENDING_a != EnumType26.READY || var4.arr_b == null) {
               return null;
            }
         } catch (IOException var19) {
            throw getIOException(var19);
         }

         try {
            BufferedImage var5 = ImageIO.read(new ByteArrayInputStream(var4.arr_b));
            if (var5 != null) {
               RenderUtil30 var6 = RenderUtil30.getDataBuilder43_2(var5);
               CONST_G.put(var0, var6.fieldInt_a);
               return var6.fieldInt_a;
            }
         } catch (IOException var15) {
            var15.printStackTrace();
         }

         return null;
      }

      if (var0.endsWith(".svg")) {
         try {
            ByteBuffer var22 = RenderUtil32.getByteBuffer_2(var0, 8192);
            byte[] var23 = new byte[var22.remaining()];
            var22.get(var23);
            String var24 = new String(var23, StandardCharsets.UTF_8);
            NSVGImage var7 = NanoSVG.nsvgParse(var24, "px", 96.0F);

            try {
               if (var7 == null) {
                  throw new IOException("nsvgParse returned null for: " + var0);
               }
            } catch (IOException var17) {
               throw getIOException(var17);
            }

            int var8 = Math.max(1, Math.round(var7.width()));
            int var9 = Math.max(1, Math.round(var7.height()));
            long var10 = NanoSVG.nsvgCreateRasterizer();
            ByteBuffer var12 = BufferUtils.createByteBuffer(var8 * var9 * 4);
            NanoSVG.nsvgRasterize(var10, var7, 0.0F, 0.0F, 1.0F, var12, var8, var9, var8 * 4);
            NanoSVG.nsvgDeleteRasterizer(var10);
            NanoSVG.nsvgDelete(var7);
            int var13 = getValue(var8, var9, var12);
            CONST_G.put(var0, var13);
            return var13;
         } catch (IOException var18) {
            var18.printStackTrace();
            return null;
         }
      } else {
         RenderUtil30 var21 = RenderUtil30.getDataBuilder43_3(var0);

         try {
            if (var21 != null) {
               CONST_G.put(var0, var21.fieldInt_a);
               return var21.fieldInt_a;
            } else {
               return null;
            }
         } catch (IOException var14) {
            throw getIOException(var14);
         }
      }
   }

   private static void calculate_15(float var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      GL11.glBegin(7);
      GL11.glTexCoord2f(var3, var4);
      GL11.glVertex2f(var0, var1);
      GL11.glTexCoord2f(var3, var6);
      GL11.glVertex2f(var0, var1 + var2);
      GL11.glTexCoord2f(var5, var6);
      GL11.glVertex2f(var0 + var2, var1 + var2);
      GL11.glTexCoord2f(var5, var4);
      GL11.glVertex2f(var0 + var2, var1);
      GL11.glEnd();
   }

   private static RenderUtil30 clamp_4(String var0, float var1) {
      long var2 = 113598637871602L;
      String var4 = var0 + "@" + Math.round(var1 * 100.0F);
      RenderUtil30 var5 = CONST_J.get(var4);

      try {
         if (var5 != null) {
            return var5;
         }
      } catch (IOException var15) {
         throw getIOException(var15);
      }

      try {
         byte[] var6 = encodeString(var0);
         if (var6 == null) {
            return null;
         }

         String var7 = new String(var6, StandardCharsets.UTF_8);
         NSVGImage var8 = NanoSVG.nsvgParse(var7, "px", 96.0F);

         try {
            if (var8 == null) {
               throw new IOException("nsvgParse failed for: " + var0);
            }
         } catch (IOException var16) {
            throw getIOException(var16);
         }

         int var9 = Math.max(1, Math.round(var8.width() * var1));
         int var10 = Math.max(1, Math.round(var8.height() * var1));
         long var11 = NanoSVG.nsvgCreateRasterizer();
         ByteBuffer var13 = BufferUtils.createByteBuffer(var9 * var10 * 4);
         NanoSVG.nsvgRasterize(var11, var8, 0.0F, 0.0F, var1, var13, var9, var10, var9 * 4);
         NanoSVG.nsvgDeleteRasterizer(var11);
         NanoSVG.nsvgDelete(var8);
         RenderUtil30 var14 = RenderUtil30.getDataBuilder43(getValue(var9, var10, var13), var9, var10);
         CONST_J.put(var4, var14);
         return var14;
      } catch (IOException var17) {
         var17.printStackTrace();
         return null;
      }
   }

   private static RenderUtil30 getDataBuilder43(String var0, float var1, int var2) {
      long var3 = 85432299615043L;
      String var5 = var0 + "@" + Math.round(var1 * 100.0F) + "@s" + var2;
      RenderUtil30 var6 = CONST_K.get(var5);

      try {
         if (var6 != null) {
            return var6;
         }
      } catch (IOException var10) {
         throw getIOException(var10);
      }

      try {
         byte[] var7 = encodeString(var0);
         if (var7 == null) {
            return null;
         }

         RenderUtil30 var8 = RenderUtil30.clamp_2(var7, var0, var1, var2);
         CONST_K.put(var5, var8);
         return var8;
      } catch (IOException var9) {
         var9.printStackTrace();
         return null;
      }
   }

   private static byte[] encodeString(String param0) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/RenderUtil28.119092301742510L J
      // 03: ldc2_w 13020548348207
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: sipush 28398
      // 0c: ldc2_w 8852356065421330379
      // 0f: lload 1
      // 10: lxor
      // 11: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/client/RenderUtil28.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 19: ifne 37
      // 1c: aload 0
      // 1d: sipush 16360
      // 20: ldc2_w 1899302211938703062
      // 23: lload 1
      // 24: lxor
      // 25: invokedynamic w (IJ)Ljava/lang/String; bsm=rip/breeze/client/RenderUtil28.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2d: ifeq 5f
      // 30: goto 37
      // 33: invokestatic rip/breeze/client/RenderUtil28.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 36: athrow
      // 37: aload 0
      // 38: invokestatic rip/breeze/client/RenderUtil28.getClientUtil119 (Ljava/lang/String;)Lrip/breeze/client/Util50;
      // 3b: astore 3
      // 3c: aload 3
      // 3d: getfield rip/breeze/client/Util50.enum_PENDING_a Lrip/breeze/client/EnumType26;
      // 40: getstatic rip/breeze/client/EnumType26.READY Lrip/breeze/client/EnumType26;
      // 43: if_acmpne 54
      // 46: aload 3
      // 47: getfield rip/breeze/client/Util50.arr_b [B
      // 4a: ifnonnull 5a
      // 4d: goto 54
      // 50: invokestatic rip/breeze/client/RenderUtil28.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 53: athrow
      // 54: aconst_null
      // 55: areturn
      // 56: invokestatic rip/breeze/client/RenderUtil28.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 59: athrow
      // 5a: aload 3
      // 5b: getfield rip/breeze/client/Util50.arr_b [B
      // 5e: areturn
      // 5f: aload 0
      // 60: sipush 8192
      // 63: invokestatic rip/breeze/client/RenderUtil32.getByteBuffer_2 (Ljava/lang/String;I)Ljava/nio/ByteBuffer;
      // 66: astore 3
      // 67: aload 3
      // 68: invokevirtual java/nio/ByteBuffer.remaining ()I
      // 6b: newarray 8
      // 6d: astore 4
      // 6f: aload 3
      // 70: aload 4
      // 72: invokevirtual java/nio/ByteBuffer.get ([B)Ljava/nio/ByteBuffer;
      // 75: pop
      // 76: aload 4
      // 78: areturn
      // try (4 -> 20): 21 java/io/IOException
      // try (26 -> 33): 34 java/io/IOException
      // try (30 -> 38): 38 java/io/IOException
   }

   private static Util50 getClientUtil119(String var0) {
      return CONST_I.computeIfAbsent(var0, RenderUtil28::lambda$fetchUrlBytes_Inner4);
   }

   private static int getValue(int var0, int var1, ByteBuffer var2) {
      long var3 = 138837964131880L;
      int var5 = GL11.glGenTextures();
      GL11.glBindTexture(3553, var5);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 33071);
      GL11.glTexParameteri(3553, 10243, -742550354);
      GL11.glTexImage2D(3553, 0, 6408, var0, var1, 0, 6408, 5121, var2);
      GlStateManager.bindTexture(0);
      return var5;
   }

   private static void update(FontManager var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      long var9 = 1512981051120L;
      var0.drawString("resolution", BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight);
      var0.drawString("position", var1, var2);
      var0.drawString("size", var3, var4);
      var0.drawString("radii", var5, var6, var7, var8);
      var0.drawString("glowRadius", 0.0F);
      var0.drawString("glowColor", 0.0F, 0.0F, 0.0F, 0.0F);
   }

   private static void update_1(FontManager var0, float var1, float var2, float var3, float var4) {
      long var5 = 117947128640307L;
      var0.drawString("resolution", BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight);
      var0.drawString("center", var1, var2);
      var0.drawString("radius", var3);
      var0.drawString("thickness", var4);
   }

   private static void calculate_16(FontManager var0, Color var1) {
      long var2 = 6819048829310L;
      var0.drawString(
         "staticColor",
         var1.getRed() / 255.0F,
         var1.getGreen() / 255.0F,
         var1.getBlue() / 255.0F,
         var1.getAlpha() / 255.0F
      );
   }

   private static void calculate_17(FontManager var0, float var1) {
      long var2 = 122336109984719L;
      KeybindSettings var4 = BreezeClient.getKeybindSettings();
      ColorMode2 var5 = var4.getColorMode2();
      float var6 = var4.getFloat_4();
      float var7 = (float)(System.nanoTime() - 230770742347L) * 1.0E-10F * var6;
      switch (Util126.CONST_A[var5.ordinal()]) {
         case 1:
            var0.drawString("effectMode", 2);
            var0.drawString("time", var7);
            var0.drawString("effectSize", var4.getValue());
            var0.drawString("saturation", var4.getFloat());
            var0.drawString("brightness", var4.getFloat_2());
            var0.drawString("staticColor", 1.0F, 1.0F, 1.0F, var1);
            break;
         case 2:
            var0.drawString("effectMode", 1);
            var0.drawString("time", var7);
            var0.drawString("effectSize", var4.getValue_2());
            Color[] var11 = var4.clamp();

            for (int var12 = 0; var12 < var11.length; var12++) {
               var0.drawString(
                  "colors[" + var12 + "]",
                  var11[var12].getRed() / 255.0F,
                  var11[var12].getGreen() / 255.0F,
                  var11[var12].getBlue() / 255.0F
               );
            }

            var0.drawString("colorCount", var11.length);
            var0.drawString("staticColor", 1.0F, 1.0F, 1.0F, var1);
            break;
         case 3:
            var0.drawString("effectMode", 3);
            var0.drawString("time", var7);
            var0.drawString("effectSize", var4.getValue_3());
            float var10 = var4.getFloat_3();
            var0.drawString("��0msI", 1.0F - var10);
            var0.drawString("maxMul", 1.0F + var10);
            Color var9 = var4.getColor();
            var0.drawString("baseColor", var9.getRed() / 255.0F, var9.getGreen() / 255.0F, var9.getBlue() / 255.0F);
            var0.drawString("staticColor", 1.0F, 1.0F, 1.0F, var1);
            break;
         default:
            var0.drawString("effectMode", 0);
            Color var8 = var4.getColor();
            var0.drawString(
               "staticColor", var8.getRed() / 255.0F, var8.getGreen() / 255.0F, var8.getBlue() / 255.0F, var1
            );
      }
   }

   private static void calculate_18(float var0, float var1, float var2, float var3) {
      GL11.glBegin(7);
      GL11.glVertex2f(var0, var1);
      GL11.glVertex2f(var0, var1 + var3);
      GL11.glVertex2f(var0 + var2, var1 + var3);
      GL11.glVertex2f(var0 + var2, var1);
      GL11.glEnd();
   }

   private static void calculate_19(float var0, float var1, float var2, float var3, float var4) {
      calculate_18(var0 - var4, var1 - var4, var2 + var4 * 2.0F, var3 + var4 * 2.0F);
   }

   private static void calculate_20(float var0, float var1, float var2, float var3) {
      GL11.glBegin(7);
      GL11.glTexCoord2f(0.0F, 0.0F);
      GL11.glVertex2f(var0, var1);
      GL11.glTexCoord2f(0.0F, 1.0F);
      GL11.glVertex2f(var0, var1 + var3);
      GL11.glTexCoord2f(1.0F, 1.0F);
      GL11.glVertex2f(var0 + var2, var1 + var3);
      GL11.glTexCoord2f(1.0F, 0.0F);
      GL11.glVertex2f(var0 + var2, var1);
      GL11.glEnd();
   }

   private static Util50 lambda$fetchUrlBytes_Inner4(String var0) {
      Util50 var1 = new Util50(null);
      CONST_L.execute(RenderUtil28::lambda$null_Inner3);
      return var1;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void lambda$null_Inner3(String var0, Util50 var1) {
      long var2 = 20112166243201L;
      HttpURLConnection var4 = null;
      boolean var14 = false /* VF: Semaphore variable */;

      label116: {
         label117: {
            try {
               var14 = true;
               var4 = (HttpURLConnection)new URL(var0).openConnection();
               var4.setRequestProperty("User-Agent", "Mozilla/5.0");
               var4.setConnectTimeout(8000);
               var4.setReadTimeout(12000);
               var4.connect();
               if (var4.getResponseCode() != 200) {
                  var1.string_c = "HTTP " + var4.getResponseCode();
                  var1.enum_PENDING_a = EnumType26.FAILED;
                  var14 = false;
                  break label116;
               }

               ByteArrayOutputStream var5 = new ByteArrayOutputStream("_8²­Ï");
               byte[] var6 = new byte[16384];
               InputStream var7 = var4.getInputStream();

               while (true) {
                  int var8;
                  int var10000 = var8 = var7.read(var6);

                  try {
                     if (var10000 == -1) {
                        break;
                     }

                     var5.write(var6, 0, var8);
                  } catch (IOException var16) {
                     throw getIOException(var16);
                  }
               }

               var7.close();
               var1.arr_b = var5.toByteArray();
               var1.enum_PENDING_a = EnumType26.READY;
               var14 = false;
               break label117;
            } catch (IOException var17) {
               var1.string_c = var17.getMessage();
               var1.enum_PENDING_a = EnumType26.FAILED;
               var14 = false;
            } finally {
               if (var14) {
                  try {
                     if (var4 != null) {
                        var4.disconnect();
                     }
                  } catch (IOException var15) {
                     throw getIOException(var15);
                  }
               }
            }

            if (var4 != null) {
               var4.disconnect();
            }

            return;
         }

         if (var4 != null) {
            var4.disconnect();
         }

         return;
      }

      if (var4 != null) {
         var4.disconnect();
      }
   }

   private static Util50 lambda$resolveTexture_Inner2(String var0) {
      Util50 var1 = new Util50(null);
      CONST_L.execute(RenderUtil28::lambda$null_Inner1);
      return var1;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void lambda$null_Inner1(String var0, Util50 var1) {
      long var2 = 137881004484990L;
      HttpURLConnection var4 = null;
      boolean var14 = false /* VF: Semaphore variable */;

      label116: {
         label117: {
            try {
               var14 = true;
               var4 = (HttpURLConnection)new URL(var0).openConnection();
               var4.setRequestProperty("User-Agent", "Mozilla/5.0");
               var4.setConnectTimeout(8000);
               var4.setReadTimeout(12000);
               var4.connect();
               if (var4.getResponseCode() != 200) {
                  var1.string_c = "HTTP " + var4.getResponseCode();
                  var1.enum_PENDING_a = EnumType26.FAILED;
                  var14 = false;
                  break label116;
               }

               ByteArrayOutputStream var5 = new ByteArrayOutputStream(1537957504);
               byte[] var6 = new byte[16384];
               InputStream var7 = var4.getInputStream();

               while (true) {
                  int var8;
                  int var10000 = var8 = var7.read(var6);

                  try {
                     if (var10000 == -1) {
                        break;
                     }

                     var5.write(var6, 0, var8);
                  } catch (IOException var16) {
                     throw getIOException(var16);
                  }
               }

               var7.close();
               var1.arr_b = var5.toByteArray();
               var1.enum_PENDING_a = EnumType26.READY;
               var14 = false;
               break label117;
            } catch (IOException var17) {
               var1.string_c = var17.getMessage();
               var1.enum_PENDING_a = EnumType26.FAILED;
               var14 = false;
            } finally {
               if (var14) {
                  try {
                     if (var4 != null) {
                        var4.disconnect();
                     }
                  } catch (IOException var15) {
                     throw getIOException(var15);
                  }
               }
            }

            if (var4 != null) {
               var4.disconnect();
            }

            return;
         }

         if (var4 != null) {
            var4.disconnect();
         }

         return;
      }

      if (var4 != null) {
         var4.disconnect();
      }
   }

   private static Thread lambda$static_Inner0(Runnable var0) {
      long var1 = 32554176981439L;
      Thread var3 = new Thread(var0, "HUDRenderUtil-loader");
      var3.setDaemon(true);
      return var3;
   }

   static {
      long var0 = 90056070373143L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[72];
      int var5 = 0;
      String var6 = "\u0093C\u0015I¸'\u0083F¿\u0096ÂØ\u001a@þq\u0010\u007f@O\u0004ðöÌ=\u0010\u008e9¬\u007fÒÄ}\u0018Ý:PeGBÝÀÏÕR\u0090\u0080Hé\u009a \u0000h«\u009füÎ\u0013 åÚ¾Ú\u000fè·$\u0094Ä3ñ»^\u008a\u001f±\u001f6w»¼aÓ\u000fþö@ Yáe(Û\u001a·\u0088Æ\u000e;¦Ê\fqÀULD;§S\u00051k\u0089géQèã\u001c¶üñ\u0084Å(úD\u001f¿0¥ w¬Õm\r\fgí[Å¾â\u001e0\u0013í\u0010\r¡òq\u0090½º\u0090Ð\u008aa2¦\u0082\u0084(%¿YËmgKèæMÑw4ÄM\u0085\u0087y\u0018\u0094¬Hÿñ\u008cSWæÕößS\u0010\u0018o}ß³â¤\u0018\u001dX\u008a.÷ñ\u0083Gb®g×é6â¦ý¡\u009cX\u0014·0À vþ\u0081]WF¢ªæÒ$®C\u0015ë-ûSÁcÓîR\u0086Á<*Â;\u008e$¸\u0010\u0087\u008bË\u008ee\u0086á§ü\u0093þ\u008aÍC\u0088\u0002\u0018×ÌÁu\u0080có`\u0087|\\¬ä7mÈ!\u008ef\u0006\u0018¨Åþ\u0018\u0090Õëj\u0017¡\u001b»\u0006°%È(¥µ,»ÜW¿\u001a\u001a\u001aÍ 8~*>&\u0013\n\u009d*Ç)Zr\u008cÉ,ô¢)\u0019\u0097D\u007f\u001dÆ¿ôÄ*Ú#3 \u0094¾&òlpÊ\u0016äE\u0085BB\u0002:I\r6öÓQ\u001då\u0085\u001f¤éeZ©Â\u0087\u0010:®0ýÄ3nôKÅ2Æ\u0089Vi\u009b \u0003²ZÊ`3F\u0016É/ô¿û\u009c\u0097#{üfÚ\u0093_N\u008fê\u0093ú³¡u:\u0091\u00182k\u001co\u0080\u0011Üsß\u0091ÔüR\u0089qÊþ\u001a¯¯^\u0090`Ð \u001f\u0081\u008eT\u001c\u007fÃ\u009e¢ídr\u001c\u008bý\u0005\\\u0003¶mHðÕ\u0093i(\u0005'Ä\u0007ò\u0011(\u009duCZ×\u0012¦\u0019þ°ô\u0002Ç\u0000ÎzøVÐ42£\u000f\u00188©¡;\u0015Î'Èg\u009cãç\u0082)ên\u0018(\u0090\u009dk\u008b;\u0082\u0090M*.`Ð^\u000eÔe)¨Ù jÊu\u0010\u0004D¬Ë¢k¯¢ýÚ\u008f]Ä}6\u008f\u0018\u0006\u008d\u0095\u00adW\u0087¤êfÿ¸1BÚ\u0018_ñÌ\u0087H\u008fW¢×\u0010\u0083ß\u00975ïµÈ&JÌÅ4\u0002\u0092Æ! \u009eDL±£;(Ø\u0084\u0001ô1ünöþcØ2\u001bc1B\"\u0000\u008b\u0087`f&\u0016å\u0018K\u001eu¾\"\u00901r\u0010H\u001a\u0000º°Ã4\u0014Ó\u000f?\u0016\bº\u008a\u0018ÖÕ\u008d\u0092]ÝQNãÅ×Ãúj¤\u0084À6¼f-8å\u008d ±euJ;X=\u0087\u0001\u0019®\\m¶ü¾¤0Ì\u0095\"Ôb&G\u0080'Ìg\u000ftì\u0010\u0094\u0095âè)\u00075¹\u0016¨¯âô\u0094ñ\u0019\u0010\u0014óâêi|yh+q*\u0010²¢Y÷\u0010<\u0004>Aø'8zÜ\t_»%\u0006Æj >n 6ÁÂ7A3V¨þ\u009c¶ÄmÜ\t,£¾¡õtkä\u00ad\u007f±\u0094\u0089X\u0010\u0091,Î\"\\\f ÓcÎ\u0012\u0085h<\u0084_ \u009dÛx(¥[6¯\u0013GïW5&N\u0096ª)G©\bvi\t\u0084c£PI{³H\u0010ó\u0095;Z°yÅ\u000f®òµ$°^Ò³ \u0087É\u0006ªQ\b)[#ã\u0087Ä\\dHÜf×¼ÏÃ\u007fTgÄÉi\u0084:ë\u008c\u0092 d ØÆMþë6$H\u008a>í/ßCv\u0013í$â\u000fyóÁ\u0015»\u0000Ð$\u0015À\u0018¸T\u009al,@\r\u009fW\u0004õÌ6Êé\u000f\u0081:\"JRk;à tÞ\u0000¬\u0004þá8\u0012³þ§Ã\u0016;[lºQf\u0086f\u0019¯<~hQ\u0091\u009bV\u0003(ª\u0095¥kYhS2º|\u009f½§s¢È\u0001\u0090q\u0088³Þ:\u0003\u001eïñ}\u000fV7pØä£?.Éÿ9 \u0017*É\u000fçn\u001f\b\u0092Aß>\u008a\u0081\u0001þd\u0016\u0016Åp5\u0016Ýç\u0016\u009f¸JRAc\u0010&\u0002)·«bTjáÇ¯^\n\u0090\u001fÓ \u0014W¥\r\u0090³I.¤:\u000eýÐ\u0084\u0088$ª¡'\u0093K\u009e\u0091\u0080\\\u0016õd\u009dÖ/\u0002\u0018J\u001cÉ\"\t\u0097sPqÕÙ\u00843Hû \u008d³l¾\u009e\u0012+«\u0010Æ@ëx\\\u0096N+\u0007\"X\u008c\u009c)oë\u0018\u0001~<ÓÌ\u0010Òz;¾Ë\u009c\u0012²\u001f\u0085\u0087_3\u008e9\u0090r\u001b\u0018V÷`ÁØßJ5mÒ<l\u00adÎ¶\u0014} J\u000b¤ôhP 7+¢-c\u001d96\u0003I\u008fß¤\u0014\u0081ñl\u009c/Ë)WíÑ\u00865<\u008brhÇ\u001a(k@Óø@}\u0016>j\u0012°b.iZxj\u0000R\u0088mÏ¸\u0080X\u007f<³gT9\u0003õ¤3<ç\u001f\u009a\\0 ún\u0007Ã¢Åd\u0015Î³@.àé\u0089\u0087))z°c\u0091«¡Kqµ^à\u0002Ü;wNø\u0013\u0002\u0080$\u0087³\u0002puLaV\u0010÷^\u008b\u0019Ð\u00016O\u0010\u0006\u0006ò$JÁ¡\u0018¯ª\u0016\u0011Ã\u00195\u001f«qw\u0007\u008b;aÃ®l\u008b\u009bóÚ\"\\\u0018\u008c\u009f5[g!6êì\u0084C³6ßrÖ \u0001\u001f²\u0098\u001eÅw\u0018\u0080&JqÝ\u0010Dv\u0080ÃiE\u0086íã !ôQ0a«YÉ\u0010q\u0094e\\\u001dUe/jSVÌ\u008fE)o õ\u0002Õæþ\u009d\u0082æ'¾X\u001e(2cÆofÐ(cåýÏU>E¸©\u0006>ø\u0010µÓºáf¤ï9}®\u0095í ù¹\u0010\u0018\u0083<\u000eXF <\u0014ô\u009cîî\u0016\u001eQxL\u0085\u009b>åÈ\u0013¬\u0018¸û\tÐdÂþÌ.Ó\u008aØ\u0006¸Å2%Fis\u0081\u0099o\u0092 ¦õð\u0014I\u0014hI\u0094ä\b.¨A\u0093²\tÓÌÎÉú\u009f¢4h\u0004~\u0091\u0016T\u0010 \u008dÕ\u0010\u00867\u0096*ÓµuYöÅ\u0017R5U\u001dò£Íª\u0005B¤\u001dDöJ·\u0005\u0099\u0010çwÛ¼\u0001¦ÓWèïW¥oË±P ë\u0089µ;`XúTÙÅ\nC\u0089pÙ²\u0092º\u001bîk\u0096\u001ePÅv¿ùÈ×ôè &>D;Q\u0087>íë\u0090\u009ex$\b+[ÔÐÉ·5\u0095'pèñÛI\u009e(óD\u0010\u008e¦\n«\u0016\u008fÓõø¯/ \u0086A×S\u0010$¼\u0017©\u0085\u0003\u008e_,?#Ó¬§:ù g^ÊÆ\u009eÁ´RËÍÕnÒ\u0096\u0085®\u0093\f\u0084\u0086¬\r\u0097\u009aÝ\u0000ÃÜ\u009f÷hR ¤õ\u0000\u0090pÐ\u0092§¢B¹\u001aÛÈ3ð\u009d÷\u0012\u0005>\u0005\u001d\u008e\u0088ÈôÅp\u008e!}\u0010\bP|\u008d}a»Á^ãK\n2°\u000f\u000e \u0000\u008dÁKªJT\u0090×u\u0091\nÂnÁÐSô¯Ùw\u0099¼\u0087nµöº\u0092\u0085U/ Ë-Íß\u009a6×\u0082÷2voá\u0011\u0090¾X\u0084ïZ*q²f»\u00888)\u0017ÇDû";
      int var7 = "\u0093C\u0015I¸'\u0083F¿\u0096ÂØ\u001a@þq\u0010\u007f@O\u0004ðöÌ=\u0010\u008e9¬\u007fÒÄ}\u0018Ý:PeGBÝÀÏÕR\u0090\u0080Hé\u009a \u0000h«\u009füÎ\u0013 åÚ¾Ú\u000fè·$\u0094Ä3ñ»^\u008a\u001f±\u001f6w»¼aÓ\u000fþö@ Yáe(Û\u001a·\u0088Æ\u000e;¦Ê\fqÀULD;§S\u00051k\u0089géQèã\u001c¶üñ\u0084Å(úD\u001f¿0¥ w¬Õm\r\fgí[Å¾â\u001e0\u0013í\u0010\r¡òq\u0090½º\u0090Ð\u008aa2¦\u0082\u0084(%¿YËmgKèæMÑw4ÄM\u0085\u0087y\u0018\u0094¬Hÿñ\u008cSWæÕößS\u0010\u0018o}ß³â¤\u0018\u001dX\u008a.÷ñ\u0083Gb®g×é6â¦ý¡\u009cX\u0014·0À vþ\u0081]WF¢ªæÒ$®C\u0015ë-ûSÁcÓîR\u0086Á<*Â;\u008e$¸\u0010\u0087\u008bË\u008ee\u0086á§ü\u0093þ\u008aÍC\u0088\u0002\u0018×ÌÁu\u0080có`\u0087|\\¬ä7mÈ!\u008ef\u0006\u0018¨Åþ\u0018\u0090Õëj\u0017¡\u001b»\u0006°%È(¥µ,»ÜW¿\u001a\u001a\u001aÍ 8~*>&\u0013\n\u009d*Ç)Zr\u008cÉ,ô¢)\u0019\u0097D\u007f\u001dÆ¿ôÄ*Ú#3 \u0094¾&òlpÊ\u0016äE\u0085BB\u0002:I\r6öÓQ\u001då\u0085\u001f¤éeZ©Â\u0087\u0010:®0ýÄ3nôKÅ2Æ\u0089Vi\u009b \u0003²ZÊ`3F\u0016É/ô¿û\u009c\u0097#{üfÚ\u0093_N\u008fê\u0093ú³¡u:\u0091\u00182k\u001co\u0080\u0011Üsß\u0091ÔüR\u0089qÊþ\u001a¯¯^\u0090`Ð \u001f\u0081\u008eT\u001c\u007fÃ\u009e¢ídr\u001c\u008bý\u0005\\\u0003¶mHðÕ\u0093i(\u0005'Ä\u0007ò\u0011(\u009duCZ×\u0012¦\u0019þ°ô\u0002Ç\u0000ÎzøVÐ42£\u000f\u00188©¡;\u0015Î'Èg\u009cãç\u0082)ên\u0018(\u0090\u009dk\u008b;\u0082\u0090M*.`Ð^\u000eÔe)¨Ù jÊu\u0010\u0004D¬Ë¢k¯¢ýÚ\u008f]Ä}6\u008f\u0018\u0006\u008d\u0095\u00adW\u0087¤êfÿ¸1BÚ\u0018_ñÌ\u0087H\u008fW¢×\u0010\u0083ß\u00975ïµÈ&JÌÅ4\u0002\u0092Æ! \u009eDL±£;(Ø\u0084\u0001ô1ünöþcØ2\u001bc1B\"\u0000\u008b\u0087`f&\u0016å\u0018K\u001eu¾\"\u00901r\u0010H\u001a\u0000º°Ã4\u0014Ó\u000f?\u0016\bº\u008a\u0018ÖÕ\u008d\u0092]ÝQNãÅ×Ãúj¤\u0084À6¼f-8å\u008d ±euJ;X=\u0087\u0001\u0019®\\m¶ü¾¤0Ì\u0095\"Ôb&G\u0080'Ìg\u000ftì\u0010\u0094\u0095âè)\u00075¹\u0016¨¯âô\u0094ñ\u0019\u0010\u0014óâêi|yh+q*\u0010²¢Y÷\u0010<\u0004>Aø'8zÜ\t_»%\u0006Æj >n 6ÁÂ7A3V¨þ\u009c¶ÄmÜ\t,£¾¡õtkä\u00ad\u007f±\u0094\u0089X\u0010\u0091,Î\"\\\f ÓcÎ\u0012\u0085h<\u0084_ \u009dÛx(¥[6¯\u0013GïW5&N\u0096ª)G©\bvi\t\u0084c£PI{³H\u0010ó\u0095;Z°yÅ\u000f®òµ$°^Ò³ \u0087É\u0006ªQ\b)[#ã\u0087Ä\\dHÜf×¼ÏÃ\u007fTgÄÉi\u0084:ë\u008c\u0092 d ØÆMþë6$H\u008a>í/ßCv\u0013í$â\u000fyóÁ\u0015»\u0000Ð$\u0015À\u0018¸T\u009al,@\r\u009fW\u0004õÌ6Êé\u000f\u0081:\"JRk;à tÞ\u0000¬\u0004þá8\u0012³þ§Ã\u0016;[lºQf\u0086f\u0019¯<~hQ\u0091\u009bV\u0003(ª\u0095¥kYhS2º|\u009f½§s¢È\u0001\u0090q\u0088³Þ:\u0003\u001eïñ}\u000fV7pØä£?.Éÿ9 \u0017*É\u000fçn\u001f\b\u0092Aß>\u008a\u0081\u0001þd\u0016\u0016Åp5\u0016Ýç\u0016\u009f¸JRAc\u0010&\u0002)·«bTjáÇ¯^\n\u0090\u001fÓ \u0014W¥\r\u0090³I.¤:\u000eýÐ\u0084\u0088$ª¡'\u0093K\u009e\u0091\u0080\\\u0016õd\u009dÖ/\u0002\u0018J\u001cÉ\"\t\u0097sPqÕÙ\u00843Hû \u008d³l¾\u009e\u0012+«\u0010Æ@ëx\\\u0096N+\u0007\"X\u008c\u009c)oë\u0018\u0001~<ÓÌ\u0010Òz;¾Ë\u009c\u0012²\u001f\u0085\u0087_3\u008e9\u0090r\u001b\u0018V÷`ÁØßJ5mÒ<l\u00adÎ¶\u0014} J\u000b¤ôhP 7+¢-c\u001d96\u0003I\u008fß¤\u0014\u0081ñl\u009c/Ë)WíÑ\u00865<\u008brhÇ\u001a(k@Óø@}\u0016>j\u0012°b.iZxj\u0000R\u0088mÏ¸\u0080X\u007f<³gT9\u0003õ¤3<ç\u001f\u009a\\0 ún\u0007Ã¢Åd\u0015Î³@.àé\u0089\u0087))z°c\u0091«¡Kqµ^à\u0002Ü;wNø\u0013\u0002\u0080$\u0087³\u0002puLaV\u0010÷^\u008b\u0019Ð\u00016O\u0010\u0006\u0006ò$JÁ¡\u0018¯ª\u0016\u0011Ã\u00195\u001f«qw\u0007\u008b;aÃ®l\u008b\u009bóÚ\"\\\u0018\u008c\u009f5[g!6êì\u0084C³6ßrÖ \u0001\u001f²\u0098\u001eÅw\u0018\u0080&JqÝ\u0010Dv\u0080ÃiE\u0086íã !ôQ0a«YÉ\u0010q\u0094e\\\u001dUe/jSVÌ\u008fE)o õ\u0002Õæþ\u009d\u0082æ'¾X\u001e(2cÆofÐ(cåýÏU>E¸©\u0006>ø\u0010µÓºáf¤ï9}®\u0095í ù¹\u0010\u0018\u0083<\u000eXF <\u0014ô\u009cîî\u0016\u001eQxL\u0085\u009b>åÈ\u0013¬\u0018¸û\tÐdÂþÌ.Ó\u008aØ\u0006¸Å2%Fis\u0081\u0099o\u0092 ¦õð\u0014I\u0014hI\u0094ä\b.¨A\u0093²\tÓÌÎÉú\u009f¢4h\u0004~\u0091\u0016T\u0010 \u008dÕ\u0010\u00867\u0096*ÓµuYöÅ\u0017R5U\u001dò£Íª\u0005B¤\u001dDöJ·\u0005\u0099\u0010çwÛ¼\u0001¦ÓWèïW¥oË±P ë\u0089µ;`XúTÙÅ\nC\u0089pÙ²\u0092º\u001bîk\u0096\u001ePÅv¿ùÈ×ôè &>D;Q\u0087>íë\u0090\u009ex$\b+[ÔÐÉ·5\u0095'pèñÛI\u009e(óD\u0010\u008e¦\n«\u0016\u008fÓõø¯/ \u0086A×S\u0010$¼\u0017©\u0085\u0003\u008e_,?#Ó¬§:ù g^ÊÆ\u009eÁ´RËÍÕnÒ\u0096\u0085®\u0093\f\u0084\u0086¬\r\u0097\u009aÝ\u0000ÃÜ\u009f÷hR ¤õ\u0000\u0090pÐ\u0092§¢B¹\u001aÛÈ3ð\u009d÷\u0012\u0005>\u0005\u001d\u008e\u0088ÈôÅp\u008e!}\u0010\bP|\u008d}a»Á^ãK\n2°\u000f\u000e \u0000\u008dÁKªJT\u0090×u\u0091\nÂnÁÐSô¯Ùw\u0099¼\u0087nµöº\u0092\u0085U/ Ë-Íß\u009a6×\u0082÷2voá\u0011\u0090¾X\u0084ïZ*q²f»\u00888)\u0017ÇDû"
         .length();
      char var8 = 16;
      int var23 = -1;

      label54:
      while (true) {
         String var25 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var36;
                  if ((var23 += var8) >= var7) {
                     CONST_N = var4;
                     CONST_O = new String[72];
                     CONST_S = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[4];
                     int var14 = 0;
                     String var15 = "Õ&Æ>ÕÔ\u0006\u0082\u008f«ÈÁïÃ[!";
                     int var16 = "Õ&Æ>ÕÔ\u0006\u0082\u008f«ÈÁïÃ[!".length();
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
                                    CONST_R = new Integer[4];
                                    CONST_F = BufferUtils.createFloatBuffer(16);
                                    CONST_G = new ConcurrentHashMap<>();
                                    CONST_H = new ConcurrentHashMap<>();
                                    CONST_I = new ConcurrentHashMap<>();
                                    CONST_J = new ConcurrentHashMap<>();
                                    CONST_K = new ConcurrentHashMap<>();
                                    CONST_L = Executors.newSingleThreadExecutor(RenderUtil28::lambda$static_Inner0);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "ÕOIz0²çVº4²lû?\u0016°";
                                 var16 = "ÕOIz0²çVº4²lû?\u0016°".length();
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

                  var6 = "îªiÃ\u0007'¢\u0087N\u0018°g\u0013q\u0006P:õ\u0004¨g\t¥²\u0010Ã\u008dPw\u00879]'EØ`\u0091j@\u001dæ";
                  var7 = "îªiÃ\u0007'¢\u0087N\u0018°g\u0013q\u0006P:õ\u0004¨g\t¥²\u0010Ã\u008dPw\u00879]'EØ`\u0091j@\u001dæ".length();
                  var8 = 24;
                  var23 = -1;
            }

            var25 = var6.substring(++var23, var23 + var8);
            var10001 = 0;
         }
      }
   }

   private static IOException getIOException(IOException var0) {
      return var0;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4530;
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
            throw new RuntimeException("rip/breeze/client/fi", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_N[var3].getBytes("ISO-8859-1");
         CONST_O[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_O[var3];
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
         throw new RuntimeException("rip/breeze/client/fi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 619;
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
            throw new RuntimeException("rip/breeze/client/fi", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_R[var3] = var15;
      }

      return CONST_R[var3];
   }

   private static int getValue_2(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
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
               MethodHandles.insertArguments("getValue_2".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/fi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
