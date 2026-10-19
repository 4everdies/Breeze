package rip.breeze.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

final class Util142 extends Util64<Class> {
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public void updateCallSite(Util135 var1, long var2, Class var4) throws IOException {
      var2 = 24798399793306L ^ var2;
      throw new UnsupportedOperationException(
         buildString_2(19632, 1325116772888354530L ^ var2) + var4.getName() + buildString_2(16343, 8534228586112413062L ^ var2)
      );
   }

   public Class getClass(long var1, RotationUtil9 var3) throws IOException {
      var1 = 24798399793306L ^ var1;
      throw new UnsupportedOperationException(buildString_2(2296, 3640346067333769864L ^ var1));
   }

   static {
      long var0 = 23219671046060L;
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
      String var6 = "\u008fÇâ¾ùªÎ\u001cÚU^i}Å\u0000\u0019l?´\u007f_\u0018á\u009bq\u0015#\u0084peú³\u0015U£#@\u0012f¸Lwßnxwæ$Õ\u0098Ú\u008e¼Î1\u008ft\u008eg»KV\u0003J9sçÀÜ-ÝGsµj¢ô6åcÁ\u0001ów$·KSÊ\u001cõ\u008a\u008avjlk\u001fû\u001cÇPÁ\u000eI\u0013ª¹l»u\u0006þ£|@ñÎ\u0095\u0006.oØ\u001d\u009dµ±\u009c@F¶MV¼\u009aNÝìNèþ8U\u0099z46Ä\fÄ¼Áï\u009a\u0097\f×z_2\u0018$ê´I\u0001TU\u0081ják\u0085=Æ!\u0002\u0004¥Ý±\u001d\u00ad6lS0\u00ad \u009e@y\u0087P`f\u008e¥$ï]Æ§PÀÑ\u0092\u008båµ^ÑìNK¾ã{XÄ\u001ca5¢oPu\u0095g\u0011\u009d\u001cCKoÎ\u00881à\u009a¥f¢h*\u00194fä·Ø\u0015¿ïPÒG\u000b¿\u007f\u00009\u009dÅ¸\\Ý+ÆM \u008b+F";
      int var7 = "\u008fÇâ¾ùªÎ\u001cÚU^i}Å\u0000\u0019l?´\u007f_\u0018á\u009bq\u0015#\u0084peú³\u0015U£#@\u0012f¸Lwßnxwæ$Õ\u0098Ú\u008e¼Î1\u008ft\u008eg»KV\u0003J9sçÀÜ-ÝGsµj¢ô6åcÁ\u0001ów$·KSÊ\u001cõ\u008a\u008avjlk\u001fû\u001cÇPÁ\u000eI\u0013ª¹l»u\u0006þ£|@ñÎ\u0095\u0006.oØ\u001d\u009dµ±\u009c@F¶MV¼\u009aNÝìNèþ8U\u0099z46Ä\fÄ¼Áï\u009a\u0097\f×z_2\u0018$ê´I\u0001TU\u0081ják\u0085=Æ!\u0002\u0004¥Ý±\u001d\u00ad6lS0\u00ad \u009e@y\u0087P`f\u008e¥$ï]Æ§PÀÑ\u0092\u008båµ^ÑìNK¾ã{XÄ\u001ca5¢oPu\u0095g\u0011\u009d\u001cCKoÎ\u00881à\u009a¥f¢h*\u00194fä·Ø\u0015¿ïPÒG\u000b¿\u007f\u00009\u009dÅ¸\\Ý+ÆM \u008b+F"
         .length();
      char var8 = 128;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_C = var4;
            CONST_D = new String[3];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26952;
      if (CONST_D[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/bl", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C[var3].getBytes("ISO-8859-1");
         CONST_D[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
   }
}
