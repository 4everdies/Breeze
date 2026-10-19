package rip.breeze.classtransform;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.classtransform.annotations.injection.CInject;
import rip.breeze.inject.BreezeClass12;
import rip.breeze.inject.թ;

public class MathUtil11 extends Util140<CInject> {
   private static final String[] CONST_I;
   private static final String[] CONST_J;
   private static final Map CONST_K = new HashMap(13);

   public MathUtil11() {
      super(CInject.class, MathUtil11::lambda$new_Inner0);
   }

   @Override
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
      // 004: checkcast rip/breeze/classtransform/annotations/injection/CInject
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast rip/breeze/classtransform/ó
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 4
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast rip/breeze/inject/é
      // 020: astore 6
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast rip/breeze/inject/é
      // 028: astore 7
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast rip/breeze/inject/BreezeClass12
      // 030: astore 8
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast rip/breeze/inject/BreezeClass12
      // 039: astore 9
      // 03b: pop
      // 03c: getstatic rip/breeze/classtransform/MathUtil11.encKey_b J
      // 03f: lload 4
      // 041: lxor
      // 042: lstore 4
      // 044: lload 4
      // 046: dup2
      // 047: ldc2_w 42505100713196
      // 04a: lxor
      // 04b: lstore 10
      // 04d: dup2
      // 04e: ldc2_w 54482951933249
      // 051: lxor
      // 052: lstore 12
      // 054: dup2
      // 055: ldc2_w 96721824551927
      // 058: lxor
      // 059: lstore 14
      // 05b: dup2
      // 05c: ldc2_w 10584013720812
      // 05f: lxor
      // 060: lstore 16
      // 062: dup2
      // 063: ldc2_w 111521819906648
      // 066: lxor
      // 067: lstore 18
      // 069: dup2
      // 06a: ldc2_w 138722971959545
      // 06d: lxor
      // 06e: lstore 20
      // 070: dup2
      // 071: ldc2_w 134779892017431
      // 074: lxor
      // 075: lstore 22
      // 077: dup2
      // 078: ldc2_w 99473819162208
      // 07b: lxor
      // 07c: lstore 24
      // 07e: dup2
      // 07f: ldc2_w 63685616994984
      // 082: lxor
      // 083: lstore 26
      // 085: dup2
      // 086: ldc2_w 51642685710426
      // 089: lxor
      // 08a: lstore 28
      // 08c: dup2
      // 08d: ldc2_w 71219574452733
      // 090: lxor
      // 091: lstore 30
      // 093: dup2
      // 094: ldc2_w 28998803702952
      // 097: lxor
      // 098: lstore 32
      // 09a: dup2
      // 09b: ldc2_w 37339739520855
      // 09e: lxor
      // 09f: lstore 34
      // 0a1: dup2
      // 0a2: ldc2_w 101406291567119
      // 0a5: lxor
      // 0a6: lstore 36
      // 0a8: dup2
      // 0a9: ldc2_w 44040053102642
      // 0ac: lxor
      // 0ad: lstore 38
      // 0af: dup2
      // 0b0: ldc2_w 7132788450551
      // 0b3: lxor
      // 0b4: lstore 40
      // 0b6: dup2
      // 0b7: ldc2_w 11485832094186
      // 0ba: lxor
      // 0bb: lstore 42
      // 0bd: dup2
      // 0be: ldc2_w 102262975478299
      // 0c1: lxor
      // 0c2: lstore 44
      // 0c4: dup2
      // 0c5: ldc2_w 94095721826580
      // 0c8: lxor
      // 0c9: lstore 46
      // 0cb: pop2
      // 0cc: invokestatic rip/breeze/classtransform/BreezeClass5.getValue ()I
      // 0cf: istore 48
      // 0d1: aload 9
      // 0d3: iload 48
      // 0d5: ifeq 127
      // 0d8: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 0db: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 0de: aload 8
      // 0e0: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 0e3: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 0e6: if_icmpeq 125
      // 0e9: goto 0f0
      // 0ec: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 0ef: athrow
      // 0f0: aload 8
      // 0f2: lload 36
      // 0f4: aload 7
      // 0f6: aload 9
      // 0f8: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 0fb: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 0fe: bipush 4
      // 0ff: anewarray 119
      // 102: dup_x1
      // 103: swap
      // 104: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 107: bipush 3
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: bipush 2
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x2
      // 110: dup_x2
      // 111: pop
      // 112: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 115: bipush 1
      // 116: swap
      // 117: aastore
      // 118: dup_x1
      // 119: swap
      // 11a: bipush 0
      // 11b: swap
      // 11c: aastore
      // 11d: invokestatic rip/breeze/classtransform/գ.getԳ ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 120: athrow
      // 121: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 124: athrow
      // 125: aload 8
      // 127: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 12a: lload 16
      // 12c: bipush 2
      // 12d: anewarray 119
      // 130: dup_x2
      // 131: dup_x2
      // 132: pop
      // 133: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 136: bipush 1
      // 137: swap
      // 138: aastore
      // 139: dup_x1
      // 13a: swap
      // 13b: bipush 0
      // 13c: swap
      // 13d: aastore
      // 13e: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 141: astore 49
      // 143: aload 9
      // 145: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 148: lload 16
      // 14a: bipush 2
      // 14b: anewarray 119
      // 14e: dup_x2
      // 14f: dup_x2
      // 150: pop
      // 151: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 154: bipush 1
      // 155: swap
      // 156: aastore
      // 157: dup_x1
      // 158: swap
      // 159: bipush 0
      // 15a: swap
      // 15b: aastore
      // 15c: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 15f: astore 50
      // 161: aload 49
      // 163: arraylength
      // 164: iload 48
      // 166: lload 4
      // 168: lconst_0
      // 169: lcmp
      // 16a: ifle 1aa
      // 16d: ifeq 1a8
      // 170: ifne 1a5
      // 173: goto 17a
      // 176: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 179: athrow
      // 17a: bipush 0
      // 17b: istore 51
      // 17d: bipush 0
      // 17e: istore 52
      // 180: lload 4
      // 182: lconst_0
      // 183: lcmp
      // 184: ifle 36e
      // 187: iload 48
      // 189: ifne 36e
      // 18c: invokestatic rip/breeze/inject/ջ.method_013 ()Z
      // 18f: ifeq 1a1
      // 192: goto 199
      // 195: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 198: athrow
      // 199: bipush 0
      // 19a: goto 1a2
      // 19d: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1a0: athrow
      // 1a1: bipush 1
      // 1a2: invokestatic rip/breeze/inject/ջ.method_011 (Z)V
      // 1a5: aload 49
      // 1a7: arraylength
      // 1a8: iload 48
      // 1aa: lload 4
      // 1ac: lconst_0
      // 1ad: lcmp
      // 1ae: iflt 1b5
      // 1b1: ifeq 24e
      // 1b4: bipush 1
      // 1b5: if_icmpne 227
      // 1b8: goto 1bf
      // 1bb: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1be: athrow
      // 1bf: aload 49
      // 1c1: bipush 0
      // 1c2: aaload
      // 1c3: lload 40
      // 1c5: ldc rip/breeze/classtransform/InjectionCallback
      // 1c7: bipush 2
      // 1c8: anewarray 119
      // 1cb: dup_x1
      // 1cc: swap
      // 1cd: bipush 1
      // 1ce: swap
      // 1cf: aastore
      // 1d0: dup_x2
      // 1d1: dup_x2
      // 1d2: pop
      // 1d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d6: bipush 0
      // 1d7: swap
      // 1d8: aastore
      // 1d9: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 1dc: lload 34
      // 1de: bipush 3
      // 1df: anewarray 119
      // 1e2: dup_x2
      // 1e3: dup_x2
      // 1e4: pop
      // 1e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e8: bipush 2
      // 1e9: swap
      // 1ea: aastore
      // 1eb: dup_x1
      // 1ec: swap
      // 1ed: bipush 1
      // 1ee: swap
      // 1ef: aastore
      // 1f0: dup_x1
      // 1f1: swap
      // 1f2: bipush 0
      // 1f3: swap
      // 1f4: aastore
      // 1f5: invokestatic rip/breeze/classtransform/MathUtil3.checkCondition_3 ([Ljava/lang/Object;)Z
      // 1f8: iload 48
      // 1fa: lload 4
      // 1fc: lconst_0
      // 1fd: lcmp
      // 1fe: iflt 250
      // 201: ifeq 24e
      // 204: goto 20b
      // 207: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 20a: athrow
      // 20b: ifeq 227
      // 20e: goto 215
      // 211: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 214: athrow
      // 215: bipush 0
      // 216: istore 51
      // 218: bipush 1
      // 219: istore 52
      // 21b: lload 4
      // 21d: lconst_0
      // 21e: lcmp
      // 21f: ifle 36e
      // 222: iload 48
      // 224: ifne 36e
      // 227: lload 10
      // 229: aload 50
      // 22b: aload 49
      // 22d: bipush 3
      // 22e: anewarray 119
      // 231: dup_x1
      // 232: swap
      // 233: bipush 2
      // 234: swap
      // 235: aastore
      // 236: dup_x1
      // 237: swap
      // 238: bipush 1
      // 239: swap
      // 23a: aastore
      // 23b: dup_x2
      // 23c: dup_x2
      // 23d: pop
      // 23e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 241: bipush 0
      // 242: swap
      // 243: aastore
      // 244: invokestatic rip/breeze/classtransform/MathUtil3.isValid_3 ([Ljava/lang/Object;)Z
      // 247: goto 24e
      // 24a: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 24d: athrow
      // 24e: iload 48
      // 250: lload 4
      // 252: lconst_0
      // 253: lcmp
      // 254: iflt 2cd
      // 257: ifeq 2cb
      // 25a: ifeq 276
      // 25d: goto 264
      // 260: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 263: athrow
      // 264: bipush 1
      // 265: istore 51
      // 267: bipush 0
      // 268: istore 52
      // 26a: lload 4
      // 26c: lconst_0
      // 26d: lcmp
      // 26e: ifle 36e
      // 271: iload 48
      // 273: ifne 36e
      // 276: aload 50
      // 278: aload 49
      // 27a: lload 22
      // 27c: bipush 0
      // 27d: bipush 1
      // 27e: anewarray 170
      // 281: dup
      // 282: bipush 0
      // 283: lload 40
      // 285: ldc rip/breeze/classtransform/InjectionCallback
      // 287: bipush 2
      // 288: anewarray 119
      // 28b: dup_x1
      // 28c: swap
      // 28d: bipush 1
      // 28e: swap
      // 28f: aastore
      // 290: dup_x2
      // 291: dup_x2
      // 292: pop
      // 293: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 296: bipush 0
      // 297: swap
      // 298: aastore
      // 299: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 29c: aastore
      // 29d: bipush 5
      // 29e: anewarray 119
      // 2a1: dup_x1
      // 2a2: swap
      // 2a3: bipush 4
      // 2a4: swap
      // 2a5: aastore
      // 2a6: dup_x1
      // 2a7: swap
      // 2a8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2ab: bipush 3
      // 2ac: swap
      // 2ad: aastore
      // 2ae: dup_x2
      // 2af: dup_x2
      // 2b0: pop
      // 2b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b4: bipush 2
      // 2b5: swap
      // 2b6: aastore
      // 2b7: dup_x1
      // 2b8: swap
      // 2b9: bipush 1
      // 2ba: swap
      // 2bb: aastore
      // 2bc: dup_x1
      // 2bd: swap
      // 2be: bipush 0
      // 2bf: swap
      // 2c0: aastore
      // 2c1: invokestatic rip/breeze/classtransform/MathUtil3.checkCondition_2 ([Ljava/lang/Object;)Z
      // 2c4: goto 2cb
      // 2c7: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2ca: athrow
      // 2cb: iload 48
      // 2cd: ifeq 2db
      // 2d0: ifeq 2ec
      // 2d3: goto 2da
      // 2d6: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2d9: athrow
      // 2da: bipush 1
      // 2db: istore 51
      // 2dd: bipush 1
      // 2de: istore 52
      // 2e0: lload 4
      // 2e2: lconst_0
      // 2e3: lcmp
      // 2e4: iflt 36e
      // 2e7: iload 48
      // 2e9: ifne 36e
      // 2ec: new rip/breeze/classtransform/գ
      // 2ef: dup
      // 2f0: aload 8
      // 2f2: aload 7
      // 2f4: lload 28
      // 2f6: sipush 24614
      // 2f9: ldc2_w 5854041770644825981
      // 2fc: lload 4
      // 2fe: lxor
      // 2ff: invokedynamic f (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil11.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 307: aload 9
      // 309: lload 42
      // 30b: bipush 2
      // 30c: anewarray 119
      // 30f: dup_x2
      // 310: dup_x2
      // 311: pop
      // 312: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 315: bipush 1
      // 316: swap
      // 317: aastore
      // 318: dup_x1
      // 319: swap
      // 31a: bipush 0
      // 31b: swap
      // 31c: aastore
      // 31d: invokestatic rip/breeze/classtransform/և.getև_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 320: lload 40
      // 322: ldc rip/breeze/classtransform/InjectionCallback
      // 324: bipush 2
      // 325: anewarray 119
      // 328: dup_x1
      // 329: swap
      // 32a: bipush 1
      // 32b: swap
      // 32c: aastore
      // 32d: dup_x2
      // 32e: dup_x2
      // 32f: pop
      // 330: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 333: bipush 0
      // 334: swap
      // 335: aastore
      // 336: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 339: lload 20
      // 33b: bipush 2
      // 33c: anewarray 119
      // 33f: dup_x2
      // 340: dup_x2
      // 341: pop
      // 342: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 345: bipush 1
      // 346: swap
      // 347: aastore
      // 348: dup_x1
      // 349: swap
      // 34a: bipush 0
      // 34b: swap
      // 34c: aastore
      // 34d: invokevirtual rip/breeze/classtransform/և.getև_6 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 350: lload 30
      // 352: dup2_x1
      // 353: pop2
      // 354: bipush 2
      // 355: anewarray 119
      // 358: dup_x1
      // 359: swap
      // 35a: bipush 1
      // 35b: swap
      // 35c: aastore
      // 35d: dup_x2
      // 35e: dup_x2
      // 35f: pop
      // 360: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 363: bipush 0
      // 364: swap
      // 365: aastore
      // 366: invokevirtual rip/breeze/classtransform/գ.getԳ_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 369: athrow
      // 36a: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 36d: athrow
      // 36e: aload 8
      // 370: iload 48
      // 372: ifeq 409
      // 375: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 378: lload 24
      // 37a: dup2_x1
      // 37b: pop2
      // 37c: bipush 2
      // 37d: anewarray 119
      // 380: dup_x1
      // 381: swap
      // 382: bipush 1
      // 383: swap
      // 384: aastore
      // 385: dup_x2
      // 386: dup_x2
      // 387: pop
      // 388: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38b: bipush 0
      // 38c: swap
      // 38d: aastore
      // 38e: invokestatic rip/breeze/classtransform/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 391: getstatic rip/breeze/inject/MathUtil3.CONST_Ð Lrip/breeze/inject/MathUtil3;
      // 394: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 397: ifne 3c6
      // 39a: goto 3a1
      // 39d: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 3a0: athrow
      // 3a1: aload 8
      // 3a3: lload 26
      // 3a5: aload 7
      // 3a7: bipush 3
      // 3a8: anewarray 119
      // 3ab: dup_x1
      // 3ac: swap
      // 3ad: bipush 2
      // 3ae: swap
      // 3af: aastore
      // 3b0: dup_x2
      // 3b1: dup_x2
      // 3b2: pop
      // 3b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b6: bipush 1
      // 3b7: swap
      // 3b8: aastore
      // 3b9: dup_x1
      // 3ba: swap
      // 3bb: bipush 0
      // 3bc: swap
      // 3bd: aastore
      // 3be: invokestatic rip/breeze/classtransform/գ.getԳ_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 3c1: athrow
      // 3c2: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 3c5: athrow
      // 3c6: aload 0
      // 3c7: aload 8
      // 3c9: aload 9
      // 3cb: aload 7
      // 3cd: lload 12
      // 3cf: aload 6
      // 3d1: sipush 17744
      // 3d4: ldc2_w 7837451441554342408
      // 3d7: lload 4
      // 3d9: lxor
      // 3da: invokedynamic f (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil11.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3df: bipush 6
      // 3e1: anewarray 119
      // 3e4: dup_x1
      // 3e5: swap
      // 3e6: bipush 5
      // 3e7: swap
      // 3e8: aastore
      // 3e9: dup_x1
      // 3ea: swap
      // 3eb: bipush 4
      // 3ec: swap
      // 3ed: aastore
      // 3ee: dup_x2
      // 3ef: dup_x2
      // 3f0: pop
      // 3f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f4: bipush 3
      // 3f5: swap
      // 3f6: aastore
      // 3f7: dup_x1
      // 3f8: swap
      // 3f9: bipush 2
      // 3fa: swap
      // 3fb: aastore
      // 3fc: dup_x1
      // 3fd: swap
      // 3fe: bipush 1
      // 3ff: swap
      // 400: aastore
      // 401: dup_x1
      // 402: swap
      // 403: bipush 0
      // 404: swap
      // 405: aastore
      // 406: invokevirtual rip/breeze/classtransform/MathUtil11.ø ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass12;
      // 409: astore 49
      // 40b: aload 3
      // 40c: bipush 0
      // 40d: anewarray 119
      // 410: invokevirtual rip/breeze/classtransform/ó.method_003 ([Ljava/lang/Object;)Ljava/util/Map;
      // 413: astore 50
      // 415: new java/util/ArrayList
      // 418: dup
      // 419: invokespecial java/util/ArrayList.<init> ()V
      // 41c: astore 53
      // 41e: aload 2
      // 41f: invokeinterface rip/breeze/classtransform/annotations/injection/CInject.target ()[Lrip/breeze/classtransform/annotations/CTarget; 1
      // 424: astore 54
      // 426: aload 54
      // 428: arraylength
      // 429: istore 55
      // 42b: bipush 0
      // 42c: istore 56
      // 42e: iload 56
      // 430: iload 55
      // 432: if_icmpge 791
      // 435: aload 54
      // 437: iload 56
      // 439: aaload
      // 43a: astore 57
      // 43c: aload 50
      // 43e: aload 57
      // 440: invokeinterface rip/breeze/classtransform/annotations/CTarget.value ()Ljava/lang/String; 1
      // 445: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 448: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 44b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 450: checkcast rip/breeze/classtransform/â
      // 453: astore 58
      // 455: aload 58
      // 457: iload 48
      // 459: ifeq 48a
      // 45c: ifnonnull 488
      // 45f: goto 466
      // 462: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 465: athrow
      // 466: new rip/breeze/classtransform/ե
      // 469: dup
      // 46a: aload 8
      // 46c: aload 7
      // 46e: aload 57
      // 470: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 475: lload 46
      // 477: dup2_x1
      // 478: pop2
      // 479: aload 50
      // 47b: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 480: invokespecial rip/breeze/classtransform/ե.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;Ljava/util/Collection;)V
      // 483: athrow
      // 484: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 487: athrow
      // 488: aload 58
      // 48a: aload 50
      // 48c: aload 9
      // 48e: lload 44
      // 490: aload 57
      // 492: bipush 4
      // 493: anewarray 119
      // 496: dup_x1
      // 497: swap
      // 498: bipush 3
      // 499: swap
      // 49a: aastore
      // 49b: dup_x2
      // 49c: dup_x2
      // 49d: pop
      // 49e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a1: bipush 2
      // 4a2: swap
      // 4a3: aastore
      // 4a4: dup_x1
      // 4a5: swap
      // 4a6: bipush 1
      // 4a7: swap
      // 4a8: aastore
      // 4a9: dup_x1
      // 4aa: swap
      // 4ab: bipush 0
      // 4ac: swap
      // 4ad: aastore
      // 4ae: invokeinterface rip/breeze/classtransform/â.method_001 ([Ljava/lang/Object;)Ljava/util/List; 2
      // 4b3: astore 59
      // 4b5: aload 58
      // 4b7: aload 57
      // 4b9: bipush 1
      // 4ba: anewarray 119
      // 4bd: dup_x1
      // 4be: swap
      // 4bf: bipush 0
      // 4c0: swap
      // 4c1: aastore
      // 4c2: invokeinterface rip/breeze/classtransform/â.method_002 ([Ljava/lang/Object;)Lrip/breeze/classtransform/annotations/CTarget$Shift; 2
      // 4c7: astore 60
      // 4c9: aload 59
      // 4cb: iload 48
      // 4cd: lload 4
      // 4cf: lconst_0
      // 4d0: lcmp
      // 4d1: iflt 549
      // 4d4: ifeq 547
      // 4d7: ifnonnull 545
      // 4da: goto 4e1
      // 4dd: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 4e0: athrow
      // 4e1: new rip/breeze/classtransform/գ
      // 4e4: dup
      // 4e5: aload 8
      // 4e7: aload 7
      // 4e9: new java/lang/StringBuilder
      // 4ec: dup
      // 4ed: invokespecial java/lang/StringBuilder.<init> ()V
      // 4f0: sipush 13321
      // 4f3: ldc2_w 1421691356027302742
      // 4f6: lload 4
      // 4f8: lxor
      // 4f9: invokedynamic f (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil11.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 501: aload 57
      // 503: invokeinterface rip/breeze/classtransform/annotations/CTarget.value ()Ljava/lang/String; 1
      // 508: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 50b: sipush 22154
      // 50e: ldc2_w 9064148824676749782
      // 511: lload 4
      // 513: lxor
      // 514: invokedynamic f (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil11.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 519: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 51c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 51f: lload 28
      // 521: dup2_x1
      // 522: pop2
      // 523: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 526: sipush 25947
      // 529: ldc2_w 7270585742043800065
      // 52c: lload 4
      // 52e: lxor
      // 52f: invokedynamic f (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil11.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 534: bipush 1
      // 535: anewarray 119
      // 538: dup_x1
      // 539: swap
      // 53a: bipush 0
      // 53b: swap
      // 53c: aastore
      // 53d: invokevirtual rip/breeze/classtransform/գ.getԳ_8 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 540: athrow
      // 541: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 544: athrow
      // 545: aload 59
      // 547: iload 48
      // 549: ifeq 5d2
      // 54c: invokeinterface java/util/List.isEmpty ()Z 1
      // 551: ifeq 5d0
      // 554: goto 55b
      // 557: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 55a: athrow
      // 55b: aload 57
      // 55d: invokeinterface rip/breeze/classtransform/annotations/CTarget.optional ()Z 1
      // 562: ifne 5d0
      // 565: goto 56c
      // 568: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 56b: athrow
      // 56c: new rip/breeze/classtransform/գ
      // 56f: dup
      // 570: aload 8
      // 572: aload 7
      // 574: new java/lang/StringBuilder
      // 577: dup
      // 578: invokespecial java/lang/StringBuilder.<init> ()V
      // 57b: sipush 27622
      // 57e: ldc2_w 8154750058913000635
      // 581: lload 4
      // 583: lxor
      // 584: invokedynamic f (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil11.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 589: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 58c: aload 57
      // 58e: invokeinterface rip/breeze/classtransform/annotations/CTarget.value ()Ljava/lang/String; 1
      // 593: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 596: sipush 20687
      // 599: ldc2_w 866609869951227800
      // 59c: lload 4
      // 59e: lxor
      // 59f: invokedynamic f (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil11.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5aa: lload 28
      // 5ac: dup2_x1
      // 5ad: pop2
      // 5ae: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 5b1: sipush 13826
      // 5b4: ldc2_w 8737496812953973076
      // 5b7: lload 4
      // 5b9: lxor
      // 5ba: invokedynamic f (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil11.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5bf: bipush 1
      // 5c0: anewarray 119
      // 5c3: dup_x1
      // 5c4: swap
      // 5c5: bipush 0
      // 5c6: swap
      // 5c7: aastore
      // 5c8: invokevirtual rip/breeze/classtransform/գ.getԳ_8 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 5cb: athrow
      // 5cc: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 5cf: athrow
      // 5d0: aload 59
      // 5d2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 5d7: astore 61
      // 5d9: aload 61
      // 5db: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5e0: ifeq 782
      // 5e3: aload 61
      // 5e5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5ea: checkcast rip/breeze/inject/ջ
      // 5ed: astore 62
      // 5ef: aload 62
      // 5f1: bipush 0
      // 5f2: anewarray 119
      // 5f5: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 5f8: sipush 172
      // 5fb: iload 48
      // 5fd: ifeq 432
      // 600: iload 48
      // 602: lload 4
      // 604: lconst_0
      // 605: lcmp
      // 606: iflt 5fd
      // 609: ifeq 64b
      // 60c: if_icmplt 638
      // 60f: goto 616
      // 612: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 615: athrow
      // 616: aload 62
      // 618: bipush 0
      // 619: anewarray 119
      // 61c: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 61f: sipush 177
      // 622: iload 48
      // 624: ifeq 64b
      // 627: goto 62e
      // 62a: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 62d: athrow
      // 62e: if_icmple 64e
      // 631: goto 638
      // 634: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 637: athrow
      // 638: aload 62
      // 63a: bipush 0
      // 63b: anewarray 119
      // 63e: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 641: sipush 191
      // 644: goto 64b
      // 647: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 64a: athrow
      // 64b: if_icmpne 6b2
      // 64e: aload 0
      // 64f: aload 6
      // 651: aload 9
      // 653: aload 8
      // 655: aload 2
      // 656: invokeinterface rip/breeze/classtransform/annotations/injection/CInject.cancellable ()Z 1
      // 65b: lload 32
      // 65d: dup2_x1
      // 65e: pop2
      // 65f: iload 51
      // 661: iload 52
      // 663: aload 53
      // 665: bipush 8
      // 667: anewarray 119
      // 66a: dup_x1
      // 66b: swap
      // 66c: bipush 7
      // 66e: swap
      // 66f: aastore
      // 670: dup_x1
      // 671: swap
      // 672: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 675: bipush 6
      // 677: swap
      // 678: aastore
      // 679: dup_x1
      // 67a: swap
      // 67b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 67e: bipush 5
      // 67f: swap
      // 680: aastore
      // 681: dup_x1
      // 682: swap
      // 683: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 686: bipush 4
      // 687: swap
      // 688: aastore
      // 689: dup_x2
      // 68a: dup_x2
      // 68b: pop
      // 68c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68f: bipush 3
      // 690: swap
      // 691: aastore
      // 692: dup_x1
      // 693: swap
      // 694: bipush 2
      // 695: swap
      // 696: aastore
      // 697: dup_x1
      // 698: swap
      // 699: bipush 1
      // 69a: swap
      // 69b: aastore
      // 69c: dup_x1
      // 69d: swap
      // 69e: bipush 0
      // 69f: swap
      // 6a0: aastore
      // 6a1: invokespecial rip/breeze/classtransform/MathUtil11.getԹ_2 ([Ljava/lang/Object;)Lrip/breeze/inject/թ;
      // 6a4: astore 63
      // 6a6: lload 4
      // 6a8: lconst_0
      // 6a9: lcmp
      // 6aa: iflt 70a
      // 6ad: iload 48
      // 6af: ifne 70a
      // 6b2: aload 0
      // 6b3: aload 6
      // 6b5: aload 9
      // 6b7: aload 8
      // 6b9: aload 2
      // 6ba: invokeinterface rip/breeze/classtransform/annotations/injection/CInject.cancellable ()Z 1
      // 6bf: lload 18
      // 6c1: dup2_x1
      // 6c2: pop2
      // 6c3: iload 51
      // 6c5: iload 52
      // 6c7: aload 53
      // 6c9: bipush 8
      // 6cb: anewarray 119
      // 6ce: dup_x1
      // 6cf: swap
      // 6d0: bipush 7
      // 6d2: swap
      // 6d3: aastore
      // 6d4: dup_x1
      // 6d5: swap
      // 6d6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6d9: bipush 6
      // 6db: swap
      // 6dc: aastore
      // 6dd: dup_x1
      // 6de: swap
      // 6df: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6e2: bipush 5
      // 6e3: swap
      // 6e4: aastore
      // 6e5: dup_x1
      // 6e6: swap
      // 6e7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6ea: bipush 4
      // 6eb: swap
      // 6ec: aastore
      // 6ed: dup_x2
      // 6ee: dup_x2
      // 6ef: pop
      // 6f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6f3: bipush 3
      // 6f4: swap
      // 6f5: aastore
      // 6f6: dup_x1
      // 6f7: swap
      // 6f8: bipush 2
      // 6f9: swap
      // 6fa: aastore
      // 6fb: dup_x1
      // 6fc: swap
      // 6fd: bipush 1
      // 6fe: swap
      // 6ff: aastore
      // 700: dup_x1
      // 701: swap
      // 702: bipush 0
      // 703: swap
      // 704: aastore
      // 705: invokespecial rip/breeze/classtransform/MathUtil11.getԹ ([Ljava/lang/Object;)Lrip/breeze/inject/թ;
      // 708: astore 63
      // 70a: lload 4
      // 70c: lconst_0
      // 70d: lcmp
      // 70e: ifle 776
      // 711: aload 60
      // 713: getstatic rip/breeze/classtransform/annotations/CTarget$Shift.BEFORE Lrip/breeze/classtransform/annotations/CTarget$Shift;
      // 716: if_acmpne 751
      // 719: aload 9
      // 71b: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 71e: aload 62
      // 720: aload 63
      // 722: lload 38
      // 724: bipush 3
      // 725: anewarray 119
      // 728: dup_x2
      // 729: dup_x2
      // 72a: pop
      // 72b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 72e: bipush 2
      // 72f: swap
      // 730: aastore
      // 731: dup_x1
      // 732: swap
      // 733: bipush 1
      // 734: swap
      // 735: aastore
      // 736: dup_x1
      // 737: swap
      // 738: bipush 0
      // 739: swap
      // 73a: aastore
      // 73b: invokevirtual rip/breeze/inject/թ.method_019 ([Ljava/lang/Object;)V
      // 73e: iload 48
      // 740: lload 4
      // 742: lconst_0
      // 743: lcmp
      // 744: ifle 77f
      // 747: ifne 77d
      // 74a: goto 751
      // 74d: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 750: athrow
      // 751: aload 9
      // 753: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 756: lload 14
      // 758: aload 62
      // 75a: aload 63
      // 75c: bipush 3
      // 75d: anewarray 119
      // 760: dup_x1
      // 761: swap
      // 762: bipush 2
      // 763: swap
      // 764: aastore
      // 765: dup_x1
      // 766: swap
      // 767: bipush 1
      // 768: swap
      // 769: aastore
      // 76a: dup_x2
      // 76b: dup_x2
      // 76c: pop
      // 76d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 770: bipush 0
      // 771: swap
      // 772: aastore
      // 773: invokevirtual rip/breeze/inject/թ.method_017 ([Ljava/lang/Object;)V
      // 776: goto 77d
      // 779: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 77c: athrow
      // 77d: iload 48
      // 77f: ifne 5d9
      // 782: iinc 56 1
      // 785: iload 48
      // 787: lload 4
      // 789: lconst_0
      // 78a: lcmp
      // 78b: ifle 5e0
      // 78e: ifne 42e
      // 791: return
      // try (122 -> 131): 132 rip/breeze/classtransform/գ
      // try (125 -> 167): 167 rip/breeze/classtransform/գ
      // try (207 -> 216): 217 rip/breeze/classtransform/գ
      // try (223 -> 231): 232 rip/breeze/classtransform/գ
      // try (229 -> 236): 236 rip/breeze/classtransform/գ
      // try (242 -> 250): 251 rip/breeze/classtransform/գ
      // try (248 -> 300): 301 rip/breeze/classtransform/գ
      // try (253 -> 304): 305 rip/breeze/classtransform/գ
      // try (311 -> 340): 341 rip/breeze/classtransform/գ
      // try (343 -> 350): 351 rip/breeze/classtransform/գ
      // try (357 -> 420): 421 rip/breeze/classtransform/գ
      // try (423 -> 426): 427 rip/breeze/classtransform/գ
      // try (433 -> 519): 519 rip/breeze/classtransform/գ
      // try (521 -> 546): 547 rip/breeze/classtransform/գ
      // try (524 -> 573): 573 rip/breeze/classtransform/գ
      // try (654 -> 658): 659 rip/breeze/classtransform/գ
      // try (657 -> 674): 674 rip/breeze/classtransform/գ
      // try (718 -> 726): 727 rip/breeze/classtransform/գ
      // try (725 -> 770): 770 rip/breeze/classtransform/գ
      // try (773 -> 777): 778 rip/breeze/classtransform/գ
      // try (775 -> 783): 784 rip/breeze/classtransform/գ
      // try (780 -> 827): 827 rip/breeze/classtransform/գ
      // try (846 -> 853): 854 rip/breeze/classtransform/գ
      // try (852 -> 863): 864 rip/breeze/classtransform/գ
      // try (856 -> 867): 868 rip/breeze/classtransform/գ
      // try (866 -> 875): 876 rip/breeze/classtransform/գ
      // try (1007 -> 1045): 1046 rip/breeze/classtransform/գ
      // try (1014 -> 1073): 1074 rip/breeze/classtransform/գ
   }

   private թ getԹ(Object[] var1) {
      rip.breeze.inject.é var2 = (rip.breeze.inject.é)var1[0];
      BreezeClass12 var3 = (BreezeClass12)var1[1];
      BreezeClass12 var4 = (BreezeClass12)var1[2];
      long var5 = (Long)var1[3];
      boolean var7 = (Boolean)var1[4];
      boolean var8 = (Boolean)var1[5];
      boolean var9 = (Boolean)var1[6];
      List var10 = (List)var1[7];
      var5 = encKey_b ^ var5;
      long var11 = var5 ^ 14919800631276L;
      long var13 = var5 ^ 9808477250091L;
      long var15 = var5 ^ 19865007391729L;
      long var17 = var5 ^ 31984917280619L;
      long var19 = var5 ^ 870386068990L;
      long var21 = var5 ^ 53423375363126L;
      String var10001 = var3.string_ù;
      rip.breeze.inject.MathUtil3 var23 = ջ.method_003(new Object[]{var15, var10001});
      int var24 = MathUtil3.calculate(new Object[]{var17, var3});
      Object[] var10005 = new Object[]{null, null, var11};
      var10005[1] = var8;
      var10005[0] = var3;
      թ var25 = this.getԹ_3(var10005);
      rip.breeze.inject.MathUtil3 var27 = rip.breeze.inject.MathUtil3.CONST_Ð;
      Object[] var10009 = new Object[]{null, null, null, null, null, null, 0};
      var10009[5] = var13;
      var10009[4] = var27;
      var10009[3] = var24;
      var10009[2] = var9;
      var10009[1] = var7;
      var10009[0] = var25;
      this.processAll_2(var10009);
      this.processAll_3(new Object[]{var25, var19, var2, var3, var4, var10});
      var10009 = new Object[]{null, null, null, null, null, var23, -1};
      var10009[4] = var24;
      var10009[3] = var21;
      var10009[2] = var9;
      var10009[1] = var7;
      var10009[0] = var25;
      this.processAll_4(var10009);
      return var25;
   }

   private թ getԹ_2(Object[] param1) {
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
      // 00b: checkcast rip/breeze/inject/BreezeClass12
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast rip/breeze/inject/BreezeClass12
      // 015: astore 4
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/Boolean
      // 028: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02b: istore 7
      // 02d: dup
      // 02e: bipush 5
      // 02f: aaload
      // 030: checkcast java/lang/Boolean
      // 033: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 036: istore 8
      // 038: dup
      // 039: bipush 6
      // 03b: aaload
      // 03c: checkcast java/lang/Boolean
      // 03f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 042: istore 9
      // 044: dup
      // 045: bipush 7
      // 047: aaload
      // 048: checkcast java/util/List
      // 04b: astore 10
      // 04d: pop
      // 04e: getstatic rip/breeze/classtransform/MathUtil11.encKey_b J
      // 051: lload 5
      // 053: lxor
      // 054: lstore 5
      // 056: lload 5
      // 058: dup2
      // 059: ldc2_w 126047433242908
      // 05c: lxor
      // 05d: lstore 11
      // 05f: dup2
      // 060: ldc2_w 131777311831259
      // 063: lxor
      // 064: lstore 13
      // 066: dup2
      // 067: ldc2_w 119998494577921
      // 06a: lxor
      // 06b: lstore 15
      // 06d: dup2
      // 06e: ldc2_w 107912876843419
      // 071: lxor
      // 072: lstore 17
      // 074: dup2
      // 075: ldc2_w 19788239062116
      // 078: lxor
      // 079: lstore 19
      // 07b: dup2
      // 07c: ldc2_w 140706787916558
      // 07f: lxor
      // 080: lstore 21
      // 082: dup2
      // 083: ldc2_w 9904329909971
      // 086: lxor
      // 087: lstore 23
      // 089: dup2
      // 08a: ldc2_w 1764019826717
      // 08d: lxor
      // 08e: lstore 25
      // 090: dup2
      // 091: ldc2_w 126719655119426
      // 094: lxor
      // 095: lstore 27
      // 097: dup2
      // 098: ldc2_w 87569624644294
      // 09b: lxor
      // 09c: lstore 29
      // 09e: pop2
      // 09f: invokestatic rip/breeze/classtransform/BreezeClass5.getValue_2 ()I
      // 0a2: aload 3
      // 0a3: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0a6: lload 15
      // 0a8: dup2_x1
      // 0a9: pop2
      // 0aa: bipush 2
      // 0ab: anewarray 119
      // 0ae: dup_x1
      // 0af: swap
      // 0b0: bipush 1
      // 0b1: swap
      // 0b2: aastore
      // 0b3: dup_x2
      // 0b4: dup_x2
      // 0b5: pop
      // 0b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b9: bipush 0
      // 0ba: swap
      // 0bb: aastore
      // 0bc: invokestatic rip/breeze/classtransform/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 0bf: astore 31
      // 0c1: istore 32
      // 0c3: aload 31
      // 0c5: getstatic rip/breeze/inject/MathUtil3.CONST_Ð Lrip/breeze/inject/MathUtil3;
      // 0c8: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0cb: istore 33
      // 0cd: lload 17
      // 0cf: aload 3
      // 0d0: bipush 2
      // 0d1: anewarray 119
      // 0d4: dup_x1
      // 0d5: swap
      // 0d6: bipush 1
      // 0d7: swap
      // 0d8: aastore
      // 0d9: dup_x2
      // 0da: dup_x2
      // 0db: pop
      // 0dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0df: bipush 0
      // 0e0: swap
      // 0e1: aastore
      // 0e2: invokestatic rip/breeze/classtransform/MathUtil3.calculate ([Ljava/lang/Object;)I
      // 0e5: istore 34
      // 0e7: iload 34
      // 0e9: bipush 1
      // 0ea: iadd
      // 0eb: istore 35
      // 0ed: aload 0
      // 0ee: aload 3
      // 0ef: iload 8
      // 0f1: lload 11
      // 0f3: bipush 3
      // 0f4: anewarray 119
      // 0f7: dup_x2
      // 0f8: dup_x2
      // 0f9: pop
      // 0fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fd: bipush 2
      // 0fe: swap
      // 0ff: aastore
      // 100: dup_x1
      // 101: swap
      // 102: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 105: bipush 1
      // 106: swap
      // 107: aastore
      // 108: dup_x1
      // 109: swap
      // 10a: bipush 0
      // 10b: swap
      // 10c: aastore
      // 10d: invokespecial rip/breeze/classtransform/MathUtil11.getԹ_3 ([Ljava/lang/Object;)Lrip/breeze/inject/թ;
      // 110: astore 36
      // 112: aload 0
      // 113: aload 36
      // 115: iload 7
      // 117: iload 9
      // 119: iload 34
      // 11b: aload 31
      // 11d: lload 13
      // 11f: iload 35
      // 121: bipush 7
      // 123: anewarray 119
      // 126: dup_x1
      // 127: swap
      // 128: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12b: bipush 6
      // 12d: swap
      // 12e: aastore
      // 12f: dup_x2
      // 130: dup_x2
      // 131: pop
      // 132: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 135: bipush 5
      // 136: swap
      // 137: aastore
      // 138: dup_x1
      // 139: swap
      // 13a: bipush 4
      // 13b: swap
      // 13c: aastore
      // 13d: dup_x1
      // 13e: swap
      // 13f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 142: bipush 3
      // 143: swap
      // 144: aastore
      // 145: dup_x1
      // 146: swap
      // 147: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 14a: bipush 2
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 152: bipush 1
      // 153: swap
      // 154: aastore
      // 155: dup_x1
      // 156: swap
      // 157: bipush 0
      // 158: swap
      // 159: aastore
      // 15a: invokespecial rip/breeze/classtransform/MathUtil11.processAll_2 ([Ljava/lang/Object;)V
      // 15d: aload 0
      // 15e: aload 36
      // 160: lload 21
      // 162: aload 2
      // 163: aload 3
      // 164: aload 4
      // 166: aload 10
      // 168: bipush 6
      // 16a: anewarray 119
      // 16d: dup_x1
      // 16e: swap
      // 16f: bipush 5
      // 170: swap
      // 171: aastore
      // 172: dup_x1
      // 173: swap
      // 174: bipush 4
      // 175: swap
      // 176: aastore
      // 177: dup_x1
      // 178: swap
      // 179: bipush 3
      // 17a: swap
      // 17b: aastore
      // 17c: dup_x1
      // 17d: swap
      // 17e: bipush 2
      // 17f: swap
      // 180: aastore
      // 181: dup_x2
      // 182: dup_x2
      // 183: pop
      // 184: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 187: bipush 1
      // 188: swap
      // 189: aastore
      // 18a: dup_x1
      // 18b: swap
      // 18c: bipush 0
      // 18d: swap
      // 18e: aastore
      // 18f: invokespecial rip/breeze/classtransform/MathUtil11.processAll_3 ([Ljava/lang/Object;)V
      // 192: aload 0
      // 193: aload 36
      // 195: iload 7
      // 197: iload 9
      // 199: lload 29
      // 19b: iload 34
      // 19d: aload 31
      // 19f: iload 35
      // 1a1: bipush 7
      // 1a3: anewarray 119
      // 1a6: dup_x1
      // 1a7: swap
      // 1a8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ab: bipush 6
      // 1ad: swap
      // 1ae: aastore
      // 1af: dup_x1
      // 1b0: swap
      // 1b1: bipush 5
      // 1b2: swap
      // 1b3: aastore
      // 1b4: dup_x1
      // 1b5: swap
      // 1b6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b9: bipush 4
      // 1ba: swap
      // 1bb: aastore
      // 1bc: dup_x2
      // 1bd: dup_x2
      // 1be: pop
      // 1bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c2: bipush 3
      // 1c3: swap
      // 1c4: aastore
      // 1c5: dup_x1
      // 1c6: swap
      // 1c7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1ca: bipush 2
      // 1cb: swap
      // 1cc: aastore
      // 1cd: dup_x1
      // 1ce: swap
      // 1cf: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1d2: bipush 1
      // 1d3: swap
      // 1d4: aastore
      // 1d5: dup_x1
      // 1d6: swap
      // 1d7: bipush 0
      // 1d8: swap
      // 1d9: aastore
      // 1da: invokespecial rip/breeze/classtransform/MathUtil11.processAll_4 ([Ljava/lang/Object;)V
      // 1dd: iload 33
      // 1df: iload 32
      // 1e1: ifne 1f0
      // 1e4: ifne 29b
      // 1e7: goto 1ee
      // 1ea: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1ed: athrow
      // 1ee: iload 9
      // 1f0: lload 5
      // 1f2: lconst_0
      // 1f3: lcmp
      // 1f4: ifle 256
      // 1f7: iload 32
      // 1f9: ifne 256
      // 1fc: ifeq 29b
      // 1ff: goto 206
      // 202: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 205: athrow
      // 206: aload 36
      // 208: iload 32
      // 20a: ifne 29d
      // 20d: goto 214
      // 210: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 213: athrow
      // 214: new rip/breeze/inject/ի
      // 217: dup
      // 218: lload 25
      // 21a: aload 31
      // 21c: bipush 2
      // 21d: anewarray 119
      // 220: dup_x1
      // 221: swap
      // 222: bipush 1
      // 223: swap
      // 224: aastore
      // 225: dup_x2
      // 226: dup_x2
      // 227: pop
      // 228: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22b: bipush 0
      // 22c: swap
      // 22d: aastore
      // 22e: invokestatic rip/breeze/classtransform/MathUtil3.getValue_4 ([Ljava/lang/Object;)I
      // 231: iload 35
      // 233: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 236: lload 19
      // 238: bipush 2
      // 239: anewarray 119
      // 23c: dup_x2
      // 23d: dup_x2
      // 23e: pop
      // 23f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 242: bipush 1
      // 243: swap
      // 244: aastore
      // 245: dup_x1
      // 246: swap
      // 247: bipush 0
      // 248: swap
      // 249: aastore
      // 24a: invokevirtual rip/breeze/inject/թ.method_014 ([Ljava/lang/Object;)V
      // 24d: iload 7
      // 24f: goto 256
      // 252: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 255: athrow
      // 256: ifne 29b
      // 259: aload 36
      // 25b: new rip/breeze/inject/ի
      // 25e: dup
      // 25f: aload 31
      // 261: lload 27
      // 263: bipush 2
      // 264: anewarray 119
      // 267: dup_x2
      // 268: dup_x2
      // 269: pop
      // 26a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26d: bipush 1
      // 26e: swap
      // 26f: aastore
      // 270: dup_x1
      // 271: swap
      // 272: bipush 0
      // 273: swap
      // 274: aastore
      // 275: invokestatic rip/breeze/classtransform/MathUtil3.getValue_3 ([Ljava/lang/Object;)I
      // 278: iload 35
      // 27a: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 27d: lload 23
      // 27f: bipush 2
      // 280: anewarray 119
      // 283: dup_x2
      // 284: dup_x2
      // 285: pop
      // 286: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 289: bipush 1
      // 28a: swap
      // 28b: aastore
      // 28c: dup_x1
      // 28d: swap
      // 28e: bipush 0
      // 28f: swap
      // 290: aastore
      // 291: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 294: goto 29b
      // 297: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 29a: athrow
      // 29b: aload 36
      // 29d: areturn
      // try (167 -> 317): 318 rip/breeze/classtransform/գ
      // try (321 -> 328): 329 rip/breeze/classtransform/գ
      // try (327 -> 334): 335 rip/breeze/classtransform/գ
      // try (331 -> 375): 376 rip/breeze/classtransform/գ
      // try (378 -> 417): 418 rip/breeze/classtransform/գ
   }

   private թ getԹ_3(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/BreezeClass12
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: pop
      // 01e: getstatic rip/breeze/classtransform/MathUtil11.encKey_b J
      // 021: lload 4
      // 023: lxor
      // 024: lstore 4
      // 026: lload 4
      // 028: dup2
      // 029: ldc2_w 95269572892678
      // 02c: lxor
      // 02d: lstore 6
      // 02f: dup2
      // 030: ldc2_w 107048628891992
      // 033: lxor
      // 034: lstore 8
      // 036: pop2
      // 037: invokestatic rip/breeze/classtransform/BreezeClass5.getValue ()I
      // 03a: istore 10
      // 03c: iload 3
      // 03d: ifne 04c
      // 040: new rip/breeze/inject/թ
      // 043: dup
      // 044: invokespecial rip/breeze/inject/թ.<init> ()V
      // 047: areturn
      // 048: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 04b: athrow
      // 04c: new rip/breeze/inject/թ
      // 04f: dup
      // 050: invokespecial rip/breeze/inject/թ.<init> ()V
      // 053: astore 11
      // 055: aload 2
      // 056: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 059: lload 8
      // 05b: bipush 2
      // 05c: anewarray 119
      // 05f: dup_x2
      // 060: dup_x2
      // 061: pop
      // 062: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 065: bipush 1
      // 066: swap
      // 067: aastore
      // 068: dup_x1
      // 069: swap
      // 06a: bipush 0
      // 06b: swap
      // 06c: aastore
      // 06d: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 070: astore 12
      // 072: aload 2
      // 073: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 076: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 079: iload 10
      // 07b: ifeq 089
      // 07e: ifeq 08c
      // 081: goto 088
      // 084: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 087: athrow
      // 088: bipush 0
      // 089: goto 08d
      // 08c: bipush 1
      // 08d: istore 13
      // 08f: aload 12
      // 091: astore 14
      // 093: aload 14
      // 095: arraylength
      // 096: istore 15
      // 098: bipush 0
      // 099: istore 16
      // 09b: iload 16
      // 09d: iload 15
      // 09f: if_icmpge 3c4
      // 0a2: aload 14
      // 0a4: iload 16
      // 0a6: aaload
      // 0a7: astore 17
      // 0a9: aload 17
      // 0ab: getstatic rip/breeze/inject/MathUtil3.CONST_Ï Lrip/breeze/inject/MathUtil3;
      // 0ae: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0b1: iload 10
      // 0b3: lload 4
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: iflt 112
      // 0ba: ifeq 110
      // 0bd: ifeq 101
      // 0c0: goto 0c7
      // 0c3: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 0c6: athrow
      // 0c7: aload 11
      // 0c9: new rip/breeze/inject/ի
      // 0cc: dup
      // 0cd: bipush 21
      // 0cf: iload 13
      // 0d1: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 0d4: lload 6
      // 0d6: bipush 2
      // 0d7: anewarray 119
      // 0da: dup_x2
      // 0db: dup_x2
      // 0dc: pop
      // 0dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e0: bipush 1
      // 0e1: swap
      // 0e2: aastore
      // 0e3: dup_x1
      // 0e4: swap
      // 0e5: bipush 0
      // 0e6: swap
      // 0e7: aastore
      // 0e8: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 0eb: iinc 13 1
      // 0ee: iload 10
      // 0f0: lload 4
      // 0f2: lconst_0
      // 0f3: lcmp
      // 0f4: ifle 3c1
      // 0f7: ifne 3bc
      // 0fa: goto 101
      // 0fd: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 100: athrow
      // 101: aload 17
      // 103: getstatic rip/breeze/inject/MathUtil3.CONST_Í Lrip/breeze/inject/MathUtil3;
      // 106: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 109: goto 110
      // 10c: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 10f: athrow
      // 110: iload 10
      // 112: lload 4
      // 114: lconst_0
      // 115: lcmp
      // 116: ifle 171
      // 119: ifeq 16f
      // 11c: ifeq 160
      // 11f: goto 126
      // 122: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 125: athrow
      // 126: aload 11
      // 128: new rip/breeze/inject/ի
      // 12b: dup
      // 12c: bipush 21
      // 12e: iload 13
      // 130: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 133: lload 6
      // 135: bipush 2
      // 136: anewarray 119
      // 139: dup_x2
      // 13a: dup_x2
      // 13b: pop
      // 13c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13f: bipush 1
      // 140: swap
      // 141: aastore
      // 142: dup_x1
      // 143: swap
      // 144: bipush 0
      // 145: swap
      // 146: aastore
      // 147: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 14a: iinc 13 1
      // 14d: iload 10
      // 14f: lload 4
      // 151: lconst_0
      // 152: lcmp
      // 153: iflt 3c1
      // 156: ifne 3bc
      // 159: goto 160
      // 15c: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 15f: athrow
      // 160: aload 17
      // 162: getstatic rip/breeze/inject/MathUtil3.CONST_Ì Lrip/breeze/inject/MathUtil3;
      // 165: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 168: goto 16f
      // 16b: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 16e: athrow
      // 16f: iload 10
      // 171: lload 4
      // 173: lconst_0
      // 174: lcmp
      // 175: ifle 1d0
      // 178: ifeq 1ce
      // 17b: ifeq 1bf
      // 17e: goto 185
      // 181: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 184: athrow
      // 185: aload 11
      // 187: new rip/breeze/inject/ի
      // 18a: dup
      // 18b: bipush 21
      // 18d: iload 13
      // 18f: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 192: lload 6
      // 194: bipush 2
      // 195: anewarray 119
      // 198: dup_x2
      // 199: dup_x2
      // 19a: pop
      // 19b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19e: bipush 1
      // 19f: swap
      // 1a0: aastore
      // 1a1: dup_x1
      // 1a2: swap
      // 1a3: bipush 0
      // 1a4: swap
      // 1a5: aastore
      // 1a6: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 1a9: iinc 13 1
      // 1ac: iload 10
      // 1ae: lload 4
      // 1b0: lconst_0
      // 1b1: lcmp
      // 1b2: ifle 3c1
      // 1b5: ifne 3bc
      // 1b8: goto 1bf
      // 1bb: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1be: athrow
      // 1bf: aload 17
      // 1c1: getstatic rip/breeze/inject/MathUtil3.CONST_Î Lrip/breeze/inject/MathUtil3;
      // 1c4: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 1c7: goto 1ce
      // 1ca: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1cd: athrow
      // 1ce: iload 10
      // 1d0: lload 4
      // 1d2: lconst_0
      // 1d3: lcmp
      // 1d4: iflt 22f
      // 1d7: ifeq 22d
      // 1da: ifeq 21e
      // 1dd: goto 1e4
      // 1e0: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1e3: athrow
      // 1e4: aload 11
      // 1e6: new rip/breeze/inject/ի
      // 1e9: dup
      // 1ea: bipush 21
      // 1ec: iload 13
      // 1ee: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 1f1: lload 6
      // 1f3: bipush 2
      // 1f4: anewarray 119
      // 1f7: dup_x2
      // 1f8: dup_x2
      // 1f9: pop
      // 1fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fd: bipush 1
      // 1fe: swap
      // 1ff: aastore
      // 200: dup_x1
      // 201: swap
      // 202: bipush 0
      // 203: swap
      // 204: aastore
      // 205: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 208: iinc 13 1
      // 20b: iload 10
      // 20d: lload 4
      // 20f: lconst_0
      // 210: lcmp
      // 211: iflt 3c1
      // 214: ifne 3bc
      // 217: goto 21e
      // 21a: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 21d: athrow
      // 21e: aload 17
      // 220: getstatic rip/breeze/inject/MathUtil3.CONST_Ë Lrip/breeze/inject/MathUtil3;
      // 223: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 226: goto 22d
      // 229: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 22c: athrow
      // 22d: iload 10
      // 22f: lload 4
      // 231: lconst_0
      // 232: lcmp
      // 233: ifle 28e
      // 236: ifeq 28c
      // 239: ifeq 27d
      // 23c: goto 243
      // 23f: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 242: athrow
      // 243: aload 11
      // 245: new rip/breeze/inject/ի
      // 248: dup
      // 249: bipush 21
      // 24b: iload 13
      // 24d: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 250: lload 6
      // 252: bipush 2
      // 253: anewarray 119
      // 256: dup_x2
      // 257: dup_x2
      // 258: pop
      // 259: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25c: bipush 1
      // 25d: swap
      // 25e: aastore
      // 25f: dup_x1
      // 260: swap
      // 261: bipush 0
      // 262: swap
      // 263: aastore
      // 264: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 267: iinc 13 1
      // 26a: iload 10
      // 26c: lload 4
      // 26e: lconst_0
      // 26f: lcmp
      // 270: ifle 3c1
      // 273: ifne 3bc
      // 276: goto 27d
      // 279: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 27c: athrow
      // 27d: aload 17
      // 27f: getstatic rip/breeze/inject/MathUtil3.CONST_É Lrip/breeze/inject/MathUtil3;
      // 282: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 285: goto 28c
      // 288: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 28b: athrow
      // 28c: iload 10
      // 28e: lload 4
      // 290: lconst_0
      // 291: lcmp
      // 292: ifle 2f4
      // 295: ifeq 2eb
      // 298: ifeq 2dc
      // 29b: goto 2a2
      // 29e: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2a1: athrow
      // 2a2: aload 11
      // 2a4: new rip/breeze/inject/ի
      // 2a7: dup
      // 2a8: bipush 22
      // 2aa: iload 13
      // 2ac: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 2af: lload 6
      // 2b1: bipush 2
      // 2b2: anewarray 119
      // 2b5: dup_x2
      // 2b6: dup_x2
      // 2b7: pop
      // 2b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2bb: bipush 1
      // 2bc: swap
      // 2bd: aastore
      // 2be: dup_x1
      // 2bf: swap
      // 2c0: bipush 0
      // 2c1: swap
      // 2c2: aastore
      // 2c3: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 2c6: iinc 13 2
      // 2c9: iload 10
      // 2cb: lload 4
      // 2cd: lconst_0
      // 2ce: lcmp
      // 2cf: ifle 3c1
      // 2d2: ifne 3bc
      // 2d5: goto 2dc
      // 2d8: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2db: athrow
      // 2dc: aload 17
      // 2de: getstatic rip/breeze/inject/MathUtil3.CONST_Ê Lrip/breeze/inject/MathUtil3;
      // 2e1: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 2e4: goto 2eb
      // 2e7: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2ea: athrow
      // 2eb: lload 4
      // 2ed: lconst_0
      // 2ee: lcmp
      // 2ef: ifle 34a
      // 2f2: iload 10
      // 2f4: ifeq 34a
      // 2f7: ifeq 33b
      // 2fa: goto 301
      // 2fd: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 300: athrow
      // 301: aload 11
      // 303: new rip/breeze/inject/ի
      // 306: dup
      // 307: bipush 23
      // 309: iload 13
      // 30b: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 30e: lload 6
      // 310: bipush 2
      // 311: anewarray 119
      // 314: dup_x2
      // 315: dup_x2
      // 316: pop
      // 317: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31a: bipush 1
      // 31b: swap
      // 31c: aastore
      // 31d: dup_x1
      // 31e: swap
      // 31f: bipush 0
      // 320: swap
      // 321: aastore
      // 322: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 325: iinc 13 1
      // 328: iload 10
      // 32a: lload 4
      // 32c: lconst_0
      // 32d: lcmp
      // 32e: ifle 3c1
      // 331: ifne 3bc
      // 334: goto 33b
      // 337: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 33a: athrow
      // 33b: aload 17
      // 33d: getstatic rip/breeze/inject/MathUtil3.CONST_È Lrip/breeze/inject/MathUtil3;
      // 340: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 343: goto 34a
      // 346: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 349: athrow
      // 34a: lload 4
      // 34c: lconst_0
      // 34d: lcmp
      // 34e: ifle 37d
      // 351: ifeq 38e
      // 354: aload 11
      // 356: new rip/breeze/inject/ի
      // 359: dup
      // 35a: bipush 24
      // 35c: iload 13
      // 35e: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 361: lload 6
      // 363: bipush 2
      // 364: anewarray 119
      // 367: dup_x2
      // 368: dup_x2
      // 369: pop
      // 36a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 36d: bipush 1
      // 36e: swap
      // 36f: aastore
      // 370: dup_x1
      // 371: swap
      // 372: bipush 0
      // 373: swap
      // 374: aastore
      // 375: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 378: iinc 13 2
      // 37b: iload 10
      // 37d: lload 4
      // 37f: lconst_0
      // 380: lcmp
      // 381: iflt 3c1
      // 384: ifne 3bc
      // 387: goto 38e
      // 38a: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 38d: athrow
      // 38e: aload 11
      // 390: new rip/breeze/inject/ի
      // 393: dup
      // 394: bipush 25
      // 396: iload 13
      // 398: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 39b: lload 6
      // 39d: bipush 2
      // 39e: anewarray 119
      // 3a1: dup_x2
      // 3a2: dup_x2
      // 3a3: pop
      // 3a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a7: bipush 1
      // 3a8: swap
      // 3a9: aastore
      // 3aa: dup_x1
      // 3ab: swap
      // 3ac: bipush 0
      // 3ad: swap
      // 3ae: aastore
      // 3af: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 3b2: iinc 13 1
      // 3b5: goto 3bc
      // 3b8: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 3bb: athrow
      // 3bc: iinc 16 1
      // 3bf: iload 10
      // 3c1: ifne 09b
      // 3c4: aload 11
      // 3c6: areturn
      // try (35 -> 41): 41 rip/breeze/classtransform/գ
      // try (66 -> 72): 73 rip/breeze/classtransform/գ
      // try (93 -> 103): 104 rip/breeze/classtransform/գ
      // try (102 -> 135): 136 rip/breeze/classtransform/գ
      // try (106 -> 141): 142 rip/breeze/classtransform/գ
      // try (144 -> 151): 152 rip/breeze/classtransform/գ
      // try (150 -> 183): 184 rip/breeze/classtransform/գ
      // try (154 -> 189): 190 rip/breeze/classtransform/գ
      // try (192 -> 199): 200 rip/breeze/classtransform/գ
      // try (198 -> 231): 232 rip/breeze/classtransform/գ
      // try (202 -> 237): 238 rip/breeze/classtransform/գ
      // try (240 -> 247): 248 rip/breeze/classtransform/գ
      // try (246 -> 279): 280 rip/breeze/classtransform/գ
      // try (250 -> 285): 286 rip/breeze/classtransform/գ
      // try (288 -> 295): 296 rip/breeze/classtransform/գ
      // try (294 -> 327): 328 rip/breeze/classtransform/գ
      // try (298 -> 333): 334 rip/breeze/classtransform/գ
      // try (336 -> 343): 344 rip/breeze/classtransform/գ
      // try (342 -> 375): 376 rip/breeze/classtransform/գ
      // try (346 -> 381): 382 rip/breeze/classtransform/գ
      // try (384 -> 391): 392 rip/breeze/classtransform/գ
      // try (390 -> 423): 424 rip/breeze/classtransform/գ
      // try (394 -> 429): 430 rip/breeze/classtransform/գ
      // try (432 -> 466): 467 rip/breeze/classtransform/գ
      // try (437 -> 492): 493 rip/breeze/classtransform/գ
   }

   private void processAll_2(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/թ
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Boolean
      // 018: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01b: istore 4
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/Integer
      // 023: invokevirtual java/lang/Integer.intValue ()I
      // 026: istore 5
      // 028: dup
      // 029: bipush 4
      // 02a: aaload
      // 02b: checkcast rip/breeze/inject/MathUtil3
      // 02e: astore 6
      // 030: dup
      // 031: bipush 5
      // 032: aaload
      // 033: checkcast java/lang/Long
      // 036: invokevirtual java/lang/Long.longValue ()J
      // 039: lstore 7
      // 03b: dup
      // 03c: bipush 6
      // 03e: aaload
      // 03f: checkcast java/lang/Integer
      // 042: invokevirtual java/lang/Integer.intValue ()I
      // 045: istore 9
      // 047: pop
      // 048: getstatic rip/breeze/classtransform/MathUtil11.encKey_b J
      // 04b: lload 7
      // 04d: lxor
      // 04e: lstore 7
      // 050: lload 7
      // 052: dup2
      // 053: ldc2_w 58954929895038
      // 056: lxor
      // 057: lstore 10
      // 059: dup2
      // 05a: ldc2_w 50207385086898
      // 05d: lxor
      // 05e: lstore 12
      // 060: dup2
      // 061: ldc2_w 101335590206578
      // 064: lxor
      // 065: lstore 14
      // 067: dup2
      // 068: ldc2_w 92220777240001
      // 06b: lxor
      // 06c: lstore 16
      // 06e: dup2
      // 06f: ldc2_w 49543895847912
      // 072: lxor
      // 073: lstore 18
      // 075: dup2
      // 076: ldc2_w 45758090606928
      // 079: lxor
      // 07a: lstore 20
      // 07c: pop2
      // 07d: invokestatic rip/breeze/classtransform/BreezeClass5.getValue ()I
      // 080: istore 22
      // 082: iload 22
      // 084: ifeq 0f4
      // 087: iload 4
      // 089: ifne 098
      // 08c: goto 093
      // 08f: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 092: athrow
      // 093: return
      // 094: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 097: athrow
      // 098: aload 2
      // 099: new rip/breeze/inject/լ
      // 09c: dup
      // 09d: sipush 187
      // 0a0: lload 18
      // 0a2: ldc rip/breeze/classtransform/InjectionCallback
      // 0a4: bipush 2
      // 0a5: anewarray 119
      // 0a8: dup_x1
      // 0a9: swap
      // 0aa: bipush 1
      // 0ab: swap
      // 0ac: aastore
      // 0ad: dup_x2
      // 0ae: dup_x2
      // 0af: pop
      // 0b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b3: bipush 0
      // 0b4: swap
      // 0b5: aastore
      // 0b6: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0b9: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 0bc: lload 16
      // 0be: bipush 2
      // 0bf: anewarray 119
      // 0c2: dup_x2
      // 0c3: dup_x2
      // 0c4: pop
      // 0c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c8: bipush 1
      // 0c9: swap
      // 0ca: aastore
      // 0cb: dup_x1
      // 0cc: swap
      // 0cd: bipush 0
      // 0ce: swap
      // 0cf: aastore
      // 0d0: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 0d3: aload 2
      // 0d4: new rip/breeze/inject/շ
      // 0d7: dup
      // 0d8: bipush 89
      // 0da: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 0dd: lload 16
      // 0df: bipush 2
      // 0e0: anewarray 119
      // 0e3: dup_x2
      // 0e4: dup_x2
      // 0e5: pop
      // 0e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e9: bipush 1
      // 0ea: swap
      // 0eb: aastore
      // 0ec: dup_x1
      // 0ed: swap
      // 0ee: bipush 0
      // 0ef: swap
      // 0f0: aastore
      // 0f1: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 0f4: aload 2
      // 0f5: new rip/breeze/inject/շ
      // 0f8: dup
      // 0f9: iload 3
      // 0fa: ifeq 105
      // 0fd: bipush 4
      // 0fe: goto 106
      // 101: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 104: athrow
      // 105: bipush 3
      // 106: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 109: lload 16
      // 10b: bipush 2
      // 10c: anewarray 119
      // 10f: dup_x2
      // 110: dup_x2
      // 111: pop
      // 112: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 115: bipush 1
      // 116: swap
      // 117: aastore
      // 118: dup_x1
      // 119: swap
      // 11a: bipush 0
      // 11b: swap
      // 11c: aastore
      // 11d: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 120: getstatic rip/breeze/inject/MathUtil3.CONST_Ð Lrip/breeze/inject/MathUtil3;
      // 123: iload 22
      // 125: ifeq 173
      // 128: aload 6
      // 12a: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 12d: ifne 24a
      // 130: aload 2
      // 131: new rip/breeze/inject/ի
      // 134: dup
      // 135: aload 6
      // 137: lload 20
      // 139: bipush 2
      // 13a: anewarray 119
      // 13d: dup_x2
      // 13e: dup_x2
      // 13f: pop
      // 140: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 143: bipush 1
      // 144: swap
      // 145: aastore
      // 146: dup_x1
      // 147: swap
      // 148: bipush 0
      // 149: swap
      // 14a: aastore
      // 14b: invokestatic rip/breeze/classtransform/MathUtil3.getValue_3 ([Ljava/lang/Object;)I
      // 14e: iload 9
      // 150: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 153: lload 16
      // 155: bipush 2
      // 156: anewarray 119
      // 159: dup_x2
      // 15a: dup_x2
      // 15b: pop
      // 15c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15f: bipush 1
      // 160: swap
      // 161: aastore
      // 162: dup_x1
      // 163: swap
      // 164: bipush 0
      // 165: swap
      // 166: aastore
      // 167: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 16a: aload 6
      // 16c: goto 173
      // 16f: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 172: athrow
      // 173: lload 12
      // 175: bipush 2
      // 176: anewarray 119
      // 179: dup_x2
      // 17a: dup_x2
      // 17b: pop
      // 17c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17f: bipush 1
      // 180: swap
      // 181: aastore
      // 182: dup_x1
      // 183: swap
      // 184: bipush 0
      // 185: swap
      // 186: aastore
      // 187: invokestatic rip/breeze/classtransform/MathUtil3.getՋ ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 18a: astore 23
      // 18c: iload 22
      // 18e: lload 7
      // 190: lconst_0
      // 191: lcmp
      // 192: ifle 240
      // 195: ifeq 23e
      // 198: aload 23
      // 19a: ifnull 1c5
      // 19d: goto 1a4
      // 1a0: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1a3: athrow
      // 1a4: aload 2
      // 1a5: aload 23
      // 1a7: lload 16
      // 1a9: bipush 2
      // 1aa: anewarray 119
      // 1ad: dup_x2
      // 1ae: dup_x2
      // 1af: pop
      // 1b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b3: bipush 1
      // 1b4: swap
      // 1b5: aastore
      // 1b6: dup_x1
      // 1b7: swap
      // 1b8: bipush 0
      // 1b9: swap
      // 1ba: aastore
      // 1bb: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 1be: goto 1c5
      // 1c1: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1c4: athrow
      // 1c5: aload 2
      // 1c6: new rip/breeze/inject/կ
      // 1c9: dup
      // 1ca: sipush 183
      // 1cd: lload 18
      // 1cf: ldc rip/breeze/classtransform/InjectionCallback
      // 1d1: bipush 2
      // 1d2: anewarray 119
      // 1d5: dup_x1
      // 1d6: swap
      // 1d7: bipush 1
      // 1d8: swap
      // 1d9: aastore
      // 1da: dup_x2
      // 1db: dup_x2
      // 1dc: pop
      // 1dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e0: bipush 0
      // 1e1: swap
      // 1e2: aastore
      // 1e3: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1e6: lload 14
      // 1e8: sipush 20206
      // 1eb: ldc2_w 431095806065211849
      // 1ee: lload 7
      // 1f0: lxor
      // 1f1: invokedynamic f (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil11.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: lload 10
      // 1f8: getstatic java/lang/Void.TYPE Ljava/lang/Class;
      // 1fb: bipush 2
      // 1fc: anewarray 119
      // 1ff: dup
      // 200: bipush 0
      // 201: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 204: aastore
      // 205: dup
      // 206: bipush 1
      // 207: ldc java/lang/Object
      // 209: aastore
      // 20a: bipush 3
      // 20b: anewarray 119
      // 20e: dup_x1
      // 20f: swap
      // 210: bipush 2
      // 211: swap
      // 212: aastore
      // 213: dup_x1
      // 214: swap
      // 215: bipush 1
      // 216: swap
      // 217: aastore
      // 218: dup_x2
      // 219: dup_x2
      // 21a: pop
      // 21b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21e: bipush 0
      // 21f: swap
      // 220: aastore
      // 221: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 224: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
      // 227: lload 16
      // 229: bipush 2
      // 22a: anewarray 119
      // 22d: dup_x2
      // 22e: dup_x2
      // 22f: pop
      // 230: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 233: bipush 1
      // 234: swap
      // 235: aastore
      // 236: dup_x1
      // 237: swap
      // 238: bipush 0
      // 239: swap
      // 23a: aastore
      // 23b: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 23e: iload 22
      // 240: lload 7
      // 242: lconst_0
      // 243: lcmp
      // 244: ifle 2cd
      // 247: ifne 2c5
      // 24a: aload 2
      // 24b: new rip/breeze/inject/կ
      // 24e: dup
      // 24f: sipush 183
      // 252: lload 18
      // 254: ldc rip/breeze/classtransform/InjectionCallback
      // 256: bipush 2
      // 257: anewarray 119
      // 25a: dup_x1
      // 25b: swap
      // 25c: bipush 1
      // 25d: swap
      // 25e: aastore
      // 25f: dup_x2
      // 260: dup_x2
      // 261: pop
      // 262: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 265: bipush 0
      // 266: swap
      // 267: aastore
      // 268: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 26b: lload 14
      // 26d: sipush 19610
      // 270: ldc2_w 1849983997099015088
      // 273: lload 7
      // 275: lxor
      // 276: invokedynamic f (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil11.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: lload 10
      // 27d: getstatic java/lang/Void.TYPE Ljava/lang/Class;
      // 280: bipush 1
      // 281: anewarray 119
      // 284: dup
      // 285: bipush 0
      // 286: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 289: aastore
      // 28a: bipush 3
      // 28b: anewarray 119
      // 28e: dup_x1
      // 28f: swap
      // 290: bipush 2
      // 291: swap
      // 292: aastore
      // 293: dup_x1
      // 294: swap
      // 295: bipush 1
      // 296: swap
      // 297: aastore
      // 298: dup_x2
      // 299: dup_x2
      // 29a: pop
      // 29b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29e: bipush 0
      // 29f: swap
      // 2a0: aastore
      // 2a1: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 2a4: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
      // 2a7: lload 16
      // 2a9: bipush 2
      // 2aa: anewarray 119
      // 2ad: dup_x2
      // 2ae: dup_x2
      // 2af: pop
      // 2b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b3: bipush 1
      // 2b4: swap
      // 2b5: aastore
      // 2b6: dup_x1
      // 2b7: swap
      // 2b8: bipush 0
      // 2b9: swap
      // 2ba: aastore
      // 2bb: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 2be: goto 2c5
      // 2c1: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2c4: athrow
      // 2c5: lload 7
      // 2c7: lconst_0
      // 2c8: lcmp
      // 2c9: ifle 316
      // 2cc: iload 3
      // 2cd: ifeq 31d
      // 2d0: aload 2
      // 2d1: new rip/breeze/inject/ի
      // 2d4: dup
      // 2d5: bipush 58
      // 2d7: iload 5
      // 2d9: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 2dc: lload 16
      // 2de: bipush 2
      // 2df: anewarray 119
      // 2e2: dup_x2
      // 2e3: dup_x2
      // 2e4: pop
      // 2e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e8: bipush 1
      // 2e9: swap
      // 2ea: aastore
      // 2eb: dup_x1
      // 2ec: swap
      // 2ed: bipush 0
      // 2ee: swap
      // 2ef: aastore
      // 2f0: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 2f3: aload 2
      // 2f4: new rip/breeze/inject/ի
      // 2f7: dup
      // 2f8: bipush 25
      // 2fa: iload 5
      // 2fc: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 2ff: lload 16
      // 301: bipush 2
      // 302: anewarray 119
      // 305: dup_x2
      // 306: dup_x2
      // 307: pop
      // 308: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 30b: bipush 1
      // 30c: swap
      // 30d: aastore
      // 30e: dup_x1
      // 30f: swap
      // 310: bipush 0
      // 311: swap
      // 312: aastore
      // 313: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 316: goto 31d
      // 319: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 31c: athrow
      // 31d: return
      // try (74 -> 78): 79 rip/breeze/classtransform/գ
      // try (76 -> 82): 82 rip/breeze/classtransform/գ
      // try (143 -> 150): 150 rip/breeze/classtransform/գ
      // try (173 -> 215): 216 rip/breeze/classtransform/գ
      // try (235 -> 243): 244 rip/breeze/classtransform/գ
      // try (241 -> 264): 265 rip/breeze/classtransform/գ
      // try (343 -> 421): 422 rip/breeze/classtransform/գ
      // try (424 -> 474): 475 rip/breeze/classtransform/գ
   }

   private void processAll_3(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/թ
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
      // 015: checkcast rip/breeze/inject/é
      // 018: astore 5
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast rip/breeze/inject/BreezeClass12
      // 020: astore 6
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast rip/breeze/inject/BreezeClass12
      // 028: astore 7
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/util/List
      // 030: astore 8
      // 032: pop
      // 033: getstatic rip/breeze/classtransform/MathUtil11.encKey_b J
      // 036: lload 3
      // 037: lxor
      // 038: lstore 3
      // 039: lload 3
      // 03a: dup2
      // 03b: ldc2_w 71325844102006
      // 03e: lxor
      // 03f: lstore 9
      // 041: dup2
      // 042: ldc2_w 73682404653219
      // 045: lxor
      // 046: lstore 11
      // 048: dup2
      // 049: ldc2_w 101149758396948
      // 04c: lxor
      // 04d: lstore 13
      // 04f: pop2
      // 050: aload 5
      // 052: getfield rip/breeze/inject/é.int_û_2 I
      // 055: invokestatic java/lang/reflect/Modifier.isInterface (I)Z
      // 058: istore 15
      // 05a: invokestatic rip/breeze/classtransform/BreezeClass5.getValue ()I
      // 05d: new rip/breeze/inject/թ
      // 060: dup
      // 061: invokespecial rip/breeze/inject/թ.<init> ()V
      // 064: astore 16
      // 066: new rip/breeze/inject/թ
      // 069: dup
      // 06a: invokespecial rip/breeze/inject/թ.<init> ()V
      // 06d: astore 17
      // 06f: istore 18
      // 071: aload 6
      // 073: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 076: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 079: ifeq 0a4
      // 07c: new rip/breeze/inject/կ
      // 07f: dup
      // 080: sipush 184
      // 083: aload 5
      // 085: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 088: aload 7
      // 08a: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 08d: aload 7
      // 08f: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 092: iload 15
      // 094: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 097: astore 19
      // 099: iload 18
      // 09b: lload 3
      // 09c: lconst_0
      // 09d: lcmp
      // 09e: iflt 150
      // 0a1: ifne 0f9
      // 0a4: new rip/breeze/inject/կ
      // 0a7: dup
      // 0a8: iload 15
      // 0aa: ifeq 0be
      // 0ad: goto 0b4
      // 0b0: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 0b3: athrow
      // 0b4: sipush 185
      // 0b7: goto 0c1
      // 0ba: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 0bd: athrow
      // 0be: sipush 182
      // 0c1: aload 5
      // 0c3: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 0c6: aload 7
      // 0c8: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 0cb: aload 7
      // 0cd: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0d0: iload 15
      // 0d2: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 0d5: astore 19
      // 0d7: aload 2
      // 0d8: new rip/breeze/inject/ի
      // 0db: dup
      // 0dc: bipush 25
      // 0de: bipush 0
      // 0df: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 0e2: lload 11
      // 0e4: bipush 2
      // 0e5: anewarray 119
      // 0e8: dup_x2
      // 0e9: dup_x2
      // 0ea: pop
      // 0eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ee: bipush 1
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x1
      // 0f2: swap
      // 0f3: bipush 0
      // 0f4: swap
      // 0f5: aastore
      // 0f6: invokevirtual rip/breeze/inject/թ.method_014 ([Ljava/lang/Object;)V
      // 0f9: aload 2
      // 0fa: aload 16
      // 0fc: lload 9
      // 0fe: bipush 2
      // 0ff: anewarray 119
      // 102: dup_x2
      // 103: dup_x2
      // 104: pop
      // 105: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 108: bipush 1
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: bipush 0
      // 10e: swap
      // 10f: aastore
      // 110: invokevirtual rip/breeze/inject/թ.method_013 ([Ljava/lang/Object;)V
      // 113: aload 2
      // 114: aload 19
      // 116: lload 13
      // 118: bipush 2
      // 119: anewarray 119
      // 11c: dup_x2
      // 11d: dup_x2
      // 11e: pop
      // 11f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 122: bipush 1
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: bipush 0
      // 128: swap
      // 129: aastore
      // 12a: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 12d: aload 2
      // 12e: aload 17
      // 130: lload 9
      // 132: bipush 2
      // 133: anewarray 119
      // 136: dup_x2
      // 137: dup_x2
      // 138: pop
      // 139: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13c: bipush 1
      // 13d: swap
      // 13e: aastore
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 0
      // 142: swap
      // 143: aastore
      // 144: invokevirtual rip/breeze/inject/թ.method_013 ([Ljava/lang/Object;)V
      // 147: aload 8
      // 149: aload 19
      // 14b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 150: pop
      // 151: return
      // try (81 -> 91): 92 rip/breeze/classtransform/գ
      // try (87 -> 96): 96 rip/breeze/classtransform/գ
   }

   private void processAll_4(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/թ
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Boolean
      // 018: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01b: istore 4
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/Long
      // 023: invokevirtual java/lang/Long.longValue ()J
      // 026: lstore 5
      // 028: dup
      // 029: bipush 4
      // 02a: aaload
      // 02b: checkcast java/lang/Integer
      // 02e: invokevirtual java/lang/Integer.intValue ()I
      // 031: istore 7
      // 033: dup
      // 034: bipush 5
      // 035: aaload
      // 036: checkcast rip/breeze/inject/MathUtil3
      // 039: astore 8
      // 03b: dup
      // 03c: bipush 6
      // 03e: aaload
      // 03f: checkcast java/lang/Integer
      // 042: invokevirtual java/lang/Integer.intValue ()I
      // 045: istore 9
      // 047: pop
      // 048: getstatic rip/breeze/classtransform/MathUtil11.encKey_b J
      // 04b: lload 5
      // 04d: lxor
      // 04e: lstore 5
      // 050: lload 5
      // 052: dup2
      // 053: ldc2_w 123707571509950
      // 056: lxor
      // 057: lstore 10
      // 059: dup2
      // 05a: ldc2_w 15271496890467
      // 05d: lxor
      // 05e: lstore 12
      // 060: dup2
      // 061: ldc2_w 118589490839556
      // 064: lxor
      // 065: lstore 14
      // 067: dup2
      // 068: ldc2_w 110325501899375
      // 06b: lxor
      // 06c: lstore 16
      // 06e: dup2
      // 06f: ldc2_w 118347776252892
      // 072: lxor
      // 073: lstore 18
      // 075: dup2
      // 076: ldc2_w 23581414317557
      // 079: lxor
      // 07a: lstore 20
      // 07c: dup2
      // 07d: ldc2_w 19657213785933
      // 080: lxor
      // 081: lstore 22
      // 083: dup2
      // 084: ldc2_w 11517192352907
      // 087: lxor
      // 088: lstore 24
      // 08a: dup2
      // 08b: ldc2_w 123191816227503
      // 08e: lxor
      // 08f: lstore 26
      // 091: pop2
      // 092: invokestatic rip/breeze/classtransform/BreezeClass5.getValue_2 ()I
      // 095: istore 28
      // 097: iload 3
      // 098: iload 28
      // 09a: ifne 0a9
      // 09d: ifeq 0bf
      // 0a0: goto 0a7
      // 0a3: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 0a6: athrow
      // 0a7: iload 4
      // 0a9: iload 28
      // 0ab: lload 5
      // 0ad: lconst_0
      // 0ae: lcmp
      // 0af: ifle 0c4
      // 0b2: ifne 0c2
      // 0b5: ifne 0c0
      // 0b8: goto 0bf
      // 0bb: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 0be: athrow
      // 0bf: return
      // 0c0: iload 9
      // 0c2: iload 28
      // 0c4: ifne 0d2
      // 0c7: iflt 0d5
      // 0ca: goto 0d1
      // 0cd: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 0d0: athrow
      // 0d1: bipush 1
      // 0d2: goto 0d6
      // 0d5: bipush 0
      // 0d6: istore 29
      // 0d8: new rip/breeze/inject/թ
      // 0db: dup
      // 0dc: invokespecial rip/breeze/inject/թ.<init> ()V
      // 0df: astore 30
      // 0e1: new rip/breeze/inject/ճ
      // 0e4: dup
      // 0e5: invokespecial rip/breeze/inject/ճ.<init> ()V
      // 0e8: astore 31
      // 0ea: new rip/breeze/inject/ճ
      // 0ed: dup
      // 0ee: invokespecial rip/breeze/inject/ճ.<init> ()V
      // 0f1: astore 32
      // 0f3: aload 30
      // 0f5: new rip/breeze/inject/ի
      // 0f8: dup
      // 0f9: bipush 25
      // 0fb: iload 7
      // 0fd: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 100: lload 18
      // 102: bipush 2
      // 103: anewarray 119
      // 106: dup_x2
      // 107: dup_x2
      // 108: pop
      // 109: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10c: bipush 1
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x1
      // 110: swap
      // 111: bipush 0
      // 112: swap
      // 113: aastore
      // 114: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 117: aload 30
      // 119: new rip/breeze/inject/կ
      // 11c: dup
      // 11d: sipush 182
      // 120: lload 20
      // 122: ldc rip/breeze/classtransform/InjectionCallback
      // 124: bipush 2
      // 125: anewarray 119
      // 128: dup_x1
      // 129: swap
      // 12a: bipush 1
      // 12b: swap
      // 12c: aastore
      // 12d: dup_x2
      // 12e: dup_x2
      // 12f: pop
      // 130: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 133: bipush 0
      // 134: swap
      // 135: aastore
      // 136: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 139: lload 16
      // 13b: sipush 26625
      // 13e: ldc2_w 2495228995425374513
      // 141: lload 5
      // 143: lxor
      // 144: invokedynamic f (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil11.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: lload 12
      // 14b: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 14e: bipush 0
      // 14f: anewarray 119
      // 152: bipush 3
      // 153: anewarray 119
      // 156: dup_x1
      // 157: swap
      // 158: bipush 2
      // 159: swap
      // 15a: aastore
      // 15b: dup_x1
      // 15c: swap
      // 15d: bipush 1
      // 15e: swap
      // 15f: aastore
      // 160: dup_x2
      // 161: dup_x2
      // 162: pop
      // 163: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 166: bipush 0
      // 167: swap
      // 168: aastore
      // 169: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 16c: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
      // 16f: lload 18
      // 171: bipush 2
      // 172: anewarray 119
      // 175: dup_x2
      // 176: dup_x2
      // 177: pop
      // 178: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17b: bipush 1
      // 17c: swap
      // 17d: aastore
      // 17e: dup_x1
      // 17f: swap
      // 180: bipush 0
      // 181: swap
      // 182: aastore
      // 183: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 186: aload 30
      // 188: new rip/breeze/inject/մ
      // 18b: dup
      // 18c: sipush 153
      // 18f: aload 31
      // 191: invokespecial rip/breeze/inject/մ.<init> (ILrip/breeze/inject/ճ;)V
      // 194: lload 18
      // 196: bipush 2
      // 197: anewarray 119
      // 19a: dup_x2
      // 19b: dup_x2
      // 19c: pop
      // 19d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a0: bipush 1
      // 1a1: swap
      // 1a2: aastore
      // 1a3: dup_x1
      // 1a4: swap
      // 1a5: bipush 0
      // 1a6: swap
      // 1a7: aastore
      // 1a8: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 1ab: getstatic rip/breeze/inject/MathUtil3.CONST_Ð Lrip/breeze/inject/MathUtil3;
      // 1ae: aload 8
      // 1b0: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 1b3: lload 5
      // 1b5: lconst_0
      // 1b6: lcmp
      // 1b7: ifle 340
      // 1ba: iload 28
      // 1bc: ifne 340
      // 1bf: ifne 337
      // 1c2: goto 1c9
      // 1c5: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1c8: athrow
      // 1c9: aload 30
      // 1cb: new rip/breeze/inject/ի
      // 1ce: dup
      // 1cf: bipush 25
      // 1d1: iload 7
      // 1d3: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 1d6: lload 18
      // 1d8: bipush 2
      // 1d9: anewarray 119
      // 1dc: dup_x2
      // 1dd: dup_x2
      // 1de: pop
      // 1df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e2: bipush 1
      // 1e3: swap
      // 1e4: aastore
      // 1e5: dup_x1
      // 1e6: swap
      // 1e7: bipush 0
      // 1e8: swap
      // 1e9: aastore
      // 1ea: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 1ed: aload 30
      // 1ef: new rip/breeze/inject/կ
      // 1f2: dup
      // 1f3: sipush 182
      // 1f6: lload 20
      // 1f8: ldc rip/breeze/classtransform/InjectionCallback
      // 1fa: bipush 2
      // 1fb: anewarray 119
      // 1fe: dup_x1
      // 1ff: swap
      // 200: bipush 1
      // 201: swap
      // 202: aastore
      // 203: dup_x2
      // 204: dup_x2
      // 205: pop
      // 206: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 209: bipush 0
      // 20a: swap
      // 20b: aastore
      // 20c: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 20f: lload 16
      // 211: sipush 27058
      // 214: ldc2_w 5777997148085653641
      // 217: lload 5
      // 219: lxor
      // 21a: invokedynamic f (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/MathUtil11.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: lload 12
      // 221: ldc java/lang/Object
      // 223: bipush 0
      // 224: anewarray 119
      // 227: bipush 3
      // 228: anewarray 119
      // 22b: dup_x1
      // 22c: swap
      // 22d: bipush 2
      // 22e: swap
      // 22f: aastore
      // 230: dup_x1
      // 231: swap
      // 232: bipush 1
      // 233: swap
      // 234: aastore
      // 235: dup_x2
      // 236: dup_x2
      // 237: pop
      // 238: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23b: bipush 0
      // 23c: swap
      // 23d: aastore
      // 23e: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 241: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
      // 244: lload 18
      // 246: bipush 2
      // 247: anewarray 119
      // 24a: dup_x2
      // 24b: dup_x2
      // 24c: pop
      // 24d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 250: bipush 1
      // 251: swap
      // 252: aastore
      // 253: dup_x1
      // 254: swap
      // 255: bipush 0
      // 256: swap
      // 257: aastore
      // 258: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 25b: aload 30
      // 25d: lload 14
      // 25f: aload 8
      // 261: bipush 2
      // 262: anewarray 119
      // 265: dup_x1
      // 266: swap
      // 267: bipush 1
      // 268: swap
      // 269: aastore
      // 26a: dup_x2
      // 26b: dup_x2
      // 26c: pop
      // 26d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 270: bipush 0
      // 271: swap
      // 272: aastore
      // 273: invokestatic rip/breeze/classtransform/MathUtil3.getԹ ([Ljava/lang/Object;)Lrip/breeze/inject/թ;
      // 276: lload 10
      // 278: bipush 2
      // 279: anewarray 119
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
      // 28a: invokevirtual rip/breeze/inject/թ.method_013 ([Ljava/lang/Object;)V
      // 28d: iload 28
      // 28f: lload 5
      // 291: lconst_0
      // 292: lcmp
      // 293: ifle 32d
      // 296: ifne 32b
      // 299: goto 2a0
      // 29c: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 29f: athrow
      // 2a0: lload 5
      // 2a2: lconst_0
      // 2a3: lcmp
      // 2a4: iflt 324
      // 2a7: iload 29
      // 2a9: ifeq 2eb
      // 2ac: goto 2b3
      // 2af: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2b2: athrow
      // 2b3: aload 30
      // 2b5: new rip/breeze/inject/մ
      // 2b8: dup
      // 2b9: sipush 167
      // 2bc: aload 32
      // 2be: invokespecial rip/breeze/inject/մ.<init> (ILrip/breeze/inject/ճ;)V
      // 2c1: lload 18
      // 2c3: bipush 2
      // 2c4: anewarray 119
      // 2c7: dup_x2
      // 2c8: dup_x2
      // 2c9: pop
      // 2ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2cd: bipush 1
      // 2ce: swap
      // 2cf: aastore
      // 2d0: dup_x1
      // 2d1: swap
      // 2d2: bipush 0
      // 2d3: swap
      // 2d4: aastore
      // 2d5: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 2d8: iload 28
      // 2da: lload 5
      // 2dc: lconst_0
      // 2dd: lcmp
      // 2de: iflt 3b8
      // 2e1: ifeq 39b
      // 2e4: goto 2eb
      // 2e7: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2ea: athrow
      // 2eb: aload 30
      // 2ed: new rip/breeze/inject/շ
      // 2f0: dup
      // 2f1: aload 8
      // 2f3: lload 24
      // 2f5: bipush 2
      // 2f6: anewarray 119
      // 2f9: dup_x2
      // 2fa: dup_x2
      // 2fb: pop
      // 2fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ff: bipush 1
      // 300: swap
      // 301: aastore
      // 302: dup_x1
      // 303: swap
      // 304: bipush 0
      // 305: swap
      // 306: aastore
      // 307: invokestatic rip/breeze/classtransform/MathUtil3.getValue_2 ([Ljava/lang/Object;)I
      // 30a: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 30d: lload 18
      // 30f: bipush 2
      // 310: anewarray 119
      // 313: dup_x2
      // 314: dup_x2
      // 315: pop
      // 316: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 319: bipush 1
      // 31a: swap
      // 31b: aastore
      // 31c: dup_x1
      // 31d: swap
      // 31e: bipush 0
      // 31f: swap
      // 320: aastore
      // 321: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 324: goto 32b
      // 327: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 32a: athrow
      // 32b: iload 28
      // 32d: lload 5
      // 32f: lconst_0
      // 330: lcmp
      // 331: ifle 3b8
      // 334: ifeq 39b
      // 337: iload 29
      // 339: goto 340
      // 33c: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 33f: athrow
      // 340: lload 5
      // 342: lconst_0
      // 343: lcmp
      // 344: iflt 360
      // 347: ifeq 371
      // 34a: aload 30
      // 34c: lload 26
      // 34e: bipush 1
      // 34f: anewarray 119
      // 352: dup_x2
      // 353: dup_x2
      // 354: pop
      // 355: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 358: bipush 0
      // 359: swap
      // 35a: aastore
      // 35b: invokevirtual rip/breeze/inject/թ.method_022 ([Ljava/lang/Object;)V
      // 35e: iload 28
      // 360: lload 5
      // 362: lconst_0
      // 363: lcmp
      // 364: iflt 3b8
      // 367: ifeq 39b
      // 36a: goto 371
      // 36d: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 370: athrow
      // 371: aload 30
      // 373: new rip/breeze/inject/շ
      // 376: dup
      // 377: sipush 177
      // 37a: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 37d: lload 18
      // 37f: bipush 2
      // 380: anewarray 119
      // 383: dup_x2
      // 384: dup_x2
      // 385: pop
      // 386: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 389: bipush 1
      // 38a: swap
      // 38b: aastore
      // 38c: dup_x1
      // 38d: swap
      // 38e: bipush 0
      // 38f: swap
      // 390: aastore
      // 391: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 394: goto 39b
      // 397: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 39a: athrow
      // 39b: aload 30
      // 39d: aload 31
      // 39f: lload 18
      // 3a1: bipush 2
      // 3a2: anewarray 119
      // 3a5: dup_x2
      // 3a6: dup_x2
      // 3a7: pop
      // 3a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ab: bipush 1
      // 3ac: swap
      // 3ad: aastore
      // 3ae: dup_x1
      // 3af: swap
      // 3b0: bipush 0
      // 3b1: swap
      // 3b2: aastore
      // 3b3: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 3b6: iload 28
      // 3b8: lload 5
      // 3ba: lconst_0
      // 3bb: lcmp
      // 3bc: iflt 3c4
      // 3bf: ifne 46b
      // 3c2: iload 29
      // 3c4: ifeq 451
      // 3c7: goto 3ce
      // 3ca: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 3cd: athrow
      // 3ce: lload 5
      // 3d0: lconst_0
      // 3d1: lcmp
      // 3d2: iflt 46b
      // 3d5: aload 30
      // 3d7: iload 28
      // 3d9: ifne 452
      // 3dc: goto 3e3
      // 3df: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 3e2: athrow
      // 3e3: bipush 0
      // 3e4: anewarray 119
      // 3e7: invokevirtual rip/breeze/inject/թ.method_001 ([Ljava/lang/Object;)I
      // 3ea: ifle 451
      // 3ed: goto 3f4
      // 3f0: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 3f3: athrow
      // 3f4: aload 30
      // 3f6: new rip/breeze/inject/ի
      // 3f9: dup
      // 3fa: aload 8
      // 3fc: lload 22
      // 3fe: bipush 2
      // 3ff: anewarray 119
      // 402: dup_x2
      // 403: dup_x2
      // 404: pop
      // 405: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 408: bipush 1
      // 409: swap
      // 40a: aastore
      // 40b: dup_x1
      // 40c: swap
      // 40d: bipush 0
      // 40e: swap
      // 40f: aastore
      // 410: invokestatic rip/breeze/classtransform/MathUtil3.getValue_3 ([Ljava/lang/Object;)I
      // 413: iload 9
      // 415: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 418: lload 18
      // 41a: bipush 2
      // 41b: anewarray 119
      // 41e: dup_x2
      // 41f: dup_x2
      // 420: pop
      // 421: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 424: bipush 1
      // 425: swap
      // 426: aastore
      // 427: dup_x1
      // 428: swap
      // 429: bipush 0
      // 42a: swap
      // 42b: aastore
      // 42c: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 42f: aload 30
      // 431: aload 32
      // 433: lload 18
      // 435: bipush 2
      // 436: anewarray 119
      // 439: dup_x2
      // 43a: dup_x2
      // 43b: pop
      // 43c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43f: bipush 1
      // 440: swap
      // 441: aastore
      // 442: dup_x1
      // 443: swap
      // 444: bipush 0
      // 445: swap
      // 446: aastore
      // 447: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 44a: goto 451
      // 44d: invokestatic rip/breeze/classtransform/MathUtil11.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 450: athrow
      // 451: aload 2
      // 452: aload 30
      // 454: lload 10
      // 456: bipush 2
      // 457: anewarray 119
      // 45a: dup_x2
      // 45b: dup_x2
      // 45c: pop
      // 45d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 460: bipush 1
      // 461: swap
      // 462: aastore
      // 463: dup_x1
      // 464: swap
      // 465: bipush 0
      // 466: swap
      // 467: aastore
      // 468: invokevirtual rip/breeze/inject/թ.method_013 ([Ljava/lang/Object;)V
      // 46b: return
      // try (86 -> 90): 91 rip/breeze/classtransform/գ
      // try (94 -> 101): 102 rip/breeze/classtransform/գ
      // try (106 -> 109): 110 rip/breeze/classtransform/գ
      // try (128 -> 250): 251 rip/breeze/classtransform/գ
      // try (249 -> 383): 384 rip/breeze/classtransform/գ
      // try (253 -> 392): 393 rip/breeze/classtransform/գ
      // try (386 -> 423): 424 rip/breeze/classtransform/գ
      // try (395 -> 463): 464 rip/breeze/classtransform/գ
      // try (466 -> 473): 474 rip/breeze/classtransform/գ
      // try (476 -> 499): 500 rip/breeze/classtransform/գ
      // try (481 -> 523): 524 rip/breeze/classtransform/գ
      // try (526 -> 552): 553 rip/breeze/classtransform/գ
      // try (550 -> 562): 563 rip/breeze/classtransform/գ
      // try (555 -> 569): 570 rip/breeze/classtransform/գ
      // try (565 -> 628): 629 rip/breeze/classtransform/գ
   }

   private static ռ lambda$new_Inner0(CInject var0) {
      return new ռ(var0.method(), var0.mapping());
   }

   static {
      long var0 = 5845994120L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[12];
      int var5 = 0;
      String var6 = "\u000eÐª£¸\u001c$`*\u0086,egA£8+Y×Ãæ\u0000º]Úú¨H\u0080\u0013\u001eøvì%¸\u0014Êkù\u0018S\\Ëms$\u0087ÒZm\u001ds\bd/Ü¡)ìl½ÚtC Å®\u001e\rY¼\u0092\u0010æç0Ïÿr¯Ìñ¦2¿fRö¦F\u009d\u007f\u00ad\u0093Î9] {ø6Õß#|\u0000Ö¡DxÙ^¬þn\u0092rU\u001c°«?\n°/;\f¹¥ÿ\u0010LIS\u0095\u001a9\u0085\u000bÅ½Ñv;\u0014Ã\u0003\u0010\t\"üá\u0015æÜÑØ´±¦\u001b>'DhSS\u0011c5Ü*«æ8ç\u0001Õ¡ùt¥\u0090\u0013ÃFp\u0019J\u000e^LPþþs\u0000Ù!/\u008f@Î ÖAè¦00\u008dÎ&¬|\u0007,ç\u0012ÃÔvpÂ\u0010äÆ\u001fë\u000b§\u008b*\u0090øÌé¤VïÈùy\u009b8ì\u0096¿ÚFÑAlîG¦Ø+`\u000b\u008etÒÐm0Â\u0096Ï\u0090\u0080ß©\u009b\u0090)\u009eÌQPÇ¹©Ò^Ù\u000eAñôát\u0012ý7¥\u0097YoÒ?÷\u00ad°\"kù\u0017\u009fÚ\u0004;\b\u0016ø\u0003\u0001Ñ;ÎÇ#öï\u009bgg&\u0092.OÑIPÎ\u0012ØI\u009d\u00175d\u0090¼¾[ë±\u00ad\u009ctÆQ\u0006>ÖN)\u0081-\u001b\u0015\t\u008a\t\u0093å³\u008dg÷\u008eYþfH½\u0011i*-Ú¢\u0012-Nûþ\u0006òÂÏ+:vKÍ#\r\u0000\u007f¯tu\u007f7ï\u0085à\u000bã\u008c*I\u0010¨\u0084(y³\t\u008d0¾°ÙyÃJG\u009e \u0098µ\u0094RèKüpþi[\u0080Ê\u00913d\u0088¼}B\u0083\u0093{Å\u007fZÕB.Þé\u0094";
      int var7 = "\u000eÐª£¸\u001c$`*\u0086,egA£8+Y×Ãæ\u0000º]Úú¨H\u0080\u0013\u001eøvì%¸\u0014Êkù\u0018S\\Ëms$\u0087ÒZm\u001ds\bd/Ü¡)ìl½ÚtC Å®\u001e\rY¼\u0092\u0010æç0Ïÿr¯Ìñ¦2¿fRö¦F\u009d\u007f\u00ad\u0093Î9] {ø6Õß#|\u0000Ö¡DxÙ^¬þn\u0092rU\u001c°«?\n°/;\f¹¥ÿ\u0010LIS\u0095\u001a9\u0085\u000bÅ½Ñv;\u0014Ã\u0003\u0010\t\"üá\u0015æÜÑØ´±¦\u001b>'DhSS\u0011c5Ü*«æ8ç\u0001Õ¡ùt¥\u0090\u0013ÃFp\u0019J\u000e^LPþþs\u0000Ù!/\u008f@Î ÖAè¦00\u008dÎ&¬|\u0007,ç\u0012ÃÔvpÂ\u0010äÆ\u001fë\u000b§\u008b*\u0090øÌé¤VïÈùy\u009b8ì\u0096¿ÚFÑAlîG¦Ø+`\u000b\u008etÒÐm0Â\u0096Ï\u0090\u0080ß©\u009b\u0090)\u009eÌQPÇ¹©Ò^Ù\u000eAñôát\u0012ý7¥\u0097YoÒ?÷\u00ad°\"kù\u0017\u009fÚ\u0004;\b\u0016ø\u0003\u0001Ñ;ÎÇ#öï\u009bgg&\u0092.OÑIPÎ\u0012ØI\u009d\u00175d\u0090¼¾[ë±\u00ad\u009ctÆQ\u0006>ÖN)\u0081-\u001b\u0015\t\u008a\t\u0093å³\u008dg÷\u008eYþfH½\u0011i*-Ú¢\u0012-Nûþ\u0006òÂÏ+:vKÍ#\r\u0000\u007f¯tu\u007f7ï\u0085à\u000bã\u008c*I\u0010¨\u0084(y³\t\u008d0¾°ÙyÃJG\u009e \u0098µ\u0094RèKüpþi[\u0080Ê\u00913d\u0088¼}B\u0083\u0093{Å\u007fZÕB.Þé\u0094"
         .length();
      char var8 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_I = var4;
                     CONST_J = new String[12];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "Æ~AþäÅ\u0096l\u009e7«¹ëäF\u008bgs1jÐ\u0092´ëEi\u00890'&\u0005\u0002µ\u0081i\u0095Ç·4£Tà¹)ÉU\u0011£\u001aI\u000e\u008a.¨\u0099Å*+\u001fÚ5<gZ\u0096[yiAI;\u001ftæ0\u00885ÿ=iÊ)\u0018â\u0012\u0015ã/\u0087 ²\tGë7WàáÕu)ÕÒöí\u0004ã\u0089àì\u0086lØ\u0091MÕßó\u000fø(ä»a\u0002\u001fúAÎß\u0007ðk\u0003ùß1uÄ\u000fë@fõ\u0096CÖ\u0003ËÔnùª\u0017»Y?\u0003HGõ";
                  var7 = "Æ~AþäÅ\u0096l\u009e7«¹ëäF\u008bgs1jÐ\u0092´ëEi\u00890'&\u0005\u0002µ\u0081i\u0095Ç·4£Tà¹)ÉU\u0011£\u001aI\u000e\u008a.¨\u0099Å*+\u001fÚ5<gZ\u0096[yiAI;\u001ftæ0\u00885ÿ=iÊ)\u0018â\u0012\u0015ã/\u0087 ²\tGë7WàáÕu)ÕÒöí\u0004ã\u0089àì\u0086lØ\u0091MÕßó\u000fø(ä»a\u0002\u001fúAÎß\u0007ðk\u0003ùß1uÄ\u000fë@fõ\u0096CÖ\u0003ËÔnùª\u0017»Y?\u0003HGõ"
                     .length();
                  var8 = 'x';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31144;
      if (CONST_J[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_K.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_K.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/o", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_I[var3].getBytes("ISO-8859-1");
         CONST_J[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_J[var3];
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
         throw new RuntimeException("rip/breeze/classtransform/o" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
