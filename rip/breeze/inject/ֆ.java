package rip.breeze.inject;

public class ֆ {
   public static final int CONST_Ÿ = 0;
   public static final int CONST_Þ = 1;
   public static final int CONST_Ý = 16;
   public static final int CONST_Ü = 17;
   public static final int CONST_Û = 18;
   public static final int CONST_Ú = 19;
   public static final int CONST_Ù = 20;
   public static final int CONST_Ø = 21;
   public static final int CONST_Ö = 22;
   public static final int CONST_Õ = 23;
   public static final int CONST_Ô = 64;
   public static final int CONST_Ó = 65;
   public static final int CONST_Ò = 66;
   public static final int CONST_Ñ = 67;
   public static final int CONST_Ð = 68;
   public static final int CONST_Ï = 69;
   public static final int CONST_Î = 70;
   public static final int CONST_Í = 71;
   public static final int CONST_Ì = 72;
   public static final int CONST_Ë = 73;
   public static final int CONST_Ê = 74;
   public static final int CONST_É = 75;
   private final int int_è;

   public ֆ(int var1) {
      this.int_è = var1;
   }

   public static ֆ getՖ(Object[] var0) {
      int var1 = (Integer)var0[0];
      return new ֆ(var1 << 24);
   }

   public static ֆ getՖ_2(Object[] var0) {
      int var1 = (Integer)var0[0];
      int var2 = (Integer)var0[1];
      return new ֆ(var1 << 24 | var2 << 16);
   }

   public static ֆ getՖ_3(Object[] var0) {
      int var1 = (Integer)var0[0];
      int var2 = (Integer)var0[1];
      int var3 = (Integer)var0[2];
      return new ֆ(var1 << 24 | var2 << 16 | var3 << 8);
   }

   public static ֆ getՖ_4(Object[] var0) {
      int var1 = (Integer)var0[0];
      return new ֆ(268435456 | (var1 & 65535) << 8);
   }

   public static ֆ getՖ_5(Object[] var0) {
      int var1 = (Integer)var0[0];
      return new ֆ(369098752 | var1 << 16);
   }

   public static ֆ getՖ_6(Object[] var0) {
      int var1 = (Integer)var0[0];
      return new ֆ(385875968 | var1 << 8);
   }

   public static ֆ getՖ_7(Object[] var0) {
      int var1 = (Integer)var0[0];
      return new ֆ(1107296256 | var1 << 8);
   }

   public static ֆ getՖ_8(Object[] var0) {
      int var1 = (Integer)var0[0];
      int var2 = (Integer)var0[1];
      return new ֆ(var1 << 24 | var2);
   }

   public int getValue(Object[] var1) {
      return this.int_è >>> 24;
   }

   public int getValue_2(Object[] var1) {
      return (this.int_è & 0xFF0000) >> 16;
   }

   public int getValue_3(Object[] var1) {
      return (this.int_è & 0xFF00) >> 8;
   }

   public int getValue_4(Object[] var1) {
      return (short)((this.int_è & 16776960) >> 8);
   }

   public int getValue_5(Object[] var1) {
      return (this.int_è & 0xFF0000) >> 16;
   }

   public int getValue_6(Object[] var1) {
      return (this.int_è & 16776960) >> 8;
   }

   public int getValue_7(Object[] var1) {
      return (this.int_è & 16776960) >> 8;
   }

   public int getValue_8(Object[] var1) {
      return this.int_è & 0xFF;
   }

   public int getValue_9(Object[] var1) {
      return this.int_è;
   }

