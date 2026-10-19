package rip.breeze.client;

import java.io.IOException;

public abstract class Util64<T> {
   private static String[] arr_b;

   public abstract void updateCallSite(long var1, Util135 var3, Object var4) throws IOException;

   public final Util64<T> getClientUtil2() {
      return new Util76(this);
   }

   public abstract Object lookupByKey(RotationUtil9 var1, long var2) throws IOException;

   public static void initialize(String[] var0) {
      arr_b = var0;
   }

   public static String[] getStringArray() {
      return arr_b;
   }

   static {
      if (getStringArray() != null) {
         initialize(new String[4]);
      }
   }
}
