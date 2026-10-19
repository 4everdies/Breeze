package rip.breeze.inject;

import java.util.Map;

public class ն extends ջ {
   public int int_ç_2;

   public ն(int var1, int var2) {
      super(var1);
      this.int_ç_2 = var2;
   }

   public void invoke_1(Object[] var1) {
      int var2 = (Integer)var1[0];
      this.î = var2;
   }

   @Override
   public int invoke_1(Object[] var1) {
      return 1;
   }

   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 80612673306622L;
      long var7 = var3 ^ 18907980089923L;
      int var10001 = this.î;
      Object[] var10005 = new Object[]{null, null, this.int_ç_2};
      var10005[1] = var7;
      var10005[0] = var10001;
      var2.processAll_7(var10005);
      this.ú(new Object[]{var2, var5});
   }

   @Override
   public ջ invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      long var5 = var2 ^ 76281336754521L;
      return new ն(this.î, this.int_ç_2).õ(new Object[]{this, var5});
   }
}
