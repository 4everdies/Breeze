package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ÿ extends Exception {
   private static final long serialVersionUID = 3154190448018943333L;
   public final transient ջ ջ_ÿ_2;
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   public ÿ(ջ var1, String var2) {
      super(var2);
      this.ջ_ÿ_2 = var1;
   }

   public ÿ(ջ var1, String var2, Throwable var3) {
      super(var2, var3);
      this.ջ_ÿ_2 = var1;
   }

   public ÿ(ջ var1, String var2, long var3, Object var5, ԏ var6) {
      var3 = encKey_a_2 ^ var3;
      long var7 = var3 ^ 86279888034894L;
      long var9 = var3 ^ 9018320984655L;
      super(
         method_002(
            new Object[]{
               var2 == null ? method_004(7881, 6035229602658150873L ^ var3) : method_001(new Object[]{var2, var7}),
               var9,
               String.valueOf(var5),
               String.valueOf(var6)
            }
         )
      );
      this.ջ_ÿ_2 = var1;
   }

   private static String invoke_1(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      return var1 + method_004(14508, 3147274588488400371L ^ var2);
   }

   private static String invoke_2(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      String var5 = (String)var0[3];
      var2 = encKey_a_2 ^ var2;
      return var1 + var4 + method_004(5976, 4888164642866697223L ^ var2) + var5;
   }

   static {
      long var0 = 3154190603357530707L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "öO\u0088B\u0092«2~á3]M\u001e\u0088\u008fñ\u009aÇÆoáïÇÛ Òq\u0091TiW\u001c÷D\u0015.»X;uZÕæ®áºHfXóü#O¡Î+T ZLVe=p[\u0018¥ªàF Ü\u0082'Z\u0016ÙÛeá.n\u009d°ëÊk\u008b9y";
      int var7 = "öO\u0088B\u0092«2~á3]M\u001e\u0088\u008fñ\u009aÇÆoáïÇÛ Òq\u0091TiW\u001c÷D\u0015.»X;uZÕæ®áºHfXóü#O¡Î+T ZLVe=p[\u0018¥ªàF Ü\u0082'Z\u0016ÙÛeá.n\u009d°ëÊk\u008b9y"
         .length();
      char var8 = 24;
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = method_003(var11).intern();
         if ((var9 += var8) >= var7) {
            CONST_B_2 = var4;
            CONST_C_2 = new String[3];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static String invoke_3(byte[] var0) {
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

   private static String invoke_4(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8546;
      if (CONST_C_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/inject/ÿ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B_2[var3].getBytes("ISO-8859-1");
         CONST_C_2[var3] = method_003(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }
}
