package rip.breeze.classtransform;

import java.lang.annotation.Annotation;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.classtransform.annotations.InjectionInfo;
import rip.breeze.inject.BreezeClass12;
import rip.breeze.inject.ù;

public abstract class BreezeColor {
   private static String[] arr_ÿ;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public abstract void invoke_1(Object[] var1);

   protected Annotation getAnnotation(Object[] var1) {
      long var2 = (Long)var1[0];
      Class var4 = (Class)var1[1];
      rip.breeze.inject.é var5 = (rip.breeze.inject.é)var1[2];
      ó var6 = (ó)var1[3];
      var2 = encKey_a ^ var2;
      long var7 = var2 ^ 11142626344723L;
      String[] var10000 = method_011();
      List var10004 = var5.list_ï_2;
      Annotation var9 = this.getAnnotation_4(new Object[]{var4, var7, var10004, var6});
      String[] var10 = var10000;
      Annotation var12 = var9;
      if (var10 == null) {
         if (var9 == null) {
            List var10003 = var5.list_î_2;
            var9 = this.getAnnotation_4(new Object[]{var4, var7, var10003, var6});
         }

         var12 = var9;
      }

      return var12;
   }

   protected Annotation getAnnotation_2(Object[] var1) {
      long var2 = (Long)var1[0];
      Class var4 = (Class)var1[1];
      rip.breeze.inject.á var5 = (rip.breeze.inject.á)var1[2];
      ó var6 = (ó)var1[3];
      var2 = encKey_a ^ var2;
      long var7 = var2 ^ 108502986181410L;
      String[] var10000 = method_011();
      List var10004 = var5.list_ø_2;
      Annotation var9 = this.getAnnotation_4(new Object[]{var4, var7, var10004, var6});
      String[] var10 = var10000;
      Annotation var12 = var9;
      if (var10 == null) {
         if (var9 == null) {
            List var10003 = var5.list_ö_2;
            var9 = this.getAnnotation_4(new Object[]{var4, var7, var10003, var6});
         }

         var12 = var9;
      }

      return var12;
   }

   protected Annotation getAnnotation_3(Object[] var1) {
      Class var2 = (Class)var1[0];
      BreezeClass12 var3 = (BreezeClass12)var1[1];
      long var4 = (Long)var1[2];
      ó var6 = (ó)var1[3];
      var4 = encKey_a ^ var4;
      long var7 = var4 ^ 10535080020790L;
      String[] var10000 = method_011();
      List var10004 = var3.list_ô;
      Annotation var9 = this.getAnnotation_4(new Object[]{var2, var7, var10004, var6});
      String[] var10 = var10000;
      Annotation var12 = var9;
      if (var10 == null) {
         if (var9 == null) {
            List var10003 = var3.list_ó;
            var9 = this.getAnnotation_4(new Object[]{var2, var7, var10003, var6});
         }

         var12 = var9;
      }

      return var12;
   }

   protected Annotation getAnnotation_4(Object[] var1) {
      Class var2 = (Class)var1[0];
      long var3 = (Long)var1[1];
      List var5 = (List)var1[2];
      ó var6 = (ó)var1[3];
      var3 = encKey_a ^ var3;
      long var7 = var3 ^ 27245586261776L;
      long var9 = var3 ^ 88405864244388L;
      String[] var11 = method_011();
      List var10000 = var5;
      if (var11 == null) {
         if (var5 == null) {
            return null;
         }

         var10000 = var5;
      }

      for (ù var13 : var10000) {
         if (var13.string_ü_2.equals(ջ.method_006(new Object[]{var9, var2}))) {
            return պ.parse(var2, var6, չ.method_001(new Object[]{var13.list_û_2, var7}));
         }

         if (var11 != null) {
            break;
         }
      }

      return null;
   }

   protected void processNullable(Object[] var1) {
      long var2 = (Long)var1[0];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var1[1];
      rip.breeze.inject.á var5 = (rip.breeze.inject.á)var1[2];
      var2 = encKey_a ^ var2;
      long var6 = var2 ^ 84235635992086L;
      long var8 = var2 ^ 44651357220613L;
      String[] var10000 = method_011();
      ù var10 = new ù(ջ.method_006(new Object[]{var8, InjectionInfo.class}), var6);
      var10.list_û_2 = Arrays.asList(
         null /* removed */,
         var4.string_ú_2,
         null /* removed */,
         var5.string_ü_2 + ":" + var5.string_û_2
      );
      String[] var11 = var10000;
      List var13 = var5.list_ö_2;
      if (var11 == null) {
         if (var5.list_ö_2 == null) {
            var5.list_ö_2 = new ArrayList<>();
         }

         var13 = var5.list_ö_2;
      }

      var13.add(var10);
      byte var14 = rip.breeze.inject.ջ.method_012();
      if (var2 >= 0L) {
         if (var14 == 0) {
            return;
         }

         var14 = 2;
      }

      initialize(new String[var14]);
   }

