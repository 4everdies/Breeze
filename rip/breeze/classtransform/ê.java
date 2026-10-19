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

class ê {
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   static void invoke_1(Object[] param0) {
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
      // 00b: checkcast java/lang/Object
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast rip/breeze/classtransform/è
      // 015: astore 3
      // 016: dup
      // 017: bipush 3
      // 018: aaload
      // 019: checkcast java/lang/reflect/Method
      // 01c: astore 4
      // 01e: dup
      // 01f: bipush 4
      // 020: aaload
      // 021: checkcast java/lang/Long
      // 024: invokevirtual java/lang/Long.longValue ()J
      // 027: lstore 5
      // 029: dup
      // 02a: bipush 5
      // 02b: aaload
      // 02c: checkcast java/util/Map
      // 02f: astore 7
      // 031: dup
      // 032: bipush 6
      // 034: aaload
      // 035: checkcast rip/breeze/inject/é
      // 038: astore 8
      // 03a: dup
      // 03b: bipush 7
      // 03d: aaload
      // 03e: checkcast rip/breeze/inject/é
      // 041: astore 9
      // 043: dup
      // 044: bipush 8
      // 046: aaload
      // 047: checkcast java/lang/Boolean
      // 04a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04d: istore 10
      // 04f: pop
      // 050: getstatic rip/breeze/classtransform/ê.encKey_a_2 J
      // 053: lload 5
      // 055: lxor
      // 056: lstore 5
      // 058: lload 5
      // 05a: dup2
      // 05b: ldc2_w 129417188547722
      // 05e: lxor
      // 05f: lstore 11
      // 061: dup2
      // 062: ldc2_w 27179366774371
      // 065: lxor
      // 066: lstore 13
      // 068: pop2
      // 069: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 06c: astore 15
      // 06e: aload 3
      // 06f: invokeinterface rip/breeze/classtransform/è.method_001 ()Lrip/breeze/classtransform/þ; 1
      // 074: aload 15
      // 076: ifnonnull 09a
      // 079: getstatic rip/breeze/classtransform/þ.SKIP Lrip/breeze/classtransform/þ;
      // 07c: invokevirtual rip/breeze/classtransform/þ.equals (Ljava/lang/Object;)Z
      // 07f: ifeq 08e
      // 082: goto 089
      // 085: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 088: athrow
      // 089: return
      // 08a: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: aload 7
      // 090: aload 4
      // 092: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 095: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 09a: astore 16
      // 09c: aload 4
      // 09e: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 0a1: ldc java/lang/String
      // 0a3: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0a6: aload 15
      // 0a8: ifnonnull 182
      // 0ab: ifeq 165
      // 0ae: goto 0b5
      // 0b1: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: aload 16
      // 0b7: checkcast java/lang/String
      // 0ba: astore 17
      // 0bc: lload 5
      // 0be: lconst_0
      // 0bf: lcmp
      // 0c0: ifle 159
      // 0c3: aload 3
      // 0c4: invokeinterface rip/breeze/classtransform/è.method_001 ()Lrip/breeze/classtransform/þ; 1
      // 0c9: getstatic rip/breeze/classtransform/þ.KEEP_EMPTY Lrip/breeze/classtransform/þ;
      // 0cc: invokevirtual rip/breeze/classtransform/þ.equals (Ljava/lang/Object;)Z
      // 0cf: ifne 159
      // 0d2: aload 1
      // 0d3: lload 11
      // 0d5: aload 2
      // 0d6: aload 3
      // 0d7: aload 17
      // 0d9: aload 8
      // 0db: aload 9
      // 0dd: bipush 7
      // 0df: anewarray 4
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: bipush 6
      // 0e6: swap
      // 0e7: aastore
      // 0e8: dup_x1
      // 0e9: swap
      // 0ea: bipush 5
      // 0eb: swap
      // 0ec: aastore
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: bipush 4
      // 0f0: swap
      // 0f1: aastore
      // 0f2: dup_x1
      // 0f3: swap
      // 0f4: bipush 3
      // 0f5: swap
      // 0f6: aastore
      // 0f7: dup_x1
      // 0f8: swap
      // 0f9: bipush 2
      // 0fa: swap
      // 0fb: aastore
      // 0fc: dup_x2
      // 0fd: dup_x2
      // 0fe: pop
      // 0ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 102: bipush 1
      // 103: swap
      // 104: aastore
      // 105: dup_x1
      // 106: swap
      // 107: bipush 0
      // 108: swap
      // 109: aastore
      // 10a: invokestatic rip/breeze/classtransform/ê.method_002 ([Ljava/lang/Object;)Ljava/util/List;
      // 10d: astore 18
      // 10f: aload 18
      // 111: aload 15
      // 113: ifnonnull 158
      // 116: invokeinterface java/util/List.size ()I 1
      // 11b: bipush 1
      // 11c: if_icmpeq 144
      // 11f: goto 126
      // 122: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: iload 10
      // 128: ifne 144
      // 12b: goto 132
      // 12e: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 131: athrow
      // 132: new rip/breeze/classtransform/դ
      // 135: dup
      // 136: aload 8
      // 138: aload 9
      // 13a: aload 17
      // 13c: invokespecial rip/breeze/classtransform/դ.<init> (Lrip/breeze/inject/é;Lrip/breeze/inject/é;Ljava/lang/String;)V
      // 13f: athrow
      // 140: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: aload 7
      // 146: aload 4
      // 148: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 14b: aload 18
      // 14d: bipush 0
      // 14e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 153: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 158: pop
      // 159: lload 5
      // 15b: lconst_0
      // 15c: lcmp
      // 15d: ifle 165
      // 160: aload 15
      // 162: ifnull 318
      // 165: aload 4
      // 167: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 16a: aload 15
      // 16c: ifnonnull 187
      // 16f: goto 176
      // 172: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 175: athrow
      // 176: ldc [Ljava/lang/String;
      // 178: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 17b: goto 182
      // 17e: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: ifeq 318
      // 185: aload 16
      // 187: checkcast java/util/List
      // 18a: astore 17
      // 18c: aload 17
      // 18e: lload 5
      // 190: lconst_0
      // 191: lcmp
      // 192: iflt 1af
      // 195: aload 15
      // 197: ifnonnull 1af
      // 19a: ifnonnull 1ad
      // 19d: goto 1a4
      // 1a0: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a3: athrow
      // 1a4: new java/util/ArrayList
      // 1a7: dup
      // 1a8: invokespecial java/util/ArrayList.<init> ()V
      // 1ab: astore 17
      // 1ad: aload 17
      // 1af: invokeinterface java/util/List.isEmpty ()Z 1
      // 1b4: lload 5
      // 1b6: lconst_0
      // 1b7: lcmp
      // 1b8: iflt 1e9
      // 1bb: aload 15
      // 1bd: ifnonnull 1e9
      // 1c0: ifeq 241
      // 1c3: goto 1ca
      // 1c6: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c9: athrow
      // 1ca: aload 3
      // 1cb: invokeinterface rip/breeze/classtransform/è.method_001 ()Lrip/breeze/classtransform/þ; 1
      // 1d0: aload 15
      // 1d2: ifnonnull 317
      // 1d5: goto 1dc
      // 1d8: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1db: athrow
      // 1dc: getstatic rip/breeze/classtransform/þ.KEEP_EMPTY Lrip/breeze/classtransform/þ;
      // 1df: invokevirtual rip/breeze/classtransform/þ.equals (Ljava/lang/Object;)Z
      // 1e2: goto 1e9
      // 1e5: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e8: athrow
      // 1e9: lload 5
      // 1eb: lconst_0
      // 1ec: lcmp
      // 1ed: iflt 234
      // 1f0: ifne 309
      // 1f3: aload 17
      // 1f5: aload 1
      // 1f6: aload 2
      // 1f7: aload 3
      // 1f8: aconst_null
      // 1f9: aload 8
      // 1fb: lload 13
      // 1fd: aload 9
      // 1ff: bipush 7
      // 201: anewarray 4
      // 204: dup_x1
      // 205: swap
      // 206: bipush 6
      // 208: swap
      // 209: aastore
      // 20a: dup_x2
      // 20b: dup_x2
      // 20c: pop
      // 20d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 210: bipush 5
      // 211: swap
      // 212: aastore
      // 213: dup_x1
      // 214: swap
      // 215: bipush 4
      // 216: swap
      // 217: aastore
      // 218: dup_x1
      // 219: swap
      // 21a: bipush 3
      // 21b: swap
      // 21c: aastore
      // 21d: dup_x1
      // 21e: swap
      // 21f: bipush 2
      // 220: swap
      // 221: aastore
      // 222: dup_x1
      // 223: swap
      // 224: bipush 1
      // 225: swap
      // 226: aastore
      // 227: dup_x1
      // 228: swap
      // 229: bipush 0
      // 22a: swap
      // 22b: aastore
      // 22c: invokestatic rip/breeze/classtransform/ê.method_003 ([Ljava/lang/Object;)Ljava/util/List;
      // 22f: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 234: pop
      // 235: aload 15
      // 237: ifnull 309
      // 23a: goto 241
      // 23d: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 240: athrow
      // 241: new java/util/ArrayList
      // 244: dup
      // 245: invokespecial java/util/ArrayList.<init> ()V
      // 248: astore 18
      // 24a: bipush 0
      // 24b: istore 19
      // 24d: aload 17
      // 24f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 254: astore 20
      // 256: aload 20
      // 258: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 25d: ifeq 2cc
      // 260: aload 20
      // 262: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 267: checkcast java/lang/String
      // 26a: astore 21
      // 26c: aload 18
      // 26e: lload 5
      // 270: lconst_0
      // 271: lcmp
      // 272: ifle 307
      // 275: aload 1
      // 276: lload 11
      // 278: aload 2
      // 279: aload 3
      // 27a: aload 21
      // 27c: aload 8
      // 27e: aload 9
      // 280: bipush 7
      // 282: anewarray 4
      // 285: dup_x1
      // 286: swap
      // 287: bipush 6
      // 289: swap
      // 28a: aastore
      // 28b: dup_x1
      // 28c: swap
      // 28d: bipush 5
      // 28e: swap
      // 28f: aastore
      // 290: dup_x1
      // 291: swap
      // 292: bipush 4
      // 293: swap
      // 294: aastore
      // 295: dup_x1
      // 296: swap
      // 297: bipush 3
      // 298: swap
      // 299: aastore
      // 29a: dup_x1
      // 29b: swap
      // 29c: bipush 2
      // 29d: swap
      // 29e: aastore
      // 29f: dup_x2
      // 2a0: dup_x2
      // 2a1: pop
      // 2a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a5: bipush 1
      // 2a6: swap
      // 2a7: aastore
      // 2a8: dup_x1
      // 2a9: swap
      // 2aa: bipush 0
      // 2ab: swap
      // 2ac: aastore
      // 2ad: invokestatic rip/breeze/classtransform/ê.method_002 ([Ljava/lang/Object;)Ljava/util/List;
      // 2b0: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 2b5: pop
      // 2b6: bipush 1
      // 2b7: istore 19
      // 2b9: aload 15
      // 2bb: ifnonnull 305
      // 2be: goto 2c7
      // 2c1: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c4: athrow
      // 2c5: astore 22
      // 2c7: aload 15
      // 2c9: ifnull 256
      // 2cc: lload 5
      // 2ce: lconst_0
      // 2cf: lcmp
      // 2d0: ifle 305
      // 2d3: iload 19
      // 2d5: lload 5
      // 2d7: lconst_0
      // 2d8: lcmp
      // 2d9: ifle 2ed
      // 2dc: aload 15
      // 2de: ifnonnull 2ed
      // 2e1: ifne 305
      // 2e4: goto 2eb
      // 2e7: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ea: athrow
      // 2eb: iload 10
      // 2ed: ifne 305
      // 2f0: new rip/breeze/classtransform/դ
      // 2f3: dup
      // 2f4: aload 8
      // 2f6: aload 9
      // 2f8: aload 17
      // 2fa: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 2fd: invokespecial rip/breeze/classtransform/դ.<init> (Lrip/breeze/inject/é;Lrip/breeze/inject/é;Ljava/lang/String;)V
      // 300: athrow
      // 301: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 304: athrow
      // 305: aload 18
      // 307: astore 17
      // 309: aload 7
      // 30b: aload 4
      // 30d: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 310: aload 17
      // 312: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 317: pop
      // 318: return
      // try (245 -> 302): 303 java/lang/Throwable
      // try (233 -> 242): 243 java/lang/Throwable
      // try (229 -> 237): 238 java/lang/Throwable
      // try (222 -> 230): 231 java/lang/Throwable
      // try (206 -> 214): 215 java/lang/Throwable
      // try (190 -> 199): 200 java/lang/Throwable
      // try (184 -> 194): 195 java/lang/Throwable
      // try (162 -> 174): 174 java/lang/Throwable
      // try (156 -> 164): 165 java/lang/Throwable
      // try (153 -> 159): 160 java/lang/Throwable
      // try (83 -> 90): 91 java/lang/Throwable
      // try (69 -> 76): 76 java/lang/Throwable
      // try (65 -> 72): 73 java/lang/Throwable
      // try (321 -> 377): 382 java/lang/Throwable
      // try (377 -> 380): 380 java/lang/Throwable
      // try (385 -> 397): 398 java/lang/Throwable
      // try (401 -> 410): 410 java/lang/Throwable
   }

