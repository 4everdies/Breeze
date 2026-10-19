package rip.breeze.client;

import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

public final class Util139 {
   private static boolean fieldBool_b;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public PlayerUtil8 getDataBuilder2(String var1, long var2) throws AuthException2 {
      var2 = 122977455236817L ^ var2;
      long var4 = var2 ^ 58664542795583L;
      return this.getDataBuilder2_2(new StringReader(var1), var4);
   }

   public PlayerUtil8 getDataBuilder2_2(Reader param1, long param2) throws AuthException, AuthException2 {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/Util139.122977455236817L J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 5896734373582
      // 0b: lxor
      // 0c: lstore 4
      // 0e: dup2
      // 0f: ldc2_w 70233024316312
      // 12: lxor
      // 13: lstore 6
      // 15: dup2
      // 16: ldc2_w 48554758454270
      // 19: lxor
      // 1a: lstore 8
      // 1c: pop2
      // 1d: new rip/breeze/client/RotationUtil9
      // 20: dup
      // 21: lload 8
      // 23: aload 1
      // 24: invokespecial rip/breeze/client/RotationUtil9.<init> (JLjava/io/Reader;)V
      // 27: astore 10
      // 29: aload 0
      // 2a: lload 4
      // 2c: aload 10
      // 2e: invokevirtual rip/breeze/client/Util139.getDataBuilder2_3 (JLrip/breeze/client/RotationUtil9;)Lrip/breeze/client/PlayerUtil8;
      // 31: astore 11
      // 33: aload 11
      // 35: invokevirtual rip/breeze/client/PlayerUtil8.isValid_4 ()Z
      // 38: ifne 66
      // 3b: aload 10
      // 3d: lload 6
      // 3f: invokevirtual rip/breeze/client/RotationUtil9.getEnum10Val (J)Lrip/breeze/client/EnumType1;
      // 42: getstatic rip/breeze/client/EnumType1.END_DOCUMENT Lrip/breeze/client/EnumType1;
      // 45: if_acmpeq 66
      // 48: goto 4f
      // 4b: invokestatic rip/breeze/client/Util139.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: new rip/breeze/client/AuthException2
      // 52: dup
      // 53: sipush 24518
      // 56: ldc2_w 8403289748390974525
      // 59: lload 2
      // 5a: lxor
      // 5b: invokestatic rip/breeze/client/Util139.buildString_2 (IJ)Ljava/lang/String;
      // 5e: invokespecial rip/breeze/client/AuthException2.<init> (Ljava/lang/String;)V
      // 61: athrow
      // 62: invokestatic rip/breeze/client/Util139.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 11
      // 68: areturn
      // 69: astore 10
      // 6b: new rip/breeze/client/AuthException2
      // 6e: dup
      // 6f: aload 10
      // 71: invokespecial rip/breeze/client/AuthException2.<init> (Ljava/lang/Throwable;)V
      // 74: athrow
      // 75: astore 10
      // 77: new rip/breeze/client/AuthException
      // 7a: dup
      // 7b: aload 10
      // 7d: invokespecial rip/breeze/client/AuthException.<init> (Ljava/lang/Throwable;)V
      // 80: athrow
      // 81: astore 10
      // 83: new rip/breeze/client/AuthException2
      // 86: dup
      // 87: aload 10
      // 89: invokespecial rip/breeze/client/AuthException2.<init> (Ljava/lang/Throwable;)V
      // 8c: athrow
      // try (32 -> 49): 49 rip/breeze/client/BreezeException
      // try (29 -> 37): 38 rip/breeze/client/BreezeException
      // try (18 -> 52): 53 rip/breeze/client/BreezeException
      // try (18 -> 52): 59 java/io/IOException
      // try (18 -> 52): 65 java/lang/NumberFormatException
   }

   public PlayerUtil8 getDataBuilder2_3(long var1, RotationUtil9 var3) throws AuthException, AuthException2 {
      var1 = 122977455236817L ^ var1;
      long var4 = var1 ^ 32475898646805L;
      boolean var6 = var3.isBool_c();
      var3.setBool_c(true);

      try {
         return Util102.getDataBuilder2(var3, var4);
      } catch (StackOverflowError var12) {
         throw new BreezeException2(buildString_2(8084, 7472452588292949107L ^ var1) + var3 + buildString_2(30589, 270212232698801311L ^ var1), var12);
      } catch (OutOfMemoryError var13) {
         throw new BreezeException2(buildString_2(1571, 626615921260977605L ^ var1) + var3 + buildString_2(11154, 6870677029662748791L ^ var1), var13);
      } finally {
         var3.setBool_c(var6);
      }
   }

   public static void toggle(boolean var0) {
      fieldBool_b = var0;
   }

   public static boolean isValid() {
      return fieldBool_b;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid();

      try {
         return !var0;
      } catch (AuthException2 var1) {
         throw getException(var1);
      }
   }

   static {
      toggle(false);
      long var0 = 105211876958030L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[5];
      int var5 = 0;
      String var6 = "-Õ9\u00017\u0015Ó3\b\u0017\u000f¤!T\u0019W±d\u008b_SjNoñs¦¨%Ø´µò_\u0082/È±ØJ\u0093g\u001eýoW\u0096\u00010ÛV\u0003\u0004nµQä¹@MýDáo\u001b¢J\u009ef¸\u0096Æ\u00106áý\t\u001d\b\u001c\n\u0015}L¤!\u0003F\u0082Ô\tn´íÍm¢@Ô\u00ad*=\u001b\u0099¤\u0081üÆ\u0094aE\u0090\u008b||«æ\u008d¾9õ=;L§u\u0001\u0098´«ëÅ\u0093.ãs½\u001a\u008cyKF\f\u0010béêÖW\u0002$\u0007ùýå\n¹4á©B\u008a";
      int var7 = "-Õ9\u00017\u0015Ó3\b\u0017\u000f¤!T\u0019W±d\u008b_SjNoñs¦¨%Ø´µò_\u0082/È±ØJ\u0093g\u001eýoW\u0096\u00010ÛV\u0003\u0004nµQä¹@MýDáo\u001b¢J\u009ef¸\u0096Æ\u00106áý\t\u001d\b\u001c\n\u0015}L¤!\u0003F\u0082Ô\tn´íÍm¢@Ô\u00ad*=\u001b\u0099¤\u0081üÆ\u0094aE\u0090\u008b||«æ\u008d¾9õ=;L§u\u0001\u0098´«ëÅ\u0093.ãs½\u001a\u008cyKF\f\u0010béêÖW\u0002$\u0007ùýå\n¹4á©B\u008a"
         .length();
      char var8 = '0';
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
                     CONST_D = new String[5];
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

                  var6 = "nºêg¸xûñÂz+¨5^'ºÆÊøÍÍ»\u0097[E\u0018\u0082\u000eª`\u0002\u008b\u0018U/\t\u00adH\u009aÙA\u0004\u008d§³Ô\u000e\u0083\u0018Ù»Îj?¬´à";
                  var7 = "nºêg¸xûñÂz+¨5^'ºÆÊøÍÍ»\u0097[E\u0018\u0082\u000eª`\u0002\u008b\u0018U/\t\u00adH\u009aÙA\u0004\u008d§³Ô\u000e\u0083\u0018Ù»Îj?¬´à"
                     .length();
                  var8 = ' ';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11588;
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
            throw new RuntimeException("rip/breeze/client/a7", var10);
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
