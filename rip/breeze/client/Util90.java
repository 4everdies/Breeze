package rip.breeze.client;

import java.io.IOException;
import java.math.BigDecimal;
import rip.breeze.StringDecryptor;

final class Util90 extends Util64<BigDecimal> {

   public BigDecimal getBigDecimal(RotationUtil9 var1, long var2) throws IOException {
      var2 = 26085185177228L ^ var2;
      long var10001 = var2 ^ 50264256435064L;
      int var4 = (int)((var2 ^ 50264256435064L) >>> 48);
      int var5 = (int)((var2 ^ 50264256435064L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 80799112238776L;
      long var9 = var2 ^ 102016170729609L;

      try {
         if (var1.getEnum10Val(var7) == EnumType1.NULL) {
            var1.calculate_7(var9);
            return null;
         }
      } catch (NumberFormatException var13) {
         throw getNumberFormatException(var13);
      }

      try {
         return new BigDecimal(var1.buildString_2((short)var4, (short)var5, var6));
      } catch (NumberFormatException var12) {
         throw new AuthException2(var12);
      }
   }

   public void updateCallSiteBigDecimal(Util135 var1, long var2, BigDecimal var4) throws IOException {
      var2 = 26085185177228L ^ var2;
      long var5 = var2 ^ 20624450474080L;
      var1.getDataBuilder19_13(var4, var5);
   }

   private static NumberFormatException getNumberFormatException(NumberFormatException var0) {
      return var0;
   }
}