   private static List invoke_2(Object[] param0) {
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
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Object
      // 018: astore 4
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast rip/breeze/classtransform/è
      // 020: astore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/String
      // 028: astore 6
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast rip/breeze/inject/é
      // 030: astore 7
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast rip/breeze/inject/é
      // 039: astore 8
      // 03b: pop
      // 03c: getstatic rip/breeze/classtransform/ê.encKey_a_2 J
      // 03f: lload 2
      // 040: lxor
      // 041: lstore 2
      // 042: lload 2
      // 043: dup2
      // 044: ldc2_w 22091291023766
      // 047: lxor
      // 048: lstore 9
      // 04a: dup2
      // 04b: ldc2_w 14396185257482
      // 04e: lxor
      // 04f: lstore 11
      // 051: pop2
      // 052: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 055: astore 13
      // 057: aload 4
      // 059: instanceof rip/breeze/inject/BreezeClass12
      // 05c: aload 13
      // 05e: ifnonnull 0b2
      // 061: ifeq 0ad
      // 064: goto 06b
      // 067: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: aload 1
      // 06c: aload 4
      // 06e: aload 5
      // 070: aload 6
      // 072: aload 7
      // 074: lload 11
      // 076: aload 8
      // 078: bipush 7
      // 07a: anewarray 4
      // 07d: dup_x1
      // 07e: swap
      // 07f: bipush 6
      // 081: swap
      // 082: aastore
      // 083: dup_x2
      // 084: dup_x2
      // 085: pop
      // 086: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 089: bipush 5
      // 08a: swap
      // 08b: aastore
      // 08c: dup_x1
      // 08d: swap
      // 08e: bipush 4
      // 08f: swap
      // 090: aastore
      // 091: dup_x1
      // 092: swap
      // 093: bipush 3
      // 094: swap
      // 095: aastore
      // 096: dup_x1
      // 097: swap
      // 098: bipush 2
      // 099: swap
      // 09a: aastore
      // 09b: dup_x1
      // 09c: swap
      // 09d: bipush 1
      // 09e: swap
      // 09f: aastore
      // 0a0: dup_x1
      // 0a1: swap
      // 0a2: bipush 0
      // 0a3: swap
      // 0a4: aastore
      // 0a5: invokestatic rip/breeze/classtransform/ê.method_003 ([Ljava/lang/Object;)Ljava/util/List;
      // 0a8: areturn
      // 0a9: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: aload 4
      // 0af: instanceof rip/breeze/inject/á
      // 0b2: ifeq 0f7
      // 0b5: aload 1
      // 0b6: aload 4
      // 0b8: aload 5
      // 0ba: aload 6
      // 0bc: aload 7
      // 0be: aload 8
      // 0c0: lload 9
      // 0c2: bipush 7
      // 0c4: anewarray 4
      // 0c7: dup_x2
      // 0c8: dup_x2
      // 0c9: pop
      // 0ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cd: bipush 6
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x1
      // 0d2: swap
      // 0d3: bipush 5
      // 0d4: swap
      // 0d5: aastore
      // 0d6: dup_x1
      // 0d7: swap
      // 0d8: bipush 4
      // 0d9: swap
      // 0da: aastore
      // 0db: dup_x1
      // 0dc: swap
      // 0dd: bipush 3
      // 0de: swap
      // 0df: aastore
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
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: bipush 0
      // 0ed: swap
      // 0ee: aastore
      // 0ef: invokestatic rip/breeze/classtransform/ê.method_004 ([Ljava/lang/Object;)Ljava/util/List;
      // 0f2: areturn
      // 0f3: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: new java/lang/IllegalArgumentException
      // 0fa: dup
      // 0fb: new java/lang/StringBuilder
      // 0fe: dup
      // 0ff: invokespecial java/lang/StringBuilder.<init> ()V
      // 102: sipush 3178
      // 105: ldc2_w 7530030701366691987
      // 108: lload 2
      // 109: lxor
      // 10a: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ê.method_009 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: aload 4
      // 114: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 117: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 11a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11d: sipush 7504
      // 120: ldc2_w 2777326066534734248
      // 123: lload 2
      // 124: lxor
      // 125: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/ê.method_009 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12d: aload 8
      // 12f: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 132: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 135: ldc "'"
      // 137: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13d: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 140: athrow
      // try (54 -> 59): 60 rip/breeze/classtransform/դ
      // try (58 -> 110): 110 rip/breeze/classtransform/դ
      // try (114 -> 163): 163 rip/breeze/classtransform/դ
   }

