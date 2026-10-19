package rip.breeze;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

final class Util35 {
   private Util35() {
   }

   static Object[] castArray(Object[] var0, Class<?>[] var1) {
      int var2 = var1.length;
      Object[] var3 = new Object[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         Object var5 = var4 < var0.length ? var0[var4] : Undefined.instance;
         Class var6 = var1[var4];
         if (var6 == double.class || var6 == Double.class) {
            var3[var4] = ScriptRuntime.toNumber(var5);
         } else if (var6 == float.class || var6 == Float.class) {
            var3[var4] = (float)ScriptRuntime.toNumber(var5);
         } else if (var6 == int.class || var6 == Integer.class) {
            var3[var4] = ScriptRuntime.toInt32(var5);
         } else if (var6 == long.class || var6 == Long.class) {
            var3[var4] = (long)ScriptRuntime.toNumber(var5);
         } else if (var6 == boolean.class || var6 == Boolean.class) {
            var3[var4] = ScriptRuntime.toBoolean(var5);
         } else if (var6 == String.class) {
            var3[var4] = ScriptRuntime.toString(var5);
         } else if (Scriptable.class.isAssignableFrom(var6)) {
            var3[var4] = var5;
         } else {
            var3[var4] = Context.jsToJava(var5, var6);
         }
      }

      return var3;
   }

   static int getValue(int var0, int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2] == var0) {
            return var2;
         }
      }

      int var6 = -1;
      int var3 = -1;

      for (int var4 = 0; var4 < var1.length; var4++) {
         if (var1[var4] <= var0 && var1[var4] > var3) {
            var3 = var1[var4];
            var6 = var4;
         }
      }

      if (var6 >= 0) {
         return var6;
      }

      int var7 = 0;

      for (int var5 = 1; var5 < var1.length; var5++) {
         if (var1[var5] < var1[var7]) {
            var7 = var5;
         }
      }

      return var7;
   }

   static Object getObject(Object var0) {
      if (var0 == null) {
         return Undefined.instance;
      } else if (var0 instanceof Float) {
         return ((Float)var0).doubleValue();
      } else {
         return !(var0 instanceof Short) && !(var0 instanceof Byte) && !(var0 instanceof Integer) && !(var0 instanceof Long)
            ? var0
            : ((Number)var0).doubleValue();
      }
   }
}
