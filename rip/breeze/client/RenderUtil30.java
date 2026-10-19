package rip.breeze.client;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.BufferUtils;
import org.lwjgl.nanovg.NSVGImage;
import org.lwjgl.nanovg.NanoSVG;
import org.lwjgl.opengl.GL11;
import rip.breeze.StringDecryptor;

public final class RenderUtil30 {
   public final int fieldInt_a;
   public final int fieldInt_b;
   public final int fieldInt_c;
   private static final int CONST_D;
   private static final String[] CONST_F;
   private static final String[] CONST_G;
   private static final Map CONST_H = new HashMap(13);
   private static final long[] CONST_I;
   private static final Integer[] CONST_J;
   private static final Map CONST_K;

   private RenderUtil30(int var1, int var2, int var3) {
      this.fieldInt_a = var1;
      this.fieldInt_b = var2;
      this.fieldInt_c = var3;
   }

   static RenderUtil30 getDataBuilder43(int var0, int var1, int var2) {
      return new RenderUtil30(var0, var1, var2);
   }

   public static RenderUtil30 getDataBuilder43_2(BufferedImage var0) {
      int var1 = var0.getWidth();
      int var2 = var0.getHeight();
      int[] var3 = new int[var1 * var2];
      var0.getRGB(0, 0, var1, var2, var3, 0, var1);
      ByteBuffer var4 = BufferUtils.createByteBuffer(var1 * var2 * 4);

      for (int var8 : var3) {
         var4.put((byte)(var8 >> 16 & 0xFF));
         var4.put((byte)(var8 >> 8 & 0xFF));
         var4.put((byte)(var8 & 0xFF));
         var4.put((byte)(var8 >> 24 & 0xFF));
      }

      ((Buffer)var4).flip();
      int var9 = getValue(var1, var2, var4);
      return new RenderUtil30(var9, var1, var2);
   }

