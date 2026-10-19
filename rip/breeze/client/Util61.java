package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

final class Util61 extends Util64<Number> {

   public Number getNumber(RotationUtil9 var1, char var2, int var3, char var4) throws IOException {
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ 90154145473429L;
      long var7 = var5 ^ 107507698482085L;
      long var9 = var5 ^ 138430150227340L;
      long var11 = var5 ^ 128041192885652L;

      try {
         if (var1.getEnum10Val(var7) == EnumType1.NULL) {
            var1.calculate_7(var11);
            return null;
         }
      } catch (NumberFormatException var15) {
         throw getNumberFormatException(var15);
      }

      try {
         int var13 = var1.calculate_8(var9);
         return (byte)var13;
      } catch (NumberFormatException var14) {
         throw new AuthException2(var14);
      }
   }

   public void updateCallSiteNumber(Util135 var1, long var2, Number var4) throws IOException {
      var2 = 90154145473429L ^ var2;
      long var5 = var2 ^ 60055601974399L;
      var1.getDataBuilder19_13(var4, var5);
   }

   private static NumberFormatException getNumberFormatException(NumberFormatException var0) {
      return var0;
   }
}
