package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import rip.breeze.StringDecryptor;
import rip.breeze.Util8;

public class ConfigUtil3 {
   private static final int CONST_A;
   private static final int CONST_B;
   private static FontManager fontManager_c;
   private static FontManager fontManager_d;
   private static FontManager fontManager_e;
   private static FontManager fontManager_f;
   private static FontManager fontManager_g;
   private static FontManager fontManager_h;
   private static FontManager fontManager_i;
   private static Framebuffer framebuffer_j;
   private static Framebuffer framebuffer_k;
   private static Framebuffer framebuffer_l;
   private static int fieldInt_m;
   private static int fieldInt_n;
   private static int fieldInt_o;
   private static Framebuffer framebuffer_p;
   private static Framebuffer framebuffer_q;
   private static int fieldInt_r;
   private static int fieldInt_s;
   private static int fieldInt_t;
   private static int fieldInt_u;
   private static Framebuffer[] arr_v;
   private static Framebuffer[] arr_w;
   private static int fieldInt_x;
   private static int fieldInt_y;
   private static int fieldInt_z;
   private static final String[] CONST_B_2;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);
   private static final long[] CONST_E;
   private static final Integer[] CONST_F;
   private static final Map CONST_G;

   public static void processNullable() {
      long var0 = 88443515848864L;
      if (fontManager_c == null) {
         fontManager_c = new FontManager("background/copy.fsh", "vertex.vsh");
         fontManager_d = new FontManager("background/blur_sep.fsh", "vertex.vsh");
         fontManager_e = new FontManager("background/blur_composite_mask.fsh", "vertex.vsh");
         fontManager_f = new FontManager("background/mask_rounded_rects.fsh", "vertex.vsh");
         fontManager_g = new FontManager("background/shadow_from_mask.fsh", "vertex.vsh");
         fontManager_h = new FontManager("background/kawase_down.fsh", "vertex.vsh");
         fontManager_i = new FontManager("background/kawase_up.fsh", "vertex.vsh");
         arr_v = new Framebuffer[6];
         arr_w = new Framebuffer[6];
      }
   }

   private static void processNullable_2(Framebuffer var0) {
      long var1 = 35673517499548L;
      if (var0 != null) {
         int var3 = var0.framebufferTexture;
         if (var3 > 0) {
            GL11.glBindTexture(3553, var3);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, "¿,=¢4");
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glBindTexture(3553, 0);
         }
      }
   }

   private static void clamp(int var0) {
      int var1 = Math.max(1, BreezeClient.CONST_A.displayWidth / var0);
      int var2 = Math.max(1, BreezeClient.CONST_A.displayHeight / var0);
      if (framebuffer_j == null || var1 != fieldInt_m || var2 != fieldInt_n || var0 != fieldInt_o) {
         if (framebuffer_j != null) {
            framebuffer_j.deleteFramebuffer();
         }

         if (framebuffer_k != null) {
            framebuffer_k.deleteFramebuffer();
         }

         if (framebuffer_l != null) {
            framebuffer_l.deleteFramebuffer();
         }

         framebuffer_j = new Framebuffer(var1, var2, false);
         framebuffer_k = new Framebuffer(var1, var2, false);
         framebuffer_l = new Framebuffer(var1, var2, false);
         framebuffer_j.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
         framebuffer_k.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
         framebuffer_l.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
         processNullable_2(framebuffer_j);
         processNullable_2(framebuffer_k);
         processNullable_2(framebuffer_l);
         fieldInt_m = var1;
         fieldInt_n = var2;
         fieldInt_o = var0;
      }
   }

   private static void clamp_2() {
      int var0 = Math.max(1, BreezeClient.CONST_A.displayWidth);
      int var1 = Math.max(1, BreezeClient.CONST_A.displayHeight);
      if (framebuffer_p == null || var0 != fieldInt_r || var1 != fieldInt_s) {
         if (framebuffer_p != null) {
            framebuffer_p.deleteFramebuffer();
         }

         framebuffer_p = new Framebuffer(var0, var1, false);
         framebuffer_p.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
         processNullable_2(framebuffer_p);
         fieldInt_r = var0;
         fieldInt_s = var1;
      }
   }

   private static void clamp_3() {
      int var0 = Math.max(1, BreezeClient.CONST_A.displayWidth);
      int var1 = Math.max(1, BreezeClient.CONST_A.displayHeight);
      if (framebuffer_q == null || var0 != fieldInt_t || var1 != fieldInt_u) {
         if (framebuffer_q != null) {
            framebuffer_q.deleteFramebuffer();
         }

         framebuffer_q = new Framebuffer(var0, var1, false);
         framebuffer_q.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
         processNullable_2(framebuffer_q);
         fieldInt_t = var0;
         fieldInt_u = var1;
      }
   }

   private static int calculate(float var0) {
      if (var0 <= 6.0F) {
         return 0;
      }

      int var1 = (int)Math.floor((var0 - 6.0F) / 12.0F) + 1;
      if (var1 < 0) {
         var1 = 0;
      }

      if (var1 > 5) {
         var1 = 5;
      }

      return var1;
   }

   private static void processAll() {
      for (int var0 = 0; var0 < 6; var0++) {
         if (arr_v[var0] != null) {
            arr_v[var0].deleteFramebuffer();
            arr_v[var0] = null;
         }

         if (arr_w[var0] != null) {
            arr_w[var0].deleteFramebuffer();
            arr_w[var0] = null;
         }
      }
   }

   private static void clamp_4(int var0) {
      int var1 = Math.max(1, BreezeClient.CONST_A.displayWidth);
      int var2 = Math.max(1, BreezeClient.CONST_A.displayHeight);
      if (var0 != fieldInt_z || var1 != fieldInt_x || var2 != fieldInt_y) {
         processAll();
         int var3 = var1;
         int var4 = var2;

         for (int var5 = 0; var5 <= var0; var5++) {
            var3 = Math.max(1, var3 / 2);
            var4 = Math.max(1, var4 / 2);
            arr_v[var5] = new Framebuffer(var3, var4, false);
            arr_v[var5].setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
            processNullable_2(arr_v[var5]);
            arr_w[var5] = new Framebuffer(var3, var4, false);
            arr_w[var5].setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
            processNullable_2(arr_w[var5]);
         }

         fieldInt_z = var0;
         fieldInt_x = var1;
         fieldInt_y = var2;
      }
   }

   private static void render() {
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glClear(16384);
   }

   private static void render_1(int var0, int var1) {
      GlStateManager.matrixMode(5889);
      GlStateManager.pushMatrix();
      GlStateManager.loadIdentity();
      GlStateManager.ortho(0.0, var0, var1, 0.0, -1.0, 1.0);
      GlStateManager.matrixMode(5888);
      GlStateManager.pushMatrix();
      GlStateManager.loadIdentity();
   }

   private static void render_2(int var0, int var1) {
      GlStateManager.matrixMode(5889);
      GlStateManager.pushMatrix();
      GlStateManager.loadIdentity();
      GlStateManager.ortho(0.0, var0, 0.0, var1, -1.0, 1.0);
      GlStateManager.matrixMode(5888);
      GlStateManager.pushMatrix();
      GlStateManager.loadIdentity();
   }

   private static void render_3() {
      GlStateManager.matrixMode(5888);
      GlStateManager.popMatrix();
      GlStateManager.matrixMode(5889);
      GlStateManager.popMatrix();
      GlStateManager.matrixMode(5888);
   }

   private static void calculate_2(Framebuffer var0, int var1, int var2) {
      double var3 = (double)var0.framebufferWidth / var0.framebufferTextureWidth;
      double var5 = (double)var0.framebufferHeight / var0.framebufferTextureHeight;
      var0.bindFramebufferTexture();
      GL11.glBegin(7);
      GL11.glTexCoord2d(0.0, 0.0);
      GL11.glVertex2d(0.0, var2);
      GL11.glTexCoord2d(var3, 0.0);
      GL11.glVertex2d(var1, var2);
      GL11.glTexCoord2d(var3, var5);
      GL11.glVertex2d(var1, 0.0);
      GL11.glTexCoord2d(0.0, var5);
      GL11.glVertex2d(0.0, 0.0);
      GL11.glEnd();
      var0.unbindFramebufferTexture();
   }

   private static void calculate_3(Framebuffer var0, int var1, int var2) {
      double var3 = (double)var0.framebufferWidth / var0.framebufferTextureWidth;
      double var5 = (double)var0.framebufferHeight / var0.framebufferTextureHeight;
      var0.bindFramebufferTexture();
      GL11.glBegin(7);
      GL11.glTexCoord2d(0.0, 0.0);
      GL11.glVertex2d(0.0, 0.0);
      GL11.glTexCoord2d(var3, 0.0);
      GL11.glVertex2d(var1, 0.0);
      GL11.glTexCoord2d(var3, var5);
      GL11.glVertex2d(var1, var2);
      GL11.glTexCoord2d(0.0, var5);
      GL11.glVertex2d(0.0, var2);
      GL11.glEnd();
      var0.unbindFramebufferTexture();
   }

   private static void render_4(int var0, int var1) {
      GL11.glBegin(7);
      GL11.glVertex2f(0.0F, 0.0F);
      GL11.glVertex2f(var0, 0.0F);
      GL11.glVertex2f(var0, var1);
      GL11.glVertex2f(0.0F, var1);
      GL11.glEnd();
   }

   private static void calculate_4(float var0, float var1, float var2, float var3) {
      GL11.glBegin(7);
      GL11.glVertex2f(var0, var1);
      GL11.glVertex2f(var0, var1 + var3);
      GL11.glVertex2f(var0 + var2, var1 + var3);
      GL11.glVertex2f(var0 + var2, var1);
      GL11.glEnd();
   }

   private static void clamp_5(FontManager var0, List<Util8> var1, int var2, int var3) {
      long var4 = 106630367912920L;
      float var6 = var3;

      for (int var7 = 0; var7 < var2; var7++) {
         Util8 var8 = (Util8)var1.get(var7);
         float var9 = var8.fieldFloat_a;
         float var10 = var6 - var8.fieldFloat_b - var8.fieldFloat_d;
         float var11 = var8.fieldFloat_c;
         float var12 = var8.fieldFloat_d;
         var0.drawString("rects[" + var7 + "]", var9, var10, var11, var12);
         float var13 = var8.fieldFloat_e;
         float var14 = var8.fieldFloat_f;
         float var15 = var8.fieldFloat_g;
         float var16 = var8.fieldFloat_h;
         float var17 = 0.5F * Math.min(var11, var12);
         var13 = Math.min(var13, var17);
         var14 = Math.min(var14, var17);
         var15 = Math.min(var15, var17);
         var16 = Math.min(var16, var17);
         var0.drawString("radii[" + var7 + "]", var13, var14, var15, var16);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void clamp_6(List<Util8> var0, float var1, float var2, Color var3, Color var4, float var5, int var6) {
      long var7 = 86221073058867L;
      if (var0 != null && !var0.isEmpty()) {
         processNullable();
         int var9 = Math.min(var0.size(), 64);
         if (var9 > 0) {
            var6 = Math.max(1, var6);
            boolean var10 = var4 != null && var4.getAlpha() > 0 && var5 > 0.01F;
            int var11 = BreezeClient.CONST_A.displayWidth;
            int var12 = BreezeClient.CONST_A.displayHeight;
            float var13 = 1.0F;
            float var14 = Float.POSITIVE_INFINITY;
            float var15 = Float.POSITIVE_INFINITY;
            float var16 = Float.NEGATIVE_INFINITY;
            float var17 = Float.NEGATIVE_INFINITY;

            for (int var18 = 0; var18 < var9; var18++) {
               Util8 var19 = (Util8)var0.get(var18);
               var14 = Math.min(var14, var19.fieldFloat_a);
               var15 = Math.min(var15, var19.fieldFloat_b);
               var16 = Math.max(var16, var19.fieldFloat_a + var19.fieldFloat_c);
               var17 = Math.max(var17, var19.fieldFloat_b + var19.fieldFloat_d);
            }

            float var73 = 0.75F;
            float var74 = Math.max(0.0F, var5) * 1.0F;
            float var20 = (var10 ? var74 * 2.0F : 0.0F) + 0.75F + 10.0F;
            float var21 = var20 / 1.0F;
            float var22 = (float)Math.floor(var14 - var21);
            float var23 = (float)Math.floor(var15 - var21);
            float var24 = (float)Math.ceil(var16 + var21);
            float var25 = (float)Math.ceil(var17 + var21);
            var22 = Math.max(0.0F, var22);
            var23 = Math.max(0.0F, var23);
            var24 = Math.min(var11, var24);
            var25 = Math.min(var12, var25);
            float var26 = Math.max(0.0F, var24 - var22);
            float var27 = Math.max(0.0F, var25 - var23);
            if (!(var26 <= 0.0F) && !(var27 <= 0.0F)) {
               clamp(var6);
               int var28 = framebuffer_j.framebufferWidth;
               int var29 = framebuffer_j.framebufferHeight;
               int var30 = (int)Math.ceil(var1 / var6) + 1;
               int var31 = (int)Math.floor(var22 / var6) - var30;
               int var32 = (int)Math.floor(var23 / var6) - var30;
               int var33 = (int)Math.ceil((var22 + var26) / var6) + var30;
               int var34 = (int)Math.ceil((var23 + var27) / var6) + var30;
               var31 = getValue(var31, 0, var28);
               var33 = getValue(var33, 0, var28);
               var32 = getValue(var32, 0, var29);
               var34 = getValue(var34, 0, var29);
               int var35 = Math.max(1, var33 - var31);
               int var36 = Math.max(1, var34 - var32);
               int var37 = var31;
               int var38 = var29 - (var32 + var36);
               if (var10) {
                  clamp_2();
                  clamp_3();
               }

               GL11.glPushAttrib("ᗺxݑ`¯*<¶");
               GlStateManager.matrixMode(5889);
               long var10001 = 8354282578222377336L ^ var7;
               GlStateManager.pushMatrix();
               GlStateManager.matrixMode(5888);
               GlStateManager.pushMatrix();
               int var39 = GL11.glGetInteger(((String)null));
               int var40 = GL11.glGetInteger(-1741789653);
               int var41 = GL11.glGetInteger(867833383);
               IntBuffer var42 = BufferUtils.createIntBuffer(16);
               GL11.glGetInteger(2978, var42);
               int var43 = var42.get(0);
               int var44 = var42.get(1);
               int var45 = var42.get(2);
               int var46 = var42.get(3);
               boolean var70 = false /* VF: Semaphore variable */;

               short var10000;
               try {
                  var70 = true;
                  GL11.glDisable(2912);
                  GL11.glDisable(2929);
                  var10001 = 760021871695157930L ^ var7;
                  GL11.glDisable(3008);
                  GL11.glDisable(2884);
                  GL11.glDisable(2896);
                  GL11.glDisable(3042);
                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                  GL11.glEnable(3553);
                  Framebuffer var47 = BreezeClient.CONST_A.getFramebuffer();
                  framebuffer_j.bindFramebuffer(true);
                  GL11.glViewport(0, 0, framebuffer_j.framebufferWidth, framebuffer_j.framebufferHeight);
                  render_1(framebuffer_j.framebufferWidth, framebuffer_j.framebufferHeight);
                  GL11.glEnable(3089);
                  GL11.glScissor(var37, var38, var35, var36);
                  render();
                  fontManager_c.initialize();
                  fontManager_c.drawString("texture", 0);
                  GL13.glActiveTexture(((String)null));
                  calculate_2(var47, framebuffer_j.framebufferWidth, framebuffer_j.framebufferHeight);
                  var10001 = 2059257554091915588L ^ var7;
                  fontManager_c.bind();
                  GL11.glDisable(3089);
                  render_3();
                  framebuffer_j.unbindFramebuffer();
                  float var48 = var1 / var6;
                  float var49 = 1.0F / framebuffer_j.framebufferTextureWidth;
                  float var50 = 1.0F / framebuffer_j.framebufferTextureHeight;
                  framebuffer_k.bindFramebuffer(true);
                  GL11.glViewport(0, 0, framebuffer_k.framebufferWidth, framebuffer_k.framebufferHeight);
                  render_1(framebuffer_k.framebufferWidth, framebuffer_k.framebufferHeight);
                  GL11.glEnable(3089);
                  GL11.glScissor(var37, var38, var35, var36);
                  render();
                  fontManager_d.initialize();
                  fontManager_d.drawString("texture", 0);
                  fontManager_d.drawString("texelSize", var49, var50);
                  fontManager_d.drawString("direction", 1.0F, 0.0F);
                  fontManager_d.drawString("radius", var48);
                  GL13.glActiveTexture(((String)null));
                  calculate_2(framebuffer_j, framebuffer_k.framebufferWidth, framebuffer_k.framebufferHeight);
                  var10001 = 2059257554091915588L ^ var7;
                  fontManager_d.bind();
                  GL11.glDisable(3089);
                  render_3();
                  framebuffer_k.unbindFramebuffer();
                  float var51 = 1.0F / framebuffer_k.framebufferTextureWidth;
                  float var52 = 1.0F / framebuffer_k.framebufferTextureHeight;
                  framebuffer_l.bindFramebuffer(true);
                  GL11.glViewport(0, 0, framebuffer_l.framebufferWidth, framebuffer_l.framebufferHeight);
                  render_1(framebuffer_l.framebufferWidth, framebuffer_l.framebufferHeight);
                  GL11.glEnable(3089);
                  GL11.glScissor(var37, var38, var35, var36);
                  render();
                  fontManager_d.initialize();
                  fontManager_d.drawString("texture", 0);
                  fontManager_d.drawString("texelSize", var51, var52);
                  fontManager_d.drawString("direction", 0.0F, 1.0F);
                  fontManager_d.drawString("radius", var48);
                  GL13.glActiveTexture(((String)null));
                  calculate_2(framebuffer_k, framebuffer_l.framebufferWidth, framebuffer_l.framebufferHeight);
                  fontManager_d.bind();
                  GL11.glDisable(3089);
                  render_3();
                  framebuffer_l.unbindFramebuffer();
                  Framebuffer var53 = null;
                  if (var10 && var74 > 0.5F) {
                     int var54 = (int)(var22 * 1.0F);
                     int var55 = (int)Math.ceil(var26 * 1.0F);
                     int var56 = (int)(var23 * 1.0F);
                     int var57 = (int)Math.ceil(var27 * 1.0F);
                     int var58 = BreezeClient.CONST_A.displayHeight - (var56 + var57);
                     framebuffer_p.bindFramebuffer(true);
                     GL11.glViewport(0, 0, framebuffer_p.framebufferWidth, framebuffer_p.framebufferHeight);
                     render_2(framebuffer_p.framebufferWidth, framebuffer_p.framebufferHeight);
                     render();
                     GL11.glEnable(3089);
                     GL11.glScissor(var54, var58, Math.max(1, var55), Math.max(1, var57));
                     fontManager_f.initialize();
                     fontManager_f.drawString("rectCount", var9);
                     clamp_5(fontManager_f, var0, var9, var12);
                     fontManager_f.drawString("edgeSoftness", 0.0F);
                     render_4(framebuffer_p.framebufferWidth, framebuffer_p.framebufferHeight);
                     fontManager_f.bind();
                     GL11.glDisable(3089);
                     render_3();
                     framebuffer_p.unbindFramebuffer();
                     int var59 = calculate(var74);
                     clamp_4(var59);
                     Framebuffer var60 = framebuffer_p;

                     for (int var61 = 0; var61 <= var59; var61++) {
                        Framebuffer var62 = arr_v[var61];
                        var62.bindFramebuffer(true);
                        var10001 = 2059257554091915588L ^ var7;
                        GL11.glViewport(0, 0, var62.framebufferWidth, var62.framebufferHeight);
                        render();
                        render_2(var62.framebufferWidth, var62.framebufferHeight);
                        fontManager_h.initialize();
                        fontManager_h.drawString("texture", 0);
                        float var63 = 1.0F / var60.framebufferTextureWidth;
                        float var64 = 1.0F / var60.framebufferTextureHeight;
                        fontManager_h.drawString("texelSize", var63, var64);
                        float var65 = Math.max(1.0F, var74 / 18.0F);
                        float var66 = var65 + var61 * 0.75F;
                        fontManager_h.drawString("offset", var66);
                        GL13.glActiveTexture(((String)null));
                        calculate_3(var60, var62.framebufferWidth, var62.framebufferHeight);
                        fontManager_h.bind();
                        render_3();
                        var62.unbindFramebuffer();
                        var60 = var62;
                     }

                     Framebuffer var90 = arr_v[var59];

                     for (int var91 = var59; var91 >= 0; var91--) {
                        Framebuffer var92 = arr_w[var91];
                        var92.bindFramebuffer(true);
                        var10001 = 2059257554091915588L ^ var7;
                        GL11.glViewport(0, 0, var92.framebufferWidth, var92.framebufferHeight);
                        render();
                        render_2(var92.framebufferWidth, var92.framebufferHeight);
                        fontManager_i.initialize();
                        fontManager_i.drawString("texture", 0);
                        float var93 = 1.0F / var90.framebufferTextureWidth;
                        float var94 = 1.0F / var90.framebufferTextureHeight;
                        fontManager_i.drawString("texelSize", var93, var94);
                        float var95 = Math.max(1.0F, var74 / 18.0F);
                        float var67 = var95 + var91 * 0.75F;
                        fontManager_i.drawString("offset", var67);
                        GL13.glActiveTexture(((String)null));
                        calculate_3(var90, var92.framebufferWidth, var92.framebufferHeight);
                        fontManager_i.bind();
                        render_3();
                        var92.unbindFramebuffer();
                        var90 = var92;
                     }

                     framebuffer_q.bindFramebuffer(true);
                     GL11.glViewport(0, 0, framebuffer_q.framebufferWidth, framebuffer_q.framebufferHeight);
                     var10001 = 2059257554091915588L ^ var7;
                     render();
                     render_2(framebuffer_q.framebufferWidth, framebuffer_q.framebufferHeight);
                     fontManager_c.initialize();
                     fontManager_c.drawString("texture", 0);
                     GL13.glActiveTexture(((String)null));
                     calculate_3(arr_w[0], framebuffer_q.framebufferWidth, framebuffer_q.framebufferHeight);
                     fontManager_c.bind();
                     render_3();
                     framebuffer_q.unbindFramebuffer();
                     var53 = framebuffer_q;
                  }

                  GL30.glBindFramebuffer(208894137, var41);
                  GL11.glViewport(var43, var44, var45, var46);
                  GL11.glEnable(3042);
                  GL11.glDisable(2929);
                  GL11.glDisable(3008);
                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                  render_1(var11, var12);
                  float var83 = (float)framebuffer_l.framebufferWidth / framebuffer_l.framebufferTextureWidth;
                  float var84 = (float)framebuffer_l.framebufferHeight / framebuffer_l.framebufferTextureHeight;
                  if (var53 != null) {
                     float var85 = (float)var53.framebufferWidth / var53.framebufferTextureWidth;
                     float var86 = (float)var53.framebufferHeight / var53.framebufferTextureHeight;
                     float var87 = (float)framebuffer_p.framebufferWidth / framebuffer_p.framebufferTextureWidth;
                     float var88 = (float)framebuffer_p.framebufferHeight / framebuffer_p.framebufferTextureHeight;
                     GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
                     fontManager_g.initialize();
                     fontManager_g.drawString("maskSoft", 0);
                     fontManager_g.drawString("maskHard", 1);
                     fontManager_g.drawString(
                        "resolution", BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight
                     );
                     fontManager_g.drawString("softTexScale", var85, var86);
                     fontManager_g.drawString("hardTexScale", var87, var88);
                     fontManager_g.drawString(
                        "shadowColor",
                        var4.getRed() / 255.0F,
                        var4.getGreen() / 255.0F,
                        var4.getBlue() / 255.0F,
                        var4.getAlpha() / 255.0F
                     );
                     float var89 = 1.35F;
                     if (var74 > 30.0F) {
                        var89 = 1.15F;
                     } else if (var74 < 12.0F) {
                        var89 = 1.55F;
                     }

                     fontManager_g.drawString("shadowGamma", var89);
                     GL13.glActiveTexture(-920862391);
                     GlStateManager.bindTexture(var53.framebufferTexture);
                     GL13.glActiveTexture(2002212567);
                     GlStateManager.bindTexture(framebuffer_p.framebufferTexture);
                     GL13.glActiveTexture(-920862391);
                     calculate_4(var22, var23, var26, var27);
                     fontManager_g.bind();
                  }

                  GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
                  fontManager_e.initialize();
                  var10001 = 2059257554091915588L ^ var7;
                  fontManager_e.drawString("blurred", 0);
                  fontManager_e.drawString(
                     "resolution", BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight
                  );
                  fontManager_e.drawString("blurTexScale", var83, var84);
                  fontManager_e.drawString("rectCount", var9);
                  clamp_5(fontManager_e, var0, var9, var12);
                  fontManager_e.drawString("brightness", var2);
                  fontManager_e.drawString(
                     "tint",
                     var3.getRed() / 255.0F,
                     var3.getGreen() / 255.0F,
                     var3.getBlue() / 255.0F,
                     var3.getAlpha() / 255.0F
                  );
                  fontManager_e.drawString("edgeSoftness", 0.75F);
                  GL13.glActiveTexture(((String)null));
                  var10000 = 27723;
                  GlStateManager.bindTexture(framebuffer_l.framebufferTexture);
                  var10001 = 6919284334600454187L ^ var7;
                  calculate_4(var22, var23, var26, var27);
                  fontManager_e.bind();
                  render_3();
                  var70 = false;
               } finally {
                  if (var70) {
                     GL20.glUseProgram(var39);
                     var10001 = 6919284334600454187L ^ var7;
                     GL13.glActiveTexture(var40);
                     GL30.glBindFramebuffer(((String)null), var41);
                     GL11.glViewport(var43, var44, var45, var46);
                     GlStateManager.matrixMode(5888);
                     GlStateManager.popMatrix();
                     GlStateManager.matrixMode(5889);
                     GlStateManager.popMatrix();
                     GL11.glPopAttrib();
                  }
               }

               GL20.glUseProgram(var39);
               GL13.glActiveTexture(var40);
               GL30.glBindFramebuffer(((String)null), var41);
               GL11.glViewport(var43, var44, var45, var46);
               GlStateManager.matrixMode(5888);
               GlStateManager.popMatrix();
               GlStateManager.matrixMode(5889);
               GlStateManager.popMatrix();
               GL11.glPopAttrib();
            }
         }
      }
   }

   private static int getValue(int var0, int var1, int var2) {
      return var0 < var1 ? var1 : (var0 > var2 ? var2 : var0);
   }

   static {
      long var0 = 5045075987385L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[37];
      int var5 = 0;
      String var6 = "ÚçÞç\u0015\u0095½dcÄv\u009a]/\u008aÏ\u009aW\u0095j'Wö\u0006ZDBõ\u0083\\ý\u0095 ü\u009bdª:Í\u001còJ\u0080\u000f°p}l\u0003§U\u0001+\u009cm/±±$&wÂ¬ôä Å\u0099\fE\u009cs®u\u008eùÙi\u0085ÄÂ\u0084ë%Ê\u0018±ve\u007f\u008ebÂ +þS\n\u0010Bí\u008b\u0013Ô3\u0089Ks!¡RäèÛ)8d°CG\b#\u0002\u0085È\u0098»\u0012\u008cÛ/\u0014Üô \b$/Õ\u0092\u008e\u0086÷Ò\u009e·Í¬¢\u0089@`\u0016'Ûä \u0004IßeÇb\nÿþSÎäS¿\u0005  o0ð\u0015\u007f[ò\u0002'>xHH\u008bÂ÷]þ\u001b\u001c½\u0014\u0083üÑÒ6\n\u0013©\u00118àýc\"#\u0083\u0088´ä\u00ad\u008dòß\u0085\u009d\u0086¼\u009e\u0012æ}ºa\u0011\u001bè\u0087Óà\u0088¦..ÁY^\u008f\nO^¾õºö\u0088æ©¡8ã\r$¬\u009b)¨(-ë\u0088¨ÆDhÜSænpC³\u0092Þ\u001f\u000e]Zo§0z>èÊ\u0016\\ì6«çqÅë\u0003\u0096.ý \u0001õ\u0000\tNO;@Å\u009e\u0017\u0081\\\u0010^\u008eX;ï\u0010\u008e ©\u008eÆV^\u008e\\´EÂ\u0010\u0097\u009e,È\u0001\u0000AíD_\u00027E½µå(F\u0002WÛbipa>dH¨Rý\u0092¡ãM\u0013ÜÈ\u0000;=Îô\u0010AB÷fDq¨ùØSi4q8\n@\u001a<ï(®\u009fj\u0014æ.áÃ9\u0013V¥\u00107\u0017?\u0001£âfpý\u001cë`ÊóY|B\u007fh²\u007fV\u0011ÑsTd\u008e?Ì\u009bÊ#\u001aß\u0081\u008d\u0010^ã´\"æ×\u0010¬\u0018JcãÅ\u0097'\u0084 \u0005\u0080ý\u0015r\t j³\u009a\u0007\u009b~!V\f¢(Þ&)úX\r¾a\u0014\u007f\u0010\u0089(\u008e \u0082ÛF~ve\tãK}\u0096Ï¸\u0096ï\u0095¹æí=öáÕ\"Ð£\u0013Y\u0005qS¡\u0018\u00adù\u0081ê°C£ú\u001e\u0083ùD¢\u0089Þ^<¹\u001dfC·\\9\u00104\u001d2Ð8åãO$6Úsf\u0085a\b\u0010R¤VVÅóñ3Ä,MUí\u0087\u00079\u0010\r\u0004ï'¹÷|\u0002\u0007ÖÎ¼\u000eÞ¯Ô\u00183\u0081æÇÓ*¤\u009a\u0016Ó\\\u0017Õ·\u00066\u0006qiiC°J¶\u0018Ö4åþé\u008aê°9ô©Ü¸\u0001E\u0016\u0081Al\u009c\u0019q÷¡\u0010Ìj\u0010ën0ÃÎ¡¼Õÿ¡üÁ~ \u0017¨\u00883v¬!'\u0082\u009f:+\u001b)n\t\u001a\u0012&;3ý\u0093øY\u008f!\\ör\u0091)8\\Ü³ÿ²fÑÝ4Ô\u008dk\b\u0017Ð0\u008bù{D\u001bB®\u008e´*\rGË\u0014®*3\u0096#\nJë8't9\r\u0002\nþdµ¼¿4ÝÍm_®\u0018»²Û\"¨C4Ó=\u0087d0\u0007u\u0016\u001fåÕÅù\u0007\u008f¯\" Ö\u009dî\u001c^\u001cfýþøJå\u0098\u008f\u000e·É*@üÕXæ\u0002yÝ³\u0097¢ %9 Jòù\u008bQr\u0016Ø\u0098\u0016QÆ\u009f¦]øP¢q\u001dÀò\u0091ÎÚê\u008c\u007fDÌM4\u0018¤¶pu!Å\u0092p\u008eÔÎ\u0098ö×ß\u00106P#?eQ¦& ÊñU\u0085áF\\\u0093\u0089ØOø\u0084Á.(å\"¨\u0091Á¹ì\u008bþÈÝJ\u0096\u0012 ï\u0010\u0012¨\u0017m³`\f\u0015s;\u0092\u0003¦z\u001aC ûÚæ\u0082¥þv¶æ\u0001**à\u0085\u0000\u009bÝ\u0019x¼æù\u0099oso\"\u0083×\u00adÍé \u0083GjºKbÿé-¤ú\u0084\u0090ù\u0084{ÓÝ\u0094o\b\n\u00050éZ`fs¯\u0019\u0011\u0010\u0088uvÇ\u0080]¸Z\u009cÇ°\u0089\u000f$öÀ@\u0095P±×a\u0006©´ü-'ë\u000b\u008bõÙâ_XW\u0015O-úÈg¶6r\u008c<\u000fCà\u009aøD@\u008fû]s\u0014N\u0091.\u0003vÂ\u0082þüø4õF|2¬ÕlJV- !¨°\u0080\u0082U£\u00968åë¼ãàøYÉ\u009e»]ÌÊ\u0084âÁ\u007f7¦¨\u001cØð";
      int var7 = "ÚçÞç\u0015\u0095½dcÄv\u009a]/\u008aÏ\u009aW\u0095j'Wö\u0006ZDBõ\u0083\\ý\u0095 ü\u009bdª:Í\u001còJ\u0080\u000f°p}l\u0003§U\u0001+\u009cm/±±$&wÂ¬ôä Å\u0099\fE\u009cs®u\u008eùÙi\u0085ÄÂ\u0084ë%Ê\u0018±ve\u007f\u008ebÂ +þS\n\u0010Bí\u008b\u0013Ô3\u0089Ks!¡RäèÛ)8d°CG\b#\u0002\u0085È\u0098»\u0012\u008cÛ/\u0014Üô \b$/Õ\u0092\u008e\u0086÷Ò\u009e·Í¬¢\u0089@`\u0016'Ûä \u0004IßeÇb\nÿþSÎäS¿\u0005  o0ð\u0015\u007f[ò\u0002'>xHH\u008bÂ÷]þ\u001b\u001c½\u0014\u0083üÑÒ6\n\u0013©\u00118àýc\"#\u0083\u0088´ä\u00ad\u008dòß\u0085\u009d\u0086¼\u009e\u0012æ}ºa\u0011\u001bè\u0087Óà\u0088¦..ÁY^\u008f\nO^¾õºö\u0088æ©¡8ã\r$¬\u009b)¨(-ë\u0088¨ÆDhÜSænpC³\u0092Þ\u001f\u000e]Zo§0z>èÊ\u0016\\ì6«çqÅë\u0003\u0096.ý \u0001õ\u0000\tNO;@Å\u009e\u0017\u0081\\\u0010^\u008eX;ï\u0010\u008e ©\u008eÆV^\u008e\\´EÂ\u0010\u0097\u009e,È\u0001\u0000AíD_\u00027E½µå(F\u0002WÛbipa>dH¨Rý\u0092¡ãM\u0013ÜÈ\u0000;=Îô\u0010AB÷fDq¨ùØSi4q8\n@\u001a<ï(®\u009fj\u0014æ.áÃ9\u0013V¥\u00107\u0017?\u0001£âfpý\u001cë`ÊóY|B\u007fh²\u007fV\u0011ÑsTd\u008e?Ì\u009bÊ#\u001aß\u0081\u008d\u0010^ã´\"æ×\u0010¬\u0018JcãÅ\u0097'\u0084 \u0005\u0080ý\u0015r\t j³\u009a\u0007\u009b~!V\f¢(Þ&)úX\r¾a\u0014\u007f\u0010\u0089(\u008e \u0082ÛF~ve\tãK}\u0096Ï¸\u0096ï\u0095¹æí=öáÕ\"Ð£\u0013Y\u0005qS¡\u0018\u00adù\u0081ê°C£ú\u001e\u0083ùD¢\u0089Þ^<¹\u001dfC·\\9\u00104\u001d2Ð8åãO$6Úsf\u0085a\b\u0010R¤VVÅóñ3Ä,MUí\u0087\u00079\u0010\r\u0004ï'¹÷|\u0002\u0007ÖÎ¼\u000eÞ¯Ô\u00183\u0081æÇÓ*¤\u009a\u0016Ó\\\u0017Õ·\u00066\u0006qiiC°J¶\u0018Ö4åþé\u008aê°9ô©Ü¸\u0001E\u0016\u0081Al\u009c\u0019q÷¡\u0010Ìj\u0010ën0ÃÎ¡¼Õÿ¡üÁ~ \u0017¨\u00883v¬!'\u0082\u009f:+\u001b)n\t\u001a\u0012&;3ý\u0093øY\u008f!\\ör\u0091)8\\Ü³ÿ²fÑÝ4Ô\u008dk\b\u0017Ð0\u008bù{D\u001bB®\u008e´*\rGË\u0014®*3\u0096#\nJë8't9\r\u0002\nþdµ¼¿4ÝÍm_®\u0018»²Û\"¨C4Ó=\u0087d0\u0007u\u0016\u001fåÕÅù\u0007\u008f¯\" Ö\u009dî\u001c^\u001cfýþøJå\u0098\u008f\u000e·É*@üÕXæ\u0002yÝ³\u0097¢ %9 Jòù\u008bQr\u0016Ø\u0098\u0016QÆ\u009f¦]øP¢q\u001dÀò\u0091ÎÚê\u008c\u007fDÌM4\u0018¤¶pu!Å\u0092p\u008eÔÎ\u0098ö×ß\u00106P#?eQ¦& ÊñU\u0085áF\\\u0093\u0089ØOø\u0084Á.(å\"¨\u0091Á¹ì\u008bþÈÝJ\u0096\u0012 ï\u0010\u0012¨\u0017m³`\f\u0015s;\u0092\u0003¦z\u001aC ûÚæ\u0082¥þv¶æ\u0001**à\u0085\u0000\u009bÝ\u0019x¼æù\u0099oso\"\u0083×\u00adÍé \u0083GjºKbÿé-¤ú\u0084\u0090ù\u0084{ÓÝ\u0094o\b\n\u00050éZ`fs¯\u0019\u0011\u0010\u0088uvÇ\u0080]¸Z\u009cÇ°\u0089\u000f$öÀ@\u0095P±×a\u0006©´ü-'ë\u000b\u008bõÙâ_XW\u0015O-úÈg¶6r\u008c<\u000fCà\u009aøD@\u008fû]s\u0014N\u0091.\u0003vÂ\u0082þüø4õF|2¬ÕlJV- !¨°\u0080\u0082U£\u00968åë¼ãàøYÉ\u009e»]ÌÊ\u0084âÁ\u007f7¦¨\u001cØð"
         .length();
      char var8 = ' ';
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
                     CONST_B_2 = var4;
                     CONST_C = new String[37];
                     CONST_G = new HashMap(13);
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
                     String var15 = "8ÍLFYUg\u001c\u0085&S\u0016$Ý\u0092\u0082&×H? \u0011\"t§0¯{óÉ»\u000eÞ\b\u0095é3¼Ú;J,\u009aÖRwÝ0:\u0018\u0006\u008c¦à½¶\u0095p+\u0015\u0084âN\u008f¾ò\u009diÓ\u00adn\u008aE=\u0087ýÉ\\TÀí\tâ³^ïÏð";
                     int var16 = "8ÍLFYUg\u001c\u0085&S\u0016$Ý\u0092\u0082&×H? \u0011\"t§0¯{óÉ»\u000eÞ\b\u0095é3¼Ú;J,\u009aÖRwÝ0:\u0018\u0006\u008c¦à½¶\u0095p+\u0015\u0084âN\u008f¾ò\u009diÓ\u00adn\u008aE=\u0087ýÉ\\TÀí\tâ³^ïÏð"
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
                                    CONST_E = var13;
                                    CONST_F = new Integer[13];
                                    CONST_A = ((String)null);
                                    CONST_B = ((String)null);
                                    fieldInt_m = -1;
                                    fieldInt_n = -1;
                                    fieldInt_o = -1;
                                    fieldInt_r = -1;
                                    fieldInt_s = -1;
                                    fieldInt_t = -1;
                                    fieldInt_u = -1;
                                    fieldInt_x = -1;
                                    fieldInt_y = -1;
                                    fieldInt_z = -1;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "í?9]#\u009ci\u0004¸\u0005Ì\u008b«ìü¸";
                                 var16 = "í?9]#\u009ci\u0004¸\u0005Ì\u008b«ìü¸".length();
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

                  var6 = "\r\u008f½øäc>mÏ¥BLsô¤v\u0018q0`Ý\u008f¬9\u0098ßo\u0014<à-[®ÉVA\u0083^ ¢{";
                  var7 = "\r\u008f½øäc>mÏ¥BLsô¤v\u0018q0`Ý\u008f¬9\u0098ßo\u0014<à-[®ÉVA\u0083^ ¢{".length();
                  var8 = 16;
                  var23 = -1;
            }

            var25 = var6.substring(++var23, var23 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22657;
      if (CONST_C[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/fF", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B_2[var3].getBytes("ISO-8859-1");
         CONST_C[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C[var3];
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
         throw new RuntimeException("rip/breeze/client/fF" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24663;
      if (CONST_F[var3] == null) {
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
         long var5 = CONST_E[var3];
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
         Object[] var9 = (Object[])CONST_G.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_G.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/fF", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_F[var3] = var15;
      }

      return CONST_F[var3];
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
         throw new RuntimeException("rip/breeze/client/fF" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
