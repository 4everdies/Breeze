package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

enum RenderUtil20_x {
   ALL,
   BLOCKS,
   THROWABLES,
   EXP_BOTTLES,
   FIST;

   private static final RenderUtil20_x[] CONST_A;

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = StringDecryptor.getIBreezeInterface3(-7006906138055374364L, -9088553355097764256L, MethodHandles.lookup().lookupClass())
            .decryptKey(100248612056086L)
         ^ 2218902148491L;
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
      String var6 = "{\u001aZÝ\u0098bÈ5n`Å\u0018.GÐ5\bè]Vv\u0019X\u008cG\u0010\u001bE\u000e×\u009f0Ä¤ádÝ÷À\u009a£¤";
      int var7 = "{\u001aZÝ\u0098bÈ5n`Å\u0018.GÐ5\bè]Vv\u0019X\u008cG\u0010\u001bE\u000e×\u009f0Ä¤ádÝ÷À\u009a£¤".length();
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
                     ALL = new RenderUtil20_x();
                     BLOCKS = new RenderUtil20_x();
                     THROWABLES = new RenderUtil20_x();
                     EXP_BOTTLES = new RenderUtil20_x();
                     FIST = new RenderUtil20_x();
                     CONST_A = new RenderUtil20_x[]{ALL, BLOCKS, THROWABLES, EXP_BOTTLES, FIST};
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

                  var6 = "s\t\u0088Àè)È6\bÉ\u0015\r£ú\u007f\u001e\u0094";
                  var7 = "s\t\u0088Àè)È6\bÉ\u0015\r£ú\u007f\u001e\u0094".length();
                  var8 = '\b';
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
