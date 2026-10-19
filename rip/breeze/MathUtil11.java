package rip.breeze;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

final class MathUtil11 extends BaseFunction {
   private final String string_a;
   private final List<Util37> list_b = new ArrayList<>();
   private static final String CONST_D;

   MathUtil11(String var1, Scriptable var2) {
      this.string_a = var1;
      this.setParentScope(var2);
      this.setPrototype(ScriptableObject.getFunctionPrototype(var2));
   }

   void processAll(MethodHandle var1, Class<?>[] var2) {
      this.list_b.add(new Util37(var1, var2));
   }

   @Override
   public String getFunctionName() {
      return this.string_a;
   }

   @Override
   public int getLength() {
      int var1 = 0;

      for (Util37 var3 : this.list_b) {
         if (var3.arr_b.length > var1) {
            var1 = var3.arr_b.length;
         }
      }

      return var1;
   }

   @Override
   public Object call(Context var1, Scriptable var2, Scriptable var3, Object[] var4) {
      long var5 = 108058934626808L;

      try {
         if (this.list_b.isEmpty()) {
            throw Context.reportRuntimeError(CONST_D + this.string_a);
         }
      } catch (Throwable var13) {
         throw getThrowable(var13);
      }

      int[] var7 = new int[this.list_b.size()];
      int var8 = 0;

      try {
         while (var8 < this.list_b.size()) {
            var7[var8] = this.list_b.get(var8).arr_b.length;
            var8++;
         }
      } catch (Throwable var12) {
         throw getThrowable(var12);
      }

      Util37 var14 = this.list_b.get(Util35.getValue(var4.length, var7));

      try {
         Object[] var9 = Util35.castArray(var4, var14.arr_b);
         Object var10 = (Object)var14.methodHandle_a.invokeExact(var9);
         return Util35.getObject(var10);
      } catch (Throwable var11) {
         throw Context.throwAsScriptRuntimeEx(var11);
      }
   }

   static {
      long var0 = 5397309638014L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("½x\u009bÓ¾>\u0092ì)\u00ad\u0010xMùÏÃAá\u000bÕ\u0083Ë'\u008a".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_D = var5;
   }

   private static Throwable getThrowable(Throwable var0) {
      return var0;
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
