package rip.breeze;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MovingObjectPosition;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import rip.breeze.client.BreezeClient;
import rip.breeze.client.MinecraftAccessor;

@ScriptNamespace(name = "mc", description = "The Minecraft object.")
public class CombatUtil1 {
   private static final String CONST_B;

   @JSGetter(value = "player", description = "The main client player.", remarks = "Can be null sometimes.")
   public static EntityPlayerClient getBreezeUtil58() {
      return BreezeClient.CONST_A.thePlayer == null ? null : StringBuilderUtil.getDataBuilder12(BreezeClient.CONST_A.thePlayer);
   }

   @JSGetter(value = "world", description = "The main world", remarks = "Can be null sometimes.")
   public static BlockUtil1 getBreezeUtil22() {
      return BreezeClient.CONST_A.theWorld == null ? null : StringBuilderUtil.getDataBuilder12(BreezeClient.CONST_A.theWorld);
   }

   @JSGetter(value = "playerController", description = "The player controller, can be used for controlling the local player and inventory.")
   public static EnumFacing getDataBuilder13() {
      return StringBuilderUtil.getDataBuilder12(BreezeClient.CONST_A.playerController);
   }

   @JSGetter(value = "currentScreen", description = "The current screen.")
   public static GuiScreen getBreezeUtil60() {
      return StringBuilderUtil.getDataBuilder12(BreezeClient.CONST_A.currentScreen);
   }

   @JSGetter(value = "pointedEntity", description = "The entity that the local player is looking at.")
   public static RotationUtils getRotationUtils() {
      return StringBuilderUtil.getDataBuilder12(BreezeClient.CONST_A.pointedEntity);
   }

   @JSGetter(value = "objectMouseOver", description = "The object that the local player is looking at, if this is null it crashes your game.")
   public static RaytraceResult getDataBuilder48() {
      return (RaytraceResult)RaytraceResult.b(BreezeClient.CONST_A.objectMouseOver);
   }

   @JSSetter("objectMouseOver")
   public static void initialize(RaytraceResult var0) {
      BreezeClient.CONST_A.objectMouseOver = (MovingObjectPosition)var0.b();
   }

   @JSGetter("gameSettings")
   public static CombatUtil2 getBreezeUtil64() {
      return StringBuilderUtil.getDataBuilder12(BreezeClient.CONST_A.gameSettings);
   }

   @JSFunction("getScreenWidth")
   public static int getValue() {
      return BreezeClient.CONST_A.displayWidth;
   }

   @JSFunction("getScreenHeight")
   public static int getValue_2() {
      return BreezeClient.CONST_A.displayHeight;
   }

   @JSFunction("closeUI")
   public static void openGui() {
      BreezeClient.CONST_A.displayGuiScreen(null);
   }

   @JSFunction(value = "serverIP", returns = "The IP of the server you are currently connected to.")
   public static String getString() {
      return BreezeClient.CONST_A.getCurrentServerData() == null ? null : BreezeClient.CONST_A.getCurrentServerData().serverIP;
   }

   @JSGetter(value = "timerSpeed", description = "The current timer speed, the default being 1.")
   public static float getFloat() {
      return MinecraftAccessor.getTimer(BreezeClient.CONST_A).timerSpeed;
   }

   @JSSetter("timerSpeed")
   public static void initialize_2(float var0) {
      MinecraftAccessor.getTimer(BreezeClient.CONST_A).timerSpeed = var0;
   }

   @JSFunction(
      value = "chatMessage",
      description = "Sends a chat message with an optional prefix to the player.",
      params = {"The message you want shown in chat.", "If you want the [Breeze] prefix added."}
   )
   public static void updateRotation(String var0, boolean var1) {
      long var2 = 64291354132289L;
      BreezeClient.CONST_A.thePlayer.addChatMessage(new ChatComponentText((var1 ? ChatFormatting.BLUE + CONST_B + ChatFormatting.RESET : "") + var0));
   }

   @JSFunction(value = "clickMouse", description = "Left click the mouse.")
   public static void initialize_3() {
      MinecraftAccessor.initialize_72(BreezeClient.CONST_A);
   }

   @JSFunction(value = "rightClickMouse", description = "Right click the mouse.")
   public static void initialize_4() {
      MinecraftAccessor.initialize_22(BreezeClient.CONST_A);
   }

   @JSGetter(
      value = "leftClickCounter",
      description = "The left click counter, the game uses this for calculating the miss mechanics when clicking, left clicks will only go through when this is 0."
   )
   public static int getValue_3() {
      return MinecraftAccessor.getValue(BreezeClient.CONST_A);
   }

   @JSSetter("leftClickCounter")
   public static void initialize_5(int var0) {
      MinecraftAccessor.initialize_43(BreezeClient.CONST_A, var0);
   }

   @JSGetter(
      value = "rightClickDelayTimer",
      description = "The right click delay timer, the game uses this for auto right clicking when you are holding down the mouse. Manipulating this can be used to make a fast place module for example."
   )
   public static int getValue_4() {
      return MinecraftAccessor.getValue_2(BreezeClient.CONST_A);
   }

   @JSSetter("rightClickDelayTimer")
   public static void initialize_6(int var0) {
      MinecraftAccessor.initialize_57(BreezeClient.CONST_A, var0);
   }

   static {
      long var0 = 16497543232686L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("iØ\u0016\u0097\u008c\u0084Ê\u0007?Dq\u008aHC\u0002k".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_B = var5;
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
