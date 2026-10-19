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

public final class RenderUtil44 extends RenderUtil43<ConfigMap> {
   private static final int CONST_N;
   private static final float CONST_O = 260.0F;
   private static final float CONST_P = 28.0F;
   private final RenderUtil36 dataBuilder55_q;
   private final rip.breeze.client.AnimationTimer dataBuilder15_r;
   private final rip.breeze.client.AnimationTimer dataBuilder15_s;
   private final rip.breeze.client.AnimationTimer dataBuilder15_t;
   private final RenderUtil12 dataBuilder124_u;
   private LicenseState licenseState_v;
   private LicenseState licenseState_w;
   private LicenseState licenseState_x;
   private static final String[] CONST_Z;
   private static final String[] CONST_A;
   private static final Map CONST_B = new HashMap(13);

   public RenderUtil44(GenericSetting<ConfigMap> var1) {
      long var2 = 23139371122512L;
      super(var1);
      this.dataBuilder15_r = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.BACK_OUT);
      this.dataBuilder15_s = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.dataBuilder15_t = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      short var10003 = 6832;
      long var10004 = 4580452021708666321L ^ var2;
      this.dataBuilder124_u = new RenderUtil12("Clear all selected blocks", new LicenseState());
      this.licenseState_v = new LicenseState();
      this.licenseState_w = new LicenseState();
      this.licenseState_x = new LicenseState();
      this.dataBuilder55_q = new RenderUtil36(this.dataBuilder15_r, var1);
   }

   public void processAll(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 85972512685926L;
      long var10 = var4 ^ 46241641281725L;
      int var10000 = RenderUtil36.getValue_2();
      super.calculate(var1, var2, var3);
      this.dataBuilder15_s.toggle(var6, this.licenseState_v.isValid(var1, var2));
      float var12 = (float)this.dataBuilder15_r.getDouble(var10);
      float var13 = (float)this.dataBuilder15_s.getDouble(var10);
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_v,
            BreezeContext.authSession_c.getFloat("button.corner-radius"),
            RenderUtil1.clamp(
               RenderUtil1.clamp(
                  BreezeContext.authSession_c.getColor("default.layer-one"),
                  BreezeContext.authSession_c.getColor("default.hovered"),
                  var13
               ),
               BreezeContext.authSession_c.getColor("default.accent"),
               (float)this.dataBuilder15_r.calculateDouble(var8)
            )
         );
      BreezeContext.iRenderer_b
         .strokeRoundedRect(this.licenseState_w, 4.0F, BreezeContext.authSession_c.getColor("default.accent"));
      int var14 = var10000;
      BreezeContext.iRenderer_b
         .drawGlow(
            this.licenseState_v.calculateFloat() - 15.0F,
            this.licenseState_v.calculateFloat_4(),
            BreezeContext.authSession_c.getColor("default.text-primary"),
            Math.max(1.0F, var12)
         );
      Color var15 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("default.text-tertiary"),
         BreezeContext.authSession_c.getColor("default.text-primary"),
         Math.max(var12, var13)
      );
      BreezeContext.iRenderer_b.drawText(this.buildString(), this.licenseState_v.fieldFloat_a + 10.0F, this.b + 12.0F, var15, EnumType32.SOURCE_SANS, 22.0F);
      this.processAll(var1, var2, var3);
      if (!this.dataBuilder15_r.isBool_e() && this.dataBuilder55_q.f && this.dataBuilder15_r.calculateDouble(var8) == 0.0) {
         this.dataBuilder55_q.processAll();
      }

      if (var14 == 0) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   private void processAll(float var1, float var2, float var3) {
      long var4 = 4572203828967L;
      long var6 = var4 ^ 9303016542160L;
      long var8 = var4 ^ 60432814179096L;
      boolean var10 = this.checkCondition();
      this.dataBuilder15_t.toggle(var6, !var10 && this.licenseState_x.isValid(var1, var2));
      float var11 = (float)this.dataBuilder15_t.getDouble(var8);
      float var12 = BreezeContext.authSession_c.getFloat("button.corner-radius");
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_x,
            var12,
            var10
               ? BreezeContext.authSession_c.getColor("default.layer-one")
               : RenderUtil1.clamp(
                  BreezeContext.authSession_c.getColor("default.layer-two"),
                  BreezeContext.authSession_c.getColor("default.accent"),
                  var11
               )
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectTwoColor(
            this.licenseState_x,
            var12,
            BreezeContext.authSession_c.getFloat("default.border-thickness"),
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("drawer.border"),
               BreezeContext.authSession_c.getColor("default.accent"),
               var11
            )
         );
      Color var13 = var10
         ? BreezeContext.authSession_c.getColor("default.text-disabled")
         : RenderUtil1.clamp(
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            BreezeContext.authSession_c.getColor("default.text-primary"),
            var11
         );
      float var14 = 12.0F;
      float var15 = 2.5F;
      BreezeContext.iRenderer_b.frameBegin();
      BreezeContext.iRenderer_b.setDimensions(this.licenseState_x.calculateFloat_3(), this.licenseState_x.calculateFloat_4());
      BreezeContext.iRenderer_b.setScale((float)Math.toRadians(45.0));
      BreezeContext.iRenderer_b.fillRoundedRectFull(-6.0F, -1.25F, 12.0F, 2.5F, 1.25F, var13);
      BreezeContext.iRenderer_b.fillRoundedRectFull(-1.25F, -6.0F, 2.5F, 12.0F, 1.25F, var13);
      BreezeContext.iRenderer_b.frameEnd();
      if (!var10) {
         this.dataBuilder124_u.update(var1, var2, var3);
      }
   }

   private boolean checkCondition() {
      long var1 = 97750879185986L;
      ConfigMap var3 = (ConfigMap)this.k().getObject_m();
      return var3 == null || var3.getValue() == 0;
   }

   private String buildString() {
      long var1 = 54774094335183L;
      int var10000 = RenderUtil36.getValue();
      ConfigMap var3 = (ConfigMap)this.k().getObject_m();
      int var4 = var10000;
      if (var3 != null && var3.getValue() != 0) {
         if (var3.getValue() != 1) {
            return var3.getValue() + " selected";
         }

         String var5 = var3.getList_c().get(0);

         for (Util141 var7 : BreezeContext.settingGroup_d.getEntries()) {
            if (var7.string_a.equals(var5)) {
               return var7.string_b;
            }

            if (var4 != 0) {
               break;
            }
         }

         return var5;
      } else {
         return "None";
      }
   }

   public boolean checkCondition_2(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      long var6 = var4 ^ 119841672885148L;
      if (this.licenseState_x.isValid(var1, var2)) {
         if (!this.checkCondition() && !this.k.fieldBool_k) {
            this.k().processAll(new ConfigMap());
         }

         return true;
      } else if (this.licenseState_v.isValid(var1, var2)) {
         this.dataBuilder15_r.toggle(var6, !this.dataBuilder15_r.isBool_e());
         if (this.dataBuilder15_r.isBool_e()) {
            BreezeContext.guiPanelSettings_f.update(this.dataBuilder55_q);
            this.dataBuilder55_q.initialize();
         }

         return true;
      } else {
         return false;
      }
   }

   public void calculate() {
      this.licenseState_v = new LicenseState(this.a() - 260.0F - 10.0F, this.b + 5.0F, 260.0F, 35.0F);
      this.licenseState_w = new LicenseState(
         this.licenseState_v.calculateFloat() - 25.0F, this.licenseState_v.fieldFloat_b + 5.0F, 20.0F, this.licenseState_v.fieldFloat_d - 10.0F
      );
      this.licenseState_x = new LicenseState(this.licenseState_v.fieldFloat_a - 28.0F - 8.0F, this.licenseState_v.calculateFloat_4() - 14.0F, 28.0F, 28.0F);
      this.dataBuilder124_u.a(this.licenseState_x);
      this.dataBuilder55_q.clamp_3(this.licenseState_v.fieldFloat_a, this.licenseState_v.calculateFloat_2() + 10.0F, this.licenseState_v.fieldFloat_c, 0.0F);
      this.dataBuilder55_q.licenseState_u = this.licenseState_v;
      super.calculate_2();
   }

   public void decrypt(float var1, float var2, float var3, float var4) {
      super.calculate_3(var1, var2, var3, 45.0F);
   }

   public void initialize() {
      super.h();
      this.dataBuilder124_u.initialize();
      this.dataBuilder55_q.processAll();
   }

   public boolean checkCondition_3(float var1) {
      long var2 = 69880200093113L;
      return BreezeContext.iKeybindSettings_e.isToggle()
         ? true
         : BreezeContext.iRenderer_b.measureText(this.k.string_b, EnumType32.SOURCE_SANS, 22.0F) + 260.0F + 28.0F + 36.0F > var1;
   }

   static {
      long var0 = 59258278118370L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[18];
      int var5 = 0;
      String var6 = "\u008avçå\"J:\u0004CQ4þGgÔ\u0099<\u0007*Ê~\u0084Âæ·\u001bT%FÖD\u00ad\\\u001eÓ¢Öl\u00adø(ÃålxfD¦ lböÞÅ\u000fån\u001aÿï¹\u0019K\u0005Ç+ YpB¸»û\u0018^FOWh¯\u009c8ïjÚ\u008c\u0013Ã\u0014bÑCÉæ*\u0083\u0010ø¢w(d[\t<}\n\u008bî¿¯FË5rê/MI-R\u0014Å¿öã\u000eÈ\u0013\u009d{ôLá\u0097Ï£Ë\u0018\u009c\u0090-\u00adº3mxK\u00979ûõ>|\b\u009a\u0001\u0012?£¡\u0094§(í?ÈË1\riÿÈEú<ÉÖ\tW\u0087Ý\u0012ùOMb\u009eøu\u001a\u0096í½&\u0097\tåq³rï\u0096^(G/ÓìÂvV\u00971\u009f\u0017Ù\u0011\u0019`l¯E ªmjðS\u0015³tBº\u0097\u0015e\u007fµF¥\u0019ú3<0\u009dÔ\u009c\u000eÎ\u008az½\u000eØ\u009b\u0098¬g&\u0019ecï)ô÷ID\u008dút\\ÒäW\u0081\u0018Pç \u001a`ëÐèü/ég,\u009aÕ(½5\u0099\u0003C;>\u001f4eV\u0085QuÑuO\u009c\u009fÿ\u009b?7Q\u0011\u009cóiÚ ý«\u0096õE-?¹ý£\u0018û\u000f\"\u000b\u000b;\u008d\u009c,|pRvQC&|÷\r\u009f÷<\\ç(Iª{_óÖåw±þ\u0019í»FÎX8}\u0006FÃ\u0087ò\u0091ï\u008b3kkÎû:\u009aÇ\u001a*V®8V0qºG>ÊR\u009d[>AÃ¦|2\t³qþ)\u00819,\b_¼ï\u0001%Å\u008e¥\t$Üm·\u001aê\u0016}U\u000b¹@^\u0090A\u0000\u0018ÙÅn\u0011Ê\u0097\u0003,ôÏ!#\u00ad\u0091'cg \u0012$\u0014¥ÁÓ (8e\u000eG\u008e\u0017ú*:®%\u0018üýé\u008a\u0092Ó\b\u0090\u0090y}¡ÆÝ9,Å\u009ee(#û>\u001c\"»\u009c#¥9\u00adÒ¡\u0010éó¼LG Ç Ì(yje\u0094¦ÉÔ0ODzI,`sf\u0018\u0096MW\u0099¿]\u0003¹\u009f[Ð}\u0010lOj¿\u0011`epär[(Ë:PÊ´!îÁ¨\u0015TAR\u0014&\u0099|»\u001cÅ\f\nè¢yÐ\\ñ\u00adE\u008cÜ\\áÝwÓ[\u001bv";
      int var7 = "\u008avçå\"J:\u0004CQ4þGgÔ\u0099<\u0007*Ê~\u0084Âæ·\u001bT%FÖD\u00ad\\\u001eÓ¢Öl\u00adø(ÃålxfD¦ lböÞÅ\u000fån\u001aÿï¹\u0019K\u0005Ç+ YpB¸»û\u0018^FOWh¯\u009c8ïjÚ\u008c\u0013Ã\u0014bÑCÉæ*\u0083\u0010ø¢w(d[\t<}\n\u008bî¿¯FË5rê/MI-R\u0014Å¿öã\u000eÈ\u0013\u009d{ôLá\u0097Ï£Ë\u0018\u009c\u0090-\u00adº3mxK\u00979ûõ>|\b\u009a\u0001\u0012?£¡\u0094§(í?ÈË1\riÿÈEú<ÉÖ\tW\u0087Ý\u0012ùOMb\u009eøu\u001a\u0096í½&\u0097\tåq³rï\u0096^(G/ÓìÂvV\u00971\u009f\u0017Ù\u0011\u0019`l¯E ªmjðS\u0015³tBº\u0097\u0015e\u007fµF¥\u0019ú3<0\u009dÔ\u009c\u000eÎ\u008az½\u000eØ\u009b\u0098¬g&\u0019ecï)ô÷ID\u008dút\\ÒäW\u0081\u0018Pç \u001a`ëÐèü/ég,\u009aÕ(½5\u0099\u0003C;>\u001f4eV\u0085QuÑuO\u009c\u009fÿ\u009b?7Q\u0011\u009cóiÚ ý«\u0096õE-?¹ý£\u0018û\u000f\"\u000b\u000b;\u008d\u009c,|pRvQC&|÷\r\u009f÷<\\ç(Iª{_óÖåw±þ\u0019í»FÎX8}\u0006FÃ\u0087ò\u0091ï\u008b3kkÎû:\u009aÇ\u001a*V®8V0qºG>ÊR\u009d[>AÃ¦|2\t³qþ)\u00819,\b_¼ï\u0001%Å\u008e¥\t$Üm·\u001aê\u0016}U\u000b¹@^\u0090A\u0000\u0018ÙÅn\u0011Ê\u0097\u0003,ôÏ!#\u00ad\u0091'cg \u0012$\u0014¥ÁÓ (8e\u000eG\u008e\u0017ú*:®%\u0018üýé\u008a\u0092Ó\b\u0090\u0090y}¡ÆÝ9,Å\u009ee(#û>\u001c\"»\u009c#¥9\u00adÒ¡\u0010éó¼LG Ç Ì(yje\u0094¦ÉÔ0ODzI,`sf\u0018\u0096MW\u0099¿]\u0003¹\u009f[Ð}\u0010lOj¿\u0011`epär[(Ë:PÊ´!îÁ¨\u0015TAR\u0014&\u0099|»\u001cÅ\f\nè¢yÐ\\ñ\u00adE\u008cÜ\\áÝwÓ[\u001bv"
         .length();
      char var8 = '(';
      int var19 = -1;

      label37:
      while (true) {
         String var20 = var6.substring(++var19, var19 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var20.getBytes("ISO-8859-1"));
            String var28 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var28;
                  if ((var19 += var8) >= var7) {
                     CONST_Z = var4;
                     CONST_A = new String[18];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var15 = 1180119234545083393L;
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
                     CONST_N = (int)var13;
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

                  var6 = "!¸_\u0086Ýã\u008dÙ\u001c\u008c\u001f#Ð¯\u0098Rx=`«ì·#Õ\u008aBâFâ\u0019à-\b¼.\\Ô¼å\u001d\u0010\u0014\u0086ëÉ\u0000AÎ\u0082¹@¯A\u0094Þ\u000f\u0099";
                  var7 = "!¸_\u0086Ýã\u008dÙ\u001c\u008c\u001f#Ð¯\u0098Rx=`«ì·#Õ\u008aBâFâ\u0019à-\b¼.\\Ô¼å\u001d\u0010\u0014\u0086ëÉ\u0000AÎ\u0082¹@¯A\u0094Þ\u000f\u0099"
                     .length();
                  var8 = '(';
                  var19 = -1;
            }

            var20 = var6.substring(++var19, var19 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20531;
      if (CONST_A[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_B.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_B.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dU", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Z[var3].getBytes("ISO-8859-1");
         CONST_A[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_A[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_3(var4, var5);
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
         throw new RuntimeException("rip/breeze/dU" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
