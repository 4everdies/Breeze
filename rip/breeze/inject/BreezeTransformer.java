package rip.breeze.inject;

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
import rip.breeze.classtransform.ó;
import ru.paul.breeze.BreezeNatives;

@rip.breeze.ý
public class BreezeTransformer implements rip.breeze.classtransform.է {
   private final ó ó_ÿ;
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   @rip.breeze.ü
   public BreezeTransformer(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/inject/BreezeTransformer.139742442145171L J
      // 03: ldc2_w 40610986211626
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 51923557120700
      // 0d: lxor
      // 0e: dup2
      // 0f: bipush 48
      // 11: lushr
      // 12: l2i
      // 13: istore 4
      // 15: dup2
      // 16: bipush 16
      // 18: lshl
      // 19: bipush 32
      // 1b: lushr
      // 1c: l2i
      // 1d: istore 5
      // 1f: dup2
      // 20: bipush 48
      // 22: lshl
      // 23: bipush 48
      // 25: lushr
      // 26: l2i
      // 27: istore 6
      // 29: pop2
      // 2a: dup2
      // 2b: ldc2_w 86010881915783
      // 2e: lxor
      // 2f: dup2
      // 30: bipush 48
      // 32: lushr
      // 33: l2i
      // 34: istore 7
      // 36: dup2
      // 37: bipush 16
      // 39: lshl
      // 3a: bipush 32
      // 3c: lushr
      // 3d: l2i
      // 3e: istore 8
      // 40: dup2
      // 41: bipush 48
      // 43: lshl
      // 44: bipush 48
      // 46: lushr
      // 47: l2i
      // 48: istore 9
      // 4a: pop2
      // 4b: dup2
      // 4c: ldc2_w 7621710824610
      // 4f: lxor
      // 50: lstore 10
      // 52: dup2
      // 53: ldc2_w 78885974328292
      // 56: lxor
      // 57: lstore 12
      // 59: pop2
      // 5a: invokestatic rip/breeze/inject/BreezeLogger.checkCondition ()Z
      // 5d: aload 0
      // 5e: invokespecial java/lang/Object.<init> ()V
      // 61: aload 0
      // 62: new rip/breeze/classtransform/ó
      // 65: dup
      // 66: aload 0
      // 67: new rip/breeze/classtransform/í
      // 6a: dup
      // 6b: iload 7
      // 6d: i2s
      // 6e: iload 8
      // 70: iload 9
      // 72: i2c
      // 73: invokespecial rip/breeze/classtransform/í.<init> (SIC)V
      // 76: lload 10
      // 78: aload 1
      // 79: invokestatic rip/breeze/classtransform/annotations/Mapping.fromString (JLjava/lang/String;)Lrip/breeze/classtransform/annotations/Mapping;
      // 7c: lload 12
      // 7e: dup2_x1
      // 7f: pop2
      // 80: invokespecial rip/breeze/classtransform/ó.<init> (Lrip/breeze/classtransform/է;Lrip/breeze/classtransform/ò;JLrip/breeze/classtransform/annotations/Mapping;)V
      // 83: putfield rip/breeze/inject/BreezeTransformer.ó_ÿ Lrip/breeze/classtransform/ó;
      // 86: istore 14
      // 88: new rip/breeze/inject/BreezeLogger
      // 8b: dup
      // 8c: iload 4
      // 8e: i2s
      // 8f: iload 5
      // 91: iload 6
      // 93: i2c
      // 94: invokespecial rip/breeze/inject/BreezeLogger.<init> (SIC)V
      // 97: putstatic rip/breeze/classtransform/հ.ձ_ÿ_2 Lrip/breeze/classtransform/ձ;
      // 9a: iload 14
      // 9c: ifne b8
      // 9f: invokestatic rip/breeze/inject/ջ.method_012 ()Z
      // a2: ifeq b4
      // a5: goto ac
      // a8: invokestatic rip/breeze/inject/BreezeTransformer.getUnsupportedOperationException (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // ab: athrow
      // ac: bipush 0
      // ad: goto b5
      // b0: invokestatic rip/breeze/inject/BreezeTransformer.getUnsupportedOperationException (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // b3: athrow
      // b4: bipush 1
      // b5: invokestatic rip/breeze/inject/ջ.method_011 (Z)V
      // b8: return
      // try (84 -> 97): 98 java/lang/UnsupportedOperationException
      // try (95 -> 102): 102 java/lang/UnsupportedOperationException
   }

