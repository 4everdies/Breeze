package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Util28 extends UIPanel {
   private final ArrayList<UIPanel> arrayList_h = new ArrayList<>();
   private static String[] arr_i;

   public Util28() {
   }

   public Util28(LicenseState var1) {
      super(var1);
   }

   public Util28(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public void processNullable(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      String var10000 = UIPanel.getString();
      super.toggle(var1, var2, var3);
      String var6 = var10000;

      for (UIPanel var8 : this.arrayList_h) {
         label19: {
            if (this.isValid(var8)) {
               var8.toggle(var1, var2, var3);
               if (var6 == null) {
                  break label19;
               }
            }

            if (var8.fieldBool_f) {
               var8.toggle_2();
            }
         }

         if (var6 != null) {
            break;
         }
      }
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      String var7 = UIPanel.getString();
      if (!this.a(var1, var2)) {
         var1 = -10.0F;
         var2 = -10.0F;
      }

      for (UIPanel var9 : new ArrayList<>(this.arrayList_h)) {
         if (var9.fieldBool_f && var9.checkCondition(var1, var2, var3, var4)) {
            var4 = true;
         }

         if (var7 != null) {
            LicenseState.toggle(LicenseState.checkCondition());
            break;
         }
      }

      return super.checkCondition(var1, var2, var3, var4);
   }

   public void processNullable_2(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      super.noOp(var1, var2, var3);
      String var10000 = UIPanel.getString();
      Iterator var6 = this.arrayList_h.iterator();
      String var7 = var10000;

      while (var6.hasNext()) {
         UIPanel var8 = (UIPanel)var6.next();
         if (var8.fieldBool_f) {
            var8.noOp(var1, var2, var3);
         }

         if (var7 != null) {
            break;
         }
      }
   }

   public boolean checkCondition_2(char var1) {
      long var2 = 56489760968752L;
      String var10000 = UIPanel.getString();
      Iterator var4 = this.arrayList_h.iterator();
      String var5 = var10000;

      while (var4.hasNext()) {
         UIPanel var6 = (UIPanel)var4.next();
         if (var6.fieldBool_f && var6.isValid_3(var1)) {
            return true;
         }

         if (var5 != null) {
            break;
         }
      }

      return super.isValid_3(var1);
   }

   public boolean checkCondition_3(int var1) {
      long var2 = 45508263211567L;
      String var10000 = UIPanel.getString();
      Iterator var4 = this.arrayList_h.iterator();
      String var5 = var10000;

      while (var4.hasNext()) {
         UIPanel var6 = (UIPanel)var4.next();
         if (var6.fieldBool_f && var6.isValid_2(var1)) {
            return true;
         }

         if (var5 != null) {
            break;
         }
      }

      return super.isValid_2(var1);
   }

   public boolean checkCondition_4(int var1) {
      long var2 = 5884312898060L;
      String var10000 = UIPanel.getString();
      Iterator var4 = this.arrayList_h.iterator();
      String var5 = var10000;

      while (var4.hasNext()) {
         UIPanel var6 = (UIPanel)var4.next();
         if (var6.fieldBool_f && var6.isValid_4(var1)) {
            return true;
         }

         if (var5 != null) {
            break;
         }
      }

      return super.isValid_4(var1);
   }

   public boolean checkCondition_5(float var1, float var2, float var3) {
      long var4 = 108114635177705L;
      String var10000 = UIPanel.getString();
      Iterator var6 = this.arrayList_h.iterator();
      String var7 = var10000;

      while (var6.hasNext()) {
         UIPanel var8 = (UIPanel)var6.next();
         if (var8.fieldBool_f && var8.a(var1, var2) && var8.isValid_5(var1, var2, var3)) {
            return true;
         }

         if (var7 != null) {
            break;
         }
      }

      return super.isValid_5(var1, var2, var3);
   }

   public void processNullable_3() {
      long var1 = 67137573248254L;
      String var10000 = UIPanel.getString();
      super.toggle_2();
      String var3 = var10000;

      for (UIPanel var5 : this.arrayList_h) {
         var5.toggle_2();
         if (var3 != null) {
            break;
         }
      }
   }

   public void processNullable_4() {
      long var1 = 62740630596709L;
      String var10000 = UIPanel.getString();
      super.noOp_2();
      String var3 = var10000;

      for (UIPanel var5 : this.arrayList_h) {
         var5.noOp_2();
         if (var3 != null) {
            break;
         }
      }
   }

   protected boolean isValid(UIPanel var1) {
      return true;
   }

   protected void initialize(UIPanel var1) {
      this.arrayList_h.add(var1);
   }

   protected void processNullable_5(UIPanel... var1) {
      long var2 = 7957935208178L;
      String var10000 = UIPanel.getString();
      UIPanel[] var4 = var1;
      String var5 = var10000;

      for (UIPanel var8 : var4) {
         this.initialize(var8);
         if (var5 != null) {
            break;
         }
      }
   }

   protected void initialize_2(UIPanel var1) {
      this.arrayList_h.remove(var1);
   }

   protected void processNullable_6(UIPanel... var1) {
      long var2 = 41488932862101L;
      UIPanel[] var4 = var1;
      String var10000 = UIPanel.getString();
      int var5 = var4.length;
      String var6 = var10000;
      int var7 = 0;

      while (var7 < var5) {
         UIPanel var8 = var4[var7];
         this.initialize_2(var8);
         var7++;
         if (var6 != null) {
            break;
         }
      }
   }

   protected List<UIPanel> getArrayList_h() {
      return this.arrayList_h;
   }

   public boolean isValid_2(UIPanel var1) {
      return this.arrayList_h.contains(var1);
   }

   public boolean checkCondition_6() {
      long var1 = 137559383459390L;
      return !this.arrayList_h.isEmpty();
   }

   protected void initialize_3() {
      this.arrayList_h.clear();
   }

   public static void initialize_4(String[] var0) {
      arr_i = var0;
   }

   public static String[] values() {
      return arr_i;
   }

   static {
      if (values() != null) {
         initialize_4(new String[1]);
      }
   }
}
