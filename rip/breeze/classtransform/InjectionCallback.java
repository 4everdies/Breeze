package rip.breeze.classtransform;

public final class InjectionCallback {
   private final boolean cancellable;
   private boolean cancelled;
   private Object returnValue;
   private boolean returnValueSet;

   public InjectionCallback(boolean var1) {
      this.cancellable = var1;
   }

   public InjectionCallback(boolean var1, Object var2) {
      this.cancellable = var1;
      this.returnValue = var2;
      this.returnValueSet = true;
   }

   public boolean isCancelled() {
      return this.cancelled;
   }

   public void cancel() {
      try {
         if (!this.cancellable) {
            throw new IllegalArgumentException("Cannot cancel a non-cancellable callback");
         }
      } catch (IllegalArgumentException var1) {
         throw getIllegalArgumentException(var1);
      }

      this.cancelled = true;
   }

   public boolean isCancellable() {
      return this.cancellable;
   }

   public Object getReturnValue() {
      try {
         if (!this.returnValueSet) {
            throw new IllegalStateException("Return value not set");
         }
      } catch (IllegalArgumentException var1) {
         throw getIllegalArgumentException(var1);
      }

      return this.returnValue;
   }

   public <T> T castReturnValue() {
      return (T)this.getReturnValue();
   }

   public void setReturnValue(Object var1) {
      this.returnValue = var1;
      this.cancel();
      this.returnValueSet = true;
   }

   private static IllegalArgumentException getIllegalArgumentException(IllegalArgumentException var0) {
      return var0;
   }
}
