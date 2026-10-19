package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

final class Util54 extends Util64<Number> {

   public Number getNumber(RotationUtil9 var1, long var2) throws IOException {
      var2 = 108639778573822L ^ var2;
      long var4 = var2 ^ 2884822112487L;
      long var6 = var2 ^ 14448927204841L;
      long var8 = var2 ^ 27010391888856L;

      try {
         if (var1.getEnum10Val(var6) == EnumType1.NULL) {
            var1.calculate_7(var8);
            return null;
         }
      } catch (IOException var10) {
         throw getIOException(var10);
      }

      return var1.getLong(var4);
   }

   public void processNullable(Util135 var1, Number var2, long var3) throws IOException {
      var3 = 108639778573822L ^ var3;
      long var5 = var3 ^ 18305245166216L;
      long var10001 = var3 ^ 4670263577215L;
      int var7 = (int)((var3 ^ 4670263577215L) >>> 56);
      int var8 = (int)((var3 ^ 4670263577215L) << 8 >>> 32);
      int var9 = (int)(var10001 << 40 >>> 40);

      try {
         if (var2 == null) {
            var1.getDataBuilder19_9(var5);
            return;
         }
      } catch (IOException var10) {
         throw getIOException(var10);
      }

      var1.getDataBuilder19_8(var2.toString(), (byte)var7, var8, var9);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
