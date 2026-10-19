package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class î {
   protected final int int_ÿ_2;
   protected î î_þ_2;
   private static int[] arr_ý_2;
   private static final String[] CONST_D_2;
   private static final String[] CONST_E_2;
   private static final Map CONST_F_2 = new HashMap(13);

   protected î(int var1, long var2) {
      var2 = encKey_a_2 ^ var2;
      long var4 = var2 ^ 59166934182464L;
      this(var1, null, var4);
   }

   protected î(int param1, î param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/inject/î.encKey_a_2 J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 30991474349204
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 40902386215858
      // 012: lxor
      // 013: lstore 7
      // 015: pop2
      // 016: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 019: aload 0
      // 01a: invokespecial java/lang/Object.<init> ()V
      // 01d: istore 9
      // 01f: iload 1
      // 020: ldc 589824
      // 022: iload 9
      // 024: ifne 0f7
      // 027: if_icmpeq 0f4
      // 02a: goto 031
      // 02d: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 030: athrow
      // 031: iload 1
      // 032: ldc 524288
      // 034: iload 9
      // 036: ifne 0f7
      // 039: goto 040
      // 03c: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03f: athrow
      // 040: if_icmpeq 0f4
      // 043: goto 04a
      // 046: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 049: athrow
      // 04a: iload 1
      // 04b: ldc 458752
      // 04d: iload 9
      // 04f: ifne 0f7
      // 052: goto 059
      // 055: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 058: athrow
      // 059: if_icmpeq 0f4
      // 05c: goto 063
      // 05f: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 062: athrow
      // 063: iload 1
      // 064: ldc 393216
      // 066: iload 9
      // 068: ifne 0f7
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 071: athrow
      // 072: if_icmpeq 0f4
      // 075: goto 07c
      // 078: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07b: athrow
      // 07c: iload 1
      // 07d: ldc 327680
      // 07f: iload 9
      // 081: ifne 0f7
      // 084: goto 08b
      // 087: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08a: athrow
      // 08b: if_icmpeq 0f4
      // 08e: goto 095
      // 091: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 094: athrow
      // 095: iload 1
      // 096: ldc 262144
      // 098: iload 9
      // 09a: ifne 0f7
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: if_icmpeq 0f4
      // 0a7: goto 0ae
      // 0aa: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: iload 1
      // 0af: ldc 17432576
      // 0b1: lload 3
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: iflt 0f7
      // 0b7: iload 9
      // 0b9: ifne 0f7
      // 0bc: goto 0c3
      // 0bf: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: if_icmpeq 0f4
      // 0c6: goto 0cd
      // 0c9: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 0e9: invokestatic rip/breeze/inject/î.method_016 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0ec: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ef: athrow
      // 0f0: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 115: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 1
      // 11b: putfield rip/breeze/inject/î.int_ÿ_2 I
      // 11e: aload 0
      // 11f: aload 2
      // 120: putfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
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

   private static String invoke_16(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      return method_022(28190, 5612924016126032150L ^ var2) + var1;
   }

   public î invoke_17(Object[] var1) {
      return this.î_þ_2;
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
      // 20: checkcast java/lang/String
      // 23: astore 5
      // 25: dup
      // 26: bipush 4
      // 27: aaload
      // 28: checkcast java/lang/String
      // 2b: astore 6
      // 2d: dup
      // 2e: bipush 5
      // 2f: aaload
      // 30: checkcast [Ljava/lang/String;
      // 33: astore 7
      // 35: dup
      // 36: bipush 6
      // 38: aaload
      // 39: checkcast java/lang/Long
      // 3c: invokevirtual java/lang/Long.longValue ()J
      // 3f: lstore 8
      // 41: pop
      // 42: lload 8
      // 44: dup2
      // 45: ldc2_w 0
      // 48: lxor
      // 49: lstore 10
      // 4b: pop2
      // 4c: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 4f: istore 12
      // 51: aload 0
      // 52: iload 12
      // 54: ifeq 90
      // 57: getfield rip/breeze/inject/î.int_ÿ_2 I
      // 5a: ldc 524288
      // 5c: if_icmpge 8c
      // 5f: goto 66
      // 62: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 65: athrow
      // 66: iload 3
      // 67: ldc 65536
      // 69: iand
      // 6a: ifeq 8c
      // 6d: goto 74
      // 70: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 73: athrow
      // 74: new java/lang/UnsupportedOperationException
      // 77: dup
      // 78: sipush 12317
      // 7b: ldc2_w 3143133209435384291
      // 7e: lload 8
      // 80: lxor
      // 81: invokestatic rip/breeze/inject/î.method_022 (IJ)Ljava/lang/String;
      // 84: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 87: athrow
      // 88: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8b: athrow
      // 8c: aload 0
      // 8d: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 90: iload 12
      // 92: lload 8
      // 94: lconst_0
      // 95: lcmp
      // 96: ifle b2
      // 99: ifeq b1
      // 9c: ifnull f3
      // 9f: goto a6
      // a2: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a5: athrow
      // a6: aload 0
      // a7: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // aa: goto b1
      // ad: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b0: athrow
      // b1: iload 2
      // b2: iload 3
      // b3: aload 4
      // b5: aload 5
      // b7: aload 6
      // b9: aload 7
      // bb: lload 10
      // bd: bipush 7
      // bf: anewarray 4
      // c2: dup_x2
      // c3: dup_x2
      // c4: pop
      // c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c8: bipush 6
      // ca: swap
      // cb: aastore
      // cc: dup_x1
      // cd: swap
      // ce: bipush 5
      // cf: swap
      // d0: aastore
      // d1: dup_x1
      // d2: swap
      // d3: bipush 4
      // d4: swap
      // d5: aastore
      // d6: dup_x1
      // d7: swap
      // d8: bipush 3
      // d9: swap
      // da: aastore
      // db: dup_x1
      // dc: swap
      // dd: bipush 2
      // de: swap
      // df: aastore
      // e0: dup_x1
      // e1: swap
      // e2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // e5: bipush 1
      // e6: swap
      // e7: aastore
      // e8: dup_x1
      // e9: swap
      // ea: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ed: bipush 0
      // ee: swap
      // ef: aastore
      // f0: invokevirtual rip/breeze/inject/î.method_001 ([Ljava/lang/Object;)V
      // f3: return
      // try (48 -> 54): 55 java/lang/IllegalArgumentException
      // try (51 -> 61): 62 java/lang/IllegalArgumentException
      // try (57 -> 73): 73 java/lang/IllegalArgumentException
      // try (77 -> 84): 85 java/lang/IllegalArgumentException
      // try (83 -> 89): 90 java/lang/IllegalArgumentException
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
      // 1a: pop
      // 1b: lload 3
      // 1c: dup2
      // 1d: ldc2_w 0
      // 20: lxor
      // 21: lstore 6
      // 23: pop2
      // 24: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 27: istore 8
      // 29: aload 0
      // 2a: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 2d: iload 8
      // 2f: ifeq 47
      // 32: ifnull 66
      // 35: goto 3c
      // 38: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 40: goto 47
      // 43: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: aload 2
      // 48: lload 6
      // 4a: aload 5
      // 4c: bipush 3
      // 4d: anewarray 4
      // 50: dup_x1
      // 51: swap
      // 52: bipush 2
      // 53: swap
      // 54: aastore
      // 55: dup_x2
      // 56: dup_x2
      // 57: pop
      // 58: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b: bipush 1
      // 5c: swap
      // 5d: aastore
      // 5e: dup_x1
      // 5f: swap
      // 60: bipush 0
      // 61: swap
      // 62: aastore
      // 63: invokevirtual rip/breeze/inject/î.method_002 ([Ljava/lang/Object;)V
      // 66: return
      // try (26 -> 31): 32 java/lang/IllegalArgumentException
      // try (30 -> 36): 37 java/lang/IllegalArgumentException
   }

   public BreezeClass11 invoke_3(Object[] param1) {
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
      // 15: checkcast java/lang/String
      // 18: astore 4
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast java/lang/Long
      // 20: invokevirtual java/lang/Long.longValue ()J
      // 23: lstore 5
      // 25: pop
      // 26: lload 5
      // 28: dup2
      // 29: ldc2_w 0
      // 2c: lxor
      // 2d: lstore 7
      // 2f: pop2
      // 30: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 33: istore 9
      // 35: aload 0
      // 36: iload 9
      // 38: ifne 66
      // 3b: getfield rip/breeze/inject/î.int_ÿ_2 I
      // 3e: ldc 393216
      // 40: if_icmpge 62
      // 43: goto 4a
      // 46: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 49: athrow
      // 4a: new java/lang/UnsupportedOperationException
      // 4d: dup
      // 4e: sipush 11617
      // 51: ldc2_w 8798257601919290251
      // 54: lload 5
      // 56: lxor
      // 57: invokestatic rip/breeze/inject/î.method_022 (IJ)Ljava/lang/String;
      // 5a: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 5d: athrow
      // 5e: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 61: athrow
      // 62: aload 0
      // 63: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 66: iload 9
      // 68: ifne 80
      // 6b: ifnull a9
      // 6e: goto 75
      // 71: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 74: athrow
      // 75: aload 0
      // 76: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 79: goto 80
      // 7c: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7f: athrow
      // 80: aload 2
      // 81: iload 3
      // 82: aload 4
      // 84: lload 7
      // 86: bipush 4
      // 87: anewarray 4
      // 8a: dup_x2
      // 8b: dup_x2
      // 8c: pop
      // 8d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 90: bipush 3
      // 91: swap
      // 92: aastore
      // 93: dup_x1
      // 94: swap
      // 95: bipush 2
      // 96: swap
      // 97: aastore
      // 98: dup_x1
      // 99: swap
      // 9a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9d: bipush 1
      // 9e: swap
      // 9f: aastore
      // a0: dup_x1
      // a1: swap
      // a2: bipush 0
      // a3: swap
      // a4: aastore
      // a5: invokevirtual rip/breeze/inject/î.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass11;
      // a8: areturn
      // a9: aconst_null
      // aa: areturn
      // try (32 -> 38): 39 java/lang/IllegalArgumentException
      // try (35 -> 50): 50 java/lang/IllegalArgumentException
      // try (54 -> 57): 58 java/lang/IllegalArgumentException
      // try (56 -> 62): 63 java/lang/IllegalArgumentException
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
      // 1d: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 20: istore 7
      // 22: aload 0
      // 23: iload 7
      // 25: ifne 52
      // 28: getfield rip/breeze/inject/î.int_ÿ_2 I
      // 2b: ldc 458752
      // 2d: if_icmpge 4e
      // 30: goto 37
      // 33: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: new java/lang/UnsupportedOperationException
      // 3a: dup
      // 3b: sipush 22019
      // 3e: ldc2_w 7615569151008403669
      // 41: lload 2
      // 42: lxor
      // 43: invokestatic rip/breeze/inject/î.method_022 (IJ)Ljava/lang/String;
      // 46: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 49: athrow
      // 4a: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 52: iload 7
      // 54: ifne 6c
      // 57: ifnull 85
      // 5a: goto 61
      // 5d: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 60: athrow
      // 61: aload 0
      // 62: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 65: goto 6c
      // 68: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6b: athrow
      // 6c: lload 5
      // 6e: aload 4
      // 70: bipush 2
      // 71: anewarray 4
      // 74: dup_x1
      // 75: swap
      // 76: bipush 1
      // 77: swap
      // 78: aastore
      // 79: dup_x2
      // 7a: dup_x2
      // 7b: pop
      // 7c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7f: bipush 0
      // 80: swap
      // 81: aastore
      // 82: invokevirtual rip/breeze/inject/î.method_004 ([Ljava/lang/Object;)V
      // 85: return
      // try (21 -> 27): 28 java/lang/IllegalArgumentException
      // try (24 -> 39): 39 java/lang/IllegalArgumentException
      // try (43 -> 46): 47 java/lang/IllegalArgumentException
      // try (45 -> 51): 52 java/lang/IllegalArgumentException
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
      // 32: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 35: iload 9
      // 37: ifeq 4f
      // 3a: ifnull 75
      // 3d: goto 44
      // 40: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 43: athrow
      // 44: aload 0
      // 45: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 48: goto 4f
      // 4b: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 72: invokevirtual rip/breeze/inject/î.method_005 ([Ljava/lang/Object;)V
      // 75: return
      // try (31 -> 36): 37 java/lang/IllegalArgumentException
      // try (35 -> 41): 42 java/lang/IllegalArgumentException
   }

   public ü invoke_6(Object[] param1) {
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
      // 2e: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 31: iload 8
      // 33: ifne 4b
      // 36: ifnull 6d
      // 39: goto 40
      // 3c: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 44: goto 4b
      // 47: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 69: invokevirtual rip/breeze/inject/î.method_006 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 6c: areturn
      // 6d: aconst_null
      // 6e: areturn
      // try (27 -> 32): 33 java/lang/IllegalArgumentException
      // try (31 -> 37): 38 java/lang/IllegalArgumentException
   }

   public ü invoke_7(Object[] param1) {
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
      // 45: getfield rip/breeze/inject/î.int_ÿ_2 I
      // 48: ldc 327680
      // 4a: if_icmpge 6b
      // 4d: goto 54
      // 50: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 53: athrow
      // 54: new java/lang/UnsupportedOperationException
      // 57: dup
      // 58: sipush 3613
      // 5b: ldc2_w 3169431838655279908
      // 5e: lload 3
      // 5f: lxor
      // 60: invokestatic rip/breeze/inject/î.method_022 (IJ)Ljava/lang/String;
      // 63: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 66: athrow
      // 67: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 6f: iload 10
      // 71: lload 3
      // 72: lconst_0
      // 73: lcmp
      // 74: iflt 90
      // 77: ifeq 8f
      // 7a: ifnull c3
      // 7d: goto 84
      // 80: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 83: athrow
      // 84: aload 0
      // 85: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 88: goto 8f
      // 8b: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // bf: invokevirtual rip/breeze/inject/î.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // c2: areturn
      // c3: aconst_null
      // c4: areturn
      // try (38 -> 44): 45 java/lang/IllegalArgumentException
      // try (41 -> 56): 56 java/lang/IllegalArgumentException
      // try (60 -> 67): 68 java/lang/IllegalArgumentException
      // try (66 -> 72): 73 java/lang/IllegalArgumentException
   }

   public void invoke_8(Object[] param1) {
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
      // 22: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 25: iload 7
      // 27: ifeq 3f
      // 2a: ifnull 57
      // 2d: goto 34
      // 30: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: aload 0
      // 35: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 54: invokevirtual rip/breeze/inject/î.method_008 ([Ljava/lang/Object;)V
      // 57: return
      // try (21 -> 26): 27 java/lang/IllegalArgumentException
      // try (25 -> 31): 32 java/lang/IllegalArgumentException
   }

   public void invoke_9(Object[] param1) {
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
      // 1c: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 1f: istore 7
      // 21: aload 0
      // 22: iload 7
      // 24: ifeq 50
      // 27: getfield rip/breeze/inject/î.int_ÿ_2 I
      // 2a: ldc 458752
      // 2c: if_icmpge 4c
      // 2f: goto 36
      // 32: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35: athrow
      // 36: new java/lang/UnsupportedOperationException
      // 39: dup
      // 3a: bipush 124
      // 3c: ldc2_w 7953447821245211254
      // 3f: lload 3
      // 40: lxor
      // 41: invokestatic rip/breeze/inject/î.method_022 (IJ)Ljava/lang/String;
      // 44: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 47: athrow
      // 48: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4b: athrow
      // 4c: aload 0
      // 4d: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 50: iload 7
      // 52: ifeq 6a
      // 55: ifnull 82
      // 58: goto 5f
      // 5b: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 63: goto 6a
      // 66: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 69: athrow
      // 6a: aload 2
      // 6b: lload 5
      // 6d: bipush 2
      // 6e: anewarray 4
      // 71: dup_x2
      // 72: dup_x2
      // 73: pop
      // 74: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 77: bipush 1
      // 78: swap
      // 79: aastore
      // 7a: dup_x1
      // 7b: swap
      // 7c: bipush 0
      // 7d: swap
      // 7e: aastore
      // 7f: invokevirtual rip/breeze/inject/î.method_009 ([Ljava/lang/Object;)V
      // 82: return
      // try (21 -> 27): 28 java/lang/IllegalArgumentException
      // try (24 -> 39): 39 java/lang/IllegalArgumentException
      // try (43 -> 46): 47 java/lang/IllegalArgumentException
      // try (45 -> 51): 52 java/lang/IllegalArgumentException
   }

   public void invoke_10(Object[] param1) {
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
      // 1d: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 20: istore 7
      // 22: aload 0
      // 23: iload 7
      // 25: ifne 52
      // 28: getfield rip/breeze/inject/î.int_ÿ_2 I
      // 2b: ldc 589824
      // 2d: if_icmpge 4e
      // 30: goto 37
      // 33: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: new java/lang/UnsupportedOperationException
      // 3a: dup
      // 3b: sipush 5684
      // 3e: ldc2_w 7708937991026372929
      // 41: lload 2
      // 42: lxor
      // 43: invokestatic rip/breeze/inject/î.method_022 (IJ)Ljava/lang/String;
      // 46: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 49: athrow
      // 4a: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 52: iload 7
      // 54: ifne 6c
      // 57: ifnull 85
      // 5a: goto 61
      // 5d: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 60: athrow
      // 61: aload 0
      // 62: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 65: goto 6c
      // 68: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6b: athrow
      // 6c: lload 5
      // 6e: aload 4
      // 70: bipush 2
      // 71: anewarray 4
      // 74: dup_x1
      // 75: swap
      // 76: bipush 1
      // 77: swap
      // 78: aastore
      // 79: dup_x2
      // 7a: dup_x2
      // 7b: pop
      // 7c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7f: bipush 0
      // 80: swap
      // 81: aastore
      // 82: invokevirtual rip/breeze/inject/î.method_010 ([Ljava/lang/Object;)V
      // 85: return
      // try (21 -> 27): 28 java/lang/IllegalArgumentException
      // try (24 -> 39): 39 java/lang/IllegalArgumentException
      // try (43 -> 46): 47 java/lang/IllegalArgumentException
      // try (45 -> 51): 52 java/lang/IllegalArgumentException
   }

   public void invoke_11(Object[] param1) {
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
      // 1a: checkcast java/lang/Long
      // 1d: invokevirtual java/lang/Long.longValue ()J
      // 20: lstore 5
      // 22: dup
      // 23: bipush 4
      // 24: aaload
      // 25: checkcast java/lang/Integer
      // 28: invokevirtual java/lang/Integer.intValue ()I
      // 2b: istore 7
      // 2d: pop
      // 2e: lload 5
      // 30: dup2
      // 31: ldc2_w 0
      // 34: lxor
      // 35: lstore 8
      // 37: pop2
      // 38: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 3b: istore 10
      // 3d: aload 0
      // 3e: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 41: iload 10
      // 43: ifne 5b
      // 46: ifnull 8a
      // 49: goto 50
      // 4c: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4f: athrow
      // 50: aload 0
      // 51: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 54: goto 5b
      // 57: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5a: athrow
      // 5b: aload 2
      // 5c: aload 3
      // 5d: aload 4
      // 5f: lload 8
      // 61: iload 7
      // 63: bipush 5
      // 64: anewarray 4
      // 67: dup_x1
      // 68: swap
      // 69: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6c: bipush 4
      // 6d: swap
      // 6e: aastore
      // 6f: dup_x2
      // 70: dup_x2
      // 71: pop
      // 72: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 75: bipush 3
      // 76: swap
      // 77: aastore
      // 78: dup_x1
      // 79: swap
      // 7a: bipush 2
      // 7b: swap
      // 7c: aastore
      // 7d: dup_x1
      // 7e: swap
      // 7f: bipush 1
      // 80: swap
      // 81: aastore
      // 82: dup_x1
      // 83: swap
      // 84: bipush 0
      // 85: swap
      // 86: aastore
      // 87: invokevirtual rip/breeze/inject/î.method_011 ([Ljava/lang/Object;)V
      // 8a: return
      // try (37 -> 42): 43 java/lang/IllegalArgumentException
      // try (41 -> 47): 48 java/lang/IllegalArgumentException
   }

   public BreezeClass7 invoke_12(Object[] param1) {
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
      // 1a: checkcast java/lang/Long
      // 1d: invokevirtual java/lang/Long.longValue ()J
      // 20: lstore 5
      // 22: pop
      // 23: lload 5
      // 25: dup2
      // 26: ldc2_w 0
      // 29: lxor
      // 2a: lstore 7
      // 2c: pop2
      // 2d: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 30: istore 9
      // 32: aload 0
      // 33: iload 9
      // 35: ifeq 63
      // 38: getfield rip/breeze/inject/î.int_ÿ_2 I
      // 3b: ldc 524288
      // 3d: if_icmpge 5f
      // 40: goto 47
      // 43: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: new java/lang/UnsupportedOperationException
      // 4a: dup
      // 4b: sipush 26118
      // 4e: ldc2_w 6459842929771491245
      // 51: lload 5
      // 53: lxor
      // 54: invokestatic rip/breeze/inject/î.method_022 (IJ)Ljava/lang/String;
      // 57: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 5a: athrow
      // 5b: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 63: iload 9
      // 65: ifeq 7d
      // 68: ifnull a3
      // 6b: goto 72
      // 6e: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 71: athrow
      // 72: aload 0
      // 73: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 76: goto 7d
      // 79: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7c: athrow
      // 7d: aload 2
      // 7e: aload 3
      // 7f: aload 4
      // 81: lload 7
      // 83: bipush 4
      // 84: anewarray 4
      // 87: dup_x2
      // 88: dup_x2
      // 89: pop
      // 8a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8d: bipush 3
      // 8e: swap
      // 8f: aastore
      // 90: dup_x1
      // 91: swap
      // 92: bipush 2
      // 93: swap
      // 94: aastore
      // 95: dup_x1
      // 96: swap
      // 97: bipush 1
      // 98: swap
      // 99: aastore
      // 9a: dup_x1
      // 9b: swap
      // 9c: bipush 0
      // 9d: swap
      // 9e: aastore
      // 9f: invokevirtual rip/breeze/inject/î.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass7;
      // a2: areturn
      // a3: aconst_null
      // a4: areturn
      // try (31 -> 37): 38 java/lang/IllegalArgumentException
      // try (34 -> 49): 49 java/lang/IllegalArgumentException
      // try (53 -> 56): 57 java/lang/IllegalArgumentException
      // try (55 -> 61): 62 java/lang/IllegalArgumentException
   }

   public ä invoke_13(Object[] param1) {
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
      // 15: checkcast java/lang/String
      // 18: astore 4
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast java/lang/String
      // 20: astore 5
      // 22: dup
      // 23: bipush 4
      // 24: aaload
      // 25: checkcast java/lang/Object
      // 28: astore 6
      // 2a: dup
      // 2b: bipush 5
      // 2c: aaload
      // 2d: checkcast java/lang/Long
      // 30: invokevirtual java/lang/Long.longValue ()J
      // 33: lstore 7
      // 35: pop
      // 36: lload 7
      // 38: dup2
      // 39: ldc2_w 0
      // 3c: lxor
      // 3d: lstore 9
      // 3f: pop2
      // 40: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 43: istore 11
      // 45: aload 0
      // 46: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 49: iload 11
      // 4b: ifeq 63
      // 4e: ifnull 9b
      // 51: goto 58
      // 54: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 57: athrow
      // 58: aload 0
      // 59: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 5c: goto 63
      // 5f: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: iload 2
      // 64: aload 3
      // 65: aload 4
      // 67: aload 5
      // 69: aload 6
      // 6b: lload 9
      // 6d: bipush 6
      // 6f: anewarray 4
      // 72: dup_x2
      // 73: dup_x2
      // 74: pop
      // 75: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 78: bipush 5
      // 79: swap
      // 7a: aastore
      // 7b: dup_x1
      // 7c: swap
      // 7d: bipush 4
      // 7e: swap
      // 7f: aastore
      // 80: dup_x1
      // 81: swap
      // 82: bipush 3
      // 83: swap
      // 84: aastore
      // 85: dup_x1
      // 86: swap
      // 87: bipush 2
      // 88: swap
      // 89: aastore
      // 8a: dup_x1
      // 8b: swap
      // 8c: bipush 1
      // 8d: swap
      // 8e: aastore
      // 8f: dup_x1
      // 90: swap
      // 91: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 94: bipush 0
      // 95: swap
      // 96: aastore
      // 97: invokevirtual rip/breeze/inject/î.method_013 ([Ljava/lang/Object;)Lrip/breeze/inject/ä;
      // 9a: areturn
      // 9b: aconst_null
      // 9c: areturn
      // try (42 -> 47): 48 java/lang/IllegalArgumentException
      // try (46 -> 52): 53 java/lang/IllegalArgumentException
   }

   public Util140 invoke_14(Object[] param1) {
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
      // 2d: dup
      // 2e: bipush 5
      // 2f: aaload
      // 30: checkcast [Ljava/lang/String;
      // 33: astore 8
      // 35: pop
      // 36: lload 3
      // 37: dup2
      // 38: ldc2_w 0
      // 3b: lxor
      // 3c: lstore 9
      // 3e: pop2
      // 3f: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 42: istore 11
      // 44: aload 0
      // 45: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 48: iload 11
      // 4a: ifeq 62
      // 4d: ifnull 9b
      // 50: goto 57
      // 53: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 56: athrow
      // 57: aload 0
      // 58: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 5b: goto 62
      // 5e: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 61: athrow
      // 62: iload 2
      // 63: lload 9
      // 65: aload 5
      // 67: aload 6
      // 69: aload 7
      // 6b: aload 8
      // 6d: bipush 6
      // 6f: anewarray 4
      // 72: dup_x1
      // 73: swap
      // 74: bipush 5
      // 75: swap
      // 76: aastore
      // 77: dup_x1
      // 78: swap
      // 79: bipush 4
      // 7a: swap
      // 7b: aastore
      // 7c: dup_x1
      // 7d: swap
      // 7e: bipush 3
      // 7f: swap
      // 80: aastore
      // 81: dup_x1
      // 82: swap
      // 83: bipush 2
      // 84: swap
      // 85: aastore
      // 86: dup_x2
      // 87: dup_x2
      // 88: pop
      // 89: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8c: bipush 1
      // 8d: swap
      // 8e: aastore
      // 8f: dup_x1
      // 90: swap
      // 91: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 94: bipush 0
      // 95: swap
      // 96: aastore
      // 97: invokevirtual rip/breeze/inject/î.method_014 ([Ljava/lang/Object;)Lrip/breeze/inject/Util140;
      // 9a: areturn
      // 9b: aconst_null
      // 9c: areturn
      // try (42 -> 47): 48 java/lang/IllegalArgumentException
      // try (46 -> 52): 53 java/lang/IllegalArgumentException
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
      // 1b: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 1e: iload 6
      // 20: ifeq 38
      // 23: ifnull 4a
      // 26: goto 2d
      // 29: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/î.î_þ_2 Lrip/breeze/inject/î;
      // 31: goto 38
      // 34: invokestatic rip/breeze/inject/î.method_020 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 47: invokevirtual rip/breeze/inject/î.method_015 ([Ljava/lang/Object;)V
      // 4a: return
      // try (16 -> 21): 22 java/lang/IllegalArgumentException
      // try (20 -> 26): 27 java/lang/IllegalArgumentException
   }

   public static void execute_18(int[] var0) {
      arr_ý_2 = var0;
   }

   public static int[] invoke_19() {
      return arr_ý_2;
   }

   static {
      int[] var10000 = new int[3];
      method_018(var10000);
      long var0 = 71150548986718L;
      Cipher var2;
      Cipher var19 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var19.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[8];
      int var5 = 0;
      String var6 = "\u0097«ä\u008d©Il\u0084Ð¢\u0083Ëòë\u008dQìÇW\u001d£\u0013fÜÿ\u0005\u001aî-JG¾\u009eéÁOAò8ÞÉr\u0015\u0083ýã»vj&\u008bHN\u001cíWH%\u00adkÂßÂäñL\u0017E\u008c\u0017\u0087»Xñ\u0097\u0012\u0003ôe\fAÇ)\t\u0011×2|¸7ÇÓ\u0089 b¤)\u001a¸ìUq@V)aà\u0083\u001f4LÕ\u008eNwÔTMÎëÂ@òX~n\u008e\u0093+8}\u0096ÿ{Y ë\u0081oâ\u000e¸\u0089¼ÃÁq\u0080dõ»\u0010:×È·r\u00846\u0003L²#¨.ð\tÆ\u0099\u0000?\u001f×´QxRt\u0091\u0091p\u0016E¢s7(Jø\u0093âñàËÃ\u0010$Ý\u008a\u0016\u009eZ7ÞØÄ²¼ö|[@\u0099EÅ7åN?¨Ç¢\fzt&\u0099(F\fÙÚ8ê\u0017®¡C=\u0018-#FT>\u0016öû½èÄ\u001fÊ{©\b\u0083mñ\u0014êtºÚ-\u000eBE(gÞs±{Ê\u009c\u0011¡\u009a\u0098\u0005FK\u0088\"ü\u009c\u001e\u00946\u0003\t^ÙDklV,% Ì©\u009eÜm&`Õ";
      int var7 = "\u0097«ä\u008d©Il\u0084Ð¢\u0083Ëòë\u008dQìÇW\u001d£\u0013fÜÿ\u0005\u001aî-JG¾\u009eéÁOAò8ÞÉr\u0015\u0083ýã»vj&\u008bHN\u001cíWH%\u00adkÂßÂäñL\u0017E\u008c\u0017\u0087»Xñ\u0097\u0012\u0003ôe\fAÇ)\t\u0011×2|¸7ÇÓ\u0089 b¤)\u001a¸ìUq@V)aà\u0083\u001f4LÕ\u008eNwÔTMÎëÂ@òX~n\u008e\u0093+8}\u0096ÿ{Y ë\u0081oâ\u000e¸\u0089¼ÃÁq\u0080dõ»\u0010:×È·r\u00846\u0003L²#¨.ð\tÆ\u0099\u0000?\u001f×´QxRt\u0091\u0091p\u0016E¢s7(Jø\u0093âñàËÃ\u0010$Ý\u008a\u0016\u009eZ7ÞØÄ²¼ö|[@\u0099EÅ7åN?¨Ç¢\fzt&\u0099(F\fÙÚ8ê\u0017®¡C=\u0018-#FT>\u0016öû½èÄ\u001fÊ{©\b\u0083mñ\u0014êtºÚ-\u000eBE(gÞs±{Ê\u009c\u0011¡\u009a\u0098\u0005FK\u0088\"ü\u009c\u001e\u00946\u0003\t^ÙDklV,% Ì©\u009eÜm&`Õ"
         .length();
      char var8 = '8';
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = method_021(var11).intern();
         if ((var9 += var8) >= var7) {
            var6 = "¤XäB~ÏT\u000bíÉ\u008f\u009e÷£\u0093ÇJ{ô\u009a\u0016¨\u0099æÞ÷°\u000e%\u0003j34~1\u0084þwÃ (u\u001eLÚí ª\u0006+|7,7¢û\u008b\u0083RÔ¯:q\u0003J\u001eµSï>\u0091\u009fE\u008e\u0083`øI 7\u0011";
            var7 = "¤XäB~ÏT\u000bíÉ\u008f\u009e÷£\u0093ÇJ{ô\u009a\u0016¨\u0099æÞ÷°\u000e%\u0003j34~1\u0084þwÃ (u\u001eLÚí ª\u0006+|7,7¢û\u008b\u0083RÔ¯:q\u0003J\u001eµSï>\u0091\u009fE\u008e\u0083`øI 7\u0011"
               .length();
            var8 = '(';
            var9 = -1;

            while (true) {
               var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
               var4[var5++] = method_021(var11).intern();
               if ((var9 += var8) >= var7) {
                  CONST_D_2 = var4;
                  CONST_E_2 = new String[8];
                  return;
               }

               var8 = var6.charAt(var9);
            }
         }

         var8 = var6.charAt(var9);
      }
   }

   private static IllegalArgumentException invoke_20(IllegalArgumentException var0) {
      return var0;
   }

   private static String invoke_21(byte[] var0) {
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

   private static String invoke_22(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5296;
      if (CONST_E_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_F_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_F_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/î", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_D_2[var3].getBytes("ISO-8859-1");
         CONST_E_2[var3] = method_021(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_E_2[var3];
   }
}
