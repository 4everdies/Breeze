package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum RotationUtil1_x {
   POPULAR,
   HIGHEST_RATED,
   NEWEST,
   OFFICIAL,
   SAVED,
   PERSONAL;

   final String string_a;
   final String string_b;
   private static final RotationUtil1_x[] CONST_C;
   private static LicenseState[] arr_d;

   RotationUtil1_x(String var3, String var4) {
      this.string_a = var3;
      this.string_b = var4;
   }

   public String getString_a() {
      return this.string_a;
   }

   public String getString_b() {
      return this.string_b;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = StringDecryptor.getIBreezeInterface3(-1411990826257519888L, -9000705059696828212L, MethodHandles.lookup().lookupClass())
            .decryptKey(168973162052199L)
         ^ 57323552871863L;
      if (values() != null) {
         initialize(new LicenseState[3]);
      }

      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[18];
      int var5 = 0;
      String var6 = "nQÇ\u0016\u008b>S{\bnQÇ\u0016\u008b>S{\u0010¡çÖÝW\u0018;Yìígw\u009cWÓj\b@YßcÂ°À3\u0010q>;ï¼\u0096S¾+6°8ÍOhn\u0010q>;ï¼\u0096S¾+6°8ÍOhn\b\u0013b=  uì\u0000\b\u0013b=  uì\u0000\u0010d\nÁ_aõ8W¬?è\u0090(\u0092Û\u001f\u0010¼îãåûð±ÆNõ#\u0098f@¾º\u0010d\nÁ_aõ8W¬?è\u0090(\u0092Û\u001f\u0010Ù¯Ñè²:Æl1\u00952¦7\u0000ß\u0081\bD3a\u0007\u0080Ñ\u0084È\u0010WeLßÅÌ\u0093Ìâ\u000b\\YËpc[\b\u008eÃëùg6ê\u0090\u0010¡çÖÝW\u0018;Yìígw\u009cWÓj";
      int var7 = "nQÇ\u0016\u008b>S{\bnQÇ\u0016\u008b>S{\u0010¡çÖÝW\u0018;Yìígw\u009cWÓj\b@YßcÂ°À3\u0010q>;ï¼\u0096S¾+6°8ÍOhn\u0010q>;ï¼\u0096S¾+6°8ÍOhn\b\u0013b=  uì\u0000\b\u0013b=  uì\u0000\u0010d\nÁ_aõ8W¬?è\u0090(\u0092Û\u001f\u0010¼îãåûð±ÆNõ#\u0098f@¾º\u0010d\nÁ_aõ8W¬?è\u0090(\u0092Û\u001f\u0010Ù¯Ñè²:Æl1\u00952¦7\u0000ß\u0081\bD3a\u0007\u0080Ñ\u0084È\u0010WeLßÅÌ\u0093Ìâ\u000b\\YËpc[\b\u008eÃëùg6ê\u0090\u0010¡çÖÝW\u0018;Yìígw\u009cWÓj"
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
                     POPULAR = new RotationUtil1_x(var4[12], var4[16]);
                     HIGHEST_RATED = new RotationUtil1_x(var4[9], var4[8]);
                     NEWEST = new RotationUtil1_x(var4[3], var4[0]);
                     OFFICIAL = new RotationUtil1_x(var4[13], var4[4]);
                     SAVED = new RotationUtil1_x(var4[14], var4[7]);
                     PERSONAL = new RotationUtil1_x(var4[11], var4[2]);
                     CONST_C = new RotationUtil1_x[]{POPULAR, HIGHEST_RATED, NEWEST, OFFICIAL, SAVED, PERSONAL};
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

                  var6 = "ñ\u001aÚP¸a\u0080ü\bñ\u001aÚP¸a\u0080ü";
                  var7 = "ñ\u001aÚP¸a\u0080ü\bñ\u001aÚP¸a\u0080ü".length();
                  var8 = '\b';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(LicenseState[] var0) {
      arr_d = var0;
   }

   public static LicenseState[] values() {
      return arr_d;
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
