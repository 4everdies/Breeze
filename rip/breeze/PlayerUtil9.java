package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.UserTheme;

public class PlayerUtil9 extends RenderUtil5 {
   private UserInfo userInfo_r;
   private StringDecryptHelper stringDecryptHelper_s;
   private ImageUtil8 dataBuilder131_t;
   private MathUtil20 dataBuilder88_u;
   private final RenderUtil16 dataBuilder132_v;
   private final RenderUtil24 dataBuilder34_w;
   private final RenderUtil13 dataBuilder126_x;
   private final RenderUtil31 dataBuilder44_y;
   private final ImageUtil34 dataBuilder90_z;
   private final RenderUtil11 dataBuilder123_A;
   private LicenseState licenseState_B;
   private UserTheme userTheme_C;
   private static String string_D;
   private static final String[] CONST_F;
   private static final String[] CONST_G;
   private static final Map CONST_H = new HashMap(13);
   private static final long[] CONST_J;
   private static final Integer[] CONST_P;
   private static final Map CONST_Q;

   public PlayerUtil9(StringDecryptHelper var1, UserInfo var2) {
      long var3 = 99296460247009L;
      super();
      this.licenseState_B = new LicenseState();
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs3(var1.fieldLong_a, this::update, this::update_1);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-8074346457644094284L, var3);
      Object[] var10002 = var10001;
      CloudAuthService var8 = var10000;
      Method var7 = var10003;

      try {
         var7.invoke(var8, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      this.userInfo_r = var2;
      RenderUtil5.decrypt();
      this.stringDecryptHelper_s = var1;
      this.dataBuilder126_x = new RenderUtil13(var2.string_b, var2.fieldInt_d, 35);
      this.dataBuilder44_y = new RenderUtil31(var1.string_b, 20, "default.text-primary");
      this.dataBuilder90_z = new ImageUtil34(RenderUtil19_x.CONFIG);
      this.dataBuilder34_w = new RenderUtil24(RenderUtil19_x.CONFIG, var1.fieldLong_a, this::initialize);
      this.dataBuilder132_v = new RenderUtil16(this, this.dataBuilder34_w);
      this.dataBuilder123_A = new RenderUtil11(new LicenseState(), "Apply all", this::initialize_2);
      this.a(new UIPanel[]{this.dataBuilder126_x, this.dataBuilder44_y, this.dataBuilder90_z, this.dataBuilder123_A});
      this.calculate_2();
      if (LicenseState.checkCondition()) {
         RenderUtil5.initialize(new int[3]);
      }
   }

   private void initialize(float var1, int var2) {
      this.stringDecryptHelper_s.fieldFloat_d = var1;
      this.stringDecryptHelper_s.fieldInt_e = var2;
   }

   private void update(UserTheme var1) {
      long var2 = 74863435315900L;
      long var4 = var2 ^ 136428681399693L;
      this.userTheme_C = var1.getDataBuilder2_2("config").getUserTheme(var4);
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$configLoaded_Inner0);
   }

   @Override
   public void calculate_2() {
      long var1 = 125203950993016L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs2(this.stringDecryptHelper_s.fieldLong_a, RenderUtil19_x.CONFIG);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-111576653831792781L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   private void update_1(String var1) {
      long var2 = 76872649708423L;
      BreezeContext.guiPanelSettings_f.processAll("Failed fetching config", var1);
   }

   private void initialize_2() {
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$applyConfig_Inner1);
   }

   @Override
   public boolean isValid() {
      return true;
   }

   public void update_2() {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.processNullable(new PlayerUtil9(this.stringDecryptHelper_s, this.userInfo_r), false);
   }

