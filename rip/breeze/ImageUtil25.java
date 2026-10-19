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

final class ImageUtil25<T> extends UIPanel {
   boolean fieldBool_h;
   T object_i;
   String string_j;
   rip.breeze.client.AnimationTimer dataBuilder15_k = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private static final String[] CONST_M;
   private static final String[] CONST_N;
   private static final Map CONST_O = new HashMap(13);

   ImageUtil25(String var1, T var2, boolean var3) {
      super(0.0F, 0.0F, 0.0F, 0.0F);
      this.fieldBool_h = var3;
      this.object_i = (T)var2;
      this.string_j = var1;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      this.dataBuilder15_k.toggle(var6, this.a(var1, var2));
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
            this.a + 8.0F,
            this.b + 5.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               BreezeContext.authSession_c.getColor("default.text-primary"),
               (float)this.dataBuilder15_k.getDouble(var8)
            ),
            EnumType32.SOURCE_SANS,
            22.0F
         );
   }

   static {
      long var0 = 90041320678885L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[5];
      int var5 = 0;
      String var6 = "Âz\u001eÄb\u009búåT\u0090 N²é@D\u008aæ4hû\nÃ\u0015#è\u009d3^\u0092æ\u0090(\u001b\u0085¤ò\u0091³\u001aó%\u001dªkÅQÆë¬¼\u0016º/\u0090\u0093ñ\u0096Ê&{\u000e4×è®®}[`0RÀ(é\u008a\u000b3«\u007fìý{©¨\u009dÓ\u0097o\u001cÂ=`n1ð\u0015ow\u0000\u008a\u0093s\t B¨\u0017Ô,²1\u0017¹";
      int var7 = "Âz\u001eÄb\u009búåT\u0090 N²é@D\u008aæ4hû\nÃ\u0015#è\u009d3^\u0092æ\u0090(\u001b\u0085¤ò\u0091³\u001aó%\u001dªkÅQÆë¬¼\u0016º/\u0090\u0093ñ\u0096Ê&{\u000e4×è®®}[`0RÀ(é\u008a\u000b3«\u007fìý{©¨\u009dÓ\u0097o\u001cÂ=`n1ð\u0015ow\u0000\u008a\u0093s\t B¨\u0017Ô,²1\u0017¹"
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
                     CONST_N = new String[5];
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

                  var6 = "\u0082Ì»8 S\u0015\u0080\u00ad\u000f=Ü×ïã\u0084 í:bü\bÍ©wRýO!â¯\u0000(³\u0013.¦ÔaÃØ¨\u0000P\u0018v¿È\u0004¯9 \u007fVk\u0086Z\u001b\u0011\u0016_§Íst^b[¿õÀ\u0003A";
                  var7 = "\u0082Ì»8 S\u0015\u0080\u00ad\u000f=Ü×ïã\u0084 í:bü\bÍ©wRýO!â¯\u0000(³\u0013.¦ÔaÃØ¨\u0000P\u0018v¿È\u0004¯9 \u007fVk\u0086Z\u001b\u0011\u0016_§Íst^b[¿õÀ\u0003A"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1419;
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
            throw new RuntimeException("rip/breeze/d8", var10);
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
         throw new RuntimeException("rip/breeze/d8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
