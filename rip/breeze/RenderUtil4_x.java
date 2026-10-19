package rip.breeze;

import java.awt.Color;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(name = "Color", description = "A simple color object.", group = "breeze/util")
public class RenderUtil4_x extends Util132<BreezeColor> {
   public RenderUtil4_x(BreezeColor var1) {
      super(var1);
   }

   public RenderUtil4_x(Color var1) {
      super(new BreezeColor(var1));
   }

   @JSConstructor
   public RenderUtil4_x(int var1, int var2, int var3, int var4) {
      this(new BreezeColor(var1, var2, var3, var4));
   }

   @JSFunction("red")
   public int getValue() {
      return ((BreezeColor)this.i).getRed();
   }

   @JSFunction("green")
   public int getValue_2() {
      return ((BreezeColor)this.i).getGreen();
   }

   @JSFunction("blue")
   public int getValue_3() {
      return ((BreezeColor)this.i).getBlue();
   }

   @JSFunction("alpha")
   public int getValue_4() {
      return ((BreezeColor)this.i).getAlpha();
   }

   @JSFunction(value = "rainbow", returns = "Whether this color cycles its hue over time.")
   public boolean isValid() {
      return ((BreezeColor)this.i).isBool_d();
   }
}
