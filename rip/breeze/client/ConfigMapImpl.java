package rip.breeze.client;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class ConfigMapImpl extends LinkedHashMap<String, Util42> {
   final MathUtil10 dataBuilder46_a;

   ConfigMapImpl(MathUtil10 var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.dataBuilder46_a = var1;
   }

   @Override
   protected boolean removeEldestEntry(Entry<String, Util42> var1) {
      return this.size() > 512;
   }
}
