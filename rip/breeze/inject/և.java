package rip.breeze.inject;

public final class և {
   public static final int CONST_Ÿ = 0;
   public static final int CONST_Þ = 1;
   public static final int CONST_Ý = 2;
   public static final int CONST_Ü = 3;
   private final byte[] arr_û;
   private final int int_ú;

   և(byte[] var1, int var2) {
      this.arr_û = var1;
      this.int_ú = var2;
   }

   public int getValue(Object[] var1) {
      return this.arr_û[this.int_ú];
   }

   public int calculate(Object[] var1) {
      int var2 = (Integer)var1[0];
      return this.arr_û[this.int_ú + 2 * var2 + 1];
   }

   public int calculate_2(Object[] var1) {
      int var2 = (Integer)var1[0];
      return this.arr_û[this.int_ú + 2 * var2 + 2];
   }

   public static և getև(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic rip/breeze/inject/և.encKey_a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: lload 2
      // 01a: dup2
      // 01b: ldc2_w 56150480902947
      // 01e: lxor
      // 01f: lstore 4
      // 021: dup2
      // 022: ldc2_w 67205313160241
      // 025: lxor
      // 026: lstore 6
      // 028: pop2
      // 029: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 02c: istore 8
      // 02e: aload 1
      // 02f: iload 8
      // 031: ifeq 03f
      // 034: ifnull 051
      // 037: goto 03e
      // 03a: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03d: athrow
      // 03e: aload 1
      // 03f: invokevirtual java/lang/String.length ()I
      // 042: iload 8
      // 044: ifeq 05b
      // 047: ifne 057
      // 04a: goto 051
      // 04d: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 050: athrow
      // 051: aconst_null
      // 052: areturn
      // 053: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 056: athrow
      // 057: aload 1
      // 058: invokevirtual java/lang/String.length ()I
      // 05b: istore 9
      // 05d: new rip/breeze/inject/ð
      // 060: dup
      // 061: iload 9
      // 063: invokespecial rip/breeze/inject/ð.<init> (I)V
      // 066: astore 10
      // 068: aload 10
      // 06a: bipush 0
      // 06b: lload 6
      // 06d: bipush 2
      // 06e: anewarray 4
      // 071: dup_x2
      // 072: dup_x2
      // 073: pop
      // 074: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 077: bipush 1
      // 078: swap
      // 079: aastore
      // 07a: dup_x1
      // 07b: swap
      // 07c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07f: bipush 0
      // 080: swap
      // 081: aastore
      // 082: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 085: pop
      // 086: bipush 0
      // 087: istore 11
      // 089: iload 11
      // 08b: iload 9
      // 08d: if_icmpge 2d0
      // 090: aload 1
      // 091: iload 11
      // 093: iinc 11 1
      // 096: invokevirtual java/lang/String.charAt (I)C
      // 099: istore 12
      // 09b: iload 8
      // 09d: lload 2
      // 09e: lconst_0
      // 09f: lcmp
      // 0a0: iflt 0a8
      // 0a3: ifeq 2e5
      // 0a6: iload 12
      // 0a8: bipush 91
      // 0aa: iload 8
      // 0ac: lload 2
      // 0ad: lconst_0
      // 0ae: lcmp
      // 0af: iflt 112
      // 0b2: ifeq 110
      // 0b5: goto 0bc
      // 0b8: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bb: athrow
      // 0bc: lload 2
      // 0bd: lconst_0
      // 0be: lcmp
      // 0bf: iflt 109
      // 0c2: if_icmpne 105
      // 0c5: goto 0cc
      // 0c8: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cb: athrow
      // 0cc: aload 10
      // 0ce: bipush 0
      // 0cf: lload 4
      // 0d1: bipush 0
      // 0d2: bipush 3
      // 0d3: anewarray 4
      // 0d6: dup_x1
      // 0d7: swap
      // 0d8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0db: bipush 2
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 1
      // 0e5: swap
      // 0e6: aastore
      // 0e7: dup_x1
      // 0e8: swap
      // 0e9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ec: bipush 0
      // 0ed: swap
      // 0ee: aastore
      // 0ef: invokevirtual rip/breeze/inject/ð.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0f2: pop
      // 0f3: iload 8
      // 0f5: lload 2
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: ifle 2cd
      // 0fb: ifne 2cb
      // 0fe: goto 105
      // 101: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 104: athrow
      // 105: iload 12
      // 107: bipush 46
      // 109: goto 110
      // 10c: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10f: athrow
      // 110: iload 8
      // 112: lload 2
      // 113: lconst_0
      // 114: lcmp
      // 115: ifle 16b
      // 118: ifeq 169
      // 11b: if_icmpne 15e
      // 11e: goto 125
      // 121: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 124: athrow
      // 125: aload 10
      // 127: bipush 1
      // 128: lload 4
      // 12a: bipush 0
      // 12b: bipush 3
      // 12c: anewarray 4
      // 12f: dup_x1
      // 130: swap
      // 131: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 134: bipush 2
      // 135: swap
      // 136: aastore
      // 137: dup_x2
      // 138: dup_x2
      // 139: pop
      // 13a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13d: bipush 1
      // 13e: swap
      // 13f: aastore
      // 140: dup_x1
      // 141: swap
      // 142: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 145: bipush 0
      // 146: swap
      // 147: aastore
      // 148: invokevirtual rip/breeze/inject/ð.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 14b: pop
      // 14c: iload 8
      // 14e: lload 2
      // 14f: lconst_0
      // 150: lcmp
      // 151: iflt 2cd
      // 154: ifne 2cb
      // 157: goto 15e
      // 15a: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15d: athrow
      // 15e: iload 12
      // 160: bipush 42
      // 162: goto 169
      // 165: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 168: athrow
      // 169: iload 8
      // 16b: lload 2
      // 16c: lconst_0
      // 16d: lcmp
      // 16e: iflt 1c4
      // 171: ifeq 1c2
      // 174: if_icmpne 1b7
      // 177: goto 17e
      // 17a: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17d: athrow
      // 17e: aload 10
      // 180: bipush 2
      // 181: lload 4
      // 183: bipush 0
      // 184: bipush 3
      // 185: anewarray 4
      // 188: dup_x1
      // 189: swap
      // 18a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 18d: bipush 2
      // 18e: swap
      // 18f: aastore
      // 190: dup_x2
      // 191: dup_x2
      // 192: pop
      // 193: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 196: bipush 1
      // 197: swap
      // 198: aastore
      // 199: dup_x1
      // 19a: swap
      // 19b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19e: bipush 0
      // 19f: swap
      // 1a0: aastore
      // 1a1: invokevirtual rip/breeze/inject/ð.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1a4: pop
      // 1a5: iload 8
      // 1a7: lload 2
      // 1a8: lconst_0
      // 1a9: lcmp
      // 1aa: iflt 2cd
      // 1ad: ifne 2cb
      // 1b0: goto 1b7
      // 1b3: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b6: athrow
      // 1b7: iload 12
      // 1b9: bipush 48
      // 1bb: goto 1c2
      // 1be: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c1: athrow
      // 1c2: iload 8
      // 1c4: lload 2
      // 1c5: lconst_0
      // 1c6: lcmp
      // 1c7: ifle 1e4
      // 1ca: ifeq 1e2
      // 1cd: if_icmplt 2bf
      // 1d0: goto 1d7
      // 1d3: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d6: athrow
      // 1d7: iload 12
      // 1d9: bipush 57
      // 1db: goto 1e2
      // 1de: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e1: athrow
      // 1e2: iload 8
      // 1e4: ifeq 1fc
      // 1e7: if_icmpgt 2bf
      // 1ea: goto 1f1
      // 1ed: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f0: athrow
      // 1f1: iload 12
      // 1f3: bipush 48
      // 1f5: goto 1fc
      // 1f8: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1fb: athrow
      // 1fc: isub
      // 1fd: istore 13
      // 1ff: iload 11
      // 201: iload 9
      // 203: if_icmpge 28c
      // 206: aload 1
      // 207: iload 11
      // 209: iinc 11 1
      // 20c: invokevirtual java/lang/String.charAt (I)C
      // 20f: istore 12
      // 211: iload 12
      // 213: bipush 48
      // 215: iload 8
      // 217: ifeq 08d
      // 21a: iload 8
      // 21c: lload 2
      // 21d: lconst_0
      // 21e: lcmp
      // 21f: iflt 0ac
      // 222: ifeq 26b
      // 225: if_icmplt 261
      // 228: goto 22f
      // 22b: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22e: athrow
      // 22f: iload 12
      // 231: bipush 57
      // 233: lload 2
      // 234: lconst_0
      // 235: lcmp
      // 236: iflt 26b
      // 239: iload 8
      // 23b: ifeq 26b
      // 23e: goto 245
      // 241: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 244: athrow
      // 245: if_icmpgt 261
      // 248: goto 24f
      // 24b: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24e: athrow
      // 24f: iload 13
      // 251: bipush 10
      // 253: imul
      // 254: iload 12
      // 256: iadd
      // 257: bipush 48
      // 259: isub
      // 25a: istore 13
      // 25c: iload 8
      // 25e: ifne 1ff
      // 261: iload 12
      // 263: lload 2
      // 264: lconst_0
      // 265: lcmp
      // 266: ifle 213
      // 269: bipush 59
      // 26b: if_icmpne 280
      // 26e: iload 8
      // 270: lload 2
      // 271: lconst_0
      // 272: lcmp
      // 273: ifle 2b6
      // 276: ifne 28c
      // 279: goto 280
      // 27c: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27f: athrow
      // 280: new java/lang/IllegalArgumentException
      // 283: dup
      // 284: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 287: athrow
      // 288: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28b: athrow
      // 28c: aload 10
      // 28e: bipush 3
      // 28f: lload 4
      // 291: iload 13
      // 293: bipush 3
      // 294: anewarray 4
      // 297: dup_x1
      // 298: swap
      // 299: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 29c: bipush 2
      // 29d: swap
      // 29e: aastore
      // 29f: dup_x2
      // 2a0: dup_x2
      // 2a1: pop
      // 2a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a5: bipush 1
      // 2a6: swap
      // 2a7: aastore
      // 2a8: dup_x1
      // 2a9: swap
      // 2aa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2ad: bipush 0
      // 2ae: swap
      // 2af: aastore
      // 2b0: invokevirtual rip/breeze/inject/ð.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 2b3: pop
      // 2b4: iload 8
      // 2b6: lload 2
      // 2b7: lconst_0
      // 2b8: lcmp
      // 2b9: iflt 2cd
      // 2bc: ifne 2cb
      // 2bf: new java/lang/IllegalArgumentException
      // 2c2: dup
      // 2c3: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 2c6: athrow
      // 2c7: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ca: athrow
      // 2cb: iload 8
      // 2cd: ifne 089
      // 2d0: aload 10
      // 2d2: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 2d5: bipush 0
      // 2d6: aload 10
      // 2d8: getfield rip/breeze/inject/ð.int_þ_2 I
      // 2db: bipush 2
      // 2dc: idiv
      // 2dd: i2b
      // 2de: bastore
      // 2df: lload 2
      // 2e0: lconst_0
      // 2e1: lcmp
      // 2e2: ifle 090
      // 2e5: new rip/breeze/inject/և
      // 2e8: dup
      // 2e9: aload 10
      // 2eb: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 2ee: bipush 0
      // 2ef: invokespecial rip/breeze/inject/և.<init> ([BI)V
      // 2f2: areturn
      // try (29 -> 33): 34 java/lang/IllegalArgumentException
      // try (37 -> 41): 42 java/lang/IllegalArgumentException
      // try (40 -> 46): 46 java/lang/IllegalArgumentException
      // try (86 -> 100): 101 java/lang/IllegalArgumentException
      // try (92 -> 108): 109 java/lang/IllegalArgumentException
      // try (103 -> 144): 145 java/lang/IllegalArgumentException
      // try (111 -> 149): 150 java/lang/IllegalArgumentException
      // try (152 -> 159): 160 java/lang/IllegalArgumentException
      // try (158 -> 195): 196 java/lang/IllegalArgumentException
      // try (162 -> 200): 201 java/lang/IllegalArgumentException
      // try (203 -> 210): 211 java/lang/IllegalArgumentException
      // try (209 -> 246): 247 java/lang/IllegalArgumentException
      // try (213 -> 251): 252 java/lang/IllegalArgumentException
      // try (254 -> 261): 262 java/lang/IllegalArgumentException
      // try (260 -> 266): 267 java/lang/IllegalArgumentException
      // try (269 -> 272): 273 java/lang/IllegalArgumentException
      // try (271 -> 277): 278 java/lang/IllegalArgumentException
      // try (294 -> 301): 302 java/lang/IllegalArgumentException
      // try (300 -> 312): 313 java/lang/IllegalArgumentException
      // try (304 -> 316): 317 java/lang/IllegalArgumentException
      // try (335 -> 342): 343 java/lang/IllegalArgumentException
      // try (336 -> 349): 349 java/lang/IllegalArgumentException
      // try (351 -> 388): 388 java/lang/IllegalArgumentException
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/և.encKey_a J
      // 03: ldc2_w 85210274282758
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: bipush 0
      // 0a: anewarray 4
      // 0d: invokevirtual rip/breeze/inject/և.getValue ([Ljava/lang/Object;)I
      // 10: istore 3
      // 11: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 14: new java/lang/StringBuilder
      // 17: dup
      // 18: iload 3
      // 19: bipush 2
      // 1a: imul
      // 1b: invokespecial java/lang/StringBuilder.<init> (I)V
      // 1e: astore 4
      // 20: bipush 0
      // 21: istore 5
      // 23: istore 6
      // 25: iload 5
      // 27: iload 3
      // 28: if_icmpge d5
      // 2b: aload 0
      // 2c: iload 5
      // 2e: bipush 1
      // 2f: anewarray 4
      // 32: dup_x1
      // 33: swap
      // 34: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 37: bipush 0
      // 38: swap
      // 39: aastore
      // 3a: invokevirtual rip/breeze/inject/և.calculate ([Ljava/lang/Object;)I
      // 3d: tableswitch 132 0 3 31 51 71 91
      // 5c: aload 4
      // 5e: bipush 91
      // 60: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 63: pop
      // 64: iload 6
      // 66: ifeq cd
      // 69: goto 70
      // 6c: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6f: athrow
      // 70: aload 4
      // 72: bipush 46
      // 74: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: iload 6
      // 7a: ifeq cd
      // 7d: goto 84
      // 80: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 83: athrow
      // 84: aload 4
      // 86: bipush 42
      // 88: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 8b: pop
      // 8c: iload 6
      // 8e: ifeq cd
      // 91: goto 98
      // 94: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 97: athrow
      // 98: aload 4
      // 9a: aload 0
      // 9b: iload 5
      // 9d: bipush 1
      // 9e: anewarray 4
      // a1: dup_x1
      // a2: swap
      // a3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a6: bipush 0
      // a7: swap
      // a8: aastore
      // a9: invokevirtual rip/breeze/inject/և.calculate_2 ([Ljava/lang/Object;)I
      // ac: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // af: bipush 59
      // b1: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // b4: pop
      // b5: iload 6
      // b7: ifeq cd
      // ba: goto c1
      // bd: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c0: athrow
      // c1: new java/lang/AssertionError
      // c4: dup
      // c5: invokespecial java/lang/AssertionError.<init> ()V
      // c8: athrow
      // c9: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // cc: athrow
      // cd: iinc 5 1
      // d0: iload 6
      // d2: ifeq 25
      // d5: aload 4
      // d7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // da: areturn
      // try (23 -> 41): 42 java/lang/IllegalArgumentException
      // try (35 -> 50): 51 java/lang/IllegalArgumentException
      // try (44 -> 59): 60 java/lang/IllegalArgumentException
      // try (53 -> 80): 81 java/lang/IllegalArgumentException
      // try (62 -> 87): 87 java/lang/IllegalArgumentException
   }

