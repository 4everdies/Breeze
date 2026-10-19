package rip.breeze.inject;

import java.util.List;
import java.util.Map;

public class խ extends ջ {
   public int int_ç_2;
   public int int_æ_2;
   public ճ ճ_å_2;
   public List<ճ> list_ä_2;

   public խ(int var1, long var2, int var4, ճ var5, ճ... var6) {
      var2 = encKey_b_2 ^ var2;
      long var7 = var2 ^ 46008586454566L;
      super(170);
      this.int_ç_2 = var1;
      this.int_æ_2 = var4;
      this.ճ_å_2 = var5;
      this.list_ä_2 = ԧ.method_003(new Object[]{var7, var6});
   }

   @Override
   public int invoke_1(Object[] var1) {
      return 11;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 80612673306622L;
      long var7 = var3 ^ 130225450734458L;
      long var9 = var3 ^ 12836707958892L;
      boolean var10000 = BreezeClass12.checkCondition();
      ª[] var11 = new ª[this.list_ä_2.size()];
      int var12 = 0;
      int var13 = var11.length;
      boolean var14 = var10000;

      while (true) {
         if (var12 < var13) {
            var11[var12] = this.list_ä_2.get(var12).method_001(new Object[]{var9});
            var12++;
            var10000 = var14;
            if (var3 >= 0L) {
               if (!var14) {
                  return;
               }

               var10000 = var14;
            }

            if (var10000) {
               continue;
            }
         }

         do {
            int var10002 = this.int_ç_2;
            Object[] var10007 = new Object[]{null, null, this.int_æ_2, this.ճ_å_2.method_001(new Object[]{var9}), var11};
            var10007[1] = var10002;
            var10007[0] = var7;
            var2.processAll_18(var10007);
            this.ú(new Object[]{var2, var5});
            if (var3 > 0L) {
               return;
            }

            var10000 = var14;
            if (var3 >= 0L) {
               if (!var14) {
                  return;
               }

               var10000 = var14;
            }
         } while (!var10000);
      }
   }

   @Override
   public ջ invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      long var5 = var2 ^ 82228447175909L;
      long var7 = var2 ^ 98499974403659L;
      long var9 = var2 ^ 76281336754521L;
      int var10002 = this.int_ç_2;
      int var10004 = this.int_æ_2;
      ճ var10005 = ø(new Object[]{this.ճ_å_2, var4});
      List var10007 = this.list_ä_2;
      return new խ(var10002, var7, var10004, var10005, ö(new Object[]{var5, var10007, var4})).õ(new Object[]{this, var9});
   }
}
