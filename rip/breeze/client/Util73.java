package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

class Util73 extends Util64<Number> {
   final MathUtil11 dataBuilder5_a;

   Util73(MathUtil11 var1) {
      this.dataBuilder5_a = var1;
   }

   public Float getFloat(RotationUtil9 var1, long var2) throws IOException {
      var2 = 128092704171974L ^ var2;
      long var4 = var2 ^ 43195583368935L;
      long var6 = var2 ^ 103197508638353L;
      long var8 = var2 ^ 56065405958358L;

      try {
         if (var1.getEnum10Val(var4) == EnumType1.NULL) {
            var1.calculate_7(var8);
            return null;
         }
      } catch (IOException var10) {
         throw getIOException(var10);
      }

      return (float)var1.calculateDouble(var6);
   }

   public void processNullable(Util135 var1, long var2, Number var4) throws IOException {
      var2 = 128092704171974L ^ var2;
      long var5 = var2 ^ 134679867965932L;
      long var7 = var2 ^ 7700119821112L;
      long var9 = var2 ^ 132973601953863L;

      try {
         if (var4 == null) {
            var1.getDataBuilder19_9(var9);
            return;
         }
      } catch (IOException var12) {
         throw getIOException(var12);
      }

      float var11 = var4.floatValue();
      MathUtil11.processAll(var5, var11);
      var1.getDataBuilder19_13(var4, var7);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
