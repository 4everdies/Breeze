package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.CloudAuthService;
import rip.breeze.LicenseState;
import rip.breeze.ModuleInfo;
import rip.breeze.RenderUtil18_x;
import rip.breeze.StringDecryptor;
import rip.breeze.UserInfo;
import rip.breeze.Util8;

@ModuleInfo(a = "WaterMark", b = "Shows a watermark on the screen.", d = rip.breeze.ModuleCategory.HUD)
public class WaterMark extends BreezeModule implements rip.breeze.IBreezeInterface2 {
   private final rip.breeze.RotationUtil8 dataBuilder14_n = new rip.breeze.RotationUtil8(
      this, rip.breeze.AimYawMode.CENTER, rip.breeze.AimYawMode2.TOP, 0.0, 5.0
   );
   private ModuleManager moduleManager_o = BreezeClient.getModuleManager();
   private static final String[] CONST_Q;
   private static final String[] CONST_R;
   private static final Map CONST_S = new HashMap(13);

   public WaterMark() {
      super(false, false);
   }

   public int clamp() {
      try {
         long var1 = 103577559919591L;
         int var10000 = 75 * this.moduleManager_o.fieldInt_l
            + Math.max(
               this.moduleManager_o.dataBuilder46_j.clamp_8("Breeze"),
               this.moduleManager_o.dataBuilder46_j.clamp_8(rip.breeze.Util140.buildString())
            );
         MathUtil10 var10001 = this.moduleManager_o.dataBuilder46_j;
         CloudAuthService var10002 = BreezeContext.cloudAuthService_h;
         Object[] var10003 = MathUtil8.noArgs();
         Method var10005 = MathUtil8.getMethod_3(7777159448916470780L, var1);
         Object[] var10004 = var10003;
         CloudAuthService var13 = var10002;
         Method var10 = var10005;

         try {
            var11 = (UserInfo)var10.invoke(var13, var10004);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         int var9 = var10001.clamp_8(var11.string_a);
         MathUtil10 var12 = this.moduleManager_o.dataBuilder46_j;
         CloudAuthService var14 = BreezeContext.cloudAuthService_h;
         var10004 = MathUtil8.noArgs();
         Method var10006 = MathUtil8.getMethod_3(7777159448916470780L, var1);
         Object[] var19 = var10004;
         CloudAuthService var18 = var14;
         Method var15 = var10006;

         try {
            var10003 = (UserInfo)var15.invoke(var18, var19);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         return var10000 + Math.max(var9, var12.clamp_8(var10003.userRole_c.name));
      } finally {
         return 0;
      }
   }

   public int calculate() {
      try {
         return 30 * this.moduleManager_o.fieldInt_l;
      } finally {
         return 0;
      }
   }

   public rip.breeze.RotationUtil8 getDataBuilder14() {
      return this.dataBuilder14_n;
   }

   public void calculate_2(List var1) {
      try {
         int var2 = 15 * this.moduleManager_o.fieldInt_l;
         var1.add(new Util8(this.dataBuilder14_n.clamp_2(), this.dataBuilder14_n.clamp_3(), this.clamp(), this.calculate(), var2));
      } finally {
         return;
      }
   }

   public void clamp_2() {
      try {
         long var1 = 83095202467719L;
         int var3 = this.dataBuilder14_n.clamp_2();
         int var4 = this.dataBuilder14_n.clamp_3();
         RenderUtil28.processNullable_4(
            "svgs/logo.svg",
            var3 + 10.0F * this.moduleManager_o.fieldInt_l,
            var4 + 5.5F * this.moduleManager_o.fieldInt_l,
            this.moduleManager_o.fieldInt_l * 0.19F,
            Color.WHITE
         );
         this.moduleManager_o
            .dataBuilder46_j
            .update_1(
               var3 + 47 * this.moduleManager_o.fieldInt_l,
               var4 + this.moduleManager_o.fieldInt_l * 6,
               RenderUtil18_x.GLOW + "Breeze"
            );
         this.moduleManager_o
            .dataBuilder46_j
            .update(var3 + 47 * this.moduleManager_o.fieldInt_l, var4 + this.moduleManager_o.fieldInt_l * 16, rip.breeze.Util140.buildString(), Color.LIGHT_GRAY);
         ModuleList.values();
         int var5 = Math.max(
            this.moduleManager_o.dataBuilder46_j.clamp_8("Breeze"),
            this.moduleManager_o.dataBuilder46_j.clamp_8(rip.breeze.Util140.buildString())
         );
         RenderUtil28.render(
            var3 + 55 * this.moduleManager_o.fieldInt_l + var5,
            var4 + this.moduleManager_o.fieldInt_l * 3,
            this.moduleManager_o.fieldInt_l,
            this.calculate() - this.moduleManager_o.fieldInt_l * 6,
            this.moduleManager_o.fieldInt_l * 2,
            new Color(100, 100, 100, 100)
         );
         MathUtil10 var10000 = this.moduleManager_o.dataBuilder46_j;
         float var10001 = var3 + 62 * this.moduleManager_o.fieldInt_l + var5;
         float var10002 = var4 + this.moduleManager_o.fieldInt_l * 6;
         CloudAuthService var10003 = BreezeContext.cloudAuthService_h;
         Object[] var10004 = MathUtil8.noArgs();
         Method var10006 = MathUtil8.getMethod_3(-8102520025181466724L, var1);
         Object[] var10005 = var10004;
         CloudAuthService var24 = var10003;
         Method var18 = var10006;

         try {
            var19 = (UserInfo)var18.invoke(var24, var10005);
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         var10000.update(var10001, var10002, var19.string_a, Color.WHITE);
         var10000 = this.moduleManager_o.dataBuilder46_j;
         var10001 = var3 + 62 * this.moduleManager_o.fieldInt_l + var5;
         var10002 = var4 + this.moduleManager_o.fieldInt_l * 16;
         var10003 = BreezeContext.cloudAuthService_h;
         var10004 = MathUtil8.noArgs();
         var10006 = MathUtil8.getMethod_3(-8102520025181466724L, var1);
         var10005 = var10004;
         CloudAuthService var26 = var10003;
         Method var21 = var10006;

         try {
            var22 = (UserInfo)var21.invoke(var26, var10005);
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         String var23 = var22.userRole_c.name;
         CloudAuthService var27 = BreezeContext.cloudAuthService_h;
         var10005 = MathUtil8.noArgs();
         Method var10007 = MathUtil8.getMethod_3(-8102520025181466724L, var1);
         Object[] var34 = var10005;
         CloudAuthService var32 = var27;
         Method var28 = var10007;

         try {
            var10004 = (UserInfo)var28.invoke(var32, var34);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         var10000.update(var10001, var10002, var23, var10004.userRole_c.color);
         if (!LicenseState.isValid_2()) {
            ModuleList.initialize(new int[3]);
         }
      } finally {
         return;
      }
   }

   static {
      long var0 = 106123545171229L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "\u000bHí\u0092è\u00158¸Poµ\u0018RÓÜ° 2MÒ¹VÑw\u008a\u00ad\u007f¢pïÍ\u0090\u0092®ä¢ P\n{f¿0\u001føh·\u0084\u0001\u0010<=aÏôÁâ\u0082O\u0004ù\u0007\u0094Ó\u008bâ";
      int var7 = "\u000bHí\u0092è\u00158¸Poµ\u0018RÓÜ° 2MÒ¹VÑw\u008a\u00ad\u007f¢pïÍ\u0090\u0092®ä¢ P\n{f¿0\u001føh·\u0084\u0001\u0010<=aÏôÁâ\u0082O\u0004ù\u0007\u0094Ó\u008bâ"
         .length();
      char var8 = 16;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_Q = var4;
            CONST_R = new String[3];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31822;
      if (CONST_R[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_S.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_S.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dE", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Q[var3].getBytes("ISO-8859-1");
         CONST_R[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_R[var3];
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
         throw new RuntimeException("rip/breeze/client/dE" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
