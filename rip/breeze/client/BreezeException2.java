package rip.breeze.client;

public class BreezeException2 extends RuntimeException {
   static final long serialVersionUID;
   private static boolean fieldBool_b;

   public BreezeException2(String var1) {
      super(var1);
   }

   public BreezeException2(String var1, Throwable var2) {
      super(var1, var2);
   }

   public BreezeException2(Throwable var1) {
      super(var1);
   }

   public static void toggle(boolean var0) {
      fieldBool_b = var0;
   }

   public static boolean isValid() {
      return fieldBool_b;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid();

      try {
         return !var0;
      } catch (BreezeException2 var1) {
         throw getBreezeException2(var1);
      }
   }

   private static BreezeException2 getBreezeException2(BreezeException2 var0) {
      return var0;
   }

   static {
      if (checkCondition()) {
         toggle(true);
      }

      long var0 = 52568917890524L;
      long var10002 = -4086687417701686018L ^ var0;
      byte var10001 = -1;
      long var2 = var10002;
      serialVersionUID = var2;
   }
}
