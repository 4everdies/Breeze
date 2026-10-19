package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class BreezeContext {
   public static ModuleBase moduleBase_a;
   public static IRenderer iRenderer_b;
   public static AuthSession authSession_c;
   public static SettingGroup settingGroup_d;
   public static IKeybindSettings iKeybindSettings_e;
   public static GuiPanelSettings guiPanelSettings_f;
   public static IKeyCodeProvider iKeyCodeProvider_g;
   public static CloudAuthService cloudAuthService_h;
   public static SettingBuilder settingBuilder_i;
   public static AnimationTimer dataBuilder15_j;
   public static MicrosoftAuth microsoftAuth_k;
   public static ThreadUtil breezeUtil26_l;
   public static Runnable runnable_m;
   private static String[] arr_n;

   public static void processAll() {
      long var0 = 79933332898073L;
      String[] var10000 = getStateArray();
      CloudAuthService var10001 = cloudAuthService_h;
      Object[] var10002 = rip.breeze.client.MathUtil8.buildArgs1(ImageUtil16.getUserTheme_3());
      Method var10004 = rip.breeze.client.MathUtil8.getMethod_3(-4533058546529043070L, var0);
      Object[] var10003 = var10002;
      CloudAuthService var8 = var10001;
      Method var5 = var10004;

      try {
         var5.invoke(var8, var10003);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      iRenderer_b.resetState();
      var10001 = cloudAuthService_h;
      var10002 = rip.breeze.client.MathUtil8.noArgs();
      var10004 = rip.breeze.client.MathUtil8.getMethod_3(-4532929361740141196L, var0);
      var10003 = var10002;
      CloudAuthService var10 = var10001;
      Method var7 = var10004;

      try {
         var7.invoke(var10, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      microsoftAuth_k.update();
      breezeUtil26_l.initialize_4();
      String[] var2 = var10000;
      if (var2 == null) {
         LicenseState.toggle(LicenseState.checkCondition());
      }
   }

   public static void initialize(String[] var0) {
      arr_n = var0;
   }

   public static String[] getStateArray() {
      return arr_n;
   }

   static {
      if (getStateArray() == null) {
         initialize(new String[3]);
      }
   }
}
