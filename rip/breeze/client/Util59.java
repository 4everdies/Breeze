package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

final class Util59 extends Util64<Boolean> {

   public Boolean getBoolean(RotationUtil9 var1, long var2) throws IOException {
      var2 = 126177038991743L ^ var2;
      long var10001 = var2 ^ 6117058729872L;
      int var4 = (int)((var2 ^ 6117058729872L) >>> 48);
      int var5 = (int)((var2 ^ 6117058729872L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 107046428512848L;
      long var9 = var2 ^ 128571182195809L;
      long var11 = var2 ^ 106843911874482L;

      try {
         if (var1.getEnum10Val(var7) == EnumType1.NULL) {
            var1.calculate_7(var9);
            return null;
         }
      } catch (IOException var13) {
         throw getIOException(var13);
      }

      try {
         if (var2 <= 0L) {
            return var1.checkCondition_2(var7);
         }

         if (var1.getEnum10Val(var7) == EnumType1.STRING) {
            return Boolean.parseBoolean(var1.buildString_2((short)var4, (short)var5, var6));
         }
      } catch (IOException var14) {
         throw getIOException(var14);
      }

      return var1.checkCondition_2(var11);
   }

   public void updateCallSiteBoolean(long var1, Util135 var3, Boolean var4) throws IOException {
      var1 = 126177038991743L ^ var1;
      long var5 = var1 ^ 137127726072916L;
      var3.getDataBuilder19_11(var5, var4);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
