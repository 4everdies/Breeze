package rip.breeze.inject;

import java.util.Map;

public class լ extends ջ {
   public String string_ç_2;

   public լ(int var1, String var2) {
      super(var1);
      this.string_ç_2 = var2;
   }

   public void invoke_1(Object[] var1) {
      int var2 = (Integer)var1[0];
      this.î = var2;
   }

   @Override
   public int invoke_1(Object[] var1) {
      return 3;
   }

   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 80612673306622L;
      long var7 = var3 ^ 49186504461634L;
      int var10001 = this.î;
      String var10003 = this.string_ç_2;
      Object[] var10005 = new Object[]{null, var7, var10003};
      var10005[0] = var10001;
      var2.processAll_9(var10005);
      this.ú(new Object[]{var2, var5});
   }

   @Override
   public ջ invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      long var5 = var2 ^ 76281336754521L;
      return new լ(this.î, this.string_ç_2).õ(new Object[]{this, var5});
   }
}
