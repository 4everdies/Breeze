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

final class ImageUtil24<T> extends UIPanel {
   boolean fieldBool_h;
   final T object_i;
   final String string_j;
   final rip.breeze.client.AnimationTimer dataBuilder15_k = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private static final String[] CONST_M;
   private static final String[] CONST_N;
   private static final Map CONST_O = new HashMap(13);

   ImageUtil24(String var1, T var2) {
      super(0.0F, 0.0F, 0.0F, 0.0F);
      this.string_j = var1;
      this.object_i = (T)var2;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      this.dataBuilder15_k.toggle(var6, this.a(var1, var2));
      RenderUtil37.getString();
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this,
            BreezeContext.authSession_c.getFloat("drawer.corner-radius"),
            RenderUtil1.getColor_7(
               BreezeContext.authSession_c.getColor("default.hovered"),
               (int)(
                  BreezeContext.authSession_c.getColor("default.hovered").getAlpha() * this.dataBuilder15_k.getDouble(var8)
               )
            )
         );
      BreezeContext.iRenderer_b
         .drawText(
            this.string_j,
            this.a + 34.0F,
            this.b + 5.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               BreezeContext.authSession_c.getColor("default.text-primary"),
               (float)this.dataBuilder15_k.getDouble(var8)
            ),
            EnumType32.SOURCE_SANS,
            22.0F
         );
      float var11 = 6.0F;
      float var12 = this.a + 14.0F;
      float var13 = this.b + 15.0F;
      Color var14 = this.fieldBool_h
         ? BreezeContext.authSession_c.getColor("default.accent")
         : BreezeContext.authSession_c.getColor("drawer.border");
      BreezeContext.iRenderer_b.strokeCircle(var12, var13, var11 + 2.0F, 2.0F, var14);
      if (this.fieldBool_h) {
         BreezeContext.iRenderer_b.fillCircle(var12, var13, var11, BreezeContext.authSession_c.getColor("default.accent"));
      }

      if (!LicenseState.isValid_2()) {
         RenderUtil37.initialize("fnpBO");
      }
   }

   static {
      long var0 = 69272221843061L;
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
      String var6 = "/p\u008aô±Å²i\u0093ÓªM½m\u001aKH\u001f¾Aó UÚ\u0017a6Ý\u0018z¿\u0099 ùu-\u0084)¨ò-âFMÆÙ\u009dÁ\u00adÿl8U\u0013`<(½[\u008a\f·G{M ë\\\u008a03\u0092õmK\rÉ\u00ad\u0098Ì®¦\u0089\u0013wvLFß½\u0001õò4\u0013N\rÊ(Ô\u001c]@ÀK»¶\u0019\u001c\u009e\rÒ¢\u0086\u0004\u0099È,û+:¸®P\n\u007fÅK8e\u0083\u000b:Íô,F±Û\u0018U\u0005~¶Í¤\u0094\nh\u009cç80Uk\u001aª\u0015´\u0090Ý\u0095\u009d/(\u0001p Ù\u0080}S:\u0090\u0011¯Ñîn`&£\rX4ËL{ù>ç\u0088êQÙ\u0014óq\u001bU\u0014x\u0087Á4";
      int var7 = "/p\u008aô±Å²i\u0093ÓªM½m\u001aKH\u001f¾Aó UÚ\u0017a6Ý\u0018z¿\u0099 ùu-\u0084)¨ò-âFMÆÙ\u009dÁ\u00adÿl8U\u0013`<(½[\u008a\f·G{M ë\\\u008a03\u0092õmK\rÉ\u00ad\u0098Ì®¦\u0089\u0013wvLFß½\u0001õò4\u0013N\rÊ(Ô\u001c]@ÀK»¶\u0019\u001c\u009e\rÒ¢\u0086\u0004\u0099È,û+:¸®P\n\u007fÅK8e\u0083\u000b:Íô,F±Û\u0018U\u0005~¶Í¤\u0094\nh\u009cç80Uk\u001aª\u0015´\u0090Ý\u0095\u009d/(\u0001p Ù\u0080}S:\u0090\u0011¯Ñîn`&£\rX4ËL{ù>ç\u0088êQÙ\u0014óq\u001bU\u0014x\u0087Á4"
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
                     CONST_M = var4;
                     CONST_N = new String[8];
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

                  var6 = "&Ê@U$×\u000b#¾¢\u0081ç\u00adv\u0006±\u0083nú\u009d\rzÍ\u0007\u0018\u0092\u0091C%\u007f!Ó(D´\u0082¥.¸7\u008f#àCì´[M õÅì~wµ=·H~ð¬ÁÍËªÜ^l%6õ,\b";
                  var7 = "&Ê@U$×\u000b#¾¢\u0081ç\u00adv\u0006±\u0083nú\u009d\rzÍ\u0007\u0018\u0092\u0091C%\u007f!Ó(D´\u0082¥.¸7\u008f#àCì´[M õÅì~wµ=·H~ð¬ÁÍËªÜ^l%6õ,\b"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12906;
      if (CONST_N[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_O.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_O.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/d6", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_M[var3].getBytes("ISO-8859-1");
         CONST_N[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_N[var3];
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
         throw new RuntimeException("rip/breeze/d6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
