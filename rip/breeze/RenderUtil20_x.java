package rip.breeze;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum RenderUtil20_x {
   PENDING,
   APPROVED,
   DENIED,
   PENDING_EDIT,
   EDIT_DENIED;

   private final String string_a;
   private final String string_b;
   private final Color color_c;

   RenderUtil20_x(String var3, String var4, Color var5) {
      this.string_a = var3;
      this.string_b = var4;
      this.color_c = var5;
   }

   public String getString_a() {
      return this.string_a;
   }

   public String getString_b() {
      return this.string_b;
   }

   public Color getColor_c() {
      return this.color_c;
   }

   public boolean isValid() {
      long var1 = 97583913791254L;
      return this == APPROVED || this == PENDING_EDIT || this == EDIT_DENIED;
   }

   public boolean isValid_2() {
      long var1 = 108489011392112L;
      return this == DENIED || this == EDIT_DENIED;
   }

   public boolean isValid_3() {
      long var1 = 105516352537262L;
      return this == PENDING_EDIT || this == EDIT_DENIED;
   }

   public static RenderUtil20_x getEnum5Val(String var0) {
      long var1 = 105217299988822L;
      int[] var3 = RenderUtil19_x.values();
      if (var0 == null) {
         return APPROVED;
      }

      for (RenderUtil20_x var7 : values()) {
         if (var7.string_a.equalsIgnoreCase(var0)) {
            return var7;
         }

         if (var3 != null) {
            break;
         }
      }

      return APPROVED;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = 63983558717762L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[15];
      int var5 = 0;
      String var6 = "\\Q?\u0017¬píÿÜÛñO'rgó\u0010ê^;u»Ò\u0018\u0091·\u0091\u00910üT\u009f+\b´2ºy²g\u0006á\u0010dÎÏ.6âp7\u0081þ`\u0098Ï@=!\u0010KR\\£~3N\u009c\u000f«I\rþCÕY\bgÅZ\u009cý²\u0086P\u0010¶i¸éTõ«ÒW\u001d\\5¦ä,k\b\u0016\u008aÙÐºä\u0096\u009e\u0010RmÑl=4\u0082ÿo\u008cûj.pÎV\b®pLod¢E\u0097\u0010Þ}e \u00978¡Ùê \u008aïÐo$ó\u0010\u0012&\u001eº±\nBñ\u0083·\u007f\u0000¹Ì; \bÁ4I\u00018jï²";
      int var7 = "\\Q?\u0017¬píÿÜÛñO'rgó\u0010ê^;u»Ò\u0018\u0091·\u0091\u00910üT\u009f+\b´2ºy²g\u0006á\u0010dÎÏ.6âp7\u0081þ`\u0098Ï@=!\u0010KR\\£~3N\u009c\u000f«I\rþCÕY\bgÅZ\u009cý²\u0086P\u0010¶i¸éTõ«ÒW\u001d\\5¦ä,k\b\u0016\u008aÙÐºä\u0096\u009e\u0010RmÑl=4\u0082ÿo\u008cûj.pÎV\b®pLod¢E\u0097\u0010Þ}e \u00978¡Ùê \u008aïÐo$ó\u0010\u0012&\u001eº±\nBñ\u0083·\u007f\u0000¹Ì; \bÁ4I\u00018jï²"
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
                     PENDING = new RenderUtil20_x(var4[5], var4[0], new Color(255, 170, 40));
                     APPROVED = new RenderUtil20_x(var4[10], var4[6], new Color(60, 200, 120));
                     DENIED = new RenderUtil20_x(var4[7], var4[12], new Color(225, 70, 70));
                     PENDING_EDIT = new RenderUtil20_x(var4[13], var4[14], new Color(70, 150, 235));
                     EDIT_DENIED = new RenderUtil20_x(var4[11], var4[3], new Color(235, 110, 70));
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

                  var6 = "äiU\\\u0016º\u001eY\u0099\u0082cÑû±]J\u0010-]¢õÄð\u008dÃÁÎ\u008aQ\u009cÍ1\u0080";
                  var7 = "äiU\\\u0016º\u001eY\u0099\u0082cÑû±]J\u0010-]¢õÄð\u008dÃÁÎ\u008aQ\u009cÍ1\u0080".length();
                  var8 = 16;
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
