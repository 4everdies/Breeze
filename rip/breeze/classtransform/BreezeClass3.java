package rip.breeze.classtransform;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import rip.breeze.inject.BreezeClass12;

public abstract class BreezeClass3<T extends Annotation> extends BreezeColor {
   private final Class<? extends Annotation> class_þ;
   private static boolean bool_ý;

   public BreezeClass3(Class<T> var1) {
      this.class_þ = var1;
   }

   public final void processAll(Object[] var1) {
      ó var2 = (ó)var1[0];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var1[1];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var1[2];
      long var5 = (Long)var1[3];
      long var7 = var5 ^ 27460633869661L;
      long var9 = var5 ^ 44360645430440L;
      long var11 = var5 ^ 21656768018752L;
      byte var10000 = checkCondition();
      Iterator var13 = var4.list_ä_2.iterator();
      byte var14 = var10000;

      while (true) {
         if (var13.hasNext()) {
            BreezeClass12 var15 = (BreezeClass12)var13.next();
            Annotation var16 = this.ü(new Object[]{this.class_þ, var15, var9, var2});
            if (var5 <= 0L) {
               return;
            }

            if (var16 == null) {
               continue;
            }

            Annotation var10001;
            label62: {
               var17 = this;
               var10001 = var16;
               byte var10002 = var14;
               if (var5 > 0L) {
                  if (var14 != 0) {
                     break label62;
                  }

                  var10002 = 1;
               }

               Object[] var10003 = new Object[var10002];
               var10003[0] = var16;
               if (!this.isValid(var10003)) {
                  continue;
               }

               var13.remove();
               var17 = this;
               var10001 = var16;
            }

            var17.processAll(new Object[]{var10001, var2, var3, var4, MathUtil3.getBreezeClass12_2(new Object[]{var7, var15}), var11});
            var10000 = var14;
            if (var5 <= 0L) {
               break;
            }

            if (var14 == 0) {
               continue;
            }
         }

         var10000 = rip.breeze.inject.ջ.method_012();
         break;
      }

      if (var5 > 0L) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var14;
      }

      if (var5 >= 0L) {
         var10000 = (byte)(var10000 != 0 ? 0 : 1);
      }

      toggle((boolean)var10000);
   }

   public abstract void processAll(Object[] var1);

   public boolean isValid(Object[] var1) {
      Annotation var2 = (Annotation)var1[0];
      return true;
   }

   public static void toggle(boolean var0) {
      bool_ý = var0;
   }

   public static boolean isValid_2() {
      return bool_ý;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid_2();
      return !var0;
   }

   static {
      if (!isValid_2()) {
         toggle(true);
      }
   }
}
