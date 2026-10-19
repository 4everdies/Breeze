package rip.breeze.classtransform;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.classtransform.annotations.CShadow;
import rip.breeze.inject.BreezeClass12;
import rip.breeze.inject.ù;

public class Util142 extends BreezeColor {
   private static final String[] CONST_F;
   private static final String[] CONST_G;
   private static final Map CONST_H = new HashMap(13);

   public void processAll(Object[] var1) {
      ó var2 = (ó)var1[0];
      rip.breeze.inject.é var3 = (rip.breeze.inject.é)var1[1];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var1[2];
      long var5 = (Long)var1[3];
      long var7 = var5 ^ 38777181844383L;
      long var9 = var5 ^ 52903784144726L;
      long var11 = var5 ^ 63149773401490L;
      rip.breeze.inject.é var13 = MathUtil3.getÉ_3(new Object[]{var3, var9});
      boolean var10000 = BreezeClass4.isValid();
      rip.breeze.inject.é var14 = MathUtil3.getÉ_3(new Object[]{var4, var9});
      boolean var15 = false;
      boolean var16 = var10000;
      Iterator var17 = var4.list_ê_2.iterator();

      while (true) {
         if (var17.hasNext()) {
            rip.breeze.inject.ժ var18 = (rip.breeze.inject.ժ)var17.next();
            var10000 = var16;
            if (var5 < 0L) {
               break;
            }

            if (var5 > 0L) {
               if (var16) {
                  return;
               }

               var10000 = var16;
            }

            if (var5 >= 0L) {
               if (!var10000) {
                  if (var18.string_þ_2 != null) {
                     continue;
                  }

                  var15 = true;
                  var2.method_007(new Object[]{MathUtil3.buildString(new Object[]{var18.string_ÿ_2}), Util142::lambda$transform_Inner0});
               }

               var10000 = var16;
            }

            if (var5 >= 0L) {
               if (!var10000) {
                  continue;
               }

               var10000 = rip.breeze.inject.ջ.method_012();
            }

            if (var5 > 0L) {
               var10000 = !var10000;
            }

            rip.breeze.inject.ջ.method_011(var10000);
         }

         var10000 = var15;
         break;
      }

      if (var10000) {
         this.processAll(new Object[]{var11, var4});
         this.method_002(new Object[]{var4, var7});
      }
   }

   private void processAll(Object[] var1) {
      long var2 = (Long)var1[0];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var1[1];
      var2 = encKey_b ^ var2;
      long var5 = var2 ^ 23760423798696L;
      boolean var10000 = BreezeClass4.checkCondition();
      Iterator var7 = var4.list_å_2.iterator();
      boolean var8 = var10000;

      while (var7.hasNext()) {
         rip.breeze.inject.á var9 = (rip.breeze.inject.á)var7.next();
         int var10001 = var9.int_ý_2;
         Object[] var10004 = new Object[]{null, 1};
         var10004[0] = var10001;
         var9.int_ý_2 = MathUtil3.getValue(var10004);
         չ.method_030(new Object[]{var5, var9, CShadow.class}).ifPresent(Util142::lambda$makeFieldsPublic_Inner1);
         if (!var8) {
            break;
         }
      }
   }

   private void invoke_2(Object[] var1) {
      rip.breeze.inject.é var2 = (rip.breeze.inject.é)var1[0];
      long var3 = (Long)var1[1];
      var3 = encKey_b ^ var3;
      long var5 = var3 ^ 60482729621479L;
      boolean var10000 = BreezeClass4.checkCondition();
      Iterator var7 = var2.list_ä_2.iterator();
      boolean var8 = var10000;

      while (var7.hasNext()) {
         BreezeClass12 var9 = (BreezeClass12)var7.next();
         int var10001 = var9.int_û;
         Object[] var10004 = new Object[]{null, 1};
         var10004[0] = var10001;
         var9.int_û = MathUtil3.getValue(var10004);
         var9.int_û &= -65;
         չ.method_032(new Object[]{var5, var9, CShadow.class}).ifPresent(Util142::lambda$makeMethodsPublic_Inner2);
         if (!var8) {
            break;
         }
      }
   }

