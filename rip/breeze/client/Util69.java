package rip.breeze.client;

import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.StringDecryptor;

public final class Util69 implements IMarker2, Cloneable {
   public static final Util69 CONST_A;
   private double double_b;
   private int fieldInt_c;
   private boolean fieldBool_d;
   private List<aX> list_e;
   private List<aX> list_f;
   private static final long cipher_key_1;

   public Util69() {
      long var1 = 62896353659658L;
      super();
      this.double_b = -1.0;
      this.fieldInt_c = (int)/*CIPHER_KEY_h*/ 0L;
      this.fieldBool_d = true;
      this.list_e = Collections.emptyList();
      this.list_f = Collections.emptyList();
   }

   protected Util69 getClientUtil24() {
      try {
         return (Util69)super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new AssertionError(var2);
      }
   }

   static {
      long var0 = 136080094166220L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -9178154054409467769L;
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
      CONST_A = new Util69();
   }
}
