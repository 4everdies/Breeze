package rip.breeze.inject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class MathUtil3 {
   public static final int CONST_Ÿ = 0;
   public static final int CONST_Þ = 1;
   public static final int CONST_Ý = 2;
   public static final int CONST_Ü = 3;
   public static final int CONST_Û = 4;
   public static final int CONST_Ú = 5;
   public static final int CONST_Ù = 6;
   public static final int CONST_Ø = 7;
   public static final int CONST_Ö = 8;
   public static final int CONST_Õ = 9;
   public static final int CONST_Ô = 10;
   public static final int CONST_Ó = 11;
   private static final int CONST_Ò = 12;
   private static final String CONST_Ñ;
   public static final MathUtil3 CONST_Ð;
   public static final MathUtil3 CONST_Ï;
   public static final MathUtil3 CONST_Î;
   public static final MathUtil3 CONST_Í;
   public static final MathUtil3 CONST_Ì;
   public static final MathUtil3 CONST_Ë;
   public static final MathUtil3 CONST_Ê;
   public static final MathUtil3 CONST_É;
   public static final MathUtil3 CONST_È;
   private final int int_ç;
   private final String string_æ;
   private final int int_å;
   private final int int_ä;
   private static boolean bool_ã;
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   private MathUtil3(int var1, String var2, int var3, int var4) {
      this.int_ç = var1;
      this.string_æ = var2;
      this.int_å = var3;
      this.int_ä = var4;
   }

   public static MathUtil3 getDataBuilder(String var0) {
      long var1 = 22151434741368L;
      long var3 = var1 ^ 50263115689842L;
      int var10002 = var0.length();
      Object[] var10005 = new Object[]{null, null, null, var3};
      var10005[2] = var10002;
      var10005[1] = 0;
      var10005[0] = var0;
      return getDataBuilder_12(var10005);
   }

   public static MathUtil3 getDataBuilder_2(Object[] param0) {
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
      // 004: checkcast java/lang/Class
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic rip/breeze/inject/MathUtil3.54744772825055L J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 132257803113049
      // 01e: lxor
      // 01f: lstore 4
      // 021: pop2
      // 022: aload 1
      // 023: invokevirtual java/lang/Class.isPrimitive ()Z
      // 026: ifeq 0ef
      // 029: aload 1
      // 02a: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 02d: lload 2
      // 02e: lconst_0
      // 02f: lcmp
      // 030: ifle 049
      // 033: if_acmpne 045
      // 036: goto 03d
      // 039: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03c: athrow
      // 03d: getstatic rip/breeze/inject/MathUtil3.CONST_Ë Lrip/breeze/inject/MathUtil3;
      // 040: areturn
      // 041: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 044: athrow
      // 045: aload 1
      // 046: getstatic java/lang/Void.TYPE Ljava/lang/Class;
      // 049: lload 2
      // 04a: lconst_0
      // 04b: lcmp
      // 04c: ifle 05e
      // 04f: if_acmpne 05a
      // 052: getstatic rip/breeze/inject/MathUtil3.CONST_Ð Lrip/breeze/inject/MathUtil3;
      // 055: areturn
      // 056: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 059: athrow
      // 05a: aload 1
      // 05b: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 05e: lload 2
      // 05f: lconst_0
      // 060: lcmp
      // 061: iflt 073
      // 064: if_acmpne 06f
      // 067: getstatic rip/breeze/inject/MathUtil3.CONST_Ï Lrip/breeze/inject/MathUtil3;
      // 06a: areturn
      // 06b: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06e: athrow
      // 06f: aload 1
      // 070: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 073: lload 2
      // 074: lconst_0
      // 075: lcmp
      // 076: ifle 088
      // 079: if_acmpne 084
      // 07c: getstatic rip/breeze/inject/MathUtil3.CONST_Í Lrip/breeze/inject/MathUtil3;
      // 07f: areturn
      // 080: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 083: athrow
      // 084: aload 1
      // 085: getstatic java/lang/Character.TYPE Ljava/lang/Class;
      // 088: lload 2
      // 089: lconst_0
      // 08a: lcmp
      // 08b: ifle 09d
      // 08e: if_acmpne 099
      // 091: getstatic rip/breeze/inject/MathUtil3.CONST_Î Lrip/breeze/inject/MathUtil3;
      // 094: areturn
      // 095: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 098: athrow
      // 099: aload 1
      // 09a: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 09d: lload 2
      // 09e: lconst_0
      // 09f: lcmp
      // 0a0: iflt 0b2
      // 0a3: if_acmpne 0ae
      // 0a6: getstatic rip/breeze/inject/MathUtil3.CONST_Ì Lrip/breeze/inject/MathUtil3;
      // 0a9: areturn
      // 0aa: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: aload 1
      // 0af: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 0b2: lload 2
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: iflt 0c7
      // 0b8: if_acmpne 0c3
      // 0bb: getstatic rip/breeze/inject/MathUtil3.CONST_È Lrip/breeze/inject/MathUtil3;
      // 0be: areturn
      // 0bf: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: aload 1
      // 0c4: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 0c7: lload 2
      // 0c8: lconst_0
      // 0c9: lcmp
      // 0ca: iflt 0dc
      // 0cd: if_acmpne 0d8
      // 0d0: getstatic rip/breeze/inject/MathUtil3.CONST_Ê Lrip/breeze/inject/MathUtil3;
      // 0d3: areturn
      // 0d4: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d7: athrow
      // 0d8: aload 1
      // 0d9: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 0dc: if_acmpne 0e7
      // 0df: getstatic rip/breeze/inject/MathUtil3.CONST_É Lrip/breeze/inject/MathUtil3;
      // 0e2: areturn
      // 0e3: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e6: athrow
      // 0e7: new java/lang/AssertionError
      // 0ea: dup
      // 0eb: invokespecial java/lang/AssertionError.<init> ()V
      // 0ee: athrow
      // 0ef: aload 1
      // 0f0: lload 4
      // 0f2: bipush 2
      // 0f3: anewarray 4
      // 0f6: dup_x2
      // 0f7: dup_x2
      // 0f8: pop
      // 0f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fc: bipush 1
      // 0fd: swap
      // 0fe: aastore
      // 0ff: dup_x1
      // 100: swap
      // 101: bipush 0
      // 102: swap
      // 103: aastore
      // 104: invokestatic rip/breeze/inject/MathUtil3.buildString_7 ([Ljava/lang/Object;)Ljava/lang/String;
      // 107: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 10a: areturn
      // try (23 -> 33): 34 java/lang/IllegalArgumentException
      // try (26 -> 38): 38 java/lang/IllegalArgumentException
      // try (40 -> 49): 49 java/lang/IllegalArgumentException
      // try (51 -> 60): 60 java/lang/IllegalArgumentException
      // try (62 -> 71): 71 java/lang/IllegalArgumentException
      // try (73 -> 82): 82 java/lang/IllegalArgumentException
      // try (84 -> 93): 93 java/lang/IllegalArgumentException
      // try (95 -> 104): 104 java/lang/IllegalArgumentException
      // try (106 -> 115): 115 java/lang/IllegalArgumentException
      // try (117 -> 122): 122 java/lang/IllegalArgumentException
   }

   public static MathUtil3 getDataBuilder_3(Object[] var0) {
      Constructor var1 = (Constructor)var0[0];
      long var2 = (Long)var0[1];
      var2 = 54744772825055L ^ var2;
      long var4 = var2 ^ 99221241242085L;
      return getDataBuilder(buildString_8(new Object[]{var1, var4}));
   }

   public static MathUtil3 getDataBuilder_4(Object[] var0) {
      Method var1 = (Method)var0[0];
      long var2 = (Long)var0[1];
      var2 = 54744772825055L ^ var2;
      long var4 = var2 ^ 34083077103493L;
      return getDataBuilder(buildString_10(new Object[]{var1, var4}));
   }

   public MathUtil3 getDataBuilder_5(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = 54744772825055L ^ var2;
      long var4 = var2 ^ 908810648257L;
      long var6 = var2 ^ 136990937990572L;
      int var8 = this.calculate_2(new Object[]{var4});
      String var10000 = this.string_æ;
      int var10001 = this.int_å + var8;
      int var10002 = this.int_ä;
      Object[] var10005 = new Object[]{null, null, null, var6};
      var10005[2] = var10002;
      var10005[1] = var10001;
      var10005[0] = var10000;
      return getDataBuilder_12(var10005);
   }

   public static MathUtil3 getDataBuilder_6(String var0) {
      long var1 = 3826665385281L;

      MathUtil3 var10000;
      MathUtil3 var10001;
      byte var10002;
      label17: {
         try {
            var10000 = new MathUtil3();
            var10001 = var10000;
            if (var0.charAt(0) == '[') {
               var10002 = 9;
               break label17;
            }
         } catch (IllegalArgumentException var3) {
            throw getIllegalArgumentException(var3);
         }

         var10002 = 12;
      }

      /* constructor call removed */
      return var10000;
   }

   public static MathUtil3 getDataBuilder_7(Object[] var0) {
      String var1 = (String)var0[0];
      return new MathUtil3(11, var1, 0, var1.length());
   }

   public static MathUtil3 getDataBuilder_8(Object... var0) {
      long var1 = (Long)var0[0];
      MathUtil3 var3 = (MathUtil3)var0[1];
      MathUtil3[] var4 = (MathUtil3[])var0[2];
      var1 = 54744772825055L ^ var1;
      long var5 = var1 ^ 57060122818847L;
      return getDataBuilder(buildString_9(var5, var3, var4));
   }

   public MathUtil3[] invoke_9(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = 54744772825055L ^ var2;
      long var4 = var2 ^ 101851819792961L;
      long var6 = var2 ^ 90536550975424L;
      return clamp(new Object[]{var6, this.buildString_5(new Object[]{var4})});
   }

   public static MathUtil3[] clamp(Object[] param0) {
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
      // 00e: checkcast java/lang/String
      // 011: astore 3
      // 012: pop
      // 013: getstatic rip/breeze/inject/MathUtil3.54744772825055L J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 82610356487270
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 73722309720543
      // 025: lxor
      // 026: lstore 6
      // 028: pop2
      // 029: aload 3
      // 02a: lload 4
      // 02c: bipush 2
      // 02d: anewarray 4
      // 030: dup_x2
      // 031: dup_x2
      // 032: pop
      // 033: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 036: bipush 1
      // 037: swap
      // 038: aastore
      // 039: dup_x1
      // 03a: swap
      // 03b: bipush 0
      // 03c: swap
      // 03d: aastore
      // 03e: invokestatic rip/breeze/inject/MathUtil3.clamp_3 ([Ljava/lang/Object;)I
      // 041: istore 8
      // 043: iload 8
      // 045: anewarray 2
      // 048: astore 9
      // 04a: bipush 1
      // 04b: istore 10
      // 04d: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 050: bipush 0
      // 051: istore 11
      // 053: istore 12
      // 055: aload 3
      // 056: iload 10
      // 058: invokevirtual java/lang/String.charAt (I)C
      // 05b: bipush 41
      // 05d: if_icmpeq 104
      // 060: iload 10
      // 062: istore 13
      // 064: aload 3
      // 065: iload 10
      // 067: invokevirtual java/lang/String.charAt (I)C
      // 06a: bipush 91
      // 06c: if_icmpne 08f
      // 06f: iinc 10 1
      // 072: iload 12
      // 074: lload 1
      // 075: lconst_0
      // 076: lcmp
      // 077: iflt 101
      // 07a: ifne 0ff
      // 07d: iload 12
      // 07f: ifeq 064
      // 082: lload 1
      // 083: lconst_0
      // 084: lcmp
      // 085: ifle 072
      // 088: goto 08f
      // 08b: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08e: athrow
      // 08f: aload 3
      // 090: iload 10
      // 092: iinc 10 1
      // 095: invokevirtual java/lang/String.charAt (I)C
      // 098: iload 12
      // 09a: lload 1
      // 09b: lconst_0
      // 09c: lcmp
      // 09d: ifle 0a5
      // 0a0: ifne 0be
      // 0a3: bipush 76
      // 0a5: if_icmpne 0cb
      // 0a8: goto 0af
      // 0ab: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ae: athrow
      // 0af: aload 3
      // 0b0: bipush 59
      // 0b2: iload 10
      // 0b4: invokevirtual java/lang/String.indexOf (II)I
      // 0b7: goto 0be
      // 0ba: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bd: athrow
      // 0be: istore 14
      // 0c0: iload 10
      // 0c2: iload 14
      // 0c4: bipush 1
      // 0c5: iadd
      // 0c6: invokestatic java/lang/Math.max (II)I
      // 0c9: istore 10
      // 0cb: aload 9
      // 0cd: iload 11
      // 0cf: iinc 11 1
      // 0d2: aload 3
      // 0d3: iload 13
      // 0d5: iload 10
      // 0d7: lload 6
      // 0d9: bipush 4
      // 0da: anewarray 4
      // 0dd: dup_x2
      // 0de: dup_x2
      // 0df: pop
      // 0e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e3: bipush 3
      // 0e4: swap
      // 0e5: aastore
      // 0e6: dup_x1
      // 0e7: swap
      // 0e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0eb: bipush 2
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f3: bipush 1
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: bipush 0
      // 0f9: swap
      // 0fa: aastore
      // 0fb: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_12 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 0fe: aastore
      // 0ff: iload 12
      // 101: ifeq 055
      // 104: aload 9
      // 106: areturn
      // try (66 -> 75): 80 java/lang/IllegalArgumentException
      // try (82 -> 94): 95 java/lang/IllegalArgumentException
      // try (92 -> 101): 102 java/lang/IllegalArgumentException
   }

   public static MathUtil3[] invoke_11(Object[] var0) {
      long var1 = (Long)var0[0];
      Method var3 = (Method)var0[1];
      var1 = 54744772825055L ^ var1;
      long var4 = var1 ^ 43244218170812L;
      Class[] var6 = var3.getParameterTypes();
      int var10000 = Util140.getValue_2();
      MathUtil3[] var7 = new MathUtil3[var6.length];
      int var8 = var6.length - 1;
      int var9 = var10000;

      label33:
      while (var8 >= 0) {
         do {
            try {
               int var10001 = var9;
               if (var1 >= 0L) {
                  if (var9 == 0) {
                     return var7;
                  }

                  var10001 = var8;
               }

               var7[var10001] = getDataBuilder_2(new Object[]{var6[var8], var4});
               var8--;
               if (var9 != 0) {
                  continue label33;
               }
            } catch (IllegalArgumentException var10) {
               throw getIllegalArgumentException(var10);
            }
         } while (var1 < 0L);

         return var7;
      }

      return var7;
   }

   public MathUtil3 getDataBuilder_9(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = 54744772825055L ^ var2;
      long var4 = var2 ^ 58368618429431L;
      long var6 = var2 ^ 60403374551402L;
      return getDataBuilder_10(new Object[]{this.buildString_5(new Object[]{var4}), var6});
   }

   public static MathUtil3 getDataBuilder_10(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = 54744772825055L ^ var2;
      long var4 = var2 ^ 4679372475577L;
      long var6 = var2 ^ 85764155354819L;
      int var10001 = clamp_2(new Object[]{var1, var4});
      int var10002 = var1.length();
      Object[] var10005 = new Object[]{null, null, null, var6};
      var10005[2] = var10002;
      var10005[1] = var10001;
      var10005[0] = var1;
      return getDataBuilder_12(var10005);
   }

   public static MathUtil3 getDataBuilder_11(Object[] var0) {
      long var1 = (Long)var0[0];
      Method var3 = (Method)var0[1];
      var1 = 54744772825055L ^ var1;
      long var4 = var1 ^ 65991084975391L;
      return getDataBuilder_2(new Object[]{var3.getReturnType(), var4});
   }

   static int clamp_2(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = 54744772825055L ^ var2;
      int var10000 = Util140.getValue();
      int var4 = 1;
      int var5 = var10000;

      label67:
      while (true) {
         var10000 = var1.charAt(var4);

         do {
            int var10001 = 41;

            label62: {
               while (true) {
                  if (var10000 == var10001) {
                     break label62;
                  }

                  do {
                     char var13 = var1.charAt(var4);
                     byte var11 = 91;
                     if (var5 != 0) {
                        return var13 + 91;
                     }

                     try {
                        if (var13 != var11) {
                           break;
                        }

                        var4++;
                        if (var5 != 0) {
                           continue label67;
                        }
                     } catch (IllegalArgumentException var7) {
                        throw getIllegalArgumentException(var7);
                     }
                  } while (var2 > 0L && var5 == 0);

                  try {
                     var10000 = var1.charAt(var4++);
                     var10001 = var5;
                     if (var2 <= 0L) {
                        continue;
                     }

                     if (var2 > 0L) {
                        if (var5 != 0) {
                           break;
                        }

                        var10001 = 76;
                     }

                     if (var10000 != var10001) {
                        continue label67;
                     }
                  } catch (IllegalArgumentException var8) {
                     throw getIllegalArgumentException(var8);
                  }

                  var10000 = var1.indexOf(59, var4);
                  break;
               }

               int var6 = var10000;
               var4 = Math.max(var4, var6 + 1);
               if (var5 == 0) {
                  continue label67;
               }
            }

            var10000 = var4;
         } while (var2 < 0L);

         return var4 + 1;
      }
   }

   private static MathUtil3 getDataBuilder_12(Object[] var0) {
      String var1 = (String)var0[0];
      int var2 = (Integer)var0[1];
      int var3 = (Integer)var0[2];
      long var4 = (Long)var0[3];
      var4 = 54744772825055L ^ var4;
      long var6 = var4 ^ 3426096939572L;

      try {
         switch (var1.charAt(var2)) {
            case '(':
               return new MathUtil3(11, var1, var2, var3);
            case 'B':
               return CONST_Í;
            case 'C':
               return CONST_Î;
            case 'D':
               return CONST_È;
            case 'F':
               return CONST_Ê;
            case 'I':
               return CONST_Ë;
            case 'J':
               return CONST_É;
            case 'L':
               return new MathUtil3(10, var1, var2 + 1, var3 - 1);
            case 'S':
               return CONST_Ì;
            case 'V':
               return CONST_Ð;
            case 'Z':
               return CONST_Ï;
            case '[':
               return new MathUtil3(9, var1, var2, var3);
         }
      } catch (IllegalArgumentException var8) {
         throw getIllegalArgumentException(var8);
      }

      throw new IllegalArgumentException(buildString(new Object[]{var1, var6}));
   }

   private static String buildString(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = 54744772825055L ^ var2;
      return buildString_12(13200, 7881902737931356836L ^ var2) + var1;
   }

   public String buildString_2(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = 54744772825055L ^ var2;
      long var4 = var2 ^ 1915594286475L;
      long var6 = var2 ^ 53497470390421L;
      long var8 = var2 ^ 54744772825055L;
      int var10 = Util140.getValue_2();

      try {
         switch (this.int_ç) {
            case 0:
               return buildString_12(12170, 4659842664355188330L ^ var2);
            case 1:
               return buildString_12(22057, 6289415858191284160L ^ var2);
            case 2:
               return buildString_12(10389, 1009078417522870640L ^ var2);
            case 3:
               return buildString_12(27657, 8129056037666885096L ^ var2);
            case 4:
               return buildString_12(20279, 8598967639233703636L ^ var2);
            case 5:
               return buildString_12(30137, 2360170462807594068L ^ var2);
            case 6:
               return buildString_12(24430, 5760829651684769413L ^ var2);
            case 7:
               return buildString_12(32595, 7204451322051665585L ^ var2);
            case 8:
               return buildString_12(22088, 3024867607785682863L ^ var2);
            case 9:
               break;
            case 10:
            case 12:
               return this.string_æ.substring(this.int_å, this.int_ä).replace('/', '.');
            case 11:
            default:
               throw new AssertionError();
         }
      } catch (IllegalArgumentException var14) {
         throw getIllegalArgumentException(var14);
      }

      StringBuilder var11 = new StringBuilder(this.getDataBuilder_5(new Object[]{var6}).buildString_2(new Object[]{var8}));
      int var12 = this.calculate_2(new Object[]{var4});

      label48:
      while (var12 > 0) {
         do {
            try {
               if (var2 > 0L) {
                  StringBuilder var10000 = var11.append(buildString_12(11218, 6284823678682352189L ^ var2));
                  if (var10 == 0) {
                     return var10000.toString();
                  }

                  var12--;
               }

               if (var10 != 0) {
                  continue label48;
               }
            } catch (IllegalArgumentException var13) {
               throw getIllegalArgumentException(var13);
            }
         } while (var2 < 0L);

         return var11.toString();
      }

      return var11.toString();
   }

   public String buildString_3(Object[] var1) {
      return this.string_æ.substring(this.int_å, this.int_ä);
   }

   public static String buildString_4(Object[] var0) {
      Class var1 = (Class)var0[0];
      return var1.getName().replace('.', '/');
   }

   public String buildString_5(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = 54744772825055L ^ var2;

      try {
         if (this.int_ç == 10) {
            return this.string_æ.substring(this.int_å - 1, this.int_ä + 1);
         }
      } catch (IllegalArgumentException var4) {
         throw getIllegalArgumentException(var4);
      }

      try {
         if (var2 <= 0L) {
            return this.string_æ.substring(this.int_å, this.int_ä);
         }

         if (this.int_ç == 12) {
            return buildString_6(new Object[]{this.string_æ.substring(this.int_å, this.int_ä)});
         }
      } catch (IllegalArgumentException var5) {
         throw getIllegalArgumentException(var5);
      }

      return this.string_æ.substring(this.int_å, this.int_ä);
   }

   private static String buildString_6(Object[] var0) {
      String var1 = (String)var0[0];
      return "L" + var1 + ";";
   }

   public static String buildString_7(Object[] var0) {
      Class var1 = (Class)var0[0];
      long var2 = (Long)var0[1];
      var2 = 54744772825055L ^ var2;
      long var4 = var2 ^ 93988098996137L;
      StringBuilder var6 = new StringBuilder();
      processAll(new Object[]{var4, var1, var6});
      return var6.toString();
   }

   public static String buildString_8(Object[] var0) {
      Constructor var1 = (Constructor)var0[0];
      long var2 = (Long)var0[1];
      var2 = 54744772825055L ^ var2;
      long var4 = var2 ^ 85455365995988L;
      StringBuilder var6 = new StringBuilder();
      var6.append('(');
      Class[] var7 = var1.getParameterTypes();

      for (Class var11 : var7) {
         processAll(new Object[]{var4, var11, var6});
         if (var2 <= 0L) {
            break;
         }
      }

      return var6.append(buildString_12(5897, 900511090957320740L ^ var2)).toString();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static String buildString_9(Object... var0) {
      long var1 = (Long)var0[0];
      MathUtil3 var3 = (MathUtil3)var0[1];
      MathUtil3[] var4 = (MathUtil3[])var0[2];
      var1 = 54744772825055L ^ var1;
      long var5 = var1 ^ 121139010726785L;
      int var10000 = Util140.getValue_2();
      StringBuilder var7 = new StringBuilder();
      int var8 = var10000;
      var7.append('(');
      MathUtil3[] var9 = var4;
      int var10 = var9.length;
      int var11 = 0;

      label38:
      while (var11 < var10) {
         MathUtil3 var12 = var9[var11];

         try {
            var12.calculate(new Object[]{var7, var5});
            var11++;
         } catch (IllegalArgumentException var13) {
            throw getIllegalArgumentException(var13);
         }

         do {
            try {
               var10000 = var8;
               if (var1 > 0L) {
                  if (var8 == 0) {
                     return var7.toString();
                  }

                  var10000 = var8;
               }

               if (var10000 != 0) {
                  continue label38;
               }
            } catch (IllegalArgumentException var14) {
               throw getIllegalArgumentException(var14);
            }
         } while (var1 < 0L);
         break;
      }

      var7.append(')');
      var3.calculate(new Object[]{var7, var5});
      return var7.toString();
   }

   public static String buildString_10(Object[] var0) {
      Method var1 = (Method)var0[0];
      long var2 = (Long)var0[1];
      var2 = 54744772825055L ^ var2;
      long var4 = var2 ^ 22569769801049L;
      StringBuilder var6 = new StringBuilder();
      var6.append('(');
      Class[] var7 = var1.getParameterTypes();
      Class[] var8 = var7;
      int var9 = var8.length;
      int var10 = 0;

      while (true) {
         if (var10 < var9) {
            Class var11 = var8[var10];
            processAll(new Object[]{var4, var11, var6});
            var10++;
            if (var2 <= 0L) {
               break;
            }

            if (var2 > 0L) {
               continue;
            }
         }

         var6.append(')');
         processAll(new Object[]{var4, var1.getReturnType(), var6});
         break;
      }

      return var6.toString();
   }

   private void calculate(Object[] param1) {
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
      // 04: checkcast java/lang/StringBuilder
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic rip/breeze/inject/MathUtil3.54744772825055L J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 1c: istore 5
      // 1e: aload 0
      // 1f: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 22: bipush 10
      // 24: iload 5
      // 26: ifeq 61
      // 29: if_icmpne 54
      // 2c: goto 33
      // 2f: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32: athrow
      // 33: aload 2
      // 34: aload 0
      // 35: getfield rip/breeze/inject/MathUtil3.string_æ Ljava/lang/String;
      // 38: aload 0
      // 39: getfield rip/breeze/inject/MathUtil3.int_å I
      // 3c: bipush 1
      // 3d: isub
      // 3e: aload 0
      // 3f: getfield rip/breeze/inject/MathUtil3.int_ä I
      // 42: bipush 1
      // 43: iadd
      // 44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
      // 47: pop
      // 48: iload 5
      // 4a: ifne a3
      // 4d: goto 54
      // 50: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 53: athrow
      // 54: aload 0
      // 55: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 58: bipush 12
      // 5a: goto 61
      // 5d: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 60: athrow
      // 61: if_icmpne 8b
      // 64: aload 2
      // 65: bipush 76
      // 67: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 6a: aload 0
      // 6b: getfield rip/breeze/inject/MathUtil3.string_æ Ljava/lang/String;
      // 6e: aload 0
      // 6f: getfield rip/breeze/inject/MathUtil3.int_å I
      // 72: aload 0
      // 73: getfield rip/breeze/inject/MathUtil3.int_ä I
      // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
      // 79: bipush 59
      // 7b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 7e: pop
      // 7f: iload 5
      // 81: ifne a3
      // 84: goto 8b
      // 87: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8a: athrow
      // 8b: aload 2
      // 8c: aload 0
      // 8d: getfield rip/breeze/inject/MathUtil3.string_æ Ljava/lang/String;
      // 90: aload 0
      // 91: getfield rip/breeze/inject/MathUtil3.int_å I
      // 94: aload 0
      // 95: getfield rip/breeze/inject/MathUtil3.int_ä I
      // 98: invokevirtual java/lang/StringBuilder.append (Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
      // 9b: pop
      // 9c: goto a3
      // 9f: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a2: athrow
      // a3: return
      // try (19 -> 25): 26 java/lang/IllegalArgumentException
      // try (24 -> 43): 44 java/lang/IllegalArgumentException
      // try (28 -> 49): 50 java/lang/IllegalArgumentException
      // try (52 -> 68): 69 java/lang/IllegalArgumentException
      // try (53 -> 80): 81 java/lang/IllegalArgumentException
   }

   private static void processAll(Object[] var0) {
      long var1 = (Long)var0[0];
      Class var3 = (Class)var0[1];
      StringBuilder var4 = (StringBuilder)var0[2];
      var1 = 54744772825055L ^ var1;
      Class var5 = var3;

      while (var5.isArray()) {
         var4.append('[');
         var5 = var5.getComponentType();
         if (var1 < 0L || var1 < 0L) {
            break;
         }
      }

      label111: {
         char var6;
         label126: {
            Class var10000;
            Class var10001;
            label109: {
               label108: {
                  try {
                     var10000 = var5;
                     if (var1 > 0L) {
                        if (!var5.isPrimitive()) {
                           break label111;
                        }

                        var10000 = var5;
                     }

                     var10001 = int.class;
                     if (var1 <= 0L) {
                        break label109;
                     }

                     if (var10000 != int.class) {
                        break label108;
                     }
                  } catch (IllegalArgumentException var7) {
                     throw getIllegalArgumentException(var7);
                  }

                  var6 = 'I';
                  if (var1 >= 0L) {
                     break label126;
                  }
               }

               var10000 = var5;
               var10001 = void.class;
            }

            if (var1 >= 0L) {
               if (var10000 == var10001) {
                  var6 = 'V';
                  if (var1 >= 0L) {
                     break label126;
                  }
               }

               var10000 = var5;
               var10001 = boolean.class;
            }

            if (var1 > 0L) {
               if (var10000 == var10001) {
                  var6 = 'Z';
                  if (var1 > 0L) {
                     break label126;
                  }
               }

               var10000 = var5;
               var10001 = byte.class;
            }

            if (var1 >= 0L) {
               if (var10000 == var10001) {
                  var6 = 'B';
                  if (var1 >= 0L) {
                     break label126;
                  }
               }

               var10000 = var5;
               var10001 = char.class;
            }

            if (var1 >= 0L) {
               if (var10000 == var10001) {
                  var6 = 'C';
                  if (var1 >= 0L) {
                     break label126;
                  }
               }

               var10000 = var5;
               var10001 = short.class;
            }

            if (var1 > 0L) {
               if (var10000 == var10001) {
                  var6 = 'S';
                  if (var1 > 0L) {
                     break label126;
                  }
               }

               var10000 = var5;
               var10001 = double.class;
            }

            if (var1 > 0L) {
               if (var10000 == var10001) {
                  var6 = 'D';
                  if (var1 >= 0L) {
                     break label126;
                  }
               }

               var10000 = var5;
               var10001 = float.class;
            }

            if (var1 >= 0L) {
               if (var10000 == var10001) {
                  var6 = 'F';
                  if (var1 >= 0L) {
                     break label126;
                  }
               }

               var10000 = var5;
               var10001 = long.class;
            }

            if (var10000 != var10001) {
               throw new AssertionError();
            }

            var6 = 'J';
            if (var1 < 0L) {
               throw new AssertionError();
            }
         }

         var4.append(var6);
         if (var1 > 0L) {
            return;
         }
      }

      var4.append('L').append(buildString_4(new Object[]{var5})).append(';');
   }

   public int getValue(Object[] param1) {
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
      // 0c: getstatic rip/breeze/inject/MathUtil3.54744772825055L J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 15: istore 4
      // 17: aload 0
      // 18: iload 4
      // 1a: ifne 36
      // 1d: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 20: bipush 12
      // 22: if_icmpne 35
      // 25: goto 2c
      // 28: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b: athrow
      // 2c: bipush 10
      // 2e: goto 39
      // 31: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: aload 0
      // 36: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 39: ireturn
      // try (14 -> 20): 21 java/lang/IllegalArgumentException
      // try (17 -> 25): 25 java/lang/IllegalArgumentException
   }

   public int calculate_2(Object[] param1) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic rip/breeze/inject/MathUtil3.54744772825055L J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 15: bipush 1
      // 16: istore 4
      // 18: istore 5
      // 1a: aload 0
      // 1b: getfield rip/breeze/inject/MathUtil3.string_æ Ljava/lang/String;
      // 1e: aload 0
      // 1f: getfield rip/breeze/inject/MathUtil3.int_å I
      // 22: iload 4
      // 24: iadd
      // 25: invokevirtual java/lang/String.charAt (I)C
      // 28: bipush 91
      // 2a: if_icmpne 35
      // 2d: iinc 4 1
      // 30: iload 5
      // 32: ifeq 1a
      // 35: iload 4
      // 37: lload 2
      // 38: lconst_0
      // 39: lcmp
      // 3a: iflt 32
      // 3d: ireturn
   }

   public int getValue_2(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = 54744772825055L ^ var2;
      int var4 = Util140.getValue();

      try {
         if (var4 != 0) {
            return this.int_ç;
         }

         switch (this.int_ç) {
            case 0:
               return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 12:
               return 1;
            case 7:
            case 8:
               return 2;
            case 11:
            default:
               throw new AssertionError();
         }
      } catch (IllegalArgumentException var5) {
         throw getIllegalArgumentException(var5);
      }
   }

   public int getValue_3(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = 54744772825055L ^ var2;
      long var4 = var2 ^ 92321077945778L;
      long var6 = var2 ^ 43889200903050L;
      return clamp_3(new Object[]{this.buildString_5(new Object[]{var4}), var6});
   }

   public static int clamp_3(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic rip/breeze/inject/MathUtil3.54744772825055L J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: bipush 0
      // 1a: istore 4
      // 1c: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 1f: bipush 1
      // 20: istore 5
      // 22: istore 6
      // 24: aload 1
      // 25: iload 5
      // 27: invokevirtual java/lang/String.charAt (I)C
      // 2a: bipush 41
      // 2c: if_icmpeq b0
      // 2f: aload 1
      // 30: iload 5
      // 32: invokevirtual java/lang/String.charAt (I)C
      // 35: iload 6
      // 37: ifeq b8
      // 3a: bipush 91
      // 3c: lload 2
      // 3d: lconst_0
      // 3e: lcmp
      // 3f: iflt 77
      // 42: if_icmpne 6c
      // 45: iinc 5 1
      // 48: iload 6
      // 4a: lload 2
      // 4b: lconst_0
      // 4c: lcmp
      // 4d: iflt ad
      // 50: ifeq ab
      // 53: goto 5a
      // 56: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 59: athrow
      // 5a: iload 6
      // 5c: ifne 2f
      // 5f: lload 2
      // 60: lconst_0
      // 61: lcmp
      // 62: ifle 6c
      // 65: goto 6c
      // 68: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6b: athrow
      // 6c: aload 1
      // 6d: iload 5
      // 6f: iinc 5 1
      // 72: invokevirtual java/lang/String.charAt (I)C
      // 75: iload 6
      // 77: lload 2
      // 78: lconst_0
      // 79: lcmp
      // 7a: iflt 82
      // 7d: ifeq 9b
      // 80: bipush 76
      // 82: if_icmpne a8
      // 85: goto 8c
      // 88: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8b: athrow
      // 8c: aload 1
      // 8d: bipush 59
      // 8f: iload 5
      // 91: invokevirtual java/lang/String.indexOf (II)I
      // 94: goto 9b
      // 97: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9a: athrow
      // 9b: istore 7
      // 9d: iload 5
      // 9f: iload 7
      // a1: bipush 1
      // a2: iadd
      // a3: invokestatic java/lang/Math.max (II)I
      // a6: istore 5
      // a8: iinc 4 1
      // ab: iload 6
      // ad: ifne 24
      // b0: lload 2
      // b1: lconst_0
      // b2: lcmp
      // b3: ifle 6c
      // b6: iload 4
      // b8: ireturn
      // try (33 -> 46): 47 java/lang/IllegalArgumentException
      // try (39 -> 51): 56 java/lang/IllegalArgumentException
      // try (58 -> 70): 71 java/lang/IllegalArgumentException
      // try (68 -> 77): 78 java/lang/IllegalArgumentException
   }

   public int getValue_4(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = 54744772825055L ^ var2;
      long var4 = var2 ^ 112030175252013L;
      long var6 = var2 ^ 47934606200507L;
      return clamp_4(new Object[]{var6, this.buildString_5(new Object[]{var4})});
   }

   public static int clamp_4(Object[] param0) {
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
      // 00e: checkcast java/lang/String
      // 011: astore 3
      // 012: pop
      // 013: getstatic rip/breeze/inject/MathUtil3.54744772825055L J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: bipush 1
      // 01a: istore 4
      // 01c: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 01f: bipush 1
      // 020: istore 5
      // 022: aload 3
      // 023: iload 5
      // 025: invokevirtual java/lang/String.charAt (I)C
      // 028: istore 6
      // 02a: istore 7
      // 02c: iload 6
      // 02e: bipush 41
      // 030: if_icmpeq 11b
      // 033: iload 6
      // 035: bipush 74
      // 037: iload 7
      // 039: lload 1
      // 03a: lconst_0
      // 03b: lcmp
      // 03c: iflt 137
      // 03f: ifne 12f
      // 042: iload 7
      // 044: lload 1
      // 045: lconst_0
      // 046: lcmp
      // 047: ifle 071
      // 04a: ifne 069
      // 04d: goto 054
      // 050: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 053: athrow
      // 054: if_icmpeq 07e
      // 057: goto 05e
      // 05a: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05d: athrow
      // 05e: iload 6
      // 060: bipush 68
      // 062: goto 069
      // 065: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 068: athrow
      // 069: lload 1
      // 06a: lconst_0
      // 06b: lcmp
      // 06c: iflt 0a5
      // 06f: iload 7
      // 071: ifne 0a5
      // 074: if_icmpne 096
      // 077: goto 07e
      // 07a: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07d: athrow
      // 07e: iinc 5 1
      // 081: iinc 4 2
      // 084: iload 7
      // 086: lload 1
      // 087: lconst_0
      // 088: lcmp
      // 089: ifle 118
      // 08c: ifeq 10e
      // 08f: goto 096
      // 092: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 095: athrow
      // 096: aload 3
      // 097: iload 5
      // 099: invokevirtual java/lang/String.charAt (I)C
      // 09c: bipush 91
      // 09e: goto 0a5
      // 0a1: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a4: athrow
      // 0a5: lload 1
      // 0a6: lconst_0
      // 0a7: lcmp
      // 0a8: ifle 0da
      // 0ab: if_icmpne 0cf
      // 0ae: iinc 5 1
      // 0b1: iload 7
      // 0b3: ifne 10b
      // 0b6: goto 0bd
      // 0b9: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bc: athrow
      // 0bd: iload 7
      // 0bf: ifeq 096
      // 0c2: lload 1
      // 0c3: lconst_0
      // 0c4: lcmp
      // 0c5: ifle 0cf
      // 0c8: goto 0cf
      // 0cb: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ce: athrow
      // 0cf: aload 3
      // 0d0: iload 5
      // 0d2: iinc 5 1
      // 0d5: invokevirtual java/lang/String.charAt (I)C
      // 0d8: iload 7
      // 0da: lload 1
      // 0db: lconst_0
      // 0dc: lcmp
      // 0dd: iflt 0e5
      // 0e0: ifne 0fe
      // 0e3: bipush 76
      // 0e5: if_icmpne 10b
      // 0e8: goto 0ef
      // 0eb: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ee: athrow
      // 0ef: aload 3
      // 0f0: bipush 59
      // 0f2: iload 5
      // 0f4: invokevirtual java/lang/String.indexOf (II)I
      // 0f7: goto 0fe
      // 0fa: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fd: athrow
      // 0fe: istore 8
      // 100: iload 5
      // 102: iload 8
      // 104: bipush 1
      // 105: iadd
      // 106: invokestatic java/lang/Math.max (II)I
      // 109: istore 5
      // 10b: iinc 4 1
      // 10e: aload 3
      // 10f: iload 5
      // 111: invokevirtual java/lang/String.charAt (I)C
      // 114: istore 6
      // 116: iload 7
      // 118: ifeq 02c
      // 11b: aload 3
      // 11c: iload 5
      // 11e: bipush 1
      // 11f: iadd
      // 120: invokevirtual java/lang/String.charAt (I)C
      // 123: istore 6
      // 125: iload 6
      // 127: lload 1
      // 128: lconst_0
      // 129: lcmp
      // 12a: iflt 035
      // 12d: bipush 86
      // 12f: lload 1
      // 130: lconst_0
      // 131: lcmp
      // 132: ifle 163
      // 135: iload 7
      // 137: ifne 163
      // 13a: if_icmpne 14d
      // 13d: goto 144
      // 140: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 143: athrow
      // 144: iload 4
      // 146: bipush 2
      // 147: ishl
      // 148: ireturn
      // 149: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14c: athrow
      // 14d: iload 6
      // 14f: iload 7
      // 151: lload 1
      // 152: lconst_0
      // 153: lcmp
      // 154: iflt 15c
      // 157: ifne 18e
      // 15a: bipush 74
      // 15c: goto 163
      // 15f: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 162: athrow
      // 163: lload 1
      // 164: lconst_0
      // 165: lcmp
      // 166: ifle 170
      // 169: if_icmpeq 186
      // 16c: iload 6
      // 16e: iload 7
      // 170: ifne 18e
      // 173: goto 17a
      // 176: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 179: athrow
      // 17a: bipush 68
      // 17c: if_icmpne 191
      // 17f: goto 186
      // 182: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 185: athrow
      // 186: bipush 2
      // 187: goto 18e
      // 18a: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18d: athrow
      // 18e: goto 192
      // 191: bipush 1
      // 192: istore 8
      // 194: iload 4
      // 196: bipush 2
      // 197: ishl
      // 198: iload 8
      // 19a: ior
      // 19b: ireturn
      // try (30 -> 44): 45 java/lang/IllegalArgumentException
      // try (38 -> 48): 49 java/lang/IllegalArgumentException
      // try (47 -> 53): 54 java/lang/IllegalArgumentException
      // try (56 -> 63): 64 java/lang/IllegalArgumentException
      // try (62 -> 74): 75 java/lang/IllegalArgumentException
      // try (66 -> 81): 82 java/lang/IllegalArgumentException
      // try (84 -> 92): 93 java/lang/IllegalArgumentException
      // try (89 -> 97): 102 java/lang/IllegalArgumentException
      // try (104 -> 116): 117 java/lang/IllegalArgumentException
      // try (114 -> 123): 124 java/lang/IllegalArgumentException
      // try (152 -> 159): 160 java/lang/IllegalArgumentException
      // try (158 -> 166): 166 java/lang/IllegalArgumentException
      // try (168 -> 176): 177 java/lang/IllegalArgumentException
      // try (179 -> 187): 188 java/lang/IllegalArgumentException
      // try (184 -> 192): 193 java/lang/IllegalArgumentException
      // try (190 -> 196): 197 java/lang/IllegalArgumentException
   }

   public int calculate_3(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: pop
      // 016: getstatic rip/breeze/inject/MathUtil3.54744772825055L J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 01f: istore 5
      // 021: iload 2
      // 022: iload 5
      // 024: ifeq 05d
      // 027: bipush 46
      // 029: if_icmpeq 052
      // 02c: goto 033
      // 02f: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 032: athrow
      // 033: iload 2
      // 034: iload 5
      // 036: lload 3
      // 037: lconst_0
      // 038: lcmp
      // 039: iflt 0e5
      // 03c: ifeq 0e3
      // 03f: goto 046
      // 042: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 045: athrow
      // 046: bipush 79
      // 048: if_icmpne 0df
      // 04b: goto 052
      // 04e: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 051: athrow
      // 052: aload 0
      // 053: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 056: goto 05d
      // 059: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05c: athrow
      // 05d: iload 5
      // 05f: ifeq 0b2
      // 062: tableswitch 117 0 12 109 70 81 70 86 91 93 97 101 105 105 109 105
      // 0a4: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a7: athrow
      // 0a8: iload 2
      // 0a9: bipush 5
      // 0aa: iadd
      // 0ab: goto 0b2
      // 0ae: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b1: athrow
      // 0b2: ireturn
      // 0b3: iload 2
      // 0b4: bipush 6
      // 0b6: iadd
      // 0b7: ireturn
      // 0b8: iload 2
      // 0b9: bipush 7
      // 0bb: iadd
      // 0bc: ireturn
      // 0bd: iload 2
      // 0be: ireturn
      // 0bf: iload 2
      // 0c0: bipush 2
      // 0c1: iadd
      // 0c2: ireturn
      // 0c3: iload 2
      // 0c4: bipush 1
      // 0c5: iadd
      // 0c6: ireturn
      // 0c7: iload 2
      // 0c8: bipush 3
      // 0c9: iadd
      // 0ca: ireturn
      // 0cb: iload 2
      // 0cc: bipush 4
      // 0cd: iadd
      // 0ce: ireturn
      // 0cf: new java/lang/UnsupportedOperationException
      // 0d2: dup
      // 0d3: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 0d6: athrow
      // 0d7: new java/lang/AssertionError
      // 0da: dup
      // 0db: invokespecial java/lang/AssertionError.<init> ()V
      // 0de: athrow
      // 0df: aload 0
      // 0e0: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 0e3: iload 5
      // 0e5: lload 3
      // 0e6: lconst_0
      // 0e7: lcmp
      // 0e8: iflt 137
      // 0eb: ifeq 135
      // 0ee: tableswitch 224 0 12 70 111 111 111 111 111 113 117 121 125 125 216 125
      // 130: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 133: athrow
      // 134: iload 2
      // 135: iload 5
      // 137: lload 3
      // 138: lconst_0
      // 139: lcmp
      // 13a: iflt 143
      // 13d: ifeq 15c
      // 140: sipush 172
      // 143: if_icmpeq 159
      // 146: goto 14d
      // 149: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14c: athrow
      // 14d: new java/lang/UnsupportedOperationException
      // 150: dup
      // 151: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 154: athrow
      // 155: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 158: athrow
      // 159: sipush 177
      // 15c: ireturn
      // 15d: iload 2
      // 15e: ireturn
      // 15f: iload 2
      // 160: bipush 2
      // 161: iadd
      // 162: ireturn
      // 163: iload 2
      // 164: bipush 1
      // 165: iadd
      // 166: ireturn
      // 167: iload 2
      // 168: bipush 3
      // 169: iadd
      // 16a: ireturn
      // 16b: iload 2
      // 16c: bipush 21
      // 16e: iload 5
      // 170: ifeq 1c4
      // 173: if_icmpeq 1c2
      // 176: goto 17d
      // 179: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17c: athrow
      // 17d: iload 2
      // 17e: bipush 54
      // 180: iload 5
      // 182: ifeq 1c4
      // 185: goto 18c
      // 188: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18b: athrow
      // 18c: if_icmpeq 1c2
      // 18f: goto 196
      // 192: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 195: athrow
      // 196: iload 2
      // 197: lload 3
      // 198: lconst_0
      // 199: lcmp
      // 19a: iflt 1c5
      // 19d: sipush 172
      // 1a0: iload 5
      // 1a2: ifeq 1c4
      // 1a5: goto 1ac
      // 1a8: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ab: athrow
      // 1ac: if_icmpeq 1c2
      // 1af: goto 1b6
      // 1b2: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b5: athrow
      // 1b6: new java/lang/UnsupportedOperationException
      // 1b9: dup
      // 1ba: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 1bd: athrow
      // 1be: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c1: athrow
      // 1c2: iload 2
      // 1c3: bipush 4
      // 1c4: iadd
      // 1c5: ireturn
      // 1c6: new java/lang/UnsupportedOperationException
      // 1c9: dup
      // 1ca: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 1cd: athrow
      // 1ce: new java/lang/AssertionError
      // 1d1: dup
      // 1d2: invokespecial java/lang/AssertionError.<init> ()V
      // 1d5: athrow
      // try (20 -> 25): 26 java/lang/IllegalArgumentException
      // try (23 -> 35): 36 java/lang/IllegalArgumentException
      // try (28 -> 40): 41 java/lang/IllegalArgumentException
      // try (38 -> 45): 46 java/lang/IllegalArgumentException
      // try (48 -> 51): 51 java/lang/IllegalArgumentException
      // try (50 -> 56): 57 java/lang/IllegalArgumentException
      // try (96 -> 103): 103 java/lang/IllegalArgumentException
      // try (106 -> 114): 115 java/lang/IllegalArgumentException
      // try (112 -> 121): 121 java/lang/IllegalArgumentException
      // try (139 -> 144): 145 java/lang/IllegalArgumentException
      // try (143 -> 151): 152 java/lang/IllegalArgumentException
      // try (147 -> 155): 156 java/lang/IllegalArgumentException
      // try (154 -> 166): 167 java/lang/IllegalArgumentException
      // try (158 -> 170): 171 java/lang/IllegalArgumentException
      // try (169 -> 177): 177 java/lang/IllegalArgumentException
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/inject/MathUtil3.54744772825055L J
      // 003: ldc2_w 105690268688100
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: iload 4
      // 010: ifne 025
      // 013: aload 1
      // 014: if_acmpne 024
      // 017: goto 01e
      // 01a: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01d: athrow
      // 01e: bipush 1
      // 01f: ireturn
      // 020: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 023: athrow
      // 024: aload 1
      // 025: iload 4
      // 027: ifne 03e
      // 02a: instanceof rip/breeze/inject/MathUtil3
      // 02d: ifne 03d
      // 030: goto 037
      // 033: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 036: athrow
      // 037: bipush 0
      // 038: ireturn
      // 039: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03c: athrow
      // 03d: aload 1
      // 03e: checkcast rip/breeze/inject/MathUtil3
      // 041: astore 5
      // 043: aload 0
      // 044: iload 4
      // 046: ifne 062
      // 049: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 04c: bipush 12
      // 04e: if_icmpne 061
      // 051: goto 058
      // 054: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 057: athrow
      // 058: bipush 10
      // 05a: goto 065
      // 05d: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 060: athrow
      // 061: aload 0
      // 062: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 065: aload 5
      // 067: iload 4
      // 069: ifne 086
      // 06c: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 06f: bipush 12
      // 071: if_icmpne 084
      // 074: goto 07b
      // 077: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07a: athrow
      // 07b: bipush 10
      // 07d: goto 089
      // 080: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 083: athrow
      // 084: aload 5
      // 086: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 089: if_icmpeq 092
      // 08c: bipush 0
      // 08d: ireturn
      // 08e: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 091: athrow
      // 092: aload 0
      // 093: getfield rip/breeze/inject/MathUtil3.int_å I
      // 096: istore 6
      // 098: aload 0
      // 099: getfield rip/breeze/inject/MathUtil3.int_ä I
      // 09c: istore 7
      // 09e: aload 5
      // 0a0: getfield rip/breeze/inject/MathUtil3.int_å I
      // 0a3: istore 8
      // 0a5: aload 5
      // 0a7: getfield rip/breeze/inject/MathUtil3.int_ä I
      // 0aa: istore 9
      // 0ac: iload 7
      // 0ae: iload 6
      // 0b0: isub
      // 0b1: iload 4
      // 0b3: ifne 0cd
      // 0b6: iload 9
      // 0b8: iload 8
      // 0ba: isub
      // 0bb: if_icmpeq 0cb
      // 0be: goto 0c5
      // 0c1: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c4: athrow
      // 0c5: bipush 0
      // 0c6: ireturn
      // 0c7: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ca: athrow
      // 0cb: iload 6
      // 0cd: istore 10
      // 0cf: iload 8
      // 0d1: istore 11
      // 0d3: iload 10
      // 0d5: iload 7
      // 0d7: if_icmpge 11c
      // 0da: aload 0
      // 0db: getfield rip/breeze/inject/MathUtil3.string_æ Ljava/lang/String;
      // 0de: iload 10
      // 0e0: invokevirtual java/lang/String.charAt (I)C
      // 0e3: iload 4
      // 0e5: ifne 11d
      // 0e8: iload 4
      // 0ea: ifne 110
      // 0ed: goto 0f4
      // 0f0: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f3: athrow
      // 0f4: aload 5
      // 0f6: getfield rip/breeze/inject/MathUtil3.string_æ Ljava/lang/String;
      // 0f9: iload 11
      // 0fb: invokevirtual java/lang/String.charAt (I)C
      // 0fe: if_icmpeq 111
      // 101: goto 108
      // 104: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 107: athrow
      // 108: bipush 0
      // 109: goto 110
      // 10c: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10f: athrow
      // 110: ireturn
      // 111: iinc 10 1
      // 114: iinc 11 1
      // 117: iload 4
      // 119: ifeq 0d3
      // 11c: bipush 1
      // 11d: ireturn
      // try (6 -> 11): 12 java/lang/IllegalArgumentException
      // try (9 -> 16): 16 java/lang/IllegalArgumentException
      // try (19 -> 23): 24 java/lang/IllegalArgumentException
      // try (21 -> 28): 28 java/lang/IllegalArgumentException
      // try (33 -> 39): 40 java/lang/IllegalArgumentException
      // try (36 -> 44): 44 java/lang/IllegalArgumentException
      // try (48 -> 54): 55 java/lang/IllegalArgumentException
      // try (51 -> 59): 59 java/lang/IllegalArgumentException
      // try (63 -> 66): 66 java/lang/IllegalArgumentException
      // try (80 -> 89): 90 java/lang/IllegalArgumentException
      // try (85 -> 94): 94 java/lang/IllegalArgumentException
      // try (103 -> 111): 112 java/lang/IllegalArgumentException
      // try (109 -> 119): 120 java/lang/IllegalArgumentException
      // try (114 -> 123): 124 java/lang/IllegalArgumentException
   }

   @Override
   public int hashCode() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/MathUtil3.54744772825055L J
      // 03: ldc2_w 2623076856530
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 0b: istore 3
      // 0c: bipush 13
      // 0e: aload 0
      // 0f: iload 3
      // 10: ifne 2c
      // 13: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 16: bipush 12
      // 18: if_icmpne 2b
      // 1b: goto 22
      // 1e: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: bipush 10
      // 24: goto 2f
      // 27: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 2f: imul
      // 30: istore 4
      // 32: aload 0
      // 33: getfield rip/breeze/inject/MathUtil3.int_ç I
      // 36: iload 3
      // 37: ifne 77
      // 3a: bipush 9
      // 3c: if_icmplt 75
      // 3f: goto 46
      // 42: invokestatic rip/breeze/inject/MathUtil3.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 45: athrow
      // 46: aload 0
      // 47: getfield rip/breeze/inject/MathUtil3.int_å I
      // 4a: istore 5
      // 4c: aload 0
      // 4d: getfield rip/breeze/inject/MathUtil3.int_ä I
      // 50: istore 6
      // 52: iload 5
      // 54: iload 6
      // 56: if_icmpge 75
      // 59: bipush 17
      // 5b: iload 4
      // 5d: aload 0
      // 5e: getfield rip/breeze/inject/MathUtil3.string_æ Ljava/lang/String;
      // 61: iload 5
      // 63: invokevirtual java/lang/String.charAt (I)C
      // 66: iadd
      // 67: imul
      // 68: iload 3
      // 69: ifne 77
      // 6c: istore 4
      // 6e: iinc 5 1
      // 71: iload 3
      // 72: ifeq 52
      // 75: iload 4
      // 77: ireturn
      // try (6 -> 13): 14 java/lang/IllegalArgumentException
      // try (10 -> 18): 18 java/lang/IllegalArgumentException
      // try (24 -> 30): 31 java/lang/IllegalArgumentException
   }

   @Override
   public String toString() {
      long var1 = 53957010579881L;
      long var3 = var1 ^ 128310518924066L;
      return this.buildString_5(new Object[]{var3});
   }

   static {
      long var0 = 93195504625936L;
      toggle(false);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[15];
      int var5 = 0;
      String var6 = "«\u0086B\u0002¡ù\b£ëÂ\u008bÉ\u009a¸.\u0080(Ø¬P\u008duB$÷tL'ºô\"l\u0090\u0014l\u0091)¦üDÞ1¾£*DB¥\u0012£±S¢¨¦\u0017;\u0010\u0015ÞcS\u001b=\u009e\u0085\u00adºã\u001eÎ&5\u008f =é dqxÀ\u009b\u000fIßÅ\u0013ÝÙÙ\u0002m*ß4Êís\u0099\"»3\u0019.«8\u0010,ÜN\u0011\u0016\u008f.SÓYd<\u007fBÏ\u0017\u0010ß:\u0004¥Ä:ù\u0084º6_\u009e-\u000fÖ\u009f\u0010zç\u001bÿoæ:ÝP[ÿªc?ËJ\u0010U;m°u´\u00adÊ{P´²\tÅÿO\u0010\u0081)£¦4gyÄ\u0085ºÐ'è+\u001cº\u0010nùïòC°Fna~:à\u008e\u008a\u001a¿\u0010\u0088\u0007$ì/\u0006\u0000¦Ï\u00904~ìÙ\u00947 ðýÌ8æTs¢$nX(Ñ&üoáß/\u00837\u009bÃÌ\\1\u00188NÉÆÃ\u0010Íý@5\u0016Õ\\\u008dA\u008aTóríöñ";
      int var7 = "«\u0086B\u0002¡ù\b£ëÂ\u008bÉ\u009a¸.\u0080(Ø¬P\u008duB$÷tL'ºô\"l\u0090\u0014l\u0091)¦üDÞ1¾£*DB¥\u0012£±S¢¨¦\u0017;\u0010\u0015ÞcS\u001b=\u009e\u0085\u00adºã\u001eÎ&5\u008f =é dqxÀ\u009b\u000fIßÅ\u0013ÝÙÙ\u0002m*ß4Êís\u0099\"»3\u0019.«8\u0010,ÜN\u0011\u0016\u008f.SÓYd<\u007fBÏ\u0017\u0010ß:\u0004¥Ä:ù\u0084º6_\u009e-\u000fÖ\u009f\u0010zç\u001bÿoæ:ÝP[ÿªc?ËJ\u0010U;m°u´\u00adÊ{P´²\tÅÿO\u0010\u0081)£¦4gyÄ\u0085ºÐ'è+\u001cº\u0010nùïòC°Fna~:à\u008e\u008a\u001a¿\u0010\u0088\u0007$ì/\u0006\u0000¦Ï\u00904~ìÙ\u00947 ðýÌ8æTs¢$nX(Ñ&üoáß/\u00837\u009bÃÌ\\1\u00188NÉÆÃ\u0010Íý@5\u0016Õ\\\u008dA\u008aTóríöñ"
         .length();
      char var8 = '\u0010';
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = buildString_11(var11).intern();
         if ((var9 += var8) >= var7) {
            var6 = "\u0093\u0014\u0019¡0Ák\u001büt\u0092¾½\u0094Î2laÄ\u0096l`>a\u0010\u0003·YàCc®qA|3Æ\u008d\u0087¤×";
            var7 = "\u0093\u0014\u0019¡0Ák\u001büt\u0092¾½\u0094Î2laÄ\u0096l`>a\u0010\u0003·YàCc®qA|3Æ\u008d\u0087¤×".length();
            var8 = '\u0018';
            var9 = -1;

            while (true) {
               var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
               var4[var5++] = buildString_11(var11).intern();
               if ((var9 += var8) >= var7) {
                  CONST_B = var4;
                  CONST_C = new String[15];
                  CONST_Ñ = buildString_12(20020, 2365457521724544300L ^ var0);
                  CONST_Ð = new MathUtil3(0, buildString_12(26140, 749582129392844044L ^ var0), 0, 1);
                  CONST_Ï = new MathUtil3(1, buildString_12(4227, 8439829336341941141L ^ var0), 1, 2);
                  CONST_Î = new MathUtil3(2, buildString_12(4227, 8439829336341941141L ^ var0), 2, 3);
                  CONST_Í = new MathUtil3(3, buildString_12(4227, 8439829336341941141L ^ var0), 3, 4);
                  CONST_Ì = new MathUtil3(4, buildString_12(4227, 8439829336341941141L ^ var0), 4, 5);
                  CONST_Ë = new MathUtil3(5, buildString_12(4227, 8439829336341941141L ^ var0), 5, 6);
                  CONST_Ê = new MathUtil3(6, buildString_12(4227, 8439829336341941141L ^ var0), 6, 7);
                  CONST_É = new MathUtil3(7, buildString_12(4227, 8439829336341941141L ^ var0), 7, 8);
                  CONST_È = new MathUtil3(8, buildString_12(4227, 8439829336341941141L ^ var0), 8, 9);
                  return;
               }

               var8 = var6.charAt(var9);
            }
         }

         var8 = var6.charAt(var9);
      }
   }

   public static void toggle(boolean var0) {
      bool_ã = var0;
   }

   public static boolean isValid() {
      return bool_ã;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid();

      try {
         return !var0;
      } catch (IllegalArgumentException var1) {
         throw getIllegalArgumentException(var1);
      }
   }

   private static IllegalArgumentException getIllegalArgumentException(IllegalArgumentException var0) {
      return var0;
   }

   private static String buildString_11(byte[] var0) {
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

   private static String buildString_12(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12811;
      if (CONST_C[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/a", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B[var3].getBytes("ISO-8859-1");
         CONST_C[var3] = buildString_11(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C[var3];
   }
}
