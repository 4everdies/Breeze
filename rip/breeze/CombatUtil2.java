package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.settings.GameSettings;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;

@ScriptObject(name = "GameSettings", group = "net/minecraft/client/settings", description = "The minecraft settings!")
public class CombatUtil2 extends StringBuilderUtil<GameSettings> {
   private static final String CONST_Q;

   public CombatUtil2(GameSettings var1) {
      super(var1);
   }

   @JSGetter(value = "keyBindForward", description = "The forward key binding.")
   public Util25 getBreezeUtil65() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindForward);
   }

   @JSGetter(value = "keyBindBack", description = "The back key binding.")
   public Util25 getBreezeUtil65_2() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindBack);
   }

   @JSGetter(value = "keyBindRight", description = "The right key binding.")
   public Util25 getBreezeUtil65_3() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindRight);
   }

   @JSGetter(value = "keyBindLeft", description = "The left key binding.")
   public Util25 getBreezeUtil65_4() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindLeft);
   }

   @JSGetter(value = "keyBindJump", description = "The jump key binding.")
   public Util25 getBreezeUtil65_5() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindJump);
   }

   @JSGetter(value = "keyBindSneak", description = "The sneak key binding.")
   public Util25 getBreezeUtil65_6() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindSneak);
   }

   @JSGetter(value = "keyBindSprint", description = "The sprint key binding.")
   public Util25 getBreezeUtil65_7() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindSprint);
   }

   @JSGetter(value = "keyBindUseItem", description = "The right click keybind.")
   public Util25 getBreezeUtil65_8() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindUseItem);
   }

   @JSGetter(value = "keyBindAttack", description = "The left click keybind.")
   public Util25 getBreezeUtil65_9() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindAttack);
   }

   @JSGetter(value = "keyBindInventory", description = "The inventory keybind.")
   public Util25 getBreezeUtil65_10() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindInventory);
   }

   @JSGetter(value = "keyBindDrop", description = "The drop keybind.")
   public Util25 getBreezeUtil65_11() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindDrop);
   }

   @JSGetter(value = "keyBindChat", description = "The chat keybind.")
   public Util25 getBreezeUtil65_12() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindChat);
   }

   @JSGetter(value = "keyBindPlayerList", description = "The player list keybind.")
   public Util25 getBreezeUtil65_13() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindPlayerList);
   }

   @JSGetter(value = "keyBindCommand", description = "The command keybind.")
   public Util25 getBreezeUtil65_14() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindCommand);
   }

   @JSGetter(value = "keyBindScreenshot", description = "The screenshot keybind.")
   public Util25 getBreezeUtil65_15() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindScreenshot);
   }

   @JSGetter(value = "keyBindTogglePerspective", description = "The perspective toggle keybind.")
   public Util25 getBreezeUtil65_16() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindTogglePerspective);
   }

   @JSGetter(value = "keyBindSmoothCamera", description = "The smooth camera keybind.")
   public Util25 getBreezeUtil65_17() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindSmoothCamera);
   }

   @JSGetter(value = "keyBindFullscreen", description = "The fullscreen keybind.")
   public Util25 getBreezeUtil65_18() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindFullscreen);
   }

   @JSGetter(value = "keyBindSpectatorOutlines", description = "The spectator outlines keybind.")
   public Util25 getBreezeUtil65_19() {
      return (Util25)Util25.c(((GameSettings)this.i).keyBindSpectatorOutlines);
   }

   @JSGetter(value = "viewBobbing", description = "Whether view bobbing is enabled.")
   public boolean isValid() {
      return ((GameSettings)this.i).viewBobbing;
   }

   @JSSetter("viewBobbing")
   public void initialize(boolean var1) {
      ((GameSettings)this.i).viewBobbing = var1;
   }

   @JSGetter(value = "thirdPersonView", description = "The perspective mode: 0 = First person, 1 = Third person back view, 2 = Third person front view")
   public int getValue() {
      return ((GameSettings)this.i).thirdPersonView;
   }

   @JSSetter("thirdPersonView")
   public void initialize_2(int var1) {
      ((GameSettings)this.i).thirdPersonView = var1;
   }

   @JSGetter(value = "fov", description = "The FOV setting.")
   public float getFloat() {
      return ((GameSettings)this.i).fovSetting;
   }

   @JSSetter("fov")
   public void initialize_3(float var1) {
      ((GameSettings)this.i).fovSetting = var1;
   }

   @JSGetter(value = "gamma", description = "The gamma setting.")
   public float getFloat_2() {
      return ((GameSettings)this.i).gammaSetting;
   }

   @JSSetter("gamma")
   public void initialize_4(float var1) {
      ((GameSettings)this.i).gammaSetting = var1;
   }

   @JSGetter("saturation")
   public float getFloat_3() {
      return ((GameSettings)this.i).saturation;
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_Q;
   }

   static {
      long var0 = 78174736060612L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0081\nÓ28½Íl\u001fÊhË¢g@\u008a".getBytes("ISO-8859-1"));
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
