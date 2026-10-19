package rip.breeze.client;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import rip.breeze.BreezeContext;
import rip.breeze.StringDecryptor;

public final class ItemIconCache {
   private static final int CONST_A;
   private static final int CONST_B;
   private static final String CONST_C;
   private static final Map<String, ItemStack> CONST_D;
   private static final Queue<String> CONST_E;
   private static List<rip.breeze.Util141> list_f;
   private static String string_g;
   private static final String[] CONST_I;
   private static final String[] CONST_J;
   private static final Map CONST_K = new HashMap(13);

   private ItemIconCache() {
   }

   public static List<rip.breeze.Util141> getList() {
      String var0 = buildString_2();
      if (list_f != null && var0.equals(string_g)) {
         return list_f;
      }

      Map var1 = parseConfig(var0);
      ArrayList var2 = new ArrayList();

      for (Object var4 : Block.blockRegistry) {
         if (var4 instanceof Block) {
            Block var5 = (Block)var4;
            if (var5 != Blocks.air && Item.getItemFromBlock(var5) != null) {
               Object var6 = Block.blockRegistry.getNameForObject(var5);
               if (var6 != null) {
                  ItemStack var7 = new ItemStack(var5);
                  if (var7.getItem() != null) {
                     String var8 = var6.toString();
                     var2.add(new rip.breeze.Util141(var8, buildString(var7, var1, var8)));
                     CONST_D.put(var8, var7);
                  }
               }
            }
         }
      }

      var2.sort(ItemIconCache::lambda$catalog_Inner0);
      list_f = var2;
      string_g = var0;
      return list_f;
   }

   private static String buildString(ItemStack var0, Map<String, String> var1, String var2) {
      long var3 = 38860103210313L;

      try {
         StringBuilder var10000 = new StringBuilder().append(var0.getItem().getUnlocalizedNameInefficiently(var0));
         short var10001 = 1914;
         long var10002 = 4088792316888906537L ^ var3;
         String var5 = var10000.append(".name").toString();
         String var6 = (String)var1.get(var5);
         return var6 != null ? var6.trim() : var0.getDisplayName().trim();
      } catch (Throwable var7) {
         return var2;
      }
   }

   private static String buildString_2() {
      long var0 = 12719463428373L;
      String var2 = BreezeClient.CONST_A.gameSettings.language;
      return var2 != null && !var2.isEmpty() ? var2 : "en_US";
   }

   private static Map<String, String> parseConfig(String var0) {
      long var1 = 119603628484088L;
      HashMap var3 = new HashMap();
      short var10000 = 9923;
      long var10001 = 7885257457444891168L ^ var1;
      calculate("en_US", var3);
      var10000 = 4089;
      var10001 = 6671118517123023641L ^ var1;
      if (!"en_US".equals(var0)) {
         calculate(var0, var3);
      }

      return var3;
   }

   private static void calculate(String var0, Map<String, String> var1) {
      long var2 = 115011842990078L;

      try {
         DefaultResourcePack var10000 = MinecraftAccessor.getDefaultResourcePack(BreezeClient.CONST_A);
         StringBuilder var10003 = new StringBuilder();
         short var10004 = 13402;
         long var10005 = 8228242264653677245L ^ var2;
         var10003 = var10003.append("lang/").append(var0);
         var10004 = 15426;
         var10005 = 3291674902985558691L ^ var2;
         InputStream var4 = var10000.getInputStream(new ResourceLocation(var10003.append(".lang").toString()));
         Throwable var5 = null;

         try {
            if (var4 != null) {
               BufferedReader var6 = new BufferedReader(new InputStreamReader(var4, StandardCharsets.UTF_8));

               while (true) {
                  String var7;
                  String var31 = var7 = var6.readLine();

                  try {
                     if (var31 == null) {
                        return;
                     }

                     if (var7.isEmpty()) {
                        continue;
                     }
                  } catch (Throwable var27) {
                     throw getThrowable(var27);
                  }

                  try {
                     if (var7.charAt(0) == '#') {
                        continue;
                     }
                  } catch (Throwable var26) {
                     throw getThrowable(var26);
                  }

                  int var8 = var7.indexOf(61);

                  try {
                     if (var8 <= 0) {
                        continue;
                     }
                  } catch (Throwable var25) {
                     throw getThrowable(var25);
                  }

                  var1.put(var7.substring(0, var8), var7.substring(var8 + 1));
               }
            }
         } catch (Throwable var28) {
            var5 = var28;
            throw var28;
         } finally {
            label149: {
               label148: {
                  try {
                     if (var4 == null) {
                        break label149;
                     }

                     if (var5 == null) {
                        break label148;
                     }
                  } catch (Throwable var24) {
                     throw getThrowable(var24);
                  }

                  try {
                     var4.close();
                  } catch (Throwable var23) {
                     var5.addSuppressed(var23);
                  }
                  break label149;
               }

               var4.close();
            }
         }
      } catch (Throwable var30) {
      }
   }

