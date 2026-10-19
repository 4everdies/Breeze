package rip.breeze.inject;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class þ extends IndexOutOfBoundsException {
   private static final long serialVersionUID = 160715609518896765L;
   private final String string_ÿ;
   private final int int_þ;
   private static final String CONST_B;

   public þ(long var1, String var3, int var4) {
      var1 = encKey_a ^ var1;
      long var5 = var1 ^ 134408292008036L;
      super(buildString(new Object[]{var5, var3}));
      this.string_ÿ = var3;
      this.int_þ = var4;
   }

   private static String buildString(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      var1 = encKey_a ^ var1;
      return CONST_B + var3;
   }

   public String getString(Object[] var1) {
      return this.string_ÿ;
   }

   public int getValue(Object[] var1) {
      return this.int_þ;
   }

   static {
      long var0 = 4433835842569L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var5 = var2.doFinal("<´\u0085\t^;\u001bôç6ðv\u0019\t\u0018ò\b\u0096©ç³Ð!±".getBytes("ISO-8859-1"));
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
