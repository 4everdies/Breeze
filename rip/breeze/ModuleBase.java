package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import rip.breeze.client.UserTheme;

public interface ModuleBase {
   long eka_1 = StringDecryptor.getIBreezeInterface3(8009632787786680358L, -6481112245011756872L, MethodHandles.lookup().lookupClass())
      .decryptKey(44199241934003L);

   default void processAll() {
      long var1 = 100870620607977L;
      int[] var10000 = EnumType32.values();
      CloudAuthService var10001 = BreezeContext.cloudAuthService_h;
      Object[] var10002 = rip.breeze.client.MathUtil8.noArgs();
      Method var10004 = rip.breeze.client.MathUtil8.getMethod_3(8494461354489045619L, var1);
      Object[] var10003 = var10002;
      CloudAuthService var14 = var10001;
      Method var12 = var10004;

      try {
         var13 = (UserTheme)var12.invoke(var14, var10003);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      UserTheme var3 = var13;
      Iterator var4 = this.getAllModules().iterator();
      int[] var5 = var10000;

      while (var4.hasNext()) {
         BreezeModule var6 = (BreezeModule)var4.next();
         var6.moduleName = this.getName(var6);
         var6.description = this.getDescription(var6);
         var6.aliases = this.getTags(var6);
         var6.categories.addAll(this.getModuleSettings(var6));
         if (var3.isValid(var6.moduleName)) {
            ImageUtil16.processNullable(var6, var3.getUserTheme(var6.moduleName));
         }

         String var7 = var6.moduleName.toLowerCase();
         StringJoiner var8 = new StringJoiner(" ");
         var8.add(var7);
         var8.add(Util7.buildString(var6.moduleName));
         Iterator var9 = var6.aliases.iterator();

         while (true) {
            if (var9.hasNext()) {
               String var10 = (String)var9.next();
               var8.add(var10.toLowerCase());
               if (var5 == null) {
                  continue;
               }
            }

            var6.string_h = var8.toString();
            if (var5 != null) {
               return;
            }
            break;
         }
      }
   }

   String getName(BreezeModule var1);

   String getDescription(BreezeModule var1);

   Set<String> getTags(BreezeModule var1);

   Set<ModuleCategory> getModuleSettings(BreezeModule var1);

   @KeepParameters
   <T extends BreezeModule> T getModuleByClass(Class<T> var1);

   <T extends BreezeModule> T getModuleByName(String var1);

   default List<BreezeModule> getList(String var1) {
      long var2 = 14275317357228L;
      String var4 = var1.toLowerCase();
      ArrayList var5 = new ArrayList();
      IdentityHashMap var6 = new IdentityHashMap();
      int[] var10000 = EnumType32.values();
      Iterator var7 = this.getAllModules().iterator();
      int[] var8 = var10000;

      while (var7.hasNext()) {
         BreezeModule var9 = (BreezeModule)var7.next();
         float var10 = this.getFloat(var9, var4);
         if (!(var10 <= 0.0F)) {
            var5.add(var9);
            var6.put(var9, var10);
            if (var8 != null) {
               break;
            }
         }
      }

      var5.sort(ModuleBase::lambda$search_Inner0);
      return var5;
   }

   default float getFloat(BreezeModule var1, String var2) {
      long var3 = 17137698769549L;
      if (!var2.isEmpty() && var1.string_h != null) {
         String var5 = var1.string_h;
         int var6 = var1.moduleName.length();
         if (var6 == var2.length() && var5.startsWith(var2)) {
            return 10.0F;
         } else if (var5.startsWith(var2)) {
            return 7.0F;
         } else if (var5.substring(0, var6).contains(var2)) {
            return 5.0F;
         } else {
            return var5.contains(var2) ? 3.0F : 0.0F;
         }
      } else {
         return 0.0F;
      }
   }

   Collection<BreezeModule> getAllModules();

   private static int lambda$search_Inner0(Map var0, BreezeModule var1, BreezeModule var2) {
      return Float.compare((Float)var0.get(var1), (Float)var0.get(var2));
   }
}
