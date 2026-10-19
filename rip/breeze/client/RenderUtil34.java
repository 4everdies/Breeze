package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import rip.breeze.StringDecryptor;

final class RenderUtil34 {
   private static final int CONST_A;
   private int fieldInt_b = 0;
   private FloatBuffer floatBuffer_c = BufferUtils.createFloatBuffer(16384);
   private Util128[] arr_d = new Util128[128];
   private int fieldInt_e = 0;
   private int fieldInt_f = 0;
   private static final long[] CONST_H;
   private static final Integer[] CONST_I;
   private static final Map CONST_J = new HashMap(13);
   private static final long eka_1;

   private RenderUtil34() {
   }

   void update() {
      this.fieldInt_e = 0;
      this.fieldInt_f = 0;
      ((Buffer)this.floatBuffer_c).clear();
   }

   void update_1() {
      if (this.fieldInt_b != 0) {
         GL15.glDeleteBuffers(this.fieldInt_b);
         this.fieldInt_b = 0;
      }

      this.floatBuffer_c = null;
      this.arr_d = null;
      this.fieldInt_e = 0;
      this.fieldInt_f = 0;
   }

   void calculate(RenderUtil35 var1, RaytraceResult var2, Color var3) {
      if (var1 != null && var2 != null && var1.isValid()) {
         int var4 = var1.calculate();
         int var5 = var1.calculate_2();
         this.calculate_2(var5);
         this.calculate_3(1);
         int var6 = this.fieldInt_f;
         FloatBuffer var7 = var1.getFloatBuffer_d();
         ((Buffer)var7).flip();
         int var8 = var7.limit();
         ((Buffer)var7).limit(var7.position() + var5);
         this.floatBuffer_c.put(var7);
         ((Buffer)var7).limit(var8);
         ((Buffer)var7).clear();
         int var9 = getValue(var3);
         Util128 var10 = this.arr_d[this.fieldInt_e];
         if (var10 == null) {
            var10 = new Util128(null);
            this.arr_d[this.fieldInt_e] = var10;
         }

         var10.fieldInt_a = var6;
         var10.fieldInt_b = var4;
         var10.fieldInt_c = var2.fieldInt_a;
         var10.fieldInt_d = var9;
         this.fieldInt_e++;
         this.fieldInt_f += var4;
      }
   }

   void processAll() {
      long var1 = 79407203882303L;
      if (this.fieldInt_e != 0 && this.fieldInt_f != 0) {
         if (this.fieldInt_b == 0) {
            this.fieldInt_b = GL15.glGenBuffers();
         }

         ((Buffer)this.floatBuffer_c).flip();
         GL15.glBindBuffer("34962", this.fieldInt_b);
         GL15.glBufferData("34962", this.floatBuffer_c, "35040");
         byte var3 = 16;
         GL11.glEnableClientState("32884");
         GL11.glEnableClientState("32888");
         GL11.glVertexPointer(2, 5126, 16, 0L);
         long var10001 = 3272018227682414500L ^ var1;
         GL11.glTexCoordPointer(2, 5126, 16, 8L);
         int var4 = -1;
         int var5 = ((String)null);

         for (int var6 = 0; var6 < this.fieldInt_e; var6++) {
            Util128 var7 = this.arr_d[var6];
            if (var7 != null && var7.fieldInt_b > 0) {
               if (var7.fieldInt_c != var4) {
                  GL11.glBindTexture(3553, var7.fieldInt_c);
                  var4 = var7.fieldInt_c;
               }

               if (var7.fieldInt_d != var5) {
                  calculate_4(var7.fieldInt_d);
                  var5 = var7.fieldInt_d;
               }

               GL11.glDrawArrays(4, var7.fieldInt_a, var7.fieldInt_b);
            }
         }

         GL11.glDisableClientState("32888");
         GL11.glDisableClientState("32884");
         GL15.glBindBuffer("34962", 0);
         ((Buffer)this.floatBuffer_c).clear();
      }
   }

   private void calculate_2(int var1) {
      if (this.floatBuffer_c.remaining() < var1) {
         int var2 = this.floatBuffer_c.position() + var1;
         int var3 = this.floatBuffer_c.capacity();

         while (var3 < var2) {
            var3 <<= 1;
         }

         FloatBuffer var4 = BufferUtils.createFloatBuffer(var3);
         ((Buffer)this.floatBuffer_c).flip();
         var4.put(this.floatBuffer_c);
         this.floatBuffer_c = var4;
      }
   }

   private void calculate_3(int var1) {
      int var2 = this.fieldInt_e + var1;
      if (var2 > this.arr_d.length) {
         int var3 = this.arr_d.length;

         while (var3 < var2) {
            var3 <<= 1;
         }

         Util128[] var4 = new Util128[var3];
         System.arraycopy(this.arr_d, 0, var4, 0, this.arr_d.length);
         this.arr_d = var4;
      }
   }

