package rip.breeze.inject;

public class տ {
   private final String string_ÿ_2;

   public տ(String var1) {
      this.string_ÿ_2 = var1;
   }

   public void invoke_1(Object[] param1) {
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
      // 00e: checkcast rip/breeze/inject/վ
      // 011: astore 4
      // 013: pop
      // 014: getstatic rip/breeze/inject/տ.encKey_a_2 J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 21098820379282
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 126041322501004
      // 026: lxor
      // 027: lstore 7
      // 029: dup2
      // 02a: ldc2_w 43818989326584
      // 02d: lxor
      // 02e: lstore 9
      // 030: dup2
      // 031: ldc2_w 31854830695247
      // 034: lxor
      // 035: lstore 11
      // 037: dup2
      // 038: ldc2_w 118152656647133
      // 03b: lxor
      // 03c: lstore 13
      // 03e: pop2
      // 03f: invokestatic rip/breeze/inject/վ.method_019 ()[Lrip/breeze/inject/ջ;
      // 042: aload 0
      // 043: getfield rip/breeze/inject/տ.string_ÿ_2 Ljava/lang/String;
      // 046: astore 15
      // 048: aload 15
      // 04a: invokevirtual java/lang/String.length ()I
      // 04d: istore 16
      // 04f: astore 17
      // 051: aload 15
      // 053: bipush 0
      // 054: invokevirtual java/lang/String.charAt (I)C
      // 057: aload 17
      // 059: ifnull 19d
      // 05c: bipush 60
      // 05e: if_icmpne 19c
      // 061: goto 068
      // 064: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 067: athrow
      // 068: bipush 2
      // 069: istore 18
      // 06b: aload 15
      // 06d: bipush 58
      // 06f: iload 18
      // 071: invokevirtual java/lang/String.indexOf (II)I
      // 074: istore 19
      // 076: aload 4
      // 078: aload 15
      // 07a: iload 18
      // 07c: bipush 1
      // 07d: isub
      // 07e: iload 19
      // 080: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 083: lload 5
      // 085: dup2_x1
      // 086: pop2
      // 087: bipush 2
      // 088: anewarray 4
      // 08b: dup_x1
      // 08c: swap
      // 08d: bipush 1
      // 08e: swap
      // 08f: aastore
      // 090: dup_x2
      // 091: dup_x2
      // 092: pop
      // 093: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 096: bipush 0
      // 097: swap
      // 098: aastore
      // 099: invokevirtual rip/breeze/inject/վ.method_001 ([Ljava/lang/Object;)V
      // 09c: iload 19
      // 09e: bipush 1
      // 09f: iadd
      // 0a0: istore 18
      // 0a2: aload 15
      // 0a4: iload 18
      // 0a6: invokevirtual java/lang/String.charAt (I)C
      // 0a9: istore 20
      // 0ab: iload 20
      // 0ad: bipush 76
      // 0af: if_icmpeq 0e5
      // 0b2: iload 20
      // 0b4: aload 17
      // 0b6: ifnull 11d
      // 0b9: bipush 91
      // 0bb: if_icmpeq 0e5
      // 0be: goto 0c5
      // 0c1: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c4: athrow
      // 0c5: iload 20
      // 0c7: bipush 84
      // 0c9: aload 17
      // 0cb: ifnull 12e
      // 0ce: goto 0d5
      // 0d1: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d4: athrow
      // 0d5: lload 2
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: iflt 12a
      // 0db: if_icmpne 11f
      // 0de: goto 0e5
      // 0e1: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e4: athrow
      // 0e5: aload 15
      // 0e7: iload 18
      // 0e9: aload 4
      // 0eb: bipush 0
      // 0ec: anewarray 4
      // 0ef: invokevirtual rip/breeze/inject/վ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/վ;
      // 0f2: lload 11
      // 0f4: bipush 4
      // 0f5: anewarray 4
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 3
      // 0ff: swap
      // 100: aastore
      // 101: dup_x1
      // 102: swap
      // 103: bipush 2
      // 104: swap
      // 105: aastore
      // 106: dup_x1
      // 107: swap
      // 108: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10b: bipush 1
      // 10c: swap
      // 10d: aastore
      // 10e: dup_x1
      // 10f: swap
      // 110: bipush 0
      // 111: swap
      // 112: aastore
      // 113: invokestatic rip/breeze/inject/տ.method_003 ([Ljava/lang/Object;)I
      // 116: goto 11d
      // 119: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11c: athrow
      // 11d: istore 18
      // 11f: aload 15
      // 121: iload 18
      // 123: iinc 18 1
      // 126: invokevirtual java/lang/String.charAt (I)C
      // 129: dup
      // 12a: istore 20
      // 12c: bipush 58
      // 12e: if_icmpne 192
      // 131: aload 15
      // 133: iload 18
      // 135: aload 4
      // 137: bipush 0
      // 138: anewarray 4
      // 13b: invokevirtual rip/breeze/inject/վ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/վ;
      // 13e: lload 11
      // 140: bipush 4
      // 141: anewarray 4
      // 144: dup_x2
      // 145: dup_x2
      // 146: pop
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: bipush 3
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: bipush 2
      // 150: swap
      // 151: aastore
      // 152: dup_x1
      // 153: swap
      // 154: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 157: bipush 1
      // 158: swap
      // 159: aastore
      // 15a: dup_x1
      // 15b: swap
      // 15c: bipush 0
      // 15d: swap
      // 15e: aastore
      // 15f: invokestatic rip/breeze/inject/տ.method_003 ([Ljava/lang/Object;)I
      // 162: istore 18
      // 164: aload 17
      // 166: ifnull 0ab
      // 169: aload 17
      // 16b: lload 2
      // 16c: lconst_0
      // 16d: lcmp
      // 16e: iflt 113
      // 171: ifnonnull 11f
      // 174: invokestatic rip/breeze/inject/ջ.method_012 ()Z
      // 177: lload 2
      // 178: lconst_0
      // 179: lcmp
      // 17a: ifle 194
      // 17d: lload 2
      // 17e: lconst_0
      // 17f: lcmp
      // 180: ifle 187
      // 183: ifeq 18e
      // 186: bipush 0
      // 187: goto 18f
      // 18a: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18d: athrow
      // 18e: bipush 1
      // 18f: invokestatic rip/breeze/inject/ջ.method_011 (Z)V
      // 192: iload 20
      // 194: bipush 62
      // 196: if_icmpne 06b
      // 199: goto 19f
      // 19c: bipush 0
      // 19d: istore 18
      // 19f: aload 15
      // 1a1: iload 18
      // 1a3: invokevirtual java/lang/String.charAt (I)C
      // 1a6: aload 17
      // 1a8: ifnull 2f1
      // 1ab: bipush 40
      // 1ad: if_icmpne 2af
      // 1b0: goto 1b7
      // 1b3: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b6: athrow
      // 1b7: iinc 18 1
      // 1ba: goto 1c1
      // 1bd: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c0: athrow
      // 1c1: aload 15
      // 1c3: iload 18
      // 1c5: invokevirtual java/lang/String.charAt (I)C
      // 1c8: bipush 41
      // 1ca: if_icmpeq 228
      // 1cd: aload 15
      // 1cf: iload 18
      // 1d1: aload 4
      // 1d3: lload 7
      // 1d5: bipush 1
      // 1d6: anewarray 4
      // 1d9: dup_x2
      // 1da: dup_x2
      // 1db: pop
      // 1dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1df: bipush 0
      // 1e0: swap
      // 1e1: aastore
      // 1e2: invokevirtual rip/breeze/inject/վ.method_006 ([Ljava/lang/Object;)Lrip/breeze/inject/վ;
      // 1e5: lload 11
      // 1e7: bipush 4
      // 1e8: anewarray 4
      // 1eb: dup_x2
      // 1ec: dup_x2
      // 1ed: pop
      // 1ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f1: bipush 3
      // 1f2: swap
      // 1f3: aastore
      // 1f4: dup_x1
      // 1f5: swap
      // 1f6: bipush 2
      // 1f7: swap
      // 1f8: aastore
      // 1f9: dup_x1
      // 1fa: swap
      // 1fb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1fe: bipush 1
      // 1ff: swap
      // 200: aastore
      // 201: dup_x1
      // 202: swap
      // 203: bipush 0
      // 204: swap
      // 205: aastore
      // 206: invokestatic rip/breeze/inject/տ.method_003 ([Ljava/lang/Object;)I
      // 209: lload 2
      // 20a: lconst_0
      // 20b: lcmp
      // 20c: iflt 26a
      // 20f: istore 18
      // 211: aload 17
      // 213: ifnull 268
      // 216: aload 17
      // 218: ifnonnull 1c1
      // 21b: lload 2
      // 21c: lconst_0
      // 21d: lcmp
      // 21e: iflt 211
      // 221: goto 228
      // 224: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 227: athrow
      // 228: aload 15
      // 22a: iload 18
      // 22c: bipush 1
      // 22d: iadd
      // 22e: aload 4
      // 230: lload 13
      // 232: bipush 1
      // 233: anewarray 4
      // 236: dup_x2
      // 237: dup_x2
      // 238: pop
      // 239: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23c: bipush 0
      // 23d: swap
      // 23e: aastore
      // 23f: invokevirtual rip/breeze/inject/վ.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/վ;
      // 242: lload 11
      // 244: bipush 4
      // 245: anewarray 4
      // 248: dup_x2
      // 249: dup_x2
      // 24a: pop
      // 24b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24e: bipush 3
      // 24f: swap
      // 250: aastore
      // 251: dup_x1
      // 252: swap
      // 253: bipush 2
      // 254: swap
      // 255: aastore
      // 256: dup_x1
      // 257: swap
      // 258: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 25b: bipush 1
      // 25c: swap
      // 25d: aastore
      // 25e: dup_x1
      // 25f: swap
      // 260: bipush 0
      // 261: swap
      // 262: aastore
      // 263: invokestatic rip/breeze/inject/տ.method_003 ([Ljava/lang/Object;)I
      // 266: istore 18
      // 268: iload 18
      // 26a: lload 2
      // 26b: lconst_0
      // 26c: lcmp
      // 26d: iflt 2a8
      // 270: iload 16
      // 272: if_icmpge 332
      // 275: aload 15
      // 277: iload 18
      // 279: bipush 1
      // 27a: iadd
      // 27b: aload 4
      // 27d: bipush 0
      // 27e: anewarray 4
      // 281: invokevirtual rip/breeze/inject/վ.method_008 ([Ljava/lang/Object;)Lrip/breeze/inject/վ;
      // 284: lload 11
      // 286: bipush 4
      // 287: anewarray 4
      // 28a: dup_x2
      // 28b: dup_x2
      // 28c: pop
      // 28d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 290: bipush 3
      // 291: swap
      // 292: aastore
      // 293: dup_x1
      // 294: swap
      // 295: bipush 2
      // 296: swap
      // 297: aastore
      // 298: dup_x1
      // 299: swap
      // 29a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 29d: bipush 1
      // 29e: swap
      // 29f: aastore
      // 2a0: dup_x1
      // 2a1: swap
      // 2a2: bipush 0
      // 2a3: swap
      // 2a4: aastore
      // 2a5: invokestatic rip/breeze/inject/տ.method_003 ([Ljava/lang/Object;)I
      // 2a8: istore 18
      // 2aa: aload 17
      // 2ac: ifnonnull 268
      // 2af: aload 15
      // 2b1: iload 18
      // 2b3: aload 4
      // 2b5: lload 9
      // 2b7: bipush 1
      // 2b8: anewarray 4
      // 2bb: dup_x2
      // 2bc: dup_x2
      // 2bd: pop
      // 2be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c1: bipush 0
      // 2c2: swap
      // 2c3: aastore
      // 2c4: invokevirtual rip/breeze/inject/վ.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/վ;
      // 2c7: lload 11
      // 2c9: bipush 4
      // 2ca: anewarray 4
      // 2cd: dup_x2
      // 2ce: dup_x2
      // 2cf: pop
      // 2d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d3: bipush 3
      // 2d4: swap
      // 2d5: aastore
      // 2d6: dup_x1
      // 2d7: swap
      // 2d8: bipush 2
      // 2d9: swap
      // 2da: aastore
      // 2db: dup_x1
      // 2dc: swap
      // 2dd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2e0: bipush 1
      // 2e1: swap
      // 2e2: aastore
      // 2e3: dup_x1
      // 2e4: swap
      // 2e5: bipush 0
      // 2e6: swap
      // 2e7: aastore
      // 2e8: lload 2
      // 2e9: lconst_0
      // 2ea: lcmp
      // 2eb: iflt 2a5
      // 2ee: invokestatic rip/breeze/inject/տ.method_003 ([Ljava/lang/Object;)I
      // 2f1: istore 18
      // 2f3: iload 18
      // 2f5: iload 16
      // 2f7: if_icmpge 332
      // 2fa: aload 15
      // 2fc: iload 18
      // 2fe: aload 4
      // 300: bipush 0
      // 301: anewarray 4
      // 304: invokevirtual rip/breeze/inject/վ.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/վ;
      // 307: lload 11
      // 309: bipush 4
      // 30a: anewarray 4
      // 30d: dup_x2
      // 30e: dup_x2
      // 30f: pop
      // 310: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 313: bipush 3
      // 314: swap
      // 315: aastore
      // 316: dup_x1
      // 317: swap
      // 318: bipush 2
      // 319: swap
      // 31a: aastore
      // 31b: dup_x1
      // 31c: swap
      // 31d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 320: bipush 1
      // 321: swap
      // 322: aastore
      // 323: dup_x1
      // 324: swap
      // 325: bipush 0
      // 326: swap
      // 327: aastore
      // 328: invokestatic rip/breeze/inject/տ.method_003 ([Ljava/lang/Object;)I
      // 32b: istore 18
      // 32d: aload 17
      // 32f: ifnonnull 2f3
      // 332: lload 2
      // 333: lconst_0
      // 334: lcmp
      // 335: iflt 32d
      // 338: return
      // try (47 -> 54): 55 java/lang/IllegalArgumentException
      // try (100 -> 105): 106 java/lang/IllegalArgumentException
      // try (103 -> 112): 113 java/lang/IllegalArgumentException
      // try (108 -> 120): 121 java/lang/IllegalArgumentException
      // try (115 -> 156): 157 java/lang/IllegalArgumentException
      // try (210 -> 222): 222 java/lang/IllegalArgumentException
      // try (232 -> 239): 240 java/lang/IllegalArgumentException
      // try (237 -> 243): 244 java/lang/IllegalArgumentException
      // try (297 -> 301): 306 java/lang/IllegalArgumentException
   }

