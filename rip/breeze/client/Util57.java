package rip.breeze.client;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.LicenseState;
import rip.breeze.StringDecryptor;

final class Util57 implements ParameterizedType, Serializable {
   private final Type ownerType;
   private final Type rawType;
   private final Type[] arr_c;
   private static final long serialVersionUID = 0L;
   private static final String CONST_E;

   public Util57(Type var1, long var2, Type var4, Type... var5) {
      var2 = 54351891990340L ^ var2;
      long var6 = var2 ^ 78491640418396L;
      long var8 = var2 ^ 29157403713627L;
      long var10 = var2 ^ 108853604566743L;
      long var12 = var2 ^ 101268105381254L;
      super();
      if (var4 instanceof Class) {
         Class var14 = (Class)var4;
         boolean var10000 = Modifier.isStatic(var14.getModifiers());
         if (var2 > 0L) {
            var10000 = var10000 || var14.getEnclosingClass() == null;
         }

         label39: {
            boolean var15 = var10000;
            if (var1 == null) {
               var10000 = var15;
               if (var2 <= 0L) {
                  break label39;
               }

               if (!var15) {
                  var10000 = false;
                  break label39;
               }
            }

            var10000 = true;
         }

         Util67.update(var10000, var6);
      }

      this.ownerType = var1 == null ? null : Util141.getType(var12, var1);
      this.rawType = Util141.getType(var12, var4);
      this.arr_c = (Type[])var5.clone();
      int var17 = 0;
      int var18 = this.arr_c.length;

      while (var17 < var18) {
         Util67.getObject(var8, this.arr_c[var17]);
         Util141.processAll(var10, this.arr_c[var17]);
         this.arr_c[var17] = Util141.getType(var12, this.arr_c[var17]);
         var17++;
         if (var2 <= 0L) {
            break;
         }
      }
   }

   @Override
   public Type[] getActualTypeArguments() {
      return (Type[])this.arr_c.clone();
   }

   @Override
   public Type getRawType() {
      return this.rawType;
   }

   @Override
   public Type getOwnerType() {
      return this.ownerType;
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 115986667586556L;
      long var10001 = var2 ^ 112368220373598L;
      int var4 = (int)((var2 ^ 112368220373598L) >>> 48);
      int var5 = (int)((var2 ^ 112368220373598L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return var1 instanceof ParameterizedType && Util141.checkCondition_2(this, (char)var4, var5, (char)var6, (ParameterizedType)var1);
   }

   @Override
   public int hashCode() {
      long var1 = 12180819508231L;
      long var3 = var1 ^ 101166166630998L;
      return Arrays.hashCode(this.arr_c) ^ this.rawType.hashCode() ^ Util141.getValue(var3, this.ownerType);
   }

   @Override
   public String toString() {
      long var1 = 33145606610601L;
      long var3 = var1 ^ 133725837686839L;
      LicenseState[] var10000 = ConfigMap.values();
      int var5 = this.arr_c.length;
      LicenseState[] var6 = var10000;
      if (var5 == 0) {
         return Util141.getString(var3, this.rawType);
      }

      StringBuilder var7 = new StringBuilder(30 * (var5 + 1));
      var7.append(Util141.getString(var3, this.rawType)).append("<").append(Util141.getString(var3, this.arr_c[0]));
      int var8 = 1;

      while (var8 < var5) {
         var7.append(CONST_E).append(Util141.getString(var3, this.arr_c[var8]));
         var8++;
         if (var6 == null) {
            break;
         }
      }

      return var7.append(">").toString();
   }

   static {
      long var0 = 92241032686502L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("h2\u0092\b\u0019\u0006¢Û".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_E = var5;
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
