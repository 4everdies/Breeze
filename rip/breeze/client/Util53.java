package rip.breeze.client;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

final class Util53 implements GenericArrayType, Serializable {
   private final Type genericComponentType;
   private static final long serialVersionUID = 0L;
   private static final String CONST_C;

   public Util53(Type var1, long var2) {
      var2 = 99916996951343L ^ var2;
      long var4 = var2 ^ 112619708211631L;
      super();
      this.genericComponentType = Util141.getType(var4, var1);
   }

   @Override
   public Type getGenericComponentType() {
      return this.genericComponentType;
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 37968464317000L;
      long var10001 = var2 ^ 77476097028481L;
      int var4 = (int)((var2 ^ 77476097028481L) >>> 48);
      int var5 = (int)((var2 ^ 77476097028481L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return var1 instanceof GenericArrayType && Util141.checkCondition_2(this, (char)var4, var5, (char)var6, (GenericArrayType)var1);
   }

   @Override
   public int hashCode() {
      return this.genericComponentType.hashCode();
   }

   @Override
   public String toString() {
      long var1 = 117510511103581L;
      long var3 = var1 ^ 113160870187688L;
      return Util141.getString(var3, this.genericComponentType) + CONST_C;
   }

   static {
      long var0 = 98698851374736L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\b\u0000$\u009d·f¾°".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_C = var5;
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
}
