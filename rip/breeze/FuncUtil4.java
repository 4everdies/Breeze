package rip.breeze;

import java.util.function.Function;

final class FuncUtil4 implements Function<Class<?>, ScriptObject> {
   public ScriptObject getScriptObject(Class<?> var1) {
      return var1.getAnnotation(ScriptObject.class);
   }
}
