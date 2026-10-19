package rip.breeze.inject;

import java.util.List;

public class á extends ä {
   public int int_ý_2;
   public String string_ü_2;
   public String string_û_2;
   public String string_ú_2;
   public Object object_ù_2;
   public List<ù> list_ø_2;
   public List<ù> list_ö_2;
   public List<ø> list_õ_2;
   public List<ø> list_ô_2;
   public List<õ> list_ó_2;

   public á(int var1, long var2, String var4, String var5, String var6, Object var7) {
      var2 = encKey_b_2 ^ var2;
      long var8 = var2 ^ 88601797569139L;
      this(589824, var1, var4, var5, var6, var7, var8);
      if (this.getClass() != á.class) {
         throw new IllegalStateException();
      }
   }

   public á(int var1, int var2, String var3, String var4, String var5, Object var6, long var7) {
      var7 = encKey_b_2 ^ var7;
      long var9 = var7 ^ 121941237293094L;
      super(var1, var9);
      this.int_ý_2 = var2;
      this.string_ü_2 = var3;
      this.string_û_2 = var4;
      this.string_ú_2 = var5;
      this.object_ù_2 = var6;
   }

   @Override
   public ü invoke_1(Object[] param1) {
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
      // 20: ldc2_w 35023729532935
      // 23: lxor
      // 24: lstore 6
      // 26: dup2
      // 27: ldc2_w 49192054865662
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
      // 4c: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 0
      // 52: getfield rip/breeze/inject/á.list_ø_2 Ljava/util/List;
      // 55: lload 6
      // 57: aload 10
      // 59: bipush 3
      // 5a: anewarray 36
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
      // 73: putfield rip/breeze/inject/á.list_ø_2 Ljava/util/List;
      // 76: goto 7d
      // 79: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7c: athrow
      // 7d: lload 3
      // 7e: lconst_0
      // 7f: lcmp
      // 80: iflt ae
      // 83: iload 11
      // 85: ifne b5
      // 88: aload 0
      // 89: aload 0
      // 8a: getfield rip/breeze/inject/á.list_ö_2 Ljava/util/List;
      // 8d: lload 6
      // 8f: aload 10
      // 91: bipush 3
      // 92: anewarray 36
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
      // ab: putfield rip/breeze/inject/á.list_ö_2 Ljava/util/List;
      // ae: goto b5
      // b1: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // b4: athrow
      // b5: aload 10
      // b7: areturn
      // try (37 -> 41): 42 java/lang/IllegalStateException
      // try (39 -> 70): 71 java/lang/IllegalStateException
      // try (73 -> 105): 106 java/lang/IllegalStateException
   }

