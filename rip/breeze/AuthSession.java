package rip.breeze;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class AuthSession {
   private final ImageUtil18 dataBuilder41_a;
   private ImageUtil18 dataBuilder41_b;
   private static int fieldInt_c;
   private static final long eka_1;

   public AuthSession() {
      long var1 = 1666872955498L;
      int var10000 = getValue();
      super();
      int var3 = var10000;
      this.dataBuilder41_a = new ImageUtil18().getDataBuilder41_4();
      this.dataBuilder41_b = this.dataBuilder41_a;
      CloudAuthService var8 = BreezeContext.cloudAuthService_h;
      Object[] var10001 = rip.breeze.client.MathUtil8.noArgs();
      Method var10003 = rip.breeze.client.MathUtil8.getMethod_3(-3286586349231684082L, var1);
      Object[] var10002 = var10001;
      CloudAuthService var13 = var8;
      Method var9 = var10003;

      try {
         var10 = (Long)var9.invoke(var13, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      if (var10 != -1L) {
         CloudAuthService var11 = BreezeContext.cloudAuthService_h;
         CloudAuthService var14 = BreezeContext.cloudAuthService_h;
         var10002 = rip.breeze.client.MathUtil8.noArgs();
         Method var10004 = rip.breeze.client.MathUtil8.getMethod_3(-3286586349231684082L, var1);
         Object[] var22 = var10002;
         CloudAuthService var20 = var14;
         Method var15 = var10004;

         try {
            var16 = (Long)var15.invoke(var20, var22);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var10001 = rip.breeze.client.MathUtil8.buildArgs3(var16, this::lambda$new_Inner0, AuthSession::lambda$new_Inner1);
         var10003 = rip.breeze.client.MathUtil8.getMethod_3(-3286222365395820219L, var1);
         var10002 = var10001;
         CloudAuthService var18 = var11;
         Method var12 = var10003;

         try {
            var12.invoke(var18, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }

      if (!LicenseState.isValid_2()) {
         initialize(++var3);
      }
   }

   public void setDataBuilder41_b(ImageUtil18 var1) {
      this.dataBuilder41_b = var1;
   }

   public ImageUtil18 getDataBuilder41_b() {
      return this.dataBuilder41_b;
   }

   public Color getColor(String var1) {
      return this.dataBuilder41_b.getColor_2(var1);
   }

   public float getFloat(String var1) {
      return this.dataBuilder41_b.getFloat(var1);
   }

   public boolean isValid(String var1) {
      return this.dataBuilder41_b.isValid(var1);
   }

   public String getString(String var1) {
      return this.dataBuilder41_b.getString(var1);
   }

   private static void lambda$new_Inner1(String var0) {
      System.out.println(var0);
   }

   private void lambda$new_Inner0(ImageUtil18 var1, StringDecryptHelper3 var2, UserInfo var3) {
      this.setDataBuilder41_b(var1);
   }

   public static void initialize(int var0) {
      fieldInt_c = var0;
   }

   public static int getValue() {
      return fieldInt_c;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 82 : 0;
   }

   static {
      long var0 = 60549751607623L;
      initialize(110);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 9192515314361823830L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)(var4 >>> 56),
            (byte)(var4 >>> 48),
            (byte)(var4 >>> 40),
            (byte)(var4 >>> 32),
            (byte)(var4 >>> 24),
            (byte)(var4 >>> 16),
            (byte)(var4 >>> 8),
            (byte)var4
         }
      );
      long var7 = (var6[0] & 255L) << 56
         | (var6[1] & 255L) << 48
         | (var6[2] & 255L) << 40
         | (var6[3] & 255L) << 32
         | (var6[4] & 255L) << 24
         | (var6[5] & 255L) << 16
         | (var6[6] & 255L) << 8
         | var6[7] & 255L;
      byte var10001 = -1;
      -1L = var7;
   }
}
