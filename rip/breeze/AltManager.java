package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AltManager extends RenderUtil50 {
   private final Map<StringDecryptHelper4, RenderUtil19> altsSetting;
   private final MathUtil8 dataBuilder33_q;
   private final MathUtil7 dataBuilder28_r;
   private final ImageUtil2 breezeUtil110_s;
   private final ImageUtil2 breezeUtil110_t;
   private final ImageUtil2 breezeUtil110_u;
   private static int[] arr_v;
   private static final String[] CONST_X;
   private static final String[] CONST_Y;
   private static final Map CONST_A = new HashMap(13);

   public AltManager() {
      long var1 = 109487743984410L;
      int[] var10000 = decrypt();
      short var10002 = 3683;
      long var10003 = 418210583428606221L ^ var1;
      super("Alts");
      this.altsSetting = new HashMap<>();
      BreezeContext.microsoftAuth_k = new MicrosoftAuth(this::update, this::initialize, this::update_1);
      this.dataBuilder28_r = new MathUtil7();
      LicenseState var10004 = new LicenseState();
      short var10005 = 18506;
      long var10006 = 5988036650613894946L ^ var1;
      Runnable var4 = this::processAll;
      short var10008 = 26035;
      long var10009 = 8097984586407396050L ^ var1;
      this.breezeUtil110_s = new ImageUtil2(
         var10004, "Copies a login link to your clipboard.", var4, false, "Import a browser cookie file to log in instantly."
      );
      this.breezeUtil110_t = new ImageUtil2(
         new LicenseState(),
         "copy",
         this::processAll_2,
         false,
         "Copies a login link to your clipboard."
      );
      this.breezeUtil110_u = new ImageUtil2(
         new LicenseState(),
         "import_cookie",
         this::initialize_2,
         false,
         "Import a browser cookie file to log in instantly."
      );
      this.dataBuilder33_q = new MathUtil8(null, true, 300);
      this.dataBuilder33_q.setIndex(20);
      int[] var3 = var10000;
      this.dataBuilder33_q.toggle_3(true);
      BreezeContext.breezeUtil26_l.initialize_3(AltManager::lambda$new_Inner0);
      this.a(new UIPanel[]{this.dataBuilder28_r, this.breezeUtil110_s, this.breezeUtil110_t, this.breezeUtil110_u, this.dataBuilder33_q});
      if (var3 == null) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   private void update(StringDecryptHelper4 var1, boolean var2) {
      long var3 = 92551671086321L;
      if (var2) {
         BreezeContext.settingGroup_d.setStrings(var1.getString_b(), var1.getString_a(), var1.getString_k());
      }

      RenderUtil19 var5 = new RenderUtil19(var1);
      this.altsSetting.put(var1, var5);
      this.dataBuilder33_q.initialize(var5);
   }

   private void initialize(StringDecryptHelper4 var1) {
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$accountRemoved_Inner1);
   }

   private void update_1(String var1) {
      long var2 = 70767147835587L;
      short var10001 = 5582;
      long var10002 = 4293815676391108976L ^ var2;
      BreezeContext.guiPanelSettings_f.processAll("AltManager", RenderUtil18_x.RED + var1);
   }

   private void processAll() {
      long var1 = 15583676715982L;

      try {
         BreezeContext.settingGroup_d.addEntry(BreezeContext.microsoftAuth_k.buildString());
      } catch (Exception var4) {
         this.update_1("Failed to open browser:" + var4.getMessage());
      }
   }

   private void processAll_2() {
      long var1 = 71600630370095L;

      try {
         BreezeContext.settingGroup_d.removeEntry(BreezeContext.microsoftAuth_k.buildString());
      } catch (Exception var4) {
         this.update_1("Failed to copy link:" + var4.getMessage());
      }
   }

   private void initialize_2() {
      BreezeContext.breezeUtil26_l.initialize_3(AltManager::lambda$importCookiesClicked_Inner2);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      int[] var6 = decrypt();
      if (BreezeContext.settingGroup_d.isEnabled()) {
         float var7 = BreezeContext.iRenderer_b.measureText("The alt-manager can only be used when not in a world.", EnumType32.SOURCE_SANS, 20.0F);
         BreezeContext.iRenderer_b
            .drawText(
               "The alt-manager can only be used when not in a world.",
               this.c() - var7 / 2.0F,
               this.d() - 40.0F,
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               EnumType32.SOURCE_SANS,
               20.0F
            );
         if (var6 != null) {
            return;
         }
      }

      super.a(var1, var2, var3);
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      return BreezeContext.settingGroup_d.isEnabled() ? false : super.a(var1, var2, var3);
   }

   public boolean checkCondition_2(float var1, float var2, float var3) {
      long var4 = 108114635177705L;
      return BreezeContext.settingGroup_d.isEnabled() ? false : super.b(var1, var2, var3);
   }

   @Override
   public boolean checkCondition_3(int var1) {
      long var2 = 5884312898060L;
      return BreezeContext.settingGroup_d.isEnabled() ? false : super.b(var1);
   }

   @Override
   public boolean checkCondition_4(int var1) {
      long var2 = 45508263211567L;
      return BreezeContext.settingGroup_d.isEnabled() ? false : super.a(var1);
   }

   public boolean checkCondition_5(char var1) {
      long var2 = 56489760968752L;
      return BreezeContext.settingGroup_d.isEnabled() ? false : super.a(var1);
   }

   public void calculate_2() {
      long var1 = 62740630596709L;
      this.dataBuilder28_r.a(this.a + 20.0F, this.b() - 178.0F, this.c - 40.0F, 158.0F);
      decrypt();
      this.breezeUtil110_t.a(this.m.calculateFloat() - 65.0F, this.m.calculateFloat_4() - 20.0F, 40.0F, 40.0F);
      this.breezeUtil110_s.a(this.m.calculateFloat() - 115.0F, this.m.calculateFloat_4() - 20.0F, 40.0F, 40.0F);
      this.breezeUtil110_u.a(this.m.calculateFloat() - 165.0F, this.m.calculateFloat_4() - 20.0F, 40.0F, 40.0F);
      this.dataBuilder33_q.a(this.a, this.b, this.c, this.d - 178.0F);
      if (!LicenseState.isValid_2()) {
         initialize_3(new int[4]);
      }
   }

   public void update_2(float var1, float var2, int var3) {
      super.b(var1, var2, var3);
   }

   @Override
   public boolean checkCondition_6() {
      long var1 = 45096009565648L;
      return !BreezeContext.settingGroup_d.isEnabled();
   }

   public String getString() {
      long var1 = 11960387023038L;
      return "switch_account";
   }

   private static void lambda$importCookiesClicked_Inner2() {
      long var0 = 73222508151160L;
      Path var2 = FileUtil1.getPath("Select Microsoft Cookie File (.txt)", "txt");
      if (var2 != null) {
         BreezeContext.microsoftAuth_k.update_1(var2.toFile());
      }
   }

   private void lambda$accountRemoved_Inner1(StringDecryptHelper4 var1) {
      this.dataBuilder33_q.initialize_2(this.altsSetting.get(var1));
      this.altsSetting.remove(var1);
   }

   private static void lambda$new_Inner0() {
      BreezeContext.microsoftAuth_k.sleep();
   }

   public static void initialize_3(int[] var0) {
      arr_v = var0;
   }

   public static int[] decrypt() {
      return arr_v;
   }

   static {
      int[] var10000 = new int[2];
      long var0 = 135318694547698L;
      initialize_3(var10000);
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[16];
      int var5 = 0;
      String var6 = "?ÞTÐBÑzþ\u0086i®d5ãØÀÑõ{í0\u001fy\u001cF4N\u0007w\u0014RÔ5\u0098\u0016M4µ§ã\u0001Ë\u001b¥åÿAçÀÉqî)o¬9øL?\u001f8\u000eÙîX\u001bá\u009c|\u001a\u008f\u0012v\u008e7*y½\u0098xÌÙ\u0085UåX¶`É.\\\u000f\u009f8ðü\u000bo\u0097î^¥qT»ÿÅâm·\u000bC)àq\u008cÁn§GQ\"Âþ÷`eN¶\u001d\u0089ôäÑ,v¿\u0010ÚCN|\u0093Wô\u009e\u0084scE×3h\u0018õûõ&xF]24ÛfJÃ\u001clÿ7\u009a\u0092¾\u001aÞüÍ\u0010\rÓÌèj8½ÇÇbXàõua\u0096@¸Ý÷g¬:ÅGè\u0081ÎÐõfÉ<}\u0092IÆÅ_\u009fË\u0084¿ò²ä\u00899CÌ\f&\u000bÐ5%ýz\u0099WyºÏdû\"\u008f´\u008cy\u001eQ\u001dÑ?òÞOL¹S@ÑKD\u007f:\u0013ª\u009aå\\Ø\u0083\u009c\u0085èhÇËö\u0088{0¼÷/V¾õÉ\u00ad^\u001bØ_\u0084\u0080²&v%\u0014¥\u0099\u001bJ%\u0018\u001e5!ó¹\u0095ýÚ\u0097Pªc<\u00adçt\u0007X*\u009aÀ^%²\u0016¿\u008cÅ\u0006\u0090ë\u0013ö\u0090¿Í\u007f£\u0088eß\u0002\"DQLc\u0002ýü\u0086\u0085M!u4ª<\u0090<)W¨2\u0098\u0000¿~Ý\u0083\n»ÜðÑkÚp\u0080\u0010â\u009b¸ºá3¢ô}è¡Ç¿úþý\u0098_XÒPÅãy$C(\u000eÎiR>IÓÂ!\u0012iÊ\u0019\\Þè\u001b2\u0098Â\u001c\u000f\u0085[è(q=òHmÌ\u007f$ÿ\tÃfq¬\u0018\u00ad\u0003²¸<N\u0004û\u009e\u008b\u00032+pZxýâÜÖ% ®\u0088\u0010\u009eIN°à\u0098Z\u0096_\u0088¦g4\u0096&Ù(\u0005ÈÂë·\u001f¹i}\u008c\u001f\u0090\u0085\u0094\u000bÓ\r¼:yUt\u0018\u008aia\u0017\u0085±³fRÞCO\u009aG\u0000dX\u0010_ºèvÖ\u0011a>@èëè)äK/\u0018Â1É×El\u0087Q®\u0099Lm|Ó×¼PÜ=b\u009c#ÂÎ \u0091\u009eJ|óÎJWSOW¢£è·Y·Å\f[¿e 3\u009a\u001a®½ôA°µ";
      int var7 = "?ÞTÐBÑzþ\u0086i®d5ãØÀÑõ{í0\u001fy\u001cF4N\u0007w\u0014RÔ5\u0098\u0016M4µ§ã\u0001Ë\u001b¥åÿAçÀÉqî)o¬9øL?\u001f8\u000eÙîX\u001bá\u009c|\u001a\u008f\u0012v\u008e7*y½\u0098xÌÙ\u0085UåX¶`É.\\\u000f\u009f8ðü\u000bo\u0097î^¥qT»ÿÅâm·\u000bC)àq\u008cÁn§GQ\"Âþ÷`eN¶\u001d\u0089ôäÑ,v¿\u0010ÚCN|\u0093Wô\u009e\u0084scE×3h\u0018õûõ&xF]24ÛfJÃ\u001clÿ7\u009a\u0092¾\u001aÞüÍ\u0010\rÓÌèj8½ÇÇbXàõua\u0096@¸Ý÷g¬:ÅGè\u0081ÎÐõfÉ<}\u0092IÆÅ_\u009fË\u0084¿ò²ä\u00899CÌ\f&\u000bÐ5%ýz\u0099WyºÏdû\"\u008f´\u008cy\u001eQ\u001dÑ?òÞOL¹S@ÑKD\u007f:\u0013ª\u009aå\\Ø\u0083\u009c\u0085èhÇËö\u0088{0¼÷/V¾õÉ\u00ad^\u001bØ_\u0084\u0080²&v%\u0014¥\u0099\u001bJ%\u0018\u001e5!ó¹\u0095ýÚ\u0097Pªc<\u00adçt\u0007X*\u009aÀ^%²\u0016¿\u008cÅ\u0006\u0090ë\u0013ö\u0090¿Í\u007f£\u0088eß\u0002\"DQLc\u0002ýü\u0086\u0085M!u4ª<\u0090<)W¨2\u0098\u0000¿~Ý\u0083\n»ÜðÑkÚp\u0080\u0010â\u009b¸ºá3¢ô}è¡Ç¿úþý\u0098_XÒPÅãy$C(\u000eÎiR>IÓÂ!\u0012iÊ\u0019\\Þè\u001b2\u0098Â\u001c\u000f\u0085[è(q=òHmÌ\u007f$ÿ\tÃfq¬\u0018\u00ad\u0003²¸<N\u0004û\u009e\u008b\u00032+pZxýâÜÖ% ®\u0088\u0010\u009eIN°à\u0098Z\u0096_\u0088¦g4\u0096&Ù(\u0005ÈÂë·\u001f¹i}\u008c\u001f\u0090\u0085\u0094\u000bÓ\r¼:yUt\u0018\u008aia\u0017\u0085±³fRÞCO\u009aG\u0000dX\u0010_ºèvÖ\u0011a>@èëè)äK/\u0018Â1É×El\u0087Q®\u0099Lm|Ó×¼PÜ=b\u009c#ÂÎ \u0091\u009eJ|óÎJWSOW¢£è·Y·Å\f[¿e 3\u009a\u001a®½ôA°µ"
         .length();
      char var8 = '@';
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
                     CONST_X = var4;
                     CONST_Y = new String[16];
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

                  var6 = "vþ_ò\\\u0095Vð¿fI\u0000ç6\u0085ÙÅ\u001eÿYÍ\u001fóTe\u0084\u0001\u0083I-ææÄ©j\n±g¯»\rù\u000f\u001e'v²Ö\r¨\u0081?¢OÙí\u0084ü;¼¤/([y,¥0²\u000fÝ¨ü*>ÖN§>võ0{C\u0091u¶O8æH³S-¬\"ì=\u0096ì\u0091Ya}\u0098$ðJ3rj·GOö\u009c]ûV\u0001#¹ºÍ\u0018¯\u0000´|Ía\u0019¶ÙÔ\u0006Uâ\u0097OUÛx¨v";
                  var7 = "vþ_ò\\\u0095Vð¿fI\u0000ç6\u0085ÙÅ\u001eÿYÍ\u001fóTe\u0084\u0001\u0083I-ææÄ©j\n±g¯»\rù\u000f\u001e'v²Ö\r¨\u0081?¢OÙí\u0084ü;¼¤/([y,¥0²\u000fÝ¨ü*>ÖN§>võ0{C\u0091u¶O8æH³S-¬\"ì=\u0096ì\u0091Ya}\u0098$ðJ3rj·GOö\u009c]ûV\u0001#¹ºÍ\u0018¯\u0000´|Ía\u0019¶ÙÔ\u0006Uâ\u0097OUÛx¨v"
                     .length();
                  var8 = 'X';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17535;
      if (CONST_Y[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_A.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_A.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dr", var10);
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
         throw new RuntimeException("rip/breeze/dr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
