package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import rip.breeze.BreezeModule;
import rip.breeze.KeepParameters;
import rip.breeze.MathUtil1;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "FullBright",
   b = "Makes the game brighter.",
   d = {rip.breeze.ModuleCategory.VISUAL, rip.breeze.ModuleCategory.MISC},
   c = {"bright", "brighter", "gamma"}
)
public class FullBright extends BreezeModule {
   AnimationTimer dataBuilder15_n = new AnimationTimer(500.0F, false, EnumType3.QUINT_IN);

   @KeepParameters
   public float getFloat(float var1) {
      long var2 = 41814696343100L;
      long var4 = var2 ^ 46562620604171L;
      long var6 = var2 ^ 22925174830019L;
      this.dataBuilder15_n.toggle(var4, this.f());
      return (float)MathUtil1.calculateDouble(var1, 15.0, this.dataBuilder15_n.getDouble(var6));
   }
}
