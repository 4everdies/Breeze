package rip.breeze;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum RenderUtil18_x {
   BLACK,
   DARK_BLUE,
   DARK_GREEN,
   DARK_AQUA,
   DARK_RED,
   DARK_PURPLE,
   GOLD,
   GRAY,
   DARK_GRAY,
   BLUE,
   GREEN,
   AQUA,
   RED,
   LIGHT_PURPLE,
   YELLOW,
   WHITE,
   GLOW,
   ACCENT,
   PRIMARY,
   SECONDARY,
   TERTIARY,
   RESET;

   final String string_a;
   final Color color_b;
   final String string_c;
   private static LicenseState[] arr_e;

   RenderUtil18_x(String var3, char var4) {
      this.string_a = var3;
      this.color_b = Color.WHITE;
      this.string_c = "§" + var4;
   }

   public String getString_a() {
      return this.string_a;
   }

   public Color getColor_b() {
      return this.color_b;
   }

   @Override
   public String toString() {
      return this.string_c;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = StringDecryptor.getIBreezeInterface3(536293016177885943L, -8742515173470084187L, MethodHandles.lookup().lookupClass())
            .decryptKey(145347379683620L)
         ^ 47560969049815L;
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
      String[] var4 = new String[44];
      int var5 = 0;
      String var6 = "o\u0099\u000e:ó\u0014\u008a%;Òé\u0087¹\u009aë\u0006\b©Ç³\u0011Ï\u009b\u0093þ\u0010))W\u0097X;j´\r\"Û\u0007t#]Ú\u0010\u009d ¯®\u009bsÄS!\u001b\u0007Ä3±¡#\bÄÔ\u001ffà\u0084T\t\u0010o\u0099\u000e:ó\u0014\u008a%;Òé\u0087¹\u009aë\u0006\b2tøØé³\u0004\u009d\b\u0099\u0003¤ÿ´î\u0090\u0080\b\b}¬×®Äré\u00102|¨\u0086\t\b\f\u0005ïô?~\u000e]<\u001d\b\nÖ»ûéÍJ\u008f\b\u0083¾ï}ßúÁð\bµ\u000f\u009c\u009295\u0003H\b\u001a\u000bâ«vÞr7\bUt{²ÖMüO\b \u0000ãåµr\u008bò\b\f|_\u00ad\u009c[Ìý\bUt{²ÖMüO\u0010 ÍÁt¯D\u0001³Ðô g\u0012Ñ \u0081\b\f|_\u00ad\u009c[Ìý\u0010µx.M\u0087¢\u0098â\u008a.!Ê\u001e\u0096\u0004³\u0010t%\u0090\u0000\u008b\u0090×^LÐO\u0082:B\u0006E\b\u001a\u000bâ«vÞr7\b2tøØé³\u0004\u009d\u0010\u0010<\u001f\u008a\u0004EMq¿ü\u0015´\u0004ÐJº\u0010t%\u0090\u0000\u008b\u0090×^LÐO\u0082:B\u0006E\b\u00969@ÞÎ0!\u0085\b\u0083¾ï}ßúÁð\u0010 ÍÁt¯D\u0001³Ðô g\u0012Ñ \u0081\u0010µx.M\u0087¢\u0098â\u008a.!Ê\u001e\u0096\u0004³\b\u00969@ÞÎ0!\u0085\bµ\u000f\u009c\u009295\u0003H\u00102|¨\u0086\t\b\f\u0005ïô?~\u000e]<\u001d\u0010))W\u0097X;j´\r\"Û\u0007t#]Ú\u0010\u009d ¯®\u009bsÄS!\u001b\u0007Ä3±¡#\b \u0000ãåµr\u008bò\bÄÔ\u001ffà\u0084T\t\u0010\u0010<\u001f\u008a\u0004EMq¿ü\u0015´\u0004ÐJº\b©Ç³\u0011Ï\u009b\u0093þ\b\u0099\u0003¤ÿ´î\u0090\u0080\u0010\t¾võp3§\u001eoÑÌx\u0082:<ÿ\b\nÖ»ûéÍJ\u008f";
      int var7 = "o\u0099\u000e:ó\u0014\u008a%;Òé\u0087¹\u009aë\u0006\b©Ç³\u0011Ï\u009b\u0093þ\u0010))W\u0097X;j´\r\"Û\u0007t#]Ú\u0010\u009d ¯®\u009bsÄS!\u001b\u0007Ä3±¡#\bÄÔ\u001ffà\u0084T\t\u0010o\u0099\u000e:ó\u0014\u008a%;Òé\u0087¹\u009aë\u0006\b2tøØé³\u0004\u009d\b\u0099\u0003¤ÿ´î\u0090\u0080\b\b}¬×®Äré\u00102|¨\u0086\t\b\f\u0005ïô?~\u000e]<\u001d\b\nÖ»ûéÍJ\u008f\b\u0083¾ï}ßúÁð\bµ\u000f\u009c\u009295\u0003H\b\u001a\u000bâ«vÞr7\bUt{²ÖMüO\b \u0000ãåµr\u008bò\b\f|_\u00ad\u009c[Ìý\bUt{²ÖMüO\u0010 ÍÁt¯D\u0001³Ðô g\u0012Ñ \u0081\b\f|_\u00ad\u009c[Ìý\u0010µx.M\u0087¢\u0098â\u008a.!Ê\u001e\u0096\u0004³\u0010t%\u0090\u0000\u008b\u0090×^LÐO\u0082:B\u0006E\b\u001a\u000bâ«vÞr7\b2tøØé³\u0004\u009d\u0010\u0010<\u001f\u008a\u0004EMq¿ü\u0015´\u0004ÐJº\u0010t%\u0090\u0000\u008b\u0090×^LÐO\u0082:B\u0006E\b\u00969@ÞÎ0!\u0085\b\u0083¾ï}ßúÁð\u0010 ÍÁt¯D\u0001³Ðô g\u0012Ñ \u0081\u0010µx.M\u0087¢\u0098â\u008a.!Ê\u001e\u0096\u0004³\b\u00969@ÞÎ0!\u0085\bµ\u000f\u009c\u009295\u0003H\u00102|¨\u0086\t\b\f\u0005ïô?~\u000e]<\u001d\u0010))W\u0097X;j´\r\"Û\u0007t#]Ú\u0010\u009d ¯®\u009bsÄS!\u001b\u0007Ä3±¡#\b \u0000ãåµr\u008bò\bÄÔ\u001ffà\u0084T\t\u0010\u0010<\u001f\u008a\u0004EMq¿ü\u0015´\u0004ÐJº\b©Ç³\u0011Ï\u009b\u0093þ\b\u0099\u0003¤ÿ´î\u0090\u0080\u0010\t¾võp3§\u001eoÑÌx\u0082:<ÿ\b\nÖ»ûéÍJ\u008f"
         .length();
      char var8 = 16;
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
                     BLACK = new RenderUtil18_x(var4[17], '0');
                     DARK_BLUE = new RenderUtil18_x(var4[37], '1');
                     DARK_GREEN = new RenderUtil18_x(var4[20], '2');
                     DARK_AQUA = new RenderUtil18_x(var4[9], '3');
                     DARK_RED = new RenderUtil18_x(var4[40], '4');
                     DARK_PURPLE = new RenderUtil18_x(var4[33], '5');
                     GOLD = new RenderUtil18_x(var4[7], '6');
                     GRAY = new RenderUtil18_x(var4[10], '7');
                     DARK_GRAY = new RenderUtil18_x(var4[34], '8');
                     BLUE = new RenderUtil18_x(var4[16], '9');
                     GREEN = new RenderUtil18_x(var4[11], 'a');
                     AQUA = new RenderUtil18_x(var4[35], 'b');
                     RED = new RenderUtil18_x(var4[13], 'c');
                     LIGHT_PURPLE = new RenderUtil18_x(var4[0], 'd');
                     YELLOW = new RenderUtil18_x(var4[42], 'e');
                     WHITE = new RenderUtil18_x(var4[6], 'f');
                     GLOW = new RenderUtil18_x(var4[12], 'g');
                     ACCENT = new RenderUtil18_x(var4[30], 'h');
                     PRIMARY = new RenderUtil18_x(var4[38], 'i');
                     SECONDARY = new RenderUtil18_x(var4[21], 'j');
                     TERTIARY = new RenderUtil18_x(var4[18], 'k');
                     RESET = new RenderUtil18_x(var4[4], 'r');
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

                  var6 = "\b}¬×®Äré\u0010\t¾võp3§\u001eoÑÌx\u0082:<ÿ";
                  var7 = "\b}¬×®Äré\u0010\t¾võp3§\u001eoÑÌx\u0082:<ÿ".length();
                  var8 = '\b';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(LicenseState[] var0) {
      arr_e = var0;
   }

   public static LicenseState[] values() {
      return arr_e;
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
