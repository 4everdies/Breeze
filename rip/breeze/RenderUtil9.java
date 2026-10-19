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
import rip.breeze.client.EnumType3;

public class RenderUtil9 extends UIPanel {
   protected final Runnable runnable_h;
   protected final String string_i;
   protected final rip.breeze.client.AnimationTimer dataBuilder15_j;
   protected RenderUtil12 dataBuilder124_k;
   protected String string_l;
   protected String string_m;
   protected String string_n;
   protected String string_o;
   protected String string_p;
   protected boolean fieldBool_q;
   protected boolean fieldBool_r;
   private static int fieldInt_s;
   private static final String[] CONST_X;
   private static final String[] CONST_Y;
   private static final Map CONST_Z = new HashMap(13);

   public RenderUtil9(LicenseState var1, String var2, Runnable var3) {
      this(var1, var2, var3, true);
   }

   public RenderUtil9(LicenseState var1, String var2, Runnable var3, boolean var4) {
      this(var1, var2, var3, var4, "");
   }

   public RenderUtil9(LicenseState var1, String var2, Runnable var3, boolean var4, String var5) {
      long var6 = 75673103595668L;
      super(var1);
      this.dataBuilder15_j = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      short var10001 = 18681;
      long var10002 = 387421824919346075L ^ var6;
      this.string_l = "icon.color";
      var10001 = 32572;
      var10002 = 4711560321951607903L ^ var6;
      this.string_m = "icon.color-hovered";
      var10001 = 22320;
      var10002 = 6483623858108990544L ^ var6;
      this.string_n = "icon.color-disabled";
      var10001 = 17520;
      var10002 = 7522667162160174869L ^ var6;
      this.string_o = "icon.background";
      var10001 = 25387;
      var10002 = 7461304216173981760L ^ var6;
      this.string_p = "icon.background-hovered";
      this.string_i = var2;
      this.runnable_h = var3;
      this.fieldBool_q = var4;
      if (!var5.isEmpty()) {
         this.dataBuilder124_k = new RenderUtil12(var5, var1);
      }
   }

   public void processAll(String var1, String var2, String var3, String var4, String var5) {
      long var6 = 25506033527659L;
      String var10001;
      if (var1 != null) {
         var10001 = var1;
      } else {
         short var8 = 13623;
         long var10002 = 2284174251104335273L ^ var6;
         var10001 = "icon.color-disabled";
      }

      this.string_l = var10001;
      if (var2 != null) {
         var10001 = var2;
      } else {
         short var10 = 20215;
         long var17 = 641182474259009132L ^ var6;
         var10001 = "icon.background";
      }

      this.string_m = var10001;
      if (var3 != null) {
         var10001 = var3;
      } else {
         short var12 = 15398;
         long var18 = 1729679448633048254L ^ var6;
         var10001 = "icon.background-hovered";
      }

      this.string_n = var10001;
      if (var4 != null) {
         var10001 = var4;
      } else {
         short var14 = 26996;
         long var19 = 7287345376008317409L ^ var6;
         var10001 = "icon.color-disabled";
      }

      this.string_o = var10001;
      if (var5 != null) {
         var10001 = var5;
      } else {
         short var16 = 2699;
         long var20 = 2393627675799538194L ^ var6;
         var10001 = "icon.background";
      }

      this.string_p = var10001;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 85972512685926L;
      long var10 = var4 ^ 46241641281725L;
      super.toggle(var1, var2, var3);
      this.dataBuilder15_j.toggle(var6, this.a(var1, var2) && !this.fieldBool_r);
      if (this.fieldBool_q && this.dataBuilder15_j.calculateDouble(var8) != 0.0) {
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               this.a,
               this.b,
               this.c,
               this.d,
               this.d / 2.0F - 5.0F,
               RenderUtil1.clamp(
                  BreezeContext.authSession_c.getColor(this.string_o),
                  BreezeContext.authSession_c.getColor(this.string_p),
                  (float)this.dataBuilder15_j.getDouble(var10)
               )
            );
      }

      BreezeContext.iRenderer_b
         .drawTextColored(
            this.string_i,
            this.a + 7.0F,
            this.b + 7.0F,
            this.c - 14.0F,
            this.d - 14.0F,
            this.fieldBool_r
               ? BreezeContext.authSession_c.getColor(this.string_n)
               : RenderUtil1.clamp(
                  BreezeContext.authSession_c.getColor(this.string_l),
                  BreezeContext.authSession_c.getColor(this.string_m),
                  (float)this.dataBuilder15_j.getDouble(var10)
               )
         );
      if (this.dataBuilder124_k != null) {
         this.dataBuilder124_k.update(var1, var2, var3);
      }
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      if (var4) {
         return false;
      }

