package rip.breeze.client;

import java.util.concurrent.atomic.AtomicInteger;
import rip.breeze.StringDecryptor;
import rip.breeze.Util28;

class Util103 {
   static final Util103 CONST_A = new Util103();
   private static final IBreezeInterface[] CONST_B = new IBreezeInterface[]{
      WorldUtil5.CONST_A,
      Util100.CONST_A,
      Util99.CONST_A,
      EnumFacing.CONST_A,
      RenderUtil20.CONST_A,
      ModeSetting.CONST_A,
      Setting.CONST_A,
      Util109.CONST_A,
      Util96.CONST_A
   };

   Object getObject(String var1, char var2, AtomicInteger var3, Util112 var4, short var5, int var6) {
      long var7 = ((long)var2 << 48 | (long)var5 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ 28925988066616L;
      long var9 = var7 ^ 48428869250835L;
      long var11 = var7 ^ 70655767320446L;
      long var10001 = var7 ^ 124268152733241L;
      int var13 = (int)((var7 ^ 124268152733241L) >>> 32);
      int var14 = (int)((var7 ^ 124268152733241L) << 32 >>> 40);
      int var15 = (int)(var10001 << 56 >>> 56);
      String[] var10000 = Util28.values();
      String var16 = var1.substring(var3.get());
      IBreezeInterface[] var17 = CONST_B;
      String[] var18 = var10000;
      int var19 = var17.length;
      int var20 = 0;

      while (var20 < var19) {
         IBreezeInterface var21 = var17[var20];
         if (var5 > 0) {
            if (var21.containsEntry(var9, var16)) {
               return var21.resolve(var1, var3, var11, var4);
            }

            var20++;
         }

         if (var18 != null) {
            break;
         }
      }

      StringBuilderUtil var22 = new StringBuilderUtil();
      var22.update_9(var13, var4.dataBuilder23_a.getString_b(), var16, var14, (byte)var15, var4.atomicInteger_b.get());
      return var22;
   }

   private Util103() {
   }
}
