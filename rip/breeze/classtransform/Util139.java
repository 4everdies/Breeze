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
import rip.breeze.classtransform.annotations.injection.CRedirect;

public class Util139 extends Util140<CRedirect> {
   private final BreezeClass breezeClass_û = new BreezeClass();
   private final Util138 dataBuilder3_ú = new Util138();
   private final PlayerUtil8 dataBuilder2_ù = new PlayerUtil8();
   private static final String[] CONST_I;
   private static final String[] CONST_J;
   private static final Map CONST_K = new HashMap(13);

   public Util139() {
      super(CRedirect.class, Util139::lambda$new_Inner0);
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/classtransform/annotations/injection/CRedirect
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast rip/breeze/classtransform/ó
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast rip/breeze/inject/é
      // 021: astore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast rip/breeze/inject/é
      // 029: astore 7
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast rip/breeze/inject/BreezeClass12
      // 031: astore 8
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast rip/breeze/inject/BreezeClass12
      // 03a: astore 9
      // 03c: pop
      // 03d: getstatic rip/breeze/classtransform/Util139.encKey_b J
      // 040: lload 2
      // 041: lxor
      // 042: lstore 2
      // 043: lload 2
      // 044: dup2
      // 045: ldc2_w 128479455354082
      // 048: lxor
      // 049: lstore 10
      // 04b: dup2
      // 04c: ldc2_w 118349021114873
      // 04f: lxor
      // 050: lstore 12
      // 052: dup2
      // 053: ldc2_w 27963547431852
      // 056: lxor
      // 057: lstore 14
      // 059: dup2
      // 05a: ldc2_w 77093399201607
      // 05d: lxor
      // 05e: lstore 16
      // 060: dup2
      // 061: ldc2_w 77093399201607
      // 064: lxor
      // 065: lstore 18
      // 067: dup2
      // 068: ldc2_w 26754641079224
      // 06b: lxor
      // 06c: lstore 20
      // 06e: dup2
      // 06f: ldc2_w 18420689017015
      // 072: lxor
      // 073: lstore 22
      // 075: dup2
      // 076: ldc2_w 77093399201607
      // 079: lxor
      // 07a: lstore 24
      // 07c: pop2
      // 07d: invokestatic rip/breeze/classtransform/BreezeClass5.getValue ()I
      // 080: aload 5
      // 082: bipush 0
      // 083: anewarray 99
      // 086: invokevirtual rip/breeze/classtransform/ó.method_003 ([Ljava/lang/Object;)Ljava/util/Map;
      // 089: astore 26
      // 08b: istore 27
      // 08d: aload 26
      // 08f: aload 4
      // 091: invokeinterface rip/breeze/classtransform/annotations/injection/CRedirect.target ()Lrip/breeze/classtransform/annotations/CTarget; 1
      // 096: invokeinterface rip/breeze/classtransform/annotations/CTarget.value ()Ljava/lang/String; 1
      // 09b: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 09e: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 0a1: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0a6: checkcast rip/breeze/classtransform/â
      // 0a9: astore 28
      // 0ab: aload 28
      // 0ad: ifnonnull 0d7
      // 0b0: new rip/breeze/classtransform/ե
      // 0b3: dup
      // 0b4: aload 8
      // 0b6: aload 7
      // 0b8: aload 4
      // 0ba: invokeinterface rip/breeze/classtransform/annotations/injection/CRedirect.target ()Lrip/breeze/classtransform/annotations/CTarget; 1
      // 0bf: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 0c4: lload 22
      // 0c6: dup2_x1
      // 0c7: pop2
      // 0c8: aload 26
      // 0ca: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 0cf: invokespecial rip/breeze/classtransform/ե.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;Ljava/util/Collection;)V
      // 0d2: athrow
      // 0d3: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 0d6: athrow
      // 0d7: aload 9
      // 0d9: iload 27
      // 0db: ifeq 0ff
      // 0de: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 0e1: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 0e4: aload 8
      // 0e6: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 0e9: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 0ec: if_icmpeq 12e
      // 0ef: goto 0f6
      // 0f2: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 0f5: athrow
      // 0f6: aload 8
      // 0f8: goto 0ff
      // 0fb: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 0fe: athrow
      // 0ff: lload 14
      // 101: aload 7
      // 103: aload 9
      // 105: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 108: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 10b: bipush 4
      // 10c: anewarray 99
      // 10f: dup_x1
      // 110: swap
      // 111: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 114: bipush 3
      // 115: swap
      // 116: aastore
      // 117: dup_x1
      // 118: swap
      // 119: bipush 2
      // 11a: swap
      // 11b: aastore
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
      // 12a: invokestatic rip/breeze/classtransform/գ.getԳ ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 12d: athrow
      // 12e: aload 28
      // 130: aload 26
      // 132: aload 9
      // 134: aload 4
      // 136: invokeinterface rip/breeze/classtransform/annotations/injection/CRedirect.target ()Lrip/breeze/classtransform/annotations/CTarget; 1
      // 13b: lload 20
      // 13d: dup2_x1
      // 13e: pop2
      // 13f: bipush 4
      // 140: anewarray 99
      // 143: dup_x1
      // 144: swap
      // 145: bipush 3
      // 146: swap
      // 147: aastore
      // 148: dup_x2
      // 149: dup_x2
      // 14a: pop
      // 14b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14e: bipush 2
      // 14f: swap
      // 150: aastore
      // 151: dup_x1
      // 152: swap
      // 153: bipush 1
      // 154: swap
      // 155: aastore
      // 156: dup_x1
      // 157: swap
      // 158: bipush 0
      // 159: swap
      // 15a: aastore
      // 15b: invokeinterface rip/breeze/classtransform/â.method_001 ([Ljava/lang/Object;)Ljava/util/List; 2
      // 160: astore 29
      // 162: aload 29
      // 164: lload 2
      // 165: lconst_0
      // 166: lcmp
      // 167: iflt 1d6
      // 16a: iload 27
      // 16c: ifeq 1d6
      // 16f: ifnonnull 1d4
      // 172: goto 179
      // 175: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 178: athrow
      // 179: new rip/breeze/classtransform/գ
      // 17c: dup
      // 17d: aload 8
      // 17f: aload 7
      // 181: new java/lang/StringBuilder
      // 184: dup
      // 185: invokespecial java/lang/StringBuilder.<init> ()V
      // 188: sipush 16601
      // 18b: ldc2_w 1640834286133140677
      // 18e: lload 2
      // 18f: lxor
      // 190: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 198: aload 4
      // 19a: invokeinterface rip/breeze/classtransform/annotations/injection/CRedirect.target ()Lrip/breeze/classtransform/annotations/CTarget; 1
      // 19f: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 1a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a7: ldc "'"
      // 1a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1af: lload 12
      // 1b1: dup2_x1
      // 1b2: pop2
      // 1b3: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 1b6: sipush 17964
      // 1b9: ldc2_w 9197051621838412340
      // 1bc: lload 2
      // 1bd: lxor
      // 1be: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: bipush 1
      // 1c4: anewarray 99
      // 1c7: dup_x1
      // 1c8: swap
      // 1c9: bipush 0
      // 1ca: swap
      // 1cb: aastore
      // 1cc: invokevirtual rip/breeze/classtransform/գ.getԳ_8 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 1cf: athrow
      // 1d0: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 1d3: athrow
      // 1d4: aload 29
      // 1d6: invokeinterface java/util/List.isEmpty ()Z 1
      // 1db: lload 2
      // 1dc: lconst_0
      // 1dd: lcmp
      // 1de: iflt 203
      // 1e1: iload 27
      // 1e3: ifeq 203
      // 1e6: ifeq 26c
      // 1e9: goto 1f0
      // 1ec: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 1ef: athrow
      // 1f0: aload 4
      // 1f2: invokeinterface rip/breeze/classtransform/annotations/injection/CRedirect.target ()Lrip/breeze/classtransform/annotations/CTarget; 1
      // 1f7: invokeinterface rip/breeze/classtransform/annotations/CTarget.optional ()Z 1
      // 1fc: goto 203
      // 1ff: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 202: athrow
      // 203: ifne 26c
      // 206: new rip/breeze/classtransform/գ
      // 209: dup
      // 20a: aload 8
      // 20c: aload 7
      // 20e: new java/lang/StringBuilder
      // 211: dup
      // 212: invokespecial java/lang/StringBuilder.<init> ()V
      // 215: sipush 17632
      // 218: ldc2_w 3066000227871512829
      // 21b: lload 2
      // 21c: lxor
      // 21d: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 225: aload 4
      // 227: invokeinterface rip/breeze/classtransform/annotations/injection/CRedirect.target ()Lrip/breeze/classtransform/annotations/CTarget; 1
      // 22c: invokeinterface rip/breeze/classtransform/annotations/CTarget.target ()Ljava/lang/String; 1
      // 231: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 234: sipush 7378
      // 237: ldc2_w 2746669415583449288
      // 23a: lload 2
      // 23b: lxor
      // 23c: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 244: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 247: lload 12
      // 249: dup2_x1
      // 24a: pop2
      // 24b: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 24e: sipush 27322
      // 251: ldc2_w 5373611027185071781
      // 254: lload 2
      // 255: lxor
      // 256: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: bipush 1
      // 25c: anewarray 99
      // 25f: dup_x1
      // 260: swap
      // 261: bipush 0
      // 262: swap
      // 263: aastore
      // 264: invokevirtual rip/breeze/classtransform/գ.getԳ_8 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 267: athrow
      // 268: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 26b: athrow
      // 26c: new java/util/ArrayList
      // 26f: dup
      // 270: invokespecial java/util/ArrayList.<init> ()V
      // 273: astore 30
      // 275: aload 0
      // 276: aload 8
      // 278: aload 9
      // 27a: aload 7
      // 27c: lload 10
      // 27e: aload 6
      // 280: sipush 14654
      // 283: ldc2_w 1913745743539610917
      // 286: lload 2
      // 287: lxor
      // 288: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: bipush 6
      // 28f: anewarray 99
      // 292: dup_x1
      // 293: swap
      // 294: bipush 5
      // 295: swap
      // 296: aastore
      // 297: dup_x1
      // 298: swap
      // 299: bipush 4
      // 29a: swap
      // 29b: aastore
      // 29c: dup_x2
      // 29d: dup_x2
      // 29e: pop
      // 29f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a2: bipush 3
      // 2a3: swap
      // 2a4: aastore
      // 2a5: dup_x1
      // 2a6: swap
      // 2a7: bipush 2
      // 2a8: swap
      // 2a9: aastore
      // 2aa: dup_x1
      // 2ab: swap
      // 2ac: bipush 1
      // 2ad: swap
      // 2ae: aastore
      // 2af: dup_x1
      // 2b0: swap
      // 2b1: bipush 0
      // 2b2: swap
      // 2b3: aastore
      // 2b4: invokevirtual rip/breeze/classtransform/Util139.ø ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass12;
      // 2b7: pop
      // 2b8: aload 29
      // 2ba: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2bf: astore 31
      // 2c1: aload 31
      // 2c3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2c8: ifeq 4b4
      // 2cb: aload 31
      // 2cd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2d2: checkcast rip/breeze/inject/ջ
      // 2d5: astore 32
      // 2d7: aload 32
      // 2d9: instanceof rip/breeze/inject/կ
      // 2dc: lload 2
      // 2dd: lconst_0
      // 2de: lcmp
      // 2df: ifle 3fb
      // 2e2: iload 27
      // 2e4: ifeq 3fb
      // 2e7: ifeq 3ef
      // 2ea: goto 2f1
      // 2ed: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 2f0: athrow
      // 2f1: aload 32
      // 2f3: bipush 0
      // 2f4: anewarray 99
      // 2f7: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 2fa: lload 2
      // 2fb: lconst_0
      // 2fc: lcmp
      // 2fd: ifle 33e
      // 300: iload 27
      // 302: ifeq 33e
      // 305: goto 30c
      // 308: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 30b: athrow
      // 30c: lload 2
      // 30d: lconst_0
      // 30e: lcmp
      // 30f: iflt 3df
      // 312: sipush 183
      // 315: if_icmpne 39b
      // 318: goto 31f
      // 31b: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 31e: athrow
      // 31f: aload 32
      // 321: checkcast rip/breeze/inject/կ
      // 324: getfield rip/breeze/inject/կ.string_æ_2 Ljava/lang/String;
      // 327: sipush 11292
      // 32a: ldc2_w 5123403330613653512
      // 32d: lload 2
      // 32e: lxor
      // 32f: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 334: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 337: goto 33e
      // 33a: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 33d: athrow
      // 33e: lload 2
      // 33f: lconst_0
      // 340: lcmp
      // 341: iflt 3df
      // 344: ifeq 39b
      // 347: aload 0
      // 348: getfield rip/breeze/classtransform/Util139.dataBuilder2_ù Lrip/breeze/classtransform/PlayerUtil8;
      // 34b: aload 6
      // 34d: lload 16
      // 34f: aload 9
      // 351: aload 7
      // 353: aload 8
      // 355: aload 32
      // 357: aload 30
      // 359: bipush 7
      // 35b: anewarray 99
      // 35e: dup_x1
      // 35f: swap
      // 360: bipush 6
      // 362: swap
      // 363: aastore
      // 364: dup_x1
      // 365: swap
      // 366: bipush 5
      // 367: swap
      // 368: aastore
      // 369: dup_x1
      // 36a: swap
      // 36b: bipush 4
      // 36c: swap
      // 36d: aastore
      // 36e: dup_x1
      // 36f: swap
      // 370: bipush 3
      // 371: swap
      // 372: aastore
      // 373: dup_x1
      // 374: swap
      // 375: bipush 2
      // 376: swap
      // 377: aastore
      // 378: dup_x2
      // 379: dup_x2
      // 37a: pop
      // 37b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 37e: bipush 1
      // 37f: swap
      // 380: aastore
      // 381: dup_x1
      // 382: swap
      // 383: bipush 0
      // 384: swap
      // 385: aastore
      // 386: invokevirtual rip/breeze/classtransform/PlayerUtil8.processAll ([Ljava/lang/Object;)V
      // 389: iload 27
      // 38b: lload 2
      // 38c: lconst_0
      // 38d: lcmp
      // 38e: iflt 4b1
      // 391: ifne 4af
      // 394: goto 39b
      // 397: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 39a: athrow
      // 39b: aload 0
      // 39c: getfield rip/breeze/classtransform/Util139.breezeClass_û Lrip/breeze/classtransform/BreezeClass;
      // 39f: aload 6
      // 3a1: lload 18
      // 3a3: aload 9
      // 3a5: aload 7
      // 3a7: aload 8
      // 3a9: aload 32
      // 3ab: aload 30
      // 3ad: bipush 7
      // 3af: anewarray 99
      // 3b2: dup_x1
      // 3b3: swap
      // 3b4: bipush 6
      // 3b6: swap
      // 3b7: aastore
      // 3b8: dup_x1
      // 3b9: swap
      // 3ba: bipush 5
      // 3bb: swap
      // 3bc: aastore
      // 3bd: dup_x1
      // 3be: swap
      // 3bf: bipush 4
      // 3c0: swap
      // 3c1: aastore
      // 3c2: dup_x1
      // 3c3: swap
      // 3c4: bipush 3
      // 3c5: swap
      // 3c6: aastore
      // 3c7: dup_x1
      // 3c8: swap
      // 3c9: bipush 2
      // 3ca: swap
      // 3cb: aastore
      // 3cc: dup_x2
      // 3cd: dup_x2
      // 3ce: pop
      // 3cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3d2: bipush 1
      // 3d3: swap
      // 3d4: aastore
      // 3d5: dup_x1
      // 3d6: swap
      // 3d7: bipush 0
      // 3d8: swap
      // 3d9: aastore
      // 3da: invokevirtual rip/breeze/classtransform/BreezeClass.processAll ([Ljava/lang/Object;)V
      // 3dd: iload 27
      // 3df: lload 2
      // 3e0: lconst_0
      // 3e1: lcmp
      // 3e2: iflt 4b1
      // 3e5: ifne 4af
      // 3e8: goto 3ef
      // 3eb: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 3ee: athrow
      // 3ef: aload 32
      // 3f1: instanceof rip/breeze/inject/պ
      // 3f4: goto 3fb
      // 3f7: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 3fa: athrow
      // 3fb: lload 2
      // 3fc: lconst_0
      // 3fd: lcmp
      // 3fe: iflt 448
      // 401: ifeq 458
      // 404: aload 0
      // 405: getfield rip/breeze/classtransform/Util139.dataBuilder3_ú Lrip/breeze/classtransform/Util138;
      // 408: aload 6
      // 40a: lload 24
      // 40c: aload 9
      // 40e: aload 7
      // 410: aload 8
      // 412: aload 32
      // 414: aload 30
      // 416: bipush 7
      // 418: anewarray 99
      // 41b: dup_x1
      // 41c: swap
      // 41d: bipush 6
      // 41f: swap
      // 420: aastore
      // 421: dup_x1
      // 422: swap
      // 423: bipush 5
      // 424: swap
      // 425: aastore
      // 426: dup_x1
      // 427: swap
      // 428: bipush 4
      // 429: swap
      // 42a: aastore
      // 42b: dup_x1
      // 42c: swap
      // 42d: bipush 3
      // 42e: swap
      // 42f: aastore
      // 430: dup_x1
      // 431: swap
      // 432: bipush 2
      // 433: swap
      // 434: aastore
      // 435: dup_x2
      // 436: dup_x2
      // 437: pop
      // 438: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43b: bipush 1
      // 43c: swap
      // 43d: aastore
      // 43e: dup_x1
      // 43f: swap
      // 440: bipush 0
      // 441: swap
      // 442: aastore
      // 443: invokevirtual rip/breeze/classtransform/Util138.processAll ([Ljava/lang/Object;)V
      // 446: iload 27
      // 448: lload 2
      // 449: lconst_0
      // 44a: lcmp
      // 44b: ifle 4b1
      // 44e: ifne 4af
      // 451: goto 458
      // 454: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 457: athrow
      // 458: new rip/breeze/classtransform/ե
      // 45b: dup
      // 45c: aload 8
      // 45e: aload 7
      // 460: aload 4
      // 462: invokeinterface rip/breeze/classtransform/annotations/injection/CRedirect.target ()Lrip/breeze/classtransform/annotations/CTarget; 1
      // 467: invokeinterface rip/breeze/classtransform/annotations/CTarget.value ()Ljava/lang/String; 1
      // 46c: lload 22
      // 46e: dup2_x1
      // 46f: pop2
      // 470: bipush 3
      // 471: anewarray 121
      // 474: dup
      // 475: bipush 0
      // 476: sipush 2814
      // 479: ldc2_w 2101077051766904544
      // 47c: lload 2
      // 47d: lxor
      // 47e: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 483: aastore
      // 484: dup
      // 485: bipush 1
      // 486: sipush 29190
      // 489: ldc2_w 7760994859912621599
      // 48c: lload 2
      // 48d: lxor
      // 48e: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 493: aastore
      // 494: dup
      // 495: bipush 2
      // 496: sipush 3670
      // 499: ldc2_w 1999570566175330883
      // 49c: lload 2
      // 49d: lxor
      // 49e: invokedynamic v (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util139.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a3: aastore
      // 4a4: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 4a7: invokespecial rip/breeze/classtransform/ե.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;Ljava/util/Collection;)V
      // 4aa: athrow
      // 4ab: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 4ae: athrow
      // 4af: iload 27
      // 4b1: ifne 2c1
      // 4b4: invokestatic rip/breeze/inject/ջ.method_012 ()Z
      // 4b7: lload 2
      // 4b8: lconst_0
      // 4b9: lcmp
      // 4ba: iflt 4c5
      // 4bd: ifeq 4cf
      // 4c0: iinc 27 1
      // 4c3: iload 27
      // 4c5: invokestatic rip/breeze/classtransform/BreezeClass5.initialize (I)V
      // 4c8: goto 4cf
      // 4cb: invokestatic rip/breeze/classtransform/Util139.getԵ (Lrip/breeze/classtransform/ե;)Lrip/breeze/classtransform/ե;
      // 4ce: athrow
      // 4cf: return
      // try (92 -> 108): 108 rip/breeze/classtransform/ե
      // try (110 -> 119): 120 rip/breeze/classtransform/ե
      // try (113 -> 123): 124 rip/breeze/classtransform/ե
      // try (192 -> 200): 201 rip/breeze/classtransform/ե
      // try (199 -> 241): 241 rip/breeze/classtransform/ե
      // try (244 -> 252): 253 rip/breeze/classtransform/ե
      // try (251 -> 258): 259 rip/breeze/classtransform/ե
      // try (261 -> 304): 304 rip/breeze/classtransform/ե
      // try (367 -> 376): 377 rip/breeze/classtransform/ե
      // try (375 -> 389): 390 rip/breeze/classtransform/ե
      // try (379 -> 398): 399 rip/breeze/classtransform/ե
      // try (392 -> 410): 411 rip/breeze/classtransform/ե
      // try (413 -> 473): 474 rip/breeze/classtransform/ե
      // try (418 -> 531): 532 rip/breeze/classtransform/ե
      // try (476 -> 536): 537 rip/breeze/classtransform/ե
      // try (539 -> 599): 600 rip/breeze/classtransform/ե
      // try (544 -> 641): 641 rip/breeze/classtransform/ե
      // try (645 -> 654): 655 rip/breeze/classtransform/ե
   }

