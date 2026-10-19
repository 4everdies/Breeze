package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

final class Util62 extends Util64<Number> {

   public Number getNumber(long var1, RotationUtil9 var3) throws IOException {
      var1 = 33195623010781L ^ var1;
      long var4 = var1 ^ 124780860174374L;
      long var6 = var1 ^ 120246721314319L;
      long var8 = var1 ^ 110810980697623L;

      try {
         if (var3.getEnum10Val(var4) == EnumType1.NULL) {
            var3.calculate_7(var8);
            return null;
         }
      } catch (NumberFormatException var12) {
         throw getNumberFormatException(var12);
      }

      try {
         return (short)var3.calculate_8(var6);
      } catch (NumberFormatException var11) {
         throw new AuthException2(var11);
      }
   }

   public void updateCallSiteShort(Util135 var1, short var2, Number var3, int var4, int var5) throws IOException {
      long var6 = ((long)var2 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ 33195623010781L;
      long var8 = var6 ^ 20549565686284L;
      var1.getDataBuilder19_13(var3, var8);
   }

   private static NumberFormatException getNumberFormatException(NumberFormatException var0) {
      return var0;
   }
}
