package rip.breeze;

import java.util.function.Predicate;

public class BreezePredicate implements Predicate<Double> {
   public final RangeValue dataBuilder39_a;

   private BreezePredicate(double var1, double var3, double var5) {
      this.dataBuilder39_a = new RangeValue(var1, var3, var5);
   }

   private BreezePredicate(double var1, double var3) {
      this.dataBuilder39_a = new RangeValue(var1, var3);
   }

   public boolean isValid(Double var1) {
      return this.dataBuilder39_a.isValid(var1);
   }

   BreezePredicate(double var1, double var3, double var5, cB var7) {
      this(var1, var3, var5);
   }

   BreezePredicate(double var1, double var3, cB var5) {
      this(var1, var3);
   }
}
