package rip.breeze.inject;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class BreezeClass11 {
   protected final int int_ÿ;
   protected BreezeClass11 breezeClass11_þ;
   private static final String CONST_C;

   protected BreezeClass11(long var1, int var3) {
      var1 = 3197665590982L ^ var1;
      long var4 = var1 ^ 74843925817614L;
      this(var4, var3, null);
   }

   protected BreezeClass11(long param1, int param3, BreezeClass11 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/inject/BreezeClass11.3197665590982L J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 55187849325624
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 11935995164005
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
      // 02d: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 030: athrow
      // 031: iload 3
      // 032: ldc 524288
      // 034: iload 9
      // 036: ifeq 0f7
      // 039: goto 040
      // 03c: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03f: athrow
      // 040: if_icmpeq 0f4
      // 043: goto 04a
      // 046: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 049: athrow
      // 04a: iload 3
      // 04b: ldc 458752
      // 04d: iload 9
      // 04f: ifeq 0f7
      // 052: goto 059
      // 055: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 058: athrow
      // 059: if_icmpeq 0f4
      // 05c: goto 063
      // 05f: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 062: athrow
      // 063: iload 3
      // 064: ldc 393216
      // 066: iload 9
      // 068: ifeq 0f7
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 071: athrow
      // 072: if_icmpeq 0f4
      // 075: goto 07c
      // 078: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07b: athrow
      // 07c: iload 3
      // 07d: ldc 327680
      // 07f: iload 9
      // 081: ifeq 0f7
      // 084: goto 08b
      // 087: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08a: athrow
      // 08b: if_icmpeq 0f4
      // 08e: goto 095
      // 091: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 094: athrow
      // 095: iload 3
      // 096: ldc 262144
      // 098: iload 9
      // 09a: ifeq 0f7
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: if_icmpeq 0f4
      // 0a7: goto 0ae
      // 0aa: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 0bf: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: if_icmpeq 0f4
      // 0c6: goto 0cd
      // 0c9: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 0e9: invokestatic rip/breeze/inject/BreezeClass11.buildString ([Ljava/lang/Object;)Ljava/lang/String;
      // 0ec: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ef: athrow
      // 0f0: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 115: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 3
      // 11b: putfield rip/breeze/inject/BreezeClass11.int_ÿ I
      // 11e: aload 0
      // 11f: aload 4
      // 121: putfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
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
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      var2 = 3197665590982L ^ var2;
      return CONST_C + var1;
   }

   public BreezeClass11 getBreezeClass11(Object[] var1) {
      return this.breezeClass11_þ;
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
      // 22: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 25: iload 7
      // 27: ifne 3f
      // 2a: ifnull 57
      // 2d: goto 34
      // 30: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: aload 0
      // 35: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 54: invokevirtual rip/breeze/inject/BreezeClass11.processAll ([Ljava/lang/Object;)V
      // 57: return
      // try (21 -> 26): 27 java/lang/IllegalArgumentException
      // try (25 -> 31): 32 java/lang/IllegalArgumentException
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
      // 04: checkcast java/lang/String
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
      // 22: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 25: iload 7
      // 27: ifne 3f
      // 2a: ifnull 57
      // 2d: goto 34
      // 30: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: aload 0
      // 35: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 54: invokevirtual rip/breeze/inject/BreezeClass11.processAll_2 ([Ljava/lang/Object;)V
      // 57: return
      // try (21 -> 26): 27 java/lang/IllegalArgumentException
      // try (25 -> 31): 32 java/lang/IllegalArgumentException
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
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/String
      // 23: astore 6
      // 25: pop
      // 26: lload 4
      // 28: dup2
      // 29: ldc2_w 0
      // 2c: lxor
      // 2d: lstore 7
      // 2f: pop2
      // 30: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 33: istore 9
      // 35: aload 0
      // 36: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 39: iload 9
      // 3b: ifeq 53
      // 3e: ifnull 7b
      // 41: goto 48
      // 44: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 47: athrow
      // 48: aload 0
      // 49: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 4c: goto 53
      // 4f: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52: athrow
      // 53: aload 2
      // 54: iload 3
      // 55: lload 7
      // 57: aload 6
      // 59: bipush 4
      // 5a: anewarray 4
      // 5d: dup_x1
      // 5e: swap
      // 5f: bipush 3
      // 60: swap
      // 61: aastore
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 2
      // 69: swap
      // 6a: aastore
      // 6b: dup_x1
      // 6c: swap
      // 6d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 70: bipush 1
      // 71: swap
      // 72: aastore
      // 73: dup_x1
      // 74: swap
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: invokevirtual rip/breeze/inject/BreezeClass11.processAll_3 ([Ljava/lang/Object;)V
      // 7b: return
      // try (32 -> 37): 38 java/lang/IllegalArgumentException
      // try (36 -> 42): 43 java/lang/IllegalArgumentException
   }

   public void processAll_4(Object... param1) {
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
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast [Ljava/lang/String;
      // 23: astore 6
      // 25: pop
      // 26: lload 4
      // 28: dup2
      // 29: ldc2_w 0
      // 2c: lxor
      // 2d: lstore 7
      // 2f: pop2
      // 30: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 33: istore 9
      // 35: aload 0
      // 36: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 39: iload 9
      // 3b: ifeq 53
      // 3e: ifnull 7b
      // 41: goto 48
      // 44: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 47: athrow
      // 48: aload 0
      // 49: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 4c: goto 53
      // 4f: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52: athrow
      // 53: aload 2
      // 54: iload 3
      // 55: lload 7
      // 57: aload 6
      // 59: bipush 4
      // 5a: anewarray 4
      // 5d: dup_x1
      // 5e: swap
      // 5f: bipush 3
      // 60: swap
      // 61: aastore
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 2
      // 69: swap
      // 6a: aastore
      // 6b: dup_x1
      // 6c: swap
      // 6d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 70: bipush 1
      // 71: swap
      // 72: aastore
      // 73: dup_x1
      // 74: swap
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: invokevirtual rip/breeze/inject/BreezeClass11.processAll_4 ([Ljava/lang/Object;)V
      // 7b: return
      // try (32 -> 37): 38 java/lang/IllegalArgumentException
      // try (36 -> 42): 43 java/lang/IllegalArgumentException
   }

   public void processAll_5(Object... param1) {
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
      // 16: checkcast java/lang/Integer
      // 19: invokevirtual java/lang/Integer.intValue ()I
      // 1c: istore 5
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast [Ljava/lang/String;
      // 24: astore 6
      // 26: pop
      // 27: lload 2
      // 28: dup2
      // 29: ldc2_w 0
      // 2c: lxor
      // 2d: lstore 7
      // 2f: pop2
      // 30: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 33: istore 9
      // 35: aload 0
      // 36: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 39: iload 9
      // 3b: ifeq 53
      // 3e: ifnull 7d
      // 41: goto 48
      // 44: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 47: athrow
      // 48: aload 0
      // 49: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 4c: goto 53
      // 4f: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52: athrow
      // 53: lload 7
      // 55: aload 4
      // 57: iload 5
      // 59: aload 6
      // 5b: bipush 4
      // 5c: anewarray 4
      // 5f: dup_x1
      // 60: swap
      // 61: bipush 3
      // 62: swap
      // 63: aastore
      // 64: dup_x1
      // 65: swap
      // 66: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 69: bipush 2
      // 6a: swap
      // 6b: aastore
      // 6c: dup_x1
      // 6d: swap
      // 6e: bipush 1
      // 6f: swap
      // 70: aastore
      // 71: dup_x2
      // 72: dup_x2
      // 73: pop
      // 74: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 77: bipush 0
      // 78: swap
      // 79: aastore
      // 7a: invokevirtual rip/breeze/inject/BreezeClass11.processAll_5 ([Ljava/lang/Object;)V
      // 7d: return
      // try (32 -> 37): 38 java/lang/IllegalArgumentException
      // try (36 -> 42): 43 java/lang/IllegalArgumentException
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 3
      // 15: dup
      // 16: bipush 2
      // 17: aaload
      // 18: checkcast java/lang/String
      // 1b: astore 4
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/Integer
      // 23: invokevirtual java/lang/Integer.intValue ()I
      // 26: istore 5
      // 28: pop
      // 29: iload 2
      // 2a: i2l
      // 2b: bipush 48
      // 2d: lshl
      // 2e: iload 3
      // 2f: i2l
      // 30: bipush 32
      // 32: lshl
      // 33: bipush 16
      // 35: lushr
      // 36: lor
      // 37: iload 5
      // 39: i2l
      // 3a: bipush 48
      // 3c: lshl
      // 3d: bipush 48
      // 3f: lushr
      // 40: lor
      // 41: lstore 6
      // 43: lload 6
      // 45: dup2
      // 46: ldc2_w 0
      // 49: lxor
      // 4a: dup2
      // 4b: bipush 48
      // 4d: lushr
      // 4e: l2i
      // 4f: istore 8
      // 51: dup2
      // 52: bipush 16
      // 54: lshl
      // 55: bipush 32
      // 57: lushr
      // 58: l2i
      // 59: istore 9
      // 5b: dup2
      // 5c: bipush 48
      // 5e: lshl
      // 5f: bipush 48
      // 61: lushr
      // 62: l2i
      // 63: istore 10
      // 65: pop2
      // 66: pop2
      // 67: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 6a: istore 11
      // 6c: aload 0
      // 6d: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 70: iload 11
      // 72: ifne 8a
      // 75: ifnull b7
      // 78: goto 7f
      // 7b: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7e: athrow
      // 7f: aload 0
      // 80: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 83: goto 8a
      // 86: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 89: athrow
      // 8a: iload 8
      // 8c: i2c
      // 8d: iload 9
      // 8f: aload 4
      // 91: iload 10
      // 93: bipush 4
      // 94: anewarray 4
      // 97: dup_x1
      // 98: swap
      // 99: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9c: bipush 3
      // 9d: swap
      // 9e: aastore
      // 9f: dup_x1
      // a0: swap
      // a1: bipush 2
      // a2: swap
      // a3: aastore
      // a4: dup_x1
      // a5: swap
      // a6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a9: bipush 1
      // aa: swap
      // ab: aastore
      // ac: dup_x1
      // ad: swap
      // ae: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b1: bipush 0
      // b2: swap
      // b3: aastore
      // b4: invokevirtual rip/breeze/inject/BreezeClass11.processAll_6 ([Ljava/lang/Object;)V
      // b7: return
      // try (71 -> 76): 77 java/lang/IllegalArgumentException
      // try (75 -> 81): 82 java/lang/IllegalArgumentException
   }

   public void processAll_7(Object... param1) {
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
      // 16: checkcast [Ljava/lang/String;
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
      // 2b: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 2e: iload 8
      // 30: ifeq 48
      // 33: ifnull 68
      // 36: goto 3d
      // 39: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 41: goto 48
      // 44: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 65: invokevirtual rip/breeze/inject/BreezeClass11.processAll_7 ([Ljava/lang/Object;)V
      // 68: return
      // try (26 -> 31): 32 java/lang/IllegalArgumentException
      // try (30 -> 36): 37 java/lang/IllegalArgumentException
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
      // 1b: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 1e: iload 6
      // 20: ifeq 38
      // 23: ifnull 4a
      // 26: goto 2d
      // 29: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/BreezeClass11.breezeClass11_þ Lrip/breeze/inject/BreezeClass11;
      // 31: goto 38
      // 34: invokestatic rip/breeze/inject/BreezeClass11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 47: invokevirtual rip/breeze/inject/BreezeClass11.processAll_8 ([Ljava/lang/Object;)V
      // 4a: return
      // try (16 -> 21): 22 java/lang/IllegalArgumentException
      // try (20 -> 26): 27 java/lang/IllegalArgumentException
   }

   static {
      long var0 = 107631808367777L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var5 = var2.doFinal("\u009c-ÿ}\u001aÙ³\\PÝs¡G\u0013Å\u009dG©JJ\u0086\u0093\u008eA".getBytes("ISO-8859-1"));
      CONST_C = buildString_2(var5).intern();
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
}
