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

public class RenderUtil7 extends UIPanel {
   private final WorldUtil6 enum16Val_h;
   private final rip.breeze.client.AnimationTimer dataBuilder15_i = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private int fieldInt_j;
   private static final String[] CONST_L;
   private static final String[] CONST_M;
   private static final Map CONST_N = new HashMap(13);

   public RenderUtil7(WorldUtil6 var1) {
      this.enum16Val_h = var1;
   }

   public void setInt_j(int var1) {
      this.fieldInt_j = var1;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      this.dataBuilder15_i.toggle(var6, this.a(var1, var2));
      BreezeContext.iRenderer_b
         .strokeRoundedRect(
            this,
            BreezeContext.authSession_c.getFloat("drawer.corner-radius"),
            RenderUtil1.getColor_7(
               BreezeContext.authSession_c.getColor("default.hovered"),
               (int)(
                  BreezeContext.authSession_c.getColor("default.hovered").getAlpha() * this.dataBuilder15_i.getDouble(var8)
               )
            )
         );
      if (this.enum16Val_h.texture != null) {
         BreezeContext.iRenderer_b
            .drawTextColored(
               "items/" + this.enum16Val_h.texture,
               this.a + 4.0F,
               this.b + 4.0F,
               32.0F,
               32.0F,
               BreezeContext.authSession_c.getColor("default.text-secondary")
            );
      }

      BreezeContext.iRenderer_b
         .drawText(
            this.enum16Val_h.name,
            this.a + 50.0F,
            this.b + 10.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("default.text-secondary"),
               BreezeContext.authSession_c.getColor("default.text-primary"),
               (float)this.dataBuilder15_i.getDouble(var8)
            ),
            EnumType32.SOURCE_SANS,
            22.0F
         );
      if (this.fieldInt_j > 0) {
         float var10 = 22.0F;
         float var11 = this.a + this.c - var10 - 6.0F;
         float var12 = this.b + (this.d - var10) / 2.0F;
         BreezeContext.iRenderer_b
            .fillRoundedRectFull(
               var11, var12, var10, var10, var10 / 2.0F, BreezeContext.authSession_c.getColor("drawer.border")
            );
         String var13 = String.valueOf(this.fieldInt_j);
         float var14 = BreezeContext.iRenderer_b.measureText(var13, EnumType32.SOURCE_SANS, 18.0F);
         BreezeContext.iRenderer_b
            .drawText(
               var13,
               var11 + (var10 - var14) / 2.0F,
               var12 + 3.0F,
               BreezeContext.authSession_c.getColor("default.text-primary"),
               EnumType32.SOURCE_SANS,
               18.0F
            );
      }
   }

   public WorldUtil6 getEnum16Val_h() {
      return this.enum16Val_h;
   }

   static {
      long var0 = 31558316010523L;
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
      String var6 = "Ú6UûH\u000fr¢nÕÇ\u0085Õñíz(³ \u0083N·`º;B`\fln\u0014\u008e2v>\u008eab»?Îî&Ä\u008eøÎ£¢FÒH\u000f¹\u001cOm(\u0002\u0010u7Ç\u008eu¸·ß\u001eÓ.\u0091\u00adM·E\u0002\u009cêaÝ»\u0017 \u001d\u0016âÖØ·\u0087)¢¼S=j°\u0018nt\u0004b¦µ\u0012\u0005\u0089\u000e¸W\u009d:J³¦2=3¿\u000fÒr k\bÎ<÷\u0005)&\u007fáë\u001b±y³WWÂêk\u0094Ú¨\u0093\u001c\u009b×\u0080TN\u0002\u000b(#\u008d}ã%[7y\u0098\u001fAÚ\u0091¼B\u009f\u0002ycw\u001f\t\u0002f³%+[qò\tº+bkúuoa/(3L©v_«\u007f\u0000Ì³\u001dnP\u0002°\u0097PáÀÎ\u0014v®¾ðn3T\u0003ç\u0089Ào¬»\u0012#\u0012×5";
      int var7 = "Ú6UûH\u000fr¢nÕÇ\u0085Õñíz(³ \u0083N·`º;B`\fln\u0014\u008e2v>\u008eab»?Îî&Ä\u008eøÎ£¢FÒH\u000f¹\u001cOm(\u0002\u0010u7Ç\u008eu¸·ß\u001eÓ.\u0091\u00adM·E\u0002\u009cêaÝ»\u0017 \u001d\u0016âÖØ·\u0087)¢¼S=j°\u0018nt\u0004b¦µ\u0012\u0005\u0089\u000e¸W\u009d:J³¦2=3¿\u000fÒr k\bÎ<÷\u0005)&\u007fáë\u001b±y³WWÂêk\u0094Ú¨\u0093\u001c\u009b×\u0080TN\u0002\u000b(#\u008d}ã%[7y\u0098\u001fAÚ\u0091¼B\u009f\u0002ycw\u001f\t\u0002f³%+[qò\tº+bkúuoa/(3L©v_«\u007f\u0000Ì³\u001dnP\u0002°\u0097PáÀÎ\u0014v®¾ðn3T\u0003ç\u0089Ào¬»\u0012#\u0012×5"
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
                     CONST_L = var4;
                     CONST_M = new String[9];
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

                  var6 = "tÉN¦\u0082Æ6ÌÊ×r\u009cE\u0004½'êi[»e¨2²! L\u0017\u0013\"Í\u0084í\"÷Qo4¿\u0082 \u001fp1`î\u0086õ\u0082ehÍÌ\u0097Ù±\rºg_qLý\u008a\u0082ÎÙÿ\u0001 ¤Ãô";
                  var7 = "tÉN¦\u0082Æ6ÌÊ×r\u009cE\u0004½'êi[»e¨2²! L\u0017\u0013\"Í\u0084í\"÷Qo4¿\u0082 \u001fp1`î\u0086õ\u0082ehÍÌ\u0097Ù±\rºg_qLý\u008a\u0082ÎÙÿ\u0001 ¤Ãô"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15186;
      if (CONST_M[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_N.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_N.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/ea", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_L[var3].getBytes("ISO-8859-1");
         CONST_M[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_M[var3];
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
         throw new RuntimeException("rip/breeze/ea" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
