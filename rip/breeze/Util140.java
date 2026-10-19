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

public class Util140 {
   public static final String CONST_A;
   public static String string_b;
   public static String string_c;
   public static String string_d;
   private static String string_e;
   public static EnumType23 enum_LEGACY_f;
   private static final String CONST_G;
   private static boolean fieldBool_h;
   private static final String[] CONST_J;
   private static final String[] CONST_K;
   private static final Map CONST_L = new HashMap(13);

   public static String buildString() {
      long var0 = 61696507477420L;
      String[] var2 = BreezeContext.getStateArray();
      if (getEnum_DEV() == EnumType15.STABLE) {
         return "v" + string_b;
      }

      if (getEnum_DEV() == EnumType15.BETA) {
         return "b" + string_b + string_c;
      }

      if (getEnum_DEV() == EnumType15.DEV) {
         return "dev-" + string_b;
      }

      String var10000 = "unknown";
      if (!LicenseState.isValid_2()) {
         BreezeContext.initialize(new String[5]);
      }

      return var10000;
   }

   public static String buildString_2() {
      long var0 = 68713019371292L;
      switch (Util1.CONST_A[EnumType15.valueOf(string_e.toUpperCase()).ordinal()]) {
         case 1:
            return String.format("dev-%s", string_b);
         case 2:
            return String.format("b%s", string_b);
         case 3:
            return String.format("v%s", string_b);
         default:
            return "unknown";
      }
   }

   public static String buildString_3() {
      long var0 = 34093956522050L;
      switch (Util1.CONST_A[EnumType15.valueOf(string_e.toUpperCase()).ordinal()]) {
         case 1:
            return String.format("dev.%s", string_d);
         case 2:
            return String.format("v%s-%s+%s.%s", string_b, getEnum_DEV().name().toLowerCase(), string_c, string_d);
         case 3:
            return String.format("v%s-%s.%s", string_b, getEnum_DEV().name().toLowerCase(), string_d);
         default:
            return "unknown";
      }
   }

   public static EnumType15 getEnum_DEV() {
      return EnumType15.valueOf(string_e.toUpperCase());
   }

   static {
      toggle(true);
      long var0 = 5702923183836L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[14];
      int var5 = 0;
      String var6 = "Ì\u0012E4\\\u0086÷6@\u001b=Pn÷O£\u0010\u0095ê;t¥§\u0091Ôì:K@¹_î\u009e\u0010Næ\u0087\u001e¹Nï#(Yj7ÂøL \u00101a|q\u0084_\u008d\u0089ÝÂa\u008a¤\n=\u009a\u0018|WûI\u0000\u0019KìÔªr8L\u0011\u0092î÷RÇ\u001a(õnC\u0010ý\u000f\b}S\u0088v}\u009cÂ\f÷ \u009aã¼\u0010¦©Ã¥æå²\u0018Ó\u000f\rnÌ$?ß\u0010V&c2üøö\tÕu\u0081\u0010\u0096Ì\u0017Ú\u0010¦º\u009c{ª\u008cúH\u0018\u0084U\u0017ÿg.ÿ ê\u0092Ë#a'èIi\u0092\u000e\u0002%6«KR\u0098\u0000öu)»\nl>}>å\u001fpÚ\u0010ô²àõ\u0019á\u001a\u000eÁÑs{;ÎÝ`\u0010§~¾ò×\u0014\u0091Ï¦½\u0004hÈ&3;";
      int var7 = "Ì\u0012E4\\\u0086÷6@\u001b=Pn÷O£\u0010\u0095ê;t¥§\u0091Ôì:K@¹_î\u009e\u0010Næ\u0087\u001e¹Nï#(Yj7ÂøL \u00101a|q\u0084_\u008d\u0089ÝÂa\u008a¤\n=\u009a\u0018|WûI\u0000\u0019KìÔªr8L\u0011\u0092î÷RÇ\u001a(õnC\u0010ý\u000f\b}S\u0088v}\u009cÂ\f÷ \u009aã¼\u0010¦©Ã¥æå²\u0018Ó\u000f\rnÌ$?ß\u0010V&c2üøö\tÕu\u0081\u0010\u0096Ì\u0017Ú\u0010¦º\u009c{ª\u008cúH\u0018\u0084U\u0017ÿg.ÿ ê\u0092Ë#a'èIi\u0092\u000e\u0002%6«KR\u0098\u0000öu)»\nl>}>å\u001fpÚ\u0010ô²àõ\u0019á\u001a\u000eÁÑs{;ÎÝ`\u0010§~¾ò×\u0014\u0091Ï¦½\u0004hÈ&3;"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var29 = buildString_4(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var29;
                  if ((var12 += var8) >= var7) {
                     CONST_J = var4;
                     CONST_K = new String[14];
                     short var15 = 31540;
                     long var23 = 5308657043460596410L ^ var0;
                     string_e = "stable";
                     short var16 = 9759;
                     long var24 = 2082044795972878231L ^ var0;
                     string_c = "67a8066";
                     short var17 = 23321;
                     long var25 = 4156343203775283870L ^ var0;
                     string_d = "1.8.9";
                     short var18 = 5491;
                     long var26 = 1974425249014172918L ^ var0;
                     CONST_A = "Breeze";
                     short var19 = 23352;
                     long var27 = 9001900496980083384L ^ var0;
                     string_b = "2.3";
                     enum_LEGACY_f = EnumType23.LEGACY;
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var29;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\bg\u008d-¡X\b\u0094k¯\u008bQ}~\u0012Ó\u0010\u0081F]Ïtb[ÆÀ\u000f.Á$\u000fÕ6";
                  var7 = "\bg\u008d-¡X\b\u0094k¯\u008bQ}~\u0012Ó\u0010\u0081F]Ïtb[ÆÀ\u000f.Á$\u000fÕ6".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void toggle(boolean var0) {
      fieldBool_h = var0;
   }

   public static boolean isValid() {
      return fieldBool_h;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid();
      return !var0;
   }

   private static String buildString_4(byte[] var0) {
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

   private static String buildString_5(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16209;
      if (CONST_K[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_L.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_L.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/J", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_J[var3].getBytes("ISO-8859-1");
         CONST_K[var3] = buildString_4(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_K[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_5(var4, var5);
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
         throw new RuntimeException("rip/breeze/J" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
