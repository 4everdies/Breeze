package rip.breeze;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class RenderUtil36 extends UIPanel {
   private static final float CONST_H = 5.0F;
   private static final float CONST_I = 28.0F;
   private static final float CONST_J = 26.0F;
   private static final float CONST_K = 18.0F;
   private static final int CONST_L;
   private final rip.breeze.client.AnimationTimer dataBuilder15_m;
   private final GenericSetting<ConfigMap> dataBuilder54_n;
   private final StringDecryptHelper6 stringDecryptHelper6_o;
   private final List<Util141> list_p;
   private LicenseState licenseState_q;
   private float fieldFloat_r;
   private float fieldFloat_s;
   private String string_t;
   public LicenseState licenseState_u;
   private static int fieldInt_v;
   private static final String[] CONST_X;
   private static final String[] CONST_Y;
   private static final Map CONST_Z = new HashMap(13);

   public RenderUtil36(rip.breeze.client.AnimationTimer var1, GenericSetting<ConfigMap> var2) {
      long var3 = 38676656294051L;
      super(0.0F, 0.0F, 0.0F, 0.0F);
      this.list_p = new ArrayList<>();
      this.licenseState_q = new LicenseState();
      this.string_t = "";
      this.dataBuilder15_m = var1;
      this.dataBuilder54_n = var2;
      short var10003 = 28608;
      long var10004 = 1201589131445859556L ^ var3;
      this.stringDecryptHelper6_o = new StringDecryptHelper6("Search blocks...", new LicenseState());
      this.calculate_2();
   }

   public void initialize() {
      this.stringDecryptHelper6_o.update_2();
   }

   private void calculate_2() {
      long var1 = 44829140747595L;
      this.string_t = this.stringDecryptHelper6_o.getString_j();
      String var3 = this.string_t.trim().toLowerCase(Locale.ROOT);
      int var10000 = getValue();
      this.list_p.clear();
      int var4 = var10000;

      for (Util141 var6 : BreezeContext.settingGroup_d.getEntries()) {
         if (var3.isEmpty() || var6.isValid(var3)) {
            this.list_p.add(var6);
         }

         if (var4 != 0) {
            break;
         }
      }

      this.fieldFloat_r = 0.0F;
      this.fieldFloat_s = 0.0F;
      this.clamp_3(this.a, this.b, this.c, 0.0F);
   }

   public void clamp(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 46241641281725L;
      int var10000 = getValue();
      super.toggle(var1, var2, var3);
      int var8 = var10000;
      if (!this.stringDecryptHelper6_o.getString_j().equals(this.string_t)) {
         this.calculate_2();
      }

      label18: {
         BreezeContext.iRenderer_b.frameBegin();
         BreezeContext.iRenderer_b.rotate((float)this.dataBuilder15_m.getDouble(var6), this.c(), this.d());
         BreezeContext.iRenderer_b
            .strokeRoundedRect(
               this,
               BreezeContext.authSession_c.getFloat("drawer.corner-radius"),
               BreezeContext.authSession_c.getColor("drawer.background")
            );
         BreezeContext.iRenderer_b
            .fillRoundedRectTwoColor(
               this,
               BreezeContext.authSession_c.getFloat("drawer.corner-radius"),
               BreezeContext.authSession_c.getFloat("drawer.border-thickness"),
               BreezeContext.authSession_c.getColor("drawer.border")
            );
         this.stringDecryptHelper6_o.update(var1, var2, var3);
         this.fieldFloat_s = this.fieldFloat_s + (this.fieldFloat_r - this.fieldFloat_s) * Math.min(1.0F, var3 * 16.0F);
         if (this.list_p.isEmpty()) {
            BreezeContext.iRenderer_b
               .drawText(
                  "No blocks found",
                  this.licenseState_q.fieldFloat_a + 8.0F,
                  this.licenseState_q.fieldFloat_b + 6.0F,
                  BreezeContext.authSession_c.getColor("default.text-tertiary"),
                  EnumType32.SOURCE_SANS,
                  20.0F
               );
            if (var8 == 0) {
               break label18;
            }
         }

         BreezeContext.iRenderer_b.renderWithBounds(this.licenseState_q, this::lambda$draw_Inner0);
      }

      BreezeContext.iRenderer_b.frameEnd();
      if (!LicenseState.isValid_2()) {
         initialize_3(++var8);
      }
   }

   private void calculate(Util141 var1, float var2, float var3, float var4) {
      long var5 = 134417302462794L;
      LicenseState var7 = new LicenseState(this.licenseState_q.fieldFloat_a, var2, this.licenseState_q.fieldFloat_c, 24.0F);
      boolean var8 = var7.isValid(var3, var4) && this.licenseState_q.isValid(var3, var4);
      boolean var9 = this.dataBuilder54_n.getObject_m().isValid(var1.string_a);
      if (var8) {
         BreezeContext.iRenderer_b
            .strokeRoundedRect(
               var7,
               BreezeContext.authSession_c.getFloat("drawer.corner-radius"),
               BreezeContext.authSession_c.getColor("default.hovered")
            );
      }

      BreezeContext.settingGroup_d.clearEntry(var1.string_a);
      BreezeContext.iRenderer_b.drawTextInput(var1.buildString(), var7.fieldFloat_a + 5.0F, var7.calculateFloat_4() - 9.0F, 18.0F, 18.0F, false, Color.WHITE);
      BreezeContext.iRenderer_b
         .drawText(
            var1.string_b,
            var7.fieldFloat_a + 5.0F + 18.0F + 8.0F,
            var7.fieldFloat_b + 3.0F,
            !var8 && !var9
               ? BreezeContext.authSession_c.getColor("default.text-secondary")
               : BreezeContext.authSession_c.getColor("default.text-primary"),
            EnumType32.SOURCE_SANS,
            20.0F
         );
      float var10 = var7.calculateFloat() - 13.0F;
      float var11 = var7.calculateFloat_4();
      BreezeContext.iRenderer_b
         .strokeCircle(
            var10,
            var11,
            7.0F,
            2.0F,
            var9
               ? BreezeContext.authSession_c.getColor("default.accent")
               : BreezeContext.authSession_c.getColor("drawer.border")
         );
      if (var9) {
         BreezeContext.iRenderer_b.fillCircle(var10, var11, 4.0F, BreezeContext.authSession_c.getColor("default.accent"));
      }
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      long var6 = var4 ^ 119841672885148L;
      int var8 = getValue();
      if (this.licenseState_u != null && this.licenseState_u.isValid(var1, var2)) {
         return false;
      }

      if (!this.a(var1, var2)) {
         this.dataBuilder15_m.toggle(var6, false);
         return false;
      }

      if (this.stringDecryptHelper6_o.absValue(var1, var2, var3, false)) {
         return true;
      }

      if (this.dataBuilder54_n.fieldBool_k) {
         return true;
      }

      if (this.licenseState_q.isValid(var1, var2)) {
         float var9 = this.licenseState_q.fieldFloat_b - this.fieldFloat_s;

         for (Util141 var11 : this.list_p) {
            if (var2 >= var9 && var2 < var9 + 26.0F) {
               this.dataBuilder54_n.processAll(this.dataBuilder54_n.getObject_m().getDataBuilder38(var11.string_a));
               return true;
            }

            var9 += 26.0F;
            if (var8 != 0) {
               break;
            }
         }
      }

      return true;
   }

   public boolean clamp_2(float var1, float var2, float var3) {
      long var4 = 108114635177705L;
      if (!this.a(var1, var2)) {
         return false;
      }

      float var6 = Math.max(0.0F, this.list_p.size() * 26.0F - this.licenseState_q.fieldFloat_d);
      this.fieldFloat_r = Math.max(0.0F, Math.min(var6, this.fieldFloat_r - var3));
      return true;
   }

   public boolean isValid(char var1) {
      return this.stringDecryptHelper6_o.clamp_2(var1);
   }

   @Override
   public boolean isValid_2(int var1) {
      return this.stringDecryptHelper6_o.clamp(var1);
   }

   public void initialize_2(float var1, float var2, int var3) {
      this.stringDecryptHelper6_o.toggle(var1, var2, var3);
   }

   public void clamp_3(float var1, float var2, float var3, float var4) {
      int var5 = Math.max(1, Math.min(8, this.list_p.size()));
      super.drawColoredQuad(var1, var2, var3, 43.0F + var5 * 26.0F);
   }

   public void calculate_2() {
      this.stringDecryptHelper6_o.a(this.a + 5.0F, this.b + 5.0F, this.c - 10.0F, 28.0F);
      this.licenseState_q = new LicenseState(this.a + 5.0F, this.stringDecryptHelper6_o.b() + 5.0F, this.c - 10.0F, this.d - 28.0F - 15.0F);
   }

   public void processAll() {
      long var1 = 67137573248254L;
      long var3 = var1 ^ 54224589067721L;
      super.toggle_2();
      this.dataBuilder15_m.toggle(var3, false);
      this.stringDecryptHelper6_o.processAll_3();
      BreezeContext.guiPanelSettings_f.update_1(this);
   }

   private void lambda$draw_Inner0(float var1, float var2) {
      long var3 = 65540057483419L;
      int var10000 = getValue_2();
      float var5 = this.licenseState_q.fieldFloat_b - this.fieldFloat_s;
      int var6 = var10000;

      for (Util141 var8 : this.list_p) {
         if (var5 + 26.0F > this.licenseState_q.fieldFloat_b && var5 < this.licenseState_q.calculateFloat_2()) {
            this.calculate(var8, var5, var1, var2);
         }

         var5 += 26.0F;
         if (var6 == 0) {
            break;
         }
      }
   }

   public static void initialize_3(int var0) {
      fieldInt_v = var0;
   }

   public static int getValue() {
      return fieldInt_v;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 77 : 0;
   }

   static {
      initialize_3(0);
      long var0 = 16805939351605L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[14];
      int var5 = 0;
      String var6 = "Ö#µµ\u0089Z\u008a\u0093\u0000'o]\u0093\u001f\u0000*Õ/\u009am¼x\u000b¦\u009f\u0000\"áoÎ\u0016ãTx\u001f\u0015¾\u0097\u00adý(Ï³oMC~´¾sM¤A]ñ\u009cû\u0096òãªP&\u009f\u000fÍ\u0002-¸§Ê®VA[öp\tBÖg\u0018W\u008d\u0007\u0080µc` Ç\u0085¯ÄûS%YS\u0014~¹-¾\u0094{(\u0080\u000f\tR;.\":\u0000\u0005\u009dÛ í\u0091rÌ\u001e*Î7\bÃS=\u0089lÇ6þúF>x&¤\u0013F\u0019B(¿3L`c\u0088uX±cDHB\u009e¾²þ²Ê\f\u0010&_S\u00885k\u0094\u009ax\u0080\u008fNj6m{Ãý_ ýïí²BDaküú\u0004$Þñ\u0093J\u0081÷Mµ5õ©ZÁÐQ®0YL¥ a \u0004S9ã\u0080y\u0017\u0000%ù\u0093NéGy}kåª5Û\u0091ÛB\u0090wv\u0002úO(K\u0001\rt%\rÁKñ ©w\u000fýöU\u00855\u0001Ùç<Ëbv$\u008eï\u0000\u001be\u009e\n%b\u0013>iª¹ ~KC(aaçY¦W\u0012ÀÈÔuæ:EH\u0082´ö$ýü×õa\u0003g)ø\u0018ÉD\u0081>\u009fÅUz0-\u001d¯aðº\u0080GN¡Q¥pdÏ(¬\u000e7À\u009d\u0091\u0005\u00181\u0095»5^\u0097É\u00137Ö\u0002Á\u008bH,ÎÐË\u000fl\u009a[×qôÊc\u0088ÆD\u008bè \u0012\u0013+3 §\u0003ÑK§9\t/ê\u0019CÄÔ£9\u000eÆ3\u0085T-\u0005màÅ'\r";
      int var7 = "Ö#µµ\u0089Z\u008a\u0093\u0000'o]\u0093\u001f\u0000*Õ/\u009am¼x\u000b¦\u009f\u0000\"áoÎ\u0016ãTx\u001f\u0015¾\u0097\u00adý(Ï³oMC~´¾sM¤A]ñ\u009cû\u0096òãªP&\u009f\u000fÍ\u0002-¸§Ê®VA[öp\tBÖg\u0018W\u008d\u0007\u0080µc` Ç\u0085¯ÄûS%YS\u0014~¹-¾\u0094{(\u0080\u000f\tR;.\":\u0000\u0005\u009dÛ í\u0091rÌ\u001e*Î7\bÃS=\u0089lÇ6þúF>x&¤\u0013F\u0019B(¿3L`c\u0088uX±cDHB\u009e¾²þ²Ê\f\u0010&_S\u00885k\u0094\u009ax\u0080\u008fNj6m{Ãý_ ýïí²BDaküú\u0004$Þñ\u0093J\u0081÷Mµ5õ©ZÁÐQ®0YL¥ a \u0004S9ã\u0080y\u0017\u0000%ù\u0093NéGy}kåª5Û\u0091ÛB\u0090wv\u0002úO(K\u0001\rt%\rÁKñ ©w\u000fýöU\u00855\u0001Ùç<Ëbv$\u008eï\u0000\u001be\u009e\n%b\u0013>iª¹ ~KC(aaçY¦W\u0012ÀÈÔuæ:EH\u0082´ö$ýü×õa\u0003g)ø\u0018ÉD\u0081>\u009fÅUz0-\u001d¯aðº\u0080GN¡Q¥pdÏ(¬\u000e7À\u009d\u0091\u0005\u00181\u0095»5^\u0097É\u00137Ö\u0002Á\u008bH,ÎÐË\u000fl\u009a[×qôÊc\u0088ÆD\u008bè \u0012\u0013+3 §\u0003ÑK§9\t/ê\u0019CÄÔ£9\u000eÆ3\u0085T-\u0005màÅ'\r"
         .length();
      char var8 = '(';
      int var19 = -1;

      label37:
      while (true) {
         String var20 = var6.substring(++var19, var19 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var20.getBytes("ISO-8859-1"));
            String var28 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var28;
                  if ((var19 += var8) >= var7) {
                     CONST_X = var4;
                     CONST_Y = new String[14];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var15 = 2281830781954517258L;
                     byte[] var17 = var11.doFinal(
                        new byte[]{
                           (byte)(var15 >>> 56),
                           (byte)(var15 >>> 48),
                           (byte)(var15 >>> 40),
                           (byte)(var15 >>> 32),
                           (byte)(var15 >>> 24),
                           (byte)(var15 >>> 16),
                           (byte)(var15 >>> 8),
                           (byte)var15
                        }
                     );
                     long var32 = (var17[0] & 255L) << 56
                        | (var17[1] & 255L) << 48
                        | (var17[2] & 255L) << 40
                        | (var17[3] & 255L) << 32
                        | (var17[4] & 255L) << 24
                        | (var17[5] & 255L) << 16
                        | (var17[6] & 255L) << 8
                        | var17[7] & 255L;
                     var10001 = -1;
                     long var13 = var32;
                     CONST_L = (int)var13;
                     return;
                  }

                  var8 = var6.charAt(var19);
                  break;
               default:
                  var4[var5++] = var28;
                  if ((var19 += var8) < var7) {
                     var8 = var6.charAt(var19);
                     continue label37;
                  }

                  var6 = "\u0002xÜÉ\u0089\u0007Á¢\u0001³Ã8 \u009eÄÿòzd¦w#\u0019X(\u0089ÔR.\bv\u0094\u0088ê©WgÌ\u001b²´!}þ+½'ÛñWæ\u008e\u009dW·©R0Rß\u008a\u008dõÖü";
                  var7 = "\u0002xÜÉ\u0089\u0007Á¢\u0001³Ã8 \u009eÄÿòzd¦w#\u0019X(\u0089ÔR.\bv\u0094\u0088ê©WgÌ\u001b²´!}þ+½'ÛñWæ\u008e\u009dW·©R0Rß\u008a\u008dõÖü"
                     .length();
                  var8 = 24;
                  var19 = -1;
            }

            var20 = var6.substring(++var19, var19 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5002;
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
            throw new RuntimeException("rip/breeze/d0", var10);
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
         throw new RuntimeException("rip/breeze/d0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
