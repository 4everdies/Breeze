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

public class զ extends RuntimeException {
   private final String string_ÿ;
   private final String string_þ;
   private final String string_ý;
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   public զ(rip.breeze.inject.é var1, rip.breeze.inject.é var2, String var3) {
      this.string_ÿ = var1.string_ú_2;
      this.string_þ = var2.string_ú_2;
      this.string_ý = var3;
   }

   @Override
   public String getMessage() {
      long var1 = 25716536207340L;
      return null /* removed */
         + this.string_ÿ
         + null /* removed */
         + this.string_ý
         + null /* removed */
         + this.string_þ
         + "'";
   }

   static {
      long var0 = 75220429873580L;
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
      String var6 = "Ýáû`{4h3üæfh+þ\t±SB\u0002Î/\u0098\u001a×K8Ö8ô\u001f®Ê\u001dËiÜÿ8h\u0091 i;,i×\u0085Ù|«>2\u0010\u008c\u0094¾\u00199\u0015)Lqè8¼\u000bËËu\u0019\u009f\u001d (\u000e4\bûúFÒfNdÿ\u008a÷ÛHÌ\u001cUËbáï\u007fÜ\t&\u0099·t=\u001dr\u0013cË\u008a½ñNü";
      int var7 = "Ýáû`{4h3üæfh+þ\t±SB\u0002Î/\u0098\u001a×K8Ö8ô\u001f®Ê\u001dËiÜÿ8h\u0091 i;,i×\u0085Ù|«>2\u0010\u008c\u0094¾\u00199\u0015)Lqè8¼\u000bËËu\u0019\u009f\u001d (\u000e4\bûúFÒfNdÿ\u008a÷ÛHÌ\u001cUËbáï\u007fÜ\t&\u0099·t=\u001dr\u0013cË\u008a½ñNü"
         .length();
      char var8 = '(';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5320;
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
            throw new RuntimeException("rip/breeze/classtransform/զ", var10);
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
         CONST_C[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C[var3];
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
         throw new RuntimeException("rip/breeze/classtransform/զ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
