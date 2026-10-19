package rip.breeze;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.EnumType3;

public final class ImageUtil30<T extends Enum<T>> extends RenderUtil43<T> {
   private final RenderUtil38<T> dataBuilder60_n;
   private final rip.breeze.client.AnimationTimer dataBuilder15_o;
   private final rip.breeze.client.AnimationTimer dataBuilder15_p;
   private LicenseState licenseState_q;
   private LicenseState licenseState_r;
   private final float fieldFloat_s;
   private static final int CONST_T;
   private static final String[] CONST_V;
   private static final String[] CONST_W;
   private static final Map CONST_X = new HashMap(13);

   public ImageUtil30(GenericSetting<?> var1) {
      long var2 = 124831696538079L;
      super(var1);
      this.dataBuilder15_o = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.BACK_OUT);
      this.dataBuilder15_p = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.licenseState_q = new LicenseState();
      this.licenseState_r = new LicenseState();
      String var10000 = RenderUtil39.getString();
      ArrayList var4 = new ArrayList();
      String var5 = var10000;
      Enum[] var6 = this.k.object_d.getDeclaringClass().getEnumConstants();
      float var7 = 0.0F;

      for (Enum var11 : var6) {
         var7 = Math.max(var7, BreezeContext.iRenderer_b.measureText(RenderUtil27.CONST_G.apply(var11), EnumType32.SOURCE_SANS, 22.0F));
         if (this.k.isValid_2(var11)) {
            var4.add(var11);
         }

         if (var5 != null) {
            break;
         }
      }

