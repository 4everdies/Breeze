package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(name = "ModeSetting", superName = "Setting", description = "A mode setting.", group = "breeze/settings")
public class ModeSetting extends Setting<Enum<?>> {
   private final StringOption breezeUtil14_l = null;
   private final GenericSetting<StringOption> dataBuilder54_m = null;
   private static final String CONST_W;

   public ModeSetting(GenericSetting<Enum<?>> var1) {
      super(var1, null);
   }

   @JSConstructor(
      params = {
            "Can either be 'script' or a subgroup.",
            "The name of the setting.",
            "The description of the setting.",
            "The default mode of the setting.",
            "An array of possible mode for the setting."
      }
   )
   public ModeSetting(Object var1, String var2, String var3, String var4, String[] var5) {
      long var6 = 62002056917167L;
      super(null, BreezeContext.dataBuilder15_j.getDataBuilder17_f());
      if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() == null) {
         throw new IllegalStateException(CONST_W);
      }

      this.breezeUtil14_l = new StringOption(var4, var5);
      String[] var8 = this.breezeUtil14_l.getArr_b();
      this.dataBuilder54_m = GenericSetting.<StringOption>getDataBuilder50(b(var1), var2)
         .getDataBuilder50_3(var3)
         .getDataBuilder50_2(this.breezeUtil14_l)
         .getDataBuilder50_5(ModeSetting::lambda$new_Inner0)
         .getDataBuilder50_6(ModeSetting::lambda$new_Inner1)
         .getDataBuilder50_9(this::checkCondition)
         .getDataBuilder54();
   }

   @JSFunction(
      value = "is",
      description = "Check if the requested mode is the current one.",
      returns = "True if the mode is currently selected",
      params = "The mode you want to check."
   )
   public boolean isValid(String var1) {
      try {
         if (this.dataBuilder54_m == null) {
            return super.dataBuilder54_i.formatter.apply(super.dataBuilder54_i.getObject_m()).equalsIgnoreCase(var1);
         }
      } catch (IllegalStateException var2) {
         throw getIllegalStateException(var2);
      }

      return this.dataBuilder54_m.getObject_m().getString_a().equalsIgnoreCase(var1);
   }

   @JSFunction(value = "setValue", params = "The mode you want to set the setting to.")
   public void processAll(String var1) {
      try {
         if (this.dataBuilder54_m == null) {
            super.dataBuilder54_i.processAll_3(var1);
            return;
         }
      } catch (IllegalStateException var2) {
         throw getIllegalStateException(var2);
      }

      this.dataBuilder54_m.processAll_3(var1);
   }

   @JSFunction(value = "getValue", returns = "The name of the currently selected mode.")
   @Override
   public String getString() {
      try {
         if (this.dataBuilder54_m == null) {
            return super.dataBuilder54_i.formatter.apply(super.dataBuilder54_i.getObject_m());
         }
      } catch (IllegalStateException var1) {
         throw getIllegalStateException(var1);
      }

      return this.dataBuilder54_m.getObject_m().getString_a();
   }

   @JSFunction(value = "name", returns = "The name of the setting.")
   @Override
   public String getString_2() {
      try {
         if (this.dataBuilder54_m == null) {
            return super.getString();
         }
      } catch (IllegalStateException var1) {
         throw getIllegalStateException(var1);
      }

      return this.dataBuilder54_m.string_b;
   }

   @JSFunction(value = "description", returns = "The description of the setting.")
   public String getString_3() {
      try {
         if (this.dataBuilder54_m == null) {
            return super.getString();
         }
      } catch (IllegalStateException var1) {
         throw getIllegalStateException(var1);
      }

      return this.dataBuilder54_m.string_b;
   }

   private static StringOption lambda$new_Inner1(String[] var0, String var1) {
      for (String var5 : var0) {
         try {
            if (var5.equalsIgnoreCase(var1)) {
               return new StringOption(var5, var0);
            }
         } catch (IllegalStateException var7) {
            throw getIllegalStateException(var7);
         }
      }

      StringOption var10000;
      StringOption var10001;
      String var10002;
      label24: {
         try {
            var10000 = new StringOption();
            var10001 = var10000;
            if (var0.length > 0) {
               var10002 = var0[0];
               break label24;
            }
         } catch (IllegalStateException var6) {
            throw getIllegalStateException(var6);
         }

         var10002 = var1;
      }

      /* constructor call removed */
      return var10000;
   }

   private static String lambda$new_Inner0(StringOption var0) {
      return var0.getString_a();
   }

   static {
      long var0 = 49160310231645L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "þ_eã\u008cQµ§ût9]Ò¬\tg-È¯òà7ó\u001d{úý×JñT¸!OþhÎ»- \u0002GÖn\u00929IÓ\u0015¢h«\u0089ð¡M\t\u009eVÉ\u0013e[#".getBytes("ISO-8859-1")
      );
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_W = var5;
   }

   private static IllegalStateException getIllegalStateException(IllegalStateException var0) {
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
}
