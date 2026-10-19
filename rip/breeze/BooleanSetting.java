package rip.breeze;

import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "BooleanSetting",
   superName = "Setting",
   description = "A simple boolean setting.",
   remarks = "Can only be created while initializing the script.",
   example = "const alwaysAttack = new BooleanSetting(\"AlwaysAttack\", \"If the module will always attack regardles of player health.\", false);",
   group = "breeze/settings"
)
public class BooleanSetting extends Setting<Boolean> {
   public BooleanSetting(GenericSetting<Boolean> var1) {
      super(var1, null);
   }

   @JSConstructor(
      params = {"Can either be 'script' or a subgroup.", "The name of the setting.", "The description of the setting.", "The default value of the setting."}
   )
   public BooleanSetting(Object var1, String var2, String var3, boolean var4) {
      super(GenericSetting.<Boolean>getDataBuilder50(b(var1), var2).getDataBuilder50_3(var3).getDataBuilder50_4(var4));
   }

   @JSFunction(value = "getValue", returns = "If the settings is toggled or not.")
   public boolean isValid() {
      return (Boolean)this.i.getObject_m();
   }

   @JSFunction(value = "setValue", params = "The value to set the setting to.")
   public void initialize(boolean var1) {
      this.i.processAll(var1);
   }
}
