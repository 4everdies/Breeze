package rip.breeze.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import rip.breeze.StringDecryptor;

public class FontManager {
   private final int fieldInt_a;
   private final Map<String, Integer> map_b;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);
   private static final long[] CONST_K;
   private static final Integer[] CONST_L;
   private static final Map CONST_M;

   public FontManager(String var1, String var2) {
      long var3 = 65716905740120L;
      super();
      this.map_b = new HashMap<>();
      int var5 = GL20.glCreateProgram();

      try {
         short var10002 = 22557;
         long var10003 = 1873339959529807982L ^ var3;
         int var6 = this.getValue_2(
            FontManager.class.getResourceAsStream(String.format("/assets/breeze/shaders/%s", var1)), -1790066169
         );
         GL20.glAttachShader(var5, var6);
         var10002 = 16208;
         var10003 = 4736662010296092449L ^ var3;
         int var7 = this.getValue_2(
            FontManager.class.getResourceAsStream(String.format("/assets/breeze/shaders/%s", var2)), -1820749779
         );
         GL20.glAttachShader(var5, var7);
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      GL20.glLinkProgram(var5);
      int var10 = GL20.glGetProgrami(var5, 1046854744);

      try {
         if (var10 == 0) {
            short var12 = 1902;
            long var14 = 3663705918262476574L ^ var3;
            throw new IllegalStateException("/assets/breeze/shaders/%s");
         }
      } catch (Exception var9) {
         throw getThrowable(var9);
      }

      this.fieldInt_a = var5;
   }

   public FontManager(String var1) {
      long var2 = 1589280418602L;
      short var10002 = 24252;
      long var10003 = 3523112209328016059L ^ var2;
      this(var1, "vertex.vsh");
   }

   public static int[] values() {
      long var0 = 26347959635902L;
      int var2 = GL11.glGetInteger(36006);
      IntBuffer var3 = BufferUtils.createIntBuffer(16);
      GL11.glGetInteger(2978, var3);
      return new int[]{var2, var3.get(0), var3.get(1), var3.get(2), var3.get(3)};
   }

   public static void render(int[] var0) {
      long var1 = 42448947346940L;
      GL30.glBindFramebuffer(-415521743, var0[0]);
      GL11.glViewport(var0[1], var0[2], var0[3], var0[4]);
   }

   public void initialize() {
      GL20.glUseProgram(this.fieldInt_a);
   }

   public void bind() {
      GL20.glUseProgram(0);
   }

   public int getValue(String var1) {
      Integer var2 = this.map_b.get(var1);

      try {
         if (var2 != null) {
            return var2;
         }
      } catch (IllegalStateException var4) {
         throw getThrowable(var4);
      }

      int var3 = GL20.glGetUniformLocation(this.fieldInt_a, var1);
      this.map_b.put(var1, var3);
      return var3;
   }

   public void drawString(String var1, float... var2) {
      int var3 = this.getValue(var1);

      try {
         if (var3 < 0) {
            return;
         }
      } catch (IllegalStateException var4) {
         throw getThrowable(var4);
      }

      label46: {
         label47: {
            try {
               switch (var2.length) {
                  case 1:
                     GL20.glUniform1f(var3, var2[0]);
                     return;
                  case 2:
                     break label46;
                  case 3:
                     break label47;
                  case 4:
                     break;
                  default:
                     return;
               }
            } catch (IllegalStateException var5) {
               throw getThrowable(var5);
            }

            GL20.glUniform4f(var3, var2[0], var2[1], var2[2], var2[3]);
            return;
         }

         GL20.glUniform3f(var3, var2[0], var2[1], var2[2]);
         return;
      }

      GL20.glUniform2f(var3, var2[0], var2[1]);
   }

   public void drawString(String var1, int... var2) {
      int var3 = this.getValue(var1);

      try {
         if (var3 < 0) {
            return;
         }
      } catch (IllegalStateException var4) {
         throw getThrowable(var4);
      }

      try {
         if (var2.length > 1) {
            GL20.glUniform2i(var3, var2[0], var2[1]);
            return;
         }
      } catch (IllegalStateException var5) {
         throw getThrowable(var5);
      }

      GL20.glUniform1i(var3, var2[0]);
   }

   public void drawString(String var1, FloatBuffer var2) {
      int var3 = this.getValue(var1);

      try {
         if (var3 < 0) {
            return;
         }
      } catch (IllegalStateException var4) {
         throw getThrowable(var4);
      }

      GL20.glUniform1(var3, var2);
   }

   public static void calculate() {
      ScaledResolution var0 = new ScaledResolution(BreezeClient.CONST_A);
      float var1 = (float)BreezeClient.CONST_A.displayWidth / var0.getScaleFactor();
      float var2 = (float)BreezeClient.CONST_A.displayHeight / var0.getScaleFactor();
      GL11.glBegin(7);
      GL11.glTexCoord2f(0.0F, 1.0F);
      GL11.glVertex2f(0.0F, 0.0F);
      GL11.glTexCoord2f(0.0F, 0.0F);
      GL11.glVertex2f(0.0F, var2);
      GL11.glTexCoord2f(1.0F, 0.0F);
      GL11.glVertex2f(var1, var2);
      GL11.glTexCoord2f(1.0F, 1.0F);
      GL11.glVertex2f(var1, 0.0F);
      GL11.glEnd();
   }

   public void calculate_2(Framebuffer var1) {
      double var2 = BreezeClient.CONST_A.displayWidth;
      double var4 = BreezeClient.CONST_A.displayHeight;
      GlStateManager.enableTexture2D();
      GlStateManager.enableAlpha();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      var1.bindFramebufferTexture();
      double var6 = (double)var1.framebufferWidth / var1.framebufferTextureWidth;
      double var8 = (double)var1.framebufferHeight / var1.framebufferTextureHeight;
      GL11.glBegin(7);
      GL11.glTexCoord2d(0.0, 0.0);
      GL11.glVertex2d(0.0, var4);
      GL11.glTexCoord2d(var6, 0.0);
      GL11.glVertex2d(var2, var4);
      GL11.glTexCoord2d(var6, var8);
      GL11.glVertex2d(var2, 0.0);
      GL11.glTexCoord2d(0.0, var8);
      GL11.glVertex2d(0.0, 0.0);
      GL11.glEnd();
      var1.unbindFramebufferTexture();
   }

   private int getValue_2(InputStream var1, int var2) {
      long var3 = 131132968836778L;
      int var5 = GL20.glCreateShader(var2);

      try {
         GL20.glShaderSource(var5, buildString(var1));
         GL20.glCompileShader(var5);
         if (GL20.glGetShaderi(var5, 195229317) == 0) {
            System.out.println(GL20.glGetShaderInfoLog(var5, 4096));
            throw new IllegalStateException(String.format("Shader (%s) failed to compile!", var2));
         } else {
            return var5;
         }
      } catch (IllegalStateException var6) {
         throw getThrowable(var6);
      }
   }

   public static String buildString(InputStream var0) {
      StringBuilder var1 = new StringBuilder();

      try {
         BufferedReader var2 = new BufferedReader(new InputStreamReader(var0));
         Throwable var3 = null;

         try {
            while (true) {
               String var4;
               String var10000 = var4 = var2.readLine();

               try {
                  if (var10000 == null) {
                     break;
                  }

                  var1.append(var4).append('\n');
               } catch (Throwable var17) {
                  throw getThrowable(var17);
               }
            }
         } catch (Throwable var18) {
            var3 = var18;
            throw var18;
         } finally {
            label89: {
               label88: {
                  try {
                     if (var2 == null) {
                        break label89;
                     }

                     if (var3 == null) {
                        break label88;
                     }
                  } catch (Throwable var16) {
                     throw getThrowable(var16);
                  }

                  try {
                     var2.close();
                  } catch (Throwable var15) {
                     var3.addSuppressed(var15);
                  }
                  break label89;
               }

               var2.close();
            }
         }
      } catch (Exception var20) {
         var20.printStackTrace();
      }

      return var1.toString();
   }

   static {
      long var0 = 90235595106410L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[5];
      int var5 = 0;
      String var6 = "6\u0086\u0086\u0007Zl5IvÓSi\u000eS¬kÏ*Qb÷ÊË¹[\u0091Wí²\u0006¦\u001eÔ1âo\u0015\u0018`\u001d\u008b²\u0094biÈI)0Y3ê~r\u0085`(Ê¢\u009f E\u0011ÌL\u0082lJ\u009e\u0093 5Ó$i¯\fÉ'oÐcj\u0011´Ì\u0019±h+qºé«}¾»0ävÜº\u0001RväNó\u0092áÃ\u009c\u0084\u008fð\u0091Fr±W\u009b\u0015B\u000b\u0003\u0086C4\u0019ÚÉf¢8ÁbK\u0097a^ÉÞ\u0004ÃÆ\u008c";
      int var7 = "6\u0086\u0086\u0007Zl5IvÓSi\u000eS¬kÏ*Qb÷ÊË¹[\u0091Wí²\u0006¦\u001eÔ1âo\u0015\u0018`\u001d\u008b²\u0094biÈI)0Y3ê~r\u0085`(Ê¢\u009f E\u0011ÌL\u0082lJ\u009e\u0093 5Ó$i¯\fÉ'oÐcj\u0011´Ì\u0019±h+qºé«}¾»0ävÜº\u0001RväNó\u0092áÃ\u009c\u0084\u008fð\u0091Fr±W\u009b\u0015B\u000b\u0003\u0086C4\u0019ÚÉf¢8ÁbK\u0097a^ÉÞ\u0004ÃÆ\u008c"
         .length();
      char var8 = '8';
      int var23 = -1;

      label54:
      while (true) {
         String var25 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var36;
                  if ((var23 += var8) >= var7) {
                     CONST_E = var4;
                     CONST_F = new String[5];
                     CONST_M = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[6];
                     int var14 = 0;
                     String var15 = "]\u000eÓù\u008aGßïâa\t\u00ad&¶\u001fÈþó\u008fý<ôÒ\u008fÒJN1\u008fÑ¬÷";
                     int var16 = "]\u000eÓù\u008aGßïâa\t\u00ad&¶\u001fÈþó\u008fý<ôÒ\u008fÒJN1\u008fÑ¬÷".length();
                     byte var17 = 0;

                     label36:
                     while (true) {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        long[] var28 = var13;
                        var10001 = var14++;
                        long var40 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var19 = var40;
                           byte[] var21 = var11.doFinal(
                              new byte[]{
                                 (byte)(var19 >>> 56),
                                 (byte)(var19 >>> 48),
                                 (byte)(var19 >>> 40),
                                 (byte)(var19 >>> 32),
                                 (byte)(var19 >>> 24),
                                 (byte)(var19 >>> 16),
                                 (byte)(var19 >>> 8),
                                 (byte)var19
                              }
                           );
                           long var45 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var17 >= var16) {
                                    CONST_K = var13;
                                    CONST_L = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = ";\u001eHRÊ¥}\u0084?×/\u001b\u0080J\u0084\u008e";
                                 var16 = ";\u001eHRÊ¥}\u0084?×/\u001b\u0080J\u0084\u008e".length();
                                 var17 = 0;
                           }

                           byte var34 = var17;
                           var17 += 8;
                           var18 = var15.substring(var34, var17).getBytes("ISO-8859-1");
                           var28 = var13;
                           var10001 = var14++;
                           var40 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var36;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label54;
                  }

                  var6 = "~õ\u001bíø¸Û\u0099¨\u008b\u007f\u0012°9·4Ø]\u0080P\u000e¦üóÀYq\u0010#ß&UØÀÑ)\u001e¦Üèï\t¡\u0005Ô\u0081\t\u0087 #é\u0095\b}\u0080\u0083I\u008c\u0016L\u0013Ô\u009b¦\u00adº>Í·\u0081+\u0000y\u0007\u0018F¡\tð¢;";
                  var7 = "~õ\u001bíø¸Û\u0099¨\u008b\u007f\u0012°9·4Ø]\u0080P\u000e¦üóÀYq\u0010#ß&UØÀÑ)\u001e¦Üèï\t¡\u0005Ô\u0081\t\u0087 #é\u0095\b}\u0080\u0083I\u008c\u0016L\u0013Ô\u009b¦\u00adº>Í·\u0081+\u0000y\u0007\u0018F¡\tð¢;"
                     .length();
                  var8 = '0';
                  var23 = -1;
            }

            var25 = var6.substring(++var23, var23 + var8);
            var10001 = 0;
         }
      }
   }

   private static Throwable getThrowable(Throwable var0) {
      return var0;
   }

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32553;
      if (CONST_F[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_G.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_G.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/fI", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_E[var3].getBytes("ISO-8859-1");
         CONST_F[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_F[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_3(var4, var5);
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
         throw new RuntimeException("rip/breeze/client/fI" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2453;
      if (CONST_L[var3] == null) {
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
         long var5 = CONST_K[var3];
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
         Object[] var9 = (Object[])CONST_M.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_M.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/fI", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_L[var3] = var15;
      }

      return CONST_L[var3];
   }

   private static int getValue_3(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = decrypt(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getValue_3".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/fI" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
