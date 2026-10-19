package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import rip.breeze.CancellableEvent;
import rip.breeze.KeepParameters;
import rip.breeze.ScriptEvent;
import rip.breeze.StringDecryptor;

@ScriptEvent(name = "PreMotionEvent", description = "Gets called before calculating the move of the player", cancellable = false)
public final class PreMotionEventEvent extends CancellableEvent {
   public float double_field;
   public float double_field_2;
   public float double_field_3;
   private static final String CONST_K;

   @KeepParameters
   public PreMotionEventEvent(float var1, float var2, float var3) {
      this.double_ = var1;
      this.double_2 = var2;
      this.double_3 = var3;
   }

   @JSGetter("forward")
   public double getDouble() {
      return this.double_;
   }

   @JSGetter("strafe")
   public double getDouble_2() {
      return this.double_2;
   }

   @JSGetter("friction")
   public double getDouble_3() {
      return this.double_3;
   }

   @JSSetter("forward")
   public void setFloat_g(float var1) {
      this.double_ = var1;
   }

   @JSSetter("strafe")
   public void setFloat_h(float var1) {
      this.double_2 = var1;
   }

   @JSSetter("friction")
   public void setFloat_i(float var1) {
      this.double_3 = var1;
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_K;
   }

   static {
      long var0 = 17626206321542L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ay@\u0010ûÇm·dä±!\u0090\u001d9\f".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_K = var5;
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
