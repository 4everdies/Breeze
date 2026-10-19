package rip.breeze.client;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import rip.breeze.StringDecryptor;

abstract class ConfigIterator<T> implements Iterator<T> {
   Util94<K, V> clientUtil5_a;
   Util94<K, V> clientUtil5_b;
   int fieldInt_c;
   final ConfigMap dataBuilder38_d;

   ConfigIterator(ConfigMap var1) {
      this.dataBuilder38_d = var1;
      this.clientUtil5_a = this.dataBuilder38_d.clientUtil5_f.clientUtil5_d;
      this.clientUtil5_b = null;
      this.fieldInt_c = this.dataBuilder38_d.fieldInt_e;
   }

   @Override
   public final boolean hasNext() {
      long var1 = 101255604216893L;

      try {
         if (this.clientUtil5_a != this.dataBuilder38_d.clientUtil5_f) {
            return true;
         }
      } catch (NoSuchElementException var3) {
         throw getNoSuchElementException(var3);
      }

      return false;
   }

   final Util94 getClientUtil5(long var1) {
      var1 = 120886825802353L ^ var1;
      Util94 var3 = this.clientUtil5_a;

      try {
         if (var3 == this.dataBuilder38_d.clientUtil5_f) {
            throw new NoSuchElementException();
         }
      } catch (NoSuchElementException var4) {
         throw getNoSuchElementException(var4);
      }

      try {
         if (var1 <= 0L) {
            return this.clientUtil5_b = var3;
         }

         if (this.dataBuilder38_d.fieldInt_e != this.fieldInt_c) {
            throw new ConcurrentModificationException();
         }
      } catch (NoSuchElementException var5) {
         throw getNoSuchElementException(var5);
      }

      this.clientUtil5_a = var3.clientUtil5_d;
      return this.clientUtil5_b = var3;
   }

   @Override
   public final void remove() {
      long var1 = 52784608609672L;
      int var3 = (int)((var1 ^ 125062318963718L) >>> 48);
      long var4 = (var1 ^ 125062318963718L) << 16 >>> 16;

      try {
         if (this.clientUtil5_b == null) {
            throw new IllegalStateException();
         }
      } catch (NoSuchElementException var6) {
         throw getNoSuchElementException(var6);
      }

      this.dataBuilder38_d.clamp(this.clientUtil5_b, true, (short)var3, var4);
      this.clientUtil5_b = null;
      this.fieldInt_c = this.dataBuilder38_d.fieldInt_e;
   }

   private static NoSuchElementException getNoSuchElementException(NoSuchElementException var0) {
      return var0;
   }
}
