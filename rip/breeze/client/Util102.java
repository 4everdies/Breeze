package rip.breeze.client;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import rip.breeze.StringDecryptor;

public final class Util102 {

   public static PlayerUtil8 getDataBuilder2(RotationUtil9 var0, long var1) throws BreezeException2 {
      var1 = 126568906490626L ^ var1;
      long var3 = var1 ^ 65902010646928L;
      long var5 = var1 ^ 25209662533939L;
      boolean var7 = true;

      try {
         var0.getEnum10Val(var3);
         var7 = false;
         return (PlayerUtil8)HttpUtil4.CONST_X_2.lookupByKey(var0, var5);
      } catch (EOFException var10) {
         try {
            if (var7) {
               return Util40.CONST_A;
            }
         } catch (EOFException var9) {
            throw getException(var9);
         }

         throw new AuthException2(var10);
      } catch (BreezeException var11) {
         throw new AuthException2(var11);
      } catch (IOException var12) {
         throw new AuthException(var12);
      } catch (NumberFormatException var13) {
         throw new AuthException2(var13);
      }
   }

   public static void updateCallSiteContext(PlayerUtil8 var0, long var1, Util135 var3) throws IOException {
      var1 = 126568906490626L ^ var1;
      long var4 = var1 ^ 135438827391497L;
      HttpUtil4.CONST_X_2.updateCallSite(var4, var3, var0);
   }

   public static Writer getWriter(Appendable var0, long var1) {
      var1 = 126568906490626L ^ var1;

      try {
         if (var0 instanceof Writer) {
            return (Writer)var0;
         }
      } catch (BreezeException2 var3) {
         throw getException(var3);
      }

      return new StringWriter(var0);
   }

   private static Exception getException(Exception var0) {
      return var0;
   }
}
