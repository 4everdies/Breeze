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
import rip.breeze.client.EnumType3;

public class RenderUtil46 extends Util28 {
   private final Util142 dataBuilder8_j;
   private final RenderUtil24 dataBuilder34_k;
   private final RenderUtil13 dataBuilder126_l;
   private final RenderUtil11_x dataBuilder120_m;
   private final RenderUtil31 dataBuilder44_n;
   private final ImageUtil2 breezeUtil110_o;
   private final ImageUtil2 breezeUtil110_p;
   private final boolean fieldBool_q;
   private final rip.breeze.client.AnimationTimer dataBuilder15_r;
   private static final String[] CONST_T;
   private static final String[] CONST_U;
   private static final Map CONST_V = new HashMap(13);

   public RenderUtil46(RenderUtil24 var1, Util142 var2) {
      long var3 = 17013706562221L;
      int var10000 = ImageUtil34.getValue_2();
      super();
      this.dataBuilder15_r = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.LINEAR);
      this.dataBuilder34_k = var1;
      this.dataBuilder8_j = var2;
      int var5 = var10000;
      int var10001 = var2.userInfo_c.fieldInt_d;
      CloudAuthService var10002 = BreezeContext.cloudAuthService_h;
      Object[] var10003 = rip.breeze.client.MathUtil8.noArgs();
      Method var10005 = rip.breeze.client.MathUtil8.getMethod_3(-7303620212115842378L, var3);
      Object[] var10004 = var10003;
      CloudAuthService var9 = var10002;
      Method var7 = var10005;

      try {
         var8 = (UserInfo)var7.invoke(var9, var10004);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      label32: {
         this.fieldBool_q = var10001 == var8.fieldInt_d;
         if (this.fieldBool_q) {
            this.breezeUtil110_o = new ImageUtil2(new LicenseState(), "edit", RenderUtil46::lambda$new_Inner0, false);
            this.breezeUtil110_p = new ImageUtil2(new LicenseState(), "delete", this::processAll, false);
            this.a(new UIPanel[]{this.breezeUtil110_o, this.breezeUtil110_p});
            if (var5 == 0) {
               break label32;
            }
         }

         this.breezeUtil110_o = null;
         this.breezeUtil110_p = null;
      }

      label27: {
         this.dataBuilder126_l = new RenderUtil13(var2.userInfo_c.string_b, var2.userInfo_c.fieldInt_d, 50);
         this.dataBuilder44_n = new RenderUtil31(var2.userInfo_c.string_a, 22, "default.text-secondary");
         if (var2.string_b != null) {
            this.dataBuilder120_m = new RenderUtil11_x(var2.string_b, 18);
            this.b(this.dataBuilder120_m);
            if (var5 == 0) {
               break label27;
            }
         }

         this.dataBuilder120_m = null;
      }

      this.a(new UIPanel[]{this.dataBuilder126_l, this.dataBuilder44_n});
   }

   private void processAll() {
      long var1 = 69300499189188L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs3(this.dataBuilder34_k.fieldLong_j, this.dataBuilder34_k.enum4Val_k, RenderUtil46::lambda$delete_Inner1);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(997436635737217692L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      this.dataBuilder34_k.processAll();
   }

   private void clamp() {
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      int var10000 = ImageUtil34.getValue();
      this.dataBuilder15_r.toggle(var6, true);
      int var10 = var10000;
      float var11 = -1.0F;
      if (this.dataBuilder15_r.getDouble(var8) != 1.0) {
         var11 = BreezeContext.iRenderer_b.getGlobalAlpha();
         BreezeContext.iRenderer_b.setGlobalAlpha((float)this.dataBuilder15_r.getDouble(var8));
      }

      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this,
            BreezeContext.authSession_c.getFloat("cloud.corner-radius"),
            BreezeContext.authSession_c.getColor("default.layer-one")
         );
      int var12 = 0;

      while (var12 < 5) {
         label25: {
            if (this.dataBuilder8_j.fieldInt_a > var12) {
               BreezeContext.iRenderer_b
                  .drawTextAt(
                     "star_filled",
                     this.a + 68.0F + var12 * 18,
                     this.b + 38.0F,
                     1.0F,
                     BreezeContext.authSession_c.getColor("cloud.star")
                  );
               if (var10 != 0) {
                  break label25;
               }
            }

            BreezeContext.iRenderer_b
               .drawTextAt(
                  "star_filled",
                  this.a + 68.0F + var12 * 18,
                  this.b + 38.0F,
                  1.0F,
                  BreezeContext.authSession_c.getColor("cloud.star-background")
               );
         }

         var12++;
         if (var10 == 0) {
            break;
         }
      }

      BreezeContext.iRenderer_b
         .drawText(
            DateUtil_x.buildString(this.dataBuilder8_j.fieldLong_d),
            this.a + 170.0F,
            this.b + 45.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            EnumType32.SOURCE_SANS,
            15.0F
         );
      super.processNullable(var1, var2, var3);
      if (var11 != -1.0F) {
         BreezeContext.iRenderer_b.setGlobalAlpha(var11);
      }
   }

