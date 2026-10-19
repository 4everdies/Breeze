package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.util.function.Supplier;

public final class ConditionsSetting extends DateUtil {
   public final DateUtil dataBuilder51_d;
   public final String string;
   private Supplier<Boolean> supplier_f;
   private static boolean fieldBool_g;

   public ConditionsSetting(DateUtil var1, String var2) {
      this.dataBuilder51_d = var1;
      this.string = var2;
      this.supplier_f = null;
      var1.processAll_1(this);
   }

   @Override
   public String getString() {
      return this.string;
   }

   public boolean isValid() {
      long var1 = 31828598866686L;
      return this.supplier_f == null ? true : this.supplier_f.get();
   }

   public ConditionsSetting getDataBuilder53(Supplier<Boolean> var1) {
      this.supplier_f = var1;
      return this;
   }

   public ConditionsSetting getDataBuilder53_2(DateUtil var1, boolean var2) {
      long var3 = 128309251754005L;
      String var10000 = DateUtil.getString();
      ConditionsSetting var5 = new ConditionsSetting(var1, this.string);
      String var6 = var10000;

      for (GenericSetting var8 : this.a) {
         var5.a(var8.getDataBuilder54(var5, var2));
         if (var6 == null) {
            break;
         }
      }

      for (DateUtil var10 : this.b) {
         if (var10 instanceof ConditionsSetting) {
            ((ConditionsSetting)var10).getDataBuilder53_2(var5, var2);
         }

         if (var6 == null) {
            break;
         }
      }

      return var5;
   }

   public static void toggle(boolean var0) {
      fieldBool_g = var0;
   }

   public static boolean isValid_2() {
      return fieldBool_g;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid_2();
      return !var0;
   }

   static {
      if (checkCondition()) {
         toggle(true);
      }
   }
}
