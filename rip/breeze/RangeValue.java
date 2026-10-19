package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class RangeValue {
   private static final Random CONST_A;
   public static final Function<String, RangeValue> CONST_B;
   public final double double_c;
   public final double double_d;
   public final double double_e;
   public final double double_f;
   private final boolean fieldBool_g;
   private final int fieldInt_h;
   private static String[] arr_i;
   private static final String[] CONST_K;
   private static final String[] CONST_L;
   private static final Map CONST_M = new HashMap(13);

   public static Function<RangeValue, String> getFunction(int var0) {
      return new FuncUtil3(var0);
   }

   public static Predicate<RangeValue> getPredicate(double var0, double var2, double var4) {
      return new BreezePredicate3(var0, var2, var4, null);
   }

   public static Predicate<RangeValue> getPredicate_2(double var0, double var2) {
      return new BreezePredicate3(var0, var2, 0.0, null);
   }

   public static Predicate<RangeValue> getPredicate_3(int var0, int var1) {
      return new BreezePredicate3(var0, var1, 1.0, null);
   }

   public RangeValue(double var1, double var3, double var5) {
      label19: {
         long var7 = 110628508069714L;
         String[] var10000 = values();
         super();
         this.double_d = this.getDouble(var1, 5);
         this.double_c = this.getDouble(var3, 5);
         this.double_e = this.getDouble(var3 - var1, 5);
         this.double_f = this.getDouble(var5, 5);
         String[] var9 = var10000;
         this.fieldBool_g = var5 != 0.0 && var5 % 1.0 == 0.0;
         if (var5 == 0.0) {
            this.fieldInt_h = 0;
            if (var9 == null) {
               break label19;
            }
         }

         this.fieldInt_h = (int)Math.ceil(-Math.log10(var5));
      }

      if (LicenseState.checkCondition()) {
         initialize(new String[5]);
      }
   }

   public RangeValue(double var1, double var3) {
      this(var1, var3, 0.0);
   }

   public RangeValue(double var1) {
      this(var1, var1);
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 136681915079901L;
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof RangeValue)) {
         return false;
      }

      RangeValue var4 = (RangeValue)var1;
      return var4.double_d == this.double_d && var4.double_c == this.double_c && var4.double_f == this.double_f;
   }

   @Override
   public int hashCode() {
      return (int)(this.double_d * 31.0 + this.double_c * 21.0 + this.double_f * 11.0);
   }

   @Override
   public String toString() {
      long var1 = 41808539740144L;
      if (this.fieldBool_g) {
         StringBuilder var3 = new StringBuilder().append("(").append((int)this.double_d);
         short var4 = 17169;
         long var5 = 4352748841553903322L ^ var1;
         return var3.append(", ").append((int)this.double_c).append(")").toString();
      } else {
         StringBuilder var10000 = new StringBuilder().append("(").append(this.double_d);
         short var10001 = 20146;
         long var10002 = 351678773600465784L ^ var1;
         return var10000.append(", ").append(this.double_c).append(")").toString();
      }
   }

   private double getDouble(double var1, int var3) {
      BigDecimal var4 = BigDecimal.valueOf(var1);
      return var4.setScale(var3, RoundingMode.HALF_UP).doubleValue();
   }

   private double getDouble_2(double var1) {
      long var3 = 127773146343376L;
      String[] var5 = values();
      if (this.double_f == 0.0 && !this.fieldBool_g) {
         byte var6 = 1;
         if (var5 == null) {
            return this.getDouble(var1, var6);
         }
      }

      if (this.fieldInt_h <= 0) {
         byte var7 = 0;
         if (var5 == null) {
            return this.getDouble(var1, var7);
         }
      }

      int var8 = this.fieldInt_h;
      return this.getDouble(var1, var8);
   }

   public boolean isValid(double var1) {
      long var3 = 20878145167010L;
      return var1 >= this.double_d && var1 <= this.double_c;
   }

   public double getDouble_3(double var1) {
      long var3 = 30711882820635L;
      if (var1 > this.double_c) {
         return this.double_c;
      } else {
         return var1 < this.double_d ? this.double_d : this.getDouble(var1, 5);
      }
   }

   public double calculateDouble(double var1) {
      long var3 = 94604924250836L;
      if (var1 > this.double_c) {
         return this.double_c;
      } else if (var1 < this.double_d) {
         return this.double_d;
      } else if (this.double_f == 0.0) {
         return this.getDouble_2(var1);
      } else if (this.fieldBool_g) {
         return this.double_f == 1.0 ? Math.round(var1) : Math.round(var1 / this.double_f) * this.double_f;
      } else {
         return this.getDouble_2(Math.round(var1 / this.double_f) * this.double_f);
      }
   }

   public double calculateDouble_2() {
      long var1 = 50659286761903L;
      if (this.fieldBool_g) {
         return (int)(this.double_d + CONST_A.nextInt((int)this.double_e + 1));
      }

      double var3 = this.double_d + CONST_A.nextDouble() * this.double_e;
      return this.double_f == 0.0 ? var3 : this.getDouble_2(var3);
   }

   public double calculateDouble_3(double var1, double var3) {
      long var5 = 13777570433248L;
      if (this.fieldBool_g) {
         return (int)this.getDouble_3(this.double_d + CONST_A.nextInt((int)this.double_e + 1));
      }

      double var7 = this.double_d + this.double_e / 2.0;
      double var9 = this.double_e / 3.0;
      double var11 = var7 + CONST_A.nextGaussian() * var9;
      var11 = this.getDouble_3(var11);
      return this.getDouble_2(var11);
   }

   public RangeValue getDataBuilder39(double var1) {
      return new RangeValue(var1, this.double_c, this.double_f);
   }

   public RangeValue getDataBuilder39_2(double var1) {
      return new RangeValue(this.double_d, var1, this.double_f);
   }

   public RangeValue getDataBuilder39_3(double var1) {
      return new RangeValue(this.double_d, this.double_c, var1);
   }

   private static RangeValue lambda$static_Inner0(String var0) {
      long var1 = 75681730603926L;
      if (var0.startsWith("[") || var0.startsWith("(")) {
         var0 = var0.substring(1);
      }

      if (var0.endsWith("]") || var0.endsWith(")")) {
         var0 = var0.substring(0, var0.length() - 1);
      }

      String[] var3 = var0.split(",");
      return var3.length == 1 ? new RangeValue(Double.parseDouble(var3[0])) : new RangeValue(Double.parseDouble(var3[0]), Double.parseDouble(var3[1]));
   }

   static {
      long var0 = 20109928414574L;
      initialize(null);
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
      String var6 = "\u0003*k¢Åh*Ûì\u001aç\u0094ðx\u0085@\u0010-rÚZØ=t2±!¼è\u0092üÒa";
      int var7 = "\u0003*k¢Åh*Ûì\u001aç\u0094ðx\u0085@\u0010-rÚZØ=t2±!¼è\u0092üÒa".length();
      char var8 = 16;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_K = var4;
            CONST_L = new String[2];
            CONST_A = new Random();
            CONST_B = RangeValue::lambda$static_Inner0;
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   public static void initialize(String[] var0) {
      arr_i = var0;
   }

   public static String[] values() {
      return arr_i;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6715;
      if (CONST_L[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_M.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_M.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cJ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_K[var3].getBytes("ISO-8859-1");
         CONST_L[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_L[var3];
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
         throw new RuntimeException("rip/breeze/cJ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
