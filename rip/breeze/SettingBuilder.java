package rip.breeze;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public interface SettingBuilder {
   Class<? extends CancellableEvent> getEventClass(String var1);

   void onEnable(Context var1, Scriptable var2);

   void onEvent(Context var1, Scriptable var2, ImageUtil15 var3);
}