   @Override
   public ü invoke_2(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: dup
      // 16: bipush 2
      // 17: aaload
      // 18: checkcast rip/breeze/inject/և
      // 1b: astore 5
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/String
      // 23: astore 6
      // 25: dup
      // 26: bipush 4
      // 27: aaload
      // 28: checkcast java/lang/Boolean
      // 2b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2e: istore 7
      // 30: pop
      // 31: lload 3
      // 32: dup2
      // 33: ldc2_w 109271809966962
      // 36: lxor
      // 37: lstore 8
      // 39: dup2
      // 3a: ldc2_w 31449083705035
      // 3d: lxor
      // 3e: lstore 10
      // 40: pop2
      // 41: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 44: new rip/breeze/inject/ø
      // 47: dup
      // 48: lload 10
      // 4a: iload 2
      // 4b: aload 5
      // 4d: aload 6
      // 4f: invokespecial rip/breeze/inject/ø.<init> (JILrip/breeze/inject/և;Ljava/lang/String;)V
      // 52: astore 12
      // 54: istore 13
      // 56: iload 13
      // 58: ifne 94
      // 5b: iload 7
      // 5d: ifeq 9f
      // 60: goto 67
      // 63: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 66: athrow
      // 67: aload 0
      // 68: aload 0
      // 69: getfield rip/breeze/inject/á.list_õ_2 Ljava/util/List;
      // 6c: lload 8
      // 6e: aload 12
      // 70: bipush 3
      // 71: anewarray 36
      // 74: dup_x1
      // 75: swap
      // 76: bipush 2
      // 77: swap
      // 78: aastore
      // 79: dup_x2
      // 7a: dup_x2
      // 7b: pop
      // 7c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7f: bipush 1
      // 80: swap
      // 81: aastore
      // 82: dup_x1
      // 83: swap
      // 84: bipush 0
      // 85: swap
      // 86: aastore
      // 87: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // 8a: putfield rip/breeze/inject/á.list_õ_2 Ljava/util/List;
      // 8d: goto 94
      // 90: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 93: athrow
      // 94: lload 3
      // 95: lconst_0
      // 96: lcmp
      // 97: ifle c5
      // 9a: iload 13
      // 9c: ifeq cc
      // 9f: aload 0
      // a0: aload 0
      // a1: getfield rip/breeze/inject/á.list_ô_2 Ljava/util/List;
      // a4: lload 8
      // a6: aload 12
      // a8: bipush 3
      // a9: anewarray 36
      // ac: dup_x1
      // ad: swap
      // ae: bipush 2
      // af: swap
      // b0: aastore
      // b1: dup_x2
      // b2: dup_x2
      // b3: pop
      // b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b7: bipush 1
      // b8: swap
      // b9: aastore
      // ba: dup_x1
      // bb: swap
      // bc: bipush 0
      // bd: swap
      // be: aastore
      // bf: invokestatic rip/breeze/inject/ԧ.method_001 ([Ljava/lang/Object;)Ljava/util/List;
      // c2: putfield rip/breeze/inject/á.list_ô_2 Ljava/util/List;
      // c5: goto cc
      // c8: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // cb: athrow
      // cc: aload 12
      // ce: areturn
      // try (50 -> 54): 55 java/lang/IllegalStateException
      // try (52 -> 83): 84 java/lang/IllegalStateException
      // try (86 -> 118): 119 java/lang/IllegalStateException
   }

   @Override
   public void invoke_3(Object[] var1) {
      õ var2 = (õ)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 5638330099047L;
      this.list_ó_2 = ԧ.method_001(new Object[]{this.list_ó_2, var5, var2});
   }

