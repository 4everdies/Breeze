package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

final class Util92 extends Util64<StringBuilder> {

   public StringBuilder getStringBuilder(int var1, char var2, int var3, RotationUtil9 var4) throws IOException {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ 30895360368944L;
      long var10001 = var5 ^ 97562339631351L;
      int var7 = (int)((var5 ^ 97562339631351L) >>> 48);
      int var8 = (int)((var5 ^ 97562339631351L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      long var10 = var5 ^ 66451966567735L;
      long var12 = var5 ^ 45925852549894L;

      try {
         if (var4.getEnum10Val(var10) == EnumType1.NULL) {
            var4.calculate_7(var12);
            return null;
         }
      } catch (IOException var14) {
         throw getIOException(var14);
      }

      return new StringBuilder(var4.buildString_2((short)var7, (short)var8, var9));
   }

   public void processAll(long var1, Util135 var3, StringBuilder var4) throws IOException {
      var1 = 30895360368944L ^ var1;
      long var10001 = var1 ^ 7496428430535L;
      int var5 = (int)((var1 ^ 7496428430535L) >>> 56);
      int var6 = (int)((var1 ^ 7496428430535L) << 8 >>> 32);
      int var7 = (int)(var10001 << 40 >>> 40);

      Util135 var10000;
      label17: {
         try {
            var10000 = var3;
            if (var4 == null) {
               var10 = null;
               break label17;
            }
         } catch (IOException var8) {
            throw getIOException(var8);
         }

         var10 = var4.toString();
      }

      var10000.getDataBuilder19_8(var10, (byte)var5, var6, var7);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
