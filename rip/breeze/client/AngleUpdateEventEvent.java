package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import rip.breeze.BaseEvent;
import rip.breeze.KeepParameters;
import rip.breeze.ScriptEvent;
import rip.breeze.StringDecryptor;

@ScriptEvent(name = "AngleUpdateEvent", description = "Gets called when the player's angles are updated.", cancellable = true)
public class AngleUpdateEventEvent extends BaseEvent {
   private float fieldFloat_h;
   private float fieldFloat_i;
   private static final String CONST_K;

   @KeepParameters
   public AngleUpdateEventEvent(float var1, float var2) {
      this.fieldFloat_h = var1;
      this.fieldFloat_i = var2;
   }

   @JSGetter("yawChange")
   @KeepParameters
   public float getFloat_h() {
      return this.fieldFloat_h;
   }

   @JSSetter("yawChange")
   public void setFloat_h(float var1) {
      this.fieldFloat_h = var1;
   }

   @JSGetter("pitchChange")
   @KeepParameters
   public float getFloat_i() {
      return this.fieldFloat_i;
   }

   @JSSetter("pitchChange")
   public void setFloat_i(float var1) {
      this.fieldFloat_i = var1;
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_K;
   }

   static {
      long var0 = 36873792561553L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Lrgô×ã©q>ú6ÆW-¾[#\u00915ÅnPAö".getBytes("ISO-8859-1"));
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
