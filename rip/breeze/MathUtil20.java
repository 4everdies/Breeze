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

public class MathUtil20 extends Util28 {
   private final StringDecryptHelper stringDecryptHelper_j;
   private final UserInfo userInfo_k;
   private final RenderUtil31 dataBuilder44_l;
   private final RenderUtil11_x dataBuilder120_m;
   private RenderUtil14 dataBuilder128_n;
   private final RenderUtil12 dataBuilder124_o;
   private final RenderUtil12 dataBuilder124_p;
   private final ImageUtil2 breezeUtil110_q;
   private final ImageUtil2 breezeUtil110_r;
   private final RenderUtil25 dataBuilder35_s;
   private LicenseState licenseState_t;
   private LicenseState licenseState_u;
   private float fieldFloat_v;
   private float fieldFloat_w;
   private static final String[] CONST_Y;
   private static final String[] CONST_Z;
   private static final Map CONST_A = new HashMap(13);

   public MathUtil20(StringDecryptHelper var1, UserInfo var2) {
      long var3 = 30108523349208L;
      super();
      this.licenseState_t = new LicenseState();
      this.licenseState_u = new LicenseState();
      this.stringDecryptHelper_j = var1;
      String[] var10000 = ImageUtil10.decrypt();
      this.userInfo_k = var2;
      this.dataBuilder44_l = new RenderUtil31(var1.string_b, 22, "default.text-primary");
      this.dataBuilder120_m = new RenderUtil11_x(var1.string_c, 18);
      this.dataBuilder128_n = new RenderUtil14(var1.fieldFloat_d, var1.fieldInt_e);
      String[] var5 = var10000;
      this.dataBuilder124_o = new RenderUtil12(DateUtil_x.buildString_2(var1.fieldLong_h), new LicenseState());
      this.dataBuilder124_p = new RenderUtil12(DateUtil_x.buildString_2(var1.fieldLong_g), new LicenseState());
      RenderUtil25 var10001 = new RenderUtil25();
      String var10003 = var1.string_j;
      int var10004 = var2.fieldInt_d;
      CloudAuthService var10005 = BreezeContext.cloudAuthService_h;
      Object[] var10006 = rip.breeze.client.MathUtil8.noArgs();
      Method var10008 = rip.breeze.client.MathUtil8.getMethod_3(-4264556975980706621L, var3);
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
      int var8 = var2.fieldInt_d;
      CloudAuthService var9 = BreezeContext.cloudAuthService_h;
      Object[] var10002 = rip.breeze.client.MathUtil8.noArgs();
      Method var14 = rip.breeze.client.MathUtil8.getMethod_3(-4264556975980706621L, var3);
      Object[] var13 = var10002;
      CloudAuthService var12 = var9;
      Method var10 = var14;

      try {
         var11 = (UserInfo)var10.invoke(var12, var13);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      label32: {
         if (var8 == var11.fieldInt_d) {
            this.breezeUtil110_q = new ImageUtil2(
               new LicenseState(),
               "edit",
               this::update,
               true,
               "Edit your config."
            );
            this.breezeUtil110_r = new ImageUtil2(
               new LicenseState(),
               "delete",
               this::clamp_2,
               true,
               "Delete your config."
            );
            this.a(new UIPanel[]{this.breezeUtil110_q, this.breezeUtil110_r, this.dataBuilder35_s});
            if (var5 == null) {
               break label32;
            }
         }

         this.breezeUtil110_q = null;
         this.breezeUtil110_r = null;
      }

      this.a(new UIPanel[]{this.dataBuilder44_l, this.dataBuilder120_m, this.dataBuilder128_n, this.dataBuilder124_o, this.dataBuilder124_p});
   }

   private void update() {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new ImageUtil13(this.stringDecryptHelper_j, this.userInfo_k));
   }

