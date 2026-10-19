package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum ý {
   SHORT_MEMBER,
   MEMBER,
   DESCRIPTOR,
   CLASS,
   ANNOTATION,
   DYNAMIC;

   private static String[] arr_þ_2;

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = rip.breeze.inject.Util138.getIBreezeInterface(6544878253761760582L, -6039341551366996388L, MethodHandles.lookup().lookupClass())
            .method_003(20272375366082L)
         ^ 77574608629996L;
      if (method_002() == null) {
         method_001(new String[4]);
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
      String var6 = "H\u000bc°Q\\ßü\u0010*§\"è¾\u0016Ì\u0001\u0093F<\u0007:`=j\b© K0ègxë\u0010\u0018yÍd®\\)ÂmÊ¸_çd\u000f|";
      int var7 = "H\u000bc°Q\\ßü\u0010*§\"è¾\u0016Ì\u0001\u0093F<\u0007:`=j\b© K0ègxë\u0010\u0018yÍd®\\)ÂmÊ¸_çd\u000f|".length();
      char var8 = '\b';
      int var12 = -1;

      label32:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = method_003(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     SHORT_MEMBER = new ý();
                     MEMBER = new ý();
                     DESCRIPTOR = new ý();
                     CLASS = new ý();
                     ANNOTATION = new ý();
                     DYNAMIC = new ý();
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

                  var6 = "ä`\u0000\u0098Ð\u008dûu\u000e\u0080%çC\u000eð\u0096\b\u00069¨,ª5r\u00ad";
                  var7 = "ä`\u0000\u0098Ð\u008dûu\u000e\u0080%çC\u000eð\u0096\b\u00069¨,ª5r\u00ad".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void execute_1(String[] var0) {
      arr_þ_2 = var0;
   }

   public static String[] invoke_2() {
      return arr_þ_2;
   }

   private static String invoke_3(byte[] var0) {
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
