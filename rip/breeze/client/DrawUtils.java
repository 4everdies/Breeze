package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import rip.breeze.StringDecryptor;

public class DrawUtils {
   public static FontManager fontManager_a;
   public static FontManager fontManager_b;
   public static Framebuffer framebuffer_c;
   private static int fieldInt_d;
   private static final List<Framebuffer> CONST_E;
   private static final String[] CONST_G;
   private static final String[] CONST_H;
   private static final Map CONST_I = new HashMap(13);

   public static void processAll(float var0) {
      long var1 = 68882521561722L;
      fontManager_a.drawString("offset", var0, var0);
      fontManager_b.drawString("offset", var0, var0);
   }

   private static void processAll(float var0) {
      for (Framebuffer var2 : CONST_E) {
         var2.deleteFramebuffer();
      }

      CONST_E.clear();
      CONST_E.add(getFramebuffer(framebuffer_c));

      for (int var3 = 1; var3 <= var0; var3++) {
         Framebuffer var4 = new Framebuffer(BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight, false);
         CONST_E.add(getFramebuffer(var4));
      }
   }

   public static void calculate(int var0, int var1) {
      long var2 = 85584584822788L;
      int[] var4 = FontManager.values();
      if (fieldInt_d != var0) {
         processAll(var0);
         fieldInt_d = var0;
      }

      calculate_2(CONST_E.get(1), BreezeClient.CONST_A.getFramebuffer().framebufferTexture, fontManager_a, var1);

      for (int var5 = 1; var5 < var0; var5++) {
         calculate_2(CONST_E.get(var5 + 1), CONST_E.get(var5).framebufferTexture, fontManager_a, var1);
      }

      for (int var6 = var0; var6 > 1; var6--) {
         calculate_2(CONST_E.get(var6 - 1), CONST_E.get(var6).framebufferTexture, fontManager_b, var1);
      }

      FontManager.render(var4);
      CONST_E.get(1).bindFramebufferTexture();
      fontManager_b.initialize();
      fontManager_b.drawString(
         "offset",
         var1 * (0.5F / BreezeClient.CONST_A.displayWidth),
         var1 * (0.5F / BreezeClient.CONST_A.displayHeight)
      );
      fontManager_b.drawString("inTexture", 0);
      FontManager.calculate();
      fontManager_b.bind();
   }

   private static void calculate_2(Framebuffer var0, int var1, FontManager var2, float var3) {
      long var4 = 139418956415155L;
      var0.framebufferClear();
      var0.bindFramebuffer(true);
      var2.initialize();
      GlStateManager.bindTexture(var1);
      var2.drawString(
         "offset",
         var3 * (0.5F / BreezeClient.CONST_A.displayWidth),
         var3 * (0.5F / BreezeClient.CONST_A.displayHeight)
      );
      var2.drawString("inTexture", 0);
      FontManager.calculate();
      var2.bind();
      var0.unbindFramebuffer();
   }

   private static Framebuffer getFramebuffer(Framebuffer var0) {
      if (var0 != null && var0.framebufferWidth == BreezeClient.CONST_A.displayWidth && var0.framebufferHeight == BreezeClient.CONST_A.displayHeight) {
         return var0;
      }

      if (var0 != null) {
         var0.deleteFramebuffer();
      }

      return new Framebuffer(BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight, true);
   }

   static {
      long var0 = 96420198963197L;
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
      String var6 = "\u0092\u0099ÝÔ\nI\u0003\u008ay2\u0083°_\u0090¸¨\u00108Æ5\u009a«\u001e®\u0081³^\u0015Lv\u0086|¬\u0018Vyv\u000eÙù\u008båE#5û4i\u0097\u008f\f]¢\u009a¬²¬:(q\u0083ñYäjÄe\u009eihÙbYX¯´ í\u0015-\u0080\u0080\u009eVné}\f/>\u001ct\u0003\u008d\u00992\u000b!Ç";
      int var7 = "\u0092\u0099ÝÔ\nI\u0003\u008ay2\u0083°_\u0090¸¨\u00108Æ5\u009a«\u001e®\u0081³^\u0015Lv\u0086|¬\u0018Vyv\u000eÙù\u008båE#5û4i\u0097\u008f\f]¢\u009a¬²¬:(q\u0083ñYäjÄe\u009eihÙbYX¯´ í\u0015-\u0080\u0080\u009eVné}\f/>\u001ct\u0003\u008d\u00992\u000b!Ç"
         .length();
      char var8 = 16;
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
                     CONST_G = var4;
                     CONST_H = new String[6];
                     fontManager_a = new FontManager("kawase/kawase.frag");
                     fontManager_b = new FontManager("kawase/kawase2.frag");
                     framebuffer_c = new Framebuffer(1, 1, false);
                     CONST_E = new ArrayList<>();
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

                  var6 = "@¡rÊ3$>hç\u0081ò¼8×\b\u0014\u0081/\u0006Å®\u0080í\u0080gÂÆ\f\u0097\u0098\u009b\u0097(ù\u009fÌ(ñ*ò®ºcªÄ*µ5´pÍ¶µë¼y\u0090É¿[¹ýå=\u0096\u0084{Ø\u0094ì}\u000fæ";
                  var7 = "@¡rÊ3$>hç\u0081ò¼8×\b\u0014\u0081/\u0006Å®\u0080í\u0080gÂÆ\f\u0097\u0098\u009b\u0097(ù\u009fÌ(ñ*ò®ºcªÄ*µ5´pÍ¶µë¼y\u0090É¿[¹ýå=\u0096\u0084{Ø\u0094ì}\u000fæ"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26792;
      if (CONST_H[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_I.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_I.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/fG", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_G[var3].getBytes("ISO-8859-1");
         CONST_H[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_H[var3];
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
         throw new RuntimeException("rip/breeze/client/fG" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