      this.fieldFloat_s = Math.max(200.0F, var7 + 20.0F);
      this.dataBuilder60_n = new RenderUtil38<>(this.dataBuilder15_o, this.k, var4);
   }

   public void clamp(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 85972512685926L;
      long var10 = var4 ^ 46241641281725L;
      super.calculate(var1, var2, var3);
      this.dataBuilder15_p.toggle(var6, this.licenseState_q.isValid(var1, var2));
      String var10000 = RenderUtil39.getString();
      Color var12 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("default.text-tertiary"),
         BreezeContext.authSession_c.getColor("default.text-primary"),
         (float)Math.max(this.dataBuilder15_o.getDouble(var10), this.dataBuilder15_p.getDouble(var10))
      );
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_q,
            BreezeContext.authSession_c.getFloat("button.corner-radius"),
            RenderUtil1.clamp(
               RenderUtil1.clamp(
                  BreezeContext.authSession_c.getColor("default.layer-one"),
                  BreezeContext.authSession_c.getColor("default.hovered"),
                  (float)this.dataBuilder15_p.getDouble(var10)
               ),
               BreezeContext.authSession_c.getColor("default.accent"),
               (float)this.dataBuilder15_o.calculateDouble(var8)
            )
         );
      String var13 = var10000;
      BreezeContext.iRenderer_b
         .strokeRoundedRect(this.licenseState_r, 4.0F, BreezeContext.authSession_c.getColor("default.accent"));
      BreezeContext.iRenderer_b
         .drawGlow(
            this.licenseState_q.calculateFloat() - 15.0F,
            this.licenseState_q.calculateFloat_4(),
            BreezeContext.authSession_c.getColor("default.text-primary"),
            (float)Math.max(1.0, this.dataBuilder15_o.getDouble(var10))
         );
      BreezeContext.iRenderer_b
         .drawText(
            RenderUtil27.CONST_G.apply((Enum<?>)this.k().getObject_m()),
            this.licenseState_q.fieldFloat_a + 10.0F,
            this.b + 12.0F,
            var12,
            EnumType32.SOURCE_SANS,
            22.0F
         );
      if (!this.dataBuilder15_o.isBool_e() && this.dataBuilder60_n.f && this.dataBuilder15_o.calculateDouble(var8) == 0.0) {
         this.dataBuilder60_n.processAll();
      }

      if (var13 != null) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      long var6 = var4 ^ 119841672885148L;
      String var8 = RenderUtil39.getString();
      if (!this.licenseState_q.isValid(var1, var2)) {
         return false;
      }

      if (var3 == 0) {
         this.dataBuilder15_o.toggle(var6, !this.dataBuilder15_o.isBool_e());
         if (!this.dataBuilder15_o.isBool_e()) {
            return true;
         }

         BreezeContext.guiPanelSettings_f.update(this.dataBuilder60_n);
         if (var8 == null) {
            return true;
         }
      }

      if (var3 == 1 && !this.k.fieldBool_k) {
         this.k().processNullable_2();
         this.dataBuilder15_o.toggle(var6, false);
      }

      return true;
   }

   public void initialize() {
      this.licenseState_q = new LicenseState(this.a() - this.fieldFloat_s - 10.0F, this.b + 5.0F, this.fieldFloat_s, 35.0F);
      this.licenseState_r = new LicenseState(
         this.licenseState_q.calculateFloat() - 25.0F, this.licenseState_q.fieldFloat_b + 5.0F, 20.0F, this.licenseState_q.fieldFloat_d - 10.0F
      );
      this.dataBuilder60_n.calculate_2(this.licenseState_q.fieldFloat_a, this.licenseState_q.calculateFloat_2() + 10.0F, this.licenseState_q.fieldFloat_c, 0.0F);
      this.dataBuilder60_n.licenseState_k = this.licenseState_q;
      super.calculate_2();
   }

   public void decrypt(float var1, float var2, float var3, float var4) {
      super.calculate_3(var1, var2, var3, 45.0F);
   }

   public void initialize() {
      super.h();
      this.dataBuilder60_n.processAll();
   }

   public boolean checkCondition_2(float var1) {
      long var2 = 69880200093113L;
      return BreezeContext.iKeybindSettings_e.isToggle()
         ? true
         : BreezeContext.iRenderer_b.measureText(this.k.string_b, EnumType32.SOURCE_SANS, 22.0F) + this.fieldFloat_s + 30.0F > var1;
   }

   static {
      long var0 = 90503613314718L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[8];
      int var5 = 0;
      String var6 = "t§.\u000e\u0019A\u00adÉ\u0015»TUAÆ\u0019UÌè+þoð¥ßw\u0086«\u0080çÂr\u009d8õ\u0087`Õuâ} \u008e3\u0015SÆ\u0003\u0017áO½ê\u0004í\u0091Í\u000e5\u009eêULÂ\u0006\u009cf\u0011V`\u0083®\u0003\u0096(iÆìó\u009cäÿä_fþ\u0018E\r\u001dJ¨T¦àuß\u0016Q|¸bÒ{ûsmîúf2¼\u0019n¨ \u0084\u000fõÐá\u0010L÷\u0000\u0086àÔù±Y°Ôí\u001e\u000f¨9\u0088D0äDt6fÃ\u0092\u0018Àväê]v\u001d\b\u001a«Bvæ¿K1\u009d#W\u000bL\u0016\u0005Y(\u0091\u000b\u008bé\u0016ä)ªZ\u000b<\u0014wDÀj\u0003|åøI7¬fw\u0095½§\u0015OTT\u0001«î\u0011bL»8";
      int var7 = "t§.\u000e\u0019A\u00adÉ\u0015»TUAÆ\u0019UÌè+þoð¥ßw\u0086«\u0080çÂr\u009d8õ\u0087`Õuâ} \u008e3\u0015SÆ\u0003\u0017áO½ê\u0004í\u0091Í\u000e5\u009eêULÂ\u0006\u009cf\u0011V`\u0083®\u0003\u0096(iÆìó\u009cäÿä_fþ\u0018E\r\u001dJ¨T¦àuß\u0016Q|¸bÒ{ûsmîúf2¼\u0019n¨ \u0084\u000fõÐá\u0010L÷\u0000\u0086àÔù±Y°Ôí\u001e\u000f¨9\u0088D0äDt6fÃ\u0092\u0018Àväê]v\u001d\b\u001a«Bvæ¿K1\u009d#W\u000bL\u0016\u0005Y(\u0091\u000b\u008bé\u0016ä)ªZ\u000b<\u0014wDÀj\u0003|åøI7¬fw\u0095½§\u0015OTT\u0001«î\u0011bL»8"
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
                     CONST_V = var4;
                     CONST_W = new String[8];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var15 = -1082631245498140398L;
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
                     CONST_T = (int)var13;
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

                  var6 = "i\u00121&G)94HâñAóñ\u0018vÕYzæôc1¿(c\u001a¿)Ñ\b\u0005\u0095À(Vÿ12*\u0093ã\u001aò´âb©\u0018\u0094\u008e\u00151¯î(\f¢N¨\u0004\u0015\u0080g\u0086";
                  var7 = "i\u00121&G)94HâñAóñ\u0018vÕYzæôc1¿(c\u001a¿)Ñ\b\u0005\u0095À(Vÿ12*\u0093ã\u001aò´âb©\u0018\u0094\u008e\u00151¯î(\f¢N¨\u0004\u0015\u0080g\u0086"
                     .length();
                  var8 = 24;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12688;
      if (CONST_W[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_X.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_X.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dX", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_V[var3].getBytes("ISO-8859-1");
         CONST_W[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_W[var3];
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
         throw new RuntimeException("rip/breeze/dX" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