   public static void processAll(String var0) {
      long var1 = 135971014392352L;
      getList();
      if (BreezeContext.iRenderer_b.isFontLoaded("block:" + var0)) {
         CONST_E.add(var0);
      }
   }

   public static void processAll() {
      long var0 = 92621286896636L;

      for (int var2 = 0; var2 < 4; var2++) {
         String var3 = CONST_E.poll();
         if (var3 == null) {
            return;
         }

         BreezeContext.iRenderer_b.loadFontBytes("block:" + var3, loadImageBytes(var3));
      }
   }

   private static byte[] loadImageBytes(String var0) {
      ItemStack var1 = CONST_D.get(var0);
      if (var1 == null) {
         return null;
      }

      byte[] var2 = getItemIconBytes(var1);
      return var2 != null ? var2 : renderItemToBytes(var1);
   }

   private static byte[] getItemIconBytes(ItemStack var0) {
      int[] var1 = FontManager.values();
      GlStateManager.matrixMode(5889);
      GlStateManager.pushMatrix();
      GlStateManager.matrixMode(5888);
      GlStateManager.pushMatrix();
      Framebuffer var2 = null;

      try {
         var2 = new Framebuffer(64, 64, true);
         var2.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
         var2.framebufferClear();
         var2.bindFramebuffer(true);
         GlStateManager.matrixMode(5889);
         GlStateManager.loadIdentity();
         GlStateManager.ortho(0.0, 16.0, 16.0, 0.0, 1000.0, 3000.0);
         GlStateManager.matrixMode(5888);
         GlStateManager.loadIdentity();
         GlStateManager.translate(0.0F, 0.0F, -2000.0F);
         GlStateManager.enableDepth();
         RenderHelper.enableGUIStandardItemLighting();
         BreezeClient.CONST_A.getRenderItem().renderItemIntoGUI(var0, 0, 0);
         RenderHelper.disableStandardItemLighting();
         return getDefaultIconBytes();
      } catch (Throwable var11) {
         return null;
      } finally {
         try {
            GlStateManager.matrixMode(5889);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(5888);
            GlStateManager.popMatrix();
            if (var2 != null) {
               var2.deleteFramebuffer();
            }
         } catch (Throwable var12) {
            throw getThrowable(var12);
         }

         FontManager.render(var1);
      }
   }

   private static byte[] getDefaultIconBytes() throws IOException {
      ByteBuffer var0 = BufferUtils.createByteBuffer(16384);
      GL11.glReadPixels(0, 0, 64, 64, 6408, 5121, var0);
      BufferedImage var1 = new BufferedImage(64, 64, 2);
      boolean var2 = false;

      for (int var3 = 0; var3 < 64; var3++) {
         for (int var4 = 0; var4 < 64; var4++) {
            int var5 = (var4 + (63 - var3) * 64) * 4;
            int var6 = var0.get(var5) & 255;
            int var7 = var0.get(var5 + 1) & 255;
            int var8 = var0.get(var5 + 2) & 255;
            int var9 = var0.get(var5 + 3) & 255;
            if (var9 != 0) {
               var2 = true;
            }

            var1.setRGB(var4, var3, var9 << 24 | var6 << 16 | var7 << 8 | var8);
         }
      }

      try {
         if (var2) {
            return imageToBytes(var1);
         }
      } catch (IOException var10) {
         throw getThrowable(var10);
      }

      return null;
   }

