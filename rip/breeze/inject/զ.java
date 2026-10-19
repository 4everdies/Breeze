package rip.breeze.inject;

import java.util.List;

public class զ {
   public String string_ÿ;
   public int int_þ;
   public List<String> list_ý;

   public զ(String var1, int var2, List<String> var3) {
      this.string_ÿ = var1;
      this.int_þ = var2;
      this.list_ý = var3;
   }

   public void processAll(Object[] var1) {
      BreezeClass11 var2;
      long var5;
      String[] var9;
      String var10001;
      int var10002;
      label14: {
         var2 = (BreezeClass11)var1[0];
         long var3 = (Long)var1[1];
         var3 = encKey_a ^ var3;
         var5 = var3 ^ 126477360388586L;
         boolean var7 = BreezeClass12.checkCondition();
         var10001 = this.string_ÿ;
         var10002 = this.int_þ;
         List var10003 = this.list_ý;
         if (var7) {
            if (this.list_ý == null) {
               var9 = null;
               break label14;
            }

            var10003 = this.list_ý;
         }

         var9 = var10003.toArray(new String[0]);
      }

      Object[] var10006 = new Object[]{null, null, var5, var9};
      var10006[1] = var10002;
      var10006[0] = var10001;
      var2.processAll_4(var10006);
   }
}
