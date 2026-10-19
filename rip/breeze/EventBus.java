package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public final class EventBus {
   private static final Lookup CONST_A = MethodHandles.lookup();
   private static final Map<Class<?>, SortedMap<Priority, Util136>> CONST_B = new ConcurrentHashMap<>();
   private static final Map<Object, Boolean> CONST_C = new ConcurrentHashMap<>();

   public static void processAll(Object var0) {
      try {
         if (var0 != null && !CONST_C.containsKey(var0)) {
            CONST_C.put(var0, true);
            Class var1 = var0.getClass();

            for (Method var5 : var1.getDeclaredMethods()) {
               Class[] var6 = var5.getParameterTypes();
               if (var6.length == 1 && CancellableEvent.class.isAssignableFrom(var6[0]) && var5.isAnnotationPresent(EventListener.class)) {
                  Priority var7 = var5.getAnnotation(EventListener.class).priority();
                  Map var8 = CONST_B.computeIfAbsent(var6[0], EventBus::lambda$register_Inner0);
                  Util136 var9 = var8.computeIfAbsent(var7, EventBus::lambda$register_Inner1);
                  var9.calculate(var0, var5);
               }
            }
         }
      } finally {
         return;
      }
   }

   public static void processAll_2(ImageUtil15 var0, Map<Class<? extends CancellableEvent>, Util2> var1) {
      if (var0 != null && !CONST_C.containsKey(var0)) {
         CONST_C.put(var0, true);

         for (Entry var3 : var1.entrySet()) {
            Class var4 = (Class)var3.getKey();
            Util2 var5 = (Util2)var3.getValue();
            if (var5 != null) {
               Map var6 = CONST_B.computeIfAbsent(var4, EventBus::lambda$register_Inner2);
               Util136 var7 = var6.computeIfAbsent(var5.priority_c, EventBus::lambda$register_Inner3);
               var7.initialize(var0, var5);
            }
         }
      }
   }

   public static void processAll_3(Object var0) {
      if (CONST_C.containsKey(var0)) {
         CONST_C.remove(var0);

         for (Map var2 : CONST_B.values()) {
            for (Util136 var4 : var2.values()) {
               var4.decrypt(var0);
            }
         }
      }
   }

   public static boolean checkCondition(CancellableEvent var0) {
      Map var1 = CONST_B.get(var0.getClass());
      if (var1 == null) {
         return false;
      }

      for (Util136 var3 : var1.values()) {
         Util136 var10000 = var3;
         CancellableEvent var10001 = var0;

         try {
            var10000.processAll(var10001);
         } finally {
            ;
         }
      }

      return var0 instanceof BaseEvent && ((BaseEvent)var0).fieldBool_g;
   }

   private static Util136 lambda$register_Inner3(Priority var0) {
      return new Util136(null);
   }

   private static SortedMap lambda$register_Inner2(Class var0) {
      return new TreeMap<>(Comparator.reverseOrder());
   }

   private static Util136 lambda$register_Inner1(Priority var0) {
      return new Util136(null);
   }

   private static SortedMap lambda$register_Inner0(Class var0) {
      return new TreeMap<>(Comparator.reverseOrder());
   }

   static Lookup getMethodHandles$Lookup() {
      return CONST_A;
   }
}
