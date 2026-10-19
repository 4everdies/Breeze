package rip.breeze;

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

public class RenderUtil14 extends UIPanel {
   private float fieldFloat_h;
   private int fieldInt_i;
   private static String string_j;
   private static final String[] CONST_L;
   private static final String[] CONST_M;
   private static final Map CONST_N = new HashMap(13);

   public RenderUtil14(float var1, int var2) {
      this.fieldFloat_h = var1;
      this.fieldInt_i = var2;
      this.c = 150.0F;
      this.d = 16.0F;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      int[] var10000 = MathUtil8.decrypt();
      super.toggle(var1, var2, var3);
      float var6 = BreezeContext.iRenderer_b
         .measureText(String.format("%.1f", this.fieldFloat_h), EnumType32.SOURCE_SANS, 14.0F);
      int[] var7 = var10000;
      BreezeContext.iRenderer_b
         .drawText(
            String.format(String.format("%.1f", this.fieldFloat_h)),
            this.a,
            this.b + 3.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            EnumType32.SOURCE_SANS,
            14.0F
         );
      BreezeContext.iRenderer_b
         .drawText(
            String.format("(%s)", DateUtil_x.buildString_3(this.fieldInt_i)),
            this.a + var6 + 75.0F,
            this.b + 3.0F,
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            EnumType32.SOURCE_SANS,
            14.0F
         );
      int var8 = 0;

      while (var8 < 5) {
         label19: {
            if (this.fieldFloat_h > var8 + 0.75) {
               BreezeContext.iRenderer_b
                  .drawTextAt(
                     "star_filled",
                     this.a - 2.0F + var6 + var8 * 14.5F,
                     this.b - 1.0F,
                     0.8F,
                     BreezeContext.authSession_c.getColor("cloud.star")
                  );
               if (var7 == null) {
                  break label19;
               }
            }

            BreezeContext.iRenderer_b
               .drawTextAt(
                  "star_filled",
                  this.a - 2.0F + var6 + var8 * 14.5F,
                  this.b - 1.0F,
                  0.8F,
                  BreezeContext.authSession_c.getColor("cloud.star-background")
               );
            if (this.fieldFloat_h >= var8 + 0.25F) {
               BreezeContext.iRenderer_b
                  .drawTextAt(
                     "star_filled_half",
                     this.a - 2.0F + var6 + var8 * 14.5F,
                     this.b - 1.0F,
                     0.8F,
                     BreezeContext.authSession_c.getColor("cloud.star")
                  );
            }
         }

         var8++;
         if (var7 != null) {
            break;
         }
      }
   }

   public void initialize(float var1, int var2) {
      this.fieldFloat_h = var1;
      this.fieldInt_i = var2;
   }

   public static void initialize_2(String var0) {
      string_j = var0;
   }

   public static String getString() {
      return string_j;
   }

   static {
      long var0 = 73325126790867L;
      initialize_2(null);
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
      String var6 = "\fz'\u0089ãé\n\u0083k\u0092*\u001c\u008e\u008c¨ám\u0098<\u009dº%ù_;\u0002>ú\u007f\u009aâu\u0084å%Aj\u001eYr\u0010Ýg!\u0080«Êà\u0082*ó\u0015k*@t¹\u0010&\u0003ç\u0082.a\u0004g\u009ex\u009a²4Ú~\u0085\u0010\u000e!¶u\u001cv\u0011\u0090NW\tFôGñø ì¦\u0002Ùé(\r^i\u001a\u008còah£!\u0010}øàqKÿ?U\u0091¯£·íÒÉ\u0018~`\u0090çGçç\u0018\u0003âÖÜ¹¹BZK/}ÎB\u0093v\u009b(1@\u009eÌ{dª~x?$Y\u000fp#¹±áÞLâ\u007fJú\u008a«4\fÉf[¿2ì·\u008e µ\\E(ÙÉ¶³X_\u008cà×ÁçvÿR\u0080\u0099,2Çë¦\u0098@ÎÕ\u0014ô6\u0096¯\u009f¶K\u0000Ø,\u0092f\u00039\u0018A\u0017ö!Ô`¥ÚH\u0081\u0011](9,\u009f)B½\u008c0L9E";
      int var7 = "\fz'\u0089ãé\n\u0083k\u0092*\u001c\u008e\u008c¨ám\u0098<\u009dº%ù_;\u0002>ú\u007f\u009aâu\u0084å%Aj\u001eYr\u0010Ýg!\u0080«Êà\u0082*ó\u0015k*@t¹\u0010&\u0003ç\u0082.a\u0004g\u009ex\u009a²4Ú~\u0085\u0010\u000e!¶u\u001cv\u0011\u0090NW\tFôGñø ì¦\u0002Ùé(\r^i\u001a\u008còah£!\u0010}øàqKÿ?U\u0091¯£·íÒÉ\u0018~`\u0090çGçç\u0018\u0003âÖÜ¹¹BZK/}ÎB\u0093v\u009b(1@\u009eÌ{dª~x?$Y\u000fp#¹±áÞLâ\u007fJú\u008a«4\fÉf[¿2ì·\u008e µ\\E(ÙÉ¶³X_\u008cà×ÁçvÿR\u0080\u0099,2Çë¦\u0098@ÎÕ\u0014ô6\u0096¯\u009f¶K\u0000Ø,\u0092f\u00039\u0018A\u0017ö!Ô`¥ÚH\u0081\u0011](9,\u009f)B½\u008c0L9E"
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
                     CONST_L = var4;
                     CONST_M = new String[11];
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

                  var6 = "'\u000fÆ?E\r7\u008að}§1wO\u0005\u0003\u0086òN\u001eÈÐ6ûÐ¨2\u00ad\u000bðÉu(hõlël\u0094\"xÊ×\rÀÌ\u0091\u0091-\u0016ØÃ]þ{KsQ\u0093\u0080\u009b¢â\u009fþ¸\u009bnkf\u001b»\b";
                  var7 = "'\u000fÆ?E\r7\u008að}§1wO\u0005\u0003\u0086òN\u001eÈÐ6ûÐ¨2\u00ad\u000bðÉu(hõlël\u0094\"xÊ×\rÀÌ\u0091\u0091-\u0016ØÃ]þ{KsQ\u0093\u0080\u009b¢â\u009fþ¸\u009bnkf\u001b»\b"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16680;
      if (CONST_M[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_N.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_N.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/ep", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_L[var3].getBytes("ISO-8859-1");
         CONST_M[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_M[var3];
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
         throw new RuntimeException("rip/breeze/ep" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
