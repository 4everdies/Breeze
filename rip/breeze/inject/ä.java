package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class ä {
   protected final int int_ÿ_2;
   protected ä ä_þ_2;
   private static final String[] CONST_C_2;
   private static final String[] CONST_D_2;
   private static final Map CONST_E_2 = new HashMap(13);

   protected ä(int var1, long var2) {
      var2 = encKey_a_2 ^ var2;
      long var4 = var2 ^ 117819274734929L;
      this(var1, null, var4);
   }

   protected ä(int param1, ä param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/inject/ä.encKey_a_2 J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 66939281852407
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 57341223306162
      // 012: lxor
      // 013: lstore 7
      // 015: pop2
      // 016: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 019: aload 0
      // 01a: invokespecial java/lang/Object.<init> ()V
      // 01d: istore 9
      // 01f: iload 1
      // 020: ldc 589824
      // 022: iload 9
      // 024: ifeq 0f7
      // 027: if_icmpeq 0f4
      // 02a: goto 031
      // 02d: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 030: athrow
      // 031: iload 1
      // 032: ldc 524288
      // 034: iload 9
      // 036: ifeq 0f7
      // 039: goto 040
      // 03c: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03f: athrow
      // 040: if_icmpeq 0f4
      // 043: goto 04a
      // 046: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 049: athrow
      // 04a: iload 1
      // 04b: ldc 458752
      // 04d: iload 9
      // 04f: ifeq 0f7
      // 052: goto 059
      // 055: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 058: athrow
      // 059: if_icmpeq 0f4
      // 05c: goto 063
      // 05f: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 062: athrow
      // 063: iload 1
      // 064: ldc 393216
      // 066: iload 9
      // 068: ifeq 0f7
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 071: athrow
      // 072: if_icmpeq 0f4
      // 075: goto 07c
      // 078: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07b: athrow
      // 07c: iload 1
      // 07d: ldc 327680
      // 07f: iload 9
      // 081: ifeq 0f7
      // 084: goto 08b
      // 087: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08a: athrow
      // 08b: if_icmpeq 0f4
      // 08e: goto 095
      // 091: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 094: athrow
      // 095: iload 1
      // 096: ldc 262144
      // 098: iload 9
      // 09a: ifeq 0f7
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: if_icmpeq 0f4
      // 0a7: goto 0ae
      // 0aa: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: iload 1
      // 0af: ldc 17432576
      // 0b1: lload 3
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: iflt 0f7
      // 0b7: iload 9
      // 0b9: ifeq 0f7
      // 0bc: goto 0c3
      // 0bf: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: if_icmpeq 0f4
      // 0c6: goto 0cd
      // 0c9: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cc: athrow
      // 0cd: new java/lang/IllegalArgumentException
      // 0d0: dup
      // 0d1: iload 1
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
      // 0e9: invokestatic rip/breeze/inject/ä.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0ec: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ef: athrow
      // 0f0: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f3: athrow
      // 0f4: iload 1
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
      // 115: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 1
      // 11b: putfield rip/breeze/inject/ä.int_ÿ_2 I
      // 11e: aload 0
      // 11f: aload 2
      // 120: putfield rip/breeze/inject/ä.ä_þ_2 Lrip/breeze/inject/ä;
      // 123: return
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

   private static String invoke_5(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      return method_009(22509, 4369631505145128599L ^ var2) + var1;
   }

   public ä invoke_6(Object[] var1) {
      return this.ä_þ_2;
   }

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
      // 20: ldc2_w 0
      // 23: lxor
      // 24: lstore 6
      // 26: pop2
      // 27: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 2a: istore 8
      // 2c: aload 0
      // 2d: getfield rip/breeze/inject/ä.ä_þ_2 Lrip/breeze/inject/ä;
      // 30: iload 8
      // 32: ifne 4a
      // 35: ifnull 6d
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield rip/breeze/inject/ä.ä_þ_2 Lrip/breeze/inject/ä;
      // 43: goto 4a
      // 46: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 49: athrow
      // 4a: aload 2
      // 4b: lload 6
      // 4d: iload 5
      // 4f: bipush 3
      // 50: anewarray 4
      // 53: dup_x1
      // 54: swap
      // 55: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 58: bipush 2
      // 59: swap
      // 5a: aastore
      // 5b: dup_x2
      // 5c: dup_x2
      // 5d: pop
      // 5e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 61: bipush 1
      // 62: swap
      // 63: aastore
      // 64: dup_x1
      // 65: swap
      // 66: bipush 0
      // 67: swap
      // 68: aastore
      // 69: invokevirtual rip/breeze/inject/ä.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 6c: areturn
      // 6d: aconst_null
      // 6e: areturn
      // try (27 -> 32): 33 java/lang/IllegalArgumentException
      // try (31 -> 37): 38 java/lang/IllegalArgumentException
   }

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
      // 33: ldc2_w 0
      // 36: lxor
      // 37: lstore 8
      // 39: pop2
      // 3a: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 3d: istore 10
      // 3f: aload 0
      // 40: iload 10
      // 42: ifeq 6f
      // 45: getfield rip/breeze/inject/ä.int_ÿ_2 I
      // 48: ldc 327680
      // 4a: if_icmpge 6b
      // 4d: goto 54
      // 50: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 53: athrow
      // 54: new java/lang/UnsupportedOperationException
      // 57: dup
      // 58: sipush 18952
      // 5b: ldc2_w 3915408313362053576
      // 5e: lload 3
      // 5f: lxor
      // 60: invokestatic rip/breeze/inject/ä.method_009 (IJ)Ljava/lang/String;
      // 63: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 66: athrow
      // 67: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield rip/breeze/inject/ä.ä_þ_2 Lrip/breeze/inject/ä;
      // 6f: iload 10
      // 71: lload 3
      // 72: lconst_0
      // 73: lcmp
      // 74: iflt 90
      // 77: ifeq 8f
      // 7a: ifnull c3
      // 7d: goto 84
      // 80: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 83: athrow
      // 84: aload 0
      // 85: getfield rip/breeze/inject/ä.ä_þ_2 Lrip/breeze/inject/ä;
      // 88: goto 8f
      // 8b: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // bf: invokevirtual rip/breeze/inject/ä.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // c2: areturn
      // c3: aconst_null
      // c4: areturn
      // try (38 -> 44): 45 java/lang/IllegalArgumentException
      // try (41 -> 56): 56 java/lang/IllegalArgumentException
      // try (60 -> 67): 68 java/lang/IllegalArgumentException
      // try (66 -> 72): 73 java/lang/IllegalArgumentException
   }

   public void invoke_3(Object[] param1) {
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
      // 22: getfield rip/breeze/inject/ä.ä_þ_2 Lrip/breeze/inject/ä;
      // 25: iload 7
      // 27: ifeq 3f
      // 2a: ifnull 57
      // 2d: goto 34
      // 30: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: aload 0
      // 35: getfield rip/breeze/inject/ä.ä_þ_2 Lrip/breeze/inject/ä;
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 54: invokevirtual rip/breeze/inject/ä.method_003 ([Ljava/lang/Object;)V
      // 57: return
      // try (21 -> 26): 27 java/lang/IllegalArgumentException
      // try (25 -> 31): 32 java/lang/IllegalArgumentException
   }

   public void invoke_4(Object[] param1) {
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
      // 1b: getfield rip/breeze/inject/ä.ä_þ_2 Lrip/breeze/inject/ä;
      // 1e: iload 6
      // 20: ifne 38
      // 23: ifnull 4a
      // 26: goto 2d
      // 29: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/ä.ä_þ_2 Lrip/breeze/inject/ä;
      // 31: goto 38
      // 34: invokestatic rip/breeze/inject/ä.method_007 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 47: invokevirtual rip/breeze/inject/ä.method_004 ([Ljava/lang/Object;)V
      // 4a: return
      // try (16 -> 21): 22 java/lang/IllegalArgumentException
      // try (20 -> 26): 27 java/lang/IllegalArgumentException
   }

   static {
      long var0 = 82516416623831L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "iÙ\u008fE¹ú\u008cY6ú[üPÓÎ\n±\u0084\u0084êZ¦Q:o¤Ix, \u001e\u001b£Ö\u0002MCaÐ\u00848%ù\u0098w·\u0011ÀÃ6\u0006iê\u0099\b\u0013ô%Bv-°Ý\u000f°[ì\t\u0099÷\u001eøEDË%¬´gS¸3.8×\u0002\u001eÝ\u0084Pö|\u000eãncQ";
      int var7 = "iÙ\u008fE¹ú\u008cY6ú[üPÓÎ\n±\u0084\u0084êZ¦Q:o¤Ix, \u001e\u001b£Ö\u0002MCaÐ\u00848%ù\u0098w·\u0011ÀÃ6\u0006iê\u0099\b\u0013ô%Bv-°Ý\u000f°[ì\t\u0099÷\u001eøEDË%¬´gS¸3.8×\u0002\u001eÝ\u0084Pö|\u000eãncQ"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = method_008(var11).intern();
         if ((var9 += var8) >= var7) {
            CONST_C_2 = var4;
            CONST_D_2 = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static IllegalArgumentException invoke_7(IllegalArgumentException var0) {
      return var0;
   }

   private static String invoke_8(byte[] var0) {
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

   private static String invoke_9(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14460;
      if (CONST_D_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/ä", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C_2[var3].getBytes("ISO-8859-1");
         CONST_D_2[var3] = method_008(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D_2[var3];
   }
}
