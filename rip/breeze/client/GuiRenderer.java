package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import rip.breeze.StringDecryptor;

public class GuiRenderer {
   private static final int CONST_A;
   private Framebuffer framebuffer_b;
   private FramebufferHelper framebufferHelper_c;
   private final FontManager fontManager_d;
   private static final String[] CONST_F;
   private static final String[] CONST_G;
   private static final Map CONST_H = new HashMap(13);
   private static final long[] CONST_I;
   private static final Integer[] CONST_J;
   private static final Map CONST_K;

   public GuiRenderer() {
      long var1 = 19771075623157L;
      super();
      this.framebuffer_b = new Framebuffer(BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight, true);
      this.framebufferHelper_c = new FramebufferHelper(0);
      short var10003 = 15248;
      long var10004 = 1514262742443015430L ^ var1;
      this.fontManager_d = new FontManager("glow.frag");
   }

   public void calculate(int var1, int var2, Framebuffer var3, Color var4) {
      long var5 = 125049678012426L;
      if (var3 != null) {
         int[] var7 = FontManager.values();
         this.update();
         this.framebuffer_b.bindFramebuffer(true);
         GlStateManager.clearColor(0.0F, 0.0F, 0.0F, 0.0F);
         GL11.glClear(16640);
         this.fontManager_d.initialize();
         this.fontManager_d.drawString("u_diffuse_sampler", 0);
         this.fontManager_d.drawString("u_other_sampler", 15);
         this.fontManager_d.drawString("alpha", 0.003921569F * var2);
         if (var4 == null) {
            this.fontManager_d.drawString("colored", 0);
         } else {
            this.fontManager_d.drawString("colored", 1);
            this.fontManager_d
               .drawString(
                  "color",
                  0.003921569F * var4.getRed(),
                  0.003921569F * var4.getGreen(),
                  0.003921569F * var4.getBlue()
               );
         }

         if (this.framebufferHelper_c.getInt_a() != var1) {
            this.framebufferHelper_c = new FramebufferHelper(var1);
            this.framebufferHelper_c.absValue();
            FloatBuffer var8 = BufferUtils.createFloatBuffer(var1);
            var8.put(this.framebufferHelper_c.getArr_b());
            ((Buffer)var8).flip();
            this.fontManager_d.drawString("u_radius", var1);
            this.fontManager_d.drawString("u_kernel", var8);
         }

         this.fontManager_d
            .drawString(
               "u_texel_size", 1.0F / BreezeClient.CONST_A.displayWidth, 1.0F / BreezeClient.CONST_A.displayHeight
            );
         GlStateManager.disableDepth();
         GlStateManager.depthMask(false);
         GlStateManager.enableBlend();
         GlStateManager.blendFunc(1, 770);
         GlStateManager.enableAlpha();
         GlStateManager.alphaFunc(516, 0.0F);
         this.fontManager_d.drawString("u_direction", 1.0F, 0.0F);
         this.fontManager_d.calculate_2(var3);
         FontManager.render(var7);
         GlStateManager.blendFunc(770, 771);
         this.fontManager_d.drawString("u_direction", 0.0F, 1.0F);
         this.calculate_2(15, var3.framebufferTexture);
         this.fontManager_d.calculate_2(this.framebuffer_b);
         this.calculate_2(15, 0);
         this.fontManager_d.bind();
         GlStateManager.alphaFunc(516, 0.1F);
         GlStateManager.depthMask(true);
         GlStateManager.enableDepth();
         GlStateManager.disableBlend();
      }
   }

   private void calculate_2(int var1, int var2) {
      long var3 = 27901162093728L;
      GL13.glActiveTexture(33984 + var1);
      GL11.glBindTexture(3553, var2);
      GL13.glActiveTexture(-9780437);
   }

