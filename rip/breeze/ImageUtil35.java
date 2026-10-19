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

public class ImageUtil35 extends Util28 {
   private final StringDecryptHelper2 stringDecryptHelper2_j;
   private final UserInfo userInfo_k;
   private final RenderUtil48 dataBuilder94_l;
   private final RenderUtil14 dataBuilder128_m;
   private final RenderUtil11_x dataBuilder120_n;
   private final RenderUtil12_x dataBuilder125_o;
   private final RenderUtil31 dataBuilder44_p;
   private final ImageUtil3 breezeUtil111_q;
   private final ImageUtil34 dataBuilder90_r;
   private final rip.breeze.client.AnimationTimer dataBuilder15_s;
   private final rip.breeze.client.AnimationTimer dataBuilder15_t;
   private static final String[] CONST_V;
   private static final String[] CONST_W;
   private static final Map CONST_X = new HashMap(13);

   public ImageUtil35(StringDecryptHelper2 var1, UserInfo var2) {
      long var3 = 37979072224359L;
      super();
      this.dataBuilder15_s = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.dataBuilder15_t = new rip.breeze.client.AnimationTimer(35.0F, false, EnumType3.LINEAR);
      this.userInfo_k = var2;
      this.stringDecryptHelper2_j = var1;
      this.dataBuilder128_m = new RenderUtil14(var1.fieldFloat_d, var1.fieldInt_e);
      this.dataBuilder120_n = new RenderUtil11_x(var1.string_c, 18);
      this.dataBuilder94_l = new RenderUtil48(var2);
      this.dataBuilder125_o = new RenderUtil12_x(var1.fieldBool_k, var1.fieldLong_a, RenderUtil19_x.SCRIPT);
      this.dataBuilder44_p = new RenderUtil31(var1.string_b, 20, "default.text-primary");
      this.dataBuilder90_r = new ImageUtil34(RenderUtil19_x.SCRIPT);
      this.breezeUtil111_q = var1.enum5Val_n != RenderUtil20_x.APPROVED ? new ImageUtil3(var1.enum5Val_n) : null;
      this.a(
         new UIPanel[]{this.dataBuilder128_m, this.dataBuilder94_l, this.dataBuilder120_n, this.dataBuilder125_o, this.dataBuilder44_p, this.dataBuilder90_r}
      );
      if (this.breezeUtil111_q != null) {
         this.b(this.breezeUtil111_q);
      }

      this.d = 200.0F;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 85972512685926L;
      long var8 = var4 ^ 22603910165621L;
      long var10 = var4 ^ 46241641281725L;
      this.dataBuilder128_m.initialize(this.stringDecryptHelper2_j.fieldFloat_d, this.stringDecryptHelper2_j.fieldInt_e);
      boolean var12 = this.a(var1, var2);
      boolean var13 = this.dataBuilder15_t.calculateDouble(var6) != 0.0;
      this.dataBuilder15_s.toggle(var8, var12);
      this.dataBuilder15_t.toggle(var8, this.dataBuilder15_t.isBool_e() && var12);
      Color var14 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("default.layer-one"),
         RenderUtil1.clamp(
            BreezeContext.authSession_c.getColor("default.layer-one"),
            BreezeContext.authSession_c.getColor("default.hovered"),
            0.5F
         ),
         (float)this.dataBuilder15_s.getDouble(var10)
      );
      if (var13) {
         BreezeContext.iRenderer_b.frameBegin();
         BreezeContext.iRenderer_b.setDimensions(0.0F, -((float)(this.dataBuilder15_t.getDouble(var10) * 2.0)));
      }

