package rip.breeze;

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

public class RenderUtil13_x extends UIPanel {
   private final int fieldInt_h;
   private final rip.breeze.client.AnimationTimer dataBuilder15_i;
   private final ConfigUtil3 dataBuilder36_j;
   private static final String[] CONST_L;
   private static final String[] CONST_M;
   private static final Map CONST_N = new HashMap(13);
   private static final long eka_1;

   public RenderUtil13_x() {
      long var1 = 81508805241541L;
      super();
      this.fieldInt_h = (int)72712200602362L;
      this.dataBuilder15_i = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.dataBuilder36_j = new ConfigUtil3(this);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      super.toggle(var1, var2, var3);
      this.dataBuilder36_j.calculate();
      int[] var10000 = MathUtil8.decrypt();
      this.dataBuilder15_i.toggle(var6, this.a(var1, var2));
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a,
            this.b,
            this.c,
            this.d,
            10.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("default.layer-one"),
               BreezeContext.authSession_c.getColor("default.hovered"),
               (float)this.dataBuilder15_i.getDouble(var8)
            )
         );
      float var10 = 6.0F;
      byte var11 = 3;
      float var12 = (this.d - 18.0F) / 4.0F;
      int var13 = 0;
      int[] var14 = var10000;

      while (var13 < 3) {
         float var15 = this.b + var12 * (var13 + 1) + 6.0F * var13;
         float var16 = this.a + (this.c - 6.0F) / 2.0F;
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               var16,
               var15,
               6.0F,
               6.0F,
               3.0F,
               RenderUtil1.clamp(
                  BreezeContext.authSession_c.getColor("default.text-tertiary"),
                  BreezeContext.authSession_c.getColor("default.text-primary"),
                  (float)this.dataBuilder15_i.getDouble(var8)
               )
            );
         var13++;
         if (var14 != null) {
            break;
         }
      }
   }

   public void initialize() {
      super.toggle_2();
      this.dataBuilder36_j.processAll();
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      if (var4) {
         return false;
      } else if (this.a(var1, var2) && var3 == 0) {
         this.dataBuilder36_j.processAll();
         return true;
      } else {
         return false;
      }
   }

   public void calculate_2() {
      this.dataBuilder36_j.a(this.a + this.c - 200.0F, this.b + this.d + 20.0F, 200.0F, 0.0F);
   }

   static {
      long var0 = 118019187423647L;
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
      String var6 = "\u0005\u0085Ñv3¾d§\u009fc³\u0002QH\u0082¼gà\u0087Ï\bæ%Ç¸$u8!t`?\u009f¸ñéz\u0083\u0016a(!}±f»\u009d£\n\u008e\u009bº=ã\u0019Ö\u0086\u0092¹\u0002$£CkÈÉ\u0093f\u008c\u0001\u0096Ûxk7®\u0003\u008cØ\b\u0098";
      int var7 = "\u0005\u0085Ñv3¾d§\u009fc³\u0002QH\u0082¼gà\u0087Ï\bæ%Ç¸$u8!t`?\u009f¸ñéz\u0083\u0016a(!}±f»\u009d£\n\u008e\u009bº=ã\u0019Ö\u0086\u0092¹\u0002$£CkÈÉ\u0093f\u008c\u0001\u0096Ûxk7®\u0003\u008cØ\b\u0098"
         .length();
      char var8 = '(';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var26;
                  if ((var17 += var8) >= var7) {
                     CONST_L = var4;
                     CONST_M = new String[4];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = -7988016466371896568L;
                     byte[] var15 = var11.doFinal(
                        new byte[]{
                           (byte)(var13 >>> 56),
                           (byte)(var13 >>> 48),
                           (byte)(var13 >>> 40),
                           (byte)(var13 >>> 32),
                           (byte)(var13 >>> 24),
                           (byte)(var13 >>> 16),
                           (byte)(var13 >>> 8),
                           (byte)var13
                        }
                     );
                     long var30 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     72712200602362L = var30;
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var26;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "\u0083ú\u0095f}N-\u001cz»<Ñ S¼ú)a¶¬\u009c\u0085^ÛÑëå9FÏí\u00100ï\u0099Ø÷DçÃ\u0018\u009d\u000fÅó>ê\n\u0080_»¹\u0097DK\u0090\u0086$\u0081ý\u001cOðÔbuuXU¡Rµ\u0082\u0017\u0090;;í\u0092\u0001J";
                  var7 = "\u0083ú\u0095f}N-\u001cz»<Ñ S¼ú)a¶¬\u009c\u0085^ÛÑëå9FÏí\u00100ï\u0099Ø÷DçÃ\u0018\u009d\u000fÅó>ê\n\u0080_»¹\u0097DK\u0090\u0086$\u0081ý\u001cOðÔbuuXU¡Rµ\u0082\u0017\u0090;;í\u0092\u0001J"
                     .length();
                  var8 = ' ';
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12788;
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
            throw new RuntimeException("rip/breeze/eq", var10);
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
         throw new RuntimeException("rip/breeze/eq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
