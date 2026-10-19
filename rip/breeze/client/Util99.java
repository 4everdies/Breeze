package rip.breeze.client;

import java.util.concurrent.atomic.AtomicInteger;
import rip.breeze.Util28;

class Util99 implements IBreezeInterface {
   static final Util99 CONST_A = new Util99();

   public boolean isValid(long var1, String var3) {
      return var3.startsWith("'");
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public Object getObject(String var1, AtomicInteger var2, long var3, Util112 var5) {
      long var10001 = var3 ^ 88622662033979L;
      int var6 = (int)((var3 ^ 88622662033979L) >>> 32);
      int var7 = (int)((var3 ^ 88622662033979L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      int var9 = var5.atomicInteger_b.get();
      String[] var10000 = Util28.values();
      byte var10 = 0;
      String[] var11 = var10000;
      int var12 = var2.incrementAndGet();
      int var13 = var2.get();

      label40:
      while (true) {
         if (var13 < var1.length()) {
            var16 = var1.charAt(var13);
         } else {
            var16 = (char)var10;
            if (var3 > 0L) {
               break;
            }
         }

         while (true) {
            char var14 = var16;
            if (var3 >= 0L) {
               if (var14 == '\'') {
                  var16 = 1;
                  if (var3 < 0L) {
                     break label40;
                  }

                  var10 = 1;
                  if (var11 != null) {
                     var13 = var2.incrementAndGet();
                     if (var11 == null) {
                        break;
                     }
                  }
               } else {
                  var13 = var2.incrementAndGet();
                  if (var11 == null) {
                     break;
                  }
               }
            } else {
               var13 = var14;
               if (var11 == null) {
                  break;
               }
            }

            var16 = (char)var10;
            if (var3 > 0L) {
               break label40;
            }
         }
      }

      if (var16 == 0) {
         StringBuilderUtil var15 = new StringBuilderUtil();
         var15.update_11(var5.dataBuilder23_a.getString_b(), var6, (short)var7, var8, var1.substring(var12), var9);
         return var15;
      } else {
         return var1.substring(var12, var2.get());
      }
   }

   private Util99() {
   }
}
