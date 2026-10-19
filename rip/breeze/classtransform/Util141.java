package rip.breeze.classtransform;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.inject.BreezeClass12;
import rip.breeze.inject.թ;

public class Util141 extends BreezeColor {
   private final boolean bool_þ;
   private static final String[] CONST_F;
   private static final String[] CONST_G;
   private static final Map CONST_H = new HashMap(13);

   public Util141(boolean var1) {
      this.bool_þ = var1;
   }

   public void processAll_2(Object[] param1) {
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
      // 04: checkcast rip/breeze/classtransform/ó
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast rip/breeze/inject/é
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast rip/breeze/inject/é
      // 15: astore 4
      // 17: dup
      // 18: bipush 3
      // 19: aaload
      // 1a: checkcast java/lang/Long
      // 1d: invokevirtual java/lang/Long.longValue ()J
      // 20: lstore 5
      // 22: pop
      // 23: lload 5
      // 25: dup2
      // 26: ldc2_w 106648444537878
      // 29: lxor
      // 2a: lstore 7
      // 2c: dup2
      // 2d: ldc2_w 47040807253316
      // 30: lxor
      // 31: lstore 9
      // 33: dup2
      // 34: ldc2_w 24673223707351
      // 37: lxor
      // 38: lstore 11
      // 3a: dup2
      // 3b: ldc2_w 80146013642590
      // 3e: lxor
      // 3f: lstore 13
      // 41: pop2
      // 42: invokestatic rip/breeze/classtransform/BreezeClass4.isValid ()Z
      // 45: istore 15
      // 47: aload 0
      // 48: iload 15
      // 4a: ifne ce
      // 4d: getfield rip/breeze/classtransform/Util141.bool_þ Z
      // 50: ifeq c6
      // 53: goto 5a
      // 56: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 59: athrow
      // 5a: aload 0
      // 5b: aload 3
      // 5c: aload 4
      // 5e: lload 13
      // 60: bipush 3
      // 61: anewarray 57
      // 64: dup_x2
      // 65: dup_x2
      // 66: pop
      // 67: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a: bipush 2
      // 6b: swap
      // 6c: aastore
      // 6d: dup_x1
      // 6e: swap
      // 6f: bipush 1
      // 70: swap
      // 71: aastore
      // 72: dup_x1
      // 73: swap
      // 74: bipush 0
      // 75: swap
      // 76: aastore
      // 77: invokespecial rip/breeze/classtransform/Util141.processAll_5 ([Ljava/lang/Object;)V
      // 7a: aload 0
      // 7b: lload 7
      // 7d: aload 3
      // 7e: aload 4
      // 80: bipush 3
      // 81: anewarray 57
      // 84: dup_x1
      // 85: swap
      // 86: bipush 2
      // 87: swap
      // 88: aastore
      // 89: dup_x1
      // 8a: swap
      // 8b: bipush 1
      // 8c: swap
      // 8d: aastore
      // 8e: dup_x2
      // 8f: dup_x2
      // 90: pop
      // 91: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 94: bipush 0
      // 95: swap
      // 96: aastore
      // 97: invokespecial rip/breeze/classtransform/Util141.processAll_4 ([Ljava/lang/Object;)V
      // 9a: aload 0
      // 9b: lload 9
      // 9d: aload 3
      // 9e: aload 4
      // a0: bipush 3
      // a1: anewarray 57
      // a4: dup_x1
      // a5: swap
      // a6: bipush 2
      // a7: swap
      // a8: aastore
      // a9: dup_x1
      // aa: swap
      // ab: bipush 1
      // ac: swap
      // ad: aastore
      // ae: dup_x2
      // af: dup_x2
      // b0: pop
      // b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b4: bipush 0
      // b5: swap
      // b6: aastore
      // b7: invokespecial rip/breeze/classtransform/Util141.processAll_2 ([Ljava/lang/Object;)V
      // ba: iload 15
      // bc: ifeq ed
      // bf: goto c6
      // c2: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // c5: athrow
      // c6: aload 0
      // c7: goto ce
      // ca: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // cd: athrow
      // ce: aload 3
      // cf: aload 4
      // d1: lload 11
      // d3: bipush 3
      // d4: anewarray 57
      // d7: dup_x2
      // d8: dup_x2
      // d9: pop
      // da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // dd: bipush 2
      // de: swap
      // df: aastore
      // e0: dup_x1
      // e1: swap
      // e2: bipush 1
      // e3: swap
      // e4: aastore
      // e5: dup_x1
      // e6: swap
      // e7: bipush 0
      // e8: swap
      // e9: aastore
      // ea: invokespecial rip/breeze/classtransform/Util141.processAll_3 ([Ljava/lang/Object;)V
      // ed: return
      // try (43 -> 48): 49 java/lang/IllegalStateException
      // try (46 -> 125): 126 java/lang/IllegalStateException
      // try (51 -> 129): 130 java/lang/IllegalStateException
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/é
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast rip/breeze/inject/é
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic rip/breeze/classtransform/Util141.encKey_b J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 97697549635194
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 3459623110322
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 27827250813313
      // 035: lxor
      // 036: lstore 10
      // 038: pop2
      // 039: new java/util/HashMap
      // 03c: dup
      // 03d: invokespecial java/util/HashMap.<init> ()V
      // 040: astore 12
      // 042: new java/util/ArrayList
      // 045: dup
      // 046: invokespecial java/util/ArrayList.<init> ()V
      // 049: astore 13
      // 04b: invokestatic rip/breeze/classtransform/BreezeClass4.checkCondition ()Z
      // 04e: aload 4
      // 050: getfield rip/breeze/inject/é.list_ä_2 Ljava/util/List;
      // 053: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 058: astore 14
      // 05a: istore 15
      // 05c: aload 14
      // 05e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 063: ifeq 130
      // 066: aload 14
      // 068: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06d: checkcast rip/breeze/inject/BreezeClass12
      // 070: astore 16
      // 072: aload 16
      // 074: lload 2
      // 075: lconst_0
      // 076: lcmp
      // 077: ifle 222
      // 07a: iload 15
      // 07c: ifeq 0dd
      // 07f: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 082: sipush 22037
      // 085: ldc2_w 8821312696145651266
      // 088: lload 2
      // 089: lxor
      // 08a: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util141.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 092: iload 15
      // 094: ifeq 137
      // 097: goto 09e
      // 09a: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09d: athrow
      // 09e: ifne 0ae
      // 0a1: goto 0a8
      // 0a4: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0a7: athrow
      // 0a8: lload 2
      // 0a9: lconst_0
      // 0aa: lcmp
      // 0ab: ifgt 05c
      // 0ae: aload 5
      // 0b0: aload 16
      // 0b2: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 0b5: aload 16
      // 0b7: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0ba: lload 6
      // 0bc: dup2_x1
      // 0bd: pop2
      // 0be: bipush 4
      // 0bf: anewarray 57
      // 0c2: dup_x1
      // 0c3: swap
      // 0c4: bipush 3
      // 0c5: swap
      // 0c6: aastore
      // 0c7: dup_x2
      // 0c8: dup_x2
      // 0c9: pop
      // 0ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cd: bipush 2
      // 0ce: swap
      // 0cf: aastore
      // 0d0: dup_x1
      // 0d1: swap
      // 0d2: bipush 1
      // 0d3: swap
      // 0d4: aastore
      // 0d5: dup_x1
      // 0d6: swap
      // 0d7: bipush 0
      // 0d8: swap
      // 0d9: aastore
      // 0da: invokestatic rip/breeze/classtransform/MathUtil3.getBreezeClass12 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass12;
      // 0dd: astore 17
      // 0df: aload 17
      // 0e1: lload 2
      // 0e2: lconst_0
      // 0e3: lcmp
      // 0e4: iflt 108
      // 0e7: iload 15
      // 0e9: ifeq 108
      // 0ec: ifnull 114
      // 0ef: goto 0f6
      // 0f2: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0f5: athrow
      // 0f6: aload 12
      // 0f8: aload 17
      // 0fa: aload 16
      // 0fc: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 101: goto 108
      // 104: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 107: athrow
      // 108: pop
      // 109: iload 15
      // 10b: lload 2
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: ifle 127
      // 111: ifne 125
      // 114: aload 13
      // 116: aload 16
      // 118: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 11d: pop
      // 11e: goto 125
      // 121: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 124: athrow
      // 125: iload 15
      // 127: lload 2
      // 128: lconst_0
      // 129: lcmp
      // 12a: ifle 063
      // 12d: ifne 05c
      // 130: aload 13
      // 132: invokeinterface java/util/List.isEmpty ()Z 1
      // 137: ifne 1ef
      // 13a: aload 5
      // 13c: sipush 13560
      // 13f: ldc2_w 433604729402868897
      // 142: lload 2
      // 143: lxor
      // 144: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util141.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: lload 6
      // 14b: getstatic rip/breeze/classtransform/ջ.CONST_Ò_2 Ljava/lang/String;
      // 14e: bipush 4
      // 14f: anewarray 57
      // 152: dup_x1
      // 153: swap
      // 154: bipush 3
      // 155: swap
      // 156: aastore
      // 157: dup_x2
      // 158: dup_x2
      // 159: pop
      // 15a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15d: bipush 2
      // 15e: swap
      // 15f: aastore
      // 160: dup_x1
      // 161: swap
      // 162: bipush 1
      // 163: swap
      // 164: aastore
      // 165: dup_x1
      // 166: swap
      // 167: bipush 0
      // 168: swap
      // 169: aastore
      // 16a: invokestatic rip/breeze/classtransform/MathUtil3.getBreezeClass12 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass12;
      // 16d: astore 14
      // 16f: aload 14
      // 171: ifnonnull 1a7
      // 174: new java/lang/IllegalStateException
      // 177: dup
      // 178: new java/lang/StringBuilder
      // 17b: dup
      // 17c: invokespecial java/lang/StringBuilder.<init> ()V
      // 17f: sipush 27171
      // 182: ldc2_w 2949070918038723192
      // 185: lload 2
      // 186: lxor
      // 187: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util141.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18f: aload 4
      // 191: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 194: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 197: ldc "'"
      // 199: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19f: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 1a2: athrow
      // 1a3: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1a6: athrow
      // 1a7: aload 13
      // 1a9: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1ae: astore 16
      // 1b0: aload 16
      // 1b2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b7: ifeq 1ef
      // 1ba: aload 16
      // 1bc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1c1: checkcast rip/breeze/inject/BreezeClass12
      // 1c4: astore 17
      // 1c6: aload 12
      // 1c8: aload 14
      // 1ca: aload 17
      // 1cc: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1d1: pop
      // 1d2: lload 2
      // 1d3: lconst_0
      // 1d4: lcmp
      // 1d5: ifle 224
      // 1d8: iload 15
      // 1da: ifeq 224
      // 1dd: iload 15
      // 1df: ifne 1b0
      // 1e2: lload 2
      // 1e3: lconst_0
      // 1e4: lcmp
      // 1e5: ifle 1d2
      // 1e8: goto 1ef
      // 1eb: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1ee: athrow
      // 1ef: aload 5
      // 1f1: sipush 10844
      // 1f4: ldc2_w 1724373431228783110
      // 1f7: lload 2
      // 1f8: lxor
      // 1f9: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util141.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: lload 6
      // 200: getstatic rip/breeze/classtransform/ջ.CONST_Ò_2 Ljava/lang/String;
      // 203: bipush 4
      // 204: anewarray 57
      // 207: dup_x1
      // 208: swap
      // 209: bipush 3
      // 20a: swap
      // 20b: aastore
      // 20c: dup_x2
      // 20d: dup_x2
      // 20e: pop
      // 20f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 212: bipush 2
      // 213: swap
      // 214: aastore
      // 215: dup_x1
      // 216: swap
      // 217: bipush 1
      // 218: swap
      // 219: aastore
      // 21a: dup_x1
      // 21b: swap
      // 21c: bipush 0
      // 21d: swap
      // 21e: aastore
      // 21f: invokestatic rip/breeze/classtransform/MathUtil3.getBreezeClass12 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass12;
      // 222: astore 14
      // 224: aload 14
      // 226: iload 15
      // 228: ifeq 25f
      // 22b: ifnull 260
      // 22e: goto 235
      // 231: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 234: athrow
      // 235: aload 12
      // 237: aload 14
      // 239: aload 0
      // 23a: aload 4
      // 23c: lload 10
      // 23e: bipush 2
      // 23f: anewarray 57
      // 242: dup_x2
      // 243: dup_x2
      // 244: pop
      // 245: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 248: bipush 1
      // 249: swap
      // 24a: aastore
      // 24b: dup_x1
      // 24c: swap
      // 24d: bipush 0
      // 24e: swap
      // 24f: aastore
      // 250: invokespecial rip/breeze/classtransform/Util141.getBreezeClass12 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass12;
      // 253: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 258: goto 25f
      // 25b: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 25e: athrow
      // 25f: pop
      // 260: aload 12
      // 262: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 267: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 26c: astore 16
      // 26e: aload 16
      // 270: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 275: ifeq 2c8
      // 278: aload 16
      // 27a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27f: checkcast java/util/Map$Entry
      // 282: astore 17
      // 284: aload 0
      // 285: aload 5
      // 287: aload 17
      // 289: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 28e: checkcast rip/breeze/inject/BreezeClass12
      // 291: lload 8
      // 293: aload 4
      // 295: aload 17
      // 297: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 29c: checkcast rip/breeze/inject/BreezeClass12
      // 29f: bipush 5
      // 2a0: anewarray 57
      // 2a3: dup_x1
      // 2a4: swap
      // 2a5: bipush 4
      // 2a6: swap
      // 2a7: aastore
      // 2a8: dup_x1
      // 2a9: swap
      // 2aa: bipush 3
      // 2ab: swap
      // 2ac: aastore
      // 2ad: dup_x2
      // 2ae: dup_x2
      // 2af: pop
      // 2b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b3: bipush 2
      // 2b4: swap
      // 2b5: aastore
      // 2b6: dup_x1
      // 2b7: swap
      // 2b8: bipush 1
      // 2b9: swap
      // 2ba: aastore
      // 2bb: dup_x1
      // 2bc: swap
      // 2bd: bipush 0
      // 2be: swap
      // 2bf: aastore
      // 2c0: invokespecial rip/breeze/classtransform/Util141.processAll_6 ([Ljava/lang/Object;)V
      // 2c3: iload 15
      // 2c5: ifne 26e
      // 2c8: return
      // try (57 -> 73): 74 java/lang/IllegalStateException
      // try (64 -> 77): 78 java/lang/IllegalStateException
      // try (118 -> 126): 127 java/lang/IllegalStateException
      // try (125 -> 133): 134 java/lang/IllegalStateException
      // try (136 -> 147): 148 java/lang/IllegalStateException
      // try (193 -> 214): 214 java/lang/IllegalStateException
      // try (226 -> 239): 244 java/lang/IllegalStateException
      // try (280 -> 284): 285 java/lang/IllegalStateException
      // try (283 -> 308): 309 java/lang/IllegalStateException
   }

