package rip.breeze.client;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

final class Util58 implements WildcardType, Serializable {
   private final Type type_a;
   private final Type type_b;
   private static final long serialVersionUID = 0L;
   private static final String[] CONST_D;
   private static final String[] CONST_E;
   private static final Map CONST_F = new HashMap(13);

   public Util58(Type[] var1, Type[] var2, long var3) {
      var3 = 5446718796286L ^ var3;
      long var5 = var3 ^ 6481481789228L;
      long var7 = var3 ^ 96769514135339L;
      long var9 = var3 ^ 36859952363943L;
      long var11 = var3 ^ 33655451941622L;
      super();
      Util67.update(var2.length <= 1, var5);
      int var10000 = var1.length;
      if (var3 > 0L) {
         var10000 = var10000 == 1 ? 1 : 0;
      }

      Util67.update((boolean)var10000, var5);
      Type[] var14 = var2;
      if (var3 >= 0L) {
         if (var2.length == 1) {
            Util67.getObject(var7, var2[0]);
            Util141.processAll(var9, var2[0]);
            Util67.update(var1[0] == Object.class, var5);
            this.type_b = Util141.getType(var11, var2[0]);
            this.type_a = Object.class;
            if (var3 >= 0L) {
               return;
            }
         }

         Util67.getObject(var7, var1[0]);
         var14 = var1;
      }

      Util141.processAll(var9, var14[0]);
      this.type_b = null;
      this.type_a = Util141.getType(var11, var1[0]);
   }

   @Override
   public Type[] getUpperBounds() {
      return new Type[]{this.type_a};
   }

   @Override
   public Type[] getLowerBounds() {
      long var1 = 20070367027612L;
      return this.type_b != null ? new Type[]{this.type_b} : Util141.CONST_A;
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 100164904571507L;
      long var10001 = var2 ^ 107529183339883L;
      int var4 = (int)((var2 ^ 107529183339883L) >>> 48);
      int var5 = (int)((var2 ^ 107529183339883L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return var1 instanceof WildcardType && Util141.checkCondition_2(this, (char)var4, var5, (char)var6, (WildcardType)var1);
   }

   @Override
   public int hashCode() {
      long var1 = 36517741509457L;
      return (this.type_b != null ? 31 + this.type_b.hashCode() : 1) ^ 31 + this.type_a.hashCode();
   }

   @Override
   public String toString() {
      long var1 = 39905283593486L;
      long var3 = var1 ^ 130205789979946L;
      if (this.type_b != null) {
         return buildString_2(7928, 725529195737632230L ^ var1) + Util141.getString(var3, this.type_b);
      } else {
         return this.type_a == Object.class ? "?" : buildString_2(24425, 5493590172425292918L ^ var1) + Util141.getString(var3, this.type_a);
      }
   }

   static {
      long var0 = 2081716261821L;
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
      String var6 = "à+\u008fSvI9\u001bù¥Xo\u0088\u009d\u0089¾iv\u000f·Cm¢ª\u0018Â\u008fJ\u0019[òô¼íà\u001aP\u001b\u0015Ã«?\u00152óÑ\"Xµ";
      int var7 = "à+\u008fSvI9\u001bù¥Xo\u0088\u009d\u0089¾iv\u000f·Cm¢ª\u0018Â\u008fJ\u0019[òô¼íà\u001aP\u001b\u0015Ã«?\u00152óÑ\"Xµ".length();
      char var8 = 24;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_D = var4;
            CONST_E = new String[2];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14318;
      if (CONST_E[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_F.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_F.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/bS", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_D[var3].getBytes("ISO-8859-1");
         CONST_E[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_E[var3];
   }
}
