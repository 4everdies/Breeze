package rip.breeze;

import java.util.function.Function;

public class FuncUtil3 implements Function<RangeValue, String> {
   public final Function<Double, String> function_a;

   public FuncUtil3(int var1) {
      this.function_a = RenderUtil27.getFunction_4(var1);
   }

   public String buildString(RangeValue var1) {
      return "(" + this.function_a.apply(var1.double_d) + "," + this.function_a.apply(var1.double_c) + ")";
   }
}
