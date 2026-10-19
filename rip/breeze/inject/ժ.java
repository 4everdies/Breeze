package rip.breeze.inject;

public class ժ {
   public String string_ÿ_2;
   public String string_þ_2;
   public String string_ý_2;
   public int int_ü_2;

   public ժ(String var1, String var2, String var3, int var4) {
      this.string_ÿ_2 = var1;
      this.string_þ_2 = var2;
      this.string_ý_2 = var3;
      this.int_ü_2 = var4;
   }

   public void invoke_1(Object[] var1) {
      î var2 = (î)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 24217757842323L;
      String var10001 = this.string_ÿ_2;
      String var10002 = this.string_þ_2;
      String var10003 = this.string_ý_2;
      Object[] var10007 = new Object[]{null, null, null, null, this.int_ü_2};
      var10007[3] = var5;
      var10007[2] = var10003;
      var10007[1] = var10002;
      var10007[0] = var10001;
      var2.method_011(var10007);
   }
}
