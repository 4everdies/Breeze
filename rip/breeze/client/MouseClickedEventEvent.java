package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.BaseEvent;
import rip.breeze.KeepParameters;
import rip.breeze.ScriptEvent;
import rip.breeze.StringDecryptor;

@ScriptEvent(name = "MouseClickedEvent", description = "Gets called when the mouse is clicked.", cancellable = true)
public class MouseClickedEventEvent extends BaseEvent {
   public final AimYawMode aimYawMode_h;
   private static final String CONST_J;

   @KeepParameters
   public MouseClickedEventEvent(AimYawMode var1) {
      this.aimYawMode_h = var1;
   }

   @JSFunction(
      value = "getButton",
      description = "Gets the button that was clicked.",
      returns = " the type of MouseClickedEvent can be: LEFT, RIGHT, or HOLD_LEFT"
   )
   public String getString() {
      return this.aimYawMode_h.name();
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_J;
   }

   static {
      long var0 = 38813093022649L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0014d EWÆ(&µ\u0000F]f\b\u0019«abøW\u0095*Á²".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_J = var5;
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
