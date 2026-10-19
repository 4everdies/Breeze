package rip.breeze.client;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

final class Util107 implements IMarker2 {
   final Class class_a;
   final Util64 clientUtil2_b;
   private static final String[] CONST_D;
   private static final String[] CONST_E;
   private static final Map CONST_F = new HashMap(13);

   Util107(Class var1, Util64 var2) {
      this.class_a = var1;
      this.clientUtil2_b = var2;
   }

   @Override
   public String toString() {
      long var1 = 114973204346656L;
      return buildString_2(11596, 4444926790899096623L ^ var1)
         + this.class_a.getName()
         + buildString_2(30086, 8265170611245024484L ^ var1)
         + this.clientUtil2_b
         + "]";
   }

   static {
      long var0 = 35383979801448L;
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
      String var6 = "\u0001V\u0012å\\.6\"\u0014\u0083Ó\u0016ââWÉ\u0099Pj«¥\u0002ßs(üò\u0092\u0095øY;7SÂ\u0018Ã4\u001cÕà\u009e\bÿ\n¨\u000e\u001bfTä>Ý¡¿\u0003<÷¼1·\u0086¶kæ";
      int var7 = "\u0001V\u0012å\\.6\"\u0014\u0083Ó\u0016ââWÉ\u0099Pj«¥\u0002ßs(üò\u0092\u0095øY;7SÂ\u0018Ã4\u001cÕà\u009e\bÿ\n¨\u000e\u001bfTä>Ý¡¿\u0003<÷¼1·\u0086¶kæ"
         .length();
      char var8 = 24;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_D = var4;
            CONST_E = new String[2];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1602;
      if (CONST_E[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_F.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_F.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/ci", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_D[var3].getBytes("ISO-8859-1");
         CONST_E[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_E[var3];
   }
}
