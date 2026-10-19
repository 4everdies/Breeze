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
import org.mozilla.javascript.Context;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.BreezeClient;

@ScriptNamespace(name = "hudRenderer", description = "Can be used for drawing hud elements.")
public class RenderUtil6 {
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   @JSFunction(
      value = "stringWidth",
      description = "Returns the pixel width of a string using the current HUD font.",
      params = "The string to measure.",
      returns = "The width of the string in pixels."
   )
   public static int getValue(String var0) {
      return BreezeClient.getModuleManager().dataBuilder46_j.clamp_8(var0);
   }

   @JSFunction(
      value = "drawString",
      description = "Draws a string at the given position using the current HUD font.",
      params = {"The x position.", "The y position.", "The string to draw.", "The color of the text."}
   )
   public static void update(float var0, float var1, String var2, RenderUtil4_x var3) {
      BreezeClient.getModuleManager().dataBuilder46_j.update(var0, var1, var2, (Color)var3.b());
   }

   @JSFunction(
      value = "drawString",
      description = "Draws a string at the given position using the current HUD font, with optional shadow.",
      params = {"The x position.", "The y position.", "The string to draw.", "The color of the text.", "Whether to draw a drop shadow."}
   )
   public static void update_1(float var0, float var1, String var2, RenderUtil4_x var3, boolean var4) {
      BreezeClient.getModuleManager().dataBuilder46_j.calculate(var0, var1, var2, (Color)var3.b(), var4);
   }

   @JSFunction(
      value = "drawRect",
      description = "Draws a rounded rectangle with a uniform corner radius and a solid color.",
      params = {"The x position.", "The y position.", "The width.", "The height.", "The corner radius.", "The fill color."}
   )
   public static void processAll(float var0, float var1, float var2, float var3, float var4, RenderUtil4_x var5) {
      rip.breeze.client.RenderUtil28.render(var0, var1, var2, var3, var4, (Color)var5.b());
   }

   @JSFunction(
      value = "drawRect",
      description = "Draws a rounded rectangle with per-corner radii (TL, TR, BR, BL) and a solid color.",
      params = {
            "The x position.",
            "The y position.",
            "The width.",
            "The height.",
            "Top-left radius.",
            "Top-right radius.",
            "Bottom-right radius.",
            "Bottom-left radius.",
            "The fill color."
      }
   )
   public static void processAll_1(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, RenderUtil4_x var8) {
      rip.breeze.client.RenderUtil28.render_1(var0, var1, var2, var3, var4, var5, var6, var7, (Color)var8.b());
   }

   @JSFunction(
      value = "drawRectGradient",
      description = "Draws a rounded rectangle filled with a two-color gradient.",
      params = {
            "The x position.",
            "The y position.",
            "The width.",
            "The height.",
            "The corner radius.",
            "color1 - The start color.",
            "color2 - The end color.",
            "True for top-to-bottom, false for left-to-right."
      }
   )
   public static void update_2(float var0, float var1, float var2, float var3, float var4, RenderUtil4_x var5, RenderUtil4_x var6, boolean var7) {
      rip.breeze.client.RenderUtil28.calculate(var0, var1, var2, var3, var4, (Color)var5.b(), (Color)var6.b(), var7);
   }

   @JSFunction(
      value = "drawRectGlow",
      description = "Draws a rounded rectangle with a solid color and an outer glow.",
      params = {
            "The x position.",
            "The y position.",
            "The width.",
            "The height.",
            "The corner radius.",
            "The fill color.",
            "The glow falloff radius in pixels.",
            "The glow color (alpha controls maximum intensity)."
      }
   )
   public static void update_3(float var0, float var1, float var2, float var3, float var4, RenderUtil4_x var5, float var6, RenderUtil4_x var7) {
      rip.breeze.client.RenderUtil28.calculate_3(var0, var1, var2, var3, var4, (Color)var5.b(), var6, (Color)var7.b());
   }

   @JSFunction(
      value = "drawRectWithEffect",
      description = "Draws a rounded rectangle colored with the current HUD effect (rainbow/gradient/pulse). Falls back to the user's static color when the effect is NONE.",
      params = {"The x position.", "The y position.", "The width.", "The height.", "The corner radius.", "The opacity (0.0–1.0)."}
   )
   public static void update_4(float var0, float var1, float var2, float var3, float var4, float var5) {
      rip.breeze.client.RenderUtil28.render_2(var0, var1, var2, var3, var4, var5);
   }

   @JSFunction(
      value = "drawItemStack",
      description = "Draws an item stack scaled to the given size, with count and durability overlay.",
      params = {"The item stack to draw.", "The x position.", "The y position.", "The size in pixels (native item size is 16)."}
   )
   public static void update_5(ItemStack var0, float var1, float var2, float var3) {
      rip.breeze.client.RenderUtil28.render_6((net.minecraft.item.ItemStack)var0.b(), var1, var2, var3);
   }

