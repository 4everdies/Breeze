package rip.breeze.classtransform;

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

public final class ւ {
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   private static String invoke_1(Object[] var0) {
      String var1;
      int var4;
      long var6;
      String var10001;
      var1 = (String)var0[0];
      var6 = (Long)var0[1];
      var6 = encKey_a_2 ^ var6;
      var4 = MathUtil3.getValue_5();
      var10001 = var1;
      label35:
      if (var4 == 0) {
         short var8 = var1.contains("(");
         if (var6 > 0L) {
            if (var8 != 0) {
               var10001 = ((String)null);
               break label35;
            }

            var8 = 18420;
         }

         var10001 = ((String)null);
      }

      var1 = var1.replaceAll(var10001, ((String)null));
      boolean var10000 = var1.contains("*");
      if (var4 == 0) {
         if (var10000) {
            var1 = var1.replaceAll(((String)null), ".");
         }

         if (var4 != 0) {
            return var1;
         }

         var10000 = var1.contains("%");
      }

      if (var10000) {
         var1 = var1.replaceAll("%", ((String)null)) + "$";
      }

      return var1;
   }

   public static boolean check_2(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      String var5 = (String)var0[3];
      String var6 = (String)var0[4];
      var2 = encKey_a_2 ^ var2;
      long var7 = var2 ^ 39785494540283L;
      long var9 = var2 ^ 38734603795741L;
      int var11 = MathUtil3.getValue_5();
      String var10000 = var1;
      if (var11 == 0) {
         boolean var15 = var1.startsWith("L");
         if (var2 <= 0L) {
            return var15;
         }

         if (!var15) {
            return method_003(new Object[]{var1, var9, var5, var6});
         }

         var10000 = var1.substring(1, var1.indexOf(";"));
      }

      String var12 = var10000;
      String var13 = var1.substring(var1.indexOf(";") + 1);
      boolean var16 = method_003(new Object[]{var13, var9, var5, var6});
      int var10001 = var11;
      if (var2 >= 0L) {
         if (var11 == 0) {
            if (!var16) {
               return false;
            }

            var16 = var4.matches(method_001(new Object[]{var12, var7}));
         }

         var10001 = var11;
      }

      return var10001 != 0 ? var16 : var16;
   }

   public static boolean check_3(Object[] var0) {
      String var1 = (String)var0[0];
      long var2 = (Long)var0[1];
      String var4 = (String)var0[2];
      String var5 = (String)var0[3];
      var2 = encKey_a_2 ^ var2;
      long var6 = var2 ^ 18671961568241L;
      int var8 = MathUtil3.getValue_6();
      String var10000 = var1;
      if (var8 != 0) {
         boolean var12 = var1.contains("(");
         if (var2 <= 0L) {
            return var12;
         }

         if (!var12) {
            return var4.matches(method_001(new Object[]{var1, var6}));
         }

         var10000 = var1.substring(0, var1.indexOf("("));
      }

      String var9 = var10000;
      String var10 = var1.substring(var1.indexOf("("));
      boolean var13 = var4.matches(method_001(new Object[]{var9, var6}));
      int var10001 = var8;
      if (var2 >= 0L) {
         if (var8 != 0) {
            if (!var13) {
               return false;
            }

            var13 = var5.matches(method_001(new Object[]{var10, var6}));
         }

         var10001 = var8;
      }

      return var10001 == 0 ? var13 : var13;
   }

   public static boolean check_4(Object[] var0) {
      String var1 = (String)var0[0];
      String var2 = (String)var0[1];
      String var3 = (String)var0[2];
      long var4 = (Long)var0[3];
      String var6 = (String)var0[4];
      var4 = encKey_a_2 ^ var4;
      long var7 = var4 ^ 59559951543863L;
      long var9 = var4 ^ 54119439959438L;
      int var11 = MathUtil3.getValue_5();
      String var10000 = var1;
      if (var11 == 0) {
         boolean var15 = var1.startsWith("L");
         if (var4 < 0L) {
            return var15;
         }

         if (!var15) {
            return method_005(new Object[]{var1, var3, var7, var6});
         }

         var10000 = var1.substring(1, var1.indexOf(";"));
      }

      String var12 = var10000;
      String var13 = var1.substring(var1.indexOf(";") + 1);
      boolean var16 = method_005(new Object[]{var13, var3, var7, var6});
      int var10001 = var11;
      if (var4 > 0L) {
         if (var11 == 0) {
            if (!var16) {
               return false;
            }

            var16 = var2.matches(method_001(new Object[]{var12, var9}));
         }

         var10001 = var11;
      }

      return var10001 != 0 ? var16 : var16;
   }

   public static boolean check_5(Object[] var0) {
      String var1 = (String)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      String var5 = (String)var0[3];
      var3 = encKey_a_2 ^ var3;
      long var6 = var3 ^ 18680919689902L;
      int var8 = MathUtil3.getValue_6();
      String var10000 = var1;
      if (var8 != 0) {
         boolean var12 = var1.contains(":");
         if (var3 <= 0L) {
            return var12;
         }

         if (!var12) {
            return var2.matches(method_001(new Object[]{var1, var6}));
         }

         var10000 = var1.substring(0, var1.indexOf(":"));
      }

      String var9 = var10000;
      String var10 = var1.substring(var1.indexOf(":") + 1);
      boolean var13 = var2.matches(method_001(new Object[]{var9, var6}));
      int var10001 = var8;
      if (var3 > 0L) {
         if (var8 != 0) {
            if (!var13) {
               return false;
            }

            var13 = var5.matches(method_001(new Object[]{var10, var6}));
         }

         var10001 = var8;
      }

      return var10001 == 0 ? var13 : var13;
   }

   static {
      long var0 = 95110535772881L;
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
      String var6 = "A^åi)¨6\u008aòtÞKXÿ÷\u000e\u0010'~!Ó\u009e#l5(ª\u0018Ó\u008b\u0011²´\u0010HH\u008f\f¢\u0007´f[Gè\u0018\u0015&8'";
      int var7 = "A^åi)¨6\u008aòtÞKXÿ÷\u000e\u0010'~!Ó\u009e#l5(ª\u0018Ó\u008b\u0011²´\u0010HH\u008f\f¢\u0007´f[Gè\u0018\u0015&8'".length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = method_006(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_B_2 = var4;
                     CONST_C_2 = new String[5];
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

                  var6 = ",\u001d6\u009d&7ªß¶!:ùÐö°\u0007\u0010ß\u0001na\u008f\u008b\u0080s\u009a\u0013ì\u000e\u009d×ª?";
                  var7 = ",\u001d6\u009d&7ªß¶!:ùÐö°\u0007\u0010ß\u0001na\u008f\u008b\u0080s\u009a\u0013ì\u000e\u009d×ª?".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static String invoke_6(byte[] var0) {
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

   private static String invoke_7(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7444;
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
            throw new RuntimeException("rip/breeze/classtransform/ւ", var10);
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
         CONST_C_2[var3] = method_006(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }

   private static Object call_8(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = method_007(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite invoke_9(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("method_008".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/ւ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
