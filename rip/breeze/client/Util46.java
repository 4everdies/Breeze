package rip.breeze.client;

import java.io.IOException;
import java.util.UUID;
import rip.breeze.StringDecryptor;

final class Util46 extends Util64<UUID> {

   public UUID getUUID(RotationUtil9 var1, long var2) throws IOException {
      var2 = 92483176686685L ^ var2;
      long var10001 = var2 ^ 15116940530513L;
      int var4 = (int)((var2 ^ 15116940530513L) >>> 48);
      int var5 = (int)((var2 ^ 15116940530513L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 115947517679249L;
      long var9 = var2 ^ 137167790055584L;

      try {
         if (var1.getEnum10Val(var7) == EnumType1.NULL) {
            var1.calculate_7(var9);
            return null;
         }
      } catch (IOException var11) {
         throw getIOException(var11);
      }

      return UUID.fromString(var1.buildString_2((short)var4, (short)var5, var6));
   }

   public void processAll(Util135 var1, UUID var2, long var3) throws IOException {
      var3 = 92483176686685L ^ var3;
      long var10001 = var3 ^ 118183809681433L;
      int var5 = (int)((var3 ^ 118183809681433L) >>> 56);
      int var6 = (int)((var3 ^ 118183809681433L) << 8 >>> 32);
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

         var10 = var2.toString();
      }

      var10000.getDataBuilder19_8(var10, (byte)var5, var6, var7);
   }

   private static IOException getIOException(IOException var0) {
      return var0;
   }
}
