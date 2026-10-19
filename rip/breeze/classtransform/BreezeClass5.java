package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import rip.breeze.classtransform.annotations.injection.CInject;
import rip.breeze.classtransform.annotations.injection.CRedirect;
import rip.breeze.inject.BreezeClass12;

public class BreezeClass5 extends BreezeColor {
   private static int int_þ;

   @Override
   public void invoke_1(Object[] var1) {
      ó var2 = (ó)var1[0];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var1[1];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var1[2];
      long var5 = (Long)var1[3];
      long var7 = var5 ^ 36128881974565L;
      int var10000 = getValue_2();
      List var9 = var3.list_ä_2.stream().filter(BreezeClass5::lambda$transform_Inner0).collect(Collectors.toList());
      Iterator var10 = var9.iterator();
      int var11 = var10000;

      while (var10.hasNext()) {
         BreezeClass12 var12 = (BreezeClass12)var10.next();
         String var10003 = var3.string_ú_2;
         ր.method_001(new Object[]{var7, var3, var12, var10003});
         if (var11 != 0) {
            break;
         }
      }
   }

   private static boolean lambda$transform_Inner0(BreezeClass12 var0) {
      long var1 = 50181021735801L;
      long var3 = var1 ^ 135467522882918L;
      int var5 = getValue_2();
      boolean var10000 = չ.method_060(new Object[]{var0, var3, CInject.class});
      if (var5 == 0) {
         if (!var10000) {
            var10000 = չ.method_060(new Object[]{var0, var3, CRedirect.class});
            if (var5 != 0) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public static void initialize(int var0) {
      int_þ = var0;
   }

   public static int getValue() {
      return int_þ;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 99 : 0;
   }

   static {
      if (getValue_2() != 0) {
         initialize(42);
      }
   }
}
