package rip.breeze.inject;

import java.util.ArrayList;

class ԇ extends ArrayList<Object> {
   final BreezeClass12 breezeClass12_ÿ;

   ԇ(BreezeClass12 var1, int var2) {
      super(var2);
      this.breezeClass12_ÿ = var1;
   }

   @Override
   public boolean add(Object var1) {
      this.breezeClass12_ÿ.object_ï = var1;
      return super.add(var1);
   }
}
