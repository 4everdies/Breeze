package rip.breeze.inject;

import java.util.List;

public class ե {
   public String string_ÿ;
   public int int_þ;
   public List<String> list_ý;

   public ե(String var1, int var2, List<String> var3) {
      this.string_ÿ = var1;
      this.int_þ = var2;
      this.list_ý = var3;
   }

   public void processAll(Object[] var1) {
      BreezeClass11 var4;
      long var5;
      String[] var12;
      label14: {
         long var2 = (Long)var1[0];
         var4 = (BreezeClass11)var1[1];
         var2 = encKey_a ^ var2;
         var5 = var2 ^ 112600211033041L;
         boolean var7 = BreezeClass12.checkCondition();
         List var10003 = this.list_ý;
         if (var7) {
            if (this.list_ý == null) {
               var12 = null;
               break label14;
            }

            var10003 = this.list_ý;
         }

         var12 = var10003.toArray(new String[0]);
      }

      String[] var8 = var12;
      int var9 = this.int_þ;
      String var10 = this.string_ÿ;
      Object[] var10006 = new Object[]{null, var10, var9, var8};
      var10006[0] = var5;
      var4.processAll_5(var10006);
   }
}
