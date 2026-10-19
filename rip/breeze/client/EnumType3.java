package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

public enum EnumType3 {
   LINEAR,
   SINE_IN,
   SINE_OUT,
   SINE_IN_OUT,
   CUBIC_IN,
   CUBIC_OUT,
   CUBIC_IN_OUT,
   QUAD_IN,
   QUAD_OUT,
   QUAD_IN_OUT,
   QUART_IN,
   QUART_OUT,
   QUART_IN_OUT,
   QUINT_IN,
   QUINT_OUT,
   QUINT_IN_OUT,
   CIRC_IN,
   CIRC_OUT,
   CIRC_IN_OUT,
   EXPO_IN,
   EXPO_OUT,
   EXPO_IN_OUT,
   ELASTIC_IN,
   ELASTIC_OUT,
   ELASTIC_IN_OUT,
   BACK_IN,
   BACK_OUT,
   BACK_IN_OUT,
   BOUNCE_IN,
   BOUNCE_OUT,
   BOUNCE_IN_OUT;

   private static final EnumType3[] CONST_A;
   private static boolean fieldBool_b;

   EnumType3() {
   }

   public abstract double interpolate(double var1, long var3);

   private static double calculateDouble(long var0, double var2) {
      var0 = 104906607840748L ^ var0;
      double var4 = 7.5625;
      double var6 = 2.75;
      if (var2 < 1.0 / var6) {
         return var4 * var2 * var2;
      }

      double var13;
      int var10000 = (var13 = var2 - 2.0 / var6) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
      if (var0 > 0L) {
         if (var10000 < 0) {
            double var11;
            return var4 * (var11 = var2 - 1.5 / var6) * var11 + 0.75;
         }

         double var10001 = 2.5 / var6;
         if (var0 <= 0L) {
            return var2 + var10001;
         }

         double var14;
         var10000 = (var14 = var2 - var10001) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
      }

      double var9;
      double var10;
      return var10000 < 0 ? var4 * (var10 = var2 - 2.25 / var6) * var10 + 0.9375 : var4 * (var9 = var2 - 2.625 / var6) * var9 + 0.984375;
   }

   EnumType3(BreezeEnum27 var3) {
      this();
   }

