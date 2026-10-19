package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public final class SkinLoader {
   public static final Function<String, SkinLoader> CONST_A = SkinLoader::lambda$static_Inner0;
   public final List<WorldUtil6>[] arr_b;
   private static LicenseState[] arr_c;

   public SkinLoader() {
      long var1 = 132228750727356L;
      String[] var10000 = RangeValue.values();
      super();
      String[] var3 = var10000;
      this.arr_b = new List[9];
      int var4 = 0;

      while (var4 < 9) {
         this.arr_b[var4] = new ArrayList<>();
         this.arr_b[var4].add(WorldUtil6.EMPTY);
         var4++;
         if (var3 != null) {
            break;
         }
      }

      this.arr_b[0].set(0, WorldUtil6.SWORD);
   }

   public WorldUtil6 getEnum16Val(int var1) {
      long var2 = 56472378778791L;
      return this.arr_b[var1].isEmpty() ? WorldUtil6.EMPTY : this.arr_b[var1].get(0);
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 66826582054841L;
      String[] var4 = RangeValue.values();
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof SkinLoader)) {
         return false;
      }

      SkinLoader var5 = (SkinLoader)var1;
      int var6 = 0;

      while (var6 < 9) {
         if (!this.arr_b[var6].equals(var5.arr_b[var6])) {
            return false;
         }

         var6++;
         if (var4 != null) {
            break;
         }
      }

      return true;
   }

   @Override
   public int hashCode() {
      long var1 = 73086767566511L;
      String[] var10000 = RangeValue.values();
      int var3 = 0;
      List[] var4 = this.arr_b;
      int var5 = var4.length;
      String[] var6 = var10000;
      int var7 = 0;

      while (var7 < var5) {
         List var8 = var4[var7];
         var3 = var3 * 31 + var8.hashCode();
         var7++;
         if (var6 != null) {
            break;
         }
      }

      return var3;
   }

   @Override
   public String toString() {
      long var1 = 108201054452795L;
      String[] var10000 = RangeValue.values();
      ArrayList var3 = new ArrayList(9);
      List[] var4 = this.arr_b;
      String[] var5 = var10000;

      for (List var8 : var4) {
         ArrayList var9 = new ArrayList(var8.size());
         Iterator var10 = var8.iterator();

         while (true) {
            if (var10.hasNext()) {
               WorldUtil6 var11 = (WorldUtil6)var10.next();
               var9.add(var11.name().toLowerCase());
               if (var5 == null) {
                  continue;
               }
            }

            var3.add(String.join(">", var9));
            if (var5 != null) {
               return String.join(",", var3);
            }
            break;
         }
      }

      return String.join(",", var3);
   }

   private static SkinLoader lambda$static_Inner0(String var0) {
      long var1 = 140146354555379L;
      SkinLoader var3 = new SkinLoader();
      String[] var4 = var0.split(",");
      String[] var10000 = RangeValue.values();
      int var5 = 0;
      String[] var6 = var10000;

      while (var5 < var4.length && var5 < 9) {
         ArrayList var7 = new ArrayList();

         for (String var11 : var4[var5].split(">")) {
            if (!var11.isEmpty()) {
               var7.add(WorldUtil6.valueOf(var11.toUpperCase()));
            }

            if (var6 != null) {
               break;
            }
         }

         if (var7.isEmpty()) {
            var7.add(WorldUtil6.EMPTY);
         }

         var3.arr_b[var5] = var7;
         var5++;
         if (var6 != null) {
            break;
         }
      }

      return var3;
   }

   static {
      LicenseState[] var10000 = new LicenseState[5];
      initialize(var10000);
   }

   public static void initialize(LicenseState[] var0) {
      arr_c = var0;
   }

   public static LicenseState[] values() {
      return arr_c;
   }
}
