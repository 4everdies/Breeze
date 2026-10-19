package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import rip.breeze.inject.BreezeClass12;
import rip.breeze.inject.ù;

public class չ {
   private static String[] arr_ÿ_2;

   public static Map invoke_1(Object[] var0) {
      List var1 = (List)var0[0];
      long var2 = (Long)var0[1];
      var2 = encKey_a_2 ^ var2;
      String[] var10000 = method_069();
      HashMap var4 = new HashMap();
      String[] var5 = var10000;
      if (var1 != null) {
         byte var6 = 0;

         while (var6 < var1.size()) {
            Object var10001 = var5;
            if (var2 > 0L) {
               if (var5 == null) {
                  return var4;
               }

               var10001 = var1.get(var6);
            }

            var4.put((String)var10001, var1.get(var6 + 1));
            var6 += 2;
            if (var5 == null) {
               break;
            }
         }
      }

      return var4;
   }

   public static List invoke_2(Object[] var0) {
      long var1 = (Long)var0[0];
      Map var3 = (Map)var0[1];
      var1 = encKey_a_2 ^ var1;
      String[] var10000 = method_069();
      ArrayList var4 = new ArrayList();
      String[] var5 = var10000;
      Map var9 = var3;
      if (var5 != null) {
         if (var3 == null) {
            return var4;
         }

         var9 = var3;
      }

      for (Entry var7 : var9.entrySet()) {
         var4.add(var7.getKey());
         Object var10001 = var5;
         if (var1 > 0L) {
            if (var5 == null) {
               return var4;
            }

            var10001 = var7.getValue();
         }

         var4.add(var10001);
         if (var5 == null) {
            break;
         }
      }

      return var4;
   }

   public static void invoke_3(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var0[1];
      Consumer var4 = (Consumer)var0[2];
      var1 = encKey_a_2 ^ var1;
      String[] var5 = method_069();
      List var10000 = var3.list_ï_2;
      if (var5 != null) {
         if (var3.list_ï_2 == null) {
            return;
         }

         var10000 = var3.list_ï_2;
      }

      for (ù var7 : var10000) {
         var4.accept(var7);
         if (var5 == null) {
            break;
         }
      }
   }

   public static void invoke_4(Object[] var0) {
      rip.breeze.inject.á var1 = (rip.breeze.inject.á)var0[0];
      long var2 = (Long)var0[1];
      Consumer var4 = (Consumer)var0[2];
      var2 = encKey_a_2 ^ var2;
      String[] var5 = method_069();
      List var10000 = var1.list_ø_2;
      if (var5 != null) {
         if (var1.list_ø_2 == null) {
            return;
         }

         var10000 = var1.list_ø_2;
      }

      for (ù var7 : var10000) {
         var4.accept(var7);
         if (var5 == null) {
            break;
         }
      }
   }

   public static void invoke_5(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      Consumer var4 = (Consumer)var0[2];
      var1 = encKey_a_2 ^ var1;
      String[] var5 = method_069();
      List var10000 = var3.list_ô;
      if (var5 != null) {
         if (var3.list_ô == null) {
            return;
         }

         var10000 = var3.list_ô;
      }

      for (ù var7 : var10000) {
         var4.accept(var7);
         if (var5 == null) {
            break;
         }
      }
   }

   public static void invoke_6(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      Consumer var2 = (Consumer)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      String[] var5 = method_069();
      List var10000 = var1.list_î_2;
      if (var5 != null) {
         if (var1.list_î_2 == null) {
            return;
         }

         var10000 = var1.list_î_2;
      }

      for (ù var7 : var10000) {
         var2.accept(var7);
         if (var5 == null) {
            break;
         }
      }
   }

   public static void invoke_7(Object[] var0) {
      rip.breeze.inject.á var1 = (rip.breeze.inject.á)var0[0];
      Consumer var2 = (Consumer)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      String[] var5 = method_069();
      List var10000 = var1.list_ö_2;
      if (var5 != null) {
         if (var1.list_ö_2 == null) {
            return;
         }

         var10000 = var1.list_ö_2;
      }

      for (ù var7 : var10000) {
         var2.accept(var7);
         if (var5 == null) {
            break;
         }
      }
   }