   @Override
   public void invoke_4(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public void invoke_1(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: pop
      // 16: getstatic rip/breeze/inject/á.encKey_b_2 J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 1f: istore 5
      // 21: iload 2
      // 22: ldc 262144
      // 24: if_icmpne aa
      // 27: aload 0
      // 28: getfield rip/breeze/inject/á.list_õ_2 Ljava/util/List;
      // 2b: iload 5
      // 2d: ifne 76
      // 30: goto 37
      // 33: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 36: athrow
      // 37: ifnull 72
      // 3a: goto 41
      // 3d: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 40: athrow
      // 41: aload 0
      // 42: getfield rip/breeze/inject/á.list_õ_2 Ljava/util/List;
      // 45: iload 5
      // 47: lload 3
      // 48: lconst_0
      // 49: lcmp
      // 4a: ifle 7e
      // 4d: ifne 76
      // 50: goto 57
      // 53: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 56: athrow
      // 57: invokeinterface java/util/List.isEmpty ()Z 1
      // 5c: ifne 72
      // 5f: goto 66
      // 62: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 65: athrow
      // 66: new rip/breeze/inject/ԍ
      // 69: dup
      // 6a: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // 6d: athrow
      // 6e: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 71: athrow
      // 72: aload 0
      // 73: getfield rip/breeze/inject/á.list_ô_2 Ljava/util/List;
      // 76: lload 3
      // 77: lconst_0
      // 78: lcmp
      // 79: iflt 96
      // 7c: iload 5
      // 7e: ifne 96
      // 81: ifnull aa
      // 84: goto 8b
      // 87: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 8a: athrow
      // 8b: aload 0
      // 8c: getfield rip/breeze/inject/á.list_ô_2 Ljava/util/List;
      // 8f: goto 96
      // 92: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 95: athrow
      // 96: invokeinterface java/util/List.isEmpty ()Z 1
      // 9b: ifne aa
      // 9e: new rip/breeze/inject/ԍ
      // a1: dup
      // a2: invokespecial rip/breeze/inject/ԍ.<init> ()V
      // a5: athrow
      // a6: invokestatic rip/breeze/inject/á.method_003 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // a9: athrow
      // aa: return
      // try (20 -> 27): 28 java/lang/IllegalStateException
      // try (23 -> 31): 32 java/lang/IllegalStateException
      // try (30 -> 42): 43 java/lang/IllegalStateException
      // try (34 -> 47): 48 java/lang/IllegalStateException
      // try (45 -> 54): 54 java/lang/IllegalStateException
      // try (58 -> 65): 66 java/lang/IllegalStateException
      // try (64 -> 70): 71 java/lang/IllegalStateException
      // try (73 -> 79): 79 java/lang/IllegalStateException
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void invoke_2(Object[] var1) {
      î var2 = (î)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_b_2 ^ var3;
      long var5 = var3 ^ 7675449510291L;
      long var7 = var3 ^ 92589820999326L;
      long var9 = var3 ^ 44594460628459L;
      long var11 = var3 ^ 121815126642484L;
      long var13 = var3 ^ 66855526708371L;
      long var15 = var3 ^ 86654744228862L;
      boolean var10000 = BreezeClass12.checkCondition();
      int var10002 = this.int_ý_2;
      Object[] var10009 = new Object[]{null, this.string_ü_2, this.string_û_2, this.string_ú_2, this.object_ù_2, var13};
      var10009[0] = var10002;
      ä var17 = var2.method_013(var10009);
      boolean var18 = var10000;

      try {
         if (var17 == null) {
            return;
         }
      } catch (IllegalStateException var30) {
         throw method_003(var30);
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
                                                   var53 = this.list_ø_2;
                                                   var10001 = var18;
                                                   if (var3 <= 0L) {
                                                      break label262;
                                                   }

                                                   if (!var18) {
                                                      break label261;
                                                   }

                                                   if (this.list_ø_2 == null) {
                                                      break label282;
                                                   }
                                                } catch (IllegalStateException var40) {
                                                   throw method_003(var40);
                                                }

                                                int var19 = 0;
                                                int var20 = this.list_ø_2.size();

                                                label254:
                                                while (var19 < var20) {
                                                   var54 = this;
                                                   if (var3 <= 0L) {
                                                      break label264;
                                                   }

                                                   ù var21 = this.list_ø_2.get(var19);

                                                   try {
                                                      String var59 = var21.string_ü_2;
                                                      Object[] var10006 = new Object[]{null, null, true};
                                                      var10006[1] = var7;
                                                      var10006[0] = var59;
                                                      var21.method_002(new Object[]{var11, var17.method_001(var10006)});
                                                      var19++;
                                                   } catch (IllegalStateException var29) {
                                                      throw method_003(var29);
                                                   }

                                                   while (true) {
                                                      try {
                                                         if (!var18) {
                                                            break label281;
                                                         }

                                                         if (var18) {
                                                            break;
                                                         }
                                                      } catch (IllegalStateException var39) {
                                                         throw method_003(var39);
                                                      }

                                                      if (var3 >= 0L) {
                                                         break label254;
                                                      }
                                                   }
                                                }
                                             }

                                             var53 = this.list_ö_2;
                                          }

                                          try {
                                             var10001 = var18;
                                          } catch (IllegalStateException var28) {
                                             throw method_003(var28);
                                          }
                                       }

                                       try {
                                          if (var3 <= 0L) {
                                             break label266;
                                          }

                                          if (!var10001) {
                                             break label265;
                                          }

                                          if (var53 == null) {
                                             break label281;
                                          }
                                       } catch (IllegalStateException var38) {
                                          throw method_003(var38);
                                       }

                                       int var42 = 0;
                                       int var46 = this.list_ö_2.size();

