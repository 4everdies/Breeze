package rip.breeze;

// $VF: synthetic class
final class ScheduledTask implements Runnable {
   private final CloudAuthService arg_Inner1;

   private ScheduledTask(CloudAuthService var1) {
      this.arg_Inner1 = var1;
   }

   private static Runnable get$Lambda(CloudAuthService var0) {
      return new ScheduledTask(var0);
   }

   @Override
   public void run() {
      this.arg_Inner1.lambda$sendKeepAliveScheduled_Inner25();
   }
}
