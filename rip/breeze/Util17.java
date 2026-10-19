package rip.breeze;

import java.lang.invoke.MethodHandles;

public class Util17<L, R> {
   private final L object_a;
   private final R object_b;

   public Util17(L var1, R var2) {
      this.object_a = (L)var1;
      this.object_b = (R)var2;
   }

   public L getObject_a() {
      return this.object_a;
   }

   public R getObject_b() {
      return this.object_b;
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 64800359642417L;
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Util17 var4 = (Util17)var1;
         return (this.object_a != null ? this.object_a.equals(var4.object_a) : var4.object_a == null)
            && (this.object_b != null ? this.object_b.equals(var4.object_b) : var4.object_b == null);
      } else {
         return false;
      }
   }
}
