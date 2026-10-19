package rip.breeze.inject;

import java.util.List;

public class ù extends ü {
   public String string_ü_2;
   public List<Object> list_û_2;

   public ù(String var1, long var2) {
      var2 = encKey_b_2 ^ var2;
      long var4 = var2 ^ 49688366657199L;
      this(589824, var1, var4);
      if (this.getClass() != ù.class) {
         throw new IllegalStateException();
      }
   }

   public ù(int var1, String var2, long var3) {
      var3 = encKey_b_2 ^ var3;
      long var5 = var3 ^ 2251493775879L;
      super(var1, var5);
      this.string_ü_2 = var2;
   }

   ù(char var1, int var2, int var3, List var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ encKey_b_2;
      long var7 = var5 ^ 38123079328516L;
      super(589824, var7);
      this.list_û_2 = var4;
   }

   @Override
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
      // 00e: checkcast java/lang/String
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Object
      // 019: astore 5
      // 01b: pop
      // 01c: lload 2
      // 01d: dup2
      // 01e: ldc2_w 4537331149241
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 110062103416574
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 99013284867300
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 139494085848289
      // 036: lxor
      // 037: lstore 12
      // 039: dup2
      // 03a: ldc2_w 108493864678563
      // 03d: lxor
      // 03e: lstore 14
      // 040: dup2
      // 041: ldc2_w 39761340322389
      // 044: lxor
      // 045: lstore 16
      // 047: dup2
      // 048: ldc2_w 48509368471941
      // 04b: lxor
      // 04c: lstore 18
      // 04e: dup2
      // 04f: ldc2_w 12235791165453
      // 052: lxor
      // 053: lstore 20
      // 055: pop2
      // 056: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 059: istore 22
      // 05b: aload 0
      // 05c: iload 22
      // 05e: ifeq 091
      // 061: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 064: ifnonnull 090
      // 067: goto 06e
      // 06a: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 06d: athrow
      // 06e: aload 0
      // 06f: new java/util/ArrayList
      // 072: dup
      // 073: aload 0
      // 074: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 077: ifnull 089
      // 07a: goto 081
      // 07d: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 080: athrow
      // 081: bipush 2
      // 082: goto 08a
      // 085: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 088: athrow
      // 089: bipush 1
      // 08a: invokespecial java/util/ArrayList.<init> (I)V
      // 08d: putfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 090: aload 0
      // 091: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 094: lload 2
      // 095: lconst_0
      // 096: lcmp
      // 097: iflt 0be
      // 09a: iload 22
      // 09c: ifeq 0be
      // 09f: ifnull 0bc
      // 0a2: goto 0a9
      // 0a5: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 0ad: aload 4
      // 0af: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b4: pop
      // 0b5: goto 0bc
      // 0b8: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0bb: athrow
      // 0bc: aload 5
      // 0be: instanceof [B
      // 0c1: iload 22
      // 0c3: lload 2
      // 0c4: lconst_0
      // 0c5: lcmp
      // 0c6: ifle 116
      // 0c9: ifeq 114
      // 0cc: ifeq 108
      // 0cf: goto 0d6
      // 0d2: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 0da: lload 14
      // 0dc: aload 5
      // 0de: checkcast [B
      // 0e1: bipush 2
      // 0e2: anewarray 24
      // 0e5: dup_x1
      // 0e6: swap
      // 0e7: bipush 1
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x2
      // 0eb: dup_x2
      // 0ec: pop
      // 0ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f0: bipush 0
      // 0f1: swap
      // 0f2: aastore
      // 0f3: invokestatic rip/breeze/inject/ԧ.method_004 ([Ljava/lang/Object;)Ljava/util/List;
      // 0f6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0fb: pop
      // 0fc: iload 22
      // 0fe: ifne 35a
      // 101: goto 108
      // 104: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 107: athrow
      // 108: aload 5
      // 10a: instanceof [Z
      // 10d: goto 114
      // 110: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 113: athrow
      // 114: iload 22
      // 116: lload 2
      // 117: lconst_0
      // 118: lcmp
      // 119: iflt 169
      // 11c: ifeq 167
      // 11f: ifeq 15b
      // 122: goto 129
      // 125: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 128: athrow
      // 129: aload 0
      // 12a: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 12d: aload 5
      // 12f: checkcast [Z
      // 132: lload 12
      // 134: bipush 2
      // 135: anewarray 24
      // 138: dup_x2
      // 139: dup_x2
      // 13a: pop
      // 13b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13e: bipush 1
      // 13f: swap
      // 140: aastore
      // 141: dup_x1
      // 142: swap
      // 143: bipush 0
      // 144: swap
      // 145: aastore
      // 146: invokestatic rip/breeze/inject/ԧ.method_005 ([Ljava/lang/Object;)Ljava/util/List;
      // 149: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 14e: pop
      // 14f: iload 22
      // 151: ifne 35a
      // 154: goto 15b
      // 157: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 15a: athrow
      // 15b: aload 5
      // 15d: instanceof [S
      // 160: goto 167
      // 163: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 166: athrow
      // 167: iload 22
      // 169: lload 2
      // 16a: lconst_0
      // 16b: lcmp
      // 16c: ifle 1bc
      // 16f: ifeq 1ba
      // 172: ifeq 1ae
      // 175: goto 17c
      // 178: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 17b: athrow
      // 17c: aload 0
      // 17d: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 180: lload 18
      // 182: aload 5
      // 184: checkcast [S
      // 187: bipush 2
      // 188: anewarray 24
      // 18b: dup_x1
      // 18c: swap
      // 18d: bipush 1
      // 18e: swap
      // 18f: aastore
      // 190: dup_x2
      // 191: dup_x2
      // 192: pop
      // 193: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 196: bipush 0
      // 197: swap
      // 198: aastore
      // 199: invokestatic rip/breeze/inject/ԧ.method_006 ([Ljava/lang/Object;)Ljava/util/List;
      // 19c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1a1: pop
      // 1a2: iload 22
      // 1a4: ifne 35a
      // 1a7: goto 1ae
      // 1aa: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1ad: athrow
      // 1ae: aload 5
      // 1b0: instanceof [C
      // 1b3: goto 1ba
      // 1b6: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1b9: athrow
      // 1ba: iload 22
      // 1bc: lload 2
      // 1bd: lconst_0
      // 1be: lcmp
      // 1bf: iflt 20f
      // 1c2: ifeq 20d
      // 1c5: ifeq 201
      // 1c8: goto 1cf
      // 1cb: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1ce: athrow
      // 1cf: aload 0
      // 1d0: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 1d3: aload 5
      // 1d5: checkcast [C
      // 1d8: lload 8
      // 1da: bipush 2
      // 1db: anewarray 24
      // 1de: dup_x2
      // 1df: dup_x2
      // 1e0: pop
      // 1e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e4: bipush 1
      // 1e5: swap
      // 1e6: aastore
      // 1e7: dup_x1
      // 1e8: swap
      // 1e9: bipush 0
      // 1ea: swap
      // 1eb: aastore
      // 1ec: invokestatic rip/breeze/inject/ԧ.method_007 ([Ljava/lang/Object;)Ljava/util/List;
      // 1ef: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1f4: pop
      // 1f5: iload 22
      // 1f7: ifne 35a
      // 1fa: goto 201
      // 1fd: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 200: athrow
      // 201: aload 5
      // 203: instanceof [I
      // 206: goto 20d
      // 209: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 20c: athrow
      // 20d: iload 22
      // 20f: lload 2
      // 210: lconst_0
      // 211: lcmp
      // 212: ifle 262
      // 215: ifeq 260
      // 218: ifeq 254
      // 21b: goto 222
      // 21e: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 221: athrow
      // 222: aload 0
      // 223: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 226: aload 5
      // 228: checkcast [I
      // 22b: lload 6
      // 22d: bipush 2
      // 22e: anewarray 24
      // 231: dup_x2
      // 232: dup_x2
      // 233: pop
      // 234: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 237: bipush 1
      // 238: swap
      // 239: aastore
      // 23a: dup_x1
      // 23b: swap
      // 23c: bipush 0
      // 23d: swap
      // 23e: aastore
      // 23f: invokestatic rip/breeze/inject/ԧ.method_008 ([Ljava/lang/Object;)Ljava/util/List;
      // 242: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 247: pop
      // 248: iload 22
      // 24a: ifne 35a
      // 24d: goto 254
      // 250: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 253: athrow
      // 254: aload 5
      // 256: instanceof [J
      // 259: goto 260
      // 25c: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 25f: athrow
      // 260: iload 22
      // 262: lload 2
      // 263: lconst_0
      // 264: lcmp
      // 265: iflt 2b5
      // 268: ifeq 2b3
      // 26b: ifeq 2a7
      // 26e: goto 275
      // 271: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 274: athrow
      // 275: aload 0
      // 276: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 279: aload 5
      // 27b: checkcast [J
      // 27e: lload 16
      // 280: bipush 2
      // 281: anewarray 24
      // 284: dup_x2
      // 285: dup_x2
      // 286: pop
      // 287: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28a: bipush 1
      // 28b: swap
      // 28c: aastore
      // 28d: dup_x1
      // 28e: swap
      // 28f: bipush 0
      // 290: swap
      // 291: aastore
      // 292: invokestatic rip/breeze/inject/ԧ.method_010 ([Ljava/lang/Object;)Ljava/util/List;
      // 295: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 29a: pop
      // 29b: iload 22
      // 29d: ifne 35a
      // 2a0: goto 2a7
      // 2a3: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2a6: athrow
      // 2a7: aload 5
      // 2a9: instanceof [F
      // 2ac: goto 2b3
      // 2af: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2b2: athrow
      // 2b3: iload 22
      // 2b5: lload 2
      // 2b6: lconst_0
      // 2b7: lcmp
      // 2b8: ifle 308
      // 2bb: ifeq 306
      // 2be: ifeq 2fa
      // 2c1: goto 2c8
      // 2c4: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2c7: athrow
      // 2c8: aload 0
      // 2c9: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 2cc: aload 5
      // 2ce: checkcast [F
      // 2d1: lload 20
      // 2d3: bipush 2
      // 2d4: anewarray 24
      // 2d7: dup_x2
      // 2d8: dup_x2
      // 2d9: pop
      // 2da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2dd: bipush 1
      // 2de: swap
      // 2df: aastore
      // 2e0: dup_x1
      // 2e1: swap
      // 2e2: bipush 0
      // 2e3: swap
      // 2e4: aastore
      // 2e5: invokestatic rip/breeze/inject/ԧ.method_009 ([Ljava/lang/Object;)Ljava/util/List;
      // 2e8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2ed: pop
      // 2ee: iload 22
      // 2f0: ifne 35a
      // 2f3: goto 2fa
      // 2f6: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2f9: athrow
      // 2fa: aload 5
      // 2fc: instanceof [D
      // 2ff: goto 306
      // 302: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 305: athrow
      // 306: iload 22
      // 308: ifeq 359
      // 30b: ifeq 347
      // 30e: goto 315
      // 311: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 314: athrow
      // 315: aload 0
      // 316: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 319: aload 5
      // 31b: checkcast [D
      // 31e: lload 10
      // 320: bipush 2
      // 321: anewarray 24
      // 324: dup_x2
      // 325: dup_x2
      // 326: pop
      // 327: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32a: bipush 1
      // 32b: swap
      // 32c: aastore
      // 32d: dup_x1
      // 32e: swap
      // 32f: bipush 0
      // 330: swap
      // 331: aastore
      // 332: invokestatic rip/breeze/inject/ԧ.method_011 ([Ljava/lang/Object;)Ljava/util/List;
      // 335: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 33a: pop
      // 33b: iload 22
      // 33d: ifne 35a
      // 340: goto 347
      // 343: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 346: athrow
      // 347: aload 0
      // 348: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 34b: aload 5
      // 34d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 352: goto 359
      // 355: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 358: athrow
      // 359: pop
      // 35a: return
      // try (54 -> 59): 60 java/lang/IllegalStateException
      // try (57 -> 68): 69 java/lang/IllegalStateException
      // try (62 -> 73): 73 java/lang/IllegalStateException
      // try (79 -> 87): 88 java/lang/IllegalStateException
      // try (86 -> 95): 96 java/lang/IllegalStateException
      // try (99 -> 107): 108 java/lang/IllegalStateException
      // try (106 -> 134): 135 java/lang/IllegalStateException
      // try (110 -> 139): 140 java/lang/IllegalStateException
      // try (142 -> 149): 150 java/lang/IllegalStateException
      // try (148 -> 176): 177 java/lang/IllegalStateException
      // try (152 -> 181): 182 java/lang/IllegalStateException
      // try (184 -> 191): 192 java/lang/IllegalStateException
      // try (190 -> 218): 219 java/lang/IllegalStateException
      // try (194 -> 223): 224 java/lang/IllegalStateException
      // try (226 -> 233): 234 java/lang/IllegalStateException
      // try (232 -> 260): 261 java/lang/IllegalStateException
      // try (236 -> 265): 266 java/lang/IllegalStateException
      // try (268 -> 275): 276 java/lang/IllegalStateException
      // try (274 -> 302): 303 java/lang/IllegalStateException
      // try (278 -> 307): 308 java/lang/IllegalStateException
      // try (310 -> 317): 318 java/lang/IllegalStateException
      // try (316 -> 344): 345 java/lang/IllegalStateException
      // try (320 -> 349): 350 java/lang/IllegalStateException
      // try (352 -> 359): 360 java/lang/IllegalStateException
      // try (358 -> 386): 387 java/lang/IllegalStateException
      // try (362 -> 391): 392 java/lang/IllegalStateException
      // try (394 -> 397): 398 java/lang/IllegalStateException
      // try (396 -> 424): 425 java/lang/IllegalStateException
      // try (400 -> 431): 432 java/lang/IllegalStateException
   }

   @Override
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
      // 23: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 26: istore 7
      // 28: aload 0
      // 29: iload 7
      // 2b: lload 3
      // 2c: lconst_0
      // 2d: lcmp
      // 2e: iflt 66
      // 31: ifeq 64
      // 34: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 37: ifnonnull 63
      // 3a: goto 41
      // 3d: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 40: athrow
      // 41: aload 0
      // 42: new java/util/ArrayList
      // 45: dup
      // 46: aload 0
      // 47: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 4a: ifnull 5c
      // 4d: goto 54
      // 50: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 53: athrow
      // 54: bipush 2
      // 55: goto 5d
      // 58: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5b: athrow
      // 5c: bipush 1
      // 5d: invokespecial java/util/ArrayList.<init> (I)V
      // 60: putfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 63: aload 0
      // 64: iload 7
      // 66: ifeq 89
      // 69: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 6c: ifnull 88
      // 6f: goto 76
      // 72: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 75: athrow
      // 76: aload 0
      // 77: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 7a: aload 2
      // 7b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 80: pop
      // 81: goto 88
      // 84: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 87: athrow
      // 88: aload 0
      // 89: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 8c: bipush 2
      // 8d: anewarray 55
      // 90: dup
      // 91: bipush 0
      // 92: aload 5
      // 94: aastore
      // 95: dup
      // 96: bipush 1
      // 97: aload 6
      // 99: aastore
      // 9a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9f: pop
      // a0: return
      // try (25 -> 34): 35 java/lang/IllegalStateException
      // try (32 -> 43): 44 java/lang/IllegalStateException
      // try (37 -> 48): 48 java/lang/IllegalStateException
      // try (54 -> 58): 59 java/lang/IllegalStateException
      // try (56 -> 66): 67 java/lang/IllegalStateException
   }

   @Override
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
      // 1e: ldc2_w 62914604009558
      // 21: lxor
      // 22: lstore 6
      // 24: pop2
      // 25: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 28: istore 8
      // 2a: aload 0
      // 2b: iload 8
      // 2d: ifeq 60
      // 30: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 33: ifnonnull 5f
      // 36: goto 3d
      // 39: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: new java/util/ArrayList
      // 41: dup
      // 42: aload 0
      // 43: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 46: ifnull 58
      // 49: goto 50
      // 4c: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4f: athrow
      // 50: bipush 2
      // 51: goto 59
      // 54: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 57: athrow
      // 58: bipush 1
      // 59: invokespecial java/util/ArrayList.<init> (I)V
      // 5c: putfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 5f: aload 0
      // 60: iload 8
      // 62: ifeq 8e
      // 65: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 68: ifnull 84
      // 6b: goto 72
      // 6e: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 71: athrow
      // 72: aload 0
      // 73: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 76: aload 2
      // 77: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7c: pop
      // 7d: goto 84
      // 80: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 83: athrow
      // 84: new rip/breeze/inject/ù
      // 87: dup
      // 88: aload 3
      // 89: lload 6
      // 8b: invokespecial rip/breeze/inject/ù.<init> (Ljava/lang/String;J)V
      // 8e: astore 9
      // 90: aload 0
      // 91: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 94: aload 9
      // 96: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9b: pop
      // 9c: aload 9
      // 9e: areturn
      // try (26 -> 31): 32 java/lang/IllegalStateException
      // try (29 -> 40): 41 java/lang/IllegalStateException
      // try (34 -> 45): 45 java/lang/IllegalStateException
      // try (51 -> 55): 56 java/lang/IllegalStateException
      // try (53 -> 63): 64 java/lang/IllegalStateException
   }

   @Override
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
      // 16: ldc2_w 23953227749134
      // 19: lxor
      // 1a: dup2
      // 1b: bipush 48
      // 1d: lushr
      // 1e: l2i
      // 1f: istore 5
      // 21: dup2
      // 22: bipush 16
      // 24: lshl
      // 25: bipush 32
      // 27: lushr
      // 28: l2i
      // 29: istore 6
      // 2b: dup2
      // 2c: bipush 48
      // 2e: lshl
      // 2f: bipush 48
      // 31: lushr
      // 32: l2i
      // 33: istore 7
      // 35: pop2
      // 36: pop2
      // 37: invokestatic rip/breeze/inject/BreezeClass12.checkCondition ()Z
      // 3a: istore 8
      // 3c: aload 0
      // 3d: iload 8
      // 3f: ifeq 72
      // 42: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 45: ifnonnull 71
      // 48: goto 4f
      // 4b: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4e: athrow
      // 4f: aload 0
      // 50: new java/util/ArrayList
      // 53: dup
      // 54: aload 0
      // 55: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 58: ifnull 6a
      // 5b: goto 62
      // 5e: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 61: athrow
      // 62: bipush 2
      // 63: goto 6b
      // 66: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 69: athrow
      // 6a: bipush 1
      // 6b: invokespecial java/util/ArrayList.<init> (I)V
      // 6e: putfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 71: aload 0
      // 72: iload 8
      // 74: ifeq 8c
      // 77: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 7a: ifnull 97
      // 7d: goto 84
      // 80: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 83: athrow
      // 84: aload 0
      // 85: goto 8c
      // 88: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 8b: athrow
      // 8c: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 8f: aload 4
      // 91: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 96: pop
      // 97: new java/util/ArrayList
      // 9a: dup
      // 9b: invokespecial java/util/ArrayList.<init> ()V
      // 9e: astore 9
      // a0: aload 0
      // a1: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // a4: aload 9
      // a6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // ab: pop
      // ac: new rip/breeze/inject/ù
      // af: dup
      // b0: iload 5
      // b2: i2c
      // b3: iload 6
      // b5: iload 7
      // b7: aload 9
      // b9: invokespecial rip/breeze/inject/ù.<init> (CIILjava/util/List;)V
      // bc: areturn
      // try (40 -> 45): 46 java/lang/IllegalStateException
      // try (43 -> 54): 55 java/lang/IllegalStateException
      // try (48 -> 59): 59 java/lang/IllegalStateException
      // try (65 -> 69): 70 java/lang/IllegalStateException
      // try (67 -> 73): 74 java/lang/IllegalStateException
   }

   @Override
   public void invoke_5(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   @Override
   public void invoke_1(Object[] var1) {
      int var2 = (Integer)var1[0];
   }

   @Override
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast rip/breeze/inject/ü
      // 11: astore 4
      // 13: pop
      // 14: getstatic rip/breeze/inject/ù.encKey_b_2 J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 82974228103984
      // 1f: lxor
      // 20: lstore 5
      // 22: dup2
      // 23: ldc2_w 93263041760018
      // 26: lxor
      // 27: lstore 7
      // 29: pop2
      // 2a: invokestatic rip/breeze/inject/BreezeClass12.isValid ()Z
      // 2d: istore 9
      // 2f: aload 4
      // 31: ifnull dd
      // 34: aload 0
      // 35: iload 9
      // 37: ifne cb
      // 3a: goto 41
      // 3d: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 40: athrow
      // 41: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 44: ifnull c9
      // 47: goto 4e
      // 4a: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4d: athrow
      // 4e: bipush 0
      // 4f: istore 10
      // 51: aload 0
      // 52: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 55: invokeinterface java/util/List.size ()I 1
      // 5a: istore 11
      // 5c: iload 10
      // 5e: iload 11
      // 60: if_icmpge c9
      // 63: aload 0
      // 64: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 67: iload 10
      // 69: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 6e: checkcast java/lang/String
      // 71: astore 12
      // 73: aload 0
      // 74: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 77: iload 10
      // 79: bipush 1
      // 7a: iadd
      // 7b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 80: astore 13
      // 82: aload 4
      // 84: aload 12
      // 86: lload 7
      // 88: aload 13
      // 8a: bipush 4
      // 8b: anewarray 24
      // 8e: dup_x1
      // 8f: swap
      // 90: bipush 3
      // 91: swap
      // 92: aastore
      // 93: dup_x2
      // 94: dup_x2
      // 95: pop
      // 96: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 99: bipush 2
      // 9a: swap
      // 9b: aastore
      // 9c: dup_x1
      // 9d: swap
      // 9e: bipush 1
      // 9f: swap
      // a0: aastore
      // a1: dup_x1
      // a2: swap
      // a3: bipush 0
      // a4: swap
      // a5: aastore
      // a6: invokestatic rip/breeze/inject/ù.method_003 ([Ljava/lang/Object;)V
      // a9: iinc 10 2
      // ac: iload 9
      // ae: lload 2
      // af: lconst_0
      // b0: lcmp
      // b1: iflt b9
      // b4: ifne dd
      // b7: iload 9
      // b9: ifeq 5c
      // bc: lload 2
      // bd: lconst_0
      // be: lcmp
      // bf: iflt ac
      // c2: goto c9
      // c5: invokestatic rip/breeze/inject/ù.method_004 (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // c8: athrow
      // c9: aload 4
      // cb: lload 5
      // cd: bipush 1
      // ce: anewarray 24
      // d1: dup_x2
      // d2: dup_x2
      // d3: pop
      // d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d7: bipush 0
      // d8: swap
      // d9: aastore
      // da: invokevirtual rip/breeze/inject/ü.method_005 ([Ljava/lang/Object;)V
      // dd: return
      // try (29 -> 34): 35 java/lang/IllegalStateException
      // try (31 -> 39): 40 java/lang/IllegalStateException
      // try (64 -> 102): 107 java/lang/IllegalStateException
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   static void invoke_3(Object[] var0) {
      ü var1 = (ü)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      Object var5 = var0[3];
      var3 = encKey_b_2 ^ var3;
      long var6 = var3 ^ 135963937031184L;
      long var8 = var3 ^ 81335618699488L;
      long var10 = var3 ^ 8693448286460L;
      long var12 = var3 ^ 73141338104890L;
      long var14 = var3 ^ 93263041760018L;
      long var16 = var3 ^ 102396388977688L;
      long var18 = var3 ^ 14597544575622L;
      boolean var20 = BreezeClass12.isValid();

      Object var10000;
      label153: {
         try {
            var10000 = var1;
            if (var20) {
               break label153;
            }

            if (var1 == null) {
               return;
            }
         } catch (IllegalStateException var38) {
            throw method_004(var38);
         }

         var10000 = var5;
      }

      boolean var10001;
      label145: {
         label144: {
            label159: {
               try {
                  var10000 = var10000 instanceof String[];
                  var10001 = var20;
                  if (var3 < 0L) {
                     break label145;
                  }

                  if (var20) {
                     break label144;
                  }

                  if (!var10000) {
                     break label159;
                  }
               } catch (IllegalStateException var37) {
                  throw method_004(var37);
               }

               String[] var21 = (String[])var5;

               try {
                  var1.method_002(new Object[]{var2, var8, var21[0], var21[1]});
                  var10000 = var20;
                  if (var3 <= 0L) {
                     break label144;
                  }

                  if (!var20) {
                     return;
                  }
               } catch (IllegalStateException var36) {
                  throw method_004(var36);
               }
            }

            try {
               var10000 = var5 instanceof ù;
            } catch (IllegalStateException var29) {
               throw method_004(var29);
            }
         }

         try {
            var10001 = var20;
         } catch (IllegalStateException var28) {
            throw method_004(var28);
         }
      }

      label126: {
         label161: {
            try {
               if (var10001) {
                  break label126;
               }

               if (!var10000) {
                  break label161;
               }
            } catch (IllegalStateException var35) {
               throw method_004(var35);
            }

            ù var40 = (ù)var5;

            try {
               var40.method_002(new Object[]{var14, var1.method_003(new Object[]{var2, var40.string_ü_2, var6})});
               var10000 = var20;
               if (var3 < 0L) {
                  break label126;
               }

               if (!var20) {
                  return;
               }
            } catch (IllegalStateException var34) {
               throw method_004(var34);
            }
         }

         try {
            var10000 = var5 instanceof List;
         } catch (IllegalStateException var27) {
            throw method_004(var27);
         }
      }

      if (var10000) {
         ü var41 = var1.method_004(new Object[]{var10, var2});

         label108: {
            label163: {
               label106: {
                  try {
                     var10000 = var41;
                     if (var20) {
                        break label106;
                     }

                     if (var41 == null) {
                        break label163;
                     }
                  } catch (IllegalStateException var33) {
                     throw method_004(var33);
                  }

                  var10000 = var5;
               }

               List var22 = (List)var10000;
               int var23 = 0;
               int var24 = var22.size();

               label97:
               while (var23 < var24) {
                  try {
                     method_003(new Object[]{var41, null, var16, var22.get(var23)});
                     var23++;
                  } catch (IllegalStateException var26) {
                     throw method_004(var26);
                  }

                  while (true) {
                     try {
                        var10000 = var20;
                        if (var3 < 0L) {
                           break label108;
                        }

                        if (var20) {
                           break label163;
                        }

                        if (!var20) {
                           break;
                        }
                     } catch (IllegalStateException var32) {
                        throw method_004(var32);
                     }

                     if (var3 > 0L) {
                        break label97;
                     }
                  }
               }

               var41.method_005(new Object[]{var12});
            }

            try {
               if (var3 <= 0L) {
                  return;
               }

               var10000 = var20;
            } catch (IllegalStateException var31) {
               throw method_004(var31);
            }
         }

         try {
            if (!var10000) {
               return;
            }
         } catch (IllegalStateException var30) {
            throw method_004(var30);
         }
      }

      try {
         var1.method_001(new Object[]{var18, var2, var5});
      } catch (IllegalStateException var25) {
         throw method_004(var25);
      }
   }

   private static IllegalStateException invoke_4(IllegalStateException var0) {
      return var0;
   }
}