      if (this.a(var1, var2) && var3 == 0) {
         if (this.runnable_h != null) {
            this.runnable_h.run();
         }

         return true;
      } else {
         return false;
      }
   }

   public void processNullable(float var1, float var2, float var3, float var4) {
      long var5 = 102388927128469L;
      super.drawColoredQuad(var1, var2, var3, var4);
      if (this.dataBuilder124_k != null) {
         this.dataBuilder124_k.a(var1, var2, var3, var4);
      }
   }

   public void setBool_r(boolean var1) {
      this.fieldBool_r = var1;
   }

   public static void initialize(int var0) {
      fieldInt_s = var0;
   }

   public static int getValue() {
      return fieldInt_s;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 28 : 0;
   }

   static {
      initialize(121);
      long var0 = 5139279460929L;
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
      String var6 = "a\u008dÛ49Ý¥^Ó\u0013\u000ee4¡\u001e\u0010(¨Z\u0094÷\u001dÙ/\u000fÄÀ\u0082õqÏ\u008c(mRoÑ\u0002ëÌS\u00801Ô¨ÀfÓöU\u0085\u0010¶uPÖ\\Ã\u0099@\u0095\u008a\u0010\u0011-\u0011Ïá\u001cM\u0091¸E(}µ\u0015I¬NV\u0001i733\u0016Ø\u009e»ä\u0086±%hp³È Ã\u0019ßæØm\u0016¦\u0019[Ðw\u0014\u0095ª a\\\u007f¨¯\u0095g\u00158\u000eëþ\u0007\u0098\u0096UiöH\u0014ìú:â\u0004ÆW³ë[b\u00000}ó\u0015D ÷]\u009eñ08\u000b÷<[È ¹IqôzÿéÚdgA^\u0005\u00adr\u0089´\u000el\u009f\u009c\u0004ÔÍQã¼,~ê\u0085(äU\u0012\u0005¡CÈaüö)\u0004Ä\u0001ü¡\u0001Í-dÍïÞ7äâDÁ\u0002p#\f\u009a\u0097\u007fB\u0090Xyê(e'¸a\u0094Ës\u0003Û\u0019fï=Ù(²Q\u0011\"V1]Û¹t\u000e\u0010\u0088Î/ðVIÞ\u009eIÇ5\u0005ÿ oW\u0017Õ\u009a\u0098\u0003\u009fy\u0003Ðõr\u001aCkÖª(;¶åæ\u0087\t'ë\u0087b\u008djà";
      int var7 = "a\u008dÛ49Ý¥^Ó\u0013\u000ee4¡\u001e\u0010(¨Z\u0094÷\u001dÙ/\u000fÄÀ\u0082õqÏ\u008c(mRoÑ\u0002ëÌS\u00801Ô¨ÀfÓöU\u0085\u0010¶uPÖ\\Ã\u0099@\u0095\u008a\u0010\u0011-\u0011Ïá\u001cM\u0091¸E(}µ\u0015I¬NV\u0001i733\u0016Ø\u009e»ä\u0086±%hp³È Ã\u0019ßæØm\u0016¦\u0019[Ðw\u0014\u0095ª a\\\u007f¨¯\u0095g\u00158\u000eëþ\u0007\u0098\u0096UiöH\u0014ìú:â\u0004ÆW³ë[b\u00000}ó\u0015D ÷]\u009eñ08\u000b÷<[È ¹IqôzÿéÚdgA^\u0005\u00adr\u0089´\u000el\u009f\u009c\u0004ÔÍQã¼,~ê\u0085(äU\u0012\u0005¡CÈaüö)\u0004Ä\u0001ü¡\u0001Í-dÍïÞ7äâDÁ\u0002p#\f\u009a\u0097\u007fB\u0090Xyê(e'¸a\u0094Ës\u0003Û\u0019fï=Ù(²Q\u0011\"V1]Û¹t\u000e\u0010\u0088Î/ðVIÞ\u009eIÇ5\u0005ÿ oW\u0017Õ\u009a\u0098\u0003\u009fy\u0003Ðõr\u001aCkÖª(;¶åæ\u0087\t'ë\u0087b\u008djà"
         .length();
      char var8 = ' ';
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
                     CONST_X = var4;
                     CONST_Y = new String[10];
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

                  var6 = "·*[7\b\u008e/³'Õ=\u0094\u001c>ºÓ\u009e\u001c\u00adpnö®Ô(HÁ\u00adÍ\u00adùmz\u0090'på>sÖ\u000b\u000býpî¨\u0019Ø\u0084['ÛÞ\u000f1ã\u0080C\f¥ß,4è\u0003";
                  var7 = "·*[7\b\u008e/³'Õ=\u0094\u001c>ºÓ\u009e\u001c\u00adpnö®Ô(HÁ\u00adÍ\u00adùmz\u0090'på>sÖ\u000b\u000býpî¨\u0019Ø\u0084['ÛÞ\u000f1ã\u0080C\f¥ß,4è\u0003"
                     .length();
                  var8 = 24;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11254;
      if (CONST_Y[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Z.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Z.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/ed", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_X[var3].getBytes("ISO-8859-1");
         CONST_Y[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Y[var3];
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
         throw new RuntimeException("rip/breeze/ed" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
