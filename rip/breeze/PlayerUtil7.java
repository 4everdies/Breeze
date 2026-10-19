package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.UserTheme;

public class PlayerUtil7 {
   private x x_a = x.TOP_LEFT;
   private double double_b;
   private double double_c;
   private int fieldInt_d;
   private int fieldInt_e;
   public static final Function<String, PlayerUtil7> CONST_F;
   public static final Function<PlayerUtil7, String> CONST_G;
   private static final String[] CONST_I;
   private static final String[] CONST_J;
   private static final Map CONST_K = new HashMap(13);

   public PlayerUtil7() {
      this.double_b = this.double_c = 0.2F;
   }

   public PlayerUtil7(String var1) {
      long var2 = 35457176032317L;
      long var4 = var2 ^ 107683670148543L;
      long var10001 = var2 ^ 56699947772794L;
      int var6 = (int)((var2 ^ 56699947772794L) >>> 48);
      int var7 = (int)((var2 ^ 56699947772794L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 26653543736076L;
      long var11 = var2 ^ 14399732108159L;
      super();
      UserTheme var13 = new rip.breeze.client.Util139().getDataBuilder2(var1, var4).getUserTheme(var9);
      this.x_a = x.valueOf(var13.getDataBuilder2_2("quadrant").buildString((char)var6, var7, (short)var8));
      this.double_b = var13.getDataBuilder2_2("x").getDouble(var11);
      this.double_c = var13.getDataBuilder2_2("y").getDouble(var11);
   }

   public void calculate(int var1, int var2) {
      String[] var5;
      label55: {
         long var3 = 27103219480582L;
         var5 = RangeValue.values();
         if (var1 < BreezeContext.settingGroup_d.getOrder() / 2) {
            this.x_a = var2 < BreezeContext.settingGroup_d.getCount() / 2 ? x.TOP_LEFT : x.BOTTOM_LEFT;
            if (var5 == null) {
               break label55;
            }

            LicenseState.toggle(LicenseState.isValid_2());
         }

         this.x_a = var2 < BreezeContext.settingGroup_d.getCount() / 2 ? x.TOP_RIGHT : x.BOTTOM_RIGHT;
      }

      label60: {
         if (this.x_a == x.TOP_LEFT || this.x_a == x.BOTTOM_LEFT) {
            this.double_b = (var1 - this.fieldInt_d * 0.5F) / BreezeContext.settingGroup_d.getOrder();
            if (var5 == null) {
               break label60;
            }
         }

         this.double_b = (var1 + this.fieldInt_d * 0.5F) / BreezeContext.settingGroup_d.getOrder();
      }

      if (this.x_a == x.TOP_LEFT || this.x_a == x.TOP_RIGHT) {
         this.double_c = (var2 - this.fieldInt_e * 0.5F) / BreezeContext.settingGroup_d.getCount();
         if (var5 == null) {
            return;
         }
      }

      this.double_c = (var2 + this.fieldInt_e * 0.5F) / BreezeContext.settingGroup_d.getCount();
   }

   public void initialize(int var1, int var2) {
      this.fieldInt_d = var1;
      this.fieldInt_e = var2;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int calculate_2() {
      long var1 = 89979020340564L;
      switch (cG.a[this.x_a.ordinal()]) {
         case 1:
         case 2:
            return (int)(this.double_b * BreezeContext.settingGroup_d.getOrder());
         case 3:
         case 4:
            return (int)(this.double_b * BreezeContext.settingGroup_d.getOrder() - this.fieldInt_d);
         default:
            return 0;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int calculate_3() {
      long var1 = 2742033984050L;
      switch (cG.a[this.x_a.ordinal()]) {
         case 1:
         case 3:
            return (int)(this.double_c * BreezeContext.settingGroup_d.getCount() - this.fieldInt_e);
         case 2:
         case 4:
            return (int)(this.double_c * BreezeContext.settingGroup_d.getCount());
         default:
            return 0;
      }
   }

   private static String lambda$static_Inner0(PlayerUtil7 var0) {
      long var1 = 26123832709513L;
      long var3 = var1 ^ 91764238284337L;
      long var5 = var1 ^ 78441692121318L;
      UserTheme var7 = new UserTheme();
      var7.update("quadrant", var0.x_a.name(), var5);
      var7.runCloudJob(var3, "x", var0.double_b);
      var7.runCloudJob(var3, "y", var0.double_c);
      return var7.toString();
   }

   static {
      long var0 = 93044569969721L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = ":¸üö\u000f\u000f\u0015\u0002vÅ=ÿèzhg\u00168£\u0013\u0093õ\u009b\\C\u0019¥°æu¦<\u0018¾\u001fk´.\u00943h&\u0096g§\u0090\u0097,[:\u0096£´Þ|à\u0080";
      int var7 = ":¸üö\u000f\u000f\u0015\u0002vÅ=ÿèzhg\u00168£\u0013\u0093õ\u009b\\C\u0019¥°æu¦<\u0018¾\u001fk´.\u00943h&\u0096g§\u0090\u0097,[:\u0096£´Þ|à\u0080"
         .length();
      char var8 = ' ';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_I = var4;
            CONST_J = new String[2];
            CONST_F = PlayerUtil7::new;
            CONST_G = PlayerUtil7::lambda$static_Inner0;
            return;
         }

         var8 = var6.charAt(var9);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26655;
      if (CONST_J[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_K.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_K.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cF", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_I[var3].getBytes("ISO-8859-1");
         CONST_J[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_J[var3];
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
         throw new RuntimeException("rip/breeze/cF" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
