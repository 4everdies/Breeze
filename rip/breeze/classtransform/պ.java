package rip.breeze.classtransform;

import java.lang.annotation.Annotation;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class պ<T extends Annotation> {
   private final Class<T> class_ÿ_2;
   private final ժ ժ_þ_2;
   private final է է_ý_2;
   private Map<String, Object> map_ü_2;
   private List<String> list_û_2;
   private rip.breeze.inject.é é_ú_2;
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   public static <T extends Annotation> T parse(Class<T> var0, ó var1, Map<String, Object> var2) {
      return new պ<T>(var0, var1.ժ_ÿ_2, var1.է_þ_2).parse(var2);
   }

   public static <T extends Annotation> T parse(Class<T> var0, ժ var1, է var2, Map<String, Object> var3) {
      return new պ<T>(var0, var1, var2).parse(var3);
   }

   @Deprecated
   public static Map invoke_1(Object[] var0) {
      List var1 = (List)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      long var4 = var2 ^ 14323880805433L;
      return չ.method_001(new Object[]{var1, var4});
   }

   @Deprecated
   public static List invoke_2(Object[] var0) {
      Map var1 = (Map)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      long var4 = var2 ^ 133089138477276L;
      return չ.method_002(new Object[]{var4, var1});
   }

   public պ(Class<T> var1, ժ var2, է var3) {
      this.class_ÿ_2 = var1;
      this.ժ_þ_2 = var2;
      this.է_ý_2 = var3;
   }

   public T parse(Map<String, Object> var1) {
      long var2 = 12311231127463L;
      long var4 = var2 ^ 57434060750759L;
      long var6 = var2 ^ 132724396773016L;
      long var8 = var2 ^ 15023272103753L;
      long var10 = var2 ^ 18184320206110L;
      long var12 = var2 ^ 105954221378245L;
      long var14 = var2 ^ 133900795027990L;
      String[] var10000 = չ.method_069();
      this.method_003(new Object[]{var6, var1});
      String[] var16 = var10000;
      this.method_004(new Object[]{var10});
      this.method_005(new Object[]{var12});

      try {
         var20 = (Annotation)ո.method_003(new Object[]{var14, MathUtil3.method_004(new Object[]{this.é_ú_2, this.ժ_þ_2, this.է_ý_2, var4})})
            .method_007(new Object[]{new Class[]{ժ.class, է.class, Map.class}, var8, new Object[]{this.ժ_þ_2, this.է_ý_2, this.map_ü_2}});
      } catch (Throwable var18) {
         throw new IllegalStateException(((String)null) + this.class_ÿ_2.getName() + "'", var18);
      }

      if (var16 == null) {
         boolean var10001;
         label24: {
            try {
               if (rip.breeze.inject.ջ.method_012()) {
                  var10001 = false;
                  break label24;
               }
            } catch (Throwable var19) {
               throw method_023(var19);
            }

            var10001 = true;
         }

         rip.breeze.inject.ջ.method_011(var10001);
      }

      return (T)var20;
   }

   private void invoke_3(Object[] param1) {
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
      // 0e: checkcast java/util/Map
      // 11: astore 4
      // 13: pop
      // 14: getstatic rip/breeze/classtransform/պ.encKey_a_2 J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: invokestatic rip/breeze/classtransform/չ.method_069 ()[Ljava/lang/String;
      // 1d: aload 0
      // 1e: new java/util/ArrayList
      // 21: dup
      // 22: invokespecial java/util/ArrayList.<init> ()V
      // 25: putfield rip/breeze/classtransform/պ.list_û_2 Ljava/util/List;
      // 28: aload 0
      // 29: getfield rip/breeze/classtransform/պ.class_ÿ_2 Ljava/lang/Class;
      // 2c: invokevirtual java/lang/Class.getDeclaredMethods ()[Ljava/lang/reflect/Method;
      // 2f: astore 5
      // 31: aload 5
      // 33: arraylength
      // 34: istore 6
      // 36: bipush 0
      // 37: istore 7
      // 39: astore 8
      // 3b: iload 7
      // 3d: iload 6
      // 3f: if_icmpge c1
      // 42: aload 5
      // 44: iload 7
      // 46: aaload
      // 47: astore 9
      // 49: aload 8
      // 4b: ifnull cd
      // 4e: aload 4
      // 50: aload 8
      // 52: ifnull 7c
      // 55: goto 5c
      // 58: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: aload 9
      // 5e: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 61: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 66: ifeq 77
      // 69: goto 70
      // 6c: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: goto b9
      // 73: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: aload 9
      // 79: invokevirtual java/lang/reflect/Method.getDefaultValue ()Ljava/lang/Object;
      // 7c: astore 10
      // 7e: lload 2
      // 7f: lconst_0
      // 80: lcmp
      // 81: iflt aa
      // 84: aload 10
      // 86: aload 8
      // 88: ifnull a9
      // 8b: ifnonnull 9b
      // 8e: goto 95
      // 91: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 94: athrow
      // 95: lload 2
      // 96: lconst_0
      // 97: lcmp
      // 98: ifgt b9
      // 9b: aload 4
      // 9d: aload 9
      // 9f: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // a2: aload 10
      // a4: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // a9: pop
      // aa: aload 0
      // ab: getfield rip/breeze/classtransform/պ.list_û_2 Ljava/util/List;
      // ae: aload 9
      // b0: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // b3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // b8: pop
      // b9: iinc 7 1
      // bc: aload 8
      // be: ifnonnull 3b
      // c1: aload 0
      // c2: aload 4
      // c4: putfield rip/breeze/classtransform/պ.map_ü_2 Ljava/util/Map;
      // c7: lload 2
      // c8: lconst_0
      // c9: lcmp
      // ca: iflt cd
      // cd: return
      // try (40 -> 45): 46 java/lang/IllegalStateException
      // try (42 -> 52): 53 java/lang/IllegalStateException
      // try (48 -> 56): 56 java/lang/IllegalStateException
      // try (61 -> 69): 70 java/lang/IllegalStateException
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: pop
      // 00c: getstatic rip/breeze/classtransform/պ.encKey_a_2 J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 15552410844929
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 116536854267108
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 9113897195224
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 28060049173886
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 3602251944131
      // 033: lxor
      // 034: lstore 12
      // 036: dup2
      // 037: ldc2_w 51503792883094
      // 03a: lxor
      // 03b: lstore 14
      // 03d: dup2
      // 03e: ldc2_w 129341289896577
      // 041: lxor
      // 042: lstore 16
      // 044: dup2
      // 045: ldc2_w 27010782492320
      // 048: lxor
      // 049: lstore 18
      // 04b: dup2
      // 04c: ldc2_w 81067924107524
      // 04f: lxor
      // 050: lstore 20
      // 052: dup2
      // 053: ldc2_w 8435267400688
      // 056: lxor
      // 057: lstore 22
      // 059: dup2
      // 05a: ldc2_w 92119772953060
      // 05d: lxor
      // 05e: lstore 24
      // 060: dup2
      // 061: ldc2_w 22959901008746
      // 064: lxor
      // 065: lstore 26
      // 067: dup2
      // 068: ldc2_w 82870743315396
      // 06b: lxor
      // 06c: lstore 28
      // 06e: dup2
      // 06f: ldc2_w 130400792707680
      // 072: lxor
      // 073: lstore 30
      // 075: dup2
      // 076: ldc2_w 94754542416930
      // 079: lxor
      // 07a: lstore 32
      // 07c: dup2
      // 07d: ldc2_w 113449542718710
      // 080: lxor
      // 081: lstore 34
      // 083: dup2
      // 084: ldc2_w 18520627589966
      // 087: lxor
      // 088: lstore 36
      // 08a: dup2
      // 08b: ldc2_w 113709626665235
      // 08e: lxor
      // 08f: lstore 38
      // 091: pop2
      // 092: aload 0
      // 093: new rip/breeze/inject/é
      // 096: dup
      // 097: lload 10
      // 099: invokespecial rip/breeze/inject/é.<init> (J)V
      // 09c: putfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 09f: aload 0
      // 0a0: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 0a3: bipush 52
      // 0a5: bipush 1
      // 0a6: sipush 12647
      // 0a9: ldc2_w 3282024139597862079
      // 0ac: lload 2
      // 0ad: lxor
      // 0ae: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: lload 4
      // 0b5: bipush 2
      // 0b6: anewarray 5
      // 0b9: dup_x2
      // 0ba: dup_x2
      // 0bb: pop
      // 0bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bf: bipush 1
      // 0c0: swap
      // 0c1: aastore
      // 0c2: dup_x1
      // 0c3: swap
      // 0c4: bipush 0
      // 0c5: swap
      // 0c6: aastore
      // 0c7: invokestatic rip/breeze/classtransform/ո.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0ca: aconst_null
      // 0cb: getstatic rip/breeze/classtransform/ջ.CONST_Þ_2 Ljava/lang/String;
      // 0ce: bipush 2
      // 0cf: anewarray 277
      // 0d2: dup
      // 0d3: bipush 0
      // 0d4: aload 0
      // 0d5: getfield rip/breeze/classtransform/պ.class_ÿ_2 Ljava/lang/Class;
      // 0d8: lload 36
      // 0da: dup2_x1
      // 0db: pop2
      // 0dc: bipush 2
      // 0dd: anewarray 5
      // 0e0: dup_x1
      // 0e1: swap
      // 0e2: bipush 1
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x2
      // 0e6: dup_x2
      // 0e7: pop
      // 0e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb: bipush 0
      // 0ec: swap
      // 0ed: aastore
      // 0ee: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0f1: aastore
      // 0f2: dup
      // 0f3: bipush 1
      // 0f4: lload 36
      // 0f6: ldc_w rip/breeze/classtransform/շ
      // 0f9: bipush 2
      // 0fa: anewarray 5
      // 0fd: dup_x1
      // 0fe: swap
      // 0ff: bipush 1
      // 100: swap
      // 101: aastore
      // 102: dup_x2
      // 103: dup_x2
      // 104: pop
      // 105: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 108: bipush 0
      // 109: swap
      // 10a: aastore
      // 10b: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 10e: aastore
      // 10f: lload 26
      // 111: bipush 7
      // 113: anewarray 5
      // 116: dup_x2
      // 117: dup_x2
      // 118: pop
      // 119: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11c: bipush 6
      // 11e: swap
      // 11f: aastore
      // 120: dup_x1
      // 121: swap
      // 122: bipush 5
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: bipush 4
      // 128: swap
      // 129: aastore
      // 12a: dup_x1
      // 12b: swap
      // 12c: bipush 3
      // 12d: swap
      // 12e: aastore
      // 12f: dup_x1
      // 130: swap
      // 131: bipush 2
      // 132: swap
      // 133: aastore
      // 134: dup_x1
      // 135: swap
      // 136: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 139: bipush 1
      // 13a: swap
      // 13b: aastore
      // 13c: dup_x1
      // 13d: swap
      // 13e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 141: bipush 0
      // 142: swap
      // 143: aastore
      // 144: invokevirtual rip/breeze/inject/é.method_001 ([Ljava/lang/Object;)V
      // 147: aload 0
      // 148: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 14b: bipush 2
      // 14c: sipush 3173
      // 14f: ldc2_w 1766362716967692673
      // 152: lload 2
      // 153: lxor
      // 154: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: lload 20
      // 15b: ldc rip/breeze/classtransform/ժ
      // 15d: bipush 2
      // 15e: anewarray 5
      // 161: dup_x1
      // 162: swap
      // 163: bipush 1
      // 164: swap
      // 165: aastore
      // 166: dup_x2
      // 167: dup_x2
      // 168: pop
      // 169: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16c: bipush 0
      // 16d: swap
      // 16e: aastore
      // 16f: invokestatic rip/breeze/classtransform/ջ.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 172: aconst_null
      // 173: aconst_null
      // 174: lload 6
      // 176: bipush 6
      // 178: anewarray 5
      // 17b: dup_x2
      // 17c: dup_x2
      // 17d: pop
      // 17e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 181: bipush 5
      // 182: swap
      // 183: aastore
      // 184: dup_x1
      // 185: swap
      // 186: bipush 4
      // 187: swap
      // 188: aastore
      // 189: dup_x1
      // 18a: swap
      // 18b: bipush 3
      // 18c: swap
      // 18d: aastore
      // 18e: dup_x1
      // 18f: swap
      // 190: bipush 2
      // 191: swap
      // 192: aastore
      // 193: dup_x1
      // 194: swap
      // 195: bipush 1
      // 196: swap
      // 197: aastore
      // 198: dup_x1
      // 199: swap
      // 19a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19d: bipush 0
      // 19e: swap
      // 19f: aastore
      // 1a0: invokevirtual rip/breeze/inject/é.method_013 ([Ljava/lang/Object;)Lrip/breeze/inject/ä;
      // 1a3: lload 24
      // 1a5: bipush 1
      // 1a6: anewarray 5
      // 1a9: dup_x2
      // 1aa: dup_x2
      // 1ab: pop
      // 1ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1af: bipush 0
      // 1b0: swap
      // 1b1: aastore
      // 1b2: invokevirtual rip/breeze/inject/ä.method_004 ([Ljava/lang/Object;)V
      // 1b5: aload 0
      // 1b6: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 1b9: bipush 2
      // 1ba: sipush 7176
      // 1bd: ldc2_w 7241100102212516303
      // 1c0: lload 2
      // 1c1: lxor
      // 1c2: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: lload 20
      // 1c9: ldc rip/breeze/classtransform/է
      // 1cb: bipush 2
      // 1cc: anewarray 5
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: bipush 1
      // 1d2: swap
      // 1d3: aastore
      // 1d4: dup_x2
      // 1d5: dup_x2
      // 1d6: pop
      // 1d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1da: bipush 0
      // 1db: swap
      // 1dc: aastore
      // 1dd: invokestatic rip/breeze/classtransform/ջ.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1e0: aconst_null
      // 1e1: aconst_null
      // 1e2: lload 6
      // 1e4: bipush 6
      // 1e6: anewarray 5
      // 1e9: dup_x2
      // 1ea: dup_x2
      // 1eb: pop
      // 1ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ef: bipush 5
      // 1f0: swap
      // 1f1: aastore
      // 1f2: dup_x1
      // 1f3: swap
      // 1f4: bipush 4
      // 1f5: swap
      // 1f6: aastore
      // 1f7: dup_x1
      // 1f8: swap
      // 1f9: bipush 3
      // 1fa: swap
      // 1fb: aastore
      // 1fc: dup_x1
      // 1fd: swap
      // 1fe: bipush 2
      // 1ff: swap
      // 200: aastore
      // 201: dup_x1
      // 202: swap
      // 203: bipush 1
      // 204: swap
      // 205: aastore
      // 206: dup_x1
      // 207: swap
      // 208: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 20b: bipush 0
      // 20c: swap
      // 20d: aastore
      // 20e: invokevirtual rip/breeze/inject/é.method_013 ([Ljava/lang/Object;)Lrip/breeze/inject/ä;
      // 211: lload 24
      // 213: bipush 1
      // 214: anewarray 5
      // 217: dup_x2
      // 218: dup_x2
      // 219: pop
      // 21a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21d: bipush 0
      // 21e: swap
      // 21f: aastore
      // 220: invokevirtual rip/breeze/inject/ä.method_004 ([Ljava/lang/Object;)V
      // 223: invokestatic rip/breeze/classtransform/չ.method_069 ()[Ljava/lang/String;
      // 226: aload 0
      // 227: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 22a: bipush 2
      // 22b: sipush 14202
      // 22e: ldc2_w 5079576120957719231
      // 231: lload 2
      // 232: lxor
      // 233: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 238: lload 20
      // 23a: ldc java/util/Map
      // 23c: bipush 2
      // 23d: anewarray 5
      // 240: dup_x1
      // 241: swap
      // 242: bipush 1
      // 243: swap
      // 244: aastore
      // 245: dup_x2
      // 246: dup_x2
      // 247: pop
      // 248: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24b: bipush 0
      // 24c: swap
      // 24d: aastore
      // 24e: invokestatic rip/breeze/classtransform/ջ.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 251: aconst_null
      // 252: aconst_null
      // 253: lload 6
      // 255: bipush 6
      // 257: anewarray 5
      // 25a: dup_x2
      // 25b: dup_x2
      // 25c: pop
      // 25d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 260: bipush 5
      // 261: swap
      // 262: aastore
      // 263: dup_x1
      // 264: swap
      // 265: bipush 4
      // 266: swap
      // 267: aastore
      // 268: dup_x1
      // 269: swap
      // 26a: bipush 3
      // 26b: swap
      // 26c: aastore
      // 26d: dup_x1
      // 26e: swap
      // 26f: bipush 2
      // 270: swap
      // 271: aastore
      // 272: dup_x1
      // 273: swap
      // 274: bipush 1
      // 275: swap
      // 276: aastore
      // 277: dup_x1
      // 278: swap
      // 279: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 27c: bipush 0
      // 27d: swap
      // 27e: aastore
      // 27f: invokevirtual rip/breeze/inject/é.method_013 ([Ljava/lang/Object;)Lrip/breeze/inject/ä;
      // 282: lload 24
      // 284: bipush 1
      // 285: anewarray 5
      // 288: dup_x2
      // 289: dup_x2
      // 28a: pop
      // 28b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28e: bipush 0
      // 28f: swap
      // 290: aastore
      // 291: invokevirtual rip/breeze/inject/ä.method_004 ([Ljava/lang/Object;)V
      // 294: aload 0
      // 295: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 298: bipush 1
      // 299: lload 30
      // 29b: sipush 11705
      // 29e: ldc2_w 3351267115463264377
      // 2a1: lload 2
      // 2a2: lxor
      // 2a3: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a8: lload 8
      // 2aa: getstatic java/lang/Void.TYPE Ljava/lang/Class;
      // 2ad: bipush 3
      // 2ae: anewarray 5
      // 2b1: dup
      // 2b2: bipush 0
      // 2b3: ldc rip/breeze/classtransform/ժ
      // 2b5: aastore
      // 2b6: dup
      // 2b7: bipush 1
      // 2b8: ldc rip/breeze/classtransform/է
      // 2ba: aastore
      // 2bb: dup
      // 2bc: bipush 2
      // 2bd: ldc java/util/Map
      // 2bf: aastore
      // 2c0: bipush 3
      // 2c1: anewarray 5
      // 2c4: dup_x1
      // 2c5: swap
      // 2c6: bipush 2
      // 2c7: swap
      // 2c8: aastore
      // 2c9: dup_x1
      // 2ca: swap
      // 2cb: bipush 1
      // 2cc: swap
      // 2cd: aastore
      // 2ce: dup_x2
      // 2cf: dup_x2
      // 2d0: pop
      // 2d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d4: bipush 0
      // 2d5: swap
      // 2d6: aastore
      // 2d7: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 2da: aconst_null
      // 2db: aconst_null
      // 2dc: bipush 6
      // 2de: anewarray 5
      // 2e1: dup_x1
      // 2e2: swap
      // 2e3: bipush 5
      // 2e4: swap
      // 2e5: aastore
      // 2e6: dup_x1
      // 2e7: swap
      // 2e8: bipush 4
      // 2e9: swap
      // 2ea: aastore
      // 2eb: dup_x1
      // 2ec: swap
      // 2ed: bipush 3
      // 2ee: swap
      // 2ef: aastore
      // 2f0: dup_x1
      // 2f1: swap
      // 2f2: bipush 2
      // 2f3: swap
      // 2f4: aastore
      // 2f5: dup_x2
      // 2f6: dup_x2
      // 2f7: pop
      // 2f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2fb: bipush 1
      // 2fc: swap
      // 2fd: aastore
      // 2fe: dup_x1
      // 2ff: swap
      // 300: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 303: bipush 0
      // 304: swap
      // 305: aastore
      // 306: invokevirtual rip/breeze/inject/é.method_014 ([Ljava/lang/Object;)Lrip/breeze/inject/Util140;
      // 309: astore 40
      // 30b: aload 40
      // 30d: lload 34
      // 30f: bipush 25
      // 311: bipush 0
      // 312: bipush 3
      // 313: anewarray 5
      // 316: dup_x1
      // 317: swap
      // 318: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 31b: bipush 2
      // 31c: swap
      // 31d: aastore
      // 31e: dup_x1
      // 31f: swap
      // 320: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
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
      // 32f: invokevirtual rip/breeze/inject/Util140.processAll_8 ([Ljava/lang/Object;)V
      // 332: aload 40
      // 334: lload 12
      // 336: sipush 183
      // 339: getstatic rip/breeze/classtransform/ջ.CONST_Þ_2 Ljava/lang/String;
      // 33c: sipush 5949
      // 33f: ldc2_w 7967951040512553710
      // 342: lload 2
      // 343: lxor
      // 344: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 349: getstatic rip/breeze/classtransform/ջ.CONST_Ò_2 Ljava/lang/String;
      // 34c: bipush 0
      // 34d: bipush 6
      // 34f: anewarray 5
      // 352: dup_x1
      // 353: swap
      // 354: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 357: bipush 5
      // 358: swap
      // 359: aastore
      // 35a: dup_x1
      // 35b: swap
      // 35c: bipush 4
      // 35d: swap
      // 35e: aastore
      // 35f: dup_x1
      // 360: swap
      // 361: bipush 3
      // 362: swap
      // 363: aastore
      // 364: dup_x1
      // 365: swap
      // 366: bipush 2
      // 367: swap
      // 368: aastore
      // 369: dup_x1
      // 36a: swap
      // 36b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 36e: bipush 1
      // 36f: swap
      // 370: aastore
      // 371: dup_x2
      // 372: dup_x2
      // 373: pop
      // 374: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 377: bipush 0
      // 378: swap
      // 379: aastore
      // 37a: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 37d: aload 40
      // 37f: lload 34
      // 381: bipush 25
      // 383: bipush 0
      // 384: bipush 3
      // 385: anewarray 5
      // 388: dup_x1
      // 389: swap
      // 38a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 38d: bipush 2
      // 38e: swap
      // 38f: aastore
      // 390: dup_x1
      // 391: swap
      // 392: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 395: bipush 1
      // 396: swap
      // 397: aastore
      // 398: dup_x2
      // 399: dup_x2
      // 39a: pop
      // 39b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 39e: bipush 0
      // 39f: swap
      // 3a0: aastore
      // 3a1: invokevirtual rip/breeze/inject/Util140.processAll_8 ([Ljava/lang/Object;)V
      // 3a4: aload 40
      // 3a6: lload 34
      // 3a8: bipush 25
      // 3aa: bipush 1
      // 3ab: bipush 3
      // 3ac: anewarray 5
      // 3af: dup_x1
      // 3b0: swap
      // 3b1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3b4: bipush 2
      // 3b5: swap
      // 3b6: aastore
      // 3b7: dup_x1
      // 3b8: swap
      // 3b9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3bc: bipush 1
      // 3bd: swap
      // 3be: aastore
      // 3bf: dup_x2
      // 3c0: dup_x2
      // 3c1: pop
      // 3c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3c5: bipush 0
      // 3c6: swap
      // 3c7: aastore
      // 3c8: invokevirtual rip/breeze/inject/Util140.processAll_8 ([Ljava/lang/Object;)V
      // 3cb: aload 40
      // 3cd: sipush 181
      // 3d0: aload 0
      // 3d1: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 3d4: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 3d7: lload 18
      // 3d9: dup2_x1
      // 3da: pop2
      // 3db: sipush 14658
      // 3de: ldc2_w 8750553308751584400
      // 3e1: lload 2
      // 3e2: lxor
      // 3e3: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e8: lload 20
      // 3ea: ldc rip/breeze/classtransform/ժ
      // 3ec: bipush 2
      // 3ed: anewarray 5
      // 3f0: dup_x1
      // 3f1: swap
      // 3f2: bipush 1
      // 3f3: swap
      // 3f4: aastore
      // 3f5: dup_x2
      // 3f6: dup_x2
      // 3f7: pop
      // 3f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3fb: bipush 0
      // 3fc: swap
      // 3fd: aastore
      // 3fe: invokestatic rip/breeze/classtransform/ջ.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 401: bipush 5
      // 402: anewarray 5
      // 405: dup_x1
      // 406: swap
      // 407: bipush 4
      // 408: swap
      // 409: aastore
      // 40a: dup_x1
      // 40b: swap
      // 40c: bipush 3
      // 40d: swap
      // 40e: aastore
      // 40f: dup_x1
      // 410: swap
      // 411: bipush 2
      // 412: swap
      // 413: aastore
      // 414: dup_x2
      // 415: dup_x2
      // 416: pop
      // 417: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41a: bipush 1
      // 41b: swap
      // 41c: aastore
      // 41d: dup_x1
      // 41e: swap
      // 41f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 422: bipush 0
      // 423: swap
      // 424: aastore
      // 425: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 428: aload 40
      // 42a: lload 34
      // 42c: bipush 25
      // 42e: bipush 0
      // 42f: bipush 3
      // 430: anewarray 5
      // 433: dup_x1
      // 434: swap
      // 435: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 438: bipush 2
      // 439: swap
      // 43a: aastore
      // 43b: dup_x1
      // 43c: swap
      // 43d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 440: bipush 1
      // 441: swap
      // 442: aastore
      // 443: dup_x2
      // 444: dup_x2
      // 445: pop
      // 446: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 449: bipush 0
      // 44a: swap
      // 44b: aastore
      // 44c: invokevirtual rip/breeze/inject/Util140.processAll_8 ([Ljava/lang/Object;)V
      // 44f: aload 40
      // 451: lload 34
      // 453: bipush 25
      // 455: bipush 2
      // 456: bipush 3
      // 457: anewarray 5
      // 45a: dup_x1
      // 45b: swap
      // 45c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 45f: bipush 2
      // 460: swap
      // 461: aastore
      // 462: dup_x1
      // 463: swap
      // 464: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 467: bipush 1
      // 468: swap
      // 469: aastore
      // 46a: dup_x2
      // 46b: dup_x2
      // 46c: pop
      // 46d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 470: bipush 0
      // 471: swap
      // 472: aastore
      // 473: invokevirtual rip/breeze/inject/Util140.processAll_8 ([Ljava/lang/Object;)V
      // 476: aload 40
      // 478: sipush 181
      // 47b: aload 0
      // 47c: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 47f: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 482: lload 18
      // 484: dup2_x1
      // 485: pop2
      // 486: sipush 929
      // 489: ldc2_w 201021086108083820
      // 48c: lload 2
      // 48d: lxor
      // 48e: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 493: lload 20
      // 495: ldc rip/breeze/classtransform/է
      // 497: bipush 2
      // 498: anewarray 5
      // 49b: dup_x1
      // 49c: swap
      // 49d: bipush 1
      // 49e: swap
      // 49f: aastore
      // 4a0: dup_x2
      // 4a1: dup_x2
      // 4a2: pop
      // 4a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a6: bipush 0
      // 4a7: swap
      // 4a8: aastore
      // 4a9: invokestatic rip/breeze/classtransform/ջ.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 4ac: bipush 5
      // 4ad: anewarray 5
      // 4b0: dup_x1
      // 4b1: swap
      // 4b2: bipush 4
      // 4b3: swap
      // 4b4: aastore
      // 4b5: dup_x1
      // 4b6: swap
      // 4b7: bipush 3
      // 4b8: swap
      // 4b9: aastore
      // 4ba: dup_x1
      // 4bb: swap
      // 4bc: bipush 2
      // 4bd: swap
      // 4be: aastore
      // 4bf: dup_x2
      // 4c0: dup_x2
      // 4c1: pop
      // 4c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c5: bipush 1
      // 4c6: swap
      // 4c7: aastore
      // 4c8: dup_x1
      // 4c9: swap
      // 4ca: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4cd: bipush 0
      // 4ce: swap
      // 4cf: aastore
      // 4d0: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 4d3: aload 40
      // 4d5: lload 34
      // 4d7: bipush 25
      // 4d9: bipush 0
      // 4da: bipush 3
      // 4db: anewarray 5
      // 4de: dup_x1
      // 4df: swap
      // 4e0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4e3: bipush 2
      // 4e4: swap
      // 4e5: aastore
      // 4e6: dup_x1
      // 4e7: swap
      // 4e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4eb: bipush 1
      // 4ec: swap
      // 4ed: aastore
      // 4ee: dup_x2
      // 4ef: dup_x2
      // 4f0: pop
      // 4f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f4: bipush 0
      // 4f5: swap
      // 4f6: aastore
      // 4f7: invokevirtual rip/breeze/inject/Util140.processAll_8 ([Ljava/lang/Object;)V
      // 4fa: aload 40
      // 4fc: lload 34
      // 4fe: bipush 25
      // 500: bipush 3
      // 501: bipush 3
      // 502: anewarray 5
      // 505: dup_x1
      // 506: swap
      // 507: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 50a: bipush 2
      // 50b: swap
      // 50c: aastore
      // 50d: dup_x1
      // 50e: swap
      // 50f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 512: bipush 1
      // 513: swap
      // 514: aastore
      // 515: dup_x2
      // 516: dup_x2
      // 517: pop
      // 518: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51b: bipush 0
      // 51c: swap
      // 51d: aastore
      // 51e: invokevirtual rip/breeze/inject/Util140.processAll_8 ([Ljava/lang/Object;)V
      // 521: aload 40
      // 523: sipush 181
      // 526: aload 0
      // 527: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 52a: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 52d: lload 18
      // 52f: dup2_x1
      // 530: pop2
      // 531: sipush 3364
      // 534: ldc2_w 6012300708915538164
      // 537: lload 2
      // 538: lxor
      // 539: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53e: lload 20
      // 540: ldc java/util/Map
      // 542: bipush 2
      // 543: anewarray 5
      // 546: dup_x1
      // 547: swap
      // 548: bipush 1
      // 549: swap
      // 54a: aastore
      // 54b: dup_x2
      // 54c: dup_x2
      // 54d: pop
      // 54e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 551: bipush 0
      // 552: swap
      // 553: aastore
      // 554: invokestatic rip/breeze/classtransform/ջ.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 557: bipush 5
      // 558: anewarray 5
      // 55b: dup_x1
      // 55c: swap
      // 55d: bipush 4
      // 55e: swap
      // 55f: aastore
      // 560: dup_x1
      // 561: swap
      // 562: bipush 3
      // 563: swap
      // 564: aastore
      // 565: dup_x1
      // 566: swap
      // 567: bipush 2
      // 568: swap
      // 569: aastore
      // 56a: dup_x2
      // 56b: dup_x2
      // 56c: pop
      // 56d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 570: bipush 1
      // 571: swap
      // 572: aastore
      // 573: dup_x1
      // 574: swap
      // 575: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 578: bipush 0
      // 579: swap
      // 57a: aastore
      // 57b: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 57e: aload 40
      // 580: sipush 177
      // 583: lload 28
      // 585: bipush 2
      // 586: anewarray 5
      // 589: dup_x2
      // 58a: dup_x2
      // 58b: pop
      // 58c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 58f: bipush 1
      // 590: swap
      // 591: aastore
      // 592: dup_x1
      // 593: swap
      // 594: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 597: bipush 0
      // 598: swap
      // 599: aastore
      // 59a: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 59d: aload 40
      // 59f: lload 38
      // 5a1: bipush 1
      // 5a2: anewarray 5
      // 5a5: dup_x2
      // 5a6: dup_x2
      // 5a7: pop
      // 5a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5ab: bipush 0
      // 5ac: swap
      // 5ad: aastore
      // 5ae: invokevirtual rip/breeze/inject/Util140.processAll_25 ([Ljava/lang/Object;)V
      // 5b1: aload 0
      // 5b2: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 5b5: bipush 1
      // 5b6: lload 30
      // 5b8: sipush 28088
      // 5bb: ldc2_w 1028966026534946921
      // 5be: lload 2
      // 5bf: lxor
      // 5c0: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c5: lload 8
      // 5c7: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 5ca: bipush 1
      // 5cb: anewarray 5
      // 5ce: dup
      // 5cf: bipush 0
      // 5d0: ldc java/lang/Object
      // 5d2: aastore
      // 5d3: bipush 3
      // 5d4: anewarray 5
      // 5d7: dup_x1
      // 5d8: swap
      // 5d9: bipush 2
      // 5da: swap
      // 5db: aastore
      // 5dc: dup_x1
      // 5dd: swap
      // 5de: bipush 1
      // 5df: swap
      // 5e0: aastore
      // 5e1: dup_x2
      // 5e2: dup_x2
      // 5e3: pop
      // 5e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e7: bipush 0
      // 5e8: swap
      // 5e9: aastore
      // 5ea: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 5ed: aconst_null
      // 5ee: aconst_null
      // 5ef: bipush 6
      // 5f1: anewarray 5
      // 5f4: dup_x1
      // 5f5: swap
      // 5f6: bipush 5
      // 5f7: swap
      // 5f8: aastore
      // 5f9: dup_x1
      // 5fa: swap
      // 5fb: bipush 4
      // 5fc: swap
      // 5fd: aastore
      // 5fe: dup_x1
      // 5ff: swap
      // 600: bipush 3
      // 601: swap
      // 602: aastore
      // 603: dup_x1
      // 604: swap
      // 605: bipush 2
      // 606: swap
      // 607: aastore
      // 608: dup_x2
      // 609: dup_x2
      // 60a: pop
      // 60b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 60e: bipush 1
      // 60f: swap
      // 610: aastore
      // 611: dup_x1
      // 612: swap
      // 613: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 616: bipush 0
      // 617: swap
      // 618: aastore
      // 619: invokevirtual rip/breeze/inject/é.method_014 ([Ljava/lang/Object;)Lrip/breeze/inject/Util140;
      // 61c: astore 40
      // 61e: aload 40
      // 620: bipush 3
      // 621: lload 28
      // 623: bipush 2
      // 624: anewarray 5
      // 627: dup_x2
      // 628: dup_x2
      // 629: pop
      // 62a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 62d: bipush 1
      // 62e: swap
      // 62f: aastore
      // 630: dup_x1
      // 631: swap
      // 632: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 635: bipush 0
      // 636: swap
      // 637: aastore
      // 638: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 63b: aload 40
      // 63d: sipush 172
      // 640: lload 28
      // 642: bipush 2
      // 643: anewarray 5
      // 646: dup_x2
      // 647: dup_x2
      // 648: pop
      // 649: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 64c: bipush 1
      // 64d: swap
      // 64e: aastore
      // 64f: dup_x1
      // 650: swap
      // 651: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 654: bipush 0
      // 655: swap
      // 656: aastore
      // 657: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 65a: aload 40
      // 65c: lload 38
      // 65e: bipush 1
      // 65f: anewarray 5
      // 662: dup_x2
      // 663: dup_x2
      // 664: pop
      // 665: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 668: bipush 0
      // 669: swap
      // 66a: aastore
      // 66b: invokevirtual rip/breeze/inject/Util140.processAll_25 ([Ljava/lang/Object;)V
      // 66e: aload 0
      // 66f: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 672: bipush 1
      // 673: lload 30
      // 675: sipush 16409
      // 678: ldc2_w 8077219403777549764
      // 67b: lload 2
      // 67c: lxor
      // 67d: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 682: lload 8
      // 684: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 687: bipush 0
      // 688: anewarray 5
      // 68b: bipush 3
      // 68c: anewarray 5
      // 68f: dup_x1
      // 690: swap
      // 691: bipush 2
      // 692: swap
      // 693: aastore
      // 694: dup_x1
      // 695: swap
      // 696: bipush 1
      // 697: swap
      // 698: aastore
      // 699: dup_x2
      // 69a: dup_x2
      // 69b: pop
      // 69c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 69f: bipush 0
      // 6a0: swap
      // 6a1: aastore
      // 6a2: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 6a5: aconst_null
      // 6a6: aconst_null
      // 6a7: bipush 6
      // 6a9: anewarray 5
      // 6ac: dup_x1
      // 6ad: swap
      // 6ae: bipush 5
      // 6af: swap
      // 6b0: aastore
      // 6b1: dup_x1
      // 6b2: swap
      // 6b3: bipush 4
      // 6b4: swap
      // 6b5: aastore
      // 6b6: dup_x1
      // 6b7: swap
      // 6b8: bipush 3
      // 6b9: swap
      // 6ba: aastore
      // 6bb: dup_x1
      // 6bc: swap
      // 6bd: bipush 2
      // 6be: swap
      // 6bf: aastore
      // 6c0: dup_x2
      // 6c1: dup_x2
      // 6c2: pop
      // 6c3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c6: bipush 1
      // 6c7: swap
      // 6c8: aastore
      // 6c9: dup_x1
      // 6ca: swap
      // 6cb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6ce: bipush 0
      // 6cf: swap
      // 6d0: aastore
      // 6d1: invokevirtual rip/breeze/inject/é.method_014 ([Ljava/lang/Object;)Lrip/breeze/inject/Util140;
      // 6d4: astore 40
      // 6d6: aload 40
      // 6d8: bipush 3
      // 6d9: lload 28
      // 6db: bipush 2
      // 6dc: anewarray 5
      // 6df: dup_x2
      // 6e0: dup_x2
      // 6e1: pop
      // 6e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e5: bipush 1
      // 6e6: swap
      // 6e7: aastore
      // 6e8: dup_x1
      // 6e9: swap
      // 6ea: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6ed: bipush 0
      // 6ee: swap
      // 6ef: aastore
      // 6f0: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 6f3: aload 40
      // 6f5: sipush 172
      // 6f8: lload 28
      // 6fa: bipush 2
      // 6fb: anewarray 5
      // 6fe: dup_x2
      // 6ff: dup_x2
      // 700: pop
      // 701: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 704: bipush 1
      // 705: swap
      // 706: aastore
      // 707: dup_x1
      // 708: swap
      // 709: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 70c: bipush 0
      // 70d: swap
      // 70e: aastore
      // 70f: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 712: aload 40
      // 714: lload 38
      // 716: bipush 1
      // 717: anewarray 5
      // 71a: dup_x2
      // 71b: dup_x2
      // 71c: pop
      // 71d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 720: bipush 0
      // 721: swap
      // 722: aastore
      // 723: invokevirtual rip/breeze/inject/Util140.processAll_25 ([Ljava/lang/Object;)V
      // 726: aload 0
      // 727: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 72a: bipush 1
      // 72b: lload 30
      // 72d: sipush 20765
      // 730: ldc2_w 6557774990111257817
      // 733: lload 2
      // 734: lxor
      // 735: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73a: lload 8
      // 73c: ldc_w java/lang/String
      // 73f: bipush 0
      // 740: anewarray 5
      // 743: bipush 3
      // 744: anewarray 5
      // 747: dup_x1
      // 748: swap
      // 749: bipush 2
      // 74a: swap
      // 74b: aastore
      // 74c: dup_x1
      // 74d: swap
      // 74e: bipush 1
      // 74f: swap
      // 750: aastore
      // 751: dup_x2
      // 752: dup_x2
      // 753: pop
      // 754: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 757: bipush 0
      // 758: swap
      // 759: aastore
      // 75a: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 75d: aconst_null
      // 75e: aconst_null
      // 75f: bipush 6
      // 761: anewarray 5
      // 764: dup_x1
      // 765: swap
      // 766: bipush 5
      // 767: swap
      // 768: aastore
      // 769: dup_x1
      // 76a: swap
      // 76b: bipush 4
      // 76c: swap
      // 76d: aastore
      // 76e: dup_x1
      // 76f: swap
      // 770: bipush 3
      // 771: swap
      // 772: aastore
      // 773: dup_x1
      // 774: swap
      // 775: bipush 2
      // 776: swap
      // 777: aastore
      // 778: dup_x2
      // 779: dup_x2
      // 77a: pop
      // 77b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 77e: bipush 1
      // 77f: swap
      // 780: aastore
      // 781: dup_x1
      // 782: swap
      // 783: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 786: bipush 0
      // 787: swap
      // 788: aastore
      // 789: invokevirtual rip/breeze/inject/é.method_014 ([Ljava/lang/Object;)Lrip/breeze/inject/Util140;
      // 78c: astore 40
      // 78e: aload 40
      // 790: sipush 24034
      // 793: ldc2_w 9155095390188255236
      // 796: lload 2
      // 797: lxor
      // 798: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79d: lload 14
      // 79f: bipush 2
      // 7a0: anewarray 5
      // 7a3: dup_x2
      // 7a4: dup_x2
      // 7a5: pop
      // 7a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7a9: bipush 1
      // 7aa: swap
      // 7ab: aastore
      // 7ac: dup_x1
      // 7ad: swap
      // 7ae: bipush 0
      // 7af: swap
      // 7b0: aastore
      // 7b1: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 7b4: aload 40
      // 7b6: sipush 176
      // 7b9: lload 28
      // 7bb: bipush 2
      // 7bc: anewarray 5
      // 7bf: dup_x2
      // 7c0: dup_x2
      // 7c1: pop
      // 7c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7c5: bipush 1
      // 7c6: swap
      // 7c7: aastore
      // 7c8: dup_x1
      // 7c9: swap
      // 7ca: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7cd: bipush 0
      // 7ce: swap
      // 7cf: aastore
      // 7d0: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 7d3: aload 40
      // 7d5: lload 38
      // 7d7: bipush 1
      // 7d8: anewarray 5
      // 7db: dup_x2
      // 7dc: dup_x2
      // 7dd: pop
      // 7de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7e1: bipush 0
      // 7e2: swap
      // 7e3: aastore
      // 7e4: invokevirtual rip/breeze/inject/Util140.processAll_25 ([Ljava/lang/Object;)V
      // 7e7: aload 0
      // 7e8: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 7eb: bipush 1
      // 7ec: lload 30
      // 7ee: sipush 29976
      // 7f1: ldc2_w 5265787430320869631
      // 7f4: lload 2
      // 7f5: lxor
      // 7f6: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7fb: lload 8
      // 7fd: ldc java/lang/Class
      // 7ff: bipush 0
      // 800: anewarray 5
      // 803: bipush 3
      // 804: anewarray 5
      // 807: dup_x1
      // 808: swap
      // 809: bipush 2
      // 80a: swap
      // 80b: aastore
      // 80c: dup_x1
      // 80d: swap
      // 80e: bipush 1
      // 80f: swap
      // 810: aastore
      // 811: dup_x2
      // 812: dup_x2
      // 813: pop
      // 814: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 817: bipush 0
      // 818: swap
      // 819: aastore
      // 81a: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 81d: aconst_null
      // 81e: aconst_null
      // 81f: bipush 6
      // 821: anewarray 5
      // 824: dup_x1
      // 825: swap
      // 826: bipush 5
      // 827: swap
      // 828: aastore
      // 829: dup_x1
      // 82a: swap
      // 82b: bipush 4
      // 82c: swap
      // 82d: aastore
      // 82e: dup_x1
      // 82f: swap
      // 830: bipush 3
      // 831: swap
      // 832: aastore
      // 833: dup_x1
      // 834: swap
      // 835: bipush 2
      // 836: swap
      // 837: aastore
      // 838: dup_x2
      // 839: dup_x2
      // 83a: pop
      // 83b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 83e: bipush 1
      // 83f: swap
      // 840: aastore
      // 841: dup_x1
      // 842: swap
      // 843: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 846: bipush 0
      // 847: swap
      // 848: aastore
      // 849: invokevirtual rip/breeze/inject/é.method_014 ([Ljava/lang/Object;)Lrip/breeze/inject/Util140;
      // 84c: astore 40
      // 84e: aload 40
      // 850: aload 0
      // 851: getfield rip/breeze/classtransform/պ.class_ÿ_2 Ljava/lang/Class;
      // 854: lload 32
      // 856: dup2_x1
      // 857: pop2
      // 858: bipush 2
      // 859: anewarray 5
      // 85c: dup_x1
      // 85d: swap
      // 85e: bipush 1
      // 85f: swap
      // 860: aastore
      // 861: dup_x2
      // 862: dup_x2
      // 863: pop
      // 864: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 867: bipush 0
      // 868: swap
      // 869: aastore
      // 86a: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 86d: lload 14
      // 86f: bipush 2
      // 870: anewarray 5
      // 873: dup_x2
      // 874: dup_x2
      // 875: pop
      // 876: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 879: bipush 1
      // 87a: swap
      // 87b: aastore
      // 87c: dup_x1
      // 87d: swap
      // 87e: bipush 0
      // 87f: swap
      // 880: aastore
      // 881: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 884: aload 40
      // 886: sipush 176
      // 889: lload 28
      // 88b: bipush 2
      // 88c: anewarray 5
      // 88f: dup_x2
      // 890: dup_x2
      // 891: pop
      // 892: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 895: bipush 1
      // 896: swap
      // 897: aastore
      // 898: dup_x1
      // 899: swap
      // 89a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 89d: bipush 0
      // 89e: swap
      // 89f: aastore
      // 8a0: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 8a3: aload 40
      // 8a5: lload 38
      // 8a7: bipush 1
      // 8a8: anewarray 5
      // 8ab: dup_x2
      // 8ac: dup_x2
      // 8ad: pop
      // 8ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8b1: bipush 0
      // 8b2: swap
      // 8b3: aastore
      // 8b4: invokevirtual rip/breeze/inject/Util140.processAll_25 ([Ljava/lang/Object;)V
      // 8b7: aload 0
      // 8b8: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 8bb: bipush 1
      // 8bc: lload 30
      // 8be: sipush 625
      // 8c1: ldc2_w 7029150199990118314
      // 8c4: lload 2
      // 8c5: lxor
      // 8c6: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8cb: lload 8
      // 8cd: ldc java/util/Map
      // 8cf: bipush 0
      // 8d0: anewarray 5
      // 8d3: bipush 3
      // 8d4: anewarray 5
      // 8d7: dup_x1
      // 8d8: swap
      // 8d9: bipush 2
      // 8da: swap
      // 8db: aastore
      // 8dc: dup_x1
      // 8dd: swap
      // 8de: bipush 1
      // 8df: swap
      // 8e0: aastore
      // 8e1: dup_x2
      // 8e2: dup_x2
      // 8e3: pop
      // 8e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8e7: bipush 0
      // 8e8: swap
      // 8e9: aastore
      // 8ea: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 8ed: aconst_null
      // 8ee: aconst_null
      // 8ef: bipush 6
      // 8f1: anewarray 5
      // 8f4: dup_x1
      // 8f5: swap
      // 8f6: bipush 5
      // 8f7: swap
      // 8f8: aastore
      // 8f9: dup_x1
      // 8fa: swap
      // 8fb: bipush 4
      // 8fc: swap
      // 8fd: aastore
      // 8fe: dup_x1
      // 8ff: swap
      // 900: bipush 3
      // 901: swap
      // 902: aastore
      // 903: dup_x1
      // 904: swap
      // 905: bipush 2
      // 906: swap
      // 907: aastore
      // 908: dup_x2
      // 909: dup_x2
      // 90a: pop
      // 90b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 90e: bipush 1
      // 90f: swap
      // 910: aastore
      // 911: dup_x1
      // 912: swap
      // 913: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 916: bipush 0
      // 917: swap
      // 918: aastore
      // 919: invokevirtual rip/breeze/inject/é.method_014 ([Ljava/lang/Object;)Lrip/breeze/inject/Util140;
      // 91c: astore 40
      // 91e: aload 40
      // 920: lload 34
      // 922: bipush 25
      // 924: bipush 0
      // 925: bipush 3
      // 926: anewarray 5
      // 929: dup_x1
      // 92a: swap
      // 92b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 92e: bipush 2
      // 92f: swap
      // 930: aastore
      // 931: dup_x1
      // 932: swap
      // 933: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 936: bipush 1
      // 937: swap
      // 938: aastore
      // 939: dup_x2
      // 93a: dup_x2
      // 93b: pop
      // 93c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 93f: bipush 0
      // 940: swap
      // 941: aastore
      // 942: invokevirtual rip/breeze/inject/Util140.processAll_8 ([Ljava/lang/Object;)V
      // 945: aload 40
      // 947: sipush 180
      // 94a: aload 0
      // 94b: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 94e: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 951: lload 18
      // 953: dup2_x1
      // 954: pop2
      // 955: sipush 3364
      // 958: ldc2_w 6012300708915538164
      // 95b: lload 2
      // 95c: lxor
      // 95d: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 962: lload 20
      // 964: ldc java/util/Map
      // 966: bipush 2
      // 967: anewarray 5
      // 96a: dup_x1
      // 96b: swap
      // 96c: bipush 1
      // 96d: swap
      // 96e: aastore
      // 96f: dup_x2
      // 970: dup_x2
      // 971: pop
      // 972: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 975: bipush 0
      // 976: swap
      // 977: aastore
      // 978: invokestatic rip/breeze/classtransform/ջ.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 97b: bipush 5
      // 97c: anewarray 5
      // 97f: dup_x1
      // 980: swap
      // 981: bipush 4
      // 982: swap
      // 983: aastore
      // 984: dup_x1
      // 985: swap
      // 986: bipush 3
      // 987: swap
      // 988: aastore
      // 989: dup_x1
      // 98a: swap
      // 98b: bipush 2
      // 98c: swap
      // 98d: aastore
      // 98e: dup_x2
      // 98f: dup_x2
      // 990: pop
      // 991: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 994: bipush 1
      // 995: swap
      // 996: aastore
      // 997: dup_x1
      // 998: swap
      // 999: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 99c: bipush 0
      // 99d: swap
      // 99e: aastore
      // 99f: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 9a2: aload 40
      // 9a4: sipush 176
      // 9a7: lload 28
      // 9a9: bipush 2
      // 9aa: anewarray 5
      // 9ad: dup_x2
      // 9ae: dup_x2
      // 9af: pop
      // 9b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9b3: bipush 1
      // 9b4: swap
      // 9b5: aastore
      // 9b6: dup_x1
      // 9b7: swap
      // 9b8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9bb: bipush 0
      // 9bc: swap
      // 9bd: aastore
      // 9be: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 9c1: aload 40
      // 9c3: lload 38
      // 9c5: bipush 1
      // 9c6: anewarray 5
      // 9c9: dup_x2
      // 9ca: dup_x2
      // 9cb: pop
      // 9cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9cf: bipush 0
      // 9d0: swap
      // 9d1: aastore
      // 9d2: invokevirtual rip/breeze/inject/Util140.processAll_25 ([Ljava/lang/Object;)V
      // 9d5: aload 0
      // 9d6: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 9d9: bipush 1
      // 9da: lload 30
      // 9dc: sipush 13307
      // 9df: ldc2_w 2556027801339942437
      // 9e2: lload 2
      // 9e3: lxor
      // 9e4: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e9: lload 8
      // 9eb: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 9ee: bipush 1
      // 9ef: anewarray 5
      // 9f2: dup
      // 9f3: bipush 0
      // 9f4: ldc_w java/lang/String
      // 9f7: aastore
      // 9f8: bipush 3
      // 9f9: anewarray 5
      // 9fc: dup_x1
      // 9fd: swap
      // 9fe: bipush 2
      // 9ff: swap
      // a00: aastore
      // a01: dup_x1
      // a02: swap
      // a03: bipush 1
      // a04: swap
      // a05: aastore
      // a06: dup_x2
      // a07: dup_x2
      // a08: pop
      // a09: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a0c: bipush 0
      // a0d: swap
      // a0e: aastore
      // a0f: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // a12: aconst_null
      // a13: aconst_null
      // a14: bipush 6
      // a16: anewarray 5
      // a19: dup_x1
      // a1a: swap
      // a1b: bipush 5
      // a1c: swap
      // a1d: aastore
      // a1e: dup_x1
      // a1f: swap
      // a20: bipush 4
      // a21: swap
      // a22: aastore
      // a23: dup_x1
      // a24: swap
      // a25: bipush 3
      // a26: swap
      // a27: aastore
      // a28: dup_x1
      // a29: swap
      // a2a: bipush 2
      // a2b: swap
      // a2c: aastore
      // a2d: dup_x2
      // a2e: dup_x2
      // a2f: pop
      // a30: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a33: bipush 1
      // a34: swap
      // a35: aastore
      // a36: dup_x1
      // a37: swap
      // a38: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a3b: bipush 0
      // a3c: swap
      // a3d: aastore
      // a3e: invokevirtual rip/breeze/inject/é.method_014 ([Ljava/lang/Object;)Lrip/breeze/inject/Util140;
      // a41: astore 40
      // a43: astore 41
      // a45: aload 0
      // a46: getfield rip/breeze/classtransform/պ.map_ü_2 Ljava/util/Map;
      // a49: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // a4e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // a53: astore 42
      // a55: aload 42
      // a57: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a5c: ifeq bd5
      // a5f: aload 42
      // a61: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a66: checkcast java/lang/String
      // a69: astore 43
      // a6b: lload 2
      // a6c: lconst_0
      // a6d: lcmp
      // a6e: iflt c25
      // a71: aload 41
      // a73: ifnull c25
      // a76: aload 0
      // a77: getfield rip/breeze/classtransform/պ.list_û_2 Ljava/util/List;
      // a7a: aload 43
      // a7c: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // a81: ifeq a92
      // a84: goto a8b
      // a87: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a8a: athrow
      // a8b: goto a55
      // a8e: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a91: athrow
      // a92: new rip/breeze/inject/ª
      // a95: dup
      // a96: invokespecial rip/breeze/inject/ª.<init> ()V
      // a99: astore 44
      // a9b: aload 40
      // a9d: lload 34
      // a9f: bipush 25
      // aa1: bipush 1
      // aa2: bipush 3
      // aa3: anewarray 5
      // aa6: dup_x1
      // aa7: swap
      // aa8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // aab: bipush 2
      // aac: swap
      // aad: aastore
      // aae: dup_x1
      // aaf: swap
      // ab0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ab3: bipush 1
      // ab4: swap
      // ab5: aastore
      // ab6: dup_x2
      // ab7: dup_x2
      // ab8: pop
      // ab9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // abc: bipush 0
      // abd: swap
      // abe: aastore
      // abf: invokevirtual rip/breeze/inject/Util140.processAll_8 ([Ljava/lang/Object;)V
      // ac2: aload 40
      // ac4: aload 43
      // ac6: lload 14
      // ac8: bipush 2
      // ac9: anewarray 5
      // acc: dup_x2
      // acd: dup_x2
      // ace: pop
      // acf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // ad2: bipush 1
      // ad3: swap
      // ad4: aastore
      // ad5: dup_x1
      // ad6: swap
      // ad7: bipush 0
      // ad8: swap
      // ad9: aastore
      // ada: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // add: aload 40
      // adf: lload 12
      // ae1: sipush 182
      // ae4: getstatic rip/breeze/classtransform/ջ.CONST_Ý_2 Ljava/lang/String;
      // ae7: sipush 8282
      // aea: ldc2_w 3639227796138149273
      // aed: lload 2
      // aee: lxor
      // aef: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af4: lload 8
      // af6: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // af9: bipush 1
      // afa: anewarray 5
      // afd: dup
      // afe: bipush 0
      // aff: ldc java/lang/Object
      // b01: aastore
      // b02: bipush 3
      // b03: anewarray 5
      // b06: dup_x1
      // b07: swap
      // b08: bipush 2
      // b09: swap
      // b0a: aastore
      // b0b: dup_x1
      // b0c: swap
      // b0d: bipush 1
      // b0e: swap
      // b0f: aastore
      // b10: dup_x2
      // b11: dup_x2
      // b12: pop
      // b13: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b16: bipush 0
      // b17: swap
      // b18: aastore
      // b19: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // b1c: bipush 0
      // b1d: bipush 6
      // b1f: anewarray 5
      // b22: dup_x1
      // b23: swap
      // b24: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // b27: bipush 5
      // b28: swap
      // b29: aastore
      // b2a: dup_x1
      // b2b: swap
      // b2c: bipush 4
      // b2d: swap
      // b2e: aastore
      // b2f: dup_x1
      // b30: swap
      // b31: bipush 3
      // b32: swap
      // b33: aastore
      // b34: dup_x1
      // b35: swap
      // b36: bipush 2
      // b37: swap
      // b38: aastore
      // b39: dup_x1
      // b3a: swap
      // b3b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b3e: bipush 1
      // b3f: swap
      // b40: aastore
      // b41: dup_x2
      // b42: dup_x2
      // b43: pop
      // b44: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b47: bipush 0
      // b48: swap
      // b49: aastore
      // b4a: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // b4d: aload 40
      // b4f: lload 16
      // b51: sipush 153
      // b54: aload 44
      // b56: bipush 3
      // b57: anewarray 5
      // b5a: dup_x1
      // b5b: swap
      // b5c: bipush 2
      // b5d: swap
      // b5e: aastore
      // b5f: dup_x1
      // b60: swap
      // b61: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b64: bipush 1
      // b65: swap
      // b66: aastore
      // b67: dup_x2
      // b68: dup_x2
      // b69: pop
      // b6a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b6d: bipush 0
      // b6e: swap
      // b6f: aastore
      // b70: invokevirtual rip/breeze/inject/Util140.processAll_14 ([Ljava/lang/Object;)V
      // b73: aload 40
      // b75: bipush 4
      // b76: lload 28
      // b78: bipush 2
      // b79: anewarray 5
      // b7c: dup_x2
      // b7d: dup_x2
      // b7e: pop
      // b7f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b82: bipush 1
      // b83: swap
      // b84: aastore
      // b85: dup_x1
      // b86: swap
      // b87: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b8a: bipush 0
      // b8b: swap
      // b8c: aastore
      // b8d: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // b90: aload 40
      // b92: sipush 172
      // b95: lload 28
      // b97: bipush 2
      // b98: anewarray 5
      // b9b: dup_x2
      // b9c: dup_x2
      // b9d: pop
      // b9e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // ba1: bipush 1
      // ba2: swap
      // ba3: aastore
      // ba4: dup_x1
      // ba5: swap
      // ba6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ba9: bipush 0
      // baa: swap
      // bab: aastore
      // bac: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // baf: aload 40
      // bb1: aload 44
      // bb3: lload 22
      // bb5: bipush 2
      // bb6: anewarray 5
      // bb9: dup_x2
      // bba: dup_x2
      // bbb: pop
      // bbc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // bbf: bipush 1
      // bc0: swap
      // bc1: aastore
      // bc2: dup_x1
      // bc3: swap
      // bc4: bipush 0
      // bc5: swap
      // bc6: aastore
      // bc7: invokevirtual rip/breeze/inject/Util140.processAll_15 ([Ljava/lang/Object;)V
      // bca: lload 2
      // bcb: lconst_0
      // bcc: lcmp
      // bcd: ifle c25
      // bd0: aload 41
      // bd2: ifnonnull a55
      // bd5: aload 40
      // bd7: bipush 3
      // bd8: lload 28
      // bda: bipush 2
      // bdb: anewarray 5
      // bde: dup_x2
      // bdf: dup_x2
      // be0: pop
      // be1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // be4: bipush 1
      // be5: swap
      // be6: aastore
      // be7: dup_x1
      // be8: swap
      // be9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // bec: bipush 0
      // bed: swap
      // bee: aastore
      // bef: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // bf2: aload 40
      // bf4: sipush 172
      // bf7: lload 28
      // bf9: bipush 2
      // bfa: anewarray 5
      // bfd: dup_x2
      // bfe: dup_x2
      // bff: pop
      // c00: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c03: bipush 1
      // c04: swap
      // c05: aastore
      // c06: dup_x1
      // c07: swap
      // c08: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c0b: bipush 0
      // c0c: swap
      // c0d: aastore
      // c0e: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // c11: aload 40
      // c13: lload 38
      // c15: bipush 1
      // c16: anewarray 5
      // c19: dup_x2
      // c1a: dup_x2
      // c1b: pop
      // c1c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c1f: bipush 0
      // c20: swap
      // c21: aastore
      // c22: invokevirtual rip/breeze/inject/Util140.processAll_25 ([Ljava/lang/Object;)V
      // c25: return
      // try (1753 -> 1764): 1765 java/lang/IllegalStateException
      // try (1759 -> 1768): 1768 java/lang/IllegalStateException
   }

   private void invoke_5(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_a_2 ^ var2;
      long var4 = var2 ^ 132616792758531L;
      long var6 = var2 ^ 135228293826926L;
      long var8 = var2 ^ 65465627950111L;
      long var10 = var2 ^ 6931853184443L;
      long var12 = var2 ^ 139233556281308L;
      long var14 = var2 ^ 139669700335083L;
      long var16 = var2 ^ 26111986607816L;
      Method[] var18 = this.class_ÿ_2.getDeclaredMethods();
      int var19 = var18.length;
      String[] var10000 = չ.method_069();
      int var20 = 0;
      String[] var21 = var10000;

      while (var20 < var19) {
         Method var22 = var18[var20];
         rip.breeze.inject.é var26 = this.é_ú_2;
         Object[] var10008 = new Object[]{null, var10, var22.getName(), ջ.method_007(new Object[]{var4, var22, new Object[0]}), null, null};
         var10008[0] = 1;
         rip.breeze.inject.Util140 var23 = var26.method_014(var10008);
         Object var24 = this.map_ü_2.get(var22.getName());
         this.method_006(new Object[]{var23, var22.getReturnType(), var24, var12});
         int var10001 = MathUtil3.getValue_2(new Object[]{ջ.method_003(new Object[]{var6, var22}), var14});
         Object[] var10004 = new Object[]{null, var8};
         var10004[0] = var10001;
         var23.processAll_6(var10004);
         var23.processAll_25(new Object[]{var16});
         var20++;
         if (var21 == null) {
            break;
         }
      }
   }

   private void invoke_6(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/Util140
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Class
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Object
      // 015: astore 4
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 5
      // 022: pop
      // 023: getstatic rip/breeze/classtransform/պ.encKey_a_2 J
      // 026: lload 5
      // 028: lxor
      // 029: lstore 5
      // 02b: lload 5
      // 02d: dup2
      // 02e: ldc2_w 100697046922225
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 83663508404966
      // 038: lxor
      // 039: lstore 9
      // 03b: dup2
      // 03c: ldc2_w 26142586773885
      // 03f: lxor
      // 040: lstore 11
      // 042: dup2
      // 043: ldc2_w 103596032355316
      // 046: lxor
      // 047: lstore 13
      // 049: dup2
      // 04a: ldc2_w 131571890012283
      // 04d: lxor
      // 04e: lstore 15
      // 050: dup2
      // 051: ldc2_w 119544583477243
      // 054: lxor
      // 055: lstore 17
      // 057: dup2
      // 058: ldc2_w 109940244487602
      // 05b: lxor
      // 05c: lstore 19
      // 05e: dup2
      // 05f: ldc2_w 65351955182629
      // 062: lxor
      // 063: lstore 21
      // 065: dup2
      // 066: ldc2_w 4318230441418
      // 069: lxor
      // 06a: lstore 23
      // 06c: dup2
      // 06d: ldc2_w 52789083290256
      // 070: lxor
      // 071: lstore 25
      // 073: dup2
      // 074: ldc2_w 9931558578835
      // 077: lxor
      // 078: lstore 27
      // 07a: dup2
      // 07b: ldc2_w 94657039982524
      // 07e: lxor
      // 07f: lstore 29
      // 081: dup2
      // 082: ldc2_w 37844613542719
      // 085: lxor
      // 086: lstore 31
      // 088: dup2
      // 089: ldc2_w 48586473212751
      // 08c: lxor
      // 08d: lstore 33
      // 08f: pop2
      // 090: invokestatic rip/breeze/classtransform/չ.method_069 ()[Ljava/lang/String;
      // 093: astore 35
      // 095: aload 35
      // 097: ifnull 0fd
      // 09a: aload 3
      // 09b: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 09e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0a1: ifne 0d6
      // 0a4: goto 0ab
      // 0a7: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: aload 3
      // 0ac: ldc_w java/lang/Boolean
      // 0af: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0b2: aload 35
      // 0b4: lload 5
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: ifle 112
      // 0bb: ifnull 110
      // 0be: goto 0c5
      // 0c1: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: lload 5
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: ifle 109
      // 0cc: ifeq 102
      // 0cf: goto 0d6
      // 0d2: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: lload 23
      // 0d9: aload 2
      // 0da: aload 4
      // 0dc: bipush 3
      // 0dd: anewarray 5
      // 0e0: dup_x1
      // 0e1: swap
      // 0e2: bipush 2
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x1
      // 0e6: swap
      // 0e7: bipush 1
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x2
      // 0eb: dup_x2
      // 0ec: pop
      // 0ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f0: bipush 0
      // 0f1: swap
      // 0f2: aastore
      // 0f3: invokespecial rip/breeze/classtransform/պ.method_007 ([Ljava/lang/Object;)V
      // 0f6: goto 0fd
      // 0f9: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: aload 35
      // 0ff: ifnonnull 66b
      // 102: aload 3
      // 103: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 106: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 109: goto 110
      // 10c: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: aload 35
      // 112: lload 5
      // 114: lconst_0
      // 115: lcmp
      // 116: iflt 136
      // 119: ifnull 134
      // 11c: ifne 14a
      // 11f: goto 126
      // 122: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: aload 3
      // 127: ldc_w java/lang/Byte
      // 12a: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 12d: goto 134
      // 130: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 133: athrow
      // 134: aload 35
      // 136: lload 5
      // 138: lconst_0
      // 139: lcmp
      // 13a: ifle 186
      // 13d: ifnull 184
      // 140: ifeq 176
      // 143: goto 14a
      // 146: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: aload 0
      // 14b: aload 2
      // 14c: lload 29
      // 14e: aload 4
      // 150: bipush 3
      // 151: anewarray 5
      // 154: dup_x1
      // 155: swap
      // 156: bipush 2
      // 157: swap
      // 158: aastore
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
      // 167: invokespecial rip/breeze/classtransform/պ.method_008 ([Ljava/lang/Object;)V
      // 16a: aload 35
      // 16c: ifnonnull 66b
      // 16f: goto 176
      // 172: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 175: athrow
      // 176: aload 3
      // 177: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 17a: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 17d: goto 184
      // 180: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 183: athrow
      // 184: aload 35
      // 186: lload 5
      // 188: lconst_0
      // 189: lcmp
      // 18a: iflt 1aa
      // 18d: ifnull 1a8
      // 190: ifne 1be
      // 193: goto 19a
      // 196: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: aload 3
      // 19b: ldc_w java/lang/Short
      // 19e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1a1: goto 1a8
      // 1a4: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a7: athrow
      // 1a8: aload 35
      // 1aa: lload 5
      // 1ac: lconst_0
      // 1ad: lcmp
      // 1ae: iflt 1fa
      // 1b1: ifnull 1f8
      // 1b4: ifeq 1ea
      // 1b7: goto 1be
      // 1ba: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bd: athrow
      // 1be: aload 0
      // 1bf: aload 2
      // 1c0: aload 4
      // 1c2: lload 17
      // 1c4: bipush 3
      // 1c5: anewarray 5
      // 1c8: dup_x2
      // 1c9: dup_x2
      // 1ca: pop
      // 1cb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ce: bipush 2
      // 1cf: swap
      // 1d0: aastore
      // 1d1: dup_x1
      // 1d2: swap
      // 1d3: bipush 1
      // 1d4: swap
      // 1d5: aastore
      // 1d6: dup_x1
      // 1d7: swap
      // 1d8: bipush 0
      // 1d9: swap
      // 1da: aastore
      // 1db: invokespecial rip/breeze/classtransform/պ.method_009 ([Ljava/lang/Object;)V
      // 1de: aload 35
      // 1e0: ifnonnull 66b
      // 1e3: goto 1ea
      // 1e6: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e9: athrow
      // 1ea: aload 3
      // 1eb: getstatic java/lang/Character.TYPE Ljava/lang/Class;
      // 1ee: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1f1: goto 1f8
      // 1f4: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f7: athrow
      // 1f8: aload 35
      // 1fa: lload 5
      // 1fc: lconst_0
      // 1fd: lcmp
      // 1fe: ifle 21e
      // 201: ifnull 21c
      // 204: ifne 232
      // 207: goto 20e
      // 20a: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20d: athrow
      // 20e: aload 3
      // 20f: ldc_w java/lang/Character
      // 212: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 215: goto 21c
      // 218: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21b: athrow
      // 21c: aload 35
      // 21e: lload 5
      // 220: lconst_0
      // 221: lcmp
      // 222: iflt 26e
      // 225: ifnull 26c
      // 228: ifeq 25e
      // 22b: goto 232
      // 22e: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 231: athrow
      // 232: aload 0
      // 233: lload 31
      // 235: aload 2
      // 236: aload 4
      // 238: bipush 3
      // 239: anewarray 5
      // 23c: dup_x1
      // 23d: swap
      // 23e: bipush 2
      // 23f: swap
      // 240: aastore
      // 241: dup_x1
      // 242: swap
      // 243: bipush 1
      // 244: swap
      // 245: aastore
      // 246: dup_x2
      // 247: dup_x2
      // 248: pop
      // 249: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24c: bipush 0
      // 24d: swap
      // 24e: aastore
      // 24f: invokespecial rip/breeze/classtransform/պ.method_010 ([Ljava/lang/Object;)V
      // 252: aload 35
      // 254: ifnonnull 66b
      // 257: goto 25e
      // 25a: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25d: athrow
      // 25e: aload 3
      // 25f: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 262: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 265: goto 26c
      // 268: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26b: athrow
      // 26c: aload 35
      // 26e: lload 5
      // 270: lconst_0
      // 271: lcmp
      // 272: ifle 292
      // 275: ifnull 290
      // 278: ifne 2a6
      // 27b: goto 282
      // 27e: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 281: athrow
      // 282: aload 3
      // 283: ldc_w java/lang/Integer
      // 286: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 289: goto 290
      // 28c: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28f: athrow
      // 290: aload 35
      // 292: lload 5
      // 294: lconst_0
      // 295: lcmp
      // 296: ifle 2e2
      // 299: ifnull 2e0
      // 29c: ifeq 2d2
      // 29f: goto 2a6
      // 2a2: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a5: athrow
      // 2a6: aload 0
      // 2a7: lload 9
      // 2a9: aload 2
      // 2aa: aload 4
      // 2ac: bipush 3
      // 2ad: anewarray 5
      // 2b0: dup_x1
      // 2b1: swap
      // 2b2: bipush 2
      // 2b3: swap
      // 2b4: aastore
      // 2b5: dup_x1
      // 2b6: swap
      // 2b7: bipush 1
      // 2b8: swap
      // 2b9: aastore
      // 2ba: dup_x2
      // 2bb: dup_x2
      // 2bc: pop
      // 2bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c0: bipush 0
      // 2c1: swap
      // 2c2: aastore
      // 2c3: invokespecial rip/breeze/classtransform/պ.method_011 ([Ljava/lang/Object;)V
      // 2c6: aload 35
      // 2c8: ifnonnull 66b
      // 2cb: goto 2d2
      // 2ce: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d1: athrow
      // 2d2: aload 3
      // 2d3: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 2d6: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 2d9: goto 2e0
      // 2dc: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2df: athrow
      // 2e0: aload 35
      // 2e2: lload 5
      // 2e4: lconst_0
      // 2e5: lcmp
      // 2e6: iflt 305
      // 2e9: ifnull 303
      // 2ec: ifne 319
      // 2ef: goto 2f6
      // 2f2: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f5: athrow
      // 2f6: aload 3
      // 2f7: ldc java/lang/Long
      // 2f9: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 2fc: goto 303
      // 2ff: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 302: athrow
      // 303: aload 35
      // 305: lload 5
      // 307: lconst_0
      // 308: lcmp
      // 309: iflt 355
      // 30c: ifnull 353
      // 30f: ifeq 345
      // 312: goto 319
      // 315: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 318: athrow
      // 319: aload 0
      // 31a: aload 2
      // 31b: lload 33
      // 31d: aload 4
      // 31f: bipush 3
      // 320: anewarray 5
      // 323: dup_x1
      // 324: swap
      // 325: bipush 2
      // 326: swap
      // 327: aastore
      // 328: dup_x2
      // 329: dup_x2
      // 32a: pop
      // 32b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32e: bipush 1
      // 32f: swap
      // 330: aastore
      // 331: dup_x1
      // 332: swap
      // 333: bipush 0
      // 334: swap
      // 335: aastore
      // 336: invokespecial rip/breeze/classtransform/պ.method_012 ([Ljava/lang/Object;)V
      // 339: aload 35
      // 33b: ifnonnull 66b
      // 33e: goto 345
      // 341: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 344: athrow
      // 345: aload 3
      // 346: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 349: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 34c: goto 353
      // 34f: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 352: athrow
      // 353: aload 35
      // 355: lload 5
      // 357: lconst_0
      // 358: lcmp
      // 359: ifle 379
      // 35c: ifnull 377
      // 35f: ifne 38d
      // 362: goto 369
      // 365: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 368: athrow
      // 369: aload 3
      // 36a: ldc_w java/lang/Float
      // 36d: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 370: goto 377
      // 373: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 376: athrow
      // 377: aload 35
      // 379: lload 5
      // 37b: lconst_0
      // 37c: lcmp
      // 37d: ifle 3c9
      // 380: ifnull 3c7
      // 383: ifeq 3b9
      // 386: goto 38d
      // 389: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38c: athrow
      // 38d: aload 0
      // 38e: lload 15
      // 390: aload 2
      // 391: aload 4
      // 393: bipush 3
      // 394: anewarray 5
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
      // 3a1: dup_x2
      // 3a2: dup_x2
      // 3a3: pop
      // 3a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a7: bipush 0
      // 3a8: swap
      // 3a9: aastore
      // 3aa: invokespecial rip/breeze/classtransform/պ.method_013 ([Ljava/lang/Object;)V
      // 3ad: aload 35
      // 3af: ifnonnull 66b
      // 3b2: goto 3b9
      // 3b5: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b8: athrow
      // 3b9: aload 3
      // 3ba: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 3bd: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 3c0: goto 3c7
      // 3c3: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c6: athrow
      // 3c7: aload 35
      // 3c9: lload 5
      // 3cb: lconst_0
      // 3cc: lcmp
      // 3cd: ifle 3ed
      // 3d0: ifnull 3eb
      // 3d3: ifne 401
      // 3d6: goto 3dd
      // 3d9: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3dc: athrow
      // 3dd: aload 3
      // 3de: ldc_w java/lang/Double
      // 3e1: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 3e4: goto 3eb
      // 3e7: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ea: athrow
      // 3eb: aload 35
      // 3ed: lload 5
      // 3ef: lconst_0
      // 3f0: lcmp
      // 3f1: iflt 43d
      // 3f4: ifnull 43b
      // 3f7: ifeq 42d
      // 3fa: goto 401
      // 3fd: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 400: athrow
      // 401: aload 0
      // 402: lload 7
      // 404: aload 2
      // 405: aload 4
      // 407: bipush 3
      // 408: anewarray 5
      // 40b: dup_x1
      // 40c: swap
      // 40d: bipush 2
      // 40e: swap
      // 40f: aastore
      // 410: dup_x1
      // 411: swap
      // 412: bipush 1
      // 413: swap
      // 414: aastore
      // 415: dup_x2
      // 416: dup_x2
      // 417: pop
      // 418: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41b: bipush 0
      // 41c: swap
      // 41d: aastore
      // 41e: invokespecial rip/breeze/classtransform/պ.method_014 ([Ljava/lang/Object;)V
      // 421: aload 35
      // 423: ifnonnull 66b
      // 426: goto 42d
      // 429: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42c: athrow
      // 42d: aload 3
      // 42e: ldc_w java/lang/String
      // 431: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 434: goto 43b
      // 437: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43a: athrow
      // 43b: aload 35
      // 43d: lload 5
      // 43f: lconst_0
      // 440: lcmp
      // 441: iflt 48c
      // 444: ifnull 48a
      // 447: ifeq 47d
      // 44a: goto 451
      // 44d: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 450: athrow
      // 451: aload 0
      // 452: aload 2
      // 453: aload 4
      // 455: lload 13
      // 457: bipush 3
      // 458: anewarray 5
      // 45b: dup_x2
      // 45c: dup_x2
      // 45d: pop
      // 45e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 461: bipush 2
      // 462: swap
      // 463: aastore
      // 464: dup_x1
      // 465: swap
      // 466: bipush 1
      // 467: swap
      // 468: aastore
      // 469: dup_x1
      // 46a: swap
      // 46b: bipush 0
      // 46c: swap
      // 46d: aastore
      // 46e: invokespecial rip/breeze/classtransform/պ.method_015 ([Ljava/lang/Object;)V
      // 471: aload 35
      // 473: ifnonnull 66b
      // 476: goto 47d
      // 479: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47c: athrow
      // 47d: aload 3
      // 47e: ldc java/lang/Class
      // 480: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 483: goto 48a
      // 486: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 489: athrow
      // 48a: aload 35
      // 48c: lload 5
      // 48e: lconst_0
      // 48f: lcmp
      // 490: iflt 4b0
      // 493: ifnull 4ae
      // 496: ifne 4c4
      // 499: goto 4a0
      // 49c: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49f: athrow
      // 4a0: aload 3
      // 4a1: ldc_w rip/breeze/inject/MathUtil3
      // 4a4: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 4a7: goto 4ae
      // 4aa: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ad: athrow
      // 4ae: aload 35
      // 4b0: lload 5
      // 4b2: lconst_0
      // 4b3: lcmp
      // 4b4: iflt 4fd
      // 4b7: ifnull 4fb
      // 4ba: ifeq 4f0
      // 4bd: goto 4c4
      // 4c0: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c3: athrow
      // 4c4: aload 0
      // 4c5: aload 2
      // 4c6: lload 25
      // 4c8: aload 4
      // 4ca: bipush 3
      // 4cb: anewarray 5
      // 4ce: dup_x1
      // 4cf: swap
      // 4d0: bipush 2
      // 4d1: swap
      // 4d2: aastore
      // 4d3: dup_x2
      // 4d4: dup_x2
      // 4d5: pop
      // 4d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d9: bipush 1
      // 4da: swap
      // 4db: aastore
      // 4dc: dup_x1
      // 4dd: swap
      // 4de: bipush 0
      // 4df: swap
      // 4e0: aastore
      // 4e1: invokespecial rip/breeze/classtransform/պ.method_016 ([Ljava/lang/Object;)V
      // 4e4: aload 35
      // 4e6: ifnonnull 66b
      // 4e9: goto 4f0
      // 4ec: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ef: athrow
      // 4f0: aload 3
      // 4f1: invokevirtual java/lang/Class.isEnum ()Z
      // 4f4: goto 4fb
      // 4f7: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4fa: athrow
      // 4fb: aload 35
      // 4fd: lload 5
      // 4ff: lconst_0
      // 500: lcmp
      // 501: ifle 54a
      // 504: ifnull 548
      // 507: ifeq 53d
      // 50a: goto 511
      // 50d: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 510: athrow
      // 511: aload 0
      // 512: aload 2
      // 513: aload 4
      // 515: lload 19
      // 517: bipush 3
      // 518: anewarray 5
      // 51b: dup_x2
      // 51c: dup_x2
      // 51d: pop
      // 51e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 521: bipush 2
      // 522: swap
      // 523: aastore
      // 524: dup_x1
      // 525: swap
      // 526: bipush 1
      // 527: swap
      // 528: aastore
      // 529: dup_x1
      // 52a: swap
      // 52b: bipush 0
      // 52c: swap
      // 52d: aastore
      // 52e: invokespecial rip/breeze/classtransform/պ.method_017 ([Ljava/lang/Object;)V
      // 531: aload 35
      // 533: ifnonnull 66b
      // 536: goto 53d
      // 539: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53c: athrow
      // 53d: aload 3
      // 53e: invokevirtual java/lang/Class.isAnnotation ()Z
      // 541: goto 548
      // 544: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 547: athrow
      // 548: aload 35
      // 54a: lload 5
      // 54c: lconst_0
      // 54d: lcmp
      // 54e: ifle 56e
      // 551: ifnull 56c
      // 554: ifne 582
      // 557: goto 55e
      // 55a: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55d: athrow
      // 55e: aload 3
      // 55f: ldc_w rip/breeze/inject/ù
      // 562: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 565: goto 56c
      // 568: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56b: athrow
      // 56c: aload 35
      // 56e: lload 5
      // 570: lconst_0
      // 571: lcmp
      // 572: ifle 5c2
      // 575: ifnull 5b9
      // 578: ifeq 5ae
      // 57b: goto 582
      // 57e: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 581: athrow
      // 582: aload 0
      // 583: lload 11
      // 585: aload 2
      // 586: aload 4
      // 588: bipush 3
      // 589: anewarray 5
      // 58c: dup_x1
      // 58d: swap
      // 58e: bipush 2
      // 58f: swap
      // 590: aastore
      // 591: dup_x1
      // 592: swap
      // 593: bipush 1
      // 594: swap
      // 595: aastore
      // 596: dup_x2
      // 597: dup_x2
      // 598: pop
      // 599: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59c: bipush 0
      // 59d: swap
      // 59e: aastore
      // 59f: invokespecial rip/breeze/classtransform/պ.method_018 ([Ljava/lang/Object;)V
      // 5a2: aload 35
      // 5a4: ifnonnull 66b
      // 5a7: goto 5ae
      // 5aa: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ad: athrow
      // 5ae: aload 3
      // 5af: invokevirtual java/lang/Class.isArray ()Z
      // 5b2: goto 5b9
      // 5b5: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b8: athrow
      // 5b9: lload 5
      // 5bb: lconst_0
      // 5bc: lcmp
      // 5bd: iflt 611
      // 5c0: aload 35
      // 5c2: ifnull 611
      // 5c5: ifeq 604
      // 5c8: goto 5cf
      // 5cb: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ce: athrow
      // 5cf: aload 0
      // 5d0: aload 2
      // 5d1: aload 3
      // 5d2: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 5d5: lload 21
      // 5d7: aload 4
      // 5d9: bipush 4
      // 5da: anewarray 5
      // 5dd: dup_x1
      // 5de: swap
      // 5df: bipush 3
      // 5e0: swap
      // 5e1: aastore
      // 5e2: dup_x2
      // 5e3: dup_x2
      // 5e4: pop
      // 5e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e8: bipush 2
      // 5e9: swap
      // 5ea: aastore
      // 5eb: dup_x1
      // 5ec: swap
      // 5ed: bipush 1
      // 5ee: swap
      // 5ef: aastore
      // 5f0: dup_x1
      // 5f1: swap
      // 5f2: bipush 0
      // 5f3: swap
      // 5f4: aastore
      // 5f5: invokespecial rip/breeze/classtransform/պ.method_019 ([Ljava/lang/Object;)V
      // 5f8: aload 35
      // 5fa: ifnonnull 66b
      // 5fd: goto 604
      // 600: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 603: athrow
      // 604: ldc java/util/List
      // 606: aload 3
      // 607: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 60a: goto 611
      // 60d: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 610: athrow
      // 611: ifeq 640
      // 614: aload 0
      // 615: aload 2
      // 616: aload 4
      // 618: lload 27
      // 61a: bipush 3
      // 61b: anewarray 5
      // 61e: dup_x2
      // 61f: dup_x2
      // 620: pop
      // 621: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 624: bipush 2
      // 625: swap
      // 626: aastore
      // 627: dup_x1
      // 628: swap
      // 629: bipush 1
      // 62a: swap
      // 62b: aastore
      // 62c: dup_x1
      // 62d: swap
      // 62e: bipush 0
      // 62f: swap
      // 630: aastore
      // 631: invokespecial rip/breeze/classtransform/պ.method_020 ([Ljava/lang/Object;)V
      // 634: aload 35
      // 636: ifnonnull 66b
      // 639: goto 640
      // 63c: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63f: athrow
      // 640: new java/lang/IllegalArgumentException
      // 643: dup
      // 644: new java/lang/StringBuilder
      // 647: dup
      // 648: invokespecial java/lang/StringBuilder.<init> ()V
      // 64b: sipush 31767
      // 64e: ldc2_w 8338837166995264860
      // 651: lload 5
      // 653: lxor
      // 654: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 659: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 65c: aload 3
      // 65d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 660: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 663: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 666: athrow
      // 667: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66a: athrow
      // 66b: return
      // try (87 -> 93): 94 java/lang/IllegalStateException
      // try (89 -> 105): 106 java/lang/IllegalStateException
      // try (96 -> 113): 114 java/lang/IllegalStateException
      // try (108 -> 140): 141 java/lang/IllegalStateException
      // try (143 -> 148): 149 java/lang/IllegalStateException
      // try (151 -> 158): 159 java/lang/IllegalStateException
      // try (157 -> 164): 165 java/lang/IllegalStateException
      // try (167 -> 174): 175 java/lang/IllegalStateException
      // try (173 -> 203): 204 java/lang/IllegalStateException
      // try (177 -> 209): 210 java/lang/IllegalStateException
      // try (212 -> 219): 220 java/lang/IllegalStateException
      // try (218 -> 225): 226 java/lang/IllegalStateException
      // try (228 -> 235): 236 java/lang/IllegalStateException
      // try (234 -> 264): 265 java/lang/IllegalStateException
      // try (238 -> 270): 271 java/lang/IllegalStateException
      // try (273 -> 280): 281 java/lang/IllegalStateException
      // try (279 -> 286): 287 java/lang/IllegalStateException
      // try (289 -> 296): 297 java/lang/IllegalStateException
      // try (295 -> 325): 326 java/lang/IllegalStateException
      // try (299 -> 331): 332 java/lang/IllegalStateException
      // try (334 -> 341): 342 java/lang/IllegalStateException
      // try (340 -> 347): 348 java/lang/IllegalStateException
      // try (350 -> 357): 358 java/lang/IllegalStateException
      // try (356 -> 386): 387 java/lang/IllegalStateException
      // try (360 -> 392): 393 java/lang/IllegalStateException
      // try (395 -> 402): 403 java/lang/IllegalStateException
      // try (401 -> 408): 409 java/lang/IllegalStateException
      // try (411 -> 418): 419 java/lang/IllegalStateException
      // try (417 -> 447): 448 java/lang/IllegalStateException
      // try (421 -> 453): 454 java/lang/IllegalStateException
      // try (456 -> 463): 464 java/lang/IllegalStateException
      // try (462 -> 469): 470 java/lang/IllegalStateException
      // try (472 -> 479): 480 java/lang/IllegalStateException
      // try (478 -> 508): 509 java/lang/IllegalStateException
      // try (482 -> 514): 515 java/lang/IllegalStateException
      // try (517 -> 524): 525 java/lang/IllegalStateException
      // try (523 -> 530): 531 java/lang/IllegalStateException
      // try (533 -> 540): 541 java/lang/IllegalStateException
      // try (539 -> 569): 570 java/lang/IllegalStateException
      // try (543 -> 575): 576 java/lang/IllegalStateException
      // try (578 -> 585): 586 java/lang/IllegalStateException
      // try (584 -> 614): 615 java/lang/IllegalStateException
      // try (588 -> 620): 621 java/lang/IllegalStateException
      // try (623 -> 630): 631 java/lang/IllegalStateException
      // try (629 -> 636): 637 java/lang/IllegalStateException
      // try (639 -> 646): 647 java/lang/IllegalStateException
      // try (645 -> 675): 676 java/lang/IllegalStateException
      // try (649 -> 680): 681 java/lang/IllegalStateException
      // try (683 -> 690): 691 java/lang/IllegalStateException
      // try (689 -> 719): 720 java/lang/IllegalStateException
      // try (693 -> 724): 725 java/lang/IllegalStateException
      // try (727 -> 734): 735 java/lang/IllegalStateException
      // try (733 -> 740): 741 java/lang/IllegalStateException
      // try (743 -> 750): 751 java/lang/IllegalStateException
      // try (749 -> 779): 780 java/lang/IllegalStateException
      // try (753 -> 784): 785 java/lang/IllegalStateException
      // try (787 -> 794): 795 java/lang/IllegalStateException
      // try (793 -> 830): 831 java/lang/IllegalStateException
      // try (797 -> 836): 837 java/lang/IllegalStateException
      // try (839 -> 866): 867 java/lang/IllegalStateException
      // try (840 -> 885): 885 java/lang/IllegalStateException
   }

   private void invoke_7(Object[] var1) {
      long var2 = (Long)var1[0];
      rip.breeze.inject.Util140 var4 = (rip.breeze.inject.Util140)var1[1];
      Object var5 = var1[2];
      var2 = encKey_a_2 ^ var2;
      long var6 = var2 ^ 77819895965193L;
      String[] var10000 = չ.method_069();
      byte var8 = (Boolean)var5;
      String[] var9 = var10000;

      byte var10001;
      label22: {
         label21: {
            try {
               var12 = var4;
               var10001 = var8;
               if (var9 == null) {
                  break label22;
               }

               if (var8 != 0) {
                  break label21;
               }
            } catch (IllegalStateException var10) {
               throw method_023(var10);
            }

            var10001 = 3;
            break label22;
         }

         var10001 = 4;
      }

      Object[] var10004 = new Object[]{null, var6};
      var10004[0] = Integer.valueOf(var10001);
      var12.processAll_6(var10004);
   }

   private void invoke_8(Object[] var1) {
      rip.breeze.inject.Util140 var2 = (rip.breeze.inject.Util140)var1[0];
      long var3 = (Long)var1[1];
      Object var5 = var1[2];
      var3 = encKey_a_2 ^ var3;
      long var6 = var3 ^ 88421413695135L;
      byte var8 = (Byte)var5;
      Object[] var10005 = new Object[]{null, null, Integer.valueOf(var8)};
      var10005[1] = var6;
      var10005[0] = 16;
      var2.processAll_7(var10005);
   }

   private void invoke_9(Object[] var1) {
      rip.breeze.inject.Util140 var2 = (rip.breeze.inject.Util140)var1[0];
      Object var3 = var1[1];
      long var4 = (Long)var1[2];
      var4 = encKey_a_2 ^ var4;
      long var6 = var4 ^ 117396985915096L;
      short var8 = (Short)var3;
      Object[] var10005 = new Object[]{null, null, Integer.valueOf(var8)};
      var10005[1] = var6;
      var10005[0] = 17;
      var2.processAll_7(var10005);
   }

   private void invoke_10(Object[] var1) {
      long var2 = (Long)var1[0];
      rip.breeze.inject.Util140 var4 = (rip.breeze.inject.Util140)var1[1];
      Object var5 = var1[2];
      var2 = encKey_a_2 ^ var2;
      long var6 = var2 ^ 39682737259036L;
      char var8 = (Character)var5;
      Object[] var10005 = new Object[]{null, null, Integer.valueOf(var8)};
      var10005[1] = var6;
      var10005[0] = 17;
      var4.processAll_7(var10005);
   }

   private void invoke_11(Object[] var1) {
      long var2 = (Long)var1[0];
      rip.breeze.inject.Util140 var4 = (rip.breeze.inject.Util140)var1[1];
      Object var5 = var1[2];
      var2 = encKey_a_2 ^ var2;
      long var6 = var2 ^ 119527531923319L;
      int var8 = (Integer)var5;
      var4.processAll_16(new Object[]{var8, var6});
   }

   private void invoke_12(Object[] var1) {
      rip.breeze.inject.Util140 var2 = (rip.breeze.inject.Util140)var1[0];
      long var3 = (Long)var1[1];
      Object var5 = var1[2];
      var3 = encKey_a_2 ^ var3;
      long var6 = var3 ^ 13824071317214L;
      long var8 = (Long)var5;
      var2.processAll_16(new Object[]{var8, var6});
   }

   private void invoke_13(Object[] var1) {
      long var2 = (Long)var1[0];
      rip.breeze.inject.Util140 var4 = (rip.breeze.inject.Util140)var1[1];
      Object var5 = var1[2];
      var2 = encKey_a_2 ^ var2;
      long var6 = var2 ^ 95705668681194L;
      float var8 = (Float)var5;
      var4.processAll_16(new Object[]{var8, var6});
   }

   private void invoke_14(Object[] var1) {
      long var2 = (Long)var1[0];
      rip.breeze.inject.Util140 var4 = (rip.breeze.inject.Util140)var1[1];
      Object var5 = var1[2];
      var2 = encKey_a_2 ^ var2;
      long var6 = var2 ^ 135478738161248L;
      double var8 = (Double)var5;
      var4.processAll_16(new Object[]{var8, var6});
   }

   private void invoke_15(Object[] var1) {
      rip.breeze.inject.Util140 var2 = (rip.breeze.inject.Util140)var1[0];
      Object var3 = var1[1];
      long var4 = (Long)var1[2];
      var4 = encKey_a_2 ^ var4;
      long var6 = var4 ^ 139202391135845L;
      String var8 = (String)var3;
      var2.processAll_16(new Object[]{var8, var6});
   }

   private void invoke_16(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/Util140
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Object
      // 18: astore 5
      // 1a: pop
      // 1b: getstatic rip/breeze/classtransform/պ.encKey_a_2 J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: lload 3
      // 22: dup2
      // 23: ldc2_w 53429794833850
      // 26: lxor
      // 27: lstore 6
      // 29: pop2
      // 2a: invokestatic rip/breeze/classtransform/չ.method_069 ()[Ljava/lang/String;
      // 2d: astore 8
      // 2f: aload 8
      // 31: ifnull 79
      // 34: aload 5
      // 36: instanceof java/lang/Class
      // 39: ifne 52
      // 3c: goto 43
      // 3f: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 5
      // 45: instanceof rip/breeze/inject/MathUtil3
      // 48: ifeq 7e
      // 4b: goto 52
      // 4e: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: aload 0
      // 53: aload 2
      // 54: lload 6
      // 56: aload 5
      // 58: bipush 3
      // 59: anewarray 5
      // 5c: dup_x1
      // 5d: swap
      // 5e: bipush 2
      // 5f: swap
      // 60: aastore
      // 61: dup_x2
      // 62: dup_x2
      // 63: pop
      // 64: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 67: bipush 1
      // 68: swap
      // 69: aastore
      // 6a: dup_x1
      // 6b: swap
      // 6c: bipush 0
      // 6d: swap
      // 6e: aastore
      // 6f: invokespecial rip/breeze/classtransform/պ.method_022 ([Ljava/lang/Object;)V
      // 72: goto 79
      // 75: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: aload 8
      // 7b: ifnonnull ac
      // 7e: new java/lang/IllegalArgumentException
      // 81: dup
      // 82: new java/lang/StringBuilder
      // 85: dup
      // 86: invokespecial java/lang/StringBuilder.<init> ()V
      // 89: sipush 23363
      // 8c: ldc2_w 8965512830938463243
      // 8f: lload 3
      // 90: lxor
      // 91: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 99: aload 5
      // 9b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 9e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // a1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a4: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // a7: athrow
      // a8: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ab: athrow
      // ac: return
      // try (30 -> 35): 36 java/lang/IllegalStateException
      // try (32 -> 41): 42 java/lang/IllegalStateException
      // try (38 -> 68): 69 java/lang/IllegalStateException
      // try (71 -> 90): 90 java/lang/IllegalStateException
   }

   private void invoke_17(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/Util140
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Object
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 4
      // 01a: pop
      // 01b: getstatic rip/breeze/classtransform/պ.encKey_a_2 J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 128749928567573
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 137783468627707
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 39801546347697
      // 037: lxor
      // 038: lstore 10
      // 03a: pop2
      // 03b: invokestatic rip/breeze/classtransform/չ.method_069 ()[Ljava/lang/String;
      // 03e: astore 12
      // 040: aload 3
      // 041: instanceof java/lang/Enum
      // 044: aload 12
      // 046: ifnull 0ec
      // 049: ifeq 0d5
      // 04c: goto 053
      // 04f: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: aload 3
      // 054: checkcast java/lang/Enum
      // 057: astore 13
      // 059: aload 2
      // 05a: sipush 178
      // 05d: aload 13
      // 05f: invokevirtual java/lang/Enum.getDeclaringClass ()Ljava/lang/Class;
      // 062: lload 8
      // 064: dup2_x1
      // 065: pop2
      // 066: bipush 2
      // 067: anewarray 5
      // 06a: dup_x1
      // 06b: swap
      // 06c: bipush 1
      // 06d: swap
      // 06e: aastore
      // 06f: dup_x2
      // 070: dup_x2
      // 071: pop
      // 072: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 075: bipush 0
      // 076: swap
      // 077: aastore
      // 078: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 07b: lload 6
      // 07d: dup2_x1
      // 07e: pop2
      // 07f: aload 13
      // 081: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 084: aload 13
      // 086: invokevirtual java/lang/Enum.getDeclaringClass ()Ljava/lang/Class;
      // 089: lload 10
      // 08b: dup2_x1
      // 08c: pop2
      // 08d: bipush 2
      // 08e: anewarray 5
      // 091: dup_x1
      // 092: swap
      // 093: bipush 1
      // 094: swap
      // 095: aastore
      // 096: dup_x2
      // 097: dup_x2
      // 098: pop
      // 099: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09c: bipush 0
      // 09d: swap
      // 09e: aastore
      // 09f: invokestatic rip/breeze/classtransform/ջ.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0a2: bipush 5
      // 0a3: anewarray 5
      // 0a6: dup_x1
      // 0a7: swap
      // 0a8: bipush 4
      // 0a9: swap
      // 0aa: aastore
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: bipush 3
      // 0ae: swap
      // 0af: aastore
      // 0b0: dup_x1
      // 0b1: swap
      // 0b2: bipush 2
      // 0b3: swap
      // 0b4: aastore
      // 0b5: dup_x2
      // 0b6: dup_x2
      // 0b7: pop
      // 0b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bb: bipush 1
      // 0bc: swap
      // 0bd: aastore
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c3: bipush 0
      // 0c4: swap
      // 0c5: aastore
      // 0c6: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 0c9: aload 12
      // 0cb: lload 4
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: ifle 0d6
      // 0d2: ifnonnull 176
      // 0d5: aload 3
      // 0d6: aload 12
      // 0d8: ifnull 0f0
      // 0db: goto 0e2
      // 0de: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: instanceof [Ljava/lang/String;
      // 0e5: goto 0ec
      // 0e8: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: ifeq 148
      // 0ef: aload 3
      // 0f0: checkcast [Ljava/lang/String;
      // 0f3: checkcast [Ljava/lang/String;
      // 0f6: astore 13
      // 0f8: aload 13
      // 0fa: bipush 0
      // 0fb: aaload
      // 0fc: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 0ff: astore 14
      // 101: aload 14
      // 103: bipush 0
      // 104: anewarray 5
      // 107: invokevirtual rip/breeze/inject/MathUtil3.buildString_3 ([Ljava/lang/Object;)Ljava/lang/String;
      // 10a: astore 15
      // 10c: aload 2
      // 10d: sipush 178
      // 110: lload 6
      // 112: aload 15
      // 114: aload 13
      // 116: bipush 1
      // 117: aaload
      // 118: aload 13
      // 11a: bipush 0
      // 11b: aaload
      // 11c: bipush 5
      // 11d: anewarray 5
      // 120: dup_x1
      // 121: swap
      // 122: bipush 4
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: bipush 3
      // 128: swap
      // 129: aastore
      // 12a: dup_x1
      // 12b: swap
      // 12c: bipush 2
      // 12d: swap
      // 12e: aastore
      // 12f: dup_x2
      // 130: dup_x2
      // 131: pop
      // 132: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 135: bipush 1
      // 136: swap
      // 137: aastore
      // 138: dup_x1
      // 139: swap
      // 13a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13d: bipush 0
      // 13e: swap
      // 13f: aastore
      // 140: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 143: aload 12
      // 145: ifnonnull 176
      // 148: new java/lang/IllegalArgumentException
      // 14b: dup
      // 14c: new java/lang/StringBuilder
      // 14f: dup
      // 150: invokespecial java/lang/StringBuilder.<init> ()V
      // 153: sipush 22378
      // 156: ldc2_w 4275261402263820038
      // 159: lload 4
      // 15b: lxor
      // 15c: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 164: aload 3
      // 165: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 168: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 16b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16e: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 171: athrow
      // 172: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 175: athrow
      // 176: return
      // try (38 -> 43): 44 java/lang/IllegalStateException
      // try (49 -> 136): 137 java/lang/IllegalStateException
      // try (133 -> 140): 141 java/lang/IllegalStateException
      // try (158 -> 218): 218 java/lang/IllegalStateException
   }

   private void invoke_18(Object[] param1) {
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
      // 00e: checkcast rip/breeze/inject/Util140
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Object
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic rip/breeze/classtransform/պ.encKey_a_2 J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 19767014608802
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 29639930677689
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 60902808165612
      // 035: lxor
      // 036: lstore 10
      // 038: dup2
      // 039: ldc2_w 26142586773885
      // 03c: lxor
      // 03d: lstore 12
      // 03f: dup2
      // 040: ldc2_w 1251234344922
      // 043: lxor
      // 044: lstore 14
      // 046: dup2
      // 047: ldc2_w 87998438385790
      // 04a: lxor
      // 04b: lstore 16
      // 04d: dup2
      // 04e: ldc2_w 27112936762314
      // 051: lxor
      // 052: lstore 18
      // 054: dup2
      // 055: ldc2_w 91179912735422
      // 058: lxor
      // 059: lstore 20
      // 05b: dup2
      // 05c: ldc2_w 48604150290271
      // 05f: lxor
      // 060: lstore 22
      // 062: dup2
      // 063: ldc2_w 87541662346584
      // 066: lxor
      // 067: lstore 24
      // 069: dup2
      // 06a: ldc2_w 49611848028751
      // 06d: lxor
      // 06e: lstore 26
      // 070: dup2
      // 071: ldc2_w 139213392121228
      // 074: lxor
      // 075: lstore 28
      // 077: dup2
      // 078: ldc2_w 10357449239092
      // 07b: lxor
      // 07c: lstore 30
      // 07e: pop2
      // 07f: invokestatic rip/breeze/classtransform/չ.method_069 ()[Ljava/lang/String;
      // 082: astore 32
      // 084: aload 5
      // 086: instanceof java/lang/annotation/Annotation
      // 089: aload 32
      // 08b: ifnull 0e0
      // 08e: ifeq 0c8
      // 091: goto 098
      // 094: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: aload 5
      // 09a: checkcast java/lang/annotation/Annotation
      // 09d: invokeinterface java/lang/annotation/Annotation.annotationType ()Ljava/lang/Class; 1
      // 0a2: lload 24
      // 0a4: dup2_x1
      // 0a5: pop2
      // 0a6: bipush 2
      // 0a7: anewarray 5
      // 0aa: dup_x1
      // 0ab: swap
      // 0ac: bipush 1
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x2
      // 0b0: dup_x2
      // 0b1: pop
      // 0b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 0bb: astore 33
      // 0bd: aload 32
      // 0bf: lload 2
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: ifle 324
      // 0c5: ifnonnull 13f
      // 0c8: aload 5
      // 0ca: aload 32
      // 0cc: ifnull 0e5
      // 0cf: goto 0d6
      // 0d2: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: instanceof rip/breeze/inject/ù
      // 0d9: goto 0e0
      // 0dc: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: ifeq 111
      // 0e3: aload 5
      // 0e5: checkcast rip/breeze/inject/ù
      // 0e8: getfield rip/breeze/inject/ù.string_ü_2 Ljava/lang/String;
      // 0eb: lload 24
      // 0ed: dup2_x1
      // 0ee: pop2
      // 0ef: bipush 2
      // 0f0: anewarray 5
      // 0f3: dup_x1
      // 0f4: swap
      // 0f5: bipush 1
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 0
      // 0ff: swap
      // 100: aastore
      // 101: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 104: astore 33
      // 106: aload 32
      // 108: lload 2
      // 109: lconst_0
      // 10a: lcmp
      // 10b: iflt 324
      // 10e: ifnonnull 13f
      // 111: new java/lang/IllegalArgumentException
      // 114: dup
      // 115: new java/lang/StringBuilder
      // 118: dup
      // 119: invokespecial java/lang/StringBuilder.<init> ()V
      // 11c: sipush 5486
      // 11f: ldc2_w 5653161128558586325
      // 122: lload 2
      // 123: lxor
      // 124: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12c: aload 5
      // 12e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 134: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 137: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 13a: athrow
      // 13b: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: aload 4
      // 141: aload 33
      // 143: lload 10
      // 145: bipush 2
      // 146: anewarray 5
      // 149: dup_x2
      // 14a: dup_x2
      // 14b: pop
      // 14c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14f: bipush 1
      // 150: swap
      // 151: aastore
      // 152: dup_x1
      // 153: swap
      // 154: bipush 0
      // 155: swap
      // 156: aastore
      // 157: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 15a: aload 4
      // 15c: lload 28
      // 15e: bipush 25
      // 160: bipush 0
      // 161: bipush 3
      // 162: anewarray 5
      // 165: dup_x1
      // 166: swap
      // 167: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 16a: bipush 2
      // 16b: swap
      // 16c: aastore
      // 16d: dup_x1
      // 16e: swap
      // 16f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
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
      // 17e: invokevirtual rip/breeze/inject/Util140.processAll_8 ([Ljava/lang/Object;)V
      // 181: aload 4
      // 183: sipush 180
      // 186: aload 0
      // 187: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 18a: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 18d: lload 14
      // 18f: dup2_x1
      // 190: pop2
      // 191: sipush 14658
      // 194: ldc2_w 8750542920886076906
      // 197: lload 2
      // 198: lxor
      // 199: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: lload 16
      // 1a0: ldc rip/breeze/classtransform/ժ
      // 1a2: bipush 2
      // 1a3: anewarray 5
      // 1a6: dup_x1
      // 1a7: swap
      // 1a8: bipush 1
      // 1a9: swap
      // 1aa: aastore
      // 1ab: dup_x2
      // 1ac: dup_x2
      // 1ad: pop
      // 1ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b1: bipush 0
      // 1b2: swap
      // 1b3: aastore
      // 1b4: invokestatic rip/breeze/classtransform/ջ.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1b7: bipush 5
      // 1b8: anewarray 5
      // 1bb: dup_x1
      // 1bc: swap
      // 1bd: bipush 4
      // 1be: swap
      // 1bf: aastore
      // 1c0: dup_x1
      // 1c1: swap
      // 1c2: bipush 3
      // 1c3: swap
      // 1c4: aastore
      // 1c5: dup_x1
      // 1c6: swap
      // 1c7: bipush 2
      // 1c8: swap
      // 1c9: aastore
      // 1ca: dup_x2
      // 1cb: dup_x2
      // 1cc: pop
      // 1cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d0: bipush 1
      // 1d1: swap
      // 1d2: aastore
      // 1d3: dup_x1
      // 1d4: swap
      // 1d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d8: bipush 0
      // 1d9: swap
      // 1da: aastore
      // 1db: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 1de: aload 4
      // 1e0: lload 28
      // 1e2: bipush 25
      // 1e4: bipush 0
      // 1e5: bipush 3
      // 1e6: anewarray 5
      // 1e9: dup_x1
      // 1ea: swap
      // 1eb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ee: bipush 2
      // 1ef: swap
      // 1f0: aastore
      // 1f1: dup_x1
      // 1f2: swap
      // 1f3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1f6: bipush 1
      // 1f7: swap
      // 1f8: aastore
      // 1f9: dup_x2
      // 1fa: dup_x2
      // 1fb: pop
      // 1fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ff: bipush 0
      // 200: swap
      // 201: aastore
      // 202: invokevirtual rip/breeze/inject/Util140.processAll_8 ([Ljava/lang/Object;)V
      // 205: aload 4
      // 207: sipush 180
      // 20a: aload 0
      // 20b: getfield rip/breeze/classtransform/պ.é_ú_2 Lrip/breeze/inject/é;
      // 20e: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 211: lload 14
      // 213: dup2_x1
      // 214: pop2
      // 215: sipush 929
      // 218: ldc2_w 201028312941559574
      // 21b: lload 2
      // 21c: lxor
      // 21d: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: lload 16
      // 224: ldc rip/breeze/classtransform/է
      // 226: bipush 2
      // 227: anewarray 5
      // 22a: dup_x1
      // 22b: swap
      // 22c: bipush 1
      // 22d: swap
      // 22e: aastore
      // 22f: dup_x2
      // 230: dup_x2
      // 231: pop
      // 232: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 235: bipush 0
      // 236: swap
      // 237: aastore
      // 238: invokestatic rip/breeze/classtransform/ջ.method_006 ([Ljava/lang/Object;)Ljava/lang/String;
      // 23b: bipush 5
      // 23c: anewarray 5
      // 23f: dup_x1
      // 240: swap
      // 241: bipush 4
      // 242: swap
      // 243: aastore
      // 244: dup_x1
      // 245: swap
      // 246: bipush 3
      // 247: swap
      // 248: aastore
      // 249: dup_x1
      // 24a: swap
      // 24b: bipush 2
      // 24c: swap
      // 24d: aastore
      // 24e: dup_x2
      // 24f: dup_x2
      // 250: pop
      // 251: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 254: bipush 1
      // 255: swap
      // 256: aastore
      // 257: dup_x1
      // 258: swap
      // 259: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 25c: bipush 0
      // 25d: swap
      // 25e: aastore
      // 25f: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 262: aload 4
      // 264: sipush 187
      // 267: lload 30
      // 269: ldc_w java/util/HashMap
      // 26c: bipush 2
      // 26d: anewarray 5
      // 270: dup_x1
      // 271: swap
      // 272: bipush 1
      // 273: swap
      // 274: aastore
      // 275: dup_x2
      // 276: dup_x2
      // 277: pop
      // 278: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27b: bipush 0
      // 27c: swap
      // 27d: aastore
      // 27e: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 281: lload 22
      // 283: dup2_x1
      // 284: pop2
      // 285: bipush 3
      // 286: anewarray 5
      // 289: dup_x1
      // 28a: swap
      // 28b: bipush 2
      // 28c: swap
      // 28d: aastore
      // 28e: dup_x2
      // 28f: dup_x2
      // 290: pop
      // 291: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 294: bipush 1
      // 295: swap
      // 296: aastore
      // 297: dup_x1
      // 298: swap
      // 299: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 29c: bipush 0
      // 29d: swap
      // 29e: aastore
      // 29f: invokevirtual rip/breeze/inject/Util140.processAll_9 ([Ljava/lang/Object;)V
      // 2a2: aload 4
      // 2a4: bipush 89
      // 2a6: lload 20
      // 2a8: bipush 2
      // 2a9: anewarray 5
      // 2ac: dup_x2
      // 2ad: dup_x2
      // 2ae: pop
      // 2af: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b2: bipush 1
      // 2b3: swap
      // 2b4: aastore
      // 2b5: dup_x1
      // 2b6: swap
      // 2b7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2ba: bipush 0
      // 2bb: swap
      // 2bc: aastore
      // 2bd: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 2c0: aload 4
      // 2c2: lload 8
      // 2c4: sipush 183
      // 2c7: lload 30
      // 2c9: ldc_w java/util/HashMap
      // 2cc: bipush 2
      // 2cd: anewarray 5
      // 2d0: dup_x1
      // 2d1: swap
      // 2d2: bipush 1
      // 2d3: swap
      // 2d4: aastore
      // 2d5: dup_x2
      // 2d6: dup_x2
      // 2d7: pop
      // 2d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2db: bipush 0
      // 2dc: swap
      // 2dd: aastore
      // 2de: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 2e1: sipush 5949
      // 2e4: ldc2_w 7967924315625417620
      // 2e7: lload 2
      // 2e8: lxor
      // 2e9: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ee: getstatic rip/breeze/classtransform/ջ.CONST_Ò_2 Ljava/lang/String;
      // 2f1: bipush 0
      // 2f2: bipush 6
      // 2f4: anewarray 5
      // 2f7: dup_x1
      // 2f8: swap
      // 2f9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2fc: bipush 5
      // 2fd: swap
      // 2fe: aastore
      // 2ff: dup_x1
      // 300: swap
      // 301: bipush 4
      // 302: swap
      // 303: aastore
      // 304: dup_x1
      // 305: swap
      // 306: bipush 3
      // 307: swap
      // 308: aastore
      // 309: dup_x1
      // 30a: swap
      // 30b: bipush 2
      // 30c: swap
      // 30d: aastore
      // 30e: dup_x1
      // 30f: swap
      // 310: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 313: bipush 1
      // 314: swap
      // 315: aastore
      // 316: dup_x2
      // 317: dup_x2
      // 318: pop
      // 319: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31c: bipush 0
      // 31d: swap
      // 31e: aastore
      // 31f: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 322: aload 5
      // 324: aload 32
      // 326: ifnull 579
      // 329: instanceof java/lang/annotation/Annotation
      // 32c: ifeq 570
      // 32f: goto 336
      // 332: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 335: athrow
      // 336: aload 5
      // 338: checkcast java/lang/annotation/Annotation
      // 33b: astore 34
      // 33d: aload 34
      // 33f: invokeinterface java/lang/annotation/Annotation.annotationType ()Ljava/lang/Class; 1
      // 344: invokevirtual java/lang/Class.getDeclaredMethods ()[Ljava/lang/reflect/Method;
      // 347: astore 35
      // 349: aload 35
      // 34b: arraylength
      // 34c: istore 36
      // 34e: bipush 0
      // 34f: istore 37
      // 351: iload 37
      // 353: iload 36
      // 355: if_icmpge 55f
      // 358: aload 35
      // 35a: iload 37
      // 35c: aaload
      // 35d: astore 38
      // 35f: aload 32
      // 361: ifnull 7f6
      // 364: aload 38
      // 366: aload 32
      // 368: ifnull 39a
      // 36b: goto 372
      // 36e: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 371: athrow
      // 372: lload 2
      // 373: lconst_0
      // 374: lcmp
      // 375: iflt 391
      // 378: invokevirtual java/lang/reflect/Method.getModifiers ()I
      // 37b: invokestatic java/lang/reflect/Modifier.isAbstract (I)Z
      // 37e: ifne 38f
      // 381: goto 388
      // 384: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 387: athrow
      // 388: goto 557
      // 38b: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38e: athrow
      // 38f: aload 38
      // 391: aload 5
      // 393: bipush 0
      // 394: anewarray 5
      // 397: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 39a: astore 39
      // 39c: aload 39
      // 39e: ifnonnull 3cf
      // 3a1: new java/lang/IllegalArgumentException
      // 3a4: dup
      // 3a5: new java/lang/StringBuilder
      // 3a8: dup
      // 3a9: invokespecial java/lang/StringBuilder.<init> ()V
      // 3ac: sipush 31801
      // 3af: ldc2_w 7292176778969645204
      // 3b2: lload 2
      // 3b3: lxor
      // 3b4: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3bc: aload 38
      // 3be: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 3c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3c7: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 3ca: athrow
      // 3cb: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ce: athrow
      // 3cf: goto 422
      // 3d2: astore 40
      // 3d4: new java/lang/IllegalStateException
      // 3d7: dup
      // 3d8: new java/lang/StringBuilder
      // 3db: dup
      // 3dc: invokespecial java/lang/StringBuilder.<init> ()V
      // 3df: sipush 26800
      // 3e2: ldc2_w 8477868131888239647
      // 3e5: lload 2
      // 3e6: lxor
      // 3e7: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ef: aload 38
      // 3f1: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 3f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f7: sipush 15409
      // 3fa: ldc2_w 6373461873170399389
      // 3fd: lload 2
      // 3fe: lxor
      // 3ff: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 404: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 407: aload 34
      // 409: invokeinterface java/lang/annotation/Annotation.annotationType ()Ljava/lang/Class; 1
      // 40e: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 411: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 414: ldc "'"
      // 416: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 419: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 41c: aload 40
      // 41e: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 421: athrow
      // 422: aload 4
      // 424: bipush 89
      // 426: lload 20
      // 428: bipush 2
      // 429: anewarray 5
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
      // 43d: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 440: aload 4
      // 442: aload 38
      // 444: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 447: lload 10
      // 449: bipush 2
      // 44a: anewarray 5
      // 44d: dup_x2
      // 44e: dup_x2
      // 44f: pop
      // 450: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 453: bipush 1
      // 454: swap
      // 455: aastore
      // 456: dup_x1
      // 457: swap
      // 458: bipush 0
      // 459: swap
      // 45a: aastore
      // 45b: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 45e: aload 0
      // 45f: aload 4
      // 461: aload 38
      // 463: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 466: aload 39
      // 468: lload 12
      // 46a: bipush 4
      // 46b: anewarray 5
      // 46e: dup_x2
      // 46f: dup_x2
      // 470: pop
      // 471: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 474: bipush 3
      // 475: swap
      // 476: aastore
      // 477: dup_x1
      // 478: swap
      // 479: bipush 2
      // 47a: swap
      // 47b: aastore
      // 47c: dup_x1
      // 47d: swap
      // 47e: bipush 1
      // 47f: swap
      // 480: aastore
      // 481: dup_x1
      // 482: swap
      // 483: bipush 0
      // 484: swap
      // 485: aastore
      // 486: invokespecial rip/breeze/classtransform/պ.method_006 ([Ljava/lang/Object;)V
      // 489: aload 0
      // 48a: aload 4
      // 48c: aload 38
      // 48e: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 491: lload 26
      // 493: dup2_x1
      // 494: pop2
      // 495: bipush 3
      // 496: anewarray 5
      // 499: dup_x1
      // 49a: swap
      // 49b: bipush 2
      // 49c: swap
      // 49d: aastore
      // 49e: dup_x2
      // 49f: dup_x2
      // 4a0: pop
      // 4a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a4: bipush 1
      // 4a5: swap
      // 4a6: aastore
      // 4a7: dup_x1
      // 4a8: swap
      // 4a9: bipush 0
      // 4aa: swap
      // 4ab: aastore
      // 4ac: invokespecial rip/breeze/classtransform/պ.method_021 ([Ljava/lang/Object;)V
      // 4af: aload 4
      // 4b1: lload 8
      // 4b3: sipush 185
      // 4b6: lload 30
      // 4b8: ldc java/util/Map
      // 4ba: bipush 2
      // 4bb: anewarray 5
      // 4be: dup_x1
      // 4bf: swap
      // 4c0: bipush 1
      // 4c1: swap
      // 4c2: aastore
      // 4c3: dup_x2
      // 4c4: dup_x2
      // 4c5: pop
      // 4c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c9: bipush 0
      // 4ca: swap
      // 4cb: aastore
      // 4cc: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 4cf: sipush 27301
      // 4d2: ldc2_w 1684308154145052179
      // 4d5: lload 2
      // 4d6: lxor
      // 4d7: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4dc: lload 6
      // 4de: ldc java/lang/Object
      // 4e0: bipush 2
      // 4e1: anewarray 5
      // 4e4: dup
      // 4e5: bipush 0
      // 4e6: ldc java/lang/Object
      // 4e8: aastore
      // 4e9: dup
      // 4ea: bipush 1
      // 4eb: ldc java/lang/Object
      // 4ed: aastore
      // 4ee: bipush 3
      // 4ef: anewarray 5
      // 4f2: dup_x1
      // 4f3: swap
      // 4f4: bipush 2
      // 4f5: swap
      // 4f6: aastore
      // 4f7: dup_x1
      // 4f8: swap
      // 4f9: bipush 1
      // 4fa: swap
      // 4fb: aastore
      // 4fc: dup_x2
      // 4fd: dup_x2
      // 4fe: pop
      // 4ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 502: bipush 0
      // 503: swap
      // 504: aastore
      // 505: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 508: bipush 1
      // 509: bipush 6
      // 50b: anewarray 5
      // 50e: dup_x1
      // 50f: swap
      // 510: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 513: bipush 5
      // 514: swap
      // 515: aastore
      // 516: dup_x1
      // 517: swap
      // 518: bipush 4
      // 519: swap
      // 51a: aastore
      // 51b: dup_x1
      // 51c: swap
      // 51d: bipush 3
      // 51e: swap
      // 51f: aastore
      // 520: dup_x1
      // 521: swap
      // 522: bipush 2
      // 523: swap
      // 524: aastore
      // 525: dup_x1
      // 526: swap
      // 527: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 52a: bipush 1
      // 52b: swap
      // 52c: aastore
      // 52d: dup_x2
      // 52e: dup_x2
      // 52f: pop
      // 530: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 533: bipush 0
      // 534: swap
      // 535: aastore
      // 536: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 539: aload 4
      // 53b: bipush 87
      // 53d: lload 20
      // 53f: bipush 2
      // 540: anewarray 5
      // 543: dup_x2
      // 544: dup_x2
      // 545: pop
      // 546: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 549: bipush 1
      // 54a: swap
      // 54b: aastore
      // 54c: dup_x1
      // 54d: swap
      // 54e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 551: bipush 0
      // 552: swap
      // 553: aastore
      // 554: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 557: iinc 37 1
      // 55a: aload 32
      // 55c: ifnonnull 351
      // 55f: lload 2
      // 560: lconst_0
      // 561: lcmp
      // 562: iflt 7f6
      // 565: lload 2
      // 566: lconst_0
      // 567: lcmp
      // 568: ifle 7f6
      // 56b: aload 32
      // 56d: ifnonnull 723
      // 570: aload 5
      // 572: goto 579
      // 575: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 578: athrow
      // 579: checkcast rip/breeze/inject/ù
      // 57c: astore 34
      // 57e: aload 34
      // 580: getfield rip/breeze/inject/ù.list_û_2 Ljava/util/List;
      // 583: lload 18
      // 585: bipush 2
      // 586: anewarray 5
      // 589: dup_x2
      // 58a: dup_x2
      // 58b: pop
      // 58c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 58f: bipush 1
      // 590: swap
      // 591: aastore
      // 592: dup_x1
      // 593: swap
      // 594: bipush 0
      // 595: swap
      // 596: aastore
      // 597: invokestatic rip/breeze/classtransform/չ.method_001 ([Ljava/lang/Object;)Ljava/util/Map;
      // 59a: astore 35
      // 59c: aload 35
      // 59e: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 5a3: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 5a8: astore 36
      // 5aa: aload 36
      // 5ac: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5b1: ifeq 723
      // 5b4: aload 36
      // 5b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5bb: checkcast java/util/Map$Entry
      // 5be: astore 37
      // 5c0: aload 4
      // 5c2: bipush 89
      // 5c4: lload 20
      // 5c6: bipush 2
      // 5c7: anewarray 5
      // 5ca: dup_x2
      // 5cb: dup_x2
      // 5cc: pop
      // 5cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5d0: bipush 1
      // 5d1: swap
      // 5d2: aastore
      // 5d3: dup_x1
      // 5d4: swap
      // 5d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5d8: bipush 0
      // 5d9: swap
      // 5da: aastore
      // 5db: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 5de: aload 4
      // 5e0: aload 37
      // 5e2: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 5e7: lload 10
      // 5e9: bipush 2
      // 5ea: anewarray 5
      // 5ed: dup_x2
      // 5ee: dup_x2
      // 5ef: pop
      // 5f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f3: bipush 1
      // 5f4: swap
      // 5f5: aastore
      // 5f6: dup_x1
      // 5f7: swap
      // 5f8: bipush 0
      // 5f9: swap
      // 5fa: aastore
      // 5fb: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 5fe: aload 0
      // 5ff: aload 4
      // 601: aload 37
      // 603: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 608: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 60b: aload 37
      // 60d: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 612: lload 12
      // 614: bipush 4
      // 615: anewarray 5
      // 618: dup_x2
      // 619: dup_x2
      // 61a: pop
      // 61b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 61e: bipush 3
      // 61f: swap
      // 620: aastore
      // 621: dup_x1
      // 622: swap
      // 623: bipush 2
      // 624: swap
      // 625: aastore
      // 626: dup_x1
      // 627: swap
      // 628: bipush 1
      // 629: swap
      // 62a: aastore
      // 62b: dup_x1
      // 62c: swap
      // 62d: bipush 0
      // 62e: swap
      // 62f: aastore
      // 630: invokespecial rip/breeze/classtransform/պ.method_006 ([Ljava/lang/Object;)V
      // 633: aload 0
      // 634: aload 4
      // 636: aload 37
      // 638: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 63d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 640: lload 26
      // 642: dup2_x1
      // 643: pop2
      // 644: bipush 3
      // 645: anewarray 5
      // 648: dup_x1
      // 649: swap
      // 64a: bipush 2
      // 64b: swap
      // 64c: aastore
      // 64d: dup_x2
      // 64e: dup_x2
      // 64f: pop
      // 650: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 653: bipush 1
      // 654: swap
      // 655: aastore
      // 656: dup_x1
      // 657: swap
      // 658: bipush 0
      // 659: swap
      // 65a: aastore
      // 65b: invokespecial rip/breeze/classtransform/պ.method_021 ([Ljava/lang/Object;)V
      // 65e: aload 4
      // 660: lload 8
      // 662: sipush 185
      // 665: lload 30
      // 667: ldc java/util/Map
      // 669: bipush 2
      // 66a: anewarray 5
      // 66d: dup_x1
      // 66e: swap
      // 66f: bipush 1
      // 670: swap
      // 671: aastore
      // 672: dup_x2
      // 673: dup_x2
      // 674: pop
      // 675: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 678: bipush 0
      // 679: swap
      // 67a: aastore
      // 67b: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 67e: sipush 27108
      // 681: ldc2_w 5281336898256573762
      // 684: lload 2
      // 685: lxor
      // 686: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68b: lload 6
      // 68d: ldc java/lang/Object
      // 68f: bipush 2
      // 690: anewarray 5
      // 693: dup
      // 694: bipush 0
      // 695: ldc java/lang/Object
      // 697: aastore
      // 698: dup
      // 699: bipush 1
      // 69a: ldc java/lang/Object
      // 69c: aastore
      // 69d: bipush 3
      // 69e: anewarray 5
      // 6a1: dup_x1
      // 6a2: swap
      // 6a3: bipush 2
      // 6a4: swap
      // 6a5: aastore
      // 6a6: dup_x1
      // 6a7: swap
      // 6a8: bipush 1
      // 6a9: swap
      // 6aa: aastore
      // 6ab: dup_x2
      // 6ac: dup_x2
      // 6ad: pop
      // 6ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6b1: bipush 0
      // 6b2: swap
      // 6b3: aastore
      // 6b4: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 6b7: bipush 1
      // 6b8: bipush 6
      // 6ba: anewarray 5
      // 6bd: dup_x1
      // 6be: swap
      // 6bf: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6c2: bipush 5
      // 6c3: swap
      // 6c4: aastore
      // 6c5: dup_x1
      // 6c6: swap
      // 6c7: bipush 4
      // 6c8: swap
      // 6c9: aastore
      // 6ca: dup_x1
      // 6cb: swap
      // 6cc: bipush 3
      // 6cd: swap
      // 6ce: aastore
      // 6cf: dup_x1
      // 6d0: swap
      // 6d1: bipush 2
      // 6d2: swap
      // 6d3: aastore
      // 6d4: dup_x1
      // 6d5: swap
      // 6d6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6d9: bipush 1
      // 6da: swap
      // 6db: aastore
      // 6dc: dup_x2
      // 6dd: dup_x2
      // 6de: pop
      // 6df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e2: bipush 0
      // 6e3: swap
      // 6e4: aastore
      // 6e5: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 6e8: aload 4
      // 6ea: bipush 87
      // 6ec: lload 20
      // 6ee: bipush 2
      // 6ef: anewarray 5
      // 6f2: dup_x2
      // 6f3: dup_x2
      // 6f4: pop
      // 6f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6f8: bipush 1
      // 6f9: swap
      // 6fa: aastore
      // 6fb: dup_x1
      // 6fc: swap
      // 6fd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 700: bipush 0
      // 701: swap
      // 702: aastore
      // 703: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 706: aload 32
      // 708: lload 2
      // 709: lconst_0
      // 70a: lcmp
      // 70b: iflt 713
      // 70e: ifnull 7f6
      // 711: aload 32
      // 713: ifnonnull 5aa
      // 716: lload 2
      // 717: lconst_0
      // 718: lcmp
      // 719: iflt 706
      // 71c: goto 723
      // 71f: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 722: athrow
      // 723: aload 4
      // 725: lload 8
      // 727: sipush 184
      // 72a: lload 30
      // 72c: ldc rip/breeze/classtransform/պ
      // 72e: bipush 2
      // 72f: anewarray 5
      // 732: dup_x1
      // 733: swap
      // 734: bipush 1
      // 735: swap
      // 736: aastore
      // 737: dup_x2
      // 738: dup_x2
      // 739: pop
      // 73a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 73d: bipush 0
      // 73e: swap
      // 73f: aastore
      // 740: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 743: sipush 2640
      // 746: ldc2_w 84696288494712552
      // 749: lload 2
      // 74a: lxor
      // 74b: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 750: lload 6
      // 752: ldc java/lang/annotation/Annotation
      // 754: bipush 4
      // 755: anewarray 5
      // 758: dup
      // 759: bipush 0
      // 75a: ldc java/lang/Class
      // 75c: aastore
      // 75d: dup
      // 75e: bipush 1
      // 75f: ldc rip/breeze/classtransform/ժ
      // 761: aastore
      // 762: dup
      // 763: bipush 2
      // 764: ldc rip/breeze/classtransform/է
      // 766: aastore
      // 767: dup
      // 768: bipush 3
      // 769: ldc java/util/Map
      // 76b: aastore
      // 76c: bipush 3
      // 76d: anewarray 5
      // 770: dup_x1
      // 771: swap
      // 772: bipush 2
      // 773: swap
      // 774: aastore
      // 775: dup_x1
      // 776: swap
      // 777: bipush 1
      // 778: swap
      // 779: aastore
      // 77a: dup_x2
      // 77b: dup_x2
      // 77c: pop
      // 77d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 780: bipush 0
      // 781: swap
      // 782: aastore
      // 783: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 786: bipush 0
      // 787: bipush 6
      // 789: anewarray 5
      // 78c: dup_x1
      // 78d: swap
      // 78e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 791: bipush 5
      // 792: swap
      // 793: aastore
      // 794: dup_x1
      // 795: swap
      // 796: bipush 4
      // 797: swap
      // 798: aastore
      // 799: dup_x1
      // 79a: swap
      // 79b: bipush 3
      // 79c: swap
      // 79d: aastore
      // 79e: dup_x1
      // 79f: swap
      // 7a0: bipush 2
      // 7a1: swap
      // 7a2: aastore
      // 7a3: dup_x1
      // 7a4: swap
      // 7a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7a8: bipush 1
      // 7a9: swap
      // 7aa: aastore
      // 7ab: dup_x2
      // 7ac: dup_x2
      // 7ad: pop
      // 7ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b1: bipush 0
      // 7b2: swap
      // 7b3: aastore
      // 7b4: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 7b7: aload 4
      // 7b9: sipush 192
      // 7bc: lload 30
      // 7be: aload 33
      // 7c0: bipush 2
      // 7c1: anewarray 5
      // 7c4: dup_x1
      // 7c5: swap
      // 7c6: bipush 1
      // 7c7: swap
      // 7c8: aastore
      // 7c9: dup_x2
      // 7ca: dup_x2
      // 7cb: pop
      // 7cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7cf: bipush 0
      // 7d0: swap
      // 7d1: aastore
      // 7d2: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 7d5: lload 22
      // 7d7: dup2_x1
      // 7d8: pop2
      // 7d9: bipush 3
      // 7da: anewarray 5
      // 7dd: dup_x1
      // 7de: swap
      // 7df: bipush 2
      // 7e0: swap
      // 7e1: aastore
      // 7e2: dup_x2
      // 7e3: dup_x2
      // 7e4: pop
      // 7e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7e8: bipush 1
      // 7e9: swap
      // 7ea: aastore
      // 7eb: dup_x1
      // 7ec: swap
      // 7ed: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7f0: bipush 0
      // 7f1: swap
      // 7f2: aastore
      // 7f3: invokevirtual rip/breeze/inject/Util140.processAll_9 ([Ljava/lang/Object;)V
      // 7f6: return
      // try (544 -> 563): 563 java/lang/Throwable
      // try (525 -> 536): 536 java/lang/Throwable
      // try (519 -> 532): 533 java/lang/Throwable
      // try (517 -> 522): 523 java/lang/Throwable
      // try (172 -> 495): 496 java/lang/Throwable
      // try (147 -> 170): 170 java/lang/Throwable
      // try (114 -> 121): 122 java/lang/Throwable
      // try (108 -> 117): 118 java/lang/Throwable
      // try (78 -> 83): 84 java/lang/Throwable
      // try (538 -> 565): 566 java/lang/Throwable
      // try (810 -> 821): 822 java/lang/Throwable
      // try (856 -> 1077): 1082 java/lang/Throwable
   }

   private void invoke_19(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/Util140
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
      // 01d: checkcast java/lang/Object
      // 020: astore 6
      // 022: pop
      // 023: getstatic rip/breeze/classtransform/պ.encKey_a_2 J
      // 026: lload 4
      // 028: lxor
      // 029: lstore 4
      // 02b: lload 4
      // 02d: dup2
      // 02e: ldc2_w 67155200083206
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 138831626305510
      // 038: lxor
      // 039: lstore 9
      // 03b: dup2
      // 03c: ldc2_w 677306106375
      // 03f: lxor
      // 040: lstore 11
      // 042: dup2
      // 043: ldc2_w 30568116177332
      // 046: lxor
      // 047: lstore 13
      // 049: dup2
      // 04a: ldc2_w 65351955182629
      // 04d: lxor
      // 04e: lstore 15
      // 050: dup2
      // 051: ldc2_w 41518167424876
      // 054: lxor
      // 055: lstore 17
      // 057: pop2
      // 058: invokestatic rip/breeze/classtransform/չ.method_069 ()[Ljava/lang/String;
      // 05b: astore 19
      // 05d: aload 6
      // 05f: instanceof [Ljava/lang/Object;
      // 062: aload 19
      // 064: ifnull 1b3
      // 067: ifeq 19b
      // 06a: goto 071
      // 06d: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: aload 6
      // 073: checkcast [Ljava/lang/Object;
      // 076: checkcast [Ljava/lang/Object;
      // 079: astore 20
      // 07b: aload 2
      // 07c: bipush 16
      // 07e: aload 20
      // 080: arraylength
      // 081: lload 7
      // 083: dup2_x1
      // 084: pop2
      // 085: bipush 3
      // 086: anewarray 5
      // 089: dup_x1
      // 08a: swap
      // 08b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08e: bipush 2
      // 08f: swap
      // 090: aastore
      // 091: dup_x2
      // 092: dup_x2
      // 093: pop
      // 094: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 097: bipush 1
      // 098: swap
      // 099: aastore
      // 09a: dup_x1
      // 09b: swap
      // 09c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09f: bipush 0
      // 0a0: swap
      // 0a1: aastore
      // 0a2: invokevirtual rip/breeze/inject/Util140.processAll_7 ([Ljava/lang/Object;)V
      // 0a5: aload 2
      // 0a6: sipush 189
      // 0a9: lload 17
      // 0ab: aload 3
      // 0ac: bipush 2
      // 0ad: anewarray 5
      // 0b0: dup_x1
      // 0b1: swap
      // 0b2: bipush 1
      // 0b3: swap
      // 0b4: aastore
      // 0b5: dup_x2
      // 0b6: dup_x2
      // 0b7: pop
      // 0b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bb: bipush 0
      // 0bc: swap
      // 0bd: aastore
      // 0be: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0c1: lload 11
      // 0c3: dup2_x1
      // 0c4: pop2
      // 0c5: bipush 3
      // 0c6: anewarray 5
      // 0c9: dup_x1
      // 0ca: swap
      // 0cb: bipush 2
      // 0cc: swap
      // 0cd: aastore
      // 0ce: dup_x2
      // 0cf: dup_x2
      // 0d0: pop
      // 0d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d4: bipush 1
      // 0d5: swap
      // 0d6: aastore
      // 0d7: dup_x1
      // 0d8: swap
      // 0d9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0dc: bipush 0
      // 0dd: swap
      // 0de: aastore
      // 0df: invokevirtual rip/breeze/inject/Util140.processAll_9 ([Ljava/lang/Object;)V
      // 0e2: bipush 0
      // 0e3: istore 21
      // 0e5: iload 21
      // 0e7: aload 20
      // 0e9: arraylength
      // 0ea: if_icmpge 18f
      // 0ed: aload 2
      // 0ee: bipush 89
      // 0f0: lload 9
      // 0f2: bipush 2
      // 0f3: anewarray 5
      // 0f6: dup_x2
      // 0f7: dup_x2
      // 0f8: pop
      // 0f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fc: bipush 1
      // 0fd: swap
      // 0fe: aastore
      // 0ff: dup_x1
      // 100: swap
      // 101: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 104: bipush 0
      // 105: swap
      // 106: aastore
      // 107: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 10a: aload 2
      // 10b: iload 21
      // 10d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 110: lload 13
      // 112: bipush 2
      // 113: anewarray 5
      // 116: dup_x2
      // 117: dup_x2
      // 118: pop
      // 119: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11c: bipush 1
      // 11d: swap
      // 11e: aastore
      // 11f: dup_x1
      // 120: swap
      // 121: bipush 0
      // 122: swap
      // 123: aastore
      // 124: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 127: aload 0
      // 128: aload 2
      // 129: aload 3
      // 12a: aload 20
      // 12c: iload 21
      // 12e: aaload
      // 12f: lload 15
      // 131: bipush 4
      // 132: anewarray 5
      // 135: dup_x2
      // 136: dup_x2
      // 137: pop
      // 138: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13b: bipush 3
      // 13c: swap
      // 13d: aastore
      // 13e: dup_x1
      // 13f: swap
      // 140: bipush 2
      // 141: swap
      // 142: aastore
      // 143: dup_x1
      // 144: swap
      // 145: bipush 1
      // 146: swap
      // 147: aastore
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 0
      // 14b: swap
      // 14c: aastore
      // 14d: invokespecial rip/breeze/classtransform/պ.method_006 ([Ljava/lang/Object;)V
      // 150: aload 2
      // 151: bipush 83
      // 153: lload 9
      // 155: bipush 2
      // 156: anewarray 5
      // 159: dup_x2
      // 15a: dup_x2
      // 15b: pop
      // 15c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15f: bipush 1
      // 160: swap
      // 161: aastore
      // 162: dup_x1
      // 163: swap
      // 164: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 167: bipush 0
      // 168: swap
      // 169: aastore
      // 16a: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 16d: iinc 21 1
      // 170: aload 19
      // 172: lload 4
      // 174: lconst_0
      // 175: lcmp
      // 176: iflt 17e
      // 179: ifnull 311
      // 17c: aload 19
      // 17e: ifnonnull 0e5
      // 181: lload 4
      // 183: lconst_0
      // 184: lcmp
      // 185: ifle 170
      // 188: goto 18f
      // 18b: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18e: athrow
      // 18f: aload 19
      // 191: lload 4
      // 193: lconst_0
      // 194: lcmp
      // 195: iflt 19d
      // 198: ifnonnull 311
      // 19b: aload 6
      // 19d: aload 19
      // 19f: ifnull 1b8
      // 1a2: goto 1a9
      // 1a5: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a8: athrow
      // 1a9: instanceof java/util/List
      // 1ac: goto 1b3
      // 1af: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b2: athrow
      // 1b3: ifeq 2e2
      // 1b6: aload 6
      // 1b8: checkcast java/util/List
      // 1bb: astore 20
      // 1bd: aload 2
      // 1be: bipush 16
      // 1c0: aload 20
      // 1c2: invokeinterface java/util/List.size ()I 1
      // 1c7: lload 7
      // 1c9: dup2_x1
      // 1ca: pop2
      // 1cb: bipush 3
      // 1cc: anewarray 5
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d4: bipush 2
      // 1d5: swap
      // 1d6: aastore
      // 1d7: dup_x2
      // 1d8: dup_x2
      // 1d9: pop
      // 1da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1dd: bipush 1
      // 1de: swap
      // 1df: aastore
      // 1e0: dup_x1
      // 1e1: swap
      // 1e2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e5: bipush 0
      // 1e6: swap
      // 1e7: aastore
      // 1e8: invokevirtual rip/breeze/inject/Util140.processAll_7 ([Ljava/lang/Object;)V
      // 1eb: aload 2
      // 1ec: sipush 189
      // 1ef: lload 17
      // 1f1: aload 3
      // 1f2: bipush 2
      // 1f3: anewarray 5
      // 1f6: dup_x1
      // 1f7: swap
      // 1f8: bipush 1
      // 1f9: swap
      // 1fa: aastore
      // 1fb: dup_x2
      // 1fc: dup_x2
      // 1fd: pop
      // 1fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 201: bipush 0
      // 202: swap
      // 203: aastore
      // 204: invokestatic rip/breeze/classtransform/ջ.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 207: lload 11
      // 209: dup2_x1
      // 20a: pop2
      // 20b: bipush 3
      // 20c: anewarray 5
      // 20f: dup_x1
      // 210: swap
      // 211: bipush 2
      // 212: swap
      // 213: aastore
      // 214: dup_x2
      // 215: dup_x2
      // 216: pop
      // 217: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21a: bipush 1
      // 21b: swap
      // 21c: aastore
      // 21d: dup_x1
      // 21e: swap
      // 21f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 222: bipush 0
      // 223: swap
      // 224: aastore
      // 225: invokevirtual rip/breeze/inject/Util140.processAll_9 ([Ljava/lang/Object;)V
      // 228: bipush 0
      // 229: istore 21
      // 22b: iload 21
      // 22d: aload 20
      // 22f: invokeinterface java/util/List.size ()I 1
      // 234: if_icmpge 2dd
      // 237: aload 2
      // 238: bipush 89
      // 23a: lload 9
      // 23c: bipush 2
      // 23d: anewarray 5
      // 240: dup_x2
      // 241: dup_x2
      // 242: pop
      // 243: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 246: bipush 1
      // 247: swap
      // 248: aastore
      // 249: dup_x1
      // 24a: swap
      // 24b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 24e: bipush 0
      // 24f: swap
      // 250: aastore
      // 251: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 254: aload 2
      // 255: iload 21
      // 257: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 25a: lload 13
      // 25c: bipush 2
      // 25d: anewarray 5
      // 260: dup_x2
      // 261: dup_x2
      // 262: pop
      // 263: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 266: bipush 1
      // 267: swap
      // 268: aastore
      // 269: dup_x1
      // 26a: swap
      // 26b: bipush 0
      // 26c: swap
      // 26d: aastore
      // 26e: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 271: aload 0
      // 272: aload 2
      // 273: aload 3
      // 274: aload 20
      // 276: iload 21
      // 278: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 27d: lload 15
      // 27f: bipush 4
      // 280: anewarray 5
      // 283: dup_x2
      // 284: dup_x2
      // 285: pop
      // 286: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 289: bipush 3
      // 28a: swap
      // 28b: aastore
      // 28c: dup_x1
      // 28d: swap
      // 28e: bipush 2
      // 28f: swap
      // 290: aastore
      // 291: dup_x1
      // 292: swap
      // 293: bipush 1
      // 294: swap
      // 295: aastore
      // 296: dup_x1
      // 297: swap
      // 298: bipush 0
      // 299: swap
      // 29a: aastore
      // 29b: invokespecial rip/breeze/classtransform/պ.method_006 ([Ljava/lang/Object;)V
      // 29e: aload 2
      // 29f: bipush 83
      // 2a1: lload 9
      // 2a3: bipush 2
      // 2a4: anewarray 5
      // 2a7: dup_x2
      // 2a8: dup_x2
      // 2a9: pop
      // 2aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ad: bipush 1
      // 2ae: swap
      // 2af: aastore
      // 2b0: dup_x1
      // 2b1: swap
      // 2b2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2b5: bipush 0
      // 2b6: swap
      // 2b7: aastore
      // 2b8: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 2bb: iinc 21 1
      // 2be: aload 19
      // 2c0: lload 4
      // 2c2: lconst_0
      // 2c3: lcmp
      // 2c4: ifle 2cc
      // 2c7: ifnull 311
      // 2ca: aload 19
      // 2cc: ifnonnull 22b
      // 2cf: lload 4
      // 2d1: lconst_0
      // 2d2: lcmp
      // 2d3: iflt 2be
      // 2d6: goto 2dd
      // 2d9: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2dc: athrow
      // 2dd: aload 19
      // 2df: ifnonnull 311
      // 2e2: new java/lang/IllegalArgumentException
      // 2e5: dup
      // 2e6: new java/lang/StringBuilder
      // 2e9: dup
      // 2ea: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ed: sipush 27692
      // 2f0: ldc2_w 6830076732592801217
      // 2f3: lload 4
      // 2f5: lxor
      // 2f6: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fe: aload 6
      // 300: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 303: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 306: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 309: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 30c: athrow
      // 30d: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 310: athrow
      // 311: return
      // try (55 -> 60): 61 java/lang/IllegalStateException
      // try (145 -> 243): 248 java/lang/IllegalStateException
      // try (250 -> 259): 260 java/lang/IllegalStateException
      // try (256 -> 263): 264 java/lang/IllegalStateException
      // try (348 -> 446): 451 java/lang/IllegalStateException
      // try (453 -> 472): 472 java/lang/IllegalStateException
   }

   private void invoke_20(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/Util140
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Object
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 4
      // 01a: pop
      // 01b: getstatic rip/breeze/classtransform/պ.encKey_a_2 J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 83717214396752
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 56049818180785
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 45812782683906
      // 037: lxor
      // 038: lstore 10
      // 03a: dup2
      // 03b: ldc2_w 9931558578835
      // 03e: lxor
      // 03f: lstore 12
      // 041: dup2
      // 042: ldc2_w 71407873917881
      // 045: lxor
      // 046: lstore 14
      // 048: dup2
      // 049: ldc2_w 56975895845281
      // 04c: lxor
      // 04d: lstore 16
      // 04f: pop2
      // 050: invokestatic rip/breeze/classtransform/չ.method_069 ()[Ljava/lang/String;
      // 053: astore 18
      // 055: aload 3
      // 056: aload 18
      // 058: ifnull 097
      // 05b: instanceof java/util/List
      // 05e: ifne 096
      // 061: goto 068
      // 064: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 067: athrow
      // 068: new java/lang/IllegalArgumentException
      // 06b: dup
      // 06c: new java/lang/StringBuilder
      // 06f: dup
      // 070: invokespecial java/lang/StringBuilder.<init> ()V
      // 073: sipush 9657
      // 076: ldc2_w 1875395372235461320
      // 079: lload 4
      // 07b: lxor
      // 07c: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: aload 3
      // 085: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 088: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 08b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 08e: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 091: athrow
      // 092: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095: athrow
      // 096: aload 3
      // 097: checkcast java/util/List
      // 09a: astore 19
      // 09c: aload 19
      // 09e: aload 18
      // 0a0: ifnull 101
      // 0a3: invokeinterface java/util/List.isEmpty ()Z 1
      // 0a8: ifeq 0f9
      // 0ab: goto 0b2
      // 0ae: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: aload 2
      // 0b3: bipush 3
      // 0b4: lload 6
      // 0b6: bipush 2
      // 0b7: anewarray 5
      // 0ba: dup_x2
      // 0bb: dup_x2
      // 0bc: pop
      // 0bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c0: bipush 1
      // 0c1: swap
      // 0c2: aastore
      // 0c3: dup_x1
      // 0c4: swap
      // 0c5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c8: bipush 0
      // 0c9: swap
      // 0ca: aastore
      // 0cb: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 0ce: aload 2
      // 0cf: sipush 189
      // 0d2: lload 8
      // 0d4: getstatic rip/breeze/classtransform/ջ.CONST_Þ_2 Ljava/lang/String;
      // 0d7: bipush 3
      // 0d8: anewarray 5
      // 0db: dup_x1
      // 0dc: swap
      // 0dd: bipush 2
      // 0de: swap
      // 0df: aastore
      // 0e0: dup_x2
      // 0e1: dup_x2
      // 0e2: pop
      // 0e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e6: bipush 1
      // 0e7: swap
      // 0e8: aastore
      // 0e9: dup_x1
      // 0ea: swap
      // 0eb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ee: bipush 0
      // 0ef: swap
      // 0f0: aastore
      // 0f1: invokevirtual rip/breeze/inject/Util140.processAll_9 ([Ljava/lang/Object;)V
      // 0f4: return
      // 0f5: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: aload 19
      // 0fb: bipush 0
      // 0fc: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 101: astore 20
      // 103: aload 20
      // 105: instanceof [Ljava/lang/String;
      // 108: aload 18
      // 10a: ifnull 262
      // 10d: ifeq 219
      // 110: goto 117
      // 113: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: aload 20
      // 119: checkcast [Ljava/lang/String;
      // 11c: checkcast [Ljava/lang/String;
      // 11f: astore 21
      // 121: aload 21
      // 123: bipush 0
      // 124: aaload
      // 125: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 128: astore 22
      // 12a: aload 22
      // 12c: bipush 0
      // 12d: anewarray 5
      // 130: invokevirtual rip/breeze/inject/MathUtil3.buildString_3 ([Ljava/lang/Object;)Ljava/lang/String;
      // 133: astore 23
      // 135: aload 2
      // 136: aload 19
      // 138: invokeinterface java/util/List.size ()I 1
      // 13d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 140: lload 10
      // 142: bipush 2
      // 143: anewarray 5
      // 146: dup_x2
      // 147: dup_x2
      // 148: pop
      // 149: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14c: bipush 1
      // 14d: swap
      // 14e: aastore
      // 14f: dup_x1
      // 150: swap
      // 151: bipush 0
      // 152: swap
      // 153: aastore
      // 154: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 157: aload 2
      // 158: sipush 189
      // 15b: lload 8
      // 15d: aload 23
      // 15f: bipush 3
      // 160: anewarray 5
      // 163: dup_x1
      // 164: swap
      // 165: bipush 2
      // 166: swap
      // 167: aastore
      // 168: dup_x2
      // 169: dup_x2
      // 16a: pop
      // 16b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16e: bipush 1
      // 16f: swap
      // 170: aastore
      // 171: dup_x1
      // 172: swap
      // 173: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 176: bipush 0
      // 177: swap
      // 178: aastore
      // 179: invokevirtual rip/breeze/inject/Util140.processAll_9 ([Ljava/lang/Object;)V
      // 17c: bipush 0
      // 17d: istore 24
      // 17f: iload 24
      // 181: aload 19
      // 183: invokeinterface java/util/List.size ()I 1
      // 188: if_icmpge 211
      // 18b: aload 2
      // 18c: bipush 89
      // 18e: lload 6
      // 190: bipush 2
      // 191: anewarray 5
      // 194: dup_x2
      // 195: dup_x2
      // 196: pop
      // 197: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19a: bipush 1
      // 19b: swap
      // 19c: aastore
      // 19d: dup_x1
      // 19e: swap
      // 19f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a2: bipush 0
      // 1a3: swap
      // 1a4: aastore
      // 1a5: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 1a8: aload 2
      // 1a9: iload 24
      // 1ab: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ae: lload 10
      // 1b0: bipush 2
      // 1b1: anewarray 5
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
      // 1c2: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 1c5: aload 0
      // 1c6: aload 2
      // 1c7: aload 19
      // 1c9: iload 24
      // 1cb: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d0: lload 14
      // 1d2: bipush 3
      // 1d3: anewarray 5
      // 1d6: dup_x2
      // 1d7: dup_x2
      // 1d8: pop
      // 1d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1dc: bipush 2
      // 1dd: swap
      // 1de: aastore
      // 1df: dup_x1
      // 1e0: swap
      // 1e1: bipush 1
      // 1e2: swap
      // 1e3: aastore
      // 1e4: dup_x1
      // 1e5: swap
      // 1e6: bipush 0
      // 1e7: swap
      // 1e8: aastore
      // 1e9: invokespecial rip/breeze/classtransform/պ.method_017 ([Ljava/lang/Object;)V
      // 1ec: aload 2
      // 1ed: bipush 83
      // 1ef: lload 6
      // 1f1: bipush 2
      // 1f2: anewarray 5
      // 1f5: dup_x2
      // 1f6: dup_x2
      // 1f7: pop
      // 1f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fb: bipush 1
      // 1fc: swap
      // 1fd: aastore
      // 1fe: dup_x1
      // 1ff: swap
      // 200: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 203: bipush 0
      // 204: swap
      // 205: aastore
      // 206: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 209: iinc 24 1
      // 20c: aload 18
      // 20e: ifnonnull 17f
      // 211: lload 4
      // 213: lconst_0
      // 214: lcmp
      // 215: iflt 20c
      // 218: return
      // 219: aload 2
      // 21a: aload 19
      // 21c: invokeinterface java/util/List.size ()I 1
      // 221: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 224: lload 10
      // 226: bipush 2
      // 227: anewarray 5
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
      // 238: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 23b: aload 2
      // 23c: sipush 189
      // 23f: lload 8
      // 241: getstatic rip/breeze/classtransform/ջ.CONST_Þ_2 Ljava/lang/String;
      // 244: bipush 3
      // 245: anewarray 5
      // 248: dup_x1
      // 249: swap
      // 24a: bipush 2
      // 24b: swap
      // 24c: aastore
      // 24d: dup_x2
      // 24e: dup_x2
      // 24f: pop
      // 250: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 253: bipush 1
      // 254: swap
      // 255: aastore
      // 256: dup_x1
      // 257: swap
      // 258: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 25b: bipush 0
      // 25c: swap
      // 25d: aastore
      // 25e: invokevirtual rip/breeze/inject/Util140.processAll_9 ([Ljava/lang/Object;)V
      // 261: bipush 0
      // 262: istore 21
      // 264: iload 21
      // 266: aload 19
      // 268: invokeinterface java/util/List.size ()I 1
      // 26d: if_icmpge 329
      // 270: aload 19
      // 272: iload 21
      // 274: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 279: astore 22
      // 27b: aload 2
      // 27c: bipush 89
      // 27e: lload 6
      // 280: bipush 2
      // 281: anewarray 5
      // 284: dup_x2
      // 285: dup_x2
      // 286: pop
      // 287: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28a: bipush 1
      // 28b: swap
      // 28c: aastore
      // 28d: dup_x1
      // 28e: swap
      // 28f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 292: bipush 0
      // 293: swap
      // 294: aastore
      // 295: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 298: aload 2
      // 299: iload 21
      // 29b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 29e: lload 10
      // 2a0: bipush 2
      // 2a1: anewarray 5
      // 2a4: dup_x2
      // 2a5: dup_x2
      // 2a6: pop
      // 2a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2aa: bipush 1
      // 2ab: swap
      // 2ac: aastore
      // 2ad: dup_x1
      // 2ae: swap
      // 2af: bipush 0
      // 2b0: swap
      // 2b1: aastore
      // 2b2: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 2b5: aload 0
      // 2b6: aload 2
      // 2b7: aload 22
      // 2b9: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2bc: aload 22
      // 2be: lload 12
      // 2c0: bipush 4
      // 2c1: anewarray 5
      // 2c4: dup_x2
      // 2c5: dup_x2
      // 2c6: pop
      // 2c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ca: bipush 3
      // 2cb: swap
      // 2cc: aastore
      // 2cd: dup_x1
      // 2ce: swap
      // 2cf: bipush 2
      // 2d0: swap
      // 2d1: aastore
      // 2d2: dup_x1
      // 2d3: swap
      // 2d4: bipush 1
      // 2d5: swap
      // 2d6: aastore
      // 2d7: dup_x1
      // 2d8: swap
      // 2d9: bipush 0
      // 2da: swap
      // 2db: aastore
      // 2dc: invokespecial rip/breeze/classtransform/պ.method_006 ([Ljava/lang/Object;)V
      // 2df: aload 0
      // 2e0: aload 2
      // 2e1: aload 22
      // 2e3: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2e6: lload 16
      // 2e8: dup2_x1
      // 2e9: pop2
      // 2ea: bipush 3
      // 2eb: anewarray 5
      // 2ee: dup_x1
      // 2ef: swap
      // 2f0: bipush 2
      // 2f1: swap
      // 2f2: aastore
      // 2f3: dup_x2
      // 2f4: dup_x2
      // 2f5: pop
      // 2f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f9: bipush 1
      // 2fa: swap
      // 2fb: aastore
      // 2fc: dup_x1
      // 2fd: swap
      // 2fe: bipush 0
      // 2ff: swap
      // 300: aastore
      // 301: invokespecial rip/breeze/classtransform/պ.method_021 ([Ljava/lang/Object;)V
      // 304: aload 2
      // 305: bipush 83
      // 307: lload 6
      // 309: bipush 2
      // 30a: anewarray 5
      // 30d: dup_x2
      // 30e: dup_x2
      // 30f: pop
      // 310: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 313: bipush 1
      // 314: swap
      // 315: aastore
      // 316: dup_x1
      // 317: swap
      // 318: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 31b: bipush 0
      // 31c: swap
      // 31d: aastore
      // 31e: invokevirtual rip/breeze/inject/Util140.processAll_6 ([Ljava/lang/Object;)V
      // 321: iinc 21 1
      // 324: aload 18
      // 326: ifnonnull 264
      // 329: return
      // try (50 -> 55): 56 java/lang/IllegalStateException
      // try (53 -> 75): 75 java/lang/IllegalStateException
      // try (80 -> 85): 86 java/lang/IllegalStateException
      // try (83 -> 133): 133 java/lang/IllegalStateException
      // try (139 -> 144): 145 java/lang/IllegalStateException
   }

   private void invoke_21(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/Util140
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
      // 015: checkcast java/lang/Class
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic rip/breeze/classtransform/պ.encKey_a_2 J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 25158571960693
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 32911929044846
      // 02d: lxor
      // 02e: lstore 8
      // 030: pop2
      // 031: invokestatic rip/breeze/classtransform/չ.method_069 ()[Ljava/lang/String;
      // 034: astore 10
      // 036: aload 10
      // 038: ifnull 0ee
      // 03b: aload 5
      // 03d: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 040: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 043: ifne 077
      // 046: goto 04d
      // 049: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: aload 5
      // 04f: ldc_w java/lang/Boolean
      // 052: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 055: aload 10
      // 057: lload 3
      // 058: lconst_0
      // 059: lcmp
      // 05a: ifle 104
      // 05d: ifnull 102
      // 060: goto 067
      // 063: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: lload 3
      // 068: lconst_0
      // 069: lcmp
      // 06a: ifle 0fb
      // 06d: ifeq 0f3
      // 070: goto 077
      // 073: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: aload 2
      // 078: lload 8
      // 07a: sipush 184
      // 07d: getstatic rip/breeze/classtransform/ջ.CONST_Û_2 Ljava/lang/String;
      // 080: sipush 13067
      // 083: ldc2_w 6977980645872478574
      // 086: lload 3
      // 087: lxor
      // 088: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: lload 6
      // 08f: ldc_w java/lang/Boolean
      // 092: bipush 1
      // 093: anewarray 5
      // 096: dup
      // 097: bipush 0
      // 098: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 09b: aastore
      // 09c: bipush 3
      // 09d: anewarray 5
      // 0a0: dup_x1
      // 0a1: swap
      // 0a2: bipush 2
      // 0a3: swap
      // 0a4: aastore
      // 0a5: dup_x1
      // 0a6: swap
      // 0a7: bipush 1
      // 0a8: swap
      // 0a9: aastore
      // 0aa: dup_x2
      // 0ab: dup_x2
      // 0ac: pop
      // 0ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0: bipush 0
      // 0b1: swap
      // 0b2: aastore
      // 0b3: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0b6: bipush 0
      // 0b7: bipush 6
      // 0b9: anewarray 5
      // 0bc: dup_x1
      // 0bd: swap
      // 0be: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c1: bipush 5
      // 0c2: swap
      // 0c3: aastore
      // 0c4: dup_x1
      // 0c5: swap
      // 0c6: bipush 4
      // 0c7: swap
      // 0c8: aastore
      // 0c9: dup_x1
      // 0ca: swap
      // 0cb: bipush 3
      // 0cc: swap
      // 0cd: aastore
      // 0ce: dup_x1
      // 0cf: swap
      // 0d0: bipush 2
      // 0d1: swap
      // 0d2: aastore
      // 0d3: dup_x1
      // 0d4: swap
      // 0d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d8: bipush 1
      // 0d9: swap
      // 0da: aastore
      // 0db: dup_x2
      // 0dc: dup_x2
      // 0dd: pop
      // 0de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e1: bipush 0
      // 0e2: swap
      // 0e3: aastore
      // 0e4: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 0e7: goto 0ee
      // 0ea: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: aload 10
      // 0f0: ifnonnull 6d5
      // 0f3: aload 5
      // 0f5: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 0f8: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0fb: goto 102
      // 0fe: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: aload 10
      // 104: lload 3
      // 105: lconst_0
      // 106: lcmp
      // 107: ifle 128
      // 10a: ifnull 126
      // 10d: ifne 13b
      // 110: goto 117
      // 113: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: aload 5
      // 119: ldc_w java/lang/Byte
      // 11c: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 11f: goto 126
      // 122: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: aload 10
      // 128: lload 3
      // 129: lconst_0
      // 12a: lcmp
      // 12b: ifle 1c8
      // 12e: ifnull 1c6
      // 131: ifeq 1b7
      // 134: goto 13b
      // 137: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: aload 2
      // 13c: lload 8
      // 13e: sipush 184
      // 141: getstatic rip/breeze/classtransform/ջ.CONST_Ú_2 Ljava/lang/String;
      // 144: sipush 12957
      // 147: ldc2_w 4488199435908720874
      // 14a: lload 3
      // 14b: lxor
      // 14c: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: lload 6
      // 153: ldc_w java/lang/Byte
      // 156: bipush 1
      // 157: anewarray 5
      // 15a: dup
      // 15b: bipush 0
      // 15c: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 15f: aastore
      // 160: bipush 3
      // 161: anewarray 5
      // 164: dup_x1
      // 165: swap
      // 166: bipush 2
      // 167: swap
      // 168: aastore
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
      // 177: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 17a: bipush 0
      // 17b: bipush 6
      // 17d: anewarray 5
      // 180: dup_x1
      // 181: swap
      // 182: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 185: bipush 5
      // 186: swap
      // 187: aastore
      // 188: dup_x1
      // 189: swap
      // 18a: bipush 4
      // 18b: swap
      // 18c: aastore
      // 18d: dup_x1
      // 18e: swap
      // 18f: bipush 3
      // 190: swap
      // 191: aastore
      // 192: dup_x1
      // 193: swap
      // 194: bipush 2
      // 195: swap
      // 196: aastore
      // 197: dup_x1
      // 198: swap
      // 199: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19c: bipush 1
      // 19d: swap
      // 19e: aastore
      // 19f: dup_x2
      // 1a0: dup_x2
      // 1a1: pop
      // 1a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a5: bipush 0
      // 1a6: swap
      // 1a7: aastore
      // 1a8: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 1ab: aload 10
      // 1ad: ifnonnull 6d5
      // 1b0: goto 1b7
      // 1b3: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: aload 5
      // 1b9: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 1bc: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1bf: goto 1c6
      // 1c2: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c5: athrow
      // 1c6: aload 10
      // 1c8: lload 3
      // 1c9: lconst_0
      // 1ca: lcmp
      // 1cb: iflt 1ec
      // 1ce: ifnull 1ea
      // 1d1: ifne 1ff
      // 1d4: goto 1db
      // 1d7: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1da: athrow
      // 1db: aload 5
      // 1dd: ldc_w java/lang/Short
      // 1e0: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1e3: goto 1ea
      // 1e6: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e9: athrow
      // 1ea: aload 10
      // 1ec: lload 3
      // 1ed: lconst_0
      // 1ee: lcmp
      // 1ef: ifle 28c
      // 1f2: ifnull 28a
      // 1f5: ifeq 27b
      // 1f8: goto 1ff
      // 1fb: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fe: athrow
      // 1ff: aload 2
      // 200: lload 8
      // 202: sipush 184
      // 205: getstatic rip/breeze/classtransform/ջ.CONST_Ù_2 Ljava/lang/String;
      // 208: sipush 12957
      // 20b: ldc2_w 4488199435908720874
      // 20e: lload 3
      // 20f: lxor
      // 210: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: lload 6
      // 217: ldc_w java/lang/Short
      // 21a: bipush 1
      // 21b: anewarray 5
      // 21e: dup
      // 21f: bipush 0
      // 220: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 223: aastore
      // 224: bipush 3
      // 225: anewarray 5
      // 228: dup_x1
      // 229: swap
      // 22a: bipush 2
      // 22b: swap
      // 22c: aastore
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
      // 23b: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 23e: bipush 0
      // 23f: bipush 6
      // 241: anewarray 5
      // 244: dup_x1
      // 245: swap
      // 246: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 249: bipush 5
      // 24a: swap
      // 24b: aastore
      // 24c: dup_x1
      // 24d: swap
      // 24e: bipush 4
      // 24f: swap
      // 250: aastore
      // 251: dup_x1
      // 252: swap
      // 253: bipush 3
      // 254: swap
      // 255: aastore
      // 256: dup_x1
      // 257: swap
      // 258: bipush 2
      // 259: swap
      // 25a: aastore
      // 25b: dup_x1
      // 25c: swap
      // 25d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 260: bipush 1
      // 261: swap
      // 262: aastore
      // 263: dup_x2
      // 264: dup_x2
      // 265: pop
      // 266: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 269: bipush 0
      // 26a: swap
      // 26b: aastore
      // 26c: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 26f: aload 10
      // 271: ifnonnull 6d5
      // 274: goto 27b
      // 277: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27a: athrow
      // 27b: aload 5
      // 27d: getstatic java/lang/Character.TYPE Ljava/lang/Class;
      // 280: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 283: goto 28a
      // 286: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 289: athrow
      // 28a: aload 10
      // 28c: lload 3
      // 28d: lconst_0
      // 28e: lcmp
      // 28f: ifle 2b0
      // 292: ifnull 2ae
      // 295: ifne 2c3
      // 298: goto 29f
      // 29b: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29e: athrow
      // 29f: aload 5
      // 2a1: ldc_w java/lang/Character
      // 2a4: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 2a7: goto 2ae
      // 2aa: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ad: athrow
      // 2ae: aload 10
      // 2b0: lload 3
      // 2b1: lconst_0
      // 2b2: lcmp
      // 2b3: iflt 350
      // 2b6: ifnull 34e
      // 2b9: ifeq 33f
      // 2bc: goto 2c3
      // 2bf: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c2: athrow
      // 2c3: aload 2
      // 2c4: lload 8
      // 2c6: sipush 184
      // 2c9: getstatic rip/breeze/classtransform/ջ.CONST_Ø_2 Ljava/lang/String;
      // 2cc: sipush 12957
      // 2cf: ldc2_w 4488199435908720874
      // 2d2: lload 3
      // 2d3: lxor
      // 2d4: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d9: lload 6
      // 2db: ldc_w java/lang/Character
      // 2de: bipush 1
      // 2df: anewarray 5
      // 2e2: dup
      // 2e3: bipush 0
      // 2e4: getstatic java/lang/Character.TYPE Ljava/lang/Class;
      // 2e7: aastore
      // 2e8: bipush 3
      // 2e9: anewarray 5
      // 2ec: dup_x1
      // 2ed: swap
      // 2ee: bipush 2
      // 2ef: swap
      // 2f0: aastore
      // 2f1: dup_x1
      // 2f2: swap
      // 2f3: bipush 1
      // 2f4: swap
      // 2f5: aastore
      // 2f6: dup_x2
      // 2f7: dup_x2
      // 2f8: pop
      // 2f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2fc: bipush 0
      // 2fd: swap
      // 2fe: aastore
      // 2ff: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 302: bipush 0
      // 303: bipush 6
      // 305: anewarray 5
      // 308: dup_x1
      // 309: swap
      // 30a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 30d: bipush 5
      // 30e: swap
      // 30f: aastore
      // 310: dup_x1
      // 311: swap
      // 312: bipush 4
      // 313: swap
      // 314: aastore
      // 315: dup_x1
      // 316: swap
      // 317: bipush 3
      // 318: swap
      // 319: aastore
      // 31a: dup_x1
      // 31b: swap
      // 31c: bipush 2
      // 31d: swap
      // 31e: aastore
      // 31f: dup_x1
      // 320: swap
      // 321: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 324: bipush 1
      // 325: swap
      // 326: aastore
      // 327: dup_x2
      // 328: dup_x2
      // 329: pop
      // 32a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32d: bipush 0
      // 32e: swap
      // 32f: aastore
      // 330: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 333: aload 10
      // 335: ifnonnull 6d5
      // 338: goto 33f
      // 33b: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33e: athrow
      // 33f: aload 5
      // 341: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 344: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 347: goto 34e
      // 34a: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34d: athrow
      // 34e: aload 10
      // 350: lload 3
      // 351: lconst_0
      // 352: lcmp
      // 353: ifle 374
      // 356: ifnull 372
      // 359: ifne 387
      // 35c: goto 363
      // 35f: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 362: athrow
      // 363: aload 5
      // 365: ldc_w java/lang/Integer
      // 368: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 36b: goto 372
      // 36e: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 371: athrow
      // 372: aload 10
      // 374: lload 3
      // 375: lconst_0
      // 376: lcmp
      // 377: ifle 414
      // 37a: ifnull 412
      // 37d: ifeq 403
      // 380: goto 387
      // 383: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 386: athrow
      // 387: aload 2
      // 388: lload 8
      // 38a: sipush 184
      // 38d: getstatic rip/breeze/classtransform/ջ.CONST_Ö_2 Ljava/lang/String;
      // 390: sipush 12957
      // 393: ldc2_w 4488199435908720874
      // 396: lload 3
      // 397: lxor
      // 398: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39d: lload 6
      // 39f: ldc_w java/lang/Integer
      // 3a2: bipush 1
      // 3a3: anewarray 5
      // 3a6: dup
      // 3a7: bipush 0
      // 3a8: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 3ab: aastore
      // 3ac: bipush 3
      // 3ad: anewarray 5
      // 3b0: dup_x1
      // 3b1: swap
      // 3b2: bipush 2
      // 3b3: swap
      // 3b4: aastore
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
      // 3c3: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 3c6: bipush 0
      // 3c7: bipush 6
      // 3c9: anewarray 5
      // 3cc: dup_x1
      // 3cd: swap
      // 3ce: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3d1: bipush 5
      // 3d2: swap
      // 3d3: aastore
      // 3d4: dup_x1
      // 3d5: swap
      // 3d6: bipush 4
      // 3d7: swap
      // 3d8: aastore
      // 3d9: dup_x1
      // 3da: swap
      // 3db: bipush 3
      // 3dc: swap
      // 3dd: aastore
      // 3de: dup_x1
      // 3df: swap
      // 3e0: bipush 2
      // 3e1: swap
      // 3e2: aastore
      // 3e3: dup_x1
      // 3e4: swap
      // 3e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3e8: bipush 1
      // 3e9: swap
      // 3ea: aastore
      // 3eb: dup_x2
      // 3ec: dup_x2
      // 3ed: pop
      // 3ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f1: bipush 0
      // 3f2: swap
      // 3f3: aastore
      // 3f4: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 3f7: aload 10
      // 3f9: ifnonnull 6d5
      // 3fc: goto 403
      // 3ff: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 402: athrow
      // 403: aload 5
      // 405: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 408: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 40b: goto 412
      // 40e: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 411: athrow
      // 412: aload 10
      // 414: lload 3
      // 415: lconst_0
      // 416: lcmp
      // 417: iflt 437
      // 41a: ifnull 435
      // 41d: ifne 44a
      // 420: goto 427
      // 423: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 426: athrow
      // 427: aload 5
      // 429: ldc java/lang/Long
      // 42b: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 42e: goto 435
      // 431: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 434: athrow
      // 435: aload 10
      // 437: lload 3
      // 438: lconst_0
      // 439: lcmp
      // 43a: iflt 4d6
      // 43d: ifnull 4d4
      // 440: ifeq 4c5
      // 443: goto 44a
      // 446: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 449: athrow
      // 44a: aload 2
      // 44b: lload 8
      // 44d: sipush 184
      // 450: getstatic rip/breeze/classtransform/ջ.CONST_Õ_2 Ljava/lang/String;
      // 453: sipush 12957
      // 456: ldc2_w 4488199435908720874
      // 459: lload 3
      // 45a: lxor
      // 45b: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 460: lload 6
      // 462: ldc java/lang/Long
      // 464: bipush 1
      // 465: anewarray 5
      // 468: dup
      // 469: bipush 0
      // 46a: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 46d: aastore
      // 46e: bipush 3
      // 46f: anewarray 5
      // 472: dup_x1
      // 473: swap
      // 474: bipush 2
      // 475: swap
      // 476: aastore
      // 477: dup_x1
      // 478: swap
      // 479: bipush 1
      // 47a: swap
      // 47b: aastore
      // 47c: dup_x2
      // 47d: dup_x2
      // 47e: pop
      // 47f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 482: bipush 0
      // 483: swap
      // 484: aastore
      // 485: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 488: bipush 0
      // 489: bipush 6
      // 48b: anewarray 5
      // 48e: dup_x1
      // 48f: swap
      // 490: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 493: bipush 5
      // 494: swap
      // 495: aastore
      // 496: dup_x1
      // 497: swap
      // 498: bipush 4
      // 499: swap
      // 49a: aastore
      // 49b: dup_x1
      // 49c: swap
      // 49d: bipush 3
      // 49e: swap
      // 49f: aastore
      // 4a0: dup_x1
      // 4a1: swap
      // 4a2: bipush 2
      // 4a3: swap
      // 4a4: aastore
      // 4a5: dup_x1
      // 4a6: swap
      // 4a7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4aa: bipush 1
      // 4ab: swap
      // 4ac: aastore
      // 4ad: dup_x2
      // 4ae: dup_x2
      // 4af: pop
      // 4b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b3: bipush 0
      // 4b4: swap
      // 4b5: aastore
      // 4b6: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 4b9: aload 10
      // 4bb: ifnonnull 6d5
      // 4be: goto 4c5
      // 4c1: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c4: athrow
      // 4c5: aload 5
      // 4c7: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 4ca: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 4cd: goto 4d4
      // 4d0: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d3: athrow
      // 4d4: aload 10
      // 4d6: lload 3
      // 4d7: lconst_0
      // 4d8: lcmp
      // 4d9: ifle 4fa
      // 4dc: ifnull 4f8
      // 4df: ifne 50d
      // 4e2: goto 4e9
      // 4e5: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e8: athrow
      // 4e9: aload 5
      // 4eb: ldc_w java/lang/Float
      // 4ee: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 4f1: goto 4f8
      // 4f4: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f7: athrow
      // 4f8: aload 10
      // 4fa: lload 3
      // 4fb: lconst_0
      // 4fc: lcmp
      // 4fd: ifle 59a
      // 500: ifnull 598
      // 503: ifeq 589
      // 506: goto 50d
      // 509: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50c: athrow
      // 50d: aload 2
      // 50e: lload 8
      // 510: sipush 184
      // 513: getstatic rip/breeze/classtransform/ջ.CONST_Ô_2 Ljava/lang/String;
      // 516: sipush 12957
      // 519: ldc2_w 4488199435908720874
      // 51c: lload 3
      // 51d: lxor
      // 51e: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 523: lload 6
      // 525: ldc_w java/lang/Float
      // 528: bipush 1
      // 529: anewarray 5
      // 52c: dup
      // 52d: bipush 0
      // 52e: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 531: aastore
      // 532: bipush 3
      // 533: anewarray 5
      // 536: dup_x1
      // 537: swap
      // 538: bipush 2
      // 539: swap
      // 53a: aastore
      // 53b: dup_x1
      // 53c: swap
      // 53d: bipush 1
      // 53e: swap
      // 53f: aastore
      // 540: dup_x2
      // 541: dup_x2
      // 542: pop
      // 543: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 546: bipush 0
      // 547: swap
      // 548: aastore
      // 549: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 54c: bipush 0
      // 54d: bipush 6
      // 54f: anewarray 5
      // 552: dup_x1
      // 553: swap
      // 554: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 557: bipush 5
      // 558: swap
      // 559: aastore
      // 55a: dup_x1
      // 55b: swap
      // 55c: bipush 4
      // 55d: swap
      // 55e: aastore
      // 55f: dup_x1
      // 560: swap
      // 561: bipush 3
      // 562: swap
      // 563: aastore
      // 564: dup_x1
      // 565: swap
      // 566: bipush 2
      // 567: swap
      // 568: aastore
      // 569: dup_x1
      // 56a: swap
      // 56b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 56e: bipush 1
      // 56f: swap
      // 570: aastore
      // 571: dup_x2
      // 572: dup_x2
      // 573: pop
      // 574: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 577: bipush 0
      // 578: swap
      // 579: aastore
      // 57a: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 57d: aload 10
      // 57f: ifnonnull 6d5
      // 582: goto 589
      // 585: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 588: athrow
      // 589: aload 5
      // 58b: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 58e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 591: goto 598
      // 594: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 597: athrow
      // 598: aload 10
      // 59a: lload 3
      // 59b: lconst_0
      // 59c: lcmp
      // 59d: ifle 5c4
      // 5a0: ifnull 5bc
      // 5a3: ifne 5d1
      // 5a6: goto 5ad
      // 5a9: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ac: athrow
      // 5ad: aload 5
      // 5af: ldc_w java/lang/Double
      // 5b2: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 5b5: goto 5bc
      // 5b8: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5bb: athrow
      // 5bc: lload 3
      // 5bd: lconst_0
      // 5be: lcmp
      // 5bf: iflt 65c
      // 5c2: aload 10
      // 5c4: ifnull 65c
      // 5c7: ifeq 64d
      // 5ca: goto 5d1
      // 5cd: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d0: athrow
      // 5d1: aload 2
      // 5d2: lload 8
      // 5d4: sipush 184
      // 5d7: getstatic rip/breeze/classtransform/ջ.CONST_Ó_2 Ljava/lang/String;
      // 5da: sipush 12957
      // 5dd: ldc2_w 4488199435908720874
      // 5e0: lload 3
      // 5e1: lxor
      // 5e2: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e7: lload 6
      // 5e9: ldc_w java/lang/Double
      // 5ec: bipush 1
      // 5ed: anewarray 5
      // 5f0: dup
      // 5f1: bipush 0
      // 5f2: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 5f5: aastore
      // 5f6: bipush 3
      // 5f7: anewarray 5
      // 5fa: dup_x1
      // 5fb: swap
      // 5fc: bipush 2
      // 5fd: swap
      // 5fe: aastore
      // 5ff: dup_x1
      // 600: swap
      // 601: bipush 1
      // 602: swap
      // 603: aastore
      // 604: dup_x2
      // 605: dup_x2
      // 606: pop
      // 607: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 60a: bipush 0
      // 60b: swap
      // 60c: aastore
      // 60d: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 610: bipush 0
      // 611: bipush 6
      // 613: anewarray 5
      // 616: dup_x1
      // 617: swap
      // 618: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 61b: bipush 5
      // 61c: swap
      // 61d: aastore
      // 61e: dup_x1
      // 61f: swap
      // 620: bipush 4
      // 621: swap
      // 622: aastore
      // 623: dup_x1
      // 624: swap
      // 625: bipush 3
      // 626: swap
      // 627: aastore
      // 628: dup_x1
      // 629: swap
      // 62a: bipush 2
      // 62b: swap
      // 62c: aastore
      // 62d: dup_x1
      // 62e: swap
      // 62f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 632: bipush 1
      // 633: swap
      // 634: aastore
      // 635: dup_x2
      // 636: dup_x2
      // 637: pop
      // 638: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 63b: bipush 0
      // 63c: swap
      // 63d: aastore
      // 63e: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 641: aload 10
      // 643: ifnonnull 6d5
      // 646: goto 64d
      // 649: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64c: athrow
      // 64d: aload 5
      // 64f: ldc_w java/lang/String
      // 652: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 655: goto 65c
      // 658: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65b: athrow
      // 65c: ifeq 6d5
      // 65f: aload 2
      // 660: lload 8
      // 662: sipush 184
      // 665: getstatic rip/breeze/classtransform/ջ.CONST_Ý_2 Ljava/lang/String;
      // 668: sipush 12957
      // 66b: ldc2_w 4488199435908720874
      // 66e: lload 3
      // 66f: lxor
      // 670: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 675: lload 6
      // 677: ldc_w java/lang/String
      // 67a: bipush 1
      // 67b: anewarray 5
      // 67e: dup
      // 67f: bipush 0
      // 680: ldc java/lang/Object
      // 682: aastore
      // 683: bipush 3
      // 684: anewarray 5
      // 687: dup_x1
      // 688: swap
      // 689: bipush 2
      // 68a: swap
      // 68b: aastore
      // 68c: dup_x1
      // 68d: swap
      // 68e: bipush 1
      // 68f: swap
      // 690: aastore
      // 691: dup_x2
      // 692: dup_x2
      // 693: pop
      // 694: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 697: bipush 0
      // 698: swap
      // 699: aastore
      // 69a: invokestatic rip/breeze/classtransform/ջ.method_007 ([Ljava/lang/Object;)Ljava/lang/String;
      // 69d: bipush 0
      // 69e: bipush 6
      // 6a0: anewarray 5
      // 6a3: dup_x1
      // 6a4: swap
      // 6a5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6a8: bipush 5
      // 6a9: swap
      // 6aa: aastore
      // 6ab: dup_x1
      // 6ac: swap
      // 6ad: bipush 4
      // 6ae: swap
      // 6af: aastore
      // 6b0: dup_x1
      // 6b1: swap
      // 6b2: bipush 3
      // 6b3: swap
      // 6b4: aastore
      // 6b5: dup_x1
      // 6b6: swap
      // 6b7: bipush 2
      // 6b8: swap
      // 6b9: aastore
      // 6ba: dup_x1
      // 6bb: swap
      // 6bc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6bf: bipush 1
      // 6c0: swap
      // 6c1: aastore
      // 6c2: dup_x2
      // 6c3: dup_x2
      // 6c4: pop
      // 6c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c8: bipush 0
      // 6c9: swap
      // 6ca: aastore
      // 6cb: invokevirtual rip/breeze/inject/Util140.processAll_12 ([Ljava/lang/Object;)V
      // 6ce: goto 6d5
      // 6d1: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d4: athrow
      // 6d5: return
      // try (34 -> 40): 41 java/lang/IllegalStateException
      // try (36 -> 52): 53 java/lang/IllegalStateException
      // try (43 -> 60): 61 java/lang/IllegalStateException
      // try (55 -> 138): 139 java/lang/IllegalStateException
      // try (141 -> 146): 147 java/lang/IllegalStateException
      // try (149 -> 156): 157 java/lang/IllegalStateException
      // try (155 -> 162): 163 java/lang/IllegalStateException
      // try (165 -> 172): 173 java/lang/IllegalStateException
      // try (171 -> 252): 253 java/lang/IllegalStateException
      // try (175 -> 258): 259 java/lang/IllegalStateException
      // try (261 -> 268): 269 java/lang/IllegalStateException
      // try (267 -> 274): 275 java/lang/IllegalStateException
      // try (277 -> 284): 285 java/lang/IllegalStateException
      // try (283 -> 364): 365 java/lang/IllegalStateException
      // try (287 -> 370): 371 java/lang/IllegalStateException
      // try (373 -> 380): 381 java/lang/IllegalStateException
      // try (379 -> 386): 387 java/lang/IllegalStateException
      // try (389 -> 396): 397 java/lang/IllegalStateException
      // try (395 -> 476): 477 java/lang/IllegalStateException
      // try (399 -> 482): 483 java/lang/IllegalStateException
      // try (485 -> 492): 493 java/lang/IllegalStateException
      // try (491 -> 498): 499 java/lang/IllegalStateException
      // try (501 -> 508): 509 java/lang/IllegalStateException
      // try (507 -> 588): 589 java/lang/IllegalStateException
      // try (511 -> 594): 595 java/lang/IllegalStateException
      // try (597 -> 604): 605 java/lang/IllegalStateException
      // try (603 -> 610): 611 java/lang/IllegalStateException
      // try (613 -> 620): 621 java/lang/IllegalStateException
      // try (619 -> 700): 701 java/lang/IllegalStateException
      // try (623 -> 706): 707 java/lang/IllegalStateException
      // try (709 -> 716): 717 java/lang/IllegalStateException
      // try (715 -> 722): 723 java/lang/IllegalStateException
      // try (725 -> 732): 733 java/lang/IllegalStateException
      // try (731 -> 812): 813 java/lang/IllegalStateException
      // try (735 -> 818): 819 java/lang/IllegalStateException
      // try (821 -> 828): 829 java/lang/IllegalStateException
      // try (827 -> 834): 835 java/lang/IllegalStateException
      // try (837 -> 844): 845 java/lang/IllegalStateException
      // try (843 -> 924): 925 java/lang/IllegalStateException
      // try (847 -> 930): 931 java/lang/IllegalStateException
      // try (933 -> 1009): 1010 java/lang/IllegalStateException
   }

   private void invoke_22(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/Util140
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
      // 015: checkcast java/lang/Object
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic rip/breeze/classtransform/պ.encKey_a_2 J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 11256674219555
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 126197103167383
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 66502188238101
      // 034: lxor
      // 035: lstore 10
      // 037: pop2
      // 038: invokestatic rip/breeze/classtransform/չ.method_069 ()[Ljava/lang/String;
      // 03b: astore 12
      // 03d: aload 12
      // 03f: ifnull 0cf
      // 042: getstatic rip/breeze/inject/MathUtil3.CONST_Ð Lrip/breeze/inject/MathUtil3;
      // 045: aload 5
      // 047: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 04a: ifne 07e
      // 04d: goto 054
      // 050: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: getstatic java/lang/Void.TYPE Ljava/lang/Class;
      // 057: aload 5
      // 059: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 05c: aload 12
      // 05e: lload 3
      // 05f: lconst_0
      // 060: lcmp
      // 061: iflt 0e5
      // 064: ifnull 0e3
      // 067: goto 06e
      // 06a: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: lload 3
      // 06f: lconst_0
      // 070: lcmp
      // 071: iflt 0dc
      // 074: ifeq 0d4
      // 077: goto 07e
      // 07a: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: aload 2
      // 07f: sipush 178
      // 082: lload 10
      // 084: getstatic rip/breeze/classtransform/ջ.CONST_Ü_2 Ljava/lang/String;
      // 087: sipush 12631
      // 08a: ldc2_w 3211838994746025764
      // 08d: lload 3
      // 08e: lxor
      // 08f: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: sipush 13387
      // 097: ldc2_w 5387424802722521655
      // 09a: lload 3
      // 09b: lxor
      // 09c: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: bipush 5
      // 0a2: anewarray 5
      // 0a5: dup_x1
      // 0a6: swap
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
      // 0b4: dup_x2
      // 0b5: dup_x2
      // 0b6: pop
      // 0b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ba: bipush 1
      // 0bb: swap
      // 0bc: aastore
      // 0bd: dup_x1
      // 0be: swap
      // 0bf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c2: bipush 0
      // 0c3: swap
      // 0c4: aastore
      // 0c5: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 0c8: goto 0cf
      // 0cb: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: aload 12
      // 0d1: ifnonnull 682
      // 0d4: getstatic rip/breeze/inject/MathUtil3.CONST_Ï Lrip/breeze/inject/MathUtil3;
      // 0d7: aload 5
      // 0d9: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 0dc: goto 0e3
      // 0df: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: aload 12
      // 0e5: lload 3
      // 0e6: lconst_0
      // 0e7: lcmp
      // 0e8: iflt 109
      // 0eb: ifnull 107
      // 0ee: ifne 11c
      // 0f1: goto 0f8
      // 0f4: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 0fb: aload 5
      // 0fd: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 100: goto 107
      // 103: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 106: athrow
      // 107: aload 12
      // 109: lload 3
      // 10a: lconst_0
      // 10b: lcmp
      // 10c: iflt 183
      // 10f: ifnull 181
      // 112: ifeq 172
      // 115: goto 11c
      // 118: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11b: athrow
      // 11c: aload 2
      // 11d: sipush 178
      // 120: lload 10
      // 122: getstatic rip/breeze/classtransform/ջ.CONST_Û_2 Ljava/lang/String;
      // 125: sipush 13014
      // 128: ldc2_w 7298075667300263080
      // 12b: lload 3
      // 12c: lxor
      // 12d: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: sipush 5227
      // 135: ldc2_w 7016012117031649852
      // 138: lload 3
      // 139: lxor
      // 13a: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: bipush 5
      // 140: anewarray 5
      // 143: dup_x1
      // 144: swap
      // 145: bipush 4
      // 146: swap
      // 147: aastore
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 3
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: bipush 2
      // 150: swap
      // 151: aastore
      // 152: dup_x2
      // 153: dup_x2
      // 154: pop
      // 155: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 158: bipush 1
      // 159: swap
      // 15a: aastore
      // 15b: dup_x1
      // 15c: swap
      // 15d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 160: bipush 0
      // 161: swap
      // 162: aastore
      // 163: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 166: aload 12
      // 168: ifnonnull 682
      // 16b: goto 172
      // 16e: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 171: athrow
      // 172: getstatic rip/breeze/inject/MathUtil3.CONST_Í Lrip/breeze/inject/MathUtil3;
      // 175: aload 5
      // 177: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 17a: goto 181
      // 17d: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 180: athrow
      // 181: aload 12
      // 183: lload 3
      // 184: lconst_0
      // 185: lcmp
      // 186: iflt 1a7
      // 189: ifnull 1a5
      // 18c: ifne 1ba
      // 18f: goto 196
      // 192: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 195: athrow
      // 196: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 199: aload 5
      // 19b: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 19e: goto 1a5
      // 1a1: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a4: athrow
      // 1a5: aload 12
      // 1a7: lload 3
      // 1a8: lconst_0
      // 1a9: lcmp
      // 1aa: iflt 221
      // 1ad: ifnull 21f
      // 1b0: ifeq 210
      // 1b3: goto 1ba
      // 1b6: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b9: athrow
      // 1ba: aload 2
      // 1bb: sipush 178
      // 1be: lload 10
      // 1c0: getstatic rip/breeze/classtransform/ջ.CONST_Ú_2 Ljava/lang/String;
      // 1c3: sipush 13014
      // 1c6: ldc2_w 7298075667300263080
      // 1c9: lload 3
      // 1ca: lxor
      // 1cb: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: sipush 5227
      // 1d3: ldc2_w 7016012117031649852
      // 1d6: lload 3
      // 1d7: lxor
      // 1d8: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: bipush 5
      // 1de: anewarray 5
      // 1e1: dup_x1
      // 1e2: swap
      // 1e3: bipush 4
      // 1e4: swap
      // 1e5: aastore
      // 1e6: dup_x1
      // 1e7: swap
      // 1e8: bipush 3
      // 1e9: swap
      // 1ea: aastore
      // 1eb: dup_x1
      // 1ec: swap
      // 1ed: bipush 2
      // 1ee: swap
      // 1ef: aastore
      // 1f0: dup_x2
      // 1f1: dup_x2
      // 1f2: pop
      // 1f3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f6: bipush 1
      // 1f7: swap
      // 1f8: aastore
      // 1f9: dup_x1
      // 1fa: swap
      // 1fb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1fe: bipush 0
      // 1ff: swap
      // 200: aastore
      // 201: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 204: aload 12
      // 206: ifnonnull 682
      // 209: goto 210
      // 20c: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20f: athrow
      // 210: getstatic rip/breeze/inject/MathUtil3.CONST_Ì Lrip/breeze/inject/MathUtil3;
      // 213: aload 5
      // 215: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 218: goto 21f
      // 21b: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21e: athrow
      // 21f: aload 12
      // 221: lload 3
      // 222: lconst_0
      // 223: lcmp
      // 224: iflt 245
      // 227: ifnull 243
      // 22a: ifne 258
      // 22d: goto 234
      // 230: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 233: athrow
      // 234: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 237: aload 5
      // 239: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 23c: goto 243
      // 23f: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 242: athrow
      // 243: aload 12
      // 245: lload 3
      // 246: lconst_0
      // 247: lcmp
      // 248: ifle 2bf
      // 24b: ifnull 2bd
      // 24e: ifeq 2ae
      // 251: goto 258
      // 254: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 257: athrow
      // 258: aload 2
      // 259: sipush 178
      // 25c: lload 10
      // 25e: getstatic rip/breeze/classtransform/ջ.CONST_Ù_2 Ljava/lang/String;
      // 261: sipush 13014
      // 264: ldc2_w 7298075667300263080
      // 267: lload 3
      // 268: lxor
      // 269: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26e: sipush 5227
      // 271: ldc2_w 7016012117031649852
      // 274: lload 3
      // 275: lxor
      // 276: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: bipush 5
      // 27c: anewarray 5
      // 27f: dup_x1
      // 280: swap
      // 281: bipush 4
      // 282: swap
      // 283: aastore
      // 284: dup_x1
      // 285: swap
      // 286: bipush 3
      // 287: swap
      // 288: aastore
      // 289: dup_x1
      // 28a: swap
      // 28b: bipush 2
      // 28c: swap
      // 28d: aastore
      // 28e: dup_x2
      // 28f: dup_x2
      // 290: pop
      // 291: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 294: bipush 1
      // 295: swap
      // 296: aastore
      // 297: dup_x1
      // 298: swap
      // 299: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 29c: bipush 0
      // 29d: swap
      // 29e: aastore
      // 29f: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 2a2: aload 12
      // 2a4: ifnonnull 682
      // 2a7: goto 2ae
      // 2aa: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ad: athrow
      // 2ae: getstatic rip/breeze/inject/MathUtil3.CONST_Î Lrip/breeze/inject/MathUtil3;
      // 2b1: aload 5
      // 2b3: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 2b6: goto 2bd
      // 2b9: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bc: athrow
      // 2bd: aload 12
      // 2bf: lload 3
      // 2c0: lconst_0
      // 2c1: lcmp
      // 2c2: iflt 2e3
      // 2c5: ifnull 2e1
      // 2c8: ifne 2f6
      // 2cb: goto 2d2
      // 2ce: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d1: athrow
      // 2d2: getstatic java/lang/Character.TYPE Ljava/lang/Class;
      // 2d5: aload 5
      // 2d7: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 2da: goto 2e1
      // 2dd: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e0: athrow
      // 2e1: aload 12
      // 2e3: lload 3
      // 2e4: lconst_0
      // 2e5: lcmp
      // 2e6: iflt 35d
      // 2e9: ifnull 35b
      // 2ec: ifeq 34c
      // 2ef: goto 2f6
      // 2f2: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f5: athrow
      // 2f6: aload 2
      // 2f7: sipush 178
      // 2fa: lload 10
      // 2fc: getstatic rip/breeze/classtransform/ջ.CONST_Ø_2 Ljava/lang/String;
      // 2ff: sipush 13014
      // 302: ldc2_w 7298075667300263080
      // 305: lload 3
      // 306: lxor
      // 307: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30c: sipush 5227
      // 30f: ldc2_w 7016012117031649852
      // 312: lload 3
      // 313: lxor
      // 314: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 319: bipush 5
      // 31a: anewarray 5
      // 31d: dup_x1
      // 31e: swap
      // 31f: bipush 4
      // 320: swap
      // 321: aastore
      // 322: dup_x1
      // 323: swap
      // 324: bipush 3
      // 325: swap
      // 326: aastore
      // 327: dup_x1
      // 328: swap
      // 329: bipush 2
      // 32a: swap
      // 32b: aastore
      // 32c: dup_x2
      // 32d: dup_x2
      // 32e: pop
      // 32f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 332: bipush 1
      // 333: swap
      // 334: aastore
      // 335: dup_x1
      // 336: swap
      // 337: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 33a: bipush 0
      // 33b: swap
      // 33c: aastore
      // 33d: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 340: aload 12
      // 342: ifnonnull 682
      // 345: goto 34c
      // 348: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34b: athrow
      // 34c: getstatic rip/breeze/inject/MathUtil3.CONST_Ë Lrip/breeze/inject/MathUtil3;
      // 34f: aload 5
      // 351: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 354: goto 35b
      // 357: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35a: athrow
      // 35b: aload 12
      // 35d: lload 3
      // 35e: lconst_0
      // 35f: lcmp
      // 360: ifle 381
      // 363: ifnull 37f
      // 366: ifne 394
      // 369: goto 370
      // 36c: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36f: athrow
      // 370: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 373: aload 5
      // 375: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 378: goto 37f
      // 37b: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37e: athrow
      // 37f: aload 12
      // 381: lload 3
      // 382: lconst_0
      // 383: lcmp
      // 384: ifle 3fb
      // 387: ifnull 3f9
      // 38a: ifeq 3ea
      // 38d: goto 394
      // 390: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 393: athrow
      // 394: aload 2
      // 395: sipush 178
      // 398: lload 10
      // 39a: getstatic rip/breeze/classtransform/ջ.CONST_Ö_2 Ljava/lang/String;
      // 39d: sipush 13014
      // 3a0: ldc2_w 7298075667300263080
      // 3a3: lload 3
      // 3a4: lxor
      // 3a5: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3aa: sipush 5227
      // 3ad: ldc2_w 7016012117031649852
      // 3b0: lload 3
      // 3b1: lxor
      // 3b2: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b7: bipush 5
      // 3b8: anewarray 5
      // 3bb: dup_x1
      // 3bc: swap
      // 3bd: bipush 4
      // 3be: swap
      // 3bf: aastore
      // 3c0: dup_x1
      // 3c1: swap
      // 3c2: bipush 3
      // 3c3: swap
      // 3c4: aastore
      // 3c5: dup_x1
      // 3c6: swap
      // 3c7: bipush 2
      // 3c8: swap
      // 3c9: aastore
      // 3ca: dup_x2
      // 3cb: dup_x2
      // 3cc: pop
      // 3cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3d0: bipush 1
      // 3d1: swap
      // 3d2: aastore
      // 3d3: dup_x1
      // 3d4: swap
      // 3d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3d8: bipush 0
      // 3d9: swap
      // 3da: aastore
      // 3db: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 3de: aload 12
      // 3e0: ifnonnull 682
      // 3e3: goto 3ea
      // 3e6: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e9: athrow
      // 3ea: getstatic rip/breeze/inject/MathUtil3.CONST_É Lrip/breeze/inject/MathUtil3;
      // 3ed: aload 5
      // 3ef: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 3f2: goto 3f9
      // 3f5: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f8: athrow
      // 3f9: aload 12
      // 3fb: lload 3
      // 3fc: lconst_0
      // 3fd: lcmp
      // 3fe: ifle 41f
      // 401: ifnull 41d
      // 404: ifne 432
      // 407: goto 40e
      // 40a: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40d: athrow
      // 40e: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 411: aload 5
      // 413: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 416: goto 41d
      // 419: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41c: athrow
      // 41d: aload 12
      // 41f: lload 3
      // 420: lconst_0
      // 421: lcmp
      // 422: iflt 499
      // 425: ifnull 497
      // 428: ifeq 488
      // 42b: goto 432
      // 42e: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 431: athrow
      // 432: aload 2
      // 433: sipush 178
      // 436: lload 10
      // 438: getstatic rip/breeze/classtransform/ջ.CONST_Õ_2 Ljava/lang/String;
      // 43b: sipush 13014
      // 43e: ldc2_w 7298075667300263080
      // 441: lload 3
      // 442: lxor
      // 443: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 448: sipush 5227
      // 44b: ldc2_w 7016012117031649852
      // 44e: lload 3
      // 44f: lxor
      // 450: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 455: bipush 5
      // 456: anewarray 5
      // 459: dup_x1
      // 45a: swap
      // 45b: bipush 4
      // 45c: swap
      // 45d: aastore
      // 45e: dup_x1
      // 45f: swap
      // 460: bipush 3
      // 461: swap
      // 462: aastore
      // 463: dup_x1
      // 464: swap
      // 465: bipush 2
      // 466: swap
      // 467: aastore
      // 468: dup_x2
      // 469: dup_x2
      // 46a: pop
      // 46b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 46e: bipush 1
      // 46f: swap
      // 470: aastore
      // 471: dup_x1
      // 472: swap
      // 473: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 476: bipush 0
      // 477: swap
      // 478: aastore
      // 479: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 47c: aload 12
      // 47e: ifnonnull 682
      // 481: goto 488
      // 484: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 487: athrow
      // 488: getstatic rip/breeze/inject/MathUtil3.CONST_Ê Lrip/breeze/inject/MathUtil3;
      // 48b: aload 5
      // 48d: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 490: goto 497
      // 493: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 496: athrow
      // 497: aload 12
      // 499: lload 3
      // 49a: lconst_0
      // 49b: lcmp
      // 49c: iflt 4bd
      // 49f: ifnull 4bb
      // 4a2: ifne 4d0
      // 4a5: goto 4ac
      // 4a8: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ab: athrow
      // 4ac: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 4af: aload 5
      // 4b1: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 4b4: goto 4bb
      // 4b7: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ba: athrow
      // 4bb: aload 12
      // 4bd: lload 3
      // 4be: lconst_0
      // 4bf: lcmp
      // 4c0: ifle 537
      // 4c3: ifnull 535
      // 4c6: ifeq 526
      // 4c9: goto 4d0
      // 4cc: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4cf: athrow
      // 4d0: aload 2
      // 4d1: sipush 178
      // 4d4: lload 10
      // 4d6: getstatic rip/breeze/classtransform/ջ.CONST_Ô_2 Ljava/lang/String;
      // 4d9: sipush 13014
      // 4dc: ldc2_w 7298075667300263080
      // 4df: lload 3
      // 4e0: lxor
      // 4e1: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e6: sipush 5227
      // 4e9: ldc2_w 7016012117031649852
      // 4ec: lload 3
      // 4ed: lxor
      // 4ee: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f3: bipush 5
      // 4f4: anewarray 5
      // 4f7: dup_x1
      // 4f8: swap
      // 4f9: bipush 4
      // 4fa: swap
      // 4fb: aastore
      // 4fc: dup_x1
      // 4fd: swap
      // 4fe: bipush 3
      // 4ff: swap
      // 500: aastore
      // 501: dup_x1
      // 502: swap
      // 503: bipush 2
      // 504: swap
      // 505: aastore
      // 506: dup_x2
      // 507: dup_x2
      // 508: pop
      // 509: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 50c: bipush 1
      // 50d: swap
      // 50e: aastore
      // 50f: dup_x1
      // 510: swap
      // 511: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 514: bipush 0
      // 515: swap
      // 516: aastore
      // 517: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 51a: aload 12
      // 51c: ifnonnull 682
      // 51f: goto 526
      // 522: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 525: athrow
      // 526: getstatic rip/breeze/inject/MathUtil3.CONST_È Lrip/breeze/inject/MathUtil3;
      // 529: aload 5
      // 52b: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 52e: goto 535
      // 531: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 534: athrow
      // 535: aload 12
      // 537: lload 3
      // 538: lconst_0
      // 539: lcmp
      // 53a: ifle 55b
      // 53d: ifnull 559
      // 540: ifne 56e
      // 543: goto 54a
      // 546: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 549: athrow
      // 54a: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 54d: aload 5
      // 54f: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 552: goto 559
      // 555: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 558: athrow
      // 559: aload 12
      // 55b: lload 3
      // 55c: lconst_0
      // 55d: lcmp
      // 55e: iflt 5d8
      // 561: ifnull 5d0
      // 564: ifeq 5c4
      // 567: goto 56e
      // 56a: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56d: athrow
      // 56e: aload 2
      // 56f: sipush 178
      // 572: lload 10
      // 574: getstatic rip/breeze/classtransform/ջ.CONST_Ó_2 Ljava/lang/String;
      // 577: sipush 13014
      // 57a: ldc2_w 7298075667300263080
      // 57d: lload 3
      // 57e: lxor
      // 57f: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 584: sipush 5227
      // 587: ldc2_w 7016012117031649852
      // 58a: lload 3
      // 58b: lxor
      // 58c: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 591: bipush 5
      // 592: anewarray 5
      // 595: dup_x1
      // 596: swap
      // 597: bipush 4
      // 598: swap
      // 599: aastore
      // 59a: dup_x1
      // 59b: swap
      // 59c: bipush 3
      // 59d: swap
      // 59e: aastore
      // 59f: dup_x1
      // 5a0: swap
      // 5a1: bipush 2
      // 5a2: swap
      // 5a3: aastore
      // 5a4: dup_x2
      // 5a5: dup_x2
      // 5a6: pop
      // 5a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5aa: bipush 1
      // 5ab: swap
      // 5ac: aastore
      // 5ad: dup_x1
      // 5ae: swap
      // 5af: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5b2: bipush 0
      // 5b3: swap
      // 5b4: aastore
      // 5b5: invokevirtual rip/breeze/inject/Util140.processAll_10 ([Ljava/lang/Object;)V
      // 5b8: aload 12
      // 5ba: ifnonnull 682
      // 5bd: goto 5c4
      // 5c0: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c3: athrow
      // 5c4: aload 5
      // 5c6: instanceof java/lang/Class
      // 5c9: goto 5d0
      // 5cc: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5cf: athrow
      // 5d0: lload 3
      // 5d1: lconst_0
      // 5d2: lcmp
      // 5d3: iflt 62e
      // 5d6: aload 12
      // 5d8: ifnull 62e
      // 5db: ifeq 622
      // 5de: goto 5e5
      // 5e1: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e4: athrow
      // 5e5: aload 2
      // 5e6: lload 8
      // 5e8: aload 5
      // 5ea: bipush 2
      // 5eb: anewarray 5
      // 5ee: dup_x1
      // 5ef: swap
      // 5f0: bipush 1
      // 5f1: swap
      // 5f2: aastore
      // 5f3: dup_x2
      // 5f4: dup_x2
      // 5f5: pop
      // 5f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f9: bipush 0
      // 5fa: swap
      // 5fb: aastore
      // 5fc: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 5ff: lload 6
      // 601: bipush 2
      // 602: anewarray 5
      // 605: dup_x2
      // 606: dup_x2
      // 607: pop
      // 608: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 60b: bipush 1
      // 60c: swap
      // 60d: aastore
      // 60e: dup_x1
      // 60f: swap
      // 610: bipush 0
      // 611: swap
      // 612: aastore
      // 613: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 616: aload 12
      // 618: ifnonnull 682
      // 61b: goto 622
      // 61e: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 621: athrow
      // 622: aload 5
      // 624: instanceof rip/breeze/inject/MathUtil3
      // 627: goto 62e
      // 62a: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62d: athrow
      // 62e: ifeq 657
      // 631: aload 2
      // 632: aload 5
      // 634: lload 6
      // 636: bipush 2
      // 637: anewarray 5
      // 63a: dup_x2
      // 63b: dup_x2
      // 63c: pop
      // 63d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 640: bipush 1
      // 641: swap
      // 642: aastore
      // 643: dup_x1
      // 644: swap
      // 645: bipush 0
      // 646: swap
      // 647: aastore
      // 648: invokevirtual rip/breeze/inject/Util140.processAll_16 ([Ljava/lang/Object;)V
      // 64b: aload 12
      // 64d: ifnonnull 682
      // 650: goto 657
      // 653: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 656: athrow
      // 657: new java/lang/IllegalArgumentException
      // 65a: dup
      // 65b: new java/lang/StringBuilder
      // 65e: dup
      // 65f: invokespecial java/lang/StringBuilder.<init> ()V
      // 662: sipush 4633
      // 665: ldc2_w 8769425235875103846
      // 668: lload 3
      // 669: lxor
      // 66a: invokedynamic y (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/պ.method_027 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 672: aload 5
      // 674: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 677: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 67a: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 67d: athrow
      // 67e: invokestatic rip/breeze/classtransform/պ.method_023 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 681: athrow
      // 682: return
      // try (38 -> 44): 45 java/lang/IllegalStateException
      // try (40 -> 56): 57 java/lang/IllegalStateException
      // try (47 -> 64): 65 java/lang/IllegalStateException
      // try (59 -> 112): 113 java/lang/IllegalStateException
      // try (115 -> 120): 121 java/lang/IllegalStateException
      // try (123 -> 130): 131 java/lang/IllegalStateException
      // try (129 -> 136): 137 java/lang/IllegalStateException
      // try (139 -> 146): 147 java/lang/IllegalStateException
      // try (145 -> 196): 197 java/lang/IllegalStateException
      // try (149 -> 202): 203 java/lang/IllegalStateException
      // try (205 -> 212): 213 java/lang/IllegalStateException
      // try (211 -> 218): 219 java/lang/IllegalStateException
      // try (221 -> 228): 229 java/lang/IllegalStateException
      // try (227 -> 278): 279 java/lang/IllegalStateException
      // try (231 -> 284): 285 java/lang/IllegalStateException
      // try (287 -> 294): 295 java/lang/IllegalStateException
      // try (293 -> 300): 301 java/lang/IllegalStateException
      // try (303 -> 310): 311 java/lang/IllegalStateException
      // try (309 -> 360): 361 java/lang/IllegalStateException
      // try (313 -> 366): 367 java/lang/IllegalStateException
      // try (369 -> 376): 377 java/lang/IllegalStateException
      // try (375 -> 382): 383 java/lang/IllegalStateException
      // try (385 -> 392): 393 java/lang/IllegalStateException
      // try (391 -> 442): 443 java/lang/IllegalStateException
      // try (395 -> 448): 449 java/lang/IllegalStateException
      // try (451 -> 458): 459 java/lang/IllegalStateException
      // try (457 -> 464): 465 java/lang/IllegalStateException
      // try (467 -> 474): 475 java/lang/IllegalStateException
      // try (473 -> 524): 525 java/lang/IllegalStateException
      // try (477 -> 530): 531 java/lang/IllegalStateException
      // try (533 -> 540): 541 java/lang/IllegalStateException
      // try (539 -> 546): 547 java/lang/IllegalStateException
      // try (549 -> 556): 557 java/lang/IllegalStateException
      // try (555 -> 606): 607 java/lang/IllegalStateException
      // try (559 -> 612): 613 java/lang/IllegalStateException
      // try (615 -> 622): 623 java/lang/IllegalStateException
      // try (621 -> 628): 629 java/lang/IllegalStateException
      // try (631 -> 638): 639 java/lang/IllegalStateException
      // try (637 -> 688): 689 java/lang/IllegalStateException
      // try (641 -> 694): 695 java/lang/IllegalStateException
      // try (697 -> 704): 705 java/lang/IllegalStateException
      // try (703 -> 710): 711 java/lang/IllegalStateException
      // try (713 -> 720): 721 java/lang/IllegalStateException
      // try (719 -> 770): 771 java/lang/IllegalStateException
      // try (723 -> 775): 776 java/lang/IllegalStateException
      // try (778 -> 785): 786 java/lang/IllegalStateException
      // try (784 -> 824): 825 java/lang/IllegalStateException
      // try (788 -> 829): 830 java/lang/IllegalStateException
      // try (832 -> 853): 854 java/lang/IllegalStateException
      // try (833 -> 872): 872 java/lang/IllegalStateException
   }

   static {
      long var0 = 123778635865758L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[37];
      int var5 = 0;
      String var6 = "\u00ad\u0001ài\u0095Á\u0093\"²{\u0098]Ð©\u008añ\u0018rÒ4Å\u0018¿¼\u00947ü\u0091Ãß\u000e!9Sf×teg§\u0000 *]kÕ\u007f\u0004\u0092\u0083 %k!Í\u0085é\u0002`Á£)×ö\u0016:ÌÝ§âçhï7\u0010\u0090ÃUfýÆ±\u0010Ãò2nõNo@\u0010Åi_p\u008dDôâ\u009d\n\u008côøìIÄ\u0010\u0085ÌÎ³\tqïìl´xW\u0087u£Þ\u0010!\u001d\u000f\u008e?ä9g°\u009eÍ´èÆC\u0006P\u009aH2\u000fÜñ³&\u001ax\u008b6´ îá\u0019\u008d¨\u009cË\u0013%ÃÒú\u0015sÌ(÷!É\u009b±©SñoN\u0087Î±;\u0083ó7ª}³\u009d\u0091yìôã\u009d\u000ekê\nÇUrÄ\u0094\u0091\u0004\u008f\u0084Èñ`\u000bÏÒ¹õ\b\u00100ªCW%\fÜ¶\u000e;¹pÀ\u0098\u0006Öfv\u009fU \u0011\u0096\u0011!\u0088%ÈÔPÚþ\u0088#m\u0095\u0015îïbòÀb\u0017yLóVàP\f\f\u0088.îf?\u0087ØÏá Ì\u0092D\u0015Ó\u0005YÔ\u0013a[\u0019p\u00177e-D:Ó\u000b¯Ñîy\u009dË\u007fd\u0092\u001d\u0000,p|Â¥\n\u001f\u0018\u0005%c²yÆ>¸\u007f>½n¹<ê\u0095®'\r\u008ag-\u009c½/ÎpÞ\u0010¿Ãµ½å\u009b\u008dÛU\u0087\u008f\u0091\u0014Ðñ\u0014\u0018®É¦Ø\u0001L\nKÐTzæ²]Î¢3RG¡\u0097Ù\u0010S0S\u001cÜ:«ª'jP\u0001\u0081\u0012Û\u009eû\f§X)2$\u0018\u00178T\u001bùZ\u00adÙPl5·Zªó±åíÝqÜð}\u0087æÅ\u0010]\u008fiMÊÜ;åè\u000f\u0096ÛÍa\u0019¬\u0010ß§cÖ\u007fÎ\u0096ð¢G¿\u0016\u001eH¶\u0099(!M}ë\u008fââ/¼úO($4ÑzSª>\rü\u0095Õ2ôÁ~ò,\r,\u008cÀ\u0084¼²\u0080[\u009bÊ(¢¶ñ\u0085¸/ùÂ\u0011lT\u0093\u0094u\u0000ëïãÛ\u009dÌg\u0012Åtm uSdm sm5\u008eK¬{ÏPßí_Õ¬\n\u009bM\u0092ï \u0002R[\u0000Ý>U:\u0083MæÆ\u0016,9_×úvR¥Ì¢K©\u0084Ê¤P7\u0083£¸.\u0086\u0002®®\u0086Xë\u0098\u008aûö\u0082`êÇãÛø[\u00ad¿ß*Ý\u0098í;¯\u000e\u0005\u0016Äôf¼(:\u0006\u008f '¶ä>\u0098¡5é\u0099'\u000e³\u0019\u0011_,¾²¨\u0093À²CÛEsÂ×[>\rè\u008fR·:8ÉK<\u0012\u0000øù¯;¦8$\\LÁ\u0082\u008b÷\u0013\t\u0016rT§Þ!n\u0091oY·¹2¡²,¢\nìc\f\t \b\"Ï\u0017S\u0095l?×ó¿áÑ \u000bá\u009fS&é<UÏ>æsoÃÓ|j¨?ÀGû\u00ad$r\u0094\u008d m3\u0095Ò\u0010\u0007äD£ïÎì\u0013\u009f\u0099\u0082\u0016I[,c\u0010\u007fWä\u0003Oy6Ic\u0097´<]l&N\u0010Oà\u0094\u0085´iTË¡S\u001cJàÁ+¢\u0010\u008bÕÁàáÄH\u0004ðG\u0005L®\u0001M\tX~æÆ¼4´K\u008c\u0084\u008bö.Í:6ã&\u00199Å\u0093d('4\u008d¦M~où¡\u0004Ò#\u008b\u001daÁ\u001e\u008c\u0016tÑù\u009am÷Ýz¦È¼c\u0013}Z\u0089;L\u0017\u008cQ\u000eÈv<&`S\u001f¨ÍmZÑRUEÝXÂ¦\u009f\u0092³ëë\u0010yE\u008b:Ef¸h9±hûÈ&T÷ \u0096ú\u0019òÅÂ\u0012,[Y8\u0005K°LÀ\u0005üx$.\u001c\u009c\r\\U÷@òÈ\u008d°\u0010Ï\u0080Ü» 4\u0099uá\u0082´\u0096ÔþSC\u0018M¨NbQ\u0083û\u0014\u0016\tQ§\b¯\u009cö\u0004à\u008b_ \u0018vº(\bpªãR}!\u000e¥\u000eYFÍÚdàoï\u0088¦cÇ\u001e\u001f\nÅ\u0097\u0091\u0088;ÞB}ÒR?\u0086ûõA@û\\\u0095XzÍê\u008c¤\u008as=S\u0015§²p;\u0002](¾\u0012cØÚ\u009a0¿½ÖçñKJÞAøÍ\u0019\u0003\\)\u0084ûêHãL\rì/\u0080\u008a\u00894¶lhPÝ\u009bgß(Ï&\u0091gÌ\u0082}\u0081Ì^¹¨_áµ\u008cÇ\u0087\u001aØR\u0004e\u0000\u0012õèoDªY\u000e[çÚ\u000b.\u0010Ê@ 0\u0017å@\u0010+³(©S`èu¨qJE\u0085:<Öé#ýÉÑ×\u0083ÖÍ¾Â\u0018fr6¯ña¿0\u0084\\Êë+\u0088øMKê[xè>\u0094o";
      int var7 = "\u00ad\u0001ài\u0095Á\u0093\"²{\u0098]Ð©\u008añ\u0018rÒ4Å\u0018¿¼\u00947ü\u0091Ãß\u000e!9Sf×teg§\u0000 *]kÕ\u007f\u0004\u0092\u0083 %k!Í\u0085é\u0002`Á£)×ö\u0016:ÌÝ§âçhï7\u0010\u0090ÃUfýÆ±\u0010Ãò2nõNo@\u0010Åi_p\u008dDôâ\u009d\n\u008côøìIÄ\u0010\u0085ÌÎ³\tqïìl´xW\u0087u£Þ\u0010!\u001d\u000f\u008e?ä9g°\u009eÍ´èÆC\u0006P\u009aH2\u000fÜñ³&\u001ax\u008b6´ îá\u0019\u008d¨\u009cË\u0013%ÃÒú\u0015sÌ(÷!É\u009b±©SñoN\u0087Î±;\u0083ó7ª}³\u009d\u0091yìôã\u009d\u000ekê\nÇUrÄ\u0094\u0091\u0004\u008f\u0084Èñ`\u000bÏÒ¹õ\b\u00100ªCW%\fÜ¶\u000e;¹pÀ\u0098\u0006Öfv\u009fU \u0011\u0096\u0011!\u0088%ÈÔPÚþ\u0088#m\u0095\u0015îïbòÀb\u0017yLóVàP\f\f\u0088.îf?\u0087ØÏá Ì\u0092D\u0015Ó\u0005YÔ\u0013a[\u0019p\u00177e-D:Ó\u000b¯Ñîy\u009dË\u007fd\u0092\u001d\u0000,p|Â¥\n\u001f\u0018\u0005%c²yÆ>¸\u007f>½n¹<ê\u0095®'\r\u008ag-\u009c½/ÎpÞ\u0010¿Ãµ½å\u009b\u008dÛU\u0087\u008f\u0091\u0014Ðñ\u0014\u0018®É¦Ø\u0001L\nKÐTzæ²]Î¢3RG¡\u0097Ù\u0010S0S\u001cÜ:«ª'jP\u0001\u0081\u0012Û\u009eû\f§X)2$\u0018\u00178T\u001bùZ\u00adÙPl5·Zªó±åíÝqÜð}\u0087æÅ\u0010]\u008fiMÊÜ;åè\u000f\u0096ÛÍa\u0019¬\u0010ß§cÖ\u007fÎ\u0096ð¢G¿\u0016\u001eH¶\u0099(!M}ë\u008fââ/¼úO($4ÑzSª>\rü\u0095Õ2ôÁ~ò,\r,\u008cÀ\u0084¼²\u0080[\u009bÊ(¢¶ñ\u0085¸/ùÂ\u0011lT\u0093\u0094u\u0000ëïãÛ\u009dÌg\u0012Åtm uSdm sm5\u008eK¬{ÏPßí_Õ¬\n\u009bM\u0092ï \u0002R[\u0000Ý>U:\u0083MæÆ\u0016,9_×úvR¥Ì¢K©\u0084Ê¤P7\u0083£¸.\u0086\u0002®®\u0086Xë\u0098\u008aûö\u0082`êÇãÛø[\u00ad¿ß*Ý\u0098í;¯\u000e\u0005\u0016Äôf¼(:\u0006\u008f '¶ä>\u0098¡5é\u0099'\u000e³\u0019\u0011_,¾²¨\u0093À²CÛEsÂ×[>\rè\u008fR·:8ÉK<\u0012\u0000øù¯;¦8$\\LÁ\u0082\u008b÷\u0013\t\u0016rT§Þ!n\u0091oY·¹2¡²,¢\nìc\f\t \b\"Ï\u0017S\u0095l?×ó¿áÑ \u000bá\u009fS&é<UÏ>æsoÃÓ|j¨?ÀGû\u00ad$r\u0094\u008d m3\u0095Ò\u0010\u0007äD£ïÎì\u0013\u009f\u0099\u0082\u0016I[,c\u0010\u007fWä\u0003Oy6Ic\u0097´<]l&N\u0010Oà\u0094\u0085´iTË¡S\u001cJàÁ+¢\u0010\u008bÕÁàáÄH\u0004ðG\u0005L®\u0001M\tX~æÆ¼4´K\u008c\u0084\u008bö.Í:6ã&\u00199Å\u0093d('4\u008d¦M~où¡\u0004Ò#\u008b\u001daÁ\u001e\u008c\u0016tÑù\u009am÷Ýz¦È¼c\u0013}Z\u0089;L\u0017\u008cQ\u000eÈv<&`S\u001f¨ÍmZÑRUEÝXÂ¦\u009f\u0092³ëë\u0010yE\u008b:Ef¸h9±hûÈ&T÷ \u0096ú\u0019òÅÂ\u0012,[Y8\u0005K°LÀ\u0005üx$.\u001c\u009c\r\\U÷@òÈ\u008d°\u0010Ï\u0080Ü» 4\u0099uá\u0082´\u0096ÔþSC\u0018M¨NbQ\u0083û\u0014\u0016\tQ§\b¯\u009cö\u0004à\u008b_ \u0018vº(\bpªãR}!\u000e¥\u000eYFÍÚdàoï\u0088¦cÇ\u001e\u001f\nÅ\u0097\u0091\u0088;ÞB}ÒR?\u0086ûõA@û\\\u0095XzÍê\u008c¤\u008as=S\u0015§²p;\u0002](¾\u0012cØÚ\u009a0¿½ÖçñKJÞAøÍ\u0019\u0003\\)\u0084ûêHãL\rì/\u0080\u008a\u00894¶lhPÝ\u009bgß(Ï&\u0091gÌ\u0082}\u0081Ì^¹¨_áµ\u008cÇ\u0087\u001aØR\u0004e\u0000\u0012õèoDªY\u000e[çÚ\u000b.\u0010Ê@ 0\u0017å@\u0010+³(©S`èu¨qJE\u0085:<Öé#ýÉÑ×\u0083ÖÍ¾Â\u0018fr6¯ña¿0\u0084\\Êë+\u0088øMKê[xè>\u0094o"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = method_024(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_B_2 = var4;
                     CONST_C_2 = new String[37];
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

                  var6 = "í\u009e\u009dº¤Õ_¬\u008b\u0004ÃüEë$ðôàm\u0096\u0012ñ]_\u0006ÿ\nôVsþw»)U\"H£\u0013\u0083$re)[Qº\tÂ¦Ýàr\u0080_}~e°YµLN-y\\\u0093~âÊU£(a-\u0004ÓÊ:=\u0014æ\u0097K \u0005I¦}Ù\u0089¢ËÉGÍ`¹Î\u0098¥\u007f\u009bI\b:¸O\u000bC¨`n";
                  var7 = "í\u009e\u009dº¤Õ_¬\u008b\u0004ÃüEë$ðôàm\u0096\u0012ñ]_\u0006ÿ\nôVsþw»)U\"H£\u0013\u0083$re)[Qº\tÂ¦Ýàr\u0080_}~e°YµLN-y\\\u0093~âÊU£(a-\u0004ÓÊ:=\u0014æ\u0097K \u0005I¦}Ù\u0089¢ËÉGÍ`¹Î\u0098¥\u007f\u009bI\b:¸O\u000bC¨`n"
                     .length();
                  var8 = 'H';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static Throwable invoke_23(Throwable var0) {
      return var0;
   }

   private static String invoke_24(byte[] var0) {
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

   private static String invoke_25(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3047;
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
            throw new RuntimeException("rip/breeze/classtransform/պ", var10);
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
         CONST_C_2[var3] = method_024(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }

   private static Object call_26(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = method_025(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite invoke_27(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("method_026".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/պ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
