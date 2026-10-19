package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import rip.breeze.KeepParameters;
import rip.breeze.LicenseState;
import rip.breeze.MathUtil1;
import rip.breeze.StringDecryptor;

public class ModuleRegistry {
   private float fieldFloat_a = 0.0F;
   private float fieldFloat_b = 0.0F;
   private final List<IBreezeInterface2> list_c = new ArrayList<>();
   private final Random random_d = new Random();
   private boolean fieldBool_e = false;
   private float fieldFloat_f;
   private float fieldFloat_g;
   private float fieldFloat_h;
   private float fieldFloat_i;
   private boolean fieldBool_j = false;
   private boolean fieldBool_k;
   private float[] arr_l = null;
   private float fieldFloat_m = 0.0F;
   private boolean fieldBool_n = false;
   private static String[] arr_o;

   public static float calculateFloat() {
      float var0 = 0.2F;
      return var0 * var0 * var0 * 8.0F * 0.15F;
   }

   public void applyRotation(IBreezeInterface2 var1) {
      this.list_c.add(var1);
      this.list_c.sort(ModuleRegistry::lambda$register_Inner0);
   }

   public void initialize(IBreezeInterface2 var1) {
      this.list_c.remove(var1);
   }

   @KeepParameters
   public void applyRotation_1() {
      long var1 = 114599277401755L;
      boolean var3 = ConfigManager.isValid();
      if (Float.isNaN(BreezeClient.CONST_A.thePlayer.rotationPitch)) {
         BreezeClient.CONST_A.thePlayer.rotationPitch = 0.0F;
      }

      if (Float.isNaN(BreezeClient.CONST_A.thePlayer.rotationYaw)) {
         BreezeClient.CONST_A.thePlayer.rotationYaw = 0.0F;
      }

      if (Float.isNaN(this.fieldFloat_g)) {
         this.fieldFloat_g = 0.0F;
      }

      if (Float.isNaN(this.fieldFloat_i)) {
         this.fieldFloat_i = 0.0F;
      }

      this.fieldFloat_m = BreezeClient.CONST_A.thePlayer.rotationYaw;
      this.fieldFloat_f = this.fieldFloat_g;
      this.fieldFloat_h = this.fieldFloat_i;
      this.fieldBool_n = false;

      for (IBreezeInterface2 var5 : new ArrayList<>(this.list_c)) {
         label37: {
            if (!this.fieldBool_n) {
               var5.register(this);
               if (!var3) {
                  break label37;
               }
            }

            var5.noOp();
         }

         if (var3) {
            break;
         }
      }

      if (!this.fieldBool_n) {
         this.absValue_2();
      }

      this.updateRotation();
   }

   public void setBool_n() {
      this.fieldBool_n = true;
   }

   public ModuleRegistry isActive(boolean var1) {
      this.fieldBool_j = var1;
      return this;
   }

   public ModuleRegistry isActive_2(boolean var1) {
      this.fieldBool_k = var1;
      return this;
   }

   @KeepParameters
   public float getFloat_g() {
      return this.fieldFloat_g;
   }

   @KeepParameters
   public float getFloat() {
      return MathUtil1.clamp(this.fieldFloat_i, -90.0F, 90.0F);
   }

   public float getFloat_f() {
      return this.fieldFloat_f;
   }

   public float getFloat_2() {
      return MathUtil1.clamp(this.fieldFloat_h, -90.0F, 90.0F);
   }

   @KeepParameters
   public float getFloat_a() {
      return this.fieldFloat_a;
   }

   @KeepParameters
   public float getFloat_b() {
      return this.fieldFloat_b;
   }

   @KeepParameters
   public boolean isBool_e() {
      return this.fieldBool_e;
   }

   @KeepParameters
   public boolean isBool_k() {
      return this.fieldBool_k;
   }

   public boolean isValid(float[] var1, float var2) {
      return this.absValue(var1[0], var1[1], var2);
   }

