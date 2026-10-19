package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.settings.KeyBinding;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import rip.breeze.CancellableEvent;
import rip.breeze.KeepParameters;
import rip.breeze.ScriptEvent;
import rip.breeze.StringDecryptor;
import rip.breeze.Util25;

@ScriptEvent(
   name = "SpoofInputEvent",
   description = "Can be used to spoof keys being held down or released.",
   cancellable = false,
   example = "script.addListener(\"SpoofInputEvent\", (event) => {\n    if (event.keyBinding == mc.gameSettings.keyBindSprint) {\n        event.pressed = true;\n    }\n});"
)
public class SpoofInputEventEvent extends CancellableEvent {
   public final KeyBinding keyBinding_g;
   public boolean fieldBool_h;
   private static final String CONST_J;

   @KeepParameters
   public SpoofInputEventEvent(KeyBinding var1, boolean var2) {
      this.keyBinding_g = var1;
      this.fieldBool_h = var2;
   }

   @JSFunction(value = "getKeyBinding", description = "Gets the key binding that was pressed.")
   public Util25 getBreezeUtil65() {
      return (Util25)Util25.c(this.keyBinding_g);
   }

   @JSGetter(value = "pressed", description = "Modify this to spoof the key state.")
   public boolean isBool_h() {
      return this.fieldBool_h;
   }

   @JSSetter("pressed")
   public void setBool_h(boolean var1) {
      this.fieldBool_h = var1;
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_J;
   }

   static {
      long var0 = 79454367597140L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0002TW\u0094\u0016°Ôð½XY9\u0000þ*ª".getBytes("ISO-8859-1"));
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
