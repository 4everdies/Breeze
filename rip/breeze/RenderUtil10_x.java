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

public class RenderUtil10_x extends UIPanel {
   private final RenderUtil15_x dataBuilder69_h;
   private final ModuleCategory moduleCategory_i;
   private final rip.breeze.client.AnimationTimer dataBuilder15_j = new rip.breeze.client.AnimationTimer(250.0F, false, EnumType3.SINE_OUT);
   private final rip.breeze.client.AnimationTimer dataBuilder15_k = new rip.breeze.client.AnimationTimer(100.0F, true, EnumType3.LINEAR);
   private static final String[] CONST_M;
   private static final String[] CONST_N;
   private static final Map CONST_O = new HashMap(13);

   public RenderUtil10_x(ModuleCategory var1, RenderUtil15_x var2) {
      super(0.0F, 0.0F, 0.0F, 0.0F);
      this.moduleCategory_i = var1;
      this.dataBuilder69_h = var2;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      super.toggle(var1, var2, var3);
      boolean var10 = this.isValid();
      this.dataBuilder15_k.toggle(var6, !this.a(var1, var2) && !var10);
      this.dataBuilder15_j.toggle(var6, var10);
      Color var11 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("tag.text"),
         BreezeContext.authSession_c.getColor("tag.text-hovered"),
         (float)this.dataBuilder15_k.getDouble(var8)
      );
      Color var12 = RenderUtil1.clamp(
         BreezeContext.authSession_c.getColor("tag.background"),
         BreezeContext.authSession_c.getColor("tag.background-selected"),
         (float)this.dataBuilder15_j.getDouble(var8)
      );
      BreezeContext.iRenderer_b
         .fillRoundedRectFull(this.a, this.b, this.c, this.d, BreezeContext.authSession_c.getFloat("tag.corner-radius"), var12);
      BreezeContext.iRenderer_b.drawText(this.moduleCategory_i.name, this.a + 8.0F, this.b + 9.0F, var11, EnumType32.SOURCE_SANS, 20.0F);
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.a(var1, var2) && var3 == 0 && !this.isValid()) {
         this.dataBuilder69_h.initialize(this.moduleCategory_i);
         return true;
      } else {
         return false;
      }
   }

   public ModuleCategory getModuleCategory_i() {
      return this.moduleCategory_i;
   }

   private boolean isValid() {
      long var1 = 129778812466587L;
      return this.dataBuilder69_h.getModuleCategory_m() == this.moduleCategory_i;
   }

   static {
      long var0 = 38197268783728L;
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
      String var6 = "Ò\u0015±\u000b\u0080;jKÃvåý]\u0011æ(á\u0099\u001c\u0001\\»\r:öa\"\u0000\u0001\u008cFvby\u0086Õo\u0010\u0082í ¨¯ÄÒÞ\u0086Iò\u0000Q\u008e\t`\u0090\u0097F¸û¹\u0095\u0014Ý\u001e`#cF®³\u0014j¤ Ï\u009dÛ¬tÓÔÁ0í\u0089°6Û\u0010`ª\u0099y\u008cw¤AT×\u0015\u001b¥Ë% \u0006";
      int var7 = "Ò\u0015±\u000b\u0080;jKÃvåý]\u0011æ(á\u0099\u001c\u0001\\»\r:öa\"\u0000\u0001\u008cFvby\u0086Õo\u0010\u0082í ¨¯ÄÒÞ\u0086Iò\u0000Q\u008e\t`\u0090\u0097F¸û¹\u0095\u0014Ý\u001e`#cF®³\u0014j¤ Ï\u009dÛ¬tÓÔÁ0í\u0089°6Û\u0010`ª\u0099y\u008cw¤AT×\u0015\u001b¥Ë% \u0006"
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

                  var6 = "\u0088&ÁèPÞ¦²~îÄ\u0012TJ`¬Õ¥k,~g³Úîñ!Ö\u0010Æï\u0016cá\u0012vJM\u0099b(g\\@éà\u00983ª \u0001¦¦÷¯\"\u0088J«\u0007»1ºßÃÅ]ÈW¦/\u0004ÛöG\u000fú\r\tê¼";
                  var7 = "\u0088&ÁèPÞ¦²~îÄ\u0012TJ`¬Õ¥k,~g³Úîñ!Ö\u0010Æï\u0016cá\u0012vJM\u0099b(g\\@éà\u00983ª \u0001¦¦÷¯\"\u0088J«\u0007»1ºßÃÅ]ÈW¦/\u0004ÛöG\u000fú\r\tê¼"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15339;
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
            throw new RuntimeException("rip/breeze/eB", var10);
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
         throw new RuntimeException("rip/breeze/eB" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
