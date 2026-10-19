package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import rip.breeze.StringDecryptor;

final class ConfigUtil3_x extends Util118 {
   final rip.breeze.ImageUtil15 dataBuilder17_g;
   String string_h;
   final ModuleList moduleList_i;

   ConfigUtil3_x(ModuleList var1, rip.breeze.ImageUtil15 var2) {
      long var3 = 100905082872043L;
      this.moduleList_i = var1;
      super(var1, null);
      this.string_h = "";
      this.dataBuilder17_g = var2;
      this.b = ModuleList.getString_4(var1, var2);
      this.string_h = ModuleList.getWatermarkSetting(var1).getObject_m() ? ModuleList.getString_3(var2.getString()) : "";
      this.d = false;
      this.e = true;
   }

   boolean isValid() {
      return this.dataBuilder17_g.isValid();
   }
}
