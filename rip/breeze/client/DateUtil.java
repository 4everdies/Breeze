package rip.breeze.client;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

final class DateUtil extends Util64<Date> {
   private final Class<? extends Date> class_a;
   private final DateFormat dateFormat_c;
   private final DateFormat dateFormat_d;
   private static final String[] CONST_F;
   private static final String[] CONST_G;
   private static final Map CONST_H = new HashMap(13);

   DateUtil(int var1, Class var2, char var3, String var4, char var5) {
      long var6 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ 133210673694378L;
      int var8 = (int)((var6 ^ 49814070971739L) >>> 32);
      int var9 = (int)((var6 ^ 49814070971739L) << 32 >>> 32);
      SimpleDateFormat var10002 = new SimpleDateFormat(var4, Locale.US);
      SimpleDateFormat var10 = new SimpleDateFormat(var4);
      SimpleDateFormat var11 = var10002;
      this(var2, var8, var9, var11, var10);
   }

   public DateUtil(Class var1, int var2, long var3, int var5) {
      var3 = 133210673694378L ^ var3;
      int var6 = (int)((var3 ^ 76406539394092L) >>> 32);
      int var7 = (int)((var3 ^ 76406539394092L) << 32 >>> 32);
      this(var1, var6, var7, DateFormat.getDateTimeInstance(var2, var5, Locale.US), DateFormat.getDateTimeInstance(var2, var5));
   }

   DateUtil(Class param1, int param2, int param3, DateFormat param4, DateFormat param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 32
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: getstatic rip/breeze/client/DateUtil.133210673694378L J
      // 11: lxor
      // 12: lstore 6
      // 14: aload 0
      // 15: invokespecial rip/breeze/client/Util64.<init> ()V
      // 18: aload 1
      // 19: ldc java/util/Date
      // 1b: if_acmpeq 9a
      // 1e: aload 1
      // 1f: ldc java/sql/Date
      // 21: iload 3
      // 22: ifgt 2b
      // 25: if_acmpeq 9a
      // 28: aload 1
      // 29: ldc java/sql/Timestamp
      // 2b: if_acmpeq 9a
      // 2e: goto 35
      // 31: invokestatic rip/breeze/client/DateUtil.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: new java/lang/IllegalArgumentException
      // 38: dup
      // 39: new java/lang/StringBuilder
      // 3c: dup
      // 3d: invokespecial java/lang/StringBuilder.<init> ()V
      // 40: sipush 18776
      // 43: ldc2_w 4337745698499178750
      // 46: lload 6
      // 48: lxor
      // 49: invokestatic rip/breeze/client/DateUtil.buildString_2 (IJ)Ljava/lang/String;
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: ldc java/util/Date
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 54: sipush 16752
      // 57: ldc2_w 5289039409195235543
      // 5a: lload 6
      // 5c: lxor
      // 5d: invokestatic rip/breeze/client/DateUtil.buildString_2 (IJ)Ljava/lang/String;
      // 60: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 63: ldc java/sql/Timestamp
      // 65: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 68: sipush 19858
      // 6b: ldc2_w 8648288072902325299
      // 6e: lload 6
      // 70: lxor
      // 71: invokestatic rip/breeze/client/DateUtil.buildString_2 (IJ)Ljava/lang/String;
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: ldc java/sql/Date
      // 79: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7c: sipush 22683
      // 7f: ldc2_w 6512922137794650431
      // 82: lload 6
      // 84: lxor
      // 85: invokestatic rip/breeze/client/DateUtil.buildString_2 (IJ)Ljava/lang/String;
      // 88: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8b: aload 1
      // 8c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 92: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 95: athrow
      // 96: invokestatic rip/breeze/client/DateUtil.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 99: athrow
      // 9a: aload 0
      // 9b: aload 1
      // 9c: putfield rip/breeze/client/DateUtil.class_a Ljava/lang/Class;
      // 9f: aload 0
      // a0: aload 4
      // a2: putfield rip/breeze/client/DateUtil.dateFormat_c Ljava/text/DateFormat;
      // a5: aload 0
      // a6: aload 5
      // a8: putfield rip/breeze/client/DateUtil.dateFormat_d Ljava/text/DateFormat;
      // ab: return
      // try (19 -> 27): 28 java/lang/IllegalArgumentException
      // try (24 -> 70): 70 java/lang/IllegalArgumentException
   }

