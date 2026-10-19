package rip.breeze;

import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "IntSetting",
   superName = "Setting",
   description = "An integer setting.",
   example = "const delay = new IntSetting(\"Delay\", \"The amount of ticks to wait in between attacks.\", false);",
   group = "breeze/settings"
)
public class IntSetting extends Setting<Integer> {
   public IntSetting(GenericSetting<Integer> var1) {
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
   public IntSetting(Object var1, String var2, String var3, int var4, int var5, int var6) {
      super(
         GenericSetting.<Integer>getDataBuilder50(b(var1), var2)
            .getDataBuilder50_3(var3)
            .getDataBuilder50_4(var4)
            .clamp(RenderUtil27.getPredicate_2(var5, var6))
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
   public IntSetting(Object var1, String var2, String var3, int var4, int var5, int var6, int var7) {
      super(
         GenericSetting.<Integer>getDataBuilder50(b(var1), var2)
            .getDataBuilder50_3(var3)
            .getDataBuilder50_4(var4)
            .clamp(RenderUtil27.getPredicate(var5, var6, var7))
      );
   }

   @JSFunction(value = "getValue", returns = "The value of the setting.")
   public int getValue() {
      return (Integer)this.i.getObject_m();
   }

   @JSFunction(value = "setValue", params = "The value to set the setting to.")
   public void initialize(int var1) {
      this.i.processAll(var1);
   }
}
