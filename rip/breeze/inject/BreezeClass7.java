package rip.breeze.inject;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class BreezeClass7 {
   protected final int int_ÿ;
   protected BreezeClass7 breezeClass7_þ;
   private static final String CONST_C;

   protected BreezeClass7(int var1, long var2) {
      var2 = 135103083487484L ^ var2;
      long var4 = var2 ^ 105419705833255L;
      this(var1, null, var4);
   }

   protected BreezeClass7(int param1, BreezeClass7 param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/inject/BreezeClass7.135103083487484L J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 4134630865022
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 27485948460897
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
      // 02d: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 030: athrow
      // 031: iload 1
      // 032: ldc 524288
      // 034: iload 9
      // 036: ifeq 0f7
      // 039: goto 040
      // 03c: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03f: athrow
      // 040: if_icmpeq 0f4
      // 043: goto 04a
      // 046: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 049: athrow
      // 04a: iload 1
      // 04b: ldc 458752
      // 04d: iload 9
      // 04f: ifeq 0f7
      // 052: goto 059
      // 055: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 058: athrow
      // 059: if_icmpeq 0f4
      // 05c: goto 063
      // 05f: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 062: athrow
      // 063: iload 1
      // 064: ldc 393216
      // 066: iload 9
      // 068: ifeq 0f7
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 071: athrow
      // 072: if_icmpeq 0f4
      // 075: goto 07c
      // 078: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07b: athrow
      // 07c: iload 1
      // 07d: ldc 327680
      // 07f: iload 9
      // 081: ifeq 0f7
      // 084: goto 08b
      // 087: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08a: athrow
      // 08b: if_icmpeq 0f4
      // 08e: goto 095
      // 091: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 094: athrow
      // 095: iload 1
      // 096: ldc 262144
      // 098: iload 9
      // 09a: ifeq 0f7
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: if_icmpeq 0f4
      // 0a7: goto 0ae
      // 0aa: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: iload 1
      // 0af: ldc 17432576
      // 0b1: lload 3
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: ifle 0f7
      // 0b7: iload 9
      // 0b9: ifeq 0f7
      // 0bc: goto 0c3
      // 0bf: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: if_icmpeq 0f4
      // 0c6: goto 0cd
      // 0c9: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 0e9: invokestatic rip/breeze/inject/BreezeClass7.buildString ([Ljava/lang/Object;)Ljava/lang/String;
      // 0ec: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0ef: athrow
      // 0f0: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 115: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 1
      // 11b: putfield rip/breeze/inject/BreezeClass7.int_ÿ I
      // 11e: aload 0
      // 11f: aload 2
      // 120: putfield rip/breeze/inject/BreezeClass7.breezeClass7_þ Lrip/breeze/inject/BreezeClass7;
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

   private static String buildString(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      var2 = 135103083487484L ^ var2;
      return CONST_C + var1;
   }

   public BreezeClass7 getBreezeClass7(Object[] var1) {
      return this.breezeClass7_þ;
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
      // 27: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 2a: istore 8
      // 2c: aload 0
      // 2d: getfield rip/breeze/inject/BreezeClass7.breezeClass7_þ Lrip/breeze/inject/BreezeClass7;
      // 30: iload 8
      // 32: ifeq 4a
      // 35: ifnull 6d
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield rip/breeze/inject/BreezeClass7.breezeClass7_þ Lrip/breeze/inject/BreezeClass7;
      // 43: goto 4a
      // 46: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 69: invokevirtual rip/breeze/inject/BreezeClass7.getÜ ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 6c: areturn
      // 6d: aconst_null
      // 6e: areturn
      // try (27 -> 32): 33 java/lang/IllegalArgumentException
      // try (31 -> 37): 38 java/lang/IllegalArgumentException
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
      // 19: checkcast rip/breeze/inject/և
      // 1c: astore 5
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/String
      // 24: astore 6
      // 26: dup
      // 27: bipush 4
      // 28: aaload
      // 29: checkcast java/lang/Boolean
      // 2c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f: istore 7
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
      // 41: getfield rip/breeze/inject/BreezeClass7.breezeClass7_þ Lrip/breeze/inject/BreezeClass7;
      // 44: iload 10
      // 46: ifne 5e
      // 49: ifnull 93
      // 4c: goto 53
      // 4f: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52: athrow
      // 53: aload 0
      // 54: getfield rip/breeze/inject/BreezeClass7.breezeClass7_þ Lrip/breeze/inject/BreezeClass7;
      // 57: goto 5e
      // 5a: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d: athrow
      // 5e: lload 8
      // 60: iload 4
      // 62: aload 5
      // 64: aload 6
      // 66: iload 7
      // 68: bipush 5
      // 69: anewarray 4
      // 6c: dup_x1
      // 6d: swap
      // 6e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 71: bipush 4
      // 72: swap
      // 73: aastore
      // 74: dup_x1
      // 75: swap
      // 76: bipush 3
      // 77: swap
      // 78: aastore
      // 79: dup_x1
      // 7a: swap
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
      // 8f: invokevirtual rip/breeze/inject/BreezeClass7.getÜ_2 ([Ljava/lang/Object;)Lrip/breeze/inject/ü;
      // 92: areturn
      // 93: aconst_null
      // 94: areturn
      // try (38 -> 43): 44 java/lang/IllegalArgumentException
      // try (42 -> 48): 49 java/lang/IllegalArgumentException
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
      // 22: getfield rip/breeze/inject/BreezeClass7.breezeClass7_þ Lrip/breeze/inject/BreezeClass7;
      // 25: iload 7
      // 27: ifeq 3f
      // 2a: ifnull 57
      // 2d: goto 34
      // 30: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: aload 0
      // 35: getfield rip/breeze/inject/BreezeClass7.breezeClass7_þ Lrip/breeze/inject/BreezeClass7;
      // 38: goto 3f
      // 3b: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 54: invokevirtual rip/breeze/inject/BreezeClass7.processAll ([Ljava/lang/Object;)V
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
      // 1b: getfield rip/breeze/inject/BreezeClass7.breezeClass7_þ Lrip/breeze/inject/BreezeClass7;
      // 1e: iload 6
      // 20: ifeq 38
      // 23: ifnull 4a
      // 26: goto 2d
      // 29: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/BreezeClass7.breezeClass7_þ Lrip/breeze/inject/BreezeClass7;
      // 31: goto 38
      // 34: invokestatic rip/breeze/inject/BreezeClass7.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
      // 47: invokevirtual rip/breeze/inject/BreezeClass7.processAll_2 ([Ljava/lang/Object;)V
      // 4a: return
      // try (16 -> 21): 22 java/lang/IllegalArgumentException
      // try (20 -> 26): 27 java/lang/IllegalArgumentException
   }

   static {
      long var0 = 101781876479579L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var5 = var2.doFinal("\u000fíî®·sPJô\bç\\ù\u0095w\u0083\u009c÷\u0098g:4}¼".getBytes("ISO-8859-1"));
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
