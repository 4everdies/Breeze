package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.GL11;
import rip.breeze.StringDecryptor;

public class RenderUtil27 {
   private Framebuffer framebuffer_a;
   private final FontManager fontManager_b;
   private static final String[] CONST_D;
   private static final String[] CONST_E;
   private static final Map CONST_F = new HashMap(13);
   private static final long[] CONST_G;
   private static final Integer[] CONST_H;
   private static final Map CONST_I;

   public RenderUtil27() {
      long var1 = 10949605290138L;
      super();
      this.framebuffer_a = new Framebuffer(BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight, true);
      short var10003 = 15226;
      long var10004 = 4965474901522711745L ^ var1;
      this.fontManager_b = new FontManager("outline.frag");
   }

   public void clamp(int var1, int var2, Framebuffer var3, Color var4) {
      long var5 = 82088973542732L;
      if (var3 != null) {
         int[] var7 = FontManager.values();
         this.render();
         this.render_1(this.framebuffer_a);
         this.render_1(var3);
         this.framebuffer_a.bindFramebuffer(true);
         GlStateManager.clearColor(0.0F, 0.0F, 0.0F, 0.0F);
         GL11.glClear(16640);
         this.fontManager_b.initialize();
         this.fontManager_b.drawString("u_diffuse_sampler", 0);
         this.fontManager_b
            .drawString(
               "u_texel_size", 1.0F / BreezeClient.CONST_A.displayWidth, 1.0F / BreezeClient.CONST_A.displayHeight
            );
         this.fontManager_b.drawString("u_radius", Math.max(1, var1));
         this.fontManager_b.drawString("u_alpha", var2 / 255.0F);
         if (var4 == null) {
            this.fontManager_b.drawString("colored", 0);
         } else {
            this.fontManager_b.drawString("colored", 1);
            this.fontManager_b
               .drawString("color", var4.getRed() / 255.0F, var4.getGreen() / 255.0F, var4.getBlue() / 255.0F);
         }

         GlStateManager.disableDepth();
         GlStateManager.depthMask(false);
         GlStateManager.enableBlend();
         GlStateManager.blendFunc(1, 770);
         GlStateManager.enableAlpha();
         GlStateManager.alphaFunc(516, 0.0F);
         this.fontManager_b.calculate_2(var3);
         this.fontManager_b.bind();
         FontManager.render(var7);
         GlStateManager.blendFunc(770, 771);
         this.framebuffer_a.framebufferRenderExt(BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight, false);
         GlStateManager.alphaFunc(516, 0.1F);
         GlStateManager.depthMask(true);
         GlStateManager.enableDepth();
         GlStateManager.disableBlend();
      }
   }

   public void render() {
      if (BreezeClient.CONST_A.displayWidth != this.framebuffer_a.framebufferWidth
         || BreezeClient.CONST_A.displayHeight != this.framebuffer_a.framebufferHeight) {
         this.framebuffer_a.deleteFramebuffer();
         this.framebuffer_a = new Framebuffer(BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight, true);
      }

      this.framebuffer_a.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public void initialize() {
      this.framebuffer_a.deleteFramebuffer();
   }

   private void render_1(Framebuffer var1) {
      long var2 = 12298708788297L;
      GlStateManager.bindTexture(var1.framebufferTexture);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 33071);
      GL11.glTexParameteri(3553, 10243, -1397806479);
      GlStateManager.bindTexture(0);
   }

   static {
      long var0 = 62831329036203L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[8];
      int var5 = 0;
      String var6 = "!\\TR<sTrMWO¹ÀÁWÚ\u0010g\u0014\u0018\u0099\u009eìS¼O¬\u009fdÎ^å\u0083(ÒÖ°\u0083©\r\u009c>%©¡\u0004\u0094¤xM\u0080/ß/ç£Ín\u0095²Ü=M\u0083HÈÀ\u001câÔ7=Hk a@<ÝÎ\u0091?S°õÂ\u0010;\u008c|-\u0084\u0096¦£\u0004áý1d+`©[º\u0017\u0093\u0018Ò\u0099\u0084PZ&áî&?Ë\u008dí¥P EÊæÜ¯mk· /\u008cY\u0007üòÒ¼´:\u009bE\u008b¿SÇ\u0014N\t\u0099ètXàÕx$¹¥M£ì";
      int var7 = "!\\TR<sTrMWO¹ÀÁWÚ\u0010g\u0014\u0018\u0099\u009eìS¼O¬\u009fdÎ^å\u0083(ÒÖ°\u0083©\r\u009c>%©¡\u0004\u0094¤xM\u0080/ß/ç£Ín\u0095²Ü=M\u0083HÈÀ\u001câÔ7=Hk a@<ÝÎ\u0091?S°õÂ\u0010;\u008c|-\u0084\u0096¦£\u0004áý1d+`©[º\u0017\u0093\u0018Ò\u0099\u0084PZ&áî&?Ë\u008dí¥P EÊæÜ¯mk· /\u008cY\u0007üòÒ¼´:\u009bE\u008b¿SÇ\u0014N\t\u0099ètXàÕx$¹¥M£ì"
         .length();
      char var8 = 16;
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
                     CONST_E = new String[8];
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
                     String var15 = "\u00122\u009d-¡õ\u0081=sÜÖx\u008cÅ\u008cm";
                     int var16 = "\u00122\u009d-¡õ\u0081=sÜÖx\u008cÅ\u008cm".length();
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

                  var6 = "±\u0082¯JU\u0004Ëõa\u0013Û%Ýv\u0091\u001b\u0010±\\V@Ê\u00037ø\u009dnûZ\u009aþ\u00844";
                  var7 = "±\u0082¯JU\u0004Ëõa\u0013Û%Ýv\u0091\u001b\u0010±\\V@Ê\u00037ø\u009dnûZ\u009aþ\u00844".length();
                  var8 = 16;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20258;
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
            throw new RuntimeException("rip/breeze/client/fH", var10);
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
         throw new RuntimeException("rip/breeze/client/fH" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31785;
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
            throw new RuntimeException("rip/breeze/client/fH", var14);
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
         throw new RuntimeException("rip/breeze/client/fH" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
