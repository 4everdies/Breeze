package rip.breeze;

import java.lang.invoke.MethodHandles;

@FunctionalInterface
public interface IBreezeInterface4<T, U, V> {
   long eka_1 = StringDecryptor.getIBreezeInterface3(-9080824660304031952L, -5029453449520895192L, MethodHandles.lookup().lookupClass())
      .decryptKey(95677217845712L);

   void apply(T var1, U var2, V var3);

   default IBreezeInterface4<T, U, V> getIBreezeInterface4(IBreezeInterface4<? super T, ? super U, ? super V> var1) {
      long var2 = 26181360142099L;

      try {
         if (var1 == null) {
            throw new NullPointerException();
         }
      } catch (NullPointerException var4) {
         throw getNullPointerException(var4);
      }

      return this::lambda$andThen_Inner0;
   }

   private void lambda$andThen_Inner0(IBreezeInterface4 var1, Object var2, Object var3, Object var4) {
      this.apply((T)var2, (U)var3, (V)var4);
      var1.apply(var2, var3, var4);
   }

   private static NullPointerException getNullPointerException(NullPointerException var0) {
      return var0;
   }
}
