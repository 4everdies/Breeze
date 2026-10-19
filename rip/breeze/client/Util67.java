package rip.breeze.client;

import rip.breeze.StringDecryptor;

public final class Util67 {

   public static Object getObject(long var0, Object var2) {
      var0 = /*CIPHER_KEY_a*/ 0L ^ var0;

      try {
         if (var2 == null) {
            throw new NullPointerException();
         } else {
            return var2;
         }
      } catch (NullPointerException var3) {
         throw getNullPointerException(var3);
      }
   }

   public static void update(boolean var0, long var1) {
      var1 = /*CIPHER_KEY_a*/ 0L ^ var1;

      try {
         if (!var0) {
            throw new IllegalArgumentException();
         }
      } catch (NullPointerException var3) {
         throw getNullPointerException(var3);
      }
   }

   private static NullPointerException getNullPointerException(NullPointerException var0) {
      return var0;
   }
}