   private static byte[] renderItemToBytes(ItemStack param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 03: invokevirtual net/minecraft/client/Minecraft.getRenderItem ()Lnet/minecraft/client/renderer/entity/RenderItem;
      // 06: invokevirtual net/minecraft/client/renderer/entity/RenderItem.getItemModelMesher ()Lnet/minecraft/client/renderer/ItemModelMesher;
      // 09: aload 0
      // 0a: invokevirtual net/minecraft/client/renderer/ItemModelMesher.getItemModel (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/client/resources/model/IBakedModel;
      // 0d: astore 1
      // 0e: aload 1
      // 0f: ifnonnull 14
      // 12: aconst_null
      // 13: areturn
      // 14: aload 1
      // 15: invokeinterface net/minecraft/client/resources/model/IBakedModel.getParticleTexture ()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite; 1
      // 1a: astore 2
      // 1b: aload 2
      // 1c: ifnonnull 21
      // 1f: aconst_null
      // 20: areturn
      // 21: aload 2
      // 22: bipush 0
      // 23: invokevirtual net/minecraft/client/renderer/texture/TextureAtlasSprite.getFrameTextureData (I)[[I
      // 26: astore 3
      // 27: aload 3
      // 28: ifnull 44
      // 2b: aload 3
      // 2c: arraylength
      // 2d: ifeq 44
      // 30: goto 37
      // 33: invokestatic rip/breeze/client/ItemIconCache.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 3
      // 38: bipush 0
      // 39: aaload
      // 3a: ifnonnull 46
      // 3d: goto 44
      // 40: invokestatic rip/breeze/client/ItemIconCache.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: aconst_null
      // 45: areturn
      // 46: aload 2
      // 47: invokevirtual net/minecraft/client/renderer/texture/TextureAtlasSprite.getIconWidth ()I
      // 4a: istore 4
      // 4c: aload 2
      // 4d: invokevirtual net/minecraft/client/renderer/texture/TextureAtlasSprite.getIconHeight ()I
      // 50: istore 5
      // 52: iload 4
      // 54: ifle 76
      // 57: iload 5
      // 59: ifle 76
      // 5c: goto 63
      // 5f: invokestatic rip/breeze/client/ItemIconCache.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 3
      // 64: bipush 0
      // 65: aaload
      // 66: arraylength
      // 67: iload 4
      // 69: iload 5
      // 6b: imul
      // 6c: if_icmpge 78
      // 6f: goto 76
      // 72: invokestatic rip/breeze/client/ItemIconCache.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: aconst_null
      // 77: areturn
      // 78: new java/awt/image/BufferedImage
      // 7b: dup
      // 7c: iload 4
      // 7e: iload 5
      // 80: bipush 2
      // 81: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 84: astore 6
      // 86: aload 6
      // 88: bipush 0
      // 89: bipush 0
      // 8a: iload 4
      // 8c: iload 5
      // 8e: aload 3
      // 8f: bipush 0
      // 90: aaload
      // 91: bipush 0
      // 92: iload 4
      // 94: invokevirtual java/awt/image/BufferedImage.setRGB (IIII[III)V
      // 97: aload 6
      // 99: invokestatic rip/breeze/client/ItemIconCache.imageToBytes (Ljava/awt/image/BufferedImage;)[B
      // 9c: areturn
      // 9d: astore 1
      // 9e: aconst_null
      // 9f: areturn
      // try (0 -> 9): 85 java/lang/Throwable
      // try (10 -> 16): 85 java/lang/Throwable
      // try (23 -> 33): 34 java/lang/Throwable
      // try (21 -> 26): 27 java/lang/Throwable
      // try (17 -> 37): 85 java/lang/Throwable
      // try (46 -> 59): 60 java/lang/Throwable
      // try (44 -> 48): 49 java/lang/Throwable
      // try (38 -> 63): 85 java/lang/Throwable
      // try (64 -> 84): 85 java/lang/Throwable
   }

