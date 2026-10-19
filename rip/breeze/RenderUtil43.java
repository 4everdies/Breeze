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

public class RenderUtil43<T> extends UIPanel {
   private final rip.breeze.client.AnimationTimer dataBuilder15_h = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private final RenderUtil12 dataBuilder124_i;
   private final RenderUtil11_x dataBuilder120_j;
   public final GenericSetting<T> dataBuilder54_k;
   public boolean fieldBool_l;
   private static String string_m;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);

   public RenderUtil43(GenericSetting<T> var1) {
      this.dataBuilder54_k = var1;
      this.dataBuilder124_i = new RenderUtil12(var1.string_c, new LicenseState());
      this.dataBuilder120_j = new RenderUtil11_x(var1.string_c, 14);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      super.toggle(var1, var2, var3);
      this.dataBuilder15_h.toggle(var6, this.a(var1, var2));
      BreezeContext.iRenderer_b
         .drawText(
            this.dataBuilder54_k.string_b,
            this.a + 10.0F,
            this.b + 12.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               BreezeContext.authSession_c.getColor("default.text-primary"),
               (float)this.dataBuilder15_h.getDouble(var8)
            ),
            EnumType32.SOURCE_SANS,
            22.0F
         );
      if (BreezeContext.iKeybindSettings_e.getHeight()) {
         this.dataBuilder124_i.update(var1, var2, var3);
      }

      if (BreezeContext.iKeybindSettings_e.isToggle()) {
         this.dataBuilder120_j.calculate(var1, var2, var3);
      }
   }

   public void calculate_2() {
      this.dataBuilder124_i
         .a(
            this.a + 6.0F,
            this.b + 8.0F,
            BreezeContext.iRenderer_b.measureText(this.getDataBuilder54_k().string_b, EnumType32.SOURCE_SANS, 22.0F) + 8.0F,
            28.0F
         );
      this.dataBuilder120_j.a(this.a + 10.0F, this.b + this.d - this.dataBuilder120_j.getFloat() - 5.0F, this.c - 12.0F, this.dataBuilder120_j.getFloat());
   }

   public void calculate_3(float var1, float var2, float var3, float var4) {
      long var5 = 102388927128469L;
      if (BreezeContext.iKeybindSettings_e.isToggle()) {
         this.dataBuilder120_j.a(var1, var2 + var4 - this.dataBuilder120_j.getFloat() - 5.0F, var3, this.dataBuilder120_j.getFloat());
         var4 += this.dataBuilder120_j.getFloat();
      }

      super.drawColoredQuad(var1, var2, var3, var4);
   }

   public rip.breeze.client.AnimationTimer getDataBuilder15_h() {
      return this.dataBuilder15_h;
   }

   public GenericSetting<T> getDataBuilder54_k() {
      return this.dataBuilder54_k;
   }

   public boolean checkCondition(float var1) {
      long var2 = 69880200093113L;
      return BreezeContext.iKeybindSettings_e.isToggle();
   }

   public static void initialize(String var0) {
      string_m = var0;
   }

   public static String getString() {
      return string_m;
   }

   static {
      long var0 = 120888190530889L;
      initialize(null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "\t)ù7Ü ·\fýÃ@\u008e3Vå\b¸ù>ú¤\u0012\u00ad\u007fö\u0083\u00ad\u008bä\u0012LçØ0\u008b\u0083½[õ\u0019(O#/ü~i\u0012\u001d¹\b¸xá{vØh\u00871É½\u008c\u008b\u0087S\u0093¨È\u000eC\u008dà\u0083Ä ÄÞ[\u0006Ð";
      int var7 = "\t)ù7Ü ·\fýÃ@\u008e3Vå\b¸ù>ú¤\u0012\u00ad\u007fö\u0083\u00ad\u008bä\u0012LçØ0\u008b\u0083½[õ\u0019(O#/ü~i\u0012\u001d¹\b¸xá{vØh\u00871É½\u008c\u008b\u0087S\u0093¨È\u000eC\u008dà\u0083Ä ÄÞ[\u0006Ð"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_E = var4;
            CONST_F = new String[2];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8506;
      if (CONST_F[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_G.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_G.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dN", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_E[var3].getBytes("ISO-8859-1");
         CONST_F[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_F[var3];
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
         throw new RuntimeException("rip/breeze/dN" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
