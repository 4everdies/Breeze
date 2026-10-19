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

public class ImageUtil33 extends Util28 {
   private final StringDecryptHelper stringDecryptHelper_j;
   private final UserInfo userInfo_k;
   private final RenderUtil48 dataBuilder94_l;
   private final RenderUtil14 dataBuilder128_m;
   private final RenderUtil11_x dataBuilder120_n;
   private final RenderUtil12_x dataBuilder125_o;
   private final RenderUtil31 dataBuilder44_p;
   private final ImageUtil34 dataBuilder90_q;
   private final rip.breeze.client.AnimationTimer dataBuilder15_r;
   private final rip.breeze.client.AnimationTimer dataBuilder15_s;
   private static final String[] CONST_U;
   private static final String[] CONST_V;
   private static final Map CONST_W = new HashMap(13);

   public ImageUtil33(StringDecryptHelper var1, UserInfo var2) {
      long var3 = 140335841353219L;
      super();
      this.dataBuilder15_r = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.dataBuilder15_s = new rip.breeze.client.AnimationTimer(35.0F, false, EnumType3.LINEAR);
      this.userInfo_k = var2;
      this.stringDecryptHelper_j = var1;
      this.dataBuilder128_m = new RenderUtil14(var1.fieldFloat_d, var1.fieldInt_e);
      this.dataBuilder120_n = new RenderUtil11_x(var1.string_c, 18);
      this.dataBuilder94_l = new RenderUtil48(var2);
      this.dataBuilder125_o = new RenderUtil12_x(var1.fieldBool_k, var1.fieldLong_a, RenderUtil19_x.CONFIG);
      this.dataBuilder44_p = new RenderUtil31(var1.string_b, 20, "default.text-primary");
      this.dataBuilder90_q = new ImageUtil34(RenderUtil19_x.CONFIG);
      this.a(
         new UIPanel[]{this.dataBuilder128_m, this.dataBuilder94_l, this.dataBuilder120_n, this.dataBuilder125_o, this.dataBuilder44_p, this.dataBuilder90_q}
      );
      this.d = 200.0F;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 85972512685926L;
      long var8 = var4 ^ 22603910165621L;
      long var10 = var4 ^ 46241641281725L;
      this.dataBuilder128_m.initialize(this.stringDecryptHelper_j.fieldFloat_d, this.stringDecryptHelper_j.fieldInt_e);
      boolean var12 = this.a(var1, var2);
      boolean var13 = this.dataBuilder15_s.calculateDouble(var6) != 0.0;
      this.dataBuilder15_r.toggle(var8, var12);
      this.dataBuilder15_s.toggle(var8, this.dataBuilder15_s.isBool_e() && var12);
      Color var14 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("default.layer-one"),
         RenderUtil1.clamp(
            BreezeContext.authSession_c.getColor("default.layer-one"),
            BreezeContext.authSession_c.getColor("default.hovered"),
            0.5F
         ),
         (float)this.dataBuilder15_r.getDouble(var10)
      );
      if (var13) {
         BreezeContext.iRenderer_b.frameBegin();
         BreezeContext.iRenderer_b.setDimensions(0.0F, -((float)(this.dataBuilder15_s.getDouble(var10) * 2.0)));
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
         this.dataBuilder15_s.toggle(var7, !this.dataBuilder15_s.isBool_e());
         return true;
      } else {
         return false;
      }
   }

   public void update(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      long var6 = var4 ^ 32466143911654L;
      if (this.dataBuilder15_s.isBool_e() && var3 == 0 && this.a(var1, var2)) {
         this.dataBuilder15_s.toggle(var6, false);
         BreezeContext.guiPanelSettings_f.dataBuilder100_r.update(new PlayerUtil9(this.stringDecryptHelper_j, this.userInfo_k));
      }

      super.processNullable_2(var1, var2, var3);
   }

   public void update_1() {
      super.processNullable_3();
   }

   public void calculate_2() {
      super.processNullable_4();
      this.dataBuilder128_m.a(this.a + 15.0F, this.b + 35.0F, 100.0F, 20.0F);
      this.dataBuilder120_n.a(this.a + 15.0F, this.b + 60.0F, this.c - 30.0F, this.d - 110.0F);
      this.dataBuilder94_l.a(this.a, this.b + this.d - 50.0F, this.c, this.dataBuilder94_l.d);
      this.dataBuilder125_o.a(this.a + this.c - 30.0F, this.b + 8.0F, 21.0F, 21.0F);
      this.dataBuilder90_q.a(this.a + 15.0F, this.b + 9.0F, this.dataBuilder90_q.c, this.dataBuilder90_q.d);
      this.dataBuilder44_p.a(this.dataBuilder90_q.a() + 8.0F, this.b + 10.0F, this.dataBuilder125_o.a - this.dataBuilder90_q.a() - 9.0F, 20.0F);
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   static {
      long var0 = 82735588735618L;
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
      String var6 = "7Þ/Izdªc\u0006+ZØ\u009fÕÁº\u000bkNIn3\u0001+Y\u0005\u001b\u00ad\u0090Jð\\\t\u0015àØ\n¶l8(×\u000f\u008ahLµän0ÉU\u009d\u0095ð\u0018J\u000eåÜ]\u0087f\u0097X\u001cG%\u0086pç+¨ðå^·\"J7 (\bzÓ¢äà®\u0098\u0000>0\u009aÂ¨¦\u0080ð¶;%IdÍR\u0086\u0018úcg¿øäÒ\b\u008aÄé½C©";
      int var7 = "7Þ/Izdªc\u0006+ZØ\u009fÕÁº\u000bkNIn3\u0001+Y\u0005\u001b\u00ad\u0090Jð\\\t\u0015àØ\n¶l8(×\u000f\u008ahLµän0ÉU\u009d\u0095ð\u0018J\u000eåÜ]\u0087f\u0097X\u001cG%\u0086pç+¨ðå^·\"J7 (\bzÓ¢äà®\u0098\u0000>0\u009aÂ¨¦\u0080ð¶;%IdÍR\u0086\u0018úcg¿øäÒ\b\u008aÄé½C©"
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
                     CONST_U = var4;
                     CONST_V = new String[5];
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

                  var6 = "\u0081mÞ¤\u000fÊÝìû©}>³\u009a\u0096°uÇZ\u009a\u0081¼\u0015m\u001cF\u0099\u008d|<¨\u001d \u0013\u008b\u0015Ò`mt ¸Æë{\u0092h\\\bû\u0087\u001b}©9'\u0007§ZLoÖMcäþUÑ Ù\u0093\u0085¯";
                  var7 = "\u0081mÞ¤\u000fÊÝìû©}>³\u009a\u0096°uÇZ\u009a\u0081¼\u0015m\u001cF\u0099\u008d|<¨\u001d \u0013\u008b\u0015Ò`mt ¸Æë{\u0092h\\\bû\u0087\u001b}©9'\u0007§ZLoÖMcäþUÑ Ù\u0093\u0085¯"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11973;
      if (CONST_V[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_W.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_W.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/de", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_U[var3].getBytes("ISO-8859-1");
         CONST_V[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_V[var3];
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
         throw new RuntimeException("rip/breeze/de" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
