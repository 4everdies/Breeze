package rip.breeze;

import java.awt.Desktop;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class GuiPanelSettings {
   private final RenderUtil50[] arr_a;
   private final RenderUtil9[] arr_b;
   private final ImageUtil2 breezeUtil110_c;
   private final List<Runnable> list_d;
   private final List<UIPanel> list_e;
   private final List<UIPanel> list_f;
   private final List<RenderUtil28> list_g;
   private RenderUtil50 dataBuilder97_h;
   private LicenseState licenseState_i;
   private LicenseState licenseState_j;
   private LicenseState licenseState_k;
   private LicenseState licenseState_l;
   private LicenseState licenseState_m;
   private LicenseState licenseState_n;
   private LicenseState licenseState_o;
   private float fieldFloat_p;
   private boolean fieldBool_q;
   public final RenderUtil3 dataBuilder100_r;
   public final FileUtil2 dataBuilder102_s;
   private boolean fieldBool_t;
   private static int[] arr_u;
   private static final String[] CONST_W;
   private static final String[] CONST_X;
   private static final Map CONST_Y = new HashMap(13);
   private static final long eka_1;

   public GuiPanelSettings() {
      long var1 = 62349049001104L;
      super();
      this.list_d = new CopyOnWriteArrayList<>();
      this.list_e = new ArrayList<>();
      this.list_f = new ArrayList<>();
      this.list_g = new CopyOnWriteArrayList<>();
      this.dataBuilder100_r = new RenderUtil3();
      int[] var10000 = decrypt();
      this.dataBuilder102_s = new FileUtil2();
      int[] var3 = var10000;
      this.fieldBool_t = false;
      LicenseState var10002 = new LicenseState();
      short var10003 = 16202;
      long var10004 = 8201699837067852008L ^ var1;
      Runnable var22 = GuiPanelSettings::lambda$new_Inner0;
      short var10006 = 29275;
      long var10007 = 4601002424340788690L ^ var1;
      RenderUtil9 var4 = new RenderUtil9(var10002, "icons/discord.png", var22, false, "help");
      var10002 = new LicenseState();
      var10003 = 18681;
      var10004 = 5877477662325903211L ^ var1;
      Runnable var24 = GuiPanelSettings::lambda$new_Inner1;
      var10006 = 25023;
      var10007 = 1449509299036300816L ^ var1;
      ImageUtil2 var5 = new ImageUtil2(var10002, "Open the breeze help page.", var24, false, "Open the HUD editor.");
      LicenseState var18 = new LicenseState();
      short var25 = 340;
      long var10005 = 6281719777218119371L ^ var1;
      Runnable var30 = this::setBool_t;
      short var35 = 7843;
      long var10008 = 3305342292117674302L ^ var1;
      this.breezeUtil110_c = new ImageUtil2(var18, "reset_config", var30, false, "power");
      var10002 = new LicenseState();
      var10003 = 22134;
      var10004 = 8159912776656687580L ^ var1;
      Runnable var27 = this::update_2;
      var10006 = 653;
      var10007 = 1172179077012342061L ^ var1;
      ImageUtil2 var6 = new ImageUtil2(var10002, "Uninject Breeze.", var27, false, "user-info.icon-color-hovered");
      var10002 = new LicenseState();
      var10003 = 16257;
      var10004 = 8130412478027331585L ^ var1;
      Runnable var29 = this::initialize_2;
      var10006 = 16861;
      var10007 = 1828869074754733656L ^ var1;
      ImageUtil2 var7 = new ImageUtil2(var10002, "user-info.icon-color", var29, false, "user-info.icon-color");
      var6.setFloat_t(0.18F);
      var5.setFloat_t(0.18F);
      var7.setFloat_t(0.18F);
      this.arr_b = new RenderUtil9[]{var4, var5, this.breezeUtil110_c, var6, var7};

      for (RenderUtil9 var11 : this.arr_b) {
         short var10001 = 31243;
         long var15 = 5691728878458748301L ^ var1;
         short var16 = 25686;
         long var21 = 1781389412063454199L ^ var1;
         var11.processAll("user-info.icon-color-hovered", "user-info.icon-color", null, null, null);
         if (var3 != null) {
            break;
         }
      }

      this.arr_a = new RenderUtil50[]{new MathUtil4(), this.dataBuilder102_s, this.dataBuilder100_r, new AltManager(), new ConfigUtil5()};
      this.dataBuilder97_h = this.arr_a[0];
      this.calculate_3();
      if (!LicenseState.isValid_2()) {
         initialize_3(new int[5]);
      }
   }

   public void processNullable(RenderUtil50 var1) {
      long var2 = 19796644719472L;
      if (var1 != null && this.dataBuilder97_h != var1) {
         this.dataBuilder97_h = var1;
         this.calculate_3();
      }
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 55972829609055L;
      float var6 = this.licenseState_i.fieldFloat_a;
      float var7 = this.licenseState_i.fieldFloat_b;
      this.breezeUtil110_c.a(!BreezeContext.settingGroup_d.isEnabled());
      this.licenseState_i.fieldFloat_a = BreezeContext.settingGroup_d.getOrder() / 2.0F - this.licenseState_i.fieldFloat_c / 2.0F;
      this.licenseState_i.fieldFloat_b = BreezeContext.settingGroup_d.getCount() / 2.0F - this.licenseState_i.fieldFloat_d / 2.0F;
      if (var6 != this.licenseState_i.fieldFloat_a || var7 != this.licenseState_i.fieldFloat_b) {
         this.calculate_3();
      }

      BreezeContext.iRenderer_b.executeWithAlpha(this.fieldFloat_p < 0.8 ? 0.6666667F : 1.0F, this::lambda$render_Inner2);
   }

   private void calculate_2(float var1, float var2, float var3) {
      long var4 = 71951877048924L;
      int[] var10000 = decrypt();
      HashSet var6 = new HashSet();
      int[] var7 = var10000;
      float var8 = 0.0F;

      for (RenderUtil28 var10 : this.list_g) {
         label43: {
            if (var10.checkCondition()) {
               var6.add(var10);
               if (var7 == null) {
                  break label43;
               }
            }

            label30: {
               var10.a = this.licenseState_i.calculateFloat() - var10.c - 30.0F;
               float var11 = this.licenseState_i.calculateFloat_2() - 30.0F - var10.d - var8;
               if (var10.b == 0.0F) {
                  var10.b = var11;
                  if (var7 == null) {
                     break label30;
                  }
               }

               var10.b = (float)MathUtil1.calculateDouble_2(var10.b, var11, 15.0, var3);
            }

            var8 += var10.d + 20.0F;
         }

         var10.calculate_2();
         if (var7 != null) {
            break;
         }
      }

      this.list_g.removeAll(var6);

      for (RenderUtil28 var13 : this.list_g) {
         var13.calculate(var1, var2, var3);
         if (var7 != null) {
            break;
         }
      }
   }

   public void processAll(String var1, String var2) {
      long var3 = 27095113781198L;
      this.list_g.add(new RenderUtil28(this, var1, var2, 10000L));
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 27846403719296L;
      int[] var10000 = decrypt();
      boolean var6 = false;
      int[] var7 = var10000;

      for (UIPanel var9 : this.list_e) {
         if (var9.checkCondition(var1, var2, var3, var6)) {
            var6 = true;
         }

         if (var7 != null) {
            break;
         }
      }

      for (RenderUtil28 var15 : this.list_g) {
         if (var15.checkCondition_2(var1, var2, var3, var6)) {
            var6 = true;
         }

         if (var7 != null) {
            break;
         }
      }

      if (var3 == 0) {
         for (RenderUtil50 var11 : this.arr_a) {
            if (var11.licenseState_n.isValid(var1, var2)) {
               this.dataBuilder97_h = var11;
               this.calculate_3();
               if (var7 == null) {
                  break;
               }
            }

            if (var7 != null) {
               break;
            }
         }

         for (RenderUtil9 var19 : this.arr_b) {
            if (var19.checkCondition(var1, var2, var3, var6)) {
               var6 = true;
            }

            if (var7 != null) {
               break;
            }
         }
      }

      if (this.dataBuilder97_h.a(var1, var2, var3, var6)) {
         var6 = true;
      }

      return var6;
   }

   public boolean checkCondition_2(float var1, float var2, int var3) {
      long var4 = 5692029958789L;
      int[] var10000 = decrypt();
      Iterator var6 = this.list_e.iterator();
      int[] var7 = var10000;

      while (var6.hasNext()) {
         UIPanel var8 = (UIPanel)var6.next();
         var8.noOp(var1, var2, var3);
         if (var7 != null) {
            break;
         }
      }

      if (this.fieldFloat_p != BreezeContext.iKeybindSettings_e.getY() || this.fieldBool_q != BreezeContext.iKeybindSettings_e.isToggle()) {
         this.calculate_3();
      }

      this.dataBuilder97_h.b(var1, var2, var3);
      return true;
   }

   public boolean checkCondition_3(char var1) {
      long var2 = 50499467222637L;
      int[] var10000 = decrypt();
      Iterator var4 = this.list_e.iterator();
      int[] var5 = var10000;

      while (var4.hasNext()) {
         UIPanel var6 = (UIPanel)var4.next();
         if (var6.isValid_3(var1)) {
            return true;
         }

         if (var5 != null) {
            break;
         }
      }

      this.dataBuilder97_h.a(var1);
      return true;
   }

   public boolean checkCondition_4(int var1) {
      long var2 = 57431200466752L;
      int[] var10000 = decrypt();
      Iterator var4 = this.list_e.iterator();
      int[] var5 = var10000;

      while (var4.hasNext()) {
         UIPanel var6 = (UIPanel)var4.next();
         if (var6.isValid_2(var1)) {
            return true;
         }

         if (var5 != null) {
            break;
         }
      }

      return this.dataBuilder97_h.a(var1);
   }

   public boolean checkCondition_5(int var1) {
      long var2 = 23405868991571L;
      int[] var10000 = decrypt();
      Iterator var4 = this.list_e.iterator();
      int[] var5 = var10000;

      while (var4.hasNext()) {
         UIPanel var6 = (UIPanel)var4.next();
         if (var6.isValid_4(var1)) {
            return true;
         }

         if (var5 != null) {
            break;
         }
      }

      this.dataBuilder97_h.b(var1);
      return true;
   }

   public boolean checkCondition_6(float var1, float var2, float var3) {
      long var4 = 115464756346508L;
      int[] var10000 = decrypt();
      Iterator var6 = this.list_e.iterator();
      int[] var7 = var10000;

      while (var6.hasNext()) {
         UIPanel var8 = (UIPanel)var6.next();
         if (var8.isValid_5(var1, var2, var3)) {
            return true;
         }

         if (var7 != null) {
            break;
         }
      }

      return this.dataBuilder97_h.b(var1, var2, var3) ? true : true;
   }

   public void toggle() {
      long var1 = 124614897724930L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs1(ImageUtil16.getUserTheme_3());
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(7929834677958464153L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      BreezeContext.dataBuilder15_j.processAll();
      this.dataBuilder97_h.h();
      this.fieldBool_t = false;
   }

   public void initialize(Runnable var1) {
      this.list_d.add(var1);
   }

   public void update(UIPanel var1) {
      long var2 = 102736461386942L;
      if (!this.list_e.contains(var1)) {
         this.list_e.add(var1);
      }
   }

   public void update_1(UIPanel var1) {
      long var2 = 49875235272008L;
      if (!this.list_f.contains(var1) && this.list_e.contains(var1)) {
         this.list_f.add(var1);
      }
   }

   public float getFloat_p() {
      return this.fieldFloat_p;
   }

   public LicenseState getLicenseState_i() {
      return this.licenseState_i;
   }

   private void update_2() {
      long var1 = 120839350324687L;
      ImageUtil16.processAll();
      this.processAll("Config reset", "Your configuration has been reset to default.");
   }

   private void setBool_t() {
      this.fieldBool_t = true;
   }

   private void initialize_2() {
      BreezeContext.settingGroup_d.apply();
      BreezeContext.runnable_m.run();
   }

   public boolean isActive() {
      long var1 = 130950106839368L;
      return this.fieldBool_t && !(this.fieldBool_t = false);
   }

   public void calculate_3() {
      long var1 = 32523532085449L;
      int[] var10000 = decrypt();
      float var3 = BreezeContext.iKeybindSettings_e.getY();
      this.fieldFloat_p = var3;
      int[] var4 = var10000;
      this.fieldBool_q = BreezeContext.iKeybindSettings_e.isToggle();
      if (var3 < 0.8F) {
         var3 += 0.4F;
      }

      this.licenseState_i = new LicenseState(
         BreezeContext.settingGroup_d.getOrder() / 2.0F - 550.0F * var3,
         BreezeContext.settingGroup_d.getCount() / 2.0F - 350.0F * var3,
         1100.0F * var3,
         700.0F * var3
      );
      this.licenseState_j = new LicenseState(this.licenseState_i.fieldFloat_a, this.licenseState_i.fieldFloat_b, 251.0F, this.licenseState_i.fieldFloat_d);
      this.licenseState_m = new LicenseState(
         this.licenseState_j.fieldFloat_a + 15.0F, this.licenseState_j.calculateFloat_2() - 125.0F, this.licenseState_j.fieldFloat_c - 30.0F, 110.0F
      );
      this.licenseState_n = new LicenseState(this.licenseState_m.fieldFloat_a, this.licenseState_m.fieldFloat_b, this.licenseState_m.fieldFloat_c, 80.0F);
      this.licenseState_o = new LicenseState(this.licenseState_m.fieldFloat_a, this.licenseState_m.calculateFloat_2() - 35.0F, this.licenseState_m.fieldFloat_c, 35.0F);
      int var5 = this.arr_b.length * 35;
      float var6 = (this.licenseState_o.fieldFloat_c - var5) / (this.arr_b.length + 1);
      float var7 = var6;
      RenderUtil9[] var8 = this.arr_b;
      int var9 = var8.length;
      int var10 = 0;

      while (var10 < var9) {
         RenderUtil9 var11 = var8[var10];
         var11.processNullable(this.licenseState_o.fieldFloat_a + var7, this.licenseState_o.fieldFloat_b, 35.0F, 35.0F);
         var7 += var6 + 35.0F;
         var10++;
         if (var4 != null) {
            LicenseState.toggle(LicenseState.isValid_2());
            break;
         }
      }

      this.licenseState_l = new LicenseState(
         this.licenseState_j.calculateFloat(), (int)this.licenseState_i.fieldFloat_b, this.licenseState_i.fieldFloat_c - this.licenseState_j.fieldFloat_c, 80.0F
      );
      this.licenseState_k = new LicenseState(
         this.licenseState_j.calculateFloat(),
         (int)this.licenseState_l.calculateFloat_2(),
         this.licenseState_i.fieldFloat_c - this.licenseState_j.fieldFloat_c,
         this.licenseState_i.fieldFloat_d - this.licenseState_l.fieldFloat_d
      );
      var7 = 100.0F;

      for (RenderUtil50 var16 : this.arr_a) {
         var16.update(
            new LicenseState(this.licenseState_j.fieldFloat_a + 20.0F, this.licenseState_j.fieldFloat_b + var7, this.licenseState_j.fieldFloat_c - 40.0F, 35.0F),
            this.licenseState_k,
            this.licenseState_l
         );
         var7 += 45.0F;
         if (var4 != null) {
            break;
         }
      }
   }

   private void lambda$render_Inner2(float var1, float var2, float var3) {
      long var4 = 37289341847506L;
      int[] var10000 = decrypt();
      float var6 = var1;
      int[] var7 = var10000;
      float var8 = var2;

      for (UIPanel var10 : this.list_e) {
         if (var10.a(var6, var8)) {
            var6 = -10.0F;
            var8 = -10.0F;
            if (var7 == null) {
               break;
            }
         }

         if (var7 != null) {
            break;
         }
      }

      boolean var27 = this.dataBuilder97_h.isValid();
      float var28 = BreezeContext.authSession_c.getFloat("panel.corner-radius");
      float var11 = BreezeContext.authSession_c.getFloat("panel.separator-thickness");
      float var12 = BreezeContext.authSession_c.getFloat("panel.border-thickness");
      String var13 = BreezeContext.authSession_c.getString("panel.background-img");
      if (!var13.isEmpty()) {
         IRenderer var37 = BreezeContext.iRenderer_b;
         String var10002 = "<@breeze>";
         CloudAuthService var10003 = BreezeContext.cloudAuthService_h;
         Object[] var10004 = rip.breeze.client.MathUtil8.noArgs();
         Method var10006 = rip.breeze.client.MathUtil8.getMethod_3(-8657785934399474657L, var4);
         Object[] var10005 = var10004;
         CloudAuthService var72 = var10003;
         Method var63 = var10006;

         try {
            var64 = (String)var63.invoke(var72, var10005);
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }

         var37.drawTextInputSelected(
            var13.replace(var10002, var64),
            this.licenseState_i.fieldFloat_a,
            this.licenseState_i.fieldFloat_b,
            this.licenseState_i.fieldFloat_c,
            this.licenseState_i.fieldFloat_d,
            var28,
            true
         );
      }

      BreezeContext.iRenderer_b
         .fillGradientRect(
            this.licenseState_k,
            new float[]{0.0F, 0.0F, var28, 0.0F},
            BreezeContext.authSession_c.getColor("panel.background")
         );
      BreezeContext.iRenderer_b
         .fillGradientRect(
            this.licenseState_j,
            new float[]{var28, 0.0F, 0.0F, var28},
            BreezeContext.authSession_c.getColor("panel.menu")
         );
      BreezeContext.iRenderer_b
         .fillGradientRect(
            this.licenseState_l,
            new float[]{0.0F, var28, 0.0F, 0.0F},
            BreezeContext.authSession_c.getColor("panel.background")
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectTwoColor(this.licenseState_i, var28, var12, BreezeContext.authSession_c.getColor("panel.border"));
      BreezeContext.iRenderer_b
         .drawRect(
            this.licenseState_j.calculateFloat() - var11 / 2.0F,
            this.licenseState_j.fieldFloat_b + var12 / 2.0F,
            var11,
            this.licenseState_j.fieldFloat_d - var12,
            BreezeContext.authSession_c.getColor("panel.separator")
         );
      if (var27) {
         BreezeContext.iRenderer_b
            .drawRect(
               this.licenseState_l.fieldFloat_a + var11 / 2.0F,
               this.licenseState_l.calculateFloat_2() - var11 / 2.0F,
               this.licenseState_l.fieldFloat_c - var11 / 2.0F - var12 / 2.0F,
               var11,
               BreezeContext.authSession_c.getColor("panel.separator")
            );
      }

      label169: {
         if (BreezeContext.authSession_c.isValid("branding.custom-color")) {
            BreezeContext.iRenderer_b
               .drawTextColored(
                  "logo-white.png",
                  this.licenseState_j.fieldFloat_a + 25.0F,
                  this.licenseState_l.fieldFloat_b + 15.0F,
                  105.0F,
                  70.0F,
                  BreezeContext.authSession_c.getColor("branding.logo-color")
               );
            if (var7 == null) {
               break label169;
            }
         }

         BreezeContext.iRenderer_b
            .drawTextSimple(
               "logo.png", this.licenseState_j.fieldFloat_a + 25.0F, this.licenseState_l.fieldFloat_b + 15.0F, 105.0F, 70.0F
            );
      }

      BreezeContext.iRenderer_b
         .drawTextOutline(
            BreezeContext.authSession_c.getString("branding.client-name"),
            this.licenseState_j.fieldFloat_a + 134.0F,
            this.licenseState_l.fieldFloat_b + 28.0F,
            BreezeContext.authSession_c.getColor("branding.client-name-color"),
            EnumType32.SOURCE_SANS_BOLD,
            24.0F,
            2.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            BreezeContext.authSession_c.getString("branding.version").replace("%", Util140.buildString_2()),
            this.licenseState_j.fieldFloat_a + 134.0F,
            this.licenseState_l.fieldFloat_b + 52.0F,
            BreezeContext.authSession_c.getColor("branding.version-color"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.authSession_c.getColor("default.accent::brighter");
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.licenseState_m.fieldFloat_a,
            this.licenseState_m.fieldFloat_b,
            this.licenseState_m.fieldFloat_c,
            this.licenseState_m.fieldFloat_d,
            BreezeContext.authSession_c.getFloat("user-info.corner-radius"),
            BreezeContext.authSession_c.getColor("user-info.background")
         );
      BreezeContext.iRenderer_b
         .fillGradientRectSimple(
            this.licenseState_o.fieldFloat_a,
            this.licenseState_o.fieldFloat_b,
            this.licenseState_o.fieldFloat_c,
            this.licenseState_o.fieldFloat_d,
            new float[]{
               0.0F,
               0.0F,
               BreezeContext.authSession_c.getFloat("user-info.corner-radius"),
               BreezeContext.authSession_c.getFloat("user-info.corner-radius")
            },
            BreezeContext.authSession_c.getColor("user-info.icon-bar")
         );
      CloudAuthService var38 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.noArgs();
      Method var65 = rip.breeze.client.MathUtil8.getMethod_3(-8657191106969155639L, var4);
      String var55 = var10001;
      CloudAuthService var48 = var38;
      Method var39 = var65;

      try {
         var40 = (UserInfo)var39.invoke(var48, var55);
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      UserInfo var14;
      label163: {
         var14 = var40;
         if (var14.string_b != null) {
            BreezeContext.iRenderer_b
               .drawTextInputSelected(
                  var14.string_b,
                  this.licenseState_n.fieldFloat_a + 10.0F,
                  this.licenseState_n.fieldFloat_b + 10.0F,
                  this.licenseState_n.fieldFloat_d - 25.0F,
                  this.licenseState_n.fieldFloat_d - 25.0F,
                  (this.licenseState_n.fieldFloat_d - 25.0F) / 2.0F,
                  false
               );
            if (var7 == null) {
               break label163;
            }
         }

         BreezeContext.iRenderer_b
            .drawTextAt(
               "account_circle",
               this.licenseState_n.fieldFloat_a + 12.0F,
               this.licenseState_n.fieldFloat_b + 12.0F,
               1.375F,
               BreezeContext.authSession_c.getColor("default.text-tertiary")
            );
      }

      CloudAuthService var41 = BreezeContext.cloudAuthService_h;
      var10001 = rip.breeze.client.MathUtil8.noArgs();
      var65 = rip.breeze.client.MathUtil8.getMethod_3(-8656544273695940578L, var4);
      var55 = var10001;
      CloudAuthService var50 = var41;
      Method var42 = var65;

      try {
         var43 = (Boolean)var42.invoke(var50, var55);
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      if (var43) {
         IRenderer var44 = BreezeContext.iRenderer_b;
         StringBuilder var51 = new StringBuilder().append("@");
         CloudAuthService var57 = BreezeContext.cloudAuthService_h;
         Object[] var67 = rip.breeze.client.MathUtil8.noArgs();
         Method var83 = rip.breeze.client.MathUtil8.getMethod_3(-8663133111445810754L, var4);
         Object[] var73 = var67;
         CloudAuthService var68 = var57;
         Method var58 = var83;

         try {
            var55 = (String)var58.invoke(var68, var73);
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }

         var44.drawText(
            var51.append(var55).toString(),
            this.licenseState_n.fieldFloat_a + this.licenseState_n.fieldFloat_d - 5.0F,
            this.licenseState_n.fieldFloat_b + 32.0F,
            BreezeContext.authSession_c.getColor("user-info.text"),
            EnumType32.SOURCE_SANS,
            16.0F
         );
      }

      float var15 = BreezeContext.iRenderer_b.measureText(var14.string_a, EnumType32.SOURCE_SANS, 17.0F);
      IRenderer var45 = BreezeContext.iRenderer_b;
      String var52 = var14.string_a;
      float var60 = this.licenseState_n.fieldFloat_a + this.licenseState_n.fieldFloat_d - 5.0F;
      float var69 = this.licenseState_n.fieldFloat_b + 10.0F;
      CloudAuthService var74 = BreezeContext.cloudAuthService_h;
      Object[] var84 = rip.breeze.client.MathUtil8.noArgs();
      Method var10007 = rip.breeze.client.MathUtil8.getMethod_3(-8656544273695940578L, var4);
      Object[] var90 = var84;
      CloudAuthService var85 = var74;
      Method var75 = var10007;

      try {
         var76 = (Boolean)var75.invoke(var85, var90);
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      var45.drawText(
         var52,
         var60,
         var69 + (var76 ? 0 : 10),
         BreezeContext.authSession_c.getColor("user-info.text"),
         EnumType32.SOURCE_SANS,
         17.0F
      );
      if (var14.userRole_c != null && var14.userRole_c.val >= 5) {
         IRenderer var46 = BreezeContext.iRenderer_b;
         String var53 = var14.userRole_c.name;
         float var61 = this.licenseState_n.fieldFloat_a + this.licenseState_n.fieldFloat_d + var15 - 2.0F;
         float var70 = this.licenseState_n.fieldFloat_b + 14.0F;
         var74 = BreezeContext.cloudAuthService_h;
         var84 = rip.breeze.client.MathUtil8.noArgs();
         var10007 = rip.breeze.client.MathUtil8.getMethod_3(-8656544273695940578L, var4);
         var90 = var84;
         CloudAuthService var87 = var74;
         Method var78 = var10007;

         try {
            var79 = (Boolean)var78.invoke(var87, var90);
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         var46.drawTextOutline(
            var53, var61, var70 + (var79 ? 0 : 10), var14.userRole_c.color, EnumType32.SOURCE_SANS_BOLD, 12.0F, var14.userRole_c.val >= 10 ? 2.0F : 0.0F
         );
      }

      IRenderer var47 = BreezeContext.iRenderer_b;
      String var54 = "uid:" + var14.fieldInt_d;
      float var62 = this.licenseState_n.fieldFloat_a + this.licenseState_n.fieldFloat_d - 5.0F;
      float var71 = this.licenseState_n.fieldFloat_b;
      var74 = BreezeContext.cloudAuthService_h;
      var84 = rip.breeze.client.MathUtil8.noArgs();
      var10007 = rip.breeze.client.MathUtil8.getMethod_3(-8656544273695940578L, var4);
      var90 = var84;
      CloudAuthService var89 = var74;
      Method var81 = var10007;

      try {
         var82 = (Boolean)var81.invoke(var89, var90);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      var47.drawText(
         var54,
         var62,
         var71 + (var82 ? 53 : 42),
         BreezeContext.authSession_c.getColor("user-info.text"),
         EnumType32.SOURCE_SANS,
         16.0F
      );

      for (RenderUtil9 var19 : this.arr_b) {
         var19.calculate(var6, var8, var3);
         if (var7 != null) {
            break;
         }
      }

      for (RenderUtil50 var36 : this.arr_a) {
         var36.calculate(var6, var8, var36 == this.dataBuilder97_h);
         if (var7 != null) {
            break;
         }
      }

      this.dataBuilder97_h.a(var6, var8, var3);
      if (!this.list_f.isEmpty()) {
         this.list_e.removeAll(this.list_f);
         this.list_f.clear();
      }

      for (UIPanel var33 : this.list_e) {
         var33.toggle(var1, var2, var3);
         if (var7 != null) {
            break;
         }
      }

      if (this.list_f.isEmpty()) {
         this.list_e.removeAll(this.list_f);
         this.list_f.clear();
      }

      this.calculate_2(var6, var8, var3);

      for (Runnable var34 : this.list_d) {
         var34.run();
         if (var7 != null) {
            break;
         }
      }

      this.list_d.clear();
   }

   private static void lambda$new_Inner1() {
      long var0 = 63384808746224L;

      try {
         Desktop.getDesktop().browse(new URI("https://breeze.rip/dashboard/help"));
      } catch (IOException | URISyntaxException var3) {
      }
   }

   private static void lambda$new_Inner0() {
      long var0 = 71452437088365L;

      try {
         Desktop.getDesktop().browse(new URI("https://breeze.rip/discord"));
      } catch (IOException | URISyntaxException var3) {
      }
   }

   public static void initialize_3(int[] var0) {
      arr_u = var0;
   }

   public static int[] decrypt() {
      return arr_u;
   }

   static {
      long var0 = 139515381651065L;
      initialize_3(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[45];
      int var5 = 0;
      String var6 = "¼¯Æø\u0080T\u0000\u008dgZ,\u0097OÒt¤$^ëðÇ.%ÜÈ\u0016\u0006^J½ÖW\u0016!Ì²\u000fX5%8t&\u001c{÷\u001341\u0081o\u0006í³8\u0096ÖË]])Ø,\u0095¨\u009a\u0094\u008dã\u0099ÇeûÇa~\u007f_+9º\u0010ü\u0005Ñ÷0¦«@7\u009d\u0096ÖnÂª(ßeø±\u0080\u0084ÓÀx\u001aR\u008bã3¶F\u0010btgÞ_\u001a\u000ehê¯°hêDÒÄðüÐËö\u001b\u009d(ì\u0098\u0001ç\u0086\u0084E\"T|ZLÖô¼F³ö\\DÀ¶§ùî+xN±ô\n W\u001d À\u000b/\u0010ÎH·R\u009dø\r*¯£ôºÿÌ\u0095f\u00ad6û4ê\u0081\u001d\u009aÊ%¨\u008e=^xäý\u009dz$ï,q\u0003]ã!Ü\u001eÊ\u0018ûÞVýK®\u0088\u0082\u0006K¢°Ì;\u008bC*yÎÓ/nK¢=*\u0097(S#\u008e©N\u0084$öÕ%]¯\u008b/>&\u0082+\u0019\u0091Ì]9UÏ\u0094ýï\u0093¿i}zá¢\u001ahäXÏ á\u0005\u0017uéÕ%G¡µÄû\u009eÎïn\u007fJò\u0082&Òé\u009f\u0016Ó\u009a\u0087#Þ(o\u0018m\u0082\u0017N\u007fù\u0016\u0085\u0003z\u001bßë\u0006)\u0015,óåö±c]ã\u0010Ë\u0094ëb\u00adf{\t{èRiô\u0018áî\u0018ËýÀv')ÆÜð\u0011ÎtóV\u009d×é\u0013\u0015\u0092ãÝº \u0010´0øèÙ\u0007_¢k\u0004IQ^\u001cãÛ8`Bzaû\u0017´ÍðÒäNR¯<°Ü\fÑJ®¼\u008dIÌpi\u001cmEß\u000ea·ÔW®¥]\u0010ê÷\u0080Ç4Ù8!¿\u0003\u008eøy°.>(\u0091Ø#\u0093Ý=ë\u001ae\u000e&YWw\u0005Â\u0004gDÝíËîj\u0098\u008cq°½7\u0094C_ôsî\u007f\u0004¥Z(EÛ-Ù6~ø\u001fÃüÎ\u0082.ôH\t\u000f±\u001ah\u0000\u0015[[\u0003ªD~\u008c'K\u0012H\u008b`£ìl\u0080§(hg2\u0003ªÆJ\u001dß\u0099¤¬¢\u008dð[Ï\u0018;\u0012Êc\tAX\u0019Âw\u00ad\u0095\u009e@VSuøcÁ½Ð0\u009eÊ\u0095L±bÝöíã¬\u0095jRwsÆMí&{\u000f¸<Ïy\u008f°,Ë\u0088t\"\u0096q\\K\u0017Í\u0098ýðÛ\u0091\u0095QÑü(1\u001fr\u0082\"È×Jß({\u0091\u0007â\u0019ø«-$ñsµVc\u0081mg\u0096\u001dx\u0085a\u008a.Ó\u0089~¯öÍ(I\u0090\u0084\\Ç¬\u0080I§:4\\}L\u0086\u0097\u0094ºÈ\u0012\u0090QÛ¡Ój20§uY\u009d>å\u007fÞÄë\u0000ñ\u0018W\u001bÖ``4p\"¶§ñEßÖ°\u008cÑ\u0003\u009eÑô\u007fáü(\u001bNÀ\u0081\u0017<?óbåKÉ\u0016\u008d¾\u009bÆó\u0091©\u0017\u0090@6\u0018¨\u0002&\u0094\\ká&W)7¥\u0004ñ\u00150\u0082\u0001\u0005øé.A\u0003@ä\u0005\u008d\u0013íÙXy¦,\u0097\u0083ýscB]GYò\u009aÖÿkÒ(ñc<æ\u0085Ì\nl>õ\u000b£\u0091(¢\u008c\u0013\u000f\fK\u000f\u000eQ|\u001c#\u0081Ò\u000bLã\u001aíéå\u008b6\u007f¬'v,¸\u009fÓ\u0088\u0088>mõaP\u0095V(\u0095\u0000i^\\6F\u0083u$ø#5DÔ\u007f>þ[\u0099\u007fþ\u009e\u0005æpE\u0010#k|¹ö\u0083\u001a¼¸/î\u0010\u0010oà&|n\u0007\u001dì£aCäd\u008dz\u0084 L\u009f'Q\u0097å~T#\u0085?\u008d\u0017Q*kYÍì$\u001f\u00996\u0085H¸\u0012ù)\u007fm\u0084 TÙ*>\t\u0088ª´Z«A×\u009d\u0000\u0002@\u0091ÄÞ8´?_ïÏXp\u008c\u009b\nUe\u0010~°íí0Ù¸FtDèé\u0016\u0014\u0082\u00830\u0010\u009a©J3X°1`¤\u008céáÒ\u0002ÿ³%È£q\u00ad\"\u0092FüFo\u0018\b3[æ\t²º\u0011M¹k\u0098\u0092í°\u0088BÕ\u0083 Ã\rG¥\rÁAu\u0087\u0097Åà«UÒùÝÙ\u0082^/{\"Õt\n¼j\tÛ§§(©\u0096þxª®8R&\u0014º%Y¨°Î\u0092T©î9aò\u0083\u0097\u007fK+7pÍ3kâÏ»õ{(=@Jãº\u0001KÁF\u001dD]ý~\u0096\u000f{oÑ\u0007³;=ez5ÝJül\u0010I§}WdÑ\nFE\"Q\u0093â/¯½F¿Ñà\u0005-L~©»²BÄ\u000bÊBÊGm\u0018Cª\u009axò|:Ò-L\f\u0094 ßìðù;¹S\u000bp\u0089Ë(n;\u0093Êè?\u0006Æc8zR\u0092\u0005²Ñ\u0017jXYCp¦\u0092H~úîF¶\u0092\u0087 ç:[õfì\u0013 õ¤\u007f²\f\u008bé\u0097×ÃQ\u001bù1\u00ad\u0015¦\u0016¡Ô¨Sôp\u0090Àì#Ám\u0084\u001d\u0018\n®\u0081À\u0013\u0097(Eh\u0088\u00adY¿È²ËLõ³m\u009026À(ØÞ\u0091©Æ#\nÉ\u0000\u008a'!HZ\u0091ý&¾¥è\u009fÞ¯\u0084mþ\f]èoZ\u0091ièzÝS\"\u0000\u009b ×Å\u0019iz5xñ9´p²8®Z±\u000b¡Y\t>uåEM 2Ï\u0087Ì³û(`òî¨\u008fÐÎlÀ#+>7r0\u00adÍ\u0019Óéê\u001e\u0099?íò\u001eðZ¸yÄ7j\u009f¢\u008fz-0 3úÐup\u009fµûhmo}.é\u000e\u001b&è\u0089¤6s\u008dá\u009c\u0098\u0088íÏ¸^£0\"ÛG\u0005I\u008f\u0014¡\u0080?R\u0001¾\u001dÈñ\u0007\u0087ÞëaW\u0089\u001fT°Ã^\u001e\u007f ë\u0093>\\%µì´\u0087N\u0081\u001e§m\u0095T·8Y\u0090Z>µZ\u0097Â\u009eèõ\u009bâõO0Ì<vû^\n\u007fuÎ\u00ad\u0089É¹OÞKxºe\u0098\u0010;\u001b\u00adä\nÿ`$þ\\ÙI)òJõ\u000fC$8²\u0015ê:9\u0080\u001aý\r\u0098ÛfÌ2+9¸¾\u008f\u0001Ö\u0012Ü \u0015\u00105í?\u0088u/Æ\u0005µÃ],\"¯Ô\u0014vv¶\u008f¿\u00879ñÎ#®k-I(\u001cl\u0098ör¼\u0096\u0086ARTTBäøWøª¡øCV÷à.\u0083àM¿<ZYdz\u001dÈ´táî";
      int var7 = "¼¯Æø\u0080T\u0000\u008dgZ,\u0097OÒt¤$^ëðÇ.%ÜÈ\u0016\u0006^J½ÖW\u0016!Ì²\u000fX5%8t&\u001c{÷\u001341\u0081o\u0006í³8\u0096ÖË]])Ø,\u0095¨\u009a\u0094\u008dã\u0099ÇeûÇa~\u007f_+9º\u0010ü\u0005Ñ÷0¦«@7\u009d\u0096ÖnÂª(ßeø±\u0080\u0084ÓÀx\u001aR\u008bã3¶F\u0010btgÞ_\u001a\u000ehê¯°hêDÒÄðüÐËö\u001b\u009d(ì\u0098\u0001ç\u0086\u0084E\"T|ZLÖô¼F³ö\\DÀ¶§ùî+xN±ô\n W\u001d À\u000b/\u0010ÎH·R\u009dø\r*¯£ôºÿÌ\u0095f\u00ad6û4ê\u0081\u001d\u009aÊ%¨\u008e=^xäý\u009dz$ï,q\u0003]ã!Ü\u001eÊ\u0018ûÞVýK®\u0088\u0082\u0006K¢°Ì;\u008bC*yÎÓ/nK¢=*\u0097(S#\u008e©N\u0084$öÕ%]¯\u008b/>&\u0082+\u0019\u0091Ì]9UÏ\u0094ýï\u0093¿i}zá¢\u001ahäXÏ á\u0005\u0017uéÕ%G¡µÄû\u009eÎïn\u007fJò\u0082&Òé\u009f\u0016Ó\u009a\u0087#Þ(o\u0018m\u0082\u0017N\u007fù\u0016\u0085\u0003z\u001bßë\u0006)\u0015,óåö±c]ã\u0010Ë\u0094ëb\u00adf{\t{èRiô\u0018áî\u0018ËýÀv')ÆÜð\u0011ÎtóV\u009d×é\u0013\u0015\u0092ãÝº \u0010´0øèÙ\u0007_¢k\u0004IQ^\u001cãÛ8`Bzaû\u0017´ÍðÒäNR¯<°Ü\fÑJ®¼\u008dIÌpi\u001cmEß\u000ea·ÔW®¥]\u0010ê÷\u0080Ç4Ù8!¿\u0003\u008eøy°.>(\u0091Ø#\u0093Ý=ë\u001ae\u000e&YWw\u0005Â\u0004gDÝíËîj\u0098\u008cq°½7\u0094C_ôsî\u007f\u0004¥Z(EÛ-Ù6~ø\u001fÃüÎ\u0082.ôH\t\u000f±\u001ah\u0000\u0015[[\u0003ªD~\u008c'K\u0012H\u008b`£ìl\u0080§(hg2\u0003ªÆJ\u001dß\u0099¤¬¢\u008dð[Ï\u0018;\u0012Êc\tAX\u0019Âw\u00ad\u0095\u009e@VSuøcÁ½Ð0\u009eÊ\u0095L±bÝöíã¬\u0095jRwsÆMí&{\u000f¸<Ïy\u008f°,Ë\u0088t\"\u0096q\\K\u0017Í\u0098ýðÛ\u0091\u0095QÑü(1\u001fr\u0082\"È×Jß({\u0091\u0007â\u0019ø«-$ñsµVc\u0081mg\u0096\u001dx\u0085a\u008a.Ó\u0089~¯öÍ(I\u0090\u0084\\Ç¬\u0080I§:4\\}L\u0086\u0097\u0094ºÈ\u0012\u0090QÛ¡Ój20§uY\u009d>å\u007fÞÄë\u0000ñ\u0018W\u001bÖ``4p\"¶§ñEßÖ°\u008cÑ\u0003\u009eÑô\u007fáü(\u001bNÀ\u0081\u0017<?óbåKÉ\u0016\u008d¾\u009bÆó\u0091©\u0017\u0090@6\u0018¨\u0002&\u0094\\ká&W)7¥\u0004ñ\u00150\u0082\u0001\u0005øé.A\u0003@ä\u0005\u008d\u0013íÙXy¦,\u0097\u0083ýscB]GYò\u009aÖÿkÒ(ñc<æ\u0085Ì\nl>õ\u000b£\u0091(¢\u008c\u0013\u000f\fK\u000f\u000eQ|\u001c#\u0081Ò\u000bLã\u001aíéå\u008b6\u007f¬'v,¸\u009fÓ\u0088\u0088>mõaP\u0095V(\u0095\u0000i^\\6F\u0083u$ø#5DÔ\u007f>þ[\u0099\u007fþ\u009e\u0005æpE\u0010#k|¹ö\u0083\u001a¼¸/î\u0010\u0010oà&|n\u0007\u001dì£aCäd\u008dz\u0084 L\u009f'Q\u0097å~T#\u0085?\u008d\u0017Q*kYÍì$\u001f\u00996\u0085H¸\u0012ù)\u007fm\u0084 TÙ*>\t\u0088ª´Z«A×\u009d\u0000\u0002@\u0091ÄÞ8´?_ïÏXp\u008c\u009b\nUe\u0010~°íí0Ù¸FtDèé\u0016\u0014\u0082\u00830\u0010\u009a©J3X°1`¤\u008céáÒ\u0002ÿ³%È£q\u00ad\"\u0092FüFo\u0018\b3[æ\t²º\u0011M¹k\u0098\u0092í°\u0088BÕ\u0083 Ã\rG¥\rÁAu\u0087\u0097Åà«UÒùÝÙ\u0082^/{\"Õt\n¼j\tÛ§§(©\u0096þxª®8R&\u0014º%Y¨°Î\u0092T©î9aò\u0083\u0097\u007fK+7pÍ3kâÏ»õ{(=@Jãº\u0001KÁF\u001dD]ý~\u0096\u000f{oÑ\u0007³;=ez5ÝJül\u0010I§}WdÑ\nFE\"Q\u0093â/¯½F¿Ñà\u0005-L~©»²BÄ\u000bÊBÊGm\u0018Cª\u009axò|:Ò-L\f\u0094 ßìðù;¹S\u000bp\u0089Ë(n;\u0093Êè?\u0006Æc8zR\u0092\u0005²Ñ\u0017jXYCp¦\u0092H~úîF¶\u0092\u0087 ç:[õfì\u0013 õ¤\u007f²\f\u008bé\u0097×ÃQ\u001bù1\u00ad\u0015¦\u0016¡Ô¨Sôp\u0090Àì#Ám\u0084\u001d\u0018\n®\u0081À\u0013\u0097(Eh\u0088\u00adY¿È²ËLõ³m\u009026À(ØÞ\u0091©Æ#\nÉ\u0000\u008a'!HZ\u0091ý&¾¥è\u009fÞ¯\u0084mþ\f]èoZ\u0091ièzÝS\"\u0000\u009b ×Å\u0019iz5xñ9´p²8®Z±\u000b¡Y\t>uåEM 2Ï\u0087Ì³û(`òî¨\u008fÐÎlÀ#+>7r0\u00adÍ\u0019Óéê\u001e\u0099?íò\u001eðZ¸yÄ7j\u009f¢\u008fz-0 3úÐup\u009fµûhmo}.é\u000e\u001b&è\u0089¤6s\u008dá\u009c\u0098\u0088íÏ¸^£0\"ÛG\u0005I\u008f\u0014¡\u0080?R\u0001¾\u001dÈñ\u0007\u0087ÞëaW\u0089\u001fT°Ã^\u001e\u007f ë\u0093>\\%µì´\u0087N\u0081\u001e§m\u0095T·8Y\u0090Z>µZ\u0097Â\u009eèõ\u009bâõO0Ì<vû^\n\u007fuÎ\u00ad\u0089É¹OÞKxºe\u0098\u0010;\u001b\u00adä\nÿ`$þ\\ÙI)òJõ\u000fC$8²\u0015ê:9\u0080\u001aý\r\u0098ÛfÌ2+9¸¾\u008f\u0001Ö\u0012Ü \u0015\u00105í?\u0088u/Æ\u0005µÃ],\"¯Ô\u0014vv¶\u008f¿\u00879ñÎ#®k-I(\u001cl\u0098ör¼\u0096\u0086ARTTBäøWøª¡øCV÷à.\u0083àM¿<ZYdz\u001dÈ´táî"
         .length();
      char var8 = '(';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var26;
                  if ((var17 += var8) >= var7) {
                     CONST_W = var4;
                     CONST_X = new String[45];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 6254328670264063692L;
                     byte[] var15 = var11.doFinal(
                        new byte[]{
                           (byte)(var13 >>> 56),
                           (byte)(var13 >>> 48),
                           (byte)(var13 >>> 40),
                           (byte)(var13 >>> 32),
                           (byte)(var13 >>> 24),
                           (byte)(var13 >>> 16),
                           (byte)(var13 >>> 8),
                           (byte)var13
                        }
                     );
                     long var30 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     10000L = var30;
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var26;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "\u000f\u009dÄÏUÏ\u0017º§óÓ¬\u0092EM\u0002=dÄ¸è1Ix\u0019`T»þ\u0098àh0\u0015\u0098óL¬NÊTG\u0096\u0014\u000f\u001fÍðòÙ¨\u000e\u0011©èW\u009aðÛP[{/\u0018«\u008e¹Ù³\u0093ö+ ¿Æt\u0012×Ü\u008df";
                  var7 = "\u000f\u009dÄÏUÏ\u0017º§óÓ¬\u0092EM\u0002=dÄ¸è1Ix\u0019`T»þ\u0098àh0\u0015\u0098óL¬NÊTG\u0096\u0014\u000f\u001fÍðòÙ¨\u000e\u0011©èW\u009aðÛP[{/\u0018«\u008e¹Ù³\u0093ö+ ¿Æt\u0012×Ü\u008df"
                     .length();
                  var8 = ' ';
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13080;
      if (CONST_X[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Y.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Y.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cR", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_W[var3].getBytes("ISO-8859-1");
         CONST_X[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_X[var3];
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
         throw new RuntimeException("rip/breeze/cR" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
