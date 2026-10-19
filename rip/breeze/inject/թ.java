package rip.breeze.inject;

import java.util.ListIterator;

public class թ implements Iterable<ջ> {
   private int int_ÿ_2;
   private ջ ջ_þ_2;
   private ջ ջ_ý_2;
   ջ[] arr_ü_2;

   public int invoke_1(Object[] var1) {
      return this.int_ÿ_2;
   }

   public ջ invoke_2(Object[] var1) {
      return this.ջ_þ_2;
   }

   public ջ invoke_3(Object[] var1) {
      return this.ջ_ý_2;
   }

   public ջ invoke_4(Object[] param1) {
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
      // 16: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: lload 3
      // 1d: dup2
      // 1e: ldc2_w 121580283546952
      // 21: lxor
      // 22: lstore 5
      // 24: pop2
      // 25: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 28: istore 7
      // 2a: iload 2
      // 2b: iload 7
      // 2d: ifeq 3b
      // 30: iflt 42
      // 33: goto 3a
      // 36: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 39: athrow
      // 3a: iload 2
      // 3b: aload 0
      // 3c: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 3f: if_icmplt 4e
      // 42: new java/lang/IndexOutOfBoundsException
      // 45: dup
      // 46: invokespecial java/lang/IndexOutOfBoundsException.<init> ()V
      // 49: athrow
      // 4a: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 52: iload 7
      // 54: lload 3
      // 55: lconst_0
      // 56: lcmp
      // 57: ifle 8a
      // 5a: ifeq 89
      // 5d: ifnonnull 85
      // 60: goto 67
      // 63: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 66: athrow
      // 67: aload 0
      // 68: aload 0
      // 69: lload 5
      // 6b: bipush 1
      // 6c: anewarray 5
      // 6f: dup_x2
      // 70: dup_x2
      // 71: pop
      // 72: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: invokevirtual rip/breeze/inject/թ.method_010 ([Ljava/lang/Object;)[Lrip/breeze/inject/ջ;
      // 7b: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 7e: goto 85
      // 81: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 84: athrow
      // 85: aload 0
      // 86: getfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 89: iload 2
      // 8a: aaload
      // 8b: areturn
      // try (26 -> 30): 31 java/lang/IndexOutOfBoundsException
      // try (34 -> 41): 41 java/lang/IndexOutOfBoundsException
      // try (43 -> 52): 53 java/lang/IndexOutOfBoundsException
      // try (51 -> 69): 70 java/lang/IndexOutOfBoundsException
   }

   public boolean check_5(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/ջ
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 1c: aload 0
      // 1d: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 20: astore 5
      // 22: istore 6
      // 24: aload 5
      // 26: ifnull 59
      // 29: aload 5
      // 2b: iload 6
      // 2d: lload 3
      // 2e: lconst_0
      // 2f: lcmp
      // 30: iflt 38
      // 33: ifne 61
      // 36: iload 6
      // 38: ifne 61
      // 3b: goto 42
      // 3e: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 41: athrow
      // 42: aload 2
      // 43: if_acmpeq 59
      // 46: goto 4d
      // 49: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 4c: athrow
      // 4d: aload 5
      // 4f: getfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 52: astore 5
      // 54: iload 6
      // 56: ifeq 24
      // 59: lload 3
      // 5a: lconst_0
      // 5b: lcmp
      // 5c: iflt 6c
      // 5f: aload 5
      // 61: ifnull 6c
      // 64: bipush 1
      // 65: goto 6d
      // 68: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 6b: athrow
      // 6c: bipush 0
      // 6d: ireturn
      // try (24 -> 33): 34 java/lang/IndexOutOfBoundsException
      // try (31 -> 38): 39 java/lang/IndexOutOfBoundsException
      // try (51 -> 54): 54 java/lang/IndexOutOfBoundsException
   }

