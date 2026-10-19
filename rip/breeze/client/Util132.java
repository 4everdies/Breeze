package rip.breeze.client;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import rip.breeze.StringDecryptor;
import rip.breeze.Util28;

class Util132 {
   final StringBuilderUtil dataBuilder12_a = new StringBuilderUtil();
   private final Set<String> set_b = new HashSet<>();
   private final Deque<Util110> deque_c = new ArrayDeque<>();

   Util132() {
      this.deque_c.push(new Util136(""));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   void processAll(String var1, Object var2, AtomicInteger var3, long var4) {
      var4 = 44801881221916L ^ var4;
      long var6 = var4 ^ 44801881221916L;
      long var10001 = var4 ^ 32079603111981L;
      int var8 = (int)((var4 ^ 32079603111981L) >>> 32);
      int var9 = (int)((var4 ^ 32079603111981L) << 32 >>> 40);
      int var10 = (int)(var10001 << 56 >>> 56);
      long var11 = var4 ^ 70879217658527L;
      long var13 = var4 ^ 129943514618002L;
      long var15 = var4 ^ 117024130520961L;
      var10001 = var4 ^ 998408252648L;
      int var17 = (int)((var4 ^ 998408252648L) >>> 32);
      int var18 = (int)((var4 ^ 998408252648L) << 32 >>> 40);
      int var19 = (int)(var10001 << 56 >>> 56);
      long var20 = var4 ^ 118080785471308L;
      long var22 = var4 ^ 35606889873887L;
      String[] var10000 = Util28.values();
      Util110 var24 = this.deque_c.peek();
      String[] var25 = var10000;
      if (!(var2 instanceof Map)) {
         boolean var37 = var24.containsKey(var1, var15);
         if (var4 > 0L) {
            label69: {
               if (var37) {
                  var24.put(var1, var2);
                  var10000 = var25;
                  if (var4 < 0L) {
                     break label69;
                  }

                  if (var25 == null) {
                     return;
                  }
               }

               var10000 = (String[])var24.get(var1);
            }

            var37 = var10000 instanceof Util110;
         }

         label79: {
            if (var37) {
               var39 = this.dataBuilder12_a;
               if (var4 <= 0L) {
                  break label79;
               }

               this.dataBuilder12_a.update_2(var17, var18, var1, var3, (byte)var19);
               if (var25 == null) {
                  return;
               }
            }

            var39 = this.dataBuilder12_a;
         }

         int var43;
         label89: {
            AtomicInteger var42 = var3;
            if (var4 >= 0L) {
               if (var3 == null) {
                  var43 = -1;
                  break label89;
               }

               var42 = var3;
            }

            var43 = var42.get();
         }

         var39.update_5(var1, var11, var43);
      } else {
         label128: {
            label134: {
               String var26 = this.buildString(var13, var1);
               String var32 = var26;
               if (var4 > 0L) {
                  if (var26 == null) {
                     this.getClientUtil67(var1, var22, var3);
                     var33 = var25;
                     if (var4 < 0L) {
                        break label128;
                     }

                     if (var25 == null) {
                        break label134;
                     }
                  }

                  var32 = var26;
               }

               if (var32.isEmpty()) {
                  this.calculate_2(var20, Util137.getDataBuilder23(var1, var8, null, var9, (byte)var10), var3);
                  var33 = var25;
                  if (var4 <= 0L) {
                     break label128;
                  }

                  if (var25 == null) {
                     break label134;
                  }
               }

               this.calculate_2(var20, Util137.getDataBuilder23(var26, var8, null, var9, (byte)var10), var3);
            }

            var33 = var2;
         }

         Map var27 = (Map)var33;
         Iterator var28 = var27.entrySet().iterator();

         while (true) {
            if (var28.hasNext()) {
               Entry var29 = (Entry)var28.next();
               this.processAll((String)var29.getKey(), var29.getValue(), var3, var6);
               if (var25 == null) {
                  continue;
               }
            }

            do {
               this.deque_c.pop();
               if (var4 > 0L) {
                  if (var25 == null) {
                     return;
                  }

                  boolean var34 = var24.containsKey(var1, var15);
                  if (var4 > 0L) {
                     label58: {
                        if (var34) {
                           var24.put(var1, var2);
                           var10000 = var25;
                           if (var4 < 0L) {
                              break label58;
                           }

                           if (var25 == null) {
                              return;
                           }
                        }

                        var10000 = (String[])var24.get(var1);
                     }

                     var34 = var10000 instanceof Util110;
                  }

                  label50: {
                     if (var34) {
                        var36 = this.dataBuilder12_a;
                        if (var4 <= 0L) {
                           break label50;
                        }

                        this.dataBuilder12_a.update_2(var17, var18, var1, var3, (byte)var19);
                        if (var25 == null) {
                           return;
                        }
                     }

                     var36 = this.dataBuilder12_a;
                  }

                  int var41;
                  label42: {
                     AtomicInteger var10002 = var3;
                     if (var4 >= 0L) {
                        if (var3 == null) {
                           var41 = -1;
                           break label42;
                        }

                        var10002 = var3;
                     }

                     var41 = var10002.get();
                  }

                  var36.update_5(var1, var11, var41);
                  return;
               }

               Entry var31 = (Entry)var25;
               this.processAll((String)var31.getKey(), var31.getValue(), var3, var6);
            } while (var25 != null);
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   void calculate(Util137 var1, char var2, char var3, AtomicInteger var4, int var5) {
      long var6 = ((long)var2 << 48 | (long)var3 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ 44801881221916L;
      long var8 = var6 ^ 14678066788247L;
      long var10001 = var6 ^ 53357135788682L;
      int var10 = (int)((var6 ^ 53357135788682L) >>> 32);
      int var11 = (int)((var6 ^ 53357135788682L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      var10001 = var6 ^ 47180071071548L;
      int var13 = (int)((var6 ^ 47180071071548L) >>> 48);
      int var14 = (int)((var6 ^ 47180071071548L) << 16 >>> 48);
      int var15 = (int)(var10001 << 32 >>> 32);
      long var16 = var6 ^ 9320163770724L;
      long var18 = var6 ^ 87445760183050L;
      String[] var10000 = Util28.values();
      String var20 = var1.buildString(var10, var11, (short)var12);
      String[] var21 = var10000;

      while (true) {
         if (this.deque_c.size() > 1) {
            this.deque_c.pop();
            if (var21 == null) {
               continue;
            }
         }

         do {
            Util98[] var22 = Util97.parseEntries(var20, (char)var13, (short)var14, var15);
            if (var5 < 0) {
               int var23 = 0;

               while (var23 < var22.length) {
                  label89: {
                     label88: {
                        label109: {
                           String var24 = var22[var23].string_a;
                           Util110 var25 = this.deque_c.peek();
                           int var29 = var25.get(var24) instanceof Util111;
                           if (var5 < 0) {
                              if (var29 != 0) {
                                 Util111 var26 = (Util111)var25.get(var24);
                                 this.deque_c.push(var26);
                                 if (var2 >= 0) {
                                    if (var23 == var22.length - 1) {
                                       var26.initialize(var24, new Util136());
                                    }

                                    this.deque_c.push(var26.getDataBuilder21());
                                    var25 = this.deque_c.peek();
                                 }

                                 var10000 = var21;
                                 if (var3 < 0) {
                                    break label88;
                                 }

                                 if (var21 == null) {
                                    break label109;
                                 }
                              }

                              var29 = var25.get(var24) instanceof Util136;
                           }

                           label79:
                           if (var3 >= 0) {
                              if (var29 != 0) {
                                 var29 = var23;
                                 if (var3 < 0) {
                                    break label79;
                                 }

                                 if (var23 < var22.length - 1) {
                                    Util110 var27 = (Util110)var25.get(var24);
                                    this.deque_c.push(var27);
                                    var10000 = var21;
                                    if (var3 < 0) {
                                       break label88;
                                    }

                                    if (var21 == null) {
                                       break label109;
                                    }
                                 }
                              }

                              var29 = var25.containsKey(var24, var18);
                           }

                           if (var5 <= 0) {
                              if (var29 == 0) {
                                 break label89;
                              }

                              var29 = var23;
                           }

                           label65: {
                              Util110 var28 = var29 == var22.length - 1 ? new Util111() : new Util136();
                              this.processAll(var24, var28, var4, var8);
                              Deque var31 = this.deque_c;
                              Util110 var33 = var28;
                              if (var2 >= 0) {
                                 this.deque_c.push(var28);
                                 if (!(var28 instanceof Util111)) {
                                    break label65;
                                 }

                                 var31 = this.deque_c;
                                 var33 = var28;
                              }

                              var31.push(((Util111)var33).getDataBuilder21());
                           }

                           var10000 = var21;
                           if (var3 < 0) {
                              break label88;
                           }

                           if (var21 != null) {
                              break label89;
                           }
                        }

                        var23++;
                        var10000 = var21;
                     }

                     if (var10000 != null) {
                        break;
                     }
                     continue;
                  }

                  this.dataBuilder12_a.update(var20, var4.get(), var16);
                  break;
               }

               return;
            }
         } while (var21 != null);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   void calculate_2(long var1, Util137 var3, AtomicInteger var4) {
      var1 = 44801881221916L ^ var1;
      long var10001 = var1 ^ 95358989294161L;
      int var5 = (int)((var1 ^ 95358989294161L) >>> 32);
      int var6 = (int)((var1 ^ 95358989294161L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var1 ^ 125771380214426L;
      long var10 = var1 ^ 52601710244661L;
      var10001 = var1 ^ 84480476925927L;
      int var12 = (int)((var1 ^ 84480476925927L) >>> 48);
      int var13 = (int)((var1 ^ 84480476925927L) << 16 >>> 48);
      int var14 = (int)(var10001 << 32 >>> 32);
      long var15 = var1 ^ 121252676903359L;
      long var17 = var1 ^ 45858955996113L;
      String[] var10000 = Util28.values();
      String var19 = var3.buildString(var5, var6, (short)var7);
      String[] var20 = var10000;

      while (true) {
         if (this.deque_c.size() > 1) {
            this.deque_c.pop();
            if (var20 == null) {
               continue;
            }
         }

         do {
            Util98[] var21 = Util97.parseEntries(var19, (char)var12, (short)var13, var14);
            if (var1 > 0L) {
               int var22 = 0;

               while (var22 < var21.length) {
                  label81: {
                     label101: {
                        String var23 = var21[var22].string_a;
                        Util110 var24 = this.deque_c.peek();
                        boolean var27 = var24.get(var23) instanceof Util110;
                        if (var1 > 0L) {
                           if (var27) {
                              label75: {
                                 label103: {
                                    Util110 var25 = (Util110)var24.get(var23);
                                    var28 = var22;
                                    label73:
                                    if (var1 >= 0L) {
                                       if (var22 == var21.length - 1) {
                                          var28 = var25.isEmpty();
                                          if (var1 <= 0L) {
                                             break label73;
                                          }

                                          if (var28 == 0) {
                                             this.dataBuilder12_a.update(var19, var4.get(), var15);
                                             return;
                                          }
                                       }

                                       this.deque_c.push(var25);
                                       var29 = this.deque_c;
                                       if (var1 <= 0L) {
                                          break label103;
                                       }

                                       var28 = this.deque_c.peek() instanceof Util111;
                                    }

                                    if (var28 == 0) {
                                       break label75;
                                    }

                                    var29 = this.deque_c;
                                 }

                                 var29.push(((Util111)this.deque_c.peek()).getDataBuilder21());
                              }

                              var10000 = var20;
                              if (var1 <= 0L) {
                                 break label81;
                              }

                              if (var20 == null) {
                                 break label101;
                              }
                           }

                           var27 = var24.containsKey(var23, var17);
                        }

                        if (var27) {
                           int var10002 = var22;
                           if (var1 > 0L) {
                              var10002 = var22 < var21.length - 1 ? 1 : 0;
                           }

                           this.getClientUtil67_2(var23, (boolean)var10002, var4, var8);
                           var10000 = var20;
                           if (var1 < 0L) {
                              break label81;
                           }

                           if (var20 == null) {
                              break label101;
                           }
                        }

                        this.dataBuilder12_a.update_1(var10, var23, var4);
                        var10000 = var20;
                        if (var1 <= 0L) {
                           break label81;
                        }

                        if (var20 == null) {
                           break;
                        }
                     }

                     var22++;
                     var10000 = var20;
                  }

                  if (var10000 != null) {
                     break;
                  }
               }

               return;
            }
         } while (var20 != null);
      }
   }

   Map getById(long var1) {
      var1 = 44801881221916L ^ var1;
      long var3 = var1 ^ 70992952748271L;
      Util110 var5 = this.deque_c.getLast();
      this.deque_c.clear();
      return ((Util136)var5).getById(var3);
   }

   private Util110 getClientUtil67(String var1, long var2, AtomicInteger var4) {
      var2 = 44801881221916L ^ var2;
      long var5 = var2 ^ 35606889873887L;
      Util136 var7 = new Util136(var1);
      this.processAll(var1, var7, var4, var5);
      this.deque_c.push(var7);
      return var7;
   }

   private Util110 getClientUtil67_2(String var1, boolean var2, AtomicInteger var3, long var4) {
      var4 = 44801881221916L ^ var4;
      long var6 = var4 ^ 54670588524234L;
      Util136 var8 = new Util136(var1, var2);
      this.processAll(var1, var8, var3, var6);
      this.deque_c.push(var8);
      return var8;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private String buildString(long var1, String var3) {
      var1 = 44801881221916L ^ var1;
      Iterator var4 = this.deque_c.descendingIterator();
      String[] var10000 = Util28.values();
      StringBuilder var5 = new StringBuilder();
      String[] var6 = var10000;

      while (true) {
         Util110 var12;
         if (var4.hasNext()) {
            Util110 var7 = (Util110)var4.next();
            var12 = var7;
            if (var1 > 0L) {
               if (var7 instanceof Util111) {
                  return null;
               }

               var12 = var7;
            }
         } else {
            StringBuilder var13 = var5;
            if (var1 > 0L) {
               if (var1 > 0L) {
                  if (var5.length() > 0) {
                     var5.append('.');
                  }

                  var5.append(var3).insert(0, '[').append(']');
                  var13 = var5;
               }

               return var13.toString();
            }

            Util110 var10 = (Util110)var5;
            var12 = var10;
            if (var1 > 0L) {
               if (var10 instanceof Util111) {
                  return null;
               }

               var12 = var10;
            }
         }

         while (true) {
            Util136 var8 = (Util136)var12;
            if (var8.string_b == null) {
               if (var6 != null) {
                  if (var1 >= 0L) {
                     if (var5.length() > 0) {
                        var5.append('.');
                     }

                     var5.append(var8.string_b);
                  }

                  if (var6 == null) {
                     break;
                  }
               }
            } else {
               if (var1 >= 0L) {
                  if (var5.length() > 0) {
                     var5.append('.');
                  }

                  var5.append(var8.string_b);
               }

               if (var6 == null) {
                  break;
               }
            }

            StringBuilder var14 = var5;
            if (var1 > 0L) {
               if (var1 > 0L) {
                  if (var5.length() > 0) {
                     var5.append('.');
                  }

                  var5.append(var3).insert(0, '[').append(']');
                  var14 = var5;
               }

               return var14.toString();
            }

            Util110 var11 = (Util110)var5;
            var12 = var11;
            if (var1 > 0L) {
               if (var11 instanceof Util111) {
                  return null;
               }

               var12 = var11;
            }
         }
      }
   }
}