   public float calculateFloat_2(float[] var1) {
      return (float)Math.hypot(RotationUtil7.calculateFloat(var1[0] - this.fieldFloat_g), var1[1] - this.fieldFloat_i);
   }

   public boolean absValue(float var1, float var2, float var3) {
      long var4 = 44913263577778L;
      boolean var10000 = ConfigManager.isValid();
      this.fieldBool_n = true;
      boolean var6 = var10000;
      this.fieldBool_e = true;
      if (this.fieldBool_j) {
         this.fieldFloat_g = this.calculateFloat_3(var1, this.fieldFloat_f);
         this.fieldFloat_i = this.calculateFloat_3(var2, this.fieldFloat_h);
         return true;
      }

      float var7 = RotationUtil7.absValue(this.fieldFloat_g, var1);
      float var8 = Math.abs(this.fieldFloat_i - var2);
      float var9 = var7 + var8;
      var3 *= BlockUtil7.clamp(var9 / 180.0F * 0.5F + 0.5F, 0.0F, 1.0F);
      int var10 = 0;

      while (var10 < this.random_d.nextInt(10)) {
         var3 += this.calculateFloat_4() * var10 * var3 * 0.05F;
         var10++;
         if (var6) {
            break;
         }
      }

      if (!(var9 <= var3) && var9 != 0.0F) {
         float var19 = var3 * (var7 / var9);
         float var11 = var3 * (var8 / var9);
         float var12 = RotationUtil7.calculateFloat(var1 - this.fieldFloat_g);
         float var13 = var2 - this.fieldFloat_i;
         float var14 = Math.abs(var12) <= var19 ? var12 : Math.copySign(var19, var12);
         float var15 = Math.abs(var13) <= var11 ? var13 : Math.copySign(var11, var13);
         float var16 = this.fieldFloat_g + var14;
         float var17 = this.fieldFloat_i + var15;
         var17 = Math.max(-90.0F, Math.min(90.0F, var17));
         this.fieldFloat_g = this.calculateFloat_3(var16, this.fieldFloat_f);
         this.fieldFloat_i = this.calculateFloat_3(var17, this.fieldFloat_h);
         return false;
      } else {
         this.fieldFloat_g = this.calculateFloat_3(var1, this.fieldFloat_f);
         this.fieldFloat_i = this.calculateFloat_3(var2, this.fieldFloat_h);
         return true;
      }
   }

   private float calculateFloat_3(float var1, float var2) {
      long var3 = 27681588616141L;
      float var5 = calculateFloat();
      if (var5 > 0.0F && Float.isFinite(var5)) {
         double var6 = (var1 - var2) / var5;
         return (float)(var2 + Math.rint(var6) * var5);
      } else {
         return var2;
      }
   }

   private float calculateFloat_4() {
      return 1.0F - this.random_d.nextFloat() * 2.0F;
   }

   public void absValue_2() {
      long var1 = 68746683274474L;
      boolean var3 = ConfigManager.isValid();
      if (this.fieldBool_e) {
         BreezeClient.CONST_A.thePlayer.rotationYaw = this.fieldFloat_g + RotationUtil7.calculateFloat(BreezeClient.CONST_A.thePlayer.rotationYaw - this.fieldFloat_g);
         this.isValid(new float[]{BreezeClient.CONST_A.thePlayer.rotationYaw, BreezeClient.CONST_A.thePlayer.rotationPitch}, 30.0F);
         if (!(Math.abs(this.fieldFloat_g - BreezeClient.CONST_A.thePlayer.rotationYaw) < 1.0F)
            || !(Math.abs(this.fieldFloat_i - BreezeClient.CONST_A.thePlayer.rotationPitch) < 1.0F)) {
            return;
         }

         this.fieldBool_e = false;
         if (!var3) {
            return;
         }
      }

      this.fieldFloat_g = BreezeClient.CONST_A.thePlayer.rotationYaw;
      this.fieldFloat_i = BreezeClient.CONST_A.thePlayer.rotationPitch;
   }