   private static ռ lambda$new_Inner0(CRedirect var0) {
      return new ռ(var0.method(), var0.mapping());
   }

   static {
      long var0 = 60517973819947L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[10];
      int var5 = 0;
      String var6 = "@±û #jT£_á\u0096\u0000ïX9\u009b»bRÇ\u0015\n¸:HÖ\u0099\u009dû¯ø[ó\u0087ORøq¹ø=¸}Æ<uw\u0017\u0018-7\u0004\u0088wq\u0083O\u000eÆýõ¯6É\u0002,Òx\u0083Z\u0010\u0080\u008a\u0018\u008c\u008b¯ZÙØ\u0014U\"ç\u000eâ\u007fQë \u0083\u001e¥\u0015´lIx\u0002&äÑ+Û\u008d\u0094Õ;A¯ÅõOmà\u0099Zc\u008fã6}§\u000e=#ü\u0019ÓØðV\u009d¬NmZ\u008ef\u0088W.úÊ\u009aS\u0093\u0088ÿ \u0093\u0091ßH`¨\u008c|\u0017°õK\u0005Ôÿoú\u0003Ë\u008bI\t\u0004d>Y\u0002\u0012=áù¥\u008e\u0086r%|\u00813¸\u0016læ%1É\u0091\bþVy+E_\u0013¾Pv¹\u008fÉä\u001d*³RÉ\u0085\u0010\u0012CÃ®\u0097°¬_÷nÿ¶\u009d3Æ2\u0010;Ô\u000b\u008f£Mü§ùW\u009brn\u0091_óp\u0085\u0097Ú\u0016\u001a\u000f¡\u0083\u007f±·\u0092v\u0012Ö¼øQDb\u000f\u0090B\n¢i¬ùv3Qº2D@L\u0017ÇÁÂy\u001f\u0013L¿ÏèÄ\u0096\u0016T ±¢\u00adKû\u0080\u001f¼à4\u008fvªýúk5²\u0098Ö§¯\u0015=®~\u0086[Ç\u0015[aèCÛ\u009e]Ø\u0002ul7,¡Ì \u0083ëÙGgv«4*ptË=h \u00175\u008fb\u0086»\u0089\u0000§\u0018\"\u0002°8\u001a¬#\u001aàµ\u000f:\u0094}/SvÊ=ÄòH(`\u0002\u000f|O¬\tI|X\u0018ö\u009a\b\t|¾2Ìp\u0097¹ù\u008a4Ý:\u000bGYs\u0087«\u0094,è\u0097û&Â";
      int var7 = "@±û #jT£_á\u0096\u0000ïX9\u009b»bRÇ\u0015\n¸:HÖ\u0099\u009dû¯ø[ó\u0087ORøq¹ø=¸}Æ<uw\u0017\u0018-7\u0004\u0088wq\u0083O\u000eÆýõ¯6É\u0002,Òx\u0083Z\u0010\u0080\u008a\u0018\u008c\u008b¯ZÙØ\u0014U\"ç\u000eâ\u007fQë \u0083\u001e¥\u0015´lIx\u0002&äÑ+Û\u008d\u0094Õ;A¯ÅõOmà\u0099Zc\u008fã6}§\u000e=#ü\u0019ÓØðV\u009d¬NmZ\u008ef\u0088W.úÊ\u009aS\u0093\u0088ÿ \u0093\u0091ßH`¨\u008c|\u0017°õK\u0005Ôÿoú\u0003Ë\u008bI\t\u0004d>Y\u0002\u0012=áù¥\u008e\u0086r%|\u00813¸\u0016læ%1É\u0091\bþVy+E_\u0013¾Pv¹\u008fÉä\u001d*³RÉ\u0085\u0010\u0012CÃ®\u0097°¬_÷nÿ¶\u009d3Æ2\u0010;Ô\u000b\u008f£Mü§ùW\u009brn\u0091_óp\u0085\u0097Ú\u0016\u001a\u000f¡\u0083\u007f±·\u0092v\u0012Ö¼øQDb\u000f\u0090B\n¢i¬ùv3Qº2D@L\u0017ÇÁÂy\u001f\u0013L¿ÏèÄ\u0096\u0016T ±¢\u00adKû\u0080\u001f¼à4\u008fvªýúk5²\u0098Ö§¯\u0015=®~\u0086[Ç\u0015[aèCÛ\u009e]Ø\u0002ul7,¡Ì \u0083ëÙGgv«4*ptË=h \u00175\u008fb\u0086»\u0089\u0000§\u0018\"\u0002°8\u001a¬#\u001aàµ\u000f:\u0094}/SvÊ=ÄòH(`\u0002\u000f|O¬\tI|X\u0018ö\u009a\b\t|¾2Ìp\u0097¹ù\u008a4Ý:\u000bGYs\u0087«\u0094,è\u0097û&Â"
         .length();
      char var8 = 24;
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
                     CONST_J = new String[10];
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

                  var6 = "\u0005Û2Îªc}Á\u009a!\\\u0096¾oö\u009d\u0010\u0001²¾T>® \u0084É\u001dí¬ðU$O";
                  var7 = "\u0005Û2Îªc}Á\u009a!\\\u0096¾oö\u009d\u0010\u0001²¾T>® \u0084É\u001dí¬ðU$O".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static ե getԵ(ե var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29514;
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
            throw new RuntimeException("rip/breeze/classtransform/m", var10);
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
         throw new RuntimeException("rip/breeze/classtransform/m" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
