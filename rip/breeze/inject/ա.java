package rip.breeze.inject;

import java.util.List;

public class ա {
   public ճ ճ_ÿ_2;
   public ճ ճ_þ_2;
   public ճ ճ_ý_2;
   public String string_ü_2;
   public List<ø> list_û_2;
   public List<ø> list_ú_2;

   public ա(ճ var1, ճ var2, ճ var3, String var4) {
      this.ճ_ÿ_2 = var1;
      this.ճ_þ_2 = var2;
      this.ճ_ý_2 = var3;
      this.string_ü_2 = var4;
   }

   public void invoke_1(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      boolean var10000 = BreezeClass12.checkCondition();
      int var5 = 1107296256 | var2 << 8;
      boolean var6 = var10000;
      List var12 = this.list_û_2;
      if (var6) {
         if (this.list_û_2 != null) {
            int var7 = 0;
            int var8 = this.list_û_2.size();

            while (var7 < var8) {
               this.list_û_2.get(var7).int_ú = var5;
               var7++;
               var10000 = var6;
               if (var3 >= 0L) {
                  if (!var6) {
                     return;
                  }

                  var10000 = var6;
               }

               if (!var10000) {
                  break;
               }
            }
         }

         if (var3 < 0L) {
            return;
         }

         var12 = this.list_ú_2;
      }

      if (var12 != null) {
         int var10 = 0;
         int var11 = this.list_ú_2.size();

         while (var10 < var11) {
            this.list_ú_2.get(var10).int_ú = var5;
            var10++;
            if (!var6) {
               break;
            }
         }
      }
   }

   public void invoke_2(Object[] var1) {
      Util140 var2;
      long var5;
      long var7;
      long var11;
      boolean var13;
      long var17;
      ª var24;
      ª var10001;
      ª var10002;
      label54: {
         var2 = (Util140)var1[0];
         long var3 = (Long)var1[1];
         var17 = encKey_a_2 ^ var3;
         var5 = var17 ^ 33235704184311L;
         var7 = var17 ^ 122487554584222L;
         long var9 = var17 ^ 77000299369174L;
         var11 = var17 ^ 86825803319133L;
         var13 = BreezeClass12.isValid();
         var10001 = this.ճ_ÿ_2.method_001(new Object[]{var9});
         var10002 = this.ճ_þ_2.method_001(new Object[]{var9});
         ճ var10003 = this.ճ_ý_2;
         if (!var13) {
            if (this.ճ_ý_2 == null) {
               var24 = null;
               break label54;
            }

            var10003 = this.ճ_ý_2;
         }

         var24 = var10003.method_001(new Object[]{var9});
      }

      var2.processAll_21(new Object[]{var10001, var10002, var24, this.string_ü_2, var5});
      List var10000 = this.list_û_2;
      if (!var13) {
         if (this.list_û_2 != null) {
            int var14 = 0;
            int var15 = this.list_û_2.size();

            while (var14 < var15) {
               ø var16 = this.list_û_2.get(var14);
               int var22 = var16.int_ú;
               Object[] var10008 = new Object[]{null, null, var16.և_ù, var16.ü, true};
               var10008[1] = var11;
               var10008[0] = var22;
               var16.ö(new Object[]{var7, var2.getÜ_6(var10008)});
               var14++;
               boolean var21 = var13;
               if (var17 > 0L) {
                  if (var13) {
                     return;
                  }

                  var21 = var13;
               }

               if (var21) {
                  break;
               }
            }
         }

         if (var17 < 0L) {
            return;
         }

         var10000 = this.list_ú_2;
      }

      if (var10000 != null) {
         int var18 = 0;
         int var19 = this.list_ú_2.size();

         while (var18 < var19) {
            ø var20 = this.list_ú_2.get(var18);
            int var23 = var20.int_ú;
            Object[] var25 = new Object[]{null, null, var20.և_ù, var20.ü, false};
            var25[1] = var11;
            var25[0] = var23;
            var20.ö(new Object[]{var7, var2.getÜ_6(var25)});
            var18++;
            if (var13) {
               break;
            }
         }
      }
   }
}
