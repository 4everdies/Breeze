package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

final class Util85 extends Util64<Number> {

   public Number getNumber(long var1, char var3, RotationUtil9 var4) throws IOException {
      long var5 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ 3899133321147L;
      long var7 = var5 ^ 11922572080020L;
      long var9 = var5 ^ 123442646182882L;
      long var11 = var5 ^ 34510319142309L;

      try {
         if (var4.getEnum10Val(var7) == EnumType1.NULL) {
            var4.calculate_7(var11);
            return null;
         }
      } catch (IOException var13) {
         throw getIOException(var13);
      }

      return (float)var4.calculateDouble(var9);
   }

   public void updateCallSiteNumber(Util135 var1, long var2, Number var4) throws IOException {
      var2 = 3899133321147L ^ var2;
      long var5 = var2 ^ 117938906466775L;
      var1.getDataBuilder19_13(var4, var5);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
