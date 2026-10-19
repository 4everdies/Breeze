package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

enum ClientMode2 {
   VANILLA,
   GRIM,
   TELLY,
   NINJA,
   BREEZILY,
   WATCHDOG;

   public RotationUtil1_x customRotation;
   public boolean allowTower;
   private static final ClientMode2[] CONST_A;

   ClientMode2(RotationUtil1_x var3, boolean var4) {
      this.customRotation = var3;
      this.allowTower = var4;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = StringDecryptor.getIBreezeInterface3(257924293326947559L, 8419073433754239977L, MethodHandles.lookup().lookupClass())
            .decryptKey(86540869993916L)
         ^ 26935378134676L;
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
      String var6 = "â¼äÙ\u001d\u0083\u00819\bµ=Ø=¶nÏ\bö\n[P^\u0013\u0083\u00ad\bJ\bã\u0005X\u0094\u000b&\u00105¦\u0001¹\\N\u0003\u0013\u0015f\u0010´ò\u0087\u009ff";
      int var7 = "â¼äÙ\u001d\u0083\u00819\bµ=Ø=¶nÏ\bö\n[P^\u0013\u0083\u00ad\bJ\bã\u0005X\u0094\u000b&\u00105¦\u0001¹\\N\u0003\u0013\u0015f\u0010´ò\u0087\u009ff"
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
                     VANILLA = new ClientMode2(null, true);
                     GRIM = new ClientMode2(null, false);
                     TELLY = new ClientMode2(RotationUtil1_x.TELLY_ROTATION, false);
                     NINJA = new ClientMode2(RotationUtil1_x.NINJA_ROTATION, false);
                     BREEZILY = new ClientMode2(RotationUtil1_x.BREEZILY_ROTATION, false);
                     WATCHDOG = new ClientMode2(RotationUtil1_x.TELLY_ROTATION, false);
                     CONST_A = new ClientMode2[]{VANILLA, GRIM, TELLY, NINJA, BREEZILY, WATCHDOG};
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

                  var6 = "ÏòÛÓy÷\u009d»\bÅFÈ#\u009dj\u001a2";
                  var7 = "ÏòÛÓy÷\u009d»\bÅFÈ#\u009dj\u001a2".length();
                  var8 = '\b';
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
