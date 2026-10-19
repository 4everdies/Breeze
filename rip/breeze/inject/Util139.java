package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class Util139 {
   final í í_ÿ;
   private final ï ï_þ;
   private int int_ý;
   private String string_ü;
   private int int_û;
   private BreezeClass2[] arr_ú;
   private int int_ù;
   private ð ð_ø;
   private int int_ö;
   private ð ð_õ;
   private int int_ô;
   private BreezeClass2[] arr_ó;
   private int int_ò;
   private BreezeClass[] arr_ñ;
   private BreezeClass[] arr_ð;
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   Util139(í var1) {
      this.í_ÿ = var1;
      this.ï_þ = null;
      this.arr_ú = new BreezeClass2[256];
      this.int_ù = 1;
      this.ð_ø = new ð();
   }

   Util139(long param1, í param3, ï param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 47222513566357
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 116568243215405
      // 012: lxor
      // 013: lstore 7
      // 015: dup2
      // 016: ldc2_w 37956398654835
      // 019: lxor
      // 01a: lstore 9
      // 01c: dup2
      // 01d: ldc2_w 15461976961481
      // 020: lxor
      // 021: lstore 11
      // 023: dup2
      // 024: ldc2_w 21732956466380
      // 027: lxor
      // 028: lstore 13
      // 02a: dup2
      // 02b: ldc2_w 74187006981972
      // 02e: lxor
      // 02f: lstore 15
      // 031: pop2
      // 032: aload 0
      // 033: invokespecial java/lang/Object.<init> ()V
      // 036: aload 0
      // 037: aload 3
      // 038: putfield rip/breeze/inject/Util139.í_ÿ Lrip/breeze/inject/í;
      // 03b: aload 0
      // 03c: aload 4
      // 03e: putfield rip/breeze/inject/Util139.ï_þ Lrip/breeze/inject/ï;
      // 041: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 044: aload 4
      // 046: getfield rip/breeze/inject/ï.arr_õ_2 [B
      // 049: astore 17
      // 04b: aload 4
      // 04d: bipush 1
      // 04e: bipush 1
      // 04f: anewarray 4
      // 052: dup_x1
      // 053: swap
      // 054: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 057: bipush 0
      // 058: swap
      // 059: aastore
      // 05a: invokevirtual rip/breeze/inject/ï.method_033 ([Ljava/lang/Object;)I
      // 05d: bipush 1
      // 05e: isub
      // 05f: istore 18
      // 061: istore 19
      // 063: aload 4
      // 065: getfield rip/breeze/inject/ï.int_ö_2 I
      // 068: iload 18
      // 06a: isub
      // 06b: istore 20
      // 06d: aload 0
      // 06e: aload 4
      // 070: bipush 0
      // 071: anewarray 4
      // 074: invokevirtual rip/breeze/inject/ï.method_032 ([Ljava/lang/Object;)I
      // 077: putfield rip/breeze/inject/Util139.int_ù I
      // 07a: aload 0
      // 07b: new rip/breeze/inject/ð
      // 07e: dup
      // 07f: iload 20
      // 081: invokespecial rip/breeze/inject/ð.<init> (I)V
      // 084: putfield rip/breeze/inject/Util139.ð_ø Lrip/breeze/inject/ð;
      // 087: aload 0
      // 088: getfield rip/breeze/inject/Util139.ð_ø Lrip/breeze/inject/ð;
      // 08b: aload 17
      // 08d: iload 18
      // 08f: iload 20
      // 091: lload 15
      // 093: bipush 4
      // 094: anewarray 4
      // 097: dup_x2
      // 098: dup_x2
      // 099: pop
      // 09a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09d: bipush 3
      // 09e: swap
      // 09f: aastore
      // 0a0: dup_x1
      // 0a1: swap
      // 0a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a5: bipush 2
      // 0a6: swap
      // 0a7: aastore
      // 0a8: dup_x1
      // 0a9: swap
      // 0aa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ad: bipush 1
      // 0ae: swap
      // 0af: aastore
      // 0b0: dup_x1
      // 0b1: swap
      // 0b2: bipush 0
      // 0b3: swap
      // 0b4: aastore
      // 0b5: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0b8: pop
      // 0b9: aload 0
      // 0ba: aload 0
      // 0bb: getfield rip/breeze/inject/Util139.int_ù I
      // 0be: bipush 2
      // 0bf: imul
      // 0c0: anewarray 45
      // 0c3: putfield rip/breeze/inject/Util139.arr_ú [Lrip/breeze/inject/BreezeClass2;
      // 0c6: aload 4
      // 0c8: bipush 0
      // 0c9: anewarray 4
      // 0cc: invokevirtual rip/breeze/inject/ï.method_034 ([Ljava/lang/Object;)I
      // 0cf: newarray 5
      // 0d1: astore 21
      // 0d3: bipush 0
      // 0d4: istore 22
      // 0d6: bipush 1
      // 0d7: istore 23
      // 0d9: iload 23
      // 0db: aload 0
      // 0dc: getfield rip/breeze/inject/Util139.int_ù I
      // 0df: if_icmpge 691
      // 0e2: aload 4
      // 0e4: iload 23
      // 0e6: bipush 1
      // 0e7: anewarray 4
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ef: bipush 0
      // 0f0: swap
      // 0f1: aastore
      // 0f2: invokevirtual rip/breeze/inject/ï.method_033 ([Ljava/lang/Object;)I
      // 0f5: istore 24
      // 0f7: aload 17
      // 0f9: iload 24
      // 0fb: bipush 1
      // 0fc: isub
      // 0fd: baload
      // 0fe: istore 25
      // 100: iload 25
      // 102: lload 1
      // 103: lconst_0
      // 104: lcmp
      // 105: iflt 699
      // 108: iload 19
      // 10a: ifne 699
      // 10d: iload 19
      // 10f: ifne 1ad
      // 112: goto 119
      // 115: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 118: athrow
      // 119: lload 1
      // 11a: lconst_0
      // 11b: lcmp
      // 11c: ifle 1a6
      // 11f: tableswitch 1310 1 20 584 1310 313 313 510 510 1222 1222 97 97 97 386 1310 1310 662 1222 1025 1025 1222 1222
      // 17c: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17f: athrow
      // 180: aload 4
      // 182: aload 4
      // 184: iload 24
      // 186: bipush 2
      // 187: iadd
      // 188: bipush 1
      // 189: anewarray 4
      // 18c: dup_x1
      // 18d: swap
      // 18e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 191: bipush 0
      // 192: swap
      // 193: aastore
      // 194: invokevirtual rip/breeze/inject/ï.method_037 ([Ljava/lang/Object;)I
      // 197: bipush 1
      // 198: anewarray 4
      // 19b: dup_x1
      // 19c: swap
      // 19d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a0: bipush 0
      // 1a1: swap
      // 1a2: aastore
      // 1a3: invokevirtual rip/breeze/inject/ï.method_033 ([Ljava/lang/Object;)I
      // 1a6: goto 1ad
      // 1a9: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ac: athrow
      // 1ad: istore 26
      // 1af: aload 0
      // 1b0: iload 23
      // 1b2: iload 25
      // 1b4: aload 4
      // 1b6: iload 24
      // 1b8: lload 7
      // 1ba: aload 21
      // 1bc: bipush 3
      // 1bd: anewarray 4
      // 1c0: dup_x1
      // 1c1: swap
      // 1c2: bipush 2
      // 1c3: swap
      // 1c4: aastore
      // 1c5: dup_x2
      // 1c6: dup_x2
      // 1c7: pop
      // 1c8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cb: bipush 1
      // 1cc: swap
      // 1cd: aastore
      // 1ce: dup_x1
      // 1cf: swap
      // 1d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d3: bipush 0
      // 1d4: swap
      // 1d5: aastore
      // 1d6: invokevirtual rip/breeze/inject/ï.method_045 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1d9: aload 4
      // 1db: lload 5
      // 1dd: iload 26
      // 1df: aload 21
      // 1e1: bipush 3
      // 1e2: anewarray 4
      // 1e5: dup_x1
      // 1e6: swap
      // 1e7: bipush 2
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ef: bipush 1
      // 1f0: swap
      // 1f1: aastore
      // 1f2: dup_x2
      // 1f3: dup_x2
      // 1f4: pop
      // 1f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f8: bipush 0
      // 1f9: swap
      // 1fa: aastore
      // 1fb: invokevirtual rip/breeze/inject/ï.method_041 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1fe: aload 4
      // 200: iload 26
      // 202: bipush 2
      // 203: iadd
      // 204: lload 5
      // 206: dup2_x1
      // 207: pop2
      // 208: aload 21
      // 20a: bipush 3
      // 20b: anewarray 4
      // 20e: dup_x1
      // 20f: swap
      // 210: bipush 2
      // 211: swap
      // 212: aastore
      // 213: dup_x1
      // 214: swap
      // 215: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 218: bipush 1
      // 219: swap
      // 21a: aastore
      // 21b: dup_x2
      // 21c: dup_x2
      // 21d: pop
      // 21e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 221: bipush 0
      // 222: swap
      // 223: aastore
      // 224: invokevirtual rip/breeze/inject/ï.method_041 ([Ljava/lang/Object;)Ljava/lang/String;
      // 227: bipush 5
      // 228: anewarray 4
      // 22b: dup_x1
      // 22c: swap
      // 22d: bipush 4
      // 22e: swap
      // 22f: aastore
      // 230: dup_x1
      // 231: swap
      // 232: bipush 3
      // 233: swap
      // 234: aastore
      // 235: dup_x1
      // 236: swap
      // 237: bipush 2
      // 238: swap
      // 239: aastore
      // 23a: dup_x1
      // 23b: swap
      // 23c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 23f: bipush 1
      // 240: swap
      // 241: aastore
      // 242: dup_x1
      // 243: swap
      // 244: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 247: bipush 0
      // 248: swap
      // 249: aastore
      // 24a: invokevirtual rip/breeze/inject/Util139.method_020 ([Ljava/lang/Object;)V
      // 24d: iload 19
      // 24f: lload 1
      // 250: lconst_0
      // 251: lcmp
      // 252: ifle 64b
      // 255: ifeq 649
      // 258: aload 0
      // 259: iload 23
      // 25b: iload 25
      // 25d: aload 4
      // 25f: iload 24
      // 261: bipush 1
      // 262: anewarray 4
      // 265: dup_x1
      // 266: swap
      // 267: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 26a: bipush 0
      // 26b: swap
      // 26c: aastore
      // 26d: invokevirtual rip/breeze/inject/ï.method_039 ([Ljava/lang/Object;)I
      // 270: bipush 3
      // 271: anewarray 4
      // 274: dup_x1
      // 275: swap
      // 276: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 279: bipush 2
      // 27a: swap
      // 27b: aastore
      // 27c: dup_x1
      // 27d: swap
      // 27e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 281: bipush 1
      // 282: swap
      // 283: aastore
      // 284: dup_x1
      // 285: swap
      // 286: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 289: bipush 0
      // 28a: swap
      // 28b: aastore
      // 28c: invokevirtual rip/breeze/inject/Util139.method_025 ([Ljava/lang/Object;)V
      // 28f: iload 19
      // 291: lload 1
      // 292: lconst_0
      // 293: lcmp
      // 294: ifle 64b
      // 297: ifeq 649
      // 29a: goto 2a1
      // 29d: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a0: athrow
      // 2a1: aload 0
      // 2a2: iload 23
      // 2a4: aload 4
      // 2a6: lload 5
      // 2a8: iload 24
      // 2aa: aload 21
      // 2ac: bipush 3
      // 2ad: anewarray 4
      // 2b0: dup_x1
      // 2b1: swap
      // 2b2: bipush 2
      // 2b3: swap
      // 2b4: aastore
      // 2b5: dup_x1
      // 2b6: swap
      // 2b7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2ba: bipush 1
      // 2bb: swap
      // 2bc: aastore
      // 2bd: dup_x2
      // 2be: dup_x2
      // 2bf: pop
      // 2c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c3: bipush 0
      // 2c4: swap
      // 2c5: aastore
      // 2c6: invokevirtual rip/breeze/inject/ï.method_041 ([Ljava/lang/Object;)Ljava/lang/String;
      // 2c9: aload 4
      // 2cb: iload 24
      // 2cd: bipush 2
      // 2ce: iadd
      // 2cf: lload 5
      // 2d1: dup2_x1
      // 2d2: pop2
      // 2d3: aload 21
      // 2d5: bipush 3
      // 2d6: anewarray 4
      // 2d9: dup_x1
      // 2da: swap
      // 2db: bipush 2
      // 2dc: swap
      // 2dd: aastore
      // 2de: dup_x1
      // 2df: swap
      // 2e0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2e3: bipush 1
      // 2e4: swap
      // 2e5: aastore
      // 2e6: dup_x2
      // 2e7: dup_x2
      // 2e8: pop
      // 2e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ec: bipush 0
      // 2ed: swap
      // 2ee: aastore
      // 2ef: invokevirtual rip/breeze/inject/ï.method_041 ([Ljava/lang/Object;)Ljava/lang/String;
      // 2f2: bipush 3
      // 2f3: anewarray 4
      // 2f6: dup_x1
      // 2f7: swap
      // 2f8: bipush 2
      // 2f9: swap
      // 2fa: aastore
      // 2fb: dup_x1
      // 2fc: swap
      // 2fd: bipush 1
      // 2fe: swap
      // 2ff: aastore
      // 300: dup_x1
      // 301: swap
      // 302: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 305: bipush 0
      // 306: swap
      // 307: aastore
      // 308: invokevirtual rip/breeze/inject/Util139.method_031 ([Ljava/lang/Object;)V
      // 30b: iload 19
      // 30d: lload 1
      // 30e: lconst_0
      // 30f: lcmp
      // 310: ifle 64b
      // 313: ifeq 649
      // 316: goto 31d
      // 319: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 31c: athrow
      // 31d: aload 0
      // 31e: iload 23
      // 320: iload 25
      // 322: aload 4
      // 324: iload 24
      // 326: bipush 1
      // 327: anewarray 4
      // 32a: dup_x1
      // 32b: swap
      // 32c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 32f: bipush 0
      // 330: swap
      // 331: aastore
      // 332: invokevirtual rip/breeze/inject/ï.method_040 ([Ljava/lang/Object;)J
      // 335: bipush 3
      // 336: anewarray 4
      // 339: dup_x2
      // 33a: dup_x2
      // 33b: pop
      // 33c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 33f: bipush 2
      // 340: swap
      // 341: aastore
      // 342: dup_x1
      // 343: swap
      // 344: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 347: bipush 1
      // 348: swap
      // 349: aastore
      // 34a: dup_x1
      // 34b: swap
      // 34c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 34f: bipush 0
      // 350: swap
      // 351: aastore
      // 352: invokevirtual rip/breeze/inject/Util139.method_029 ([Ljava/lang/Object;)V
      // 355: iload 19
      // 357: lload 1
      // 358: lconst_0
      // 359: lcmp
      // 35a: ifle 64b
      // 35d: ifeq 649
      // 360: goto 367
      // 363: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 366: athrow
      // 367: aload 0
      // 368: iload 23
      // 36a: aload 4
      // 36c: lload 9
      // 36e: iload 23
      // 370: aload 21
      // 372: bipush 3
      // 373: anewarray 4
      // 376: dup_x1
      // 377: swap
      // 378: bipush 2
      // 379: swap
      // 37a: aastore
      // 37b: dup_x1
      // 37c: swap
      // 37d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 380: bipush 1
      // 381: swap
      // 382: aastore
      // 383: dup_x2
      // 384: dup_x2
      // 385: pop
      // 386: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 389: bipush 0
      // 38a: swap
      // 38b: aastore
      // 38c: invokevirtual rip/breeze/inject/ï.method_042 ([Ljava/lang/Object;)Ljava/lang/String;
      // 38f: bipush 2
      // 390: anewarray 4
      // 393: dup_x1
      // 394: swap
      // 395: bipush 1
      // 396: swap
      // 397: aastore
      // 398: dup_x1
      // 399: swap
      // 39a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 39d: bipush 0
      // 39e: swap
      // 39f: aastore
      // 3a0: invokevirtual rip/breeze/inject/Util139.method_033 ([Ljava/lang/Object;)V
      // 3a3: iload 19
      // 3a5: lload 1
      // 3a6: lconst_0
      // 3a7: lcmp
      // 3a8: iflt 64b
      // 3ab: ifeq 649
      // 3ae: goto 3b5
      // 3b1: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3b4: athrow
      // 3b5: aload 4
      // 3b7: aload 4
      // 3b9: iload 24
      // 3bb: bipush 1
      // 3bc: iadd
      // 3bd: bipush 1
      // 3be: anewarray 4
      // 3c1: dup_x1
      // 3c2: swap
      // 3c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3c6: bipush 0
      // 3c7: swap
      // 3c8: aastore
      // 3c9: invokevirtual rip/breeze/inject/ï.method_037 ([Ljava/lang/Object;)I
      // 3cc: bipush 1
      // 3cd: anewarray 4
      // 3d0: dup_x1
      // 3d1: swap
      // 3d2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3d5: bipush 0
      // 3d6: swap
      // 3d7: aastore
      // 3d8: invokevirtual rip/breeze/inject/ï.method_033 ([Ljava/lang/Object;)I
      // 3db: istore 27
      // 3dd: aload 4
      // 3df: aload 4
      // 3e1: iload 27
      // 3e3: bipush 2
      // 3e4: iadd
      // 3e5: bipush 1
      // 3e6: anewarray 4
      // 3e9: dup_x1
      // 3ea: swap
      // 3eb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3ee: bipush 0
      // 3ef: swap
      // 3f0: aastore
      // 3f1: invokevirtual rip/breeze/inject/ï.method_037 ([Ljava/lang/Object;)I
      // 3f4: bipush 1
      // 3f5: anewarray 4
      // 3f8: dup_x1
      // 3f9: swap
      // 3fa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3fd: bipush 0
      // 3fe: swap
      // 3ff: aastore
      // 400: invokevirtual rip/breeze/inject/ï.method_033 ([Ljava/lang/Object;)I
      // 403: istore 26
      // 405: aload 0
      // 406: iload 23
      // 408: aload 4
      // 40a: iload 24
      // 40c: bipush 1
      // 40d: anewarray 4
      // 410: dup_x1
      // 411: swap
      // 412: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 415: bipush 0
      // 416: swap
      // 417: aastore
      // 418: invokevirtual rip/breeze/inject/ï.method_035 ([Ljava/lang/Object;)I
      // 41b: aload 4
      // 41d: iload 27
      // 41f: lload 7
      // 421: aload 21
      // 423: bipush 3
      // 424: anewarray 4
      // 427: dup_x1
      // 428: swap
      // 429: bipush 2
      // 42a: swap
      // 42b: aastore
      // 42c: dup_x2
      // 42d: dup_x2
      // 42e: pop
      // 42f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 432: bipush 1
      // 433: swap
      // 434: aastore
      // 435: dup_x1
      // 436: swap
      // 437: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 43a: bipush 0
      // 43b: swap
      // 43c: aastore
      // 43d: invokevirtual rip/breeze/inject/ï.method_045 ([Ljava/lang/Object;)Ljava/lang/String;
      // 440: aload 4
      // 442: lload 5
      // 444: iload 26
      // 446: aload 21
      // 448: bipush 3
      // 449: anewarray 4
      // 44c: dup_x1
      // 44d: swap
      // 44e: bipush 2
      // 44f: swap
      // 450: aastore
      // 451: dup_x1
      // 452: swap
      // 453: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 456: bipush 1
      // 457: swap
      // 458: aastore
      // 459: dup_x2
      // 45a: dup_x2
      // 45b: pop
      // 45c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 45f: bipush 0
      // 460: swap
      // 461: aastore
      // 462: invokevirtual rip/breeze/inject/ï.method_041 ([Ljava/lang/Object;)Ljava/lang/String;
      // 465: aload 4
      // 467: iload 26
      // 469: bipush 2
      // 46a: iadd
      // 46b: lload 5
      // 46d: dup2_x1
      // 46e: pop2
      // 46f: aload 21
      // 471: bipush 3
      // 472: anewarray 4
      // 475: dup_x1
      // 476: swap
      // 477: bipush 2
      // 478: swap
      // 479: aastore
      // 47a: dup_x1
      // 47b: swap
      // 47c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 47f: bipush 1
      // 480: swap
      // 481: aastore
      // 482: dup_x2
      // 483: dup_x2
      // 484: pop
      // 485: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 488: bipush 0
      // 489: swap
      // 48a: aastore
      // 48b: invokevirtual rip/breeze/inject/ï.method_041 ([Ljava/lang/Object;)Ljava/lang/String;
      // 48e: aload 4
      // 490: iload 27
      // 492: bipush 1
      // 493: isub
      // 494: bipush 1
      // 495: anewarray 4
      // 498: dup_x1
      // 499: swap
      // 49a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 49d: bipush 0
      // 49e: swap
      // 49f: aastore
      // 4a0: invokevirtual rip/breeze/inject/ï.method_035 ([Ljava/lang/Object;)I
      // 4a3: iload 19
      // 4a5: lload 1
      // 4a6: lconst_0
      // 4a7: lcmp
      // 4a8: iflt 4b0
      // 4ab: ifne 4c2
      // 4ae: bipush 11
      // 4b0: if_icmpne 4c5
      // 4b3: goto 4ba
      // 4b6: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4b9: athrow
      // 4ba: bipush 1
      // 4bb: goto 4c2
      // 4be: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4c1: athrow
      // 4c2: goto 4c6
      // 4c5: bipush 0
      // 4c6: istore 28
      // 4c8: astore 29
      // 4ca: astore 30
      // 4cc: astore 31
      // 4ce: istore 32
      // 4d0: lload 13
      // 4d2: iload 32
      // 4d4: aload 31
      // 4d6: aload 30
      // 4d8: aload 29
      // 4da: iload 28
      // 4dc: bipush 7
      // 4de: anewarray 4
      // 4e1: dup_x1
      // 4e2: swap
      // 4e3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4e6: bipush 6
      // 4e8: swap
      // 4e9: aastore
      // 4ea: dup_x1
      // 4eb: swap
      // 4ec: bipush 5
      // 4ed: swap
      // 4ee: aastore
      // 4ef: dup_x1
      // 4f0: swap
      // 4f1: bipush 4
      // 4f2: swap
      // 4f3: aastore
      // 4f4: dup_x1
      // 4f5: swap
      // 4f6: bipush 3
      // 4f7: swap
      // 4f8: aastore
      // 4f9: dup_x1
      // 4fa: swap
      // 4fb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4fe: bipush 2
      // 4ff: swap
      // 500: aastore
      // 501: dup_x2
      // 502: dup_x2
      // 503: pop
      // 504: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 507: bipush 1
      // 508: swap
      // 509: aastore
      // 50a: dup_x1
      // 50b: swap
      // 50c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 50f: bipush 0
      // 510: swap
      // 511: aastore
      // 512: invokevirtual rip/breeze/inject/Util139.method_035 ([Ljava/lang/Object;)V
      // 515: iload 19
      // 517: lload 1
      // 518: lconst_0
      // 519: lcmp
      // 51a: ifle 64b
      // 51d: ifeq 649
      // 520: bipush 1
      // 521: istore 22
      // 523: aload 4
      // 525: aload 4
      // 527: iload 24
      // 529: bipush 2
      // 52a: iadd
      // 52b: bipush 1
      // 52c: anewarray 4
      // 52f: dup_x1
      // 530: swap
      // 531: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 534: bipush 0
      // 535: swap
      // 536: aastore
      // 537: invokevirtual rip/breeze/inject/ï.method_037 ([Ljava/lang/Object;)I
      // 53a: bipush 1
      // 53b: anewarray 4
      // 53e: dup_x1
      // 53f: swap
      // 540: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 543: bipush 0
      // 544: swap
      // 545: aastore
      // 546: invokevirtual rip/breeze/inject/ï.method_033 ([Ljava/lang/Object;)I
      // 549: istore 26
      // 54b: aload 0
      // 54c: iload 25
      // 54e: iload 23
      // 550: aload 4
      // 552: lload 5
      // 554: iload 26
      // 556: aload 21
      // 558: bipush 3
      // 559: anewarray 4
      // 55c: dup_x1
      // 55d: swap
      // 55e: bipush 2
      // 55f: swap
      // 560: aastore
      // 561: dup_x1
      // 562: swap
      // 563: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 566: bipush 1
      // 567: swap
      // 568: aastore
      // 569: dup_x2
      // 56a: dup_x2
      // 56b: pop
      // 56c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 56f: bipush 0
      // 570: swap
      // 571: aastore
      // 572: invokevirtual rip/breeze/inject/ï.method_041 ([Ljava/lang/Object;)Ljava/lang/String;
      // 575: aload 4
      // 577: iload 26
      // 579: bipush 2
      // 57a: iadd
      // 57b: lload 5
      // 57d: dup2_x1
      // 57e: pop2
      // 57f: aload 21
      // 581: bipush 3
      // 582: anewarray 4
      // 585: dup_x1
      // 586: swap
      // 587: bipush 2
      // 588: swap
      // 589: aastore
      // 58a: dup_x1
      // 58b: swap
      // 58c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 58f: bipush 1
      // 590: swap
      // 591: aastore
      // 592: dup_x2
      // 593: dup_x2
      // 594: pop
      // 595: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 598: bipush 0
      // 599: swap
      // 59a: aastore
      // 59b: invokevirtual rip/breeze/inject/ï.method_041 ([Ljava/lang/Object;)Ljava/lang/String;
      // 59e: aload 4
      // 5a0: iload 24
      // 5a2: bipush 1
      // 5a3: anewarray 4
      // 5a6: dup_x1
      // 5a7: swap
      // 5a8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5ab: bipush 0
      // 5ac: swap
      // 5ad: aastore
      // 5ae: invokevirtual rip/breeze/inject/ï.method_037 ([Ljava/lang/Object;)I
      // 5b1: bipush 5
      // 5b2: anewarray 4
      // 5b5: dup_x1
      // 5b6: swap
      // 5b7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5ba: bipush 4
      // 5bb: swap
      // 5bc: aastore
      // 5bd: dup_x1
      // 5be: swap
      // 5bf: bipush 3
      // 5c0: swap
      // 5c1: aastore
      // 5c2: dup_x1
      // 5c3: swap
      // 5c4: bipush 2
      // 5c5: swap
      // 5c6: aastore
      // 5c7: dup_x1
      // 5c8: swap
      // 5c9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5cc: bipush 1
      // 5cd: swap
      // 5ce: aastore
      // 5cf: dup_x1
      // 5d0: swap
      // 5d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5d4: bipush 0
      // 5d5: swap
      // 5d6: aastore
      // 5d7: invokevirtual rip/breeze/inject/Util139.method_041 ([Ljava/lang/Object;)V
      // 5da: iload 19
      // 5dc: lload 1
      // 5dd: lconst_0
      // 5de: lcmp
      // 5df: iflt 64b
      // 5e2: ifeq 649
      // 5e5: aload 0
      // 5e6: iload 23
      // 5e8: iload 25
      // 5ea: aload 4
      // 5ec: lload 5
      // 5ee: iload 24
      // 5f0: aload 21
      // 5f2: bipush 3
      // 5f3: anewarray 4
      // 5f6: dup_x1
      // 5f7: swap
      // 5f8: bipush 2
      // 5f9: swap
      // 5fa: aastore
      // 5fb: dup_x1
      // 5fc: swap
      // 5fd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 600: bipush 1
      // 601: swap
      // 602: aastore
      // 603: dup_x2
      // 604: dup_x2
      // 605: pop
      // 606: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 609: bipush 0
      // 60a: swap
      // 60b: aastore
      // 60c: invokevirtual rip/breeze/inject/ï.method_041 ([Ljava/lang/Object;)Ljava/lang/String;
      // 60f: bipush 3
      // 610: anewarray 4
      // 613: dup_x1
      // 614: swap
      // 615: bipush 2
      // 616: swap
      // 617: aastore
      // 618: dup_x1
      // 619: swap
      // 61a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 61d: bipush 1
      // 61e: swap
      // 61f: aastore
      // 620: dup_x1
      // 621: swap
      // 622: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 625: bipush 0
      // 626: swap
      // 627: aastore
      // 628: invokevirtual rip/breeze/inject/Util139.method_045 ([Ljava/lang/Object;)V
      // 62b: iload 19
      // 62d: lload 1
      // 62e: lconst_0
      // 62f: lcmp
      // 630: ifle 64b
      // 633: ifeq 649
      // 636: goto 63d
      // 639: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 63c: athrow
      // 63d: new java/lang/IllegalArgumentException
      // 640: dup
      // 641: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 644: athrow
      // 645: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 648: athrow
      // 649: iload 23
      // 64b: iload 25
      // 64d: iload 19
      // 64f: lload 1
      // 650: lconst_0
      // 651: lcmp
      // 652: iflt 659
      // 655: ifne 685
      // 658: bipush 5
      // 659: if_icmpeq 67d
      // 65c: goto 663
      // 65f: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 662: athrow
      // 663: iload 25
      // 665: iload 19
      // 667: ifne 685
      // 66a: goto 671
      // 66d: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 670: athrow
      // 671: bipush 6
      // 673: if_icmpne 688
      // 676: goto 67d
      // 679: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 67c: athrow
      // 67d: bipush 2
      // 67e: goto 685
      // 681: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 684: athrow
      // 685: goto 689
      // 688: bipush 1
      // 689: iadd
      // 68a: istore 23
      // 68c: iload 19
      // 68e: ifeq 0d9
      // 691: lload 1
      // 692: lconst_0
      // 693: lcmp
      // 694: iflt 6c4
      // 697: iload 22
      // 699: ifeq 6c4
      // 69c: aload 0
      // 69d: lload 11
      // 69f: aload 4
      // 6a1: aload 21
      // 6a3: bipush 3
      // 6a4: anewarray 4
      // 6a7: dup_x1
      // 6a8: swap
      // 6a9: bipush 2
      // 6aa: swap
      // 6ab: aastore
      // 6ac: dup_x1
      // 6ad: swap
      // 6ae: bipush 1
      // 6af: swap
      // 6b0: aastore
      // 6b1: dup_x2
      // 6b2: dup_x2
      // 6b3: pop
      // 6b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6b7: bipush 0
      // 6b8: swap
      // 6b9: aastore
      // 6ba: invokevirtual rip/breeze/inject/Util139.calculate ([Ljava/lang/Object;)V
      // 6bd: goto 6c4
      // 6c0: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c3: athrow
      // 6c4: return
      // try (147 -> 156): 157 java/lang/IllegalArgumentException
      // try (154 -> 164): 164 java/lang/IllegalArgumentException
      // try (159 -> 189): 190 java/lang/IllegalArgumentException
      // try (193 -> 352): 353 java/lang/IllegalArgumentException
      // try (311 -> 436): 437 java/lang/IllegalArgumentException
      // try (355 -> 481): 482 java/lang/IllegalArgumentException
      // try (439 -> 531): 532 java/lang/IllegalArgumentException
      // try (582 -> 695): 696 java/lang/IllegalArgumentException
      // try (693 -> 699): 700 java/lang/IllegalArgumentException
      // try (790 -> 949): 950 java/lang/IllegalArgumentException
      // try (895 -> 956): 956 java/lang/IllegalArgumentException
      // try (958 -> 968): 969 java/lang/IllegalArgumentException
      // try (966 -> 974): 975 java/lang/IllegalArgumentException
      // try (971 -> 979): 980 java/lang/IllegalArgumentException
      // try (977 -> 983): 984 java/lang/IllegalArgumentException
      // try (997 -> 1022): 1023 java/lang/IllegalArgumentException
   }

   private void calculate(Object[] param1) {
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
      // 00e: checkcast rip/breeze/inject/ï
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast [C
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 97927940538442
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 53381799075133
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 5537716148720
      // 035: lxor
      // 036: lstore 10
      // 038: dup2
      // 039: ldc2_w 53444342396299
      // 03c: lxor
      // 03d: lstore 12
      // 03f: pop2
      // 040: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 043: aload 4
      // 045: getfield rip/breeze/inject/ï.arr_õ_2 [B
      // 048: astore 14
      // 04a: istore 15
      // 04c: aload 4
      // 04e: lload 8
      // 050: bipush 1
      // 051: anewarray 4
      // 054: dup_x2
      // 055: dup_x2
      // 056: pop
      // 057: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05a: bipush 0
      // 05b: swap
      // 05c: aastore
      // 05d: invokevirtual rip/breeze/inject/ï.method_029 ([Ljava/lang/Object;)I
      // 060: istore 16
      // 062: aload 4
      // 064: iload 16
      // 066: bipush 2
      // 067: isub
      // 068: bipush 1
      // 069: anewarray 4
      // 06c: dup_x1
      // 06d: swap
      // 06e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 071: bipush 0
      // 072: swap
      // 073: aastore
      // 074: invokevirtual rip/breeze/inject/ï.method_037 ([Ljava/lang/Object;)I
      // 077: istore 17
      // 079: iload 17
      // 07b: ifle 134
      // 07e: aload 4
      // 080: lload 6
      // 082: iload 16
      // 084: aload 5
      // 086: bipush 3
      // 087: anewarray 4
      // 08a: dup_x1
      // 08b: swap
      // 08c: bipush 2
      // 08d: swap
      // 08e: aastore
      // 08f: dup_x1
      // 090: swap
      // 091: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 094: bipush 1
      // 095: swap
      // 096: aastore
      // 097: dup_x2
      // 098: dup_x2
      // 099: pop
      // 09a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09d: bipush 0
      // 09e: swap
      // 09f: aastore
      // 0a0: invokevirtual rip/breeze/inject/ï.method_041 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0a3: astore 18
      // 0a5: sipush 30524
      // 0a8: ldc2_w 1180476353505906057
      // 0ab: lload 2
      // 0ac: lxor
      // 0ad: invokestatic rip/breeze/inject/Util139.buildString_3 (IJ)Ljava/lang/String;
      // 0b0: aload 18
      // 0b2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b5: iload 15
      // 0b7: lload 2
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: iflt 140
      // 0bd: ifne 13e
      // 0c0: iload 15
      // 0c2: ifne 12a
      // 0c5: goto 0cc
      // 0c8: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cb: athrow
      // 0cc: lload 2
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: ifle 123
      // 0d2: ifeq 108
      // 0d5: goto 0dc
      // 0d8: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: lload 2
      // 0de: lconst_0
      // 0df: lcmp
      // 0e0: ifle 13b
      // 0e3: aload 4
      // 0e5: iload 16
      // 0e7: bipush 6
      // 0e9: iadd
      // 0ea: bipush 1
      // 0eb: anewarray 4
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f3: bipush 0
      // 0f4: swap
      // 0f5: aastore
      // 0f6: invokevirtual rip/breeze/inject/ï.method_037 ([Ljava/lang/Object;)I
      // 0f9: putfield rip/breeze/inject/Util139.int_ö I
      // 0fc: iload 15
      // 0fe: ifeq 134
      // 101: goto 108
      // 104: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 107: athrow
      // 108: iload 16
      // 10a: bipush 6
      // 10c: aload 4
      // 10e: iload 16
      // 110: bipush 2
      // 111: iadd
      // 112: bipush 1
      // 113: anewarray 4
      // 116: dup_x1
      // 117: swap
      // 118: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11b: bipush 0
      // 11c: swap
      // 11d: aastore
      // 11e: invokevirtual rip/breeze/inject/ï.method_039 ([Ljava/lang/Object;)I
      // 121: iadd
      // 122: iadd
      // 123: goto 12a
      // 126: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 129: athrow
      // 12a: istore 16
      // 12c: iinc 17 -1
      // 12f: iload 15
      // 131: ifeq 079
      // 134: lload 2
      // 135: lconst_0
      // 136: lcmp
      // 137: ifle 2af
      // 13a: aload 0
      // 13b: getfield rip/breeze/inject/Util139.int_ö I
      // 13e: iload 15
      // 140: ifne 16b
      // 143: ifle 2af
      // 146: goto 14d
      // 149: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14c: athrow
      // 14d: iload 16
      // 14f: bipush 8
      // 151: iadd
      // 152: istore 17
      // 154: aload 4
      // 156: iload 16
      // 158: bipush 2
      // 159: iadd
      // 15a: bipush 1
      // 15b: anewarray 4
      // 15e: dup_x1
      // 15f: swap
      // 160: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 163: bipush 0
      // 164: swap
      // 165: aastore
      // 166: invokevirtual rip/breeze/inject/ï.method_039 ([Ljava/lang/Object;)I
      // 169: bipush 2
      // 16a: isub
      // 16b: istore 18
      // 16d: aload 0
      // 16e: new rip/breeze/inject/ð
      // 171: dup
      // 172: iload 18
      // 174: invokespecial rip/breeze/inject/ð.<init> (I)V
      // 177: putfield rip/breeze/inject/Util139.ð_õ Lrip/breeze/inject/ð;
      // 17a: aload 0
      // 17b: getfield rip/breeze/inject/Util139.ð_õ Lrip/breeze/inject/ð;
      // 17e: aload 14
      // 180: iload 17
      // 182: iload 18
      // 184: lload 12
      // 186: bipush 4
      // 187: anewarray 4
      // 18a: dup_x2
      // 18b: dup_x2
      // 18c: pop
      // 18d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 190: bipush 3
      // 191: swap
      // 192: aastore
      // 193: dup_x1
      // 194: swap
      // 195: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 198: bipush 2
      // 199: swap
      // 19a: aastore
      // 19b: dup_x1
      // 19c: swap
      // 19d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a0: bipush 1
      // 1a1: swap
      // 1a2: aastore
      // 1a3: dup_x1
      // 1a4: swap
      // 1a5: bipush 0
      // 1a6: swap
      // 1a7: aastore
      // 1a8: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1ab: pop
      // 1ac: iload 17
      // 1ae: istore 19
      // 1b0: bipush 0
      // 1b1: istore 20
      // 1b3: iload 20
      // 1b5: aload 0
      // 1b6: getfield rip/breeze/inject/Util139.int_ö I
      // 1b9: if_icmpge 2af
      // 1bc: iload 19
      // 1be: iload 17
      // 1c0: isub
      // 1c1: istore 21
      // 1c3: aload 4
      // 1c5: iload 19
      // 1c7: bipush 1
      // 1c8: anewarray 4
      // 1cb: dup_x1
      // 1cc: swap
      // 1cd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d0: bipush 0
      // 1d1: swap
      // 1d2: aastore
      // 1d3: invokevirtual rip/breeze/inject/ï.method_037 ([Ljava/lang/Object;)I
      // 1d6: istore 22
      // 1d8: iinc 19 2
      // 1db: aload 4
      // 1dd: iload 19
      // 1df: bipush 1
      // 1e0: anewarray 4
      // 1e3: dup_x1
      // 1e4: swap
      // 1e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e8: bipush 0
      // 1e9: swap
      // 1ea: aastore
      // 1eb: invokevirtual rip/breeze/inject/ï.method_037 ([Ljava/lang/Object;)I
      // 1ee: istore 23
      // 1f0: iinc 19 2
      // 1f3: aload 4
      // 1f5: iload 22
      // 1f7: lload 10
      // 1f9: aload 5
      // 1fb: bipush 3
      // 1fc: anewarray 4
      // 1ff: dup_x1
      // 200: swap
      // 201: bipush 2
      // 202: swap
      // 203: aastore
      // 204: dup_x2
      // 205: dup_x2
      // 206: pop
      // 207: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20a: bipush 1
      // 20b: swap
      // 20c: aastore
      // 20d: dup_x1
      // 20e: swap
      // 20f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 212: bipush 0
      // 213: swap
      // 214: aastore
      // 215: invokevirtual rip/breeze/inject/ï.method_049 ([Ljava/lang/Object;)Ljava/lang/Object;
      // 218: invokevirtual java/lang/Object.hashCode ()I
      // 21b: istore 24
      // 21d: iload 23
      // 21f: iinc 23 -1
      // 222: ifle 287
      // 225: aload 4
      // 227: iload 19
      // 229: bipush 1
      // 22a: anewarray 4
      // 22d: dup_x1
      // 22e: swap
      // 22f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 232: bipush 0
      // 233: swap
      // 234: aastore
      // 235: invokevirtual rip/breeze/inject/ï.method_037 ([Ljava/lang/Object;)I
      // 238: istore 25
      // 23a: iinc 19 2
      // 23d: iload 24
      // 23f: aload 4
      // 241: iload 25
      // 243: lload 10
      // 245: aload 5
      // 247: bipush 3
      // 248: anewarray 4
      // 24b: dup_x1
      // 24c: swap
      // 24d: bipush 2
      // 24e: swap
      // 24f: aastore
      // 250: dup_x2
      // 251: dup_x2
      // 252: pop
      // 253: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 256: bipush 1
      // 257: swap
      // 258: aastore
      // 259: dup_x1
      // 25a: swap
      // 25b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 25e: bipush 0
      // 25f: swap
      // 260: aastore
      // 261: invokevirtual rip/breeze/inject/ï.method_049 ([Ljava/lang/Object;)Ljava/lang/Object;
      // 264: invokevirtual java/lang/Object.hashCode ()I
      // 267: ixor
      // 268: istore 24
      // 26a: iload 15
      // 26c: lload 2
      // 26d: lconst_0
      // 26e: lcmp
      // 26f: iflt 2ac
      // 272: ifne 2aa
      // 275: iload 15
      // 277: ifeq 21d
      // 27a: lload 2
      // 27b: lconst_0
      // 27c: lcmp
      // 27d: ifle 26a
      // 280: goto 287
      // 283: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 286: athrow
      // 287: aload 0
      // 288: new rip/breeze/inject/BreezeClass2
      // 28b: dup
      // 28c: iload 20
      // 28e: bipush 64
      // 290: iload 21
      // 292: i2l
      // 293: iload 24
      // 295: ldc 2147483647
      // 297: iand
      // 298: invokespecial rip/breeze/inject/BreezeClass2.<init> (IIJI)V
      // 29b: bipush 1
      // 29c: anewarray 4
      // 29f: dup_x1
      // 2a0: swap
      // 2a1: bipush 0
      // 2a2: swap
      // 2a3: aastore
      // 2a4: invokevirtual rip/breeze/inject/Util139.calculate_4 ([Ljava/lang/Object;)V
      // 2a7: iinc 20 1
      // 2aa: iload 15
      // 2ac: ifeq 1b3
      // 2af: return
      // try (100 -> 115): 116 java/lang/IllegalArgumentException
      // try (113 -> 123): 124 java/lang/IllegalArgumentException
      // try (118 -> 147): 148 java/lang/IllegalArgumentException
      // try (126 -> 167): 168 java/lang/IllegalArgumentException
      // try (180 -> 183): 184 java/lang/IllegalArgumentException
      // try (356 -> 364): 369 java/lang/IllegalArgumentException
   }

   ï getÏ(Object[] var1) {
      return this.ï_þ;
   }

   int getValue(Object[] var1) {
      return this.int_ý;
   }

   String getString(Object[] var1) {
      return this.string_ü;
   }

   int getValue_2(Object[] var1) {
      int var2 = (Integer)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      var4 = 138480426251030L ^ var4;
      long var6 = var4 ^ 22030766359293L;
      this.int_ý = var2;
      this.string_ü = var3;
      return this.getBreezeClass3_2(new Object[]{var3, var6}).int_è;
   }

   int getValue_3(Object[] var1) {
      return this.int_ù;
   }

   int getValue_4(Object[] var1) {
      return this.ð_ø.int_þ_2;
   }

   void invoke_8(Object[] var1) {
      ð var2 = (ð)var1[0];
      long var3 = (Long)var1[1];
      var3 = 138480426251030L ^ var3;
      long var5 = var3 ^ 792614500260L;
      long var7 = var3 ^ 5507007886340L;
      int var10001 = this.int_ù;
      Object[] var10004 = new Object[]{null, var5};
      var10004[0] = var10001;
      ð var10000 = var2.method_004(var10004);
      byte[] var10 = this.ð_ø.arr_ÿ_2;
      int var10003 = this.ð_ø.int_þ_2;
      Object[] var10006 = new Object[]{null, null, null, var7};
      var10006[2] = var10003;
      var10006[1] = 0;
      var10006[0] = var10;
      var10000.method_012(var10006);
   }

   int calculate_2(Object[] param1) {
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
      // 0c: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 53337957818074
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 1e: istore 6
      // 20: aload 0
      // 21: iload 6
      // 23: ifne 3b
      // 26: getfield rip/breeze/inject/Util139.ð_õ Lrip/breeze/inject/ð;
      // 29: ifnull 69
      // 2c: goto 33
      // 2f: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32: athrow
      // 33: aload 0
      // 34: goto 3b
      // 37: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: lload 4
      // 3d: sipush 30524
      // 40: ldc2_w 1180400406914230212
      // 43: lload 2
      // 44: lxor
      // 45: invokestatic rip/breeze/inject/Util139.buildString_3 (IJ)Ljava/lang/String;
      // 48: bipush 2
      // 49: anewarray 4
      // 4c: dup_x1
      // 4d: swap
      // 4e: bipush 1
      // 4f: swap
      // 50: aastore
      // 51: dup_x2
      // 52: dup_x2
      // 53: pop
      // 54: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 57: bipush 0
      // 58: swap
      // 59: aastore
      // 5a: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 5d: pop
      // 5e: bipush 8
      // 60: aload 0
      // 61: getfield rip/breeze/inject/Util139.ð_õ Lrip/breeze/inject/ð;
      // 64: getfield rip/breeze/inject/ð.int_þ_2 I
      // 67: iadd
      // 68: ireturn
      // 69: bipush 0
      // 6a: ireturn
      // try (20 -> 25): 26 java/lang/IllegalArgumentException
      // try (23 -> 29): 30 java/lang/IllegalArgumentException
   }

   void calculate_3(Object[] param1) {
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
      // 00e: checkcast rip/breeze/inject/ð
      // 011: astore 4
      // 013: pop
      // 014: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 59550794223433
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 135611984453238
      // 026: lxor
      // 027: lstore 7
      // 029: dup2
      // 02a: ldc2_w 79843390885365
      // 02d: lxor
      // 02e: lstore 9
      // 030: dup2
      // 031: ldc2_w 56708723461353
      // 034: lxor
      // 035: lstore 11
      // 037: pop2
      // 038: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 03b: istore 13
      // 03d: aload 0
      // 03e: getfield rip/breeze/inject/Util139.ð_õ Lrip/breeze/inject/ð;
      // 041: iload 13
      // 043: ifeq 10d
      // 046: ifnull 10e
      // 049: goto 050
      // 04c: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04f: athrow
      // 050: aload 4
      // 052: aload 0
      // 053: lload 9
      // 055: sipush 25906
      // 058: ldc2_w 7627361809723107046
      // 05b: lload 2
      // 05c: lxor
      // 05d: invokestatic rip/breeze/inject/Util139.buildString_3 (IJ)Ljava/lang/String;
      // 060: bipush 2
      // 061: anewarray 4
      // 064: dup_x1
      // 065: swap
      // 066: bipush 1
      // 067: swap
      // 068: aastore
      // 069: dup_x2
      // 06a: dup_x2
      // 06b: pop
      // 06c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06f: bipush 0
      // 070: swap
      // 071: aastore
      // 072: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 075: lload 5
      // 077: bipush 2
      // 078: anewarray 4
      // 07b: dup_x2
      // 07c: dup_x2
      // 07d: pop
      // 07e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 081: bipush 1
      // 082: swap
      // 083: aastore
      // 084: dup_x1
      // 085: swap
      // 086: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 089: bipush 0
      // 08a: swap
      // 08b: aastore
      // 08c: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 08f: aload 0
      // 090: getfield rip/breeze/inject/Util139.ð_õ Lrip/breeze/inject/ð;
      // 093: getfield rip/breeze/inject/ð.int_þ_2 I
      // 096: bipush 2
      // 097: iadd
      // 098: lload 7
      // 09a: bipush 2
      // 09b: anewarray 4
      // 09e: dup_x2
      // 09f: dup_x2
      // 0a0: pop
      // 0a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a4: bipush 1
      // 0a5: swap
      // 0a6: aastore
      // 0a7: dup_x1
      // 0a8: swap
      // 0a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ac: bipush 0
      // 0ad: swap
      // 0ae: aastore
      // 0af: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0b2: aload 0
      // 0b3: getfield rip/breeze/inject/Util139.int_ö I
      // 0b6: lload 5
      // 0b8: bipush 2
      // 0b9: anewarray 4
      // 0bc: dup_x2
      // 0bd: dup_x2
      // 0be: pop
      // 0bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c2: bipush 1
      // 0c3: swap
      // 0c4: aastore
      // 0c5: dup_x1
      // 0c6: swap
      // 0c7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ca: bipush 0
      // 0cb: swap
      // 0cc: aastore
      // 0cd: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0d0: aload 0
      // 0d1: getfield rip/breeze/inject/Util139.ð_õ Lrip/breeze/inject/ð;
      // 0d4: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 0d7: bipush 0
      // 0d8: aload 0
      // 0d9: getfield rip/breeze/inject/Util139.ð_õ Lrip/breeze/inject/ð;
      // 0dc: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0df: lload 11
      // 0e1: bipush 4
      // 0e2: anewarray 4
      // 0e5: dup_x2
      // 0e6: dup_x2
      // 0e7: pop
      // 0e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb: bipush 3
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f3: bipush 2
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fb: bipush 1
      // 0fc: swap
      // 0fd: aastore
      // 0fe: dup_x1
      // 0ff: swap
      // 100: bipush 0
      // 101: swap
      // 102: aastore
      // 103: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 106: goto 10d
      // 109: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10c: athrow
      // 10d: pop
      // 10e: return
      // try (37 -> 42): 43 java/lang/IllegalArgumentException
      // try (41 -> 161): 162 java/lang/IllegalArgumentException
   }

   private BreezeClass2 getBreezeClass2(Object[] var1) {
      int var2 = (Integer)var1[0];
      return this.arr_ú[var2 % this.arr_ú.length];
   }

   private BreezeClass2 getBreezeClass2_2(Object[] param1) {
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
      // 0e: checkcast rip/breeze/inject/BreezeClass2
      // 11: astore 4
      // 13: pop
      // 14: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 1d: istore 5
      // 1f: aload 0
      // 20: getfield rip/breeze/inject/Util139.int_û I
      // 23: aload 0
      // 24: getfield rip/breeze/inject/Util139.arr_ú [Lrip/breeze/inject/BreezeClass2;
      // 27: arraylength
      // 28: bipush 3
      // 29: imul
      // 2a: bipush 4
      // 2b: idiv
      // 2c: iload 5
      // 2e: ifne da
      // 31: if_icmple c6
      // 34: goto 3b
      // 37: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield rip/breeze/inject/Util139.arr_ú [Lrip/breeze/inject/BreezeClass2;
      // 3f: arraylength
      // 40: istore 6
      // 42: iload 6
      // 44: bipush 2
      // 45: imul
      // 46: bipush 1
      // 47: iadd
      // 48: istore 7
      // 4a: iload 7
      // 4c: anewarray 45
      // 4f: astore 8
      // 51: iload 6
      // 53: bipush 1
      // 54: isub
      // 55: istore 9
      // 57: iload 9
      // 59: iflt ba
      // 5c: aload 0
      // 5d: getfield rip/breeze/inject/Util139.arr_ú [Lrip/breeze/inject/BreezeClass2;
      // 60: iload 9
      // 62: aaload
      // 63: iload 5
      // 65: ifne f3
      // 68: astore 10
      // 6a: aload 10
      // 6c: ifnull b2
      // 6f: aload 10
      // 71: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 74: iload 7
      // 76: irem
      // 77: istore 11
      // 79: aload 10
      // 7b: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 7e: astore 12
      // 80: aload 10
      // 82: aload 8
      // 84: iload 11
      // 86: aaload
      // 87: putfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 8a: aload 8
      // 8c: iload 11
      // 8e: aload 10
      // 90: aastore
      // 91: aload 12
      // 93: astore 10
      // 95: iload 5
      // 97: lload 2
      // 98: lconst_0
      // 99: lcmp
      // 9a: ifle b7
      // 9d: ifne b5
      // a0: iload 5
      // a2: ifeq 6a
      // a5: lload 2
      // a6: lconst_0
      // a7: lcmp
      // a8: ifle 95
      // ab: goto b2
      // ae: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b1: athrow
      // b2: iinc 9 -1
      // b5: iload 5
      // b7: ifeq 57
      // ba: aload 0
      // bb: lload 2
      // bc: lconst_0
      // bd: lcmp
      // be: ifle 5d
      // c1: aload 8
      // c3: putfield rip/breeze/inject/Util139.arr_ú [Lrip/breeze/inject/BreezeClass2;
      // c6: aload 0
      // c7: dup
      // c8: getfield rip/breeze/inject/Util139.int_û I
      // cb: bipush 1
      // cc: iadd
      // cd: putfield rip/breeze/inject/Util139.int_û I
      // d0: aload 4
      // d2: getfield rip/breeze/inject/BreezeClass2.int_á I
      // d5: aload 0
      // d6: getfield rip/breeze/inject/Util139.arr_ú [Lrip/breeze/inject/BreezeClass2;
      // d9: arraylength
      // da: irem
      // db: istore 6
      // dd: aload 4
      // df: aload 0
      // e0: getfield rip/breeze/inject/Util139.arr_ú [Lrip/breeze/inject/BreezeClass2;
      // e3: iload 6
      // e5: aaload
      // e6: putfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // e9: aload 0
      // ea: getfield rip/breeze/inject/Util139.arr_ú [Lrip/breeze/inject/BreezeClass2;
      // ed: iload 6
      // ef: aload 4
      // f1: dup_x2
      // f2: aastore
      // f3: areturn
      // try (19 -> 31): 32 java/lang/IllegalArgumentException
      // try (81 -> 89): 94 java/lang/IllegalArgumentException
   }

   private void calculate_4(Object[] var1) {
      BreezeClass2 var2 = (BreezeClass2)var1[0];
      this.int_û++;
      int var3 = var2.int_á % this.arr_ú.length;
      var2.breezeClass2_à = this.arr_ú[var3];
      this.arr_ú[var3] = var2;
   }

   BreezeClass3 getBreezeClass3(Object[] param1) {
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
      // 004: checkcast java/lang/Object
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 81502255381705
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 6670720224462
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 62949177407533
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 42085247726184
      // 033: lxor
      // 034: lstore 11
      // 036: dup2
      // 037: ldc2_w 14070668620658
      // 03a: lxor
      // 03b: lstore 13
      // 03d: dup2
      // 03e: ldc2_w 119098654080224
      // 041: lxor
      // 042: lstore 15
      // 044: dup2
      // 045: ldc2_w 53258349512007
      // 048: lxor
      // 049: lstore 17
      // 04b: dup2
      // 04c: ldc2_w 25134492860086
      // 04f: lxor
      // 050: lstore 19
      // 052: dup2
      // 053: ldc2_w 43000703508730
      // 056: lxor
      // 057: lstore 21
      // 059: dup2
      // 05a: ldc2_w 107125318627535
      // 05d: lxor
      // 05e: lstore 23
      // 060: dup2
      // 061: ldc2_w 47619448100614
      // 064: lxor
      // 065: lstore 25
      // 067: dup2
      // 068: ldc2_w 73664718982421
      // 06b: lxor
      // 06c: lstore 27
      // 06e: pop2
      // 06f: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 072: istore 29
      // 074: aload 2
      // 075: instanceof java/lang/Integer
      // 078: iload 29
      // 07a: ifne 0b2
      // 07d: ifeq 0ae
      // 080: goto 087
      // 083: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 086: athrow
      // 087: aload 0
      // 088: aload 2
      // 089: checkcast java/lang/Integer
      // 08c: invokevirtual java/lang/Integer.intValue ()I
      // 08f: lload 19
      // 091: bipush 2
      // 092: anewarray 4
      // 095: dup_x2
      // 096: dup_x2
      // 097: pop
      // 098: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09b: bipush 1
      // 09c: swap
      // 09d: aastore
      // 09e: dup_x1
      // 09f: swap
      // 0a0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a3: bipush 0
      // 0a4: swap
      // 0a5: aastore
      // 0a6: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_6 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 0a9: areturn
      // 0aa: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: aload 2
      // 0af: instanceof java/lang/Byte
      // 0b2: iload 29
      // 0b4: lload 3
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: ifle 0f4
      // 0ba: ifne 0f2
      // 0bd: ifeq 0ee
      // 0c0: goto 0c7
      // 0c3: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: aload 2
      // 0c9: checkcast java/lang/Byte
      // 0cc: invokevirtual java/lang/Byte.intValue ()I
      // 0cf: lload 19
      // 0d1: bipush 2
      // 0d2: anewarray 4
      // 0d5: dup_x2
      // 0d6: dup_x2
      // 0d7: pop
      // 0d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0db: bipush 1
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x1
      // 0df: swap
      // 0e0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e3: bipush 0
      // 0e4: swap
      // 0e5: aastore
      // 0e6: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_6 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 0e9: areturn
      // 0ea: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ed: athrow
      // 0ee: aload 2
      // 0ef: instanceof java/lang/Character
      // 0f2: iload 29
      // 0f4: lload 3
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: iflt 134
      // 0fa: ifne 132
      // 0fd: ifeq 12e
      // 100: goto 107
      // 103: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 106: athrow
      // 107: aload 0
      // 108: aload 2
      // 109: checkcast java/lang/Character
      // 10c: invokevirtual java/lang/Character.charValue ()C
      // 10f: lload 19
      // 111: bipush 2
      // 112: anewarray 4
      // 115: dup_x2
      // 116: dup_x2
      // 117: pop
      // 118: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11b: bipush 1
      // 11c: swap
      // 11d: aastore
      // 11e: dup_x1
      // 11f: swap
      // 120: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 123: bipush 0
      // 124: swap
      // 125: aastore
      // 126: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_6 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 129: areturn
      // 12a: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12d: athrow
      // 12e: aload 2
      // 12f: instanceof java/lang/Short
      // 132: iload 29
      // 134: lload 3
      // 135: lconst_0
      // 136: lcmp
      // 137: iflt 174
      // 13a: ifne 172
      // 13d: ifeq 16e
      // 140: goto 147
      // 143: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 146: athrow
      // 147: aload 0
      // 148: aload 2
      // 149: checkcast java/lang/Short
      // 14c: invokevirtual java/lang/Short.intValue ()I
      // 14f: lload 19
      // 151: bipush 2
      // 152: anewarray 4
      // 155: dup_x2
      // 156: dup_x2
      // 157: pop
      // 158: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15b: bipush 1
      // 15c: swap
      // 15d: aastore
      // 15e: dup_x1
      // 15f: swap
      // 160: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 163: bipush 0
      // 164: swap
      // 165: aastore
      // 166: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_6 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 169: areturn
      // 16a: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16d: athrow
      // 16e: aload 2
      // 16f: instanceof java/lang/Boolean
      // 172: iload 29
      // 174: lload 3
      // 175: lconst_0
      // 176: lcmp
      // 177: ifle 1cb
      // 17a: ifne 1c9
      // 17d: ifeq 1c5
      // 180: goto 187
      // 183: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 186: athrow
      // 187: aload 0
      // 188: aload 2
      // 189: checkcast java/lang/Boolean
      // 18c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 18f: iload 29
      // 191: ifne 1a6
      // 194: goto 19b
      // 197: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19a: athrow
      // 19b: ifeq 1a9
      // 19e: goto 1a5
      // 1a1: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a4: athrow
      // 1a5: bipush 1
      // 1a6: goto 1aa
      // 1a9: bipush 0
      // 1aa: lload 19
      // 1ac: bipush 2
      // 1ad: anewarray 4
      // 1b0: dup_x2
      // 1b1: dup_x2
      // 1b2: pop
      // 1b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b6: bipush 1
      // 1b7: swap
      // 1b8: aastore
      // 1b9: dup_x1
      // 1ba: swap
      // 1bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1be: bipush 0
      // 1bf: swap
      // 1c0: aastore
      // 1c1: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_6 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 1c4: areturn
      // 1c5: aload 2
      // 1c6: instanceof java/lang/Float
      // 1c9: iload 29
      // 1cb: lload 3
      // 1cc: lconst_0
      // 1cd: lcmp
      // 1ce: ifle 20d
      // 1d1: ifne 20b
      // 1d4: ifeq 207
      // 1d7: goto 1de
      // 1da: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1dd: athrow
      // 1de: aload 0
      // 1df: aload 2
      // 1e0: checkcast java/lang/Float
      // 1e3: invokevirtual java/lang/Float.floatValue ()F
      // 1e6: lload 23
      // 1e8: dup2_x1
      // 1e9: pop2
      // 1ea: bipush 2
      // 1eb: anewarray 4
      // 1ee: dup_x1
      // 1ef: swap
      // 1f0: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 1f3: bipush 1
      // 1f4: swap
      // 1f5: aastore
      // 1f6: dup_x2
      // 1f7: dup_x2
      // 1f8: pop
      // 1f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fc: bipush 0
      // 1fd: swap
      // 1fe: aastore
      // 1ff: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_7 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 202: areturn
      // 203: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 206: athrow
      // 207: aload 2
      // 208: instanceof java/lang/Long
      // 20b: iload 29
      // 20d: lload 3
      // 20e: lconst_0
      // 20f: lcmp
      // 210: ifle 24e
      // 213: ifne 24c
      // 216: ifeq 248
      // 219: goto 220
      // 21c: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21f: athrow
      // 220: aload 0
      // 221: aload 2
      // 222: checkcast java/lang/Long
      // 225: invokevirtual java/lang/Long.longValue ()J
      // 228: lload 25
      // 22a: bipush 2
      // 22b: anewarray 4
      // 22e: dup_x2
      // 22f: dup_x2
      // 230: pop
      // 231: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 234: bipush 1
      // 235: swap
      // 236: aastore
      // 237: dup_x2
      // 238: dup_x2
      // 239: pop
      // 23a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23d: bipush 0
      // 23e: swap
      // 23f: aastore
      // 240: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_9 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 243: areturn
      // 244: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 247: athrow
      // 248: aload 2
      // 249: instanceof java/lang/Double
      // 24c: iload 29
      // 24e: lload 3
      // 24f: lconst_0
      // 250: lcmp
      // 251: ifle 28f
      // 254: ifne 28d
      // 257: ifeq 289
      // 25a: goto 261
      // 25d: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 260: athrow
      // 261: aload 0
      // 262: aload 2
      // 263: checkcast java/lang/Double
      // 266: invokevirtual java/lang/Double.doubleValue ()D
      // 269: lload 17
      // 26b: bipush 2
      // 26c: anewarray 4
      // 26f: dup_x2
      // 270: dup_x2
      // 271: pop
      // 272: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 275: bipush 1
      // 276: swap
      // 277: aastore
      // 278: dup_x2
      // 279: dup_x2
      // 27a: pop
      // 27b: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 27e: bipush 0
      // 27f: swap
      // 280: aastore
      // 281: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_10 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 284: areturn
      // 285: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 288: athrow
      // 289: aload 2
      // 28a: instanceof java/lang/String
      // 28d: iload 29
      // 28f: lload 3
      // 290: lconst_0
      // 291: lcmp
      // 292: iflt 2c9
      // 295: ifne 2c7
      // 298: ifeq 2c3
      // 29b: goto 2a2
      // 29e: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a1: athrow
      // 2a2: aload 0
      // 2a3: lload 13
      // 2a5: aload 2
      // 2a6: checkcast java/lang/String
      // 2a9: bipush 2
      // 2aa: anewarray 4
      // 2ad: dup_x1
      // 2ae: swap
      // 2af: bipush 1
      // 2b0: swap
      // 2b1: aastore
      // 2b2: dup_x2
      // 2b3: dup_x2
      // 2b4: pop
      // 2b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b8: bipush 0
      // 2b9: swap
      // 2ba: aastore
      // 2bb: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_5 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 2be: areturn
      // 2bf: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c2: athrow
      // 2c3: aload 2
      // 2c4: instanceof rip/breeze/inject/MathUtil3
      // 2c7: iload 29
      // 2c9: lload 3
      // 2ca: lconst_0
      // 2cb: lcmp
      // 2cc: iflt 3a4
      // 2cf: ifne 3a2
      // 2d2: ifeq 39e
      // 2d5: goto 2dc
      // 2d8: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2db: athrow
      // 2dc: aload 2
      // 2dd: checkcast rip/breeze/inject/MathUtil3
      // 2e0: astore 30
      // 2e2: aload 30
      // 2e4: lload 15
      // 2e6: bipush 1
      // 2e7: anewarray 4
      // 2ea: dup_x2
      // 2eb: dup_x2
      // 2ec: pop
      // 2ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f0: bipush 0
      // 2f1: swap
      // 2f2: aastore
      // 2f3: invokevirtual rip/breeze/inject/MathUtil3.getValue ([Ljava/lang/Object;)I
      // 2f6: istore 31
      // 2f8: iload 31
      // 2fa: bipush 10
      // 2fc: lload 3
      // 2fd: lconst_0
      // 2fe: lcmp
      // 2ff: ifle 33b
      // 302: iload 29
      // 304: ifne 33b
      // 307: if_icmpne 337
      // 30a: goto 311
      // 30d: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 310: athrow
      // 311: aload 0
      // 312: aload 30
      // 314: bipush 0
      // 315: anewarray 4
      // 318: invokevirtual rip/breeze/inject/MathUtil3.buildString_3 ([Ljava/lang/Object;)Ljava/lang/String;
      // 31b: lload 11
      // 31d: bipush 2
      // 31e: anewarray 4
      // 321: dup_x2
      // 322: dup_x2
      // 323: pop
      // 324: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 327: bipush 1
      // 328: swap
      // 329: aastore
      // 32a: dup_x1
      // 32b: swap
      // 32c: bipush 0
      // 32d: swap
      // 32e: aastore
      // 32f: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 332: areturn
      // 333: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 336: athrow
      // 337: iload 31
      // 339: bipush 11
      // 33b: if_icmpne 371
      // 33e: aload 0
      // 33f: aload 30
      // 341: lload 5
      // 343: bipush 1
      // 344: anewarray 4
      // 347: dup_x2
      // 348: dup_x2
      // 349: pop
      // 34a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34d: bipush 0
      // 34e: swap
      // 34f: aastore
      // 350: invokevirtual rip/breeze/inject/MathUtil3.buildString_5 ([Ljava/lang/Object;)Ljava/lang/String;
      // 353: lload 21
      // 355: dup2_x1
      // 356: pop2
      // 357: bipush 2
      // 358: anewarray 4
      // 35b: dup_x1
      // 35c: swap
      // 35d: bipush 1
      // 35e: swap
      // 35f: aastore
      // 360: dup_x2
      // 361: dup_x2
      // 362: pop
      // 363: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 366: bipush 0
      // 367: swap
      // 368: aastore
      // 369: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_13 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 36c: areturn
      // 36d: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 370: athrow
      // 371: aload 0
      // 372: aload 30
      // 374: lload 5
      // 376: bipush 1
      // 377: anewarray 4
      // 37a: dup_x2
      // 37b: dup_x2
      // 37c: pop
      // 37d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 380: bipush 0
      // 381: swap
      // 382: aastore
      // 383: invokevirtual rip/breeze/inject/MathUtil3.buildString_5 ([Ljava/lang/Object;)Ljava/lang/String;
      // 386: lload 11
      // 388: bipush 2
      // 389: anewarray 4
      // 38c: dup_x2
      // 38d: dup_x2
      // 38e: pop
      // 38f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 392: bipush 1
      // 393: swap
      // 394: aastore
      // 395: dup_x1
      // 396: swap
      // 397: bipush 0
      // 398: swap
      // 399: aastore
      // 39a: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 39d: areturn
      // 39e: aload 2
      // 39f: instanceof rip/breeze/inject/º
      // 3a2: iload 29
      // 3a4: ifne 42a
      // 3a7: ifeq 41a
      // 3aa: goto 3b1
      // 3ad: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3b0: athrow
      // 3b1: aload 2
      // 3b2: checkcast rip/breeze/inject/º
      // 3b5: astore 30
      // 3b7: aload 0
      // 3b8: aload 30
      // 3ba: bipush 0
      // 3bb: anewarray 4
      // 3be: invokevirtual rip/breeze/inject/º.method_001 ([Ljava/lang/Object;)I
      // 3c1: lload 7
      // 3c3: dup2_x1
      // 3c4: pop2
      // 3c5: aload 30
      // 3c7: bipush 0
      // 3c8: anewarray 4
      // 3cb: invokevirtual rip/breeze/inject/º.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 3ce: aload 30
      // 3d0: bipush 0
      // 3d1: anewarray 4
      // 3d4: invokevirtual rip/breeze/inject/º.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 3d7: aload 30
      // 3d9: bipush 0
      // 3da: anewarray 4
      // 3dd: invokevirtual rip/breeze/inject/º.method_004 ([Ljava/lang/Object;)Ljava/lang/String;
      // 3e0: aload 30
      // 3e2: bipush 0
      // 3e3: anewarray 4
      // 3e6: invokevirtual rip/breeze/inject/º.method_005 ([Ljava/lang/Object;)Z
      // 3e9: bipush 6
      // 3eb: anewarray 4
      // 3ee: dup_x1
      // 3ef: swap
      // 3f0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3f3: bipush 5
      // 3f4: swap
      // 3f5: aastore
      // 3f6: dup_x1
      // 3f7: swap
      // 3f8: bipush 4
      // 3f9: swap
      // 3fa: aastore
      // 3fb: dup_x1
      // 3fc: swap
      // 3fd: bipush 3
      // 3fe: swap
      // 3ff: aastore
      // 400: dup_x1
      // 401: swap
      // 402: bipush 2
      // 403: swap
      // 404: aastore
      // 405: dup_x1
      // 406: swap
      // 407: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 40a: bipush 1
      // 40b: swap
      // 40c: aastore
      // 40d: dup_x2
      // 40e: dup_x2
      // 40f: pop
      // 410: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 413: bipush 0
      // 414: swap
      // 415: aastore
      // 416: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_12 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 419: areturn
      // 41a: aload 2
      // 41b: iload 29
      // 41d: ifne 42e
      // 420: instanceof rip/breeze/inject/è
      // 423: goto 42a
      // 426: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 429: athrow
      // 42a: ifeq 481
      // 42d: aload 2
      // 42e: checkcast rip/breeze/inject/è
      // 431: astore 30
      // 433: aload 0
      // 434: aload 30
      // 436: bipush 0
      // 437: anewarray 4
      // 43a: invokevirtual rip/breeze/inject/è.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 43d: aload 30
      // 43f: bipush 0
      // 440: anewarray 4
      // 443: invokevirtual rip/breeze/inject/è.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 446: aload 30
      // 448: bipush 0
      // 449: anewarray 4
      // 44c: invokevirtual rip/breeze/inject/è.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/º;
      // 44f: lload 27
      // 451: dup2_x1
      // 452: pop2
      // 453: aload 30
      // 455: bipush 0
      // 456: anewarray 4
      // 459: invokevirtual rip/breeze/inject/è.method_006 ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 45c: bipush 5
      // 45d: anewarray 4
      // 460: dup_x1
      // 461: swap
      // 462: bipush 4
      // 463: swap
      // 464: aastore
      // 465: dup_x1
      // 466: swap
      // 467: bipush 3
      // 468: swap
      // 469: aastore
      // 46a: dup_x2
      // 46b: dup_x2
      // 46c: pop
      // 46d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 470: bipush 2
      // 471: swap
      // 472: aastore
      // 473: dup_x1
      // 474: swap
      // 475: bipush 1
      // 476: swap
      // 477: aastore
      // 478: dup_x1
      // 479: swap
      // 47a: bipush 0
      // 47b: swap
      // 47c: aastore
      // 47d: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_14 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 480: areturn
      // 481: new java/lang/IllegalArgumentException
      // 484: dup
      // 485: aload 2
      // 486: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 489: lload 9
      // 48b: dup2_x1
      // 48c: pop2
      // 48d: bipush 2
      // 48e: anewarray 4
      // 491: dup_x1
      // 492: swap
      // 493: bipush 1
      // 494: swap
      // 495: aastore
      // 496: dup_x2
      // 497: dup_x2
      // 498: pop
      // 499: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 49c: bipush 0
      // 49d: swap
      // 49e: aastore
      // 49f: invokestatic rip/breeze/inject/Util139.buildString ([Ljava/lang/Object;)Ljava/lang/String;
      // 4a2: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 4a5: athrow
      // try (69 -> 74): 75 java/lang/IllegalArgumentException
      // try (73 -> 99): 99 java/lang/IllegalArgumentException
      // try (103 -> 110): 111 java/lang/IllegalArgumentException
      // try (109 -> 135): 135 java/lang/IllegalArgumentException
      // try (139 -> 146): 147 java/lang/IllegalArgumentException
      // try (145 -> 171): 171 java/lang/IllegalArgumentException
      // try (175 -> 182): 183 java/lang/IllegalArgumentException
      // try (181 -> 207): 207 java/lang/IllegalArgumentException
      // try (211 -> 218): 219 java/lang/IllegalArgumentException
      // try (217 -> 227): 228 java/lang/IllegalArgumentException
      // try (221 -> 231): 232 java/lang/IllegalArgumentException
      // try (257 -> 264): 265 java/lang/IllegalArgumentException
      // try (263 -> 291): 291 java/lang/IllegalArgumentException
      // try (295 -> 302): 303 java/lang/IllegalArgumentException
      // try (301 -> 328): 328 java/lang/IllegalArgumentException
      // try (332 -> 339): 340 java/lang/IllegalArgumentException
      // try (338 -> 365): 365 java/lang/IllegalArgumentException
      // try (369 -> 376): 377 java/lang/IllegalArgumentException
      // try (375 -> 399): 399 java/lang/IllegalArgumentException
      // try (403 -> 410): 411 java/lang/IllegalArgumentException
      // try (429 -> 438): 439 java/lang/IllegalArgumentException
      // try (437 -> 463): 463 java/lang/IllegalArgumentException
      // try (467 -> 500): 500 java/lang/IllegalArgumentException
      // try (534 -> 537): 538 java/lang/IllegalArgumentException
      // try (605 -> 609): 610 java/lang/IllegalArgumentException
   }

   private static String buildString(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      var1 = 138480426251030L ^ var1;
      return buildString_3(15545, 8319358419942861593L ^ var1) + var3;
   }

   BreezeClass3 getBreezeClass3_2(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = 138480426251030L ^ var3;
      long var5 = var3 ^ 62691395388310L;
      Object[] var10005 = new Object[]{null, var2, var5};
      var10005[0] = 7;
      return this.getBreezeClass3_19(var10005);
   }

   BreezeClass3 getBreezeClass3_3(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      var3 = 138480426251030L ^ var3;
      long var7 = var3 ^ 33587502379503L;
      Object[] var10007 = new Object[]{null, 9, var2, var5, var6};
      var10007[0] = var7;
      return this.getBreezeClass2_3(var10007);
   }

   BreezeClass3 getBreezeClass3_4(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      String var6 = (String)var1[3];
      byte var7 = (Boolean)var1[4];
      var3 = 138480426251030L ^ var3;
      long var8 = var3 ^ 35135533792462L;
      int var10 = Util140.getValue();

      byte var10000;
      label22: {
         label21: {
            try {
               var10000 = var7;
               if (var10 != 0) {
                  break label22;
               }

               if (var7 != 0) {
                  break label21;
               }
            } catch (IllegalArgumentException var12) {
               throw getIllegalArgumentException(var12);
            }

            var10000 = 10;
            break label22;
         }

         var10000 = 11;
      }

      byte var11 = var10000;
      Object[] var10007 = new Object[]{null, Integer.valueOf(var11), var2, var5, var6};
      var10007[0] = var8;
      return this.getBreezeClass2_3(var10007);
   }

   private BreezeClass2 getBreezeClass2_3(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/String
      // 01c: astore 5
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/String
      // 024: astore 6
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast java/lang/String
      // 02c: astore 7
      // 02e: pop
      // 02f: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 032: lload 2
      // 033: lxor
      // 034: lstore 2
      // 035: lload 2
      // 036: dup2
      // 037: ldc2_w 9871731405667
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 1090654857580
      // 041: lxor
      // 042: lstore 10
      // 044: dup2
      // 045: ldc2_w 15910856738904
      // 048: lxor
      // 049: lstore 12
      // 04b: dup2
      // 04c: ldc2_w 67929910891618
      // 04f: lxor
      // 050: lstore 14
      // 052: pop2
      // 053: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 056: iload 4
      // 058: aload 5
      // 05a: aload 6
      // 05c: aload 7
      // 05e: bipush 4
      // 05f: anewarray 4
      // 062: dup_x1
      // 063: swap
      // 064: bipush 3
      // 065: swap
      // 066: aastore
      // 067: dup_x1
      // 068: swap
      // 069: bipush 2
      // 06a: swap
      // 06b: aastore
      // 06c: dup_x1
      // 06d: swap
      // 06e: bipush 1
      // 06f: swap
      // 070: aastore
      // 071: dup_x1
      // 072: swap
      // 073: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 076: bipush 0
      // 077: swap
      // 078: aastore
      // 079: invokestatic rip/breeze/inject/Util139.calculate_15 ([Ljava/lang/Object;)I
      // 07c: istore 16
      // 07e: istore 17
      // 080: aload 0
      // 081: iload 16
      // 083: bipush 1
      // 084: anewarray 4
      // 087: dup_x1
      // 088: swap
      // 089: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08c: bipush 0
      // 08d: swap
      // 08e: aastore
      // 08f: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 092: astore 18
      // 094: aload 18
      // 096: ifnull 175
      // 099: aload 18
      // 09b: iload 17
      // 09d: lload 2
      // 09e: lconst_0
      // 09f: lcmp
      // 0a0: ifle 0a8
      // 0a3: ifne 223
      // 0a6: iload 17
      // 0a8: ifne 16e
      // 0ab: goto 0b2
      // 0ae: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b1: athrow
      // 0b2: lload 2
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: iflt 16b
      // 0b8: getfield rip/breeze/inject/BreezeClass2.ç I
      // 0bb: iload 4
      // 0bd: if_icmpne 169
      // 0c0: goto 0c7
      // 0c3: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c6: athrow
      // 0c7: aload 18
      // 0c9: iload 17
      // 0cb: ifne 16e
      // 0ce: goto 0d5
      // 0d1: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d4: athrow
      // 0d5: lload 2
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: iflt 16b
      // 0db: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 0de: iload 16
      // 0e0: if_icmpne 169
      // 0e3: goto 0ea
      // 0e6: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e9: athrow
      // 0ea: aload 18
      // 0ec: iload 17
      // 0ee: ifne 16e
      // 0f1: goto 0f8
      // 0f4: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f7: athrow
      // 0f8: lload 2
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: iflt 16b
      // 0fe: getfield rip/breeze/inject/BreezeClass2.æ Ljava/lang/String;
      // 101: aload 5
      // 103: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 106: ifeq 169
      // 109: goto 110
      // 10c: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10f: athrow
      // 110: aload 18
      // 112: iload 17
      // 114: ifne 16e
      // 117: goto 11e
      // 11a: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11d: athrow
      // 11e: lload 2
      // 11f: lconst_0
      // 120: lcmp
      // 121: iflt 16b
      // 124: getfield rip/breeze/inject/BreezeClass2.å Ljava/lang/String;
      // 127: aload 6
      // 129: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 12c: ifeq 169
      // 12f: goto 136
      // 132: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 135: athrow
      // 136: lload 2
      // 137: lconst_0
      // 138: lcmp
      // 139: iflt 170
      // 13c: aload 18
      // 13e: iload 17
      // 140: ifne 16e
      // 143: goto 14a
      // 146: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 149: athrow
      // 14a: lload 2
      // 14b: lconst_0
      // 14c: lcmp
      // 14d: iflt 16b
      // 150: getfield rip/breeze/inject/BreezeClass2.ä Ljava/lang/String;
      // 153: aload 7
      // 155: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 158: ifeq 169
      // 15b: goto 162
      // 15e: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 161: athrow
      // 162: aload 18
      // 164: areturn
      // 165: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 168: athrow
      // 169: aload 18
      // 16b: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 16e: astore 18
      // 170: iload 17
      // 172: ifeq 094
      // 175: aload 0
      // 176: getfield rip/breeze/inject/Util139.ð_ø Lrip/breeze/inject/ð;
      // 179: iload 4
      // 17b: aload 0
      // 17c: aload 5
      // 17e: lload 8
      // 180: bipush 2
      // 181: anewarray 4
      // 184: dup_x2
      // 185: dup_x2
      // 186: pop
      // 187: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18a: bipush 1
      // 18b: swap
      // 18c: aastore
      // 18d: dup_x1
      // 18e: swap
      // 18f: bipush 0
      // 190: swap
      // 191: aastore
      // 192: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 195: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 198: aload 0
      // 199: aload 6
      // 19b: lload 10
      // 19d: aload 7
      // 19f: bipush 3
      // 1a0: anewarray 4
      // 1a3: dup_x1
      // 1a4: swap
      // 1a5: bipush 2
      // 1a6: swap
      // 1a7: aastore
      // 1a8: dup_x2
      // 1a9: dup_x2
      // 1aa: pop
      // 1ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ae: bipush 1
      // 1af: swap
      // 1b0: aastore
      // 1b1: dup_x1
      // 1b2: swap
      // 1b3: bipush 0
      // 1b4: swap
      // 1b5: aastore
      // 1b6: invokevirtual rip/breeze/inject/Util139.calculate_5 ([Ljava/lang/Object;)I
      // 1b9: lload 12
      // 1bb: dup2_x1
      // 1bc: pop2
      // 1bd: bipush 4
      // 1be: anewarray 4
      // 1c1: dup_x1
      // 1c2: swap
      // 1c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c6: bipush 3
      // 1c7: swap
      // 1c8: aastore
      // 1c9: dup_x2
      // 1ca: dup_x2
      // 1cb: pop
      // 1cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cf: bipush 2
      // 1d0: swap
      // 1d1: aastore
      // 1d2: dup_x1
      // 1d3: swap
      // 1d4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d7: bipush 1
      // 1d8: swap
      // 1d9: aastore
      // 1da: dup_x1
      // 1db: swap
      // 1dc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1df: bipush 0
      // 1e0: swap
      // 1e1: aastore
      // 1e2: invokevirtual rip/breeze/inject/ð.method_008 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1e5: pop
      // 1e6: lload 2
      // 1e7: lconst_0
      // 1e8: lcmp
      // 1e9: ifle 099
      // 1ec: aload 0
      // 1ed: new rip/breeze/inject/BreezeClass2
      // 1f0: dup
      // 1f1: aload 0
      // 1f2: dup
      // 1f3: getfield rip/breeze/inject/Util139.int_ù I
      // 1f6: dup_x1
      // 1f7: bipush 1
      // 1f8: iadd
      // 1f9: putfield rip/breeze/inject/Util139.int_ù I
      // 1fc: iload 4
      // 1fe: aload 5
      // 200: aload 6
      // 202: aload 7
      // 204: lconst_0
      // 205: iload 16
      // 207: invokespecial rip/breeze/inject/BreezeClass2.<init> (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V
      // 20a: lload 14
      // 20c: dup2_x1
      // 20d: pop2
      // 20e: bipush 2
      // 20f: anewarray 4
      // 212: dup_x1
      // 213: swap
      // 214: bipush 1
      // 215: swap
      // 216: aastore
      // 217: dup_x2
      // 218: dup_x2
      // 219: pop
      // 21a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21d: bipush 0
      // 21e: swap
      // 21f: aastore
      // 220: invokevirtual rip/breeze/inject/Util139.getBreezeClass2_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 223: areturn
      // try (96 -> 105): 106 java/lang/IllegalArgumentException
      // try (103 -> 115): 116 java/lang/IllegalArgumentException
      // try (108 -> 121): 122 java/lang/IllegalArgumentException
      // try (118 -> 131): 132 java/lang/IllegalArgumentException
      // try (124 -> 137): 138 java/lang/IllegalArgumentException
      // try (134 -> 148): 149 java/lang/IllegalArgumentException
      // try (140 -> 154): 155 java/lang/IllegalArgumentException
      // try (151 -> 165): 166 java/lang/IllegalArgumentException
      // try (157 -> 175): 176 java/lang/IllegalArgumentException
      // try (168 -> 186): 187 java/lang/IllegalArgumentException
      // try (178 -> 191): 191 java/lang/IllegalArgumentException
   }

   private void invoke_20(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      String var4 = (String)var1[2];
      String var5 = (String)var1[3];
      String var6 = (String)var1[4];
      this.calculate_4(new Object[]{new BreezeClass2(var2, var3, var4, var5, var6, 0L, calculate_15(new Object[]{var3, var4, var5, var6}))});
   }

   BreezeClass3 getBreezeClass3_5(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = 138480426251030L ^ var2;
      long var5 = var2 ^ 21504151749260L;
      Object[] var10005 = new Object[]{null, var4, var5};
      var10005[0] = 8;
      return this.getBreezeClass3_19(var10005);
   }

   BreezeClass3 getBreezeClass3_6(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      var3 = 138480426251030L ^ var3;
      long var5 = var3 ^ 91460986664276L;
      Object[] var10005 = new Object[]{null, null, var2};
      var10005[1] = var5;
      var10005[0] = 3;
      return this.getBreezeClass3_8(var10005);
   }

   BreezeClass3 getBreezeClass3_7(Object[] var1) {
      long var2 = (Long)var1[0];
      float var4 = (Float)var1[1];
      var2 = 138480426251030L ^ var2;
      long var5 = var2 ^ 40256485882669L;
      Object[] var10005 = new Object[]{null, null, Float.floatToRawIntBits(var4)};
      var10005[1] = var5;
      var10005[0] = 4;
      return this.getBreezeClass3_8(var10005);
   }

   private BreezeClass3 getBreezeClass3_8(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Integer
      // 01b: invokevirtual java/lang/Integer.intValue ()I
      // 01e: istore 5
      // 020: pop
      // 021: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 024: lload 3
      // 025: lxor
      // 026: lstore 3
      // 027: lload 3
      // 028: dup2
      // 029: ldc2_w 133563481249976
      // 02c: lxor
      // 02d: lstore 6
      // 02f: dup2
      // 030: ldc2_w 75071891901146
      // 033: lxor
      // 034: lstore 8
      // 036: dup2
      // 037: ldc2_w 95133929938571
      // 03a: lxor
      // 03b: lstore 10
      // 03d: pop2
      // 03e: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 041: iload 2
      // 042: iload 5
      // 044: bipush 2
      // 045: anewarray 4
      // 048: dup_x1
      // 049: swap
      // 04a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 04d: bipush 1
      // 04e: swap
      // 04f: aastore
      // 050: dup_x1
      // 051: swap
      // 052: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 055: bipush 0
      // 056: swap
      // 057: aastore
      // 058: invokestatic rip/breeze/inject/Util139.calculate_9 ([Ljava/lang/Object;)I
      // 05b: istore 12
      // 05d: aload 0
      // 05e: iload 12
      // 060: bipush 1
      // 061: anewarray 4
      // 064: dup_x1
      // 065: swap
      // 066: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 069: bipush 0
      // 06a: swap
      // 06b: aastore
      // 06c: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 06f: astore 13
      // 071: istore 14
      // 073: aload 13
      // 075: ifnull 106
      // 078: aload 13
      // 07a: iload 14
      // 07c: lload 3
      // 07d: lconst_0
      // 07e: lcmp
      // 07f: iflt 087
      // 082: ifne 17a
      // 085: iload 14
      // 087: ifne 0ff
      // 08a: goto 091
      // 08d: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 090: athrow
      // 091: lload 3
      // 092: lconst_0
      // 093: lcmp
      // 094: ifle 0fc
      // 097: getfield rip/breeze/inject/BreezeClass2.ç I
      // 09a: iload 2
      // 09b: if_icmpne 0fa
      // 09e: goto 0a5
      // 0a1: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a4: athrow
      // 0a5: aload 13
      // 0a7: iload 14
      // 0a9: ifne 0ff
      // 0ac: goto 0b3
      // 0af: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b2: athrow
      // 0b3: lload 3
      // 0b4: lconst_0
      // 0b5: lcmp
      // 0b6: ifle 0fc
      // 0b9: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 0bc: iload 12
      // 0be: if_icmpne 0fa
      // 0c1: goto 0c8
      // 0c4: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c7: athrow
      // 0c8: lload 3
      // 0c9: lconst_0
      // 0ca: lcmp
      // 0cb: iflt 101
      // 0ce: aload 13
      // 0d0: iload 14
      // 0d2: ifne 0ff
      // 0d5: goto 0dc
      // 0d8: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0db: athrow
      // 0dc: lload 3
      // 0dd: lconst_0
      // 0de: lcmp
      // 0df: ifle 0fc
      // 0e2: getfield rip/breeze/inject/BreezeClass2.ã J
      // 0e5: iload 5
      // 0e7: i2l
      // 0e8: lcmp
      // 0e9: ifne 0fa
      // 0ec: goto 0f3
      // 0ef: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f2: athrow
      // 0f3: aload 13
      // 0f5: areturn
      // 0f6: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f9: athrow
      // 0fa: aload 13
      // 0fc: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 0ff: astore 13
      // 101: iload 14
      // 103: ifeq 073
      // 106: aload 0
      // 107: getfield rip/breeze/inject/Util139.ð_ø Lrip/breeze/inject/ð;
      // 10a: iload 2
      // 10b: lload 6
      // 10d: bipush 2
      // 10e: anewarray 4
      // 111: dup_x2
      // 112: dup_x2
      // 113: pop
      // 114: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 117: bipush 1
      // 118: swap
      // 119: aastore
      // 11a: dup_x1
      // 11b: swap
      // 11c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11f: bipush 0
      // 120: swap
      // 121: aastore
      // 122: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 125: iload 5
      // 127: lload 8
      // 129: bipush 2
      // 12a: anewarray 4
      // 12d: dup_x2
      // 12e: dup_x2
      // 12f: pop
      // 130: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 133: bipush 1
      // 134: swap
      // 135: aastore
      // 136: dup_x1
      // 137: swap
      // 138: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13b: bipush 0
      // 13c: swap
      // 13d: aastore
      // 13e: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 141: pop
      // 142: lload 3
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 078
      // 148: aload 0
      // 149: new rip/breeze/inject/BreezeClass2
      // 14c: dup
      // 14d: aload 0
      // 14e: dup
      // 14f: getfield rip/breeze/inject/Util139.int_ù I
      // 152: dup_x1
      // 153: bipush 1
      // 154: iadd
      // 155: putfield rip/breeze/inject/Util139.int_ù I
      // 158: iload 2
      // 159: iload 5
      // 15b: i2l
      // 15c: iload 12
      // 15e: invokespecial rip/breeze/inject/BreezeClass2.<init> (IIJI)V
      // 161: lload 10
      // 163: dup2_x1
      // 164: pop2
      // 165: bipush 2
      // 166: anewarray 4
      // 169: dup_x1
      // 16a: swap
      // 16b: bipush 1
      // 16c: swap
      // 16d: aastore
      // 16e: dup_x2
      // 16f: dup_x2
      // 170: pop
      // 171: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 174: bipush 0
      // 175: swap
      // 176: aastore
      // 177: invokevirtual rip/breeze/inject/Util139.getBreezeClass2_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 17a: areturn
      // try (72 -> 81): 82 java/lang/IllegalArgumentException
      // try (79 -> 91): 92 java/lang/IllegalArgumentException
      // try (84 -> 97): 98 java/lang/IllegalArgumentException
      // try (94 -> 107): 108 java/lang/IllegalArgumentException
      // try (100 -> 117): 118 java/lang/IllegalArgumentException
      // try (110 -> 129): 130 java/lang/IllegalArgumentException
      // try (120 -> 134): 134 java/lang/IllegalArgumentException
   }

   private void invoke_25(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      long var10005 = var4;
      Object[] var10009 = new Object[]{null, var4};
      var10009[0] = var3;
      this.calculate_4(new Object[]{new BreezeClass2(var2, var3, var10005, calculate_9(var10009))});
   }

   BreezeClass3 getBreezeClass3_9(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = (Long)var1[1];
      var4 = 138480426251030L ^ var4;
      long var6 = var4 ^ 70531675552251L;
      Object[] var10005 = new Object[]{null, null, var2};
      var10005[1] = 5;
      var10005[0] = var6;
      return this.getBreezeClass3_11(var10005);
   }

   BreezeClass3 getBreezeClass3_10(Object[] var1) {
      double var2 = (Double)var1[0];
      long var4 = (Long)var1[1];
      var4 = 138480426251030L ^ var4;
      long var6 = var4 ^ 100169479596986L;
      Object[] var10005 = new Object[]{null, null, Double.doubleToRawLongBits(var2)};
      var10005[1] = 6;
      var10005[0] = var6;
      return this.getBreezeClass3_11(var10005);
   }

   private BreezeClass3 getBreezeClass3_11(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Long
      // 01c: invokevirtual java/lang/Long.longValue ()J
      // 01f: lstore 5
      // 021: pop
      // 022: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 025: lload 2
      // 026: lxor
      // 027: lstore 2
      // 028: lload 2
      // 029: dup2
      // 02a: ldc2_w 96628174110119
      // 02d: lxor
      // 02e: lstore 7
      // 030: dup2
      // 031: ldc2_w 102132084076457
      // 034: lxor
      // 035: lstore 9
      // 037: dup2
      // 038: ldc2_w 132071523449748
      // 03b: lxor
      // 03c: lstore 11
      // 03e: pop2
      // 03f: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 042: iload 4
      // 044: lload 5
      // 046: bipush 2
      // 047: anewarray 4
      // 04a: dup_x2
      // 04b: dup_x2
      // 04c: pop
      // 04d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 050: bipush 1
      // 051: swap
      // 052: aastore
      // 053: dup_x1
      // 054: swap
      // 055: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 058: bipush 0
      // 059: swap
      // 05a: aastore
      // 05b: invokestatic rip/breeze/inject/Util139.calculate_10 ([Ljava/lang/Object;)I
      // 05e: istore 13
      // 060: aload 0
      // 061: iload 13
      // 063: bipush 1
      // 064: anewarray 4
      // 067: dup_x1
      // 068: swap
      // 069: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06c: bipush 0
      // 06d: swap
      // 06e: aastore
      // 06f: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 072: astore 14
      // 074: istore 15
      // 076: aload 14
      // 078: ifnull 0fd
      // 07b: aload 14
      // 07d: iload 15
      // 07f: ifeq 0f6
      // 082: getfield rip/breeze/inject/BreezeClass2.ç I
      // 085: iload 15
      // 087: ifeq 107
      // 08a: goto 091
      // 08d: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 090: athrow
      // 091: iload 4
      // 093: if_icmpne 0f1
      // 096: goto 09d
      // 099: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09c: athrow
      // 09d: aload 14
      // 09f: iload 15
      // 0a1: ifeq 0f6
      // 0a4: goto 0ab
      // 0a7: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0aa: athrow
      // 0ab: lload 2
      // 0ac: lconst_0
      // 0ad: lcmp
      // 0ae: iflt 0f3
      // 0b1: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 0b4: iload 13
      // 0b6: if_icmpne 0f1
      // 0b9: goto 0c0
      // 0bc: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bf: athrow
      // 0c0: lload 2
      // 0c1: lconst_0
      // 0c2: lcmp
      // 0c3: iflt 0f8
      // 0c6: aload 14
      // 0c8: iload 15
      // 0ca: ifeq 0f6
      // 0cd: goto 0d4
      // 0d0: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d3: athrow
      // 0d4: lload 2
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: iflt 0f3
      // 0da: getfield rip/breeze/inject/BreezeClass2.ã J
      // 0dd: lload 5
      // 0df: lcmp
      // 0e0: ifne 0f1
      // 0e3: goto 0ea
      // 0e6: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e9: athrow
      // 0ea: aload 14
      // 0ec: areturn
      // 0ed: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f0: athrow
      // 0f1: aload 14
      // 0f3: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 0f6: astore 14
      // 0f8: iload 15
      // 0fa: ifne 076
      // 0fd: lload 2
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: iflt 07b
      // 103: aload 0
      // 104: getfield rip/breeze/inject/Util139.int_ù I
      // 107: istore 16
      // 109: aload 0
      // 10a: getfield rip/breeze/inject/Util139.ð_ø Lrip/breeze/inject/ð;
      // 10d: iload 4
      // 10f: lload 7
      // 111: bipush 2
      // 112: anewarray 4
      // 115: dup_x2
      // 116: dup_x2
      // 117: pop
      // 118: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11b: bipush 1
      // 11c: swap
      // 11d: aastore
      // 11e: dup_x1
      // 11f: swap
      // 120: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 123: bipush 0
      // 124: swap
      // 125: aastore
      // 126: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 129: lload 5
      // 12b: lload 9
      // 12d: bipush 2
      // 12e: anewarray 4
      // 131: dup_x2
      // 132: dup_x2
      // 133: pop
      // 134: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 137: bipush 1
      // 138: swap
      // 139: aastore
      // 13a: dup_x2
      // 13b: dup_x2
      // 13c: pop
      // 13d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 140: bipush 0
      // 141: swap
      // 142: aastore
      // 143: invokevirtual rip/breeze/inject/ð.method_009 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 146: pop
      // 147: aload 0
      // 148: dup
      // 149: getfield rip/breeze/inject/Util139.int_ù I
      // 14c: bipush 2
      // 14d: iadd
      // 14e: putfield rip/breeze/inject/Util139.int_ù I
      // 151: aload 0
      // 152: new rip/breeze/inject/BreezeClass2
      // 155: dup
      // 156: iload 16
      // 158: iload 4
      // 15a: lload 5
      // 15c: iload 13
      // 15e: invokespecial rip/breeze/inject/BreezeClass2.<init> (IIJI)V
      // 161: lload 11
      // 163: dup2_x1
      // 164: pop2
      // 165: bipush 2
      // 166: anewarray 4
      // 169: dup_x1
      // 16a: swap
      // 16b: bipush 1
      // 16c: swap
      // 16d: aastore
      // 16e: dup_x2
      // 16f: dup_x2
      // 170: pop
      // 171: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 174: bipush 0
      // 175: swap
      // 176: aastore
      // 177: invokevirtual rip/breeze/inject/Util139.getBreezeClass2_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 17a: areturn
      // try (73 -> 79): 80 java/lang/IllegalArgumentException
      // try (76 -> 84): 85 java/lang/IllegalArgumentException
      // try (82 -> 90): 91 java/lang/IllegalArgumentException
      // try (87 -> 100): 101 java/lang/IllegalArgumentException
      // try (93 -> 110): 111 java/lang/IllegalArgumentException
      // try (103 -> 121): 122 java/lang/IllegalArgumentException
      // try (113 -> 126): 126 java/lang/IllegalArgumentException
   }

   private void invoke_29(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      long var4 = (Long)var1[2];
      Object[] var10009 = new Object[]{null, var4};
      var10009[0] = var3;
      this.calculate_4(new Object[]{new BreezeClass2(var2, var3, var4, calculate_10(var10009))});
   }

   int calculate_5(Object[] param1) {
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
      // 015: checkcast java/lang/String
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 126955013001762
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 107537038854602
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 71226239241752
      // 034: lxor
      // 035: lstore 10
      // 037: pop2
      // 038: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 03b: bipush 12
      // 03d: istore 12
      // 03f: bipush 12
      // 041: aload 2
      // 042: aload 5
      // 044: bipush 3
      // 045: anewarray 4
      // 048: dup_x1
      // 049: swap
      // 04a: bipush 2
      // 04b: swap
      // 04c: aastore
      // 04d: dup_x1
      // 04e: swap
      // 04f: bipush 1
      // 050: swap
      // 051: aastore
      // 052: dup_x1
      // 053: swap
      // 054: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 057: bipush 0
      // 058: swap
      // 059: aastore
      // 05a: invokestatic rip/breeze/inject/Util139.calculate_13 ([Ljava/lang/Object;)I
      // 05d: istore 13
      // 05f: istore 14
      // 061: aload 0
      // 062: iload 13
      // 064: bipush 1
      // 065: anewarray 4
      // 068: dup_x1
      // 069: swap
      // 06a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06d: bipush 0
      // 06e: swap
      // 06f: aastore
      // 070: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 073: astore 15
      // 075: aload 15
      // 077: ifnull 126
      // 07a: aload 15
      // 07c: iload 14
      // 07e: ifeq 11f
      // 081: getfield rip/breeze/inject/BreezeClass2.ç I
      // 084: iload 14
      // 086: ifeq 1c8
      // 089: goto 090
      // 08c: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08f: athrow
      // 090: bipush 12
      // 092: if_icmpne 11a
      // 095: goto 09c
      // 098: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09b: athrow
      // 09c: aload 15
      // 09e: iload 14
      // 0a0: ifeq 11f
      // 0a3: goto 0aa
      // 0a6: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a9: athrow
      // 0aa: lload 3
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: iflt 11c
      // 0b0: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 0b3: iload 13
      // 0b5: if_icmpne 11a
      // 0b8: goto 0bf
      // 0bb: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0be: athrow
      // 0bf: aload 15
      // 0c1: iload 14
      // 0c3: ifeq 11f
      // 0c6: goto 0cd
      // 0c9: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cc: athrow
      // 0cd: lload 3
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: ifle 11c
      // 0d3: getfield rip/breeze/inject/BreezeClass2.å Ljava/lang/String;
      // 0d6: aload 2
      // 0d7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0da: ifeq 11a
      // 0dd: goto 0e4
      // 0e0: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e3: athrow
      // 0e4: lload 3
      // 0e5: lconst_0
      // 0e6: lcmp
      // 0e7: iflt 121
      // 0ea: aload 15
      // 0ec: iload 14
      // 0ee: ifeq 11f
      // 0f1: goto 0f8
      // 0f4: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f7: athrow
      // 0f8: lload 3
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: iflt 11c
      // 0fe: getfield rip/breeze/inject/BreezeClass2.ä Ljava/lang/String;
      // 101: aload 5
      // 103: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 106: ifeq 11a
      // 109: goto 110
      // 10c: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10f: athrow
      // 110: aload 15
      // 112: getfield rip/breeze/inject/BreezeClass2.è I
      // 115: ireturn
      // 116: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 119: athrow
      // 11a: aload 15
      // 11c: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 11f: astore 15
      // 121: iload 14
      // 123: ifne 075
      // 126: aload 0
      // 127: getfield rip/breeze/inject/Util139.ð_ø Lrip/breeze/inject/ð;
      // 12a: bipush 12
      // 12c: aload 0
      // 12d: lload 8
      // 12f: aload 2
      // 130: bipush 2
      // 131: anewarray 4
      // 134: dup_x1
      // 135: swap
      // 136: bipush 1
      // 137: swap
      // 138: aastore
      // 139: dup_x2
      // 13a: dup_x2
      // 13b: pop
      // 13c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13f: bipush 0
      // 140: swap
      // 141: aastore
      // 142: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 145: aload 0
      // 146: lload 8
      // 148: aload 5
      // 14a: bipush 2
      // 14b: anewarray 4
      // 14e: dup_x1
      // 14f: swap
      // 150: bipush 1
      // 151: swap
      // 152: aastore
      // 153: dup_x2
      // 154: dup_x2
      // 155: pop
      // 156: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 159: bipush 0
      // 15a: swap
      // 15b: aastore
      // 15c: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 15f: lload 6
      // 161: dup2_x1
      // 162: pop2
      // 163: bipush 4
      // 164: anewarray 4
      // 167: dup_x1
      // 168: swap
      // 169: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 16c: bipush 3
      // 16d: swap
      // 16e: aastore
      // 16f: dup_x2
      // 170: dup_x2
      // 171: pop
      // 172: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 175: bipush 2
      // 176: swap
      // 177: aastore
      // 178: dup_x1
      // 179: swap
      // 17a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 17d: bipush 1
      // 17e: swap
      // 17f: aastore
      // 180: dup_x1
      // 181: swap
      // 182: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 185: bipush 0
      // 186: swap
      // 187: aastore
      // 188: invokevirtual rip/breeze/inject/ð.method_008 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 18b: pop
      // 18c: aload 0
      // 18d: new rip/breeze/inject/BreezeClass2
      // 190: dup
      // 191: aload 0
      // 192: dup
      // 193: getfield rip/breeze/inject/Util139.int_ù I
      // 196: dup_x1
      // 197: bipush 1
      // 198: iadd
      // 199: putfield rip/breeze/inject/Util139.int_ù I
      // 19c: bipush 12
      // 19e: aload 2
      // 19f: aload 5
      // 1a1: iload 13
      // 1a3: invokespecial rip/breeze/inject/BreezeClass2.<init> (IILjava/lang/String;Ljava/lang/String;I)V
      // 1a6: lload 10
      // 1a8: dup2_x1
      // 1a9: pop2
      // 1aa: bipush 2
      // 1ab: anewarray 4
      // 1ae: dup_x1
      // 1af: swap
      // 1b0: bipush 1
      // 1b1: swap
      // 1b2: aastore
      // 1b3: dup_x2
      // 1b4: dup_x2
      // 1b5: pop
      // 1b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b9: bipush 0
      // 1ba: swap
      // 1bb: aastore
      // 1bc: invokevirtual rip/breeze/inject/Util139.getBreezeClass2_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 1bf: lload 3
      // 1c0: lconst_0
      // 1c1: lcmp
      // 1c2: iflt 07c
      // 1c5: getfield rip/breeze/inject/BreezeClass2.è I
      // 1c8: ireturn
      // try (77 -> 83): 84 java/lang/IllegalArgumentException
      // try (80 -> 88): 89 java/lang/IllegalArgumentException
      // try (86 -> 94): 95 java/lang/IllegalArgumentException
      // try (91 -> 104): 105 java/lang/IllegalArgumentException
      // try (97 -> 110): 111 java/lang/IllegalArgumentException
      // try (107 -> 121): 122 java/lang/IllegalArgumentException
      // try (113 -> 131): 132 java/lang/IllegalArgumentException
      // try (124 -> 142): 143 java/lang/IllegalArgumentException
      // try (134 -> 148): 148 java/lang/IllegalArgumentException
   }

   private void invoke_31(Object[] var1) {
      int var2 = (Integer)var1[0];
      String var3 = (String)var1[1];
      String var4 = (String)var1[2];
      byte var5 = 12;
      this.calculate_4(new Object[]{new BreezeClass2(var2, 12, var3, var4, calculate_13(new Object[]{12, var3, var4}))});
   }

   int calculate_6(Object[] param1) {
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
      // 014: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 11605641173434
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 126476098614007
      // 026: lxor
      // 027: lstore 7
      // 029: dup2
      // 02a: ldc2_w 102221046707396
      // 02d: lxor
      // 02e: lstore 9
      // 030: pop2
      // 031: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 034: bipush 1
      // 035: aload 4
      // 037: bipush 2
      // 038: anewarray 4
      // 03b: dup_x1
      // 03c: swap
      // 03d: bipush 1
      // 03e: swap
      // 03f: aastore
      // 040: dup_x1
      // 041: swap
      // 042: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 045: bipush 0
      // 046: swap
      // 047: aastore
      // 048: invokestatic rip/breeze/inject/Util139.calculate_11 ([Ljava/lang/Object;)I
      // 04b: istore 11
      // 04d: istore 12
      // 04f: aload 0
      // 050: iload 11
      // 052: bipush 1
      // 053: anewarray 4
      // 056: dup_x1
      // 057: swap
      // 058: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05b: bipush 0
      // 05c: swap
      // 05d: aastore
      // 05e: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 061: astore 13
      // 063: aload 13
      // 065: ifnull 0ee
      // 068: aload 13
      // 06a: iload 12
      // 06c: ifeq 0e7
      // 06f: getfield rip/breeze/inject/BreezeClass2.ç I
      // 072: iload 12
      // 074: ifeq 161
      // 077: goto 07e
      // 07a: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07d: athrow
      // 07e: bipush 1
      // 07f: if_icmpne 0e2
      // 082: goto 089
      // 085: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 088: athrow
      // 089: aload 13
      // 08b: iload 12
      // 08d: ifeq 0e7
      // 090: goto 097
      // 093: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 096: athrow
      // 097: lload 2
      // 098: lconst_0
      // 099: lcmp
      // 09a: ifle 0e4
      // 09d: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 0a0: iload 11
      // 0a2: if_icmpne 0e2
      // 0a5: goto 0ac
      // 0a8: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ab: athrow
      // 0ac: lload 2
      // 0ad: lconst_0
      // 0ae: lcmp
      // 0af: ifle 0e9
      // 0b2: aload 13
      // 0b4: iload 12
      // 0b6: ifeq 0e7
      // 0b9: goto 0c0
      // 0bc: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bf: athrow
      // 0c0: lload 2
      // 0c1: lconst_0
      // 0c2: lcmp
      // 0c3: iflt 0e4
      // 0c6: getfield rip/breeze/inject/BreezeClass2.ä Ljava/lang/String;
      // 0c9: aload 4
      // 0cb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ce: ifeq 0e2
      // 0d1: goto 0d8
      // 0d4: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d7: athrow
      // 0d8: aload 13
      // 0da: getfield rip/breeze/inject/BreezeClass2.è I
      // 0dd: ireturn
      // 0de: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e1: athrow
      // 0e2: aload 13
      // 0e4: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 0e7: astore 13
      // 0e9: iload 12
      // 0eb: ifne 063
      // 0ee: aload 0
      // 0ef: getfield rip/breeze/inject/Util139.ð_ø Lrip/breeze/inject/ð;
      // 0f2: bipush 1
      // 0f3: lload 7
      // 0f5: bipush 2
      // 0f6: anewarray 4
      // 0f9: dup_x2
      // 0fa: dup_x2
      // 0fb: pop
      // 0fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ff: bipush 1
      // 100: swap
      // 101: aastore
      // 102: dup_x1
      // 103: swap
      // 104: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 107: bipush 0
      // 108: swap
      // 109: aastore
      // 10a: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 10d: lload 5
      // 10f: aload 4
      // 111: bipush 2
      // 112: anewarray 4
      // 115: dup_x1
      // 116: swap
      // 117: bipush 1
      // 118: swap
      // 119: aastore
      // 11a: dup_x2
      // 11b: dup_x2
      // 11c: pop
      // 11d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 120: bipush 0
      // 121: swap
      // 122: aastore
      // 123: invokevirtual rip/breeze/inject/ð.method_010 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 126: pop
      // 127: aload 0
      // 128: new rip/breeze/inject/BreezeClass2
      // 12b: dup
      // 12c: aload 0
      // 12d: dup
      // 12e: getfield rip/breeze/inject/Util139.int_ù I
      // 131: dup_x1
      // 132: bipush 1
      // 133: iadd
      // 134: putfield rip/breeze/inject/Util139.int_ù I
      // 137: bipush 1
      // 138: aload 4
      // 13a: iload 11
      // 13c: invokespecial rip/breeze/inject/BreezeClass2.<init> (IILjava/lang/String;I)V
      // 13f: lload 9
      // 141: dup2_x1
      // 142: pop2
      // 143: bipush 2
      // 144: anewarray 4
      // 147: dup_x1
      // 148: swap
      // 149: bipush 1
      // 14a: swap
      // 14b: aastore
      // 14c: dup_x2
      // 14d: dup_x2
      // 14e: pop
      // 14f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 152: bipush 0
      // 153: swap
      // 154: aastore
      // 155: invokevirtual rip/breeze/inject/Util139.getBreezeClass2_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 158: lload 2
      // 159: lconst_0
      // 15a: lcmp
      // 15b: ifle 06a
      // 15e: getfield rip/breeze/inject/BreezeClass2.è I
      // 161: ireturn
      // try (64 -> 70): 71 java/lang/IllegalArgumentException
      // try (67 -> 75): 76 java/lang/IllegalArgumentException
      // try (73 -> 81): 82 java/lang/IllegalArgumentException
      // try (78 -> 91): 92 java/lang/IllegalArgumentException
      // try (84 -> 101): 102 java/lang/IllegalArgumentException
      // try (94 -> 112): 113 java/lang/IllegalArgumentException
      // try (104 -> 118): 118 java/lang/IllegalArgumentException
   }

   private void invoke_33(Object[] var1) {
      int var2 = (Integer)var1[0];
      String var3 = (String)var1[1];
      this.calculate_4(new Object[]{new BreezeClass2(var2, 1, var3, calculate_11(new Object[]{1, var3}))});
   }

   BreezeClass3 getBreezeClass3_12(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/String
      // 01c: astore 5
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/String
      // 024: astore 6
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast java/lang/String
      // 02c: astore 7
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/lang/Boolean
      // 034: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 037: istore 8
      // 039: pop
      // 03a: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 03d: lload 2
      // 03e: lxor
      // 03f: lstore 2
      // 040: lload 2
      // 041: dup2
      // 042: ldc2_w 106643859492250
      // 045: lxor
      // 046: lstore 9
      // 048: dup2
      // 049: ldc2_w 137170400462862
      // 04c: lxor
      // 04d: lstore 11
      // 04f: dup2
      // 050: ldc2_w 82099193348637
      // 053: lxor
      // 054: lstore 13
      // 056: dup2
      // 057: ldc2_w 83372418715452
      // 05a: lxor
      // 05b: lstore 15
      // 05d: dup2
      // 05e: ldc2_w 115000944782001
      // 061: lxor
      // 062: lstore 17
      // 064: pop2
      // 065: bipush 15
      // 067: istore 19
      // 069: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 06c: lload 9
      // 06e: iload 4
      // 070: iload 8
      // 072: bipush 3
      // 073: anewarray 4
      // 076: dup_x1
      // 077: swap
      // 078: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 07b: bipush 2
      // 07c: swap
      // 07d: aastore
      // 07e: dup_x1
      // 07f: swap
      // 080: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 083: bipush 1
      // 084: swap
      // 085: aastore
      // 086: dup_x2
      // 087: dup_x2
      // 088: pop
      // 089: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08c: bipush 0
      // 08d: swap
      // 08e: aastore
      // 08f: invokestatic rip/breeze/inject/Util139.getValue_5 ([Ljava/lang/Object;)I
      // 092: istore 20
      // 094: bipush 15
      // 096: aload 5
      // 098: aload 6
      // 09a: aload 7
      // 09c: iload 20
      // 09e: bipush 5
      // 09f: anewarray 4
      // 0a2: dup_x1
      // 0a3: swap
      // 0a4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a7: bipush 4
      // 0a8: swap
      // 0a9: aastore
      // 0aa: dup_x1
      // 0ab: swap
      // 0ac: bipush 3
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x1
      // 0b0: swap
      // 0b1: bipush 2
      // 0b2: swap
      // 0b3: aastore
      // 0b4: dup_x1
      // 0b5: swap
      // 0b6: bipush 1
      // 0b7: swap
      // 0b8: aastore
      // 0b9: dup_x1
      // 0ba: swap
      // 0bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0be: bipush 0
      // 0bf: swap
      // 0c0: aastore
      // 0c1: invokestatic rip/breeze/inject/Util139.calculate_16 ([Ljava/lang/Object;)I
      // 0c4: istore 21
      // 0c6: istore 22
      // 0c8: aload 0
      // 0c9: iload 21
      // 0cb: bipush 1
      // 0cc: anewarray 4
      // 0cf: dup_x1
      // 0d0: swap
      // 0d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d4: bipush 0
      // 0d5: swap
      // 0d6: aastore
      // 0d7: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 0da: astore 23
      // 0dc: aload 23
      // 0de: ifnull 1dc
      // 0e1: aload 23
      // 0e3: iload 22
      // 0e5: ifne 1d5
      // 0e8: getfield rip/breeze/inject/BreezeClass2.ç I
      // 0eb: bipush 15
      // 0ed: lload 2
      // 0ee: lconst_0
      // 0ef: lcmp
      // 0f0: iflt 1e5
      // 0f3: iload 22
      // 0f5: ifne 1e5
      // 0f8: goto 0ff
      // 0fb: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fe: athrow
      // 0ff: if_icmpne 1d0
      // 102: goto 109
      // 105: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 108: athrow
      // 109: aload 23
      // 10b: iload 22
      // 10d: ifne 1d5
      // 110: goto 117
      // 113: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 116: athrow
      // 117: lload 2
      // 118: lconst_0
      // 119: lcmp
      // 11a: iflt 1d2
      // 11d: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 120: iload 21
      // 122: if_icmpne 1d0
      // 125: goto 12c
      // 128: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12b: athrow
      // 12c: aload 23
      // 12e: iload 22
      // 130: ifne 1d5
      // 133: goto 13a
      // 136: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 139: athrow
      // 13a: lload 2
      // 13b: lconst_0
      // 13c: lcmp
      // 13d: iflt 1d2
      // 140: getfield rip/breeze/inject/BreezeClass2.ã J
      // 143: iload 20
      // 145: i2l
      // 146: lcmp
      // 147: ifne 1d0
      // 14a: goto 151
      // 14d: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 150: athrow
      // 151: aload 23
      // 153: iload 22
      // 155: ifne 1d5
      // 158: goto 15f
      // 15b: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15e: athrow
      // 15f: lload 2
      // 160: lconst_0
      // 161: lcmp
      // 162: ifle 1d2
      // 165: getfield rip/breeze/inject/BreezeClass2.æ Ljava/lang/String;
      // 168: aload 5
      // 16a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16d: ifeq 1d0
      // 170: goto 177
      // 173: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 176: athrow
      // 177: aload 23
      // 179: iload 22
      // 17b: ifne 1d5
      // 17e: goto 185
      // 181: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 184: athrow
      // 185: lload 2
      // 186: lconst_0
      // 187: lcmp
      // 188: ifle 1d2
      // 18b: getfield rip/breeze/inject/BreezeClass2.å Ljava/lang/String;
      // 18e: aload 6
      // 190: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 193: ifeq 1d0
      // 196: goto 19d
      // 199: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19c: athrow
      // 19d: lload 2
      // 19e: lconst_0
      // 19f: lcmp
      // 1a0: iflt 1d7
      // 1a3: aload 23
      // 1a5: iload 22
      // 1a7: ifne 1d5
      // 1aa: goto 1b1
      // 1ad: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b0: athrow
      // 1b1: lload 2
      // 1b2: lconst_0
      // 1b3: lcmp
      // 1b4: ifle 1d2
      // 1b7: getfield rip/breeze/inject/BreezeClass2.ä Ljava/lang/String;
      // 1ba: aload 7
      // 1bc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1bf: ifeq 1d0
      // 1c2: goto 1c9
      // 1c5: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c8: athrow
      // 1c9: aload 23
      // 1cb: areturn
      // 1cc: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1cf: athrow
      // 1d0: aload 23
      // 1d2: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 1d5: astore 23
      // 1d7: iload 22
      // 1d9: ifeq 0dc
      // 1dc: iload 4
      // 1de: lload 2
      // 1df: lconst_0
      // 1e0: lcmp
      // 1e1: ifle 1d9
      // 1e4: bipush 4
      // 1e5: if_icmpgt 258
      // 1e8: aload 0
      // 1e9: lload 2
      // 1ea: lconst_0
      // 1eb: lcmp
      // 1ec: ifle 2c8
      // 1ef: getfield rip/breeze/inject/Util139.ð_ø Lrip/breeze/inject/ð;
      // 1f2: bipush 15
      // 1f4: iload 4
      // 1f6: aload 0
      // 1f7: aload 5
      // 1f9: lload 15
      // 1fb: aload 6
      // 1fd: aload 7
      // 1ff: bipush 4
      // 200: anewarray 4
      // 203: dup_x1
      // 204: swap
      // 205: bipush 3
      // 206: swap
      // 207: aastore
      // 208: dup_x1
      // 209: swap
      // 20a: bipush 2
      // 20b: swap
      // 20c: aastore
      // 20d: dup_x2
      // 20e: dup_x2
      // 20f: pop
      // 210: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 213: bipush 1
      // 214: swap
      // 215: aastore
      // 216: dup_x1
      // 217: swap
      // 218: bipush 0
      // 219: swap
      // 21a: aastore
      // 21b: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_3 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 21e: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 221: lload 11
      // 223: bipush 4
      // 224: anewarray 4
      // 227: dup_x2
      // 228: dup_x2
      // 229: pop
      // 22a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22d: bipush 3
      // 22e: swap
      // 22f: aastore
      // 230: dup_x1
      // 231: swap
      // 232: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 235: bipush 2
      // 236: swap
      // 237: aastore
      // 238: dup_x1
      // 239: swap
      // 23a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 23d: bipush 1
      // 23e: swap
      // 23f: aastore
      // 240: dup_x1
      // 241: swap
      // 242: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 245: bipush 0
      // 246: swap
      // 247: aastore
      // 248: invokevirtual rip/breeze/inject/ð.method_006 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 24b: pop
      // 24c: iload 22
      // 24e: ifeq 2c7
      // 251: goto 258
      // 254: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 257: athrow
      // 258: aload 0
      // 259: getfield rip/breeze/inject/Util139.ð_ø Lrip/breeze/inject/ð;
      // 25c: bipush 15
      // 25e: iload 4
      // 260: aload 0
      // 261: aload 5
      // 263: lload 13
      // 265: aload 6
      // 267: aload 7
      // 269: iload 8
      // 26b: bipush 5
      // 26c: anewarray 4
      // 26f: dup_x1
      // 270: swap
      // 271: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 274: bipush 4
      // 275: swap
      // 276: aastore
      // 277: dup_x1
      // 278: swap
      // 279: bipush 3
      // 27a: swap
      // 27b: aastore
      // 27c: dup_x1
      // 27d: swap
      // 27e: bipush 2
      // 27f: swap
      // 280: aastore
      // 281: dup_x2
      // 282: dup_x2
      // 283: pop
      // 284: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 287: bipush 1
      // 288: swap
      // 289: aastore
      // 28a: dup_x1
      // 28b: swap
      // 28c: bipush 0
      // 28d: swap
      // 28e: aastore
      // 28f: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_4 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 292: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 295: lload 11
      // 297: bipush 4
      // 298: anewarray 4
      // 29b: dup_x2
      // 29c: dup_x2
      // 29d: pop
      // 29e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a1: bipush 3
      // 2a2: swap
      // 2a3: aastore
      // 2a4: dup_x1
      // 2a5: swap
      // 2a6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2a9: bipush 2
      // 2aa: swap
      // 2ab: aastore
      // 2ac: dup_x1
      // 2ad: swap
      // 2ae: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2b1: bipush 1
      // 2b2: swap
      // 2b3: aastore
      // 2b4: dup_x1
      // 2b5: swap
      // 2b6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2b9: bipush 0
      // 2ba: swap
      // 2bb: aastore
      // 2bc: invokevirtual rip/breeze/inject/ð.method_006 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 2bf: pop
      // 2c0: goto 2c7
      // 2c3: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c6: athrow
      // 2c7: aload 0
      // 2c8: new rip/breeze/inject/BreezeClass2
      // 2cb: dup
      // 2cc: aload 0
      // 2cd: dup
      // 2ce: getfield rip/breeze/inject/Util139.int_ù I
      // 2d1: dup_x1
      // 2d2: bipush 1
      // 2d3: iadd
      // 2d4: putfield rip/breeze/inject/Util139.int_ù I
      // 2d7: bipush 15
      // 2d9: aload 5
      // 2db: aload 6
      // 2dd: aload 7
      // 2df: iload 20
      // 2e1: i2l
      // 2e2: iload 21
      // 2e4: invokespecial rip/breeze/inject/BreezeClass2.<init> (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V
      // 2e7: lload 17
      // 2e9: dup2_x1
      // 2ea: pop2
      // 2eb: bipush 2
      // 2ec: anewarray 4
      // 2ef: dup_x1
      // 2f0: swap
      // 2f1: bipush 1
      // 2f2: swap
      // 2f3: aastore
      // 2f4: dup_x2
      // 2f5: dup_x2
      // 2f6: pop
      // 2f7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2fa: bipush 0
      // 2fb: swap
      // 2fc: aastore
      // 2fd: invokevirtual rip/breeze/inject/Util139.getBreezeClass2_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 300: areturn
      // try (141 -> 152): 153 java/lang/IllegalArgumentException
      // try (144 -> 156): 157 java/lang/IllegalArgumentException
      // try (155 -> 162): 163 java/lang/IllegalArgumentException
      // try (159 -> 172): 173 java/lang/IllegalArgumentException
      // try (165 -> 178): 179 java/lang/IllegalArgumentException
      // try (175 -> 190): 191 java/lang/IllegalArgumentException
      // try (181 -> 196): 197 java/lang/IllegalArgumentException
      // try (193 -> 207): 208 java/lang/IllegalArgumentException
      // try (199 -> 213): 214 java/lang/IllegalArgumentException
      // try (210 -> 224): 225 java/lang/IllegalArgumentException
      // try (216 -> 234): 235 java/lang/IllegalArgumentException
      // try (227 -> 245): 246 java/lang/IllegalArgumentException
      // try (237 -> 250): 250 java/lang/IllegalArgumentException
      // try (263 -> 335): 336 java/lang/IllegalArgumentException
      // try (264 -> 410): 411 java/lang/IllegalArgumentException
   }

   private void invoke_35(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      int var5 = (Integer)var1[2];
      String var6 = (String)var1[3];
      String var7 = (String)var1[4];
      String var8 = (String)var1[5];
      boolean var9 = (Boolean)var1[6];
      var3 = 138480426251030L ^ var3;
      long var10 = var3 ^ 139780158507371L;
      byte var12 = 15;
      Object[] var10004 = new Object[]{null, null, var9};
      var10004[1] = var5;
      var10004[0] = var10;
      int var13 = getValue_5(var10004);
      Object[] var10006 = new Object[]{null, var6, var7, var8, var13};
      var10006[0] = 15;
      int var14 = calculate_16(var10006);
      this.calculate_4(new Object[]{new BreezeClass2(var2, 15, var6, var7, var8, var13, var14)});
   }

   private static int getValue_5(Object[] param0) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 3
      // 15: dup
      // 16: bipush 2
      // 17: aaload
      // 18: checkcast java/lang/Boolean
      // 1b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1e: istore 4
      // 20: pop
      // 21: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 24: lload 1
      // 25: lxor
      // 26: lstore 1
      // 27: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 2a: istore 5
      // 2c: iload 3
      // 2d: iload 5
      // 2f: ifeq 5f
      // 32: bipush 4
      // 33: if_icmple 5e
      // 36: goto 3d
      // 39: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c: athrow
      // 3d: iload 4
      // 3f: iload 5
      // 41: ifeq 5f
      // 44: goto 4b
      // 47: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: ifeq 5e
      // 4e: goto 55
      // 51: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 54: athrow
      // 55: iload 3
      // 56: bipush 8
      // 58: ishl
      // 59: ireturn
      // 5a: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d: athrow
      // 5e: iload 3
      // 5f: ireturn
      // try (26 -> 31): 32 java/lang/IllegalArgumentException
      // try (29 -> 37): 38 java/lang/IllegalArgumentException
      // try (34 -> 41): 42 java/lang/IllegalArgumentException
      // try (40 -> 48): 48 java/lang/IllegalArgumentException
   }

   BreezeClass3 getBreezeClass3_13(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = 138480426251030L ^ var2;
      long var5 = var2 ^ 61955571159300L;
      Object[] var10005 = new Object[]{null, var4, var5};
      var10005[0] = 16;
      return this.getBreezeClass3_19(var10005);
   }

   BreezeClass3 getBreezeClass3_14(Object... var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      º var6 = (º)var1[3];
      Object[] var7 = (Object[])var1[4];
      var4 = 138480426251030L ^ var4;
      long var8 = var4 ^ 83533799106144L;
      long var10 = var4 ^ 41914353609403L;
      BreezeClass3 var12 = this.getBreezeClass3_20(var8, var6, var7);
      Object[] var10007 = new Object[]{null, null, var2, var3, var12.int_è};
      var10007[1] = var10;
      var10007[0] = 17;
      return this.getBreezeClass3_16(var10007);
   }

   BreezeClass3 getBreezeClass3_15(Object... var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      º var6 = (º)var1[3];
      Object[] var7 = (Object[])var1[4];
      var3 = 138480426251030L ^ var3;
      long var8 = var3 ^ 34092941861634L;
      long var10 = var3 ^ 126332871913433L;
      BreezeClass3 var12 = this.getBreezeClass3_20(var8, var6, var7);
      Object[] var10007 = new Object[]{null, null, var2, var5, var12.int_è};
      var10007[1] = var10;
      var10007[0] = 18;
      return this.getBreezeClass3_16(var10007);
   }

   private BreezeClass3 getBreezeClass3_16(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/String
      // 01b: astore 5
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/String
      // 023: astore 6
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast java/lang/Integer
      // 02b: invokevirtual java/lang/Integer.intValue ()I
      // 02e: istore 7
      // 030: pop
      // 031: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 034: lload 3
      // 035: lxor
      // 036: lstore 3
      // 037: lload 3
      // 038: dup2
      // 039: ldc2_w 82053881057225
      // 03c: lxor
      // 03d: lstore 8
      // 03f: dup2
      // 040: ldc2_w 74929202556669
      // 043: lxor
      // 044: lstore 10
      // 046: dup2
      // 047: ldc2_w 131483750888135
      // 04a: lxor
      // 04b: lstore 12
      // 04d: pop2
      // 04e: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 051: iload 2
      // 052: aload 5
      // 054: aload 6
      // 056: iload 7
      // 058: bipush 4
      // 059: anewarray 4
      // 05c: dup_x1
      // 05d: swap
      // 05e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 061: bipush 3
      // 062: swap
      // 063: aastore
      // 064: dup_x1
      // 065: swap
      // 066: bipush 2
      // 067: swap
      // 068: aastore
      // 069: dup_x1
      // 06a: swap
      // 06b: bipush 1
      // 06c: swap
      // 06d: aastore
      // 06e: dup_x1
      // 06f: swap
      // 070: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 073: bipush 0
      // 074: swap
      // 075: aastore
      // 076: invokestatic rip/breeze/inject/Util139.calculate_14 ([Ljava/lang/Object;)I
      // 079: istore 14
      // 07b: istore 15
      // 07d: aload 0
      // 07e: iload 14
      // 080: bipush 1
      // 081: anewarray 4
      // 084: dup_x1
      // 085: swap
      // 086: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 089: bipush 0
      // 08a: swap
      // 08b: aastore
      // 08c: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 08f: astore 16
      // 091: aload 16
      // 093: ifnull 170
      // 096: aload 16
      // 098: iload 15
      // 09a: lload 3
      // 09b: lconst_0
      // 09c: lcmp
      // 09d: ifle 0a5
      // 0a0: ifne 202
      // 0a3: iload 15
      // 0a5: ifne 169
      // 0a8: goto 0af
      // 0ab: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ae: athrow
      // 0af: lload 3
      // 0b0: lconst_0
      // 0b1: lcmp
      // 0b2: ifle 166
      // 0b5: getfield rip/breeze/inject/BreezeClass2.ç I
      // 0b8: iload 2
      // 0b9: if_icmpne 164
      // 0bc: goto 0c3
      // 0bf: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: aload 16
      // 0c5: iload 15
      // 0c7: ifne 169
      // 0ca: goto 0d1
      // 0cd: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d0: athrow
      // 0d1: lload 3
      // 0d2: lconst_0
      // 0d3: lcmp
      // 0d4: iflt 166
      // 0d7: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 0da: iload 14
      // 0dc: if_icmpne 164
      // 0df: goto 0e6
      // 0e2: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e5: athrow
      // 0e6: aload 16
      // 0e8: iload 15
      // 0ea: ifne 169
      // 0ed: goto 0f4
      // 0f0: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f3: athrow
      // 0f4: lload 3
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: ifle 166
      // 0fa: getfield rip/breeze/inject/BreezeClass2.ã J
      // 0fd: iload 7
      // 0ff: i2l
      // 100: lcmp
      // 101: ifne 164
      // 104: goto 10b
      // 107: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10a: athrow
      // 10b: aload 16
      // 10d: iload 15
      // 10f: ifne 169
      // 112: goto 119
      // 115: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 118: athrow
      // 119: lload 3
      // 11a: lconst_0
      // 11b: lcmp
      // 11c: ifle 166
      // 11f: getfield rip/breeze/inject/BreezeClass2.å Ljava/lang/String;
      // 122: aload 5
      // 124: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 127: ifeq 164
      // 12a: goto 131
      // 12d: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 130: athrow
      // 131: lload 3
      // 132: lconst_0
      // 133: lcmp
      // 134: ifle 16b
      // 137: aload 16
      // 139: iload 15
      // 13b: ifne 169
      // 13e: goto 145
      // 141: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 144: athrow
      // 145: lload 3
      // 146: lconst_0
      // 147: lcmp
      // 148: iflt 166
      // 14b: getfield rip/breeze/inject/BreezeClass2.ä Ljava/lang/String;
      // 14e: aload 6
      // 150: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 153: ifeq 164
      // 156: goto 15d
      // 159: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15c: athrow
      // 15d: aload 16
      // 15f: areturn
      // 160: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 163: athrow
      // 164: aload 16
      // 166: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 169: astore 16
      // 16b: iload 15
      // 16d: ifeq 091
      // 170: aload 0
      // 171: getfield rip/breeze/inject/Util139.ð_ø Lrip/breeze/inject/ð;
      // 174: iload 2
      // 175: iload 7
      // 177: aload 0
      // 178: aload 5
      // 17a: lload 8
      // 17c: aload 6
      // 17e: bipush 3
      // 17f: anewarray 4
      // 182: dup_x1
      // 183: swap
      // 184: bipush 2
      // 185: swap
      // 186: aastore
      // 187: dup_x2
      // 188: dup_x2
      // 189: pop
      // 18a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18d: bipush 1
      // 18e: swap
      // 18f: aastore
      // 190: dup_x1
      // 191: swap
      // 192: bipush 0
      // 193: swap
      // 194: aastore
      // 195: invokevirtual rip/breeze/inject/Util139.calculate_5 ([Ljava/lang/Object;)I
      // 198: lload 10
      // 19a: dup2_x1
      // 19b: pop2
      // 19c: bipush 4
      // 19d: anewarray 4
      // 1a0: dup_x1
      // 1a1: swap
      // 1a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a5: bipush 3
      // 1a6: swap
      // 1a7: aastore
      // 1a8: dup_x2
      // 1a9: dup_x2
      // 1aa: pop
      // 1ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ae: bipush 2
      // 1af: swap
      // 1b0: aastore
      // 1b1: dup_x1
      // 1b2: swap
      // 1b3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b6: bipush 1
      // 1b7: swap
      // 1b8: aastore
      // 1b9: dup_x1
      // 1ba: swap
      // 1bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1be: bipush 0
      // 1bf: swap
      // 1c0: aastore
      // 1c1: invokevirtual rip/breeze/inject/ð.method_008 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1c4: pop
      // 1c5: lload 3
      // 1c6: lconst_0
      // 1c7: lcmp
      // 1c8: ifle 096
      // 1cb: aload 0
      // 1cc: new rip/breeze/inject/BreezeClass2
      // 1cf: dup
      // 1d0: aload 0
      // 1d1: dup
      // 1d2: getfield rip/breeze/inject/Util139.int_ù I
      // 1d5: dup_x1
      // 1d6: bipush 1
      // 1d7: iadd
      // 1d8: putfield rip/breeze/inject/Util139.int_ù I
      // 1db: iload 2
      // 1dc: aconst_null
      // 1dd: aload 5
      // 1df: aload 6
      // 1e1: iload 7
      // 1e3: i2l
      // 1e4: iload 14
      // 1e6: invokespecial rip/breeze/inject/BreezeClass2.<init> (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V
      // 1e9: lload 12
      // 1eb: dup2_x1
      // 1ec: pop2
      // 1ed: bipush 2
      // 1ee: anewarray 4
      // 1f1: dup_x1
      // 1f2: swap
      // 1f3: bipush 1
      // 1f4: swap
      // 1f5: aastore
      // 1f6: dup_x2
      // 1f7: dup_x2
      // 1f8: pop
      // 1f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fc: bipush 0
      // 1fd: swap
      // 1fe: aastore
      // 1ff: invokevirtual rip/breeze/inject/Util139.getBreezeClass2_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 202: areturn
      // try (94 -> 103): 104 java/lang/IllegalArgumentException
      // try (101 -> 113): 114 java/lang/IllegalArgumentException
      // try (106 -> 119): 120 java/lang/IllegalArgumentException
      // try (116 -> 129): 130 java/lang/IllegalArgumentException
      // try (122 -> 135): 136 java/lang/IllegalArgumentException
      // try (132 -> 147): 148 java/lang/IllegalArgumentException
      // try (138 -> 153): 154 java/lang/IllegalArgumentException
      // try (150 -> 164): 165 java/lang/IllegalArgumentException
      // try (156 -> 174): 175 java/lang/IllegalArgumentException
      // try (167 -> 185): 186 java/lang/IllegalArgumentException
      // try (177 -> 190): 190 java/lang/IllegalArgumentException
   }

   private void invoke_41(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      String var4 = (String)var1[2];
      String var5 = (String)var1[3];
      int var6 = (Integer)var1[4];
      Object[] var10005 = new Object[]{null, var4, var5, var6};
      var10005[0] = var2;
      int var7 = calculate_14(var10005);
      this.calculate_4(new Object[]{new BreezeClass2(var3, var2, null, var4, var5, var6, var7)});
   }

   BreezeClass3 getBreezeClass3_17(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = 138480426251030L ^ var2;
      long var5 = var2 ^ 4562611894132L;
      Object[] var10005 = new Object[]{null, var4, var5};
      var10005[0] = 19;
      return this.getBreezeClass3_19(var10005);
   }

   BreezeClass3 getBreezeClass3_18(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = 138480426251030L ^ var3;
      long var5 = var3 ^ 17936339740577L;
      Object[] var10005 = new Object[]{null, var2, var5};
      var10005[0] = 20;
      return this.getBreezeClass3_19(var10005);
   }

   private BreezeClass3 getBreezeClass3_19(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: pop
      // 01e: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 021: lload 4
      // 023: lxor
      // 024: lstore 4
      // 026: lload 4
      // 028: dup2
      // 029: ldc2_w 24136498133388
      // 02c: lxor
      // 02d: lstore 6
      // 02f: dup2
      // 030: ldc2_w 49737547129669
      // 033: lxor
      // 034: lstore 8
      // 036: dup2
      // 037: ldc2_w 13426627978391
      // 03a: lxor
      // 03b: lstore 10
      // 03d: pop2
      // 03e: iload 2
      // 03f: aload 3
      // 040: bipush 2
      // 041: anewarray 4
      // 044: dup_x1
      // 045: swap
      // 046: bipush 1
      // 047: swap
      // 048: aastore
      // 049: dup_x1
      // 04a: swap
      // 04b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 04e: bipush 0
      // 04f: swap
      // 050: aastore
      // 051: invokestatic rip/breeze/inject/Util139.calculate_11 ([Ljava/lang/Object;)I
      // 054: istore 12
      // 056: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 059: aload 0
      // 05a: iload 12
      // 05c: bipush 1
      // 05d: anewarray 4
      // 060: dup_x1
      // 061: swap
      // 062: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 065: bipush 0
      // 066: swap
      // 067: aastore
      // 068: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 06b: astore 13
      // 06d: istore 14
      // 06f: aload 13
      // 071: ifnull 107
      // 074: aload 13
      // 076: iload 14
      // 078: lload 4
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: iflt 084
      // 07f: ifne 181
      // 082: iload 14
      // 084: ifne 100
      // 087: goto 08e
      // 08a: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08d: athrow
      // 08e: lload 4
      // 090: lconst_0
      // 091: lcmp
      // 092: iflt 0fd
      // 095: getfield rip/breeze/inject/BreezeClass2.ç I
      // 098: iload 2
      // 099: if_icmpne 0fb
      // 09c: goto 0a3
      // 09f: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a2: athrow
      // 0a3: aload 13
      // 0a5: iload 14
      // 0a7: ifne 100
      // 0aa: goto 0b1
      // 0ad: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b0: athrow
      // 0b1: lload 4
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: ifle 0fd
      // 0b8: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 0bb: iload 12
      // 0bd: if_icmpne 0fb
      // 0c0: goto 0c7
      // 0c3: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c6: athrow
      // 0c7: lload 4
      // 0c9: lconst_0
      // 0ca: lcmp
      // 0cb: iflt 102
      // 0ce: aload 13
      // 0d0: iload 14
      // 0d2: ifne 100
      // 0d5: goto 0dc
      // 0d8: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0db: athrow
      // 0dc: lload 4
      // 0de: lconst_0
      // 0df: lcmp
      // 0e0: ifle 0fd
      // 0e3: getfield rip/breeze/inject/BreezeClass2.ä Ljava/lang/String;
      // 0e6: aload 3
      // 0e7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ea: ifeq 0fb
      // 0ed: goto 0f4
      // 0f0: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f3: athrow
      // 0f4: aload 13
      // 0f6: areturn
      // 0f7: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fa: athrow
      // 0fb: aload 13
      // 0fd: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 100: astore 13
      // 102: iload 14
      // 104: ifeq 06f
      // 107: aload 0
      // 108: getfield rip/breeze/inject/Util139.ð_ø Lrip/breeze/inject/ð;
      // 10b: iload 2
      // 10c: aload 0
      // 10d: lload 8
      // 10f: aload 3
      // 110: bipush 2
      // 111: anewarray 4
      // 114: dup_x1
      // 115: swap
      // 116: bipush 1
      // 117: swap
      // 118: aastore
      // 119: dup_x2
      // 11a: dup_x2
      // 11b: pop
      // 11c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11f: bipush 0
      // 120: swap
      // 121: aastore
      // 122: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 125: lload 6
      // 127: dup2_x1
      // 128: pop2
      // 129: bipush 3
      // 12a: anewarray 4
      // 12d: dup_x1
      // 12e: swap
      // 12f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 132: bipush 2
      // 133: swap
      // 134: aastore
      // 135: dup_x2
      // 136: dup_x2
      // 137: pop
      // 138: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13b: bipush 1
      // 13c: swap
      // 13d: aastore
      // 13e: dup_x1
      // 13f: swap
      // 140: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 143: bipush 0
      // 144: swap
      // 145: aastore
      // 146: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 149: pop
      // 14a: lload 4
      // 14c: lconst_0
      // 14d: lcmp
      // 14e: ifle 074
      // 151: aload 0
      // 152: new rip/breeze/inject/BreezeClass2
      // 155: dup
      // 156: aload 0
      // 157: dup
      // 158: getfield rip/breeze/inject/Util139.int_ù I
      // 15b: dup_x1
      // 15c: bipush 1
      // 15d: iadd
      // 15e: putfield rip/breeze/inject/Util139.int_ù I
      // 161: iload 2
      // 162: aload 3
      // 163: iload 12
      // 165: invokespecial rip/breeze/inject/BreezeClass2.<init> (IILjava/lang/String;I)V
      // 168: lload 10
      // 16a: dup2_x1
      // 16b: pop2
      // 16c: bipush 2
      // 16d: anewarray 4
      // 170: dup_x1
      // 171: swap
      // 172: bipush 1
      // 173: swap
      // 174: aastore
      // 175: dup_x2
      // 176: dup_x2
      // 177: pop
      // 178: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17b: bipush 0
      // 17c: swap
      // 17d: aastore
      // 17e: invokevirtual rip/breeze/inject/Util139.getBreezeClass2_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 181: areturn
      // try (70 -> 79): 80 java/lang/IllegalArgumentException
      // try (77 -> 89): 90 java/lang/IllegalArgumentException
      // try (82 -> 95): 96 java/lang/IllegalArgumentException
      // try (92 -> 105): 106 java/lang/IllegalArgumentException
      // try (98 -> 115): 116 java/lang/IllegalArgumentException
      // try (108 -> 126): 127 java/lang/IllegalArgumentException
      // try (118 -> 131): 131 java/lang/IllegalArgumentException
   }

   private void invoke_45(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      String var4 = (String)var1[2];
      this.calculate_4(new Object[]{new BreezeClass2(var2, var3, var4, calculate_11(new Object[]{var3, var4}))});
   }

   BreezeClass3 getBreezeClass3_20(Object... param1) {
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
      // 00e: checkcast rip/breeze/inject/º
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast [Ljava/lang/Object;
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 16593487439803
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 76743359314802
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 126521009877890
      // 035: lxor
      // 036: lstore 10
      // 038: dup2
      // 039: ldc2_w 128591884523619
      // 03c: lxor
      // 03d: lstore 12
      // 03f: pop2
      // 040: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 043: aload 0
      // 044: getfield rip/breeze/inject/Util139.ð_õ Lrip/breeze/inject/ð;
      // 047: astore 14
      // 049: istore 15
      // 04b: aload 14
      // 04d: iload 15
      // 04f: ifne 06f
      // 052: ifnonnull 071
      // 055: goto 05c
      // 058: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05b: athrow
      // 05c: aload 0
      // 05d: new rip/breeze/inject/ð
      // 060: dup
      // 061: invokespecial rip/breeze/inject/ð.<init> ()V
      // 064: dup_x1
      // 065: putfield rip/breeze/inject/Util139.ð_õ Lrip/breeze/inject/ð;
      // 068: goto 06f
      // 06b: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06e: athrow
      // 06f: astore 14
      // 071: aload 5
      // 073: arraylength
      // 074: istore 16
      // 076: iload 16
      // 078: newarray 10
      // 07a: astore 17
      // 07c: bipush 0
      // 07d: istore 18
      // 07f: iload 18
      // 081: iload 16
      // 083: if_icmpge 0cb
      // 086: aload 17
      // 088: iload 18
      // 08a: aload 0
      // 08b: aload 5
      // 08d: iload 18
      // 08f: aaload
      // 090: lload 12
      // 092: bipush 2
      // 093: anewarray 4
      // 096: dup_x2
      // 097: dup_x2
      // 098: pop
      // 099: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09c: bipush 1
      // 09d: swap
      // 09e: aastore
      // 09f: dup_x1
      // 0a0: swap
      // 0a1: bipush 0
      // 0a2: swap
      // 0a3: aastore
      // 0a4: invokevirtual rip/breeze/inject/Util139.getBreezeClass3 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 0a7: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 0aa: iastore
      // 0ab: iinc 18 1
      // 0ae: iload 15
      // 0b0: lload 2
      // 0b1: lconst_0
      // 0b2: lcmp
      // 0b3: ifle 174
      // 0b6: ifne 173
      // 0b9: iload 15
      // 0bb: ifeq 07f
      // 0be: lload 2
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: iflt 0ae
      // 0c4: goto 0cb
      // 0c7: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ca: athrow
      // 0cb: aload 14
      // 0cd: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0d0: istore 18
      // 0d2: aload 14
      // 0d4: aload 0
      // 0d5: aload 4
      // 0d7: bipush 0
      // 0d8: anewarray 4
      // 0db: invokevirtual rip/breeze/inject/º.method_001 ([Ljava/lang/Object;)I
      // 0de: lload 6
      // 0e0: dup2_x1
      // 0e1: pop2
      // 0e2: aload 4
      // 0e4: bipush 0
      // 0e5: anewarray 4
      // 0e8: invokevirtual rip/breeze/inject/º.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0eb: aload 4
      // 0ed: bipush 0
      // 0ee: anewarray 4
      // 0f1: invokevirtual rip/breeze/inject/º.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0f4: aload 4
      // 0f6: bipush 0
      // 0f7: anewarray 4
      // 0fa: invokevirtual rip/breeze/inject/º.method_004 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0fd: aload 4
      // 0ff: bipush 0
      // 100: anewarray 4
      // 103: invokevirtual rip/breeze/inject/º.method_005 ([Ljava/lang/Object;)Z
      // 106: bipush 6
      // 108: anewarray 4
      // 10b: dup_x1
      // 10c: swap
      // 10d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 110: bipush 5
      // 111: swap
      // 112: aastore
      // 113: dup_x1
      // 114: swap
      // 115: bipush 4
      // 116: swap
      // 117: aastore
      // 118: dup_x1
      // 119: swap
      // 11a: bipush 3
      // 11b: swap
      // 11c: aastore
      // 11d: dup_x1
      // 11e: swap
      // 11f: bipush 2
      // 120: swap
      // 121: aastore
      // 122: dup_x1
      // 123: swap
      // 124: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 127: bipush 1
      // 128: swap
      // 129: aastore
      // 12a: dup_x2
      // 12b: dup_x2
      // 12c: pop
      // 12d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 130: bipush 0
      // 131: swap
      // 132: aastore
      // 133: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_12 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 136: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 139: lload 8
      // 13b: bipush 2
      // 13c: anewarray 4
      // 13f: dup_x2
      // 140: dup_x2
      // 141: pop
      // 142: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 145: bipush 1
      // 146: swap
      // 147: aastore
      // 148: dup_x1
      // 149: swap
      // 14a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14d: bipush 0
      // 14e: swap
      // 14f: aastore
      // 150: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 153: pop
      // 154: aload 14
      // 156: iload 16
      // 158: lload 8
      // 15a: bipush 2
      // 15b: anewarray 4
      // 15e: dup_x2
      // 15f: dup_x2
      // 160: pop
      // 161: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 164: bipush 1
      // 165: swap
      // 166: aastore
      // 167: dup_x1
      // 168: swap
      // 169: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 16c: bipush 0
      // 16d: swap
      // 16e: aastore
      // 16f: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 172: pop
      // 173: bipush 0
      // 174: istore 19
      // 176: iload 19
      // 178: iload 16
      // 17a: if_icmpge 1bf
      // 17d: aload 14
      // 17f: aload 17
      // 181: iload 19
      // 183: iaload
      // 184: lload 8
      // 186: bipush 2
      // 187: anewarray 4
      // 18a: dup_x2
      // 18b: dup_x2
      // 18c: pop
      // 18d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 190: bipush 1
      // 191: swap
      // 192: aastore
      // 193: dup_x1
      // 194: swap
      // 195: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 198: bipush 0
      // 199: swap
      // 19a: aastore
      // 19b: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 19e: pop
      // 19f: iinc 19 1
      // 1a2: iload 15
      // 1a4: lload 2
      // 1a5: lconst_0
      // 1a6: lcmp
      // 1a7: ifle 1ce
      // 1aa: ifne 1c9
      // 1ad: iload 15
      // 1af: ifeq 176
      // 1b2: lload 2
      // 1b3: lconst_0
      // 1b4: lcmp
      // 1b5: iflt 1a2
      // 1b8: goto 1bf
      // 1bb: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1be: athrow
      // 1bf: aload 14
      // 1c1: getfield rip/breeze/inject/ð.int_þ_2 I
      // 1c4: iload 18
      // 1c6: isub
      // 1c7: istore 19
      // 1c9: aload 4
      // 1cb: invokevirtual rip/breeze/inject/º.hashCode ()I
      // 1ce: istore 20
      // 1d0: aload 5
      // 1d2: astore 21
      // 1d4: aload 21
      // 1d6: arraylength
      // 1d7: istore 22
      // 1d9: bipush 0
      // 1da: istore 23
      // 1dc: iload 23
      // 1de: iload 22
      // 1e0: if_icmpge 214
      // 1e3: aload 21
      // 1e5: iload 23
      // 1e7: aaload
      // 1e8: astore 24
      // 1ea: iload 20
      // 1ec: aload 24
      // 1ee: invokevirtual java/lang/Object.hashCode ()I
      // 1f1: ixor
      // 1f2: istore 20
      // 1f4: iinc 23 1
      // 1f7: iload 15
      // 1f9: lload 2
      // 1fa: lconst_0
      // 1fb: lcmp
      // 1fc: iflt 204
      // 1ff: ifne 21b
      // 202: iload 15
      // 204: ifeq 1dc
      // 207: lload 2
      // 208: lconst_0
      // 209: lcmp
      // 20a: iflt 1f7
      // 20d: goto 214
      // 210: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 213: athrow
      // 214: iload 20
      // 216: ldc 2147483647
      // 218: iand
      // 219: istore 20
      // 21b: aload 0
      // 21c: iload 18
      // 21e: iload 19
      // 220: iload 20
      // 222: lload 10
      // 224: bipush 4
      // 225: anewarray 4
      // 228: dup_x2
      // 229: dup_x2
      // 22a: pop
      // 22b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22e: bipush 3
      // 22f: swap
      // 230: aastore
      // 231: dup_x1
      // 232: swap
      // 233: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 236: bipush 2
      // 237: swap
      // 238: aastore
      // 239: dup_x1
      // 23a: swap
      // 23b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 23e: bipush 1
      // 23f: swap
      // 240: aastore
      // 241: dup_x1
      // 242: swap
      // 243: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 246: bipush 0
      // 247: swap
      // 248: aastore
      // 249: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_21 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 24c: areturn
      // try (45 -> 49): 50 java/lang/IllegalArgumentException
      // try (48 -> 58): 59 java/lang/IllegalArgumentException
      // try (73 -> 106): 111 java/lang/IllegalArgumentException
      // try (222 -> 253): 258 java/lang/IllegalArgumentException
      // try (287 -> 296): 301 java/lang/IllegalArgumentException
   }

   private BreezeClass3 getBreezeClass3_21(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Integer
      // 01b: invokevirtual java/lang/Integer.intValue ()I
      // 01e: istore 4
      // 020: dup
      // 021: bipush 3
      // 022: aaload
      // 023: checkcast java/lang/Long
      // 026: invokevirtual java/lang/Long.longValue ()J
      // 029: lstore 5
      // 02b: pop
      // 02c: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 02f: lload 5
      // 031: lxor
      // 032: lstore 5
      // 034: lload 5
      // 036: dup2
      // 037: ldc2_w 22613829320328
      // 03a: lxor
      // 03b: lstore 7
      // 03d: pop2
      // 03e: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 041: aload 0
      // 042: getfield rip/breeze/inject/Util139.ð_õ Lrip/breeze/inject/ð;
      // 045: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 048: astore 9
      // 04a: aload 0
      // 04b: iload 4
      // 04d: bipush 1
      // 04e: anewarray 4
      // 051: dup_x1
      // 052: swap
      // 053: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 056: bipush 0
      // 057: swap
      // 058: aastore
      // 059: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 05c: astore 10
      // 05e: istore 11
      // 060: aload 10
      // 062: ifnull 135
      // 065: aload 10
      // 067: iload 11
      // 069: lload 5
      // 06b: lconst_0
      // 06c: lcmp
      // 06d: ifle 075
      // 070: ifeq 16e
      // 073: iload 11
      // 075: ifeq 12e
      // 078: goto 07f
      // 07b: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07e: athrow
      // 07f: getfield rip/breeze/inject/BreezeClass2.ç I
      // 082: bipush 64
      // 084: goto 08b
      // 087: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08a: athrow
      // 08b: if_icmpne 129
      // 08e: aload 10
      // 090: iload 11
      // 092: ifeq 12e
      // 095: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 098: iload 4
      // 09a: if_icmpne 129
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: aload 10
      // 0a6: getfield rip/breeze/inject/BreezeClass2.ã J
      // 0a9: l2i
      // 0aa: istore 12
      // 0ac: bipush 1
      // 0ad: istore 13
      // 0af: bipush 0
      // 0b0: istore 14
      // 0b2: iload 14
      // 0b4: iload 3
      // 0b5: if_icmpge 10e
      // 0b8: aload 9
      // 0ba: iload 2
      // 0bb: iload 14
      // 0bd: iadd
      // 0be: baload
      // 0bf: lload 5
      // 0c1: lconst_0
      // 0c2: lcmp
      // 0c3: iflt 0ee
      // 0c6: iload 11
      // 0c8: ifeq 0ea
      // 0cb: aload 9
      // 0cd: iload 12
      // 0cf: iload 14
      // 0d1: iadd
      // 0d2: baload
      // 0d3: iload 11
      // 0d5: ifeq 08b
      // 0d8: lload 5
      // 0da: lconst_0
      // 0db: lcmp
      // 0dc: iflt 084
      // 0df: goto 0e6
      // 0e2: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e5: athrow
      // 0e6: if_icmpeq 0f8
      // 0e9: bipush 0
      // 0ea: istore 13
      // 0ec: iload 11
      // 0ee: lload 5
      // 0f0: lconst_0
      // 0f1: lcmp
      // 0f2: iflt 117
      // 0f5: ifne 10e
      // 0f8: iinc 14 1
      // 0fb: iload 11
      // 0fd: ifne 0b2
      // 100: lload 5
      // 102: lconst_0
      // 103: lcmp
      // 104: iflt 0b8
      // 107: goto 10e
      // 10a: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10d: athrow
      // 10e: lload 5
      // 110: lconst_0
      // 111: lcmp
      // 112: iflt 122
      // 115: iload 13
      // 117: ifeq 129
      // 11a: aload 0
      // 11b: getfield rip/breeze/inject/Util139.ð_õ Lrip/breeze/inject/ð;
      // 11e: iload 2
      // 11f: putfield rip/breeze/inject/ð.int_þ_2 I
      // 122: aload 10
      // 124: areturn
      // 125: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 128: athrow
      // 129: aload 10
      // 12b: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 12e: astore 10
      // 130: iload 11
      // 132: ifne 060
      // 135: lload 5
      // 137: lconst_0
      // 138: lcmp
      // 139: iflt 065
      // 13c: aload 0
      // 13d: new rip/breeze/inject/BreezeClass2
      // 140: dup
      // 141: aload 0
      // 142: dup
      // 143: getfield rip/breeze/inject/Util139.int_ö I
      // 146: dup_x1
      // 147: bipush 1
      // 148: iadd
      // 149: putfield rip/breeze/inject/Util139.int_ö I
      // 14c: bipush 64
      // 14e: iload 2
      // 14f: i2l
      // 150: iload 4
      // 152: invokespecial rip/breeze/inject/BreezeClass2.<init> (IIJI)V
      // 155: lload 7
      // 157: dup2_x1
      // 158: pop2
      // 159: bipush 2
      // 15a: anewarray 4
      // 15d: dup_x1
      // 15e: swap
      // 15f: bipush 1
      // 160: swap
      // 161: aastore
      // 162: dup_x2
      // 163: dup_x2
      // 164: pop
      // 165: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 168: bipush 0
      // 169: swap
      // 16a: aastore
      // 16b: invokevirtual rip/breeze/inject/Util139.getBreezeClass2_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 16e: areturn
      // try (56 -> 65): 66 java/lang/IllegalArgumentException
      // try (63 -> 70): 71 java/lang/IllegalArgumentException
      // try (74 -> 80): 81 java/lang/IllegalArgumentException
      // try (94 -> 112): 117 java/lang/IllegalArgumentException
      // try (122 -> 131): 136 java/lang/IllegalArgumentException
      // try (138 -> 150): 150 java/lang/IllegalArgumentException
   }

   BreezeClass3 getBreezeClass3_22(Object[] var1) {
      int var2 = (Integer)var1[0];
      return this.arr_ó[var2];
   }

   ª getª(Object[] var1) {
      int var2 = (Integer)var1[0];
      return this.arr_ñ[(int)this.arr_ó[var2].ã].ª_þ;
   }

   int getValue_6(Object[] param1) {
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
      // 014: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 84653937443153
      // 01f: lxor
      // 020: lstore 5
      // 022: pop2
      // 023: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 026: sipush 128
      // 029: aload 4
      // 02b: bipush 2
      // 02c: anewarray 4
      // 02f: dup_x1
      // 030: swap
      // 031: bipush 1
      // 032: swap
      // 033: aastore
      // 034: dup_x1
      // 035: swap
      // 036: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 039: bipush 0
      // 03a: swap
      // 03b: aastore
      // 03c: invokestatic rip/breeze/inject/Util139.calculate_11 ([Ljava/lang/Object;)I
      // 03f: istore 7
      // 041: istore 8
      // 043: aload 0
      // 044: iload 7
      // 046: bipush 1
      // 047: anewarray 4
      // 04a: dup_x1
      // 04b: swap
      // 04c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 04f: bipush 0
      // 050: swap
      // 051: aastore
      // 052: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 055: astore 9
      // 057: aload 9
      // 059: ifnull 0e4
      // 05c: aload 9
      // 05e: iload 8
      // 060: ifne 0dd
      // 063: getfield rip/breeze/inject/BreezeClass2.ç I
      // 066: iload 8
      // 068: ifne 116
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 071: athrow
      // 072: sipush 128
      // 075: if_icmpne 0d8
      // 078: goto 07f
      // 07b: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07e: athrow
      // 07f: aload 9
      // 081: iload 8
      // 083: ifne 0dd
      // 086: goto 08d
      // 089: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08c: athrow
      // 08d: lload 2
      // 08e: lconst_0
      // 08f: lcmp
      // 090: iflt 0da
      // 093: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 096: iload 7
      // 098: if_icmpne 0d8
      // 09b: goto 0a2
      // 09e: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a1: athrow
      // 0a2: lload 2
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: ifle 0df
      // 0a8: aload 9
      // 0aa: iload 8
      // 0ac: ifne 0dd
      // 0af: goto 0b6
      // 0b2: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b5: athrow
      // 0b6: lload 2
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: iflt 0da
      // 0bc: getfield rip/breeze/inject/BreezeClass2.ä Ljava/lang/String;
      // 0bf: aload 4
      // 0c1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c4: ifeq 0d8
      // 0c7: goto 0ce
      // 0ca: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cd: athrow
      // 0ce: aload 9
      // 0d0: getfield rip/breeze/inject/BreezeClass2.è I
      // 0d3: ireturn
      // 0d4: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d7: athrow
      // 0d8: aload 9
      // 0da: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 0dd: astore 9
      // 0df: iload 8
      // 0e1: ifeq 057
      // 0e4: lload 2
      // 0e5: lconst_0
      // 0e6: lcmp
      // 0e7: iflt 05c
      // 0ea: aload 0
      // 0eb: new rip/breeze/inject/BreezeClass2
      // 0ee: dup
      // 0ef: aload 0
      // 0f0: getfield rip/breeze/inject/Util139.int_ô I
      // 0f3: sipush 128
      // 0f6: aload 4
      // 0f8: iload 7
      // 0fa: invokespecial rip/breeze/inject/BreezeClass2.<init> (IILjava/lang/String;I)V
      // 0fd: lload 5
      // 0ff: dup2_x1
      // 100: pop2
      // 101: bipush 2
      // 102: anewarray 4
      // 105: dup_x1
      // 106: swap
      // 107: bipush 1
      // 108: swap
      // 109: aastore
      // 10a: dup_x2
      // 10b: dup_x2
      // 10c: pop
      // 10d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 110: bipush 0
      // 111: swap
      // 112: aastore
      // 113: invokevirtual rip/breeze/inject/Util139.calculate_8 ([Ljava/lang/Object;)I
      // 116: ireturn
      // try (56 -> 62): 63 java/lang/IllegalArgumentException
      // try (59 -> 67): 68 java/lang/IllegalArgumentException
      // try (65 -> 73): 74 java/lang/IllegalArgumentException
      // try (70 -> 83): 84 java/lang/IllegalArgumentException
      // try (76 -> 93): 94 java/lang/IllegalArgumentException
      // try (86 -> 104): 105 java/lang/IllegalArgumentException
      // try (96 -> 110): 110 java/lang/IllegalArgumentException
   }

   int getValue_7(Object[] param1) {
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
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: pop
      // 01e: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 021: lload 4
      // 023: lxor
      // 024: lstore 4
      // 026: lload 4
      // 028: dup2
      // 029: ldc2_w 61734629989673
      // 02c: lxor
      // 02d: lstore 6
      // 02f: pop2
      // 030: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 033: sipush 129
      // 036: aload 2
      // 037: iload 3
      // 038: bipush 3
      // 039: anewarray 4
      // 03c: dup_x1
      // 03d: swap
      // 03e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 041: bipush 2
      // 042: swap
      // 043: aastore
      // 044: dup_x1
      // 045: swap
      // 046: bipush 1
      // 047: swap
      // 048: aastore
      // 049: dup_x1
      // 04a: swap
      // 04b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 04e: bipush 0
      // 04f: swap
      // 050: aastore
      // 051: invokestatic rip/breeze/inject/Util139.calculate_12 ([Ljava/lang/Object;)I
      // 054: istore 8
      // 056: aload 0
      // 057: iload 8
      // 059: bipush 1
      // 05a: anewarray 4
      // 05d: dup_x1
      // 05e: swap
      // 05f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 062: bipush 0
      // 063: swap
      // 064: aastore
      // 065: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 068: astore 9
      // 06a: istore 10
      // 06c: aload 9
      // 06e: ifnull 120
      // 071: aload 9
      // 073: iload 10
      // 075: ifeq 119
      // 078: getfield rip/breeze/inject/BreezeClass2.ç I
      // 07b: iload 10
      // 07d: ifeq 154
      // 080: goto 087
      // 083: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 086: athrow
      // 087: sipush 129
      // 08a: if_icmpne 114
      // 08d: goto 094
      // 090: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 093: athrow
      // 094: aload 9
      // 096: iload 10
      // 098: ifeq 119
      // 09b: goto 0a2
      // 09e: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a1: athrow
      // 0a2: lload 4
      // 0a4: lconst_0
      // 0a5: lcmp
      // 0a6: ifle 116
      // 0a9: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 0ac: iload 8
      // 0ae: if_icmpne 114
      // 0b1: goto 0b8
      // 0b4: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b7: athrow
      // 0b8: aload 9
      // 0ba: iload 10
      // 0bc: ifeq 119
      // 0bf: goto 0c6
      // 0c2: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c5: athrow
      // 0c6: lload 4
      // 0c8: lconst_0
      // 0c9: lcmp
      // 0ca: ifle 116
      // 0cd: getfield rip/breeze/inject/BreezeClass2.ã J
      // 0d0: iload 3
      // 0d1: i2l
      // 0d2: lcmp
      // 0d3: ifne 114
      // 0d6: goto 0dd
      // 0d9: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0dc: athrow
      // 0dd: lload 4
      // 0df: lconst_0
      // 0e0: lcmp
      // 0e1: ifle 11b
      // 0e4: aload 9
      // 0e6: iload 10
      // 0e8: ifeq 119
      // 0eb: goto 0f2
      // 0ee: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f1: athrow
      // 0f2: lload 4
      // 0f4: lconst_0
      // 0f5: lcmp
      // 0f6: iflt 116
      // 0f9: getfield rip/breeze/inject/BreezeClass2.ä Ljava/lang/String;
      // 0fc: aload 2
      // 0fd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 100: ifeq 114
      // 103: goto 10a
      // 106: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 109: athrow
      // 10a: aload 9
      // 10c: getfield rip/breeze/inject/BreezeClass2.è I
      // 10f: ireturn
      // 110: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 113: athrow
      // 114: aload 9
      // 116: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 119: astore 9
      // 11b: iload 10
      // 11d: ifne 06c
      // 120: lload 4
      // 122: lconst_0
      // 123: lcmp
      // 124: iflt 071
      // 127: aload 0
      // 128: new rip/breeze/inject/BreezeClass2
      // 12b: dup
      // 12c: aload 0
      // 12d: getfield rip/breeze/inject/Util139.int_ô I
      // 130: sipush 129
      // 133: aload 2
      // 134: iload 3
      // 135: i2l
      // 136: iload 8
      // 138: invokespecial rip/breeze/inject/BreezeClass2.<init> (IILjava/lang/String;JI)V
      // 13b: lload 6
      // 13d: dup2_x1
      // 13e: pop2
      // 13f: bipush 2
      // 140: anewarray 4
      // 143: dup_x1
      // 144: swap
      // 145: bipush 1
      // 146: swap
      // 147: aastore
      // 148: dup_x2
      // 149: dup_x2
      // 14a: pop
      // 14b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14e: bipush 0
      // 14f: swap
      // 150: aastore
      // 151: invokevirtual rip/breeze/inject/Util139.calculate_8 ([Ljava/lang/Object;)I
      // 154: ireturn
      // try (69 -> 75): 76 java/lang/IllegalArgumentException
      // try (72 -> 80): 81 java/lang/IllegalArgumentException
      // try (78 -> 86): 87 java/lang/IllegalArgumentException
      // try (83 -> 96): 97 java/lang/IllegalArgumentException
      // try (89 -> 102): 103 java/lang/IllegalArgumentException
      // try (99 -> 114): 115 java/lang/IllegalArgumentException
      // try (105 -> 124): 125 java/lang/IllegalArgumentException
      // try (117 -> 135): 136 java/lang/IllegalArgumentException
      // try (127 -> 141): 141 java/lang/IllegalArgumentException
   }

   int getValue_8(Object[] param1) {
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
      // 00b: checkcast rip/breeze/inject/ª
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 4
      // 01a: pop
      // 01b: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 89069833490400
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 117585393801853
      // 030: lxor
      // 031: lstore 8
      // 033: pop2
      // 034: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 037: aload 0
      // 038: aload 3
      // 039: lload 8
      // 03b: bipush 2
      // 03c: anewarray 4
      // 03f: dup_x2
      // 040: dup_x2
      // 041: pop
      // 042: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 045: bipush 1
      // 046: swap
      // 047: aastore
      // 048: dup_x1
      // 049: swap
      // 04a: bipush 0
      // 04b: swap
      // 04c: aastore
      // 04d: invokevirtual rip/breeze/inject/Util139.getBreezeClass ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass;
      // 050: getfield rip/breeze/inject/BreezeClass.int_ÿ I
      // 053: istore 10
      // 055: sipush 130
      // 058: aload 2
      // 059: iload 10
      // 05b: bipush 3
      // 05c: anewarray 4
      // 05f: dup_x1
      // 060: swap
      // 061: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 064: bipush 2
      // 065: swap
      // 066: aastore
      // 067: dup_x1
      // 068: swap
      // 069: bipush 1
      // 06a: swap
      // 06b: aastore
      // 06c: dup_x1
      // 06d: swap
      // 06e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 071: bipush 0
      // 072: swap
      // 073: aastore
      // 074: invokestatic rip/breeze/inject/Util139.calculate_12 ([Ljava/lang/Object;)I
      // 077: istore 11
      // 079: istore 12
      // 07b: aload 0
      // 07c: iload 11
      // 07e: bipush 1
      // 07f: anewarray 4
      // 082: dup_x1
      // 083: swap
      // 084: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 087: bipush 0
      // 088: swap
      // 089: aastore
      // 08a: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 08d: astore 13
      // 08f: aload 13
      // 091: ifnull 144
      // 094: aload 13
      // 096: iload 12
      // 098: ifne 13d
      // 09b: getfield rip/breeze/inject/BreezeClass2.ç I
      // 09e: iload 12
      // 0a0: ifne 179
      // 0a3: goto 0aa
      // 0a6: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a9: athrow
      // 0aa: sipush 130
      // 0ad: if_icmpne 138
      // 0b0: goto 0b7
      // 0b3: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b6: athrow
      // 0b7: aload 13
      // 0b9: iload 12
      // 0bb: ifne 13d
      // 0be: goto 0c5
      // 0c1: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c4: athrow
      // 0c5: lload 4
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: iflt 13a
      // 0cc: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 0cf: iload 11
      // 0d1: if_icmpne 138
      // 0d4: goto 0db
      // 0d7: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0da: athrow
      // 0db: aload 13
      // 0dd: iload 12
      // 0df: ifne 13d
      // 0e2: goto 0e9
      // 0e5: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e8: athrow
      // 0e9: lload 4
      // 0eb: lconst_0
      // 0ec: lcmp
      // 0ed: iflt 13a
      // 0f0: getfield rip/breeze/inject/BreezeClass2.ã J
      // 0f3: iload 10
      // 0f5: i2l
      // 0f6: lcmp
      // 0f7: ifne 138
      // 0fa: goto 101
      // 0fd: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 100: athrow
      // 101: lload 4
      // 103: lconst_0
      // 104: lcmp
      // 105: ifle 13f
      // 108: aload 13
      // 10a: iload 12
      // 10c: ifne 13d
      // 10f: goto 116
      // 112: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 115: athrow
      // 116: lload 4
      // 118: lconst_0
      // 119: lcmp
      // 11a: ifle 13a
      // 11d: getfield rip/breeze/inject/BreezeClass2.ä Ljava/lang/String;
      // 120: aload 2
      // 121: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 124: ifeq 138
      // 127: goto 12e
      // 12a: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12d: athrow
      // 12e: aload 13
      // 130: getfield rip/breeze/inject/BreezeClass2.è I
      // 133: ireturn
      // 134: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 137: athrow
      // 138: aload 13
      // 13a: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 13d: astore 13
      // 13f: iload 12
      // 141: ifeq 08f
      // 144: lload 4
      // 146: lconst_0
      // 147: lcmp
      // 148: ifle 094
      // 14b: aload 0
      // 14c: new rip/breeze/inject/BreezeClass2
      // 14f: dup
      // 150: aload 0
      // 151: getfield rip/breeze/inject/Util139.int_ô I
      // 154: sipush 130
      // 157: aload 2
      // 158: iload 10
      // 15a: i2l
      // 15b: iload 11
      // 15d: invokespecial rip/breeze/inject/BreezeClass2.<init> (IILjava/lang/String;JI)V
      // 160: lload 6
      // 162: dup2_x1
      // 163: pop2
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
      // 176: invokevirtual rip/breeze/inject/Util139.calculate_8 ([Ljava/lang/Object;)I
      // 179: ireturn
      // try (92 -> 98): 99 java/lang/IllegalArgumentException
      // try (95 -> 103): 104 java/lang/IllegalArgumentException
      // try (101 -> 109): 110 java/lang/IllegalArgumentException
      // try (106 -> 119): 120 java/lang/IllegalArgumentException
      // try (112 -> 125): 126 java/lang/IllegalArgumentException
      // try (122 -> 137): 138 java/lang/IllegalArgumentException
      // try (128 -> 147): 148 java/lang/IllegalArgumentException
      // try (140 -> 158): 159 java/lang/IllegalArgumentException
      // try (150 -> 164): 164 java/lang/IllegalArgumentException
   }

   int calculate_7(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Integer
      // 01c: invokevirtual java/lang/Integer.intValue ()I
      // 01f: istore 5
      // 021: pop
      // 022: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 025: lload 2
      // 026: lxor
      // 027: lstore 2
      // 028: lload 2
      // 029: dup2
      // 02a: ldc2_w 53612093705224
      // 02d: lxor
      // 02e: lstore 6
      // 030: dup2
      // 031: ldc2_w 104249595677858
      // 034: lxor
      // 035: lstore 8
      // 037: dup2
      // 038: ldc2_w 52671689687637
      // 03b: lxor
      // 03c: lstore 10
      // 03e: pop2
      // 03f: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 042: istore 12
      // 044: iload 4
      // 046: iload 12
      // 048: ifne 06a
      // 04b: iload 5
      // 04d: if_icmpge 068
      // 050: goto 057
      // 053: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 056: athrow
      // 057: iload 4
      // 059: i2l
      // 05a: iload 5
      // 05c: i2l
      // 05d: bipush 32
      // 05f: lshl
      // 060: lor
      // 061: goto 072
      // 064: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 067: athrow
      // 068: iload 5
      // 06a: i2l
      // 06b: iload 4
      // 06d: i2l
      // 06e: bipush 32
      // 070: lshl
      // 071: lor
      // 072: lstore 13
      // 074: sipush 131
      // 077: iload 4
      // 079: iload 5
      // 07b: iadd
      // 07c: bipush 2
      // 07d: anewarray 4
      // 080: dup_x1
      // 081: swap
      // 082: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 085: bipush 1
      // 086: swap
      // 087: aastore
      // 088: dup_x1
      // 089: swap
      // 08a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08d: bipush 0
      // 08e: swap
      // 08f: aastore
      // 090: invokestatic rip/breeze/inject/Util139.calculate_9 ([Ljava/lang/Object;)I
      // 093: istore 15
      // 095: aload 0
      // 096: iload 15
      // 098: bipush 1
      // 099: anewarray 4
      // 09c: dup_x1
      // 09d: swap
      // 09e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a1: bipush 0
      // 0a2: swap
      // 0a3: aastore
      // 0a4: invokevirtual rip/breeze/inject/Util139.getBreezeClass2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 0a7: astore 16
      // 0a9: aload 16
      // 0ab: ifnull 140
      // 0ae: aload 16
      // 0b0: iload 12
      // 0b2: lload 2
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: ifle 0bd
      // 0b8: ifne 14d
      // 0bb: iload 12
      // 0bd: ifne 139
      // 0c0: goto 0c7
      // 0c3: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c6: athrow
      // 0c7: lload 2
      // 0c8: lconst_0
      // 0c9: lcmp
      // 0ca: iflt 136
      // 0cd: getfield rip/breeze/inject/BreezeClass2.ç I
      // 0d0: sipush 131
      // 0d3: if_icmpne 134
      // 0d6: goto 0dd
      // 0d9: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0dc: athrow
      // 0dd: aload 16
      // 0df: iload 12
      // 0e1: ifne 139
      // 0e4: goto 0eb
      // 0e7: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ea: athrow
      // 0eb: lload 2
      // 0ec: lconst_0
      // 0ed: lcmp
      // 0ee: iflt 136
      // 0f1: getfield rip/breeze/inject/BreezeClass2.int_á I
      // 0f4: iload 15
      // 0f6: if_icmpne 134
      // 0f9: goto 100
      // 0fc: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ff: athrow
      // 100: lload 2
      // 101: lconst_0
      // 102: lcmp
      // 103: ifle 13b
      // 106: aload 16
      // 108: iload 12
      // 10a: ifne 139
      // 10d: goto 114
      // 110: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 113: athrow
      // 114: lload 2
      // 115: lconst_0
      // 116: lcmp
      // 117: iflt 136
      // 11a: getfield rip/breeze/inject/BreezeClass2.ã J
      // 11d: lload 13
      // 11f: lcmp
      // 120: ifne 134
      // 123: goto 12a
      // 126: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 129: athrow
      // 12a: aload 16
      // 12c: getfield rip/breeze/inject/BreezeClass2.â I
      // 12f: ireturn
      // 130: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 133: athrow
      // 134: aload 16
      // 136: getfield rip/breeze/inject/BreezeClass2.breezeClass2_à Lrip/breeze/inject/BreezeClass2;
      // 139: astore 16
      // 13b: iload 12
      // 13d: ifeq 0a9
      // 140: lload 2
      // 141: lconst_0
      // 142: lcmp
      // 143: iflt 0ae
      // 146: aload 0
      // 147: getfield rip/breeze/inject/Util139.arr_ó [Lrip/breeze/inject/BreezeClass2;
      // 14a: iload 4
      // 14c: aaload
      // 14d: getfield rip/breeze/inject/BreezeClass2.ä Ljava/lang/String;
      // 150: astore 17
      // 152: aload 0
      // 153: getfield rip/breeze/inject/Util139.arr_ó [Lrip/breeze/inject/BreezeClass2;
      // 156: iload 5
      // 158: aaload
      // 159: getfield rip/breeze/inject/BreezeClass2.ä Ljava/lang/String;
      // 15c: astore 18
      // 15e: aload 0
      // 15f: aload 0
      // 160: getfield rip/breeze/inject/Util139.í_ÿ Lrip/breeze/inject/í;
      // 163: aload 17
      // 165: lload 8
      // 167: aload 18
      // 169: bipush 3
      // 16a: anewarray 4
      // 16d: dup_x1
      // 16e: swap
      // 16f: bipush 2
      // 170: swap
      // 171: aastore
      // 172: dup_x2
      // 173: dup_x2
      // 174: pop
      // 175: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 178: bipush 1
      // 179: swap
      // 17a: aastore
      // 17b: dup_x1
      // 17c: swap
      // 17d: bipush 0
      // 17e: swap
      // 17f: aastore
      // 180: invokevirtual rip/breeze/inject/í.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 183: lload 6
      // 185: dup2_x1
      // 186: pop2
      // 187: bipush 2
      // 188: anewarray 4
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
      // 199: invokevirtual rip/breeze/inject/Util139.getValue_6 ([Ljava/lang/Object;)I
      // 19c: istore 19
      // 19e: aload 0
      // 19f: new rip/breeze/inject/BreezeClass2
      // 1a2: dup
      // 1a3: aload 0
      // 1a4: getfield rip/breeze/inject/Util139.int_ô I
      // 1a7: sipush 131
      // 1aa: lload 13
      // 1ac: iload 15
      // 1ae: invokespecial rip/breeze/inject/BreezeClass2.<init> (IIJI)V
      // 1b1: lload 10
      // 1b3: dup2_x1
      // 1b4: pop2
      // 1b5: bipush 2
      // 1b6: anewarray 4
      // 1b9: dup_x1
      // 1ba: swap
      // 1bb: bipush 1
      // 1bc: swap
      // 1bd: aastore
      // 1be: dup_x2
      // 1bf: dup_x2
      // 1c0: pop
      // 1c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c4: bipush 0
      // 1c5: swap
      // 1c6: aastore
      // 1c7: invokevirtual rip/breeze/inject/Util139.getBreezeClass2_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // 1ca: iload 19
      // 1cc: putfield rip/breeze/inject/BreezeClass2.â I
      // 1cf: iload 19
      // 1d1: ireturn
      // try (40 -> 45): 46 java/lang/IllegalArgumentException
      // try (43 -> 56): 56 java/lang/IllegalArgumentException
      // try (100 -> 109): 110 java/lang/IllegalArgumentException
      // try (107 -> 119): 120 java/lang/IllegalArgumentException
      // try (112 -> 125): 126 java/lang/IllegalArgumentException
      // try (122 -> 135): 136 java/lang/IllegalArgumentException
      // try (128 -> 145): 146 java/lang/IllegalArgumentException
      // try (138 -> 156): 157 java/lang/IllegalArgumentException
      // try (148 -> 162): 162 java/lang/IllegalArgumentException
   }

   private int calculate_8(Object[] param1) {
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
      // 0e: checkcast rip/breeze/inject/BreezeClass2
      // 11: astore 4
      // 13: pop
      // 14: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 92200520732428
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 26: istore 7
      // 28: aload 0
      // 29: iload 7
      // 2b: ifeq 4c
      // 2e: getfield rip/breeze/inject/Util139.arr_ó [Lrip/breeze/inject/BreezeClass2;
      // 31: ifnonnull 4b
      // 34: goto 3b
      // 37: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: bipush 16
      // 3e: anewarray 45
      // 41: putfield rip/breeze/inject/Util139.arr_ó [Lrip/breeze/inject/BreezeClass2;
      // 44: goto 4b
      // 47: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield rip/breeze/inject/Util139.int_ô I
      // 4f: iload 7
      // 51: lload 2
      // 52: lconst_0
      // 53: lcmp
      // 54: ifle 5f
      // 57: ifeq ba
      // 5a: aload 0
      // 5b: getfield rip/breeze/inject/Util139.arr_ó [Lrip/breeze/inject/BreezeClass2;
      // 5e: arraylength
      // 5f: if_icmpne 8b
      // 62: goto 69
      // 65: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 68: athrow
      // 69: bipush 2
      // 6a: aload 0
      // 6b: getfield rip/breeze/inject/Util139.arr_ó [Lrip/breeze/inject/BreezeClass2;
      // 6e: arraylength
      // 6f: imul
      // 70: anewarray 45
      // 73: astore 8
      // 75: aload 0
      // 76: getfield rip/breeze/inject/Util139.arr_ó [Lrip/breeze/inject/BreezeClass2;
      // 79: bipush 0
      // 7a: aload 8
      // 7c: bipush 0
      // 7d: aload 0
      // 7e: getfield rip/breeze/inject/Util139.arr_ó [Lrip/breeze/inject/BreezeClass2;
      // 81: arraylength
      // 82: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 85: aload 0
      // 86: aload 8
      // 88: putfield rip/breeze/inject/Util139.arr_ó [Lrip/breeze/inject/BreezeClass2;
      // 8b: aload 0
      // 8c: getfield rip/breeze/inject/Util139.arr_ó [Lrip/breeze/inject/BreezeClass2;
      // 8f: aload 0
      // 90: dup
      // 91: getfield rip/breeze/inject/Util139.int_ô I
      // 94: dup_x1
      // 95: bipush 1
      // 96: iadd
      // 97: putfield rip/breeze/inject/Util139.int_ô I
      // 9a: aload 4
      // 9c: aastore
      // 9d: aload 0
      // 9e: lload 5
      // a0: aload 4
      // a2: bipush 2
      // a3: anewarray 4
      // a6: dup_x1
      // a7: swap
      // a8: bipush 1
      // a9: swap
      // aa: aastore
      // ab: dup_x2
      // ac: dup_x2
      // ad: pop
      // ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b1: bipush 0
      // b2: swap
      // b3: aastore
      // b4: invokevirtual rip/breeze/inject/Util139.getBreezeClass2_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass2;
      // b7: getfield rip/breeze/inject/BreezeClass2.è I
      // ba: ireturn
      // try (25 -> 30): 31 java/lang/IllegalArgumentException
      // try (28 -> 37): 38 java/lang/IllegalArgumentException
      // try (41 -> 52): 53 java/lang/IllegalArgumentException
   }

   private BreezeClass getBreezeClass(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/ª
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic rip/breeze/inject/Util139.138480426251030L J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 01c: istore 5
      // 01e: aload 0
      // 01f: iload 5
      // 021: ifeq 042
      // 024: getfield rip/breeze/inject/Util139.arr_ð [Lrip/breeze/inject/BreezeClass;
      // 027: ifnonnull 04a
      // 02a: goto 031
      // 02d: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 030: athrow
      // 031: aload 0
      // 032: bipush 16
      // 034: anewarray 663
      // 037: putfield rip/breeze/inject/Util139.arr_ð [Lrip/breeze/inject/BreezeClass;
      // 03a: aload 0
      // 03b: goto 042
      // 03e: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 041: athrow
      // 042: bipush 16
      // 044: anewarray 663
      // 047: putfield rip/breeze/inject/Util139.arr_ñ [Lrip/breeze/inject/BreezeClass;
      // 04a: aload 2
      // 04b: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 04e: istore 6
      // 050: aload 0
      // 051: getfield rip/breeze/inject/Util139.arr_ð [Lrip/breeze/inject/BreezeClass;
      // 054: iload 6
      // 056: aload 0
      // 057: getfield rip/breeze/inject/Util139.arr_ð [Lrip/breeze/inject/BreezeClass;
      // 05a: arraylength
      // 05b: irem
      // 05c: aaload
      // 05d: astore 7
      // 05f: aload 7
      // 061: ifnull 09d
      // 064: aload 7
      // 066: iload 5
      // 068: lload 3
      // 069: lconst_0
      // 06a: lcmp
      // 06b: iflt 073
      // 06e: ifeq 0a5
      // 071: iload 5
      // 073: lload 3
      // 074: lconst_0
      // 075: lcmp
      // 076: iflt 0a7
      // 079: ifeq 0a5
      // 07c: goto 083
      // 07f: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 082: athrow
      // 083: getfield rip/breeze/inject/BreezeClass.ª_þ Lrip/breeze/inject/ª;
      // 086: aload 2
      // 087: if_acmpeq 09d
      // 08a: goto 091
      // 08d: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 090: athrow
      // 091: aload 7
      // 093: getfield rip/breeze/inject/BreezeClass.breezeClass_ý Lrip/breeze/inject/BreezeClass;
      // 096: astore 7
      // 098: iload 5
      // 09a: ifne 05f
      // 09d: lload 3
      // 09e: lconst_0
      // 09f: lcmp
      // 0a0: iflt 0b7
      // 0a3: aload 7
      // 0a5: iload 5
      // 0a7: ifeq 0b6
      // 0aa: ifnull 0b7
      // 0ad: goto 0b4
      // 0b0: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b3: athrow
      // 0b4: aload 7
      // 0b6: areturn
      // 0b7: aload 0
      // 0b8: getfield rip/breeze/inject/Util139.int_ò I
      // 0bb: aload 0
      // 0bc: getfield rip/breeze/inject/Util139.arr_ð [Lrip/breeze/inject/BreezeClass;
      // 0bf: arraylength
      // 0c0: bipush 3
      // 0c1: imul
      // 0c2: bipush 4
      // 0c3: idiv
      // 0c4: iload 5
      // 0c6: lload 3
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: ifle 172
      // 0cc: ifeq 170
      // 0cf: if_icmple 167
      // 0d2: goto 0d9
      // 0d5: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: getfield rip/breeze/inject/Util139.arr_ð [Lrip/breeze/inject/BreezeClass;
      // 0dd: arraylength
      // 0de: istore 8
      // 0e0: iload 8
      // 0e2: bipush 2
      // 0e3: imul
      // 0e4: bipush 1
      // 0e5: iadd
      // 0e6: istore 9
      // 0e8: iload 9
      // 0ea: anewarray 663
      // 0ed: astore 10
      // 0ef: iload 8
      // 0f1: bipush 1
      // 0f2: isub
      // 0f3: istore 11
      // 0f5: iload 11
      // 0f7: iflt 15b
      // 0fa: aload 0
      // 0fb: getfield rip/breeze/inject/Util139.arr_ð [Lrip/breeze/inject/BreezeClass;
      // 0fe: iload 11
      // 100: aaload
      // 101: iload 5
      // 103: ifeq 1e2
      // 106: astore 12
      // 108: aload 12
      // 10a: ifnull 153
      // 10d: aload 12
      // 10f: getfield rip/breeze/inject/BreezeClass.ª_þ Lrip/breeze/inject/ª;
      // 112: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 115: iload 9
      // 117: irem
      // 118: istore 13
      // 11a: aload 12
      // 11c: getfield rip/breeze/inject/BreezeClass.breezeClass_ý Lrip/breeze/inject/BreezeClass;
      // 11f: astore 14
      // 121: aload 12
      // 123: aload 10
      // 125: iload 13
      // 127: aaload
      // 128: putfield rip/breeze/inject/BreezeClass.breezeClass_ý Lrip/breeze/inject/BreezeClass;
      // 12b: aload 10
      // 12d: iload 13
      // 12f: aload 12
      // 131: aastore
      // 132: aload 14
      // 134: astore 12
      // 136: iload 5
      // 138: lload 3
      // 139: lconst_0
      // 13a: lcmp
      // 13b: ifle 158
      // 13e: ifeq 156
      // 141: iload 5
      // 143: ifne 108
      // 146: lload 3
      // 147: lconst_0
      // 148: lcmp
      // 149: ifle 136
      // 14c: goto 153
      // 14f: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 152: athrow
      // 153: iinc 11 -1
      // 156: iload 5
      // 158: ifne 0f5
      // 15b: aload 0
      // 15c: lload 3
      // 15d: lconst_0
      // 15e: lcmp
      // 15f: iflt 0fb
      // 162: aload 10
      // 164: putfield rip/breeze/inject/Util139.arr_ð [Lrip/breeze/inject/BreezeClass;
      // 167: aload 0
      // 168: getfield rip/breeze/inject/Util139.int_ò I
      // 16b: aload 0
      // 16c: getfield rip/breeze/inject/Util139.arr_ñ [Lrip/breeze/inject/BreezeClass;
      // 16f: arraylength
      // 170: iload 5
      // 172: ifeq 1b6
      // 175: if_icmpne 1a1
      // 178: goto 17f
      // 17b: invokestatic rip/breeze/inject/Util139.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17e: athrow
      // 17f: bipush 2
      // 180: aload 0
      // 181: getfield rip/breeze/inject/Util139.arr_ñ [Lrip/breeze/inject/BreezeClass;
      // 184: arraylength
      // 185: imul
      // 186: anewarray 663
      // 189: astore 8
      // 18b: aload 0
      // 18c: getfield rip/breeze/inject/Util139.arr_ñ [Lrip/breeze/inject/BreezeClass;
      // 18f: bipush 0
      // 190: aload 8
      // 192: bipush 0
      // 193: aload 0
      // 194: getfield rip/breeze/inject/Util139.arr_ñ [Lrip/breeze/inject/BreezeClass;
      // 197: arraylength
      // 198: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 19b: aload 0
      // 19c: aload 8
      // 19e: putfield rip/breeze/inject/Util139.arr_ñ [Lrip/breeze/inject/BreezeClass;
      // 1a1: new rip/breeze/inject/BreezeClass
      // 1a4: dup
      // 1a5: aload 0
      // 1a6: getfield rip/breeze/inject/Util139.int_ò I
      // 1a9: aload 2
      // 1aa: invokespecial rip/breeze/inject/BreezeClass.<init> (ILrip/breeze/inject/ª;)V
      // 1ad: astore 7
      // 1af: iload 6
      // 1b1: aload 0
      // 1b2: getfield rip/breeze/inject/Util139.arr_ð [Lrip/breeze/inject/BreezeClass;
      // 1b5: arraylength
      // 1b6: irem
      // 1b7: istore 8
      // 1b9: aload 7
      // 1bb: aload 0
      // 1bc: getfield rip/breeze/inject/Util139.arr_ð [Lrip/breeze/inject/BreezeClass;
      // 1bf: iload 8
      // 1c1: aaload
      // 1c2: putfield rip/breeze/inject/BreezeClass.breezeClass_ý Lrip/breeze/inject/BreezeClass;
      // 1c5: aload 0
      // 1c6: getfield rip/breeze/inject/Util139.arr_ð [Lrip/breeze/inject/BreezeClass;
      // 1c9: iload 8
      // 1cb: aload 7
      // 1cd: aastore
      // 1ce: aload 0
      // 1cf: getfield rip/breeze/inject/Util139.arr_ñ [Lrip/breeze/inject/BreezeClass;
      // 1d2: aload 0
      // 1d3: dup
      // 1d4: getfield rip/breeze/inject/Util139.int_ò I
      // 1d7: dup_x1
      // 1d8: bipush 1
      // 1d9: iadd
      // 1da: putfield rip/breeze/inject/Util139.int_ò I
      // 1dd: aload 7
      // 1df: aastore
      // 1e0: aload 7
      // 1e2: areturn
      // try (19 -> 24): 25 java/lang/IllegalArgumentException
      // try (22 -> 32): 33 java/lang/IllegalArgumentException
      // try (52 -> 65): 66 java/lang/IllegalArgumentException
      // try (59 -> 71): 72 java/lang/IllegalArgumentException
      // try (84 -> 87): 88 java/lang/IllegalArgumentException
      // try (92 -> 108): 109 java/lang/IllegalArgumentException
      // try (159 -> 167): 172 java/lang/IllegalArgumentException
      // try (189 -> 192): 193 java/lang/IllegalArgumentException
   }

   private static int calculate_9(Object[] var0) {
      int var1 = (Integer)var0[0];
      int var2 = (Integer)var0[1];
      return 2147483647 & var1 + var2;
   }

   private static int calculate_10(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      return 2147483647 & var1 + (int)var2 + (int)(var2 >>> 32);
   }

   private static int calculate_11(Object[] var0) {
      int var1 = (Integer)var0[0];
      String var2 = (String)var0[1];
      return 2147483647 & var1 + var2.hashCode();
   }

   private static int calculate_12(Object[] var0) {
      int var1 = (Integer)var0[0];
      String var2 = (String)var0[1];
      int var3 = (Integer)var0[2];
      return 2147483647 & var1 + var2.hashCode() + var3;
   }

   private static int calculate_13(Object[] var0) {
      int var1 = (Integer)var0[0];
      String var2 = (String)var0[1];
      String var3 = (String)var0[2];
      return 2147483647 & var1 + var2.hashCode() * var3.hashCode();
   }

   private static int calculate_14(Object[] var0) {
      int var1 = (Integer)var0[0];
      String var2 = (String)var0[1];
      String var3 = (String)var0[2];
      int var4 = (Integer)var0[3];
      return 2147483647 & var1 + var2.hashCode() * var3.hashCode() * (var4 + 1);
   }

   private static int calculate_15(Object[] var0) {
      int var1 = (Integer)var0[0];
      String var2 = (String)var0[1];
      String var3 = (String)var0[2];
      String var4 = (String)var0[3];
      return 2147483647 & var1 + var2.hashCode() * var3.hashCode() * var4.hashCode();
   }

   private static int calculate_16(Object[] var0) {
      int var1 = (Integer)var0[0];
      String var2 = (String)var0[1];
      String var3 = (String)var0[2];
      String var4 = (String)var0[3];
      int var5 = (Integer)var0[4];
      return 2147483647 & var1 + var2.hashCode() * var3.hashCode() * var4.hashCode() * var5;
   }

   static {
      long var0 = 21485764926453L;
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
      String var6 = "#MÈ\u0011R×®Ã\u009f_ù^×HÔ\u0015(l4uÔ \u00967øçêÒ°eÖ#\u0019\u0012¥>ùªªOüSÎ\u009aR\u001e\u0088¾MÃNîIt°[æ(À\u001cN |\u0086º\u0081Â`I/»\u008c\u0015\u0091\u0006!Ûá\u0011vx¨äUKÌÖÞ·\u0002©ì\u0017è0mô/";
      int var7 = "#MÈ\u0011R×®Ã\u009f_ù^×HÔ\u0015(l4uÔ \u00967øçêÒ°eÖ#\u0019\u0012¥>ùªªOüSÎ\u009aR\u001e\u0088¾MÃNîIt°[æ(À\u001cN |\u0086º\u0081Â`I/»\u008c\u0015\u0091\u0006!Ûá\u0011vx¨äUKÌÖÞ·\u0002©ì\u0017è0mô/"
         .length();
      char var8 = 16;
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = buildString_2(var11).intern();
         if ((var9 += var8) >= var7) {
            CONST_B = var4;
            CONST_C = new String[3];
            return;
         }

         var8 = var6.charAt(var9);
      }
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17113;
      if (CONST_C[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/c", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B[var3].getBytes("ISO-8859-1");
         CONST_C[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C[var3];
   }
}
