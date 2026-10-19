package rip.breeze.client;

import java.util.concurrent.atomic.AtomicInteger;
import rip.breeze.StringDecryptor;

class Util114 {
   static final Util114 CONST_A = new Util114();

   Util137 getDataBuilder23(int param1, String param2, AtomicInteger param3, Util112 param4, int param5, byte param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 5
      // 007: i2l
      // 008: bipush 40
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: iload 6
      // 011: i2l
      // 012: bipush 56
      // 014: lshl
      // 015: bipush 56
      // 017: lushr
      // 018: lor
      // 019: getstatic rip/breeze/client/Util114.35691847530849L J
      // 01c: lxor
      // 01d: lstore 7
      // 01f: lload 7
      // 021: dup2
      // 022: ldc2_w 116432409366720
      // 025: lxor
      // 026: dup2
      // 027: bipush 32
      // 029: lushr
      // 02a: l2i
      // 02b: istore 9
      // 02d: dup2
      // 02e: bipush 32
      // 030: lshl
      // 031: bipush 40
      // 033: lushr
      // 034: l2i
      // 035: istore 10
      // 037: dup2
      // 038: bipush 56
      // 03a: lshl
      // 03b: bipush 56
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 11
      // 041: pop2
      // 042: dup2
      // 043: ldc2_w 20653363316558
      // 046: lxor
      // 047: lstore 12
      // 049: dup2
      // 04a: ldc2_w 69373474864219
      // 04d: lxor
      // 04e: lstore 14
      // 050: dup2
      // 051: ldc2_w 35200599410233
      // 054: lxor
      // 055: lstore 16
      // 057: pop2
      // 058: invokestatic rip/breeze/Util28.values ()[Ljava/lang/String;
      // 05b: bipush 0
      // 05c: istore 18
      // 05e: astore 19
      // 060: new java/lang/StringBuilder
      // 063: dup
      // 064: invokespecial java/lang/StringBuilder.<init> ()V
      // 067: astore 20
      // 069: bipush 0
      // 06a: istore 21
      // 06c: aload 2
      // 06d: aload 3
      // 06e: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 071: invokevirtual java/lang/String.charAt (I)C
      // 074: bipush 91
      // 076: if_icmpeq 07d
      // 079: bipush 1
      // 07a: goto 07e
      // 07d: bipush 0
      // 07e: istore 22
      // 080: iload 22
      // 082: iload 1
      // 083: ifle 08d
      // 086: ifne 0b3
      // 089: aload 2
      // 08a: invokevirtual java/lang/String.length ()I
      // 08d: aload 3
      // 08e: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 091: bipush 1
      // 092: iadd
      // 093: iload 5
      // 095: ifle 0ac
      // 098: if_icmple 0b3
      // 09b: aload 2
      // 09c: aload 3
      // 09d: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 0a0: bipush 1
      // 0a1: iadd
      // 0a2: invokevirtual java/lang/String.charAt (I)C
      // 0a5: iload 5
      // 0a7: iflt 0b0
      // 0aa: bipush 91
      // 0ac: if_icmpne 0b3
      // 0af: bipush 1
      // 0b0: goto 0b4
      // 0b3: bipush 0
      // 0b4: istore 23
      // 0b6: bipush 0
      // 0b7: istore 24
      // 0b9: aload 3
      // 0ba: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 0bd: istore 25
      // 0bf: iload 25
      // 0c1: aload 2
      // 0c2: invokevirtual java/lang/String.length ()I
      // 0c5: if_icmpge 249
      // 0c8: aload 2
      // 0c9: iload 25
      // 0cb: invokevirtual java/lang/String.charAt (I)C
      // 0ce: istore 26
      // 0d0: iload 26
      // 0d2: lload 12
      // 0d4: invokestatic rip/breeze/client/Util97.isValid (CJ)Z
      // 0d7: iload 6
      // 0d9: ifle 11f
      // 0dc: ifeq 11d
      // 0df: iload 25
      // 0e1: iload 6
      // 0e3: ifle 0fd
      // 0e6: ifeq 0fb
      // 0e9: aload 2
      // 0ea: iload 25
      // 0ec: bipush 1
      // 0ed: isub
      // 0ee: invokevirtual java/lang/String.charAt (I)C
      // 0f1: bipush 92
      // 0f3: iload 6
      // 0f5: iflt 125
      // 0f8: if_icmpeq 11d
      // 0fb: iload 18
      // 0fd: iload 1
      // 0fe: iflt 105
      // 101: ifne 108
      // 104: bipush 1
      // 105: goto 109
      // 108: bipush 0
      // 109: istore 18
      // 10b: aload 20
      // 10d: iload 26
      // 10f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 112: pop
      // 113: aload 19
      // 115: iload 5
      // 117: ifle 246
      // 11a: ifnull 23e
      // 11d: iload 26
      // 11f: iload 1
      // 120: iflt 139
      // 123: bipush 10
      // 125: if_icmpne 137
      // 128: aload 3
      // 129: invokevirtual java/util/concurrent/atomic/AtomicInteger.decrementAndGet ()I
      // 12c: iload 6
      // 12e: iflt 250
      // 131: pop
      // 132: aload 19
      // 134: ifnull 249
      // 137: iload 18
      // 139: iload 5
      // 13b: ifle 154
      // 13e: ifeq 152
      // 141: aload 20
      // 143: iload 26
      // 145: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 148: pop
      // 149: aload 19
      // 14b: iload 1
      // 14c: iflt 246
      // 14f: ifnull 23e
      // 152: iload 26
      // 154: bipush 61
      // 156: iload 1
      // 157: iflt 17d
      // 15a: if_icmpne 174
      // 15d: iload 22
      // 15f: iload 5
      // 161: ifle 176
      // 164: ifeq 174
      // 167: bipush 1
      // 168: iload 6
      // 16a: iflt 250
      // 16d: istore 21
      // 16f: aload 19
      // 171: ifnull 249
      // 174: iload 26
      // 176: iload 5
      // 178: ifle 1e3
      // 17b: bipush 93
      // 17d: if_icmpne 1e1
      // 180: iload 22
      // 182: iload 5
      // 184: ifle 1e3
      // 187: ifne 1e1
      // 18a: iload 23
      // 18c: iload 6
      // 18e: iflt 1c7
      // 191: ifeq 1ba
      // 194: aload 2
      // 195: invokevirtual java/lang/String.length ()I
      // 198: iload 5
      // 19a: iflt 242
      // 19d: aload 3
      // 19e: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 1a1: bipush 1
      // 1a2: iadd
      // 1a3: if_icmple 23e
      // 1a6: aload 2
      // 1a7: aload 3
      // 1a8: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 1ab: bipush 1
      // 1ac: iadd
      // 1ad: invokevirtual java/lang/String.charAt (I)C
      // 1b0: iload 6
      // 1b2: iflt 242
      // 1b5: bipush 93
      // 1b7: if_icmpne 23e
      // 1ba: bipush 1
      // 1bb: istore 21
      // 1bd: aload 20
      // 1bf: bipush 93
      // 1c1: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1c4: pop
      // 1c5: iload 23
      // 1c7: iload 6
      // 1c9: ifle 242
      // 1cc: ifeq 23e
      // 1cf: aload 20
      // 1d1: bipush 93
      // 1d3: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1d6: pop
      // 1d7: aload 19
      // 1d9: iload 6
      // 1db: ifle 246
      // 1de: ifnull 23e
      // 1e1: iload 21
      // 1e3: iload 1
      // 1e4: ifle 203
      // 1e7: ifeq 201
      // 1ea: iload 26
      // 1ec: iload 1
      // 1ed: ifle 203
      // 1f0: bipush 35
      // 1f2: if_icmpne 201
      // 1f5: bipush 1
      // 1f6: istore 24
      // 1f8: aload 19
      // 1fa: iload 1
      // 1fb: iflt 246
      // 1fe: ifnull 23e
      // 201: iload 21
      // 203: iload 1
      // 204: ifle 22f
      // 207: ifeq 22d
      // 20a: iload 26
      // 20c: invokestatic java/lang/Character.isWhitespace (C)Z
      // 20f: iload 6
      // 211: ifle 22f
      // 214: ifne 22d
      // 217: iload 24
      // 219: iload 1
      // 21a: ifle 22f
      // 21d: ifne 22d
      // 220: bipush 0
      // 221: iload 5
      // 223: iflt 250
      // 226: istore 21
      // 228: aload 19
      // 22a: ifnull 249
      // 22d: iload 21
      // 22f: iload 1
      // 230: iflt 242
      // 233: ifne 23e
      // 236: aload 20
      // 238: iload 26
      // 23a: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 23d: pop
      // 23e: aload 3
      // 23f: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 242: istore 25
      // 244: aload 19
      // 246: ifnull 0bf
      // 249: iload 21
      // 24b: iload 6
      // 24d: ifle 0ce
      // 250: iload 1
      // 251: iflt 259
      // 254: ifne 298
      // 257: iload 22
      // 259: ifeq 27d
      // 25c: aload 4
      // 25e: getfield rip/breeze/client/Util112.dataBuilder12_c Lrip/breeze/client/StringBuilderUtil;
      // 261: aload 20
      // 263: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 266: aload 4
      // 268: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 26b: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 26e: lload 16
      // 270: iload 5
      // 272: iflt 291
      // 275: invokevirtual rip/breeze/client/StringBuilderUtil.update_10 (Ljava/lang/String;IJ)V
      // 278: aload 19
      // 27a: ifnull 294
      // 27d: aload 4
      // 27f: getfield rip/breeze/client/Util112.dataBuilder12_c Lrip/breeze/client/StringBuilderUtil;
      // 282: aload 20
      // 284: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 287: aload 4
      // 289: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 28c: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 28f: lload 14
      // 291: invokevirtual rip/breeze/client/StringBuilderUtil.update_7 (Ljava/lang/String;IJ)V
      // 294: getstatic rip/breeze/client/Util137.CONST_A Lrip/breeze/client/Util137;
      // 297: areturn
      // 298: aload 20
      // 29a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 29d: iload 9
      // 29f: aload 4
      // 2a1: iload 10
      // 2a3: iload 11
      // 2a5: i2b
      // 2a6: invokestatic rip/breeze/client/Util137.getDataBuilder23 (Ljava/lang/String;ILrip/breeze/client/Util112;IB)Lrip/breeze/client/Util137;
      // 2a9: areturn
   }

   private Util114() {
   }
}