   private static List invoke_3(Object[] param0) {
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
      // 00b: checkcast java/lang/Object
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast rip/breeze/classtransform/è
      // 015: astore 3
      // 016: dup
      // 017: bipush 3
      // 018: aaload
      // 019: checkcast java/lang/String
      // 01c: astore 4
      // 01e: dup
      // 01f: bipush 4
      // 020: aaload
      // 021: checkcast rip/breeze/inject/é
      // 024: astore 5
      // 026: dup
      // 027: bipush 5
      // 028: aaload
      // 029: checkcast java/lang/Long
      // 02c: invokevirtual java/lang/Long.longValue ()J
      // 02f: lstore 6
      // 031: dup
      // 032: bipush 6
      // 034: aaload
      // 035: checkcast rip/breeze/inject/é
      // 038: astore 8
      // 03a: pop
      // 03b: getstatic rip/breeze/classtransform/ê.encKey_a_2 J
      // 03e: lload 6
      // 040: lxor
      // 041: lstore 6
      // 043: lload 6
      // 045: dup2
      // 046: ldc2_w 54639235541187
      // 049: lxor
      // 04a: lstore 9
      // 04c: dup2
      // 04d: ldc2_w 112357254518345
      // 050: lxor
      // 051: lstore 11
      // 053: dup2
      // 054: ldc2_w 13435830779458
      // 057: lxor
      // 058: lstore 13
      // 05a: dup2
      // 05b: ldc2_w 70027284823500
      // 05e: lxor
      // 05f: lstore 15
      // 061: dup2
      // 062: ldc2_w 53384262282526
      // 065: lxor
      // 066: lstore 17
      // 068: dup2
      // 069: ldc2_w 19861629555132
      // 06c: lxor
      // 06d: lstore 19
      // 06f: dup2
      // 070: ldc2_w 74978230704033
      // 073: lxor
      // 074: lstore 21
      // 076: pop2
      // 077: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 07a: new java/util/ArrayList
      // 07d: dup
      // 07e: invokespecial java/util/ArrayList.<init> ()V
      // 081: astore 23
      // 083: astore 24
      // 085: aload 4
      // 087: aload 24
      // 089: ifnonnull 097
      // 08c: ifnonnull 0b8
      // 08f: goto 096
      // 092: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095: athrow
      // 096: aload 2
      // 097: checkcast rip/breeze/inject/BreezeClass12
      // 09a: astore 25
      // 09c: new java/lang/StringBuilder
      // 09f: dup
      // 0a0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a3: aload 25
      // 0a5: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 0a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ab: aload 25
      // 0ad: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b6: astore 4
      // 0b8: aload 1
      // 0b9: bipush 0
      // 0ba: anewarray 4
      // 0bd: invokevirtual rip/breeze/classtransform/ô.method_011 ([Ljava/lang/Object;)Z
      // 0c0: aload 24
      // 0c2: lload 6
      // 0c4: lconst_0
      // 0c5: lcmp
      // 0c6: iflt 413
      // 0c9: ifnonnull 411
      // 0cc: ifne 404
      // 0cf: goto 0d6
      // 0d2: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: aload 1
      // 0d7: lload 9
      // 0d9: bipush 1
      // 0da: anewarray 4
      // 0dd: dup_x2
      // 0de: dup_x2
      // 0df: pop
      // 0e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e3: bipush 0
      // 0e4: swap
      // 0e5: aastore
      // 0e6: invokevirtual rip/breeze/classtransform/ô.method_014 ([Ljava/lang/Object;)Lrip/breeze/classtransform/ô;
      // 0e9: aload 5
      // 0eb: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 0ee: bipush 1
      // 0ef: anewarray 4
      // 0f2: dup_x1
      // 0f3: swap
      // 0f4: bipush 0
      // 0f5: swap
      // 0f6: aastore
      // 0f7: invokevirtual rip/breeze/classtransform/ô.method_013 ([Ljava/lang/Object;)Ljava/lang/String;
      // 0fa: astore 25
      // 0fc: aload 3
      // 0fd: invokeinterface rip/breeze/classtransform/è.method_002 ()Z 1
      // 102: aload 24
      // 104: ifnonnull 1b1
      // 107: ifeq 19d
      // 10a: goto 111
      // 10d: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 110: athrow
      // 111: aload 4
      // 113: aload 24
      // 115: lload 6
      // 117: lconst_0
      // 118: lcmp
      // 119: iflt 1a1
      // 11c: ifnonnull 19f
      // 11f: goto 126
      // 122: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: lload 17
      // 128: bipush 2
      // 129: anewarray 4
      // 12c: dup_x2
      // 12d: dup_x2
      // 12e: pop
      // 12f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 132: bipush 1
      // 133: swap
      // 134: aastore
      // 135: dup_x1
      // 136: swap
      // 137: bipush 0
      // 138: swap
      // 139: aastore
      // 13a: invokestatic rip/breeze/classtransform/MathUtil3.getՑ ([Ljava/lang/Object;)Lrip/breeze/classtransform/ց;
      // 13d: astore 26
      // 13f: lload 6
      // 141: lconst_0
      // 142: lcmp
      // 143: ifle 14b
      // 146: aload 26
      // 148: ifnull 19d
      // 14b: aload 25
      // 14d: aload 24
      // 14f: ifnonnull 19b
      // 152: goto 159
      // 155: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 158: athrow
      // 159: aload 26
      // 15b: bipush 0
      // 15c: anewarray 4
      // 15f: invokevirtual rip/breeze/classtransform/ց.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 162: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 165: ifne 179
      // 168: goto 16f
      // 16b: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16e: athrow
      // 16f: aload 4
      // 171: invokestatic java/util/Collections.singletonList (Ljava/lang/Object;)Ljava/util/List;
      // 174: areturn
      // 175: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 178: athrow
      // 179: new java/lang/StringBuilder
      // 17c: dup
      // 17d: invokespecial java/lang/StringBuilder.<init> ()V
      // 180: aload 26
      // 182: bipush 0
      // 183: anewarray 4
      // 186: invokevirtual rip/breeze/classtransform/ց.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 189: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18c: aload 26
      // 18e: bipush 0
      // 18f: anewarray 4
      // 192: invokevirtual rip/breeze/classtransform/ց.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 195: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 198: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19b: astore 4
      // 19d: aload 4
      // 19f: aload 24
      // 1a1: ifnonnull 2d1
      // 1a4: ldc_w "("
      // 1a7: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1aa: goto 1b1
      // 1ad: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b0: athrow
      // 1b1: ifeq 2aa
      // 1b4: aload 4
      // 1b6: bipush 0
      // 1b7: aload 4
      // 1b9: bipush 40
      // 1bb: invokevirtual java/lang/String.indexOf (I)I
      // 1be: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1c1: astore 26
      // 1c3: aload 4
      // 1c5: aload 4
      // 1c7: bipush 40
      // 1c9: invokevirtual java/lang/String.indexOf (I)I
      // 1cc: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1cf: astore 27
      // 1d1: aload 1
      // 1d2: aload 25
      // 1d4: aload 26
      // 1d6: lload 19
      // 1d8: aload 27
      // 1da: bipush 4
      // 1db: anewarray 4
      // 1de: dup_x1
      // 1df: swap
      // 1e0: bipush 3
      // 1e1: swap
      // 1e2: aastore
      // 1e3: dup_x2
      // 1e4: dup_x2
      // 1e5: pop
      // 1e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e9: bipush 2
      // 1ea: swap
      // 1eb: aastore
      // 1ec: dup_x1
      // 1ed: swap
      // 1ee: bipush 1
      // 1ef: swap
      // 1f0: aastore
      // 1f1: dup_x1
      // 1f2: swap
      // 1f3: bipush 0
      // 1f4: swap
      // 1f5: aastore
      // 1f6: invokevirtual rip/breeze/classtransform/ô.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 1f9: astore 28
      // 1fb: aload 1
      // 1fc: lload 13
      // 1fe: aload 27
      // 200: bipush 2
      // 201: anewarray 4
      // 204: dup_x1
      // 205: swap
      // 206: bipush 1
      // 207: swap
      // 208: aastore
      // 209: dup_x2
      // 20a: dup_x2
      // 20b: pop
      // 20c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20f: bipush 0
      // 210: swap
      // 211: aastore
      // 212: invokevirtual rip/breeze/classtransform/ô.û ([Ljava/lang/Object;)Ljava/lang/String;
      // 215: astore 29
      // 217: aload 5
      // 219: aload 28
      // 21b: lload 11
      // 21d: aload 29
      // 21f: bipush 4
      // 220: anewarray 4
      // 223: dup_x1
      // 224: swap
      // 225: bipush 3
      // 226: swap
      // 227: aastore
      // 228: dup_x2
      // 229: dup_x2
      // 22a: pop
      // 22b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22e: bipush 2
      // 22f: swap
      // 230: aastore
      // 231: dup_x1
      // 232: swap
      // 233: bipush 1
      // 234: swap
      // 235: aastore
      // 236: dup_x1
      // 237: swap
      // 238: bipush 0
      // 239: swap
      // 23a: aastore
      // 23b: invokestatic rip/breeze/classtransform/MathUtil3.getBreezeClass12 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass12;
      // 23e: astore 30
      // 240: aload 24
      // 242: lload 6
      // 244: lconst_0
      // 245: lcmp
      // 246: ifle 2a0
      // 249: ifnonnull 29e
      // 24c: aload 30
      // 24e: ifnonnull 27c
      // 251: goto 258
      // 254: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 257: athrow
      // 258: new rip/breeze/classtransform/դ
      // 25b: dup
      // 25c: aload 5
      // 25e: aload 8
      // 260: new java/lang/StringBuilder
      // 263: dup
      // 264: invokespecial java/lang/StringBuilder.<init> ()V
      // 267: aload 28
      // 269: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26c: aload 29
      // 26e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 271: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 274: invokespecial rip/breeze/classtransform/դ.<init> (Lrip/breeze/inject/é;Lrip/breeze/inject/é;Ljava/lang/String;)V
      // 277: athrow
      // 278: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27b: athrow
      // 27c: aload 23
      // 27e: new java/lang/StringBuilder
      // 281: dup
      // 282: invokespecial java/lang/StringBuilder.<init> ()V
      // 285: aload 30
      // 287: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 28a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28d: aload 30
      // 28f: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 292: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 295: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 298: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 29d: pop
      // 29e: aload 24
      // 2a0: lload 6
      // 2a2: lconst_0
      // 2a3: lcmp
      // 2a4: ifle 401
      // 2a7: ifnull 3f8
      // 2aa: new java/lang/StringBuilder
      // 2ad: dup
      // 2ae: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b1: aload 25
      // 2b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b6: ldc_w "."
      // 2b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bc: aload 4
      // 2be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c1: ldc_w "("
      // 2c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ca: goto 2d1
      // 2cd: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d0: athrow
      // 2d1: astore 26
      // 2d3: aload 1
      // 2d4: bipush 1
      // 2d5: anewarray 90
      // 2d8: dup
      // 2d9: bipush 0
      // 2da: aload 26
      // 2dc: aastore
      // 2dd: lload 15
      // 2df: dup2_x1
      // 2e0: pop2
      // 2e1: bipush 2
      // 2e2: anewarray 4
      // 2e5: dup_x1
      // 2e6: swap
      // 2e7: bipush 1
      // 2e8: swap
      // 2e9: aastore
      // 2ea: dup_x2
      // 2eb: dup_x2
      // 2ec: pop
      // 2ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f0: bipush 0
      // 2f1: swap
      // 2f2: aastore
      // 2f3: invokevirtual rip/breeze/classtransform/ô.method_010 ([Ljava/lang/Object;)Ljava/util/List;
      // 2f6: astore 27
      // 2f8: aload 27
      // 2fa: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2ff: astore 28
      // 301: aload 28
      // 303: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 308: ifeq 3f8
      // 30b: aload 28
      // 30d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 312: checkcast java/lang/String
      // 315: astore 29
      // 317: aload 29
      // 319: aload 26
      // 31b: invokevirtual java/lang/String.length ()I
      // 31e: bipush 1
      // 31f: isub
      // 320: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 323: astore 30
      // 325: aload 1
      // 326: aload 29
      // 328: bipush 1
      // 329: anewarray 4
      // 32c: dup_x1
      // 32d: swap
      // 32e: bipush 0
      // 32f: swap
      // 330: aastore
      // 331: invokevirtual rip/breeze/classtransform/ô.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 334: astore 31
      // 336: aload 1
      // 337: lload 13
      // 339: aload 30
      // 33b: bipush 2
      // 33c: anewarray 4
      // 33f: dup_x1
      // 340: swap
      // 341: bipush 1
      // 342: swap
      // 343: aastore
      // 344: dup_x2
      // 345: dup_x2
      // 346: pop
      // 347: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34a: bipush 0
      // 34b: swap
      // 34c: aastore
      // 34d: invokevirtual rip/breeze/classtransform/ô.û ([Ljava/lang/Object;)Ljava/lang/String;
      // 350: astore 32
      // 352: aload 5
      // 354: aload 31
      // 356: lload 11
      // 358: aload 32
      // 35a: bipush 4
      // 35b: anewarray 4
      // 35e: dup_x1
      // 35f: swap
      // 360: bipush 3
      // 361: swap
      // 362: aastore
      // 363: dup_x2
      // 364: dup_x2
      // 365: pop
      // 366: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 369: bipush 2
      // 36a: swap
      // 36b: aastore
      // 36c: dup_x1
      // 36d: swap
      // 36e: bipush 1
      // 36f: swap
      // 370: aastore
      // 371: dup_x1
      // 372: swap
      // 373: bipush 0
      // 374: swap
      // 375: aastore
      // 376: invokestatic rip/breeze/classtransform/MathUtil3.getBreezeClass12 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass12;
      // 379: astore 33
      // 37b: lload 6
      // 37d: lconst_0
      // 37e: lcmp
      // 37f: iflt 49c
      // 382: aload 24
      // 384: ifnonnull 49c
      // 387: aload 24
      // 389: lload 6
      // 38b: lconst_0
      // 38c: lcmp
      // 38d: ifle 3f5
      // 390: ifnonnull 3f3
      // 393: goto 39a
      // 396: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 399: athrow
      // 39a: lload 6
      // 39c: lconst_0
      // 39d: lcmp
      // 39e: ifle 3f3
      // 3a1: aload 33
      // 3a3: ifnonnull 3d1
      // 3a6: goto 3ad
      // 3a9: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ac: athrow
      // 3ad: new rip/breeze/classtransform/դ
      // 3b0: dup
      // 3b1: aload 5
      // 3b3: aload 8
      // 3b5: new java/lang/StringBuilder
      // 3b8: dup
      // 3b9: invokespecial java/lang/StringBuilder.<init> ()V
      // 3bc: aload 31
      // 3be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c1: aload 32
      // 3c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3c9: invokespecial rip/breeze/classtransform/դ.<init> (Lrip/breeze/inject/é;Lrip/breeze/inject/é;Ljava/lang/String;)V
      // 3cc: athrow
      // 3cd: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d0: athrow
      // 3d1: aload 23
      // 3d3: new java/lang/StringBuilder
      // 3d6: dup
      // 3d7: invokespecial java/lang/StringBuilder.<init> ()V
      // 3da: aload 33
      // 3dc: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 3df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e2: aload 33
      // 3e4: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 3e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ea: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3ed: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3f2: pop
      // 3f3: aload 24
      // 3f5: ifnull 301
      // 3f8: lload 6
      // 3fa: lconst_0
      // 3fb: lcmp
      // 3fc: ifle 49c
      // 3ff: aload 24
      // 401: ifnull 49c
      // 404: aload 3
      // 405: invokeinterface rip/breeze/classtransform/è.method_002 ()Z 1
      // 40a: goto 411
      // 40d: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 410: athrow
      // 411: aload 24
      // 413: ifnonnull 4af
      // 416: ifeq 49c
      // 419: goto 420
      // 41c: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41f: athrow
      // 420: aload 4
      // 422: lload 17
      // 424: bipush 2
      // 425: anewarray 4
      // 428: dup_x2
      // 429: dup_x2
      // 42a: pop
      // 42b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42e: bipush 1
      // 42f: swap
      // 430: aastore
      // 431: dup_x1
      // 432: swap
      // 433: bipush 0
      // 434: swap
      // 435: aastore
      // 436: invokestatic rip/breeze/classtransform/MathUtil3.getՑ ([Ljava/lang/Object;)Lrip/breeze/classtransform/ց;
      // 439: astore 25
      // 43b: lload 6
      // 43d: lconst_0
      // 43e: lcmp
      // 43f: iflt 447
      // 442: aload 25
      // 444: ifnull 49c
      // 447: aload 5
      // 449: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 44c: aload 24
      // 44e: ifnonnull 49a
      // 451: goto 458
      // 454: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 457: athrow
      // 458: aload 25
      // 45a: bipush 0
      // 45b: anewarray 4
      // 45e: invokevirtual rip/breeze/classtransform/ց.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 461: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 464: ifne 478
      // 467: goto 46e
      // 46a: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46d: athrow
      // 46e: aload 4
      // 470: invokestatic java/util/Collections.singletonList (Ljava/lang/Object;)Ljava/util/List;
      // 473: areturn
      // 474: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 477: athrow
      // 478: new java/lang/StringBuilder
      // 47b: dup
      // 47c: invokespecial java/lang/StringBuilder.<init> ()V
      // 47f: aload 25
      // 481: bipush 0
      // 482: anewarray 4
      // 485: invokevirtual rip/breeze/classtransform/ց.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 488: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 48b: aload 25
      // 48d: bipush 0
      // 48e: anewarray 4
      // 491: invokevirtual rip/breeze/classtransform/ց.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 494: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 497: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 49a: astore 4
      // 49c: aload 23
      // 49e: aload 24
      // 4a0: ifnonnull 55e
      // 4a3: invokeinterface java/util/List.isEmpty ()Z 1
      // 4a8: goto 4af
      // 4ab: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ae: athrow
      // 4af: ifeq 55c
      // 4b2: aload 5
      // 4b4: lload 21
      // 4b6: aload 4
      // 4b8: bipush 3
      // 4b9: anewarray 4
      // 4bc: dup_x1
      // 4bd: swap
      // 4be: bipush 2
      // 4bf: swap
      // 4c0: aastore
      // 4c1: dup_x2
      // 4c2: dup_x2
      // 4c3: pop
      // 4c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c7: bipush 1
      // 4c8: swap
      // 4c9: aastore
      // 4ca: dup_x1
      // 4cb: swap
      // 4cc: bipush 0
      // 4cd: swap
      // 4ce: aastore
      // 4cf: invokestatic rip/breeze/classtransform/MathUtil3.getList ([Ljava/lang/Object;)Ljava/util/List;
      // 4d2: astore 25
      // 4d4: aload 25
      // 4d6: aload 24
      // 4d8: ifnonnull 4fe
      // 4db: invokeinterface java/util/List.isEmpty ()Z 1
      // 4e0: ifeq 4fc
      // 4e3: goto 4ea
      // 4e6: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e9: athrow
      // 4ea: new rip/breeze/classtransform/դ
      // 4ed: dup
      // 4ee: aload 5
      // 4f0: aload 8
      // 4f2: aload 4
      // 4f4: invokespecial rip/breeze/classtransform/դ.<init> (Lrip/breeze/inject/é;Lrip/breeze/inject/é;Ljava/lang/String;)V
      // 4f7: athrow
      // 4f8: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4fb: athrow
      // 4fc: aload 25
      // 4fe: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 503: astore 26
      // 505: aload 26
      // 507: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 50c: ifeq 55c
      // 50f: aload 26
      // 511: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 516: checkcast rip/breeze/inject/BreezeClass12
      // 519: astore 27
      // 51b: lload 6
      // 51d: lconst_0
      // 51e: lcmp
      // 51f: iflt 549
      // 522: aload 23
      // 524: aload 24
      // 526: ifnonnull 55e
      // 529: new java/lang/StringBuilder
      // 52c: dup
      // 52d: invokespecial java/lang/StringBuilder.<init> ()V
      // 530: aload 27
      // 532: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 535: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 538: aload 27
      // 53a: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 53d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 540: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 543: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 548: pop
      // 549: aload 24
      // 54b: ifnull 505
      // 54e: lload 6
      // 550: lconst_0
      // 551: lcmp
      // 552: ifle 51b
      // 555: goto 55c
      // 558: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55b: athrow
      // 55c: aload 23
      // 55e: areturn
      // try (78 -> 82): 83 rip/breeze/classtransform/դ
      // try (99 -> 110): 111 rip/breeze/classtransform/դ
      // try (136 -> 141): 142 rip/breeze/classtransform/դ
      // try (140 -> 151): 152 rip/breeze/classtransform/դ
      // try (171 -> 180): 181 rip/breeze/classtransform/դ
      // try (177 -> 189): 190 rip/breeze/classtransform/դ
      // try (183 -> 195): 195 rip/breeze/classtransform/դ
      // try (213 -> 217): 218 rip/breeze/classtransform/դ
      // try (314 -> 322): 323 rip/breeze/classtransform/դ
      // try (320 -> 339): 339 rip/breeze/classtransform/դ
      // try (354 -> 372): 373 rip/breeze/classtransform/դ
      // try (479 -> 491): 492 rip/breeze/classtransform/դ
      // try (485 -> 500): 501 rip/breeze/classtransform/դ
      // try (494 -> 517): 517 rip/breeze/classtransform/դ
      // try (534 -> 542): 543 rip/breeze/classtransform/դ
      // try (545 -> 548): 549 rip/breeze/classtransform/դ
      // try (569 -> 579): 580 rip/breeze/classtransform/դ
      // try (575 -> 588): 589 rip/breeze/classtransform/դ
      // try (582 -> 594): 594 rip/breeze/classtransform/դ
      // try (611 -> 615): 616 rip/breeze/classtransform/դ
      // try (643 -> 648): 649 rip/breeze/classtransform/դ
      // try (646 -> 658): 658 rip/breeze/classtransform/դ
      // try (670 -> 691): 696 rip/breeze/classtransform/դ
   }

