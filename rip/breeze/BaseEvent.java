package rip.breeze;

import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(name = "CancellableEvent", description = "An event that can be cancelled", group = "breeze/event")
public abstract class BaseEvent extends CancellableEvent {
   public boolean fieldBool_g = false;

   @JSFunction(value = "cancel", description = "Cancels the event.")
   public final void setBool_g() {
      this.fieldBool_g = true;
   }

   @JSFunction(value = "isCancelled", returns = "If the event is cancelled or not.")
   public final boolean isBool_g() {
      return this.fieldBool_g;
   }
}
