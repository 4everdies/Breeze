package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

final class Util138 extends BaseFunction {
   final String string_a;
   final Class class_b;
   final Util33 breezeUtil89_c;
   final Scriptable scriptable_d;
   private static final String[] CONST_F;
   private static final String[] CONST_G;
   private static final Map CONST_H = new HashMap(13);

   Util138(Scriptable var1, Scriptable var2, String var3, Class var4, Util33 var5, Scriptable var6) {
      super(var1, var2);
      this.string_a = var3;
      this.class_b = var4;
      this.breezeUtil89_c = var5;
      this.scriptable_d = var6;
   }

   @Override
   public String getFunctionName() {
      return this.string_a;
   }

   @Override
   public Scriptable construct(Context var1, Scriptable var2, Object[] var3) {
      long var4 = 125796015606681L;

      try {
         Util135 var6 = Util135.getDataBuilder19_2(var1, this.class_b, var3, this.breezeUtil89_c.list_d);
         var6.setParentScope(ScriptableObject.getTopLevelScope(var2));
         var6.setPrototype(this.scriptable_d);
         return var6;
      } catch (InvocationTargetException var7) {
         throw Util135.getRuntimeException_2(
            "Failed to construct" + this.string_a + ":",
            var7.getTargetException()
         );
      } catch (Throwable var8) {
         throw Util135.getRuntimeException_2(
            "Failed to construct" + this.string_a + ":", var8
         );
      }
   }

   @Override
   public Object call(Context var1, Scriptable var2, Scriptable var3, Object[] var4) {
      return this.construct(var1, var2, var4);
   }

   static {
      long var0 = 88937610938342L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "Ü¤9û\u00ad14\u0016\u001f\u0080\u0017DÑ\u009d\u0001\u00ad(ß\u0005o¤>\u0092äÇùî ¦B»\u0012a\u009bõI\u008cú]Ò\t@A\u000bÍWcü\u0092ìô±\u008b\u0098$\u008aL";
      int var7 = "Ü¤9û\u00ad14\u0016\u001f\u0080\u0017DÑ\u009d\u0001\u00ad(ß\u0005o¤>\u0092äÇùî ¦B»\u0012a\u009bõI\u008cú]Ò\t@A\u000bÍWcü\u0092ìô±\u008b\u0098$\u008aL"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_F = var4;
                     CONST_G = new String[4];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "a½\u0089sèÕ\u0090··ãÂ\u0084.\u0081\b\u0016\u0091\u0099Ìµ\u0097d'$æ÷Ü5\u0086ßHu§\u0094òôsí¡ô\u0010\u0016F|j)\u0095×©²\u0006G\u0081py*M";
                  var7 = "a½\u0089sèÕ\u0090··ãÂ\u0084.\u0081\b\u0016\u0091\u0099Ìµ\u0097d'$æ÷Ü5\u0086ßHu§\u0094òôsí¡ô\u0010\u0016F|j)\u0095×©²\u0006G\u0081py*M"
                     .length();
                  var8 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25228;
      if (CONST_G[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_H.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_H.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/E", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_F[var3].getBytes("ISO-8859-1");
         CONST_G[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_G[var3];
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
         throw new RuntimeException("rip/breeze/E" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
