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

public class RenderUtil14_x extends RenderUtil5 {
   private UserInfo userInfo_r;
   private StringDecryptHelper2 stringDecryptHelper2_s;
   private ImageUtil8 dataBuilder131_t;
   private RenderUtil49 dataBuilder96_u;
   private final RenderUtil16 dataBuilder132_v;
   private final RenderUtil24 dataBuilder34_w;
   private final RenderUtil18 dataBuilder136_x;
   private final RenderUtil17_x dataBuilder95_y;
   private final RenderUtil13 dataBuilder126_z;
   private final RenderUtil31 dataBuilder44_A;
   private final ImageUtil34 dataBuilder90_B;
   private final RenderUtil11 dataBuilder123_C;
   private final ImageUtil2 breezeUtil110_D;
   private LicenseState licenseState_E;
   private String string_F;
   private boolean fieldBool_G;
   private static String[] arr_H;
   private static final String[] CONST_P;
   private static final String[] CONST_Q;
   private static final Map CONST_R = new HashMap(13);
   private static final long[] CONST_S;
   private static final Integer[] CONST_T;
   private static final Map CONST_U;

   public RenderUtil14_x(StringDecryptHelper2 var1, UserInfo var2) {
      long var3 = 130566609150105L;
      super();
      this.licenseState_E = new LicenseState();
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs3(var1.fieldLong_a, this::update, this::update_2);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-6878947738360930061L, var3);
      Object[] var10002 = var10001;
      CloudAuthService var9 = var10000;
      Method var7 = var10003;

      try {
         var7.invoke(var9, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      this.userInfo_r = var2;
      boolean var8 = ConfigUtil2_x.checkCondition_2();
      this.stringDecryptHelper2_s = var1;
      boolean var5 = var8;
      this.dataBuilder126_z = new RenderUtil13(var2.string_b, var2.fieldInt_d, 35);
      this.dataBuilder44_A = new RenderUtil31(var1.string_b, 20, "default.text-primary");
      this.dataBuilder90_B = new ImageUtil34(RenderUtil19_x.SCRIPT);
      this.dataBuilder34_w = new RenderUtil24(RenderUtil19_x.SCRIPT, var1.fieldLong_a, this::initialize);
      this.dataBuilder132_v = new RenderUtil16(this, this.dataBuilder34_w);
      this.dataBuilder95_y = new RenderUtil17_x();
      this.dataBuilder136_x = new RenderUtil18(this, this.dataBuilder95_y);
      this.fieldBool_G = BreezeContext.dataBuilder15_j.getBreezeUtil15(var1.fieldLong_a) != null;
      this.dataBuilder123_C = new RenderUtil11(
         new LicenseState(),
         this.fieldBool_G ? "Open Script" : "Download",
         this::update_1
      );
      this.dataBuilder123_C.setString_p(this.fieldBool_G ? "open_browser" : null);
      this.breezeUtil110_D = new ImageUtil2(
         new LicenseState(),
         "delete",
         this::initialize_3,
         true,
         "Remove this script from your client."
      );
      if (!this.fieldBool_G) {
         this.breezeUtil110_D.h();
      }

      this.a(new UIPanel[]{this.dataBuilder126_z, this.dataBuilder44_A, this.dataBuilder90_B, this.dataBuilder123_C, this.breezeUtil110_D});
      this.calculate_2();
      if (!var5) {
         LicenseState.toggle(LicenseState.checkCondition());
      }
   }

   private void initialize(float var1, int var2) {
      this.stringDecryptHelper2_s.fieldFloat_d = var1;
      this.stringDecryptHelper2_s.fieldInt_e = var2;
   }

   private void update(String var1, StringDecryptHelper2 var2, UserInfo var3) {
      this.string_F = var1;
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$scriptLoaded_Inner0);
   }

