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

public class RenderUtil50 extends Util28 {
   private final rip.breeze.client.AnimationTimer dataBuilder15_j;
   private final rip.breeze.client.AnimationTimer dataBuilder15_k;
   private final String string_l;
   protected LicenseState licenseState_m;
   public LicenseState licenseState_n;
   private static String[] arr_o;
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   public RenderUtil50(String var1) {
      long var2 = 67361271489559L;
      decrypt();
      super();
      this.dataBuilder15_j = new rip.breeze.client.AnimationTimer(300.0F, false, EnumType3.SINE_IN);
      this.dataBuilder15_k = new rip.breeze.client.AnimationTimer(100.0F, true, EnumType3.LINEAR);
      this.string_l = var1;
      if (LicenseState.checkCondition()) {
         initialize(new String[1]);
      }
   }

   public boolean isValid() {
      return false;
   }

   public void calculate(float var1, float var2, boolean var3) {
      long var4 = 74530024316500L;
      long var6 = var4 ^ 87507105814371L;
      long var8 = var4 ^ 124342782794667L;
      String[] var10000 = decrypt();
      this.dataBuilder15_j.toggle(var6, var3);
      this.dataBuilder15_k.toggle(var6, this.licenseState_n.isValid(var1, var2));
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_n,
            BreezeContext.authSession_c.getFloat("tab.corner-radius"),
            RenderUtil1.getColor_7(
               BreezeContext.authSession_c.getColor("tab.selected"), (int)(255.0 * this.dataBuilder15_j.getDouble(var8))
            )
         );
      String[] var10 = var10000;
      Color var11 = var3
         ? BreezeContext.authSession_c.getColor("tab.text-selected")
         : RenderUtil1.clamp(
            BreezeContext.authSession_c.getColor("tab.text"),
            BreezeContext.authSession_c.getColor("tab.text-hovered"),
            (float)this.dataBuilder15_k.getDouble(var8)
         );
      BreezeContext.iRenderer_b
         .drawTextOutline(
            this.string_l,
            this.licenseState_n.fieldFloat_a + this.licenseState_n.fieldFloat_d + 15.0F,
            this.licenseState_n.fieldFloat_b + 9.0F,
            var11,
            EnumType32.SOURCE_SANS,
            20.0F,
            2.0F
         );
      BreezeContext.iRenderer_b.drawTextAt(this.buildString(), this.licenseState_n.fieldFloat_a + 10.0F, this.licenseState_n.fieldFloat_b + 3.0F, 1.2F, var11);
      if (var10 != null) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   public void update(LicenseState var1, LicenseState var2, LicenseState var3) {
      this.licenseState_n = var1;
      this.licenseState_m = var3;
      this.a(var2.fieldFloat_a, var2.fieldFloat_b, var2.fieldFloat_c, var2.fieldFloat_d);
   }

   public LicenseState getLicenseState_n() {
      return this.licenseState_n;
   }

   public LicenseState getLicenseState_m() {
      return this.licenseState_m;
   }

   public String buildString() {
      return this.string_l.toLowerCase();
   }

   public String getString_l() {
      return this.string_l;
   }

   public boolean checkCondition(float var1, float var2) {
      long var3 = 107214831082458L;
      return super.a(var1, var2) || this.licenseState_m.isValid(var1, var2);
   }

   public static void initialize(String[] var0) {
      arr_o = var0;
   }

   public static String[] decrypt() {
      return arr_o;
   }

   static {
      long var0 = 66898559540621L;
      initialize(null);
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
      String var6 = "\u0007!Ô\u0011Ã[×\u0081dP\u008eë°êKd\u008fï&u\u00ad\u008cXïH \u0096\u0005ËÓn¸(ëõ×â8s£\u000fvp¢ý\u001aj\u0000?\u009eÜ·\u0090\u001cë÷q\u009b%:\u0018\u001bÝh\u0017h·©<!\u0095l\r(è\u0085\u0096Ò±æQF\u008e[B¼¥j½¸<÷\tÆm\u000b\"9¯\u009eáÂo%(«QÎQ\u008b\u0015nuÔ";
      int var7 = "\u0007!Ô\u0011Ã[×\u0081dP\u008eë°êKd\u008fï&u\u00ad\u008cXïH \u0096\u0005ËÓn¸(ëõ×â8s£\u000fvp¢ý\u001aj\u0000?\u009eÜ·\u0090\u001cë÷q\u009b%:\u0018\u001bÝh\u0017h·©<!\u0095l\r(è\u0085\u0096Ò±æQF\u008e[B¼¥j½¸<÷\tÆm\u000b\"9¯\u009eáÂo%(«QÎQ\u008b\u0015nuÔ"
         .length();
      char var8 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_B = var4;
                     CONST_C = new String[5];
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

                  var6 = "\u0081.h7Ç`*Þzâ\u000e\u001e\u0015ÜÖG¤\u001aG\u008cÝþs\u0014(\u0007ßi\u009a22Æ@\u0090Ë\u0090,íD\u008c®ÔÚ<ß°WP¶M9\u0096xÃ¡YÅ\u008få\u0089À\u0006V8´";
                  var7 = "\u0081.h7Ç`*Þzâ\u000e\u001e\u0015ÜÖG¤\u001aG\u008cÝþs\u0014(\u0007ßi\u009a22Æ@\u0090Ë\u0090,íD\u008c®ÔÚ<ß°WP¶M9\u0096xÃ¡YÅ\u008få\u0089À\u0006V8´"
                     .length();
                  var8 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28144;
      if (CONST_C[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dp", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B[var3].getBytes("ISO-8859-1");
         CONST_C[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_3(var4, var5);
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
         throw new RuntimeException("rip/breeze/dp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
