package rip.breeze.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

final class Util82 extends Util64<AtomicIntegerArray> {

   public AtomicIntegerArray getAtomicIntegerArray(RotationUtil9 var1, long var2, int var4) throws IOException {
      long var5 = (var2 << 32 | (long)var4 << 32 >>> 32) ^ 21894844524051L;
      long var7 = var5 ^ 114626404498741L;
      long var9 = var5 ^ 81514630710383L;
      long var11 = var5 ^ 47882433363163L;
      long var13 = var5 ^ 105480765917218L;
      LicenseState[] var10000 = HttpUtil4.values();
      ArrayList var15 = new ArrayList();
      LicenseState[] var16 = var10000;
      var1.calculate(var7);

      int var17;
      while (true) {
         if (var1.checkCondition(var11)) {
            try {
               var17 = var1.calculate_8(var13);
               var15.add(var17);
            } catch (NumberFormatException var20) {
               throw new AuthException2(var20);
            }

            if (var2 > 0L) {
               continue;
            }
            break;
         }

         var1.calculate_2(var9);
         var17 = var15.size();
         break;
      }

      AtomicIntegerArray var18 = new AtomicIntegerArray(var17);
      int var19 = 0;

      label47:
      while (var19 < var17) {
         var18.set(var19, (Integer)var15.get(var19));
         var19++;

         while (true) {
            if (var16 == null) {
               continue label47;
            }

            try {
               if (var2 < 0L) {
                  continue;
               }

               var22 = LicenseState.isValid_2();
               if (var4 <= 0) {
                  break;
               }

               if (!var22) {
                  var22 = false;
                  break;
               }
            } catch (NumberFormatException var21) {
               throw getNumberFormatException(var21);
            }

            var22 = true;
            break;
         }

         LicenseState.toggle(var22);
         break;
      }

      return var18;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void processNullable(char var1, Util135 var2, AtomicIntegerArray var3, int var4, char var5) throws IOException {
      long var6 = ((long)var1 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ 21894844524051L;
      long var10001 = var6 ^ 82614039645943L;
      int var8 = (int)((var6 ^ 82614039645943L) >>> 32);
      int var9 = (int)((var6 ^ 82614039645943L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var6 ^ 80873335571146L;
      long var13 = var6 ^ 3167174001186L;
      var2.getDataBuilder19(var13);
      int var15 = 0;
      LicenseState[] var10000 = HttpUtil4.values();
      int var16 = var3.length();
      LicenseState[] var17 = var10000;

      while (true) {
         if (var15 < var16) {
            var2.getDataBuilder19_12(var8, var3.get(var15), var9, (short)var10);
            var15++;
            if (var17 == null) {
               continue;
            }
         }

         do {
            var2.getDataBuilder19_2(var11);
            if (var5 >= 0) {
               return;
            }
         } while (var17 != null);
      }
   }

   private static NumberFormatException getNumberFormatException(NumberFormatException var0) {
      return var0;
   }
}