   @Override
   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 10.0F,
            this.b + 10.0F,
            this.licenseState_B.fieldFloat_c - 20.0F,
            90.0F,
            15.0F,
            BreezeContext.authSession_c.getColor("default.layer-one")
         );
      BreezeContext.iRenderer_b
         .drawText(
            "by" + this.userInfo_r.string_a,
            this.a + 65.0F,
            this.b + 63.0F,
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            EnumType32.SOURCE_SANS,
            18.0F
         );
      super.calculate(var1, var2, var3);
   }

   @Override
   public void calculate_2() {
      long var1 = 62740630596709L;
      super.calculate_2();
      this.licenseState_B = new LicenseState(this.a, this.b + 40.0F, 250.0F, this.d - 40.0F);
      this.dataBuilder126_x.a(this.a + 25.0F, this.b + 55.0F, 35.0F, 35.0F);
      this.dataBuilder90_z.a(this.a + 25.0F, this.b + 24.0F, this.dataBuilder90_z.c, this.dataBuilder90_z.d);
      this.dataBuilder44_y.a(this.dataBuilder90_z.a() + 8.0F, this.b + 25.0F, this.licenseState_B.fieldFloat_c - 58.0F - this.dataBuilder90_z.c, 22.0F);
      this.dataBuilder123_A.processNullable(this.a + 10.0F, this.b + this.d - 50.0F, this.licenseState_B.fieldFloat_c - 20.0F, 40.0F);
      this.o = 359868951;
      this.p = 1621072047;
   }

   private void lambda$applyConfig_Inner1() {
      long var1 = 120070059716231L;
      int[] var3 = RenderUtil5.decrypt();
      if (this.userTheme_C == null) {
         BreezeContext.guiPanelSettings_f.processAll("Error", "Failed to load config");
         if (var3 != null) {
            return;
         }
      }

      BreezeContext.guiPanelSettings_f.processAll("Success", "Applied config to all modules");
      ImageUtil16.processAll_1(this.userTheme_C);
      this.calculate_2();
   }

   private void lambda$configLoaded_Inner0(UserTheme var1) {
      long var2 = 124228479813004L;
      long var4 = var2 ^ 80257722446525L;
      this.userInfo_r = new UserInfo(
         var1.getDataBuilder2_2("preview")
            .getUserTheme(var4)
            .getDataBuilder2_2("user")
            .getUserTheme(var4)
      );
      int[] var10000 = RenderUtil5.decrypt();
      this.stringDecryptHelper_s = new StringDecryptHelper(var1.getDataBuilder2_2("preview").getUserTheme(var4));
      this.dataBuilder88_u = new MathUtil20(this.stringDecryptHelper_s, this.userInfo_r);
      this.dataBuilder131_t = new ImageUtil8(this, this.dataBuilder88_u);
      this.l.initialize(this.dataBuilder131_t);
      int[] var6 = var10000;
      this.l.initialize(this.dataBuilder132_v);

      for (BreezeModule var8 : BreezeContext.moduleBase_a.getAllModules()) {
         if (this.userTheme_C.isValid(var8.moduleName)) {
            ImageUtil10 var9 = new ImageUtil10(var8, this, this.userTheme_C.getDataBuilder2_2(var8.moduleName).getUserTheme(var4));
            this.l.initialize(var9);
         }

         if (var6 == null) {
            break;
         }
      }

      this.calculate_2();
   }

   public static void initialize_3(String var0) {
      string_D = var0;
   }

   public static String getString() {
      return string_D;
   }

   static {
      initialize_3("O5Qp3b");
      long var0 = 17135484380285L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[14];
      int var5 = 0;
      String var6 = "ý±.\u0014\u0097Sv\u0089~}\u0089Õs³\f0)\u000eàeZ\u0084ïÞ\u0005ßg\u0088ü\u009dD\u0092\u0010*,\u0005\u0086Ý\u0011ó\u001c\u0086Û\u0005\u0080Si-¥(I\u0011û\t!I\u0086szÛÄ§1J[Ã\u0094+H¶ÅIÐ\u0015èÎw\\\u0012\u0010[ý/Ê\u009c¶\u0014Bö\u00000Ô Ñ\u001añîF#\u00032ü,m~)äP*É(¼oÈÐÆé§\u0003Ôè#K¦»ë\u008b¿%oZÉ;\u0003\u0017\u008f\u001fI§\u0010g§J1INF@Ì?\u0006\r¢Q}ã(c\u0011×CW\u00ad\u008cÃÆp¦ÂG.\u0002*¯]E\u0095N:!PL\u009e\u0080¯Ú>\u0094\u0085Ð=ÄW}yz!\u0010Q3ª\u0000p )\bNQ\u009b\u001f\u0003|\u0007\u0003(\u009d¥>k\u008d\u001f\u008dÅL.\u00954\u0002¸\u0016ïR\r\u008c±DÆþÐÈoFMÆ\u0095\td>\u0003ªß\u001d\u0084\u000eX\u0010\nçÒdì÷f\u009a|\u001d\u001a\u0080[¹R68\u0007Ê\u008eA¨áhKS\u008eK\u0002y1>KqÙ¹\"WQÀ¸Å\u0006±4E\u0001¢\u001bÄYã\rðVòã\\û$\u0087Íà\u0013:s¹ÔHÞí\b9\u0010;øäõõÍOW¶Üf¹ö%\u001fF(\u000fÆ[ÔJ\u0014º'ÇpUm\u0000\u001f\u0007ù\u0017ë_\u0088\u000biÇ(\u009bVlcUÕ\u0099\u0099)Ð?7\u0005iµÐ";
      int var7 = "ý±.\u0014\u0097Sv\u0089~}\u0089Õs³\f0)\u000eàeZ\u0084ïÞ\u0005ßg\u0088ü\u009dD\u0092\u0010*,\u0005\u0086Ý\u0011ó\u001c\u0086Û\u0005\u0080Si-¥(I\u0011û\t!I\u0086szÛÄ§1J[Ã\u0094+H¶ÅIÐ\u0015èÎw\\\u0012\u0010[ý/Ê\u009c¶\u0014Bö\u00000Ô Ñ\u001añîF#\u00032ü,m~)äP*É(¼oÈÐÆé§\u0003Ôè#K¦»ë\u008b¿%oZÉ;\u0003\u0017\u008f\u001fI§\u0010g§J1INF@Ì?\u0006\r¢Q}ã(c\u0011×CW\u00ad\u008cÃÆp¦ÂG.\u0002*¯]E\u0095N:!PL\u009e\u0080¯Ú>\u0094\u0085Ð=ÄW}yz!\u0010Q3ª\u0000p )\bNQ\u009b\u001f\u0003|\u0007\u0003(\u009d¥>k\u008d\u001f\u008dÅL.\u00954\u0002¸\u0016ïR\r\u008c±DÆþÐÈoFMÆ\u0095\td>\u0003ªß\u001d\u0084\u000eX\u0010\nçÒdì÷f\u009a|\u001d\u001a\u0080[¹R68\u0007Ê\u008eA¨áhKS\u008eK\u0002y1>KqÙ¹\"WQÀ¸Å\u0006±4E\u0001¢\u001bÄYã\rðVòã\\û$\u0087Íà\u0013:s¹ÔHÞí\b9\u0010;øäõõÍOW¶Üf¹ö%\u001fF(\u000fÆ[ÔJ\u0014º'ÇpUm\u0000\u001f\u0007ù\u0017ë_\u0088\u000biÇ(\u009bVlcUÕ\u0099\u0099)Ð?7\u0005iµÐ"
         .length();
      char var8 = ' ';
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
                     CONST_F = var4;
                     CONST_G = new String[14];
                     CONST_Q = new HashMap(13);
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
                     String var15 = "\u0003îJ´w\\HBºS\u000e·\u0082\u0085R·";
                     int var16 = "\u0003îJ´w\\HBºS\u000e·\u0082\u0085R·".length();
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

                     CONST_J = var13;
                     CONST_P = new Integer[2];
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

                  var6 = "<G-/\b0ôî\u0084Ñ¬\u008e?!Bð\u0010l\u008b¾SRu\u0015¶¿ó\u0007×ÜÒ)\u001d";
                  var7 = "<G-/\b0ôî\u0084Ñ¬\u008e?!Bð\u0010l\u008b¾SRu\u0015¶¿ó\u0007×ÜÒ)\u001d".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15080;
      if (CONST_G[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_H.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_H.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dE", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_F[var3].getBytes("ISO-8859-1");
         CONST_G[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_G[var3];
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
         throw new RuntimeException("rip/breeze/dE" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14152;
      if (CONST_P[var3] == null) {
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
         long var5 = CONST_J[var3];
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
         Object[] var9 = (Object[])CONST_Q.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Q.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/dE", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_P[var3] = var15;
      }

      return CONST_P[var3];
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
         throw new RuntimeException("rip/breeze/dE" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
