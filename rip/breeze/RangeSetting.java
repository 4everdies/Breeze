package rip.breeze;

import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(name = "RangeSetting", superName = "Setting", description = "A range setting.", group = "breeze/settings")
public class RangeSetting extends Setting<RangeValue> {
   public RangeSetting(GenericSetting<RangeValue> var1) {
      super(var1, null);
   }

   @JSConstructor(
      params = {
            "Can either be 'script' or a subgroup.",
            "The name of the setting.",
            "The description of the setting.",
            "The default minimum value.",
            "The default maximum value.",
            "The minimum allowed value.",
            "The maximum allowed value.",
            "The step size between values."
      }
   )
   public RangeSetting(Object var1, String var2, String var3, double var4, double var6, double var8, double var10, double var12) {
      super(
         GenericSetting.<RangeValue>getDataBuilder50(b(var1), var2)
            .getDataBuilder50_3(var3)
            .getDataBuilder50_4(new RangeValue(var4, var6))
            .clamp(RangeValue.getPredicate(var8, var10, var12))
      );
   }

   @JSFunction(value = "getMin", returns = "The minimum value of the setting.")
   public double getDouble() {
      return ((RangeValue)this.i.getObject_m()).double_d;
   }

   @JSFunction(value = "getMax", returns = "The maximum value of the setting.")
   public double getDouble_2() {
      return ((RangeValue)this.i.getObject_m()).double_c;
   }

   @JSFunction(value = "random", returns = "A random value within the selected range")
   public double getDouble_3() {
      return ((RangeValue)this.i.getObject_m()).calculateDouble_2();
   }
}