   private static int getValue(Color var0) {
      int var1 = var0.getAlpha() & 0xFF;
      int var2 = var0.getRed() & 0xFF;
      int var3 = var0.getGreen() & 0xFF;
      int var4 = var0.getBlue() & 0xFF;
      return var1 << 24 | var2 << 16 | var3 << 8 | var4;
   }

   private static void calculate_4(int var0) {
      float var1 = (var0 >>> 24 & 0xFF) / 255.0F;
      float var2 = (var0 >>> 16 & 0xFF) / 255.0F;
      float var3 = (var0 >>> 8 & 0xFF) / 255.0F;
      float var4 = (var0 & 0xFF) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1);
   }

   RenderUtil34(ConfigMapImpl var1) {
      this();
   }

   static {
      long var0 = 106659183003588L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var4 = new long[9];
      int var5 = 0;
      String var6 = "ÍÕg½÷2[\u0005$\u000e\u000e\u001cè\bW}\u009aDJ\u009eÒÁ\u0083jG\ræåe\b\u0082ïàT\u0084\u0004kR<Aü{X8{n\u0097\u009e\u009d«µmÚaÔ\u0093";
      int var7 = "ÍÕg½÷2[\u0005$\u000e\u000e\u001cè\bW}\u009aDJ\u009eÒÁ\u0083jG\ræåe\b\u0082ïàT\u0084\u0004kR<Aü{X8{n\u0097\u009e\u009d«µmÚaÔ\u0093".length();
      byte var8 = 0;

      label33:
      while (true) {
         int var10001 = var8;
         var8 += 8;
         byte[] var9 = var6.substring(var10001, var8).getBytes("ISO-8859-1");
         long[] var19 = var4;
         var10001 = var5++;
         long var24 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte var28 = -1;

         while (true) {
            long var10 = var24;
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
            long var31 = (var12[0] & 255L) << 56
               | (var12[1] & 255L) << 48
               | (var12[2] & 255L) << 40
               | (var12[3] & 255L) << 32
               | (var12[4] & 255L) << 24
               | (var12[5] & 255L) << 16
               | (var12[6] & 255L) << 8
               | var12[7] & 255L;
            switch (var28) {
               case 0:
                  var19[var10001] = var31;
                  if (var8 >= var7) {
                     CONST_H = var4;
                     CONST_I = new Integer[9];
                     Cipher var13;
                     var10000 = var13 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var14 = 1; var14 < 8; var14++) {
                        var10003[var14] = (byte)(var0 << var14 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var15 = -1036065324888921640L;
                     byte[] var17 = var13.doFinal(
                        new byte[]{
                           (byte)(var15 >>> 56),
                           (byte)(var15 >>> 48),
                           (byte)(var15 >>> 40),
                           (byte)(var15 >>> 32),
                           (byte)(var15 >>> 24),
                           (byte)(var15 >>> 16),
                           (byte)(var15 >>> 8),
                           (byte)var15
                        }
                     );
                     long var27 = (var17[0] & 255L) << 56
                        | (var17[1] & 255L) << 48
                        | (var17[2] & 255L) << 40
                        | (var17[3] & 255L) << 32
                        | (var17[4] & 255L) << 24
                        | (var17[5] & 255L) << 16
                        | (var17[6] & 255L) << 8
                        | var17[7] & 255L;
                     byte var23 = -1;
                     8L = var27;
                     return;
                  }
                  break;
               default:
                  var19[var10001] = var31;
                  if (var8 < var7) {
                     continue label33;
                  }

                  var6 = ">÷ñÊÚ(Y\u0011]U\u009b\u00040\u0011\u0080{";
                  var7 = ">÷ñÊÚ(Y\u0011]U\u009b\u00040\u0011\u0080{".length();
                  var8 = 0;
            }

            byte var22 = var8;
            var8 += 8;
            var9 = var6.substring(var22, var8).getBytes("ISO-8859-1");
            var19 = var4;
            var10001 = var5++;
            var24 = (var9[0] & 255L) << 56
               | (var9[1] & 255L) << 48
               | (var9[2] & 255L) << 40
               | (var9[3] & 255L) << 32
               | (var9[4] & 255L) << 24
               | (var9[5] & 255L) << 16
               | (var9[6] & 255L) << 8
               | var9[7] & 255L;
            var28 = 0;
         }
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30886;
      if (CONST_I[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_H[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_J.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_J.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/fs", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_I[var3] = var15;
      }

      return CONST_I[var3];
   }

   private static int getValue_2(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = decrypt(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getValue_2".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/fs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