   static void processAll(Object[] param0) {
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
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 2
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast rip/breeze/inject/ð
      // 01b: astore 4
      // 01d: pop
      // 01e: getstatic rip/breeze/inject/ֆ.encKey_a J
      // 021: lload 2
      // 022: lxor
      // 023: lstore 2
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 115432022268623
      // 029: lxor
      // 02a: lstore 5
      // 02c: dup2
      // 02d: ldc2_w 51157422785210
      // 030: lxor
      // 031: lstore 7
      // 033: dup2
      // 034: ldc2_w 104205459915239
      // 037: lxor
      // 038: lstore 9
      // 03a: dup2
      // 03b: ldc2_w 109919416472453
      // 03e: lxor
      // 03f: lstore 11
      // 041: pop2
      // 042: invokestatic rip/breeze/inject/Util140.getValue ()I
      // 045: istore 13
      // 047: iload 13
      // 049: ifne 1bc
      // 04c: iload 1
      // 04d: bipush 24
      // 04f: iushr
      // 050: tableswitch 524 0 75 324 324 524 524 524 524 524 524 524 524 524 524 524 524 524 524 462 462 462 375 375 375 324 462 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 524 462 462 462 462 462 420 420 420 420 420
      // 190: invokestatic rip/breeze/inject/ֆ.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 193: athrow
      // 194: aload 4
      // 196: iload 1
      // 197: bipush 16
      // 199: iushr
      // 19a: lload 7
      // 19c: bipush 2
      // 19d: anewarray 4
      // 1a0: dup_x2
      // 1a1: dup_x2
      // 1a2: pop
      // 1a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a6: bipush 1
      // 1a7: swap
      // 1a8: aastore
      // 1a9: dup_x1
      // 1aa: swap
      // 1ab: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ae: bipush 0
      // 1af: swap
      // 1b0: aastore
      // 1b1: invokevirtual rip/breeze/inject/ð.method_004 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1b4: pop
      // 1b5: goto 1bc
      // 1b8: invokestatic rip/breeze/inject/ֆ.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1bb: athrow
      // 1bc: iload 13
      // 1be: lload 2
      // 1bf: lconst_0
      // 1c0: lcmp
      // 1c1: ifle 1ea
      // 1c4: ifeq 268
      // 1c7: aload 4
      // 1c9: iload 1
      // 1ca: bipush 24
      // 1cc: iushr
      // 1cd: lload 9
      // 1cf: bipush 2
      // 1d0: anewarray 4
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
      // 1e4: invokevirtual rip/breeze/inject/ð.method_002 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 1e7: pop
      // 1e8: iload 13
      // 1ea: ifeq 268
      // 1ed: goto 1f4
      // 1f0: invokestatic rip/breeze/inject/ֆ.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f3: athrow
      // 1f4: aload 4
      // 1f6: iload 1
      // 1f7: lload 11
      // 1f9: bipush 2
      // 1fa: anewarray 4
      // 1fd: dup_x2
      // 1fe: dup_x2
      // 1ff: pop
      // 200: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 203: bipush 1
      // 204: swap
      // 205: aastore
      // 206: dup_x1
      // 207: swap
      // 208: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 20b: bipush 0
      // 20c: swap
      // 20d: aastore
      // 20e: invokevirtual rip/breeze/inject/ð.method_007 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 211: pop
      // 212: iload 13
      // 214: ifeq 268
      // 217: goto 21e
      // 21a: invokestatic rip/breeze/inject/ֆ.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21d: athrow
      // 21e: aload 4
      // 220: iload 1
      // 221: bipush 24
      // 223: iushr
      // 224: iload 1
      // 225: ldc 16776960
      // 227: iand
      // 228: bipush 8
      // 22a: ishr
      // 22b: lload 5
      // 22d: dup2_x1
      // 22e: pop2
      // 22f: bipush 3
      // 230: anewarray 4
      // 233: dup_x1
      // 234: swap
      // 235: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 238: bipush 2
      // 239: swap
      // 23a: aastore
      // 23b: dup_x2
      // 23c: dup_x2
      // 23d: pop
      // 23e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 241: bipush 1
      // 242: swap
      // 243: aastore
      // 244: dup_x1
      // 245: swap
      // 246: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 249: bipush 0
      // 24a: swap
      // 24b: aastore
      // 24c: invokevirtual rip/breeze/inject/ð.method_005 ([Ljava/lang/Object;)Lrip/breeze/inject/ð;
      // 24f: pop
      // 250: iload 13
      // 252: ifeq 268
      // 255: goto 25c
      // 258: invokestatic rip/breeze/inject/ֆ.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25b: athrow
      // 25c: new java/lang/IllegalArgumentException
      // 25f: dup
      // 260: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 263: athrow
      // 264: invokestatic rip/breeze/inject/ֆ.getIllegalArgumentException (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 267: athrow
      // 268: return
      // try (43 -> 49): 49 java/lang/IllegalArgumentException
      // try (45 -> 73): 74 java/lang/IllegalArgumentException
      // try (76 -> 106): 107 java/lang/IllegalArgumentException
      // try (82 -> 131): 132 java/lang/IllegalArgumentException
      // try (109 -> 171): 172 java/lang/IllegalArgumentException
      // try (134 -> 178): 178 java/lang/IllegalArgumentException
   }

   private static IllegalArgumentException getIllegalArgumentException(IllegalArgumentException var0) {
      return var0;
   }
}
