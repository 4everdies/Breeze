package rip.breeze.classtransform;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTarget$Shift;
import rip.breeze.inject.BreezeClass12;
import rip.breeze.inject.թ;

public class BreezeClass8 implements â {
   public List getList(Object[] var1) {
      Map var2 = (Map)var1[0];
      BreezeClass12 var3 = (BreezeClass12)var1[1];
      long var4 = (Long)var1[2];
      CTarget var6 = (CTarget)var1[3];
      long var7 = var4 ^ 43818621367306L;
      int var10000 = BreezeClass7.getValue();
      int var9 = var3.թ_ê.method_001(new Object[0]) - 1;
      int var10 = var10000;

      while (var9 >= 0) {
         թ var12 = var3.թ_ê;
         Object[] var10004 = new Object[]{null, var7};
         var10004[0] = var9;
         rip.breeze.inject.ջ var11 = var12.method_004(var10004);
         var10000 = var10;
         if (var4 >= 0L) {
            if (var10 != 0) {
               label52: {
                  rip.breeze.inject.ջ var14 = var11;
                  int var10001 = 0;
                  if (var4 > 0L) {
                     if (var11.method_004(new Object[0]) < 172) {
                        break label52;
                     }

                     var14 = var11;
                     var10001 = var10;
                  }

                  if (var4 > 0L) {
                     if (var10001 == 0) {
                        return Collections.singletonList(var14);
                     }

                     var10001 = 0;
                  }

                  if (var14.method_004(new Object[var10001]) <= 177) {
                     return Collections.singletonList(var11);
                  }
               }

               var9--;
            }

            var10000 = var10;
         }

         if (var10000 == 0) {
            break;
         }
      }

      return Collections.emptyList();
   }

   public CTarget$Shift getCTarget$Shift(Object[] var1) {
      CTarget var2 = (CTarget)var1[0];
      return CTarget$Shift.BEFORE;
   }
}