      float var15 = BreezeContext.authSession_c.getFloat("cloud.corner-radius");
      BreezeContext.iRenderer_b.fillGradientRectSimple(this.a, this.b, this.c, this.d - 50.0F, new float[]{var15, var15, 0.0F, 0.0F}, var14);
      super.processNullable(var1, var2, var3);
      if (var13) {
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
         this.dataBuilder15_t.toggle(var7, !this.dataBuilder15_t.isBool_e());
         return true;
      } else {
         return false;
      }
   }

   public void update(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      long var6 = var4 ^ 32466143911654L;
      if (this.dataBuilder15_t.isBool_e() && var3 == 0 && this.a(var1, var2)) {
         this.dataBuilder15_t.toggle(var6, false);
         BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new RenderUtil14_x(this.stringDecryptHelper2_j, this.userInfo_k));
      }

      super.processNullable_2(var1, var2, var3);
   }

   public void calculate_2() {
      long var1 = 62740630596709L;
      super.processNullable_4();
      this.dataBuilder128_m.a(this.a + 15.0F, this.b + 35.0F, 100.0F, 20.0F);
      this.dataBuilder120_n.a(this.a + 15.0F, this.b + 60.0F, this.c - 30.0F, this.d - 110.0F);
      this.dataBuilder94_l.a(this.a, this.b + this.d - 50.0F, this.c, this.dataBuilder94_l.d);
      this.dataBuilder125_o.a(this.a + this.c - 30.0F, this.b + 8.0F, 21.0F, 21.0F);
      this.dataBuilder90_r.a(this.a + 15.0F, this.b + 9.0F, this.dataBuilder90_r.c, this.dataBuilder90_r.d);
      this.dataBuilder44_p.a(this.dataBuilder90_r.a() + 8.0F, this.b + 10.0F, this.dataBuilder125_o.a - this.dataBuilder90_r.a() - 9.0F, 20.0F);
      if (this.breezeUtil111_q != null) {
         float var3 = this.breezeUtil111_q.calculateFloat();
         this.breezeUtil111_q.a(this.a + this.c - 15.0F - var3, this.b + 35.0F, var3, this.breezeUtil111_q.d);
      }
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   static {
      long var0 = 48340455320892L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[5];
      int var5 = 0;
      String var6 = "¤Da\fß\f\n`t\u0080ÑÎ)£\u0003þ×·¨&\"þtFhÓ^ì¯\u00053£ÀøB\u000e]¤\u0001\u0014(ÙÏbSïk}\u008b¤ý&\u007fª\u009bwñfãe½ÞÁ\u008bbÖ¯l\n\u00044ôxp1æ#*L0\u0010\u0018\u000f_ú\u0087vz¤/\u008acL\u007f^~\u001c9k\u0013\u0017~Å\u0007p\u008f";
      int var7 = "¤Da\fß\f\n`t\u0080ÑÎ)£\u0003þ×·¨&\"þtFhÓ^ì¯\u00053£ÀøB\u000e]¤\u0001\u0014(ÙÏbSïk}\u008b¤ý&\u007fª\u009bwñfãe½ÞÁ\u008bbÖ¯l\n\u00044ôxp1æ#*L0\u0010\u0018\u000f_ú\u0087vz¤/\u008acL\u007f^~\u001c9k\u0013\u0017~Å\u0007p\u008f"
         .length();
      char var8 = '(';
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
                     CONST_V = var4;
                     CONST_W = new String[5];
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

                  var6 = "\u0099C£\u0011\u0005ØaCÅç\u0006ú\u0082\u0013áfÕ¢dén¨Q§*3\u001dðmås²ù°\u0091ï\u0018l\u0004«(H-o\u0097»÷õ¹\n\u0082öqÈ³Ç\"gã¯î|Û-\u001eM\u0091'c\u0012S ö\u0086«?\u0097ØCÒZ";
                  var7 = "\u0099C£\u0011\u0005ØaCÅç\u0006ú\u0082\u0013áfÕ¢dén¨Q§*3\u001dðmås²ù°\u0091ï\u0018l\u0004«(H-o\u0097»÷õ¹\n\u0082öqÈ³Ç\"gã¯î|Û-\u001eM\u0091'c\u0012S ö\u0086«?\u0097ØCÒZ"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27083;
      if (CONST_W[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_X.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_X.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dh", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_V[var3].getBytes("ISO-8859-1");
         CONST_W[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_W[var3];
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
         throw new RuntimeException("rip/breeze/dh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
