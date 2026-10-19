package rip.breeze;

public final class Util8 {
   public final float fieldFloat_a;
   public final float fieldFloat_b;
   public final float fieldFloat_c;
   public final float fieldFloat_d;
   public final float fieldFloat_e;
   public final float fieldFloat_f;
   public final float fieldFloat_g;
   public final float fieldFloat_h;
   private static String string_i;

   public Util8(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.fieldFloat_a = var1;
      this.fieldFloat_b = var2;
      this.fieldFloat_c = var3;
      this.fieldFloat_d = var4;
      this.fieldFloat_e = var5;
      this.fieldFloat_f = var6;
      this.fieldFloat_g = var7;
      this.fieldFloat_h = var8;
   }

   public Util8(float var1, float var2, float var3, float var4, float var5) {
      this(var1, var2, var3, var4, var5, var5, var5, var5);
   }

   public static void initialize(String var0) {
      string_i = var0;
   }

   public static String getString() {
      return string_i;
   }

   static {
      if (getString() == null) {
         initialize("AmQG5");
      }
   }
}