   @KeepParameters
   public void calculate(float var1, float var2) {
      this.fieldFloat_g = var1 % 360.0F;
      this.fieldFloat_i = var2;
      this.fieldBool_j = false;
      BreezeClient.CONST_A.thePlayer.rotationYaw %= 360.0F;
   }

   public void updateRotation() {
      long var1 = 49125900051225L;
      double var3 = Math.toRadians(this.fieldFloat_m - this.fieldFloat_g);
      boolean var10000 = ConfigManager.isValid();
      this.fieldFloat_b = BreezeClient.CONST_A.thePlayer.movementInput.moveStrafe * (float)Math.round(Math.cos(var3))
         - BreezeClient.CONST_A.thePlayer.movementInput.moveForward * (float)Math.round(Math.sin(var3));
      boolean var5 = var10000;
      this.fieldFloat_a = BreezeClient.CONST_A.thePlayer.movementInput.moveStrafe * (float)Math.round(Math.sin(var3))
         + BreezeClient.CONST_A.thePlayer.movementInput.moveForward * (float)Math.round(Math.cos(var3));
      this.fieldFloat_b = Math.signum(this.fieldFloat_b);
      this.fieldFloat_a = Math.signum(this.fieldFloat_a);
      if (BreezeClient.CONST_A.gameSettings.keyBindSneak.isKeyDown()) {
         this.fieldFloat_b = (float)(this.fieldFloat_b * 0.3);
         this.fieldFloat_a = (float)(this.fieldFloat_a * 0.3);
      }

      if (BreezeClient.CONST_A.thePlayer.isUsingItem()) {
         this.fieldFloat_b *= 0.2F;
         this.fieldFloat_a *= 0.2F;
      }

      if (LicenseState.checkCondition()) {
         ConfigManager.toggle(!var5);
      }
   }

   @KeepParameters
   public void processNullable() {
      long var1 = 75833405665863L;
      EntityPlayerSP var3 = BreezeClient.CONST_A.thePlayer;
      if (var3 != null && this.fieldBool_e && this.arr_l == null) {
         this.arr_l = new float[]{
            var3.rotationYawHead, var3.renderYawOffset, var3.rotationPitch, var3.prevRotationYawHead, var3.prevRenderYawOffset, var3.prevRotationPitch
         };
         var3.rotationYawHead = this.fieldFloat_g;
         var3.rotationPitch = this.fieldFloat_i;
         var3.prevRotationYawHead = this.fieldFloat_f;
         var3.prevRotationPitch = this.fieldFloat_h;
      }
   }

   @KeepParameters
   public void processNullable_2() {
      long var1 = 45123339690024L;
      EntityPlayerSP var3 = BreezeClient.CONST_A.thePlayer;
      if (var3 != null && this.fieldBool_e && this.arr_l != null) {
         var3.rotationYawHead = this.arr_l[0];
         var3.rotationPitch = this.arr_l[2];
         var3.prevRotationYawHead = this.arr_l[3];
         var3.prevRotationPitch = this.arr_l[5];
         this.arr_l = null;
      } else {
         this.arr_l = null;
      }
   }

   @KeepParameters
   public Vec3 getVec3() {
      float var1 = MathHelper.cos(-this.fieldFloat_g * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var2 = MathHelper.sin(-this.fieldFloat_g * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var3 = -MathHelper.cos(-this.fieldFloat_i * (float) (Math.PI / 180.0));
      float var4 = MathHelper.sin(-this.fieldFloat_i * (float) (Math.PI / 180.0));
      return new Vec3(var2 * var3, var4, var1 * var3);
   }

   private static int lambda$register_Inner0(IBreezeInterface2 var0, IBreezeInterface2 var1) {
      return var1.getCount() - var0.getCount();
   }

   public static void initialize_2(String[] var0) {
      arr_o = var0;
   }

   public static String[] getModuleNames() {
      return arr_o;
   }

   static {
      if (getModuleNames() == null) {
         initialize_2(new String[2]);
      }
   }
}
