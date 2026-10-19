package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import rip.breeze.StringDecryptor;

public final class ItemColorExtractor {
   private static final ConcurrentHashMap<Long, Integer> CONST_A;
   private static final int CONST_B = -1;
   private static final int CONST_C;
   private static final float CONST_D = 0.2F;
   private static int[] arr_e;
   private static int fieldInt_f;
   private static int fieldInt_g;
   private static final long[] CONST_I;
   private static final Integer[] CONST_J;
   private static final Map CONST_K = new HashMap(13);
   private static final long[] CONST_L;
   private static final Long[] CONST_M;
   private static final Map CONST_N;

   private ItemColorExtractor() {
   }

   public static int getValue(ItemStack var0) {
      long var1 = 65081333442673L;
      if (var0 != null && var0.getItem() != null) {
         long var3 = (long)Item.getIdFromItem(var0.getItem()) << 16 | var0.getMetadata() & "-632903259";
         Integer var5 = CONST_A.get(var3);
         if (var5 != null) {
            return var5;
         }

         int var6 = getValue_2(var0);
         if (var6 != -1) {
            CONST_A.put(var3, var6);
         }

         return var6;
      } else {
         return -1;
      }
   }

   private static int getValue_2(ItemStack var0) {
      try {
         IBakedModel var1 = BreezeClient.CONST_A.getRenderItem().getItemModelMesher().getItemModel(var0);
         if (var1 == null) {
            return -1;
         }

         TextureAtlasSprite var2 = var1.getParticleTexture();
         if (var2 == null) {
            return -1;
         }

         int var3 = getValue_3(var2);
         return var3 != -1 ? var3 : calculate(var2);
      } catch (Throwable var4) {
         return -1;
      }
   }

   private static int getValue_3(TextureAtlasSprite param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 0
      // 02: invokevirtual net/minecraft/client/renderer/texture/TextureAtlasSprite.getFrameTextureData (I)[[I
      // 05: astore 1
      // 06: aload 1
      // 07: ifnonnull 0c
      // 0a: bipush -1
      // 0b: ireturn
      // 0c: aload 1
      // 0d: astore 2
      // 0e: aload 2
      // 0f: arraylength
      // 10: istore 3
      // 11: bipush 0
      // 12: istore 4
      // 14: iload 4
      // 16: iload 3
      // 17: if_icmpge 4f
      // 1a: aload 2
      // 1b: iload 4
      // 1d: aaload
      // 1e: astore 5
      // 20: aload 5
      // 22: ifnull 49
      // 25: aload 5
      // 27: arraylength
      // 28: ifne 39
      // 2b: goto 32
      // 2e: invokestatic rip/breeze/client/ItemColorExtractor.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: goto 49
      // 35: invokestatic rip/breeze/client/ItemColorExtractor.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 5
      // 3b: invokestatic rip/breeze/client/ItemColorExtractor.clamp ([I)I
      // 3e: istore 6
      // 40: iload 6
      // 42: bipush -1
      // 43: if_icmpeq 49
      // 46: iload 6
      // 48: ireturn
      // 49: iinc 4 1
      // 4c: goto 14
      // 4f: bipush -1
      // 50: ireturn
      // 51: astore 1
      // 52: bipush -1
      // 53: ireturn
      // try (0 -> 7): 45 java/lang/Throwable
      // try (24 -> 31): 31 java/lang/Throwable
      // try (22 -> 27): 28 java/lang/Throwable
      // try (8 -> 40): 45 java/lang/Throwable
      // try (41 -> 44): 45 java/lang/Throwable
   }