   private static void lambda$makeMethodsPublic_Inner2(ù var0) {
      long var1 = 70671310536909L;
      long var3 = var1 ^ 124115971628124L;
      long var5 = var1 ^ 109039327587452L;
      Map var7 = չ.method_001(new Object[]{var0.list_û_2, var3});
      var7.put("makePublic", true);
      var0.list_û_2 = չ.method_002(new Object[]{var5, var7});
   }

   private static void lambda$makeFieldsPublic_Inner1(ù var0) {
      long var1 = 115078173914210L;
      long var3 = var1 ^ 96816273516787L;
      long var5 = var1 ^ 83307225290963L;
      Map var7 = չ.method_001(new Object[]{var0.list_û_2, var3});
      var7.put("makePublic", true);
      var0.list_û_2 = չ.method_002(new Object[]{var5, var7});
   }

   private static rip.breeze.inject.é lambda$transform_Inner0(rip.breeze.inject.é var0, rip.breeze.inject.é var1, ó var2, rip.breeze.inject.é var3) {
      long var4 = 24071451737844L;
      long var6 = var4 ^ 64018497902090L;
      long var8 = var4 ^ 90397802019994L;
      long var10 = var4 ^ 30995589814941L;
      boolean var10000 = BreezeClass4.checkCondition();
      Iterator var12 = var3.list_å_2.iterator();
      boolean var13 = var10000;

      while (true) {
         if (var12.hasNext()) {
            rip.breeze.inject.á var14 = (rip.breeze.inject.á)var12.next();
            int var10001 = var14.int_ý_2;
            Object[] var10004 = new Object[]{null, 1};
            var10004[0] = var10001;
            var14.int_ý_2 = MathUtil3.getValue(var10004);
            if (!var13) {
               break;
            }

            if (var13) {
               continue;
            }
         }

         var12 = var3.list_ä_2.iterator();
         break;
      }

      while (true) {
         if (var12.hasNext()) {
            BreezeClass12 var16 = (BreezeClass12)var12.next();
            int var17 = var16.int_û;
            Object[] var19 = new Object[]{null, 1};
            var19[0] = var17;
            var16.int_û = MathUtil3.getValue(var19);
            if (!var13) {
               break;
            }

            if (var13) {
               continue;
            }
         }

         int var18 = var3.int_û_2;
         Object[] var20 = new Object[]{null, 1};
         var20[0] = var18;
         var3.int_û_2 = MathUtil3.getValue(var20);
         var3.string_ò_2 = null;
         break;
      }

      ô var15 = new ô();
      String var10003 = var1.string_ú_2;
      var15.method_002(new Object[]{var0.string_ú_2, var8, var10003});
      BreezeClass4.processAll(new Object[]{var0, var1, var10, var15});
      return խ.method_006(new Object[]{var3, var15, var6});
   }

   static {
      long var0 = 443503976374L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "½\u0018\u0013é¼\u007f÷ÚÃ¢Ø)Ò¸»?Ä'î&F]ßF j\u0000\u0098_¸Ö«N\u0082\u0095¾4_\u0003`Ú\u009fú^ T\u0018:Í³PøçxÍÉ\u0084";
      int var7 = "½\u0018\u0013é¼\u007f÷ÚÃ¢Ø)Ò¸»?Ä'î&F]ßF j\u0000\u0098_¸Ö«N\u0082\u0095¾4_\u0003`Ú\u009fú^ T\u0018:Í³PøçxÍÉ\u0084".length();
      char var8 = 24;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_F = var4;
            CONST_G = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28464;
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
            throw new RuntimeException("rip/breeze/classtransform/t", var10);
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
         throw new RuntimeException("rip/breeze/classtransform/t" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
