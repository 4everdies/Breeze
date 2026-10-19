package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;

public class հ {
   public static ձ ձ_ÿ_2 = new ծ();
   private static String string_þ_2;

   public static void invoke_1(Object... var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      Object[] var4 = (Object[])var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 12964450548635L;
      ձ_ÿ_2.method_001(new Object[]{var1, var5, var4});
   }

   public static void invoke_2(Object... var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      Object[] var4 = (Object[])var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 111360306748796L;
      ձ_ÿ_2.method_002(new Object[]{var5, var1, var4});
   }

   public static void invoke_3(Object... var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      Object[] var4 = (Object[])var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 113959289670071L;
      ձ_ÿ_2.method_003(new Object[]{var5, var3, var4});
   }

   public static կ invoke_4(Object[] var0) {
      Object[] var1 = (Object[])var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      String var10000 = method_006();
      կ var4 = new կ();
      String var5 = var10000;
      if (var5 != null) {
         if (var1.length > 0) {
            var10000 = var1;
            if (var2 > 0L) {
               if (var5 == null) {
                  return var4;
               }

               var10000 = (String)var1[var1.length - 1];
            }

            if (var10000 instanceof Throwable) {
               կ.method_004(new Object[]{var4, (Throwable)var1[var1.length - 1]});
               if (var2 < 0L) {
                  return var4;
               }

               կ.method_005(new Object[]{var4, Arrays.copyOfRange(var1, 0, var1.length - 1)});
               if (var5 != null) {
                  return var4;
               }

               boolean var9 = rip.breeze.inject.ջ.method_012();
               if (var2 > 0L) {
                  var9 = !var9;
               }

               rip.breeze.inject.ջ.method_011(var9);
            }
         }

         կ.method_005(new Object[]{var4, var1});
      }

      return var4;
   }

   static {
      method_005("w1yJQb");
   }

   public static void execute_5(String var0) {
      string_þ_2 = var0;
   }

   public static String invoke_6() {
      return string_þ_2;
   }
}
