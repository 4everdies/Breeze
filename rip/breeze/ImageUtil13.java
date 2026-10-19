package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.UserTheme;

public class ImageUtil13 extends RenderUtil5 {
   private final UserInfo userInfo_r;
   private final StringDecryptHelper stringDecryptHelper_s;
   private final ImageUtil8 dataBuilder131_t;
   private final dc dc_u;
   private final RenderUtil13 dataBuilder126_v;
   private final RenderUtil31 dataBuilder44_w;
   private final ImageUtil34 dataBuilder90_x;
   private final RenderUtil11 dataBuilder123_y;
   private final List<ImageUtil9> list_z;
   private LicenseState licenseState_A;
   private UserTheme userTheme_B;
   private static final String[] CONST_D;
   private static final String[] CONST_E;
   private static final Map CONST_F = new HashMap(13);
   private static final long[] CONST_G;
   private static final Integer[] CONST_H;
   private static final Map CONST_J;

   public ImageUtil13(StringDecryptHelper var1, UserInfo var2) {
      long var3 = 4415472992842L;
      super();
      this.list_z = new ArrayList<>();
      int[] var10000 = RenderUtil5.decrypt();
      this.licenseState_A = new LicenseState();
      this.userInfo_r = var2;
      this.stringDecryptHelper_s = var1;
      this.dataBuilder126_v = new RenderUtil13(var2.string_b, var2.fieldInt_d, 35);
      this.dataBuilder44_w = new RenderUtil31(var1.string_b, 20, "default.text-primary");
      this.dataBuilder90_x = new ImageUtil34(RenderUtil19_x.CONFIG);
      this.dc_u = new dc(var1);
      int[] var5 = var10000;
      this.dataBuilder131_t = new ImageUtil8(this, this.dc_u);
      this.dataBuilder123_y = new RenderUtil11(new LicenseState(), "Save", this::processAll);
      this.a(new UIPanel[]{this.dataBuilder126_v, this.dataBuilder44_w, this.dataBuilder90_x, this.dataBuilder123_y});
      this.l.initialize(this.dataBuilder131_t);
      this.calculate_2();
      CloudAuthService var7 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs3(var1.fieldLong_a, this::processAll, this::update);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(169297192865898783L, var3);
      Object[] var10002 = var10001;
      CloudAuthService var9 = var7;
      Method var8 = var10003;

      try {
         var8.invoke(var9, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      if (var5 == null) {
         LicenseState.toggle(LicenseState.checkCondition());
      }
   }

   private void processAll() {
      long var1 = 12082507290653L;
      this.dataBuilder123_y.setBool_o(true);
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs7(
         this.stringDecryptHelper_s.fieldLong_a, this.dc_u.n(), Util140.buildString_2(), this.dc_u.o(), this.getUserTheme(), this::initialize, this::update
      );
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(1734145858588905374L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   private void initialize(StringDecryptHelper var1) {
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$configUpdated_Inner0);
   }

   private void processAll(UserTheme var1) {
      long var2 = 138314961732788L;
      long var4 = var2 ^ 76732565107589L;
      this.userTheme_B = var1.getDataBuilder2_2("config").getUserTheme(var4);
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$configLoaded_Inner1);
   }

   private UserTheme getUserTheme() {
      long var1 = 5727875015617L;
      long var3 = var1 ^ 122229626313726L;
      int[] var10000 = RenderUtil5.decrypt();
      UserTheme var5 = new UserTheme();
      int[] var6 = var10000;

      for (ImageUtil9 var8 : this.list_z) {
         if (var8.isBool_o()) {
            var5.processNullable(var8.getDataBuilder52_h().moduleName, var3, ImageUtil16.getUserTheme(var8.getDataBuilder51()));
         }

         if (var6 == null) {
            break;
         }
      }

      return var5;
   }

   private void update(String var1) {
      long var2 = 116803503118019L;
      this.dataBuilder123_y.setBool_o(false);
      BreezeContext.guiPanelSettings_f.processAll("Error", RenderUtil18_x.RED + var1);
   }

   @Override
   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 10.0F,
            this.b + 10.0F,
            this.licenseState_A.fieldFloat_c - 20.0F,
            90.0F,
            15.0F,
            BreezeContext.authSession_c.getColor("default.layer-one")
         );
      BreezeContext.iRenderer_b
         .drawText(
            "by" + this.userInfo_r.string_a,
            this.a + 65.0F,
            this.b + 63.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary").brighter(),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      super.calculate(var1, var2, var3);
   }

   @Override
   public void calculate_2() {
      long var1 = 62740630596709L;
      super.calculate_2();
      this.licenseState_A = new LicenseState(this.a, this.b + 40.0F, 250.0F, this.d - 40.0F);
      this.dataBuilder126_v.a(this.a + 25.0F, this.b + 55.0F, 35.0F, 35.0F);
      this.dataBuilder90_x.a(this.a + 25.0F, this.b + 24.0F, this.dataBuilder90_x.c, this.dataBuilder90_x.d);
      this.dataBuilder44_w.a(this.dataBuilder90_x.a() + 8.0F, this.b + 25.0F, this.licenseState_A.fieldFloat_c - 58.0F - this.dataBuilder90_x.c, 22.0F);
      this.dataBuilder123_y.processNullable(this.a + 10.0F, this.b + this.d - 50.0F, this.licenseState_A.fieldFloat_c - 20.0F, 40.0F);
      this.o = -614768548;
      this.p = -1705957425;
   }

   private void lambda$configLoaded_Inner1() {
      long var1 = 126313498087376L;
      long var3 = var1 ^ 82342581336289L;
      int[] var10000 = RenderUtil5.decrypt();
      Iterator var5 = BreezeContext.moduleBase_a.getAllModules().iterator();
      int[] var6 = var10000;

      while (var5.hasNext()) {
         BreezeModule var7 = (BreezeModule)var5.next();
         ImageUtil9 var8 = new ImageUtil9(
            var7, this, this.userTheme_B.isValid(var7.moduleName) ? this.userTheme_B.getDataBuilder2_2(var7.moduleName).getUserTheme(var3) : null
         );
         this.l.initialize(var8);
         this.list_z.add(var8);
         if (var6 == null) {
            break;
         }
      }

      this.calculate_2();
   }

   private void lambda$configUpdated_Inner0(StringDecryptHelper var1) {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.processNullable(new PlayerUtil9(var1, this.userInfo_r), false);
   }

   static {
      long var0 = 66909534411277L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[7];
      int var5 = 0;
      String var6 = "Ô aP¬ð3\u0019\u001cÿ ¹Úæ)´\u000e\r\u007f\u0019\u009aÝIá\rÔ\u0016lvýî÷\u0005ÍÆ»öB\u0093»\u0010\u001a=äìO÷Æ7ñçglY`Sç(\u0096qß°]¹L\fuDzÆmq>ó5ü ö7Sö+V}E\u001f\u0007\u008c¥R«7Õ\tñÀj\u000e(\u0084\u0001×=_ë\neÈådcÎX\b\u0001|à\noM3\"Ô7Ì.A\u00058e$m*\u0093UÄ8N\u0005\u0010O\u0005)íJ$Ï>lwÓ]ü7Õp";
      int var7 = "Ô aP¬ð3\u0019\u001cÿ ¹Úæ)´\u000e\r\u007f\u0019\u009aÝIá\rÔ\u0016lvýî÷\u0005ÍÆ»öB\u0093»\u0010\u001a=äìO÷Æ7ñçglY`Sç(\u0096qß°]¹L\fuDzÆmq>ó5ü ö7Sö+V}E\u001f\u0007\u008c¥R«7Õ\tñÀj\u000e(\u0084\u0001×=_ë\neÈådcÎX\b\u0001|à\noM3\"Ô7Ì.A\u00058e$m*\u0093UÄ8N\u0005\u0010O\u0005)íJ$Ï>lwÓ]ü7Õp"
         .length();
      char var8 = '(';
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var33;
                  if ((var23 += var8) >= var7) {
                     CONST_D = var4;
                     CONST_E = new String[7];
                     CONST_J = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[2];
                     int var14 = 0;
                     String var15 = "é\u0013Ñ²\f\u001fq¯wºé\\!%fP";
                     int var16 = "é\u0013Ñ²\f\u001fq¯wºé\\!%fP".length();
                     byte var17 = 0;

                     do {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        var10001 = var14++;
                        long var19 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte[] var21 = var11.doFinal(
                           new byte[]{
                              (byte)(var19 >>> 56),
                              (byte)(var19 >>> 48),
                              (byte)(var19 >>> 40),
                              (byte)(var19 >>> 32),
                              (byte)(var19 >>> 24),
                              (byte)(var19 >>> 16),
                              (byte)(var19 >>> 8),
                              (byte)var19
                           }
                        );
                        long var10004 = (var21[0] & 255L) << 56
                           | (var21[1] & 255L) << 48
                           | (var21[2] & 255L) << 40
                           | (var21[3] & 255L) << 32
                           | (var21[4] & 255L) << 24
                           | (var21[5] & 255L) << 16
                           | (var21[6] & 255L) << 8
                           | var21[7] & 255L;
                        byte var38 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_G = var13;
                     CONST_H = new Integer[2];
                     return;
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var33;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label45;
                  }

                  var6 = "×\u0082óæí;ºÃ\u000e©°\u001fTi\u001b«\u0010Àg\"\u001eÚö\u0019#T#1\u0017Ò_²ä";
                  var7 = "×\u0082óæí;ºÃ\u000e©°\u001fTi\u001b«\u0010Àg\"\u001eÚö\u0019#T#1\u0017Ò_²ä".length();
                  var8 = 16;
                  var23 = -1;
            }

            var24 = var6.substring(++var23, var23 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20970;
      if (CONST_E[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_F.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_F.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dD", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_D[var3].getBytes("ISO-8859-1");
         CONST_E[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_E[var3];
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
         throw new RuntimeException("rip/breeze/dD" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20985;
      if (CONST_H[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_G[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_J.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_J.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/dD", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_H[var3] = var15;
      }

      return CONST_H[var3];
   }

   private static int getValue(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = decrypt(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getValue".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/dD" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