   public int invoke_6(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/ջ
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 129465508286409
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 25: istore 7
      // 27: aload 0
      // 28: iload 7
      // 2a: ifne 42
      // 2d: getfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 30: ifnonnull 58
      // 33: goto 3a
      // 36: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 39: athrow
      // 3a: aload 0
      // 3b: goto 42
      // 3e: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 41: athrow
      // 42: aload 0
      // 43: lload 5
      // 45: bipush 1
      // 46: anewarray 5
      // 49: dup_x2
      // 4a: dup_x2
      // 4b: pop
      // 4c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f: bipush 0
      // 50: swap
      // 51: aastore
      // 52: invokevirtual rip/breeze/inject/թ.method_010 ([Ljava/lang/Object;)[Lrip/breeze/inject/ջ;
      // 55: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 58: aload 2
      // 59: getfield rip/breeze/inject/ջ.int_é_2 I
      // 5c: ireturn
      // try (25 -> 30): 31 java/lang/IndexOutOfBoundsException
      // try (28 -> 34): 35 java/lang/IndexOutOfBoundsException
   }

   public void invoke_7(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast rip/breeze/inject/Util140
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 107143433869292
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 25: aload 0
      // 26: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 29: astore 7
      // 2b: istore 8
      // 2d: aload 7
      // 2f: ifnull 58
      // 32: aload 7
      // 34: aload 2
      // 35: lload 5
      // 37: bipush 2
      // 38: anewarray 5
      // 3b: dup_x2
      // 3c: dup_x2
      // 3d: pop
      // 3e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41: bipush 1
      // 42: swap
      // 43: aastore
      // 44: dup_x1
      // 45: swap
      // 46: bipush 0
      // 47: swap
      // 48: aastore
      // 49: invokevirtual rip/breeze/inject/ջ.method_002 ([Ljava/lang/Object;)V
      // 4c: aload 7
      // 4e: getfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 51: astore 7
      // 53: iload 8
      // 55: ifne 2d
      // 58: lload 3
      // 59: lconst_0
      // 5a: lcmp
      // 5b: iflt 53
      // 5e: return
   }

   public ListIterator invoke_8(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_a_2 ^ var2;
      long var4 = var2 ^ 106178030972548L;
      Object[] var10004 = new Object[]{null, 0};
      var10004[0] = var4;
      return this.method_009(var10004);
   }

