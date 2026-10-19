package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ConfigUtil5 extends RenderUtil50 {
   private final RenderUtil32 dataBuilder45_p;
   private static String string_q;
   private static final String CONST_S;

   public ConfigUtil5() {
      long var1 = 44271404582015L;
      String var10000 = getString();
      super(CONST_S);
      this.dataBuilder45_p = new RenderUtil32(this, BreezeContext.iKeybindSettings_e.getKeyName(), BreezeContext.iKeybindSettings_e.isHeld());
      String var3 = var10000;
      this.b(this.dataBuilder45_p);
      if (var3 == null) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   public void initialize() {
      this.dataBuilder45_p.a(this);
   }

   public static void initialize_2(String var0) {
      string_q = var0;
   }

   public static String getString() {
      return string_q;
   }

   static {
      long var0 = 84094518120462L;
      initialize_2("emuoac");
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0090\u0099~\t\u0011\u0083âÙ¢só\t\u0001I3ã".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_S = var5;
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
