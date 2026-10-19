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

public class ImageUtil8 extends UIPanel {
   private final RenderUtil5 dataBuilder105_h;
   private final UIPanel breezeUtil78_i;
   private final rip.breeze.client.AnimationTimer dataBuilder15_j = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private final rip.breeze.client.AnimationTimer dataBuilder15_k = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private static int[] arr_l;
   private static final String[] CONST_N;
   private static final String[] CONST_O;
   private static final Map CONST_P = new HashMap(13);

   public ImageUtil8(RenderUtil5 var1, UIPanel var2) {
      this.dataBuilder105_h = var1;
      this.breezeUtil78_i = var2;
      this.d = 40.0F;
      var1.calculate_3(var2);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      super.toggle(var1, var2, var3);
      decrypt();
      this.dataBuilder15_j.toggle(var6, this.a(var1, var2));
      this.dataBuilder15_k.toggle(var6, this.dataBuilder105_h.getBreezeUtil78_n() == this.breezeUtil78_i);
      Color var11 = BreezeContext.authSession_c.getColor("default.text-primary");
      Color var12 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("default.accent"),
         BreezeContext.authSession_c.getColor("default.accent"),
         (float)this.dataBuilder15_k.getDouble(var8)
      );
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this,
            9.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("default.layer-one"),
               BreezeContext.authSession_c.getColor("default.hovered"),
               (float)this.dataBuilder15_j.getDouble(var8)
            )
         );
      BreezeContext.iRenderer_b
         .fillGradientRectSimple(
            this.a,
            this.b,
            (float)(9.0 + (this.c - 9.0F) * this.dataBuilder15_k.getDouble(var8)),
            this.d,
            new float[]{9.0F, (float)(9.0 * this.dataBuilder15_k.getDouble(var8)), (float)(9.0 * this.dataBuilder15_k.getDouble(var8)), 9.0F},
            var12
         );
      BreezeContext.iRenderer_b
         .drawText("Info", this.a + 15.0F, this.b + 11.0F, var11, EnumType32.SOURCE_SANS, 18.0F);
      BreezeContext.iRenderer_b
         .drawTextColored("icons/info.png", this.a + this.c - 38.0F, this.b + 8.0F, 26.0F, 26.0F, var11);
      if (LicenseState.checkCondition()) {
         initialize(new int[2]);
      }
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (!this.a(var1, var2)) {
         return false;
      }

      if (var3 != 0 && var3 != 1) {
         return true;
      }

      this.dataBuilder105_h.calculate_3(this.breezeUtil78_i);
      return true;
   }

   public static void initialize(int[] var0) {
      arr_l = var0;
   }

   public static int[] decrypt() {
      return arr_l;
   }

   static {
      initialize(null);
      long var0 = 35057974452707L;
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
      String var6 = "}mhýä\u0018D1\",)\u0099*í<ejÑÊ¹x\u0083\u008dÌ(Êa\u0010\u0017PîT\u0011È\u0007Ð\u0086\u000e£\u008a÷Ó¹T\u0013K½c°Ç\u0015c~°¹Ùûjh\u001aæCi1±(\u0006Qç.Uc¤4×¦3L\u0086*gÇ\u0006ÎIU\u008að\u0086\\}e}U» \u001d\u001aùúv$ùy\u0082\r Êy\u0085Y.\u0013Å\n*ÐB#\u009d¼\f\u009bÎ\u001be\u000eQ\u0086]ø\u0016JÀ\u0089\u00adM7\u0016\u0018\u008d\u0097+,²\u0097-\u0082©w¼94½%f\u009dK-\"aÌ\u0081¦";
      int var7 = "}mhýä\u0018D1\",)\u0099*í<ejÑÊ¹x\u0083\u008dÌ(Êa\u0010\u0017PîT\u0011È\u0007Ð\u0086\u000e£\u008a÷Ó¹T\u0013K½c°Ç\u0015c~°¹Ùûjh\u001aæCi1±(\u0006Qç.Uc¤4×¦3L\u0086*gÇ\u0006ÎIU\u008að\u0086\\}e}U» \u001d\u001aùúv$ùy\u0082\r Êy\u0085Y.\u0013Å\n*ÐB#\u009d¼\f\u009bÎ\u001be\u000eQ\u0086]ø\u0016JÀ\u0089\u00adM7\u0016\u0018\u008d\u0097+,²\u0097-\u0082©w¼94½%f\u009dK-\"aÌ\u0081¦"
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
                     CONST_N = var4;
                     CONST_O = new String[7];
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

                  var6 = "Çl.Ô\u0089sü)õÎ9M¾ZäIÛ\u0014ië\bû\u0081\u0082](¡Ñ\u001cX\u0012\u0092\u0010\u0086\u009d=Û\u0014US9ÿÁ\bG+\u001eêÙ";
                  var7 = "Çl.Ô\u0089sü)õÎ9M¾ZäIÛ\u0014ië\bû\u0081\u0082](¡Ñ\u001cX\u0012\u0092\u0010\u0086\u009d=Û\u0014US9ÿÁ\bG+\u001eêÙ".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15213;
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
            throw new RuntimeException("rip/breeze/es", var10);
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
         throw new RuntimeException("rip/breeze/es" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
