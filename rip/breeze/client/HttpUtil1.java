package rip.breeze.client;

import java.io.IOException;
import java.net.URL;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

final class HttpUtil1 extends Util64<URL> {
   private static final String CONST_C;

   public URL updateCallSite(RotationUtil9 var1, long var2) throws IOException {
      var2 = 115548353608697L ^ var2;
      long var10001 = var2 ^ 106527545025163L;
      int var4 = (int)((var2 ^ 106527545025163L) >>> 48);
      int var5 = (int)((var2 ^ 106527545025163L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 4575972992843L;
      long var9 = var2 ^ 19368469762426L;

      try {
         if (var1.getEnum10Val(var7) == EnumType1.NULL) {
            var1.calculate_7(var9);
            return null;
         }
      } catch (IOException var13) {
         throw getIOException(var13);
      }

      String var11 = var1.buildString_2((short)var4, (short)var5, var6);

      try {
         if (CONST_C.equals(var11)) {
            return null;
         }
      } catch (IOException var12) {
         throw getIOException(var12);
      }

      return new URL(var11);
   }

   public void processAll(Util135 var1, URL var2, long var3) throws IOException {
      var3 = 115548353608697L ^ var3;
      long var10001 = var3 ^ 18282641866322L;
      int var5 = (int)((var3 ^ 18282641866322L) >>> 56);
      int var6 = (int)((var3 ^ 18282641866322L) << 8 >>> 32);
      int var7 = (int)(var10001 << 40 >>> 40);

      Util135 var10000;
      label17: {
         try {
            var10000 = var1;
            if (var2 == null) {
               var10 = null;
               break label17;
            }
         } catch (IOException var8) {
            throw getIOException(var8);
         }

         var10 = var2.toExternalForm();
      }

      var10000.getDataBuilder19_8(var10, (byte)var5, var6, var7);
   }

   static {
      long var0 = 119914804218140L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u001bÎc/°Lcà".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_C = var5;
   }

   private static IOException getIOException(IOException var0) {
      return var0;
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
