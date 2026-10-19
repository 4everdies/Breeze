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

public final class ImageUtil27 extends RenderUtil43<Boolean> {
   private final rip.breeze.client.AnimationTimer dataBuilder15_n;
   private static final int CONST_O;
   private static final String[] CONST_Q;
   private static final String[] CONST_R;
   private static final Map CONST_S = new HashMap(13);

   public ImageUtil27(GenericSetting<Boolean> var1) {
      super(var1);
      this.dataBuilder15_n = new rip.breeze.client.AnimationTimer(200.0F, (Boolean)var1.getObject_m(), EnumType3.BACK_IN_OUT);
   }

   @Override
   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      String var10000 = RenderUtil43.getString();
      super.calculate(var1, var2, var3);
      String var10 = var10000;
      this.dataBuilder15_n.toggle(var6, (Boolean)this.k().getObject_m());
      Color var11 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("boolean.false"),
         BreezeContext.authSession_c.getColor("boolean.true"),
         (float)this.dataBuilder15_n.getDouble(var8)
      );
      if (!BreezeContext.authSession_c.isValid("boolean.rounded-design")) {
         BreezeContext.iRenderer_b.fillRoundedRectFull(this.a + this.c - 55.0F, this.b + 15.0F, 40.0F, 11.0F, 3.0F, var11);
         BreezeContext.iRenderer_b
            .fillRoundedRectFull((float)(this.a + this.c - 56.0F + 34.0 * this.dataBuilder15_n.getDouble(var8)), this.b + 9.0F, 8.0F, 23.0F, 3.0F, Color.WHITE);
         if (var10 == null) {
            return;
         }
      }

      BreezeContext.iRenderer_b.fillRoundedRectFull(this.a + this.c - 70.0F, this.b + 5.0F, 60.0F, 35.0F, 16.0F, var11);
      BreezeContext.iRenderer_b
         .fillCircle(
            (float)(this.a + this.c - 75.0F + 22.5F + this.dataBuilder15_n.getDouble(var8) * 25.0),
            this.b + 22.5F,
            12.5F,
            BreezeContext.authSession_c.getColor("boolean.knob")
         );
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.a(var1, var2) && !this.k.fieldBool_k) {
         this.k().processNullable_2();
      }

      return false;
   }

   public void decrypt(float var1, float var2, float var3, float var4) {
      super.calculate_3(var1, var2, var3, 45.0F);
   }

   public boolean checkCondition_2(float var1) {
      long var2 = 69880200093113L;
      return BreezeContext.iKeybindSettings_e.isToggle()
         ? true
         : 180.0F + BreezeContext.iRenderer_b.measureText("name", EnumType32.SOURCE_SANS, 22.0F) > var1;
   }

   static {
      long var0 = 80147613521621L;
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
      String var6 = "\u0081Ø\r\u000bâùWt\u0098\u008d\u0004B\u001b\u001c\u0013\u0097 µön¤ÍÎ \u0001Xì\u0001VH½\u009f\t\u0019m\u008a\n³\u00842V\u0082f\u0082?\u000f(éÃ ô©Ï\u0017 :gÎ\u008eU\u0016v®¹f\u000f¿.ðiIÎ¸\u001a\u0019Ás\u001bd\u0006 %";
      int var7 = "\u0081Ø\r\u000bâùWt\u0098\u008d\u0004B\u001b\u001c\u0013\u0097 µön¤ÍÎ \u0001Xì\u0001VH½\u009f\t\u0019m\u008a\n³\u00842V\u0082f\u0082?\u000f(éÃ ô©Ï\u0017 :gÎ\u008eU\u0016v®¹f\u000f¿.ðiIÎ¸\u001a\u0019Ás\u001bd\u0006 %"
         .length();
      char var8 = 16;
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
                     CONST_Q = var4;
                     CONST_R = new String[5];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var15 = 4830337497131578471L;
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
                     CONST_O = (int)var13;
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

                  var6 = ":§Éù8%ã·JÍì\u0085ºv\u000bßw.\u0000lK\u0088±B\u0094(\f\u001c\u0011\"¥\u0019('=¿N¿\u0082\u0085»ûoU0®J2X6Ó¼nÔ\u000eªÈÍ\tnó_\u008aVQ\t<(\u000f`\u0001bù";
                  var7 = ":§Éù8%ã·JÍì\u0085ºv\u000bßw.\u0000lK\u0088±B\u0094(\f\u001c\u0011\"¥\u0019('=¿N¿\u0082\u0085»ûoU0®J2X6Ó¼nÔ\u000eªÈÍ\tnó_\u008aVQ\t<(\u000f`\u0001bù"
                     .length();
                  var8 = ' ';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14571;
      if (CONST_R[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_S.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_S.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dO", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Q[var3].getBytes("ISO-8859-1");
         CONST_R[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_R[var3];
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
         throw new RuntimeException("rip/breeze/dO" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
