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

public class ImageUtil10 extends UIPanel {
   private final BreezeModule dataBuilder52_h;
   private final rip.breeze.client.AnimationTimer dataBuilder15_i = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private final rip.breeze.client.AnimationTimer dataBuilder15_j = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private final rip.breeze.client.AnimationTimer dataBuilder15_k = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private final PlayerUtil9 dataBuilder65_l;
   private final RenderUtil45 dataBuilder86_m;
   private static String[] arr_n;
   private static final String[] CONST_P;
   private static final String[] CONST_Q;
   private static final Map CONST_R = new HashMap(13);

   public ImageUtil10(BreezeModule var1, PlayerUtil9 var2, UserTheme var3) {
      this.dataBuilder52_h = var1;
      this.d = 40.0F;
      this.dataBuilder65_l = var2;
      this.dataBuilder86_m = new RenderUtil45(var1, var2, true, var3);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      super.toggle(var1, var2, var3);
      decrypt();
      this.dataBuilder15_i.toggle(var6, this.a(var1, var2));
      this.dataBuilder15_j.toggle(var6, this.dataBuilder65_l.s() == this.dataBuilder86_m);
      this.dataBuilder15_k.toggle(var6, this.a(var1, var2) && var1 < this.a + 15.0F && !this.dataBuilder15_j.isBool_e());
      Color var11 = RenderUtil1.clamp(
         RenderUtil1.clamp(
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            BreezeContext.authSession_c.getColor("default.text-primary"),
            (float)this.dataBuilder15_i.getDouble(var8)
         ),
         BreezeContext.authSession_c.getColor("default.text-primary"),
         (float)this.dataBuilder15_j.getDouble(var8)
      );
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this,
            9.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("default.layer-one"),
               BreezeContext.authSession_c.getColor("default.hovered"),
               (float)this.dataBuilder15_i.getDouble(var8)
            )
         );
      BreezeContext.iRenderer_b
         .fillGradientRectSimple(
            this.a,
            this.b,
            (float)(9.0 + (this.c - 9.0F) * this.dataBuilder15_j.getDouble(var8)),
            this.d,
            new float[]{9.0F, (float)(9.0 * this.dataBuilder15_j.getDouble(var8)), (float)(9.0 * this.dataBuilder15_j.getDouble(var8)), 9.0F},
            BreezeContext.authSession_c.getColor("default.accent")
         );
      BreezeContext.iRenderer_b.drawText(this.dataBuilder52_h.moduleName, this.a + 15.0F, this.b + 11.0F, var11, EnumType32.SOURCE_SANS, 18.0F);
      if (!LicenseState.isValid_2()) {
         initialize(new String[5]);
      }
   }

   public BreezeModule getDataBuilder52_h() {
      return this.dataBuilder52_h;
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (!this.a(var1, var2)) {
         return false;
      } else if (var3 == 0) {
         this.dataBuilder65_l.e(this.dataBuilder86_m);
         return true;
      } else {
         return true;
      }
   }

   public static void initialize(String[] var0) {
      arr_n = var0;
   }

   public static String[] decrypt() {
      return arr_n;
   }

   static {
      long var0 = 92504045789026L;
      initialize(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "g\u0083Á\u001e\u0006*âº\u000fXU4\u0007ºé\u009aáÌiE\u0001\u0095\u008bª(\u0085¬ïÍÖFµQ3ôÉWÜE|ù\u0004\u00927÷%òÕôò\b·\u0010½\u000f\u009fÇ\u0006ÿÌw7h\u0011.0\u009dÂÁ \u0080`Ü\u0093\u000fr\u0091!pH6ýq*7r\u009eðôß_n´¥^Ü\b\u00030½?h^\r0O\u001bþåb¥6;]\u0018¶LÖ\u008cã\u0014Ý.sVÚ»\u000e>µ\u0095´«Ê-[\f#\u009f";
      int var7 = "g\u0083Á\u001e\u0006*âº\u000fXU4\u0007ºé\u009aáÌiE\u0001\u0095\u008bª(\u0085¬ïÍÖFµQ3ôÉWÜE|ù\u0004\u00927÷%òÕôò\b·\u0010½\u000f\u009fÇ\u0006ÿÌw7h\u0011.0\u009dÂÁ \u0080`Ü\u0093\u000fr\u0091!pH6ýq*7r\u009eðôß_n´¥^Ü\b\u00030½?h^\r0O\u001bþåb¥6;]\u0018¶LÖ\u008cã\u0014Ý.sVÚ»\u000e>µ\u0095´«Ê-[\f#\u009f"
         .length();
      char var8 = 24;
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
                     CONST_P = var4;
                     CONST_Q = new String[6];
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

                  var6 = "Y\u001d\u0005$\u0089\u009d§f\u009dôìæü¦ \u001d¾Ê\u001dè\u0094¦#©ß3ý$1o\u0012U\u000f\u0087~âAÅÆ\u0085(\u0001Ì\u001dM\u0016«ö³)8%\u009b=·\u0095Pé%lÞ\u0095\u0000û\u0083z\u0096Òì\u0091²þÛFÎ»ao¿ho";
                  var7 = "Y\u001d\u0005$\u0089\u009d§f\u009dôìæü¦ \u001d¾Ê\u001dè\u0094¦#©ß3ý$1o\u0012U\u000f\u0087~âAÅÆ\u0085(\u0001Ì\u001dM\u0016«ö³)8%\u009b=·\u0095Pé%lÞ\u0095\u0000û\u0083z\u0096Òì\u0091²þÛFÎ»ao¿ho"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19739;
      if (CONST_Q[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_R.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_R.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/ev", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_P[var3].getBytes("ISO-8859-1");
         CONST_Q[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Q[var3];
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
         throw new RuntimeException("rip/breeze/ev" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