   private static List invoke_4(Object[] param0) {
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
      // 00b: checkcast java/lang/Object
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast rip/breeze/classtransform/è
      // 015: astore 3
      // 016: dup
      // 017: bipush 3
      // 018: aaload
      // 019: checkcast java/lang/String
      // 01c: astore 4
      // 01e: dup
      // 01f: bipush 4
      // 020: aaload
      // 021: checkcast rip/breeze/inject/é
      // 024: astore 5
      // 026: dup
      // 027: bipush 5
      // 028: aaload
      // 029: checkcast rip/breeze/inject/é
      // 02c: astore 6
      // 02e: dup
      // 02f: bipush 6
      // 031: aaload
      // 032: checkcast java/lang/Long
      // 035: invokevirtual java/lang/Long.longValue ()J
      // 038: lstore 7
      // 03a: pop
      // 03b: getstatic rip/breeze/classtransform/ê.encKey_a_2 J
      // 03e: lload 7
      // 040: lxor
      // 041: lstore 7
      // 043: lload 7
      // 045: dup2
      // 046: ldc2_w 44744570197855
      // 049: lxor
      // 04a: lstore 9
      // 04c: dup2
      // 04d: ldc2_w 42538016719440
      // 050: lxor
      // 051: lstore 11
      // 053: dup2
      // 054: ldc2_w 45686203781762
      // 057: lxor
      // 058: lstore 13
      // 05a: dup2
      // 05b: ldc2_w 59778809381840
      // 05e: lxor
      // 05f: lstore 15
      // 061: dup2
      // 062: ldc2_w 114212303899145
      // 065: lxor
      // 066: lstore 17
      // 068: dup2
      // 069: ldc2_w 70338900636962
      // 06c: lxor
      // 06d: lstore 19
      // 06f: dup2
      // 070: ldc2_w 134803217220042
      // 073: lxor
      // 074: lstore 21
      // 076: pop2
      // 077: invokestatic rip/breeze/classtransform/ò.method_016 ()[I
      // 07a: new java/util/ArrayList
      // 07d: dup
      // 07e: invokespecial java/util/ArrayList.<init> ()V
      // 081: astore 23
      // 083: astore 24
      // 085: aload 4
      // 087: aload 24
      // 089: ifnonnull 097
      // 08c: ifnonnull 0be
      // 08f: goto 096
      // 092: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095: athrow
      // 096: aload 2
      // 097: checkcast rip/breeze/inject/á
      // 09a: astore 25
      // 09c: new java/lang/StringBuilder
      // 09f: dup
      // 0a0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a3: aload 25
      // 0a5: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 0a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ab: ldc_w ":"
      // 0ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b1: aload 25
      // 0b3: getfield rip/breeze/inject/á.string_û_2 Ljava/lang/String;
      // 0b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0bc: astore 4
      // 0be: aload 1
      // 0bf: bipush 0
      // 0c0: anewarray 4
      // 0c3: invokevirtual rip/breeze/classtransform/ô.method_011 ([Ljava/lang/Object;)Z
      // 0c6: aload 24
      // 0c8: lload 7
      // 0ca: lconst_0
      // 0cb: lcmp
      // 0cc: ifle 449
      // 0cf: ifnonnull 447
      // 0d2: ifne 43a
      // 0d5: goto 0dc
      // 0d8: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: aload 1
      // 0dd: lload 9
      // 0df: bipush 1
      // 0e0: anewarray 4
      // 0e3: dup_x2
      // 0e4: dup_x2
      // 0e5: pop
      // 0e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e9: bipush 0
      // 0ea: swap
      // 0eb: aastore
      // 0ec: invokevirtual rip/breeze/classtransform/ô.method_014 ([Ljava/lang/Object;)Lrip/breeze/classtransform/ô;
      // 0ef: aload 5
      // 0f1: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 0f4: bipush 1
      // 0f5: anewarray 4
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: bipush 0
      // 0fb: swap
      // 0fc: aastore
      // 0fd: invokevirtual rip/breeze/classtransform/ô.method_013 ([Ljava/lang/Object;)Ljava/lang/String;
      // 100: astore 25
      // 102: aload 3
      // 103: invokeinterface rip/breeze/classtransform/è.method_002 ()Z 1
      // 108: aload 24
      // 10a: ifnonnull 1b7
      // 10d: ifeq 1a3
      // 110: goto 117
      // 113: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: aload 4
      // 119: aload 24
      // 11b: lload 7
      // 11d: lconst_0
      // 11e: lcmp
      // 11f: ifle 1a7
      // 122: ifnonnull 1a5
      // 125: goto 12c
      // 128: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12b: athrow
      // 12c: lload 13
      // 12e: bipush 2
      // 12f: anewarray 4
      // 132: dup_x2
      // 133: dup_x2
      // 134: pop
      // 135: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 138: bipush 1
      // 139: swap
      // 13a: aastore
      // 13b: dup_x1
      // 13c: swap
      // 13d: bipush 0
      // 13e: swap
      // 13f: aastore
      // 140: invokestatic rip/breeze/classtransform/MathUtil3.getՑ ([Ljava/lang/Object;)Lrip/breeze/classtransform/ց;
      // 143: astore 26
      // 145: lload 7
      // 147: lconst_0
      // 148: lcmp
      // 149: ifle 151
      // 14c: aload 26
      // 14e: ifnull 1a3
      // 151: aload 25
      // 153: aload 24
      // 155: ifnonnull 1a1
      // 158: goto 15f
      // 15b: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15e: athrow
      // 15f: aload 26
      // 161: bipush 0
      // 162: anewarray 4
      // 165: invokevirtual rip/breeze/classtransform/ց.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 168: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16b: ifne 17f
      // 16e: goto 175
      // 171: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 174: athrow
      // 175: aload 4
      // 177: invokestatic java/util/Collections.singletonList (Ljava/lang/Object;)Ljava/util/List;
      // 17a: areturn
      // 17b: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: new java/lang/StringBuilder
      // 182: dup
      // 183: invokespecial java/lang/StringBuilder.<init> ()V
      // 186: aload 26
      // 188: bipush 0
      // 189: anewarray 4
      // 18c: invokevirtual rip/breeze/classtransform/ց.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 18f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 192: aload 26
      // 194: bipush 0
      // 195: anewarray 4
      // 198: invokevirtual rip/breeze/classtransform/ց.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 19b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a1: astore 4
      // 1a3: aload 4
      // 1a5: aload 24
      // 1a7: ifnonnull 2e6
      // 1aa: ldc_w ":"
      // 1ad: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1b0: goto 1b7
      // 1b3: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: ifeq 2bf
      // 1ba: aload 4
      // 1bc: bipush 0
      // 1bd: aload 4
      // 1bf: bipush 58
      // 1c1: invokevirtual java/lang/String.indexOf (I)I
      // 1c4: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1c7: astore 26
      // 1c9: aload 4
      // 1cb: aload 4
      // 1cd: ldc_w ":"
      // 1d0: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 1d3: bipush 1
      // 1d4: iadd
      // 1d5: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1d8: astore 27
      // 1da: aload 1
      // 1db: lload 17
      // 1dd: aload 25
      // 1df: aload 26
      // 1e1: aload 27
      // 1e3: bipush 4
      // 1e4: anewarray 4
      // 1e7: dup_x1
      // 1e8: swap
      // 1e9: bipush 3
      // 1ea: swap
      // 1eb: aastore
      // 1ec: dup_x1
      // 1ed: swap
      // 1ee: bipush 2
      // 1ef: swap
      // 1f0: aastore
      // 1f1: dup_x1
      // 1f2: swap
      // 1f3: bipush 1
      // 1f4: swap
      // 1f5: aastore
      // 1f6: dup_x2
      // 1f7: dup_x2
      // 1f8: pop
      // 1f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fc: bipush 0
      // 1fd: swap
      // 1fe: aastore
      // 1ff: invokevirtual rip/breeze/classtransform/ô.method_004 ([Ljava/lang/Object;)Ljava/lang/String;
      // 202: astore 28
      // 204: aload 1
      // 205: lload 19
      // 207: aload 27
      // 209: bipush 2
      // 20a: anewarray 4
      // 20d: dup_x1
      // 20e: swap
      // 20f: bipush 1
      // 210: swap
      // 211: aastore
      // 212: dup_x2
      // 213: dup_x2
      // 214: pop
      // 215: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 218: bipush 0
      // 219: swap
      // 21a: aastore
      // 21b: invokevirtual rip/breeze/classtransform/ô.ÿ ([Ljava/lang/Object;)Ljava/lang/String;
      // 21e: astore 29
      // 220: aload 5
      // 222: aload 28
      // 224: aload 29
      // 226: lload 15
      // 228: bipush 4
      // 229: anewarray 4
      // 22c: dup_x2
      // 22d: dup_x2
      // 22e: pop
      // 22f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 232: bipush 3
      // 233: swap
      // 234: aastore
      // 235: dup_x1
      // 236: swap
      // 237: bipush 2
      // 238: swap
      // 239: aastore
      // 23a: dup_x1
      // 23b: swap
      // 23c: bipush 1
      // 23d: swap
      // 23e: aastore
      // 23f: dup_x1
      // 240: swap
      // 241: bipush 0
      // 242: swap
      // 243: aastore
      // 244: invokestatic rip/breeze/classtransform/MathUtil3.getÁ ([Ljava/lang/Object;)Lrip/breeze/inject/á;
      // 247: astore 30
      // 249: aload 24
      // 24b: lload 7
      // 24d: lconst_0
      // 24e: lcmp
      // 24f: iflt 2b5
      // 252: ifnonnull 2b3
      // 255: aload 30
      // 257: ifnonnull 28b
      // 25a: goto 261
      // 25d: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 260: athrow
      // 261: new rip/breeze/classtransform/զ
      // 264: dup
      // 265: aload 5
      // 267: aload 6
      // 269: new java/lang/StringBuilder
      // 26c: dup
      // 26d: invokespecial java/lang/StringBuilder.<init> ()V
      // 270: aload 28
      // 272: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 275: ldc_w ":"
      // 278: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27b: aload 29
      // 27d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 280: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 283: invokespecial rip/breeze/classtransform/զ.<init> (Lrip/breeze/inject/é;Lrip/breeze/inject/é;Ljava/lang/String;)V
      // 286: athrow
      // 287: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28a: athrow
      // 28b: aload 23
      // 28d: new java/lang/StringBuilder
      // 290: dup
      // 291: invokespecial java/lang/StringBuilder.<init> ()V
      // 294: aload 30
      // 296: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 299: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29c: ldc_w ":"
      // 29f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a2: aload 30
      // 2a4: getfield rip/breeze/inject/á.string_û_2 Ljava/lang/String;
      // 2a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ad: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2b2: pop
      // 2b3: aload 24
      // 2b5: lload 7
      // 2b7: lconst_0
      // 2b8: lcmp
      // 2b9: ifle 437
      // 2bc: ifnull 427
      // 2bf: new java/lang/StringBuilder
      // 2c2: dup
      // 2c3: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c6: aload 25
      // 2c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cb: ldc_w "."
      // 2ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d1: aload 4
      // 2d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d6: ldc_w ":"
      // 2d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2dc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2df: goto 2e6
      // 2e2: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e5: athrow
      // 2e6: astore 26
      // 2e8: aload 1
      // 2e9: bipush 1
      // 2ea: anewarray 90
      // 2ed: dup
      // 2ee: bipush 0
      // 2ef: aload 26
      // 2f1: aastore
      // 2f2: lload 11
      // 2f4: dup2_x1
      // 2f5: pop2
      // 2f6: bipush 2
      // 2f7: anewarray 4
      // 2fa: dup_x1
      // 2fb: swap
      // 2fc: bipush 1
      // 2fd: swap
      // 2fe: aastore
      // 2ff: dup_x2
      // 300: dup_x2
      // 301: pop
      // 302: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 305: bipush 0
      // 306: swap
      // 307: aastore
      // 308: invokevirtual rip/breeze/classtransform/ô.method_010 ([Ljava/lang/Object;)Ljava/util/List;
      // 30b: astore 27
      // 30d: aload 27
      // 30f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 314: astore 28
      // 316: aload 28
      // 318: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 31d: ifeq 427
      // 320: aload 28
      // 322: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 327: checkcast java/lang/String
      // 32a: astore 29
      // 32c: aload 29
      // 32e: aload 26
      // 330: invokevirtual java/lang/String.length ()I
      // 333: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 336: astore 30
      // 338: aload 1
      // 339: aload 29
      // 33b: bipush 1
      // 33c: anewarray 4
      // 33f: dup_x1
      // 340: swap
      // 341: bipush 0
      // 342: swap
      // 343: aastore
      // 344: invokevirtual rip/breeze/classtransform/ô.method_005 ([Ljava/lang/Object;)Ljava/lang/String;
      // 347: astore 31
      // 349: aconst_null
      // 34a: astore 32
      // 34c: aload 30
      // 34e: aload 24
      // 350: ifnonnull 38d
      // 353: invokevirtual java/lang/String.isEmpty ()Z
      // 356: aload 24
      // 358: ifnonnull 4e5
      // 35b: goto 362
      // 35e: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 361: athrow
      // 362: ifne 38f
      // 365: goto 36c
      // 368: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36b: athrow
      // 36c: aload 1
      // 36d: lload 19
      // 36f: aload 30
      // 371: bipush 2
      // 372: anewarray 4
      // 375: dup_x1
      // 376: swap
      // 377: bipush 1
      // 378: swap
      // 379: aastore
      // 37a: dup_x2
      // 37b: dup_x2
      // 37c: pop
      // 37d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 380: bipush 0
      // 381: swap
      // 382: aastore
      // 383: invokevirtual rip/breeze/classtransform/ô.ÿ ([Ljava/lang/Object;)Ljava/lang/String;
      // 386: goto 38d
      // 389: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38c: athrow
      // 38d: astore 32
      // 38f: aload 5
      // 391: aload 31
      // 393: aload 32
      // 395: lload 15
      // 397: bipush 4
      // 398: anewarray 4
      // 39b: dup_x2
      // 39c: dup_x2
      // 39d: pop
      // 39e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a1: bipush 3
      // 3a2: swap
      // 3a3: aastore
      // 3a4: dup_x1
      // 3a5: swap
      // 3a6: bipush 2
      // 3a7: swap
      // 3a8: aastore
      // 3a9: dup_x1
      // 3aa: swap
      // 3ab: bipush 1
      // 3ac: swap
      // 3ad: aastore
      // 3ae: dup_x1
      // 3af: swap
      // 3b0: bipush 0
      // 3b1: swap
      // 3b2: aastore
      // 3b3: invokestatic rip/breeze/classtransform/MathUtil3.getÁ ([Ljava/lang/Object;)Lrip/breeze/inject/á;
      // 3b6: astore 33
      // 3b8: aload 24
      // 3ba: lload 7
      // 3bc: lconst_0
      // 3bd: lcmp
      // 3be: iflt 424
      // 3c1: ifnonnull 422
      // 3c4: aload 33
      // 3c6: ifnonnull 3fa
      // 3c9: goto 3d0
      // 3cc: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cf: athrow
      // 3d0: new rip/breeze/classtransform/զ
      // 3d3: dup
      // 3d4: aload 5
      // 3d6: aload 6
      // 3d8: new java/lang/StringBuilder
      // 3db: dup
      // 3dc: invokespecial java/lang/StringBuilder.<init> ()V
      // 3df: aload 31
      // 3e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e4: ldc_w ":"
      // 3e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ea: aload 32
      // 3ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ef: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3f2: invokespecial rip/breeze/classtransform/զ.<init> (Lrip/breeze/inject/é;Lrip/breeze/inject/é;Ljava/lang/String;)V
      // 3f5: athrow
      // 3f6: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f9: athrow
      // 3fa: aload 23
      // 3fc: new java/lang/StringBuilder
      // 3ff: dup
      // 400: invokespecial java/lang/StringBuilder.<init> ()V
      // 403: aload 33
      // 405: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 408: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40b: ldc_w ":"
      // 40e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 411: aload 33
      // 413: getfield rip/breeze/inject/á.string_û_2 Ljava/lang/String;
      // 416: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 419: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 41c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 421: pop
      // 422: aload 24
      // 424: ifnull 316
      // 427: lload 7
      // 429: lconst_0
      // 42a: lcmp
      // 42b: ifle 598
      // 42e: lload 7
      // 430: lconst_0
      // 431: lcmp
      // 432: iflt 4d2
      // 435: aload 24
      // 437: ifnull 4d2
      // 43a: aload 3
      // 43b: invokeinterface rip/breeze/classtransform/è.method_002 ()Z 1
      // 440: goto 447
      // 443: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 446: athrow
      // 447: aload 24
      // 449: ifnonnull 4e5
      // 44c: ifeq 4d2
      // 44f: goto 456
      // 452: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 455: athrow
      // 456: aload 4
      // 458: lload 13
      // 45a: bipush 2
      // 45b: anewarray 4
      // 45e: dup_x2
      // 45f: dup_x2
      // 460: pop
      // 461: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 464: bipush 1
      // 465: swap
      // 466: aastore
      // 467: dup_x1
      // 468: swap
      // 469: bipush 0
      // 46a: swap
      // 46b: aastore
      // 46c: invokestatic rip/breeze/classtransform/MathUtil3.getՑ ([Ljava/lang/Object;)Lrip/breeze/classtransform/ց;
      // 46f: astore 25
      // 471: lload 7
      // 473: lconst_0
      // 474: lcmp
      // 475: ifle 4d2
      // 478: aload 25
      // 47a: ifnull 4d2
      // 47d: aload 5
      // 47f: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 482: aload 24
      // 484: ifnonnull 4d0
      // 487: goto 48e
      // 48a: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48d: athrow
      // 48e: aload 25
      // 490: bipush 0
      // 491: anewarray 4
      // 494: invokevirtual rip/breeze/classtransform/ց.method_001 ([Ljava/lang/Object;)Ljava/lang/String;
      // 497: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 49a: ifne 4ae
      // 49d: goto 4a4
      // 4a0: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a3: athrow
      // 4a4: aload 4
      // 4a6: invokestatic java/util/Collections.singletonList (Ljava/lang/Object;)Ljava/util/List;
      // 4a9: areturn
      // 4aa: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ad: athrow
      // 4ae: new java/lang/StringBuilder
      // 4b1: dup
      // 4b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 4b5: aload 25
      // 4b7: bipush 0
      // 4b8: anewarray 4
      // 4bb: invokevirtual rip/breeze/classtransform/ց.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 4be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c1: aload 25
      // 4c3: bipush 0
      // 4c4: anewarray 4
      // 4c7: invokevirtual rip/breeze/classtransform/ց.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 4ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4cd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4d0: astore 4
      // 4d2: aload 23
      // 4d4: aload 24
      // 4d6: ifnonnull 59a
      // 4d9: invokeinterface java/util/List.isEmpty ()Z 1
      // 4de: goto 4e5
      // 4e1: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e4: athrow
      // 4e5: ifeq 598
      // 4e8: aload 5
      // 4ea: lload 21
      // 4ec: aload 4
      // 4ee: bipush 3
      // 4ef: anewarray 4
      // 4f2: dup_x1
      // 4f3: swap
      // 4f4: bipush 2
      // 4f5: swap
      // 4f6: aastore
      // 4f7: dup_x2
      // 4f8: dup_x2
      // 4f9: pop
      // 4fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4fd: bipush 1
      // 4fe: swap
      // 4ff: aastore
      // 500: dup_x1
      // 501: swap
      // 502: bipush 0
      // 503: swap
      // 504: aastore
      // 505: invokestatic rip/breeze/classtransform/MathUtil3.getList_2 ([Ljava/lang/Object;)Ljava/util/List;
      // 508: astore 25
      // 50a: aload 25
      // 50c: aload 24
      // 50e: ifnonnull 534
      // 511: invokeinterface java/util/List.isEmpty ()Z 1
      // 516: ifeq 532
      // 519: goto 520
      // 51c: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51f: athrow
      // 520: new rip/breeze/classtransform/զ
      // 523: dup
      // 524: aload 5
      // 526: aload 6
      // 528: aload 4
      // 52a: invokespecial rip/breeze/classtransform/զ.<init> (Lrip/breeze/inject/é;Lrip/breeze/inject/é;Ljava/lang/String;)V
      // 52d: athrow
      // 52e: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 531: athrow
      // 532: aload 25
      // 534: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 539: astore 26
      // 53b: aload 26
      // 53d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 542: ifeq 598
      // 545: aload 26
      // 547: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 54c: checkcast rip/breeze/inject/á
      // 54f: astore 27
      // 551: lload 7
      // 553: lconst_0
      // 554: lcmp
      // 555: iflt 585
      // 558: aload 23
      // 55a: aload 24
      // 55c: ifnonnull 59a
      // 55f: new java/lang/StringBuilder
      // 562: dup
      // 563: invokespecial java/lang/StringBuilder.<init> ()V
      // 566: aload 27
      // 568: getfield rip/breeze/inject/á.string_ü_2 Ljava/lang/String;
      // 56b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 56e: ldc_w ":"
      // 571: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 574: aload 27
      // 576: getfield rip/breeze/inject/á.string_û_2 Ljava/lang/String;
      // 579: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 57c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 57f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 584: pop
      // 585: aload 24
      // 587: ifnull 53b
      // 58a: lload 7
      // 58c: lconst_0
      // 58d: lcmp
      // 58e: iflt 551
      // 591: goto 598
      // 594: invokestatic rip/breeze/classtransform/ê.method_005 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 597: athrow
      // 598: aload 23
      // 59a: areturn
      // try (78 -> 82): 83 rip/breeze/classtransform/դ
      // try (101 -> 112): 113 rip/breeze/classtransform/դ
      // try (138 -> 143): 144 rip/breeze/classtransform/դ
      // try (142 -> 153): 154 rip/breeze/classtransform/դ
      // try (173 -> 182): 183 rip/breeze/classtransform/դ
      // try (179 -> 191): 192 rip/breeze/classtransform/դ
      // try (185 -> 197): 197 rip/breeze/classtransform/դ
      // try (215 -> 219): 220 rip/breeze/classtransform/դ
      // try (318 -> 326): 327 rip/breeze/classtransform/դ
      // try (324 -> 345): 345 rip/breeze/classtransform/դ
      // try (362 -> 380): 381 rip/breeze/classtransform/դ
      // try (438 -> 444): 445 rip/breeze/classtransform/դ
      // try (441 -> 448): 449 rip/breeze/classtransform/դ
      // try (447 -> 469): 470 rip/breeze/classtransform/դ
      // try (503 -> 511): 512 rip/breeze/classtransform/դ
      // try (509 -> 530): 530 rip/breeze/classtransform/դ
      // try (549 -> 561): 562 rip/breeze/classtransform/դ
      // try (564 -> 567): 568 rip/breeze/classtransform/դ
      // try (588 -> 598): 599 rip/breeze/classtransform/դ
      // try (594 -> 607): 608 rip/breeze/classtransform/դ
      // try (601 -> 613): 613 rip/breeze/classtransform/դ
      // try (630 -> 634): 635 rip/breeze/classtransform/դ
      // try (662 -> 667): 668 rip/breeze/classtransform/դ
      // try (665 -> 677): 677 rip/breeze/classtransform/դ
      // try (689 -> 712): 717 rip/breeze/classtransform/դ
   }