   public void update() {
      if (BreezeClient.CONST_A.displayWidth != this.framebuffer_b.framebufferWidth
         || BreezeClient.CONST_A.displayHeight != this.framebuffer_b.framebufferHeight) {
         this.framebuffer_b.deleteFramebuffer();
         this.framebuffer_b = new Framebuffer(BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight, true);
      }

      this.framebuffer_b.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public void initialize() {
      this.framebuffer_b.deleteFramebuffer();
   }

   static {
      long var0 = 9454262018244L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[12];
      int var5 = 0;
      String var6 = "\n\u008e\u0001\u0019\u0083è\u0081ÒHå\u0098¡8\u008eL\ræ\u0084ô\u0088ð>\u0082\u0096g±Ð\u0083àÚËê óÒ\nÖª\\jÕ\br\u008dûz¹=\u008e)»Ûuca\u001fQu&W\u008aR\u00ad\u0093A \u009e\u0090®p\u008f\u0018\u001271\u0084äÒ½bè>K4ßåÝ¯o\u001dÕÊ\u009d*ö~Äª\u0018á2á\u0090\u0019Îdr0öÊÃO¼¤\u0002QÕç \u0005\f?\" ³Ç5c[¶\u0010\u0019\u000eüÝ¡\u0088Dí\u0092ÓöP<ß8PY2¢ÏÃ\u0017\u0087\u008f0\u0018.\u008dÚ\u008c7\u0092\u008cÄ µ6\u009c+!<ò\u0092ÚKì#R\u0088ÿ \u0004;/òd:Üç\u00944\u0000\u0002\u000fb\u001eü\u008d[ü\u001cºçSÏ\u0081É<åV\tÓò\u0010¼/\u001c\u001f,\u000eÌ\u008d}QÛáÌ\b1F(2\u001c @VýPY»sáú\\\u0016\u007f®õdgyÕ\b£Y¹è¬õ\u0088î\u0005\u0094+¿`OÕz\u009b¦\u00108å\u0086\u00868«%Ä<\u009bJ\u00adî5á+";
      int var7 = "\n\u008e\u0001\u0019\u0083è\u0081ÒHå\u0098¡8\u008eL\ræ\u0084ô\u0088ð>\u0082\u0096g±Ð\u0083àÚËê óÒ\nÖª\\jÕ\br\u008dûz¹=\u008e)»Ûuca\u001fQu&W\u008aR\u00ad\u0093A \u009e\u0090®p\u008f\u0018\u001271\u0084äÒ½bè>K4ßåÝ¯o\u001dÕÊ\u009d*ö~Äª\u0018á2á\u0090\u0019Îdr0öÊÃO¼¤\u0002QÕç \u0005\f?\" ³Ç5c[¶\u0010\u0019\u000eüÝ¡\u0088Dí\u0092ÓöP<ß8PY2¢ÏÃ\u0017\u0087\u008f0\u0018.\u008dÚ\u008c7\u0092\u008cÄ µ6\u009c+!<ò\u0092ÚKì#R\u0088ÿ \u0004;/òd:Üç\u00944\u0000\u0002\u000fb\u001eü\u008d[ü\u001cºçSÏ\u0081É<åV\tÓò\u0010¼/\u001c\u001f,\u000eÌ\u008d}QÛáÌ\b1F(2\u001c @VýPY»sáú\\\u0016\u007f®õdgyÕ\b£Y¹è¬õ\u0088î\u0005\u0094+¿`OÕz\u009b¦\u00108å\u0086\u00868«%Ä<\u009bJ\u00adî5á+"
         .length();
      char var8 = ' ';
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var33;
                  if ((var23 += var8) >= var7) {
                     CONST_F = var4;
                     CONST_G = new String[12];
                     CONST_K = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[3];
                     int var14 = 0;
                     String var15 = "ÝU\u0005_àìÙ\u0089Ñ0\u0015Ò[°+!SQ\u0096ä}#\u0019Q";
                     int var16 = "ÝU\u0005_àìÙ\u0089Ñ0\u0015Ò[°+!SQ\u0096ä}#\u0019Q".length();
                     byte var17 = 0;

                     do {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        var10001 = var14++;
                        long var19 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte[] var21 = var11.doFinal(
                           new byte[]{
                              (byte)(var19 >>> 56),
                              (byte)(var19 >>> 48),
                              (byte)(var19 >>> 40),
                              (byte)(var19 >>> 32),
                              (byte)(var19 >>> 24),
                              (byte)(var19 >>> 16),
                              (byte)(var19 >>> 8),
                              (byte)var19
                           }
                        );
                        long var10004 = (var21[0] & 255L) << 56
                           | (var21[1] & 255L) << 48
                           | (var21[2] & 255L) << 40
                           | (var21[3] & 255L) << 32
                           | (var21[4] & 255L) << 24
                           | (var21[5] & 255L) << 16
                           | (var21[6] & 255L) << 8
                           | var21[7] & 255L;
                        byte var38 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_I = var13;
                     CONST_J = new Integer[3];
                     CONST_A = ((String)null);
                     return;
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var33;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label45;
                  }

                  var6 = "¸\u0016çúwZC\u0006ê»»o¯\u0000÷\u0012\u0010²m\u008a`\u0010b\u009bÛ\u0004A£\u007f[f@B";
                  var7 = "¸\u0016çúwZC\u0006ê»»o¯\u0000÷\u0012\u0010²m\u008a`\u0010b\u009bÛ\u0004A£\u007f[f@B".length();
                  var8 = 16;
                  var23 = -1;
            }

            var24 = var6.substring(++var23, var23 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32357;
      if (CONST_G[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_H.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_H.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/fM", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_F[var3].getBytes("ISO-8859-1");
         CONST_G[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_G[var3];
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
         throw new RuntimeException("rip/breeze/client/fM" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2414;
      if (CONST_J[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_I[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_K.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_K.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/fM", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_J[var3] = var15;
      }

      return CONST_J[var3];
   }

   private static int getValue(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = decrypt(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getValue".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/fM" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
