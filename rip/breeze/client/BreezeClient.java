package rip.breeze.client;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.ChatComponentText;
import rip.breeze.AuthSession;
import rip.breeze.BreezeContext;
import rip.breeze.CloudAuthService;
import rip.breeze.GuiPanelSettings;
import rip.breeze.KeepName;
import rip.breeze.KeepParameters;
import rip.breeze.KeyCodeImpl;
import rip.breeze.KeybindSettings;
import rip.breeze.LicenseState;
import rip.breeze.NanoVGRenderer;
import rip.breeze.StringDecryptor;
import rip.breeze.ThreadUtil;

public class BreezeClient {
   public static final Minecraft CONST_A;
   private static BreezeClient breezeClient_b;
   private final ModuleRegistry moduleRegistry_c;
   private final ClickGUI clickGUI_d;
   ModuleManager moduleManager_e;
   private final ConfigManager configManager_f;
   private final ThemeManager themeManager_g;
   private final CloudSyncWorker cloudSyncWorker_h;
   private final ModuleInitializer moduleInitializer_i;
   private final AltManager altManager_j;
   private final PositionManager positionManager_k;
   private boolean fieldBool_l;
   private LinkedBlockingQueue<Runnable> linkedBlockingQueue_m;
   private static String[] arr_n;
   private static final String[] CONST_P;
   private static final String[] CONST_Q;
   private static final Map CONST_R = new HashMap(13);

   public BreezeClient() {
      this(getString());
   }