   static void calculate_3(Object[] param0) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast rip/breeze/inject/և
      // 11: astore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast rip/breeze/inject/ð
      // 18: astore 4
      // 1a: pop
      // 1b: getstatic rip/breeze/inject/և.encKey_a J
      // 1e: lload 1
      // 1f: lxor
      // 20: lstore 1
      // 21: lload 1
      // 22: dup2
      // 23: ldc2_w 119988460195967
      // 26: lxor
      // 27: lstore 5
      // 29: dup2
      // 2a: ldc2_w 27330896302210
      // 2d: lxor
      // 2e: lstore 7
      // 30: pop2
      // 31: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 34: istore 9
      // 36: aload 3
      // 37: iload 9
      // 39: ifeq 78
      // 3c: ifnonnull 70
      // 3f: goto 46
      // 42: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 45: athrow
      // 46: aload 4
      // 48: bipush 0
      // 49: lload 5
      // 4b: bipush 2
      // 4c: anewarray 4
      // 4f: dup_x2
      // 50: dup_x2
      // 51: pop
      // 52: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 55: bipush 1
      // 56: swap
      // 57: aastore
      // 58: dup_x1
      // 59: swap
      // 5a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5d: bipush 0
      // 5e: swap
      // 5f: aastore
      // 60: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 63: pop
      // 64: iload 9
      // 66: ifne ba
      // 69: goto 70
      // 6c: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6f: athrow
      // 70: aload 3
      // 71: goto 78
      // 74: invokestatic rip/breeze/inject/և.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 77: athrow
      // 78: getfield rip/breeze/inject/և.arr_û [B
      // 7b: aload 3
      // 7c: getfield rip/breeze/inject/և.int_ú I
      // 7f: baload
      // 80: bipush 2
      // 81: imul
      // 82: bipush 1
      // 83: iadd
      // 84: istore 10
      // 86: aload 4
      // 88: aload 3
      // 89: getfield rip/breeze/inject/և.arr_û [B
      // 8c: aload 3
      // 8d: getfield rip/breeze/inject/և.int_ú I
      // 90: iload 10
      // 92: lload 7
      // 94: bipush 4
      // 95: anewarray 4
      // 98: dup_x2
      // 99: dup_x2
      // 9a: pop
      // 9b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9e: bipush 3
      // 9f: swap
      // a0: aastore
      // a1: dup_x1
      // a2: swap
      // a3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a6: bipush 2
      // a7: swap
      // a8: aastore
      // a9: dup_x1
      // aa: swap
      // ab: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ae: bipush 1
      // af: swap
      // b0: aastore
      // b1: dup_x1
      // b2: swap
      // b3: bipush 0
      // b4: swap
      // b5: aastore
      // b6: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // b9: pop
      // ba: return
      // try (34 -> 38): 39 java/lang/IllegalArgumentException
      // try (37 -> 63): 64 java/lang/IllegalArgumentException
      // try (41 -> 67): 68 java/lang/IllegalArgumentException
   }

   private static IllegalArgumentException getIllegalArgumentException(IllegalArgumentException var0) {
      return var0;
   }
}