   @JSFunction(
      value = "drawItemStack",
      description = "Draws an item stack scaled to the given size, with optional count and durability overlay.",
      params = {
            "The item stack to draw.",
            "The x position.",
            "The y position.",
            "The size in pixels (native item size is 16).",
            "Whether to draw the stack count and durability bar."
      }
   )
   public static void update_6(ItemStack var0, float var1, float var2, float var3, boolean var4) {
      rip.breeze.client.RenderUtil28.calculate_12((net.minecraft.item.ItemStack)var0.b(), var1, var2, var3, var4);
   }

   @JSFunction(
      value = "drawCircle",
      description = "Draws a filled circle.",
      params = {"The center x position.", "The center y position.", "The radius.", "The fill color."}
   )
   public static void update_7(float var0, float var1, float var2, RenderUtil4_x var3) {
      rip.breeze.client.RenderUtil28.calculate_4(var0, var1, var2, (Color)var3.b());
   }

   @JSFunction(
      value = "drawRing",
      description = "Draws a ring (hollow circle).",
      params = {"The center x position.", "The center y position.", "The outer radius.", "The ring thickness in pixels.", "The fill color."}
   )
   public static void processAll_2(float var0, float var1, float var2, float var3, RenderUtil4_x var4) {
      rip.breeze.client.RenderUtil28.calculate_5(var0, var1, var2, var3, (Color)var4.b());
   }

   @JSFunction(
      value = "drawCircleWithEffect",
      description = "Draws a filled circle colored with the current HUD effect (rainbow/gradient/pulse).",
      params = {"The center x position.", "The center y position.", "The radius.", "The opacity (0.0–1.0)."}
   )
   public static void processAll_3(float var0, float var1, float var2, float var3) {
      rip.breeze.client.RenderUtil28.calculate_6(var0, var1, var2, var3);
   }

   @JSFunction(
      value = "drawTexture",
      description = "Draws an image from an http/https URL with a flat colour tint. The download happens asynchronously; the call is silently skipped until the image is ready. Results are cached after the first successful load.",
      params = {
            "An http/https image URL.",
            "The x position.",
            "The y position.",
            "The width.",
            "The height.",
            "The tint color (use Color(255,255,255,255) for no tint)."
      }
   )
   public static void processAll_4(String var0, float var1, float var2, float var3, float var4, RenderUtil4_x var5) {
      long var6 = 45847414300657L;
      if (checkCondition(var0, "drawTexture")) {
         rip.breeze.client.RenderUtil28.processNullable_2(var0, var1, var2, var3, var4, (Color)var5.b());
      }
   }

   @JSFunction(
      value = "drawTextureGradient",
      description = "Draws an image from an http/https URL with a two-color gradient overlay blended on top of the texture RGB.",
      params = {
            "An http/https image URL.",
            "The x position.",
            "The y position.",
            "The width.",
            "The height.",
            "The start color.",
            "The end color.",
            "True for top-to-bottom, false for left-to-right."
      }
   )
   public static void update_8(String var0, float var1, float var2, float var3, float var4, RenderUtil4_x var5, RenderUtil4_x var6, boolean var7) {
      long var8 = 59277131581018L;
      if (checkCondition(var0, "drawTextureGradient")) {
         rip.breeze.client.RenderUtil28.processNullable_3(var0, var1, var2, var3, var4, (Color)var5.b(), (Color)var6.b(), var7);
      }
   }

   @JSFunction(
      value = "drawSVG",
      description = "Draws an SVG from an http/https URL, rasterised at the given scale (1.0 = native SVG size in pixels). The download happens asynchronously; the call is silently skipped until ready. Cached per (url, scale) so each distinct scale is sharp.",
      params = {"An http/https SVG URL.", "The x position.", "The y position.", "The rasterization scale.", "The flat tint color."}
   )
   public static void update_9(String var0, float var1, float var2, float var3, RenderUtil4_x var4) {
      long var5 = 84089757041764L;
      if (checkCondition(var0, "drawSVG")) {
         rip.breeze.client.RenderUtil28.processNullable_4(var0, var1, var2, var3, (Color)var4.b());
      }
   }

   @JSFunction(
      value = "drawSVG",
      description = "Draws an SVG from an http/https URL with a soft glow behind it.",
      params = {
            "An http/https SVG URL.",
            "The x position.",
            "The y position.",
            "The rasterization scale.",
            "The flat tint color.",
            "The glow blur radius in pixels."
      }
   )
   public static void update_10(String var0, float var1, float var2, float var3, RenderUtil4_x var4, int var5) {
      long var6 = 86001285832178L;
      if (checkCondition(var0, "drawSVG")) {
         rip.breeze.client.RenderUtil28.processNullable_5(var0, var1, var2, var3, (Color)var4.b(), var5);
      }
   }

