package rip.breeze;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum UserRole {
   REGULAR,
   PLUS,
   MEDIA,
   PARTNER,
   DEVELOPER,
   OWNER;

   public final String name;
   public final Color color;
   public final int val;
   private static int[] arr_b;

   UserRole(String var3, Color var4, int var5) {
      this.name = var3;
      this.color = var4;
      this.val = var5;
   }

   public static UserRole getUserRole(String var0) {
      long var1 = 92699563751447L;
      UserRole[] var3 = values();
      int[] var10000 = RenderUtil19_x.values();
      int var4 = var3.length;
      int[] var5 = var10000;
      int var6 = 0;

      while (var6 < var4) {
         UserRole var7 = var3[var6];
         if (var7.name.equalsIgnoreCase(var0)) {
            return var7;
         }

         var6++;
         if (var5 != null) {
            break;
         }
      }

      return REGULAR;
   }

   public static UserRole getUserRole_2(int var0) {
      long var1 = 77588374678009L;
      int[] var10000 = RenderUtil19_x.values();
      UserRole[] var3 = values();
      int[] var4 = var10000;

      for (UserRole var7 : var3) {
         if (var7.val == var0) {
            return var7;
         }

         if (var4 != null) {
            break;
         }
      }

      return REGULAR;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = 62887694041024L;
      if (values() == null) {
         initialize(new int[4]);
      }

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
      String var6 = "\u0083g~\u000e\u008a4ðË5Àömí-¶¬\bk_ÔÕH\u0016xâ\bD\u001e?'&\u001fu\u0011\bJ°\u0083VËÿüß\b|\u0001\u0094\u008c\u009e\u0006ân\bÕH\u009fÌë\u00890#\bïg\u008aÖ\u008fÿü\u0011\b\u0098\u001c\u008f\"Ý\u0006\u0010h\b¥\u0091\u000e³s²Þ\u0087\b I\"~öHy ";
      int var7 = "\u0083g~\u000e\u008a4ðË5Àömí-¶¬\bk_ÔÕH\u0016xâ\bD\u001e?'&\u001fu\u0011\bJ°\u0083VËÿüß\b|\u0001\u0094\u008c\u009e\u0006ân\bÕH\u009fÌë\u00890#\bïg\u008aÖ\u008fÿü\u0011\b\u0098\u001c\u008f\"Ý\u0006\u0010h\b¥\u0091\u000e³s²Þ\u0087\b I\"~öHy "
         .length();
      char var8 = 16;
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
                     long[] var13 = new long[6];
                     int var14 = 0;
                     String var15 = "NÛ©éemèVk'Ö3SM\u0092\fb\u0010côâ·ÀöG\u0005ÄÚ\u0080ø\nß";
                     int var16 = "NÛ©éemèVk'Ö3SM\u0092\fb\u0010côâ·ÀöG\u0005ÄÚ\u0080ø\nß".length();
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
                                    REGULAR = new UserRole(var4[2], new Color((int)var13[3]), 1);
                                    PLUS = new UserRole(var4[9], new Color((int)var13[2]), 5);
                                    MEDIA = new UserRole(var4[10], new Color((int)var13[4]), 10);
                                    PARTNER = new UserRole(var4[6], new Color((int)var13[5]), 15);
                                    DEVELOPER = new UserRole(var4[11], new Color((int)var13[0]), 20);
                                    OWNER = new UserRole(var4[1], new Color((int)var13[1]), 25);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label41;
                                 }

                                 var15 = "O)#¼øÁ\u0006ÂÂcç\bßÒ@\u0080";
                                 var16 = "O)#¼øÁ\u0006ÂÂcç\bßÒ@\u0080".length();
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

                  var6 = "\u009a\u0099P@¢C°\u0005\b]\u00889ÿ¤Ð\u0014Q";
                  var7 = "\u009a\u0099P@¢C°\u0005\b]\u00889ÿ¤Ð\u0014Q".length();
                  var8 = '\b';
                  var23 = -1;
            }

            var25 = var6.substring(++var23, var23 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(int[] var0) {
      arr_b = var0;
   }

   public static int[] values() {
      return arr_b;
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
