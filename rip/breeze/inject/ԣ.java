package rip.breeze.inject;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ԣ implements ԏ {
   public static final ԣ CONST_Ÿ_2;
   public static final ԣ CONST_Þ_2;
   public static final ԣ CONST_Ý_2;
   public static final ԣ CONST_Ü_2;
   public static final ԣ CONST_Û_2;
   public static final ԣ CONST_Ú_2;
   public static final ԣ CONST_Ù_2;
   private final MathUtil3 dataBuilder_ø_2;

   public ԣ(MathUtil3 var1) {
      this.dataBuilder_ø_2 = var1;
   }

   public MathUtil3 invoke_1(Object[] var1) {
      return this.dataBuilder_ø_2;
   }

   @Override
   public int invoke_1(Object[] var1) {
      long var2 = (Long)var1[0];
      String[] var4 = ԟ.method_015();
      MathUtil3 var10000 = this.dataBuilder_ø_2;
      MathUtil3 var10001 = MathUtil3.CONST_É;
      if (var4 == null) {
         if (this.dataBuilder_ø_2 == MathUtil3.CONST_É) {
            return 2;
         }

         var10000 = this.dataBuilder_ø_2;
         var10001 = MathUtil3.CONST_È;
      }

      return var10000 != var10001 ? 1 : 2;
   }

   public boolean check_2(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = encKey_a_2 ^ var2;
      long var4 = var2 ^ 39130558554215L;
      String[] var6 = ԟ.method_015();
      MathUtil3 var10000 = this.dataBuilder_ø_2;
      if (var6 == null) {
         if (this.dataBuilder_ø_2 == null) {
            return false;
         }

         var10000 = this.dataBuilder_ø_2;
      }

      int var8 = var10000.getValue(new Object[]{var4});
      if (var6 != null) {
         return (boolean)var8;
      }

      if (var8 == 10) {
         return true;
      }

      int var9 = this.dataBuilder_ø_2.getValue(new Object[]{var4});
      return (boolean)(var6 != null ? var9 : var9 == 9);
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 15507582789372L;
      String[] var4 = ԟ.method_015();
      Z var10000 = (Z)var1;
      if (var4 == null) {
         if (var1 == this) {
            return true;
         }

         var10000 = (Z)var1;
      }

      var10000 = var10000 instanceof ԣ;
      if (var4 == null) {
         if (var5) {
            MathUtil3 var6 = this.dataBuilder_ø_2;
            if (var4 == null) {
               if (this.dataBuilder_ø_2 == null) {
                  return ((ԣ)var1).dataBuilder_ø_2 == null;
               }

               var6 = this.dataBuilder_ø_2;
            }

            return var6.equals(((ԣ)var1).dataBuilder_ø_2);
         }

         var5 = false;
      }

      return var5;
   }

   @Override
   public int hashCode() {
      long var1 = 39539749164198L;
      String[] var3 = ԟ.method_015();
      MathUtil3 var10000 = this.dataBuilder_ø_2;
      if (var3 == null) {
         if (this.dataBuilder_ø_2 == null) {
            return 0;
         }

         var10000 = this.dataBuilder_ø_2;
      }

      return var10000.hashCode();
   }

   @Override
   public String toString() {
      long var1 = 8988177677204L;
      long var3 = var1 ^ 85267980949791L;
      String[] var5 = ԟ.method_015();
      ԣ var10000 = this;
      ԣ var10001 = CONST_Ÿ_2;
      if (var5 == null) {
         if (this == CONST_Ÿ_2) {
            return ".";
         }

         var10000 = this;
         var10001 = CONST_Ù_2;
      }

      if (var5 == null) {
         if (var10000 == var10001) {
            return "A";
         }

         var10000 = this;
         if (var5 != null) {
            return this.dataBuilder_ø_2.buildString_5(new Object[]{var3});
         }

         var10001 = CONST_Ú_2;
      }

      return var10000 == var10001 ? "R" : this.dataBuilder_ø_2.buildString_5(new Object[]{var3});
   }

   static {
      long var0 = 4159821123598L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var6 = var2.doFinal("\u001b;\u0000vÀk}\u009aæ\r-Vø\u0015PBxZ\u0002ùA(Ã\u000e".getBytes("ISO-8859-1"));
      String var4 = method_003(var6).intern();
      CONST_Ÿ_2 = new ԣ(null);
      CONST_Þ_2 = new ԣ(MathUtil3.CONST_Ë);
      CONST_Ý_2 = new ԣ(MathUtil3.CONST_Ê);
      CONST_Ü_2 = new ԣ(MathUtil3.CONST_É);
      CONST_Û_2 = new ԣ(MathUtil3.CONST_È);
      CONST_Ú_2 = new ԣ(MathUtil3.getDataBuilder_6(var4));
      CONST_Ù_2 = new ԣ(MathUtil3.CONST_Ð);
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
}