   private void processAll_3(Object[] var1) {
      rip.breeze.inject.é var2 = (rip.breeze.inject.é)var1[0];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var1[1];
      long var4 = (Long)var1[2];
      var4 = encKey_b ^ var4;
      long var6 = var4 ^ 64425455009948L;
      long var8 = var4 ^ 83310715271277L;
      boolean var10000 = BreezeClass4.isValid();
      Iterator var10 = var3.list_ä_2.iterator();
      boolean var11 = var10000;

      label61:
      while (true) {
         var10000 = var10.hasNext();

         while (var10000) {
            BreezeClass12 var12 = (BreezeClass12)var10.next();

            label65: {
               label66: {
                  label53: {
                     try {
                        var10000 = var12.string_ú.startsWith("<");
                        if (var4 < 0L || var11) {
                           break label66;
                        }

                        if (!var10000) {
                           break label53;
                        }
                     } catch (IllegalStateException var17) {
                        throw getIllegalStateException(var17);
                     }

                     if (var4 > 0L) {
                        continue label61;
                     }
                  }

                  var21 = var2;
                  if (var11) {
                     break label65;
                  }

                  String var13 = var12.string_ù;
                  String var14 = var12.string_ú;
                  rip.breeze.inject.é var15 = var2;
                  var10000 = MathUtil3.isValid(new Object[]{var8, var15, var14, var13});
               }

               try {
                  if (var10000) {
                     throw new IllegalStateException(
                        null /* removed */
                           + var12.string_ú
                           + var12.string_ù
                           + null /* removed */
                           + var3.string_ú_2
                           + null /* removed */
                           + var2.string_ú_2
                           + null /* removed */
                     );
                  }
               } catch (IllegalStateException var16) {
                  throw getIllegalStateException(var16);
               }

               var21 = var3;
            }

            խ.method_001(new Object[]{var21, var2, var12, var6});
            var10000 = var11;
            if (var4 >= 0L) {
               if (!var11) {
                  continue label61;
               }
               break;
            }
         }

         return;
      }
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/inject/é
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast rip/breeze/inject/é
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic rip/breeze/classtransform/Util141.encKey_b J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 8117671513144
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 114461829553245
      // 02e: lxor
      // 02f: lstore 8
      // 031: pop2
      // 032: invokestatic rip/breeze/classtransform/BreezeClass4.isValid ()Z
      // 035: aload 5
      // 037: getfield rip/breeze/inject/é.list_å_2 Ljava/util/List;
      // 03a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 03f: astore 10
      // 041: istore 11
      // 043: aload 10
      // 045: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 04a: ifeq 135
      // 04d: aload 10
      // 04f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 054: checkcast rip/breeze/inject/á
      // 057: astore 12
      // 059: lload 2
      // 05a: lconst_0
      // 05b: lcmp
      // 05c: iflt 130
      // 05f: aload 4
      // 061: iload 11
      // 063: ifne 10a
      // 066: aload 12
      // 068: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 06b: aload 12
      // 06d: getfield rip/breeze/inject/á.string_û_2 Ljava/lang/String;
      // 070: lload 6
      // 072: dup2_x1
      // 073: pop2
      // 074: bipush 4
      // 075: anewarray 57
      // 078: dup_x1
      // 079: swap
      // 07a: bipush 3
      // 07b: swap
      // 07c: aastore
      // 07d: dup_x2
      // 07e: dup_x2
      // 07f: pop
      // 080: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 083: bipush 2
      // 084: swap
      // 085: aastore
      // 086: dup_x1
      // 087: swap
      // 088: bipush 1
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: bipush 0
      // 08e: swap
      // 08f: aastore
      // 090: invokestatic rip/breeze/classtransform/MathUtil3.isValid_2 ([Ljava/lang/Object;)Z
      // 093: ifeq 108
      // 096: goto 09d
      // 099: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09c: athrow
      // 09d: new java/lang/IllegalStateException
      // 0a0: dup
      // 0a1: new java/lang/StringBuilder
      // 0a4: dup
      // 0a5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a8: sipush 25876
      // 0ab: ldc2_w 6064641434325789722
      // 0ae: lload 2
      // 0af: lxor
      // 0b0: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util141.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b8: aload 12
      // 0ba: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 0bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c0: aload 12
      // 0c2: getfield rip/breeze/inject/á.string_û_2 Ljava/lang/String;
      // 0c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c8: sipush 22843
      // 0cb: ldc2_w 2765969440638406705
      // 0ce: lload 2
      // 0cf: lxor
      // 0d0: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util141.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d8: aload 5
      // 0da: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: sipush 20568
      // 0e3: ldc2_w 1833692141531961691
      // 0e6: lload 2
      // 0e7: lxor
      // 0e8: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util141.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f0: aload 4
      // 0f2: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8: ldc "'"
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 100: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 103: athrow
      // 104: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 107: athrow
      // 108: aload 5
      // 10a: aload 4
      // 10c: lload 8
      // 10e: aload 12
      // 110: bipush 4
      // 111: anewarray 57
      // 114: dup_x1
      // 115: swap
      // 116: bipush 3
      // 117: swap
      // 118: aastore
      // 119: dup_x2
      // 11a: dup_x2
      // 11b: pop
      // 11c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11f: bipush 2
      // 120: swap
      // 121: aastore
      // 122: dup_x1
      // 123: swap
      // 124: bipush 1
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: bipush 0
      // 12a: swap
      // 12b: aastore
      // 12c: invokestatic rip/breeze/classtransform/խ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/á;
      // 12f: pop
      // 130: iload 11
      // 132: ifeq 043
      // 135: return
      // try (45 -> 85): 86 java/lang/IllegalStateException
      // try (52 -> 128): 128 java/lang/IllegalStateException
   }

