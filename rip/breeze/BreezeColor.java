package rip.breeze;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class BreezeColor extends Color {
   private static final long eka_1;
   public static final Function<String, BreezeColor> CONST_B;
   public static final Function<BreezeColor, String> CONST_C;
   private final boolean fieldBool_d;
   private final float fieldFloat_e;
   private final float fieldFloat_f;
   private static boolean fieldBool_g;
   private static final String[] CONST_I;
   private static final String[] CONST_J;
   private static final Map CONST_K = new HashMap(13);
   private static final long eka_2;
   private static final long[] CONST_M;
   private static final Long[] CONST_N;
   private static final Map CONST_O;

   public static float calculateFloat() {
      long var0 = 24020835915582L;
      return (float)(System.currentTimeMillis() % 5000L) / 5000.0F;
   }

   public BreezeColor(Color var1) {
      this(var1, getValue_6(var1), checkCondition(var1));
   }

   public BreezeColor(Color var1, boolean var2) {
      this(var1, getValue_6(var1), var2);
   }

   public BreezeColor(Color var1, int var2) {
      this(var1, var2, checkCondition(var1));
   }

   public BreezeColor(Color var1, int var2, boolean var3) {
      this(getValue_7(var1), getValue_8(var1), getValue_9(var1), var2, var3);
   }

   public BreezeColor(int var1) {
      this(new Color(var1), 255, false);
   }

   public BreezeColor(int var1, int var2, int var3) {
      this(var1, var2, var3, 255, false);
   }

   public BreezeColor(int var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, false);
   }

   public BreezeColor(int var1, int var2, int var3, int var4, boolean var5) {
      super(var1, var2, var3, var4);
      this.fieldBool_d = var5;
      float[] var6 = Color.RGBtoHSB(var1, var2, var3, null);
      this.fieldFloat_e = var6[1];
      this.fieldFloat_f = var6[2];
   }

   @Override
   public int getRGB() {
      long var1 = 89623348217623L;
      return !this.fieldBool_d ? super.getRGB() : this.getValue_5() << 24 | Color.HSBtoRGB(calculateFloat(), this.fieldFloat_e, this.fieldFloat_f) & (int)-5386434651877277697L;
   }

   public boolean isBool_d() {
      return this.fieldBool_d;
   }

   public int getValue() {
      return super.getRGB();
   }

   public int getValue_2() {
      return this.getValue() >> 16 & 0xFF;
   }

   public int getValue_3() {
      return this.getValue() >> 8 & 0xFF;
   }

   public int getValue_4() {
      return this.getValue() & 0xFF;
   }

   public int getValue_5() {
      return this.getValue() >>> 24 & 0xFF;
   }

   public BreezeColor getDataBuilder9(boolean var1) {
      return new BreezeColor(this.getValue_2(), this.getValue_3(), this.getValue_4(), this.getValue_5(), var1);
   }

   public BreezeColor getDataBuilder9_2(int var1) {
      return new BreezeColor(this.getValue_2(), this.getValue_3(), this.getValue_4(), var1, this.fieldBool_d);
   }

   public String buildString() {
      long var1 = 82868620221157L;
      short var10000 = 18956;
      long var10001 = 853408793291565057L ^ var1;
      return String.format("#%02x%02x%02x", this.getValue_2(), this.getValue_3(), this.getValue_4());
   }

   @Override
   public boolean equals(Object var1) {
      long var2 = 76703155078878L;
      if (var1 instanceof BreezeColor) {
         BreezeColor var4 = (BreezeColor)var1;
         return var4.getValue() == this.getValue() && var4.fieldBool_d == this.fieldBool_d;
      } else {
         return var1 instanceof Color && ((Color)var1).getRGB() == this.getRGB();
      }
   }

   @Override
   public int hashCode() {
      long var1 = 12350775748785L;
      return this.getValue() * 31 + (this.fieldBool_d ? 1 : 0);
   }

   private static int getValue_6(Color var0) {
      long var1 = 107557614452146L;
      return var0 instanceof BreezeColor ? ((BreezeColor)var0).getValue_5() : var0.getAlpha();
   }

   private static boolean checkCondition(Color var0) {
      long var1 = 23266593446359L;
      return var0 instanceof BreezeColor && ((BreezeColor)var0).isBool_d();
   }

   private static int getValue_7(Color var0) {
      long var1 = 92254238696308L;
      return var0 instanceof BreezeColor ? ((BreezeColor)var0).getValue_2() : var0.getRed();
   }

   private static int getValue_8(Color var0) {
      long var1 = 63408801799164L;
      return var0 instanceof BreezeColor ? ((BreezeColor)var0).getValue_3() : var0.getGreen();
   }

   private static int getValue_9(Color var0) {
      long var1 = 28995529909504L;
      return var0 instanceof BreezeColor ? ((BreezeColor)var0).getValue_4() : var0.getBlue();
   }

   private static String lambda$static_Inner1(BreezeColor var0) {
      long var1 = 34075113044138L;
      short var10000 = 29170;
      long var10001 = 3443392718491054513L ^ var1;
      return String.format("(%d,%d,%d,%d,%b)", var0.getValue_2(), var0.getValue_3(), var0.getValue_4(), var0.getValue_5(), var0.isBool_d());
   }

   private static BreezeColor lambda$static_Inner0(String var0) {
      long var1 = 28150173542981L;
      if (var0.startsWith("[") || var0.startsWith("(")) {
         var0 = var0.substring(1);
      }

      if (var0.endsWith("]") || var0.endsWith(")")) {
         var0 = var0.substring(0, var0.length() - 1);
      }

      String[] var3 = var0.split(",");
      if (var3.length == 1) {
         return new BreezeColor(Integer.decode(var3[0]));
      }

      Color var4 = new Color(Integer.decode(var3[0]), Integer.decode(var3[1]), Integer.decode(var3[2]));
      int var5 = var3.length > 3 ? Integer.decode(var3[3]) : 255;
      boolean var6 = var3.length > 4 && Boolean.parseBoolean(var3[4].trim());
      return new BreezeColor(var4, var5, var6);
   }

   static {
      toggle(false);
      long var0 = 57909861037821L;
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
      String var6 = "w\u0082í3FÎÎäö°\u00ad¿D{Mæ3½\u0012\u008aK #¼þhêZÞ¨\u0098L( ¹\u001b«0\u000f\u0012ê\u0088l\u0088\u0015\u0097½\u0006ÎË\nÄw,\u0084¹hi«/·\\Yø\r^\u0007}\u0003\u00189I2";
      int var7 = "w\u0082í3FÎÎäö°\u00ad¿D{Mæ3½\u0012\u008aK #¼þhêZÞ¨\u0098L( ¹\u001b«0\u000f\u0012ê\u0088l\u0088\u0015\u0097½\u0006ÎË\nÄw,\u0084¹hi«/·\\Yø\r^\u0007}\u0003\u00189I2"
         .length();
      char var8 = ' ';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var34 = buildString_2(var10).intern();
         int var10001 = -1;
         var4[var5++] = var34;
         if ((var9 += var8) >= var7) {
            CONST_I = var4;
            CONST_J = new String[2];
            Cipher var11;
            var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var12 = 1; var12 < 8; var12++) {
               var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var13 = -4196335493720457544L;
            byte[] var15 = var11.doFinal(
               new byte[]{
                  (byte)(var13 >>> 56),
                  (byte)(var13 >>> 48),
                  (byte)(var13 >>> 40),
                  (byte)(var13 >>> 32),
                  (byte)(var13 >>> 24),
                  (byte)(var13 >>> 16),
                  (byte)(var13 >>> 8),
                  (byte)var13
               }
            );
            long var37 = (var15[0] & 255L) << 56
               | (var15[1] & 255L) << 48
               | (var15[2] & 255L) << 40
               | (var15[3] & 255L) << 32
               | (var15[4] & 255L) << 24
               | (var15[5] & 255L) << 16
               | (var15[6] & 255L) << 8
               | var15[7] & 255L;
            var10001 = (byte)-1;
            -5386434651877277697L = var37;
            CONST_O = new HashMap(13);
            Cipher var16;
            var10000 = var16 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var17 = 1; var17 < 8; var17++) {
               var10003[var17] = (byte)(var0 << var17 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var18 = new long[2];
            int var19 = 0;
            String var20 = "rEðqÞ\u000f\t±Û¤ù´B¿CÉ";
            int var21 = "rEðqÞ\u000f\t±Û¤ù´B¿CÉ".length();
            byte var22 = 0;

            do {
               var10001 = var22;
               var22 += 8;
               byte[] var23 = var20.substring(var10001, var22).getBytes("ISO-8859-1");
               var10001 = var19++;
               long var24 = (var23[0] & 255L) << 56
                  | (var23[1] & 255L) << 48
                  | (var23[2] & 255L) << 40
                  | (var23[3] & 255L) << 32
                  | (var23[4] & 255L) << 24
                  | (var23[5] & 255L) << 16
                  | (var23[6] & 255L) << 8
                  | var23[7] & 255L;
               byte[] var26 = var16.doFinal(
                  new byte[]{
                     (byte)(var24 >>> 56),
                     (byte)(var24 >>> 48),
                     (byte)(var24 >>> 40),
                     (byte)(var24 >>> 32),
                     (byte)(var24 >>> 24),
                     (byte)(var24 >>> 16),
                     (byte)(var24 >>> 8),
                     (byte)var24
                  }
               );
               long var10004 = (var26[0] & 255L) << 56
                  | (var26[1] & 255L) << 48
                  | (var26[2] & 255L) << 40
                  | (var26[3] & 255L) << 32
                  | (var26[4] & 255L) << 24
                  | (var26[5] & 255L) << 16
                  | (var26[6] & 255L) << 8
                  | var26[7] & 255L;
               byte var41 = -1;
               var18[var10001] = var10004;
            } while (var22 < var21);

            CONST_M = var18;
            CONST_N = new Long[2];
            5000L = ((String)null);
            CONST_B = BreezeColor::lambda$static_Inner0;
            CONST_C = BreezeColor::lambda$static_Inner1;
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   public static void toggle(boolean var0) {
      fieldBool_g = var0;
   }

   public static boolean isValid() {
      return fieldBool_g;
   }

   public static boolean checkCondition_2() {
      boolean var0 = isValid();
      return !var0;
   }

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11736;
      if (CONST_J[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_K.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_K.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/a", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_I[var3].getBytes("ISO-8859-1");
         CONST_J[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_J[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_3(var4, var5);
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
         throw new RuntimeException("rip/breeze/a" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26222;
      if (CONST_N[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_M[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_O.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_O.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/a", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_N[var3] = var14;
      }

      return CONST_N[var3];
   }

   private static long getLong(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = decrypt(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getLong".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/a" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
