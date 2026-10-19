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

public class Util134 {
   public final float fieldFloat_a;
   public final float fieldFloat_b;
   private static String[] arr_c;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);

   public Util134(float var1, float var2) {
      this.fieldFloat_a = var1;
      this.fieldFloat_b = var2;
   }

   public Util134() {
      this(0.0F, 0.0F);
   }

   public Util134 getDataBuilder113(Util134 var1) {
      return new Util134(this.fieldFloat_a + var1.fieldFloat_a, this.fieldFloat_b + var1.fieldFloat_b);
   }

   public Util134 getDataBuilder113_2(Util134 var1) {
      return new Util134(this.fieldFloat_a - var1.fieldFloat_a, this.fieldFloat_b - var1.fieldFloat_b);
   }

   public Util134 getDataBuilder113_3(float var1) {
      return new Util134(this.fieldFloat_a * var1, this.fieldFloat_b * var1);
   }

   public Util134 getDataBuilder113_4(float var1) {
      return new Util134(this.fieldFloat_a / var1, this.fieldFloat_b / var1);
   }

   public float calcDistance() {
      return (float)Math.sqrt(this.fieldFloat_a * this.fieldFloat_a + this.fieldFloat_b * this.fieldFloat_b);
   }

   public Util134 getDataBuilder113_5() {
      long var1 = 67821006963057L;
      float var3 = this.calcDistance();
      return var3 != 0.0F ? this.getDataBuilder113_4(var3) : new Util134(this.fieldFloat_a, this.fieldFloat_b);
   }

   public float calculateFloat(Util134 var1) {
      return this.fieldFloat_a * var1.fieldFloat_a + this.fieldFloat_b * var1.fieldFloat_b;
   }

   public float calcDistance_2(Util134 var1) {
      float var2 = this.fieldFloat_a - var1.fieldFloat_a;
      float var3 = this.fieldFloat_b - var1.fieldFloat_b;
      return (float)Math.sqrt(var2 * var2 + var3 * var3);
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 113528458673089L;
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Util134 var4 = (Util134)var1;
         return Float.compare(var4.fieldFloat_a, this.fieldFloat_a) == 0 && Float.compare(var4.fieldFloat_b, this.fieldFloat_b) == 0;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      long var1 = 123203364389739L;
      return "Vector2f{x=" + this.fieldFloat_a + ", y=" + this.fieldFloat_b + '}';
   }

   public static void initialize(String[] var0) {
      arr_c = var0;
   }

   public static String[] decrypt() {
      return arr_c;
   }

   static {
      String[] var10000 = new String[5];
      long var0 = 59382392555343L;
      initialize(var10000);
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
      String var6 = "4_ú%·Åü\u000fátý\u009bÙZ.\u0080 S\u0017iÐë,Ø#JH?¶\u0095&Rð^\u001f'ò.e®©mÚÙ°0\u0015e\u0086";
      int var7 = "4_ú%·Åü\u000fátý\u009bÙZ.\u0080 S\u0017iÐë,Ø#JH?¶\u0095&Rð^\u001f'ò.e®©mÚÙ°0\u0015e\u0086".length();
      char var8 = 16;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var14 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var14;
         if ((var9 += var8) >= var7) {
            CONST_E = var4;
            CONST_F = new String[2];
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28542;
      if (CONST_F[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_G.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_G.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/eX", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_E[var3].getBytes("ISO-8859-1");
         CONST_F[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_F[var3];
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
         throw new RuntimeException("rip/breeze/eX" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
