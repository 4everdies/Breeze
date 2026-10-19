package rip.breeze.inject;

import java.util.Map;

public class ձ extends ջ {
   public int int_ç_2;
   public ճ ճ_æ_2;

   public ձ(int var1, ճ var2) {
      super(-1);
      this.int_ç_2 = var1;
      this.ճ_æ_2 = var2;
   }

   @Override
   public int invoke_1(Object[] var1) {
      return 15;
   }

   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 46819526988850L;
      long var7 = var3 ^ 12836707958892L;
      int var10002 = this.int_ç_2;
      Object[] var10005 = new Object[]{null, null, this.ճ_æ_2.method_001(new Object[]{var7})};
      var10005[1] = var10002;
      var10005[0] = var5;
      var2.processAll_23(var10005);
   }

   @Override
   public ջ invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      return new ձ(this.int_ç_2, ø(new Object[]{this.ճ_æ_2, var4}));
   }
}
