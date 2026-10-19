package rip.breeze.classtransform;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ծ implements ձ {
   private static final Pattern CONST_Ÿ_2;
   private static int[] arr_þ_2;
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   @Override
   public void invoke_1(Object... var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      Object[] var5 = (Object[])var1[2];
      long var6 = var3 ^ 86723216323117L;
      long var8 = var3 ^ 97521812088361L;
      long var10 = var3 ^ 30502914159872L;
      int[] var10000 = method_003();
      կ var12 = հ.method_004(new Object[]{var5, var6});
      int[] var13 = var10000;
      System.out.println(this.method_001(new Object[]{((String)null), var10, var2, var12.method_001(new Object[0])}));
      կ var14 = var12;
      if (var13 != null) {
         if (!var12.method_003(new Object[]{var8})) {
            return;
         }

         var14 = var12;
      }

      var14.method_002(new Object[0]).printStackTrace(System.out);
   }

   @Override
   public void invoke_2(Object... var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      Object[] var5 = (Object[])var1[2];
      long var6 = var2 ^ 59323711048723L;
      long var8 = var2 ^ 39142768400407L;
      long var10 = var2 ^ 106196042582846L;
      int[] var10000 = method_003();
      կ var12 = հ.method_004(new Object[]{var5, var6});
      System.err.println(this.method_001(new Object[]{((String)null), var10, var4, var12.method_001(new Object[0])}));
      int[] var13 = var10000;
      կ var14 = var12;
      if (var13 != null) {
         if (!var12.method_003(new Object[]{var8})) {
            return;
         }

         var14 = var12;
      }

      var14.method_002(new Object[0]).printStackTrace(System.err);
   }

   @Override
   public void invoke_3(Object... var1) {
      long var2;
      byte var15;
      label29: {
         label28: {
            var2 = (Long)var1[0];
            String var4 = (String)var1[1];
            Object[] var5 = (Object[])var1[2];
            long var6 = var2 ^ 69435231991038L;
            long var8 = var2 ^ 45403779195130L;
            long var10 = var2 ^ 116855180768211L;
            int[] var10000 = method_003();
            կ var12 = հ.method_004(new Object[]{var5, var6});
            int[] var13 = var10000;
            System.err
               .println(this.method_001(new Object[]{((String)null), var10, var4, var12.method_001(new Object[0])}));
            կ var14 = var12;
            if (var13 != null) {
               var15 = var12.method_003(new Object[]{var8});
               if (var2 <= 0L) {
                  break label29;
               }

               if (var15 == 0) {
                  break label28;
               }

               var14 = var12;
            }

            var14.method_002(new Object[0]).printStackTrace(System.err);
         }

         var15 = rip.breeze.inject.ջ.method_013();
      }

      if (var2 > 0L) {
         if (var15 != 0) {
            return;
         }

         var15 = 1;
      }

      method_002(new int[var15]);
   }

   protected String invoke_1(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var5 = (String)var1[2];
      Object[] var6 = (Object[])var1[3];
      var3 = encKey_a_2 ^ var3;
      int[] var10000 = method_003();
      StringBuffer var7 = new StringBuffer();
      int[] var8 = var10000;
      var7.append("[").append(var2).append(((String)null));
      Matcher var9 = CONST_Ÿ_2.matcher(var5);
      int var10 = 0;

      label36:
      while (true) {
         if (var9.find()) {
            if (var8 == null) {
               break;
            }

            int var12 = var10;

            while (var12 < var6.length) {
               var9.appendReplacement(var7, var6[var10].toString().replace("$", ((String)null)));
               var10++;
               if (var8 != null) {
                  continue label36;
               }

               var12 = rip.breeze.inject.ջ.method_012();
               if (var3 > 0L) {
                  if (var3 >= 0L) {
                     var12 = var12 != 0 ? 0 : 1;
                  }

                  rip.breeze.inject.ջ.method_011((boolean)var12);
                  break;
               }
            }
         }

         var9.appendTail(var7);
         break;
      }

      return var7.toString();
   }

   static {
      long var0 = 128797938877565L;
      int[] var10000 = new int[1];
      method_002(var10000);
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "á\n6*½\"T=½zÒÆ(\u009c\u0003B\u0010\u009an\u001e\u0019åH\t\u001câ9U&\n%=q\u0010\u0019\u0099ÒEÑ\"î½\u0091¸õ\u009ccýùç\u0010ó\u0083'½¼ýró}àÊÛ8ÎÅK";
      int var7 = "á\n6*½\"T=½zÒÆ(\u009c\u0003B\u0010\u009an\u001e\u0019åH\t\u001câ9U&\n%=q\u0010\u0019\u0099ÒEÑ\"î½\u0091¸õ\u009ccýùç\u0010ó\u0083'½¼ýró}àÊÛ8ÎÅK"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = method_004(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var20;
                  if ((var12 += var8) >= var7) {
                     CONST_B_2 = var4;
                     CONST_C_2 = new String[6];
                     CONST_Ÿ_2 = Pattern.compile(((String)null));
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var20;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\u009a\u0007;:Ñ\u0002\u0086vÛø\u0097¤1ý;¡\u0010`\u001e\u0011·<|\u000eÿÖ\u0011\u009d_\u0015l®ä";
                  var7 = "\u009a\u0007;:Ñ\u0002\u0086vÛø\u0097¤1ý;¡\u0010`\u001e\u0011·<|\u000eÿÖ\u0011\u009d_\u0015l®ä".length();
                  var8 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void execute_2(int[] var0) {
      arr_þ_2 = var0;
   }

   public static int[] invoke_3() {
      return arr_þ_2;
   }

   private static String invoke_4(byte[] var0) {
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

   private static String invoke_5(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3419;
      if (CONST_C_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/ծ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B_2[var3].getBytes("ISO-8859-1");
         CONST_C_2[var3] = method_004(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }

   private static Object call_6(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = method_005(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite invoke_7(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("method_006".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/ծ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