   @rip.breeze.ý
   @rip.breeze.ü
   private byte[] transform(byte[] param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/inject/BreezeTransformer.139742442145171L J
      // 003: ldc2_w 63234488777757
      // 006: lxor
      // 007: lstore 3
      // 008: lload 3
      // 009: dup2
      // 00a: ldc2_w 44289073783289
      // 00d: lxor
      // 00e: lstore 5
      // 010: dup2
      // 011: ldc2_w 138527131422702
      // 014: lxor
      // 015: lstore 7
      // 017: dup2
      // 018: ldc2_w 68096610400544
      // 01b: lxor
      // 01c: lstore 9
      // 01e: pop2
      // 01f: new java/lang/StringBuilder
      // 022: dup
      // 023: invokespecial java/lang/StringBuilder.<init> ()V
      // 026: sipush 7970
      // 029: ldc2_w 1880587677422545003
      // 02c: lload 3
      // 02d: lxor
      // 02e: invokedynamic z (IJ)Ljava/lang/String; bsm=rip/breeze/inject/BreezeTransformer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 036: aload 2
      // 037: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 03d: bipush 0
      // 03e: anewarray 4
      // 041: lload 5
      // 043: dup2_x1
      // 044: pop2
      // 045: bipush 3
      // 046: anewarray 4
      // 049: dup_x1
      // 04a: swap
      // 04b: bipush 2
      // 04c: swap
      // 04d: aastore
      // 04e: dup_x2
      // 04f: dup_x2
      // 050: pop
      // 051: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 054: bipush 1
      // 055: swap
      // 056: aastore
      // 057: dup_x1
      // 058: swap
      // 059: bipush 0
      // 05a: swap
      // 05b: aastore
      // 05c: invokestatic rip/breeze/classtransform/հ.method_001 ([Ljava/lang/Object;)V
      // 05f: invokestatic rip/breeze/inject/BreezeLogger.isValid ()Z
      // 062: aload 0
      // 063: getfield rip/breeze/inject/BreezeTransformer.ó_ÿ Lrip/breeze/classtransform/ó;
      // 066: aload 2
      // 067: aload 1
      // 068: lload 7
      // 06a: bipush 3
      // 06b: anewarray 4
      // 06e: dup_x2
      // 06f: dup_x2
      // 070: pop
      // 071: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 074: bipush 2
      // 075: swap
      // 076: aastore
      // 077: dup_x1
      // 078: swap
      // 079: bipush 1
      // 07a: swap
      // 07b: aastore
      // 07c: dup_x1
      // 07d: swap
      // 07e: bipush 0
      // 07f: swap
      // 080: aastore
      // 081: invokevirtual rip/breeze/classtransform/ó.method_012 ([Ljava/lang/Object;)[B
      // 084: astore 11
      // 086: istore 12
      // 088: aload 11
      // 08a: iload 12
      // 08c: ifne 121
      // 08f: ifnull 0e0
      // 092: goto 099
      // 095: invokestatic rip/breeze/inject/BreezeTransformer.getUnsupportedOperationException (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 098: athrow
      // 099: new java/lang/StringBuilder
      // 09c: dup
      // 09d: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a0: sipush 18455
      // 0a3: ldc2_w 4323516845179551581
      // 0a6: lload 3
      // 0a7: lxor
      // 0a8: invokedynamic z (IJ)Ljava/lang/String; bsm=rip/breeze/inject/BreezeTransformer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b0: aload 2
      // 0b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b7: bipush 0
      // 0b8: anewarray 4
      // 0bb: lload 5
      // 0bd: dup2_x1
      // 0be: pop2
      // 0bf: bipush 3
      // 0c0: anewarray 4
      // 0c3: dup_x1
      // 0c4: swap
      // 0c5: bipush 2
      // 0c6: swap
      // 0c7: aastore
      // 0c8: dup_x2
      // 0c9: dup_x2
      // 0ca: pop
      // 0cb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ce: bipush 1
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x1
      // 0d2: swap
      // 0d3: bipush 0
      // 0d4: swap
      // 0d5: aastore
      // 0d6: invokestatic rip/breeze/classtransform/հ.method_001 ([Ljava/lang/Object;)V
      // 0d9: aload 11
      // 0db: areturn
      // 0dc: invokestatic rip/breeze/inject/BreezeTransformer.getUnsupportedOperationException (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0df: athrow
      // 0e0: new java/lang/StringBuilder
      // 0e3: dup
      // 0e4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e7: sipush 12148
      // 0ea: ldc2_w 1702205547511699513
      // 0ed: lload 3
      // 0ee: lxor
      // 0ef: invokedynamic z (IJ)Ljava/lang/String; bsm=rip/breeze/inject/BreezeTransformer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f7: aload 2
      // 0f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fe: bipush 0
      // 0ff: anewarray 4
      // 102: lload 9
      // 104: dup2_x1
      // 105: pop2
      // 106: bipush 3
      // 107: anewarray 4
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
      // 11d: invokestatic rip/breeze/classtransform/հ.method_002 ([Ljava/lang/Object;)V
      // 120: aload 1
      // 121: areturn
      // try (83 -> 87): 88 java/lang/UnsupportedOperationException
      // try (86 -> 129): 129 java/lang/UnsupportedOperationException
   }

