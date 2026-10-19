package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.settings.KeyBinding;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "MCKeyBinding",
   group = "net/minecraft/client/settings",
   description = "Represents a Minecraft KeyBinding, breeze itself uses a different keybind system."
)
public class Util25 extends StringBuilderUtil<KeyBinding> {
   private static final String CONST_Q;

   public Util25(KeyBinding var1) {
      super(var1);
   }

   @JSGetter(
      value = "keyDown",
      description = "If the key is down or not, manipulating this will have effect in-game. However we recommend using our SpoofInputEvent instead!"
   )
   public boolean isValid() {
      return ((KeyBinding)this.i).isKeyDown();
   }

   @JSSetter("keyDown")
   public void initialize(boolean var1) {
      MinecraftAccessor.initialize_24((KeyBinding)this.i, var1);
   }

   @JSFunction(value = "getRealState", description = "Gets the real keyboard state of this bind, ignores spoofing breeze modules or other game modifications.")
   public boolean isValid_2() {
      return rip.breeze.client.PacketUtil14.isValid((KeyBinding)this.i);
   }

   @JSFunction(value = "getKeyCode", returns = "The lwjgl keycode for the bind, mostly useless.")
   public int getValue() {
      return ((KeyBinding)this.i).getKeyCode();
   }

   @JSFunction(
      value = "isPressed",
      description = "Checks if the keybind was recently pressed and returns true in that case.",
      remarks = "This pulls presses from minecraft, calling isPressed will make the key be pressed ingame one less time."
   )
   public boolean isValid_3() {
      return ((KeyBinding)this.i).isPressed();
   }

   @JSFunction(value = "getKeyDescription", returns = "The minecraft description of the key.")
   public String getString() {
      return ((KeyBinding)this.i).getKeyDescription();
   }

   @JSFunction(value = "getKeyCategory", returns = "The minecraft category of the key.")
   public String getString_2() {
      return ((KeyBinding)this.i).getKeyCategory();
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_Q;
   }

   static {
      long var0 = 75859968488838L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("µ\u0017+dýµ&ð´ãxf=YÓ\u0086".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_Q = var5;
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
