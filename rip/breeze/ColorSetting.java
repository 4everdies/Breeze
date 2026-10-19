package rip.breeze;

import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "ColorSetting",
   superName = "Setting",
   description = "A color setting.",
   remarks = "Can only be created while initializing the script.",
   example = "const color = new ColorSetting(script, \"Color\", \"The color to use.\", new Color(255, 255, 255, 255));",
   group = "breeze/settings"
)
public class ColorSetting extends Setting<BreezeColor> {
   public ColorSetting(GenericSetting<BreezeColor> var1) {
      super(var1, null);
   }

   @JSConstructor(params = {"Can either be 'script' or a subgroup.", "The name of the setting.", "The description of the setting.", "The default color."})
   public ColorSetting(Object var1, String var2, String var3, RenderUtil4_x var4) {
      super(GenericSetting.<BreezeColor>getDataBuilder50(b(var1), var2).getDataBuilder50_3(var3).getDataBuilder50_4((BreezeColor)var4.b()).getDataBuilder50_8());
   }

   @JSConstructor(
      params = {
            "Can either be 'script' or a subgroup.",
            "The name of the setting.",
            "The description of the setting.",
            "The default color.",
            "Whether the alpha channel can be changed."
      }
   )
   public ColorSetting(Object var1, String var2, String var3, RenderUtil4_x var4, boolean var5) {
      super(GenericSetting.<BreezeColor>getDataBuilder50(b(var1), var2).getDataBuilder50_3(var3).getDataBuilder50_4((BreezeColor)var4.b()).isActive_2(var5));
   }

   @JSFunction(value = "getValue", returns = "The current color value.")
   public RenderUtil4_x getBreezeUtil7() {
      return new RenderUtil4_x((BreezeColor)this.i.getObject_m());
   }

   @JSFunction(value = "setValue", params = "The color to set.")
   public void initialize(RenderUtil4_x var1) {
      this.i.processAll(var1.b());
   }
}
