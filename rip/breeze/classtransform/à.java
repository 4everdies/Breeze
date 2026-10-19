package rip.breeze.classtransform;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.inject.BreezeClass12;

public class à implements â {
   private final int int_ÿ_2;
   private final int int_þ_2;

   public à() {
      this(-1, -1);
   }

   public à(int var1, int var2) {
      this.int_ÿ_2 = var1;
      this.int_þ_2 = var2;
   }

   @Override
   public List invoke_1(Object[] var1) {
      BreezeClass12 var3;
      long var4;
      CTarget var6;
      long var7;
      long var9;
      ArrayList var11;
      String var12;
      int var13;
      int var21;
      label139: {
         label138: {
            Map var2 = (Map)var1[0];
            var3 = (BreezeClass12)var1[1];
            var4 = (Long)var1[2];
            var6 = (CTarget)var1[3];
            var7 = var4 ^ 3894590544338L;
            var9 = var4 ^ 100218346529821L;
            var11 = new ArrayList();
            var21 = BreezeClass7.getValue_2();
            var12 = var6.target();
            var13 = var21;
            var21 = this.int_ÿ_2;
            byte var10001 = -1;
            if (var13 == 0) {
               if (this.int_ÿ_2 != -1) {
                  break label138;
               }

               var21 = this.int_þ_2;
               if (var13 != 0) {
                  break label139;
               }

               var10001 = -1;
            }

            if (var21 == var10001) {
               var21 = 1;
               break label139;
            }
         }

         var21 = 0;
      }

      int var14 = var21;
      int var15 = 0;
      rip.breeze.inject.ջ[] var16 = var3.թ_ê.method_010(new Object[]{var9});
      int var17 = var16.length;
      int var18 = 0;

      label127:
      while (var18 < var17) {
         rip.breeze.inject.ջ var19 = var16[var18];
         var21 = var19 instanceof rip.breeze.inject.պ;

         do {
            label123: {
               label122: {
                  label149: {
                     int var25 = var13;
                     if (var4 > 0L) {
                        if (var13 == 0) {
                           if (var21 == 0) {
                              break label149;
                           }

                           var21 = var14;
                        }

                        var25 = var13;
                     }

                     label146: {
                        if (var4 >= 0L) {
                           if (var25 == 0) {
                              if (var21 != 0) {
                                 break label146;
                              }

                              var21 = this.int_ÿ_2;
                           }

                           var25 = var19.method_004(new Object[0]);
                        }

                        if (var13 == 0) {
                           if (var21 == var25) {
                              break label146;
                           }

                           var21 = this.int_þ_2;
                           var25 = var19.method_004(new Object[0]);
                        }

                        if (var21 != var25) {
                           break label149;
                        }
                     }

                     rip.breeze.inject.պ var20 = (rip.breeze.inject.պ)var19;
                     var21 = var13;
                     if (var4 < 0L) {
                        break label123;
                     }

                     if (var13 != 0) {
                        break label122;
                     }

                     String var10004 = var20.string_å_2;
                     var21 = ւ.method_004(new Object[]{var12, var20.string_ç_2, var20.string_æ_2, var7, var10004});
                     if (var4 > 0L) {
                        if (var21 == 0) {
                           break label149;
                        }

                        var21 = var6.ordinal();
                     }

                     label147: {
                        var25 = var13;
                        if (var4 > 0L) {
                           if (var13 != 0) {
                              break label147;
                           }

                           var25 = -1;
                        }

                        label148: {
                           if (var4 > 0L) {
                              if (var21 == var25) {
                                 break label148;
                              }

                              var21 = var6.ordinal();
                              var25 = var13;
                           }

                           if (var4 > 0L) {
                              if (var25 != 0) {
                                 break label147;
                              }

                              var25 = var15;
                           }

                           if (var21 != var25) {
                              break label147;
                           }
                        }

                        var11.add(var19);
                     }

                     var15++;
                  }

                  var18++;
               }

               var21 = var13;
            }

            if (var21 == 0) {
               continue label127;
            }

            var21 = rip.breeze.inject.ջ.method_013();
         } while (var4 < 0L);

         if (var4 >= 0L) {
            var21 = var21 != 0 ? 0 : 1;
         }

         rip.breeze.inject.ջ.method_011((boolean)var21);
         break;
      }

      return var11;
   }
}
