package rip.breeze.client;

import rip.breeze.StringDecryptor;
import rip.breeze.Util28;

class Util98 {
   final String string_a;
   final int fieldInt_b;
   final String string_c;

   Util98(String var1, int var2, Util98 var3, long var4) {
      Util98 var8;
      String var10001;
      label16: {
         var4 = /*CIPHER_KEY_d*/ 0L ^ var4;
         String[] var10000 = Util28.values();
         super();
         this.string_a = var1;
         String[] var6 = var10000;
         this.fieldInt_b = var2;
         if (var3 != null) {
            var8 = this;
            var10001 = var1 + "." + var3.string_c;
            if (var4 < 0L) {
               break label16;
            }

            this.string_c = var10001;
            if (var6 == null) {
               return;
            }
         }

         var8 = this;
         var10001 = var1;
      }

      var8.string_c = var10001;
   }
}
