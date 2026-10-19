package rip.breeze.client;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

public enum EnumType6 implements IMarker {
   IDENTITY,
   UPPER_CAMEL_CASE,
   UPPER_CAMEL_CASE_WITH_SPACES,
   LOWER_CASE_WITH_UNDERSCORES,
   LOWER_CASE_WITH_DASHES;

   private static final EnumType6[] CONST_A;
   private static boolean fieldBool_b;

   EnumType6() {
   }

   EnumType6(BreezeEnum20 var3) {
      this();
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = StringDecryptor.getIBreezeInterface3(-5778538017731017507L, -612895820306592883L, null).decryptKey(103395505371570L) ^ 35194532386701L;
      if (isValid()) {
         toggle(true);
      }

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
      String var6 = "\u0016>1\u0018åÉXm(>r?ô:\u0003ü(ò£öðøT¤%,3ÅÏ\u00125§\u0018£\u0092³Qº`\u000eçþ-Í¢<K|\u0087ÿq´\u0019ÒÊÐ\u009e £\u0092³Qº`\u000eçþ-Í¢<K|\u0087\u0016i¼Ou\u0096Â½w²a\u000fs±Q\u0003";
      int var7 = "\u0016>1\u0018åÉXm(>r?ô:\u0003ü(ò£öðøT¤%,3ÅÏ\u00125§\u0018£\u0092³Qº`\u000eçþ-Í¢<K|\u0087ÿq´\u0019ÒÊÐ\u009e £\u0092³Qº`\u000eçþ-Í¢<K|\u0087\u0016i¼Ou\u0096Â½w²a\u000fs±Q\u0003"
         .length();
      char var8 = ' ';
      int var12 = -1;

      label32:
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
                     IDENTITY = new BreezeEnum20();
                     UPPER_CAMEL_CASE = new BreezeEnum21();
                     UPPER_CAMEL_CASE_WITH_SPACES = new BreezeEnum22();
                     LOWER_CASE_WITH_UNDERSCORES = new BreezeEnum23();
                     LOWER_CASE_WITH_DASHES = new BreezeEnum24();
                     CONST_A = new EnumType6[]{IDENTITY, UPPER_CAMEL_CASE, UPPER_CAMEL_CASE_WITH_SPACES, LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES};
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label32;
                  }

                  var6 = "ÿ\u0086\u008c{5IÀCb>\u0017±kp\u000b^\u0018\u0016>1\u0018åÉXm(>r?ô:\u0003ü\u0084ù\u001d\u0080\u001f°9c";
                  var7 = "ÿ\u0086\u008c{5IÀCb>\u0017±kp\u000b^\u0018\u0016>1\u0018åÉXm(>r?ô:\u0003ü\u0084ù\u001d\u0080\u001f°9c".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
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
      return !var0;
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
