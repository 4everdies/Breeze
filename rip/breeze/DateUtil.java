package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class DateUtil {
   public final List<GenericSetting<?>> list_a = new ArrayList<>();
   public final List<DateUtil> list_b = new ArrayList<>();
   private static String string_c;

   public abstract String getString();

   public void processAll(GenericSetting<?> var1) {
      long var2 = 58122801988821L;
      if (!this.list_a.contains(var1)) {
         this.list_a.add(var1);
      }
   }

   public void processAll_1(ConditionsSetting var1) {
      long var2 = 24443716047650L;
      if (!this.list_b.contains(var1)) {
         this.list_b.add(var1);
      }
   }

   public void initialize() {
      this.list_b.clear();
      this.list_a.clear();
   }

   public GenericSetting<?> getDataBuilder54(String var1) {
      long var2 = 63738370504365L;
      String var10000 = getString();
      Iterator var4 = this.list_a.iterator();
      String var5 = var10000;

      while (var4.hasNext()) {
         GenericSetting var6 = (GenericSetting)var4.next();
         if (var6.string_b.equalsIgnoreCase(var1)) {
            return var6;
         }

         if (var5 == null) {
            break;
         }
      }

      if (!this.list_b.isEmpty()) {
         for (DateUtil var9 : this.list_b) {
            if (var9 instanceof ConditionsSetting) {
               GenericSetting var7 = ((ConditionsSetting)var9).a(var1);
               if (var7 != null) {
                  return var7;
               }
            }

            if (var5 == null) {
               break;
            }
         }
      }

      return this instanceof ConditionsSetting ? ((ConditionsSetting)this).dataBuilder51_d.getDataBuilder54(var1) : null;
   }

   public <T> T getObject(String var1, Class<T> var2) {
      long var3 = 59169335589876L;
      GenericSetting var5 = this.getDataBuilder54(var1);
      return (T)(var5 != null && var2.isInstance(var5.getObject_m()) ? var2.cast(var5.getObject_m()) : null);
   }

   public void noOp(GenericSetting<?> var1) {
   }

   public void processNullable() {
      long var1 = 21813682753118L;
      String var10000 = getString();
      Iterator var3 = this.list_a.iterator();
      String var4 = var10000;

      while (var3.hasNext()) {
         GenericSetting var5 = (GenericSetting)var3.next();
         var5.initialize();
         if (var4 == null) {
            break;
         }
      }
   }

   public DateUtil getDataBuilder51(boolean var1) {
      long var2 = 13937525859637L;
      String var10000 = getString();
      Util39 var4 = new Util39(this);
      Iterator var5 = this.list_a.iterator();
      String var6 = var10000;

      while (var5.hasNext()) {
         GenericSetting var7 = (GenericSetting)var5.next();
         var4.processAll(var7.getDataBuilder54(var4, var1));
         if (var6 == null) {
            break;
         }
      }

      for (DateUtil var9 : this.list_b) {
         if (var9 instanceof ConditionsSetting) {
            ((ConditionsSetting)var9).getDataBuilder53_2(var4, var1);
         }

         if (var6 == null) {
            break;
         }
      }

      return var4;
   }

   public static void initialize_2(String var0) {
      string_c = var0;
   }

   public static String getString() {
      return string_c;
   }

   static {
      if (getString() == null) {
         initialize_2("pMTqV");
      }
   }
}
