package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public final class ConfigMap {
   public static final Function<ConfigMap, String> CONST_A = ConfigMap::toString;
   public static final Function<String, ConfigMap> CONST_B = ConfigMap::lambda$static_Inner0;
   private final List<String> list_c;
   private static LicenseState[] arr_d;

   public ConfigMap(String... var1) {
      this(Arrays.asList(var1));
   }

   public ConfigMap(Collection<String> var1) {
      long var2 = 62488161236439L;
      String[] var10000 = RangeValue.values();
      super();
      String[] var4 = var10000;
      ArrayList var5 = new ArrayList(var1.size());

      for (String var7 : var1) {
         if (var7 != null) {
            String var8 = var7.trim();
            if (!var8.isEmpty() && !var5.contains(var8)) {
               var5.add(var8);
            }

            if (var4 != null) {
               break;
            }
         }
      }

      this.list_c = Collections.unmodifiableList(var5);
   }

   public List<String> getList_c() {
      return this.list_c;
   }

   public boolean isValid(String var1) {
      return this.list_c.contains(var1);
   }

   public int getValue() {
      return this.list_c.size();
   }

   public ConfigMap getDataBuilder38(String var1) {
      long var2 = 69051544689349L;
      ArrayList var4 = new ArrayList<>(this.list_c);
      if (!var4.remove(var1)) {
         var4.add(var1);
      }

      return new ConfigMap(var4);
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 118251909322957L;
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof ConfigMap) ? false : this.list_c.equals(((ConfigMap)var1).list_c);
      }
   }

   @Override
   public int hashCode() {
      return this.list_c.hashCode();
   }

   @Override
   public String toString() {
      return String.join(",", this.list_c);
   }

   private static ConfigMap lambda$static_Inner0(String var0) {
      return new ConfigMap(Arrays.asList(var0.split(",")));
   }

   static {
      initialize(null);
   }

   public static void initialize(LicenseState[] var0) {
      arr_d = var0;
   }

   public static LicenseState[] values() {
      return arr_d;
   }
}
