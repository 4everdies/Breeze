package rip.breeze.classtransform;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class PlayerUtil8 implements IBreezeInterface {
   private static String string_ÿ;
   private static final String[] CONST_A;
   private static final String[] CONST_C;
   private static final Map CONST_D;

   public void processAll(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/é
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
      // 015: checkcast rip/breeze/inject/BreezeClass12
      // 018: astore 5
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast rip/breeze/inject/é
      // 020: astore 6
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast rip/breeze/inject/BreezeClass12
      // 028: astore 7
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast rip/breeze/inject/ջ
      // 030: astore 8
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/util/List
      // 039: astore 9
      // 03b: pop
      // 03c: lload 3
      // 03d: dup2
      // 03e: ldc2_w 41650201184776
      // 041: lxor
      // 042: lstore 10
      // 044: dup2
      // 045: ldc2_w 92543490032440
      // 048: lxor
      // 049: lstore 12
      // 04b: dup2
      // 04c: ldc2_w 62324042915438
      // 04f: lxor
      // 050: lstore 14
      // 052: dup2
      // 053: ldc2_w 55959388707557
      // 056: lxor
      // 057: lstore 16
      // 059: dup2
      // 05a: ldc2_w 11996992854536
      // 05d: lxor
      // 05e: lstore 18
      // 060: dup2
      // 061: ldc2_w 137868339631645
      // 064: lxor
      // 065: lstore 20
      // 067: dup2
      // 068: ldc2_w 98069164605572
      // 06b: lxor
      // 06c: lstore 22
      // 06e: dup2
      // 06f: ldc2_w 94797422146590
      // 072: lxor
      // 073: lstore 24
      // 075: dup2
      // 076: ldc2_w 63544992968132
      // 079: lxor
      // 07a: lstore 26
      // 07c: dup2
      // 07d: ldc2_w 53088780034731
      // 080: lxor
      // 081: lstore 28
      // 083: dup2
      // 084: ldc2_w 20869204812985
      // 087: lxor
      // 088: lstore 30
      // 08a: dup2
      // 08b: ldc2_w 50298159658686
      // 08e: lxor
      // 08f: lstore 32
      // 091: dup2
      // 092: ldc2_w 74281819055897
      // 095: lxor
      // 096: lstore 34
      // 098: dup2
      // 099: ldc2_w 38194506066355
      // 09c: lxor
      // 09d: lstore 36
      // 09f: dup2
      // 0a0: ldc2_w 47574608711382
      // 0a3: lxor
      // 0a4: lstore 38
      // 0a6: dup2
      // 0a7: ldc2_w 117312328470481
      // 0aa: lxor
      // 0ab: lstore 40
      // 0ad: dup2
      // 0ae: ldc2_w 5728266744339
      // 0b1: lxor
      // 0b2: lstore 42
      // 0b4: dup2
      // 0b5: ldc2_w 10150298433294
      // 0b8: lxor
      // 0b9: lstore 44
      // 0bb: pop2
      // 0bc: invokestatic rip/breeze/classtransform/PlayerUtil8.getString ()Ljava/lang/String;
      // 0bf: aload 8
      // 0c1: checkcast rip/breeze/inject/կ
      // 0c4: astore 46
      // 0c6: astore 47
      // 0c8: aload 7
      // 0ca: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0cd: lload 22
      // 0cf: dup2_x1
      // 0d0: pop2
      // 0d1: bipush 2
      // 0d2: anewarray 4
      // 0d5: dup_x1
      // 0d6: swap
      // 0d7: bipush 1
      // 0d8: swap
      // 0d9: aastore
      // 0da: dup_x2
      // 0db: dup_x2
      // 0dc: pop
      // 0dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e0: bipush 0
      // 0e1: swap
      // 0e2: aastore
      // 0e3: invokestatic rip/breeze/classtransform/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 0e6: astore 48
      // 0e8: aload 7
      // 0ea: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0ed: lload 18
      // 0ef: bipush 2
      // 0f0: anewarray 4
      // 0f3: dup_x2
      // 0f4: dup_x2
      // 0f5: pop
      // 0f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f9: bipush 1
      // 0fa: swap
      // 0fb: aastore
      // 0fc: dup_x1
      // 0fd: swap
      // 0fe: bipush 0
      // 0ff: swap
      // 100: aastore
      // 101: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 104: astore 49
      // 106: aload 46
      // 108: getfield rip/breeze/inject/կ.string_ç_2 Ljava/lang/String;
      // 10b: lload 42
      // 10d: dup2_x1
      // 10e: pop2
      // 10f: bipush 2
      // 110: anewarray 4
      // 113: dup_x1
      // 114: swap
      // 115: bipush 1
      // 116: swap
      // 117: aastore
      // 118: dup_x2
      // 119: dup_x2
      // 11a: pop
      // 11b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11e: bipush 0
      // 11f: swap
      // 120: aastore
      // 121: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 124: astore 50
      // 126: aload 46
      // 128: getfield rip/breeze/inject/կ.string_å_2 Ljava/lang/String;
      // 12b: lload 18
      // 12d: bipush 2
      // 12e: anewarray 4
      // 131: dup_x2
      // 132: dup_x2
      // 133: pop
      // 134: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 137: bipush 1
      // 138: swap
      // 139: aastore
      // 13a: dup_x1
      // 13b: swap
      // 13c: bipush 0
      // 13d: swap
      // 13e: aastore
      // 13f: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 142: astore 51
      // 144: aload 50
      // 146: aload 48
      // 148: lload 36
      // 14a: bipush 3
      // 14b: anewarray 4
      // 14e: dup_x2
      // 14f: dup_x2
      // 150: pop
      // 151: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 154: bipush 2
      // 155: swap
      // 156: aastore
      // 157: dup_x1
      // 158: swap
      // 159: bipush 1
      // 15a: swap
      // 15b: aastore
      // 15c: dup_x1
      // 15d: swap
      // 15e: bipush 0
      // 15f: swap
      // 160: aastore
      // 161: invokestatic rip/breeze/classtransform/MathUtil3.checkCondition_3 ([Ljava/lang/Object;)Z
      // 164: aload 47
      // 166: ifnull 215
      // 169: ifne 20e
      // 16c: goto 173
      // 16f: invokestatic rip/breeze/classtransform/PlayerUtil8.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 172: athrow
      // 173: new rip/breeze/classtransform/գ
      // 176: dup
      // 177: aload 7
      // 179: aload 6
      // 17b: lload 32
      // 17d: sipush 23624
      // 180: ldc2_w 8700954730735579793
      // 183: lload 3
      // 184: lxor
      // 185: invokedynamic b (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/PlayerUtil8.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 18d: aload 7
      // 18f: lload 44
      // 191: bipush 2
      // 192: anewarray 4
      // 195: dup_x2
      // 196: dup_x2
      // 197: pop
      // 198: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19b: bipush 1
      // 19c: swap
      // 19d: aastore
      // 19e: dup_x1
      // 19f: swap
      // 1a0: bipush 0
      // 1a1: swap
      // 1a2: aastore
      // 1a3: invokestatic rip/breeze/classtransform/և.getև_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 1a6: lload 28
      // 1a8: aload 50
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
      // 1bc: invokevirtual rip/breeze/classtransform/և.getև_4 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 1bf: aconst_null
      // 1c0: lload 20
      // 1c2: bipush 2
      // 1c3: anewarray 4
      // 1c6: dup_x2
      // 1c7: dup_x2
      // 1c8: pop
      // 1c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cc: bipush 1
      // 1cd: swap
      // 1ce: aastore
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: bipush 0
      // 1d2: swap
      // 1d3: aastore
      // 1d4: invokevirtual rip/breeze/classtransform/և.getև_6 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 1d7: lload 30
      // 1d9: aload 51
      // 1db: bipush 2
      // 1dc: anewarray 4
      // 1df: dup_x1
      // 1e0: swap
      // 1e1: bipush 1
      // 1e2: swap
      // 1e3: aastore
      // 1e4: dup_x2
      // 1e5: dup_x2
      // 1e6: pop
      // 1e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ea: bipush 0
      // 1eb: swap
      // 1ec: aastore
      // 1ed: invokevirtual rip/breeze/classtransform/և.getև_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 1f0: lload 34
      // 1f2: dup2_x1
      // 1f3: pop2
      // 1f4: bipush 2
      // 1f5: anewarray 4
      // 1f8: dup_x1
      // 1f9: swap
      // 1fa: bipush 1
      // 1fb: swap
      // 1fc: aastore
      // 1fd: dup_x2
      // 1fe: dup_x2
      // 1ff: pop
      // 200: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 203: bipush 0
      // 204: swap
      // 205: aastore
      // 206: invokevirtual rip/breeze/classtransform/գ.getԳ_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 209: athrow
      // 20a: invokestatic rip/breeze/classtransform/PlayerUtil8.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 20d: athrow
      // 20e: aload 50
      // 210: aload 48
      // 212: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 215: aload 47
      // 217: ifnull 225
      // 21a: ifne 228
      // 21d: goto 224
      // 220: invokestatic rip/breeze/classtransform/PlayerUtil8.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 223: athrow
      // 224: bipush 1
      // 225: goto 229
      // 228: bipush 0
      // 229: istore 52
      // 22b: lload 10
      // 22d: aload 51
      // 22f: aload 49
      // 231: bipush 3
      // 232: anewarray 4
      // 235: dup_x1
      // 236: swap
      // 237: bipush 2
      // 238: swap
      // 239: aastore
      // 23a: dup_x1
      // 23b: swap
      // 23c: bipush 1
      // 23d: swap
      // 23e: aastore
      // 23f: dup_x2
      // 240: dup_x2
      // 241: pop
      // 242: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 245: bipush 0
      // 246: swap
      // 247: aastore
      // 248: invokestatic rip/breeze/classtransform/MathUtil3.isValid_3 ([Ljava/lang/Object;)Z
      // 24b: aload 47
      // 24d: ifnull 2f5
      // 250: ifne 2dc
      // 253: goto 25a
      // 256: invokestatic rip/breeze/classtransform/PlayerUtil8.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 259: athrow
      // 25a: new rip/breeze/classtransform/գ
      // 25d: dup
      // 25e: aload 7
      // 260: aload 6
      // 262: lload 32
      // 264: sipush 1692
      // 267: ldc2_w 5865408880198379588
      // 26a: lload 3
      // 26b: lxor
      // 26c: invokedynamic b (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/PlayerUtil8.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 271: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 274: aload 7
      // 276: lload 44
      // 278: bipush 2
      // 279: anewarray 4
      // 27c: dup_x2
      // 27d: dup_x2
      // 27e: pop
      // 27f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 282: bipush 1
      // 283: swap
      // 284: aastore
      // 285: dup_x1
      // 286: swap
      // 287: bipush 0
      // 288: swap
      // 289: aastore
      // 28a: invokestatic rip/breeze/classtransform/և.getև_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 28d: aconst_null
      // 28e: lload 20
      // 290: bipush 2
      // 291: anewarray 4
      // 294: dup_x2
      // 295: dup_x2
      // 296: pop
      // 297: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29a: bipush 1
      // 29b: swap
      // 29c: aastore
      // 29d: dup_x1
      // 29e: swap
      // 29f: bipush 0
      // 2a0: swap
      // 2a1: aastore
      // 2a2: invokevirtual rip/breeze/classtransform/և.getև_6 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 2a5: lload 30
      // 2a7: aload 51
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
      // 2bb: invokevirtual rip/breeze/classtransform/և.getև_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 2be: lload 34
      // 2c0: dup2_x1
      // 2c1: pop2
      // 2c2: bipush 2
      // 2c3: anewarray 4
      // 2c6: dup_x1
      // 2c7: swap
      // 2c8: bipush 1
      // 2c9: swap
      // 2ca: aastore
      // 2cb: dup_x2
      // 2cc: dup_x2
      // 2cd: pop
      // 2ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d1: bipush 0
      // 2d2: swap
      // 2d3: aastore
      // 2d4: invokevirtual rip/breeze/classtransform/գ.getԳ_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 2d7: athrow
      // 2d8: invokestatic rip/breeze/classtransform/PlayerUtil8.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2db: athrow
      // 2dc: lload 24
      // 2de: aload 5
      // 2e0: bipush 2
      // 2e1: anewarray 4
      // 2e4: dup_x1
      // 2e5: swap
      // 2e6: bipush 1
      // 2e7: swap
      // 2e8: aastore
      // 2e9: dup_x2
      // 2ea: dup_x2
      // 2eb: pop
      // 2ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ef: bipush 0
      // 2f0: swap
      // 2f1: aastore
      // 2f2: invokestatic rip/breeze/classtransform/MathUtil3.calculate ([Ljava/lang/Object;)I
      // 2f5: istore 48
      // 2f7: aload 0
      // 2f8: lload 12
      // 2fa: aconst_null
      // 2fb: aload 46
      // 2fd: getfield rip/breeze/inject/կ.string_å_2 Ljava/lang/String;
      // 300: iload 48
      // 302: bipush 4
      // 303: anewarray 4
      // 306: dup_x1
      // 307: swap
      // 308: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 30b: bipush 3
      // 30c: swap
      // 30d: aastore
      // 30e: dup_x1
      // 30f: swap
      // 310: bipush 2
      // 311: swap
      // 312: aastore
      // 313: dup_x1
      // 314: swap
      // 315: bipush 1
      // 316: swap
      // 317: aastore
      // 318: dup_x2
      // 319: dup_x2
      // 31a: pop
      // 31b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31e: bipush 0
      // 31f: swap
      // 320: aastore
      // 321: invokevirtual rip/breeze/classtransform/PlayerUtil8.þ ([Ljava/lang/Object;)[Lrip/breeze/inject/թ;
      // 324: astore 49
      // 326: aload 49
      // 328: bipush 0
      // 329: aaload
      // 32a: astore 50
      // 32c: aload 49
      // 32e: bipush 1
      // 32f: aaload
      // 330: astore 51
      // 332: aload 5
      // 334: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 337: aload 46
      // 339: aload 50
      // 33b: lload 38
      // 33d: bipush 3
      // 33e: anewarray 4
      // 341: dup_x2
      // 342: dup_x2
      // 343: pop
      // 344: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 347: bipush 2
      // 348: swap
      // 349: aastore
      // 34a: dup_x1
      // 34b: swap
      // 34c: bipush 1
      // 34d: swap
      // 34e: aastore
      // 34f: dup_x1
      // 350: swap
      // 351: bipush 0
      // 352: swap
      // 353: aastore
      // 354: invokevirtual rip/breeze/inject/թ.method_019 ([Ljava/lang/Object;)V
      // 357: aload 5
      // 359: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 35c: lload 26
      // 35e: aload 46
      // 360: new rip/breeze/inject/շ
      // 363: dup
      // 364: bipush 88
      // 366: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 369: bipush 3
      // 36a: anewarray 4
      // 36d: dup_x1
      // 36e: swap
      // 36f: bipush 2
      // 370: swap
      // 371: aastore
      // 372: dup_x1
      // 373: swap
      // 374: bipush 1
      // 375: swap
      // 376: aastore
      // 377: dup_x2
      // 378: dup_x2
      // 379: pop
      // 37a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 37d: bipush 0
      // 37e: swap
      // 37f: aastore
      // 380: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 383: iload 52
      // 385: lload 3
      // 386: lconst_0
      // 387: lcmp
      // 388: ifle 40d
      // 38b: aload 47
      // 38d: ifnull 40d
      // 390: ifeq 3f3
      // 393: goto 39a
      // 396: invokestatic rip/breeze/classtransform/PlayerUtil8.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 399: athrow
      // 39a: aload 5
      // 39c: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 39f: aload 46
      // 3a1: new rip/breeze/inject/լ
      // 3a4: dup
      // 3a5: sipush 192
      // 3a8: aload 46
      // 3aa: getfield rip/breeze/inject/կ.string_å_2 Ljava/lang/String;
      // 3ad: lload 22
      // 3af: dup2_x1
      // 3b0: pop2
      // 3b1: bipush 2
      // 3b2: anewarray 4
      // 3b5: dup_x1
      // 3b6: swap
      // 3b7: bipush 1
      // 3b8: swap
      // 3b9: aastore
      // 3ba: dup_x2
      // 3bb: dup_x2
      // 3bc: pop
      // 3bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3c0: bipush 0
      // 3c1: swap
      // 3c2: aastore
      // 3c3: invokestatic rip/breeze/classtransform/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 3c6: bipush 0
      // 3c7: anewarray 4
      // 3ca: invokevirtual rip/breeze/inject/MathUtil3.buildString_3 ([Ljava/lang/Object;)Ljava/lang/String;
      // 3cd: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 3d0: lload 40
      // 3d2: bipush 3
      // 3d3: anewarray 4
      // 3d6: dup_x2
      // 3d7: dup_x2
      // 3d8: pop
      // 3d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3dc: bipush 2
      // 3dd: swap
      // 3de: aastore
      // 3df: dup_x1
      // 3e0: swap
      // 3e1: bipush 1
      // 3e2: swap
      // 3e3: aastore
      // 3e4: dup_x1
      // 3e5: swap
      // 3e6: bipush 0
      // 3e7: swap
      // 3e8: aastore
      // 3e9: invokevirtual rip/breeze/inject/թ.method_016 ([Ljava/lang/Object;)V
      // 3ec: goto 3f3
      // 3ef: invokestatic rip/breeze/classtransform/PlayerUtil8.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 3f2: athrow
      // 3f3: lload 3
      // 3f4: lconst_0
      // 3f5: lcmp
      // 3f6: ifle 4e4
      // 3f9: aload 7
      // 3fb: aload 47
      // 3fd: ifnull 4c1
      // 400: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 403: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 406: goto 40d
      // 409: invokestatic rip/breeze/classtransform/PlayerUtil8.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 40c: athrow
      // 40d: ifne 4bf
      // 410: aload 5
      // 412: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 415: lload 26
      // 417: aload 46
      // 419: new rip/breeze/inject/ի
      // 41c: dup
      // 41d: bipush 25
      // 41f: bipush 0
      // 420: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 423: bipush 3
      // 424: anewarray 4
      // 427: dup_x1
      // 428: swap
      // 429: bipush 2
      // 42a: swap
      // 42b: aastore
      // 42c: dup_x1
      // 42d: swap
      // 42e: bipush 1
      // 42f: swap
      // 430: aastore
      // 431: dup_x2
      // 432: dup_x2
      // 433: pop
      // 434: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 437: bipush 0
      // 438: swap
      // 439: aastore
      // 43a: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 43d: aload 5
      // 43f: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 442: aload 46
      // 444: aload 51
      // 446: lload 38
      // 448: bipush 3
      // 449: anewarray 4
      // 44c: dup_x2
      // 44d: dup_x2
      // 44e: pop
      // 44f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 452: bipush 2
      // 453: swap
      // 454: aastore
      // 455: dup_x1
      // 456: swap
      // 457: bipush 1
      // 458: swap
      // 459: aastore
      // 45a: dup_x1
      // 45b: swap
      // 45c: bipush 0
      // 45d: swap
      // 45e: aastore
      // 45f: invokevirtual rip/breeze/inject/թ.method_019 ([Ljava/lang/Object;)V
      // 462: new rip/breeze/inject/կ
      // 465: dup
      // 466: aload 2
      // 467: getfield rip/breeze/inject/é.int_û_2 I
      // 46a: invokestatic java/lang/reflect/Modifier.isInterface (I)Z
      // 46d: ifeq 481
      // 470: goto 477
      // 473: invokestatic rip/breeze/classtransform/PlayerUtil8.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 476: athrow
      // 477: sipush 185
      // 47a: goto 484
      // 47d: invokestatic rip/breeze/classtransform/PlayerUtil8.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 480: athrow
      // 481: sipush 182
      // 484: aload 2
      // 485: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 488: aload 7
      // 48a: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 48d: lload 16
      // 48f: dup2_x1
      // 490: pop2
      // 491: aload 7
      // 493: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 496: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
      // 499: astore 53
      // 49b: lload 3
      // 49c: lconst_0
      // 49d: lcmp
      // 49e: ifle 534
      // 4a1: aload 47
      // 4a3: ifnonnull 505
      // 4a6: invokestatic rip/breeze/inject/ջ.method_012 ()Z
      // 4a9: ifeq 4bb
      // 4ac: goto 4b3
      // 4af: invokestatic rip/breeze/classtransform/PlayerUtil8.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 4b2: athrow
      // 4b3: bipush 0
      // 4b4: goto 4bc
      // 4b7: invokestatic rip/breeze/classtransform/PlayerUtil8.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 4ba: athrow
      // 4bb: bipush 1
      // 4bc: invokestatic rip/breeze/inject/ջ.method_011 (Z)V
      // 4bf: aload 5
      // 4c1: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 4c4: aload 46
      // 4c6: aload 51
      // 4c8: lload 38
      // 4ca: bipush 3
      // 4cb: anewarray 4
      // 4ce: dup_x2
      // 4cf: dup_x2
      // 4d0: pop
      // 4d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d4: bipush 2
      // 4d5: swap
      // 4d6: aastore
      // 4d7: dup_x1
      // 4d8: swap
      // 4d9: bipush 1
      // 4da: swap
      // 4db: aastore
      // 4dc: dup_x1
      // 4dd: swap
      // 4de: bipush 0
      // 4df: swap
      // 4e0: aastore
      // 4e1: invokevirtual rip/breeze/inject/թ.method_019 ([Ljava/lang/Object;)V
      // 4e4: new rip/breeze/inject/կ
      // 4e7: dup
      // 4e8: sipush 184
      // 4eb: aload 2
      // 4ec: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 4ef: aload 7
      // 4f1: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 4f4: aload 7
      // 4f6: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 4f9: aload 2
      // 4fa: getfield rip/breeze/inject/é.int_û_2 I
      // 4fd: invokestatic java/lang/reflect/Modifier.isInterface (I)Z
      // 500: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 503: astore 53
      // 505: aload 5
      // 507: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 50a: aload 46
      // 50c: aload 53
      // 50e: lload 14
      // 510: bipush 3
      // 511: anewarray 4
      // 514: dup_x2
      // 515: dup_x2
      // 516: pop
      // 517: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51a: bipush 2
      // 51b: swap
      // 51c: aastore
      // 51d: dup_x1
      // 51e: swap
      // 51f: bipush 1
      // 520: swap
      // 521: aastore
      // 522: dup_x1
      // 523: swap
      // 524: bipush 0
      // 525: swap
      // 526: aastore
      // 527: invokevirtual rip/breeze/inject/թ.method_011 ([Ljava/lang/Object;)V
      // 52a: aload 9
      // 52c: aload 53
      // 52e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 533: pop
      // 534: return
      // try (197 -> 223): 224 rip/breeze/classtransform/գ
      // try (222 -> 324): 324 rip/breeze/classtransform/գ
      // try (329 -> 332): 333 rip/breeze/classtransform/գ
      // try (339 -> 365): 366 rip/breeze/classtransform/գ
      // try (364 -> 449): 449 rip/breeze/classtransform/գ
      // try (510 -> 571): 572 rip/breeze/classtransform/գ
      // try (570 -> 625): 626 rip/breeze/classtransform/գ
      // try (628 -> 637): 638 rip/breeze/classtransform/գ
      // try (640 -> 701): 702 rip/breeze/classtransform/գ
      // try (641 -> 706): 706 rip/breeze/classtransform/գ
      // try (720 -> 728): 729 rip/breeze/classtransform/գ
      // try (726 -> 733): 733 rip/breeze/classtransform/գ
   }

   public static void initialize(String var0) {
      string_ÿ = var0;
   }

   public static String getString() {
      return string_ÿ;
   }

   static {
      long var10000 = rip.breeze.inject.Util138.getIBreezeInterface(5815950261011469784L, 1928500535848781515L, MethodHandles.lookup().lookupClass())
         .method_003(121338668634173L);
      if (getString() == null) {
         initialize("yRQYD");
      }

      CONST_D = new HashMap(13);
      long var0 = var10000 ^ 49875284024910L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "¿ßêÁ\b\"U\u0005\u0011æ\tòGI~\u008cã\u0010J\u001aKF¥\u0081\u0084K¼Q¥\u001dðK\u007f½kÉäý¨bL\u0086}¢\u0013¢Ä«8ê\u008cãIßä\u000f\u001a>\u009b\u0017\u0099tÝ\u001aó5©w~SM\u009a¥i³m\u0015\u008bWðï\u0081\n\u0013´\u0095ð\u0006hY8î&ôl+\u0097\\\u001dª?ÌÎ\u0001Æ\u0094Æò\n·´ºÙb¦\u0019¶ÂÅ5I\u0085¹¾û(\"°az\u0090s\"bL¸T\rXE\u001eùÂ\u0000PÕ\f\u0002´\rdëLÐBU\u008f+\u0014Îó£Oq¾\u000eØü%¨´¯¡\u008c\u0091_BUÖ¾´ñÚü§\u0099\u0001\u009b\n\u0012Mß~";
      int var7 = "¿ßêÁ\b\"U\u0005\u0011æ\tòGI~\u008cã\u0010J\u001aKF¥\u0081\u0084K¼Q¥\u001dðK\u007f½kÉäý¨bL\u0086}¢\u0013¢Ä«8ê\u008cãIßä\u000f\u001a>\u009b\u0017\u0099tÝ\u001aó5©w~SM\u009a¥i³m\u0015\u008bWðï\u0081\n\u0013´\u0095ð\u0006hY8î&ôl+\u0097\\\u001dª?ÌÎ\u0001Æ\u0094Æò\n·´ºÙb¦\u0019¶ÂÅ5I\u0085¹¾û(\"°az\u0090s\"bL¸T\rXE\u001eùÂ\u0000PÕ\f\u0002´\rdëLÐBU\u008f+\u0014Îó£Oq¾\u000eØü%¨´¯¡\u008c\u0091_BUÖ¾´ñÚü§\u0099\u0001\u009b\n\u0012Mß~"
         .length();
      char var8 = 'X';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var14 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var14;
         if ((var9 += var8) >= var7) {
            CONST_A = var4;
            CONST_C = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static գ getԳ(գ var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1737;
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
            throw new RuntimeException("rip/breeze/classtransform/e", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_A[var3].getBytes("ISO-8859-1");
         CONST_C[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C[var3];
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
         throw new RuntimeException("rip/breeze/classtransform/e" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
