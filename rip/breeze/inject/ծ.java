package rip.breeze.inject;

import java.util.Map;

public class ծ extends ջ {
   public String string_ç;
   public int int_æ;

   public ծ(String var1, int var2) {
      super(197);
      this.string_ç = var1;
      this.int_æ = var2;
   }

   public int getValue(Object[] var1) {
      return 13;
   }

   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 80612673306622L;
      long var7 = var3 ^ 50556756976270L;
      String var10001 = this.string_ç;
      int var10002 = this.int_æ;
      Object[] var10005 = new Object[]{null, null, var7};
      var10005[1] = var10002;
      var10005[0] = var10001;
      var2.processAll_20(var10005);
      this.ú(new Object[]{var2, var5});
   }

   public ջ getՋ(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      long var5 = var2 ^ 76281336754521L;
      return new ծ(this.string_ç, this.int_æ).õ(new Object[]{this, var5});
   }
}
