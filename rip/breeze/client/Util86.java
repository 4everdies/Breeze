package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

final class Util86 extends Util64<Number> {

   public Number getNumber(RotationUtil9 var1, long var2) throws IOException {
      var2 = 113227443512853L ^ var2;
      long var4 = var2 ^ 68553192427501L;
      long var6 = var2 ^ 75640868034459L;
      long var8 = var2 ^ 48299982911964L;

      try {
         if (var1.getEnum10Val(var4) == EnumType1.NULL) {
            var1.calculate_7(var8);
            return null;
         }
      } catch (IOException var10) {
         throw getIOException(var10);
      }

      return var1.calculateDouble(var6);
   }

   public void updateCallSiteIntByte(int var1, Util135 var2, Number var3, byte var4, int var5) throws IOException {
      long var6 = ((long)var1 << 32 | (long)var4 << 56 >>> 32 | (long)var5 << 40 >>> 40) ^ 113227443512853L;
      long var8 = var6 ^ 116272902325272L;
      var2.getDataBuilder19_13(var3, var8);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