   private static int calculate(TextureAtlasSprite var0) {
      int[] var1 = values();
      if (var1 == null) {
         return -1;
      }

      int var2 = var0.getOriginX();
      int var3 = var0.getOriginY();
      int var4 = var0.getIconWidth();
      int var5 = var0.getIconHeight();
      if (var4 > 0 && var5 > 0) {
         if (var2 >= 0 && var3 >= 0 && var2 + var4 <= fieldInt_f && var3 + var5 <= fieldInt_g) {
            int[] var6 = new int[var4 * var5];
            int var7 = 0;

            for (int var8 = var3; var8 < var3 + var5; var8++) {
               int var9 = var8 * fieldInt_f;

               for (int var10 = var2; var10 < var2 + var4; var10++) {
                  var6[var7++] = var1[var9 + var10];
               }
            }

            return clamp(var6);
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   private static int clamp(int[] var0) {
      long var1 = 9116530377837L;
      int var3 = var0.length;
      int[] var4 = new int[var3];
      float[] var5 = new float[var3];
      int var6 = 0;

      for (int var10 : var0) {
         int var11 = var10 >>> 24 & 0xFF;
         if (var11 >= 16) {
            int var12 = var10 >>> 16 & 0xFF;
            int var13 = var10 >>> 8 & 0xFF;
            int var14 = var10 & 0xFF;
            int var15 = Math.max(var12, Math.max(var13, var14));
            int var16 = Math.min(var12, Math.min(var13, var14));
            float var17 = var15 / 255.0F;
            float var18 = var15 == 0 ? 0.0F : (float)(var15 - var16) / var15;
            var4[var6] = var10;
            var5[var6] = var18 * var17;
            var6++;
         }
      }

      if (var6 == 0) {
         return -1;
      }

      float[] var42 = Arrays.copyOf(var5, var6);
      Arrays.sort(var42);
      int var43 = Math.max(1, Math.round(var6 * 0.2F));
      float var44 = var42[var6 - var43];
      long var19 = 0L;
      long var21 = 0L;
      long var23 = 0L;
      int var45 = 0;

      for (int var46 = 0; var46 < var6; var46++) {
         if (!(var5[var46] < var44)) {
            int var48 = var4[var46];
            var19 += var48 >>> 16 & 0xFF;
            var21 += var48 >>> 8 & 0xFF;
            var23 += var48 & 0xFF;
            var45++;
         }
      }

      if (var45 == 0) {
         return -1;
      }

      int var47 = (int)(var19 / var45);
      int var49 = (int)(var21 / var45);
      long var10002 = 3480103854662890772L ^ var1;
      int var25 = (int)(var23 / var45);
      int var26 = ((String)null) | var47 << 16 | var49 << 8 | var25;
      long var27 = "-1764968863";

      for (int var29 = 0; var29 < var6; var29++) {
         if (!(var5[var29] < var44)) {
            int var30 = var4[var29];
            int var31 = var30 >>> 16 & 0xFF;
            int var32 = var30 >>> 8 & 0xFF;
            int var33 = var30 & 0xFF;
            long var34 = var31 - var47;
            long var36 = var32 - var49;
            long var38 = var33 - var25;
            long var40 = var34 * var34 + var36 * var36 + var38 * var38;
            if (var40 < var27) {
               var27 = var40;
               var26 = "-16777216" | var31 << 16 | var32 << 8 | var33;
            }
         }
      }

      return var26;
   }

   private static int[] values() {
      try {
         if (arr_e != null) {
            return arr_e;
         }
      } catch (Throwable var12) {
         throw getThrowable(var12);
      }

      try {
         BreezeClient.CONST_A.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
         int var0 = GL11.glGetTexLevelParameteri(3553, 0, 4096);
         int var1 = GL11.glGetTexLevelParameteri(3553, 0, 4097);

         try {
            if (var0 <= 0 || var1 <= 0) {
               return null;
            }
         } catch (Throwable var10) {
            throw getThrowable(var10);
         }

         ByteBuffer var2 = BufferUtils.createByteBuffer(var0 * var1 * 4);
         GL11.glGetTexImage(3553, 0, 6408, 5121, var2);
         int[] var3 = new int[var0 * var1];

         for (int var4 = 0; var4 < var3.length; var4++) {
            int var5 = var4 * 4;
            int var6 = var2.get(var5) & 255;
            int var7 = var2.get(var5 + 1) & 255;
            int var8 = var2.get(var5 + 2) & 255;
            int var9 = var2.get(var5 + 3) & 255;
            var3[var4] = var9 << 24 | var6 << 16 | var7 << 8 | var8;
         }

         fieldInt_f = var0;
         fieldInt_g = var1;
         arr_e = var3;
         return var3;
      } catch (Throwable var11) {
         return null;
      }
   }

   static {
      long var0 = 57027221686163L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var4 = new long[3];
      int var5 = 0;
      String var6 = "ØH\u009b<ô0IÁQT:\b\u008fj\u0007\u0087k<\u0085=æàþ\u0096";
      int var7 = "ØH\u009b<ô0IÁQT:\b\u008fj\u0007\u0087k<\u0085=æàþ\u0096".length();
      byte var8 = 0;

      do {
         int var10001 = var8;
         var8 += 8;
         byte[] var9 = var6.substring(var10001, var8).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
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
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var29 = -1;
         var4[var10001] = var10004;
      } while (var8 < var7);

      CONST_I = var4;
      CONST_J = new Integer[3];
      CONST_N = new HashMap(13);
      Cipher var13;
      var10000 = var13 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var0 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var15 = new long[2];
      int var16 = 0;
      String var17 = "î&Ëú\u0084´bçæA¶©\u008a\n\u001at";
      int var18 = "î&Ëú\u0084´bçæA¶©\u008a\n\u001at".length();
      byte var19 = 0;

      do {
         int var26 = var19;
         var19 += 8;
         byte[] var20 = var17.substring(var26, var19).getBytes("ISO-8859-1");
         var26 = var16++;
         long var21 = (var20[0] & 255L) << 56
            | (var20[1] & 255L) << 48
            | (var20[2] & 255L) << 40
            | (var20[3] & 255L) << 32
            | (var20[4] & 255L) << 24
            | (var20[5] & 255L) << 16
            | (var20[6] & 255L) << 8
            | var20[7] & 255L;
         byte[] var23 = var13.doFinal(
            new byte[]{
               (byte)(var21 >>> 56),
               (byte)(var21 >>> 48),
               (byte)(var21 >>> 40),
               (byte)(var21 >>> 32),
               (byte)(var21 >>> 24),
               (byte)(var21 >>> 16),
               (byte)(var21 >>> 8),
               (byte)var21
            }
         );
         long var32 = (var23[0] & 255L) << 56
            | (var23[1] & 255L) << 48
            | (var23[2] & 255L) << 40
            | (var23[3] & 255L) << 32
            | (var23[4] & 255L) << 24
            | (var23[5] & 255L) << 16
            | (var23[6] & 255L) << 8
            | var23[7] & 255L;
         byte var31 = -1;
         var15[var26] = var32;
      } while (var19 < var18);

      CONST_L = var15;
      CONST_M = new Long[2];
      CONST_A = new ConcurrentHashMap<>();
      arr_e = null;
      fieldInt_f = 0;
      fieldInt_g = 0;
   }

   private static Throwable getThrowable(Throwable var0) {
      return var0;
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20125;
      if (CONST_J[var3] == null) {
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
         long var5 = CONST_I[var3];
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
         Object[] var9 = (Object[])CONST_K.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_K.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/fm", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_J[var3] = var15;
      }

      return CONST_J[var3];
   }

   private static int getValue_4(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
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
               MethodHandles.insertArguments("getValue_4".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/fm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5559;
      if (CONST_M[var3] == null) {
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
         long var5 = CONST_L[var3];
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
         Object[] var9 = (Object[])CONST_N.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_N.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/fm", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_M[var3] = var14;
      }

      return CONST_M[var3];
   }

   private static long getLong(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = decrypt_2(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getLong".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/fm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
