package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

public class ժ {
   private final Map<String, ը> map_ÿ_2 = new HashMap<>();
   private final ó ó_þ_2;
   private static String[] arr_ý_2;

   public ժ() {
      this(null);
   }

   public ժ(ó var1) {
      this.ó_þ_2 = var1;
   }

   public boolean check_1(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_a_2 ^ var2;
      return this.ó_þ_2 != null;
   }

   public synchronized ը invoke_2(Object[] param1) throws ClassNotFoundException {
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
      // 00e: checkcast rip/breeze/classtransform/է
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic rip/breeze/classtransform/ժ.encKey_a_2 J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 41195745173296
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 14409960163481
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 133475668562854
      // 035: lxor
      // 036: lstore 10
      // 038: dup2
      // 039: ldc2_w 114974781305189
      // 03c: lxor
      // 03d: lstore 12
      // 03f: dup2
      // 040: ldc2_w 59895242866235
      // 043: lxor
      // 044: lstore 14
      // 046: pop2
      // 047: invokestatic rip/breeze/classtransform/ժ.method_004 ()[Ljava/lang/String;
      // 04a: aload 5
      // 04c: bipush 1
      // 04d: anewarray 4
      // 050: dup_x1
      // 051: swap
      // 052: bipush 0
      // 053: swap
      // 054: aastore
      // 055: invokestatic rip/breeze/classtransform/MathUtil3.buildString ([Ljava/lang/Object;)Ljava/lang/String;
      // 058: astore 5
      // 05a: astore 16
      // 05c: aload 0
      // 05d: getfield rip/breeze/classtransform/ժ.map_ÿ_2 Ljava/util/Map;
      // 060: aload 5
      // 062: aload 16
      // 064: ifnull 083
      // 067: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 06c: ifeq 08c
      // 06f: goto 076
      // 072: invokestatic rip/breeze/classtransform/ժ.method_005 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 075: athrow
      // 076: aload 0
      // 077: getfield rip/breeze/classtransform/ժ.map_ÿ_2 Ljava/util/Map;
      // 07a: aload 5
      // 07c: goto 083
      // 07f: invokestatic rip/breeze/classtransform/ժ.method_005 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 082: athrow
      // 083: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 088: checkcast rip/breeze/classtransform/ը
      // 08b: areturn
      // 08c: aload 4
      // 08e: lload 6
      // 090: aload 5
      // 092: bipush 2
      // 093: anewarray 4
      // 096: dup_x1
      // 097: swap
      // 098: bipush 1
      // 099: swap
      // 09a: aastore
      // 09b: dup_x2
      // 09c: dup_x2
      // 09d: pop
      // 09e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a1: bipush 0
      // 0a2: swap
      // 0a3: aastore
      // 0a4: invokeinterface rip/breeze/classtransform/է.method_001 ([Ljava/lang/Object;)[B 2
      // 0a9: astore 17
      // 0ab: aload 0
      // 0ac: getfield rip/breeze/classtransform/ժ.ó_þ_2 Lrip/breeze/classtransform/ó;
      // 0af: aload 16
      // 0b1: lload 2
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: iflt 0f5
      // 0b7: ifnull 0cf
      // 0ba: ifnull 115
      // 0bd: goto 0c4
      // 0c0: invokestatic rip/breeze/classtransform/ժ.method_005 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: getfield rip/breeze/classtransform/ժ.ó_þ_2 Lrip/breeze/classtransform/ó;
      // 0c8: goto 0cf
      // 0cb: invokestatic rip/breeze/classtransform/ժ.method_005 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 0ce: athrow
      // 0cf: aload 5
      // 0d1: aload 17
      // 0d3: bipush 0
      // 0d4: lload 12
      // 0d6: bipush 4
      // 0d7: anewarray 4
      // 0da: dup_x2
      // 0db: dup_x2
      // 0dc: pop
      // 0dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e0: bipush 3
      // 0e1: swap
      // 0e2: aastore
      // 0e3: dup_x1
      // 0e4: swap
      // 0e5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0e8: bipush 2
      // 0e9: swap
      // 0ea: aastore
      // 0eb: dup_x1
      // 0ec: swap
      // 0ed: bipush 1
      // 0ee: swap
      // 0ef: aastore
      // 0f0: dup_x1
      // 0f1: swap
      // 0f2: bipush 0
      // 0f3: swap
      // 0f4: aastore
      // 0f5: invokevirtual rip/breeze/classtransform/ó.method_013 ([Ljava/lang/Object;)[B
      // 0f8: astore 18
      // 0fa: aload 18
      // 0fc: aload 16
      // 0fe: lload 2
      // 0ff: lconst_0
      // 100: lcmp
      // 101: iflt 126
      // 104: ifnull 117
      // 107: ifnull 115
      // 10a: goto 111
      // 10d: invokestatic rip/breeze/classtransform/ժ.method_005 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 110: athrow
      // 111: aload 18
      // 113: astore 17
      // 115: aload 17
      // 117: lload 8
      // 119: bipush 2
      // 11a: anewarray 4
      // 11d: dup_x2
      // 11e: dup_x2
      // 11f: pop
      // 120: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 123: bipush 1
      // 124: swap
      // 125: aastore
      // 126: dup_x1
      // 127: swap
      // 128: bipush 0
      // 129: swap
      // 12a: aastore
      // 12b: invokestatic rip/breeze/classtransform/MathUtil3.getÉ ([Ljava/lang/Object;)Lrip/breeze/inject/é;
      // 12e: astore 18
      // 130: new rip/breeze/classtransform/ը
      // 133: dup
      // 134: aload 0
      // 135: aload 18
      // 137: aconst_null
      // 138: lload 10
      // 13a: invokespecial rip/breeze/classtransform/ը.<init> (Lrip/breeze/classtransform/ժ;Lrip/breeze/inject/é;Lrip/breeze/classtransform/թ;J)V
      // 13d: astore 19
      // 13f: aload 0
      // 140: getfield rip/breeze/classtransform/ժ.map_ÿ_2 Ljava/util/Map;
      // 143: aload 5
      // 145: aload 19
      // 147: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 14c: pop
      // 14d: aload 19
      // 14f: bipush 1
      // 150: anewarray 4
      // 153: dup_x1
      // 154: swap
      // 155: bipush 0
      // 156: swap
      // 157: aastore
      // 158: invokestatic rip/breeze/classtransform/ը.method_006 ([Ljava/lang/Object;)Ljava/util/Set;
      // 15b: invokeinterface java/util/Set.size ()I 1
      // 160: istore 20
      // 162: aload 19
      // 164: bipush 1
      // 165: anewarray 4
      // 168: dup_x1
      // 169: swap
      // 16a: bipush 0
      // 16b: swap
      // 16c: aastore
      // 16d: invokestatic rip/breeze/classtransform/ը.method_006 ([Ljava/lang/Object;)Ljava/util/Set;
      // 170: bipush 0
      // 171: anewarray 46
      // 174: invokeinterface java/util/Set.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 179: checkcast [Ljava/lang/String;
      // 17c: astore 21
      // 17e: aload 21
      // 180: arraylength
      // 181: istore 22
      // 183: bipush 0
      // 184: istore 23
      // 186: iload 23
      // 188: iload 22
      // 18a: if_icmpge 1ec
      // 18d: aload 21
      // 18f: iload 23
      // 191: aaload
      // 192: astore 24
      // 194: aload 0
      // 195: lload 14
      // 197: aload 4
      // 199: aload 24
      // 19b: bipush 3
      // 19c: anewarray 4
      // 19f: dup_x1
      // 1a0: swap
      // 1a1: bipush 2
      // 1a2: swap
      // 1a3: aastore
      // 1a4: dup_x1
      // 1a5: swap
      // 1a6: bipush 1
      // 1a7: swap
      // 1a8: aastore
      // 1a9: dup_x2
      // 1aa: dup_x2
      // 1ab: pop
      // 1ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1af: bipush 0
      // 1b0: swap
      // 1b1: aastore
      // 1b2: invokevirtual rip/breeze/classtransform/ժ.method_002 ([Ljava/lang/Object;)Lrip/breeze/classtransform/ը;
      // 1b5: astore 25
      // 1b7: aload 19
      // 1b9: bipush 1
      // 1ba: anewarray 4
      // 1bd: dup_x1
      // 1be: swap
      // 1bf: bipush 0
      // 1c0: swap
      // 1c1: aastore
      // 1c2: invokestatic rip/breeze/classtransform/ը.method_006 ([Ljava/lang/Object;)Ljava/util/Set;
      // 1c5: aload 25
      // 1c7: bipush 1
      // 1c8: anewarray 4
      // 1cb: dup_x1
      // 1cc: swap
      // 1cd: bipush 0
      // 1ce: swap
      // 1cf: aastore
      // 1d0: invokestatic rip/breeze/classtransform/ը.method_006 ([Ljava/lang/Object;)Ljava/util/Set;
      // 1d3: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 1d8: pop
      // 1d9: iinc 23 1
      // 1dc: aload 16
      // 1de: ifnull 183
      // 1e1: aload 16
      // 1e3: lload 2
      // 1e4: lconst_0
      // 1e5: lcmp
      // 1e6: ifle 180
      // 1e9: ifnonnull 186
      // 1ec: iload 20
      // 1ee: aload 19
      // 1f0: bipush 1
      // 1f1: anewarray 4
      // 1f4: dup_x1
      // 1f5: swap
      // 1f6: bipush 0
      // 1f7: swap
      // 1f8: aastore
      // 1f9: invokestatic rip/breeze/classtransform/ը.method_006 ([Ljava/lang/Object;)Ljava/util/Set;
      // 1fc: invokeinterface java/util/Set.size ()I 1
      // 201: if_icmpne 14d
      // 204: aload 16
      // 206: lload 2
      // 207: lconst_0
      // 208: lcmp
      // 209: ifle 18f
      // 20c: ifnull 1ec
      // 20f: aload 19
      // 211: invokestatic rip/breeze/inject/ջ.method_012 ()Z
      // 214: lload 2
      // 215: lconst_0
      // 216: lcmp
      // 217: iflt 21e
      // 21a: ifeq 22b
      // 21d: bipush 2
      // 21e: anewarray 46
      // 221: invokestatic rip/breeze/classtransform/ժ.method_003 ([Ljava/lang/String;)V
      // 224: goto 22b
      // 227: invokestatic rip/breeze/classtransform/ժ.method_005 (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 22a: athrow
      // 22b: areturn
      // try (56 -> 63): 64 java/lang/ClassNotFoundException
      // try (61 -> 69): 70 java/lang/ClassNotFoundException
      // try (94 -> 103): 104 java/lang/ClassNotFoundException
      // try (102 -> 108): 109 java/lang/ClassNotFoundException
      // try (142 -> 150): 151 java/lang/ClassNotFoundException
      // try (296 -> 306): 307 java/lang/ClassNotFoundException
   }

   public static void execute_3(String[] var0) {
      arr_ý_2 = var0;
   }

   public static String[] invoke_4() {
      return arr_ý_2;
   }

   static {
      if (method_004() == null) {
         method_003(new String[4]);
      }
   }

   private static ClassNotFoundException invoke_5(ClassNotFoundException var0) {
      return var0;
   }
}
