package rip.breeze.inject;

import java.util.Map;

public class պ extends ջ {
   public String string_ç_2;
   public String string_æ_2;
   public String string_å_2;

   public պ(int var1, String var2, String var3, String var4) {
      super(var1);
      this.string_ç_2 = var2;
      this.string_æ_2 = var3;
      this.string_å_2 = var4;
   }

   public void invoke_1(Object[] var1) {
      int var2 = (Integer)var1[0];
      this.î = var2;
   }

   @Override
   public int invoke_1(Object[] var1) {
      return 4;
   }

   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 80612673306622L;
      long var7 = var3 ^ 1838151398855L;
      int var10001 = this.î;
      String var10003 = this.string_ç_2;
      String var10004 = this.string_æ_2;
      String var10005 = this.string_å_2;
      Object[] var10007 = new Object[]{null, var7, var10003, var10004, var10005};
      var10007[0] = var10001;
      var2.processAll_10(var10007);
      this.ú(new Object[]{var2, var5});
   }

   @Override
   public ջ invoke_3(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      long var5 = var2 ^ 76281336754521L;
      return new պ(this.î, this.string_ç_2, this.string_æ_2, this.string_å_2).õ(new Object[]{this, var5});
   }
}
