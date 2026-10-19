package rip.breeze.inject;

import java.util.Map;

public class յ extends ջ {
   public String string_ç;
   public String string_æ;
   public º º_å;
   public Object[] arr_ä;

   public յ(String var1, String var2, º var3, Object... var4) {
      super(186);
      this.string_ç = var1;
      this.string_æ = var2;
      this.º_å = var3;
      this.arr_ä = var4;
   }

   public int getValue(Object[] var1) {
      return 6;
   }

   @Override
   public void invoke_2(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 80612673306622L;
      long var7 = var3 ^ 94897924103627L;
      º var10004 = this.º_å;
      Object[] var10005 = this.arr_ä;
      var2.processAll_13(this.string_ç, this.string_æ, var7, var10004, var10005);
      this.ú(new Object[]{var2, var5});
   }

   public ջ getՋ(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      long var5 = var2 ^ 76281336754521L;
      return new յ(this.string_ç, this.string_æ, this.º_å, this.arr_ä).õ(new Object[]{this, var5});
   }
}
