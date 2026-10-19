package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class Util140 {
   private static final String CONST_Ÿ;
   protected final int int_þ;
   protected Util140 dataBuilder6_ý;
   private static int int_ü;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);

   protected Util140(int var1, long var2) {
      var2 = 58736649627578L ^ var2;
      long var4 = var2 ^ 134598670346196L;
      this(var4, var1, null);
   }

   protected Util140(long param1, int param3, Util140 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/inject/Util140.58736649627578L J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 118116817600314
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 26229233899514
      // 012: lxor
      // 013: lstore 7
      // 015: pop2
      // 016: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 019: aload 0
      // 01a: invokespecial java/lang/Object.<init> ()V
      // 01d: istore 9
      // 01f: iload 3
      // 020: ldc 589824
      // 022: iload 9
      // 024: ifeq 0f7
      // 027: if_icmpeq 0f4
      // 02a: goto 031
      // 02d: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 030: athrow
      // 031: iload 3
      // 032: ldc 524288
      // 034: iload 9
      // 036: ifeq 0f7
      // 039: goto 040
      // 03c: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03f: athrow
      // 040: if_icmpeq 0f4
      // 043: goto 04a
      // 046: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 049: athrow
      // 04a: iload 3
      // 04b: ldc 458752
      // 04d: iload 9
      // 04f: ifeq 0f7
      // 052: goto 059
      // 055: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 058: athrow
      // 059: if_icmpeq 0f4
      // 05c: goto 063
      // 05f: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 062: athrow
      // 063: iload 3
      // 064: ldc 393216
      // 066: iload 9
      // 068: ifeq 0f7
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 071: athrow
      // 072: if_icmpeq 0f4
      // 075: goto 07c
      // 078: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07b: athrow
      // 07c: iload 3
      // 07d: ldc 327680
      // 07f: iload 9
      // 081: ifeq 0f7
      // 084: goto 08b
      // 087: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08a: athrow
      // 08b: if_icmpeq 0f4
      // 08e: goto 095
      // 091: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 094: athrow
      // 095: iload 3
      // 096: ldc 262144
      // 098: iload 9
      // 09a: ifeq 0f7
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: if_icmpeq 0f4
      // 0a7: goto 0ae
      // 0aa: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: iload 3
      // 0af: ldc 17432576
      // 0b1: lload 1
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: iflt 0f7
      // 0b7: iload 9
      // 0b9: ifeq 0f7
      // 0bc: goto 0c3
      // 0bf: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: if_icmpeq 0f4
      // 0c6: goto 0cd
      // 0c9: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cc: athrow
      // 0cd: new java/lang/IllegalArgumentException
      // 0d0: dup
      // 0d1: lload 7
      // 0d3: iload 3
      // 0d4: bipush 2
      // 0d5: anewarray 4
      // 0d8: dup_x1
      // 0d9: swap
      // 0da: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0dd: bipush 1
      // 0de: swap
      // 0df: aastore
      // 0e0: dup_x2
      // 0e1: dup_x2
      // 0e2: pop
      // 0e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e6: bipush 0
      // 0e7: swap
      // 0e8: aastore
      // 0e9: invokestatic rip/breeze/inject/Util140.buildString ([Ljava/lang/Object;)Ljava/lang/String;
      // 0ec: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ef: athrow
      // 0f0: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 115: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 3
      // 11b: putfield rip/breeze/inject/Util140.int_þ I
      // 11e: aload 0
      // 11f: aload 4
      // 121: putfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
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

   private static String buildString(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      var1 = 58736649627578L ^ var1;
      return buildString_3(50, 5684252850281819862L ^ var1) + var3;
   }

   public Util140 getDataBuilder6(Object[] var1) {
      return this.dataBuilder6_ý;
   }

   public void processAll(Object[] param1) {
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
      // 15: checkcast java/lang/Integer
      // 18: invokevirtual java/lang/Integer.intValue ()I
      // 1b: istore 5
      // 1d: pop
      // 1e: lload 3
      // 1f: dup2
      // 20: ldc2_w 0
      // 23: lxor
      // 24: lstore 6
      // 26: pop2
      // 27: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 2a: istore 8
      // 2c: aload 0
      // 2d: iload 8
      // 2f: ifeq 5c
      // 32: getfield rip/breeze/inject/Util140.int_þ I
      // 35: ldc 327680
      // 37: if_icmpge 58
      // 3a: goto 41
      // 3d: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40: athrow
      // 41: new java/lang/UnsupportedOperationException
      // 44: dup
      // 45: sipush 13596
      // 48: ldc2_w 4021237822007289891
      // 4b: lload 3
      // 4c: lxor
      // 4d: invokestatic rip/breeze/inject/Util140.buildString_3 (IJ)Ljava/lang/String;
      // 50: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 53: athrow
      // 54: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 57: athrow
      // 58: aload 0
      // 59: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 5c: iload 8
      // 5e: ifeq 76
      // 61: ifnull 98
      // 64: goto 6b
      // 67: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 6f: goto 76
      // 72: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 75: athrow
      // 76: aload 2
      // 77: lload 6
      // 79: iload 5
      // 7b: bipush 3
      // 7c: anewarray 4
      // 7f: dup_x1
      // 80: swap
      // 81: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 84: bipush 2
      // 85: swap
      // 86: aastore
      // 87: dup_x2
      // 88: dup_x2
      // 89: pop
      // 8a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8d: bipush 1
      // 8e: swap
      // 8f: aastore
      // 90: dup_x1
      // 91: swap
      // 92: bipush 0
      // 93: swap
      // 94: aastore
      // 95: invokevirtual rip/breeze/inject/Util140.processAll ([Ljava/lang/Object;)V
      // 98: return
      // try (27 -> 33): 34 java/lang/IllegalArgumentException
      // try (30 -> 45): 45 java/lang/IllegalArgumentException
      // try (49 -> 52): 53 java/lang/IllegalArgumentException
      // try (51 -> 57): 58 java/lang/IllegalArgumentException
   }

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
      // 1b: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 1e: iload 6
      // 20: ifne 38
      // 23: ifnull 4b
      // 26: goto 2d
      // 29: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 31: goto 38
      // 34: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 47: invokevirtual rip/breeze/inject/Util140.getÜ ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 4a: areturn
      // 4b: aconst_null
      // 4c: areturn
      // try (16 -> 21): 22 java/lang/IllegalArgumentException
      // try (20 -> 26): 27 java/lang/IllegalArgumentException
   }

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
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Boolean
      // 0e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11: istore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Long
      // 18: invokevirtual java/lang/Long.longValue ()J
      // 1b: lstore 4
      // 1d: pop
      // 1e: lload 4
      // 20: dup2
      // 21: ldc2_w 0
      // 24: lxor
      // 25: lstore 6
      // 27: pop2
      // 28: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 2b: istore 8
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 31: iload 8
      // 33: ifne 4b
      // 36: ifnull 6d
      // 39: goto 40
      // 3c: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 44: goto 4b
      // 47: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: aload 2
      // 4c: iload 3
      // 4d: lload 6
      // 4f: bipush 3
      // 50: anewarray 4
      // 53: dup_x2
      // 54: dup_x2
      // 55: pop
      // 56: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59: bipush 2
      // 5a: swap
      // 5b: aastore
      // 5c: dup_x1
      // 5d: swap
      // 5e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 61: bipush 1
      // 62: swap
      // 63: aastore
      // 64: dup_x1
      // 65: swap
      // 66: bipush 0
      // 67: swap
      // 68: aastore
      // 69: invokevirtual rip/breeze/inject/Util140.getÜ_2 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 6c: areturn
      // 6d: aconst_null
      // 6e: areturn
      // try (27 -> 32): 33 java/lang/IllegalArgumentException
      // try (31 -> 37): 38 java/lang/IllegalArgumentException
   }

   public ü getÜ_3(Object[] param1) {
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
      // 0e: checkcast rip/breeze/inject/և
      // 11: astore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/String
      // 18: astore 4
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast java/lang/Long
      // 20: invokevirtual java/lang/Long.longValue ()J
      // 23: lstore 5
      // 25: dup
      // 26: bipush 4
      // 27: aaload
      // 28: checkcast java/lang/Boolean
      // 2b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2e: istore 7
      // 30: pop
      // 31: lload 5
      // 33: dup2
      // 34: ldc2_w 0
      // 37: lxor
      // 38: lstore 8
      // 3a: pop2
      // 3b: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 3e: istore 10
      // 40: aload 0
      // 41: iload 10
      // 43: ifeq 71
      // 46: getfield rip/breeze/inject/Util140.int_þ I
      // 49: ldc 327680
      // 4b: if_icmpge 6d
      // 4e: goto 55
      // 51: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 54: athrow
      // 55: new java/lang/UnsupportedOperationException
      // 58: dup
      // 59: sipush 13596
      // 5c: ldc2_w 4021281526105279409
      // 5f: lload 5
      // 61: lxor
      // 62: invokestatic rip/breeze/inject/Util140.buildString_3 (IJ)Ljava/lang/String;
      // 65: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 68: athrow
      // 69: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 71: iload 10
      // 73: lload 5
      // 75: lconst_0
      // 76: lcmp
      // 77: iflt 93
      // 7a: ifeq 92
      // 7d: ifnull c5
      // 80: goto 87
      // 83: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 86: athrow
      // 87: aload 0
      // 88: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 8b: goto 92
      // 8e: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 91: athrow
      // 92: iload 2
      // 93: aload 3
      // 94: aload 4
      // 96: lload 8
      // 98: iload 7
      // 9a: bipush 5
      // 9b: anewarray 4
      // 9e: dup_x1
      // 9f: swap
      // a0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // a3: bipush 4
      // a4: swap
      // a5: aastore
      // a6: dup_x2
      // a7: dup_x2
      // a8: pop
      // a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // ac: bipush 3
      // ad: swap
      // ae: aastore
      // af: dup_x1
      // b0: swap
      // b1: bipush 2
      // b2: swap
      // b3: aastore
      // b4: dup_x1
      // b5: swap
      // b6: bipush 1
      // b7: swap
      // b8: aastore
      // b9: dup_x1
      // ba: swap
      // bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // be: bipush 0
      // bf: swap
      // c0: aastore
      // c1: invokevirtual rip/breeze/inject/Util140.getÜ_3 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // c4: areturn
      // c5: aconst_null
      // c6: areturn
      // try (38 -> 44): 45 java/lang/IllegalArgumentException
      // try (41 -> 56): 56 java/lang/IllegalArgumentException
      // try (60 -> 67): 68 java/lang/IllegalArgumentException
      // try (66 -> 72): 73 java/lang/IllegalArgumentException
   }

   public void processAll_2(Object[] param1) {
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
      // 19: checkcast java/lang/Boolean
      // 1c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1f: istore 5
      // 21: pop
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 0
      // 27: lxor
      // 28: lstore 6
      // 2a: pop2
      // 2b: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 2e: istore 8
      // 30: aload 0
      // 31: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 34: iload 8
      // 36: ifeq 4e
      // 39: ifnull 74
      // 3c: goto 43
      // 3f: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: aload 0
      // 44: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 47: goto 4e
      // 4a: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: lload 6
      // 50: iload 4
      // 52: iload 5
      // 54: bipush 3
      // 55: anewarray 4
      // 58: dup_x1
      // 59: swap
      // 5a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5d: bipush 2
      // 5e: swap
      // 5f: aastore
      // 60: dup_x1
      // 61: swap
      // 62: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 65: bipush 1
      // 66: swap
      // 67: aastore
      // 68: dup_x2
      // 69: dup_x2
      // 6a: pop
      // 6b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e: bipush 0
      // 6f: swap
      // 70: aastore
      // 71: invokevirtual rip/breeze/inject/Util140.processAll_2 ([Ljava/lang/Object;)V
      // 74: return
      // try (28 -> 33): 34 java/lang/IllegalArgumentException
      // try (32 -> 38): 39 java/lang/IllegalArgumentException
   }

   public ü getÜ_4(Object[] param1) {
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
      // 0e: checkcast java/lang/String
      // 11: astore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Long
      // 18: invokevirtual java/lang/Long.longValue ()J
      // 1b: lstore 4
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/Boolean
      // 23: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 26: istore 6
      // 28: pop
      // 29: lload 4
      // 2b: dup2
      // 2c: ldc2_w 0
      // 2f: lxor
      // 30: lstore 7
      // 32: pop2
      // 33: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 36: istore 9
      // 38: aload 0
      // 39: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 3c: iload 9
      // 3e: ifeq 56
      // 41: ifnull 82
      // 44: goto 4b
      // 47: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 4f: goto 56
      // 52: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 55: athrow
      // 56: iload 2
      // 57: aload 3
      // 58: lload 7
      // 5a: iload 6
      // 5c: bipush 4
      // 5d: anewarray 4
      // 60: dup_x1
      // 61: swap
      // 62: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 65: bipush 3
      // 66: swap
      // 67: aastore
      // 68: dup_x2
      // 69: dup_x2
      // 6a: pop
      // 6b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e: bipush 2
      // 6f: swap
      // 70: aastore
      // 71: dup_x1
      // 72: swap
      // 73: bipush 1
      // 74: swap
      // 75: aastore
      // 76: dup_x1
      // 77: swap
      // 78: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: invokevirtual rip/breeze/inject/Util140.getÜ_4 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 81: areturn
      // 82: aconst_null
      // 83: areturn
      // try (33 -> 38): 39 java/lang/IllegalArgumentException
      // try (37 -> 43): 44 java/lang/IllegalArgumentException
   }

   public void processAll_3(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/õ
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 0
      // 18: lxor
      // 19: lstore 5
      // 1b: pop2
      // 1c: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 1f: istore 7
      // 21: aload 0
      // 22: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 25: iload 7
      // 27: ifeq 3f
      // 2a: ifnull 57
      // 2d: goto 34
      // 30: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: aload 0
      // 35: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e: athrow
      // 3f: aload 2
      // 40: lload 5
      // 42: bipush 2
      // 43: anewarray 4
      // 46: dup_x2
      // 47: dup_x2
      // 48: pop
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: bipush 1
      // 4d: swap
      // 4e: aastore
      // 4f: dup_x1
      // 50: swap
      // 51: bipush 0
      // 52: swap
      // 53: aastore
      // 54: invokevirtual rip/breeze/inject/Util140.processAll_3 ([Ljava/lang/Object;)V
      // 57: return
      // try (21 -> 26): 27 java/lang/IllegalArgumentException
      // try (25 -> 31): 32 java/lang/IllegalArgumentException
   }

   public void processAll_4(Object[] param1) {
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
      // 15: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 18: istore 6
      // 1a: aload 0
      // 1b: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 1e: iload 6
      // 20: ifeq 38
      // 23: ifnull 4a
      // 26: goto 2d
      // 29: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 31: goto 38
      // 34: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 47: invokevirtual rip/breeze/inject/Util140.processAll_4 ([Ljava/lang/Object;)V
      // 4a: return
      // try (16 -> 21): 22 java/lang/IllegalArgumentException
      // try (20 -> 26): 27 java/lang/IllegalArgumentException
   }

   public void processAll_5(Object[] param1) {
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
      // 18: checkcast java/lang/Integer
      // 1b: invokevirtual java/lang/Integer.intValue ()I
      // 1e: istore 5
      // 20: dup
      // 21: bipush 3
      // 22: aaload
      // 23: checkcast [Ljava/lang/Object;
      // 26: astore 6
      // 28: dup
      // 29: bipush 4
      // 2a: aaload
      // 2b: checkcast java/lang/Integer
      // 2e: invokevirtual java/lang/Integer.intValue ()I
      // 31: istore 7
      // 33: dup
      // 34: bipush 5
      // 35: aaload
      // 36: checkcast [Ljava/lang/Object;
      // 39: astore 8
      // 3b: pop
      // 3c: lload 3
      // 3d: dup2
      // 3e: ldc2_w 0
      // 41: lxor
      // 42: lstore 9
      // 44: pop2
      // 45: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 48: istore 11
      // 4a: aload 0
      // 4b: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 4e: iload 11
      // 50: ifne 68
      // 53: ifnull a6
      // 56: goto 5d
      // 59: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 61: goto 68
      // 64: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 67: athrow
      // 68: iload 2
      // 69: lload 9
      // 6b: iload 5
      // 6d: aload 6
      // 6f: iload 7
      // 71: aload 8
      // 73: bipush 6
      // 75: anewarray 4
      // 78: dup_x1
      // 79: swap
      // 7a: bipush 5
      // 7b: swap
      // 7c: aastore
      // 7d: dup_x1
      // 7e: swap
      // 7f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 82: bipush 4
      // 83: swap
      // 84: aastore
      // 85: dup_x1
      // 86: swap
      // 87: bipush 3
      // 88: swap
      // 89: aastore
      // 8a: dup_x1
      // 8b: swap
      // 8c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8f: bipush 2
      // 90: swap
      // 91: aastore
      // 92: dup_x2
      // 93: dup_x2
      // 94: pop
      // 95: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 98: bipush 1
      // 99: swap
      // 9a: aastore
      // 9b: dup_x1
      // 9c: swap
      // 9d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a0: bipush 0
      // a1: swap
      // a2: aastore
      // a3: invokevirtual rip/breeze/inject/Util140.processAll_5 ([Ljava/lang/Object;)V
      // a6: return
      // try (44 -> 49): 50 java/lang/IllegalArgumentException
      // try (48 -> 54): 55 java/lang/IllegalArgumentException
   }

   public void processAll_6(Object[] param1) {
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
      // 16: lload 3
      // 17: dup2
      // 18: ldc2_w 0
      // 1b: lxor
      // 1c: lstore 5
      // 1e: pop2
      // 1f: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 22: istore 7
      // 24: aload 0
      // 25: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 28: iload 7
      // 2a: ifne 42
      // 2d: ifnull 5d
      // 30: goto 37
      // 33: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: aload 0
      // 38: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 3b: goto 42
      // 3e: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41: athrow
      // 42: iload 2
      // 43: lload 5
      // 45: bipush 2
      // 46: anewarray 4
      // 49: dup_x2
      // 4a: dup_x2
      // 4b: pop
      // 4c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f: bipush 1
      // 50: swap
      // 51: aastore
      // 52: dup_x1
      // 53: swap
      // 54: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 57: bipush 0
      // 58: swap
      // 59: aastore
      // 5a: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 5d: return
      // try (22 -> 27): 28 java/lang/IllegalArgumentException
      // try (26 -> 32): 33 java/lang/IllegalArgumentException
   }

   public void processAll_7(Object[] param1) {
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
      // 18: checkcast java/lang/Integer
      // 1b: invokevirtual java/lang/Integer.intValue ()I
      // 1e: istore 5
      // 20: pop
      // 21: lload 3
      // 22: dup2
      // 23: ldc2_w 0
      // 26: lxor
      // 27: lstore 6
      // 29: pop2
      // 2a: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 2d: istore 8
      // 2f: aload 0
      // 30: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 33: iload 8
      // 35: ifne 4d
      // 38: ifnull 72
      // 3b: goto 42
      // 3e: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41: athrow
      // 42: aload 0
      // 43: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 46: goto 4d
      // 49: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4c: athrow
      // 4d: iload 2
      // 4e: lload 6
      // 50: iload 5
      // 52: bipush 3
      // 53: anewarray 4
      // 56: dup_x1
      // 57: swap
      // 58: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5b: bipush 2
      // 5c: swap
      // 5d: aastore
      // 5e: dup_x2
      // 5f: dup_x2
      // 60: pop
      // 61: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 64: bipush 1
      // 65: swap
      // 66: aastore
      // 67: dup_x1
      // 68: swap
      // 69: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6c: bipush 0
      // 6d: swap
      // 6e: aastore
      // 6f: invokevirtual rip/breeze/inject/Util140.processAll_7 ([Ljava/lang/Object;)V
      // 72: return
      // try (28 -> 33): 34 java/lang/IllegalArgumentException
      // try (32 -> 38): 39 java/lang/IllegalArgumentException
   }

   public void processAll_8(Object[] param1) {
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
      // 21: pop
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 0
      // 27: lxor
      // 28: lstore 6
      // 2a: pop2
      // 2b: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 2e: istore 8
      // 30: aload 0
      // 31: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 34: iload 8
      // 36: ifne 4e
      // 39: ifnull 74
      // 3c: goto 43
      // 3f: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: aload 0
      // 44: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 47: goto 4e
      // 4a: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: lload 6
      // 50: iload 4
      // 52: iload 5
      // 54: bipush 3
      // 55: anewarray 4
      // 58: dup_x1
      // 59: swap
      // 5a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5d: bipush 2
      // 5e: swap
      // 5f: aastore
      // 60: dup_x1
      // 61: swap
      // 62: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 65: bipush 1
      // 66: swap
      // 67: aastore
      // 68: dup_x2
      // 69: dup_x2
      // 6a: pop
      // 6b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e: bipush 0
      // 6f: swap
      // 70: aastore
      // 71: invokevirtual rip/breeze/inject/Util140.processAll_8 ([Ljava/lang/Object;)V
      // 74: return
      // try (28 -> 33): 34 java/lang/IllegalArgumentException
      // try (32 -> 38): 39 java/lang/IllegalArgumentException
   }

   public void processAll_9(Object[] param1) {
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
      // 18: checkcast java/lang/String
      // 1b: astore 5
      // 1d: pop
      // 1e: lload 3
      // 1f: dup2
      // 20: ldc2_w 0
      // 23: lxor
      // 24: lstore 6
      // 26: pop2
      // 27: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 2a: istore 8
      // 2c: aload 0
      // 2d: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 30: iload 8
      // 32: ifeq 4a
      // 35: ifnull 6c
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 43: goto 4a
      // 46: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 49: athrow
      // 4a: iload 2
      // 4b: lload 6
      // 4d: aload 5
      // 4f: bipush 3
      // 50: anewarray 4
      // 53: dup_x1
      // 54: swap
      // 55: bipush 2
      // 56: swap
      // 57: aastore
      // 58: dup_x2
      // 59: dup_x2
      // 5a: pop
      // 5b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e: bipush 1
      // 5f: swap
      // 60: aastore
      // 61: dup_x1
      // 62: swap
      // 63: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 66: bipush 0
      // 67: swap
      // 68: aastore
      // 69: invokevirtual rip/breeze/inject/Util140.processAll_9 ([Ljava/lang/Object;)V
      // 6c: return
      // try (27 -> 32): 33 java/lang/IllegalArgumentException
      // try (31 -> 37): 38 java/lang/IllegalArgumentException
   }

   public void processAll_10(Object[] param1) {
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
      // 18: checkcast java/lang/String
      // 1b: astore 5
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/String
      // 23: astore 6
      // 25: dup
      // 26: bipush 4
      // 27: aaload
      // 28: checkcast java/lang/String
      // 2b: astore 7
      // 2d: pop
      // 2e: lload 3
      // 2f: dup2
      // 30: ldc2_w 0
      // 33: lxor
      // 34: lstore 8
      // 36: pop2
      // 37: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 3a: istore 10
      // 3c: aload 0
      // 3d: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 40: iload 10
      // 42: ifne 5a
      // 45: ifnull 8a
      // 48: goto 4f
      // 4b: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 53: goto 5a
      // 56: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 59: athrow
      // 5a: iload 2
      // 5b: lload 8
      // 5d: aload 5
      // 5f: aload 6
      // 61: aload 7
      // 63: bipush 5
      // 64: anewarray 4
      // 67: dup_x1
      // 68: swap
      // 69: bipush 4
      // 6a: swap
      // 6b: aastore
      // 6c: dup_x1
      // 6d: swap
      // 6e: bipush 3
      // 6f: swap
      // 70: aastore
      // 71: dup_x1
      // 72: swap
      // 73: bipush 2
      // 74: swap
      // 75: aastore
      // 76: dup_x2
      // 77: dup_x2
      // 78: pop
      // 79: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7c: bipush 1
      // 7d: swap
      // 7e: aastore
      // 7f: dup_x1
      // 80: swap
      // 81: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 84: bipush 0
      // 85: swap
      // 86: aastore
      // 87: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 8a: return
      // try (37 -> 42): 43 java/lang/IllegalArgumentException
      // try (41 -> 47): 48 java/lang/IllegalArgumentException
   }

   @Deprecated
   public void processAll_11(Object[] param1) {
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
      // 18: checkcast java/lang/String
      // 1b: astore 5
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/String
      // 23: astore 6
      // 25: dup
      // 26: bipush 4
      // 27: aaload
      // 28: checkcast java/lang/String
      // 2b: astore 7
      // 2d: pop
      // 2e: getstatic rip/breeze/inject/Util140.58736649627578L J
      // 31: lload 3
      // 32: lxor
      // 33: lstore 3
      // 34: lload 3
      // 35: dup2
      // 36: ldc2_w 70638270723206
      // 39: lxor
      // 3a: lstore 8
      // 3c: pop2
      // 3d: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 40: istore 10
      // 42: iload 2
      // 43: aload 0
      // 44: getfield rip/breeze/inject/Util140.int_þ I
      // 47: iload 10
      // 49: ifne 62
      // 4c: ldc 327680
      // 4e: if_icmpge 65
      // 51: goto 58
      // 54: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 57: athrow
      // 58: sipush 256
      // 5b: goto 62
      // 5e: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 61: athrow
      // 62: goto 66
      // 65: bipush 0
      // 66: ior
      // 67: istore 11
      // 69: aload 0
      // 6a: iload 11
      // 6c: aload 5
      // 6e: aload 6
      // 70: aload 7
      // 72: iload 2
      // 73: iload 10
      // 75: lload 3
      // 76: lconst_0
      // 77: lcmp
      // 78: ifle 81
      // 7b: ifne 93
      // 7e: sipush 185
      // 81: if_icmpne 96
      // 84: goto 8b
      // 87: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8a: athrow
      // 8b: bipush 1
      // 8c: goto 93
      // 8f: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 92: athrow
      // 93: goto 97
      // 96: bipush 0
      // 97: istore 12
      // 99: astore 13
      // 9b: astore 14
      // 9d: astore 15
      // 9f: istore 16
      // a1: lload 8
      // a3: iload 16
      // a5: aload 15
      // a7: aload 14
      // a9: aload 13
      // ab: iload 12
      // ad: bipush 6
      // af: anewarray 4
      // b2: dup_x1
      // b3: swap
      // b4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // b7: bipush 5
      // b8: swap
      // b9: aastore
      // ba: dup_x1
      // bb: swap
      // bc: bipush 4
      // bd: swap
      // be: aastore
      // bf: dup_x1
      // c0: swap
      // c1: bipush 3
      // c2: swap
      // c3: aastore
      // c4: dup_x1
      // c5: swap
      // c6: bipush 2
      // c7: swap
      // c8: aastore
      // c9: dup_x1
      // ca: swap
      // cb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ce: bipush 1
      // cf: swap
      // d0: aastore
      // d1: dup_x2
      // d2: dup_x2
      // d3: pop
      // d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d7: bipush 0
      // d8: swap
      // d9: aastore
      // da: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // dd: return
      // try (41 -> 48): 49 java/lang/IllegalArgumentException
      // try (46 -> 52): 53 java/lang/IllegalArgumentException
      // try (59 -> 73): 74 java/lang/IllegalArgumentException
      // try (71 -> 77): 78 java/lang/IllegalArgumentException
   }

   public void processAll_12(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/String
      // 01c: astore 5
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/String
      // 024: astore 6
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast java/lang/String
      // 02c: astore 7
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/lang/Boolean
      // 034: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 037: istore 8
      // 039: pop
      // 03a: lload 2
      // 03b: dup2
      // 03c: ldc2_w 0
      // 03f: lxor
      // 040: lstore 9
      // 042: dup2
      // 043: ldc2_w 129009814491964
      // 046: lxor
      // 047: lstore 11
      // 049: pop2
      // 04a: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 04d: istore 13
      // 04f: aload 0
      // 050: iload 13
      // 052: ifne 0ff
      // 055: getfield rip/breeze/inject/Util140.int_þ I
      // 058: ldc 327680
      // 05a: if_icmpge 0fb
      // 05d: goto 064
      // 060: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 063: athrow
      // 064: iload 4
      // 066: sipush 256
      // 069: iand
      // 06a: iload 13
      // 06c: lload 2
      // 06d: lconst_0
      // 06e: lcmp
      // 06f: ifle 08a
      // 072: ifne 088
      // 075: goto 07c
      // 078: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07b: athrow
      // 07c: ifne 0fb
      // 07f: goto 086
      // 082: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 085: athrow
      // 086: iload 8
      // 088: iload 4
      // 08a: iload 13
      // 08c: lload 2
      // 08d: lconst_0
      // 08e: lcmp
      // 08f: ifle 098
      // 092: ifne 0aa
      // 095: sipush 185
      // 098: if_icmpne 0ad
      // 09b: goto 0a2
      // 09e: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a1: athrow
      // 0a2: bipush 1
      // 0a3: goto 0aa
      // 0a6: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a9: athrow
      // 0aa: goto 0ae
      // 0ad: bipush 0
      // 0ae: if_icmpeq 0c8
      // 0b1: new java/lang/UnsupportedOperationException
      // 0b4: dup
      // 0b5: sipush 5006
      // 0b8: ldc2_w 6080553387808317426
      // 0bb: lload 2
      // 0bc: lxor
      // 0bd: invokestatic rip/breeze/inject/Util140.buildString_3 (IJ)Ljava/lang/String;
      // 0c0: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 0c3: athrow
      // 0c4: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: iload 4
      // 0cb: lload 11
      // 0cd: aload 5
      // 0cf: aload 6
      // 0d1: aload 7
      // 0d3: bipush 5
      // 0d4: anewarray 4
      // 0d7: dup_x1
      // 0d8: swap
      // 0d9: bipush 4
      // 0da: swap
      // 0db: aastore
      // 0dc: dup_x1
      // 0dd: swap
      // 0de: bipush 3
      // 0df: swap
      // 0e0: aastore
      // 0e1: dup_x1
      // 0e2: swap
      // 0e3: bipush 2
      // 0e4: swap
      // 0e5: aastore
      // 0e6: dup_x2
      // 0e7: dup_x2
      // 0e8: pop
      // 0e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ec: bipush 1
      // 0ed: swap
      // 0ee: aastore
      // 0ef: dup_x1
      // 0f0: swap
      // 0f1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f4: bipush 0
      // 0f5: swap
      // 0f6: aastore
      // 0f7: invokevirtual rip/breeze/inject/Util140.processAll_11 ([Ljava/lang/Object;)V
      // 0fa: return
      // 0fb: aload 0
      // 0fc: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 0ff: iload 13
      // 101: lload 2
      // 102: lconst_0
      // 103: lcmp
      // 104: ifle 125
      // 107: ifne 11f
      // 10a: ifnull 161
      // 10d: goto 114
      // 110: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 113: athrow
      // 114: aload 0
      // 115: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 118: goto 11f
      // 11b: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11e: athrow
      // 11f: iload 4
      // 121: sipush -257
      // 124: iand
      // 125: lload 9
      // 127: dup2_x1
      // 128: pop2
      // 129: aload 5
      // 12b: aload 6
      // 12d: aload 7
      // 12f: iload 8
      // 131: bipush 6
      // 133: anewarray 4
      // 136: dup_x1
      // 137: swap
      // 138: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 13b: bipush 5
      // 13c: swap
      // 13d: aastore
      // 13e: dup_x1
      // 13f: swap
      // 140: bipush 4
      // 141: swap
      // 142: aastore
      // 143: dup_x1
      // 144: swap
      // 145: bipush 3
      // 146: swap
      // 147: aastore
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 2
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 152: bipush 1
      // 153: swap
      // 154: aastore
      // 155: dup_x2
      // 156: dup_x2
      // 157: pop
      // 158: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15b: bipush 0
      // 15c: swap
      // 15d: aastore
      // 15e: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 161: return
      // try (47 -> 53): 54 java/lang/IllegalArgumentException
      // try (50 -> 65): 66 java/lang/IllegalArgumentException
      // try (56 -> 69): 70 java/lang/IllegalArgumentException
      // try (73 -> 82): 83 java/lang/IllegalArgumentException
      // try (80 -> 86): 87 java/lang/IllegalArgumentException
      // try (91 -> 101): 101 java/lang/IllegalArgumentException
      // try (143 -> 150): 151 java/lang/IllegalArgumentException
      // try (149 -> 155): 156 java/lang/IllegalArgumentException
   }

   public void processAll_13(Object... param1) {
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
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast rip/breeze/inject/º
      // 20: astore 6
      // 22: dup
      // 23: bipush 4
      // 24: aaload
      // 25: checkcast [Ljava/lang/Object;
      // 28: astore 7
      // 2a: pop
      // 2b: lload 4
      // 2d: dup2
      // 2e: ldc2_w 0
      // 31: lxor
      // 32: lstore 8
      // 34: pop2
      // 35: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 38: istore 10
      // 3a: aload 0
      // 3b: iload 10
      // 3d: ifeq 6b
      // 40: getfield rip/breeze/inject/Util140.int_þ I
      // 43: ldc 327680
      // 45: if_icmpge 67
      // 48: goto 4f
      // 4b: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4e: athrow
      // 4f: new java/lang/UnsupportedOperationException
      // 52: dup
      // 53: sipush 13596
      // 56: ldc2_w 4021283425049261838
      // 59: lload 4
      // 5b: lxor
      // 5c: invokestatic rip/breeze/inject/Util140.buildString_3 (IJ)Ljava/lang/String;
      // 5f: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 62: athrow
      // 63: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 66: athrow
      // 67: aload 0
      // 68: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 6b: iload 10
      // 6d: ifeq 85
      // 70: ifnull b1
      // 73: goto 7a
      // 76: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 7e: goto 85
      // 81: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 84: athrow
      // 85: aload 2
      // 86: aload 3
      // 87: lload 8
      // 89: aload 6
      // 8b: aload 7
      // 8d: bipush 5
      // 8e: anewarray 4
      // 91: dup_x1
      // 92: swap
      // 93: bipush 4
      // 94: swap
      // 95: aastore
      // 96: dup_x1
      // 97: swap
      // 98: bipush 3
      // 99: swap
      // 9a: aastore
      // 9b: dup_x2
      // 9c: dup_x2
      // 9d: pop
      // 9e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a1: bipush 2
      // a2: swap
      // a3: aastore
      // a4: dup_x1
      // a5: swap
      // a6: bipush 1
      // a7: swap
      // a8: aastore
      // a9: dup_x1
      // aa: swap
      // ab: bipush 0
      // ac: swap
      // ad: aastore
      // ae: invokevirtual rip/breeze/inject/Util140.processAll_13 ([Ljava/lang/Object;)V
      // b1: return
      // try (36 -> 42): 43 java/lang/IllegalArgumentException
      // try (39 -> 54): 54 java/lang/IllegalArgumentException
      // try (58 -> 61): 62 java/lang/IllegalArgumentException
      // try (60 -> 66): 67 java/lang/IllegalArgumentException
   }

   public void processAll_14(Object[] param1) {
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
      // 19: checkcast rip/breeze/inject/ª
      // 1c: astore 5
      // 1e: pop
      // 1f: lload 2
      // 20: dup2
      // 21: ldc2_w 0
      // 24: lxor
      // 25: lstore 6
      // 27: pop2
      // 28: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 2b: istore 8
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 31: iload 8
      // 33: ifne 4b
      // 36: ifnull 6e
      // 39: goto 40
      // 3c: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 44: goto 4b
      // 47: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: lload 6
      // 4d: iload 4
      // 4f: aload 5
      // 51: bipush 3
      // 52: anewarray 4
      // 55: dup_x1
      // 56: swap
      // 57: bipush 2
      // 58: swap
      // 59: aastore
      // 5a: dup_x1
      // 5b: swap
      // 5c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5f: bipush 1
      // 60: swap
      // 61: aastore
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: invokevirtual rip/breeze/inject/Util140.processAll_14 ([Ljava/lang/Object;)V
      // 6e: return
      // try (27 -> 32): 33 java/lang/IllegalArgumentException
      // try (31 -> 37): 38 java/lang/IllegalArgumentException
   }

   public void processAll_15(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/ª
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 0
      // 18: lxor
      // 19: lstore 5
      // 1b: pop2
      // 1c: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 1f: istore 7
      // 21: aload 0
      // 22: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 25: iload 7
      // 27: ifne 3f
      // 2a: ifnull 57
      // 2d: goto 34
      // 30: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: aload 0
      // 35: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e: athrow
      // 3f: aload 2
      // 40: lload 5
      // 42: bipush 2
      // 43: anewarray 4
      // 46: dup_x2
      // 47: dup_x2
      // 48: pop
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: bipush 1
      // 4d: swap
      // 4e: aastore
      // 4f: dup_x1
      // 50: swap
      // 51: bipush 0
      // 52: swap
      // 53: aastore
      // 54: invokevirtual rip/breeze/inject/Util140.processAll_15 ([Ljava/lang/Object;)V
      // 57: return
      // try (21 -> 26): 27 java/lang/IllegalArgumentException
      // try (25 -> 31): 32 java/lang/IllegalArgumentException
   }

   public void processAll_16(Object[] param1) {
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
      // 004: checkcast java/lang/Object
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 137135862909205
      // 018: lxor
      // 019: lstore 5
      // 01b: dup2
      // 01c: ldc2_w 0
      // 01f: lxor
      // 020: lstore 7
      // 022: pop2
      // 023: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 026: istore 9
      // 028: aload 0
      // 029: getfield rip/breeze/inject/Util140.int_þ I
      // 02c: ldc 327680
      // 02e: iload 9
      // 030: ifeq 0da
      // 033: if_icmpge 0c2
      // 036: goto 03d
      // 039: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03c: athrow
      // 03d: aload 2
      // 03e: instanceof rip/breeze/inject/º
      // 041: iload 9
      // 043: lload 3
      // 044: lconst_0
      // 045: lcmp
      // 046: ifle 06a
      // 049: ifeq 068
      // 04c: goto 053
      // 04f: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 052: athrow
      // 053: ifne 0ab
      // 056: goto 05d
      // 059: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05c: athrow
      // 05d: aload 2
      // 05e: instanceof rip/breeze/inject/MathUtil3
      // 061: goto 068
      // 064: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 067: athrow
      // 068: iload 9
      // 06a: ifeq 0d8
      // 06d: ifeq 0c2
      // 070: goto 077
      // 073: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 076: athrow
      // 077: aload 2
      // 078: checkcast rip/breeze/inject/MathUtil3
      // 07b: lload 5
      // 07d: bipush 1
      // 07e: anewarray 4
      // 081: dup_x2
      // 082: dup_x2
      // 083: pop
      // 084: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 087: bipush 0
      // 088: swap
      // 089: aastore
      // 08a: invokevirtual rip/breeze/inject/MathUtil3.getValue ([Ljava/lang/Object;)I
      // 08d: bipush 11
      // 08f: lload 3
      // 090: lconst_0
      // 091: lcmp
      // 092: iflt 0da
      // 095: iload 9
      // 097: ifeq 0da
      // 09a: goto 0a1
      // 09d: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a0: athrow
      // 0a1: if_icmpne 0c2
      // 0a4: goto 0ab
      // 0a7: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0aa: athrow
      // 0ab: new java/lang/UnsupportedOperationException
      // 0ae: dup
      // 0af: sipush 13596
      // 0b2: ldc2_w 4021176100292389940
      // 0b5: lload 3
      // 0b6: lxor
      // 0b7: invokestatic rip/breeze/inject/Util140.buildString_3 (IJ)Ljava/lang/String;
      // 0ba: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 0bd: athrow
      // 0be: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: iload 9
      // 0c5: lload 3
      // 0c6: lconst_0
      // 0c7: lcmp
      // 0c8: iflt 108
      // 0cb: ifeq 106
      // 0ce: getfield rip/breeze/inject/Util140.int_þ I
      // 0d1: goto 0d8
      // 0d4: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d7: athrow
      // 0d8: ldc 458752
      // 0da: if_icmpge 102
      // 0dd: aload 2
      // 0de: instanceof rip/breeze/inject/è
      // 0e1: ifeq 102
      // 0e4: goto 0eb
      // 0e7: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ea: athrow
      // 0eb: new java/lang/UnsupportedOperationException
      // 0ee: dup
      // 0ef: sipush 31006
      // 0f2: ldc2_w 8459468868938670129
      // 0f5: lload 3
      // 0f6: lxor
      // 0f7: invokestatic rip/breeze/inject/Util140.buildString_3 (IJ)Ljava/lang/String;
      // 0fa: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 0fd: athrow
      // 0fe: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 101: athrow
      // 102: aload 0
      // 103: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 106: iload 9
      // 108: ifeq 120
      // 10b: ifnull 138
      // 10e: goto 115
      // 111: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 114: athrow
      // 115: aload 0
      // 116: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 119: goto 120
      // 11c: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11f: athrow
      // 120: aload 2
      // 121: lload 7
      // 123: bipush 2
      // 124: anewarray 4
      // 127: dup_x2
      // 128: dup_x2
      // 129: pop
      // 12a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12d: bipush 1
      // 12e: swap
      // 12f: aastore
      // 130: dup_x1
      // 131: swap
      // 132: bipush 0
      // 133: swap
      // 134: aastore
      // 135: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 138: return
      // try (25 -> 31): 32 java/lang/IllegalArgumentException
      // try (30 -> 42): 43 java/lang/IllegalArgumentException
      // try (34 -> 46): 47 java/lang/IllegalArgumentException
      // try (45 -> 51): 52 java/lang/IllegalArgumentException
      // try (54 -> 57): 58 java/lang/IllegalArgumentException
      // try (56 -> 80): 81 java/lang/IllegalArgumentException
      // try (60 -> 84): 85 java/lang/IllegalArgumentException
      // try (83 -> 96): 96 java/lang/IllegalArgumentException
      // try (98 -> 106): 107 java/lang/IllegalArgumentException
      // try (110 -> 114): 115 java/lang/IllegalArgumentException
      // try (111 -> 126): 126 java/lang/IllegalArgumentException
      // try (130 -> 133): 134 java/lang/IllegalArgumentException
      // try (132 -> 138): 139 java/lang/IllegalArgumentException
   }

   public void processAll_17(Object[] param1) {
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
      // 21: pop
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 0
      // 27: lxor
      // 28: lstore 6
      // 2a: pop2
      // 2b: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 2e: istore 8
      // 30: aload 0
      // 31: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 34: iload 8
      // 36: ifeq 4e
      // 39: ifnull 74
      // 3c: goto 43
      // 3f: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: aload 0
      // 44: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 47: goto 4e
      // 4a: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: lload 6
      // 50: iload 4
      // 52: iload 5
      // 54: bipush 3
      // 55: anewarray 4
      // 58: dup_x1
      // 59: swap
      // 5a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5d: bipush 2
      // 5e: swap
      // 5f: aastore
      // 60: dup_x1
      // 61: swap
      // 62: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 65: bipush 1
      // 66: swap
      // 67: aastore
      // 68: dup_x2
      // 69: dup_x2
      // 6a: pop
      // 6b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e: bipush 0
      // 6f: swap
      // 70: aastore
      // 71: invokevirtual rip/breeze/inject/Util140.processAll_17 ([Ljava/lang/Object;)V
      // 74: return
      // try (28 -> 33): 34 java/lang/IllegalArgumentException
      // try (32 -> 38): 39 java/lang/IllegalArgumentException
   }

   public void processAll_18(Object... param1) {
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
      // 24: checkcast rip/breeze/inject/ª
      // 27: astore 6
      // 29: dup
      // 2a: bipush 4
      // 2b: aaload
      // 2c: checkcast [Lrip/breeze/inject/ª;
      // 2f: astore 7
      // 31: pop
      // 32: lload 2
      // 33: dup2
      // 34: ldc2_w 0
      // 37: lxor
      // 38: lstore 8
      // 3a: pop2
      // 3b: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 3e: istore 10
      // 40: aload 0
      // 41: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 44: iload 10
      // 46: ifne 5e
      // 49: ifnull 92
      // 4c: goto 53
      // 4f: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52: athrow
      // 53: aload 0
      // 54: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 57: goto 5e
      // 5a: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d: athrow
      // 5e: lload 8
      // 60: iload 4
      // 62: iload 5
      // 64: aload 6
      // 66: aload 7
      // 68: bipush 5
      // 69: anewarray 4
      // 6c: dup_x1
      // 6d: swap
      // 6e: bipush 4
      // 6f: swap
      // 70: aastore
      // 71: dup_x1
      // 72: swap
      // 73: bipush 3
      // 74: swap
      // 75: aastore
      // 76: dup_x1
      // 77: swap
      // 78: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7b: bipush 2
      // 7c: swap
      // 7d: aastore
      // 7e: dup_x1
      // 7f: swap
      // 80: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 83: bipush 1
      // 84: swap
      // 85: aastore
      // 86: dup_x2
      // 87: dup_x2
      // 88: pop
      // 89: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8c: bipush 0
      // 8d: swap
      // 8e: aastore
      // 8f: invokevirtual rip/breeze/inject/Util140.processAll_18 ([Ljava/lang/Object;)V
      // 92: return
      // try (38 -> 43): 44 java/lang/IllegalArgumentException
      // try (42 -> 48): 49 java/lang/IllegalArgumentException
   }

   public void processAll_19(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/ª
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast [I
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast [Lrip/breeze/inject/ª;
      // 20: astore 6
      // 22: pop
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 0
      // 29: lxor
      // 2a: lstore 7
      // 2c: pop2
      // 2d: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 30: istore 9
      // 32: aload 0
      // 33: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 36: iload 9
      // 38: ifeq 50
      // 3b: ifnull 75
      // 3e: goto 45
      // 41: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 44: athrow
      // 45: aload 0
      // 46: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 49: goto 50
      // 4c: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4f: athrow
      // 50: aload 2
      // 51: aload 3
      // 52: lload 7
      // 54: aload 6
      // 56: bipush 4
      // 57: anewarray 4
      // 5a: dup_x1
      // 5b: swap
      // 5c: bipush 3
      // 5d: swap
      // 5e: aastore
      // 5f: dup_x2
      // 60: dup_x2
      // 61: pop
      // 62: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 65: bipush 2
      // 66: swap
      // 67: aastore
      // 68: dup_x1
      // 69: swap
      // 6a: bipush 1
      // 6b: swap
      // 6c: aastore
      // 6d: dup_x1
      // 6e: swap
      // 6f: bipush 0
      // 70: swap
      // 71: aastore
      // 72: invokevirtual rip/breeze/inject/Util140.processAll_19 ([Ljava/lang/Object;)V
      // 75: return
      // try (31 -> 36): 37 java/lang/IllegalArgumentException
      // try (35 -> 41): 42 java/lang/IllegalArgumentException
   }

   public void processAll_20(Object[] param1) {
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
      // 0b: checkcast java/lang/Integer
      // 0e: invokevirtual java/lang/Integer.intValue ()I
      // 11: istore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Long
      // 18: invokevirtual java/lang/Long.longValue ()J
      // 1b: lstore 4
      // 1d: pop
      // 1e: lload 4
      // 20: dup2
      // 21: ldc2_w 0
      // 24: lxor
      // 25: lstore 6
      // 27: pop2
      // 28: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 2b: istore 8
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 31: iload 8
      // 33: ifeq 4b
      // 36: ifnull 6c
      // 39: goto 40
      // 3c: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 44: goto 4b
      // 47: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: aload 2
      // 4c: iload 3
      // 4d: lload 6
      // 4f: bipush 3
      // 50: anewarray 4
      // 53: dup_x2
      // 54: dup_x2
      // 55: pop
      // 56: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59: bipush 2
      // 5a: swap
      // 5b: aastore
      // 5c: dup_x1
      // 5d: swap
      // 5e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 61: bipush 1
      // 62: swap
      // 63: aastore
      // 64: dup_x1
      // 65: swap
      // 66: bipush 0
      // 67: swap
      // 68: aastore
      // 69: invokevirtual rip/breeze/inject/Util140.processAll_20 ([Ljava/lang/Object;)V
      // 6c: return
      // try (27 -> 32): 33 java/lang/IllegalArgumentException
      // try (31 -> 37): 38 java/lang/IllegalArgumentException
   }

   public ü getÜ_5(Object[] param1) {
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
      // 0e: checkcast rip/breeze/inject/և
      // 11: astore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/String
      // 18: astore 4
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast java/lang/Long
      // 20: invokevirtual java/lang/Long.longValue ()J
      // 23: lstore 5
      // 25: dup
      // 26: bipush 4
      // 27: aaload
      // 28: checkcast java/lang/Boolean
      // 2b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2e: istore 7
      // 30: pop
      // 31: lload 5
      // 33: dup2
      // 34: ldc2_w 0
      // 37: lxor
      // 38: lstore 8
      // 3a: pop2
      // 3b: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 3e: istore 10
      // 40: aload 0
      // 41: iload 10
      // 43: ifeq 71
      // 46: getfield rip/breeze/inject/Util140.int_þ I
      // 49: ldc 327680
      // 4b: if_icmpge 6d
      // 4e: goto 55
      // 51: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 54: athrow
      // 55: new java/lang/UnsupportedOperationException
      // 58: dup
      // 59: sipush 13596
      // 5c: ldc2_w 4021250124361422955
      // 5f: lload 5
      // 61: lxor
      // 62: invokestatic rip/breeze/inject/Util140.buildString_3 (IJ)Ljava/lang/String;
      // 65: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 68: athrow
      // 69: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 71: iload 10
      // 73: lload 5
      // 75: lconst_0
      // 76: lcmp
      // 77: ifle 93
      // 7a: ifeq 92
      // 7d: ifnull c5
      // 80: goto 87
      // 83: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 86: athrow
      // 87: aload 0
      // 88: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 8b: goto 92
      // 8e: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 91: athrow
      // 92: iload 2
      // 93: aload 3
      // 94: aload 4
      // 96: lload 8
      // 98: iload 7
      // 9a: bipush 5
      // 9b: anewarray 4
      // 9e: dup_x1
      // 9f: swap
      // a0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // a3: bipush 4
      // a4: swap
      // a5: aastore
      // a6: dup_x2
      // a7: dup_x2
      // a8: pop
      // a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // ac: bipush 3
      // ad: swap
      // ae: aastore
      // af: dup_x1
      // b0: swap
      // b1: bipush 2
      // b2: swap
      // b3: aastore
      // b4: dup_x1
      // b5: swap
      // b6: bipush 1
      // b7: swap
      // b8: aastore
      // b9: dup_x1
      // ba: swap
      // bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // be: bipush 0
      // bf: swap
      // c0: aastore
      // c1: invokevirtual rip/breeze/inject/Util140.getÜ_5 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // c4: areturn
      // c5: aconst_null
      // c6: areturn
      // try (38 -> 44): 45 java/lang/IllegalArgumentException
      // try (41 -> 56): 56 java/lang/IllegalArgumentException
      // try (60 -> 67): 68 java/lang/IllegalArgumentException
      // try (66 -> 72): 73 java/lang/IllegalArgumentException
   }

   public void processAll_21(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/ª
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast rip/breeze/inject/ª
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast rip/breeze/inject/ª
      // 15: astore 4
      // 17: dup
      // 18: bipush 3
      // 19: aaload
      // 1a: checkcast java/lang/String
      // 1d: astore 5
      // 1f: dup
      // 20: bipush 4
      // 21: aaload
      // 22: checkcast java/lang/Long
      // 25: invokevirtual java/lang/Long.longValue ()J
      // 28: lstore 6
      // 2a: pop
      // 2b: lload 6
      // 2d: dup2
      // 2e: ldc2_w 0
      // 31: lxor
      // 32: lstore 8
      // 34: pop2
      // 35: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 38: istore 10
      // 3a: aload 0
      // 3b: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 3e: iload 10
      // 40: ifeq 58
      // 43: ifnull 84
      // 46: goto 4d
      // 49: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 51: goto 58
      // 54: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 57: athrow
      // 58: aload 2
      // 59: aload 3
      // 5a: aload 4
      // 5c: aload 5
      // 5e: lload 8
      // 60: bipush 5
      // 61: anewarray 4
      // 64: dup_x2
      // 65: dup_x2
      // 66: pop
      // 67: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a: bipush 4
      // 6b: swap
      // 6c: aastore
      // 6d: dup_x1
      // 6e: swap
      // 6f: bipush 3
      // 70: swap
      // 71: aastore
      // 72: dup_x1
      // 73: swap
      // 74: bipush 2
      // 75: swap
      // 76: aastore
      // 77: dup_x1
      // 78: swap
      // 79: bipush 1
      // 7a: swap
      // 7b: aastore
      // 7c: dup_x1
      // 7d: swap
      // 7e: bipush 0
      // 7f: swap
      // 80: aastore
      // 81: invokevirtual rip/breeze/inject/Util140.processAll_21 ([Ljava/lang/Object;)V
      // 84: return
      // try (36 -> 41): 42 java/lang/IllegalArgumentException
      // try (40 -> 46): 47 java/lang/IllegalArgumentException
   }

   public ü getÜ_6(Object[] param1) {
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
      // 33: ldc2_w 0
      // 36: lxor
      // 37: lstore 8
      // 39: pop2
      // 3a: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 3d: istore 10
      // 3f: aload 0
      // 40: iload 10
      // 42: ifne 6f
      // 45: getfield rip/breeze/inject/Util140.int_þ I
      // 48: ldc 327680
      // 4a: if_icmpge 6b
      // 4d: goto 54
      // 50: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 53: athrow
      // 54: new java/lang/UnsupportedOperationException
      // 57: dup
      // 58: sipush 16731
      // 5b: ldc2_w 9162341698248821606
      // 5e: lload 3
      // 5f: lxor
      // 60: invokestatic rip/breeze/inject/Util140.buildString_3 (IJ)Ljava/lang/String;
      // 63: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 66: athrow
      // 67: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 6f: iload 10
      // 71: lload 3
      // 72: lconst_0
      // 73: lcmp
      // 74: iflt 90
      // 77: ifne 8f
      // 7a: ifnull c3
      // 7d: goto 84
      // 80: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 83: athrow
      // 84: aload 0
      // 85: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 88: goto 8f
      // 8b: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8e: athrow
      // 8f: iload 2
      // 90: lload 8
      // 92: aload 5
      // 94: aload 6
      // 96: iload 7
      // 98: bipush 5
      // 99: anewarray 4
      // 9c: dup_x1
      // 9d: swap
      // 9e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // a1: bipush 4
      // a2: swap
      // a3: aastore
      // a4: dup_x1
      // a5: swap
      // a6: bipush 3
      // a7: swap
      // a8: aastore
      // a9: dup_x1
      // aa: swap
      // ab: bipush 2
      // ac: swap
      // ad: aastore
      // ae: dup_x2
      // af: dup_x2
      // b0: pop
      // b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b4: bipush 1
      // b5: swap
      // b6: aastore
      // b7: dup_x1
      // b8: swap
      // b9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // bc: bipush 0
      // bd: swap
      // be: aastore
      // bf: invokevirtual rip/breeze/inject/Util140.getÜ_6 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // c2: areturn
      // c3: aconst_null
      // c4: areturn
      // try (38 -> 44): 45 java/lang/IllegalArgumentException
      // try (41 -> 56): 56 java/lang/IllegalArgumentException
      // try (60 -> 67): 68 java/lang/IllegalArgumentException
      // try (66 -> 72): 73 java/lang/IllegalArgumentException
   }

   public void processAll_22(Object[] param1) {
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
      // 12: checkcast java/lang/String
      // 15: astore 4
      // 17: dup
      // 18: bipush 3
      // 19: aaload
      // 1a: checkcast rip/breeze/inject/ª
      // 1d: astore 5
      // 1f: dup
      // 20: bipush 4
      // 21: aaload
      // 22: checkcast java/lang/Long
      // 25: invokevirtual java/lang/Long.longValue ()J
      // 28: lstore 6
      // 2a: dup
      // 2b: bipush 5
      // 2c: aaload
      // 2d: checkcast rip/breeze/inject/ª
      // 30: astore 8
      // 32: dup
      // 33: bipush 6
      // 35: aaload
      // 36: checkcast java/lang/Integer
      // 39: invokevirtual java/lang/Integer.intValue ()I
      // 3c: istore 9
      // 3e: pop
      // 3f: lload 6
      // 41: dup2
      // 42: ldc2_w 0
      // 45: lxor
      // 46: lstore 10
      // 48: pop2
      // 49: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 4c: istore 12
      // 4e: aload 0
      // 4f: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 52: iload 12
      // 54: ifne 6c
      // 57: ifnull ab
      // 5a: goto 61
      // 5d: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 60: athrow
      // 61: aload 0
      // 62: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 65: goto 6c
      // 68: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6b: athrow
      // 6c: aload 2
      // 6d: aload 3
      // 6e: aload 4
      // 70: aload 5
      // 72: lload 10
      // 74: aload 8
      // 76: iload 9
      // 78: bipush 7
      // 7a: anewarray 4
      // 7d: dup_x1
      // 7e: swap
      // 7f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 82: bipush 6
      // 84: swap
      // 85: aastore
      // 86: dup_x1
      // 87: swap
      // 88: bipush 5
      // 89: swap
      // 8a: aastore
      // 8b: dup_x2
      // 8c: dup_x2
      // 8d: pop
      // 8e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 91: bipush 4
      // 92: swap
      // 93: aastore
      // 94: dup_x1
      // 95: swap
      // 96: bipush 3
      // 97: swap
      // 98: aastore
      // 99: dup_x1
      // 9a: swap
      // 9b: bipush 2
      // 9c: swap
      // 9d: aastore
      // 9e: dup_x1
      // 9f: swap
      // a0: bipush 1
      // a1: swap
      // a2: aastore
      // a3: dup_x1
      // a4: swap
      // a5: bipush 0
      // a6: swap
      // a7: aastore
      // a8: invokevirtual rip/breeze/inject/Util140.processAll_22 ([Ljava/lang/Object;)V
      // ab: return
      // try (47 -> 52): 53 java/lang/IllegalArgumentException
      // try (51 -> 57): 58 java/lang/IllegalArgumentException
   }

   public ü getÜ_7(Object[] param1) {
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
      // 0e: checkcast rip/breeze/inject/և
      // 11: astore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Long
      // 18: invokevirtual java/lang/Long.longValue ()J
      // 1b: lstore 4
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast [Lrip/breeze/inject/ª;
      // 23: astore 6
      // 25: dup
      // 26: bipush 4
      // 27: aaload
      // 28: checkcast [Lrip/breeze/inject/ª;
      // 2b: astore 7
      // 2d: dup
      // 2e: bipush 5
      // 2f: aaload
      // 30: checkcast [I
      // 33: astore 8
      // 35: dup
      // 36: bipush 6
      // 38: aaload
      // 39: checkcast java/lang/String
      // 3c: astore 9
      // 3e: dup
      // 3f: bipush 7
      // 41: aaload
      // 42: checkcast java/lang/Boolean
      // 45: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 48: istore 10
      // 4a: pop
      // 4b: lload 4
      // 4d: dup2
      // 4e: ldc2_w 0
      // 51: lxor
      // 52: lstore 11
      // 54: pop2
      // 55: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 58: istore 13
      // 5a: aload 0
      // 5b: iload 13
      // 5d: ifne 8b
      // 60: getfield rip/breeze/inject/Util140.int_þ I
      // 63: ldc 327680
      // 65: if_icmpge 87
      // 68: goto 6f
      // 6b: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6e: athrow
      // 6f: new java/lang/UnsupportedOperationException
      // 72: dup
      // 73: sipush 13596
      // 76: ldc2_w 4021213868313972909
      // 79: lload 4
      // 7b: lxor
      // 7c: invokestatic rip/breeze/inject/Util140.buildString_3 (IJ)Ljava/lang/String;
      // 7f: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 82: athrow
      // 83: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 86: athrow
      // 87: aload 0
      // 88: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 8b: iload 13
      // 8d: lload 4
      // 8f: lconst_0
      // 90: lcmp
      // 91: iflt ad
      // 94: ifne ac
      // 97: ifnull f7
      // 9a: goto a1
      // 9d: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a0: athrow
      // a1: aload 0
      // a2: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // a5: goto ac
      // a8: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ab: athrow
      // ac: iload 2
      // ad: aload 3
      // ae: lload 11
      // b0: aload 6
      // b2: aload 7
      // b4: aload 8
      // b6: aload 9
      // b8: iload 10
      // ba: bipush 8
      // bc: anewarray 4
      // bf: dup_x1
      // c0: swap
      // c1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // c4: bipush 7
      // c6: swap
      // c7: aastore
      // c8: dup_x1
      // c9: swap
      // ca: bipush 6
      // cc: swap
      // cd: aastore
      // ce: dup_x1
      // cf: swap
      // d0: bipush 5
      // d1: swap
      // d2: aastore
      // d3: dup_x1
      // d4: swap
      // d5: bipush 4
      // d6: swap
      // d7: aastore
      // d8: dup_x1
      // d9: swap
      // da: bipush 3
      // db: swap
      // dc: aastore
      // dd: dup_x2
      // de: dup_x2
      // df: pop
      // e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // e3: bipush 2
      // e4: swap
      // e5: aastore
      // e6: dup_x1
      // e7: swap
      // e8: bipush 1
      // e9: swap
      // ea: aastore
      // eb: dup_x1
      // ec: swap
      // ed: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // f0: bipush 0
      // f1: swap
      // f2: aastore
      // f3: invokevirtual rip/breeze/inject/Util140.getÜ_7 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // f6: areturn
      // f7: aconst_null
      // f8: areturn
      // try (53 -> 59): 60 java/lang/IllegalArgumentException
      // try (56 -> 71): 71 java/lang/IllegalArgumentException
      // try (75 -> 82): 83 java/lang/IllegalArgumentException
      // try (81 -> 87): 88 java/lang/IllegalArgumentException
   }

   public void processAll_23(Object[] param1) {
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
      // 19: checkcast rip/breeze/inject/ª
      // 1c: astore 5
      // 1e: pop
      // 1f: lload 2
      // 20: dup2
      // 21: ldc2_w 0
      // 24: lxor
      // 25: lstore 6
      // 27: pop2
      // 28: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 2b: istore 8
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 31: iload 8
      // 33: ifeq 4b
      // 36: ifnull 6e
      // 39: goto 40
      // 3c: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 44: goto 4b
      // 47: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: lload 6
      // 4d: iload 4
      // 4f: aload 5
      // 51: bipush 3
      // 52: anewarray 4
      // 55: dup_x1
      // 56: swap
      // 57: bipush 2
      // 58: swap
      // 59: aastore
      // 5a: dup_x1
      // 5b: swap
      // 5c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5f: bipush 1
      // 60: swap
      // 61: aastore
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: invokevirtual rip/breeze/inject/Util140.processAll_23 ([Ljava/lang/Object;)V
      // 6e: return
      // try (27 -> 32): 33 java/lang/IllegalArgumentException
      // try (31 -> 37): 38 java/lang/IllegalArgumentException
   }

   public void processAll_24(Object[] param1) {
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
      // 21: pop
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 0
      // 27: lxor
      // 28: lstore 6
      // 2a: pop2
      // 2b: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 2e: istore 8
      // 30: aload 0
      // 31: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 34: iload 8
      // 36: ifne 4e
      // 39: ifnull 74
      // 3c: goto 43
      // 3f: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: aload 0
      // 44: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 47: goto 4e
      // 4a: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: lload 6
      // 50: iload 4
      // 52: iload 5
      // 54: bipush 3
      // 55: anewarray 4
      // 58: dup_x1
      // 59: swap
      // 5a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5d: bipush 2
      // 5e: swap
      // 5f: aastore
      // 60: dup_x1
      // 61: swap
      // 62: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 65: bipush 1
      // 66: swap
      // 67: aastore
      // 68: dup_x2
      // 69: dup_x2
      // 6a: pop
      // 6b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e: bipush 0
      // 6f: swap
      // 70: aastore
      // 71: invokevirtual rip/breeze/inject/Util140.processAll_24 ([Ljava/lang/Object;)V
      // 74: return
      // try (28 -> 33): 34 java/lang/IllegalArgumentException
      // try (32 -> 38): 39 java/lang/IllegalArgumentException
   }

   public void processAll_25(Object[] param1) {
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
      // 15: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 18: istore 6
      // 1a: aload 0
      // 1b: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 1e: iload 6
      // 20: ifeq 38
      // 23: ifnull 4a
      // 26: goto 2d
      // 29: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/Util140.dataBuilder6_ý Lrip/breeze/inject/Util140;
      // 31: goto 38
      // 34: invokestatic rip/breeze/inject/Util140.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 47: invokevirtual rip/breeze/inject/Util140.processAll_25 ([Ljava/lang/Object;)V
      // 4a: return
      // try (16 -> 21): 22 java/lang/IllegalArgumentException
      // try (20 -> 26): 27 java/lang/IllegalArgumentException
   }

   public static void initialize(int var0) {
      int_ü = var0;
   }

   public static int getValue() {
      return int_ü;
   }

   public static int getValue_2() {
      int var0 = getValue();

      try {
         return var0 == 0 ? 78 : 0;
      } catch (IllegalArgumentException var1) {
         throw getIllegalArgumentException(var1);
      }
   }

   static {
      long var0 = 14682628740463L;
      initialize(0);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "Á\u0005Zníù\u001aÖ×-O·¼5S¥äcF\u0098û\u00028GQ1UOpîå/Èº²îjSê\u00128Jo6æ\u009b\u0092\u0019\u008a\u0084\fD3ÆõUÍ\u001cEÙ\u0082+ÛY}\u008aÞ5no\u0001ñ°¿\"?ÌìÜq\u0017\u0018&m\u0087\u001cjþ\u0000%\u007fæíÆ\u001fD\u00898\u008aUøö\u008e£] =\u009c\u0001ëÿÔ¶\u008d\u001e/YM\\Ñ*à\u0013u¤)\u0003j\u0091Ó\u0088+2\u0082/±H>_Y\u0086:®¼ïÆf\u0090úãzbö7X;®½\u0019>\u0003Gôð5 ²\u001f`njÿß©7Íð1\u0014\nõí~S*Ê\u0010\u008fI\u008a\u0097ÁÁ\u008eð\u0088QqW@\u001fZü¶n±Ò<§\u000f£\u000bjS\u008c\u009eÎvF8e\u0016x_\u0001\u009b\u0084Î\u0098\u0089Zsª\u0087\u009c7&}\u0082'bb\u0093";
      int var7 = "Á\u0005Zníù\u001aÖ×-O·¼5S¥äcF\u0098û\u00028GQ1UOpîå/Èº²îjSê\u00128Jo6æ\u009b\u0092\u0019\u008a\u0084\fD3ÆõUÍ\u001cEÙ\u0082+ÛY}\u008aÞ5no\u0001ñ°¿\"?ÌìÜq\u0017\u0018&m\u0087\u001cjþ\u0000%\u007fæíÆ\u001fD\u00898\u008aUøö\u008e£] =\u009c\u0001ëÿÔ¶\u008d\u001e/YM\\Ñ*à\u0013u¤)\u0003j\u0091Ó\u0088+2\u0082/±H>_Y\u0086:®¼ïÆf\u0090úãzbö7X;®½\u0019>\u0003Gôð5 ²\u001f`njÿß©7Íð1\u0014\nõí~S*Ê\u0010\u008fI\u008a\u0097ÁÁ\u008eð\u0088QqW@\u001fZü¶n±Ò<§\u000f£\u000bjS\u008c\u009eÎvF8e\u0016x_\u0001\u009b\u0084Î\u0098\u0089Zsª\u0087\u009c7&}\u0082'bb\u0093"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = buildString_2(var11).intern();
         if ((var9 += var8) >= var7) {
            var6 = "\u0088Ö4\u0003<«£$¾\u000eØpÁ\u008d)òW\u001aÔ>¦¿Ü\u0088¼c¥ñ&P2õ\u008aßñò¾÷÷RP\u001aæ\u0001H\u009bìÀ8.^\u0011fM\u0002&6~¯j\u00adºõ\u009bÍ?ûm÷\u009a-\u0014:ûBÍ=Ñ\u0014¼{µM\u0080M\u001b/\u009e¸=\u0080nQ\u0096ÚïÂ¡e,Êí\u0096\u007fõ";
            var7 = "\u0088Ö4\u0003<«£$¾\u000eØpÁ\u008d)òW\u001aÔ>¦¿Ü\u0088¼c¥ñ&P2õ\u008aßñò¾÷÷RP\u001aæ\u0001H\u009bìÀ8.^\u0011fM\u0002&6~¯j\u00adºõ\u009bÍ?ûm÷\u009a-\u0014:ûBÍ=Ñ\u0014¼{µM\u0080M\u001b/\u009e¸=\u0080nQ\u0096ÚïÂ¡e,Êí\u0096\u007fõ"
               .length();
            var8 = '0';
            var9 = -1;

            while (true) {
               var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
               var4[var5++] = buildString_2(var11).intern();
               if ((var9 += var8) >= var7) {
                  CONST_E = var4;
                  CONST_F = new String[6];
                  CONST_Ÿ = buildString_3(9865, 8228579299666805119L ^ var0);
                  return;
               }

               var8 = var6.charAt(var9);
            }
         }

         var8 = var6.charAt(var9);
      }
   }

   private static IllegalArgumentException getIllegalArgumentException(IllegalArgumentException var0) {
      return var0;
   }

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12957;
      if (CONST_F[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_G.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_G.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/z", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_E[var3].getBytes("ISO-8859-1");
         CONST_F[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_F[var3];
   }
}
