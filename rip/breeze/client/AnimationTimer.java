package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import java.util.function.Supplier;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

public class AnimationTimer {
   private final Supplier<Float> durationSupplier;
   private final Supplier<EnumType3> easingSupplier;
   private long startTime = 0L;
   private final boolean reverse;
   private boolean running = false;
   private static String[] arr_f;

   public AnimationTimer(Supplier<Float> var1, boolean var2, Supplier<EnumType3> var3) {
      this.durationSupplier = var1;
      this.reverse = var2;
      this.initialize(var2);
      this.easingSupplier = var3;
   }

   public AnimationTimer(float var1, boolean var2, EnumType3 var3) {
      this(AnimationTimer::lambda$new_Inner0, var2, AnimationTimer::lambda$new_Inner1);
   }

   public double getDouble(long var1) {
      var1 = 77677688457308L ^ var1;
      long var3 = var1 ^ 38048285396871L;
      long var5 = var1 ^ 114232619979118L;
      return this.easingSupplier.get().interpolate(this.calculateDouble(var3), var5);
   }

   public boolean isBool_e() {
      return this.running;
   }

   public void toggle(long var1, boolean var3) {
      var1 = 77677688457308L ^ var1;
      long var4 = var1 ^ 30899405718351L;
      String[] var6 = getTimerIds();
      this.startTime = (long)(
         !var3
            ? System.currentTimeMillis() - (1.0 - this.calculateDouble(var4)) * this.durationSupplier.get().floatValue()
            : System.currentTimeMillis() - this.calculateDouble(var4) * this.durationSupplier.get().floatValue()
      );
      this.running = var3;
      byte var10000 = LicenseState.checkCondition();
      if (var1 >= 0L) {
         if (var10000 == 0) {
            return;
         }

         var10000 = 3;
      }

      initialize_2(new String[var10000]);
   }

   public void initialize(boolean var1) {
      this.running = var1;
      this.startTime = 0L;
   }

   public double calculateDouble(long var1) {
      var1 = 77677688457308L ^ var1;
      long var3 = var1 ^ 135727081343421L;
      return this.running
         ? this.clamp((float)(System.currentTimeMillis() - this.startTime) / this.durationSupplier.get(), var3)
         : this.clamp(1.0F - (float)(System.currentTimeMillis() - this.startTime) / this.durationSupplier.get(), var3);
   }

   private double clamp(double var1, long var3) {
      var3 = 77677688457308L ^ var3;
      return var1 < 0.0 ? 0.0 : Math.min(var1, 1.0);
   }

   private static Float lambda$new_Inner3(float var0) {
      return var0;
   }

   private static EnumType3 lambda$new_Inner2(EnumType3 var0) {
      return var0;
   }

   private static EnumType3 lambda$new_Inner1(EnumType3 var0) {
      return var0;
   }

   private static Float lambda$new_Inner0(float var0) {
      return var0;
   }

   public static void initialize_2(String[] var0) {
      arr_f = var0;
   }

   public static String[] getTimerIds() {
      return arr_f;
   }

   static {
      if (getTimerIds() != null) {
         initialize_2(new String[3]);
      }
   }
}
