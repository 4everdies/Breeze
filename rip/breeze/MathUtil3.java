package rip.breeze;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

final class MathUtil3 extends BaseFunction {
   private final String string_a;
   private final int fieldInt_b;
   private final Util21 breezeUtil18_c;
   private final MethodHandle methodHandle_d;
   private final Class<?>[] arr_e;

   MathUtil3(String var1, int var2, Util21 var3, Scriptable var4, Scriptable var5) {
      this.string_a = var1;
      this.fieldInt_b = var2;
      this.breezeUtil18_c = var3;
      this.arr_e = var3.arr_d;
      this.setParentScope(var5);
      this.setPrototype(var4);
      MethodHandle var6 = var3.methodHandle_c;
      MethodHandle var8;
      if (var3.fieldBool_f) {
         var8 = var6.asSpreader(Object[].class, var3.fieldInt_e);
         var8 = MethodHandles.dropArguments(var8, 0, Object.class);
      } else {
         var8 = var6.asSpreader(Object[].class, var3.fieldInt_e);
      }

      this.methodHandle_d = getMethodHandle(var8).asType(MethodType.methodType(Object.class, Object.class, Object[].class));
   }

   @Override
   public int getLength() {
      return this.fieldInt_b;
   }

   @Override
   public String getFunctionName() {
      return this.string_a;
   }

   @Override
   public Object call(Context var1, Scriptable var2, Scriptable var3, Object[] var4) {
      try {
         if (!this.breezeUtil18_c.fieldBool_f) {
            Object var9 = HttpUtil4.getObject_2(var3, this.breezeUtil18_c.class_a);
            Object[] var10 = HttpUtil4.decrypt(var4, this.arr_e);
            Object var7 = (Object)this.methodHandle_d.invokeExact((Object)var9, (Object[])var10);
            return getObject(var7, var2);
         } else {
            Object[] var5 = HttpUtil4.decrypt(var4, this.arr_e);
            Object var6 = (Object)this.methodHandle_d.invokeExact((Object)null, (Object[])var5);
            return getObject(var6, var2);
         }
      } catch (Throwable var8) {
         throw Context.throwAsScriptRuntimeEx(var8);
      }
   }

   private static MethodHandle getMethodHandle(MethodHandle var0) {
      MethodType var1 = var0.type();
      if (var1.returnType() == void.class) {
         MethodHandle var2 = MethodHandles.constant(Object.class, Undefined.instance);
         MethodHandle var3 = MethodHandles.dropArguments(var2, 0, var1.parameterArray());
         return MethodHandles.foldArguments(var3, var0);
      } else {
         return var0.asType(var1.changeReturnType(Object.class));
      }
   }

   private static Object getObject(Object var0, Scriptable var1) {
      if (var0 instanceof ScriptableObject) {
         ScriptableObject var2 = (ScriptableObject)var0;
         if (var2.getParentScope() == null) {
            var2.setParentScope(var1);
         }

         if (var2.getPrototype() == null) {
            Scriptable var3 = ScriptableObject.getClassPrototype(var1, var2.getClassName());
            if (var3 != null) {
               var2.setPrototype(var3);
            }
         }

         return var2;
      } else {
         return Util35.getObject(var0);
      }
   }
}