                                       label229:
                                       while (var42 < var46) {
                                          var55 = this;
                                          if (var3 <= 0L) {
                                             break label268;
                                          }

                                          ù var50 = this.list_ö_2.get(var42);

                                          try {
                                             String var60 = var50.string_ü_2;
                                             Object[] var63 = new Object[]{null, null, false};
                                             var63[1] = var7;
                                             var63[0] = var60;
                                             var50.method_002(new Object[]{var11, var17.method_001(var63)});
                                             var42++;
                                          } catch (IllegalStateException var27) {
                                             throw method_003(var27);
                                          }

                                          while (true) {
                                             try {
                                                if (!var18) {
                                                   break label280;
                                                }

                                                if (var18) {
                                                   break;
                                                }
                                             } catch (IllegalStateException var37) {
                                                throw method_003(var37);
                                             }

                                             if (var3 >= 0L) {
                                                break label229;
                                             }
                                          }
                                       }
                                    }

                                    var54 = this;
                                 }

                                 var53 = var54.list_õ_2;
                              }

                              try {
                                 var10001 = var18;
                              } catch (IllegalStateException var26) {
                                 throw method_003(var26);
                              }
                           }

                           try {
                              if (var3 <= 0L) {
                                 break label270;
                              }

                              if (!var10001) {
                                 break label269;
                              }

                              if (var53 == null) {
                                 break label280;
                              }
                           } catch (IllegalStateException var36) {
                              throw method_003(var36);
                           }

                           int var43 = 0;
                           int var47 = this.list_õ_2.size();

                           label201:
                           while (var43 < var47) {
                              ø var51 = this.list_õ_2.get(var43);

                              try {
                                 var10002 = var51.int_ú;
                                 Object[] var10008 = new Object[]{null, null, var51.և_ù, var51.ü, true};
                                 var10008[1] = var9;
                                 var10008[0] = var10002;
                                 var51.ö(new Object[]{var11, var17.method_002(var10008)});
                                 var43++;
                              } catch (IllegalStateException var25) {
                                 throw method_003(var25);
                              }

                              while (true) {
                                 try {
                                    if (var3 < 0L || !var18) {
                                       break label279;
                                    }

                                    if (var18) {
                                       break;
                                    }
                                 } catch (IllegalStateException var35) {
                                    throw method_003(var35);
                                 }

                                 if (var3 > 0L) {
                                    break label201;
                                 }
                              }
                           }
                        }

                        var55 = this;
                     }

                     var53 = var55.list_ô_2;
                  }

                  try {
                     var10001 = var18;
                  } catch (IllegalStateException var24) {
                     throw method_003(var24);
                  }
               }

               try {
                  if (!var10001) {
                     break label272;
                  }

                  if (var53 == null) {
                     break label279;
                  }
               } catch (IllegalStateException var34) {
                  throw method_003(var34);
               }

               int var44 = 0;
               int var48 = this.list_ô_2.size();

               label169:
               while (var44 < var48) {
                  ø var52 = this.list_ô_2.get(var44);

                  try {
                     var10002 = var52.int_ú;
                     Object[] var64 = new Object[]{null, null, var52.և_ù, var52.ü, false};
                     var64[1] = var9;
                     var64[0] = var10002;
                     var52.ö(new Object[]{var11, var17.method_002(var64)});
                     var44++;
                  } catch (IllegalStateException var23) {
                     throw method_003(var23);
                  }

                  while (true) {
                     try {
                        var10000 = var18;
                        if (var3 >= 0L) {
                           if (!var18) {
                              return;
                           }

                           var10000 = var18;
                        }

                        if (var10000) {
                           break;
                        }
                     } catch (IllegalStateException var33) {
                        throw method_003(var33);
                     }

                     if (var3 >= 0L) {
                        break label169;
                     }
                  }
               }
            }

            try {
               if (var3 < 0L) {
                  return;
               }

               var57 = this;
               if (!var18) {
                  break label295;
               }

               var53 = this.list_ó_2;
            } catch (IllegalStateException var32) {
               throw method_003(var32);
            }
         }

         if (var53 != null) {
            int var45 = 0;
            int var49 = this.list_ó_2.size();

            label151:
            while (var45 < var49) {
               try {
                  var17.method_003(new Object[]{this.list_ó_2.get(var45), var15});
                  var45++;
               } catch (IllegalStateException var22) {
                  throw method_003(var22);
               }

               while (true) {
                  try {
                     var10000 = var18;
                     if (var3 >= 0L) {
                        if (!var18) {
                           return;
                        }

                        var10000 = var18;
                     }

                     if (var10000) {
                        break;
                     }
                  } catch (IllegalStateException var31) {
                     throw method_003(var31);
                  }

                  if (var3 >= 0L) {
                     break label151;
                  }
               }
            }
         }

         var57 = var17;
      }

      var57.method_004(new Object[]{var5});
   }

   private static IllegalStateException invoke_3(IllegalStateException var0) {
      return var0;
   }
}
