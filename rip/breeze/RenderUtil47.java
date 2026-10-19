package rip.breeze;

import java.awt.Color;
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
import rip.breeze.client.EnumType3;

public class RenderUtil47 extends Util28 {
   private final StringDecryptHelper3 stringDecryptHelper3_j;
   private final UserInfo userInfo_k;
   private final RenderUtil31 dataBuilder44_l;
   private final RenderUtil48 dataBuilder94_m;
   private final RenderUtil12_x dataBuilder125_n;
   private final LicenseState licenseState_o;
   private final rip.breeze.client.AnimationTimer dataBuilder15_p;
   private final rip.breeze.client.AnimationTimer dataBuilder15_q;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);

   public RenderUtil47(StringDecryptHelper3 var1, UserInfo var2) {
      long var3 = 5232162594619L;
      super();
      this.licenseState_o = new LicenseState();
      this.dataBuilder15_p = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.dataBuilder15_q = new rip.breeze.client.AnimationTimer(35.0F, false, EnumType3.LINEAR);
      this.stringDecryptHelper3_j = var1;
      this.userInfo_k = var2;
      this.d = 230.0F;
      this.dataBuilder44_l = new RenderUtil31(var1.string_b, 20, "default.text-primary");
      this.dataBuilder94_m = new RenderUtil48(var2);
      this.dataBuilder125_n = new RenderUtil12_x(var1.fieldBool_c, var1.fieldLong_a, RenderUtil19_x.THEME);
      this.a(new UIPanel[]{this.dataBuilder94_m, this.dataBuilder125_n, this.dataBuilder44_l});
   }

   public void clamp(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 85972512685926L;
      long var8 = var4 ^ 22603910165621L;
      long var10 = var4 ^ 46241641281725L;
      int var10000 = ImageUtil34.getValue_2();
      boolean var12 = this.a(var1, var2);
      int var13 = var10000;
      boolean var14 = this.dataBuilder15_q.calculateDouble(var6) != 0.0;
      this.dataBuilder15_p.toggle(var8, var12);
      this.dataBuilder15_q.toggle(var8, this.dataBuilder15_q.isBool_e() && var12);
      Color var15 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("default.layer-one"),
         RenderUtil1.clamp(
            BreezeContext.authSession_c.getColor("default.layer-one"),
            BreezeContext.authSession_c.getColor("default.hovered"),
            0.5F
         ),
         (float)this.dataBuilder15_p.getDouble(var10)
      );
      if (var14) {
         BreezeContext.iRenderer_b.frameBegin();
         BreezeContext.iRenderer_b.setDimensions(0.0F, -((float)(this.dataBuilder15_q.getDouble(var10) * 2.0)));
      }

      BreezeContext.iRenderer_b.fillGradientRectSimple(this.a, this.b, this.c, this.d - 50.0F, new float[]{10.0F, 10.0F, 0.0F, 0.0F}, var15);
      if (this.stringDecryptHelper3_j.string_r != null) {
         IRenderer var18 = BreezeContext.iRenderer_b;
         String var10001 = this.stringDecryptHelper3_j.string_r;
         String var10002 = "<@breeze>";
         CloudAuthService var10003 = BreezeContext.cloudAuthService_h;
         Object[] var10004 = rip.breeze.client.MathUtil8.noArgs();
         Method var10006 = rip.breeze.client.MathUtil8.getMethod_3(-195514426581545329L, var4);
         Object[] var10005 = var10004;
         CloudAuthService var21 = var10003;
         Method var19 = var10006;

         try {
            var20 = (String)var19.invoke(var21, var10005);
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         var18.drawTextInputSelected(
            var10001.replace(var10002, var20),
            this.licenseState_o.fieldFloat_a,
            this.licenseState_o.fieldFloat_b,
            this.licenseState_o.fieldFloat_c,
            this.licenseState_o.fieldFloat_d,
            Math.max(2.0F, BreezeContext.authSession_c.getFloat("cloud.corner-radius") - 8.0F),
            false
         );
      }

      label44: {
         BreezeContext.iRenderer_b
            .strokeRoundedRect(
               this.licenseState_o,
               Math.max(2.0F, BreezeContext.authSession_c.getFloat("cloud.corner-radius") - 8.0F),
               this.stringDecryptHelper3_j.color_l
            );
         BreezeContext.iRenderer_b
            .fillRoundedRectTwoColor(
               this.licenseState_o,
               Math.max(2.0F, BreezeContext.authSession_c.getFloat("cloud.corner-radius") - 8.0F),
               this.stringDecryptHelper3_j.fieldFloat_q / 2.0F,
               this.stringDecryptHelper3_j.color_n
            );
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 10.0F,
               this.licenseState_o.fieldFloat_b + 10.0F,
               90.0F,
               this.licenseState_o.fieldFloat_d - 20.0F,
               this.stringDecryptHelper3_j.fieldFloat_p * 0.5F,
               this.stringDecryptHelper3_j.color_m
            );
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 110.0F,
               this.licenseState_o.fieldFloat_b + 10.0F,
               this.licenseState_o.fieldFloat_c - 120.0F,
               this.licenseState_o.fieldFloat_d - 20.0F,
               this.stringDecryptHelper3_j.fieldFloat_p * 0.5F,
               this.stringDecryptHelper3_j.color_m
            );
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 20.0F,
               this.licenseState_o.calculateFloat_2() - 45.0F,
               70.0F,
               25.0F,
               this.stringDecryptHelper3_j.fieldFloat_p * 0.5F,
               this.stringDecryptHelper3_j.color_i
            );
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 20.0F,
               this.licenseState_o.fieldFloat_b + 20.0F,
               50.0F,
               15.0F,
               this.stringDecryptHelper3_j.fieldFloat_p * 0.22F,
               this.stringDecryptHelper3_j.color_j
            );
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 20.0F,
               this.licenseState_o.fieldFloat_b + 40.0F,
               40.0F,
               12.0F,
               this.stringDecryptHelper3_j.fieldFloat_p * 0.22F,
               this.stringDecryptHelper3_j.color_k
            );
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 65.0F,
               this.licenseState_o.fieldFloat_b + 40.0F,
               26.0F,
               12.0F,
               this.stringDecryptHelper3_j.fieldFloat_p * 0.22F,
               this.stringDecryptHelper3_j.color_k
            );
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 20.0F,
               this.licenseState_o.fieldFloat_b + 57.0F,
               56.0F,
               12.0F,
               this.stringDecryptHelper3_j.fieldFloat_p * 0.22F,
               this.stringDecryptHelper3_j.color_k
            );
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 120.0F,
               this.licenseState_o.fieldFloat_b + 20.0F,
               50.0F,
               12.0F,
               this.stringDecryptHelper3_j.fieldFloat_p * 0.22F,
               this.stringDecryptHelper3_j.color_k
            );
         float var16 = this.stringDecryptHelper3_j.fieldFloat_p * 0.15F;
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 120.0F, this.licenseState_o.fieldFloat_b + 40.0F, 60.0F, 6.0F, var16, this.stringDecryptHelper3_j.color_i
            );
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 180.0F,
               this.licenseState_o.fieldFloat_b + 40.0F,
               this.licenseState_o.fieldFloat_c - 200.0F,
               6.0F,
               var16,
               this.stringDecryptHelper3_j.color_m
            );
         BreezeContext.iRenderer_b
            .fillCircle(this.licenseState_o.fieldFloat_a + 180.0F, this.licenseState_o.fieldFloat_b + 43.0F, 6.0F, this.stringDecryptHelper3_j.color_j);
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 120.0F, this.licenseState_o.fieldFloat_b + 57.0F, 20.0F, 6.0F, var16, this.stringDecryptHelper3_j.color_i
            );
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 140.0F,
               this.licenseState_o.fieldFloat_b + 57.0F,
               this.licenseState_o.fieldFloat_c - 160.0F,
               6.0F,
               var16,
               this.stringDecryptHelper3_j.color_m
            );
         BreezeContext.iRenderer_b
            .fillCircle(this.licenseState_o.fieldFloat_a + 140.0F, this.licenseState_o.fieldFloat_b + 60.0F, 6.0F, this.stringDecryptHelper3_j.color_j);
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 120.0F,
               this.licenseState_o.fieldFloat_b + 80.0F,
               30.0F,
               12.0F,
               this.stringDecryptHelper3_j.fieldFloat_p * 0.22F,
               this.stringDecryptHelper3_j.color_k
            );
         if (this.stringDecryptHelper3_j.fieldBool_o) {
            BreezeContext.iRenderer_b
               .drawRect(this.licenseState_o.fieldFloat_a + 190.0F, this.licenseState_o.fieldFloat_b + 83.0F, 30.0F, 7.0F, this.stringDecryptHelper3_j.color_i);
            BreezeContext.iRenderer_b
               .drawRect(this.licenseState_o.fieldFloat_a + 212.0F, this.licenseState_o.fieldFloat_b + 78.0F, 8.0F, 16.0F, this.stringDecryptHelper3_j.color_j);
            if (var13 == 0) {
               break label44;
            }

            LicenseState.toggle(LicenseState.isValid_2());
         }

         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.licenseState_o.fieldFloat_a + 190.0F, this.licenseState_o.fieldFloat_b + 79.0F, 30.0F, 14.0F, 7.0F, this.stringDecryptHelper3_j.color_i
            );
         BreezeContext.iRenderer_b
            .fillCircle(this.licenseState_o.fieldFloat_a + 212.0F, this.licenseState_o.fieldFloat_b + 86.0F, 6.0F, this.stringDecryptHelper3_j.color_j);
      }

      super.processNullable(var1, var2, var3);
      if (var14) {
         BreezeContext.iRenderer_b.frameEnd();
      }
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      long var7 = var5 ^ 81104409656066L;
      if (var4) {
         return false;
      } else if (super.checkCondition(var1, var2, var3, var4)) {
         return true;
      } else if (this.a(var1, var2) && var3 == 0) {
         this.dataBuilder15_q.toggle(var7, !this.dataBuilder15_q.isBool_e());
         return true;
      } else {
         return false;
      }
   }

   public void update(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      long var6 = var4 ^ 32466143911654L;
      if (this.dataBuilder15_q.isBool_e() && var3 == 0) {
         this.dataBuilder15_q.toggle(var6, false);
         BreezeContext.guiPanelSettings_f.initialize(this::lambda$mouseReleased_Inner0);
      }

      super.processNullable_2(var1, var2, var3);
   }

   public void calculate() {
      super.processNullable_4();
      this.dataBuilder125_n.a(this.a + this.c - 30.0F, this.b + 8.0F, 21.0F, 21.0F);
      this.licenseState_o.fieldFloat_b = this.b + 38.0F;
      this.licenseState_o.fieldFloat_a = this.a + 8.0F;
      this.licenseState_o.fieldFloat_c = this.c - 16.0F;
      this.licenseState_o.fieldFloat_d = this.licenseState_o.fieldFloat_c * 0.6363636F;
      this.d = this.licenseState_o.fieldFloat_d + 98.0F;
      this.dataBuilder94_m.a(this.a, this.licenseState_o.calculateFloat_2() + 10.0F, this.c, 50.0F);
      this.dataBuilder44_l.a(this.a + 15.0F, this.b + 11.0F, this.c - 25.0F - this.dataBuilder125_n.c, 20.0F);
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   private void lambda$mouseReleased_Inner0() {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new RenderUtil40(this.stringDecryptHelper3_j.fieldLong_a));
   }

   static {
      long var0 = 81721028253803L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[7];
      int var5 = 0;
      String var6 = "wG¸}\\Ü;'\u0082á å\u000bHuºäF\u001c\u0002+¬Ô+\u0006ZÃó§\u0088iä/ËÒ\u00ad¶\u008c¬\f\u0013è \u0017IAC× µ\rAÏ¢ý¾úD\u0090þ\u0098\u0000O5a\u0089o\u008d3i\u008e£-ã\u0019ôA\u009dtV\u0019(øÿä\u0093äR\u009dÅ\\¨\u001aM+\u00adæö\u009f/Å;H\u0017\u0017É ¿#wõÿ¦\u008d\u0014 ÍöÛÆÿ\u009c(Öü\u001d\u0012_\u001c]Ec\u0092Êì.\u0007S\u009a\u008dI°ÇâëP¼,K0\u0011T\u009d\u0003çÁ\u0093q\u0084à\u0005ï\u008c0/)Q \u008d\u0003Úçrè\u0083ªQ]n\u0018Z¸\u0092©Í\u000b7£ÁP\u0004\u0085jÔRR\u008ejÅß\u009bêxü\u009bã\u009cêd\u0088¾È";
      int var7 = "wG¸}\\Ü;'\u0082á å\u000bHuºäF\u001c\u0002+¬Ô+\u0006ZÃó§\u0088iä/ËÒ\u00ad¶\u008c¬\f\u0013è \u0017IAC× µ\rAÏ¢ý¾úD\u0090þ\u0098\u0000O5a\u0089o\u008d3i\u008e£-ã\u0019ôA\u009dtV\u0019(øÿä\u0093äR\u009dÅ\\¨\u001aM+\u00adæö\u009f/Å;H\u0017\u0017É ¿#wõÿ¦\u008d\u0014 ÍöÛÆÿ\u009c(Öü\u001d\u0012_\u001c]Ec\u0092Êì.\u0007S\u009a\u008dI°ÇâëP¼,K0\u0011T\u009d\u0003çÁ\u0093q\u0084à\u0005ï\u008c0/)Q \u008d\u0003Úçrè\u0083ªQ]n\u0018Z¸\u0092©Í\u000b7£ÁP\u0004\u0085jÔRR\u008ejÅß\u009bêxü\u009bã\u009cêd\u0088¾È"
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
                     CONST_S = var4;
                     CONST_T = new String[7];
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

                  var6 = "C;\u0085WaÁ\u009eé~>êK@&Î\u0095\u0092\u009e3ß\u008a\u0084ØË.®À®3\u0006@Ø(ÊN\u000b£Ï\u0088\f8\u0088'©ë'JÇÄ\u0094Z>{\u0003pwío\u0010\t\u001f\u009b¿\u0090×èÇ3#¿\u0083Ê\\";
                  var7 = "C;\u0085WaÁ\u009eé~>êK@&Î\u0095\u0092\u009e3ß\u008a\u0084ØË.®À®3\u0006@Ø(ÊN\u000b£Ï\u0088\f8\u0088'©ë'JÇÄ\u0094Z>{\u0003pwío\u0010\t\u001f\u009b¿\u0090×èÇ3#¿\u0083Ê\\"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5861;
      if (CONST_T[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_U.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_U.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/di", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_S[var3].getBytes("ISO-8859-1");
         CONST_T[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_T[var3];
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
         throw new RuntimeException("rip/breeze/di" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