   public static void invoke_8(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      long var2 = (Long)var0[1];
      Consumer var4 = (Consumer)var0[2];
      var2 = encKey_a_2 ^ var2;
      String[] var5 = method_069();
      List var10000 = var1.list_ó;
      if (var5 != null) {
         if (var1.list_ó == null) {
            return;
         }

         var10000 = var1.list_ó;
      }

      for (ù var7 : var10000) {
         var4.accept(var7);
         if (var5 == null) {
            break;
         }
      }
   }

   public static void invoke_9(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var0[1];
      Consumer var4 = (Consumer)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 75869495318069L;
      long var7 = var1 ^ 81528086871626L;
      method_003(new Object[]{var5, var3, var4});
      method_006(new Object[]{var3, var4, var7});
   }

   public static void invoke_10(Object[] var0) {
      rip.breeze.inject.á var1 = (rip.breeze.inject.á)var0[0];
      Consumer var2 = (Consumer)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 116561094562689L;
      long var7 = var3 ^ 118998679899528L;
      method_004(new Object[]{var1, var5, var2});
      method_007(new Object[]{var1, var2, var7});
   }

   public static void invoke_11(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      Consumer var4 = (Consumer)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 65316670257988L;
      long var7 = var1 ^ 51122267946277L;
      method_005(new Object[]{var5, var3, var4});
      method_008(new Object[]{var3, var7, var4});
   }

   public static Optional invoke_12(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      long var2 = (Long)var0[1];
      Class var4 = (Class)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 129568673330027L;
      List var10001 = var1.list_ï_2;
      return method_036(new Object[]{var5, var10001, var4});
   }

   public static Optional invoke_13(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 23852387247807L;
      List var10001 = var1.list_ï_2;
      return method_037(new Object[]{var5, var10001, var2});
   }

   public static Optional invoke_14(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.á var3 = (rip.breeze.inject.á)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 134876992228544L;
      List var10001 = var3.list_ø_2;
      return method_036(new Object[]{var5, var10001, var4});
   }

   public static Optional invoke_15(Object[] var0) {
      rip.breeze.inject.á var1 = (rip.breeze.inject.á)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 14131163995083L;
      List var10001 = var1.list_ø_2;
      return method_037(new Object[]{var5, var10001, var4});
   }

   public static Optional invoke_16(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 93942524818977L;
      List var10001 = var3.list_ô;
      return method_036(new Object[]{var5, var10001, var4});
   }

   public static Optional invoke_17(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 132500570242624L;
      List var10001 = var1.list_ô;
      return method_037(new Object[]{var5, var10001, var2});
   }

   public static Optional invoke_18(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 116773207795380L;
      List[] var10001 = var3.arr_í;
      return method_038(new Object[]{var5, var10001, var4});
   }

   public static Optional invoke_19(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 82769996761819L;
      return method_039(new Object[]{var1.arr_í, var5, var2});
   }

   public static Optional invoke_20(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 73661061670326L;
      List var10001 = var3.list_î_2;
      return method_036(new Object[]{var5, var10001, var4});
   }

   public static Optional invoke_21(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 68640968279470L;
      List var10001 = var1.list_î_2;
      return method_037(new Object[]{var5, var10001, var4});
   }

   public static Optional invoke_22(Object[] var0) {
      rip.breeze.inject.á var1 = (rip.breeze.inject.á)var0[0];
      Class var2 = (Class)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 58952564006875L;
      List var10001 = var1.list_ö_2;
      return method_036(new Object[]{var5, var10001, var2});
   }

   public static Optional invoke_23(Object[] var0) {
      rip.breeze.inject.á var1 = (rip.breeze.inject.á)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 107079645092550L;
      List var10001 = var1.list_ö_2;
      return method_037(new Object[]{var5, var10001, var2});
   }

   public static Optional invoke_24(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 107782603441865L;
      List var10001 = var3.list_ó;
      return method_036(new Object[]{var5, var10001, var4});
   }

   public static Optional invoke_25(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 109436440098865L;
      List var10001 = var3.list_ó;
      return method_037(new Object[]{var5, var10001, var4});
   }

   public static Optional invoke_26(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      long var2 = (Long)var0[1];
      Class var4 = (Class)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 37416010391596L;
      List[] var10001 = var1.arr_ë;
      return method_038(new Object[]{var5, var10001, var4});
   }

   public static Optional invoke_27(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 139124487458684L;
      return method_039(new Object[]{var1.arr_ë, var5, var4});
   }

