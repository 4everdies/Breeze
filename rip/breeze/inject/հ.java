package rip.breeze.inject;

import java.util.List;
import java.util.Map;

public class հ extends ջ {
   public ճ ճ_ç_2;
   public List<Integer> list_æ_2;
   public List<ճ> list_å_2;

   public հ(ճ var1, int[] var2, long var3, ճ[] var5) {
      var3 = encKey_b_2 ^ var3;
      long var6 = var3 ^ 70566639061666L;
      long var8 = var3 ^ 53280306693904L;
      super(171);
      this.ճ_ç_2 = var1;
      this.list_æ_2 = ԧ.method_008(new Object[]{var2, var8});
      this.list_å_2 = ԧ.method_003(new Object[]{var6, var5});
   }

   @Override
   public int invoke_1(Object[] var1) {
      return 12;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 80612673306622L;
      long var7 = var3 ^ 47509408081881L;
      long var9 = var3 ^ 12836707958892L;
      int var10000 = BreezeClass12.checkCondition();
      int[] var11 = new int[this.list_æ_2.size()];
      int var12 = 0;
      boolean var13 = (boolean)var10000;
      int var14 = var11.length;

      while (true) {
         if (var12 < var14) {
            var11[var12] = this.list_æ_2.get(var12);
            var12++;
            if (var13) {
               continue;
            }
         }

         do {
            var10000 = this.list_å_2.size();
            if (var3 >= 0L) {
               ª[] var16 = new ª[var10000];
               var14 = 0;
               int var15 = var16.length;

               while (true) {
                  if (var14 < var15) {
                     var16[var14] = this.list_å_2.get(var14).method_001(new Object[]{var9});
                     var14++;
                     boolean var19 = var13;
                     if (var3 > 0L) {
                        if (!var13) {
                           return;
                        }

                        var19 = var13;
                     }

                     if (var19) {
                        continue;
                     }
                  }

                  do {
                     var2.processAll_19(new Object[]{this.ճ_ç_2.method_001(new Object[]{var9}), var11, var7, var16});
                     this.ú(new Object[]{var2, var5});
                     if (var3 > 0L) {
                        return;
                     }

                     var20 = var13;
                     if (var3 > 0L) {
                        if (!var13) {
                           return;
                        }

                        var20 = var13;
                     }
                  } while (!var20);
               }
            }
         } while (var10000 == 0);
      }
   }

   @Override
   public ջ invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      long var5 = var2 ^ 82228447175909L;
      long var7 = var2 ^ 36613623347095L;
      long var9 = var2 ^ 76281336754521L;
      ճ var10002 = ø(new Object[]{this.ճ_ç_2, var4});
      List var10005 = this.list_å_2;
      հ var11 = new հ(var10002, null, var7, ö(new Object[]{var5, var10005, var4}));
      var11.list_æ_2.addAll(this.list_æ_2);
      return var11.õ(new Object[]{this, var9});
   }
}
