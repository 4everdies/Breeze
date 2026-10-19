package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.FunctionProvider;
import rip.breeze.StringDecryptor;

public class GLFunctionProvider implements FunctionProvider {
   private final Method method_a;
   private static final String CONST_C;

   public GLFunctionProvider() {
      long var1 = 64885193179736L;
      super();

      try {
         this.method_a = GLContext.class.getDeclaredMethod(CONST_C, String.class);
         this.method_a.setAccessible(true);
      } catch (Exception var4) {
         throw new RuntimeException(var4);
      }
   }

   @Override
   public long getFunctionAddress(CharSequence var1) {
      try {
         return (Long)this.method_a.invoke(null, var1.toString());
      } catch (Exception var3) {
         throw new RuntimeException(var3);
      }
   }

   @Override
   public long getFunctionAddress(ByteBuffer var1) {
      throw new UnsupportedOperationException();
   }

   static {
      long var0 = 126356832657479L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u001f}\u0015]\u0088IþôêÝ\u000b×Úsþq\u0016\u0000ã\u0096SæôW".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_C = var5;
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