   private static byte[] imageToBytes(BufferedImage var0) throws IOException {
      long var1 = 130439291188756L;
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      ImageIO.write(var0, "PNG", var3);
      return var3.toByteArray();
   }

   private static int lambda$catalog_Inner0(rip.breeze.Util141 var0, rip.breeze.Util141 var1) {
      return var0.string_b.compareToIgnoreCase(var1.string_b);
   }

   static {
      long var0 = 41082130250125L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[9];
      int var5 = 0;
      String var6 = "ù\u009b\u0011\u0003ÍZk}Å/¸\u0007\u009fNn}\u0010E3àË\\\u0015@µVHÄB´\u009eñ¶\u0010Yü <\u0099Ó¦øVð³½\u0097Ë\u0083\u0089\u0010\u001dÙKà\u0002/\u0087\u009eÎ¦Òù\f¤p#\u0010jä¼\u000fº\u00ad/´rÇ\u008a\u000eÈCjg\u0018ç\u0013+\u0012f&¸¸´=ïA¼3¹\u0091Àÿù\u0014)Î¨~\u0010öª\u001f\u0093J±J\u0092\u008egY[!é\u0099Â";
      int var7 = "ù\u009b\u0011\u0003ÍZk}Å/¸\u0007\u009fNn}\u0010E3àË\\\u0015@µVHÄB´\u009eñ¶\u0010Yü <\u0099Ó¦øVð³½\u0097Ë\u0083\u0089\u0010\u001dÙKà\u0002/\u0087\u009eÎ¦Òù\f¤p#\u0010jä¼\u000fº\u00ad/´rÇ\u008a\u000eÈCjg\u0018ç\u0013+\u0012f&¸¸´=ïA¼3¹\u0091Àÿù\u0014)Î¨~\u0010öª\u001f\u0093J±J\u0092\u008egY[!é\u0099Â"
         .length();
      char var8 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var24.getBytes("ISO-8859-1"));
            String var35 = buildString_3(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var35;
                  if ((var23 += var8) >= var7) {
                     CONST_I = var4;
                     CONST_J = new String[9];
                     short var26 = 13528;
                     long var31 = 3877555467271545929L ^ var0;
                     CONST_C = "en_US";
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[2];
                     int var14 = 0;
                     String var15 = "ÿ;~ï{ÛW\u0082ó!CéHHû\u0083";
                     int var16 = "ÿ;~ï{ÛW\u0082ó!CéHHû\u0083".length();
                     byte var17 = 0;

                     do {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        var10001 = var14++;
                        long var19 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
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
                        long var10004 = (var21[0] & 255L) << 56
                           | (var21[1] & 255L) << 48
                           | (var21[2] & 255L) << 40
                           | (var21[3] & 255L) << 32
                           | (var21[4] & 255L) << 24
                           | (var21[5] & 255L) << 16
                           | (var21[6] & 255L) << 8
                           | var21[7] & 255L;
                        byte var40 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_A = (int)var13[0];
                     CONST_B = (int)var13[1];
                     CONST_D = new HashMap<>();
                     CONST_E = new ConcurrentLinkedQueue<>();
                     return;
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var35;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label45;
                  }

                  var6 = "b\u0000EË\u0015iJÆ\"skFMJ£\u001a\u0010«6\u008b:Êei\u00ad/M§ô\u0006Ú\rÖ";
                  var7 = "b\u0000EË\u0015iJÆ\"skFMJ£\u001a\u0010«6\u008b:Êei\u00ad/M§ô\u0006Ú\rÖ".length();
                  var8 = 16;
                  var23 = -1;
            }

            var24 = var6.substring(++var23, var23 + var8);
            var10001 = 0;
         }
      }
   }

   private static Throwable getThrowable(Throwable var0) {
      return var0;
   }

   private static String buildString_3(byte[] var0) {
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

   private static String buildString_4(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10522;
      if (CONST_J[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_K.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_K.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/fe", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_I[var3].getBytes("ISO-8859-1");
         CONST_J[var3] = buildString_3(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_J[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_4(var4, var5);
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
         throw new RuntimeException("rip/breeze/client/fe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
