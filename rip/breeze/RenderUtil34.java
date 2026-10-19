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
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RenderUtil34 extends Util28 {
   private final RenderUtil19_x enum4Val_j;
   private final long fieldLong_k;
   private final Runnable runnable_l;
   private final BiConsumer<Float, Integer> biConsumer_m;
   private LicenseState licenseState_n;
   private int fieldInt_o;
   private StringDecryptHelper5 stringDecryptHelper5_p;
   private RenderUtil11 dataBuilder123_q;
   private RenderUtil11 dataBuilder123_r;
   private static final String[] CONST_T;
   private static final String[] CONST_U;
   private static final Map CONST_V = new HashMap(13);

   public RenderUtil34(RenderUtil19_x var1, long var2, Runnable var4, BiConsumer<Float, Integer> var5) {
      long var6 = 39722539315723L;
      super();
      this.enum4Val_j = var1;
      this.fieldLong_k = var2;
      this.runnable_l = var4;
      this.biConsumer_m = var5;
      this.stringDecryptHelper5_p = new StringDecryptHelper5("Description.. (optional)", new LicenseState());
      this.stringDecryptHelper5_p.update_8(true);
      this.stringDecryptHelper5_p.toggle_2(true);
      this.dataBuilder123_q = new RenderUtil11(new LicenseState(), "Publish", this::processAll);
      this.dataBuilder123_r = new RenderUtil11(new LicenseState(), "Cancel", this::lambda$new_Inner0);
      this.licenseState_n = new LicenseState();
      this.fieldInt_o = 0;
      this.a(new UIPanel[]{this.stringDecryptHelper5_p, this.dataBuilder123_q, this.dataBuilder123_r});
   }

   public void initialize() {
      this.stringDecryptHelper5_p.processAll("");
      this.fieldInt_o = 0;
   }

   public void initialize_2(int var1, String var2) {
      this.fieldInt_o = var1;
      this.stringDecryptHelper5_p.processAll(var2);
   }

   private void processAll() {
      long var1 = 6761720749009L;
      CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs6(
         this.fieldLong_k, this.enum4Val_j, this.fieldInt_o, this.stringDecryptHelper5_p.getString_j(), this.biConsumer_m, RenderUtil34::lambda$publishReview_Inner1
      );
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-7217507027391236303L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var5 = var10000;
      Method var4 = var10003;

      try {
         var4.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      BreezeContext.guiPanelSettings_f.initialize(this.runnable_l);
      BreezeContext.guiPanelSettings_f.update_1(this);
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this,
            BreezeContext.authSession_c.getFloat("cloud.corner-radius"),
            BreezeContext.authSession_c.getColor("toast.background")
         );
      int[] var10000 = MathUtil8.decrypt();
      BreezeContext.iRenderer_b
         .fillRoundedRectTwoColor(
            this,
            BreezeContext.authSession_c.getFloat("cloud.corner-radius"),
            BreezeContext.authSession_c.getFloat("drawer.border-thickness"),
            BreezeContext.authSession_c.getColor("drawer.border")
         );
      int[] var6 = var10000;
      this.dataBuilder123_q.setBool_o(this.fieldInt_o == 0);
      BreezeContext.iRenderer_b
         .drawText(
            "New Review",
            this.a + 25.0F,
            this.b + 25.0F,
            BreezeContext.authSession_c.getColor("default.text-secondary"),
            EnumType32.SOURCE_SANS,
            25.0F
         );
      int var7 = 0;
      if (this.licenseState_n.isValid(var1, var2)) {
         var7 = (int)((var1 - this.licenseState_n.fieldFloat_a) / this.licenseState_n.fieldFloat_c * 5.0F) + 1;
      }

      int var8 = 0;

      while (var8 <= 4) {
         label39: {
            if (var8 < this.fieldInt_o) {
               BreezeContext.iRenderer_b
                  .drawTextAt(
                     "star_filled",
                     this.a + 162.0F + var8 * 34,
                     this.b + 14.0F,
                     1.8F,
                     BreezeContext.authSession_c.getColor("cloud.star")
                  );
               if (var6 == null) {
                  break label39;
               }
            }

            BreezeContext.iRenderer_b
               .drawTextAt(
                  "star_filled",
                  this.a + 162.0F + var8 * 34,
                  this.b + 14.0F,
                  1.8F,
                  var8 < var7
                     ? BreezeContext.authSession_c.getColor("cloud.star-background::brighter;25")
                     : BreezeContext.authSession_c.getColor("cloud.star-background")
               );
         }

         var8++;
         if (var6 != null) {
            break;
         }
      }

      super.processNullable(var1, var2, var3);
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      var4 = super.checkCondition(var1, var2, var3, var4);
      if (!var4 && this.licenseState_n.isValid(var1, var2)) {
         this.fieldInt_o = (int)((var1 - this.licenseState_n.fieldFloat_a) / this.licenseState_n.fieldFloat_c * 5.0F) + 1;
      }

      if (!super.a(var1, var2)) {
         BreezeContext.guiPanelSettings_f.update_1(this);
      }

      return true;
   }

   public void calculate_2() {
      this.dataBuilder123_q.processNullable(this.a() - 130.0F, this.b + this.d - 40.0F, 120.0F, 30.0F);
      this.dataBuilder123_r.processNullable(this.a() - 260.0F, this.b + this.d - 40.0F, 120.0F, 30.0F);
      this.stringDecryptHelper5_p.processAll_2(this.a + 20.0F, this.b + 70.0F, this.c - 40.0F, this.d - 150.0F);
      this.licenseState_n = new LicenseState(this.a + 170.0F, this.b + 10.0F, 164.0F, 50.0F);
      super.processNullable_4();
   }

   public boolean checkCondition_2(int var1) {
      long var2 = 45508263211567L;
      boolean var4 = super.checkCondition_3(var1);
      if (!var4 && var1 == BreezeContext.iKeyCodeProvider_g.getKeyCode_BACK()) {
         BreezeContext.guiPanelSettings_f.update_1(this);
         var4 = true;
      }

      return var4;
   }

   @Override
   public boolean isValid(float var1, float var2) {
      return true;
   }

   @Override
   public boolean isValid_2(UIPanel var1) {
      return true;
   }

   private static void lambda$publishReview_Inner1(String var0) {
      long var1 = 44790378704067L;
      BreezeContext.guiPanelSettings_f.processAll("Failed posting review", RenderUtil18_x.RED + var0);
   }

   private void lambda$new_Inner0() {
      BreezeContext.guiPanelSettings_f.update_1(this);
   }

   static {
      long var0 = 120364148913033L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[16];
      int var5 = 0;
      String var6 = "\u009c\u0087¸Ï¦\u0090ôTH\u007f\u000b\u001d\u0088|o[\u009c\u0095°\u001eÏ¾\u0006Ø.Y;´\u001dz!UW\u008c9x\u0014U¦÷(\u008f%ð\u001d·Ý\u0099<Äl\u0018NÛÅ\u000e¶v®¶eD;Þ.è#Îäý\u009cAg\u0011Á7$S¦\u0001%()/úZJ,9\u0019G æâ;\u0000!]\u0090M\u0097Ï\u009bå\u008fÆÉm6\u0080Ü\u0017'¶\u000bT\u0093¼\u0018¼?R\u0018Çº4\u009f\u0086ÌK¶\u0014á\f ý\u0006EwØ¢zÜ\u0001\u0083\u008a¬8¨]çÚ'\u000f±*!o\u009f\u0090$Z:\u0002t\u009d\u0002ëm}À9d¥P·\u0004\u0091éÐS\u0096 \b\u0018u&é\u0093Dj8\u009eÃB\u009cv½\u000bApñy¼(À0¶ãÔ©\n³MÐk-È\u0092\u0010>ºyjç¾.\u0092/,ô\u008f\u0003¸\u008bÿ\u0081Ô×:\u009aô\u0087¯É0¿äc]z\u0089ûÏ©=ÜÃS·a\u0095\u008aç0Ý×\u009cÄ¤\u0006_\u008e\u0097\u0004\n\tº\u009ea\u0083¡ù\u0081¼ËW®\u000bcø\u0090/\u0005\u0010s\"?ïçv\u0090mÂE\u0006\u009d8\u0081c\u0006\u0010\u0094°e\u001az]õ \u009eâ\u0098\u0006×i§  \u0018]&\u007f£(A\u0089Èà\u008fÃjÝ\u0097§D\u0006\u009fÚ\u0013×H!Æ\u0086{\u008f\u0089\u000e]\u0013\u0018_¨:\u0016ALönì\u0087Ë\u0019\b\u0000\u009dîú£Aá ±7«(\u0017é\nqÆ´ä°º±Ùéf\u0012#\u0091\u0091v\u0005\u009dÊ\u008f&§Ò-u\u009b\u0082\u0099ÖïW\\ºô\u0099ç\r\u0012 \u0090o!\u00ad.¼B\u001aDtÁAVÕ\u008cJ\u0017íÔì\u0015·þ¯r\u008aì¥§?þ\u0018(bh^8Ï'\u0090\u009b\u0001p\u0092Ev31üWÀïÄ@\u0016\u0011^¤\u001c\u0086\u009bÈÁt@¢±öà&\u008f=®";
      int var7 = "\u009c\u0087¸Ï¦\u0090ôTH\u007f\u000b\u001d\u0088|o[\u009c\u0095°\u001eÏ¾\u0006Ø.Y;´\u001dz!UW\u008c9x\u0014U¦÷(\u008f%ð\u001d·Ý\u0099<Äl\u0018NÛÅ\u000e¶v®¶eD;Þ.è#Îäý\u009cAg\u0011Á7$S¦\u0001%()/úZJ,9\u0019G æâ;\u0000!]\u0090M\u0097Ï\u009bå\u008fÆÉm6\u0080Ü\u0017'¶\u000bT\u0093¼\u0018¼?R\u0018Çº4\u009f\u0086ÌK¶\u0014á\f ý\u0006EwØ¢zÜ\u0001\u0083\u008a¬8¨]çÚ'\u000f±*!o\u009f\u0090$Z:\u0002t\u009d\u0002ëm}À9d¥P·\u0004\u0091éÐS\u0096 \b\u0018u&é\u0093Dj8\u009eÃB\u009cv½\u000bApñy¼(À0¶ãÔ©\n³MÐk-È\u0092\u0010>ºyjç¾.\u0092/,ô\u008f\u0003¸\u008bÿ\u0081Ô×:\u009aô\u0087¯É0¿äc]z\u0089ûÏ©=ÜÃS·a\u0095\u008aç0Ý×\u009cÄ¤\u0006_\u008e\u0097\u0004\n\tº\u009ea\u0083¡ù\u0081¼ËW®\u000bcø\u0090/\u0005\u0010s\"?ïçv\u0090mÂE\u0006\u009d8\u0081c\u0006\u0010\u0094°e\u001az]õ \u009eâ\u0098\u0006×i§  \u0018]&\u007f£(A\u0089Èà\u008fÃjÝ\u0097§D\u0006\u009fÚ\u0013×H!Æ\u0086{\u008f\u0089\u000e]\u0013\u0018_¨:\u0016ALönì\u0087Ë\u0019\b\u0000\u009dîú£Aá ±7«(\u0017é\nqÆ´ä°º±Ùéf\u0012#\u0091\u0091v\u0005\u009dÊ\u008f&§Ò-u\u009b\u0082\u0099ÖïW\\ºô\u0099ç\r\u0012 \u0090o!\u00ad.¼B\u001aDtÁAVÕ\u008cJ\u0017íÔì\u0015·þ¯r\u008aì¥§?þ\u0018(bh^8Ï'\u0090\u009b\u0001p\u0092Ev31üWÀïÄ@\u0016\u0011^¤\u001c\u0086\u009bÈÁt@¢±öà&\u008f=®"
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
                     CONST_T = var4;
                     CONST_U = new String[16];
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

                  var6 = "U\u0093«¤SüÿÉ\u0097ÆjÄ\u0003~Ê;Ð½9G_Ú\u0081\u0004\u0014¬sdÏ2¿NM ³\u0007À\u0097Çýøýáß6$é>©±æ!=Þ\u0012°[lKô#dAH\u0018}\u0018\u001cÐ\u0089]¡M\\ÕË\u0080@\u0091\u0089\u0087¶\u0091®ÿÆ»\u008fR";
                  var7 = "U\u0093«¤SüÿÉ\u0097ÆjÄ\u0003~Ê;Ð½9G_Ú\u0081\u0004\u0014¬sdÏ2¿NM ³\u0007À\u0097Çýøýáß6$é>©±æ!=Þ\u0012°[lKô#dAH\u0018}\u0018\u001cÐ\u0089]¡M\\ÕË\u0080@\u0091\u0089\u0087¶\u0091®ÿÆ»\u008fR"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10583;
      if (CONST_U[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_V.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_V.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/c_", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_T[var3].getBytes("ISO-8859-1");
         CONST_U[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_U[var3];
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
         throw new RuntimeException("rip/breeze/c_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
