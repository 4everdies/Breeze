package rip.breeze.client;

import java.util.concurrent.atomic.AtomicInteger;
import rip.breeze.StringDecryptor;
import rip.breeze.Util28;

class Util101 {

   static Util132 getDataBuilder11(short var0, String var1, int var2, char var3) {
      long var4 = ((long)var0 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ 113122904366010L;
      long var6 = var4 ^ 60874051382362L;
      long var8 = var4 ^ 16982366692834L;
      long var10001 = var4 ^ 71687584921146L;
      int var10 = (int)((var4 ^ 71687584921146L) >>> 48);
      int var11 = (int)((var4 ^ 71687584921146L) << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      long var13 = var4 ^ 19471292814580L;
      var10001 = var4 ^ 109231800005485L;
      int var15 = (int)((var4 ^ 109231800005485L) >>> 48);
      int var16 = (int)((var4 ^ 109231800005485L) << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);
      var10001 = var4 ^ 82859227969226L;
      int var18 = (int)((var4 ^ 82859227969226L) >>> 32);
      int var19 = (int)((var4 ^ 82859227969226L) << 32 >>> 40);
      int var20 = (int)(var10001 << 56 >>> 56);
      long var21 = var4 ^ 108702316960775L;
      long var23 = var4 ^ 128122284904458L;
      long var25 = var4 ^ 20263130556269L;
      var10001 = var4 ^ 20596934488273L;
      int var27 = (int)((var4 ^ 20596934488273L) >>> 48);
      int var28 = (int)((var4 ^ 20596934488273L) << 16 >>> 48);
      int var29 = (int)(var10001 << 32 >>> 32);
      String[] var10000 = Util28.values();
      Util132 var30 = new Util132();
      String[] var31 = var10000;
      if (var1.isEmpty()) {
         return var30;
      }

      AtomicInteger var32 = new AtomicInteger();
      byte var33 = 0;
      AtomicInteger var34 = new AtomicInteger(1);
      Util137 var35 = null;
      Object var36 = null;
      int var37 = var32.get();

      while (var37 < var1.length()) {
         char var38 = var1.charAt(var37);
         char var40 = var30.dataBuilder12_a.isValid((short)var15, var16, (char)var17);
         if (var3 > 0) {
            if (var40 != 0 && var31 == null) {
               break;
            }

            var40 = var38;
         }

         label187: {
            label186: {
               label195: {
                  label184:
                  if (var0 >= 0) {
                     if (var40 == '#') {
                        var40 = (char)var33;
                        if (var2 <= 0) {
                           break label184;
                        }

                        if (var33 == 0) {
                           var33 = 1;
                           var10000 = var31;
                           if (var2 <= 0) {
                              break label187;
                           }

                           if (var31 == null) {
                              break label195;
                           }
                        }
                     }

                     var40 = Character.isWhitespace(var38);
                  }

                  label173:
                  if (var0 >= 0) {
                     if (var40 == 0) {
                        var40 = (char)var33;
                        if (var0 < 0) {
                           break label173;
                        }

                        label169:
                        if (var33 == 0) {
                           Util137 var42 = var35;
                           if (var0 >= 0) {
                              if (var35 != null) {
                                 break label169;
                              }

                              var42 = Util114.CONST_A.getDataBuilder23(var18, var1, var32, new Util112(null, var34, var30.dataBuilder12_a), var19, (byte)var20);
                           }

                           label162: {
                              label197: {
                                 Util137 var39 = var42;
                                 Util137 var43 = var39;
                                 if (var2 >= 0) {
                                    if (var39 == Util137.CONST_A) {
                                       break label197;
                                    }

                                    var43 = var39;
                                 }

                                 boolean var44 = var43.isValid(var25);
                                 if (var2 >= 0) {
                                    if (var44) {
                                       var35 = var39;
                                       var10000 = var31;
                                       if (var0 < 0) {
                                          break label162;
                                       }

                                       if (var31 == null) {
                                          break label197;
                                       }
                                    }

                                    var44 = var39.isValid_2(var21);
                                 }

                                 if (var2 > 0) {
                                    if (var44) {
                                       var30.calculate_2(var23, var39, var34);
                                       var10000 = var31;
                                       if (var3 < 0) {
                                          break label162;
                                       }

                                       if (var31 == null) {
                                          break label197;
                                       }
                                    }

                                    var44 = var39.isValid_3(var8);
                                 }

                                 if (var44) {
                                    var30.calculate(var39, (char)var27, (char)var28, var34, var29);
                                 }
                              }

                              var10000 = var31;
                           }

                           if (var3 <= 0) {
                              break label187;
                           }

                           if (var10000 == null) {
                              break label195;
                           }
                        }
                     }

                     var40 = var38;
                  }

                  if (var0 >= 0) {
                     if (var40 == '\n') {
                        var33 = 0;
                        var35 = null;
                        var36 = null;
                        var34.incrementAndGet();
                        break label195;
                     }

                     var40 = (char)var33;
                  }

                  label128: {
                     if (var40 == 0) {
                        var10000 = var35;
                        if (var0 < 0) {
                           break label128;
                        }

                        if (var35 != null) {
                           var10000 = var35;
                           if (var2 < 0) {
                              break label128;
                           }

                           if (var35.isValid(var25)) {
                              var10000 = (String[])var36;
                              if (var2 < 0) {
                                 break label128;
                              }

                              label121:
                              if (var36 == null) {
                                 label199: {
                                    boolean var46 = Character.isWhitespace(var38);
                                    if (var2 > 0) {
                                       if (var46) {
                                          break label121;
                                       }

                                       var36 = Util103.CONST_A
                                          .getObject(var1, (char)var10, var32, new Util112(var35, var34, var30.dataBuilder12_a), (short)var11, var12);
                                       if (var0 < 0) {
                                          break label199;
                                       }

                                       var46 = var36 instanceof StringBuilderUtil;
                                    }

                                    if (var46) {
                                       var30.dataBuilder12_a.initialize((StringBuilderUtil)var36);
                                       var10000 = var31;
                                       if (var2 <= 0) {
                                          break label187;
                                       }

                                       if (var31 == null) {
                                          break label195;
                                       }
                                    }

                                    var30.processAll(var35.getString_b(), var36, var34, var6);
                                 }

                                 var10000 = var31;
                                 if (var3 < 0) {
                                    break label187;
                                 }

                                 if (var31 == null) {
                                    break label195;
                                 }
                              }
                           }
                        }
                     }

                     var10000 = (String[])var36;
                  }

                  if (var10000 != null) {
                     var47 = var33;
                     if (var0 < 0) {
                        break label186;
                     }

                     if (var33 == 0) {
                        var47 = Character.isWhitespace(var38);
                        if (var3 < 0) {
                           break label186;
                        }

                        if (var47 == 0) {
                           var30.dataBuilder12_a.update_6(var13, var35, var38, var34.get());
                        }
                     }
                  }
               }

               var47 = var32.incrementAndGet();
            }

            var37 = var47;
            var10000 = var31;
         }

         if (var10000 != null) {
            break;
         }
      }

      return var30;
   }
}