   public static Optional invoke_28(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      Class var2 = (Class)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 112424271541854L;
      long var7 = var3 ^ 89158472278147L;
      String[] var10000 = method_069();
      Optional var9 = method_012(new Object[]{var1, var5, var2});
      String[] var10 = var10000;
      Optional var12 = var9;
      if (var10 != null) {
         if (var9.isPresent()) {
            return var9;
         }

         var12 = method_020(new Object[]{var7, var1, var2});
      }

      return var12;
   }

   public static Optional invoke_29(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 68173731119502L;
      long var7 = var3 ^ 24037969322655L;
      String[] var10000 = method_069();
      Optional var9 = method_013(new Object[]{var1, var2, var7});
      String[] var10 = var10000;
      Optional var12 = var9;
      if (var10 != null) {
         if (var9.isPresent()) {
            return var9;
         }

         var12 = method_021(new Object[]{var1, var5, var2});
      }

      return var12;
   }

   public static Optional invoke_30(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.á var3 = (rip.breeze.inject.á)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 120457242165000L;
      long var7 = var1 ^ 38176533392403L;
      String[] var10000 = method_069();
      Optional var9 = method_014(new Object[]{var5, var3, var4});
      String[] var10 = var10000;
      Optional var12 = var9;
      if (var10 != null) {
         if (var9.isPresent()) {
            return var9;
         }

         var12 = method_022(new Object[]{var3, var4, var7});
      }

      return var12;
   }

   public static Optional invoke_31(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.á var3 = (rip.breeze.inject.á)var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 43369397267057L;
      long var7 = var1 ^ 82227127085948L;
      String[] var10000 = method_069();
      Optional var9 = method_015(new Object[]{var3, var5, var4});
      String[] var10 = var10000;
      Optional var12 = var9;
      if (var10 != null) {
         if (var9.isPresent()) {
            return var9;
         }

         var12 = method_023(new Object[]{var3, var4, var7});
      }

      return var12;
   }

   public static Optional invoke_32(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 135103651818411L;
      long var7 = var1 ^ 85314696911683L;
      String[] var10000 = method_069();
      Optional var9 = method_016(new Object[]{var5, var3, var4});
      String[] var10 = var10000;
      Optional var12 = var9;
      if (var10 != null) {
         if (var9.isPresent()) {
            return var9;
         }

         var12 = method_024(new Object[]{var7, var3, var4});
      }

      return var12;
   }

   public static Optional invoke_33(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      int var2 = (Integer)var0[1];
      String var3 = (String)var0[2];
      int var4 = (Integer)var0[3];
      int var5 = (Integer)var0[4];
      long var6 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ encKey_a_2;
      long var8 = var6 ^ 3959404444049L;
      long var10 = var6 ^ 27022989328352L;
      String[] var10000 = method_069();
      Optional var12 = method_017(new Object[]{var1, var3, var10});
      String[] var13 = var10000;
      Optional var14 = var12;
      if (var13 != null) {
         if (var12.isPresent()) {
            return var12;
         }

         var14 = method_025(new Object[]{var8, var1, var3});
      }

      return var14;
   }

   public static Optional invoke_34(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      long var2 = (Long)var0[1];
      Class var4 = (Class)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 14423201674259L;
      long var7 = var2 ^ 76063071548043L;
      String[] var10000 = method_069();
      Optional var9 = method_018(new Object[]{var5, var1, var4});
      String[] var10 = var10000;
      Optional var12 = var9;
      if (var10 != null) {
         if (var9.isPresent()) {
            return var9;
         }

         var12 = method_026(new Object[]{var1, var7, var4});
      }

      return var12;
   }

   public static Optional invoke_35(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 73665360026229L;
      long var7 = var3 ^ 131050600341458L;
      String[] var10000 = method_069();
      Optional var9 = method_019(new Object[]{var1, var2, var7});
      String[] var10 = var10000;
      Optional var12 = var9;
      if (var10 != null) {
         if (var9.isPresent()) {
            return var9;
         }

         var12 = method_027(new Object[]{var1, var5, var2});
      }

      return var12;
   }

