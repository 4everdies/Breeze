package rip.breeze.classtransform;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTarget$Shift;
import rip.breeze.inject.BreezeClass12;

public class BreezeClass7 implements â {
   private static int int_ÿ;

   public List getList(Object[] var1) {
      Map var2 = (Map)var1[0];
      BreezeClass12 var3 = (BreezeClass12)var1[1];
      long var4 = (Long)var1[2];
      CTarget var6 = (CTarget)var1[3];
      long var7 = var4 ^ 100218346529821L;
      ArrayList var9 = new ArrayList();
      int var10 = 0;
      int var10000 = getValue();
      rip.breeze.inject.ջ[] var11 = var3.թ_ê.method_010(new Object[]{var7});
      int var12 = var10000;
      int var13 = var11.length;
      int var14 = 0;

      while (var14 < var13) {
         rip.breeze.inject.ջ var15 = var11[var14];
         var10000 = var12;
         if (var4 >= 0L) {
            if (var12 != 0) {
               label73: {
                  var10000 = var15.method_004(new Object[0]);
                  int var10001 = 191;
                  if (var4 > 0L) {
                     if (var10000 != 191) {
                        break label73;
                     }

                     var10000 = var6.ordinal();
                     var10001 = var12;
                  }

                  label71: {
                     if (var4 >= 0L) {
                        if (var10001 == 0) {
                           break label71;
                        }

                        var10001 = -1;
                     }

                     label72: {
                        if (var4 > 0L) {
                           if (var10000 == var10001) {
                              break label72;
                           }

                           var10000 = var6.ordinal();
                           var10001 = var12;
                        }

                        if (var4 > 0L) {
                           if (var10001 == 0) {
                              break label71;
                           }

                           var10001 = var10;
                        }

                        if (var10000 != var10001) {
                           break label71;
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

   public static void initialize(int var0) {
      int_ÿ = var0;
   }

   public static int getValue() {
      return int_ÿ;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 3 : 0;
   }

   static {
      if (getValue_2() != 0) {
         initialize(39);
      }
   }
}
