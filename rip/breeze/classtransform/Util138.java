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

public class Util138 implements IBreezeInterface {
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

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
      // 004: checkcast rip/breeze/inject/é
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
      // 015: checkcast rip/breeze/inject/BreezeClass12
      // 018: astore 5
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
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast rip/breeze/inject/ջ
      // 030: astore 8
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/util/List
      // 039: astore 9
      // 03b: pop
      // 03c: lload 3
      // 03d: dup2
      // 03e: ldc2_w 30147891789266
      // 041: lxor
      // 042: lstore 10
      // 044: dup2
      // 045: ldc2_w 121613639190775
      // 048: lxor
      // 049: lstore 12
      // 04b: pop2
      // 04c: invokestatic rip/breeze/classtransform/PlayerUtil8.getString ()Ljava/lang/String;
      // 04f: astore 14
      // 051: aload 14
      // 053: ifnull 0e2
      // 056: aload 8
      // 058: bipush 0
      // 059: anewarray 4
      // 05c: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 05f: sipush 178
      // 062: if_icmpeq 09a
      // 065: goto 06c
      // 068: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 06b: athrow
      // 06c: aload 8
      // 06e: bipush 0
      // 06f: anewarray 4
      // 072: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 075: sipush 180
      // 078: aload 14
      // 07a: lload 3
      // 07b: lconst_0
      // 07c: lcmp
      // 07d: ifle 102
      // 080: ifnull 0fa
      // 083: goto 08a
      // 086: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 089: athrow
      // 08a: lload 3
      // 08b: lconst_0
      // 08c: lcmp
      // 08d: ifle 0f3
      // 090: if_icmpne 0e7
      // 093: goto 09a
      // 096: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 099: athrow
      // 09a: aload 0
      // 09b: aload 2
      // 09c: aload 5
      // 09e: aload 6
      // 0a0: lload 10
      // 0a2: aload 7
      // 0a4: aload 8
      // 0a6: checkcast rip/breeze/inject/պ
      // 0a9: aload 9
      // 0ab: bipush 7
      // 0ad: anewarray 4
      // 0b0: dup_x1
      // 0b1: swap
      // 0b2: bipush 6
      // 0b4: swap
      // 0b5: aastore
      // 0b6: dup_x1
      // 0b7: swap
      // 0b8: bipush 5
      // 0b9: swap
      // 0ba: aastore
      // 0bb: dup_x1
      // 0bc: swap
      // 0bd: bipush 4
      // 0be: swap
      // 0bf: aastore
      // 0c0: dup_x2
      // 0c1: dup_x2
      // 0c2: pop
      // 0c3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c6: bipush 3
      // 0c7: swap
      // 0c8: aastore
      // 0c9: dup_x1
      // 0ca: swap
      // 0cb: bipush 2
      // 0cc: swap
      // 0cd: aastore
      // 0ce: dup_x1
      // 0cf: swap
      // 0d0: bipush 1
      // 0d1: swap
      // 0d2: aastore
      // 0d3: dup_x1
      // 0d4: swap
      // 0d5: bipush 0
      // 0d6: swap
      // 0d7: aastore
      // 0d8: invokespecial rip/breeze/classtransform/Util138.processAll ([Ljava/lang/Object;)V
      // 0db: goto 0e2
      // 0de: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 0e1: athrow
      // 0e2: aload 14
      // 0e4: ifnonnull 16d
      // 0e7: aload 8
      // 0e9: bipush 0
      // 0ea: anewarray 4
      // 0ed: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 0f0: sipush 179
      // 0f3: goto 0fa
      // 0f6: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 0f9: athrow
      // 0fa: lload 3
      // 0fb: lconst_0
      // 0fc: lcmp
      // 0fd: ifle 122
      // 100: aload 14
      // 102: ifnull 122
      // 105: if_icmpeq 125
      // 108: goto 10f
      // 10b: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 10e: athrow
      // 10f: aload 8
      // 111: bipush 0
      // 112: anewarray 4
      // 115: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 118: sipush 181
      // 11b: goto 122
      // 11e: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 121: athrow
      // 122: if_icmpne 16d
      // 125: aload 0
      // 126: aload 2
      // 127: lload 12
      // 129: aload 5
      // 12b: aload 6
      // 12d: aload 7
      // 12f: aload 8
      // 131: checkcast rip/breeze/inject/պ
      // 134: aload 9
      // 136: bipush 7
      // 138: anewarray 4
      // 13b: dup_x1
      // 13c: swap
      // 13d: bipush 6
      // 13f: swap
      // 140: aastore
      // 141: dup_x1
      // 142: swap
      // 143: bipush 5
      // 144: swap
      // 145: aastore
      // 146: dup_x1
      // 147: swap
      // 148: bipush 4
      // 149: swap
      // 14a: aastore
      // 14b: dup_x1
      // 14c: swap
      // 14d: bipush 3
      // 14e: swap
      // 14f: aastore
      // 150: dup_x1
      // 151: swap
      // 152: bipush 2
      // 153: swap
      // 154: aastore
      // 155: dup_x2
      // 156: dup_x2
      // 157: pop
      // 158: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15b: bipush 1
      // 15c: swap
      // 15d: aastore
      // 15e: dup_x1
      // 15f: swap
      // 160: bipush 0
      // 161: swap
      // 162: aastore
      // 163: invokespecial rip/breeze/classtransform/Util138.calculate ([Ljava/lang/Object;)V
      // 166: goto 16d
      // 169: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 16c: athrow
      // 16d: return
      // try (50 -> 58): 59 rip/breeze/classtransform/գ
      // try (52 -> 72): 73 rip/breeze/classtransform/գ
      // try (61 -> 80): 81 rip/breeze/classtransform/գ
      // try (75 -> 132): 133 rip/breeze/classtransform/գ
      // try (135 -> 142): 143 rip/breeze/classtransform/գ
      // try (145 -> 152): 153 rip/breeze/classtransform/գ
      // try (151 -> 160): 161 rip/breeze/classtransform/գ
      // try (163 -> 213): 214 rip/breeze/classtransform/գ
   }

   private void processAll(Object[] param1) {
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
      // 012: checkcast rip/breeze/inject/é
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
      // 025: checkcast rip/breeze/inject/BreezeClass12
      // 028: astore 7
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast rip/breeze/inject/պ
      // 030: astore 8
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/util/List
      // 039: astore 9
      // 03b: pop
      // 03c: getstatic rip/breeze/classtransform/Util138.encKey_a J
      // 03f: lload 5
      // 041: lxor
      // 042: lstore 5
      // 044: lload 5
      // 046: dup2
      // 047: ldc2_w 6489914727367
      // 04a: lxor
      // 04b: lstore 10
      // 04d: dup2
      // 04e: ldc2_w 47206925257671
      // 051: lxor
      // 052: lstore 12
      // 054: dup2
      // 055: ldc2_w 86844545127652
      // 058: lxor
      // 059: lstore 14
      // 05b: dup2
      // 05c: ldc2_w 102690605844434
      // 05f: lxor
      // 060: lstore 16
      // 062: dup2
      // 063: ldc2_w 133281387761995
      // 066: lxor
      // 067: lstore 18
      // 069: dup2
      // 06a: ldc2_w 28369412832267
      // 06d: lxor
      // 06e: lstore 20
      // 070: dup2
      // 071: ldc2_w 17930643157860
      // 074: lxor
      // 075: lstore 22
      // 077: dup2
      // 078: ldc2_w 15086333585265
      // 07b: lxor
      // 07c: lstore 24
      // 07e: dup2
      // 07f: ldc2_w 109441824175830
      // 082: lxor
      // 083: lstore 26
      // 085: dup2
      // 086: ldc2_w 3000664520828
      // 089: lxor
      // 08a: lstore 28
      // 08c: dup2
      // 08d: ldc2_w 82152454037022
      // 090: lxor
      // 091: lstore 30
      // 093: dup2
      // 094: ldc2_w 40904382505948
      // 097: lxor
      // 098: lstore 32
      // 09a: dup2
      // 09b: ldc2_w 45342784693953
      // 09e: lxor
      // 09f: lstore 34
      // 0a1: pop2
      // 0a2: aload 7
      // 0a4: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0a7: lload 18
      // 0a9: dup2_x1
      // 0aa: pop2
      // 0ab: bipush 2
      // 0ac: anewarray 4
      // 0af: dup_x1
      // 0b0: swap
      // 0b1: bipush 1
      // 0b2: swap
      // 0b3: aastore
      // 0b4: dup_x2
      // 0b5: dup_x2
      // 0b6: pop
      // 0b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ba: bipush 0
      // 0bb: swap
      // 0bc: aastore
      // 0bd: invokestatic rip/breeze/classtransform/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 0c0: astore 36
      // 0c2: invokestatic rip/breeze/classtransform/PlayerUtil8.getString ()Ljava/lang/String;
      // 0c5: aload 7
      // 0c7: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0ca: lload 12
      // 0cc: bipush 2
      // 0cd: anewarray 4
      // 0d0: dup_x2
      // 0d1: dup_x2
      // 0d2: pop
      // 0d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d6: bipush 1
      // 0d7: swap
      // 0d8: aastore
      // 0d9: dup_x1
      // 0da: swap
      // 0db: bipush 0
      // 0dc: swap
      // 0dd: aastore
      // 0de: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 0e1: astore 37
      // 0e3: astore 38
      // 0e5: aload 8
      // 0e7: getfield rip/breeze/inject/պ.string_å_2 Ljava/lang/String;
      // 0ea: lload 32
      // 0ec: dup2_x1
      // 0ed: pop2
      // 0ee: bipush 2
      // 0ef: anewarray 4
      // 0f2: dup_x1
      // 0f3: swap
      // 0f4: bipush 1
      // 0f5: swap
      // 0f6: aastore
      // 0f7: dup_x2
      // 0f8: dup_x2
      // 0f9: pop
      // 0fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fd: bipush 0
      // 0fe: swap
      // 0ff: aastore
      // 100: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 103: astore 39
      // 105: aload 8
      // 107: getfield rip/breeze/inject/պ.string_ç_2 Ljava/lang/String;
      // 10a: lload 32
      // 10c: dup2_x1
      // 10d: pop2
      // 10e: bipush 2
      // 10f: anewarray 4
      // 112: dup_x1
      // 113: swap
      // 114: bipush 1
      // 115: swap
      // 116: aastore
      // 117: dup_x2
      // 118: dup_x2
      // 119: pop
      // 11a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11d: bipush 0
      // 11e: swap
      // 11f: aastore
      // 120: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 123: astore 40
      // 125: aload 39
      // 127: aload 36
      // 129: lload 28
      // 12b: bipush 3
      // 12c: anewarray 4
      // 12f: dup_x2
      // 130: dup_x2
      // 131: pop
      // 132: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 135: bipush 2
      // 136: swap
      // 137: aastore
      // 138: dup_x1
      // 139: swap
      // 13a: bipush 1
      // 13b: swap
      // 13c: aastore
      // 13d: dup_x1
      // 13e: swap
      // 13f: bipush 0
      // 140: swap
      // 141: aastore
      // 142: invokestatic rip/breeze/classtransform/MathUtil3.checkCondition_3 ([Ljava/lang/Object;)Z
      // 145: aload 38
      // 147: ifnull 1c8
      // 14a: ifne 1bf
      // 14d: goto 154
      // 150: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 153: athrow
      // 154: new rip/breeze/classtransform/գ
      // 157: dup
      // 158: aload 7
      // 15a: aload 4
      // 15c: lload 24
      // 15e: sipush 30015
      // 161: ldc2_w 8590402597733441636
      // 164: lload 5
      // 166: lxor
      // 167: invokedynamic x (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util138.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 16f: aload 7
      // 171: lload 34
      // 173: bipush 2
      // 174: anewarray 4
      // 177: dup_x2
      // 178: dup_x2
      // 179: pop
      // 17a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17d: bipush 1
      // 17e: swap
      // 17f: aastore
      // 180: dup_x1
      // 181: swap
      // 182: bipush 0
      // 183: swap
      // 184: aastore
      // 185: invokestatic rip/breeze/classtransform/և.getև_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 188: lload 22
      // 18a: aload 39
      // 18c: bipush 2
      // 18d: anewarray 4
      // 190: dup_x1
      // 191: swap
      // 192: bipush 1
      // 193: swap
      // 194: aastore
      // 195: dup_x2
      // 196: dup_x2
      // 197: pop
      // 198: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19b: bipush 0
      // 19c: swap
      // 19d: aastore
      // 19e: invokevirtual rip/breeze/classtransform/և.getև_4 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 1a1: lload 26
      // 1a3: dup2_x1
      // 1a4: pop2
      // 1a5: bipush 2
      // 1a6: anewarray 4
      // 1a9: dup_x1
      // 1aa: swap
      // 1ab: bipush 1
      // 1ac: swap
      // 1ad: aastore
      // 1ae: dup_x2
      // 1af: dup_x2
      // 1b0: pop
      // 1b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b4: bipush 0
      // 1b5: swap
      // 1b6: aastore
      // 1b7: invokevirtual rip/breeze/classtransform/գ.getԳ_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 1ba: athrow
      // 1bb: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1be: athrow
      // 1bf: aload 8
      // 1c1: bipush 0
      // 1c2: anewarray 4
      // 1c5: invokevirtual rip/breeze/inject/պ.ÿ ([Ljava/lang/Object;)I
      // 1c8: aload 38
      // 1ca: lload 5
      // 1cc: lconst_0
      // 1cd: lcmp
      // 1ce: ifle 2af
      // 1d1: ifnull 2ad
      // 1d4: sipush 178
      // 1d7: if_icmpeq 2aa
      // 1da: goto 1e1
      // 1dd: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1e0: athrow
      // 1e1: bipush 1
      // 1e2: anewarray 127
      // 1e5: dup
      // 1e6: bipush 0
      // 1e7: aload 40
      // 1e9: aastore
      // 1ea: aload 37
      // 1ec: lload 10
      // 1ee: dup2_x2
      // 1ef: pop2
      // 1f0: bipush 3
      // 1f1: anewarray 4
      // 1f4: dup_x1
      // 1f5: swap
      // 1f6: bipush 2
      // 1f7: swap
      // 1f8: aastore
      // 1f9: dup_x1
      // 1fa: swap
      // 1fb: bipush 1
      // 1fc: swap
      // 1fd: aastore
      // 1fe: dup_x2
      // 1ff: dup_x2
      // 200: pop
      // 201: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 204: bipush 0
      // 205: swap
      // 206: aastore
      // 207: invokestatic rip/breeze/classtransform/MathUtil3.isValid_3 ([Ljava/lang/Object;)Z
      // 20a: aload 38
      // 20c: ifnull 335
      // 20f: goto 216
      // 212: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 215: athrow
      // 216: lload 5
      // 218: lconst_0
      // 219: lcmp
      // 21a: ifle 332
      // 21d: ifne 32d
      // 220: goto 227
      // 223: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 226: athrow
      // 227: new rip/breeze/classtransform/գ
      // 22a: dup
      // 22b: aload 7
      // 22d: aload 4
      // 22f: lload 24
      // 231: sipush 245
      // 234: ldc2_w 1169122723346896297
      // 237: lload 5
      // 239: lxor
      // 23a: invokedynamic x (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util138.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 242: aload 7
      // 244: lload 34
      // 246: bipush 2
      // 247: anewarray 4
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
      // 258: invokestatic rip/breeze/classtransform/և.getև_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 25b: aconst_null
      // 25c: lload 16
      // 25e: bipush 2
      // 25f: anewarray 4
      // 262: dup_x2
      // 263: dup_x2
      // 264: pop
      // 265: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 268: bipush 1
      // 269: swap
      // 26a: aastore
      // 26b: dup_x1
      // 26c: swap
      // 26d: bipush 0
      // 26e: swap
      // 26f: aastore
      // 270: invokevirtual rip/breeze/classtransform/և.getև_6 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 273: aload 40
      // 275: lload 16
      // 277: bipush 2
      // 278: anewarray 4
      // 27b: dup_x2
      // 27c: dup_x2
      // 27d: pop
      // 27e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 281: bipush 1
      // 282: swap
      // 283: aastore
      // 284: dup_x1
      // 285: swap
      // 286: bipush 0
      // 287: swap
      // 288: aastore
      // 289: invokevirtual rip/breeze/classtransform/և.getև_6 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 28c: lload 26
      // 28e: dup2_x1
      // 28f: pop2
      // 290: bipush 2
      // 291: anewarray 4
      // 294: dup_x1
      // 295: swap
      // 296: bipush 1
      // 297: swap
      // 298: aastore
      // 299: dup_x2
      // 29a: dup_x2
      // 29b: pop
      // 29c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29f: bipush 0
      // 2a0: swap
      // 2a1: aastore
      // 2a2: invokevirtual rip/breeze/classtransform/գ.getԳ_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 2a5: athrow
      // 2a6: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2a9: athrow
      // 2aa: aload 37
      // 2ac: arraylength
      // 2ad: aload 38
      // 2af: lload 5
      // 2b1: lconst_0
      // 2b2: lcmp
      // 2b3: iflt 337
      // 2b6: ifnull 335
      // 2b9: ifeq 32d
      // 2bc: goto 2c3
      // 2bf: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2c2: athrow
      // 2c3: new rip/breeze/classtransform/գ
      // 2c6: dup
      // 2c7: aload 7
      // 2c9: aload 4
      // 2cb: lload 24
      // 2cd: sipush 6033
      // 2d0: ldc2_w 1070536007764820684
      // 2d3: lload 5
      // 2d5: lxor
      // 2d6: invokedynamic x (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util138.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 2de: aload 7
      // 2e0: lload 34
      // 2e2: bipush 2
      // 2e3: anewarray 4
      // 2e6: dup_x2
      // 2e7: dup_x2
      // 2e8: pop
      // 2e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ec: bipush 1
      // 2ed: swap
      // 2ee: aastore
      // 2ef: dup_x1
      // 2f0: swap
      // 2f1: bipush 0
      // 2f2: swap
      // 2f3: aastore
      // 2f4: invokestatic rip/breeze/classtransform/և.getև_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 2f7: aconst_null
      // 2f8: lload 16
      // 2fa: bipush 2
      // 2fb: anewarray 4
      // 2fe: dup_x2
      // 2ff: dup_x2
      // 300: pop
      // 301: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 304: bipush 1
      // 305: swap
      // 306: aastore
      // 307: dup_x1
      // 308: swap
      // 309: bipush 0
      // 30a: swap
      // 30b: aastore
      // 30c: invokevirtual rip/breeze/classtransform/և.getև_6 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 30f: lload 26
      // 311: dup2_x1
      // 312: pop2
      // 313: bipush 2
      // 314: anewarray 4
      // 317: dup_x1
      // 318: swap
      // 319: bipush 1
      // 31a: swap
      // 31b: aastore
      // 31c: dup_x2
      // 31d: dup_x2
      // 31e: pop
      // 31f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 322: bipush 0
      // 323: swap
      // 324: aastore
      // 325: invokevirtual rip/breeze/classtransform/գ.getԳ_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 328: athrow
      // 329: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 32c: athrow
      // 32d: aload 7
      // 32f: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 332: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 335: aload 38
      // 337: lload 5
      // 339: lconst_0
      // 33a: lcmp
      // 33b: iflt 389
      // 33e: ifnull 387
      // 341: ifne 37e
      // 344: goto 34b
      // 347: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 34a: athrow
      // 34b: aload 3
      // 34c: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 34f: lload 20
      // 351: aload 8
      // 353: new rip/breeze/inject/ի
      // 356: dup
      // 357: bipush 25
      // 359: bipush 0
      // 35a: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 35d: bipush 3
      // 35e: anewarray 4
      // 361: dup_x1
      // 362: swap
      // 363: bipush 2
      // 364: swap
      // 365: aastore
      // 366: dup_x1
      // 367: swap
      // 368: bipush 1
      // 369: swap
      // 36a: aastore
      // 36b: dup_x2
      // 36c: dup_x2
      // 36d: pop
      // 36e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 371: bipush 0
      // 372: swap
      // 373: aastore
      // 374: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 377: goto 37e
      // 37a: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 37d: athrow
      // 37e: aload 8
      // 380: bipush 0
      // 381: anewarray 4
      // 384: invokevirtual rip/breeze/inject/պ.ÿ ([Ljava/lang/Object;)I
      // 387: aload 38
      // 389: ifnull 3f7
      // 38c: sipush 178
      // 38f: if_icmpeq 3f0
      // 392: goto 399
      // 395: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 398: athrow
      // 399: aload 7
      // 39b: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 39e: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 3a1: lload 5
      // 3a3: lconst_0
      // 3a4: lcmp
      // 3a5: iflt 3f7
      // 3a8: aload 38
      // 3aa: ifnull 3f7
      // 3ad: goto 3b4
      // 3b0: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 3b3: athrow
      // 3b4: ifne 3f0
      // 3b7: goto 3be
      // 3ba: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 3bd: athrow
      // 3be: aload 3
      // 3bf: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 3c2: lload 20
      // 3c4: aload 8
      // 3c6: new rip/breeze/inject/շ
      // 3c9: dup
      // 3ca: bipush 95
      // 3cc: invokespecial rip/breeze/inject/շ.<init> (I)V
      // 3cf: bipush 3
      // 3d0: anewarray 4
      // 3d3: dup_x1
      // 3d4: swap
      // 3d5: bipush 2
      // 3d6: swap
      // 3d7: aastore
      // 3d8: dup_x1
      // 3d9: swap
      // 3da: bipush 1
      // 3db: swap
      // 3dc: aastore
      // 3dd: dup_x2
      // 3de: dup_x2
      // 3df: pop
      // 3e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e3: bipush 0
      // 3e4: swap
      // 3e5: aastore
      // 3e6: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 3e9: goto 3f0
      // 3ec: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 3ef: athrow
      // 3f0: aload 39
      // 3f2: aload 36
      // 3f4: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 3f7: ifne 436
      // 3fa: aload 3
      // 3fb: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 3fe: aload 8
      // 400: new rip/breeze/inject/լ
      // 403: dup
      // 404: sipush 192
      // 407: aload 39
      // 409: bipush 0
      // 40a: anewarray 4
      // 40d: invokevirtual rip/breeze/inject/MathUtil3.buildString_3 ([Ljava/lang/Object;)Ljava/lang/String;
      // 410: invokespecial rip/breeze/inject/լ.<init> (ILjava/lang/String;)V
      // 413: lload 30
      // 415: bipush 3
      // 416: anewarray 4
      // 419: dup_x2
      // 41a: dup_x2
      // 41b: pop
      // 41c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41f: bipush 2
      // 420: swap
      // 421: aastore
      // 422: dup_x1
      // 423: swap
      // 424: bipush 1
      // 425: swap
      // 426: aastore
      // 427: dup_x1
      // 428: swap
      // 429: bipush 0
      // 42a: swap
      // 42b: aastore
      // 42c: invokevirtual rip/breeze/inject/թ.method_016 ([Ljava/lang/Object;)V
      // 42f: goto 436
      // 432: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 435: athrow
      // 436: aload 0
      // 437: aload 2
      // 438: aload 3
      // 439: lload 14
      // 43b: aload 7
      // 43d: aload 8
      // 43f: aload 9
      // 441: bipush 6
      // 443: anewarray 4
      // 446: dup_x1
      // 447: swap
      // 448: bipush 5
      // 449: swap
      // 44a: aastore
      // 44b: dup_x1
      // 44c: swap
      // 44d: bipush 4
      // 44e: swap
      // 44f: aastore
      // 450: dup_x1
      // 451: swap
      // 452: bipush 3
      // 453: swap
      // 454: aastore
      // 455: dup_x2
      // 456: dup_x2
      // 457: pop
      // 458: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 45b: bipush 2
      // 45c: swap
      // 45d: aastore
      // 45e: dup_x1
      // 45f: swap
      // 460: bipush 1
      // 461: swap
      // 462: aastore
      // 463: dup_x1
      // 464: swap
      // 465: bipush 0
      // 466: swap
      // 467: aastore
      // 468: invokespecial rip/breeze/classtransform/Util138.processAll_2 ([Ljava/lang/Object;)V
      // 46b: return
      // try (180 -> 206): 207 rip/breeze/classtransform/գ
      // try (205 -> 273): 273 rip/breeze/classtransform/գ
      // try (279 -> 287): 288 rip/breeze/classtransform/գ
      // try (285 -> 322): 323 rip/breeze/classtransform/գ
      // try (290 -> 330): 331 rip/breeze/classtransform/գ
      // try (325 -> 414): 414 rip/breeze/classtransform/գ
      // try (418 -> 425): 426 rip/breeze/classtransform/գ
      // try (424 -> 492): 492 rip/breeze/classtransform/գ
      // try (497 -> 504): 505 rip/breeze/classtransform/գ
      // try (503 -> 536): 537 rip/breeze/classtransform/գ
      // try (543 -> 547): 548 rip/breeze/classtransform/գ
      // try (545 -> 559): 560 rip/breeze/classtransform/գ
      // try (550 -> 563): 564 rip/breeze/classtransform/գ
      // try (562 -> 594): 595 rip/breeze/classtransform/գ
      // try (600 -> 633): 634 rip/breeze/classtransform/գ
   }

   private void calculate(Object[] param1) {
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
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast rip/breeze/inject/BreezeClass12
      // 018: astore 5
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
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast rip/breeze/inject/պ
      // 030: astore 8
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/util/List
      // 039: astore 9
      // 03b: pop
      // 03c: getstatic rip/breeze/classtransform/Util138.encKey_a J
      // 03f: lload 3
      // 040: lxor
      // 041: lstore 3
      // 042: lload 3
      // 043: dup2
      // 044: ldc2_w 123245003878114
      // 047: lxor
      // 048: lstore 10
      // 04a: dup2
      // 04b: ldc2_w 20498499255085
      // 04e: lxor
      // 04f: lstore 12
      // 051: dup2
      // 052: ldc2_w 104586809458402
      // 055: lxor
      // 056: lstore 14
      // 058: dup2
      // 059: ldc2_w 64923428299201
      // 05c: lxor
      // 05d: lstore 16
      // 05f: dup2
      // 060: ldc2_w 44623614948087
      // 063: lxor
      // 064: lstore 18
      // 066: dup2
      // 067: ldc2_w 14052166673518
      // 06a: lxor
      // 06b: lstore 20
      // 06d: dup2
      // 06e: ldc2_w 4131648655604
      // 071: lxor
      // 072: lstore 22
      // 074: dup2
      // 075: ldc2_w 119011386116398
      // 078: lxor
      // 079: lstore 24
      // 07b: dup2
      // 07c: ldc2_w 111870849533505
      // 07f: lxor
      // 080: lstore 26
      // 082: dup2
      // 083: ldc2_w 78119991328851
      // 086: lxor
      // 087: lstore 28
      // 089: dup2
      // 08a: ldc2_w 132253655962196
      // 08d: lxor
      // 08e: lstore 30
      // 090: dup2
      // 091: ldc2_w 24710334071795
      // 094: lxor
      // 095: lstore 32
      // 097: dup2
      // 098: ldc2_w 88802484983545
      // 09b: lxor
      // 09c: lstore 34
      // 09e: dup2
      // 09f: ldc2_w 102035725865956
      // 0a2: lxor
      // 0a3: lstore 36
      // 0a5: dup2
      // 0a6: ldc2_w 106094852948338
      // 0a9: lxor
      // 0aa: lstore 38
      // 0ac: pop2
      // 0ad: invokestatic rip/breeze/classtransform/PlayerUtil8.getString ()Ljava/lang/String;
      // 0b0: aload 7
      // 0b2: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0b5: lload 20
      // 0b7: dup2_x1
      // 0b8: pop2
      // 0b9: bipush 2
      // 0ba: anewarray 4
      // 0bd: dup_x1
      // 0be: swap
      // 0bf: bipush 1
      // 0c0: swap
      // 0c1: aastore
      // 0c2: dup_x2
      // 0c3: dup_x2
      // 0c4: pop
      // 0c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c8: bipush 0
      // 0c9: swap
      // 0ca: aastore
      // 0cb: invokestatic rip/breeze/classtransform/ջ.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 0ce: astore 40
      // 0d0: astore 41
      // 0d2: aload 7
      // 0d4: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 0d7: lload 14
      // 0d9: bipush 2
      // 0da: anewarray 4
      // 0dd: dup_x2
      // 0de: dup_x2
      // 0df: pop
      // 0e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e3: bipush 1
      // 0e4: swap
      // 0e5: aastore
      // 0e6: dup_x1
      // 0e7: swap
      // 0e8: bipush 0
      // 0e9: swap
      // 0ea: aastore
      // 0eb: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 0ee: astore 42
      // 0f0: aload 8
      // 0f2: getfield rip/breeze/inject/պ.string_å_2 Ljava/lang/String;
      // 0f5: lload 34
      // 0f7: dup2_x1
      // 0f8: pop2
      // 0f9: bipush 2
      // 0fa: anewarray 4
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
      // 10b: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 10e: astore 43
      // 110: aload 8
      // 112: getfield rip/breeze/inject/պ.string_ç_2 Ljava/lang/String;
      // 115: lload 34
      // 117: dup2_x1
      // 118: pop2
      // 119: bipush 2
      // 11a: anewarray 4
      // 11d: dup_x1
      // 11e: swap
      // 11f: bipush 1
      // 120: swap
      // 121: aastore
      // 122: dup_x2
      // 123: dup_x2
      // 124: pop
      // 125: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 128: bipush 0
      // 129: swap
      // 12a: aastore
      // 12b: invokestatic rip/breeze/classtransform/ջ.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 12e: astore 44
      // 130: aload 40
      // 132: getstatic rip/breeze/inject/MathUtil3.CONST_Ð Lrip/breeze/inject/MathUtil3;
      // 135: invokevirtual rip/breeze/inject/MathUtil3.equals (Ljava/lang/Object;)Z
      // 138: aload 41
      // 13a: ifnull 1bb
      // 13d: ifne 1b2
      // 140: goto 147
      // 143: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 146: athrow
      // 147: new rip/breeze/classtransform/գ
      // 14a: dup
      // 14b: aload 7
      // 14d: aload 6
      // 14f: lload 30
      // 151: sipush 4617
      // 154: ldc2_w 8948191979005129332
      // 157: lload 3
      // 158: lxor
      // 159: invokedynamic x (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util138.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 161: aload 7
      // 163: lload 36
      // 165: bipush 2
      // 166: anewarray 4
      // 169: dup_x2
      // 16a: dup_x2
      // 16b: pop
      // 16c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16f: bipush 1
      // 170: swap
      // 171: aastore
      // 172: dup_x1
      // 173: swap
      // 174: bipush 0
      // 175: swap
      // 176: aastore
      // 177: invokestatic rip/breeze/classtransform/և.getև_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 17a: lload 26
      // 17c: getstatic rip/breeze/inject/MathUtil3.CONST_Ð Lrip/breeze/inject/MathUtil3;
      // 17f: bipush 2
      // 180: anewarray 4
      // 183: dup_x1
      // 184: swap
      // 185: bipush 1
      // 186: swap
      // 187: aastore
      // 188: dup_x2
      // 189: dup_x2
      // 18a: pop
      // 18b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18e: bipush 0
      // 18f: swap
      // 190: aastore
      // 191: invokevirtual rip/breeze/classtransform/և.getև_4 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 194: lload 32
      // 196: dup2_x1
      // 197: pop2
      // 198: bipush 2
      // 199: anewarray 4
      // 19c: dup_x1
      // 19d: swap
      // 19e: bipush 1
      // 19f: swap
      // 1a0: aastore
      // 1a1: dup_x2
      // 1a2: dup_x2
      // 1a3: pop
      // 1a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a7: bipush 0
      // 1a8: swap
      // 1a9: aastore
      // 1aa: invokevirtual rip/breeze/classtransform/գ.getԳ_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 1ad: athrow
      // 1ae: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1b1: athrow
      // 1b2: aload 8
      // 1b4: bipush 0
      // 1b5: anewarray 4
      // 1b8: invokevirtual rip/breeze/inject/պ.ÿ ([Ljava/lang/Object;)I
      // 1bb: aload 41
      // 1bd: lload 3
      // 1be: lconst_0
      // 1bf: lcmp
      // 1c0: iflt 2d2
      // 1c3: ifnull 2d0
      // 1c6: sipush 179
      // 1c9: if_icmpeq 2a7
      // 1cc: goto 1d3
      // 1cf: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1d2: athrow
      // 1d3: bipush 2
      // 1d4: anewarray 127
      // 1d7: dup
      // 1d8: bipush 0
      // 1d9: aload 44
      // 1db: aastore
      // 1dc: dup
      // 1dd: bipush 1
      // 1de: aload 43
      // 1e0: aastore
      // 1e1: aload 42
      // 1e3: lload 10
      // 1e5: dup2_x2
      // 1e6: pop2
      // 1e7: bipush 3
      // 1e8: anewarray 4
      // 1eb: dup_x1
      // 1ec: swap
      // 1ed: bipush 2
      // 1ee: swap
      // 1ef: aastore
      // 1f0: dup_x1
      // 1f1: swap
      // 1f2: bipush 1
      // 1f3: swap
      // 1f4: aastore
      // 1f5: dup_x2
      // 1f6: dup_x2
      // 1f7: pop
      // 1f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fb: bipush 0
      // 1fc: swap
      // 1fd: aastore
      // 1fe: invokestatic rip/breeze/classtransform/MathUtil3.isValid_3 ([Ljava/lang/Object;)Z
      // 201: aload 41
      // 203: ifnull 37a
      // 206: goto 20d
      // 209: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 20c: athrow
      // 20d: ifne 361
      // 210: goto 217
      // 213: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 216: athrow
      // 217: new rip/breeze/classtransform/գ
      // 21a: dup
      // 21b: aload 7
      // 21d: aload 6
      // 21f: lload 30
      // 221: sipush 24073
      // 224: ldc2_w 2266317633583611510
      // 227: lload 3
      // 228: lxor
      // 229: invokedynamic x (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util138.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 231: aload 7
      // 233: lload 36
      // 235: bipush 2
      // 236: anewarray 4
      // 239: dup_x2
      // 23a: dup_x2
      // 23b: pop
      // 23c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23f: bipush 1
      // 240: swap
      // 241: aastore
      // 242: dup_x1
      // 243: swap
      // 244: bipush 0
      // 245: swap
      // 246: aastore
      // 247: invokestatic rip/breeze/classtransform/և.getև_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 24a: aconst_null
      // 24b: lload 18
      // 24d: bipush 2
      // 24e: anewarray 4
      // 251: dup_x2
      // 252: dup_x2
      // 253: pop
      // 254: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 257: bipush 1
      // 258: swap
      // 259: aastore
      // 25a: dup_x1
      // 25b: swap
      // 25c: bipush 0
      // 25d: swap
      // 25e: aastore
      // 25f: invokevirtual rip/breeze/classtransform/և.getև_6 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 262: bipush 2
      // 263: anewarray 127
      // 266: dup
      // 267: bipush 0
      // 268: aload 44
      // 26a: aastore
      // 26b: dup
      // 26c: bipush 1
      // 26d: aload 43
      // 26f: aastore
      // 270: lload 28
      // 272: dup2_x1
      // 273: pop2
      // 274: bipush 2
      // 275: anewarray 4
      // 278: dup_x1
      // 279: swap
      // 27a: bipush 1
      // 27b: swap
      // 27c: aastore
      // 27d: dup_x2
      // 27e: dup_x2
      // 27f: pop
      // 280: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 283: bipush 0
      // 284: swap
      // 285: aastore
      // 286: invokevirtual rip/breeze/classtransform/և.getև_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 289: lload 32
      // 28b: dup2_x1
      // 28c: pop2
      // 28d: bipush 2
      // 28e: anewarray 4
      // 291: dup_x1
      // 292: swap
      // 293: bipush 1
      // 294: swap
      // 295: aastore
      // 296: dup_x2
      // 297: dup_x2
      // 298: pop
      // 299: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29c: bipush 0
      // 29d: swap
      // 29e: aastore
      // 29f: invokevirtual rip/breeze/classtransform/գ.getԳ_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 2a2: athrow
      // 2a3: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2a6: athrow
      // 2a7: bipush 1
      // 2a8: anewarray 127
      // 2ab: dup
      // 2ac: bipush 0
      // 2ad: aload 43
      // 2af: aastore
      // 2b0: aload 42
      // 2b2: lload 10
      // 2b4: dup2_x2
      // 2b5: pop2
      // 2b6: bipush 3
      // 2b7: anewarray 4
      // 2ba: dup_x1
      // 2bb: swap
      // 2bc: bipush 2
      // 2bd: swap
      // 2be: aastore
      // 2bf: dup_x1
      // 2c0: swap
      // 2c1: bipush 1
      // 2c2: swap
      // 2c3: aastore
      // 2c4: dup_x2
      // 2c5: dup_x2
      // 2c6: pop
      // 2c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ca: bipush 0
      // 2cb: swap
      // 2cc: aastore
      // 2cd: invokestatic rip/breeze/classtransform/MathUtil3.isValid_3 ([Ljava/lang/Object;)Z
      // 2d0: aload 41
      // 2d2: ifnull 37a
      // 2d5: ifne 361
      // 2d8: goto 2df
      // 2db: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 2de: athrow
      // 2df: new rip/breeze/classtransform/գ
      // 2e2: dup
      // 2e3: aload 7
      // 2e5: aload 6
      // 2e7: lload 30
      // 2e9: sipush 27510
      // 2ec: ldc2_w 6999295167056923402
      // 2ef: lload 3
      // 2f0: lxor
      // 2f1: invokedynamic x (IJ)Ljava/lang/String; bsm=rip/breeze/classtransform/Util138.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 2f9: aload 7
      // 2fb: lload 36
      // 2fd: bipush 2
      // 2fe: anewarray 4
      // 301: dup_x2
      // 302: dup_x2
      // 303: pop
      // 304: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 307: bipush 1
      // 308: swap
      // 309: aastore
      // 30a: dup_x1
      // 30b: swap
      // 30c: bipush 0
      // 30d: swap
      // 30e: aastore
      // 30f: invokestatic rip/breeze/classtransform/և.getև_2 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 312: aconst_null
      // 313: lload 18
      // 315: bipush 2
      // 316: anewarray 4
      // 319: dup_x2
      // 31a: dup_x2
      // 31b: pop
      // 31c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31f: bipush 1
      // 320: swap
      // 321: aastore
      // 322: dup_x1
      // 323: swap
      // 324: bipush 0
      // 325: swap
      // 326: aastore
      // 327: invokevirtual rip/breeze/classtransform/և.getև_6 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 32a: aload 43
      // 32c: lload 18
      // 32e: bipush 2
      // 32f: anewarray 4
      // 332: dup_x2
      // 333: dup_x2
      // 334: pop
      // 335: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 338: bipush 1
      // 339: swap
      // 33a: aastore
      // 33b: dup_x1
      // 33c: swap
      // 33d: bipush 0
      // 33e: swap
      // 33f: aastore
      // 340: invokevirtual rip/breeze/classtransform/և.getև_6 ([Ljava/lang/Object;)Lrip/breeze/classtransform/և;
      // 343: lload 32
      // 345: dup2_x1
      // 346: pop2
      // 347: bipush 2
      // 348: anewarray 4
      // 34b: dup_x1
      // 34c: swap
      // 34d: bipush 1
      // 34e: swap
      // 34f: aastore
      // 350: dup_x2
      // 351: dup_x2
      // 352: pop
      // 353: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 356: bipush 0
      // 357: swap
      // 358: aastore
      // 359: invokevirtual rip/breeze/classtransform/գ.getԳ_7 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 35c: athrow
      // 35d: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 360: athrow
      // 361: lload 22
      // 363: aload 5
      // 365: bipush 2
      // 366: anewarray 4
      // 369: dup_x1
      // 36a: swap
      // 36b: bipush 1
      // 36c: swap
      // 36d: aastore
      // 36e: dup_x2
      // 36f: dup_x2
      // 370: pop
      // 371: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 374: bipush 0
      // 375: swap
      // 376: aastore
      // 377: invokestatic rip/breeze/classtransform/MathUtil3.calculate ([Ljava/lang/Object;)I
      // 37a: istore 45
      // 37c: iload 45
      // 37e: bipush 1
      // 37f: iadd
      // 380: istore 46
      // 382: aload 41
      // 384: lload 3
      // 385: lconst_0
      // 386: lcmp
      // 387: iflt 43c
      // 38a: ifnull 434
      // 38d: aload 8
      // 38f: bipush 0
      // 390: anewarray 4
      // 393: invokevirtual rip/breeze/inject/պ.ÿ ([Ljava/lang/Object;)I
      // 396: sipush 181
      // 399: if_icmpne 43f
      // 39c: goto 3a3
      // 39f: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 3a2: athrow
      // 3a3: aload 5
      // 3a5: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 3a8: lload 24
      // 3aa: aload 8
      // 3ac: new rip/breeze/inject/ի
      // 3af: dup
      // 3b0: lload 38
      // 3b2: aload 43
      // 3b4: bipush 2
      // 3b5: anewarray 4
      // 3b8: dup_x1
      // 3b9: swap
      // 3ba: bipush 1
      // 3bb: swap
      // 3bc: aastore
      // 3bd: dup_x2
      // 3be: dup_x2
      // 3bf: pop
      // 3c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3c3: bipush 0
      // 3c4: swap
      // 3c5: aastore
      // 3c6: invokestatic rip/breeze/classtransform/MathUtil3.getValue_4 ([Ljava/lang/Object;)I
      // 3c9: iload 46
      // 3cb: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 3ce: bipush 3
      // 3cf: anewarray 4
      // 3d2: dup_x1
      // 3d3: swap
      // 3d4: bipush 2
      // 3d5: swap
      // 3d6: aastore
      // 3d7: dup_x1
      // 3d8: swap
      // 3d9: bipush 1
      // 3da: swap
      // 3db: aastore
      // 3dc: dup_x2
      // 3dd: dup_x2
      // 3de: pop
      // 3df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e2: bipush 0
      // 3e3: swap
      // 3e4: aastore
      // 3e5: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 3e8: aload 5
      // 3ea: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 3ed: lload 24
      // 3ef: aload 8
      // 3f1: new rip/breeze/inject/ի
      // 3f4: dup
      // 3f5: lload 38
      // 3f7: aload 44
      // 3f9: bipush 2
      // 3fa: anewarray 4
      // 3fd: dup_x1
      // 3fe: swap
      // 3ff: bipush 1
      // 400: swap
      // 401: aastore
      // 402: dup_x2
      // 403: dup_x2
      // 404: pop
      // 405: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 408: bipush 0
      // 409: swap
      // 40a: aastore
      // 40b: invokestatic rip/breeze/classtransform/MathUtil3.getValue_4 ([Ljava/lang/Object;)I
      // 40e: iload 45
      // 410: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 413: bipush 3
      // 414: anewarray 4
      // 417: dup_x1
      // 418: swap
      // 419: bipush 2
      // 41a: swap
      // 41b: aastore
      // 41c: dup_x1
      // 41d: swap
      // 41e: bipush 1
      // 41f: swap
      // 420: aastore
      // 421: dup_x2
      // 422: dup_x2
      // 423: pop
      // 424: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 427: bipush 0
      // 428: swap
      // 429: aastore
      // 42a: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 42d: goto 434
      // 430: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 433: athrow
      // 434: lload 3
      // 435: lconst_0
      // 436: lcmp
      // 437: iflt 48b
      // 43a: aload 41
      // 43c: ifnonnull 48b
      // 43f: aload 5
      // 441: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 444: lload 24
      // 446: aload 8
      // 448: new rip/breeze/inject/ի
      // 44b: dup
      // 44c: lload 38
      // 44e: aload 43
      // 450: bipush 2
      // 451: anewarray 4
      // 454: dup_x1
      // 455: swap
      // 456: bipush 1
      // 457: swap
      // 458: aastore
      // 459: dup_x2
      // 45a: dup_x2
      // 45b: pop
      // 45c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 45f: bipush 0
      // 460: swap
      // 461: aastore
      // 462: invokestatic rip/breeze/classtransform/MathUtil3.getValue_4 ([Ljava/lang/Object;)I
      // 465: iload 46
      // 467: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 46a: bipush 3
      // 46b: anewarray 4
      // 46e: dup_x1
      // 46f: swap
      // 470: bipush 2
      // 471: swap
      // 472: aastore
      // 473: dup_x1
      // 474: swap
      // 475: bipush 1
      // 476: swap
      // 477: aastore
      // 478: dup_x2
      // 479: dup_x2
      // 47a: pop
      // 47b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 47e: bipush 0
      // 47f: swap
      // 480: aastore
      // 481: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 484: goto 48b
      // 487: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 48a: athrow
      // 48b: aload 7
      // 48d: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 490: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 493: lload 3
      // 494: lconst_0
      // 495: lcmp
      // 496: iflt 4e5
      // 499: aload 41
      // 49b: ifnull 4e5
      // 49e: ifne 4dc
      // 4a1: goto 4a8
      // 4a4: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 4a7: athrow
      // 4a8: aload 5
      // 4aa: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 4ad: lload 24
      // 4af: aload 8
      // 4b1: new rip/breeze/inject/ի
      // 4b4: dup
      // 4b5: bipush 25
      // 4b7: bipush 0
      // 4b8: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 4bb: bipush 3
      // 4bc: anewarray 4
      // 4bf: dup_x1
      // 4c0: swap
      // 4c1: bipush 2
      // 4c2: swap
      // 4c3: aastore
      // 4c4: dup_x1
      // 4c5: swap
      // 4c6: bipush 1
      // 4c7: swap
      // 4c8: aastore
      // 4c9: dup_x2
      // 4ca: dup_x2
      // 4cb: pop
      // 4cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4cf: bipush 0
      // 4d0: swap
      // 4d1: aastore
      // 4d2: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 4d5: goto 4dc
      // 4d8: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 4db: athrow
      // 4dc: aload 8
      // 4de: bipush 0
      // 4df: anewarray 4
      // 4e2: invokevirtual rip/breeze/inject/պ.ÿ ([Ljava/lang/Object;)I
      // 4e5: sipush 181
      // 4e8: if_icmpne 537
      // 4eb: aload 5
      // 4ed: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 4f0: lload 24
      // 4f2: aload 8
      // 4f4: new rip/breeze/inject/ի
      // 4f7: dup
      // 4f8: aload 44
      // 4fa: lload 12
      // 4fc: bipush 2
      // 4fd: anewarray 4
      // 500: dup_x2
      // 501: dup_x2
      // 502: pop
      // 503: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 506: bipush 1
      // 507: swap
      // 508: aastore
      // 509: dup_x1
      // 50a: swap
      // 50b: bipush 0
      // 50c: swap
      // 50d: aastore
      // 50e: invokestatic rip/breeze/classtransform/MathUtil3.getValue_3 ([Ljava/lang/Object;)I
      // 511: iload 45
      // 513: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 516: bipush 3
      // 517: anewarray 4
      // 51a: dup_x1
      // 51b: swap
      // 51c: bipush 2
      // 51d: swap
      // 51e: aastore
      // 51f: dup_x1
      // 520: swap
      // 521: bipush 1
      // 522: swap
      // 523: aastore
      // 524: dup_x2
      // 525: dup_x2
      // 526: pop
      // 527: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 52a: bipush 0
      // 52b: swap
      // 52c: aastore
      // 52d: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 530: goto 537
      // 533: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 536: athrow
      // 537: aload 5
      // 539: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // 53c: lload 24
      // 53e: aload 8
      // 540: new rip/breeze/inject/ի
      // 543: dup
      // 544: aload 43
      // 546: lload 12
      // 548: bipush 2
      // 549: anewarray 4
      // 54c: dup_x2
      // 54d: dup_x2
      // 54e: pop
      // 54f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 552: bipush 1
      // 553: swap
      // 554: aastore
      // 555: dup_x1
      // 556: swap
      // 557: bipush 0
      // 558: swap
      // 559: aastore
      // 55a: invokestatic rip/breeze/classtransform/MathUtil3.getValue_3 ([Ljava/lang/Object;)I
      // 55d: iload 46
      // 55f: invokespecial rip/breeze/inject/ի.<init> (II)V
      // 562: bipush 3
      // 563: anewarray 4
      // 566: dup_x1
      // 567: swap
      // 568: bipush 2
      // 569: swap
      // 56a: aastore
      // 56b: dup_x1
      // 56c: swap
      // 56d: bipush 1
      // 56e: swap
      // 56f: aastore
      // 570: dup_x2
      // 571: dup_x2
      // 572: pop
      // 573: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 576: bipush 0
      // 577: swap
      // 578: aastore
      // 579: invokevirtual rip/breeze/inject/թ.method_018 ([Ljava/lang/Object;)V
      // 57c: aload 0
      // 57d: aload 2
      // 57e: aload 5
      // 580: lload 16
      // 582: aload 7
      // 584: aload 8
      // 586: aload 9
      // 588: bipush 6
      // 58a: anewarray 4
      // 58d: dup_x1
      // 58e: swap
      // 58f: bipush 5
      // 590: swap
      // 591: aastore
      // 592: dup_x1
      // 593: swap
      // 594: bipush 4
      // 595: swap
      // 596: aastore
      // 597: dup_x1
      // 598: swap
      // 599: bipush 3
      // 59a: swap
      // 59b: aastore
      // 59c: dup_x2
      // 59d: dup_x2
      // 59e: pop
      // 59f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5a2: bipush 2
      // 5a3: swap
      // 5a4: aastore
      // 5a5: dup_x1
      // 5a6: swap
      // 5a7: bipush 1
      // 5a8: swap
      // 5a9: aastore
      // 5aa: dup_x1
      // 5ab: swap
      // 5ac: bipush 0
      // 5ad: swap
      // 5ae: aastore
      // 5af: invokespecial rip/breeze/classtransform/Util138.processAll_2 ([Ljava/lang/Object;)V
      // 5b2: return
      // try (188 -> 194): 195 rip/breeze/classtransform/գ
      // try (193 -> 261): 261 rip/breeze/classtransform/գ
      // try (267 -> 275): 276 rip/breeze/classtransform/գ
      // try (273 -> 314): 315 rip/breeze/classtransform/գ
      // try (278 -> 318): 319 rip/breeze/classtransform/գ
      // try (317 -> 413): 413 rip/breeze/classtransform/գ
      // try (445 -> 448): 449 rip/breeze/classtransform/գ
      // try (447 -> 532): 532 rip/breeze/classtransform/գ
      // try (556 -> 568): 569 rip/breeze/classtransform/գ
      // try (562 -> 661): 662 rip/breeze/classtransform/գ
      // try (664 -> 715): 716 rip/breeze/classtransform/գ
      // try (718 -> 728): 729 rip/breeze/classtransform/գ
      // try (727 -> 760): 761 rip/breeze/classtransform/գ
      // try (767 -> 814): 815 rip/breeze/classtransform/գ
   }

   private void processAll_2(Object[] param1) {
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
      // 0b: checkcast rip/breeze/inject/BreezeClass12
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
      // 1d: checkcast rip/breeze/inject/BreezeClass12
      // 20: astore 6
      // 22: dup
      // 23: bipush 4
      // 24: aaload
      // 25: checkcast rip/breeze/inject/պ
      // 28: astore 7
      // 2a: dup
      // 2b: bipush 5
      // 2c: aaload
      // 2d: checkcast java/util/List
      // 30: astore 8
      // 32: pop
      // 33: getstatic rip/breeze/classtransform/Util138.encKey_a J
      // 36: lload 4
      // 38: lxor
      // 39: lstore 4
      // 3b: lload 4
      // 3d: dup2
      // 3e: ldc2_w 120094706530136
      // 41: lxor
      // 42: lstore 9
      // 44: dup2
      // 45: ldc2_w 113740521305043
      // 48: lxor
      // 49: lstore 11
      // 4b: pop2
      // 4c: invokestatic rip/breeze/classtransform/PlayerUtil8.getString ()Ljava/lang/String;
      // 4f: astore 13
      // 51: aload 6
      // 53: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 56: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 59: ifeq 89
      // 5c: new rip/breeze/inject/կ
      // 5f: dup
      // 60: sipush 184
      // 63: aload 2
      // 64: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // 67: aload 6
      // 69: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 6c: aload 6
      // 6e: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 71: aload 2
      // 72: getfield rip/breeze/inject/é.int_û_2 I
      // 75: invokestatic java/lang/reflect/Modifier.isInterface (I)Z
      // 78: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 7b: astore 14
      // 7d: lload 4
      // 7f: lconst_0
      // 80: lcmp
      // 81: ifle f0
      // 84: aload 13
      // 86: ifnonnull c2
      // 89: new rip/breeze/inject/կ
      // 8c: dup
      // 8d: aload 2
      // 8e: getfield rip/breeze/inject/é.int_û_2 I
      // 91: invokestatic java/lang/reflect/Modifier.isInterface (I)Z
      // 94: ifeq a8
      // 97: goto 9e
      // 9a: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 9d: athrow
      // 9e: sipush 185
      // a1: goto ab
      // a4: invokestatic rip/breeze/classtransform/Util138.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // a7: athrow
      // a8: sipush 182
      // ab: aload 2
      // ac: getfield rip/breeze/inject/é.string_ú_2 Ljava/lang/String;
      // af: aload 6
      // b1: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // b4: lload 11
      // b6: dup2_x1
      // b7: pop2
      // b8: aload 6
      // ba: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // bd: invokespecial rip/breeze/inject/կ.<init> (ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
      // c0: astore 14
      // c2: aload 3
      // c3: getfield rip/breeze/inject/BreezeClass12.թ_ê Lrip/breeze/inject/թ;
      // c6: aload 7
      // c8: aload 14
      // ca: lload 9
      // cc: bipush 3
      // cd: anewarray 4
      // d0: dup_x2
      // d1: dup_x2
      // d2: pop
      // d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d6: bipush 2
      // d7: swap
      // d8: aastore
      // d9: dup_x1
      // da: swap
      // db: bipush 1
      // dc: swap
      // dd: aastore
      // de: dup_x1
      // df: swap
      // e0: bipush 0
      // e1: swap
      // e2: aastore
      // e3: invokevirtual rip/breeze/inject/թ.method_011 ([Ljava/lang/Object;)V
      // e6: aload 8
      // e8: aload 14
      // ea: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // ef: pop
      // f0: return
      // try (67 -> 79): 80 rip/breeze/classtransform/գ
      // try (73 -> 84): 84 rip/breeze/classtransform/գ
   }

   static {
      long var0 = 107599779197241L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "U\u008dÊ\u0018bª\u0082ö¦§µßdÄ cÞ2+¸´ZÓá#\u0081îz\u001d\n\fIÖâcË\u0088Ñ¼çç\u0097ýcõ\t\u0019`\nù\u008fy\u008bË¾\b(\u0084©¾ «VÚ:'ÃKW}\u0012\u001d÷\u001a¯\u0001JcÝN5è\u0018åiX[x¿?~l\t\u0017[\u0013¡@\u0005ªÉ*e`ac\fi³¸=\u0018´[ö\u001azRüK\fi\u0016,m\u0000\u001a_È\u0084¨<\u008d*òd£qmç¶T'×þc\u0092mC£äíÒ ÎñHº\u0013 t\nP\u0097½ÑJ\u0005kïÀ\u009d@=Ô%[Úÿ\r×ïß\u00adl\tÿÑñlålt\u0018Ëm©\u0087&\u0096i\u008fôØxEÄ©\u0082Q\u0081S\u009c\u0083\u008a^\u0017\u0001É§ \u0015\u0011fmû(D~&\r\u009eh\u0092ûBM\u001aáîg U";
      int var7 = "U\u008dÊ\u0018bª\u0082ö¦§µßdÄ cÞ2+¸´ZÓá#\u0081îz\u001d\n\fIÖâcË\u0088Ñ¼çç\u0097ýcõ\t\u0019`\nù\u008fy\u008bË¾\b(\u0084©¾ «VÚ:'ÃKW}\u0012\u001d÷\u001a¯\u0001JcÝN5è\u0018åiX[x¿?~l\t\u0017[\u0013¡@\u0005ªÉ*e`ac\fi³¸=\u0018´[ö\u001azRüK\fi\u0016,m\u0000\u001a_È\u0084¨<\u008d*òd£qmç¶T'×þc\u0092mC£äíÒ ÎñHº\u0013 t\nP\u0097½ÑJ\u0005kïÀ\u009d@=Ô%[Úÿ\r×ïß\u00adl\tÿÑñlålt\u0018Ëm©\u0087&\u0096i\u008fôØxEÄ©\u0082Q\u0081S\u009c\u0083\u008a^\u0017\u0001É§ \u0015\u0011fmû(D~&\r\u009eh\u0092ûBM\u001aáîg U"
         .length();
      char var8 = '8';
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
                     CONST_C = var4;
                     CONST_D = new String[6];
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

                  var6 = "åÔQ\u008dÖÄÆr÷4B2-®\u001d\u008aØ'ìã¥Ê*P6N\u008cm×\bð°\u0098\u0016ÝÙ!à®\u0005ÙFÞ\u001a0\u0095\u001dþXl'\u0085\u0019\u008d\u0013qåy\u008f\u0095|\u0003\u0091\u009b\u009b\u0088<ôÒ×?ÉÔØè¨3Íy/\u0095^!rÒÕÒ×0gÀsÖ¹(Bù»g\\Äý\u008fIâ«0á \u009f}<¥Ùï\u0083H\u008f1@ý\u0015¼eE'\u00adJðãUr«\u009e\u009b]x";
                  var7 = "åÔQ\u008dÖÄÆr÷4B2-®\u001d\u008aØ'ìã¥Ê*P6N\u008cm×\bð°\u0098\u0016ÝÙ!à®\u0005ÙFÞ\u001a0\u0095\u001dþXl'\u0085\u0019\u008d\u0013qåy\u008f\u0095|\u0003\u0091\u009b\u009b\u0088<ôÒ×?ÉÔØè¨3Íy/\u0095^!rÒÕÒ×0gÀsÖ¹(Bù»g\\Äý\u008fIâ«0á \u009f}<¥Ùï\u0083H\u008f1@ý\u0015¼eE'\u00adJðãUr«\u009e\u009b]x"
                     .length();
                  var8 = '0';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11398;
      if (CONST_D[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/g", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C[var3].getBytes("ISO-8859-1");
         CONST_D[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
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
         throw new RuntimeException("rip/breeze/classtransform/g" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
