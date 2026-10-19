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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.UserTheme;

public class ImageUtil26 extends RenderUtil5 {
   private final MathUtil19 dataBuilder87_r;
   private final ImageUtil8 dataBuilder131_s;
   private final List<ImageUtil9> list_t;
   private LicenseState licenseState_u;
   private boolean fieldBool_v;
   private boolean fieldBool_w;
   private static final String[] CONST_Y;
   private static final String[] CONST_Z;
   private static final Map CONST_A = new HashMap(13);
   private static final long[] CONST_B;
   private static final Integer[] CONST_C;
   private static final Map CONST_D;

   public ImageUtil26() {
      long var1 = 9920297897313L;
      int[] var10000 = RenderUtil5.decrypt();
      super();
      this.list_t = new ArrayList<>();
      int[] var3 = var10000;
      this.licenseState_u = new LicenseState();
      this.fieldBool_v = false;
      this.fieldBool_w = false;
      this.dataBuilder87_r = new MathUtil19();
      this.dataBuilder131_s = new ImageUtil8(this, this.dataBuilder87_r);
      this.l.initialize(this.dataBuilder131_s);

      for (BreezeModule var5 : BreezeContext.moduleBase_a.getAllModules()) {
         ImageUtil9 var6 = new ImageUtil9(var5, this, null);
         this.list_t.add(var6);
         this.l.initialize(var6);
         if (var3 == null) {
            break;
         }
      }

      this.o = 979208246;
      this.p = 1981870024;
   }

   public boolean isActive(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.licenseState_u.isValid(var1, var2)) {
         if (this.fieldBool_v) {
            return true;
         }

         if (!this.fieldBool_w) {
            BreezeContext.guiPanelSettings_f
               .processAll("Invalid config", "Please fill out all fields and select at least one module");
            return true;
         }

         CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
         Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs7(
            this.dataBuilder87_r.buildString(),
            this.dataBuilder87_r.buildString_2(),
            Util140.buildString_2(),
            this.dataBuilder87_r.checkCondition(),
            this.getUserTheme(),
            this::processAll,
            this::processAll
         );
         Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-4991887487420244311L, var4);
         Object[] var10002 = var10001;
         CloudAuthService var8 = var10000;
         Method var7 = var10003;

         try {
            var7.invoke(var8, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         this.fieldBool_v = true;
         return true;
      } else {
         return false;
      }
   }

   private void processAll(StringDecryptHelper var1) {
      long var2 = 132872920759114L;
      RenderUtil3 var10000 = BreezeContext.guiPanelSettings_f.dataBuilder100_r;
      PlayerUtil9 var10001 = new PlayerUtil9();
      CloudAuthService var10004 = BreezeContext.cloudAuthService_h;
      Object[] var10005 = rip.breeze.client.MathUtil8.noArgs();
      Method var10007 = rip.breeze.client.MathUtil8.getMethod_3(-341389853458777263L, var2);
      Object[] var10006 = var10005;
      CloudAuthService var7 = var10004;
      Method var5 = var10007;

      try {
         var6 = (UserInfo)var5.invoke(var7, var10006);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      /* constructor call removed */
      var10000.update(var10001);
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize();
   }

   private void processAll(String var1) {
      long var2 = 84259051406174L;
      this.fieldBool_v = false;
      BreezeContext.guiPanelSettings_f.processAll("Failed to publish config", RenderUtil18_x.RED + var1);
   }

   private UserTheme getUserTheme() {
      long var1 = 134177690329705L;
      long var3 = var1 ^ 17695249537622L;
      int[] var10000 = RenderUtil5.decrypt();
      UserTheme var5 = new UserTheme();
      int[] var6 = var10000;

      for (ImageUtil9 var8 : this.list_t) {
         if (var8.isBool_o()) {
            var5.processNullable(var8.getDataBuilder52_h().moduleName, var3, ImageUtil16.getUserTheme(var8.getDataBuilder51()));
         }

         if (var6 == null) {
            break;
         }
      }

      return var5;
   }

   @Override
   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      int[] var10000 = RenderUtil5.decrypt();
      super.calculate(var1, var2, var3);
      int[] var6 = var10000;
      boolean var7 = false;

      for (ImageUtil9 var9 : this.list_t) {
         if (var9.isBool_o()) {
            var7 = true;
            if (var6 != null) {
               break;
            }
         }

         if (var6 == null) {
            break;
         }
      }

      String var10 = this.dataBuilder87_r.buildString();
      String var11 = this.dataBuilder87_r.buildString_2();
      this.fieldBool_w = var10.length() > 3 && var11.length() > 5 && var7;
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_u,
            9.0F,
            !this.fieldBool_v && this.fieldBool_w
               ? BreezeContext.authSession_c.getColor("button.background")
               : BreezeContext.authSession_c.getColor("button.background-disabled")
         );
      if (this.fieldBool_v) {
         BreezeContext.iRenderer_b
            .fillRectSimple(
               this.licenseState_u.calculateFloat_3(),
               this.licenseState_u.calculateFloat_4(),
               12.0F,
               3.0F,
               BreezeContext.authSession_c.getColor("default.text-primary")
            );
         if (var6 != null) {
            return;
         }
      }

