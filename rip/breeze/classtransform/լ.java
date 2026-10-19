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
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.inject.ù;

public class լ {
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   public static void calculate(Object[] param0) throws ClassNotFoundException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 2
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast rip/breeze/inject/é
      // 01b: astore 3
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast rip/breeze/classtransform/ô
      // 022: astore 4
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast java/lang/Integer
      // 02a: invokevirtual java/lang/Integer.intValue ()I
      // 02d: istore 5
      // 02f: dup
      // 030: bipush 5
      // 031: aaload
      // 032: checkcast rip/breeze/classtransform/ժ
      // 035: astore 6
      // 037: dup
      // 038: bipush 6
      // 03a: aaload
      // 03b: checkcast rip/breeze/classtransform/է
      // 03e: astore 7
      // 040: pop
      // 041: iload 1
      // 042: i2l
      // 043: bipush 48
      // 045: lshl
      // 046: iload 2
      // 047: i2l
      // 048: bipush 32
      // 04a: lshl
      // 04b: bipush 16
      // 04d: lushr
      // 04e: lor
      // 04f: iload 5
      // 051: i2l
      // 052: bipush 48
      // 054: lshl
      // 055: bipush 48
      // 057: lushr
      // 058: lor
      // 059: getstatic rip/breeze/classtransform/լ.encKey_a J
      // 05c: lxor
      // 05d: lstore 8
      // 05f: lload 8
      // 061: dup2
      // 062: ldc2_w 39552437379477
      // 065: lxor
      // 066: lstore 10
      // 068: dup2
      // 069: ldc2_w 22775528457088
      // 06c: lxor
      // 06d: lstore 12
      // 06f: pop2
      // 070: aload 3
      // 071: ldc rip/breeze/classtransform/annotations/CTransformer
      // 073: lload 10
      // 075: bipush 3
      // 076: anewarray 4
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 2
      // 080: swap
      // 081: aastore
      // 082: dup_x1
      // 083: swap
      // 084: bipush 1
      // 085: swap
      // 086: aastore
      // 087: dup_x1
      // 088: swap
      // 089: bipush 0
      // 08a: swap
      // 08b: aastore
      // 08c: invokestatic rip/breeze/classtransform/չ.method_028 ([Ljava/lang/Object;)Ljava/util/Optional;
      // 08f: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/լ.lambda$fillTransformerSuperMembers_Inner0 (Lrip/breeze/inject/ù;)Ljava/util/List;, (Lrip/breeze/inject/ù;)Ljava/util/List; ]
      // 094: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // 097: invokedynamic get ()Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, rip/breeze/classtransform/լ.lambda$fillTransformerSuperMembers_Inner1 ()Ljava/lang/IllegalStateException;, ()Ljava/lang/IllegalStateException; ]
      // 09c: invokevirtual java/util/Optional.orElseThrow (Ljava/util/function/Supplier;)Ljava/lang/Object;
      // 09f: checkcast java/util/List
      // 0a2: astore 14
      // 0a4: invokestatic rip/breeze/classtransform/ô.method_016 ()Ljava/lang/String;
      // 0a7: bipush 0
      // 0a8: istore 15
      // 0aa: astore 16
      // 0ac: iload 15
      // 0ae: aload 14
      // 0b0: invokeinterface java/util/List.size ()I 1
      // 0b5: if_icmpge 220
      // 0b8: aload 14
      // 0ba: iload 15
      // 0bc: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0c1: checkcast java/lang/String
      // 0c4: astore 17
      // 0c6: aload 14
      // 0c8: iload 15
      // 0ca: bipush 1
      // 0cb: iadd
      // 0cc: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d1: astore 18
      // 0d3: aload 17
      // 0d5: sipush 29300
      // 0d8: ldc2_w 4484696839742185598
      // 0db: lload 8
      // 0dd: lxor
      // 0de: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/լ.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e6: aload 16
      // 0e8: ifnull 19a
      // 0eb: ifeq 174
      // 0ee: goto 0f5
      // 0f1: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: aload 18
      // 0f7: checkcast java/util/List
      // 0fa: astore 19
      // 0fc: aload 19
      // 0fe: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 103: astore 20
      // 105: aload 20
      // 107: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 10c: ifeq 16a
      // 10f: aload 20
      // 111: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 116: checkcast rip/breeze/inject/MathUtil3
      // 119: astore 21
      // 11b: aload 21
      // 11d: bipush 0
      // 11e: anewarray 4
      // 121: invokevirtual rip/breeze/inject/MathUtil3.buildString_3 ([Ljava/lang/Object;)Ljava/lang/String;
      // 124: lload 12
      // 126: aload 4
      // 128: aload 6
      // 12a: aload 7
      // 12c: bipush 5
      // 12d: anewarray 4
      // 130: dup_x1
      // 131: swap
      // 132: bipush 4
      // 133: swap
      // 134: aastore
      // 135: dup_x1
      // 136: swap
      // 137: bipush 3
      // 138: swap
      // 139: aastore
      // 13a: dup_x1
      // 13b: swap
      // 13c: bipush 2
      // 13d: swap
      // 13e: aastore
      // 13f: dup_x2
      // 140: dup_x2
      // 141: pop
      // 142: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 145: bipush 1
      // 146: swap
      // 147: aastore
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 0
      // 14b: swap
      // 14c: aastore
      // 14d: invokestatic rip/breeze/classtransform/լ.method_002 ([Ljava/lang/Object;)V
      // 150: aload 16
      // 152: iload 5
      // 154: iflt 15c
      // 157: ifnull 21b
      // 15a: aload 16
      // 15c: ifnonnull 105
      // 15f: iload 1
      // 160: iflt 150
      // 163: goto 16a
      // 166: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 169: athrow
      // 16a: aload 16
      // 16c: iload 5
      // 16e: ifle 176
      // 171: ifnonnull 218
      // 174: aload 17
      // 176: aload 16
      // 178: ifnull 19f
      // 17b: goto 182
      // 17e: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: sipush 31779
      // 185: ldc2_w 7569507131446488616
      // 188: lload 8
      // 18a: lxor
      // 18b: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/լ.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 193: goto 19a
      // 196: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: ifeq 218
      // 19d: aload 18
      // 19f: checkcast java/util/List
      // 1a2: astore 19
      // 1a4: aload 19
      // 1a6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1ab: astore 20
      // 1ad: aload 20
      // 1af: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b4: ifeq 218
      // 1b7: aload 20
      // 1b9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1be: checkcast java/lang/String
      // 1c1: astore 21
      // 1c3: aload 21
      // 1c5: bipush 1
      // 1c6: anewarray 4
      // 1c9: dup_x1
      // 1ca: swap
      // 1cb: bipush 0
      // 1cc: swap
      // 1cd: aastore
      // 1ce: invokestatic rip/breeze/classtransform/MathUtil3.buildString_2 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1d1: lload 12
      // 1d3: aload 4
      // 1d5: aload 6
      // 1d7: aload 7
      // 1d9: bipush 5
      // 1da: anewarray 4
      // 1dd: dup_x1
      // 1de: swap
      // 1df: bipush 4
      // 1e0: swap
      // 1e1: aastore
      // 1e2: dup_x1
      // 1e3: swap
      // 1e4: bipush 3
      // 1e5: swap
      // 1e6: aastore
      // 1e7: dup_x1
      // 1e8: swap
      // 1e9: bipush 2
      // 1ea: swap
      // 1eb: aastore
      // 1ec: dup_x2
      // 1ed: dup_x2
      // 1ee: pop
      // 1ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f2: bipush 1
      // 1f3: swap
      // 1f4: aastore
      // 1f5: dup_x1
      // 1f6: swap
      // 1f7: bipush 0
      // 1f8: swap
      // 1f9: aastore
      // 1fa: invokestatic rip/breeze/classtransform/լ.method_002 ([Ljava/lang/Object;)V
      // 1fd: aload 16
      // 1ff: iload 5
      // 201: ifle 21d
      // 204: ifnull 21b
      // 207: aload 16
      // 209: ifnonnull 1ad
      // 20c: iload 5
      // 20e: iflt 1fd
      // 211: goto 218
      // 214: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 217: athrow
      // 218: iinc 15 2
      // 21b: aload 16
      // 21d: ifnonnull 0ac
      // 220: return
      // try (119 -> 129): 130 java/lang/ClassNotFoundException
      // try (145 -> 189): 192 java/lang/ClassNotFoundException
      // try (194 -> 201): 202 java/lang/ClassNotFoundException
      // try (198 -> 210): 211 java/lang/ClassNotFoundException
      // try (227 -> 276): 279 java/lang/ClassNotFoundException
   }

   public static void invoke_2(Object[] var0) throws ClassNotFoundException {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      ô var4 = (ô)var0[2];
      ժ var5 = (ժ)var0[3];
      է var6 = (է)var0[4];
      var2 = encKey_a ^ var2;
      long var7 = var2 ^ 14884309919189L;
      long var9 = var2 ^ 30912578060630L;
      long var11 = var2 ^ 64270821623569L;
      ը var13 = var5.method_002(new Object[]{var11, var6, var4.method_013(new Object[]{var1})});
      Object[] var10005 = new Object[]{null, var6, false};
      var10005[0] = var9;
      Set var14 = var13.method_004(var10005).stream().map(ը::getÉ_ÿ).collect(Collectors.toSet());
      processAll(new Object[]{var13.getÉ_ÿ(), var14, var4, var7});
   }

   public static void processAll(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast rip/breeze/inject/é
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Set
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast rip/breeze/classtransform/ô
      // 015: astore 3
      // 016: dup
      // 017: bipush 3
      // 018: aaload
      // 019: checkcast java/lang/Long
      // 01c: invokevirtual java/lang/Long.longValue ()J
      // 01f: lstore 4
      // 021: pop
      // 022: getstatic rip/breeze/classtransform/լ.encKey_a J
      // 025: lload 4
      // 027: lxor
      // 028: lstore 4
      // 02a: lload 4
      // 02c: dup2
      // 02d: ldc2_w 119921044324940
      // 030: lxor
      // 031: lstore 6
      // 033: dup2
      // 034: ldc2_w 55180479909001
      // 037: lxor
      // 038: lstore 8
      // 03a: dup2
      // 03b: ldc2_w 38424132975823
      // 03e: lxor
      // 03f: lstore 10
      // 041: dup2
      // 042: ldc2_w 88616968492237
      // 045: lxor
      // 046: lstore 12
      // 048: dup2
      // 049: ldc2_w 86520477907763
      // 04c: lxor
      // 04d: lstore 14
      // 04f: dup2
      // 050: ldc2_w 37661440237338
      // 053: lxor
      // 054: lstore 16
      // 056: dup2
      // 057: ldc2_w 134525592428593
      // 05a: lxor
      // 05b: lstore 18
      // 05d: pop2
      // 05e: aload 3
      // 05f: lload 6
      // 061: bipush 1
      // 062: anewarray 4
      // 065: dup_x2
      // 066: dup_x2
      // 067: pop
      // 068: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06b: bipush 0
      // 06c: swap
      // 06d: aastore
      // 06e: invokevirtual rip/breeze/classtransform/ô.method_014 ([Ljava/lang/Object;)Lrip/breeze/classtransform/ô;
      // 071: astore 20
      // 073: invokestatic rip/breeze/classtransform/ô.method_016 ()Ljava/lang/String;
      // 076: aload 2
      // 077: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 07c: astore 21
      // 07e: astore 22
      // 080: aload 21
      // 082: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 087: ifeq 2fc
      // 08a: aload 21
      // 08c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 091: checkcast rip/breeze/inject/é
      // 094: astore 23
      // 096: aload 23
      // 098: getfield rip/breeze/inject/é.list_å_2 Ljava/util/List;
      // 09b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0a0: astore 24
      // 0a2: aload 24
      // 0a4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a9: ifeq 1ca
      // 0ac: aload 24
      // 0ae: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b3: checkcast rip/breeze/inject/á
      // 0b6: astore 25
      // 0b8: aload 25
      // 0ba: getfield rip/breeze/inject/á.int_ý_2 I
      // 0bd: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 0c0: lload 4
      // 0c2: lconst_0
      // 0c3: lcmp
      // 0c4: ifle 1dd
      // 0c7: aload 22
      // 0c9: lload 4
      // 0cb: lconst_0
      // 0cc: lcmp
      // 0cd: iflt 0d5
      // 0d0: ifnull 1dd
      // 0d3: aload 22
      // 0d5: ifnull 0f8
      // 0d8: goto 0df
      // 0db: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0de: athrow
      // 0df: ifeq 0f0
      // 0e2: goto 0e9
      // 0e5: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e8: athrow
      // 0e9: lload 4
      // 0eb: lconst_0
      // 0ec: lcmp
      // 0ed: ifgt 0a2
      // 0f0: aload 25
      // 0f2: getfield rip/breeze/inject/á.int_ý_2 I
      // 0f5: invokestatic java/lang/reflect/Modifier.isPrivate (I)Z
      // 0f8: ifeq 0fe
      // 0fb: goto 0a2
      // 0fe: aload 20
      // 100: aload 23
      // 102: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 105: lload 16
      // 107: dup2_x1
      // 108: pop2
      // 109: aload 25
      // 10b: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 10e: aload 25
      // 110: getfield rip/breeze/inject/á.string_û_2 Ljava/lang/String;
      // 113: bipush 4
      // 114: anewarray 4
      // 117: dup_x1
      // 118: swap
      // 119: bipush 3
      // 11a: swap
      // 11b: aastore
      // 11c: dup_x1
      // 11d: swap
      // 11e: bipush 2
      // 11f: swap
      // 120: aastore
      // 121: dup_x1
      // 122: swap
      // 123: bipush 1
      // 124: swap
      // 125: aastore
      // 126: dup_x2
      // 127: dup_x2
      // 128: pop
      // 129: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12c: bipush 0
      // 12d: swap
      // 12e: aastore
      // 12f: invokevirtual rip/breeze/classtransform/ô.method_004 ([Ljava/lang/Object;)Ljava/lang/String;
      // 132: astore 26
      // 134: aload 22
      // 136: lload 4
      // 138: lconst_0
      // 139: lcmp
      // 13a: ifle 1c7
      // 13d: ifnull 1c5
      // 140: aload 25
      // 142: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 145: aload 26
      // 147: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 14a: ifeq 15b
      // 14d: goto 154
      // 150: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: goto 0a2
      // 157: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15a: athrow
      // 15b: aload 3
      // 15c: aload 20
      // 15e: aload 1
      // 15f: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 162: bipush 1
      // 163: anewarray 4
      // 166: dup_x1
      // 167: swap
      // 168: bipush 0
      // 169: swap
      // 16a: aastore
      // 16b: invokevirtual rip/breeze/classtransform/ô.method_013 ([Ljava/lang/Object;)Ljava/lang/String;
      // 16e: lload 8
      // 170: aload 26
      // 172: aload 20
      // 174: aload 25
      // 176: getfield rip/breeze/inject/á.string_û_2 Ljava/lang/String;
      // 179: lload 18
      // 17b: dup2_x1
      // 17c: pop2
      // 17d: bipush 2
      // 17e: anewarray 4
      // 181: dup_x1
      // 182: swap
      // 183: bipush 1
      // 184: swap
      // 185: aastore
      // 186: dup_x2
      // 187: dup_x2
      // 188: pop
      // 189: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18c: bipush 0
      // 18d: swap
      // 18e: aastore
      // 18f: invokevirtual rip/breeze/classtransform/ô.ÿ ([Ljava/lang/Object;)Ljava/lang/String;
      // 192: aload 25
      // 194: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 197: bipush 1
      // 198: bipush 6
      // 19a: anewarray 4
      // 19d: dup_x1
      // 19e: swap
      // 19f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1a2: bipush 5
      // 1a3: swap
      // 1a4: aastore
      // 1a5: dup_x1
      // 1a6: swap
      // 1a7: bipush 4
      // 1a8: swap
      // 1a9: aastore
      // 1aa: dup_x1
      // 1ab: swap
      // 1ac: bipush 3
      // 1ad: swap
      // 1ae: aastore
      // 1af: dup_x1
      // 1b0: swap
      // 1b1: bipush 2
      // 1b2: swap
      // 1b3: aastore
      // 1b4: dup_x2
      // 1b5: dup_x2
      // 1b6: pop
      // 1b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ba: bipush 1
      // 1bb: swap
      // 1bc: aastore
      // 1bd: dup_x1
      // 1be: swap
      // 1bf: bipush 0
      // 1c0: swap
      // 1c1: aastore
      // 1c2: invokevirtual rip/breeze/classtransform/ô.method_009 ([Ljava/lang/Object;)V
      // 1c5: aload 22
      // 1c7: ifnonnull 0a2
      // 1ca: aload 23
      // 1cc: getfield rip/breeze/inject/é.list_ä_2 Ljava/util/List;
      // 1cf: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1d4: astore 24
      // 1d6: aload 24
      // 1d8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1dd: ifeq 2f7
      // 1e0: aload 24
      // 1e2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1e7: checkcast rip/breeze/inject/BreezeClass12
      // 1ea: astore 25
      // 1ec: aload 25
      // 1ee: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 1f1: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 1f4: aload 22
      // 1f6: ifnull 087
      // 1f9: aload 22
      // 1fb: lload 4
      // 1fd: lconst_0
      // 1fe: lcmp
      // 1ff: iflt 1f6
      // 202: ifnull 21e
      // 205: ifeq 216
      // 208: goto 20f
      // 20b: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20e: athrow
      // 20f: lload 4
      // 211: lconst_0
      // 212: lcmp
      // 213: ifge 1d6
      // 216: aload 25
      // 218: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 21b: invokestatic java/lang/reflect/Modifier.isPrivate (I)Z
      // 21e: ifeq 224
      // 221: goto 1d6
      // 224: aload 20
      // 226: aload 23
      // 228: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 22b: aload 25
      // 22d: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 230: aload 25
      // 232: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 235: lload 14
      // 237: dup2_x1
      // 238: pop2
      // 239: bipush 4
      // 23a: anewarray 4
      // 23d: dup_x1
      // 23e: swap
      // 23f: bipush 3
      // 240: swap
      // 241: aastore
      // 242: dup_x2
      // 243: dup_x2
      // 244: pop
      // 245: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 248: bipush 2
      // 249: swap
      // 24a: aastore
      // 24b: dup_x1
      // 24c: swap
      // 24d: bipush 1
      // 24e: swap
      // 24f: aastore
      // 250: dup_x1
      // 251: swap
      // 252: bipush 0
      // 253: swap
      // 254: aastore
      // 255: invokevirtual rip/breeze/classtransform/ô.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 258: astore 26
      // 25a: aload 22
      // 25c: lload 4
      // 25e: lconst_0
      // 25f: lcmp
      // 260: iflt 2ed
      // 263: ifnull 2eb
      // 266: aload 25
      // 268: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 26b: aload 26
      // 26d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 270: ifeq 281
      // 273: goto 27a
      // 276: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 279: athrow
      // 27a: goto 1d6
      // 27d: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 280: athrow
      // 281: aload 3
      // 282: aload 20
      // 284: aload 1
      // 285: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 288: bipush 1
      // 289: anewarray 4
      // 28c: dup_x1
      // 28d: swap
      // 28e: bipush 0
      // 28f: swap
      // 290: aastore
      // 291: invokevirtual rip/breeze/classtransform/ô.method_013 ([Ljava/lang/Object;)Ljava/lang/String;
      // 294: aload 26
      // 296: aload 20
      // 298: aload 25
      // 29a: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 29d: lload 12
      // 29f: dup2_x1
      // 2a0: pop2
      // 2a1: bipush 2
      // 2a2: anewarray 4
      // 2a5: dup_x1
      // 2a6: swap
      // 2a7: bipush 1
      // 2a8: swap
      // 2a9: aastore
      // 2aa: dup_x2
      // 2ab: dup_x2
      // 2ac: pop
      // 2ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b0: bipush 0
      // 2b1: swap
      // 2b2: aastore
      // 2b3: invokevirtual rip/breeze/classtransform/ô.û ([Ljava/lang/Object;)Ljava/lang/String;
      // 2b6: aload 25
      // 2b8: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 2bb: lload 10
      // 2bd: bipush 1
      // 2be: bipush 6
      // 2c0: anewarray 4
      // 2c3: dup_x1
      // 2c4: swap
      // 2c5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2c8: bipush 5
      // 2c9: swap
      // 2ca: aastore
      // 2cb: dup_x2
      // 2cc: dup_x2
      // 2cd: pop
      // 2ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d1: bipush 4
      // 2d2: swap
      // 2d3: aastore
      // 2d4: dup_x1
      // 2d5: swap
      // 2d6: bipush 3
      // 2d7: swap
      // 2d8: aastore
      // 2d9: dup_x1
      // 2da: swap
      // 2db: bipush 2
      // 2dc: swap
      // 2dd: aastore
      // 2de: dup_x1
      // 2df: swap
      // 2e0: bipush 1
      // 2e1: swap
      // 2e2: aastore
      // 2e3: dup_x1
      // 2e4: swap
      // 2e5: bipush 0
      // 2e6: swap
      // 2e7: aastore
      // 2e8: invokevirtual rip/breeze/classtransform/ô.method_005 ([Ljava/lang/Object;)V
      // 2eb: aload 22
      // 2ed: lload 4
      // 2ef: lconst_0
      // 2f0: lcmp
      // 2f1: iflt 2f9
      // 2f4: ifnonnull 1d6
      // 2f7: aload 22
      // 2f9: ifnonnull 080
      // 2fc: return
      // try (93 -> 108): 109 java/lang/IllegalStateException
      // try (106 -> 112): 113 java/lang/IllegalStateException
      // try (160 -> 171): 172 java/lang/IllegalStateException
      // try (166 -> 175): 175 java/lang/IllegalStateException
      // try (269 -> 276): 277 java/lang/IllegalStateException
      // try (324 -> 335): 336 java/lang/IllegalStateException
      // try (330 -> 339): 339 java/lang/IllegalStateException
   }

   public static void processAll_2(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast rip/breeze/classtransform/ô
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast rip/breeze/classtransform/ժ
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 3
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast rip/breeze/classtransform/է
      // 01f: astore 5
      // 021: pop
      // 022: getstatic rip/breeze/classtransform/լ.encKey_a J
      // 025: lload 3
      // 026: lxor
      // 027: lstore 3
      // 028: lload 3
      // 029: dup2
      // 02a: ldc2_w 19986586276012
      // 02d: lxor
      // 02e: lstore 6
      // 030: dup2
      // 031: ldc2_w 4095760757807
      // 034: lxor
      // 035: lstore 8
      // 037: dup2
      // 038: ldc2_w 41578708038248
      // 03b: lxor
      // 03c: lstore 10
      // 03e: pop2
      // 03f: invokestatic rip/breeze/classtransform/ô.method_016 ()Ljava/lang/String;
      // 042: new java/util/HashMap
      // 045: dup
      // 046: aload 1
      // 047: bipush 0
      // 048: anewarray 4
      // 04b: invokevirtual rip/breeze/classtransform/ô.method_001 ([Ljava/lang/Object;)Ljava/util/Map;
      // 04e: invokespecial java/util/HashMap.<init> (Ljava/util/Map;)V
      // 051: invokevirtual java/util/HashMap.entrySet ()Ljava/util/Set;
      // 054: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 059: astore 12
      // 05b: astore 13
      // 05d: aload 12
      // 05f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 064: ifeq 141
      // 067: aload 12
      // 069: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06e: checkcast java/util/Map$Entry
      // 071: astore 14
      // 073: aload 14
      // 075: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 07a: checkcast java/lang/String
      // 07d: aload 13
      // 07f: lload 3
      // 080: lconst_0
      // 081: lcmp
      // 082: iflt 08b
      // 085: ifnull 0a9
      // 088: ldc_w "."
      // 08b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 08e: ifeq 09f
      // 091: goto 098
      // 094: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: goto 05d
      // 09b: invokestatic rip/breeze/classtransform/լ.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: aload 14
      // 0a1: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0a6: checkcast java/lang/String
      // 0a9: astore 15
      // 0ab: aload 2
      // 0ac: lload 10
      // 0ae: aload 5
      // 0b0: aload 15
      // 0b2: bipush 3
      // 0b3: anewarray 4
      // 0b6: dup_x1
      // 0b7: swap
      // 0b8: bipush 2
      // 0b9: swap
      // 0ba: aastore
      // 0bb: dup_x1
      // 0bc: swap
      // 0bd: bipush 1
      // 0be: swap
      // 0bf: aastore
      // 0c0: dup_x2
      // 0c1: dup_x2
      // 0c2: pop
      // 0c3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c6: bipush 0
      // 0c7: swap
      // 0c8: aastore
      // 0c9: invokevirtual rip/breeze/classtransform/ժ.method_002 ([Ljava/lang/Object;)Lrip/breeze/classtransform/ը;
      // 0cc: astore 16
      // 0ce: aload 16
      // 0d0: lload 8
      // 0d2: aload 5
      // 0d4: bipush 0
      // 0d5: bipush 3
      // 0d6: anewarray 4
      // 0d9: dup_x1
      // 0da: swap
      // 0db: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0de: bipush 2
      // 0df: swap
      // 0e0: aastore
      // 0e1: dup_x1
      // 0e2: swap
      // 0e3: bipush 1
      // 0e4: swap
      // 0e5: aastore
      // 0e6: dup_x2
      // 0e7: dup_x2
      // 0e8: pop
      // 0e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ec: bipush 0
      // 0ed: swap
      // 0ee: aastore
      // 0ef: invokevirtual rip/breeze/classtransform/ը.method_004 ([Ljava/lang/Object;)Ljava/util/Set;
      // 0f2: invokeinterface java/util/Set.stream ()Ljava/util/stream/Stream; 1
      // 0f7: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/ը.getÉ_ÿ ()Lrip/breeze/inject/é;, (Lrip/breeze/classtransform/ը;)Lrip/breeze/inject/é; ]
      // 0fc: invokeinterface java/util/stream/Stream.map (Ljava/util/function/Function;)Ljava/util/stream/Stream; 2
      // 101: invokestatic java/util/stream/Collectors.toSet ()Ljava/util/stream/Collector;
      // 104: invokeinterface java/util/stream/Stream.collect (Ljava/util/stream/Collector;)Ljava/lang/Object; 2
      // 109: checkcast java/util/Set
      // 10c: astore 17
      // 10e: aload 16
      // 110: invokevirtual rip/breeze/classtransform/ը.getÉ_ÿ ()Lrip/breeze/inject/é;
      // 113: aload 17
      // 115: aload 1
      // 116: lload 6
      // 118: bipush 4
      // 119: anewarray 4
      // 11c: dup_x2
      // 11d: dup_x2
      // 11e: pop
      // 11f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 122: bipush 3
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: bipush 2
      // 128: swap
      // 129: aastore
      // 12a: dup_x1
      // 12b: swap
      // 12c: bipush 1
      // 12d: swap
      // 12e: aastore
      // 12f: dup_x1
      // 130: swap
      // 131: bipush 0
      // 132: swap
      // 133: aastore
      // 134: invokestatic rip/breeze/classtransform/լ.processAll ([Ljava/lang/Object;)V
      // 137: goto 13c
      // 13a: astore 16
      // 13c: aload 13
      // 13e: ifnonnull 05d
      // 141: return
      // try (69 -> 76): 76 java/lang/Throwable
      // try (60 -> 72): 73 java/lang/Throwable
      // try (82 -> 169): 170 java/lang/Throwable
   }

   private static IllegalStateException lambda$fillTransformerSuperMembers_Inner1() {
      long var0 = 104523409336905L;
      return new IllegalStateException(null /* removed */);
   }

   private static List lambda$fillTransformerSuperMembers_Inner0(ù var0) {
      return var0.list_û_2;
   }

   static {
      long var0 = 96310136117096L;
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
      String var6 = "\u0013\u0096È\u000eöôý]-¥\u0001è\u0084÷\u009e¿\u0010f_\u0088\u0092â»\u0001\u009f\u0095ä]R|ù¨\u0002`Uå\u0090bÿ$[@$c\rÐPK\u0002\u0097\nLÅ\u0016\u001db\u0097¿Ñ\u0088T0\u00921\u0094ù zÞ\u009b9¦\u0010±oìK@\u0092òà\u00ad'ûü²ÊT\u008c7ôa\u0095Õ\u0092òÕ#!ûA©Ô«Pi\fÂJZbXéÿKàQ\"¤À_®ÜZ\u000eF\rjÅ!";
      int var7 = "\u0013\u0096È\u000eöôý]-¥\u0001è\u0084÷\u009e¿\u0010f_\u0088\u0092â»\u0001\u009f\u0095ä]R|ù¨\u0002`Uå\u0090bÿ$[@$c\rÐPK\u0002\u0097\nLÅ\u0016\u001db\u0097¿Ñ\u0088T0\u00921\u0094ù zÞ\u009b9¦\u0010±oìK@\u0092òà\u00ad'ûü²ÊT\u008c7ôa\u0095Õ\u0092òÕ#!ûA©Ô«Pi\fÂJZbXéÿKàQ\"¤À_®ÜZ\u000eF\rjÅ!"
         .length();
      char var8 = 16;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_B = var4;
            CONST_C = new String[3];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static Throwable getThrowable(Throwable var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1497;
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
            throw new RuntimeException("rip/breeze/classtransform/լ", var10);
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
         throw new RuntimeException("rip/breeze/classtransform/լ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
