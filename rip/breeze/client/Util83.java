package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

final class Util83 extends Util64<Number> {

   public Number getNumber(RotationUtil9 var1, long var2) throws IOException {
      var2 = 50956126457386L ^ var2;
      long var4 = var2 ^ 67640384774938L;
      long var6 = var2 ^ 55247422299668L;
      long var8 = var2 ^ 43480991082533L;

      try {
         if (var1.getEnum10Val(var6) == EnumType1.NULL) {
            var1.calculate_7(var8);
            return null;
         }
      } catch (NumberFormatException var12) {
         throw getNumberFormatException(var12);
      }

      try {
         return var1.getLong(var4);
      } catch (NumberFormatException var11) {
         throw new AuthException2(var11);
      }
   }

   public void updateCallSiteNumber(Util135 var1, long var2, Number var4) throws IOException {
      var2 = 50956126457386L ^ var2;
      long var5 = var2 ^ 140587142119749L;
      var1.getDataBuilder19_13(var4, var5);
   }

   private static NumberFormatException getNumberFormatException(NumberFormatException var0) {
      return var0;
   }
}
