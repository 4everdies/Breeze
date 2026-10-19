package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.annotations.JSFunction;
import ru.paul.breeze.BreezeBoot;

@ScriptObject(name = "Module", description = "A module, can be used to get information about the module.", group = "breeze")
public class ConfigUtil1_x extends StringBuilderUtil<BreezeModule> {
   private static final String CONST_Q;

   public ConfigUtil1_x(BreezeModule var1) {
      super(var1);
   }

   @JSFunction(value = "getName", description = "Returns the name of the module.")
   public String getString() {
      return ((BreezeModule)this.i).moduleName;
   }

   @JSFunction(value = "enabled", description = "Returns whether the module is enabled or not.")
   public boolean isValid() {
      return ((BreezeModule)this.i).isValid();
   }

   public void initialize() {
      ((BreezeModule)this.i).processAll();
      BreezeBoot.notifyToggle(super.i);
   }

   @JSFunction(value = "enable", description = "Enables the module.")
   public void initialize_2() {
      ((BreezeModule)this.i).initialize(true);
   }

   @JSFunction(value = "disable", description = "Disables the module.")
   public void initialize_3() {
      ((BreezeModule)this.i).initialize(false);
   }

   @JSFunction(value = "getSetting", description = "Returns a setting by name.")
   public Setting<?> getDataBuilder20(String var1) {
      GenericSetting var2 = ((BreezeModule)this.i).a(var1);
      if (var2 == null) {
         return null;
      } else if (var2.object_d instanceof Boolean) {
         return new BooleanSetting(var2);
      } else if (var2.object_d instanceof Double) {
         return new DoubleSetting(var2);
      } else if (var2.object_d instanceof Integer) {
         return new IntSetting(var2);
      } else if (var2.object_d instanceof Enum) {
         return new ModeSetting(var2);
      } else if (var2.object_d instanceof RangeValue) {
         return new RangeSetting(var2);
      } else {
         return var2.object_d instanceof BreezeColor ? new ColorSetting(var2) : null;
      }
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_Q;
   }

   static {
      long var0 = 129384406083940L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ä6\u0007Þ\u000e*Ø?".getBytes("ISO-8859-1"));
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
