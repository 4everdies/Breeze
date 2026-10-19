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

public class ImageUtil6 extends UIPanel {
   private final rip.breeze.client.AnimationTimer dataBuilder15_h;
   private boolean fieldBool_i;
   private static boolean fieldBool_j;
   private static final String[] CONST_L;
   private static final String[] CONST_M;
   private static final Map CONST_N = new HashMap(13);

   public ImageUtil6(boolean var1) {
      this.fieldBool_i = var1;
      this.dataBuilder15_h = new rip.breeze.client.AnimationTimer(200.0F, var1, EnumType3.BACK_IN_OUT);
      this.c = this.d / 3.0F * 4.0F;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 46241641281725L;
      int var10000 = RenderUtil9.getValue_2();
      super.toggle(var1, var2, var3);
      Color var8 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("boolean.false"),
         BreezeContext.authSession_c.getColor("boolean.true"),
         (float)this.dataBuilder15_h.getDouble(var6)
      );
      int var9 = var10000;
      if (!BreezeContext.authSession_c.isValid("boolean.rounded-design")) {
         BreezeContext.iRenderer_b.fillRoundedRectFull(this.a, this.b + this.d / 2.0F - 5.0F, this.c, 10.0F, 3.0F, var8);
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               (float)(this.a + (this.c - 8.0F) * this.dataBuilder15_h.getDouble(var6)),
               this.b + 4.0F,
               8.0F,
               this.d - 8.0F,
               3.0F,
               BreezeContext.authSession_c.getColor("boolean.knob")
            );
         if (var9 == 0) {
            return;
         }
      }

      float var10 = (this.d - 10.0F) / 2.0F - 3.0F;
      BreezeContext.iRenderer_b.fillRoundedRectFull(this.a, this.b + 5.0F, this.c, this.d - 10.0F, (this.d - 10.0F) / 2.0F, var8);
      BreezeContext.iRenderer_b
         .fillCircle(
            (float)(this.a + var10 + 4.0F + this.dataBuilder15_h.getDouble(var6) * (this.c - var10 * 2.0F - 8.0F)),
            this.b + this.d / 2.0F,
            var10,
            BreezeContext.authSession_c.getColor("boolean.knob")
         );
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.a(var1, var2)) {
         this.checkCondition_2();
         return true;
      } else {
         return super.isValid(var1, var2, var3);
      }
   }

   public boolean checkCondition_2() {
      long var1 = 106580893676245L;
      long var3 = var1 ^ 119510789290978L;
      this.fieldBool_i = !this.fieldBool_i;
      this.dataBuilder15_h.toggle(var3, this.fieldBool_i);
      return this.fieldBool_i;
   }

   public void decrypt(boolean var1) {
      long var2 = 20076281771273L;
      long var4 = var2 ^ 33109194996798L;
      this.fieldBool_i = var1;
      this.dataBuilder15_h.toggle(var4, var1);
   }

   public boolean isBool_i() {
      return this.fieldBool_i;
   }

   public void calculate_2() {
      super.noOp_2();
      this.c = this.d / 3.0F * 4.0F;
   }

   public static void toggle(boolean var0) {
      fieldBool_j = var0;
   }

   public static boolean isValid() {
      return fieldBool_j;
   }

   public static boolean checkCondition_3() {
      boolean var0 = isValid();
      return !var0;
   }

   static {
      toggle(false);
      long var0 = 62752119823938L;
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
      String var6 = "Bu/O\u0003\u008c\u009c¡òÙi»\u001d\u008aKÔ\u007f°§/S\u0090ß\u0099=Þ±óW7ÂÈ r\u0019\u0013Ä\u009dÓ1\u0015\u001dCD\u001f»ùmë\u0013NV.»õ\n\u001dÕ!%pô®£{ Ü¤\u000b\u009a\u0004uÑ²\u0019ÓlÀ)\u0019.BH\u008f\u0012ô¿l\u0097ô\u001b¢¡vÅ\u0010\u001b¥";
      int var7 = "Bu/O\u0003\u008c\u009c¡òÙi»\u001d\u008aKÔ\u007f°§/S\u0090ß\u0099=Þ±óW7ÂÈ r\u0019\u0013Ä\u009dÓ1\u0015\u001dCD\u001f»ùmë\u0013NV.»õ\n\u001dÕ!%pô®£{ Ü¤\u000b\u009a\u0004uÑ²\u0019ÓlÀ)\u0019.BH\u008f\u0012ô¿l\u0097ô\u001b¢¡vÅ\u0010\u001b¥"
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
                     CONST_L = var4;
                     CONST_M = new String[5];
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

                  var6 = "òõE\u001b.jç¦°\u0003N\u0011º7EZ/Cy±,)½cCâ'¨#\u0082FR(o\u001bÊüÔFÒjÀÜ\fÖ\u0097¦æìwÈùö\u0088¬\f\u0001\u000fcÝVG\u0095õ\u0092´Ü\u0084\u0002×ÎGð";
                  var7 = "òõE\u001b.jç¦°\u0003N\u0011º7EZ/Cy±,)½cCâ'¨#\u0082FR(o\u001bÊüÔFÒjÀÜ\fÖ\u0097¦æìwÈùö\u0088¬\f\u0001\u000fcÝVG\u0095õ\u0092´Ü\u0084\u0002×ÎGð"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12352;
      if (CONST_M[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_N.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_N.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/eh", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_L[var3].getBytes("ISO-8859-1");
         CONST_M[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_M[var3];
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
         throw new RuntimeException("rip/breeze/eh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