   public void invoke_2(Object[] var1) {
      վ var2 = (վ)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 25446134394862L;
      String var10000 = this.string_ÿ_2;
      Object[] var10005 = new Object[]{null, null, var2, var5};
      var10005[1] = 0;
      var10005[0] = var10000;
      method_003(var10005);
   }

   private static int invoke_3(Object[] param0) {
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
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast rip/breeze/inject/վ
      // 018: astore 3
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 4
      // 024: pop
      // 025: getstatic rip/breeze/inject/տ.encKey_a_2 J
      // 028: lload 4
      // 02a: lxor
      // 02b: lstore 4
      // 02d: lload 4
      // 02f: dup2
      // 030: ldc2_w 123049965620688
      // 033: lxor
      // 034: lstore 6
      // 036: dup2
      // 037: ldc2_w 62679875270738
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 140100821150906
      // 041: lxor
      // 042: lstore 10
      // 044: dup2
      // 045: ldc2_w 138178929119656
      // 048: lxor
      // 049: lstore 12
      // 04b: dup2
      // 04c: ldc2_w 19243427037525
      // 04f: lxor
      // 050: lstore 14
      // 052: dup2
      // 053: ldc2_w 133827094403050
      // 056: lxor
      // 057: lstore 16
      // 059: pop2
      // 05a: invokestatic rip/breeze/inject/վ.method_019 ()[Lrip/breeze/inject/ջ;
      // 05d: iload 2
      // 05e: istore 18
      // 060: astore 19
      // 062: aload 1
      // 063: iload 18
      // 065: iinc 18 1
      // 068: invokevirtual java/lang/String.charAt (I)C
      // 06b: istore 20
      // 06d: iload 20
      // 06f: aload 19
      // 071: ifnull 10b
      // 074: tableswitch 939 66 91 124 124 124 939 124 939 939 124 124 939 236 939 939 939 939 939 939 124 200 939 124 939 939 939 124 152
      // 0ec: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ef: athrow
      // 0f0: aload 3
      // 0f1: iload 20
      // 0f3: bipush 1
      // 0f4: anewarray 4
      // 0f7: dup_x1
      // 0f8: swap
      // 0f9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fc: bipush 0
      // 0fd: swap
      // 0fe: aastore
      // 0ff: invokevirtual rip/breeze/inject/վ.method_009 ([Ljava/lang/Object;)V
      // 102: iload 18
      // 104: goto 10b
      // 107: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10a: athrow
      // 10b: ireturn
      // 10c: aload 1
      // 10d: iload 18
      // 10f: aload 3
      // 110: bipush 0
      // 111: anewarray 4
      // 114: invokevirtual rip/breeze/inject/վ.method_011 ([Ljava/lang/Object;)Lrip/breeze/inject/վ;
      // 117: lload 16
      // 119: bipush 4
      // 11a: anewarray 4
      // 11d: dup_x2
      // 11e: dup_x2
      // 11f: pop
      // 120: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 123: bipush 3
      // 124: swap
      // 125: aastore
      // 126: dup_x1
      // 127: swap
      // 128: bipush 2
      // 129: swap
      // 12a: aastore
      // 12b: dup_x1
      // 12c: swap
      // 12d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 130: bipush 1
      // 131: swap
      // 132: aastore
      // 133: dup_x1
      // 134: swap
      // 135: bipush 0
      // 136: swap
      // 137: aastore
      // 138: invokestatic rip/breeze/inject/տ.method_003 ([Ljava/lang/Object;)I
      // 13b: ireturn
      // 13c: aload 1
      // 13d: bipush 59
      // 13f: iload 18
      // 141: invokevirtual java/lang/String.indexOf (II)I
      // 144: istore 21
      // 146: aload 3
      // 147: aload 1
      // 148: iload 18
      // 14a: iload 21
      // 14c: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 14f: bipush 1
      // 150: anewarray 4
      // 153: dup_x1
      // 154: swap
      // 155: bipush 0
      // 156: swap
      // 157: aastore
      // 158: invokevirtual rip/breeze/inject/վ.method_010 ([Ljava/lang/Object;)V
      // 15b: iload 21
      // 15d: bipush 1
      // 15e: iadd
      // 15f: ireturn
      // 160: iload 18
      // 162: istore 22
      // 164: bipush 0
      // 165: istore 23
      // 167: bipush 0
      // 168: istore 24
      // 16a: aload 1
      // 16b: iload 18
      // 16d: iinc 18 1
      // 170: invokevirtual java/lang/String.charAt (I)C
      // 173: istore 20
      // 175: iload 20
      // 177: bipush 46
      // 179: if_icmpeq 1a9
      // 17c: iload 20
      // 17e: bipush 59
      // 180: lload 4
      // 182: lconst_0
      // 183: lcmp
      // 184: ifle 24a
      // 187: aload 19
      // 189: ifnull 24a
      // 18c: aload 19
      // 18e: lload 4
      // 190: lconst_0
      // 191: lcmp
      // 192: ifle 288
      // 195: ifnull 286
      // 198: goto 19f
      // 19b: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19e: athrow
      // 19f: if_icmpne 282
      // 1a2: goto 1a9
      // 1a5: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a8: athrow
      // 1a9: iload 23
      // 1ab: aload 19
      // 1ad: lload 4
      // 1af: lconst_0
      // 1b0: lcmp
      // 1b1: iflt 23e
      // 1b4: ifnull 23c
      // 1b7: goto 1be
      // 1ba: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1bd: athrow
      // 1be: ifne 23a
      // 1c1: goto 1c8
      // 1c4: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c7: athrow
      // 1c8: aload 1
      // 1c9: iload 22
      // 1cb: iload 18
      // 1cd: bipush 1
      // 1ce: isub
      // 1cf: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1d2: astore 25
      // 1d4: aload 19
      // 1d6: lload 4
      // 1d8: lconst_0
      // 1d9: lcmp
      // 1da: ifle 216
      // 1dd: ifnull 20d
      // 1e0: iload 24
      // 1e2: ifeq 219
      // 1e5: goto 1ec
      // 1e8: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1eb: athrow
      // 1ec: aload 3
      // 1ed: lload 12
      // 1ef: aload 25
      // 1f1: bipush 2
      // 1f2: anewarray 4
      // 1f5: dup_x1
      // 1f6: swap
      // 1f7: bipush 1
      // 1f8: swap
      // 1f9: aastore
      // 1fa: dup_x2
      // 1fb: dup_x2
      // 1fc: pop
      // 1fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 200: bipush 0
      // 201: swap
      // 202: aastore
      // 203: invokevirtual rip/breeze/inject/վ.method_013 ([Ljava/lang/Object;)V
      // 206: goto 20d
      // 209: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20c: athrow
      // 20d: lload 4
      // 20f: lconst_0
      // 210: lcmp
      // 211: iflt 233
      // 214: aload 19
      // 216: ifnonnull 23a
      // 219: aload 3
      // 21a: lload 10
      // 21c: aload 25
      // 21e: bipush 2
      // 21f: anewarray 4
      // 222: dup_x1
      // 223: swap
      // 224: bipush 1
      // 225: swap
      // 226: aastore
      // 227: dup_x2
      // 228: dup_x2
      // 229: pop
      // 22a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22d: bipush 0
      // 22e: swap
      // 22f: aastore
      // 230: invokevirtual rip/breeze/inject/վ.method_012 ([Ljava/lang/Object;)V
      // 233: goto 23a
      // 236: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 239: athrow
      // 23a: iload 20
      // 23c: aload 19
      // 23e: ifnull 274
      // 241: bipush 59
      // 243: goto 24a
      // 246: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 249: athrow
      // 24a: if_icmpne 26c
      // 24d: aload 3
      // 24e: lload 8
      // 250: bipush 1
      // 251: anewarray 4
      // 254: dup_x2
      // 255: dup_x2
      // 256: pop
      // 257: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25a: bipush 0
      // 25b: swap
      // 25c: aastore
      // 25d: invokevirtual rip/breeze/inject/վ.method_016 ([Ljava/lang/Object;)V
      // 260: aload 19
      // 262: ifnonnull 415
      // 265: goto 26c
      // 268: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 26b: athrow
      // 26c: iload 18
      // 26e: istore 22
      // 270: bipush 0
      // 271: istore 23
      // 273: bipush 1
      // 274: istore 24
      // 276: lload 4
      // 278: lconst_0
      // 279: lcmp
      // 27a: ifle 175
      // 27d: aload 19
      // 27f: ifnonnull 16a
      // 282: iload 20
      // 284: bipush 60
      // 286: aload 19
      // 288: ifnull 179
      // 28b: if_icmpne 16a
      // 28e: aload 1
      // 28f: iload 22
      // 291: iload 18
      // 293: bipush 1
      // 294: isub
      // 295: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 298: astore 25
      // 29a: aload 19
      // 29c: lload 4
      // 29e: lconst_0
      // 29f: lcmp
      // 2a0: iflt 2dc
      // 2a3: ifnull 2d3
      // 2a6: iload 24
      // 2a8: ifeq 2df
      // 2ab: goto 2b2
      // 2ae: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b1: athrow
      // 2b2: aload 3
      // 2b3: lload 12
      // 2b5: aload 25
      // 2b7: bipush 2
      // 2b8: anewarray 4
      // 2bb: dup_x1
      // 2bc: swap
      // 2bd: bipush 1
      // 2be: swap
      // 2bf: aastore
      // 2c0: dup_x2
      // 2c1: dup_x2
      // 2c2: pop
      // 2c3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c6: bipush 0
      // 2c7: swap
      // 2c8: aastore
      // 2c9: invokevirtual rip/breeze/inject/վ.method_013 ([Ljava/lang/Object;)V
      // 2cc: goto 2d3
      // 2cf: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d2: athrow
      // 2d3: lload 4
      // 2d5: lconst_0
      // 2d6: lcmp
      // 2d7: ifle 2f9
      // 2da: aload 19
      // 2dc: ifnonnull 300
      // 2df: aload 3
      // 2e0: lload 10
      // 2e2: aload 25
      // 2e4: bipush 2
      // 2e5: anewarray 4
      // 2e8: dup_x1
      // 2e9: swap
      // 2ea: bipush 1
      // 2eb: swap
      // 2ec: aastore
      // 2ed: dup_x2
      // 2ee: dup_x2
      // 2ef: pop
      // 2f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f3: bipush 0
      // 2f4: swap
      // 2f5: aastore
      // 2f6: invokevirtual rip/breeze/inject/վ.method_012 ([Ljava/lang/Object;)V
      // 2f9: goto 300
      // 2fc: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ff: athrow
      // 300: bipush 1
      // 301: istore 23
      // 303: aload 1
      // 304: iload 18
      // 306: invokevirtual java/lang/String.charAt (I)C
      // 309: dup
      // 30a: istore 20
      // 30c: bipush 62
      // 30e: if_icmpeq 409
      // 311: iload 20
      // 313: aload 19
      // 315: ifnull 177
      // 318: aload 19
      // 31a: lload 4
      // 31c: lconst_0
      // 31d: lcmp
      // 31e: iflt 1ad
      // 321: ifnull 402
      // 324: tableswitch 154 42 45 36 70 154 70
      // 344: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 347: athrow
      // 348: iinc 18 1
      // 34b: aload 3
      // 34c: lload 6
      // 34e: bipush 1
      // 34f: anewarray 4
      // 352: dup_x2
      // 353: dup_x2
      // 354: pop
      // 355: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 358: bipush 0
      // 359: swap
      // 35a: aastore
      // 35b: invokevirtual rip/breeze/inject/վ.method_014 ([Ljava/lang/Object;)V
      // 35e: aload 19
      // 360: ifnonnull 303
      // 363: goto 36a
      // 366: invokestatic rip/breeze/inject/տ.method_004 (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 369: athrow
      // 36a: aload 1
      // 36b: iload 18
      // 36d: bipush 1
      // 36e: iadd
      // 36f: aload 3
      // 370: lload 14
      // 372: iload 20
      // 374: bipush 2
      // 375: anewarray 4
      // 378: dup_x1
      // 379: swap
      // 37a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 37d: bipush 1
      // 37e: swap
      // 37f: aastore
      // 380: dup_x2
      // 381: dup_x2
      // 382: pop
      // 383: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 386: bipush 0
      // 387: swap
      // 388: aastore
      // 389: invokevirtual rip/breeze/inject/վ.method_015 ([Ljava/lang/Object;)Lrip/breeze/inject/վ;
      // 38c: lload 16
      // 38e: bipush 4
      // 38f: anewarray 4
      // 392: dup_x2
      // 393: dup_x2
      // 394: pop
      // 395: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 398: bipush 3
      // 399: swap
      // 39a: aastore
      // 39b: dup_x1
      // 39c: swap
      // 39d: bipush 2
      // 39e: swap
      // 39f: aastore
      // 3a0: dup_x1
      // 3a1: swap
      // 3a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3a5: bipush 1
      // 3a6: swap
      // 3a7: aastore
      // 3a8: dup_x1
      // 3a9: swap
      // 3aa: bipush 0
      // 3ab: swap
      // 3ac: aastore
      // 3ad: invokestatic rip/breeze/inject/տ.method_003 ([Ljava/lang/Object;)I
      // 3b0: istore 18
      // 3b2: aload 19
      // 3b4: lload 4
      // 3b6: lconst_0
      // 3b7: lcmp
      // 3b8: ifle 3ff
      // 3bb: ifnonnull 303
      // 3be: aload 1
      // 3bf: iload 18
      // 3c1: aload 3
      // 3c2: lload 14
      // 3c4: bipush 61
      // 3c6: bipush 2
      // 3c7: anewarray 4
      // 3ca: dup_x1
      // 3cb: swap
      // 3cc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3cf: bipush 1
      // 3d0: swap
      // 3d1: aastore
      // 3d2: dup_x2
      // 3d3: dup_x2
      // 3d4: pop
      // 3d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3d8: bipush 0
      // 3d9: swap
      // 3da: aastore
      // 3db: invokevirtual rip/breeze/inject/վ.method_015 ([Ljava/lang/Object;)Lrip/breeze/inject/վ;
      // 3de: lload 16
      // 3e0: bipush 4
      // 3e1: anewarray 4
      // 3e4: dup_x2
      // 3e5: dup_x2
      // 3e6: pop
      // 3e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ea: bipush 3
      // 3eb: swap
      // 3ec: aastore
      // 3ed: dup_x1
      // 3ee: swap
      // 3ef: bipush 2
      // 3f0: swap
      // 3f1: aastore
      // 3f2: dup_x1
      // 3f3: swap
      // 3f4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3f7: bipush 1
      // 3f8: swap
      // 3f9: aastore
      // 3fa: dup_x1
      // 3fb: swap
      // 3fc: bipush 0
      // 3fd: swap
      // 3fe: aastore
      // 3ff: invokestatic rip/breeze/inject/տ.method_003 ([Ljava/lang/Object;)I
      // 402: istore 18
      // 404: aload 19
      // 406: ifnonnull 303
      // 409: aload 19
      // 40b: lload 4
      // 40d: lconst_0
      // 40e: lcmp
      // 40f: ifle 27f
      // 412: ifnonnull 16a
      // 415: iload 18
      // 417: lload 4
      // 419: lconst_0
      // 41a: lcmp
      // 41b: ifle 1ab
      // 41e: ireturn
      // 41f: new java/lang/IllegalArgumentException
      // 422: dup
      // 423: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 426: athrow
      // try (63 -> 67): 67 java/lang/IllegalArgumentException
      // try (66 -> 81): 82 java/lang/IllegalArgumentException
      // try (155 -> 169): 170 java/lang/IllegalArgumentException
      // try (163 -> 173): 174 java/lang/IllegalArgumentException
      // try (172 -> 183): 184 java/lang/IllegalArgumentException
      // try (176 -> 187): 188 java/lang/IllegalArgumentException
      // try (197 -> 205): 206 java/lang/IllegalArgumentException
      // try (203 -> 226): 227 java/lang/IllegalArgumentException
      // try (229 -> 253): 254 java/lang/IllegalArgumentException
      // try (257 -> 260): 261 java/lang/IllegalArgumentException
      // try (263 -> 278): 279 java/lang/IllegalArgumentException
      // try (305 -> 313): 314 java/lang/IllegalArgumentException
      // try (311 -> 334): 335 java/lang/IllegalArgumentException
      // try (337 -> 361): 362 java/lang/IllegalArgumentException
      // try (376 -> 383): 383 java/lang/IllegalArgumentException
      // try (382 -> 400): 401 java/lang/IllegalArgumentException
   }

   private static IllegalArgumentException invoke_4(IllegalArgumentException var0) {
      return var0;
   }
}
