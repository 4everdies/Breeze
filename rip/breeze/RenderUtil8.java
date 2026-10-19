package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.EnumType3;

public class RenderUtil8 extends UIPanel {
   private static final int CONST_H;
   private static final float CONST_I = 18.0F;
   private final rip.breeze.client.AnimationTimer dataBuilder15_j = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private final MathUtil18 dataBuilder84_k;
   private List<WorldUtil6> list_l;
   private static final String[] CONST_N;
   private static final String[] CONST_O;
   private static final Map CONST_P = new HashMap(13);

   public RenderUtil8(MathUtil18 var1, List<WorldUtil6> var2) {
      this.dataBuilder84_k = var1;
      this.list_l = var2;
   }

   public WorldUtil6 getEnum16Val() {
      long var1 = 25301197612592L;
      return this.list_l.isEmpty() ? WorldUtil6.EMPTY : this.list_l.get(0);
   }

   public List<WorldUtil6> getList_l() {
      return this.list_l;
   }

   public void setList_l(List<WorldUtil6> var1) {
      this.list_l = var1;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      int var10000 = MathUtil18.getValue_2();
      super.toggle(var1, var2, var3);
      int var10 = var10000;
      this.dataBuilder15_j.toggle(var6, this.a(var1, var2) && (!this.dataBuilder84_k.isValid_2() || this.dataBuilder84_k.isValid(this)));
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this,
            BreezeContext.authSession_c.getFloat("default.corner-radius") / 2.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("default.layer-one"),
               BreezeContext.authSession_c.getColor("default.hovered"),
               (float)this.dataBuilder15_j.getDouble(var8)
            )
         );
      if (this.dataBuilder84_k.isValid_3(this)) {
         BreezeContext.iRenderer_b
            .fillRoundedRectTwoColor(
               this,
               BreezeContext.authSession_c.getFloat("default.corner-radius") / 2.0F,
               BreezeContext.authSession_c.getFloat("drawer.border-thickness"),
               BreezeContext.authSession_c.getColor("drawer.border")
            );
      }

      WorldUtil6 var11 = this.getEnum16Val();
      if (var11.texture != null) {
         BreezeContext.iRenderer_b
            .drawTextColored(
               "items/" + var11.texture,
               this.a + 10.0F,
               this.b + 10.0F,
               32.0F,
               32.0F,
               BreezeContext.authSession_c.getColor("default.text-secondary")
            );
      }

      ArrayList var12 = new ArrayList();
      int var13 = 1;

      while (var13 < this.list_l.size() && var12.size() < 2) {
         if (this.list_l.get(var13).texture != null) {
            var12.add(this.list_l.get(var13));
         }

         var13++;
         if (var10 == 0) {
            LicenseState.toggle(LicenseState.checkCondition());
            break;
         }
      }

      float var17 = 20.0F;
      int var14 = 0;

      while (var14 < var12.size()) {
         float var15 = this.a + this.c - 2.0F - (var12.size() - var14) * var17;
         float var16 = this.b + this.d - 18.0F - 2.0F;
         BreezeContext.iRenderer_b
            .drawTextColored(
               "items/" + ((WorldUtil6)var12.get(var14)).texture,
               var15,
               var16,
               18.0F,
               18.0F,
               BreezeContext.authSession_c.getColor("default.text-secondary")
            );
         var14++;
         if (var10 == 0) {
            break;
         }
      }
   }

   static {
      long var0 = 136175400732538L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[10];
      int var5 = 0;
      String var6 = " Ûã¨\u0084è\u008b%Qï]\u009fE¾F\u0089CJÀ(í\"¤\u000bNÅ\u009d\u0016\u009aç4\u0086¶x\u000e&\u0089À#³\u0018'\u0002èX¨5f0RÛÌ\u009b\r\u0088\\K\f\u001f³\u008fÂ\u008aj\r03)<#dd\tÈê\u0019/Ú\u0001¹\u001fYLíÝôòp\u0094mSe÷Szã\u0083_ÀÉI\u0007KÍ*¬¡dp\u009a\u009aØ¬d(»h\u009bF\u009cþÂÇC`§\u0010.¡ø¥1»\u009fB\u0089\u001d\u0013øµq®1Ç\"Î^¨AZÅE[©£(¦\u0007æGÏêÁ]¡yÜVÖ\u008e\u0090f¢wU¯(\u0082²P\u009c\bÇ  ÁÏyc\në\u0094¨AµÕ\u0010.\u000bÂ,\u0082êh¡\u0096+Ñ\u0085Å\u0013\"Û\u0010ý\u0096P\u008dÒ£Þ\u001aB\"(\u0011\u0016\n\u0099¥(N£IÓ\u001c\u0014I\u009c\u001a~ÎG¹Ü\u009d\u0081FQ\u0010h\u0015\u000eWUæ\u0007Ö]VíPÛ\u0095ÉÁ\u0010;\u0099£\u0002";
      int var7 = " Ûã¨\u0084è\u008b%Qï]\u009fE¾F\u0089CJÀ(í\"¤\u000bNÅ\u009d\u0016\u009aç4\u0086¶x\u000e&\u0089À#³\u0018'\u0002èX¨5f0RÛÌ\u009b\r\u0088\\K\f\u001f³\u008fÂ\u008aj\r03)<#dd\tÈê\u0019/Ú\u0001¹\u001fYLíÝôòp\u0094mSe÷Szã\u0083_ÀÉI\u0007KÍ*¬¡dp\u009a\u009aØ¬d(»h\u009bF\u009cþÂÇC`§\u0010.¡ø¥1»\u009fB\u0089\u001d\u0013øµq®1Ç\"Î^¨AZÅE[©£(¦\u0007æGÏêÁ]¡yÜVÖ\u008e\u0090f¢wU¯(\u0082²P\u009c\bÇ  ÁÏyc\në\u0094¨AµÕ\u0010.\u000bÂ,\u0082êh¡\u0096+Ñ\u0085Å\u0013\"Û\u0010ý\u0096P\u008dÒ£Þ\u001aB\"(\u0011\u0016\n\u0099¥(N£IÓ\u001c\u0014I\u009c\u001a~ÎG¹Ü\u009d\u0081FQ\u0010h\u0015\u000eWUæ\u0007Ö]VíPÛ\u0095ÉÁ\u0010;\u0099£\u0002"
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
                     CONST_N = var4;
                     CONST_O = new String[10];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var15 = -415925917873565830L;
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
                     CONST_H = (int)var13;
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

                  var6 = "\"~ææÎ\u008ai\u0006 Â\u001a(\u0015\u0098~õ6\u0097$\rß\u0094¿Þ\u0006\u000eA\u0000CÅá\u0099\u0096ë3hqu\".\u0018ðâ¹·B\u0090µY\u0085fÎÃ\u0098¬þ\u008eèV=Å\u0083n+á";
                  var7 = "\"~ææÎ\u008ai\u0006 Â\u001a(\u0015\u0098~õ6\u0097$\rß\u0094¿Þ\u0006\u000eA\u0000CÅá\u0099\u0096ë3hqu\".\u0018ðâ¹·B\u0090µY\u0085fÎÃ\u0098¬þ\u008eèV=Å\u0083n+á"
                     .length();
                  var8 = '(';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1316;
      if (CONST_O[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_P.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_P.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/eb", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_N[var3].getBytes("ISO-8859-1");
         CONST_O[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_O[var3];
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
         throw new RuntimeException("rip/breeze/eb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
