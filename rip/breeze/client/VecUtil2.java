package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.Vec3;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

public class VecUtil2 {
   Vec3 vec3_a;
   Vec3 vec3_b;
   Vec3 vec3_c;
   int fieldInt_d;
   Util133 dataBuilder112_e = new Util133();
   boolean fieldBool_f;
   private static final long cipher_key_1;

   public VecUtil2(Vec3 var1, Vec3 var2, Vec3 var3, int var4) {
      this.vec3_a = var2;
      this.vec3_b = var1;
      this.vec3_c = var3;
      this.fieldInt_d = var4;
   }

   public void update(double var1, double var3, double var5, boolean var7) {
      long var8 = 36190702286089L;
      if (var7) {
         this.dataBuilder112_e.getDataBuilder112();
      }

      this.fieldBool_f = var7;
      this.vec3_a = new Vec3(var1, var3, var5);
      this.fieldInt_d = (int)/*CIPHER_KEY_h*/ 0L;
   }

   public void calculate() {
      long var1 = 8764366261318L;
      this.vec3_c = this.vec3_b;
      if (this.fieldInt_d > 0) {
         double var3 = this.vec3_b.xCoord + (this.vec3_a.xCoord - this.vec3_b.xCoord) / this.fieldInt_d;
         double var5 = this.vec3_b.yCoord + (this.vec3_a.yCoord - this.vec3_b.yCoord) / this.fieldInt_d;
         double var7 = this.vec3_b.zCoord + (this.vec3_a.zCoord - this.vec3_b.zCoord) / this.fieldInt_d;
         this.vec3_b = new Vec3(var3, var5, var7);
         this.fieldInt_d--;
      }
   }

   static {
      long var0 = 104946517332495L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -902937653956346507L;
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
      /*CIPHER_KEY_h*/ 0L = var7;
   }
}
