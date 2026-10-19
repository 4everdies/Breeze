package rip.breeze;

import java.awt.Color;
import java.awt.Desktop;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.EnumType3;

public class RenderUtil42 extends Util28 {
   private final ImageUtil15 dataBuilder17_j;
   private final FileUtil2 dataBuilder102_k;
   private final RenderUtil31 dataBuilder44_l;
   private final ImageUtil2 breezeUtil110_m;
   private final ImageUtil2 breezeUtil110_n;
   private final ImageUtil2 breezeUtil110_o;
   private final rip.breeze.client.AnimationTimer dataBuilder15_p;
   private final rip.breeze.client.AnimationTimer dataBuilder15_q;
   private final rip.breeze.client.AnimationTimer dataBuilder15_r;
   private final rip.breeze.client.AnimationTimer dataBuilder15_s;
   public final rip.breeze.client.AnimationTimer dataBuilder15_t;
   public final rip.breeze.client.AnimationTimer dataBuilder15_u;
   public final RenderUtil6_x breezeUtil97_v;
   private rip.breeze.client.AnimationTimer dataBuilder15_w;
   private LicenseState licenseState_x;
   private LicenseState licenseState_y;
   private static final String[] CONST_A;
   private static final String[] CONST_B;
   private static final Map CONST_C = new HashMap(13);

   public RenderUtil42(ImageUtil15 var1, FileUtil2 var2) {
      long var3;
      label28: {
         var3 = 13605217189180L;
         LicenseState[] var10000 = FileUtil2.decrypt();
         super();
         this.dataBuilder15_p = new rip.breeze.client.AnimationTimer(250.0F, false, EnumType3.CIRC_IN);
         this.dataBuilder15_t = new rip.breeze.client.AnimationTimer(300.0F, false, EnumType3.CUBIC_IN_OUT);
         LicenseState[] var5 = var10000;
         this.dataBuilder15_u = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.CUBIC_IN_OUT);
         this.dataBuilder15_w = new rip.breeze.client.AnimationTimer(200.0F, true, EnumType3.LINEAR);
         this.licenseState_x = new LicenseState();
         this.licenseState_y = new LicenseState();
         this.dataBuilder17_j = var1;
         this.dataBuilder102_k = var2;
         this.dataBuilder44_l = new RenderUtil31(var1.getString_n(), 18, this::clamp_2);
         this.breezeUtil110_m = new ImageUtil2(
            new LicenseState(),
            "console",
            this::processAll_2,
            false,
            "Open the script logs."
         );
         this.breezeUtil110_n = new ImageUtil2(
            new LicenseState(),
            "refresh",
            this::initialize,
            false,
            "Reload the script."
         );
         if (var1 instanceof PlayerUtil2) {
            this.breezeUtil110_o = new ImageUtil2(
               new LicenseState(),
               "cloud",
               this::update,
               false,
               "Open this script's cloud page."
            );
            if (var5 == null) {
               break label28;
            }
         }

         if (var1 instanceof FileUtil3) {
            this.breezeUtil110_o = new ImageUtil2(
               new LicenseState(),
               "file_open",
               this::calculate,
               false,
               "Open the script file in your default editor."
            );
            if (var5 == null) {
               break label28;
            }
         }

         this.breezeUtil110_o = null;
      }

      if (this.breezeUtil110_o != null) {
         this.breezeUtil110_o.a("default.accent", "default.accent::brighter;40", null, null, null);
      }

