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
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RenderUtil24 extends Util28 {
   public final long fieldLong_j;
   public final RenderUtil19_x enum4Val_k;
   private final MathUtil8 dataBuilder33_l;
   private final ImageUtil2 breezeUtil110_m;
   private final RenderUtil34 dataBuilder47_n;
   private static final String[] CONST_P;
   private static final String[] CONST_Q;
   private static final Map CONST_R = new HashMap(13);

   public RenderUtil24(RenderUtil19_x var1, long var2, BiConsumer<Float, Integer> var4) {
      long var5 = 59119372363521L;
      super();
      this.enum4Val_k = var1;
      this.fieldLong_j = var2;
      this.dataBuilder33_l = new MathUtil8(this::processAll_2, false, 0);
      this.breezeUtil110_m = new ImageUtil2(new LicenseState(), "add", this::initialize, true);
      this.breezeUtil110_m.setFloat_t(0.05F);
      this.dataBuilder47_n = new RenderUtil34(var1, var2, this::processAll, var4);
      this.a(new UIPanel[]{this.dataBuilder33_l, this.breezeUtil110_m});
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs6(var2, var1, 0, this, this::initialize_2, this::update_1);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(7425746405984240998L, var5);
      Object[] var10002 = var10001;
      CloudAuthService var9 = var10000;
      Method var8 = var10003;

      try {
         var8.invoke(var9, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   private void initialize() {
      this.dataBuilder47_n.initialize();
      BreezeContext.guiPanelSettings_f.update(this.dataBuilder47_n);
   }

   public void update(Util142 var1) {
      this.dataBuilder47_n.initialize_2(var1.fieldInt_a, var1.string_b);
      BreezeContext.guiPanelSettings_f.update(this.dataBuilder47_n);
   }

   public void processAll() {
      long var1 = 116291583173057L;
      this.dataBuilder33_l.initialize_3();
      this.dataBuilder33_l.setBool_k();
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs6(this.fieldLong_j, this.enum4Val_k, 0, this, this::initialize_2, this::update_1);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(7047518805460911014L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   private void processAll_2(int var1) {
      long var2 = 19702954484753L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs6(this.fieldLong_j, this.enum4Val_k, var1, this, this::initialize_2, this::update_1);
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(7214108188561966710L, var2);
      Object[] var10002 = var10001;
      CloudAuthService var6 = var10000;
      Method var5 = var10003;

      try {
         var5.invoke(var6, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   private void update_1(String var1) {
      long var2 = 101066649825394L;
      BreezeContext.guiPanelSettings_f.processAll("Failed fetching reviews", RenderUtil18_x.RED + var1);
   }

   private void initialize_2(ArrayList<RenderUtil46> var1, int var2) {
      BreezeContext.guiPanelSettings_f.initialize(this::lambda$loadReviewsCallback_Inner0);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      BreezeContext.iRenderer_b
         .drawText(
            "Reviews:",
            this.a + 22.0F,
            this.b + 22.0F,
            BreezeContext.authSession_c.getColor("default.text-primary"),
            EnumType32.SOURCE_SANS,
            22.0F
         );
      if (!this.dataBuilder33_l.k() && !this.dataBuilder33_l.isBool_k()) {
         float var6 = BreezeContext.iRenderer_b.measureText("No reviews yet", EnumType32.SOURCE_SANS, 18.0F);
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.c() - var6 / 2.0F - 16.0F,
               this.b + 70.0F,
               var6 + 32.0F,
               34.0F,
               17.0F,
               BreezeContext.authSession_c.getColor("default.layer-two")
            );
         BreezeContext.iRenderer_b
            .drawText(
               "No reviews yet",
               this.c() - var6 / 2.0F,
               this.b + 78.0F,
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
      }

      super.processNullable(var1, var2, var3);
   }

   public void calculate_2() {
      super.processNullable_4();
      this.dataBuilder47_n
         .a(
            BreezeContext.guiPanelSettings_f.getLicenseState_i().calculateFloat_3() - 250.0F,
            BreezeContext.guiPanelSettings_f.getLicenseState_i().calculateFloat_4() - 150.0F,
            500.0F,
            300.0F
         );
      this.dataBuilder33_l.a(this.a, this.b + 60.0F, this.c, this.d - 70.0F);
      this.breezeUtil110_m.a(this.a + this.c - 58.0F, this.b + 18.0F, 35.0F, 35.0F);
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   private void lambda$loadReviewsCallback_Inner0(ArrayList var1, int var2) {
      long var3 = 93350572562209L;
      this.dataBuilder33_l.update(var1);
      this.dataBuilder33_l.fieldBool_j = var2 > this.dataBuilder33_l.getValue();
   }

   static {
      long var0 = 117067675661182L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[8];
      int var5 = 0;
      String var6 = "\u0084NÜÏ\u001a\tá\u001a\u0082\t\u0001\u0004§)-Ó^äq\u008c2mÏ\u008eµ\u0014ç\u001f9T$\u0003Æ!7i[7\u0010;\u0010j\u0006Ý\u00901).6Î¡Yû¡%®°(\u007fVz!\u0019`c\u0012\u0002ªÖ\u0001B(\\\u0004¨5j·\u0017oÕÞðQ\u00853ª\fH}\\ð^aÿ\u0001 @ Á\u0018g\\#\u0090\u0006<\u009b\u0083\u009eSÒ\u0093ç\u0004¤\u00ad\u0091âìÉ~\u0012©?Ûg¿\u001cþõ Ù}Øm\u001c9\u009d\u0087Å\n;owFÞ\u0094\u008bê'Ó?\u001c05?¥\u008a\u009cÂ\u001c\"\u0006(À\nJþØ\u0092%\u008bØ*@èÏtÿ`pÅ\u008d\u001d pwù\u0093±ZïÉY\u0018)}P 1U\u0001$´";
      int var7 = "\u0084NÜÏ\u001a\tá\u001a\u0082\t\u0001\u0004§)-Ó^äq\u008c2mÏ\u008eµ\u0014ç\u001f9T$\u0003Æ!7i[7\u0010;\u0010j\u0006Ý\u00901).6Î¡Yû¡%®°(\u007fVz!\u0019`c\u0012\u0002ªÖ\u0001B(\\\u0004¨5j·\u0017oÕÞðQ\u00853ª\fH}\\ð^aÿ\u0001 @ Á\u0018g\\#\u0090\u0006<\u009b\u0083\u009eSÒ\u0093ç\u0004¤\u00ad\u0091âìÉ~\u0012©?Ûg¿\u001cþõ Ù}Øm\u001c9\u009d\u0087Å\n;owFÞ\u0094\u008bê'Ó?\u001c05?¥\u008a\u009cÂ\u001c\"\u0006(À\nJþØ\u0092%\u008bØ*@èÏtÿ`pÅ\u008d\u001d pwù\u0093±ZïÉY\u0018)}P 1U\u0001$´"
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
                     CONST_P = var4;
                     CONST_Q = new String[8];
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

                  var6 = "mÏ\u0094_Íß\u001c¸\u0015ùå´}\u0099\u001dá\u0000uóAKqáT\u0017¿¾c!¡\u0089b({\u0083\u0013\u0082yÓ¤kúª`Æ¬ÇÒÙ\u008a¬\u0092¼åÌ\u000f¦\u009c}zâÆ`L\u0089ëÑ{¯^}ö\u000b";
                  var7 = "mÏ\u0094_Íß\u001c¸\u0015ùå´}\u0099\u001dá\u0000uóAKqáT\u0017¿¾c!¡\u0089b({\u0083\u0013\u0082yÓ¤kúª`Æ¬ÇÒÙ\u008a¬\u0092¼åÌ\u000f¦\u009c}zâÆ`L\u0089ëÑ{¯^}ö\u000b"
                     .length();
                  var8 = ' ';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21070;
      if (CONST_Q[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_R.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_R.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/c7", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_P[var3].getBytes("ISO-8859-1");
         CONST_Q[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Q[var3];
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
         throw new RuntimeException("rip/breeze/c7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
