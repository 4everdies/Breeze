package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.EnumType3;

public class RenderUtil12_x extends UIPanel {
   private final rip.breeze.client.AnimationTimer dataBuilder15_h = new rip.breeze.client.AnimationTimer(150.0F, false, EnumType3.LINEAR);
   private final long fieldLong_i;
   private final RenderUtil19_x enum4Val_j;
   private boolean fieldBool_k;
   private static final String[] CONST_M;
   private static final String[] CONST_N;
   private static final Map CONST_O = new HashMap(13);

   public RenderUtil12_x(boolean var1, long var2, RenderUtil19_x var4) {
      this.fieldBool_k = var1;
      this.fieldLong_i = var2;
      this.enum4Val_j = var4;
      this.c = 16.0F;
      this.d = 16.0F;
   }

   public void calculate(float var1, float var2, float var3) {
      long var4 = 27283383647554L;
      long var6 = var4 ^ 22603910165621L;
      long var8 = var4 ^ 46241641281725L;
      int[] var10000 = MathUtil8.decrypt();
      super.toggle(var1, var2, var3);
      this.dataBuilder15_h.toggle(var6, this.a(var1, var2));
      int[] var10 = var10000;
      if (this.fieldBool_k) {
         BreezeContext.iRenderer_b
            .drawTextAt(
               "bookmark",
               this.a,
               this.b,
               this.c / 24.0F,
               BreezeContext.authSession_c.getColor("default.accent")
            );
         if (var10 == null) {
            return;
         }
      }

      BreezeContext.iRenderer_b
         .drawTextAt(
            "bookmark_border",
            this.a,
            this.b,
            this.c / 24.0F,
            RenderUtil1.clamp(
               BreezeContext.authSession_c.getColor("default.text-tertiary"),
               BreezeContext.authSession_c.getColor("default.text-primary"),
               (float)this.dataBuilder15_h.getDouble(var8)
            )
         );
   }

   public boolean checkCondition(float var1, float var2, int var3) {
      long var4 = 106241825028779L;
      if (this.a(var1, var2) && var3 == 0) {
         this.fieldBool_k = !this.fieldBool_k;
         CloudAuthService var10000 = BreezeContext.cloudAuthService_h;
         Object[] var10001 = rip.breeze.client.MathUtil8.buildArgs3(this.fieldLong_i, this.enum4Val_j, this.fieldBool_k);
         Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-4998226845274627834L, var4);
         Object[] var10002 = var10001;
         CloudAuthService var8 = var10000;
         Method var7 = var10003;

         try {
            var7.invoke(var8, var10002);
            return true;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      } else {
         return super.isValid(var1, var2, var3);
      }
   }

   public void setBool_k(boolean var1) {
      this.fieldBool_k = var1;
   }

   static {
      long var0 = 77774726799393L;
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
      String var6 = "î\u008fF®:\nrÊ{°Ë§×|%á\u008f©É·\u0012¸ô2¿Ð0Ê\\\u009ekÛ(\u0084'\n\u0088[E£ñ\u0095M\u009aûµX»q\u008d\u0098ÌÆÎ\u0097ÿ#õ¾\u0081X[\u0003\u0017$»lÕé\u00057;e(X~¦UÍ\u0081I\u00ad\u0084}4R¹\u008a\t¥s%òI\u00026¼õýUTíþ¥Ba(mÂ\"C)]ê";
      int var7 = "î\u008fF®:\nrÊ{°Ë§×|%á\u008f©É·\u0012¸ô2¿Ð0Ê\\\u009ekÛ(\u0084'\n\u0088[E£ñ\u0095M\u009aûµX»q\u008d\u0098ÌÆÎ\u0097ÿ#õ¾\u0081X[\u0003\u0017$»lÕé\u00057;e(X~¦UÍ\u0081I\u00ad\u0084}4R¹\u008a\t¥s%òI\u00026¼õýUTíþ¥Ba(mÂ\"C)]ê"
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

                  var6 = "¹YÃ\nÖpô [¨ü\\ë5\u0001|ûK\u0094t\u009e~}{6¤úÝ(SÚ/ ;!{\rïv=L)Ù\u008cø\u0090\u000fÍ¢òØÕ\u0015\u0018\u0005\u008b3\u0000Æ ð\u00adÙ\u009fv";
                  var7 = "¹YÃ\nÖpô [¨ü\\ë5\u0001|ûK\u0094t\u009e~}{6¤úÝ(SÚ/ ;!{\rïv=L)Ù\u008cø\u0090\u000fÍ¢òØÕ\u0015\u0018\u0005\u008b3\u0000Æ ð\u00adÙ\u009fv"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6190;
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
            throw new RuntimeException("rip/breeze/em", var10);
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
         throw new RuntimeException("rip/breeze/em" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
