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

public class RenderUtil40 extends ConfigUtil2_x {
   private final long fieldLong_l;
   private StringDecryptHelper3 stringDecryptHelper3_m;
   private ImageUtil18 dataBuilder41_n;
   private UserInfo userInfo_o;
   private LicenseState licenseState_p;
   private LicenseState licenseState_q;
   private final RenderUtil12 dataBuilder124_r;
   private final RenderUtil12 dataBuilder124_s;
   private final RenderUtil12_x dataBuilder125_t;
   private final ImageUtil2 breezeUtil110_u;
   private final ImageUtil2 breezeUtil110_v;
   private final ImageUtil2 breezeUtil110_w;
   private final ImageUtil2 breezeUtil110_x;
   private RenderUtil10 dataBuilder122_y;
   private RenderUtil31 dataBuilder44_z;
   private RenderUtil13 dataBuilder126_A;
   private RenderUtil31 dataBuilder44_B;
   private RenderUtil25 dataBuilder35_C;
   private static int[] arr_D;
   private static final String[] CONST_F;
   private static final String[] CONST_G;
   private static final Map CONST_H = new HashMap(13);

   public RenderUtil40(long var1) {
      long var3 = 64638863829996L;
      super(true);
      this.licenseState_p = new LicenseState();
      this.licenseState_q = new LicenseState();
      this.fieldLong_l = var1;
      this.dataBuilder125_t = new RenderUtil12_x(false, var1, RenderUtil19_x.THEME);
      this.breezeUtil110_u = new ImageUtil2(
         new LicenseState(), "download", this::processAll, false, "Download and apply this theme to your ui."
      );
      this.breezeUtil110_u.setFloat_t(0.05F);
      this.breezeUtil110_v = new ImageUtil2(
         new LicenseState(),
         "code",
         this::processAll_2,
         false,
         "View the source for this theme."
      );
      this.breezeUtil110_w = new ImageUtil2(
         new LicenseState(),
         "edit",
         this::processAll_4,
         false,
         "Edit this theme."
      );
      this.breezeUtil110_x = new ImageUtil2(
         new LicenseState(),
         "delete",
         this::processAll_3,
         false,
         "Delete this theme."
      );
      this.dataBuilder124_r = new RenderUtil12("Fetching..", new LicenseState());
      this.dataBuilder124_s = new RenderUtil12("Fetching..", new LicenseState());
      this.dataBuilder35_C = new RenderUtil25("XXXXXXXXXX", false, RenderUtil19_x.THEME, var1);
      this.a(new UIPanel[]{this.dataBuilder125_t, this.breezeUtil110_u});
      this.processAll_4();
   }

