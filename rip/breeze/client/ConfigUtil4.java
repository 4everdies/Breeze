package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import rip.breeze.BreezeModule;
import rip.breeze.StringDecryptor;

final class ConfigUtil4 extends Util118 {
   final BreezeModule dataBuilder52_g;
   String string_h;
   final ModuleList moduleList_i;

   ConfigUtil4(ModuleList var1, BreezeModule var2) {
      long var3 = 111667633722269L;
      this.moduleList_i = var1;
      super(var1, null);
      this.string_h = "";
      this.dataBuilder52_g = var2;
      this.b = ModuleList.getString_2(var1, var2);
      this.string_h = ModuleList.getWatermarkSetting(var1).getObject_m() ? ModuleList.getString_3(var2.getString_2()) : "";
      this.d = false;
      this.e = true;
   }

   boolean isValid() {
      return this.dataBuilder52_g.isValid();
   }
}
