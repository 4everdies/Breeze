package rip.breeze;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

final class Util37 {
   final MethodHandle methodHandle_a;
   final Class<?>[] arr_b;

   Util37(MethodHandle var1, Class<?>[] var2) {
      this.arr_b = var2;
      MethodHandle var3 = var1.asSpreader(Object[].class, var2.length);
      this.methodHandle_a = var3.asType(MethodType.methodType(Object.class, Object[].class));
   }
}
