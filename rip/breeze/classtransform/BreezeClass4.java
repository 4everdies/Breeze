package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import rip.breeze.inject.BreezeClass12;

public class BreezeClass4 extends BreezeColor {
   private static boolean bool_þ;

   static void processAll(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      rip.breeze.inject.é var2 = (rip.breeze.inject.é)var0[1];
      long var3 = (Long)var0[2];
      ô var5 = (ô)var0[3];
      var3 = encKey_b ^ var3;
      long var6 = var3 ^ 116580380846383L;
      long var8 = var3 ^ 5866043233243L;
      boolean var10000 = isValid();
      Iterator var10 = var1.list_ä_2.iterator();
      boolean var11 = var10000;

      label21:
      while (true) {
         var10000 = var10.hasNext();

         do {
            if (!var10000) {
               return;
            }

            BreezeClass12 var12 = (BreezeClass12)var10.next();
            if ((var12.int_û & 4096) == 0) {
               continue label21;
            }

            String var13 = buildString(new Object[]{var2, var1, var6, var12});
            var5.method_004(new Object[]{var1.string_ú_2, var12.string_ú, var12.string_ù, var13, var8});
            var10000 = var11;
         } while (var3 <= 0L);

         if (var11) {
            return;
         }
      }
   }

   private static String buildString(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      rip.breeze.inject.é var2 = (rip.breeze.inject.é)var0[1];
      long var3 = (Long)var0[2];
      BreezeClass12 var5 = (BreezeClass12)var0[3];
      var3 = encKey_b ^ var3;
      long var6 = var3 ^ 140278280824541L;
      long var8 = var3 ^ 52049431038338L;
      boolean var10000 = checkCondition();
      byte var10 = 0;
      boolean var11 = var10000;

      label22:
      while (true) {
         String var14 = var5.string_ú + "$" + buildString_2(new Object[]{var2, var6}) + var10;

         String var12;
         do {
            var12 = var14;

            do {
               String var10003 = var5.string_ù;
               if (MathUtil3.isValid(new Object[]{var8, var1, var12, var10003})) {
                  continue label22;
               }
            } while (var3 <= 0L);

            var14 = var12;
         } while (!var11);

         return var12;
      }
   }

   private static String buildString_2(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_b ^ var2;
      int var4 = var1.string_ú_2.lastIndexOf(47);
      return var4 == -1 ? var1.string_ú_2 : var1.string_ú_2.substring(var4 + 1);
   }

   public void processAll(Object[] var1) {
      ó var2 = (ó)var1[0];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var1[1];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var1[2];
      long var5 = (Long)var1[3];
      long var7 = var5 ^ 42272879072481L;
      long var9 = var5 ^ 531053254774L;
      long var11 = var5 ^ 89072101053672L;
      boolean var10000 = isValid();
      ô var13 = new ô();
      processAll(new Object[]{var4, var3, var9, var13});
      boolean var14 = var10000;
      rip.breeze.inject.é var15 = խ.method_006(new Object[]{var4, var13, var7});
      խ.method_007(new Object[]{var4, var15, var11});
      if (!rip.breeze.inject.ջ.method_013()) {
         var10000 = var14;
         if (var5 > 0L) {
            var10000 = !var14;
         }

         toggle(var10000);
      }
   }

   public static void toggle(boolean var0) {
      bool_þ = var0;
   }

   public static boolean isValid() {
      return bool_þ;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid();
      return !var0;
   }

   static {
      if (isValid()) {
         toggle(true);
      }
   }
}
