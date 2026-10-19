package rip.breeze.inject;

import java.util.Map;

public class ճ extends ջ {
   private ª ª_ç_2;

   public ճ() {
      super(-1);
   }

   public ճ(ª var1) {
      super(-1);
      this.ª_ç_2 = var1;
   }

   @Override
   public int invoke_1(Object[] var1) {
      return 8;
   }

   public ª invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_b_2 ^ var2;
      boolean var4 = BreezeClass12.isValid();
      ª var10000 = this.ª_ç_2;
      if (!var4) {
         if (this.ª_ç_2 == null) {
            this.ª_ç_2 = new ª();
         }

         var10000 = this.ª_ç_2;
      }

      return var10000;
   }

   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 12836707958892L;
      long var7 = var3 ^ 33607973990551L;
      var2.processAll_15(new Object[]{this.method_001(new Object[]{var5}), var7});
   }

   @Override
   public ջ invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      return (ջ)var4.get(this);
   }

   @Override
   public void invoke_2(Object[] var1) {
      this.ª_ç_2 = null;
   }
}
