package rip.breeze.classtransform.annotations;

import java.lang.invoke.MethodHandles;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.inject.Util138;
import rip.breeze.inject.ջ;

public enum Mapping {
   NONE,
   LOCAL,
   FORGE_MOD,
   FORGE,
   LUNAR,
   VANILLA,
   NEWGEN_INJECTABLE;


   @Override
   public String toString() {
      return this.name().toLowerCase(Locale.ROOT);
   }

   public static Mapping fromString(long var0, String var2) {
      var0 = encKey_a ^ var0;
      int var3 = CTarget$Shift.getValue_2();
      Mapping var10000 = valueOf(var2.toUpperCase(Locale.ROOT).replace("-", "_"));
      if (var3 == 0) {
         boolean var10001 = ջ.method_013();
         if (var0 >= 0L) {
            var10001 = !var10001;
         }

         ջ.method_011(var10001);
      }

      return var10000;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = 92476712778213L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[7];
      int var5 = 0;
      String var6 = "\u009f¡Á¿\u0004h(\u009a\u0010s\u0014ôa$NmËD?\u0019õ¿\u00ad\u008e\u0098\b×\u009bB!\u001aR\u0085\u0012\bÐOâ\u0096¬}(\u0080\b\u009fT\rÿøU\u007fÉ";
      int var7 = "\u009f¡Á¿\u0004h(\u009a\u0010s\u0014ôa$NmËD?\u0019õ¿\u00ad\u008e\u0098\b×\u009bB!\u001aR\u0085\u0012\bÐOâ\u0096¬}(\u0080\b\u009fT\rÿøU\u007fÉ"
         .length();
      char var8 = '\b';
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
                     NONE = new Mapping();
                     LOCAL = new Mapping();
                     FORGE_MOD = new Mapping();
                     FORGE = new Mapping();
                     LUNAR = new Mapping();
                     VANILLA = new Mapping();
                     NEWGEN_INJECTABLE = new Mapping();
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

                  var6 = "4¸Ë\u0082\u0018·*;\u0018\u0090#\u00805\u0081qMÃ<\n\u000bóþ+['YÂ¼YºÂ°w";
                  var7 = "4¸Ë\u0082\u0018·*;\u0018\u0090#\u00805\u0081qMÃ<\n\u000bóþ+['YÂ¼YºÂ°w".length();
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
