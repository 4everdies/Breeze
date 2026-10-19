package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum AimYawMode2 {
   TOP,
   CENTER,
   BOTTOM;

   private static final AimYawMode2[] CONST_A;
   private static LicenseState[] arr_b;

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = StringDecryptor.getIBreezeInterface3(7714989970346732713L, -1862308534152468975L, MethodHandles.lookup().lookupClass())
            .decryptKey(275877897100864L)
         ^ 95633925704118L;
      if (values() != null) {
         initialize(new LicenseState[1]);
      }

      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "É®\u0094\u001f¬nk\u009e\b\n\u0093ÅÑµb½®\b\u0015\u00ad8\u0014}\u0085]Ñ";
      int var7 = "É®\u0094\u001f¬nk\u009e\b\n\u0093ÅÑµb½®\b\u0015\u00ad8\u0014}\u0085]Ñ".length();
      char var8 = '\b';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            TOP = new AimYawMode2();
            CENTER = new AimYawMode2();
            BOTTOM = new AimYawMode2();
            CONST_A = new AimYawMode2[]{TOP, CENTER, BOTTOM};
            return;
         }

         var8 = var6.charAt(var9);
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
