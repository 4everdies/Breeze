package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

final class Util93 extends Util64<StringBuffer> {

   public StringBuffer getStringBuffer(RotationUtil9 var1, long var2) throws IOException {
      var2 = 17505349023303L ^ var2;
      long var10001 = var2 ^ 5739866701017L;
      int var4 = (int)((var2 ^ 5739866701017L) >>> 48);
      int var5 = (int)((var2 ^ 5739866701017L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 107700196440345L;
      long var9 = var2 ^ 127848695156520L;

      try {
         if (var1.getEnum10Val(var7) == EnumType1.NULL) {
            var1.calculate_7(var9);
            return null;
         }
      } catch (IOException var11) {
         throw getIOException(var11);
      }

      return new StringBuffer(var1.buildString_2((short)var4, (short)var5, var6));
   }

   public void processAll(char var1, int var2, Util135 var3, StringBuffer var4, short var5) throws IOException {
      long var6 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ 17505349023303L;
      long var10001 = var6 ^ 14150409631023L;
      int var8 = (int)((var6 ^ 14150409631023L) >>> 56);
      int var9 = (int)((var6 ^ 14150409631023L) << 8 >>> 32);
      int var10 = (int)(var10001 << 40 >>> 40);

      Util135 var10000;
      label17: {
         try {
            var10000 = var3;
            if (var4 == null) {
               var12 = null;
               break label17;
            }
         } catch (IOException var11) {
            throw getIOException(var11);
         }

         var12 = var4.toString();
      }

      var10000.getDataBuilder19_8(var12, (byte)var8, var9, var10);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