   static {
      long var0 = 110081477100386L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "\bk\u0091\u000e\u009fùAp\u0098Ãó\u008fe\u000fº]\u001a\u0094û9\u0087t,Ê\u0011bÆ\u0001\u0080T©×r\u0002\u0095;j±v\u0090(\u009c\u0092¶ôèº\u009d5Y2^+f \u0006ÐÆêëk\u0007èÈ©\u0088¶§C±!¹S\rÎ*\u0088Çð¶\r";
      int var7 = "\bk\u0091\u000e\u009fùAp\u0098Ãó\u008fe\u000fº]\u001a\u0094û9\u0087t,Ê\u0011bÆ\u0001\u0080T©×r\u0002\u0095;j±v\u0090(\u009c\u0092¶ôèº\u009d5Y2^+f \u0006ÐÆêëk\u0007èÈ©\u0088¶§C±!¹S\rÎ*\u0088Çð¶\r"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = method_006(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_B_2 = var4;
            CONST_C_2 = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static Throwable invoke_5(Throwable var0) {
      return var0;
   }

   private static String invoke_6(byte[] var0) {
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

   private static String invoke_7(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29976;
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
            throw new RuntimeException("rip/breeze/classtransform/ê", var10);
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
         CONST_C_2[var3] = method_006(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }

   private static Object call_8(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = method_007(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite invoke_9(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("method_008".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/ê" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