   static double getDouble(byte var0, double var1, long var3) {
      long var5 = ((long)var0 << 56 | var3 << 8 >>> 8) ^ 104906607840748L;
      long var7 = var5 ^ 62895213309392L;
      return calculateDouble(var7, var1);
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var0 = 127238456365629L;
      if (!isValid()) {
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
      String[] var4 = new String[31];
      int var5 = 0;
      String var6 = "MmÎt[EÍ\n\u0094\u001f\u0000\b\u0017\u0089>ñ\u0010\u0002e\u009fæ\u0014\u0084Â\u0096³Ä \u001d\nD°\u0084\u0010\u0095\u0018âÃé\u0016ù\u0094¼TV|ç5Q½\u0010¡}+òh\u0097\u0090{:\u0014\u001evÊ|.\u0099\u0010+Æú\u008b\u008f\u0016Ñ\b1\u008a°=\u009b)©2\u0010cAï\u009c\u0084\u0013+V'G(Ùf\tiv\b0Ë#k\nñÚ\u001d\u0010þ\u0005l\u001dD %\fØ¹¦\u0000Nÿ[Y\u0010îE;v\u0090Eu\u001f\u0085þ&\u0004\u008faÄÏ\u0010½\u0018^½\u009dZ\u0099GBçÈ\u008c(Ø\u0087J\u0010ß?=s¨\b_\u0013\n\u0082_Áü¦\u008a¶\u0010åñ8\u0083n\u0015\u009c\u0012yN\u0017\u0087I·å#\u0010cAï\u009c\u0084\u0013+V^Ê:\u001d«\"\u001bq\u0010Ä\u0010\u0015\u008c\u0007Ëûç\u0003\u0098\u009a\u008e8F\u0007\u0003\bË/\u001cmh\u0084~÷\u0010Ä\u0010\u0015\u008c\u0007Ëûçùßë;N²±\u0018\b\\d\u0000\u007f:\u0002\u0080¬\u0010¡}+òh\u0097\u0090{í\u009c¥º¤·\u009aÿ\u0010\u0095\u0018âÃé\u0016ù\u0094»J¬L$:Úé\u0010/nf4\u0012\u0011\u0011\u008fu\u001b\u0018â\u009ct³\u0091\u0010û\u008bþëF$Õ¦\u0084 \u0095#²&¥ô\u0010\u009aóÊ\"/\u0015Â3\u009eXC \u0007»!\u008f\u0010¡}+òh\u0097\u0090{À<\u009f÷y1Æý\u0010:Ø¸\bÓ\u009aC1\u001e}=·ìBJQ\b Ðl)\u0012\u0086\u0019#\u0010)x\u0001Ò¹QYN\u008aëpû0;/Ý\bç\u0099\u0019\u0095TXÆ\u0091\bH(tÔ\u0005ÞÏ\u0095\u0010+Æú\u008b\u008f\u0016Ñ\b½C\u0017¡C\u009flµ";
      int var7 = "MmÎt[EÍ\n\u0094\u001f\u0000\b\u0017\u0089>ñ\u0010\u0002e\u009fæ\u0014\u0084Â\u0096³Ä \u001d\nD°\u0084\u0010\u0095\u0018âÃé\u0016ù\u0094¼TV|ç5Q½\u0010¡}+òh\u0097\u0090{:\u0014\u001evÊ|.\u0099\u0010+Æú\u008b\u008f\u0016Ñ\b1\u008a°=\u009b)©2\u0010cAï\u009c\u0084\u0013+V'G(Ùf\tiv\b0Ë#k\nñÚ\u001d\u0010þ\u0005l\u001dD %\fØ¹¦\u0000Nÿ[Y\u0010îE;v\u0090Eu\u001f\u0085þ&\u0004\u008faÄÏ\u0010½\u0018^½\u009dZ\u0099GBçÈ\u008c(Ø\u0087J\u0010ß?=s¨\b_\u0013\n\u0082_Áü¦\u008a¶\u0010åñ8\u0083n\u0015\u009c\u0012yN\u0017\u0087I·å#\u0010cAï\u009c\u0084\u0013+V^Ê:\u001d«\"\u001bq\u0010Ä\u0010\u0015\u008c\u0007Ëûç\u0003\u0098\u009a\u008e8F\u0007\u0003\bË/\u001cmh\u0084~÷\u0010Ä\u0010\u0015\u008c\u0007Ëûçùßë;N²±\u0018\b\\d\u0000\u007f:\u0002\u0080¬\u0010¡}+òh\u0097\u0090{í\u009c¥º¤·\u009aÿ\u0010\u0095\u0018âÃé\u0016ù\u0094»J¬L$:Úé\u0010/nf4\u0012\u0011\u0011\u008fu\u001b\u0018â\u009ct³\u0091\u0010û\u008bþëF$Õ¦\u0084 \u0095#²&¥ô\u0010\u009aóÊ\"/\u0015Â3\u009eXC \u0007»!\u008f\u0010¡}+òh\u0097\u0090{À<\u009f÷y1Æý\u0010:Ø¸\bÓ\u009aC1\u001e}=·ìBJQ\b Ðl)\u0012\u0086\u0019#\u0010)x\u0001Ò¹QYN\u008aëpû0;/Ý\bç\u0099\u0019\u0095TXÆ\u0091\bH(tÔ\u0005ÞÏ\u0095\u0010+Æú\u008b\u008f\u0016Ñ\b½C\u0017¡C\u009flµ"
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
                     LINEAR = new BreezeEnum27();
                     SINE_IN = new BreezeEnum38();
                     SINE_OUT = new BreezeEnum11();
                     SINE_IN_OUT = new BreezeEnum14();
                     CUBIC_IN = new BreezeEnum15();
                     CUBIC_OUT = new BreezeEnum16();
                     CUBIC_IN_OUT = new BreezeEnum17();
                     QUAD_IN = new BreezeEnum18();
                     QUAD_OUT = new BreezeEnum19();
                     QUAD_IN_OUT = new BreezeEnum28();
                     QUART_IN = new BreezeEnum29();
                     QUART_OUT = new BreezeEnum30();
                     QUART_IN_OUT = new BreezeEnum31();
                     QUINT_IN = new BreezeEnum32();
                     QUINT_OUT = new BreezeEnum33();
                     QUINT_IN_OUT = new BreezeEnum34();
                     CIRC_IN = new BreezeEnum35();
                     CIRC_OUT = new BreezeEnum36();
                     CIRC_IN_OUT = new BreezeEnum37();
                     EXPO_IN = new BreezeEnum();
                     EXPO_OUT = new BreezeEnum2();
                     EXPO_IN_OUT = new BreezeEnum3();
                     ELASTIC_IN = new BreezeEnum4();
                     ELASTIC_OUT = new BreezeEnum5();
                     ELASTIC_IN_OUT = new BreezeEnum6();
                     BACK_IN = new BreezeEnum7();
                     BACK_OUT = new BreezeEnum8();
                     BACK_IN_OUT = new BreezeEnum9();
                     BOUNCE_IN = new BreezeEnum10();
                     BOUNCE_OUT = new BreezeEnum12();
                     BOUNCE_IN_OUT = new BreezeEnum13();
                     CONST_A = new EnumType3[]{
                        LINEAR,
                        SINE_IN,
                        SINE_OUT,
                        SINE_IN_OUT,
                        CUBIC_IN,
                        CUBIC_OUT,
                        CUBIC_IN_OUT,
                        QUAD_IN,
                        QUAD_OUT,
                        QUAD_IN_OUT,
                        QUART_IN,
                        QUART_OUT,
                        QUART_IN_OUT,
                        QUINT_IN,
                        QUINT_OUT,
                        QUINT_IN_OUT,
                        CIRC_IN,
                        CIRC_OUT,
                        CIRC_IN_OUT,
                        EXPO_IN,
                        EXPO_OUT,
                        EXPO_IN_OUT,
                        ELASTIC_IN,
                        ELASTIC_OUT,
                        ELASTIC_IN_OUT,
                        BACK_IN,
                        BACK_OUT,
                        BACK_IN_OUT,
                        BOUNCE_IN,
                        BOUNCE_OUT,
                        BOUNCE_IN_OUT
                     };
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

                  var6 = "vè\u001cn\u008fðKÛHþ³m;\u001bLå\u0010ëÚVT&2)\u0086\u0097cI\u0013#39\n";
                  var7 = "vè\u001cn\u008fðKÛHþ³m;\u001bLå\u0010ëÚVT&2)\u0086\u0097cI\u0013#39\n".length();
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
