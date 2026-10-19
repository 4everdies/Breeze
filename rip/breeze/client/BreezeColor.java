package rip.breeze.client;

import java.io.IOException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

final class BreezeColor extends Util64<BitSet> {
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public BitSet getBitSet(RotationUtil9 param1, long param2) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/BreezeColor.18933417276821L J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 36208550560550
      // 00b: lxor
      // 00c: dup2
      // 00d: bipush 48
      // 00f: lushr
      // 010: l2i
      // 011: istore 4
      // 013: dup2
      // 014: bipush 16
      // 016: lshl
      // 017: bipush 48
      // 019: lushr
      // 01a: l2i
      // 01b: istore 5
      // 01d: dup2
      // 01e: bipush 32
      // 020: lshl
      // 021: bipush 32
      // 023: lushr
      // 024: l2i
      // 025: istore 6
      // 027: pop2
      // 028: dup2
      // 029: ldc2_w 122782457724376
      // 02c: lxor
      // 02d: lstore 7
      // 02f: dup2
      // 030: ldc2_w 74929874601702
      // 033: lxor
      // 034: lstore 9
      // 036: dup2
      // 037: ldc2_w 85521728685186
      // 03a: lxor
      // 03b: lstore 11
      // 03d: dup2
      // 03e: ldc2_w 96774895995087
      // 041: lxor
      // 042: lstore 13
      // 044: dup2
      // 045: ldc2_w 75122228491012
      // 048: lxor
      // 049: lstore 15
      // 04b: pop2
      // 04c: invokestatic rip/breeze/client/HttpUtil4.values ()[Lrip/breeze/LicenseState;
      // 04f: new java/util/BitSet
      // 052: dup
      // 053: invokespecial java/util/BitSet.<init> ()V
      // 056: astore 17
      // 058: aload 1
      // 059: lload 7
      // 05b: invokevirtual rip/breeze/client/RotationUtil9.calculate (J)V
      // 05e: bipush 0
      // 05f: istore 18
      // 061: astore 19
      // 063: aload 1
      // 064: lload 9
      // 066: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // 069: astore 20
      // 06b: aload 20
      // 06d: getstatic rip/breeze/client/EnumType1.END_ARRAY Lrip/breeze/client/EnumType1;
      // 070: if_acmpeq 174
      // 073: getstatic rip/breeze/client/Util108.CONST_A [I
      // 076: aload 20
      // 078: invokevirtual rip/breeze/client/EnumType1.ordinal ()I
      // 07b: iaload
      // 07c: lload 2
      // 07d: lconst_0
      // 07e: lcmp
      // 07f: iflt 0a2
      // 082: tableswitch 164 1 3 26 64 83
      // 09c: aload 1
      // 09d: lload 13
      // 09f: invokevirtual rip/breeze/client/RotationUtil9.calculate_8 (J)I
      // 0a2: ifeq 0b4
      // 0a5: goto 0ac
      // 0a8: invokestatic rip/breeze/client/BreezeColor.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: bipush 1
      // 0ad: goto 0b5
      // 0b0: invokestatic rip/breeze/client/BreezeColor.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: bipush 0
      // 0b5: istore 21
      // 0b7: lload 2
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: iflt 14b
      // 0bd: aload 19
      // 0bf: ifnull 14b
      // 0c2: aload 1
      // 0c3: lload 15
      // 0c5: invokevirtual rip/breeze/client/RotationUtil9.checkCondition_2 (J)Z
      // 0c8: istore 21
      // 0ca: lload 2
      // 0cb: lconst_0
      // 0cc: lcmp
      // 0cd: iflt 14b
      // 0d0: aload 19
      // 0d2: ifnull 14b
      // 0d5: aload 1
      // 0d6: iload 4
      // 0d8: i2s
      // 0d9: iload 5
      // 0db: i2s
      // 0dc: iload 6
      // 0de: invokevirtual rip/breeze/client/RotationUtil9.buildString_2 (SSI)Ljava/lang/String;
      // 0e1: astore 22
      // 0e3: aload 22
      // 0e5: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0e8: lload 2
      // 0e9: lconst_0
      // 0ea: lcmp
      // 0eb: iflt 0f2
      // 0ee: ifeq 0f9
      // 0f1: bipush 1
      // 0f2: goto 0fa
      // 0f5: invokestatic rip/breeze/client/BreezeColor.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: bipush 0
      // 0fa: istore 21
      // 0fc: goto 14b
      // 0ff: astore 23
      // 101: new rip/breeze/client/AuthException2
      // 104: dup
      // 105: new java/lang/StringBuilder
      // 108: dup
      // 109: invokespecial java/lang/StringBuilder.<init> ()V
      // 10c: sipush 23299
      // 10f: ldc2_w 2988038105272370093
      // 112: lload 2
      // 113: lxor
      // 114: invokestatic rip/breeze/client/BreezeColor.buildString_2 (IJ)Ljava/lang/String;
      // 117: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11a: aload 22
      // 11c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 122: invokespecial rip/breeze/client/AuthException2.<init> (Ljava/lang/String;)V
      // 125: athrow
      // 126: new rip/breeze/client/AuthException2
      // 129: dup
      // 12a: new java/lang/StringBuilder
      // 12d: dup
      // 12e: invokespecial java/lang/StringBuilder.<init> ()V
      // 131: sipush 12897
      // 134: ldc2_w 9207815169214524110
      // 137: lload 2
      // 138: lxor
      // 139: invokestatic rip/breeze/client/BreezeColor.buildString_2 (IJ)Ljava/lang/String;
      // 13c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13f: aload 20
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 144: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 147: invokespecial rip/breeze/client/AuthException2.<init> (Ljava/lang/String;)V
      // 14a: athrow
      // 14b: lload 2
      // 14c: lconst_0
      // 14d: lcmp
      // 14e: ifle 16f
      // 151: iload 21
      // 153: ifeq 164
      // 156: aload 17
      // 158: iload 18
      // 15a: invokevirtual java/util/BitSet.set (I)V
      // 15d: goto 164
      // 160: invokestatic rip/breeze/client/BreezeColor.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: iinc 18 1
      // 167: aload 1
      // 168: lload 9
      // 16a: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // 16d: astore 20
      // 16f: aload 19
      // 171: ifnull 06b
      // 174: aload 1
      // 175: lload 11
      // 177: invokevirtual rip/breeze/client/RotationUtil9.calculate_2 (J)V
      // 17a: lload 2
      // 17b: lconst_0
      // 17c: lcmp
      // 17d: iflt 073
      // 180: aload 17
      // 182: areturn
      // try (113 -> 122): 122 java/lang/NumberFormatException
      // try (76 -> 85): 85 java/lang/NumberFormatException
      // try (67 -> 80): 81 java/lang/NumberFormatException
      // try (113 -> 126): 127 java/lang/NumberFormatException
      // try (160 -> 169): 170 java/lang/NumberFormatException
   }

   public void processAll(int param1, char param2, Util135 param3, BitSet param4, short param5) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 5
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: getstatic rip/breeze/client/BreezeColor.18933417276821L J
      // 1b: lxor
      // 1c: lstore 6
      // 1e: lload 6
      // 20: dup2
      // 21: ldc2_w 103928602677320
      // 24: lxor
      // 25: dup2
      // 26: bipush 32
      // 28: lushr
      // 29: l2i
      // 2a: istore 8
      // 2c: dup2
      // 2d: bipush 32
      // 2f: lshl
      // 30: bipush 48
      // 32: lushr
      // 33: l2i
      // 34: istore 9
      // 36: dup2
      // 37: bipush 48
      // 39: lshl
      // 3a: bipush 48
      // 3c: lushr
      // 3d: l2i
      // 3e: istore 10
      // 40: pop2
      // 41: dup2
      // 42: ldc2_w 101340248087669
      // 45: lxor
      // 46: lstore 11
      // 48: dup2
      // 49: ldc2_w 25596885556381
      // 4c: lxor
      // 4d: lstore 13
      // 4f: pop2
      // 50: invokestatic rip/breeze/client/HttpUtil4.values ()[Lrip/breeze/LicenseState;
      // 53: aload 3
      // 54: lload 13
      // 56: invokevirtual rip/breeze/client/Util135.getDataBuilder19 (J)Lrip/breeze/client/Util135;
      // 59: pop
      // 5a: astore 15
      // 5c: bipush 0
      // 5d: istore 16
      // 5f: aload 4
      // 61: invokevirtual java/util/BitSet.length ()I
      // 64: istore 17
      // 66: iload 16
      // 68: iload 17
      // 6a: if_icmpge 9f
      // 6d: aload 4
      // 6f: iload 16
      // 71: invokevirtual java/util/BitSet.get (I)Z
      // 74: iload 1
      // 75: iflt 7c
      // 78: ifeq 83
      // 7b: bipush 1
      // 7c: goto 84
      // 7f: invokestatic rip/breeze/client/BreezeColor.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82: athrow
      // 83: bipush 0
      // 84: istore 18
      // 86: aload 3
      // 87: iload 18
      // 89: i2l
      // 8a: iload 8
      // 8c: dup_x2
      // 8d: pop
      // 8e: iload 9
      // 90: iload 10
      // 92: i2s
      // 93: invokevirtual rip/breeze/client/Util135.getDataBuilder19_12 (IJIS)Lrip/breeze/client/Util135;
      // 96: pop
      // 97: iinc 16 1
      // 9a: aload 15
      // 9c: ifnull 66
      // 9f: aload 3
      // a0: lload 11
      // a2: invokevirtual rip/breeze/client/Util135.getDataBuilder19_2 (J)Lrip/breeze/client/Util135;
      // a5: pop
      // a6: iload 5
      // a8: iflt 6d
      // ab: return
      // try (68 -> 76): 76 java/io/IOException
   }

   static {
      long var0 = 40226383514967L;
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
      String var6 = "Z\u0088/\u0013D9\\\u0081\u0012Í\u009d3)-\nÂ?\u0095mù[zé:ò_(À\u001f©ê\u0016\u0096\u0015JfV5ÿ©ä\u0087h¿Ð¨\u008c]Lå!ÂÔN©ÒXô¸Ñ\u0092q¿Äâ?\u0097\u009a<`-ÿ\"²\u001eçø -JoW¶æJ\u0015¼\u0081ù\u0098&\u008cî\u009d<\u007f\u001bg-Öâ=82\u009a\u0087|ï\u009e\u0019\u0087[éüébn\u000bÑ@à\rð\u0086uc[è\u0092ËH]\u0093C\u0094Û\u009f\fm?Ï\u008cÒ^é";
      int var7 = "Z\u0088/\u0013D9\\\u0081\u0012Í\u009d3)-\nÂ?\u0095mù[zé:ò_(À\u001f©ê\u0016\u0096\u0015JfV5ÿ©ä\u0087h¿Ð¨\u008c]Lå!ÂÔN©ÒXô¸Ñ\u0092q¿Äâ?\u0097\u009a<`-ÿ\"²\u001eçø -JoW¶æJ\u0015¼\u0081ù\u0098&\u008cî\u009d<\u007f\u001bg-Öâ=82\u009a\u0087|ï\u009e\u0019\u0087[éüébn\u000bÑ@à\rð\u0086uc[è\u0092ËH]\u0093C\u0094Û\u009f\fm?Ï\u008cÒ^é"
         .length();
      char var8 = '8';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_C = var4;
            CONST_D = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static Exception getException(Exception var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15212;
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
            throw new RuntimeException("rip/breeze/client/bw", var10);
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
