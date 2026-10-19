package rip.breeze.client;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import rip.breeze.StringDecryptor;

final class Util66 extends Util64<AtomicBoolean> {

   public AtomicBoolean getAtomicBoolean(RotationUtil9 var1, char var2, short var3, int var4) throws IOException {
      long var5 = ((long)var2 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ 113347099280179L;
      long var7 = var5 ^ 96635495704106L;
      return new AtomicBoolean(var1.checkCondition_2(var7));
   }

   public void updateCallSiteAtomic(long var1, Util135 var3, AtomicBoolean var4) throws IOException {
      var1 = 113347099280179L ^ var1;
      long var5 = var1 ^ 46022324977809L;
      var3.getDataBuilder19_10(var5, var4.get());
   }
}
