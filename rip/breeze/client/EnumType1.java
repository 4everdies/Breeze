package rip.breeze.client;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

public enum EnumType1 {
   BEGIN_ARRAY,
   END_ARRAY,
   BEGIN_OBJECT,
   END_OBJECT,
   NAME,
   STRING,
   NUMBER,
   BOOLEAN,
   NULL,
   END_DOCUMENT;

   private static String[] arr_b;

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = StringDecryptor.getIBreezeInterface3(5258155929683462986L, 8394826915704146588L, null).decryptKey(172810955007070L) ^ 31798230380288L;
      if (getNames() == null) {
         initialize(new String[1]);
      }

      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[10];
      int var5 = 0;
      String var6 = "z\u0096=\u007fº!»f1®§~\u0014¥-Ö\bIx~ìáòÀB\bI@ú'þÔm@\u0010\u0087mÆevNC¾£ï\u0090³C\u001fÉ\u0005\b\t.\u008e\u0016Ìn\u0091ù\u0010£»í³$\u0000;Ûy$\u0019ÕÑ«\u0001{\u0010\u000eÍ\u001c®GÈ·P2#B`Õ\u001c6\b\b2\u000fZ3\u0099\u009c µ";
      int var7 = "z\u0096=\u007fº!»f1®§~\u0014¥-Ö\bIx~ìáòÀB\bI@ú'þÔm@\u0010\u0087mÆevNC¾£ï\u0090³C\u001fÉ\u0005\b\t.\u008e\u0016Ìn\u0091ù\u0010£»í³$\u0000;Ûy$\u0019ÕÑ«\u0001{\u0010\u000eÍ\u001c®GÈ·P2#B`Õ\u001c6\b\b2\u000fZ3\u0099\u009c µ"
         .length();
      char var8 = 16;
      int var12 = -1;

      label32:
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
                     BEGIN_ARRAY = new EnumType1();
                     END_ARRAY = new EnumType1();
                     BEGIN_OBJECT = new EnumType1();
                     END_OBJECT = new EnumType1();
                     NAME = new EnumType1();
                     STRING = new EnumType1();
                     NUMBER = new EnumType1();
                     BOOLEAN = new EnumType1();
                     NULL = new EnumType1();
                     END_DOCUMENT = new EnumType1();
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label32;
                  }

                  var6 = "\u001a\u0099£$Ï:Ú\u0094\u0010Å.³øj\u001cWyÄ/\bþ\u0007Æ\u0084\u0002";
                  var7 = "\u001a\u0099£$Ï:Ú\u0094\u0010Å.³øj\u001cWyÄ/\bþ\u0007Æ\u0084\u0002".length();
                  var8 = '\b';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(String[] var0) {
      arr_b = var0;
   }

   public static String[] getNames() {
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
