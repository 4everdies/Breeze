package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum ModuleCategory {
   COMBAT,
   MOVEMENT,
   MISC,
   VISUAL,
   HUD,
   FAVORITE,
   ALL;

   public final String name;
   private static final ModuleCategory[] CONST_A;
   private static LicenseState[] arr_b;

   ModuleCategory(String var3) {
      this.name = var3;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = StringDecryptor.getIBreezeInterface3(6069907456650962518L, 7765657313443005379L, MethodHandles.lookup().lookupClass())
            .decryptKey(253720022206611L)
         ^ 19799382857233L;
      if (values() != null) {
         initialize(new LicenseState[2]);
      }

      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[14];
      int var5 = 0;
      String var6 = "l\u0085\u008að\u0084éôâ\b\u0099ý*\u001cYÈ\u001c±\b5¤ee¥áj±\u0010Nz{é-À¶Ð¢Ég(^\u0003õ\u009c\u0010\u0004|~\u0081\u009cG5ú\u0002Aó\b\u0087\u009f[\n\u0010ak·\u0013£Q\u009b^¾o\u0015ÓÄÙ.6\u0010\u0000=^<\u0086ò£\tý-¸Ò×(\u0085Ý\bÛÞ\u0010-vª\u0091:\byW\u0019×\u0000ðÊf\bÝín\u00adzÝ>×\b]o\u0016_\u0017ùA\u0014\bÀ;GdNØë.";
      int var7 = "l\u0085\u008að\u0084éôâ\b\u0099ý*\u001cYÈ\u001c±\b5¤ee¥áj±\u0010Nz{é-À¶Ð¢Ég(^\u0003õ\u009c\u0010\u0004|~\u0081\u009cG5ú\u0002Aó\b\u0087\u009f[\n\u0010ak·\u0013£Q\u009b^¾o\u0015ÓÄÙ.6\u0010\u0000=^<\u0086ò£\tý-¸Ò×(\u0085Ý\bÛÞ\u0010-vª\u0091:\byW\u0019×\u0000ðÊf\bÝín\u00adzÝ>×\b]o\u0016_\u0017ùA\u0014\bÀ;GdNØë."
         .length();
      char var8 = '\b';
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
                     COMBAT = new ModuleCategory(var4[2]);
                     MOVEMENT = new ModuleCategory(var4[4]);
                     MISC = new ModuleCategory(var4[8]);
                     VISUAL = new ModuleCategory(var4[1]);
                     HUD = new ModuleCategory(var4[0]);
                     FAVORITE = new ModuleCategory(var4[3]);
                     ALL = new ModuleCategory(var4[10]);
                     CONST_A = new ModuleCategory[]{COMBAT, MOVEMENT, MISC, VISUAL, HUD, FAVORITE, ALL};
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

                  var6 = "{WK£\u0014\u008aMQ\bl\u0085\u008að\u0084éôâ";
                  var7 = "{WK£\u0014\u008aMQ\bl\u0085\u008að\u0084éôâ".length();
                  var8 = '\b';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(LicenseState[] var0) {
      arr_b = var0;
   }

   public static LicenseState[] values() {
      return arr_b;
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
