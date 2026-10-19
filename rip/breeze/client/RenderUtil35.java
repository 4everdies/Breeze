package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import rip.breeze.StringDecryptor;

final class RenderUtil35 {
   private static final int CONST_A;
   private static final int CONST_B;
   private static final int CONST_C;
   private FloatBuffer floatBuffer_d = BufferUtils.createFloatBuffer(24576);
   private int fieldInt_e;

   void initialize() {
      this.fieldInt_e = 0;
      ((Buffer)this.floatBuffer_d).clear();
   }

   boolean isValid() {
      return this.fieldInt_e > 0;
   }

   int calculate() {
      return this.fieldInt_e * 6;
   }

   int calculate_2() {
      return this.fieldInt_e * 24;
   }

   FloatBuffer getFloatBuffer_d() {
      return this.floatBuffer_d;
   }

   void calculate_3(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.calculate_4(1);
      this.processAll(var1, var2, var5, var6);
      this.processAll(var1, var4, var5, var8);
      this.processAll(var3, var4, var7, var8);
      this.processAll(var1, var2, var5, var6);
      this.processAll(var3, var4, var7, var8);
      this.processAll(var3, var2, var7, var6);
      this.fieldInt_e++;
   }

   void initialize_2() {
      this.floatBuffer_d = null;
      this.fieldInt_e = 0;
   }

   private void processAll(float var1, float var2, float var3, float var4) {
      this.floatBuffer_d.put(var1).put(var2).put(var3).put(var4);
   }

   private void calculate_4(int var1) {
      int var2 = (this.fieldInt_e + var1) * 24;
      if (this.floatBuffer_d.remaining() < var1 * 24) {
         int var3 = this.floatBuffer_d.capacity();

         while (var3 < var2) {
            var3 <<= 1;
         }

         FloatBuffer var4 = BufferUtils.createFloatBuffer(var3);
         ((Buffer)this.floatBuffer_d).flip();
         var4.put(this.floatBuffer_d);
         this.floatBuffer_d = var4;
      }
   }

   static {
      long var0 = StringDecryptor.getIBreezeInterface3(-7659097424001325635L, 6344613127320773447L, MethodHandles.lookup().lookupClass())
            .decryptKey(168479884289837L)
         ^ 52229431419100L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var4 = new long[3];
      int var5 = 0;
      String var6 = "¿©\\mí\u0085$\u001fUæ\u0011Û´\u0081òô\u0085\u0082\u0007ö\u001f<Y\"";
      int var7 = "¿©\\mí\u0085$\u001fUæ\u0011Û´\u0081òô\u0085\u0082\u0007ö\u001f<Y\"".length();
      byte var8 = 0;

      do {
         int var10001 = var8;
         var8 += 8;
         byte[] var9 = var6.substring(var10001, var8).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)(var10 >>> 56),
               (byte)(var10 >>> 48),
               (byte)(var10 >>> 40),
               (byte)(var10 >>> 32),
               (byte)(var10 >>> 24),
               (byte)(var10 >>> 16),
               (byte)(var10 >>> 8),
               (byte)var10
            }
         );
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var14 = -1;
         var4[var10001] = var10004;
      } while (var8 < var7);

      CONST_C = (int)var4[1];
      CONST_B = (int)var4[2];
      CONST_A = (int)var4[0];
   }
}