   private void clamp_2() {
      long var1 = 80106090778148L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs3(this.stringDecryptHelper_j.fieldLong_a, MathUtil20::lambda$delete_Inner1, MathUtil20::lambda$delete_Inner2);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-3593101603865408941L, var1);
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
         this.fieldFloat_v = this.fieldFloat_v - var3 * BreezeContext.iKeybindSettings_e.getX();
         this.fieldFloat_v = Math.max(0.0F, Math.min(this.fieldFloat_v, this.licenseState_u.fieldFloat_d - this.licenseState_t.fieldFloat_d));
         return true;
      } else {
         return super.checkCondition_5(var1, var2, var3);
      }
   }

   public void absValue(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      if (this.fieldFloat_v != this.fieldFloat_w) {
         this.fieldFloat_w = (float)MathUtil1.calculateDouble_2(this.fieldFloat_w, this.fieldFloat_v, 13.0, var3);
         if (Math.abs(this.fieldFloat_v - this.fieldFloat_w) < 1.0F) {
            this.fieldFloat_w = this.fieldFloat_v;
         }

         this.clamp_2();
      }

      BreezeContext.iRenderer_b.renderWithBounds(this.licenseState_t, this::lambda$draw_Inner3);
   }

   public void clamp_2() {
      long var1 = 62740630596709L;
      String[] var10000 = ImageUtil10.decrypt();
      super.processNullable_4();
      String[] var3 = var10000;
      this.licenseState_t = new LicenseState(this.a + 20.0F, this.b + 20.0F, this.c - 40.0F, this.d - 40.0F);
      this.licenseState_u = new LicenseState(this.a + 20.0F, this.b + 20.0F - this.fieldFloat_w, this.c - 40.0F, 250.0F);
      this.dataBuilder44_l
         .a(
            this.licenseState_u.fieldFloat_a + 25.0F,
            this.licenseState_u.fieldFloat_b + 25.0F,
            Math.min(
               this.c - (this.breezeUtil110_q != null ? 270 : 180),
               BreezeContext.iRenderer_b.measureText(this.stringDecryptHelper_j.string_b, EnumType32.SOURCE_SANS, 22.0F)
            ),
            30.0F
         );
      this.dataBuilder120_m
         .a(
            this.licenseState_u.fieldFloat_a + 25.0F,
            this.licenseState_u.fieldFloat_b + 60.0F,
            this.licenseState_u.fieldFloat_c - 40.0F,
            RenderUtil11_x.calculateFloat(this.stringDecryptHelper_j.string_c, 18, this.licenseState_u.fieldFloat_c - 40.0F)
         );
      this.dataBuilder128_n.a(this.dataBuilder44_l.a() + 10.0F, this.licenseState_u.fieldFloat_b + 28.0F, this.c, 180.0F);
      this.licenseState_u.fieldFloat_d = this.dataBuilder120_m.d + 270.0F;
      if (this.breezeUtil110_q != null) {
         this.breezeUtil110_q.a(this.licenseState_u.fieldFloat_a + this.licenseState_u.fieldFloat_c - 80.0F, this.licenseState_u.fieldFloat_b + 15.0F, 30.0F, 30.0F);
         this.breezeUtil110_r.a(this.licenseState_u.fieldFloat_a + this.licenseState_u.fieldFloat_c - 45.0F, this.licenseState_u.fieldFloat_b + 15.0F, 30.0F, 30.0F);
      }

      this.dataBuilder35_s.a(this.licenseState_u.fieldFloat_a + 25.0F, this.dataBuilder120_m.b() + 130.0F, 200.0F, 50.0F);
      float var4 = BreezeContext.iRenderer_b.measureText("Created:", EnumType32.SOURCE_SANS, 18.0F);
      float var5 = BreezeContext.iRenderer_b.measureText("Last Updated:", EnumType32.SOURCE_SANS, 18.0F);
      float var6 = BreezeContext.iRenderer_b.measureText(DateUtil_x.buildString(this.stringDecryptHelper_j.fieldLong_h), EnumType32.SOURCE_SANS, 18.0F);
      float var7 = BreezeContext.iRenderer_b.measureText(DateUtil_x.buildString(this.stringDecryptHelper_j.fieldLong_g), EnumType32.SOURCE_SANS, 18.0F);
      this.dataBuilder124_o.a(this.licenseState_u.fieldFloat_a + 30.0F + var4, this.dataBuilder120_m.b() + 33.0F, var6, 22.0F);
      this.dataBuilder124_p.a(this.licenseState_u.fieldFloat_a + 30.0F + var5, this.dataBuilder120_m.b() + 58.0F, var7, 22.0F);
      this.fieldFloat_v = Math.max(0.0F, Math.min(this.fieldFloat_v, this.licenseState_u.fieldFloat_d - this.licenseState_t.fieldFloat_d));
      if (var3 != null) {
         LicenseState.toggle(LicenseState.checkCondition());
      }
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   private void lambda$draw_Inner3(float var1, float var2, float var3) {
      long var4 = 24587043835551L;
      this.dataBuilder128_n.initialize(this.stringDecryptHelper_j.fieldFloat_d, this.stringDecryptHelper_j.fieldInt_e);
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_u,
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
            this.licenseState_u.fieldFloat_a + 25.0F,
            this.dataBuilder120_m.b() + 10.0F,
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            "Created:",
            this.licenseState_u.fieldFloat_a + 25.0F,
            this.dataBuilder120_m.b() + 35.0F,
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            "Last Updated:",
            this.licenseState_u.fieldFloat_a + 25.0F,
            this.dataBuilder120_m.b() + 60.0F,
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            "Breeze Version:",
            this.licenseState_u.fieldFloat_a + 25.0F,
            this.dataBuilder120_m.b() + 85.0F,
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            DateUtil_x.buildString_3(this.stringDecryptHelper_j.fieldInt_f),
            this.licenseState_u.fieldFloat_a + 30.0F + var6,
            this.dataBuilder120_m.b() + 10.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            DateUtil_x.buildString(this.stringDecryptHelper_j.fieldLong_h),
            this.licenseState_u.fieldFloat_a + 30.0F + var7,
            this.dataBuilder120_m.b() + 35.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            DateUtil_x.buildString(this.stringDecryptHelper_j.fieldLong_g),
            this.licenseState_u.fieldFloat_a + 30.0F + var8,
            this.dataBuilder120_m.b() + 60.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            this.stringDecryptHelper_j.string_i,
            this.licenseState_u.fieldFloat_a + 30.0F + var9,
            this.dataBuilder120_m.b() + 85.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      super.processNullable(var1, var2 + this.fieldFloat_w, var3);
   }

   private static void lambda$delete_Inner2(String var0) {
      long var1 = 113254436572314L;
      BreezeContext.guiPanelSettings_f.processAll("Error deleting config", RenderUtil18_x.RED + var0);
   }

   private static void lambda$delete_Inner1() {
      BreezeContext.guiPanelSettings_f.initialize(MathUtil20::lambda$null_Inner0);
   }

   private static void lambda$null_Inner0() {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.processNullable_2();
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize_2();
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize();
   }

   static {
      long var0 = 43394606882486L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[22];
      int var5 = 0;
      String var6 = "U¤t\u008bL\u008bË\\WÚc\u008cÑì#uêE\\6\u001b<²0\u0018æ\u000b\u0095N¶\u0010c aÿIxDëWòGúö\u0090ÒvÝAQ\u0002mF1¼R!m\u0003h^p÷Kc(Úi±\u000eï\u0000óí¢\u000e\u0094ÔQ³î·\u0082A7e¦3|\u000f\n?=]\u009f\u009e\u0004J\tó\u0006ß?\u000bô\u009c Nï\u0013\u0012ã©ÊoO6ïD\"\u007fÿ[I\u009dô9\tÃàFUAyõmÔ\u009a~(Í\u009dÍ sP\u0016;\u009aîü4\u001f\u009c¨Öø\u0095ã\bx«®ÿV7\u001cñZdN\u0082 \u001du\rV\u001c\u008bd\u0010D\u0019í\u0081\u008dj/ju0µq¸BÃ\u0096\u00189¿±9\u009dÀÔÉ/\u0004u\u009dþ\u0006~ô?¶\u009e¹Y¸§ò(IÝ\u0018\u008dJ_÷\u0090\u000f\u0007\b½ÛÍé\u0017ë\\\u008e\u001c\t÷µ\u008fW\u0001\u0096Ê\u009cc£m\u00ad\n×Qö\u000e\u009fÒ\u00188\u0097^r\u0081\u0084ë\u000bI©\u000fNrâÌòÖíN¤ë\t¦\u00100ØÍ\bk?ßô\u0001°\u008c÷ÔÓOÊ\u001cå\u0098Þ¾ß\u008eV\u0013¼±¦\u008d\u0007\u0098ß\u0015¸PôVj¡·\u0082'B\u0093C4\u0095Så(qØy!e¼ùü,sÍø%Þ\u009fêHÇ²ë\b7\u000eY8\u0017\u001e\u001du5ý\u0007ÚÁ\u0087\u008f\u0005\näº\u0018\u0091\u0082ëj\u0088µÝ\u0098.·«°ÜE¡EÃ=M»Æ\u001c$õ(ö©\tiK)~\u0081&ç\u0002Â@\u0016\u009bÃ\u0081&µ?[51o\u008a\u00172\u0088(Åp\u0013òGFçû\u0083·±\u0010\u0082ý_\u0082|dæ\"¸·0(5\u0013¿î aaí·á\u001báSE,g¤$\u0089oÿë%N$\u001dñõ\u0093\u0093%´Òy>\u0083Å\u0018XJ\u001aè\u0003U\u0089²\u0090äp\u000eÀ4ñ\u008bI£\u0085Äø=»G(ç)\u00196\u0017'·¼j»Ç*Ë\u0017\u0090fJÜºÃGùT³®BÀª\u0017úILotÆéì\u0018¿¬0FV\u0091¹Lâý\u000eÇàÂ.Ç\u001eû|ôTâ\u0082\u0080\u008f\u0019+Ãî¯¦p¦g*^\u001695ï\u0014¿©ñ\u0007m·Ö\u0091A\u0001(ö\u0085¯ÒgÛÉ\u0014æiî«ì\u009d\u009cu«*\u009e\u009a3K\u0010&3\u0091\u0092R£o\u009c\t\u0012#íèM\u0018õ9 ½ÃN\u0090\u0004Ý\u001fMp\u0099\u008dZ\u0002\u008f¾¢výOÜaeOt\u0016rÃ\u008c-Gé\u001e";
      int var7 = "U¤t\u008bL\u008bË\\WÚc\u008cÑì#uêE\\6\u001b<²0\u0018æ\u000b\u0095N¶\u0010c aÿIxDëWòGúö\u0090ÒvÝAQ\u0002mF1¼R!m\u0003h^p÷Kc(Úi±\u000eï\u0000óí¢\u000e\u0094ÔQ³î·\u0082A7e¦3|\u000f\n?=]\u009f\u009e\u0004J\tó\u0006ß?\u000bô\u009c Nï\u0013\u0012ã©ÊoO6ïD\"\u007fÿ[I\u009dô9\tÃàFUAyõmÔ\u009a~(Í\u009dÍ sP\u0016;\u009aîü4\u001f\u009c¨Öø\u0095ã\bx«®ÿV7\u001cñZdN\u0082 \u001du\rV\u001c\u008bd\u0010D\u0019í\u0081\u008dj/ju0µq¸BÃ\u0096\u00189¿±9\u009dÀÔÉ/\u0004u\u009dþ\u0006~ô?¶\u009e¹Y¸§ò(IÝ\u0018\u008dJ_÷\u0090\u000f\u0007\b½ÛÍé\u0017ë\\\u008e\u001c\t÷µ\u008fW\u0001\u0096Ê\u009cc£m\u00ad\n×Qö\u000e\u009fÒ\u00188\u0097^r\u0081\u0084ë\u000bI©\u000fNrâÌòÖíN¤ë\t¦\u00100ØÍ\bk?ßô\u0001°\u008c÷ÔÓOÊ\u001cå\u0098Þ¾ß\u008eV\u0013¼±¦\u008d\u0007\u0098ß\u0015¸PôVj¡·\u0082'B\u0093C4\u0095Så(qØy!e¼ùü,sÍø%Þ\u009fêHÇ²ë\b7\u000eY8\u0017\u001e\u001du5ý\u0007ÚÁ\u0087\u008f\u0005\näº\u0018\u0091\u0082ëj\u0088µÝ\u0098.·«°ÜE¡EÃ=M»Æ\u001c$õ(ö©\tiK)~\u0081&ç\u0002Â@\u0016\u009bÃ\u0081&µ?[51o\u008a\u00172\u0088(Åp\u0013òGFçû\u0083·±\u0010\u0082ý_\u0082|dæ\"¸·0(5\u0013¿î aaí·á\u001báSE,g¤$\u0089oÿë%N$\u001dñõ\u0093\u0093%´Òy>\u0083Å\u0018XJ\u001aè\u0003U\u0089²\u0090äp\u000eÀ4ñ\u008bI£\u0085Äø=»G(ç)\u00196\u0017'·¼j»Ç*Ë\u0017\u0090fJÜºÃGùT³®BÀª\u0017úILotÆéì\u0018¿¬0FV\u0091¹Lâý\u000eÇàÂ.Ç\u001eû|ôTâ\u0082\u0080\u008f\u0019+Ãî¯¦p¦g*^\u001695ï\u0014¿©ñ\u0007m·Ö\u0091A\u0001(ö\u0085¯ÒgÛÉ\u0014æiî«ì\u009d\u009cu«*\u009e\u009a3K\u0010&3\u0091\u0092R£o\u009c\t\u0012#íèM\u0018õ9 ½ÃN\u0090\u0004Ý\u001fMp\u0099\u008dZ\u0002\u008f¾¢výOÜaeOt\u0016rÃ\u008c-Gé\u001e"
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
                     CONST_Y = var4;
                     CONST_Z = new String[22];
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

                  var6 = "[P\u00928\t²[ñ*\u009892\u001bí[TÍ£é¬Sè\f§ºp3ær\u007fKÃT\u0002b§ º,r(\u001cþ9ª¡\u0012Lv}\u0082£\u00ad\\TDUæÈäÿFd\u0014±ù Ó7U¥1)\u0004÷\u0099\u001dÁ·p9";
                  var7 = "[P\u00928\t²[ñ*\u009892\u001bí[TÍ£é¬Sè\f§ºp3ær\u007fKÃT\u0002b§ º,r(\u001cþ9ª¡\u0012Lv}\u0082£\u00ad\\TDUæÈäÿFd\u0014±ù Ó7U¥1)\u0004÷\u0099\u001dÁ·p9"
                     .length();
                  var8 = '(';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21797;
      if (CONST_Z[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_A.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_A.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dd", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Y[var3].getBytes("ISO-8859-1");
         CONST_Z[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Z[var3];
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
         throw new RuntimeException("rip/breeze/dd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
