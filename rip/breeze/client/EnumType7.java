package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

enum EnumType7 {
   CHESTS,
   ENDER_CHESTS,
   HOPPERS,
   DROPPERS,
   FURNACES,
   DISPENSERS;

   private static final EnumType7[] CONST_A;

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = StringDecryptor.getIBreezeInterface3(1441585882028254487L, -7752498968330777650L, MethodHandles.lookup().lookupClass())
            .decryptKey(193520177922820L)
         ^ 129952621827903L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "Å`U\u001f\u0089\u0015ª:¬\u0013\\*!*Í\u0087\b\u0007øí\b»cN\u0096\u0010ò\u008c\u0092y×pDÍï\u0019\u008eÚÓ\u008c>\u009a\b\u0086ðÐ\u0094\u000fïqZ";
      int var7 = "Å`U\u001f\u0089\u0015ª:¬\u0013\\*!*Í\u0087\b\u0007øí\b»cN\u0096\u0010ò\u008c\u0092y×pDÍï\u0019\u008eÚÓ\u008c>\u009a\b\u0086ðÐ\u0094\u000fïqZ"
         .length();
      char var8 = 16;
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
                     CHESTS = new EnumType7();
                     ENDER_CHESTS = new EnumType7();
                     HOPPERS = new EnumType7();
                     DROPPERS = new EnumType7();
                     FURNACES = new EnumType7();
                     DISPENSERS = new EnumType7();
                     CONST_A = new EnumType7[]{CHESTS, ENDER_CHESTS, HOPPERS, DROPPERS, FURNACES, DISPENSERS};
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

                  var6 = "2ýEK_5\u0090\u0085S)\u0016y¢?uþ\u0010\u008aüBy\u001c{±\u0086:\u0095P«çBÊ\u0017";
                  var7 = "2ýEK_5\u0090\u0085S)\u0016y¢?uþ\u0010\u008aüBy\u001c{±\u0086:\u0095P«çBÊ\u0017".length();
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
