package rip.breeze.client;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

final class Util140 extends Util64<Calendar> {
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public Calendar getCalendar(int param1, char param2, short param3, RotationUtil9 param4) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 2
      // 006: i2l
      // 007: bipush 48
      // 009: lshl
      // 00a: bipush 32
      // 00c: lushr
      // 00d: lor
      // 00e: iload 3
      // 00f: i2l
      // 010: bipush 48
      // 012: lshl
      // 013: bipush 48
      // 015: lushr
      // 016: lor
      // 017: getstatic rip/breeze/client/Util140.8056527803523L J
      // 01a: lxor
      // 01b: lstore 5
      // 01d: lload 5
      // 01f: dup2
      // 020: ldc2_w 127819767124066
      // 023: lxor
      // 024: lstore 7
      // 026: dup2
      // 027: ldc2_w 104452085983181
      // 02a: lxor
      // 02b: dup2
      // 02c: bipush 32
      // 02e: lushr
      // 02f: l2i
      // 030: istore 9
      // 032: dup2
      // 033: bipush 32
      // 035: lshl
      // 036: bipush 48
      // 038: lushr
      // 039: l2i
      // 03a: istore 10
      // 03c: dup2
      // 03d: bipush 48
      // 03f: lshl
      // 040: bipush 48
      // 042: lushr
      // 043: l2i
      // 044: istore 11
      // 046: pop2
      // 047: dup2
      // 048: ldc2_w 114768137625163
      // 04b: lxor
      // 04c: lstore 12
      // 04e: dup2
      // 04f: ldc2_w 7209941582717
      // 052: lxor
      // 053: lstore 14
      // 055: dup2
      // 056: ldc2_w 107703354304083
      // 059: lxor
      // 05a: lstore 16
      // 05c: dup2
      // 05d: ldc2_w 40447891787433
      // 060: lxor
      // 061: lstore 18
      // 063: pop2
      // 064: invokestatic rip/breeze/client/HttpUtil4.values ()[Lrip/breeze/LicenseState;
      // 067: astore 20
      // 069: aload 4
      // 06b: lload 7
      // 06d: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // 070: getstatic rip/breeze/client/EnumType1.NULL Lrip/breeze/client/EnumType1;
      // 073: if_acmpne 083
      // 076: aload 4
      // 078: lload 16
      // 07a: invokevirtual rip/breeze/client/RotationUtil9.calculate_7 (J)V
      // 07d: aconst_null
      // 07e: areturn
      // 07f: invokestatic rip/breeze/client/Util140.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 082: athrow
      // 083: aload 4
      // 085: lload 18
      // 087: invokevirtual rip/breeze/client/RotationUtil9.processAll (J)V
      // 08a: bipush 0
      // 08b: istore 21
      // 08d: bipush 0
      // 08e: istore 22
      // 090: bipush 0
      // 091: istore 23
      // 093: bipush 0
      // 094: istore 24
      // 096: bipush 0
      // 097: istore 25
      // 099: bipush 0
      // 09a: istore 26
      // 09c: aload 4
      // 09e: lload 7
      // 0a0: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // 0a3: getstatic rip/breeze/client/EnumType1.END_OBJECT Lrip/breeze/client/EnumType1;
      // 0a6: if_acmpeq 1b4
      // 0a9: aload 4
      // 0ab: lload 14
      // 0ad: invokevirtual rip/breeze/client/RotationUtil9.buildString (J)Ljava/lang/String;
      // 0b0: astore 27
      // 0b2: sipush 15530
      // 0b5: aload 4
      // 0b7: lload 12
      // 0b9: invokevirtual rip/breeze/client/RotationUtil9.calculate_8 (J)I
      // 0bc: istore 28
      // 0be: ldc2_w 2084876356506142442
      // 0c1: lload 5
      // 0c3: lxor
      // 0c4: invokestatic rip/breeze/client/Util140.buildString_2 (IJ)Ljava/lang/String;
      // 0c7: aload 27
      // 0c9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0cc: iload 3
      // 0cd: ifgt 0f1
      // 0d0: ifeq 0e0
      // 0d3: iload 28
      // 0d5: istore 21
      // 0d7: aload 20
      // 0d9: iload 3
      // 0da: ifgt 1b1
      // 0dd: ifnull 1af
      // 0e0: sipush 19313
      // 0e3: ldc2_w 7749743167157973306
      // 0e6: lload 5
      // 0e8: lxor
      // 0e9: invokestatic rip/breeze/client/Util140.buildString_2 (IJ)Ljava/lang/String;
      // 0ec: aload 27
      // 0ee: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f1: iload 2
      // 0f2: ifle 11d
      // 0f5: ifeq 10c
      // 0f8: goto 0ff
      // 0fb: invokestatic rip/breeze/client/Util140.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 0fe: athrow
      // 0ff: iload 28
      // 101: istore 22
      // 103: aload 20
      // 105: iload 1
      // 106: ifle 1b1
      // 109: ifnull 1af
      // 10c: sipush 7683
      // 10f: ldc2_w 2496918825604179017
      // 112: lload 5
      // 114: lxor
      // 115: invokestatic rip/breeze/client/Util140.buildString_2 (IJ)Ljava/lang/String;
      // 118: aload 27
      // 11a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 11d: iload 2
      // 11e: iflt 149
      // 121: ifeq 138
      // 124: goto 12b
      // 127: invokestatic rip/breeze/client/Util140.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 12a: athrow
      // 12b: iload 28
      // 12d: istore 23
      // 12f: aload 20
      // 131: iload 3
      // 132: ifgt 1b1
      // 135: ifnull 1af
      // 138: sipush 5675
      // 13b: ldc2_w 4591188739167382634
      // 13e: lload 5
      // 140: lxor
      // 141: invokestatic rip/breeze/client/Util140.buildString_2 (IJ)Ljava/lang/String;
      // 144: aload 27
      // 146: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 149: iload 2
      // 14a: iflt 175
      // 14d: ifeq 164
      // 150: goto 157
      // 153: invokestatic rip/breeze/client/Util140.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 156: athrow
      // 157: iload 28
      // 159: istore 24
      // 15b: aload 20
      // 15d: iload 3
      // 15e: ifge 1b1
      // 161: ifnull 1af
      // 164: sipush 1172
      // 167: ldc2_w 6862823441559846620
      // 16a: lload 5
      // 16c: lxor
      // 16d: invokestatic rip/breeze/client/Util140.buildString_2 (IJ)Ljava/lang/String;
      // 170: aload 27
      // 172: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 175: iload 1
      // 176: ifle 1a1
      // 179: ifeq 190
      // 17c: goto 183
      // 17f: invokestatic rip/breeze/client/Util140.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 182: athrow
      // 183: iload 28
      // 185: istore 25
      // 187: aload 20
      // 189: iload 3
      // 18a: ifgt 1b1
      // 18d: ifnull 1af
      // 190: sipush 20739
      // 193: ldc2_w 4373303488474262350
      // 196: lload 5
      // 198: lxor
      // 199: invokestatic rip/breeze/client/Util140.buildString_2 (IJ)Ljava/lang/String;
      // 19c: aload 27
      // 19e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a1: ifeq 1af
      // 1a4: goto 1ab
      // 1a7: invokestatic rip/breeze/client/Util140.getIOException (Ljava/io/IOException;)Ljava/io/IOException;
      // 1aa: athrow
      // 1ab: iload 28
      // 1ad: istore 26
      // 1af: aload 20
      // 1b1: ifnull 09c
      // 1b4: aload 4
      // 1b6: iload 3
      // 1b7: ifge 0ab
      // 1ba: iload 9
      // 1bc: iload 10
      // 1be: i2c
      // 1bf: iload 11
      // 1c1: invokevirtual rip/breeze/client/RotationUtil9.calculate_3 (ICI)V
      // 1c4: new java/util/GregorianCalendar
      // 1c7: dup
      // 1c8: iload 21
      // 1ca: iload 22
      // 1cc: iload 23
      // 1ce: iload 24
      // 1d0: iload 25
      // 1d2: iload 26
      // 1d4: invokespecial java/util/GregorianCalendar.<init> (IIIIII)V
      // 1d7: areturn
      // try (68 -> 78): 78 java/io/IOException
      // try (120 -> 134): 135 java/io/IOException
      // try (139 -> 153): 154 java/io/IOException
      // try (158 -> 172): 173 java/io/IOException
      // try (177 -> 191): 192 java/io/IOException
      // try (196 -> 208): 209 java/io/IOException
   }

   public void processNullable(Util135 var1, Calendar var2, long var3) throws IOException {
      var3 = 8056527803523L ^ var3;
      long var5 = var3 ^ 21058487178188L;
      long var7 = var3 ^ 111625195386488L;
      long var9 = var3 ^ 45333492140404L;
      int var11 = (int)((var3 ^ 128597661615262L) >>> 48);
      long var12 = (var3 ^ 128597661615262L) << 16 >>> 16;
      long var10001 = var3 ^ 990660182226L;
      int var14 = (int)((var3 ^ 990660182226L) >>> 32);
      int var15 = (int)((var3 ^ 990660182226L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);

      try {
         if (var2 == null) {
            var1.getDataBuilder19_9(var7);
            return;
         }
      } catch (IOException var17) {
         throw getIOException(var17);
      }

      var1.getDataBuilder19_3((char)var11, var12);
      var1.getDataBuilder19_7(buildString_2(22979, 4949509243354649803L ^ var3), var5);
      var1.getDataBuilder19_12(var14, var2.get(1), var15, (short)var16);
      var1.getDataBuilder19_7(buildString_2(15158, 631722112285439538L ^ var3), var5);
      var1.getDataBuilder19_12(var14, var2.get(2), var15, (short)var16);
      var1.getDataBuilder19_7(buildString_2(11040, 2195792382812120613L ^ var3), var5);
      var1.getDataBuilder19_12(var14, var2.get(5), var15, (short)var16);
      var1.getDataBuilder19_7(buildString_2(20859, 7577108518472260721L ^ var3), var5);
      var1.getDataBuilder19_12(var14, var2.get(11), var15, (short)var16);
      var1.getDataBuilder19_7(buildString_2(18057, 193889352488356736L ^ var3), var5);
      var1.getDataBuilder19_12(var14, var2.get(12), var15, (short)var16);
      var1.getDataBuilder19_7(buildString_2(6269, 2892783517914125682L ^ var3), var5);
      var1.getDataBuilder19_12(var14, var2.get(13), var15, (short)var16);
      var1.getDataBuilder19_4(var9);
   }

   static {
      long var0 = 16719549635689L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[12];
      int var5 = 0;
      String var6 = "¦ªÓ¹Èlö\u0007q¥\"AD`\u0018¹\u0018\u0006\u007fAáxV¶\u0095©ëV!oî\u0092\u0002Õ\u008e\u0005Ø:\u000e^ß\u0010SÄÉ§N\u0088\u0006ÕDV\u00900BZ\u009eM\u0010²\u0086åü\u0085\u009eX+f\u0090\u0098è\u0084þ\u008bË\u0010u\u0019¹.V\u0019\u0093\u0085MÕ\u0097[s¢1§\u0010û»Ø&Î¨ª\u0092uo\u009aÔù\u009f\u0085\u008f\u0010ÔÃÖ\u0093\u009d\u008dËÒ\b\u00121hÛ\u009cRk 5¡\u0010\u001d\u00ad|Þ\u008bÃ\u0007¤\u008b\u008a\u009aª¶Ï¥}¼[\u0018ì_ b×4Ãé\f1 Ot_;ÞÁY\u0082Óo\u0010\u0002b\u009dË\u0014ãR-¯\u001ee\u00031óô\u0088×2Â8¿\u0010!\u0007ÜªR\b.Î7yWÙ_ª\u000eX";
      int var7 = "¦ªÓ¹Èlö\u0007q¥\"AD`\u0018¹\u0018\u0006\u007fAáxV¶\u0095©ëV!oî\u0092\u0002Õ\u008e\u0005Ø:\u000e^ß\u0010SÄÉ§N\u0088\u0006ÕDV\u00900BZ\u009eM\u0010²\u0086åü\u0085\u009eX+f\u0090\u0098è\u0084þ\u008bË\u0010u\u0019¹.V\u0019\u0093\u0085MÕ\u0097[s¢1§\u0010û»Ø&Î¨ª\u0092uo\u009aÔù\u009f\u0085\u008f\u0010ÔÃÖ\u0093\u009d\u008dËÒ\b\u00121hÛ\u009cRk 5¡\u0010\u001d\u00ad|Þ\u008bÃ\u0007¤\u008b\u008a\u009aª¶Ï¥}¼[\u0018ì_ b×4Ãé\f1 Ot_;ÞÁY\u0082Óo\u0010\u0002b\u009dË\u0014ãR-¯\u001ee\u00031óô\u0088×2Â8¿\u0010!\u0007ÜªR\b.Î7yWÙ_ª\u000eX"
         .length();
      char var8 = 16;
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
                     CONST_D = new String[12];
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

                  var6 = "0\u008e\rí\u008f\u0088c\u0090êFrò]\t{\rï\u0088}eB\u0088\u0014\u0080+Ïç\u008d\\hú\u0091\u0010 ~h<ü¦TÊÚ\u0096Ã\u0013\u0098\u0089\u0011w";
                  var7 = "0\u008e\rí\u008f\u0088c\u0090êFrò]\t{\rï\u0088}eB\u0088\u0014\u0080+Ïç\u008d\\hú\u0091\u0010 ~h<ü¦TÊÚ\u0096Ã\u0013\u0098\u0089\u0011w"
                     .length();
                  var8 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static IOException getIOException(IOException var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20236;
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
            throw new RuntimeException("rip/breeze/client/bD", var10);
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
