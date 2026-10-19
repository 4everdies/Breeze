package rip.breeze.client;

import java.util.AbstractSet;
import java.util.Iterator;
import rip.breeze.StringDecryptor;

final class ConfigSet extends AbstractSet<K> {
   final ConfigMap dataBuilder38_a;

   ConfigSet(ConfigMap var1) {
      this.dataBuilder38_a = var1;
   }

   @Override
   public int size() {
      return this.dataBuilder38_a.fieldInt_d;
   }

   @Override
   public Iterator<K> iterator() {
      return new b0(this);
   }

   @Override
   public boolean contains(Object var1) {
      return this.dataBuilder38_a.containsKey(var1);
   }

   @Override
   public boolean remove(Object var1) {
      long var2 = 60923367297317L;
      long var10001 = var2 ^ 50426698363967L;
      int var4 = (int)((var2 ^ 50426698363967L) >>> 56);
      int var5 = (int)((var2 ^ 50426698363967L) << 8 >>> 32);
      int var6 = (int)(var10001 << 40 >>> 40);
      return this.dataBuilder38_a.getClientUtil5_4(var1, (byte)var4, var5, var6) != null;
   }

   @Override
   public void clear() {
      this.dataBuilder38_a.clear();
   }
}
