package rip.breeze.client;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import rip.breeze.StringDecryptor;

final class Util74 extends Util64<AtomicLong> {
   final Util64 clientUtil2_a;

   Util74(Util64 var1) {
      this.clientUtil2_a = var1;
   }

   public void updateCallSite(Util135 var1, long var2, AtomicLong var4) throws IOException {
      var2 = 80348373684831L ^ var2;
      long var5 = var2 ^ 134100834321962L;
      this.clientUtil2_a.updateCallSite(var5, var1, var4.get());
   }

   public AtomicLong getAtomicLong(RotationUtil9 var1, long var2) throws IOException {
      var2 = 80348373684831L ^ var2;
      long var4 = var2 ^ 80511773560711L;
      Number var6 = (Number)this.clientUtil2_a.lookupByKey(var1, var4);
      return new AtomicLong(var6.longValue());
   }
}
