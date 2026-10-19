package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

class Util84 extends Util64<Number> {
   final MathUtil11 dataBuilder5_a;

   Util84(MathUtil11 var1) {
      this.dataBuilder5_a = var1;
   }

   public Double getDouble(RotationUtil9 var1, byte var2, long var3) throws IOException {
      long var5 = ((long)var2 << 56 | var3 << 8 >>> 8) ^ 121283171793620L;
      long var7 = var5 ^ 133711119198453L;
      long var9 = var5 ^ 3361893789827L;
      long var11 = var5 ^ 118923152268996L;

      try {
         if (var1.getEnum10Val(var7) == EnumType1.NULL) {
            var1.calculate_7(var11);
            return null;
         }
      } catch (IOException var13) {
         throw getIOException(var13);
      }

      return var1.calculateDouble(var9);
   }

   public void processNullable(long var1, Util135 var3, Number var4) throws IOException {
      var1 = 121283171793620L ^ var1;
      long var5 = var1 ^ 129967171986022L;
      long var7 = var1 ^ 12408634882226L;
      long var9 = var1 ^ 128340516223949L;

      try {
         if (var4 == null) {
            var3.getDataBuilder19_9(var9);
            return;
         }
      } catch (IOException var13) {
         throw getIOException(var13);
      }

      double var11 = var4.doubleValue();
      MathUtil11.processAll(var5, var11);
      var3.getDataBuilder19_13(var4, var7);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