   public BreezeClient(String var1) {
      long var2 = 117834860974384L;
      String[] var10000 = getConfigKeys();
      super();
      String[] var4 = var10000;
      this.fieldBool_l = false;
      this.linkedBlockingQueue_m = new LinkedBlockingQueue<>();
      breezeClient_b = this;
      this.checkCondition();
      this.moduleRegistry_c = new ModuleRegistry();
      this.configManager_f = new ConfigManager();
      this.themeManager_g = new ThemeManager();
      this.cloudSyncWorker_h = new CloudSyncWorker();
      this.moduleInitializer_i = new ModuleInitializer();
      this.moduleInitializer_i.initialize();
      this.moduleManager_e = new ModuleManager();
      this.update(var1);
      this.moduleManager_e.openScreen();
      getKeybindSettings().processAll();
      this.altManager_j = new AltManager();
      this.positionManager_k = new PositionManager();
      this.clickGUI_d = new ClickGUI(BreezeContext.guiPanelSettings_f, this.moduleManager_e);
      if (var4 != null) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   public static BreezeClient getBreezeClient() {
      return breezeClient_b;
   }

   private void update(String var1) {
      long var2 = 86304161570344L;
      BreezeContext.runnable_m = this::setBool_l;
      BreezeContext.breezeUtil26_l = new ThreadUtil();
      BreezeContext.cloudAuthService_h = new CloudAuthService(var1, "https://breeze.rip");
      BreezeContext.iKeyCodeProvider_g = new KeyCodeImpl();
      BreezeContext.settingGroup_d = new rip.breeze.RenderUtil20();
      BreezeContext.iRenderer_b = new NanoVGRenderer();
      BreezeContext.iKeybindSettings_e = new KeybindSettings();
      BreezeContext.authSession_c = new AuthSession();
      BreezeContext.settingBuilder_i = new PreTickEvent();
      BreezeContext.moduleBase_a = new rip.breeze.Util137();
      BreezeContext.dataBuilder15_j = new rip.breeze.AnimationTimer();
      BreezeContext.dataBuilder15_j.processAll_2();
      BreezeContext.guiPanelSettings_f = new GuiPanelSettings();
   }

   public static boolean isValid() {
      long var0 = 5243319972210L;
      return getBreezeClient() == null || CONST_A == null || CONST_A.theWorld == null || CONST_A.thePlayer == null || CONST_A.gameSettings == null;
   }

   @KeepParameters
   public static ConfigManager getConfigManager() {
      return getBreezeClient().configManager_f;
   }

   @KeepParameters
   public static ModuleRegistry getModuleRegistry() {
      return getBreezeClient().moduleRegistry_c;
   }

   @KeepParameters
   public static ClickGUI getClickGUI() {
      return getBreezeClient().clickGUI_d;
   }

   @KeepParameters
   public static ModuleManager getModuleManager() {
      return getBreezeClient().moduleManager_e;
   }

   public static KeybindSettings getKeybindSettings() {
      return (KeybindSettings)BreezeContext.iKeybindSettings_e;
   }

   @KeepParameters
   public static ThemeManager getThemeManager() {
      return getBreezeClient().themeManager_g;
   }

   public static ModuleInitializer getModuleInitializer() {
      return getBreezeClient().moduleInitializer_i;
   }

   public static CloudSyncWorker getCloudSyncWorker() {
      return getBreezeClient().cloudSyncWorker_h;
   }

   public static AltManager getAltManager() {
      return getBreezeClient().altManager_j;
   }

   @KeepParameters
   public static PositionManager getPositionManager() {
      return getBreezeClient().positionManager_k;
   }

   public static void updateRotation(String var0) {
      long var1 = 37529615965326L;
      if (!isValid()) {
         CONST_A.thePlayer
            .addChatMessage(new ChatComponentText(ChatFormatting.BLUE + "[Breeze] " + ChatFormatting.RESET + var0));
      }
   }

   private void setBool_l() {
      this.fieldBool_l = true;
   }

   @KeepParameters
   public static void update_1() {
      long var0 = 94937078762446L;
      if (breezeClient_b.fieldBool_l) {
         breezeClient_b.fieldBool_l = false;
         breezeClient_b.processAll();
      }
   }

   public void processAll() {
      try {
         nativeInit();
      } catch (Throwable var3) {
      }

      BreezeContext.processAll();
      this.linkedBlockingQueue_m.forEach(Runnable::run);
      this.linkedBlockingQueue_m.clear();

      try {
         nativeStop();
      } catch (Throwable var2) {
      }
   }

   private boolean checkCondition() {
      long var1 = 124571500437415L;

      try {
         short var10001 = 2222;
         long var10002 = 6153112300511529643L ^ var1;
         Field var3 = GameSettings.class.getDeclaredField("field_74347_j");
         boolean var4 = var3.getBoolean(CONST_A.gameSettings);

         try {
            var3.setBoolean(CONST_A.gameSettings, true);
            if (!var4) {
               CONST_A.renderGlobal.loadRenderers();
            }
         } catch (Exception var5) {
            throw getException(var5);
         }

         return true;
      } catch (Exception var6) {
         return false;
      }
   }

   private static String getString() {
      return "offline";
   }

   @KeepName
   private static native void nativeInit();

   @KeepName
   private static native void nativeStop();

   static {
      initialize(null);
      long var0 = 90851605953311L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "Á?Ë{\u001cH)\u0011K´\u0015\u0083ÜëÛ\u001c¥§Ó\u0006\u0097þ7\bré\u0001\u009e$§#[Á¨PÐ\u008dÞÝ\u0084 \rò\u001eæ\u009e-d7\t\u009aãk«+e(íë×\u009czùçá~Ç\u0012×\\ªaý \u0010:\u000ekÈÓ\u0000ÉøC\u0084ÒB\u0015Ù\u009e«\u0096b¢¯wì\u001b\u0003\u0005eYÑ\u008b\u000eè";
      int var7 = "Á?Ë{\u001cH)\u0011K´\u0015\u0083ÜëÛ\u001c¥§Ó\u0006\u0097þ7\bré\u0001\u009e$§#[Á¨PÐ\u008dÞÝ\u0084 \rò\u001eæ\u009e-d7\t\u009aãk«+e(íë×\u009czùçá~Ç\u0012×\\ªaý \u0010:\u000ekÈÓ\u0000ÉøC\u0084ÒB\u0015Ù\u009e«\u0096b¢¯wì\u001b\u0003\u0005eYÑ\u008b\u000eè"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_P = var4;
            CONST_Q = new String[3];
            CONST_A = Minecraft.getMinecraft();
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   public static void initialize(String[] var0) {
      arr_n = var0;
   }

   public static String[] getConfigKeys() {
      return arr_n;
   }

   private static Exception getException(Exception var0) {
      return var0;
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

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23968;
      if (CONST_Q[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_R.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_R.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/Breeze", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_P[var3].getBytes("ISO-8859-1");
         CONST_Q[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Q[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_2(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getObject".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/Breeze" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
