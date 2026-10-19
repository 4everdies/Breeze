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
import rip.breeze.client.UserTheme;

public class RenderUtil45 extends Util28 {
   private final BreezeModule dataBuilder52_j;
   private final DateUtil dataBuilder51_k;
   private final RenderUtil32 dataBuilder45_l;
   private final RenderUtil31 dataBuilder44_m;
   private final ImageUtil2 breezeUtil110_n;
   private final UserTheme userTheme_o;
   private final PlayerUtil9 dataBuilder65_p;
   private final rip.breeze.client.AnimationTimer dataBuilder15_q;
   private final rip.breeze.client.AnimationTimer dataBuilder15_r;
   private final rip.breeze.client.AnimationTimer dataBuilder15_s;
   private final rip.breeze.client.AnimationTimer dataBuilder15_t;
   private boolean fieldBool_u;
   private boolean fieldBool_v;
   private static final String[] CONST_X;
   private static final String[] CONST_Y;
   private static final Map CONST_Z = new HashMap(13);

   public RenderUtil45(BreezeModule var1, PlayerUtil9 var2, boolean var3, UserTheme var4) {
      long var5 = 134818996381383L;
      long var7 = var5 ^ 91534775587228L;
      super();
      int[] var10000 = ImageUtil8.decrypt();
      this.dataBuilder15_t = new rip.breeze.client.AnimationTimer(250.0F, false, EnumType3.CIRC_IN);
      int[] var9 = var10000;
      this.dataBuilder52_j = var1;
      this.fieldBool_v = var3;
      this.userTheme_o = var4;
      this.dataBuilder51_k = var1.a(var3);
      this.dataBuilder44_m = new RenderUtil31(var1.description, 18, "module.description");
      this.fieldBool_u = var1.isValid();
      if (var4 != null) {
         ImageUtil16.processNullable(this.dataBuilder51_k, var4);
         this.fieldBool_u = var4.getDataBuilder2_2("Enabled").isValid_5(var7);
      }

      label14: {
         this.dataBuilder45_l = new RenderUtil32(new LicenseState(), this.dataBuilder51_k.list_a, this.dataBuilder51_k.list_b);
         this.a(new UIPanel[]{this.dataBuilder45_l, this.dataBuilder44_m});
         if (var3) {
            this.dataBuilder65_p = var2;
            this.breezeUtil110_n = new ImageUtil2(
               new LicenseState(),
               "download",
               this::processNullable,
               false,
               "Download config for just this module."
            );
            this.b(this.breezeUtil110_n);
            if (var9 == null) {
               break label14;
            }
         }

         this.breezeUtil110_n = null;
         this.dataBuilder65_p = null;
      }

      this.dataBuilder15_q = new rip.breeze.client.AnimationTimer(200.0F, var1.isValid(), EnumType3.CIRC_OUT);
      this.dataBuilder15_r = new rip.breeze.client.AnimationTimer(250.0F, var1.isValid(), EnumType3.LINEAR);
      this.dataBuilder15_s = new rip.breeze.client.AnimationTimer(400.0F, var1.isValid(), EnumType3.BACK_OUT);
   }

   private void processNullable() {
      long var1 = 133674817319663L;
      if (this.userTheme_o != null) {
         BreezeContext.guiPanelSettings_f.initialize(this::lambda$download_Inner0);
      }
   }

   public void setBool_u() {
      this.fieldBool_u = true;
   }

