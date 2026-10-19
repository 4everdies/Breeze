package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

final class Util63 extends Util64<Number> {

   public Number getNumber(RotationUtil9 var1, long var2) throws IOException {
      var2 = 34855055645658L ^ var2;
      long var4 = var2 ^ 106323522332044L;
      long var6 = var2 ^ 136968889707429L;
      long var8 = var2 ^ 128675613479869L;

      try {
         if (var1.getEnum10Val(var4) == EnumType1.NULL) {
            var1.calculate_7(var8);
            return null;
         }
      } catch (NumberFormatException var12) {
         throw getNumberFormatException(var12);
      }

      try {
         return var1.calculate_8(var6);
      } catch (NumberFormatException var11) {
         throw new AuthException2(var11);
      }
   }

   public void updateCallSiteNumber(long var1, Util135 var3, Number var4) throws IOException {
      var1 = 34855055645658L ^ var1;
      long var5 = var1 ^ 70592406171630L;
      var3.getDataBuilder19_13(var4, var5);
   }

   private static NumberFormatException getNumberFormatException(NumberFormatException var0) {
      return var0;
   }
}
