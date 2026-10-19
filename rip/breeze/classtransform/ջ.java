package rip.breeze.classtransform;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ջ {
   public static final rip.breeze.inject.MathUtil3 CONST_Ÿ_2;
   public static final String CONST_Þ_2;
   public static final String CONST_Ý_2;
   public static final String CONST_Ü_2;
   public static final String CONST_Û_2;
   public static final String CONST_Ú_2;
   public static final String CONST_Ù_2;
   public static final String CONST_Ø_2;
   public static final String CONST_Ö_2;
   public static final String CONST_Õ_2;
   public static final String CONST_Ô_2;
   public static final String CONST_Ó_2;
   public static final String CONST_Ò_2;
   public static final String CONST_Ñ_2;
   public static final String CONST_Ð_2;
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   public static boolean check_1(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast rip/breeze/inject/MathUtil3
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/ջ.encKey_a_2 J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: invokestatic rip/breeze/classtransform/MathUtil3.getValue_5 ()I
      // 01c: istore 4
      // 01e: aload 1
      // 01f: getstatic rip/breeze/inject/MathUtil3.CONST_Ð Lrip/breeze/inject/MathUtil3;
      // 022: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 025: iload 4
      // 027: ifne 041
      // 02a: ifeq 03a
      // 02d: goto 034
      // 030: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: bipush 1
      // 035: ireturn
      // 036: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: aload 1
      // 03b: getstatic rip/breeze/inject/MathUtil3.CONST_Ï Lrip/breeze/inject/MathUtil3;
      // 03e: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 041: iload 4
      // 043: lload 2
      // 044: lconst_0
      // 045: lcmp
      // 046: ifle 065
      // 049: ifne 063
      // 04c: ifeq 05c
      // 04f: goto 056
      // 052: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055: athrow
      // 056: bipush 1
      // 057: ireturn
      // 058: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: aload 1
      // 05d: getstatic rip/breeze/inject/MathUtil3.CONST_Í Lrip/breeze/inject/MathUtil3;
      // 060: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 063: iload 4
      // 065: lload 2
      // 066: lconst_0
      // 067: lcmp
      // 068: ifle 087
      // 06b: ifne 085
      // 06e: ifeq 07e
      // 071: goto 078
      // 074: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: bipush 1
      // 079: ireturn
      // 07a: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: aload 1
      // 07f: getstatic rip/breeze/inject/MathUtil3.CONST_Ì Lrip/breeze/inject/MathUtil3;
      // 082: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 085: iload 4
      // 087: lload 2
      // 088: lconst_0
      // 089: lcmp
      // 08a: ifle 0a9
      // 08d: ifne 0a7
      // 090: ifeq 0a0
      // 093: goto 09a
      // 096: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: bipush 1
      // 09b: ireturn
      // 09c: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: aload 1
      // 0a1: getstatic rip/breeze/inject/MathUtil3.CONST_Î Lrip/breeze/inject/MathUtil3;
      // 0a4: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0a7: iload 4
      // 0a9: lload 2
      // 0aa: lconst_0
      // 0ab: lcmp
      // 0ac: ifle 0cb
      // 0af: ifne 0c9
      // 0b2: ifeq 0c2
      // 0b5: goto 0bc
      // 0b8: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bb: athrow
      // 0bc: bipush 1
      // 0bd: ireturn
      // 0be: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: aload 1
      // 0c3: getstatic rip/breeze/inject/MathUtil3.CONST_Ë Lrip/breeze/inject/MathUtil3;
      // 0c6: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0c9: iload 4
      // 0cb: lload 2
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: iflt 0ed
      // 0d1: ifne 0eb
      // 0d4: ifeq 0e4
      // 0d7: goto 0de
      // 0da: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: bipush 1
      // 0df: ireturn
      // 0e0: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: aload 1
      // 0e5: getstatic rip/breeze/inject/MathUtil3.CONST_É Lrip/breeze/inject/MathUtil3;
      // 0e8: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0eb: iload 4
      // 0ed: lload 2
      // 0ee: lconst_0
      // 0ef: lcmp
      // 0f0: iflt 10f
      // 0f3: ifne 10d
      // 0f6: ifeq 106
      // 0f9: goto 100
      // 0fc: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: bipush 1
      // 101: ireturn
      // 102: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: aload 1
      // 107: getstatic rip/breeze/inject/MathUtil3.CONST_Ê Lrip/breeze/inject/MathUtil3;
      // 10a: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 10d: iload 4
      // 10f: lload 2
      // 110: lconst_0
      // 111: lcmp
      // 112: ifle 131
      // 115: ifne 12f
      // 118: ifeq 128
      // 11b: goto 122
      // 11e: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: bipush 1
      // 123: ireturn
      // 124: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: aload 1
      // 129: getstatic rip/breeze/inject/MathUtil3.CONST_È Lrip/breeze/inject/MathUtil3;
      // 12c: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 12f: iload 4
      // 131: ifne 145
      // 134: ifeq 144
      // 137: goto 13e
      // 13a: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: bipush 1
      // 13f: ireturn
      // 140: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: bipush 0
      // 145: ireturn
      // try (19 -> 25): 26 java/lang/IllegalArgumentException
      // try (24 -> 30): 30 java/lang/IllegalArgumentException
      // try (35 -> 42): 43 java/lang/IllegalArgumentException
      // try (41 -> 47): 47 java/lang/IllegalArgumentException
      // try (52 -> 59): 60 java/lang/IllegalArgumentException
      // try (58 -> 64): 64 java/lang/IllegalArgumentException
      // try (69 -> 76): 77 java/lang/IllegalArgumentException
      // try (75 -> 81): 81 java/lang/IllegalArgumentException
      // try (86 -> 93): 94 java/lang/IllegalArgumentException
      // try (92 -> 98): 98 java/lang/IllegalArgumentException
      // try (103 -> 110): 111 java/lang/IllegalArgumentException
      // try (109 -> 115): 115 java/lang/IllegalArgumentException
      // try (120 -> 127): 128 java/lang/IllegalArgumentException
      // try (126 -> 132): 132 java/lang/IllegalArgumentException
      // try (137 -> 144): 145 java/lang/IllegalArgumentException
      // try (143 -> 149): 149 java/lang/IllegalArgumentException
      // try (154 -> 157): 158 java/lang/IllegalArgumentException
      // try (156 -> 162): 162 java/lang/IllegalArgumentException
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static rip.breeze.inject.MathUtil3 invoke_2(Object[] var0) {
      long var1 = (Long)var0[0];
      Object var3 = var0[1];
      var1 = encKey_a_2 ^ var1;
      long var4 = var1 ^ 9580349632695L;
      long var6 = var1 ^ 23411826091610L;
      long var8 = var1 ^ 54981539662198L;
      long var10 = var1 ^ 108106760498906L;
      if (var3 instanceof String) {
         String var12 = (String)var3;

         try {
            return rip.breeze.inject.MathUtil3.getDataBuilder(var12);
         } catch (Throwable var14) {
            return rip.breeze.inject.MathUtil3.getDataBuilder_6(var12);
         }
      } else {
         boolean var10000;
         label82: {
            try {
               var10000 = var3 instanceof Class;
               if (var1 < 0L) {
                  break label82;
               }

               if (var10000) {
                  return rip.breeze.inject.MathUtil3.getDataBuilder_2(new Object[]{(Class)var3, var8});
               }
            } catch (Throwable var22) {
               throw method_009(var22);
            }

            try {
               var10000 = var3 instanceof Method;
            } catch (Throwable var17) {
               throw method_009(var17);
            }
         }

         label72: {
            try {
               if (var1 <= 0L) {
                  break label72;
               }

               if (var10000) {
                  return rip.breeze.inject.MathUtil3.getDataBuilder_4(new Object[]{(Method)var3, var6});
               }
            } catch (Throwable var21) {
               throw method_009(var21);
            }

            try {
               var10000 = var3 instanceof Constructor;
            } catch (Throwable var16) {
               throw method_009(var16);
            }
         }

         label61: {
            label60: {
               try {
                  if (var1 <= 0L) {
                     break label60;
                  }

                  if (var10000) {
                     return rip.breeze.inject.MathUtil3.getDataBuilder_3(new Object[]{(Constructor)var3, var4});
                  }
               } catch (Throwable var20) {
                  throw method_009(var20);
               }

               try {
                  var24 = var3;
                  if (var1 < 0L) {
                     break label61;
                  }

                  var10000 = var3 instanceof rip.breeze.inject.MathUtil3;
               } catch (Throwable var19) {
                  throw method_009(var19);
               }
            }

            try {
               if (!var10000) {
                  throw new IllegalArgumentException(
                     ((String)null)
                        + method_008(new Object[]{var10, var3})
                        + ((String)null)
                  );
               }

               var24 = var3;
            } catch (Throwable var18) {
               throw method_009(var18);
            }
         }

         try {
            return (rip.breeze.inject.MathUtil3)var24;
         } catch (Throwable var15) {
            throw method_009(var15);
         }
      }
   }

   public static rip.breeze.inject.MathUtil3 invoke_3(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Object
      // 011: astore 3
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/ջ.encKey_a_2 J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 109726352331041
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 7812049375817
      // 025: lxor
      // 026: lstore 6
      // 028: dup2
      // 029: ldc2_w 272218696956
      // 02c: lxor
      // 02d: lstore 8
      // 02f: dup2
      // 030: ldc2_w 68541906361421
      // 033: lxor
      // 034: lstore 10
      // 036: pop2
      // 037: invokestatic rip/breeze/classtransform/MathUtil3.getValue_5 ()I
      // 03a: istore 12
      // 03c: aload 3
      // 03d: instanceof java/lang/String
      // 040: iload 12
      // 042: ifne 073
      // 045: ifeq 06f
      // 048: goto 04f
      // 04b: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: aload 3
      // 050: checkcast java/lang/String
      // 053: lload 8
      // 055: bipush 2
      // 056: anewarray 4
      // 059: dup_x2
      // 05a: dup_x2
      // 05b: pop
      // 05c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05f: bipush 1
      // 060: swap
      // 061: aastore
      // 062: dup_x1
      // 063: swap
      // 064: bipush 0
      // 065: swap
      // 066: aastore
      // 067: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_10 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 06a: areturn
      // 06b: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: aload 3
      // 070: instanceof java/lang/reflect/Method
      // 073: iload 12
      // 075: lload 1
      // 076: lconst_0
      // 077: lcmp
      // 078: iflt 0ae
      // 07b: ifne 0ac
      // 07e: ifeq 0a8
      // 081: goto 088
      // 084: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: lload 4
      // 08a: aload 3
      // 08b: checkcast java/lang/reflect/Method
      // 08e: bipush 2
      // 08f: anewarray 4
      // 092: dup_x1
      // 093: swap
      // 094: bipush 1
      // 095: swap
      // 096: aastore
      // 097: dup_x2
      // 098: dup_x2
      // 099: pop
      // 09a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09d: bipush 0
      // 09e: swap
      // 09f: aastore
      // 0a0: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_11 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 0a3: areturn
      // 0a4: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: aload 3
      // 0a9: instanceof rip/breeze/inject/BreezeClass12
      // 0ac: iload 12
      // 0ae: lload 1
      // 0af: lconst_0
      // 0b0: lcmp
      // 0b1: iflt 0ea
      // 0b4: ifne 0e8
      // 0b7: ifeq 0e4
      // 0ba: goto 0c1
      // 0bd: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: aload 3
      // 0c2: checkcast rip/breeze/inject/BreezeClass12
      // 0c5: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0c8: lload 8
      // 0ca: bipush 2
      // 0cb: anewarray 4
      // 0ce: dup_x2
      // 0cf: dup_x2
      // 0d0: pop
      // 0d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d4: bipush 1
      // 0d5: swap
      // 0d6: aastore
      // 0d7: dup_x1
      // 0d8: swap
      // 0d9: bipush 0
      // 0da: swap
      // 0db: aastore
      // 0dc: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_10 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 0df: areturn
      // 0e0: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: aload 3
      // 0e5: instanceof rip/breeze/inject/կ
      // 0e8: iload 12
      // 0ea: ifne 12a
      // 0ed: ifeq 11a
      // 0f0: goto 0f7
      // 0f3: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: aload 3
      // 0f8: checkcast rip/breeze/inject/կ
      // 0fb: getfield rip/breeze/inject/կ.string_å_2 Ljava/lang/String;
      // 0fe: lload 8
      // 100: bipush 2
      // 101: anewarray 4
      // 104: dup_x2
      // 105: dup_x2
      // 106: pop
      // 107: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10a: bipush 1
      // 10b: swap
      // 10c: aastore
      // 10d: dup_x1
      // 10e: swap
      // 10f: bipush 0
      // 110: swap
      // 111: aastore
      // 112: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_10 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 115: areturn
      // 116: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: aload 3
      // 11b: iload 12
      // 11d: ifne 12e
      // 120: instanceof rip/breeze/inject/MathUtil3
      // 123: goto 12a
      // 126: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 129: athrow
      // 12a: ifeq 144
      // 12d: aload 3
      // 12e: checkcast rip/breeze/inject/MathUtil3
      // 131: lload 6
      // 133: bipush 1
      // 134: anewarray 4
      // 137: dup_x2
      // 138: dup_x2
      // 139: pop
      // 13a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13d: bipush 0
      // 13e: swap
      // 13f: aastore
      // 140: invokevirtual rip/breeze/inject/MathUtil3.getDataBuilder_9 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 143: areturn
      // 144: new java/lang/IllegalArgumentException
      // 147: dup
      // 148: new java/lang/StringBuilder
      // 14b: dup
      // 14c: invokespecial java/lang/StringBuilder.<init> ()V
      // 14f: sipush 8719
      // 152: ldc2_w 1706743991122194183
      // 155: lload 1
      // 156: lxor
      // 157: invokedynamic j (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ջ.method_013 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15f: lload 10
      // 161: aload 3
      // 162: bipush 2
      // 163: anewarray 4
      // 166: dup_x1
      // 167: swap
      // 168: bipush 1
      // 169: swap
      // 16a: aastore
      // 16b: dup_x2
      // 16c: dup_x2
      // 16d: pop
      // 16e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 171: bipush 0
      // 172: swap
      // 173: aastore
      // 174: invokestatic rip/breeze/classtransform/ջ.method_008 ([Ljava/lang/Object;)Ljava/lang/String;
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17d: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 180: athrow
      // try (37 -> 42): 43 java/lang/IllegalArgumentException
      // try (41 -> 64): 64 java/lang/IllegalArgumentException
      // try (68 -> 75): 76 java/lang/IllegalArgumentException
      // try (74 -> 97): 97 java/lang/IllegalArgumentException
      // try (101 -> 108): 109 java/lang/IllegalArgumentException
      // try (107 -> 131): 131 java/lang/IllegalArgumentException
      // try (135 -> 138): 139 java/lang/IllegalArgumentException
      // try (137 -> 161): 161 java/lang/IllegalArgumentException
      // try (163 -> 167): 168 java/lang/IllegalArgumentException
   }

   public static rip.breeze.inject.MathUtil3[] invoke_4(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Object
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/ջ.encKey_a_2 J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 47567952499470
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 104367481823596
      // 025: lxor
      // 026: lstore 6
      // 028: pop2
      // 029: invokestatic rip/breeze/classtransform/MathUtil3.getValue_5 ()I
      // 02c: istore 8
      // 02e: aload 1
      // 02f: instanceof java/lang/String
      // 032: iload 8
      // 034: ifne 065
      // 037: ifeq 061
      // 03a: goto 041
      // 03d: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: lload 6
      // 043: aload 1
      // 044: checkcast java/lang/String
      // 047: bipush 2
      // 048: anewarray 4
      // 04b: dup_x1
      // 04c: swap
      // 04d: bipush 1
      // 04e: swap
      // 04f: aastore
      // 050: dup_x2
      // 051: dup_x2
      // 052: pop
      // 053: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 056: bipush 0
      // 057: swap
      // 058: aastore
      // 059: invokestatic rip/breeze/inject/MathUtil3.clamp ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 05c: areturn
      // 05d: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: aload 1
      // 062: instanceof java/lang/reflect/Method
      // 065: iload 8
      // 067: lload 2
      // 068: lconst_0
      // 069: lcmp
      // 06a: iflt 0a0
      // 06d: ifne 09e
      // 070: ifeq 09a
      // 073: goto 07a
      // 076: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: lload 4
      // 07c: aload 1
      // 07d: checkcast java/lang/reflect/Method
      // 080: bipush 2
      // 081: anewarray 4
      // 084: dup_x1
      // 085: swap
      // 086: bipush 1
      // 087: swap
      // 088: aastore
      // 089: dup_x2
      // 08a: dup_x2
      // 08b: pop
      // 08c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08f: bipush 0
      // 090: swap
      // 091: aastore
      // 092: invokestatic rip/breeze/inject/MathUtil3.method_011 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 095: areturn
      // 096: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 1
      // 09b: instanceof rip/breeze/inject/BreezeClass12
      // 09e: iload 8
      // 0a0: ifne 0e2
      // 0a3: ifeq 0d2
      // 0a6: goto 0ad
      // 0a9: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: aload 1
      // 0ae: checkcast rip/breeze/inject/BreezeClass12
      // 0b1: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0b4: lload 6
      // 0b6: dup2_x1
      // 0b7: pop2
      // 0b8: bipush 2
      // 0b9: anewarray 4
      // 0bc: dup_x1
      // 0bd: swap
      // 0be: bipush 1
      // 0bf: swap
      // 0c0: aastore
      // 0c1: dup_x2
      // 0c2: dup_x2
      // 0c3: pop
      // 0c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c7: bipush 0
      // 0c8: swap
      // 0c9: aastore
      // 0ca: invokestatic rip/breeze/inject/MathUtil3.clamp ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 0cd: areturn
      // 0ce: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: aload 1
      // 0d3: iload 8
      // 0d5: ifne 0e6
      // 0d8: instanceof rip/breeze/inject/կ
      // 0db: goto 0e2
      // 0de: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: ifeq 106
      // 0e5: aload 1
      // 0e6: checkcast rip/breeze/inject/կ
      // 0e9: getfield rip/breeze/inject/կ.string_å_2 Ljava/lang/String;
      // 0ec: lload 6
      // 0ee: dup2_x1
      // 0ef: pop2
      // 0f0: bipush 2
      // 0f1: anewarray 4
      // 0f4: dup_x1
      // 0f5: swap
      // 0f6: bipush 1
      // 0f7: swap
      // 0f8: aastore
      // 0f9: dup_x2
      // 0fa: dup_x2
      // 0fb: pop
      // 0fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ff: bipush 0
      // 100: swap
      // 101: aastore
      // 102: invokestatic rip/breeze/inject/MathUtil3.clamp ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 105: areturn
      // 106: new java/lang/IllegalArgumentException
      // 109: dup
      // 10a: new java/lang/StringBuilder
      // 10d: dup
      // 10e: invokespecial java/lang/StringBuilder.<init> ()V
      // 111: sipush 26741
      // 114: ldc2_w 8518532606523719670
      // 117: lload 2
      // 118: lxor
      // 119: invokedynamic j (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ջ.method_013 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 121: aload 1
      // 122: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 125: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 128: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 12b: athrow
      // try (29 -> 34): 35 java/lang/IllegalArgumentException
      // try (33 -> 56): 56 java/lang/IllegalArgumentException
      // try (60 -> 67): 68 java/lang/IllegalArgumentException
      // try (66 -> 89): 89 java/lang/IllegalArgumentException
      // try (93 -> 96): 97 java/lang/IllegalArgumentException
      // try (95 -> 121): 121 java/lang/IllegalArgumentException
      // try (123 -> 127): 128 java/lang/IllegalArgumentException
   }

   public static String invoke_5(Object[] var0) {
      long var1 = (Long)var0[0];
      Object var3 = var0[1];
      var1 = encKey_a_2 ^ var1;
      long var4 = var1 ^ 64895121713938L;
      long var6 = var1 ^ 40301703227830L;

      try {
         return method_002(new Object[]{var4, var3}).buildString_3(new Object[0]);
      } catch (Throwable var9) {
         throw new IllegalArgumentException(((String)null) + method_008(new Object[]{var6, var3}), var9);
      }
   }

   public static String invoke_6(Object[] var0) {
      long var1 = (Long)var0[0];
      Object var3 = var0[1];
      var1 = encKey_a_2 ^ var1;
      long var4 = var1 ^ 70730811593168L;
      long var6 = var1 ^ 108192928459096L;
      long var8 = var1 ^ 138282025905148L;

      try {
         return method_002(new Object[]{var6, var3}).buildString_5(new Object[]{var4});
      } catch (Throwable var11) {
         throw new IllegalArgumentException(
            ((String)null) + method_008(new Object[]{var8, var3}) + ((String)null),
            var11
         );
      }
   }

   public static String invoke_7(Object... param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Object
      // 011: astore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast [Ljava/lang/Object;
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic rip/breeze/classtransform/ջ.encKey_a_2 J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: lload 1
      // 022: dup2
      // 023: ldc2_w 110067510056186
      // 026: lxor
      // 027: lstore 5
      // 029: dup2
      // 02a: ldc2_w 67230623726711
      // 02d: lxor
      // 02e: lstore 7
      // 030: dup2
      // 031: ldc2_w 65981927705506
      // 034: lxor
      // 035: lstore 9
      // 037: pop2
      // 038: aload 3
      // 039: instanceof java/lang/reflect/Method
      // 03c: ifeq 087
      // 03f: aload 4
      // 041: lload 1
      // 042: lconst_0
      // 043: lcmp
      // 044: ifle 083
      // 047: arraylength
      // 048: ifeq 06b
      // 04b: goto 052
      // 04e: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: new java/lang/IllegalArgumentException
      // 055: dup
      // 056: sipush 16940
      // 059: ldc2_w 3032084676281605963
      // 05c: lload 1
      // 05d: lxor
      // 05e: invokedynamic j (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ջ.method_013 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 066: athrow
      // 067: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: aload 3
      // 06c: checkcast java/lang/reflect/Method
      // 06f: lload 5
      // 071: bipush 2
      // 072: anewarray 4
      // 075: dup_x2
      // 076: dup_x2
      // 077: pop
      // 078: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07b: bipush 1
      // 07c: swap
      // 07d: aastore
      // 07e: dup_x1
      // 07f: swap
      // 080: bipush 0
      // 081: swap
      // 082: aastore
      // 083: invokestatic rip/breeze/inject/MathUtil3.buildString_10 ([Ljava/lang/Object;)Ljava/lang/String;
      // 086: areturn
      // 087: aload 3
      // 088: instanceof java/lang/reflect/Constructor
      // 08b: lload 1
      // 08c: lconst_0
      // 08d: lcmp
      // 08e: iflt 09d
      // 091: ifeq 0dc
      // 094: aload 4
      // 096: lload 1
      // 097: lconst_0
      // 098: lcmp
      // 099: ifle 0d8
      // 09c: arraylength
      // 09d: ifeq 0c0
      // 0a0: goto 0a7
      // 0a3: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: new java/lang/IllegalArgumentException
      // 0aa: dup
      // 0ab: sipush 10150
      // 0ae: ldc2_w 4584114162757991119
      // 0b1: lload 1
      // 0b2: lxor
      // 0b3: invokedynamic j (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ջ.method_013 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0bb: athrow
      // 0bc: invokestatic rip/breeze/classtransform/ջ.method_009 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: aload 3
      // 0c1: checkcast java/lang/reflect/Constructor
      // 0c4: lload 7
      // 0c6: bipush 2
      // 0c7: anewarray 4
      // 0ca: dup_x2
      // 0cb: dup_x2
      // 0cc: pop
      // 0cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d0: bipush 1
      // 0d1: swap
      // 0d2: aastore
      // 0d3: dup_x1
      // 0d4: swap
      // 0d5: bipush 0
      // 0d6: swap
      // 0d7: aastore
      // 0d8: invokestatic rip/breeze/inject/MathUtil3.buildString_8 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0db: areturn
      // 0dc: new java/lang/StringBuilder
      // 0df: dup
      // 0e0: ldc_w "("
      // 0e3: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 0e6: astore 11
      // 0e8: aload 4
      // 0ea: astore 12
      // 0ec: aload 12
      // 0ee: arraylength
      // 0ef: istore 13
      // 0f1: bipush 0
      // 0f2: istore 14
      // 0f4: iload 14
      // 0f6: iload 13
      // 0f8: if_icmpge 130
      // 0fb: aload 12
      // 0fd: iload 14
      // 0ff: aaload
      // 100: astore 15
      // 102: aload 11
      // 104: lload 9
      // 106: aload 15
      // 108: bipush 2
      // 109: anewarray 4
      // 10c: dup_x1
      // 10d: swap
      // 10e: bipush 1
      // 10f: swap
      // 110: aastore
      // 111: dup_x2
      // 112: dup_x2
      // 113: pop
      // 114: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 117: bipush 0
      // 118: swap
      // 119: aastore
      // 11a: invokestatic rip/breeze/classtransform/ջ.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 120: pop
      // 121: iinc 14 1
      // 124: lload 1
      // 125: lconst_0
      // 126: lcmp
      // 127: iflt 154
      // 12a: lload 1
      // 12b: lconst_0
      // 12c: lcmp
      // 12d: ifge 0f4
      // 130: aload 11
      // 132: ldc_w ")"
      // 135: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 138: lload 9
      // 13a: aload 3
      // 13b: bipush 2
      // 13c: anewarray 4
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 1
      // 142: swap
      // 143: aastore
      // 144: dup_x2
      // 145: dup_x2
      // 146: pop
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: bipush 0
      // 14b: swap
      // 14c: aastore
      // 14d: invokestatic rip/breeze/classtransform/ջ.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 150: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 153: pop
      // 154: aload 11
      // 156: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 159: areturn
      // try (36 -> 46): 47 java/lang/IllegalArgumentException
      // try (39 -> 58): 58 java/lang/IllegalArgumentException
      // try (79 -> 93): 94 java/lang/IllegalArgumentException
      // try (86 -> 105): 105 java/lang/IllegalArgumentException
   }

   private static String invoke_8(Object[] var0) {
      long var1 = (Long)var0[0];
      Object var3 = var0[1];
      var1 = encKey_a_2 ^ var1;

      try {
         if (var3 == null) {
            return ((String)null);
         }
      } catch (IllegalArgumentException var4) {
         throw method_009(var4);
      }

      return var3.toString();
   }

   static {
      long var0 = 62278010156731L;
      long var2 = var0 ^ 18449199565232L;
      long var4 = var0 ^ 1454609960514L;
      long var6 = var0 ^ 28327330311124L;
      Cipher var8;
      Cipher var10000 = var8 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var9 = 1; var9 < 8; var9++) {
         var10003[var9] = (byte)(var0 << var9 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var10 = new String[12];
      int var11 = 0;
      String var12 = "\u0012e¿öÛ\u00833\u0014\u00adô\u0090\u001e°Å\u0013èÓ\u0001ûI²©q\u0015¦hÙ±\u001a\u000eå$Ò\u007fÚ\u008f\u000fñ\u00078\u0018\u008b\u0012'²\u0091ûÉFSáøO!\u009aIé\u0004ÊÓ\u001c\u0082\u0090+\u001d0T9(9\u0012êþc¤¨ü×\u0007\u008b3Ì³:8\u0007\u00195NÃ³\u000fg\bæ\u009a\u009aÍ\u0007Á¸\u0002ì`\n\u00895Tð\u0081\u008b×\u001a*@s\u001e\u0094\u0087R¡\u009a\"`\u001b\fÔ\u0000²ÎèÍ\b,3Ñ8\u0089¸×PwJr\u008eNéñG¤W¨5âs\u0091É\u0095ö\u007fyÝ©\u0094äÆ¶N\u0000K\u00128¥e\u0018 :EÔ0\u0001\u0081\u0096\u0012\u000fì\u0007KÊ,º\u0006¤ähªç_\u0090\u0013\u009agQªú·ÂXÚ#Éd\u008a£\u0001\\*]ü}B\u0015ÄE\u0087Xü:\u0010}lí\u0082\u0092R?W\u001bÅà\u0082;y\u0012H0 îÖ9ÅÉp';ë\\2ô¦8érwsªÈ\u000bä\u0005ì\f\u0091ñÊ1»H©\u009d.\u0094\u0095\u009d\u0085Âh½ç\u001b\u0013n\u000bt\u0018^7þ$\u0095N!Ãºº\u0096\u0083¸ÌK%åPS²ëQND8\u009c»¿âó>PUÆP\u000b\brúÅ\rx29Åu\u000e\u0011µ\u0011\u0016ì¨Ö?E\u0019hÇFàª\u009e·Ô÷ì\u0002ÏãÓn´ûi\u0088§0ý\u008cÙ\u0010\u009f1¹\u0017gLú:½¶ÁÈZÐóû";
      int var13 = "\u0012e¿öÛ\u00833\u0014\u00adô\u0090\u001e°Å\u0013èÓ\u0001ûI²©q\u0015¦hÙ±\u001a\u000eå$Ò\u007fÚ\u008f\u000fñ\u00078\u0018\u008b\u0012'²\u0091ûÉFSáøO!\u009aIé\u0004ÊÓ\u001c\u0082\u0090+\u001d0T9(9\u0012êþc¤¨ü×\u0007\u008b3Ì³:8\u0007\u00195NÃ³\u000fg\bæ\u009a\u009aÍ\u0007Á¸\u0002ì`\n\u00895Tð\u0081\u008b×\u001a*@s\u001e\u0094\u0087R¡\u009a\"`\u001b\fÔ\u0000²ÎèÍ\b,3Ñ8\u0089¸×PwJr\u008eNéñG¤W¨5âs\u0091É\u0095ö\u007fyÝ©\u0094äÆ¶N\u0000K\u00128¥e\u0018 :EÔ0\u0001\u0081\u0096\u0012\u000fì\u0007KÊ,º\u0006¤ähªç_\u0090\u0013\u009agQªú·ÂXÚ#Éd\u008a£\u0001\\*]ü}B\u0015ÄE\u0087Xü:\u0010}lí\u0082\u0092R?W\u001bÅà\u0082;y\u0012H0 îÖ9ÅÉp';ë\\2ô¦8érwsªÈ\u000bä\u0005ì\f\u0091ñÊ1»H©\u009d.\u0094\u0095\u009d\u0085Âh½ç\u001b\u0013n\u000bt\u0018^7þ$\u0095N!Ãºº\u0096\u0083¸ÌK%åPS²ëQND8\u009c»¿âó>PUÆP\u000b\brúÅ\rx29Åu\u000e\u0011µ\u0011\u0016ì¨Ö?E\u0019hÇFàª\u009e·Ô÷ì\u0002ÏãÓn´ûi\u0088§0ý\u008cÙ\u0010\u009f1¹\u0017gLú:½¶ÁÈZÐóû"
         .length();
      char var14 = '(';
      int var18 = -1;

      label27:
      while (true) {
         String var19 = var12.substring(++var18, var18 + var14);
         byte var10001 = -1;

         while (true) {
            byte[] var16 = var8.doFinal(var19.getBytes("ISO-8859-1"));
            String var26 = method_010(var16).intern();
            switch (var10001) {
               case 0:
                  var10[var11++] = var26;
                  if ((var18 += var14) >= var13) {
                     CONST_B_2 = var10;
                     CONST_C_2 = new String[12];
                     CONST_Ñ_2 = ((String)null);
                     CONST_Ð_2 = ((String)null);
                     CONST_Ÿ_2 = rip.breeze.inject.MathUtil3.getDataBuilder_2(new Object[]{Object.class, var2});
                     CONST_Þ_2 = method_005(new Object[]{var6, Object.class});
                     CONST_Ý_2 = method_005(new Object[]{var6, String.class});
                     CONST_Ü_2 = method_005(new Object[]{var6, Void.class});
                     CONST_Û_2 = method_005(new Object[]{var6, Boolean.class});
                     CONST_Ú_2 = method_005(new Object[]{var6, Byte.class});
                     CONST_Ù_2 = method_005(new Object[]{var6, Short.class});
                     CONST_Ø_2 = method_005(new Object[]{var6, Character.class});
                     CONST_Ö_2 = method_005(new Object[]{var6, Integer.class});
                     CONST_Õ_2 = method_005(new Object[]{var6, Long.class});
                     CONST_Ô_2 = method_005(new Object[]{var6, Float.class});
                     CONST_Ó_2 = method_005(new Object[]{var6, Double.class});
                     Class var24 = void.class;
                     CONST_Ò_2 = method_007(new Object[]{var4, var24, new Object[0]});
                     return;
                  }

                  var14 = var12.charAt(var18);
                  break;
               default:
                  var10[var11++] = var26;
                  if ((var18 += var14) < var13) {
                     var14 = var12.charAt(var18);
                     continue label27;
                  }

                  var12 = " \u0003Í\u0016\u0004\u008cZÜ\u0087¿\u00909»2ÍùØÇG¬\u0081\u0092fÿüxq\u000eÁ\u001c\u0088¶\u0007¬ÏÉ\u001coq\u0088à¤Já°\u007f\u0016È(\u0092\u008eðª\u009eoEtÝ\u0007HC¿\u001c]§\nRMö\\\u0018\u008döómí§~?\u0019r}\u001d¦Ê±Yab";
                  var13 = " \u0003Í\u0016\u0004\u008cZÜ\u0087¿\u00909»2ÍùØÇG¬\u0081\u0092fÿüxq\u000eÁ\u001c\u0088¶\u0007¬ÏÉ\u001coq\u0088à¤Já°\u007f\u0016È(\u0092\u008eðª\u009eoEtÝ\u0007HC¿\u001c]§\nRMö\\\u0018\u008döómí§~?\u0019r}\u001d¦Ê±Yab"
                     .length();
                  var14 = '0';
                  var18 = -1;
            }

            var19 = var12.substring(++var18, var18 + var14);
            var10001 = 0;
         }
      }
   }

   private static Throwable invoke_9(Throwable var0) {
      return var0;
   }

   private static String invoke_10(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String invoke_11(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18918;
      if (CONST_C_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/ջ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B_2[var3].getBytes("ISO-8859-1");
         CONST_C_2[var3] = method_010(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }

   private static Object call_12(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = method_011(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite invoke_13(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("method_012".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/ջ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
