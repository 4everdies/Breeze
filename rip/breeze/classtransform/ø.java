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

public class ø extends IllegalArgumentException {
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   public static ø getØ(Object[] var0) {
      String var1 = (String)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = encKey_a ^ var3;
      return new ø(null /* removed */ + var1 + null /* removed */ + var2);
   }

   public static ø getØ_2(Object[] var0) {
      String var1 = (String)var0[0];
      String var2 = (String)var0[1];
      long var3 = (Long)var0[2];
      int var5 = (Integer)var0[3];
      var3 = encKey_a ^ var3;

      try {
         if (var5 == 0) {
            return new ø(var1 + null /* removed */ + var2);
         }
      } catch (ø var6) {
         throw getØ_3(var6);
      }

      return new ø(
         var1
            + null /* removed */
            + var2
            + null /* removed */
            + var5
            + null /* removed */
      );
   }

   private ø(String var1) {
      super(var1);
   }

   static {
      long var0 = 98008048702579L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "\u0093\u0094\u009dwÏ¹\u0000\u0015~§0ç\u0004 J\u0015`Í\u0095¥6\u000fÑö\u009bë\u001dÞ\u000b\u0004\u0087Þm\u0089º)E;Z\u000b7\u009exË\u0002\u0016\u0086í\u0089¯zãåÙ¦G(\u0005M+\rº\u0084½¶\u0012\u008a\u000elP^\u0011ßþø\u0002[\u008c\u0099õ\u001f¡}ÿýÁ\u001dÑõ\u0095_6af\u008aÈ\u0082P7qNY°\u0014ÔÿxåªÑ\u0019¯/\u0080ÊÕ#89\\\u0015U\u0006÷G§¶¶V\t®\u008bÝCu\u0088Ïw\fjÚ²C¦4\u0080>pÔ&\u009e\n&Üa\u000e\u008b\u0016Ì\u0096\u0012à¾}F-U\u0006¶ÊcùZ\u0016\u0005>SÄ\u00105ãÑ_Inner6\u0000<+¯\u00991OH!Ó)";
      int var7 = "\u0093\u0094\u009dwÏ¹\u0000\u0015~§0ç\u0004 J\u0015`Í\u0095¥6\u000fÑö\u009bë\u001dÞ\u000b\u0004\u0087Þm\u0089º)E;Z\u000b7\u009exË\u0002\u0016\u0086í\u0089¯zãåÙ¦G(\u0005M+\rº\u0084½¶\u0012\u008a\u000elP^\u0011ßþø\u0002[\u008c\u0099õ\u001f¡}ÿýÁ\u001dÑõ\u0095_6af\u008aÈ\u0082P7qNY°\u0014ÔÿxåªÑ\u0019¯/\u0080ÊÕ#89\\\u0015U\u0006÷G§¶¶V\t®\u008bÝCu\u0088Ïw\fjÚ²C¦4\u0080>pÔ&\u009e\n&Üa\u000e\u008b\u0016Ì\u0096\u0012à¾}F-U\u0006¶ÊcùZ\u0016\u0005>SÄ\u00105ãÑ_Inner6\u0000<+¯\u00991OH!Ó)"
         .length();
      char var8 = '8';
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
                     CONST_B = var4;
                     CONST_C = new String[6];
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

                  var6 = "«Uy¬\"!fªZ¬EönæJ¼çÁ<oë±a\u0082 È\u0019¨Ut:g¹Mq\u0003ç\u0096Ë\"´j\u00170Ê¹\u008aØk,§\u0017°Î) Ü";
                  var7 = "«Uy¬\"!fªZ¬EönæJ¼çÁ<oë±a\u0082 È\u0019¨Ut:g¹Mq\u0003ç\u0096Ë\"´j\u00170Ê¹\u008aØk,§\u0017°Î) Ü".length();
                  var8 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static ø getØ_3(ø var0) {
      return var0;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6098;
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
            throw new RuntimeException("rip/breeze/classtransform/ø", var10);
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
         throw new RuntimeException("rip/breeze/classtransform/ø" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
