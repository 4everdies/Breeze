package rip.breeze.inject;

import java.util.List;

public class BreezeClass4 extends BreezeClass7 {
   public String string_ý;
   public String string_ü;
   public String string_û;
   public List<ù> list_ú;
   public List<ù> list_ù;
   public List<ø> list_ø;
   public List<ø> list_ö;
   public List<õ> list_õ;

   public BreezeClass4(long var1, String var3, String var4, String var5) {
      var1 = encKey_b ^ var1;
      long var10001 = var1 ^ 4660939666886L;
      int var6 = (int)((var1 ^ 4660939666886L) >>> 48);
      int var7 = (int)((var1 ^ 4660939666886L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      this(589824, var3, (short)var6, var4, var5, (char)var7, var8);
      if (this.getClass() != BreezeClass4.class) {
         throw new IllegalStateException();
      }
   }

   public BreezeClass4(int var1, String var2, short var3, String var4, String var5, char var6, int var7) {
      long var8 = ((long)var3 << 48 | (long)var6 << 48 >>> 16 | (long)var7 << 32 >>> 32) ^ encKey_b;
      long var10 = var8 ^ 66683015783764L;
      super(var1, var10);
      this.string_ý = var2;
      this.string_ü = var4;
      this.string_û = var5;
   }

   @Override
   public ü getÜ(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Boolean
      // 18: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1b: istore 5
      // 1d: pop
      // 1e: lload 3
      // 1f: dup2
      // 20: ldc2_w 100131214867747
      // 23: lxor
      // 24: lstore 6
      // 26: dup2
      // 27: ldc2_w 114857886065626
      // 2a: lxor
      // 2b: lstore 8
      // 2d: pop2
      // 2e: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 31: new rip/breeze/inject/ù
      // 34: dup
      // 35: aload 2
      // 36: lload 8
      // 38: invokespecial rip/breeze/inject/ù.<init> (Ljava/lang/String;J)V
      // 3b: astore 10
      // 3d: istore 11
      // 3f: iload 11
      // 41: ifeq 7d
      // 44: iload 5
      // 46: ifeq 88
      // 49: goto 50
      // 4c: invokestatic rip/breeze/inject/BreezeClass4.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 0
      // 52: getfield rip/breeze/inject/BreezeClass4.list_ú Ljava/util/List;
      // 55: lload 6
      // 57: aload 10
      // 59: bipush 3
      // 5a: anewarray 32
      // 5d: dup_x1
      // 5e: swap
      // 5f: bipush 2
      // 60: swap
      // 61: aastore
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 1
      // 69: swap
      // 6a: aastore
      // 6b: dup_x1
      // 6c: swap
      // 6d: bipush 0
      // 6e: swap
      // 6f: aastore
      // 70: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // 73: putfield rip/breeze/inject/BreezeClass4.list_ú Ljava/util/List;
      // 76: goto 7d
      // 79: invokestatic rip/breeze/inject/BreezeClass4.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7c: athrow
      // 7d: lload 3
      // 7e: lconst_0
      // 7f: lcmp
      // 80: iflt ae
      // 83: iload 11
      // 85: ifne b5
      // 88: aload 0
      // 89: aload 0
      // 8a: getfield rip/breeze/inject/BreezeClass4.list_ù Ljava/util/List;
      // 8d: lload 6
      // 8f: aload 10
      // 91: bipush 3
      // 92: anewarray 32
      // 95: dup_x1
      // 96: swap
      // 97: bipush 2
      // 98: swap
      // 99: aastore
      // 9a: dup_x2
      // 9b: dup_x2
      // 9c: pop
      // 9d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a0: bipush 1
      // a1: swap
      // a2: aastore
      // a3: dup_x1
      // a4: swap
      // a5: bipush 0
      // a6: swap
      // a7: aastore
      // a8: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // ab: putfield rip/breeze/inject/BreezeClass4.list_ù Ljava/util/List;
      // ae: goto b5
      // b1: invokestatic rip/breeze/inject/BreezeClass4.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // b4: athrow
      // b5: aload 10
      // b7: areturn
      // try (37 -> 41): 42 java/lang/IllegalStateException
      // try (39 -> 70): 71 java/lang/IllegalStateException
      // try (73 -> 105): 106 java/lang/IllegalStateException
   }

   @Override
   public ü getÜ_2(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast rip/breeze/inject/և
      // 1c: astore 5
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/String
      // 24: astore 6
      // 26: dup
      // 27: bipush 4
      // 28: aaload
      // 29: checkcast java/lang/Boolean
      // 2c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f: istore 7
      // 31: pop
      // 32: lload 2
      // 33: dup2
      // 34: ldc2_w 133363757481544
      // 37: lxor
      // 38: lstore 8
      // 3a: dup2
      // 3b: ldc2_w 7356062583793
      // 3e: lxor
      // 3f: lstore 10
      // 41: pop2
      // 42: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 45: new rip/breeze/inject/ø
      // 48: dup
      // 49: lload 10
      // 4b: iload 4
      // 4d: aload 5
      // 4f: aload 6
      // 51: invokespecial rip/breeze/inject/ø.<init> (JILrip/breeze/inject/և;Ljava/lang/String;)V
      // 54: astore 12
      // 56: istore 13
      // 58: iload 13
      // 5a: ifeq 96
      // 5d: iload 7
      // 5f: ifeq a1
      // 62: goto 69
      // 65: invokestatic rip/breeze/inject/BreezeClass4.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 68: athrow
      // 69: aload 0
      // 6a: aload 0
      // 6b: getfield rip/breeze/inject/BreezeClass4.list_ø Ljava/util/List;
      // 6e: lload 8
      // 70: aload 12
      // 72: bipush 3
      // 73: anewarray 32
      // 76: dup_x1
      // 77: swap
      // 78: bipush 2
      // 79: swap
      // 7a: aastore
      // 7b: dup_x2
      // 7c: dup_x2
      // 7d: pop
      // 7e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 81: bipush 1
      // 82: swap
      // 83: aastore
      // 84: dup_x1
      // 85: swap
      // 86: bipush 0
      // 87: swap
      // 88: aastore
      // 89: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // 8c: putfield rip/breeze/inject/BreezeClass4.list_ø Ljava/util/List;
      // 8f: goto 96
      // 92: invokestatic rip/breeze/inject/BreezeClass4.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 95: athrow
      // 96: lload 2
      // 97: lconst_0
      // 98: lcmp
      // 99: iflt c7
      // 9c: iload 13
      // 9e: ifne ce
      // a1: aload 0
      // a2: aload 0
      // a3: getfield rip/breeze/inject/BreezeClass4.list_ö Ljava/util/List;
      // a6: lload 8
      // a8: aload 12
      // aa: bipush 3
      // ab: anewarray 32
      // ae: dup_x1
      // af: swap
      // b0: bipush 2
      // b1: swap
      // b2: aastore
      // b3: dup_x2
      // b4: dup_x2
      // b5: pop
      // b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b9: bipush 1
      // ba: swap
      // bb: aastore
      // bc: dup_x1
      // bd: swap
      // be: bipush 0
      // bf: swap
      // c0: aastore
      // c1: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // c4: putfield rip/breeze/inject/BreezeClass4.list_ö Ljava/util/List;
      // c7: goto ce
      // ca: invokestatic rip/breeze/inject/BreezeClass4.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // cd: athrow
      // ce: aload 12
      // d0: areturn
      // try (50 -> 54): 55 java/lang/IllegalStateException
      // try (52 -> 83): 84 java/lang/IllegalStateException
      // try (86 -> 118): 119 java/lang/IllegalStateException
   }

   public void invoke_3(Object[] var1) {
      õ var2 = (õ)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 55619767111173L;
      this.list_õ = ԧ.method_001(new Object[]{this.list_õ, var5, var2});
   }

   public void invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public void invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = encKey_b ^ var2;

      try {
         if (var4 < 524288) {
            throw new ԍ();
         }
      } catch (IllegalStateException var5) {
         throw getIllegalStateException(var5);
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @Override
   public void processAll(Object[] var1) {
      long var2 = (Long)var1[0];
      î var4 = (î)var1[1];
      var2 = encKey_b ^ var2;
      long var5 = var2 ^ 2113811325020L;
      long var7 = var2 ^ 49003538987914L;
      long var9 = var2 ^ 114797126423418L;
      long var11 = var2 ^ 24587484264436L;
      long var13 = var2 ^ 81582902530065L;
      long var15 = var2 ^ 19405359079520L;
      boolean var10000 = BreezeClass12.isValid();
      BreezeClass7 var17 = var4.method_012(new Object[]{this.string_ý, this.string_ü, this.string_û, var7});
      boolean var18 = var10000;

      try {
         if (var17 == null) {
            return;
         }
      } catch (IllegalStateException var30) {
         throw getIllegalStateException(var30);
      }

      label295: {
         label272: {
            label279: {
               boolean var10001;
               label270: {
                  label269: {
                     label268: {
                        label280: {
                           label266: {
                              label265: {
                                 label264: {
                                    label281: {
                                       label262: {
                                          label261: {
                                             label282: {
                                                try {
                                                   var53 = this.list_ú;
                                                   var10001 = var18;
                                                   if (var2 <= 0L) {
                                                      break label262;
                                                   }

                                                   if (var18) {
                                                      break label261;
                                                   }

                                                   if (this.list_ú == null) {
                                                      break label282;
                                                   }
                                                } catch (IllegalStateException var40) {
                                                   throw getIllegalStateException(var40);
                                                }

                                                int var19 = 0;
                                                int var20 = this.list_ú.size();

                                                label254:
                                                while (var19 < var20) {
                                                   var54 = this;
                                                   if (var2 <= 0L) {
                                                      break label264;
                                                   }

                                                   ù var21 = this.list_ú.get(var19);

                                                   try {
                                                      String var10002 = var21.string_ü_2;
                                                      Object[] var10006 = new Object[]{null, null, true};
                                                      var10006[1] = var9;
                                                      var10006[0] = var10002;
                                                      var21.method_002(new Object[]{var11, var17.getÜ(var10006)});
                                                      var19++;
                                                   } catch (IllegalStateException var29) {
                                                      throw getIllegalStateException(var29);
                                                   }

                                                   while (true) {
                                                      try {
                                                         if (var18) {
                                                            break label281;
                                                         }

                                                         if (!var18) {
                                                            break;
                                                         }
                                                      } catch (IllegalStateException var39) {
                                                         throw getIllegalStateException(var39);
                                                      }

                                                      if (var2 > 0L) {
                                                         break label254;
                                                      }
                                                   }
                                                }
                                             }

                                             var53 = this.list_ù;
                                          }

                                          try {
                                             var10001 = var18;
                                          } catch (IllegalStateException var28) {
                                             throw getIllegalStateException(var28);
                                          }
                                       }

                                       try {
                                          if (var2 <= 0L) {
                                             break label266;
                                          }

                                          if (var10001) {
                                             break label265;
                                          }

                                          if (var53 == null) {
                                             break label281;
                                          }
                                       } catch (IllegalStateException var38) {
                                          throw getIllegalStateException(var38);
                                       }

                                       int var42 = 0;
                                       int var46 = this.list_ù.size();

                                       label229:
                                       while (var42 < var46) {
                                          var55 = this;
                                          if (var2 < 0L) {
                                             break label268;
                                          }

                                          ù var50 = this.list_ù.get(var42);

                                          try {
                                             String var59 = var50.string_ü_2;
                                             Object[] var61 = new Object[]{null, null, false};
                                             var61[1] = var9;
                                             var61[0] = var59;
                                             var50.method_002(new Object[]{var11, var17.getÜ(var61)});
                                             var42++;
                                          } catch (IllegalStateException var27) {
                                             throw getIllegalStateException(var27);
                                          }

                                          while (true) {
                                             try {
                                                if (var18) {
                                                   break label280;
                                                }

                                                if (!var18) {
                                                   break;
                                                }
                                             } catch (IllegalStateException var37) {
                                                throw getIllegalStateException(var37);
                                             }

                                             if (var2 > 0L) {
                                                break label229;
                                             }
                                          }
                                       }
                                    }

                                    var54 = this;
                                 }

                                 var53 = var54.list_ø;
                              }

                              try {
                                 var10001 = var18;
                              } catch (IllegalStateException var26) {
                                 throw getIllegalStateException(var26);
                              }
                           }

                           try {
                              if (var2 < 0L) {
                                 break label270;
                              }

                              if (var10001) {
                                 break label269;
                              }

                              if (var53 == null) {
                                 break label280;
                              }
                           } catch (IllegalStateException var36) {
                              throw getIllegalStateException(var36);
                           }

                           int var43 = 0;
                           int var47 = this.list_ø.size();

                           label201:
                           while (var43 < var47) {
                              ø var51 = this.list_ø.get(var43);

                              try {
                                 int var10003 = var51.int_ú;
                                 Object[] var10008 = new Object[]{null, null, var51.և_ù, var51.ü, true};
                                 var10008[1] = var10003;
                                 var10008[0] = var13;
                                 var51.ö(new Object[]{var11, var17.getÜ_2(var10008)});
                                 var43++;
                              } catch (IllegalStateException var25) {
                                 throw getIllegalStateException(var25);
                              }

                              while (true) {
                                 try {
                                    if (var2 <= 0L || var18) {
                                       break label279;
                                    }

                                    if (!var18) {
                                       break;
                                    }
                                 } catch (IllegalStateException var35) {
                                    throw getIllegalStateException(var35);
                                 }

                                 if (var2 > 0L) {
                                    break label201;
                                 }
                              }
                           }
                        }

                        var55 = this;
                     }

                     var53 = var55.list_ö;
                  }

                  try {
                     var10001 = var18;
                  } catch (IllegalStateException var24) {
                     throw getIllegalStateException(var24);
                  }
               }

               try {
                  if (var10001) {
                     break label272;
                  }

                  if (var53 == null) {
                     break label279;
                  }
               } catch (IllegalStateException var34) {
                  throw getIllegalStateException(var34);
               }

               int var44 = 0;
               int var48 = this.list_ö.size();

               label169:
               while (var44 < var48) {
                  ø var52 = this.list_ö.get(var44);

                  try {
                     int var60 = var52.int_ú;
                     Object[] var62 = new Object[]{null, null, var52.և_ù, var52.ü, false};
                     var62[1] = var60;
                     var62[0] = var13;
                     var52.ö(new Object[]{var11, var17.getÜ_2(var62)});
                     var44++;
                  } catch (IllegalStateException var23) {
                     throw getIllegalStateException(var23);
                  }

                  while (true) {
                     try {
                        var10000 = var18;
                        if (var2 >= 0L) {
                           if (var18) {
                              return;
                           }

                           var10000 = var18;
                        }

                        if (!var10000) {
                           break;
                        }
                     } catch (IllegalStateException var33) {
                        throw getIllegalStateException(var33);
                     }

                     if (var2 >= 0L) {
                        break label169;
                     }
                  }
               }
            }

            try {
               if (var2 < 0L) {
                  return;
               }

               var57 = this;
               if (var18) {
                  break label295;
               }

               var53 = this.list_õ;
            } catch (IllegalStateException var32) {
               throw getIllegalStateException(var32);
            }
         }

         if (var53 != null) {
            int var45 = 0;
            int var49 = this.list_õ.size();

            label151:
            while (var45 < var49) {
               try {
                  var17.processAll(new Object[]{this.list_õ.get(var45), var5});
                  var45++;
               } catch (IllegalStateException var22) {
                  throw getIllegalStateException(var22);
               }

               while (true) {
                  try {
                     var10000 = var18;
                     if (var2 > 0L) {
                        if (var18) {
                           return;
                        }

                        var10000 = var18;
                     }

                     if (!var10000) {
                        break;
                     }
                  } catch (IllegalStateException var31) {
                     throw getIllegalStateException(var31);
                  }

                  if (var2 > 0L) {
                     break label151;
                  }
               }
            }
         }

         var57 = var17;
      }

      var57.processAll_2(new Object[]{var15});
   }

   private static IllegalStateException getIllegalStateException(IllegalStateException var0) {
      return var0;
   }
}
