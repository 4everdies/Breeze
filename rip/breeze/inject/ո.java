package rip.breeze.inject;

import java.util.Map;

public class ո extends ջ {
   public int int_ç_2;
   public int int_æ_2;

   public ո(int var1, int var2) {
      super(132);
      this.int_ç_2 = var1;
      this.int_æ_2 = var2;
   }

   @Override
   public int invoke_1(Object[] var1) {
      return 10;
   }

   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 119755589828630L;
      long var7 = var3 ^ 80612673306622L;
      int var10002 = this.int_ç_2;
      Object[] var10005 = new Object[]{null, null, this.int_æ_2};
      var10005[1] = var10002;
      var10005[0] = var5;
      var2.processAll_17(var10005);
      this.ú(new Object[]{var2, var7});
   }

   @Override
   public ջ invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      long var5 = var2 ^ 76281336754521L;
      return new ո(this.int_ç_2, this.int_æ_2).õ(new Object[]{this, var5});
   }
}
