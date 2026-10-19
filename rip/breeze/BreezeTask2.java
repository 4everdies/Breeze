package rip.breeze;

import java.util.function.Consumer;

class BreezeTask2 implements Runnable {
   final String string_a;
   final Consumer consumer_b;
   final MicrosoftAuth microsoftAuth_c;

   BreezeTask2(MicrosoftAuth var1, String var2, Consumer var3) {
      this.microsoftAuth_c = var1;
      this.string_a = var2;
      this.consumer_b = var3;
   }

   @Override
   public void run() {
      try {
         Util12 var1 = this.microsoftAuth_c.getBreezeUtil115(this.string_a);
         this.consumer_b.accept(var1);
      } catch (Exception var2) {
         this.consumer_b.accept(null);
      }
   }
}