   public static RenderUtil30 getDataBuilder43_3(String var0) {
      long var1 = 56251823122732L;

      try {
         InputStream var3 = RenderUtil30.class.getResourceAsStream("/assets/breeze/textures/" + var0);
         BufferedImage var4 = ImageIO.read(var3);

         try {
            if (var4 == null) {
               throw new IOException("ImageIO returned null for:" + var0);
            }
         } catch (IOException var5) {
            throw getIOException(var5);
         }

         return getDataBuilder43_2(var4);
      } catch (IOException var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public static RenderUtil30 clamp(String var0, float var1) {
      try {
         NSVGImage var2 = getNSVGImage(encodeString(var0), var0);
         int var3 = Math.max(1, Math.round(var2.width() * var1));
         int var4 = Math.max(1, Math.round(var2.height() * var1));
         long var5 = NanoSVG.nsvgCreateRasterizer();
         ByteBuffer var7 = BufferUtils.createByteBuffer(var3 * var4 * 4);
         NanoSVG.nsvgRasterize(var5, var2, 0.0F, 0.0F, var1, var7, var3, var4, var3 * 4);
         NanoSVG.nsvgDeleteRasterizer(var5);
         NanoSVG.nsvgDelete(var2);
         int var8 = getValue(var3, var4, var7);
         return new RenderUtil30(var8, var3, var4);
      } catch (IOException var9) {
         var9.printStackTrace();
         return null;
      }
   }

   public static RenderUtil30 clamp_2(byte[] var0, String var1, float var2, int var3) throws IOException {
      int var4 = Math.max(1, var3);
      int var5 = var4 * 3;
      NSVGImage var6 = getNSVGImage(var0, var1);
      int var7 = Math.max(1, Math.round(var6.width() * var2)) + var5 * 2;
      int var8 = Math.max(1, Math.round(var6.height() * var2)) + var5 * 2;
      long var9 = NanoSVG.nsvgCreateRasterizer();
      ByteBuffer var11 = BufferUtils.createByteBuffer(var7 * var8 * 4);
      NanoSVG.nsvgRasterize(var9, var6, var5, var5, var2, var11, var7, var8, var7 * 4);
      NanoSVG.nsvgDeleteRasterizer(var9);
      NanoSVG.nsvgDelete(var6);
      int[] var12 = new int[var7 * var8];
      int var13 = 0;

      try {
         while (var13 < var7 * var8) {
            var12[var13] = var11.get(var13 * 4 + 3) & 255;
            var13++;
         }
      } catch (IOException var18) {
         throw getIOException(var18);
      }

      calculate(var12, var7, var8, var4);
      ByteBuffer var19 = BufferUtils.createByteBuffer(var7 * var8 * 4);

      for (int var17 : var12) {
         var19.put((byte)-1).put((byte)-1).put((byte)-1).put((byte)var17);
      }

      ((Buffer)var19).flip();
      return new RenderUtil30(getValue(var7, var8, var19), var7, var8);
   }

   public void initialize() {
      GL11.glDeleteTextures(this.fieldInt_a);
   }

   private static byte[] encodeString(String var0) throws IOException {
      ByteBuffer var1 = RenderUtil32.getByteBuffer_2(var0, 8192);
      byte[] var2 = new byte[var1.remaining()];
      var1.get(var2);
      return var2;
   }

   private static NSVGImage getNSVGImage(byte[] var0, String var1) throws IOException {
      long var2 = 86982639808949L;
      NSVGImage var4 = NanoSVG.nsvgParse(new String(var0, StandardCharsets.UTF_8), "px", 96.0F);

      try {
         if (var4 == null) {
            throw new IOException("nsvgParse failed for:" + var1);
         } else {
            return var4;
         }
      } catch (IOException var5) {
         throw getIOException(var5);
      }
   }

   static void calculate(int[] var0, int var1, int var2, int var3) {
      int[] var4 = new int[var1 * var2];

      for (int var5 = 0; var5 < 3; var5++) {
         for (int var6 = 0; var6 < var2; var6++) {
            for (int var7 = 0; var7 < var1; var7++) {
               int var8 = 0;
               int var9 = 0;

               for (int var10 = -var3; var10 <= var3; var10++) {
                  int var11 = var7 + var10;
                  if (var11 >= 0 && var11 < var1) {
                     var8 += var0[var6 * var1 + var11];
                     var9++;
                  }
               }

               var4[var6 * var1 + var7] = var8 / var9;
            }
         }

         for (int var12 = 0; var12 < var1; var12++) {
            for (int var13 = 0; var13 < var2; var13++) {
               int var14 = 0;
               int var15 = 0;

               for (int var16 = -var3; var16 <= var3; var16++) {
                  int var17 = var13 + var16;
                  if (var17 >= 0 && var17 < var2) {
                     var14 += var4[var17 * var1 + var12];
                     var15++;
                  }
               }

               var0[var13 * var1 + var12] = var14 / var15;
            }
         }
      }
   }

   private static int getValue(int var0, int var1, ByteBuffer var2) {
      long var3 = 39422680831559L;
      int var5 = GL11.glGenTextures();
      GL11.glBindTexture(3553, var5);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 33071);
      GL11.glTexParameteri(3553, 10243, 1126631741);
      GL11.glTexImage2D(3553, 0, 6408, var0, var1, 0, 6408, 5121, var2);
      GlStateManager.bindTexture(0);
      return var5;
   }

   static {
      long var0 = 31782386208289L;
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
      String var6 = "°ö=n(\u001då\u008e\u008d\u001bOª\u0001\u0093\u0095\u0086(Ék§ÒCLÕéÑÅr¼\u0000éb:W¤#\u001b\u0007¿\u0093/Ù$\u000fµö¯×hó\u0096Ä¼ë;¾6";
      int var7 = "°ö=n(\u001då\u008e\u008d\u001bOª\u0001\u0093\u0095\u0086(Ék§ÒCLÕéÑÅr¼\u0000éb:W¤#\u001b\u0007¿\u0093/Ù$\u000fµö¯×hó\u0096Ä¼ë;¾6".length();
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
                     CONST_F = var4;
                     CONST_G = new String[4];
                     CONST_K = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[3];
                     int var14 = 0;
                     String var15 = "Km¯ÙRþ1¢\u0011\nhFà\u0017\u0090\u0000\u0094ø¸T<\u001eJ\u0011";
                     int var16 = "Km¯ÙRþ1¢\u0011\nhFà\u0017\u0090\u0000\u0094ø¸T<\u001eJ\u0011".length();
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

                     CONST_I = var13;
                     CONST_J = new Integer[3];
                     CONST_D = ((String)null);
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

                  var6 = "º©\\Ý¡¡çüQ\u0091jOl\u0087Uq\n\u0099ON¢\u0016dqL=®\u0092¢Û\u00023\"\u008b© ò3-Ã\u009aÜ\u009d\u0093\u001f±áv1d¸Ï\u0001y\u001bR8z`Äj[\u0091¸Gñ\u001f/Öv+¡O\n>\u0095LÊ\"½³Ûc2evÉ\u0000ÎàËÆ¹¾\u009f¨²À\u0015\\\u0089á\u0085\rß\u0097M9\u0091n\u008fÔ#";
                  var7 = "º©\\Ý¡¡çüQ\u0091jOl\u0087Uq\n\u0099ON¢\u0016dqL=®\u0092¢Û\u00023\"\u008b© ò3-Ã\u009aÜ\u009d\u0093\u001f±áv1d¸Ï\u0001y\u001bR8z`Äj[\u0091¸Gñ\u001f/Öv+¡O\n>\u0095LÊ\"½³Ûc2evÉ\u0000ÎàËÆ¹¾\u009f¨²À\u0015\\\u0089á\u0085\rß\u0097M9\u0091n\u008fÔ#"
                     .length();
                  var8 = '8';
                  var23 = -1;
            }

            var24 = var6.substring(++var23, var23 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17174;
      if (CONST_G[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_H.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_H.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/fl", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_F[var3].getBytes("ISO-8859-1");
         CONST_G[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_G[var3];
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
         throw new RuntimeException("rip/breeze/client/fl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27942;
      if (CONST_J[var3] == null) {
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
         long var5 = CONST_I[var3];
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
         Object[] var9 = (Object[])CONST_K.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_K.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/fl", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_J[var3] = var15;
      }

      return CONST_J[var3];
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
         throw new RuntimeException("rip/breeze/client/fl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