   private void processAll_5(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/é
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast rip/breeze/inject/é
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: getstatic rip/breeze/classtransform/Util141.encKey_b J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: invokestatic rip/breeze/classtransform/BreezeClass4.isValid ()Z
      // 26: istore 6
      // 28: aload 3
      // 29: getfield rip/breeze/inject/é.list_ö_2 Ljava/util/List;
      // 2c: iload 6
      // 2e: ifne 46
      // 31: ifnull b6
      // 34: goto 3b
      // 37: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3a: athrow
      // 3b: aload 2
      // 3c: getfield rip/breeze/inject/é.list_ö_2 Ljava/util/List;
      // 3f: goto 46
      // 42: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 45: athrow
      // 46: astore 7
      // 48: aload 7
      // 4a: iload 6
      // 4c: ifne 6b
      // 4f: ifnonnull 67
      // 52: goto 59
      // 55: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 58: athrow
      // 59: aload 2
      // 5a: new java/util/ArrayList
      // 5d: dup
      // 5e: invokespecial java/util/ArrayList.<init> ()V
      // 61: dup_x1
      // 62: putfield rip/breeze/inject/é.list_ö_2 Ljava/util/List;
      // 65: astore 7
      // 67: aload 3
      // 68: getfield rip/breeze/inject/é.list_ö_2 Ljava/util/List;
      // 6b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 70: astore 8
      // 72: aload 8
      // 74: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 79: ifeq b6
      // 7c: aload 8
      // 7e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 83: checkcast java/lang/String
      // 86: astore 9
      // 88: aload 7
      // 8a: aload 9
      // 8c: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 91: iload 6
      // 93: ifne b0
      // 96: ifne b1
      // 99: goto a0
      // 9c: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 9f: athrow
      // a0: aload 7
      // a2: aload 9
      // a4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a9: goto b0
      // ac: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // af: athrow
      // b0: pop
      // b1: iload 6
      // b3: ifeq 72
      // b6: return
      // try (24 -> 29): 30 java/lang/IllegalStateException
      // try (28 -> 34): 35 java/lang/IllegalStateException
      // try (38 -> 42): 43 java/lang/IllegalStateException
      // try (63 -> 69): 70 java/lang/IllegalStateException
      // try (68 -> 75): 76 java/lang/IllegalStateException
   }

