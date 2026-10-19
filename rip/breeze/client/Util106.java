package rip.breeze.client;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

final class Util106 implements IMarker2 {
   final Class class_a;
   final Class class_b;
   final Util64 clientUtil2_c;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);

   Util106(Class var1, Class var2, Util64 var3) {
      this.class_a = var1;
      this.class_b = var2;
      this.clientUtil2_c = var3;
   }

   @Override
   public String toString() {
      long var1 = 103488794995720L;
      LicenseState[] var3 = HttpUtil4.values();
      String var10000 = buildString_2(18616, 1757639198116325724L ^ var1)
         + this.class_a.getName()
         + "+"
         + this.class_b.getName()
         + buildString_2(21381, 8404706560557494880L ^ var1)
         + this.clientUtil2_c
         + "]";
      if (LicenseState.checkCondition()) {
         HttpUtil4.initialize(new LicenseState[1]);
      }

      return var10000;
   }

   static {
      long var0 = 40176926034801L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "\u0098±SÏDçÎbÀ6\u008f\u0003\u0003Y\u008dø%â\u0083»\u0004=ö5\u0097\u0002\u0096m}ãµ+\u0018[<¹\u0011\u001b/z\u000bd\u0000ó'ÄUÓáç\u0099CØq\u008e\u0015ê";
      int var7 = "\u0098±SÏDçÎbÀ6\u008f\u0003\u0003Y\u008dø%â\u0083»\u0004=ö5\u0097\u0002\u0096m}ãµ+\u0018[<¹\u0011\u001b/z\u000bd\u0000ó'ÄUÓáç\u0099CØq\u008e\u0015ê"
         .length();
      char var8 = ' ';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_E = var4;
            CONST_F = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
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

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19949;
      if (CONST_F[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_G.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_G.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/ch", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_E[var3].getBytes("ISO-8859-1");
         CONST_F[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_F[var3];
   }
}
