package rip.breeze.classtransform;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
import rip.breeze.inject.ù;

public abstract class ò {
   private final é é_ÿ_2;
   protected final ô ô_þ_2;
   private boolean bool_ý_2;
   private ժ ժ_ü_2;
   private static int[] arr_û_2;
   private static final String[] CONST_C_2;
   private static final String[] CONST_D_2;
   private static final Map CONST_E_2 = new HashMap(13);

   public ò(long param1, é param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/classtransform/ò.encKey_a_2 J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 09: aload 0
      // 0a: invokespecial java/lang/Object.<init> ()V
      // 0d: astore 4
      // 0f: aload 0
      // 10: bipush 0
      // 11: putfield rip/breeze/classtransform/ò.bool_ý_2 Z
      // 14: aload 0
      // 15: aconst_null
      // 16: putfield rip/breeze/classtransform/ò.ժ_ü_2 Lrip/breeze/classtransform/ժ;
      // 19: aload 0
      // 1a: aload 3
      // 1b: putfield rip/breeze/classtransform/ò.é_ÿ_2 Lrip/breeze/classtransform/é;
      // 1e: aload 0
      // 1f: new rip/breeze/classtransform/ô
      // 22: dup
      // 23: invokespecial rip/breeze/classtransform/ô.<init> ()V
      // 26: putfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 29: aload 4
      // 2b: ifnull 47
      // 2e: invokestatic rip/breeze/inject/ջ.method_013 ()Z
      // 31: ifeq 43
      // 34: goto 3b
      // 37: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: bipush 0
      // 3c: goto 44
      // 3f: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: bipush 1
      // 44: invokestatic rip/breeze/inject/ջ.method_011 (Z)V
      // 47: return
      // try (8 -> 26): 27 java/lang/RuntimeException
      // try (24 -> 31): 31 java/lang/RuntimeException
   }

   public final synchronized void invoke_2(Object[] param1) {
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
      // 0c: getstatic rip/breeze/classtransform/ò.encKey_a_2 J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 87681481354575
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 1e: astore 6
      // 20: aload 0
      // 21: aload 6
      // 23: ifnonnull 4c
      // 26: getfield rip/breeze/classtransform/ò.bool_ý_2 Z
      // 29: ifeq 38
      // 2c: goto 33
      // 2f: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: return
      // 34: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 0
      // 39: lload 4
      // 3b: bipush 1
      // 3c: anewarray 4
      // 3f: dup_x2
      // 40: dup_x2
      // 41: pop
      // 42: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 45: bipush 0
      // 46: swap
      // 47: aastore
      // 48: invokevirtual rip/breeze/classtransform/ò.method_001 ([Ljava/lang/Object;)V
      // 4b: aload 0
      // 4c: bipush 1
      // 4d: putfield rip/breeze/classtransform/ò.bool_ý_2 Z
      // 50: goto 6c
      // 53: astore 7
      // 55: new java/lang/RuntimeException
      // 58: dup
      // 59: sipush 18902
      // 5c: ldc2_w 1572932891146025276
      // 5f: lload 2
      // 60: lxor
      // 61: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: aload 7
      // 68: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 6b: athrow
      // 6c: return
      // try (23 -> 29): 29 java/lang/Throwable
      // try (20 -> 25): 26 java/lang/Throwable
      // try (31 -> 46): 47 java/lang/Throwable
   }