   @rip.breeze.ý
   @rip.breeze.ü
   private byte[] createHijack(byte[] param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/inject/BreezeTransformer.139742442145171L J
      // 003: ldc2_w 46226754812457
      // 006: lxor
      // 007: lstore 3
      // 008: lload 3
      // 009: dup2
      // 00a: ldc2_w 90241992418678
      // 00d: lxor
      // 00e: lstore 5
      // 010: dup2
      // 011: ldc2_w 15940624726638
      // 014: lxor
      // 015: lstore 7
      // 017: dup2
      // 018: ldc2_w 27814455679541
      // 01b: lxor
      // 01c: lstore 9
      // 01e: dup2
      // 01f: ldc2_w 23394588862790
      // 022: lxor
      // 023: lstore 11
      // 025: dup2
      // 026: ldc2_w 42163453268786
      // 029: lxor
      // 02a: lstore 13
      // 02c: dup2
      // 02d: ldc2_w 110068279524843
      // 030: lxor
      // 031: lstore 15
      // 033: pop2
      // 034: invokestatic rip/breeze/inject/BreezeLogger.isValid ()Z
      // 037: aload 1
      // 038: lload 5
      // 03a: bipush 2
      // 03b: anewarray 4
      // 03e: dup_x2
      // 03f: dup_x2
      // 040: pop
      // 041: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 044: bipush 1
      // 045: swap
      // 046: aastore
      // 047: dup_x1
      // 048: swap
      // 049: bipush 0
      // 04a: swap
      // 04b: aastore
      // 04c: invokestatic rip/breeze/classtransform/MathUtil3.getÉ ([Ljava/lang/Object;)Lrip/breeze/inject/é;
      // 04f: astore 17
      // 051: bipush 0
      // 052: istore 18
      // 054: istore 19
      // 056: aload 17
      // 058: getfield rip/breeze/inject/é.list_ä_2 Ljava/util/List;
      // 05b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 060: astore 20
      // 062: aload 20
      // 064: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 069: ifeq 16c
      // 06c: aload 20
      // 06e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 073: checkcast rip/breeze/inject/BreezeClass12
      // 076: astore 21
      // 078: aload 21
      // 07a: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 07d: aload 2
      // 07e: invokestatic java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 081: iload 19
      // 083: ifne 16e
      // 086: iload 19
      // 088: ifne 0c9
      // 08b: goto 092
      // 08e: invokestatic rip/breeze/inject/BreezeTransformer.getUnsupportedOperationException (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 091: athrow
      // 092: ifne 0a8
      // 095: goto 09c
      // 098: invokestatic rip/breeze/inject/BreezeTransformer.getUnsupportedOperationException (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 09b: athrow
      // 09c: iload 19
      // 09e: ifeq 062
      // 0a1: goto 0a8
      // 0a4: invokestatic rip/breeze/inject/BreezeTransformer.getUnsupportedOperationException (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0a7: athrow
      // 0a8: aload 21
      // 0aa: iload 19
      // 0ac: ifne 105
      // 0af: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0b2: sipush 23331
      // 0b5: ldc2_w 7074741524193454684
      // 0b8: lload 3
      // 0b9: lxor
      // 0ba: invokedynamic z (IJ)Ljava/lang/String; bsm=rip/breeze/inject/BreezeTransformer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: invokestatic java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0c2: goto 0c9
      // 0c5: invokestatic rip/breeze/inject/BreezeTransformer.getUnsupportedOperationException (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0c8: athrow
      // 0c9: ifne 103
      // 0cc: aload 21
      // 0ce: iload 19
      // 0d0: ifne 105
      // 0d3: goto 0da
      // 0d6: invokestatic rip/breeze/inject/BreezeTransformer.getUnsupportedOperationException (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0d9: athrow
      // 0da: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0dd: sipush 12895
      // 0e0: ldc2_w 4265883801820381993
      // 0e3: lload 3
      // 0e4: lxor
      // 0e5: invokedynamic z (IJ)Ljava/lang/String; bsm=rip/breeze/inject/BreezeTransformer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: invokestatic java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0ed: ifne 103
      // 0f0: goto 0f7
      // 0f3: invokestatic rip/breeze/inject/BreezeTransformer.getUnsupportedOperationException (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0f6: athrow
      // 0f7: iload 19
      // 0f9: ifeq 062
      // 0fc: goto 103
      // 0ff: invokestatic rip/breeze/inject/BreezeTransformer.getUnsupportedOperationException (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 102: athrow
      // 103: aload 21
      // 105: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 108: bipush 0
      // 109: anewarray 4
      // 10c: invokevirtual rip/breeze/inject/թ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 10f: astore 22
      // 111: aload 21
      // 113: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 116: lload 7
      // 118: aload 22
      // 11a: new rip/breeze/inject/կ
      // 11d: dup
      // 11e: sipush 184
      // 121: sipush 20859
      // 124: ldc2_w 3333838376645697539
      // 127: lload 3
      // 128: lxor
      // 129: invokedynamic z (IJ)Ljava/lang/String; bsm=rip/breeze/inject/BreezeTransformer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: sipush 493
      // 131: ldc2_w 3849034581221568657
      // 134: lload 3
      // 135: lxor
      // 136: invokedynamic z (IJ)Ljava/lang/String; bsm=rip/breeze/inject/BreezeTransformer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: sipush 1229
      // 13e: ldc2_w 6674555413434987962
      // 141: lload 3
      // 142: lxor
      // 143: invokedynamic z (IJ)Ljava/lang/String; bsm=rip/breeze/inject/BreezeTransformer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: bipush 0
      // 149: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 14c: bipush 3
      // 14d: anewarray 4
      // 150: dup_x1
      // 151: swap
      // 152: bipush 2
      // 153: swap
      // 154: aastore
      // 155: dup_x1
      // 156: swap
      // 157: bipush 1
      // 158: swap
      // 159: aastore
      // 15a: dup_x2
      // 15b: dup_x2
      // 15c: pop
      // 15d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 160: bipush 0
      // 161: swap
      // 162: aastore
      // 163: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 166: bipush 1
      // 167: istore 18
      // 169: goto 16c
      // 16c: iload 18
      // 16e: ifne 1a4
      // 171: lload 13
      // 173: sipush 17778
      // 176: ldc2_w 3582881250487907336
      // 179: lload 3
      // 17a: lxor
      // 17b: invokedynamic z (IJ)Ljava/lang/String; bsm=rip/breeze/inject/BreezeTransformer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: bipush 0
      // 181: anewarray 4
      // 184: bipush 3
      // 185: anewarray 4
      // 188: dup_x1
      // 189: swap
      // 18a: bipush 2
      // 18b: swap
      // 18c: aastore
      // 18d: dup_x1
      // 18e: swap
      // 18f: bipush 1
      // 190: swap
      // 191: aastore
      // 192: dup_x2
      // 193: dup_x2
      // 194: pop
      // 195: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 198: bipush 0
      // 199: swap
      // 19a: aastore
      // 19b: invokestatic rip/breeze/classtransform/հ.method_003 ([Ljava/lang/Object;)V
      // 19e: aconst_null
      // 19f: areturn
      // 1a0: invokestatic rip/breeze/inject/BreezeTransformer.getUnsupportedOperationException (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1a3: athrow
      // 1a4: new rip/breeze/inject/í
      // 1a7: dup
      // 1a8: bipush 0
      // 1a9: lload 9
      // 1ab: invokespecial rip/breeze/inject/í.<init> (IJ)V
      // 1ae: astore 20
      // 1b0: aload 17
      // 1b2: lload 15
      // 1b4: aload 20
      // 1b6: bipush 2
      // 1b7: anewarray 4
      // 1ba: dup_x1
      // 1bb: swap
      // 1bc: bipush 1
      // 1bd: swap
      // 1be: aastore
      // 1bf: dup_x2
      // 1c0: dup_x2
      // 1c1: pop
      // 1c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c5: bipush 0
      // 1c6: swap
      // 1c7: aastore
      // 1c8: invokevirtual rip/breeze/inject/é.method_002 ([Ljava/lang/Object;)V
      // 1cb: aload 20
      // 1cd: lload 11
      // 1cf: bipush 1
      // 1d0: anewarray 4
      // 1d3: dup_x2
      // 1d4: dup_x2
      // 1d5: pop
      // 1d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d9: bipush 0
      // 1da: swap
      // 1db: aastore
      // 1dc: invokevirtual rip/breeze/inject/í.method_003 ([Ljava/lang/Object;)[B
      // 1df: areturn
      // try (63 -> 71): 72 java/lang/UnsupportedOperationException
      // try (69 -> 75): 76 java/lang/UnsupportedOperationException
      // try (74 -> 80): 81 java/lang/UnsupportedOperationException
      // try (83 -> 93): 94 java/lang/UnsupportedOperationException
      // try (96 -> 100): 101 java/lang/UnsupportedOperationException
      // try (97 -> 111): 112 java/lang/UnsupportedOperationException
      // try (103 -> 116): 117 java/lang/UnsupportedOperationException
      // try (173 -> 204): 204 java/lang/UnsupportedOperationException
   }

