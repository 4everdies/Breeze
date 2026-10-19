package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rip.breeze.LicenseState;
import rip.breeze.RenderUtil1;
import rip.breeze.StringDecryptor;

public class ImageUtil16 {
   private int fieldInt_a;
   private int fieldInt_b;
   private AnimationTimer dataBuilder15_c;
   private final List<ImageUtil16> list_d;
   private boolean fieldBool_e;
   private static String string_f;

   public ImageUtil16(int var1) {
      long var2 = 17554920750074L;
      getString();
      super();
      this.dataBuilder15_c = new AnimationTimer(1.0F, false, EnumType3.LINEAR);
      this.list_d = new ArrayList<>();
      this.fieldBool_e = true;
      this.fieldInt_a = var1;
      this.fieldInt_b = var1;
      if (LicenseState.checkCondition()) {
         initialize("ndZtrc");
      }
   }

   public void absValue(boolean var1, float var2, float var3, Color var4, MathUtil10 var5, float var6) {
      long var7 = 42794279803721L;
      String var10000 = getString();
      this.fieldBool_e = var1;
      String var9 = var10000;
      String var10 = String.valueOf(Math.abs(this.fieldInt_b));
      if (var1) {
         var10 = var10.length() == 1 ? "0" + var10 : var10;
      }

      String var11 = var10;

      while (this.list_d.size() < var11.length()) {
         this.list_d.add(new ImageUtil16(0));
         if (var9 == null) {
            LicenseState.toggle(LicenseState.checkCondition());
            break;
         }
      }

      while (this.list_d.size() > var11.length()) {
         this.list_d.remove(this.list_d.size() - 1);
         if (var9 == null) {
            break;
         }
      }

      AtomicReference var12 = new AtomicReference<>(var2);
      if (this.fieldInt_b < 0) {
         var5.update((Float)var12.get(), var3, "-", var4);
         var12.set((Float)var12.get() + var5.clamp_8("-"));
      }

      AtomicInteger var13 = new AtomicInteger(0);
      this.list_d.forEach(this::lambda$draw_Inner0);
   }

   private void calculate(float var1, boolean var2, float var3, float var4, Color var5, MathUtil10 var6, float var7) {
      long var8 = 9179423397957L;
      long var10 = var8 ^ 4431503397234L;
      long var12 = var8 ^ 64352849534394L;
      String var10000 = getString();
      var6.processAll_2();
      float var14 = var6.getValue();
      RenderUtil28.clamp(var3, var4, var7, var14);
      String var15 = var10000;
      String var16 = String.valueOf(this.fieldInt_a);
      String var17 = String.valueOf(this.fieldInt_b);
      if (this.fieldInt_a != this.fieldInt_b && var2) {
         this.dataBuilder15_c.toggle(var10, true);
      }

      label20: {
         if (!var17.equals(var16)) {
            float var18 = (float)(var14 * this.dataBuilder15_c.getDouble(var12));
            var6.update(var3, var4 - var14 + var18, var17, var5);
            var6.update(var3, var4, var16, RenderUtil1.getColor_7(var5, (int)(255.0 * (1.0 - this.dataBuilder15_c.getDouble(var12)))));
            if (var15 != null) {
               break label20;
            }
         }

         var6.update(var3, var4, var17, var5);
      }

      var6.processAll_2();
      RenderUtil28.render_4();
      if (this.dataBuilder15_c.getDouble(var12) == 1.0) {
         this.dataBuilder15_c = new AnimationTimer(var1, false, EnumType3.QUINT_OUT);
         this.fieldInt_a = this.fieldInt_b;
      }
   }

   public float absValue_2(MathUtil10 var1) {
      long var2 = 45609274934119L;
      String var4 = String.valueOf(Math.abs(this.fieldInt_a));
      String var5 = String.valueOf(Math.abs(this.fieldInt_b));
      if (this.fieldBool_e) {
         var4 = var4.length() == 1 ? "0" + var4 : var4;
         var5 = var5.length() == 1 ? "0" + var5 : var5;
      }

      return Math.max(var1.clamp_8(var4), var1.clamp_8(var5));
   }

   public int getInt_a() {
      return this.fieldInt_a;
   }

   public int getInt_b() {
      return this.fieldInt_b;
   }

   public void setInt_b(int var1) {
      this.fieldInt_b = var1;
   }

   public boolean checkCondition() {
      long var1 = 73783371024110L;
      long var3 = var1 ^ 125091315122961L;
      return (this.fieldInt_a == this.fieldInt_b || this.dataBuilder15_c.getDouble(var3) > 0.5) && this.list_d.stream().allMatch(ImageUtil16::checkCondition);
   }

   private void lambda$draw_Inner0(AtomicInteger var1, String var2, MathUtil10 var3, float var4, AtomicReference var5, float var6, Color var7, ImageUtil16 var8) {
      long var9 = 69926796536483L;
      ImageUtil16 var11 = var1.get() == 0 ? null : this.list_d.get(var1.get() - 1);
      char var12 = var2.charAt(var1.get());
      var8.setInt_b(Character.getNumericValue(var12));
      float var13 = Math.max(var3.clamp_8(String.valueOf(var12)), var3.clamp_8(String.valueOf(var8.fieldInt_a)));
      var8.calculate(var4, var11 == null || var11.checkCondition(), (Float)var5.get(), var6, var7, var3, var13);
      var5.set((Float)var5.get() + var13);
      var1.getAndIncrement();
   }

   public static void initialize(String var0) {
      string_f = var0;
   }

   public static String getString() {
      return string_f;
   }

   static {
      if (getString() == null) {
         initialize("GVMwub");
      }
   }
}
