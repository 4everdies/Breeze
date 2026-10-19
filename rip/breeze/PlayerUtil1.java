package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;

@ScriptNamespace(name = "breeze", description = "The breeze namespace.")
public class PlayerUtil1 {

   @JSFunction(
      value = "getModule",
      description = "Get a module by its name",
      returns = "The module, or null if no module was found.",
      params = "The name of the module."
   )
   public static ConfigUtil1_x getBreezeUtil9(String var0) {
      return StringBuilderUtil.getDataBuilder12(BreezeContext.moduleBase_a.getModuleByName(var0));
   }

   @JSGetter(value = "version", description = "The breeze version string.")
   public static String getString() {
      return Util140.buildString();
   }

   @JSGetter(value = "versionSimple", description = "Simplified version of the breeze version string.")
   public static String getString_2() {
      return Util140.buildString_2();
   }

   @JSGetter(value = "versionFull", description = "The full version string, includes git commit if its a beta release.")
   public static String getString_3() {
      return Util140.buildString_3();
   }

   @JSGetter(value = "mcVersion", description = "The version of minecraft we are currently running")
   public static String getString_4() {
      return Util140.string_d;
   }

   @JSFunction(value = "getUsername", returns = "The breeze username of the logged in user.")
   public static String getString_5() {
      long var0 = 11294517572051L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.noArgs();
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(3592272859120169416L, var0);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var3 = var10003;

      try {
         var4 = (UserInfo)var3.invoke(var5, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      return var4.string_a;
   }

   @JSFunction(value = "getRole", returns = "The breeze role of the logged in user.")
   public static String getString_6() {
      long var0 = 60124389045367L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.noArgs();
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-829104564869352340L, var0);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var3 = var10003;

      try {
         var4 = (UserInfo)var3.invoke(var5, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      return var4.userRole_c.name;
   }

   @JSFunction(value = "getRoleColor", returns = "The breeze role color of the logged in user.")
   public static RenderUtil4_x getBreezeUtil7() {
      long var0 = 45139265063797L;
      RenderUtil4_x var10000 = new RenderUtil4_x();
      CloudAuthService var10002 = BreezeContext.cloudAuthService_h;
      Object[] var10003 = rip.breeze.client.MathUtil8.noArgs();
      Method var10005 = rip.breeze.client.MathUtil8.getMethod_3(827662228978879342L, var0);
      Object[] var10004 = var10003;
      CloudAuthService var5 = var10002;
      Method var3 = var10005;

      try {
         var4 = (UserInfo)var3.invoke(var5, var10004);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      /* constructor call removed */
      return var10000;
   }

   @JSFunction(value = "getModules", returns = "A list of all loaded breeze modules.")
   public static ConfigUtil1_x[] getUsers() {
      ArrayList var0 = new ArrayList();

      for (BreezeModule var2 : BreezeContext.moduleBase_a.getAllModules()) {
         var0.add(StringBuilderUtil.getDataBuilder12(var2));
      }

      return var0.toArray(new ConfigUtil1_x[0]);
   }
}