   public ListIterator invoke_9(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 63312650331644L;
      return new ը(this, var4, var5);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public ջ[] invoke_10(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_a_2 ^ var2;
      int var4 = 0;
      byte var10000 = BreezeClass12.checkCondition();
      ջ var5 = this.ջ_þ_2;
      ջ[] var6 = new ջ[this.int_ÿ_2];
      byte var7 = var10000;

      label28:
      while (true) {
         if (var5 != null) {
            var9 = var6;
            int var10001 = var7;
            if (var2 > 0L) {
               if (var7 == 0) {
                  break;
               }

               var10001 = var4;
            }

            var6[var10001] = var5;
            var5.int_é_2 = var4++;
            var5 = var5.ջ_ê_2;
            if (var7 != 0) {
               continue;
            }
         }

         while (var2 < 0L) {
            if (var7 != 0) {
               continue label28;
            }
         }

         var9 = var6;
         break;
      }

      return var9;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void invoke_11(Object[] var1) {
      ջ var2 = (ջ)var1[0];
      ջ var3 = (ջ)var1[1];
      long var4 = (Long)var1[2];
      var4 = encKey_a_2 ^ var4;
      boolean var10000 = BreezeClass12.isValid();
      ջ var6 = var2.ջ_ê_2;
      boolean var7 = var10000;

      label93: {
         label92: {
            label91: {
               label90: {
                  try {
                     var3.ջ_ê_2 = var6;
                     var19 = var6;
                     if (var7) {
                        break label90;
                     }

                     if (var6 == null) {
                        break label91;
                     }
                  } catch (IndexOutOfBoundsException var17) {
                     throw method_024(var17);
                  }

                  var19 = var6;
               }

               try {
                  if (var4 <= 0L) {
                     break label93;
                  }

                  var19.ջ_ë_2 = var3;
                  if (!var7) {
                     break label92;
                  }
               } catch (IndexOutOfBoundsException var16) {
                  throw method_024(var16);
               }
            }

            try {
               this.ջ_ý_2 = var3;
            } catch (IndexOutOfBoundsException var12) {
               throw method_024(var12);
            }
         }

         var19 = var2.ջ_ë_2;
      }

      ջ var8 = var19;

      label75: {
         label74: {
            label73: {
               try {
                  var3.ջ_ë_2 = var8;
                  var20 = var8;
                  if (var4 <= 0L || var7) {
                     break label73;
                  }

                  if (var8 == null) {
                     break label74;
                  }
               } catch (IndexOutOfBoundsException var15) {
                  throw method_024(var15);
               }

               var20 = var8;
            }

            try {
               var20.ջ_ê_2 = var3;
               if (var4 < 0L || !var7) {
                  break label75;
               }
            } catch (IndexOutOfBoundsException var14) {
               throw method_024(var14);
            }
         }

         try {
            this.ջ_þ_2 = var3;
         } catch (IndexOutOfBoundsException var11) {
            throw method_024(var11);
         }
      }

      label57: {
         if (this.arr_ü_2 != null) {
            int var9 = var2.int_é_2;

            try {
               this.arr_ü_2[var9] = var3;
               var3.int_é_2 = var9;
               if (var4 < 0L) {
                  return;
               }

               if (!var7) {
                  break label57;
               }
            } catch (IndexOutOfBoundsException var13) {
               throw method_024(var13);
            }
         }

         try {
            var3.int_é_2 = 0;
         } catch (IndexOutOfBoundsException var10) {
            throw method_024(var10);
         }
      }

      var2.int_é_2 = -1;
      var2.ջ_ë_2 = null;
      var2.ջ_ê_2 = null;
   }

   public void invoke_12(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/ջ
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 21: bipush 1
      // 22: iadd
      // 23: putfield rip/breeze/inject/թ.int_ÿ_2 I
      // 26: istore 5
      // 28: aload 0
      // 29: getfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 2c: iload 5
      // 2e: ifeq 67
      // 31: ifnonnull 57
      // 34: goto 3b
      // 37: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: aload 2
      // 3d: putfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 40: aload 0
      // 41: aload 2
      // 42: putfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 45: lload 3
      // 46: lconst_0
      // 47: lcmp
      // 48: iflt 7d
      // 4b: iload 5
      // 4d: ifne 6e
      // 50: goto 57
      // 53: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 56: athrow
      // 57: aload 0
      // 58: getfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 5b: aload 2
      // 5c: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 5f: aload 2
      // 60: goto 67
      // 63: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 66: athrow
      // 67: aload 0
      // 68: getfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 6b: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 6e: aload 0
      // 6f: aload 2
      // 70: putfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 73: aload 0
      // 74: aconst_null
      // 75: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 78: aload 2
      // 79: bipush 0
      // 7a: putfield rip/breeze/inject/ջ.int_é_2 I
      // 7d: return
      // try (25 -> 30): 31 java/lang/IndexOutOfBoundsException
      // try (29 -> 45): 46 java/lang/IndexOutOfBoundsException
      // try (33 -> 53): 54 java/lang/IndexOutOfBoundsException
   }

   public void invoke_13(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/թ
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 86808231188398
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 25: istore 7
      // 27: aload 2
      // 28: iload 7
      // 2a: ifeq 4d
      // 2d: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 30: ifne 3f
      // 33: goto 3a
      // 36: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 39: athrow
      // 3a: return
      // 3b: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 3e: athrow
      // 3f: aload 0
      // 40: dup
      // 41: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 44: aload 2
      // 45: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 48: iadd
      // 49: putfield rip/breeze/inject/թ.int_ÿ_2 I
      // 4c: aload 0
      // 4d: getfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 50: iload 7
      // 52: ifeq 8c
      // 55: ifnonnull 81
      // 58: goto 5f
      // 5b: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 5e: athrow
      // 5f: aload 0
      // 60: aload 2
      // 61: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 64: putfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 67: aload 0
      // 68: aload 2
      // 69: getfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 6c: putfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 6f: lload 3
      // 70: lconst_0
      // 71: lcmp
      // 72: ifle c9
      // 75: iload 7
      // 77: ifne a8
      // 7a: goto 81
      // 7d: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 80: athrow
      // 81: aload 2
      // 82: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 85: goto 8c
      // 88: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 8b: athrow
      // 8c: astore 8
      // 8e: aload 0
      // 8f: getfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 92: aload 8
      // 94: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 97: aload 8
      // 99: aload 0
      // 9a: getfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 9d: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // a0: aload 0
      // a1: aload 2
      // a2: getfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // a5: putfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // a8: aload 0
      // a9: aconst_null
      // aa: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // ad: aload 2
      // ae: lload 5
      // b0: bipush 0
      // b1: bipush 2
      // b2: anewarray 5
      // b5: dup_x1
      // b6: swap
      // b7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // ba: bipush 1
      // bb: swap
      // bc: aastore
      // bd: dup_x2
      // be: dup_x2
      // bf: pop
      // c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c3: bipush 0
      // c4: swap
      // c5: aastore
      // c6: invokevirtual rip/breeze/inject/թ.method_021 ([Ljava/lang/Object;)V
      // c9: return
      // try (25 -> 30): 31 java/lang/IndexOutOfBoundsException
      // try (28 -> 34): 34 java/lang/IndexOutOfBoundsException
      // try (44 -> 48): 49 java/lang/IndexOutOfBoundsException
      // try (47 -> 65): 66 java/lang/IndexOutOfBoundsException
      // try (51 -> 70): 71 java/lang/IndexOutOfBoundsException
   }

   public void invoke_14(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/ջ
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 21: bipush 1
      // 22: iadd
      // 23: putfield rip/breeze/inject/թ.int_ÿ_2 I
      // 26: istore 5
      // 28: aload 0
      // 29: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 2c: iload 5
      // 2e: ifeq 67
      // 31: ifnonnull 57
      // 34: goto 3b
      // 37: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: aload 2
      // 3d: putfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 40: aload 0
      // 41: aload 2
      // 42: putfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 45: lload 3
      // 46: lconst_0
      // 47: lcmp
      // 48: ifle 7d
      // 4b: iload 5
      // 4d: ifne 6e
      // 50: goto 57
      // 53: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 56: athrow
      // 57: aload 0
      // 58: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 5b: aload 2
      // 5c: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 5f: aload 2
      // 60: goto 67
      // 63: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 66: athrow
      // 67: aload 0
      // 68: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 6b: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 6e: aload 0
      // 6f: aload 2
      // 70: putfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 73: aload 0
      // 74: aconst_null
      // 75: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 78: aload 2
      // 79: bipush 0
      // 7a: putfield rip/breeze/inject/ջ.int_é_2 I
      // 7d: return
      // try (25 -> 30): 31 java/lang/IndexOutOfBoundsException
      // try (29 -> 45): 46 java/lang/IndexOutOfBoundsException
      // try (33 -> 53): 54 java/lang/IndexOutOfBoundsException
   }

   public void invoke_15(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/թ
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 60997503395946
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 25: istore 7
      // 27: aload 2
      // 28: iload 7
      // 2a: ifne 4d
      // 2d: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 30: ifne 3f
      // 33: goto 3a
      // 36: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 39: athrow
      // 3a: return
      // 3b: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 3e: athrow
      // 3f: aload 0
      // 40: dup
      // 41: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 44: aload 2
      // 45: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 48: iadd
      // 49: putfield rip/breeze/inject/թ.int_ÿ_2 I
      // 4c: aload 0
      // 4d: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 50: iload 7
      // 52: ifne 8c
      // 55: ifnonnull 81
      // 58: goto 5f
      // 5b: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 5e: athrow
      // 5f: aload 0
      // 60: aload 2
      // 61: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 64: putfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 67: aload 0
      // 68: aload 2
      // 69: getfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 6c: putfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 6f: lload 3
      // 70: lconst_0
      // 71: lcmp
      // 72: iflt c9
      // 75: iload 7
      // 77: ifeq a8
      // 7a: goto 81
      // 7d: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 80: athrow
      // 81: aload 2
      // 82: getfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 85: goto 8c
      // 88: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 8b: athrow
      // 8c: astore 8
      // 8e: aload 0
      // 8f: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 92: aload 8
      // 94: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 97: aload 8
      // 99: aload 0
      // 9a: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 9d: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // a0: aload 0
      // a1: aload 2
      // a2: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // a5: putfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // a8: aload 0
      // a9: aconst_null
      // aa: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // ad: aload 2
      // ae: lload 5
      // b0: bipush 0
      // b1: bipush 2
      // b2: anewarray 5
      // b5: dup_x1
      // b6: swap
      // b7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // ba: bipush 1
      // bb: swap
      // bc: aastore
      // bd: dup_x2
      // be: dup_x2
      // bf: pop
      // c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c3: bipush 0
      // c4: swap
      // c5: aastore
      // c6: invokevirtual rip/breeze/inject/թ.method_021 ([Ljava/lang/Object;)V
      // c9: return
      // try (25 -> 30): 31 java/lang/IndexOutOfBoundsException
      // try (28 -> 34): 34 java/lang/IndexOutOfBoundsException
      // try (44 -> 48): 49 java/lang/IndexOutOfBoundsException
      // try (47 -> 65): 66 java/lang/IndexOutOfBoundsException
      // try (51 -> 70): 71 java/lang/IndexOutOfBoundsException
   }

   public void invoke_16(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/ջ
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast rip/breeze/inject/ջ
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 26: aload 0
      // 27: dup
      // 28: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 2b: bipush 1
      // 2c: iadd
      // 2d: putfield rip/breeze/inject/թ.int_ÿ_2 I
      // 30: istore 6
      // 32: aload 2
      // 33: getfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 36: astore 7
      // 38: aload 7
      // 3a: iload 6
      // 3c: ifne 6a
      // 3f: ifnonnull 61
      // 42: goto 49
      // 45: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 3
      // 4b: putfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 4e: lload 4
      // 50: lconst_0
      // 51: lcmp
      // 52: ifle 88
      // 55: iload 6
      // 57: ifeq 6e
      // 5a: goto 61
      // 5d: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 60: athrow
      // 61: aload 7
      // 63: goto 6a
      // 66: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 69: athrow
      // 6a: aload 3
      // 6b: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 6e: aload 2
      // 6f: aload 3
      // 70: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 73: aload 3
      // 74: aload 7
      // 76: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 79: aload 3
      // 7a: aload 2
      // 7b: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 7e: aload 0
      // 7f: aconst_null
      // 80: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 83: aload 3
      // 84: bipush 0
      // 85: putfield rip/breeze/inject/ջ.int_é_2 I
      // 88: return
      // try (33 -> 37): 38 java/lang/IndexOutOfBoundsException
      // try (36 -> 49): 50 java/lang/IndexOutOfBoundsException
      // try (40 -> 53): 54 java/lang/IndexOutOfBoundsException
   }

   public void invoke_17(Object[] param1) {
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
      // 0e: checkcast rip/breeze/inject/ջ
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast rip/breeze/inject/թ
      // 19: astore 5
      // 1b: pop
      // 1c: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 66510032167049
      // 27: lxor
      // 28: lstore 6
      // 2a: pop2
      // 2b: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 2e: istore 8
      // 30: aload 5
      // 32: iload 8
      // 34: ifne 59
      // 37: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 3a: ifne 49
      // 3d: goto 44
      // 40: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 43: athrow
      // 44: return
      // 45: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 48: athrow
      // 49: aload 0
      // 4a: dup
      // 4b: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 4e: aload 5
      // 50: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 53: iadd
      // 54: putfield rip/breeze/inject/թ.int_ÿ_2 I
      // 57: aload 5
      // 59: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 5c: astore 9
      // 5e: aload 5
      // 60: getfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 63: astore 10
      // 65: aload 4
      // 67: getfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 6a: astore 11
      // 6c: aload 11
      // 6e: iload 8
      // 70: ifne 9e
      // 73: ifnonnull 95
      // 76: goto 7d
      // 79: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 7c: athrow
      // 7d: aload 0
      // 7e: aload 10
      // 80: putfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 83: lload 2
      // 84: lconst_0
      // 85: lcmp
      // 86: ifle da
      // 89: iload 8
      // 8b: ifeq a3
      // 8e: goto 95
      // 91: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 94: athrow
      // 95: aload 11
      // 97: goto 9e
      // 9a: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 9d: athrow
      // 9e: aload 10
      // a0: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // a3: aload 4
      // a5: aload 9
      // a7: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // aa: aload 10
      // ac: aload 11
      // ae: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // b1: aload 9
      // b3: aload 4
      // b5: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // b8: aload 0
      // b9: aconst_null
      // ba: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // bd: aload 5
      // bf: lload 6
      // c1: bipush 0
      // c2: bipush 2
      // c3: anewarray 5
      // c6: dup_x1
      // c7: swap
      // c8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // cb: bipush 1
      // cc: swap
      // cd: aastore
      // ce: dup_x2
      // cf: dup_x2
      // d0: pop
      // d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d4: bipush 0
      // d5: swap
      // d6: aastore
      // d7: invokevirtual rip/breeze/inject/թ.method_021 ([Ljava/lang/Object;)V
      // da: return
      // try (30 -> 35): 36 java/lang/IndexOutOfBoundsException
      // try (33 -> 39): 39 java/lang/IndexOutOfBoundsException
      // try (57 -> 61): 62 java/lang/IndexOutOfBoundsException
      // try (60 -> 73): 74 java/lang/IndexOutOfBoundsException
      // try (64 -> 77): 78 java/lang/IndexOutOfBoundsException
   }

   public void invoke_18(Object[] param1) {
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
      // 0e: checkcast rip/breeze/inject/ջ
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast rip/breeze/inject/ջ
      // 19: astore 5
      // 1b: pop
      // 1c: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: aload 0
      // 23: dup
      // 24: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 27: bipush 1
      // 28: iadd
      // 29: putfield rip/breeze/inject/թ.int_ÿ_2 I
      // 2c: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 2f: aload 4
      // 31: getfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 34: astore 6
      // 36: istore 7
      // 38: aload 6
      // 3a: iload 7
      // 3c: ifne 6a
      // 3f: ifnonnull 61
      // 42: goto 49
      // 45: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 5
      // 4c: putfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 4f: lload 2
      // 50: lconst_0
      // 51: lcmp
      // 52: ifle 8f
      // 55: iload 7
      // 57: ifeq 6f
      // 5a: goto 61
      // 5d: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 60: athrow
      // 61: aload 6
      // 63: goto 6a
      // 66: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 69: athrow
      // 6a: aload 5
      // 6c: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 6f: aload 4
      // 71: aload 5
      // 73: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 76: aload 5
      // 78: aload 4
      // 7a: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 7d: aload 5
      // 7f: aload 6
      // 81: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 84: aload 0
      // 85: aconst_null
      // 86: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 89: aload 5
      // 8b: bipush 0
      // 8c: putfield rip/breeze/inject/ջ.int_é_2 I
      // 8f: return
      // try (33 -> 37): 38 java/lang/IndexOutOfBoundsException
      // try (36 -> 49): 50 java/lang/IndexOutOfBoundsException
      // try (40 -> 53): 54 java/lang/IndexOutOfBoundsException
   }

   public void invoke_19(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/ջ
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast rip/breeze/inject/թ
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 74249256659788
      // 29: lxor
      // 2a: lstore 6
      // 2c: pop2
      // 2d: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 30: istore 8
      // 32: aload 3
      // 33: iload 8
      // 35: ifeq 58
      // 38: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 3b: ifne 4a
      // 3e: goto 45
      // 41: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 44: athrow
      // 45: return
      // 46: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 49: athrow
      // 4a: aload 0
      // 4b: dup
      // 4c: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 4f: aload 3
      // 50: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 53: iadd
      // 54: putfield rip/breeze/inject/թ.int_ÿ_2 I
      // 57: aload 3
      // 58: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 5b: astore 9
      // 5d: aload 3
      // 5e: getfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 61: astore 10
      // 63: aload 2
      // 64: getfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 67: astore 11
      // 69: aload 11
      // 6b: iload 8
      // 6d: ifeq 9c
      // 70: ifnonnull 93
      // 73: goto 7a
      // 76: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 79: athrow
      // 7a: aload 0
      // 7b: aload 9
      // 7d: putfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 80: lload 4
      // 82: lconst_0
      // 83: lcmp
      // 84: ifle d5
      // 87: iload 8
      // 89: ifne a1
      // 8c: goto 93
      // 8f: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 92: athrow
      // 93: aload 11
      // 95: goto 9c
      // 98: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 9b: athrow
      // 9c: aload 9
      // 9e: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // a1: aload 2
      // a2: aload 10
      // a4: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // a7: aload 10
      // a9: aload 2
      // aa: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // ad: aload 9
      // af: aload 11
      // b1: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // b4: aload 0
      // b5: aconst_null
      // b6: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // b9: aload 3
      // ba: lload 6
      // bc: bipush 0
      // bd: bipush 2
      // be: anewarray 5
      // c1: dup_x1
      // c2: swap
      // c3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // c6: bipush 1
      // c7: swap
      // c8: aastore
      // c9: dup_x2
      // ca: dup_x2
      // cb: pop
      // cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // cf: bipush 0
      // d0: swap
      // d1: aastore
      // d2: invokevirtual rip/breeze/inject/թ.method_021 ([Ljava/lang/Object;)V
      // d5: return
      // try (30 -> 35): 36 java/lang/IndexOutOfBoundsException
      // try (33 -> 39): 39 java/lang/IndexOutOfBoundsException
      // try (57 -> 61): 62 java/lang/IndexOutOfBoundsException
      // try (60 -> 73): 74 java/lang/IndexOutOfBoundsException
      // try (64 -> 77): 78 java/lang/IndexOutOfBoundsException
   }

   public void invoke_20(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/ջ
      // 011: astore 4
      // 013: pop
      // 014: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: aload 0
      // 01b: dup
      // 01c: getfield rip/breeze/inject/թ.int_ÿ_2 I
      // 01f: bipush 1
      // 020: isub
      // 021: putfield rip/breeze/inject/թ.int_ÿ_2 I
      // 024: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 027: aload 4
      // 029: getfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 02c: astore 5
      // 02e: istore 6
      // 030: aload 4
      // 032: getfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 035: astore 7
      // 037: aload 5
      // 039: iload 6
      // 03b: ifne 0af
      // 03e: ifnonnull 0a6
      // 041: goto 048
      // 044: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 047: athrow
      // 048: aload 7
      // 04a: lload 2
      // 04b: lconst_0
      // 04c: lcmp
      // 04d: ifle 091
      // 050: iload 6
      // 052: ifne 091
      // 055: goto 05c
      // 058: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 05b: athrow
      // 05c: lload 2
      // 05d: lconst_0
      // 05e: lcmp
      // 05f: iflt 08a
      // 062: ifnonnull 088
      // 065: goto 06c
      // 068: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 06b: athrow
      // 06c: aload 0
      // 06d: aconst_null
      // 06e: putfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 071: aload 0
      // 072: aconst_null
      // 073: putfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 076: lload 2
      // 077: lconst_0
      // 078: lcmp
      // 079: iflt 108
      // 07c: iload 6
      // 07e: ifeq 0f1
      // 081: goto 088
      // 084: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 087: athrow
      // 088: aload 7
      // 08a: goto 091
      // 08d: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 090: athrow
      // 091: aconst_null
      // 092: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 095: aload 0
      // 096: aload 7
      // 098: putfield rip/breeze/inject/թ.ջ_ý_2 Lrip/breeze/inject/ջ;
      // 09b: lload 2
      // 09c: lconst_0
      // 09d: lcmp
      // 09e: iflt 108
      // 0a1: iload 6
      // 0a3: ifeq 0f1
      // 0a6: aload 7
      // 0a8: goto 0af
      // 0ab: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0ae: athrow
      // 0af: iload 6
      // 0b1: ifne 0ec
      // 0b4: ifnonnull 0dc
      // 0b7: goto 0be
      // 0ba: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: aload 5
      // 0c1: putfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 0c4: aload 5
      // 0c6: aconst_null
      // 0c7: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 0ca: lload 2
      // 0cb: lconst_0
      // 0cc: lcmp
      // 0cd: iflt 108
      // 0d0: iload 6
      // 0d2: ifeq 0f1
      // 0d5: goto 0dc
      // 0d8: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0db: athrow
      // 0dc: aload 7
      // 0de: aload 5
      // 0e0: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 0e3: aload 5
      // 0e5: goto 0ec
      // 0e8: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0eb: athrow
      // 0ec: aload 7
      // 0ee: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 0f1: aload 0
      // 0f2: aconst_null
      // 0f3: putfield rip/breeze/inject/թ.arr_ü_2 [Lrip/breeze/inject/ջ;
      // 0f6: aload 4
      // 0f8: bipush -1
      // 0f9: putfield rip/breeze/inject/ջ.int_é_2 I
      // 0fc: aload 4
      // 0fe: aconst_null
      // 0ff: putfield rip/breeze/inject/ջ.ջ_ë_2 Lrip/breeze/inject/ջ;
      // 102: aload 4
      // 104: aconst_null
      // 105: putfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 108: return
      // try (31 -> 35): 36 java/lang/IndexOutOfBoundsException
      // try (34 -> 45): 46 java/lang/IndexOutOfBoundsException
      // try (38 -> 53): 54 java/lang/IndexOutOfBoundsException
      // try (48 -> 68): 69 java/lang/IndexOutOfBoundsException
      // try (56 -> 72): 73 java/lang/IndexOutOfBoundsException
      // try (75 -> 87): 88 java/lang/IndexOutOfBoundsException
      // try (90 -> 93): 94 java/lang/IndexOutOfBoundsException
      // try (92 -> 108): 109 java/lang/IndexOutOfBoundsException
      // try (96 -> 115): 116 java/lang/IndexOutOfBoundsException
   }

   void invoke_21(Object[] var1) {
      long var2 = (Long)var1[0];
      boolean var4 = (Boolean)var1[1];
      var2 = encKey_a_2 ^ var2;
      boolean var5 = BreezeClass12.isValid();

      label51: {
         try {
            if (var5) {
               return;
            }

            if (!var4) {
               break label51;
            }
         } catch (IndexOutOfBoundsException var9) {
            throw method_024(var9);
         }

         ջ var6 = this.ջ_þ_2;

         label40:
         while (var6 != null) {
            ջ var7 = var6.ջ_ê_2;
            var6.int_é_2 = -1;
            var6.ջ_ë_2 = null;
            var6.ջ_ê_2 = null;
            var6 = var7;

            while (true) {
               try {
                  boolean var10000 = var5;
                  if (var2 >= 0L) {
                     if (var5) {
                        return;
                     }

                     var10000 = var5;
                  }

                  if (!var10000) {
                     break;
                  }
               } catch (IndexOutOfBoundsException var8) {
                  throw method_024(var8);
               }

               if (var2 > 0L) {
                  break label40;
               }
            }
         }
      }

      this.int_ÿ_2 = 0;
      this.ջ_þ_2 = null;
      this.ջ_ý_2 = null;
      this.arr_ü_2 = null;
   }

   public void invoke_22(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_a_2 ^ var2;
      long var4 = var2 ^ 86292878690239L;
      Object[] var10004 = new Object[]{null, false};
      var10004[0] = var4;
      this.method_021(var10004);
   }

   public void invoke_23(Object[] param1) {
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
      // 0b: pop
      // 0c: getstatic rip/breeze/inject/թ.encKey_a_2 J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 15: aload 0
      // 16: getfield rip/breeze/inject/թ.ջ_þ_2 Lrip/breeze/inject/ջ;
      // 19: astore 4
      // 1b: istore 5
      // 1d: aload 4
      // 1f: ifnull 5b
      // 22: lload 2
      // 23: lconst_0
      // 24: lcmp
      // 25: iflt 56
      // 28: aload 4
      // 2a: iload 5
      // 2c: ifne 54
      // 2f: instanceof rip/breeze/inject/ճ
      // 32: ifeq 4f
      // 35: goto 3c
      // 38: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 3b: athrow
      // 3c: aload 4
      // 3e: checkcast rip/breeze/inject/ճ
      // 41: bipush 0
      // 42: anewarray 5
      // 45: invokevirtual rip/breeze/inject/ճ.method_002 ([Ljava/lang/Object;)V
      // 48: goto 4f
      // 4b: invokestatic rip/breeze/inject/թ.method_024 (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 4e: athrow
      // 4f: aload 4
      // 51: getfield rip/breeze/inject/ջ.ջ_ê_2 Lrip/breeze/inject/ջ;
      // 54: astore 4
      // 56: iload 5
      // 58: ifeq 1d
      // 5b: lload 2
      // 5c: lconst_0
      // 5d: lcmp
      // 5e: iflt 22
      // 61: return
      // try (19 -> 28): 29 java/lang/IndexOutOfBoundsException
      // try (26 -> 36): 37 java/lang/IndexOutOfBoundsException
   }

   private static IndexOutOfBoundsException invoke_24(IndexOutOfBoundsException var0) {
      return var0;
   }
}
