package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import rip.breeze.inject.թ;

public interface IBreezeInterface {
   long encKey_b = rip.breeze.inject.Util138.getIBreezeInterface(3944122187794076200L, 6980357803072599591L, MethodHandles.lookup().lookupClass())
      .method_003(223784065962472L);

   void invoke_1(Object[] var1);

   default թ[] invoke_2(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:31 from source 28_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
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
      // 016: checkcast java/lang/String
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Integer
      // 021: invokevirtual java/lang/Integer.intValue ()I
      // 024: istore 6
      // 026: pop
      // 027: getstatic rip/breeze/classtransform/IBreezeInterface.encKey_b J
      // 02a: lload 2
      // 02b: lxor
      // 02c: lstore 2
      // 02d: lload 2
      // 02e: dup2
      // 02f: ldc2_w 8215171664252
      // 032: lxor
      // 033: lstore 7
      // 035: dup2
      // 036: ldc2_w 106332279719841
      // 039: lxor
      // 03a: lstore 9
      // 03c: dup2
      // 03d: ldc2_w 30865641925959
      // 040: lxor
      // 041: lstore 11
      // 043: dup2
      // 044: ldc2_w 39819092601858
      // 047: lxor
      // 048: lstore 13
      // 04a: dup2
      // 04b: ldc2_w 49132899678924
      // 04e: lxor
      // 04f: lstore 15
      // 051: dup2
      // 052: ldc2_w 103857322049683
      // 055: lxor
      // 056: lstore 17
      // 058: dup2
      // 059: ldc2_w 21777710171484
      // 05c: lxor
      // 05d: lstore 19
      // 05f: pop2
      // 060: invokestatic rip/breeze/classtransform/PlayerUtil8.getString ()Ljava/lang/String;
      // 063: new rip/breeze/inject/թ
      // 066: dup
      // 067: invokespecial rip/breeze/inject/թ.<init> ()V
      // 06a: astore 21
      // 06c: new rip/breeze/inject/թ
      // 06f: dup
      // 070: invokespecial rip/breeze/inject/թ.<init> ()V
      // 073: astore 22
      // 075: astore 23
      // 077: aload 4
      // 079: aload 23
      // 07b: ifnull 12d
      // 07e: ifnull 12b
      // 081: lload 11
      // 083: aload 4
      // 085: bipush 2
      // 086: anewarray 4
      // 089: dup_x1
      // 08a: swap
      // 08b: bipush 1
      // 08c: swap
      // 08d: aastore
      // 08e: dup_x2
      // 08f: dup_x2
      // 090: pop
      // 091: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 094: bipush 0
      // 095: swap
      // 096: aastore
      // 097: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 09a: astore 24
      // 09c: aload 21
      // 09e: new rip/breeze/inject/ի
      // 0a1: dup
      // 0a2: lload 15
      // 0a4: aload 24
      // 0a6: bipush 2
      // 0a7: anewarray 4
      // 0aa: dup_x1
      // 0ab: swap
      // 0ac: bipush 1
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x2
      // 0b0: dup_x2
      // 0b1: pop
      // 0b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: invokestatic rip/breeze/classtransform/MathUtil3.getValue_4 ([Ljava/lang/Object;)I
      // 0bb: iload 6
      // 0bd: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 0c0: lload 13
      // 0c2: bipush 2
      // 0c3: anewarray 4
      // 0c6: dup_x2
      // 0c7: dup_x2
      // 0c8: pop
      // 0c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cc: bipush 1
      // 0cd: swap
      // 0ce: aastore
      // 0cf: dup_x1
      // 0d0: swap
      // 0d1: bipush 0
      // 0d2: swap
      // 0d3: aastore
      // 0d4: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 0d7: aload 22
      // 0d9: new rip/breeze/inject/ի
      // 0dc: dup
      // 0dd: aload 24
      // 0df: lload 17
      // 0e1: bipush 2
      // 0e2: anewarray 4
      // 0e5: dup_x2
      // 0e6: dup_x2
      // 0e7: pop
      // 0e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb: bipush 1
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: bipush 0
      // 0f1: swap
      // 0f2: aastore
      // 0f3: invokestatic rip/breeze/classtransform/MathUtil3.getValue_3 ([Ljava/lang/Object;)I
      // 0f6: iload 6
      // 0f8: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 0fb: lload 13
      // 0fd: bipush 2
      // 0fe: anewarray 4
      // 101: dup_x2
      // 102: dup_x2
      // 103: pop
      // 104: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 107: bipush 1
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 112: iload 6
      // 114: aload 24
      // 116: lload 7
      // 118: bipush 1
      // 119: anewarray 4
      // 11c: dup_x2
      // 11d: dup_x2
      // 11e: pop
      // 11f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 122: bipush 0
      // 123: swap
      // 124: aastore
      // 125: invokevirtual rip/breeze/inject/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 128: iadd
      // 129: istore 6
      // 12b: aload 5
      // 12d: lload 19
      // 12f: bipush 2
      // 130: anewarray 4
      // 133: dup_x2
      // 134: dup_x2
      // 135: pop
      // 136: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 139: bipush 1
      // 13a: swap
      // 13b: aastore
      // 13c: dup_x1
      // 13d: swap
      // 13e: bipush 0
      // 13f: swap
      // 140: aastore
      // 141: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 144: astore 24
      // 146: aload 24
      // 148: astore 25
      // 14a: aload 25
      // 14c: arraylength
      // 14d: istore 26
      // 14f: bipush 0
      // 150: istore 27
      // 152: iload 27
      // 154: iload 26
      // 156: if_icmpge 20a
      // 159: aload 25
      // 15b: iload 27
      // 15d: aaload
      // 15e: astore 28
      // 160: lload 15
      // 162: aload 28
      // 164: bipush 2
      // 165: anewarray 4
      // 168: dup_x1
      // 169: swap
      // 16a: bipush 1
      // 16b: swap
      // 16c: aastore
      // 16d: dup_x2
      // 16e: dup_x2
      // 16f: pop
      // 170: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 173: bipush 0
      // 174: swap
      // 175: aastore
      // 176: invokestatic rip/breeze/classtransform/MathUtil3.getValue_4 ([Ljava/lang/Object;)I
      // 179: istore 29
      // 17b: aload 28
      // 17d: lload 17
      // 17f: bipush 2
      // 180: anewarray 4
      // 183: dup_x2
      // 184: dup_x2
      // 185: pop
      // 186: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 189: bipush 1
      // 18a: swap
      // 18b: aastore
      // 18c: dup_x1
      // 18d: swap
      // 18e: bipush 0
      // 18f: swap
      // 190: aastore
      // 191: invokestatic rip/breeze/classtransform/MathUtil3.getValue_3 ([Ljava/lang/Object;)I
      // 194: istore 30
      // 196: aload 21
      // 198: new rip/breeze/inject/ի
      // 19b: dup
      // 19c: iload 29
      // 19e: iload 6
      // 1a0: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 1a3: lload 13
      // 1a5: bipush 2
      // 1a6: anewarray 4
      // 1a9: dup_x2
      // 1aa: dup_x2
      // 1ab: pop
      // 1ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1af: bipush 1
      // 1b0: swap
      // 1b1: aastore
      // 1b2: dup_x1
      // 1b3: swap
      // 1b4: bipush 0
      // 1b5: swap
      // 1b6: aastore
      // 1b7: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 1ba: lload 2
      // 1bb: lconst_0
      // 1bc: lcmp
      // 1bd: iflt 205
      // 1c0: aload 22
      // 1c2: aload 23
      // 1c4: ifnull 211
      // 1c7: new rip/breeze/inject/ի
      // 1ca: dup
      // 1cb: iload 30
      // 1cd: iload 6
      // 1cf: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 1d2: lload 13
      // 1d4: bipush 2
      // 1d5: anewarray 4
      // 1d8: dup_x2
      // 1d9: dup_x2
      // 1da: pop
      // 1db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1de: bipush 1
      // 1df: swap
      // 1e0: aastore
      // 1e1: dup_x1
      // 1e2: swap
      // 1e3: bipush 0
      // 1e4: swap
      // 1e5: aastore
      // 1e6: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 1e9: iload 6
      // 1eb: aload 28
      // 1ed: lload 7
      // 1ef: bipush 1
      // 1f0: anewarray 4
      // 1f3: dup_x2
      // 1f4: dup_x2
      // 1f5: pop
      // 1f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f9: bipush 0
      // 1fa: swap
      // 1fb: aastore
      // 1fc: invokevirtual rip/breeze/inject/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 1ff: iadd
      // 200: istore 6
      // 202: iinc 27 1
      // 205: aload 23
      // 207: ifnonnull 152
      // 20a: new rip/breeze/inject/թ
      // 20d: dup
      // 20e: invokespecial rip/breeze/inject/թ.<init> ()V
      // 211: astore 25
      // 213: aload 21
      // 215: bipush 0
      // 216: anewarray 4
      // 219: invokevirtual rip/breeze/inject/թ.method_001 ([Ljava/lang/Object;)I
      // 21c: bipush 1
      // 21d: isub
      // 21e: istore 26
      // 220: iload 26
      // 222: iflt 264
      // 225: aload 25
      // 227: aload 21
      // 229: iload 26
      // 22b: lload 9
      // 22d: bipush 2
      // 22e: anewarray 4
      // 231: dup_x2
      // 232: dup_x2
      // 233: pop
      // 234: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 237: bipush 1
      // 238: swap
      // 239: aastore
      // 23a: dup_x1
      // 23b: swap
      // 23c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 23f: bipush 0
      // 240: swap
      // 241: aastore
      // 242: invokevirtual rip/breeze/inject/թ.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 245: lload 13
      // 247: bipush 2
      // 248: anewarray 4
      // 24b: dup_x2
      // 24c: dup_x2
      // 24d: pop
      // 24e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 251: bipush 1
      // 252: swap
      // 253: aastore
      // 254: dup_x1
      // 255: swap
      // 256: bipush 0
      // 257: swap
      // 258: aastore
      // 259: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 25c: iinc 26 -1
      // 25f: aload 23
      // 261: ifnonnull 220
      // 264: lload 2
      // 265: lconst_0
      // 266: lcmp
      // 267: iflt 25f
      // 26a: bipush 2
      // 26b: anewarray 49
      // 26e: dup
      // 26f: bipush 0
      // 270: aload 25
      // 272: aastore
      // 273: dup
      // 274: bipush 1
      // 275: aload 22
      // 277: aastore
      // 278: areturn
   }
}
