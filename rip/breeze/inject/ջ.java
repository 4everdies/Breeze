package rip.breeze.inject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class ջ {
   public static final int CONST_Ÿ_2 = 0;
   public static final int CONST_Þ_2 = 1;
   public static final int CONST_Ý_2 = 2;
   public static final int CONST_Ü_2 = 3;
   public static final int CONST_Û_2 = 4;
   public static final int CONST_Ú_2 = 5;
   public static final int CONST_Ù_2 = 6;
   public static final int CONST_Ø_2 = 7;
   public static final int CONST_Ö_2 = 8;
   public static final int CONST_Õ_2 = 9;
   public static final int CONST_Ô_2 = 10;
   public static final int CONST_Ó_2 = 11;
   public static final int CONST_Ò_2 = 12;
   public static final int CONST_Ñ_2 = 13;
   public static final int CONST_Ð_2 = 14;
   public static final int CONST_Ï_2 = 15;
   protected int int_î_2;
   public List<ø> list_í_2;
   public List<ø> list_ì_2;
   ջ ջ_ë_2;
   ջ ջ_ê_2;
   int int_é_2;
   private static boolean bool_è_2;

   protected ջ(int var1) {
      this.int_î_2 = var1;
      this.int_é_2 = -1;
   }

   public int invoke_4(Object[] var1) {
      return this.int_î_2;
   }

   public abstract int invoke_1(Object[] var1);

   public ջ invoke_5(Object[] var1) {
      return this.ջ_ë_2;
   }

   public ջ invoke_6(Object[] var1) {
      return this.ջ_ê_2;
   }

   public abstract void invoke_2(Object[] var1);

   protected final void invoke_7(Object[] var1) {
      Util140 var2 = (Util140)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 114045239038617L;
      long var7 = var3 ^ 67493589965843L;
      boolean var9 = BreezeClass12.checkCondition();
      List var10000 = this.list_í_2;
      if (var9) {
         if (this.list_í_2 != null) {
            int var10 = 0;
            int var11 = this.list_í_2.size();

            while (var10 < var11) {
               ø var12 = this.list_í_2.get(var10);
               int var10002 = var12.int_ú;
               և var10003 = var12.և_ù;
               String var10004 = var12.ü;
               Object[] var10008 = new Object[]{null, null, null, null, true};
               var10008[3] = var5;
               var10008[2] = var10004;
               var10008[1] = var10003;
               var10008[0] = var10002;
               var12.ö(new Object[]{var7, var2.getÜ_5(var10008)});
               var10++;
               boolean var17 = var9;
               if (var3 > 0L) {
                  if (!var9) {
                     return;
                  }

                  var17 = var9;
               }

               if (!var17) {
                  break;
               }
            }
         }

         if (var3 <= 0L) {
            return;
         }

         var10000 = this.list_ì_2;
      }

      if (var10000 != null) {
         int var14 = 0;
         int var15 = this.list_ì_2.size();

         while (var14 < var15) {
            ø var16 = this.list_ì_2.get(var14);
            int var18 = var16.int_ú;
            և var19 = var16.և_ù;
            String var20 = var16.ü;
            Object[] var21 = new Object[]{null, null, null, null, false};
            var21[3] = var5;
            var21[2] = var20;
            var21[1] = var19;
            var21[0] = var18;
            var16.ö(new Object[]{var7, var2.getÜ_5(var21)});
            var14++;
            if (!var9) {
               break;
            }
         }
      }
   }

   public abstract ջ invoke_3(Object[] var1);

   static ճ invoke_8(Object[] var0) {
      ճ var1 = (ճ)var0[0];
      Map var2 = (Map)var0[1];
      return (ճ)var2.get(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static ճ[] invoke_9(Object[] var0) {
      long var1 = (Long)var0[0];
      List var3 = (List)var0[1];
      Map var4 = (Map)var0[2];
      var1 = encKey_a_2 ^ var1;
      byte var10000 = BreezeClass12.isValid();
      ճ[] var5 = new ճ[var3.size()];
      int var6 = 0;
      int var7 = var5.length;
      byte var8 = var10000;

      label28:
      while (true) {
         if (var6 < var7) {
            var10 = var5;
            int var10001 = var8;
            if (var1 > 0L) {
               if (var8 != 0) {
                  break;
               }

               var10001 = var6;
            }

            var5[var10001] = (ճ)var4.get(var3.get(var6));
            var6++;
            if (var8 == 0) {
               continue;
            }
         }

         while (var1 < 0L) {
            if (var8 == 0) {
               continue label28;
            }
         }

         var10 = var5;
         break;
      }

      return var10;
   }

   protected final ջ invoke_10(Object[] var1) {
      ջ var2 = (ջ)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 8146933285170L;
      long var7 = var3 ^ 103036999494950L;
      boolean var9 = BreezeClass12.isValid();
      List var10000 = var2.list_í_2;
      if (!var9) {
         if (var2.list_í_2 != null) {
            this.list_í_2 = new ArrayList<>();
            int var10 = 0;
            int var11 = var2.list_í_2.size();

            while (var10 < var11) {
               ø var12 = var2.list_í_2.get(var10);
               ø var13 = new ø(var7, var12.int_ú, var12.և_ù, var12.ü);
               var12.ö(new Object[]{var5, var13});
               this.list_í_2.add(var13);
               var10++;
               boolean var19 = var9;
               if (var3 >= 0L) {
                  if (var9) {
                     return this;
                  }

                  var19 = var9;
               }

               if (var19) {
                  break;
               }
            }
         }

         if (var3 < 0L || var9) {
            return var2;
         }

         var10000 = var2.list_ì_2;
      }

      if (var10000 != null) {
         this.list_ì_2 = new ArrayList<>();
         int var15 = 0;
         int var16 = var2.list_ì_2.size();

         while (var15 < var16) {
            ø var17 = var2.list_ì_2.get(var15);
            ø var18 = new ø(var7, var17.int_ú, var17.և_ù, var17.ü);
            var17.ö(new Object[]{var5, var18});
            if (var3 >= 0L) {
               if (var9) {
                  return this;
               }

               this.list_ì_2.add(var18);
               var15++;
            }

            if (var9) {
               break;
            }
         }
      }

      return this;
   }

   public static void execute_11(boolean var0) {
      bool_è_2 = var0;
   }

   public static boolean check_12() {
      return bool_è_2;
   }

   public static boolean check_13() {
      boolean var0 = method_012();
      return !var0;
   }

   static {
      if (method_012()) {
         method_011(true);
      }
   }
}
