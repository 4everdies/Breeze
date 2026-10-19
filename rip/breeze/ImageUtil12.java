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

public class ImageUtil12 extends RenderUtil5 {
   private final dk dk_r;
   private final ImageUtil8 dataBuilder131_s;
   private final List<eA> list_t;
   private final RenderUtil17_x dataBuilder95_u;
   private eA eA_v;
   private LicenseState licenseState_w;
   private boolean fieldBool_x;
   private boolean fieldBool_y;
   private static final String[] CONST_A;
   private static final String[] CONST_B;
   private static final Map CONST_C = new HashMap(13);
   private static final long[] CONST_D;
   private static final Integer[] CONST_E;
   private static final Map CONST_F;

   public ImageUtil12() {
      long var1 = 30421230746657L;
      super();
      boolean var10000 = ConfigUtil2_x.checkCondition_2();
      this.list_t = new ArrayList<>();
      this.dataBuilder95_u = new RenderUtil17_x();
      boolean var3 = var10000;
      this.licenseState_w = new LicenseState();
      this.fieldBool_x = false;
      this.fieldBool_y = false;
      this.dk_r = new dk();
      this.dataBuilder131_s = new ImageUtil8(this, this.dk_r);
      this.l.initialize(this.dataBuilder131_s);

      for (FileUtil3 var5 : BreezeContext.dataBuilder15_j.getList()) {
         eA var6 = new eA(var5, this::update, this::lambda$new_Inner0);
         this.list_t.add(var6);
         this.l.initialize(var6);
         if (!var3) {
            break;
         }
      }

      this.o = 10;
      this.p = 843732268;
   }

   private void update(eA var1) {
      this.eA_v = var1;
      this.dk_r.a(var1.j().l());
      this.dataBuilder95_u.processAll(this.getString(var1.j()));
      this.e(this.dataBuilder95_u);
   }

   private String getString(FileUtil3 var1) {
      long var2 = 31251818948134L;
      String var4 = HttpUtil2.buildString_2(var1.getFile_A());
      return var4 == null ? "" : var4;
   }

   public boolean isActive(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.licenseState_w.isValid(var1, var2)) {
         if (this.fieldBool_x) {
            return true;
         }

         if (!this.fieldBool_y) {
            BreezeContext.guiPanelSettings_f
               .processAll("Invalid script", "Fill out the name and description, and select a local script to publish.");
            return true;
         }

         String var6 = this.getString(this.eA_v.j());
         if (var6.getBytes(StandardCharsets.UTF_8).length > -868586502) {
            BreezeContext.guiPanelSettings_f
               .processAll("Script too large", RenderUtil18_x.RED + ".C>+");
            return true;
         }

         CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
         Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs8(
            this.dk_r.n(), this.dk_r.o(), Util140.buildString_2(), this.dk_r.p(), this.dk_r.q(), var6, this::initialize, this::update_1
         );
         Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-4997964962153636536L, var4);
         Object[] var10002 = var10001;
         CloudAuthService var9 = var10000;
         Method var8 = var10003;

         try {
            var8.invoke(var9, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         this.fieldBool_x = true;
         return true;
      } else {
         return false;
      }
   }

   private void initialize(StringDecryptHelper2 var1) {
      BreezeContext.guiPanelSettings_f.initialize(ImageUtil12::lambda$publishCallback_Inner1);
   }

   private void update_1(String var1) {
      long var2 = 82518021302027L;
      this.fieldBool_x = false;
      BreezeContext.guiPanelSettings_f.processAll("Failed to publish script", RenderUtil18_x.RED + var1);
   }

