package rip.breeze;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class Util34 {
   public final Class<?> class_a;
   public final Class<? extends Util132<?>> class_b;
   public final MethodHandle methodHandle_c;
   private static final String CONST_E;

   Util34(Class<?> var1, Class<? extends Util132<?>> var2, MethodHandle var3) {
      this.class_a = var1;
      this.class_b = var2;
      this.methodHandle_c = var3;
   }

   Util132<?> getDataBuilder11(Object var1) {
      long var2 = 35947494467829L;

      try {
         return (Util132)this.methodHandle_c.invoke((Object)var1);
      } catch (Throwable var5) {
         throw new RuntimeException(CONST_E + this.class_b.getName(), var5);
      }
   }

   static {
      long var0 = 4899274094570L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ºÿÝ-\"\u0080ð¦\u009cÚ\u0097^\u0000Mnk¡}@²T«â\u0005".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_E = var5;
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
