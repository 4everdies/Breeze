package rip.breeze;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class RenderUtil30 extends Util28 {
   public static final float CONST_J = 280.0F;
   static final float CONST_K = 18.0F;
   static final float CONST_L = 16.0F;
   static final float CONST_M = 14.0F;
   static final float CONST_N = 170.0F;
   static final float CONST_O = 26.0F;
   static final float CONST_P = 10.0F;
   static final float CONST_Q = 9.0F;
   static final float CONST_R = 7.0F;
   static final float CONST_S = 14.0F;
   static final Color CONST_T;
   private static final Color CONST_U;
   private static final Color CONST_V;
   private static final Color CONST_W;
   private static final float CONST_X = 0.1F;
   private static final float CONST_Y = 0.03F;
   private final GenericSetting<BreezeColor> dataBuilder54_z;
   private final ImageUtil5 dataBuilder109_A;
   private final rip.breeze.client.AnimationTimer dataBuilder15_B;
   private final boolean fieldBool_C;
   private final RenderUtil5_x breezeUtil96_D;
   private final ImageUtil23 dataBuilder57_E;
   private final ColorUtils colorUtils_F;
   private ImageUtil22 dataBuilder56_G;
   private float fieldFloat_H;
   private float fieldFloat_I;
   public LicenseState licenseState_J;
   private static int fieldInt_K;
   private static final String[] CONST_N_2;
   private static final String[] CONST_O_2;
   private static final Map CONST_P_2 = new HashMap(13);

   static void clamp(float var0, float var1, float var2, float var3, float var4, Color var5) {
      BreezeContext.iRenderer_b.fillRoundedRectGradient(var0 + 0.5F, var1 + 0.5F, var2 - 1.0F, var3 - 1.0F, Math.max(var4 - 0.5F, 0.0F), 1.0F, var5);
   }

   private static Color getColor(Color var0, float var1) {
      return new Color(
         (int)(var0.getRed() + (255 - var0.getRed()) * var1),
         (int)(var0.getGreen() + (255 - var0.getGreen()) * var1),
         (int)(var0.getBlue() + (255 - var0.getBlue()) * var1),
         var0.getAlpha()
      );
   }

   public static float calculateFloat(boolean var0) {
      long var1 = 42209918413731L;
      return 264.0F + (var0 ? 30.0F : 0.0F);
   }

   public RenderUtil30(GenericSetting<BreezeColor> var1, rip.breeze.client.AnimationTimer var2) {
      long var3 = 65063174646195L;
      super(0.0F, 0.0F, 0.0F, 0.0F);
      this.dataBuilder54_z = var1;
      this.dataBuilder15_B = var2;
      this.dataBuilder109_A = new ImageUtil5(var1);
      this.fieldBool_C = var1.fieldBool_j;
      this.breezeUtil96_D = new RenderUtil5_x(this.dataBuilder109_A);
      this.dataBuilder57_E = new ImageUtil23(this.dataBuilder109_A);
      this.colorUtils_F = new ColorUtils(this.dataBuilder109_A);
      this.b(this.breezeUtil96_D);
      this.b(this.dataBuilder57_E);
      if (this.fieldBool_C) {
         this.dataBuilder56_G = new ImageUtil22(var1, this.dataBuilder109_A);
         this.b(this.dataBuilder56_G);
      }

      this.b(this.colorUtils_F);
      this.licenseState_J = new LicenseState(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 46241641281725L;
      this.dataBuilder109_A.update();
      float var8 = BreezeContext.authSession_c.getFloat("drawer.corner-radius");
      Color var9 = BreezeContext.authSession_c.getColor("drawer.background");
      BreezeContext.iRenderer_b.frameBegin();
      BreezeContext.iRenderer_b.rotate((float)this.dataBuilder15_B.getDouble(var6), this.c(), this.d());
      BreezeContext.iRenderer_b.fillGradientRectCustom(this.a, this.b, this.c, this.d, var8, 14.0F, 20.0F, CONST_U);
      BreezeContext.iRenderer_b.fillGradientRectHoriz(this.a, this.b, this.c, this.d, var8, getColor(var9, 0.1F), getColor(var9, 0.03F));
      clamp(this.a, this.b, this.c, this.d, var8, CONST_V);
      BreezeContext.iRenderer_b.drawRect(this.a + 18.0F, this.fieldFloat_H, this.c - 36.0F, 1.0F, CONST_W);
      this.calculate_2();
      super.processNullable(var1, var2, var3);
      BreezeContext.iRenderer_b.frameEnd();
   }

   private void calculate_2() {
      long var1 = 99178677012457L;
      float var3 = this.fieldFloat_I + 13.0F;
      float var4 = this.a + 18.0F + 9.0F;
      BreezeContext.iRenderer_b.fillCircle(var4, var3, 10.0F, new Color(0, 0, 0, 80));
      BreezeContext.iRenderer_b.fillCircle(var4, var3, 9.0F, Color.WHITE);
      BreezeContext.iRenderer_b.fillCircle(var4, var3, 7.5F, this.dataBuilder54_z.getObject_m());
      BreezeContext.iRenderer_b
         .drawText(
            this.dataBuilder54_z.getObject_m().buildString(),
            var4 + 17.0F,
            var3 - 9.0F,
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            EnumType32.SOURCE_SANS,
            19.0F
         );
   }

   public void calculate_3() {
      long var1 = 62740630596709L;
      float var3 = this.c - 36.0F - 16.0F - 14.0F;
      this.breezeUtil96_D.a(this.a + 18.0F, this.b + 18.0F, var3, 170.0F);
      this.dataBuilder57_E.a(this.a + 18.0F + var3 + 16.0F, this.b + 18.0F, 14.0F, 170.0F);
      float var4 = this.b + 18.0F + 170.0F + 16.0F;
      if (this.fieldBool_C) {
         this.dataBuilder56_G.a(this.a + 18.0F, var4, var3 + 16.0F + 14.0F, 14.0F);
         var4 += 30.0F;
      }

      this.fieldFloat_H = var4;
      this.fieldFloat_I = var4 + 16.0F;
      this.colorUtils_F.a(this.a + this.c - 18.0F - 112.0F, this.fieldFloat_I, 112.0F, 26.0F);
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      long var7 = var5 ^ 81104409656066L;
      if (!this.a(var1, var2)) {
         if (!this.licenseState_J.isValid(var1, var2)) {
            this.dataBuilder15_B.toggle(var7, false);
         }

         return false;
      } else {
         if (!this.dataBuilder54_z.fieldBool_k) {
            super.checkCondition(var1, var2, var3, false);
         }

         return true;
      }
   }

   public void decrypt() {
      long var1 = 67137573248254L;
      long var3 = var1 ^ 54224589067721L;
      super.processNullable_3();
      this.dataBuilder15_B.toggle(var3, false);
      BreezeContext.guiPanelSettings_f.update_1(this);
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   static {
      initialize(0);
      long var0 = 32457802839966L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "S«\u0097+âõK\u0094\u009a½\tÝ\u0083©\u008e×oô³¯´T$&\u0014\u008f\u00827ª\u0005\u000f(eîËV¼¥(h(½æfþzëËê0àiBðr\u0016<·\u008biÜl\u0081ç\u0007¼Âò\u0084\u0088¸4â\"q?§Ð\u009c>¤(ãO\u008dÞ|ÜáÏ\u0014ÂºóÕÚjFÙ\u001dZï,`\u0019-\u0004\u0001L\u0096ú\u000bÛ\u008c'dìÈÏ®Rv";
      int var7 = "S«\u0097+âõK\u0094\u009a½\tÝ\u0083©\u008e×oô³¯´T$&\u0014\u008f\u00827ª\u0005\u000f(eîËV¼¥(h(½æfþzëËê0àiBðr\u0016<·\u008biÜl\u0081ç\u0007¼Âò\u0084\u0088¸4â\"q?§Ð\u009c>¤(ãO\u008dÞ|ÜáÏ\u0014ÂºóÕÚjFÙ\u001dZï,`\u0019-\u0004\u0001L\u0096ú\u000bÛ\u008c'dìÈÏ®Rv"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_N_2 = var4;
            CONST_O_2 = new String[3];
            CONST_T = new Color(255, 255, 255, 20);
            CONST_U = new Color(0, 0, 0, 140);
            CONST_V = new Color(255, 255, 255, 28);
            CONST_W = new Color(255, 255, 255, 16);
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   public static void initialize(int var0) {
      fieldInt_K = var0;
   }

   public static int getValue() {
      return fieldInt_K;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 56 : 0;
   }

   private static String buildString(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15851;
      if (CONST_O_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_P_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_P_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cW", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_N_2[var3].getBytes("ISO-8859-1");
         CONST_O_2[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_O_2[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_2(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getObject".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/cW" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
