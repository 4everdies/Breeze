package rip.breeze;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadUtil {
   private final ScheduledExecutorService scheduledExecutorService_a = Executors.newScheduledThreadPool(1);
   private final ThreadPoolExecutor threadPoolExecutor_b = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
   private static boolean fieldBool_c;

   public ExecutorService getThreadPoolExecutor_b() {
      return this.threadPoolExecutor_b;
   }

   public void initialize(Runnable var1, long var2) {
      this.scheduledExecutorService_a.schedule(var1, var2, TimeUnit.MILLISECONDS);
   }

   public void initialize_2(Runnable var1) {
      this.threadPoolExecutor_b.execute(var1);
   }

   public void initialize_3(Runnable var1) {
      this.threadPoolExecutor_b.submit(var1);
   }

   public void initialize_4() {
      this.scheduledExecutorService_a.shutdown();
      this.threadPoolExecutor_b.shutdown();
   }

   public static void toggle(boolean var0) {
      fieldBool_c = var0;
   }

   public static boolean isValid() {
      return fieldBool_c;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid();
      return !var0;
   }

   static {
      if (isValid()) {
         toggle(true);
      }
   }
}
