package rip.breeze.client;

import java.util.Map.Entry;
import rip.breeze.StringDecryptor;

class Util71 extends ConfigIterator<Entry<K, V>> {
   final ConfigSetImpl clientUtil92_e;

   Util71(ConfigSetImpl var1) {
      super(var1.dataBuilder38_a);
      this.clientUtil92_e = var1;
   }

   public Entry getMap$Entry(long var1) {
      var1 = 12250615616397L ^ var1;
      long var3 = var1 ^ 89362417990236L;
      return this.a(var3);
   }
}
