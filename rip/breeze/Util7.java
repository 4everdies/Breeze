package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class Util7 {
   private static final String CONST_B;

   private Util7() {
   }

   public static String buildString(String var0) {
      long var1 = 101536413609126L;
      String[] var10000 = RenderUtil1.decrypt();
      String[] var3 = buildString_2(var0);
      String[] var4 = var10000;
      StringBuilder var5 = new StringBuilder();

      for (String var9 : var3) {
         if (!var9.isEmpty()) {
            var5.append(Character.toLowerCase(var9.charAt(0)));
         }

         if (var4 != null) {
            break;
         }
      }

      return var5.toString();
   }

   public static String[] buildString_2(String var0) {
      long var1 = 117526254421485L;
      return var0.split(CONST_B);
   }

   static {
      long var0 = 43497546417488L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Ð)Si¤²Üp,Þ·\t\u0014\bÛ³å\u0018w\u0093qbVN÷Â¨¯\u0094ùu\u0011$² ÌB\u008d|ÒÞÈË>Hp\u0086T2îó0l#½év6³~þ@Ë<".getBytes("ISO-8859-1"));
      String var5 = buildString_3(var4).intern();
      byte var10001 = -1;
      CONST_B = var5;
   }

   private static String buildString_3(byte[] var0) {
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
