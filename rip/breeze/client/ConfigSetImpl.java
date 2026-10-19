package rip.breeze.client;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import rip.breeze.StringDecryptor;

class ConfigSetImpl extends AbstractSet<Entry<K, V>> {
   final ConfigMap dataBuilder38_a;

   ConfigSetImpl(ConfigMap var1) {
      this.dataBuilder38_a = var1;
   }

   @Override
   public int size() {
      return this.dataBuilder38_a.fieldInt_d;
   }

   @Override
   public Iterator<Entry<K, V>> iterator() {
      return new Util71(this);
   }

   @Override
   public boolean contains(Object var1) {
      long var2 = 14197522146988L;
      long var10001 = var2 ^ 36908532886708L;
      int var4 = (int)((var2 ^ 36908532886708L) >>> 48);
      int var5 = (int)((var2 ^ 36908532886708L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return var1 instanceof Entry && this.dataBuilder38_a.getClientUtil5_3((short)var4, var5, (Entry)var1, (char)var6) != null;
   }

   @Override
   public boolean remove(Object var1) {
      long var2 = 121081685485179L;
      long var10001 = var2 ^ 74111663762531L;
      int var4 = (int)((var2 ^ 74111663762531L) >>> 48);
      int var5 = (int)((var2 ^ 74111663762531L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      int var7 = (int)((var2 ^ 52364477865973L) >>> 48);
      long var8 = (var2 ^ 52364477865973L) << 16 >>> 16;
      if (!(var1 instanceof Entry)) {
         return false;
      }

      Util94 var10 = this.dataBuilder38_a.getClientUtil5_3((short)var4, var5, (Entry)var1, (char)var6);
      if (var10 == null) {
         return false;
      }

      this.dataBuilder38_a.clamp(var10, true, (short)var7, var8);
      return true;
   }

   @Override
   public void clear() {
      this.dataBuilder38_a.clear();
   }
}