   @rip.breeze.ý
   @rip.breeze.ü
   private void addTransformer(byte[] var1) {
      long var2 = 137469810205560L;
      long var4 = var2 ^ 21755516854013L;
      long var6 = var2 ^ 134172177988020L;
      long var8 = var2 ^ 15721950121968L;

      try {
         é var10 = rip.breeze.classtransform.MathUtil3.getÉ(new Object[]{var1, var6});
         this.ó_ÿ.method_009(new Object[]{var10, var4});
      } catch (Exception var11) {
         rip.breeze.classtransform.հ.method_003(new Object[]{var8, "Failed to parse transformer:" + var11.getMessage(), new Object[0]});
      }
   }

   @Override
   public byte[] invoke_1(Object[] var1) throws ClassNotFoundException {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      throw new UnsupportedOperationException();
   }

   @Override
   public Map invoke_2(Object[] var1) {
      long var2 = (Long)var1[0];
      throw new UnsupportedOperationException();
   }

   public boolean isValid(Object[] var1) {
      return true;
   }

   @Override
   public String getSuperClass(String var1) {
      return BreezeNatives.getSuperClass(var1);
   }

   @Override
   public String[] getSuperClasses(String var1) {
      return BreezeNatives.getSuperClasses(var1);
   }

   @Override
   public boolean isInterface(String var1) {
      return BreezeNatives.isInterface(var1);
   }

