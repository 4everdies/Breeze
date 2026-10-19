package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ImageUtil14 extends RenderUtil5 {
   private final UserInfo userInfo_r;
   private final StringDecryptHelper2 stringDecryptHelper2_s;
   private final dl dl_t;
   private final ImageUtil8 dataBuilder131_u;
   private final List<eA> list_v;
   private final RenderUtil17_x dataBuilder95_w;
   private final RenderUtil13 dataBuilder126_x;
   private final RenderUtil31 dataBuilder44_y;
   private final ImageUtil34 dataBuilder90_z;
   private final RenderUtil11 dataBuilder123_A;
   private eA eA_B;
   private String string_C;
   private LicenseState licenseState_D;
   private static final String[] CONST_F;
   private static final String[] CONST_G;
   private static final Map CONST_H = new HashMap(13);
   private static final long[] CONST_J;
   private static final Integer[] CONST_P;
   private static final Map CONST_Q;

   public ImageUtil14(StringDecryptHelper2 var1, UserInfo var2) {
      long var3 = 50841310559890L;
      super();
      this.list_v = new ArrayList<>();
      boolean var10000 = ConfigUtil2_x.checkCondition_2();
      this.dataBuilder95_w = new RenderUtil17_x();
      this.licenseState_D = new LicenseState();
      this.userInfo_r = var2;
      this.stringDecryptHelper2_s = var1;
      this.dataBuilder126_x = new RenderUtil13(var2.string_b, var2.fieldInt_d, 35);
      this.dataBuilder44_y = new RenderUtil31(var1.string_b, 20, "default.text-primary");
      this.dataBuilder90_z = new ImageUtil34(RenderUtil19_x.SCRIPT);
      this.dl_t = new dl(var1);
      this.dataBuilder131_u = new ImageUtil8(this, this.dl_t);
      this.dataBuilder123_A = new RenderUtil11(new LicenseState(), "Save", this::processAll);
      boolean var5 = var10000;
      this.a(new UIPanel[]{this.dataBuilder126_x, this.dataBuilder44_y, this.dataBuilder90_z, this.dataBuilder123_A});
      this.l.initialize(this.dataBuilder131_u);

      for (FileUtil3 var7 : BreezeContext.dataBuilder15_j.getList()) {
         eA var8 = new eA(var7, this::update, this::lambda$new_Inner0);
         this.list_v.add(var8);
         this.l.initialize(var8);
         if (!var5) {
            break;
         }
      }

      this.calculate_2();
      CloudAuthService var10 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs3(var1.fieldLong_a, this::initialize, this::update_1);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(9115929929154821880L, var3);
      Object[] var10002 = var10001;
      CloudAuthService var12 = var10;
      Method var11 = var10003;

      try {
         var11.invoke(var12, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      if (LicenseState.checkCondition()) {
         ConfigUtil2_x.toggle(!var5);
      }
   }

   private void update(eA var1) {
      this.eA_B = var1;
      this.dataBuilder95_w.processAll(this.getString(var1.j()));
      this.e(this.dataBuilder95_w);
   }

   private void initialize(String var1, StringDecryptHelper2 var2, UserInfo var3) {
      this.string_C = var1;
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$scriptLoaded_Inner1);
   }

   private String getString(FileUtil3 var1) {
      long var2 = 59939927600987L;
      String var4 = HttpUtil2.buildString_2(var1.getFile_A());
      return var4 == null ? "" : var4;
   }

   private void processAll() {
      long var1 = 21229329486904L;
      String var3 = this.eA_B != null ? this.getString(this.eA_B.j()) : this.string_C;
      if (var3 == null) {
         BreezeContext.guiPanelSettings_f.processAll("Please wait", "The script is still loading, try again in a moment.");
      } else if (var3.getBytes(StandardCharsets.UTF_8).length > 50000) {
         BreezeContext.guiPanelSettings_f
            .processAll("M^i�~.V", RenderUtil18_x.RED + "t��Tv-Df/(]MIYB�W�5fb\n");
      } else {
         this.dataBuilder123_A.setBool_o(true);
         CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
         Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs8(
            this.stringDecryptHelper2_s.fieldLong_a, this.dl_t.n(), Util140.buildString_2(), this.dl_t.o(), this.dl_t.p(), var3, this::initialize_2, this::update_1
         );
         Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-7770514952342848092L, var1);
         Object[] var10002 = var10001;
         CloudAuthService var6 = var10000;
         Method var5 = var10003;

         try {
            var5.invoke(var6, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }

   private void initialize_2(StringDecryptHelper2 var1) {
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$scriptUpdated_Inner2);
   }

   private void update_1(String var1) {
      long var2 = 117986577426027L;
      this.dataBuilder123_A.setBool_o(false);
      BreezeContext.guiPanelSettings_f.processAll("Error", RenderUtil18_x.RED + var1);
   }

   @Override
   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + 10.0F,
            this.b + 10.0F,
            this.licenseState_D.fieldFloat_c - 20.0F,
            90.0F,
            15.0F,
            BreezeContext.authSession_c.getColor("default.layer-one")
         );
      BreezeContext.iRenderer_b
         .drawText(
            "by " + this.userInfo_r.string_a,
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
      this.licenseState_D = new LicenseState(this.a, this.b + 40.0F, 250.0F, this.d - 40.0F);
      this.dataBuilder126_x.a(this.a + 25.0F, this.b + 55.0F, 35.0F, 35.0F);
      this.dataBuilder90_z.a(this.a + 25.0F, this.b + 24.0F, this.dataBuilder90_z.c, this.dataBuilder90_z.d);
      this.dataBuilder44_y.a(this.dataBuilder90_z.a() + 8.0F, this.b + 25.0F, this.licenseState_D.fieldFloat_c - 58.0F - this.dataBuilder90_z.c, 22.0F);
      this.dataBuilder123_A.processNullable(this.a + 10.0F, this.b + this.d - 50.0F, this.licenseState_D.fieldFloat_c - 20.0F, 40.0F);
      this.o = -2089203796;
      this.p = -599261283;
   }

   private void lambda$scriptUpdated_Inner2(StringDecryptHelper2 var1) {
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.processNullable(new RenderUtil14_x(var1, this.userInfo_r), false);
   }

   private void lambda$scriptLoaded_Inner1(String var1) {
      this.dataBuilder95_w.processAll(var1);
   }

   private boolean lambda$new_Inner0(eA var1) {
      long var2 = 12773985747111L;
      return var1 == this.eA_B;
   }

   static {
      long var0 = 138860185756255L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[10];
      int var5 = 0;
      String var6 = "þçû9Ë\u001e\u001eùi2ú1Þ\u0018ç¡t \u001dé\u00044/«ZGc\u0010äák®\u0000Ø\u0097\nÛ&ÌF`\u009e\u007f\u0088~Fw\u008eì_ßdh\u009c^Z»i}ÑY½\u0018ãýe\u0093N];á?L\u001aÐzÁ\u008ciUÀ\u0091!´\u001cYc}mªÚqÊÄûïy²Ê\u0087\u001bØÄ\u0012ö,m\u0086æ¢:\u0011@á\u0004D\u008b Â2\u0090À-WÓ.¥wökJ;¦\u001a\u0001÷V\u0010úfFïI\u0088oz\u0097Ú\u009b\u0080\u001ce\u0080\u0017 \\c6ø¶ÖZPFu÷\u0082ª\f\n\u0019\u0002\u0019Ö±¸5:\u009dÞ\u0001ø\u0092áGýF(\u00981/ñ4\u0093BÅ\f!\u009c\"U¯×%oþVpãäÅýK\u0086['8À¢¯3®\\YK9\u0012\u0011@1~\u009e(\u001e\u001c-\u001aÒ«¹¤| \u0099ó²\u00948\u008aD\u0004\u001b\u009aºC&\u000eX\u008eX\u009fé\u0080÷õ®\t\u0088º¬íöïÝ,&D\u008ejZ¾\u0080¡»\u0092\u0003\b¨éÓòÐ60ö\u001aÜLù\u0001ë¸ë\u0018bþÝmÅÜÙé§>[Ò\u0011]\u009dÉÊ;å\u0081Æ~[.:nÉÚ\u009d6¾nl\u009b\u00adõ\u0018Y\u0010ÆBìÔg±\u00adê×7\u0093Å`_\u0092;";
      int var7 = "þçû9Ë\u001e\u001eùi2ú1Þ\u0018ç¡t \u001dé\u00044/«ZGc\u0010äák®\u0000Ø\u0097\nÛ&ÌF`\u009e\u007f\u0088~Fw\u008eì_ßdh\u009c^Z»i}ÑY½\u0018ãýe\u0093N];á?L\u001aÐzÁ\u008ciUÀ\u0091!´\u001cYc}mªÚqÊÄûïy²Ê\u0087\u001bØÄ\u0012ö,m\u0086æ¢:\u0011@á\u0004D\u008b Â2\u0090À-WÓ.¥wökJ;¦\u001a\u0001÷V\u0010úfFïI\u0088oz\u0097Ú\u009b\u0080\u001ce\u0080\u0017 \\c6ø¶ÖZPFu÷\u0082ª\f\n\u0019\u0002\u0019Ö±¸5:\u009dÞ\u0001ø\u0092áGýF(\u00981/ñ4\u0093BÅ\f!\u009c\"U¯×%oþVpãäÅýK\u0086['8À¢¯3®\\YK9\u0012\u0011@1~\u009e(\u001e\u001c-\u001aÒ«¹¤| \u0099ó²\u00948\u008aD\u0004\u001b\u009aºC&\u000eX\u008eX\u009fé\u0080÷õ®\t\u0088º¬íöïÝ,&D\u008ejZ¾\u0080¡»\u0092\u0003\b¨éÓòÐ60ö\u001aÜLù\u0001ë¸ë\u0018bþÝmÅÜÙé§>[Ò\u0011]\u009dÉÊ;å\u0081Æ~[.:nÉÚ\u009d6¾nl\u009b\u00adõ\u0018Y\u0010ÆBìÔg±\u00adê×7\u0093Å`_\u0092;"
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
                     CONST_F = var4;
                     CONST_G = new String[10];
                     CONST_Q = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[3];
                     int var14 = 0;
                     String var15 = "·gÚ\u0011¹\fì³\u0090Ø\u0019A ®·¯g0=GÞ\u007f·o";
                     int var16 = "·gÚ\u0011¹\fì³\u0090Ø\u0019A ®·¯g0=GÞ\u007f·o".length();
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
                     CONST_P = new Integer[3];
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

                  var6 = "bÊqi)*_â\rA3ª;ç7½1T\u0015ñ[ç6j|\u0015Ë\u0082¶JÉn±|äg2\u0013§º\u0010«Èý!\u0098ï7\u001dædú\u009e¤oàö";
                  var7 = "bÊqi)*_â\rA3ª;ç7½1T\u0015ñ[ç6j|\u0015Ë\u0082¶JÉn±|äg2\u0013§º\u0010«Èý!\u0098ï7\u001dædú\u009e¤oàö".length();
                  var8 = '(';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12283;
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
            throw new RuntimeException("rip/breeze/dz", var10);
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
         throw new RuntimeException("rip/breeze/dz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10249;
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
            throw new RuntimeException("rip/breeze/dz", var14);
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
         throw new RuntimeException("rip/breeze/dz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
