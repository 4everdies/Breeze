package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ð {
   byte[] arr_ÿ_2;
   int int_þ_2;
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   public ð() {
      this.arr_ÿ_2 = new byte[64];
   }

   public ð(int var1) {
      this.arr_ÿ_2 = new byte[var1];
   }

   ð(byte[] var1) {
      this.arr_ÿ_2 = var1;
      this.int_þ_2 = var1.length;
   }

   public int invoke_1(Object[] var1) {
      return this.int_þ_2;
   }

   public ð invoke_2(Object[] param1) {
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
      // 16: getstatic rip/breeze/inject/ð.encKey_a_2 J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: lload 3
      // 1d: dup2
      // 1e: ldc2_w 113084943370075
      // 21: lxor
      // 22: lstore 5
      // 24: pop2
      // 25: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 28: aload 0
      // 29: getfield rip/breeze/inject/ð.int_þ_2 I
      // 2c: istore 7
      // 2e: istore 8
      // 30: iload 8
      // 32: ifne 7d
      // 35: iload 7
      // 37: bipush 1
      // 38: iadd
      // 39: aload 0
      // 3a: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 3d: arraylength
      // 3e: if_icmple 6b
      // 41: goto 48
      // 44: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 47: athrow
      // 48: aload 0
      // 49: bipush 1
      // 4a: lload 5
      // 4c: bipush 2
      // 4d: anewarray 4
      // 50: dup_x2
      // 51: dup_x2
      // 52: pop
      // 53: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 56: bipush 1
      // 57: swap
      // 58: aastore
      // 59: dup_x1
      // 5a: swap
      // 5b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5e: bipush 0
      // 5f: swap
      // 60: aastore
      // 61: invokevirtual rip/breeze/inject/ð.method_013 ([Ljava/lang/Object;)V
      // 64: goto 6b
      // 67: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 6f: iload 7
      // 71: iinc 7 1
      // 74: iload 2
      // 75: i2b
      // 76: bastore
      // 77: aload 0
      // 78: iload 7
      // 7a: putfield rip/breeze/inject/ð.int_þ_2 I
      // 7d: aload 0
      // 7e: areturn
      // try (29 -> 38): 39 java/lang/IllegalArgumentException
      // try (31 -> 60): 61 java/lang/IllegalArgumentException
   }

   final ð invoke_3(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      int var5 = (Integer)var1[2];
      var3 = encKey_a_2 ^ var3;
      long var6 = var3 ^ 115274141907017L;
      int var8 = this.int_þ_2;

      try {
         if (var8 + 2 > this.arr_ÿ_2.length) {
            Object[] var10004 = new Object[]{null, var6};
            var10004[0] = 2;
            this.method_013(var10004);
         }
      } catch (IllegalArgumentException var10) {
         throw method_014(var10);
      }

      byte[] var9 = this.arr_ÿ_2;
      var9[var8++] = (byte)var2;
      var9[var8++] = (byte)var5;
      this.int_þ_2 = var8;
      return this;
   }

   public ð invoke_4(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 24844750963718L;
      int var7 = this.int_þ_2;

      try {
         if (var7 + 2 > this.arr_ÿ_2.length) {
            Object[] var10004 = new Object[]{null, var5};
            var10004[0] = 2;
            this.method_013(var10004);
         }
      } catch (IllegalArgumentException var9) {
         throw method_014(var9);
      }

      byte[] var8 = this.arr_ÿ_2;
      var8[var7++] = (byte)(var2 >>> 8);
      var8[var7++] = (byte)var2;
      this.int_þ_2 = var7;
      return this;
   }

   final ð invoke_5(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      int var5 = (Integer)var1[2];
      var3 = encKey_a_2 ^ var3;
      long var6 = var3 ^ 88938138295411L;
      int var8 = this.int_þ_2;

      try {
         if (var8 + 3 > this.arr_ÿ_2.length) {
            Object[] var10004 = new Object[]{null, var6};
            var10004[0] = 3;
            this.method_013(var10004);
         }
      } catch (IllegalArgumentException var10) {
         throw method_014(var10);
      }

      byte[] var9 = this.arr_ÿ_2;
      var9[var8++] = (byte)var2;
      var9[var8++] = (byte)(var5 >>> 8);
      var9[var8++] = (byte)var5;
      this.int_þ_2 = var8;
      return this;
   }

   final ð invoke_6(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      long var5 = (Long)var1[3];
      var5 = encKey_a_2 ^ var5;
      long var7 = var5 ^ 102739219211223L;
      int var9 = this.int_þ_2;

      try {
         if (var9 + 4 > this.arr_ÿ_2.length) {
            Object[] var10004 = new Object[]{null, var7};
            var10004[0] = 4;
            this.method_013(var10004);
         }
      } catch (IllegalArgumentException var11) {
         throw method_014(var11);
      }

      byte[] var10 = this.arr_ÿ_2;
      var10[var9++] = (byte)var2;
      var10[var9++] = (byte)var3;
      var10[var9++] = (byte)(var4 >>> 8);
      var10[var9++] = (byte)var4;
      this.int_þ_2 = var9;
      return this;
   }

   public ð invoke_7(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 101047717123385L;
      int var7 = this.int_þ_2;

      try {
         if (var7 + 4 > this.arr_ÿ_2.length) {
            Object[] var10004 = new Object[]{null, var5};
            var10004[0] = 4;
            this.method_013(var10004);
         }
      } catch (IllegalArgumentException var9) {
         throw method_014(var9);
      }

      byte[] var8 = this.arr_ÿ_2;
      var8[var7++] = (byte)(var2 >>> 24);
      var8[var7++] = (byte)(var2 >>> 16);
      var8[var7++] = (byte)(var2 >>> 8);
      var8[var7++] = (byte)var2;
      this.int_þ_2 = var7;
      return this;
   }

   final ð invoke_8(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      long var4 = (Long)var1[2];
      int var6 = (Integer)var1[3];
      var4 = encKey_a_2 ^ var4;
      long var7 = var4 ^ 134787664829778L;
      int var9 = this.int_þ_2;

      try {
         if (var9 + 5 > this.arr_ÿ_2.length) {
            Object[] var10004 = new Object[]{null, var7};
            var10004[0] = 5;
            this.method_013(var10004);
         }
      } catch (IllegalArgumentException var11) {
         throw method_014(var11);
      }

      byte[] var10 = this.arr_ÿ_2;
      var10[var9++] = (byte)var2;
      var10[var9++] = (byte)(var3 >>> 8);
      var10[var9++] = (byte)var3;
      var10[var9++] = (byte)(var6 >>> 8);
      var10[var9++] = (byte)var6;
      this.int_þ_2 = var9;
      return this;
   }

   public ð invoke_9(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = (Long)var1[1];
      var4 = encKey_a_2 ^ var4;
      long var6 = var4 ^ 120788011734357L;
      int var8 = this.int_þ_2;

      try {
         if (var8 + 8 > this.arr_ÿ_2.length) {
            Object[] var10004 = new Object[]{null, var6};
            var10004[0] = 8;
            this.method_013(var10004);
         }
      } catch (IllegalArgumentException var11) {
         throw method_014(var11);
      }

      byte[] var9 = this.arr_ÿ_2;
      int var10 = (int)(var2 >>> 32);
      var9[var8++] = (byte)(var10 >>> 24);
      var9[var8++] = (byte)(var10 >>> 16);
      var9[var8++] = (byte)(var10 >>> 8);
      var9[var8++] = (byte)var10;
      var10 = (int)var2;
      var9[var8++] = (byte)(var10 >>> 24);
      var9[var8++] = (byte)(var10 >>> 16);
      var9[var8++] = (byte)(var10 >>> 8);
      var9[var8++] = (byte)var10;
      this.int_þ_2 = var8;
      return this;
   }

   public ð invoke_10(Object[] param1) {
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
      // 00e: checkcast java/lang/String
      // 011: astore 4
      // 013: pop
      // 014: getstatic rip/breeze/inject/ð.encKey_a_2 J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 34428576443414
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 128947877662609
      // 026: lxor
      // 027: lstore 7
      // 029: pop2
      // 02a: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 02d: aload 4
      // 02f: invokevirtual java/lang/String.length ()I
      // 032: istore 9
      // 034: istore 10
      // 036: iload 9
      // 038: iload 10
      // 03a: ifne 064
      // 03d: ldc 65535
      // 03f: if_icmple 060
      // 042: goto 049
      // 045: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 048: athrow
      // 049: new java/lang/IllegalArgumentException
      // 04c: dup
      // 04d: sipush 31939
      // 050: ldc2_w 6728271799916037748
      // 053: lload 2
      // 054: lxor
      // 055: invokestatic rip/breeze/inject/ð.method_016 (IJ)Ljava/lang/String;
      // 058: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 05b: athrow
      // 05c: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield rip/breeze/inject/ð.int_þ_2 I
      // 064: istore 11
      // 066: lload 2
      // 067: lconst_0
      // 068: lcmp
      // 069: ifle 09a
      // 06c: iload 11
      // 06e: bipush 2
      // 06f: iadd
      // 070: iload 9
      // 072: iadd
      // 073: aload 0
      // 074: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 077: arraylength
      // 078: if_icmple 0a1
      // 07b: aload 0
      // 07c: bipush 2
      // 07d: iload 9
      // 07f: iadd
      // 080: lload 5
      // 082: bipush 2
      // 083: anewarray 4
      // 086: dup_x2
      // 087: dup_x2
      // 088: pop
      // 089: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08c: bipush 1
      // 08d: swap
      // 08e: aastore
      // 08f: dup_x1
      // 090: swap
      // 091: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 094: bipush 0
      // 095: swap
      // 096: aastore
      // 097: invokevirtual rip/breeze/inject/ð.method_013 ([Ljava/lang/Object;)V
      // 09a: goto 0a1
      // 09d: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 0a5: astore 12
      // 0a7: aload 12
      // 0a9: iload 11
      // 0ab: iinc 11 1
      // 0ae: iload 9
      // 0b0: bipush 8
      // 0b2: iushr
      // 0b3: i2b
      // 0b4: bastore
      // 0b5: aload 12
      // 0b7: iload 11
      // 0b9: iinc 11 1
      // 0bc: iload 9
      // 0be: i2b
      // 0bf: bastore
      // 0c0: bipush 0
      // 0c1: istore 13
      // 0c3: iload 13
      // 0c5: iload 9
      // 0c7: if_icmpge 172
      // 0ca: aload 4
      // 0cc: iload 13
      // 0ce: invokevirtual java/lang/String.charAt (I)C
      // 0d1: istore 14
      // 0d3: iload 10
      // 0d5: lload 2
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: iflt 0e0
      // 0db: ifne 17e
      // 0de: iload 10
      // 0e0: ifne 13b
      // 0e3: goto 0ea
      // 0e6: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e9: athrow
      // 0ea: lload 2
      // 0eb: lconst_0
      // 0ec: lcmp
      // 0ed: iflt 134
      // 0f0: iload 14
      // 0f2: bipush 1
      // 0f3: if_icmplt 12e
      // 0f6: goto 0fd
      // 0f9: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fc: athrow
      // 0fd: lload 2
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: iflt 134
      // 103: iload 14
      // 105: bipush 127
      // 107: if_icmpgt 12e
      // 10a: goto 111
      // 10d: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 110: athrow
      // 111: aload 12
      // 113: iload 11
      // 115: iinc 11 1
      // 118: iload 14
      // 11a: i2b
      // 11b: bastore
      // 11c: iload 10
      // 11e: lload 2
      // 11f: lconst_0
      // 120: lcmp
      // 121: iflt 16f
      // 124: ifeq 16a
      // 127: goto 12e
      // 12a: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12d: athrow
      // 12e: aload 0
      // 12f: iload 11
      // 131: putfield rip/breeze/inject/ð.int_þ_2 I
      // 134: goto 13b
      // 137: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13a: athrow
      // 13b: aload 0
      // 13c: aload 4
      // 13e: lload 7
      // 140: iload 13
      // 142: ldc 65535
      // 144: bipush 4
      // 145: anewarray 4
      // 148: dup_x1
      // 149: swap
      // 14a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14d: bipush 3
      // 14e: swap
      // 14f: aastore
      // 150: dup_x1
      // 151: swap
      // 152: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 155: bipush 2
      // 156: swap
      // 157: aastore
      // 158: dup_x2
      // 159: dup_x2
      // 15a: pop
      // 15b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15e: bipush 1
      // 15f: swap
      // 160: aastore
      // 161: dup_x1
      // 162: swap
      // 163: bipush 0
      // 164: swap
      // 165: aastore
      // 166: invokevirtual rip/breeze/inject/ð.method_011 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 169: areturn
      // 16a: iinc 13 1
      // 16d: iload 10
      // 16f: ifeq 0c3
      // 172: aload 0
      // 173: iload 11
      // 175: putfield rip/breeze/inject/ð.int_þ_2 I
      // 178: lload 2
      // 179: lconst_0
      // 17a: lcmp
      // 17b: iflt 17e
      // 17e: aload 0
      // 17f: areturn
      // try (32 -> 37): 38 java/lang/IllegalArgumentException
      // try (35 -> 49): 49 java/lang/IllegalArgumentException
      // try (54 -> 88): 89 java/lang/IllegalArgumentException
      // try (117 -> 125): 126 java/lang/IllegalArgumentException
      // try (123 -> 135): 136 java/lang/IllegalArgumentException
      // try (128 -> 145): 146 java/lang/IllegalArgumentException
      // try (138 -> 160): 161 java/lang/IllegalArgumentException
      // try (148 -> 166): 167 java/lang/IllegalArgumentException
   }

   final ð invoke_11(Object[] param1) {
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
      // 004: checkcast java/lang/String
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
      // 020: checkcast java/lang/Integer
      // 023: invokevirtual java/lang/Integer.intValue ()I
      // 026: istore 6
      // 028: pop
      // 029: getstatic rip/breeze/inject/ð.encKey_a_2 J
      // 02c: lload 3
      // 02d: lxor
      // 02e: lstore 3
      // 02f: lload 3
      // 030: dup2
      // 031: ldc2_w 68399102106070
      // 034: lxor
      // 035: lstore 7
      // 037: pop2
      // 038: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 03b: aload 2
      // 03c: invokevirtual java/lang/String.length ()I
      // 03f: istore 9
      // 041: istore 10
      // 043: iload 5
      // 045: istore 11
      // 047: iload 5
      // 049: istore 12
      // 04b: iload 12
      // 04d: iload 9
      // 04f: if_icmpge 0f5
      // 052: aload 2
      // 053: iload 12
      // 055: invokevirtual java/lang/String.charAt (I)C
      // 058: istore 13
      // 05a: iload 13
      // 05c: bipush 1
      // 05d: iload 10
      // 05f: lload 3
      // 060: lconst_0
      // 061: lcmp
      // 062: ifle 107
      // 065: ifeq 0ff
      // 068: iload 10
      // 06a: ifeq 0cb
      // 06d: goto 074
      // 070: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 073: athrow
      // 074: lload 3
      // 075: lconst_0
      // 076: lcmp
      // 077: ifle 0c4
      // 07a: if_icmplt 0bf
      // 07d: goto 084
      // 080: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 083: athrow
      // 084: iload 13
      // 086: bipush 127
      // 088: lload 3
      // 089: lconst_0
      // 08a: lcmp
      // 08b: ifle 0cb
      // 08e: iload 10
      // 090: ifeq 0cb
      // 093: goto 09a
      // 096: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 099: athrow
      // 09a: lload 3
      // 09b: lconst_0
      // 09c: lcmp
      // 09d: ifle 0c4
      // 0a0: if_icmpgt 0bf
      // 0a3: goto 0aa
      // 0a6: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a9: athrow
      // 0aa: iinc 11 1
      // 0ad: iload 10
      // 0af: lload 3
      // 0b0: lconst_0
      // 0b1: lcmp
      // 0b2: ifle 0f2
      // 0b5: ifne 0ed
      // 0b8: goto 0bf
      // 0bb: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0be: athrow
      // 0bf: iload 13
      // 0c1: sipush 2047
      // 0c4: goto 0cb
      // 0c7: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ca: athrow
      // 0cb: if_icmpgt 0e3
      // 0ce: iinc 11 2
      // 0d1: iload 10
      // 0d3: lload 3
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: iflt 0f2
      // 0d9: ifne 0ed
      // 0dc: goto 0e3
      // 0df: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e2: athrow
      // 0e3: iinc 11 3
      // 0e6: goto 0ed
      // 0e9: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ec: athrow
      // 0ed: iinc 12 1
      // 0f0: iload 10
      // 0f2: ifne 04b
      // 0f5: iload 11
      // 0f7: lload 3
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: ifle 058
      // 0fd: iload 6
      // 0ff: lload 3
      // 100: lconst_0
      // 101: lcmp
      // 102: iflt 13a
      // 105: iload 10
      // 107: ifeq 133
      // 10a: if_icmple 12b
      // 10d: goto 114
      // 110: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 113: athrow
      // 114: new java/lang/IllegalArgumentException
      // 117: dup
      // 118: sipush 12283
      // 11b: ldc2_w 3741347548279169166
      // 11e: lload 3
      // 11f: lxor
      // 120: invokestatic rip/breeze/inject/ð.method_016 (IJ)Ljava/lang/String;
      // 123: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 126: athrow
      // 127: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12a: athrow
      // 12b: aload 0
      // 12c: getfield rip/breeze/inject/ð.int_þ_2 I
      // 12f: iload 5
      // 131: isub
      // 132: bipush 2
      // 133: isub
      // 134: istore 12
      // 136: iload 12
      // 138: iload 10
      // 13a: lload 3
      // 13b: lconst_0
      // 13c: lcmp
      // 13d: ifle 179
      // 140: ifeq 177
      // 143: iflt 16d
      // 146: goto 14d
      // 149: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14c: athrow
      // 14d: aload 0
      // 14e: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 151: iload 12
      // 153: iload 11
      // 155: bipush 8
      // 157: iushr
      // 158: i2b
      // 159: bastore
      // 15a: aload 0
      // 15b: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 15e: iload 12
      // 160: bipush 1
      // 161: iadd
      // 162: iload 11
      // 164: i2b
      // 165: bastore
      // 166: goto 16d
      // 169: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16c: athrow
      // 16d: aload 0
      // 16e: getfield rip/breeze/inject/ð.int_þ_2 I
      // 171: iload 11
      // 173: iadd
      // 174: iload 5
      // 176: isub
      // 177: iload 10
      // 179: lload 3
      // 17a: lconst_0
      // 17b: lcmp
      // 17c: iflt 187
      // 17f: ifeq 1bc
      // 182: aload 0
      // 183: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 186: arraylength
      // 187: if_icmple 1b8
      // 18a: goto 191
      // 18d: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 190: athrow
      // 191: aload 0
      // 192: iload 11
      // 194: iload 5
      // 196: isub
      // 197: lload 7
      // 199: bipush 2
      // 19a: anewarray 4
      // 19d: dup_x2
      // 19e: dup_x2
      // 19f: pop
      // 1a0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a3: bipush 1
      // 1a4: swap
      // 1a5: aastore
      // 1a6: dup_x1
      // 1a7: swap
      // 1a8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ab: bipush 0
      // 1ac: swap
      // 1ad: aastore
      // 1ae: invokevirtual rip/breeze/inject/ð.method_013 ([Ljava/lang/Object;)V
      // 1b1: goto 1b8
      // 1b4: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: getfield rip/breeze/inject/ð.int_þ_2 I
      // 1bc: istore 13
      // 1be: iload 5
      // 1c0: istore 14
      // 1c2: iload 14
      // 1c4: iload 9
      // 1c6: if_icmpge 2dd
      // 1c9: aload 2
      // 1ca: iload 14
      // 1cc: invokevirtual java/lang/String.charAt (I)C
      // 1cf: istore 15
      // 1d1: iload 10
      // 1d3: lload 3
      // 1d4: lconst_0
      // 1d5: lcmp
      // 1d6: iflt 1de
      // 1d9: ifeq 2e9
      // 1dc: iload 15
      // 1de: bipush 1
      // 1df: iload 10
      // 1e1: ifeq 24c
      // 1e4: goto 1eb
      // 1e7: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ea: athrow
      // 1eb: lload 3
      // 1ec: lconst_0
      // 1ed: lcmp
      // 1ee: iflt 245
      // 1f1: if_icmplt 240
      // 1f4: goto 1fb
      // 1f7: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1fa: athrow
      // 1fb: iload 15
      // 1fd: bipush 127
      // 1ff: lload 3
      // 200: lconst_0
      // 201: lcmp
      // 202: iflt 24c
      // 205: iload 10
      // 207: ifeq 24c
      // 20a: goto 211
      // 20d: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 210: athrow
      // 211: lload 3
      // 212: lconst_0
      // 213: lcmp
      // 214: iflt 245
      // 217: if_icmpgt 240
      // 21a: goto 221
      // 21d: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 220: athrow
      // 221: aload 0
      // 222: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 225: iload 13
      // 227: iinc 13 1
      // 22a: iload 15
      // 22c: i2b
      // 22d: bastore
      // 22e: iload 10
      // 230: lload 3
      // 231: lconst_0
      // 232: lcmp
      // 233: iflt 2da
      // 236: ifne 2d5
      // 239: goto 240
      // 23c: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23f: athrow
      // 240: iload 15
      // 242: sipush 2047
      // 245: goto 24c
      // 248: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24b: athrow
      // 24c: if_icmpgt 28c
      // 24f: aload 0
      // 250: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 253: iload 13
      // 255: iinc 13 1
      // 258: sipush 192
      // 25b: iload 15
      // 25d: bipush 6
      // 25f: ishr
      // 260: bipush 31
      // 262: iand
      // 263: ior
      // 264: i2b
      // 265: bastore
      // 266: aload 0
      // 267: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 26a: iload 13
      // 26c: iinc 13 1
      // 26f: sipush 128
      // 272: iload 15
      // 274: bipush 63
      // 276: iand
      // 277: ior
      // 278: i2b
      // 279: bastore
      // 27a: iload 10
      // 27c: lload 3
      // 27d: lconst_0
      // 27e: lcmp
      // 27f: iflt 2da
      // 282: ifne 2d5
      // 285: goto 28c
      // 288: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28b: athrow
      // 28c: aload 0
      // 28d: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 290: iload 13
      // 292: iinc 13 1
      // 295: sipush 224
      // 298: iload 15
      // 29a: bipush 12
      // 29c: ishr
      // 29d: bipush 15
      // 29f: iand
      // 2a0: ior
      // 2a1: i2b
      // 2a2: bastore
      // 2a3: aload 0
      // 2a4: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 2a7: iload 13
      // 2a9: iinc 13 1
      // 2ac: sipush 128
      // 2af: iload 15
      // 2b1: bipush 6
      // 2b3: ishr
      // 2b4: bipush 63
      // 2b6: iand
      // 2b7: ior
      // 2b8: i2b
      // 2b9: bastore
      // 2ba: aload 0
      // 2bb: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 2be: iload 13
      // 2c0: iinc 13 1
      // 2c3: sipush 128
      // 2c6: iload 15
      // 2c8: bipush 63
      // 2ca: iand
      // 2cb: ior
      // 2cc: i2b
      // 2cd: bastore
      // 2ce: goto 2d5
      // 2d1: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d4: athrow
      // 2d5: iinc 14 1
      // 2d8: iload 10
      // 2da: ifne 1c2
      // 2dd: aload 0
      // 2de: iload 13
      // 2e0: putfield rip/breeze/inject/ð.int_þ_2 I
      // 2e3: lload 3
      // 2e4: lconst_0
      // 2e5: lcmp
      // 2e6: ifle 2e9
      // 2e9: aload 0
      // 2ea: areturn
      // try (51 -> 61): 62 java/lang/IllegalArgumentException
      // try (59 -> 69): 70 java/lang/IllegalArgumentException
      // try (64 -> 80): 81 java/lang/IllegalArgumentException
      // try (72 -> 88): 89 java/lang/IllegalArgumentException
      // try (83 -> 98): 99 java/lang/IllegalArgumentException
      // try (91 -> 103): 104 java/lang/IllegalArgumentException
      // try (106 -> 114): 115 java/lang/IllegalArgumentException
      // try (107 -> 118): 119 java/lang/IllegalArgumentException
      // try (130 -> 137): 138 java/lang/IllegalArgumentException
      // try (136 -> 149): 149 java/lang/IllegalArgumentException
      // try (158 -> 166): 167 java/lang/IllegalArgumentException
      // try (165 -> 185): 186 java/lang/IllegalArgumentException
      // try (194 -> 204): 205 java/lang/IllegalArgumentException
      // try (200 -> 228): 229 java/lang/IllegalArgumentException
      // try (243 -> 253): 254 java/lang/IllegalArgumentException
      // try (249 -> 261): 262 java/lang/IllegalArgumentException
      // try (256 -> 272): 273 java/lang/IllegalArgumentException
      // try (264 -> 280): 281 java/lang/IllegalArgumentException
      // try (275 -> 296): 297 java/lang/IllegalArgumentException
      // try (283 -> 301): 302 java/lang/IllegalArgumentException
      // try (304 -> 335): 336 java/lang/IllegalArgumentException
      // try (305 -> 375): 376 java/lang/IllegalArgumentException
   }

   public ð invoke_12(Object[] param1) {
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
      // 04: checkcast [B
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
      // 15: checkcast java/lang/Integer
      // 18: invokevirtual java/lang/Integer.intValue ()I
      // 1b: istore 4
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/Long
      // 23: invokevirtual java/lang/Long.longValue ()J
      // 26: lstore 5
      // 28: pop
      // 29: getstatic rip/breeze/inject/ð.encKey_a_2 J
      // 2c: lload 5
      // 2e: lxor
      // 2f: lstore 5
      // 31: lload 5
      // 33: dup2
      // 34: ldc2_w 21037390530470
      // 37: lxor
      // 38: lstore 7
      // 3a: pop2
      // 3b: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 3e: istore 9
      // 40: aload 0
      // 41: iload 9
      // 43: ifeq 63
      // 46: getfield rip/breeze/inject/ð.int_þ_2 I
      // 49: iload 4
      // 4b: iadd
      // 4c: aload 0
      // 4d: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 50: arraylength
      // 51: if_icmple 7f
      // 54: goto 5b
      // 57: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: iload 4
      // 65: lload 7
      // 67: bipush 2
      // 68: anewarray 4
      // 6b: dup_x2
      // 6c: dup_x2
      // 6d: pop
      // 6e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 71: bipush 1
      // 72: swap
      // 73: aastore
      // 74: dup_x1
      // 75: swap
      // 76: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 79: bipush 0
      // 7a: swap
      // 7b: aastore
      // 7c: invokevirtual rip/breeze/inject/ð.method_013 ([Ljava/lang/Object;)V
      // 7f: aload 2
      // 80: iload 9
      // 82: lload 5
      // 84: lconst_0
      // 85: lcmp
      // 86: iflt 98
      // 89: ifeq 97
      // 8c: ifnull a5
      // 8f: goto 96
      // 92: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 95: athrow
      // 96: aload 2
      // 97: iload 3
      // 98: aload 0
      // 99: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 9c: aload 0
      // 9d: getfield rip/breeze/inject/ð.int_þ_2 I
      // a0: iload 4
      // a2: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // a5: aload 0
      // a6: dup
      // a7: getfield rip/breeze/inject/ð.int_þ_2 I
      // aa: iload 4
      // ac: iadd
      // ad: putfield rip/breeze/inject/ð.int_þ_2 I
      // b0: aload 0
      // b1: areturn
      // try (37 -> 47): 48 java/lang/IllegalArgumentException
      // try (40 -> 51): 52 java/lang/IllegalArgumentException
      // try (72 -> 80): 81 java/lang/IllegalArgumentException
   }

   private void invoke_13(Object[] param1) {
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
      // 16: getstatic rip/breeze/inject/ð.encKey_a_2 J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 1f: istore 5
      // 21: aload 0
      // 22: getfield rip/breeze/inject/ð.int_þ_2 I
      // 25: aload 0
      // 26: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 29: arraylength
      // 2a: iload 5
      // 2c: ifne 56
      // 2f: if_icmple 50
      // 32: goto 39
      // 35: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38: athrow
      // 39: new java/lang/AssertionError
      // 3c: dup
      // 3d: sipush 31675
      // 40: ldc2_w 8923134706390816586
      // 43: lload 3
      // 44: lxor
      // 45: invokestatic rip/breeze/inject/ð.method_016 (IJ)Ljava/lang/String;
      // 48: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 4b: athrow
      // 4c: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4f: athrow
      // 50: bipush 2
      // 51: aload 0
      // 52: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 55: arraylength
      // 56: imul
      // 57: istore 6
      // 59: aload 0
      // 5a: getfield rip/breeze/inject/ð.int_þ_2 I
      // 5d: iload 2
      // 5e: iadd
      // 5f: istore 7
      // 61: iload 6
      // 63: iload 5
      // 65: lload 3
      // 66: lconst_0
      // 67: lcmp
      // 68: ifle 70
      // 6b: ifne 83
      // 6e: iload 7
      // 70: if_icmple 86
      // 73: goto 7a
      // 76: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 79: athrow
      // 7a: iload 6
      // 7c: goto 83
      // 7f: invokestatic rip/breeze/inject/ð.method_014 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 82: athrow
      // 83: goto 88
      // 86: iload 7
      // 88: newarray 8
      // 8a: astore 8
      // 8c: aload 0
      // 8d: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 90: bipush 0
      // 91: aload 8
      // 93: bipush 0
      // 94: aload 0
      // 95: getfield rip/breeze/inject/ð.int_þ_2 I
      // 98: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 9b: aload 0
      // 9c: aload 8
      // 9e: putfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // a1: return
      // try (20 -> 28): 29 java/lang/IllegalArgumentException
      // try (27 -> 40): 40 java/lang/IllegalArgumentException
      // try (53 -> 62): 63 java/lang/IllegalArgumentException
      // try (60 -> 66): 67 java/lang/IllegalArgumentException
   }

   static {
      long var0 = 4285913165702L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "CvMJOgG [rò´²\u0098\u008e\u0017c\u0005üÐ\u0017£\u0097* \u0093%«\u0012£ BÑ\u0005Â\u0085Oñ£e u¬®\nùëÇ\u0098\f\t.²H\u00adGKUWÞ1ihôÉ\u0004\u0095¢E\u0019\u000fÉO(Sb\u008e>p=îg²N@\\ñ×ÖÁQ\u0087%¬ÍP \u0095¬ñ\u0084\u0007Õ\u0095¦þ\u0080\u009c«£\u008a6\u0085X";
      int var7 = "CvMJOgG [rò´²\u0098\u008e\u0017c\u0005üÐ\u0017£\u0097* \u0093%«\u0012£ BÑ\u0005Â\u0085Oñ£e u¬®\nùëÇ\u0098\f\t.²H\u00adGKUWÞ1ihôÉ\u0004\u0095¢E\u0019\u000fÉO(Sb\u008e>p=îg²N@\\ñ×ÖÁQ\u0087%¬ÍP \u0095¬ñ\u0084\u0007Õ\u0095¦þ\u0080\u009c«£\u008a6\u0085X"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = method_015(var11).intern();
         if ((var9 += var8) >= var7) {
            CONST_B_2 = var4;
            CONST_C_2 = new String[3];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static IllegalArgumentException invoke_14(IllegalArgumentException var0) {
      return var0;
   }

   private static String invoke_15(byte[] var0) {
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

   private static String invoke_16(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26291;
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
            throw new RuntimeException("rip/breeze/inject/ð", var10);
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
         CONST_C_2[var3] = method_015(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }
}
