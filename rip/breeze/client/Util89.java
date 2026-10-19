package rip.breeze.client;

import java.io.IOException;
import rip.breeze.StringDecryptor;

final class Util89 extends Util64<String> {

   public String getString(int var1, int var2, RotationUtil9 var3) throws IOException {
      long var4 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ 107085023817227L;
      long var10001 = var4 ^ 15180522912771L;
      int var6 = (int)((var4 ^ 15180522912771L) >>> 48);
      int var7 = (int)((var4 ^ 15180522912771L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      long var9 = var4 ^ 115474237536707L;
      long var11 = var4 ^ 137099904061426L;
      long var13 = var4 ^ 115941733682209L;
      EnumType1 var15 = var3.getEnum10Val(var9);

      try {
         if (var15 == EnumType1.NULL) {
            var3.calculate_7(var11);
            return null;
         }
      } catch (IOException var16) {
         throw getIOException(var16);
      }

      try {
         if (var15 == EnumType1.BOOLEAN) {
            return Boolean.toString(var3.checkCondition_2(var13));
         }
      } catch (IOException var17) {
         throw getIOException(var17);
      }

      return var3.buildString_2((short)var6, (short)var7, var8);
   }

   public void updateCallSiteString(Util135 var1, String var2, int var3, int var4) throws IOException {
      long var5 = ((long)var3 << 32 | (long)var4 << 32 >>> 32) ^ 107085023817227L;
      long var10001 = var5 ^ 16233345288064L;
      int var7 = (int)((var5 ^ 16233345288064L) >>> 56);
      int var8 = (int)((var5 ^ 16233345288064L) << 8 >>> 32);
      int var9 = (int)(var10001 << 40 >>> 40);
      var1.getDataBuilder19_8(var2, (byte)var7, var8, var9);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
