package rip.breeze.client;

import java.io.IOException;
import java.net.InetAddress;
import rip.breeze.StringDecryptor;

final class Util41 extends Util64<InetAddress> {

   public InetAddress getInetAddress(long var1, RotationUtil9 var3) throws IOException {
      var1 = 38491173644495L ^ var1;
      long var10001 = var1 ^ 127691272115048L;
      int var4 = (int)((var1 ^ 127691272115048L) >>> 48);
      int var5 = (int)((var1 ^ 127691272115048L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var1 ^ 18597169469096L;
      long var9 = var1 ^ 5897029034137L;

      try {
         if (var3.getEnum10Val(var7) == EnumType1.NULL) {
            var3.calculate_7(var9);
            return null;
         }
      } catch (IOException var11) {
         throw getIOException(var11);
      }

      return InetAddress.getByName(var3.buildString_2((short)var4, (short)var5, var6));
   }

   public void processAll(Util135 var1, long var2, InetAddress var4) throws IOException {
      var2 = 38491173644495L ^ var2;
      long var10001 = var2 ^ 67323823638007L;
      int var5 = (int)((var2 ^ 67323823638007L) >>> 56);
      int var6 = (int)((var2 ^ 67323823638007L) << 8 >>> 32);
      int var7 = (int)(var10001 << 40 >>> 40);

      Util135 var10000;
      label17: {
         try {
            var10000 = var1;
            if (var4 == null) {
               var10 = null;
               break label17;
            }
         } catch (IOException var8) {
            throw getIOException(var8);
         }

         var10 = var4.getHostAddress();
      }

      var10000.getDataBuilder19_8(var10, (byte)var5, var6, var7);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
