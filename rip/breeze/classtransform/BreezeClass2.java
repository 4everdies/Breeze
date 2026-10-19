package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.classtransform.annotations.injection.COverride;

public class BreezeClass2 extends Util140<COverride> {
   private static final String CONST_I;

   public BreezeClass2() {
      super(COverride.class, BreezeClass2::lambda$new_Inner0);
   }

   @Override
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast rip/breeze/classtransform/annotations/injection/COverride
      // 011: astore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast rip/breeze/classtransform/ó
      // 018: astore 4
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast rip/breeze/inject/é
      // 020: astore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast rip/breeze/inject/é
      // 028: astore 6
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/lang/Integer
      // 030: invokevirtual java/lang/Integer.intValue ()I
      // 033: istore 7
      // 035: dup
      // 036: bipush 6
      // 038: aaload
      // 039: checkcast rip/breeze/inject/BreezeClass12
      // 03c: astore 8
      // 03e: dup
      // 03f: bipush 7
      // 041: aaload
      // 042: checkcast java/lang/Integer
      // 045: invokevirtual java/lang/Integer.intValue ()I
      // 048: istore 9
      // 04a: dup
      // 04b: bipush 8
      // 04d: aaload
      // 04e: checkcast rip/breeze/inject/BreezeClass12
      // 051: astore 10
      // 053: pop
      // 054: iload 2
      // 055: i2l
      // 056: bipush 48
      // 058: lshl
      // 059: iload 7
      // 05b: i2l
      // 05c: bipush 32
      // 05e: lshl
      // 05f: bipush 16
      // 061: lushr
      // 062: lor
      // 063: iload 9
      // 065: i2l
      // 066: bipush 48
      // 068: lshl
      // 069: bipush 48
      // 06b: lushr
      // 06c: lor
      // 06d: getstatic rip/breeze/classtransform/BreezeClass2.encKey_b J
      // 070: lxor
      // 071: lstore 11
      // 073: lload 11
      // 075: dup2
      // 076: ldc2_w 80414727848911
      // 079: lxor
      // 07a: lstore 13
      // 07c: dup2
      // 07d: ldc2_w 56891061067234
      // 080: lxor
      // 081: lstore 15
      // 083: dup2
      // 084: ldc2_w 135082796872730
      // 087: lxor
      // 088: lstore 17
      // 08a: dup2
      // 08b: ldc2_w 75448232390422
      // 08e: lxor
      // 08f: lstore 19
      // 091: dup2
      // 092: ldc2_w 101557297473873
      // 095: lxor
      // 096: lstore 21
      // 098: dup2
      // 099: ldc2_w 72003009380217
      // 09c: lxor
      // 09d: lstore 23
      // 09f: dup2
      // 0a0: ldc2_w 56835366763820
      // 0a3: lxor
      // 0a4: lstore 25
      // 0a6: dup2
      // 0a7: ldc2_w 112335780107215
      // 0aa: lxor
      // 0ab: lstore 27
      // 0ad: pop2
      // 0ae: invokestatic rip/breeze/classtransform/BreezeClass5.getValue ()I
      // 0b1: istore 29
      // 0b3: aload 10
      // 0b5: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 0b8: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 0bb: iload 29
      // 0bd: ifeq 15d
      // 0c0: aload 8
      // 0c2: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 0c5: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 0c8: if_icmpeq 107
      // 0cb: goto 0d2
      // 0ce: invokestatic rip/breeze/classtransform/BreezeClass2.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 0d1: athrow
      // 0d2: aload 8
      // 0d4: lload 25
      // 0d6: aload 6
      // 0d8: aload 10
      // 0da: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 0dd: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 0e0: bipush 4
      // 0e1: anewarray 93
      // 0e4: dup_x1
      // 0e5: swap
      // 0e6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0e9: bipush 3
      // 0ea: swap
      // 0eb: aastore
      // 0ec: dup_x1
      // 0ed: swap
      // 0ee: bipush 2
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x2
      // 0f2: dup_x2
      // 0f3: pop
      // 0f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f7: bipush 1
      // 0f8: swap
      // 0f9: aastore
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: bipush 0
      // 0fd: swap
      // 0fe: aastore
      // 0ff: invokestatic rip/breeze/classtransform/գ.getԳ ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 102: athrow
      // 103: invokestatic rip/breeze/classtransform/BreezeClass2.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 106: athrow
      // 107: aload 10
      // 109: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 10c: lload 27
      // 10e: bipush 2
      // 10f: anewarray 93
      // 112: dup_x2
      // 113: dup_x2
      // 114: pop
      // 115: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 118: bipush 1
      // 119: swap
      // 11a: aastore
      // 11b: dup_x1
      // 11c: swap
      // 11d: bipush 0
      // 11e: swap
      // 11f: aastore
      // 120: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 123: lload 13
      // 125: dup2_x1
      // 126: pop2
      // 127: aload 8
      // 129: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 12c: lload 27
      // 12e: bipush 2
      // 12f: anewarray 93
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
      // 140: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 143: bipush 3
      // 144: anewarray 93
      // 147: dup_x1
      // 148: swap
      // 149: bipush 2
      // 14a: swap
      // 14b: aastore
      // 14c: dup_x1
      // 14d: swap
      // 14e: bipush 1
      // 14f: swap
      // 150: aastore
      // 151: dup_x2
      // 152: dup_x2
      // 153: pop
      // 154: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 157: bipush 0
      // 158: swap
      // 159: aastore
      // 15a: invokestatic rip/breeze/classtransform/MathUtil3.isValid_3 ([Ljava/lang/Object;)Z
      // 15d: iload 29
      // 15f: iload 7
      // 161: ifle 1e7
      // 164: ifeq 1e5
      // 167: ifne 1b9
      // 16a: goto 171
      // 16d: invokestatic rip/breeze/classtransform/BreezeClass2.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 170: athrow
      // 171: aload 8
      // 173: aload 6
      // 175: aload 10
      // 177: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 17a: lload 27
      // 17c: bipush 2
      // 17d: anewarray 93
      // 180: dup_x2
      // 181: dup_x2
      // 182: pop
      // 183: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 186: bipush 1
      // 187: swap
      // 188: aastore
      // 189: dup_x1
      // 18a: swap
      // 18b: bipush 0
      // 18c: swap
      // 18d: aastore
      // 18e: invokestatic rip/breeze/classtransform/ջ.method_004 ([Ljava/lang/Object;)[Lrip/breeze/inject/MathUtil3;
      // 191: lload 17
      // 193: dup2_x1
      // 194: pop2
      // 195: bipush 4
      // 196: anewarray 93
      // 199: dup_x1
      // 19a: swap
      // 19b: bipush 3
      // 19c: swap
      // 19d: aastore
      // 19e: dup_x2
      // 19f: dup_x2
      // 1a0: pop
      // 1a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a4: bipush 2
      // 1a5: swap
      // 1a6: aastore
      // 1a7: dup_x1
      // 1a8: swap
      // 1a9: bipush 1
      // 1aa: swap
      // 1ab: aastore
      // 1ac: dup_x1
      // 1ad: swap
      // 1ae: bipush 0
      // 1af: swap
      // 1b0: aastore
      // 1b1: invokestatic rip/breeze/classtransform/գ.getԳ_4 ([Ljava/lang/Object;)Lrip/breeze/classtransform/գ;
      // 1b4: athrow
      // 1b5: invokestatic rip/breeze/classtransform/BreezeClass2.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1b8: athrow
      // 1b9: aload 8
      // 1bb: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 1be: aload 10
      // 1c0: getfield rip/breeze/inject/BreezeClass12.int_û I
      // 1c3: lload 21
      // 1c5: bipush 3
      // 1c6: anewarray 93
      // 1c9: dup_x2
      // 1ca: dup_x2
      // 1cb: pop
      // 1cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cf: bipush 2
      // 1d0: swap
      // 1d1: aastore
      // 1d2: dup_x1
      // 1d3: swap
      // 1d4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d7: bipush 1
      // 1d8: swap
      // 1d9: aastore
      // 1da: dup_x1
      // 1db: swap
      // 1dc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1df: bipush 0
      // 1e0: swap
      // 1e1: aastore
      // 1e2: invokestatic rip/breeze/classtransform/MathUtil3.checkCondition ([Ljava/lang/Object;)Z
      // 1e5: iload 29
      // 1e7: ifeq 229
      // 1ea: ifeq 209
      // 1ed: goto 1f4
      // 1f0: invokestatic rip/breeze/classtransform/BreezeClass2.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 1f3: athrow
      // 1f4: new rip/breeze/classtransform/գ
      // 1f7: dup
      // 1f8: aload 8
      // 1fa: aload 6
      // 1fc: lload 23
      // 1fe: getstatic rip/breeze/classtransform/BreezeClass2.CONST_I Ljava/lang/String;
      // 201: invokespecial rip/breeze/classtransform/գ.<init> (Lrip/breeze/inject/BreezeClass12;Lrip/breeze/inject/é;JLjava/lang/String;)V
      // 204: athrow
      // 205: invokestatic rip/breeze/classtransform/BreezeClass2.getԳ (Lrip/breeze/classtransform/գ;)Lrip/breeze/classtransform/գ;
      // 208: athrow
      // 209: aload 8
      // 20b: aload 10
      // 20d: getfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 210: putfield rip/breeze/inject/BreezeClass12.string_ú Ljava/lang/String;
      // 213: aload 8
      // 215: aload 10
      // 217: getfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 21a: putfield rip/breeze/inject/BreezeClass12.string_ù Ljava/lang/String;
      // 21d: aload 5
      // 21f: getfield rip/breeze/inject/é.list_ä_2 Ljava/util/List;
      // 222: aload 10
      // 224: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 229: pop
      // 22a: aload 0
      // 22b: lload 19
      // 22d: aload 6
      // 22f: aload 8
      // 231: bipush 3
      // 232: anewarray 93
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
      // 23f: dup_x2
      // 240: dup_x2
      // 241: pop
      // 242: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 245: bipush 0
      // 246: swap
      // 247: aastore
      // 248: invokevirtual rip/breeze/classtransform/BreezeClass2.ù ([Ljava/lang/Object;)V
      // 24b: aload 6
      // 24d: aload 5
      // 24f: aload 8
      // 251: lload 15
      // 253: bipush 4
      // 254: anewarray 93
      // 257: dup_x2
      // 258: dup_x2
      // 259: pop
      // 25a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25d: bipush 3
      // 25e: swap
      // 25f: aastore
      // 260: dup_x1
      // 261: swap
      // 262: bipush 2
      // 263: swap
      // 264: aastore
      // 265: dup_x1
      // 266: swap
      // 267: bipush 1
      // 268: swap
      // 269: aastore
      // 26a: dup_x1
      // 26b: swap
      // 26c: bipush 0
      // 26d: swap
      // 26e: aastore
      // 26f: invokestatic rip/breeze/classtransform/խ.method_001 ([Ljava/lang/Object;)Lrip/breeze/inject/BreezeClass12;
      // 272: pop
      // 273: return
      // try (107 -> 116): 117 rip/breeze/classtransform/գ
      // try (112 -> 152): 152 rip/breeze/classtransform/գ
      // try (213 -> 218): 219 rip/breeze/classtransform/գ
      // try (217 -> 270): 270 rip/breeze/classtransform/գ
      // try (299 -> 302): 303 rip/breeze/classtransform/գ
      // try (301 -> 313): 313 rip/breeze/classtransform/գ
   }

   private static ռ lambda$new_Inner0(COverride var0) {
      return new ռ(var0.value(), var0.mapping());
   }

   static {
      long var0 = 61632364830598L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ð+¡Ôûç´ùý*Ü¦\u0082«Ôî³G¶ËT\f\u0098øëÄ*]Ë\u0082Æc¢\u000f\u009dßú\u0017{&sñ\u007f¦öuO#ÐCÝç¶_Ü\\".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_I = var5;
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
}
