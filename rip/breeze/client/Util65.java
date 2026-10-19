package rip.breeze.client;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import rip.breeze.StringDecryptor;

final class Util65 extends Util64<AtomicInteger> {

   public AtomicInteger getAtomicInteger(long var1, RotationUtil9 var3) throws IOException {
      var1 = 78849370327941L ^ var1;
      long var4 = var1 ^ 14032449625835L;

      try {
         return new AtomicInteger(var3.calculate_8(var4));
      } catch (NumberFormatException var7) {
         throw new AuthException2(var7);
      }
   }

   public void updateCallSiteInt(Util135 var1, int var2, byte var3, int var4, AtomicInteger var5) throws IOException {
      long var6 = ((long)var2 << 32 | (long)var3 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ 78849370327941L;
      long var10001 = var6 ^ 134427281866404L;
      int var8 = (int)((var6 ^ 134427281866404L) >>> 32);
      int var9 = (int)((var6 ^ 134427281866404L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      var1.getDataBuilder19_12(var8, var5.get(), var9, (short)var10);
   }
}
