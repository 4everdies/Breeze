package rip.breeze.client;

import java.util.concurrent.atomic.AtomicInteger;

class Util112 {
   final Util137 dataBuilder23_a;
   final AtomicInteger atomicInteger_b;
   final StringBuilderUtil dataBuilder12_c;

   public Util112(Util137 var1, AtomicInteger var2, StringBuilderUtil var3) {
      this.dataBuilder23_a = var1;
      this.atomicInteger_b = var2;
      this.dataBuilder12_c = var3;
   }

   public Util112 getClientUtil69(Util137 var1) {
      return new Util112(var1, this.atomicInteger_b, this.dataBuilder12_c);
   }
}
