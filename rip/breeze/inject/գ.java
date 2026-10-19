package rip.breeze.inject;

public class գ {
   public String string_ÿ;
   public int int_þ;
   public String string_ý;

   public գ(String var1, int var2, String var3) {
      this.string_ÿ = var1;
      this.int_þ = var2;
      this.string_ý = var3;
   }

   public void invoke_1(Object[] var1) {
      BreezeClass11 var2 = (BreezeClass11)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a ^ var3;
      long var5 = var3 ^ 49711902925017L;
      String var10001 = this.string_ÿ;
      int var10002 = this.int_þ;
      String var10004 = this.string_ý;
      Object[] var10006 = new Object[]{null, null, var5, var10004};
      var10006[1] = var10002;
      var10006[0] = var10001;
      var2.processAll_3(var10006);
   }
}
