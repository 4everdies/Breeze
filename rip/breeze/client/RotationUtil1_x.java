package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

enum RotationUtil1_x {
   SIMPLE_ROTATION,
   STRAFE_ROTATION,
   REVERSE_ROTATION,
   TELLY_ROTATION,
   NINJA_ROTATION,
   BREEZILY_ROTATION;

   private static final RotationUtil1_x[] CONST_A;

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = StringDecryptor.getIBreezeInterface3(7409795665188621039L, -4433259909275882007L, MethodHandles.lookup().lookupClass())
            .decryptKey(208214291637072L)
         ^ 32283798273474L;
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
      String var6 = "\u0085R=V+Ï¢|ß[\u000e«\u009eß\u001aÿ\u0018wØI\u0086\u0088h\u008f]=áþ[å9«½2=\nÏ\u008d\u001d\"e\u0010=´_ëô\\\u00882tY9$\u0083 tÒ\u0010nÎ\u0099µsÒ\u0094\u0092[¿d\u0006D\u0083áo";
      int var7 = "\u0085R=V+Ï¢|ß[\u000e«\u009eß\u001aÿ\u0018wØI\u0086\u0088h\u008f]=áþ[å9«½2=\nÏ\u008d\u001d\"e\u0010=´_ëô\\\u00882tY9$\u0083 tÒ\u0010nÎ\u0099µsÒ\u0094\u0092[¿d\u0006D\u0083áo"
         .length();
      char var8 = 16;
      int var12 = -1;

      label28:
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
                     SIMPLE_ROTATION = new RotationUtil1_x();
                     STRAFE_ROTATION = new RotationUtil1_x();
                     REVERSE_ROTATION = new RotationUtil1_x();
                     TELLY_ROTATION = new RotationUtil1_x();
                     NINJA_ROTATION = new RotationUtil1_x();
                     BREEZILY_ROTATION = new RotationUtil1_x();
                     CONST_A = new RotationUtil1_x[]{SIMPLE_ROTATION, STRAFE_ROTATION, REVERSE_ROTATION, TELLY_ROTATION, NINJA_ROTATION, BREEZILY_ROTATION};
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label28;
                  }

                  var6 = "ÑýÑB_\\\u0010f\r\u0019\u0000\u001eË\u0089kÐyLtSx9\u008fy\u0010ÉGu\u008f\u0089üH9\u0095\u009f2\u0010³\u009eýº";
                  var7 = "ÑýÑB_\\\u0010f\r\u0019\u0000\u001eË\u0089kÐyLtSx9\u008fy\u0010ÉGu\u008f\u0089üH9\u0095\u009f2\u0010³\u009eýº".length();
                  var8 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
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
