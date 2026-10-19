package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ԝ extends ԟ<ԣ> implements IFunctional {
   public static final MathUtil3 CONST_Ý_2;
   private static final String[] CONST_E_2;
   private static final String[] CONST_F_2;
   private static final Map CONST_G_2 = new HashMap(13);

   public ԝ(long var1) {
      var1 = encKey_A_2 ^ var1;
      super(589824);
      if (this.getClass() != ԝ.class) {
         throw new IllegalStateException();
      }
   }

   protected ԝ(int var1) {
      super(var1);
   }

   public ԣ invoke_1(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/MathUtil3
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 121645819506648
      // 18: lxor
      // 19: lstore 5
      // 1b: pop2
      // 1c: invokestatic rip/breeze/inject/ԟ.method_015 ()[Ljava/lang/String;
      // 1f: astore 7
      // 21: aload 2
      // 22: aload 7
      // 24: ifnonnull 3a
      // 27: ifnonnull 39
      // 2a: goto 31
      // 2d: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: getstatic rip/breeze/inject/ԣ.CONST_Ÿ_2 Lrip/breeze/inject/ԣ;
      // 34: areturn
      // 35: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 2
      // 3a: lload 5
      // 3c: bipush 1
      // 3d: anewarray 27
      // 40: dup_x2
      // 41: dup_x2
      // 42: pop
      // 43: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 46: bipush 0
      // 47: swap
      // 48: aastore
      // 49: invokevirtual rip/breeze/inject/MathUtil3.getValue ([Ljava/lang/Object;)I
      // 4c: tableswitch 86 0 10 60 66 66 66 66 66 70 74 78 82 82
      // 88: aconst_null
      // 89: areturn
      // 8a: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: getstatic rip/breeze/inject/ԣ.CONST_Þ_2 Lrip/breeze/inject/ԣ;
      // 91: areturn
      // 92: getstatic rip/breeze/inject/ԣ.CONST_Ý_2 Lrip/breeze/inject/ԣ;
      // 95: areturn
      // 96: getstatic rip/breeze/inject/ԣ.CONST_Ü_2 Lrip/breeze/inject/ԣ;
      // 99: areturn
      // 9a: getstatic rip/breeze/inject/ԣ.CONST_Û_2 Lrip/breeze/inject/ԣ;
      // 9d: areturn
      // 9e: getstatic rip/breeze/inject/ԣ.CONST_Ú_2 Lrip/breeze/inject/ԣ;
      // a1: areturn
      // a2: new java/lang/AssertionError
      // a5: dup
      // a6: invokespecial java/lang/AssertionError.<init> ()V
      // a9: athrow
      // try (21 -> 25): 26 java/lang/IllegalStateException
      // try (24 -> 30): 30 java/lang/IllegalStateException
      // try (33 -> 47): 47 java/lang/IllegalStateException
   }

   public ԣ invoke_2(Object[] param1) throws ÿ {
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
      // 004: checkcast rip/breeze/inject/ջ
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic rip/breeze/inject/ԝ.encKey_A_2 J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 2370011520335
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 119318762091159
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 37898979523623
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 76560906498029
      // 033: lxor
      // 034: lstore 11
      // 036: pop2
      // 037: invokestatic rip/breeze/inject/ԟ.method_015 ()[Ljava/lang/String;
      // 03a: astore 13
      // 03c: aload 2
      // 03d: bipush 0
      // 03e: anewarray 27
      // 041: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 044: lookupswitch 916 21 1 180 2 212 3 212 4 212 5 212 6 212 7 212 8 212 9 216 10 216 11 220 12 220 13 220 14 224 15 224 16 228 17 228 18 232 168 842 178 846 187 881
      // 0f8: aload 0
      // 0f9: getstatic rip/breeze/inject/ԝ.CONST_Ý_2 Lrip/breeze/inject/MathUtil3;
      // 0fc: lload 7
      // 0fe: bipush 2
      // 0ff: anewarray 27
      // 102: dup_x2
      // 103: dup_x2
      // 104: pop
      // 105: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 108: bipush 1
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: bipush 0
      // 10e: swap
      // 10f: aastore
      // 110: invokevirtual rip/breeze/inject/ԝ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԣ;
      // 113: areturn
      // 114: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: getstatic rip/breeze/inject/ԣ.CONST_Þ_2 Lrip/breeze/inject/ԣ;
      // 11b: areturn
      // 11c: getstatic rip/breeze/inject/ԣ.CONST_Ü_2 Lrip/breeze/inject/ԣ;
      // 11f: areturn
      // 120: getstatic rip/breeze/inject/ԣ.CONST_Ý_2 Lrip/breeze/inject/ԣ;
      // 123: areturn
      // 124: getstatic rip/breeze/inject/ԣ.CONST_Û_2 Lrip/breeze/inject/ԣ;
      // 127: areturn
      // 128: getstatic rip/breeze/inject/ԣ.CONST_Þ_2 Lrip/breeze/inject/ԣ;
      // 12b: areturn
      // 12c: aload 2
      // 12d: checkcast rip/breeze/inject/ղ
      // 130: getfield rip/breeze/inject/ղ.object_ç_2 Ljava/lang/Object;
      // 133: astore 14
      // 135: aload 14
      // 137: instanceof java/lang/Integer
      // 13a: aload 13
      // 13c: lload 3
      // 13d: lconst_0
      // 13e: lcmp
      // 13f: ifle 15e
      // 142: ifnonnull 15c
      // 145: ifeq 157
      // 148: goto 14f
      // 14b: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14e: athrow
      // 14f: getstatic rip/breeze/inject/ԣ.CONST_Þ_2 Lrip/breeze/inject/ԣ;
      // 152: areturn
      // 153: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 156: athrow
      // 157: aload 14
      // 159: instanceof java/lang/Float
      // 15c: aload 13
      // 15e: lload 3
      // 15f: lconst_0
      // 160: lcmp
      // 161: ifle 180
      // 164: ifnonnull 17e
      // 167: ifeq 179
      // 16a: goto 171
      // 16d: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: getstatic rip/breeze/inject/ԣ.CONST_Ý_2 Lrip/breeze/inject/ԣ;
      // 174: areturn
      // 175: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 178: athrow
      // 179: aload 14
      // 17b: instanceof java/lang/Long
      // 17e: aload 13
      // 180: lload 3
      // 181: lconst_0
      // 182: lcmp
      // 183: ifle 1a2
      // 186: ifnonnull 1a0
      // 189: ifeq 19b
      // 18c: goto 193
      // 18f: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 192: athrow
      // 193: getstatic rip/breeze/inject/ԣ.CONST_Ü_2 Lrip/breeze/inject/ԣ;
      // 196: areturn
      // 197: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19a: athrow
      // 19b: aload 14
      // 19d: instanceof java/lang/Double
      // 1a0: aload 13
      // 1a2: lload 3
      // 1a3: lconst_0
      // 1a4: lcmp
      // 1a5: iflt 1c4
      // 1a8: ifnonnull 1c2
      // 1ab: ifeq 1bd
      // 1ae: goto 1b5
      // 1b1: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b4: athrow
      // 1b5: getstatic rip/breeze/inject/ԣ.CONST_Û_2 Lrip/breeze/inject/ԣ;
      // 1b8: areturn
      // 1b9: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bc: athrow
      // 1bd: aload 14
      // 1bf: instanceof java/lang/String
      // 1c2: aload 13
      // 1c4: lload 3
      // 1c5: lconst_0
      // 1c6: lcmp
      // 1c7: ifle 209
      // 1ca: ifnonnull 207
      // 1cd: ifeq 202
      // 1d0: goto 1d7
      // 1d3: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d6: athrow
      // 1d7: aload 0
      // 1d8: sipush 28814
      // 1db: ldc2_w 1293442547028752795
      // 1de: lload 3
      // 1df: lxor
      // 1e0: invokestatic rip/breeze/inject/ԝ.method_015 (IJ)Ljava/lang/String;
      // 1e3: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_6 (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 1e6: lload 7
      // 1e8: bipush 2
      // 1e9: anewarray 27
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
      // 1fa: invokevirtual rip/breeze/inject/ԝ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԣ;
      // 1fd: areturn
      // 1fe: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 201: athrow
      // 202: aload 14
      // 204: instanceof rip/breeze/inject/MathUtil3
      // 207: aload 13
      // 209: lload 3
      // 20a: lconst_0
      // 20b: lcmp
      // 20c: ifle 2fd
      // 20f: ifnonnull 2f5
      // 212: ifeq 2f0
      // 215: goto 21c
      // 218: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21b: athrow
      // 21c: aload 14
      // 21e: checkcast rip/breeze/inject/MathUtil3
      // 221: lload 5
      // 223: bipush 1
      // 224: anewarray 27
      // 227: dup_x2
      // 228: dup_x2
      // 229: pop
      // 22a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22d: bipush 0
      // 22e: swap
      // 22f: aastore
      // 230: invokevirtual rip/breeze/inject/MathUtil3.getValue ([Ljava/lang/Object;)I
      // 233: istore 15
      // 235: iload 15
      // 237: bipush 10
      // 239: aload 13
      // 23b: lload 3
      // 23c: lconst_0
      // 23d: lcmp
      // 23e: ifle 261
      // 241: ifnonnull 259
      // 244: if_icmpeq 26e
      // 247: goto 24e
      // 24a: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24d: athrow
      // 24e: iload 15
      // 250: bipush 9
      // 252: goto 259
      // 255: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 258: athrow
      // 259: lload 3
      // 25a: lconst_0
      // 25b: lcmp
      // 25c: ifle 29d
      // 25f: aload 13
      // 261: ifnonnull 29d
      // 264: if_icmpne 299
      // 267: goto 26e
      // 26a: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26d: athrow
      // 26e: aload 0
      // 26f: sipush 19105
      // 272: ldc2_w 138961576264647606
      // 275: lload 3
      // 276: lxor
      // 277: invokestatic rip/breeze/inject/ԝ.method_015 (IJ)Ljava/lang/String;
      // 27a: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_6 (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 27d: lload 7
      // 27f: bipush 2
      // 280: anewarray 27
      // 283: dup_x2
      // 284: dup_x2
      // 285: pop
      // 286: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 289: bipush 1
      // 28a: swap
      // 28b: aastore
      // 28c: dup_x1
      // 28d: swap
      // 28e: bipush 0
      // 28f: swap
      // 290: aastore
      // 291: invokevirtual rip/breeze/inject/ԝ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԣ;
      // 294: areturn
      // 295: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 298: athrow
      // 299: iload 15
      // 29b: bipush 11
      // 29d: if_icmpne 2cb
      // 2a0: aload 0
      // 2a1: sipush 29761
      // 2a4: ldc2_w 4140876179361168723
      // 2a7: lload 3
      // 2a8: lxor
      // 2a9: invokestatic rip/breeze/inject/ԝ.method_015 (IJ)Ljava/lang/String;
      // 2ac: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_6 (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 2af: lload 7
      // 2b1: bipush 2
      // 2b2: anewarray 27
      // 2b5: dup_x2
      // 2b6: dup_x2
      // 2b7: pop
      // 2b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2bb: bipush 1
      // 2bc: swap
      // 2bd: aastore
      // 2be: dup_x1
      // 2bf: swap
      // 2c0: bipush 0
      // 2c1: swap
      // 2c2: aastore
      // 2c3: invokevirtual rip/breeze/inject/ԝ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԣ;
      // 2c6: areturn
      // 2c7: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ca: athrow
      // 2cb: new rip/breeze/inject/ÿ
      // 2ce: dup
      // 2cf: aload 2
      // 2d0: aload 14
      // 2d2: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 2d5: lload 9
      // 2d7: bipush 2
      // 2d8: anewarray 27
      // 2db: dup_x2
      // 2dc: dup_x2
      // 2dd: pop
      // 2de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e1: bipush 1
      // 2e2: swap
      // 2e3: aastore
      // 2e4: dup_x1
      // 2e5: swap
      // 2e6: bipush 0
      // 2e7: swap
      // 2e8: aastore
      // 2e9: invokestatic rip/breeze/inject/ԝ.method_003 ([Ljava/lang/Object;)Ljava/lang/String;
      // 2ec: invokespecial rip/breeze/inject/ÿ.<init> (Lrip/breeze/inject/ջ;Ljava/lang/String;)V
      // 2ef: athrow
      // 2f0: aload 14
      // 2f2: instanceof rip/breeze/inject/º
      // 2f5: lload 3
      // 2f6: lconst_0
      // 2f7: lcmp
      // 2f8: iflt 33a
      // 2fb: aload 13
      // 2fd: ifnonnull 33a
      // 300: ifeq 335
      // 303: goto 30a
      // 306: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 309: athrow
      // 30a: aload 0
      // 30b: sipush 29452
      // 30e: ldc2_w 3176652757187131928
      // 311: lload 3
      // 312: lxor
      // 313: invokestatic rip/breeze/inject/ԝ.method_015 (IJ)Ljava/lang/String;
      // 316: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_6 (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 319: lload 7
      // 31b: bipush 2
      // 31c: anewarray 27
      // 31f: dup_x2
      // 320: dup_x2
      // 321: pop
      // 322: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 325: bipush 1
      // 326: swap
      // 327: aastore
      // 328: dup_x1
      // 329: swap
      // 32a: bipush 0
      // 32b: swap
      // 32c: aastore
      // 32d: invokevirtual rip/breeze/inject/ԝ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԣ;
      // 330: areturn
      // 331: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 334: athrow
      // 335: aload 14
      // 337: instanceof rip/breeze/inject/è
      // 33a: ifeq 369
      // 33d: aload 0
      // 33e: aload 14
      // 340: checkcast rip/breeze/inject/è
      // 343: bipush 0
      // 344: anewarray 27
      // 347: invokevirtual rip/breeze/inject/è.method_002 ([Ljava/lang/Object;)Ljava/lang/String;
      // 34a: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 34d: lload 7
      // 34f: bipush 2
      // 350: anewarray 27
      // 353: dup_x2
      // 354: dup_x2
      // 355: pop
      // 356: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 359: bipush 1
      // 35a: swap
      // 35b: aastore
      // 35c: dup_x1
      // 35d: swap
      // 35e: bipush 0
      // 35f: swap
      // 360: aastore
      // 361: invokevirtual rip/breeze/inject/ԝ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԣ;
      // 364: areturn
      // 365: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 368: athrow
      // 369: new rip/breeze/inject/ÿ
      // 36c: dup
      // 36d: aload 2
      // 36e: aload 14
      // 370: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 373: lload 11
      // 375: bipush 2
      // 376: anewarray 27
      // 379: dup_x2
      // 37a: dup_x2
      // 37b: pop
      // 37c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 37f: bipush 1
      // 380: swap
      // 381: aastore
      // 382: dup_x1
      // 383: swap
      // 384: bipush 0
      // 385: swap
      // 386: aastore
      // 387: invokestatic rip/breeze/inject/ԝ.method_004 ([Ljava/lang/Object;)Ljava/lang/String;
      // 38a: invokespecial rip/breeze/inject/ÿ.<init> (Lrip/breeze/inject/ջ;Ljava/lang/String;)V
      // 38d: athrow
      // 38e: getstatic rip/breeze/inject/ԣ.CONST_Ù_2 Lrip/breeze/inject/ԣ;
      // 391: areturn
      // 392: aload 0
      // 393: aload 2
      // 394: checkcast rip/breeze/inject/պ
      // 397: getfield rip/breeze/inject/պ.string_å_2 Ljava/lang/String;
      // 39a: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 39d: lload 7
      // 39f: bipush 2
      // 3a0: anewarray 27
      // 3a3: dup_x2
      // 3a4: dup_x2
      // 3a5: pop
      // 3a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a9: bipush 1
      // 3aa: swap
      // 3ab: aastore
      // 3ac: dup_x1
      // 3ad: swap
      // 3ae: bipush 0
      // 3af: swap
      // 3b0: aastore
      // 3b1: invokevirtual rip/breeze/inject/ԝ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԣ;
      // 3b4: areturn
      // 3b5: aload 0
      // 3b6: aload 2
      // 3b7: checkcast rip/breeze/inject/լ
      // 3ba: getfield rip/breeze/inject/լ.string_ç_2 Ljava/lang/String;
      // 3bd: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_6 (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 3c0: lload 7
      // 3c2: bipush 2
      // 3c3: anewarray 27
      // 3c6: dup_x2
      // 3c7: dup_x2
      // 3c8: pop
      // 3c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3cc: bipush 1
      // 3cd: swap
      // 3ce: aastore
      // 3cf: dup_x1
      // 3d0: swap
      // 3d1: bipush 0
      // 3d2: swap
      // 3d3: aastore
      // 3d4: invokevirtual rip/breeze/inject/ԝ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԣ;
      // 3d7: areturn
      // 3d8: new java/lang/AssertionError
      // 3db: dup
      // 3dc: invokespecial java/lang/AssertionError.<init> ()V
      // 3df: athrow
      // try (37 -> 61): 61 rip/breeze/inject/ÿ
      // try (77 -> 86): 87 rip/breeze/inject/ÿ
      // try (85 -> 91): 91 rip/breeze/inject/ÿ
      // try (95 -> 102): 103 rip/breeze/inject/ÿ
      // try (101 -> 107): 107 rip/breeze/inject/ÿ
      // try (111 -> 118): 119 rip/breeze/inject/ÿ
      // try (117 -> 123): 123 rip/breeze/inject/ÿ
      // try (127 -> 134): 135 rip/breeze/inject/ÿ
      // try (133 -> 139): 139 rip/breeze/inject/ÿ
      // try (143 -> 150): 151 rip/breeze/inject/ÿ
      // try (149 -> 177): 177 rip/breeze/inject/ÿ
      // try (181 -> 188): 189 rip/breeze/inject/ÿ
      // try (205 -> 214): 215 rip/breeze/inject/ÿ
      // try (213 -> 219): 220 rip/breeze/inject/ÿ
      // try (222 -> 229): 230 rip/breeze/inject/ÿ
      // try (228 -> 256): 256 rip/breeze/inject/ÿ
      // try (260 -> 285): 285 rip/breeze/inject/ÿ
      // try (312 -> 319): 320 rip/breeze/inject/ÿ
      // try (318 -> 346): 346 rip/breeze/inject/ÿ
      // try (350 -> 375): 375 rip/breeze/inject/ÿ
   }

   private static String invoke_3(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_A_2 ^ var2;
      return method_015(1325, 2312429131352940739L ^ var2) + var1;
   }

   private static String invoke_4(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_A_2 ^ var2;
      return method_015(517, 7126133216456815663L ^ var2) + var1;
   }

   public ԣ invoke_5(Object[] var1) throws ÿ {
      ջ var2 = (ջ)var1[0];
      long var3 = (Long)var1[1];
      return (ԣ)var1[2];
   }

   public ԣ invoke_6(Object[] var1) throws ÿ {
      ջ var2 = (ջ)var1[0];
      long var3 = (Long)var1[1];
      ԣ var5 = (ԣ)var1[2];
      long var6 = var3 ^ 136805186196031L;

      try {
         switch (var2.method_004(new Object[0])) {
            case 116:
            case 132:
            case 136:
            case 139:
            case 142:
            case 145:
            case 146:
            case 147:
               return ԣ.CONST_Þ_2;
            case 117:
            case 133:
            case 140:
            case 143:
               return ԣ.CONST_Ü_2;
            case 118:
            case 134:
            case 137:
            case 144:
               return ԣ.CONST_Ý_2;
            case 119:
            case 135:
            case 138:
            case 141:
               return ԣ.CONST_Û_2;
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 177:
            case 178:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 196:
            case 197:
            default:
               throw new AssertionError();
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 179:
               return null;
            case 180:
               return this.method_001(new Object[]{MathUtil3.getDataBuilder(((պ)var2).string_å_2), var6});
            case 188:
               break;
            case 189:
               return this.method_001(
                  new Object[]{MathUtil3.getDataBuilder(method_007(new Object[]{String.valueOf(MathUtil3.getDataBuilder_6(((լ)var2).string_ç_2))})), var6}
               );
            case 190:
               return ԣ.CONST_Þ_2;
            case 191:
               return null;
            case 192:
               return this.method_001(new Object[]{MathUtil3.getDataBuilder_6(((լ)var2).string_ç_2), var6});
            case 193:
               return ԣ.CONST_Þ_2;
            case 194:
            case 195:
            case 198:
            case 199:
               return null;
         }
      } catch (ÿ var9) {
         throw method_013(var9);
      }

      try {
         switch (((ն)var2).int_ç_2) {
            case 4:
               return this.method_001(new Object[]{MathUtil3.getDataBuilder(method_015(11840, 5565577390409222129L ^ var3)), var6});
            case 5:
               return this.method_001(new Object[]{MathUtil3.getDataBuilder(method_015(16833, 8659592239350507638L ^ var3)), var6});
            case 6:
               return this.method_001(new Object[]{MathUtil3.getDataBuilder(method_015(23034, 8056121911694225476L ^ var3)), var6});
            case 7:
               return this.method_001(new Object[]{MathUtil3.getDataBuilder(method_015(18047, 7619340350383583178L ^ var3)), var6});
            case 8:
               return this.method_001(new Object[]{MathUtil3.getDataBuilder(method_015(27628, 6181524716626723422L ^ var3)), var6});
            case 9:
               return this.method_001(new Object[]{MathUtil3.getDataBuilder(method_015(14685, 4900088933695885542L ^ var3)), var6});
            case 10:
               return this.method_001(new Object[]{MathUtil3.getDataBuilder(method_015(24583, 6343459369338292659L ^ var3)), var6});
            case 11:
               return this.method_001(new Object[]{MathUtil3.getDataBuilder(method_015(25511, 3312893157836212756L ^ var3)), var6});
         }
      } catch (ÿ var8) {
         throw method_013(var8);
      }

      throw new ÿ(var2, method_015(6870, 7549974613301506927L ^ var3));
   }

   private static String invoke_7(Object[] var0) {
      String var1 = (String)var0[0];
      return "[" + var1;
   }

   public ԣ invoke_8(Object[] var1) throws ÿ {
      ջ var2 = (ջ)var1[0];
      ԣ var3 = (ԣ)var1[1];
      long var4 = (Long)var1[2];
      ԣ var6 = (ԣ)var1[3];

      try {
         switch (var2.method_004(new Object[0])) {
            case 46:
            case 51:
            case 52:
            case 53:
            case 96:
            case 100:
            case 104:
            case 108:
            case 112:
            case 120:
            case 122:
            case 124:
            case 126:
            case 128:
            case 130:
               return ԣ.CONST_Þ_2;
            case 47:
            case 97:
            case 101:
            case 105:
            case 109:
            case 113:
            case 121:
            case 123:
            case 125:
            case 127:
            case 129:
            case 131:
               return ԣ.CONST_Ü_2;
            case 48:
            case 98:
            case 102:
            case 106:
            case 110:
            case 114:
               return ԣ.CONST_Ý_2;
            case 49:
            case 99:
            case 103:
            case 107:
            case 111:
            case 115:
               return ԣ.CONST_Û_2;
            case 50:
               return ԣ.CONST_Ú_2;
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 116:
            case 117:
            case 118:
            case 119:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            default:
               throw new AssertionError();
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
               return ԣ.CONST_Þ_2;
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 181:
               return null;
         }
      } catch (ÿ var7) {
         throw method_013(var7);
      }
   }

   public ԣ invoke_9(Object[] var1) throws ÿ {
      ջ var2 = (ջ)var1[0];
      ԣ var3 = (ԣ)var1[1];
      ԣ var4 = (ԣ)var1[2];
      ԣ var5 = (ԣ)var1[3];
      long var6 = (Long)var1[4];
      return null;
   }

   public ԣ invoke_10(Object[] param1) throws ÿ {
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
      // 04: checkcast rip/breeze/inject/ջ
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
      // 15: checkcast java/util/List
      // 18: astore 5
      // 1a: pop
      // 1b: lload 3
      // 1c: dup2
      // 1d: ldc2_w 38185658015723
      // 20: lxor
      // 21: lstore 6
      // 23: dup2
      // 24: ldc2_w 116068204984967
      // 27: lxor
      // 28: lstore 8
      // 2a: pop2
      // 2b: invokestatic rip/breeze/inject/ԟ.method_015 ()[Ljava/lang/String;
      // 2e: aload 2
      // 2f: bipush 0
      // 30: anewarray 27
      // 33: invokevirtual rip/breeze/inject/ջ.method_004 ([Ljava/lang/Object;)I
      // 36: istore 10
      // 38: astore 11
      // 3a: iload 10
      // 3c: sipush 197
      // 3f: aload 11
      // 41: ifnonnull 7a
      // 44: if_icmpne 75
      // 47: goto 4e
      // 4a: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: aload 0
      // 4f: aload 2
      // 50: checkcast rip/breeze/inject/ծ
      // 53: getfield rip/breeze/inject/ծ.string_ç Ljava/lang/String;
      // 56: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder (Ljava/lang/String;)Lrip/breeze/inject/MathUtil3;
      // 59: lload 6
      // 5b: bipush 2
      // 5c: anewarray 27
      // 5f: dup_x2
      // 60: dup_x2
      // 61: pop
      // 62: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 65: bipush 1
      // 66: swap
      // 67: aastore
      // 68: dup_x1
      // 69: swap
      // 6a: bipush 0
      // 6b: swap
      // 6c: aastore
      // 6d: invokevirtual rip/breeze/inject/ԝ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԣ;
      // 70: areturn
      // 71: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: iload 10
      // 77: sipush 186
      // 7a: if_icmpne b8
      // 7d: aload 0
      // 7e: aload 2
      // 7f: checkcast rip/breeze/inject/յ
      // 82: getfield rip/breeze/inject/յ.string_æ Ljava/lang/String;
      // 85: lload 8
      // 87: bipush 2
      // 88: anewarray 27
      // 8b: dup_x2
      // 8c: dup_x2
      // 8d: pop
      // 8e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 91: bipush 1
      // 92: swap
      // 93: aastore
      // 94: dup_x1
      // 95: swap
      // 96: bipush 0
      // 97: swap
      // 98: aastore
      // 99: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_10 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // 9c: lload 6
      // 9e: bipush 2
      // 9f: anewarray 27
      // a2: dup_x2
      // a3: dup_x2
      // a4: pop
      // a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a8: bipush 1
      // a9: swap
      // aa: aastore
      // ab: dup_x1
      // ac: swap
      // ad: bipush 0
      // ae: swap
      // af: aastore
      // b0: invokevirtual rip/breeze/inject/ԝ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԣ;
      // b3: areturn
      // b4: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b7: athrow
      // b8: aload 0
      // b9: aload 2
      // ba: checkcast rip/breeze/inject/կ
      // bd: getfield rip/breeze/inject/կ.string_å_2 Ljava/lang/String;
      // c0: lload 8
      // c2: bipush 2
      // c3: anewarray 27
      // c6: dup_x2
      // c7: dup_x2
      // c8: pop
      // c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // cc: bipush 1
      // cd: swap
      // ce: aastore
      // cf: dup_x1
      // d0: swap
      // d1: bipush 0
      // d2: swap
      // d3: aastore
      // d4: invokestatic rip/breeze/inject/MathUtil3.getDataBuilder_10 ([Ljava/lang/Object;)Lrip/breeze/inject/MathUtil3;
      // d7: lload 6
      // d9: bipush 2
      // da: anewarray 27
      // dd: dup_x2
      // de: dup_x2
      // df: pop
      // e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // e3: bipush 1
      // e4: swap
      // e5: aastore
      // e6: dup_x1
      // e7: swap
      // e8: bipush 0
      // e9: swap
      // ea: aastore
      // eb: invokevirtual rip/breeze/inject/ԝ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/ԣ;
      // ee: areturn
      // try (35 -> 40): 41 rip/breeze/inject/ÿ
      // try (39 -> 65): 65 rip/breeze/inject/ÿ
      // try (69 -> 107): 107 rip/breeze/inject/ÿ
   }

   public void invoke_11(Object[] var1) throws ÿ {
      ջ var2 = (ջ)var1[0];
      ԣ var3 = (ԣ)var1[1];
      long var4 = (Long)var1[2];
      ԣ var6 = (ԣ)var1[3];
   }

   public ԣ invoke_12(Object[] param1) {
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
      // 0e: checkcast rip/breeze/inject/ԣ
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast rip/breeze/inject/ԣ
      // 19: astore 5
      // 1b: pop
      // 1c: invokestatic rip/breeze/inject/ԟ.method_015 ()[Ljava/lang/String;
      // 1f: astore 6
      // 21: aload 4
      // 23: aload 6
      // 25: ifnonnull 41
      // 28: aload 5
      // 2a: invokevirtual rip/breeze/inject/ԣ.equals (Ljava/lang/Object;)Z
      // 2d: ifne 3f
      // 30: goto 37
      // 33: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: getstatic rip/breeze/inject/ԣ.CONST_Ÿ_2 Lrip/breeze/inject/ԣ;
      // 3a: areturn
      // 3b: invokestatic rip/breeze/inject/ԝ.method_013 (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 4
      // 41: areturn
      // try (20 -> 26): 27 java/lang/IllegalStateException
      // try (23 -> 31): 31 java/lang/IllegalStateException
   }

   static {
      long var0 = 35439099460135L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[16];
      int var5 = 0;
      String var6 = "q\u008b\u0016ªre°¢r4þìos1èC{GSdpP¤mpc\u000b\u000e¼Ü\\Wrc2M±\u008d\fv3d¦qî\u0091n\u0010U\u0005\u0089\u0006k=Ú\u0013\u001eÊédXNd\u0002(\b\u001b§\u001få©.\u008fê\u0013ÕÙð\u0018öK«ê#\"¤*\u001b³*Ø7ÖÑ\u000f\rf\u009a<úÝ\u0088DÔ\u0094(n/Q·\u009c$í¾\u0092f®5\u00003¬e¦Ï^\u0000y8öA>\u009d+Â2\u008bº|3PTï\u0082¡ók\u0010\u008b\u0010~$\u0095¦àD\u0004\u00ad,\u0001Çö n \u009dW¹ô\u0007\u0089ðpÿ^0KU|¸\u009a\u0085\u0085Fª\u0089\u0005\u0092\u001b\u000eP>e\u0089¹s@0\u008e+`|LÙ¿³Ià( \u0004\u0002\u0012.Å\u0011ÑÛ\u0097ÒÎGÄ³T\u008b¯\u0092SE\u009bÍ\u001e\u0018^³Â\u0014Ðnîz\u009b\u000bÞQ0¶ÂLµVµ©ªÉ\u009dE¹q}»2ÛÚ\u008e¿'&|\u001fÞ7è*,W\u0097u\u0016\u0017é¾à ´\u0091\u007fÃL\u0005\u0084\u001aÈc\u0010¸\u0012ìÒ\u0019\u001cS \u00ad\u0091Ý\u007fÄÖP\u0017\u0018ß\u0083Fûpác<§\u008e\u0099(w\u0081\u0010Ô¸`rYL\u0018\u008c\u008f\u0010 -\u0093Ñ\u0014\u0014ê\u001c\u0016î\u008d\u0013®\u0005¹G\u0010ªQ\u0000)`Z`Â;Û¤Ë\u0005\u00adx\u0081(`\u001a·DV\u008b\u0016 q?zP¼yx·\u0005ýAz\u0000äñ¸³³kú»¿µ\u0000C\u0080¨1PÕÐÕ\u0010]\u0019q\u0013ýíC¯^çr>\u0019ÿ,(";
      int var7 = "q\u008b\u0016ªre°¢r4þìos1èC{GSdpP¤mpc\u000b\u000e¼Ü\\Wrc2M±\u008d\fv3d¦qî\u0091n\u0010U\u0005\u0089\u0006k=Ú\u0013\u001eÊédXNd\u0002(\b\u001b§\u001få©.\u008fê\u0013ÕÙð\u0018öK«ê#\"¤*\u001b³*Ø7ÖÑ\u000f\rf\u009a<úÝ\u0088DÔ\u0094(n/Q·\u009c$í¾\u0092f®5\u00003¬e¦Ï^\u0000y8öA>\u009d+Â2\u008bº|3PTï\u0082¡ók\u0010\u008b\u0010~$\u0095¦àD\u0004\u00ad,\u0001Çö n \u009dW¹ô\u0007\u0089ðpÿ^0KU|¸\u009a\u0085\u0085Fª\u0089\u0005\u0092\u001b\u000eP>e\u0089¹s@0\u008e+`|LÙ¿³Ià( \u0004\u0002\u0012.Å\u0011ÑÛ\u0097ÒÎGÄ³T\u008b¯\u0092SE\u009bÍ\u001e\u0018^³Â\u0014Ðnîz\u009b\u000bÞQ0¶ÂLµVµ©ªÉ\u009dE¹q}»2ÛÚ\u008e¿'&|\u001fÞ7è*,W\u0097u\u0016\u0017é¾à ´\u0091\u007fÃL\u0005\u0084\u001aÈc\u0010¸\u0012ìÒ\u0019\u001cS \u00ad\u0091Ý\u007fÄÖP\u0017\u0018ß\u0083Fûpác<§\u008e\u0099(w\u0081\u0010Ô¸`rYL\u0018\u008c\u008f\u0010 -\u0093Ñ\u0014\u0014ê\u001c\u0016î\u008d\u0013®\u0005¹G\u0010ªQ\u0000)`Z`Â;Û¤Ë\u0005\u00adx\u0081(`\u001a·DV\u008b\u0016 q?zP¼yx·\u0005ýAz\u0000äñ¸³³kú»¿µ\u0000C\u0080¨1PÕÐÕ\u0010]\u0019q\u0013ýíC¯^çr>\u0019ÿ,("
         .length();
      char var8 = '0';
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = method_014(var11).intern();
         if ((var9 += var8) >= var7) {
            var6 = "»ù\u0091lüH]t>\r5¨Iah\u0019\u0010Õ\n#°»æ\fó¶t\u0014!\u0099v\u0000ú";
            var7 = "»ù\u0091lüH]t>\r5¨Iah\u0019\u0010Õ\n#°»æ\fó¶t\u0014!\u0099v\u0000ú".length();
            var8 = '\u0010';
            var9 = -1;

            while (true) {
               var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
               var4[var5++] = method_014(var11).intern();
               if ((var9 += var8) >= var7) {
                  CONST_E_2 = var4;
                  CONST_F_2 = new String[16];
                  CONST_Ý_2 = MathUtil3.getDataBuilder_6(method_015(31227, 6753168824132891945L ^ var0));
                  return;
               }

               var8 = var6.charAt(var9);
            }
         }

         var8 = var6.charAt(var9);
      }
   }

   private static Exception invoke_13(Exception var0) {
      return var0;
   }

   private static String invoke_14(byte[] var0) {
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

   private static String invoke_15(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14079;
      if (CONST_F_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_G_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_G_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/ԝ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_E_2[var3].getBytes("ISO-8859-1");
         CONST_F_2[var3] = method_014(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_F_2[var3];
   }
}