   @Override
   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      super.calculate(var1, var2, var3);
      boolean var10000 = ConfigUtil2_x.isValid_2();
      String var6 = this.dk_r.n();
      String var7 = this.dk_r.o();
      boolean var8 = var10000;
      this.fieldBool_y = var6.length() > 3 && var7.length() > 5 && this.eA_v != null;
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_w,
            9.0F,
            !this.fieldBool_x && this.fieldBool_y
               ? BreezeContext.authSession_c.getColor("button.background")
               : BreezeContext.authSession_c.getColor("button.background-disabled")
         );
      if (this.fieldBool_x) {
         BreezeContext.iRenderer_b
            .fillRectSimple(
               this.licenseState_w.calculateFloat_3(),
               this.licenseState_w.calculateFloat_4(),
               12.0F,
               3.0F,
               BreezeContext.authSession_c.getColor("default.text-primary")
            );
         if (!var8) {
            return;
         }
      }

      BreezeContext.iRenderer_b
         .drawTextAt(
            "upload",
            this.licenseState_w.calculateFloat_3() - 15.0F,
            this.licenseState_w.calculateFloat_4() - 16.0F,
            1.25F,
            this.fieldBool_y
               ? BreezeContext.authSession_c.getColor("button.text")
               : BreezeContext.authSession_c.getColor("button.text-disabled")
         );
   }

   @Override
   public void calculate_2() {
      super.calculate_2();
      this.licenseState_w = new LicenseState(this.a + 10.0F, this.b + this.d - 50.0F, this.l.c - 20.0F, 40.0F);
   }

   private static void lambda$publishCallback_Inner1(StringDecryptHelper2 var0) {
      long var1 = 79079410418713L;
      RenderUtil3 var10000 = BreezeContext.guiPanelSettings_f.dataBuilder100_r;
      RenderUtil14_x var10001 = new RenderUtil14_x();
      CloudAuthService var10004 = BreezeContext.cloudAuthService_h;
      Object[] var10005 = rip.breeze.client.MathUtil8.noArgs();
      Method var10007 = rip.breeze.client.MathUtil8.getMethod_3(-4318920670835801086L, var1);
      Object[] var10006 = var10005;
      CloudAuthService var6 = var10004;
      Method var4 = var10007;

      try {
         var5 = (UserInfo)var4.invoke(var6, var10006);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      /* constructor call removed */
      var10000.update(var10001);
      BreezeContext.guiPanelSettings_f.dataBuilder100_r.initialize();
   }

   private boolean lambda$new_Inner0(eA var1) {
      long var2 = 111923425529403L;
      return var1 == this.eA_v;
   }

   static {
      long var0 = 13619174360898L;
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
      String var6 = "=Xq.Û-\u008fÄ±mÝ\u009aÖ\u0019SÏUÈ\u0000N¶%·\u000f\u0082)E\t\rRMf?¡¨\u001c\u0089»3k\u0099Îñ!¢d\u0091N¾k¥¹Jye\u001b(Á\u008fB\\÷qì5\u0012\u0080o0$\u0012É_\u001b\u009a\u009df\u001bU¦¤¬y*)àÛ¾²ÕßY¼F\u0098\u0010\u00958Â\u00854¼\nZàÅðPM\u009c?¢âÂ#\u0015\u0094\u0018?\u0088/ÿ§%%àÖß\t.©\u001a\u0093\u009b\u009d\"\u0004v\u0082|ê\u000fònË\u008dUJ(É\u0099\fa\u001b\u0080Ú\nì\u008e¶°\u0010\u008czioË¹ \u008c\u0095Â\u0002o\u008bË\u0088Ë34\u0083\u001dxk\u0014ÞnÐ\u008f!Íe\u00862»\u0019Aza£<øAÜ¬\u0004a\u0004yv¬lì»}Ä«hý3Sà\u0002-\u0088\u0095µÊR¸\u0014î,ÀRxÿî;\u0006\u0089\u008aË&·ëª'òÔ\u007fçYûü_Ç#\u0007\u0001æ´\u001b*cBÇ¸\tJ»ÏL#}rÍGg\u0092<\f' \u008a¸d\u0001_kÖ\u0084ó$Ù¨ß\b\u0090y)j\tdb\u001d%E®\u0090\u0083\u009c-\u000b<>0Dyþ\u000f¶ªð\u0085h\u0084ùs\u0090mjÌùÕþ\u007f±No$\u008dGÙ\\¨\"a¿IdY/ x\u0004¸à6+\fæþeñ\u0010KL\u0003MÙg\u009fb¯Æé\u008c\u008b\u0099ÿó@32Ï\u0014\u000b\u00825ïçÕ\f²Ã!\r«Øl\u0018BÆ`\u0082úm8\u0097\n\u0017\f\u001eM÷Ë¡ÐX©²ÜÑ\u0010FBÛm\u0082\u0019\u001e»\u007fXå\u0087²P=VT\u0092ØBG%(Iz\u001c=ã'#\bÍR¿O\u0094\nPþ\u008f\u0015 [yè0bÄécV\u0002ò\u0094!\u00840\u0015=£\u0011a¬";
      int var7 = "=Xq.Û-\u008fÄ±mÝ\u009aÖ\u0019SÏUÈ\u0000N¶%·\u000f\u0082)E\t\rRMf?¡¨\u001c\u0089»3k\u0099Îñ!¢d\u0091N¾k¥¹Jye\u001b(Á\u008fB\\÷qì5\u0012\u0080o0$\u0012É_\u001b\u009a\u009df\u001bU¦¤¬y*)àÛ¾²ÕßY¼F\u0098\u0010\u00958Â\u00854¼\nZàÅðPM\u009c?¢âÂ#\u0015\u0094\u0018?\u0088/ÿ§%%àÖß\t.©\u001a\u0093\u009b\u009d\"\u0004v\u0082|ê\u000fònË\u008dUJ(É\u0099\fa\u001b\u0080Ú\nì\u008e¶°\u0010\u008czioË¹ \u008c\u0095Â\u0002o\u008bË\u0088Ë34\u0083\u001dxk\u0014ÞnÐ\u008f!Íe\u00862»\u0019Aza£<øAÜ¬\u0004a\u0004yv¬lì»}Ä«hý3Sà\u0002-\u0088\u0095µÊR¸\u0014î,ÀRxÿî;\u0006\u0089\u008aË&·ëª'òÔ\u007fçYûü_Ç#\u0007\u0001æ´\u001b*cBÇ¸\tJ»ÏL#}rÍGg\u0092<\f' \u008a¸d\u0001_kÖ\u0084ó$Ù¨ß\b\u0090y)j\tdb\u001d%E®\u0090\u0083\u009c-\u000b<>0Dyþ\u000f¶ªð\u0085h\u0084ùs\u0090mjÌùÕþ\u007f±No$\u008dGÙ\\¨\"a¿IdY/ x\u0004¸à6+\fæþeñ\u0010KL\u0003MÙg\u009fb¯Æé\u008c\u008b\u0099ÿó@32Ï\u0014\u000b\u00825ïçÕ\f²Ã!\r«Øl\u0018BÆ`\u0082úm8\u0097\n\u0017\f\u001eM÷Ë¡ÐX©²ÜÑ\u0010FBÛm\u0082\u0019\u001e»\u007fXå\u0087²P=VT\u0092ØBG%(Iz\u001c=ã'#\bÍR¿O\u0094\nPþ\u008f\u0015 [yè0bÄécV\u0002ò\u0094!\u00840\u0015=£\u0011a¬"
         .length();
      char var8 = '8';
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
                     CONST_A = var4;
                     CONST_B = new String[11];
                     CONST_F = new HashMap(13);
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
                     String var15 = "Nã¸ß\"Sß\u0086\u0081êºi\u0098\u0002\u009b/¸\u009fï¯np\fh";
                     int var16 = "Nã¸ß\"Sß\u0086\u0081êºi\u0098\u0002\u009b/¸\u009fï¯np\fh".length();
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

                     CONST_D = var13;
                     CONST_E = new Integer[3];
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

                  var6 = "9\"UÂÜA\u0098\u0018ûÓ\u0083Ñ½è\u0080\u0019k\u0090Lø³\u000fê:÷R\u008aäò \u0004þê·äâ\u001bÓBC wO\u0081Ã¨\"ë,¼ãoç@øÁç&öð\u0017\u0090¯\u0091{Ä£V\u0083&\u0018¨ð";
                  var7 = "9\"UÂÜA\u0098\u0018ûÓ\u0083Ñ½è\u0080\u0019k\u0090Lø³\u000fê:÷R\u008aäò \u0004þê·äâ\u001bÓBC wO\u0081Ã¨\"ë,¼ãoç@øÁç&öð\u0017\u0090¯\u0091{Ä£V\u0083&\u0018¨ð"
                     .length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15239;
      if (CONST_B[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_C.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_C.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dB", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_A[var3].getBytes("ISO-8859-1");
         CONST_B[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_B[var3];
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
         throw new RuntimeException("rip/breeze/dB" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5016;
      if (CONST_E[var3] == null) {
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
         long var5 = CONST_D[var3];
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
         Object[] var9 = (Object[])CONST_F.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_F.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/dB", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_E[var3] = var15;
      }

      return CONST_E[var3];
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
         throw new RuntimeException("rip/breeze/dB" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
