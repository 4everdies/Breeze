package rip.breeze.client;

public final class AuthException2 extends BreezeException2 {
   private static final long serialVersionUID = 1L;
   private static int fieldInt_a;

   public AuthException2(String var1) {
      super(var1);
   }

   public AuthException2(String var1, Throwable var2) {
      super(var1, var2);
   }

   public AuthException2(Throwable var1) {
      super(var1);
   }

   public static void initialize(int var0) {
      fieldInt_a = var0;
   }

   public static int getValue() {
      return fieldInt_a;
   }

   public static int getValue_2() {
      int var0 = getValue();

      try {
         return var0 == 0 ? 1 : 0;
      } catch (AuthException2 var1) {
         throw getClientUtil118(var1);
      }
   }

   private static AuthException2 getClientUtil118(AuthException2 var0) {
      return var0;
   }

   static {
      if (getValue_2() != 0) {
         initialize(114);
      }
   }
}
