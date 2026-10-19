package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptNamespace(name = "time", description = "The time namespace, can be used for retrieving the current epoch time.")
public class Util18 {
   private static final long eka_1;

   @JSFunction(value = "getTimeSeconds", description = "The epoch time in seconds")
   public static long getLong() {
      long var0 = 72913343807854L;
      return System.currentTimeMillis() / 1000L;
   }

   @JSFunction(value = "getTimeMS", description = "The epoch time in milliseconds")
   public static long getLong_2() {
      return System.currentTimeMillis();
   }

   @JSFunction(value = "getTimeNS", description = "The epoch time in nanoseconds")
   public static long getLong_3() {
      return System.nanoTime();
   }

   static {
      long var0 = 6277576737541L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 1484034396802578187L;
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
      1000L = var7;
   }
}
