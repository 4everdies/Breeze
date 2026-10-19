package rip.breeze;

import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class FileUtil1 {

   private FileUtil1() {
   }

   public static Path getPath(String var0, String... var1) {
      long var2 = 100623425670156L;
      String var4 = BreezeContext.settingGroup_d.getOrDefault(var0, var1);
      return var4 == null ? null : Paths.get(var4);
   }
}
