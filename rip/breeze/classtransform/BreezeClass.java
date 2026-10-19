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

public class BreezeClass implements IBreezeInterface {
   private static final String[] CONST_A;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

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
      // 068: ldc2_w 133994113515507
      // 06b: lxor
      // 06c: lstore 22
      // 06e: dup2
      // 06f: ldc2_w 98069164605572
      // 072: lxor
      // 073: lstore 24
      // 075: dup2
      // 076: ldc2_w 94797422146590
      // 079: lxor
      // 07a: lstore 26
      // 07c: dup2
      // 07d: ldc2_w 63544992968132
      // 080: lxor
      // 081: lstore 28
      // 083: dup2
      // 084: ldc2_w 53088780034731
      // 087: lxor
      // 088: lstore 30
      // 08a: dup2
      // 08b: ldc2_w 20869204812985
      // 08e: lxor
      // 08f: lstore 32
      // 091: dup2
      // 092: ldc2_w 50298159658686
      // 095: lxor
      // 096: lstore 34
      // 098: dup2
      // 099: ldc2_w 74281819055897
      // 09c: lxor
      // 09d: lstore 36
      // 09f: dup2
      // 0a0: ldc2_w 38194506066355
      // 0a3: lxor
      // 0a4: lstore 38
      // 0a6: dup2
      // 0a7: ldc2_w 117312328470481
      // 0aa: lxor
      // 0ab: lstore 40
      // 0ad: dup2
      // 0ae: ldc2_w 47574608711382
      // 0b1: lxor
      // 0b2: lstore 42
      // 0b4: dup2
      // 0b5: ldc2_w 5728266744339
      // 0b8: lxor
      // 0b9: lstore 44
      // 0bb: dup2
      // 0bc: ldc2_w 10150298433294
      // 0bf: lxor
      // 0c0: lstore 46
      // 0c2: pop2
      // 0c3: aload 8
      // 0c5: checkcast rip/breeze/inject/կ
      // 0c8: astore 48
      // 0ca: aload 7
      // 0cc: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0cf: lload 24
      // 0d1: dup2_x1
      // 0d2: pop2
      // 0d3: bipush 2
      // 0d4: anewarray 4
      // 0d7: dup_x1
      // 0d8: swap
      // 0d9: bipush 1
      // 0da: swap
      // 0db: aastore
      // 0dc: dup_x2
      // 0dd: dup_x2
      // 0de: pop
      // 0df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e2: bipush 0
      // 0e3: swap
      // 0e4: aastore
      // 0e5: invokestatic rip/breeze/classtransform/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 0e8: astore 49
      // 0ea: invokestatic rip/breeze/classtransform/PlayerUtil8.getString ()Ljava/lang/String;
      // 0ed: aload 7
      // 0ef: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0f2: lload 18
      // 0f4: bipush 2
      // 0f5: anewarray 4
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 1
      // 0ff: swap
      // 100: aastore
      // 101: dup_x1
      // 102: swap
      // 103: bipush 0
      // 104: swap
      // 105: aastore
      // 106: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 109: astore 50
      // 10b: astore 51
      // 10d: aload 48
      // 10f: getfield rip/breeze/inject/կ.string_å_2 Ljava/lang/String;
      // 112: lload 24
      // 114: dup2_x1
      // 115: pop2
      // 116: bipush 2
      // 117: anewarray 4
      // 11a: dup_x1
      // 11b: swap
      // 11c: bipush 1
      // 11d: swap
      // 11e: aastore
      // 11f: dup_x2
      // 120: dup_x2
      // 121: pop
      // 122: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 125: bipush 0
      // 126: swap
      // 127: aastore
      // 128: invokestatic rip/breeze/classtransform/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 12b: astore 52
      // 12d: aload 48
      // 12f: getfield rip/breeze/inject/կ.string_å_2 Ljava/lang/String;
      // 132: lload 18
      // 134: bipush 2
      // 135: anewarray 4
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
      // 146: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 149: astore 53
      // 14b: aload 52
      // 14d: aload 49
      // 14f: lload 38
      // 151: bipush 3
      // 152: anewarray 4
      // 155: dup_x2
      // 156: dup_x2
      // 157: pop
      // 158: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15b: bipush 2
      // 15c: swap
      // 15d: aastore
      // 15e: dup_x1
      // 15f: swap
      // 160: bipush 1
      // 161: swap
      // 162: aastore
      // 163: dup_x1
      // 164: swap
      // 165: bipush 0
      // 166: swap
      // 167: aastore
      // 168: invokestatic rip/breeze/classtransform/MathUtil3.checkCondition_3 ([Ljava/lang/Object;)Z
      // 16b: aload 51
      // 16d: ifnull 21c
      // 170: ifne 215
      // 173: goto 17a
      // 176: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 179: athrow
      // 17a: new rip/breeze/classtransform/գ
      // 17d: dup
      // 17e: aload 7
      // 180: aload 6
      // 182: lload 34
      // 184: sipush 16825
      // 187: ldc2_w 3825668337446396979
      // 18a: lload 3
      // 18b: lxor
      // 18c: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/BreezeClass.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 194: aload 7
      // 196: lload 46
      // 198: bipush 2
      // 199: anewarray 4
      // 19c: dup_x2
      // 19d: dup_x2
      // 19e: pop
      // 19f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a2: bipush 1
      // 1a3: swap
      // 1a4: aastore
      // 1a5: dup_x1
      // 1a6: swap
      // 1a7: bipush 0
      // 1a8: swap
      // 1a9: aastore
      // 1aa: invokestatic rip/breeze/classtransform/և.getև_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 1ad: lload 30
      // 1af: aload 52
      // 1b1: bipush 2
      // 1b2: anewarray 4
      // 1b5: dup_x1
      // 1b6: swap
      // 1b7: bipush 1
      // 1b8: swap
      // 1b9: aastore
      // 1ba: dup_x2
      // 1bb: dup_x2
      // 1bc: pop
      // 1bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c0: bipush 0
      // 1c1: swap
      // 1c2: aastore
      // 1c3: invokevirtual rip/breeze/classtransform/և.getև_4 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 1c6: aconst_null
      // 1c7: lload 20
      // 1c9: bipush 2
      // 1ca: anewarray 4
      // 1cd: dup_x2
      // 1ce: dup_x2
      // 1cf: pop
      // 1d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d3: bipush 1
      // 1d4: swap
      // 1d5: aastore
      // 1d6: dup_x1
      // 1d7: swap
      // 1d8: bipush 0
      // 1d9: swap
      // 1da: aastore
      // 1db: invokevirtual rip/breeze/classtransform/և.getև_6 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 1de: lload 32
      // 1e0: aload 53
      // 1e2: bipush 2
      // 1e3: anewarray 4
      // 1e6: dup_x1
      // 1e7: swap
      // 1e8: bipush 1
      // 1e9: swap
      // 1ea: aastore
      // 1eb: dup_x2
      // 1ec: dup_x2
      // 1ed: pop
      // 1ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f1: bipush 0
      // 1f2: swap
      // 1f3: aastore
      // 1f4: invokevirtual rip/breeze/classtransform/և.getև_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 1f7: lload 36
      // 1f9: dup2_x1
      // 1fa: pop2
      // 1fb: bipush 2
      // 1fc: anewarray 4
      // 1ff: dup_x1
      // 200: swap
      // 201: bipush 1
      // 202: swap
      // 203: aastore
      // 204: dup_x2
      // 205: dup_x2
      // 206: pop
      // 207: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20a: bipush 0
      // 20b: swap
      // 20c: aastore
      // 20d: invokevirtual rip/breeze/classtransform/գ.getԳ_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 210: athrow
      // 211: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 214: athrow
      // 215: aload 52
      // 217: aload 49
      // 219: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 21c: aload 51
      // 21e: ifnull 22c
      // 221: ifne 22f
      // 224: goto 22b
      // 227: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 22a: athrow
      // 22b: bipush 1
      // 22c: goto 230
      // 22f: bipush 0
      // 230: istore 54
      // 232: aload 48
      // 234: bipush 0
      // 235: anewarray 4
      // 238: invokevirtual rip/breeze/inject/կ.ÿ ([Ljava/lang/Object;)I
      // 23b: aload 51
      // 23d: lload 3
      // 23e: lconst_0
      // 23f: lcmp
      // 240: ifle 360
      // 243: ifnull 35e
      // 246: sipush 184
      // 249: if_icmpne 30b
      // 24c: goto 253
      // 24f: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 252: athrow
      // 253: lload 10
      // 255: aload 53
      // 257: aload 50
      // 259: bipush 3
      // 25a: anewarray 4
      // 25d: dup_x1
      // 25e: swap
      // 25f: bipush 2
      // 260: swap
      // 261: aastore
      // 262: dup_x1
      // 263: swap
      // 264: bipush 1
      // 265: swap
      // 266: aastore
      // 267: dup_x2
      // 268: dup_x2
      // 269: pop
      // 26a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26d: bipush 0
      // 26e: swap
      // 26f: aastore
      // 270: invokestatic rip/breeze/classtransform/MathUtil3.isValid_3 ([Ljava/lang/Object;)Z
      // 273: aload 51
      // 275: ifnull 446
      // 278: goto 27f
      // 27b: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 27e: athrow
      // 27f: ifne 42d
      // 282: goto 289
      // 285: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 288: athrow
      // 289: new rip/breeze/classtransform/գ
      // 28c: dup
      // 28d: aload 7
      // 28f: aload 6
      // 291: lload 34
      // 293: sipush 14035
      // 296: ldc2_w 1330088779056042840
      // 299: lload 3
      // 29a: lxor
      // 29b: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/BreezeClass.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 2a3: aload 7
      // 2a5: lload 46
      // 2a7: bipush 2
      // 2a8: anewarray 4
      // 2ab: dup_x2
      // 2ac: dup_x2
      // 2ad: pop
      // 2ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b1: bipush 1
      // 2b2: swap
      // 2b3: aastore
      // 2b4: dup_x1
      // 2b5: swap
      // 2b6: bipush 0
      // 2b7: swap
      // 2b8: aastore
      // 2b9: invokestatic rip/breeze/classtransform/և.getև_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 2bc: aconst_null
      // 2bd: lload 20
      // 2bf: bipush 2
      // 2c0: anewarray 4
      // 2c3: dup_x2
      // 2c4: dup_x2
      // 2c5: pop
      // 2c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c9: bipush 1
      // 2ca: swap
      // 2cb: aastore
      // 2cc: dup_x1
      // 2cd: swap
      // 2ce: bipush 0
      // 2cf: swap
      // 2d0: aastore
      // 2d1: invokevirtual rip/breeze/classtransform/և.getև_6 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 2d4: lload 32
      // 2d6: aload 53
      // 2d8: bipush 2
      // 2d9: anewarray 4
      // 2dc: dup_x1
      // 2dd: swap
      // 2de: bipush 1
      // 2df: swap
      // 2e0: aastore
      // 2e1: dup_x2
      // 2e2: dup_x2
      // 2e3: pop
      // 2e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e7: bipush 0
      // 2e8: swap
      // 2e9: aastore
      // 2ea: invokevirtual rip/breeze/classtransform/և.getև_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 2ed: lload 36
      // 2ef: dup2_x1
      // 2f0: pop2
      // 2f1: bipush 2
      // 2f2: anewarray 4
      // 2f5: dup_x1
      // 2f6: swap
      // 2f7: bipush 1
      // 2f8: swap
      // 2f9: aastore
      // 2fa: dup_x2
      // 2fb: dup_x2
      // 2fc: pop
      // 2fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 300: bipush 0
      // 301: swap
      // 302: aastore
      // 303: invokevirtual rip/breeze/classtransform/գ.getԳ_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 306: athrow
      // 307: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 30a: athrow
      // 30b: aload 53
      // 30d: aload 50
      // 30f: lload 22
      // 311: bipush 1
      // 312: bipush 1
      // 313: anewarray 111
      // 316: dup
      // 317: bipush 0
      // 318: aload 48
      // 31a: getfield rip/breeze/inject/կ.string_ç_2 Ljava/lang/String;
      // 31d: lload 44
      // 31f: dup2_x1
      // 320: pop2
      // 321: bipush 2
      // 322: anewarray 4
      // 325: dup_x1
      // 326: swap
      // 327: bipush 1
      // 328: swap
      // 329: aastore
      // 32a: dup_x2
      // 32b: dup_x2
      // 32c: pop
      // 32d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 330: bipush 0
      // 331: swap
      // 332: aastore
      // 333: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 336: aastore
      // 337: bipush 5
      // 338: anewarray 4
      // 33b: dup_x1
      // 33c: swap
      // 33d: bipush 4
      // 33e: swap
      // 33f: aastore
      // 340: dup_x1
      // 341: swap
      // 342: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 345: bipush 3
      // 346: swap
      // 347: aastore
      // 348: dup_x2
      // 349: dup_x2
      // 34a: pop
      // 34b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34e: bipush 2
      // 34f: swap
      // 350: aastore
      // 351: dup_x1
      // 352: swap
      // 353: bipush 1
      // 354: swap
      // 355: aastore
      // 356: dup_x1
      // 357: swap
      // 358: bipush 0
      // 359: swap
      // 35a: aastore
      // 35b: invokestatic rip/breeze/classtransform/MathUtil3.checkCondition_2 ([Ljava/lang/Object;)Z
      // 35e: aload 51
      // 360: ifnull 446
      // 363: ifne 42d
      // 366: goto 36d
      // 369: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 36c: athrow
      // 36d: new rip/breeze/classtransform/գ
      // 370: dup
      // 371: aload 7
      // 373: aload 6
      // 375: lload 34
      // 377: sipush 28823
      // 37a: ldc2_w 1803768196163441951
      // 37d: lload 3
      // 37e: lxor
      // 37f: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/BreezeClass.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 384: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 387: aload 7
      // 389: lload 46
      // 38b: bipush 2
      // 38c: anewarray 4
      // 38f: dup_x2
      // 390: dup_x2
      // 391: pop
      // 392: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 395: bipush 1
      // 396: swap
      // 397: aastore
      // 398: dup_x1
      // 399: swap
      // 39a: bipush 0
      // 39b: swap
      // 39c: aastore
      // 39d: invokestatic rip/breeze/classtransform/և.getև_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 3a0: aconst_null
      // 3a1: lload 20
      // 3a3: bipush 2
      // 3a4: anewarray 4
      // 3a7: dup_x2
      // 3a8: dup_x2
      // 3a9: pop
      // 3aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ad: bipush 1
      // 3ae: swap
      // 3af: aastore
      // 3b0: dup_x1
      // 3b1: swap
      // 3b2: bipush 0
      // 3b3: swap
      // 3b4: aastore
      // 3b5: invokevirtual rip/breeze/classtransform/և.getև_6 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 3b8: bipush 1
      // 3b9: anewarray 111
      // 3bc: dup
      // 3bd: bipush 0
      // 3be: aload 48
      // 3c0: getfield rip/breeze/inject/կ.string_ç_2 Ljava/lang/String;
      // 3c3: lload 44
      // 3c5: dup2_x1
      // 3c6: pop2
      // 3c7: bipush 2
      // 3c8: anewarray 4
      // 3cb: dup_x1
      // 3cc: swap
      // 3cd: bipush 1
      // 3ce: swap
      // 3cf: aastore
      // 3d0: dup_x2
      // 3d1: dup_x2
      // 3d2: pop
      // 3d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3d6: bipush 0
      // 3d7: swap
      // 3d8: aastore
      // 3d9: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 3dc: aastore
      // 3dd: lload 32
      // 3df: dup2_x1
      // 3e0: pop2
      // 3e1: bipush 2
      // 3e2: anewarray 4
      // 3e5: dup_x1
      // 3e6: swap
      // 3e7: bipush 1
      // 3e8: swap
      // 3e9: aastore
      // 3ea: dup_x2
      // 3eb: dup_x2
      // 3ec: pop
      // 3ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f0: bipush 0
      // 3f1: swap
      // 3f2: aastore
      // 3f3: invokevirtual rip/breeze/classtransform/և.getև_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 3f6: lload 32
      // 3f8: aload 53
      // 3fa: bipush 2
      // 3fb: anewarray 4
      // 3fe: dup_x1
      // 3ff: swap
      // 400: bipush 1
      // 401: swap
      // 402: aastore
      // 403: dup_x2
      // 404: dup_x2
      // 405: pop
      // 406: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 409: bipush 0
      // 40a: swap
      // 40b: aastore
      // 40c: invokevirtual rip/breeze/classtransform/և.getև_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 40f: lload 36
      // 411: dup2_x1
      // 412: pop2
      // 413: bipush 2
      // 414: anewarray 4
      // 417: dup_x1
      // 418: swap
      // 419: bipush 1
      // 41a: swap
      // 41b: aastore
      // 41c: dup_x2
      // 41d: dup_x2
      // 41e: pop
      // 41f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 422: bipush 0
      // 423: swap
      // 424: aastore
      // 425: invokevirtual rip/breeze/classtransform/գ.getԳ_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 428: athrow
      // 429: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 42c: athrow
      // 42d: lload 26
      // 42f: aload 5
      // 431: bipush 2
      // 432: anewarray 4
      // 435: dup_x1
      // 436: swap
      // 437: bipush 1
      // 438: swap
      // 439: aastore
      // 43a: dup_x2
      // 43b: dup_x2
      // 43c: pop
      // 43d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 440: bipush 0
      // 441: swap
      // 442: aastore
      // 443: invokestatic rip/breeze/classtransform/MathUtil3.calculate ([Ljava/lang/Object;)I
      // 446: istore 49
      // 448: aload 0
      // 449: aload 48
      // 44b: aload 51
      // 44d: ifnull 46e
      // 450: bipush 0
      // 451: anewarray 4
      // 454: invokevirtual rip/breeze/inject/կ.ÿ ([Ljava/lang/Object;)I
      // 457: sipush 184
      // 45a: if_icmpne 46c
      // 45d: goto 464
      // 460: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 463: athrow
      // 464: aconst_null
      // 465: goto 471
      // 468: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 46b: athrow
      // 46c: aload 48
      // 46e: getfield rip/breeze/inject/կ.string_ç_2 Ljava/lang/String;
      // 471: aload 48
      // 473: getfield rip/breeze/inject/կ.string_å_2 Ljava/lang/String;
      // 476: iload 49
      // 478: istore 55
      // 47a: astore 56
      // 47c: astore 57
      // 47e: lload 12
      // 480: aload 57
      // 482: aload 56
      // 484: iload 55
      // 486: bipush 4
      // 487: anewarray 4
      // 48a: dup_x1
      // 48b: swap
      // 48c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 48f: bipush 3
      // 490: swap
      // 491: aastore
      // 492: dup_x1
      // 493: swap
      // 494: bipush 2
      // 495: swap
      // 496: aastore
      // 497: dup_x1
      // 498: swap
      // 499: bipush 1
      // 49a: swap
      // 49b: aastore
      // 49c: dup_x2
      // 49d: dup_x2
      // 49e: pop
      // 49f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a2: bipush 0
      // 4a3: swap
      // 4a4: aastore
      // 4a5: invokevirtual rip/breeze/classtransform/BreezeClass.þ ([Ljava/lang/Object;)[Lrip/breeze/inject/թ;
      // 4a8: astore 50
      // 4aa: aload 50
      // 4ac: bipush 0
      // 4ad: aaload
      // 4ae: astore 52
      // 4b0: aload 50
      // 4b2: bipush 1
      // 4b3: aaload
      // 4b4: astore 53
      // 4b6: iload 54
      // 4b8: lload 3
      // 4b9: lconst_0
      // 4ba: lcmp
      // 4bb: iflt 540
      // 4be: aload 51
      // 4c0: ifnull 540
      // 4c3: ifeq 526
      // 4c6: goto 4cd
      // 4c9: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 4cc: athrow
      // 4cd: aload 5
      // 4cf: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 4d2: aload 48
      // 4d4: new rip/breeze/inject/լ
      // 4d7: dup
      // 4d8: sipush 192
      // 4db: aload 48
      // 4dd: getfield rip/breeze/inject/կ.string_å_2 Ljava/lang/String;
      // 4e0: lload 24
      // 4e2: dup2_x1
      // 4e3: pop2
      // 4e4: bipush 2
      // 4e5: anewarray 4
      // 4e8: dup_x1
      // 4e9: swap
      // 4ea: bipush 1
      // 4eb: swap
      // 4ec: aastore
      // 4ed: dup_x2
      // 4ee: dup_x2
      // 4ef: pop
      // 4f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f3: bipush 0
      // 4f4: swap
      // 4f5: aastore
      // 4f6: invokestatic rip/breeze/classtransform/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 4f9: bipush 0
      // 4fa: anewarray 4
      // 4fd: invokevirtual rip/breeze/inject/MathUtil3.buildString_3 ([Ljava/lang/Object;)Ljava/lang/String;
      // 500: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 503: lload 40
      // 505: bipush 3
      // 506: anewarray 4
      // 509: dup_x2
      // 50a: dup_x2
      // 50b: pop
      // 50c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 50f: bipush 2
      // 510: swap
      // 511: aastore
      // 512: dup_x1
      // 513: swap
      // 514: bipush 1
      // 515: swap
      // 516: aastore
      // 517: dup_x1
      // 518: swap
      // 519: bipush 0
      // 51a: swap
      // 51b: aastore
      // 51c: invokevirtual rip/breeze/inject/թ.method_016 ([Ljava/lang/Object;)V
      // 51f: goto 526
      // 522: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 525: athrow
      // 526: aload 7
      // 528: lload 3
      // 529: lconst_0
      // 52a: lcmp
      // 52b: ifle 59e
      // 52e: aload 51
      // 530: ifnull 59e
      // 533: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 536: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 539: goto 540
      // 53c: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 53f: athrow
      // 540: ifne 5fe
      // 543: aload 5
      // 545: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 548: aload 48
      // 54a: aload 52
      // 54c: lload 42
      // 54e: bipush 3
      // 54f: anewarray 4
      // 552: dup_x2
      // 553: dup_x2
      // 554: pop
      // 555: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 558: bipush 2
      // 559: swap
      // 55a: aastore
      // 55b: dup_x1
      // 55c: swap
      // 55d: bipush 1
      // 55e: swap
      // 55f: aastore
      // 560: dup_x1
      // 561: swap
      // 562: bipush 0
      // 563: swap
      // 564: aastore
      // 565: invokevirtual rip/breeze/inject/թ.method_019 ([Ljava/lang/Object;)V
      // 568: aload 5
      // 56a: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 56d: lload 28
      // 56f: aload 48
      // 571: new rip/breeze/inject/ի
      // 574: dup
      // 575: bipush 25
      // 577: bipush 0
      // 578: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 57b: bipush 3
      // 57c: anewarray 4
      // 57f: dup_x1
      // 580: swap
      // 581: bipush 2
      // 582: swap
      // 583: aastore
      // 584: dup_x1
      // 585: swap
      // 586: bipush 1
      // 587: swap
      // 588: aastore
      // 589: dup_x2
      // 58a: dup_x2
      // 58b: pop
      // 58c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 58f: bipush 0
      // 590: swap
      // 591: aastore
      // 592: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 595: aload 5
      // 597: goto 59e
      // 59a: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 59d: athrow
      // 59e: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 5a1: aload 48
      // 5a3: aload 53
      // 5a5: lload 42
      // 5a7: bipush 3
      // 5a8: anewarray 4
      // 5ab: dup_x2
      // 5ac: dup_x2
      // 5ad: pop
      // 5ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b1: bipush 2
      // 5b2: swap
      // 5b3: aastore
      // 5b4: dup_x1
      // 5b5: swap
      // 5b6: bipush 1
      // 5b7: swap
      // 5b8: aastore
      // 5b9: dup_x1
      // 5ba: swap
      // 5bb: bipush 0
      // 5bc: swap
      // 5bd: aastore
      // 5be: invokevirtual rip/breeze/inject/թ.method_019 ([Ljava/lang/Object;)V
      // 5c1: new rip/breeze/inject/կ
      // 5c4: dup
      // 5c5: aload 2
      // 5c6: getfield rip/breeze/inject/é.int_û_2 I
      // 5c9: invokestatic java/lang/reflect/Modifier.isInterface (I)Z
      // 5cc: ifeq 5d9
      // 5cf: sipush 185
      // 5d2: goto 5dc
      // 5d5: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 5d8: athrow
      // 5d9: sipush 182
      // 5dc: aload 2
      // 5dd: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 5e0: aload 7
      // 5e2: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 5e5: lload 16
      // 5e7: dup2_x1
      // 5e8: pop2
      // 5e9: aload 7
      // 5eb: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 5ee: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
      // 5f1: astore 58
      // 5f3: lload 3
      // 5f4: lconst_0
      // 5f5: lcmp
      // 5f6: iflt 64e
      // 5f9: aload 51
      // 5fb: ifnonnull 61f
      // 5fe: new rip/breeze/inject/կ
      // 601: dup
      // 602: sipush 184
      // 605: aload 2
      // 606: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 609: aload 7
      // 60b: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 60e: aload 7
      // 610: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 613: aload 2
      // 614: getfield rip/breeze/inject/é.int_û_2 I
      // 617: invokestatic java/lang/reflect/Modifier.isInterface (I)Z
      // 61a: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 61d: astore 58
      // 61f: aload 5
      // 621: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 624: aload 48
      // 626: aload 58
      // 628: lload 14
      // 62a: bipush 3
      // 62b: anewarray 4
      // 62e: dup_x2
      // 62f: dup_x2
      // 630: pop
      // 631: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 634: bipush 2
      // 635: swap
      // 636: aastore
      // 637: dup_x1
      // 638: swap
      // 639: bipush 1
      // 63a: swap
      // 63b: aastore
      // 63c: dup_x1
      // 63d: swap
      // 63e: bipush 0
      // 63f: swap
      // 640: aastore
      // 641: invokevirtual rip/breeze/inject/թ.method_011 ([Ljava/lang/Object;)V
      // 644: aload 9
      // 646: aload 58
      // 648: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 64d: pop
      // 64e: lload 3
      // 64f: lconst_0
      // 650: lcmp
      // 651: iflt 660
      // 654: invokestatic rip/breeze/inject/ջ.method_013 ()Z
      // 657: ifne 667
      // 65a: ldc_w "fvzAm"
      // 65d: invokestatic rip/breeze/classtransform/PlayerUtil8.initialize (Ljava/lang/String;)V
      // 660: goto 667
      // 663: invokestatic rip/breeze/classtransform/BreezeClass.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 666: athrow
      // 667: return
      // try (201 -> 227): 228 rip/breeze/classtransform/գ
      // try (226 -> 328): 328 rip/breeze/classtransform/գ
      // try (333 -> 336): 337 rip/breeze/classtransform/գ
      // try (343 -> 355): 356 rip/breeze/classtransform/գ
      // try (353 -> 383): 384 rip/breeze/classtransform/գ
      // try (358 -> 387): 388 rip/breeze/classtransform/գ
      // try (386 -> 471): 471 rip/breeze/classtransform/գ
      // try (533 -> 536): 537 rip/breeze/classtransform/գ
      // try (535 -> 663): 663 rip/breeze/classtransform/գ
      // try (683 -> 692): 693 rip/breeze/classtransform/գ
      // try (687 -> 697): 697 rip/breeze/classtransform/գ
      // try (746 -> 754): 755 rip/breeze/classtransform/գ
      // try (753 -> 808): 809 rip/breeze/classtransform/գ
      // try (811 -> 820): 821 rip/breeze/classtransform/գ
      // try (823 -> 879): 880 rip/breeze/classtransform/գ
      // try (882 -> 914): 914 rip/breeze/classtransform/գ
      // try (948 -> 985): 986 rip/breeze/classtransform/գ
   }

   static {
      long var10000 = rip.breeze.inject.Util138.getIBreezeInterface(607021547848016585L, 3490545414994160407L, MethodHandles.lookup().lookupClass())
         .method_003(266370075918630L);
      long var0 = var10000 ^ 67272004448668L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "ÅôÓà\u008fvM0h1¦\u0004\u00103\u009dÒÖ\u0085¼ðPkËb\u0088f\u001cBà\u0015ÆE)i\u0000%\u008dW`iý`eöj\b/%*\u0093\t\u00ad¬Uª\u0019Q\u009a\u0088'~\u0004\u0098PåÖå`Vî®aZs+óeáiyÆyK\u0095(ÖsMX{©[GPÅPiFù\u007f\u008cUc\u009e\u00821\u0012P\u0097\u001dÂ_\u0000Æ\u008d\u0099£M´\u0095\u008d\u0010`\u0089Ãª;\b\u008a4\u0013±\u009cªTÀ#f=UDµ\u001eÞTè»Yæ\u00901qiA._¨\u0006\u008cE8B1ÕÏ¬]!\u0095d;H.Ü\u0016\u0083{hï½è\n?\u0094ô\rHÍì÷\u0010ºâGùN\u0010sùG-è´\u009fÕlL.Ë,uÜ/s+x_\u009a,jI£(\u0012ñ´g\\j½^¨NÀpÆßPH\u0087ðPôn{©\u007f\u00958\u007fæª²\u0084#\u0017 7~\u000b\u0005Å0\u0001\u001b°\\¸kP\u0080t.\tWÎ\u009f>\u0007ÕÄD";
      int var7 = "ÅôÓà\u008fvM0h1¦\u0004\u00103\u009dÒÖ\u0085¼ðPkËb\u0088f\u001cBà\u0015ÆE)i\u0000%\u008dW`iý`eöj\b/%*\u0093\t\u00ad¬Uª\u0019Q\u009a\u0088'~\u0004\u0098PåÖå`Vî®aZs+óeáiyÆyK\u0095(ÖsMX{©[GPÅPiFù\u007f\u008cUc\u009e\u00821\u0012P\u0097\u001dÂ_\u0000Æ\u008d\u0099£M´\u0095\u008d\u0010`\u0089Ãª;\b\u008a4\u0013±\u009cªTÀ#f=UDµ\u001eÞTè»Yæ\u00901qiA._¨\u0006\u008cE8B1ÕÏ¬]!\u0095d;H.Ü\u0016\u0083{hï½è\n?\u0094ô\rHÍì÷\u0010ºâGùN\u0010sùG-è´\u009fÕlL.Ë,uÜ/s+x_\u009a,jI£(\u0012ñ´g\\j½^¨NÀpÆßPH\u0087ðPôn{©\u007f\u00958\u007fæª²\u0084#\u0017 7~\u000b\u0005Å0\u0001\u001b°\\¸kP\u0080t.\tWÎ\u009f>\u0007ÕÄD"
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
            CONST_C = new String[3];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3482;
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
            throw new RuntimeException("rip/breeze/classtransform/f", var10);
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
         throw new RuntimeException("rip/breeze/classtransform/f" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
