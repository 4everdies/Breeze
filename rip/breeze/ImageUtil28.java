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

public final class ImageUtil28 extends RenderUtil43<KeyBind> {
   private static final int CONST_N;
   private final rip.breeze.client.AnimationTimer dataBuilder15_o = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private final rip.breeze.client.AnimationTimer dataBuilder15_p = new rip.breeze.client.AnimationTimer(300.0F, false, EnumType3.LINEAR);
   private boolean fieldBool_q;
   private LicenseState licenseState_r;
   private static final String[] CONST_T;
   private static final String[] CONST_U;
   private static final Map CONST_V = new HashMap(13);

   public ImageUtil28(GenericSetting<KeyBind> var1) {
      super(var1);
   }

   @Override
   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 85972512685926L;
      long var10 = var4 ^ 46241641281725L;
      super.calculate(var1, var2, var3);
      this.dataBuilder15_o.toggle(var6, this.licenseState_r.isValid(var1, var2));
      String var12 = this.fieldBool_q ? "Listening..." : ((KeyBind)this.k().getObject_m()).buildString();
      float var13 = BreezeContext.iRenderer_b.measureText(var12, EnumType32.SOURCE_SANS, 22.0F);
      Color var14 = ((KeyBind)this.k.getObject_m()).equals(KeyBind.CONST_G) && !this.fieldBool_q
         ? BreezeContext.authSession_c.getColor("keybind.none")
         : BreezeContext.authSession_c.getColor("keybind.bound");
      Color var15 = RenderUtil1.clamp(
         RenderUtil1.clamp(
            BreezeContext.authSession_c.getColor("keybind.background"),
            BreezeContext.authSession_c.getColor("keybind.background-hovered"),
            (float)this.dataBuilder15_o.getDouble(var10)
         ),
         BreezeContext.authSession_c.getColor("keybind.binding"),
         (float)this.dataBuilder15_p.calculateDouble(var8)
      );
      BreezeContext.iRenderer_b
         .strokeRoundedRect(this.licenseState_r, BreezeContext.authSession_c.getFloat("keybind.corner-radius"), var15);
      BreezeContext.iRenderer_b
         .drawText(
            var12,
            this.licenseState_r.fieldFloat_a + this.licenseState_r.fieldFloat_c / 2.0F - var13 / 2.0F,
            this.licenseState_r.fieldFloat_b + 7.0F,
            var14,
            EnumType32.SOURCE_SANS,
            22.0F
         );
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      long var6 = var4 ^ 119841672885148L;
      String var8 = RenderUtil43.getString();
      if (this.licenseState_r.isValid(var1, var2) && !this.k.fieldBool_k) {
         this.fieldBool_q = !this.fieldBool_q;
         if (this.fieldBool_q) {
            this.dataBuilder15_p.toggle(var6, true);
            if (var8 == null) {
               return false;
            }
         }

         if (var3 < 0) {
            return false;
         }

         this.k().processAll(new KeyBind(-var3 - 2));
         this.dataBuilder15_p.toggle(var6, false);
         this.fieldBool_q = false;
         if (var8 == null) {
            return false;
         }
      }

      this.fieldBool_q = false;
      this.dataBuilder15_p.toggle(var6, false);
      return false;
   }

   @Override
   public void calculate_2() {
      this.licenseState_r = new LicenseState(this.a + this.c - 160.0F, this.b + 5.0F, 150.0F, 35.0F);
      super.calculate_2();
   }

   public void update(float var1, float var2, float var3, float var4) {
      super.calculate_3(var1, var2, var3, 45.0F);
   }

   public boolean checkCondition_2(int var1) {
      long var2 = 45508263211567L;
      long var4 = var2 ^ 40944958585624L;
      if (!this.fieldBool_q || var1 != BreezeContext.iKeyCodeProvider_g.getModifiedKeyCode() && var1 != BreezeContext.iKeyCodeProvider_g.getKeyCode_KEY_108()) {
         if (this.fieldBool_q) {
            this.k().processAll(new KeyBind(var1));
            this.fieldBool_q = false;
            this.dataBuilder15_p.toggle(var4, false);
            return true;
         } else {
            return false;
         }
      } else {
         this.k().processAll(KeyBind.CONST_G);
         this.fieldBool_q = false;
         this.dataBuilder15_p.toggle(var4, false);
         return true;
      }
   }

   public boolean isValid(float var1) {
      long var2 = 69880200093113L;
      return var1 < 250.0F;
   }

   static {
      long var0 = 135897971982210L;
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
      String var6 = "Uû8µJö\u001b\u009a\u0080ÿºïÃ§Öç)b`Þ{º³s3{\u009fs\u008eù\u001bÇ(»T\u000e÷M\u009bîÔÙ÷\u0011e\u0095/\u000bbÇ\u0084ºä\u0013&N\u007fg<\u009b*[j³Ûkû<\nä\u0094öh(¢h)Cÿ\u0092\u0014ÐþVÇsÄ\u000fS*¶OêÍ\u0095gMo\u0015Æ8Ë\u008e2k\n¨iïm§\u0012Öû8¬~m\f\u0081í°C\u0097F$ZÌ\u00127\u0088f|¥<\u0088Jjp\u001aõ\u0091ÃÜ×§õ¥Gå³\n\u0015\u0002\fâx=¾=Ò[_2\fÝ²\u009dÞ|° \u0018\u0086Ð\u0097Ù½ü±J£¯È\fì\u008d\u009f$ø\u0013\u00904½\b\u0095eøÄ\u00833\u0099Ç\u0089";
      int var7 = "Uû8µJö\u001b\u009a\u0080ÿºïÃ§Öç)b`Þ{º³s3{\u009fs\u008eù\u001bÇ(»T\u000e÷M\u009bîÔÙ÷\u0011e\u0095/\u000bbÇ\u0084ºä\u0013&N\u007fg<\u009b*[j³Ûkû<\nä\u0094öh(¢h)Cÿ\u0092\u0014ÐþVÇsÄ\u000fS*¶OêÍ\u0095gMo\u0015Æ8Ë\u008e2k\n¨iïm§\u0012Öû8¬~m\f\u0081í°C\u0097F$ZÌ\u00127\u0088f|¥<\u0088Jjp\u001aõ\u0091ÃÜ×§õ¥Gå³\n\u0015\u0002\fâx=¾=Ò[_2\fÝ²\u009dÞ|° \u0018\u0086Ð\u0097Ù½ü±J£¯È\fì\u008d\u009f$ø\u0013\u00904½\b\u0095eøÄ\u00833\u0099Ç\u0089"
         .length();
      char var8 = ' ';
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
                     CONST_T = var4;
                     CONST_U = new String[7];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var15 = 2432241935607966828L;
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

                  var6 = "A.*\u008cÉ}¬¤£\u0082{òv)x¨\u0087¼¢s\u0088öJ$ ÓÚ\u008b\u0096@v\u0019ó\u0003ÎÆô¨Äÿß\u009bÑË<\u0017\tÛî\u0096\\RÖIa¦C";
                  var7 = "A.*\u008cÉ}¬¤£\u0082{òv)x¨\u0087¼¢s\u0088öJ$ ÓÚ\u008b\u0096@v\u0019ó\u0003ÎÆô¨Äÿß\u009bÑË<\u0017\tÛî\u0096\\RÖIa¦C".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24360;
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
            throw new RuntimeException("rip/breeze/dS", var10);
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
         throw new RuntimeException("rip/breeze/dS" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