   private void processAll_6(Object[] param1) {
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
      // 025: checkcast rip/breeze/inject/BreezeClass12
      // 028: astore 7
      // 02a: pop
      // 02b: getstatic rip/breeze/classtransform/Util141.encKey_b J
      // 02e: lload 4
      // 030: lxor
      // 031: lstore 4
      // 033: lload 4
      // 035: dup2
      // 036: ldc2_w 69256730947881
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 81158632304036
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 35575825759629
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 65383097302796
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 24581586330346
      // 055: lxor
      // 056: lstore 16
      // 058: dup2
      // 059: ldc2_w 79806699134079
      // 05c: lxor
      // 05d: lstore 18
      // 05f: dup2
      // 060: ldc2_w 116141468854575
      // 063: lxor
      // 064: lstore 20
      // 066: dup2
      // 067: ldc2_w 140691373397167
      // 06a: lxor
      // 06b: lstore 22
      // 06d: dup2
      // 06e: ldc2_w 8177342695348
      // 071: lxor
      // 072: lstore 24
      // 074: dup2
      // 075: ldc2_w 78651721019163
      // 078: lxor
      // 079: lstore 26
      // 07b: pop2
      // 07c: new java/util/LinkedHashMap
      // 07f: dup
      // 080: invokespecial java/util/LinkedHashMap.<init> ()V
      // 083: astore 28
      // 085: invokestatic rip/breeze/classtransform/BreezeClass4.isValid ()Z
      // 088: new rip/breeze/inject/թ
      // 08b: dup
      // 08c: invokespecial rip/breeze/inject/թ.<init> ()V
      // 08f: astore 29
      // 091: new java/util/HashMap
      // 094: dup
      // 095: invokespecial java/util/HashMap.<init> ()V
      // 098: astore 30
      // 09a: istore 31
      // 09c: aload 3
      // 09d: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 0a0: lload 24
      // 0a2: bipush 1
      // 0a3: anewarray 57
      // 0a6: dup_x2
      // 0a7: dup_x2
      // 0a8: pop
      // 0a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ac: bipush 0
      // 0ad: swap
      // 0ae: aastore
      // 0af: invokevirtual rip/breeze/inject/թ.method_008 ([Ljava/lang/Object;)Ljava/util/ListIterator;
      // 0b2: astore 32
      // 0b4: aload 32
      // 0b6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0bb: ifeq 111
      // 0be: aload 32
      // 0c0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c5: checkcast rip/breeze/inject/ջ
      // 0c8: astore 33
      // 0ca: aload 33
      // 0cc: iload 31
      // 0ce: ifne 10b
      // 0d1: instanceof rip/breeze/inject/ճ
      // 0d4: iload 31
      // 0d6: ifne 139
      // 0d9: goto 0e0
      // 0dc: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0df: athrow
      // 0e0: lload 4
      // 0e2: lconst_0
      // 0e3: lcmp
      // 0e4: ifle 10e
      // 0e7: ifeq 10c
      // 0ea: goto 0f1
      // 0ed: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0f0: athrow
      // 0f1: aload 30
      // 0f3: aload 33
      // 0f5: checkcast rip/breeze/inject/ճ
      // 0f8: new rip/breeze/inject/ճ
      // 0fb: dup
      // 0fc: invokespecial rip/breeze/inject/ճ.<init> ()V
      // 0ff: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 104: goto 10b
      // 107: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 10a: athrow
      // 10b: pop
      // 10c: iload 31
      // 10e: ifeq 0b4
      // 111: aload 3
      // 112: lload 4
      // 114: lconst_0
      // 115: lcmp
      // 116: ifle 0c5
      // 119: iload 31
      // 11b: ifne 163
      // 11e: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 121: sipush 13560
      // 124: ldc2_w 433579826974673010
      // 127: lload 4
      // 129: lxor
      // 12a: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util141.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 132: goto 139
      // 135: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 138: athrow
      // 139: ifeq 162
      // 13c: aload 2
      // 13d: getfield rip/breeze/inject/é.string_ø_2 Ljava/lang/String;
      // 140: aload 3
      // 141: lload 18
      // 143: bipush 3
      // 144: anewarray 57
      // 147: dup_x2
      // 148: dup_x2
      // 149: pop
      // 14a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14d: bipush 2
      // 14e: swap
      // 14f: aastore
      // 150: dup_x1
      // 151: swap
      // 152: bipush 1
      // 153: swap
      // 154: aastore
      // 155: dup_x1
      // 156: swap
      // 157: bipush 0
      // 158: swap
      // 159: aastore
      // 15a: invokestatic rip/breeze/classtransform/MathUtil3.getՋ_2 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 15d: astore 32
      // 15f: goto 16f
      // 162: aload 3
      // 163: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 166: bipush 0
      // 167: anewarray 57
      // 16a: invokevirtual rip/breeze/inject/թ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 16d: astore 32
      // 16f: aload 32
      // 171: ifnonnull 179
      // 174: return
      // 175: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 178: athrow
      // 179: aload 3
      // 17a: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 17d: aload 32
      // 17f: lload 12
      // 181: bipush 2
      // 182: anewarray 57
      // 185: dup_x2
      // 186: dup_x2
      // 187: pop
      // 188: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18b: bipush 1
      // 18c: swap
      // 18d: aastore
      // 18e: dup_x1
      // 18f: swap
      // 190: bipush 0
      // 191: swap
      // 192: aastore
      // 193: invokevirtual rip/breeze/inject/թ.method_006 ([Ljava/lang/Object;)I
      // 196: istore 33
      // 198: iload 33
      // 19a: aload 3
      // 19b: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 19e: bipush 0
      // 19f: anewarray 57
      // 1a2: invokevirtual rip/breeze/inject/թ.method_001 ([Ljava/lang/Object;)I
      // 1a5: if_icmpge 30c
      // 1a8: aload 3
      // 1a9: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 1ac: iload 33
      // 1ae: lload 14
      // 1b0: bipush 2
      // 1b1: anewarray 57
      // 1b4: dup_x2
      // 1b5: dup_x2
      // 1b6: pop
      // 1b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ba: bipush 1
      // 1bb: swap
      // 1bc: aastore
      // 1bd: dup_x1
      // 1be: swap
      // 1bf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c2: bipush 0
      // 1c3: swap
      // 1c4: aastore
      // 1c5: invokevirtual rip/breeze/inject/թ.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 1c8: astore 34
      // 1ca: iload 31
      // 1cc: lload 4
      // 1ce: lconst_0
      // 1cf: lcmp
      // 1d0: iflt 1db
      // 1d3: ifne 307
      // 1d6: aload 34
      // 1d8: instanceof rip/breeze/inject/ձ
      // 1db: lload 4
      // 1dd: lconst_0
      // 1de: lcmp
      // 1df: iflt 32f
      // 1e2: iload 31
      // 1e4: ifne 32f
      // 1e7: goto 1ee
      // 1ea: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1ed: athrow
      // 1ee: ifne 304
      // 1f1: goto 1f8
      // 1f4: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1f7: athrow
      // 1f8: aload 34
      // 1fa: instanceof rip/breeze/inject/չ
      // 1fd: lload 4
      // 1ff: lconst_0
      // 200: lcmp
      // 201: iflt 26d
      // 204: iload 31
      // 206: ifne 26d
      // 209: goto 210
      // 20c: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 20f: athrow
      // 210: ifeq 221
      // 213: goto 21a
      // 216: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 219: athrow
      // 21a: lload 4
      // 21c: lconst_0
      // 21d: lcmp
      // 21e: ifgt 304
      // 221: aload 29
      // 223: aload 34
      // 225: lload 8
      // 227: aload 30
      // 229: bipush 2
      // 22a: anewarray 57
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
      // 23b: invokevirtual rip/breeze/inject/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ջ;
      // 23e: lload 22
      // 240: bipush 2
      // 241: anewarray 57
      // 244: dup_x2
      // 245: dup_x2
      // 246: pop
      // 247: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24a: bipush 1
      // 24b: swap
      // 24c: aastore
      // 24d: dup_x1
      // 24e: swap
      // 24f: bipush 0
      // 250: swap
      // 251: aastore
      // 252: invokevirtual rip/breeze/inject/թ.method_012 ([Ljava/lang/Object;)V
      // 255: iload 31
      // 257: lload 4
      // 259: lconst_0
      // 25a: lcmp
      // 25b: ifle 309
      // 25e: ifne 307
      // 261: aload 34
      // 263: instanceof rip/breeze/inject/պ
      // 266: goto 26d
      // 269: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 26c: athrow
      // 26d: ifeq 304
      // 270: aload 34
      // 272: iload 31
      // 274: ifne 2c4
      // 277: goto 27e
      // 27a: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 27d: athrow
      // 27e: lload 4
      // 280: lconst_0
      // 281: lcmp
      // 282: ifle 2bd
      // 285: bipush 0
      // 286: anewarray 57
      // 289: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 28c: sipush 181
      // 28f: if_icmpeq 2bb
      // 292: goto 299
      // 295: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 298: athrow
      // 299: aload 34
      // 29b: iload 31
      // 29d: ifne 2c4
      // 2a0: goto 2a7
      // 2a3: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2a6: athrow
      // 2a7: bipush 0
      // 2a8: anewarray 57
      // 2ab: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 2ae: sipush 179
      // 2b1: if_icmpne 304
      // 2b4: goto 2bb
      // 2b7: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2ba: athrow
      // 2bb: aload 34
      // 2bd: goto 2c4
      // 2c0: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2c3: athrow
      // 2c4: checkcast rip/breeze/inject/պ
      // 2c7: astore 35
      // 2c9: aload 28
      // 2cb: new java/lang/StringBuilder
      // 2ce: dup
      // 2cf: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d2: aload 35
      // 2d4: getfield rip/breeze/inject/պ.string_ç_2 Ljava/lang/String;
      // 2d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2da: ldc_w ":"
      // 2dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e0: aload 35
      // 2e2: getfield rip/breeze/inject/պ.string_æ_2 Ljava/lang/String;
      // 2e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e8: aload 35
      // 2ea: getfield rip/breeze/inject/պ.string_å_2 Ljava/lang/String;
      // 2ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f3: aload 29
      // 2f5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2fa: pop
      // 2fb: new rip/breeze/inject/թ
      // 2fe: dup
      // 2ff: invokespecial rip/breeze/inject/թ.<init> ()V
      // 302: astore 29
      // 304: iinc 33 1
      // 307: iload 31
      // 309: ifeq 198
      // 30c: aload 29
      // 30e: iload 31
      // 310: lload 4
      // 312: lconst_0
      // 313: lcmp
      // 314: ifle 1ae
      // 317: lload 4
      // 319: lconst_0
      // 31a: lcmp
      // 31b: iflt 322
      // 31e: ifne 349
      // 321: bipush 0
      // 322: anewarray 57
      // 325: invokevirtual rip/breeze/inject/թ.method_001 ([Ljava/lang/Object;)I
      // 328: goto 32f
      // 32b: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 32e: athrow
      // 32f: ifeq 344
      // 332: aload 28
      // 334: aconst_null
      // 335: aload 29
      // 337: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 33c: pop
      // 33d: goto 344
      // 340: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 343: athrow
      // 344: aload 7
      // 346: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 349: lload 26
      // 34b: bipush 1
      // 34c: anewarray 57
      // 34f: dup_x2
      // 350: dup_x2
      // 351: pop
      // 352: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 355: bipush 0
      // 356: swap
      // 357: aastore
      // 358: invokevirtual rip/breeze/inject/թ.method_010 ([Ljava/lang/Object;)[Lrip/breeze/inject/ջ;
      // 35b: astore 32
      // 35d: aload 32
      // 35f: arraylength
      // 360: istore 33
      // 362: bipush 0
      // 363: istore 34
      // 365: iload 34
      // 367: iload 33
      // 369: if_icmpge 497
      // 36c: aload 32
      // 36e: iload 34
      // 370: aaload
      // 371: astore 35
      // 373: iload 31
      // 375: lload 4
      // 377: lconst_0
      // 378: lcmp
      // 379: iflt 494
      // 37c: ifne 492
      // 37f: aload 35
      // 381: instanceof rip/breeze/inject/պ
      // 384: iload 31
      // 386: ifne 4bd
      // 389: goto 390
      // 38c: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 38f: athrow
      // 390: ifeq 48f
      // 393: goto 39a
      // 396: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 399: athrow
      // 39a: aload 35
      // 39c: iload 31
      // 39e: ifne 3ee
      // 3a1: goto 3a8
      // 3a4: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3a7: athrow
      // 3a8: lload 4
      // 3aa: lconst_0
      // 3ab: lcmp
      // 3ac: iflt 3e7
      // 3af: bipush 0
      // 3b0: anewarray 57
      // 3b3: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 3b6: sipush 181
      // 3b9: if_icmpeq 3e5
      // 3bc: goto 3c3
      // 3bf: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3c2: athrow
      // 3c3: aload 35
      // 3c5: iload 31
      // 3c7: ifne 3ee
      // 3ca: goto 3d1
      // 3cd: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3d0: athrow
      // 3d1: bipush 0
      // 3d2: anewarray 57
      // 3d5: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 3d8: sipush 179
      // 3db: if_icmpne 48f
      // 3de: goto 3e5
      // 3e1: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3e4: athrow
      // 3e5: aload 35
      // 3e7: goto 3ee
      // 3ea: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3ed: athrow
      // 3ee: checkcast rip/breeze/inject/պ
      // 3f1: astore 36
      // 3f3: aload 28
      // 3f5: new java/lang/StringBuilder
      // 3f8: dup
      // 3f9: invokespecial java/lang/StringBuilder.<init> ()V
      // 3fc: aload 36
      // 3fe: getfield rip/breeze/inject/պ.string_ç_2 Ljava/lang/String;
      // 401: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 404: ldc_w ":"
      // 407: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40a: aload 36
      // 40c: getfield rip/breeze/inject/պ.string_æ_2 Ljava/lang/String;
      // 40f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 412: aload 36
      // 414: getfield rip/breeze/inject/պ.string_å_2 Ljava/lang/String;
      // 417: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 41d: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 422: checkcast rip/breeze/inject/թ
      // 425: astore 37
      // 427: aload 37
      // 429: iload 31
      // 42b: ifne 444
      // 42e: ifnonnull 43f
      // 431: goto 438
      // 434: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 437: athrow
      // 438: lload 4
      // 43a: lconst_0
      // 43b: lcmp
      // 43c: ifgt 48f
      // 43f: aload 7
      // 441: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 444: lload 16
      // 446: aload 35
      // 448: aload 0
      // 449: aload 37
      // 44b: aload 2
      // 44c: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 44f: aload 6
      // 451: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 454: lload 10
      // 456: bipush 4
      // 457: anewarray 57
      // 45a: dup_x2
      // 45b: dup_x2
      // 45c: pop
      // 45d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 460: bipush 3
      // 461: swap
      // 462: aastore
      // 463: dup_x1
      // 464: swap
      // 465: bipush 2
      // 466: swap
      // 467: aastore
      // 468: dup_x1
      // 469: swap
      // 46a: bipush 1
      // 46b: swap
      // 46c: aastore
      // 46d: dup_x1
      // 46e: swap
      // 46f: bipush 0
      // 470: swap
      // 471: aastore
      // 472: invokespecial rip/breeze/classtransform/Util141.getԹ ([Ljava/lang/Object;)Lrip/breeze/inject/թ;
      // 475: bipush 3
      // 476: anewarray 57
      // 479: dup_x1
      // 47a: swap
      // 47b: bipush 2
      // 47c: swap
      // 47d: aastore
      // 47e: dup_x1
      // 47f: swap
      // 480: bipush 1
      // 481: swap
      // 482: aastore
      // 483: dup_x2
      // 484: dup_x2
      // 485: pop
      // 486: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 489: bipush 0
      // 48a: swap
      // 48b: aastore
      // 48c: invokevirtual rip/breeze/inject/թ.method_017 ([Ljava/lang/Object;)V
      // 48f: iinc 34 1
      // 492: iload 31
      // 494: ifeq 365
      // 497: aload 7
      // 499: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 49c: lload 26
      // 49e: bipush 1
      // 49f: anewarray 57
      // 4a2: dup_x2
      // 4a3: dup_x2
      // 4a4: pop
      // 4a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a8: bipush 0
      // 4a9: swap
      // 4aa: aastore
      // 4ab: invokevirtual rip/breeze/inject/թ.method_010 ([Ljava/lang/Object;)[Lrip/breeze/inject/ջ;
      // 4ae: astore 32
      // 4b0: aload 32
      // 4b2: arraylength
      // 4b3: istore 33
      // 4b5: lload 4
      // 4b7: lconst_0
      // 4b8: lcmp
      // 4b9: iflt 4bf
      // 4bc: bipush 0
      // 4bd: istore 34
      // 4bf: iload 34
      // 4c1: iload 33
      // 4c3: if_icmpge 58a
      // 4c6: aload 32
      // 4c8: iload 34
      // 4ca: aaload
      // 4cb: astore 35
      // 4cd: iload 31
      // 4cf: lload 4
      // 4d1: lconst_0
      // 4d2: lcmp
      // 4d3: iflt 587
      // 4d6: ifne 585
      // 4d9: aload 35
      // 4db: bipush 0
      // 4dc: anewarray 57
      // 4df: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 4e2: sipush 177
      // 4e5: if_icmpne 582
      // 4e8: goto 4ef
      // 4eb: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4ee: athrow
      // 4ef: aload 28
      // 4f1: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 4f6: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 4fb: astore 36
      // 4fd: aload 36
      // 4ff: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 504: ifeq 582
      // 507: aload 36
      // 509: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 50e: checkcast rip/breeze/inject/թ
      // 511: astore 37
      // 513: aload 7
      // 515: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 518: aload 35
      // 51a: aload 0
      // 51b: aload 37
      // 51d: aload 2
      // 51e: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 521: aload 6
      // 523: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 526: lload 10
      // 528: bipush 4
      // 529: anewarray 57
      // 52c: dup_x2
      // 52d: dup_x2
      // 52e: pop
      // 52f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 532: bipush 3
      // 533: swap
      // 534: aastore
      // 535: dup_x1
      // 536: swap
      // 537: bipush 2
      // 538: swap
      // 539: aastore
      // 53a: dup_x1
      // 53b: swap
      // 53c: bipush 1
      // 53d: swap
      // 53e: aastore
      // 53f: dup_x1
      // 540: swap
      // 541: bipush 0
      // 542: swap
      // 543: aastore
      // 544: invokespecial rip/breeze/classtransform/Util141.getԹ ([Ljava/lang/Object;)Lrip/breeze/inject/թ;
      // 547: lload 20
      // 549: bipush 3
      // 54a: anewarray 57
      // 54d: dup_x2
      // 54e: dup_x2
      // 54f: pop
      // 550: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 553: bipush 2
      // 554: swap
      // 555: aastore
      // 556: dup_x1
      // 557: swap
      // 558: bipush 1
      // 559: swap
      // 55a: aastore
      // 55b: dup_x1
      // 55c: swap
      // 55d: bipush 0
      // 55e: swap
      // 55f: aastore
      // 560: invokevirtual rip/breeze/inject/թ.method_019 ([Ljava/lang/Object;)V
      // 563: iload 31
      // 565: lload 4
      // 567: lconst_0
      // 568: lcmp
      // 569: iflt 571
      // 56c: ifne 585
      // 56f: iload 31
      // 571: ifeq 4fd
      // 574: lload 4
      // 576: lconst_0
      // 577: lcmp
      // 578: iflt 563
      // 57b: goto 582
      // 57e: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 581: athrow
      // 582: iinc 34 1
      // 585: iload 31
      // 587: ifeq 4bf
      // 58a: return
      // try (109 -> 115): 116 java/lang/IllegalStateException
      // try (112 -> 123): 124 java/lang/IllegalStateException
      // try (118 -> 133): 134 java/lang/IllegalStateException
      // try (139 -> 153): 154 java/lang/IllegalStateException
      // try (189 -> 192): 192 java/lang/IllegalStateException
      // try (242 -> 256): 257 java/lang/IllegalStateException
      // try (248 -> 260): 261 java/lang/IllegalStateException
      // try (259 -> 271): 272 java/lang/IllegalStateException
      // try (263 -> 275): 276 java/lang/IllegalStateException
      // try (282 -> 325): 326 java/lang/IllegalStateException
      // try (328 -> 332): 333 java/lang/IllegalStateException
      // try (329 -> 344): 345 java/lang/IllegalStateException
      // try (335 -> 350): 351 java/lang/IllegalStateException
      // try (347 -> 358): 359 java/lang/IllegalStateException
      // try (353 -> 362): 363 java/lang/IllegalStateException
      // try (393 -> 407): 408 java/lang/IllegalStateException
      // try (410 -> 416): 417 java/lang/IllegalStateException
      // try (445 -> 455): 456 java/lang/IllegalStateException
      // try (451 -> 459): 460 java/lang/IllegalStateException
      // try (458 -> 465): 466 java/lang/IllegalStateException
      // try (462 -> 477): 478 java/lang/IllegalStateException
      // try (468 -> 483): 484 java/lang/IllegalStateException
      // try (480 -> 491): 492 java/lang/IllegalStateException
      // try (486 -> 495): 496 java/lang/IllegalStateException
      // try (519 -> 523): 524 java/lang/IllegalStateException
      // try (619 -> 631): 632 java/lang/IllegalStateException
      // try (645 -> 709): 714 java/lang/IllegalStateException
   }

