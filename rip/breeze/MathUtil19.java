package rip.breeze;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.EnumType3;

public class MathUtil19 extends Util28 {
   private final StringDecryptHelper6 stringDecryptHelper6_j;
   private final StringDecryptHelper5 stringDecryptHelper5_k;
   private final ImageUtil6 dataBuilder121_l;
   private final RenderUtil12 dataBuilder124_m;
   private final rip.breeze.client.AnimationTimer dataBuilder15_n;
   private LicenseState licenseState_o;
   private static final String[] CONST_Q;
   private static final String[] CONST_R;
   private static final Map CONST_S = new HashMap(13);

   public MathUtil19() {
      long var1 = 115857020038452L;
      super();
      this.stringDecryptHelper6_j = new StringDecryptHelper6("Config name", new LicenseState(), null);
      this.stringDecryptHelper5_k = new StringDecryptHelper5("Description", new LicenseState(), null);
      this.dataBuilder121_l = new ImageUtil6(false);
      this.dataBuilder124_m = new RenderUtil12("Setting your config to public will make it so everyone can see it in the cloud tab.", new LicenseState());
      this.dataBuilder15_n = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.LINEAR);
      this.licenseState_o = new LicenseState();
      this.stringDecryptHelper6_j.clamp_9(35);
      this.stringDecryptHelper6_j.clamp_10(22);
      this.stringDecryptHelper5_k.clamp_14(18);
      this.stringDecryptHelper5_k.clamp_13(255);
      this.stringDecryptHelper5_k.toggle_2(true);
      this.a(new UIPanel[]{this.stringDecryptHelper6_j, this.stringDecryptHelper5_k, this.dataBuilder121_l, this.dataBuilder124_m});
   }

   public String buildString() {
      return this.stringDecryptHelper6_j.getString_j();
   }

   public String buildString_2() {
      return this.stringDecryptHelper5_k.getString_j();
   }

   public boolean checkCondition() {
      long var1 = 23024143309036L;
      return !this.dataBuilder121_l.isBool_i();
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this.licenseState_o,
            BreezeContext.authSession_c.getFloat("cloud.corner-radius"),
            BreezeContext.authSession_c.getColor("default.layer-one")
         );
      this.dataBuilder15_n.toggle(var6, this.dataBuilder124_m.a(var1, var2));
      Color var10 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("default.text-tertiary"),
         BreezeContext.authSession_c.getColor("default.text-secondary"),
         (float)this.dataBuilder15_n.getDouble(var8)
      );
      BreezeContext.iRenderer_b
         .drawText(
            "Public:",
            this.licenseState_o.fieldFloat_a + 29.0F,
            this.licenseState_o.fieldFloat_b + 65.0F,
            var10,
            EnumType32.SOURCE_SANS,
            18.0F
         );
      super.processNullable(var1, var2, var3);
   }

   public void calculate_2() {
      super.processNullable_4();
      this.licenseState_o = new LicenseState(this.a + 20.0F, this.b + 20.0F, this.c - 40.0F, 300.0F);
      this.stringDecryptHelper6_j.a(this.licenseState_o.fieldFloat_a + 25.0F, this.licenseState_o.fieldFloat_b + 25.0F, this.licenseState_o.fieldFloat_c - 50.0F, 30.0F);
      this.stringDecryptHelper5_k
         .processAll_2(this.licenseState_o.fieldFloat_a + 25.0F, this.licenseState_o.fieldFloat_b + 90.0F, this.licenseState_o.fieldFloat_c - 50.0F, 180.0F);
      this.dataBuilder121_l.a(this.licenseState_o.fieldFloat_a + 110.0F, this.licenseState_o.fieldFloat_b + 57.0F, 60.0F, 32.0F);
      this.dataBuilder124_m.a(this.licenseState_o.fieldFloat_a + 25.0F, this.licenseState_o.fieldFloat_b + 60.0F, 100.0F, 25.0F);
   }

   @Override
   public boolean isValid(UIPanel var1) {
      return true;
   }

   static {
      long var0 = 81462542658937L;
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
      String var6 = "×\u008b\u0003Ú\u0014e«IÏC\u0085+\u001fµ\u000f¦\u0015Åjºæës\u0016¶Ð3\u008fUÃ¢\u001e éh\u009d\u0019ã_Inner9\u0007²ç,e{®ÄÅÇö\u0013U£¤ìD\u0095e(8\u0099\u0018å)\u0090\u001f\u0001ñhÍ¤~\u0010\u0095\u0005mJq£,\u008c,³7õ\u0087w\u0093\r[>ÔKL«TXÓù4¬Þ\u000b\u001fÜêcP\u0080\u008f\u0010·¼\u0080X¦Ta|íO\u008bï\u0080®´{W»®\u008dÙ\u009b\u001c¤ßfL\u0089JºÈv\u0097jÐÌ\u0090º4(\u001fãEïlÔ#ö\u008aJ7æ£Âä\b\u0002¡W¸\u009eOê£Ê_\u0000$\u0082aÉ\u008a\r\u0019\u0080ÞO#®ì\u001f\u001a \n#å\u008eä\u0017\u0007\u0017|Ö'¢\u00001\u0090\u0018\u008fÓE¨@ôhQþø'X\u0010\u00ad\tì?ùLÂ.×n\u0006(8\u0018\u009fÿ¦4\u009f¿\u0096GÏzlfº;§k #âq ¼ÅÏÃiC<Êi8¸9Ô¯\tLi(ù9Òm'9\u000eg§ÿOC\u001aÙ\u0019væ\f£çíÂ/¾«@þ\u0081½3F\u0017¶1\u0082¥n\f\u0019°";
      int var7 = "×\u008b\u0003Ú\u0014e«IÏC\u0085+\u001fµ\u000f¦\u0015Åjºæës\u0016¶Ð3\u008fUÃ¢\u001e éh\u009d\u0019ã_Inner9\u0007²ç,e{®ÄÅÇö\u0013U£¤ìD\u0095e(8\u0099\u0018å)\u0090\u001f\u0001ñhÍ¤~\u0010\u0095\u0005mJq£,\u008c,³7õ\u0087w\u0093\r[>ÔKL«TXÓù4¬Þ\u000b\u001fÜêcP\u0080\u008f\u0010·¼\u0080X¦Ta|íO\u008bï\u0080®´{W»®\u008dÙ\u009b\u001c¤ßfL\u0089JºÈv\u0097jÐÌ\u0090º4(\u001fãEïlÔ#ö\u008aJ7æ£Âä\b\u0002¡W¸\u009eOê£Ê_\u0000$\u0082aÉ\u008a\r\u0019\u0080ÞO#®ì\u001f\u001a \n#å\u008eä\u0017\u0007\u0017|Ö'¢\u00001\u0090\u0018\u008fÓE¨@ôhQþø'X\u0010\u00ad\tì?ùLÂ.×n\u0006(8\u0018\u009fÿ¦4\u009f¿\u0096GÏzlfº;§k #âq ¼ÅÏÃiC<Êi8¸9Ô¯\tLi(ù9Òm'9\u000eg§ÿOC\u001aÙ\u0019væ\f£çíÂ/¾«@þ\u0081½3F\u0017¶1\u0082¥n\f\u0019°"
         .length();
      char var8 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString_3(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_Q = var4;
                     CONST_R = new String[8];
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

                  var6 = "\u009c\u0018¥Z¦uÍÔ\u0088£\u0017¿ÉJ%Ç\u0004Mé\u000e:>0$·\u0012©\\&ôzl&È\b\u0081\u0080R¦±(\u0098\u0017#~ÆW\u0081\u001aJÓ/~Ùì\b D&Öö@¶úDû<\u0084xA\u001eàQ÷¯\u0015~¶\u0094õ\u0089";
                  var7 = "\u009c\u0018¥Z¦uÍÔ\u0088£\u0017¿ÉJ%Ç\u0004Mé\u000e:>0$·\u0012©\\&ôzl&È\b\u0081\u0080R¦±(\u0098\u0017#~ÆW\u0081\u001aJÓ/~Ùì\b D&Öö@¶úDû<\u0084xA\u001eàQ÷¯\u0015~¶\u0094õ\u0089"
                     .length();
                  var8 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString_3(byte[] var0) {
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

   private static String buildString_4(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1042;
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
            throw new RuntimeException("rip/breeze/db", var10);
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
         CONST_R[var3] = buildString_3(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_R[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_4(var4, var5);
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
         throw new RuntimeException("rip/breeze/db" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
