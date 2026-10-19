package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.settings.KeyBinding;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.KeepParameters;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "Sprint", b = "Automatically sprints for you.", d = rip.breeze.ModuleCategory.MOVEMENT)
public class Sprint extends BreezeModule {
   private final GenericSetting<EnumType9> alwaysSetting;
   private boolean fieldBool_o;
   private boolean fieldBool_p;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);

   public Sprint() {
      long var1 = 32531295639454L;
      super();
      short var10002 = 14321;
      long var10003 = 3363835965778568708L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Always");
      var10002 = 16285;
      var10003 = 5683592555106676333L ^ var1;
      this.alwaysSetting = var10001.getDataBuilder50_3("How the sprint module should operate.").getDataBuilder50_4(EnumType9.ALWAYS).getDataBuilder54();
      this.fieldBool_o = false;
      this.fieldBool_p = false;
   }

   @KeepParameters
   public boolean checkCondition() {
      long var1 = 54629170430996L;
      return this.fieldBool_o && this.f();
   }

   @Override
   public String getString() {
      long var1 = 94639785842642L;
      switch (Util121.CONST_A[this.alwaysSetting.getObject_m().ordinal()]) {
         case 1:
            return "Always";
         case 2:
            return this.fieldBool_p ? "Toggled" : "Off";
         default:
            return null;
      }
   }

   @EventListener(a = rip.breeze.Priority.HIGH)
   public void updateRotation(PreTickEventEvent var1) {
      label22: {
         long var2 = 13742538661357L;
         String var4 = ScaffoldUtils.getString_2();
         if (this.alwaysSetting.isValid(EnumType9.ALWAYS)) {
            KeyBinding.setKeyBindState(BreezeClient.CONST_A.gameSettings.keyBindSprint.getKeyCode(), true);
            if (var4 != null) {
               break label22;
            }
         }

         if (BreezeClient.CONST_A.gameSettings.keyBindSprint.isKeyDown() != this.fieldBool_p && this.fieldBool_p) {
            this.fieldBool_o = !this.fieldBool_o;
            if (!this.fieldBool_o) {
               KeyBinding.setKeyBindState(BreezeClient.CONST_A.gameSettings.keyBindSprint.getKeyCode(), false);
               BreezeClient.CONST_A.thePlayer.setSprinting(false);
            }
         }
      }

      this.fieldBool_p = BreezeClient.CONST_A.gameSettings.keyBindSprint.isKeyDown();
   }

   public void toggle() {
      this.fieldBool_o = false;
   }

   static {
      long var0 = 131000519582576L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[5];
      int var5 = 0;
      String var6 = "ÿ\u0015]\u0088\\;ÌQýlÑÔÔG,{8\u009eøÍê\u0095w¬aªáðØf\u0088\u001fC)w\"\u000e%ÀG\u000f®¥¸\\¡²3y®Ziv\u000bÃx3\u000f²puêûçd\u0081è^/\u0010&Å\u0007\u0010JÙT\u0096.Ç\u0003¤Á\u0006\u0092\u00969\u0093ûo";
      int var7 = "ÿ\u0015]\u0088\\;ÌQýlÑÔÔG,{8\u009eøÍê\u0095w¬aªáðØf\u0088\u001fC)w\"\u000e%ÀG\u000f®¥¸\\¡²3y®Ziv\u000bÃx3\u000f²puêûçd\u0081è^/\u0010&Å\u0007\u0010JÙT\u0096.Ç\u0003¤Á\u0006\u0092\u00969\u0093ûo"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_R = var4;
                     CONST_S = new String[5];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "¤=\u008bã\u009c(0ÈEø\u000eÅ\u0015ç\u008bk\u0010Eéãú\rX_Ú¸½ñ«fÂê\u000e";
                  var7 = "¤=\u008bã\u009c(0ÈEø\u000eÅ\u0015ç\u008bk\u0010Eéãú\rX_Ú¸½ñ«fÂê\u000e".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1647;
      if (CONST_S[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_T.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_T.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dZ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_R[var3].getBytes("ISO-8859-1");
         CONST_S[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_S[var3];
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
         throw new RuntimeException("rip/breeze/client/dZ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
