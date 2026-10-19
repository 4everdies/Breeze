package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.item.ItemStack;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util8;

@ModuleInfo(
   a = "InventoryHUD",
   b = "Displays your inventory (excluding hotbar and armor slots).",
   d = rip.breeze.ModuleCategory.HUD,
   c = {"inventory", "items", "slots", "hud"}
)
public class InventoryHUD extends BreezeModule implements rip.breeze.IBreezeInterface2 {
   private final GenericSetting<Boolean> backgroundSetting;
   private final GenericSetting<Double> roundingSetting;
   private final ModuleManager moduleManager_p;
   private final rip.breeze.RotationUtil8 dataBuilder14_q;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);

   public InventoryHUD() {
      long var1 = 116515745882666L;
      super(false, false);
      short var10002 = 3458;
      long var10003 = 3950637320980449311L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Background");
      var10002 = 29626;
      var10003 = 1945188086385161766L ^ var1;
      this.backgroundSetting = var10001.getDataBuilder50_3("Draw a background behind the items.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 25109;
      var10003 = 789699316742530955L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Rounding");
      var10002 = 21368;
      var10003 = 8703724421209593575L ^ var1;
      this.roundingSetting = var10001.getDataBuilder50_3("Corner rounding of the background.")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 2.0))
         .getDataBuilder50_9(this::lambda$new_Inner0)
         .getDataBuilder54();
      this.moduleManager_p = BreezeClient.getModuleManager();
      this.dataBuilder14_q = new rip.breeze.RotationUtil8(this, rip.breeze.AimYawMode.CENTER, rip.breeze.AimYawMode2.BOTTOM, 0.0, 10.0);
   }

   public rip.breeze.RotationUtil8 getDataBuilder14() {
      return this.dataBuilder14_q;
   }

   public int calculate() {
      return 2 * this.calculate_6() + 9 * this.clamp() + 8 * this.calculate_5();
   }

   public int calculate_2() {
      return 2 * this.calculate_6() + 3 * this.clamp() + 2 * this.calculate_5();
   }

   public void calculate_3(List<Util8> var1) {
      long var2 = 123025407946278L;
      if (this.backgroundSetting.getObject_m()) {
         float var4 = (float)(3.0F * this.moduleManager_p.fieldInt_l * this.roundingSetting.getObject_m());
         var1.add(new Util8(this.dataBuilder14_q.clamp_2(), this.dataBuilder14_q.clamp_3(), this.calculate(), this.calculate_2(), var4));
      }
   }

   public void calculate_4() {
      long var1 = 83095202467719L;
      int[] var3 = ModuleList.values();
      if (BreezeClient.CONST_A.thePlayer != null) {
         ItemStack[] var4 = BreezeClient.CONST_A.thePlayer.inventory.mainInventory;
         int var5 = this.clamp();
         int var6 = var5 + this.calculate_5();
         int var7 = this.dataBuilder14_q.clamp_2() + this.calculate_6();
         int var8 = this.dataBuilder14_q.clamp_3() + this.calculate_6();
         int var9 = 0;

         while (var9 < 3) {
            int var10 = var8 + var9 * var6;
            int var11 = 0;

            while (true) {
               if (var11 < 9) {
                  RenderUtil28.calculate_12(var4[9 + var9 * 9 + var11], var7 + var11 * var6, var10, var5, true);
                  var11++;
                  if (var3 != null) {
                     continue;
                  }
               }

               var9++;
               if (var3 == null) {
                  return;
               }
               break;
            }
         }
      }
   }

   private int clamp() {
      return Math.max(1, 16 * this.moduleManager_p.fieldInt_l);
   }

   private int calculate_5() {
      return 2 * this.moduleManager_p.fieldInt_l;
   }

   private int calculate_6() {
      return 4 * this.moduleManager_p.fieldInt_l;
   }

   private boolean lambda$new_Inner0(rip.breeze.DateUtil var1) {
      return this.backgroundSetting.getObject_m();
   }

   static {
      long var0 = 42152142602777L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "\u009d\u009dÑsÃ!\u0000É\u0004·lªÞ\u0086uØ\u0002çSX#\u00824o@ÉQ:áN\t«j@]Ð\u0011óFKÝ\u00ad\u009c\u001e\u0084\u009a\u000e%Ãd\u00ad\u000f¬\u0084²\u0005<GL¢U\u000eÛ\u0090ÔUÍ¶ª\u008aÚ>q\u001cý\u0097\u0016¥\u009evº°×\u0002\u001b«ôøs";
      int var7 = "\u009d\u009dÑsÃ!\u0000É\u0004·lªÞ\u0086uØ\u0002çSX#\u00824o@ÉQ:áN\t«j@]Ð\u0011óFKÝ\u00ad\u009c\u001e\u0084\u009a\u000e%Ãd\u00ad\u000f¬\u0084²\u0005<GL¢U\u000eÛ\u0090ÔUÍ¶ª\u008aÚ>q\u001cý\u0097\u0016¥\u009evº°×\u0002\u001b«ôøs"
         .length();
      char var8 = 24;
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
                     CONST_S = var4;
                     CONST_T = new String[4];
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

                  var6 = "_©\u000f\u008b§¥¹ 0I¿¬vÿ©o\u009c\u009a`\u0095°\r;\u008a\u0016ôôv$\u0013u¯ì\u0000\rg\u008a\u001a,òäëgeÏLçråð R\u0001Ý\t\u001aö¿lbæ~\u008e\u001e ½7V©\u0095Õx$·\"\u0082V \u0091mÆn\u0012\u0006\u009c\u0006Ìuæ\u0010ÛR\"K¼\u001aÓ";
                  var7 = "_©\u000f\u008b§¥¹ 0I¿¬vÿ©o\u009c\u009a`\u0095°\r;\u008a\u0016ôôv$\u0013u¯ì\u0000\rg\u008a\u001a,òäëgeÏLçråð R\u0001Ý\t\u001aö¿lbæ~\u008e\u001e ½7V©\u0095Õx$·\"\u0082V \u0091mÆn\u0012\u0006\u009c\u0006Ìuæ\u0010ÛR\"K¼\u001aÓ"
                     .length();
                  var8 = '@';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10167;
      if (CONST_T[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_U.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_U.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dw", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_S[var3].getBytes("ISO-8859-1");
         CONST_T[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_T[var3];
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
         throw new RuntimeException("rip/breeze/client/dw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
