package rip.breeze;

import java.util.List;
import java.util.function.BiFunction;

class Util27 {
   private final String string_a;
   private final BiFunction<Object, List<Float>, Object> biFunction_b;

   public Util27(String var1, int var2, BiFunction<Object, List<Float>, Object> var3) {
      this.string_a = var1;
      this.biFunction_b = var3;
   }

   public Object getObject(Object var1, List<Float> var2) {
      return this.biFunction_b.apply(var1, var2);
   }

   public String getString_a() {
      return this.string_a;
   }
}
