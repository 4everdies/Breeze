package rip.breeze.inject;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ª {
   static final int CONST_Ÿ_2 = 1;
   static final int CONST_Þ_2 = 2;
   static final int CONST_Ý_2 = 4;
   static final int CONST_Ü_2 = 8;
   static final int CONST_Û_2 = 16;
   static final int CONST_Ú_2 = 32;
   static final int CONST_Ù_2 = 64;
   static final int CONST_Ø_2 = 128;
   static final int CONST_Ö_2 = 4;
   static final int CONST_Õ_2 = 6;
   static final int CONST_Ô_2 = -268435456;
   static final int CONST_Ó_2 = 268435456;
   static final int CONST_Ò_2 = 536870912;
   static final int CONST_Ñ_2 = 805306368;
   static final int CONST_Ð_2 = 268435455;
   static final ª CONST_Ï_2;
   public Object object_î_2;
   short short_í_2;
   private short short_ì_2;
   private int[] arr_ë_2;
   int int_ê_2;
   private int[] arr_é_2;
   short short_è_2;
   short short_ç_2;
   short short_æ_2;
   short short_å_2;
   à à_ä_2;
   ª ª_ã_2;
   å å_â_2;
   ª ª_á_2;
   private static final String CONST_B_2;

   public int invoke_1(Object[] param1) {
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
      // 0c: getstatic rip/breeze/inject/ª.encKey_a_2 J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 15: istore 4
      // 17: aload 0
      // 18: getfield rip/breeze/inject/ª.short_í_2 S
      // 1b: bipush 4
      // 1c: iand
      // 1d: iload 4
      // 1f: ifeq 3f
      // 22: ifne 3b
      // 25: goto 2c
      // 28: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2b: athrow
      // 2c: new java/lang/IllegalStateException
      // 2f: dup
      // 30: getstatic rip/breeze/inject/ª.CONST_B_2 Ljava/lang/String;
      // 33: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 36: athrow
      // 37: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield rip/breeze/inject/ª.int_ê_2 I
      // 3f: ireturn
      // try (14 -> 21): 22 java/lang/IllegalStateException
      // try (20 -> 29): 29 java/lang/IllegalStateException
   }

   final ª invoke_2(Object[] param1) {
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
      // 0c: getstatic rip/breeze/inject/ª.encKey_a_2 J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 15: istore 4
      // 17: aload 0
      // 18: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 1b: iload 4
      // 1d: ifne 36
      // 20: ifnonnull 32
      // 23: goto 2a
      // 26: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 29: athrow
      // 2a: aload 0
      // 2b: goto 39
      // 2e: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 31: athrow
      // 32: aload 0
      // 33: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 36: getfield rip/breeze/inject/à.ª_j_2 Lrip/breeze/inject/ª;
      // 39: areturn
      // try (14 -> 19): 20 java/lang/IllegalStateException
      // try (18 -> 24): 24 java/lang/IllegalStateException
   }

   final void invoke_3(Object[] param1) {
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
      // 16: pop
      // 17: getstatic rip/breeze/inject/ª.encKey_a_2 J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 20: istore 5
      // 22: aload 0
      // 23: iload 5
      // 25: ifeq 61
      // 28: getfield rip/breeze/inject/ª.short_í_2 S
      // 2b: sipush 128
      // 2e: iand
      // 2f: ifne 59
      // 32: goto 39
      // 35: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 38: athrow
      // 39: aload 0
      // 3a: dup
      // 3b: getfield rip/breeze/inject/ª.short_í_2 S
      // 3e: sipush 128
      // 41: ior
      // 42: i2s
      // 43: putfield rip/breeze/inject/ª.short_í_2 S
      // 46: aload 0
      // 47: iload 4
      // 49: i2s
      // 4a: putfield rip/breeze/inject/ª.short_ì_2 S
      // 4d: iload 5
      // 4f: ifne e1
      // 52: goto 59
      // 55: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 58: athrow
      // 59: aload 0
      // 5a: goto 61
      // 5d: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 60: athrow
      // 61: getfield rip/breeze/inject/ª.arr_ë_2 [I
      // 64: iload 5
      // 66: lload 2
      // 67: lconst_0
      // 68: lcmp
      // 69: iflt 8c
      // 6c: ifeq 8b
      // 6f: ifnonnull 87
      // 72: goto 79
      // 75: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 78: athrow
      // 79: aload 0
      // 7a: bipush 4
      // 7b: newarray 10
      // 7d: putfield rip/breeze/inject/ª.arr_ë_2 [I
      // 80: goto 87
      // 83: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 86: athrow
      // 87: aload 0
      // 88: getfield rip/breeze/inject/ª.arr_ë_2 [I
      // 8b: bipush 0
      // 8c: dup2
      // 8d: iaload
      // 8e: bipush 1
      // 8f: iadd
      // 90: dup_x2
      // 91: iastore
      // 92: istore 6
      // 94: iload 6
      // 96: lload 2
      // 97: lconst_0
      // 98: lcmp
      // 99: ifle be
      // 9c: aload 0
      // 9d: getfield rip/breeze/inject/ª.arr_ë_2 [I
      // a0: arraylength
      // a1: iload 5
      // a3: ifeq bd
      // a6: if_icmplt d8
      // a9: goto b0
      // ac: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // af: athrow
      // b0: aload 0
      // b1: getfield rip/breeze/inject/ª.arr_ë_2 [I
      // b4: arraylength
      // b5: bipush 4
      // b6: goto bd
      // b9: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // bc: athrow
      // bd: iadd
      // be: newarray 10
      // c0: astore 7
      // c2: aload 0
      // c3: getfield rip/breeze/inject/ª.arr_ë_2 [I
      // c6: bipush 0
      // c7: aload 7
      // c9: bipush 0
      // ca: aload 0
      // cb: getfield rip/breeze/inject/ª.arr_ë_2 [I
      // ce: arraylength
      // cf: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // d2: aload 0
      // d3: aload 7
      // d5: putfield rip/breeze/inject/ª.arr_ë_2 [I
      // d8: aload 0
      // d9: getfield rip/breeze/inject/ª.arr_ë_2 [I
      // dc: iload 6
      // de: iload 4
      // e0: iastore
      // e1: return
      // try (20 -> 27): 28 java/lang/IllegalStateException
      // try (23 -> 43): 44 java/lang/IllegalStateException
      // try (30 -> 47): 48 java/lang/IllegalStateException
      // try (50 -> 58): 59 java/lang/IllegalStateException
      // try (57 -> 65): 66 java/lang/IllegalStateException
      // try (78 -> 89): 90 java/lang/IllegalStateException
      // try (88 -> 96): 97 java/lang/IllegalStateException
   }

   final void invoke_4(Object[] param1) {
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
      // 0e: checkcast rip/breeze/inject/Util140
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Boolean
      // 19: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1c: istore 5
      // 1e: pop
      // 1f: getstatic rip/breeze/inject/ª.encKey_a_2 J
      // 22: lload 2
      // 23: lxor
      // 24: lstore 2
      // 25: lload 2
      // 26: dup2
      // 27: ldc2_w 78543448339147
      // 2a: lxor
      // 2b: lstore 6
      // 2d: dup2
      // 2e: ldc2_w 126901792921198
      // 31: lxor
      // 32: lstore 8
      // 34: pop2
      // 35: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 38: aload 4
      // 3a: aload 0
      // 3b: lload 8
      // 3d: bipush 2
      // 3e: anewarray 4
      // 41: dup_x2
      // 42: dup_x2
      // 43: pop
      // 44: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 47: bipush 1
      // 48: swap
      // 49: aastore
      // 4a: dup_x1
      // 4b: swap
      // 4c: bipush 0
      // 4d: swap
      // 4e: aastore
      // 4f: invokevirtual rip/breeze/inject/Util140.processAll_15 ([Ljava/lang/Object;)V
      // 52: istore 10
      // 54: iload 5
      // 56: iload 10
      // 58: ifeq 80
      // 5b: ifeq fd
      // 5e: goto 65
      // 61: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 64: athrow
      // 65: aload 0
      // 66: iload 10
      // 68: ifeq b6
      // 6b: goto 72
      // 6e: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 71: athrow
      // 72: getfield rip/breeze/inject/ª.short_í_2 S
      // 75: sipush 128
      // 78: iand
      // 79: goto 80
      // 7c: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7f: athrow
      // 80: ifeq fd
      // 83: aload 4
      // 85: aload 0
      // 86: getfield rip/breeze/inject/ª.short_ì_2 S
      // 89: ldc 65535
      // 8b: iand
      // 8c: lload 6
      // 8e: dup2_x1
      // 8f: pop2
      // 90: aload 0
      // 91: bipush 3
      // 92: anewarray 4
      // 95: dup_x1
      // 96: swap
      // 97: bipush 2
      // 98: swap
      // 99: aastore
      // 9a: dup_x1
      // 9b: swap
      // 9c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9f: bipush 1
      // a0: swap
      // a1: aastore
      // a2: dup_x2
      // a3: dup_x2
      // a4: pop
      // a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a8: bipush 0
      // a9: swap
      // aa: aastore
      // ab: invokevirtual rip/breeze/inject/Util140.processAll_23 ([Ljava/lang/Object;)V
      // ae: aload 0
      // af: goto b6
      // b2: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // b5: athrow
      // b6: getfield rip/breeze/inject/ª.arr_ë_2 [I
      // b9: ifnull fd
      // bc: bipush 1
      // bd: istore 11
      // bf: iload 11
      // c1: aload 0
      // c2: getfield rip/breeze/inject/ª.arr_ë_2 [I
      // c5: bipush 0
      // c6: iaload
      // c7: if_icmpgt fd
      // ca: aload 4
      // cc: aload 0
      // cd: getfield rip/breeze/inject/ª.arr_ë_2 [I
      // d0: iload 11
      // d2: iaload
      // d3: lload 6
      // d5: dup2_x1
      // d6: pop2
      // d7: aload 0
      // d8: bipush 3
      // d9: anewarray 4
      // dc: dup_x1
      // dd: swap
      // de: bipush 2
      // df: swap
      // e0: aastore
      // e1: dup_x1
      // e2: swap
      // e3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // e6: bipush 1
      // e7: swap
      // e8: aastore
      // e9: dup_x2
      // ea: dup_x2
      // eb: pop
      // ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // ef: bipush 0
      // f0: swap
      // f1: aastore
      // f2: invokevirtual rip/breeze/inject/Util140.processAll_23 ([Ljava/lang/Object;)V
      // f5: iinc 11 1
      // f8: iload 10
      // fa: ifne bf
      // fd: return
      // try (53 -> 57): 58 java/lang/IllegalStateException
      // try (56 -> 63): 64 java/lang/IllegalStateException
      // try (60 -> 69): 70 java/lang/IllegalStateException
      // try (72 -> 104): 105 java/lang/IllegalStateException
   }

   final void invoke_5(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/ð
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Integer
      // 018: invokevirtual java/lang/Integer.intValue ()I
      // 01b: istore 5
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/Boolean
      // 023: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 026: istore 6
      // 028: pop
      // 029: getstatic rip/breeze/inject/ª.encKey_a_2 J
      // 02c: lload 3
      // 02d: lxor
      // 02e: lstore 3
      // 02f: lload 3
      // 030: dup2
      // 031: ldc2_w 19460761792756
      // 034: lxor
      // 035: lstore 7
      // 037: dup2
      // 038: ldc2_w 132916954893088
      // 03b: lxor
      // 03c: lstore 9
      // 03e: dup2
      // 03f: ldc2_w 58947287849503
      // 042: lxor
      // 043: lstore 11
      // 045: pop2
      // 046: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 049: istore 13
      // 04b: aload 0
      // 04c: getfield rip/breeze/inject/ª.short_í_2 S
      // 04f: bipush 4
      // 050: iand
      // 051: iload 13
      // 053: ifne 133
      // 056: ifne 12a
      // 059: goto 060
      // 05c: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 05f: athrow
      // 060: iload 6
      // 062: lload 3
      // 063: lconst_0
      // 064: lcmp
      // 065: iflt 120
      // 068: ifeq 0ce
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 071: athrow
      // 072: aload 0
      // 073: lload 7
      // 075: iload 5
      // 077: ldc 536870912
      // 079: aload 2
      // 07a: getfield rip/breeze/inject/ð.int_þ_2 I
      // 07d: bipush 4
      // 07e: anewarray 4
      // 081: dup_x1
      // 082: swap
      // 083: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 086: bipush 3
      // 087: swap
      // 088: aastore
      // 089: dup_x1
      // 08a: swap
      // 08b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08e: bipush 2
      // 08f: swap
      // 090: aastore
      // 091: dup_x1
      // 092: swap
      // 093: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 096: bipush 1
      // 097: swap
      // 098: aastore
      // 099: dup_x2
      // 09a: dup_x2
      // 09b: pop
      // 09c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09f: bipush 0
      // 0a0: swap
      // 0a1: aastore
      // 0a2: invokevirtual rip/breeze/inject/ª.method_007 ([Ljava/lang/Object;)V
      // 0a5: aload 2
      // 0a6: bipush -1
      // 0a7: lload 11
      // 0a9: bipush 2
      // 0aa: anewarray 4
      // 0ad: dup_x2
      // 0ae: dup_x2
      // 0af: pop
      // 0b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b3: bipush 1
      // 0b4: swap
      // 0b5: aastore
      // 0b6: dup_x1
      // 0b7: swap
      // 0b8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bb: bipush 0
      // 0bc: swap
      // 0bd: aastore
      // 0be: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0c1: pop
      // 0c2: iload 13
      // 0c4: ifeq 195
      // 0c7: goto 0ce
      // 0ca: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: lload 7
      // 0d1: iload 5
      // 0d3: ldc 268435456
      // 0d5: aload 2
      // 0d6: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0d9: bipush 4
      // 0da: anewarray 4
      // 0dd: dup_x1
      // 0de: swap
      // 0df: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e2: bipush 3
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x1
      // 0e6: swap
      // 0e7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ea: bipush 2
      // 0eb: swap
      // 0ec: aastore
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f2: bipush 1
      // 0f3: swap
      // 0f4: aastore
      // 0f5: dup_x2
      // 0f6: dup_x2
      // 0f7: pop
      // 0f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fb: bipush 0
      // 0fc: swap
      // 0fd: aastore
      // 0fe: invokevirtual rip/breeze/inject/ª.method_007 ([Ljava/lang/Object;)V
      // 101: aload 2
      // 102: bipush -1
      // 103: lload 9
      // 105: bipush 2
      // 106: anewarray 4
      // 109: dup_x2
      // 10a: dup_x2
      // 10b: pop
      // 10c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10f: bipush 1
      // 110: swap
      // 111: aastore
      // 112: dup_x1
      // 113: swap
      // 114: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 117: bipush 0
      // 118: swap
      // 119: aastore
      // 11a: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 11d: pop
      // 11e: iload 13
      // 120: ifeq 195
      // 123: goto 12a
      // 126: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 129: athrow
      // 12a: iload 6
      // 12c: goto 133
      // 12f: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 132: athrow
      // 133: lload 3
      // 134: lconst_0
      // 135: lcmp
      // 136: iflt 161
      // 139: ifeq 16b
      // 13c: aload 2
      // 13d: aload 0
      // 13e: getfield rip/breeze/inject/ª.int_ê_2 I
      // 141: iload 5
      // 143: isub
      // 144: lload 11
      // 146: bipush 2
      // 147: anewarray 4
      // 14a: dup_x2
      // 14b: dup_x2
      // 14c: pop
      // 14d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 150: bipush 1
      // 151: swap
      // 152: aastore
      // 153: dup_x1
      // 154: swap
      // 155: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 158: bipush 0
      // 159: swap
      // 15a: aastore
      // 15b: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 15e: pop
      // 15f: iload 13
      // 161: ifeq 195
      // 164: goto 16b
      // 167: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 16a: athrow
      // 16b: aload 2
      // 16c: aload 0
      // 16d: getfield rip/breeze/inject/ª.int_ê_2 I
      // 170: iload 5
      // 172: isub
      // 173: lload 9
      // 175: bipush 2
      // 176: anewarray 4
      // 179: dup_x2
      // 17a: dup_x2
      // 17b: pop
      // 17c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17f: bipush 1
      // 180: swap
      // 181: aastore
      // 182: dup_x1
      // 183: swap
      // 184: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 187: bipush 0
      // 188: swap
      // 189: aastore
      // 18a: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 18d: pop
      // 18e: goto 195
      // 191: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 194: athrow
      // 195: return
      // try (45 -> 52): 53 java/lang/IllegalStateException
      // try (51 -> 61): 62 java/lang/IllegalStateException
      // try (55 -> 120): 121 java/lang/IllegalStateException
      // try (64 -> 179): 180 java/lang/IllegalStateException
      // try (123 -> 183): 184 java/lang/IllegalStateException
      // try (186 -> 216): 217 java/lang/IllegalStateException
      // try (191 -> 242): 243 java/lang/IllegalStateException
   }

   final void invoke_6(Object[] param1) {
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
      // 0e: checkcast rip/breeze/inject/ð
      // 11: astore 4
      // 13: pop
      // 14: getstatic rip/breeze/inject/ª.encKey_a_2 J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 112958261931738
      // 1f: lxor
      // 20: lstore 5
      // 22: dup2
      // 23: ldc2_w 17506441434382
      // 26: lxor
      // 27: lstore 7
      // 29: pop2
      // 2a: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 2d: istore 9
      // 2f: iload 9
      // 31: ifne 9f
      // 34: aload 0
      // 35: getfield rip/breeze/inject/ª.short_í_2 S
      // 38: bipush 4
      // 39: iand
      // 3a: ifne 7e
      // 3d: goto 44
      // 40: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 43: athrow
      // 44: aload 0
      // 45: lload 5
      // 47: bipush 0
      // 48: ldc 805306368
      // 4a: aload 4
      // 4c: getfield rip/breeze/inject/ð.int_þ_2 I
      // 4f: bipush 4
      // 50: anewarray 4
      // 53: dup_x1
      // 54: swap
      // 55: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 58: bipush 3
      // 59: swap
      // 5a: aastore
      // 5b: dup_x1
      // 5c: swap
      // 5d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 60: bipush 2
      // 61: swap
      // 62: aastore
      // 63: dup_x1
      // 64: swap
      // 65: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 68: bipush 1
      // 69: swap
      // 6a: aastore
      // 6b: dup_x2
      // 6c: dup_x2
      // 6d: pop
      // 6e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 71: bipush 0
      // 72: swap
      // 73: aastore
      // 74: invokevirtual rip/breeze/inject/ª.method_007 ([Ljava/lang/Object;)V
      // 77: goto 7e
      // 7a: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7d: athrow
      // 7e: aload 4
      // 80: aload 0
      // 81: getfield rip/breeze/inject/ª.int_ê_2 I
      // 84: lload 7
      // 86: bipush 2
      // 87: anewarray 4
      // 8a: dup_x2
      // 8b: dup_x2
      // 8c: pop
      // 8d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 90: bipush 1
      // 91: swap
      // 92: aastore
      // 93: dup_x1
      // 94: swap
      // 95: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 98: bipush 0
      // 99: swap
      // 9a: aastore
      // 9b: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 9e: pop
      // 9f: return
      // try (29 -> 36): 37 java/lang/IllegalStateException
      // try (31 -> 73): 74 java/lang/IllegalStateException
   }

   private void invoke_7(Object[] param1) {
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
      // 19: checkcast java/lang/Integer
      // 1c: invokevirtual java/lang/Integer.intValue ()I
      // 1f: istore 5
      // 21: dup
      // 22: bipush 3
      // 23: aaload
      // 24: checkcast java/lang/Integer
      // 27: invokevirtual java/lang/Integer.intValue ()I
      // 2a: istore 6
      // 2c: pop
      // 2d: getstatic rip/breeze/inject/ª.encKey_a_2 J
      // 30: lload 2
      // 31: lxor
      // 32: lstore 2
      // 33: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 36: istore 7
      // 38: aload 0
      // 39: getfield rip/breeze/inject/ª.arr_é_2 [I
      // 3c: iload 7
      // 3e: ifeq 5e
      // 41: ifnonnull 5a
      // 44: goto 4b
      // 47: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: bipush 6
      // 4e: newarray 10
      // 50: putfield rip/breeze/inject/ª.arr_é_2 [I
      // 53: goto 5a
      // 56: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield rip/breeze/inject/ª.arr_é_2 [I
      // 5e: bipush 0
      // 5f: iaload
      // 60: istore 8
      // 62: iload 7
      // 64: lload 2
      // 65: lconst_0
      // 66: lcmp
      // 67: ifle 71
      // 6a: ifeq c5
      // 6d: iload 8
      // 6f: bipush 2
      // 70: iadd
      // 71: aload 0
      // 72: getfield rip/breeze/inject/ª.arr_é_2 [I
      // 75: arraylength
      // 76: if_icmplt a2
      // 79: goto 80
      // 7c: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7f: athrow
      // 80: aload 0
      // 81: getfield rip/breeze/inject/ª.arr_é_2 [I
      // 84: arraylength
      // 85: bipush 6
      // 87: iadd
      // 88: newarray 10
      // 8a: astore 9
      // 8c: aload 0
      // 8d: getfield rip/breeze/inject/ª.arr_é_2 [I
      // 90: bipush 0
      // 91: aload 9
      // 93: bipush 0
      // 94: aload 0
      // 95: getfield rip/breeze/inject/ª.arr_é_2 [I
      // 98: arraylength
      // 99: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 9c: aload 0
      // 9d: aload 9
      // 9f: putfield rip/breeze/inject/ª.arr_é_2 [I
      // a2: aload 0
      // a3: getfield rip/breeze/inject/ª.arr_é_2 [I
      // a6: iinc 8 1
      // a9: iload 8
      // ab: iload 4
      // ad: iastore
      // ae: aload 0
      // af: getfield rip/breeze/inject/ª.arr_é_2 [I
      // b2: iinc 8 1
      // b5: iload 8
      // b7: iload 5
      // b9: iload 6
      // bb: ior
      // bc: iastore
      // bd: aload 0
      // be: getfield rip/breeze/inject/ª.arr_é_2 [I
      // c1: bipush 0
      // c2: iload 8
      // c4: iastore
      // c5: return
      // try (32 -> 37): 38 java/lang/IllegalStateException
      // try (36 -> 44): 45 java/lang/IllegalStateException
      // try (52 -> 65): 66 java/lang/IllegalStateException
   }

   final boolean check_8(Object[] param1) {
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
      // 004: checkcast [B
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast rip/breeze/inject/ð
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Integer
      // 015: invokevirtual java/lang/Integer.intValue ()I
      // 018: istore 4
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/Long
      // 020: invokevirtual java/lang/Long.longValue ()J
      // 023: lstore 5
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast java/lang/Integer
      // 02b: invokevirtual java/lang/Integer.intValue ()I
      // 02e: istore 7
      // 030: pop
      // 031: iload 4
      // 033: i2l
      // 034: bipush 48
      // 036: lshl
      // 037: lload 5
      // 039: bipush 16
      // 03b: lshl
      // 03c: bipush 16
      // 03e: lushr
      // 03f: lor
      // 040: getstatic rip/breeze/inject/ª.encKey_a_2 J
      // 043: lxor
      // 044: lstore 8
      // 046: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 049: aload 0
      // 04a: dup
      // 04b: getfield rip/breeze/inject/ª.short_í_2 S
      // 04e: bipush 4
      // 04f: ior
      // 050: i2s
      // 051: putfield rip/breeze/inject/ª.short_í_2 S
      // 054: aload 0
      // 055: iload 7
      // 057: putfield rip/breeze/inject/ª.int_ê_2 I
      // 05a: istore 10
      // 05c: aload 0
      // 05d: getfield rip/breeze/inject/ª.arr_é_2 [I
      // 060: ifnonnull 069
      // 063: bipush 0
      // 064: ireturn
      // 065: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 068: athrow
      // 069: bipush 0
      // 06a: istore 11
      // 06c: aload 0
      // 06d: getfield rip/breeze/inject/ª.arr_é_2 [I
      // 070: bipush 0
      // 071: iaload
      // 072: istore 12
      // 074: iload 12
      // 076: ifle 20a
      // 079: aload 0
      // 07a: getfield rip/breeze/inject/ª.arr_é_2 [I
      // 07d: iload 12
      // 07f: bipush 1
      // 080: isub
      // 081: iaload
      // 082: istore 13
      // 084: aload 0
      // 085: getfield rip/breeze/inject/ª.arr_é_2 [I
      // 088: iload 12
      // 08a: iaload
      // 08b: istore 14
      // 08d: iload 7
      // 08f: iload 13
      // 091: isub
      // 092: istore 15
      // 094: iload 14
      // 096: ldc 268435455
      // 098: iand
      // 099: istore 16
      // 09b: iload 14
      // 09d: ldc -268435456
      // 09f: iand
      // 0a0: iload 10
      // 0a2: lload 5
      // 0a4: lconst_0
      // 0a5: lcmp
      // 0a6: iflt 0ae
      // 0a9: ifne 20c
      // 0ac: ldc 268435456
      // 0ae: iload 4
      // 0b0: iflt 19d
      // 0b3: iload 10
      // 0b5: ifne 19d
      // 0b8: goto 0bf
      // 0bb: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0be: athrow
      // 0bf: lload 5
      // 0c1: lconst_0
      // 0c2: lcmp
      // 0c3: ifle 196
      // 0c6: if_icmpne 18f
      // 0c9: goto 0d0
      // 0cc: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0cf: athrow
      // 0d0: iload 15
      // 0d2: sipush -32768
      // 0d5: iload 10
      // 0d7: ifne 122
      // 0da: goto 0e1
      // 0dd: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0e0: athrow
      // 0e1: lload 5
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: iflt 11b
      // 0e8: if_icmplt 114
      // 0eb: goto 0f2
      // 0ee: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0f1: athrow
      // 0f2: iload 15
      // 0f4: lload 5
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: ifle 123
      // 0fb: sipush 32767
      // 0fe: iload 10
      // 100: ifne 122
      // 103: goto 10a
      // 106: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 109: athrow
      // 10a: if_icmple 16f
      // 10d: goto 114
      // 110: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 113: athrow
      // 114: aload 2
      // 115: iload 13
      // 117: baload
      // 118: sipush 255
      // 11b: goto 122
      // 11e: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 121: athrow
      // 122: iand
      // 123: istore 17
      // 125: iload 10
      // 127: iload 4
      // 129: iflt 151
      // 12c: ifne 14f
      // 12f: iload 17
      // 131: sipush 198
      // 134: if_icmpge 15b
      // 137: goto 13e
      // 13a: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 13d: athrow
      // 13e: aload 2
      // 13f: iload 13
      // 141: iload 17
      // 143: bipush 49
      // 145: iadd
      // 146: i2b
      // 147: bastore
      // 148: goto 14f
      // 14b: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 14e: athrow
      // 14f: iload 10
      // 151: lload 5
      // 153: lconst_0
      // 154: lcmp
      // 155: iflt 16d
      // 158: ifeq 16c
      // 15b: aload 2
      // 15c: iload 13
      // 15e: iload 17
      // 160: bipush 20
      // 162: iadd
      // 163: i2b
      // 164: bastore
      // 165: goto 16c
      // 168: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 16b: athrow
      // 16c: bipush 1
      // 16d: istore 11
      // 16f: aload 2
      // 170: iload 16
      // 172: iinc 16 1
      // 175: iload 15
      // 177: bipush 8
      // 179: iushr
      // 17a: i2b
      // 17b: bastore
      // 17c: aload 2
      // 17d: iload 16
      // 17f: iload 15
      // 181: i2b
      // 182: bastore
      // 183: iload 10
      // 185: lload 5
      // 187: lconst_0
      // 188: lcmp
      // 189: iflt 207
      // 18c: ifeq 202
      // 18f: iload 14
      // 191: ldc -268435456
      // 193: iand
      // 194: ldc 536870912
      // 196: goto 19d
      // 199: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 19c: athrow
      // 19d: if_icmpne 1e1
      // 1a0: aload 2
      // 1a1: iload 16
      // 1a3: iinc 16 1
      // 1a6: iload 15
      // 1a8: bipush 24
      // 1aa: iushr
      // 1ab: i2b
      // 1ac: bastore
      // 1ad: aload 2
      // 1ae: iload 16
      // 1b0: iinc 16 1
      // 1b3: iload 15
      // 1b5: bipush 16
      // 1b7: iushr
      // 1b8: i2b
      // 1b9: bastore
      // 1ba: aload 2
      // 1bb: iload 16
      // 1bd: iinc 16 1
      // 1c0: iload 15
      // 1c2: bipush 8
      // 1c4: iushr
      // 1c5: i2b
      // 1c6: bastore
      // 1c7: aload 2
      // 1c8: iload 16
      // 1ca: iload 15
      // 1cc: i2b
      // 1cd: bastore
      // 1ce: iload 10
      // 1d0: lload 5
      // 1d2: lconst_0
      // 1d3: lcmp
      // 1d4: ifle 207
      // 1d7: ifeq 202
      // 1da: goto 1e1
      // 1dd: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1e0: athrow
      // 1e1: aload 3
      // 1e2: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 1e5: iload 16
      // 1e7: iinc 16 1
      // 1ea: iload 7
      // 1ec: bipush 8
      // 1ee: iushr
      // 1ef: i2b
      // 1f0: bastore
      // 1f1: aload 3
      // 1f2: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 1f5: iload 16
      // 1f7: iload 7
      // 1f9: i2b
      // 1fa: bastore
      // 1fb: goto 202
      // 1fe: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 201: athrow
      // 202: iinc 12 -2
      // 205: iload 10
      // 207: ifeq 074
      // 20a: iload 11
      // 20c: ireturn
      // try (55 -> 60): 60 java/lang/IllegalStateException
      // try (91 -> 105): 106 java/lang/IllegalStateException
      // try (100 -> 113): 114 java/lang/IllegalStateException
      // try (108 -> 120): 121 java/lang/IllegalStateException
      // try (116 -> 128): 129 java/lang/IllegalStateException
      // try (123 -> 139): 140 java/lang/IllegalStateException
      // try (131 -> 143): 144 java/lang/IllegalStateException
      // try (142 -> 150): 151 java/lang/IllegalStateException
      // try (155 -> 162): 163 java/lang/IllegalStateException
      // try (159 -> 172): 173 java/lang/IllegalStateException
      // try (175 -> 188): 189 java/lang/IllegalStateException
      // try (193 -> 216): 217 java/lang/IllegalStateException
      // try (219 -> 255): 256 java/lang/IllegalStateException
      // try (220 -> 273): 274 java/lang/IllegalStateException
   }

   final void invoke_9(Object[] param1) {
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
      // 16: getstatic rip/breeze/inject/ª.encKey_a_2 J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: lload 3
      // 1d: dup2
      // 1e: ldc2_w 88477666366427
      // 21: lxor
      // 22: lstore 5
      // 24: pop2
      // 25: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 28: aload 0
      // 29: astore 7
      // 2b: istore 8
      // 2d: aload 7
      // 2f: getstatic rip/breeze/inject/ª.CONST_Ï_2 Lrip/breeze/inject/ª;
      // 32: putfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 35: aload 7
      // 37: getstatic rip/breeze/inject/ª.CONST_Ï_2 Lrip/breeze/inject/ª;
      // 3a: if_acmpeq 97
      // 3d: aload 7
      // 3f: astore 9
      // 41: aload 7
      // 43: getfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 46: astore 7
      // 48: aload 9
      // 4a: aconst_null
      // 4b: putfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 4e: aload 9
      // 50: iload 8
      // 52: ifne 90
      // 55: getfield rip/breeze/inject/ª.short_å_2 S
      // 58: lload 3
      // 59: lconst_0
      // 5a: lcmp
      // 5b: ifle 94
      // 5e: ifne 92
      // 61: goto 68
      // 64: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 67: athrow
      // 68: aload 9
      // 6a: iload 2
      // 6b: putfield rip/breeze/inject/ª.short_å_2 S
      // 6e: aload 9
      // 70: lload 5
      // 72: aload 7
      // 74: bipush 2
      // 75: anewarray 4
      // 78: dup_x1
      // 79: swap
      // 7a: bipush 1
      // 7b: swap
      // 7c: aastore
      // 7d: dup_x2
      // 7e: dup_x2
      // 7f: pop
      // 80: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 83: bipush 0
      // 84: swap
      // 85: aastore
      // 86: invokevirtual rip/breeze/inject/ª.method_011 ([Ljava/lang/Object;)Lrip/breeze/inject/ª;
      // 89: goto 90
      // 8c: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 8f: athrow
      // 90: astore 7
      // 92: iload 8
      // 94: ifeq 35
      // 97: return
      // try (39 -> 51): 52 java/lang/IllegalStateException
      // try (45 -> 75): 76 java/lang/IllegalStateException
   }

   final void invoke_10(Object[] param1) {
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
      // 00e: checkcast rip/breeze/inject/ª
      // 011: astore 4
      // 013: pop
      // 014: getstatic rip/breeze/inject/ª.encKey_a_2 J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 49086056843146
      // 01f: lxor
      // 020: lstore 5
      // 022: pop2
      // 023: getstatic rip/breeze/inject/ª.CONST_Ï_2 Lrip/breeze/inject/ª;
      // 026: astore 7
      // 028: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 02b: aload 0
      // 02c: astore 8
      // 02e: aload 8
      // 030: getstatic rip/breeze/inject/ª.CONST_Ï_2 Lrip/breeze/inject/ª;
      // 033: putfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 036: istore 9
      // 038: aload 8
      // 03a: getstatic rip/breeze/inject/ª.CONST_Ï_2 Lrip/breeze/inject/ª;
      // 03d: if_acmpeq 0f8
      // 040: aload 8
      // 042: astore 10
      // 044: aload 10
      // 046: getfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 049: astore 8
      // 04b: aload 10
      // 04d: aload 7
      // 04f: lload 2
      // 050: lconst_0
      // 051: lcmp
      // 052: iflt 103
      // 055: putfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 058: aload 10
      // 05a: astore 7
      // 05c: aload 10
      // 05e: iload 9
      // 060: ifeq 100
      // 063: iload 9
      // 065: ifeq 0f1
      // 068: goto 06f
      // 06b: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 06e: athrow
      // 06f: lload 2
      // 070: lconst_0
      // 071: lcmp
      // 072: ifle 0d8
      // 075: getfield rip/breeze/inject/ª.short_í_2 S
      // 078: bipush 64
      // 07a: iand
      // 07b: ifeq 0d6
      // 07e: goto 085
      // 081: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 084: athrow
      // 085: lload 2
      // 086: lconst_0
      // 087: lcmp
      // 088: ifle 0f3
      // 08b: aload 10
      // 08d: iload 9
      // 08f: ifeq 0f1
      // 092: goto 099
      // 095: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 098: athrow
      // 099: lload 2
      // 09a: lconst_0
      // 09b: lcmp
      // 09c: iflt 0d8
      // 09f: getfield rip/breeze/inject/ª.short_å_2 S
      // 0a2: aload 4
      // 0a4: getfield rip/breeze/inject/ª.short_å_2 S
      // 0a7: if_icmpeq 0d6
      // 0aa: goto 0b1
      // 0ad: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0b0: athrow
      // 0b1: aload 10
      // 0b3: new rip/breeze/inject/å
      // 0b6: dup
      // 0b7: aload 10
      // 0b9: getfield rip/breeze/inject/ª.short_ç_2 S
      // 0bc: aload 4
      // 0be: getfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 0c1: getfield rip/breeze/inject/å.ª_ü_2 Lrip/breeze/inject/ª;
      // 0c4: aload 10
      // 0c6: getfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 0c9: invokespecial rip/breeze/inject/å.<init> (ILrip/breeze/inject/ª;Lrip/breeze/inject/å;)V
      // 0cc: putfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 0cf: goto 0d6
      // 0d2: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0d5: athrow
      // 0d6: aload 10
      // 0d8: lload 5
      // 0da: aload 8
      // 0dc: bipush 2
      // 0dd: anewarray 4
      // 0e0: dup_x1
      // 0e1: swap
      // 0e2: bipush 1
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x2
      // 0e6: dup_x2
      // 0e7: pop
      // 0e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb: bipush 0
      // 0ec: swap
      // 0ed: aastore
      // 0ee: invokevirtual rip/breeze/inject/ª.method_011 ([Ljava/lang/Object;)Lrip/breeze/inject/ª;
      // 0f1: astore 8
      // 0f3: iload 9
      // 0f5: ifne 038
      // 0f8: lload 2
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: iflt 11c
      // 0fe: aload 7
      // 100: getstatic rip/breeze/inject/ª.CONST_Ï_2 Lrip/breeze/inject/ª;
      // 103: if_acmpeq 11c
      // 106: aload 7
      // 108: getfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 10b: astore 10
      // 10d: aload 7
      // 10f: aconst_null
      // 110: putfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 113: aload 10
      // 115: astore 7
      // 117: iload 9
      // 119: ifne 0f8
      // 11c: lload 2
      // 11d: lconst_0
      // 11e: lcmp
      // 11f: ifle 106
      // 122: return
      // try (49 -> 54): 55 java/lang/IllegalStateException
      // try (52 -> 65): 66 java/lang/IllegalStateException
      // try (57 -> 75): 76 java/lang/IllegalStateException
      // try (68 -> 86): 87 java/lang/IllegalStateException
      // try (78 -> 101): 102 java/lang/IllegalStateException
   }

   private ª invoke_11(Object[] param1) {
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
      // 0e: checkcast rip/breeze/inject/ª
      // 11: astore 4
      // 13: pop
      // 14: getstatic rip/breeze/inject/ª.encKey_a_2 J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 1d: aload 4
      // 1f: astore 5
      // 21: istore 6
      // 23: aload 0
      // 24: getfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 27: astore 7
      // 29: aload 7
      // 2b: ifnull ba
      // 2e: aload 0
      // 2f: iload 6
      // 31: ifeq c2
      // 34: getfield rip/breeze/inject/ª.short_í_2 S
      // 37: bipush 16
      // 39: iand
      // 3a: ifeq 5f
      // 3d: goto 44
      // 40: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 43: athrow
      // 44: aload 7
      // 46: aload 0
      // 47: getfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 4a: getfield rip/breeze/inject/å.å_û_2 Lrip/breeze/inject/å;
      // 4d: if_acmpne 5f
      // 50: goto 57
      // 53: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 56: athrow
      // 57: bipush 1
      // 58: goto 60
      // 5b: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5e: athrow
      // 5f: bipush 0
      // 60: istore 8
      // 62: iload 6
      // 64: lload 2
      // 65: lconst_0
      // 66: lcmp
      // 67: iflt b7
      // 6a: ifeq b5
      // 6d: iload 8
      // 6f: ifne ae
      // 72: goto 79
      // 75: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 78: athrow
      // 79: lload 2
      // 7a: lconst_0
      // 7b: lcmp
      // 7c: ifle b5
      // 7f: aload 7
      // 81: iload 6
      // 83: ifeq b3
      // 86: goto 8d
      // 89: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 8c: athrow
      // 8d: getfield rip/breeze/inject/å.ª_ü_2 Lrip/breeze/inject/ª;
      // 90: getfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 93: ifnonnull ae
      // 96: goto 9d
      // 99: invokestatic rip/breeze/inject/ª.method_013 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 9c: athrow
      // 9d: aload 7
      // 9f: getfield rip/breeze/inject/å.ª_ü_2 Lrip/breeze/inject/ª;
      // a2: aload 5
      // a4: putfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // a7: aload 7
      // a9: getfield rip/breeze/inject/å.ª_ü_2 Lrip/breeze/inject/ª;
      // ac: astore 5
      // ae: aload 7
      // b0: getfield rip/breeze/inject/å.å_û_2 Lrip/breeze/inject/å;
      // b3: astore 7
      // b5: iload 6
      // b7: ifne 29
      // ba: lload 2
      // bb: lconst_0
      // bc: lcmp
      // bd: ifle 2e
      // c0: aload 5
      // c2: areturn
      // try (26 -> 33): 34 java/lang/IllegalStateException
      // try (29 -> 41): 42 java/lang/IllegalStateException
      // try (36 -> 46): 46 java/lang/IllegalStateException
      // try (50 -> 58): 59 java/lang/IllegalStateException
      // try (56 -> 68): 69 java/lang/IllegalStateException
      // try (61 -> 74): 75 java/lang/IllegalStateException
   }

   @Override
   public String toString() {
      return method_012(new Object[]{System.identityHashCode(this)});
   }

   private static String invoke_12(Object[] var0) {
      int var1 = (Integer)var0[0];
      return "L" + var1;
   }

   static {
      long var0 = 12043691157243L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var5 = var2.doFinal(
         "\u0014_\u0085\u0007\u0081\u008b|À\u0094MñW*Ñ\u0013à\u001cçòF1(\u000b\u001d¿gÓ¶äTV`:\u0017R?PM\u0011\u00967rÈ>û5b{".getBytes("ISO-8859-1")
      );
      CONST_B_2 = method_014(var5).intern();
      CONST_Ï_2 = new ª();
   }

   private static IllegalStateException invoke_13(IllegalStateException var0) {
      return var0;
   }

   private static String invoke_14(byte[] var0) {
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
}
