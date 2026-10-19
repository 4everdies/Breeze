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

public final class RenderUtil12 extends UIPanel {
   private final rip.breeze.client.AnimationTimer dataBuilder15_h = new rip.breeze.client.AnimationTimer(300.0F, false, EnumType3.LINEAR);
   private final Util133 dataBuilder112_i = new Util133();
   private final Util133 dataBuilder112_j = new Util133();
   private float fieldFloat_k = 5.0F;
   private float fieldFloat_l = -1.0F;
   private float fieldFloat_m = -1.0F;
   private AimYawMode3 aimYawMode3_n = AimYawMode3.TOP;
   private String[] arr_o;
   private static LicenseState[] arr_p;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);
   private static final long[] CONST_U;
   private static final Long[] CONST_V;
   private static final Map CONST_W;

   public RenderUtil12(String[] var1, LicenseState var2) {
      super(var2);
      this.arr_o = var1;
   }

   public RenderUtil12(String var1, LicenseState var2) {
      this(var1.split("\n"), var2);
      this.dataBuilder112_i.getDataBuilder112();
   }

   public RenderUtil12(String var1, LicenseState var2, AimYawMode3 var3) {
      this(new String[]{var1}, var2);
      this.aimYawMode3_n = var3;
   }

   public void initialize(String var1) {
      this.arr_o = var1.split("\n");
   }

   public void initialize() {
      long var1 = 67137573248254L;
      long var3 = var1 ^ 54224589067721L;
      super.toggle_2();
      this.dataBuilder15_h.toggle(var3, false);
      this.dataBuilder112_i.getDataBuilder112();
      this.dataBuilder112_j.getDataBuilder112();
   }

   public void update(float var1, float var2, float var3) {
      long var4;
      long var6;
      long var8;
      label32: {
         var4 = 27283383647554L;
         var6 = var4 ^ 22603910165621L;
         var8 = var4 ^ 85972512685926L;
         int var10000 = RenderUtil9.getValue_2();
         super.toggle(var1, var2, var3);
         int var10 = var10000;
         if (!this.a(var1, var2)) {
            this.dataBuilder15_h.toggle(var6, false);
            this.dataBuilder112_i.getDataBuilder112();
            this.initialize_2();
            if (var10 == 0) {
               break label32;
            }
         }

         if (this.calcDistance(var1, var2)) {
            this.dataBuilder15_h.toggle(var6, false);
            this.dataBuilder112_i.getDataBuilder112();
            this.initialize_2();
         }

         this.dataBuilder112_j.getDataBuilder112();
      }

      if (this.dataBuilder112_i.isValid(300L) || this.dataBuilder15_h.calculateDouble(var8) != 0.0) {
         if (this.dataBuilder112_j.isValid(500L)) {
            this.dataBuilder15_h.toggle(var6, false);
         }

         if (this.dataBuilder112_i.isValid(300L)) {
            this.dataBuilder15_h.toggle(var6, true);
         }

         BreezeContext.guiPanelSettings_f.initialize(this::clamp);
      }
   }

   private void initialize_2() {
      this.fieldFloat_l = -1.0F;
      this.fieldFloat_m = -1.0F;
   }

   private boolean calcDistance(float var1, float var2) {
      long var3 = 128870136338595L;
      if (this.fieldFloat_l < 0.0F || this.fieldFloat_m < 0.0F) {
         this.fieldFloat_l = var1;
         this.fieldFloat_m = var2;
      }

      float var5 = var1 - this.fieldFloat_l;
      float var6 = var2 - this.fieldFloat_m;
      float var7 = (float)Math.sqrt(var5 * var5 + var6 * var6);
      this.fieldFloat_l = var1;
      this.fieldFloat_m = var2;
      return var7 > this.fieldFloat_k;
   }

   private void clamp() {
      long var1 = 45540519378070L;
      long var3 = var1 ^ 140232209809074L;
      Color var5 = RenderUtil1.getColor_7(
         BreezeContext.authSession_c.getColor("tooltip.background"), (int)(255.0 * this.dataBuilder15_h.calculateDouble(var3))
      );
      Color var6 = RenderUtil1.getColor_7(
         BreezeContext.authSession_c.getColor("tooltip.text"), (int)(255.0 * this.dataBuilder15_h.calculateDouble(var3))
      );
      int var10000 = RenderUtil9.getValue();
      float var7 = BreezeContext.authSession_c.getFloat("tooltip.corner-radius");
      int var8 = var10000;
      int var9 = 0;

      for (String var13 : this.arr_o) {
         var9 = Math.max(var9, (int)BreezeContext.iRenderer_b.measureTextHeight(var13, EnumType32.SOURCE_SANS, 16.0F) + 20);
         if (var8 == 0) {
            break;
         }
      }

      float var14;
      label73: {
         var14 = this.arr_o.length * 20 + 10;
         switch (Util5.CONST_A[this.aimYawMode3_n.ordinal()]) {
            case 1:
               BreezeContext.iRenderer_b.fillRoundedRectFull(this.a + this.c / 2.0F - var9 / 2.0F, this.b - var14 - 7.0F, var9, var14, var7, var5);
               BreezeContext.iRenderer_b
                  .fillRoundedRectColor(
                     this.a + this.c / 2.0F - 7.0F, this.b - 8.0F, this.a + this.c / 2.0F, this.b, this.a + this.c / 2.0F + 7.0F, this.b - 8.0F, var5
                  );
               int var15 = 0;

               while (var15 < this.arr_o.length) {
                  BreezeContext.iRenderer_b
                     .drawTextCentered(
                        this.arr_o[var15],
                        this.a + this.c / 2.0F - var9 / 2.0F + 10.0F,
                        this.b - var14 + 2.0F + var15 * 20,
                        var6,
                        EnumType32.SOURCE_SANS,
                        16.0F
                     );
                  var15++;
                  if (var8 == 0) {
                     break;
                  }
               }

               if (var8 != 0) {
                  return;
               }
            case 2:
               BreezeContext.iRenderer_b.fillRoundedRectFull(this.a + this.c / 2.0F - var9 / 2.0F, this.b + var14 + 7.0F, var9, var14, var7, var5);
               BreezeContext.iRenderer_b
                  .fillRoundedRectColor(
                     this.a + this.c / 2.0F - 7.0F,
                     this.b + var14 + 8.0F,
                     this.a + this.c / 2.0F + 7.0F,
                     this.b + var14 + 8.0F,
                     this.a + this.c / 2.0F,
                     this.b + var14,
                     var5
                  );
               int var16 = 0;

               while (var16 < this.arr_o.length) {
                  BreezeContext.iRenderer_b
                     .drawTextCentered(
                        this.arr_o[var16],
                        this.a + this.c / 2.0F - var9 / 2.0F + 10.0F,
                        this.b + var14 + 15.0F + var16 * 20,
                        var6,
                        EnumType32.SOURCE_SANS,
                        16.0F
                     );
                  var16++;
                  if (var8 == 0) {
                     break;
                  }
               }

               if (var8 != 0) {
                  return;
               }
            case 3:
               break;
            case 4:
               break label73;
            default:
               return;
         }

         BreezeContext.iRenderer_b.fillRoundedRectFull(this.a - var9 - 6.0F, this.b + var14 / 2.0F - var14 / 2.0F, var9, var14, var7, var5);
         BreezeContext.iRenderer_b
            .fillRoundedRectColor(this.a, this.b + var14 / 2.0F, this.a - 6.0F, this.b + var14 / 2.0F - 6.0F, this.a - 6.0F, this.b + var14 / 2.0F + 6.0F, var5);
         int var17 = 0;

         while (var17 < this.arr_o.length) {
            BreezeContext.iRenderer_b
               .drawTextCentered(
                  this.arr_o[var17], this.a - var9 + 6.0F, this.b + var14 / 2.0F - var14 / 2.0F + 9.0F + var17 * 20, var6, EnumType32.SOURCE_SANS, 16.0F
               );
            var17++;
            if (var8 == 0) {
               break;
            }
         }

         if (var8 != 0) {
            return;
         }
      }

      BreezeContext.iRenderer_b.fillRoundedRectFull(this.a + this.c + 7.0F, this.b + var14 / 2.0F - var14 / 2.0F, var9, var14, var7, var5);
      BreezeContext.iRenderer_b
         .fillRoundedRectColor(
            this.a + this.c + 8.0F,
            this.b + var14 / 2.0F - 7.0F,
            this.a + this.c,
            this.b + var14 / 2.0F,
            this.a + this.c + 8.0F,
            this.b + var14 / 2.0F + 7.0F,
            var5
         );
      int var18 = 0;

      while (var18 < this.arr_o.length) {
         BreezeContext.iRenderer_b
            .drawTextCentered(
               this.arr_o[var18], this.a + this.c + 17.0F, this.b + var14 / 2.0F - var14 / 2.0F + 9.0F + var18 * 20, var6, EnumType32.SOURCE_SANS, 16.0F
            );
         var18++;
         if (var8 == 0) {
            break;
         }
      }
   }

   public static void initialize_3(LicenseState[] var0) {
      arr_p = var0;
   }

   public static LicenseState[] decrypt() {
      return arr_p;
   }

   static {
      LicenseState[] var10000 = new LicenseState[1];
      long var0 = 113471622897821L;
      initialize_3(var10000);
      Cipher var2;
      Cipher var23 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var23.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "qú\u0087²}fð/Î\u0091oò}\u001c§ü\u009cÿG8q0ù\u0086ß4\u0017ÃëÐçG\r,\u0093sJ\u007fù/0\r¶e|bmo\u0092Í\u00134¼\u001e\u0016ìª\fºd\u0017ÀÁD\u0004\u0000q\bÅæØÔ|fþ\u0000½ §dÉ£á±\u0082'Ç1\u001e \u008a\u0097Î\u0007ÇÃë:ñJSOI!zãµNç»¸\u009aý\u0017MqÀx«\u009fw\u001e";
      int var7 = "qú\u0087²}fð/Î\u0091oò}\u001c§ü\u009cÿG8q0ù\u0086ß4\u0017ÃëÐçG\r,\u0093sJ\u007fù/0\r¶e|bmo\u0092Í\u00134¼\u001e\u0016ìª\fºd\u0017ÀÁD\u0004\u0000q\bÅæØÔ|fþ\u0000½ §dÉ£á±\u0082'Ç1\u001e \u008a\u0097Î\u0007ÇÃë:ñJSOI!zãµNç»¸\u009aý\u0017MqÀx«\u009fw\u001e"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var28 = buildString(var10).intern();
         int var10001 = -1;
         var4[var5++] = var28;
         if ((var9 += var8) >= var7) {
            CONST_R = var4;
            CONST_S = new String[3];
            CONST_W = new HashMap(13);
            Cipher var11;
            Cipher var24 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var12 = 1; var12 < 8; var12++) {
               var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
            }

            var24.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var13 = new long[3];
            int var14 = 0;
            String var15 = "Ë¸\u0017\u0011\u0001º4\u008dh{ïF\u0017ºø\u001fH\u0012\u0086oÃ\t¿î";
            int var16 = "Ë¸\u0017\u0011\u0001º4\u008dh{ïF\u0017ºø\u001fH\u0012\u0086oÃ\t¿î".length();
            byte var17 = 0;

            do {
               var10001 = var17;
               var17 += 8;
               byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
               var10001 = var14++;
               long var19 = (var18[0] & 255L) << 56
                  | (var18[1] & 255L) << 48
                  | (var18[2] & 255L) << 40
                  | (var18[3] & 255L) << 32
                  | (var18[4] & 255L) << 24
                  | (var18[5] & 255L) << 16
                  | (var18[6] & 255L) << 8
                  | var18[7] & 255L;
               byte[] var21 = var11.doFinal(
                  new byte[]{
                     (byte)(var19 >>> 56),
                     (byte)(var19 >>> 48),
                     (byte)(var19 >>> 40),
                     (byte)(var19 >>> 32),
                     (byte)(var19 >>> 24),
                     (byte)(var19 >>> 16),
                     (byte)(var19 >>> 8),
                     (byte)var19
                  }
               );
               long var10004 = (var21[0] & 255L) << 56
                  | (var21[1] & 255L) << 48
                  | (var21[2] & 255L) << 40
                  | (var21[3] & 255L) << 32
                  | (var21[4] & 255L) << 24
                  | (var21[5] & 255L) << 16
                  | (var21[6] & 255L) << 8
                  | var21[7] & 255L;
               byte var32 = -1;
               var13[var10001] = var10004;
            } while (var17 < var16);

            CONST_U = var13;
            CONST_V = new Long[3];
            return;
         }

         var8 = var6.charAt(var9);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17344;
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
            throw new RuntimeException("rip/breeze/el", var10);
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
         throw new RuntimeException("rip/breeze/el" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6021;
      if (CONST_V[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_U[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_W.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_W.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/el", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_V[var3] = var14;
      }

      return CONST_V[var3];
   }

   private static long getLong(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = decrypt(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getLong".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/el" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
