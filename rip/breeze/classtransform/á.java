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
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class á implements â {
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   @Override
   public List invoke_1(Object[] param1) {
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
      // 004: checkcast java/util/Map
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast rip/breeze/inject/BreezeClass12
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
      // 01d: checkcast rip/breeze/classtransform/annotations/CTarget
      // 020: astore 6
      // 022: pop
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 74753121986438
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 70898639956203
      // 030: lxor
      // 031: lstore 9
      // 033: dup2
      // 034: ldc2_w 103867862459367
      // 037: lxor
      // 038: lstore 11
      // 03a: dup2
      // 03b: ldc2_w 11964840145050
      // 03e: lxor
      // 03f: lstore 13
      // 041: dup2
      // 042: ldc2_w 75687941145335
      // 045: lxor
      // 046: lstore 15
      // 048: dup2
      // 049: ldc2_w 73300147143075
      // 04c: lxor
      // 04d: lstore 17
      // 04f: dup2
      // 050: ldc2_w 100218346529821
      // 053: lxor
      // 054: lstore 19
      // 056: dup2
      // 057: ldc2_w 130302817307789
      // 05a: lxor
      // 05b: lstore 21
      // 05d: pop2
      // 05e: invokestatic rip/breeze/classtransform/BreezeClass7.getValue ()I
      // 061: new java/util/ArrayList
      // 064: dup
      // 065: invokespecial java/util/ArrayList.<init> ()V
      // 068: astore 23
      // 06a: istore 24
      // 06c: aload 3
      // 06d: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 070: lload 19
      // 072: bipush 1
      // 073: anewarray 4
      // 076: dup_x2
      // 077: dup_x2
      // 078: pop
      // 079: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07c: bipush 0
      // 07d: swap
      // 07e: aastore
      // 07f: invokevirtual rip/breeze/inject/թ.method_010 ([Ljava/lang/Object;)[Lrip/breeze/inject/ջ;
      // 082: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 085: astore 25
      // 087: aload 6
      // 089: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 08e: sipush 9391
      // 091: ldc2_w 7863631640082599447
      // 094: lload 4
      // 096: lxor
      // 097: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 09f: iload 24
      // 0a1: ifeq 107
      // 0a4: ifeq 0e2
      // 0a7: goto 0ae
      // 0aa: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: lload 9
      // 0b1: aload 23
      // 0b3: aload 25
      // 0b5: bipush 3
      // 0b6: anewarray 4
      // 0b9: dup_x1
      // 0ba: swap
      // 0bb: bipush 2
      // 0bc: swap
      // 0bd: aastore
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: bipush 1
      // 0c1: swap
      // 0c2: aastore
      // 0c3: dup_x2
      // 0c4: dup_x2
      // 0c5: pop
      // 0c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c9: bipush 0
      // 0ca: swap
      // 0cb: aastore
      // 0cc: invokespecial rip/breeze/classtransform/á.method_001 ([Ljava/lang/Object;)V
      // 0cf: iload 24
      // 0d1: lload 4
      // 0d3: lconst_0
      // 0d4: lcmp
      // 0d5: iflt 3f9
      // 0d8: ifne 3f2
      // 0db: goto 0e2
      // 0de: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: aload 6
      // 0e4: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 0e9: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 0ec: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 0ef: sipush 7321
      // 0f2: ldc2_w 2936484262183630381
      // 0f5: lload 4
      // 0f7: lxor
      // 0f8: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 100: goto 107
      // 103: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 106: athrow
      // 107: iload 24
      // 109: lload 4
      // 10b: lconst_0
      // 10c: lcmp
      // 10d: ifle 186
      // 110: ifeq 184
      // 113: ifeq 15f
      // 116: goto 11d
      // 119: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: aload 0
      // 11e: aload 23
      // 120: aload 25
      // 122: aload 6
      // 124: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 129: lload 7
      // 12b: dup2_x1
      // 12c: pop2
      // 12d: bipush 4
      // 12e: anewarray 4
      // 131: dup_x1
      // 132: swap
      // 133: bipush 3
      // 134: swap
      // 135: aastore
      // 136: dup_x2
      // 137: dup_x2
      // 138: pop
      // 139: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13c: bipush 2
      // 13d: swap
      // 13e: aastore
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 1
      // 142: swap
      // 143: aastore
      // 144: dup_x1
      // 145: swap
      // 146: bipush 0
      // 147: swap
      // 148: aastore
      // 149: invokespecial rip/breeze/classtransform/á.method_002 ([Ljava/lang/Object;)V
      // 14c: iload 24
      // 14e: lload 4
      // 150: lconst_0
      // 151: lcmp
      // 152: iflt 3f9
      // 155: ifne 3f2
      // 158: goto 15f
      // 15b: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15e: athrow
      // 15f: aload 6
      // 161: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 166: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 169: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 16c: sipush 19364
      // 16f: ldc2_w 5094737004439413009
      // 172: lload 4
      // 174: lxor
      // 175: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 17d: goto 184
      // 180: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 183: athrow
      // 184: iload 24
      // 186: lload 4
      // 188: lconst_0
      // 189: lcmp
      // 18a: ifle 201
      // 18d: ifeq 1ff
      // 190: ifeq 1da
      // 193: goto 19a
      // 196: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: aload 0
      // 19b: lload 11
      // 19d: aload 23
      // 19f: aload 25
      // 1a1: aload 6
      // 1a3: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 1a8: bipush 4
      // 1a9: anewarray 4
      // 1ac: dup_x1
      // 1ad: swap
      // 1ae: bipush 3
      // 1af: swap
      // 1b0: aastore
      // 1b1: dup_x1
      // 1b2: swap
      // 1b3: bipush 2
      // 1b4: swap
      // 1b5: aastore
      // 1b6: dup_x1
      // 1b7: swap
      // 1b8: bipush 1
      // 1b9: swap
      // 1ba: aastore
      // 1bb: dup_x2
      // 1bc: dup_x2
      // 1bd: pop
      // 1be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c1: bipush 0
      // 1c2: swap
      // 1c3: aastore
      // 1c4: invokespecial rip/breeze/classtransform/á.method_003 ([Ljava/lang/Object;)V
      // 1c7: iload 24
      // 1c9: lload 4
      // 1cb: lconst_0
      // 1cc: lcmp
      // 1cd: iflt 3f9
      // 1d0: ifne 3f2
      // 1d3: goto 1da
      // 1d6: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d9: athrow
      // 1da: aload 6
      // 1dc: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 1e1: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 1e4: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 1e7: sipush 8002
      // 1ea: ldc2_w 5976490283115443694
      // 1ed: lload 4
      // 1ef: lxor
      // 1f0: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1f8: goto 1ff
      // 1fb: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fe: athrow
      // 1ff: iload 24
      // 201: lload 4
      // 203: lconst_0
      // 204: lcmp
      // 205: ifle 27c
      // 208: ifeq 27a
      // 20b: ifeq 255
      // 20e: goto 215
      // 211: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 214: athrow
      // 215: aload 0
      // 216: aload 23
      // 218: aload 25
      // 21a: aload 6
      // 21c: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 221: lload 17
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
      // 232: bipush 2
      // 233: swap
      // 234: aastore
      // 235: dup_x1
      // 236: swap
      // 237: bipush 1
      // 238: swap
      // 239: aastore
      // 23a: dup_x1
      // 23b: swap
      // 23c: bipush 0
      // 23d: swap
      // 23e: aastore
      // 23f: invokespecial rip/breeze/classtransform/á.method_004 ([Ljava/lang/Object;)V
      // 242: iload 24
      // 244: lload 4
      // 246: lconst_0
      // 247: lcmp
      // 248: iflt 3f9
      // 24b: ifne 3f2
      // 24e: goto 255
      // 251: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 254: athrow
      // 255: aload 6
      // 257: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 25c: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 25f: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 262: sipush 6229
      // 265: ldc2_w 8058081440205828856
      // 268: lload 4
      // 26a: lxor
      // 26b: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 273: goto 27a
      // 276: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 279: athrow
      // 27a: iload 24
      // 27c: lload 4
      // 27e: lconst_0
      // 27f: lcmp
      // 280: iflt 300
      // 283: ifeq 2f7
      // 286: ifeq 2d2
      // 289: goto 290
      // 28c: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28f: athrow
      // 290: aload 0
      // 291: aload 23
      // 293: aload 25
      // 295: aload 6
      // 297: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 29c: lload 13
      // 29e: dup2_x1
      // 29f: pop2
      // 2a0: bipush 4
      // 2a1: anewarray 4
      // 2a4: dup_x1
      // 2a5: swap
      // 2a6: bipush 3
      // 2a7: swap
      // 2a8: aastore
      // 2a9: dup_x2
      // 2aa: dup_x2
      // 2ab: pop
      // 2ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2af: bipush 2
      // 2b0: swap
      // 2b1: aastore
      // 2b2: dup_x1
      // 2b3: swap
      // 2b4: bipush 1
      // 2b5: swap
      // 2b6: aastore
      // 2b7: dup_x1
      // 2b8: swap
      // 2b9: bipush 0
      // 2ba: swap
      // 2bb: aastore
      // 2bc: invokespecial rip/breeze/classtransform/á.method_005 ([Ljava/lang/Object;)V
      // 2bf: iload 24
      // 2c1: lload 4
      // 2c3: lconst_0
      // 2c4: lcmp
      // 2c5: ifle 3f9
      // 2c8: ifne 3f2
      // 2cb: goto 2d2
      // 2ce: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d1: athrow
      // 2d2: aload 6
      // 2d4: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 2d9: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 2dc: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 2df: sipush 22821
      // 2e2: ldc2_w 1679146051315086228
      // 2e5: lload 4
      // 2e7: lxor
      // 2e8: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2f0: goto 2f7
      // 2f3: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f6: athrow
      // 2f7: lload 4
      // 2f9: lconst_0
      // 2fa: lcmp
      // 2fb: iflt 372
      // 2fe: iload 24
      // 300: ifeq 372
      // 303: ifeq 34d
      // 306: goto 30d
      // 309: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30c: athrow
      // 30d: aload 0
      // 30e: lload 21
      // 310: aload 23
      // 312: aload 25
      // 314: aload 6
      // 316: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 31b: bipush 4
      // 31c: anewarray 4
      // 31f: dup_x1
      // 320: swap
      // 321: bipush 3
      // 322: swap
      // 323: aastore
      // 324: dup_x1
      // 325: swap
      // 326: bipush 2
      // 327: swap
      // 328: aastore
      // 329: dup_x1
      // 32a: swap
      // 32b: bipush 1
      // 32c: swap
      // 32d: aastore
      // 32e: dup_x2
      // 32f: dup_x2
      // 330: pop
      // 331: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 334: bipush 0
      // 335: swap
      // 336: aastore
      // 337: invokespecial rip/breeze/classtransform/á.method_006 ([Ljava/lang/Object;)V
      // 33a: iload 24
      // 33c: lload 4
      // 33e: lconst_0
      // 33f: lcmp
      // 340: ifle 3f9
      // 343: ifne 3f2
      // 346: goto 34d
      // 349: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34c: athrow
      // 34d: aload 6
      // 34f: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 354: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 357: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 35a: sipush 20263
      // 35d: ldc2_w 2876960462569448856
      // 360: lload 4
      // 362: lxor
      // 363: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 36b: goto 372
      // 36e: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 371: athrow
      // 372: lload 4
      // 374: lconst_0
      // 375: lcmp
      // 376: iflt 3ab
      // 379: ifeq 3bc
      // 37c: aload 0
      // 37d: aload 23
      // 37f: aload 25
      // 381: aload 6
      // 383: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 388: lload 15
      // 38a: bipush 4
      // 38b: anewarray 4
      // 38e: dup_x2
      // 38f: dup_x2
      // 390: pop
      // 391: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 394: bipush 3
      // 395: swap
      // 396: aastore
      // 397: dup_x1
      // 398: swap
      // 399: bipush 2
      // 39a: swap
      // 39b: aastore
      // 39c: dup_x1
      // 39d: swap
      // 39e: bipush 1
      // 39f: swap
      // 3a0: aastore
      // 3a1: dup_x1
      // 3a2: swap
      // 3a3: bipush 0
      // 3a4: swap
      // 3a5: aastore
      // 3a6: invokespecial rip/breeze/classtransform/á.method_007 ([Ljava/lang/Object;)V
      // 3a9: iload 24
      // 3ab: lload 4
      // 3ad: lconst_0
      // 3ae: lcmp
      // 3af: ifle 3f9
      // 3b2: ifne 3f2
      // 3b5: goto 3bc
      // 3b8: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3bb: athrow
      // 3bc: new java/lang/IllegalArgumentException
      // 3bf: dup
      // 3c0: new java/lang/StringBuilder
      // 3c3: dup
      // 3c4: invokespecial java/lang/StringBuilder.<init> ()V
      // 3c7: sipush 19194
      // 3ca: ldc2_w 209997999278530624
      // 3cd: lload 4
      // 3cf: lxor
      // 3d0: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d8: aload 6
      // 3da: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 3df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e2: ldc "'"
      // 3e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3ea: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 3ed: athrow
      // 3ee: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f1: athrow
      // 3f2: aload 6
      // 3f4: invokeinterface rip/breeze/classtransform/annotations/CTarget.ordinal ()I 1
      // 3f9: iload 24
      // 3fb: lload 4
      // 3fd: lconst_0
      // 3fe: lcmp
      // 3ff: iflt 420
      // 402: ifeq 41e
      // 405: bipush -1
      // 406: if_icmpeq 472
      // 409: goto 410
      // 40c: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40f: athrow
      // 410: aload 6
      // 412: invokeinterface rip/breeze/classtransform/annotations/CTarget.ordinal ()I 1
      // 417: goto 41e
      // 41a: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41d: athrow
      // 41e: iload 24
      // 420: lload 4
      // 422: lconst_0
      // 423: lcmp
      // 424: iflt 455
      // 427: ifeq 44e
      // 42a: iflt 458
      // 42d: goto 434
      // 430: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 433: athrow
      // 434: aload 6
      // 436: iload 24
      // 438: ifeq 46e
      // 43b: goto 442
      // 43e: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 441: athrow
      // 442: invokeinterface rip/breeze/classtransform/annotations/CTarget.ordinal ()I 1
      // 447: goto 44e
      // 44a: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44d: athrow
      // 44e: aload 23
      // 450: invokeinterface java/util/List.size ()I 1
      // 455: if_icmplt 460
      // 458: invokestatic java/util/Collections.emptyList ()Ljava/util/List;
      // 45b: areturn
      // 45c: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45f: athrow
      // 460: aload 23
      // 462: aload 6
      // 464: invokeinterface rip/breeze/classtransform/annotations/CTarget.ordinal ()I 1
      // 469: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 46e: invokestatic java/util/Collections.singletonList (Ljava/lang/Object;)Ljava/util/List;
      // 471: areturn
      // 472: aload 23
      // 474: invokestatic rip/breeze/inject/ջ.method_012 ()Z
      // 477: lload 4
      // 479: lconst_0
      // 47a: lcmp
      // 47b: ifle 486
      // 47e: ifeq 490
      // 481: iinc 24 1
      // 484: iload 24
      // 486: invokestatic rip/breeze/classtransform/BreezeClass7.initialize (I)V
      // 489: goto 490
      // 48c: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48f: athrow
      // 490: areturn
      // try (78 -> 89): 90 java/lang/IllegalArgumentException
      // try (88 -> 122): 123 java/lang/IllegalArgumentException
      // try (92 -> 135): 136 java/lang/IllegalArgumentException
      // try (138 -> 145): 146 java/lang/IllegalArgumentException
      // try (144 -> 187): 188 java/lang/IllegalArgumentException
      // try (148 -> 200): 201 java/lang/IllegalArgumentException
      // try (203 -> 210): 211 java/lang/IllegalArgumentException
      // try (209 -> 250): 251 java/lang/IllegalArgumentException
      // try (213 -> 263): 264 java/lang/IllegalArgumentException
      // try (266 -> 273): 274 java/lang/IllegalArgumentException
      // try (272 -> 313): 314 java/lang/IllegalArgumentException
      // try (276 -> 326): 327 java/lang/IllegalArgumentException
      // try (329 -> 336): 337 java/lang/IllegalArgumentException
      // try (335 -> 378): 379 java/lang/IllegalArgumentException
      // try (339 -> 391): 392 java/lang/IllegalArgumentException
      // try (394 -> 401): 402 java/lang/IllegalArgumentException
      // try (400 -> 441): 442 java/lang/IllegalArgumentException
      // try (404 -> 454): 455 java/lang/IllegalArgumentException
      // try (457 -> 499): 500 java/lang/IllegalArgumentException
      // try (462 -> 521): 521 java/lang/IllegalArgumentException
      // try (523 -> 533): 534 java/lang/IllegalArgumentException
      // try (531 -> 538): 539 java/lang/IllegalArgumentException
      // try (541 -> 548): 549 java/lang/IllegalArgumentException
      // try (547 -> 554): 555 java/lang/IllegalArgumentException
      // try (551 -> 558): 559 java/lang/IllegalArgumentException
      // try (561 -> 566): 566 java/lang/IllegalArgumentException
      // try (574 -> 584): 585 java/lang/IllegalArgumentException
   }

   private void invoke_1(Object[] param1) {
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
      // 0e: checkcast java/util/List
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/List
      // 19: astore 5
      // 1b: pop
      // 1c: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: invokestatic rip/breeze/classtransform/BreezeClass7.getValue_2 ()I
      // 25: aload 5
      // 27: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2c: astore 6
      // 2e: istore 7
      // 30: aload 6
      // 32: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 37: ifeq 7b
      // 3a: aload 6
      // 3c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 41: checkcast rip/breeze/inject/ջ
      // 44: astore 8
      // 46: aload 8
      // 48: bipush 0
      // 49: anewarray 4
      // 4c: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 4f: iload 7
      // 51: lload 2
      // 52: lconst_0
      // 53: lcmp
      // 54: ifle 5b
      // 57: ifne 75
      // 5a: bipush 1
      // 5b: if_icmpne 76
      // 5e: goto 65
      // 61: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: aload 4
      // 67: aload 8
      // 69: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 6e: goto 75
      // 71: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: pop
      // 76: iload 7
      // 78: ifeq 30
      // 7b: return
      // try (34 -> 46): 47 java/lang/IllegalArgumentException
      // try (44 -> 52): 53 java/lang/IllegalArgumentException
   }

   private void invoke_2(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/List
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
      // 01d: checkcast java/lang/String
      // 020: astore 6
      // 022: pop
      // 023: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 026: lload 4
      // 028: lxor
      // 029: lstore 4
      // 02b: lload 4
      // 02d: dup2
      // 02e: ldc2_w 34720071369862
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 61098371924563
      // 038: lxor
      // 039: lstore 9
      // 03b: pop2
      // 03c: invokestatic rip/breeze/classtransform/BreezeClass7.getValue ()I
      // 03f: aload 0
      // 040: aload 6
      // 042: sipush 24058
      // 045: ldc2_w 694467890864676954
      // 048: lload 4
      // 04a: lxor
      // 04b: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/á.lambda$findInt_Inner0 (Ljava/lang/Integer;)Ljava/lang/Boolean;, (Ljava/lang/Integer;)Ljava/lang/Boolean; ]
      // 055: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, java/lang/Integer.parseInt (Ljava/lang/String;)I, (Ljava/lang/String;)Ljava/lang/Integer; ]
      // 05a: lload 9
      // 05c: bipush 5
      // 05d: anewarray 4
      // 060: dup_x2
      // 061: dup_x2
      // 062: pop
      // 063: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 066: bipush 4
      // 067: swap
      // 068: aastore
      // 069: dup_x1
      // 06a: swap
      // 06b: bipush 3
      // 06c: swap
      // 06d: aastore
      // 06e: dup_x1
      // 06f: swap
      // 070: bipush 2
      // 071: swap
      // 072: aastore
      // 073: dup_x1
      // 074: swap
      // 075: bipush 1
      // 076: swap
      // 077: aastore
      // 078: dup_x1
      // 079: swap
      // 07a: bipush 0
      // 07b: swap
      // 07c: aastore
      // 07d: invokespecial rip/breeze/classtransform/á.method_008 ([Ljava/lang/Object;)Ljava/lang/Object;
      // 080: checkcast java/lang/Integer
      // 083: invokevirtual java/lang/Integer.intValue ()I
      // 086: istore 11
      // 088: aload 3
      // 089: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 08e: astore 12
      // 090: istore 13
      // 092: aload 12
      // 094: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 099: ifeq 15b
      // 09c: aload 12
      // 09e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a3: checkcast rip/breeze/inject/ջ
      // 0a6: astore 14
      // 0a8: aload 14
      // 0aa: lload 7
      // 0ac: bipush 2
      // 0ad: anewarray 4
      // 0b0: dup_x2
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b6: bipush 1
      // 0b7: swap
      // 0b8: aastore
      // 0b9: dup_x1
      // 0ba: swap
      // 0bb: bipush 0
      // 0bc: swap
      // 0bd: aastore
      // 0be: invokestatic rip/breeze/classtransform/MathUtil3.getNumber ([Ljava/lang/Object;)Ljava/lang/Number;
      // 0c1: astore 15
      // 0c3: aload 15
      // 0c5: instanceof java/lang/Byte
      // 0c8: iload 13
      // 0ca: ifeq 12e
      // 0cd: ifne 122
      // 0d0: goto 0d7
      // 0d3: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: aload 15
      // 0d9: instanceof java/lang/Short
      // 0dc: iload 13
      // 0de: ifeq 12e
      // 0e1: goto 0e8
      // 0e4: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: lload 4
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: ifle 127
      // 0ef: ifne 122
      // 0f2: goto 0f9
      // 0f5: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: aload 15
      // 0fb: instanceof java/lang/Integer
      // 0fe: iload 13
      // 100: lload 4
      // 102: lconst_0
      // 103: lcmp
      // 104: ifle 130
      // 107: ifeq 12e
      // 10a: goto 111
      // 10d: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 110: athrow
      // 111: lload 4
      // 113: lconst_0
      // 114: lcmp
      // 115: ifle 158
      // 118: ifeq 156
      // 11b: goto 122
      // 11e: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: aload 15
      // 124: invokevirtual java/lang/Number.intValue ()I
      // 127: goto 12e
      // 12a: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12d: athrow
      // 12e: iload 13
      // 130: lload 4
      // 132: lconst_0
      // 133: lcmp
      // 134: ifle 13c
      // 137: ifeq 155
      // 13a: iload 11
      // 13c: if_icmpne 156
      // 13f: goto 146
      // 142: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 145: athrow
      // 146: aload 2
      // 147: aload 14
      // 149: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 14e: goto 155
      // 151: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 154: athrow
      // 155: pop
      // 156: iload 13
      // 158: ifne 092
      // 15b: return
      // try (110 -> 115): 116 java/lang/IllegalArgumentException
      // try (114 -> 122): 123 java/lang/IllegalArgumentException
      // try (118 -> 130): 131 java/lang/IllegalArgumentException
      // try (125 -> 141): 142 java/lang/IllegalArgumentException
      // try (133 -> 149): 150 java/lang/IllegalArgumentException
      // try (144 -> 154): 155 java/lang/IllegalArgumentException
      // try (157 -> 165): 166 java/lang/IllegalArgumentException
      // try (163 -> 171): 172 java/lang/IllegalArgumentException
   }

   private void invoke_3(Object[] param1) {
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
      // 00e: checkcast java/util/List
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/List
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/String
      // 021: astore 6
      // 023: pop
      // 024: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 027: lload 2
      // 028: lxor
      // 029: lstore 2
      // 02a: lload 2
      // 02b: dup2
      // 02c: ldc2_w 2304984400103
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 46294857074226
      // 036: lxor
      // 037: lstore 9
      // 039: pop2
      // 03a: aload 0
      // 03b: aload 6
      // 03d: sipush 29769
      // 040: ldc2_w 9071534943516970368
      // 043: lload 2
      // 044: lxor
      // 045: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/á.lambda$findLong_Inner1 (Ljava/lang/Integer;)Ljava/lang/Boolean;, (Ljava/lang/Integer;)Ljava/lang/Boolean; ]
      // 04f: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, java/lang/Long.parseLong (Ljava/lang/String;)J, (Ljava/lang/String;)Ljava/lang/Long; ]
      // 054: lload 9
      // 056: bipush 5
      // 057: anewarray 4
      // 05a: dup_x2
      // 05b: dup_x2
      // 05c: pop
      // 05d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 060: bipush 4
      // 061: swap
      // 062: aastore
      // 063: dup_x1
      // 064: swap
      // 065: bipush 3
      // 066: swap
      // 067: aastore
      // 068: dup_x1
      // 069: swap
      // 06a: bipush 2
      // 06b: swap
      // 06c: aastore
      // 06d: dup_x1
      // 06e: swap
      // 06f: bipush 1
      // 070: swap
      // 071: aastore
      // 072: dup_x1
      // 073: swap
      // 074: bipush 0
      // 075: swap
      // 076: aastore
      // 077: invokespecial rip/breeze/classtransform/á.method_008 ([Ljava/lang/Object;)Ljava/lang/Object;
      // 07a: checkcast java/lang/Long
      // 07d: invokevirtual java/lang/Long.longValue ()J
      // 080: lstore 11
      // 082: invokestatic rip/breeze/classtransform/BreezeClass7.getValue ()I
      // 085: aload 5
      // 087: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 08c: astore 13
      // 08e: istore 14
      // 090: aload 13
      // 092: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 097: ifeq 10f
      // 09a: aload 13
      // 09c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a1: checkcast rip/breeze/inject/ջ
      // 0a4: astore 15
      // 0a6: aload 15
      // 0a8: lload 7
      // 0aa: bipush 2
      // 0ab: anewarray 4
      // 0ae: dup_x2
      // 0af: dup_x2
      // 0b0: pop
      // 0b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b4: bipush 1
      // 0b5: swap
      // 0b6: aastore
      // 0b7: dup_x1
      // 0b8: swap
      // 0b9: bipush 0
      // 0ba: swap
      // 0bb: aastore
      // 0bc: invokestatic rip/breeze/classtransform/MathUtil3.getNumber ([Ljava/lang/Object;)Ljava/lang/Number;
      // 0bf: astore 16
      // 0c1: aload 16
      // 0c3: instanceof java/lang/Long
      // 0c6: iload 14
      // 0c8: lload 2
      // 0c9: lconst_0
      // 0ca: lcmp
      // 0cb: iflt 0ec
      // 0ce: ifeq 0ea
      // 0d1: ifeq 10a
      // 0d4: goto 0db
      // 0d7: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: aload 16
      // 0dd: invokevirtual java/lang/Number.longValue ()J
      // 0e0: lload 11
      // 0e2: lcmp
      // 0e3: goto 0ea
      // 0e6: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: iload 14
      // 0ec: ifeq 109
      // 0ef: ifne 10a
      // 0f2: goto 0f9
      // 0f5: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: aload 4
      // 0fb: aload 15
      // 0fd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 102: goto 109
      // 105: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 108: athrow
      // 109: pop
      // 10a: iload 14
      // 10c: ifne 090
      // 10f: return
      // try (110 -> 119): 120 java/lang/IllegalArgumentException
      // try (118 -> 126): 127 java/lang/IllegalArgumentException
      // try (129 -> 132): 133 java/lang/IllegalArgumentException
      // try (131 -> 138): 139 java/lang/IllegalArgumentException
   }

   private void invoke_4(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/List
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/String
      // 015: astore 4
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 5
      // 022: pop
      // 023: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 026: lload 5
      // 028: lxor
      // 029: lstore 5
      // 02b: lload 5
      // 02d: dup2
      // 02e: ldc2_w 33834443137699
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 60231660004470
      // 038: lxor
      // 039: lstore 9
      // 03b: pop2
      // 03c: invokestatic rip/breeze/classtransform/BreezeClass7.getValue ()I
      // 03f: aload 0
      // 040: aload 4
      // 042: sipush 3944
      // 045: ldc2_w 5845071066158601454
      // 048: lload 5
      // 04a: lxor
      // 04b: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/á.lambda$findFloat_Inner2 (Ljava/lang/Integer;)Ljava/lang/Boolean;, (Ljava/lang/Integer;)Ljava/lang/Boolean; ]
      // 055: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, java/lang/Float.parseFloat (Ljava/lang/String;)F, (Ljava/lang/String;)Ljava/lang/Float; ]
      // 05a: lload 9
      // 05c: bipush 5
      // 05d: anewarray 4
      // 060: dup_x2
      // 061: dup_x2
      // 062: pop
      // 063: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 066: bipush 4
      // 067: swap
      // 068: aastore
      // 069: dup_x1
      // 06a: swap
      // 06b: bipush 3
      // 06c: swap
      // 06d: aastore
      // 06e: dup_x1
      // 06f: swap
      // 070: bipush 2
      // 071: swap
      // 072: aastore
      // 073: dup_x1
      // 074: swap
      // 075: bipush 1
      // 076: swap
      // 077: aastore
      // 078: dup_x1
      // 079: swap
      // 07a: bipush 0
      // 07b: swap
      // 07c: aastore
      // 07d: invokespecial rip/breeze/classtransform/á.method_008 ([Ljava/lang/Object;)Ljava/lang/Object;
      // 080: checkcast java/lang/Float
      // 083: invokevirtual java/lang/Float.floatValue ()F
      // 086: fstore 11
      // 088: aload 3
      // 089: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 08e: astore 12
      // 090: istore 13
      // 092: aload 12
      // 094: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 099: ifeq 111
      // 09c: aload 12
      // 09e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a3: checkcast rip/breeze/inject/ջ
      // 0a6: astore 14
      // 0a8: aload 14
      // 0aa: lload 7
      // 0ac: bipush 2
      // 0ad: anewarray 4
      // 0b0: dup_x2
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b6: bipush 1
      // 0b7: swap
      // 0b8: aastore
      // 0b9: dup_x1
      // 0ba: swap
      // 0bb: bipush 0
      // 0bc: swap
      // 0bd: aastore
      // 0be: invokestatic rip/breeze/classtransform/MathUtil3.getNumber ([Ljava/lang/Object;)Ljava/lang/Number;
      // 0c1: astore 15
      // 0c3: aload 15
      // 0c5: instanceof java/lang/Float
      // 0c8: iload 13
      // 0ca: lload 5
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: ifle 0ef
      // 0d1: ifeq 0ed
      // 0d4: ifeq 10c
      // 0d7: goto 0de
      // 0da: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: aload 15
      // 0e0: invokevirtual java/lang/Number.floatValue ()F
      // 0e3: fload 11
      // 0e5: fcmpl
      // 0e6: goto 0ed
      // 0e9: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: iload 13
      // 0ef: ifeq 10b
      // 0f2: ifne 10c
      // 0f5: goto 0fc
      // 0f8: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: aload 2
      // 0fd: aload 14
      // 0ff: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 104: goto 10b
      // 107: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10a: athrow
      // 10b: pop
      // 10c: iload 13
      // 10e: ifne 092
      // 111: return
      // try (110 -> 119): 120 java/lang/IllegalArgumentException
      // try (118 -> 126): 127 java/lang/IllegalArgumentException
      // try (129 -> 132): 133 java/lang/IllegalArgumentException
      // try (131 -> 138): 139 java/lang/IllegalArgumentException
   }

   private void invoke_5(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/List
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
      // 01d: checkcast java/lang/String
      // 020: astore 6
      // 022: pop
      // 023: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 026: lload 4
      // 028: lxor
      // 029: lstore 4
      // 02b: lload 4
      // 02d: dup2
      // 02e: ldc2_w 95172126217114
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 139142101112143
      // 038: lxor
      // 039: lstore 9
      // 03b: pop2
      // 03c: aload 0
      // 03d: aload 6
      // 03f: sipush 22397
      // 042: ldc2_w 238158343272807884
      // 045: lload 4
      // 047: lxor
      // 048: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/á.lambda$findDouble_Inner3 (Ljava/lang/Integer;)Ljava/lang/Boolean;, (Ljava/lang/Integer;)Ljava/lang/Boolean; ]
      // 052: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, java/lang/Double.parseDouble (Ljava/lang/String;)D, (Ljava/lang/String;)Ljava/lang/Double; ]
      // 057: lload 9
      // 059: bipush 5
      // 05a: anewarray 4
      // 05d: dup_x2
      // 05e: dup_x2
      // 05f: pop
      // 060: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 063: bipush 4
      // 064: swap
      // 065: aastore
      // 066: dup_x1
      // 067: swap
      // 068: bipush 3
      // 069: swap
      // 06a: aastore
      // 06b: dup_x1
      // 06c: swap
      // 06d: bipush 2
      // 06e: swap
      // 06f: aastore
      // 070: dup_x1
      // 071: swap
      // 072: bipush 1
      // 073: swap
      // 074: aastore
      // 075: dup_x1
      // 076: swap
      // 077: bipush 0
      // 078: swap
      // 079: aastore
      // 07a: invokespecial rip/breeze/classtransform/á.method_008 ([Ljava/lang/Object;)Ljava/lang/Object;
      // 07d: checkcast java/lang/Double
      // 080: invokevirtual java/lang/Double.doubleValue ()D
      // 083: dstore 11
      // 085: invokestatic rip/breeze/classtransform/BreezeClass7.getValue ()I
      // 088: aload 3
      // 089: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 08e: astore 13
      // 090: istore 14
      // 092: aload 13
      // 094: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 099: ifeq 111
      // 09c: aload 13
      // 09e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a3: checkcast rip/breeze/inject/ջ
      // 0a6: astore 15
      // 0a8: aload 15
      // 0aa: lload 7
      // 0ac: bipush 2
      // 0ad: anewarray 4
      // 0b0: dup_x2
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b6: bipush 1
      // 0b7: swap
      // 0b8: aastore
      // 0b9: dup_x1
      // 0ba: swap
      // 0bb: bipush 0
      // 0bc: swap
      // 0bd: aastore
      // 0be: invokestatic rip/breeze/classtransform/MathUtil3.getNumber ([Ljava/lang/Object;)Ljava/lang/Number;
      // 0c1: astore 16
      // 0c3: aload 16
      // 0c5: instanceof java/lang/Double
      // 0c8: iload 14
      // 0ca: lload 4
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: iflt 0ef
      // 0d1: ifeq 0ed
      // 0d4: ifeq 10c
      // 0d7: goto 0de
      // 0da: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: aload 16
      // 0e0: invokevirtual java/lang/Number.doubleValue ()D
      // 0e3: dload 11
      // 0e5: dcmpl
      // 0e6: goto 0ed
      // 0e9: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: iload 14
      // 0ef: ifeq 10b
      // 0f2: ifne 10c
      // 0f5: goto 0fc
      // 0f8: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: aload 2
      // 0fd: aload 15
      // 0ff: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 104: goto 10b
      // 107: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10a: athrow
      // 10b: pop
      // 10c: iload 14
      // 10e: ifne 092
      // 111: return
      // try (110 -> 119): 120 java/lang/IllegalArgumentException
      // try (118 -> 126): 127 java/lang/IllegalArgumentException
      // try (129 -> 132): 133 java/lang/IllegalArgumentException
      // try (131 -> 138): 139 java/lang/IllegalArgumentException
   }

   private void invoke_6(Object[] param1) {
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
      // 0e: checkcast java/util/List
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/List
      // 19: astore 5
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast java/lang/String
      // 21: astore 6
      // 23: pop
      // 24: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 27: lload 2
      // 28: lxor
      // 29: lstore 2
      // 2a: lload 2
      // 2b: dup2
      // 2c: ldc2_w 3226571827544
      // 2f: lxor
      // 30: lstore 7
      // 32: pop2
      // 33: aload 0
      // 34: aload 6
      // 36: sipush 15663
      // 39: ldc2_w 4188114853921631109
      // 3c: lload 2
      // 3d: lxor
      // 3e: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/á.lambda$findString_Inner4 (Ljava/lang/Integer;)Ljava/lang/Boolean;, (Ljava/lang/Integer;)Ljava/lang/Boolean; ]
      // 48: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/á.lambda$findString_Inner5 (Ljava/lang/String;)Ljava/lang/String;, (Ljava/lang/String;)Ljava/lang/String; ]
      // 4d: lload 7
      // 4f: bipush 5
      // 50: anewarray 4
      // 53: dup_x2
      // 54: dup_x2
      // 55: pop
      // 56: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59: bipush 4
      // 5a: swap
      // 5b: aastore
      // 5c: dup_x1
      // 5d: swap
      // 5e: bipush 3
      // 5f: swap
      // 60: aastore
      // 61: dup_x1
      // 62: swap
      // 63: bipush 2
      // 64: swap
      // 65: aastore
      // 66: dup_x1
      // 67: swap
      // 68: bipush 1
      // 69: swap
      // 6a: aastore
      // 6b: dup_x1
      // 6c: swap
      // 6d: bipush 0
      // 6e: swap
      // 6f: aastore
      // 70: invokespecial rip/breeze/classtransform/á.method_008 ([Ljava/lang/Object;)Ljava/lang/Object;
      // 73: checkcast java/lang/String
      // 76: astore 9
      // 78: invokestatic rip/breeze/classtransform/BreezeClass7.getValue_2 ()I
      // 7b: aload 5
      // 7d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 82: astore 10
      // 84: istore 11
      // 86: aload 10
      // 88: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 8d: ifeq ef
      // 90: aload 10
      // 92: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 97: checkcast rip/breeze/inject/ջ
      // 9a: astore 12
      // 9c: aload 12
      // 9e: instanceof rip/breeze/inject/ղ
      // a1: iload 11
      // a3: lload 2
      // a4: lconst_0
      // a5: lcmp
      // a6: iflt cc
      // a9: ifne ca
      // ac: ifeq ea
      // af: goto b6
      // b2: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b5: athrow
      // b6: aload 9
      // b8: aload 12
      // ba: checkcast rip/breeze/inject/ղ
      // bd: getfield rip/breeze/inject/ղ.object_ç_2 Ljava/lang/Object;
      // c0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // c3: goto ca
      // c6: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c9: athrow
      // ca: iload 11
      // cc: ifne e9
      // cf: ifeq ea
      // d2: goto d9
      // d5: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d8: athrow
      // d9: aload 4
      // db: aload 12
      // dd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // e2: goto e9
      // e5: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e8: athrow
      // e9: pop
      // ea: iload 11
      // ec: ifeq 86
      // ef: return
      // try (87 -> 96): 97 java/lang/IllegalArgumentException
      // try (95 -> 104): 105 java/lang/IllegalArgumentException
      // try (107 -> 110): 111 java/lang/IllegalArgumentException
      // try (109 -> 116): 117 java/lang/IllegalArgumentException
   }

   private void invoke_7(Object[] param1) {
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
      // 04: checkcast java/util/List
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/util/List
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/String
      // 15: astore 4
      // 17: dup
      // 18: bipush 3
      // 19: aaload
      // 1a: checkcast java/lang/Long
      // 1d: invokevirtual java/lang/Long.longValue ()J
      // 20: lstore 5
      // 22: pop
      // 23: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 26: lload 5
      // 28: lxor
      // 29: lstore 5
      // 2b: lload 5
      // 2d: dup2
      // 2e: ldc2_w 53580712240930
      // 31: lxor
      // 32: lstore 7
      // 34: pop2
      // 35: aload 0
      // 36: aload 4
      // 38: sipush 3293
      // 3b: ldc2_w 5031043155387847683
      // 3e: lload 5
      // 40: lxor
      // 41: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/á.lambda$findType_Inner6 (Ljava/lang/Integer;)Ljava/lang/Boolean;, (Ljava/lang/Integer;)Ljava/lang/Boolean; ]
      // 4b: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/inject/MathUtil3.getDataBuilder (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;, (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3; ]
      // 50: lload 7
      // 52: bipush 5
      // 53: anewarray 4
      // 56: dup_x2
      // 57: dup_x2
      // 58: pop
      // 59: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c: bipush 4
      // 5d: swap
      // 5e: aastore
      // 5f: dup_x1
      // 60: swap
      // 61: bipush 3
      // 62: swap
      // 63: aastore
      // 64: dup_x1
      // 65: swap
      // 66: bipush 2
      // 67: swap
      // 68: aastore
      // 69: dup_x1
      // 6a: swap
      // 6b: bipush 1
      // 6c: swap
      // 6d: aastore
      // 6e: dup_x1
      // 6f: swap
      // 70: bipush 0
      // 71: swap
      // 72: aastore
      // 73: invokespecial rip/breeze/classtransform/á.method_008 ([Ljava/lang/Object;)Ljava/lang/Object;
      // 76: checkcast rip/breeze/inject/MathUtil3
      // 79: astore 9
      // 7b: invokestatic rip/breeze/classtransform/BreezeClass7.getValue_2 ()I
      // 7e: aload 3
      // 7f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 84: astore 10
      // 86: istore 11
      // 88: aload 10
      // 8a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 8f: ifeq f1
      // 92: aload 10
      // 94: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 99: checkcast rip/breeze/inject/ջ
      // 9c: astore 12
      // 9e: aload 12
      // a0: instanceof rip/breeze/inject/ղ
      // a3: iload 11
      // a5: lload 5
      // a7: lconst_0
      // a8: lcmp
      // a9: iflt cf
      // ac: ifne cd
      // af: ifeq ec
      // b2: goto b9
      // b5: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b8: athrow
      // b9: aload 9
      // bb: aload 12
      // bd: checkcast rip/breeze/inject/ղ
      // c0: getfield rip/breeze/inject/ղ.object_ç_2 Ljava/lang/Object;
      // c3: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // c6: goto cd
      // c9: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cc: athrow
      // cd: iload 11
      // cf: ifne eb
      // d2: ifeq ec
      // d5: goto dc
      // d8: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // db: athrow
      // dc: aload 2
      // dd: aload 12
      // df: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // e4: goto eb
      // e7: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ea: athrow
      // eb: pop
      // ec: iload 11
      // ee: ifeq 88
      // f1: return
      // try (87 -> 96): 97 java/lang/IllegalArgumentException
      // try (95 -> 104): 105 java/lang/IllegalArgumentException
      // try (107 -> 110): 111 java/lang/IllegalArgumentException
      // try (109 -> 116): 117 java/lang/IllegalArgumentException
   }

   private Object call_8(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      Function var4 = (Function)var1[2];
      Function var5 = (Function)var1[3];
      long var6 = (Long)var1[4];
      var6 = encKey_a_2 ^ var6;
      long var8 = var6 ^ 119581572951822L;
      String[] var10 = var2.split(" ");

      try {
         if (!(Boolean)var4.apply(var10.length)) {
            throw new IllegalArgumentException(
               var3
                  + ((String)null)
                  + this.method_009(new Object[]{var8, var3})
                  + " "
                  + var3
                  + ((String)null)
            );
         }
      } catch (Throwable var15) {
         throw method_010(var15);
      }

      String var11 = var2.substring(var10[0].length() + 1);

      try {
         return var5.apply(var11);
      } catch (Throwable var14) {
         throw new IllegalArgumentException(var3 + ((String)null) + this.method_009(new Object[]{var8, var3}) + " " + var3);
      }
   }

   private String invoke_9(Object[] param1) {
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
      // 14: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: invokestatic rip/breeze/classtransform/BreezeClass7.getValue ()I
      // 1d: aload 4
      // 1f: invokevirtual java/lang/String.toUpperCase ()Ljava/lang/String;
      // 22: bipush 0
      // 23: invokevirtual java/lang/String.charAt (I)C
      // 26: istore 5
      // 28: istore 6
      // 2a: iload 5
      // 2c: bipush 65
      // 2e: iload 6
      // 30: ifeq 48
      // 33: if_icmpeq ab
      // 36: goto 3d
      // 39: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: iload 5
      // 3f: bipush 69
      // 41: goto 48
      // 44: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: iload 6
      // 4a: lload 2
      // 4b: lconst_0
      // 4c: lcmp
      // 4d: iflt 6a
      // 50: ifeq 68
      // 53: if_icmpeq ab
      // 56: goto 5d
      // 59: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: iload 5
      // 5f: bipush 73
      // 61: goto 68
      // 64: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: iload 6
      // 6a: lload 2
      // 6b: lconst_0
      // 6c: lcmp
      // 6d: ifle 90
      // 70: ifeq 88
      // 73: if_icmpeq ab
      // 76: goto 7d
      // 79: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: iload 5
      // 7f: bipush 79
      // 81: goto 88
      // 84: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: lload 2
      // 89: lconst_0
      // 8a: lcmp
      // 8b: iflt a8
      // 8e: iload 6
      // 90: ifeq a8
      // 93: if_icmpeq ab
      // 96: goto 9d
      // 99: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9c: athrow
      // 9d: iload 5
      // 9f: bipush 85
      // a1: goto a8
      // a4: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a7: athrow
      // a8: if_icmpne bd
      // ab: sipush 32716
      // ae: ldc2_w 8620441129733156660
      // b1: lload 2
      // b2: lxor
      // b3: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/á.method_014 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: areturn
      // b9: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc: athrow
      // bd: ldc_w "a"
      // c0: areturn
      // try (24 -> 29): 30 java/lang/IllegalArgumentException
      // try (28 -> 34): 35 java/lang/IllegalArgumentException
      // try (37 -> 44): 45 java/lang/IllegalArgumentException
      // try (43 -> 49): 50 java/lang/IllegalArgumentException
      // try (52 -> 59): 60 java/lang/IllegalArgumentException
      // try (58 -> 64): 65 java/lang/IllegalArgumentException
      // try (67 -> 74): 75 java/lang/IllegalArgumentException
      // try (73 -> 79): 80 java/lang/IllegalArgumentException
      // try (82 -> 89): 89 java/lang/IllegalArgumentException
   }

   private static Boolean lambda$findType_Inner6(Integer param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 03: ldc2_w 43499339500252
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/classtransform/BreezeClass7.getValue_2 ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual java/lang/Integer.intValue ()I
      // 10: iload 3
      // 11: ifne 27
      // 14: bipush 2
      // 15: if_icmpne 2a
      // 18: goto 1f
      // 1b: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: bipush 1
      // 20: goto 27
      // 23: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2e: areturn
      // try (6 -> 12): 13 java/lang/IllegalArgumentException
      // try (10 -> 16): 17 java/lang/IllegalArgumentException
   }

   private static String lambda$findString_Inner5(String var0) {
      return var0;
   }

   private static Boolean lambda$findString_Inner4(Integer param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 03: ldc2_w 61196093936273
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/classtransform/BreezeClass7.getValue_2 ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual java/lang/Integer.intValue ()I
      // 10: iload 3
      // 11: ifne 27
      // 14: bipush 2
      // 15: if_icmplt 2a
      // 18: goto 1f
      // 1b: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: bipush 1
      // 20: goto 27
      // 23: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2e: areturn
      // try (6 -> 12): 13 java/lang/IllegalArgumentException
      // try (10 -> 16): 17 java/lang/IllegalArgumentException
   }

   private static Boolean lambda$findDouble_Inner3(Integer param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 03: ldc2_w 133666812724397
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/classtransform/BreezeClass7.getValue ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual java/lang/Integer.intValue ()I
      // 10: iload 3
      // 11: ifeq 27
      // 14: bipush 2
      // 15: if_icmpne 2a
      // 18: goto 1f
      // 1b: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: bipush 1
      // 20: goto 27
      // 23: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2e: areturn
      // try (6 -> 12): 13 java/lang/IllegalArgumentException
      // try (10 -> 16): 17 java/lang/IllegalArgumentException
   }

   private static Boolean lambda$findFloat_Inner2(Integer param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 03: ldc2_w 63491107200059
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/classtransform/BreezeClass7.getValue_2 ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual java/lang/Integer.intValue ()I
      // 10: iload 3
      // 11: ifne 27
      // 14: bipush 2
      // 15: if_icmpne 2a
      // 18: goto 1f
      // 1b: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: bipush 1
      // 20: goto 27
      // 23: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2e: areturn
      // try (6 -> 12): 13 java/lang/IllegalArgumentException
      // try (10 -> 16): 17 java/lang/IllegalArgumentException
   }

   private static Boolean lambda$findLong_Inner1(Integer param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 03: ldc2_w 46787132504319
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/classtransform/BreezeClass7.getValue_2 ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual java/lang/Integer.intValue ()I
      // 10: iload 3
      // 11: ifne 27
      // 14: bipush 2
      // 15: if_icmpne 2a
      // 18: goto 1f
      // 1b: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: bipush 1
      // 20: goto 27
      // 23: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2e: areturn
      // try (6 -> 12): 13 java/lang/IllegalArgumentException
      // try (10 -> 16): 17 java/lang/IllegalArgumentException
   }

   private static Boolean lambda$findInt_Inner0(Integer param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/classtransform/á.encKey_a_2 J
      // 03: ldc2_w 108394512661525
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/classtransform/BreezeClass7.getValue ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual java/lang/Integer.intValue ()I
      // 10: iload 3
      // 11: ifeq 27
      // 14: bipush 2
      // 15: if_icmpne 2a
      // 18: goto 1f
      // 1b: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: bipush 1
      // 20: goto 27
      // 23: invokestatic rip/breeze/classtransform/á.method_010 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2e: areturn
      // try (6 -> 12): 13 java/lang/IllegalArgumentException
      // try (10 -> 16): 17 java/lang/IllegalArgumentException
   }

   static {
      long var0 = 67395440537039L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[18];
      int var5 = 0;
      String var6 = "*\u0004´\u0001KÒfã\u001f\u0088³«K«\u007f{\u009bC|%\u0087zmWc\u0017?Xåß 2\u0010ÓE4P\u007fó¯\u001e\u0001'wJ{\u0014[\"\u0010\u001e<1\u0007fÛ\u0084â\u0099Î\u001d·{ï(ú\u0010æÓ[\u0004\t8âê2\u0088Þ¯\u0095\u0004ë<8\u009ajn³ï0 vVgðê\u0016¦\u008c\u000b\u0004!$ñ²z!\t/½fGö\n%G\u0019*½\u0005 Ç\u008cºÀ\u007fá&\u0004ÕÕ@Yê\u001e] yø\u0016\u0010Ýj\u0097Ó¼\u001f\u001f\u0093Ýe$ÐD\u001a6ÿ\u0010\bÃëy\u0090Zþ\u008fð¿± \u0001\u0089\u0096ï(êÂÿdZÁ¹;_»ûv\u000fü\u0001º\u0084,w\u008fLBü\u00054·\u0091\u0082\u008bg½×i\u0002é'.oÉÓ\u0010ð\u001d\u001c,(?,±\u009f\u0091g×$ëYò\u0010\u0092©óÙÌeÍv¥5Î\t¿\u0087\bÙ8yÊTÓ\u0089Ö\u0085¯¥\u001c¼x\u0003¼\u00adÛÓy¤Jñ(Ï©GADj\u001cu}¥\u00adÖ®iÔ*¾Z\u001el´TÕ+oà©0\u000bô\u0088~\u001c½\u0010wj\u0097Û×µÁv\\ûÙÜç5øa\u0010Ä¯\f*þò¼\\T;}×\u0099 \u0086\u0085\u0010æ÷)\u0096¨¾r!\u0092¼\u0019F7Ç`y\u0010Í{ÆBo\u001a\rtÏýbúC®\u0090\t\u0010°\u001c°\u008f\u0094FÖ\u0084É\u008eú¢ðcìÆ";
      int var7 = "*\u0004´\u0001KÒfã\u001f\u0088³«K«\u007f{\u009bC|%\u0087zmWc\u0017?Xåß 2\u0010ÓE4P\u007fó¯\u001e\u0001'wJ{\u0014[\"\u0010\u001e<1\u0007fÛ\u0084â\u0099Î\u001d·{ï(ú\u0010æÓ[\u0004\t8âê2\u0088Þ¯\u0095\u0004ë<8\u009ajn³ï0 vVgðê\u0016¦\u008c\u000b\u0004!$ñ²z!\t/½fGö\n%G\u0019*½\u0005 Ç\u008cºÀ\u007fá&\u0004ÕÕ@Yê\u001e] yø\u0016\u0010Ýj\u0097Ó¼\u001f\u001f\u0093Ýe$ÐD\u001a6ÿ\u0010\bÃëy\u0090Zþ\u008fð¿± \u0001\u0089\u0096ï(êÂÿdZÁ¹;_»ûv\u000fü\u0001º\u0084,w\u008fLBü\u00054·\u0091\u0082\u008bg½×i\u0002é'.oÉÓ\u0010ð\u001d\u001c,(?,±\u009f\u0091g×$ëYò\u0010\u0092©óÙÌeÍv¥5Î\t¿\u0087\bÙ8yÊTÓ\u0089Ö\u0085¯¥\u001c¼x\u0003¼\u00adÛÓy¤Jñ(Ï©GADj\u001cu}¥\u00adÖ®iÔ*¾Z\u001el´TÕ+oà©0\u000bô\u0088~\u001c½\u0010wj\u0097Û×µÁv\\ûÙÜç5øa\u0010Ä¯\f*þò¼\\T;}×\u0099 \u0086\u0085\u0010æ÷)\u0096¨¾r!\u0092¼\u0019F7Ç`y\u0010Í{ÆBo\u001a\rtÏýbúC®\u0090\t\u0010°\u001c°\u008f\u0094FÖ\u0084É\u008eú¢ðcìÆ"
         .length();
      char var8 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = method_011(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_B_2 = var4;
                     CONST_C_2 = new String[18];
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

                  var6 = "ýÄô#\u0099\u0088rihá\u0014\u0017¬ò\ná\u0010Å0©g'\u0081a#Ìj°ämMI\u0083";
                  var7 = "ýÄô#\u0099\u0088rihá\u0014\u0017¬ò\ná\u0010Å0©g'\u0081a#Ìj°ämMI\u0083".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static Throwable invoke_10(Throwable var0) {
      return var0;
   }

   private static String invoke_11(byte[] var0) {
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

   private static String invoke_12(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11858;
      if (CONST_C_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/á", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B_2[var3].getBytes("ISO-8859-1");
         CONST_C_2[var3] = method_011(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }

   private static Object call_13(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = method_012(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite invoke_14(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("method_013".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/á" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
