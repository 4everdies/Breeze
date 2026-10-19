package rip.breeze.inject;

public class բ {
   public String string_ÿ;
   public int int_þ;

   public բ(String var1, int var2) {
      this.string_ÿ = var1;
      this.int_þ = var2;
   }

   public void invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      Util140 var4 = (Util140)var1[1];
      var2 = encKey_a ^ var2;
      long var5 = var2 ^ 128070786739257L;
      String var10001 = this.string_ÿ;
      Object[] var10005 = new Object[]{null, null, this.int_þ};
      var10005[1] = var5;
      var10005[0] = var10001;
      var4.processAll(var10005);
   }
}
