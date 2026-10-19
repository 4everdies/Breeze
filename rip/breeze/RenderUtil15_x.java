package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RenderUtil15_x extends Util28 {
   public static int fieldInt_j;
   private final MathUtil4 dataBuilder101_k;
   private final ArrayList<RenderUtil10_x> arrayList_l = new ArrayList<>();
   private ModuleCategory moduleCategory_m = ModuleCategory.ALL;
   private float fieldFloat_n = 0.0F;
   private float fieldFloat_o = 0.0F;
   private float fieldFloat_p = 0.0F;
   private static LicenseState[] arr_q;

   public RenderUtil15_x(MathUtil4 var1) {
      this.dataBuilder101_k = var1;
      Arrays.stream(ModuleCategory.values()).forEach(this::lambda$new_Inner0);
      this.arrayList_l.forEach(this::initialize);
   }

   public ModuleCategory getModuleCategory_m() {
      return this.moduleCategory_m;
   }

   public void initialize(ModuleCategory var1) {
      this.moduleCategory_m = var1;
      this.dataBuilder101_k.processNullable();
   }

   public void absValue(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      if (this.fieldFloat_n != this.fieldFloat_o) {
         this.fieldFloat_o = (float)MathUtil1.calculateDouble_2(this.fieldFloat_o, this.fieldFloat_n, 13.0, var3);
         if (Math.abs(this.fieldFloat_n - this.fieldFloat_o) < 1.0F) {
            this.fieldFloat_o = this.fieldFloat_n;
         }

         this.calculate();
      }

      BreezeContext.iRenderer_b.renderWithBounds(this, this::lambda$draw_Inner1);
   }

   public boolean clamp(float var1, float var2, float var3) {
      long var4 = 108114635177705L;
      if (this.a(var1, var2)) {
         this.fieldFloat_n = this.fieldFloat_n - var3 * BreezeContext.iKeybindSettings_e.getX();
         this.fieldFloat_n = Math.max(0.0F, Math.min(this.fieldFloat_n, this.fieldFloat_p - this.c));
         return true;
      } else {
         return false;
      }
   }

   public void calculate() {
      long var1 = 62740630596709L;
      LicenseState[] var10000 = values();
      float var3 = -this.fieldFloat_o;
      LicenseState[] var4 = var10000;

      for (RenderUtil10_x var6 : this.arrayList_l) {
         float var7 = BreezeContext.iRenderer_b.measureText(var6.getModuleCategory_i().name, EnumType32.SOURCE_SANS, 20.0F);
         var6.a(this.a + var3, this.b + 10.0F, var7 + 16.0F, 35.0F);
         var3 += var7 + 26.0F;
         if (var4 != null) {
            break;
         }
      }

      this.fieldFloat_p = var3 + this.fieldFloat_o;
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   private void lambda$draw_Inner1(float var1, float var2, float var3) {
      super.processNullable(var1, var2, var3);
   }

   private void lambda$new_Inner0(ModuleCategory var1) {
      this.arrayList_l.add(new RenderUtil10_x(var1, this));
   }

   static {
      long var0 = 100056306802120L;
      if (values() != null) {
         initialize_2(new LicenseState[2]);
      }

      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var6 = -1370546105047507504L;
      byte[] var8 = var2.doFinal(
         new byte[]{
            (byte)(var6 >>> 56),
            (byte)(var6 >>> 48),
            (byte)(var6 >>> 40),
            (byte)(var6 >>> 32),
            (byte)(var6 >>> 24),
            (byte)(var6 >>> 16),
            (byte)(var6 >>> 8),
            (byte)var6
         }
      );
      long var9 = (var8[0] & 255L) << 56
         | (var8[1] & 255L) << 48
         | (var8[2] & 255L) << 40
         | (var8[3] & 255L) << 32
         | (var8[4] & 255L) << 24
         | (var8[5] & 255L) << 16
         | (var8[6] & 255L) << 8
         | var8[7] & 255L;
      byte var10001 = -1;
      long var4 = var9;
      fieldInt_j = (int)var4;
   }

   public static void initialize_2(LicenseState[] var0) {
      arr_q = var0;
   }

   public static LicenseState[] values() {
      return arr_q;
   }
}
