package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RenderUtil49 extends Util28 {
   private final StringDecryptHelper2 stringDecryptHelper2_j;
   private final UserInfo userInfo_k;
   private final RenderUtil31 dataBuilder44_l;
   private final RenderUtil11_x dataBuilder120_m;
   private final RenderUtil14 dataBuilder128_n;
   private final RenderUtil12 dataBuilder124_o;
   private final RenderUtil12 dataBuilder124_p;
   private final ImageUtil2 breezeUtil110_q;
   private final ImageUtil2 breezeUtil110_r;
   private final RenderUtil25 dataBuilder35_s;
   private final ImageUtil3 breezeUtil111_t;
   private final RenderUtil11_x dataBuilder120_u;
   private LicenseState licenseState_v;
   private LicenseState licenseState_w;
   private float fieldFloat_x;
   private float fieldFloat_y;
   private static final String[] CONST_A;
   private static final String[] CONST_B;
   private static final Map CONST_C = new HashMap(13);

   public RenderUtil49(StringDecryptHelper2 var1, UserInfo var2) {
      long var3 = 22030576283974L;
      super();
      this.licenseState_v = new LicenseState();
      this.licenseState_w = new LicenseState();
      this.stringDecryptHelper2_j = var1;
      this.userInfo_k = var2;
      this.dataBuilder44_l = new RenderUtil31(var1.string_b, 22, "default.text-primary");
      this.dataBuilder120_m = new RenderUtil11_x(var1.string_c, 18);
      this.dataBuilder128_n = new RenderUtil14(var1.fieldFloat_d, var1.fieldInt_e);
      int var10000 = RenderUtil17_x.getValue();
      this.dataBuilder124_o = new RenderUtil12(DateUtil_x.buildString_2(var1.fieldLong_h), new LicenseState());
      int var5 = var10000;
      this.dataBuilder124_p = new RenderUtil12(DateUtil_x.buildString_2(var1.fieldLong_g), new LicenseState());
      RenderUtil25 var10001 = new RenderUtil25();
      String var10003 = var1.string_j;
      int var10004 = var2.fieldInt_d;
      CloudAuthService var10005 = BreezeContext.cloudAuthService_h;
      Object[] var10006 = rip.breeze.client.MathUtil8.noArgs();
      Method var10008 = rip.breeze.client.MathUtil8.getMethod_3(8164831979707773277L, var3);
      Object[] var10007 = var10006;
      CloudAuthService var17 = var10005;
      Method var15 = var10008;

      try {
         var16 = (UserInfo)var15.invoke(var17, var10007);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      /* constructor call removed */
      this.dataBuilder35_s = var10001;
      this.breezeUtil111_t = var1.enum5Val_n != RenderUtil20_x.APPROVED ? new ImageUtil3(var1.enum5Val_n) : null;
      this.dataBuilder120_u = var1.string_o != null ? new RenderUtil11_x(var1.string_o, 16) : null;
      var10000 = var2.fieldInt_d;
      CloudAuthService var9 = BreezeContext.cloudAuthService_h;
      Object[] var10002 = rip.breeze.client.MathUtil8.noArgs();
      Method var14 = rip.breeze.client.MathUtil8.getMethod_3(8164831979707773277L, var3);
      Object[] var13 = var10002;
      CloudAuthService var12 = var9;
      Method var10 = var14;

      try {
         var11 = (UserInfo)var10.invoke(var12, var13);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      label50: {
         if (var10000 == var11.fieldInt_d) {
            this.breezeUtil110_q = new ImageUtil2(
               new LicenseState(), "edit", this::update, true, "Edit your script."
            );
            this.breezeUtil110_r = new ImageUtil2(
               new LicenseState(),
               "delete",
               this::clamp_2,
               true,
               "Delete your script."
            );
            this.a(new UIPanel[]{this.breezeUtil110_q, this.breezeUtil110_r, this.dataBuilder35_s});
            if (var5 != 0) {
               break label50;
            }
         }

         this.breezeUtil110_q = null;
         this.breezeUtil110_r = null;
      }

      this.a(new UIPanel[]{this.dataBuilder44_l, this.dataBuilder120_m, this.dataBuilder128_n, this.dataBuilder124_o, this.dataBuilder124_p});
      if (this.breezeUtil111_t != null) {
         this.b(this.breezeUtil111_t);
      }

      if (this.dataBuilder120_u != null) {
         this.b(this.dataBuilder120_u);
      }
   }

   private void update() {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new ImageUtil14(this.stringDecryptHelper2_j, this.userInfo_k));
   }

   private void clamp_2() {
      long var1 = 42173627628688L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs3(
         this.stringDecryptHelper2_j.fieldLong_a, RenderUtil49::lambda$delete_Inner1, RenderUtil49::lambda$delete_Inner2
      );
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-245667499315290948L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public boolean clamp(float var1, float var2, float var3) {
      long var4 = 108114635177705L;
      if (this.a(var1, var2)) {
         this.fieldFloat_x = this.fieldFloat_x - var3 * BreezeContext.iKeybindSettings_e.getX();
         this.fieldFloat_x = Math.max(0.0F, Math.min(this.fieldFloat_x, this.licenseState_w.fieldFloat_d - this.licenseState_v.fieldFloat_d));
         return true;
      } else {
         return super.checkCondition_5(var1, var2, var3);
      }
   }

   public void absValue(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      if (this.fieldFloat_x != this.fieldFloat_y) {
         this.fieldFloat_y = (float)MathUtil1.calculateDouble_2(this.fieldFloat_y, this.fieldFloat_x, 13.0, var3);
         if (Math.abs(this.fieldFloat_x - this.fieldFloat_y) < 1.0F) {
            this.fieldFloat_y = this.fieldFloat_x;
         }

         this.clamp_2();
      }

      BreezeContext.iRenderer_b.renderWithBounds(this.licenseState_v, this::lambda$draw_Inner3);
   }

   public void clamp_2() {
      long var1 = 62740630596709L;
      super.processNullable_4();
      this.licenseState_v = new LicenseState(this.a + 20.0F, this.b + 20.0F, this.c - 40.0F, this.d - 40.0F);
      int var10000 = RenderUtil17_x.getValue();
      this.licenseState_w = new LicenseState(this.a + 20.0F, this.b + 20.0F - this.fieldFloat_y, this.c - 40.0F, 250.0F);
      int var3 = var10000;
      this.dataBuilder44_l
         .a(
            this.licenseState_w.fieldFloat_a + 25.0F,
            this.licenseState_w.fieldFloat_b + 25.0F,
            Math.min(
               this.c - (this.breezeUtil110_q != null ? 270 : 180),
               BreezeContext.iRenderer_b.measureText(this.stringDecryptHelper2_j.string_b, EnumType32.SOURCE_SANS, 22.0F)
            ),
            30.0F
         );
      this.dataBuilder120_m
         .a(
            this.licenseState_w.fieldFloat_a + 25.0F,
            this.licenseState_w.fieldFloat_b + 60.0F,
            this.licenseState_w.fieldFloat_c - 40.0F,
            RenderUtil11_x.calculateFloat(this.stringDecryptHelper2_j.string_c, 18, this.licenseState_w.fieldFloat_c - 40.0F)
         );
      this.dataBuilder128_n.a(this.dataBuilder44_l.a() + 10.0F, this.licenseState_w.fieldFloat_b + 28.0F, this.c, 180.0F);
      this.licenseState_w.fieldFloat_d = this.dataBuilder120_m.d + 270.0F;
      if (this.breezeUtil110_q != null) {
         this.breezeUtil110_q.a(this.licenseState_w.fieldFloat_a + this.licenseState_w.fieldFloat_c - 80.0F, this.licenseState_w.fieldFloat_b + 15.0F, 30.0F, 30.0F);
         this.breezeUtil110_r.a(this.licenseState_w.fieldFloat_a + this.licenseState_w.fieldFloat_c - 45.0F, this.licenseState_w.fieldFloat_b + 15.0F, 30.0F, 30.0F);
      }

      this.dataBuilder35_s.a(this.licenseState_w.fieldFloat_a + 25.0F, this.dataBuilder120_m.b() + 130.0F, 200.0F, 50.0F);
      if (this.breezeUtil111_t != null) {
         float var4 = this.breezeUtil111_t.calculateFloat();
         this.breezeUtil111_t
            .a(this.licenseState_w.fieldFloat_a + this.licenseState_w.fieldFloat_c - 25.0F - var4, this.dataBuilder120_m.b() + 140.0F, var4, this.breezeUtil111_t.d);
      }

      if (this.dataBuilder120_u != null) {
         this.dataBuilder120_u
            .a(
               this.licenseState_w.fieldFloat_a + 25.0F,
               this.dataBuilder120_m.b() + 210.0F,
               this.licenseState_w.fieldFloat_c - 50.0F,
               RenderUtil11_x.calculateFloat(this.stringDecryptHelper2_j.string_o, 16, this.licenseState_w.fieldFloat_c - 50.0F)
            );
         this.licenseState_w.fieldFloat_d = this.dataBuilder120_m.d + 270.0F + this.dataBuilder120_u.d + 40.0F;
      }

      float var8 = BreezeContext.iRenderer_b.measureText("Created:", EnumType32.SOURCE_SANS, 18.0F);
      float var5 = BreezeContext.iRenderer_b.measureText("Last Updated:", EnumType32.SOURCE_SANS, 18.0F);
      float var6 = BreezeContext.iRenderer_b.measureText(DateUtil_x.buildString(this.stringDecryptHelper2_j.fieldLong_h), EnumType32.SOURCE_SANS, 18.0F);
      float var7 = BreezeContext.iRenderer_b.measureText(DateUtil_x.buildString(this.stringDecryptHelper2_j.fieldLong_g), EnumType32.SOURCE_SANS, 18.0F);
      this.dataBuilder124_o.a(this.licenseState_w.fieldFloat_a + 30.0F + var8, this.dataBuilder120_m.b() + 33.0F, var6, 22.0F);
      this.dataBuilder124_p.a(this.licenseState_w.fieldFloat_a + 30.0F + var5, this.dataBuilder120_m.b() + 58.0F, var7, 22.0F);
      this.fieldFloat_x = Math.max(0.0F, Math.min(this.fieldFloat_x, this.licenseState_w.fieldFloat_d - this.licenseState_v.fieldFloat_d));
      if (var3 == 0) {
         LicenseState.toggle(LicenseState.checkCondition());
      }
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   private void lambda$draw_Inner3(float var1, float var2, float var3) {
      long var4 = 18389009896254L;
      this.dataBuilder128_n.initialize(this.stringDecryptHelper2_j.fieldFloat_d, this.stringDecryptHelper2_j.fieldInt_e);
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_w,
            BreezeContext.authSession_c.getFloat("cloud.corner-radius"),
            BreezeContext.authSession_c.getColor("default.layer-one")
         );
      float var6 = BreezeContext.iRenderer_b.measureText("Downloads:", EnumType32.SOURCE_SANS, 18.0F);
      float var7 = BreezeContext.iRenderer_b.measureText("Created:", EnumType32.SOURCE_SANS, 18.0F);
      float var8 = BreezeContext.iRenderer_b.measureText("Last Updated:", EnumType32.SOURCE_SANS, 18.0F);
      float var9 = BreezeContext.iRenderer_b.measureText("Breeze Version:", EnumType32.SOURCE_SANS, 18.0F);
      BreezeContext.iRenderer_b
         .drawText(
            "Downloads:",
            this.licenseState_w.fieldFloat_a + 25.0F,
            this.dataBuilder120_m.b() + 10.0F,
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            "Created:",
            this.licenseState_w.fieldFloat_a + 25.0F,
            this.dataBuilder120_m.b() + 35.0F,
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            "Last Updated:",
            this.licenseState_w.fieldFloat_a + 25.0F,
            this.dataBuilder120_m.b() + 60.0F,
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            "Breeze Version:",
            this.licenseState_w.fieldFloat_a + 25.0F,
            this.dataBuilder120_m.b() + 85.0F,
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            DateUtil_x.buildString_3(this.stringDecryptHelper2_j.fieldInt_f),
            this.licenseState_w.fieldFloat_a + 30.0F + var6,
            this.dataBuilder120_m.b() + 10.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            DateUtil_x.buildString(this.stringDecryptHelper2_j.fieldLong_h),
            this.licenseState_w.fieldFloat_a + 30.0F + var7,
            this.dataBuilder120_m.b() + 35.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            DateUtil_x.buildString(this.stringDecryptHelper2_j.fieldLong_g),
            this.licenseState_w.fieldFloat_a + 30.0F + var8,
            this.dataBuilder120_m.b() + 60.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            this.stringDecryptHelper2_j.string_i,
            this.licenseState_w.fieldFloat_a + 30.0F + var9,
            this.dataBuilder120_m.b() + 85.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      if (this.stringDecryptHelper2_j.fieldBool_m) {
         BreezeContext.iRenderer_b
            .drawText(
               "Closed source — source hidden from others",
               this.licenseState_w.fieldFloat_a + 25.0F,
               this.dataBuilder120_m.b() + 110.0F,
               BreezeContext.authSession_c.getColor("default.accent"),
               EnumType32.SOURCE_SANS,
               16.0F
            );
      }

      if (this.dataBuilder120_u != null) {
         BreezeContext.iRenderer_b
            .drawText(
               "Review feedback:",
               this.licenseState_w.fieldFloat_a + 25.0F,
               this.dataBuilder120_u.b - 22.0F,
               this.stringDecryptHelper2_j.enum5Val_n.getColor_c(),
               EnumType32.SOURCE_SANS,
               18.0F
            );
      }

      super.processNullable(var1, var2 + this.fieldFloat_y, var3);
   }

   private static void lambda$delete_Inner2(String var0) {
      long var1 = 91683502601153L;
      BreezeContext.guiPanelSettings_f.processAll("Error deleting script", RenderUtil18_x.RED + var0);
   }

   private static void lambda$delete_Inner1() {
      BreezeContext.guiPanelSettings_f.initialize(RenderUtil49::lambda$null_Inner0);
   }

   private static void lambda$null_Inner0() {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.processNullable_2();
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize_2();
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize();
   }

   static {
      long var0 = 120337945856363L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[25];
      int var5 = 0;
      String var6 = "\u0096c¡\"5\u0093Í³¬É\u0095\u001bónâÈÐ[Ô;9¥ª\u0081\u009a²0jAJí¨(\u0006Q\u001fdº\f§é|\u0093W\u008eQ>\u0018¯\u008f6³\u0097³\u001eÇ¡¾\u008c¼v,$P\u0006:\u0017qe\u0088áÓä ^<:ý 0AX\u008d(G]ÛÙ\u0086´»\u0097V÷!\u0091l\u0097\u0096aE\u0080BøÖ7 ³v¢uÏ Tô¸zÀ±®çé`5<\u0086\rîô«\u0019\u001aMRÎ]\u009ac³(×Ééb\u000fDã?\u0089#÷\u000e±\u0003ìM¶\u0011\u0088\u000b\u0091Oìc/Àv\u0011\u0012ËD²)A¨`PÎ½® \f\u008aò{(8×\u0084]¾ÖoÜ\u0005±Oa\u001cFkq¢s\u0003áÌ^CÕÄ{Ð(¢WQÌ\u0014ýR9\u0002\u0083¿æÖ\u001c\u0085,Z\u001d4Z)²§VÝ?\u008câ,Z-\u0097¡\u009b\u000bðYG\fe\u0010\u001692Ý¸í.Ð¯\u0083Ëy\f\u00adÀ\f\u0018µ\u0006\u0014ç >\f\u0089\u0084½Æ-:æù -y\u001bÆUßÈf(¾\"Ø·:\u00980-wß\u0014Gñ\u0016-èÃ2º\u0080 %É:òÓæõ\u0017\u001fömJ\u001dR°gô{¹(\u0006R¯bÐ\u000fxäç{Oýo\\EHiBs\u0085\u0096\u0011\tô\u001eâ[Q½6ÞnÆY8Vn?Áo\u0018SÁ(¼»ÚËÃ\u00828\u0090!ý1{¦\u000e\u0086È\u0019\u009c\u009f\\\u000b(Ê0\u0005Ùîø3®x|¥ê\u0018\u008bª(MîU¬äÅ<om\u009dê\r\u0019Å¡C\u0015÷$Ü\u0015Å\u008bÊ(¥\u001d©{\u0087hÝ>\u000b\nZo6T\u0007H0+B\u001a»nU/¸ñÀW\u0081\u0096\u0098¾\u0019ÄYp\u0091ò\u0082Ô å\u0081p\u001a\u0090^5a\u00164é¶u\u001c$+2U\u0001D¨¹y\u001b\tß¹@Üç\u001ek \u001fü¶\u0015éÜ#;ðzÌa~ah\u0016Áf¡Ðù\u0093\u000f\fâQ\u007f\u008e\u0004\u0097Þ\u0088(,EñU6mÂ\u0010®ë'¸â\u001a\u0003Y\u0087áØûÝ\u0081H\u009f{zÎ\u0003 ©B»\rÛ©ìh'\u000eÊ(þ\u008a°A.á·öÍ\u0089=ªÛ\u0087è¢u\u001e¨\u0010f;¶\u001da\u00878+]ê}®(©\u000e$tö;\u00adHü\u000böóÁ\u009b_\u0006oö\u0085ºÔ-G<â°ë¦F\u008bCì \u008d³ä|ÖW\u0088çµøÄ2±K>À\u0003!d\u001f\u0012\u001eótXÒ¥Btï\u008cüÃïOIR½µÖðÑ\u0095Yº\u001c# ã\u0085¤\u0010´ä\u009f\u0001ÅE²FÓ\u0010U\u0089Ú\u009aôíÎ4ùy\u0002ñ=\u008eãÇGP(nýÒº!%\u0097Äf<[@Õ4ªPR\fAÀ\u0084\u008b\u0091ðî\u0012HíÍK}\u001eí\u0083ù·¶\u0092\u008ds \u0092ã\u001dÖãieÿ£F½R¨%Vèjù^F\u0007ZY\r\u001f\u0017ÿ//!Em(/¼\u0019@N\u008cra¢b{®¨Ã\u0014Í\u00ad¼®>c\"Ûý\u008a³\u0017øã3\u001cî×®[©\u0092\bj\u0091";
      int var7 = "\u0096c¡\"5\u0093Í³¬É\u0095\u001bónâÈÐ[Ô;9¥ª\u0081\u009a²0jAJí¨(\u0006Q\u001fdº\f§é|\u0093W\u008eQ>\u0018¯\u008f6³\u0097³\u001eÇ¡¾\u008c¼v,$P\u0006:\u0017qe\u0088áÓä ^<:ý 0AX\u008d(G]ÛÙ\u0086´»\u0097V÷!\u0091l\u0097\u0096aE\u0080BøÖ7 ³v¢uÏ Tô¸zÀ±®çé`5<\u0086\rîô«\u0019\u001aMRÎ]\u009ac³(×Ééb\u000fDã?\u0089#÷\u000e±\u0003ìM¶\u0011\u0088\u000b\u0091Oìc/Àv\u0011\u0012ËD²)A¨`PÎ½® \f\u008aò{(8×\u0084]¾ÖoÜ\u0005±Oa\u001cFkq¢s\u0003áÌ^CÕÄ{Ð(¢WQÌ\u0014ýR9\u0002\u0083¿æÖ\u001c\u0085,Z\u001d4Z)²§VÝ?\u008câ,Z-\u0097¡\u009b\u000bðYG\fe\u0010\u001692Ý¸í.Ð¯\u0083Ëy\f\u00adÀ\f\u0018µ\u0006\u0014ç >\f\u0089\u0084½Æ-:æù -y\u001bÆUßÈf(¾\"Ø·:\u00980-wß\u0014Gñ\u0016-èÃ2º\u0080 %É:òÓæõ\u0017\u001fömJ\u001dR°gô{¹(\u0006R¯bÐ\u000fxäç{Oýo\\EHiBs\u0085\u0096\u0011\tô\u001eâ[Q½6ÞnÆY8Vn?Áo\u0018SÁ(¼»ÚËÃ\u00828\u0090!ý1{¦\u000e\u0086È\u0019\u009c\u009f\\\u000b(Ê0\u0005Ùîø3®x|¥ê\u0018\u008bª(MîU¬äÅ<om\u009dê\r\u0019Å¡C\u0015÷$Ü\u0015Å\u008bÊ(¥\u001d©{\u0087hÝ>\u000b\nZo6T\u0007H0+B\u001a»nU/¸ñÀW\u0081\u0096\u0098¾\u0019ÄYp\u0091ò\u0082Ô å\u0081p\u001a\u0090^5a\u00164é¶u\u001c$+2U\u0001D¨¹y\u001b\tß¹@Üç\u001ek \u001fü¶\u0015éÜ#;ðzÌa~ah\u0016Áf¡Ðù\u0093\u000f\fâQ\u007f\u008e\u0004\u0097Þ\u0088(,EñU6mÂ\u0010®ë'¸â\u001a\u0003Y\u0087áØûÝ\u0081H\u009f{zÎ\u0003 ©B»\rÛ©ìh'\u000eÊ(þ\u008a°A.á·öÍ\u0089=ªÛ\u0087è¢u\u001e¨\u0010f;¶\u001da\u00878+]ê}®(©\u000e$tö;\u00adHü\u000böóÁ\u009b_\u0006oö\u0085ºÔ-G<â°ë¦F\u008bCì \u008d³ä|ÖW\u0088çµøÄ2±K>À\u0003!d\u001f\u0012\u001eótXÒ¥Btï\u008cüÃïOIR½µÖðÑ\u0095Yº\u001c# ã\u0085¤\u0010´ä\u009f\u0001ÅE²FÓ\u0010U\u0089Ú\u009aôíÎ4ùy\u0002ñ=\u008eãÇGP(nýÒº!%\u0097Äf<[@Õ4ªPR\fAÀ\u0084\u008b\u0091ðî\u0012HíÍK}\u001eí\u0083ù·¶\u0092\u008ds \u0092ã\u001dÖãieÿ£F½R¨%Vèjù^F\u0007ZY\r\u001f\u0017ÿ//!Em(/¼\u0019@N\u008cra¢b{®¨Ã\u0014Í\u00ad¼®>c\"Ûý\u008a³\u0017øã3\u001cî×®[©\u0092\bj\u0091"
         .length();
      char var8 = ' ';
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
                     CONST_B = new String[25];
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

                  var6 = "\u008fìo_\u009aé«Áu½*¨ºùÿÊ(M)\u008bú¥°ÄÄ=\u0082\u001cëÐ<Ø¤\u0000E2\fO?\u0091µWEo$\u0086\u0082\u007f\u0093\fD\u0018\u0093\u001e%Ü\u0084";
                  var7 = "\u008fìo_\u009aé«Áu½*¨ºùÿÊ(M)\u008bú¥°ÄÄ=\u0082\u001cëÐ<Ø¤\u0000E2\fO?\u0091µWEo$\u0086\u0082\u007f\u0093\fD\u0018\u0093\u001e%Ü\u0084"
                     .length();
                  var8 = 16;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22863;
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
            throw new RuntimeException("rip/breeze/dn", var10);
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
         throw new RuntimeException("rip/breeze/dn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
