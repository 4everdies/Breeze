package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.util.function.Predicate;

public class BreezePredicate3 implements Predicate<RangeValue> {
   public final RangeValue dataBuilder39_a;

   private BreezePredicate3(double var1, double var3, double var5) {
      this.dataBuilder39_a = new RangeValue(var1, var3, var5);
   }

   public boolean checkCondition(RangeValue var1) {
      long var2 = 4712729099648L;
      return var1.double_d <= var1.double_c && this.dataBuilder39_a.isValid(var1.double_d) && this.dataBuilder39_a.isValid(var1.double_c);
   }

   BreezePredicate3(double var1, double var3, double var5, cK var7) {
      this(var1, var3, var5);
   }
}
