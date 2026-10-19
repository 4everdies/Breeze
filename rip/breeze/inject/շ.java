package rip.breeze.inject;

import java.util.Map;

public class շ extends ջ {
   public շ(int var1) {
      super(var1);
   }

   @Override
   public int invoke_1(Object[] var1) {
      return 0;
   }

   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 80612673306622L;
      long var7 = var3 ^ 90597292748963L;
      int var10001 = this.î;
      Object[] var10004 = new Object[]{null, var7};
      var10004[0] = var10001;
      var2.processAll_6(var10004);
      this.ú(new Object[]{var2, var5});
   }

   @Override
   public ջ invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      long var5 = var2 ^ 76281336754521L;
      return new շ(this.î).õ(new Object[]{this, var5});
   }
}
