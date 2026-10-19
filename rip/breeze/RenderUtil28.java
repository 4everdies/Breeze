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

class RenderUtil28 extends UIPanel {
   final String string_h;
   final String string_i;
   final float fieldFloat_j;
   final float fieldFloat_k;
   final long fieldLong_l;
   final rip.breeze.client.AnimationTimer dataBuilder15_m;
   final ImageUtil2 breezeUtil110_n;
   boolean fieldBool_o;
   final GuiPanelSettings guiPanelSettings_p;
   private static final String[] CONST_R;
   private static final String[] CONST_S;
   private static final Map CONST_T = new HashMap(13);

   RenderUtil28(GuiPanelSettings var1, String var2, String var3, long var4) {
      long var6 = 83681717069876L;
      this.guiPanelSettings_p = var1;
      super();
      this.dataBuilder15_m = new rip.breeze.client.AnimationTimer(200.0F, true, EnumType3.LINEAR);
      this.breezeUtil110_n = new ImageUtil2(new LicenseState(), "close", this::update, false);
      this.fieldBool_o = false;
      this.string_h = RenderUtil18_x.GLOW + var2;
      this.string_i = var3;
      this.fieldLong_l = System.currentTimeMillis() + var4;
      this.fieldFloat_j = Math.max(
         100.0F,
         Math.max(
            BreezeContext.iRenderer_b.measureTextHeight(var3, EnumType32.SOURCE_SANS_BOLD, 18.0F),
            BreezeContext.iRenderer_b.measureTextHeight(var2, EnumType32.SOURCE_SANS, 22.0F)
         )
      );
      this.fieldFloat_k = BreezeContext.iRenderer_b.measureTextSimple(var3, 18.0F);
      this.c = this.fieldFloat_j + 40.0F;
      this.d = this.fieldFloat_k + 47.0F;
   }

   void update() {
      long var1 = 82171831738259L;
      long var3 = var1 ^ 77938972006052L;
      this.fieldBool_o = true;
      this.dataBuilder15_m.toggle(var3, false);
   }

   public boolean checkCondition() {
      long var1 = 62724180036146L;
      long var3 = var1 ^ 58628821385989L;
      long var5 = var1 ^ 12996780855245L;
      if (System.currentTimeMillis() > this.fieldLong_l || this.fieldBool_o) {
         this.dataBuilder15_m.toggle(var3, false);
      }

      return !this.dataBuilder15_m.isBool_e() && this.dataBuilder15_m.getDouble(var5) == 0.0;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 46241641281725L;
      if (this.dataBuilder15_m.getDouble(var6) != 0.0) {
         float var8 = -1.0F;
         if (this.dataBuilder15_m.getDouble(var6) != 1.0) {
            var8 = BreezeContext.iRenderer_b.getGlobalAlpha();
            BreezeContext.iRenderer_b.setGlobalAlpha((float)this.dataBuilder15_m.getDouble(var6));
         }

         float var9 = MathUtil1.clamp(BreezeContext.authSession_c.getFloat("toast.corner-radius"), 4.0F, 10.0F);
         BreezeContext.iRenderer_b
            .strokeRoundedRect(this, var9, BreezeContext.authSession_c.getColor("toast.background").brighter());
         BreezeContext.iRenderer_b
            .fillGradientRectSimple(
               this.a,
               this.b,
               var9,
               this.d,
               new float[]{var9, 0.0F, 0.0F, var9},
               BreezeContext.authSession_c.getColor("default.accent")
            );
         BreezeContext.iRenderer_b
            .drawTextCentered(
               this.string_h,
               this.a + 25.0F,
               this.b + 15.0F,
               BreezeContext.authSession_c.getColor("toast.title"),
               EnumType32.SOURCE_SANS_BOLD,
               22.0F
            );
         BreezeContext.iRenderer_b
            .drawTextCentered(
               this.string_i,
               this.a + 25.0F,
               this.b + 45.0F,
               BreezeContext.authSession_c.getColor("toast.message"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
         this.breezeUtil110_n.calculate(var1, var2, var3);
         if (var8 != -1.0F) {
            BreezeContext.iRenderer_b.setGlobalAlpha(var8);
         }
      }
   }

   public boolean checkCondition_2(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      if (this.breezeUtil110_n.a(var1, var2, var3, var4)) {
         var4 = true;
      }

      return var4;
   }

   public void calculate_2() {
      this.breezeUtil110_n.a(new LicenseState(this.a + this.c - 35.0F, this.b + 5.0F, 30.0F, 30.0F));
   }

   static {
      long var0 = 25049213155425L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "J\u0007N}I gqÙ¢\u000e\u008eIY`\u0016Tïîí\u001f\u008f O\u009c¸\u0094bª¤èd\u0010&pXÿ\u007f\u0005jB¶DÞ_Àí½\u0080(÷¤ýC\u0018\u0089oû;¬\u0096x\tÅæëÍªEp\u0086\u0005\u0014y\u0092\u0092\u008a%~WæF\nè!E½³\u000e' õ\u0004\u0011M\u0084\u0002L\u009eéÂ\u0088\u0007\u0019n½\u000eè]lO×^pî6ì\u008au{¿Ø+";
      int var7 = "J\u0007N}I gqÙ¢\u000e\u008eIY`\u0016Tïîí\u001f\u008f O\u009c¸\u0094bª¤èd\u0010&pXÿ\u007f\u0005jB¶DÞ_Àí½\u0080(÷¤ýC\u0018\u0089oû;¬\u0096x\tÅæëÍªEp\u0086\u0005\u0014y\u0092\u0092\u008a%~WæF\nè!E½³\u000e' õ\u0004\u0011M\u0084\u0002L\u009eéÂ\u0088\u0007\u0019n½\u000eè]lO×^pî6ì\u008au{¿Ø+"
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
                     CONST_R = var4;
                     CONST_S = new String[6];
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

                  var6 = "ð\u0016´\u009f\u0081\u0099Ë1\u0082\u008a6@\u0016Ö½#³Õ¤ëÖÕ\u009dõp\u0003³ö\u0006^\u000fó÷;\u0002\u0099Ýî.c ÌDA\u008dzô¼«<:¡Ù\u001f\u001a1cÆçB\u0090§5\u0094\u008c\u001c¶\u0094af\u000fr(";
                  var7 = "ð\u0016´\u009f\u0081\u0099Ë1\u0082\u008a6@\u0016Ö½#³Õ¤ëÖÕ\u009dõp\u0003³ö\u0006^\u000fó÷;\u0002\u0099Ýî.c ÌDA\u008dzô¼«<:¡Ù\u001f\u001a1cÆçB\u0090§5\u0094\u008c\u001c¶\u0094af\u000fr("
                     .length();
                  var8 = '(';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23796;
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
            throw new RuntimeException("rip/breeze/cU", var10);
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
         throw new RuntimeException("rip/breeze/cU" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
