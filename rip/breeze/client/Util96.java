package rip.breeze.client;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import rip.breeze.LicenseState;
import rip.breeze.Util28;

class Util96 implements IBreezeInterface {
   static final Util96 CONST_A = new Util96();

   public boolean isValid(long var1, String var3) {
      return var3.startsWith("{");
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Object getObject(String var1, AtomicInteger var2, long var3, Util112 var5) {
      long var10001 = var3 ^ 99007734465094L;
      int var6 = (int)((var3 ^ 99007734465094L) >>> 48);
      int var7 = (int)((var3 ^ 99007734465094L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      var10001 = var3 ^ 28519061269271L;
      int var9 = (int)((var3 ^ 28519061269271L) >>> 32);
      int var10 = (int)((var3 ^ 28519061269271L) << 32 >>> 40);
      int var11 = (int)(var10001 << 56 >>> 56);
      long var12 = var3 ^ 75504909162917L;
      var10001 = var3 ^ 132386385577745L;
      int var14 = (int)((var3 ^ 132386385577745L) >>> 48);
      int var15 = (int)((var3 ^ 132386385577745L) << 16 >>> 32);
      int var16 = (int)(var10001 << 48 >>> 48);
      var10001 = var3 ^ 88622662033979L;
      int var17 = (int)((var3 ^ 88622662033979L) >>> 32);
      int var18 = (int)((var3 ^ 88622662033979L) << 32 >>> 48);
      int var19 = (int)(var10001 << 48 >>> 48);
      AtomicInteger var20 = var5.atomicInteger_b;
      int var21 = var20.get();
      String[] var10000 = Util28.values();
      int var22 = var2.get();
      byte var23 = 1;
      byte var24 = 0;
      byte var25 = 0;
      StringBuilder var26 = new StringBuilder();
      String[] var27 = var10000;
      HashMap var28 = new HashMap();
      StringBuilderUtil var29 = new StringBuilderUtil();
      int var30 = var2.incrementAndGet();

      label194:
      while (true) {
         if (var2.get() < var1.length()) {
            var35 = var1.charAt(var30);
         } else {
            var35 = (char)var25;
            if (var3 >= 0L) {
               break;
            }
         }

         while (true) {
            label201: {
               char var31 = var35;
               char var36 = (char)var24;
               if (var3 >= 0L) {
                  if (var24 != 0) {
                     var36 = Character.isWhitespace(var31);
                     if (var3 > 0L) {
                        if (var36 == 0) {
                           Object var32 = Util103.CONST_A
                              .getObject(
                                 var1,
                                 (char)var6,
                                 var2,
                                 var5.getClientUtil69(Util137.getDataBuilder23(var26.toString(), var9, var5, var10, (byte)var11)),
                                 (short)var7,
                                 var8
                              );
                           if (var3 <= 0L) {
                              return var29;
                           }

                           if (var32 instanceof StringBuilderUtil) {
                              var29.initialize((StringBuilderUtil)var32);
                              return var29;
                           }

                           String var33 = var26.toString().trim();
                           Object var34 = var28.put(var33, var32);
                           if (var3 >= 0L) {
                              if (var34 != null) {
                                 var29.update_5(var33, var12, var5.atomicInteger_b.get());
                                 return var29;
                              }

                              var26 = new StringBuilder();
                              var24 = 0;
                           }

                           if (var3 < 0L) {
                              if (var27 == null) {
                                 break;
                              }
                              break label201;
                           }

                           if (var27 == null) {
                              var30 = var2.incrementAndGet();
                              if (var27 == null) {
                                 break;
                              }
                              break label201;
                           }

                           var36 = var31;
                        } else {
                           var36 = var31;
                        }
                     }
                  } else {
                     var36 = var31;
                  }
               }

               byte var41 = 44;
               if (var3 >= 0L) {
                  if (var36 == ',') {
                     var23 = 1;
                     var24 = 0;
                     var26 = new StringBuilder();
                     if (var3 <= 0L) {
                        if (var27 == null) {
                           break;
                        }
                        break label201;
                     }

                     if (var27 == null) {
                        var30 = var2.incrementAndGet();
                        if (var27 == null) {
                           break;
                        }
                        break label201;
                     }

                     var36 = var31;
                     var41 = 61;
                  } else {
                     var36 = var31;
                     var41 = 61;
                  }
               }

               if (var3 >= 0L) {
                  if (var36 == var41) {
                     var23 = 0;
                     var24 = 1;
                     if (var3 <= 0L) {
                        if (var27 == null) {
                           break;
                        }
                        break label201;
                     }

                     if (var27 == null) {
                        var30 = var2.incrementAndGet();
                        if (var27 == null) {
                           break;
                        }
                        break label201;
                     }
                  }

                  var36 = var31;
                  if (var3 < 0L) {
                     if (var3 >= 0L) {
                        if (var31 != 0) {
                           var26.append(var31);
                        }

                        var30 = var2.incrementAndGet();
                        if (var27 == null) {
                           break;
                        }
                     } else {
                        var30 = var31;
                        if (var27 == null) {
                           break;
                        }
                     }
                     break label201;
                  }

                  var41 = 125;
               }

               if (var36 == var41) {
                  var35 = 1;
                  if (var3 < 0L) {
                     break label194;
                  }

                  var25 = 1;
                  if (var27 != null) {
                     if (var3 >= 0L) {
                        if (var23 != 0) {
                           var26.append(var31);
                        }

                        var30 = var2.incrementAndGet();
                        if (var27 == null) {
                           break;
                        }
                     } else {
                        var30 = var23;
                        if (var27 == null) {
                           break;
                        }
                     }
                  }
               } else if (var3 >= 0L) {
                  if (var23 != 0) {
                     var26.append(var31);
                  }

                  var30 = var2.incrementAndGet();
                  if (var27 == null) {
                     break;
                  }
               } else {
                  var30 = var23;
                  if (var27 == null) {
                     break;
                  }
               }
            }

            var35 = (char)var25;
            if (var3 >= 0L) {
               break label194;
            }
         }
      }

      if (var3 >= 0L) {
         if (var35 == 0) {
            var29.update_11(var5.dataBuilder23_a.getString_b(), var17, (short)var18, var19, var1.substring(var22), var21);
         }

         if (var3 <= 0L) {
            return var29;
         }

         var35 = var29.isValid((short)var14, var15, (char)var16);
      }

      if (var35 == 0) {
         byte var42 = LicenseState.checkCondition();
         if (var3 > 0L) {
            if (var42 == 0) {
               return var28;
            }

            var42 = 4;
         }

         Util28.initialize_4(new String[var42]);
         return var28;
      } else {
         return var29;
      }
   }

   private Util96() {
   }
}