   protected void processNullable_2(Object[] var1) {
      long var2 = (Long)var1[0];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var1[1];
      BreezeClass12 var5 = (BreezeClass12)var1[2];
      var2 = encKey_a ^ var2;
      long var6 = var2 ^ 37949737163869L;
      long var8 = var2 ^ 77529729357134L;
      String[] var10000 = method_011();
      ù var10 = new ù(ջ.method_006(new Object[]{var8, InjectionInfo.class}), var6);
      String[] var11 = var10000;
      var10.list_û_2 = Arrays.asList(
         null /* removed */,
         var4.string_ú_2,
         null /* removed */,
         var5.string_ú + var5.string_ù
      );
      List var13 = var5.list_ó;
      if (var11 == null) {
         if (var5.list_ó == null) {
            var5.list_ó = new ArrayList<>();
         }

         var13 = var5.list_ó;
      }

      var13.add(var10);
   }

   protected BreezeClass12 getBreezeClass12(Object[] var1) {
      BreezeClass12 var2 = (BreezeClass12)var1[0];
      BreezeClass12 var3 = (BreezeClass12)var1[1];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var1[2];
      long var5 = (Long)var1[3];
      rip.breeze.inject.é var7 = (rip.breeze.inject.é)var1[4];
      String var8 = (String)var1[5];
      var5 = encKey_a ^ var5;
      long var9 = var5 ^ 28343365438250L;
      long var11 = var5 ^ 121927248247262L;
      long var13 = var5 ^ 72677266778870L;
      String[] var10000 = method_011();
      this.processNullable_2(new Object[]{var11, var4, var2});
      int var15 = 0;
      String var16 = var2.string_ú + "$" + var3.string_ú.replaceAll(null /* removed */, "") + "$" + var8;
      String[] var17 = var10000;

      label41:
      while (true) {
         BreezeClass12 var19 = var2;

         while (true) {
            var19.string_ú = var16 + var15++;

            do {
               String var10003 = var2.string_ú;
               if (this.checkCondition(new Object[]{var13, var7, var10003})) {
                  continue label41;
               }
            } while (var5 < 0L);

            var19 = խ.method_001(new Object[]{var4, var7, var2, var9});
            String[] var20 = var17;

            while (var20 == null) {
               var20 = var17;
               if (var5 >= 0L) {
                  if (var17 != null) {
                     boolean var21 = rip.breeze.inject.ջ.method_012();
                     if (var5 >= 0L) {
                        var21 = !var21;
                     }

                     rip.breeze.inject.ջ.method_011(var21);
                  }

                  return var19;
               }
            }
         }
      }
   }

   private boolean checkCondition(Object[] var1) {
      long var2 = (Long)var1[0];
      rip.breeze.inject.é var4 = (rip.breeze.inject.é)var1[1];
      String var5 = (String)var1[2];
      var2 = encKey_a ^ var2;
      String[] var10000 = method_011();
      Iterator var6 = var4.list_ä_2.iterator();
      String[] var7 = var10000;

      while (true) {
         if (var6.hasNext()) {
            BreezeClass12 var8 = (BreezeClass12)var6.next();
            var10 = var8.string_ú.equals(var5);
            String[] var10001 = var7;
            if (var2 >= 0L) {
               if (var7 != null) {
                  break;
               }

               var10001 = var7;
            }

            if (var10001 != null) {
               return var10;
            }

            if (var10) {
               return true;
            }

            if (var7 == null) {
               continue;
            }
         }

         var10 = false;
         break;
      }

      return var10;
   }

   public static void initialize(String[] var0) {
      arr_ÿ = var0;
   }

   public static String[] invoke_11() {
      return arr_ÿ;
   }

   static {
      long var0 = 79878804247224L;
      initialize(null);
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
      String var6 = "]\tMôKÄÜG\u001b4ÌAÞÜ\u0012\u0097\u0018d\tîþ\u008fÝ6Ý=\u008d'\u008c\u0018\u001di\u008eò\u0018·¯\u0011'\u00ad\u0081\u0018(ù¢¼\u008eEèëmØY¸Ð\u0004ºÚÔ\u0093)ë År¯";
      int var7 = "]\tMôKÄÜG\u001b4ÌAÞÜ\u0012\u0097\u0018d\tîþ\u008fÝ6Ý=\u008d'\u008c\u0018\u001di\u008eò\u0018·¯\u0011'\u00ad\u0081\u0018(ù¢¼\u008eEèëmØY¸Ð\u0004ºÚÔ\u0093)ë År¯"
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
                     CONST_C = var4;
                     CONST_D = new String[5];
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

                  var6 = "\t9c\u00065½\u009cÝ,\u0085ß!o\u0018YOé-«Ê\u001aÂO9\rÜfÎ\u0007f¾\u000f O\u0005Öém\u0081\u000e1ì2\u0081eÄ\u0085\u0084+ÅbC\f\u0089*ÍâÐdZÍ\u001d%Ñ·";
                  var7 = "\t9c\u00065½\u009cÝ,\u0085ß!o\u0018YOé-«Ê\u001aÂO9\rÜfÎ\u0007f¾\u000f O\u0005Öém\u0081\u000e1ì2\u0081eÄ\u0085\u0084+ÅbC\f\u0089*ÍâÐdZÍ\u001d%Ñ·"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27837;
      if (CONST_D[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/w", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C[var3].getBytes("ISO-8859-1");
         CONST_D[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
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
         throw new RuntimeException("rip/breeze/classtransform/w" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
