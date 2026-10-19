package rip.breeze.classtransform;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class å implements ç {
   private static String[] arr_ÿ_2;
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_A_2;

   @Override
   public ý invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      ò var4 = (ò)var1[1];
      Class var5 = (Class)var1[2];
      Map var6 = (Map)var1[3];
      Method var7 = (Method)var1[4];
      ó var8 = (ó)var1[5];
      rip.breeze.inject.é var9 = (rip.breeze.inject.é)var1[6];
      rip.breeze.inject.é var10 = (rip.breeze.inject.é)var1[7];
      throw new UnsupportedOperationException(
         ((String)null) + var5.getName() + ((String)null)
      );
   }

   public static void execute_1(String[] var0) {
      arr_ÿ_2 = var0;
   }

   public static String[] invoke_2() {
      return arr_ÿ_2;
   }

   static {
      long var10000 = rip.breeze.inject.Util138.getIBreezeInterface(-4885393516438034138L, -4306674432375958794L, MethodHandles.lookup().lookupClass())
         .method_003(150902516116407L);
      if (method_002() == null) {
         method_001(new String[5]);
      }

      CONST_A_2 = new HashMap(13);
      long var0 = var10000 ^ 19455431061775L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "ðn@ùAT÷p\u0014v%\u0093å\tÚDÍG\u009afñÜÐ\u0088vf7\u008c8\u001a\u0002Èô®ú ¸úàu¨\u0093ª\u0006îîÇyù=Yo\r\u0013L¿p30Ô\u009aØÐ{d\u0011\u0092\b\u0093rÍ\n MH\u0086?bK4\u0005\u0095Ñû\u009aÁ²d¹}\u0088\u0089tzòF\u0095\u000b\u0091\u008f`y\u0082¯<";
      int var7 = "ðn@ùAT÷p\u0014v%\u0093å\tÚDÍG\u009afñÜÐ\u0088vf7\u008c8\u001a\u0002Èô®ú ¸úàu¨\u0093ª\u0006îîÇyù=Yo\r\u0013L¿p30Ô\u009aØÐ{d\u0011\u0092\b\u0093rÍ\n MH\u0086?bK4\u0005\u0095Ñû\u009aÁ²d¹}\u0088\u0089tzòF\u0095\u000b\u0091\u008f`y\u0082¯<"
         .length();
      char var8 = 'H';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var14 = method_003(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var14;
         if ((var9 += var8) >= var7) {
            CONST_B_2 = var4;
            CONST_C_2 = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static String invoke_3(byte[] var0) {
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

   private static String invoke_4(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29293;
      if (CONST_C_2[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_A_2.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_A_2.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/classtransform/å", var10);
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
         CONST_C_2[var3] = method_003(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }

   private static Object call_5(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = method_004(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite invoke_6(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("method_005".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/classtransform/å" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
