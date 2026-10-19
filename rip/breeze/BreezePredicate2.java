package rip.breeze;

import java.util.function.Predicate;

public class BreezePredicate2 implements Predicate<Integer> {
   public final RangeValue dataBuilder39_a;

   private BreezePredicate2(int var1, int var2, int var3) {
      this.dataBuilder39_a = new RangeValue(var1, var2, var3);
   }

   private BreezePredicate2(int var1, int var2) {
      this.dataBuilder39_a = new RangeValue(var1, var2);
   }

   public boolean isValid(Integer var1) {
      return this.dataBuilder39_a.isValid(var1.intValue());
   }

   BreezePredicate2(int var1, int var2, int var3, cB var4) {
      this(var1, var2, var3);
   }

   BreezePredicate2(int var1, int var2, cB var3) {
      this(var1, var2);
   }
}
