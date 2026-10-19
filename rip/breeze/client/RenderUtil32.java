package rip.breeze.client;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryUtil;
import rip.breeze.StringDecryptor;

public final class RenderUtil32 {
   private static final String[] CONST_B;
   private static final String[] CONST_C;
   private static final Map CONST_D = new HashMap(13);

   private static ByteBuffer getByteBuffer(ByteBuffer var0, int var1) {
      ByteBuffer var2 = BufferUtils.createByteBuffer(var1);
      ((Buffer)var0).flip();
      var2.put(var0);
      return var2;
   }

   public static ByteBuffer getByteBuffer_2(String var0, int var1) throws IOException {
      long var2 = 38271895748134L;
      StringBuilder var10001 = new StringBuilder();
      short var10002 = 32102;
      long var10003 = 2201460133583142402L ^ var2;
      InputStream var4 = BreezeClient.class.getResourceAsStream(var10001.append("/assets/breeze/").append(var0).toString());

      try {
         if (var4 == null) {
            StringBuilder var10 = new StringBuilder();
            short var11 = 8529;
            long var10004 = 5060909976139817524L ^ var2;
            throw new IOException(var10.append("/assets/breeze/").append(var0).toString());
         }
      } catch (IOException var9) {
         throw getIOException(var9);
      }

      ReadableByteChannel var5 = Channels.newChannel(var4);
      ByteBuffer var6 = BufferUtils.createByteBuffer(var1);

      while (true) {
         int var7 = var5.read(var6);

         try {
            if (var7 == -1) {
               break;
            }
         } catch (IOException var8) {
            throw getIOException(var8);
         }

         if (var6.remaining() == 0) {
            var6 = getByteBuffer(var6, var6.capacity() * 3 / 2);
         }
      }

      ((Buffer)var6).flip();
      return MemoryUtil.memSlice(var6);
   }

   static {
      long var0 = 13318878909421L;
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
      String var6 = "ª\u001b\u0011\u001fÒKS\u0004*jÚ¼W\u0081\u0013©\u0019ë+!ØYYL\r½\tÝç\u001cçY(\u0015s8Å°\"\rÜ°\u009e\u0083ñ,×Ì7Êí²\fÞ6D¬\u0096ß?ì7f·Òùö¤ÇY'G\u0087";
      int var7 = "ª\u001b\u0011\u001fÒKS\u0004*jÚ¼W\u0081\u0013©\u0019ë+!ØYYL\r½\tÝç\u001cçY(\u0015s8Å°\"\rÜ°\u009e\u0083ñ,×Ì7Êí²\fÞ6D¬\u0096ß?ì7f·Òùö¤ÇY'G\u0087"
         .length();
      char var8 = ' ';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_B = var4;
            CONST_C = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
      }
   }

   private static IOException getIOException(IOException var0) {
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

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32066;
      if (CONST_C[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_D.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_D.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/fo", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_B[var3].getBytes("ISO-8859-1");
         CONST_C[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_C[var3];
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
         throw new RuntimeException("rip/breeze/client/fo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