   private թ getԹ(Object[] var1) {
      թ var2 = (թ)var1[0];
      String var3 = (String)var1[1];
      String var4 = (String)var1[2];
      long var5 = (Long)var1[3];
      var5 = encKey_b ^ var5;
      long var7 = var5 ^ 15000418899208L;
      long var9 = var5 ^ 92717924345191L;
      long var11 = var5 ^ 98094554082163L;
      long var10001 = var5 ^ 87656767786540L;
      int var13 = (int)((var5 ^ 87656767786540L) >>> 32);
      int var14 = (int)((var5 ^ 87656767786540L) << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      rip.breeze.inject.é var16 = new rip.breeze.inject.é(var11);
      Object[] var10009 = new Object[]{null, null, null /* removed */, null, ջ.CONST_Þ_2, null, var9};
      var10009[1] = 0;
      var10009[0] = 0;
      var16.method_001(var10009);
      BreezeClass12 var17 = new BreezeClass12(
         var13, (short)var14, 0, null /* removed */, ջ.CONST_Ò_2, null, (short)var15, null
      );
      var17.թ_ê = var2;
      խ.method_003(new Object[]{var3, var4, var16, var7, var17});
      return var16.list_ä_2.get(0).թ_ê;
   }

   private BreezeClass12 getBreezeClass12(Object[] param1) {
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
      // 012: pop
      // 013: getstatic rip/breeze/classtransform/Util141.encKey_b J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 71235204123967
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 137499767979163
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 96719192059943
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 119831497644008
      // 033: lxor
      // 034: lstore 11
      // 036: pop2
      // 037: invokestatic rip/breeze/classtransform/BreezeClass4.checkCondition ()Z
      // 03a: aload 2
      // 03b: getfield rip/breeze/inject/é.list_ä_2 Ljava/util/List;
      // 03e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 043: astore 13
      // 045: istore 14
      // 047: aload 13
      // 049: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 04e: ifeq 0a8
      // 051: aload 13
      // 053: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 058: checkcast rip/breeze/inject/BreezeClass12
      // 05b: astore 15
      // 05d: aload 15
      // 05f: iload 14
      // 061: lload 3
      // 062: lconst_0
      // 063: lcmp
      // 064: ifle 06c
      // 067: ifeq 0f2
      // 06a: iload 14
      // 06c: ifeq 0a2
      // 06f: goto 076
      // 072: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 075: athrow
      // 076: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 079: sipush 15072
      // 07c: ldc2_w 8728815284171725136
      // 07f: lload 3
      // 080: lxor
      // 081: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util141.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 089: lload 3
      // 08a: lconst_0
      // 08b: lcmp
      // 08c: ifle 0a5
      // 08f: ifeq 0a3
      // 092: goto 099
      // 095: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 098: athrow
      // 099: aload 15
      // 09b: goto 0a2
      // 09e: invokestatic rip/breeze/classtransform/Util141.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0a1: athrow
      // 0a2: areturn
      // 0a3: iload 14
      // 0a5: ifne 047
      // 0a8: aload 2
      // 0a9: lload 3
      // 0aa: lconst_0
      // 0ab: lcmp
      // 0ac: iflt 058
      // 0af: bipush 8
      // 0b1: lload 7
      // 0b3: sipush 15072
      // 0b6: ldc2_w 8728815284171725136
      // 0b9: lload 3
      // 0ba: lxor
      // 0bb: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util141.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: getstatic rip/breeze/classtransform/ջ.CONST_Ò_2 Ljava/lang/String;
      // 0c3: aconst_null
      // 0c4: aconst_null
      // 0c5: bipush 6
      // 0c7: anewarray 57
      // 0ca: dup_x1
      // 0cb: swap
      // 0cc: bipush 5
      // 0cd: swap
      // 0ce: aastore
      // 0cf: dup_x1
      // 0d0: swap
      // 0d1: bipush 4
      // 0d2: swap
      // 0d3: aastore
      // 0d4: dup_x1
      // 0d5: swap
      // 0d6: bipush 3
      // 0d7: swap
      // 0d8: aastore
      // 0d9: dup_x1
      // 0da: swap
      // 0db: bipush 2
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 1
      // 0e5: swap
      // 0e6: aastore
      // 0e7: dup_x1
      // 0e8: swap
      // 0e9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ec: bipush 0
      // 0ed: swap
      // 0ee: aastore
      // 0ef: invokevirtual rip/breeze/inject/é.method_014 ([Ljava/lang/Object;)Lrip/breeze/inject/Util140;
      // 0f2: astore 13
      // 0f4: aload 13
      // 0f6: lload 9
      // 0f8: bipush 1
      // 0f9: anewarray 57
      // 0fc: dup_x2
      // 0fd: dup_x2
      // 0fe: pop
      // 0ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 102: bipush 0
      // 103: swap
      // 104: aastore
      // 105: invokevirtual rip/breeze/inject/Util140.processAll_4 ([Ljava/lang/Object;)V
      // 108: aload 13
      // 10a: sipush 177
      // 10d: lload 5
      // 10f: bipush 2
      // 110: anewarray 57
      // 113: dup_x2
      // 114: dup_x2
      // 115: pop
      // 116: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 119: bipush 1
      // 11a: swap
      // 11b: aastore
      // 11c: dup_x1
      // 11d: swap
      // 11e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 121: bipush 0
      // 122: swap
      // 123: aastore
      // 124: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 127: aload 13
      // 129: lload 11
      // 12b: bipush 1
      // 12c: anewarray 57
      // 12f: dup_x2
      // 130: dup_x2
      // 131: pop
      // 132: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 135: bipush 0
      // 136: swap
      // 137: aastore
      // 138: invokevirtual rip/breeze/inject/Util140.processAll_25 ([Ljava/lang/Object;)V
      // 13b: aload 13
      // 13d: checkcast rip/breeze/inject/BreezeClass12
      // 140: areturn
      // try (48 -> 57): 58 java/lang/IllegalStateException
      // try (55 -> 72): 73 java/lang/IllegalStateException
      // try (60 -> 76): 77 java/lang/IllegalStateException
   }

   static {
      long var0 = 94488248042382L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[14];
      int var5 = 0;
      String var6 = "\u009a¯äæ52÷-ï\u0005áÉå\u001aR\u008e\u0010Ð;\u0015e\u0094Òm\rÒ|Ë4I+\u0095\u00ad0õ\u0092\u0017aa±«Ã»Ä¼ú^\u0016\u000f\u001aÈU©\"oÍ`\n\u009aìÞ\u000bÂ\b\u0084\u0097¡\u008cñ\u008bKÐÁ|\u0004òþQ'ê¶³0£\u0085Yæ\u008e©%Sw\u009e\u009fú\u0003Ýñ!êü\u0099Û'FÔfø\u008bíØÞO\u0080´\u008dy}p<\u0095q\u0015&Çûmý*3ä\u0010Â\u001fá\u0097*\u009b¾$©\bù½Ñ²\u009c\b(\u001f\u008c+ãRÿáÍKüh\u0016\u0088G\t<^°ký>p©\u009azÎc¤\u0085ëÕ\u001f\u008c?Hþ8 }WX@ê[ç\"b}\u009b/\u0093\u0090\u009aFh\u0000\u007f\u008a|÷{\u0086\u0092QÍL¨±`\u0081\u0090Ê\u0084»¤¶\u001a/^\r¾\u0014v\u0080uî{¢\u0013j\u008cÄ\u0018$\u0094\u0004q#ç\u0013\u0016å|¬ft\u0088ýøôÑOçM| \u0002År3´\bäâ\u0016\u0001çh´ Ò½&C.i\u000fJkXJ\u0084\u000fçÚ\u0082¿<NW@t@´ª\u008d\u0007[VÈù\u008f\u0010ñBa¨¢®t\u0099¾â\u0019\u0085z{pä0ø\u0088æ1\u00ad°ªÌµ¦Ú\u0006\u001e?\"P°H_,%D\u0087\u0099:\u001aÌfO¨<xªIÓ|\u0002ª\r\u0006K¯÷²«å¶\u008e\u0010Ù¡\u0096ÙJUOÌéX\u0012¹ìD \u001c\u0018Z]v¢D6\u001e ×%¿e¯÷¤){Ìnå`{ò\u008d";
      int var7 = "\u009a¯äæ52÷-ï\u0005áÉå\u001aR\u008e\u0010Ð;\u0015e\u0094Òm\rÒ|Ë4I+\u0095\u00ad0õ\u0092\u0017aa±«Ã»Ä¼ú^\u0016\u000f\u001aÈU©\"oÍ`\n\u009aìÞ\u000bÂ\b\u0084\u0097¡\u008cñ\u008bKÐÁ|\u0004òþQ'ê¶³0£\u0085Yæ\u008e©%Sw\u009e\u009fú\u0003Ýñ!êü\u0099Û'FÔfø\u008bíØÞO\u0080´\u008dy}p<\u0095q\u0015&Çûmý*3ä\u0010Â\u001fá\u0097*\u009b¾$©\bù½Ñ²\u009c\b(\u001f\u008c+ãRÿáÍKüh\u0016\u0088G\t<^°ký>p©\u009azÎc¤\u0085ëÕ\u001f\u008c?Hþ8 }WX@ê[ç\"b}\u009b/\u0093\u0090\u009aFh\u0000\u007f\u008a|÷{\u0086\u0092QÍL¨±`\u0081\u0090Ê\u0084»¤¶\u001a/^\r¾\u0014v\u0080uî{¢\u0013j\u008cÄ\u0018$\u0094\u0004q#ç\u0013\u0016å|¬ft\u0088ýøôÑOçM| \u0002År3´\bäâ\u0016\u0001çh´ Ò½&C.i\u000fJkXJ\u0084\u000fçÚ\u0082¿<NW@t@´ª\u008d\u0007[VÈù\u008f\u0010ñBa¨¢®t\u0099¾â\u0019\u0085z{pä0ø\u0088æ1\u00ad°ªÌµ¦Ú\u0006\u001e?\"P°H_,%D\u0087\u0099:\u001aÌfO¨<xªIÓ|\u0002ª\r\u0006K¯÷²«å¶\u008e\u0010Ù¡\u0096ÙJUOÌéX\u0012¹ìD \u001c\u0018Z]v¢D6\u001e ×%¿e¯÷¤){Ìnå`{ò\u008d"
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
                     CONST_F = var4;
                     CONST_G = new String[14];
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

                  var6 = "\u0011L\u008fL\"¹GjÔ\\\u001f\u009c\u008b\u001e\u0013Áui4ø\u0012å\u0080\u0005\u0084÷\u000e\u0085«\u0096NÕÞ[DQI§\u001d\f,ìåû¨\u0098| L#.î2Ï\u001e\u0084\u0018%ÌælN\u0099\u007fÕ\u001dæ*¥vrß)Ï\u0087¦öÙM/\"";
                  var7 = "\u0011L\u008fL\"¹GjÔ\\\u001f\u009c\u008b\u001e\u0013Áui4ø\u0012å\u0080\u0005\u0084÷\u000e\u0085«\u0096NÕÞ[DQI§\u001d\f,ìåû¨\u0098| L#.î2Ï\u001e\u0084\u0018%ÌælN\u0099\u007fÕ\u001dæ*¥vrß)Ï\u0087¦öÙM/\""
                     .length();
                  var8 = '8';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static IllegalStateException getIllegalStateException(IllegalStateException var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13159;
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
            throw new RuntimeException("rip/breeze/classtransform/s", var10);
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
         throw new RuntimeException("rip/breeze/classtransform/s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
