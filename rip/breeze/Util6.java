package rip.breeze;

import java.lang.invoke.MethodHandles;

public class Util6 {
   public static final char[] CONST_A = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};

   public static boolean isValid(char var0) {
      long var1 = 32664396568723L;
      return var0 != 167 && var0 >= ' ' && var0 != 127;
   }

   public static String buildString(String var0) {
      long var1 = 29030527448426L;
      StringBuilder var3 = new StringBuilder();
      String[] var10000 = RenderUtil1.decrypt();
      char[] var4 = var0.toCharArray();
      int var5 = var4.length;
      int var6 = 0;
      String[] var7 = var10000;

      while (var6 < var5) {
         char var8 = var4[var6];
         if (isValid(var8)) {
            var3.append(var8);
         }

         var6++;
         if (var7 != null) {
            break;
         }
      }

      return var3.toString();
   }
}
