package rip.breeze;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class RenderUtil1 {
   private static String[] arr_b;
   private static final long cipher_key_1;

   public static Color getColor(String var0) {
      long var1 = 110819248881358L;
      String[] var10000 = decrypt();
      int var3 = 0;
      String[] var4 = var10000;
      int var5 = 1;
      byte[] var6 = var0.getBytes();
      int var7 = var6.length;
      int var8 = 0;

      while (var8 < var7) {
         Byte var9 = var6[var8];
         var3 += var9 * ++var5;
         var8++;
         if (var4 != null) {
            LicenseState.toggle(LicenseState.isValid_2());
            break;
         }
      }

      Random var10 = new Random(var3);
      var7 = var10.nextInt(200) + 55;
      var8 = var10.nextInt(200) + 55;
      int var13 = var10.nextInt(200) + 55;
      return new Color(var7, var8, var13);
   }

   public static float getFloat(Color var0) {
      return Color.RGBtoHSB(var0.getRed(), var0.getGreen(), var0.getBlue(), null)[0];
   }

   public static float getFloat_2(Color var0) {
      return Color.RGBtoHSB(var0.getRed(), var0.getGreen(), var0.getBlue(), null)[1];
   }

   public static float getFloat_3(Color var0) {
      return Color.RGBtoHSB(var0.getRed(), var0.getGreen(), var0.getBlue(), null)[2];
   }

   public static Color clamp(Color var0, Color var1, float var2) {
      long var3 = 108931846449945L;
      var2 = Math.max(0.0F, Math.min(var2, 1.0F));
      if (var2 == 0.0F) {
         return var0;
      }

      if (var2 == 1.0F) {
         return var1;
      }

      float var5 = 1.0F - var2;
      float var6 = var1.getRed() * var2 + var0.getRed() * var5;
      float var7 = var1.getGreen() * var2 + var0.getGreen() * var5;
      float var8 = var1.getBlue() * var2 + var0.getBlue() * var5;
      float var9 = var1.getAlpha() * var2 + var0.getAlpha() * var5;
      return new Color(var6 / 255.0F, var7 / 255.0F, var8 / 255.0F, var9 / 255.0F);
   }

   public static Color getColor_2(Color var0, Color var1) {
      long var2 = 6976884093490L;
      float var4 = (float)(System.currentTimeMillis() % /*CIPHER_KEY_c*/ 0L / 1000.0);
      float var5 = (float)(Math.sin(var4 * Math.PI * 2.0) * 0.5 + 0.5);
      return clamp(var0, var1, var5);
   }

   @KeepParameters
   public static Color getColor_3(float var0, float var1, float var2) {
      return new Color(Color.getHSBColor(var0, var1, var2).getRGB());
   }

   public static int calculate(int var0, int var1, int var2, int var3) {
      return (var0 << 16) + (var1 << 8) + var2 + (var3 << 24);
   }

   public static Color getColor_4(Color var0, float var1) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), (int)(var0.getAlpha() * var1));
   }

   public static Color getColor_5(float var0) {
      return clamp(new Color(236, 6, 6, 255), new Color(11, 245, 3, 255), var0);
   }

   public static Color getColor_6(int var0) {
      return new Color[]{new Color(190, 100, 51, 255), new Color(70, 161, 67, 255), new Color(215, 200, 153, 255)}[var0 + 1];
   }

   public static Color getColor_7(Color var0, int var1) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), var1);
   }

   public static Color getColor_8(Color var0, int var1, float var2) {
      long var3 = 92633656410668L;
      decrypt();
      float[] var5 = var0.getRGBColorComponents(null);
      float[] var7 = Color.RGBtoHSB((int)(var5[0] * 255.0F), (int)(var5[1] * 255.0F), (int)(var5[2] * 255.0F), null);
      var7[var1] = var2;
      int var8 = Color.HSBtoRGB(var7[0], var7[1], var7[2]);
      Color var10000 = new Color(var8);
      if (LicenseState.checkCondition()) {
         initialize(new String[5]);
      }

      return var10000;
   }

   public static Color getColor_9(Color var0) {
      float[] var1 = Color.RGBtoHSB(var0.getRed(), var0.getGreen(), var0.getBlue(), null);
      var1[1] = 1.0F;
      return Color.getHSBColor(var1[0], var1[1], var1[2]);
   }

   public static Color getColor_10(Color var0) {
      float[] var1 = Color.RGBtoHSB(var0.getRed(), var0.getGreen(), var0.getBlue(), null);
      var1[1] = 0.0F;
      return Color.getHSBColor(var1[0], var1[1], var1[2]);
   }

   public static float calculateFloat(float var0, float var1, float var2) {
      long var3 = 38643051766546L;
      if (var2 < 0.0F) {
         var2++;
      }

      if (var2 > 1.0F) {
         var2--;
      }

      if (var2 < 0.16666667F) {
         return var0 + (var1 - var0) * 6.0F * var2;
      } else if (var2 < 0.5F) {
         return var1;
      } else {
         return var2 < 0.6666667F ? var0 + (var1 - var0) * (0.6666667F - var2) * 6.0F : var0;
      }
   }

   public static void initialize(String[] var0) {
      arr_b = var0;
   }

   public static String[] decrypt() {
      return arr_b;
   }

   static {
      long var0 = 37695336444686L;
      initialize(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -544929819923674698L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)(var4 >>> 56),
            (byte)(var4 >>> 48),
            (byte)(var4 >>> 40),
            (byte)(var4 >>> 32),
            (byte)(var4 >>> 24),
            (byte)(var4 >>> 16),
            (byte)(var4 >>> 8),
            (byte)var4
         }
      );
      long var7 = (var6[0] & 255L) << 56
         | (var6[1] & 255L) << 48
         | (var6[2] & 255L) << 40
         | (var6[3] & 255L) << 32
         | (var6[4] & 255L) << 24
         | (var6[5] & 255L) << 16
         | (var6[6] & 255L) << 8
         | var6[7] & 255L;
      byte var10001 = -1;
      /*CIPHER_KEY_c*/ 0L = var7;
   }
}