   @JSFunction(
      value = "drawSVGWithEffect",
      description = "Draws an SVG from an http/https URL colored with the current HUD effect (rainbow/gradient/pulse/none).",
      params = {"An http/https SVG URL.", "The x position.", "The y position.", "The rasterization scale.", "The opacity (0.0–1.0)."}
   )
   public static void update_11(String var0, float var1, float var2, float var3, float var4) {
      long var5 = 37600947608910L;
      if (checkCondition(var0, "drawSVGWithEffect")) {
         rip.breeze.client.RenderUtil28.processNullable_6(var0, var1, var2, var3, var4);
      }
   }

   @JSFunction(
      value = "drawSVGWithEffect",
      description = "Draws an SVG from an http/https URL with the current HUD effect and a soft glow behind it.",
      params = {
            "An http/https SVG URL.",
            "The x position.",
            "The y position.",
            "The rasterization scale.",
            "The opacity (0.0–1.0).",
            "The glow blur radius in pixels."
      }
   )
   public static void update_12(String var0, float var1, float var2, float var3, float var4, int var5) {
      long var6 = 5474743071617L;
      if (checkCondition(var0, "drawSVGWithEffect")) {
         rip.breeze.client.RenderUtil28.calculate_14(var0, var1, var2, var3, var4, var5);
      }
   }

   private static boolean checkCondition(String var0, String var1) {
      long var2 = 130613091326825L;
      if (var0 == null
         || !var0.startsWith("http://") && !var0.startsWith("https://")) {
         Context.reportError(var1 + ": only http/https URLs are accepted.");
         return false;
      } else {
         return true;
      }
   }

   static {
      long var0 = 24217784495986L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[9];
      int var5 = 0;
      String var6 = "6²#!\u0003\u0085#K²'\u000e\f\u0086\u00906¥÷\u0099½oµ.\u009f¶Ýe\u000eUÅ\u000e3Ø 7Qg9êZ\u00911\u001f\u000b\u001cx\u001fTPJ<×Aâ«\u0018o\u0086ð\\Ûª\u000fß\n.@#&Éþ\u001a¦\u000fC*rlvßf2:T@ÿ\u0094f\u0084Å£Ö\u0085\u001e0õ\\ñqæ¢ìîlòÍ\f0\u0006Á¸W/3\u0086ó/¼â\u0000k)\u0094ª\u009f\u0099¢Ë¥!\u00ad\u0010/æ\u001a\u000epxÎ\fxÅ]õ\u0096´\u0098Ä\u0010§\u0017@\u0005zðýîºí »NÎÜ((\u0094/ùØl>H|ii\u0003uDæt\u0083·ìæë\u0014¨\\ä=Å+áyñ¯,mw?_y$eà\u0010laúãz|ºN\u0001\u0006£T.$÷\u008b";
      int var7 = "6²#!\u0003\u0085#K²'\u000e\f\u0086\u00906¥÷\u0099½oµ.\u009f¶Ýe\u000eUÅ\u000e3Ø 7Qg9êZ\u00911\u001f\u000b\u001cx\u001fTPJ<×Aâ«\u0018o\u0086ð\\Ûª\u000fß\n.@#&Éþ\u001a¦\u000fC*rlvßf2:T@ÿ\u0094f\u0084Å£Ö\u0085\u001e0õ\\ñqæ¢ìîlòÍ\f0\u0006Á¸W/3\u0086ó/¼â\u0000k)\u0094ª\u009f\u0099¢Ë¥!\u00ad\u0010/æ\u001a\u000epxÎ\fxÅ]õ\u0096´\u0098Ä\u0010§\u0017@\u0005zðýîºí »NÎÜ((\u0094/ùØl>H|ii\u0003uDæt\u0083·ìæë\u0014¨\\ä=Å+áyñ¯,mw?_y$eà\u0010laúãz|ºN\u0001\u0006£T.$÷\u008b"
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
                     CONST_B = var4;
                     CONST_C = new String[9];
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

                  var6 = " U\u001bLw÷s\u0095\u008b~äº|'ö\u001c\u0089\u0097\u0011:FM2ã\"\u001c\u001d»ºjsº*l\u0081eöâØë(0\u009dÛO\b\u009eÿ\u0091 gº\u0011A!%]Ø\u000e\buû\u0093\u009f\u00017õ¨ód\u0019Ò¬\u008fÈ·òZ\u0090Î»";
                  var7 = " U\u001bLw÷s\u0095\u008b~äº|'ö\u001c\u0089\u0097\u0011:FM2ã\"\u001c\u001d»ºjsº*l\u0081eöâØë(0\u009dÛO\b\u009eÿ\u0091 gº\u0011A!%]Ø\u000e\buû\u0093\u009f\u00017õ¨ód\u0019Ò¬\u008fÈ·òZ\u0090Î»"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22077;
      if (CONST_C[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/eY", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B[var3].getBytes("ISO-8859-1");
         CONST_C[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C[var3];
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
         throw new RuntimeException("rip/breeze/eY" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
