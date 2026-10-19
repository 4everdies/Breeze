package rip.breeze;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum RenderUtil19_x {
   CONFIG,
   THEME,
   SCRIPT,
   PROFILE;

   private final String string_a;
   private final String string_b;
   private final String string_c;
   private final Color color_d;
   private static int[] arr_f;

   RenderUtil19_x(String var3, String var4, String var5, Color var6) {
      this.string_a = var3;
      this.string_b = var4;
      this.string_c = var5;
      this.color_d = var6;
   }

   public String getString_b() {
      return this.string_b;
   }

   public String getString_a() {
      return this.string_a;
   }

   public String getString_c() {
      return this.string_c;
   }

   public Color getColor_d() {
      return this.color_d;
   }

   public static RenderUtil19_x getEnum4Val(String var0) {
      long var1 = 128289994879994L;
      int[] var10000 = values();
      RenderUtil19_x[] var3 = values();
      int[] var4 = var10000;

      for (RenderUtil19_x var7 : var3) {
         if (var7.getString_a().equalsIgnoreCase(var0)) {
            return var7;
         }

         if (var4 != null) {
            break;
         }
      }

      return null;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = 113261588819034L;
      if (values() != null) {
         initialize(new int[3]);
      }

      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[16];
      int var5 = 0;
      String var6 = "ö\u0002çò\u001c\u008cb·\u0010\u000e\"É3XU\u001få}\u009f\u0017\u0095\u0096\u0004Í~\bæh\u008d\u00924£+$\bboß9\u0096÷ö\u0084\bm\u001e+\u0092µÐ`*\b'\u0006sM;Gk¿\bö\u008d(\u0082¹I!Å\b~eÈ\u009c!O+f\bp\u001b7\u0012Õ)\bè\b8X\u009e\u001b°ÜïS\bm\u0083ñ[¤ùÁÇ\bm\u0085z)4@Fp\b\u0012Û å\u009fÞ?f\b÷2è@\u0083þ\u008a¥";
      int var7 = "ö\u0002çò\u001c\u008cb·\u0010\u000e\"É3XU\u001få}\u009f\u0017\u0095\u0096\u0004Í~\bæh\u008d\u00924£+$\bboß9\u0096÷ö\u0084\bm\u001e+\u0092µÐ`*\b'\u0006sM;Gk¿\bö\u008d(\u0082¹I!Å\b~eÈ\u009c!O+f\bp\u001b7\u0012Õ)\bè\b8X\u009e\u001b°ÜïS\bm\u0083ñ[¤ùÁÇ\bm\u0085z)4@Fp\b\u0012Û å\u009fÞ?f\b÷2è@\u0083þ\u008a¥"
         .length();
      char var8 = '\b';
      int var23 = -1;

      label59:
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
                     String var15 = "\u00876KKd\u0011º\u009fè`ð\u0018\u001f\u0082;â";
                     int var16 = "\u00876KKd\u0011º\u009fè`ð\u0018\u001f\u0082;â".length();
                     byte var17 = 0;

                     label41:
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
                                    CONFIG = new RenderUtil19_x(var4[13], var4[2], var4[3], new Color((int)var13[2]));
                                    THEME = new RenderUtil19_x(var4[12], var4[7], var4[5], new Color((int)var13[1]));
                                    SCRIPT = new RenderUtil19_x(var4[15], var4[8], var4[6], new Color((int)var13[3]));
                                    PROFILE = new RenderUtil19_x(var4[9], var4[10], var4[1], new Color((int)var13[0]));
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label41;
                                 }

                                 var15 = "<7-³Týs¾\u0081iãÊà¯ïÿ";
                                 var16 = "<7-³Týs¾\u0081iãÊà¯ïÿ".length();
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
                     continue label59;
                  }

                  var6 = "!\u008eÝ\u0089\u00ad¿jw\bjû\u0096ö±\u0092\u0082ñ";
                  var7 = "!\u008eÝ\u0089\u00ad¿jw\bjû\u0096ö±\u0092\u0082ñ".length();
                  var8 = '\b';
                  var23 = -1;
            }

            var25 = var6.substring(++var23, var23 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(int[] var0) {
      arr_f = var0;
   }

   public static int[] values() {
      return arr_f;
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
}
