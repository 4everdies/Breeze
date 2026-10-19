package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import rip.breeze.classtransform.annotations.Mapping;

public class ռ {
   public String[] arr_ÿ_2;
   private final Mapping[] arr_þ_2;

   public ռ(String[] var1, Mapping[] var2) {
      this.arr_ÿ_2 = var1;
      this.arr_þ_2 = var2;
   }

   public boolean check_1(Object[] var1) {
      long var2 = (Long)var1[0];
      Mapping var4 = (Mapping)var1[1];
      var2 = encKey_a_2 ^ var2;
      int var10000 = MathUtil3.getValue_6();
      Mapping[] var5 = this.arr_þ_2;
      int var6 = var10000;
      int var7 = var5.length;
      int var8 = 0;

      while (true) {
         if (var8 < var7) {
            Mapping var9 = var5[var8];
            Mapping var11 = var9;
            Mapping var10001 = var4;
            if (var6 != 0) {
               if (var9 == var4) {
                  break;
               }

               var11 = var9;
               var10001 = Mapping.NONE;
            }

            if (var11 == var10001) {
               break;
            }

            var8++;
            if (var6 != 0) {
               continue;
            }
         }

         return false;
      }

      return true;
   }
}
