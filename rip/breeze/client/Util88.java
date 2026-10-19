package rip.breeze.client;

import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

final class Util88 extends Util64<Character> {
   private static final String CONST_C;

   public Character getCharacter(long var1, RotationUtil9 var3) throws IOException {
      var1 = 105225839646693L ^ var1;
      long var10001 = var1 ^ 123518849150281L;
      int var4 = (int)((var1 ^ 123518849150281L) >>> 48);
      int var5 = (int)((var1 ^ 123518849150281L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var1 ^ 22666495142025L;
      long var9 = var1 ^ 1277947289272L;

      try {
         if (var3.getEnum10Val(var7) == EnumType1.NULL) {
            var3.calculate_7(var9);
            return null;
         }
      } catch (IOException var13) {
         throw getIOException(var13);
      }

      String var11 = var3.buildString_2((short)var4, (short)var5, var6);

      try {
         int var10000 = var11.length();
         if (var1 <= 0L) {
            return Character.valueOf((char)var10000);
         }

         if (var10000 != 1) {
            throw new AuthException2(CONST_C + var11);
         }
      } catch (IOException var12) {
         throw getIOException(var12);
      }

      return var11.charAt(0);
   }

   public void processAll(char var1, int var2, int var3, Util135 var4, Character var5) throws IOException {
      long var6 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ 105225839646693L;
      long var10001 = var6 ^ 91826985240998L;
      int var8 = (int)((var6 ^ 91826985240998L) >>> 56);
      int var9 = (int)((var6 ^ 91826985240998L) << 8 >>> 32);
      int var10 = (int)(var10001 << 40 >>> 40);

      Util135 var10000;
      label17: {
         try {
            var10000 = var4;
            if (var5 == null) {
               var12 = null;
               break label17;
            }
         } catch (IOException var11) {
            throw getIOException(var11);
         }

         var12 = String.valueOf(var5);
      }

      var10000.getDataBuilder19_8(var12, (byte)var8, var9, var10);
   }

   static {
      long var0 = 36408048101118L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("òdó³Ùºä¡·4\u0014ûP¢\u0019ák#\u008eìß\u0000Ø¢ß\u0081gj_r7á".getBytes("ISO-8859-1"));
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
