package rip.breeze.client;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import rip.breeze.StringDecryptor;

class Util109 implements IBreezeInterface {
   static final Util109 CONST_A = new Util109();

   public boolean isValid(long var1, String var3) {
      return var3.startsWith("[");
   }

   public Object getObject(String param1, AtomicInteger param2, long param3, Util112 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: lload 3
      // 001: dup2
      // 002: ldc2_w 99007734465094
      // 005: lxor
      // 006: dup2
      // 007: bipush 48
      // 009: lushr
      // 00a: l2i
      // 00b: istore 6
      // 00d: dup2
      // 00e: bipush 16
      // 010: lshl
      // 011: bipush 48
      // 013: lushr
      // 014: l2i
      // 015: istore 7
      // 017: dup2
      // 018: bipush 32
      // 01a: lshl
      // 01b: bipush 32
      // 01d: lushr
      // 01e: l2i
      // 01f: istore 8
      // 021: pop2
      // 022: dup2
      // 023: ldc2_w 136033211624861
      // 026: lxor
      // 027: dup2
      // 028: bipush 32
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 9
      // 02e: dup2
      // 02f: bipush 32
      // 031: lshl
      // 032: bipush 48
      // 034: lushr
      // 035: l2i
      // 036: istore 10
      // 038: dup2
      // 039: bipush 48
      // 03b: lshl
      // 03c: bipush 48
      // 03e: lushr
      // 03f: l2i
      // 040: istore 11
      // 042: pop2
      // 043: dup2
      // 044: ldc2_w 132386385577745
      // 047: lxor
      // 048: dup2
      // 049: bipush 48
      // 04b: lushr
      // 04c: l2i
      // 04d: istore 12
      // 04f: dup2
      // 050: bipush 16
      // 052: lshl
      // 053: bipush 32
      // 055: lushr
      // 056: l2i
      // 057: istore 13
      // 059: dup2
      // 05a: bipush 48
      // 05c: lshl
      // 05d: bipush 48
      // 05f: lushr
      // 060: l2i
      // 061: istore 14
      // 063: pop2
      // 064: dup2
      // 065: ldc2_w 24676148583309
      // 068: lxor
      // 069: lstore 15
      // 06b: dup2
      // 06c: ldc2_w 0
      // 06f: lxor
      // 070: lstore 17
      // 072: dup2
      // 073: ldc2_w 88622662033979
      // 076: lxor
      // 077: dup2
      // 078: bipush 32
      // 07a: lushr
      // 07b: l2i
      // 07c: istore 19
      // 07e: dup2
      // 07f: bipush 32
      // 081: lshl
      // 082: bipush 48
      // 084: lushr
      // 085: l2i
      // 086: istore 20
      // 088: dup2
      // 089: bipush 48
      // 08b: lshl
      // 08c: bipush 48
      // 08e: lushr
      // 08f: l2i
      // 090: istore 21
      // 092: pop2
      // 093: pop2
      // 094: aload 5
      // 096: getfield rip/breeze/client/Util112.atomicInteger_b Ljava/util/concurrent/atomic/AtomicInteger;
      // 099: astore 22
      // 09b: aload 22
      // 09d: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 0a0: istore 23
      // 0a2: aload 2
      // 0a3: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 0a6: istore 24
      // 0a8: new java/util/ArrayList
      // 0ab: dup
      // 0ac: invokespecial java/util/ArrayList.<init> ()V
      // 0af: astore 25
      // 0b1: invokestatic rip/breeze/Util28.values ()[Ljava/lang/String;
      // 0b4: bipush 0
      // 0b5: istore 26
      // 0b7: bipush 0
      // 0b8: istore 27
      // 0ba: astore 28
      // 0bc: new rip/breeze/client/StringBuilderUtil
      // 0bf: dup
      // 0c0: invokespecial rip/breeze/client/StringBuilderUtil.<init> ()V
      // 0c3: astore 29
      // 0c5: aload 2
      // 0c6: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 0c9: istore 30
      // 0cb: iload 30
      // 0cd: aload 1
      // 0ce: invokevirtual java/lang/String.length ()I
      // 0d1: if_icmpge 27a
      // 0d4: aload 1
      // 0d5: iload 30
      // 0d7: invokevirtual java/lang/String.charAt (I)C
      // 0da: istore 31
      // 0dc: iload 31
      // 0de: bipush 35
      // 0e0: lload 3
      // 0e1: lconst_0
      // 0e2: lcmp
      // 0e3: ifle 10c
      // 0e6: if_icmpne 102
      // 0e9: iload 27
      // 0eb: lload 3
      // 0ec: lconst_0
      // 0ed: lcmp
      // 0ee: ifle 104
      // 0f1: ifne 102
      // 0f4: bipush 1
      // 0f5: istore 27
      // 0f7: aload 28
      // 0f9: lload 3
      // 0fa: lconst_0
      // 0fb: lcmp
      // 0fc: ifle 277
      // 0ff: ifnull 26f
      // 102: iload 31
      // 104: lload 3
      // 105: lconst_0
      // 106: lcmp
      // 107: iflt 125
      // 10a: bipush 10
      // 10c: if_icmpne 123
      // 10f: bipush 0
      // 110: istore 27
      // 112: aload 22
      // 114: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 117: pop
      // 118: aload 28
      // 11a: lload 3
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: iflt 277
      // 120: ifnull 26f
      // 123: iload 27
      // 125: lload 3
      // 126: lconst_0
      // 127: lcmp
      // 128: ifle 273
      // 12b: ifne 26f
      // 12e: iload 31
      // 130: invokestatic java/lang/Character.isWhitespace (C)Z
      // 133: lload 3
      // 134: lconst_0
      // 135: lcmp
      // 136: iflt 273
      // 139: ifne 26f
      // 13c: iload 31
      // 13e: bipush 44
      // 140: lload 3
      // 141: lconst_0
      // 142: lcmp
      // 143: ifle 158
      // 146: if_icmpne 154
      // 149: aload 28
      // 14b: lload 3
      // 14c: lconst_0
      // 14d: lcmp
      // 14e: iflt 277
      // 151: ifnull 26f
      // 154: iload 31
      // 156: bipush 91
      // 158: lload 3
      // 159: lconst_0
      // 15a: lcmp
      // 15b: ifle 1e6
      // 15e: if_icmpne 1dc
      // 161: aload 0
      // 162: aload 1
      // 163: aload 2
      // 164: lload 17
      // 166: aload 5
      // 168: invokevirtual rip/breeze/client/Util109.getObject (Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicInteger;JLrip/breeze/client/Util112;)Ljava/lang/Object;
      // 16b: astore 32
      // 16d: aload 32
      // 16f: instanceof rip/breeze/client/StringBuilderUtil
      // 172: lload 3
      // 173: lconst_0
      // 174: lcmp
      // 175: iflt 19f
      // 178: ifeq 190
      // 17b: aload 29
      // 17d: aload 32
      // 17f: checkcast rip/breeze/client/StringBuilderUtil
      // 182: invokevirtual rip/breeze/client/StringBuilderUtil.initialize (Lrip/breeze/client/StringBuilderUtil;)V
      // 185: aload 28
      // 187: lload 3
      // 188: lconst_0
      // 189: lcmp
      // 18a: iflt 277
      // 18d: ifnull 26f
      // 190: aload 0
      // 191: aload 32
      // 193: iload 9
      // 195: iload 10
      // 197: aload 25
      // 199: iload 11
      // 19b: i2s
      // 19c: invokespecial rip/breeze/client/Util109.checkCondition (Ljava/lang/Object;IILjava/util/List;S)Z
      // 19f: lload 3
      // 1a0: lconst_0
      // 1a1: lcmp
      // 1a2: iflt 1d0
      // 1a5: ifne 1c7
      // 1a8: aload 29
      // 1aa: aload 5
      // 1ac: getfield rip/breeze/client/Util112.dataBuilder23_a Lrip/breeze/client/Util137;
      // 1af: invokevirtual rip/breeze/client/Util137.getString_b ()Ljava/lang/String;
      // 1b2: aload 22
      // 1b4: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 1b7: lload 15
      // 1b9: invokevirtual rip/breeze/client/StringBuilderUtil.update_12 (Ljava/lang/String;IJ)V
      // 1bc: aload 28
      // 1be: lload 3
      // 1bf: lconst_0
      // 1c0: lcmp
      // 1c1: iflt 277
      // 1c4: ifnull 26f
      // 1c7: aload 25
      // 1c9: aload 32
      // 1cb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d0: pop
      // 1d1: aload 28
      // 1d3: lload 3
      // 1d4: lconst_0
      // 1d5: lcmp
      // 1d6: iflt 277
      // 1d9: ifnull 26f
      // 1dc: iload 31
      // 1de: lload 3
      // 1df: lconst_0
      // 1e0: lcmp
      // 1e1: iflt 1ea
      // 1e4: bipush 93
      // 1e6: if_icmpne 1f7
      // 1e9: bipush 1
      // 1ea: lload 3
      // 1eb: lconst_0
      // 1ec: lcmp
      // 1ed: ifle 282
      // 1f0: istore 26
      // 1f2: aload 28
      // 1f4: ifnull 27a
      // 1f7: getstatic rip/breeze/client/Util103.CONST_A Lrip/breeze/client/Util103;
      // 1fa: aload 1
      // 1fb: iload 6
      // 1fd: i2c
      // 1fe: aload 2
      // 1ff: aload 5
      // 201: iload 7
      // 203: i2s
      // 204: iload 8
      // 206: invokevirtual rip/breeze/client/Util103.getObject (Ljava/lang/String;CLjava/util/concurrent/atomic/AtomicInteger;Lrip/breeze/client/Util112;SI)Ljava/lang/Object;
      // 209: astore 32
      // 20b: aload 32
      // 20d: instanceof rip/breeze/client/StringBuilderUtil
      // 210: lload 3
      // 211: lconst_0
      // 212: lcmp
      // 213: iflt 23d
      // 216: ifeq 22e
      // 219: aload 29
      // 21b: aload 32
      // 21d: checkcast rip/breeze/client/StringBuilderUtil
      // 220: invokevirtual rip/breeze/client/StringBuilderUtil.initialize (Lrip/breeze/client/StringBuilderUtil;)V
      // 223: aload 28
      // 225: lload 3
      // 226: lconst_0
      // 227: lcmp
      // 228: iflt 277
      // 22b: ifnull 26f
      // 22e: aload 0
      // 22f: aload 32
      // 231: iload 9
      // 233: iload 10
      // 235: aload 25
      // 237: iload 11
      // 239: i2s
      // 23a: invokespecial rip/breeze/client/Util109.checkCondition (Ljava/lang/Object;IILjava/util/List;S)Z
      // 23d: lload 3
      // 23e: lconst_0
      // 23f: lcmp
      // 240: ifle 26e
      // 243: ifne 265
      // 246: aload 29
      // 248: aload 5
      // 24a: getfield rip/breeze/client/Util112.dataBuilder23_a Lrip/breeze/client/Util137;
      // 24d: invokevirtual rip/breeze/client/Util137.getString_b ()Ljava/lang/String;
      // 250: aload 22
      // 252: invokevirtual java/util/concurrent/atomic/AtomicInteger.get ()I
      // 255: lload 15
      // 257: invokevirtual rip/breeze/client/StringBuilderUtil.update_12 (Ljava/lang/String;IJ)V
      // 25a: aload 28
      // 25c: lload 3
      // 25d: lconst_0
      // 25e: lcmp
      // 25f: iflt 277
      // 262: ifnull 26f
      // 265: aload 25
      // 267: aload 32
      // 269: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 26e: pop
      // 26f: aload 2
      // 270: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 273: istore 30
      // 275: aload 28
      // 277: ifnull 0cb
      // 27a: iload 26
      // 27c: lload 3
      // 27d: lconst_0
      // 27e: lcmp
      // 27f: iflt 0da
      // 282: lload 3
      // 283: lconst_0
      // 284: lcmp
      // 285: iflt 2c1
      // 288: ifne 2ae
      // 28b: aload 29
      // 28d: aload 5
      // 28f: getfield rip/breeze/client/Util112.dataBuilder23_a Lrip/breeze/client/Util137;
      // 292: invokevirtual rip/breeze/client/Util137.getString_b ()Ljava/lang/String;
      // 295: aload 1
      // 296: iload 24
      // 298: aload 1
      // 299: invokevirtual java/lang/String.length ()I
      // 29c: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 29f: iload 19
      // 2a1: swap
      // 2a2: iload 20
      // 2a4: i2s
      // 2a5: swap
      // 2a6: iload 21
      // 2a8: swap
      // 2a9: iload 23
      // 2ab: invokevirtual rip/breeze/client/StringBuilderUtil.update_11 (Ljava/lang/String;ISILjava/lang/String;I)V
      // 2ae: aload 29
      // 2b0: lload 3
      // 2b1: lconst_0
      // 2b2: lcmp
      // 2b3: iflt 2c6
      // 2b6: iload 12
      // 2b8: i2s
      // 2b9: iload 13
      // 2bb: iload 14
      // 2bd: i2c
      // 2be: invokevirtual rip/breeze/client/StringBuilderUtil.isValid (SIC)Z
      // 2c1: ifeq 2c7
      // 2c4: aload 29
      // 2c6: areturn
      // 2c7: aload 25
      // 2c9: areturn
   }

   private boolean checkCondition(Object var1, int var2, int var3, List var4, short var5) {
      long var6 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ 59324278901935L;
      if (!var4.isEmpty()) {
         boolean var10000 = var4.get(0).getClass().isAssignableFrom(var1.getClass());
         if (var3 <= 0) {
            return var10000;
         }

         if (!var10000) {
            var10000 = var1.getClass().isAssignableFrom(var4.get(0).getClass());
            if (var2 < 0) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }
      }

      return true;
   }

   private Util109() {
   }
}
