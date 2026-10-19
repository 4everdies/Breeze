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

public class RenderUtil17_x extends Util28 {
   private final StringDecryptHelper5 stringDecryptHelper5_j;
   private LicenseState licenseState_k;
   private static int fieldInt_l;
   private static final String[] CONST_N;
   private static final String[] CONST_O;
   private static final Map CONST_P = new HashMap(13);

   public RenderUtil17_x() {
      long var1 = 95227960132312L;
      super();
      this.licenseState_k = new LicenseState();
      this.stringDecryptHelper5_j = new StringDecryptHelper5("Loading source...", new LicenseState());
      this.stringDecryptHelper5_j.update_6(EnumType32.SOURCE_CODE_PRO);
      this.stringDecryptHelper5_j.clamp_14(16);
      this.stringDecryptHelper5_j.update_7(4);
      this.stringDecryptHelper5_j.toggle_2(true);
      this.stringDecryptHelper5_j.toggle_3(true);
      this.stringDecryptHelper5_j.update_5(new Util134(10.0F, 10.0F));
      this.stringDecryptHelper5_j.processNullable_2(true);
      this.stringDecryptHelper5_j.setBool_r(true);
      this.b(this.stringDecryptHelper5_j);
   }

   public void processAll(String var1) {
      long var2 = 51080209209562L;
      this.stringDecryptHelper5_j.processAll(var1 == null ? "" : var1);
   }

   public void update(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_k,
            BreezeContext.authSession_c.getFloat("default.corner-radius"),
            BreezeContext.authSession_c.getColor("default.layer-one")
         );
      super.processNullable(var1, var2, var3);
   }

   public void calculate() {
      this.licenseState_k = new LicenseState(this.a + 20.0F, this.b + 20.0F, this.c - 40.0F, this.d - 40.0F);
      this.stringDecryptHelper5_j
         .processAll_2(
            this.licenseState_k.fieldFloat_a + 15.0F, this.licenseState_k.fieldFloat_b + 15.0F, this.licenseState_k.fieldFloat_c - 30.0F, this.licenseState_k.fieldFloat_d - 30.0F
         );
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   public static void initialize(int var0) {
      fieldInt_l = var0;
   }

   public static int getValue() {
      return fieldInt_l;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 85 : 0;
   }

   static {
      long var0 = 33199990218903L;
      initialize(87);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "GFw\u000b\u0016Õõ«t»Òi½Ü¶Þi\u0015Ú¸¿ß7ØL\u00145³4¿\fìçýç¹Ä¯\u000em(÷¹Ë\u009cQ\u001a\u0000¬Ís\u001f\u00057Årßõê/Ê\u008d\u0082Ó\u00ad¸µd¡ì\u0004ü\u009cÍá\u001fØ\u008a\r²K(ï±W\u0017§!$Û\u000f\u0089ý+År\u0093t&µ8Ù\n\u0012\u00988ÁÍàE\u0010ä¿\u001e ¢\u0083A\u009b\u0080\u0014X";
      int var7 = "GFw\u000b\u0016Õõ«t»Òi½Ü¶Þi\u0015Ú¸¿ß7ØL\u00145³4¿\fìçýç¹Ä¯\u000em(÷¹Ë\u009cQ\u001a\u0000¬Ís\u001f\u00057Årßõê/Ê\u008d\u0082Ó\u00ad¸µd¡ì\u0004ü\u009cÍá\u001fØ\u008a\r²K(ï±W\u0017§!$Û\u000f\u0089ý+År\u0093t&µ8Ù\n\u0012\u00988ÁÍàE\u0010ä¿\u001e ¢\u0083A\u009b\u0080\u0014X"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_N = var4;
            CONST_O = new String[3];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32317;
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
            throw new RuntimeException("rip/breeze/dm", var10);
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
         throw new RuntimeException("rip/breeze/dm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
