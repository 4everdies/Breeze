package rip.breeze.inject;

import java.util.Map;

public class ղ extends ջ {
   public Object object_ç_2;

   public ղ(Object var1) {
      super(18);
      this.object_ç_2 = var1;
   }

   @Override
   public int invoke_1(Object[] var1) {
      return 9;
   }

   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 80612673306622L;
      long var7 = var3 ^ 61489486726897L;
      var2.processAll_16(new Object[]{this.object_ç_2, var7});
      this.ú(new Object[]{var2, var5});
   }

   @Override
   public ջ invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      long var5 = var2 ^ 76281336754521L;
      return new ղ(this.object_ç_2).õ(new Object[]{this, var5});
   }
}
