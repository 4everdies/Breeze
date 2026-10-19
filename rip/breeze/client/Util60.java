package rip.breeze.client;

import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

final class Util60 extends Util64<Boolean> {
   private static final String CONST_C;

   public Boolean getBoolean(RotationUtil9 var1, int var2, byte var3, int var4) throws IOException {
      long var5 = ((long)var2 << 32 | (long)var3 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ 60062702738363L;
      long var10001 = var5 ^ 102819515681089L;
      int var7 = (int)((var5 ^ 102819515681089L) >>> 48);
      int var8 = (int)((var5 ^ 102819515681089L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      long var10 = var5 ^ 62981500112001L;
      long var12 = var5 ^ 49465038551728L;

      try {
         if (var1.getEnum10Val(var10) == EnumType1.NULL) {
            var1.calculate_7(var12);
            return null;
         }
      } catch (IOException var14) {
         throw getIOException(var14);
      }

      return Boolean.valueOf(var1.buildString_2((short)var7, (short)var8, var9));
   }

   public void processAll(Util135 var1, Boolean var2, long var3) throws IOException {
      var3 = 60062702738363L ^ var3;
      long var10001 = var3 ^ 119275511329385L;
      int var5 = (int)((var3 ^ 119275511329385L) >>> 56);
      int var6 = (int)((var3 ^ 119275511329385L) << 8 >>> 32);
      int var7 = (int)(var10001 << 40 >>> 40);

      Util135 var10000;
      label17: {
         try {
            var10000 = var1;
            if (var2 == null) {
               var10 = CONST_C;
               break label17;
            }
         } catch (IOException var8) {
            throw getIOException(var8);
         }

         var10 = var2.toString();
      }

      var10000.getDataBuilder19_8(var10, (byte)var5, var6, var7);
   }

   static {
      long var0 = 24527262179343L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¢\u009c¹Ì5õ\u0017ç".getBytes("ISO-8859-1"));
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
