package rip.breeze.inject;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class ý extends IndexOutOfBoundsException {
   private static final long serialVersionUID = 6807380416709738314L;
   private final String string_ÿ;
   private final String string_þ;
   private final String string_ý;
   private final int int_ü;
   private static final String CONST_B;

   public ý(short var1, String var2, String var3, int var4, String var5, int var6, short var7) {
      long var8 = ((long)var1 << 48 | (long)var4 << 32 >>> 16 | (long)var7 << 48 >>> 48) ^ encKey_a;
      long var10 = var8 ^ 120520724844964L;
      super(buildString(new Object[]{var2, var10, var3, var5}));
      this.string_ÿ = var2;
      this.string_þ = var3;
      this.string_ý = var5;
      this.int_ü = var6;
   }

   private static String buildString(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      String var5 = (String)var0[3];
      var2 = encKey_a ^ var2;
      return CONST_B + var1 + "." + var4 + " " + var5;
   }

   public String getString(Object[] var1) {
      return this.string_ÿ;
   }

   public String getString_2(Object[] var1) {
      return this.string_þ;
   }

   public String getString_3(Object[] var1) {
      return this.string_ý;
   }

   public int getValue(Object[] var1) {
      return this.int_ü;
   }

   static {
      long var0 = 176663197187633L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var5 = var2.doFinal("W(\u001aWMä\u009aæèý\u0007\u0081j\u0015\u001dÐRêe\u008b?üÞó".getBytes("ISO-8859-1"));
      CONST_B = buildString_2(var5).intern();
   }

   private static String buildString_2(byte[] var0) {
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