   public final String invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 120308871307880L;
      return MathUtil3.buildString(new Object[]{this.ô_þ_2.ý(new Object[]{var5, MathUtil3.buildString_2(new Object[]{var4})})});
   }

   @Deprecated
   public final rip.breeze.inject.é invoke_4(Object[] param1) {
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
      // 04: checkcast rip/breeze/classtransform/ժ
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast rip/breeze/classtransform/է
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast rip/breeze/inject/é
      // 20: astore 6
      // 22: dup
      // 23: bipush 4
      // 24: aaload
      // 25: checkcast rip/breeze/inject/é
      // 28: astore 7
      // 2a: pop
      // 2b: getstatic rip/breeze/classtransform/ò.encKey_a_2 J
      // 2e: lload 4
      // 30: lxor
      // 31: lstore 4
      // 33: lload 4
      // 35: dup2
      // 36: ldc2_w 6701895567087
      // 39: lxor
      // 3a: lstore 8
      // 3c: dup2
      // 3d: ldc2_w 56281069591708
      // 40: lxor
      // 41: lstore 10
      // 43: pop2
      // 44: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 47: aconst_null
      // 48: astore 12
      // 4a: astore 13
      // 4c: ldc rip/breeze/classtransform/ժ
      // 4e: ldc "þ"
      // 50: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 53: astore 14
      // 55: aload 14
      // 57: bipush 1
      // 58: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 5b: aload 14
      // 5d: aload 2
      // 5e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 61: checkcast rip/breeze/classtransform/ó
      // 64: astore 12
      // 66: aload 12
      // 68: aload 13
      // 6a: ifnonnull 88
      // 6d: ifnonnull a1
      // 70: goto 77
      // 73: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: new rip/breeze/classtransform/ó
      // 7a: dup
      // 7b: aload 3
      // 7c: lload 10
      // 7e: invokespecial rip/breeze/classtransform/ó.<init> (Lrip/breeze/classtransform/է;J)V
      // 81: goto 88
      // 84: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: astore 12
      // 8a: ldc rip/breeze/classtransform/ó
      // 8c: ldc "ÿ"
      // 8e: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 91: astore 14
      // 93: aload 14
      // 95: bipush 1
      // 96: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 99: aload 14
      // 9b: aload 12
      // 9d: aload 2
      // 9e: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // a1: goto b4
      // a4: astore 14
      // a6: aload 14
      // a8: bipush 1
      // a9: anewarray 4
      // ac: dup_x1
      // ad: swap
      // ae: bipush 0
      // af: swap
      // b0: aastore
      // b1: invokestatic rip/breeze/classtransform/ս.method_001 ([Ljava/lang/Object;)V
      // b4: aload 0
      // b5: lload 8
      // b7: aload 12
      // b9: aload 6
      // bb: aload 7
      // bd: bipush 4
      // be: anewarray 4
      // c1: dup_x1
      // c2: swap
      // c3: bipush 3
      // c4: swap
      // c5: aastore
      // c6: dup_x1
      // c7: swap
      // c8: bipush 2
      // c9: swap
      // ca: aastore
      // cb: dup_x1
      // cc: swap
      // cd: bipush 1
      // ce: swap
      // cf: aastore
      // d0: dup_x2
      // d1: dup_x2
      // d2: pop
      // d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d6: bipush 0
      // d7: swap
      // d8: aastore
      // d9: invokevirtual rip/breeze/classtransform/ò.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/é;
      // dc: areturn
      // try (61 -> 70): 71 java/lang/ReflectiveOperationException
      // try (58 -> 62): 63 java/lang/ReflectiveOperationException
      // try (46 -> 85): 86 java/lang/ReflectiveOperationException
   }

   public final rip.breeze.inject.é invoke_5(Object[] param1) {
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
      // 00e: checkcast rip/breeze/classtransform/ó
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast rip/breeze/inject/é
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast rip/breeze/inject/é
      // 021: astore 6
      // 023: pop
      // 024: getstatic rip/breeze/classtransform/ò.encKey_a_2 J
      // 027: lload 2
      // 028: lxor
      // 029: lstore 2
      // 02a: lload 2
      // 02b: dup2
      // 02c: ldc2_w 104456967727191
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 97539707384050
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 83011141451986
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 78957271696541
      // 044: lxor
      // 045: lstore 13
      // 047: dup2
      // 048: ldc2_w 59666723446838
      // 04b: lxor
      // 04c: lstore 15
      // 04e: dup2
      // 04f: ldc2_w 17046234805856
      // 052: lxor
      // 053: lstore 17
      // 055: dup2
      // 056: ldc2_w 32647714549840
      // 059: lxor
      // 05a: lstore 19
      // 05c: dup2
      // 05d: ldc2_w 23342908737497
      // 060: lxor
      // 061: lstore 21
      // 063: pop2
      // 064: aload 0
      // 065: aload 4
      // 067: lload 7
      // 069: aload 6
      // 06b: bipush 3
      // 06c: anewarray 4
      // 06f: dup_x1
      // 070: swap
      // 071: bipush 2
      // 072: swap
      // 073: aastore
      // 074: dup_x2
      // 075: dup_x2
      // 076: pop
      // 077: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07a: bipush 1
      // 07b: swap
      // 07c: aastore
      // 07d: dup_x1
      // 07e: swap
      // 07f: bipush 0
      // 080: swap
      // 081: aastore
      // 082: invokespecial rip/breeze/classtransform/ò.method_010 ([Ljava/lang/Object;)V
      // 085: new java/util/ArrayList
      // 088: dup
      // 089: invokespecial java/util/ArrayList.<init> ()V
      // 08c: astore 23
      // 08e: aload 0
      // 08f: aload 6
      // 091: aload 6
      // 093: getfield rip/breeze/inject/é.list_ï_2 Ljava/util/List;
      // 096: lload 21
      // 098: aload 23
      // 09a: bipush 4
      // 09b: anewarray 4
      // 09e: dup_x1
      // 09f: swap
      // 0a0: bipush 3
      // 0a1: swap
      // 0a2: aastore
      // 0a3: dup_x2
      // 0a4: dup_x2
      // 0a5: pop
      // 0a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a9: bipush 2
      // 0aa: swap
      // 0ab: aastore
      // 0ac: dup_x1
      // 0ad: swap
      // 0ae: bipush 1
      // 0af: swap
      // 0b0: aastore
      // 0b1: dup_x1
      // 0b2: swap
      // 0b3: bipush 0
      // 0b4: swap
      // 0b5: aastore
      // 0b6: invokespecial rip/breeze/classtransform/ò.method_014 ([Ljava/lang/Object;)V
      // 0b9: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 0bc: aload 0
      // 0bd: aload 6
      // 0bf: aload 6
      // 0c1: getfield rip/breeze/inject/é.list_î_2 Ljava/util/List;
      // 0c4: lload 21
      // 0c6: aload 23
      // 0c8: bipush 4
      // 0c9: anewarray 4
      // 0cc: dup_x1
      // 0cd: swap
      // 0ce: bipush 3
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x2
      // 0d2: dup_x2
      // 0d3: pop
      // 0d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7: bipush 2
      // 0d8: swap
      // 0d9: aastore
      // 0da: dup_x1
      // 0db: swap
      // 0dc: bipush 1
      // 0dd: swap
      // 0de: aastore
      // 0df: dup_x1
      // 0e0: swap
      // 0e1: bipush 0
      // 0e2: swap
      // 0e3: aastore
      // 0e4: invokespecial rip/breeze/classtransform/ò.method_014 ([Ljava/lang/Object;)V
      // 0e7: aload 6
      // 0e9: getfield rip/breeze/inject/é.list_å_2 Ljava/util/List;
      // 0ec: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0f1: astore 24
      // 0f3: astore 25
      // 0f5: aload 24
      // 0f7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0fc: ifeq 17e
      // 0ff: aload 24
      // 101: lload 2
      // 102: lconst_0
      // 103: lcmp
      // 104: iflt 18c
      // 107: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 10c: checkcast rip/breeze/inject/á
      // 10f: astore 26
      // 111: aload 0
      // 112: aload 26
      // 114: aload 26
      // 116: getfield rip/breeze/inject/á.list_ø_2 Ljava/util/List;
      // 119: lload 21
      // 11b: aload 23
      // 11d: bipush 4
      // 11e: anewarray 4
      // 121: dup_x1
      // 122: swap
      // 123: bipush 3
      // 124: swap
      // 125: aastore
      // 126: dup_x2
      // 127: dup_x2
      // 128: pop
      // 129: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12c: bipush 2
      // 12d: swap
      // 12e: aastore
      // 12f: dup_x1
      // 130: swap
      // 131: bipush 1
      // 132: swap
      // 133: aastore
      // 134: dup_x1
      // 135: swap
      // 136: bipush 0
      // 137: swap
      // 138: aastore
      // 139: invokespecial rip/breeze/classtransform/ò.method_014 ([Ljava/lang/Object;)V
      // 13c: aload 0
      // 13d: aload 26
      // 13f: aload 26
      // 141: getfield rip/breeze/inject/á.list_ö_2 Ljava/util/List;
      // 144: lload 21
      // 146: aload 23
      // 148: bipush 4
      // 149: anewarray 4
      // 14c: dup_x1
      // 14d: swap
      // 14e: bipush 3
      // 14f: swap
      // 150: aastore
      // 151: dup_x2
      // 152: dup_x2
      // 153: pop
      // 154: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 157: bipush 2
      // 158: swap
      // 159: aastore
      // 15a: dup_x1
      // 15b: swap
      // 15c: bipush 1
      // 15d: swap
      // 15e: aastore
      // 15f: dup_x1
      // 160: swap
      // 161: bipush 0
      // 162: swap
      // 163: aastore
      // 164: invokespecial rip/breeze/classtransform/ò.method_014 ([Ljava/lang/Object;)V
      // 167: aload 25
      // 169: ifnonnull 18a
      // 16c: aload 25
      // 16e: ifnull 0f5
      // 171: lload 2
      // 172: lconst_0
      // 173: lcmp
      // 174: iflt 167
      // 177: goto 17e
      // 17a: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17d: athrow
      // 17e: aload 6
      // 180: getfield rip/breeze/inject/é.list_ä_2 Ljava/util/List;
      // 183: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 188: astore 24
      // 18a: aload 24
      // 18c: lload 2
      // 18d: lconst_0
      // 18e: lcmp
      // 18f: iflt 220
      // 192: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 197: ifeq 219
      // 19a: aload 24
      // 19c: lload 2
      // 19d: lconst_0
      // 19e: lcmp
      // 19f: ifle 224
      // 1a2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a7: checkcast rip/breeze/inject/BreezeClass12
      // 1aa: astore 26
      // 1ac: aload 0
      // 1ad: aload 26
      // 1af: aload 26
      // 1b1: getfield rip/breeze/inject/BreezeClass12.list_ô Ljava/util/List;
      // 1b4: lload 21
      // 1b6: aload 23
      // 1b8: bipush 4
      // 1b9: anewarray 4
      // 1bc: dup_x1
      // 1bd: swap
      // 1be: bipush 3
      // 1bf: swap
      // 1c0: aastore
      // 1c1: dup_x2
      // 1c2: dup_x2
      // 1c3: pop
      // 1c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c7: bipush 2
      // 1c8: swap
      // 1c9: aastore
      // 1ca: dup_x1
      // 1cb: swap
      // 1cc: bipush 1
      // 1cd: swap
      // 1ce: aastore
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: bipush 0
      // 1d2: swap
      // 1d3: aastore
      // 1d4: invokespecial rip/breeze/classtransform/ò.method_014 ([Ljava/lang/Object;)V
      // 1d7: aload 0
      // 1d8: aload 26
      // 1da: aload 26
      // 1dc: getfield rip/breeze/inject/BreezeClass12.list_ó Ljava/util/List;
      // 1df: lload 21
      // 1e1: aload 23
      // 1e3: bipush 4
      // 1e4: anewarray 4
      // 1e7: dup_x1
      // 1e8: swap
      // 1e9: bipush 3
      // 1ea: swap
      // 1eb: aastore
      // 1ec: dup_x2
      // 1ed: dup_x2
      // 1ee: pop
      // 1ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f2: bipush 2
      // 1f3: swap
      // 1f4: aastore
      // 1f5: dup_x1
      // 1f6: swap
      // 1f7: bipush 1
      // 1f8: swap
      // 1f9: aastore
      // 1fa: dup_x1
      // 1fb: swap
      // 1fc: bipush 0
      // 1fd: swap
      // 1fe: aastore
      // 1ff: invokespecial rip/breeze/classtransform/ò.method_014 ([Ljava/lang/Object;)V
      // 202: aload 25
      // 204: ifnonnull 222
      // 207: aload 25
      // 209: ifnull 18a
      // 20c: lload 2
      // 20d: lconst_0
      // 20e: lcmp
      // 20f: ifle 219
      // 212: goto 219
      // 215: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 218: athrow
      // 219: aload 23
      // 21b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 220: astore 24
      // 222: aload 24
      // 224: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 229: lload 2
      // 22a: lconst_0
      // 22b: lcmp
      // 22c: ifle 3a2
      // 22f: ifeq 395
      // 232: aload 24
      // 234: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 239: checkcast rip/breeze/classtransform/ë
      // 23c: astore 26
      // 23e: aload 26
      // 240: bipush 1
      // 241: anewarray 4
      // 244: dup_x1
      // 245: swap
      // 246: bipush 0
      // 247: swap
      // 248: aastore
      // 249: invokestatic rip/breeze/classtransform/ë.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ù;
      // 24c: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 24f: lload 17
      // 251: dup2_x1
      // 252: pop2
      // 253: bipush 2
      // 254: anewarray 4
      // 257: dup_x1
      // 258: swap
      // 259: bipush 1
      // 25a: swap
      // 25b: aastore
      // 25c: dup_x2
      // 25d: dup_x2
      // 25e: pop
      // 25f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 262: bipush 0
      // 263: swap
      // 264: aastore
      // 265: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 268: lload 19
      // 26a: bipush 1
      // 26b: anewarray 4
      // 26e: dup_x2
      // 26f: dup_x2
      // 270: pop
      // 271: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 274: bipush 0
      // 275: swap
      // 276: aastore
      // 277: invokevirtual rip/breeze/inject/MathUtil3.buildString_2 ([Ljava/lang/Object;)Ljava/lang/String;
      // 27a: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 27d: astore 27
      // 27f: lload 2
      // 280: lconst_0
      // 281: lcmp
      // 282: iflt 3cc
      // 285: aload 25
      // 287: ifnonnull 3cc
      // 28a: goto 296
      // 28d: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 290: athrow
      // 291: astore 28
      // 293: goto 222
      // 296: aload 26
      // 298: bipush 1
      // 299: anewarray 4
      // 29c: dup_x1
      // 29d: swap
      // 29e: bipush 0
      // 29f: swap
      // 2a0: aastore
      // 2a1: invokestatic rip/breeze/classtransform/ë.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ù;
      // 2a4: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 2a7: lload 9
      // 2a9: bipush 2
      // 2aa: anewarray 4
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
      // 2bb: invokestatic rip/breeze/classtransform/չ.method_001 ([Ljava/lang/Object;)Ljava/util/Map;
      // 2be: astore 28
      // 2c0: aload 0
      // 2c1: aload 26
      // 2c3: bipush 1
      // 2c4: anewarray 4
      // 2c7: dup_x1
      // 2c8: swap
      // 2c9: bipush 0
      // 2ca: swap
      // 2cb: aastore
      // 2cc: invokestatic rip/breeze/classtransform/ë.method_002 ([Ljava/lang/Object;)Ljava/lang/Object;
      // 2cf: aload 27
      // 2d1: lload 15
      // 2d3: aload 28
      // 2d5: aload 4
      // 2d7: aload 5
      // 2d9: aload 6
      // 2db: bipush 7
      // 2dd: anewarray 4
      // 2e0: dup_x1
      // 2e1: swap
      // 2e2: bipush 6
      // 2e4: swap
      // 2e5: aastore
      // 2e6: dup_x1
      // 2e7: swap
      // 2e8: bipush 5
      // 2e9: swap
      // 2ea: aastore
      // 2eb: dup_x1
      // 2ec: swap
      // 2ed: bipush 4
      // 2ee: swap
      // 2ef: aastore
      // 2f0: dup_x1
      // 2f1: swap
      // 2f2: bipush 3
      // 2f3: swap
      // 2f4: aastore
      // 2f5: dup_x2
      // 2f6: dup_x2
      // 2f7: pop
      // 2f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2fb: bipush 2
      // 2fc: swap
      // 2fd: aastore
      // 2fe: dup_x1
      // 2ff: swap
      // 300: bipush 1
      // 301: swap
      // 302: aastore
      // 303: dup_x1
      // 304: swap
      // 305: bipush 0
      // 306: swap
      // 307: aastore
      // 308: invokespecial rip/breeze/classtransform/ò.method_012 ([Ljava/lang/Object;)V
      // 30b: aload 26
      // 30d: bipush 1
      // 30e: anewarray 4
      // 311: dup_x1
      // 312: swap
      // 313: bipush 0
      // 314: swap
      // 315: aastore
      // 316: invokestatic rip/breeze/classtransform/ë.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ù;
      // 319: lload 11
      // 31b: aload 28
      // 31d: bipush 2
      // 31e: anewarray 4
      // 321: dup_x1
      // 322: swap
      // 323: bipush 1
      // 324: swap
      // 325: aastore
      // 326: dup_x2
      // 327: dup_x2
      // 328: pop
      // 329: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32c: bipush 0
      // 32d: swap
      // 32e: aastore
      // 32f: invokestatic rip/breeze/classtransform/չ.method_002 ([Ljava/lang/Object;)Ljava/util/List;
      // 332: putfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 335: goto 390
      // 338: astore 28
      // 33a: new java/lang/RuntimeException
      // 33d: dup
      // 33e: new java/lang/StringBuilder
      // 341: dup
      // 342: invokespecial java/lang/StringBuilder.<init> ()V
      // 345: sipush 16858
      // 348: ldc2_w 6408773537021605587
      // 34b: lload 2
      // 34c: lxor
      // 34d: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 352: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 355: aload 26
      // 357: bipush 1
      // 358: anewarray 4
      // 35b: dup_x1
      // 35c: swap
      // 35d: bipush 0
      // 35e: swap
      // 35f: aastore
      // 360: invokestatic rip/breeze/classtransform/ë.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ù;
      // 363: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 366: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 369: sipush 28613
      // 36c: ldc2_w 3137597383693408463
      // 36f: lload 2
      // 370: lxor
      // 371: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 376: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 379: aload 6
      // 37b: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 37e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 381: ldc_w "'"
      // 384: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 387: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 38a: aload 28
      // 38c: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 38f: athrow
      // 390: aload 25
      // 392: ifnull 222
      // 395: aload 0
      // 396: getfield rip/breeze/classtransform/ò.é_ÿ_2 Lrip/breeze/classtransform/é;
      // 399: getfield rip/breeze/classtransform/é.bool_ý_2 Z
      // 39c: lload 2
      // 39d: lconst_0
      // 39e: lcmp
      // 39f: ifle 229
      // 3a2: ifeq 3cc
      // 3a5: aload 6
      // 3a7: aload 0
      // 3a8: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 3ab: lload 13
      // 3ad: bipush 3
      // 3ae: anewarray 4
      // 3b1: dup_x2
      // 3b2: dup_x2
      // 3b3: pop
      // 3b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b7: bipush 2
      // 3b8: swap
      // 3b9: aastore
      // 3ba: dup_x1
      // 3bb: swap
      // 3bc: bipush 1
      // 3bd: swap
      // 3be: aastore
      // 3bf: dup_x1
      // 3c0: swap
      // 3c1: bipush 0
      // 3c2: swap
      // 3c3: aastore
      // 3c4: invokestatic rip/breeze/classtransform/խ.method_006 ([Ljava/lang/Object;)Lrip/breeze/inject/é;
      // 3c7: areturn
      // 3c8: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cb: athrow
      // 3cc: aload 6
      // 3ce: invokestatic rip/breeze/inject/ջ.method_012 ()Z
      // 3d1: lload 2
      // 3d2: lconst_0
      // 3d3: lcmp
      // 3d4: ifle 3db
      // 3d7: ifeq 3e7
      // 3da: bipush 2
      // 3db: newarray 10
      // 3dd: invokestatic rip/breeze/classtransform/ò.method_015 ([I)V
      // 3e0: goto 3e7
      // 3e3: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e6: athrow
      // 3e7: areturn
      // try (260 -> 326): 331 java/lang/ClassNotFoundException
      // try (168 -> 234): 239 java/lang/ClassNotFoundException
      // try (347 -> 388): 397 java/lang/ClassNotFoundException
      // try (388 -> 395): 395 java/lang/ClassNotFoundException
      // try (399 -> 509): 510 java/lang/ClassNotFoundException
      // try (550 -> 583): 583 java/lang/ClassNotFoundException
      // try (585 -> 595): 596 java/lang/ClassNotFoundException
   }

   public ô invoke_6(Object[] var1) {
      return this.ô_þ_2;
   }

   protected abstract void invoke_1(Object[] var1) throws Throwable;

   protected List invoke_7(Object[] var1) throws IOException {
      long var2 = (Long)var1[0];
      File var4 = (File)var1[1];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 42939154807911L;
      return this.method_008(new Object[]{new FileInputStream(var4), var5});
   }

   protected List invoke_8(Object[] param1) throws IOException {
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
      // 04: checkcast java/io/InputStream
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic rip/breeze/classtransform/ò.encKey_a_2 J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: new java/io/BufferedReader
      // 1c: dup
      // 1d: new java/io/InputStreamReader
      // 20: dup
      // 21: aload 2
      // 22: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 25: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 28: astore 5
      // 2a: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 2d: aconst_null
      // 2e: astore 6
      // 30: astore 7
      // 32: aload 5
      // 34: invokevirtual java/io/BufferedReader.lines ()Ljava/util/stream/Stream;
      // 37: invokestatic java/util/stream/Collectors.toList ()Ljava/util/stream/Collector;
      // 3a: invokeinterface java/util/stream/Stream.collect (Ljava/util/stream/Collector;)Ljava/lang/Object; 2
      // 3f: checkcast java/util/List
      // 42: astore 8
      // 44: aload 5
      // 46: ifnull 7d
      // 49: aload 6
      // 4b: ifnull 71
      // 4e: goto 55
      // 51: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 5
      // 57: invokevirtual java/io/BufferedReader.close ()V
      // 5a: goto 7d
      // 5d: astore 9
      // 5f: aload 6
      // 61: aload 9
      // 63: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 66: lload 3
      // 67: lconst_0
      // 68: lcmp
      // 69: iflt 76
      // 6c: aload 7
      // 6e: ifnull 7d
      // 71: aload 5
      // 73: invokevirtual java/io/BufferedReader.close ()V
      // 76: goto 7d
      // 79: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: aload 8
      // 7f: areturn
      // 80: astore 8
      // 82: aload 8
      // 84: astore 6
      // 86: aload 8
      // 88: athrow
      // 89: astore 10
      // 8b: aload 5
      // 8d: ifnull c4
      // 90: aload 6
      // 92: ifnull b8
      // 95: goto 9c
      // 98: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: aload 5
      // 9e: invokevirtual java/io/BufferedReader.close ()V
      // a1: goto c4
      // a4: astore 11
      // a6: aload 6
      // a8: lload 3
      // a9: lconst_0
      // aa: lcmp
      // ab: ifle c6
      // ae: aload 11
      // b0: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // b3: aload 7
      // b5: ifnull c4
      // b8: aload 5
      // ba: invokevirtual java/io/BufferedReader.close ()V
      // bd: goto c4
      // c0: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c3: athrow
      // c4: aload 10
      // c6: athrow
      // try (42 -> 44): 45 java/lang/Throwable
      // try (29 -> 35): 62 java/lang/Throwable
      // try (29 -> 35): 67 null
      // try (46 -> 57): 58 java/lang/Throwable
      // try (35 -> 39): 40 java/lang/Throwable
      // try (75 -> 77): 78 java/lang/Throwable
      // try (62 -> 68): 67 null
      // try (68 -> 72): 73 java/lang/Throwable
      // try (79 -> 90): 91 java/lang/Throwable
   }

   private ժ invoke_9(Object[] param1) {
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
      // 0e: checkcast rip/breeze/classtransform/ó
      // 11: astore 4
      // 13: pop
      // 14: getstatic rip/breeze/classtransform/ò.encKey_a_2 J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 31262711623201
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 26: astore 7
      // 28: aload 4
      // 2a: getfield rip/breeze/classtransform/ó.ժ_ÿ_2 Lrip/breeze/classtransform/ժ;
      // 2d: aload 7
      // 2f: ifnonnull 5c
      // 32: lload 5
      // 34: bipush 1
      // 35: anewarray 4
      // 38: dup_x2
      // 39: dup_x2
      // 3a: pop
      // 3b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e: bipush 0
      // 3f: swap
      // 40: aastore
      // 41: invokevirtual rip/breeze/classtransform/ժ.method_001 ([Ljava/lang/Object;)Z
      // 44: ifne 58
      // 47: goto 4e
      // 4a: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: aload 4
      // 50: getfield rip/breeze/classtransform/ó.ժ_ÿ_2 Lrip/breeze/classtransform/ժ;
      // 53: areturn
      // 54: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: aload 0
      // 59: getfield rip/breeze/classtransform/ò.ժ_ü_2 Lrip/breeze/classtransform/ժ;
      // 5c: aload 7
      // 5e: ifnonnull 81
      // 61: ifnonnull 7d
      // 64: goto 6b
      // 67: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: aload 0
      // 6c: new rip/breeze/classtransform/ժ
      // 6f: dup
      // 70: invokespecial rip/breeze/classtransform/ժ.<init> ()V
      // 73: putfield rip/breeze/classtransform/ò.ժ_ü_2 Lrip/breeze/classtransform/ժ;
      // 76: goto 7d
      // 79: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: aload 0
      // 7e: getfield rip/breeze/classtransform/ò.ժ_ü_2 Lrip/breeze/classtransform/ժ;
      // 81: areturn
      // try (25 -> 41): 42 java/lang/RuntimeException
      // try (29 -> 47): 47 java/lang/RuntimeException
      // try (51 -> 54): 55 java/lang/RuntimeException
      // try (53 -> 62): 63 java/lang/RuntimeException
   }

   private void invoke_10(Object[] param1) {
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
      // 004: checkcast rip/breeze/classtransform/ó
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
      // 01a: pop
      // 01b: getstatic rip/breeze/classtransform/ò.encKey_a_2 J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 91057844306721
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 8071307639993
      // 02d: lxor
      // 02e: dup2
      // 02f: bipush 48
      // 031: lushr
      // 032: l2i
      // 033: istore 8
      // 035: dup2
      // 036: bipush 16
      // 038: lshl
      // 039: bipush 32
      // 03b: lushr
      // 03c: l2i
      // 03d: istore 9
      // 03f: dup2
      // 040: bipush 48
      // 042: lshl
      // 043: bipush 48
      // 045: lushr
      // 046: l2i
      // 047: istore 10
      // 049: pop2
      // 04a: dup2
      // 04b: ldc2_w 121511984370920
      // 04e: lxor
      // 04f: lstore 11
      // 051: pop2
      // 052: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 055: astore 13
      // 057: aload 13
      // 059: ifnonnull 0d8
      // 05c: aload 0
      // 05d: getfield rip/breeze/classtransform/ò.é_ÿ_2 Lrip/breeze/classtransform/é;
      // 060: getfield rip/breeze/classtransform/é.bool_ÿ_2 Z
      // 063: lload 3
      // 064: lconst_0
      // 065: lcmp
      // 066: iflt 07b
      // 069: ifne 078
      // 06c: goto 073
      // 06f: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: return
      // 074: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: iload 8
      // 07a: i2c
      // 07b: iload 9
      // 07d: aload 5
      // 07f: aload 0
      // 080: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 083: aload 0
      // 084: lload 6
      // 086: aload 2
      // 087: bipush 2
      // 088: anewarray 4
      // 08b: dup_x1
      // 08c: swap
      // 08d: bipush 1
      // 08e: swap
      // 08f: aastore
      // 090: dup_x2
      // 091: dup_x2
      // 092: pop
      // 093: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 096: bipush 0
      // 097: swap
      // 098: aastore
      // 099: invokespecial rip/breeze/classtransform/ò.method_009 ([Ljava/lang/Object;)Lrip/breeze/classtransform/ժ;
      // 09c: iload 10
      // 09e: swap
      // 09f: aload 2
      // 0a0: getfield rip/breeze/classtransform/ó.է_þ_2 Lrip/breeze/classtransform/է;
      // 0a3: bipush 7
      // 0a5: anewarray 4
      // 0a8: dup_x1
      // 0a9: swap
      // 0aa: bipush 6
      // 0ac: swap
      // 0ad: aastore
      // 0ae: dup_x1
      // 0af: swap
      // 0b0: bipush 5
      // 0b1: swap
      // 0b2: aastore
      // 0b3: dup_x1
      // 0b4: swap
      // 0b5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b8: bipush 4
      // 0b9: swap
      // 0ba: aastore
      // 0bb: dup_x1
      // 0bc: swap
      // 0bd: bipush 3
      // 0be: swap
      // 0bf: aastore
      // 0c0: dup_x1
      // 0c1: swap
      // 0c2: bipush 2
      // 0c3: swap
      // 0c4: aastore
      // 0c5: dup_x1
      // 0c6: swap
      // 0c7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ca: bipush 1
      // 0cb: swap
      // 0cc: aastore
      // 0cd: dup_x1
      // 0ce: swap
      // 0cf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d2: bipush 0
      // 0d3: swap
      // 0d4: aastore
      // 0d5: invokestatic rip/breeze/classtransform/լ.calculate ([Ljava/lang/Object;)V
      // 0d8: goto 1c6
      // 0db: astore 14
      // 0dd: getstatic rip/breeze/classtransform/ú.CONTINUE Lrip/breeze/classtransform/ú;
      // 0e0: aload 0
      // 0e1: getfield rip/breeze/classtransform/ò.é_ÿ_2 Lrip/breeze/classtransform/é;
      // 0e4: getfield rip/breeze/classtransform/é.ú_þ_2 Lrip/breeze/classtransform/ú;
      // 0e7: invokevirtual rip/breeze/classtransform/ú.equals (Ljava/lang/Object;)Z
      // 0ea: aload 13
      // 0ec: lload 3
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: ifle 15d
      // 0f2: ifnonnull 15b
      // 0f5: ifeq 147
      // 0f8: goto 0ff
      // 0fb: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: sipush 21391
      // 102: ldc2_w 7020283325730331815
      // 105: lload 3
      // 106: lxor
      // 107: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: bipush 2
      // 10d: anewarray 4
      // 110: dup
      // 111: bipush 0
      // 112: aload 5
      // 114: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 117: aastore
      // 118: dup
      // 119: bipush 1
      // 11a: aload 14
      // 11c: aastore
      // 11d: lload 11
      // 11f: dup2_x1
      // 120: pop2
      // 121: bipush 3
      // 122: anewarray 4
      // 125: dup_x1
      // 126: swap
      // 127: bipush 2
      // 128: swap
      // 129: aastore
      // 12a: dup_x2
      // 12b: dup_x2
      // 12c: pop
      // 12d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 130: bipush 1
      // 131: swap
      // 132: aastore
      // 133: dup_x1
      // 134: swap
      // 135: bipush 0
      // 136: swap
      // 137: aastore
      // 138: invokestatic rip/breeze/classtransform/հ.method_002 ([Ljava/lang/Object;)V
      // 13b: aload 13
      // 13d: ifnull 1c6
      // 140: goto 147
      // 143: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 146: athrow
      // 147: getstatic rip/breeze/classtransform/ú.CANCEL Lrip/breeze/classtransform/ú;
      // 14a: aload 0
      // 14b: getfield rip/breeze/classtransform/ò.é_ÿ_2 Lrip/breeze/classtransform/é;
      // 14e: getfield rip/breeze/classtransform/é.ú_þ_2 Lrip/breeze/classtransform/ú;
      // 151: invokevirtual rip/breeze/classtransform/ú.equals (Ljava/lang/Object;)Z
      // 154: goto 15b
      // 157: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15a: athrow
      // 15b: aload 13
      // 15d: lload 3
      // 15e: lconst_0
      // 15f: lcmp
      // 160: iflt 1b5
      // 163: ifnonnull 1b3
      // 166: ifeq 1a6
      // 169: goto 170
      // 16c: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16f: athrow
      // 170: new java/lang/RuntimeException
      // 173: dup
      // 174: new java/lang/StringBuilder
      // 177: dup
      // 178: invokespecial java/lang/StringBuilder.<init> ()V
      // 17b: sipush 23555
      // 17e: ldc2_w 719712266210415392
      // 181: lload 3
      // 182: lxor
      // 183: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18b: aload 5
      // 18d: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 190: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 193: ldc_w "'"
      // 196: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 199: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19c: aload 14
      // 19e: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1a1: athrow
      // 1a2: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a5: athrow
      // 1a6: getstatic rip/breeze/classtransform/ú.EXIT Lrip/breeze/classtransform/ú;
      // 1a9: aload 0
      // 1aa: getfield rip/breeze/classtransform/ò.é_ÿ_2 Lrip/breeze/classtransform/é;
      // 1ad: getfield rip/breeze/classtransform/é.ú_þ_2 Lrip/breeze/classtransform/ú;
      // 1b0: invokevirtual rip/breeze/classtransform/ú.equals (Ljava/lang/Object;)Z
      // 1b3: aload 13
      // 1b5: ifnonnull 1c3
      // 1b8: ifeq 1c6
      // 1bb: goto 1c2
      // 1be: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c1: athrow
      // 1c2: bipush -1
      // 1c3: invokestatic java/lang/System.exit (I)V
      // 1c6: return
      // try (59 -> 71): 71 java/lang/Throwable
      // try (57 -> 67): 68 java/lang/Throwable
      // try (73 -> 142): 143 java/lang/Throwable
      // try (144 -> 156): 157 java/lang/Throwable
      // try (155 -> 200): 201 java/lang/Throwable
      // try (159 -> 208): 209 java/lang/Throwable
      // try (211 -> 218): 219 java/lang/Throwable
      // try (217 -> 241): 241 java/lang/Throwable
      // try (248 -> 251): 252 java/lang/Throwable
   }

   private void invoke_11(Object[] param1) {
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
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast rip/breeze/classtransform/ó
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic rip/breeze/classtransform/ò.encKey_a_2 J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 46705872992708
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 63115791842032
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 5729260334393
      // 035: lxor
      // 036: lstore 10
      // 038: pop2
      // 039: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 03c: astore 12
      // 03e: aload 12
      // 040: ifnonnull 0a6
      // 043: aload 0
      // 044: getfield rip/breeze/classtransform/ò.é_ÿ_2 Lrip/breeze/classtransform/é;
      // 047: getfield rip/breeze/classtransform/é.bool_ÿ_2 Z
      // 04a: ifne 059
      // 04d: goto 054
      // 050: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: return
      // 055: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: aload 4
      // 05b: aload 0
      // 05c: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 05f: lload 6
      // 061: dup2_x1
      // 062: pop2
      // 063: aload 0
      // 064: lload 8
      // 066: aload 5
      // 068: bipush 2
      // 069: anewarray 4
      // 06c: dup_x1
      // 06d: swap
      // 06e: bipush 1
      // 06f: swap
      // 070: aastore
      // 071: dup_x2
      // 072: dup_x2
      // 073: pop
      // 074: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 077: bipush 0
      // 078: swap
      // 079: aastore
      // 07a: invokespecial rip/breeze/classtransform/ò.method_009 ([Ljava/lang/Object;)Lrip/breeze/classtransform/ժ;
      // 07d: aload 5
      // 07f: getfield rip/breeze/classtransform/ó.է_þ_2 Lrip/breeze/classtransform/է;
      // 082: bipush 5
      // 083: anewarray 4
      // 086: dup_x1
      // 087: swap
      // 088: bipush 4
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: bipush 3
      // 08e: swap
      // 08f: aastore
      // 090: dup_x1
      // 091: swap
      // 092: bipush 2
      // 093: swap
      // 094: aastore
      // 095: dup_x2
      // 096: dup_x2
      // 097: pop
      // 098: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09b: bipush 1
      // 09c: swap
      // 09d: aastore
      // 09e: dup_x1
      // 09f: swap
      // 0a0: bipush 0
      // 0a1: swap
      // 0a2: aastore
      // 0a3: invokestatic rip/breeze/classtransform/լ.method_002 ([Ljava/lang/Object;)V
      // 0a6: goto 18e
      // 0a9: astore 13
      // 0ab: getstatic rip/breeze/classtransform/ú.CONTINUE Lrip/breeze/classtransform/ú;
      // 0ae: aload 0
      // 0af: getfield rip/breeze/classtransform/ò.é_ÿ_2 Lrip/breeze/classtransform/é;
      // 0b2: getfield rip/breeze/classtransform/é.ú_þ_2 Lrip/breeze/classtransform/ú;
      // 0b5: invokevirtual rip/breeze/classtransform/ú.equals (Ljava/lang/Object;)Z
      // 0b8: aload 12
      // 0ba: lload 2
      // 0bb: lconst_0
      // 0bc: lcmp
      // 0bd: ifle 128
      // 0c0: ifnonnull 126
      // 0c3: ifeq 112
      // 0c6: goto 0cd
      // 0c9: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: sipush 3799
      // 0d0: ldc2_w 2316675333001623585
      // 0d3: lload 2
      // 0d4: lxor
      // 0d5: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: bipush 2
      // 0db: anewarray 4
      // 0de: dup
      // 0df: bipush 0
      // 0e0: aload 4
      // 0e2: aastore
      // 0e3: dup
      // 0e4: bipush 1
      // 0e5: aload 13
      // 0e7: aastore
      // 0e8: lload 10
      // 0ea: dup2_x1
      // 0eb: pop2
      // 0ec: bipush 3
      // 0ed: anewarray 4
      // 0f0: dup_x1
      // 0f1: swap
      // 0f2: bipush 2
      // 0f3: swap
      // 0f4: aastore
      // 0f5: dup_x2
      // 0f6: dup_x2
      // 0f7: pop
      // 0f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fb: bipush 1
      // 0fc: swap
      // 0fd: aastore
      // 0fe: dup_x1
      // 0ff: swap
      // 100: bipush 0
      // 101: swap
      // 102: aastore
      // 103: invokestatic rip/breeze/classtransform/հ.method_002 ([Ljava/lang/Object;)V
      // 106: aload 12
      // 108: ifnull 18e
      // 10b: goto 112
      // 10e: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: getstatic rip/breeze/classtransform/ú.CANCEL Lrip/breeze/classtransform/ú;
      // 115: aload 0
      // 116: getfield rip/breeze/classtransform/ò.é_ÿ_2 Lrip/breeze/classtransform/é;
      // 119: getfield rip/breeze/classtransform/é.ú_þ_2 Lrip/breeze/classtransform/ú;
      // 11c: invokevirtual rip/breeze/classtransform/ú.equals (Ljava/lang/Object;)Z
      // 11f: goto 126
      // 122: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: aload 12
      // 128: lload 2
      // 129: lconst_0
      // 12a: lcmp
      // 12b: ifle 17d
      // 12e: ifnonnull 17b
      // 131: ifeq 16e
      // 134: goto 13b
      // 137: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: new java/lang/RuntimeException
      // 13e: dup
      // 13f: new java/lang/StringBuilder
      // 142: dup
      // 143: invokespecial java/lang/StringBuilder.<init> ()V
      // 146: sipush 31515
      // 149: ldc2_w 6892209993708260840
      // 14c: lload 2
      // 14d: lxor
      // 14e: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 156: aload 4
      // 158: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15b: ldc_w "'"
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 164: aload 13
      // 166: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 169: athrow
      // 16a: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16d: athrow
      // 16e: getstatic rip/breeze/classtransform/ú.EXIT Lrip/breeze/classtransform/ú;
      // 171: aload 0
      // 172: getfield rip/breeze/classtransform/ò.é_ÿ_2 Lrip/breeze/classtransform/é;
      // 175: getfield rip/breeze/classtransform/é.ú_þ_2 Lrip/breeze/classtransform/ú;
      // 178: invokevirtual rip/breeze/classtransform/ú.equals (Ljava/lang/Object;)Z
      // 17b: aload 12
      // 17d: ifnonnull 18b
      // 180: ifeq 18e
      // 183: goto 18a
      // 186: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 189: athrow
      // 18a: bipush -1
      // 18b: invokestatic java/lang/System.exit (I)V
      // 18e: return
      // try (40 -> 48): 48 java/lang/Throwable
      // try (38 -> 44): 45 java/lang/Throwable
      // try (50 -> 106): 107 java/lang/Throwable
      // try (108 -> 120): 121 java/lang/Throwable
      // try (119 -> 163): 164 java/lang/Throwable
      // try (123 -> 171): 172 java/lang/Throwable
      // try (174 -> 181): 182 java/lang/Throwable
      // try (180 -> 203): 203 java/lang/Throwable
      // try (210 -> 213): 214 java/lang/Throwable
   }

   private void invoke_12(Object[] param1) throws ClassNotFoundException {
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
      // 00b: checkcast java/lang/Class
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
      // 01d: checkcast java/util/Map
      // 020: astore 6
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast rip/breeze/classtransform/ó
      // 028: astore 7
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast rip/breeze/inject/é
      // 030: astore 8
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast rip/breeze/inject/é
      // 039: astore 9
      // 03b: pop
      // 03c: getstatic rip/breeze/classtransform/ò.encKey_a_2 J
      // 03f: lload 4
      // 041: lxor
      // 042: lstore 4
      // 044: lload 4
      // 046: dup2
      // 047: ldc2_w 83663628271798
      // 04a: lxor
      // 04b: lstore 10
      // 04d: dup2
      // 04e: ldc2_w 105410423779478
      // 051: lxor
      // 052: lstore 12
      // 054: dup2
      // 055: ldc2_w 50793603250520
      // 058: lxor
      // 059: lstore 14
      // 05b: dup2
      // 05c: ldc2_w 88939429337725
      // 05f: lxor
      // 060: lstore 16
      // 062: dup2
      // 063: ldc2_w 38368865882226
      // 066: lxor
      // 067: lstore 18
      // 069: dup2
      // 06a: ldc2_w 106761930649933
      // 06d: lxor
      // 06e: lstore 20
      // 070: dup2
      // 071: ldc2_w 9965065043988
      // 074: lxor
      // 075: lstore 22
      // 077: pop2
      // 078: aload 3
      // 079: invokevirtual java/lang/Class.getDeclaredMethods ()[Ljava/lang/reflect/Method;
      // 07c: astore 24
      // 07e: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 081: aload 24
      // 083: arraylength
      // 084: istore 25
      // 086: bipush 0
      // 087: istore 26
      // 089: astore 27
      // 08b: iload 26
      // 08d: iload 25
      // 08f: if_icmpge 90b
      // 092: aload 24
      // 094: iload 26
      // 096: aaload
      // 097: astore 28
      // 099: aload 28
      // 09b: ldc_w rip/breeze/classtransform/è
      // 09e: invokevirtual java/lang/reflect/Method.getDeclaredAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 0a1: checkcast rip/breeze/classtransform/è
      // 0a4: astore 29
      // 0a6: lload 4
      // 0a8: lconst_0
      // 0a9: lcmp
      // 0aa: ifle 0b9
      // 0ad: aload 29
      // 0af: ifnonnull 0b9
      // 0b2: goto 903
      // 0b5: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: aload 6
      // 0bb: sipush 13298
      // 0be: ldc2_w 3724523487268533434
      // 0c1: lload 4
      // 0c3: lxor
      // 0c4: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0ce: aload 27
      // 0d0: ifnonnull 1b6
      // 0d3: ifeq 1b5
      // 0d6: goto 0dd
      // 0d9: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dc: athrow
      // 0dd: aload 7
      // 0df: getfield rip/breeze/classtransform/ó.mapping_ü_2 Lrip/breeze/classtransform/annotations/Mapping;
      // 0e2: aload 27
      // 0e4: ifnonnull 110
      // 0e7: goto 0ee
      // 0ea: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: getstatic rip/breeze/classtransform/annotations/Mapping.NONE Lrip/breeze/classtransform/annotations/Mapping;
      // 0f1: goto 0f8
      // 0f4: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: if_acmpeq 1b5
      // 0fb: aload 6
      // 0fd: sipush 14354
      // 100: ldc2_w 852160270232289117
      // 103: lload 4
      // 105: lxor
      // 106: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 110: checkcast java/util/ArrayList
      // 113: astore 30
      // 115: aload 30
      // 117: invokevirtual java/util/ArrayList.isEmpty ()Z
      // 11a: aload 27
      // 11c: ifnonnull 1b6
      // 11f: ifne 1b5
      // 122: goto 129
      // 125: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: bipush 0
      // 12a: istore 31
      // 12c: aload 30
      // 12e: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 131: astore 32
      // 133: aload 32
      // 135: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13a: ifeq 19d
      // 13d: aload 32
      // 13f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 144: checkcast [Ljava/lang/String;
      // 147: astore 33
      // 149: aload 33
      // 14b: bipush 1
      // 14c: aaload
      // 14d: invokestatic rip/breeze/classtransform/annotations/Mapping.valueOf (Ljava/lang/String;)Lrip/breeze/classtransform/annotations/Mapping;
      // 150: astore 34
      // 152: aload 27
      // 154: lload 4
      // 156: lconst_0
      // 157: lcmp
      // 158: iflt 187
      // 15b: ifnonnull 17e
      // 15e: aload 34
      // 160: aload 7
      // 162: getfield rip/breeze/classtransform/ó.mapping_ü_2 Lrip/breeze/classtransform/annotations/Mapping;
      // 165: aload 27
      // 167: ifnonnull 0f8
      // 16a: lload 4
      // 16c: lconst_0
      // 16d: lcmp
      // 16e: ifle 0f1
      // 171: goto 178
      // 174: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 177: athrow
      // 178: if_acmpne 18a
      // 17b: bipush 1
      // 17c: istore 31
      // 17e: lload 4
      // 180: lconst_0
      // 181: lcmp
      // 182: iflt 19d
      // 185: aload 27
      // 187: ifnull 19d
      // 18a: aload 27
      // 18c: ifnull 133
      // 18f: lload 4
      // 191: lconst_0
      // 192: lcmp
      // 193: iflt 152
      // 196: goto 19d
      // 199: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19c: athrow
      // 19d: iload 31
      // 19f: aload 27
      // 1a1: ifnonnull 1b6
      // 1a4: ifne 1b5
      // 1a7: goto 1ae
      // 1aa: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ad: athrow
      // 1ae: lload 4
      // 1b0: lconst_0
      // 1b1: lcmp
      // 1b2: ifgt 903
      // 1b5: bipush 0
      // 1b6: istore 30
      // 1b8: aload 6
      // 1ba: lload 4
      // 1bc: lconst_0
      // 1bd: lcmp
      // 1be: ifle 1ff
      // 1c1: sipush 7597
      // 1c4: ldc2_w 4337717448516492009
      // 1c7: lload 4
      // 1c9: lxor
      // 1ca: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: aload 27
      // 1d1: ifnonnull 1fa
      // 1d4: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1d9: ifeq 285
      // 1dc: goto 1e3
      // 1df: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e2: athrow
      // 1e3: aload 6
      // 1e5: sipush 19041
      // 1e8: ldc2_w 8461422738345069874
      // 1eb: lload 4
      // 1ed: lxor
      // 1ee: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: goto 1fa
      // 1f6: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f9: athrow
      // 1fa: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1ff: astore 31
      // 201: aload 31
      // 203: aload 27
      // 205: ifnonnull 21e
      // 208: instanceof rip/breeze/inject/ù
      // 20b: ifeq 285
      // 20e: goto 215
      // 211: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 214: athrow
      // 215: aload 31
      // 217: goto 21e
      // 21a: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21d: athrow
      // 21e: checkcast rip/breeze/inject/ù
      // 221: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 224: lload 10
      // 226: bipush 2
      // 227: anewarray 4
      // 22a: dup_x2
      // 22b: dup_x2
      // 22c: pop
      // 22d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 230: bipush 1
      // 231: swap
      // 232: aastore
      // 233: dup_x1
      // 234: swap
      // 235: bipush 0
      // 236: swap
      // 237: aastore
      // 238: invokestatic rip/breeze/classtransform/չ.method_001 ([Ljava/lang/Object;)Ljava/util/Map;
      // 23b: astore 32
      // 23d: aload 32
      // 23f: sipush 21753
      // 242: ldc2_w 6372309702838817710
      // 245: lload 4
      // 247: lxor
      // 248: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24d: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 252: aload 27
      // 254: ifnonnull 283
      // 257: ifeq 285
      // 25a: goto 261
      // 25d: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 260: athrow
      // 261: aload 32
      // 263: sipush 17892
      // 266: ldc2_w 9151692999529759408
      // 269: lload 4
      // 26b: lxor
      // 26c: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 271: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 276: checkcast java/lang/Boolean
      // 279: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 27c: goto 283
      // 27f: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 282: athrow
      // 283: istore 30
      // 285: aload 29
      // 287: invokeinterface rip/breeze/classtransform/è.value ()Lrip/breeze/classtransform/ý; 1
      // 28c: astore 31
      // 28e: aload 31
      // 290: getstatic rip/breeze/classtransform/ý.DYNAMIC Lrip/breeze/classtransform/ý;
      // 293: invokevirtual rip/breeze/classtransform/ý.equals (Ljava/lang/Object;)Z
      // 296: aload 27
      // 298: lload 4
      // 29a: lconst_0
      // 29b: lcmp
      // 29c: ifle 37c
      // 29f: ifnonnull 37a
      // 2a2: ifeq 372
      // 2a5: goto 2ac
      // 2a8: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ab: athrow
      // 2ac: aload 29
      // 2ae: invokeinterface rip/breeze/classtransform/è.method_003 ()Ljava/lang/Class; 1
      // 2b3: bipush 0
      // 2b4: anewarray 134
      // 2b7: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 2ba: bipush 0
      // 2bb: anewarray 4
      // 2be: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 2c1: checkcast rip/breeze/classtransform/ç
      // 2c4: astore 32
      // 2c6: aload 32
      // 2c8: lload 14
      // 2ca: aload 0
      // 2cb: aload 3
      // 2cc: aload 6
      // 2ce: aload 28
      // 2d0: aload 7
      // 2d2: aload 8
      // 2d4: aload 9
      // 2d6: bipush 8
      // 2d8: anewarray 4
      // 2db: dup_x1
      // 2dc: swap
      // 2dd: bipush 7
      // 2df: swap
      // 2e0: aastore
      // 2e1: dup_x1
      // 2e2: swap
      // 2e3: bipush 6
      // 2e5: swap
      // 2e6: aastore
      // 2e7: dup_x1
      // 2e8: swap
      // 2e9: bipush 5
      // 2ea: swap
      // 2eb: aastore
      // 2ec: dup_x1
      // 2ed: swap
      // 2ee: bipush 4
      // 2ef: swap
      // 2f0: aastore
      // 2f1: dup_x1
      // 2f2: swap
      // 2f3: bipush 3
      // 2f4: swap
      // 2f5: aastore
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
      // 300: dup_x2
      // 301: dup_x2
      // 302: pop
      // 303: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 306: bipush 0
      // 307: swap
      // 308: aastore
      // 309: invokeinterface rip/breeze/classtransform/ç.method_001 ([Ljava/lang/Object;)Lrip/breeze/classtransform/ý; 2
      // 30e: astore 31
      // 310: aload 31
      // 312: aload 27
      // 314: ifnonnull 323
      // 317: ifnull 32c
      // 31a: goto 321
      // 31d: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 320: athrow
      // 321: aload 31
      // 323: getstatic rip/breeze/classtransform/ý.DYNAMIC Lrip/breeze/classtransform/ý;
      // 326: invokevirtual rip/breeze/classtransform/ý.equals (Ljava/lang/Object;)Z
      // 329: ifeq 331
      // 32c: aload 27
      // 32e: ifnull 903
      // 331: goto 372
      // 334: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 337: athrow
      // 338: astore 32
      // 33a: new java/lang/RuntimeException
      // 33d: dup
      // 33e: new java/lang/StringBuilder
      // 341: dup
      // 342: invokespecial java/lang/StringBuilder.<init> ()V
      // 345: sipush 23866
      // 348: ldc2_w 6662213471561751162
      // 34b: lload 4
      // 34d: lxor
      // 34e: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 353: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 356: aload 29
      // 358: invokeinterface rip/breeze/classtransform/è.method_003 ()Ljava/lang/Class; 1
      // 35d: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 360: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 363: ldc_w "'"
      // 366: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 369: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 36c: aload 32
      // 36e: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 371: athrow
      // 372: aload 31
      // 374: getstatic rip/breeze/classtransform/ý.SHORT_MEMBER Lrip/breeze/classtransform/ý;
      // 377: invokevirtual rip/breeze/classtransform/ý.equals (Ljava/lang/Object;)Z
      // 37a: aload 27
      // 37c: ifnonnull 3f9
      // 37f: ifeq 3e2
      // 382: goto 389
      // 385: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 388: athrow
      // 389: aload 0
      // 38a: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 38d: aload 2
      // 38e: aload 29
      // 390: aload 28
      // 392: lload 20
      // 394: aload 6
      // 396: aload 8
      // 398: aload 9
      // 39a: iload 30
      // 39c: bipush 9
      // 39e: anewarray 4
      // 3a1: dup_x1
      // 3a2: swap
      // 3a3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3a6: bipush 8
      // 3a8: swap
      // 3a9: aastore
      // 3aa: dup_x1
      // 3ab: swap
      // 3ac: bipush 7
      // 3ae: swap
      // 3af: aastore
      // 3b0: dup_x1
      // 3b1: swap
      // 3b2: bipush 6
      // 3b4: swap
      // 3b5: aastore
      // 3b6: dup_x1
      // 3b7: swap
      // 3b8: bipush 5
      // 3b9: swap
      // 3ba: aastore
      // 3bb: dup_x2
      // 3bc: dup_x2
      // 3bd: pop
      // 3be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3c1: bipush 4
      // 3c2: swap
      // 3c3: aastore
      // 3c4: dup_x1
      // 3c5: swap
      // 3c6: bipush 3
      // 3c7: swap
      // 3c8: aastore
      // 3c9: dup_x1
      // 3ca: swap
      // 3cb: bipush 2
      // 3cc: swap
      // 3cd: aastore
      // 3ce: dup_x1
      // 3cf: swap
      // 3d0: bipush 1
      // 3d1: swap
      // 3d2: aastore
      // 3d3: dup_x1
      // 3d4: swap
      // 3d5: bipush 0
      // 3d6: swap
      // 3d7: aastore
      // 3d8: invokestatic rip/breeze/classtransform/ê.method_001 ([Ljava/lang/Object;)V
      // 3db: goto 3e2
      // 3de: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e1: athrow
      // 3e2: aload 0
      // 3e3: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 3e6: aload 27
      // 3e8: ifnonnull 40b
      // 3eb: bipush 0
      // 3ec: anewarray 4
      // 3ef: invokevirtual rip/breeze/classtransform/ô.method_011 ([Ljava/lang/Object;)Z
      // 3f2: goto 3f9
      // 3f5: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f8: athrow
      // 3f9: ifeq 3ff
      // 3fc: goto 903
      // 3ff: aload 6
      // 401: aload 28
      // 403: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 406: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 40b: astore 32
      // 40d: lload 4
      // 40f: lconst_0
      // 410: lcmp
      // 411: iflt 420
      // 414: aload 32
      // 416: ifnonnull 420
      // 419: goto 903
      // 41c: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41f: athrow
      // 420: aload 31
      // 422: getstatic rip/breeze/classtransform/ý.ANNOTATION Lrip/breeze/classtransform/ý;
      // 425: invokevirtual rip/breeze/classtransform/ý.equals (Ljava/lang/Object;)Z
      // 428: aload 27
      // 42a: lload 4
      // 42c: lconst_0
      // 42d: lcmp
      // 42e: ifle 77f
      // 431: ifnonnull 77d
      // 434: ifeq 778
      // 437: goto 43e
      // 43a: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43d: athrow
      // 43e: aload 32
      // 440: instanceof rip/breeze/inject/ù
      // 443: aload 27
      // 445: lload 4
      // 447: lconst_0
      // 448: lcmp
      // 449: iflt 51a
      // 44c: ifnonnull 518
      // 44f: goto 456
      // 452: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 455: athrow
      // 456: ifeq 50c
      // 459: goto 460
      // 45c: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45f: athrow
      // 460: aload 32
      // 462: checkcast rip/breeze/inject/ù
      // 465: astore 33
      // 467: aload 33
      // 469: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 46c: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 46f: astore 34
      // 471: aload 33
      // 473: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 476: lload 10
      // 478: bipush 2
      // 479: anewarray 4
      // 47c: dup_x2
      // 47d: dup_x2
      // 47e: pop
      // 47f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 482: bipush 1
      // 483: swap
      // 484: aastore
      // 485: dup_x1
      // 486: swap
      // 487: bipush 0
      // 488: swap
      // 489: aastore
      // 48a: invokestatic rip/breeze/classtransform/չ.method_001 ([Ljava/lang/Object;)Ljava/util/Map;
      // 48d: astore 35
      // 48f: aload 0
      // 490: aload 2
      // 491: aload 34
      // 493: lload 22
      // 495: bipush 1
      // 496: anewarray 4
      // 499: dup_x2
      // 49a: dup_x2
      // 49b: pop
      // 49c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 49f: bipush 0
      // 4a0: swap
      // 4a1: aastore
      // 4a2: invokevirtual rip/breeze/inject/MathUtil3.buildString_2 ([Ljava/lang/Object;)Ljava/lang/String;
      // 4a5: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 4a8: lload 18
      // 4aa: aload 35
      // 4ac: aload 7
      // 4ae: aload 8
      // 4b0: aload 9
      // 4b2: bipush 7
      // 4b4: anewarray 4
      // 4b7: dup_x1
      // 4b8: swap
      // 4b9: bipush 6
      // 4bb: swap
      // 4bc: aastore
      // 4bd: dup_x1
      // 4be: swap
      // 4bf: bipush 5
      // 4c0: swap
      // 4c1: aastore
      // 4c2: dup_x1
      // 4c3: swap
      // 4c4: bipush 4
      // 4c5: swap
      // 4c6: aastore
      // 4c7: dup_x1
      // 4c8: swap
      // 4c9: bipush 3
      // 4ca: swap
      // 4cb: aastore
      // 4cc: dup_x2
      // 4cd: dup_x2
      // 4ce: pop
      // 4cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d2: bipush 2
      // 4d3: swap
      // 4d4: aastore
      // 4d5: dup_x1
      // 4d6: swap
      // 4d7: bipush 1
      // 4d8: swap
      // 4d9: aastore
      // 4da: dup_x1
      // 4db: swap
      // 4dc: bipush 0
      // 4dd: swap
      // 4de: aastore
      // 4df: invokespecial rip/breeze/classtransform/ò.method_012 ([Ljava/lang/Object;)V
      // 4e2: aload 33
      // 4e4: lload 12
      // 4e6: aload 35
      // 4e8: bipush 2
      // 4e9: anewarray 4
      // 4ec: dup_x1
      // 4ed: swap
      // 4ee: bipush 1
      // 4ef: swap
      // 4f0: aastore
      // 4f1: dup_x2
      // 4f2: dup_x2
      // 4f3: pop
      // 4f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f7: bipush 0
      // 4f8: swap
      // 4f9: aastore
      // 4fa: invokestatic rip/breeze/classtransform/չ.method_002 ([Ljava/lang/Object;)Ljava/util/List;
      // 4fd: putfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 500: aload 27
      // 502: lload 4
      // 504: lconst_0
      // 505: lcmp
      // 506: iflt 50e
      // 509: ifnull 903
      // 50c: aload 32
      // 50e: instanceof [Lrip/breeze/inject/ù;
      // 511: goto 518
      // 514: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 517: athrow
      // 518: aload 27
      // 51a: ifnonnull 62a
      // 51d: ifeq 612
      // 520: goto 527
      // 523: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 526: athrow
      // 527: aload 32
      // 529: checkcast [Lrip/breeze/inject/ù;
      // 52c: checkcast [Lrip/breeze/inject/ù;
      // 52f: astore 33
      // 531: aload 33
      // 533: astore 34
      // 535: aload 34
      // 537: arraylength
      // 538: istore 35
      // 53a: bipush 0
      // 53b: istore 36
      // 53d: iload 36
      // 53f: iload 35
      // 541: if_icmpge 606
      // 544: aload 34
      // 546: iload 36
      // 548: aaload
      // 549: astore 37
      // 54b: aload 37
      // 54d: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 550: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 553: astore 38
      // 555: aload 37
      // 557: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 55a: lload 10
      // 55c: bipush 2
      // 55d: anewarray 4
      // 560: dup_x2
      // 561: dup_x2
      // 562: pop
      // 563: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 566: bipush 1
      // 567: swap
      // 568: aastore
      // 569: dup_x1
      // 56a: swap
      // 56b: bipush 0
      // 56c: swap
      // 56d: aastore
      // 56e: invokestatic rip/breeze/classtransform/չ.method_001 ([Ljava/lang/Object;)Ljava/util/Map;
      // 571: astore 39
      // 573: aload 0
      // 574: aload 2
      // 575: aload 38
      // 577: lload 22
      // 579: bipush 1
      // 57a: anewarray 4
      // 57d: dup_x2
      // 57e: dup_x2
      // 57f: pop
      // 580: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 583: bipush 0
      // 584: swap
      // 585: aastore
      // 586: invokevirtual rip/breeze/inject/MathUtil3.buildString_2 ([Ljava/lang/Object;)Ljava/lang/String;
      // 589: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 58c: lload 18
      // 58e: aload 39
      // 590: aload 7
      // 592: aload 8
      // 594: aload 9
      // 596: bipush 7
      // 598: anewarray 4
      // 59b: dup_x1
      // 59c: swap
      // 59d: bipush 6
      // 59f: swap
      // 5a0: aastore
      // 5a1: dup_x1
      // 5a2: swap
      // 5a3: bipush 5
      // 5a4: swap
      // 5a5: aastore
      // 5a6: dup_x1
      // 5a7: swap
      // 5a8: bipush 4
      // 5a9: swap
      // 5aa: aastore
      // 5ab: dup_x1
      // 5ac: swap
      // 5ad: bipush 3
      // 5ae: swap
      // 5af: aastore
      // 5b0: dup_x2
      // 5b1: dup_x2
      // 5b2: pop
      // 5b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b6: bipush 2
      // 5b7: swap
      // 5b8: aastore
      // 5b9: dup_x1
      // 5ba: swap
      // 5bb: bipush 1
      // 5bc: swap
      // 5bd: aastore
      // 5be: dup_x1
      // 5bf: swap
      // 5c0: bipush 0
      // 5c1: swap
      // 5c2: aastore
      // 5c3: invokespecial rip/breeze/classtransform/ò.method_012 ([Ljava/lang/Object;)V
      // 5c6: aload 37
      // 5c8: lload 12
      // 5ca: aload 39
      // 5cc: bipush 2
      // 5cd: anewarray 4
      // 5d0: dup_x1
      // 5d1: swap
      // 5d2: bipush 1
      // 5d3: swap
      // 5d4: aastore
      // 5d5: dup_x2
      // 5d6: dup_x2
      // 5d7: pop
      // 5d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5db: bipush 0
      // 5dc: swap
      // 5dd: aastore
      // 5de: invokestatic rip/breeze/classtransform/չ.method_002 ([Ljava/lang/Object;)Ljava/util/List;
      // 5e1: putfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 5e4: iinc 36 1
      // 5e7: aload 27
      // 5e9: lload 4
      // 5eb: lconst_0
      // 5ec: lcmp
      // 5ed: ifle 5f5
      // 5f0: ifnonnull 906
      // 5f3: aload 27
      // 5f5: ifnull 53d
      // 5f8: lload 4
      // 5fa: lconst_0
      // 5fb: lcmp
      // 5fc: ifle 5e7
      // 5ff: goto 606
      // 602: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 605: athrow
      // 606: aload 27
      // 608: lload 4
      // 60a: lconst_0
      // 60b: lcmp
      // 60c: iflt 614
      // 60f: ifnull 903
      // 612: aload 32
      // 614: aload 27
      // 616: ifnonnull 62f
      // 619: goto 620
      // 61c: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61f: athrow
      // 620: instanceof java/util/List
      // 623: goto 62a
      // 626: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 629: athrow
      // 62a: ifeq 710
      // 62d: aload 32
      // 62f: checkcast java/util/List
      // 632: astore 33
      // 634: aload 33
      // 636: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 63b: astore 34
      // 63d: aload 34
      // 63f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 644: ifeq 70b
      // 647: aload 34
      // 649: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 64e: checkcast rip/breeze/inject/ù
      // 651: astore 35
      // 653: aload 35
      // 655: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 658: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 65b: astore 36
      // 65d: aload 35
      // 65f: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 662: lload 10
      // 664: bipush 2
      // 665: anewarray 4
      // 668: dup_x2
      // 669: dup_x2
      // 66a: pop
      // 66b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 66e: bipush 1
      // 66f: swap
      // 670: aastore
      // 671: dup_x1
      // 672: swap
      // 673: bipush 0
      // 674: swap
      // 675: aastore
      // 676: invokestatic rip/breeze/classtransform/չ.method_001 ([Ljava/lang/Object;)Ljava/util/Map;
      // 679: astore 37
      // 67b: aload 0
      // 67c: aload 2
      // 67d: aload 36
      // 67f: lload 22
      // 681: bipush 1
      // 682: anewarray 4
      // 685: dup_x2
      // 686: dup_x2
      // 687: pop
      // 688: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68b: bipush 0
      // 68c: swap
      // 68d: aastore
      // 68e: invokevirtual rip/breeze/inject/MathUtil3.buildString_2 ([Ljava/lang/Object;)Ljava/lang/String;
      // 691: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 694: lload 18
      // 696: aload 37
      // 698: aload 7
      // 69a: aload 8
      // 69c: aload 9
      // 69e: bipush 7
      // 6a0: anewarray 4
      // 6a3: dup_x1
      // 6a4: swap
      // 6a5: bipush 6
      // 6a7: swap
      // 6a8: aastore
      // 6a9: dup_x1
      // 6aa: swap
      // 6ab: bipush 5
      // 6ac: swap
      // 6ad: aastore
      // 6ae: dup_x1
      // 6af: swap
      // 6b0: bipush 4
      // 6b1: swap
      // 6b2: aastore
      // 6b3: dup_x1
      // 6b4: swap
      // 6b5: bipush 3
      // 6b6: swap
      // 6b7: aastore
      // 6b8: dup_x2
      // 6b9: dup_x2
      // 6ba: pop
      // 6bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6be: bipush 2
      // 6bf: swap
      // 6c0: aastore
      // 6c1: dup_x1
      // 6c2: swap
      // 6c3: bipush 1
      // 6c4: swap
      // 6c5: aastore
      // 6c6: dup_x1
      // 6c7: swap
      // 6c8: bipush 0
      // 6c9: swap
      // 6ca: aastore
      // 6cb: invokespecial rip/breeze/classtransform/ò.method_012 ([Ljava/lang/Object;)V
      // 6ce: aload 35
      // 6d0: lload 12
      // 6d2: aload 37
      // 6d4: bipush 2
      // 6d5: anewarray 4
      // 6d8: dup_x1
      // 6d9: swap
      // 6da: bipush 1
      // 6db: swap
      // 6dc: aastore
      // 6dd: dup_x2
      // 6de: dup_x2
      // 6df: pop
      // 6e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e3: bipush 0
      // 6e4: swap
      // 6e5: aastore
      // 6e6: invokestatic rip/breeze/classtransform/չ.method_002 ([Ljava/lang/Object;)Ljava/util/List;
      // 6e9: putfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 6ec: aload 27
      // 6ee: lload 4
      // 6f0: lconst_0
      // 6f1: lcmp
      // 6f2: iflt 6fa
      // 6f5: ifnonnull 906
      // 6f8: aload 27
      // 6fa: ifnull 63d
      // 6fd: lload 4
      // 6ff: lconst_0
      // 700: lcmp
      // 701: iflt 6ec
      // 704: goto 70b
      // 707: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70a: athrow
      // 70b: aload 27
      // 70d: ifnull 903
      // 710: new java/lang/IllegalStateException
      // 713: dup
      // 714: new java/lang/StringBuilder
      // 717: dup
      // 718: invokespecial java/lang/StringBuilder.<init> ()V
      // 71b: sipush 21035
      // 71e: ldc2_w 4701923889468380512
      // 721: lload 4
      // 723: lxor
      // 724: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 729: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 72c: aload 32
      // 72e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 731: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 734: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 737: sipush 7946
      // 73a: ldc2_w 4970828312615934029
      // 73d: lload 4
      // 73f: lxor
      // 740: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 745: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 748: aload 3
      // 749: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 74c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74f: sipush 23116
      // 752: ldc2_w 4427602137478700314
      // 755: lload 4
      // 757: lxor
      // 758: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 760: aload 3
      // 761: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 764: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 767: ldc_w "'"
      // 76a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 770: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 773: athrow
      // 774: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 777: athrow
      // 778: aload 32
      // 77a: instanceof java/lang/String
      // 77d: aload 27
      // 77f: lload 4
      // 781: lconst_0
      // 782: lcmp
      // 783: ifle 7e9
      // 786: ifnonnull 7e7
      // 789: ifeq 7db
      // 78c: goto 793
      // 78f: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 792: athrow
      // 793: aload 32
      // 795: checkcast java/lang/String
      // 798: astore 33
      // 79a: aload 6
      // 79c: aload 28
      // 79e: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 7a1: aload 0
      // 7a2: aload 31
      // 7a4: lload 16
      // 7a6: aload 33
      // 7a8: aload 7
      // 7aa: bipush 4
      // 7ab: anewarray 4
      // 7ae: dup_x1
      // 7af: swap
      // 7b0: bipush 3
      // 7b1: swap
      // 7b2: aastore
      // 7b3: dup_x1
      // 7b4: swap
      // 7b5: bipush 2
      // 7b6: swap
      // 7b7: aastore
      // 7b8: dup_x2
      // 7b9: dup_x2
      // 7ba: pop
      // 7bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7be: bipush 1
      // 7bf: swap
      // 7c0: aastore
      // 7c1: dup_x1
      // 7c2: swap
      // 7c3: bipush 0
      // 7c4: swap
      // 7c5: aastore
      // 7c6: invokespecial rip/breeze/classtransform/ò.method_013 ([Ljava/lang/Object;)Ljava/lang/String;
      // 7c9: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 7ce: pop
      // 7cf: aload 27
      // 7d1: lload 4
      // 7d3: lconst_0
      // 7d4: lcmp
      // 7d5: ifle 7dd
      // 7d8: ifnull 903
      // 7db: aload 32
      // 7dd: instanceof [Ljava/lang/String;
      // 7e0: goto 7e7
      // 7e3: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e6: athrow
      // 7e7: aload 27
      // 7e9: ifnonnull 877
      // 7ec: ifeq 86b
      // 7ef: goto 7f6
      // 7f2: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f5: athrow
      // 7f6: aload 32
      // 7f8: checkcast [Ljava/lang/String;
      // 7fb: checkcast [Ljava/lang/String;
      // 7fe: astore 33
      // 800: bipush 0
      // 801: istore 34
      // 803: iload 34
      // 805: aload 33
      // 807: arraylength
      // 808: if_icmpge 85f
      // 80b: aload 33
      // 80d: iload 34
      // 80f: aload 0
      // 810: aload 31
      // 812: aload 33
      // 814: iload 34
      // 816: aaload
      // 817: lload 16
      // 819: dup2_x1
      // 81a: pop2
      // 81b: aload 7
      // 81d: bipush 4
      // 81e: anewarray 4
      // 821: dup_x1
      // 822: swap
      // 823: bipush 3
      // 824: swap
      // 825: aastore
      // 826: dup_x1
      // 827: swap
      // 828: bipush 2
      // 829: swap
      // 82a: aastore
      // 82b: dup_x2
      // 82c: dup_x2
      // 82d: pop
      // 82e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 831: bipush 1
      // 832: swap
      // 833: aastore
      // 834: dup_x1
      // 835: swap
      // 836: bipush 0
      // 837: swap
      // 838: aastore
      // 839: invokespecial rip/breeze/classtransform/ò.method_013 ([Ljava/lang/Object;)Ljava/lang/String;
      // 83c: aastore
      // 83d: iinc 34 1
      // 840: aload 27
      // 842: lload 4
      // 844: lconst_0
      // 845: lcmp
      // 846: iflt 908
      // 849: ifnonnull 906
      // 84c: aload 27
      // 84e: ifnull 803
      // 851: lload 4
      // 853: lconst_0
      // 854: lcmp
      // 855: iflt 840
      // 858: goto 85f
      // 85b: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85e: athrow
      // 85f: aload 27
      // 861: lload 4
      // 863: lconst_0
      // 864: lcmp
      // 865: iflt 86d
      // 868: ifnull 903
      // 86b: aload 32
      // 86d: instanceof java/util/List
      // 870: goto 877
      // 873: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 876: athrow
      // 877: ifeq 89b
      // 87a: aload 31
      // 87c: astore 33
      // 87e: aload 32
      // 880: checkcast java/util/List
      // 883: astore 34
      // 885: aload 34
      // 887: aload 0
      // 888: aload 33
      // 88a: aload 7
      // 88c: invokedynamic apply (Lrip/breeze/classtransform/ò;Lrip/breeze/classtransform/ý;Lrip/breeze/classtransform/ó;)Ljava/util/function/UnaryOperator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/classtransform/ò.lambda$mapAnnotation_Inner0 (Lrip/breeze/classtransform/ý;Lrip/breeze/classtransform/ó;Ljava/lang/String;)Ljava/lang/String;, (Ljava/lang/String;)Ljava/lang/String; ]
      // 891: invokeinterface java/util/List.replaceAll (Ljava/util/function/UnaryOperator;)V 2
      // 896: aload 27
      // 898: ifnull 903
      // 89b: new java/lang/IllegalStateException
      // 89e: dup
      // 89f: new java/lang/StringBuilder
      // 8a2: dup
      // 8a3: invokespecial java/lang/StringBuilder.<init> ()V
      // 8a6: sipush 11124
      // 8a9: ldc2_w 9066876602206809141
      // 8ac: lload 4
      // 8ae: lxor
      // 8af: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8b7: aload 32
      // 8b9: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 8bc: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 8bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c2: sipush 25139
      // 8c5: ldc2_w 3587432729164522870
      // 8c8: lload 4
      // 8ca: lxor
      // 8cb: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d3: aload 3
      // 8d4: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 8d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8da: sipush 23324
      // 8dd: ldc2_w 8307993243784977488
      // 8e0: lload 4
      // 8e2: lxor
      // 8e3: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8eb: aload 3
      // 8ec: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 8ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8f2: ldc_w "'"
      // 8f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8f8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8fb: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 8fe: athrow
      // 8ff: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 902: athrow
      // 903: iinc 26 1
      // 906: aload 27
      // 908: ifnull 08b
      // 90b: return
      // try (377 -> 381): 382 java/lang/Throwable
      // try (299 -> 309): 310 java/lang/Throwable
      // try (279 -> 292): 293 java/lang/Throwable
      // try (270 -> 280): 281 java/lang/Throwable
      // try (242 -> 248): 249 java/lang/Throwable
      // try (239 -> 244): 245 java/lang/Throwable
      // try (223 -> 234): 235 java/lang/Throwable
      // try (211 -> 225): 226 java/lang/Throwable
      // try (198 -> 202): 203 java/lang/Throwable
      // try (183 -> 191): 196 java/lang/Throwable
      // try (162 -> 173): 178 java/lang/Throwable
      // try (137 -> 142): 143 java/lang/Throwable
      // try (116 -> 124): 125 java/lang/Throwable
      // try (112 -> 120): 121 java/lang/Throwable
      // try (103 -> 113): 114 java/lang/Throwable
      // try (94 -> 101): 101 java/lang/Throwable
      // try (312 -> 388): 393 java/lang/Throwable
      // try (388 -> 391): 391 java/lang/Throwable
      // try (418 -> 421): 422 java/lang/Throwable
      // try (420 -> 485): 486 java/lang/Throwable
      // try (488 -> 495): 496 java/lang/Throwable
      // try (505 -> 512): 512 java/lang/Throwable
      // try (514 -> 524): 525 java/lang/Throwable
      // try (523 -> 535): 536 java/lang/Throwable
      // try (527 -> 539): 540 java/lang/Throwable
      // try (568 -> 655): 656 java/lang/Throwable
      // try (658 -> 661): 662 java/lang/Throwable
      // try (705 -> 793): 798 java/lang/Throwable
      // try (800 -> 809): 810 java/lang/Throwable
      // try (806 -> 813): 814 java/lang/Throwable
      // try (853 -> 940): 945 java/lang/Throwable
      // try (947 -> 987): 987 java/lang/Throwable
      // try (991 -> 998): 999 java/lang/Throwable
      // try (1004 -> 1047): 1048 java/lang/Throwable
      // try (1050 -> 1053): 1054 java/lang/Throwable
      // try (1066 -> 1112): 1117 java/lang/Throwable
      // try (1119 -> 1127): 1128 java/lang/Throwable
      // try (1136 -> 1182): 1182 java/lang/Throwable
   }

   private String invoke_13(Object[] param1) {
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
      // 004: checkcast rip/breeze/classtransform/ý
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
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast rip/breeze/classtransform/ó
      // 020: astore 6
      // 022: pop
      // 023: getstatic rip/breeze/classtransform/ò.encKey_a_2 J
      // 026: lload 3
      // 027: lxor
      // 028: lstore 3
      // 029: lload 3
      // 02a: dup2
      // 02b: ldc2_w 82557357962403
      // 02e: lxor
      // 02f: lstore 7
      // 031: dup2
      // 032: ldc2_w 8382267323235
      // 035: lxor
      // 036: lstore 9
      // 038: dup2
      // 039: ldc2_w 65054225866815
      // 03c: lxor
      // 03d: lstore 11
      // 03f: dup2
      // 040: ldc2_w 28276028644509
      // 043: lxor
      // 044: lstore 13
      // 046: dup2
      // 047: ldc2_w 90158834260379
      // 04a: lxor
      // 04b: lstore 15
      // 04d: dup2
      // 04e: ldc2_w 128950558341300
      // 051: lxor
      // 052: lstore 17
      // 054: dup2
      // 055: ldc2_w 49884817983391
      // 058: lxor
      // 059: lstore 19
      // 05b: dup2
      // 05c: ldc2_w 90234621848525
      // 05f: lxor
      // 060: lstore 21
      // 062: dup2
      // 063: ldc2_w 88491946183054
      // 066: lxor
      // 067: lstore 23
      // 069: pop2
      // 06a: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 06d: astore 25
      // 06f: getstatic rip/breeze/classtransform/ì.CONST_Ÿ [I
      // 072: aload 2
      // 073: invokevirtual rip/breeze/classtransform/ý.ordinal ()I
      // 076: iaload
      // 077: tableswitch 711 1 4 29 36 568 655
      // 094: aload 5
      // 096: areturn
      // 097: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: aload 5
      // 09d: lload 11
      // 09f: bipush 2
      // 0a0: anewarray 4
      // 0a3: dup_x2
      // 0a4: dup_x2
      // 0a5: pop
      // 0a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a9: bipush 1
      // 0aa: swap
      // 0ab: aastore
      // 0ac: dup_x1
      // 0ad: swap
      // 0ae: bipush 0
      // 0af: swap
      // 0b0: aastore
      // 0b1: invokestatic rip/breeze/classtransform/MathUtil3.getՑ ([Ljava/lang/Object;)Lrip/breeze/classtransform/ց;
      // 0b4: astore 26
      // 0b6: aload 25
      // 0b8: ifnonnull 122
      // 0bb: aload 26
      // 0bd: ifnonnull 0f8
      // 0c0: goto 0c7
      // 0c3: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: new java/lang/IllegalStateException
      // 0ca: dup
      // 0cb: new java/lang/StringBuilder
      // 0ce: dup
      // 0cf: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d2: sipush 28965
      // 0d5: ldc2_w 3175462033788353663
      // 0d8: lload 3
      // 0d9: lxor
      // 0da: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: aload 5
      // 0e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e7: ldc_w "'"
      // 0ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ed: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f0: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 0f3: athrow
      // 0f4: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: aload 26
      // 0fb: bipush 0
      // 0fc: anewarray 4
      // 0ff: invokevirtual rip/breeze/classtransform/ց.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 102: lload 21
      // 104: dup2_x1
      // 105: pop2
      // 106: aload 6
      // 108: bipush 3
      // 109: anewarray 4
      // 10c: dup_x1
      // 10d: swap
      // 10e: bipush 2
      // 10f: swap
      // 110: aastore
      // 111: dup_x1
      // 112: swap
      // 113: bipush 1
      // 114: swap
      // 115: aastore
      // 116: dup_x2
      // 117: dup_x2
      // 118: pop
      // 119: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11c: bipush 0
      // 11d: swap
      // 11e: aastore
      // 11f: invokespecial rip/breeze/classtransform/ò.method_011 ([Ljava/lang/Object;)V
      // 122: aload 0
      // 123: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 126: aload 26
      // 128: bipush 0
      // 129: anewarray 4
      // 12c: invokevirtual rip/breeze/classtransform/ց.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 12f: lload 15
      // 131: dup2_x1
      // 132: pop2
      // 133: bipush 2
      // 134: anewarray 4
      // 137: dup_x1
      // 138: swap
      // 139: bipush 1
      // 13a: swap
      // 13b: aastore
      // 13c: dup_x2
      // 13d: dup_x2
      // 13e: pop
      // 13f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 142: bipush 0
      // 143: swap
      // 144: aastore
      // 145: invokevirtual rip/breeze/classtransform/ô.ý ([Ljava/lang/Object;)Ljava/lang/String;
      // 148: astore 27
      // 14a: aload 26
      // 14c: lload 23
      // 14e: bipush 1
      // 14f: anewarray 4
      // 152: dup_x2
      // 153: dup_x2
      // 154: pop
      // 155: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 158: bipush 0
      // 159: swap
      // 15a: aastore
      // 15b: invokevirtual rip/breeze/classtransform/ց.method_007 ([Ljava/lang/Object;)Z
      // 15e: ifeq 1d8
      // 161: aload 0
      // 162: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 165: aload 26
      // 167: bipush 0
      // 168: anewarray 4
      // 16b: invokevirtual rip/breeze/classtransform/ց.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 16e: lload 17
      // 170: dup2_x1
      // 171: pop2
      // 172: aload 26
      // 174: bipush 0
      // 175: anewarray 4
      // 178: invokevirtual rip/breeze/classtransform/ց.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 17b: aload 26
      // 17d: bipush 0
      // 17e: anewarray 4
      // 181: invokevirtual rip/breeze/classtransform/ց.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 184: bipush 4
      // 185: anewarray 4
      // 188: dup_x1
      // 189: swap
      // 18a: bipush 3
      // 18b: swap
      // 18c: aastore
      // 18d: dup_x1
      // 18e: swap
      // 18f: bipush 2
      // 190: swap
      // 191: aastore
      // 192: dup_x1
      // 193: swap
      // 194: bipush 1
      // 195: swap
      // 196: aastore
      // 197: dup_x2
      // 198: dup_x2
      // 199: pop
      // 19a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19d: bipush 0
      // 19e: swap
      // 19f: aastore
      // 1a0: invokevirtual rip/breeze/classtransform/ô.method_004 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1a3: astore 28
      // 1a5: aload 0
      // 1a6: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 1a9: aload 26
      // 1ab: bipush 0
      // 1ac: anewarray 4
      // 1af: invokevirtual rip/breeze/classtransform/ց.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1b2: lload 19
      // 1b4: dup2_x1
      // 1b5: pop2
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
      // 1c8: invokevirtual rip/breeze/classtransform/ô.ÿ ([Ljava/lang/Object;)Ljava/lang/String;
      // 1cb: astore 29
      // 1cd: lload 3
      // 1ce: lconst_0
      // 1cf: lcmp
      // 1d0: ifle 244
      // 1d3: aload 25
      // 1d5: ifnull 244
      // 1d8: aload 0
      // 1d9: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 1dc: aload 26
      // 1de: bipush 0
      // 1df: anewarray 4
      // 1e2: invokevirtual rip/breeze/classtransform/ց.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1e5: aload 26
      // 1e7: bipush 0
      // 1e8: anewarray 4
      // 1eb: invokevirtual rip/breeze/classtransform/ց.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1ee: aload 26
      // 1f0: bipush 0
      // 1f1: anewarray 4
      // 1f4: invokevirtual rip/breeze/classtransform/ց.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1f7: lload 13
      // 1f9: dup2_x1
      // 1fa: pop2
      // 1fb: bipush 4
      // 1fc: anewarray 4
      // 1ff: dup_x1
      // 200: swap
      // 201: bipush 3
      // 202: swap
      // 203: aastore
      // 204: dup_x2
      // 205: dup_x2
      // 206: pop
      // 207: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20a: bipush 2
      // 20b: swap
      // 20c: aastore
      // 20d: dup_x1
      // 20e: swap
      // 20f: bipush 1
      // 210: swap
      // 211: aastore
      // 212: dup_x1
      // 213: swap
      // 214: bipush 0
      // 215: swap
      // 216: aastore
      // 217: invokevirtual rip/breeze/classtransform/ô.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 21a: astore 28
      // 21c: aload 0
      // 21d: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 220: aload 26
      // 222: bipush 0
      // 223: anewarray 4
      // 226: invokevirtual rip/breeze/classtransform/ց.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 229: lload 9
      // 22b: dup2_x1
      // 22c: pop2
      // 22d: bipush 2
      // 22e: anewarray 4
      // 231: dup_x1
      // 232: swap
      // 233: bipush 1
      // 234: swap
      // 235: aastore
      // 236: dup_x2
      // 237: dup_x2
      // 238: pop
      // 239: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23c: bipush 0
      // 23d: swap
      // 23e: aastore
      // 23f: invokevirtual rip/breeze/classtransform/ô.û ([Ljava/lang/Object;)Ljava/lang/String;
      // 242: astore 29
      // 244: new java/lang/StringBuilder
      // 247: dup
      // 248: invokespecial java/lang/StringBuilder.<init> ()V
      // 24b: aload 27
      // 24d: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_6 (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 250: lload 7
      // 252: bipush 1
      // 253: anewarray 4
      // 256: dup_x2
      // 257: dup_x2
      // 258: pop
      // 259: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25c: bipush 0
      // 25d: swap
      // 25e: aastore
      // 25f: invokevirtual rip/breeze/inject/MathUtil3.buildString_5 ([Ljava/lang/Object;)Ljava/lang/String;
      // 262: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 265: lload 3
      // 266: lconst_0
      // 267: lcmp
      // 268: iflt 275
      // 26b: aload 28
      // 26d: aload 25
      // 26f: ifnonnull 29d
      // 272: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 275: aload 26
      // 277: lload 23
      // 279: bipush 1
      // 27a: anewarray 4
      // 27d: dup_x2
      // 27e: dup_x2
      // 27f: pop
      // 280: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 283: bipush 0
      // 284: swap
      // 285: aastore
      // 286: invokevirtual rip/breeze/classtransform/ց.method_007 ([Ljava/lang/Object;)Z
      // 289: ifeq 2a0
      // 28c: goto 293
      // 28f: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 292: athrow
      // 293: ldc_w ":"
      // 296: goto 29d
      // 299: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29c: athrow
      // 29d: goto 2a3
      // 2a0: ldc_w ""
      // 2a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a6: aload 29
      // 2a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ab: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ae: areturn
      // 2af: aload 5
      // 2b1: aload 25
      // 2b3: ifnonnull 305
      // 2b6: ldc_w "("
      // 2b9: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2bc: ifeq 2e8
      // 2bf: goto 2c6
      // 2c2: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c5: athrow
      // 2c6: aload 0
      // 2c7: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 2ca: lload 9
      // 2cc: aload 5
      // 2ce: bipush 2
      // 2cf: anewarray 4
      // 2d2: dup_x1
      // 2d3: swap
      // 2d4: bipush 1
      // 2d5: swap
      // 2d6: aastore
      // 2d7: dup_x2
      // 2d8: dup_x2
      // 2d9: pop
      // 2da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2dd: bipush 0
      // 2de: swap
      // 2df: aastore
      // 2e0: invokevirtual rip/breeze/classtransform/ô.û ([Ljava/lang/Object;)Ljava/lang/String;
      // 2e3: areturn
      // 2e4: invokestatic rip/breeze/classtransform/ò.method_017 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e7: athrow
      // 2e8: aload 0
      // 2e9: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 2ec: lload 19
      // 2ee: aload 5
      // 2f0: bipush 2
      // 2f1: anewarray 4
      // 2f4: dup_x1
      // 2f5: swap
      // 2f6: bipush 1
      // 2f7: swap
      // 2f8: aastore
      // 2f9: dup_x2
      // 2fa: dup_x2
      // 2fb: pop
      // 2fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ff: bipush 0
      // 300: swap
      // 301: aastore
      // 302: invokevirtual rip/breeze/classtransform/ô.ÿ ([Ljava/lang/Object;)Ljava/lang/String;
      // 305: areturn
      // 306: aload 0
      // 307: getfield rip/breeze/classtransform/ò.ô_þ_2 Lrip/breeze/classtransform/ô;
      // 30a: aload 5
      // 30c: bipush 1
      // 30d: anewarray 4
      // 310: dup_x1
      // 311: swap
      // 312: bipush 0
      // 313: swap
      // 314: aastore
      // 315: invokestatic rip/breeze/classtransform/MathUtil3.buildString_2 ([Ljava/lang/Object;)Ljava/lang/String;
      // 318: lload 15
      // 31a: dup2_x1
      // 31b: pop2
      // 31c: bipush 2
      // 31d: anewarray 4
      // 320: dup_x1
      // 321: swap
      // 322: bipush 1
      // 323: swap
      // 324: aastore
      // 325: dup_x2
      // 326: dup_x2
      // 327: pop
      // 328: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32b: bipush 0
      // 32c: swap
      // 32d: aastore
      // 32e: invokevirtual rip/breeze/classtransform/ô.ý ([Ljava/lang/Object;)Ljava/lang/String;
      // 331: bipush 1
      // 332: anewarray 4
      // 335: dup_x1
      // 336: swap
      // 337: bipush 0
      // 338: swap
      // 339: aastore
      // 33a: invokestatic rip/breeze/classtransform/MathUtil3.buildString ([Ljava/lang/Object;)Ljava/lang/String;
      // 33d: areturn
      // 33e: new java/lang/IllegalStateException
      // 341: dup
      // 342: new java/lang/StringBuilder
      // 345: dup
      // 346: invokespecial java/lang/StringBuilder.<init> ()V
      // 349: sipush 26632
      // 34c: ldc2_w 4569972123725473101
      // 34f: lload 3
      // 350: lxor
      // 351: invokedynamic g (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ò.method_021 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 356: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 359: aload 2
      // 35a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 35d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 360: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 363: athrow
      // try (67 -> 74): 74 java/lang/RuntimeException
      // try (94 -> 98): 99 java/lang/RuntimeException
      // try (96 -> 119): 119 java/lang/RuntimeException
      // try (330 -> 368): 369 java/lang/RuntimeException
      // try (354 -> 372): 373 java/lang/RuntimeException
      // try (382 -> 388): 389 java/lang/RuntimeException
      // try (385 -> 411): 411 java/lang/RuntimeException
   }

   private void invoke_14(Object[] var1) {
      Object var2 = var1[0];
      List var3 = (List)var1[1];
      long var4 = (Long)var1[2];
      List var6 = (List)var1[3];
      var4 = encKey_a_2 ^ var4;
      int[] var7 = method_016();

      List var10000;
      label32: {
         try {
            var10000 = var3;
            if (var7 != null) {
               break label32;
            }

            if (var3 == null) {
               return;
            }
         } catch (RuntimeException var10) {
            throw method_017(var10);
         }

         var10000 = var3;
      }

      for (ù var9 : var10000) {
         var6.add(new ë(var2, var9, null));
         if (var7 != null) {
            break;
         }
      }
   }

   private String lambda$mapAnnotation_Inner0(ý var1, ó var2, String var3) {
      long var4 = 120685393269431L;
      long var6 = var4 ^ 72102099768557L;
      return this.method_013(new Object[]{var1, var6, var3, var2});
   }

   public static void execute_15(int[] var0) {
      arr_û_2 = var0;
   }

   public static int[] invoke_16() {
      return arr_û_2;
   }

   static {
      method_015(null);
      long var0 = 36659640226479L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[22];
      int var5 = 0;
      String var6 = "Å´Æ9ì®Is§\u00adÐ©pcc=\u0002=\u007fDS+\u009a¸\u0085\u0017\u000fÀ´¥ ·o¨&\u00adÒ\u0002ê\u009fhE\r^´+fÄ²7\u0017´\u0086±d\u0091êØ\u009f{½\u0006Gþþ¡°\t\u0019>å\u0011\f\rëÃ\u00adNèj<\u0002Å\u0084Êú)\f\r\u001cZþ§çí\nò@¬ßÞ\u0099î\u0083E¯±ÇðUGH\u007fõ\u0001ð[£ §æÛ°\u0084\u0011>È\u001b!\u008c{Û\u00947Ø¯=Àó;¾r¡\u009bH(ê*Ë\u0019)\u001bë\bö0@¥àï\u000bGhúÅá\b ²;\u001aM$+\u0004\u0006tÒËU®\fãO\u0081\u000b\u00108gúF\u0084ý\u0003Ý/R\u0097f½ë\u00031Py´Õ\u0016(#Ö^S\u009cf5&õ¬®óFDmNVßM\u0018\u0099\u0090à+¼gù\u0088ºÔöPÂ2©sb\n\u009cb\u00196\u008b(\u009fe5\u0098Ø¬>\u0083ÓuÏ¶xî3õÁ¤[ùï²+c _Û\u0014aå#HØT¿2\u0088êC\u0006]5rA\"T©\u0015ãFY\u000e\u0086\u008cçù-oÐ\nÊ\u0096\u0013ÛD@\u0097Å¥\u009aA\u008e\u0004\u0092Y\u001dD7\u0097\u009am\u0091\u001a\"ÛÖåÓi¿yh\r¥4\u0086È§Ç¼\u0091Uü((òÔ±4ÑY\u0094Ô\u0096ÀÉ\u0090'ûc¡òç«ÙäÓ£à\b¥\u0089\u001aEîÞ\u0086ø0tl\u000ekÙwPÂÔKá\u009d\u001bÖç{\u001b]ºJ\u008cÒË\u0004\u0003Ø°\u00adý\u0095\u0013k³êûí²<\u007f\u0004cT\u00846§\u009a\u0086Æ\u0019\u0088Ç\f¥\u0006\u009b$\u0089¿l\u0087p\u009f\u008f\u0003rÈ;\u0010\u0098äc}â376ýÚA\u0007I®¢÷\u0007\u001aÎ\u0010Ã\u0014\u0092\u0099®\u0013¶o\u0086Xw«ðV\u009f¼(òn\u0089°Ùøòz%_\u009f÷\u0013,âB\u001cñÈ}t)}f\r\u0005Àô+3 \u009atx\u00910@Æ&Ò8\u008bø]@è^4i'þ\"ù\u001fzãñ!7\u001augo»\u0014ærü\u0088\u0018mÆ\u009a\r\u0082×¿ÄA¥\u0014\u0005ø£\u0085\u0015xåpû%t8 ñ\u000eH\u0018©³ÿÖ'Ï<\u008a=\u0018\u0087²¥\u008axÕ|9à·|»lP(a\u0085G%Q^á#×@\u0080(ZÂM*íz7VÅ\"\u0001(U³Ê©i¼\u0015ßd\u0013eK\u0086ú×\u0005(!\u00ad4;\u0000-\u0081\u007fbÈhî<\u000f`Eðö&\u0017d(pt\u008dwÍ\u008b¾Í\u001bú.ßÛÚÝ\u0083\u0013\u0086`)Ìü¢6`ÿ\u0019¯÷UÛ§VýPã$\u009eß\u008b§ðtñôDdô\u0098<æ\u0084çÛU\u008b\u00ad\u0005#\u0097ä\u0001ëø²ãWÆÏ³à\u0091\u0005c¾ú\u0090\u0095%ñÛ?¢ì\u0085¦\"5£C1¼*í¢\u0000?ë\u0085\u00894'ÿÐ\u0000? ¦Ö_ô\u000fÐ7U\u0010|H}\u0017P\u009eÎþ|ãÝ\u0096¸\u0093þ\u0014 u\u0015 <\u0000¤uyÞÿ\u000b¬j¥óàeGHH\u000fi¥\u001e\u0013_í\u0081Úr \u0090 Ø(j;~<Â+ÎX÷08~í\u0015ò\u0086\u001bYZ¼£Ë\u0004ÄÑÓ}xvÂ89¢êSüM\u0092õ¸'G)ÕÌëµ6²¿ù\u0095Cn\u0095ÿy´v\u0085zÆØ\u009e,ù\u0083ö\u00ad\u0082ûÍÕ\u009c$~W?\u008d\u0091£¦ \u008ebë\u0090\u0018b\u0012\u008b63À\u0087S\t\u0086I\rþ½\u0001¸\u0085\f¡/ïðOv";
      int var7 = "Å´Æ9ì®Is§\u00adÐ©pcc=\u0002=\u007fDS+\u009a¸\u0085\u0017\u000fÀ´¥ ·o¨&\u00adÒ\u0002ê\u009fhE\r^´+fÄ²7\u0017´\u0086±d\u0091êØ\u009f{½\u0006Gþþ¡°\t\u0019>å\u0011\f\rëÃ\u00adNèj<\u0002Å\u0084Êú)\f\r\u001cZþ§çí\nò@¬ßÞ\u0099î\u0083E¯±ÇðUGH\u007fõ\u0001ð[£ §æÛ°\u0084\u0011>È\u001b!\u008c{Û\u00947Ø¯=Àó;¾r¡\u009bH(ê*Ë\u0019)\u001bë\bö0@¥àï\u000bGhúÅá\b ²;\u001aM$+\u0004\u0006tÒËU®\fãO\u0081\u000b\u00108gúF\u0084ý\u0003Ý/R\u0097f½ë\u00031Py´Õ\u0016(#Ö^S\u009cf5&õ¬®óFDmNVßM\u0018\u0099\u0090à+¼gù\u0088ºÔöPÂ2©sb\n\u009cb\u00196\u008b(\u009fe5\u0098Ø¬>\u0083ÓuÏ¶xî3õÁ¤[ùï²+c _Û\u0014aå#HØT¿2\u0088êC\u0006]5rA\"T©\u0015ãFY\u000e\u0086\u008cçù-oÐ\nÊ\u0096\u0013ÛD@\u0097Å¥\u009aA\u008e\u0004\u0092Y\u001dD7\u0097\u009am\u0091\u001a\"ÛÖåÓi¿yh\r¥4\u0086È§Ç¼\u0091Uü((òÔ±4ÑY\u0094Ô\u0096ÀÉ\u0090'ûc¡òç«ÙäÓ£à\b¥\u0089\u001aEîÞ\u0086ø0tl\u000ekÙwPÂÔKá\u009d\u001bÖç{\u001b]ºJ\u008cÒË\u0004\u0003Ø°\u00adý\u0095\u0013k³êûí²<\u007f\u0004cT\u00846§\u009a\u0086Æ\u0019\u0088Ç\f¥\u0006\u009b$\u0089¿l\u0087p\u009f\u008f\u0003rÈ;\u0010\u0098äc}â376ýÚA\u0007I®¢÷\u0007\u001aÎ\u0010Ã\u0014\u0092\u0099®\u0013¶o\u0086Xw«ðV\u009f¼(òn\u0089°Ùøòz%_\u009f÷\u0013,âB\u001cñÈ}t)}f\r\u0005Àô+3 \u009atx\u00910@Æ&Ò8\u008bø]@è^4i'þ\"ù\u001fzãñ!7\u001augo»\u0014ærü\u0088\u0018mÆ\u009a\r\u0082×¿ÄA¥\u0014\u0005ø£\u0085\u0015xåpû%t8 ñ\u000eH\u0018©³ÿÖ'Ï<\u008a=\u0018\u0087²¥\u008axÕ|9à·|»lP(a\u0085G%Q^á#×@\u0080(ZÂM*íz7VÅ\"\u0001(U³Ê©i¼\u0015ßd\u0013eK\u0086ú×\u0005(!\u00ad4;\u0000-\u0081\u007fbÈhî<\u000f`Eðö&\u0017d(pt\u008dwÍ\u008b¾Í\u001bú.ßÛÚÝ\u0083\u0013\u0086`)Ìü¢6`ÿ\u0019¯÷UÛ§VýPã$\u009eß\u008b§ðtñôDdô\u0098<æ\u0084çÛU\u008b\u00ad\u0005#\u0097ä\u0001ëø²ãWÆÏ³à\u0091\u0005c¾ú\u0090\u0095%ñÛ?¢ì\u0085¦\"5£C1¼*í¢\u0000?ë\u0085\u00894'ÿÐ\u0000? ¦Ö_ô\u000fÐ7U\u0010|H}\u0017P\u009eÎþ|ãÝ\u0096¸\u0093þ\u0014 u\u0015 <\u0000¤uyÞÿ\u000b¬j¥óàeGHH\u000fi¥\u001e\u0013_í\u0081Úr \u0090 Ø(j;~<Â+ÎX÷08~í\u0015ò\u0086\u001bYZ¼£Ë\u0004ÄÑÓ}xvÂ89¢êSüM\u0092õ¸'G)ÕÌëµ6²¿ù\u0095Cn\u0095ÿy´v\u0085zÆØ\u009e,ù\u0083ö\u00ad\u0082ûÍÕ\u009c$~W?\u008d\u0091£¦ \u008ebë\u0090\u0018b\u0012\u008b63À\u0087S\t\u0086I\rþ½\u0001¸\u0085\f¡/ïðOv"
         .length();
      char var8 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = method_018(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_C_2 = var4;
                     CONST_D_2 = new String[22];
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

                  var6 = "\u001cP[>Î+½\u0081X4\u000f0î[A\r8öp\u0017&\u001d4äÎF\u0017·0E¼úÐñÝ/Å{^U\u000fL\u009d\u008c,6?\u0003Ç;\u001dnkÜ\u0002W\u0098o\u008c\u000b³~Ï$\fÕúZ]Õ¶\u0000 ";
                  var7 = "\u001cP[>Î+½\u0081X4\u000f0î[A\r8öp\u0017&\u001d4äÎF\u0017·0E¼úÐñÝ/Å{^U\u000fL\u009d\u008c,6?\u0003Ç;\u001dnkÜ\u0002W\u0098o\u008c\u000b³~Ï$\fÕúZ]Õ¶\u0000 "
                     .length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static Throwable invoke_17(Throwable var0) {
      return var0;
   }

   private static String invoke_18(byte[] var0) {
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

   private static String invoke_19(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23392;
      if (CONST_D_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/ò", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C_2[var3].getBytes("ISO-8859-1");
         CONST_D_2[var3] = method_018(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D_2[var3];
   }

   private static Object call_20(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = method_019(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite invoke_21(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("method_020".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/ò" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
