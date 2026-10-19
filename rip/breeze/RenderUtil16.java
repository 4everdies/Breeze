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

public class RenderUtil16 extends UIPanel {
   private final RenderUtil5 dataBuilder105_h;
   private final RenderUtil24 dataBuilder34_i;
   private final rip.breeze.client.AnimationTimer dataBuilder15_j = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private final rip.breeze.client.AnimationTimer dataBuilder15_k = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private static final String[] CONST_M;
   private static final String[] CONST_N;
   private static final Map CONST_O = new HashMap(13);

   public RenderUtil16(RenderUtil5 var1, RenderUtil24 var2) {
      this.dataBuilder105_h = var1;
      this.dataBuilder34_i = var2;
      this.d = 40.0F;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      super.toggle(var1, var2, var3);
      this.dataBuilder15_j.toggle(var6, this.a(var1, var2));
      this.dataBuilder15_k.toggle(var6, this.dataBuilder105_h.getBreezeUtil78_n() == this.dataBuilder34_i);
      Color var10 = BreezeContext.authSession_c.getColor("default.text-primary");
      Color var11 = RenderUtil1.clamp(
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
            var11
         );
      BreezeContext.iRenderer_b
         .drawText("Reviews", this.a + 15.0F, this.b + 11.0F, var10, EnumType32.SOURCE_SANS, 18.0F);
      BreezeContext.iRenderer_b.drawTextAt("reviews", this.a + this.c - 38.0F, this.b + 8.0F, 1.1F, var10);
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (!this.a(var1, var2)) {
         return false;
      }

      if (var3 != 0 && var3 != 1) {
         return true;
      }

      this.dataBuilder105_h.calculate_3(this.dataBuilder34_i);
      return true;
   }

   static {
      long var0 = 68481360059160L;
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
      String var6 = "¥1ðK?°s£\u0094\u0001\u0093·?\u0086^Á\u0018¿¿\tl\u008fµ#\u0013\rý\u009d±\u0010,\rÖ\u008e>Ô¸1\u0013\u008e£\u0018AÈ\u0085ÏPím%\u0095\u0082¥kEgauMYC?üBóg\u0010ïÌY\u00899\u0087E\u0082\u000f×\u0016L\u0002\u0086I¶(\u0012¥ëëñcðÕG=\u0096\u0017¨-~\r\u0012\u0017\u0084Û\\6äº>\u001a\u0096²¡ýsB%û²~?IÏY";
      int var7 = "¥1ðK?°s£\u0094\u0001\u0093·?\u0086^Á\u0018¿¿\tl\u008fµ#\u0013\rý\u009d±\u0010,\rÖ\u008e>Ô¸1\u0013\u008e£\u0018AÈ\u0085ÏPím%\u0095\u0082¥kEgauMYC?üBóg\u0010ïÌY\u00899\u0087E\u0082\u000f×\u0016L\u0002\u0086I¶(\u0012¥ëëñcðÕG=\u0096\u0017¨-~\r\u0012\u0017\u0084Û\\6äº>\u001a\u0096²¡ýsB%û²~?IÏY"
         .length();
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
                     CONST_M = var4;
                     CONST_N = new String[7];
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

                  var6 = "\u008f/Ô$¿~\u009cO?x\u001cãa\u0087æC{K\u00986Ð\u001aFOâi4Þ\u008c2Ð|(È\u000b\u0082ÏgG/£\u0090\tÿ\u008c9²Wf\u0083\u009c--GSÍ\u009fïq(\u0001¹á\u0085§ë\u0097\u0000\u009b÷¾eK";
                  var7 = "\u008f/Ô$¿~\u009cO?x\u001cãa\u0087æC{K\u00986Ð\u001aFOâi4Þ\u008c2Ð|(È\u000b\u0082ÏgG/£\u0090\tÿ\u008c9²Wf\u0083\u009c--GSÍ\u009fïq(\u0001¹á\u0085§ë\u0097\u0000\u009b÷¾eK"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 642;
      if (CONST_N[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_O.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_O.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/et", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_M[var3].getBytes("ISO-8859-1");
         CONST_N[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_N[var3];
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
         throw new RuntimeException("rip/breeze/et" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
