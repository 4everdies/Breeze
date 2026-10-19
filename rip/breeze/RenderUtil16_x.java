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

public final class RenderUtil16_x extends RenderUtil43<Boolean> {
   private static final float CONST_N;
   private static final float CONST_O;
   private static final int CONST_P;
   private final rip.breeze.client.AnimationTimer dataBuilder15_q = new rip.breeze.client.AnimationTimer(300.0F, false, EnumType3.CUBIC_IN_OUT);
   private LicenseState licenseState_r = new LicenseState();
   private static final String[] CONST_T;
   private static final String[] CONST_U;
   private static final Map CONST_V = new HashMap(13);

   public RenderUtil16_x(GenericSetting<Boolean> var1) {
      super(var1);
   }

   @Override
   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 85972512685926L;
      long var10 = var4 ^ 46241641281725L;
      this.f = true;
      this.j().toggle(var6, this.licenseState_r.isValid(var1, var2));
      this.dataBuilder15_q.toggle(var6, (Boolean)this.k().getObject_m());
      Color var12 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("switch-button.background"),
         BreezeContext.authSession_c.getColor("switch-button.background-hover"),
         (float)this.j().getDouble(var10)
      );
      BreezeContext.iRenderer_b
         .strokeRoundedRect(this.licenseState_r, BreezeContext.authSession_c.getFloat("switch-button.corner-radius"), var12);
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            (float)(this.licenseState_r.fieldFloat_a + this.licenseState_r.fieldFloat_c / 2.0F * this.dataBuilder15_q.getDouble(var10)),
            this.licenseState_r.fieldFloat_b,
            this.licenseState_r.fieldFloat_c / 2.0F,
            this.licenseState_r.fieldFloat_d,
            BreezeContext.authSession_c.getFloat("switch-button.corner-radius"),
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("switch-button.selected"),
               BreezeContext.authSession_c.getColor("switch-button.hovered"),
               (float)this.j().getDouble(var10)
            )
         );
      BreezeContext.iRenderer_b
         .drawText(
            "Toggle",
            this.licenseState_r.fieldFloat_a + this.licenseState_r.fieldFloat_c / 4.0F - CONST_O / 2.0F,
            this.licenseState_r.fieldFloat_b + 7.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("switch-button.text-selected"),
               BreezeContext.authSession_c.getColor("switch-button.text-not-selected"),
               (float)this.dataBuilder15_q.calculateDouble(var8)
            ),
            EnumType32.SOURCE_SANS,
            22.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            "Hold",
            this.licenseState_r.fieldFloat_a + this.licenseState_r.fieldFloat_c / 4.0F * 3.0F - CONST_N / 2.0F,
            this.licenseState_r.fieldFloat_b + 7.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("switch-button.text-not-selected"),
               BreezeContext.authSession_c.getColor("switch-button.text-selected"),
               (float)this.dataBuilder15_q.calculateDouble(var8)
            ),
            EnumType32.SOURCE_SANS,
            22.0F
         );
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.licenseState_r.isValid(var1, var2) && var3 == 0 && !this.k.fieldBool_k) {
         this.k().processAll(!(Boolean)this.k().getObject_m());
         return true;
      } else {
         return false;
      }
   }

   public void calculate_2(float var1, float var2, float var3, float var4) {
      super.calculate_3(var1, var2, var3, 45.0F);
      this.licenseState_r = new LicenseState((int)var1 + 10, (int)var2 + 5, (int)var3 - 20, 35.0F);
   }

   public boolean isValid(float var1) {
      long var2 = 69880200093113L;
      return var1 < 200.0F;
   }

   static {
      long var0 = 20039341934566L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[14];
      int var5 = 0;
      String var6 = "Ú\u0098Àö\"\\);¿\u0001¯ØQð\u0001ÁÑxRì`TD\\\u000f¡ÇéYàÚd6f#gB\\p\u00adOyÇä©\u008aqÚË\u0016¢\u0003\u000f2aõ0EZ5\u0000F:ANk²?N\u0013g\u008e\u0013P÷)(A\u0011ê\u0085N-ø\u008fý\u0018L2öe±×òù§\u0017\t\u008eàBd^¬\u007f0\u0080b®ÀúÑ\u0086\u008d~=õ6±\u000e\u009aà8{íÜÌ\u0084z®î\u000f1ÆL\u0099\u0018\u008c\u007fc\u0097¿¤\u0004\u001a¹¸å\fz40Gü\u0010\u009féÈ\u009e\u009d*lôQÿô\u008b¹Ý\u0012[(J\u009dÂ\u007f]<\u000e·\u0017\nðv\u001dn\u0019¸\tÆÆ\u0001ÏºÍH1\u0087\u0002?\u000edßõÖ\u001f\u0004î\u0099'\u008e±0Fêû\bù[4Àê¬º\u0081\u0017\u0095<\u001c{Å}\u009c\u0012\u0085<\fâ¢\u008c\u009e\u000b.\u0095ÌÁéô÷\u0094môÁÃéç\u00966E×Ñ0[ÒðM=\u0001Í¦Ó\tëÆ*\u0080òT\u000bU\u0006Êõ¯}\u0085£\u008dÀ-ÓñH/\u0018ËpÑVÄ\u0013H\u0011\u0085\r2ý¯\u0096\u001a\u0010ÒFá~_\u0097Å ið(±\u008e³\u009f\u008383íÆgQ$ÄÓ\f°\u008cÄ\u0003(\u0083¬Å(\u0093±Gà\u001b\u0012fh\u00862J3_<\u0082I_ß\u009d\u001ef\u0000\u00adË£(\u0095dÀQ\u0011th:óû\u0088\u001d0>\u008d7V\u0018qS\u0019åÄûÈ¼:ÒjÜ:Ug·})`¸\u000f\n\u001eæ\u0007àbM?£º\u0099ÖmÀñ\u0090Ñ \u001fÏÙ\t8\u0018&í\rÿL\u0003&\u00125\u0005G\u000b\u0082\u0017Ð\u009e$\u0095Ê¥\u0011= \u0010pï\u0085Ç\u0005n\u0014Êh\u0011A\u000bp¤×yý«LMþ7>lÆ½T\u0004gê\u000b\u00101\bH°¿î\u009d\u0001ã@\u0017G·\u001düý";
      int var7 = "Ú\u0098Àö\"\\);¿\u0001¯ØQð\u0001ÁÑxRì`TD\\\u000f¡ÇéYàÚd6f#gB\\p\u00adOyÇä©\u008aqÚË\u0016¢\u0003\u000f2aõ0EZ5\u0000F:ANk²?N\u0013g\u008e\u0013P÷)(A\u0011ê\u0085N-ø\u008fý\u0018L2öe±×òù§\u0017\t\u008eàBd^¬\u007f0\u0080b®ÀúÑ\u0086\u008d~=õ6±\u000e\u009aà8{íÜÌ\u0084z®î\u000f1ÆL\u0099\u0018\u008c\u007fc\u0097¿¤\u0004\u001a¹¸å\fz40Gü\u0010\u009féÈ\u009e\u009d*lôQÿô\u008b¹Ý\u0012[(J\u009dÂ\u007f]<\u000e·\u0017\nðv\u001dn\u0019¸\tÆÆ\u0001ÏºÍH1\u0087\u0002?\u000edßõÖ\u001f\u0004î\u0099'\u008e±0Fêû\bù[4Àê¬º\u0081\u0017\u0095<\u001c{Å}\u009c\u0012\u0085<\fâ¢\u008c\u009e\u000b.\u0095ÌÁéô÷\u0094môÁÃéç\u00966E×Ñ0[ÒðM=\u0001Í¦Ó\tëÆ*\u0080òT\u000bU\u0006Êõ¯}\u0085£\u008dÀ-ÓñH/\u0018ËpÑVÄ\u0013H\u0011\u0085\r2ý¯\u0096\u001a\u0010ÒFá~_\u0097Å ið(±\u008e³\u009f\u008383íÆgQ$ÄÓ\f°\u008cÄ\u0003(\u0083¬Å(\u0093±Gà\u001b\u0012fh\u00862J3_<\u0082I_ß\u009d\u001ef\u0000\u00adË£(\u0095dÀQ\u0011th:óû\u0088\u001d0>\u008d7V\u0018qS\u0019åÄûÈ¼:ÒjÜ:Ug·})`¸\u000f\n\u001eæ\u0007àbM?£º\u0099ÖmÀñ\u0090Ñ \u001fÏÙ\t8\u0018&í\rÿL\u0003&\u00125\u0005G\u000b\u0082\u0017Ð\u009e$\u0095Ê¥\u0011= \u0010pï\u0085Ç\u0005n\u0014Êh\u0011A\u000bp¤×yý«LMþ7>lÆ½T\u0004gê\u000b\u00101\bH°¿î\u009d\u0001ã@\u0017G·\u001düý"
         .length();
      char var8 = '8';
      int var19 = -1;

      label37:
      while (true) {
         String var20 = var6.substring(++var19, var19 + var8);
         short var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var20.getBytes("ISO-8859-1"));
            String var30 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var30;
                  if ((var19 += var8) >= var7) {
                     CONST_T = var4;
                     CONST_U = new String[14];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var15 = -8165579546026450956L;
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
                     long var34 = (var17[0] & 255L) << 56
                        | (var17[1] & 255L) << 48
                        | (var17[2] & 255L) << 40
                        | (var17[3] & 255L) << 32
                        | (var17[4] & 255L) << 24
                        | (var17[5] & 255L) << 16
                        | (var17[6] & 255L) << 8
                        | var17[7] & 255L;
                     var10001 = (byte)-1;
                     long var13 = var34;
                     CONST_P = (int)var13;
                     var10001 = 22833;
                     long var35 = 869834616818088351L ^ var0;
                     CONST_N = BreezeContext.iRenderer_b.measureText("Hold", EnumType32.SOURCE_SANS, 22.0F);
                     var10001 = 22136;
                     long var36 = 6670866729027385053L ^ var0;
                     CONST_O = BreezeContext.iRenderer_b.measureText("Toggle", EnumType32.SOURCE_SANS, 22.0F);
                     return;
                  }

                  var8 = var6.charAt(var19);
                  break;
               default:
                  var4[var5++] = var30;
                  if ((var19 += var8) < var7) {
                     var8 = var6.charAt(var19);
                     continue label37;
                  }

                  var6 = "ô{&$PA\u0087Á%Ð´ý\u001dÞv\u0014(\\îÓZ8)©\u008d\u0092\u0003õ\u0013(\u0089Ç8\u0002\u0096\u0006v\u0080Ä\b\u0012iG!\r[\u0018e÷ã\u00964#ÓÆ\u0015v";
                  var7 = "ô{&$PA\u0087Á%Ð´ý\u001dÞv\u0014(\\îÓZ8)©\u008d\u0092\u0003õ\u0013(\u0089Ç8\u0002\u0096\u0006v\u0080Ä\b\u0012iG!\r[\u0018e÷ã\u00964#ÓÆ\u0015v"
                     .length();
                  var8 = 16;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26447;
      if (CONST_U[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_V.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_V.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dQ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_T[var3].getBytes("ISO-8859-1");
         CONST_U[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_U[var3];
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
         throw new RuntimeException("rip/breeze/dQ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
