package rip.breeze.inject;

import java.util.List;

public class դ {
   public String string_ÿ;
   public List<String> list_þ;

   public դ(String var1, List<String> var2) {
      this.string_ÿ = var1;
      this.list_þ = var2;
   }

   public void invoke_1(Object[] var1) {
      BreezeClass11 var2 = (BreezeClass11)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a ^ var3;
      long var5 = var3 ^ 36510330630586L;
      String var10002 = this.string_ÿ;
      var2.processAll_7(var5, var10002, this.list_þ.toArray(new String[0]));
   }
}
