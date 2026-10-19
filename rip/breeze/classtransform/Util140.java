package rip.breeze.classtransform;

import java.lang.annotation.Annotation;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class Util140<T extends Annotation> extends BreezeClass3<T> {
   private final Function<T, ռ> function_ü;
   private static final String[] CONST_F;
   private static final String[] CONST_G;
   private static final Map CONST_H = new HashMap(13);

   public Util140(Class<T> var1, Function<T, ռ> var2) {
      super(var1);
      this.function_ü = var2;
   }

   @Override
   public final void processAll(Object[] param1) {
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
      // 004: checkcast java/lang/annotation/Annotation
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast rip/breeze/classtransform/ó
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast rip/breeze/inject/é
      // 015: astore 4
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast rip/breeze/inject/é
      // 01d: astore 5
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast rip/breeze/inject/BreezeClass12
      // 025: astore 6
      // 027: dup
      // 028: bipush 5
      // 029: aaload
      // 02a: checkcast java/lang/Long
      // 02d: invokevirtual java/lang/Long.longValue ()J
      // 030: lstore 7
      // 032: pop
      // 033: lload 7
      // 035: dup2
      // 036: ldc2_w 12420888478749
      // 039: lxor
      // 03a: lstore 9
      // 03c: dup2
      // 03d: ldc2_w 52239367238472
      // 040: lxor
      // 041: lstore 11
      // 043: dup2
      // 044: ldc2_w 93476647558129
      // 047: lxor
      // 048: lstore 13
      // 04a: dup2
      // 04b: ldc2_w 62186553606852
      // 04e: lxor
      // 04f: lstore 15
      // 051: dup2
      // 052: ldc2_w 112587953308377
      // 055: lxor
      // 056: lstore 17
      // 058: dup2
      // 059: ldc2_w 100324729588215
      // 05c: lxor
      // 05d: lstore 19
      // 05f: pop2
      // 060: invokestatic rip/breeze/classtransform/BreezeClass3.checkCondition ()Z
      // 063: aload 0
      // 064: getfield rip/breeze/classtransform/Util140.function_ü Ljava/util/function/Function;
      // 067: aload 2
      // 068: invokeinterface java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 06d: checkcast rip/breeze/classtransform/ռ
      // 070: astore 21
      // 072: istore 22
      // 074: aload 21
      // 076: iload 22
      // 078: ifne 0a9
      // 07b: aload 3
      // 07c: getfield rip/breeze/classtransform/ó.mapping_ü_2 Lrip/breeze/classtransform/annotations/Mapping;
      // 07f: lload 15
      // 081: dup2_x1
      // 082: pop2
      // 083: bipush 2
      // 084: anewarray 71
      // 087: dup_x1
      // 088: swap
      // 089: bipush 1
      // 08a: swap
      // 08b: aastore
      // 08c: dup_x2
      // 08d: dup_x2
      // 08e: pop
      // 08f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 092: bipush 0
      // 093: swap
      // 094: aastore
      // 095: invokevirtual rip/breeze/classtransform/ռ.method_001 ([Ljava/lang/Object;)Z
      // 098: ifne 0a7
      // 09b: goto 0a2
      // 09e: invokestatic rip/breeze/classtransform/Util140.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a1: athrow
      // 0a2: return
      // 0a3: invokestatic rip/breeze/classtransform/Util140.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a6: athrow
      // 0a7: aload 21
      // 0a9: getfield rip/breeze/classtransform/ռ.arr_ÿ_2 [Ljava/lang/String;
      // 0ac: astore 23
      // 0ae: aload 23
      // 0b0: arraylength
      // 0b1: istore 24
      // 0b3: bipush 0
      // 0b4: istore 25
      // 0b6: iload 25
      // 0b8: iload 24
      // 0ba: if_icmpge 2e5
      // 0bd: aload 23
      // 0bf: iload 25
      // 0c1: aaload
      // 0c2: astore 26
      // 0c4: aload 26
      // 0c6: invokevirtual java/lang/String.isEmpty ()Z
      // 0c9: iload 22
      // 0cb: ifne 11e
      // 0ce: ifeq 0f8
      // 0d1: goto 0d8
      // 0d4: invokestatic rip/breeze/classtransform/Util140.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d7: athrow
      // 0d8: new rip/breeze/classtransform/գ
      // 0db: dup
      // 0dc: aload 6
      // 0de: aload 5
      // 0e0: lload 13
      // 0e2: sipush 26809
      // 0e5: ldc2_w 8123827481487087915
      // 0e8: lload 7
      // 0ea: lxor
      // 0eb: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util140.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 0f3: athrow
      // 0f4: invokestatic rip/breeze/classtransform/Util140.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f7: athrow
      // 0f8: aload 26
      // 0fa: iload 22
      // 0fc: lload 7
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: ifle 109
      // 103: ifne 123
      // 106: sipush 31429
      // 109: ldc2_w 7546602059979557716
      // 10c: lload 7
      // 10e: lxor
      // 10f: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util140.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: invokevirtual java/lang/String.matches (Ljava/lang/String;)Z
      // 117: goto 11e
      // 11a: invokestatic rip/breeze/classtransform/Util140.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11d: athrow
      // 11e: ifeq 1b3
      // 121: aload 26
      // 123: lload 11
      // 125: bipush 2
      // 126: anewarray 71
      // 129: dup_x2
      // 12a: dup_x2
      // 12b: pop
      // 12c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12f: bipush 1
      // 130: swap
      // 131: aastore
      // 132: dup_x1
      // 133: swap
      // 134: bipush 0
      // 135: swap
      // 136: aastore
      // 137: invokestatic rip/breeze/classtransform/MathUtil3.getՑ ([Ljava/lang/Object;)Lrip/breeze/classtransform/ց;
      // 13a: astore 27
      // 13c: lload 7
      // 13e: lconst_0
      // 13f: lcmp
      // 140: iflt 168
      // 143: aload 27
      // 145: ifnonnull 168
      // 148: new rip/breeze/classtransform/գ
      // 14b: dup
      // 14c: aload 6
      // 14e: aload 5
      // 150: lload 13
      // 152: sipush 3860
      // 155: ldc2_w 4240103391755959940
      // 158: lload 7
      // 15a: lxor
      // 15b: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util140.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 163: athrow
      // 164: invokestatic rip/breeze/classtransform/Util140.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 167: athrow
      // 168: aload 4
      // 16a: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 16d: iload 22
      // 16f: ifne 1b1
      // 172: aload 27
      // 174: bipush 0
      // 175: anewarray 71
      // 178: invokevirtual rip/breeze/classtransform/ց.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 17b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 17e: ifne 18f
      // 181: goto 188
      // 184: invokestatic rip/breeze/classtransform/Util140.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 187: athrow
      // 188: goto 2dd
      // 18b: invokestatic rip/breeze/classtransform/Util140.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18e: athrow
      // 18f: new java/lang/StringBuilder
      // 192: dup
      // 193: invokespecial java/lang/StringBuilder.<init> ()V
      // 196: aload 27
      // 198: bipush 0
      // 199: anewarray 71
      // 19c: invokevirtual rip/breeze/classtransform/ց.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 19f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a2: aload 27
      // 1a4: bipush 0
      // 1a5: anewarray 71
      // 1a8: invokevirtual rip/breeze/classtransform/ց.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b1: astore 26
      // 1b3: aload 4
      // 1b5: lload 19
      // 1b7: aload 26
      // 1b9: bipush 3
      // 1ba: anewarray 71
      // 1bd: dup_x1
      // 1be: swap
      // 1bf: bipush 2
      // 1c0: swap
      // 1c1: aastore
      // 1c2: dup_x2
      // 1c3: dup_x2
      // 1c4: pop
      // 1c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c8: bipush 1
      // 1c9: swap
      // 1ca: aastore
      // 1cb: dup_x1
      // 1cc: swap
      // 1cd: bipush 0
      // 1ce: swap
      // 1cf: aastore
      // 1d0: invokestatic rip/breeze/classtransform/MathUtil3.getList ([Ljava/lang/Object;)Ljava/util/List;
      // 1d3: astore 27
      // 1d5: aload 27
      // 1d7: iload 22
      // 1d9: ifne 1ff
      // 1dc: invokeinterface java/util/List.isEmpty ()Z 1
      // 1e1: ifeq 1fd
      // 1e4: goto 1eb
      // 1e7: invokestatic rip/breeze/classtransform/Util140.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ea: athrow
      // 1eb: new rip/breeze/classtransform/դ
      // 1ee: dup
      // 1ef: aload 4
      // 1f1: aload 5
      // 1f3: aload 26
      // 1f5: invokespecial rip/breeze/classtransform/դ.<init> (Lrip/breeze/inject/é;Lrip/breeze/inject/é;Ljava/lang/String;)V
      // 1f8: athrow
      // 1f9: invokestatic rip/breeze/classtransform/Util140.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1fc: athrow
      // 1fd: aload 27
      // 1ff: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 204: astore 28
      // 206: aload 28
      // 208: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 20d: ifeq 2dd
      // 210: aload 28
      // 212: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 217: checkcast rip/breeze/inject/BreezeClass12
      // 21a: astore 29
      // 21c: aload 0
      // 21d: aload 2
      // 21e: lload 17
      // 220: aload 3
      // 221: aload 4
      // 223: aload 5
      // 225: lload 9
      // 227: aload 6
      // 229: bipush 2
      // 22a: anewarray 71
      // 22d: dup_x1
      // 22e: swap
      // 22f: bipush 1
      // 230: swap
      // 231: aastore
      // 232: dup_x2
      // 233: dup_x2
      // 234: pop
      // 235: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 238: bipush 0
      // 239: swap
      // 23a: aastore
      // 23b: invokestatic rip/breeze/classtransform/MathUtil3.getBreezeClass12_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass12;
      // 23e: aload 29
      // 240: bipush 7
      // 242: anewarray 71
      // 245: dup_x1
      // 246: swap
      // 247: bipush 6
      // 249: swap
      // 24a: aastore
      // 24b: dup_x1
      // 24c: swap
      // 24d: bipush 5
      // 24e: swap
      // 24f: aastore
      // 250: dup_x1
      // 251: swap
      // 252: bipush 4
      // 253: swap
      // 254: aastore
      // 255: dup_x1
      // 256: swap
      // 257: bipush 3
      // 258: swap
      // 259: aastore
      // 25a: dup_x1
      // 25b: swap
      // 25c: bipush 2
      // 25d: swap
      // 25e: aastore
      // 25f: dup_x2
      // 260: dup_x2
      // 261: pop
      // 262: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 265: bipush 1
      // 266: swap
      // 267: aastore
      // 268: dup_x1
      // 269: swap
      // 26a: bipush 0
      // 26b: swap
      // 26c: aastore
      // 26d: invokevirtual rip/breeze/classtransform/Util140.processAll ([Ljava/lang/Object;)V
      // 270: iload 22
      // 272: lload 7
      // 274: lconst_0
      // 275: lcmp
      // 276: ifle 2e2
      // 279: ifne 2e0
      // 27c: goto 2b8
      // 27f: invokestatic rip/breeze/classtransform/Util140.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 282: athrow
      // 283: astore 30
      // 285: new rip/breeze/classtransform/գ
      // 288: dup
      // 289: aload 6
      // 28b: aload 5
      // 28d: new java/lang/StringBuilder
      // 290: dup
      // 291: invokespecial java/lang/StringBuilder.<init> ()V
      // 294: sipush 7181
      // 297: ldc2_w 260938213208092062
      // 29a: lload 7
      // 29c: lxor
      // 29d: invokedynamic i (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util140.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a5: aload 30
      // 2a7: invokevirtual rip/breeze/classtransform/ø.getMessage ()Ljava/lang/String;
      // 2aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ad: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2b0: lload 13
      // 2b2: dup2_x1
      // 2b3: pop2
      // 2b4: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 2b7: athrow
      // 2b8: iload 22
      // 2ba: ifeq 206
      // 2bd: invokestatic rip/breeze/inject/ջ.method_013 ()Z
      // 2c0: lload 7
      // 2c2: lconst_0
      // 2c3: lcmp
      // 2c4: ifle 272
      // 2c7: lload 7
      // 2c9: lconst_0
      // 2ca: lcmp
      // 2cb: iflt 2d2
      // 2ce: ifeq 2d9
      // 2d1: bipush 0
      // 2d2: goto 2da
      // 2d5: invokestatic rip/breeze/classtransform/Util140.getRuntimeException (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d8: athrow
      // 2d9: bipush 1
      // 2da: invokestatic rip/breeze/inject/ջ.method_011 (Z)V
      // 2dd: iinc 25 1
      // 2e0: iload 22
      // 2e2: ifeq 0b6
      // 2e5: return
      // try (247 -> 259): 259 rip/breeze/classtransform/ø
      // try (244 -> 249): 250 rip/breeze/classtransform/ø
      // try (193 -> 203): 203 rip/breeze/classtransform/ø
      // try (189 -> 199): 200 rip/breeze/classtransform/ø
      // try (169 -> 187): 187 rip/breeze/classtransform/ø
      // try (134 -> 147): 148 rip/breeze/classtransform/ø
      // try (116 -> 132): 132 rip/breeze/classtransform/ø
      // try (112 -> 117): 118 rip/breeze/classtransform/ø
      // try (70 -> 95): 95 rip/breeze/classtransform/ø
      // try (67 -> 91): 92 rip/breeze/classtransform/ø
      // try (271 -> 335): 344 rip/breeze/classtransform/ø
      // try (271 -> 342): 342 rip/breeze/classtransform/գ
      // try (369 -> 381): 381 rip/breeze/classtransform/ø
   }

   @Override
   public abstract void processAll(Object[] var1);

   static {
      long var10000 = rip.breeze.inject.Util138.getIBreezeInterface(37437289587728611L, -7016195077145720771L, MethodHandles.lookup().lookupClass())
         .method_003(648370698923L);
      long var0 = var10000 ^ 81277686842740L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "\u008er\nE÷ájµÒ\u0099´©\u0099\u0000kÑ\u001eë§Þô¦\u0088_\u008e\r\u008f:sñÁZ[»\fg\u009c\r©EÿÎJû|\u001cç\u0095¤aéµPA\u00021Ýãá¸á\u008fþ\u0014Âý¡ÒÜ¤êX7F§\u0083ñ.tLP\u008cñ\u0084}òV]ß{v\u0011ì^ÐóK\u001bÖ@¡\u0000Æ\u008bUÌ£ú?&\u0080äF±`\u001azæ\u0016yt\u00902m\u0011\u0088åÌhË\u0096v£´q\u0087l÷§åw\u0000\u008b\b´¾#[Ñ&\u009a\u0016·t¨ÂYMô%.";
      int var7 = "\u008er\nE÷ájµÒ\u0099´©\u0099\u0000kÑ\u001eë§Þô¦\u0088_\u008e\r\u008f:sñÁZ[»\fg\u009c\r©EÿÎJû|\u001cç\u0095¤aéµPA\u00021Ýãá¸á\u008fþ\u0014Âý¡ÒÜ¤êX7F§\u0083ñ.tLP\u008cñ\u0084}òV]ß{v\u0011ì^ÐóK\u001bÖ@¡\u0000Æ\u008bUÌ£ú?&\u0080äF±`\u001azæ\u0016yt\u00902m\u0011\u0088åÌhË\u0096v£´q\u0087l÷§åw\u0000\u008b\b´¾#[Ñ&\u009a\u0016·t¨ÂYMô%."
         .length();
      char var8 = 'P';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var20;
                  if ((var12 += var8) >= var7) {
                     CONST_F = var4;
                     CONST_G = new String[4];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var20;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\\xöÆ¦GA±\u0011+\u0085\\NpBT Û\u007f¦\u001fÂL¶K\u007f\u001e?´Sd\u009cOó\u0097&¡`\u0080ä^\u0004\u000bÝ6ÉÖzÄ";
                  var7 = "\\xöÆ¦GA±\u0011+\u0085\\NpBT Û\u007f¦\u001fÂL¶K\u007f\u001e?´Sd\u009cOó\u0097&¡`\u0080ä^\u0004\u000bÝ6ÉÖzÄ".length();
                  var8 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException getRuntimeException(RuntimeException var0) {
      return var0;
   }

   private static String buildString(byte[] var0) {
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

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13518;
      if (CONST_G[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_H.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_H.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/p", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_F[var3].getBytes("ISO-8859-1");
         CONST_G[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_G[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_2(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getObject".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/p" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
