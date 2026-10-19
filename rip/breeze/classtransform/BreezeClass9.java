package rip.breeze.classtransform;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTarget$Shift;
import rip.breeze.inject.BreezeClass12;

public class BreezeClass9 implements â {
   public List getList(Object[] var1) {
      Map var2 = (Map)var1[0];
      BreezeClass12 var3 = (BreezeClass12)var1[1];
      long var4 = (Long)var1[2];
      CTarget var6 = (CTarget)var1[3];
      long var7 = var4 ^ 100218346529821L;
      ArrayList var9 = new ArrayList();
      int var10000 = BreezeClass7.getValue();
      int var10 = 0;
      rip.breeze.inject.ջ[] var11 = var3.թ_ê.method_010(new Object[]{var7});
      int var12 = var10000;
      int var13 = var11.length;
      int var14 = 0;

      while (var14 < var13) {
         rip.breeze.inject.ջ var15 = var11[var14];
         var10000 = var12;
         if (var4 >= 0L) {
            if (var12 != 0) {
               label71: {
                  var10000 = var15.method_004(new Object[0]);
                  int var10001 = 172;
                  if (var4 >= 0L) {
                     if (var10000 < 172) {
                        break label71;
                     }

                     var10000 = var15.method_004(new Object[0]);
                     var10001 = 177;
                  }

                  label69: {
                     if (var12 != 0) {
                        if (var10000 > var10001) {
                           break label71;
                        }

                        var10000 = var6.ordinal();
                        if (var12 == 0) {
                           break label69;
                        }

                        var10001 = -1;
                     }

                     if (var10000 != var10001) {
                        var10000 = var6.ordinal();
                        var10001 = var12;
                        if (var4 >= 0L) {
                           if (var12 == 0) {
                              break label69;
                           }

                           var10001 = var10;
                        }

                        if (var10000 != var10001) {
                           break label69;
                        }
                     }

                     var9.add(var15);
                  }

                  var10++;
               }

               var14++;
            }

            var10000 = var12;
         }

         if (var10000 == 0) {
            break;
         }
      }

      return var9;
   }

   public CTarget$Shift getCTarget$Shift(Object[] var1) {
      CTarget var2 = (CTarget)var1[0];
      return CTarget$Shift.BEFORE;
   }
}
