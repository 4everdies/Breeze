package rip.breeze.client;

import java.io.IOException;
import java.math.BigInteger;
import rip.breeze.StringDecryptor;

final class Util91 extends Util64<BigInteger> {

   public BigInteger getBigInteger(long var1, RotationUtil9 var3) throws IOException {
      var1 = 20894944376944L ^ var1;
      long var10001 = var1 ^ 121364242600635L;
      int var4 = (int)((var1 ^ 121364242600635L) >>> 48);
      int var5 = (int)((var1 ^ 121364242600635L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var1 ^ 11728982497147L;
      long var9 = var1 ^ 34214282649930L;

      try {
         if (var3.getEnum10Val(var7) == EnumType1.NULL) {
            var3.calculate_7(var9);
            return null;
         }
      } catch (NumberFormatException var13) {
         throw getNumberFormatException(var13);
      }

      try {
         return new BigInteger(var3.buildString_2((short)var4, (short)var5, var6));
      } catch (NumberFormatException var12) {
         throw new AuthException2(var12);
      }
   }

   public void updateCallSiteBigInteger(Util135 var1, long var2, BigInteger var4) throws IOException {
      var2 = 20894944376944L ^ var2;
      long var5 = var2 ^ 130151007047509L;
      var1.getDataBuilder19_13(var4, var5);
   }

   private static NumberFormatException getNumberFormatException(NumberFormatException var0) {
      return var0;
   }
}
