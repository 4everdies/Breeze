package rip.breeze;

import org.mozilla.javascript.Function;
import org.mozilla.javascript.RhinoException;

public class Util2 {
   private final Function function_a;
   private final ImageUtil15 dataBuilder17_b;
   public final Priority priority_c;

   public Util2(ImageUtil15 var1, Function var2, Priority var3) {
      this.function_a = var2;
      this.dataBuilder17_b = var1;
      this.priority_c = Priority.NORMAL;
   }

   public Util2(ImageUtil15 var1, Function var2) {
      this(var1, var2, Priority.NORMAL);
   }

   public void processAll(CancellableEvent var1) {
      try {
         this.function_a.call(this.dataBuilder17_b.context_x, this.dataBuilder17_b.scriptable_y, null, new Object[]{var1});
      } catch (RhinoException var3) {
         this.dataBuilder17_b.processAll_9(var3);
      }
   }
}
