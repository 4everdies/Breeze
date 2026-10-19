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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RenderUtil4 extends ConfigUtil2_x {
   private final long fieldLong_l;
   private UserInfo userInfo_m;
   private LicenseState licenseState_n = new LicenseState();
   private final MathUtil8 dataBuilder33_o = new MathUtil8(this::processAll_2);
   private RenderUtil13 dataBuilder126_p;
   private RenderUtil14 dataBuilder128_q;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);

   public RenderUtil4(long var1) {
      super(true);
      this.fieldLong_l = var1;
      this.dataBuilder33_o.toggle_3(true);
      this.a(new UIPanel[]{this.dataBuilder33_o});
   }

   public void update() {
      this.processAll();
   }

   @Override
   public boolean isValid() {
      long var1 = 17139586571837L;
      return this.userInfo_m != null;
   }

   public void processAll() {
      long var1 = 133010015979109L;
      this.b(new UIPanel[]{this.dataBuilder126_p, this.dataBuilder128_q});
      this.userInfo_m = null;
      this.dataBuilder33_o.initialize_3();
      this.processAll_2(0);
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs3(this.fieldLong_l, this::initialize_2, this::update_1);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(461724995756096170L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      this.dataBuilder33_o.setBool_k();
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_n,
            BreezeContext.authSession_c.getFloat("cloud.corner-radius"),
            BreezeContext.authSession_c.getColor("default.layer-one")
         );
      if (this.userInfo_m != null) {
         BreezeContext.iRenderer_b
            .drawText(
               this.userInfo_m.string_a,
               this.licenseState_n.fieldFloat_a + 90.0F,
               this.licenseState_n.fieldFloat_b + 25.0F,
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               EnumType32.SOURCE_SANS,
               25.0F
            );
         float var6 = BreezeContext.iRenderer_b.measureText(this.userInfo_m.string_a, EnumType32.SOURCE_SANS, 25.0F);
         if (this.userInfo_m.userRole_c.val >= UserRole.PLUS.val) {
            BreezeContext.iRenderer_b
               .drawText(
                  this.userInfo_m.userRole_c.name,
                  this.licenseState_n.fieldFloat_a + 92.0F + var6,
                  this.licenseState_n.fieldFloat_b + 34.0F,
                  this.userInfo_m.userRole_c.color,
                  EnumType32.SOURCE_SANS,
                  13.0F
               );
         }

         float var7 = this.licenseState_n.fieldFloat_a + this.licenseState_n.fieldFloat_c / 2.0F + 50.0F;
         float var8 = BreezeContext.iRenderer_b.measureText("Total downloads:", EnumType32.SOURCE_SANS, 18.0F);
         float var9 = BreezeContext.iRenderer_b.measureText("Member since:", EnumType32.SOURCE_SANS, 18.0F);
         BreezeContext.iRenderer_b
            .drawText(
               "Total downloads:",
               var7,
               this.licenseState_n.fieldFloat_b + 52.0F,
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
         BreezeContext.iRenderer_b
            .drawText(
               "Member since:",
               var7,
               this.licenseState_n.fieldFloat_b + 30.0F,
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
         BreezeContext.iRenderer_b
            .drawText(
               DateUtil_x.buildString_3(this.userInfo_m.fieldInt_h),
               var7 + var8 + 5.0F,
               this.licenseState_n.fieldFloat_b + 52.0F,
               BreezeContext.authSession_c.getColor("default.text-tertiary"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
         BreezeContext.iRenderer_b
            .drawText(
               DateUtil_x.buildString(this.userInfo_m.fieldLong_i),
               var7 + var9 + 5.0F,
               this.licenseState_n.fieldFloat_b + 30.0F,
               BreezeContext.authSession_c.getColor("default.text-tertiary"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
      }

      super.a(var1, var2, var3);
   }

   public void calculate_2() {
      long var1 = 62740630596709L;
      this.licenseState_n = new LicenseState(this.a + 20.0F, this.b + 20.0F, this.c - 40.0F, 100.0F);
      if (this.dataBuilder126_p != null) {
         this.dataBuilder126_p.a(this.licenseState_n.fieldFloat_a + 20.0F, this.licenseState_n.fieldFloat_b + 20.0F, 60.0F, 60.0F);
      }

      if (this.dataBuilder128_q != null) {
         this.dataBuilder128_q.a(this.licenseState_n.fieldFloat_a + 90.0F, this.licenseState_n.fieldFloat_b + 52.0F, 25.0F, 25.0F);
      }

      this.dataBuilder33_o.a(this.a, this.b + 140.0F, this.c, this.d - 150.0F);
   }

   private void processAll_2(int var1) {
      long var2 = 18474473117444L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs4(this.fieldLong_l, var1, this::initialize, this::update_1);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(6274857775134492717L, var2);
      Object[] var10002 = var10001;
      CloudAuthService var6 = var10000;
      Method var5 = var10003;

      try {
         var5.invoke(var6, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   private void initialize(ArrayList<UIPanel> var1, int var2) {
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$userItemsCallback_Inner0);
   }

   private void initialize_2(UserInfo var1) {
      this.userInfo_m = var1;
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$loaded_Inner1);
   }

   private void update_1(String var1) {
      long var2 = 130022505941551L;
      BreezeContext.guiPanelSettings_f.processAll("Failed fetching user", RenderUtil18_x.RED + var1);
   }

   private void lambda$loaded_Inner1() {
      this.b(new UIPanel[]{this.dataBuilder126_p, this.dataBuilder128_q});
      this.dataBuilder126_p = new RenderUtil13(this.userInfo_m.string_b, this.userInfo_m.fieldInt_d, 35);
      this.dataBuilder128_q = new RenderUtil14(this.userInfo_m.fieldFloat_f, this.userInfo_m.fieldInt_g);
      this.a(new UIPanel[]{this.dataBuilder126_p, this.dataBuilder128_q});
      this.calculate_2();
   }

   private void lambda$userItemsCallback_Inner0(ArrayList var1, int var2) {
      long var3 = 61224393856284L;
      this.dataBuilder33_o.update(var1);
      this.dataBuilder33_o.fieldBool_j = var2 > this.dataBuilder33_o.getValue();
   }

   static {
      long var0 = 54944035934265L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[11];
      int var5 = 0;
      String var6 = "Ók\u0013iÉYMÅ*¤\u00ad\nRê³Ý\u009aà\u0089e)e-ê~éj*d\u0013lAaÉ/äwV\u00179(õÕ=ýy°zG\u00955ìG\u009d§0\u001aÖú\u0017\u009aÇú\u0011Í¡¦å\u0013æ<ðeÞ¼±<!¬î\u0091(ÕcSLüK°\u0004U(^)\u0019\u008c·nh°ázIÅ\u0097úÆ¯ø]íe\u0086/ç ;\u008dpàF\u0091 ¥²ô\u0012Põ\u0097-«/\rµ{X#h¦Èãå\u009ee\u0085b\u0014¯\u008b\u0094Ð\u0019«:(-^fÁ\u0095èmWDNAhk«¶®\u0011*Öá¤Þ`jæQE°ÇÈqÎE4\u001c\u0084Î¿?L 3\u0001\u008e%Ð¿¯Ü*©Â9Ò¬$14\r\u0011üa¹\u0089w\u009b\u0081çòÜêíÝ( \u0082eUð:õå\u0088\u0093é\u0002i=Éf\u009eK¹#Ç\u001b¶¦¦Ñ×ÅÊwê4êë8\u009b³\rÇb(NVÏ®ô@Iwòji_ÕJ]\u0089\u0086×nB¼÷B\u0084lPÃÎ2\u0095Â\u0080ä\u0083®GÇr\u00adÊ0ÎÑ2\u0081@jï\u0018y\u001cµÉ¼\u0010_\u000b|\u009f,p²2\u0094Ã\u001f÷]b\u0015àE\u0015KÊ#\t\b42TBÅ\u0006\u0005\u008bçÛ\f";
      int var7 = "Ók\u0013iÉYMÅ*¤\u00ad\nRê³Ý\u009aà\u0089e)e-ê~éj*d\u0013lAaÉ/äwV\u00179(õÕ=ýy°zG\u00955ìG\u009d§0\u001aÖú\u0017\u009aÇú\u0011Í¡¦å\u0013æ<ðeÞ¼±<!¬î\u0091(ÕcSLüK°\u0004U(^)\u0019\u008c·nh°ázIÅ\u0097úÆ¯ø]íe\u0086/ç ;\u008dpàF\u0091 ¥²ô\u0012Põ\u0097-«/\rµ{X#h¦Èãå\u009ee\u0085b\u0014¯\u008b\u0094Ð\u0019«:(-^fÁ\u0095èmWDNAhk«¶®\u0011*Öá¤Þ`jæQE°ÇÈqÎE4\u001c\u0084Î¿?L 3\u0001\u008e%Ð¿¯Ü*©Â9Ò¬$14\r\u0011üa¹\u0089w\u009b\u0081çòÜêíÝ( \u0082eUð:õå\u0088\u0093é\u0002i=Éf\u009eK¹#Ç\u001b¶¦¦Ñ×ÅÊwê4êë8\u009b³\rÇb(NVÏ®ô@Iwòji_ÕJ]\u0089\u0086×nB¼÷B\u0084lPÃÎ2\u0095Â\u0080ä\u0083®GÇr\u00adÊ0ÎÑ2\u0081@jï\u0018y\u001cµÉ¼\u0010_\u000b|\u009f,p²2\u0094Ã\u001f÷]b\u0015àE\u0015KÊ#\t\b42TBÅ\u0006\u0005\u008bçÛ\f"
         .length();
      char var8 = '(';
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
                     CONST_T = new String[11];
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

                  var6 = "3p¢ ÂQ×GØ\u0003l\u0091Ç\u008a\u000f¯¤°\u000bâúfÍ\u0012\u0096ê\u0081Or2\u00921\u008bY©)W\u0012rodú4P\u00881§}(Óû\u0017Þ\u008cG}P\u0089½°ð\u001d\u0000¤\u0001W\u009dÉ;ÕõÓ\u0080\u000b¼\tv#\u0081©úÙ\u0096<`\u000bbÆ!";
                  var7 = "3p¢ ÂQ×GØ\u0003l\u0091Ç\u008a\u000f¯¤°\u000bâúfÍ\u0012\u0096ê\u0081Or2\u00921\u008bY©)W\u0012rodú4P\u00881§}(Óû\u0017Þ\u008cG}P\u0089½°ð\u001d\u0000¤\u0001W\u009dÉ;ÕõÓ\u0080\u000b¼\tv#\u0081©úÙ\u0096<`\u000bbÆ!"
                     .length();
                  var8 = '0';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4079;
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
            throw new RuntimeException("rip/breeze/dx", var10);
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
         throw new RuntimeException("rip/breeze/dx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