   static {
      long var0 = 68746542436996L;
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
      String var6 = "ZÍt-\u008a¯û1\u001d\nÕÏ$\u0001ù¸(®ü¼\bcH\u001a¾\u0090\u0095)\u0012ZmTÆG*Yç\u007fÌ×\u0098\u00ad\u0014¨µ\u009d´2ø½¯ÒH@Pªé(`\u0017äÀÃßMZ\u0091{Å0âu\u0096gz¬FÕ\u0097V\u0018¾L\u001eÃµº\u009dª\t\u0085\u009bv£z\u0098\u0087· ~Aù·\u0003\u0090øº¬Ü>{§\u0084è\u009dÌ+¸ÆrO`òáwE\u008d\u007f©p\\0\t4º\b2og\u0090%àÂ¿9\u009eây¦\u0088àò\t\u009f\u0010ªa\u009cEIò\r3,Õ8©¦WM½Kvg\u0083ªp\u0000\u0098o@\u0087(\u0007Ö¹\u008e\u0003¦ÖÕ\u0093\u008f·}Â°æ÷\u00873¢\\*\u008f.Ø(Sc>¦$\u008c*«ü?oó}~\u0005üLï\u0086 \u0082K*°ëR\u0000\"ï\u0001S³ë\u0099¾e%(Fª\u0083úÛjä°uY\u0014\u0086[§\u000e\u0011\u0087¨cæR\u0086¨ç\u0089«\u0090\u0087F¡\u009d\u001eÜ.\u0091\u0098R\u0092¿\u0016(/åN\u0094\u0089³ªfW¿Öô6Ûü\u00ad\t®º×\u009a¯/\u001f\u0086\u008cæ\u0099¼«\u000b;«°O\u001e\u0003õ\u009f\u0081";
      int var7 = "ZÍt-\u008a¯û1\u001d\nÕÏ$\u0001ù¸(®ü¼\bcH\u001a¾\u0090\u0095)\u0012ZmTÆG*Yç\u007fÌ×\u0098\u00ad\u0014¨µ\u009d´2ø½¯ÒH@Pªé(`\u0017äÀÃßMZ\u0091{Å0âu\u0096gz¬FÕ\u0097V\u0018¾L\u001eÃµº\u009dª\t\u0085\u009bv£z\u0098\u0087· ~Aù·\u0003\u0090øº¬Ü>{§\u0084è\u009dÌ+¸ÆrO`òáwE\u008d\u007f©p\\0\t4º\b2og\u0090%àÂ¿9\u009eây¦\u0088àò\t\u009f\u0010ªa\u009cEIò\r3,Õ8©¦WM½Kvg\u0083ªp\u0000\u0098o@\u0087(\u0007Ö¹\u008e\u0003¦ÖÕ\u0093\u008f·}Â°æ÷\u00873¢\\*\u008f.Ø(Sc>¦$\u008c*«ü?oó}~\u0005üLï\u0086 \u0082K*°ëR\u0000\"ï\u0001S³ë\u0099¾e%(Fª\u0083úÛjä°uY\u0014\u0086[§\u000e\u0011\u0087¨cæR\u0086¨ç\u0089«\u0090\u0087F¡\u009d\u001eÜ.\u0091\u0098R\u0092¿\u0016(/åN\u0094\u0089³ªfW¿Öô6Ûü\u00ad\t®º×\u009a¯/\u001f\u0086\u008cæ\u0099¼«\u000b;«°O\u001e\u0003õ\u009f\u0081"
         .length();
      char var8 = 16;
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
                     CONST_B = var4;
                     CONST_C = new String[10];
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

                  var6 = "57ïÏ\u008bÞ\u001d\\7\u001fdF\u009c°¯å\u0010\u0003\u0089Â$È¥¥Õ:ªÌMI*Zy";
                  var7 = "57ïÏ\u008bÞ\u001d\\7\u001fdF\u009c°¯å\u0010\u0003\u0089Â$È¥¥Õ:ªÌMI*Zy".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static UnsupportedOperationException getUnsupportedOperationException(UnsupportedOperationException var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3781;
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
            throw new RuntimeException("rip/breeze/inject/BreezeTransformer", var10);
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
         throw new RuntimeException("rip/breeze/inject/BreezeTransformer" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