      this.breezeUtil97_v = new RenderUtil6_x(var1);
      this.dataBuilder15_q = new rip.breeze.client.AnimationTimer(200.0F, var1.isValid(), EnumType3.CIRC_OUT);
      this.dataBuilder15_r = new rip.breeze.client.AnimationTimer(250.0F, var1.isValid(), EnumType3.LINEAR);
      this.dataBuilder15_s = new rip.breeze.client.AnimationTimer(400.0F, var1.isValid(), EnumType3.CUBIC_OUT);
      this.a(new UIPanel[]{this.dataBuilder44_l, this.breezeUtil110_m, this.breezeUtil110_n});
      if (this.breezeUtil110_o != null) {
         this.b(this.breezeUtil110_o);
      }
   }

   private void update() {
      PlayerUtil2 var1 = (PlayerUtil2)this.dataBuilder17_j;
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new RenderUtil14_x(var1.getStringDecryptHelper2_A(), var1.getUserInfo_B()));
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize();
      BreezeContext.guiPanelSettings_f.processNullable(BreezeContext.guiPanelSettings_f.dataBuilder100_r);
   }

   private void calculate() {
      long var1 = 113921819841095L;
      FileUtil3 var3 = (FileUtil3)this.dataBuilder17_j;

      try {
         if (!var3.isValid()) {
            BreezeContext.guiPanelSettings_f
               .processAll(
                  "Failed to open script",
                  RenderUtil18_x.RED + var3.getFile_A().getName() + " no longer exists."
               );
            return;
         }
      } catch (Exception var6) {
         throw getException(var6);
      }

      try {
         Desktop.getDesktop().open(var3.getFile_A());
      } catch (Exception var5) {
         BreezeContext.guiPanelSettings_f
            .processAll(
               "Failed to open script",
               RenderUtil18_x.RED
                  + "Could not open"
                  + var3.getFile_A().getName()
                  + " in your default editor."
            );
      }
   }

   public void clamp(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 85972512685926L;
      long var8 = var4 ^ 46241641281725L;
      LicenseState[] var10000 = FileUtil2.decrypt();
      float var10 = -1.0F;
      LicenseState[] var11 = var10000;
      if (this.dataBuilder15_w.calculateDouble(var6) != 1.0) {
         var10 = BreezeContext.iRenderer_b.getGlobalAlpha();
         BreezeContext.iRenderer_b.setGlobalAlpha((float)this.dataBuilder15_w.calculateDouble(var6));
      }

      this.dataBuilder44_l.update(this.dataBuilder17_j.getString_n());
      Color var12 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("module.background"),
         BreezeContext.authSession_c.getColor("module.background-hovered"),
         this.licenseState_y.isValid(var1, var2) ? (float)this.dataBuilder15_p.getDouble(var8) / 2.0F : (float)this.dataBuilder15_p.getDouble(var8)
      );
      var12 = RenderUtil1.clamp(var12, var12.brighter(), (float)this.dataBuilder15_q.getDouble(var8));
      Color var13 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("module.text"),
         BreezeContext.authSession_c.getColor("module.text-hovered"),
         (float)Math.max(this.dataBuilder15_p.getDouble(var8), Math.max(this.dataBuilder15_t.getDouble(var8), this.dataBuilder15_q.getDouble(var8)))
      );
      float var14 = (float)(
         BreezeContext.authSession_c.getFloat("module.corner-radius") * (1.0 - this.dataBuilder15_t.getDouble(var8))
      );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(this.licenseState_x.fieldFloat_a, this.licenseState_x.fieldFloat_b, this.licenseState_x.fieldFloat_c, this.licenseState_x.fieldFloat_d, var14, var12);
      BreezeContext.iRenderer_b
         .drawTextOutline(
            this.dataBuilder17_j.getString_m(),
            this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d,
            this.licenseState_x.fieldFloat_b + 19.0F,
            var13,
            EnumType32.SOURCE_SANS,
            22.0F,
            (float)this.dataBuilder15_q.getDouble(var8) * 1.5F
         );
      BreezeContext.iRenderer_b
         .fillGradientRectSimple(
            this.licenseState_x.fieldFloat_a,
            this.licenseState_x.fieldFloat_b,
            this.licenseState_x.fieldFloat_d - 10.0F,
            this.licenseState_x.fieldFloat_d,
            new float[]{var14, 0.0F, 0.0F, var14},
            BreezeContext.authSession_c.getColor("module.enabled-background")
         );
      if (this.dataBuilder15_q.getDouble(var8) != 0.0) {
         BreezeContext.iRenderer_b.scheduleRender(this::lambda$draw_Inner0);
      }

      label49: {
         Color var15 = BreezeContext.authSession_c.getColor("module.tick");
         if (this.dataBuilder15_q.getDouble(var8) == 0.0) {
            BreezeContext.iRenderer_b
               .fillCircle(
                  this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d / 2.0F - 3.0F,
                  this.licenseState_x.fieldFloat_b + this.licenseState_x.fieldFloat_d / 2.0F,
                  5.0F,
                  var13
               );
            if (var11 == null) {
               break label49;
            }

            LicenseState.toggle(LicenseState.isValid_2());
         }

         BreezeContext.iRenderer_b
            .drawGlowCircle(
               this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d / 2.0F - 3.0F,
               this.licenseState_x.fieldFloat_b + this.licenseState_x.fieldFloat_d / 2.0F,
               22.0F,
               var15,
               (float)this.dataBuilder15_r.getDouble(var8)
            );
         if (this.dataBuilder17_j.isValid()) {
            BreezeContext.iRenderer_b
               .drawIcon(
                  this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d / 2.0F - 3.0F,
                  this.licenseState_x.fieldFloat_b + this.licenseState_x.fieldFloat_d / 2.0F,
                  var15,
                  (float)this.dataBuilder15_s.getDouble(var8)
               );
         }
      }

      BreezeContext.iRenderer_b
         .fillGradientRect(
            this.licenseState_y,
            new float[]{0.0F, var14, var14, 0.0F},
            this.licenseState_y.isValid(var1, var2)
               ? BreezeContext.authSession_c.getColor("module.edit-background-hovered")
               : BreezeContext.authSession_c.getColor("module.edit-background")
         );
      int var16 = 0;

      while (var16 < 3) {
         BreezeContext.iRenderer_b
            .fillCircle(
               this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_c - 17.5F,
               this.licenseState_x.fieldFloat_b + this.licenseState_x.fieldFloat_d / 2.0F - 15.0F + 15 * var16,
               3.0F,
               var13
            );
         var16++;
         if (var11 != null) {
            break;
         }
      }

      super.processNullable(var1, var2, var3);
      if (var10 != -1.0F) {
         BreezeContext.iRenderer_b.setGlobalAlpha(var10);
      }
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      LicenseState[] var7 = FileUtil2.decrypt();
      if (super.checkCondition(var1, var2, var3, var4)) {
         var4 = true;
      }

      for (UIPanel var9 : new ArrayList(this.j())) {
         if (var9.fieldBool_f && var9.checkCondition(var1, var2, var3, var4)) {
            var4 = true;
         }

         if (var7 != null) {
            break;
         }
      }

      if (!var4) {
         if (this.licenseState_y.isValid(var1, var2) && var3 == 0 || this.licenseState_x.isValid(var1, var2) && var3 == 1) {
            if (this.isValid()) {
               this.dataBuilder102_k.setBool_v();
               if (var7 == null) {
                  return true;
               }
            }

            this.dataBuilder102_k.toggle_2(this);
            return true;
         }

         if (this.licenseState_x.isValid(var1, var2) && var3 == 0) {
            this.dataBuilder17_j.update_4();
            return true;
         }

         if (this.licenseState_x.isValid(var1, var2)) {
            var4 = true;
         }
      }

      return var4;
   }

   public void calculate() {
      super.processNullable_4();
      this.breezeUtil97_v.a = this.dataBuilder102_k.a;
      this.breezeUtil97_v.b = this.dataBuilder102_k.b + this.d;
      this.breezeUtil97_v.c = this.dataBuilder102_k.c;
      this.breezeUtil97_v.d = this.dataBuilder102_k.d - this.d - 15.0F;
      this.breezeUtil97_v.update_1();
   }

   public void update_1() {
      long var1 = 39530025801808L;
      long var3 = var1 ^ 52421272244583L;
      this.dataBuilder15_w = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.LINEAR);
      this.dataBuilder15_w.toggle(var3, true);
   }

   public LicenseState getLicenseState_x() {
      return this.licenseState_x;
   }

   private boolean isValid() {
      long var1 = 41624688564442L;
      return this.dataBuilder102_k.getDataBuilder71_u() == this;
   }

   void update_2() {
      long var1 = 51983373954613L;
      long var3 = var1 ^ 38593919919874L;
      this.dataBuilder15_u.toggle(var3, false);
      this.dataBuilder15_t.toggle(var3, false);
      this.breezeUtil97_v.h();
      this.dataBuilder102_k.update_1(this.breezeUtil97_v);
   }

   private void processAll_2() {
      long var1 = 28812435303869L;
      long var3 = var1 ^ 44987534370882L;
      LicenseState[] var5 = FileUtil2.decrypt();
      if (this.dataBuilder102_k.getDataBuilder71_u() != this) {
         this.breezeUtil97_v.update(true, true);
         this.dataBuilder102_k.toggle_2(this);
         if (var5 == null) {
            return;
         }
      }

      this.breezeUtil97_v.update(!this.breezeUtil97_v.isBool_n(), this.dataBuilder15_u.getDouble(var3) != 1.0);
   }

   private void initialize() {
      BreezeContext.dataBuilder15_j.initialize_2(this.dataBuilder17_j);
      this.breezeUtil97_v.update_1();
   }

   public void absValue(float var1, float var2, float var3) {
      long var6;
      label91: {
         long var4 = 9316712243118L;
         var6 = var4 ^ 4568724805273L;
         long var8 = var4 ^ 104008373312906L;
         long var10 = var4 ^ 64489599474257L;
         LicenseState[] var12 = FileUtil2.decrypt();
         this.dataBuilder15_q.toggle(var6, this.dataBuilder17_j.isValid() || this.dataBuilder15_r.getDouble(var10) > 0.6);
         this.dataBuilder15_r.toggle(var6, this.dataBuilder15_q.getDouble(var10) > 0.8 && this.dataBuilder17_j.isValid());
         this.dataBuilder15_s.toggle(var6, this.dataBuilder15_r.getDouble(var10) > 0.5 && this.dataBuilder17_j.isValid());
         if (this.isValid()) {
            label93: {
               if (!this.dataBuilder102_k.isBool_v()) {
                  this.dataBuilder15_t.toggle(var6, true);
                  this.dataBuilder15_u.toggle(var6, this.dataBuilder15_t.calculateDouble(var8) > 0.5);
                  if (!(this.dataBuilder15_t.calculateDouble(var8) > 0.5) || this.dataBuilder102_k.d(this.breezeUtil97_v)) {
                     break label93;
                  }

                  this.dataBuilder102_k.update(this.breezeUtil97_v);
                  if (var12 == null) {
                     break label93;
                  }
               }

               this.dataBuilder15_u.toggle(var6, false);
               this.dataBuilder15_t.toggle(var6, this.dataBuilder15_u.calculateDouble(var8) > 0.5);
               if (this.dataBuilder15_u.calculateDouble(var8) < 0.5 && this.dataBuilder102_k.d(this.breezeUtil97_v)) {
                  this.breezeUtil97_v.h();
                  this.dataBuilder102_k.update_1(this.breezeUtil97_v);
               }
            }

            float var13 = (float)MathUtil1.calculateDouble(
               this.a,
               this.dataBuilder102_k.a + BreezeContext.authSession_c.getFloat("panel.separator-thickness") / 2.0F,
               this.dataBuilder15_t.getDouble(var10)
            );
            float var14 = (float)MathUtil1.calculateDouble(
               this.b,
               this.dataBuilder102_k.b + BreezeContext.authSession_c.getFloat("panel.separator-thickness") / 2.0F,
               this.dataBuilder15_t.getDouble(var10)
            );
            float var15 = (float)MathUtil1.calculateDouble(
               this.c,
               this.dataBuilder102_k.c
                  - BreezeContext.authSession_c.getFloat("panel.border-thickness") / 2.0F
                  - BreezeContext.authSession_c.getFloat("panel.separator-thickness") / 2.0F,
               this.dataBuilder15_t.getDouble(var10)
            );
            this.licenseState_x = new LicenseState(var13, var14, var15, 80.0F);
            if (this.dataBuilder102_k.isBool_v() && this.dataBuilder15_t.calculateDouble(var8) == 0.0) {
               this.dataBuilder102_k.toggle_2(null);
            }

            if (var12 == null) {
               break label91;
            }
         }

         float var16 = (float)MathUtil1.calculateDouble_2(this.licenseState_x.fieldFloat_a, this.a, 20.0, var3);
         float var18 = (float)MathUtil1.calculateDouble_2(this.licenseState_x.fieldFloat_b, this.b, 20.0, var3);
         if (Math.abs(var16 - this.a) < 0.5) {
            var16 = this.a;
         }

         if (Math.abs(var18 - this.b) < 0.5) {
            var18 = this.b;
         }

         this.licenseState_x = new LicenseState(var16, var18, this.c, this.d);
      }

      if (this.breezeUtil110_o != null) {
         float var17 = this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d;
         float var19 = BreezeContext.iRenderer_b.measureText(this.dataBuilder17_j.getString_m(), EnumType32.SOURCE_SANS, 22.0F);
         this.breezeUtil110_o.a(var17 + var19 + 2.0F, this.licenseState_x.fieldFloat_b + 15.0F, 26.0F, 26.0F);
      }

      this.breezeUtil110_n.a(this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_c - 130.0F, this.licenseState_x.fieldFloat_b + 20.0F, 40.0F, 40.0F);
      this.breezeUtil110_m.a(this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_c - 90.0F, this.licenseState_x.fieldFloat_b + 20.0F, 40.0F, 40.0F);
      this.dataBuilder44_l
         .a(
            this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d,
            this.licenseState_x.fieldFloat_b + 45.0F,
            this.licenseState_x.fieldFloat_c - this.licenseState_x.fieldFloat_d - 130.0F,
            this.licenseState_x.fieldFloat_d - 45.0F
         );
      this.licenseState_y = new LicenseState(
         (int)(this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_c - 35.0F), (int)this.licenseState_x.fieldFloat_b, 35.0F, (int)this.licenseState_x.fieldFloat_d
      );
      this.dataBuilder15_p.toggle(var6, this.licenseState_x.isValid(var1, var2));
      if (LicenseState.checkCondition()) {
         FileUtil2.initialize(new LicenseState[3]);
      }
   }

   public void setLicenseState_x(LicenseState var1) {
      this.licenseState_x = var1;
   }

   public ImageUtil15 getDataBuilder17_j() {
      return this.dataBuilder17_j;
   }

   private Color clamp_2() {
      long var1 = 133373691110279L;
      long var3 = var1 ^ 83096536016504L;
      return this.dataBuilder15_q.getDouble(var3) == 0.0
         ? BreezeContext.authSession_c.getColor("module.description")
         : RenderUtil1.clamp(
            BreezeContext.authSession_c.getColor("module.description"),
            BreezeContext.authSession_c.getColor("module.description-hovered"),
            (float)Math.max(this.dataBuilder15_p.getDouble(var3), Math.max(this.dataBuilder15_t.getDouble(var3), this.dataBuilder15_q.getDouble(var3)))
         );
   }

   private void lambda$draw_Inner0(float var1) {
      long var2 = 77294066620753L;
      long var4 = var2 ^ 128172521397422L;
      BreezeContext.iRenderer_b
         .rotate(
            (float)this.dataBuilder15_q.getDouble(var4),
            this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d / 2.0F - 5.0F,
            this.licenseState_x.fieldFloat_b + this.licenseState_x.fieldFloat_d / 2.0F
         );
      BreezeContext.iRenderer_b
         .fillGradientRectSimple(
            this.licenseState_x.fieldFloat_a,
            this.licenseState_x.fieldFloat_b,
            this.licenseState_x.fieldFloat_d - 10.0F,
            this.licenseState_x.fieldFloat_d,
            new float[]{var1, 0.0F, 0.0F, var1},
            BreezeContext.authSession_c.getColor("module.enabled")
         );
   }

   static {
      long var0 = 37201809598849L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[31];
      int var5 = 0;
      String var6 = "ætì\u001dH&\u0097¨å½\\9\u008b4ñ\u0099[XÐ%\"\u0097Èþ\u0016\u009aE\u0088\u008d\u008eÍ\u00847Õrõ\u001f>I\u008e0%\u0088½²8\u009eÈ-Û$vH\u009aûÌ\u000b*L\u009cúrº^\u0013\u009eïºH9g3Mäöü\u0092,ðk¬Ë\u0096\u0095y\u00adE9}(¡?×¸\\:î¶\u001cPË¡B7\t\u0004\fôá\u0096r`tsRô0Ã°\u000fÕ\u008d|\tÛãÅï*:\u0010â)\u0011\u000e¥Ënm'É\u0090äÙ\u0002ÿ½0,£Òêë\u0013\u0012E¤£Óuþ,08\u0013¢ò\u0004R\u001a+Õµ\u0011ûL\u0088\u001f\u0083*Î·$.\u000fÑÝü¶Ùx\"kÿK\u0084(ûØ\u0091¹(bCjBÈxøTü\u0088L~ÞvÈ^¸\u0005y\u0088\f\u000b \bÝ#ûB\u001dÎ9±\u001dgI8½\u000e5O\u009fÿM°ßnÇ¥íêN±\u0088\u008abÎ]{:¡çã\u0002Â\u0018\u0093\u0083û\u008c\u000f´x\u00ad3\u0096¶Ìq¢ÿ©ÊY÷õùO\tü\u0086?-(]63ÂU\u0003¡×sÇ`\u0019Ø/CÀ[2Ì2#Xu´Îo\u0088B\u0004\u0002\u009bo?ç\u0016¾kÖ\bÃ0ðT¡\u000f\u00953\u0082¿}È¹ÅY\u0011Ï9ØyÇ\f+¡ý²þ½\u0095\u008dY»¾\u0087\u008c\u009cLx÷¸ÄJJã\u009a\u0081)ÈdÃ\u0010ÃKqéñÇ¯,\u0007òN©Û\u001dh^8\u0010\u009cø\u0011\u0095éÑt\u000f\u0092\u001fÉ^\u0013²@§_M\u0001\u0099ÎOKûhi@Öúè*°\u0015´Øä«g*ÿ\u001a(Úô³c\nëË5ÊÐfP\u0093\u0018\u008fD\u0097\u0098P\tBÇ0\u008bÞ¼X\u0092×\u0092}¹Û[Ï\u0087üg0´rp·¹\u0099\\µ\u0082AüÎ\u0092¶\u0019\u0092OÆ~\u0013¥Ù=ÿh\u0001LåoÃ\u008fy\u0019.Qví·o®ïÛÆét\u009b388a\u009aØ\u001d\u008el¼ï£¬E|Ê\u0088d¸É\f`ÒÓ/\fé\u001fÇí¹öÃ\u0088¿ô¥m§æ5ãBF¥\u0085§×w\u001dñ\u0083ep\u001a\u009e\u0002\u0086x(ALbÒq\u009a\n\u00196þÈS]]òW×nÜ\u000b8\u0099ó\u0001Ä\u00940A>\u0005â\u0087+Íý\u009ekçÚé0M\u009c\u008d$\u007f\u001b`\u009e@\u009eCÃÙ\u00809ª½ »\u001d¶s0C3uóí²\u001d\u0089wÀBÆ{\u0099\u00867õ¿Å¥°\u0000\u0083l° ¢\u0011J¾ágÚH¿\u008c}TîúýÆM~poxj7¬\u0080Ú\u001aÚ\u0011\u001fN\u0084 =;Ó¿\u008e\u0087ù¿ïãÝ\u0010Ü/ëð\u0081É\u001dÎ\u0016¯ÁøYç\rbfEäï\u0010Ï7¿©ä¨\u0007Ê ¹É\u000f\u0090÷ÿ\u009e\u0018'þmçÖ+¬)Ê@\u008e\u0010¸'ÖFí:k÷!gÛÕ8R\u0085\u0092ãÞo\u001bðvÉ\u001a¡x\u001b\u0080Íp_\u001fSEõÿMyÝÓ.\u001b0a\u0091\u001a\u009aSM\u000fèç\u001dágÜ\u0082\u009dÃV#\"\\ã\u0099mc\u0089\u001c(\u008eéÕ?#\u0090\u009eÂ\u0006ÊwSMßá \u0010,X>o\u0005\u0003\u001fÍÍ\u008f¶ýÍ\u0096\u0082tXõ=îLÐ](\u0089\u0093eO~§õ¡:9A\u009b^>\u0092î\u0018Æÿj\u0003DdÏ\u001b\t<v®\u009fÒÕµRlî\u0089\u0080C\u0092(:\u008dÞ\u001d\u0089Ð\u0015!W\u0011\u0019.MG\u0096\u0087.ûs~¹àù¹\u008fBVLÁ\u008atU\u0081Þ´o~û¬¿(¦\u008bã6B\n&_zp\u0000õ(k\u0081T\u0018QàO°}]Kñ\u0001\u0096\u0082ºÎgÓYH\u0006Y¸\u008e5\u00040¿Bëz5\u0018\u0017c´\u008aG\u0002¾\u0097!°âT\u0093eª\u0002ä©IÞÏçÿ\u009cwð¸V¹NöÞ\u0011Ê\u0087ò1r¾I\u000fÔP\b\u009f\u0013ei8½\tF\nÚhÑêTð¤ýßYL{Èö6_HÈ3SëòÈ«%ðK\u00adXÍ\u0081_\u0083\u008f¡Ù9\u008b®g\u0012ì\u001d\u008eÔÔ x;\u001aa\u00ad¡í\u0082'D_\u001b)d\u0000\u009fÊ\u0000Á\u001dS\u0019W83ùº.:D÷\u008804úÁ\u0011uT|\u001b¤Æ\u001fTa\u0019ú\u001c²V¤Ðqú\f\u008b÷32ge8g1:êþùÇ\u00073¸O\u0083\u009ae\u0091\u0017¿ \u000b\u0088à\u001e÷rë\u009c\u008ag\u0094®ì\u0095:hÍC\u0089áN\u001a40í´áQÄ*\n\u0089";
      int var7 = "ætì\u001dH&\u0097¨å½\\9\u008b4ñ\u0099[XÐ%\"\u0097Èþ\u0016\u009aE\u0088\u008d\u008eÍ\u00847Õrõ\u001f>I\u008e0%\u0088½²8\u009eÈ-Û$vH\u009aûÌ\u000b*L\u009cúrº^\u0013\u009eïºH9g3Mäöü\u0092,ðk¬Ë\u0096\u0095y\u00adE9}(¡?×¸\\:î¶\u001cPË¡B7\t\u0004\fôá\u0096r`tsRô0Ã°\u000fÕ\u008d|\tÛãÅï*:\u0010â)\u0011\u000e¥Ënm'É\u0090äÙ\u0002ÿ½0,£Òêë\u0013\u0012E¤£Óuþ,08\u0013¢ò\u0004R\u001a+Õµ\u0011ûL\u0088\u001f\u0083*Î·$.\u000fÑÝü¶Ùx\"kÿK\u0084(ûØ\u0091¹(bCjBÈxøTü\u0088L~ÞvÈ^¸\u0005y\u0088\f\u000b \bÝ#ûB\u001dÎ9±\u001dgI8½\u000e5O\u009fÿM°ßnÇ¥íêN±\u0088\u008abÎ]{:¡çã\u0002Â\u0018\u0093\u0083û\u008c\u000f´x\u00ad3\u0096¶Ìq¢ÿ©ÊY÷õùO\tü\u0086?-(]63ÂU\u0003¡×sÇ`\u0019Ø/CÀ[2Ì2#Xu´Îo\u0088B\u0004\u0002\u009bo?ç\u0016¾kÖ\bÃ0ðT¡\u000f\u00953\u0082¿}È¹ÅY\u0011Ï9ØyÇ\f+¡ý²þ½\u0095\u008dY»¾\u0087\u008c\u009cLx÷¸ÄJJã\u009a\u0081)ÈdÃ\u0010ÃKqéñÇ¯,\u0007òN©Û\u001dh^8\u0010\u009cø\u0011\u0095éÑt\u000f\u0092\u001fÉ^\u0013²@§_M\u0001\u0099ÎOKûhi@Öúè*°\u0015´Øä«g*ÿ\u001a(Úô³c\nëË5ÊÐfP\u0093\u0018\u008fD\u0097\u0098P\tBÇ0\u008bÞ¼X\u0092×\u0092}¹Û[Ï\u0087üg0´rp·¹\u0099\\µ\u0082AüÎ\u0092¶\u0019\u0092OÆ~\u0013¥Ù=ÿh\u0001LåoÃ\u008fy\u0019.Qví·o®ïÛÆét\u009b388a\u009aØ\u001d\u008el¼ï£¬E|Ê\u0088d¸É\f`ÒÓ/\fé\u001fÇí¹öÃ\u0088¿ô¥m§æ5ãBF¥\u0085§×w\u001dñ\u0083ep\u001a\u009e\u0002\u0086x(ALbÒq\u009a\n\u00196þÈS]]òW×nÜ\u000b8\u0099ó\u0001Ä\u00940A>\u0005â\u0087+Íý\u009ekçÚé0M\u009c\u008d$\u007f\u001b`\u009e@\u009eCÃÙ\u00809ª½ »\u001d¶s0C3uóí²\u001d\u0089wÀBÆ{\u0099\u00867õ¿Å¥°\u0000\u0083l° ¢\u0011J¾ágÚH¿\u008c}TîúýÆM~poxj7¬\u0080Ú\u001aÚ\u0011\u001fN\u0084 =;Ó¿\u008e\u0087ù¿ïãÝ\u0010Ü/ëð\u0081É\u001dÎ\u0016¯ÁøYç\rbfEäï\u0010Ï7¿©ä¨\u0007Ê ¹É\u000f\u0090÷ÿ\u009e\u0018'þmçÖ+¬)Ê@\u008e\u0010¸'ÖFí:k÷!gÛÕ8R\u0085\u0092ãÞo\u001bðvÉ\u001a¡x\u001b\u0080Íp_\u001fSEõÿMyÝÓ.\u001b0a\u0091\u001a\u009aSM\u000fèç\u001dágÜ\u0082\u009dÃV#\"\\ã\u0099mc\u0089\u001c(\u008eéÕ?#\u0090\u009eÂ\u0006ÊwSMßá \u0010,X>o\u0005\u0003\u001fÍÍ\u008f¶ýÍ\u0096\u0082tXõ=îLÐ](\u0089\u0093eO~§õ¡:9A\u009b^>\u0092î\u0018Æÿj\u0003DdÏ\u001b\t<v®\u009fÒÕµRlî\u0089\u0080C\u0092(:\u008dÞ\u001d\u0089Ð\u0015!W\u0011\u0019.MG\u0096\u0087.ûs~¹àù¹\u008fBVLÁ\u008atU\u0081Þ´o~û¬¿(¦\u008bã6B\n&_zp\u0000õ(k\u0081T\u0018QàO°}]Kñ\u0001\u0096\u0082ºÎgÓYH\u0006Y¸\u008e5\u00040¿Bëz5\u0018\u0017c´\u008aG\u0002¾\u0097!°âT\u0093eª\u0002ä©IÞÏçÿ\u009cwð¸V¹NöÞ\u0011Ê\u0087ò1r¾I\u000fÔP\b\u009f\u0013ei8½\tF\nÚhÑêTð¤ýßYL{Èö6_HÈ3SëòÈ«%ðK\u00adXÍ\u0081_\u0083\u008f¡Ù9\u008b®g\u0012ì\u001d\u008eÔÔ x;\u001aa\u00ad¡í\u0082'D_\u001b)d\u0000\u009fÊ\u0000Á\u001dS\u0019W83ùº.:D÷\u008804úÁ\u0011uT|\u001b¤Æ\u001fTa\u0019ú\u001c²V¤Ðqú\f\u008b÷32ge8g1:êþùÇ\u00073¸O\u0083\u009ae\u0091\u0017¿ \u000b\u0088à\u001e÷rë\u009c\u008ag\u0094®ì\u0095:hÍC\u0089áN\u001a40í´áQÄ*\n\u0089"
         .length();
      char var8 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_A = var4;
                     CONST_B = new String[31];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\u000b\u0003ò70J\u0094!w;C\u0010\u001c\u0011Ö\tB\";\u0012Ï\u0083üÓÜúFd$£ø*\u0085\u000f»8\u0091\t×³\u0018\u007fqÏgcÈÌ%\u0093Â\u0016)CY\u0012üq_>,ý\u001d¾1";
                  var7 = "\u000b\u0003ò70J\u0094!w;C\u0010\u001c\u0011Ö\tB\";\u0012Ï\u0083üÓÜúFd$£ø*\u0085\u000f»8\u0091\t×³\u0018\u007fqÏgcÈÌ%\u0093Â\u0016)CY\u0012üq_>,ý\u001d¾1"
                     .length();
                  var8 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static Exception getException(Exception var0) {
      return var0;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5167;
      if (CONST_B[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_C.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_C.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dL", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_A[var3].getBytes("ISO-8859-1");
         CONST_B[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_B[var3];
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
         throw new RuntimeException("rip/breeze/dL" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