   public void clamp() {
      label15: {
         long var1 = 62740630596709L;
         int var10000 = ImageUtil34.getValue_2();
         super.processNullable_4();
         this.dataBuilder126_l.a(this.a + 15.0F, this.b + 15.0F, 50.0F, 50.0F);
         int var3 = var10000;
         this.dataBuilder44_n.a(this.a + 72.0F, this.b + 17.0F, this.c - 75.0F, 20.0F);
         if (this.dataBuilder120_m != null) {
            float var4 = Math.min(RenderUtil11_x.calculateFloat(this.dataBuilder8_j.string_b, 18, this.c - 30.0F), 150.0F);
            this.d = 85.0F + var4;
            this.dataBuilder120_m.a(this.a + 20.0F, this.b + 75.0F, this.c - 30.0F, var4);
            if (var3 == 0) {
               break label15;
            }
         }

         this.d = 80.0F;
      }

      if (this.fieldBool_q) {
         this.breezeUtil110_o.a(this.a + this.c - 40.0F - 28.0F, this.b + 8.0F, 28.0F, 28.0F);
         this.breezeUtil110_p.a(this.a + this.c - 40.0F, this.b + 8.0F, 28.0F, 28.0F);
      }
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   private static void lambda$delete_Inner1(String var0) {
      long var1 = 11842380894498L;
      BreezeContext.guiPanelSettings_f.processAll("Failed deleting review", RenderUtil18_x.RED + var0);
   }

   private static void lambda$new_Inner0(RenderUtil24 var0, Util142 var1) {
      var0.update(var1);
   }

   static {
      long var0 = 128995376561681L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[11];
      int var5 = 0;
      String var6 = "÷Zü\u008dÝuáª\u0080\u008a2Û\u008e\u001ekªïXTøóBVª\u0004\u000f·Æ±=¨w \u007fÅ)ø \u0082Í@úÎ\f`¿ö9ãs\u0019Ào¾ ¾¿l\u0017Î]Ô;Ü3\u0010_)#øéZ\u001d¸©¯\u00ad¼Ã4Y\\(Ãp\u00016\u0014\u001c=!ø6ê¥\u0097q\u0087Ïäuï5þ\u0089\u0094£Û\u009a3øw\u009d\u0080Èu\u0087Öä%<±?(\u0083r=wá¥J\u008d\u0081~\u008dt+\u0096\u0011¼yI\u0015\u009d°æò\u0019~é\u008ffwYÙ\u0012Ó³ñ¾ãn3\u0011(Ïõ&\u0017\u0091<\u008c\rùõ+ûm\bÜ&søïí\u007f\\J5\u0017\u009bzPÆµ\u001eæùÑIs/çÝN(àZ\u0011Uú^\u009fÛ\"\u0097þ^\u009e\u007f°ÿìøz\u000bÍ¾<b/\u009aVTô#$®.~\u00823\u0080'I=(â¯ê3\u008b\u0086'_@ã«e·+\rg\u009f[P°b\u000bppûïéEFõàTÅÐrRLÿ\tt\u0010\"&ÏøNp²Â\r'·C<\u008eÓ«";
      int var7 = "÷Zü\u008dÝuáª\u0080\u008a2Û\u008e\u001ekªïXTøóBVª\u0004\u000f·Æ±=¨w \u007fÅ)ø \u0082Í@úÎ\f`¿ö9ãs\u0019Ào¾ ¾¿l\u0017Î]Ô;Ü3\u0010_)#øéZ\u001d¸©¯\u00ad¼Ã4Y\\(Ãp\u00016\u0014\u001c=!ø6ê¥\u0097q\u0087Ïäuï5þ\u0089\u0094£Û\u009a3øw\u009d\u0080Èu\u0087Öä%<±?(\u0083r=wá¥J\u008d\u0081~\u008dt+\u0096\u0011¼yI\u0015\u009d°æò\u0019~é\u008ffwYÙ\u0012Ó³ñ¾ãn3\u0011(Ïõ&\u0017\u0091<\u008c\rùõ+ûm\bÜ&søïí\u007f\\J5\u0017\u009bzPÆµ\u001eæùÑIs/çÝN(àZ\u0011Uú^\u009fÛ\"\u0097þ^\u009e\u007f°ÿìøz\u000bÍ¾<b/\u009aVTô#$®.~\u00823\u0080'I=(â¯ê3\u008b\u0086'_@ã«e·+\rg\u009f[P°b\u000bppûïéEFõàTÅÐrRLÿ\tt\u0010\"&ÏøNp²Â\r'·C<\u008eÓ«"
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
                     CONST_T = var4;
                     CONST_U = new String[11];
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

                  var6 = "\u0017º\u001dß\t\u0099¬k\r\u0016TlÒ@\u001fd\u009b\u0013Í(J÷[N \u0088\u0007\u008aL,\u008båI\u00946\u0093ñlúl Ñÿá\u0013z\u009d\u0012rØ\u0018µ\u0012\u0000é`\u008f\nØpÏJâ \u0095\u0096¢ÉñqY·³";
                  var7 = "\u0017º\u001dß\t\u0099¬k\r\u0016TlÒ@\u001fd\u009b\u0013Í(J÷[N \u0088\u0007\u008aL,\u008båI\u00946\u0093ñlúl Ñÿá\u0013z\u009d\u0012rØ\u0018µ\u0012\u0000é`\u008f\nØpÏJâ \u0095\u0096¢ÉñqY·³"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15791;
      if (CONST_U[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_V.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_V.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dg", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_T[var3].getBytes("ISO-8859-1");
         CONST_U[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_U[var3];
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
         throw new RuntimeException("rip/breeze/dg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
