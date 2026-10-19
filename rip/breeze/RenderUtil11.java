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

public class RenderUtil11 extends UIPanel {
   private static final float CONST_H = 20.0F;
   private static final float CONST_I = 6.0F;
   private final Runnable runnable_j;
   private final rip.breeze.client.AnimationTimer dataBuilder15_k;
   private String string_l;
   private float fieldFloat_m;
   private RenderUtil12 dataBuilder124_n;
   private boolean fieldBool_o;
   private String string_p;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);

   public RenderUtil11(LicenseState var1, String var2, Runnable var3) {
      this(var1, var2, var3, "");
   }

   public RenderUtil11(LicenseState var1, String var2, Runnable var3, String var4) {
      long var5 = 70003132692759L;
      super(var1);
      this.dataBuilder15_k = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.fieldBool_o = false;
      this.string_l = var2;
      this.runnable_j = var3;
      this.fieldFloat_m = BreezeContext.iRenderer_b.measureText(var2, EnumType32.SOURCE_SANS, 18.0F);
      if (!var4.isEmpty()) {
         this.dataBuilder124_n = new RenderUtil12(var4, var1);
      }
   }

   public void calculate(float var1, float var2, float var3) {
      long var4;
      int var10;
      label28: {
         var4 = 27283383647554L;
         long var6 = var4 ^ 22603910165621L;
         long var8 = var4 ^ 46241641281725L;
         super.toggle(var1, var2, var3);
         int var10000 = RenderUtil9.getValue();
         this.dataBuilder15_k.toggle(var6, this.a(var1, var2));
         var10 = var10000;
         if (this.fieldBool_o) {
            BreezeContext.iRenderer_b
               .fillRoundedRectFull(
                  this.a,
                  this.b,
                  this.c,
                  this.d,
                  BreezeContext.authSession_c.getFloat("button.corner-radius"),
                  BreezeContext.authSession_c.getColor("button.background-disabled")
               );
            if (var10 != 0) {
               break label28;
            }
         }

         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.a,
               this.b,
               this.c,
               this.d,
               BreezeContext.authSession_c.getFloat("button.corner-radius"),
               RenderUtil1.clamp(
                  BreezeContext.authSession_c.getColor("button.background"),
                  BreezeContext.authSession_c.getColor("button.background-hovered"),
                  (float)this.dataBuilder15_k.getDouble(var8)
               )
            );
      }

      label22: {
         Color var11 = this.fieldBool_o
            ? BreezeContext.authSession_c.getColor("button.text-disabled")
            : BreezeContext.authSession_c.getColor("button.text");
         if (this.string_p == null) {
            BreezeContext.iRenderer_b
               .drawText(this.string_l, this.a + this.c / 2.0F - this.fieldFloat_m / 2.0F, this.b + this.d / 2.0F - 9.0F, var11, EnumType32.SOURCE_SANS, 18.0F);
            if (var10 != 0) {
               break label22;
            }
         }

         float var12 = this.a + this.c / 2.0F - (26.0F + this.fieldFloat_m) / 2.0F + 20.0F + 6.0F;
         BreezeContext.iRenderer_b.drawTextAt(this.string_p, var12 - 20.0F - 6.0F, this.b + this.d / 2.0F - 10.0F, 0.8333333F, var11);
         BreezeContext.iRenderer_b.drawText(this.string_l, var12, this.b + this.d / 2.0F - 9.0F, var11, EnumType32.SOURCE_SANS, 18.0F);
      }

      if (this.dataBuilder124_n != null) {
         this.dataBuilder124_n.update(var1, var2, var3);
      }
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      if (var4) {
         return false;
      }

      if (this.a(var1, var2) && var3 == 0 && !this.fieldBool_o) {
         if (this.runnable_j != null) {
            this.runnable_j.run();
         }

         return true;
      } else {
         return false;
      }
   }

   public void decrypt(String var1) {
      this.string_l = var1;
      this.fieldFloat_m = BreezeContext.iRenderer_b.measureText(var1, EnumType32.SOURCE_SANS, 18.0F);
   }

   public void setBool_o(boolean var1) {
      this.fieldBool_o = var1;
   }

   public void setString_p(String var1) {
      this.string_p = var1;
   }

   public void processNullable(float var1, float var2, float var3, float var4) {
      long var5 = 102388927128469L;
      super.drawColoredQuad(var1, var2, var3, var4);
      if (this.dataBuilder124_n != null) {
         this.dataBuilder124_n.a(var1, var2, var3, var4);
      }
   }

   static {
      long var0 = 54542855572646L;
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
      String var6 = "Õ\u0016pà¶Û6\u0012au±\u00841Ì\u001c·\u008fík\u0080\u0001«ÈÐt\u0010÷ë×î³\u009d¥\u0096\u0016z¥*\u008bú(ÓZõÏ£\u009bH¸º\u0018<)\u0014Ý\u0014u¸¾]\u0005©h¿úÆ¡\u0089>\u0083ºE\u001dÞWëZtÁ\u001a\u0002 '·èÕ¸\u001f]ÁÖµ\u009dtvºµ`ý¶í\r\u0007PÙCÅÏB\u0092\u008e\u00880\u009d(\u00863\u0002,Zp]±Ö'9y[ÇXS\u0080\u001e\u0090¼ï8sÏE\u0005\u008f9lÈ\u00146\tY+C\u0080\u0014è\u0082(s\u001fÿÓ(y1f\u008f\u00adï\u0097\r$!¯¼K\u001c\u0013Ä/\u0084Õª\u0094+`m1x?á$òþ\rN](";
      int var7 = "Õ\u0016pà¶Û6\u0012au±\u00841Ì\u001c·\u008fík\u0080\u0001«ÈÐt\u0010÷ë×î³\u009d¥\u0096\u0016z¥*\u008bú(ÓZõÏ£\u009bH¸º\u0018<)\u0014Ý\u0014u¸¾]\u0005©h¿úÆ¡\u0089>\u0083ºE\u001dÞWëZtÁ\u001a\u0002 '·èÕ¸\u001f]ÁÖµ\u009dtvºµ`ý¶í\r\u0007PÙCÅÏB\u0092\u008e\u00880\u009d(\u00863\u0002,Zp]±Ö'9y[ÇXS\u0080\u001e\u0090¼ï8sÏE\u0005\u008f9lÈ\u00146\tY+C\u0080\u0014è\u0082(s\u001fÿÓ(y1f\u008f\u00adï\u0097\r$!¯¼K\u001c\u0013Ä/\u0084Õª\u0094+`m1x?á$òþ\rN]("
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
                     CONST_R = var4;
                     CONST_S = new String[7];
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

                  var6 = "»ÿ]¯àì3w \u0092æØÙ\u008eå\u0018\u00016ä7\u009bálÂ%É\u0089\u007f\u000f\u0085Zu´úÿiÇ\u0007ç`\u0097\u0091\u0012´b\u007fO\u00928çfã\u0012¼©>Kà%\u0017Ú\u000f±¬\u0005\u000b\u0088v\nK\u0096\u0089DËéæ\\ìP\u0084N±æ)ñ\u008b×þJ\u008b\u001d\u0006\u0018\t@4Âkµ]#\u009b@x\t";
                  var7 = "»ÿ]¯àì3w \u0092æØÙ\u008eå\u0018\u00016ä7\u009bálÂ%É\u0089\u007f\u000f\u0085Zu´úÿiÇ\u0007ç`\u0097\u0091\u0012´b\u007fO\u00928çfã\u0012¼©>Kà%\u0017Ú\u000f±¬\u0005\u000b\u0088v\nK\u0096\u0089DËéæ\\ìP\u0084N±æ)ñ\u008b×þJ\u008b\u001d\u0006\u0018\t@4Âkµ]#\u009b@x\t"
                     .length();
                  var8 = '0';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8444;
      if (CONST_S[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_T.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_T.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/ek", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_R[var3].getBytes("ISO-8859-1");
         CONST_S[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_S[var3];
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
         throw new RuntimeException("rip/breeze/ek" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
