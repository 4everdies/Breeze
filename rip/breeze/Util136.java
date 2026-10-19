package rip.breeze;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class Util136 {
   private final Map<Object, MethodHandle[]> map_a = new ConcurrentHashMap<>();
   private final Map<ImageUtil15, Util2> map_b = new ConcurrentHashMap<>();
   private static final String CONST_D;

   private Util136() {
   }

   @Override
   public String toString() {
      long var1 = 18114980190672L;
      return String.format(CONST_D, this.map_a);
   }

   public synchronized void calculate(Object var1, Method var2) {
      MethodHandle[] var3;
      if (this.map_a.containsKey(var1)) {
         var3 = new MethodHandle[((MethodHandle[])this.map_a.get(var1)).length + 1];
         System.arraycopy(this.map_a.get(var1), 0, var3, 0, var3.length - 1);
      } else {
         var3 = new MethodHandle[1];
      }

      try {
         var2.setAccessible(true);
         var3[var3.length - 1] = EventBus.getMethodHandles$Lookup().unreflect(var2);
      } catch (IllegalAccessException var5) {
         var5.printStackTrace();
         return;
      }

      this.map_a.put(var1, var3);
   }

   public synchronized void initialize(ImageUtil15 var1, Util2 var2) {
      this.map_b.put(var1, var2);
   }

   public synchronized void decrypt(Object var1) {
      this.map_a.remove(var1);
      this.map_b.remove(var1);
   }

   public synchronized void processAll(CancellableEvent var1) {
      for (Util2 var3 : this.map_b.values()) {
         var3.processAll(var1);
      }

      for (Entry var12 : this.map_a.entrySet()) {
         Object var4 = var12.getKey();

         for (MethodHandle var8 : (MethodHandle[])var12.getValue()) {
            try {
               var8.invoke((Object)var4, (CancellableEvent)var1);
            } catch (Throwable var10) {
               var10.printStackTrace();
            }
         }
      }
   }

   Util136(Lambda15 var1) {
      this();
   }

   static {
      long var0 = 128148931539345L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("U!¼i¼@sÇ7»\u0084\u0018ö\u0011\u009b¯\u00199\u0014¤Úg\u009b¡Ò\u0086 ó×\r\u00ad\u008c".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_D = var5;
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
