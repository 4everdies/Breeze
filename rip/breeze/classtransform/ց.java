package rip.breeze.classtransform;

import java.lang.invoke.MethodHandles;
import java.util.Objects;

public class ց {
   private final String string_ÿ_2;
   private final String string_þ_2;
   private final String string_ý_2;

   public ց(String var1, String var2, String var3) {
      this.string_ÿ_2 = var1;
      this.string_þ_2 = var2;
      this.string_ý_2 = var3;
   }

   public String invoke_1(Object[] var1) {
      return this.string_ÿ_2;
   }

   public String invoke_2(Object[] var1) {
      return this.string_þ_2;
   }

   public String invoke_3(Object[] var1) {
      return this.string_ý_2;
   }

   @Override
   public String toString() {
      long var1 = 127135103863808L;
      int var3 = MathUtil3.getValue_6();
      StringBuilder var10000 = new StringBuilder().append("L").append(this.string_ÿ_2).append(";").append(this.string_þ_2);
      String var10001 = this.string_ý_2;
      if (var3 != 0) {
         var10001 = this.string_ý_2.startsWith("(") ? this.string_ý_2 : ":" + this.string_ý_2;
      }

      return var10000.append(var10001).toString();
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 117103140749687L;
      int var4 = MathUtil3.getValue_5();
      boolean var10000 = (boolean)this;
      if (var4 == 0) {
         if (this == var1) {
            return true;
         }

         var10000 = (boolean)var1;
      }

      if (var10000 != null) {
         var10000 = this.getClass();
         if (var4 == 0) {
            if (var10000 != var1.getClass()) {
               return false;
            }

            var10000 = var1;
         }

         ց var5 = (ց)var10000;
         var10000 = Objects.equals(this.string_ÿ_2, var5.string_ÿ_2);
         if (var4 == 0) {
            if (!var10000) {
               return false;
            }

            var10000 = Objects.equals(this.string_þ_2, var5.string_þ_2);
         }

         if (var4 == 0) {
            if (!var10000) {
               return false;
            }

            var10000 = Objects.equals(this.string_ý_2, var5.string_ý_2);
         }

         return var4 != 0 ? var10000 : var10000;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.string_ÿ_2, this.string_þ_2, this.string_ý_2);
   }

   public boolean check_4(Object[] var1) {
      rip.breeze.inject.պ var2 = (rip.breeze.inject.պ)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      int var5 = MathUtil3.getValue_5();
      boolean var10000 = this.string_ÿ_2.equals(var2.string_ç_2);
      if (var5 == 0) {
         if (!var10000) {
            return false;
         }

         var10000 = this.string_þ_2.equals(var2.string_æ_2);
      }

      int var10001 = var5;
      if (var3 > 0L) {
         if (var5 == 0) {
            if (!var10000) {
               return false;
            }

            var10000 = this.string_ý_2.equals(var2.string_å_2);
         }

         var10001 = var5;
      }

      return var10001 != 0 ? var10000 : var10000;
   }

   public boolean check_5(Object[] var1) {
      rip.breeze.inject.կ var2 = (rip.breeze.inject.կ)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_a_2 ^ var3;
      int var5 = MathUtil3.getValue_5();
      boolean var10000 = this.string_ÿ_2.equals(var2.string_ç_2);
      if (var5 == 0) {
         if (!var10000) {
            return false;
         }

         var10000 = this.string_þ_2.equals(var2.string_æ_2);
      }

      int var10001 = var5;
      if (var3 >= 0L) {
         if (var5 == 0) {
            if (!var10000) {
               return false;
            }

            var10000 = this.string_ý_2.equals(var2.string_å_2);
         }

         var10001 = var5;
      }

      return var10001 != 0 ? var10000 : var10000;
   }

   public boolean check_6(Object[] var1) {
      String var2 = (String)var1[0];
      String var3 = (String)var1[1];
      long var4 = (Long)var1[2];
      String var6 = (String)var1[3];
      var4 = encKey_a_2 ^ var4;
      int var7 = MathUtil3.getValue_6();
      boolean var10000 = this.string_ÿ_2.equals(var2);
      if (var7 != 0) {
         if (!var10000) {
            return false;
         }

         var10000 = this.string_þ_2.equals(var3);
      }

      int var10001 = var7;
      if (var4 >= 0L) {
         if (var7 != 0) {
            if (!var10000) {
               return false;
            }

            var10000 = this.string_ý_2.equals(var6);
         }

         var10001 = var7;
      }

      return var10001 == 0 ? var10000 : var10000;
   }

   public boolean check_7(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_a_2 ^ var2;
      int var4 = MathUtil3.getValue_6();
      boolean var10000 = this.string_ý_2.startsWith("(");
      if (var4 != 0) {
         var10000 = !var10000;
      }

      return var10000;
   }

   public boolean check_8(Object[] var1) {
      return this.string_ý_2.startsWith("(");
   }
}
