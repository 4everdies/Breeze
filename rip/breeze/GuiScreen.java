package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(name = "GuiScreen", description = "The basic GuiScreen class", group = "net/minecraft/client/gui")
public class GuiScreen extends StringBuilderUtil<net.minecraft.client.gui.GuiScreen> {
   private static final String CONST_R;

   public GuiScreen(net.minecraft.client.gui.GuiScreen var1) {
      super(var1);
   }

   @JSGetter(value = "doesGuiPauseGame", description = "Does the gui pause the game?")
   public boolean isValid() {
      return ((net.minecraft.client.gui.GuiScreen)this.i).doesGuiPauseGame();
   }

   @JSFunction(value = "mouseClicked", description = "Click the gui in the given position.", params = {"The x position", "The y position", "The button"})
   public void initialize(int var1, int var2, int var3) {
      MinecraftAccessor.initialize_27((net.minecraft.client.gui.GuiScreen)this.i, var1, var2, var3);
   }

   @JSFunction(value = "mouseReleased", description = "Release mouse at the given position.", params = {"The x position", "The y position", "The button"})
   public void initialize_2(int var1, int var2, int var3) {
      MinecraftAccessor.initialize_52((net.minecraft.client.gui.GuiScreen)this.i, var1, var2, var3);
   }

   @JSFunction(
      value = "mouseClickMove",
      description = "Drag mouse to position.",
      params = {"The x position", "The y position", "The button", "Time since last click"}
   )
   public void initialize_3(int var1, int var2, int var3, long var4) {
      MinecraftAccessor.initialize_35((net.minecraft.client.gui.GuiScreen)this.i, var1, var2, var3, var4);
   }

   @Override
   public String toString() {
      return ((net.minecraft.client.gui.GuiScreen)this.i).toString();
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_R;
   }

   static {
      long var0 = 3327099246064L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ÅÕÞ[ßSceÔ¿ïéEsÙà".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_R = var5;
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
