package rip.breeze.client;

import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

final class Util87 extends Util64<Number> {
   private static final String CONST_C;

   public Number getNumber(RotationUtil9 var1, long var2) throws IOException {
      var2 = 85402750405674L ^ var2;
      long var10001 = var2 ^ 1146008233941L;
      int var4 = (int)((var2 ^ 1146008233941L) >>> 48);
      int var5 = (int)((var2 ^ 1146008233941L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 111881183142421L;
      long var9 = var2 ^ 123650528351268L;
      EnumType1 var11 = var1.getEnum10Val(var7);

      try {
         switch (Util108.CONST_A[var11.ordinal()]) {
            case 1:
            case 3:
               return new NumberConverter(var1.buildString_2((short)var4, (short)var5, var6));
            case 2:
            default:
               throw new AuthException2(CONST_C + var11);
            case 4:
               var1.calculate_7(var9);
               return null;
         }
      } catch (IOException var12) {
         throw getIOException(var12);
      }
   }

   public void updateCallSiteNumber(Util135 var1, long var2, Number var4) throws IOException {
      var2 = 85402750405674L ^ var2;
      long var5 = var2 ^ 61571849692048L;
      var1.getDataBuilder19_13(var4, var5);
   }

   static {
      long var0 = 112395194884395L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0019½÷ùú=:ô@%:}©\u0006¡\u000e9Ú÷ìþ\u0096¶ë".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_C = var5;
   }

   private static IOException getIOException(IOException var0) {
      return var0;
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
