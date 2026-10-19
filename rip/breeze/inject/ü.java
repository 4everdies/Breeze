package rip.breeze.inject;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class ü {
   protected final int int_ÿ_2;
   protected ü ü_þ_2;
   private static int int_ý_2;
   private static final String CONST_E_2;

   protected ü(int var1, long var2) {
      var2 = encKey_a_2 ^ var2;
      long var4 = var2 ^ 95278956952364L;
      this(var4, var1, null);
   }

   protected ü(long param1, int param3, ü param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/inject/ü.encKey_a_2 J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 58245975476913
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 74016461113164
      // 012: lxor
      // 013: lstore 7
      // 015: pop2
      // 016: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 019: aload 0
      // 01a: invokespecial java/lang/Object.<init> ()V
      // 01d: istore 9
      // 01f: iload 3
      // 020: ldc 589824
      // 022: iload 9
      // 024: ifne 0f7
      // 027: if_icmpeq 0f4
      // 02a: goto 031
      // 02d: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 030: athrow
      // 031: iload 3
      // 032: ldc 524288
      // 034: iload 9
      // 036: ifne 0f7
      // 039: goto 040
      // 03c: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03f: athrow
      // 040: if_icmpeq 0f4
      // 043: goto 04a
      // 046: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 049: athrow
      // 04a: iload 3
      // 04b: ldc 458752
      // 04d: iload 9
      // 04f: ifne 0f7
      // 052: goto 059
      // 055: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 058: athrow
      // 059: if_icmpeq 0f4
      // 05c: goto 063
      // 05f: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 062: athrow
      // 063: iload 3
      // 064: ldc 393216
      // 066: iload 9
      // 068: ifne 0f7
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 071: athrow
      // 072: if_icmpeq 0f4
      // 075: goto 07c
      // 078: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07b: athrow
      // 07c: iload 3
      // 07d: ldc 327680
      // 07f: iload 9
      // 081: ifne 0f7
      // 084: goto 08b
      // 087: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08a: athrow
      // 08b: if_icmpeq 0f4
      // 08e: goto 095
      // 091: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 094: athrow
      // 095: iload 3
      // 096: ldc 262144
      // 098: iload 9
      // 09a: ifne 0f7
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: if_icmpeq 0f4
      // 0a7: goto 0ae
      // 0aa: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: iload 3
      // 0af: ldc 17432576
      // 0b1: lload 1
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: iflt 0f7
      // 0b7: iload 9
      // 0b9: ifne 0f7
      // 0bc: goto 0c3
      // 0bf: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: if_icmpeq 0f4
      // 0c6: goto 0cd
      // 0c9: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cc: athrow
      // 0cd: new java/lang/IllegalArgumentException
      // 0d0: dup
      // 0d1: iload 3
      // 0d2: lload 7
      // 0d4: bipush 2
      // 0d5: anewarray 4
      // 0d8: dup_x2
      // 0d9: dup_x2
      // 0da: pop
      // 0db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0de: bipush 1
      // 0df: swap
      // 0e0: aastore
      // 0e1: dup_x1
      // 0e2: swap
      // 0e3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e6: bipush 0
      // 0e7: swap
      // 0e8: aastore
      // 0e9: invokestatic rip/breeze/inject/ü.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0ec: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ef: athrow
      // 0f0: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f3: athrow
      // 0f4: iload 3
      // 0f5: ldc 17432576
      // 0f7: if_icmpne 119
      // 0fa: lload 5
      // 0fc: aload 0
      // 0fd: bipush 2
      // 0fe: anewarray 4
      // 101: dup_x1
      // 102: swap
      // 103: bipush 1
      // 104: swap
      // 105: aastore
      // 106: dup_x2
      // 107: dup_x2
      // 108: pop
      // 109: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: invokestatic rip/breeze/inject/ç.processAll ([Ljava/lang/Object;)V
      // 112: goto 119
      // 115: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 3
      // 11b: putfield rip/breeze/inject/ü.int_ÿ_2 I
      // 11e: aload 0
      // 11f: aload 4
      // 121: putfield rip/breeze/inject/ü.ü_þ_2 Lrip/breeze/inject/ü;
      // 124: return
      // try (18 -> 23): 24 java/lang/IllegalArgumentException
      // try (22 -> 30): 31 java/lang/IllegalArgumentException
      // try (26 -> 34): 35 java/lang/IllegalArgumentException
      // try (33 -> 41): 42 java/lang/IllegalArgumentException
      // try (37 -> 45): 46 java/lang/IllegalArgumentException
      // try (44 -> 52): 53 java/lang/IllegalArgumentException
      // try (48 -> 56): 57 java/lang/IllegalArgumentException
      // try (55 -> 63): 64 java/lang/IllegalArgumentException
      // try (59 -> 67): 68 java/lang/IllegalArgumentException
      // try (66 -> 74): 75 java/lang/IllegalArgumentException
      // try (70 -> 78): 79 java/lang/IllegalArgumentException
      // try (77 -> 89): 90 java/lang/IllegalArgumentException
      // try (81 -> 93): 94 java/lang/IllegalArgumentException
      // try (92 -> 118): 118 java/lang/IllegalArgumentException
      // try (122 -> 140): 141 java/lang/IllegalArgumentException
   }

   private static String invoke_6(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      return CONST_E_2 + var1;
   }

   public ü invoke_7(Object[] var1) {
      return this.ü_þ_2;
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/String
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Object
      // 19: astore 5
      // 1b: pop
      // 1c: lload 2
      // 1d: dup2
      // 1e: ldc2_w 0
      // 21: lxor
      // 22: lstore 6
      // 24: pop2
      // 25: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 28: istore 8
      // 2a: aload 0
      // 2b: getfield rip/breeze/inject/ü.ü_þ_2 Lrip/breeze/inject/ü;
      // 2e: iload 8
      // 30: ifeq 48
      // 33: ifnull 68
      // 36: goto 3d
      // 39: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield rip/breeze/inject/ü.ü_þ_2 Lrip/breeze/inject/ü;
      // 41: goto 48
      // 44: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 47: athrow
      // 48: lload 6
      // 4a: aload 4
      // 4c: aload 5
      // 4e: bipush 3
      // 4f: anewarray 4
      // 52: dup_x1
      // 53: swap
      // 54: bipush 2
      // 55: swap
      // 56: aastore
      // 57: dup_x1
      // 58: swap
      // 59: bipush 1
      // 5a: swap
      // 5b: aastore
      // 5c: dup_x2
      // 5d: dup_x2
      // 5e: pop
      // 5f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 62: bipush 0
      // 63: swap
      // 64: aastore
      // 65: invokevirtual rip/breeze/inject/ü.method_001 ([Ljava/lang/Object;)V
      // 68: return
      // try (26 -> 31): 32 java/lang/IllegalArgumentException
      // try (30 -> 36): 37 java/lang/IllegalArgumentException
   }

   public void invoke_2(Object[] param1) {
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
      // 15: checkcast java/lang/String
      // 18: astore 5
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast java/lang/String
      // 20: astore 6
      // 22: pop
      // 23: lload 3
      // 24: dup2
      // 25: ldc2_w 0
      // 28: lxor
      // 29: lstore 7
      // 2b: pop2
      // 2c: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 2f: istore 9
      // 31: aload 0
      // 32: getfield rip/breeze/inject/ü.ü_þ_2 Lrip/breeze/inject/ü;
      // 35: iload 9
      // 37: ifeq 4f
      // 3a: ifnull 75
      // 3d: goto 44
      // 40: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 43: athrow
      // 44: aload 0
      // 45: getfield rip/breeze/inject/ü.ü_þ_2 Lrip/breeze/inject/ü;
      // 48: goto 4f
      // 4b: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4e: athrow
      // 4f: aload 2
      // 50: lload 7
      // 52: aload 5
      // 54: aload 6
      // 56: bipush 4
      // 57: anewarray 4
      // 5a: dup_x1
      // 5b: swap
      // 5c: bipush 3
      // 5d: swap
      // 5e: aastore
      // 5f: dup_x1
      // 60: swap
      // 61: bipush 2
      // 62: swap
      // 63: aastore
      // 64: dup_x2
      // 65: dup_x2
      // 66: pop
      // 67: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a: bipush 1
      // 6b: swap
      // 6c: aastore
      // 6d: dup_x1
      // 6e: swap
      // 6f: bipush 0
      // 70: swap
      // 71: aastore
      // 72: invokevirtual rip/breeze/inject/ü.method_002 ([Ljava/lang/Object;)V
      // 75: return
      // try (31 -> 36): 37 java/lang/IllegalArgumentException
      // try (35 -> 41): 42 java/lang/IllegalArgumentException
   }

   public ü invoke_3(Object[] param1) {
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
      // 0b: checkcast java/lang/String
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 0
      // 21: lxor
      // 22: lstore 6
      // 24: pop2
      // 25: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 28: istore 8
      // 2a: aload 0
      // 2b: getfield rip/breeze/inject/ü.ü_þ_2 Lrip/breeze/inject/ü;
      // 2e: iload 8
      // 30: ifne 66
      // 33: ifnull 67
      // 36: goto 3d
      // 39: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield rip/breeze/inject/ü.ü_þ_2 Lrip/breeze/inject/ü;
      // 41: aload 2
      // 42: aload 3
      // 43: lload 6
      // 45: bipush 3
      // 46: anewarray 4
      // 49: dup_x2
      // 4a: dup_x2
      // 4b: pop
      // 4c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f: bipush 2
      // 50: swap
      // 51: aastore
      // 52: dup_x1
      // 53: swap
      // 54: bipush 1
      // 55: swap
      // 56: aastore
      // 57: dup_x1
      // 58: swap
      // 59: bipush 0
      // 5a: swap
      // 5b: aastore
      // 5c: invokevirtual rip/breeze/inject/ü.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 5f: goto 66
      // 62: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 65: athrow
      // 66: areturn
      // 67: aconst_null
      // 68: areturn
      // try (26 -> 31): 32 java/lang/IllegalArgumentException
      // try (30 -> 59): 60 java/lang/IllegalArgumentException
   }

   public ü invoke_4(Object[] param1) {
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
      // 0e: checkcast java/lang/String
      // 11: astore 4
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 0
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 20: istore 7
      // 22: aload 0
      // 23: getfield rip/breeze/inject/ü.ü_þ_2 Lrip/breeze/inject/ü;
      // 26: iload 7
      // 28: ifeq 59
      // 2b: ifnull 5a
      // 2e: goto 35
      // 31: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: aload 0
      // 36: getfield rip/breeze/inject/ü.ü_þ_2 Lrip/breeze/inject/ü;
      // 39: lload 5
      // 3b: aload 4
      // 3d: bipush 2
      // 3e: anewarray 4
      // 41: dup_x1
      // 42: swap
      // 43: bipush 1
      // 44: swap
      // 45: aastore
      // 46: dup_x2
      // 47: dup_x2
      // 48: pop
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: bipush 0
      // 4d: swap
      // 4e: aastore
      // 4f: invokevirtual rip/breeze/inject/ü.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 52: goto 59
      // 55: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 58: athrow
      // 59: areturn
      // 5a: aconst_null
      // 5b: areturn
      // try (21 -> 26): 27 java/lang/IllegalArgumentException
      // try (25 -> 48): 49 java/lang/IllegalArgumentException
   }

   public void invoke_5(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 18: istore 6
      // 1a: aload 0
      // 1b: getfield rip/breeze/inject/ü.ü_þ_2 Lrip/breeze/inject/ü;
      // 1e: iload 6
      // 20: ifne 38
      // 23: ifnull 4a
      // 26: goto 2d
      // 29: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/ü.ü_þ_2 Lrip/breeze/inject/ü;
      // 31: goto 38
      // 34: invokestatic rip/breeze/inject/ü.method_011 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: lload 4
      // 3a: bipush 1
      // 3b: anewarray 4
      // 3e: dup_x2
      // 3f: dup_x2
      // 40: pop
      // 41: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 44: bipush 0
      // 45: swap
      // 46: aastore
      // 47: invokevirtual rip/breeze/inject/ü.method_005 ([Ljava/lang/Object;)V
      // 4a: return
      // try (16 -> 21): 22 java/lang/IllegalArgumentException
      // try (20 -> 26): 27 java/lang/IllegalArgumentException
   }

   public static void execute_8(int var0) {
      int_ý_2 = var0;
   }

   public static int invoke_9() {
      return int_ý_2;
   }

   public static int invoke_10() {
      int var0 = method_009();

      try {
         return var0 == 0 ? 124 : 0;
      } catch (IllegalArgumentException var1) {
         throw method_011(var1);
      }
   }

   static {
      long var0 = 59475795775979L;
      method_008(0);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var5 = var2.doFinal("ÛÒJ®Ò\f\u0091Þþf\u0096íBFÉí>_©=\u0010\u0093\u0094Ï".getBytes("ISO-8859-1"));
      CONST_E_2 = method_012(var5).intern();
   }

   private static IllegalArgumentException invoke_11(IllegalArgumentException var0) {
      return var0;
   }

   private static String invoke_12(byte[] var0) {
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
