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
import rip.breeze.client.UserTheme;

public class ImageUtil9 extends UIPanel {
   private final BreezeModule dataBuilder52_h;
   private final rip.breeze.client.AnimationTimer dataBuilder15_i;
   private final rip.breeze.client.AnimationTimer dataBuilder15_j;
   private final rip.breeze.client.AnimationTimer dataBuilder15_k;
   private final rip.breeze.client.AnimationTimer dataBuilder15_l;
   private final RenderUtil5 dataBuilder105_m;
   private final RenderUtil45 dataBuilder86_n;
   private boolean fieldBool_o;
   private static String string_p;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);

   public ImageUtil9(BreezeModule var1, RenderUtil5 var2, UserTheme var3) {
      long var4 = 101176713191834L;
      long var6 = var4 ^ 88353926441133L;
      super();
      this.dataBuilder15_i = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.dataBuilder15_j = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.BACK_OUT);
      this.dataBuilder15_k = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.dataBuilder15_l = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
      this.dataBuilder52_h = var1;
      this.d = 40.0F;
      this.dataBuilder105_m = var2;
      this.fieldBool_o = var3 != null;
      this.dataBuilder15_j.toggle(var6, this.fieldBool_o);
      this.dataBuilder86_n = new RenderUtil45(var1, null, false, var3);
   }

   public void clamp(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      String var10000 = getString();
      super.toggle(var1, var2, var3);
      String var10 = var10000;
      this.dataBuilder15_i.toggle(var6, this.a(var1, var2));
      this.dataBuilder15_k.toggle(var6, this.dataBuilder105_m.getBreezeUtil78_n() == this.dataBuilder86_n);
      this.dataBuilder15_l.toggle(var6, this.a(var1, var2) && var1 < this.a + 15.0F && !this.dataBuilder15_k.isBool_e());
      Color var11 = RenderUtil1.clamp(
         RenderUtil1.clamp(
            BreezeContext.authSession_c.getColor("default.text-tertiary"),
            BreezeContext.authSession_c.getColor("default.text-primary"),
            (float)this.dataBuilder15_i.getDouble(var8)
         ),
         BreezeContext.authSession_c.getColor("default.text-primary"),
         (float)Math.max(this.dataBuilder15_k.getDouble(var8), this.dataBuilder15_j.getDouble(var8))
      );
      Color var12 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("default.accent").darker().darker(),
         BreezeContext.authSession_c.getColor("default.accent"),
         Math.max((float)this.dataBuilder15_j.getDouble(var8), (float)this.dataBuilder15_k.getDouble(var8))
      );
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this,
            9.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("default.layer-one"),
               BreezeContext.authSession_c.getColor("default.hovered"),
               (float)this.dataBuilder15_i.getDouble(var8)
            )
         );
      BreezeContext.iRenderer_b
         .fillGradientRectSimple(
            this.a,
            this.b,
            (float)(9.0 + (this.c - 9.0F) * this.dataBuilder15_k.getDouble(var8)),
            this.d,
            new float[]{9.0F, (float)(9.0 * this.dataBuilder15_k.getDouble(var8)), (float)(9.0 * this.dataBuilder15_k.getDouble(var8)), 9.0F},
            RenderUtil1.clamp(
               var12, BreezeContext.authSession_c.getColor("default.accent::brighter"), (float)this.dataBuilder15_l.getDouble(var8)
            )
         );
      BreezeContext.iRenderer_b.drawText(this.dataBuilder52_h.moduleName, this.a + 15.0F, this.b + 11.0F, var11, EnumType32.SOURCE_SANS, 18.0F);
      if (this.fieldBool_o) {
         BreezeContext.iRenderer_b
            .drawGradientIcon(
               this.a + this.c - 25.0F,
               this.b + this.d / 2.0F,
               BreezeContext.authSession_c.getColor("default.accent"),
               BreezeContext.authSession_c.getColor("default.text-primary"),
               (float)this.dataBuilder15_j.getDouble(var8)
            );
      }

      if (var10 == null) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   public void update(boolean var1) {
      long var2 = 109079844552067L;
      long var4 = var2 ^ 122508221625524L;
      this.fieldBool_o = var1;
      this.dataBuilder15_j.toggle(var4, var1);
      if (var1) {
         this.dataBuilder105_m.calculate_3(this.dataBuilder86_n);
         this.dataBuilder86_n.setBool_u();
      }
   }

   public boolean isBool_o() {
      return this.fieldBool_o;
   }

   public BreezeModule getDataBuilder52_h() {
      return this.dataBuilder52_h;
   }

   public DateUtil getDataBuilder51() {
      return this.dataBuilder86_n.getDataBuilder51_k();
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (!this.a(var1, var2)) {
         return false;
      }

      if (var3 != 1 && (var3 != 0 || !(var1 < this.a + 15.0F))) {
         if (var3 == 0) {
            this.update(!this.fieldBool_o);
            return true;
         } else {
            return true;
         }
      } else {
         this.dataBuilder105_m.calculate_3(this.dataBuilder86_n);
         return true;
      }
   }

   public static void initialize(String var0) {
      string_p = var0;
   }

   public static String getString() {
      return string_p;
   }

   static {
      long var0 = 58148056124120L;
      initialize("pQO1uc");
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
      String var6 = "\u0013ÚÁÕ\u0092WS\u0097_³\u001d>'ÿ,¶Á\u001b\u009c\u0090\u000fB0Î`iq)(8ù$\u0011å0í\u0088Lh¡ìà·'Õ\u0004\u0096Y\u0012}\u008dbÏ\u0013u\b VÉ£\u008c\u008a\u0010\u0012\u0014ÉFáb\u0011h·´:d½Pýp\u0096JbI>0b«·W(Q\u000fo±²h¢\u0090\u001aìkDü\u0094\"~õ¦,\u0092C\u008bürTÊ1%¤ôT4í\u008cú%\u0088ÔoQ \u0000\u009c§ß\u0017\u0005âRô¨¢\u009c+#µ!Í¾\u0086Ã^t\u001b¾\u009bô}¬·ãQô(«\"ýb\u0007\u0010\u001f(Aq\u0018e\u000fà\u001c\u000bÛGrDúaR¿Õ¿~â\u0001Ã\u0083ðwhÍo®M\u0096\b(\u0014úD÷«µÆÍD\u0088þN¶Ç\u0095\u000b3\u009fv\u00153\u0000¯Ikþ\u0096i\u0007\u009fTyÛïô½\u0018YUy";
      int var7 = "\u0013ÚÁÕ\u0092WS\u0097_³\u001d>'ÿ,¶Á\u001b\u009c\u0090\u000fB0Î`iq)(8ù$\u0011å0í\u0088Lh¡ìà·'Õ\u0004\u0096Y\u0012}\u008dbÏ\u0013u\b VÉ£\u008c\u008a\u0010\u0012\u0014ÉFáb\u0011h·´:d½Pýp\u0096JbI>0b«·W(Q\u000fo±²h¢\u0090\u001aìkDü\u0094\"~õ¦,\u0092C\u008bürTÊ1%¤ôT4í\u008cú%\u0088ÔoQ \u0000\u009c§ß\u0017\u0005âRô¨¢\u009c+#µ!Í¾\u0086Ã^t\u001b¾\u009bô}¬·ãQô(«\"ýb\u0007\u0010\u001f(Aq\u0018e\u000fà\u001c\u000bÛGrDúaR¿Õ¿~â\u0001Ã\u0083ðwhÍo®M\u0096\b(\u0014úD÷«µÆÍD\u0088þN¶Ç\u0095\u000b3\u009fv\u00153\u0000¯Ikþ\u0096i\u0007\u009fTyÛïô½\u0018YUy"
         .length();
      char var8 = '8';
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
                     CONST_R = var4;
                     CONST_S = new String[8];
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

                  var6 = "\u0095Æç~±F\u0096J\u0089\u0094ÚÁªàó§'ôÆß}/¶\u0019jû$ùCÓÿñ(¢ô\u008d§î\u0080¿ÁGþ¿×å\u0006(Ä\fÃ\u008asÕtp7ø\u0091sÿ©«ý\u001eÕöö\u008f\u009cW\u0011É";
                  var7 = "\u0095Æç~±F\u0096J\u0089\u0094ÚÁªàó§'ôÆß}/¶\u0019jû$ùCÓÿñ(¢ô\u008d§î\u0080¿ÁGþ¿×å\u0006(Ä\fÃ\u008asÕtp7ø\u0091sÿ©«ý\u001eÕöö\u008f\u009cW\u0011É"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23516;
      if (CONST_S[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_T.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_T.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/eu", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_R[var3].getBytes("ISO-8859-1");
         CONST_S[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_S[var3];
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
         throw new RuntimeException("rip/breeze/eu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