   private void processAll_4() {
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$edit_Inner0);
   }

   private void processAll() {
      long var1 = 24450268078640L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(this.fieldLong_l, RenderUtil19_x.THEME);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(2466845030714690363L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var8 = var10000;
      Method var5 = var10003;

      try {
         var5.invoke(var8, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10000 = BreezeContext.cloudAuthService_h;
      var10001 = rip.breeze.client.MathUtil8.buildArgs1(this.fieldLong_l);
      var10003 = rip.breeze.client.MathUtil8.getMethod_3(2466441239319588173L, var1);
      var10002 = var10001;
      CloudAuthService var10 = var10000;
      Method var7 = var10003;

      try {
         var7.invoke(var10, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      BreezeContext.guiPanelSettings_f.initialize(this::lambda$download_Inner1);
   }

   private void processAll_2() {
      long var1 = 19119886052377L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(this.fieldLong_l, RenderUtil19_x.THEME);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(3175874616977573138L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      BreezeContext.guiPanelSettings_f.initialize(this::lambda$remix_Inner2);
   }

   private void processAll_3() {
      long var1 = 104242363662518L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs3(this.fieldLong_l, RenderUtil40::lambda$delete_Inner4, RenderUtil40::lambda$delete_Inner5);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-9169495571197510169L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void calculate(float var1, float var2, float var3) {
      label17: {
         long var4 = 27283383647554L;
         int[] var10000 = decrypt();
         BreezeContext.iRenderer_b
            .strokeRoundedRect(
               this.licenseState_p,
               BreezeContext.authSession_c.getFloat("cloud.corner-radius"),
               BreezeContext.authSession_c.getColor("default.layer-one")
            );
         int[] var6 = var10000;
         if (this.stringDecryptHelper3_m == null || !this.d(this.dataBuilder122_y)) {
            BreezeContext.iRenderer_b
               .strokeRoundedRect(
                  this.licenseState_q,
                  BreezeContext.authSession_c.getFloat("cloud.corner-radius"),
                  RenderUtil1.getColor_2(
                     BreezeContext.authSession_c.getColor("default.layer-one"),
                     BreezeContext.authSession_c.getColor("default.hovered")
                  )
               );
            if (var6 != null) {
               break label17;
            }
         }

         float var7 = BreezeContext.iRenderer_b.measureText("Downloads:", EnumType32.SOURCE_SANS, 18.0F);
         float var8 = BreezeContext.iRenderer_b.measureText("Created:", EnumType32.SOURCE_SANS, 18.0F);
         float var9 = BreezeContext.iRenderer_b.measureText("Last Updated:", EnumType32.SOURCE_SANS, 18.0F);
         BreezeContext.iRenderer_b
            .drawText(
               "Downloads:",
               this.licenseState_q.calculateFloat() + 25.0F,
               this.licenseState_p.fieldFloat_b + 100.0F,
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
         BreezeContext.iRenderer_b
            .drawText(
               "Created:",
               this.licenseState_q.calculateFloat() + 25.0F,
               this.licenseState_p.fieldFloat_b + 125.0F,
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
         BreezeContext.iRenderer_b
            .drawText(
               "Last Updated:",
               this.licenseState_q.calculateFloat() + 25.0F,
               this.licenseState_p.fieldFloat_b + 150.0F,
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
         BreezeContext.iRenderer_b
            .drawText(
               DateUtil_x.buildString_3(this.stringDecryptHelper3_m.fieldInt_d),
               this.licenseState_q.calculateFloat() + 30.0F + var7,
               this.licenseState_p.fieldFloat_b + 100.0F,
               BreezeContext.authSession_c.getColor("default.text-tertiary"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
         BreezeContext.iRenderer_b
            .drawText(
               DateUtil_x.buildString(this.stringDecryptHelper3_m.fieldLong_e),
               this.licenseState_q.calculateFloat() + 30.0F + var8,
               this.licenseState_p.fieldFloat_b + 125.0F,
               BreezeContext.authSession_c.getColor("default.text-tertiary"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
         BreezeContext.iRenderer_b
            .drawText(
               DateUtil_x.buildString(this.stringDecryptHelper3_m.fieldLong_f),
               this.licenseState_q.calculateFloat() + 30.0F + var9,
               this.licenseState_p.fieldFloat_b + 150.0F,
               BreezeContext.authSession_c.getColor("default.text-tertiary"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
      }

      super.a(var1, var2, var3);
   }

   private void update(ImageUtil18 var1, StringDecryptHelper3 var2, UserInfo var3) {
      this.dataBuilder41_n = var1;
      this.stringDecryptHelper3_m = var2;
      this.userInfo_o = var3;
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$themeLoaded_Inner6);
   }

   public void processAll_4() {
      long var1 = 133010015979109L;
      this.b(new UIPanel[]{this.dataBuilder122_y, this.dataBuilder44_z, this.dataBuilder126_A, this.dataBuilder44_B, this.dataBuilder35_C});
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs3(this.fieldLong_l, this::update, RenderUtil40::lambda$refresh_Inner7);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(462612197390726474L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   public boolean isValid() {
      return this.d(this.dataBuilder122_y);
   }

   public void calculate_2() {
      long var1 = 62740630596709L;
      int[] var10000 = decrypt();
      this.licenseState_p = new LicenseState(this.a + 20.0F, this.b + 20.0F, this.c - 40.0F, 0.0F);
      int[] var3 = var10000;
      this.licenseState_q = new LicenseState(
         this.licenseState_p.fieldFloat_a + 20.0F,
         this.licenseState_p.fieldFloat_b + 20.0F,
         (this.licenseState_p.fieldFloat_c - 50.0F) / 2.0F,
         (this.licenseState_p.fieldFloat_c - 50.0F) / 2.0F * 0.7F
      );
      this.licenseState_p.fieldFloat_d = this.licenseState_q.fieldFloat_d + 40.0F;
      boolean var4 = this.licenseState_p.fieldFloat_d < 300.0F;
      if (var4) {
         this.licenseState_p.fieldFloat_d = this.licenseState_q.fieldFloat_d + 90.0F;
      }

      if (this.dataBuilder122_y != null) {
         label36: {
            this.dataBuilder122_y.a(this.licenseState_q);
            this.dataBuilder126_A.a(this.licenseState_q.calculateFloat() + 20.0F, this.licenseState_p.fieldFloat_b + 25.0F, 60.0F, 60.0F);
            this.dataBuilder44_z
               .a(
                  this.dataBuilder126_A.a() + 10.0F,
                  this.licenseState_p.fieldFloat_b + 30.0F,
                  this.licenseState_p.fieldFloat_c - this.licenseState_q.fieldFloat_c - 160.0F,
                  24.0F
               );
            this.dataBuilder44_B.a(this.dataBuilder126_A.a() + 10.0F, this.licenseState_p.fieldFloat_b + 57.0F, this.dataBuilder44_z.c, 24.0F);
            if (var4) {
               this.dataBuilder35_C
                  .a(
                     this.licenseState_q.calculateFloat() + (this.licenseState_p.fieldFloat_c - this.licenseState_q.fieldFloat_c - 20.0F) / 2.0F - 100.0F,
                     this.licenseState_p.calculateFloat_2() - 70.0F,
                     200.0F,
                     50.0F
                  );
               if (var3 != null) {
                  break label36;
               }
            }

            this.dataBuilder35_C.a(this.licenseState_q.calculateFloat() + 25.0F, this.licenseState_p.fieldFloat_b + 190.0F, 200.0F, 50.0F);
         }

         float var5 = BreezeContext.iRenderer_b.measureText("Created:", EnumType32.SOURCE_SANS, 18.0F);
         float var6 = BreezeContext.iRenderer_b.measureText("Last Updated:", EnumType32.SOURCE_SANS, 18.0F);
         float var7 = BreezeContext.iRenderer_b.measureText(DateUtil_x.buildString(this.stringDecryptHelper3_m.fieldLong_e), EnumType32.SOURCE_SANS, 18.0F);
         float var8 = BreezeContext.iRenderer_b.measureText(DateUtil_x.buildString(this.stringDecryptHelper3_m.fieldLong_f), EnumType32.SOURCE_SANS, 18.0F);
         this.dataBuilder124_r.a(this.licenseState_q.calculateFloat() + 30.0F + var5, this.licenseState_p.fieldFloat_b + 123.0F, var7, 22.0F);
         this.dataBuilder124_s.a(this.licenseState_q.calculateFloat() + 30.0F + var6, this.licenseState_p.fieldFloat_b + 148.0F, var8, 22.0F);
      }

      float var9 = var4 ? this.licenseState_p.fieldFloat_a + 30.0F : this.licenseState_q.calculateFloat() + 30.0F;
      this.dataBuilder125_t.a(this.licenseState_p.calculateFloat() - 45.0F, this.licenseState_p.fieldFloat_b + 28.0F, 25.0F, 25.0F);
      this.breezeUtil110_u.a(var9, this.licenseState_p.calculateFloat_2() - 55.0F, 30.0F, 30.0F);
      if (this.d(this.breezeUtil110_w)) {
         this.breezeUtil110_w.a(var9 + 40.0F, this.licenseState_p.calculateFloat_2() - 55.0F, 30.0F, 30.0F);
         this.breezeUtil110_x.a(var9 + 80.0F, this.licenseState_p.calculateFloat_2() - 55.0F, 30.0F, 30.0F);
         if (var3 != null) {
            return;
         }
      }

      if (this.d(this.breezeUtil110_v)) {
         this.breezeUtil110_v.a(var9 + 40.0F, this.licenseState_p.calculateFloat_2() - 55.0F, 30.0F, 30.0F);
      }
   }

   private static void lambda$refresh_Inner7(String var0) {
      long var1 = 55922178874179L;
      BreezeContext.guiPanelSettings_f.processAll("Error fetching theme", RenderUtil18_x.RED + var0);
   }

   private void lambda$themeLoaded_Inner6(StringDecryptHelper3 var1, UserInfo var2) {
      long var3 = 125117676595807L;
      this.dataBuilder125_t.setBool_k(var1.fieldBool_c);
      int[] var10000 = decrypt();
      this.dataBuilder122_y = new RenderUtil10(this.dataBuilder41_n);
      this.dataBuilder44_z = new RenderUtil31(var1.string_b, 24, "default.text-primary");
      this.dataBuilder44_B = new RenderUtil31(var2.string_a, 20, "default.text-tertiary");
      this.dataBuilder126_A = new RenderUtil13(var2.string_b, var2.fieldInt_d, 35);
      int[] var5 = var10000;
      int var8 = var2.fieldInt_d;
      CloudAuthService var10001 = BreezeContext.cloudAuthService_h;
      Object[] var10002 = rip.breeze.client.MathUtil8.noArgs();
      Method var10004 = rip.breeze.client.MathUtil8.getMethod_3(3050672730698181188L, var3);
      UserInfo var10003 = var10002;
      CloudAuthService var13 = var10001;
      Method var10 = var10004;

      try {
         var11 = (UserInfo)var10.invoke(var13, var10003);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      label41: {
         if (var8 == var11.fieldInt_d) {
            this.c(this.breezeUtil110_v);
            if (this.d(this.breezeUtil110_w)) {
               break label41;
            }

            this.a(new UIPanel[]{this.breezeUtil110_x, this.breezeUtil110_w});
            if (var5 != null) {
               break label41;
            }
         }

         this.b(new UIPanel[]{this.breezeUtil110_w, this.breezeUtil110_x});
         if (!this.d(this.breezeUtil110_v)) {
            this.b(this.breezeUtil110_v);
         }
      }

      this.dataBuilder124_r.initialize(DateUtil_x.buildString_2(var1.fieldLong_e));
      this.dataBuilder124_s.initialize(DateUtil_x.buildString_2(var1.fieldLong_f));
      RenderUtil25 var9 = this.dataBuilder35_C;
      String var12 = var1.string_g;
      int var14 = var2.fieldInt_d;
      CloudAuthService var15 = BreezeContext.cloudAuthService_h;
      Object[] var18 = rip.breeze.client.MathUtil8.noArgs();
      Method var10006 = rip.breeze.client.MathUtil8.getMethod_3(3050672730698181188L, var3);
      Object[] var10005 = var18;
      CloudAuthService var19 = var15;
      Method var16 = var10006;

      try {
         var10003 = (UserInfo)var16.invoke(var19, var10005);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var9.processAll_2(var12, var14 == var10003.fieldInt_d);
      if (!this.d(this.dataBuilder124_r)) {
         this.a(new UIPanel[]{this.dataBuilder124_r, this.dataBuilder124_s});
      }

      this.a(new UIPanel[]{this.dataBuilder122_y, this.dataBuilder44_z, this.dataBuilder126_A, this.dataBuilder44_B, this.dataBuilder35_C});
      this.calculate_2();
   }

   private static void lambda$delete_Inner5(String var0) {
      long var1 = 76513728629761L;
      BreezeContext.guiPanelSettings_f.processAll("Failed deleting theme", RenderUtil18_x.RED + var0);
   }

   private static void lambda$delete_Inner4() {
      BreezeContext.guiPanelSettings_f.initialize(RenderUtil40::lambda$null_Inner3);
   }

   private static void lambda$null_Inner3() {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.processNullable_2();
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize_2();
   }

   private void lambda$remix_Inner2() {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new MathUtil12(this.dataBuilder41_n.getString_c()));
   }

   private void lambda$download_Inner1() {
      BreezeContext.authSession_c.setDataBuilder41_b(this.dataBuilder41_n);
   }

   private void lambda$edit_Inner0() {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new dG(this.stringDecryptHelper3_m, this.dataBuilder41_n.getString_c()));
   }

   public static void initialize_2(int[] var0) {
      arr_D = var0;
   }

   public static int[] decrypt() {
      return arr_D;
   }

   static {
      int[] var10000 = new int[5];
      initialize_2(var10000);
      long var0 = 8681462311240L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[31];
      int var5 = 0;
      String var6 = ";\u0087ÕóþÄ\u0006\u0017XW\bÙ\u0007~\u0082Õ\u0018Q\r\u0007ýCÑ£\u009a,¼RA\u0093\u0092'±¡ë®U×Ñc\u000b \u001a[«5; Å¶,£±If\u0002{Tô¯Ø:\u00884\n'°)\u0091î;uK\\(9ð\u001cJ\u00147òßR¨'òT:f\u0098\u0096×\u0091M5\u0099)©îDí`\u0098t\u0094\u0086ËµPÑ,¦¾\u0080\u0010\u0015øÅp\fS$Z¢zÂ×ªý(\u001b(\rÎÁ¹Ð;\f\u0016æ´P\u001bqª\"\u000e.íËn 4£\u009aiÕÌ\u0017?ûô!÷t´\u008a´oÛ· Ü«ì\u0092&>aãÂ\b)äÊñ=üH\u0088\u008amRyÉ \u0093ZOã\u001eq\u0098æ(=Ã\u0010¥\f\u0015ûÉÒ\u000bÅª\u0002á2d#\u0001\u0084²Í\u0081\u008a2*éË\u0090(2²¹kU\u0010\u001dbª·×(\u0013ðmXi\u000ehW\u0012Ø5%ºW=7dCðì'\u008fÉëü\f»ñ£\u001d¨ð*ZRßÌ\u009aux({Un½f\u008b ÷\u0094_ÝÁf\u0087¥¦\u0006£¶j\u0084\u0006\u0016Ú\u0007#\u007f¯\u00ad¡X.º\u0011pUÄËñÜ\u0018\u0090Ôuà\u0090\u0089\r¯q\u008a>Q\u000fG\u008døÒ¬¯ø·º¬H(ë×y\u0087J5\u0085\u0012wl>ÎÄ\u001f\u0083#[ªj'\np´ïZÅ~b·\u0019´\u001aÆÇs\u008b#A×+\u0018}[ù\u000eUðÎí\u001f|\u000f Y]>Û>.AF\u001far(P\u009a¬¯u{¾èD\u0095ºÃN\u008e¹\u007f°3+\u009bÄ]¤\t¥zy\u0018LXE\u0013ÚµH^ß¡±íOÔ'\u0091/k\u001c\u0007\u00ad\u0085¸ðvyô\rXG\u009còdú1à=¦t¤`í\u0094û¨°#sÑ!ùø\u009c(xÉAk\u0018xÑy\u0085ÆÐó\\Ü9´¯q\u0093à(Ï£\u0094zº>\u001aseÖ % \u009cÂRóý\u0014(àÆðgú8-(\u000e*\u009aÅ´\u0002¿\u0014ó@ Q\u0003\u0017Åb\u0099÷`ÃZÁkÚÛXa%·\u0093H?\u0010\u0001AËfYdÌ:öqíTÍ\u001c\f\u0088\u0018`Î`ÜÂ\u0099\u001eÇó\u009b÷\u001e:&¯o\u0001ßjO}ìLE(\\s¨\f,%É¤TË\u0004jüj¬\u001d¾\u0015ã«\u0095ýX\u0084òã\u0084ô.DLßº\u008dUò¹\u0088\u00108 á~á\u008d\t\u008bc\nÚ\u0010¬7\u0003|Ü\u0082\u0006\"²ôAØ®\u0080\u0093·ä\u00053dà)\u0018óð\u009d?'\u0005NDP\u008c÷§ÍÝ[ÈÚN&*¤N\u00894\u0018ÓÕ¢2\u0017rW\u0081Î\u0095»\u0010!!½S,\u0093Ð\t®Ó4² ËÜ*]\u009b\u001d&¹s<¹j?ç\b!)U\u0005vù:\u0013ÀA\u009aÇ\u0013Úó# (knÐ\u0080\u000e\u0092âÉâ¢6\u0015\u008fóß<÷\u0099½R\u0097\u0088%ö\u001a\u007fÛHöÙ´,×\u0098ó\u00adí~=Å lJAX¦+)\u0016\u008a/Íd\u0010\u008f~òJn¼7È±² \\kb\"¥¥áê\u0018tQÂ\nmX[\u0012-¢\u008a\"\u0089×nAzÕ wòò`\u007f(ÝÇ\u00123FõsÀ;\r;.µSÎC¬¶\u0094\u001bÚ\u0010i\u0016-°_\u0003\u009e\u00943¬*ÉðaC¨\u000b¼\u0018i\u008a2\u0083l]ngØ\u0012{y¥¦[C\u0001\u0087H\u009fªçÈQ(\u0004ð\u0094ÏD~/Üã6áíM>Ï2X%ÖkÈäo\\\u000bx\tÔ®x½\u0085$\u0085î¸þcd\u0005";
      int var7 = ";\u0087ÕóþÄ\u0006\u0017XW\bÙ\u0007~\u0082Õ\u0018Q\r\u0007ýCÑ£\u009a,¼RA\u0093\u0092'±¡ë®U×Ñc\u000b \u001a[«5; Å¶,£±If\u0002{Tô¯Ø:\u00884\n'°)\u0091î;uK\\(9ð\u001cJ\u00147òßR¨'òT:f\u0098\u0096×\u0091M5\u0099)©îDí`\u0098t\u0094\u0086ËµPÑ,¦¾\u0080\u0010\u0015øÅp\fS$Z¢zÂ×ªý(\u001b(\rÎÁ¹Ð;\f\u0016æ´P\u001bqª\"\u000e.íËn 4£\u009aiÕÌ\u0017?ûô!÷t´\u008a´oÛ· Ü«ì\u0092&>aãÂ\b)äÊñ=üH\u0088\u008amRyÉ \u0093ZOã\u001eq\u0098æ(=Ã\u0010¥\f\u0015ûÉÒ\u000bÅª\u0002á2d#\u0001\u0084²Í\u0081\u008a2*éË\u0090(2²¹kU\u0010\u001dbª·×(\u0013ðmXi\u000ehW\u0012Ø5%ºW=7dCðì'\u008fÉëü\f»ñ£\u001d¨ð*ZRßÌ\u009aux({Un½f\u008b ÷\u0094_ÝÁf\u0087¥¦\u0006£¶j\u0084\u0006\u0016Ú\u0007#\u007f¯\u00ad¡X.º\u0011pUÄËñÜ\u0018\u0090Ôuà\u0090\u0089\r¯q\u008a>Q\u000fG\u008døÒ¬¯ø·º¬H(ë×y\u0087J5\u0085\u0012wl>ÎÄ\u001f\u0083#[ªj'\np´ïZÅ~b·\u0019´\u001aÆÇs\u008b#A×+\u0018}[ù\u000eUðÎí\u001f|\u000f Y]>Û>.AF\u001far(P\u009a¬¯u{¾èD\u0095ºÃN\u008e¹\u007f°3+\u009bÄ]¤\t¥zy\u0018LXE\u0013ÚµH^ß¡±íOÔ'\u0091/k\u001c\u0007\u00ad\u0085¸ðvyô\rXG\u009còdú1à=¦t¤`í\u0094û¨°#sÑ!ùø\u009c(xÉAk\u0018xÑy\u0085ÆÐó\\Ü9´¯q\u0093à(Ï£\u0094zº>\u001aseÖ % \u009cÂRóý\u0014(àÆðgú8-(\u000e*\u009aÅ´\u0002¿\u0014ó@ Q\u0003\u0017Åb\u0099÷`ÃZÁkÚÛXa%·\u0093H?\u0010\u0001AËfYdÌ:öqíTÍ\u001c\f\u0088\u0018`Î`ÜÂ\u0099\u001eÇó\u009b÷\u001e:&¯o\u0001ßjO}ìLE(\\s¨\f,%É¤TË\u0004jüj¬\u001d¾\u0015ã«\u0095ýX\u0084òã\u0084ô.DLßº\u008dUò¹\u0088\u00108 á~á\u008d\t\u008bc\nÚ\u0010¬7\u0003|Ü\u0082\u0006\"²ôAØ®\u0080\u0093·ä\u00053dà)\u0018óð\u009d?'\u0005NDP\u008c÷§ÍÝ[ÈÚN&*¤N\u00894\u0018ÓÕ¢2\u0017rW\u0081Î\u0095»\u0010!!½S,\u0093Ð\t®Ó4² ËÜ*]\u009b\u001d&¹s<¹j?ç\b!)U\u0005vù:\u0013ÀA\u009aÇ\u0013Úó# (knÐ\u0080\u000e\u0092âÉâ¢6\u0015\u008fóß<÷\u0099½R\u0097\u0088%ö\u001a\u007fÛHöÙ´,×\u0098ó\u00adí~=Å lJAX¦+)\u0016\u008a/Íd\u0010\u008f~òJn¼7È±² \\kb\"¥¥áê\u0018tQÂ\nmX[\u0012-¢\u008a\"\u0089×nAzÕ wòò`\u007f(ÝÇ\u00123FõsÀ;\r;.µSÎC¬¶\u0094\u001bÚ\u0010i\u0016-°_\u0003\u009e\u00943¬*ÉðaC¨\u000b¼\u0018i\u008a2\u0083l]ngØ\u0012{y¥¦[C\u0001\u0087H\u009fªçÈQ(\u0004ð\u0094ÏD~/Üã6áíM>Ï2X%ÖkÈäo\\\u000bx\tÔ®x½\u0085$\u0085î¸þcd\u0005"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var20;
                  if ((var12 += var8) >= var7) {
                     CONST_F = var4;
                     CONST_G = new String[31];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var20;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "^ü¡K¤\u001cD|¥[:b³¸eo\u0002Q\u000fØÞU¦÷\u0092G×\u0019\u000bù\u001b]¸Í<ÊÒ©Þª8yÖù\u000f\u008eèè±´i\r¢q½u¼¬({±]\u0018ÖÍ\f'_±Ôl\u0007`öP¼\u0095ì\u008c\u001f\u001eåñPpJ6Í,\u00adJ\u0090=àö]\u0019";
                  var7 = "^ü¡K¤\u001cD|¥[:b³¸eo\u0002Q\u000fØÞU¦÷\u0092G×\u0019\u000bù\u001b]¸Í<ÊÒ©Þª8yÖù\u000f\u008eèè±´i\r¢q½u¼¬({±]\u0018ÖÍ\f'_±Ôl\u0007`öP¼\u0095ì\u008c\u001f\u001eåñPpJ6Í,\u00adJ\u0090=àö]\u0019"
                     .length();
                  var8 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28184;
      if (CONST_G[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_H.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_H.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dH", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_F[var3].getBytes("ISO-8859-1");
         CONST_G[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_G[var3];
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
         throw new RuntimeException("rip/breeze/dH" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
