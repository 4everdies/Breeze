package rip.breeze;

import java.lang.invoke.MethodHandles;

public class ConfigUtil2_x extends Util28 {
   final boolean fieldBool_j;
   private static boolean fieldBool_k;

   public ConfigUtil2_x(boolean var1) {
      this.fieldBool_j = var1;
   }

   public ConfigUtil2_x() {
      this(false);
   }

   public void noOp() {
   }

   @Override
   public void noOp_2() {
   }

   public boolean isValid() {
      return false;
   }

   public boolean checkCondition(int var1) {
      long var2 = 45508263211567L;
      if (!this.fieldBool_j) {
         return super.checkCondition_3(var1);
      } else {
         boolean var4 = super.checkCondition_3(var1);
         if (!var4 && var1 == BreezeContext.iKeyCodeProvider_g.getKeyCode_BACK()) {
            BreezeContext.guiPanelSettings_f.dataBuilder100_r.calculate_3();
            return true;
         } else {
            return var4;
         }
      }
   }

   public static void toggle(boolean var0) {
      fieldBool_k = var0;
   }

   public static boolean isValid_2() {
      return fieldBool_k;
   }

   public static boolean checkCondition_2() {
      boolean var0 = isValid_2();
      return !var0;
   }

   static {
      if (isValid_2()) {
         toggle(true);
      }
   }
}