   public static Optional invoke_36(Object[] var0) {
      long var1 = (Long)var0[0];
      List var3 = (List)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 134976896943562L;
      long var7 = var1 ^ 68049511869413L;
      return method_037(new Object[]{var5, var3, ջ.method_006(new Object[]{var7, var4})});
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static Optional invoke_37(Object[] var0) {
      long var1 = (Long)var0[0];
      List var3 = (List)var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_a_2 ^ var1;
      String[] var5 = method_069();
      List var10000 = var3;
      if (var5 != null) {
         if (var3 == null) {
            return Optional.empty();
         }

         var10000 = var3;
      }

      Iterator var6 = var10000.iterator();

      label36:
      while (true) {
         Object var9;
         if (var6.hasNext()) {
            var9 = var6.next();
         } else {
            var9 = Optional.empty();
            if (var1 >= 0L) {
               return (Optional)var9;
            }
         }

         do {
            ù var7 = (ù)var9;
            if (var5 == null) {
               return Optional.of(var7);
            }

            if (var7.string_ü_2.equals(var4)) {
               return Optional.of(var7);
            }

            if (var5 != null) {
               continue label36;
            }

            var9 = Optional.empty();
         } while (var1 < 0L);

         return (Optional)var9;
      }
   }

   public static Optional invoke_38(Object[] var0) {
      long var1 = (Long)var0[0];
      List[] var3 = (List[])var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 22708892082598L;
      long var7 = var1 ^ 5547533833111L;
      return method_039(new Object[]{var3, var7, ջ.method_006(new Object[]{var5, var4})});
   }

   public static Optional invoke_39(Object[] var0) {
      List[] var1 = (List[])var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 109912331836333L;
      String[] var7 = method_069();
      List[] var10000 = var1;
      if (var7 != null) {
         if (var1 == null) {
            return Optional.empty();
         }

         var10000 = var1;
      }

      ù[] var8 = new ù[var10000.length];
      boolean var9 = false;
      int var10 = 0;

      while (true) {
         if (var10 < var1.length) {
            Optional var11 = method_037(new Object[]{var5, var1[var10], var4});
            var8[var10] = (ù)var11.orElse(null);
            String[] var13 = var7;
            if (var2 > 0L) {
               if (var7 != null) {
                  var14 = var11.isPresent();
                  if (var7 == null) {
                     break;
                  }

                  if (var14) {
                     var9 = true;
                  }

                  var10++;
               }

               var13 = var7;
            }

            if (var13 != null) {
               continue;
            }
         }

         if (var2 <= 0L) {
            return Optional.of(var8);
         }

         var14 = var9;
         break;
      }

      return !var14 ? Optional.empty() : Optional.of(var8);
   }

   public static boolean check_40(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      Class var2 = (Class)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 124432788119385L;
      return method_012(new Object[]{var1, var5, var2}).isPresent();
   }

   public static boolean check_41(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 68519794738842L;
      return method_013(new Object[]{var1, var2, var5}).isPresent();
   }

   public static boolean check_42(Object[] var0) {
      rip.breeze.inject.á var1 = (rip.breeze.inject.á)var0[0];
      Class var2 = (Class)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 43639743305787L;
      return method_014(new Object[]{var5, var1, var2}).isPresent();
   }

   public static boolean check_43(Object[] var0) {
      rip.breeze.inject.á var1 = (rip.breeze.inject.á)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 50584294814626L;
      return method_015(new Object[]{var1, var5, var2}).isPresent();
   }

   public static boolean check_44(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      long var2 = (Long)var0[1];
      Class var4 = (Class)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 138531389587411L;
      return method_016(new Object[]{var5, var1, var4}).isPresent();
   }

   public static boolean check_45(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 70086318246054L;
      return method_017(new Object[]{var1, var4, var5}).isPresent();
   }

   public static boolean check_46(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      long var2 = (Long)var0[1];
      Class var4 = (Class)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 19803942617312L;
      return method_018(new Object[]{var5, var1, var4}).isPresent();
   }

   public static boolean check_47(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 47501091097274L;
      return method_019(new Object[]{var3, var4, var5}).isPresent();
   }

   public static boolean check_48(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      long var2 = (Long)var0[1];
      Class var4 = (Class)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 65771526461961L;
      return method_020(new Object[]{var5, var1, var4}).isPresent();
   }

   public static boolean check_49(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 21836098274672L;
      return method_021(new Object[]{var3, var5, var4}).isPresent();
   }

   public static boolean check_50(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.á var3 = (rip.breeze.inject.á)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 19694186852336L;
      return method_022(new Object[]{var3, var4, var5}).isPresent();
   }

   public static boolean check_51(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.á var3 = (rip.breeze.inject.á)var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 111522893597204L;
      return method_023(new Object[]{var3, var4, var5}).isPresent();
   }

   public static boolean check_52(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 41676397674532L;
      return method_024(new Object[]{var5, var3, var4}).isPresent();
   }

   public static boolean check_53(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 33656439641235L;
      return method_025(new Object[]{var5, var3, var4}).isPresent();
   }

   public static boolean check_54(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 28716591657896L;
      return method_026(new Object[]{var3, var5, var4}).isPresent();
   }

   public static boolean check_55(Object[] var0) {
      long var1 = (Long)var0[0];
      BreezeClass12 var3 = (BreezeClass12)var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 66482052659123L;
      return method_027(new Object[]{var3, var5, var4}).isPresent();
   }

   public static boolean check_56(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      long var2 = (Long)var0[1];
      Class var4 = (Class)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 8903428790791L;
      return method_028(new Object[]{var1, var4, var5}).isPresent();
   }

   public static boolean check_57(Object[] var0) {
      rip.breeze.inject.é var1 = (rip.breeze.inject.é)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 74621166529453L;
      return method_029(new Object[]{var1, var2, var5}).isPresent();
   }

   public static boolean check_58(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.á var3 = (rip.breeze.inject.á)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 49915014422252L;
      return method_030(new Object[]{var5, var3, var4}).isPresent();
   }

   public static boolean check_59(Object[] var0) {
      long var1 = (Long)var0[0];
      rip.breeze.inject.á var3 = (rip.breeze.inject.á)var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 64697705389386L;
      return method_031(new Object[]{var5, var3, var4}).isPresent();
   }

   public static boolean check_60(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      long var2 = (Long)var0[1];
      Class var4 = (Class)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 66966392786773L;
      return method_032(new Object[]{var5, var1, var4}).isPresent();
   }

   public static boolean check_61(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var10001 = var3 ^ 16898512112788L;
      int var5 = (int)((var3 ^ 16898512112788L) >>> 32);
      int var6 = (int)((var3 ^ 16898512112788L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      Object[] var10006 = new Object[]{null, null, null, null, var7};
      var10006[3] = var6;
      var10006[2] = var2;
      var10006[1] = var5;
      var10006[0] = var1;
      return method_033(var10006).isPresent();
   }

   public static boolean check_62(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      long var2 = (Long)var0[1];
      Class var4 = (Class)var0[2];
      var2 = encKey_a_2 ^ var2;
      long var5 = var2 ^ 94434548054441L;
      return method_034(new Object[]{var1, var5, var4}).isPresent();
   }

   public static boolean check_63(Object[] var0) {
      BreezeClass12 var1 = (BreezeClass12)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 39478719393726L;
      return method_035(new Object[]{var1, var2, var5}).isPresent();
   }

   public static boolean check_64(Object[] var0) {
      long var1 = (Long)var0[0];
      List var3 = (List)var0[1];
      Class var4 = (Class)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 52656090800761L;
      return method_036(new Object[]{var5, var3, var4}).isPresent();
   }

   public static boolean check_65(Object[] var0) {
      long var1 = (Long)var0[0];
      List var3 = (List)var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 103211606323486L;
      return method_037(new Object[]{var5, var3, var4}).isPresent();
   }

   public static boolean check_66(Object[] var0) {
      List[] var1 = (List[])var0[0];
      Class var2 = (Class)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a_2 ^ var3;
      long var5 = var3 ^ 128506308585975L;
      return method_038(new Object[]{var5, var1, var2}).isPresent();
   }

   public static boolean check_67(Object[] var0) {
      long var1 = (Long)var0[0];
      List[] var3 = (List[])var0[1];
      String var4 = (String)var0[2];
      var1 = encKey_a_2 ^ var1;
      long var5 = var1 ^ 7629123219513L;
      return method_039(new Object[]{var3, var5, var4}).isPresent();
   }

   public static void execute_68(String[] var0) {
      arr_ÿ_2 = var0;
   }

   public static String[] invoke_69() {
      return arr_ÿ_2;
   }

   static {
      if (method_069() == null) {
         method_068(new String[1]);
      }
   }
}