   public DateUtil getDataBuilder51_k() {
      return this.dataBuilder51_k;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      int[] var10000 = ImageUtil8.decrypt();
      super.processNullable(var1, var2, var3);
      int[] var10 = var10000;
      this.dataBuilder15_t.toggle(var6, !this.fieldBool_v && this.a(var1, var2) && var2 < this.b + 80.0F);
      this.dataBuilder15_q.toggle(var6, this.fieldBool_u || this.dataBuilder15_r.getDouble(var8) > 0.6);
      this.dataBuilder15_r
         .toggle(
            var6,
            this.dataBuilder15_q.getDouble(var8) > 0.8
               && (!this.fieldBool_u && this.dataBuilder15_s.getDouble(var8) < 0.4 || this.fieldBool_u && this.dataBuilder15_q.getDouble(var8) > 0.8)
         );
      this.dataBuilder15_s.toggle(var6, this.dataBuilder15_r.getDouble(var8) > 0.1 && this.fieldBool_u);
      Color var11 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("module.background"),
         BreezeContext.authSession_c.getColor("module.background-hovered"),
         (float)this.dataBuilder15_t.getDouble(var8)
      );
      Color var12 = BreezeContext.authSession_c.getColor("module.text-hovered");
      Color var13 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("module.tick"),
         BreezeContext.authSession_c.getColor("module.tick-hovered"),
         (float)this.dataBuilder15_t.getDouble(var8)
      );
      BreezeContext.iRenderer_b.drawRect(this.a, this.b, this.c, 80.0F, var11);
      BreezeContext.iRenderer_b
         .drawText(
            this.dataBuilder52_j.moduleName,
            this.a + 80.0F,
            this.b + 19.0F,
            BreezeContext.authSession_c.getColor("module.text-hovered"),
            EnumType32.SOURCE_SANS,
            22.0F
         );
      BreezeContext.iRenderer_b
         .drawRect(this.a, this.b, 70.0F, 80.0F, BreezeContext.authSession_c.getColor("module.enabled-background"));
      if (this.dataBuilder15_q.getDouble(var8) != 0.0) {
         BreezeContext.iRenderer_b.scheduleRender(this::lambda$draw_Inner1);
      }

      if (this.dataBuilder15_q.getDouble(var8) == 0.0) {
         BreezeContext.iRenderer_b.fillCircle(this.a + 37.0F, this.b + 40.0F, 5.0F, var12);
         if (var10 == null) {
            return;
         }

         LicenseState.toggle(LicenseState.isValid_2());
      }

      BreezeContext.iRenderer_b.drawGlowCircle(this.a + 37.0F, this.b + 40.0F, 22.0F, var13, (float)this.dataBuilder15_r.getDouble(var8));
      BreezeContext.iRenderer_b.drawAnimatedIcon(this.a + 37.0F, this.b + 40.0F, var13, (float)this.dataBuilder15_s.getDouble(var8) * 0.9F);
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      if (super.checkCondition(var1, var2, var3, var4)) {
         var4 = true;
      }

      if (!this.fieldBool_v && !var4 && this.a(var1, var2) && var2 < this.b + 80.0F) {
         this.fieldBool_u = !this.fieldBool_u;
         this.dataBuilder51_k.getDataBuilder54("Enabled").processAll(this.fieldBool_u);
      }

      return var4;
   }

   public void calculate_2() {
      long var1 = 62740630596709L;
      super.processNullable_4();
      this.dataBuilder45_l.a(this.a, this.b + 80.0F, this.c, this.d - 90.0F);
      this.dataBuilder44_m.a(this.a + 80.0F, this.b + 45.0F, this.c - 140.0F, 20.0F);
      if (this.breezeUtil110_n != null) {
         this.breezeUtil110_n.a(this.a + this.c - 60.0F, this.b + 20.0F, 40.0F, 40.0F);
      }
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   private void lambda$draw_Inner1() {
      long var1 = 65750750854381L;
      long var3 = var1 ^ 9976585926930L;
      BreezeContext.iRenderer_b.rotate((float)this.dataBuilder15_q.getDouble(var3), this.a + 35.0F, this.b + 40.0F);
      BreezeContext.iRenderer_b
         .drawRect(this.a, this.b, 70.0F, 80.0F, BreezeContext.authSession_c.getColor("module.enabled"));
   }

   private void lambda$download_Inner0() {
      long var1 = 68870518973905L;
      this.dataBuilder65_p.calculate_2();
      ImageUtil16.processNullable(this.dataBuilder52_j, this.userTheme_o);
      BreezeContext.guiPanelSettings_f
         .processAll(
            "Config applied",
            "Applied config for"
               + RenderUtil18_x.ACCENT
               + RenderUtil18_x.GLOW
               + this.dataBuilder52_j.moduleName
               + RenderUtil18_x.RESET
               + " successfully."
         );
   }

   static {
      long var0 = 119953395580400L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[16];
      int var5 = 0;
      String var6 = "\u0010©\u001f\u0094`IÇ\u008f\u000b\u007fõr\u0091É\u0007\u001fõñ;ÖÒð\u000e\u008b4\u008cÖr\u0088\u00ad\u0095j6IhØ»átìN.\\\u0091mWJ\u0090\u0018b²~0\u0085\"7åJ¢,\\mçùH|w\u001f\u009f\u0013NCð \u008a\u0016\u0004¹ß\u009fü\u0014ß\u0087dJnKuû®,É>³°¸Ú\u000fheö\u0090®Y$(h\u001e\u0084@í\u0083\r\u0098\u008f\u008d\u001eø\u0081Á\u0094'Îãïe\u00ad\u0015Å>m&\u0003·òïm*)\u0013B<\u0003Ö\u0097Í\u0010ß\u0011\u0090ï7\u0018ì\u0002÷Ï(Hà=>;0\u0005¿bÖUm[>\"ða¼W¶\u009bÃÇµ\u0005\u00049Êãíg\u0004r¹ùM¾\u0085¢¬j³7\u009e%²fÊ ±\u0011!U\u0090(P´ÓÆ29\t\u0003Íéä\u009dÿå\u001b\u0088Ý\u0017(4\u0086ÐÈ\u000b·\u0012\fýë$§aÓEb?qhóß8;\u0090\u001fÁQÄ\u0006o\u000fIÅ¨\u0080ëA\u0088\u001d\u00043L\u0006¬Ô\u0018x\u0001Ëí§y?¶¡\u0006nÈ\u0003èa\u00154C«`<&³¥õBá±\u000fÊ\u009cï\u0018\u00adg\u000epióÀP\u0098èl=á9T\u008b£\u007f \u0096hÖ9ò8\\'\u0087\u008f:Õ\u009f*z´û\u0098\u0089\n\u001f\u0001AxÓ#ãµÍ!W7\u0096\u0093æà+¤[4Oú\u0003\u0004Åg¤\u0002w\u009bÎx\u0097oæ\bCM\u0091!'$(®Ö5\u0016C£ÙZ\ffp\u0085HT9\b¶\u0013«z\u009cÝo\u0000\u009e¼x\u008a+\u0080*àß;>ñîòí\u008a\u0018\u0015Ë\u0093³\u0018W('IxÇ¹8k\u0097\u009a±³\u001c*9m\u0017È\u0010è\u008e\u0002-\u009b\u0091@BØ}«ý\u009c\u00866\u0096(Øµ)Ú\u00144<\u00822\u009c\\nïÖ[^%ëõÔD°\u0083\u008bZ@eQ:\u0006Ì3$\u0016\u0080uQ\u0017V}";
      int var7 = "\u0010©\u001f\u0094`IÇ\u008f\u000b\u007fõr\u0091É\u0007\u001fõñ;ÖÒð\u000e\u008b4\u008cÖr\u0088\u00ad\u0095j6IhØ»átìN.\\\u0091mWJ\u0090\u0018b²~0\u0085\"7åJ¢,\\mçùH|w\u001f\u009f\u0013NCð \u008a\u0016\u0004¹ß\u009fü\u0014ß\u0087dJnKuû®,É>³°¸Ú\u000fheö\u0090®Y$(h\u001e\u0084@í\u0083\r\u0098\u008f\u008d\u001eø\u0081Á\u0094'Îãïe\u00ad\u0015Å>m&\u0003·òïm*)\u0013B<\u0003Ö\u0097Í\u0010ß\u0011\u0090ï7\u0018ì\u0002÷Ï(Hà=>;0\u0005¿bÖUm[>\"ða¼W¶\u009bÃÇµ\u0005\u00049Êãíg\u0004r¹ùM¾\u0085¢¬j³7\u009e%²fÊ ±\u0011!U\u0090(P´ÓÆ29\t\u0003Íéä\u009dÿå\u001b\u0088Ý\u0017(4\u0086ÐÈ\u000b·\u0012\fýë$§aÓEb?qhóß8;\u0090\u001fÁQÄ\u0006o\u000fIÅ¨\u0080ëA\u0088\u001d\u00043L\u0006¬Ô\u0018x\u0001Ëí§y?¶¡\u0006nÈ\u0003èa\u00154C«`<&³¥õBá±\u000fÊ\u009cï\u0018\u00adg\u000epióÀP\u0098èl=á9T\u008b£\u007f \u0096hÖ9ò8\\'\u0087\u008f:Õ\u009f*z´û\u0098\u0089\n\u001f\u0001AxÓ#ãµÍ!W7\u0096\u0093æà+¤[4Oú\u0003\u0004Åg¤\u0002w\u009bÎx\u0097oæ\bCM\u0091!'$(®Ö5\u0016C£ÙZ\ffp\u0085HT9\b¶\u0013«z\u009cÝo\u0000\u009e¼x\u008a+\u0080*àß;>ñîòí\u008a\u0018\u0015Ë\u0093³\u0018W('IxÇ¹8k\u0097\u009a±³\u001c*9m\u0017È\u0010è\u008e\u0002-\u009b\u0091@BØ}«ý\u009c\u00866\u0096(Øµ)Ú\u00144<\u00822\u009c\\nïÖ[^%ëõÔD°\u0083\u008bZ@eQ:\u0006Ì3$\u0016\u0080uQ\u0017V}"
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
                     CONST_X = var4;
                     CONST_Y = new String[16];
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

                  var6 = "¥ \u001düV\u008båí öF\u0099A\u0003¶òÓ/\u009bÌÝ\u0093ÑÓ\u0011Ø%\ty<~Û@®@\f\u0001(Ì\u008b\u00868\u0086F¢ÙZ&\u0002ÙWPã\tg\u009a\u009cìáü×pò\u008eNõ\u008afîg\u001dh×\u0096ôR\u0080ì\u0096A\u00831aGð4o\u008c¤\u0002ï\u0017k\u0003ì\u008c¢";
                  var7 = "¥ \u001düV\u008båí öF\u0099A\u0003¶òÓ/\u009bÌÝ\u0093ÑÓ\u0011Ø%\ty<~Û@®@\f\u0001(Ì\u008b\u00868\u0086F¢ÙZ&\u0002ÙWPã\tg\u009a\u009cìáü×pò\u008eNõ\u008afîg\u001dh×\u0096ôR\u0080ì\u0096A\u00831aGð4o\u008c¤\u0002ï\u0017k\u0003ì\u008c¢"
                     .length();
                  var8 = ' ';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13825;
      if (CONST_Y[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Z.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Z.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/da", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_X[var3].getBytes("ISO-8859-1");
         CONST_Y[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Y[var3];
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
         throw new RuntimeException("rip/breeze/da" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
