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

class EntityUtil5 extends Util28 {
   private static final int CONST_J;
   private final RenderUtil23 dataBuilder32_k;
   private final rip.breeze.client.AnimationTimer dataBuilder15_l;
   private final rip.breeze.client.AnimationTimer dataBuilder15_m;
   RotationUtil1_x enum6Val_n;
   final PreTickEvent dataBuilder29_o;
   private static final String[] CONST_Q;
   private static final String[] CONST_R;
   private static final Map CONST_S = new HashMap(13);

   public EntityUtil5(PreTickEvent var1) {
      this.dataBuilder29_o = var1;
      this.dataBuilder32_k = new RenderUtil23(this);
      this.dataBuilder15_l = new rip.breeze.client.AnimationTimer(100.0F, true, EnumType3.LINEAR);
      this.dataBuilder15_m = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.BACK_OUT);
      this.enum6Val_n = RotationUtil1_x.POPULAR;
      this.c = 180.0F;
   }

   public void clamp(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 85972512685926L;
      long var10 = var4 ^ 46241641281725L;
      int[] var10000 = MathUtil8.decrypt();
      super.processNullable(var1, var2, var3);
      this.dataBuilder15_l.toggle(var6, this.a(var1, var2));
      int[] var12 = var10000;
      this.dataBuilder15_m.toggle(var6, RenderUtil23.getDataBuilder15_j(this.dataBuilder32_k).isBool_e());
      this.dataBuilder32_k.calculate();
      Color var13 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("tag.background"),
         BreezeContext.authSession_c.getColor("default.hovered"),
         (float)this.dataBuilder15_l.getDouble(var10)
      );
      var13 = RenderUtil1.clamp(
         var13, BreezeContext.authSession_c.getColor("tag.background-selected"), (float)this.dataBuilder15_m.calculateDouble(var8)
      );
      Color var14 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("tag.border"),
         BreezeContext.authSession_c.getColor("tag.border-hovered"),
         (float)this.dataBuilder15_l.calculateDouble(var8)
      );
      var14 = RenderUtil1.getColor_7(var14, (int)((1.0 - Math.max(0.0, this.dataBuilder15_m.calculateDouble(var8) * 2.0 - 1.0)) * 255.0));
      BreezeContext.iRenderer_b.strokeRoundedRect(this, BreezeContext.authSession_c.getFloat("tag.corner-radius"), var13);
      BreezeContext.iRenderer_b
         .fillRoundedRectTwoColor(
            this,
            BreezeContext.authSession_c.getFloat("tag.corner-radius"),
            BreezeContext.authSession_c.getFloat("tag.border-thickness"),
            var14
         );
      BreezeContext.iRenderer_b
         .drawText(
            this.enum6Val_n.getString_a(),
            this.a + 8.0F,
            this.b + 9.0F,
            BreezeContext.authSession_c.getColor("tag.text"),
            EnumType32.SOURCE_SANS,
            20.0F
         );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(
            this.a + this.c - 25.0F,
            this.b + 5.0F,
            20.0F,
            this.d - 10.0F,
            5.0F,
            BreezeContext.authSession_c.getColor("tag.background-selected")
         );
      BreezeContext.iRenderer_b
         .drawGlow(
            this.a + this.c - 15.0F,
            this.d(),
            BreezeContext.authSession_c.getColor("tag.text"),
            Math.max(1.0F, (float)this.dataBuilder15_m.getDouble(var10))
         );
      if (var12 != null) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   public void calculate() {
      super.processNullable_4();
      this.dataBuilder32_k.a(this.a, this.b + this.d + 8.0F, 180.0F, this.dataBuilder32_k.d);
   }

   @Override
   public boolean checkCondition(float var1, float var2, int var3, boolean var4) {
      long var5 = 76541114200629L;
      if (var4) {
         return false;
      } else if (this.a(var1, var2) && var3 == 0) {
         this.dataBuilder32_k.processAll();
         return true;
      } else {
         return false;
      }
   }

   public void initialize() {
      super.processNullable_3();
      this.dataBuilder32_k.update();
   }

   static {
      long var0 = 49024408522932L;
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
      String var6 = "k\u0080eñ×6µÑ\u000f¹Á\bkðß\u0006Lqø§#}{i/\"Mðg-åÀ(ýB\u008f\u0092ëÇ\u009aä\u0083\u009cmÆ@\u001fÄÑsëøN@°Êh*#\u001a\u0005¿b1\u009a\u000b*Ò.¿ø\u0082ú \u000bÎò¥\u009f~æGjà\u0010ÏN&\u0014n\u0004/\u0098\u0007åïÃxPZ\u001f\u0096\u009e\u0094þt(\u009aæ©Í\tÚ¤¥\u001fO©,\tK\u0091T¿àË²F\u009f¦ëK+\u009e¸6ý£(dó\u008d\u0090[±\u0093w0\fdö½zÃõ{gc9Yq¨\u001aò\u0000yRê\u0019¤Å\nàkb\u0098\u001bxßb37\u0006ÁT,\u0010é\u0098\u008e\u0012vÌôè®(Ah\u001c\u0012JúdØNl²cM\u0011@¾\u001f®\u0003\u0000ôìå\u0002ÿl½m]Tº\u009aÖ8áöç#\u0099¶(\u009d\u0086´K\u0019%j¥Q6²b\u009fÙ\u0080\b¨ß¸ð\u009d\u008e\u0014\u00ad3\u000e\u0097É\u0094êD¨\u0083£b\u00adêü¹ç \u0086\u0091\u008b\u009dªßa\u0003«¼·éWH^;%Ñ´ÿWÍ\u0084\u0081\u0087Zq\u0090Û!\u0018£\u00189\u001bk\u0081c\u007f{\u0099\u009f\u0094ðé\u0005Ê|òcS)w©\u0018o\u0092";
      int var7 = "k\u0080eñ×6µÑ\u000f¹Á\bkðß\u0006Lqø§#}{i/\"Mðg-åÀ(ýB\u008f\u0092ëÇ\u009aä\u0083\u009cmÆ@\u001fÄÑsëøN@°Êh*#\u001a\u0005¿b1\u009a\u000b*Ò.¿ø\u0082ú \u000bÎò¥\u009f~æGjà\u0010ÏN&\u0014n\u0004/\u0098\u0007åïÃxPZ\u001f\u0096\u009e\u0094þt(\u009aæ©Í\tÚ¤¥\u001fO©,\tK\u0091T¿àË²F\u009f¦ëK+\u009e¸6ý£(dó\u008d\u0090[±\u0093w0\fdö½zÃõ{gc9Yq¨\u001aò\u0000yRê\u0019¤Å\nàkb\u0098\u001bxßb37\u0006ÁT,\u0010é\u0098\u008e\u0012vÌôè®(Ah\u001c\u0012JúdØNl²cM\u0011@¾\u001f®\u0003\u0000ôìå\u0002ÿl½m]Tº\u009aÖ8áöç#\u0099¶(\u009d\u0086´K\u0019%j¥Q6²b\u009fÙ\u0080\b¨ß¸ð\u009d\u008e\u0014\u00ad3\u000e\u0097É\u0094êD¨\u0083£b\u00adêü¹ç \u0086\u0091\u008b\u009dªßa\u0003«¼·éWH^;%Ñ´ÿWÍ\u0084\u0081\u0087Zq\u0090Û!\u0018£\u00189\u001bk\u0081c\u007f{\u0099\u009f\u0094ðé\u0005Ê|òcS)w©\u0018o\u0092"
         .length();
      char var8 = ' ';
      int var19 = -1;

      label37:
      while (true) {
         String var20 = var6.substring(++var19, var19 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var20.getBytes("ISO-8859-1"));
            String var28 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var28;
                  if ((var19 += var8) >= var7) {
                     CONST_Q = var4;
                     CONST_R = new String[11];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var15 = 197048272968495654L;
                     byte[] var17 = var11.doFinal(
                        new byte[]{
                           (byte)(var15 >>> 56),
                           (byte)(var15 >>> 48),
                           (byte)(var15 >>> 40),
                           (byte)(var15 >>> 32),
                           (byte)(var15 >>> 24),
                           (byte)(var15 >>> 16),
                           (byte)(var15 >>> 8),
                           (byte)var15
                        }
                     );
                     long var32 = (var17[0] & 255L) << 56
                        | (var17[1] & 255L) << 48
                        | (var17[2] & 255L) << 40
                        | (var17[3] & 255L) << 32
                        | (var17[4] & 255L) << 24
                        | (var17[5] & 255L) << 16
                        | (var17[6] & 255L) << 8
                        | var17[7] & 255L;
                     var10001 = -1;
                     long var13 = var32;
                     CONST_J = (int)var13;
                     return;
                  }

                  var8 = var6.charAt(var19);
                  break;
               default:
                  var4[var5++] = var28;
                  if ((var19 += var8) < var7) {
                     var8 = var6.charAt(var19);
                     continue label37;
                  }

                  var6 = "n\u001a\u0002º¦qã*Ax<¦¼\u0097ÝO\u009f7¨\u001c\n\u00adö¨\u001cq Ê\u0082\u0004æó(^Ø¸ ÆÖ\u0018\u0005ä;ÜsêÔ§\u008f\u0091\u008b·\u0000~CÃËÌ\u001bºÄ\u009a\u0088j\u009a§\u0007îv³\u0014ÛM";
                  var7 = "n\u001a\u0002º¦qã*Ax<¦¼\u0097ÝO\u009f7¨\u001c\n\u00adö¨\u001cq Ê\u0082\u0004æó(^Ø¸ ÆÖ\u0018\u0005ä;ÜsêÔ§\u008f\u0091\u008b·\u0000~CÃËÌ\u001bºÄ\u009a\u0088j\u009a§\u0007îv³\u0014ÛM"
                     .length();
                  var8 = ' ';
                  var19 = -1;
            }

            var20 = var6.substring(++var19, var19 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26194;
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
            throw new RuntimeException("rip/breeze/c4", var10);
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
         CONST_R[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_R[var3];
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
         throw new RuntimeException("rip/breeze/c4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
