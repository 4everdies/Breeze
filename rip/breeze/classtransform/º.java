package rip.breeze.classtransform;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.inject.BreezeClass12;

public class º implements â {
   @Override
   public List invoke_1(Object[] var1) {
      Map var2 = (Map)var1[0];
      BreezeClass12 var3 = (BreezeClass12)var1[1];
      long var4 = (Long)var1[2];
      CTarget var6 = (CTarget)var1[3];
      long var7 = var4 ^ 100218346529821L;
      long var9 = var4 ^ 24864204649383L;
      int var10000 = BreezeClass7.getValue();
      ArrayList var11 = new ArrayList();
      String var12 = var6.target();
      int var13 = var10000;
      int var14 = 0;
      rip.breeze.inject.ջ[] var15 = var3.թ_ê.method_010(new Object[]{var7});
      int var16 = var15.length;
      int var17 = 0;

      while (var17 < var16) {
         label72: {
            label71: {
               label83: {
                  rip.breeze.inject.ջ var18 = var15[var17];
                  rip.breeze.inject.ջ var20 = var18;
                  if (var13 != 0) {
                     if (!(var18 instanceof rip.breeze.inject.կ)) {
                        break label83;
                     }

                     var20 = var18;
                  }

                  rip.breeze.inject.կ var19 = (rip.breeze.inject.կ)var20;
                  var10000 = var13;
                  if (var4 < 0L) {
                     break label72;
                  }

                  if (var13 == 0) {
                     break label71;
                  }

                  String var10002 = var19.string_ç_2;
                  String var10003 = var19.string_æ_2;
                  String var10004 = var19.string_å_2;
                  var10000 = ւ.method_002(new Object[]{var12, var9, var10002, var10003, var10004});
                  if (var4 >= 0L) {
                     if (var10000 == 0) {
                        break label83;
                     }

                     var10000 = var6.ordinal();
                  }

                  label81: {
                     int var10001 = var13;
                     if (var4 > 0L) {
                        if (var13 == 0) {
                           break label81;
                        }

                        var10001 = -1;
                     }

                     label82: {
                        if (var4 > 0L) {
                           if (var10000 == var10001) {
                              break label82;
                           }

                           var10000 = var6.ordinal();
                           var10001 = var13;
                        }

                        if (var4 >= 0L) {
                           if (var10001 == 0) {
                              break label81;
                           }

                           var10001 = var14;
                        }

                        if (var10000 != var10001) {
                           break label81;
                        }
                     }

                     var11.add(var18);
                  }

                  var14++;
               }

               var17++;
            }

            var10000 = var13;
         }

         if (var10000 == 0) {
            break;
         }
      }

      return var11;
   }
}
