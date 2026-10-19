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

final class ColorUtils extends UIPanel {
   static final float CONST_H = 112.0F;
   private static final float CONST_I = 38.0F;
   private static final float CONST_J = 20.0F;
   private final ImageUtil5 dataBuilder109_k;
   private final rip.breeze.client.AnimationTimer dataBuilder15_l;
   private final rip.breeze.client.AnimationTimer dataBuilder15_m = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private static final String[] CONST_O;
   private static final String[] CONST_P;
   private static final Map CONST_Q = new HashMap(13);

   ColorUtils(ImageUtil5 var1) {
      this.dataBuilder109_k = var1;
      this.dataBuilder15_l = new rip.breeze.client.AnimationTimer(200.0F, var1.isBool_f(), EnumType3.CUBIC_IN_OUT);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      super.toggle(var1, var2, var3);
      this.dataBuilder15_l.toggle(var6, this.dataBuilder109_k.isBool_f());
      int var10000 = RenderUtil30.getValue();
      this.dataBuilder15_m.toggle(var6, this.a(var1, var2));
      int var10 = var10000;
      float var11 = (float)this.dataBuilder15_l.getDouble(var8);
      BreezeContext.iRenderer_b
         .drawText(
            "Rainbow",
            this.a,
            this.d() - 8.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               BreezeContext.authSession_c.getColor("default.text-primary"),
               (float)this.dataBuilder15_m.getDouble(var8)
            ),
            EnumType32.SOURCE_SANS,
            19.0F
         );
      float var12 = this.a() - 38.0F;
      float var13 = this.d() - 10.0F;
      float var14 = 10.0F;
      Color var15 = Color.getHSBColor(BreezeColor.calculateFloat(), 0.75F, 0.95F);
      Color var16 = RenderUtil1.clamp(BreezeContext.authSession_c.getColor("default.layer-two"), var15, var11);
      BreezeContext.iRenderer_b.fillRoundedRectFull(var12, var13, 38.0F, 20.0F, 10.0F, var16);
      RenderUtil30.clamp(var12, var13, 38.0F, 20.0F, 10.0F, RenderUtil30.CONST_T);
      float var17 = 18.0F;
      float var18 = var12 + 10.0F + 18.0F * var11;
      BreezeContext.iRenderer_b.fillCircle(var18, var13 + 10.0F, 6.5F, Color.WHITE);
      if (!LicenseState.isValid_2()) {
         RenderUtil30.initialize(++var10);
      }
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.a(var1, var2) && var3 == 0) {
         this.dataBuilder109_k.toggle_2(!this.dataBuilder109_k.isBool_f());
         return true;
      } else {
         return false;
      }
   }

   static {
      long var0 = 47536268794847L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "ö21\tì\u0013ðÊ\"Wx4·bc1(¸S\u001b¦è<Ã«ZRî°Â\u008eý\u0085ÎYÏ¢§¼g\u0000a\u0085H¨^)áu©ó7GÚbT\u0003";
      int var7 = "ö21\tì\u0013ðÊ\"Wx4·bc1(¸S\u001b¦è<Ã«ZRî°Â\u008eý\u0085ÎYÏ¢§¼g\u0000a\u0085H¨^)áu©ó7GÚbT\u0003".length();
      char var8 = 16;
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
                     CONST_O = var4;
                     CONST_P = new String[4];
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

                  var6 = "\u0019\noÆ\u009aúÓíë´P\f!@]\u008bCJ&\u0004\u0086tÃ#äüõõ\u0002z[hû\u0087~Ø©f@g(±\u000f\u009fâãÜ.6\u0002ºeBr6GQO!ù\u0086\u000e>4\u0096\u0095´\u0089\u008e\u000e_û?Ä¨ç\u0081úÌ¿\u0011";
                  var7 = "\u0019\noÆ\u009aúÓíë´P\f!@]\u008bCJ&\u0004\u0086tÃ#äüõõ\u0002z[hû\u0087~Ø©f@g(±\u000f\u009fâãÜ.6\u0002ºeBr6GQO!ù\u0086\u000e>4\u0096\u0095´\u0089\u008e\u000e_û?Ä¨ç\u0081úÌ¿\u0011"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16135;
      if (CONST_P[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Q.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Q.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/d3", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_O[var3].getBytes("ISO-8859-1");
         CONST_P[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_P[var3];
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
         throw new RuntimeException("rip/breeze/d3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
