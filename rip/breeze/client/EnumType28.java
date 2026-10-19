package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

enum EnumType28 {
   PRODUCT,
   PRODUCT_THIN,
   INGAME;

   final String string_a;
   private static final EnumType28[] CONST_B;

   EnumType28(String var3) {
      this.string_a = var3;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = StringDecryptor.getIBreezeInterface3(-3189509394240117698L, 2489735270741836649L, MethodHandles.lookup().lookupClass())
            .decryptKey(98850726239844L)
         ^ 24680008668559L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[5];
      int var5 = 0;
      String var6 = "È\u0083\u000b6$\u0001$*²Ø\u0091ÿ6\u009e\u008eW\u00930\u0011LAõ½{\bvÞb\u0091ê\u008e®\u0081\bof\u0010\u008c\f\u0081\u0018»";
      int var7 = "È\u0083\u000b6$\u0001$*²Ø\u0091ÿ6\u009e\u008eW\u00930\u0011LAõ½{\bvÞb\u0091ê\u008e®\u0081\bof\u0010\u008c\f\u0081\u0018»".length();
      char var8 = 24;
      int var12 = -1;

      label28:
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
                     PRODUCT = new EnumType28(var4[4]);
                     PRODUCT_THIN = new EnumType28(var4[0]);
                     INGAME = new EnumType28(null);
                     CONST_B = new EnumType28[]{PRODUCT, PRODUCT_THIN, INGAME};
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label28;
                  }

                  var6 = "t\u0095]iY[h\u0010J(åg\u008b5r+\u0018È\u0083\u000b6$\u0001$*;g\u0094ÄÀþ2W\u0016\u0015\u009dÔ\u0013¼\u0001Ì";
                  var7 = "t\u0095]iY[h\u0010J(åg\u008b5r+\u0018È\u0083\u000b6$\u0001$*;g\u0094ÄÀþ2W\u0016\u0015\u009dÔ\u0013¼\u0001Ì".length();
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
}
