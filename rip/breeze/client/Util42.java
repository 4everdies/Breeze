package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

final class Util42 {
   static final byte CONST_A = 0;
   static final byte CONST_B = 1;
   static final byte CONST_C;
   static final byte CONST_D;
   final byte[] arr_e;
   final int[] arr_f;
   final int fieldInt_g;

   private Util42(byte[] var1, int[] var2, int var3) {
      this.arr_e = var1;
      this.arr_f = var2;
      this.fieldInt_g = var3;
   }

   static Util42 clamp(String var0) {
      Util130 var1 = new Util130(Math.max(16, var0.length()));
      Util127 var2 = new Util127(Math.max(16, var0.length()));
      int var3 = 0;
      int var4 = var0.length();

      while (var3 < var4) {
         int var5 = var0.codePointAt(var3);
         var3 += Character.charCount(var5);
         if (var5 == 10) {
            var2.calculate((byte)1);
            var1.calculate(0);
         } else if (var5 == 9) {
            var2.calculate((byte)2);
            var1.calculate(0);
         } else if (var5 == 167 && var3 < var4) {
            char var6 = Character.toLowerCase(var0.charAt(var3));
            var3++;
            if (isValid(var6)) {
               var2.calculate((byte)3);
               var1.calculate(var6);
            } else {
               var2.calculate((byte)0);
               var1.calculate(167);
               var2.calculate((byte)0);
               var1.calculate(var6);
            }
         } else {
            var2.calculate((byte)0);
            var1.calculate(var5);
         }
      }

      return new Util42(var2.getBytes(), var1.values(), var2.getInt_c());
   }

   private static boolean isValid(char var0) {
      if (var0 >= '0' && var0 <= '9') {
         return true;
      } else {
         return var0 >= 'a' && var0 <= 'f' ? true : var0 == 'g' || var0 == 'h' || var0 == 'i' || var0 == 'j' || var0 == 'k' || var0 == 'r';
      }
   }

   static {
      long var0 = StringDecryptor.getIBreezeInterface3(-3343160222789139706L, 7655227102860054205L, MethodHandles.lookup().lookupClass())
            .decryptKey(90622737581078L)
         ^ 75207938292189L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var4 = new long[2];
      int var5 = 0;
      String var6 = "T(@]'³5¹¬\u0090<\u0083\u0087M9\u007f";
      int var7 = "T(@]'³5¹¬\u0090<\u0083\u0087M9\u007f".length();
      byte var8 = 0;

      do {
         int var10001 = var8;
         var8 += 8;
         byte[] var9 = var6.substring(var10001, var8).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)(var10 >>> 56),
               (byte)(var10 >>> 48),
               (byte)(var10 >>> 40),
               (byte)(var10 >>> 32),
               (byte)(var10 >>> 24),
               (byte)(var10 >>> 16),
               (byte)(var10 >>> 8),
               (byte)var10
            }
         );
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var14 = -1;
         var4[var10001] = var10004;
      } while (var8 < var7);

      CONST_D = (byte)((int)var4[1]);
      CONST_C = (byte)((int)var4[0]);
   }
}
