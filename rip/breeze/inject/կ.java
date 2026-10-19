package rip.breeze.inject;

import java.util.Map;

public class կ extends ջ {
   public String string_ç_2;
   public String string_æ_2;
   public String string_å_2;
   public boolean bool_ä_2;

   public կ(int var1, String var2, long var3, String var5, String var6) {
      var3 = encKey_b_2 ^ var3;
      this(var1, var2, var5, var6, var1 == 185);
   }

   public կ(int var1, String var2, String var3, String var4, boolean var5) {
      super(var1);
      this.string_ç_2 = var2;
      this.string_æ_2 = var3;
      this.string_å_2 = var4;
      this.bool_ä_2 = var5;
   }

   public void invoke_1(Object[] var1) {
      int var2 = (Integer)var1[0];
      this.î = var2;
   }

   @Override
   public int invoke_1(Object[] var1) {
      return 5;
   }

   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 80612673306622L;
      long var7 = var3 ^ 29127339316132L;
      int var10002 = this.î;
      Object[] var10008 = new Object[]{null, null, this.string_ç_2, this.string_æ_2, this.string_å_2, this.bool_ä_2};
      var10008[1] = var10002;
      var10008[0] = var7;
      var2.processAll_12(var10008);
      this.ú(new Object[]{var2, var5});
   }

   @Override
   public ջ invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      long var5 = var2 ^ 76281336754521L;
      return new կ(this.î, this.string_ç_2, this.string_æ_2, this.string_å_2, this.bool_ä_2).õ(new Object[]{this, var5});
   }
}
