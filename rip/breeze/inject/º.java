package rip.breeze.inject;

import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class º {
   private final int int_ÿ_2;
   private final String string_þ_2;
   private final String string_ý_2;
   private final String string_ü_2;
   private final boolean bool_û_2;
   private static final String[] CONST_B_2;
   private static final String[] CONST_C_2;
   private static final Map CONST_D_2 = new HashMap(13);

   @Deprecated
   public º(int var1, String var2, String var3, long var4, String var6) {
      var4 = encKey_a_2 ^ var4;
      this(var1, var2, var3, var6, var1 == 9);
   }

   public º(int var1, String var2, String var3, String var4, boolean var5) {
      this.int_ÿ_2 = var1;
      this.string_þ_2 = var2;
      this.string_ý_2 = var3;
      this.string_ü_2 = var4;
      this.bool_û_2 = var5;
   }

   public int invoke_1(Object[] var1) {
      return this.int_ÿ_2;
   }

   public String invoke_2(Object[] var1) {
      return this.string_þ_2;
   }

   public String invoke_3(Object[] var1) {
      return this.string_ý_2;
   }

   public String invoke_4(Object[] var1) {
      return this.string_ü_2;
   }

   public boolean check_5(Object[] var1) {
      return this.bool_û_2;
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 18683414367753L;
      int var4 = Util140.getValue();
      Object var10000 = var1;
      if (var4 == 0) {
         if (var1 == this) {
            return true;
         }

         var10000 = var1;
      }

      if (var4 == 0) {
         if (!(var10000 instanceof º)) {
            return false;
         }

         var10000 = var1;
      }

      º var5;
      label67: {
         var5 = (º)var10000;
         var6 = this.int_ÿ_2;
         int var10001 = var5.int_ÿ_2;
         if (var4 == 0) {
            if (this.int_ÿ_2 != var5.int_ÿ_2) {
               return false;
            }

            var6 = this.bool_û_2;
            if (var4 != 0) {
               break label67;
            }

            var10001 = var5.bool_û_2;
         }

         if (var6 != var10001) {
            return false;
         }

         var6 = this.string_þ_2.equals(var5.string_þ_2);
      }

      if (var4 == 0) {
         if (var6 == 0) {
            return false;
         }

         var6 = this.string_ý_2.equals(var5.string_ý_2);
      }

      if (var4 == 0) {
         if (var6 == 0) {
            return false;
         }

         var6 = this.string_ü_2.equals(var5.string_ü_2);
      }

      return (boolean)(var4 != 0 ? var6 : var6 != 0);
   }

   @Override
   public int hashCode() {
      long var1 = 137772616324836L;
      int var3 = Util140.getValue_2();
      int var10001 = this.bool_û_2;
      if (var3 != 0) {
         var10001 = this.bool_û_2 ? 64 : 0;
      }

      return this.int_ÿ_2 + var10001 + this.string_þ_2.hashCode() * this.string_ý_2.hashCode() * this.string_ü_2.hashCode();
   }

   @Override
   public String toString() {
      long var1 = 57328093738601L;
      long var3 = var1 ^ 30340298131045L;
      String var5 = this.bool_û_2 ? method_008(639, 3579021286713525306L ^ var1) : "";
      int var6 = this.int_ÿ_2;
      String var7 = this.string_ü_2;
      String var8 = this.string_ý_2;
      String var9 = this.string_þ_2;
      Object[] var10007 = new Object[]{null, var9, var8, var7, var6, var5};
      var10007[0] = var3;
      return method_006(var10007);
   }

   private static String invoke_6(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      String var4 = (String)var0[2];
      String var5 = (String)var0[3];
      int var6 = (Integer)var0[4];
      String var7 = (String)var0[5];
      var1 = encKey_a_2 ^ var1;
      return var3 + "." + var4 + var5 + method_008(27692, 8358517084670117139L ^ var1) + var6 + var7 + ")";
   }

   static {
      long var0 = 94079437671762L;
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
      String var6 = "Sm¸(\u0015\u000eK\u009c«2Z^'5Þú\u0010>ËXS\u0099\u0089\n\u0097â;%ý\u0017\u008a¡&";
      int var7 = "Sm¸(\u0015\u000eK\u009c«2Z^'5Þú\u0010>ËXS\u0099\u0089\n\u0097â;%ý\u0017\u008a¡&".length();
      char var8 = 16;
      int var9 = -1;

      while (true) {
         byte[] var11 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         var4[var5++] = method_007(var11).intern();
         if ((var9 += var8) >= var7) {
            CONST_B_2 = var4;
            CONST_C_2 = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static String invoke_7(byte[] var0) {
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

   private static String invoke_8(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12332;
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
            throw new RuntimeException("rip/breeze/inject/º", var10);
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
         CONST_C_2[var3] = method_007(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C_2[var3];
   }
}
