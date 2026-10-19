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
import rip.breeze.client.EnumType3;

public class RenderUtil41 extends Util28 {
   private final BreezeModule dataBuilder52_j;
   private final MathUtil4 dataBuilder101_k;
   private final RenderUtil31 dataBuilder44_l;
   private final rip.breeze.client.AnimationTimer dataBuilder15_m = new rip.breeze.client.AnimationTimer(250.0F, false, EnumType3.CIRC_IN);
   private final rip.breeze.client.AnimationTimer dataBuilder15_n;
   private final rip.breeze.client.AnimationTimer dataBuilder15_o;
   private final rip.breeze.client.AnimationTimer dataBuilder15_p;
   private final rip.breeze.client.AnimationTimer dataBuilder15_q = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.BACK_OUT);
   private final rip.breeze.client.AnimationTimer dataBuilder15_r = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.LINEAR);
   public final rip.breeze.client.AnimationTimer dataBuilder15_s = new rip.breeze.client.AnimationTimer(300.0F, false, EnumType3.CUBIC_IN_OUT);
   public final rip.breeze.client.AnimationTimer dataBuilder15_t = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.CUBIC_IN_OUT);
   public final rip.breeze.client.AnimationTimer dataBuilder15_u = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.CUBIC_IN_OUT);
   public final RenderUtil32 dataBuilder45_v;
   private rip.breeze.client.AnimationTimer dataBuilder15_w = new rip.breeze.client.AnimationTimer(200.0F, true, EnumType3.LINEAR);
   private LicenseState licenseState_x = new LicenseState();
   private LicenseState licenseState_y = new LicenseState();
   private LicenseState licenseState_z = new LicenseState();
   private boolean fieldBool_A = false;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public RenderUtil41(BreezeModule var1, MathUtil4 var2) {
      this.dataBuilder52_j = var1;
      this.dataBuilder101_k = var2;
      this.dataBuilder44_l = new RenderUtil31(var1.description, 18, this::clamp_2);
      this.dataBuilder45_v = new RenderUtil32(new LicenseState(), var1.a, var1.b);
      this.dataBuilder15_n = new rip.breeze.client.AnimationTimer(200.0F, var1.isValid(), EnumType3.CIRC_OUT);
      this.dataBuilder15_o = new rip.breeze.client.AnimationTimer(250.0F, var1.isValid(), EnumType3.LINEAR);
      this.dataBuilder15_p = new rip.breeze.client.AnimationTimer(400.0F, var1.isValid(), EnumType3.BACK_OUT);
      this.b(this.dataBuilder44_l);
   }

   public void clamp(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 85972512685926L;
      long var8 = var4 ^ 46241641281725L;
      LicenseState[] var10000 = RenderUtil15_x.values();
      float var10 = -1.0F;
      LicenseState[] var11 = var10000;
      if (this.dataBuilder15_w.calculateDouble(var6) != 1.0) {
         var10 = BreezeContext.iRenderer_b.getGlobalAlpha();
         BreezeContext.iRenderer_b.setGlobalAlpha((float)this.dataBuilder15_w.calculateDouble(var6));
      }

      Color var12 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("module.background"),
         BreezeContext.authSession_c.getColor("module.background-hovered"),
         this.licenseState_y.isValid(var1, var2) ? (float)this.dataBuilder15_m.getDouble(var8) / 2.0F : (float)this.dataBuilder15_m.getDouble(var8)
      );
      var12 = RenderUtil1.clamp(var12, var12.brighter(), (float)this.dataBuilder15_n.getDouble(var8));
      Color var13 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("module.text"),
         BreezeContext.authSession_c.getColor("module.text-hovered"),
         (float)Math.max(this.dataBuilder15_m.getDouble(var8), Math.max(this.dataBuilder15_s.getDouble(var8), this.dataBuilder15_n.getDouble(var8)))
      );
      float var14 = (float)(
         BreezeContext.authSession_c.getFloat("module.corner-radius") * (1.0 - this.dataBuilder15_s.getDouble(var8))
      );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(this.licenseState_x.fieldFloat_a, this.licenseState_x.fieldFloat_b, this.licenseState_x.fieldFloat_c, this.licenseState_x.fieldFloat_d, var14, var12);
      BreezeContext.iRenderer_b
         .drawTextOutline(
            this.dataBuilder52_j.moduleName,
            this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d,
            this.licenseState_x.fieldFloat_b + 19.0F,
            var13,
            EnumType32.SOURCE_SANS,
            22.0F,
            (float)this.dataBuilder15_n.getDouble(var8) * 1.5F
         );
      if (!this.dataBuilder52_j.getKeyBind().equals(KeyBind.CONST_G)) {
         float var15 = BreezeContext.iRenderer_b.measureText(this.dataBuilder52_j.getString_2(), EnumType32.SOURCE_SANS, 22.0F);
         float var16 = BreezeContext.iRenderer_b.measureText(this.dataBuilder52_j.getKeyBind().buildString(), EnumType32.SOURCE_SANS, 16.0F);
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d + 10.0F + var15,
               this.licenseState_x.fieldFloat_b + 17.0F,
               var16 + 10.0F,
               22.0F,
               5.0F,
               BreezeContext.authSession_c.getColor("module.background").brighter()
            );
         BreezeContext.iRenderer_b
            .drawText(
               this.dataBuilder52_j.getKeyBind().buildString(),
               this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d + 15.5F + var15,
               this.licenseState_x.fieldFloat_b + 20.0F,
               BreezeContext.authSession_c.getColor("default.accent"),
               EnumType32.SOURCE_SANS,
               16.0F
            );
      }

      BreezeContext.iRenderer_b
         .fillGradientRectSimple(
            this.licenseState_x.fieldFloat_a,
            this.licenseState_x.fieldFloat_b,
            this.licenseState_x.fieldFloat_d - 10.0F,
            this.licenseState_x.fieldFloat_d,
            new float[]{var14, 0.0F, 0.0F, var14},
            BreezeContext.authSession_c.getColor("module.enabled-background")
         );
      if (this.dataBuilder15_n.getDouble(var8) != 0.0) {
         BreezeContext.iRenderer_b.scheduleRender(this::lambda$draw_Inner0);
      }

      label56: {
         Color var18 = BreezeContext.authSession_c.getColor("module.tick");
         if (this.dataBuilder15_n.getDouble(var8) == 0.0) {
            BreezeContext.iRenderer_b
               .fillCircle(
                  this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d / 2.0F - 3.0F,
                  this.licenseState_x.fieldFloat_b + this.licenseState_x.fieldFloat_d / 2.0F,
                  5.0F,
                  var13
               );
            if (var11 == null) {
               break label56;
            }

            LicenseState.toggle(LicenseState.checkCondition());
         }

         BreezeContext.iRenderer_b
            .drawGlowCircle(
               this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d / 2.0F - 3.0F,
               this.licenseState_x.fieldFloat_b + this.licenseState_x.fieldFloat_d / 2.0F,
               22.0F,
               var18,
               (float)this.dataBuilder15_o.getDouble(var8)
            );
         BreezeContext.iRenderer_b
            .drawAnimatedIcon(
               this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d / 2.0F - 3.0F,
               this.licenseState_x.fieldFloat_b + this.licenseState_x.fieldFloat_d / 2.0F,
               var18,
               (float)this.dataBuilder15_p.getDouble(var8) * 0.9F
            );
      }

      if (this.dataBuilder15_m.getDouble(var8) != 0.0) {
         BreezeContext.iRenderer_b.scheduleRender(this::lambda$draw_Inner1);
      }

      if (this.dataBuilder15_q.getDouble(var8) > 0.0) {
         BreezeContext.iRenderer_b.scheduleRender(this::lambda$draw_Inner2);
      }

      BreezeContext.iRenderer_b
         .fillGradientRect(
            this.licenseState_y,
            new float[]{0.0F, var14, var14, 0.0F},
            this.licenseState_y.isValid(var1, var2)
               ? BreezeContext.authSession_c.getColor("module.edit-background-hovered")
               : BreezeContext.authSession_c.getColor("module.edit-background")
         );
      int var19 = 0;

      while (var19 < 3) {
         BreezeContext.iRenderer_b
            .fillCircle(
               this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_c - 17.5F,
               this.licenseState_x.fieldFloat_b + this.licenseState_x.fieldFloat_d / 2.0F - 15.0F + 15 * var19,
               3.0F,
               var13
            );
         var19++;
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
      LicenseState[] var7 = RenderUtil15_x.values();
      if (this.licenseState_z.isValid(var1, var2) && var3 == 0) {
         if (this.dataBuilder52_j.categories.contains(ModuleCategory.FAVORITE)) {
            this.dataBuilder52_j.categories.remove(ModuleCategory.FAVORITE);
            if (var7 == null) {
               return true;
            }
         }

         this.dataBuilder52_j.categories.add(ModuleCategory.FAVORITE);
         return true;
      } else if (this.licenseState_y.isValid(var1, var2) && var3 == 0 || this.licenseState_x.isValid(var1, var2) && var3 == 1) {
         if (this.isValid()) {
            this.dataBuilder101_k.setBool_v();
            if (var7 == null) {
               return true;
            }
         }

         this.dataBuilder101_k.processAll(this);
         return true;
      } else {
         if (this.licenseState_x.isValid(var1, var2) && var3 == 0) {
            this.dataBuilder52_j.processAll();
            return true;
         }

         if (this.licenseState_x.isValid(var1, var2)) {
            var4 = true;
         }

         return super.checkCondition(var1, var2, var3, var4);
      }
   }

   public void update(float var1, float var2, float var3, float var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public void calculate() {
      super.processNullable_4();
      this.dataBuilder45_v.a = this.dataBuilder101_k.a;
      this.dataBuilder45_v.b = this.dataBuilder101_k.b + this.d;
      this.dataBuilder45_v.c = this.dataBuilder101_k.c;
      this.dataBuilder45_v.d = this.dataBuilder101_k.d - this.d - 15.0F;
      this.dataBuilder45_v.clamp();
   }

   public void calculate() {
      long var1 = 52062782597083L;
      long var3 = var1 ^ 38514142179052L;
      this.dataBuilder15_w = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.LINEAR);
      this.dataBuilder15_w.toggle(var3, true);
   }

   public LicenseState getLicenseState_x() {
      return this.licenseState_x;
   }

   private boolean isValid() {
      long var1 = 49997121462382L;
      return this.dataBuilder101_k.getDataBuilder68_u() == this;
   }

   public void absValue(float var1, float var2, float var3) {
      long var6;
      label96: {
         long var4 = 68240092034146L;
         var6 = var4 ^ 55314482937173L;
         long var8 = var4 ^ 115384347145798L;
         long var10 = var4 ^ 14080824324509L;
         LicenseState[] var12 = RenderUtil15_x.values();
         this.dataBuilder15_n.toggle(var6, this.dataBuilder52_j.isValid() || this.dataBuilder15_o.getDouble(var10) > 0.6);
         this.dataBuilder15_o
            .toggle(
               var6,
               this.dataBuilder15_n.getDouble(var10) > 0.8
                  && (
                     !this.dataBuilder52_j.isValid() && this.dataBuilder15_p.getDouble(var10) < 0.4
                        || this.dataBuilder52_j.isValid() && this.dataBuilder15_n.getDouble(var10) > 0.8
                  )
            );
         this.dataBuilder15_p.toggle(var6, this.dataBuilder15_o.getDouble(var10) > 0.1 && this.dataBuilder52_j.isValid());
         if (this.isValid()) {
            label98: {
               if (!this.dataBuilder101_k.isBool_v()) {
                  this.dataBuilder15_s.toggle(var6, true);
                  this.dataBuilder15_t.toggle(var6, this.dataBuilder15_s.calculateDouble(var8) > 0.5);
                  if (!(this.dataBuilder15_s.calculateDouble(var8) > 0.5) || this.dataBuilder101_k.d(this.dataBuilder45_v)) {
                     break label98;
                  }

                  this.dataBuilder101_k.update(this.dataBuilder45_v);
                  if (var12 == null) {
                     break label98;
                  }
               }

               this.dataBuilder15_t.toggle(var6, false);
               this.dataBuilder15_s.toggle(var6, this.dataBuilder15_t.calculateDouble(var8) > 0.5);
               if (this.dataBuilder15_t.calculateDouble(var8) < 0.5 && this.dataBuilder101_k.d(this.dataBuilder45_v)) {
                  this.dataBuilder45_v.h();
                  this.dataBuilder101_k.update_1(this.dataBuilder45_v);
               }
            }

            float var13 = (float)MathUtil1.calculateDouble(
               this.a,
               this.dataBuilder101_k.a + BreezeContext.authSession_c.getFloat("panel.separator-thickness") / 2.0F,
               this.dataBuilder15_s.getDouble(var10)
            );
            float var14 = (float)MathUtil1.calculateDouble(
               this.b,
               this.dataBuilder101_k.b + BreezeContext.authSession_c.getFloat("panel.separator-thickness") / 2.0F,
               this.dataBuilder15_s.getDouble(var10)
            );
            float var15 = (float)MathUtil1.calculateDouble(
               this.c,
               this.dataBuilder101_k.c
                  - BreezeContext.authSession_c.getFloat("panel.border-thickness") / 2.0F
                  - BreezeContext.authSession_c.getFloat("panel.separator-thickness") / 2.0F,
               this.dataBuilder15_s.getDouble(var10)
            );
            this.licenseState_x = new LicenseState(var13, var14, var15, 80.0F);
            if (this.dataBuilder101_k.isBool_v() && this.dataBuilder15_s.calculateDouble(var8) == 0.0) {
               this.dataBuilder101_k.processAll(null);
            }

            if (var12 == null) {
               break label96;
            }
         }

         float var16 = (float)MathUtil1.calculateDouble_2(this.licenseState_x.fieldFloat_a, this.a, 20.0, var3);
         float var17 = (float)MathUtil1.calculateDouble_2(this.licenseState_x.fieldFloat_b, this.b, 20.0, var3);
         if (Math.abs(var16 - this.a) < 0.5) {
            var16 = this.a;
         }

         if (Math.abs(var17 - this.b) < 0.5) {
            var17 = this.b;
         }

         this.licenseState_x = new LicenseState(var16, var17, this.c, this.d);
      }

      this.dataBuilder44_l
         .a(
            this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_d,
            this.licenseState_x.fieldFloat_b + 45.0F,
            this.licenseState_x.fieldFloat_c - this.licenseState_x.fieldFloat_d - 90.0F,
            this.licenseState_x.fieldFloat_d - 45.0F
         );
      this.licenseState_y = new LicenseState(
         (int)(this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_c - 35.0F), (int)this.licenseState_x.fieldFloat_b, 35.0F, (int)this.licenseState_x.fieldFloat_d
      );
      this.licenseState_z = new LicenseState(
         (int)(this.licenseState_x.fieldFloat_a + this.licenseState_x.fieldFloat_c - 90.0F),
         (int)(this.licenseState_x.fieldFloat_b + this.licenseState_x.fieldFloat_d / 2.0F) - 22,
         44.0F,
         44.0F
      );
      this.dataBuilder15_r.toggle(var6, this.licenseState_z.isValid(var1, var2));
      this.dataBuilder15_q.toggle(var6, this.dataBuilder52_j.categories.contains(ModuleCategory.FAVORITE));
      this.dataBuilder15_m.toggle(var6, this.licenseState_x.isValid(var1, var2));
      if (LicenseState.checkCondition()) {
         RenderUtil15_x.initialize_2(new LicenseState[5]);
      }
   }

   public void setLicenseState_x(LicenseState var1) {
      this.licenseState_x = var1;
   }

   public BreezeModule getDataBuilder52_j() {
      return this.dataBuilder52_j;
   }

   private Color clamp_2() {
      long var1 = 18053135889801L;
      long var3 = var1 ^ 38161895501942L;
      return this.dataBuilder15_n.getDouble(var3) == 0.0
         ? BreezeContext.authSession_c.getColor("module.description")
         : RenderUtil1.clamp(
            BreezeContext.authSession_c.getColor("module.description"),
            BreezeContext.authSession_c.getColor("module.description-hovered"),
            (float)Math.max(this.dataBuilder15_m.getDouble(var3), Math.max(this.dataBuilder15_s.getDouble(var3), this.dataBuilder15_n.getDouble(var3)))
         );
   }

   private void lambda$draw_Inner2() {
      long var1 = 119290442608215L;
      long var3 = var1 ^ 104043041860520L;
      BreezeContext.iRenderer_b
         .rotate(
            (float)this.dataBuilder15_q.getDouble(var3),
            this.licenseState_z.fieldFloat_a + this.licenseState_z.fieldFloat_c / 2.0F,
            this.licenseState_z.fieldFloat_b + this.licenseState_z.fieldFloat_d / 2.0F + 3.0F
         );
      BreezeContext.iRenderer_b
         .drawTextAt(
            "star_filled",
            this.licenseState_z.fieldFloat_a,
            this.licenseState_z.fieldFloat_b,
            this.licenseState_z.fieldFloat_c / 24.0F,
            BreezeContext.authSession_c.getColor("default.accent")
         );
   }

   private void lambda$draw_Inner1() {
      long var1 = 32873291362866L;
      long var3 = var1 ^ 51934612649933L;
      BreezeContext.iRenderer_b
         .rotate(
            1.0F - (float)this.dataBuilder15_q.getDouble(var3),
            this.licenseState_z.fieldFloat_a + this.licenseState_z.fieldFloat_c / 2.0F,
            this.licenseState_z.fieldFloat_b + this.licenseState_z.fieldFloat_d / 2.0F + 3.0F
         );
      BreezeContext.iRenderer_b
         .drawTextAt(
            "star_outline",
            this.licenseState_z.fieldFloat_a,
            this.licenseState_z.fieldFloat_b,
            this.licenseState_z.fieldFloat_c / 24.0F,
            RenderUtil1.getColor_7(
               RenderUtil1.clamp(
                  BreezeContext.authSession_c.getColor("module.favourite"),
                  BreezeContext.authSession_c.getColor("module.favourite-hovered"),
                  (float)this.dataBuilder15_r.getDouble(var3)
               ),
               (int)(this.dataBuilder15_m.getDouble(var3) * 255.0)
            )
         );
   }

   private void lambda$draw_Inner0(float var1) {
      long var2 = 136313694751003L;
      long var4 = var2 ^ 80419263565028L;
      BreezeContext.iRenderer_b
         .rotate(
            (float)this.dataBuilder15_n.getDouble(var4),
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
      long var0 = 83398576517381L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[23];
      int var5 = 0;
      String var6 = "¦\u0000*\u0015\u0087»àäg?ý®+ì\u0098È\u0096»«\u0011¬Ó.ä/\u0098òN\u008e*øÝ8\u0093*r\u008e<\u0003¥Î\u009b|'QVj\u0000 ¶M\\{¬Þ¹WZ\fq»\u009c\u0013{ß\u008bÙIV¡\u001dÌPk\u0094\u0089Â\u000bç²Ä(øk¦\u001aÕ\u0095Ô³\u009e_\u0011\u001bE<\u001ap\u0005&3JuSÁß,\u0005©Ú\u0091\u0004Êe\u0097fÓ3S\u0099Ç}(\u0091$Ê×7½¼\u008c,-è{½jT\u009d»\u0006jì\u0093âE\"%n>ú\u0080Å\u009cZ\u008a\u0080SÈÿ\u001ch\u0006(:Õ\u0094\u0082\u0092¥E+Õ\u0016Ë7*ï¬\u009dµîY\u0001ö¯×|ß\u0099\u0086\u0097\tîqâ\u00931G6#\u008eS`8c\u00062P@ç\tw:M[Iîá¯þÆ\u009c^\u0097´:Ï\u0092«\u0004]Õ\r<+w!L)\u001f>APìi°{\u008f¿ÒiÀ\u009eGW\u0084%î],8l¬×Þ,g¡G\u001cöË¡P\u0091o1\u009b\u0086\u0017\u0018©\u0083â\u009c»¼\u008a4¾\u009fÃ\t\u007f'Ó$ÝÕ\u000bÂ\u0086c\u0004\u0088\u00161\r÷\u0005@µ`\u0006\u0018_¶(\u0081NYd«\u000f,õlbÙÜ?\u000b\u0000ç0\u0082\r)m\u0094Å¤w\b5n£ÖZ\r\u008d|G>ºkæä(\u0005]5À\u0091\u008d\u0086+\u0097ó²´á$fx}S\u008eý¨ëû;¯ £-ã'Ù\u0017\u008b§²Xï®#\u0015(%\u001dbD\nKè¼ýÀ\u009a\u0083Âë\u00978¶èÙ\u007f\u009d·È¿\u0092'\u0010\u0087#¦îPa\u008dD.W3\u0091P(q\u009e´»µèæ\u001f\u0099>\u008cÿµ1\u0004¢\\F\u0084ñ½+\u0012zi¡9¶ÝW\u00195BÀîÃE\u009aÉ³\u0018,\u0099ZÆÊævá\u0085M\u0015^Zäz\u001dï\u0093ê\u0090\u000fQ º(\u0014ÕM\u0090%Ì¢x/`÷úv\u0098Õa\u0016'%|\u0000]eqÔ¶¹\u008bQã\u0004å\u0099\u008ej_\u0083\u0086Ã\u0094 Ä\u001dF\u001bµü¯[¤^2\u0001ñª0øs\u009e`\u001f\u0091\u000eËk+Îêþ\u0089\u0095jÜ0\u0002Ú\u0007}B«¸¶õ1S¸\u001d`<äF\u0087ÓR=Tpûö\u001dÑ\ta*¶Gñv\u0087çÏ(bÕ\fTüÃðMcê0J~ãRe#¤Á©\u009fÐúbÅÂñ\u0004`läµ\u0011â©ÿ\u0019\u009c\u0089#+\u0080(Q\u0089±ÿÜZFä20>ï2û\u0099Å8x/O\u000f{X\u0098ä\u0018\u0011\u0019üZ±o\u009a>eá\u0000F;\u009dYj\u00ad5ãóªô$\u0014ªæ\u009ckñÖ?\u00869¨Þi÷\u0011Ç\rÇUefl\u0085\u009b\u0018:È^\u0011½\u0017Ê|\u0088ú²\u009c¬\u0088\u0099\u0003×\u0013\u0010l}[Å\u0001 Y\u0092\u0082íÅtb]Ã«\u009e\u0098_íW£hÙ4J_@ûð*Ù0\u0010É\u001a+\u001a\u0018\b60Àuë]x¾ /$\u0007É®bj%k¾:4³o8CX!?l\u0003\u001dÆÆ\u0084!\u000b\"Ð©òmÖþ©ï\u000e8³\tóþ|bØI\u009e0a?Ö\u0087\u001e\u0096ë\u009füUK\u0000|3Ö\u009a\u009e¿ðÌêëE";
      int var7 = "¦\u0000*\u0015\u0087»àäg?ý®+ì\u0098È\u0096»«\u0011¬Ó.ä/\u0098òN\u008e*øÝ8\u0093*r\u008e<\u0003¥Î\u009b|'QVj\u0000 ¶M\\{¬Þ¹WZ\fq»\u009c\u0013{ß\u008bÙIV¡\u001dÌPk\u0094\u0089Â\u000bç²Ä(øk¦\u001aÕ\u0095Ô³\u009e_\u0011\u001bE<\u001ap\u0005&3JuSÁß,\u0005©Ú\u0091\u0004Êe\u0097fÓ3S\u0099Ç}(\u0091$Ê×7½¼\u008c,-è{½jT\u009d»\u0006jì\u0093âE\"%n>ú\u0080Å\u009cZ\u008a\u0080SÈÿ\u001ch\u0006(:Õ\u0094\u0082\u0092¥E+Õ\u0016Ë7*ï¬\u009dµîY\u0001ö¯×|ß\u0099\u0086\u0097\tîqâ\u00931G6#\u008eS`8c\u00062P@ç\tw:M[Iîá¯þÆ\u009c^\u0097´:Ï\u0092«\u0004]Õ\r<+w!L)\u001f>APìi°{\u008f¿ÒiÀ\u009eGW\u0084%î],8l¬×Þ,g¡G\u001cöË¡P\u0091o1\u009b\u0086\u0017\u0018©\u0083â\u009c»¼\u008a4¾\u009fÃ\t\u007f'Ó$ÝÕ\u000bÂ\u0086c\u0004\u0088\u00161\r÷\u0005@µ`\u0006\u0018_¶(\u0081NYd«\u000f,õlbÙÜ?\u000b\u0000ç0\u0082\r)m\u0094Å¤w\b5n£ÖZ\r\u008d|G>ºkæä(\u0005]5À\u0091\u008d\u0086+\u0097ó²´á$fx}S\u008eý¨ëû;¯ £-ã'Ù\u0017\u008b§²Xï®#\u0015(%\u001dbD\nKè¼ýÀ\u009a\u0083Âë\u00978¶èÙ\u007f\u009d·È¿\u0092'\u0010\u0087#¦îPa\u008dD.W3\u0091P(q\u009e´»µèæ\u001f\u0099>\u008cÿµ1\u0004¢\\F\u0084ñ½+\u0012zi¡9¶ÝW\u00195BÀîÃE\u009aÉ³\u0018,\u0099ZÆÊævá\u0085M\u0015^Zäz\u001dï\u0093ê\u0090\u000fQ º(\u0014ÕM\u0090%Ì¢x/`÷úv\u0098Õa\u0016'%|\u0000]eqÔ¶¹\u008bQã\u0004å\u0099\u008ej_\u0083\u0086Ã\u0094 Ä\u001dF\u001bµü¯[¤^2\u0001ñª0øs\u009e`\u001f\u0091\u000eËk+Îêþ\u0089\u0095jÜ0\u0002Ú\u0007}B«¸¶õ1S¸\u001d`<äF\u0087ÓR=Tpûö\u001dÑ\ta*¶Gñv\u0087çÏ(bÕ\fTüÃðMcê0J~ãRe#¤Á©\u009fÐúbÅÂñ\u0004`läµ\u0011â©ÿ\u0019\u009c\u0089#+\u0080(Q\u0089±ÿÜZFä20>ï2û\u0099Å8x/O\u000f{X\u0098ä\u0018\u0011\u0019üZ±o\u009a>eá\u0000F;\u009dYj\u00ad5ãóªô$\u0014ªæ\u009ckñÖ?\u00869¨Þi÷\u0011Ç\rÇUefl\u0085\u009b\u0018:È^\u0011½\u0017Ê|\u0088ú²\u009c¬\u0088\u0099\u0003×\u0013\u0010l}[Å\u0001 Y\u0092\u0082íÅtb]Ã«\u009e\u0098_íW£hÙ4J_@ûð*Ù0\u0010É\u001a+\u001a\u0018\b60Àuë]x¾ /$\u0007É®bj%k¾:4³o8CX!?l\u0003\u001dÆÆ\u0084!\u000b\"Ð©òmÖþ©ï\u000e8³\tóþ|bØI\u009e0a?Ö\u0087\u001e\u0096ë\u009füUK\u0000|3Ö\u009a\u009e¿ðÌêëE"
         .length();
      char var8 = '0';
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
                     CONST_C = var4;
                     CONST_D = new String[23];
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

                  var6 = "ºìYÚ\u008eÄøX«\u0086\u009eå\u00adð=U\u0018«ÏQå\u0098\u0087\u008fxß¯\u009b´g\u008a«?kÈÓ\u007fsÖjµ\u0007\u0016\u0085ÄÎY¬ÖïC\u0095\u0001Ná, ÅZ\u009fTá¶\u0012@ò¢\r7ë(cØx½\u009e\u008c\f(Òà\u00863+´\u008c\u0016ç\b";
                  var7 = "ºìYÚ\u008eÄøX«\u0086\u009eå\u00adð=U\u0018«ÏQå\u0098\u0087\u008fxß¯\u009b´g\u008a«?kÈÓ\u007fsÖjµ\u0007\u0016\u0085ÄÎY¬ÖïC\u0095\u0001Ná, ÅZ\u009fTá¶\u0012@ò¢\r7ë(cØx½\u009e\u008c\f(Òà\u00863+´\u008c\u0016ç\b"
                     .length();
                  var8 = '8';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17073;
      if (CONST_D[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dI", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C[var3].getBytes("ISO-8859-1");
         CONST_D[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
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
         throw new RuntimeException("rip/breeze/dI" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
