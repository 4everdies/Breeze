package rip.breeze;

import java.lang.invoke.MethodHandles;

public class ImageUtil2 extends RenderUtil9 {
   private float fieldFloat_t = 0.1F;
   private static String[] arr_u;

   public ImageUtil2(LicenseState var1, String var2, Runnable var3) {
      super(var1, var2, var3);
   }

   public ImageUtil2(LicenseState var1, String var2, Runnable var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   public ImageUtil2(LicenseState var1, String var2, Runnable var3, boolean var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 85972512685926L;
      long var10 = var4 ^ 46241641281725L;
      this.f = true;
      this.j.toggle(var6, this.a(var1, var2) && !this.r);
      if (this.q && this.j.calculateDouble(var8) != 0.0) {
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.a,
               this.b,
               this.c,
               this.d,
               this.d / 2.0F - 5.0F,
               RenderUtil1.clamp(BreezeContext.authSession_c.getColor(this.o), BreezeContext.authSession_c.getColor(this.p), (float)this.j.getDouble(var10))
            );
      }

      BreezeContext.iRenderer_b
         .drawTextAt(
            this.i,
            this.a + this.c * this.fieldFloat_t,
            this.b + this.c * this.fieldFloat_t,
            this.c * (1.0F - this.fieldFloat_t * 2.0F) / 24.0F,
            this.r
               ? BreezeContext.authSession_c.getColor(this.n)
               : RenderUtil1.clamp(BreezeContext.authSession_c.getColor(this.l), BreezeContext.authSession_c.getColor(this.m), (float)this.j.getDouble(var10))
         );
      if (this.k != null) {
         this.k.update(var1, var2, var3);
      }
   }

   public void setFloat_t(float var1) {
      this.fieldFloat_t = var1;
   }

   public static void initialize(String[] var0) {
      arr_u = var0;
   }

   public static String[] values() {
      return arr_u;
   }

   static {
      if (values() != null) {
         initialize(new String[4]);
      }
   }
}