      BreezeContext.iRenderer_b
         .drawTextAt(
            "upload",
            this.licenseState_u.calculateFloat_3() - 15.0F,
            this.licenseState_u.calculateFloat_4() - 16.0F,
            1.25F,
            this.fieldBool_w
               ? BreezeContext.authSession_c.getColor("button.text")
               : BreezeContext.authSession_c.getColor("button.text-disabled")
         );
   }

   @Override
   public void calculate_2() {
      super.calculate_2();
      this.licenseState_u = new LicenseState(this.a + 10.0F, this.b + this.d - 50.0F, this.l.c - 20.0F, 40.0F);
   }

   static {
      long var0 = 133516892368775L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[9];
      int var5 = 0;
      String var6 = "\tÑYA\u001f¢5\u0007ó\u001bTRw\u008câ\u008dù:B ôØÑ'\u0003\u008d]\u001b¨\u0090xAñd\u008c\u009caWçÙ(nÓx\u0093\u001dÞq9Æ&^Z\u009c£\u009cÞM·jë\u0015Æ¤.\u0019¤\u001dÑ·º\u0004\u0003d.<!Ó´Ãg æ-Ý*vÍ±\u0087.y\u0007»TqÅF=4*Ì6\u008dû:1$#>å!«l0Óm´òXN\r2ÂÝåk\u0016È\u008by4ó\u0019\u0011\u001aùEÞ\u001cÈ³NÞ³âYÉÿD\u0095\u0082\u0086xV\u0085¨ÕCA¡\u0096Áhô^\u008aFÂö[\nõ\u0096¶çIç\u008bý\u0019å|\u008a½Ü\u001aß4\u0006\u0013=ËP¯µÚÒó\u0015ó4î\b·f\u009a\u0001ÿ\u009c½Ã\u0096µzÃÑ\u008a\u0018\u007f?ã-\u0099î\r\u000f\u0084«Ê\u0014*Wc\u0015Ê@ÓÊ(P\u0018\u008a÷4\u0084C3«\u009c\u0088{)©8\u001a,BJ½Mß\u008c\u009cBÆ½\u00028mÉ\u009a\u000e÷9õ\u0092\"j\u0086¥FJ\u0082¸\u001f\u0019lc© Í´¼\u008bX\u0089¡S\u0084[\u001a½µíîg¨\u0093¸º×Gû\u0007Îñ\u0085O¤K\u0087ÈõI ;\u0001l³Ö¦Â\u009f¹* ø^ÛÐâ\u0092Ê\u0081\\£\u0099È\u001eE\u0082ÜJíµ\u0018Â";
      int var7 = "\tÑYA\u001f¢5\u0007ó\u001bTRw\u008câ\u008dù:B ôØÑ'\u0003\u008d]\u001b¨\u0090xAñd\u008c\u009caWçÙ(nÓx\u0093\u001dÞq9Æ&^Z\u009c£\u009cÞM·jë\u0015Æ¤.\u0019¤\u001dÑ·º\u0004\u0003d.<!Ó´Ãg æ-Ý*vÍ±\u0087.y\u0007»TqÅF=4*Ì6\u008dû:1$#>å!«l0Óm´òXN\r2ÂÝåk\u0016È\u008by4ó\u0019\u0011\u001aùEÞ\u001cÈ³NÞ³âYÉÿD\u0095\u0082\u0086xV\u0085¨ÕCA¡\u0096Áhô^\u008aFÂö[\nõ\u0096¶çIç\u008bý\u0019å|\u008a½Ü\u001aß4\u0006\u0013=ËP¯µÚÒó\u0015ó4î\b·f\u009a\u0001ÿ\u009c½Ã\u0096µzÃÑ\u008a\u0018\u007f?ã-\u0099î\r\u000f\u0084«Ê\u0014*Wc\u0015Ê@ÓÊ(P\u0018\u008a÷4\u0084C3«\u009c\u0088{)©8\u001a,BJ½Mß\u008c\u009cBÆ½\u00028mÉ\u009a\u000e÷9õ\u0092\"j\u0086¥FJ\u0082¸\u001f\u0019lc© Í´¼\u008bX\u0089¡S\u0084[\u001a½µíîg¨\u0093¸º×Gû\u0007Îñ\u0085O¤K\u0087ÈõI ;\u0001l³Ö¦Â\u009f¹* ø^ÛÐâ\u0092Ê\u0081\\£\u0099È\u001eE\u0082ÜJíµ\u0018Â"
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
                     CONST_Y = var4;
                     CONST_Z = new String[9];
                     CONST_D = new HashMap(13);
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
                     String var15 = "àä`ç\u009e\u0086J¨\u0003ø(s\u001fX#È";
                     int var16 = "àä`ç\u009e\u0086J¨\u0003ø(s\u001fX#È".length();
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

                     CONST_B = var13;
                     CONST_C = new Integer[2];
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

                  var6 = "i\u001f\u000bq\u0090\t¿\u0016M=Üó|»q\u0000(ðÔI¡<¨[\u0001<hUþ{ö°|¯±\u0086çm[k´GÏfÉã%\u0088ì\u008c~ª\u009a¡±÷u";
                  var7 = "i\u001f\u000bq\u0090\t¿\u0016M=Üó|»q\u0000(ðÔI¡<¨[\u0001<hUþ{ö°|¯±\u0086çm[k´GÏfÉã%\u0088ì\u008c~ª\u009a¡±÷u".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13642;
      if (CONST_Z[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_A.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_A.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dC", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Y[var3].getBytes("ISO-8859-1");
         CONST_Z[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Z[var3];
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
         throw new RuntimeException("rip/breeze/dC" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7058;
      if (CONST_C[var3] == null) {
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
         long var5 = CONST_B[var3];
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
         Object[] var9 = (Object[])CONST_D.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/dC", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_C[var3] = var15;
      }

      return CONST_C[var3];
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
         throw new RuntimeException("rip/breeze/dC" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
