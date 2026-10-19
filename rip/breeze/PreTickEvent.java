package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class PreTickEvent extends Util28 {
   private final HashMap<RenderUtil19_x, Boolean> hashMap_j;
   private final EntityUtil5 dataBuilder31_k;
   private final ConfigUtil2 dataBuilder103_l;
   private float fieldFloat_m;
   private float fieldFloat_n;
   private float fieldFloat_o;
   private static int[] arr_p;

   public PreTickEvent(ConfigUtil2 var1) {
      long var2 = 134882823525177L;
      super();
      this.hashMap_j = new HashMap<>();
      this.dataBuilder31_k = new EntityUtil5(this);
      this.fieldFloat_m = 0.0F;
      int[] var10000 = MathUtil8.decrypt();
      this.fieldFloat_n = 0.0F;
      this.fieldFloat_o = 0.0F;
      int[] var4 = var10000;
      this.dataBuilder103_l = var1;

      for (RenderUtil19_x var8 : RenderUtil19_x.values()) {
         this.hashMap_j.put(var8, true);
         this.b(new BlockUtil9(this, var8));
         if (var4 != null) {
            break;
         }
      }

      this.b(this.dataBuilder31_k);
   }

   public RotationUtil1_x getEnum6Val() {
      return this.dataBuilder31_k.enum6Val_n;
   }

   public ArrayList<RenderUtil19_x> getArrayList() {
      long var1 = 70279247060364L;
      ArrayList var3 = new ArrayList();
      int[] var10000 = MathUtil8.decrypt();
      RenderUtil19_x[] var4 = RenderUtil19_x.values();
      int[] var5 = var10000;

      for (RenderUtil19_x var8 : var4) {
         if (this.hashMap_j.get(var8)) {
            var3.add(var8);
         }

         if (var5 != null) {
            break;
         }
      }

      return var3;
   }

   public void initialize(RotationUtil1_x var1) {
      this.dataBuilder31_k.enum6Val_n = var1;
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   public void calculate() {
      long var1 = 62740630596709L;
      int[] var10000 = MathUtil8.decrypt();
      float var3 = -this.fieldFloat_n;
      Iterator var4 = this.j().iterator();
      int[] var5 = var10000;

      while (var4.hasNext()) {
         UIPanel var6 = (UIPanel)var4.next();
         var6.drawColoredQuad(this.a + var3, this.b + 10.0F, var6.c, 35.0F);
         var3 += var6.c + 10.0F;
         if (var5 != null) {
            break;
         }
      }

      this.fieldFloat_o = var3 - this.fieldFloat_n + 30.0F;
   }

   public boolean clamp(float var1, float var2, float var3) {
      long var4 = 108114635177705L;
      if (this.a(var1, var2)) {
         this.fieldFloat_m = this.fieldFloat_m - var3 * BreezeContext.iKeybindSettings_e.getX();
         this.fieldFloat_m = Math.max(0.0F, Math.min(this.fieldFloat_m, this.fieldFloat_o - this.c));
         return true;
      } else {
         return false;
      }
   }

   static HashMap getHashMap_j(PreTickEvent var0) {
      return var0.hashMap_j;
   }

   static ConfigUtil2 getDataBuilder103_l(PreTickEvent var0) {
      return var0.dataBuilder103_l;
   }

   public static void initialize_2(int[] var0) {
      arr_p = var0;
   }

   public static int[] values() {
      return arr_p;
   }

   static {
      if (values() == null) {
         initialize_2(new int[3]);
      }
   }
}
