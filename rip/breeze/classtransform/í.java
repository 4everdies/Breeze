package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;

public class í extends ò {
   private static rip.breeze.inject.ջ[] arr_ú_2;

   public í(short var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ encKey_b_2;
      long var6 = var4 ^ 15447284678510L;
      super(var6, é.method_001(new Object[0]));
   }

   @Override
   protected void invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public static void execute_1(rip.breeze.inject.ջ[] var0) {
      arr_ú_2 = var0;
   }

   public static rip.breeze.inject.ջ[] invoke_2() {
      return arr_ú_2;
   }

   static {
      if (method_002() != null) {
         method_001(new rip.breeze.inject.ջ[3]);
      }
   }
}