   public void processAll(long var1, Util135 var3, Date var4) throws IOException {
      var1 = 133210673694378L ^ var1;
      long var10001 = var1 ^ 136021196602686L;
      int var5 = (int)((var1 ^ 136021196602686L) >>> 56);
      int var6 = (int)((var1 ^ 136021196602686L) << 8 >>> 32);
      int var7 = (int)(var10001 << 40 >>> 40);
      synchronized (this.dateFormat_d) {
         String var9 = this.dateFormat_c.format(var4);
         var3.getDataBuilder19_8(var9, (byte)var5, var6, var7);
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public Date getDate(long var1, RotationUtil9 var3) throws IOException {
      var1 = 133210673694378L ^ var1;
      long var10001 = var1 ^ 76920666887049L;
      int var4 = (int)((var1 ^ 76920666887049L) >>> 48);
      int var5 = (int)((var1 ^ 76920666887049L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var1 ^ 36554202601033L;
      long var9 = var1 ^ 21244621695564L;

      try {
         if (var3.getEnum10Val(var7) != EnumType1.STRING) {
            throw new BreezeException2(buildString_2(11455, 4274086933414619690L ^ var1));
         }
      } catch (IOException var17) {
         throw getException(var17);
      }

      Date var11 = this.getDate_2(var3.buildString_2((short)var4, (short)var5, var6), var9);

      Class var10000;
      label56: {
         try {
            var10000 = this.class_a;
            var19 = Date.class;
            if (var1 < 0L) {
               break label56;
            }

            if (this.class_a == Date.class) {
               return var11;
            }
         } catch (IOException var16) {
            throw getException(var16);
         }

         try {
            var10000 = this.class_a;
            var19 = Timestamp.class;
         } catch (IOException var13) {
            throw getException(var13);
         }
      }

      label46: {
         try {
            if (var1 < 0L) {
               break label46;
            }

            if (var10000 == var19) {
               return new Timestamp(var11.getTime());
            }
         } catch (IOException var15) {
            throw getException(var15);
         }

         try {
            var10000 = this.class_a;
            var19 = java.sql.Date.class;
         } catch (IOException var12) {
            throw getException(var12);
         }
      }

      try {
         if (var10000 == var19) {
            return new java.sql.Date(var11.getTime());
         }
      } catch (IOException var14) {
         throw getException(var14);
      }

      throw new AssertionError();
   }

   private Date getDate_2(String var1, long var2) {
      var2 = 133210673694378L ^ var2;
      long var4 = var2 ^ 126190256377406L;
      synchronized (this.dateFormat_d) {
         Date var15;
         try {
            var15 = this.dateFormat_d.parse(var1);
         } catch (ParseException var11) {
            try {
               var15 = this.dateFormat_c.parse(var1);
            } catch (ParseException var10) {
               try {
                  var15 = ck.a(var4, var1, new ParsePosition(0));
               } catch (ParseException var9) {
                  throw new AuthException2(var1, var9);
               }

               return var15;
            }

            return var15;
         }

         return var15;
      }
   }

   @Override
   public String toString() {
      long var1 = 38161447207328L;
      StringBuilder var3 = new StringBuilder();
      var3.append(buildString_2(19438, 2116617047590174642L ^ var1));
      var3.append('(').append(this.dateFormat_d.getClass().getSimpleName()).append(')');
      return var3.toString();
   }

   static {
      long var0 = 67670291410806L;
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
      String var6 = "õã/û¼ô1\u0000ÿl.Óÿá\u008c\u0093\u0098ó8x\u0018\u001fn\u0002ì\u000fÎjM\u007fë`$\u0088èêKdÒ\u0016²ÜÇ\u0086îI\u001b\u0011 ì»ÜáË9¡þ´\u0003\u0082Ó\u000b\u008az ð{'Ê!ç\u000eª*Þ/\u009d0{\u0002ÞÕìr\u0019%\u000b=Úe\u0014\u0005ë¯ÿýÐ\u0010ò¡\u008eB\u0084§Þ/^Æ°\u0018!\u0016Óè0\u0085·§\u0092À3ö\u000b\r&\u0087\u009fz\u008b\u0085\u0011/;s\u0019\u00880Ì\u000e\u0088\u008d\u008bå:ìð\u008bÈ\\®)\u0015\u0010ºg_4Ã+\u0099Ì\u009eÿ";
      int var7 = "õã/û¼ô1\u0000ÿl.Óÿá\u008c\u0093\u0098ó8x\u0018\u001fn\u0002ì\u000fÎjM\u007fë`$\u0088èêKdÒ\u0016²ÜÇ\u0086îI\u001b\u0011 ì»ÜáË9¡þ´\u0003\u0082Ó\u000b\u008az ð{'Ê!ç\u000eª*Þ/\u009d0{\u0002ÞÕìr\u0019%\u000b=Úe\u0014\u0005ë¯ÿýÐ\u0010ò¡\u008eB\u0084§Þ/^Æ°\u0018!\u0016Óè0\u0085·§\u0092À3ö\u000b\r&\u0087\u009fz\u008b\u0085\u0011/;s\u0019\u00880Ì\u000e\u0088\u008d\u008bå:ìð\u008bÈ\\®)\u0015\u0010ºg_4Ã+\u0099Ì\u009eÿ"
         .length();
      char var8 = '@';
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
                     CONST_F = var4;
                     CONST_G = new String[6];
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

                  var6 = "Ô\fí¯\f+7³¿ÊÝ¯ì\u008d¶J(\u009a\u008b¯\u009f&ø\f\u007f\fq\u001f\u000býú\"\u000b7K¼8©÷^\u009b!!Mz+¨2j\u0017ô\u009f\b¿¯ä_";
                  var7 = "Ô\fí¯\f+7³¿ÊÝ¯ì\u008d¶J(\u009a\u008b¯\u009f&ø\f\u007f\fq\u001f\u000býú\"\u000b7K¼8©÷^\u009b!!Mz+¨2j\u0017ô\u009f\b¿¯ä_".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30201;
      if (CONST_G[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_H.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_H.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/a9", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_F[var3].getBytes("ISO-8859-1");
         CONST_G[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_G[var3];
   }
}
