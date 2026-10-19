package rip.breeze.inject;

import java.io.PrintWriter;
import java.io.StringWriter;
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

public class BreezeLogger implements rip.breeze.classtransform.ձ {
   private final Pattern pattern_ÿ;
   private static boolean bool_þ;
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   public BreezeLogger(short var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ 135157529298976L;
      super();
      this.pattern_ÿ = Pattern.compile("\\{}");
   }

   @Override
   public void invoke_1(Object... var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      Object[] var5 = (Object[])var1[2];
      long var6 = var3 ^ 86723216323117L;
      long var8 = var3 ^ 79777075572L;
      long var10 = var3 ^ 97521812088361L;
      boolean var10000 = checkCondition();
      rip.breeze.classtransform.կ var12 = rip.breeze.classtransform.հ.method_004(new Object[]{var5, var6});
      boolean var13 = var10000;
      String var14 = this.buildString(new Object[]{var8, var2, var12.method_001(new Object[0])});
      this.info(var14);
      var10000 = this.isDebugMode();
      if (var13) {
         if (!var10000) {
            return;
         }

         var10000 = var12.method_003(new Object[]{var10});
      }

      if (var10000) {
         this.info(buildString_2(new Object[]{var12.method_002(new Object[0])}));
      }
   }

   @Override
   public void invoke_2(Object... var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      Object[] var5 = (Object[])var1[2];
      long var6 = var2 ^ 59323711048723L;
      long var8 = var2 ^ 135485299912522L;
      long var10 = var2 ^ 39142768400407L;
      rip.breeze.classtransform.կ var12 = rip.breeze.classtransform.հ.method_004(new Object[]{var5, var6});
      boolean var10000 = checkCondition();
      String var13 = this.buildString(new Object[]{var8, var4, var12.method_001(new Object[0])});
      this.warn(var13);
      boolean var14 = var10000;
      var10000 = this.isDebugMode();
      if (var14) {
         if (!var10000) {
            return;
         }

         var10000 = var12.method_003(new Object[]{var10});
      }

      if (var10000) {
         this.warn(buildString_2(new Object[]{var12.method_002(new Object[0])}));
      }
   }

   @Override
   public void invoke_3(Object... var1) {
      long var2;
      boolean var14;
      boolean var16;
      label37: {
         label36: {
            var2 = (Long)var1[0];
            String var4 = (String)var1[1];
            Object[] var5 = (Object[])var1[2];
            long var6 = var2 ^ 69435231991038L;
            long var8 = var2 ^ 125258019592103L;
            long var10 = var2 ^ 45403779195130L;
            rip.breeze.classtransform.կ var12 = rip.breeze.classtransform.հ.method_004(new Object[]{var5, var6});
            var16 = isValid();
            String var13 = this.buildString(new Object[]{var8, var4, var12.method_001(new Object[0])});
            var14 = var16;
            BreezeLogger var15 = this;
            String var10001 = var13;
            if (!var14) {
               this.error(var13);
               var16 = var12.method_003(new Object[]{var10});
               if (var2 < 0L) {
                  break label37;
               }

               if (!var16) {
                  break label36;
               }

               var15 = this;
               var10001 = buildString_2(new Object[]{var12.method_002(new Object[0])});
            }

            var15.error(var10001);
         }

         var16 = ջ.method_013();
      }

      if (var2 > 0L) {
         if (var16) {
            return;
         }

         var16 = var14;
      }

      if (var2 > 0L) {
         var16 = !var16;
      }

      toggle(var16);
   }

   protected String buildString(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      Object[] var5 = (Object[])var1[2];
      var2 = 135157529298976L ^ var2;
      byte var6 = checkCondition();
      String var10000 = var4;
      if (var6 != 0) {
         if (var4 != null) {
            StringBuffer var7 = new StringBuffer();
            Matcher var8 = this.pattern_ÿ.matcher(var4);
            int var9 = 0;

            while (true) {
               label32:
               if (var8.find()) {
                  int var11 = var6;
                  if (var2 > 0L) {
                     if (var6 == 0) {
                        break;
                     }

                     var11 = var9;
                  }

                  if (var2 >= 0L) {
                     if (var11 >= var5.length) {
                        break label32;
                     }

                     var8.appendReplacement(var7, String.valueOf(var5[var9]).replace("$", ((String)null)));
                     var9++;
                     var11 = var6;
                  }

                  if (var11 != 0) {
                     continue;
                  }
               }

               var8.appendTail(var7);
               if (var2 >= 0L) {
               }
               break;
            }

            return var7.toString();
         }

         var10000 = ((String)null);
      }

      return var10000;
   }

   private static String buildString_2(Object[] var0) {
      Throwable var1 = (Throwable)var0[0];
      StringWriter var2 = new StringWriter();
      PrintWriter var3 = new PrintWriter(var2);
      var1.printStackTrace(var3);
      var3.flush();
      return var2.toString();
   }

   private void info(String var1) {
   }

   private void warn(String var1) {
   }

   private void error(String var1) {
   }

   private boolean isDebugMode() {
      return false;
   }

   public static void toggle(boolean var0) {
      bool_þ = var0;
   }

   public static boolean isValid() {
      return bool_þ;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid();
      return !var0;
   }

   static {
      toggle(false);
      long var0 = 123446805485397L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[3];
      int var5 = 0;
      String var6 = "\u0012gyÓ\u0017q¶\u0016ya6ÛùË¬T\u0010u¬{ÂÅl'èÉ0¢Å\u0096o,¸\u0010ð«Ù?âÜb\u0015X*Ïûoû¶·";
      int var7 = "\u0012gyÓ\u0017q¶\u0016ya6ÛùË¬T\u0010u¬{ÂÅl'èÉ0¢Å\u0096o,¸\u0010ð«Ù?âÜb\u0015X*Ïûoû¶·".length();
      char var8 = 16;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString_3(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_B = var4;
            CONST_C = new String[3];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static String buildString_3(byte[] var0) {
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

   private static String buildString_4(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13178;
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
            throw new RuntimeException("rip/breeze/inject/BreezeLogger", var10);
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
         CONST_C[var3] = buildString_3(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_4(var4, var5);
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
         throw new RuntimeException("rip/breeze/inject/BreezeLogger" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
