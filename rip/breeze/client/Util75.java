package rip.breeze.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
import rip.breeze.StringDecryptor;

final class Util75 extends Util64<AtomicLongArray> {
   final Util64 clientUtil2_a;

   Util75(Util64 var1) {
      this.clientUtil2_a = var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void processNullable(Util135 var1, AtomicLongArray var2, long var3) throws IOException {
      var3 = 48993319496011L ^ var3;
      long var5 = var3 ^ 66122211145794L;
      long var7 = var3 ^ 33938932149310L;
      long var9 = var3 ^ 94225773817046L;
      var1.getDataBuilder19(var9);
      String[] var10000 = Util64.getStringArray();
      int var11 = 0;
      String[] var12 = var10000;
      int var13 = var2.length();

      while (true) {
         if (var11 < var13) {
            this.clientUtil2_a.updateCallSite(var5, var1, var2.get(var11));
            var11++;
            if (var12 == null) {
               continue;
            }
         }

         do {
            var1.getDataBuilder19_2(var7);
            if (var3 >= 0L) {
               return;
            }
         } while (var12 != null);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public AtomicLongArray getAtomicLongArray(RotationUtil9 var1, long var2) throws IOException {
      var2 = 48993319496011L ^ var2;
      long var4 = var2 ^ 124616655331961L;
      long var6 = var2 ^ 91487165340451L;
      long var8 = var2 ^ 55638718161815L;
      long var10 = var2 ^ 131690041518564L;
      String[] var10000 = Util64.getStringArray();
      ArrayList var12 = new ArrayList();
      String[] var13 = var10000;
      var1.calculate(var4);

      while (true) {
         if (var1.checkCondition(var8)) {
            long var14 = ((Number)this.clientUtil2_a.lookupByKey(var1, var10)).longValue();
            var12.add(var14);
            if (var13 == null) {
               continue;
            }
         }

         do {
            var1.calculate_2(var6);
            int var16 = var12.size();
            AtomicLongArray var21 = new AtomicLongArray(var16);
            if (var2 > 0L) {
               AtomicLongArray var17 = var21;
               int var18 = 0;

               label25:
               while (true) {
                  AtomicLongArray var22;
                  if (var18 < var16) {
                     var22 = var17;
                  } else {
                     var22 = var17;
                     if (var2 >= 0L) {
                        return var17;
                     }
                  }

                  do {
                     var22.set(var18, (Long)var12.get(var18));
                     var18++;
                     if (var13 == null) {
                        continue label25;
                     }

                     var22 = var17;
                  } while (var2 < 0L);

                  return var17;
               }
            }

            long var20 = ((Number)var21).longValue();
            var12.add(var20);
         } while (var13 != null);
      }
   }
}
