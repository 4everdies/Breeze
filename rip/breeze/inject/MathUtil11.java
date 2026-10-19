package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class MathUtil11 extends Util140 {
   static final int CONST_Û = 0;
   static final int CONST_Ú = 1;
   static final int CONST_Ù = 2;
   static final int CONST_Ø = 3;
   static final int CONST_Ö = 4;
   private static final int CONST_Õ = 0;
   private static final int[] CONST_Ô;
   private final Util139 dataBuilder4_ó;
   private final int int_ò;
   private final int int_ñ;
   private final String string_ð;
   private final int int_ï;
   private final String string_î;
   private int int_í;
   private int int_ì;
   private final ð ð_ë;
   private µ µ_ê;
   private µ µ_é;
   private int int_è;
   private ð ð_ç;
   private int int_æ;
   private ð ð_å;
   private int int_ä;
   private ð ð_ã;
   private int int_â;
   private ð ð_á;
   private û û_à;
   private û û_ß;
   private õ õ_º;
   private final int int_µ;
   private final int[] arr_ª;
   private final int fieldInt_z;
   private û û_y;
   private û û_x;
   private int fieldInt_w;
   private û[] arr_v;
   private int fieldInt_u;
   private û[] arr_t;
   private û û_s;
   private û û_r;
   private ð ð_q;
   private int fieldInt_p;
   private ð ð_o;
   private õ õ_n;
   private final int fieldInt_m;
   private ª ª_l;
   private ª ª_k;
   private ª ª_j;
   private int fieldInt_i;
   private int fieldInt_h;
   private int fieldInt_g;
   private int fieldInt_f;
   private int[] arr_e;
   private int[] arr_d;
   private boolean fieldBool_c;
   private boolean fieldBool_b;
   private int fieldInt_a;
   private int int_և;
   private int int_ֆ;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_H = new HashMap(13);

   MathUtil11(long param1, Util139 param3, int param4, String param5, String param6, String param7, String[] param8, int param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 42547234299985
      // 00b: lxor
      // 00c: lstore 10
      // 00e: dup2
      // 00f: ldc2_w 86954016753558
      // 012: lxor
      // 013: lstore 12
      // 015: dup2
      // 016: ldc2_w 55569801478274
      // 019: lxor
      // 01a: lstore 14
      // 01c: dup2
      // 01d: ldc2_w 5121277570662
      // 020: lxor
      // 021: lstore 16
      // 023: dup2
      // 024: ldc2_w 63084919230890
      // 027: lxor
      // 028: lstore 18
      // 02a: pop2
      // 02b: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 02e: aload 0
      // 02f: ldc 589824
      // 031: lload 12
      // 033: invokespecial rip/breeze/inject/Util140.<init> (IJ)V
      // 036: istore 20
      // 038: aload 0
      // 039: new rip/breeze/inject/ð
      // 03c: dup
      // 03d: invokespecial rip/breeze/inject/ð.<init> ()V
      // 040: putfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 043: aload 0
      // 044: aload 3
      // 045: putfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 048: aload 0
      // 049: sipush 28067
      // 04c: ldc2_w 3151993606243275383
      // 04f: lload 1
      // 050: lxor
      // 051: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 054: aload 5
      // 056: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 059: iload 20
      // 05b: ifeq 074
      // 05e: ifeq 077
      // 061: goto 068
      // 064: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 067: athrow
      // 068: iload 4
      // 06a: ldc 262144
      // 06c: ior
      // 06d: goto 074
      // 070: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 073: athrow
      // 074: goto 079
      // 077: iload 4
      // 079: putfield rip/breeze/inject/MathUtil11.int_ò I
      // 07c: aload 0
      // 07d: aload 3
      // 07e: lload 14
      // 080: aload 5
      // 082: bipush 2
      // 083: anewarray 141
      // 086: dup_x1
      // 087: swap
      // 088: bipush 1
      // 089: swap
      // 08a: aastore
      // 08b: dup_x2
      // 08c: dup_x2
      // 08d: pop
      // 08e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 091: bipush 0
      // 092: swap
      // 093: aastore
      // 094: lload 1
      // 095: lconst_0
      // 096: lcmp
      // 097: ifle 0ff
      // 09a: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 09d: putfield rip/breeze/inject/MathUtil11.int_ñ I
      // 0a0: aload 0
      // 0a1: aload 5
      // 0a3: putfield rip/breeze/inject/MathUtil11.string_ð Ljava/lang/String;
      // 0a6: aload 0
      // 0a7: aload 3
      // 0a8: aload 6
      // 0aa: iload 20
      // 0ac: ifeq 0e9
      // 0af: lload 14
      // 0b1: dup2_x1
      // 0b2: pop2
      // 0b3: bipush 2
      // 0b4: anewarray 141
      // 0b7: dup_x1
      // 0b8: swap
      // 0b9: bipush 1
      // 0ba: swap
      // 0bb: aastore
      // 0bc: dup_x2
      // 0bd: dup_x2
      // 0be: pop
      // 0bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c2: bipush 0
      // 0c3: swap
      // 0c4: aastore
      // 0c5: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 0c8: putfield rip/breeze/inject/MathUtil11.int_ï I
      // 0cb: aload 0
      // 0cc: aload 6
      // 0ce: putfield rip/breeze/inject/MathUtil11.string_î Ljava/lang/String;
      // 0d1: aload 0
      // 0d2: aload 7
      // 0d4: ifnonnull 0e6
      // 0d7: goto 0de
      // 0da: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0dd: athrow
      // 0de: bipush 0
      // 0df: goto 102
      // 0e2: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e5: athrow
      // 0e6: aload 3
      // 0e7: aload 7
      // 0e9: lload 14
      // 0eb: dup2_x1
      // 0ec: pop2
      // 0ed: bipush 2
      // 0ee: anewarray 141
      // 0f1: dup_x1
      // 0f2: swap
      // 0f3: bipush 1
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x2
      // 0f7: dup_x2
      // 0f8: pop
      // 0f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fc: bipush 0
      // 0fd: swap
      // 0fe: aastore
      // 0ff: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 102: putfield rip/breeze/inject/MathUtil11.fieldInt_z I
      // 105: iload 20
      // 107: ifeq 1b1
      // 10a: aload 8
      // 10c: ifnull 1a5
      // 10f: goto 116
      // 112: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 115: athrow
      // 116: aload 8
      // 118: arraylength
      // 119: iload 20
      // 11b: ifeq 148
      // 11e: goto 125
      // 121: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 124: athrow
      // 125: ifle 1a5
      // 128: goto 12f
      // 12b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12e: athrow
      // 12f: aload 0
      // 130: aload 8
      // 132: arraylength
      // 133: putfield rip/breeze/inject/MathUtil11.int_µ I
      // 136: aload 0
      // 137: aload 0
      // 138: getfield rip/breeze/inject/MathUtil11.int_µ I
      // 13b: newarray 10
      // 13d: putfield rip/breeze/inject/MathUtil11.arr_ª [I
      // 140: bipush 0
      // 141: goto 148
      // 144: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 147: athrow
      // 148: istore 21
      // 14a: iload 21
      // 14c: aload 0
      // 14d: getfield rip/breeze/inject/MathUtil11.int_µ I
      // 150: if_icmpge 19a
      // 153: aload 0
      // 154: getfield rip/breeze/inject/MathUtil11.arr_ª [I
      // 157: iload 21
      // 159: aload 3
      // 15a: aload 8
      // 15c: iload 21
      // 15e: aaload
      // 15f: lload 10
      // 161: bipush 2
      // 162: anewarray 141
      // 165: dup_x2
      // 166: dup_x2
      // 167: pop
      // 168: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16b: bipush 1
      // 16c: swap
      // 16d: aastore
      // 16e: dup_x1
      // 16f: swap
      // 170: bipush 0
      // 171: swap
      // 172: aastore
      // 173: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 176: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 179: iastore
      // 17a: iinc 21 1
      // 17d: iload 20
      // 17f: lload 1
      // 180: lconst_0
      // 181: lcmp
      // 182: iflt 1be
      // 185: ifeq 1bc
      // 188: iload 20
      // 18a: ifne 14a
      // 18d: lload 1
      // 18e: lconst_0
      // 18f: lcmp
      // 190: ifle 17d
      // 193: goto 19a
      // 196: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 199: athrow
      // 19a: lload 1
      // 19b: lconst_0
      // 19c: lcmp
      // 19d: iflt 1bc
      // 1a0: iload 20
      // 1a2: ifne 1b6
      // 1a5: aload 0
      // 1a6: bipush 0
      // 1a7: putfield rip/breeze/inject/MathUtil11.int_µ I
      // 1aa: goto 1b1
      // 1ad: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b0: athrow
      // 1b1: aload 0
      // 1b2: aconst_null
      // 1b3: putfield rip/breeze/inject/MathUtil11.arr_ª [I
      // 1b6: aload 0
      // 1b7: iload 9
      // 1b9: putfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 1bc: iload 9
      // 1be: iload 20
      // 1c0: ifeq 1ef
      // 1c3: ifeq 248
      // 1c6: goto 1cd
      // 1c9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1cc: athrow
      // 1cd: lload 16
      // 1cf: aload 6
      // 1d1: bipush 2
      // 1d2: anewarray 141
      // 1d5: dup_x1
      // 1d6: swap
      // 1d7: bipush 1
      // 1d8: swap
      // 1d9: aastore
      // 1da: dup_x2
      // 1db: dup_x2
      // 1dc: pop
      // 1dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e0: bipush 0
      // 1e1: swap
      // 1e2: aastore
      // 1e3: invokestatic rip/breeze/inject/MathUtil3.clamp_4 ([Ljava/lang/Object;)I
      // 1e6: bipush 2
      // 1e7: ishr
      // 1e8: goto 1ef
      // 1eb: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ee: athrow
      // 1ef: istore 21
      // 1f1: iload 20
      // 1f3: lload 1
      // 1f4: lconst_0
      // 1f5: lcmp
      // 1f6: ifle 201
      // 1f9: ifeq 22c
      // 1fc: iload 4
      // 1fe: bipush 8
      // 200: iand
      // 201: ifeq 215
      // 204: goto 20b
      // 207: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20a: athrow
      // 20b: iinc 21 -1
      // 20e: goto 215
      // 211: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 214: athrow
      // 215: aload 0
      // 216: iload 21
      // 218: putfield rip/breeze/inject/MathUtil11.int_ì I
      // 21b: aload 0
      // 21c: iload 21
      // 21e: putfield rip/breeze/inject/MathUtil11.fieldInt_g I
      // 221: aload 0
      // 222: new rip/breeze/inject/ª
      // 225: dup
      // 226: invokespecial rip/breeze/inject/ª.<init> ()V
      // 229: putfield rip/breeze/inject/MathUtil11.ª_l Lrip/breeze/inject/ª;
      // 22c: aload 0
      // 22d: aload 0
      // 22e: getfield rip/breeze/inject/MathUtil11.ª_l Lrip/breeze/inject/ª;
      // 231: lload 18
      // 233: bipush 2
      // 234: anewarray 141
      // 237: dup_x2
      // 238: dup_x2
      // 239: pop
      // 23a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23d: bipush 1
      // 23e: swap
      // 23f: aastore
      // 240: dup_x1
      // 241: swap
      // 242: bipush 0
      // 243: swap
      // 244: aastore
      // 245: invokevirtual rip/breeze/inject/MathUtil11.processAll_3 ([Ljava/lang/Object;)V
      // 248: return
      // try (32 -> 51): 52 java/lang/IllegalArgumentException
      // try (50 -> 57): 58 java/lang/IllegalArgumentException
      // try (62 -> 120): 121 java/lang/IllegalArgumentException
      // try (95 -> 125): 125 java/lang/IllegalArgumentException
      // try (147 -> 152): 153 java/lang/IllegalArgumentException
      // try (150 -> 159): 160 java/lang/IllegalArgumentException
      // try (155 -> 163): 164 java/lang/IllegalArgumentException
      // try (162 -> 176): 177 java/lang/IllegalArgumentException
      // try (184 -> 218): 223 java/lang/IllegalArgumentException
      // try (225 -> 234): 235 java/lang/IllegalArgumentException
      // try (243 -> 247): 248 java/lang/IllegalArgumentException
      // try (246 -> 269): 270 java/lang/IllegalArgumentException
      // try (273 -> 283): 284 java/lang/IllegalArgumentException
      // try (279 -> 287): 288 java/lang/IllegalArgumentException
   }

   boolean checkCondition(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_B ^ var2;
      int var4 = Util140.getValue_2();

      try {
         if (var4 == 0) {
            return (boolean)this.int_â;
         }

         if (this.int_â > 0) {
            return true;
         }
      } catch (IllegalArgumentException var5) {
         throw getIllegalArgumentException(var5);
      }

      return false;
   }

   boolean isValid(Object[] var1) {
      return this.fieldBool_b;
   }

   public void calculate(Object[] param1) {
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
      // 04: checkcast java/lang/String
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
      // 15: checkcast java/lang/Integer
      // 18: invokevirtual java/lang/Integer.intValue ()I
      // 1b: istore 5
      // 1d: pop
      // 1e: lload 3
      // 1f: dup2
      // 20: ldc2_w 4428515582437
      // 23: lxor
      // 24: lstore 6
      // 26: dup2
      // 27: ldc2_w 134912892281689
      // 2a: lxor
      // 2b: lstore 8
      // 2d: pop2
      // 2e: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 31: istore 10
      // 33: aload 0
      // 34: getfield rip/breeze/inject/MathUtil11.ð_o Lrip/breeze/inject/ð;
      // 37: iload 10
      // 39: ifne 66
      // 3c: ifnonnull 58
      // 3f: goto 46
      // 42: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 45: athrow
      // 46: aload 0
      // 47: new rip/breeze/inject/ð
      // 4a: dup
      // 4b: invokespecial rip/breeze/inject/ð.<init> ()V
      // 4e: putfield rip/breeze/inject/MathUtil11.ð_o Lrip/breeze/inject/ð;
      // 51: goto 58
      // 54: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 57: athrow
      // 58: aload 0
      // 59: dup
      // 5a: getfield rip/breeze/inject/MathUtil11.fieldInt_p I
      // 5d: bipush 1
      // 5e: iadd
      // 5f: putfield rip/breeze/inject/MathUtil11.fieldInt_p I
      // 62: aload 0
      // 63: getfield rip/breeze/inject/MathUtil11.ð_o Lrip/breeze/inject/ð;
      // 66: aload 2
      // 67: ifnonnull 72
      // 6a: bipush 0
      // 6b: goto 8e
      // 6e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 71: athrow
      // 72: aload 0
      // 73: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 76: lload 8
      // 78: aload 2
      // 79: bipush 2
      // 7a: anewarray 141
      // 7d: dup_x1
      // 7e: swap
      // 7f: bipush 1
      // 80: swap
      // 81: aastore
      // 82: dup_x2
      // 83: dup_x2
      // 84: pop
      // 85: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 88: bipush 0
      // 89: swap
      // 8a: aastore
      // 8b: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 8e: lload 6
      // 90: bipush 2
      // 91: anewarray 141
      // 94: dup_x2
      // 95: dup_x2
      // 96: pop
      // 97: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9a: bipush 1
      // 9b: swap
      // 9c: aastore
      // 9d: dup_x1
      // 9e: swap
      // 9f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a2: bipush 0
      // a3: swap
      // a4: aastore
      // a5: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // a8: iload 5
      // aa: lload 6
      // ac: bipush 2
      // ad: anewarray 141
      // b0: dup_x2
      // b1: dup_x2
      // b2: pop
      // b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b6: bipush 1
      // b7: swap
      // b8: aastore
      // b9: dup_x1
      // ba: swap
      // bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // be: bipush 0
      // bf: swap
      // c0: aastore
      // c1: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // c4: pop
      // c5: return
      // try (31 -> 36): 37 java/lang/IllegalArgumentException
      // try (35 -> 44): 45 java/lang/IllegalArgumentException
      // try (55 -> 59): 59 java/lang/IllegalArgumentException
   }

   @Override
   public ü getÜ(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = (var2 ^ 36837949309253L) >>> 16;
      int var6 = (int)((var2 ^ 36837949309253L) << 48 >>> 48);
      this.ð_q = new ð();
      return new û(this.dataBuilder4_ó, var4, false, this.ð_q, null, (short)var6);
   }

   @Override
   public ü getÜ_2(Object[] var1) {
      String var2 = (String)var1[0];
      boolean var3 = (Boolean)var1[1];
      long var4 = (Long)var1[2];
      long var6 = var4 ^ 40369893756278L;

      try {
         if (var3) {
            Util139 var9 = this.dataBuilder4_ó;
            û var10 = this.û_y;
            return this.û_y = û.method_001(new Object[]{var6, var9, var2, var10});
         }
      } catch (IllegalArgumentException var8) {
         throw getIllegalArgumentException(var8);
      }

      Util139 var10002 = this.dataBuilder4_ó;
      û var10004 = this.û_x;
      return this.û_x = û.method_001(new Object[]{var6, var10002, var2, var10004});
   }

   @Override
   public ü getÜ_3(Object[] var1) {
      int var2 = (Integer)var1[0];
      և var3 = (և)var1[1];
      String var4 = (String)var1[2];
      long var5 = (Long)var1[3];
      boolean var7 = (Boolean)var1[4];
      long var8 = var5 ^ 90103274237678L;

      try {
         if (var7) {
            û var11 = this.û_s;
            Object[] var12 = new Object[]{null, this.dataBuilder4_ó, var2, var3, var4, var11};
            var12[0] = var8;
            return this.û_s = û.method_002(var12);
         }
      } catch (IllegalArgumentException var10) {
         throw getIllegalArgumentException(var10);
      }

      û var10006 = this.û_r;
      Object[] var10008 = new Object[]{null, this.dataBuilder4_ó, var2, var3, var4, var10006};
      var10008[0] = var8;
      return this.û_r = û.method_002(var10008);
   }

   public void calculate_18(Object[] param1) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast java/lang/Boolean
      // 1c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1f: istore 5
      // 21: pop
      // 22: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 25: istore 6
      // 27: iload 6
      // 29: lload 2
      // 2a: lconst_0
      // 2b: lcmp
      // 2c: iflt 53
      // 2f: ifne 4b
      // 32: iload 5
      // 34: ifeq 56
      // 37: goto 3e
      // 3a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3d: athrow
      // 3e: aload 0
      // 3f: iload 4
      // 41: putfield rip/breeze/inject/MathUtil11.fieldInt_w I
      // 44: goto 4b
      // 47: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: lload 2
      // 4c: lconst_0
      // 4d: lcmp
      // 4e: ifle 5c
      // 51: iload 6
      // 53: ifeq 63
      // 56: aload 0
      // 57: iload 4
      // 59: putfield rip/breeze/inject/MathUtil11.fieldInt_u I
      // 5c: goto 63
      // 5f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: return
      // try (22 -> 30): 31 java/lang/IllegalArgumentException
      // try (28 -> 36): 37 java/lang/IllegalArgumentException
      // try (39 -> 48): 49 java/lang/IllegalArgumentException
   }

   @Override
   public ü getÜ_4(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/Boolean
      // 023: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 026: istore 6
      // 028: pop
      // 029: lload 4
      // 02b: dup2
      // 02c: ldc2_w 71028356076913
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 51799727915956
      // 036: lxor
      // 037: lstore 9
      // 039: pop2
      // 03a: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 03d: istore 11
      // 03f: iload 6
      // 041: ifeq 0c4
      // 044: aload 0
      // 045: getfield rip/breeze/inject/MathUtil11.arr_v [Lrip/breeze/inject/û;
      // 048: iload 11
      // 04a: lload 4
      // 04c: lconst_0
      // 04d: lcmp
      // 04e: iflt 093
      // 051: ifne 092
      // 054: goto 05b
      // 057: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05a: athrow
      // 05b: ifnonnull 08e
      // 05e: goto 065
      // 061: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 064: athrow
      // 065: aload 0
      // 066: aload 0
      // 067: getfield rip/breeze/inject/MathUtil11.string_î Ljava/lang/String;
      // 06a: lload 7
      // 06c: bipush 2
      // 06d: anewarray 141
      // 070: dup_x2
      // 071: dup_x2
      // 072: pop
      // 073: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 076: bipush 1
      // 077: swap
      // 078: aastore
      // 079: dup_x1
      // 07a: swap
      // 07b: bipush 0
      // 07c: swap
      // 07d: aastore
      // 07e: invokestatic rip/breeze/inject/MathUtil3.clamp_3 ([Ljava/lang/Object;)I
      // 081: anewarray 238
      // 084: putfield rip/breeze/inject/MathUtil11.arr_v [Lrip/breeze/inject/û;
      // 087: goto 08e
      // 08a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08d: athrow
      // 08e: aload 0
      // 08f: getfield rip/breeze/inject/MathUtil11.arr_v [Lrip/breeze/inject/û;
      // 092: iload 2
      // 093: aload 0
      // 094: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 097: lload 9
      // 099: dup2_x1
      // 09a: pop2
      // 09b: aload 3
      // 09c: aload 0
      // 09d: getfield rip/breeze/inject/MathUtil11.arr_v [Lrip/breeze/inject/û;
      // 0a0: iload 2
      // 0a1: aaload
      // 0a2: bipush 4
      // 0a3: anewarray 141
      // 0a6: dup_x1
      // 0a7: swap
      // 0a8: bipush 3
      // 0a9: swap
      // 0aa: aastore
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: bipush 2
      // 0ae: swap
      // 0af: aastore
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
      // 0be: invokestatic rip/breeze/inject/û.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/û;
      // 0c1: dup_x2
      // 0c2: aastore
      // 0c3: areturn
      // 0c4: aload 0
      // 0c5: getfield rip/breeze/inject/MathUtil11.arr_t [Lrip/breeze/inject/û;
      // 0c8: iload 11
      // 0ca: lload 4
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: ifle 10c
      // 0d1: ifne 10b
      // 0d4: ifnonnull 107
      // 0d7: goto 0de
      // 0da: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: aload 0
      // 0e0: getfield rip/breeze/inject/MathUtil11.string_î Ljava/lang/String;
      // 0e3: lload 7
      // 0e5: bipush 2
      // 0e6: anewarray 141
      // 0e9: dup_x2
      // 0ea: dup_x2
      // 0eb: pop
      // 0ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ef: bipush 1
      // 0f0: swap
      // 0f1: aastore
      // 0f2: dup_x1
      // 0f3: swap
      // 0f4: bipush 0
      // 0f5: swap
      // 0f6: aastore
      // 0f7: invokestatic rip/breeze/inject/MathUtil3.clamp_3 ([Ljava/lang/Object;)I
      // 0fa: anewarray 238
      // 0fd: putfield rip/breeze/inject/MathUtil11.arr_t [Lrip/breeze/inject/û;
      // 100: goto 107
      // 103: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 106: athrow
      // 107: aload 0
      // 108: getfield rip/breeze/inject/MathUtil11.arr_t [Lrip/breeze/inject/û;
      // 10b: iload 2
      // 10c: aload 0
      // 10d: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 110: lload 9
      // 112: dup2_x1
      // 113: pop2
      // 114: aload 3
      // 115: aload 0
      // 116: getfield rip/breeze/inject/MathUtil11.arr_t [Lrip/breeze/inject/û;
      // 119: iload 2
      // 11a: aaload
      // 11b: bipush 4
      // 11c: anewarray 141
      // 11f: dup_x1
      // 120: swap
      // 121: bipush 3
      // 122: swap
      // 123: aastore
      // 124: dup_x1
      // 125: swap
      // 126: bipush 2
      // 127: swap
      // 128: aastore
      // 129: dup_x1
      // 12a: swap
      // 12b: bipush 1
      // 12c: swap
      // 12d: aastore
      // 12e: dup_x2
      // 12f: dup_x2
      // 130: pop
      // 131: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 134: bipush 0
      // 135: swap
      // 136: aastore
      // 137: invokestatic rip/breeze/inject/û.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/û;
      // 13a: dup_x2
      // 13b: aastore
      // 13c: areturn
      // try (37 -> 47): 48 java/lang/IllegalArgumentException
      // try (39 -> 51): 52 java/lang/IllegalArgumentException
      // try (50 -> 75): 76 java/lang/IllegalArgumentException
      // try (119 -> 128): 129 java/lang/IllegalArgumentException
      // try (127 -> 152): 153 java/lang/IllegalArgumentException
   }

   @Override
   public void processAll_6(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/õ
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 16: istore 5
      // 18: lload 3
      // 19: lconst_0
      // 1a: lcmp
      // 1b: ifle 5d
      // 1e: aload 2
      // 1f: iload 5
      // 21: ifne 56
      // 24: bipush 0
      // 25: anewarray 141
      // 28: invokevirtual rip/breeze/inject/õ.method_002 ([Ljava/lang/Object;)Z
      // 2b: ifeq 4e
      // 2e: goto 35
      // 31: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: aload 2
      // 36: aload 0
      // 37: getfield rip/breeze/inject/MathUtil11.õ_º Lrip/breeze/inject/õ;
      // 3a: putfield rip/breeze/inject/õ.õ_ý_2 Lrip/breeze/inject/õ;
      // 3d: aload 0
      // 3e: aload 2
      // 3f: putfield rip/breeze/inject/MathUtil11.õ_º Lrip/breeze/inject/õ;
      // 42: iload 5
      // 44: ifeq 62
      // 47: goto 4e
      // 4a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: aload 2
      // 4f: goto 56
      // 52: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 55: athrow
      // 56: aload 0
      // 57: getfield rip/breeze/inject/MathUtil11.õ_n Lrip/breeze/inject/õ;
      // 5a: putfield rip/breeze/inject/õ.õ_ý_2 Lrip/breeze/inject/õ;
      // 5d: aload 0
      // 5e: aload 2
      // 5f: putfield rip/breeze/inject/MathUtil11.õ_n Lrip/breeze/inject/õ;
      // 62: return
      // try (15 -> 26): 27 java/lang/IllegalArgumentException
      // try (22 -> 38): 39 java/lang/IllegalArgumentException
      // try (29 -> 42): 43 java/lang/IllegalArgumentException
   }

   public void invoke_8(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public void clamp(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Integer
      // 01b: invokevirtual java/lang/Integer.intValue ()I
      // 01e: istore 5
      // 020: dup
      // 021: bipush 3
      // 022: aaload
      // 023: checkcast [Ljava/lang/Object;
      // 026: astore 6
      // 028: dup
      // 029: bipush 4
      // 02a: aaload
      // 02b: checkcast java/lang/Integer
      // 02e: invokevirtual java/lang/Integer.intValue ()I
      // 031: istore 7
      // 033: dup
      // 034: bipush 5
      // 035: aaload
      // 036: checkcast [Ljava/lang/Object;
      // 039: astore 8
      // 03b: pop
      // 03c: lload 3
      // 03d: dup2
      // 03e: ldc2_w 39825940751262
      // 041: lxor
      // 042: lstore 9
      // 044: dup2
      // 045: ldc2_w 53418816848172
      // 048: lxor
      // 049: lstore 11
      // 04b: dup2
      // 04c: ldc2_w 91807669578798
      // 04f: lxor
      // 050: lstore 13
      // 052: dup2
      // 053: ldc2_w 91454529271165
      // 056: lxor
      // 057: lstore 15
      // 059: dup2
      // 05a: ldc2_w 38751860895603
      // 05d: lxor
      // 05e: lstore 17
      // 060: dup2
      // 061: ldc2_w 42436734282434
      // 064: lxor
      // 065: lstore 19
      // 067: dup2
      // 068: ldc2_w 69328464581623
      // 06b: lxor
      // 06c: lstore 21
      // 06e: dup2
      // 06f: ldc2_w 32733307084316
      // 072: lxor
      // 073: lstore 23
      // 075: dup2
      // 076: ldc2_w 107096193861160
      // 079: lxor
      // 07a: lstore 25
      // 07c: dup2
      // 07d: ldc2_w 30689038516342
      // 080: lxor
      // 081: lstore 27
      // 083: pop2
      // 084: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 087: istore 29
      // 089: aload 0
      // 08a: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 08d: bipush 4
      // 08e: iload 29
      // 090: ifne 0a3
      // 093: if_icmpne 09e
      // 096: goto 09d
      // 099: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09c: athrow
      // 09d: return
      // 09e: aload 0
      // 09f: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 0a2: bipush 3
      // 0a3: iload 29
      // 0a5: lload 3
      // 0a6: lconst_0
      // 0a7: lcmp
      // 0a8: ifle 1f8
      // 0ab: ifne 1f0
      // 0ae: if_icmpne 1e7
      // 0b1: goto 0b8
      // 0b4: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0bc: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 0bf: lload 3
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: ifle 13c
      // 0c5: iload 29
      // 0c7: ifne 13c
      // 0ca: goto 0d1
      // 0cd: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d0: athrow
      // 0d1: ifnonnull 15f
      // 0d4: goto 0db
      // 0d7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0df: new rip/breeze/inject/ß
      // 0e2: dup
      // 0e3: aload 0
      // 0e4: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0e7: invokespecial rip/breeze/inject/ß.<init> (Lrip/breeze/inject/ª;)V
      // 0ea: putfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 0ed: aload 0
      // 0ee: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0f1: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 0f4: aload 0
      // 0f5: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0f8: aload 0
      // 0f9: getfield rip/breeze/inject/MathUtil11.int_ò I
      // 0fc: aload 0
      // 0fd: getfield rip/breeze/inject/MathUtil11.string_î Ljava/lang/String;
      // 100: lload 11
      // 102: iload 5
      // 104: bipush 5
      // 105: anewarray 141
      // 108: dup_x1
      // 109: swap
      // 10a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10d: bipush 4
      // 10e: swap
      // 10f: aastore
      // 110: dup_x2
      // 111: dup_x2
      // 112: pop
      // 113: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 116: bipush 3
      // 117: swap
      // 118: aastore
      // 119: dup_x1
      // 11a: swap
      // 11b: bipush 2
      // 11c: swap
      // 11d: aastore
      // 11e: dup_x1
      // 11f: swap
      // 120: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 123: bipush 1
      // 124: swap
      // 125: aastore
      // 126: dup_x1
      // 127: swap
      // 128: bipush 0
      // 129: swap
      // 12a: aastore
      // 12b: invokevirtual rip/breeze/inject/à.method_007 ([Ljava/lang/Object;)V
      // 12e: aload 0
      // 12f: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 132: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 135: goto 13c
      // 138: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13b: athrow
      // 13c: aload 0
      // 13d: lload 21
      // 13f: bipush 2
      // 140: anewarray 141
      // 143: dup_x2
      // 144: dup_x2
      // 145: pop
      // 146: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 149: bipush 1
      // 14a: swap
      // 14b: aastore
      // 14c: dup_x1
      // 14d: swap
      // 14e: bipush 0
      // 14f: swap
      // 150: aastore
      // 151: invokevirtual rip/breeze/inject/à.method_024 ([Ljava/lang/Object;)V
      // 154: lload 3
      // 155: lconst_0
      // 156: lcmp
      // 157: ifle 843
      // 15a: iload 29
      // 15c: ifeq 843
      // 15f: iload 2
      // 160: lload 3
      // 161: lconst_0
      // 162: lcmp
      // 163: ifle 1e4
      // 166: bipush -1
      // 167: if_icmpne 1bd
      // 16a: goto 171
      // 16d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 170: athrow
      // 171: aload 0
      // 172: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 175: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 178: aload 0
      // 179: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 17c: iload 5
      // 17e: aload 6
      // 180: lload 19
      // 182: iload 7
      // 184: aload 8
      // 186: bipush 6
      // 188: anewarray 141
      // 18b: dup_x1
      // 18c: swap
      // 18d: bipush 5
      // 18e: swap
      // 18f: aastore
      // 190: dup_x1
      // 191: swap
      // 192: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 195: bipush 4
      // 196: swap
      // 197: aastore
      // 198: dup_x2
      // 199: dup_x2
      // 19a: pop
      // 19b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19e: bipush 3
      // 19f: swap
      // 1a0: aastore
      // 1a1: dup_x1
      // 1a2: swap
      // 1a3: bipush 2
      // 1a4: swap
      // 1a5: aastore
      // 1a6: dup_x1
      // 1a7: swap
      // 1a8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ab: bipush 1
      // 1ac: swap
      // 1ad: aastore
      // 1ae: dup_x1
      // 1af: swap
      // 1b0: bipush 0
      // 1b1: swap
      // 1b2: aastore
      // 1b3: invokevirtual rip/breeze/inject/à.method_008 ([Ljava/lang/Object;)V
      // 1b6: goto 1bd
      // 1b9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1bc: athrow
      // 1bd: aload 0
      // 1be: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 1c1: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 1c4: aload 0
      // 1c5: lload 21
      // 1c7: bipush 2
      // 1c8: anewarray 141
      // 1cb: dup_x2
      // 1cc: dup_x2
      // 1cd: pop
      // 1ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d1: bipush 1
      // 1d2: swap
      // 1d3: aastore
      // 1d4: dup_x1
      // 1d5: swap
      // 1d6: bipush 0
      // 1d7: swap
      // 1d8: aastore
      // 1d9: invokevirtual rip/breeze/inject/à.method_024 ([Ljava/lang/Object;)V
      // 1dc: lload 3
      // 1dd: lconst_0
      // 1de: lcmp
      // 1df: iflt 843
      // 1e2: iload 29
      // 1e4: ifeq 843
      // 1e7: iload 2
      // 1e8: bipush -1
      // 1e9: goto 1f0
      // 1ec: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ef: athrow
      // 1f0: lload 3
      // 1f1: lconst_0
      // 1f2: lcmp
      // 1f3: ifle 3ef
      // 1f6: iload 29
      // 1f8: ifne 3ef
      // 1fb: if_icmpne 3c9
      // 1fe: goto 205
      // 201: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 204: athrow
      // 205: aload 0
      // 206: iload 29
      // 208: lload 3
      // 209: lconst_0
      // 20a: lcmp
      // 20b: ifle 2ba
      // 20e: ifne 2b3
      // 211: goto 218
      // 214: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 217: athrow
      // 218: getfield rip/breeze/inject/MathUtil11.arr_e [I
      // 21b: ifnonnull 2ac
      // 21e: goto 225
      // 221: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 224: athrow
      // 225: aload 0
      // 226: getfield rip/breeze/inject/MathUtil11.string_î Ljava/lang/String;
      // 229: lload 27
      // 22b: dup2_x1
      // 22c: pop2
      // 22d: bipush 2
      // 22e: anewarray 141
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
      // 23f: invokestatic rip/breeze/inject/MathUtil3.clamp_4 ([Ljava/lang/Object;)I
      // 242: bipush 2
      // 243: ishr
      // 244: istore 30
      // 246: new rip/breeze/inject/à
      // 249: dup
      // 24a: new rip/breeze/inject/ª
      // 24d: dup
      // 24e: invokespecial rip/breeze/inject/ª.<init> ()V
      // 251: invokespecial rip/breeze/inject/à.<init> (Lrip/breeze/inject/ª;)V
      // 254: astore 31
      // 256: aload 31
      // 258: aload 0
      // 259: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 25c: aload 0
      // 25d: getfield rip/breeze/inject/MathUtil11.int_ò I
      // 260: aload 0
      // 261: getfield rip/breeze/inject/MathUtil11.string_î Ljava/lang/String;
      // 264: lload 11
      // 266: iload 30
      // 268: bipush 5
      // 269: anewarray 141
      // 26c: dup_x1
      // 26d: swap
      // 26e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 271: bipush 4
      // 272: swap
      // 273: aastore
      // 274: dup_x2
      // 275: dup_x2
      // 276: pop
      // 277: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27a: bipush 3
      // 27b: swap
      // 27c: aastore
      // 27d: dup_x1
      // 27e: swap
      // 27f: bipush 2
      // 280: swap
      // 281: aastore
      // 282: dup_x1
      // 283: swap
      // 284: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 287: bipush 1
      // 288: swap
      // 289: aastore
      // 28a: dup_x1
      // 28b: swap
      // 28c: bipush 0
      // 28d: swap
      // 28e: aastore
      // 28f: invokevirtual rip/breeze/inject/à.method_007 ([Ljava/lang/Object;)V
      // 292: aload 31
      // 294: aload 0
      // 295: lload 21
      // 297: bipush 2
      // 298: anewarray 141
      // 29b: dup_x2
      // 29c: dup_x2
      // 29d: pop
      // 29e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a1: bipush 1
      // 2a2: swap
      // 2a3: aastore
      // 2a4: dup_x1
      // 2a5: swap
      // 2a6: bipush 0
      // 2a7: swap
      // 2a8: aastore
      // 2a9: invokevirtual rip/breeze/inject/à.method_024 ([Ljava/lang/Object;)V
      // 2ac: aload 0
      // 2ad: iload 5
      // 2af: putfield rip/breeze/inject/MathUtil11.fieldInt_g I
      // 2b2: aload 0
      // 2b3: aload 0
      // 2b4: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 2b7: getfield rip/breeze/inject/ð.int_þ_2 I
      // 2ba: lload 23
      // 2bc: dup2_x1
      // 2bd: pop2
      // 2be: iload 5
      // 2c0: iload 7
      // 2c2: bipush 4
      // 2c3: anewarray 141
      // 2c6: dup_x1
      // 2c7: swap
      // 2c8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2cb: bipush 3
      // 2cc: swap
      // 2cd: aastore
      // 2ce: dup_x1
      // 2cf: swap
      // 2d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2d3: bipush 2
      // 2d4: swap
      // 2d5: aastore
      // 2d6: dup_x1
      // 2d7: swap
      // 2d8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2db: bipush 1
      // 2dc: swap
      // 2dd: aastore
      // 2de: dup_x2
      // 2df: dup_x2
      // 2e0: pop
      // 2e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e4: bipush 0
      // 2e5: swap
      // 2e6: aastore
      // 2e7: invokevirtual rip/breeze/inject/MathUtil11.calculate_19 ([Ljava/lang/Object;)I
      // 2ea: istore 30
      // 2ec: bipush 0
      // 2ed: istore 31
      // 2ef: iload 31
      // 2f1: iload 5
      // 2f3: if_icmpge 345
      // 2f6: aload 0
      // 2f7: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 2fa: iload 30
      // 2fc: iinc 30 1
      // 2ff: aload 0
      // 300: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 303: aload 6
      // 305: iload 31
      // 307: aaload
      // 308: lload 9
      // 30a: bipush 3
      // 30b: anewarray 141
      // 30e: dup_x2
      // 30f: dup_x2
      // 310: pop
      // 311: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 314: bipush 2
      // 315: swap
      // 316: aastore
      // 317: dup_x1
      // 318: swap
      // 319: bipush 1
      // 31a: swap
      // 31b: aastore
      // 31c: dup_x1
      // 31d: swap
      // 31e: bipush 0
      // 31f: swap
      // 320: aastore
      // 321: invokestatic rip/breeze/inject/à.method_002 ([Ljava/lang/Object;)I
      // 324: iastore
      // 325: iinc 31 1
      // 328: iload 29
      // 32a: lload 3
      // 32b: lconst_0
      // 32c: lcmp
      // 32d: ifle 350
      // 330: ifne 348
      // 333: iload 29
      // 335: ifeq 2ef
      // 338: lload 3
      // 339: lconst_0
      // 33a: lcmp
      // 33b: iflt 328
      // 33e: goto 345
      // 341: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 344: athrow
      // 345: bipush 0
      // 346: istore 31
      // 348: lload 3
      // 349: lconst_0
      // 34a: lcmp
      // 34b: ifle 3be
      // 34e: iload 31
      // 350: iload 7
      // 352: if_icmpge 3ab
      // 355: aload 0
      // 356: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 359: iload 30
      // 35b: iinc 30 1
      // 35e: aload 0
      // 35f: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 362: aload 8
      // 364: iload 31
      // 366: aaload
      // 367: lload 9
      // 369: bipush 3
      // 36a: anewarray 141
      // 36d: dup_x2
      // 36e: dup_x2
      // 36f: pop
      // 370: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 373: bipush 2
      // 374: swap
      // 375: aastore
      // 376: dup_x1
      // 377: swap
      // 378: bipush 1
      // 379: swap
      // 37a: aastore
      // 37b: dup_x1
      // 37c: swap
      // 37d: bipush 0
      // 37e: swap
      // 37f: aastore
      // 380: invokestatic rip/breeze/inject/à.method_002 ([Ljava/lang/Object;)I
      // 383: iastore
      // 384: iinc 31 1
      // 387: iload 29
      // 389: lload 3
      // 38a: lconst_0
      // 38b: lcmp
      // 38c: iflt 3c6
      // 38f: ifne 3be
      // 392: goto 399
      // 395: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 398: athrow
      // 399: iload 29
      // 39b: ifeq 348
      // 39e: lload 3
      // 39f: lconst_0
      // 3a0: lcmp
      // 3a1: ifle 348
      // 3a4: goto 3ab
      // 3a7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3aa: athrow
      // 3ab: aload 0
      // 3ac: lload 25
      // 3ae: bipush 1
      // 3af: anewarray 141
      // 3b2: dup_x2
      // 3b3: dup_x2
      // 3b4: pop
      // 3b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b8: bipush 0
      // 3b9: swap
      // 3ba: aastore
      // 3bb: invokevirtual rip/breeze/inject/MathUtil11.calculate_20 ([Ljava/lang/Object;)V
      // 3be: lload 3
      // 3bf: lconst_0
      // 3c0: lcmp
      // 3c1: ifle 843
      // 3c4: iload 29
      // 3c6: ifeq 843
      // 3c9: aload 0
      // 3ca: lload 3
      // 3cb: lconst_0
      // 3cc: lcmp
      // 3cd: ifle 40a
      // 3d0: iload 29
      // 3d2: ifne 40a
      // 3d5: goto 3dc
      // 3d8: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3db: athrow
      // 3dc: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 3df: bipush 0
      // 3e0: anewarray 141
      // 3e3: invokevirtual rip/breeze/inject/Util139.getValue ([Ljava/lang/Object;)I
      // 3e6: bipush 50
      // 3e8: goto 3ef
      // 3eb: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3ee: athrow
      // 3ef: if_icmpge 409
      // 3f2: new java/lang/IllegalArgumentException
      // 3f5: dup
      // 3f6: sipush 13679
      // 3f9: ldc2_w 8606871601501856958
      // 3fc: lload 3
      // 3fd: lxor
      // 3fe: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 401: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 404: athrow
      // 405: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 408: athrow
      // 409: aload 0
      // 40a: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 40d: iload 29
      // 40f: ifne 446
      // 412: ifnonnull 43b
      // 415: goto 41c
      // 418: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41b: athrow
      // 41c: aload 0
      // 41d: new rip/breeze/inject/ð
      // 420: dup
      // 421: invokespecial rip/breeze/inject/ð.<init> ()V
      // 424: putfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 427: aload 0
      // 428: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 42b: lload 3
      // 42c: lconst_0
      // 42d: lcmp
      // 42e: ifle 43f
      // 431: getfield rip/breeze/inject/ð.int_þ_2 I
      // 434: istore 30
      // 436: iload 29
      // 438: ifeq 482
      // 43b: aload 0
      // 43c: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 43f: goto 446
      // 442: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 445: athrow
      // 446: getfield rip/breeze/inject/ð.int_þ_2 I
      // 449: aload 0
      // 44a: getfield rip/breeze/inject/MathUtil11.fieldInt_f I
      // 44d: isub
      // 44e: bipush 1
      // 44f: isub
      // 450: istore 30
      // 452: iload 30
      // 454: iload 29
      // 456: lload 3
      // 457: lconst_0
      // 458: lcmp
      // 459: ifle 485
      // 45c: ifne 483
      // 45f: ifge 482
      // 462: goto 469
      // 465: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 468: athrow
      // 469: iload 2
      // 46a: bipush 3
      // 46b: if_icmpne 47a
      // 46e: goto 475
      // 471: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 474: athrow
      // 475: return
      // 476: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 479: athrow
      // 47a: new java/lang/IllegalStateException
      // 47d: dup
      // 47e: invokespecial java/lang/IllegalStateException.<init> ()V
      // 481: athrow
      // 482: iload 2
      // 483: iload 29
      // 485: ifne 518
      // 488: tableswitch 922 0 4 40 333 493 587 738
      // 4ac: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4af: athrow
      // 4b0: aload 0
      // 4b1: iload 5
      // 4b3: putfield rip/breeze/inject/MathUtil11.fieldInt_g I
      // 4b6: aload 0
      // 4b7: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 4ba: sipush 255
      // 4bd: lload 17
      // 4bf: bipush 2
      // 4c0: anewarray 141
      // 4c3: dup_x2
      // 4c4: dup_x2
      // 4c5: pop
      // 4c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c9: bipush 1
      // 4ca: swap
      // 4cb: aastore
      // 4cc: dup_x1
      // 4cd: swap
      // 4ce: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4d1: bipush 0
      // 4d2: swap
      // 4d3: aastore
      // 4d4: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 4d7: iload 30
      // 4d9: lload 13
      // 4db: bipush 2
      // 4dc: anewarray 141
      // 4df: dup_x2
      // 4e0: dup_x2
      // 4e1: pop
      // 4e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4e5: bipush 1
      // 4e6: swap
      // 4e7: aastore
      // 4e8: dup_x1
      // 4e9: swap
      // 4ea: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4ed: bipush 0
      // 4ee: swap
      // 4ef: aastore
      // 4f0: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 4f3: iload 5
      // 4f5: lload 13
      // 4f7: bipush 2
      // 4f8: anewarray 141
      // 4fb: dup_x2
      // 4fc: dup_x2
      // 4fd: pop
      // 4fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 501: bipush 1
      // 502: swap
      // 503: aastore
      // 504: dup_x1
      // 505: swap
      // 506: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 509: bipush 0
      // 50a: swap
      // 50b: aastore
      // 50c: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 50f: pop
      // 510: bipush 0
      // 511: goto 518
      // 514: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 517: athrow
      // 518: istore 31
      // 51a: iload 31
      // 51c: iload 5
      // 51e: if_icmpge 560
      // 521: aload 0
      // 522: aload 6
      // 524: iload 31
      // 526: aaload
      // 527: lload 15
      // 529: dup2_x1
      // 52a: pop2
      // 52b: bipush 2
      // 52c: anewarray 141
      // 52f: dup_x1
      // 530: swap
      // 531: bipush 1
      // 532: swap
      // 533: aastore
      // 534: dup_x2
      // 535: dup_x2
      // 536: pop
      // 537: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 53a: bipush 0
      // 53b: swap
      // 53c: aastore
      // 53d: invokevirtual rip/breeze/inject/MathUtil11.processAll_7 ([Ljava/lang/Object;)V
      // 540: iinc 31 1
      // 543: iload 29
      // 545: lload 3
      // 546: lconst_0
      // 547: lcmp
      // 548: iflt 582
      // 54b: ifne 581
      // 54e: iload 29
      // 550: ifeq 51a
      // 553: lload 3
      // 554: lconst_0
      // 555: lcmp
      // 556: iflt 543
      // 559: goto 560
      // 55c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 55f: athrow
      // 560: aload 0
      // 561: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 564: iload 7
      // 566: lload 13
      // 568: bipush 2
      // 569: anewarray 141
      // 56c: dup_x2
      // 56d: dup_x2
      // 56e: pop
      // 56f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 572: bipush 1
      // 573: swap
      // 574: aastore
      // 575: dup_x1
      // 576: swap
      // 577: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 57a: bipush 0
      // 57b: swap
      // 57c: aastore
      // 57d: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 580: pop
      // 581: bipush 0
      // 582: istore 31
      // 584: iload 31
      // 586: iload 7
      // 588: if_icmpge 5ca
      // 58b: aload 0
      // 58c: aload 8
      // 58e: iload 31
      // 590: aaload
      // 591: lload 15
      // 593: dup2_x1
      // 594: pop2
      // 595: bipush 2
      // 596: anewarray 141
      // 599: dup_x1
      // 59a: swap
      // 59b: bipush 1
      // 59c: swap
      // 59d: aastore
      // 59e: dup_x2
      // 59f: dup_x2
      // 5a0: pop
      // 5a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5a4: bipush 0
      // 5a5: swap
      // 5a6: aastore
      // 5a7: invokevirtual rip/breeze/inject/MathUtil11.processAll_7 ([Ljava/lang/Object;)V
      // 5aa: iinc 31 1
      // 5ad: iload 29
      // 5af: lload 3
      // 5b0: lconst_0
      // 5b1: lcmp
      // 5b2: ifle 5ba
      // 5b5: ifne 839
      // 5b8: iload 29
      // 5ba: ifeq 584
      // 5bd: lload 3
      // 5be: lconst_0
      // 5bf: lcmp
      // 5c0: ifle 5ad
      // 5c3: goto 5ca
      // 5c6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5c9: athrow
      // 5ca: iload 29
      // 5cc: lload 3
      // 5cd: lconst_0
      // 5ce: lcmp
      // 5cf: iflt 622
      // 5d2: ifeq 82e
      // 5d5: aload 0
      // 5d6: dup
      // 5d7: getfield rip/breeze/inject/MathUtil11.fieldInt_g I
      // 5da: iload 5
      // 5dc: iadd
      // 5dd: putfield rip/breeze/inject/MathUtil11.fieldInt_g I
      // 5e0: aload 0
      // 5e1: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 5e4: sipush 251
      // 5e7: iload 5
      // 5e9: iadd
      // 5ea: lload 17
      // 5ec: bipush 2
      // 5ed: anewarray 141
      // 5f0: dup_x2
      // 5f1: dup_x2
      // 5f2: pop
      // 5f3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f6: bipush 1
      // 5f7: swap
      // 5f8: aastore
      // 5f9: dup_x1
      // 5fa: swap
      // 5fb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5fe: bipush 0
      // 5ff: swap
      // 600: aastore
      // 601: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 604: iload 30
      // 606: lload 13
      // 608: bipush 2
      // 609: anewarray 141
      // 60c: dup_x2
      // 60d: dup_x2
      // 60e: pop
      // 60f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 612: bipush 1
      // 613: swap
      // 614: aastore
      // 615: dup_x1
      // 616: swap
      // 617: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 61a: bipush 0
      // 61b: swap
      // 61c: aastore
      // 61d: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 620: pop
      // 621: bipush 0
      // 622: istore 31
      // 624: iload 31
      // 626: iload 5
      // 628: if_icmpge 66a
      // 62b: aload 0
      // 62c: lload 3
      // 62d: lconst_0
      // 62e: lcmp
      // 62f: iflt 83a
      // 632: aload 6
      // 634: iload 31
      // 636: aaload
      // 637: lload 15
      // 639: dup2_x1
      // 63a: pop2
      // 63b: bipush 2
      // 63c: anewarray 141
      // 63f: dup_x1
      // 640: swap
      // 641: bipush 1
      // 642: swap
      // 643: aastore
      // 644: dup_x2
      // 645: dup_x2
      // 646: pop
      // 647: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 64a: bipush 0
      // 64b: swap
      // 64c: aastore
      // 64d: invokevirtual rip/breeze/inject/MathUtil11.processAll_7 ([Ljava/lang/Object;)V
      // 650: iinc 31 1
      // 653: iload 29
      // 655: ifne 839
      // 658: iload 29
      // 65a: ifeq 624
      // 65d: lload 3
      // 65e: lconst_0
      // 65f: lcmp
      // 660: iflt 653
      // 663: goto 66a
      // 666: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 669: athrow
      // 66a: lload 3
      // 66b: lconst_0
      // 66c: lcmp
      // 66d: iflt 839
      // 670: iload 29
      // 672: ifeq 82e
      // 675: aload 0
      // 676: dup
      // 677: getfield rip/breeze/inject/MathUtil11.fieldInt_g I
      // 67a: iload 5
      // 67c: isub
      // 67d: putfield rip/breeze/inject/MathUtil11.fieldInt_g I
      // 680: aload 0
      // 681: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 684: sipush 251
      // 687: iload 5
      // 689: isub
      // 68a: lload 17
      // 68c: bipush 2
      // 68d: anewarray 141
      // 690: dup_x2
      // 691: dup_x2
      // 692: pop
      // 693: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 696: bipush 1
      // 697: swap
      // 698: aastore
      // 699: dup_x1
      // 69a: swap
      // 69b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 69e: bipush 0
      // 69f: swap
      // 6a0: aastore
      // 6a1: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 6a4: iload 30
      // 6a6: lload 13
      // 6a8: bipush 2
      // 6a9: anewarray 141
      // 6ac: dup_x2
      // 6ad: dup_x2
      // 6ae: pop
      // 6af: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6b2: bipush 1
      // 6b3: swap
      // 6b4: aastore
      // 6b5: dup_x1
      // 6b6: swap
      // 6b7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6ba: bipush 0
      // 6bb: swap
      // 6bc: aastore
      // 6bd: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 6c0: pop
      // 6c1: lload 3
      // 6c2: lconst_0
      // 6c3: lcmp
      // 6c4: ifle 839
      // 6c7: iload 29
      // 6c9: ifeq 82e
      // 6cc: goto 6d3
      // 6cf: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6d2: athrow
      // 6d3: iload 30
      // 6d5: lload 3
      // 6d6: lconst_0
      // 6d7: lcmp
      // 6d8: ifle 760
      // 6db: bipush 64
      // 6dd: if_icmpge 71a
      // 6e0: goto 6e7
      // 6e3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6e6: athrow
      // 6e7: aload 0
      // 6e8: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 6eb: iload 30
      // 6ed: lload 17
      // 6ef: bipush 2
      // 6f0: anewarray 141
      // 6f3: dup_x2
      // 6f4: dup_x2
      // 6f5: pop
      // 6f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6f9: bipush 1
      // 6fa: swap
      // 6fb: aastore
      // 6fc: dup_x1
      // 6fd: swap
      // 6fe: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 701: bipush 0
      // 702: swap
      // 703: aastore
      // 704: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 707: pop
      // 708: lload 3
      // 709: lconst_0
      // 70a: lcmp
      // 70b: iflt 839
      // 70e: iload 29
      // 710: ifeq 82e
      // 713: goto 71a
      // 716: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 719: athrow
      // 71a: aload 0
      // 71b: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 71e: sipush 251
      // 721: lload 17
      // 723: bipush 2
      // 724: anewarray 141
      // 727: dup_x2
      // 728: dup_x2
      // 729: pop
      // 72a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 72d: bipush 1
      // 72e: swap
      // 72f: aastore
      // 730: dup_x1
      // 731: swap
      // 732: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 735: bipush 0
      // 736: swap
      // 737: aastore
      // 738: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 73b: iload 30
      // 73d: lload 13
      // 73f: bipush 2
      // 740: anewarray 141
      // 743: dup_x2
      // 744: dup_x2
      // 745: pop
      // 746: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 749: bipush 1
      // 74a: swap
      // 74b: aastore
      // 74c: dup_x1
      // 74d: swap
      // 74e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 751: bipush 0
      // 752: swap
      // 753: aastore
      // 754: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 757: pop
      // 758: lload 3
      // 759: lconst_0
      // 75a: lcmp
      // 75b: ifle 839
      // 75e: iload 29
      // 760: ifeq 82e
      // 763: goto 76a
      // 766: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 769: athrow
      // 76a: lload 3
      // 76b: lconst_0
      // 76c: lcmp
      // 76d: iflt 7f2
      // 770: iload 30
      // 772: bipush 64
      // 774: if_icmpge 7b4
      // 777: goto 77e
      // 77a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 77d: athrow
      // 77e: aload 0
      // 77f: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 782: bipush 64
      // 784: iload 30
      // 786: iadd
      // 787: lload 17
      // 789: bipush 2
      // 78a: anewarray 141
      // 78d: dup_x2
      // 78e: dup_x2
      // 78f: pop
      // 790: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 793: bipush 1
      // 794: swap
      // 795: aastore
      // 796: dup_x1
      // 797: swap
      // 798: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 79b: bipush 0
      // 79c: swap
      // 79d: aastore
      // 79e: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 7a1: pop
      // 7a2: iload 29
      // 7a4: lload 3
      // 7a5: lconst_0
      // 7a6: lcmp
      // 7a7: ifle 81f
      // 7aa: ifeq 7f9
      // 7ad: goto 7b4
      // 7b0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7b3: athrow
      // 7b4: aload 0
      // 7b5: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 7b8: sipush 247
      // 7bb: lload 17
      // 7bd: bipush 2
      // 7be: anewarray 141
      // 7c1: dup_x2
      // 7c2: dup_x2
      // 7c3: pop
      // 7c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7c7: bipush 1
      // 7c8: swap
      // 7c9: aastore
      // 7ca: dup_x1
      // 7cb: swap
      // 7cc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7cf: bipush 0
      // 7d0: swap
      // 7d1: aastore
      // 7d2: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 7d5: iload 30
      // 7d7: lload 13
      // 7d9: bipush 2
      // 7da: anewarray 141
      // 7dd: dup_x2
      // 7de: dup_x2
      // 7df: pop
      // 7e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7e3: bipush 1
      // 7e4: swap
      // 7e5: aastore
      // 7e6: dup_x1
      // 7e7: swap
      // 7e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7eb: bipush 0
      // 7ec: swap
      // 7ed: aastore
      // 7ee: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 7f1: pop
      // 7f2: goto 7f9
      // 7f5: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7f8: athrow
      // 7f9: aload 0
      // 7fa: aload 8
      // 7fc: bipush 0
      // 7fd: aaload
      // 7fe: lload 15
      // 800: dup2_x1
      // 801: pop2
      // 802: bipush 2
      // 803: anewarray 141
      // 806: dup_x1
      // 807: swap
      // 808: bipush 1
      // 809: swap
      // 80a: aastore
      // 80b: dup_x2
      // 80c: dup_x2
      // 80d: pop
      // 80e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 811: bipush 0
      // 812: swap
      // 813: aastore
      // 814: invokevirtual rip/breeze/inject/MathUtil11.processAll_7 ([Ljava/lang/Object;)V
      // 817: lload 3
      // 818: lconst_0
      // 819: lcmp
      // 81a: iflt 839
      // 81d: iload 29
      // 81f: ifeq 82e
      // 822: new java/lang/IllegalArgumentException
      // 825: dup
      // 826: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 829: athrow
      // 82a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 82d: athrow
      // 82e: aload 0
      // 82f: aload 0
      // 830: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 833: getfield rip/breeze/inject/ð.int_þ_2 I
      // 836: putfield rip/breeze/inject/MathUtil11.fieldInt_f I
      // 839: aload 0
      // 83a: dup
      // 83b: getfield rip/breeze/inject/MathUtil11.int_â I
      // 83e: bipush 1
      // 83f: iadd
      // 840: putfield rip/breeze/inject/MathUtil11.int_â I
      // 843: aload 0
      // 844: iload 29
      // 846: ifne 8fb
      // 849: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 84c: bipush 2
      // 84d: if_icmpne 8ed
      // 850: goto 857
      // 853: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 856: athrow
      // 857: aload 0
      // 858: iload 7
      // 85a: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 85d: bipush 0
      // 85e: istore 30
      // 860: iload 30
      // 862: iload 7
      // 864: if_icmpge 8bb
      // 867: iload 29
      // 869: ifne 909
      // 86c: aload 8
      // 86e: iload 30
      // 870: aaload
      // 871: getstatic rip/breeze/inject/IFunctional.CONST_Ը Ljava/lang/Integer;
      // 874: lload 3
      // 875: lconst_0
      // 876: lcmp
      // 877: ifle 89f
      // 87a: iload 29
      // 87c: ifne 89f
      // 87f: goto 886
      // 882: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 885: athrow
      // 886: if_acmpeq 8a2
      // 889: goto 890
      // 88c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 88f: athrow
      // 890: aload 8
      // 892: iload 30
      // 894: aaload
      // 895: getstatic rip/breeze/inject/IFunctional.CONST_Թ Ljava/lang/Integer;
      // 898: goto 89f
      // 89b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 89e: athrow
      // 89f: if_acmpne 8b3
      // 8a2: aload 0
      // 8a3: dup
      // 8a4: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 8a7: bipush 1
      // 8a8: iadd
      // 8a9: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 8ac: goto 8b3
      // 8af: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8b2: athrow
      // 8b3: iinc 30 1
      // 8b6: iload 29
      // 8b8: ifeq 860
      // 8bb: aload 0
      // 8bc: iload 29
      // 8be: lload 3
      // 8bf: lconst_0
      // 8c0: lcmp
      // 8c1: iflt 8a9
      // 8c4: lload 3
      // 8c5: lconst_0
      // 8c6: lcmp
      // 8c7: iflt 906
      // 8ca: ifne 8fb
      // 8cd: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 8d0: aload 0
      // 8d1: getfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 8d4: if_icmple 8ed
      // 8d7: goto 8de
      // 8da: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8dd: athrow
      // 8de: aload 0
      // 8df: aload 0
      // 8e0: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 8e3: putfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 8e6: goto 8ed
      // 8e9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8ec: athrow
      // 8ed: aload 0
      // 8ee: aload 0
      // 8ef: getfield rip/breeze/inject/MathUtil11.int_í I
      // 8f2: iload 7
      // 8f4: invokestatic java/lang/Math.max (II)I
      // 8f7: putfield rip/breeze/inject/MathUtil11.int_í I
      // 8fa: aload 0
      // 8fb: aload 0
      // 8fc: getfield rip/breeze/inject/MathUtil11.int_ì I
      // 8ff: aload 0
      // 900: getfield rip/breeze/inject/MathUtil11.fieldInt_g I
      // 903: invokestatic java/lang/Math.max (II)I
      // 906: putfield rip/breeze/inject/MathUtil11.int_ì I
      // 909: return
      // try (80 -> 86): 87 java/lang/IllegalArgumentException
      // try (93 -> 100): 101 java/lang/IllegalArgumentException
      // try (99 -> 112): 113 java/lang/IllegalArgumentException
      // try (103 -> 116): 117 java/lang/IllegalArgumentException
      // try (115 -> 173): 174 java/lang/IllegalArgumentException
      // try (176 -> 206): 207 java/lang/IllegalArgumentException
      // try (199 -> 256): 257 java/lang/IllegalArgumentException
      // try (259 -> 287): 288 java/lang/IllegalArgumentException
      // try (290 -> 297): 298 java/lang/IllegalArgumentException
      // try (296 -> 307): 308 java/lang/IllegalArgumentException
      // try (300 -> 312): 313 java/lang/IllegalArgumentException
      // try (450 -> 490): 495 java/lang/IllegalArgumentException
      // try (499 -> 544): 545 java/lang/IllegalArgumentException
      // try (506 -> 549): 554 java/lang/IllegalArgumentException
      // try (568 -> 581): 582 java/lang/IllegalArgumentException
      // try (574 -> 589): 590 java/lang/IllegalArgumentException
      // try (592 -> 602): 602 java/lang/IllegalArgumentException
      // try (605 -> 609): 610 java/lang/IllegalArgumentException
      // try (625 -> 629): 630 java/lang/IllegalArgumentException
      // try (639 -> 647): 648 java/lang/IllegalArgumentException
      // try (646 -> 653): 654 java/lang/IllegalArgumentException
      // try (650 -> 657): 657 java/lang/IllegalArgumentException
      // try (664 -> 667): 667 java/lang/IllegalArgumentException
      // try (666 -> 730): 731 java/lang/IllegalArgumentException
      // try (737 -> 768): 773 java/lang/IllegalArgumentException
      // try (801 -> 832): 837 java/lang/IllegalArgumentException
      // try (897 -> 928): 933 java/lang/IllegalArgumentException
      // try (935 -> 994): 995 java/lang/IllegalArgumentException
      // try (941 -> 1004): 1005 java/lang/IllegalArgumentException
      // try (997 -> 1034): 1035 java/lang/IllegalArgumentException
      // try (1007 -> 1082): 1083 java/lang/IllegalArgumentException
      // try (1037 -> 1092): 1093 java/lang/IllegalArgumentException
      // try (1085 -> 1124): 1125 java/lang/IllegalArgumentException
      // try (1095 -> 1166): 1167 java/lang/IllegalArgumentException
      // try (1169 -> 1201): 1201 java/lang/IllegalArgumentException
      // try (1214 -> 1220): 1221 java/lang/IllegalArgumentException
      // try (1231 -> 1243): 1244 java/lang/IllegalArgumentException
      // try (1233 -> 1247): 1248 java/lang/IllegalArgumentException
      // try (1246 -> 1254): 1255 java/lang/IllegalArgumentException
      // try (1257 -> 1264): 1265 java/lang/IllegalArgumentException
      // try (1270 -> 1285): 1286 java/lang/IllegalArgumentException
      // try (1281 -> 1292): 1293 java/lang/IllegalArgumentException
   }

   public void calculate_20(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: pop
      // 016: lload 3
      // 017: dup2
      // 018: ldc2_w 80118583935771
      // 01b: lxor
      // 01c: lstore 5
      // 01e: dup2
      // 01f: ldc2_w 88232911550818
      // 022: lxor
      // 023: lstore 7
      // 025: dup2
      // 026: ldc2_w 81271957852413
      // 029: lxor
      // 02a: lstore 9
      // 02c: pop2
      // 02d: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 030: aload 0
      // 031: aload 0
      // 032: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 035: getfield rip/breeze/inject/ð.int_þ_2 I
      // 038: putfield rip/breeze/inject/MathUtil11.fieldInt_a I
      // 03b: istore 11
      // 03d: aload 0
      // 03e: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 041: iload 2
      // 042: lload 9
      // 044: bipush 2
      // 045: anewarray 141
      // 048: dup_x2
      // 049: dup_x2
      // 04a: pop
      // 04b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04e: bipush 1
      // 04f: swap
      // 050: aastore
      // 051: dup_x1
      // 052: swap
      // 053: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 056: bipush 0
      // 057: swap
      // 058: aastore
      // 059: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 05c: pop
      // 05d: aload 0
      // 05e: iload 11
      // 060: ifne 078
      // 063: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 066: ifnull 184
      // 069: goto 070
      // 06c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06f: athrow
      // 070: aload 0
      // 071: goto 078
      // 074: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 077: athrow
      // 078: lload 3
      // 079: lconst_0
      // 07a: lcmp
      // 07b: ifle 0b3
      // 07e: iload 11
      // 080: ifne 0b3
      // 083: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 086: bipush 4
      // 087: if_icmpeq 0b2
      // 08a: goto 091
      // 08d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 090: athrow
      // 091: aload 0
      // 092: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 095: lload 3
      // 096: lconst_0
      // 097: lcmp
      // 098: ifle 105
      // 09b: bipush 3
      // 09c: iload 11
      // 09e: ifne 104
      // 0a1: goto 0a8
      // 0a4: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a7: athrow
      // 0a8: if_icmpne 0f4
      // 0ab: goto 0b2
      // 0ae: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0b6: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 0b9: iload 2
      // 0ba: bipush 0
      // 0bb: lload 5
      // 0bd: aconst_null
      // 0be: aconst_null
      // 0bf: bipush 5
      // 0c0: anewarray 141
      // 0c3: dup_x1
      // 0c4: swap
      // 0c5: bipush 4
      // 0c6: swap
      // 0c7: aastore
      // 0c8: dup_x1
      // 0c9: swap
      // 0ca: bipush 3
      // 0cb: swap
      // 0cc: aastore
      // 0cd: dup_x2
      // 0ce: dup_x2
      // 0cf: pop
      // 0d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d3: bipush 2
      // 0d4: swap
      // 0d5: aastore
      // 0d6: dup_x1
      // 0d7: swap
      // 0d8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0db: bipush 1
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x1
      // 0df: swap
      // 0e0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e3: bipush 0
      // 0e4: swap
      // 0e5: aastore
      // 0e6: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 0e9: iload 11
      // 0eb: lload 3
      // 0ec: lconst_0
      // 0ed: lcmp
      // 0ee: ifle 12a
      // 0f1: ifeq 129
      // 0f4: aload 0
      // 0f5: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 0f8: getstatic rip/breeze/inject/MathUtil11.CONST_Ô [I
      // 0fb: iload 2
      // 0fc: iaload
      // 0fd: goto 104
      // 100: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 103: athrow
      // 104: iadd
      // 105: istore 12
      // 107: lload 3
      // 108: lconst_0
      // 109: lcmp
      // 10a: ifle 11c
      // 10d: iload 12
      // 10f: aload 0
      // 110: getfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 113: if_icmple 123
      // 116: aload 0
      // 117: iload 12
      // 119: putfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 11c: goto 123
      // 11f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 122: athrow
      // 123: aload 0
      // 124: iload 12
      // 126: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 129: iload 2
      // 12a: sipush 172
      // 12d: iload 11
      // 12f: ifne 167
      // 132: if_icmplt 15c
      // 135: goto 13c
      // 138: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13b: athrow
      // 13c: iload 2
      // 13d: sipush 177
      // 140: lload 3
      // 141: lconst_0
      // 142: lcmp
      // 143: iflt 167
      // 146: iload 11
      // 148: ifne 167
      // 14b: goto 152
      // 14e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 151: athrow
      // 152: if_icmple 16a
      // 155: goto 15c
      // 158: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15b: athrow
      // 15c: iload 2
      // 15d: sipush 191
      // 160: goto 167
      // 163: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 166: athrow
      // 167: if_icmpne 184
      // 16a: aload 0
      // 16b: lload 7
      // 16d: bipush 1
      // 16e: anewarray 141
      // 171: dup_x2
      // 172: dup_x2
      // 173: pop
      // 174: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 177: bipush 0
      // 178: swap
      // 179: aastore
      // 17a: invokevirtual rip/breeze/inject/MathUtil11.processAll_6 ([Ljava/lang/Object;)V
      // 17d: goto 184
      // 180: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 183: athrow
      // 184: return
      // try (35 -> 61): 62 java/lang/IllegalArgumentException
      // try (59 -> 65): 66 java/lang/IllegalArgumentException
      // try (68 -> 77): 78 java/lang/IllegalArgumentException
      // try (74 -> 89): 90 java/lang/IllegalArgumentException
      // try (80 -> 93): 94 java/lang/IllegalArgumentException
      // try (97 -> 147): 148 java/lang/IllegalArgumentException
      // try (152 -> 163): 164 java/lang/IllegalArgumentException
      // try (169 -> 174): 175 java/lang/IllegalArgumentException
      // try (173 -> 185): 186 java/lang/IllegalArgumentException
      // try (177 -> 189): 190 java/lang/IllegalArgumentException
      // try (188 -> 194): 195 java/lang/IllegalArgumentException
      // try (197 -> 210): 211 java/lang/IllegalArgumentException
   }

   public void calculate_21(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Integer
      // 01b: invokevirtual java/lang/Integer.intValue ()I
      // 01e: istore 5
      // 020: pop
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 66551456936245
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 12685313849851
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 5170798220559
      // 034: lxor
      // 035: lstore 10
      // 037: pop2
      // 038: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 03b: istore 12
      // 03d: aload 0
      // 03e: iload 12
      // 040: ifne 09e
      // 043: aload 0
      // 044: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 047: getfield rip/breeze/inject/ð.int_þ_2 I
      // 04a: putfield rip/breeze/inject/MathUtil11.fieldInt_a I
      // 04d: iload 2
      // 04e: bipush 17
      // 050: if_icmpne 096
      // 053: goto 05a
      // 056: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 059: athrow
      // 05a: aload 0
      // 05b: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 05e: iload 2
      // 05f: lload 6
      // 061: iload 5
      // 063: bipush 3
      // 064: anewarray 141
      // 067: dup_x1
      // 068: swap
      // 069: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06c: bipush 2
      // 06d: swap
      // 06e: aastore
      // 06f: dup_x2
      // 070: dup_x2
      // 071: pop
      // 072: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 075: bipush 1
      // 076: swap
      // 077: aastore
      // 078: dup_x1
      // 079: swap
      // 07a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07d: bipush 0
      // 07e: swap
      // 07f: aastore
      // 080: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 083: pop
      // 084: lload 3
      // 085: lconst_0
      // 086: lcmp
      // 087: ifle 0c7
      // 08a: iload 12
      // 08c: ifeq 0c7
      // 08f: goto 096
      // 092: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 095: athrow
      // 096: aload 0
      // 097: goto 09e
      // 09a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09d: athrow
      // 09e: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0a1: iload 2
      // 0a2: lload 10
      // 0a4: iload 5
      // 0a6: bipush 3
      // 0a7: anewarray 141
      // 0aa: dup_x1
      // 0ab: swap
      // 0ac: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0af: bipush 2
      // 0b0: swap
      // 0b1: aastore
      // 0b2: dup_x2
      // 0b3: dup_x2
      // 0b4: pop
      // 0b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b8: bipush 1
      // 0b9: swap
      // 0ba: aastore
      // 0bb: dup_x1
      // 0bc: swap
      // 0bd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c0: bipush 0
      // 0c1: swap
      // 0c2: aastore
      // 0c3: invokevirtual rip/breeze/inject/ð.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0c6: pop
      // 0c7: aload 0
      // 0c8: iload 12
      // 0ca: lload 3
      // 0cb: lconst_0
      // 0cc: lcmp
      // 0cd: iflt 0f0
      // 0d0: ifne 0e8
      // 0d3: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0d6: ifnull 1b0
      // 0d9: goto 0e0
      // 0dc: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: goto 0e8
      // 0e4: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e7: athrow
      // 0e8: lload 3
      // 0e9: lconst_0
      // 0ea: lcmp
      // 0eb: iflt 123
      // 0ee: iload 12
      // 0f0: ifne 123
      // 0f3: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 0f6: bipush 4
      // 0f7: if_icmpeq 122
      // 0fa: goto 101
      // 0fd: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 100: athrow
      // 101: aload 0
      // 102: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 105: bipush 3
      // 106: iload 12
      // 108: lload 3
      // 109: lconst_0
      // 10a: lcmp
      // 10b: ifle 172
      // 10e: ifne 170
      // 111: goto 118
      // 114: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 117: athrow
      // 118: if_icmpne 165
      // 11b: goto 122
      // 11e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 121: athrow
      // 122: aload 0
      // 123: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 126: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 129: iload 2
      // 12a: iload 5
      // 12c: lload 8
      // 12e: aconst_null
      // 12f: aconst_null
      // 130: bipush 5
      // 131: anewarray 141
      // 134: dup_x1
      // 135: swap
      // 136: bipush 4
      // 137: swap
      // 138: aastore
      // 139: dup_x1
      // 13a: swap
      // 13b: bipush 3
      // 13c: swap
      // 13d: aastore
      // 13e: dup_x2
      // 13f: dup_x2
      // 140: pop
      // 141: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 144: bipush 2
      // 145: swap
      // 146: aastore
      // 147: dup_x1
      // 148: swap
      // 149: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14c: bipush 1
      // 14d: swap
      // 14e: aastore
      // 14f: dup_x1
      // 150: swap
      // 151: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 154: bipush 0
      // 155: swap
      // 156: aastore
      // 157: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 15a: iload 12
      // 15c: lload 3
      // 15d: lconst_0
      // 15e: lcmp
      // 15f: ifle 166
      // 162: ifeq 1b0
      // 165: iload 2
      // 166: sipush 188
      // 169: goto 170
      // 16c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16f: athrow
      // 170: iload 12
      // 172: ifne 18b
      // 175: if_icmpeq 1b0
      // 178: goto 17f
      // 17b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17e: athrow
      // 17f: aload 0
      // 180: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 183: bipush 1
      // 184: goto 18b
      // 187: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18a: athrow
      // 18b: iadd
      // 18c: istore 13
      // 18e: lload 3
      // 18f: lconst_0
      // 190: lcmp
      // 191: ifle 1a3
      // 194: iload 13
      // 196: aload 0
      // 197: getfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 19a: if_icmple 1aa
      // 19d: aload 0
      // 19e: iload 13
      // 1a0: putfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 1a3: goto 1aa
      // 1a6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: iload 13
      // 1ad: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 1b0: return
      // try (36 -> 46): 47 java/lang/IllegalArgumentException
      // try (39 -> 83): 84 java/lang/IllegalArgumentException
      // try (49 -> 87): 88 java/lang/IllegalArgumentException
      // try (117 -> 126): 127 java/lang/IllegalArgumentException
      // try (124 -> 130): 131 java/lang/IllegalArgumentException
      // try (133 -> 142): 143 java/lang/IllegalArgumentException
      // try (139 -> 154): 155 java/lang/IllegalArgumentException
      // try (145 -> 158): 159 java/lang/IllegalArgumentException
      // try (162 -> 209): 210 java/lang/IllegalArgumentException
      // try (212 -> 215): 216 java/lang/IllegalArgumentException
      // try (214 -> 221): 222 java/lang/IllegalArgumentException
      // try (226 -> 237): 238 java/lang/IllegalArgumentException
   }

   public void calculate_4(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Integer
      // 01c: invokevirtual java/lang/Integer.intValue ()I
      // 01f: istore 5
      // 021: pop
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 91950441655527
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 110699849868329
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 136678977019472
      // 035: lxor
      // 036: lstore 10
      // 038: dup2
      // 039: ldc2_w 118284423596253
      // 03c: lxor
      // 03d: lstore 12
      // 03f: dup2
      // 040: ldc2_w 111715398957007
      // 043: lxor
      // 044: lstore 14
      // 046: dup2
      // 047: ldc2_w 106126405035782
      // 04a: lxor
      // 04b: lstore 16
      // 04d: pop2
      // 04e: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 051: aload 0
      // 052: aload 0
      // 053: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 056: getfield rip/breeze/inject/ð.int_þ_2 I
      // 059: putfield rip/breeze/inject/MathUtil11.fieldInt_a I
      // 05c: istore 18
      // 05e: iload 5
      // 060: bipush 4
      // 061: iload 18
      // 063: ifeq 11f
      // 066: if_icmpge 113
      // 069: goto 070
      // 06c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06f: athrow
      // 070: iload 4
      // 072: sipush 169
      // 075: lload 2
      // 076: lconst_0
      // 077: lcmp
      // 078: iflt 11f
      // 07b: iload 18
      // 07d: ifeq 11f
      // 080: goto 087
      // 083: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 086: athrow
      // 087: lload 2
      // 088: lconst_0
      // 089: lcmp
      // 08a: iflt 118
      // 08d: if_icmpeq 113
      // 090: goto 097
      // 093: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 096: athrow
      // 097: iload 4
      // 099: lload 2
      // 09a: lconst_0
      // 09b: lcmp
      // 09c: ifle 0e5
      // 09f: bipush 54
      // 0a1: iload 18
      // 0a3: ifeq 0e4
      // 0a6: goto 0ad
      // 0a9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ac: athrow
      // 0ad: if_icmpge 0d1
      // 0b0: goto 0b7
      // 0b3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b6: athrow
      // 0b7: bipush 26
      // 0b9: iload 4
      // 0bb: bipush 21
      // 0bd: isub
      // 0be: bipush 2
      // 0bf: ishl
      // 0c0: iadd
      // 0c1: iload 5
      // 0c3: iadd
      // 0c4: istore 19
      // 0c6: iload 18
      // 0c8: lload 2
      // 0c9: lconst_0
      // 0ca: lcmp
      // 0cb: iflt 110
      // 0ce: ifne 0e7
      // 0d1: bipush 59
      // 0d3: iload 4
      // 0d5: bipush 54
      // 0d7: isub
      // 0d8: bipush 2
      // 0d9: ishl
      // 0da: iadd
      // 0db: iload 5
      // 0dd: goto 0e4
      // 0e0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e3: athrow
      // 0e4: iadd
      // 0e5: istore 19
      // 0e7: aload 0
      // 0e8: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0eb: iload 19
      // 0ed: lload 14
      // 0ef: bipush 2
      // 0f0: anewarray 141
      // 0f3: dup_x2
      // 0f4: dup_x2
      // 0f5: pop
      // 0f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f9: bipush 1
      // 0fa: swap
      // 0fb: aastore
      // 0fc: dup_x1
      // 0fd: swap
      // 0fe: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 101: bipush 0
      // 102: swap
      // 103: aastore
      // 104: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 107: pop
      // 108: lload 2
      // 109: lconst_0
      // 10a: lcmp
      // 10b: iflt 1ae
      // 10e: iload 18
      // 110: ifne 1ae
      // 113: iload 5
      // 115: sipush 256
      // 118: goto 11f
      // 11b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11e: athrow
      // 11f: if_icmplt 17c
      // 122: aload 0
      // 123: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 126: sipush 196
      // 129: lload 14
      // 12b: bipush 2
      // 12c: anewarray 141
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
      // 140: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 143: iload 4
      // 145: lload 6
      // 147: iload 5
      // 149: bipush 3
      // 14a: anewarray 141
      // 14d: dup_x1
      // 14e: swap
      // 14f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
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
      // 160: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 163: bipush 0
      // 164: swap
      // 165: aastore
      // 166: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 169: pop
      // 16a: lload 2
      // 16b: lconst_0
      // 16c: lcmp
      // 16d: iflt 1ae
      // 170: iload 18
      // 172: ifne 1ae
      // 175: goto 17c
      // 178: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17b: athrow
      // 17c: aload 0
      // 17d: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 180: iload 4
      // 182: lload 12
      // 184: iload 5
      // 186: bipush 3
      // 187: anewarray 141
      // 18a: dup_x1
      // 18b: swap
      // 18c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 18f: bipush 2
      // 190: swap
      // 191: aastore
      // 192: dup_x2
      // 193: dup_x2
      // 194: pop
      // 195: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 198: bipush 1
      // 199: swap
      // 19a: aastore
      // 19b: dup_x1
      // 19c: swap
      // 19d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a0: bipush 0
      // 1a1: swap
      // 1a2: aastore
      // 1a3: invokevirtual rip/breeze/inject/ð.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1a6: pop
      // 1a7: goto 1ae
      // 1aa: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ad: athrow
      // 1ae: aload 0
      // 1af: lload 2
      // 1b0: lconst_0
      // 1b1: lcmp
      // 1b2: iflt 2d9
      // 1b5: iload 18
      // 1b7: ifeq 2d9
      // 1ba: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 1bd: ifnull 2d8
      // 1c0: goto 1c7
      // 1c3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c6: athrow
      // 1c7: aload 0
      // 1c8: lload 2
      // 1c9: lconst_0
      // 1ca: lcmp
      // 1cb: ifle 20a
      // 1ce: iload 18
      // 1d0: ifeq 20a
      // 1d3: goto 1da
      // 1d6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d9: athrow
      // 1da: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 1dd: bipush 4
      // 1de: if_icmpeq 209
      // 1e1: goto 1e8
      // 1e4: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e7: athrow
      // 1e8: aload 0
      // 1e9: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 1ec: bipush 3
      // 1ed: iload 18
      // 1ef: lload 2
      // 1f0: lconst_0
      // 1f1: lcmp
      // 1f2: ifle 25b
      // 1f5: ifeq 259
      // 1f8: goto 1ff
      // 1fb: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1fe: athrow
      // 1ff: if_icmpne 24d
      // 202: goto 209
      // 205: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 208: athrow
      // 209: aload 0
      // 20a: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 20d: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 210: iload 4
      // 212: iload 5
      // 214: lload 8
      // 216: aconst_null
      // 217: aconst_null
      // 218: bipush 5
      // 219: anewarray 141
      // 21c: dup_x1
      // 21d: swap
      // 21e: bipush 4
      // 21f: swap
      // 220: aastore
      // 221: dup_x1
      // 222: swap
      // 223: bipush 3
      // 224: swap
      // 225: aastore
      // 226: dup_x2
      // 227: dup_x2
      // 228: pop
      // 229: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22c: bipush 2
      // 22d: swap
      // 22e: aastore
      // 22f: dup_x1
      // 230: swap
      // 231: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 234: bipush 1
      // 235: swap
      // 236: aastore
      // 237: dup_x1
      // 238: swap
      // 239: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 23c: bipush 0
      // 23d: swap
      // 23e: aastore
      // 23f: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 242: iload 18
      // 244: lload 2
      // 245: lconst_0
      // 246: lcmp
      // 247: ifle 24f
      // 24a: ifne 2d8
      // 24d: iload 4
      // 24f: sipush 169
      // 252: goto 259
      // 255: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 258: athrow
      // 259: iload 18
      // 25b: ifeq 2b3
      // 25e: if_icmpne 2a2
      // 261: goto 268
      // 264: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 267: athrow
      // 268: aload 0
      // 269: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 26c: dup
      // 26d: getfield rip/breeze/inject/ª.short_í_2 S
      // 270: bipush 64
      // 272: ior
      // 273: i2s
      // 274: putfield rip/breeze/inject/ª.short_í_2 S
      // 277: aload 0
      // 278: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 27b: aload 0
      // 27c: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 27f: i2s
      // 280: putfield rip/breeze/inject/ª.short_ç_2 S
      // 283: aload 0
      // 284: lload 10
      // 286: bipush 1
      // 287: anewarray 141
      // 28a: dup_x2
      // 28b: dup_x2
      // 28c: pop
      // 28d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 290: bipush 0
      // 291: swap
      // 292: aastore
      // 293: invokevirtual rip/breeze/inject/MathUtil11.processAll_6 ([Ljava/lang/Object;)V
      // 296: iload 18
      // 298: ifne 2d8
      // 29b: goto 2a2
      // 29e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a1: athrow
      // 2a2: aload 0
      // 2a3: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 2a6: getstatic rip/breeze/inject/MathUtil11.CONST_Ô [I
      // 2a9: iload 4
      // 2ab: iaload
      // 2ac: goto 2b3
      // 2af: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b2: athrow
      // 2b3: iadd
      // 2b4: istore 19
      // 2b6: lload 2
      // 2b7: lconst_0
      // 2b8: lcmp
      // 2b9: iflt 2cb
      // 2bc: iload 19
      // 2be: aload 0
      // 2bf: getfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 2c2: if_icmple 2d2
      // 2c5: aload 0
      // 2c6: iload 19
      // 2c8: putfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 2cb: goto 2d2
      // 2ce: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d1: athrow
      // 2d2: aload 0
      // 2d3: iload 19
      // 2d5: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 2d8: aload 0
      // 2d9: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 2dc: iload 18
      // 2de: ifeq 3c6
      // 2e1: ifeq 3c4
      // 2e4: goto 2eb
      // 2e7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ea: athrow
      // 2eb: iload 4
      // 2ed: bipush 22
      // 2ef: iload 18
      // 2f1: ifeq 381
      // 2f4: goto 2fb
      // 2f7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2fa: athrow
      // 2fb: lload 2
      // 2fc: lconst_0
      // 2fd: lcmp
      // 2fe: iflt 37a
      // 301: if_icmpeq 377
      // 304: goto 30b
      // 307: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30a: athrow
      // 30b: iload 4
      // 30d: bipush 24
      // 30f: iload 18
      // 311: ifeq 381
      // 314: goto 31b
      // 317: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 31a: athrow
      // 31b: lload 2
      // 31c: lconst_0
      // 31d: lcmp
      // 31e: ifle 37a
      // 321: if_icmpeq 377
      // 324: goto 32b
      // 327: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32a: athrow
      // 32b: iload 4
      // 32d: lload 2
      // 32e: lconst_0
      // 32f: lcmp
      // 330: iflt 382
      // 333: bipush 55
      // 335: iload 18
      // 337: ifeq 381
      // 33a: goto 341
      // 33d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 340: athrow
      // 341: lload 2
      // 342: lconst_0
      // 343: lcmp
      // 344: iflt 37a
      // 347: if_icmpeq 377
      // 34a: goto 351
      // 34d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 350: athrow
      // 351: iload 4
      // 353: lload 2
      // 354: lconst_0
      // 355: lcmp
      // 356: iflt 39a
      // 359: bipush 57
      // 35b: iload 18
      // 35d: ifeq 399
      // 360: goto 367
      // 363: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 366: athrow
      // 367: lload 2
      // 368: lconst_0
      // 369: lcmp
      // 36a: iflt 392
      // 36d: if_icmpne 38f
      // 370: goto 377
      // 373: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 376: athrow
      // 377: iload 5
      // 379: bipush 2
      // 37a: goto 381
      // 37d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 380: athrow
      // 381: iadd
      // 382: istore 19
      // 384: iload 18
      // 386: lload 2
      // 387: lconst_0
      // 388: lcmp
      // 389: iflt 39e
      // 38c: ifne 39c
      // 38f: iload 5
      // 391: bipush 1
      // 392: goto 399
      // 395: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 398: athrow
      // 399: iadd
      // 39a: istore 19
      // 39c: iload 19
      // 39e: aload 0
      // 39f: getfield rip/breeze/inject/MathUtil11.int_ì I
      // 3a2: iload 18
      // 3a4: lload 2
      // 3a5: lconst_0
      // 3a6: lcmp
      // 3a7: ifle 3ca
      // 3aa: ifeq 3c8
      // 3ad: if_icmple 3c4
      // 3b0: goto 3b7
      // 3b3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3b6: athrow
      // 3b7: aload 0
      // 3b8: iload 19
      // 3ba: putfield rip/breeze/inject/MathUtil11.int_ì I
      // 3bd: goto 3c4
      // 3c0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c3: athrow
      // 3c4: iload 4
      // 3c6: bipush 54
      // 3c8: iload 18
      // 3ca: ifeq 3f5
      // 3cd: if_icmplt 431
      // 3d0: goto 3d7
      // 3d3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3d6: athrow
      // 3d7: aload 0
      // 3d8: iload 18
      // 3da: lload 2
      // 3db: lconst_0
      // 3dc: lcmp
      // 3dd: iflt 3fb
      // 3e0: ifeq 3f9
      // 3e3: goto 3ea
      // 3e6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e9: athrow
      // 3ea: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 3ed: bipush 4
      // 3ee: goto 3f5
      // 3f1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f4: athrow
      // 3f5: if_icmpne 431
      // 3f8: aload 0
      // 3f9: iload 18
      // 3fb: ifeq 413
      // 3fe: getfield rip/breeze/inject/MathUtil11.µ_ê Lrip/breeze/inject/µ;
      // 401: ifnull 431
      // 404: goto 40b
      // 407: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40a: athrow
      // 40b: aload 0
      // 40c: goto 413
      // 40f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 412: athrow
      // 413: new rip/breeze/inject/ª
      // 416: dup
      // 417: invokespecial rip/breeze/inject/ª.<init> ()V
      // 41a: lload 16
      // 41c: bipush 2
      // 41d: anewarray 141
      // 420: dup_x2
      // 421: dup_x2
      // 422: pop
      // 423: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 426: bipush 1
      // 427: swap
      // 428: aastore
      // 429: dup_x1
      // 42a: swap
      // 42b: bipush 0
      // 42c: swap
      // 42d: aastore
      // 42e: invokevirtual rip/breeze/inject/MathUtil11.processAll_3 ([Ljava/lang/Object;)V
      // 431: return
      // try (53 -> 58): 59 java/lang/IllegalArgumentException
      // try (57 -> 69): 70 java/lang/IllegalArgumentException
      // try (61 -> 77): 78 java/lang/IllegalArgumentException
      // try (72 -> 88): 89 java/lang/IllegalArgumentException
      // try (80 -> 92): 93 java/lang/IllegalArgumentException
      // try (105 -> 119): 120 java/lang/IllegalArgumentException
      // try (124 -> 153): 154 java/lang/IllegalArgumentException
      // try (156 -> 209): 210 java/lang/IllegalArgumentException
      // try (157 -> 240): 241 java/lang/IllegalArgumentException
      // try (243 -> 252): 253 java/lang/IllegalArgumentException
      // try (250 -> 262): 263 java/lang/IllegalArgumentException
      // try (255 -> 268): 269 java/lang/IllegalArgumentException
      // try (265 -> 280): 281 java/lang/IllegalArgumentException
      // try (271 -> 284): 285 java/lang/IllegalArgumentException
      // try (288 -> 335): 336 java/lang/IllegalArgumentException
      // try (338 -> 341): 342 java/lang/IllegalArgumentException
      // try (340 -> 372): 373 java/lang/IllegalArgumentException
      // try (344 -> 380): 381 java/lang/IllegalArgumentException
      // try (385 -> 396): 397 java/lang/IllegalArgumentException
      // try (403 -> 407): 408 java/lang/IllegalArgumentException
      // try (406 -> 414): 415 java/lang/IllegalArgumentException
      // try (410 -> 422): 423 java/lang/IllegalArgumentException
      // try (417 -> 429): 430 java/lang/IllegalArgumentException
      // try (425 -> 437): 438 java/lang/IllegalArgumentException
      // try (432 -> 448): 449 java/lang/IllegalArgumentException
      // try (440 -> 456): 457 java/lang/IllegalArgumentException
      // try (451 -> 467): 468 java/lang/IllegalArgumentException
      // try (459 -> 475): 476 java/lang/IllegalArgumentException
      // try (470 -> 480): 481 java/lang/IllegalArgumentException
      // try (485 -> 493): 494 java/lang/IllegalArgumentException
      // try (498 -> 508): 509 java/lang/IllegalArgumentException
      // try (507 -> 514): 515 java/lang/IllegalArgumentException
      // try (519 -> 522): 523 java/lang/IllegalArgumentException
      // try (521 -> 532): 533 java/lang/IllegalArgumentException
      // try (525 -> 537): 538 java/lang/IllegalArgumentException
      // try (542 -> 546): 547 java/lang/IllegalArgumentException
      // try (544 -> 550): 551 java/lang/IllegalArgumentException
   }

   @Override
   public void processAll_7(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/String
      // 01b: astore 5
      // 01d: pop
      // 01e: lload 3
      // 01f: dup2
      // 020: ldc2_w 1139453769268
      // 023: lxor
      // 024: lstore 6
      // 026: dup2
      // 027: ldc2_w 59407936241402
      // 02a: lxor
      // 02b: lstore 8
      // 02d: dup2
      // 02e: ldc2_w 50571117808686
      // 031: lxor
      // 032: lstore 10
      // 034: pop2
      // 035: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 038: aload 0
      // 039: aload 0
      // 03a: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 03d: getfield rip/breeze/inject/ð.int_þ_2 I
      // 040: putfield rip/breeze/inject/MathUtil11.fieldInt_a I
      // 043: istore 12
      // 045: aload 0
      // 046: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 049: aload 5
      // 04b: lload 10
      // 04d: bipush 2
      // 04e: anewarray 141
      // 051: dup_x2
      // 052: dup_x2
      // 053: pop
      // 054: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 057: bipush 1
      // 058: swap
      // 059: aastore
      // 05a: dup_x1
      // 05b: swap
      // 05c: bipush 0
      // 05d: swap
      // 05e: aastore
      // 05f: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 062: astore 13
      // 064: aload 0
      // 065: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 068: iload 2
      // 069: aload 13
      // 06b: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 06e: lload 6
      // 070: dup2_x1
      // 071: pop2
      // 072: bipush 3
      // 073: anewarray 141
      // 076: dup_x1
      // 077: swap
      // 078: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07b: bipush 2
      // 07c: swap
      // 07d: aastore
      // 07e: dup_x2
      // 07f: dup_x2
      // 080: pop
      // 081: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 084: bipush 1
      // 085: swap
      // 086: aastore
      // 087: dup_x1
      // 088: swap
      // 089: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08c: bipush 0
      // 08d: swap
      // 08e: aastore
      // 08f: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 092: pop
      // 093: aload 0
      // 094: iload 12
      // 096: ifeq 0ae
      // 099: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 09c: ifnull 17c
      // 09f: goto 0a6
      // 0a2: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: goto 0ae
      // 0aa: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: lload 3
      // 0af: lconst_0
      // 0b0: lcmp
      // 0b1: iflt 0e9
      // 0b4: iload 12
      // 0b6: ifeq 0e9
      // 0b9: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 0bc: bipush 4
      // 0bd: if_icmpeq 0e8
      // 0c0: goto 0c7
      // 0c3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 0cb: bipush 3
      // 0cc: iload 12
      // 0ce: lload 3
      // 0cf: lconst_0
      // 0d0: lcmp
      // 0d1: iflt 13e
      // 0d4: ifeq 13c
      // 0d7: goto 0de
      // 0da: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0dd: athrow
      // 0de: if_icmpne 131
      // 0e1: goto 0e8
      // 0e4: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0ec: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 0ef: iload 2
      // 0f0: aload 0
      // 0f1: getfield rip/breeze/inject/MathUtil11.fieldInt_a I
      // 0f4: lload 8
      // 0f6: aload 13
      // 0f8: aload 0
      // 0f9: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0fc: bipush 5
      // 0fd: anewarray 141
      // 100: dup_x1
      // 101: swap
      // 102: bipush 4
      // 103: swap
      // 104: aastore
      // 105: dup_x1
      // 106: swap
      // 107: bipush 3
      // 108: swap
      // 109: aastore
      // 10a: dup_x2
      // 10b: dup_x2
      // 10c: pop
      // 10d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 110: bipush 2
      // 111: swap
      // 112: aastore
      // 113: dup_x1
      // 114: swap
      // 115: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 118: bipush 1
      // 119: swap
      // 11a: aastore
      // 11b: dup_x1
      // 11c: swap
      // 11d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 120: bipush 0
      // 121: swap
      // 122: aastore
      // 123: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 126: iload 12
      // 128: lload 3
      // 129: lconst_0
      // 12a: lcmp
      // 12b: ifle 132
      // 12e: ifne 17c
      // 131: iload 2
      // 132: sipush 187
      // 135: goto 13c
      // 138: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13b: athrow
      // 13c: iload 12
      // 13e: ifeq 157
      // 141: if_icmpne 17c
      // 144: goto 14b
      // 147: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14a: athrow
      // 14b: aload 0
      // 14c: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 14f: bipush 1
      // 150: goto 157
      // 153: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 156: athrow
      // 157: iadd
      // 158: istore 14
      // 15a: lload 3
      // 15b: lconst_0
      // 15c: lcmp
      // 15d: iflt 16f
      // 160: iload 14
      // 162: aload 0
      // 163: getfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 166: if_icmple 176
      // 169: aload 0
      // 16a: iload 14
      // 16c: putfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 16f: goto 176
      // 172: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 175: athrow
      // 176: aload 0
      // 177: iload 14
      // 179: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 17c: return
      // try (60 -> 96): 97 java/lang/IllegalArgumentException
      // try (94 -> 100): 101 java/lang/IllegalArgumentException
      // try (103 -> 112): 113 java/lang/IllegalArgumentException
      // try (109 -> 124): 125 java/lang/IllegalArgumentException
      // try (115 -> 128): 129 java/lang/IllegalArgumentException
      // try (132 -> 181): 182 java/lang/IllegalArgumentException
      // try (184 -> 187): 188 java/lang/IllegalArgumentException
      // try (186 -> 193): 194 java/lang/IllegalArgumentException
      // try (198 -> 209): 210 java/lang/IllegalArgumentException
   }

   public void calculate_6(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/String
      // 01b: astore 5
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/String
      // 023: astore 6
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast java/lang/String
      // 02b: astore 7
      // 02d: pop
      // 02e: lload 3
      // 02f: dup2
      // 030: ldc2_w 48509889842865
      // 033: lxor
      // 034: lstore 8
      // 036: dup2
      // 037: ldc2_w 29756180629119
      // 03a: lxor
      // 03b: lstore 10
      // 03d: dup2
      // 03e: ldc2_w 24872588785191
      // 041: lxor
      // 042: lstore 12
      // 044: pop2
      // 045: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 048: aload 0
      // 049: aload 0
      // 04a: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 04d: getfield rip/breeze/inject/ð.int_þ_2 I
      // 050: putfield rip/breeze/inject/MathUtil11.fieldInt_a I
      // 053: aload 0
      // 054: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 057: aload 5
      // 059: lload 12
      // 05b: aload 6
      // 05d: aload 7
      // 05f: bipush 4
      // 060: anewarray 141
      // 063: dup_x1
      // 064: swap
      // 065: bipush 3
      // 066: swap
      // 067: aastore
      // 068: dup_x1
      // 069: swap
      // 06a: bipush 2
      // 06b: swap
      // 06c: aastore
      // 06d: dup_x2
      // 06e: dup_x2
      // 06f: pop
      // 070: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 073: bipush 1
      // 074: swap
      // 075: aastore
      // 076: dup_x1
      // 077: swap
      // 078: bipush 0
      // 079: swap
      // 07a: aastore
      // 07b: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_3 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 07e: astore 14
      // 080: aload 0
      // 081: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 084: iload 2
      // 085: aload 14
      // 087: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 08a: lload 8
      // 08c: dup2_x1
      // 08d: pop2
      // 08e: bipush 3
      // 08f: anewarray 141
      // 092: dup_x1
      // 093: swap
      // 094: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 097: bipush 2
      // 098: swap
      // 099: aastore
      // 09a: dup_x2
      // 09b: dup_x2
      // 09c: pop
      // 09d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a0: bipush 1
      // 0a1: swap
      // 0a2: aastore
      // 0a3: dup_x1
      // 0a4: swap
      // 0a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a8: bipush 0
      // 0a9: swap
      // 0aa: aastore
      // 0ab: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0ae: pop
      // 0af: istore 15
      // 0b1: aload 0
      // 0b2: iload 15
      // 0b4: ifne 0cc
      // 0b7: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0ba: ifnull 30a
      // 0bd: goto 0c4
      // 0c0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: goto 0cc
      // 0c8: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cb: athrow
      // 0cc: lload 3
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: iflt 10e
      // 0d2: iload 15
      // 0d4: ifne 10e
      // 0d7: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 0da: bipush 4
      // 0db: if_icmpeq 106
      // 0de: goto 0e5
      // 0e1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 0e9: iload 15
      // 0eb: ifne 160
      // 0ee: goto 0f5
      // 0f1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f4: athrow
      // 0f5: lload 3
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: ifle 159
      // 0fb: bipush 3
      // 0fc: if_icmpne 153
      // 0ff: goto 106
      // 102: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 105: athrow
      // 106: aload 0
      // 107: goto 10e
      // 10a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10d: athrow
      // 10e: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 111: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 114: iload 2
      // 115: bipush 0
      // 116: lload 10
      // 118: aload 14
      // 11a: aload 0
      // 11b: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 11e: bipush 5
      // 11f: anewarray 141
      // 122: dup_x1
      // 123: swap
      // 124: bipush 4
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: bipush 3
      // 12a: swap
      // 12b: aastore
      // 12c: dup_x2
      // 12d: dup_x2
      // 12e: pop
      // 12f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 132: bipush 2
      // 133: swap
      // 134: aastore
      // 135: dup_x1
      // 136: swap
      // 137: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13a: bipush 1
      // 13b: swap
      // 13c: aastore
      // 13d: dup_x1
      // 13e: swap
      // 13f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 142: bipush 0
      // 143: swap
      // 144: aastore
      // 145: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 148: iload 15
      // 14a: lload 3
      // 14b: lconst_0
      // 14c: lcmp
      // 14d: ifle 159
      // 150: ifeq 30a
      // 153: aload 7
      // 155: bipush 0
      // 156: invokevirtual java/lang/String.charAt (I)C
      // 159: goto 160
      // 15c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15f: athrow
      // 160: istore 16
      // 162: iload 2
      // 163: iload 15
      // 165: lload 3
      // 166: lconst_0
      // 167: lcmp
      // 168: ifle 2a6
      // 16b: ifne 2a4
      // 16e: tableswitch 299 178 181 34 122 211 299
      // 18c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18f: athrow
      // 190: aload 0
      // 191: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 194: iload 16
      // 196: iload 15
      // 198: ifne 1d6
      // 19b: goto 1a2
      // 19e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a1: athrow
      // 1a2: lload 3
      // 1a3: lconst_0
      // 1a4: lcmp
      // 1a5: ifle 1cf
      // 1a8: bipush 68
      // 1aa: if_icmpeq 1ce
      // 1ad: goto 1b4
      // 1b0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b3: athrow
      // 1b4: iload 16
      // 1b6: iload 15
      // 1b8: ifne 1d6
      // 1bb: goto 1c2
      // 1be: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c1: athrow
      // 1c2: bipush 74
      // 1c4: if_icmpne 1d9
      // 1c7: goto 1ce
      // 1ca: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1cd: athrow
      // 1ce: bipush 2
      // 1cf: goto 1d6
      // 1d2: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d5: athrow
      // 1d6: goto 1da
      // 1d9: bipush 1
      // 1da: iadd
      // 1db: istore 17
      // 1dd: iload 15
      // 1df: lload 3
      // 1e0: lconst_0
      // 1e1: lcmp
      // 1e2: iflt 2f0
      // 1e5: ifeq 2e8
      // 1e8: aload 0
      // 1e9: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 1ec: iload 16
      // 1ee: iload 15
      // 1f0: ifne 22f
      // 1f3: goto 1fa
      // 1f6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f9: athrow
      // 1fa: lload 3
      // 1fb: lconst_0
      // 1fc: lcmp
      // 1fd: iflt 228
      // 200: bipush 68
      // 202: if_icmpeq 226
      // 205: goto 20c
      // 208: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20b: athrow
      // 20c: iload 16
      // 20e: iload 15
      // 210: ifne 22f
      // 213: goto 21a
      // 216: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 219: athrow
      // 21a: bipush 74
      // 21c: if_icmpne 232
      // 21f: goto 226
      // 222: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 225: athrow
      // 226: bipush -2
      // 228: goto 22f
      // 22b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22e: athrow
      // 22f: goto 233
      // 232: bipush -1
      // 233: iadd
      // 234: istore 17
      // 236: iload 15
      // 238: lload 3
      // 239: lconst_0
      // 23a: lcmp
      // 23b: iflt 2f0
      // 23e: ifeq 2e8
      // 241: aload 0
      // 242: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 245: iload 16
      // 247: iload 15
      // 249: ifne 287
      // 24c: goto 253
      // 24f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 252: athrow
      // 253: lload 3
      // 254: lconst_0
      // 255: lcmp
      // 256: ifle 280
      // 259: bipush 68
      // 25b: if_icmpeq 27f
      // 25e: goto 265
      // 261: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 264: athrow
      // 265: iload 16
      // 267: iload 15
      // 269: ifne 287
      // 26c: goto 273
      // 26f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 272: athrow
      // 273: bipush 74
      // 275: if_icmpne 28a
      // 278: goto 27f
      // 27b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27e: athrow
      // 27f: bipush 1
      // 280: goto 287
      // 283: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 286: athrow
      // 287: goto 28b
      // 28a: bipush 0
      // 28b: iadd
      // 28c: istore 17
      // 28e: iload 15
      // 290: lload 3
      // 291: lconst_0
      // 292: lcmp
      // 293: iflt 2f0
      // 296: ifeq 2e8
      // 299: aload 0
      // 29a: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 29d: goto 2a4
      // 2a0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a3: athrow
      // 2a4: iload 16
      // 2a6: iload 15
      // 2a8: lload 3
      // 2a9: lconst_0
      // 2aa: lcmp
      // 2ab: iflt 2b3
      // 2ae: ifne 2e0
      // 2b1: bipush 68
      // 2b3: if_icmpeq 2d7
      // 2b6: goto 2bd
      // 2b9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2bc: athrow
      // 2bd: iload 16
      // 2bf: iload 15
      // 2c1: ifne 2e0
      // 2c4: goto 2cb
      // 2c7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ca: athrow
      // 2cb: bipush 74
      // 2cd: if_icmpne 2e3
      // 2d0: goto 2d7
      // 2d3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d6: athrow
      // 2d7: bipush -3
      // 2d9: goto 2e0
      // 2dc: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2df: athrow
      // 2e0: goto 2e5
      // 2e3: bipush -2
      // 2e5: iadd
      // 2e6: istore 17
      // 2e8: lload 3
      // 2e9: lconst_0
      // 2ea: lcmp
      // 2eb: iflt 2fd
      // 2ee: iload 17
      // 2f0: aload 0
      // 2f1: getfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 2f4: if_icmple 304
      // 2f7: aload 0
      // 2f8: iload 17
      // 2fa: putfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 2fd: goto 304
      // 300: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 303: athrow
      // 304: aload 0
      // 305: iload 17
      // 307: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 30a: return
      // try (113 -> 118): 119 java/lang/IllegalArgumentException
      // try (116 -> 122): 123 java/lang/IllegalArgumentException
      // try (125 -> 134): 135 java/lang/IllegalArgumentException
      // try (131 -> 141): 142 java/lang/IllegalArgumentException
      // try (137 -> 150): 151 java/lang/IllegalArgumentException
      // try (144 -> 154): 155 java/lang/IllegalArgumentException
      // try (157 -> 206): 207 java/lang/IllegalArgumentException
      // try (210 -> 218): 218 java/lang/IllegalArgumentException
      // try (217 -> 225): 226 java/lang/IllegalArgumentException
      // try (220 -> 234): 235 java/lang/IllegalArgumentException
      // try (228 -> 240): 241 java/lang/IllegalArgumentException
      // try (237 -> 245): 246 java/lang/IllegalArgumentException
      // try (243 -> 249): 250 java/lang/IllegalArgumentException
      // try (256 -> 267): 268 java/lang/IllegalArgumentException
      // try (262 -> 276): 277 java/lang/IllegalArgumentException
      // try (270 -> 282): 283 java/lang/IllegalArgumentException
      // try (279 -> 287): 288 java/lang/IllegalArgumentException
      // try (285 -> 291): 292 java/lang/IllegalArgumentException
      // try (298 -> 309): 310 java/lang/IllegalArgumentException
      // try (304 -> 318): 319 java/lang/IllegalArgumentException
      // try (312 -> 324): 325 java/lang/IllegalArgumentException
      // try (321 -> 329): 330 java/lang/IllegalArgumentException
      // try (327 -> 333): 334 java/lang/IllegalArgumentException
      // try (340 -> 348): 349 java/lang/IllegalArgumentException
      // try (351 -> 360): 361 java/lang/IllegalArgumentException
      // try (358 -> 366): 367 java/lang/IllegalArgumentException
      // try (363 -> 371): 372 java/lang/IllegalArgumentException
      // try (369 -> 375): 376 java/lang/IllegalArgumentException
      // try (382 -> 393): 394 java/lang/IllegalArgumentException
   }

   public void calculate_22(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/String
      // 01c: astore 5
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/String
      // 024: astore 6
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast java/lang/String
      // 02c: astore 7
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/lang/Boolean
      // 034: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 037: istore 8
      // 039: pop
      // 03a: lload 2
      // 03b: dup2
      // 03c: ldc2_w 61335625427154
      // 03f: lxor
      // 040: lstore 9
      // 042: dup2
      // 043: ldc2_w 852022091804
      // 046: lxor
      // 047: lstore 11
      // 049: dup2
      // 04a: ldc2_w 13408034102629
      // 04d: lxor
      // 04e: lstore 13
      // 050: dup2
      // 051: ldc2_w 17575212616936
      // 054: lxor
      // 055: lstore 15
      // 057: dup2
      // 058: ldc2_w 12818014355522
      // 05b: lxor
      // 05c: lstore 17
      // 05e: pop2
      // 05f: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 062: aload 0
      // 063: aload 0
      // 064: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 067: getfield rip/breeze/inject/ð.int_þ_2 I
      // 06a: putfield rip/breeze/inject/MathUtil11.fieldInt_a I
      // 06d: istore 19
      // 06f: aload 0
      // 070: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 073: aload 5
      // 075: lload 13
      // 077: aload 6
      // 079: aload 7
      // 07b: iload 8
      // 07d: bipush 5
      // 07e: anewarray 141
      // 081: dup_x1
      // 082: swap
      // 083: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 086: bipush 4
      // 087: swap
      // 088: aastore
      // 089: dup_x1
      // 08a: swap
      // 08b: bipush 3
      // 08c: swap
      // 08d: aastore
      // 08e: dup_x1
      // 08f: swap
      // 090: bipush 2
      // 091: swap
      // 092: aastore
      // 093: dup_x2
      // 094: dup_x2
      // 095: pop
      // 096: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 099: bipush 1
      // 09a: swap
      // 09b: aastore
      // 09c: dup_x1
      // 09d: swap
      // 09e: bipush 0
      // 09f: swap
      // 0a0: aastore
      // 0a1: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_4 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 0a4: astore 20
      // 0a6: iload 19
      // 0a8: ifne 12b
      // 0ab: iload 4
      // 0ad: sipush 185
      // 0b0: if_icmpne 136
      // 0b3: goto 0ba
      // 0b6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0be: sipush 185
      // 0c1: aload 20
      // 0c3: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 0c6: lload 9
      // 0c8: dup2_x1
      // 0c9: pop2
      // 0ca: bipush 3
      // 0cb: anewarray 141
      // 0ce: dup_x1
      // 0cf: swap
      // 0d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d3: bipush 2
      // 0d4: swap
      // 0d5: aastore
      // 0d6: dup_x2
      // 0d7: dup_x2
      // 0d8: pop
      // 0d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dc: bipush 1
      // 0dd: swap
      // 0de: aastore
      // 0df: dup_x1
      // 0e0: swap
      // 0e1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e4: bipush 0
      // 0e5: swap
      // 0e6: aastore
      // 0e7: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0ea: aload 20
      // 0ec: lload 17
      // 0ee: bipush 1
      // 0ef: anewarray 141
      // 0f2: dup_x2
      // 0f3: dup_x2
      // 0f4: pop
      // 0f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f8: bipush 0
      // 0f9: swap
      // 0fa: aastore
      // 0fb: invokevirtual rip/breeze/inject/BreezeClass3.getValue ([Ljava/lang/Object;)I
      // 0fe: bipush 2
      // 0ff: ishr
      // 100: lload 15
      // 102: bipush 0
      // 103: bipush 3
      // 104: anewarray 141
      // 107: dup_x1
      // 108: swap
      // 109: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
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
      // 11a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11d: bipush 0
      // 11e: swap
      // 11f: aastore
      // 120: invokevirtual rip/breeze/inject/ð.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 123: pop
      // 124: goto 12b
      // 127: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12a: athrow
      // 12b: lload 2
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: ifle 16d
      // 131: iload 19
      // 133: ifeq 16d
      // 136: aload 0
      // 137: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 13a: iload 4
      // 13c: aload 20
      // 13e: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 141: lload 9
      // 143: dup2_x1
      // 144: pop2
      // 145: bipush 3
      // 146: anewarray 141
      // 149: dup_x1
      // 14a: swap
      // 14b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14e: bipush 2
      // 14f: swap
      // 150: aastore
      // 151: dup_x2
      // 152: dup_x2
      // 153: pop
      // 154: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 157: bipush 1
      // 158: swap
      // 159: aastore
      // 15a: dup_x1
      // 15b: swap
      // 15c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15f: bipush 0
      // 160: swap
      // 161: aastore
      // 162: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 165: pop
      // 166: goto 16d
      // 169: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16c: athrow
      // 16d: aload 0
      // 16e: iload 19
      // 170: lload 2
      // 171: lconst_0
      // 172: lcmp
      // 173: iflt 196
      // 176: ifne 18e
      // 179: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 17c: ifnull 2a0
      // 17f: goto 186
      // 182: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 185: athrow
      // 186: aload 0
      // 187: goto 18e
      // 18a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18d: athrow
      // 18e: lload 2
      // 18f: lconst_0
      // 190: lcmp
      // 191: ifle 1d0
      // 194: iload 19
      // 196: ifne 1d0
      // 199: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 19c: bipush 4
      // 19d: if_icmpeq 1c8
      // 1a0: goto 1a7
      // 1a3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a6: athrow
      // 1a7: aload 0
      // 1a8: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 1ab: iload 19
      // 1ad: ifne 231
      // 1b0: goto 1b7
      // 1b3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b6: athrow
      // 1b7: lload 2
      // 1b8: lconst_0
      // 1b9: lcmp
      // 1ba: iflt 22a
      // 1bd: bipush 3
      // 1be: if_icmpne 216
      // 1c1: goto 1c8
      // 1c4: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c7: athrow
      // 1c8: aload 0
      // 1c9: goto 1d0
      // 1cc: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1cf: athrow
      // 1d0: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 1d3: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 1d6: iload 4
      // 1d8: bipush 0
      // 1d9: lload 11
      // 1db: aload 20
      // 1dd: aload 0
      // 1de: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 1e1: bipush 5
      // 1e2: anewarray 141
      // 1e5: dup_x1
      // 1e6: swap
      // 1e7: bipush 4
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: bipush 3
      // 1ed: swap
      // 1ee: aastore
      // 1ef: dup_x2
      // 1f0: dup_x2
      // 1f1: pop
      // 1f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f5: bipush 2
      // 1f6: swap
      // 1f7: aastore
      // 1f8: dup_x1
      // 1f9: swap
      // 1fa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1fd: bipush 1
      // 1fe: swap
      // 1ff: aastore
      // 200: dup_x1
      // 201: swap
      // 202: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 205: bipush 0
      // 206: swap
      // 207: aastore
      // 208: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 20b: iload 19
      // 20d: lload 2
      // 20e: lconst_0
      // 20f: lcmp
      // 210: ifle 22a
      // 213: ifeq 2a0
      // 216: aload 20
      // 218: lload 17
      // 21a: bipush 1
      // 21b: anewarray 141
      // 21e: dup_x2
      // 21f: dup_x2
      // 220: pop
      // 221: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 224: bipush 0
      // 225: swap
      // 226: aastore
      // 227: invokevirtual rip/breeze/inject/BreezeClass3.getValue ([Ljava/lang/Object;)I
      // 22a: goto 231
      // 22d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 230: athrow
      // 231: istore 21
      // 233: iload 21
      // 235: bipush 3
      // 236: iand
      // 237: iload 21
      // 239: bipush 2
      // 23a: ishr
      // 23b: isub
      // 23c: istore 22
      // 23e: iload 4
      // 240: lload 2
      // 241: lconst_0
      // 242: lcmp
      // 243: ifle 27c
      // 246: sipush 184
      // 249: iload 19
      // 24b: ifne 27b
      // 24e: if_icmpne 26e
      // 251: goto 258
      // 254: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 257: athrow
      // 258: aload 0
      // 259: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 25c: iload 22
      // 25e: iadd
      // 25f: bipush 1
      // 260: iadd
      // 261: istore 23
      // 263: iload 19
      // 265: lload 2
      // 266: lconst_0
      // 267: lcmp
      // 268: ifle 286
      // 26b: ifeq 27e
      // 26e: aload 0
      // 26f: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 272: iload 22
      // 274: goto 27b
      // 277: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27a: athrow
      // 27b: iadd
      // 27c: istore 23
      // 27e: lload 2
      // 27f: lconst_0
      // 280: lcmp
      // 281: iflt 293
      // 284: iload 23
      // 286: aload 0
      // 287: getfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 28a: if_icmple 29a
      // 28d: aload 0
      // 28e: iload 23
      // 290: putfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 293: goto 29a
      // 296: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 299: athrow
      // 29a: aload 0
      // 29b: iload 23
      // 29d: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 2a0: return
      // try (103 -> 108): 109 java/lang/IllegalArgumentException
      // try (105 -> 180): 181 java/lang/IllegalArgumentException
      // try (183 -> 220): 221 java/lang/IllegalArgumentException
      // try (223 -> 232): 233 java/lang/IllegalArgumentException
      // try (230 -> 236): 237 java/lang/IllegalArgumentException
      // try (239 -> 248): 249 java/lang/IllegalArgumentException
      // try (245 -> 255): 256 java/lang/IllegalArgumentException
      // try (251 -> 264): 265 java/lang/IllegalArgumentException
      // try (258 -> 268): 269 java/lang/IllegalArgumentException
      // try (271 -> 329): 330 java/lang/IllegalArgumentException
      // try (341 -> 350): 351 java/lang/IllegalArgumentException
      // try (360 -> 369): 370 java/lang/IllegalArgumentException
      // try (374 -> 385): 386 java/lang/IllegalArgumentException
   }

   public void calculate_8(Object... param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
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
      // 01d: checkcast rip/breeze/inject/º
      // 020: astore 6
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast [Ljava/lang/Object;
      // 028: astore 7
      // 02a: pop
      // 02b: lload 4
      // 02d: dup2
      // 02e: ldc2_w 136314906388157
      // 031: lxor
      // 032: lstore 8
      // 034: dup2
      // 035: ldc2_w 84615045951091
      // 038: lxor
      // 039: lstore 10
      // 03b: dup2
      // 03c: ldc2_w 67625623174856
      // 03f: lxor
      // 040: lstore 12
      // 042: dup2
      // 043: ldc2_w 113578332186296
      // 046: lxor
      // 047: lstore 14
      // 049: dup2
      // 04a: ldc2_w 78730853191213
      // 04d: lxor
      // 04e: lstore 16
      // 050: pop2
      // 051: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 054: aload 0
      // 055: aload 0
      // 056: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 059: getfield rip/breeze/inject/ð.int_þ_2 I
      // 05c: putfield rip/breeze/inject/MathUtil11.fieldInt_a I
      // 05f: istore 18
      // 061: aload 0
      // 062: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 065: aload 2
      // 066: lload 14
      // 068: aload 3
      // 069: aload 6
      // 06b: aload 7
      // 06d: bipush 5
      // 06e: anewarray 141
      // 071: dup_x1
      // 072: swap
      // 073: bipush 4
      // 074: swap
      // 075: aastore
      // 076: dup_x1
      // 077: swap
      // 078: bipush 3
      // 079: swap
      // 07a: aastore
      // 07b: dup_x1
      // 07c: swap
      // 07d: bipush 2
      // 07e: swap
      // 07f: aastore
      // 080: dup_x2
      // 081: dup_x2
      // 082: pop
      // 083: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 086: bipush 1
      // 087: swap
      // 088: aastore
      // 089: dup_x1
      // 08a: swap
      // 08b: bipush 0
      // 08c: swap
      // 08d: aastore
      // 08e: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_15 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 091: astore 19
      // 093: aload 0
      // 094: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 097: sipush 186
      // 09a: aload 19
      // 09c: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 09f: lload 8
      // 0a1: dup2_x1
      // 0a2: pop2
      // 0a3: bipush 3
      // 0a4: anewarray 141
      // 0a7: dup_x1
      // 0a8: swap
      // 0a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ac: bipush 2
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x2
      // 0b0: dup_x2
      // 0b1: pop
      // 0b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b5: bipush 1
      // 0b6: swap
      // 0b7: aastore
      // 0b8: dup_x1
      // 0b9: swap
      // 0ba: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bd: bipush 0
      // 0be: swap
      // 0bf: aastore
      // 0c0: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0c3: pop
      // 0c4: aload 0
      // 0c5: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0c8: bipush 0
      // 0c9: lload 12
      // 0cb: bipush 2
      // 0cc: anewarray 141
      // 0cf: dup_x2
      // 0d0: dup_x2
      // 0d1: pop
      // 0d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d5: bipush 1
      // 0d6: swap
      // 0d7: aastore
      // 0d8: dup_x1
      // 0d9: swap
      // 0da: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0dd: bipush 0
      // 0de: swap
      // 0df: aastore
      // 0e0: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0e3: pop
      // 0e4: aload 0
      // 0e5: iload 18
      // 0e7: ifne 0ff
      // 0ea: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0ed: ifnull 1e1
      // 0f0: goto 0f7
      // 0f3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: goto 0ff
      // 0fb: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fe: athrow
      // 0ff: lload 4
      // 101: lconst_0
      // 102: lcmp
      // 103: ifle 143
      // 106: iload 18
      // 108: ifne 143
      // 10b: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 10e: bipush 4
      // 10f: if_icmpeq 13b
      // 112: goto 119
      // 115: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 118: athrow
      // 119: aload 0
      // 11a: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 11d: iload 18
      // 11f: ifne 1a6
      // 122: goto 129
      // 125: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 128: athrow
      // 129: lload 4
      // 12b: lconst_0
      // 12c: lcmp
      // 12d: iflt 19f
      // 130: bipush 3
      // 131: if_icmpne 18b
      // 134: goto 13b
      // 137: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13a: athrow
      // 13b: aload 0
      // 13c: goto 143
      // 13f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 142: athrow
      // 143: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 146: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 149: sipush 186
      // 14c: bipush 0
      // 14d: lload 10
      // 14f: aload 19
      // 151: aload 0
      // 152: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 155: bipush 5
      // 156: anewarray 141
      // 159: dup_x1
      // 15a: swap
      // 15b: bipush 4
      // 15c: swap
      // 15d: aastore
      // 15e: dup_x1
      // 15f: swap
      // 160: bipush 3
      // 161: swap
      // 162: aastore
      // 163: dup_x2
      // 164: dup_x2
      // 165: pop
      // 166: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 169: bipush 2
      // 16a: swap
      // 16b: aastore
      // 16c: dup_x1
      // 16d: swap
      // 16e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 171: bipush 1
      // 172: swap
      // 173: aastore
      // 174: dup_x1
      // 175: swap
      // 176: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 179: bipush 0
      // 17a: swap
      // 17b: aastore
      // 17c: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 17f: iload 18
      // 181: lload 4
      // 183: lconst_0
      // 184: lcmp
      // 185: ifle 19f
      // 188: ifeq 1e1
      // 18b: aload 19
      // 18d: lload 16
      // 18f: bipush 1
      // 190: anewarray 141
      // 193: dup_x2
      // 194: dup_x2
      // 195: pop
      // 196: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 199: bipush 0
      // 19a: swap
      // 19b: aastore
      // 19c: invokevirtual rip/breeze/inject/BreezeClass3.getValue ([Ljava/lang/Object;)I
      // 19f: goto 1a6
      // 1a2: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a5: athrow
      // 1a6: istore 20
      // 1a8: iload 20
      // 1aa: bipush 3
      // 1ab: iand
      // 1ac: iload 20
      // 1ae: bipush 2
      // 1af: ishr
      // 1b0: isub
      // 1b1: bipush 1
      // 1b2: iadd
      // 1b3: istore 21
      // 1b5: aload 0
      // 1b6: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 1b9: iload 21
      // 1bb: iadd
      // 1bc: istore 22
      // 1be: lload 4
      // 1c0: lconst_0
      // 1c1: lcmp
      // 1c2: ifle 1d4
      // 1c5: iload 22
      // 1c7: aload 0
      // 1c8: getfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 1cb: if_icmple 1db
      // 1ce: aload 0
      // 1cf: iload 22
      // 1d1: putfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 1d4: goto 1db
      // 1d7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1da: athrow
      // 1db: aload 0
      // 1dc: iload 22
      // 1de: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 1e1: return
      // try (95 -> 152): 153 java/lang/IllegalArgumentException
      // try (150 -> 156): 157 java/lang/IllegalArgumentException
      // try (159 -> 168): 169 java/lang/IllegalArgumentException
      // try (165 -> 175): 176 java/lang/IllegalArgumentException
      // try (171 -> 184): 185 java/lang/IllegalArgumentException
      // try (178 -> 188): 189 java/lang/IllegalArgumentException
      // try (191 -> 249): 250 java/lang/IllegalArgumentException
      // try (268 -> 279): 280 java/lang/IllegalArgumentException
   }

   public void calculate_24(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast rip/breeze/inject/ª
      // 01c: astore 5
      // 01e: pop
      // 01f: lload 2
      // 020: dup2
      // 021: ldc2_w 129889661905502
      // 024: lxor
      // 025: lstore 6
      // 027: dup2
      // 028: ldc2_w 121784197025831
      // 02b: lxor
      // 02c: lstore 8
      // 02e: dup2
      // 02f: ldc2_w 74850331280287
      // 032: lxor
      // 033: lstore 10
      // 035: dup2
      // 036: ldc2_w 8074066066149
      // 039: lxor
      // 03a: lstore 12
      // 03c: dup2
      // 03d: ldc2_w 57201406107714
      // 040: lxor
      // 041: lstore 14
      // 043: dup2
      // 044: ldc2_w 130940109699512
      // 047: lxor
      // 048: lstore 16
      // 04a: dup2
      // 04b: ldc2_w 125384603363697
      // 04e: lxor
      // 04f: lstore 18
      // 051: pop2
      // 052: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 055: aload 0
      // 056: aload 0
      // 057: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 05a: getfield rip/breeze/inject/ð.int_þ_2 I
      // 05d: putfield rip/breeze/inject/MathUtil11.fieldInt_a I
      // 060: istore 20
      // 062: iload 4
      // 064: sipush 200
      // 067: iload 20
      // 069: ifeq 081
      // 06c: if_icmplt 085
      // 06f: goto 076
      // 072: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 075: athrow
      // 076: iload 4
      // 078: bipush 33
      // 07a: goto 081
      // 07d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 080: athrow
      // 081: isub
      // 082: goto 087
      // 085: iload 4
      // 087: istore 21
      // 089: bipush 0
      // 08a: istore 22
      // 08c: aload 5
      // 08e: getfield rip/breeze/inject/ª.short_í_2 S
      // 091: bipush 4
      // 092: iand
      // 093: iload 20
      // 095: ifeq 257
      // 098: ifeq 24e
      // 09b: goto 0a2
      // 09e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a1: athrow
      // 0a2: aload 5
      // 0a4: getfield rip/breeze/inject/ª.int_ê_2 I
      // 0a7: aload 0
      // 0a8: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0ab: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0ae: isub
      // 0af: sipush -32768
      // 0b2: lload 2
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: iflt 259
      // 0b8: iload 20
      // 0ba: ifeq 259
      // 0bd: goto 0c4
      // 0c0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c3: athrow
      // 0c4: if_icmpge 24e
      // 0c7: goto 0ce
      // 0ca: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cd: athrow
      // 0ce: iload 21
      // 0d0: sipush 167
      // 0d3: lload 2
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: ifle 135
      // 0d9: iload 20
      // 0db: ifeq 135
      // 0de: goto 0e5
      // 0e1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e4: athrow
      // 0e5: lload 2
      // 0e6: lconst_0
      // 0e7: lcmp
      // 0e8: iflt 12e
      // 0eb: if_icmpne 129
      // 0ee: goto 0f5
      // 0f1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0f9: sipush 200
      // 0fc: lload 16
      // 0fe: bipush 2
      // 0ff: anewarray 141
      // 102: dup_x2
      // 103: dup_x2
      // 104: pop
      // 105: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 108: bipush 1
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 110: bipush 0
      // 111: swap
      // 112: aastore
      // 113: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 116: pop
      // 117: iload 20
      // 119: lload 2
      // 11a: lconst_0
      // 11b: lcmp
      // 11c: ifle 24b
      // 11f: ifne 20a
      // 122: goto 129
      // 125: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 128: athrow
      // 129: iload 21
      // 12b: sipush 168
      // 12e: goto 135
      // 131: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 134: athrow
      // 135: if_icmpne 16c
      // 138: aload 0
      // 139: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 13c: sipush 201
      // 13f: lload 16
      // 141: bipush 2
      // 142: anewarray 141
      // 145: dup_x2
      // 146: dup_x2
      // 147: pop
      // 148: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14b: bipush 1
      // 14c: swap
      // 14d: aastore
      // 14e: dup_x1
      // 14f: swap
      // 150: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 153: bipush 0
      // 154: swap
      // 155: aastore
      // 156: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 159: pop
      // 15a: iload 20
      // 15c: lload 2
      // 15d: lconst_0
      // 15e: lcmp
      // 15f: iflt 24b
      // 162: ifne 20a
      // 165: goto 16c
      // 168: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16b: athrow
      // 16c: aload 0
      // 16d: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 170: iload 21
      // 172: sipush 198
      // 175: iload 20
      // 177: ifeq 1a3
      // 17a: goto 181
      // 17d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 180: athrow
      // 181: lload 2
      // 182: lconst_0
      // 183: lcmp
      // 184: ifle 1a1
      // 187: if_icmplt 19c
      // 18a: goto 191
      // 18d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 190: athrow
      // 191: iload 21
      // 193: bipush 1
      // 194: ixor
      // 195: goto 1a4
      // 198: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19b: athrow
      // 19c: iload 21
      // 19e: bipush 1
      // 19f: iadd
      // 1a0: bipush 1
      // 1a1: ixor
      // 1a2: bipush 1
      // 1a3: isub
      // 1a4: lload 16
      // 1a6: bipush 2
      // 1a7: anewarray 141
      // 1aa: dup_x2
      // 1ab: dup_x2
      // 1ac: pop
      // 1ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b0: bipush 1
      // 1b1: swap
      // 1b2: aastore
      // 1b3: dup_x1
      // 1b4: swap
      // 1b5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b8: bipush 0
      // 1b9: swap
      // 1ba: aastore
      // 1bb: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1be: pop
      // 1bf: aload 0
      // 1c0: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 1c3: bipush 8
      // 1c5: lload 12
      // 1c7: bipush 2
      // 1c8: anewarray 141
      // 1cb: dup_x2
      // 1cc: dup_x2
      // 1cd: pop
      // 1ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d1: bipush 1
      // 1d2: swap
      // 1d3: aastore
      // 1d4: dup_x1
      // 1d5: swap
      // 1d6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d9: bipush 0
      // 1da: swap
      // 1db: aastore
      // 1dc: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1df: pop
      // 1e0: aload 0
      // 1e1: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 1e4: sipush 220
      // 1e7: lload 16
      // 1e9: bipush 2
      // 1ea: anewarray 141
      // 1ed: dup_x2
      // 1ee: dup_x2
      // 1ef: pop
      // 1f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f3: bipush 1
      // 1f4: swap
      // 1f5: aastore
      // 1f6: dup_x1
      // 1f7: swap
      // 1f8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1fb: bipush 0
      // 1fc: swap
      // 1fd: aastore
      // 1fe: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 201: pop
      // 202: aload 0
      // 203: bipush 1
      // 204: putfield rip/breeze/inject/MathUtil11.fieldBool_b Z
      // 207: bipush 1
      // 208: istore 22
      // 20a: aload 5
      // 20c: lload 2
      // 20d: lconst_0
      // 20e: lcmp
      // 20f: iflt 32d
      // 212: aload 0
      // 213: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 216: aload 0
      // 217: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 21a: getfield rip/breeze/inject/ð.int_þ_2 I
      // 21d: bipush 1
      // 21e: isub
      // 21f: lload 14
      // 221: dup2_x1
      // 222: pop2
      // 223: bipush 1
      // 224: bipush 4
      // 225: anewarray 141
      // 228: dup_x1
      // 229: swap
      // 22a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 22d: bipush 3
      // 22e: swap
      // 22f: aastore
      // 230: dup_x1
      // 231: swap
      // 232: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 235: bipush 2
      // 236: swap
      // 237: aastore
      // 238: dup_x2
      // 239: dup_x2
      // 23a: pop
      // 23b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23e: bipush 1
      // 23f: swap
      // 240: aastore
      // 241: dup_x1
      // 242: swap
      // 243: bipush 0
      // 244: swap
      // 245: aastore
      // 246: invokevirtual rip/breeze/inject/ª.method_005 ([Ljava/lang/Object;)V
      // 249: iload 20
      // 24b: ifne 329
      // 24e: iload 21
      // 250: goto 257
      // 253: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 256: athrow
      // 257: iload 4
      // 259: if_icmpeq 2c8
      // 25c: aload 0
      // 25d: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 260: iload 4
      // 262: lload 16
      // 264: bipush 2
      // 265: anewarray 141
      // 268: dup_x2
      // 269: dup_x2
      // 26a: pop
      // 26b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26e: bipush 1
      // 26f: swap
      // 270: aastore
      // 271: dup_x1
      // 272: swap
      // 273: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 276: bipush 0
      // 277: swap
      // 278: aastore
      // 279: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 27c: pop
      // 27d: aload 5
      // 27f: lload 2
      // 280: lconst_0
      // 281: lcmp
      // 282: ifle 32d
      // 285: aload 0
      // 286: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 289: aload 0
      // 28a: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 28d: getfield rip/breeze/inject/ð.int_þ_2 I
      // 290: bipush 1
      // 291: isub
      // 292: lload 14
      // 294: dup2_x1
      // 295: pop2
      // 296: bipush 1
      // 297: bipush 4
      // 298: anewarray 141
      // 29b: dup_x1
      // 29c: swap
      // 29d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2a0: bipush 3
      // 2a1: swap
      // 2a2: aastore
      // 2a3: dup_x1
      // 2a4: swap
      // 2a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2a8: bipush 2
      // 2a9: swap
      // 2aa: aastore
      // 2ab: dup_x2
      // 2ac: dup_x2
      // 2ad: pop
      // 2ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b1: bipush 1
      // 2b2: swap
      // 2b3: aastore
      // 2b4: dup_x1
      // 2b5: swap
      // 2b6: bipush 0
      // 2b7: swap
      // 2b8: aastore
      // 2b9: invokevirtual rip/breeze/inject/ª.method_005 ([Ljava/lang/Object;)V
      // 2bc: iload 20
      // 2be: ifne 329
      // 2c1: goto 2c8
      // 2c4: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c7: athrow
      // 2c8: aload 0
      // 2c9: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 2cc: iload 21
      // 2ce: lload 16
      // 2d0: bipush 2
      // 2d1: anewarray 141
      // 2d4: dup_x2
      // 2d5: dup_x2
      // 2d6: pop
      // 2d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2da: bipush 1
      // 2db: swap
      // 2dc: aastore
      // 2dd: dup_x1
      // 2de: swap
      // 2df: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2e2: bipush 0
      // 2e3: swap
      // 2e4: aastore
      // 2e5: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 2e8: pop
      // 2e9: aload 5
      // 2eb: aload 0
      // 2ec: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 2ef: aload 0
      // 2f0: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 2f3: getfield rip/breeze/inject/ð.int_þ_2 I
      // 2f6: bipush 1
      // 2f7: isub
      // 2f8: lload 14
      // 2fa: dup2_x1
      // 2fb: pop2
      // 2fc: bipush 0
      // 2fd: bipush 4
      // 2fe: anewarray 141
      // 301: dup_x1
      // 302: swap
      // 303: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 306: bipush 3
      // 307: swap
      // 308: aastore
      // 309: dup_x1
      // 30a: swap
      // 30b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 30e: bipush 2
      // 30f: swap
      // 310: aastore
      // 311: dup_x2
      // 312: dup_x2
      // 313: pop
      // 314: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 317: bipush 1
      // 318: swap
      // 319: aastore
      // 31a: dup_x1
      // 31b: swap
      // 31c: bipush 0
      // 31d: swap
      // 31e: aastore
      // 31f: invokevirtual rip/breeze/inject/ª.method_005 ([Ljava/lang/Object;)V
      // 322: goto 329
      // 325: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 328: athrow
      // 329: aload 0
      // 32a: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 32d: ifnull 5a9
      // 330: aconst_null
      // 331: astore 23
      // 333: aload 0
      // 334: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 337: bipush 4
      // 338: iload 20
      // 33a: lload 2
      // 33b: lconst_0
      // 33c: lcmp
      // 33d: iflt 3f0
      // 340: ifeq 3ee
      // 343: if_icmpne 3e9
      // 346: goto 34d
      // 349: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34c: athrow
      // 34d: aload 0
      // 34e: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 351: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 354: iload 21
      // 356: bipush 0
      // 357: lload 6
      // 359: aconst_null
      // 35a: aconst_null
      // 35b: bipush 5
      // 35c: anewarray 141
      // 35f: dup_x1
      // 360: swap
      // 361: bipush 4
      // 362: swap
      // 363: aastore
      // 364: dup_x1
      // 365: swap
      // 366: bipush 3
      // 367: swap
      // 368: aastore
      // 369: dup_x2
      // 36a: dup_x2
      // 36b: pop
      // 36c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 36f: bipush 2
      // 370: swap
      // 371: aastore
      // 372: dup_x1
      // 373: swap
      // 374: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 377: bipush 1
      // 378: swap
      // 379: aastore
      // 37a: dup_x1
      // 37b: swap
      // 37c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 37f: bipush 0
      // 380: swap
      // 381: aastore
      // 382: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 385: aload 5
      // 387: lload 10
      // 389: bipush 1
      // 38a: anewarray 141
      // 38d: dup_x2
      // 38e: dup_x2
      // 38f: pop
      // 390: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 393: bipush 0
      // 394: swap
      // 395: aastore
      // 396: invokevirtual rip/breeze/inject/ª.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ª;
      // 399: iload 20
      // 39b: ifeq 3e4
      // 39e: goto 3a5
      // 3a1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a4: athrow
      // 3a5: dup
      // 3a6: getfield rip/breeze/inject/ª.short_í_2 S
      // 3a9: bipush 2
      // 3aa: ior
      // 3ab: i2s
      // 3ac: putfield rip/breeze/inject/ª.short_í_2 S
      // 3af: aload 0
      // 3b0: bipush 0
      // 3b1: aload 5
      // 3b3: bipush 2
      // 3b4: anewarray 141
      // 3b7: dup_x1
      // 3b8: swap
      // 3b9: bipush 1
      // 3ba: swap
      // 3bb: aastore
      // 3bc: dup_x1
      // 3bd: swap
      // 3be: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3c1: bipush 0
      // 3c2: swap
      // 3c3: aastore
      // 3c4: invokevirtual rip/breeze/inject/MathUtil11.method_006 ([Ljava/lang/Object;)V
      // 3c7: iload 21
      // 3c9: sipush 167
      // 3cc: if_icmpeq 53d
      // 3cf: goto 3d6
      // 3d2: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3d5: athrow
      // 3d6: new rip/breeze/inject/ª
      // 3d9: dup
      // 3da: invokespecial rip/breeze/inject/ª.<init> ()V
      // 3dd: goto 3e4
      // 3e0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e3: athrow
      // 3e4: astore 23
      // 3e6: goto 53d
      // 3e9: aload 0
      // 3ea: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 3ed: bipush 3
      // 3ee: iload 20
      // 3f0: lload 2
      // 3f1: lconst_0
      // 3f2: lcmp
      // 3f3: ifle 455
      // 3f6: ifeq 453
      // 3f9: if_icmpne 447
      // 3fc: goto 403
      // 3ff: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 402: athrow
      // 403: aload 0
      // 404: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 407: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 40a: iload 21
      // 40c: bipush 0
      // 40d: lload 6
      // 40f: aconst_null
      // 410: aconst_null
      // 411: bipush 5
      // 412: anewarray 141
      // 415: dup_x1
      // 416: swap
      // 417: bipush 4
      // 418: swap
      // 419: aastore
      // 41a: dup_x1
      // 41b: swap
      // 41c: bipush 3
      // 41d: swap
      // 41e: aastore
      // 41f: dup_x2
      // 420: dup_x2
      // 421: pop
      // 422: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 425: bipush 2
      // 426: swap
      // 427: aastore
      // 428: dup_x1
      // 429: swap
      // 42a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 42d: bipush 1
      // 42e: swap
      // 42f: aastore
      // 430: dup_x1
      // 431: swap
      // 432: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 435: bipush 0
      // 436: swap
      // 437: aastore
      // 438: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 43b: iload 20
      // 43d: ifne 53d
      // 440: goto 447
      // 443: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 446: athrow
      // 447: aload 0
      // 448: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 44b: bipush 2
      // 44c: goto 453
      // 44f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 452: athrow
      // 453: iload 20
      // 455: lload 2
      // 456: lconst_0
      // 457: lcmp
      // 458: iflt 497
      // 45b: ifeq 48f
      // 45e: if_icmpne 483
      // 461: goto 468
      // 464: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 467: athrow
      // 468: aload 0
      // 469: dup
      // 46a: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 46d: getstatic rip/breeze/inject/MathUtil11.CONST_Ô [I
      // 470: iload 21
      // 472: iaload
      // 473: iadd
      // 474: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 477: iload 20
      // 479: ifne 53d
      // 47c: goto 483
      // 47f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 482: athrow
      // 483: iload 21
      // 485: sipush 168
      // 488: goto 48f
      // 48b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 48e: athrow
      // 48f: lload 2
      // 490: lconst_0
      // 491: lcmp
      // 492: ifle 4be
      // 495: iload 20
      // 497: ifeq 4be
      // 49a: if_icmpne 513
      // 49d: goto 4a4
      // 4a0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a3: athrow
      // 4a4: aload 5
      // 4a6: iload 20
      // 4a8: ifeq 50e
      // 4ab: goto 4b2
      // 4ae: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4b1: athrow
      // 4b2: getfield rip/breeze/inject/ª.short_í_2 S
      // 4b5: bipush 32
      // 4b7: goto 4be
      // 4ba: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4bd: athrow
      // 4be: iand
      // 4bf: ifne 4db
      // 4c2: aload 5
      // 4c4: dup
      // 4c5: getfield rip/breeze/inject/ª.short_í_2 S
      // 4c8: bipush 32
      // 4ca: ior
      // 4cb: i2s
      // 4cc: putfield rip/breeze/inject/ª.short_í_2 S
      // 4cf: aload 0
      // 4d0: bipush 1
      // 4d1: putfield rip/breeze/inject/MathUtil11.fieldBool_c Z
      // 4d4: goto 4db
      // 4d7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4da: athrow
      // 4db: aload 0
      // 4dc: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 4df: dup
      // 4e0: getfield rip/breeze/inject/ª.short_í_2 S
      // 4e3: bipush 16
      // 4e5: ior
      // 4e6: i2s
      // 4e7: putfield rip/breeze/inject/ª.short_í_2 S
      // 4ea: aload 0
      // 4eb: aload 0
      // 4ec: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 4ef: bipush 1
      // 4f0: iadd
      // 4f1: aload 5
      // 4f3: bipush 2
      // 4f4: anewarray 141
      // 4f7: dup_x1
      // 4f8: swap
      // 4f9: bipush 1
      // 4fa: swap
      // 4fb: aastore
      // 4fc: dup_x1
      // 4fd: swap
      // 4fe: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 501: bipush 0
      // 502: swap
      // 503: aastore
      // 504: invokevirtual rip/breeze/inject/MathUtil11.method_006 ([Ljava/lang/Object;)V
      // 507: new rip/breeze/inject/ª
      // 50a: dup
      // 50b: invokespecial rip/breeze/inject/ª.<init> ()V
      // 50e: astore 23
      // 510: goto 53d
      // 513: aload 0
      // 514: dup
      // 515: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 518: getstatic rip/breeze/inject/MathUtil11.CONST_Ô [I
      // 51b: iload 21
      // 51d: iaload
      // 51e: iadd
      // 51f: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 522: aload 0
      // 523: aload 0
      // 524: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 527: aload 5
      // 529: bipush 2
      // 52a: anewarray 141
      // 52d: dup_x1
      // 52e: swap
      // 52f: bipush 1
      // 530: swap
      // 531: aastore
      // 532: dup_x1
      // 533: swap
      // 534: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 537: bipush 0
      // 538: swap
      // 539: aastore
      // 53a: invokevirtual rip/breeze/inject/MathUtil11.method_006 ([Ljava/lang/Object;)V
      // 53d: lload 2
      // 53e: lconst_0
      // 53f: lcmp
      // 540: ifle 581
      // 543: aload 23
      // 545: ifnull 581
      // 548: iload 22
      // 54a: ifeq 567
      // 54d: goto 554
      // 550: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 553: athrow
      // 554: aload 23
      // 556: dup
      // 557: getfield rip/breeze/inject/ª.short_í_2 S
      // 55a: bipush 2
      // 55b: ior
      // 55c: i2s
      // 55d: putfield rip/breeze/inject/ª.short_í_2 S
      // 560: goto 567
      // 563: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 566: athrow
      // 567: aload 0
      // 568: aload 23
      // 56a: lload 18
      // 56c: bipush 2
      // 56d: anewarray 141
      // 570: dup_x2
      // 571: dup_x2
      // 572: pop
      // 573: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 576: bipush 1
      // 577: swap
      // 578: aastore
      // 579: dup_x1
      // 57a: swap
      // 57b: bipush 0
      // 57c: swap
      // 57d: aastore
      // 57e: invokevirtual rip/breeze/inject/MathUtil11.processAll_3 ([Ljava/lang/Object;)V
      // 581: lload 2
      // 582: lconst_0
      // 583: lcmp
      // 584: ifle 5a2
      // 587: iload 21
      // 589: sipush 167
      // 58c: if_icmpne 5a9
      // 58f: aload 0
      // 590: lload 8
      // 592: bipush 1
      // 593: anewarray 141
      // 596: dup_x2
      // 597: dup_x2
      // 598: pop
      // 599: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59c: bipush 0
      // 59d: swap
      // 59e: aastore
      // 59f: invokevirtual rip/breeze/inject/MathUtil11.processAll_6 ([Ljava/lang/Object;)V
      // 5a2: goto 5a9
      // 5a5: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5a8: athrow
      // 5a9: return
      // try (56 -> 61): 62 java/lang/IllegalArgumentException
      // try (60 -> 66): 67 java/lang/IllegalArgumentException
      // try (75 -> 82): 83 java/lang/IllegalArgumentException
      // try (81 -> 98): 99 java/lang/IllegalArgumentException
      // try (85 -> 102): 103 java/lang/IllegalArgumentException
      // try (101 -> 113): 114 java/lang/IllegalArgumentException
      // try (105 -> 121): 122 java/lang/IllegalArgumentException
      // try (116 -> 151): 152 java/lang/IllegalArgumentException
      // try (124 -> 156): 157 java/lang/IllegalArgumentException
      // try (159 -> 187): 188 java/lang/IllegalArgumentException
      // try (160 -> 196): 197 java/lang/IllegalArgumentException
      // try (190 -> 204): 205 java/lang/IllegalArgumentException
      // try (199 -> 211): 211 java/lang/IllegalArgumentException
      // try (285 -> 331): 332 java/lang/IllegalArgumentException
      // try (335 -> 402): 403 java/lang/IllegalArgumentException
      // try (336 -> 465): 466 java/lang/IllegalArgumentException
      // try (473 -> 483): 484 java/lang/IllegalArgumentException
      // try (482 -> 540): 541 java/lang/IllegalArgumentException
      // try (486 -> 569): 570 java/lang/IllegalArgumentException
      // try (543 -> 575): 576 java/lang/IllegalArgumentException
      // try (583 -> 590): 591 java/lang/IllegalArgumentException
      // try (589 -> 635): 636 java/lang/IllegalArgumentException
      // try (593 -> 641): 642 java/lang/IllegalArgumentException
      // try (644 -> 651): 652 java/lang/IllegalArgumentException
      // try (650 -> 664): 665 java/lang/IllegalArgumentException
      // try (654 -> 669): 670 java/lang/IllegalArgumentException
      // try (672 -> 679): 680 java/lang/IllegalArgumentException
      // try (678 -> 685): 686 java/lang/IllegalArgumentException
      // try (682 -> 690): 691 java/lang/IllegalArgumentException
      // try (693 -> 705): 706 java/lang/IllegalArgumentException
      // try (767 -> 775): 776 java/lang/IllegalArgumentException
      // try (773 -> 785): 786 java/lang/IllegalArgumentException
      // try (806 -> 825): 826 java/lang/IllegalArgumentException
   }

   @Override
   public void processAll_3(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/ª
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 3079727542626
      // 018: lxor
      // 019: dup2
      // 01a: bipush 48
      // 01c: lushr
      // 01d: l2i
      // 01e: istore 5
      // 020: dup2
      // 021: bipush 16
      // 023: lshl
      // 024: bipush 16
      // 026: lushr
      // 027: lstore 6
      // 029: pop2
      // 02a: pop2
      // 02b: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 02e: aload 0
      // 02f: dup
      // 030: getfield rip/breeze/inject/MathUtil11.fieldBool_b Z
      // 033: aload 2
      // 034: aload 0
      // 035: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 038: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 03b: aload 0
      // 03c: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 03f: aload 0
      // 040: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 043: getfield rip/breeze/inject/ð.int_þ_2 I
      // 046: iload 5
      // 048: i2s
      // 049: swap
      // 04a: lload 6
      // 04c: dup2_x1
      // 04d: pop2
      // 04e: bipush 5
      // 04f: anewarray 141
      // 052: dup_x1
      // 053: swap
      // 054: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 057: bipush 4
      // 058: swap
      // 059: aastore
      // 05a: dup_x2
      // 05b: dup_x2
      // 05c: pop
      // 05d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 060: bipush 3
      // 061: swap
      // 062: aastore
      // 063: dup_x1
      // 064: swap
      // 065: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 068: bipush 2
      // 069: swap
      // 06a: aastore
      // 06b: dup_x1
      // 06c: swap
      // 06d: bipush 1
      // 06e: swap
      // 06f: aastore
      // 070: dup_x1
      // 071: swap
      // 072: bipush 0
      // 073: swap
      // 074: aastore
      // 075: invokevirtual rip/breeze/inject/ª.method_008 ([Ljava/lang/Object;)Z
      // 078: ior
      // 079: putfield rip/breeze/inject/MathUtil11.fieldBool_b Z
      // 07c: istore 8
      // 07e: aload 2
      // 07f: getfield rip/breeze/inject/ª.short_í_2 S
      // 082: bipush 1
      // 083: iand
      // 084: iload 8
      // 086: ifne 098
      // 089: ifeq 094
      // 08c: goto 093
      // 08f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 092: athrow
      // 093: return
      // 094: aload 0
      // 095: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 098: bipush 4
      // 099: iload 8
      // 09b: lload 3
      // 09c: lconst_0
      // 09d: lcmp
      // 09e: ifle 1ce
      // 0a1: ifne 1cc
      // 0a4: if_icmpne 1c0
      // 0a7: goto 0ae
      // 0aa: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0b2: iload 8
      // 0b4: lload 3
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: ifle 13e
      // 0ba: ifne 136
      // 0bd: goto 0c4
      // 0c0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c3: athrow
      // 0c4: ifnull 132
      // 0c7: goto 0ce
      // 0ca: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cd: athrow
      // 0ce: lload 3
      // 0cf: lconst_0
      // 0d0: lcmp
      // 0d1: iflt 11a
      // 0d4: aload 2
      // 0d5: iload 8
      // 0d7: ifne 110
      // 0da: goto 0e1
      // 0dd: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e0: athrow
      // 0e1: getfield rip/breeze/inject/ª.int_ê_2 I
      // 0e4: aload 0
      // 0e5: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0e8: getfield rip/breeze/inject/ª.int_ê_2 I
      // 0eb: if_icmpne 11b
      // 0ee: goto 0f5
      // 0f1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0f9: dup
      // 0fa: getfield rip/breeze/inject/ª.short_í_2 S
      // 0fd: aload 2
      // 0fe: getfield rip/breeze/inject/ª.short_í_2 S
      // 101: bipush 2
      // 102: iand
      // 103: ior
      // 104: i2s
      // 105: putfield rip/breeze/inject/ª.short_í_2 S
      // 108: aload 2
      // 109: goto 110
      // 10c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 114: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 117: putfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 11a: return
      // 11b: aload 0
      // 11c: bipush 0
      // 11d: aload 2
      // 11e: bipush 2
      // 11f: anewarray 141
      // 122: dup_x1
      // 123: swap
      // 124: bipush 1
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12c: bipush 0
      // 12d: swap
      // 12e: aastore
      // 12f: invokevirtual rip/breeze/inject/MathUtil11.method_006 ([Ljava/lang/Object;)V
      // 132: aload 0
      // 133: getfield rip/breeze/inject/MathUtil11.ª_k Lrip/breeze/inject/ª;
      // 136: lload 3
      // 137: lconst_0
      // 138: lcmp
      // 139: iflt 1aa
      // 13c: iload 8
      // 13e: ifne 1aa
      // 141: ifnull 19f
      // 144: goto 14b
      // 147: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14a: athrow
      // 14b: aload 2
      // 14c: iload 8
      // 14e: ifne 19b
      // 151: goto 158
      // 154: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 157: athrow
      // 158: getfield rip/breeze/inject/ª.int_ê_2 I
      // 15b: aload 0
      // 15c: getfield rip/breeze/inject/MathUtil11.ª_k Lrip/breeze/inject/ª;
      // 15f: getfield rip/breeze/inject/ª.int_ê_2 I
      // 162: if_icmpne 197
      // 165: goto 16c
      // 168: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16b: athrow
      // 16c: aload 0
      // 16d: getfield rip/breeze/inject/MathUtil11.ª_k Lrip/breeze/inject/ª;
      // 170: dup
      // 171: getfield rip/breeze/inject/ª.short_í_2 S
      // 174: aload 2
      // 175: getfield rip/breeze/inject/ª.short_í_2 S
      // 178: bipush 2
      // 179: iand
      // 17a: ior
      // 17b: i2s
      // 17c: putfield rip/breeze/inject/ª.short_í_2 S
      // 17f: aload 2
      // 180: aload 0
      // 181: getfield rip/breeze/inject/MathUtil11.ª_k Lrip/breeze/inject/ª;
      // 184: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 187: putfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 18a: aload 0
      // 18b: aload 0
      // 18c: getfield rip/breeze/inject/MathUtil11.ª_k Lrip/breeze/inject/ª;
      // 18f: putfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 192: return
      // 193: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 196: athrow
      // 197: aload 0
      // 198: getfield rip/breeze/inject/MathUtil11.ª_k Lrip/breeze/inject/ª;
      // 19b: aload 2
      // 19c: putfield rip/breeze/inject/ª.ª_ã_2 Lrip/breeze/inject/ª;
      // 19f: aload 0
      // 1a0: aload 2
      // 1a1: putfield rip/breeze/inject/MathUtil11.ª_k Lrip/breeze/inject/ª;
      // 1a4: aload 0
      // 1a5: aload 2
      // 1a6: putfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 1a9: aload 2
      // 1aa: new rip/breeze/inject/à
      // 1ad: dup
      // 1ae: aload 2
      // 1af: invokespecial rip/breeze/inject/à.<init> (Lrip/breeze/inject/ª;)V
      // 1b2: putfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 1b5: iload 8
      // 1b7: lload 3
      // 1b8: lconst_0
      // 1b9: lcmp
      // 1ba: ifle 1c4
      // 1bd: ifeq 32a
      // 1c0: aload 0
      // 1c1: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 1c4: bipush 3
      // 1c5: goto 1cc
      // 1c8: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1cb: athrow
      // 1cc: iload 8
      // 1ce: lload 3
      // 1cf: lconst_0
      // 1d0: lcmp
      // 1d1: ifle 243
      // 1d4: ifne 241
      // 1d7: if_icmpne 235
      // 1da: goto 1e1
      // 1dd: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e0: athrow
      // 1e1: aload 0
      // 1e2: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 1e5: lload 3
      // 1e6: lconst_0
      // 1e7: lcmp
      // 1e8: ifle 223
      // 1eb: iload 8
      // 1ed: ifne 223
      // 1f0: goto 1f7
      // 1f3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f6: athrow
      // 1f7: lload 3
      // 1f8: lconst_0
      // 1f9: lcmp
      // 1fa: iflt 21c
      // 1fd: ifnonnull 218
      // 200: goto 207
      // 203: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 206: athrow
      // 207: aload 0
      // 208: aload 2
      // 209: putfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 20c: iload 8
      // 20e: ifeq 32a
      // 211: goto 218
      // 214: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 217: athrow
      // 218: aload 0
      // 219: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 21c: goto 223
      // 21f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 222: athrow
      // 223: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 226: aload 2
      // 227: putfield rip/breeze/inject/à.ª_j_2 Lrip/breeze/inject/ª;
      // 22a: iload 8
      // 22c: lload 3
      // 22d: lconst_0
      // 22e: lcmp
      // 22f: ifle 239
      // 232: ifeq 32a
      // 235: aload 0
      // 236: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 239: bipush 1
      // 23a: goto 241
      // 23d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 240: athrow
      // 241: iload 8
      // 243: ifne 308
      // 246: if_icmpne 2ea
      // 249: goto 250
      // 24c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24f: athrow
      // 250: aload 0
      // 251: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 254: lload 3
      // 255: lconst_0
      // 256: lcmp
      // 257: iflt 2c2
      // 25a: iload 8
      // 25c: ifne 2c2
      // 25f: goto 266
      // 262: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 265: athrow
      // 266: ifnull 29d
      // 269: goto 270
      // 26c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 26f: athrow
      // 270: aload 0
      // 271: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 274: aload 0
      // 275: getfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 278: i2s
      // 279: putfield rip/breeze/inject/ª.short_æ_2 S
      // 27c: aload 0
      // 27d: aload 0
      // 27e: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 281: aload 2
      // 282: bipush 2
      // 283: anewarray 141
      // 286: dup_x1
      // 287: swap
      // 288: bipush 1
      // 289: swap
      // 28a: aastore
      // 28b: dup_x1
      // 28c: swap
      // 28d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 290: bipush 0
      // 291: swap
      // 292: aastore
      // 293: invokevirtual rip/breeze/inject/MathUtil11.method_006 ([Ljava/lang/Object;)V
      // 296: goto 29d
      // 299: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 29c: athrow
      // 29d: aload 0
      // 29e: aload 2
      // 29f: putfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 2a2: aload 0
      // 2a3: bipush 0
      // 2a4: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 2a7: aload 0
      // 2a8: bipush 0
      // 2a9: putfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 2ac: aload 0
      // 2ad: lload 3
      // 2ae: lconst_0
      // 2af: lcmp
      // 2b0: iflt 2db
      // 2b3: iload 8
      // 2b5: ifne 2db
      // 2b8: getfield rip/breeze/inject/MathUtil11.ª_k Lrip/breeze/inject/ª;
      // 2bb: goto 2c2
      // 2be: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c1: athrow
      // 2c2: lload 3
      // 2c3: lconst_0
      // 2c4: lcmp
      // 2c5: iflt 2cf
      // 2c8: ifnull 2da
      // 2cb: aload 0
      // 2cc: getfield rip/breeze/inject/MathUtil11.ª_k Lrip/breeze/inject/ª;
      // 2cf: aload 2
      // 2d0: putfield rip/breeze/inject/ª.ª_ã_2 Lrip/breeze/inject/ª;
      // 2d3: goto 2da
      // 2d6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d9: athrow
      // 2da: aload 0
      // 2db: aload 2
      // 2dc: putfield rip/breeze/inject/MathUtil11.ª_k Lrip/breeze/inject/ª;
      // 2df: lload 3
      // 2e0: lconst_0
      // 2e1: lcmp
      // 2e2: iflt 2ea
      // 2e5: iload 8
      // 2e7: ifeq 32a
      // 2ea: aload 0
      // 2eb: iload 8
      // 2ed: lload 3
      // 2ee: lconst_0
      // 2ef: lcmp
      // 2f0: ifle 30e
      // 2f3: ifne 30c
      // 2f6: goto 2fd
      // 2f9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2fc: athrow
      // 2fd: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 300: bipush 2
      // 301: goto 308
      // 304: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 307: athrow
      // 308: if_icmpne 32a
      // 30b: aload 0
      // 30c: iload 8
      // 30e: ifne 326
      // 311: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 314: ifnonnull 32a
      // 317: goto 31e
      // 31a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 31d: athrow
      // 31e: aload 0
      // 31f: goto 326
      // 322: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 325: athrow
      // 326: aload 2
      // 327: putfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 32a: return
      // try (84 -> 91): 92 java/lang/IllegalArgumentException
      // try (97 -> 105): 106 java/lang/IllegalArgumentException
      // try (104 -> 116): 117 java/lang/IllegalArgumentException
      // try (108 -> 120): 121 java/lang/IllegalArgumentException
      // try (119 -> 130): 131 java/lang/IllegalArgumentException
      // try (123 -> 138): 139 java/lang/IllegalArgumentException
      // try (133 -> 153): 154 java/lang/IllegalArgumentException
      // try (180 -> 187): 188 java/lang/IllegalArgumentException
      // try (186 -> 193): 194 java/lang/IllegalArgumentException
      // try (190 -> 201): 202 java/lang/IllegalArgumentException
      // try (196 -> 225): 225 java/lang/IllegalArgumentException
      // try (238 -> 252): 253 java/lang/IllegalArgumentException
      // try (255 -> 262): 263 java/lang/IllegalArgumentException
      // try (261 -> 273): 274 java/lang/IllegalArgumentException
      // try (265 -> 281): 282 java/lang/IllegalArgumentException
      // try (276 -> 289): 290 java/lang/IllegalArgumentException
      // try (284 -> 294): 295 java/lang/IllegalArgumentException
      // try (297 -> 309): 310 java/lang/IllegalArgumentException
      // try (312 -> 315): 316 java/lang/IllegalArgumentException
      // try (314 -> 326): 327 java/lang/IllegalArgumentException
      // try (318 -> 330): 331 java/lang/IllegalArgumentException
      // try (329 -> 357): 358 java/lang/IllegalArgumentException
      // try (360 -> 377): 378 java/lang/IllegalArgumentException
      // try (380 -> 389): 390 java/lang/IllegalArgumentException
      // try (393 -> 408): 409 java/lang/IllegalArgumentException
      // try (401 -> 413): 414 java/lang/IllegalArgumentException
      // try (418 -> 422): 423 java/lang/IllegalArgumentException
      // try (420 -> 426): 427 java/lang/IllegalArgumentException
   }

   public void calculate_10(Object[] param1) {
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
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 28973037747591
      // 018: lxor
      // 019: lstore 5
      // 01b: dup2
      // 01c: ldc2_w 49853829510473
      // 01f: lxor
      // 020: lstore 7
      // 022: dup2
      // 023: ldc2_w 37851882002877
      // 026: lxor
      // 027: lstore 9
      // 029: dup2
      // 02a: ldc2_w 119961691375331
      // 02d: lxor
      // 02e: lstore 11
      // 030: pop2
      // 031: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 034: aload 0
      // 035: aload 0
      // 036: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 039: getfield rip/breeze/inject/ð.int_þ_2 I
      // 03c: putfield rip/breeze/inject/MathUtil11.fieldInt_a I
      // 03f: istore 13
      // 041: aload 0
      // 042: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 045: aload 2
      // 046: lload 11
      // 048: bipush 2
      // 049: anewarray 141
      // 04c: dup_x2
      // 04d: dup_x2
      // 04e: pop
      // 04f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 052: bipush 1
      // 053: swap
      // 054: aastore
      // 055: dup_x1
      // 056: swap
      // 057: bipush 0
      // 058: swap
      // 059: aastore
      // 05a: invokevirtual rip/breeze/inject/Util139.getBreezeClass3 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 05d: astore 14
      // 05f: aload 14
      // 061: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 064: istore 15
      // 066: aload 14
      // 068: getfield rip/breeze/inject/BreezeClass3.int_ç I
      // 06b: iload 13
      // 06d: ifne 107
      // 070: bipush 5
      // 071: if_icmpeq 0ff
      // 074: goto 07b
      // 077: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07a: athrow
      // 07b: aload 14
      // 07d: getfield rip/breeze/inject/BreezeClass3.int_ç I
      // 080: iload 13
      // 082: ifne 107
      // 085: goto 08c
      // 088: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08b: athrow
      // 08c: lload 3
      // 08d: lconst_0
      // 08e: lcmp
      // 08f: ifle 100
      // 092: bipush 6
      // 094: if_icmpeq 0ff
      // 097: goto 09e
      // 09a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09d: athrow
      // 09e: aload 14
      // 0a0: getfield rip/breeze/inject/BreezeClass3.int_ç I
      // 0a3: bipush 17
      // 0a5: iload 13
      // 0a7: ifne 0cc
      // 0aa: goto 0b1
      // 0ad: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b0: athrow
      // 0b1: if_icmpne 10a
      // 0b4: goto 0bb
      // 0b7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ba: athrow
      // 0bb: aload 14
      // 0bd: getfield rip/breeze/inject/BreezeClass3.string_ä Ljava/lang/String;
      // 0c0: bipush 0
      // 0c1: invokevirtual java/lang/String.charAt (I)C
      // 0c4: dup
      // 0c5: goto 0cc
      // 0c8: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cb: athrow
      // 0cc: istore 16
      // 0ce: iload 13
      // 0d0: lload 3
      // 0d1: lconst_0
      // 0d2: lcmp
      // 0d3: ifle 0db
      // 0d6: ifne 107
      // 0d9: bipush 74
      // 0db: if_icmpeq 0ff
      // 0de: goto 0e5
      // 0e1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e4: athrow
      // 0e5: iload 16
      // 0e7: iload 13
      // 0e9: ifne 107
      // 0ec: goto 0f3
      // 0ef: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f2: athrow
      // 0f3: bipush 68
      // 0f5: if_icmpne 10a
      // 0f8: goto 0ff
      // 0fb: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fe: athrow
      // 0ff: bipush 1
      // 100: goto 107
      // 103: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 106: athrow
      // 107: goto 10b
      // 10a: bipush 0
      // 10b: istore 17
      // 10d: iload 17
      // 10f: iload 13
      // 111: lload 3
      // 112: lconst_0
      // 113: lcmp
      // 114: ifle 173
      // 117: ifne 16a
      // 11a: ifeq 161
      // 11d: goto 124
      // 120: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 123: athrow
      // 124: aload 0
      // 125: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 128: bipush 20
      // 12a: lload 5
      // 12c: iload 15
      // 12e: bipush 3
      // 12f: anewarray 141
      // 132: dup_x1
      // 133: swap
      // 134: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 137: bipush 2
      // 138: swap
      // 139: aastore
      // 13a: dup_x2
      // 13b: dup_x2
      // 13c: pop
      // 13d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 140: bipush 1
      // 141: swap
      // 142: aastore
      // 143: dup_x1
      // 144: swap
      // 145: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 148: bipush 0
      // 149: swap
      // 14a: aastore
      // 14b: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 14e: pop
      // 14f: lload 3
      // 150: lconst_0
      // 151: lcmp
      // 152: ifle 1e5
      // 155: iload 13
      // 157: ifeq 1e5
      // 15a: goto 161
      // 15d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 160: athrow
      // 161: iload 15
      // 163: goto 16a
      // 166: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 169: athrow
      // 16a: lload 3
      // 16b: lconst_0
      // 16c: lcmp
      // 16d: ifle 1a9
      // 170: sipush 256
      // 173: if_icmplt 1b3
      // 176: aload 0
      // 177: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 17a: bipush 19
      // 17c: lload 5
      // 17e: iload 15
      // 180: bipush 3
      // 181: anewarray 141
      // 184: dup_x1
      // 185: swap
      // 186: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 189: bipush 2
      // 18a: swap
      // 18b: aastore
      // 18c: dup_x2
      // 18d: dup_x2
      // 18e: pop
      // 18f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 192: bipush 1
      // 193: swap
      // 194: aastore
      // 195: dup_x1
      // 196: swap
      // 197: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19a: bipush 0
      // 19b: swap
      // 19c: aastore
      // 19d: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1a0: pop
      // 1a1: lload 3
      // 1a2: lconst_0
      // 1a3: lcmp
      // 1a4: ifle 1e5
      // 1a7: iload 13
      // 1a9: ifeq 1e5
      // 1ac: goto 1b3
      // 1af: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 1b7: bipush 18
      // 1b9: lload 9
      // 1bb: iload 15
      // 1bd: bipush 3
      // 1be: anewarray 141
      // 1c1: dup_x1
      // 1c2: swap
      // 1c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c6: bipush 2
      // 1c7: swap
      // 1c8: aastore
      // 1c9: dup_x2
      // 1ca: dup_x2
      // 1cb: pop
      // 1cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cf: bipush 1
      // 1d0: swap
      // 1d1: aastore
      // 1d2: dup_x1
      // 1d3: swap
      // 1d4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d7: bipush 0
      // 1d8: swap
      // 1d9: aastore
      // 1da: invokevirtual rip/breeze/inject/ð.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1dd: pop
      // 1de: goto 1e5
      // 1e1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e4: athrow
      // 1e5: aload 0
      // 1e6: iload 13
      // 1e8: lload 3
      // 1e9: lconst_0
      // 1ea: lcmp
      // 1eb: iflt 20e
      // 1ee: ifne 206
      // 1f1: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 1f4: ifnull 2cd
      // 1f7: goto 1fe
      // 1fa: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1fd: athrow
      // 1fe: aload 0
      // 1ff: goto 206
      // 202: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 205: athrow
      // 206: lload 3
      // 207: lconst_0
      // 208: lcmp
      // 209: ifle 241
      // 20c: iload 13
      // 20e: ifne 241
      // 211: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 214: bipush 4
      // 215: if_icmpeq 240
      // 218: goto 21f
      // 21b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21e: athrow
      // 21f: aload 0
      // 220: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 223: bipush 3
      // 224: iload 13
      // 226: lload 3
      // 227: lconst_0
      // 228: lcmp
      // 229: iflt 296
      // 22c: ifne 294
      // 22f: goto 236
      // 232: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 235: athrow
      // 236: if_icmpne 287
      // 239: goto 240
      // 23c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23f: athrow
      // 240: aload 0
      // 241: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 244: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 247: bipush 18
      // 249: bipush 0
      // 24a: lload 7
      // 24c: aload 14
      // 24e: aload 0
      // 24f: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 252: bipush 5
      // 253: anewarray 141
      // 256: dup_x1
      // 257: swap
      // 258: bipush 4
      // 259: swap
      // 25a: aastore
      // 25b: dup_x1
      // 25c: swap
      // 25d: bipush 3
      // 25e: swap
      // 25f: aastore
      // 260: dup_x2
      // 261: dup_x2
      // 262: pop
      // 263: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 266: bipush 2
      // 267: swap
      // 268: aastore
      // 269: dup_x1
      // 26a: swap
      // 26b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 26e: bipush 1
      // 26f: swap
      // 270: aastore
      // 271: dup_x1
      // 272: swap
      // 273: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 276: bipush 0
      // 277: swap
      // 278: aastore
      // 279: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 27c: iload 13
      // 27e: lload 3
      // 27f: lconst_0
      // 280: lcmp
      // 281: iflt 28b
      // 284: ifeq 2cd
      // 287: aload 0
      // 288: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 28b: iload 17
      // 28d: goto 294
      // 290: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 293: athrow
      // 294: iload 13
      // 296: ifne 2a4
      // 299: ifeq 2a7
      // 29c: goto 2a3
      // 29f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a2: athrow
      // 2a3: bipush 2
      // 2a4: goto 2a8
      // 2a7: bipush 1
      // 2a8: iadd
      // 2a9: istore 18
      // 2ab: lload 3
      // 2ac: lconst_0
      // 2ad: lcmp
      // 2ae: ifle 2c0
      // 2b1: iload 18
      // 2b3: aload 0
      // 2b4: getfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 2b7: if_icmple 2c7
      // 2ba: aload 0
      // 2bb: iload 18
      // 2bd: putfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // 2c0: goto 2c7
      // 2c3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c6: athrow
      // 2c7: aload 0
      // 2c8: iload 18
      // 2ca: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 2cd: return
      // try (61 -> 67): 68 java/lang/IllegalArgumentException
      // try (65 -> 74): 75 java/lang/IllegalArgumentException
      // try (70 -> 83): 84 java/lang/IllegalArgumentException
      // try (77 -> 91): 92 java/lang/IllegalArgumentException
      // try (86 -> 95): 96 java/lang/IllegalArgumentException
      // try (94 -> 103): 104 java/lang/IllegalArgumentException
      // try (107 -> 115): 116 java/lang/IllegalArgumentException
      // try (113 -> 121): 122 java/lang/IllegalArgumentException
      // try (118 -> 126): 127 java/lang/IllegalArgumentException
      // try (124 -> 130): 131 java/lang/IllegalArgumentException
      // try (136 -> 144): 145 java/lang/IllegalArgumentException
      // try (143 -> 181): 182 java/lang/IllegalArgumentException
      // try (147 -> 185): 186 java/lang/IllegalArgumentException
      // try (188 -> 228): 229 java/lang/IllegalArgumentException
      // try (194 -> 259): 260 java/lang/IllegalArgumentException
      // try (262 -> 271): 272 java/lang/IllegalArgumentException
      // try (269 -> 275): 276 java/lang/IllegalArgumentException
      // try (278 -> 287): 288 java/lang/IllegalArgumentException
      // try (284 -> 299): 300 java/lang/IllegalArgumentException
      // try (290 -> 303): 304 java/lang/IllegalArgumentException
      // try (307 -> 356): 357 java/lang/IllegalArgumentException
      // try (359 -> 362): 363 java/lang/IllegalArgumentException
      // try (370 -> 381): 382 java/lang/IllegalArgumentException
   }

   public void calculate_11(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Integer
      // 01c: invokevirtual java/lang/Integer.intValue ()I
      // 01f: istore 5
      // 021: pop
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 71879129348960
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 130090695111598
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 7854175363861
      // 035: lxor
      // 036: lstore 10
      // 038: dup2
      // 039: ldc2_w 133502441676634
      // 03c: lxor
      // 03d: lstore 12
      // 03f: dup2
      // 040: ldc2_w 131278028038216
      // 043: lxor
      // 044: lstore 14
      // 046: pop2
      // 047: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 04a: aload 0
      // 04b: aload 0
      // 04c: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 04f: getfield rip/breeze/inject/ð.int_þ_2 I
      // 052: putfield rip/breeze/inject/MathUtil11.fieldInt_a I
      // 055: istore 16
      // 057: iload 16
      // 059: ifne 105
      // 05c: iload 4
      // 05e: sipush 255
      // 061: if_icmpgt 099
      // 064: goto 06b
      // 067: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06a: athrow
      // 06b: iload 5
      // 06d: bipush 127
      // 06f: lload 2
      // 070: lconst_0
      // 071: lcmp
      // 072: ifle 096
      // 075: iload 16
      // 077: ifne 096
      // 07a: goto 081
      // 07d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 080: athrow
      // 081: if_icmpgt 099
      // 084: goto 08b
      // 087: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08a: athrow
      // 08b: iload 5
      // 08d: bipush -128
      // 08f: goto 096
      // 092: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 095: athrow
      // 096: if_icmpge 110
      // 099: aload 0
      // 09a: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 09d: sipush 196
      // 0a0: lload 14
      // 0a2: bipush 2
      // 0a3: anewarray 141
      // 0a6: dup_x2
      // 0a7: dup_x2
      // 0a8: pop
      // 0a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ac: bipush 1
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x1
      // 0b0: swap
      // 0b1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b4: bipush 0
      // 0b5: swap
      // 0b6: aastore
      // 0b7: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0ba: sipush 132
      // 0bd: lload 6
      // 0bf: iload 4
      // 0c1: bipush 3
      // 0c2: anewarray 141
      // 0c5: dup_x1
      // 0c6: swap
      // 0c7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ca: bipush 2
      // 0cb: swap
      // 0cc: aastore
      // 0cd: dup_x2
      // 0ce: dup_x2
      // 0cf: pop
      // 0d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d3: bipush 1
      // 0d4: swap
      // 0d5: aastore
      // 0d6: dup_x1
      // 0d7: swap
      // 0d8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0db: bipush 0
      // 0dc: swap
      // 0dd: aastore
      // 0de: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0e1: iload 5
      // 0e3: lload 10
      // 0e5: bipush 2
      // 0e6: anewarray 141
      // 0e9: dup_x2
      // 0ea: dup_x2
      // 0eb: pop
      // 0ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ef: bipush 1
      // 0f0: swap
      // 0f1: aastore
      // 0f2: dup_x1
      // 0f3: swap
      // 0f4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f7: bipush 0
      // 0f8: swap
      // 0f9: aastore
      // 0fa: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0fd: pop
      // 0fe: goto 105
      // 101: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 104: athrow
      // 105: lload 2
      // 106: lconst_0
      // 107: lcmp
      // 108: ifle 15f
      // 10b: iload 16
      // 10d: ifeq 15f
      // 110: aload 0
      // 111: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 114: sipush 132
      // 117: lload 14
      // 119: bipush 2
      // 11a: anewarray 141
      // 11d: dup_x2
      // 11e: dup_x2
      // 11f: pop
      // 120: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 123: bipush 1
      // 124: swap
      // 125: aastore
      // 126: dup_x1
      // 127: swap
      // 128: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12b: bipush 0
      // 12c: swap
      // 12d: aastore
      // 12e: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 131: iload 4
      // 133: lload 12
      // 135: iload 5
      // 137: bipush 3
      // 138: anewarray 141
      // 13b: dup_x1
      // 13c: swap
      // 13d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 140: bipush 2
      // 141: swap
      // 142: aastore
      // 143: dup_x2
      // 144: dup_x2
      // 145: pop
      // 146: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 149: bipush 1
      // 14a: swap
      // 14b: aastore
      // 14c: dup_x1
      // 14d: swap
      // 14e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 151: bipush 0
      // 152: swap
      // 153: aastore
      // 154: invokevirtual rip/breeze/inject/ð.method_003 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 157: pop
      // 158: goto 15f
      // 15b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15e: athrow
      // 15f: aload 0
      // 160: iload 16
      // 162: ifne 1f6
      // 165: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 168: ifnull 1f5
      // 16b: goto 172
      // 16e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 171: athrow
      // 172: aload 0
      // 173: iload 16
      // 175: ifne 1bc
      // 178: goto 17f
      // 17b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17e: athrow
      // 17f: lload 2
      // 180: lconst_0
      // 181: lcmp
      // 182: iflt 1b5
      // 185: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 188: bipush 4
      // 189: if_icmpeq 1b4
      // 18c: goto 193
      // 18f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 192: athrow
      // 193: aload 0
      // 194: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 197: iload 16
      // 199: lload 2
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: ifle 1fb
      // 19f: ifne 1f9
      // 1a2: goto 1a9
      // 1a5: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a8: athrow
      // 1a9: bipush 3
      // 1aa: if_icmpne 1f5
      // 1ad: goto 1b4
      // 1b0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: goto 1bc
      // 1b8: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1bb: athrow
      // 1bc: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 1bf: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 1c2: sipush 132
      // 1c5: iload 4
      // 1c7: lload 8
      // 1c9: aconst_null
      // 1ca: aconst_null
      // 1cb: bipush 5
      // 1cc: anewarray 141
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: bipush 4
      // 1d2: swap
      // 1d3: aastore
      // 1d4: dup_x1
      // 1d5: swap
      // 1d6: bipush 3
      // 1d7: swap
      // 1d8: aastore
      // 1d9: dup_x2
      // 1da: dup_x2
      // 1db: pop
      // 1dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1df: bipush 2
      // 1e0: swap
      // 1e1: aastore
      // 1e2: dup_x1
      // 1e3: swap
      // 1e4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e7: bipush 1
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ef: bipush 0
      // 1f0: swap
      // 1f1: aastore
      // 1f2: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 1f5: aload 0
      // 1f6: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 1f9: iload 16
      // 1fb: ifne 213
      // 1fe: ifeq 231
      // 201: goto 208
      // 204: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 207: athrow
      // 208: iload 4
      // 20a: bipush 1
      // 20b: iadd
      // 20c: goto 213
      // 20f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 212: athrow
      // 213: istore 17
      // 215: lload 2
      // 216: lconst_0
      // 217: lcmp
      // 218: ifle 22a
      // 21b: iload 17
      // 21d: aload 0
      // 21e: getfield rip/breeze/inject/MathUtil11.int_ì I
      // 221: if_icmple 231
      // 224: aload 0
      // 225: iload 17
      // 227: putfield rip/breeze/inject/MathUtil11.int_ì I
      // 22a: goto 231
      // 22d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 230: athrow
      // 231: return
      // try (49 -> 54): 55 java/lang/IllegalArgumentException
      // try (51 -> 65): 66 java/lang/IllegalArgumentException
      // try (57 -> 69): 70 java/lang/IllegalArgumentException
      // try (68 -> 74): 75 java/lang/IllegalArgumentException
      // try (77 -> 142): 143 java/lang/IllegalArgumentException
      // try (145 -> 197): 198 java/lang/IllegalArgumentException
      // try (200 -> 205): 206 java/lang/IllegalArgumentException
      // try (203 -> 211): 212 java/lang/IllegalArgumentException
      // try (208 -> 221): 222 java/lang/IllegalArgumentException
      // try (214 -> 232): 233 java/lang/IllegalArgumentException
      // try (224 -> 237): 238 java/lang/IllegalArgumentException
      // try (235 -> 241): 242 java/lang/IllegalArgumentException
      // try (285 -> 288): 289 java/lang/IllegalArgumentException
      // try (287 -> 294): 295 java/lang/IllegalArgumentException
      // try (298 -> 309): 310 java/lang/IllegalArgumentException
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void calculate_12(Object... var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      int var5 = (Integer)var1[2];
      ª var6 = (ª)var1[3];
      ª[] var7 = (ª[])var1[4];
      long var8 = var2 ^ 51607574227678L;
      long var10 = var2 ^ 38487041257309L;
      long var12 = var2 ^ 120942804431652L;
      long var14 = var2 ^ 88792313405766L;
      long var16 = var2 ^ 26408499082201L;
      this.fieldInt_a = this.ð_ë.int_þ_2;
      ð var10000 = this.ð_ë;
      Object[] var10004 = new Object[]{null, var12};
      var10004[0] = 170;
      var10000 = var10000.method_002(var10004);
      int var10003 = (4 - this.ð_ë.int_þ_2 % 4) % 4;
      Object[] var10006 = new Object[]{null, null, null, var16};
      var10006[2] = var10003;
      var10006[1] = 0;
      var10006[0] = null;
      var10000.method_012(var10006);
      ð var10001 = this.ð_ë;
      var10003 = this.fieldInt_a;
      var10006 = new Object[]{null, null, null, true};
      var10006[2] = var10003;
      var10006[1] = var8;
      var10006[0] = var10001;
      var6.method_005(var10006);
      int var26 = Util140.getValue_2();
      var10001 = this.ð_ë;
      Object[] var10005 = new Object[]{null, var14};
      var10005[0] = var4;
      var10001 = var10001.method_007(var10005);
      var10005 = new Object[]{null, var14};
      var10005[0] = var5;
      var10001.method_007(var10005);
      int var18 = var26;
      ª[] var19 = var7;
      int var20 = var19.length;
      int var21 = 0;

      label38:
      while (var21 < var20) {
         ª var22 = var19[var21];

         try {
            var10001 = this.ð_ë;
            var10003 = this.fieldInt_a;
            var10006 = new Object[]{null, null, null, true};
            var10006[2] = var10003;
            var10006[1] = var8;
            var10006[0] = var10001;
            var22.method_005(var10006);
            var21++;
         } catch (IllegalArgumentException var23) {
            throw getIllegalArgumentException(var23);
         }

         do {
            try {
               int var27 = var18;
               if (var2 > 0L) {
                  if (var18 == 0) {
                     return;
                  }

                  var27 = var18;
               }

               if (var27 != 0) {
                  continue label38;
               }
            } catch (IllegalArgumentException var24) {
               throw getIllegalArgumentException(var24);
            }
         } while (var2 <= 0L);
         break;
      }

      this.calculate_14(new Object[]{var6, var10, var7});
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void calculate_13(Object[] var1) {
      ª var2 = (ª)var1[0];
      int[] var3 = (int[])var1[1];
      long var4 = (Long)var1[2];
      ª[] var6 = (ª[])var1[3];
      long var7 = var4 ^ 127174249946749L;
      long var9 = var4 ^ 138835534224382L;
      long var11 = var4 ^ 53579385292679L;
      long var13 = var4 ^ 14861905139173L;
      long var15 = var4 ^ 76147252250490L;
      this.fieldInt_a = this.ð_ë.int_þ_2;
      int var10000 = Util140.getValue();
      ð var10001 = this.ð_ë;
      Object[] var10005 = new Object[]{null, var11};
      var10005[0] = 171;
      var10001 = var10001.method_002(var10005);
      int var10004 = (4 - this.ð_ë.int_þ_2 % 4) % 4;
      Object[] var10007 = new Object[]{null, null, null, var15};
      var10007[2] = var10004;
      var10007[1] = 0;
      var10007[0] = null;
      var10001.method_012(var10007);
      ð var10002 = this.ð_ë;
      var10004 = this.fieldInt_a;
      var10007 = new Object[]{null, null, null, true};
      var10007[2] = var10004;
      var10007[1] = var7;
      var10007[0] = var10002;
      var2.method_005(var10007);
      var10001 = this.ð_ë;
      int var28 = var6.length;
      var10005 = new Object[]{null, var13};
      var10005[0] = var28;
      var10001.method_007(var10005);
      int var17 = 0;
      int var18 = var10000;

      label36:
      while (var17 < var6.length) {
         try {
            ð var21 = this.ð_ë;
            int var26 = var3[var17];
            Object[] var30 = new Object[]{null, var13};
            var30[0] = var26;
            var21.method_007(var30);
            ª var22 = var6[var17];
            var10001 = this.ð_ë;
            int var10003 = this.fieldInt_a;
            Object[] var10006 = new Object[]{null, null, null, true};
            var10006[2] = var10003;
            var10006[1] = var7;
            var10006[0] = var10001;
            var22.method_005(var10006);
            var17++;
         } catch (IllegalArgumentException var19) {
            throw getIllegalArgumentException(var19);
         }

         do {
            try {
               var10000 = var18;
               if (var4 >= 0L) {
                  if (var18 != 0) {
                     return;
                  }

                  var10000 = var18;
               }

               if (var10000 == 0) {
                  continue label36;
               }
            } catch (IllegalArgumentException var20) {
               throw getIllegalArgumentException(var20);
            }
         } while (var4 <= 0L);
         break;
      }

      this.calculate_14(new Object[]{var2, var9, var6});
   }

   private void calculate_14(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/ª
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
      // 015: checkcast [Lrip/breeze/inject/ª;
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 115805759912815
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 125011428589846
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 100476891599534
      // 034: lxor
      // 035: lstore 10
      // 037: pop2
      // 038: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 03b: istore 12
      // 03d: aload 0
      // 03e: iload 12
      // 040: ifne 058
      // 043: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 046: ifnull 1fa
      // 049: goto 050
      // 04c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04f: athrow
      // 050: aload 0
      // 051: goto 058
      // 054: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 057: athrow
      // 058: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 05b: bipush 4
      // 05c: iload 12
      // 05e: ifne 16b
      // 061: if_icmpne 153
      // 064: goto 06b
      // 067: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 06f: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 072: sipush 171
      // 075: bipush 0
      // 076: lload 6
      // 078: aconst_null
      // 079: aconst_null
      // 07a: bipush 5
      // 07b: anewarray 141
      // 07e: dup_x1
      // 07f: swap
      // 080: bipush 4
      // 081: swap
      // 082: aastore
      // 083: dup_x1
      // 084: swap
      // 085: bipush 3
      // 086: swap
      // 087: aastore
      // 088: dup_x2
      // 089: dup_x2
      // 08a: pop
      // 08b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08e: bipush 2
      // 08f: swap
      // 090: aastore
      // 091: dup_x1
      // 092: swap
      // 093: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 096: bipush 1
      // 097: swap
      // 098: aastore
      // 099: dup_x1
      // 09a: swap
      // 09b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09e: bipush 0
      // 09f: swap
      // 0a0: aastore
      // 0a1: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 0a4: aload 0
      // 0a5: bipush 0
      // 0a6: aload 2
      // 0a7: bipush 2
      // 0a8: anewarray 141
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: bipush 1
      // 0ae: swap
      // 0af: aastore
      // 0b0: dup_x1
      // 0b1: swap
      // 0b2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: invokevirtual rip/breeze/inject/MathUtil11.method_006 ([Ljava/lang/Object;)V
      // 0bb: aload 2
      // 0bc: lload 10
      // 0be: bipush 1
      // 0bf: anewarray 141
      // 0c2: dup_x2
      // 0c3: dup_x2
      // 0c4: pop
      // 0c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c8: bipush 0
      // 0c9: swap
      // 0ca: aastore
      // 0cb: invokevirtual rip/breeze/inject/ª.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ª;
      // 0ce: dup
      // 0cf: getfield rip/breeze/inject/ª.short_í_2 S
      // 0d2: bipush 2
      // 0d3: ior
      // 0d4: i2s
      // 0d5: putfield rip/breeze/inject/ª.short_í_2 S
      // 0d8: aload 5
      // 0da: astore 13
      // 0dc: aload 13
      // 0de: arraylength
      // 0df: istore 14
      // 0e1: bipush 0
      // 0e2: istore 15
      // 0e4: iload 15
      // 0e6: iload 14
      // 0e8: if_icmpge 148
      // 0eb: aload 13
      // 0ed: iload 15
      // 0ef: aaload
      // 0f0: astore 16
      // 0f2: aload 0
      // 0f3: bipush 0
      // 0f4: aload 16
      // 0f6: bipush 2
      // 0f7: anewarray 141
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: bipush 1
      // 0fd: swap
      // 0fe: aastore
      // 0ff: dup_x1
      // 100: swap
      // 101: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 104: bipush 0
      // 105: swap
      // 106: aastore
      // 107: invokevirtual rip/breeze/inject/MathUtil11.method_006 ([Ljava/lang/Object;)V
      // 10a: aload 16
      // 10c: lload 10
      // 10e: bipush 1
      // 10f: anewarray 141
      // 112: dup_x2
      // 113: dup_x2
      // 114: pop
      // 115: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 118: bipush 0
      // 119: swap
      // 11a: aastore
      // 11b: invokevirtual rip/breeze/inject/ª.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ª;
      // 11e: dup
      // 11f: getfield rip/breeze/inject/ª.short_í_2 S
      // 122: bipush 2
      // 123: ior
      // 124: i2s
      // 125: putfield rip/breeze/inject/ª.short_í_2 S
      // 128: iinc 15 1
      // 12b: iload 12
      // 12d: lload 3
      // 12e: lconst_0
      // 12f: lcmp
      // 130: ifle 138
      // 133: ifne 1e7
      // 136: iload 12
      // 138: ifeq 0e4
      // 13b: lload 3
      // 13c: lconst_0
      // 13d: lcmp
      // 13e: ifle 12b
      // 141: goto 148
      // 144: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 147: athrow
      // 148: lload 3
      // 149: lconst_0
      // 14a: lcmp
      // 14b: iflt 153
      // 14e: iload 12
      // 150: ifeq 1e7
      // 153: aload 0
      // 154: iload 12
      // 156: ifne 1e8
      // 159: goto 160
      // 15c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15f: athrow
      // 160: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 163: bipush 1
      // 164: goto 16b
      // 167: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16a: athrow
      // 16b: if_icmpne 1e7
      // 16e: aload 0
      // 16f: dup
      // 170: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 173: bipush 1
      // 174: isub
      // 175: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 178: aload 0
      // 179: aload 0
      // 17a: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 17d: aload 2
      // 17e: bipush 2
      // 17f: anewarray 141
      // 182: dup_x1
      // 183: swap
      // 184: bipush 1
      // 185: swap
      // 186: aastore
      // 187: dup_x1
      // 188: swap
      // 189: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 18c: bipush 0
      // 18d: swap
      // 18e: aastore
      // 18f: invokevirtual rip/breeze/inject/MathUtil11.method_006 ([Ljava/lang/Object;)V
      // 192: aload 5
      // 194: astore 13
      // 196: aload 13
      // 198: arraylength
      // 199: istore 14
      // 19b: bipush 0
      // 19c: istore 15
      // 19e: iload 15
      // 1a0: iload 14
      // 1a2: if_icmpge 1e7
      // 1a5: aload 13
      // 1a7: iload 15
      // 1a9: aaload
      // 1aa: astore 16
      // 1ac: aload 0
      // 1ad: aload 0
      // 1ae: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 1b1: aload 16
      // 1b3: bipush 2
      // 1b4: anewarray 141
      // 1b7: dup_x1
      // 1b8: swap
      // 1b9: bipush 1
      // 1ba: swap
      // 1bb: aastore
      // 1bc: dup_x1
      // 1bd: swap
      // 1be: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c1: bipush 0
      // 1c2: swap
      // 1c3: aastore
      // 1c4: invokevirtual rip/breeze/inject/MathUtil11.method_006 ([Ljava/lang/Object;)V
      // 1c7: iinc 15 1
      // 1ca: iload 12
      // 1cc: lload 3
      // 1cd: lconst_0
      // 1ce: lcmp
      // 1cf: ifle 1d7
      // 1d2: ifne 1fa
      // 1d5: iload 12
      // 1d7: ifeq 19e
      // 1da: lload 3
      // 1db: lconst_0
      // 1dc: lcmp
      // 1dd: iflt 1ca
      // 1e0: goto 1e7
      // 1e3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e6: athrow
      // 1e7: aload 0
      // 1e8: lload 8
      // 1ea: bipush 1
      // 1eb: anewarray 141
      // 1ee: dup_x2
      // 1ef: dup_x2
      // 1f0: pop
      // 1f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f4: bipush 0
      // 1f5: swap
      // 1f6: aastore
      // 1f7: invokevirtual rip/breeze/inject/MathUtil11.processAll_6 ([Ljava/lang/Object;)V
      // 1fa: return
      // try (38 -> 43): 44 java/lang/IllegalArgumentException
      // try (41 -> 47): 48 java/lang/IllegalArgumentException
      // try (50 -> 55): 56 java/lang/IllegalArgumentException
      // try (147 -> 191): 196 java/lang/IllegalArgumentException
      // try (198 -> 207): 208 java/lang/IllegalArgumentException
      // try (204 -> 212): 213 java/lang/IllegalArgumentException
      // try (254 -> 281): 286 java/lang/IllegalArgumentException
   }

   public void calculate_15(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Long
      // 018: invokevirtual java/lang/Long.longValue ()J
      // 01b: lstore 4
      // 01d: pop
      // 01e: lload 4
      // 020: dup2
      // 021: ldc2_w 336166558200
      // 024: lxor
      // 025: lstore 6
      // 027: dup2
      // 028: ldc2_w 60752132411702
      // 02b: lxor
      // 02c: lstore 8
      // 02e: dup2
      // 02f: ldc2_w 49175364985826
      // 032: lxor
      // 033: lstore 10
      // 035: dup2
      // 036: ldc2_w 59873468629712
      // 039: lxor
      // 03a: lstore 12
      // 03c: pop2
      // 03d: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 040: aload 0
      // 041: aload 0
      // 042: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 045: getfield rip/breeze/inject/ð.int_þ_2 I
      // 048: putfield rip/breeze/inject/MathUtil11.fieldInt_a I
      // 04b: aload 0
      // 04c: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 04f: aload 2
      // 050: lload 10
      // 052: bipush 2
      // 053: anewarray 141
      // 056: dup_x2
      // 057: dup_x2
      // 058: pop
      // 059: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05c: bipush 1
      // 05d: swap
      // 05e: aastore
      // 05f: dup_x1
      // 060: swap
      // 061: bipush 0
      // 062: swap
      // 063: aastore
      // 064: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 067: astore 14
      // 069: istore 15
      // 06b: aload 0
      // 06c: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 06f: sipush 197
      // 072: aload 14
      // 074: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 077: lload 6
      // 079: dup2_x1
      // 07a: pop2
      // 07b: bipush 3
      // 07c: anewarray 141
      // 07f: dup_x1
      // 080: swap
      // 081: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 084: bipush 2
      // 085: swap
      // 086: aastore
      // 087: dup_x2
      // 088: dup_x2
      // 089: pop
      // 08a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08d: bipush 1
      // 08e: swap
      // 08f: aastore
      // 090: dup_x1
      // 091: swap
      // 092: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 095: bipush 0
      // 096: swap
      // 097: aastore
      // 098: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 09b: iload 3
      // 09c: lload 12
      // 09e: bipush 2
      // 09f: anewarray 141
      // 0a2: dup_x2
      // 0a3: dup_x2
      // 0a4: pop
      // 0a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a8: bipush 1
      // 0a9: swap
      // 0aa: aastore
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b0: bipush 0
      // 0b1: swap
      // 0b2: aastore
      // 0b3: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0b6: pop
      // 0b7: aload 0
      // 0b8: iload 15
      // 0ba: ifne 0d2
      // 0bd: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 0c0: ifnull 178
      // 0c3: goto 0ca
      // 0c6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: goto 0d2
      // 0ce: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d1: athrow
      // 0d2: lload 4
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: iflt 11d
      // 0d9: iload 15
      // 0db: ifne 11d
      // 0de: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 0e1: bipush 4
      // 0e2: if_icmpeq 115
      // 0e5: goto 0ec
      // 0e8: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: iload 15
      // 0ef: lload 4
      // 0f1: lconst_0
      // 0f2: lcmp
      // 0f3: iflt 175
      // 0f6: ifne 16d
      // 0f9: goto 100
      // 0fc: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ff: athrow
      // 100: lload 4
      // 102: lconst_0
      // 103: lcmp
      // 104: iflt 166
      // 107: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 10a: bipush 3
      // 10b: if_icmpne 165
      // 10e: goto 115
      // 111: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 114: athrow
      // 115: aload 0
      // 116: goto 11d
      // 119: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11c: athrow
      // 11d: lload 4
      // 11f: lconst_0
      // 120: lcmp
      // 121: iflt 166
      // 124: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // 127: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 12a: sipush 197
      // 12d: iload 3
      // 12e: lload 8
      // 130: aload 14
      // 132: aload 0
      // 133: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 136: bipush 5
      // 137: anewarray 141
      // 13a: dup_x1
      // 13b: swap
      // 13c: bipush 4
      // 13d: swap
      // 13e: aastore
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 3
      // 142: swap
      // 143: aastore
      // 144: dup_x2
      // 145: dup_x2
      // 146: pop
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: bipush 2
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 152: bipush 1
      // 153: swap
      // 154: aastore
      // 155: dup_x1
      // 156: swap
      // 157: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15a: bipush 0
      // 15b: swap
      // 15c: aastore
      // 15d: invokevirtual rip/breeze/inject/à.method_019 ([Ljava/lang/Object;)V
      // 160: iload 15
      // 162: ifeq 178
      // 165: aload 0
      // 166: goto 16d
      // 169: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16c: athrow
      // 16d: dup
      // 16e: getfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 171: bipush 1
      // 172: iload 3
      // 173: isub
      // 174: iadd
      // 175: putfield rip/breeze/inject/MathUtil11.fieldInt_i I
      // 178: return
      // try (64 -> 118): 119 java/lang/IllegalArgumentException
      // try (116 -> 122): 123 java/lang/IllegalArgumentException
      // try (125 -> 134): 135 java/lang/IllegalArgumentException
      // try (131 -> 144): 145 java/lang/IllegalArgumentException
      // try (137 -> 154): 155 java/lang/IllegalArgumentException
      // try (147 -> 158): 159 java/lang/IllegalArgumentException
      // try (161 -> 208): 209 java/lang/IllegalArgumentException
   }

   @Override
   public ü getÜ_5(Object[] var1) {
      int var2 = (Integer)var1[0];
      և var3 = (և)var1[1];
      String var4 = (String)var1[2];
      long var5 = (Long)var1[3];
      boolean var7 = (Boolean)var1[4];
      long var8 = var5 ^ 138961442913588L;

      try {
         if (var7) {
            int var11 = var2 & -16776961 | this.fieldInt_a << 8;
            û var12 = this.û_à;
            Object[] var13 = new Object[]{null, this.dataBuilder4_ó, var11, var3, var4, var12};
            var13[0] = var8;
            return this.û_à = û.method_002(var13);
         }
      } catch (IllegalArgumentException var10) {
         throw getIllegalArgumentException(var10);
      }

      int var10003 = var2 & -16776961 | this.fieldInt_a << 8;
      û var10006 = this.û_ß;
      Object[] var10008 = new Object[]{null, this.dataBuilder4_ó, var10003, var3, var4, var10006};
      var10008[0] = var8;
      return this.û_ß = û.method_002(var10008);
   }

   @Override
   public void processAll_4(Object[] param1) {
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
      // 04: checkcast rip/breeze/inject/ª
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast rip/breeze/inject/ª
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast rip/breeze/inject/ª
      // 15: astore 4
      // 17: dup
      // 18: bipush 3
      // 19: aaload
      // 1a: checkcast java/lang/String
      // 1d: astore 5
      // 1f: dup
      // 20: bipush 4
      // 21: aaload
      // 22: checkcast java/lang/Long
      // 25: invokevirtual java/lang/Long.longValue ()J
      // 28: lstore 6
      // 2a: pop
      // 2b: lload 6
      // 2d: dup2
      // 2e: ldc2_w 91105582558753
      // 31: lxor
      // 32: lstore 8
      // 34: pop2
      // 35: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 38: istore 10
      // 3a: new rip/breeze/inject/µ
      // 3d: dup
      // 3e: aload 2
      // 3f: aload 3
      // 40: aload 4
      // 42: aload 5
      // 44: ifnull 6e
      // 47: aload 0
      // 48: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 4b: aload 5
      // 4d: lload 8
      // 4f: bipush 2
      // 50: anewarray 141
      // 53: dup_x2
      // 54: dup_x2
      // 55: pop
      // 56: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59: bipush 1
      // 5a: swap
      // 5b: aastore
      // 5c: dup_x1
      // 5d: swap
      // 5e: bipush 0
      // 5f: swap
      // 60: aastore
      // 61: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 64: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 67: goto 6f
      // 6a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6d: athrow
      // 6e: bipush 0
      // 6f: aload 5
      // 71: invokespecial rip/breeze/inject/µ.<init> (Lrip/breeze/inject/ª;Lrip/breeze/inject/ª;Lrip/breeze/inject/ª;ILjava/lang/String;)V
      // 74: astore 11
      // 76: aload 0
      // 77: getfield rip/breeze/inject/MathUtil11.µ_ê Lrip/breeze/inject/µ;
      // 7a: iload 10
      // 7c: ifne ad
      // 7f: ifnonnull a2
      // 82: goto 89
      // 85: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 88: athrow
      // 89: aload 0
      // 8a: aload 11
      // 8c: putfield rip/breeze/inject/MathUtil11.µ_ê Lrip/breeze/inject/µ;
      // 8f: lload 6
      // 91: lconst_0
      // 92: lcmp
      // 93: ifle b8
      // 96: iload 10
      // 98: ifeq b2
      // 9b: goto a2
      // 9e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a1: athrow
      // a2: aload 0
      // a3: getfield rip/breeze/inject/MathUtil11.µ_é Lrip/breeze/inject/µ;
      // a6: goto ad
      // a9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ac: athrow
      // ad: aload 11
      // af: putfield rip/breeze/inject/µ.µ_ú_2 Lrip/breeze/inject/µ;
      // b2: aload 0
      // b3: aload 11
      // b5: putfield rip/breeze/inject/MathUtil11.µ_é Lrip/breeze/inject/µ;
      // b8: return
      // try (36 -> 64): 64 java/lang/IllegalArgumentException
      // try (70 -> 75): 76 java/lang/IllegalArgumentException
      // try (74 -> 87): 88 java/lang/IllegalArgumentException
      // try (78 -> 92): 93 java/lang/IllegalArgumentException
   }

   @Override
   public ü getÜ_6(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      և var5 = (և)var1[2];
      String var6 = (String)var1[3];
      boolean var7 = (Boolean)var1[4];
      long var8 = var3 ^ 5672577489533L;

      try {
         if (var7) {
            û var11 = this.û_à;
            Object[] var12 = new Object[]{null, this.dataBuilder4_ó, var2, var5, var6, var11};
            var12[0] = var8;
            return this.û_à = û.method_002(var12);
         }
      } catch (IllegalArgumentException var10) {
         throw getIllegalArgumentException(var10);
      }

      û var10006 = this.û_ß;
      Object[] var10008 = new Object[]{null, this.dataBuilder4_ó, var2, var5, var6, var10006};
      var10008[0] = var8;
      return this.û_ß = û.method_002(var10008);
   }

   public void calculate_16(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/String
      // 015: astore 4
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast rip/breeze/inject/ª
      // 01d: astore 5
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Long
      // 025: invokevirtual java/lang/Long.longValue ()J
      // 028: lstore 6
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast rip/breeze/inject/ª
      // 030: astore 8
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/lang/Integer
      // 039: invokevirtual java/lang/Integer.intValue ()I
      // 03c: istore 9
      // 03e: pop
      // 03f: lload 6
      // 041: dup2
      // 042: ldc2_w 125545838139523
      // 045: lxor
      // 046: lstore 10
      // 048: dup2
      // 049: ldc2_w 13856236231231
      // 04c: lxor
      // 04d: lstore 12
      // 04f: pop2
      // 050: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 053: istore 14
      // 055: aload 4
      // 057: ifnull 169
      // 05a: aload 0
      // 05b: getfield rip/breeze/inject/MathUtil11.ð_ã Lrip/breeze/inject/ð;
      // 05e: iload 14
      // 060: ifne 168
      // 063: goto 06a
      // 066: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 069: athrow
      // 06a: lload 6
      // 06c: lconst_0
      // 06d: lcmp
      // 06e: iflt 14c
      // 071: ifnonnull 08d
      // 074: goto 07b
      // 077: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07a: athrow
      // 07b: aload 0
      // 07c: new rip/breeze/inject/ð
      // 07f: dup
      // 080: invokespecial rip/breeze/inject/ð.<init> ()V
      // 083: putfield rip/breeze/inject/MathUtil11.ð_ã Lrip/breeze/inject/ð;
      // 086: goto 08d
      // 089: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08c: athrow
      // 08d: aload 0
      // 08e: dup
      // 08f: getfield rip/breeze/inject/MathUtil11.int_ä I
      // 092: bipush 1
      // 093: iadd
      // 094: putfield rip/breeze/inject/MathUtil11.int_ä I
      // 097: aload 0
      // 098: getfield rip/breeze/inject/MathUtil11.ð_ã Lrip/breeze/inject/ð;
      // 09b: aload 5
      // 09d: getfield rip/breeze/inject/ª.int_ê_2 I
      // 0a0: lload 10
      // 0a2: bipush 2
      // 0a3: anewarray 141
      // 0a6: dup_x2
      // 0a7: dup_x2
      // 0a8: pop
      // 0a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ac: bipush 1
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x1
      // 0b0: swap
      // 0b1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b4: bipush 0
      // 0b5: swap
      // 0b6: aastore
      // 0b7: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0ba: aload 8
      // 0bc: getfield rip/breeze/inject/ª.int_ê_2 I
      // 0bf: aload 5
      // 0c1: getfield rip/breeze/inject/ª.int_ê_2 I
      // 0c4: isub
      // 0c5: lload 10
      // 0c7: bipush 2
      // 0c8: anewarray 141
      // 0cb: dup_x2
      // 0cc: dup_x2
      // 0cd: pop
      // 0ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d1: bipush 1
      // 0d2: swap
      // 0d3: aastore
      // 0d4: dup_x1
      // 0d5: swap
      // 0d6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d9: bipush 0
      // 0da: swap
      // 0db: aastore
      // 0dc: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0df: aload 0
      // 0e0: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0e3: lload 12
      // 0e5: aload 2
      // 0e6: bipush 2
      // 0e7: anewarray 141
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: bipush 1
      // 0ed: swap
      // 0ee: aastore
      // 0ef: dup_x2
      // 0f0: dup_x2
      // 0f1: pop
      // 0f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f5: bipush 0
      // 0f6: swap
      // 0f7: aastore
      // 0f8: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 0fb: lload 10
      // 0fd: bipush 2
      // 0fe: anewarray 141
      // 101: dup_x2
      // 102: dup_x2
      // 103: pop
      // 104: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 107: bipush 1
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10f: bipush 0
      // 110: swap
      // 111: aastore
      // 112: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 115: aload 0
      // 116: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 119: lload 12
      // 11b: aload 4
      // 11d: bipush 2
      // 11e: anewarray 141
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
      // 12f: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 132: lload 10
      // 134: bipush 2
      // 135: anewarray 141
      // 138: dup_x2
      // 139: dup_x2
      // 13a: pop
      // 13b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13e: bipush 1
      // 13f: swap
      // 140: aastore
      // 141: dup_x1
      // 142: swap
      // 143: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 146: bipush 0
      // 147: swap
      // 148: aastore
      // 149: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 14c: iload 9
      // 14e: lload 10
      // 150: bipush 2
      // 151: anewarray 141
      // 154: dup_x2
      // 155: dup_x2
      // 156: pop
      // 157: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15a: bipush 1
      // 15b: swap
      // 15c: aastore
      // 15d: dup_x1
      // 15e: swap
      // 15f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 162: bipush 0
      // 163: swap
      // 164: aastore
      // 165: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 168: pop
      // 169: aload 0
      // 16a: getfield rip/breeze/inject/MathUtil11.ð_å Lrip/breeze/inject/ð;
      // 16d: lload 6
      // 16f: lconst_0
      // 170: lcmp
      // 171: ifle 26f
      // 174: iload 14
      // 176: ifne 26f
      // 179: ifnonnull 195
      // 17c: goto 183
      // 17f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 182: athrow
      // 183: aload 0
      // 184: new rip/breeze/inject/ð
      // 187: dup
      // 188: invokespecial rip/breeze/inject/ð.<init> ()V
      // 18b: putfield rip/breeze/inject/MathUtil11.ð_å Lrip/breeze/inject/ð;
      // 18e: goto 195
      // 191: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 194: athrow
      // 195: aload 0
      // 196: dup
      // 197: getfield rip/breeze/inject/MathUtil11.int_æ I
      // 19a: bipush 1
      // 19b: iadd
      // 19c: putfield rip/breeze/inject/MathUtil11.int_æ I
      // 19f: aload 0
      // 1a0: getfield rip/breeze/inject/MathUtil11.ð_å Lrip/breeze/inject/ð;
      // 1a3: aload 5
      // 1a5: getfield rip/breeze/inject/ª.int_ê_2 I
      // 1a8: lload 10
      // 1aa: bipush 2
      // 1ab: anewarray 141
      // 1ae: dup_x2
      // 1af: dup_x2
      // 1b0: pop
      // 1b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b4: bipush 1
      // 1b5: swap
      // 1b6: aastore
      // 1b7: dup_x1
      // 1b8: swap
      // 1b9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1bc: bipush 0
      // 1bd: swap
      // 1be: aastore
      // 1bf: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1c2: aload 8
      // 1c4: getfield rip/breeze/inject/ª.int_ê_2 I
      // 1c7: aload 5
      // 1c9: getfield rip/breeze/inject/ª.int_ê_2 I
      // 1cc: isub
      // 1cd: lload 10
      // 1cf: bipush 2
      // 1d0: anewarray 141
      // 1d3: dup_x2
      // 1d4: dup_x2
      // 1d5: pop
      // 1d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d9: bipush 1
      // 1da: swap
      // 1db: aastore
      // 1dc: dup_x1
      // 1dd: swap
      // 1de: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e1: bipush 0
      // 1e2: swap
      // 1e3: aastore
      // 1e4: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1e7: aload 0
      // 1e8: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 1eb: lload 12
      // 1ed: aload 2
      // 1ee: bipush 2
      // 1ef: anewarray 141
      // 1f2: dup_x1
      // 1f3: swap
      // 1f4: bipush 1
      // 1f5: swap
      // 1f6: aastore
      // 1f7: dup_x2
      // 1f8: dup_x2
      // 1f9: pop
      // 1fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fd: bipush 0
      // 1fe: swap
      // 1ff: aastore
      // 200: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 203: lload 10
      // 205: bipush 2
      // 206: anewarray 141
      // 209: dup_x2
      // 20a: dup_x2
      // 20b: pop
      // 20c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20f: bipush 1
      // 210: swap
      // 211: aastore
      // 212: dup_x1
      // 213: swap
      // 214: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 217: bipush 0
      // 218: swap
      // 219: aastore
      // 21a: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 21d: aload 0
      // 21e: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 221: lload 12
      // 223: aload 3
      // 224: bipush 2
      // 225: anewarray 141
      // 228: dup_x1
      // 229: swap
      // 22a: bipush 1
      // 22b: swap
      // 22c: aastore
      // 22d: dup_x2
      // 22e: dup_x2
      // 22f: pop
      // 230: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 233: bipush 0
      // 234: swap
      // 235: aastore
      // 236: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 239: lload 10
      // 23b: bipush 2
      // 23c: anewarray 141
      // 23f: dup_x2
      // 240: dup_x2
      // 241: pop
      // 242: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 245: bipush 1
      // 246: swap
      // 247: aastore
      // 248: dup_x1
      // 249: swap
      // 24a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 24d: bipush 0
      // 24e: swap
      // 24f: aastore
      // 250: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 253: iload 9
      // 255: lload 10
      // 257: bipush 2
      // 258: anewarray 141
      // 25b: dup_x2
      // 25c: dup_x2
      // 25d: pop
      // 25e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 261: bipush 1
      // 262: swap
      // 263: aastore
      // 264: dup_x1
      // 265: swap
      // 266: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 269: bipush 0
      // 26a: swap
      // 26b: aastore
      // 26c: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 26f: pop
      // 270: aload 0
      // 271: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 274: iload 14
      // 276: ifne 28f
      // 279: ifeq 2f3
      // 27c: goto 283
      // 27f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 282: athrow
      // 283: aload 3
      // 284: bipush 0
      // 285: invokevirtual java/lang/String.charAt (I)C
      // 288: goto 28f
      // 28b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28e: athrow
      // 28f: istore 15
      // 291: iload 9
      // 293: iload 15
      // 295: iload 14
      // 297: lload 6
      // 299: lconst_0
      // 29a: lcmp
      // 29b: iflt 2a3
      // 29e: ifne 2cf
      // 2a1: bipush 74
      // 2a3: if_icmpeq 2c7
      // 2a6: goto 2ad
      // 2a9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ac: athrow
      // 2ad: iload 15
      // 2af: iload 14
      // 2b1: ifne 2cf
      // 2b4: goto 2bb
      // 2b7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ba: athrow
      // 2bb: bipush 68
      // 2bd: if_icmpne 2d2
      // 2c0: goto 2c7
      // 2c3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c6: athrow
      // 2c7: bipush 2
      // 2c8: goto 2cf
      // 2cb: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ce: athrow
      // 2cf: goto 2d3
      // 2d2: bipush 1
      // 2d3: iadd
      // 2d4: istore 16
      // 2d6: lload 6
      // 2d8: lconst_0
      // 2d9: lcmp
      // 2da: iflt 2ec
      // 2dd: iload 16
      // 2df: aload 0
      // 2e0: getfield rip/breeze/inject/MathUtil11.int_ì I
      // 2e3: if_icmple 2f3
      // 2e6: aload 0
      // 2e7: iload 16
      // 2e9: putfield rip/breeze/inject/MathUtil11.int_ì I
      // 2ec: goto 2f3
      // 2ef: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2f2: athrow
      // 2f3: return
      // try (51 -> 57): 58 java/lang/IllegalArgumentException
      // try (53 -> 65): 66 java/lang/IllegalArgumentException
      // try (60 -> 73): 74 java/lang/IllegalArgumentException
      // try (216 -> 225): 226 java/lang/IllegalArgumentException
      // try (224 -> 233): 234 java/lang/IllegalArgumentException
      // try (375 -> 381): 382 java/lang/IllegalArgumentException
      // try (380 -> 387): 388 java/lang/IllegalArgumentException
      // try (391 -> 401): 402 java/lang/IllegalArgumentException
      // try (399 -> 407): 408 java/lang/IllegalArgumentException
      // try (404 -> 412): 413 java/lang/IllegalArgumentException
      // try (410 -> 416): 417 java/lang/IllegalArgumentException
      // try (423 -> 434): 435 java/lang/IllegalArgumentException
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @Override
   public ü getÜ_7(Object[] var1) {
      int var2 = (Integer)var1[0];
      և var3 = (և)var1[1];
      long var4 = (Long)var1[2];
      ª[] var6 = (ª[])var1[3];
      ª[] var7 = (ª[])var1[4];
      int[] var8 = (int[])var1[5];
      String var9 = (String)var1[6];
      byte var10 = (Boolean)var1[7];
      long var11 = var4 ^ 126221585193323L;
      long var13 = var4 ^ 2806724483638L;
      long var15 = var4 ^ 13711744146391L;
      long var17 = (var4 ^ 15102332224517L) >>> 16;
      int var19 = (int)((var4 ^ 15102332224517L) << 48 >>> 48);
      long var20 = var4 ^ 45023161901138L;
      ð var22 = new ð();
      int var10000 = Util140.getValue_2();
      int var10002 = var2 >>> 24;
      Object[] var10005 = new Object[]{null, var13};
      var10005[0] = var10002;
      ð var10001 = var22.method_002(var10005);
      var10002 = var6.length;
      var10005 = new Object[]{null, var11};
      var10005[0] = var10002;
      var10001.method_004(var10005);
      int var23 = var10000;
      int var24 = 0;

      label48: {
         label47:
         while (true) {
            if (var24 < var6.length) {
               try {
                  int var33 = var6[var24].int_ê_2;
                  Object[] var10004 = new Object[]{null, var11};
                  var10004[0] = var33;
                  ð var29 = var22.method_004(var10004);
                  int var34 = var7[var24].int_ê_2 - var6[var24].int_ê_2;
                  var10004 = new Object[]{null, var11};
                  var10004[0] = var34;
                  ð var30 = var29.method_004(var10004);
                  int var35 = var8[var24];
                  var10004 = new Object[]{null, var11};
                  var10004[0] = var35;
                  var30.method_004(var10004);
                  var24++;
               } catch (IllegalArgumentException var26) {
                  throw getIllegalArgumentException(var26);
               }

               do {
                  try {
                     var10000 = var23;
                     if (var4 <= 0L) {
                        break label48;
                     }

                     if (var23 == 0) {
                        break label47;
                     }

                     if (var23 != 0) {
                        continue label47;
                     }
                  } catch (IllegalArgumentException var28) {
                     throw getIllegalArgumentException(var28);
                  }
               } while (var4 < 0L);
            }

            և.calculate_3(new Object[]{var20, var3, var22});
            int var36 = this.dataBuilder4_ó.calculate_6(new Object[]{var15, var9});
            Object[] var40 = new Object[]{null, var11};
            var40[0] = var36;
            ð var32 = var22.method_004(var40);
            var40 = new Object[]{null, var11};
            var40[0] = 0;
            var32.method_004(var40);
            break;
         }

         try {
            var10000 = var10;
         } catch (IllegalArgumentException var25) {
            throw getIllegalArgumentException(var25);
         }
      }

      try {
         if (var10000 != 0) {
            return this.û_à = new û(this.dataBuilder4_ó, var17, true, var22, this.û_à, (short)var19);
         }
      } catch (IllegalArgumentException var27) {
         throw getIllegalArgumentException(var27);
      }

      return this.û_ß = new û(this.dataBuilder4_ó, var17, true, var22, this.û_ß, (short)var19);
   }

   public void calculate_17(Object[] param1) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast rip/breeze/inject/ª
      // 1c: astore 5
      // 1e: pop
      // 1f: lload 2
      // 20: dup2
      // 21: ldc2_w 71861001467697
      // 24: lxor
      // 25: lstore 6
      // 27: pop2
      // 28: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 2b: istore 8
      // 2d: aload 0
      // 2e: getfield rip/breeze/inject/MathUtil11.ð_ç Lrip/breeze/inject/ð;
      // 31: iload 8
      // 33: ifne a0
      // 36: ifnonnull 52
      // 39: goto 40
      // 3c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: aload 0
      // 41: new rip/breeze/inject/ð
      // 44: dup
      // 45: invokespecial rip/breeze/inject/ð.<init> ()V
      // 48: putfield rip/breeze/inject/MathUtil11.ð_ç Lrip/breeze/inject/ð;
      // 4b: goto 52
      // 4e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 51: athrow
      // 52: aload 0
      // 53: dup
      // 54: getfield rip/breeze/inject/MathUtil11.int_è I
      // 57: bipush 1
      // 58: iadd
      // 59: putfield rip/breeze/inject/MathUtil11.int_è I
      // 5c: aload 0
      // 5d: getfield rip/breeze/inject/MathUtil11.ð_ç Lrip/breeze/inject/ð;
      // 60: aload 5
      // 62: getfield rip/breeze/inject/ª.int_ê_2 I
      // 65: lload 6
      // 67: bipush 2
      // 68: anewarray 141
      // 6b: dup_x2
      // 6c: dup_x2
      // 6d: pop
      // 6e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 71: bipush 1
      // 72: swap
      // 73: aastore
      // 74: dup_x1
      // 75: swap
      // 76: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 79: bipush 0
      // 7a: swap
      // 7b: aastore
      // 7c: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 7f: pop
      // 80: aload 0
      // 81: getfield rip/breeze/inject/MathUtil11.ð_ç Lrip/breeze/inject/ð;
      // 84: iload 4
      // 86: lload 6
      // 88: bipush 2
      // 89: anewarray 141
      // 8c: dup_x2
      // 8d: dup_x2
      // 8e: pop
      // 8f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 92: bipush 1
      // 93: swap
      // 94: aastore
      // 95: dup_x1
      // 96: swap
      // 97: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9a: bipush 0
      // 9b: swap
      // 9c: aastore
      // 9d: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // a0: pop
      // a1: return
      // try (27 -> 32): 33 java/lang/IllegalArgumentException
      // try (31 -> 40): 41 java/lang/IllegalArgumentException
   }

   @Override
   public void processAll_5(Object[] param1) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast java/lang/Integer
      // 1c: invokevirtual java/lang/Integer.intValue ()I
      // 1f: istore 5
      // 21: pop
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 81882333984836
      // 27: lxor
      // 28: lstore 6
      // 2a: dup2
      // 2b: ldc2_w 28470640599417
      // 2e: lxor
      // 2f: lstore 8
      // 31: pop2
      // 32: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 35: istore 10
      // 37: aload 0
      // 38: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 3b: bipush 4
      // 3c: iload 10
      // 3e: ifeq 76
      // 41: if_icmpne 6a
      // 44: goto 4b
      // 47: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: lload 8
      // 4e: bipush 1
      // 4f: anewarray 141
      // 52: dup_x2
      // 53: dup_x2
      // 54: pop
      // 55: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 58: bipush 0
      // 59: swap
      // 5a: aastore
      // 5b: invokevirtual rip/breeze/inject/MathUtil11.clamp_2 ([Ljava/lang/Object;)V
      // 5e: iload 10
      // 60: ifne f2
      // 63: goto 6a
      // 66: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 69: athrow
      // 6a: aload 0
      // 6b: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 6e: bipush 1
      // 6f: goto 76
      // 72: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 75: athrow
      // 76: lload 2
      // 77: lconst_0
      // 78: lcmp
      // 79: iflt c8
      // 7c: iload 10
      // 7e: ifeq c8
      // 81: if_icmpne aa
      // 84: goto 8b
      // 87: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8a: athrow
      // 8b: aload 0
      // 8c: lload 6
      // 8e: bipush 1
      // 8f: anewarray 141
      // 92: dup_x2
      // 93: dup_x2
      // 94: pop
      // 95: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 98: bipush 0
      // 99: swap
      // 9a: aastore
      // 9b: invokevirtual rip/breeze/inject/MathUtil11.calculate_18 ([Ljava/lang/Object;)V
      // 9e: iload 10
      // a0: ifne f2
      // a3: goto aa
      // a6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a9: athrow
      // aa: aload 0
      // ab: iload 10
      // ad: lload 2
      // ae: lconst_0
      // af: lcmp
      // b0: iflt ef
      // b3: ifeq ed
      // b6: goto bd
      // b9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // bc: athrow
      // bd: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // c0: bipush 2
      // c1: goto c8
      // c4: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // c7: athrow
      // c8: if_icmpne df
      // cb: aload 0
      // cc: aload 0
      // cd: getfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // d0: putfield rip/breeze/inject/MathUtil11.int_í I
      // d3: iload 10
      // d5: ifne f2
      // d8: goto df
      // db: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // de: athrow
      // df: aload 0
      // e0: iload 4
      // e2: putfield rip/breeze/inject/MathUtil11.int_í I
      // e5: aload 0
      // e6: goto ed
      // e9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ec: athrow
      // ed: iload 5
      // ef: putfield rip/breeze/inject/MathUtil11.int_ì I
      // f2: return
      // try (32 -> 38): 39 java/lang/IllegalArgumentException
      // try (37 -> 55): 56 java/lang/IllegalArgumentException
      // try (41 -> 61): 62 java/lang/IllegalArgumentException
      // try (64 -> 71): 72 java/lang/IllegalArgumentException
      // try (70 -> 88): 89 java/lang/IllegalArgumentException
      // try (74 -> 98): 99 java/lang/IllegalArgumentException
      // try (91 -> 103): 104 java/lang/IllegalArgumentException
      // try (106 -> 113): 114 java/lang/IllegalArgumentException
      // try (107 -> 120): 121 java/lang/IllegalArgumentException
   }

   private void clamp_2(Object[] param1) {
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
      // 00c: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 58843278921171
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 140099124418365
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 97999689123494
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 105303541007173
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 88363167945118
      // 033: lxor
      // 034: lstore 12
      // 036: dup2
      // 037: ldc2_w 23199061998081
      // 03a: lxor
      // 03b: lstore 14
      // 03d: dup2
      // 03e: ldc2_w 125985292393589
      // 041: lxor
      // 042: lstore 16
      // 044: dup2
      // 045: ldc2_w 15630110164033
      // 048: lxor
      // 049: lstore 18
      // 04b: pop2
      // 04c: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 04f: aload 0
      // 050: getfield rip/breeze/inject/MathUtil11.µ_ê Lrip/breeze/inject/µ;
      // 053: astore 20
      // 055: istore 21
      // 057: aload 20
      // 059: ifnull 152
      // 05c: aload 20
      // 05e: iload 21
      // 060: ifeq 084
      // 063: getfield rip/breeze/inject/µ.string_û_2 Ljava/lang/String;
      // 066: ifnonnull 082
      // 069: goto 070
      // 06c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06f: athrow
      // 070: sipush 28850
      // 073: ldc2_w 1511353662493991710
      // 076: lload 2
      // 077: lxor
      // 078: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 07b: goto 087
      // 07e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 081: athrow
      // 082: aload 20
      // 084: getfield rip/breeze/inject/µ.string_û_2 Ljava/lang/String;
      // 087: astore 22
      // 089: aload 0
      // 08a: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 08d: lload 4
      // 08f: dup2_x1
      // 090: pop2
      // 091: aload 22
      // 093: bipush 3
      // 094: anewarray 141
      // 097: dup_x1
      // 098: swap
      // 099: bipush 2
      // 09a: swap
      // 09b: aastore
      // 09c: dup_x1
      // 09d: swap
      // 09e: bipush 1
      // 09f: swap
      // 0a0: aastore
      // 0a1: dup_x2
      // 0a2: dup_x2
      // 0a3: pop
      // 0a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a7: bipush 0
      // 0a8: swap
      // 0a9: aastore
      // 0aa: invokestatic rip/breeze/inject/à.method_003 ([Ljava/lang/Object;)I
      // 0ad: istore 23
      // 0af: aload 20
      // 0b1: getfield rip/breeze/inject/µ.ª_ý_2 Lrip/breeze/inject/ª;
      // 0b4: lload 6
      // 0b6: bipush 1
      // 0b7: anewarray 141
      // 0ba: dup_x2
      // 0bb: dup_x2
      // 0bc: pop
      // 0bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c0: bipush 0
      // 0c1: swap
      // 0c2: aastore
      // 0c3: invokevirtual rip/breeze/inject/ª.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ª;
      // 0c6: astore 24
      // 0c8: aload 24
      // 0ca: dup
      // 0cb: getfield rip/breeze/inject/ª.short_í_2 S
      // 0ce: bipush 2
      // 0cf: ior
      // 0d0: i2s
      // 0d1: putfield rip/breeze/inject/ª.short_í_2 S
      // 0d4: aload 20
      // 0d6: getfield rip/breeze/inject/µ.ª_ÿ_2 Lrip/breeze/inject/ª;
      // 0d9: lload 6
      // 0db: bipush 1
      // 0dc: anewarray 141
      // 0df: dup_x2
      // 0e0: dup_x2
      // 0e1: pop
      // 0e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e5: bipush 0
      // 0e6: swap
      // 0e7: aastore
      // 0e8: invokevirtual rip/breeze/inject/ª.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ª;
      // 0eb: astore 25
      // 0ed: aload 20
      // 0ef: getfield rip/breeze/inject/µ.ª_þ_2 Lrip/breeze/inject/ª;
      // 0f2: lload 6
      // 0f4: bipush 1
      // 0f5: anewarray 141
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 0
      // 0ff: swap
      // 100: aastore
      // 101: invokevirtual rip/breeze/inject/ª.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ª;
      // 104: astore 26
      // 106: aload 25
      // 108: aload 26
      // 10a: if_acmpeq 146
      // 10d: aload 25
      // 10f: new rip/breeze/inject/å
      // 112: dup
      // 113: iload 23
      // 115: aload 24
      // 117: aload 25
      // 119: getfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 11c: invokespecial rip/breeze/inject/å.<init> (ILrip/breeze/inject/ª;Lrip/breeze/inject/å;)V
      // 11f: putfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 122: aload 25
      // 124: getfield rip/breeze/inject/ª.ª_ã_2 Lrip/breeze/inject/ª;
      // 127: astore 25
      // 129: iload 21
      // 12b: lload 2
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: ifle 14f
      // 131: ifeq 14d
      // 134: iload 21
      // 136: ifne 106
      // 139: lload 2
      // 13a: lconst_0
      // 13b: lcmp
      // 13c: ifle 129
      // 13f: goto 146
      // 142: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 145: athrow
      // 146: aload 20
      // 148: getfield rip/breeze/inject/µ.µ_ú_2 Lrip/breeze/inject/µ;
      // 14b: astore 20
      // 14d: iload 21
      // 14f: ifne 057
      // 152: aload 0
      // 153: getfield rip/breeze/inject/MathUtil11.ª_l Lrip/breeze/inject/ª;
      // 156: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 159: astore 22
      // 15b: aload 22
      // 15d: aload 0
      // 15e: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 161: aload 0
      // 162: getfield rip/breeze/inject/MathUtil11.int_ò I
      // 165: aload 0
      // 166: getfield rip/breeze/inject/MathUtil11.string_î Ljava/lang/String;
      // 169: aload 0
      // 16a: getfield rip/breeze/inject/MathUtil11.int_ì I
      // 16d: lload 10
      // 16f: dup2_x1
      // 170: pop2
      // 171: bipush 5
      // 172: anewarray 141
      // 175: dup_x1
      // 176: swap
      // 177: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 17a: bipush 4
      // 17b: swap
      // 17c: aastore
      // 17d: dup_x2
      // 17e: dup_x2
      // 17f: pop
      // 180: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 183: bipush 3
      // 184: swap
      // 185: aastore
      // 186: dup_x1
      // 187: swap
      // 188: bipush 2
      // 189: swap
      // 18a: aastore
      // 18b: dup_x1
      // 18c: swap
      // 18d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 190: bipush 1
      // 191: swap
      // 192: aastore
      // 193: dup_x1
      // 194: swap
      // 195: bipush 0
      // 196: swap
      // 197: aastore
      // 198: invokevirtual rip/breeze/inject/à.method_007 ([Ljava/lang/Object;)V
      // 19b: aload 22
      // 19d: aload 0
      // 19e: lload 12
      // 1a0: bipush 2
      // 1a1: anewarray 141
      // 1a4: dup_x2
      // 1a5: dup_x2
      // 1a6: pop
      // 1a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1aa: bipush 1
      // 1ab: swap
      // 1ac: aastore
      // 1ad: dup_x1
      // 1ae: swap
      // 1af: bipush 0
      // 1b0: swap
      // 1b1: aastore
      // 1b2: invokevirtual rip/breeze/inject/à.method_024 ([Ljava/lang/Object;)V
      // 1b5: aload 0
      // 1b6: getfield rip/breeze/inject/MathUtil11.ª_l Lrip/breeze/inject/ª;
      // 1b9: astore 23
      // 1bb: aload 23
      // 1bd: getstatic rip/breeze/inject/ª.CONST_Ï_2 Lrip/breeze/inject/ª;
      // 1c0: putfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 1c3: bipush 0
      // 1c4: lload 2
      // 1c5: lconst_0
      // 1c6: lcmp
      // 1c7: ifle 073
      // 1ca: istore 24
      // 1cc: aload 23
      // 1ce: getstatic rip/breeze/inject/ª.CONST_Ï_2 Lrip/breeze/inject/ª;
      // 1d1: if_acmpeq 2fc
      // 1d4: aload 23
      // 1d6: astore 25
      // 1d8: aload 23
      // 1da: getfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 1dd: astore 23
      // 1df: aload 25
      // 1e1: aconst_null
      // 1e2: putfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 1e5: aload 25
      // 1e7: dup
      // 1e8: getfield rip/breeze/inject/ª.short_í_2 S
      // 1eb: bipush 8
      // 1ed: ior
      // 1ee: i2s
      // 1ef: putfield rip/breeze/inject/ª.short_í_2 S
      // 1f2: aload 25
      // 1f4: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 1f7: bipush 0
      // 1f8: anewarray 141
      // 1fb: invokevirtual rip/breeze/inject/à.method_009 ([Ljava/lang/Object;)I
      // 1fe: aload 25
      // 200: getfield rip/breeze/inject/ª.short_æ_2 S
      // 203: iadd
      // 204: istore 26
      // 206: iload 26
      // 208: iload 21
      // 20a: lload 2
      // 20b: lconst_0
      // 20c: lcmp
      // 20d: ifle 215
      // 210: ifeq 233
      // 213: iload 24
      // 215: iload 21
      // 217: lload 2
      // 218: lconst_0
      // 219: lcmp
      // 21a: ifle 32b
      // 21d: ifeq 329
      // 220: goto 227
      // 223: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 226: athrow
      // 227: if_icmple 235
      // 22a: goto 231
      // 22d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 230: athrow
      // 231: iload 26
      // 233: istore 24
      // 235: aload 25
      // 237: getfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 23a: astore 27
      // 23c: aload 27
      // 23e: ifnull 2f1
      // 241: aload 27
      // 243: getfield rip/breeze/inject/å.ª_ü_2 Lrip/breeze/inject/ª;
      // 246: lload 6
      // 248: bipush 1
      // 249: anewarray 141
      // 24c: dup_x2
      // 24d: dup_x2
      // 24e: pop
      // 24f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 252: bipush 0
      // 253: swap
      // 254: aastore
      // 255: invokevirtual rip/breeze/inject/ª.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ª;
      // 258: astore 28
      // 25a: aload 25
      // 25c: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 25f: aload 0
      // 260: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 263: lload 14
      // 265: dup2_x1
      // 266: pop2
      // 267: aload 28
      // 269: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 26c: aload 27
      // 26e: getfield rip/breeze/inject/å.int_ý_2 I
      // 271: bipush 4
      // 272: anewarray 141
      // 275: dup_x1
      // 276: swap
      // 277: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 27a: bipush 3
      // 27b: swap
      // 27c: aastore
      // 27d: dup_x1
      // 27e: swap
      // 27f: bipush 2
      // 280: swap
      // 281: aastore
      // 282: dup_x1
      // 283: swap
      // 284: bipush 1
      // 285: swap
      // 286: aastore
      // 287: dup_x2
      // 288: dup_x2
      // 289: pop
      // 28a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28d: bipush 0
      // 28e: swap
      // 28f: aastore
      // 290: invokevirtual rip/breeze/inject/à.method_022 ([Ljava/lang/Object;)Z
      // 293: istore 29
      // 295: iload 21
      // 297: lload 2
      // 298: lconst_0
      // 299: lcmp
      // 29a: ifle 2ee
      // 29d: ifeq 2ec
      // 2a0: iload 29
      // 2a2: iload 21
      // 2a4: ifeq 327
      // 2a7: goto 2ae
      // 2aa: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ad: athrow
      // 2ae: ifeq 2e5
      // 2b1: goto 2b8
      // 2b4: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b7: athrow
      // 2b8: aload 28
      // 2ba: getfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 2bd: iload 21
      // 2bf: ifeq 2e3
      // 2c2: goto 2c9
      // 2c5: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c8: athrow
      // 2c9: ifnonnull 2e5
      // 2cc: goto 2d3
      // 2cf: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d2: athrow
      // 2d3: aload 28
      // 2d5: aload 23
      // 2d7: putfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 2da: aload 28
      // 2dc: goto 2e3
      // 2df: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e2: athrow
      // 2e3: astore 23
      // 2e5: aload 27
      // 2e7: getfield rip/breeze/inject/å.å_û_2 Lrip/breeze/inject/å;
      // 2ea: astore 27
      // 2ec: iload 21
      // 2ee: ifne 23c
      // 2f1: iload 21
      // 2f3: lload 2
      // 2f4: lconst_0
      // 2f5: lcmp
      // 2f6: ifle 327
      // 2f9: ifne 1cc
      // 2fc: aload 0
      // 2fd: getfield rip/breeze/inject/MathUtil11.ª_l Lrip/breeze/inject/ª;
      // 300: lload 2
      // 301: lconst_0
      // 302: lcmp
      // 303: ifle 1d6
      // 306: astore 25
      // 308: aload 25
      // 30a: ifnull 4bd
      // 30d: iload 21
      // 30f: lload 2
      // 310: lconst_0
      // 311: lcmp
      // 312: ifle 320
      // 315: ifeq 4c9
      // 318: aload 25
      // 31a: getfield rip/breeze/inject/ª.short_í_2 S
      // 31d: bipush 10
      // 31f: iand
      // 320: goto 327
      // 323: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 326: athrow
      // 327: bipush 10
      // 329: iload 21
      // 32b: ifeq 36f
      // 32e: if_icmpne 35c
      // 331: goto 338
      // 334: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 337: athrow
      // 338: aload 25
      // 33a: getfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 33d: aload 0
      // 33e: lload 12
      // 340: bipush 2
      // 341: anewarray 141
      // 344: dup_x2
      // 345: dup_x2
      // 346: pop
      // 347: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34a: bipush 1
      // 34b: swap
      // 34c: aastore
      // 34d: dup_x1
      // 34e: swap
      // 34f: bipush 0
      // 350: swap
      // 351: aastore
      // 352: invokevirtual rip/breeze/inject/à.method_024 ([Ljava/lang/Object;)V
      // 355: goto 35c
      // 358: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35b: athrow
      // 35c: aload 25
      // 35e: iload 21
      // 360: ifeq 4b6
      // 363: getfield rip/breeze/inject/ª.short_í_2 S
      // 366: bipush 8
      // 368: goto 36f
      // 36b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36e: athrow
      // 36f: iand
      // 370: ifne 4b1
      // 373: aload 25
      // 375: getfield rip/breeze/inject/ª.ª_ã_2 Lrip/breeze/inject/ª;
      // 378: astore 26
      // 37a: aload 25
      // 37c: getfield rip/breeze/inject/ª.int_ê_2 I
      // 37f: istore 27
      // 381: aload 26
      // 383: iload 21
      // 385: ifeq 3a2
      // 388: ifnonnull 3a0
      // 38b: goto 392
      // 38e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 391: athrow
      // 392: aload 0
      // 393: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 396: getfield rip/breeze/inject/ð.int_þ_2 I
      // 399: goto 3a5
      // 39c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39f: athrow
      // 3a0: aload 26
      // 3a2: getfield rip/breeze/inject/ª.int_ê_2 I
      // 3a5: bipush 1
      // 3a6: isub
      // 3a7: istore 28
      // 3a9: iload 21
      // 3ab: lload 2
      // 3ac: lconst_0
      // 3ad: lcmp
      // 3ae: ifle 4ba
      // 3b1: ifeq 4b8
      // 3b4: iload 28
      // 3b6: iload 27
      // 3b8: if_icmplt 4b1
      // 3bb: goto 3c2
      // 3be: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c1: athrow
      // 3c2: iload 27
      // 3c4: istore 29
      // 3c6: iload 29
      // 3c8: iload 28
      // 3ca: if_icmpge 3f8
      // 3cd: aload 0
      // 3ce: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 3d1: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 3d4: iload 29
      // 3d6: bipush 0
      // 3d7: bastore
      // 3d8: iinc 29 1
      // 3db: iload 21
      // 3dd: lload 2
      // 3de: lconst_0
      // 3df: lcmp
      // 3e0: ifle 4af
      // 3e3: ifeq 4a9
      // 3e6: iload 21
      // 3e8: ifne 3c6
      // 3eb: lload 2
      // 3ec: lconst_0
      // 3ed: lcmp
      // 3ee: iflt 3db
      // 3f1: goto 3f8
      // 3f4: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f7: athrow
      // 3f8: aload 0
      // 3f9: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 3fc: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 3ff: iload 28
      // 401: bipush -65
      // 403: bastore
      // 404: aload 0
      // 405: lload 16
      // 407: iload 27
      // 409: bipush 0
      // 40a: bipush 1
      // 40b: bipush 4
      // 40c: anewarray 141
      // 40f: dup_x1
      // 410: swap
      // 411: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 414: bipush 3
      // 415: swap
      // 416: aastore
      // 417: dup_x1
      // 418: swap
      // 419: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 41c: bipush 2
      // 41d: swap
      // 41e: aastore
      // 41f: dup_x1
      // 420: swap
      // 421: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 424: bipush 1
      // 425: swap
      // 426: aastore
      // 427: dup_x2
      // 428: dup_x2
      // 429: pop
      // 42a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42d: bipush 0
      // 42e: swap
      // 42f: aastore
      // 430: invokevirtual rip/breeze/inject/MathUtil11.calculate_19 ([Ljava/lang/Object;)I
      // 433: istore 29
      // 435: aload 0
      // 436: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 439: iload 29
      // 43b: aload 0
      // 43c: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 43f: lload 4
      // 441: dup2_x1
      // 442: pop2
      // 443: sipush 16356
      // 446: ldc2_w 2234292716668677201
      // 449: lload 2
      // 44a: lxor
      // 44b: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 44e: bipush 3
      // 44f: anewarray 141
      // 452: dup_x1
      // 453: swap
      // 454: bipush 2
      // 455: swap
      // 456: aastore
      // 457: dup_x1
      // 458: swap
      // 459: bipush 1
      // 45a: swap
      // 45b: aastore
      // 45c: dup_x2
      // 45d: dup_x2
      // 45e: pop
      // 45f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 462: bipush 0
      // 463: swap
      // 464: aastore
      // 465: invokestatic rip/breeze/inject/à.method_003 ([Ljava/lang/Object;)I
      // 468: iastore
      // 469: aload 0
      // 46a: lload 18
      // 46c: bipush 1
      // 46d: anewarray 141
      // 470: dup_x2
      // 471: dup_x2
      // 472: pop
      // 473: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 476: bipush 0
      // 477: swap
      // 478: aastore
      // 479: invokevirtual rip/breeze/inject/MathUtil11.calculate_20 ([Ljava/lang/Object;)V
      // 47c: aload 0
      // 47d: aload 0
      // 47e: getfield rip/breeze/inject/MathUtil11.µ_ê Lrip/breeze/inject/µ;
      // 481: aload 25
      // 483: lload 8
      // 485: aload 26
      // 487: bipush 4
      // 488: anewarray 141
      // 48b: dup_x1
      // 48c: swap
      // 48d: bipush 3
      // 48e: swap
      // 48f: aastore
      // 490: dup_x2
      // 491: dup_x2
      // 492: pop
      // 493: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 496: bipush 2
      // 497: swap
      // 498: aastore
      // 499: dup_x1
      // 49a: swap
      // 49b: bipush 1
      // 49c: swap
      // 49d: aastore
      // 49e: dup_x1
      // 49f: swap
      // 4a0: bipush 0
      // 4a1: swap
      // 4a2: aastore
      // 4a3: invokestatic rip/breeze/inject/µ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/µ;
      // 4a6: putfield rip/breeze/inject/MathUtil11.µ_ê Lrip/breeze/inject/µ;
      // 4a9: iload 24
      // 4ab: bipush 1
      // 4ac: invokestatic java/lang/Math.max (II)I
      // 4af: istore 24
      // 4b1: aload 25
      // 4b3: getfield rip/breeze/inject/ª.ª_ã_2 Lrip/breeze/inject/ª;
      // 4b6: astore 25
      // 4b8: iload 21
      // 4ba: ifne 308
      // 4bd: aload 0
      // 4be: iload 24
      // 4c0: putfield rip/breeze/inject/MathUtil11.int_í I
      // 4c3: lload 2
      // 4c4: lconst_0
      // 4c5: lcmp
      // 4c6: iflt 30d
      // 4c9: return
      // try (53 -> 58): 59 java/lang/IllegalArgumentException
      // try (56 -> 67): 67 java/lang/IllegalArgumentException
      // try (163 -> 171): 176 java/lang/IllegalArgumentException
      // try (288 -> 302): 303 java/lang/IllegalArgumentException
      // try (295 -> 306): 307 java/lang/IllegalArgumentException
      // try (368 -> 377): 378 java/lang/IllegalArgumentException
      // try (374 -> 381): 382 java/lang/IllegalArgumentException
      // try (380 -> 388): 389 java/lang/IllegalArgumentException
      // try (384 -> 392): 393 java/lang/IllegalArgumentException
      // try (391 -> 399): 400 java/lang/IllegalArgumentException
      // try (423 -> 433): 434 java/lang/IllegalArgumentException
      // try (437 -> 440): 441 java/lang/IllegalArgumentException
      // try (439 -> 462): 463 java/lang/IllegalArgumentException
      // try (465 -> 470): 471 java/lang/IllegalArgumentException
      // try (481 -> 485): 486 java/lang/IllegalArgumentException
      // try (484 -> 492): 492 java/lang/IllegalArgumentException
      // try (499 -> 508): 509 java/lang/IllegalArgumentException
      // try (516 -> 531): 536 java/lang/IllegalArgumentException
   }

   private void calculate_18(Object[] param1) {
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
      // 00c: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 4808054548595
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 132506272054306
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 025: aload 0
      // 026: getfield rip/breeze/inject/MathUtil11.µ_ê Lrip/breeze/inject/µ;
      // 029: astore 8
      // 02b: istore 9
      // 02d: aload 8
      // 02f: ifnull 0eb
      // 032: aload 8
      // 034: getfield rip/breeze/inject/µ.ª_ý_2 Lrip/breeze/inject/ª;
      // 037: astore 10
      // 039: aload 8
      // 03b: getfield rip/breeze/inject/µ.ª_ÿ_2 Lrip/breeze/inject/ª;
      // 03e: astore 11
      // 040: lload 2
      // 041: lconst_0
      // 042: lcmp
      // 043: ifle 26d
      // 046: aload 8
      // 048: getfield rip/breeze/inject/µ.ª_þ_2 Lrip/breeze/inject/ª;
      // 04b: iload 9
      // 04d: ifne 267
      // 050: astore 12
      // 052: aload 11
      // 054: aload 12
      // 056: if_acmpeq 0d9
      // 059: aload 11
      // 05b: iload 9
      // 05d: ifne 0ad
      // 060: getfield rip/breeze/inject/ª.short_í_2 S
      // 063: bipush 16
      // 065: iand
      // 066: iload 9
      // 068: ifne 101
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 071: athrow
      // 072: ifne 0a4
      // 075: goto 07c
      // 078: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07b: athrow
      // 07c: aload 11
      // 07e: new rip/breeze/inject/å
      // 081: dup
      // 082: ldc_w 2147483647
      // 085: aload 10
      // 087: aload 11
      // 089: getfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 08c: invokespecial rip/breeze/inject/å.<init> (ILrip/breeze/inject/ª;Lrip/breeze/inject/å;)V
      // 08f: putfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 092: iload 9
      // 094: lload 2
      // 095: lconst_0
      // 096: lcmp
      // 097: iflt 0d6
      // 09a: ifeq 0cd
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: aload 11
      // 0a6: goto 0ad
      // 0a9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ac: athrow
      // 0ad: getfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 0b0: getfield rip/breeze/inject/å.å_û_2 Lrip/breeze/inject/å;
      // 0b3: new rip/breeze/inject/å
      // 0b6: dup
      // 0b7: ldc_w 2147483647
      // 0ba: aload 10
      // 0bc: aload 11
      // 0be: getfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 0c1: getfield rip/breeze/inject/å.å_û_2 Lrip/breeze/inject/å;
      // 0c4: getfield rip/breeze/inject/å.å_û_2 Lrip/breeze/inject/å;
      // 0c7: invokespecial rip/breeze/inject/å.<init> (ILrip/breeze/inject/ª;Lrip/breeze/inject/å;)V
      // 0ca: putfield rip/breeze/inject/å.å_û_2 Lrip/breeze/inject/å;
      // 0cd: aload 11
      // 0cf: getfield rip/breeze/inject/ª.ª_ã_2 Lrip/breeze/inject/ª;
      // 0d2: astore 11
      // 0d4: iload 9
      // 0d6: ifeq 052
      // 0d9: aload 8
      // 0db: getfield rip/breeze/inject/µ.µ_ú_2 Lrip/breeze/inject/µ;
      // 0de: astore 8
      // 0e0: iload 9
      // 0e2: lload 2
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: ifle 0d6
      // 0e8: ifeq 02d
      // 0eb: aload 0
      // 0ec: lload 2
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: ifle 260
      // 0f2: iload 9
      // 0f4: ifne 260
      // 0f7: getfield rip/breeze/inject/MathUtil11.fieldBool_c Z
      // 0fa: goto 101
      // 0fd: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 100: athrow
      // 101: ifeq 25f
      // 104: bipush 1
      // 105: istore 10
      // 107: aload 0
      // 108: getfield rip/breeze/inject/MathUtil11.ª_l Lrip/breeze/inject/ª;
      // 10b: iload 10
      // 10d: lload 6
      // 10f: bipush 2
      // 110: anewarray 141
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
      // 124: invokevirtual rip/breeze/inject/ª.method_009 ([Ljava/lang/Object;)V
      // 127: bipush 1
      // 128: istore 11
      // 12a: iload 11
      // 12c: iload 10
      // 12e: if_icmpgt 1f1
      // 131: aload 0
      // 132: getfield rip/breeze/inject/MathUtil11.ª_l Lrip/breeze/inject/ª;
      // 135: iload 9
      // 137: ifne 1fb
      // 13a: astore 12
      // 13c: aload 12
      // 13e: ifnull 1df
      // 141: aload 12
      // 143: iload 9
      // 145: ifne 1d8
      // 148: getfield rip/breeze/inject/ª.short_í_2 S
      // 14b: bipush 16
      // 14d: iand
      // 14e: lload 2
      // 14f: lconst_0
      // 150: lcmp
      // 151: ifle 1ee
      // 154: iload 9
      // 156: ifne 1ea
      // 159: goto 160
      // 15c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15f: athrow
      // 160: ifeq 1d3
      // 163: goto 16a
      // 166: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 169: athrow
      // 16a: aload 12
      // 16c: iload 9
      // 16e: ifne 1d8
      // 171: goto 178
      // 174: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 177: athrow
      // 178: getfield rip/breeze/inject/ª.short_å_2 S
      // 17b: iload 11
      // 17d: if_icmpne 1d3
      // 180: goto 187
      // 183: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 186: athrow
      // 187: aload 12
      // 189: getfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 18c: getfield rip/breeze/inject/å.å_û_2 Lrip/breeze/inject/å;
      // 18f: getfield rip/breeze/inject/å.ª_ü_2 Lrip/breeze/inject/ª;
      // 192: astore 13
      // 194: lload 2
      // 195: lconst_0
      // 196: lcmp
      // 197: ifle 1da
      // 19a: aload 13
      // 19c: iload 9
      // 19e: ifne 1d8
      // 1a1: getfield rip/breeze/inject/ª.short_å_2 S
      // 1a4: ifne 1d3
      // 1a7: goto 1ae
      // 1aa: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ad: athrow
      // 1ae: aload 13
      // 1b0: iload 10
      // 1b2: bipush 1
      // 1b3: iadd
      // 1b4: i2s
      // 1b5: istore 10
      // 1b7: iload 10
      // 1b9: lload 6
      // 1bb: bipush 2
      // 1bc: anewarray 141
      // 1bf: dup_x2
      // 1c0: dup_x2
      // 1c1: pop
      // 1c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c5: bipush 1
      // 1c6: swap
      // 1c7: aastore
      // 1c8: dup_x1
      // 1c9: swap
      // 1ca: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1cd: bipush 0
      // 1ce: swap
      // 1cf: aastore
      // 1d0: invokevirtual rip/breeze/inject/ª.method_009 ([Ljava/lang/Object;)V
      // 1d3: aload 12
      // 1d5: getfield rip/breeze/inject/ª.ª_ã_2 Lrip/breeze/inject/ª;
      // 1d8: astore 12
      // 1da: iload 9
      // 1dc: ifeq 13c
      // 1df: iload 11
      // 1e1: bipush 1
      // 1e2: iadd
      // 1e3: lload 2
      // 1e4: lconst_0
      // 1e5: lcmp
      // 1e6: ifle 1dc
      // 1e9: i2s
      // 1ea: istore 11
      // 1ec: iload 9
      // 1ee: ifeq 12a
      // 1f1: aload 0
      // 1f2: lload 2
      // 1f3: lconst_0
      // 1f4: lcmp
      // 1f5: iflt 132
      // 1f8: getfield rip/breeze/inject/MathUtil11.ª_l Lrip/breeze/inject/ª;
      // 1fb: astore 11
      // 1fd: aload 11
      // 1ff: ifnull 25f
      // 202: aload 11
      // 204: iload 9
      // 206: lload 2
      // 207: lconst_0
      // 208: lcmp
      // 209: iflt 211
      // 20c: ifne 263
      // 20f: iload 9
      // 211: ifne 258
      // 214: goto 21b
      // 217: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21a: athrow
      // 21b: getfield rip/breeze/inject/ª.short_í_2 S
      // 21e: bipush 16
      // 220: iand
      // 221: ifeq 253
      // 224: goto 22b
      // 227: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22a: athrow
      // 22b: aload 11
      // 22d: getfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 230: getfield rip/breeze/inject/å.å_û_2 Lrip/breeze/inject/å;
      // 233: getfield rip/breeze/inject/å.ª_ü_2 Lrip/breeze/inject/ª;
      // 236: astore 12
      // 238: aload 12
      // 23a: lload 4
      // 23c: aload 11
      // 23e: bipush 2
      // 23f: anewarray 141
      // 242: dup_x1
      // 243: swap
      // 244: bipush 1
      // 245: swap
      // 246: aastore
      // 247: dup_x2
      // 248: dup_x2
      // 249: pop
      // 24a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24d: bipush 0
      // 24e: swap
      // 24f: aastore
      // 250: invokevirtual rip/breeze/inject/ª.method_010 ([Ljava/lang/Object;)V
      // 253: aload 11
      // 255: getfield rip/breeze/inject/ª.ª_ã_2 Lrip/breeze/inject/ª;
      // 258: astore 11
      // 25a: iload 9
      // 25c: ifeq 1fd
      // 25f: aload 0
      // 260: getfield rip/breeze/inject/MathUtil11.ª_l Lrip/breeze/inject/ª;
      // 263: astore 10
      // 265: aload 10
      // 267: getstatic rip/breeze/inject/ª.CONST_Ï_2 Lrip/breeze/inject/ª;
      // 26a: putfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 26d: aload 0
      // 26e: getfield rip/breeze/inject/MathUtil11.int_í I
      // 271: istore 11
      // 273: aload 10
      // 275: getstatic rip/breeze/inject/ª.CONST_Ï_2 Lrip/breeze/inject/ª;
      // 278: if_acmpeq 36d
      // 27b: aload 10
      // 27d: astore 12
      // 27f: aload 10
      // 281: getfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 284: astore 10
      // 286: aload 12
      // 288: getfield rip/breeze/inject/ª.short_è_2 S
      // 28b: istore 13
      // 28d: iload 13
      // 28f: aload 12
      // 291: getfield rip/breeze/inject/ª.short_æ_2 S
      // 294: iadd
      // 295: istore 14
      // 297: iload 9
      // 299: lload 2
      // 29a: lconst_0
      // 29b: lcmp
      // 29c: ifle 2a4
      // 29f: ifne 379
      // 2a2: iload 14
      // 2a4: iload 9
      // 2a6: ifne 2c5
      // 2a9: goto 2b0
      // 2ac: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2af: athrow
      // 2b0: iload 11
      // 2b2: if_icmple 2c7
      // 2b5: goto 2bc
      // 2b8: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2bb: athrow
      // 2bc: iload 14
      // 2be: goto 2c5
      // 2c1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c4: athrow
      // 2c5: istore 11
      // 2c7: aload 12
      // 2c9: getfield rip/breeze/inject/ª.å_â_2 Lrip/breeze/inject/å;
      // 2cc: astore 15
      // 2ce: aload 12
      // 2d0: getfield rip/breeze/inject/ª.short_í_2 S
      // 2d3: bipush 16
      // 2d5: iand
      // 2d6: ifeq 2e0
      // 2d9: aload 15
      // 2db: getfield rip/breeze/inject/å.å_û_2 Lrip/breeze/inject/å;
      // 2de: astore 15
      // 2e0: aload 15
      // 2e2: ifnull 362
      // 2e5: aload 15
      // 2e7: getfield rip/breeze/inject/å.ª_ü_2 Lrip/breeze/inject/ª;
      // 2ea: astore 16
      // 2ec: iload 9
      // 2ee: lload 2
      // 2ef: lconst_0
      // 2f0: lcmp
      // 2f1: iflt 35f
      // 2f4: ifne 35d
      // 2f7: aload 16
      // 2f9: getfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 2fc: iload 9
      // 2fe: ifne 275
      // 301: lload 2
      // 302: lconst_0
      // 303: lcmp
      // 304: iflt 288
      // 307: goto 30e
      // 30a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30d: athrow
      // 30e: lload 2
      // 30f: lconst_0
      // 310: lcmp
      // 311: iflt 319
      // 314: ifnonnull 356
      // 317: aload 16
      // 319: aload 15
      // 31b: getfield rip/breeze/inject/å.int_ý_2 I
      // 31e: ldc_w 2147483647
      // 321: iload 9
      // 323: ifne 346
      // 326: goto 32d
      // 329: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32c: athrow
      // 32d: if_icmpne 33f
      // 330: goto 337
      // 333: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 336: athrow
      // 337: bipush 1
      // 338: goto 347
      // 33b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33e: athrow
      // 33f: iload 13
      // 341: aload 15
      // 343: getfield rip/breeze/inject/å.int_ý_2 I
      // 346: iadd
      // 347: i2s
      // 348: putfield rip/breeze/inject/ª.short_è_2 S
      // 34b: aload 16
      // 34d: aload 10
      // 34f: putfield rip/breeze/inject/ª.ª_á_2 Lrip/breeze/inject/ª;
      // 352: aload 16
      // 354: astore 10
      // 356: aload 15
      // 358: getfield rip/breeze/inject/å.å_û_2 Lrip/breeze/inject/å;
      // 35b: astore 15
      // 35d: iload 9
      // 35f: ifeq 2e0
      // 362: iload 9
      // 364: lload 2
      // 365: lconst_0
      // 366: lcmp
      // 367: iflt 299
      // 36a: ifeq 273
      // 36d: aload 0
      // 36e: iload 11
      // 370: putfield rip/breeze/inject/MathUtil11.int_í I
      // 373: lload 2
      // 374: lconst_0
      // 375: lcmp
      // 376: ifle 27b
      // 379: return
      // try (47 -> 55): 56 java/lang/IllegalArgumentException
      // try (50 -> 59): 60 java/lang/IllegalArgumentException
      // try (58 -> 77): 78 java/lang/IllegalArgumentException
      // try (62 -> 81): 82 java/lang/IllegalArgumentException
      // try (110 -> 118): 119 java/lang/IllegalArgumentException
      // try (156 -> 168): 169 java/lang/IllegalArgumentException
      // try (159 -> 172): 173 java/lang/IllegalArgumentException
      // try (171 -> 178): 179 java/lang/IllegalArgumentException
      // try (175 -> 184): 185 java/lang/IllegalArgumentException
      // try (192 -> 201): 202 java/lang/IllegalArgumentException
      // try (253 -> 262): 263 java/lang/IllegalArgumentException
      // try (260 -> 269): 270 java/lang/IllegalArgumentException
      // try (325 -> 334): 335 java/lang/IllegalArgumentException
      // try (331 -> 339): 340 java/lang/IllegalArgumentException
      // try (337 -> 343): 344 java/lang/IllegalArgumentException
      // try (363 -> 373): 378 java/lang/IllegalArgumentException
      // try (380 -> 391): 392 java/lang/IllegalArgumentException
      // try (385 -> 395): 396 java/lang/IllegalArgumentException
      // try (394 -> 400): 400 java/lang/IllegalArgumentException
   }

   public void invoke_31(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   private void invoke_6(Object[] var1) {
      int var2 = (Integer)var1[0];
      ª var3 = (ª)var1[1];
      this.ª_j.å_â_2 = new å(var2, var3, this.ª_j.å_â_2);
   }

   private void processAll_6(Object[] param1) {
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
      // 0c: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 62255741091012
      // 17: lxor
      // 18: dup2
      // 19: bipush 48
      // 1b: lushr
      // 1c: l2i
      // 1d: istore 4
      // 1f: dup2
      // 20: bipush 16
      // 22: lshl
      // 23: bipush 16
      // 25: lushr
      // 26: lstore 5
      // 28: pop2
      // 29: pop2
      // 2a: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 2d: istore 7
      // 2f: aload 0
      // 30: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // 33: bipush 4
      // 34: iload 7
      // 36: ifeq d8
      // 39: if_icmpne c0
      // 3c: goto 43
      // 3f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: new rip/breeze/inject/ª
      // 46: dup
      // 47: invokespecial rip/breeze/inject/ª.<init> ()V
      // 4a: astore 8
      // 4c: aload 8
      // 4e: new rip/breeze/inject/à
      // 51: dup
      // 52: aload 8
      // 54: invokespecial rip/breeze/inject/à.<init> (Lrip/breeze/inject/ª;)V
      // 57: putfield rip/breeze/inject/ª.à_ä_2 Lrip/breeze/inject/à;
      // 5a: aload 8
      // 5c: aload 0
      // 5d: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 60: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 63: aload 0
      // 64: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 67: aload 0
      // 68: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 6b: getfield rip/breeze/inject/ð.int_þ_2 I
      // 6e: iload 4
      // 70: i2s
      // 71: swap
      // 72: lload 5
      // 74: dup2_x1
      // 75: pop2
      // 76: bipush 5
      // 77: anewarray 141
      // 7a: dup_x1
      // 7b: swap
      // 7c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7f: bipush 4
      // 80: swap
      // 81: aastore
      // 82: dup_x2
      // 83: dup_x2
      // 84: pop
      // 85: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 88: bipush 3
      // 89: swap
      // 8a: aastore
      // 8b: dup_x1
      // 8c: swap
      // 8d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 90: bipush 2
      // 91: swap
      // 92: aastore
      // 93: dup_x1
      // 94: swap
      // 95: bipush 1
      // 96: swap
      // 97: aastore
      // 98: dup_x1
      // 99: swap
      // 9a: bipush 0
      // 9b: swap
      // 9c: aastore
      // 9d: invokevirtual rip/breeze/inject/ª.method_008 ([Ljava/lang/Object;)Z
      // a0: pop
      // a1: aload 0
      // a2: getfield rip/breeze/inject/MathUtil11.ª_k Lrip/breeze/inject/ª;
      // a5: aload 8
      // a7: putfield rip/breeze/inject/ª.ª_ã_2 Lrip/breeze/inject/ª;
      // aa: aload 0
      // ab: aload 8
      // ad: putfield rip/breeze/inject/MathUtil11.ª_k Lrip/breeze/inject/ª;
      // b0: aload 0
      // b1: aconst_null
      // b2: putfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // b5: lload 2
      // b6: lconst_0
      // b7: lcmp
      // b8: iflt c0
      // bb: iload 7
      // bd: ifne f3
      // c0: aload 0
      // c1: iload 7
      // c3: ifeq ef
      // c6: goto cd
      // c9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // cc: athrow
      // cd: getfield rip/breeze/inject/MathUtil11.fieldInt_m I
      // d0: bipush 1
      // d1: goto d8
      // d4: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d7: athrow
      // d8: if_icmpne f3
      // db: aload 0
      // dc: getfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // df: aload 0
      // e0: getfield rip/breeze/inject/MathUtil11.fieldInt_h I
      // e3: i2s
      // e4: putfield rip/breeze/inject/ª.short_æ_2 S
      // e7: aload 0
      // e8: goto ef
      // eb: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ee: athrow
      // ef: aconst_null
      // f0: putfield rip/breeze/inject/MathUtil11.ª_j Lrip/breeze/inject/ª;
      // f3: return
      // try (31 -> 37): 38 java/lang/IllegalArgumentException
      // try (44 -> 117): 118 java/lang/IllegalArgumentException
      // try (114 -> 122): 123 java/lang/IllegalArgumentException
      // try (125 -> 133): 134 java/lang/IllegalArgumentException
   }

   int calculate_19(Object[] param1) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast java/lang/Integer
      // 1c: invokevirtual java/lang/Integer.intValue ()I
      // 1f: istore 5
      // 21: dup
      // 22: bipush 3
      // 23: aaload
      // 24: checkcast java/lang/Integer
      // 27: invokevirtual java/lang/Integer.intValue ()I
      // 2a: istore 6
      // 2c: pop
      // 2d: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 30: lload 2
      // 31: lxor
      // 32: lstore 2
      // 33: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 36: bipush 3
      // 37: iload 5
      // 39: iadd
      // 3a: iload 6
      // 3c: iadd
      // 3d: istore 7
      // 3f: istore 8
      // 41: aload 0
      // 42: iload 8
      // 44: ifne 79
      // 47: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 4a: ifnull 71
      // 4d: goto 54
      // 50: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 53: athrow
      // 54: aload 0
      // 55: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 58: arraylength
      // 59: iload 8
      // 5b: ifne 99
      // 5e: goto 65
      // 61: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 64: athrow
      // 65: iload 7
      // 67: if_icmpge 80
      // 6a: goto 71
      // 6d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 70: athrow
      // 71: aload 0
      // 72: goto 79
      // 75: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 78: athrow
      // 79: iload 7
      // 7b: newarray 10
      // 7d: putfield rip/breeze/inject/MathUtil11.arr_d [I
      // 80: aload 0
      // 81: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 84: bipush 0
      // 85: iload 4
      // 87: iastore
      // 88: aload 0
      // 89: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 8c: bipush 1
      // 8d: iload 5
      // 8f: iastore
      // 90: aload 0
      // 91: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 94: bipush 2
      // 95: iload 6
      // 97: iastore
      // 98: bipush 3
      // 99: ireturn
      // try (38 -> 43): 44 java/lang/IllegalArgumentException
      // try (41 -> 51): 52 java/lang/IllegalArgumentException
      // try (46 -> 56): 57 java/lang/IllegalArgumentException
      // try (54 -> 60): 61 java/lang/IllegalArgumentException
   }

   void clamp(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      this.arr_d[var2] = var3;
   }

   void calculate_20(Object[] param1) {
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
      // 0c: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 100700657482348
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 1e: istore 6
      // 20: aload 0
      // 21: iload 6
      // 23: ifeq 91
      // 26: getfield rip/breeze/inject/MathUtil11.arr_e [I
      // 29: ifnull 88
      // 2c: goto 33
      // 2f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32: athrow
      // 33: aload 0
      // 34: iload 6
      // 36: lload 2
      // 37: lconst_0
      // 38: lcmp
      // 39: ifle 85
      // 3c: ifeq 7f
      // 3f: goto 46
      // 42: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 45: athrow
      // 46: lload 2
      // 47: lconst_0
      // 48: lcmp
      // 49: iflt 6c
      // 4c: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 4f: ifnonnull 6b
      // 52: goto 59
      // 55: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 58: athrow
      // 59: aload 0
      // 5a: new rip/breeze/inject/ð
      // 5d: dup
      // 5e: invokespecial rip/breeze/inject/ð.<init> ()V
      // 61: putfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 64: goto 6b
      // 67: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6a: athrow
      // 6b: aload 0
      // 6c: lload 4
      // 6e: bipush 1
      // 6f: anewarray 141
      // 72: dup_x2
      // 73: dup_x2
      // 74: pop
      // 75: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 78: bipush 0
      // 79: swap
      // 7a: aastore
      // 7b: invokevirtual rip/breeze/inject/MathUtil11.calculate_21 ([Ljava/lang/Object;)V
      // 7e: aload 0
      // 7f: dup
      // 80: getfield rip/breeze/inject/MathUtil11.int_â I
      // 83: bipush 1
      // 84: iadd
      // 85: putfield rip/breeze/inject/MathUtil11.int_â I
      // 88: aload 0
      // 89: aload 0
      // 8a: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 8d: putfield rip/breeze/inject/MathUtil11.arr_e [I
      // 90: aload 0
      // 91: aconst_null
      // 92: putfield rip/breeze/inject/MathUtil11.arr_d [I
      // 95: return
      // try (20 -> 25): 26 java/lang/IllegalArgumentException
      // try (23 -> 35): 36 java/lang/IllegalArgumentException
      // try (28 -> 44): 45 java/lang/IllegalArgumentException
      // try (38 -> 52): 53 java/lang/IllegalArgumentException
   }

   private void calculate_21(Object[] param1) {
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
      // 00c: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 26312945093905
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 116062229434474
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 28380784907063
      // 025: lxor
      // 026: lstore 8
      // 028: pop2
      // 029: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 02c: aload 0
      // 02d: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 030: bipush 1
      // 031: iaload
      // 032: istore 10
      // 034: istore 11
      // 036: aload 0
      // 037: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 03a: bipush 2
      // 03b: iaload
      // 03c: istore 12
      // 03e: aload 0
      // 03f: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 042: bipush 0
      // 043: anewarray 141
      // 046: invokevirtual rip/breeze/inject/Util139.getValue ([Ljava/lang/Object;)I
      // 049: iload 11
      // 04b: ifne 11d
      // 04e: bipush 50
      // 050: if_icmpge 119
      // 053: goto 05a
      // 056: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 059: athrow
      // 05a: aload 0
      // 05b: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 05e: aload 0
      // 05f: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 062: bipush 0
      // 063: iaload
      // 064: lload 6
      // 066: bipush 2
      // 067: anewarray 141
      // 06a: dup_x2
      // 06b: dup_x2
      // 06c: pop
      // 06d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 070: bipush 1
      // 071: swap
      // 072: aastore
      // 073: dup_x1
      // 074: swap
      // 075: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 078: bipush 0
      // 079: swap
      // 07a: aastore
      // 07b: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 07e: iload 10
      // 080: lload 6
      // 082: bipush 2
      // 083: anewarray 141
      // 086: dup_x2
      // 087: dup_x2
      // 088: pop
      // 089: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08c: bipush 1
      // 08d: swap
      // 08e: aastore
      // 08f: dup_x1
      // 090: swap
      // 091: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 094: bipush 0
      // 095: swap
      // 096: aastore
      // 097: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 09a: pop
      // 09b: aload 0
      // 09c: lload 4
      // 09e: bipush 3
      // 09f: bipush 3
      // 0a0: iload 10
      // 0a2: iadd
      // 0a3: bipush 3
      // 0a4: anewarray 141
      // 0a7: dup_x1
      // 0a8: swap
      // 0a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ac: bipush 2
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x1
      // 0b0: swap
      // 0b1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b4: bipush 1
      // 0b5: swap
      // 0b6: aastore
      // 0b7: dup_x2
      // 0b8: dup_x2
      // 0b9: pop
      // 0ba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bd: bipush 0
      // 0be: swap
      // 0bf: aastore
      // 0c0: invokevirtual rip/breeze/inject/MathUtil11.calculate_4 ([Ljava/lang/Object;)V
      // 0c3: aload 0
      // 0c4: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 0c7: iload 12
      // 0c9: lload 6
      // 0cb: bipush 2
      // 0cc: anewarray 141
      // 0cf: dup_x2
      // 0d0: dup_x2
      // 0d1: pop
      // 0d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d5: bipush 1
      // 0d6: swap
      // 0d7: aastore
      // 0d8: dup_x1
      // 0d9: swap
      // 0da: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0dd: bipush 0
      // 0de: swap
      // 0df: aastore
      // 0e0: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0e3: pop
      // 0e4: aload 0
      // 0e5: bipush 3
      // 0e6: iload 10
      // 0e8: iadd
      // 0e9: lload 4
      // 0eb: dup2_x1
      // 0ec: pop2
      // 0ed: bipush 3
      // 0ee: iload 10
      // 0f0: iadd
      // 0f1: iload 12
      // 0f3: iadd
      // 0f4: bipush 3
      // 0f5: anewarray 141
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fd: bipush 2
      // 0fe: swap
      // 0ff: aastore
      // 100: dup_x1
      // 101: swap
      // 102: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 105: bipush 1
      // 106: swap
      // 107: aastore
      // 108: dup_x2
      // 109: dup_x2
      // 10a: pop
      // 10b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10e: bipush 0
      // 10f: swap
      // 110: aastore
      // 111: invokevirtual rip/breeze/inject/MathUtil11.calculate_4 ([Ljava/lang/Object;)V
      // 114: return
      // 115: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 118: athrow
      // 119: aload 0
      // 11a: getfield rip/breeze/inject/MathUtil11.int_â I
      // 11d: iload 11
      // 11f: lload 2
      // 120: lconst_0
      // 121: lcmp
      // 122: ifle 14d
      // 125: ifne 14c
      // 128: ifne 13f
      // 12b: goto 132
      // 12e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 131: athrow
      // 132: aload 0
      // 133: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 136: bipush 0
      // 137: iaload
      // 138: goto 14e
      // 13b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13e: athrow
      // 13f: aload 0
      // 140: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 143: bipush 0
      // 144: iaload
      // 145: aload 0
      // 146: getfield rip/breeze/inject/MathUtil11.arr_e [I
      // 149: bipush 0
      // 14a: iaload
      // 14b: isub
      // 14c: bipush 1
      // 14d: isub
      // 14e: istore 13
      // 150: aload 0
      // 151: getfield rip/breeze/inject/MathUtil11.arr_e [I
      // 154: bipush 1
      // 155: iaload
      // 156: istore 14
      // 158: iload 10
      // 15a: iload 14
      // 15c: isub
      // 15d: istore 15
      // 15f: sipush 255
      // 162: istore 16
      // 164: iload 12
      // 166: iload 11
      // 168: lload 2
      // 169: lconst_0
      // 16a: lcmp
      // 16b: iflt 228
      // 16e: ifne 226
      // 171: ifne 21d
      // 174: goto 17b
      // 177: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17a: athrow
      // 17b: iload 15
      // 17d: lload 2
      // 17e: lconst_0
      // 17f: lcmp
      // 180: ifle 1c3
      // 183: iload 11
      // 185: ifne 1bf
      // 188: goto 18f
      // 18b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18e: athrow
      // 18f: tableswitch 130 -3 3 45 45 45 61 114 114 114
      // 1b8: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1bb: athrow
      // 1bc: sipush 248
      // 1bf: istore 16
      // 1c1: iload 11
      // 1c3: lload 2
      // 1c4: lconst_0
      // 1c5: lcmp
      // 1c6: ifle 1ce
      // 1c9: ifeq 27f
      // 1cc: iload 13
      // 1ce: iload 11
      // 1d0: ifne 1ee
      // 1d3: goto 1da
      // 1d6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d9: athrow
      // 1da: bipush 64
      // 1dc: if_icmpge 1f1
      // 1df: goto 1e6
      // 1e2: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e5: athrow
      // 1e6: bipush 0
      // 1e7: goto 1ee
      // 1ea: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ed: athrow
      // 1ee: goto 1f4
      // 1f1: sipush 251
      // 1f4: istore 16
      // 1f6: iload 11
      // 1f8: lload 2
      // 1f9: lconst_0
      // 1fa: lcmp
      // 1fb: iflt 208
      // 1fe: ifeq 27f
      // 201: sipush 252
      // 204: istore 16
      // 206: iload 11
      // 208: lload 2
      // 209: lconst_0
      // 20a: lcmp
      // 20b: iflt 213
      // 20e: ifeq 27f
      // 211: iload 11
      // 213: ifeq 27f
      // 216: goto 21d
      // 219: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21c: athrow
      // 21d: iload 15
      // 21f: goto 226
      // 222: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 225: athrow
      // 226: iload 11
      // 228: lload 2
      // 229: lconst_0
      // 22a: lcmp
      // 22b: ifle 283
      // 22e: ifne 281
      // 231: ifne 27f
      // 234: goto 23b
      // 237: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23a: athrow
      // 23b: iload 12
      // 23d: bipush 1
      // 23e: iload 11
      // 240: ifne 296
      // 243: goto 24a
      // 246: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 249: athrow
      // 24a: if_icmpne 27f
      // 24d: goto 254
      // 250: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 253: athrow
      // 254: iload 13
      // 256: iload 11
      // 258: ifne 277
      // 25b: goto 262
      // 25e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 261: athrow
      // 262: bipush 63
      // 264: if_icmpge 27a
      // 267: goto 26e
      // 26a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 26d: athrow
      // 26e: bipush 64
      // 270: goto 277
      // 273: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 276: athrow
      // 277: goto 27d
      // 27a: sipush 247
      // 27d: istore 16
      // 27f: iload 16
      // 281: iload 11
      // 283: lload 2
      // 284: lconst_0
      // 285: lcmp
      // 286: ifle 28f
      // 289: ifne 32c
      // 28c: sipush 255
      // 28f: goto 296
      // 292: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 295: athrow
      // 296: if_icmpeq 32a
      // 299: bipush 3
      // 29a: istore 17
      // 29c: bipush 0
      // 29d: istore 18
      // 29f: iload 18
      // 2a1: iload 14
      // 2a3: if_icmpge 32a
      // 2a6: iload 18
      // 2a8: iload 11
      // 2aa: lload 2
      // 2ab: lconst_0
      // 2ac: lcmp
      // 2ad: iflt 2b5
      // 2b0: ifne 32c
      // 2b3: iload 11
      // 2b5: ifne 32c
      // 2b8: goto 2bf
      // 2bb: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2be: athrow
      // 2bf: iload 10
      // 2c1: if_icmpge 32a
      // 2c4: goto 2cb
      // 2c7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ca: athrow
      // 2cb: aload 0
      // 2cc: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 2cf: iload 17
      // 2d1: iaload
      // 2d2: lload 2
      // 2d3: lconst_0
      // 2d4: lcmp
      // 2d5: ifle 309
      // 2d8: iload 11
      // 2da: ifne 305
      // 2dd: goto 2e4
      // 2e0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e3: athrow
      // 2e4: lload 2
      // 2e5: lconst_0
      // 2e6: lcmp
      // 2e7: ifle 31a
      // 2ea: aload 0
      // 2eb: getfield rip/breeze/inject/MathUtil11.arr_e [I
      // 2ee: iload 17
      // 2f0: iaload
      // 2f1: if_icmpeq 312
      // 2f4: goto 2fb
      // 2f7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2fa: athrow
      // 2fb: sipush 255
      // 2fe: goto 305
      // 301: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 304: athrow
      // 305: istore 16
      // 307: iload 11
      // 309: lload 2
      // 30a: lconst_0
      // 30b: lcmp
      // 30c: iflt 31a
      // 30f: ifeq 32a
      // 312: iinc 17 1
      // 315: iinc 18 1
      // 318: iload 11
      // 31a: ifeq 29f
      // 31d: lload 2
      // 31e: lconst_0
      // 31f: lcmp
      // 320: ifle 3f2
      // 323: goto 32a
      // 326: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 329: athrow
      // 32a: iload 16
      // 32c: lload 2
      // 32d: lconst_0
      // 32e: lcmp
      // 32f: ifle 397
      // 332: lookupswitch 596 7 0 66 64 111 247 204 248 397 251 323 252 474 255 596
      // 374: aload 0
      // 375: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 378: iload 13
      // 37a: lload 8
      // 37c: bipush 2
      // 37d: anewarray 141
      // 380: dup_x2
      // 381: dup_x2
      // 382: pop
      // 383: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 386: bipush 1
      // 387: swap
      // 388: aastore
      // 389: dup_x1
      // 38a: swap
      // 38b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 38e: bipush 0
      // 38f: swap
      // 390: aastore
      // 391: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 394: pop
      // 395: iload 11
      // 397: ifeq 660
      // 39a: goto 3a1
      // 39d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a0: athrow
      // 3a1: aload 0
      // 3a2: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 3a5: bipush 64
      // 3a7: iload 13
      // 3a9: iadd
      // 3aa: lload 8
      // 3ac: bipush 2
      // 3ad: anewarray 141
      // 3b0: dup_x2
      // 3b1: dup_x2
      // 3b2: pop
      // 3b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b6: bipush 1
      // 3b7: swap
      // 3b8: aastore
      // 3b9: dup_x1
      // 3ba: swap
      // 3bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3be: bipush 0
      // 3bf: swap
      // 3c0: aastore
      // 3c1: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 3c4: pop
      // 3c5: aload 0
      // 3c6: bipush 3
      // 3c7: iload 10
      // 3c9: iadd
      // 3ca: lload 4
      // 3cc: dup2_x1
      // 3cd: pop2
      // 3ce: bipush 4
      // 3cf: iload 10
      // 3d1: iadd
      // 3d2: bipush 3
      // 3d3: anewarray 141
      // 3d6: dup_x1
      // 3d7: swap
      // 3d8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3db: bipush 2
      // 3dc: swap
      // 3dd: aastore
      // 3de: dup_x1
      // 3df: swap
      // 3e0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3e3: bipush 1
      // 3e4: swap
      // 3e5: aastore
      // 3e6: dup_x2
      // 3e7: dup_x2
      // 3e8: pop
      // 3e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ec: bipush 0
      // 3ed: swap
      // 3ee: aastore
      // 3ef: invokevirtual rip/breeze/inject/MathUtil11.calculate_4 ([Ljava/lang/Object;)V
      // 3f2: iload 11
      // 3f4: ifeq 660
      // 3f7: goto 3fe
      // 3fa: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3fd: athrow
      // 3fe: aload 0
      // 3ff: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 402: sipush 247
      // 405: lload 8
      // 407: bipush 2
      // 408: anewarray 141
      // 40b: dup_x2
      // 40c: dup_x2
      // 40d: pop
      // 40e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 411: bipush 1
      // 412: swap
      // 413: aastore
      // 414: dup_x1
      // 415: swap
      // 416: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 419: bipush 0
      // 41a: swap
      // 41b: aastore
      // 41c: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 41f: iload 13
      // 421: lload 6
      // 423: bipush 2
      // 424: anewarray 141
      // 427: dup_x2
      // 428: dup_x2
      // 429: pop
      // 42a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42d: bipush 1
      // 42e: swap
      // 42f: aastore
      // 430: dup_x1
      // 431: swap
      // 432: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 435: bipush 0
      // 436: swap
      // 437: aastore
      // 438: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 43b: pop
      // 43c: aload 0
      // 43d: bipush 3
      // 43e: iload 10
      // 440: iadd
      // 441: lload 4
      // 443: dup2_x1
      // 444: pop2
      // 445: bipush 4
      // 446: iload 10
      // 448: iadd
      // 449: bipush 3
      // 44a: anewarray 141
      // 44d: dup_x1
      // 44e: swap
      // 44f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 452: bipush 2
      // 453: swap
      // 454: aastore
      // 455: dup_x1
      // 456: swap
      // 457: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 45a: bipush 1
      // 45b: swap
      // 45c: aastore
      // 45d: dup_x2
      // 45e: dup_x2
      // 45f: pop
      // 460: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 463: bipush 0
      // 464: swap
      // 465: aastore
      // 466: invokevirtual rip/breeze/inject/MathUtil11.calculate_4 ([Ljava/lang/Object;)V
      // 469: iload 11
      // 46b: ifeq 660
      // 46e: goto 475
      // 471: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 474: athrow
      // 475: aload 0
      // 476: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 479: sipush 251
      // 47c: lload 8
      // 47e: bipush 2
      // 47f: anewarray 141
      // 482: dup_x2
      // 483: dup_x2
      // 484: pop
      // 485: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 488: bipush 1
      // 489: swap
      // 48a: aastore
      // 48b: dup_x1
      // 48c: swap
      // 48d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 490: bipush 0
      // 491: swap
      // 492: aastore
      // 493: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 496: iload 13
      // 498: lload 6
      // 49a: bipush 2
      // 49b: anewarray 141
      // 49e: dup_x2
      // 49f: dup_x2
      // 4a0: pop
      // 4a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a4: bipush 1
      // 4a5: swap
      // 4a6: aastore
      // 4a7: dup_x1
      // 4a8: swap
      // 4a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4ac: bipush 0
      // 4ad: swap
      // 4ae: aastore
      // 4af: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 4b2: pop
      // 4b3: iload 11
      // 4b5: ifeq 660
      // 4b8: goto 4bf
      // 4bb: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4be: athrow
      // 4bf: aload 0
      // 4c0: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 4c3: sipush 251
      // 4c6: iload 15
      // 4c8: iadd
      // 4c9: lload 8
      // 4cb: bipush 2
      // 4cc: anewarray 141
      // 4cf: dup_x2
      // 4d0: dup_x2
      // 4d1: pop
      // 4d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d5: bipush 1
      // 4d6: swap
      // 4d7: aastore
      // 4d8: dup_x1
      // 4d9: swap
      // 4da: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4dd: bipush 0
      // 4de: swap
      // 4df: aastore
      // 4e0: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 4e3: iload 13
      // 4e5: lload 6
      // 4e7: bipush 2
      // 4e8: anewarray 141
      // 4eb: dup_x2
      // 4ec: dup_x2
      // 4ed: pop
      // 4ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f1: bipush 1
      // 4f2: swap
      // 4f3: aastore
      // 4f4: dup_x1
      // 4f5: swap
      // 4f6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4f9: bipush 0
      // 4fa: swap
      // 4fb: aastore
      // 4fc: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 4ff: pop
      // 500: iload 11
      // 502: ifeq 660
      // 505: goto 50c
      // 508: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 50b: athrow
      // 50c: aload 0
      // 50d: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 510: sipush 251
      // 513: iload 15
      // 515: iadd
      // 516: lload 8
      // 518: bipush 2
      // 519: anewarray 141
      // 51c: dup_x2
      // 51d: dup_x2
      // 51e: pop
      // 51f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 522: bipush 1
      // 523: swap
      // 524: aastore
      // 525: dup_x1
      // 526: swap
      // 527: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 52a: bipush 0
      // 52b: swap
      // 52c: aastore
      // 52d: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 530: iload 13
      // 532: lload 6
      // 534: bipush 2
      // 535: anewarray 141
      // 538: dup_x2
      // 539: dup_x2
      // 53a: pop
      // 53b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 53e: bipush 1
      // 53f: swap
      // 540: aastore
      // 541: dup_x1
      // 542: swap
      // 543: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 546: bipush 0
      // 547: swap
      // 548: aastore
      // 549: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 54c: pop
      // 54d: aload 0
      // 54e: bipush 3
      // 54f: iload 14
      // 551: iadd
      // 552: lload 4
      // 554: dup2_x1
      // 555: pop2
      // 556: bipush 3
      // 557: iload 10
      // 559: iadd
      // 55a: bipush 3
      // 55b: anewarray 141
      // 55e: dup_x1
      // 55f: swap
      // 560: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 563: bipush 2
      // 564: swap
      // 565: aastore
      // 566: dup_x1
      // 567: swap
      // 568: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 56b: bipush 1
      // 56c: swap
      // 56d: aastore
      // 56e: dup_x2
      // 56f: dup_x2
      // 570: pop
      // 571: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 574: bipush 0
      // 575: swap
      // 576: aastore
      // 577: invokevirtual rip/breeze/inject/MathUtil11.calculate_4 ([Ljava/lang/Object;)V
      // 57a: iload 11
      // 57c: ifeq 660
      // 57f: goto 586
      // 582: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 585: athrow
      // 586: aload 0
      // 587: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 58a: sipush 255
      // 58d: lload 8
      // 58f: bipush 2
      // 590: anewarray 141
      // 593: dup_x2
      // 594: dup_x2
      // 595: pop
      // 596: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 599: bipush 1
      // 59a: swap
      // 59b: aastore
      // 59c: dup_x1
      // 59d: swap
      // 59e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5a1: bipush 0
      // 5a2: swap
      // 5a3: aastore
      // 5a4: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 5a7: iload 13
      // 5a9: lload 6
      // 5ab: bipush 2
      // 5ac: anewarray 141
      // 5af: dup_x2
      // 5b0: dup_x2
      // 5b1: pop
      // 5b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b5: bipush 1
      // 5b6: swap
      // 5b7: aastore
      // 5b8: dup_x1
      // 5b9: swap
      // 5ba: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5bd: bipush 0
      // 5be: swap
      // 5bf: aastore
      // 5c0: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 5c3: iload 10
      // 5c5: lload 6
      // 5c7: bipush 2
      // 5c8: anewarray 141
      // 5cb: dup_x2
      // 5cc: dup_x2
      // 5cd: pop
      // 5ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5d1: bipush 1
      // 5d2: swap
      // 5d3: aastore
      // 5d4: dup_x1
      // 5d5: swap
      // 5d6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5d9: bipush 0
      // 5da: swap
      // 5db: aastore
      // 5dc: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 5df: pop
      // 5e0: aload 0
      // 5e1: lload 4
      // 5e3: bipush 3
      // 5e4: bipush 3
      // 5e5: iload 10
      // 5e7: iadd
      // 5e8: bipush 3
      // 5e9: anewarray 141
      // 5ec: dup_x1
      // 5ed: swap
      // 5ee: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5f1: bipush 2
      // 5f2: swap
      // 5f3: aastore
      // 5f4: dup_x1
      // 5f5: swap
      // 5f6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5f9: bipush 1
      // 5fa: swap
      // 5fb: aastore
      // 5fc: dup_x2
      // 5fd: dup_x2
      // 5fe: pop
      // 5ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 602: bipush 0
      // 603: swap
      // 604: aastore
      // 605: invokevirtual rip/breeze/inject/MathUtil11.calculate_4 ([Ljava/lang/Object;)V
      // 608: aload 0
      // 609: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 60c: iload 12
      // 60e: lload 6
      // 610: bipush 2
      // 611: anewarray 141
      // 614: dup_x2
      // 615: dup_x2
      // 616: pop
      // 617: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 61a: bipush 1
      // 61b: swap
      // 61c: aastore
      // 61d: dup_x1
      // 61e: swap
      // 61f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 622: bipush 0
      // 623: swap
      // 624: aastore
      // 625: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 628: pop
      // 629: aload 0
      // 62a: bipush 3
      // 62b: iload 10
      // 62d: iadd
      // 62e: lload 4
      // 630: dup2_x1
      // 631: pop2
      // 632: bipush 3
      // 633: iload 10
      // 635: iadd
      // 636: iload 12
      // 638: iadd
      // 639: bipush 3
      // 63a: anewarray 141
      // 63d: dup_x1
      // 63e: swap
      // 63f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 642: bipush 2
      // 643: swap
      // 644: aastore
      // 645: dup_x1
      // 646: swap
      // 647: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 64a: bipush 1
      // 64b: swap
      // 64c: aastore
      // 64d: dup_x2
      // 64e: dup_x2
      // 64f: pop
      // 650: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 653: bipush 0
      // 654: swap
      // 655: aastore
      // 656: invokevirtual rip/breeze/inject/MathUtil11.calculate_4 ([Ljava/lang/Object;)V
      // 659: goto 660
      // 65c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 65f: athrow
      // 660: return
      // try (38 -> 47): 48 java/lang/IllegalArgumentException
      // try (45 -> 176): 176 java/lang/IllegalArgumentException
      // try (180 -> 187): 188 java/lang/IllegalArgumentException
      // try (186 -> 195): 195 java/lang/IllegalArgumentException
      // try (220 -> 228): 229 java/lang/IllegalArgumentException
      // try (227 -> 238): 239 java/lang/IllegalArgumentException
      // try (231 -> 242): 242 java/lang/IllegalArgumentException
      // try (246 -> 255): 256 java/lang/IllegalArgumentException
      // try (252 -> 260): 261 java/lang/IllegalArgumentException
      // try (258 -> 264): 265 java/lang/IllegalArgumentException
      // try (278 -> 286): 287 java/lang/IllegalArgumentException
      // try (284 -> 290): 291 java/lang/IllegalArgumentException
      // try (293 -> 300): 301 java/lang/IllegalArgumentException
      // try (299 -> 307): 308 java/lang/IllegalArgumentException
      // try (303 -> 311): 312 java/lang/IllegalArgumentException
      // try (310 -> 317): 318 java/lang/IllegalArgumentException
      // try (314 -> 322): 323 java/lang/IllegalArgumentException
      // try (320 -> 326): 327 java/lang/IllegalArgumentException
      // try (333 -> 340): 341 java/lang/IllegalArgumentException
      // try (351 -> 360): 361 java/lang/IllegalArgumentException
      // try (358 -> 365): 366 java/lang/IllegalArgumentException
      // try (363 -> 378): 379 java/lang/IllegalArgumentException
      // try (368 -> 390): 391 java/lang/IllegalArgumentException
      // try (381 -> 394): 395 java/lang/IllegalArgumentException
      // try (398 -> 408): 413 java/lang/IllegalArgumentException
      // try (416 -> 444): 445 java/lang/IllegalArgumentException
      // try (421 -> 504): 505 java/lang/IllegalArgumentException
      // try (447 -> 580): 581 java/lang/IllegalArgumentException
      // try (507 -> 624): 625 java/lang/IllegalArgumentException
      // try (583 -> 670): 671 java/lang/IllegalArgumentException
      // try (627 -> 748): 749 java/lang/IllegalArgumentException
      // try (673 -> 891): 892 java/lang/IllegalArgumentException
   }

   private void calculate_4(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:74)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:54)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:43)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:317)
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast java/lang/Integer
      // 1c: invokevirtual java/lang/Integer.intValue ()I
      // 1f: istore 5
      // 21: pop
      // 22: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 25: lload 2
      // 26: lxor
      // 27: lstore 2
      // 28: lload 2
      // 29: dup2
      // 2a: ldc2_w 137757773467337
      // 2d: lxor
      // 2e: lstore 6
      // 30: pop2
      // 31: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 34: iload 4
      // 36: istore 8
      // 38: istore 9
      // 3a: iload 8
      // 3c: iload 5
      // 3e: if_icmpge 7e
      // 41: aload 0
      // 42: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 45: aload 0
      // 46: getfield rip/breeze/inject/MathUtil11.arr_d [I
      // 49: iload 8
      // 4b: iaload
      // 4c: aload 0
      // 4d: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 50: lload 6
      // 52: dup2_x1
      // 53: pop2
      // 54: bipush 4
      // 55: anewarray 141
      // 58: dup_x1
      // 59: swap
      // 5a: bipush 3
      // 5b: swap
      // 5c: aastore
      // 5d: dup_x2
      // 5e: dup_x2
      // 5f: pop
      // 60: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 63: bipush 2
      // 64: swap
      // 65: aastore
      // 66: dup_x1
      // 67: swap
      // 68: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6b: bipush 1
      // 6c: swap
      // 6d: aastore
      // 6e: dup_x1
      // 6f: swap
      // 70: bipush 0
      // 71: swap
      // 72: aastore
      // 73: invokestatic rip/breeze/inject/à.method_025 ([Ljava/lang/Object;)V
      // 76: iinc 8 1
      // 79: iload 9
      // 7b: ifne 3a
      // 7e: lload 2
      // 7f: lconst_0
      // 80: lcmp
      // 81: iflt 79
      // 84: return
   }

   private void processAll_7(Object[] param1) {
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
      // 00e: checkcast java/lang/Object
      // 011: astore 4
      // 013: pop
      // 014: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 83865386799052
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 108389127891242
      // 026: lxor
      // 027: lstore 7
      // 029: dup2
      // 02a: ldc2_w 42652162895267
      // 02d: lxor
      // 02e: lstore 9
      // 030: dup2
      // 031: ldc2_w 95157255663358
      // 034: lxor
      // 035: lstore 11
      // 037: pop2
      // 038: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 03b: istore 13
      // 03d: aload 4
      // 03f: instanceof java/lang/Integer
      // 042: iload 13
      // 044: ifeq 09c
      // 047: ifeq 084
      // 04a: goto 051
      // 04d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 050: athrow
      // 051: aload 0
      // 052: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 055: aload 4
      // 057: checkcast java/lang/Integer
      // 05a: invokevirtual java/lang/Integer.intValue ()I
      // 05d: lload 11
      // 05f: bipush 2
      // 060: anewarray 141
      // 063: dup_x2
      // 064: dup_x2
      // 065: pop
      // 066: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 069: bipush 1
      // 06a: swap
      // 06b: aastore
      // 06c: dup_x1
      // 06d: swap
      // 06e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 071: bipush 0
      // 072: swap
      // 073: aastore
      // 074: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 077: pop
      // 078: iload 13
      // 07a: ifne 159
      // 07d: goto 084
      // 080: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 083: athrow
      // 084: aload 4
      // 086: iload 13
      // 088: ifeq 139
      // 08b: goto 092
      // 08e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 091: athrow
      // 092: instanceof java/lang/String
      // 095: goto 09c
      // 098: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 09b: athrow
      // 09c: lload 2
      // 09d: lconst_0
      // 09e: lcmp
      // 09f: ifle 105
      // 0a2: ifeq 10f
      // 0a5: aload 0
      // 0a6: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 0a9: bipush 7
      // 0ab: lload 11
      // 0ad: bipush 2
      // 0ae: anewarray 141
      // 0b1: dup_x2
      // 0b2: dup_x2
      // 0b3: pop
      // 0b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b7: bipush 1
      // 0b8: swap
      // 0b9: aastore
      // 0ba: dup_x1
      // 0bb: swap
      // 0bc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bf: bipush 0
      // 0c0: swap
      // 0c1: aastore
      // 0c2: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0c5: aload 0
      // 0c6: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0c9: aload 4
      // 0cb: checkcast java/lang/String
      // 0ce: lload 5
      // 0d0: bipush 2
      // 0d1: anewarray 141
      // 0d4: dup_x2
      // 0d5: dup_x2
      // 0d6: pop
      // 0d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0da: bipush 1
      // 0db: swap
      // 0dc: aastore
      // 0dd: dup_x1
      // 0de: swap
      // 0df: bipush 0
      // 0e0: swap
      // 0e1: aastore
      // 0e2: invokevirtual rip/breeze/inject/Util139.getBreezeClass3_2 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass3;
      // 0e5: getfield rip/breeze/inject/BreezeClass3.int_è I
      // 0e8: lload 9
      // 0ea: bipush 2
      // 0eb: anewarray 141
      // 0ee: dup_x2
      // 0ef: dup_x2
      // 0f0: pop
      // 0f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f4: bipush 1
      // 0f5: swap
      // 0f6: aastore
      // 0f7: dup_x1
      // 0f8: swap
      // 0f9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fc: bipush 0
      // 0fd: swap
      // 0fe: aastore
      // 0ff: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 102: pop
      // 103: iload 13
      // 105: ifne 159
      // 108: goto 10f
      // 10b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10e: athrow
      // 10f: aload 0
      // 110: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 113: bipush 8
      // 115: lload 11
      // 117: bipush 2
      // 118: anewarray 141
      // 11b: dup_x2
      // 11c: dup_x2
      // 11d: pop
      // 11e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 121: bipush 1
      // 122: swap
      // 123: aastore
      // 124: dup_x1
      // 125: swap
      // 126: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 129: bipush 0
      // 12a: swap
      // 12b: aastore
      // 12c: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 12f: pop
      // 130: aload 4
      // 132: goto 139
      // 135: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 138: athrow
      // 139: checkcast rip/breeze/inject/ª
      // 13c: aload 0
      // 13d: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 140: lload 7
      // 142: dup2_x1
      // 143: pop2
      // 144: bipush 2
      // 145: anewarray 141
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 1
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x2
      // 14e: dup_x2
      // 14f: pop
      // 150: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 153: bipush 0
      // 154: swap
      // 155: aastore
      // 156: invokevirtual rip/breeze/inject/ª.method_006 ([Ljava/lang/Object;)V
      // 159: return
      // try (37 -> 42): 43 java/lang/IllegalArgumentException
      // try (41 -> 70): 71 java/lang/IllegalArgumentException
      // try (45 -> 76): 77 java/lang/IllegalArgumentException
      // try (73 -> 80): 81 java/lang/IllegalArgumentException
      // try (83 -> 149): 150 java/lang/IllegalArgumentException
      // try (88 -> 174): 175 java/lang/IllegalArgumentException
   }

   boolean checkCondition_2(Object[] param1) {
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
      // 004: checkcast rip/breeze/inject/ï
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Integer
      // 018: invokevirtual java/lang/Integer.intValue ()I
      // 01b: istore 4
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/Boolean
      // 023: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 026: istore 5
      // 028: dup
      // 029: bipush 4
      // 02a: aaload
      // 02b: checkcast java/lang/Boolean
      // 02e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 031: istore 6
      // 033: dup
      // 034: bipush 5
      // 035: aaload
      // 036: checkcast java/lang/Integer
      // 039: invokevirtual java/lang/Integer.intValue ()I
      // 03c: istore 7
      // 03e: dup
      // 03f: bipush 6
      // 041: aaload
      // 042: checkcast java/lang/Integer
      // 045: invokevirtual java/lang/Integer.intValue ()I
      // 048: istore 8
      // 04a: dup
      // 04b: bipush 7
      // 04d: aaload
      // 04e: checkcast java/lang/Integer
      // 051: invokevirtual java/lang/Integer.intValue ()I
      // 054: istore 9
      // 056: dup
      // 057: bipush 8
      // 059: aaload
      // 05a: checkcast java/lang/Integer
      // 05d: invokevirtual java/lang/Integer.intValue ()I
      // 060: istore 10
      // 062: pop
      // 063: iload 3
      // 064: i2l
      // 065: bipush 32
      // 067: lshl
      // 068: iload 4
      // 06a: i2l
      // 06b: bipush 48
      // 06d: lshl
      // 06e: bipush 32
      // 070: lushr
      // 071: lor
      // 072: iload 10
      // 074: i2l
      // 075: bipush 48
      // 077: lshl
      // 078: bipush 48
      // 07a: lushr
      // 07b: lor
      // 07c: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 07f: lxor
      // 080: lstore 11
      // 082: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 085: istore 13
      // 087: aload 2
      // 088: aload 0
      // 089: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 08c: bipush 0
      // 08d: anewarray 141
      // 090: invokevirtual rip/breeze/inject/Util139.getÏ ([Ljava/lang/Object;)Lrip/breeze/inject/ï;
      // 093: if_acmpne 0f6
      // 096: iload 7
      // 098: iload 13
      // 09a: ifne 0f7
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: getfield rip/breeze/inject/MathUtil11.int_ï I
      // 0a8: if_icmpne 0f6
      // 0ab: goto 0b2
      // 0ae: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b1: athrow
      // 0b2: iload 8
      // 0b4: iload 13
      // 0b6: ifne 0f7
      // 0b9: goto 0c0
      // 0bc: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: getfield rip/breeze/inject/MathUtil11.fieldInt_z I
      // 0c4: if_icmpne 0f6
      // 0c7: goto 0ce
      // 0ca: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cd: athrow
      // 0ce: iload 6
      // 0d0: aload 0
      // 0d1: getfield rip/breeze/inject/MathUtil11.int_ò I
      // 0d4: ldc_w 131072
      // 0d7: iand
      // 0d8: iload 13
      // 0da: ifne 0ef
      // 0dd: goto 0e4
      // 0e0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e3: athrow
      // 0e4: ifeq 0f2
      // 0e7: goto 0ee
      // 0ea: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ed: athrow
      // 0ee: bipush 1
      // 0ef: goto 0f3
      // 0f2: bipush 0
      // 0f3: if_icmpeq 0f8
      // 0f6: bipush 0
      // 0f7: ireturn
      // 0f8: aload 0
      // 0f9: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0fc: bipush 0
      // 0fd: anewarray 141
      // 100: invokevirtual rip/breeze/inject/Util139.getValue ([Ljava/lang/Object;)I
      // 103: bipush 49
      // 105: iload 10
      // 107: ifle 12a
      // 10a: iload 13
      // 10c: ifne 127
      // 10f: if_icmpge 13b
      // 112: goto 119
      // 115: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 118: athrow
      // 119: aload 0
      // 11a: getfield rip/breeze/inject/MathUtil11.int_ò I
      // 11d: sipush 4096
      // 120: goto 127
      // 123: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 126: athrow
      // 127: iand
      // 128: iload 13
      // 12a: ifne 138
      // 12d: ifeq 13b
      // 130: goto 137
      // 133: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 136: athrow
      // 137: bipush 1
      // 138: goto 13c
      // 13b: bipush 0
      // 13c: istore 14
      // 13e: iload 5
      // 140: iload 13
      // 142: iload 10
      // 144: iflt 160
      // 147: ifne 15e
      // 14a: iload 14
      // 14c: if_icmpeq 15c
      // 14f: goto 156
      // 152: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 155: athrow
      // 156: bipush 0
      // 157: ireturn
      // 158: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15b: athrow
      // 15c: iload 9
      // 15e: iload 13
      // 160: iload 4
      // 162: iflt 1a6
      // 165: ifne 1a4
      // 168: ifne 192
      // 16b: goto 172
      // 16e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 171: athrow
      // 172: aload 0
      // 173: getfield rip/breeze/inject/MathUtil11.int_µ I
      // 176: iload 13
      // 178: ifne 220
      // 17b: goto 182
      // 17e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 181: athrow
      // 182: ifeq 21f
      // 185: goto 18c
      // 188: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18b: athrow
      // 18c: bipush 0
      // 18d: ireturn
      // 18e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 191: athrow
      // 192: aload 2
      // 193: iload 9
      // 195: bipush 1
      // 196: anewarray 141
      // 199: dup_x1
      // 19a: swap
      // 19b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19e: bipush 0
      // 19f: swap
      // 1a0: aastore
      // 1a1: invokevirtual rip/breeze/inject/ï.method_037 ([Ljava/lang/Object;)I
      // 1a4: iload 13
      // 1a6: iload 3
      // 1a7: iflt 1b1
      // 1aa: ifne 220
      // 1ad: aload 0
      // 1ae: getfield rip/breeze/inject/MathUtil11.int_µ I
      // 1b1: if_icmpne 21f
      // 1b4: goto 1bb
      // 1b7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ba: athrow
      // 1bb: iload 9
      // 1bd: bipush 2
      // 1be: iadd
      // 1bf: istore 15
      // 1c1: bipush 0
      // 1c2: istore 16
      // 1c4: iload 16
      // 1c6: aload 0
      // 1c7: getfield rip/breeze/inject/MathUtil11.int_µ I
      // 1ca: if_icmpge 21f
      // 1cd: aload 2
      // 1ce: iload 15
      // 1d0: bipush 1
      // 1d1: anewarray 141
      // 1d4: dup_x1
      // 1d5: swap
      // 1d6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d9: bipush 0
      // 1da: swap
      // 1db: aastore
      // 1dc: invokevirtual rip/breeze/inject/ï.method_037 ([Ljava/lang/Object;)I
      // 1df: iload 13
      // 1e1: iload 10
      // 1e3: ifle 1eb
      // 1e6: ifne 220
      // 1e9: iload 13
      // 1eb: ifne 213
      // 1ee: goto 1f5
      // 1f1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f4: athrow
      // 1f5: iload 10
      // 1f7: ifle 21c
      // 1fa: aload 0
      // 1fb: getfield rip/breeze/inject/MathUtil11.arr_ª [I
      // 1fe: iload 16
      // 200: iaload
      // 201: if_icmpeq 214
      // 204: goto 20b
      // 207: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20a: athrow
      // 20b: bipush 0
      // 20c: goto 213
      // 20f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 212: athrow
      // 213: ireturn
      // 214: iinc 15 2
      // 217: iinc 16 1
      // 21a: iload 13
      // 21c: ifeq 1c4
      // 21f: bipush 1
      // 220: ireturn
      // try (78 -> 88): 89 java/lang/IllegalArgumentException
      // try (85 -> 94): 95 java/lang/IllegalArgumentException
      // try (91 -> 100): 101 java/lang/IllegalArgumentException
      // try (97 -> 106): 107 java/lang/IllegalArgumentException
      // try (103 -> 116): 117 java/lang/IllegalArgumentException
      // try (109 -> 120): 121 java/lang/IllegalArgumentException
      // try (129 -> 140): 141 java/lang/IllegalArgumentException
      // try (139 -> 146): 147 java/lang/IllegalArgumentException
      // try (149 -> 153): 154 java/lang/IllegalArgumentException
      // try (160 -> 167): 168 java/lang/IllegalArgumentException
      // try (165 -> 172): 172 java/lang/IllegalArgumentException
      // try (175 -> 180): 181 java/lang/IllegalArgumentException
      // try (179 -> 187): 188 java/lang/IllegalArgumentException
      // try (183 -> 191): 192 java/lang/IllegalArgumentException
      // try (190 -> 196): 196 java/lang/IllegalArgumentException
      // try (209 -> 216): 217 java/lang/IllegalArgumentException
      // try (229 -> 246): 247 java/lang/IllegalArgumentException
      // try (244 -> 256): 257 java/lang/IllegalArgumentException
      // try (249 -> 260): 261 java/lang/IllegalArgumentException
   }

   void calculate_22(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      this.int_և = var2 + 6;
      this.int_ֆ = var3 - 6;
   }

   int calculate_23(Object[] param1) {
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
      // 00c: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 87297198932072
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 79979070016573
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 117852799136384
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 25097088862806
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 9618044224391
      // 033: lxor
      // 034: lstore 12
      // 036: dup2
      // 037: ldc2_w 39658714422073
      // 03a: lxor
      // 03b: dup2
      // 03c: bipush 48
      // 03e: lushr
      // 03f: l2i
      // 040: istore 14
      // 042: dup2
      // 043: bipush 16
      // 045: lshl
      // 046: bipush 32
      // 048: lushr
      // 049: l2i
      // 04a: istore 15
      // 04c: dup2
      // 04d: bipush 48
      // 04f: lshl
      // 050: bipush 48
      // 052: lushr
      // 053: l2i
      // 054: istore 16
      // 056: pop2
      // 057: dup2
      // 058: ldc2_w 1009359016724
      // 05b: lxor
      // 05c: lstore 17
      // 05e: dup2
      // 05f: ldc2_w 64267376865609
      // 062: lxor
      // 063: lstore 19
      // 065: dup2
      // 066: ldc2_w 80336629782371
      // 069: lxor
      // 06a: lstore 21
      // 06c: pop2
      // 06d: invokestatic rip/breeze/inject/Util140.getValue_2 ()I
      // 070: istore 23
      // 072: aload 0
      // 073: getfield rip/breeze/inject/MathUtil11.int_և I
      // 076: iload 23
      // 078: ifeq 093
      // 07b: ifeq 091
      // 07e: goto 085
      // 081: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 084: athrow
      // 085: bipush 6
      // 087: aload 0
      // 088: getfield rip/breeze/inject/MathUtil11.int_ֆ I
      // 08b: iadd
      // 08c: ireturn
      // 08d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 090: athrow
      // 091: bipush 8
      // 093: istore 24
      // 095: aload 0
      // 096: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 099: getfield rip/breeze/inject/ð.int_þ_2 I
      // 09c: iload 23
      // 09e: lload 2
      // 09f: lconst_0
      // 0a0: lcmp
      // 0a1: ifle 3da
      // 0a4: ifeq 3d8
      // 0a7: ifle 3d4
      // 0aa: goto 0b1
      // 0ad: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0b5: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0b8: lload 2
      // 0b9: lconst_0
      // 0ba: lcmp
      // 0bb: ifle 15d
      // 0be: ldc_w 65535
      // 0c1: iload 23
      // 0c3: ifeq 15c
      // 0c6: goto 0cd
      // 0c9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cc: athrow
      // 0cd: lload 2
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: iflt 140
      // 0d3: if_icmple 10d
      // 0d6: goto 0dd
      // 0d9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0dc: athrow
      // 0dd: new rip/breeze/inject/ý
      // 0e0: dup
      // 0e1: aload 0
      // 0e2: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0e5: bipush 0
      // 0e6: anewarray 141
      // 0e9: invokevirtual rip/breeze/inject/Util139.getString ([Ljava/lang/Object;)Ljava/lang/String;
      // 0ec: iload 14
      // 0ee: i2s
      // 0ef: swap
      // 0f0: aload 0
      // 0f1: getfield rip/breeze/inject/MathUtil11.string_ð Ljava/lang/String;
      // 0f4: aload 0
      // 0f5: getfield rip/breeze/inject/MathUtil11.string_î Ljava/lang/String;
      // 0f8: iload 15
      // 0fa: swap
      // 0fb: aload 0
      // 0fc: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0ff: getfield rip/breeze/inject/ð.int_þ_2 I
      // 102: iload 16
      // 104: i2s
      // 105: invokespecial rip/breeze/inject/ý.<init> (SLjava/lang/String;Ljava/lang/String;ILjava/lang/String;IS)V
      // 108: athrow
      // 109: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10c: athrow
      // 10d: aload 0
      // 10e: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 111: lload 21
      // 113: sipush 26766
      // 116: ldc2_w 1170342295161340087
      // 119: lload 2
      // 11a: lxor
      // 11b: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 11e: bipush 2
      // 11f: anewarray 141
      // 122: dup_x1
      // 123: swap
      // 124: bipush 1
      // 125: swap
      // 126: aastore
      // 127: dup_x2
      // 128: dup_x2
      // 129: pop
      // 12a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12d: bipush 0
      // 12e: swap
      // 12f: aastore
      // 130: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 133: pop
      // 134: iload 24
      // 136: bipush 16
      // 138: aload 0
      // 139: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 13c: getfield rip/breeze/inject/ð.int_þ_2 I
      // 13f: iadd
      // 140: aload 0
      // 141: getfield rip/breeze/inject/MathUtil11.µ_ê Lrip/breeze/inject/µ;
      // 144: lload 6
      // 146: bipush 2
      // 147: anewarray 141
      // 14a: dup_x2
      // 14b: dup_x2
      // 14c: pop
      // 14d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 150: bipush 1
      // 151: swap
      // 152: aastore
      // 153: dup_x1
      // 154: swap
      // 155: bipush 0
      // 156: swap
      // 157: aastore
      // 158: invokestatic rip/breeze/inject/µ.method_003 ([Ljava/lang/Object;)I
      // 15b: iadd
      // 15c: iadd
      // 15d: istore 24
      // 15f: aload 0
      // 160: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 163: iload 23
      // 165: lload 2
      // 166: lconst_0
      // 167: lcmp
      // 168: ifle 204
      // 16b: ifeq 202
      // 16e: ifnull 1fe
      // 171: goto 178
      // 174: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 177: athrow
      // 178: aload 0
      // 179: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 17c: bipush 0
      // 17d: anewarray 141
      // 180: invokevirtual rip/breeze/inject/Util139.getValue ([Ljava/lang/Object;)I
      // 183: iload 23
      // 185: ifeq 1a3
      // 188: goto 18f
      // 18b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18e: athrow
      // 18f: bipush 50
      // 191: if_icmplt 1a6
      // 194: goto 19b
      // 197: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19a: athrow
      // 19b: bipush 1
      // 19c: goto 1a3
      // 19f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a2: athrow
      // 1a3: goto 1a7
      // 1a6: bipush 0
      // 1a7: istore 25
      // 1a9: aload 0
      // 1aa: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 1ad: iload 25
      // 1af: lload 2
      // 1b0: lconst_0
      // 1b1: lcmp
      // 1b2: iflt 1cd
      // 1b5: ifeq 1ca
      // 1b8: sipush 13661
      // 1bb: ldc2_w 5093275110011919732
      // 1be: lload 2
      // 1bf: lxor
      // 1c0: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 1c3: goto 1d5
      // 1c6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c9: athrow
      // 1ca: sipush 14672
      // 1cd: ldc2_w 8321648895817372017
      // 1d0: lload 2
      // 1d1: lxor
      // 1d2: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 1d5: lload 21
      // 1d7: dup2_x1
      // 1d8: pop2
      // 1d9: bipush 2
      // 1da: anewarray 141
      // 1dd: dup_x1
      // 1de: swap
      // 1df: bipush 1
      // 1e0: swap
      // 1e1: aastore
      // 1e2: dup_x2
      // 1e3: dup_x2
      // 1e4: pop
      // 1e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e8: bipush 0
      // 1e9: swap
      // 1ea: aastore
      // 1eb: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 1ee: pop
      // 1ef: iload 24
      // 1f1: bipush 8
      // 1f3: aload 0
      // 1f4: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 1f7: getfield rip/breeze/inject/ð.int_þ_2 I
      // 1fa: iadd
      // 1fb: iadd
      // 1fc: istore 24
      // 1fe: aload 0
      // 1ff: getfield rip/breeze/inject/MathUtil11.ð_ç Lrip/breeze/inject/ð;
      // 202: iload 23
      // 204: lload 2
      // 205: lconst_0
      // 206: lcmp
      // 207: iflt 253
      // 20a: ifeq 251
      // 20d: ifnull 24d
      // 210: goto 217
      // 213: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 216: athrow
      // 217: aload 0
      // 218: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 21b: lload 21
      // 21d: sipush 13239
      // 220: ldc2_w 2693627634331376517
      // 223: lload 2
      // 224: lxor
      // 225: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 228: bipush 2
      // 229: anewarray 141
      // 22c: dup_x1
      // 22d: swap
      // 22e: bipush 1
      // 22f: swap
      // 230: aastore
      // 231: dup_x2
      // 232: dup_x2
      // 233: pop
      // 234: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 237: bipush 0
      // 238: swap
      // 239: aastore
      // 23a: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 23d: pop
      // 23e: iload 24
      // 240: bipush 8
      // 242: aload 0
      // 243: getfield rip/breeze/inject/MathUtil11.ð_ç Lrip/breeze/inject/ð;
      // 246: getfield rip/breeze/inject/ð.int_þ_2 I
      // 249: iadd
      // 24a: iadd
      // 24b: istore 24
      // 24d: aload 0
      // 24e: getfield rip/breeze/inject/MathUtil11.ð_å Lrip/breeze/inject/ð;
      // 251: iload 23
      // 253: ifeq 2ac
      // 256: ifnull 296
      // 259: goto 260
      // 25c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25f: athrow
      // 260: aload 0
      // 261: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 264: lload 21
      // 266: sipush 23885
      // 269: ldc2_w 4807545204213724523
      // 26c: lload 2
      // 26d: lxor
      // 26e: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 271: bipush 2
      // 272: anewarray 141
      // 275: dup_x1
      // 276: swap
      // 277: bipush 1
      // 278: swap
      // 279: aastore
      // 27a: dup_x2
      // 27b: dup_x2
      // 27c: pop
      // 27d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 280: bipush 0
      // 281: swap
      // 282: aastore
      // 283: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 286: pop
      // 287: iload 24
      // 289: bipush 8
      // 28b: aload 0
      // 28c: getfield rip/breeze/inject/MathUtil11.ð_å Lrip/breeze/inject/ð;
      // 28f: getfield rip/breeze/inject/ð.int_þ_2 I
      // 292: iadd
      // 293: iadd
      // 294: istore 24
      // 296: aload 0
      // 297: lload 2
      // 298: lconst_0
      // 299: lcmp
      // 29a: ifle 2e6
      // 29d: iload 23
      // 29f: ifeq 2e6
      // 2a2: getfield rip/breeze/inject/MathUtil11.ð_ã Lrip/breeze/inject/ð;
      // 2a5: goto 2ac
      // 2a8: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2ab: athrow
      // 2ac: ifnull 2e5
      // 2af: aload 0
      // 2b0: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 2b3: lload 21
      // 2b5: sipush 5291
      // 2b8: ldc2_w 6089992621012843648
      // 2bb: lload 2
      // 2bc: lxor
      // 2bd: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 2c0: bipush 2
      // 2c1: anewarray 141
      // 2c4: dup_x1
      // 2c5: swap
      // 2c6: bipush 1
      // 2c7: swap
      // 2c8: aastore
      // 2c9: dup_x2
      // 2ca: dup_x2
      // 2cb: pop
      // 2cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2cf: bipush 0
      // 2d0: swap
      // 2d1: aastore
      // 2d2: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 2d5: pop
      // 2d6: iload 24
      // 2d8: bipush 8
      // 2da: aload 0
      // 2db: getfield rip/breeze/inject/MathUtil11.ð_ã Lrip/breeze/inject/ð;
      // 2de: getfield rip/breeze/inject/ð.int_þ_2 I
      // 2e1: iadd
      // 2e2: iadd
      // 2e3: istore 24
      // 2e5: aload 0
      // 2e6: getfield rip/breeze/inject/MathUtil11.û_à Lrip/breeze/inject/û;
      // 2e9: iload 23
      // 2eb: ifeq 339
      // 2ee: ifnull 323
      // 2f1: goto 2f8
      // 2f4: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2f7: athrow
      // 2f8: iload 24
      // 2fa: aload 0
      // 2fb: getfield rip/breeze/inject/MathUtil11.û_à Lrip/breeze/inject/û;
      // 2fe: sipush 1394
      // 301: ldc2_w 2872518766331129182
      // 304: lload 2
      // 305: lxor
      // 306: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 309: lload 17
      // 30b: bipush 2
      // 30c: anewarray 141
      // 30f: dup_x2
      // 310: dup_x2
      // 311: pop
      // 312: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 315: bipush 1
      // 316: swap
      // 317: aastore
      // 318: dup_x1
      // 319: swap
      // 31a: bipush 0
      // 31b: swap
      // 31c: aastore
      // 31d: invokevirtual rip/breeze/inject/û.method_003 ([Ljava/lang/Object;)I
      // 320: iadd
      // 321: istore 24
      // 323: aload 0
      // 324: iload 23
      // 326: lload 2
      // 327: lconst_0
      // 328: lcmp
      // 329: ifle 36a
      // 32c: ifeq 368
      // 32f: getfield rip/breeze/inject/MathUtil11.û_ß Lrip/breeze/inject/û;
      // 332: goto 339
      // 335: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 338: athrow
      // 339: ifnull 367
      // 33c: iload 24
      // 33e: aload 0
      // 33f: getfield rip/breeze/inject/MathUtil11.û_ß Lrip/breeze/inject/û;
      // 342: sipush 12697
      // 345: ldc2_w 1476419648864836004
      // 348: lload 2
      // 349: lxor
      // 34a: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 34d: lload 17
      // 34f: bipush 2
      // 350: anewarray 141
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
      // 361: invokevirtual rip/breeze/inject/û.method_003 ([Ljava/lang/Object;)I
      // 364: iadd
      // 365: istore 24
      // 367: aload 0
      // 368: iload 23
      // 36a: ifeq 3d5
      // 36d: getfield rip/breeze/inject/MathUtil11.õ_º Lrip/breeze/inject/õ;
      // 370: ifnull 3d4
      // 373: goto 37a
      // 376: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 379: athrow
      // 37a: iload 24
      // 37c: aload 0
      // 37d: getfield rip/breeze/inject/MathUtil11.õ_º Lrip/breeze/inject/õ;
      // 380: aload 0
      // 381: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 384: aload 0
      // 385: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 388: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 38b: aload 0
      // 38c: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 38f: getfield rip/breeze/inject/ð.int_þ_2 I
      // 392: aload 0
      // 393: getfield rip/breeze/inject/MathUtil11.int_í I
      // 396: lload 8
      // 398: dup2_x1
      // 399: pop2
      // 39a: aload 0
      // 39b: getfield rip/breeze/inject/MathUtil11.int_ì I
      // 39e: bipush 6
      // 3a0: anewarray 141
      // 3a3: dup_x1
      // 3a4: swap
      // 3a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3a8: bipush 5
      // 3a9: swap
      // 3aa: aastore
      // 3ab: dup_x1
      // 3ac: swap
      // 3ad: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3b0: bipush 4
      // 3b1: swap
      // 3b2: aastore
      // 3b3: dup_x2
      // 3b4: dup_x2
      // 3b5: pop
      // 3b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b9: bipush 3
      // 3ba: swap
      // 3bb: aastore
      // 3bc: dup_x1
      // 3bd: swap
      // 3be: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3c1: bipush 2
      // 3c2: swap
      // 3c3: aastore
      // 3c4: dup_x1
      // 3c5: swap
      // 3c6: bipush 1
      // 3c7: swap
      // 3c8: aastore
      // 3c9: dup_x1
      // 3ca: swap
      // 3cb: bipush 0
      // 3cc: swap
      // 3cd: aastore
      // 3ce: invokevirtual rip/breeze/inject/õ.method_012 ([Ljava/lang/Object;)I
      // 3d1: iadd
      // 3d2: istore 24
      // 3d4: aload 0
      // 3d5: getfield rip/breeze/inject/MathUtil11.int_µ I
      // 3d8: iload 23
      // 3da: ifeq 491
      // 3dd: ifle 41c
      // 3e0: goto 3e7
      // 3e3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e6: athrow
      // 3e7: aload 0
      // 3e8: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 3eb: lload 21
      // 3ed: sipush 15035
      // 3f0: ldc2_w 6128850277740532355
      // 3f3: lload 2
      // 3f4: lxor
      // 3f5: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 3f8: bipush 2
      // 3f9: anewarray 141
      // 3fc: dup_x1
      // 3fd: swap
      // 3fe: bipush 1
      // 3ff: swap
      // 400: aastore
      // 401: dup_x2
      // 402: dup_x2
      // 403: pop
      // 404: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 407: bipush 0
      // 408: swap
      // 409: aastore
      // 40a: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 40d: pop
      // 40e: iload 24
      // 410: bipush 8
      // 412: bipush 2
      // 413: aload 0
      // 414: getfield rip/breeze/inject/MathUtil11.int_µ I
      // 417: imul
      // 418: iadd
      // 419: iadd
      // 41a: istore 24
      // 41c: iload 24
      // 41e: aload 0
      // 41f: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 422: aload 0
      // 423: getfield rip/breeze/inject/MathUtil11.int_ò I
      // 426: lload 4
      // 428: dup2_x1
      // 429: pop2
      // 42a: aload 0
      // 42b: getfield rip/breeze/inject/MathUtil11.fieldInt_z I
      // 42e: bipush 4
      // 42f: anewarray 141
      // 432: dup_x1
      // 433: swap
      // 434: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 437: bipush 3
      // 438: swap
      // 439: aastore
      // 43a: dup_x1
      // 43b: swap
      // 43c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 43f: bipush 2
      // 440: swap
      // 441: aastore
      // 442: dup_x2
      // 443: dup_x2
      // 444: pop
      // 445: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 448: bipush 1
      // 449: swap
      // 44a: aastore
      // 44b: dup_x1
      // 44c: swap
      // 44d: bipush 0
      // 44e: swap
      // 44f: aastore
      // 450: invokestatic rip/breeze/inject/õ.method_013 ([Ljava/lang/Object;)I
      // 453: iadd
      // 454: istore 24
      // 456: iload 24
      // 458: aload 0
      // 459: getfield rip/breeze/inject/MathUtil11.û_y Lrip/breeze/inject/û;
      // 45c: lload 12
      // 45e: dup2_x1
      // 45f: pop2
      // 460: aload 0
      // 461: getfield rip/breeze/inject/MathUtil11.û_x Lrip/breeze/inject/û;
      // 464: aload 0
      // 465: getfield rip/breeze/inject/MathUtil11.û_s Lrip/breeze/inject/û;
      // 468: aload 0
      // 469: getfield rip/breeze/inject/MathUtil11.û_r Lrip/breeze/inject/û;
      // 46c: bipush 5
      // 46d: anewarray 141
      // 470: dup_x1
      // 471: swap
      // 472: bipush 4
      // 473: swap
      // 474: aastore
      // 475: dup_x1
      // 476: swap
      // 477: bipush 3
      // 478: swap
      // 479: aastore
      // 47a: dup_x1
      // 47b: swap
      // 47c: bipush 2
      // 47d: swap
      // 47e: aastore
      // 47f: dup_x1
      // 480: swap
      // 481: bipush 1
      // 482: swap
      // 483: aastore
      // 484: dup_x2
      // 485: dup_x2
      // 486: pop
      // 487: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 48a: bipush 0
      // 48b: swap
      // 48c: aastore
      // 48d: invokestatic rip/breeze/inject/û.method_004 ([Ljava/lang/Object;)I
      // 490: iadd
      // 491: istore 24
      // 493: aload 0
      // 494: getfield rip/breeze/inject/MathUtil11.arr_v [Lrip/breeze/inject/û;
      // 497: lload 2
      // 498: lconst_0
      // 499: lcmp
      // 49a: ifle 530
      // 49d: iload 23
      // 49f: ifeq 530
      // 4a2: ifnull 51a
      // 4a5: goto 4ac
      // 4a8: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4ab: athrow
      // 4ac: iload 24
      // 4ae: sipush 8631
      // 4b1: ldc2_w 8015520451150432649
      // 4b4: lload 2
      // 4b5: lxor
      // 4b6: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 4b9: aload 0
      // 4ba: getfield rip/breeze/inject/MathUtil11.arr_v [Lrip/breeze/inject/û;
      // 4bd: aload 0
      // 4be: iload 23
      // 4c0: ifeq 4e4
      // 4c3: goto 4ca
      // 4c6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4c9: athrow
      // 4ca: getfield rip/breeze/inject/MathUtil11.fieldInt_w I
      // 4cd: ifne 4e3
      // 4d0: goto 4d7
      // 4d3: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d6: athrow
      // 4d7: aload 0
      // 4d8: getfield rip/breeze/inject/MathUtil11.arr_v [Lrip/breeze/inject/û;
      // 4db: arraylength
      // 4dc: goto 4e7
      // 4df: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4e2: athrow
      // 4e3: aload 0
      // 4e4: getfield rip/breeze/inject/MathUtil11.fieldInt_w I
      // 4e7: istore 26
      // 4e9: astore 27
      // 4eb: astore 28
      // 4ed: lload 19
      // 4ef: aload 28
      // 4f1: aload 27
      // 4f3: iload 26
      // 4f5: bipush 4
      // 4f6: anewarray 141
      // 4f9: dup_x1
      // 4fa: swap
      // 4fb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4fe: bipush 3
      // 4ff: swap
      // 500: aastore
      // 501: dup_x1
      // 502: swap
      // 503: bipush 2
      // 504: swap
      // 505: aastore
      // 506: dup_x1
      // 507: swap
      // 508: bipush 1
      // 509: swap
      // 50a: aastore
      // 50b: dup_x2
      // 50c: dup_x2
      // 50d: pop
      // 50e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 511: bipush 0
      // 512: swap
      // 513: aastore
      // 514: invokestatic rip/breeze/inject/û.method_007 ([Ljava/lang/Object;)I
      // 517: iadd
      // 518: istore 24
      // 51a: aload 0
      // 51b: lload 2
      // 51c: lconst_0
      // 51d: lcmp
      // 51e: iflt 5a2
      // 521: iload 23
      // 523: ifeq 5a2
      // 526: getfield rip/breeze/inject/MathUtil11.arr_t [Lrip/breeze/inject/û;
      // 529: goto 530
      // 52c: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52f: athrow
      // 530: ifnull 5a1
      // 533: iload 24
      // 535: sipush 13080
      // 538: ldc2_w 644159193855843135
      // 53b: lload 2
      // 53c: lxor
      // 53d: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 540: aload 0
      // 541: getfield rip/breeze/inject/MathUtil11.arr_t [Lrip/breeze/inject/û;
      // 544: aload 0
      // 545: iload 23
      // 547: ifeq 56b
      // 54a: goto 551
      // 54d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 550: athrow
      // 551: getfield rip/breeze/inject/MathUtil11.fieldInt_u I
      // 554: ifne 56a
      // 557: goto 55e
      // 55a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 55d: athrow
      // 55e: aload 0
      // 55f: getfield rip/breeze/inject/MathUtil11.arr_t [Lrip/breeze/inject/û;
      // 562: arraylength
      // 563: goto 56e
      // 566: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 569: athrow
      // 56a: aload 0
      // 56b: getfield rip/breeze/inject/MathUtil11.fieldInt_u I
      // 56e: istore 26
      // 570: astore 27
      // 572: astore 28
      // 574: lload 19
      // 576: aload 28
      // 578: aload 27
      // 57a: iload 26
      // 57c: bipush 4
      // 57d: anewarray 141
      // 580: dup_x1
      // 581: swap
      // 582: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 585: bipush 3
      // 586: swap
      // 587: aastore
      // 588: dup_x1
      // 589: swap
      // 58a: bipush 2
      // 58b: swap
      // 58c: aastore
      // 58d: dup_x1
      // 58e: swap
      // 58f: bipush 1
      // 590: swap
      // 591: aastore
      // 592: dup_x2
      // 593: dup_x2
      // 594: pop
      // 595: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 598: bipush 0
      // 599: swap
      // 59a: aastore
      // 59b: invokestatic rip/breeze/inject/û.method_007 ([Ljava/lang/Object;)I
      // 59e: iadd
      // 59f: istore 24
      // 5a1: aload 0
      // 5a2: getfield rip/breeze/inject/MathUtil11.ð_q Lrip/breeze/inject/ð;
      // 5a5: iload 23
      // 5a7: ifeq 5fa
      // 5aa: ifnull 5ea
      // 5ad: goto 5b4
      // 5b0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5b3: athrow
      // 5b4: aload 0
      // 5b5: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 5b8: lload 21
      // 5ba: sipush 19001
      // 5bd: ldc2_w 8174399702414008837
      // 5c0: lload 2
      // 5c1: lxor
      // 5c2: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 5c5: bipush 2
      // 5c6: anewarray 141
      // 5c9: dup_x1
      // 5ca: swap
      // 5cb: bipush 1
      // 5cc: swap
      // 5cd: aastore
      // 5ce: dup_x2
      // 5cf: dup_x2
      // 5d0: pop
      // 5d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5d4: bipush 0
      // 5d5: swap
      // 5d6: aastore
      // 5d7: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 5da: pop
      // 5db: iload 24
      // 5dd: bipush 6
      // 5df: aload 0
      // 5e0: getfield rip/breeze/inject/MathUtil11.ð_q Lrip/breeze/inject/ð;
      // 5e3: getfield rip/breeze/inject/ð.int_þ_2 I
      // 5e6: iadd
      // 5e7: iadd
      // 5e8: istore 24
      // 5ea: aload 0
      // 5eb: iload 23
      // 5ed: ifeq 634
      // 5f0: getfield rip/breeze/inject/MathUtil11.ð_o Lrip/breeze/inject/ð;
      // 5f3: goto 5fa
      // 5f6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5f9: athrow
      // 5fa: ifnull 633
      // 5fd: aload 0
      // 5fe: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 601: lload 21
      // 603: sipush 8940
      // 606: ldc2_w 1305093840904276691
      // 609: lload 2
      // 60a: lxor
      // 60b: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 60e: bipush 2
      // 60f: anewarray 141
      // 612: dup_x1
      // 613: swap
      // 614: bipush 1
      // 615: swap
      // 616: aastore
      // 617: dup_x2
      // 618: dup_x2
      // 619: pop
      // 61a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 61d: bipush 0
      // 61e: swap
      // 61f: aastore
      // 620: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 623: pop
      // 624: iload 24
      // 626: bipush 7
      // 628: aload 0
      // 629: getfield rip/breeze/inject/MathUtil11.ð_o Lrip/breeze/inject/ð;
      // 62c: getfield rip/breeze/inject/ð.int_þ_2 I
      // 62f: iadd
      // 630: iadd
      // 631: istore 24
      // 633: aload 0
      // 634: getfield rip/breeze/inject/MathUtil11.õ_n Lrip/breeze/inject/õ;
      // 637: ifnull 65e
      // 63a: iload 24
      // 63c: aload 0
      // 63d: getfield rip/breeze/inject/MathUtil11.õ_n Lrip/breeze/inject/õ;
      // 640: aload 0
      // 641: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 644: lload 10
      // 646: bipush 2
      // 647: anewarray 141
      // 64a: dup_x2
      // 64b: dup_x2
      // 64c: pop
      // 64d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 650: bipush 1
      // 651: swap
      // 652: aastore
      // 653: dup_x1
      // 654: swap
      // 655: bipush 0
      // 656: swap
      // 657: aastore
      // 658: invokevirtual rip/breeze/inject/õ.method_011 ([Ljava/lang/Object;)I
      // 65b: iadd
      // 65c: istore 24
      // 65e: iload 24
      // 660: ireturn
      // try (71 -> 76): 77 java/lang/IllegalArgumentException
      // try (75 -> 84): 84 java/lang/IllegalArgumentException
      // try (88 -> 98): 99 java/lang/IllegalArgumentException
      // try (97 -> 111): 112 java/lang/IllegalArgumentException
      // try (101 -> 119): 120 java/lang/IllegalArgumentException
      // try (114 -> 145): 145 java/lang/IllegalArgumentException
      // try (198 -> 207): 208 java/lang/IllegalArgumentException
      // try (206 -> 217): 218 java/lang/IllegalArgumentException
      // try (210 -> 222): 223 java/lang/IllegalArgumentException
      // try (220 -> 226): 227 java/lang/IllegalArgumentException
      // try (232 -> 246): 246 java/lang/IllegalArgumentException
      // try (282 -> 289): 290 java/lang/IllegalArgumentException
      // try (326 -> 329): 330 java/lang/IllegalArgumentException
      // try (364 -> 372): 373 java/lang/IllegalArgumentException
      // try (409 -> 413): 414 java/lang/IllegalArgumentException
      // try (442 -> 450): 451 java/lang/IllegalArgumentException
      // try (481 -> 485): 486 java/lang/IllegalArgumentException
      // try (548 -> 551): 552 java/lang/IllegalArgumentException
      // try (670 -> 679): 680 java/lang/IllegalArgumentException
      // try (678 -> 693): 694 java/lang/IllegalArgumentException
      // try (682 -> 698): 699 java/lang/IllegalArgumentException
      // try (696 -> 705): 705 java/lang/IllegalArgumentException
      // try (744 -> 752): 753 java/lang/IllegalArgumentException
      // try (755 -> 767): 768 java/lang/IllegalArgumentException
      // try (756 -> 772): 773 java/lang/IllegalArgumentException
      // try (770 -> 779): 779 java/lang/IllegalArgumentException
      // try (819 -> 823): 824 java/lang/IllegalArgumentException
      // try (858 -> 862): 863 java/lang/IllegalArgumentException
   }

   void calculate_24(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 0000: aload 1
      // 0001: dup
      // 0002: bipush 0
      // 0003: aaload
      // 0004: checkcast rip/breeze/inject/ð
      // 0007: astore 2
      // 0008: dup
      // 0009: bipush 1
      // 000a: aaload
      // 000b: checkcast java/lang/Long
      // 000e: invokevirtual java/lang/Long.longValue ()J
      // 0011: lstore 3
      // 0012: pop
      // 0013: getstatic rip/breeze/inject/MathUtil11.encKey_B J
      // 0016: lload 3
      // 0017: lxor
      // 0018: lstore 3
      // 0019: lload 3
      // 001a: dup2
      // 001b: ldc2_w 87100505624646
      // 001e: lxor
      // 001f: lstore 5
      // 0021: dup2
      // 0022: ldc2_w 21698238953241
      // 0025: lxor
      // 0026: lstore 7
      // 0028: dup2
      // 0029: ldc2_w 109939330413636
      // 002c: lxor
      // 002d: lstore 9
      // 002f: dup2
      // 0030: ldc2_w 108041308915767
      // 0033: lxor
      // 0034: lstore 11
      // 0036: dup2
      // 0037: ldc2_w 4118570026183
      // 003a: lxor
      // 003b: lstore 13
      // 003d: dup2
      // 003e: ldc2_w 133132863933833
      // 0041: lxor
      // 0042: lstore 15
      // 0044: dup2
      // 0045: ldc2_w 123199460476217
      // 0048: lxor
      // 0049: lstore 17
      // 004b: dup2
      // 004c: ldc2_w 17928629634629
      // 004f: lxor
      // 0050: lstore 19
      // 0052: dup2
      // 0053: ldc2_w 119884361971109
      // 0056: lxor
      // 0057: lstore 21
      // 0059: dup2
      // 005a: ldc2_w 24218170160313
      // 005d: lxor
      // 005e: lstore 23
      // 0060: dup2
      // 0061: ldc2_w 132164145951500
      // 0064: lxor
      // 0065: dup2
      // 0066: bipush 32
      // 0068: lushr
      // 0069: l2i
      // 006a: istore 25
      // 006c: dup2
      // 006d: bipush 32
      // 006f: lshl
      // 0070: bipush 48
      // 0072: lushr
      // 0073: l2i
      // 0074: istore 26
      // 0076: dup2
      // 0077: bipush 48
      // 0079: lshl
      // 007a: bipush 48
      // 007c: lushr
      // 007d: l2i
      // 007e: istore 27
      // 0080: pop2
      // 0081: dup2
      // 0082: ldc2_w 108599110186545
      // 0085: lxor
      // 0086: lstore 28
      // 0088: dup2
      // 0089: ldc2_w 119458081681147
      // 008c: lxor
      // 008d: lstore 30
      // 008f: dup2
      // 0090: ldc2_w 40626480787922
      // 0093: lxor
      // 0094: lstore 32
      // 0096: dup2
      // 0097: ldc2_w 4602205111236
      // 009a: lxor
      // 009b: lstore 34
      // 009d: dup2
      // 009e: ldc2_w 104194230298150
      // 00a1: lxor
      // 00a2: lstore 36
      // 00a4: pop2
      // 00a5: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 00a8: istore 38
      // 00aa: aload 0
      // 00ab: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 00ae: bipush 0
      // 00af: anewarray 141
      // 00b2: invokevirtual rip/breeze/inject/Util139.getValue ([Ljava/lang/Object;)I
      // 00b5: iload 38
      // 00b7: ifne 00ce
      // 00ba: bipush 49
      // 00bc: if_icmpge 00d1
      // 00bf: goto 00c6
      // 00c2: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 00c5: athrow
      // 00c6: bipush 1
      // 00c7: goto 00ce
      // 00ca: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 00cd: athrow
      // 00ce: goto 00d2
      // 00d1: bipush 0
      // 00d2: istore 39
      // 00d4: iload 39
      // 00d6: iload 38
      // 00d8: ifne 00e8
      // 00db: ifeq 00eb
      // 00de: goto 00e5
      // 00e1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 00e4: athrow
      // 00e5: sipush 4096
      // 00e8: goto 00ec
      // 00eb: bipush 0
      // 00ec: istore 40
      // 00ee: aload 2
      // 00ef: aload 0
      // 00f0: getfield rip/breeze/inject/MathUtil11.int_ò I
      // 00f3: iload 40
      // 00f5: bipush -1
      // 00f6: ixor
      // 00f7: iand
      // 00f8: lload 7
      // 00fa: bipush 2
      // 00fb: anewarray 141
      // 00fe: dup_x2
      // 00ff: dup_x2
      // 0100: pop
      // 0101: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0104: bipush 1
      // 0105: swap
      // 0106: aastore
      // 0107: dup_x1
      // 0108: swap
      // 0109: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 010c: bipush 0
      // 010d: swap
      // 010e: aastore
      // 010f: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0112: aload 0
      // 0113: getfield rip/breeze/inject/MathUtil11.int_ñ I
      // 0116: lload 7
      // 0118: bipush 2
      // 0119: anewarray 141
      // 011c: dup_x2
      // 011d: dup_x2
      // 011e: pop
      // 011f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0122: bipush 1
      // 0123: swap
      // 0124: aastore
      // 0125: dup_x1
      // 0126: swap
      // 0127: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 012a: bipush 0
      // 012b: swap
      // 012c: aastore
      // 012d: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0130: aload 0
      // 0131: getfield rip/breeze/inject/MathUtil11.int_ï I
      // 0134: lload 7
      // 0136: bipush 2
      // 0137: anewarray 141
      // 013a: dup_x2
      // 013b: dup_x2
      // 013c: pop
      // 013d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0140: bipush 1
      // 0141: swap
      // 0142: aastore
      // 0143: dup_x1
      // 0144: swap
      // 0145: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0148: bipush 0
      // 0149: swap
      // 014a: aastore
      // 014b: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 014e: pop
      // 014f: aload 0
      // 0150: getfield rip/breeze/inject/MathUtil11.int_և I
      // 0153: iload 38
      // 0155: ifne 01a7
      // 0158: ifeq 01a6
      // 015b: goto 0162
      // 015e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0161: athrow
      // 0162: aload 2
      // 0163: aload 0
      // 0164: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0167: bipush 0
      // 0168: anewarray 141
      // 016b: invokevirtual rip/breeze/inject/Util139.getÏ ([Ljava/lang/Object;)Lrip/breeze/inject/ï;
      // 016e: getfield rip/breeze/inject/ï.arr_õ_2 [B
      // 0171: aload 0
      // 0172: getfield rip/breeze/inject/MathUtil11.int_և I
      // 0175: aload 0
      // 0176: getfield rip/breeze/inject/MathUtil11.int_ֆ I
      // 0179: lload 23
      // 017b: bipush 4
      // 017c: anewarray 141
      // 017f: dup_x2
      // 0180: dup_x2
      // 0181: pop
      // 0182: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0185: bipush 3
      // 0186: swap
      // 0187: aastore
      // 0188: dup_x1
      // 0189: swap
      // 018a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 018d: bipush 2
      // 018e: swap
      // 018f: aastore
      // 0190: dup_x1
      // 0191: swap
      // 0192: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0195: bipush 1
      // 0196: swap
      // 0197: aastore
      // 0198: dup_x1
      // 0199: swap
      // 019a: bipush 0
      // 019b: swap
      // 019c: aastore
      // 019d: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 01a0: pop
      // 01a1: return
      // 01a2: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01a5: athrow
      // 01a6: bipush 0
      // 01a7: istore 41
      // 01a9: aload 0
      // 01aa: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 01ad: getfield rip/breeze/inject/ð.int_þ_2 I
      // 01b0: iload 38
      // 01b2: lload 3
      // 01b3: lconst_0
      // 01b4: lcmp
      // 01b5: ifle 01ce
      // 01b8: ifne 01cc
      // 01bb: ifle 01c8
      // 01be: goto 01c5
      // 01c1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01c4: athrow
      // 01c5: iinc 41 1
      // 01c8: aload 0
      // 01c9: getfield rip/breeze/inject/MathUtil11.int_µ I
      // 01cc: iload 38
      // 01ce: lload 3
      // 01cf: lconst_0
      // 01d0: lcmp
      // 01d1: iflt 01ee
      // 01d4: ifne 01ec
      // 01d7: ifle 01e4
      // 01da: goto 01e1
      // 01dd: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01e0: athrow
      // 01e1: iinc 41 1
      // 01e4: aload 0
      // 01e5: getfield rip/breeze/inject/MathUtil11.int_ò I
      // 01e8: sipush 4096
      // 01eb: iand
      // 01ec: iload 38
      // 01ee: ifne 0220
      // 01f1: ifeq 021c
      // 01f4: goto 01fb
      // 01f7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01fa: athrow
      // 01fb: iload 39
      // 01fd: iload 38
      // 01ff: lload 3
      // 0200: lconst_0
      // 0201: lcmp
      // 0202: iflt 0222
      // 0205: ifne 0220
      // 0208: goto 020f
      // 020b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 020e: athrow
      // 020f: ifeq 021c
      // 0212: goto 0219
      // 0215: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0218: athrow
      // 0219: iinc 41 1
      // 021c: aload 0
      // 021d: getfield rip/breeze/inject/MathUtil11.fieldInt_z I
      // 0220: iload 38
      // 0222: ifne 024c
      // 0225: ifeq 0232
      // 0228: goto 022f
      // 022b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 022e: athrow
      // 022f: iinc 41 1
      // 0232: aload 0
      // 0233: lload 3
      // 0234: lconst_0
      // 0235: lcmp
      // 0236: ifle 0253
      // 0239: iload 38
      // 023b: ifne 0253
      // 023e: getfield rip/breeze/inject/MathUtil11.int_ò I
      // 0241: ldc_w 131072
      // 0244: iand
      // 0245: goto 024c
      // 0248: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 024b: athrow
      // 024c: ifeq 0252
      // 024f: iinc 41 1
      // 0252: aload 0
      // 0253: getfield rip/breeze/inject/MathUtil11.û_y Lrip/breeze/inject/û;
      // 0256: iload 38
      // 0258: ifne 027e
      // 025b: ifnull 0268
      // 025e: goto 0265
      // 0261: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0264: athrow
      // 0265: iinc 41 1
      // 0268: aload 0
      // 0269: lload 3
      // 026a: lconst_0
      // 026b: lcmp
      // 026c: ifle 0285
      // 026f: iload 38
      // 0271: ifne 0285
      // 0274: getfield rip/breeze/inject/MathUtil11.û_x Lrip/breeze/inject/û;
      // 0277: goto 027e
      // 027a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 027d: athrow
      // 027e: ifnull 0284
      // 0281: iinc 41 1
      // 0284: aload 0
      // 0285: getfield rip/breeze/inject/MathUtil11.arr_v [Lrip/breeze/inject/û;
      // 0288: iload 38
      // 028a: ifne 02b0
      // 028d: ifnull 029a
      // 0290: goto 0297
      // 0293: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0296: athrow
      // 0297: iinc 41 1
      // 029a: aload 0
      // 029b: lload 3
      // 029c: lconst_0
      // 029d: lcmp
      // 029e: iflt 02b7
      // 02a1: iload 38
      // 02a3: ifne 02b7
      // 02a6: getfield rip/breeze/inject/MathUtil11.arr_t [Lrip/breeze/inject/û;
      // 02a9: goto 02b0
      // 02ac: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 02af: athrow
      // 02b0: ifnull 02b6
      // 02b3: iinc 41 1
      // 02b6: aload 0
      // 02b7: getfield rip/breeze/inject/MathUtil11.û_s Lrip/breeze/inject/û;
      // 02ba: iload 38
      // 02bc: ifne 02e2
      // 02bf: ifnull 02cc
      // 02c2: goto 02c9
      // 02c5: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 02c8: athrow
      // 02c9: iinc 41 1
      // 02cc: aload 0
      // 02cd: lload 3
      // 02ce: lconst_0
      // 02cf: lcmp
      // 02d0: iflt 02e9
      // 02d3: iload 38
      // 02d5: ifne 02e9
      // 02d8: getfield rip/breeze/inject/MathUtil11.û_r Lrip/breeze/inject/û;
      // 02db: goto 02e2
      // 02de: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 02e1: athrow
      // 02e2: ifnull 02e8
      // 02e5: iinc 41 1
      // 02e8: aload 0
      // 02e9: getfield rip/breeze/inject/MathUtil11.ð_q Lrip/breeze/inject/ð;
      // 02ec: iload 38
      // 02ee: ifne 0314
      // 02f1: ifnull 02fe
      // 02f4: goto 02fb
      // 02f7: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 02fa: athrow
      // 02fb: iinc 41 1
      // 02fe: aload 0
      // 02ff: iload 38
      // 0301: lload 3
      // 0302: lconst_0
      // 0303: lcmp
      // 0304: ifle 0323
      // 0307: ifne 031b
      // 030a: getfield rip/breeze/inject/MathUtil11.ð_o Lrip/breeze/inject/ð;
      // 030d: goto 0314
      // 0310: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0313: athrow
      // 0314: ifnull 031a
      // 0317: iinc 41 1
      // 031a: aload 0
      // 031b: lload 3
      // 031c: lconst_0
      // 031d: lcmp
      // 031e: iflt 036d
      // 0321: iload 38
      // 0323: ifne 036d
      // 0326: getfield rip/breeze/inject/MathUtil11.õ_n Lrip/breeze/inject/õ;
      // 0329: ifnull 034e
      // 032c: goto 0333
      // 032f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0332: athrow
      // 0333: iload 41
      // 0335: aload 0
      // 0336: getfield rip/breeze/inject/MathUtil11.õ_n Lrip/breeze/inject/õ;
      // 0339: lload 13
      // 033b: bipush 1
      // 033c: anewarray 141
      // 033f: dup_x2
      // 0340: dup_x2
      // 0341: pop
      // 0342: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0345: bipush 0
      // 0346: swap
      // 0347: aastore
      // 0348: invokevirtual rip/breeze/inject/õ.method_010 ([Ljava/lang/Object;)I
      // 034b: iadd
      // 034c: istore 41
      // 034e: aload 2
      // 034f: iload 41
      // 0351: lload 7
      // 0353: bipush 2
      // 0354: anewarray 141
      // 0357: dup_x2
      // 0358: dup_x2
      // 0359: pop
      // 035a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 035d: bipush 1
      // 035e: swap
      // 035f: aastore
      // 0360: dup_x1
      // 0361: swap
      // 0362: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0365: bipush 0
      // 0366: swap
      // 0367: aastore
      // 0368: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 036b: pop
      // 036c: aload 0
      // 036d: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0370: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0373: iload 38
      // 0375: ifne 0be0
      // 0378: ifle 0bca
      // 037b: goto 0382
      // 037e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0381: athrow
      // 0382: bipush 10
      // 0384: aload 0
      // 0385: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0388: getfield rip/breeze/inject/ð.int_þ_2 I
      // 038b: iadd
      // 038c: aload 0
      // 038d: getfield rip/breeze/inject/MathUtil11.µ_ê Lrip/breeze/inject/µ;
      // 0390: lload 30
      // 0392: bipush 2
      // 0393: anewarray 141
      // 0396: dup_x2
      // 0397: dup_x2
      // 0398: pop
      // 0399: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 039c: bipush 1
      // 039d: swap
      // 039e: aastore
      // 039f: dup_x1
      // 03a0: swap
      // 03a1: bipush 0
      // 03a2: swap
      // 03a3: aastore
      // 03a4: invokestatic rip/breeze/inject/µ.method_003 ([Ljava/lang/Object;)I
      // 03a7: iadd
      // 03a8: istore 42
      // 03aa: bipush 0
      // 03ab: istore 43
      // 03ad: aload 0
      // 03ae: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 03b1: iload 38
      // 03b3: lload 3
      // 03b4: lconst_0
      // 03b5: lcmp
      // 03b6: ifle 03de
      // 03b9: ifne 03dc
      // 03bc: ifnull 03d8
      // 03bf: goto 03c6
      // 03c2: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03c5: athrow
      // 03c6: iload 42
      // 03c8: bipush 8
      // 03ca: aload 0
      // 03cb: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 03ce: getfield rip/breeze/inject/ð.int_þ_2 I
      // 03d1: iadd
      // 03d2: iadd
      // 03d3: istore 42
      // 03d5: iinc 43 1
      // 03d8: aload 0
      // 03d9: getfield rip/breeze/inject/MathUtil11.ð_ç Lrip/breeze/inject/ð;
      // 03dc: iload 38
      // 03de: lload 3
      // 03df: lconst_0
      // 03e0: lcmp
      // 03e1: iflt 0409
      // 03e4: ifne 0407
      // 03e7: ifnull 0403
      // 03ea: goto 03f1
      // 03ed: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03f0: athrow
      // 03f1: iload 42
      // 03f3: bipush 8
      // 03f5: aload 0
      // 03f6: getfield rip/breeze/inject/MathUtil11.ð_ç Lrip/breeze/inject/ð;
      // 03f9: getfield rip/breeze/inject/ð.int_þ_2 I
      // 03fc: iadd
      // 03fd: iadd
      // 03fe: istore 42
      // 0400: iinc 43 1
      // 0403: aload 0
      // 0404: getfield rip/breeze/inject/MathUtil11.ð_å Lrip/breeze/inject/ð;
      // 0407: iload 38
      // 0409: ifne 043e
      // 040c: ifnull 0428
      // 040f: goto 0416
      // 0412: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0415: athrow
      // 0416: iload 42
      // 0418: bipush 8
      // 041a: aload 0
      // 041b: getfield rip/breeze/inject/MathUtil11.ð_å Lrip/breeze/inject/ð;
      // 041e: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0421: iadd
      // 0422: iadd
      // 0423: istore 42
      // 0425: iinc 43 1
      // 0428: aload 0
      // 0429: lload 3
      // 042a: lconst_0
      // 042b: lcmp
      // 042c: iflt 0454
      // 042f: iload 38
      // 0431: ifne 0454
      // 0434: getfield rip/breeze/inject/MathUtil11.ð_ã Lrip/breeze/inject/ð;
      // 0437: goto 043e
      // 043a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 043d: athrow
      // 043e: ifnull 0453
      // 0441: iload 42
      // 0443: bipush 8
      // 0445: aload 0
      // 0446: getfield rip/breeze/inject/MathUtil11.ð_ã Lrip/breeze/inject/ð;
      // 0449: getfield rip/breeze/inject/ð.int_þ_2 I
      // 044c: iadd
      // 044d: iadd
      // 044e: istore 42
      // 0450: iinc 43 1
      // 0453: aload 0
      // 0454: getfield rip/breeze/inject/MathUtil11.û_à Lrip/breeze/inject/û;
      // 0457: iload 38
      // 0459: ifne 04aa
      // 045c: ifnull 0494
      // 045f: goto 0466
      // 0462: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0465: athrow
      // 0466: iload 42
      // 0468: aload 0
      // 0469: getfield rip/breeze/inject/MathUtil11.û_à Lrip/breeze/inject/û;
      // 046c: sipush 29806
      // 046f: ldc2_w 9117618829113097875
      // 0472: lload 3
      // 0473: lxor
      // 0474: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 0477: lload 32
      // 0479: bipush 2
      // 047a: anewarray 141
      // 047d: dup_x2
      // 047e: dup_x2
      // 047f: pop
      // 0480: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0483: bipush 1
      // 0484: swap
      // 0485: aastore
      // 0486: dup_x1
      // 0487: swap
      // 0488: bipush 0
      // 0489: swap
      // 048a: aastore
      // 048b: invokevirtual rip/breeze/inject/û.method_003 ([Ljava/lang/Object;)I
      // 048e: iadd
      // 048f: istore 42
      // 0491: iinc 43 1
      // 0494: aload 0
      // 0495: iload 38
      // 0497: lload 3
      // 0498: lconst_0
      // 0499: lcmp
      // 049a: iflt 04e4
      // 049d: ifne 04dc
      // 04a0: getfield rip/breeze/inject/MathUtil11.û_ß Lrip/breeze/inject/û;
      // 04a3: goto 04aa
      // 04a6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04a9: athrow
      // 04aa: ifnull 04db
      // 04ad: iload 42
      // 04af: aload 0
      // 04b0: getfield rip/breeze/inject/MathUtil11.û_ß Lrip/breeze/inject/û;
      // 04b3: sipush 20309
      // 04b6: ldc2_w 1701513974723233209
      // 04b9: lload 3
      // 04ba: lxor
      // 04bb: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 04be: lload 32
      // 04c0: bipush 2
      // 04c1: anewarray 141
      // 04c4: dup_x2
      // 04c5: dup_x2
      // 04c6: pop
      // 04c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04ca: bipush 1
      // 04cb: swap
      // 04cc: aastore
      // 04cd: dup_x1
      // 04ce: swap
      // 04cf: bipush 0
      // 04d0: swap
      // 04d1: aastore
      // 04d2: invokevirtual rip/breeze/inject/û.method_003 ([Ljava/lang/Object;)I
      // 04d5: iadd
      // 04d6: istore 42
      // 04d8: iinc 43 1
      // 04db: aload 0
      // 04dc: lload 3
      // 04dd: lconst_0
      // 04de: lcmp
      // 04df: iflt 069a
      // 04e2: iload 38
      // 04e4: ifne 069a
      // 04e7: getfield rip/breeze/inject/MathUtil11.õ_º Lrip/breeze/inject/õ;
      // 04ea: ifnull 0569
      // 04ed: goto 04f4
      // 04f0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04f3: athrow
      // 04f4: iload 42
      // 04f6: aload 0
      // 04f7: getfield rip/breeze/inject/MathUtil11.õ_º Lrip/breeze/inject/õ;
      // 04fa: aload 0
      // 04fb: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 04fe: aload 0
      // 04ff: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0502: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 0505: aload 0
      // 0506: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0509: getfield rip/breeze/inject/ð.int_þ_2 I
      // 050c: aload 0
      // 050d: getfield rip/breeze/inject/MathUtil11.int_í I
      // 0510: lload 5
      // 0512: dup2_x1
      // 0513: pop2
      // 0514: aload 0
      // 0515: getfield rip/breeze/inject/MathUtil11.int_ì I
      // 0518: bipush 6
      // 051a: anewarray 141
      // 051d: dup_x1
      // 051e: swap
      // 051f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0522: bipush 5
      // 0523: swap
      // 0524: aastore
      // 0525: dup_x1
      // 0526: swap
      // 0527: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 052a: bipush 4
      // 052b: swap
      // 052c: aastore
      // 052d: dup_x2
      // 052e: dup_x2
      // 052f: pop
      // 0530: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0533: bipush 3
      // 0534: swap
      // 0535: aastore
      // 0536: dup_x1
      // 0537: swap
      // 0538: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 053b: bipush 2
      // 053c: swap
      // 053d: aastore
      // 053e: dup_x1
      // 053f: swap
      // 0540: bipush 1
      // 0541: swap
      // 0542: aastore
      // 0543: dup_x1
      // 0544: swap
      // 0545: bipush 0
      // 0546: swap
      // 0547: aastore
      // 0548: invokevirtual rip/breeze/inject/õ.method_012 ([Ljava/lang/Object;)I
      // 054b: iadd
      // 054c: istore 42
      // 054e: iload 43
      // 0550: aload 0
      // 0551: getfield rip/breeze/inject/MathUtil11.õ_º Lrip/breeze/inject/õ;
      // 0554: lload 13
      // 0556: bipush 1
      // 0557: anewarray 141
      // 055a: dup_x2
      // 055b: dup_x2
      // 055c: pop
      // 055d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0560: bipush 0
      // 0561: swap
      // 0562: aastore
      // 0563: invokevirtual rip/breeze/inject/õ.method_010 ([Ljava/lang/Object;)I
      // 0566: iadd
      // 0567: istore 43
      // 0569: aload 2
      // 056a: aload 0
      // 056b: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 056e: lload 21
      // 0570: sipush 4556
      // 0573: ldc2_w 5287322110506474274
      // 0576: lload 3
      // 0577: lxor
      // 0578: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 057b: bipush 2
      // 057c: anewarray 141
      // 057f: dup_x1
      // 0580: swap
      // 0581: bipush 1
      // 0582: swap
      // 0583: aastore
      // 0584: dup_x2
      // 0585: dup_x2
      // 0586: pop
      // 0587: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 058a: bipush 0
      // 058b: swap
      // 058c: aastore
      // 058d: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 0590: lload 7
      // 0592: bipush 2
      // 0593: anewarray 141
      // 0596: dup_x2
      // 0597: dup_x2
      // 0598: pop
      // 0599: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 059c: bipush 1
      // 059d: swap
      // 059e: aastore
      // 059f: dup_x1
      // 05a0: swap
      // 05a1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05a4: bipush 0
      // 05a5: swap
      // 05a6: aastore
      // 05a7: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 05aa: iload 42
      // 05ac: lload 36
      // 05ae: bipush 2
      // 05af: anewarray 141
      // 05b2: dup_x2
      // 05b3: dup_x2
      // 05b4: pop
      // 05b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05b8: bipush 1
      // 05b9: swap
      // 05ba: aastore
      // 05bb: dup_x1
      // 05bc: swap
      // 05bd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05c0: bipush 0
      // 05c1: swap
      // 05c2: aastore
      // 05c3: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 05c6: aload 0
      // 05c7: getfield rip/breeze/inject/MathUtil11.int_í I
      // 05ca: lload 7
      // 05cc: bipush 2
      // 05cd: anewarray 141
      // 05d0: dup_x2
      // 05d1: dup_x2
      // 05d2: pop
      // 05d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05d6: bipush 1
      // 05d7: swap
      // 05d8: aastore
      // 05d9: dup_x1
      // 05da: swap
      // 05db: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05de: bipush 0
      // 05df: swap
      // 05e0: aastore
      // 05e1: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 05e4: aload 0
      // 05e5: getfield rip/breeze/inject/MathUtil11.int_ì I
      // 05e8: lload 7
      // 05ea: bipush 2
      // 05eb: anewarray 141
      // 05ee: dup_x2
      // 05ef: dup_x2
      // 05f0: pop
      // 05f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05f4: bipush 1
      // 05f5: swap
      // 05f6: aastore
      // 05f7: dup_x1
      // 05f8: swap
      // 05f9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05fc: bipush 0
      // 05fd: swap
      // 05fe: aastore
      // 05ff: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0602: aload 0
      // 0603: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0606: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0609: lload 36
      // 060b: bipush 2
      // 060c: anewarray 141
      // 060f: dup_x2
      // 0610: dup_x2
      // 0611: pop
      // 0612: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0615: bipush 1
      // 0616: swap
      // 0617: aastore
      // 0618: dup_x1
      // 0619: swap
      // 061a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 061d: bipush 0
      // 061e: swap
      // 061f: aastore
      // 0620: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0623: aload 0
      // 0624: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0627: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 062a: bipush 0
      // 062b: aload 0
      // 062c: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 062f: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0632: lload 23
      // 0634: bipush 4
      // 0635: anewarray 141
      // 0638: dup_x2
      // 0639: dup_x2
      // 063a: pop
      // 063b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 063e: bipush 3
      // 063f: swap
      // 0640: aastore
      // 0641: dup_x1
      // 0642: swap
      // 0643: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0646: bipush 2
      // 0647: swap
      // 0648: aastore
      // 0649: dup_x1
      // 064a: swap
      // 064b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 064e: bipush 1
      // 064f: swap
      // 0650: aastore
      // 0651: dup_x1
      // 0652: swap
      // 0653: bipush 0
      // 0654: swap
      // 0655: aastore
      // 0656: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0659: pop
      // 065a: aload 0
      // 065b: getfield rip/breeze/inject/MathUtil11.µ_ê Lrip/breeze/inject/µ;
      // 065e: aload 2
      // 065f: lload 17
      // 0661: bipush 3
      // 0662: anewarray 141
      // 0665: dup_x2
      // 0666: dup_x2
      // 0667: pop
      // 0668: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 066b: bipush 2
      // 066c: swap
      // 066d: aastore
      // 066e: dup_x1
      // 066f: swap
      // 0670: bipush 1
      // 0671: swap
      // 0672: aastore
      // 0673: dup_x1
      // 0674: swap
      // 0675: bipush 0
      // 0676: swap
      // 0677: aastore
      // 0678: invokestatic rip/breeze/inject/µ.method_004 ([Ljava/lang/Object;)V
      // 067b: aload 2
      // 067c: iload 43
      // 067e: lload 7
      // 0680: bipush 2
      // 0681: anewarray 141
      // 0684: dup_x2
      // 0685: dup_x2
      // 0686: pop
      // 0687: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 068a: bipush 1
      // 068b: swap
      // 068c: aastore
      // 068d: dup_x1
      // 068e: swap
      // 068f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0692: bipush 0
      // 0693: swap
      // 0694: aastore
      // 0695: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0698: pop
      // 0699: aload 0
      // 069a: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 069d: iload 38
      // 069f: lload 3
      // 06a0: lconst_0
      // 06a1: lcmp
      // 06a2: ifle 07c1
      // 06a5: ifne 07bf
      // 06a8: ifnull 07bb
      // 06ab: goto 06b2
      // 06ae: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06b1: athrow
      // 06b2: aload 0
      // 06b3: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 06b6: bipush 0
      // 06b7: anewarray 141
      // 06ba: invokevirtual rip/breeze/inject/Util139.getValue ([Ljava/lang/Object;)I
      // 06bd: iload 38
      // 06bf: ifne 06dd
      // 06c2: goto 06c9
      // 06c5: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06c8: athrow
      // 06c9: bipush 50
      // 06cb: if_icmplt 06e0
      // 06ce: goto 06d5
      // 06d1: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06d4: athrow
      // 06d5: bipush 1
      // 06d6: goto 06dd
      // 06d9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06dc: athrow
      // 06dd: goto 06e1
      // 06e0: bipush 0
      // 06e1: istore 44
      // 06e3: aload 2
      // 06e4: aload 0
      // 06e5: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 06e8: iload 44
      // 06ea: lload 3
      // 06eb: lconst_0
      // 06ec: lcmp
      // 06ed: ifle 0708
      // 06f0: ifeq 0705
      // 06f3: sipush 8049
      // 06f6: ldc2_w 4861950588083770753
      // 06f9: lload 3
      // 06fa: lxor
      // 06fb: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 06fe: goto 0710
      // 0701: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0704: athrow
      // 0705: sipush 19816
      // 0708: ldc2_w 5002716492689262464
      // 070b: lload 3
      // 070c: lxor
      // 070d: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 0710: lload 21
      // 0712: dup2_x1
      // 0713: pop2
      // 0714: bipush 2
      // 0715: anewarray 141
      // 0718: dup_x1
      // 0719: swap
      // 071a: bipush 1
      // 071b: swap
      // 071c: aastore
      // 071d: dup_x2
      // 071e: dup_x2
      // 071f: pop
      // 0720: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0723: bipush 0
      // 0724: swap
      // 0725: aastore
      // 0726: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 0729: lload 7
      // 072b: bipush 2
      // 072c: anewarray 141
      // 072f: dup_x2
      // 0730: dup_x2
      // 0731: pop
      // 0732: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0735: bipush 1
      // 0736: swap
      // 0737: aastore
      // 0738: dup_x1
      // 0739: swap
      // 073a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 073d: bipush 0
      // 073e: swap
      // 073f: aastore
      // 0740: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0743: bipush 2
      // 0744: aload 0
      // 0745: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 0748: getfield rip/breeze/inject/ð.int_þ_2 I
      // 074b: iadd
      // 074c: lload 36
      // 074e: bipush 2
      // 074f: anewarray 141
      // 0752: dup_x2
      // 0753: dup_x2
      // 0754: pop
      // 0755: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0758: bipush 1
      // 0759: swap
      // 075a: aastore
      // 075b: dup_x1
      // 075c: swap
      // 075d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0760: bipush 0
      // 0761: swap
      // 0762: aastore
      // 0763: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0766: aload 0
      // 0767: getfield rip/breeze/inject/MathUtil11.int_â I
      // 076a: lload 7
      // 076c: bipush 2
      // 076d: anewarray 141
      // 0770: dup_x2
      // 0771: dup_x2
      // 0772: pop
      // 0773: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0776: bipush 1
      // 0777: swap
      // 0778: aastore
      // 0779: dup_x1
      // 077a: swap
      // 077b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 077e: bipush 0
      // 077f: swap
      // 0780: aastore
      // 0781: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0784: aload 0
      // 0785: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 0788: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 078b: bipush 0
      // 078c: aload 0
      // 078d: getfield rip/breeze/inject/MathUtil11.ð_á Lrip/breeze/inject/ð;
      // 0790: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0793: lload 23
      // 0795: bipush 4
      // 0796: anewarray 141
      // 0799: dup_x2
      // 079a: dup_x2
      // 079b: pop
      // 079c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 079f: bipush 3
      // 07a0: swap
      // 07a1: aastore
      // 07a2: dup_x1
      // 07a3: swap
      // 07a4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07a7: bipush 2
      // 07a8: swap
      // 07a9: aastore
      // 07aa: dup_x1
      // 07ab: swap
      // 07ac: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07af: bipush 1
      // 07b0: swap
      // 07b1: aastore
      // 07b2: dup_x1
      // 07b3: swap
      // 07b4: bipush 0
      // 07b5: swap
      // 07b6: aastore
      // 07b7: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 07ba: pop
      // 07bb: aload 0
      // 07bc: getfield rip/breeze/inject/MathUtil11.ð_ç Lrip/breeze/inject/ð;
      // 07bf: iload 38
      // 07c1: lload 3
      // 07c2: lconst_0
      // 07c3: lcmp
      // 07c4: iflt 08a0
      // 07c7: ifne 0898
      // 07ca: ifnull 0894
      // 07cd: goto 07d4
      // 07d0: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07d3: athrow
      // 07d4: aload 2
      // 07d5: aload 0
      // 07d6: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 07d9: lload 21
      // 07db: sipush 20436
      // 07de: ldc2_w 402060956855813430
      // 07e1: lload 3
      // 07e2: lxor
      // 07e3: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 07e6: bipush 2
      // 07e7: anewarray 141
      // 07ea: dup_x1
      // 07eb: swap
      // 07ec: bipush 1
      // 07ed: swap
      // 07ee: aastore
      // 07ef: dup_x2
      // 07f0: dup_x2
      // 07f1: pop
      // 07f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f5: bipush 0
      // 07f6: swap
      // 07f7: aastore
      // 07f8: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 07fb: lload 7
      // 07fd: bipush 2
      // 07fe: anewarray 141
      // 0801: dup_x2
      // 0802: dup_x2
      // 0803: pop
      // 0804: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0807: bipush 1
      // 0808: swap
      // 0809: aastore
      // 080a: dup_x1
      // 080b: swap
      // 080c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 080f: bipush 0
      // 0810: swap
      // 0811: aastore
      // 0812: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0815: bipush 2
      // 0816: aload 0
      // 0817: getfield rip/breeze/inject/MathUtil11.ð_ç Lrip/breeze/inject/ð;
      // 081a: getfield rip/breeze/inject/ð.int_þ_2 I
      // 081d: iadd
      // 081e: lload 36
      // 0820: bipush 2
      // 0821: anewarray 141
      // 0824: dup_x2
      // 0825: dup_x2
      // 0826: pop
      // 0827: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 082a: bipush 1
      // 082b: swap
      // 082c: aastore
      // 082d: dup_x1
      // 082e: swap
      // 082f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0832: bipush 0
      // 0833: swap
      // 0834: aastore
      // 0835: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0838: aload 0
      // 0839: getfield rip/breeze/inject/MathUtil11.int_è I
      // 083c: lload 7
      // 083e: bipush 2
      // 083f: anewarray 141
      // 0842: dup_x2
      // 0843: dup_x2
      // 0844: pop
      // 0845: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0848: bipush 1
      // 0849: swap
      // 084a: aastore
      // 084b: dup_x1
      // 084c: swap
      // 084d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0850: bipush 0
      // 0851: swap
      // 0852: aastore
      // 0853: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0856: aload 0
      // 0857: getfield rip/breeze/inject/MathUtil11.ð_ç Lrip/breeze/inject/ð;
      // 085a: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 085d: bipush 0
      // 085e: aload 0
      // 085f: getfield rip/breeze/inject/MathUtil11.ð_ç Lrip/breeze/inject/ð;
      // 0862: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0865: lload 23
      // 0867: bipush 4
      // 0868: anewarray 141
      // 086b: dup_x2
      // 086c: dup_x2
      // 086d: pop
      // 086e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0871: bipush 3
      // 0872: swap
      // 0873: aastore
      // 0874: dup_x1
      // 0875: swap
      // 0876: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0879: bipush 2
      // 087a: swap
      // 087b: aastore
      // 087c: dup_x1
      // 087d: swap
      // 087e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0881: bipush 1
      // 0882: swap
      // 0883: aastore
      // 0884: dup_x1
      // 0885: swap
      // 0886: bipush 0
      // 0887: swap
      // 0888: aastore
      // 0889: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 088c: pop
      // 088d: goto 0894
      // 0890: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0893: athrow
      // 0894: aload 0
      // 0895: getfield rip/breeze/inject/MathUtil11.ð_å Lrip/breeze/inject/ð;
      // 0898: lload 3
      // 0899: lconst_0
      // 089a: lcmp
      // 089b: ifle 0983
      // 089e: iload 38
      // 08a0: ifne 0983
      // 08a3: ifnull 096d
      // 08a6: goto 08ad
      // 08a9: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08ac: athrow
      // 08ad: aload 2
      // 08ae: aload 0
      // 08af: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 08b2: lload 21
      // 08b4: sipush 16037
      // 08b7: ldc2_w 250815221511369810
      // 08ba: lload 3
      // 08bb: lxor
      // 08bc: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 08bf: bipush 2
      // 08c0: anewarray 141
      // 08c3: dup_x1
      // 08c4: swap
      // 08c5: bipush 1
      // 08c6: swap
      // 08c7: aastore
      // 08c8: dup_x2
      // 08c9: dup_x2
      // 08ca: pop
      // 08cb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08ce: bipush 0
      // 08cf: swap
      // 08d0: aastore
      // 08d1: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 08d4: lload 7
      // 08d6: bipush 2
      // 08d7: anewarray 141
      // 08da: dup_x2
      // 08db: dup_x2
      // 08dc: pop
      // 08dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08e0: bipush 1
      // 08e1: swap
      // 08e2: aastore
      // 08e3: dup_x1
      // 08e4: swap
      // 08e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08e8: bipush 0
      // 08e9: swap
      // 08ea: aastore
      // 08eb: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 08ee: bipush 2
      // 08ef: aload 0
      // 08f0: getfield rip/breeze/inject/MathUtil11.ð_å Lrip/breeze/inject/ð;
      // 08f3: getfield rip/breeze/inject/ð.int_þ_2 I
      // 08f6: iadd
      // 08f7: lload 36
      // 08f9: bipush 2
      // 08fa: anewarray 141
      // 08fd: dup_x2
      // 08fe: dup_x2
      // 08ff: pop
      // 0900: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0903: bipush 1
      // 0904: swap
      // 0905: aastore
      // 0906: dup_x1
      // 0907: swap
      // 0908: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 090b: bipush 0
      // 090c: swap
      // 090d: aastore
      // 090e: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0911: aload 0
      // 0912: getfield rip/breeze/inject/MathUtil11.int_æ I
      // 0915: lload 7
      // 0917: bipush 2
      // 0918: anewarray 141
      // 091b: dup_x2
      // 091c: dup_x2
      // 091d: pop
      // 091e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0921: bipush 1
      // 0922: swap
      // 0923: aastore
      // 0924: dup_x1
      // 0925: swap
      // 0926: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0929: bipush 0
      // 092a: swap
      // 092b: aastore
      // 092c: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 092f: aload 0
      // 0930: getfield rip/breeze/inject/MathUtil11.ð_å Lrip/breeze/inject/ð;
      // 0933: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 0936: bipush 0
      // 0937: aload 0
      // 0938: getfield rip/breeze/inject/MathUtil11.ð_å Lrip/breeze/inject/ð;
      // 093b: getfield rip/breeze/inject/ð.int_þ_2 I
      // 093e: lload 23
      // 0940: bipush 4
      // 0941: anewarray 141
      // 0944: dup_x2
      // 0945: dup_x2
      // 0946: pop
      // 0947: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 094a: bipush 3
      // 094b: swap
      // 094c: aastore
      // 094d: dup_x1
      // 094e: swap
      // 094f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0952: bipush 2
      // 0953: swap
      // 0954: aastore
      // 0955: dup_x1
      // 0956: swap
      // 0957: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 095a: bipush 1
      // 095b: swap
      // 095c: aastore
      // 095d: dup_x1
      // 095e: swap
      // 095f: bipush 0
      // 0960: swap
      // 0961: aastore
      // 0962: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0965: pop
      // 0966: goto 096d
      // 0969: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 096c: athrow
      // 096d: aload 0
      // 096e: lload 3
      // 096f: lconst_0
      // 0970: lcmp
      // 0971: ifle 0a4d
      // 0974: iload 38
      // 0976: ifne 0a4d
      // 0979: getfield rip/breeze/inject/MathUtil11.ð_ã Lrip/breeze/inject/ð;
      // 097c: goto 0983
      // 097f: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0982: athrow
      // 0983: lload 3
      // 0984: lconst_0
      // 0985: lcmp
      // 0986: iflt 0a44
      // 0989: ifnull 0a4c
      // 098c: aload 2
      // 098d: aload 0
      // 098e: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0991: lload 21
      // 0993: sipush 8466
      // 0996: ldc2_w 2271976211633613795
      // 0999: lload 3
      // 099a: lxor
      // 099b: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 099e: bipush 2
      // 099f: anewarray 141
      // 09a2: dup_x1
      // 09a3: swap
      // 09a4: bipush 1
      // 09a5: swap
      // 09a6: aastore
      // 09a7: dup_x2
      // 09a8: dup_x2
      // 09a9: pop
      // 09aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09ad: bipush 0
      // 09ae: swap
      // 09af: aastore
      // 09b0: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 09b3: lload 7
      // 09b5: bipush 2
      // 09b6: anewarray 141
      // 09b9: dup_x2
      // 09ba: dup_x2
      // 09bb: pop
      // 09bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09bf: bipush 1
      // 09c0: swap
      // 09c1: aastore
      // 09c2: dup_x1
      // 09c3: swap
      // 09c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09c7: bipush 0
      // 09c8: swap
      // 09c9: aastore
      // 09ca: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 09cd: bipush 2
      // 09ce: aload 0
      // 09cf: getfield rip/breeze/inject/MathUtil11.ð_ã Lrip/breeze/inject/ð;
      // 09d2: getfield rip/breeze/inject/ð.int_þ_2 I
      // 09d5: iadd
      // 09d6: lload 36
      // 09d8: bipush 2
      // 09d9: anewarray 141
      // 09dc: dup_x2
      // 09dd: dup_x2
      // 09de: pop
      // 09df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09e2: bipush 1
      // 09e3: swap
      // 09e4: aastore
      // 09e5: dup_x1
      // 09e6: swap
      // 09e7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09ea: bipush 0
      // 09eb: swap
      // 09ec: aastore
      // 09ed: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 09f0: aload 0
      // 09f1: getfield rip/breeze/inject/MathUtil11.int_ä I
      // 09f4: lload 7
      // 09f6: bipush 2
      // 09f7: anewarray 141
      // 09fa: dup_x2
      // 09fb: dup_x2
      // 09fc: pop
      // 09fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a00: bipush 1
      // 0a01: swap
      // 0a02: aastore
      // 0a03: dup_x1
      // 0a04: swap
      // 0a05: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a08: bipush 0
      // 0a09: swap
      // 0a0a: aastore
      // 0a0b: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0a0e: aload 0
      // 0a0f: getfield rip/breeze/inject/MathUtil11.ð_ã Lrip/breeze/inject/ð;
      // 0a12: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 0a15: bipush 0
      // 0a16: aload 0
      // 0a17: getfield rip/breeze/inject/MathUtil11.ð_ã Lrip/breeze/inject/ð;
      // 0a1a: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0a1d: lload 23
      // 0a1f: bipush 4
      // 0a20: anewarray 141
      // 0a23: dup_x2
      // 0a24: dup_x2
      // 0a25: pop
      // 0a26: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a29: bipush 3
      // 0a2a: swap
      // 0a2b: aastore
      // 0a2c: dup_x1
      // 0a2d: swap
      // 0a2e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a31: bipush 2
      // 0a32: swap
      // 0a33: aastore
      // 0a34: dup_x1
      // 0a35: swap
      // 0a36: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a39: bipush 1
      // 0a3a: swap
      // 0a3b: aastore
      // 0a3c: dup_x1
      // 0a3d: swap
      // 0a3e: bipush 0
      // 0a3f: swap
      // 0a40: aastore
      // 0a41: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0a44: pop
      // 0a45: goto 0a4c
      // 0a48: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a4b: athrow
      // 0a4c: aload 0
      // 0a4d: getfield rip/breeze/inject/MathUtil11.û_à Lrip/breeze/inject/û;
      // 0a50: lload 3
      // 0a51: lconst_0
      // 0a52: lcmp
      // 0a53: iflt 0ae0
      // 0a56: iload 38
      // 0a58: ifne 0ae0
      // 0a5b: ifnull 0aca
      // 0a5e: goto 0a65
      // 0a61: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a64: athrow
      // 0a65: aload 0
      // 0a66: getfield rip/breeze/inject/MathUtil11.û_à Lrip/breeze/inject/û;
      // 0a69: aload 0
      // 0a6a: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0a6d: lload 21
      // 0a6f: sipush 29806
      // 0a72: ldc2_w 9117618829113097875
      // 0a75: lload 3
      // 0a76: lxor
      // 0a77: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 0a7a: bipush 2
      // 0a7b: anewarray 141
      // 0a7e: dup_x1
      // 0a7f: swap
      // 0a80: bipush 1
      // 0a81: swap
      // 0a82: aastore
      // 0a83: dup_x2
      // 0a84: dup_x2
      // 0a85: pop
      // 0a86: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a89: bipush 0
      // 0a8a: swap
      // 0a8b: aastore
      // 0a8c: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 0a8f: aload 2
      // 0a90: iload 25
      // 0a92: iload 26
      // 0a94: i2s
      // 0a95: iload 27
      // 0a97: bipush 5
      // 0a98: anewarray 141
      // 0a9b: dup_x1
      // 0a9c: swap
      // 0a9d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0aa0: bipush 4
      // 0aa1: swap
      // 0aa2: aastore
      // 0aa3: dup_x1
      // 0aa4: swap
      // 0aa5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0aa8: bipush 3
      // 0aa9: swap
      // 0aaa: aastore
      // 0aab: dup_x1
      // 0aac: swap
      // 0aad: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ab0: bipush 2
      // 0ab1: swap
      // 0ab2: aastore
      // 0ab3: dup_x1
      // 0ab4: swap
      // 0ab5: bipush 1
      // 0ab6: swap
      // 0ab7: aastore
      // 0ab8: dup_x1
      // 0ab9: swap
      // 0aba: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0abd: bipush 0
      // 0abe: swap
      // 0abf: aastore
      // 0ac0: invokevirtual rip/breeze/inject/û.method_005 ([Ljava/lang/Object;)V
      // 0ac3: goto 0aca
      // 0ac6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ac9: athrow
      // 0aca: aload 0
      // 0acb: iload 38
      // 0acd: lload 3
      // 0ace: lconst_0
      // 0acf: lcmp
      // 0ad0: iflt 0b51
      // 0ad3: ifne 0b4f
      // 0ad6: getfield rip/breeze/inject/MathUtil11.û_ß Lrip/breeze/inject/û;
      // 0ad9: goto 0ae0
      // 0adc: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0adf: athrow
      // 0ae0: lload 3
      // 0ae1: lconst_0
      // 0ae2: lcmp
      // 0ae3: iflt 0aed
      // 0ae6: ifnull 0b4e
      // 0ae9: aload 0
      // 0aea: getfield rip/breeze/inject/MathUtil11.û_ß Lrip/breeze/inject/û;
      // 0aed: aload 0
      // 0aee: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0af1: lload 21
      // 0af3: sipush 20309
      // 0af6: ldc2_w 1701513974723233209
      // 0af9: lload 3
      // 0afa: lxor
      // 0afb: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 0afe: bipush 2
      // 0aff: anewarray 141
      // 0b02: dup_x1
      // 0b03: swap
      // 0b04: bipush 1
      // 0b05: swap
      // 0b06: aastore
      // 0b07: dup_x2
      // 0b08: dup_x2
      // 0b09: pop
      // 0b0a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0d: bipush 0
      // 0b0e: swap
      // 0b0f: aastore
      // 0b10: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 0b13: aload 2
      // 0b14: iload 25
      // 0b16: iload 26
      // 0b18: i2s
      // 0b19: iload 27
      // 0b1b: bipush 5
      // 0b1c: anewarray 141
      // 0b1f: dup_x1
      // 0b20: swap
      // 0b21: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b24: bipush 4
      // 0b25: swap
      // 0b26: aastore
      // 0b27: dup_x1
      // 0b28: swap
      // 0b29: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b2c: bipush 3
      // 0b2d: swap
      // 0b2e: aastore
      // 0b2f: dup_x1
      // 0b30: swap
      // 0b31: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b34: bipush 2
      // 0b35: swap
      // 0b36: aastore
      // 0b37: dup_x1
      // 0b38: swap
      // 0b39: bipush 1
      // 0b3a: swap
      // 0b3b: aastore
      // 0b3c: dup_x1
      // 0b3d: swap
      // 0b3e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b41: bipush 0
      // 0b42: swap
      // 0b43: aastore
      // 0b44: invokevirtual rip/breeze/inject/û.method_005 ([Ljava/lang/Object;)V
      // 0b47: goto 0b4e
      // 0b4a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b4d: athrow
      // 0b4e: aload 0
      // 0b4f: iload 38
      // 0b51: lload 3
      // 0b52: lconst_0
      // 0b53: lcmp
      // 0b54: ifle 0bd3
      // 0b57: ifne 0bcb
      // 0b5a: getfield rip/breeze/inject/MathUtil11.õ_º Lrip/breeze/inject/õ;
      // 0b5d: ifnull 0bca
      // 0b60: goto 0b67
      // 0b63: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b66: athrow
      // 0b67: aload 0
      // 0b68: getfield rip/breeze/inject/MathUtil11.õ_º Lrip/breeze/inject/õ;
      // 0b6b: aload 0
      // 0b6c: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0b6f: aload 0
      // 0b70: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0b73: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 0b76: aload 0
      // 0b77: getfield rip/breeze/inject/MathUtil11.ð_ë Lrip/breeze/inject/ð;
      // 0b7a: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0b7d: lload 28
      // 0b7f: dup2_x1
      // 0b80: pop2
      // 0b81: aload 0
      // 0b82: getfield rip/breeze/inject/MathUtil11.int_í I
      // 0b85: aload 0
      // 0b86: getfield rip/breeze/inject/MathUtil11.int_ì I
      // 0b89: aload 2
      // 0b8a: bipush 7
      // 0b8c: anewarray 141
      // 0b8f: dup_x1
      // 0b90: swap
      // 0b91: bipush 6
      // 0b93: swap
      // 0b94: aastore
      // 0b95: dup_x1
      // 0b96: swap
      // 0b97: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b9a: bipush 5
      // 0b9b: swap
      // 0b9c: aastore
      // 0b9d: dup_x1
      // 0b9e: swap
      // 0b9f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ba2: bipush 4
      // 0ba3: swap
      // 0ba4: aastore
      // 0ba5: dup_x1
      // 0ba6: swap
      // 0ba7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0baa: bipush 3
      // 0bab: swap
      // 0bac: aastore
      // 0bad: dup_x2
      // 0bae: dup_x2
      // 0baf: pop
      // 0bb0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bb3: bipush 2
      // 0bb4: swap
      // 0bb5: aastore
      // 0bb6: dup_x1
      // 0bb7: swap
      // 0bb8: bipush 1
      // 0bb9: swap
      // 0bba: aastore
      // 0bbb: dup_x1
      // 0bbc: swap
      // 0bbd: bipush 0
      // 0bbe: swap
      // 0bbf: aastore
      // 0bc0: invokevirtual rip/breeze/inject/õ.method_015 ([Ljava/lang/Object;)V
      // 0bc3: goto 0bca
      // 0bc6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bc9: athrow
      // 0bca: aload 0
      // 0bcb: lload 3
      // 0bcc: lconst_0
      // 0bcd: lcmp
      // 0bce: ifle 0d42
      // 0bd1: iload 38
      // 0bd3: ifne 0d42
      // 0bd6: getfield rip/breeze/inject/MathUtil11.int_µ I
      // 0bd9: goto 0be0
      // 0bdc: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bdf: athrow
      // 0be0: ifle 0cbf
      // 0be3: aload 2
      // 0be4: aload 0
      // 0be5: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0be8: lload 21
      // 0bea: sipush 25030
      // 0bed: ldc2_w 5625576261556169523
      // 0bf0: lload 3
      // 0bf1: lxor
      // 0bf2: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 0bf5: bipush 2
      // 0bf6: anewarray 141
      // 0bf9: dup_x1
      // 0bfa: swap
      // 0bfb: bipush 1
      // 0bfc: swap
      // 0bfd: aastore
      // 0bfe: dup_x2
      // 0bff: dup_x2
      // 0c00: pop
      // 0c01: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c04: bipush 0
      // 0c05: swap
      // 0c06: aastore
      // 0c07: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 0c0a: lload 7
      // 0c0c: bipush 2
      // 0c0d: anewarray 141
      // 0c10: dup_x2
      // 0c11: dup_x2
      // 0c12: pop
      // 0c13: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c16: bipush 1
      // 0c17: swap
      // 0c18: aastore
      // 0c19: dup_x1
      // 0c1a: swap
      // 0c1b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c1e: bipush 0
      // 0c1f: swap
      // 0c20: aastore
      // 0c21: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0c24: bipush 2
      // 0c25: bipush 2
      // 0c26: aload 0
      // 0c27: getfield rip/breeze/inject/MathUtil11.int_µ I
      // 0c2a: imul
      // 0c2b: iadd
      // 0c2c: lload 36
      // 0c2e: bipush 2
      // 0c2f: anewarray 141
      // 0c32: dup_x2
      // 0c33: dup_x2
      // 0c34: pop
      // 0c35: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c38: bipush 1
      // 0c39: swap
      // 0c3a: aastore
      // 0c3b: dup_x1
      // 0c3c: swap
      // 0c3d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c40: bipush 0
      // 0c41: swap
      // 0c42: aastore
      // 0c43: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0c46: aload 0
      // 0c47: getfield rip/breeze/inject/MathUtil11.int_µ I
      // 0c4a: lload 7
      // 0c4c: bipush 2
      // 0c4d: anewarray 141
      // 0c50: dup_x2
      // 0c51: dup_x2
      // 0c52: pop
      // 0c53: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c56: bipush 1
      // 0c57: swap
      // 0c58: aastore
      // 0c59: dup_x1
      // 0c5a: swap
      // 0c5b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c5e: bipush 0
      // 0c5f: swap
      // 0c60: aastore
      // 0c61: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0c64: pop
      // 0c65: aload 0
      // 0c66: getfield rip/breeze/inject/MathUtil11.arr_ª [I
      // 0c69: astore 42
      // 0c6b: aload 42
      // 0c6d: arraylength
      // 0c6e: istore 43
      // 0c70: bipush 0
      // 0c71: istore 44
      // 0c73: iload 44
      // 0c75: iload 43
      // 0c77: if_icmpge 0cbf
      // 0c7a: aload 42
      // 0c7c: iload 44
      // 0c7e: iaload
      // 0c7f: istore 45
      // 0c81: aload 2
      // 0c82: iload 45
      // 0c84: lload 7
      // 0c86: bipush 2
      // 0c87: anewarray 141
      // 0c8a: dup_x2
      // 0c8b: dup_x2
      // 0c8c: pop
      // 0c8d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c90: bipush 1
      // 0c91: swap
      // 0c92: aastore
      // 0c93: dup_x1
      // 0c94: swap
      // 0c95: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c98: bipush 0
      // 0c99: swap
      // 0c9a: aastore
      // 0c9b: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0c9e: pop
      // 0c9f: iinc 44 1
      // 0ca2: iload 38
      // 0ca4: lload 3
      // 0ca5: lconst_0
      // 0ca6: lcmp
      // 0ca7: ifle 0caf
      // 0caa: ifne 0d41
      // 0cad: iload 38
      // 0caf: ifeq 0c73
      // 0cb2: lload 3
      // 0cb3: lconst_0
      // 0cb4: lcmp
      // 0cb5: ifle 0ca2
      // 0cb8: goto 0cbf
      // 0cbb: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cbe: athrow
      // 0cbf: aload 0
      // 0cc0: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0cc3: aload 0
      // 0cc4: getfield rip/breeze/inject/MathUtil11.int_ò I
      // 0cc7: aload 0
      // 0cc8: getfield rip/breeze/inject/MathUtil11.fieldInt_z I
      // 0ccb: aload 2
      // 0ccc: lload 15
      // 0cce: bipush 5
      // 0ccf: anewarray 141
      // 0cd2: dup_x2
      // 0cd3: dup_x2
      // 0cd4: pop
      // 0cd5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cd8: bipush 4
      // 0cd9: swap
      // 0cda: aastore
      // 0cdb: dup_x1
      // 0cdc: swap
      // 0cdd: bipush 3
      // 0cde: swap
      // 0cdf: aastore
      // 0ce0: dup_x1
      // 0ce1: swap
      // 0ce2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ce5: bipush 2
      // 0ce6: swap
      // 0ce7: aastore
      // 0ce8: dup_x1
      // 0ce9: swap
      // 0cea: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ced: bipush 1
      // 0cee: swap
      // 0cef: aastore
      // 0cf0: dup_x1
      // 0cf1: swap
      // 0cf2: bipush 0
      // 0cf3: swap
      // 0cf4: aastore
      // 0cf5: invokestatic rip/breeze/inject/õ.method_016 ([Ljava/lang/Object;)V
      // 0cf8: aload 0
      // 0cf9: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0cfc: aload 0
      // 0cfd: getfield rip/breeze/inject/MathUtil11.û_y Lrip/breeze/inject/û;
      // 0d00: aload 0
      // 0d01: getfield rip/breeze/inject/MathUtil11.û_x Lrip/breeze/inject/û;
      // 0d04: aload 0
      // 0d05: getfield rip/breeze/inject/MathUtil11.û_s Lrip/breeze/inject/û;
      // 0d08: aload 0
      // 0d09: getfield rip/breeze/inject/MathUtil11.û_r Lrip/breeze/inject/û;
      // 0d0c: lload 34
      // 0d0e: dup2_x1
      // 0d0f: pop2
      // 0d10: aload 2
      // 0d11: bipush 7
      // 0d13: anewarray 141
      // 0d16: dup_x1
      // 0d17: swap
      // 0d18: bipush 6
      // 0d1a: swap
      // 0d1b: aastore
      // 0d1c: dup_x1
      // 0d1d: swap
      // 0d1e: bipush 5
      // 0d1f: swap
      // 0d20: aastore
      // 0d21: dup_x2
      // 0d22: dup_x2
      // 0d23: pop
      // 0d24: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d27: bipush 4
      // 0d28: swap
      // 0d29: aastore
      // 0d2a: dup_x1
      // 0d2b: swap
      // 0d2c: bipush 3
      // 0d2d: swap
      // 0d2e: aastore
      // 0d2f: dup_x1
      // 0d30: swap
      // 0d31: bipush 2
      // 0d32: swap
      // 0d33: aastore
      // 0d34: dup_x1
      // 0d35: swap
      // 0d36: bipush 1
      // 0d37: swap
      // 0d38: aastore
      // 0d39: dup_x1
      // 0d3a: swap
      // 0d3b: bipush 0
      // 0d3c: swap
      // 0d3d: aastore
      // 0d3e: invokestatic rip/breeze/inject/û.method_006 ([Ljava/lang/Object;)V
      // 0d41: aload 0
      // 0d42: getfield rip/breeze/inject/MathUtil11.arr_v [Lrip/breeze/inject/û;
      // 0d45: lload 3
      // 0d46: lconst_0
      // 0d47: lcmp
      // 0d48: ifle 0df3
      // 0d4b: iload 38
      // 0d4d: ifne 0df3
      // 0d50: ifnull 0ddd
      // 0d53: goto 0d5a
      // 0d56: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d59: athrow
      // 0d5a: aload 0
      // 0d5b: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0d5e: lload 21
      // 0d60: sipush 28461
      // 0d63: ldc2_w 2001114854234088910
      // 0d66: lload 3
      // 0d67: lxor
      // 0d68: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 0d6b: bipush 2
      // 0d6c: anewarray 141
      // 0d6f: dup_x1
      // 0d70: swap
      // 0d71: bipush 1
      // 0d72: swap
      // 0d73: aastore
      // 0d74: dup_x2
      // 0d75: dup_x2
      // 0d76: pop
      // 0d77: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7a: bipush 0
      // 0d7b: swap
      // 0d7c: aastore
      // 0d7d: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 0d80: aload 0
      // 0d81: getfield rip/breeze/inject/MathUtil11.arr_v [Lrip/breeze/inject/û;
      // 0d84: aload 0
      // 0d85: iload 38
      // 0d87: ifne 0dab
      // 0d8a: goto 0d91
      // 0d8d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d90: athrow
      // 0d91: getfield rip/breeze/inject/MathUtil11.fieldInt_w I
      // 0d94: ifne 0daa
      // 0d97: goto 0d9e
      // 0d9a: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d9d: athrow
      // 0d9e: aload 0
      // 0d9f: getfield rip/breeze/inject/MathUtil11.arr_v [Lrip/breeze/inject/û;
      // 0da2: arraylength
      // 0da3: goto 0dae
      // 0da6: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0da9: athrow
      // 0daa: aload 0
      // 0dab: getfield rip/breeze/inject/MathUtil11.fieldInt_w I
      // 0dae: aload 2
      // 0daf: lload 11
      // 0db1: dup2_x2
      // 0db2: pop2
      // 0db3: bipush 5
      // 0db4: anewarray 141
      // 0db7: dup_x1
      // 0db8: swap
      // 0db9: bipush 4
      // 0dba: swap
      // 0dbb: aastore
      // 0dbc: dup_x1
      // 0dbd: swap
      // 0dbe: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0dc1: bipush 3
      // 0dc2: swap
      // 0dc3: aastore
      // 0dc4: dup_x2
      // 0dc5: dup_x2
      // 0dc6: pop
      // 0dc7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dca: bipush 2
      // 0dcb: swap
      // 0dcc: aastore
      // 0dcd: dup_x1
      // 0dce: swap
      // 0dcf: bipush 1
      // 0dd0: swap
      // 0dd1: aastore
      // 0dd2: dup_x1
      // 0dd3: swap
      // 0dd4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0dd7: bipush 0
      // 0dd8: swap
      // 0dd9: aastore
      // 0dda: invokestatic rip/breeze/inject/û.method_008 ([Ljava/lang/Object;)V
      // 0ddd: aload 0
      // 0dde: lload 3
      // 0ddf: lconst_0
      // 0de0: lcmp
      // 0de1: iflt 0e7a
      // 0de4: iload 38
      // 0de6: ifne 0e7a
      // 0de9: getfield rip/breeze/inject/MathUtil11.arr_t [Lrip/breeze/inject/û;
      // 0dec: goto 0df3
      // 0def: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0df2: athrow
      // 0df3: ifnull 0e79
      // 0df6: aload 0
      // 0df7: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0dfa: lload 21
      // 0dfc: sipush 24900
      // 0dff: ldc2_w 8784722123454147506
      // 0e02: lload 3
      // 0e03: lxor
      // 0e04: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 0e07: bipush 2
      // 0e08: anewarray 141
      // 0e0b: dup_x1
      // 0e0c: swap
      // 0e0d: bipush 1
      // 0e0e: swap
      // 0e0f: aastore
      // 0e10: dup_x2
      // 0e11: dup_x2
      // 0e12: pop
      // 0e13: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e16: bipush 0
      // 0e17: swap
      // 0e18: aastore
      // 0e19: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 0e1c: aload 0
      // 0e1d: getfield rip/breeze/inject/MathUtil11.arr_t [Lrip/breeze/inject/û;
      // 0e20: aload 0
      // 0e21: iload 38
      // 0e23: ifne 0e47
      // 0e26: goto 0e2d
      // 0e29: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e2c: athrow
      // 0e2d: getfield rip/breeze/inject/MathUtil11.fieldInt_u I
      // 0e30: ifne 0e46
      // 0e33: goto 0e3a
      // 0e36: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e39: athrow
      // 0e3a: aload 0
      // 0e3b: getfield rip/breeze/inject/MathUtil11.arr_t [Lrip/breeze/inject/û;
      // 0e3e: arraylength
      // 0e3f: goto 0e4a
      // 0e42: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e45: athrow
      // 0e46: aload 0
      // 0e47: getfield rip/breeze/inject/MathUtil11.fieldInt_u I
      // 0e4a: aload 2
      // 0e4b: lload 11
      // 0e4d: dup2_x2
      // 0e4e: pop2
      // 0e4f: bipush 5
      // 0e50: anewarray 141
      // 0e53: dup_x1
      // 0e54: swap
      // 0e55: bipush 4
      // 0e56: swap
      // 0e57: aastore
      // 0e58: dup_x1
      // 0e59: swap
      // 0e5a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e5d: bipush 3
      // 0e5e: swap
      // 0e5f: aastore
      // 0e60: dup_x2
      // 0e61: dup_x2
      // 0e62: pop
      // 0e63: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e66: bipush 2
      // 0e67: swap
      // 0e68: aastore
      // 0e69: dup_x1
      // 0e6a: swap
      // 0e6b: bipush 1
      // 0e6c: swap
      // 0e6d: aastore
      // 0e6e: dup_x1
      // 0e6f: swap
      // 0e70: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e73: bipush 0
      // 0e74: swap
      // 0e75: aastore
      // 0e76: invokestatic rip/breeze/inject/û.method_008 ([Ljava/lang/Object;)V
      // 0e79: aload 0
      // 0e7a: getfield rip/breeze/inject/MathUtil11.ð_q Lrip/breeze/inject/ð;
      // 0e7d: lload 3
      // 0e7e: lconst_0
      // 0e7f: lcmp
      // 0e80: iflt 0f48
      // 0e83: iload 38
      // 0e85: ifne 0f48
      // 0e88: ifnull 0f32
      // 0e8b: goto 0e92
      // 0e8e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e91: athrow
      // 0e92: aload 2
      // 0e93: aload 0
      // 0e94: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0e97: lload 21
      // 0e99: sipush 28979
      // 0e9c: ldc2_w 4519318743053171663
      // 0e9f: lload 3
      // 0ea0: lxor
      // 0ea1: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 0ea4: bipush 2
      // 0ea5: anewarray 141
      // 0ea8: dup_x1
      // 0ea9: swap
      // 0eaa: bipush 1
      // 0eab: swap
      // 0eac: aastore
      // 0ead: dup_x2
      // 0eae: dup_x2
      // 0eaf: pop
      // 0eb0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb3: bipush 0
      // 0eb4: swap
      // 0eb5: aastore
      // 0eb6: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 0eb9: lload 7
      // 0ebb: bipush 2
      // 0ebc: anewarray 141
      // 0ebf: dup_x2
      // 0ec0: dup_x2
      // 0ec1: pop
      // 0ec2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ec5: bipush 1
      // 0ec6: swap
      // 0ec7: aastore
      // 0ec8: dup_x1
      // 0ec9: swap
      // 0eca: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ecd: bipush 0
      // 0ece: swap
      // 0ecf: aastore
      // 0ed0: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0ed3: aload 0
      // 0ed4: getfield rip/breeze/inject/MathUtil11.ð_q Lrip/breeze/inject/ð;
      // 0ed7: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0eda: lload 36
      // 0edc: bipush 2
      // 0edd: anewarray 141
      // 0ee0: dup_x2
      // 0ee1: dup_x2
      // 0ee2: pop
      // 0ee3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ee6: bipush 1
      // 0ee7: swap
      // 0ee8: aastore
      // 0ee9: dup_x1
      // 0eea: swap
      // 0eeb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0eee: bipush 0
      // 0eef: swap
      // 0ef0: aastore
      // 0ef1: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0ef4: aload 0
      // 0ef5: getfield rip/breeze/inject/MathUtil11.ð_q Lrip/breeze/inject/ð;
      // 0ef8: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 0efb: bipush 0
      // 0efc: aload 0
      // 0efd: getfield rip/breeze/inject/MathUtil11.ð_q Lrip/breeze/inject/ð;
      // 0f00: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0f03: lload 23
      // 0f05: bipush 4
      // 0f06: anewarray 141
      // 0f09: dup_x2
      // 0f0a: dup_x2
      // 0f0b: pop
      // 0f0c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f0f: bipush 3
      // 0f10: swap
      // 0f11: aastore
      // 0f12: dup_x1
      // 0f13: swap
      // 0f14: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f17: bipush 2
      // 0f18: swap
      // 0f19: aastore
      // 0f1a: dup_x1
      // 0f1b: swap
      // 0f1c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f1f: bipush 1
      // 0f20: swap
      // 0f21: aastore
      // 0f22: dup_x1
      // 0f23: swap
      // 0f24: bipush 0
      // 0f25: swap
      // 0f26: aastore
      // 0f27: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0f2a: pop
      // 0f2b: goto 0f32
      // 0f2e: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f31: athrow
      // 0f32: aload 0
      // 0f33: lload 3
      // 0f34: lconst_0
      // 0f35: lcmp
      // 0f36: ifle 1012
      // 0f39: iload 38
      // 0f3b: ifne 1012
      // 0f3e: getfield rip/breeze/inject/MathUtil11.ð_o Lrip/breeze/inject/ð;
      // 0f41: goto 0f48
      // 0f44: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f47: athrow
      // 0f48: lload 3
      // 0f49: lconst_0
      // 0f4a: lcmp
      // 0f4b: iflt 1009
      // 0f4e: ifnull 1011
      // 0f51: aload 2
      // 0f52: aload 0
      // 0f53: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 0f56: lload 21
      // 0f58: sipush 31488
      // 0f5b: ldc2_w 4154393952797651433
      // 0f5e: lload 3
      // 0f5f: lxor
      // 0f60: invokestatic rip/breeze/inject/MathUtil11.buildString_2 (IJ)Ljava/lang/String;
      // 0f63: bipush 2
      // 0f64: anewarray 141
      // 0f67: dup_x1
      // 0f68: swap
      // 0f69: bipush 1
      // 0f6a: swap
      // 0f6b: aastore
      // 0f6c: dup_x2
      // 0f6d: dup_x2
      // 0f6e: pop
      // 0f6f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f72: bipush 0
      // 0f73: swap
      // 0f74: aastore
      // 0f75: invokevirtual rip/breeze/inject/Util139.calculate_6 ([Ljava/lang/Object;)I
      // 0f78: lload 7
      // 0f7a: bipush 2
      // 0f7b: anewarray 141
      // 0f7e: dup_x2
      // 0f7f: dup_x2
      // 0f80: pop
      // 0f81: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f84: bipush 1
      // 0f85: swap
      // 0f86: aastore
      // 0f87: dup_x1
      // 0f88: swap
      // 0f89: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f8c: bipush 0
      // 0f8d: swap
      // 0f8e: aastore
      // 0f8f: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0f92: bipush 1
      // 0f93: aload 0
      // 0f94: getfield rip/breeze/inject/MathUtil11.ð_o Lrip/breeze/inject/ð;
      // 0f97: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0f9a: iadd
      // 0f9b: lload 36
      // 0f9d: bipush 2
      // 0f9e: anewarray 141
      // 0fa1: dup_x2
      // 0fa2: dup_x2
      // 0fa3: pop
      // 0fa4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fa7: bipush 1
      // 0fa8: swap
      // 0fa9: aastore
      // 0faa: dup_x1
      // 0fab: swap
      // 0fac: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0faf: bipush 0
      // 0fb0: swap
      // 0fb1: aastore
      // 0fb2: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0fb5: aload 0
      // 0fb6: getfield rip/breeze/inject/MathUtil11.fieldInt_p I
      // 0fb9: lload 9
      // 0fbb: bipush 2
      // 0fbc: anewarray 141
      // 0fbf: dup_x2
      // 0fc0: dup_x2
      // 0fc1: pop
      // 0fc2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fc5: bipush 1
      // 0fc6: swap
      // 0fc7: aastore
      // 0fc8: dup_x1
      // 0fc9: swap
      // 0fca: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fcd: bipush 0
      // 0fce: swap
      // 0fcf: aastore
      // 0fd0: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 0fd3: aload 0
      // 0fd4: getfield rip/breeze/inject/MathUtil11.ð_o Lrip/breeze/inject/ð;
      // 0fd7: getfield rip/breeze/inject/ð.arr_ÿ_2 [B
      // 0fda: bipush 0
      // 0fdb: aload 0
      // 0fdc: getfield rip/breeze/inject/MathUtil11.ð_o Lrip/breeze/inject/ð;
      // 0fdf: getfield rip/breeze/inject/ð.int_þ_2 I
      // 0fe2: lload 23
      // 0fe4: bipush 4
      // 0fe5: anewarray 141
      // 0fe8: dup_x2
      // 0fe9: dup_x2
      // 0fea: pop
      // 0feb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fee: bipush 3
      // 0fef: swap
      // 0ff0: aastore
      // 0ff1: dup_x1
      // 0ff2: swap
      // 0ff3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ff6: bipush 2
      // 0ff7: swap
      // 0ff8: aastore
      // 0ff9: dup_x1
      // 0ffa: swap
      // 0ffb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ffe: bipush 1
      // 0fff: swap
      // 1000: aastore
      // 1001: dup_x1
      // 1002: swap
      // 1003: bipush 0
      // 1004: swap
      // 1005: aastore
      // 1006: invokevirtual rip/breeze/inject/ð.method_012 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1009: pop
      // 100a: goto 1011
      // 100d: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1010: athrow
      // 1011: aload 0
      // 1012: getfield rip/breeze/inject/MathUtil11.õ_n Lrip/breeze/inject/õ;
      // 1015: iload 38
      // 1017: ifne 102f
      // 101a: ifnull 1050
      // 101d: goto 1024
      // 1020: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1023: athrow
      // 1024: aload 0
      // 1025: getfield rip/breeze/inject/MathUtil11.õ_n Lrip/breeze/inject/õ;
      // 1028: goto 102f
      // 102b: invokestatic rip/breeze/inject/MathUtil11.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 102e: athrow
      // 102f: aload 0
      // 1030: getfield rip/breeze/inject/MathUtil11.dataBuilder4_ó Lrip/breeze/inject/Util139;
      // 1033: aload 2
      // 1034: lload 19
      // 1036: bipush 3
      // 1037: anewarray 141
      // 103a: dup_x2
      // 103b: dup_x2
      // 103c: pop
      // 103d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1040: bipush 2
      // 1041: swap
      // 1042: aastore
      // 1043: dup_x1
      // 1044: swap
      // 1045: bipush 1
      // 1046: swap
      // 1047: aastore
      // 1048: dup_x1
      // 1049: swap
      // 104a: bipush 0
      // 104b: swap
      // 104c: aastore
      // 104d: invokevirtual rip/breeze/inject/õ.method_014 ([Ljava/lang/Object;)V
      // 1050: return
      // try (104 -> 113): 114 java/lang/IllegalArgumentException
      // try (111 -> 117): 118 java/lang/IllegalArgumentException
      // try (123 -> 127): 128 java/lang/IllegalArgumentException
      // try (134 -> 202): 203 java/lang/IllegalArgumentException
      // try (201 -> 246): 246 java/lang/IllegalArgumentException
      // try (250 -> 260): 261 java/lang/IllegalArgumentException
      // try (266 -> 273): 274 java/lang/IllegalArgumentException
      // try (281 -> 284): 285 java/lang/IllegalArgumentException
      // try (283 -> 294): 295 java/lang/IllegalArgumentException
      // try (287 -> 298): 299 java/lang/IllegalArgumentException
      // try (304 -> 307): 308 java/lang/IllegalArgumentException
      // try (311 -> 321): 322 java/lang/IllegalArgumentException
      // try (327 -> 331): 332 java/lang/IllegalArgumentException
      // try (335 -> 343): 344 java/lang/IllegalArgumentException
      // try (349 -> 353): 354 java/lang/IllegalArgumentException
      // try (357 -> 365): 366 java/lang/IllegalArgumentException
      // try (371 -> 375): 376 java/lang/IllegalArgumentException
      // try (379 -> 387): 388 java/lang/IllegalArgumentException
      // try (393 -> 397): 398 java/lang/IllegalArgumentException
      // try (401 -> 409): 410 java/lang/IllegalArgumentException
      // try (415 -> 423): 424 java/lang/IllegalArgumentException
      // try (463 -> 468): 469 java/lang/IllegalArgumentException
      // try (498 -> 507): 508 java/lang/IllegalArgumentException
      // try (521 -> 528): 529 java/lang/IllegalArgumentException
      // try (542 -> 545): 546 java/lang/IllegalArgumentException
      // try (557 -> 565): 566 java/lang/IllegalArgumentException
      // try (579 -> 583): 584 java/lang/IllegalArgumentException
      // try (613 -> 621): 622 java/lang/IllegalArgumentException
      // try (653 -> 661): 662 java/lang/IllegalArgumentException
      // try (936 -> 944): 945 java/lang/IllegalArgumentException
      // try (943 -> 954): 955 java/lang/IllegalArgumentException
      // try (947 -> 959): 960 java/lang/IllegalArgumentException
      // try (957 -> 963): 964 java/lang/IllegalArgumentException
      // try (969 -> 984): 984 java/lang/IllegalArgumentException
      // try (1105 -> 1112): 1113 java/lang/IllegalArgumentException
      // try (1111 -> 1233): 1234 java/lang/IllegalArgumentException
      // try (1238 -> 1245): 1246 java/lang/IllegalArgumentException
      // try (1244 -> 1366): 1367 java/lang/IllegalArgumentException
      // try (1369 -> 1377): 1378 java/lang/IllegalArgumentException
      // try (1380 -> 1503): 1504 java/lang/IllegalArgumentException
      // try (1507 -> 1515): 1516 java/lang/IllegalArgumentException
      // try (1514 -> 1580): 1581 java/lang/IllegalArgumentException
      // try (1583 -> 1591): 1592 java/lang/IllegalArgumentException
      // try (1594 -> 1661): 1662 java/lang/IllegalArgumentException
      // try (1665 -> 1673): 1674 java/lang/IllegalArgumentException
      // try (1671 -> 1737): 1738 java/lang/IllegalArgumentException
      // try (1741 -> 1748): 1749 java/lang/IllegalArgumentException
      // try (1851 -> 1880): 1885 java/lang/IllegalArgumentException
      // try (1982 -> 1990): 1991 java/lang/IllegalArgumentException
      // try (1989 -> 2021): 2022 java/lang/IllegalArgumentException
      // try (1993 -> 2026): 2027 java/lang/IllegalArgumentException
      // try (2024 -> 2033): 2033 java/lang/IllegalArgumentException
      // try (2073 -> 2081): 2082 java/lang/IllegalArgumentException
      // try (2084 -> 2113): 2114 java/lang/IllegalArgumentException
      // try (2085 -> 2118): 2119 java/lang/IllegalArgumentException
      // try (2116 -> 2125): 2125 java/lang/IllegalArgumentException
      // try (2166 -> 2174): 2175 java/lang/IllegalArgumentException
      // try (2173 -> 2274): 2275 java/lang/IllegalArgumentException
      // try (2277 -> 2285): 2286 java/lang/IllegalArgumentException
      // try (2288 -> 2411): 2412 java/lang/IllegalArgumentException
      // try (2415 -> 2419): 2420 java/lang/IllegalArgumentException
      // try (2418 -> 2424): 2425 java/lang/IllegalArgumentException
   }

   @Override
   final void processAll_3(Object[] var1) {
      ñ var2 = (ñ)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_B ^ var3;
      long var5 = var3 ^ 61283821150246L;
      var2.processNullable(new Object[]{this.õ_n, var5});
      var2.processNullable(new Object[]{this.õ_º, var5});
   }

   static {
      long var0 = 73829276834963L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[30];
      int var5 = 0;
      String var6 = "^\u0010\u0094Q:\u0085\u0088Fÿï9m=6æ-\u0012|\u0097ÎÞA\ry\u007fè\u0015\u00942æ@\\YRNÜ\u0000ü\u0010^0$Ú>µfÁCÜ0\u008f\f\\\u0090s\u001aÛe\u0085¯ýÐìl¦ÜëFz\u0001Â{¦°E\u008b\u009f@pø6¢\u0003ýÀDrÊà@bVwVþ¹äuqmV=\u001fÌB\\î9à\u00904\u009bYÓÿê¾_Ð\u0088ïÖIVb\u008e´§\u009dLÌÛ@èùô\u0014\u001b\u0017¿£ï\u009aqXì\u0015Jv\f±«3w(\u0015Q·¡\u008f\u0005-©A4/ëPUõ5p\u0081,Öè\u001e\u0016ª_\u00adÌ\u00154öÄ\u009bLÞè\u0089U3Çô\u0018qÊêÍ-¨\u0094mç\u000bÎ\u0019\"v\u0089ÿ`ù¤\\Ý\bÑ \u0010\u0088Ëî&FÔE&\u0091Ô^¥\fç[\u001f(Ø\u0004&\u001cô\u0006\u0083I\u009a¢\u008c¼\u008f\u00ad(á\u0081$km\u0095¶\u0012kÍ\u0089¿9\u0019VÈw{õX\u0006\u0093\u009aÊQ8¬ëcPb¬º]}ø£ÌbÍòv0Åi4e\u0083÷½Ê\u0089yVÛ\u000f¾°¾\u0005/S\u0012¸\u000ebË¡)\u001cp\u0014ìvEoJvJ >s(VWD\tÎõs\u001deæÛ »d\u0001\u008c3Üç\u009e\u0090zÖ\u0098CÀß<bé³N4gÖE±\u0014\u000b9\u0010\u0086¼\u001aæ'¬à\u00860\u008fÓ\u0007\u008b¥\u0018æ\u0018÷®A\u0090C\t0\u00987Òt:D¥k87#åD\u008b¥%È0ÙÌ\u0097@\u0014\u0006\u0085¶58\u0015Ë¿\u0096\u0089y½Û³\u0000XHí*TtH\u008cÀ¯ m7\u0012cCË\u0097ê6¤Ol\u0004q[/õ@<Mn÷\u0095çz\u009cÛ\u0000QOz¤\u0015\u000fþ\u0010ZïÊMïu\u009d\u0094O¹]\u00055ð\u0014§\u0013'\u001bD÷¤USF¡\u0001DÀ*§\u008e7\u0016-ÈW¨\u001dû\u0003¿\u009fD\n\u008c(Ã\u0099|Tm>\u0083õ\u009dwZf\u0018u°A\u009d_V\u001cMc\n\"\u009aüß÷'p\u001aÑ¤\u009f\u008fM¢i\u001dâ éC\u0010¶Aï\u007fÀ9ÛÛeçíõ\u0007ÀÇFG\u009fzR\u0097\u0013\u001e\u00936{\u0095ê\u0001\u0018×Z\u0080\u0092eL#ÉËþ¡wuuj(\u009eÆ;\u009d\u008eÅN88\u0099»g®38e¬\u009aM´Ò2\u001aí¬ÏëÐ¯~\u0014FÐmRÚ©©Õp\u0083|T©Ý´\u000e0w4RÛWæ\u0002D\u0086\u0096cÖKd\u0094\u0017Ñ(ì\u0000Hµ$«_å\u008b}\u001aÝ§\u0012´¢;,Mp)û½B\u000f\bB¯\u008e ìBéw\u000e\u000080\u0016¬\u0018J6G\u008e\u007f\u001c3^Ví\u0094¶\u0080\u009fÒ\u0081C\u0088>W×1ïÄ(t>ÍBß\u0082Å¡\u0000Ø'àRÍY'\u008aoä-Ì\u0017ó^\u0092G¾yû+]ZK4Á\u0000@UåÊ\u0010ª\u008då\u007f÷qD\u0081 á\u009fHL§.ó\u0018  hì\u0010\u0089Èað.& +\u0089j4ubö¦\u0087Õ\u001e²0ª\u008b\u008a\u007f$l9\u001e7½\u001c³\u0014\u0002.\u0093´Ô¹\u0006ÚGÃe¦È]B®Ós8¥«\u0005ÂÒâ\u0003XÄE@áO»P$(ÒÖÁ\u001f\u008bCøºaäGx\u0096¿È\u0002¨=Ì\u0013\u0091\u0011\u000bH]×\u0087ÿ\u000bVåjîÍH\u0002¡¿g\u0001\u0018»\u0002\u0087Í3L¹à¿zùÏ{z\u0004'\u0007_W\u008aY%T¹@¸Gå\u008ccÌp+'!cM\u0081Õ6Y£\b\u0092o\\\u0013Ï\u009cøt\u0019Ø¿ªù \u0087?í±\u0004<\u0081\u0012-|YÉ¤û*\u0016¾Fdæj(Avìo{*ô¿~Ö( Ûñ\f\u009aâ}ö³u\u0094GåÙþ\u0084Â÷\u001c\u0093¬\u0085\u000f+0gÃ?É\u0018ªÈ=îbç?\u0090ø8@1\u008eÆz\u0010Èá&\u0083¼\u0099£CÌ\u001at\u0094¨\u0006D?Þh}\u0080¾sCBßkÅÆJ\u0086Rj¶¦\u00adÍ²¦¶P?u¿J\tÆ\u001a\u0013[\u0002\u0000KDÚ+VV9\u0010";
      int var7 = "^\u0010\u0094Q:\u0085\u0088Fÿï9m=6æ-\u0012|\u0097ÎÞA\ry\u007fè\u0015\u00942æ@\\YRNÜ\u0000ü\u0010^0$Ú>µfÁCÜ0\u008f\f\\\u0090s\u001aÛe\u0085¯ýÐìl¦ÜëFz\u0001Â{¦°E\u008b\u009f@pø6¢\u0003ýÀDrÊà@bVwVþ¹äuqmV=\u001fÌB\\î9à\u00904\u009bYÓÿê¾_Ð\u0088ïÖIVb\u008e´§\u009dLÌÛ@èùô\u0014\u001b\u0017¿£ï\u009aqXì\u0015Jv\f±«3w(\u0015Q·¡\u008f\u0005-©A4/ëPUõ5p\u0081,Öè\u001e\u0016ª_\u00adÌ\u00154öÄ\u009bLÞè\u0089U3Çô\u0018qÊêÍ-¨\u0094mç\u000bÎ\u0019\"v\u0089ÿ`ù¤\\Ý\bÑ \u0010\u0088Ëî&FÔE&\u0091Ô^¥\fç[\u001f(Ø\u0004&\u001cô\u0006\u0083I\u009a¢\u008c¼\u008f\u00ad(á\u0081$km\u0095¶\u0012kÍ\u0089¿9\u0019VÈw{õX\u0006\u0093\u009aÊQ8¬ëcPb¬º]}ø£ÌbÍòv0Åi4e\u0083÷½Ê\u0089yVÛ\u000f¾°¾\u0005/S\u0012¸\u000ebË¡)\u001cp\u0014ìvEoJvJ >s(VWD\tÎõs\u001deæÛ »d\u0001\u008c3Üç\u009e\u0090zÖ\u0098CÀß<bé³N4gÖE±\u0014\u000b9\u0010\u0086¼\u001aæ'¬à\u00860\u008fÓ\u0007\u008b¥\u0018æ\u0018÷®A\u0090C\t0\u00987Òt:D¥k87#åD\u008b¥%È0ÙÌ\u0097@\u0014\u0006\u0085¶58\u0015Ë¿\u0096\u0089y½Û³\u0000XHí*TtH\u008cÀ¯ m7\u0012cCË\u0097ê6¤Ol\u0004q[/õ@<Mn÷\u0095çz\u009cÛ\u0000QOz¤\u0015\u000fþ\u0010ZïÊMïu\u009d\u0094O¹]\u00055ð\u0014§\u0013'\u001bD÷¤USF¡\u0001DÀ*§\u008e7\u0016-ÈW¨\u001dû\u0003¿\u009fD\n\u008c(Ã\u0099|Tm>\u0083õ\u009dwZf\u0018u°A\u009d_V\u001cMc\n\"\u009aüß÷'p\u001aÑ¤\u009f\u008fM¢i\u001dâ éC\u0010¶Aï\u007fÀ9ÛÛeçíõ\u0007ÀÇFG\u009fzR\u0097\u0013\u001e\u00936{\u0095ê\u0001\u0018×Z\u0080\u0092eL#ÉËþ¡wuuj(\u009eÆ;\u009d\u008eÅN88\u0099»g®38e¬\u009aM´Ò2\u001aí¬ÏëÐ¯~\u0014FÐmRÚ©©Õp\u0083|T©Ý´\u000e0w4RÛWæ\u0002D\u0086\u0096cÖKd\u0094\u0017Ñ(ì\u0000Hµ$«_å\u008b}\u001aÝ§\u0012´¢;,Mp)û½B\u000f\bB¯\u008e ìBéw\u000e\u000080\u0016¬\u0018J6G\u008e\u007f\u001c3^Ví\u0094¶\u0080\u009fÒ\u0081C\u0088>W×1ïÄ(t>ÍBß\u0082Å¡\u0000Ø'àRÍY'\u008aoä-Ì\u0017ó^\u0092G¾yû+]ZK4Á\u0000@UåÊ\u0010ª\u008då\u007f÷qD\u0081 á\u009fHL§.ó\u0018  hì\u0010\u0089Èað.& +\u0089j4ubö¦\u0087Õ\u001e²0ª\u008b\u008a\u007f$l9\u001e7½\u001c³\u0014\u0002.\u0093´Ô¹\u0006ÚGÃe¦È]B®Ós8¥«\u0005ÂÒâ\u0003XÄE@áO»P$(ÒÖÁ\u001f\u008bCøºaäGx\u0096¿È\u0002¨=Ì\u0013\u0091\u0011\u000bH]×\u0087ÿ\u000bVåjîÍH\u0002¡¿g\u0001\u0018»\u0002\u0087Í3L¹à¿zùÏ{z\u0004'\u0007_W\u008aY%T¹@¸Gå\u008ccÌp+'!cM\u0081Õ6Y£\b\u0092o\\\u0013Ï\u009cøt\u0019Ø¿ªù \u0087?í±\u0004<\u0081\u0012-|YÉ¤û*\u0016¾Fdæj(Avìo{*ô¿~Ö( Ûñ\f\u009aâ}ö³u\u0094GåÙþ\u0084Â÷\u001c\u0093¬\u0085\u000f+0gÃ?É\u0018ªÈ=îbç?\u0090ø8@1\u008eÆz\u0010Èá&\u0083¼\u0099£CÌ\u001at\u0094¨\u0006D?Þh}\u0080¾sCBßkÅÆJ\u0086Rj¶¦\u00adÍ²¦¶P?u¿J\tÆ\u001a\u0013[\u0002\u0000KDÚ+VV9\u0010"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = buildString(var11).intern();
         if ((var9 += var8) >= var7) {
            var6 = "\u008a*\u009f\u00103ã9ö¢Ç«Q®]\u0006bebðî\t\u0094\u008bB\"\u0007é=\u008b\u0015\u0092è£\u0019ÔY\u009e× 9å\u0002s¸\u008cbË\u0082q_ÎD7Ó\u008bp\u000543\u000fÏmÚ ákMH&ñPû<\u008b\u00018I¡(d\u0013®FüSýEÛ \u009alówà\u0094A·Á\nµ\u0000¹\u0093ån\u009dÂtð\rbnßË¿ûïOäÁ\u0019";
            var7 = "\u008a*\u009f\u00103ã9ö¢Ç«Q®]\u0006bebðî\t\u0094\u008bB\"\u0007é=\u008b\u0015\u0092è£\u0019ÔY\u009e× 9å\u0002s¸\u008cbË\u0082q_ÎD7Ó\u008bp\u000543\u000fÏmÚ ákMH&ñPû<\u008b\u00018I¡(d\u0013®FüSýEÛ \u009alówà\u0094A·Á\nµ\u0000¹\u0093ån\u009dÂtð\rbnßË¿ûïOäÁ\u0019"
               .length();
            var8 = 'X';
            var9 = -1;

            while (true) {
               var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
               var4[var5++] = buildString(var11).intern();
               if ((var9 += var8) >= var7) {
                  CONST_C = var4;
                  CONST_D = new String[30];
                  CONST_Ô = new int[]{
                     0,
                     1,
                     1,
                     1,
                     1,
                     1,
                     1,
                     1,
                     1,
                     2,
                     2,
                     1,
                     1,
                     1,
                     2,
                     2,
                     1,
                     1,
                     1,
                     0,
                     0,
                     1,
                     2,
                     1,
                     2,
                     1,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     -1,
                     0,
                     -1,
                     0,
                     -1,
                     -1,
                     -1,
                     -1,
                     -1,
                     -2,
                     -1,
                     -2,
                     -1,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     -3,
                     -4,
                     -3,
                     -4,
                     -3,
                     -3,
                     -3,
                     -3,
                     -1,
                     -2,
                     1,
                     1,
                     1,
                     2,
                     2,
                     2,
                     0,
                     -1,
                     -2,
                     -1,
                     -2,
                     -1,
                     -2,
                     -1,
                     -2,
                     -1,
                     -2,
                     -1,
                     -2,
                     -1,
                     -2,
                     -1,
                     -2,
                     -1,
                     -2,
                     -1,
                     -2,
                     0,
                     0,
                     0,
                     0,
                     -1,
                     -1,
                     -1,
                     -1,
                     -1,
                     -1,
                     -1,
                     -2,
                     -1,
                     -2,
                     -1,
                     -2,
                     0,
                     1,
                     0,
                     1,
                     -1,
                     -1,
                     0,
                     0,
                     1,
                     1,
                     -1,
                     0,
                     -1,
                     0,
                     0,
                     0,
                     -3,
                     -1,
                     -1,
                     -3,
                     -3,
                     -1,
                     -1,
                     -1,
                     -1,
                     -1,
                     -1,
                     -2,
                     -2,
                     -2,
                     -2,
                     -2,
                     -2,
                     -2,
                     -2,
                     0,
                     1,
                     0,
                     -1,
                     -1,
                     -1,
                     -2,
                     -1,
                     -2,
                     -1,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     1,
                     0,
                     0,
                     0,
                     0,
                     0,
                     0,
                     -1,
                     -1,
                     0,
                     0,
                     -1,
                     -1,
                     0,
                     0
                  };
                  return;
               }

               var8 = var6.charAt(var9);
            }
         }

         var8 = var6.charAt(var9);
      }
   }

   private static IllegalArgumentException getIllegalArgumentException(IllegalArgumentException var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13222;
      if (CONST_D[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_H.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_H.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/y", var10);
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
}
