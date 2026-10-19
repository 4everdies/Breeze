package rip.breeze;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ImageUtil34 extends Util28 {
   private static final float CONST_J = 14.0F;
   private final RenderUtil19_x enum4Val_k;
   private final RenderUtil12 dataBuilder124_l;
   private static int fieldInt_m;
   private static final String CONST_O;

   public ImageUtil34(RenderUtil19_x var1) {
      this.enum4Val_k = var1;
      this.dataBuilder124_l = new RenderUtil12(var1.getString_a(), new LicenseState());
      this.c = 22.0F;
      this.d = 22.0F;
      this.b(this.dataBuilder124_l);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      super.processNullable(var1, var2, var3);
      Color var6 = this.enum4Val_k.getColor_d();
      Color var7 = new Color(var6.getRed(), var6.getGreen(), var6.getBlue(), 38);
      BreezeContext.iRenderer_b.fillRoundedRectFull(this.a, this.b, this.c, this.d, BreezeContext.authSession_c.getFloat(CONST_O) * 0.5F, var7);
      BreezeContext.iRenderer_b.drawTextAt(this.enum4Val_k.getString_c(), this.a + (this.c - 14.0F) / 2.0F, this.b + (this.d - 14.0F) / 2.0F, 0.5833333F, var6);
   }

   public void initialize() {
      super.processNullable_4();
      this.dataBuilder124_l.a(this);
   }

   public static void initialize_2(int var0) {
      fieldInt_m = var0;
   }

   public static int getValue() {
      return fieldInt_m;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 47 : 0;
   }

   static {
      long var0 = 88539927816944L;
      initialize_2(3);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("&74r¨Ê\u0095B\u0082\u000eî\u009aqå\u000fx¢þV\u009b\u0014zL\u008a".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_O = var5;
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
}