   private boolean checkCondition() {
      long var1 = 36523250576348L;
      if (this.stringDecryptHelper2_s.fieldBool_m) {
         int var10000 = this.userInfo_r.fieldInt_d;
         CloudAuthService var10001 = BreezeContext.cloudAuthService_h;
         Object[] var10002 = rip.breeze.client.MathUtil8.noArgs();
         Method var10004 = rip.breeze.client.MathUtil8.getMethod_3(7770251233141926855L, var1);
         Object[] var10003 = var10002;
         CloudAuthService var7 = var10001;
         Method var5 = var10004;

         try {
            var6 = (UserInfo)var5.invoke(var7, var10003);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         if (var10000 != var6.fieldInt_d) {
            return false;
         }
      }

      return true;
   }

   private void update_1() {
      long var1 = 88663553382871L;
      boolean var3 = ConfigUtil2_x.checkCondition_2();
      if (this.fieldBool_G) {
         this.initialize_2();
         if (var3) {
            return;
         }
      }

      this.processNullable();
   }

   private void processNullable() {
      long var1 = 8579343526327L;
      if (this.string_F == null) {
         BreezeContext.guiPanelSettings_f.processAll("Error", "Failed to load script");
      } else {
         BreezeContext.guiPanelSettings_f.initialize(this::lambda$download_Inner1);
      }
   }

   private void initialize_2() {
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$openInScriptingTab_Inner2);
   }

