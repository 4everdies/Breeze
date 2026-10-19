package rip.breeze;

import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(name = "DoubleSetting", superName = "Setting", description = "A double setting.", group = "breeze/settings")
public class DoubleSetting extends Setting<Double> {
   public DoubleSetting(GenericSetting<Double> var1) {
      super(var1, null);
   }

   @JSConstructor(
      params = {
            "Can either be 'script' or a subgroup.",
            "The name of the setting.",
            "The description of the setting.",
            "The default value of the setting.",
            "The minimum value of the setting.",
            "The maximum value of the setting."
      }
   )
   public DoubleSetting(Object var1, String var2, String var3, double var4, double var6, double var8) {
      super(
         GenericSetting.<Double>getDataBuilder50(b(var1), var2)
            .getDataBuilder50_3(var3)
            .getDataBuilder50_4(var4)
            .clamp(RenderUtil27.getPredicate_4(var6, var8))
      );
   }

   @JSConstructor(
      params = {
            "Can either be 'script' or a subgroup.",
            "The name of the setting.",
            "The description of the setting.",
            "The default value of the setting.",
            "The minimum value of the setting.",
            "The maximum value of the setting.",
            "The amount to round the setting by when adjusting via the slider."
      }
   )
   public DoubleSetting(Object var1, String var2, String var3, double var4, double var6, double var8, double var10) {
      super(
         GenericSetting.<Double>getDataBuilder50(b(var1), var2)
            .getDataBuilder50_3(var3)
            .getDataBuilder50_4(var4)
            .clamp(RenderUtil27.getPredicate_3(var6, var8, var10))
      );
   }

   @JSFunction(value = "getValue", returns = "The value of the setting.")
   public double getDouble() {
      return (Double)this.i.getObject_m();
   }

   @JSFunction(value = "setValue", params = "The value to set the setting to.")
   public void initialize(double var1) {
      this.i.processAll(var1);
   }
}
