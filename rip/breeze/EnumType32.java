package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum EnumType32 {
   SOURCE_SANS,
   SOURCE_SANS_BOLD,
   SOURCE_CODE_PRO;

   private final String string_a;
   private static final EnumType32[] CONST_B;
   private static int[] arr_c;

   EnumType32(String var3) {
      this.string_a = var3;
   }

   public String getString_a() {
      return this.string_a;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = StringDecryptor.getIBreezeInterface3(5957524493384328596L, 6277973806899160611L, MethodHandles.lookup().lookupClass())
            .decryptKey(68299037814906L)
         ^ 67974621706193L;
      if (values() != null) {
         initialize(new int[1]);
      }

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
      String var6 = "ÂªÆOa°\u001aC0N=\u001a6\tÐ\u0087\u0018\u0019\u007féD\u0080IÐ(\u0017½óªï·\u0018\u0080Bï\u008fpjv\u001aÌ\u0018\u0019\u007féD\u0080IÐ(Èu{KÍ\u0014^\u0080wî7¹z¾\u0094ì\u0018]=í·\u0092\"ê\u0015Ãk\u000bÌ\u009bÕNúé½çÇÕáI\u000e";
      int var7 = "ÂªÆOa°\u001aC0N=\u001a6\tÐ\u0087\u0018\u0019\u007féD\u0080IÐ(\u0017½óªï·\u0018\u0080Bï\u008fpjv\u001aÌ\u0018\u0019\u007féD\u0080IÐ(Èu{KÍ\u0014^\u0080wî7¹z¾\u0094ì\u0018]=í·\u0092\"ê\u0015Ãk\u000bÌ\u009bÕNúé½çÇÕáI\u000e"
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
                     SOURCE_SANS = new EnumType32(var4[2]);
                     SOURCE_SANS_BOLD = new EnumType32(var4[1]);
                     SOURCE_CODE_PRO = new EnumType32(var4[3]);
                     CONST_B = new EnumType32[]{SOURCE_SANS, SOURCE_SANS_BOLD, SOURCE_CODE_PRO};
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

                  var6 = "À\u000b.å§©\r²cP\u0086CÒG\\à\u0018ÂªÆOa°\u001aC\u008dèNÁ.\u0082%øP-L*\u00adZ\u0090õ";
                  var7 = "À\u000b.å§©\r²cP\u0086CÒG\\à\u0018ÂªÆOa°\u001aC\u008dèNÁ.\u0082%øP-L*\u00adZ\u0090õ".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(int[] var0) {
      arr_c = var0;
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
