package rip.breeze.classtransform;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.inject.BreezeClass12;

public class ª implements â {
   @Override
   public List invoke_1(Object[] var1) {
      Map var2 = (Map)var1[0];
      BreezeClass12 var3 = (BreezeClass12)var1[1];
      long var4 = (Long)var1[2];
      CTarget var6 = (CTarget)var1[3];
      long var7 = var4 ^ 100218346529821L;
      int var10000 = BreezeClass7.getValue_2();
      ArrayList var9 = new ArrayList();
      int var10 = this.method_001(new Object[]{var6.target()});
      int var11 = var10000;
      var10000 = var10;
      if (var11 == 0) {
         if (var10 == -1) {
            return null;
         }

         var10000 = 0;
      }

      int var12 = var10000;

      for (rip.breeze.inject.ջ var16 : var3.թ_ê.method_010(new Object[]{var7})) {
         label60: {
            label58: {
               var10000 = var16.method_004(new Object[0]);
               int var10001 = var10;
               if (var11 == 0) {
                  if (var10000 != var10) {
                     break label60;
                  }

                  var10000 = var6.ordinal();
                  if (var11 != 0) {
                     break label58;
                  }

                  var10001 = -1;
               }

               if (var10000 != var10001) {
                  var10000 = var6.ordinal();
                  var10001 = var11;
                  if (var4 >= 0L) {
                     if (var11 != 0) {
                        break label58;
                     }

                     var10001 = var12;
                  }

                  if (var10000 != var10001) {
                     break label58;
                  }
               }

               var9.add(var16);
            }

            var12++;
         }

         if (var11 != 0) {
            break;
         }
      }

      return var9;
   }

   private int invoke_1(Object[] var1) {
      String var2 = (String)var1[0];

      try {
         return Integer.parseInt(var2);
      } catch (Throwable var5) {
         try {
            return rip.breeze.inject.IFunctional.class.getDeclaredField(var2.toUpperCase(Locale.ROOT)).getInt(null);
         } catch (Throwable var4) {
            return -1;
         }
      }
   }
}
