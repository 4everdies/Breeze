package rip.breeze;

import java.util.function.IntFunction;

final class FuncUtil1 implements IntFunction<Object[]> {
   public Object[] allocate(int var1) {
      return new Object[var1];
   }
}
