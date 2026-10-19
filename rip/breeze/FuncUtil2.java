package rip.breeze;

import java.util.function.Function;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

final class FuncUtil2 implements Function<Object, Object> {
   final Scriptable scriptable_a;

   FuncUtil2(Scriptable var1) {
      this.scriptable_a = var1;
   }

   @Override
   public Object apply(Object var1) {
      if (var1 instanceof Util135) {
         Util135.decrypt_1((Util135)var1);
         return var1;
      } else {
         return var1 instanceof Scriptable ? var1 : Context.javaToJS(var1, this.scriptable_a);
      }
   }
}
