package rip.breeze.inject;

import java.util.ArrayList;
import java.util.List;

final class ԑ {
   final ճ ճ_ÿ_2;
   final boolean[] arr_þ_2;
   final List<մ> list_ý_2;

   ԑ(ճ var1, int var2, մ var3) {
      this.ճ_ÿ_2 = var1;
      this.arr_þ_2 = new boolean[var2];
      this.list_ý_2 = new ArrayList<>();
      this.list_ý_2.add(var3);
   }

   ԑ(ԑ var1) {
      this.ճ_ÿ_2 = var1.ճ_ÿ_2;
      this.arr_þ_2 = (boolean[])var1.arr_þ_2.clone();
      this.list_ý_2 = new ArrayList<>(var1.list_ý_2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public boolean check_1(Object[] var1) {
      ԑ var2 = (ԑ)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      String[] var10000 = ԟ.method_015();
      boolean var5 = false;
      String[] var6 = var10000;
      int var7 = 0;

      label153:
      while (true) {
         if (var7 < this.arr_þ_2.length) {
            var11 = var2.arr_þ_2[var7];
            String[] var10001 = var6;
            if (var3 >= 0L) {
               if (var6 != null) {
                  break;
               }

               var10001 = var6;
            }

            if (var3 >= 0L) {
               if (var10001 == null) {
                  if (var11) {
                     boolean var12 = this.arr_þ_2[var7];
                     if (var6 == null) {
                        if (!var12) {
                           this.arr_þ_2[var7] = true;
                           var5 = true;
                        }
                     } else {
                        var5 = var12;
                     }

                     var7++;
                     if (var6 == null) {
                        continue;
                     }
                  } else {
                     var7++;
                     if (var6 == null) {
                        continue;
                     }
                  }
               } else {
                  if (var6 == null) {
                     if (!var11) {
                        this.arr_þ_2[var7] = true;
                        var5 = true;
                     }
                  } else {
                     var5 = var11;
                  }

                  var7++;
                  if (var6 == null) {
                     continue;
                  }
               }
            } else {
               if (var10001 == null) {
                  if (!var11) {
                     this.arr_þ_2[var7] = true;
                     var5 = true;
                  }
               } else {
                  var5 = var11;
               }

               var7++;
               if (var6 == null) {
                  continue;
               }
            }
         }

         while (var3 <= 0L) {
            boolean var17 = var2.arr_þ_2[var7];
            String[] var15 = var6;
            if (var3 >= 0L) {
               if (var6 != null) {
                  return var17;
               }

               var15 = var6;
            }

            if (var3 >= 0L) {
               if (var15 == null) {
                  if (var17) {
                     boolean var13 = this.arr_þ_2[var7];
                     if (var6 == null) {
                        if (!var13) {
                           this.arr_þ_2[var7] = true;
                           var5 = true;
                        }
                     } else {
                        var5 = var13;
                     }

                     var7++;
                     if (var6 == null) {
                        continue label153;
                     }
                  } else {
                     var7++;
                     if (var6 == null) {
                        continue label153;
                     }
                  }
               } else {
                  if (var6 == null) {
                     if (!var17) {
                        this.arr_þ_2[var7] = true;
                        var5 = true;
                     }
                  } else {
                     var5 = var17;
                  }

                  var7++;
                  if (var6 == null) {
                     continue label153;
                  }
               }
            } else {
               if (var15 == null) {
                  if (!var17) {
                     this.arr_þ_2[var7] = true;
                     var5 = true;
                  }
               } else {
                  var5 = var17;
               }

               var7++;
               if (var6 == null) {
                  continue label153;
               }
            }
         }

         if (var2.ճ_ÿ_2 == this.ճ_ÿ_2) {
            var7 = 0;

            while (var7 < var2.list_ý_2.size()) {
               մ var8 = var2.list_ý_2.get(var7);
               var10000 = var6;
               if (var3 > 0L) {
                  if (var6 == null) {
                     boolean var16 = this.list_ý_2.contains(var8);
                     if (var6 != null) {
                        return var16;
                     }

                     if (!var16) {
                        this.list_ý_2.add(var8);
                        var5 = true;
                     }

                     var7++;
                  }

                  var10000 = var6;
               }

               if (var10000 != null) {
                  break;
               }
            }
         }

         var11 = var5;
         break;
      }

      return var11;
   }
}
