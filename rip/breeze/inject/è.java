package rip.breeze.inject;

import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class è {
   private final String string_ÿ_2;
   private final String string_þ_2;
   private final º º_ý_2;
   private final Object[] arr_ü_2;
   private static final String CONST_B_2;

   public è(String var1, String var2, º var3, Object... var4) {
      this.string_ÿ_2 = var1;
      this.string_þ_2 = var2;
      this.º_ý_2 = var3;
      this.arr_ü_2 = var4;
   }

   public String invoke_1(Object[] var1) {
      return this.string_ÿ_2;
   }

   public String invoke_2(Object[] var1) {
      return this.string_þ_2;
   }

   public º invoke_3(Object[] var1) {
      return this.º_ý_2;
   }

   public int invoke_4(Object[] var1) {
      return this.arr_ü_2.length;
   }

   public Object call_5(Object[] var1) {
      int var2 = (Integer)var1[0];
      return this.arr_ü_2[var2];
   }

   Object[] invoke_6(Object[] var1) {
      return this.arr_ü_2;
   }

   public int invoke_7(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_a_2 ^ var2;
      int var10000 = Util140.getValue_2();
      char var4 = this.string_þ_2.charAt(0);
      int var5 = var10000;
      char var7 = var4;
      if (var5 != 0) {
         label30: {
            int var10001 = 74;
            if (var2 > 0L) {
               if (var4 == 'J') {
                  break label30;
               }

               var7 = var4;
               var10001 = var5;
            }

            if (var2 >= 0L) {
               if (var10001 == 0) {
                  return var7;
               }

               var10001 = 68;
            }

            if (var7 != var10001) {
               return 1;
            }
         }

         var7 = 2;
      }

      return var7;
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 97189546903326L;
      int var4 = Util140.getValue_2();
      Object var10000 = var1;
      if (var4 != 0) {
         if (var1 == this) {
            return true;
         }

         var10000 = var1;
      }

      if (var4 != 0) {
         if (!(var10000 instanceof è)) {
            return false;
         }

         var10000 = var1;
      }

      è var5 = (è)var10000;
      boolean var6 = this.string_ÿ_2.equals(var5.string_ÿ_2);
      if (var4 != 0) {
         if (!var6) {
            return false;
         }

         var6 = this.string_þ_2.equals(var5.string_þ_2);
      }

      if (var4 != 0) {
         if (!var6) {
            return false;
         }

         var6 = this.º_ý_2.equals(var5.º_ý_2);
      }

      if (var4 != 0) {
         if (!var6) {
            return false;
         }

         var6 = Arrays.equals(this.arr_ü_2, var5.arr_ü_2);
      }

      return var4 == 0 ? var6 : var6;
   }

   @Override
   public int hashCode() {
      return this.string_ÿ_2.hashCode()
         ^ Integer.rotateLeft(this.string_þ_2.hashCode(), 8)
         ^ Integer.rotateLeft(this.º_ý_2.hashCode(), 16)
         ^ Integer.rotateLeft(Arrays.hashCode(this.arr_ü_2), 24);
   }

   @Override
   public String toString() {
      long var1 = 3621147286512L;
      long var3 = var1 ^ 14757351071101L;
      return method_008(new Object[]{this.string_ÿ_2, this.string_þ_2, String.valueOf(this.º_ý_2), Arrays.toString(this.arr_ü_2), var3});
   }

   private static String invoke_8(Object[] var0) {
      String var1 = (String)var0[0];
      String var2 = (String)var0[1];
      String var3 = (String)var0[2];
      String var4 = (String)var0[3];
      long var5 = (Long)var0[4];
      var5 = encKey_a_2 ^ var5;
      return var1 + CONST_B_2 + var2 + " " + var3 + " " + var4;
   }

   static {
      long var0 = 93474072532264L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var5 = var2.doFinal("\u0088\u0019ª\u0011\n0ôN".getBytes("ISO-8859-1"));
      CONST_B_2 = method_009(var5).intern();
   }

   private static String invoke_9(byte[] var0) {
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
}
