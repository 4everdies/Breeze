package rip.breeze.client;

import java.io.IOException;
import java.util.Currency;
import rip.breeze.StringDecryptor;

final class Util51 extends Util64<Currency> {

   public Currency getCurrency(RotationUtil9 var1, long var2) throws IOException {
      var2 = 17776453181049L ^ var2;
      long var10001 = var2 ^ 69468255686152L;
      int var4 = (int)((var2 ^ 69468255686152L) >>> 48);
      int var5 = (int)((var2 ^ 69468255686152L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      return Currency.getInstance(var1.buildString_2((short)var4, (short)var5, var6));
   }

   public void updateCallSiteCurrency(Util135 var1, Currency var2, long var3) throws IOException {
      var3 = 17776453181049L ^ var3;
      long var10001 = var3 ^ 92335820749681L;
      int var5 = (int)((var3 ^ 92335820749681L) >>> 56);
      int var6 = (int)((var3 ^ 92335820749681L) << 8 >>> 32);
      int var7 = (int)(var10001 << 40 >>> 40);
      var1.getDataBuilder19_8(var2.getCurrencyCode(), (byte)var5, var6, var7);
   }
}