   private void initialize_3() {
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$removeDownload_Inner3);
   }

   private void update_2(String var1) {
      long var2 = 116711688228267L;
      BreezeContext.guiPanelSettings_f.processAll("Failed fetching script", var1);
   }

   @Override
   public boolean isValid() {
      return true;
   }

   public void update_3() {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.processNullable(new RenderUtil14_x(this.stringDecryptHelper2_s, this.userInfo_r), false);
   }

   public boolean checkCondition_2(UIPanel var1) {
      long var2 = 94253235202450L;
      return var1 != this.breezeUtil110_D || this.fieldBool_G;
   }

   @Override
   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      boolean var6 = BreezeContext.dataBuilder15_j.getBreezeUtil15(this.stringDecryptHelper2_s.fieldLong_a) != null;
      if (var6 != this.fieldBool_G) {
         this.fieldBool_G = var6;
         this.dataBuilder123_C
            .decrypt(this.fieldBool_G ? "Open Script" : "Download");
         this.dataBuilder123_C.setString_p(this.fieldBool_G ? "open_browser" : null);
         this.calculate_3();
      }

      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 10.0F,
            this.b + 10.0F,
            this.licenseState_E.fieldFloat_c - 20.0F,
            90.0F,
            15.0F,
            BreezeContext.authSession_c.getColor("default.layer-one")
         );
      BreezeContext.iRenderer_b
         .drawText(
            "by" + this.userInfo_r.string_a,
            this.a + 65.0F,
            this.b + 63.0F,
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      super.calculate(var1, var2, var3);
   }

   @Override
   public void calculate_2() {
      long var1 = 62740630596709L;
      super.calculate_2();
      this.licenseState_E = new LicenseState(this.a, this.b + 40.0F, 250.0F, this.d - 40.0F);
      this.dataBuilder126_z.a(this.a + 25.0F, this.b + 55.0F, 35.0F, 35.0F);
      this.dataBuilder90_B.a(this.a + 25.0F, this.b + 24.0F, this.dataBuilder90_B.c, this.dataBuilder90_B.d);
      this.dataBuilder44_A.a(this.dataBuilder90_B.a() + 8.0F, this.b + 25.0F, this.licenseState_E.fieldFloat_c - 58.0F - this.dataBuilder90_B.c, 22.0F);
      this.calculate_3();
      this.o = 980329666;
      this.p = "¬ë8ƛz캃RէХA߉ϡPI";
   }

   private void calculate_3() {
      long var1 = 131084580231264L;
      boolean var10000 = ConfigUtil2_x.checkCondition_2();
      float var3 = this.b + this.d - 50.0F;
      boolean var4 = var10000;
      if (this.fieldBool_G) {
         this.dataBuilder123_C.processNullable(this.a + 10.0F, var3, this.licenseState_E.fieldFloat_c - 65.0F, 40.0F);
         this.breezeUtil110_D.a(this.a + this.licenseState_E.fieldFloat_c - 50.0F, var3, 40.0F, 40.0F);
         if (var4) {
            return;
         }
      }

      this.dataBuilder123_C.processNullable(this.a + 10.0F, var3, this.licenseState_E.fieldFloat_c - 20.0F, 40.0F);
   }

   private void lambda$removeDownload_Inner3() {
      long var1 = 3742047475014L;
      PlayerUtil2 var3 = BreezeContext.dataBuilder15_j.getBreezeUtil15(this.stringDecryptHelper2_s.fieldLong_a);
      if (var3 != null) {
         BreezeContext.dataBuilder15_j.toggle_2(var3);
         BreezeContext.guiPanelSettings_f
            .processAll(
               "Removed",
               "Unloaded"
                  + RenderUtil18_x.ACCENT
                  + this.stringDecryptHelper2_s.string_b
                  + RenderUtil18_x.RESET
                  + " from your client"
            );
      }
   }

   private void lambda$openInScriptingTab_Inner2() {
      long var1 = 118579225105058L;
      PlayerUtil2 var3 = BreezeContext.dataBuilder15_j.getBreezeUtil15(this.stringDecryptHelper2_s.fieldLong_a);
      if (var3 != null) {
         BreezeContext.guiPanelSettings_f.processNullable(BreezeContext.guiPanelSettings_f.dataBuilder102_s);
         BreezeContext.guiPanelSettings_f.dataBuilder102_s.processNullable(var3);
      }
   }

   private void lambda$download_Inner1() {
      long var1 = 4289298896354L;
      BreezeContext.dataBuilder15_j.toggle(new PlayerUtil2(this.stringDecryptHelper2_s, this.userInfo_r, this.string_F));
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(this.stringDecryptHelper2_s.fieldLong_a, RenderUtil19_x.SCRIPT);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(1579052243104562409L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      BreezeContext.guiPanelSettings_f
         .processAll(
            "Success",
            "Loaded"
               + RenderUtil18_x.ACCENT
               + this.stringDecryptHelper2_s.string_b
               + RenderUtil18_x.RESET
               + " into your client"
         );
   }

   private void lambda$scriptLoaded_Inner0(StringDecryptHelper2 var1, UserInfo var2, String var3) {
      long var4 = 66189882756322L;
      this.stringDecryptHelper2_s = var1;
      if (var2 != null) {
         this.userInfo_r = var2;
      }

      this.dataBuilder96_u = new RenderUtil49(this.stringDecryptHelper2_s, this.userInfo_r);
      this.dataBuilder131_t = new ImageUtil8(this, this.dataBuilder96_u);
      this.l.initialize(this.dataBuilder131_t);
      if (this.checkCondition()) {
         this.dataBuilder95_y.processAll(var3);
         this.l.initialize(this.dataBuilder136_x);
      }

      this.l.initialize(this.dataBuilder132_v);
      this.calculate_2();
   }

   public static void initialize_4(String[] var0) {
      arr_H = var0;
   }

   public static String[] decrypt() {
      return arr_H;
   }

   static {
      initialize_4(null);
      long var0 = 72272555523067L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[21];
      int var5 = 0;
      String var6 = "OÂ\u0010\u001aY°ºÜ<³\u0089K_ÝÂ^(\u0011bã\u00979UH®: QÙ.t\u0086XÅOi(P~ÙIÀB<\u0017Q\u0014å\u001b\u0087t5ÀÈ\u008eJu\u0018ÙU\u007f4\u00adU8Òb\u0080öÇ`¯$èuÊ¿\u000b¥\u0086\u000fc\u00103Öý÷+gÝ *\u0080\u008e%=æ\u00ad±(>S«¸H\u009bºõÝ8åýO°3í¦7»¡B|<,¶\u0012»Ö?[\u0095Í\u008cÚ&ÃÐ`æ° è®\u0001÷\u0018¾ú\u0094K]\u0093F ê\u0089þi$ ?\u0006\u009aÁ{\u009cmc¶=@Cï(\u00adº\u009c¥ïO\u00967ÿwHFÞ\u007fÀ\nÆùÊT\u0085`\u0002\u0088·+-\u0093\u0081ë7Ü7ù\u0087åÜ±\u0094s\u0010mPêý³çã¬ÀÃ]UG7}\u0092\u0018\u001f\u0092\u0083$ú¯\u0017\u0017ü\tHïËÊÈ\u0002\u008a_w#\u0088CÓ\u009a(zZ\u00938¦6\u0018\u0092X6×Â\u0096CÉyMÊsLt`·ÉAªîØ ¸j±\u0002\u008c\u0019Ã,ëW$(\"WY\u0094\u0089[\u001d4ÿ§Ýþá\u0001\u009d\u001f\u009b\u0010«ìm$\nÈG~Q¢üîá\u0015\u008fÝN\u0019m\u001303\u0018ín\u001dº¥»¦\u008cáQG\u0011í|W@\u0089cöÚ\b<H|\u0018.\u0006\u0000ýÓ\u0088K\u0015\u009bâüÇ\u009eº\u008e\u0015fm\n y$oD@â\u0010×Æ(@¡\u0084,<R_÷¸\u009bÜ9gµ\u0007'XT\u008aëMsÈ·P9«ó\u000b\u001d3Gúô_c\u008a\u00117a~á=m{¸\u0003\u0093Ù%\u0012ò»\u0000t\u0018CÉ²(¸\u0083Þ)û\u0081¾`üãÜè\u0015kfê\u000bQ]dæÿ\u0015\u0001µ¨áOk÷ö\u0006T\u0006|\t2\u009fÓv(\bn¦\u008e'\bJ\u000eø\u0088gÆº\u0080ù\u0080¤b\u0083\u0001Ë\u0011nç8\u0005\u008c7É\u0016\u0002£\u001e<]0\u0013ap²\u0010\u000b_º\u001f\u0093µþ¤\u0096\u0013\u000e¸ç+=ë n\u0019lYx¼\u009aÎº¶ p¢d´ç\u0080.fónNU\u0094ÁgÚ\u0097pLyi\u0018tªTÀ¦\u0085æ\u0081v\u008d\u008dymVNu\u0004îúÔt*µE";
      int var7 = "OÂ\u0010\u001aY°ºÜ<³\u0089K_ÝÂ^(\u0011bã\u00979UH®: QÙ.t\u0086XÅOi(P~ÙIÀB<\u0017Q\u0014å\u001b\u0087t5ÀÈ\u008eJu\u0018ÙU\u007f4\u00adU8Òb\u0080öÇ`¯$èuÊ¿\u000b¥\u0086\u000fc\u00103Öý÷+gÝ *\u0080\u008e%=æ\u00ad±(>S«¸H\u009bºõÝ8åýO°3í¦7»¡B|<,¶\u0012»Ö?[\u0095Í\u008cÚ&ÃÐ`æ° è®\u0001÷\u0018¾ú\u0094K]\u0093F ê\u0089þi$ ?\u0006\u009aÁ{\u009cmc¶=@Cï(\u00adº\u009c¥ïO\u00967ÿwHFÞ\u007fÀ\nÆùÊT\u0085`\u0002\u0088·+-\u0093\u0081ë7Ü7ù\u0087åÜ±\u0094s\u0010mPêý³çã¬ÀÃ]UG7}\u0092\u0018\u001f\u0092\u0083$ú¯\u0017\u0017ü\tHïËÊÈ\u0002\u008a_w#\u0088CÓ\u009a(zZ\u00938¦6\u0018\u0092X6×Â\u0096CÉyMÊsLt`·ÉAªîØ ¸j±\u0002\u008c\u0019Ã,ëW$(\"WY\u0094\u0089[\u001d4ÿ§Ýþá\u0001\u009d\u001f\u009b\u0010«ìm$\nÈG~Q¢üîá\u0015\u008fÝN\u0019m\u001303\u0018ín\u001dº¥»¦\u008cáQG\u0011í|W@\u0089cöÚ\b<H|\u0018.\u0006\u0000ýÓ\u0088K\u0015\u009bâüÇ\u009eº\u008e\u0015fm\n y$oD@â\u0010×Æ(@¡\u0084,<R_÷¸\u009bÜ9gµ\u0007'XT\u008aëMsÈ·P9«ó\u000b\u001d3Gúô_c\u008a\u00117a~á=m{¸\u0003\u0093Ù%\u0012ò»\u0000t\u0018CÉ²(¸\u0083Þ)û\u0081¾`üãÜè\u0015kfê\u000bQ]dæÿ\u0015\u0001µ¨áOk÷ö\u0006T\u0006|\t2\u009fÓv(\bn¦\u008e'\bJ\u000eø\u0088gÆº\u0080ù\u0080¤b\u0083\u0001Ë\u0011nç8\u0005\u008c7É\u0016\u0002£\u001e<]0\u0013ap²\u0010\u000b_º\u001f\u0093µþ¤\u0096\u0013\u000e¸ç+=ë n\u0019lYx¼\u009aÎº¶ p¢d´ç\u0080.fónNU\u0094ÁgÚ\u0097pLyi\u0018tªTÀ¦\u0085æ\u0081v\u008d\u008dymVNu\u0004îúÔt*µE"
         .length();
      char var8 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var33;
                  if ((var23 += var8) >= var7) {
                     CONST_P = var4;
                     CONST_Q = new String[21];
                     CONST_U = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[2];
                     int var14 = 0;
                     String var15 = "#uæ¨+Uz¹BV7\u008af\u009aPá";
                     int var16 = "#uæ¨+Uz¹BV7\u008af\u009aPá".length();
                     byte var17 = 0;

                     do {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        var10001 = var14++;
                        long var19 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte[] var21 = var11.doFinal(
                           new byte[]{
                              (byte)(var19 >>> 56),
                              (byte)(var19 >>> 48),
                              (byte)(var19 >>> 40),
                              (byte)(var19 >>> 32),
                              (byte)(var19 >>> 24),
                              (byte)(var19 >>> 16),
                              (byte)(var19 >>> 8),
                              (byte)var19
                           }
                        );
                        long var10004 = (var21[0] & 255L) << 56
                           | (var21[1] & 255L) << 48
                           | (var21[2] & 255L) << 40
                           | (var21[3] & 255L) << 32
                           | (var21[4] & 255L) << 24
                           | (var21[5] & 255L) << 16
                           | (var21[6] & 255L) << 8
                           | var21[7] & 255L;
                        byte var38 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_S = var13;
                     CONST_T = new Integer[2];
                     return;
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var33;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label45;
                  }

                  var6 = "6c|\u0004¯ä\u001c^Ä#\u008b¦®x\u009cD\u0010Bº¿_jð>UN\u0082Rd3Hô@";
                  var7 = "6c|\u0004¯ä\u001c^Ä#\u008b¦®x\u009cD\u0010Bº¿_jð>UN\u0082Rd3Hô@".length();
                  var8 = 16;
                  var23 = -1;
            }

            var24 = var6.substring(++var23, var23 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5461;
      if (CONST_Q[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_R.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_R.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dA", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_P[var3].getBytes("ISO-8859-1");
         CONST_Q[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Q[var3];
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
         throw new RuntimeException("rip/breeze/dA" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22647;
      if (CONST_T[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_S[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_U.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_U.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/dA", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_T[var3] = var15;
      }

      return CONST_T[var3];
   }

   private static int getValue(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = decrypt(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getValue".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/dA" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
