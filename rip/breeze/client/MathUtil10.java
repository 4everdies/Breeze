package rip.breeze.client;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.TextAttribute;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import rip.breeze.StringDecryptor;

public final class MathUtil10 implements IResourceManagerReloadListener {
   private static final int CONST_A;
   private static final int CONST_B;
   private static final int CONST_C;
   private static final float CONST_D = 0.7F;
   private static final int CONST_E;
   private static final int CONST_F;
   private static final int CONST_G;
   private static final int CONST_H;
   private static final int CONST_I;
   private static final int CONST_J;
   private final Font font_k;
   private final boolean fieldBool_l;
   private final int fieldInt_m;
   private final int fieldInt_n;
   private int fieldInt_o;
   private int fieldInt_p;
   private final Map<Integer, Util129> map_q;
   private final FontMetrics dialogSetting;
   private final FontRenderContext fontRenderContext_s;
   private int fieldInt_t;
   private BufferedImage bufferedImage_u;
   private BufferedImage bufferedImage_v;
   private RaytraceResult dataBuilder48_w;
   private RaytraceResult dataBuilder48_x;
   private final RenderUtil35 dataBuilder49_y;
   private final RenderUtil35 dataBuilder49_z;
   private final RenderUtil35 dataBuilder49_A;
   private final RenderUtil34 dataBuilder47_B;
   private final RenderUtil34 dataBuilder47_C;
   private final RenderUtil34 dataBuilder47_D;
   private final RenderUtil34 dataBuilder47_E;
   private final RenderUtil34 dataBuilder47_F;
   private boolean fieldBool_G;
   private final LinkedHashMap<String, Util42> linkedHashMap_H;
   private final Map<Long, Integer> map_I;
   private final boolean fieldBool_J;
   private final int fieldInt_K;
   private ResourceLocation resourceLocation_L;
   private int fieldInt_M;
   private int fieldInt_N;
   private FontRenderer fontRenderer_O;
   private int fieldInt_P;
   private volatile boolean fieldBool_Q;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);
   private static final long[] CONST_V;
   private static final Integer[] CONST_W;
   private static final Map CONST_X;
   private static final long eka_1;

   public MathUtil10(Font var1, boolean var2) {
      this(var1, var2, null, 512, 512, 0, 0);
   }

   public MathUtil10(Font var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7) {
      long var8 = 61751386040421L;
      super();
      this.map_q = new HashMap<>();
      this.dataBuilder49_y = new RenderUtil35();
      this.dataBuilder49_z = new RenderUtil35();
      this.dataBuilder49_A = new RenderUtil35();
      this.dataBuilder47_B = new RenderUtil34(null);
      this.dataBuilder47_C = new RenderUtil34(null);
      this.dataBuilder47_D = new RenderUtil34(null);
      this.dataBuilder47_E = new RenderUtil34(null);
      this.dataBuilder47_F = new RenderUtil34(null);
      this.fieldBool_G = false;
      this.linkedHashMap_H = new ConfigMapImpl(this, 256, 0.75F, true);
      this.map_I = new HashMap<>();
      this.fieldInt_P = 8;
      this.fieldBool_Q = false;
      HashMap var10 = new HashMap();
      var10.put(TextAttribute.KERNING, TextAttribute.KERNING_ON);
      this.font_k = var1.deriveFont(var10);
      this.fieldBool_l = var2;
      this.fieldBool_J = false;
      this.fieldInt_K = 1;
      this.resourceLocation_L = null;
      this.fieldInt_M = 0;
      this.fieldInt_N = 0;
      this.fontRenderer_O = null;
      this.fieldInt_m = var6;
      this.fieldInt_n = var7;
      this.fieldInt_o = getValue_3(Math.max(256, var4));
      this.fieldInt_p = getValue_3(Math.max(256, var5));
      BufferedImage var11 = new BufferedImage(1, 1, 2);
      Graphics2D var12 = var11.createGraphics();
      this.processAll_4(var12);
      var12.setFont(this.font_k);
      this.dialogSetting = var12.getFontMetrics();
      this.fontRenderContext_s = var12.getFontRenderContext();
      var12.dispose();
      this.clamp_11(var3);
      this.dataBuilder48_w = RaytraceResult.getDataBuilder48(this.bufferedImage_u);
      this.dataBuilder48_x = RaytraceResult.getDataBuilder48(this.bufferedImage_v);
   }

   private MathUtil10(BufferedImage param1, ResourceLocation param2, int param3, FontRenderer param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/MathUtil10.118581016125644L J
      // 003: ldc2_w 98560805308284
      // 006: lxor
      // 007: lstore 5
      // 009: aload 0
      // 00a: invokespecial java/lang/Object.<init> ()V
      // 00d: aload 0
      // 00e: new java/util/HashMap
      // 011: dup
      // 012: invokespecial java/util/HashMap.<init> ()V
      // 015: putfield rip/breeze/client/MathUtil10.map_q Ljava/util/Map;
      // 018: aload 0
      // 019: new rip/breeze/client/RenderUtil35
      // 01c: dup
      // 01d: invokespecial rip/breeze/client/RenderUtil35.<init> ()V
      // 020: putfield rip/breeze/client/MathUtil10.dataBuilder49_y Lrip/breeze/client/RenderUtil35;
      // 023: aload 0
      // 024: new rip/breeze/client/RenderUtil35
      // 027: dup
      // 028: invokespecial rip/breeze/client/RenderUtil35.<init> ()V
      // 02b: putfield rip/breeze/client/MathUtil10.dataBuilder49_z Lrip/breeze/client/RenderUtil35;
      // 02e: aload 0
      // 02f: new rip/breeze/client/RenderUtil35
      // 032: dup
      // 033: invokespecial rip/breeze/client/RenderUtil35.<init> ()V
      // 036: putfield rip/breeze/client/MathUtil10.dataBuilder49_A Lrip/breeze/client/RenderUtil35;
      // 039: aload 0
      // 03a: new rip/breeze/client/RenderUtil34
      // 03d: dup
      // 03e: aconst_null
      // 03f: invokespecial rip/breeze/client/RenderUtil34.<init> (Lrip/breeze/client/ConfigMapImpl;)V
      // 042: putfield rip/breeze/client/MathUtil10.dataBuilder47_B Lrip/breeze/client/RenderUtil34;
      // 045: aload 0
      // 046: new rip/breeze/client/RenderUtil34
      // 049: dup
      // 04a: aconst_null
      // 04b: invokespecial rip/breeze/client/RenderUtil34.<init> (Lrip/breeze/client/ConfigMapImpl;)V
      // 04e: putfield rip/breeze/client/MathUtil10.dataBuilder47_C Lrip/breeze/client/RenderUtil34;
      // 051: aload 0
      // 052: new rip/breeze/client/RenderUtil34
      // 055: dup
      // 056: aconst_null
      // 057: invokespecial rip/breeze/client/RenderUtil34.<init> (Lrip/breeze/client/ConfigMapImpl;)V
      // 05a: putfield rip/breeze/client/MathUtil10.dataBuilder47_D Lrip/breeze/client/RenderUtil34;
      // 05d: aload 0
      // 05e: new rip/breeze/client/RenderUtil34
      // 061: dup
      // 062: aconst_null
      // 063: invokespecial rip/breeze/client/RenderUtil34.<init> (Lrip/breeze/client/ConfigMapImpl;)V
      // 066: putfield rip/breeze/client/MathUtil10.dataBuilder47_E Lrip/breeze/client/RenderUtil34;
      // 069: aload 0
      // 06a: new rip/breeze/client/RenderUtil34
      // 06d: dup
      // 06e: aconst_null
      // 06f: invokespecial rip/breeze/client/RenderUtil34.<init> (Lrip/breeze/client/ConfigMapImpl;)V
      // 072: putfield rip/breeze/client/MathUtil10.dataBuilder47_F Lrip/breeze/client/RenderUtil34;
      // 075: aload 0
      // 076: bipush 0
      // 077: putfield rip/breeze/client/MathUtil10.fieldBool_G Z
      // 07a: aload 0
      // 07b: new rip/breeze/client/ConfigMapImpl
      // 07e: dup
      // 07f: aload 0
      // 080: sipush 256
      // 083: ldc 0.75
      // 085: bipush 1
      // 086: invokespecial rip/breeze/client/ConfigMapImpl.<init> (Lrip/breeze/client/MathUtil10;IFZ)V
      // 089: putfield rip/breeze/client/MathUtil10.linkedHashMap_H Ljava/util/LinkedHashMap;
      // 08c: aload 0
      // 08d: new java/util/HashMap
      // 090: dup
      // 091: invokespecial java/util/HashMap.<init> ()V
      // 094: putfield rip/breeze/client/MathUtil10.map_I Ljava/util/Map;
      // 097: aload 0
      // 098: sipush 16039
      // 09b: ldc2_w 3546704629585705330
      // 09e: lload 5
      // 0a0: lxor
      // 0a1: invokedynamic t (IJ)I bsm=rip/breeze/client/MathUtil10.getCallSite_2 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: putfield rip/breeze/client/MathUtil10.fieldInt_P I
      // 0a9: aload 0
      // 0aa: bipush 0
      // 0ab: putfield rip/breeze/client/MathUtil10.fieldBool_Q Z
      // 0ae: aload 0
      // 0af: aconst_null
      // 0b0: putfield rip/breeze/client/MathUtil10.font_k Ljava/awt/Font;
      // 0b3: aload 0
      // 0b4: bipush 0
      // 0b5: putfield rip/breeze/client/MathUtil10.fieldBool_l Z
      // 0b8: aload 0
      // 0b9: bipush 1
      // 0ba: putfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 0bd: aload 0
      // 0be: bipush 1
      // 0bf: iload 3
      // 0c0: invokestatic java/lang/Math.max (II)I
      // 0c3: putfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 0c6: aload 0
      // 0c7: aload 2
      // 0c8: putfield rip/breeze/client/MathUtil10.resourceLocation_L Lnet/minecraft/util/ResourceLocation;
      // 0cb: aload 0
      // 0cc: aload 2
      // 0cd: ifnull 0da
      // 0d0: aload 2
      // 0d1: invokevirtual net/minecraft/util/ResourceLocation.toString ()Ljava/lang/String;
      // 0d4: invokevirtual java/lang/String.hashCode ()I
      // 0d7: goto 0db
      // 0da: bipush 0
      // 0db: putfield rip/breeze/client/MathUtil10.fieldInt_M I
      // 0de: aload 0
      // 0df: aload 4
      // 0e1: putfield rip/breeze/client/MathUtil10.fontRenderer_O Lnet/minecraft/client/gui/FontRenderer;
      // 0e4: aload 0
      // 0e5: bipush 0
      // 0e6: putfield rip/breeze/client/MathUtil10.fieldInt_m I
      // 0e9: aload 0
      // 0ea: bipush 0
      // 0eb: putfield rip/breeze/client/MathUtil10.fieldInt_n I
      // 0ee: new java/awt/image/BufferedImage
      // 0f1: dup
      // 0f2: bipush 1
      // 0f3: bipush 1
      // 0f4: bipush 2
      // 0f5: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 0f8: astore 7
      // 0fa: aload 7
      // 0fc: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 0ff: astore 8
      // 101: aload 8
      // 103: new java/awt/Font
      // 106: dup
      // 107: sipush 6411
      // 10a: ldc2_w 3994311710659555015
      // 10d: lload 5
      // 10f: lxor
      // 110: pop2
      // 111: pop
      // 112: ldc_w "Dialog"
      // 115: bipush 0
      // 116: bipush 12
      // 118: invokespecial java/awt/Font.<init> (Ljava/lang/String;II)V
      // 11b: invokevirtual java/awt/Graphics2D.setFont (Ljava/awt/Font;)V
      // 11e: aload 0
      // 11f: aload 8
      // 121: invokevirtual java/awt/Graphics2D.getFontMetrics ()Ljava/awt/FontMetrics;
      // 124: putfield rip/breeze/client/MathUtil10.dialogSetting Ljava/awt/FontMetrics;
      // 127: aload 0
      // 128: aload 8
      // 12a: invokevirtual java/awt/Graphics2D.getFontRenderContext ()Ljava/awt/font/FontRenderContext;
      // 12d: putfield rip/breeze/client/MathUtil10.fontRenderContext_s Ljava/awt/font/FontRenderContext;
      // 130: aload 8
      // 132: invokevirtual java/awt/Graphics2D.dispose ()V
      // 135: aload 0
      // 136: sipush 256
      // 139: sipush 512
      // 13c: invokestatic java/lang/Math.max (II)I
      // 13f: invokestatic rip/breeze/client/MathUtil10.getValue_3 (I)I
      // 142: putfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 145: aload 0
      // 146: sipush 256
      // 149: sipush 512
      // 14c: invokestatic java/lang/Math.max (II)I
      // 14f: invokestatic rip/breeze/client/MathUtil10.getValue_3 (I)I
      // 152: putfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 155: aload 0
      // 156: aload 1
      // 157: invokespecial rip/breeze/client/MathUtil10.clamp_9 (Ljava/awt/image/BufferedImage;)V
      // 15a: aload 0
      // 15b: aload 0
      // 15c: getfield rip/breeze/client/MathUtil10.bufferedImage_u Ljava/awt/image/BufferedImage;
      // 15f: invokestatic rip/breeze/client/RaytraceResult.getDataBuilder48 (Ljava/awt/image/BufferedImage;)Lrip/breeze/client/RaytraceResult;
      // 162: putfield rip/breeze/client/MathUtil10.dataBuilder48_w Lrip/breeze/client/RaytraceResult;
      // 165: aload 0
      // 166: aload 0
      // 167: getfield rip/breeze/client/MathUtil10.bufferedImage_v Ljava/awt/image/BufferedImage;
      // 16a: invokestatic rip/breeze/client/RaytraceResult.getDataBuilder48 (Ljava/awt/image/BufferedImage;)Lrip/breeze/client/RaytraceResult;
      // 16d: putfield rip/breeze/client/MathUtil10.dataBuilder48_x Lrip/breeze/client/RaytraceResult;
      // 170: aload 0
      // 171: aload 0
      // 172: invokevirtual rip/breeze/client/MathUtil10.clamp_5 ()I
      // 175: putfield rip/breeze/client/MathUtil10.fieldInt_t I
      // 178: invokestatic net/minecraft/client/Minecraft.getMinecraft ()Lnet/minecraft/client/Minecraft;
      // 17b: astore 9
      // 17d: aload 9
      // 17f: ifnull 1ae
      // 182: aload 9
      // 184: invokevirtual net/minecraft/client/Minecraft.getResourceManager ()Lnet/minecraft/client/resources/IResourceManager;
      // 187: instanceof net/minecraft/client/resources/IReloadableResourceManager
      // 18a: ifeq 1ae
      // 18d: goto 194
      // 190: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 193: athrow
      // 194: aload 9
      // 196: invokevirtual net/minecraft/client/Minecraft.getResourceManager ()Lnet/minecraft/client/resources/IResourceManager;
      // 199: checkcast net/minecraft/client/resources/IReloadableResourceManager
      // 19c: aload 0
      // 19d: invokeinterface net/minecraft/client/resources/IReloadableResourceManager.registerReloadListener (Lnet/minecraft/client/resources/IResourceManagerReloadListener;)V 2
      // 1a2: aload 0
      // 1a3: bipush 0
      // 1a4: putfield rip/breeze/client/MathUtil10.fieldBool_Q Z
      // 1a7: goto 1ae
      // 1aa: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ad: athrow
      // 1ae: goto 1b3
      // 1b1: astore 9
      // 1b3: return
      // try (185 -> 200): 201 java/lang/Throwable
      // try (183 -> 189): 190 java/lang/Throwable
      // try (181 -> 203): 204 java/lang/Throwable
   }

   public static MathUtil10 getDataBuilder46() {
      return clamp(16);
   }

   public static MathUtil10 clamp(int var0) {
      int var10000;
      label48: {
         try {
            if (var0 <= 0) {
               var10000 = 16;
               break label48;
            }
         } catch (IllegalStateException var10) {
            throw getThrowable(var10);
         }

         var10000 = var0;
      }

      int var1 = var10000;
      int var2 = Math.max(1, var1 / 8);
      Minecraft var3 = Minecraft.getMinecraft();

      label40: {
         try {
            if (var3 != null) {
               var11 = var3.fontRendererObj;
               break label40;
            }
         } catch (IllegalStateException var9) {
            throw getThrowable(var9);
         }

         var11 = null;
      }

      FontRenderer var4 = var11;
      ResourceLocation var5 = getResourceLocation(var4);
      BufferedImage var6 = getBufferedImage(var3, var5);
      if (var6 == null) {
         var6 = new BufferedImage(128, 128, 2);
      }

      MathUtil10 var7 = new MathUtil10(var6, var5, var2, var4);

      int var10001;
      label30: {
         try {
            var12 = var7;
            if (var4 != null) {
               var10001 = var4.FONT_HEIGHT * var2;
               break label30;
            }
         } catch (IllegalStateException var8) {
            throw getThrowable(var8);
         }

         var10001 = 8 * var2;
      }

      var12.fieldInt_N = var10001;
      var7.fieldInt_t = var7.fieldInt_N;
      return var7;
   }

   public void processAll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 04: ifeq 12
      // 07: aload 0
      // 08: invokespecial rip/breeze/client/MathUtil10.calculate_4 ()V
      // 0b: goto 12
      // 0e: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11: athrow
      // 12: aload 0
      // 13: getfield rip/breeze/client/MathUtil10.dataBuilder48_w Lrip/breeze/client/RaytraceResult;
      // 16: ifnull 27
      // 19: aload 0
      // 1a: getfield rip/breeze/client/MathUtil10.dataBuilder48_x Lrip/breeze/client/RaytraceResult;
      // 1d: ifnonnull 2c
      // 20: goto 27
      // 23: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: return
      // 28: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: aload 0
      // 2d: bipush 1
      // 2e: putfield rip/breeze/client/MathUtil10.fieldBool_G Z
      // 31: aload 0
      // 32: getfield rip/breeze/client/MathUtil10.dataBuilder47_B Lrip/breeze/client/RenderUtil34;
      // 35: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 38: aload 0
      // 39: getfield rip/breeze/client/MathUtil10.dataBuilder47_C Lrip/breeze/client/RenderUtil34;
      // 3c: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 3f: aload 0
      // 40: getfield rip/breeze/client/MathUtil10.dataBuilder47_D Lrip/breeze/client/RenderUtil34;
      // 43: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 46: aload 0
      // 47: getfield rip/breeze/client/MathUtil10.dataBuilder47_E Lrip/breeze/client/RenderUtil34;
      // 4a: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 4d: aload 0
      // 4e: getfield rip/breeze/client/MathUtil10.dataBuilder47_F Lrip/breeze/client/RenderUtil34;
      // 51: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 54: return
      // try (0 -> 5): 6 java/lang/IllegalStateException
      // try (8 -> 14): 15 java/lang/IllegalStateException
      // try (11 -> 18): 18 java/lang/IllegalStateException
   }

   public void toggle() {
      try {
         if (!this.fieldBool_G) {
            return;
         }
      } catch (IllegalStateException var1) {
         throw getThrowable(var1);
      }

      this.processAll_2();
      this.fieldBool_G = false;
   }

   public void processAll_2() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/MathUtil10.118581016125644L J
      // 003: ldc2_w 132001876431175
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: getfield rip/breeze/client/MathUtil10.fieldBool_G Z
      // 00c: ifne 014
      // 00f: return
      // 010: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 013: athrow
      // 014: aload 0
      // 015: getfield rip/breeze/client/MathUtil10.dataBuilder48_w Lrip/breeze/client/RaytraceResult;
      // 018: ifnull 029
      // 01b: aload 0
      // 01c: getfield rip/breeze/client/MathUtil10.dataBuilder48_x Lrip/breeze/client/RaytraceResult;
      // 01f: ifnonnull 051
      // 022: goto 029
      // 025: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: aload 0
      // 02a: getfield rip/breeze/client/MathUtil10.dataBuilder47_B Lrip/breeze/client/RenderUtil34;
      // 02d: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 030: aload 0
      // 031: getfield rip/breeze/client/MathUtil10.dataBuilder47_C Lrip/breeze/client/RenderUtil34;
      // 034: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 037: aload 0
      // 038: getfield rip/breeze/client/MathUtil10.dataBuilder47_D Lrip/breeze/client/RenderUtil34;
      // 03b: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 03e: aload 0
      // 03f: getfield rip/breeze/client/MathUtil10.dataBuilder47_E Lrip/breeze/client/RenderUtil34;
      // 042: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 045: aload 0
      // 046: getfield rip/breeze/client/MathUtil10.dataBuilder47_F Lrip/breeze/client/RenderUtil34;
      // 049: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 04c: return
      // 04d: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: sipush 28211
      // 054: ldc2_w 166502665451274206
      // 057: lload 1
      // 058: lxor
      // 059: invokedynamic t (IJ)I bsm=rip/breeze/client/MathUtil10.getCallSite_2 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: invokestatic org/lwjgl/opengl/GL13.glActiveTexture (I)V
      // 061: sipush 3553
      // 064: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 067: sipush 3008
      // 06a: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 06d: sipush 3042
      // 070: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 073: sipush 770
      // 076: sipush 771
      // 079: invokestatic org/lwjgl/opengl/GL11.glBlendFunc (II)V
      // 07c: sipush 8960
      // 07f: sipush 8704
      // 082: sipush 8448
      // 085: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 088: aload 0
      // 089: getfield rip/breeze/client/MathUtil10.dataBuilder47_B Lrip/breeze/client/RenderUtil34;
      // 08c: invokevirtual rip/breeze/client/RenderUtil34.processAll ()V
      // 08f: invokestatic rip/breeze/client/BreezeClient.getModuleManager ()Lrip/breeze/client/ModuleManager;
      // 092: getfield rip/breeze/client/ModuleManager.fontManager_i Lrip/breeze/client/FontManager;
      // 095: astore 3
      // 096: aload 3
      // 097: ifnull 0a5
      // 09a: aload 3
      // 09b: invokevirtual rip/breeze/client/FontManager.initialize ()V
      // 09e: goto 0a5
      // 0a1: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: getfield rip/breeze/client/MathUtil10.dataBuilder47_D Lrip/breeze/client/RenderUtil34;
      // 0a9: invokevirtual rip/breeze/client/RenderUtil34.processAll ()V
      // 0ac: aload 0
      // 0ad: getfield rip/breeze/client/MathUtil10.dataBuilder47_C Lrip/breeze/client/RenderUtil34;
      // 0b0: invokevirtual rip/breeze/client/RenderUtil34.processAll ()V
      // 0b3: aload 3
      // 0b4: ifnull 0c2
      // 0b7: aload 3
      // 0b8: invokevirtual rip/breeze/client/FontManager.bind ()V
      // 0bb: goto 0c2
      // 0be: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: getfield rip/breeze/client/MathUtil10.dataBuilder47_F Lrip/breeze/client/RenderUtil34;
      // 0c6: invokevirtual rip/breeze/client/RenderUtil34.processAll ()V
      // 0c9: aload 0
      // 0ca: getfield rip/breeze/client/MathUtil10.dataBuilder47_E Lrip/breeze/client/RenderUtil34;
      // 0cd: invokevirtual rip/breeze/client/RenderUtil34.processAll ()V
      // 0d0: bipush 0
      // 0d1: invokestatic org/lwjgl/opengl/GL20.glUseProgram (I)V
      // 0d4: fconst_1
      // 0d5: fconst_1
      // 0d6: fconst_1
      // 0d7: fconst_1
      // 0d8: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 0db: aload 0
      // 0dc: getfield rip/breeze/client/MathUtil10.dataBuilder47_B Lrip/breeze/client/RenderUtil34;
      // 0df: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 0e2: aload 0
      // 0e3: getfield rip/breeze/client/MathUtil10.dataBuilder47_C Lrip/breeze/client/RenderUtil34;
      // 0e6: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 0e9: aload 0
      // 0ea: getfield rip/breeze/client/MathUtil10.dataBuilder47_D Lrip/breeze/client/RenderUtil34;
      // 0ed: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 0f0: aload 0
      // 0f1: getfield rip/breeze/client/MathUtil10.dataBuilder47_E Lrip/breeze/client/RenderUtil34;
      // 0f4: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 0f7: aload 0
      // 0f8: getfield rip/breeze/client/MathUtil10.dataBuilder47_F Lrip/breeze/client/RenderUtil34;
      // 0fb: invokevirtual rip/breeze/client/RenderUtil34.update ()V
      // 0fe: sipush 3042
      // 101: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 104: bipush 0
      // 105: invokestatic net/minecraft/client/renderer/GlStateManager.bindTexture (I)V
      // 108: return
      // try (4 -> 8): 8 java/lang/IllegalStateException
      // try (10 -> 16): 17 java/lang/IllegalStateException
      // try (13 -> 35): 35 java/lang/IllegalStateException
      // try (62 -> 66): 67 java/lang/IllegalStateException
      // try (69 -> 79): 80 java/lang/IllegalStateException
   }

   public void render() {
      this.processAll_2();
      GL11.glPushMatrix();
   }

   public void render_1() {
      this.processAll_2();
      GL11.glPopMatrix();
   }

   public void calculate(float param1, float param2, String param3, Color param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/client/MathUtil10.fieldBool_G Z
      // 04: ifne 0c
      // 07: return
      // 08: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b: athrow
      // 0c: aload 3
      // 0d: ifnull 1e
      // 10: aload 3
      // 11: invokevirtual java/lang/String.isEmpty ()Z
      // 14: ifeq 23
      // 17: goto 1e
      // 1a: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: return
      // 1f: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: getfield rip/breeze/client/MathUtil10.dataBuilder48_w Lrip/breeze/client/RaytraceResult;
      // 27: ifnull 38
      // 2a: aload 0
      // 2b: getfield rip/breeze/client/MathUtil10.dataBuilder48_x Lrip/breeze/client/RaytraceResult;
      // 2e: ifnonnull 3d
      // 31: goto 38
      // 34: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: return
      // 39: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 41: ifeq 4f
      // 44: aload 0
      // 45: invokespecial rip/breeze/client/MathUtil10.calculate_4 ()V
      // 48: goto 4f
      // 4b: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: fload 1
      // 50: aload 0
      // 51: getfield rip/breeze/client/MathUtil10.fieldInt_m I
      // 54: i2f
      // 55: fadd
      // 56: fstore 6
      // 58: fload 2
      // 59: aload 0
      // 5a: getfield rip/breeze/client/MathUtil10.fieldInt_n I
      // 5d: i2f
      // 5e: fadd
      // 5f: fstore 7
      // 61: iload 5
      // 63: ifeq 78
      // 66: aload 0
      // 67: fload 6
      // 69: fload 7
      // 6b: aload 3
      // 6c: aload 4
      // 6e: invokespecial rip/breeze/client/MathUtil10.clamp_2 (FFLjava/lang/String;Ljava/awt/Color;)V
      // 71: goto 78
      // 74: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: aload 0
      // 79: fload 6
      // 7b: fload 7
      // 7d: aload 3
      // 7e: aload 4
      // 80: invokespecial rip/breeze/client/MathUtil10.clamp_3 (FFLjava/lang/String;Ljava/awt/Color;)V
      // 83: return
      // try (0 -> 4): 4 java/lang/IllegalStateException
      // try (6 -> 11): 12 java/lang/IllegalStateException
      // try (8 -> 15): 15 java/lang/IllegalStateException
      // try (17 -> 23): 24 java/lang/IllegalStateException
      // try (20 -> 27): 27 java/lang/IllegalStateException
      // try (29 -> 34): 35 java/lang/IllegalStateException
      // try (49 -> 57): 58 java/lang/IllegalStateException
   }

   public void update(float var1, float var2, String var3, Color var4) {
      this.calculate(var1, var2, var3, var4, false);
   }

   public void update_1(float var1, float var2, String var3) {
      this.calculate(var1, var2, var3, new Color(255, 255, 255, 255), false);
   }

   public void toggle_2() {
      try {
         if (this.dataBuilder48_w != null) {
            this.dataBuilder48_w.initialize();
         }
      } catch (IllegalStateException var4) {
         throw getThrowable(var4);
      }

      try {
         if (this.dataBuilder48_x != null) {
            this.dataBuilder48_x.initialize();
         }
      } catch (IllegalStateException var5) {
         throw getThrowable(var5);
      }

      this.dataBuilder48_w = null;
      this.dataBuilder48_x = null;
      this.map_q.clear();
      this.bufferedImage_u = null;
      this.bufferedImage_v = null;
      this.dataBuilder49_y.initialize_2();
      this.dataBuilder49_z.initialize_2();
      this.dataBuilder49_A.initialize_2();
      this.dataBuilder47_B.update_1();
      this.dataBuilder47_C.update_1();
      this.dataBuilder47_D.update_1();
      this.dataBuilder47_E.update_1();
      this.dataBuilder47_F.update_1();
      synchronized (this.linkedHashMap_H) {
         this.linkedHashMap_H.clear();
      }

      this.fieldBool_G = false;
   }

   private void clamp_2(float param1, float param2, String param3, Color param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/MathUtil10.118581016125644L J
      // 003: ldc2_w 115018417592771
      // 006: lxor
      // 007: lstore 5
      // 009: aload 0
      // 00a: getfield rip/breeze/client/MathUtil10.dataBuilder49_A Lrip/breeze/client/RenderUtil35;
      // 00d: invokevirtual rip/breeze/client/RenderUtil35.initialize ()V
      // 010: aload 4
      // 012: ifnull 01e
      // 015: aload 4
      // 017: goto 021
      // 01a: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: getstatic java/awt/Color.WHITE Ljava/awt/Color;
      // 021: astore 7
      // 023: aload 7
      // 025: astore 8
      // 027: fload 1
      // 028: fstore 9
      // 02a: fload 1
      // 02b: fstore 10
      // 02d: fload 2
      // 02e: fstore 11
      // 030: aload 0
      // 031: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 034: ifeq 040
      // 037: fload 11
      // 039: goto 050
      // 03c: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03f: athrow
      // 040: fload 11
      // 042: aload 0
      // 043: getfield rip/breeze/client/MathUtil10.dialogSetting Ljava/awt/FontMetrics;
      // 046: invokevirtual java/awt/FontMetrics.getAscent ()I
      // 049: i2f
      // 04a: ldc 0.75
      // 04c: fmul
      // 04d: f2i
      // 04e: i2f
      // 04f: fadd
      // 050: fstore 12
      // 052: aload 0
      // 053: aload 3
      // 054: invokespecial rip/breeze/client/MathUtil10.getClientUtil100 (Ljava/lang/String;)Lrip/breeze/client/Util42;
      // 057: astore 13
      // 059: aload 13
      // 05b: getfield rip/breeze/client/Util42.fieldInt_g I
      // 05e: istore 14
      // 060: aload 13
      // 062: getfield rip/breeze/client/Util42.arr_e [B
      // 065: astore 15
      // 067: aload 13
      // 069: getfield rip/breeze/client/Util42.arr_f [I
      // 06c: astore 16
      // 06e: bipush -1
      // 06f: istore 17
      // 071: bipush 0
      // 072: istore 18
      // 074: iload 18
      // 076: iload 14
      // 078: if_icmpge 48e
      // 07b: aload 15
      // 07d: iload 18
      // 07f: baload
      // 080: istore 19
      // 082: iload 19
      // 084: ifne 0b9
      // 087: aload 16
      // 089: iload 18
      // 08b: iaload
      // 08c: istore 20
      // 08e: iload 17
      // 090: bipush -1
      // 091: if_icmpeq 0a2
      // 094: fload 10
      // 096: aload 0
      // 097: iload 17
      // 099: iload 20
      // 09b: invokespecial rip/breeze/client/MathUtil10.clamp_7 (II)I
      // 09e: i2f
      // 09f: fadd
      // 0a0: fstore 10
      // 0a2: fload 10
      // 0a4: aload 0
      // 0a5: iload 20
      // 0a7: fload 10
      // 0a9: fload 12
      // 0ab: invokespecial rip/breeze/client/MathUtil10.calculate_3 (IFF)I
      // 0ae: i2f
      // 0af: fadd
      // 0b0: fstore 10
      // 0b2: iload 20
      // 0b4: istore 17
      // 0b6: goto 488
      // 0b9: iload 19
      // 0bb: bipush 1
      // 0bc: if_icmpne 0f6
      // 0bf: aload 0
      // 0c0: aload 8
      // 0c2: invokespecial rip/breeze/client/MathUtil10.update_2 (Ljava/awt/Color;)V
      // 0c5: fload 9
      // 0c7: fstore 10
      // 0c9: fload 11
      // 0cb: aload 0
      // 0cc: invokevirtual rip/breeze/client/MathUtil10.clamp_5 ()I
      // 0cf: i2f
      // 0d0: fadd
      // 0d1: fstore 11
      // 0d3: aload 0
      // 0d4: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 0d7: ifeq 0e3
      // 0da: fload 11
      // 0dc: goto 0ee
      // 0df: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: fload 11
      // 0e5: aload 0
      // 0e6: getfield rip/breeze/client/MathUtil10.dialogSetting Ljava/awt/FontMetrics;
      // 0e9: invokevirtual java/awt/FontMetrics.getAscent ()I
      // 0ec: i2f
      // 0ed: fadd
      // 0ee: fstore 12
      // 0f0: bipush -1
      // 0f1: istore 17
      // 0f3: goto 488
      // 0f6: iload 19
      // 0f8: bipush 2
      // 0f9: if_icmpne 15c
      // 0fc: aload 0
      // 0fd: aload 8
      // 0ff: invokespecial rip/breeze/client/MathUtil10.update_2 (Ljava/awt/Color;)V
      // 102: aload 0
      // 103: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 106: ifeq 11f
      // 109: goto 110
      // 10c: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: bipush 8
      // 112: aload 0
      // 113: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 116: imul
      // 117: i2f
      // 118: goto 12d
      // 11b: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11e: athrow
      // 11f: fconst_1
      // 120: aload 0
      // 121: getfield rip/breeze/client/MathUtil10.dialogSetting Ljava/awt/FontMetrics;
      // 124: bipush 32
      // 126: invokevirtual java/awt/FontMetrics.charWidth (C)I
      // 129: i2f
      // 12a: invokestatic java/lang/Math.max (FF)F
      // 12d: fstore 20
      // 12f: fload 20
      // 131: ldc_w 4.0
      // 134: fmul
      // 135: fstore 21
      // 137: fload 10
      // 139: fload 9
      // 13b: fsub
      // 13c: fstore 22
      // 13e: fload 22
      // 140: fload 21
      // 142: fdiv
      // 143: f2d
      // 144: invokestatic java/lang/Math.floor (D)D
      // 147: d2f
      // 148: fconst_1
      // 149: fadd
      // 14a: fload 21
      // 14c: fmul
      // 14d: fstore 23
      // 14f: fload 9
      // 151: fload 23
      // 153: fadd
      // 154: fstore 10
      // 156: bipush -1
      // 157: istore 17
      // 159: goto 488
      // 15c: iload 19
      // 15e: bipush 3
      // 15f: if_icmpne 488
      // 162: aload 0
      // 163: aload 8
      // 165: invokespecial rip/breeze/client/MathUtil10.update_2 (Ljava/awt/Color;)V
      // 168: aload 16
      // 16a: iload 18
      // 16c: iaload
      // 16d: i2c
      // 16e: istore 20
      // 170: iload 20
      // 172: tableswitch 790 48 114 282 302 324 346 370 392 416 440 466 489 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 790 513 537 562 586 611 636 780 662 681 714 747 790 790 790 790 790 790 783
      // 28c: new java/awt/Color
      // 28f: dup
      // 290: bipush 0
      // 291: bipush 0
      // 292: bipush 0
      // 293: aload 8
      // 295: invokevirtual java/awt/Color.getAlpha ()I
      // 298: invokespecial java/awt/Color.<init> (IIII)V
      // 29b: astore 8
      // 29d: goto 488
      // 2a0: new java/awt/Color
      // 2a3: dup
      // 2a4: bipush 0
      // 2a5: bipush 0
      // 2a6: sipush 170
      // 2a9: aload 8
      // 2ab: invokevirtual java/awt/Color.getAlpha ()I
      // 2ae: invokespecial java/awt/Color.<init> (IIII)V
      // 2b1: astore 8
      // 2b3: goto 488
      // 2b6: new java/awt/Color
      // 2b9: dup
      // 2ba: bipush 0
      // 2bb: sipush 170
      // 2be: bipush 0
      // 2bf: aload 8
      // 2c1: invokevirtual java/awt/Color.getAlpha ()I
      // 2c4: invokespecial java/awt/Color.<init> (IIII)V
      // 2c7: astore 8
      // 2c9: goto 488
      // 2cc: new java/awt/Color
      // 2cf: dup
      // 2d0: bipush 0
      // 2d1: sipush 170
      // 2d4: sipush 170
      // 2d7: aload 8
      // 2d9: invokevirtual java/awt/Color.getAlpha ()I
      // 2dc: invokespecial java/awt/Color.<init> (IIII)V
      // 2df: astore 8
      // 2e1: goto 488
      // 2e4: new java/awt/Color
      // 2e7: dup
      // 2e8: sipush 170
      // 2eb: bipush 0
      // 2ec: bipush 0
      // 2ed: aload 8
      // 2ef: invokevirtual java/awt/Color.getAlpha ()I
      // 2f2: invokespecial java/awt/Color.<init> (IIII)V
      // 2f5: astore 8
      // 2f7: goto 488
      // 2fa: new java/awt/Color
      // 2fd: dup
      // 2fe: sipush 170
      // 301: bipush 0
      // 302: sipush 170
      // 305: aload 8
      // 307: invokevirtual java/awt/Color.getAlpha ()I
      // 30a: invokespecial java/awt/Color.<init> (IIII)V
      // 30d: astore 8
      // 30f: goto 488
      // 312: new java/awt/Color
      // 315: dup
      // 316: sipush 255
      // 319: sipush 170
      // 31c: bipush 0
      // 31d: aload 8
      // 31f: invokevirtual java/awt/Color.getAlpha ()I
      // 322: invokespecial java/awt/Color.<init> (IIII)V
      // 325: astore 8
      // 327: goto 488
      // 32a: new java/awt/Color
      // 32d: dup
      // 32e: sipush 170
      // 331: sipush 170
      // 334: sipush 170
      // 337: aload 8
      // 339: invokevirtual java/awt/Color.getAlpha ()I
      // 33c: invokespecial java/awt/Color.<init> (IIII)V
      // 33f: astore 8
      // 341: goto 488
      // 344: new java/awt/Color
      // 347: dup
      // 348: bipush 85
      // 34a: bipush 85
      // 34c: bipush 85
      // 34e: aload 8
      // 350: invokevirtual java/awt/Color.getAlpha ()I
      // 353: invokespecial java/awt/Color.<init> (IIII)V
      // 356: astore 8
      // 358: goto 488
      // 35b: new java/awt/Color
      // 35e: dup
      // 35f: bipush 85
      // 361: bipush 85
      // 363: sipush 255
      // 366: aload 8
      // 368: invokevirtual java/awt/Color.getAlpha ()I
      // 36b: invokespecial java/awt/Color.<init> (IIII)V
      // 36e: astore 8
      // 370: goto 488
      // 373: new java/awt/Color
      // 376: dup
      // 377: bipush 85
      // 379: sipush 255
      // 37c: bipush 85
      // 37e: aload 8
      // 380: invokevirtual java/awt/Color.getAlpha ()I
      // 383: invokespecial java/awt/Color.<init> (IIII)V
      // 386: astore 8
      // 388: goto 488
      // 38b: new java/awt/Color
      // 38e: dup
      // 38f: bipush 85
      // 391: sipush 255
      // 394: sipush 255
      // 397: aload 8
      // 399: invokevirtual java/awt/Color.getAlpha ()I
      // 39c: invokespecial java/awt/Color.<init> (IIII)V
      // 39f: astore 8
      // 3a1: goto 488
      // 3a4: new java/awt/Color
      // 3a7: dup
      // 3a8: sipush 255
      // 3ab: bipush 85
      // 3ad: bipush 85
      // 3af: aload 8
      // 3b1: invokevirtual java/awt/Color.getAlpha ()I
      // 3b4: invokespecial java/awt/Color.<init> (IIII)V
      // 3b7: astore 8
      // 3b9: goto 488
      // 3bc: new java/awt/Color
      // 3bf: dup
      // 3c0: sipush 255
      // 3c3: bipush 85
      // 3c5: sipush 255
      // 3c8: aload 8
      // 3ca: invokevirtual java/awt/Color.getAlpha ()I
      // 3cd: invokespecial java/awt/Color.<init> (IIII)V
      // 3d0: astore 8
      // 3d2: goto 488
      // 3d5: new java/awt/Color
      // 3d8: dup
      // 3d9: sipush 255
      // 3dc: sipush 255
      // 3df: bipush 85
      // 3e1: aload 8
      // 3e3: invokevirtual java/awt/Color.getAlpha ()I
      // 3e6: invokespecial java/awt/Color.<init> (IIII)V
      // 3e9: astore 8
      // 3eb: goto 488
      // 3ee: new java/awt/Color
      // 3f1: dup
      // 3f2: sipush 255
      // 3f5: sipush 255
      // 3f8: sipush 255
      // 3fb: aload 8
      // 3fd: invokevirtual java/awt/Color.getAlpha ()I
      // 400: invokespecial java/awt/Color.<init> (IIII)V
      // 403: astore 8
      // 405: goto 488
      // 408: invokestatic rip/breeze/client/BreezeClient.getKeybindSettings ()Lrip/breeze/KeybindSettings;
      // 40b: invokevirtual rip/breeze/KeybindSettings.getColor ()Ljava/awt/Color;
      // 40e: aload 8
      // 410: invokevirtual java/awt/Color.getAlpha ()I
      // 413: invokestatic rip/breeze/client/MathUtil10.clamp_4 (Ljava/awt/Color;I)Ljava/awt/Color;
      // 416: astore 8
      // 418: goto 488
      // 41b: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 41e: sipush 21489
      // 421: ldc2_w 1678985943877401228
      // 424: lload 5
      // 426: lxor
      // 427: invokedynamic c (IJ)Ljava/lang/String; bsm=rip/breeze/client/MathUtil10.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42c: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 42f: aload 8
      // 431: invokevirtual java/awt/Color.getAlpha ()I
      // 434: invokestatic rip/breeze/client/MathUtil10.clamp_4 (Ljava/awt/Color;I)Ljava/awt/Color;
      // 437: astore 8
      // 439: goto 488
      // 43c: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 43f: sipush 7668
      // 442: ldc2_w 8589297211949741186
      // 445: lload 5
      // 447: lxor
      // 448: invokedynamic c (IJ)Ljava/lang/String; bsm=rip/breeze/client/MathUtil10.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44d: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 450: aload 8
      // 452: invokevirtual java/awt/Color.getAlpha ()I
      // 455: invokestatic rip/breeze/client/MathUtil10.clamp_4 (Ljava/awt/Color;I)Ljava/awt/Color;
      // 458: astore 8
      // 45a: goto 488
      // 45d: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 460: sipush 21140
      // 463: ldc2_w 1841455141743508456
      // 466: lload 5
      // 468: lxor
      // 469: invokedynamic c (IJ)Ljava/lang/String; bsm=rip/breeze/client/MathUtil10.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46e: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 471: aload 8
      // 473: invokevirtual java/awt/Color.getAlpha ()I
      // 476: invokestatic rip/breeze/client/MathUtil10.clamp_4 (Ljava/awt/Color;I)Ljava/awt/Color;
      // 479: astore 8
      // 47b: goto 488
      // 47e: goto 488
      // 481: aload 7
      // 483: astore 8
      // 485: goto 488
      // 488: iinc 18 1
      // 48b: goto 074
      // 48e: aload 0
      // 48f: aload 8
      // 491: invokespecial rip/breeze/client/MathUtil10.update_2 (Ljava/awt/Color;)V
      // 494: return
      // try (4 -> 11): 11 java/lang/IllegalStateException
      // try (23 -> 28): 28 java/lang/IllegalStateException
      // try (108 -> 113): 113 java/lang/IllegalStateException
      // try (125 -> 134): 135 java/lang/IllegalStateException
      // try (128 -> 143): 143 java/lang/IllegalStateException
   }

   private void update_2(Color var1) {
      try {
         if (!this.dataBuilder49_A.isValid()) {
            return;
         }
      } catch (IllegalStateException var2) {
         throw getThrowable(var2);
      }

      this.dataBuilder47_B.calculate(this.dataBuilder49_A, this.dataBuilder48_w, getColor(var1));
      this.dataBuilder49_A.initialize();
   }

   private void clamp_3(float param1, float param2, String param3, Color param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/MathUtil10.118581016125644L J
      // 003: ldc2_w 34772030956397
      // 006: lxor
      // 007: lstore 5
      // 009: aload 0
      // 00a: getfield rip/breeze/client/MathUtil10.dataBuilder49_y Lrip/breeze/client/RenderUtil35;
      // 00d: invokevirtual rip/breeze/client/RenderUtil35.initialize ()V
      // 010: aload 0
      // 011: getfield rip/breeze/client/MathUtil10.dataBuilder49_z Lrip/breeze/client/RenderUtil35;
      // 014: invokevirtual rip/breeze/client/RenderUtil35.initialize ()V
      // 017: invokestatic rip/breeze/client/BreezeClient.getKeybindSettings ()Lrip/breeze/KeybindSettings;
      // 01a: invokevirtual rip/breeze/KeybindSettings.getColorMode2 ()Lrip/breeze/ColorMode2;
      // 01d: astore 7
      // 01f: aload 4
      // 021: ifnull 02d
      // 024: aload 4
      // 026: goto 030
      // 029: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: getstatic java/awt/Color.WHITE Ljava/awt/Color;
      // 030: astore 8
      // 032: aload 8
      // 034: astore 9
      // 036: bipush 0
      // 037: istore 10
      // 039: bipush 0
      // 03a: istore 11
      // 03c: fload 1
      // 03d: fstore 12
      // 03f: fload 1
      // 040: fstore 13
      // 042: fload 2
      // 043: fstore 14
      // 045: aload 0
      // 046: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 049: ifeq 055
      // 04c: fload 14
      // 04e: goto 065
      // 051: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: fload 14
      // 057: aload 0
      // 058: getfield rip/breeze/client/MathUtil10.dialogSetting Ljava/awt/FontMetrics;
      // 05b: invokevirtual java/awt/FontMetrics.getAscent ()I
      // 05e: i2f
      // 05f: ldc 0.75
      // 061: fmul
      // 062: f2i
      // 063: i2f
      // 064: fadd
      // 065: fstore 15
      // 067: aload 0
      // 068: aload 3
      // 069: invokespecial rip/breeze/client/MathUtil10.getClientUtil100 (Ljava/lang/String;)Lrip/breeze/client/Util42;
      // 06c: astore 16
      // 06e: aload 16
      // 070: getfield rip/breeze/client/Util42.fieldInt_g I
      // 073: istore 17
      // 075: aload 16
      // 077: getfield rip/breeze/client/Util42.arr_e [B
      // 07a: astore 18
      // 07c: aload 16
      // 07e: getfield rip/breeze/client/Util42.arr_f [I
      // 081: astore 19
      // 083: bipush -1
      // 084: istore 20
      // 086: bipush 0
      // 087: istore 21
      // 089: iload 21
      // 08b: iload 17
      // 08d: if_icmpge 512
      // 090: aload 18
      // 092: iload 21
      // 094: baload
      // 095: istore 22
      // 097: iload 22
      // 099: ifne 0d0
      // 09c: aload 19
      // 09e: iload 21
      // 0a0: iaload
      // 0a1: istore 23
      // 0a3: iload 20
      // 0a5: bipush -1
      // 0a6: if_icmpeq 0b7
      // 0a9: fload 13
      // 0ab: aload 0
      // 0ac: iload 20
      // 0ae: iload 23
      // 0b0: invokespecial rip/breeze/client/MathUtil10.clamp_7 (II)I
      // 0b3: i2f
      // 0b4: fadd
      // 0b5: fstore 13
      // 0b7: fload 13
      // 0b9: aload 0
      // 0ba: iload 23
      // 0bc: fload 13
      // 0be: fload 15
      // 0c0: iload 10
      // 0c2: invokespecial rip/breeze/client/MathUtil10.calculate_2 (IFFZ)I
      // 0c5: i2f
      // 0c6: fadd
      // 0c7: fstore 13
      // 0c9: iload 23
      // 0cb: istore 20
      // 0cd: goto 50c
      // 0d0: iload 22
      // 0d2: bipush 1
      // 0d3: if_icmpne 111
      // 0d6: aload 0
      // 0d7: aload 9
      // 0d9: iload 10
      // 0db: iload 11
      // 0dd: invokespecial rip/breeze/client/MathUtil10.processAll_3 (Ljava/awt/Color;ZZ)V
      // 0e0: fload 12
      // 0e2: fstore 13
      // 0e4: fload 14
      // 0e6: aload 0
      // 0e7: invokevirtual rip/breeze/client/MathUtil10.clamp_5 ()I
      // 0ea: i2f
      // 0eb: fadd
      // 0ec: fstore 14
      // 0ee: aload 0
      // 0ef: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 0f2: ifeq 0fe
      // 0f5: fload 14
      // 0f7: goto 109
      // 0fa: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: fload 14
      // 100: aload 0
      // 101: getfield rip/breeze/client/MathUtil10.dialogSetting Ljava/awt/FontMetrics;
      // 104: invokevirtual java/awt/FontMetrics.getAscent ()I
      // 107: i2f
      // 108: fadd
      // 109: fstore 15
      // 10b: bipush -1
      // 10c: istore 20
      // 10e: goto 50c
      // 111: iload 22
      // 113: bipush 2
      // 114: if_icmpne 17b
      // 117: aload 0
      // 118: aload 9
      // 11a: iload 10
      // 11c: iload 11
      // 11e: invokespecial rip/breeze/client/MathUtil10.processAll_3 (Ljava/awt/Color;ZZ)V
      // 121: aload 0
      // 122: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 125: ifeq 13e
      // 128: goto 12f
      // 12b: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: bipush 8
      // 131: aload 0
      // 132: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 135: imul
      // 136: i2f
      // 137: goto 14c
      // 13a: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: fconst_1
      // 13f: aload 0
      // 140: getfield rip/breeze/client/MathUtil10.dialogSetting Ljava/awt/FontMetrics;
      // 143: bipush 32
      // 145: invokevirtual java/awt/FontMetrics.charWidth (C)I
      // 148: i2f
      // 149: invokestatic java/lang/Math.max (FF)F
      // 14c: fstore 23
      // 14e: fload 23
      // 150: ldc_w 4.0
      // 153: fmul
      // 154: fstore 24
      // 156: fload 13
      // 158: fload 12
      // 15a: fsub
      // 15b: fstore 25
      // 15d: fload 25
      // 15f: fload 24
      // 161: fdiv
      // 162: f2d
      // 163: invokestatic java/lang/Math.floor (D)D
      // 166: d2f
      // 167: fconst_1
      // 168: fadd
      // 169: fload 24
      // 16b: fmul
      // 16c: fstore 26
      // 16e: fload 12
      // 170: fload 26
      // 172: fadd
      // 173: fstore 13
      // 175: bipush -1
      // 176: istore 20
      // 178: goto 50c
      // 17b: iload 22
      // 17d: bipush 3
      // 17e: if_icmpne 50c
      // 181: aload 0
      // 182: aload 9
      // 184: iload 10
      // 186: iload 11
      // 188: invokespecial rip/breeze/client/MathUtil10.processAll_3 (Ljava/awt/Color;ZZ)V
      // 18b: aload 19
      // 18d: iload 21
      // 18f: iaload
      // 190: i2c
      // 191: istore 23
      // 193: iload 23
      // 195: tableswitch 887 48 114 283 306 331 356 383 408 435 462 491 517 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 887 544 571 599 626 654 682 711 717 766 802 838 887 887 887 887 887 887 874
      // 2b0: new java/awt/Color
      // 2b3: dup
      // 2b4: bipush 0
      // 2b5: bipush 0
      // 2b6: bipush 0
      // 2b7: aload 9
      // 2b9: invokevirtual java/awt/Color.getAlpha ()I
      // 2bc: invokespecial java/awt/Color.<init> (IIII)V
      // 2bf: astore 9
      // 2c1: bipush 0
      // 2c2: istore 11
      // 2c4: goto 50c
      // 2c7: new java/awt/Color
      // 2ca: dup
      // 2cb: bipush 0
      // 2cc: bipush 0
      // 2cd: sipush 170
      // 2d0: aload 9
      // 2d2: invokevirtual java/awt/Color.getAlpha ()I
      // 2d5: invokespecial java/awt/Color.<init> (IIII)V
      // 2d8: astore 9
      // 2da: bipush 0
      // 2db: istore 11
      // 2dd: goto 50c
      // 2e0: new java/awt/Color
      // 2e3: dup
      // 2e4: bipush 0
      // 2e5: sipush 170
      // 2e8: bipush 0
      // 2e9: aload 9
      // 2eb: invokevirtual java/awt/Color.getAlpha ()I
      // 2ee: invokespecial java/awt/Color.<init> (IIII)V
      // 2f1: astore 9
      // 2f3: bipush 0
      // 2f4: istore 11
      // 2f6: goto 50c
      // 2f9: new java/awt/Color
      // 2fc: dup
      // 2fd: bipush 0
      // 2fe: sipush 170
      // 301: sipush 170
      // 304: aload 9
      // 306: invokevirtual java/awt/Color.getAlpha ()I
      // 309: invokespecial java/awt/Color.<init> (IIII)V
      // 30c: astore 9
      // 30e: bipush 0
      // 30f: istore 11
      // 311: goto 50c
      // 314: new java/awt/Color
      // 317: dup
      // 318: sipush 170
      // 31b: bipush 0
      // 31c: bipush 0
      // 31d: aload 9
      // 31f: invokevirtual java/awt/Color.getAlpha ()I
      // 322: invokespecial java/awt/Color.<init> (IIII)V
      // 325: astore 9
      // 327: bipush 0
      // 328: istore 11
      // 32a: goto 50c
      // 32d: new java/awt/Color
      // 330: dup
      // 331: sipush 170
      // 334: bipush 0
      // 335: sipush 170
      // 338: aload 9
      // 33a: invokevirtual java/awt/Color.getAlpha ()I
      // 33d: invokespecial java/awt/Color.<init> (IIII)V
      // 340: astore 9
      // 342: bipush 0
      // 343: istore 11
      // 345: goto 50c
      // 348: new java/awt/Color
      // 34b: dup
      // 34c: sipush 255
      // 34f: sipush 170
      // 352: bipush 0
      // 353: aload 9
      // 355: invokevirtual java/awt/Color.getAlpha ()I
      // 358: invokespecial java/awt/Color.<init> (IIII)V
      // 35b: astore 9
      // 35d: bipush 0
      // 35e: istore 11
      // 360: goto 50c
      // 363: new java/awt/Color
      // 366: dup
      // 367: sipush 170
      // 36a: sipush 170
      // 36d: sipush 170
      // 370: aload 9
      // 372: invokevirtual java/awt/Color.getAlpha ()I
      // 375: invokespecial java/awt/Color.<init> (IIII)V
      // 378: astore 9
      // 37a: bipush 0
      // 37b: istore 11
      // 37d: goto 50c
      // 380: new java/awt/Color
      // 383: dup
      // 384: bipush 85
      // 386: bipush 85
      // 388: bipush 85
      // 38a: aload 9
      // 38c: invokevirtual java/awt/Color.getAlpha ()I
      // 38f: invokespecial java/awt/Color.<init> (IIII)V
      // 392: astore 9
      // 394: bipush 0
      // 395: istore 11
      // 397: goto 50c
      // 39a: new java/awt/Color
      // 39d: dup
      // 39e: bipush 85
      // 3a0: bipush 85
      // 3a2: sipush 255
      // 3a5: aload 9
      // 3a7: invokevirtual java/awt/Color.getAlpha ()I
      // 3aa: invokespecial java/awt/Color.<init> (IIII)V
      // 3ad: astore 9
      // 3af: bipush 0
      // 3b0: istore 11
      // 3b2: goto 50c
      // 3b5: new java/awt/Color
      // 3b8: dup
      // 3b9: bipush 85
      // 3bb: sipush 255
      // 3be: bipush 85
      // 3c0: aload 9
      // 3c2: invokevirtual java/awt/Color.getAlpha ()I
      // 3c5: invokespecial java/awt/Color.<init> (IIII)V
      // 3c8: astore 9
      // 3ca: bipush 0
      // 3cb: istore 11
      // 3cd: goto 50c
      // 3d0: new java/awt/Color
      // 3d3: dup
      // 3d4: bipush 85
      // 3d6: sipush 255
      // 3d9: sipush 255
      // 3dc: aload 9
      // 3de: invokevirtual java/awt/Color.getAlpha ()I
      // 3e1: invokespecial java/awt/Color.<init> (IIII)V
      // 3e4: astore 9
      // 3e6: bipush 0
      // 3e7: istore 11
      // 3e9: goto 50c
      // 3ec: new java/awt/Color
      // 3ef: dup
      // 3f0: sipush 255
      // 3f3: bipush 85
      // 3f5: bipush 85
      // 3f7: aload 9
      // 3f9: invokevirtual java/awt/Color.getAlpha ()I
      // 3fc: invokespecial java/awt/Color.<init> (IIII)V
      // 3ff: astore 9
      // 401: bipush 0
      // 402: istore 11
      // 404: goto 50c
      // 407: new java/awt/Color
      // 40a: dup
      // 40b: sipush 255
      // 40e: bipush 85
      // 410: sipush 255
      // 413: aload 9
      // 415: invokevirtual java/awt/Color.getAlpha ()I
      // 418: invokespecial java/awt/Color.<init> (IIII)V
      // 41b: astore 9
      // 41d: bipush 0
      // 41e: istore 11
      // 420: goto 50c
      // 423: new java/awt/Color
      // 426: dup
      // 427: sipush 255
      // 42a: sipush 255
      // 42d: bipush 85
      // 42f: aload 9
      // 431: invokevirtual java/awt/Color.getAlpha ()I
      // 434: invokespecial java/awt/Color.<init> (IIII)V
      // 437: astore 9
      // 439: bipush 0
      // 43a: istore 11
      // 43c: goto 50c
      // 43f: new java/awt/Color
      // 442: dup
      // 443: sipush 255
      // 446: sipush 255
      // 449: sipush 255
      // 44c: aload 9
      // 44e: invokevirtual java/awt/Color.getAlpha ()I
      // 451: invokespecial java/awt/Color.<init> (IIII)V
      // 454: astore 9
      // 456: bipush 0
      // 457: istore 11
      // 459: goto 50c
      // 45c: bipush 1
      // 45d: istore 10
      // 45f: goto 50c
      // 462: aload 7
      // 464: getstatic rip/breeze/ColorMode2.NONE Lrip/breeze/ColorMode2;
      // 467: if_acmpne 480
      // 46a: invokestatic rip/breeze/client/BreezeClient.getKeybindSettings ()Lrip/breeze/KeybindSettings;
      // 46d: invokevirtual rip/breeze/KeybindSettings.getColor ()Ljava/awt/Color;
      // 470: aload 9
      // 472: invokevirtual java/awt/Color.getAlpha ()I
      // 475: invokestatic rip/breeze/client/MathUtil10.clamp_4 (Ljava/awt/Color;I)Ljava/awt/Color;
      // 478: astore 9
      // 47a: bipush 0
      // 47b: istore 11
      // 47d: goto 50c
      // 480: getstatic java/awt/Color.WHITE Ljava/awt/Color;
      // 483: aload 9
      // 485: invokevirtual java/awt/Color.getAlpha ()I
      // 488: invokestatic rip/breeze/client/MathUtil10.clamp_4 (Ljava/awt/Color;I)Ljava/awt/Color;
      // 48b: astore 9
      // 48d: bipush 1
      // 48e: istore 11
      // 490: goto 50c
      // 493: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 496: sipush 6210
      // 499: ldc2_w 3080521261301500822
      // 49c: lload 5
      // 49e: lxor
      // 49f: invokedynamic c (IJ)Ljava/lang/String; bsm=rip/breeze/client/MathUtil10.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a4: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 4a7: aload 9
      // 4a9: invokevirtual java/awt/Color.getAlpha ()I
      // 4ac: invokestatic rip/breeze/client/MathUtil10.clamp_4 (Ljava/awt/Color;I)Ljava/awt/Color;
      // 4af: astore 9
      // 4b1: bipush 0
      // 4b2: istore 11
      // 4b4: goto 50c
      // 4b7: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 4ba: sipush 17829
      // 4bd: ldc2_w 8073660697693738611
      // 4c0: lload 5
      // 4c2: lxor
      // 4c3: invokedynamic c (IJ)Ljava/lang/String; bsm=rip/breeze/client/MathUtil10.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c8: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 4cb: aload 9
      // 4cd: invokevirtual java/awt/Color.getAlpha ()I
      // 4d0: invokestatic rip/breeze/client/MathUtil10.clamp_4 (Ljava/awt/Color;I)Ljava/awt/Color;
      // 4d3: astore 9
      // 4d5: bipush 0
      // 4d6: istore 11
      // 4d8: goto 50c
      // 4db: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 4de: sipush 20101
      // 4e1: ldc2_w 8813742716105907540
      // 4e4: lload 5
      // 4e6: lxor
      // 4e7: invokedynamic c (IJ)Ljava/lang/String; bsm=rip/breeze/client/MathUtil10.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ec: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 4ef: aload 9
      // 4f1: invokevirtual java/awt/Color.getAlpha ()I
      // 4f4: invokestatic rip/breeze/client/MathUtil10.clamp_4 (Ljava/awt/Color;I)Ljava/awt/Color;
      // 4f7: astore 9
      // 4f9: bipush 0
      // 4fa: istore 11
      // 4fc: goto 50c
      // 4ff: aload 8
      // 501: astore 9
      // 503: bipush 0
      // 504: istore 10
      // 506: bipush 0
      // 507: istore 11
      // 509: goto 50c
      // 50c: iinc 21 1
      // 50f: goto 089
      // 512: aload 0
      // 513: aload 9
      // 515: iload 10
      // 517: iload 11
      // 519: invokespecial rip/breeze/client/MathUtil10.processAll_3 (Ljava/awt/Color;ZZ)V
      // 51c: return
      // try (13 -> 17): 17 java/lang/IllegalStateException
      // try (33 -> 38): 38 java/lang/IllegalStateException
      // try (121 -> 126): 126 java/lang/IllegalStateException
      // try (138 -> 149): 150 java/lang/IllegalStateException
      // try (141 -> 158): 158 java/lang/IllegalStateException
   }

   private void processAll_3(Color param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: iload 2
      // 01: ifeq 4e
      // 04: aload 0
      // 05: getfield rip/breeze/client/MathUtil10.dataBuilder49_z Lrip/breeze/client/RenderUtil35;
      // 08: invokevirtual rip/breeze/client/RenderUtil35.isValid ()Z
      // 0b: ifeq 4e
      // 0e: goto 15
      // 11: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: iload 3
      // 16: ifeq 37
      // 19: goto 20
      // 1c: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield rip/breeze/client/MathUtil10.dataBuilder47_D Lrip/breeze/client/RenderUtil34;
      // 24: aload 0
      // 25: getfield rip/breeze/client/MathUtil10.dataBuilder49_z Lrip/breeze/client/RenderUtil35;
      // 28: aload 0
      // 29: getfield rip/breeze/client/MathUtil10.dataBuilder48_x Lrip/breeze/client/RaytraceResult;
      // 2c: aload 1
      // 2d: invokevirtual rip/breeze/client/RenderUtil34.calculate (Lrip/breeze/client/RenderUtil35;Lrip/breeze/client/RaytraceResult;Ljava/awt/Color;)V
      // 30: goto 47
      // 33: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: getfield rip/breeze/client/MathUtil10.dataBuilder47_F Lrip/breeze/client/RenderUtil34;
      // 3b: aload 0
      // 3c: getfield rip/breeze/client/MathUtil10.dataBuilder49_z Lrip/breeze/client/RenderUtil35;
      // 3f: aload 0
      // 40: getfield rip/breeze/client/MathUtil10.dataBuilder48_x Lrip/breeze/client/RaytraceResult;
      // 43: aload 1
      // 44: invokevirtual rip/breeze/client/RenderUtil34.calculate (Lrip/breeze/client/RenderUtil35;Lrip/breeze/client/RaytraceResult;Ljava/awt/Color;)V
      // 47: aload 0
      // 48: getfield rip/breeze/client/MathUtil10.dataBuilder49_z Lrip/breeze/client/RenderUtil35;
      // 4b: invokevirtual rip/breeze/client/RenderUtil35.initialize ()V
      // 4e: aload 0
      // 4f: getfield rip/breeze/client/MathUtil10.dataBuilder49_y Lrip/breeze/client/RenderUtil35;
      // 52: invokevirtual rip/breeze/client/RenderUtil35.isValid ()Z
      // 55: ifeq 91
      // 58: iload 3
      // 59: ifeq 7a
      // 5c: goto 63
      // 5f: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: getfield rip/breeze/client/MathUtil10.dataBuilder47_C Lrip/breeze/client/RenderUtil34;
      // 67: aload 0
      // 68: getfield rip/breeze/client/MathUtil10.dataBuilder49_y Lrip/breeze/client/RenderUtil35;
      // 6b: aload 0
      // 6c: getfield rip/breeze/client/MathUtil10.dataBuilder48_w Lrip/breeze/client/RaytraceResult;
      // 6f: aload 1
      // 70: invokevirtual rip/breeze/client/RenderUtil34.calculate (Lrip/breeze/client/RenderUtil35;Lrip/breeze/client/RaytraceResult;Ljava/awt/Color;)V
      // 73: goto 8a
      // 76: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield rip/breeze/client/MathUtil10.dataBuilder47_E Lrip/breeze/client/RenderUtil34;
      // 7e: aload 0
      // 7f: getfield rip/breeze/client/MathUtil10.dataBuilder49_y Lrip/breeze/client/RenderUtil35;
      // 82: aload 0
      // 83: getfield rip/breeze/client/MathUtil10.dataBuilder48_w Lrip/breeze/client/RaytraceResult;
      // 86: aload 1
      // 87: invokevirtual rip/breeze/client/RenderUtil34.calculate (Lrip/breeze/client/RenderUtil35;Lrip/breeze/client/RaytraceResult;Ljava/awt/Color;)V
      // 8a: aload 0
      // 8b: getfield rip/breeze/client/MathUtil10.dataBuilder49_y Lrip/breeze/client/RenderUtil35;
      // 8e: invokevirtual rip/breeze/client/RenderUtil35.initialize ()V
      // 91: return
      // try (0 -> 6): 7 java/lang/IllegalStateException
      // try (2 -> 11): 12 java/lang/IllegalStateException
      // try (9 -> 23): 23 java/lang/IllegalStateException
      // try (36 -> 42): 43 java/lang/IllegalStateException
      // try (40 -> 54): 54 java/lang/IllegalStateException
   }

   private int calculate_2(int param1, float param2, float param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield rip/breeze/client/MathUtil10.map_q Ljava/util/Map;
      // 004: iload 1
      // 005: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 008: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 00d: checkcast rip/breeze/client/Util129
      // 010: astore 5
      // 012: aload 5
      // 014: ifnonnull 02a
      // 017: aload 0
      // 018: getfield rip/breeze/client/MathUtil10.map_q Ljava/util/Map;
      // 01b: bipush 63
      // 01d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 020: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 025: checkcast rip/breeze/client/Util129
      // 028: astore 5
      // 02a: aload 5
      // 02c: ifnonnull 055
      // 02f: aload 0
      // 030: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 033: ifeq 04b
      // 036: goto 03d
      // 039: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: bipush 8
      // 03f: aload 0
      // 040: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 043: imul
      // 044: goto 054
      // 047: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield rip/breeze/client/MathUtil10.dialogSetting Ljava/awt/FontMetrics;
      // 04f: bipush 63
      // 051: invokevirtual java/awt/FontMetrics.charWidth (C)I
      // 054: ireturn
      // 055: iload 1
      // 056: bipush 32
      // 058: if_icmpne 065
      // 05b: aload 5
      // 05d: getfield rip/breeze/client/Util129.fieldInt_f I
      // 060: ireturn
      // 061: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: aload 5
      // 067: getfield rip/breeze/client/Util129.fieldInt_b I
      // 06a: i2f
      // 06b: aload 0
      // 06c: getfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 06f: i2f
      // 070: fdiv
      // 071: fstore 6
      // 073: aload 5
      // 075: getfield rip/breeze/client/Util129.fieldInt_b I
      // 078: aload 5
      // 07a: getfield rip/breeze/client/Util129.fieldInt_d I
      // 07d: iadd
      // 07e: i2f
      // 07f: aload 0
      // 080: getfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 083: i2f
      // 084: fdiv
      // 085: fstore 7
      // 087: aload 5
      // 089: getfield rip/breeze/client/Util129.fieldInt_c I
      // 08c: i2f
      // 08d: aload 0
      // 08e: getfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 091: i2f
      // 092: fdiv
      // 093: fstore 8
      // 095: aload 5
      // 097: getfield rip/breeze/client/Util129.fieldInt_c I
      // 09a: aload 5
      // 09c: getfield rip/breeze/client/Util129.fieldInt_e I
      // 09f: iadd
      // 0a0: i2f
      // 0a1: aload 0
      // 0a2: getfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 0a5: i2f
      // 0a6: fdiv
      // 0a7: fstore 9
      // 0a9: fload 2
      // 0aa: aload 5
      // 0ac: getfield rip/breeze/client/Util129.fieldInt_h I
      // 0af: i2f
      // 0b0: fadd
      // 0b1: fstore 10
      // 0b3: fload 3
      // 0b4: aload 5
      // 0b6: getfield rip/breeze/client/Util129.fieldInt_g I
      // 0b9: i2f
      // 0ba: fadd
      // 0bb: fstore 11
      // 0bd: fload 10
      // 0bf: aload 5
      // 0c1: getfield rip/breeze/client/Util129.fieldInt_d I
      // 0c4: i2f
      // 0c5: fadd
      // 0c6: fstore 12
      // 0c8: fload 11
      // 0ca: aload 5
      // 0cc: getfield rip/breeze/client/Util129.fieldInt_e I
      // 0cf: i2f
      // 0d0: fadd
      // 0d1: fstore 13
      // 0d3: aload 0
      // 0d4: getfield rip/breeze/client/MathUtil10.dataBuilder49_y Lrip/breeze/client/RenderUtil35;
      // 0d7: fload 10
      // 0d9: fload 11
      // 0db: fload 12
      // 0dd: fload 13
      // 0df: fload 6
      // 0e1: fload 8
      // 0e3: fload 7
      // 0e5: fload 9
      // 0e7: invokevirtual rip/breeze/client/RenderUtil35.calculate_3 (FFFFFFFF)V
      // 0ea: iload 4
      // 0ec: ifeq 10d
      // 0ef: aload 0
      // 0f0: getfield rip/breeze/client/MathUtil10.dataBuilder49_z Lrip/breeze/client/RenderUtil35;
      // 0f3: fload 10
      // 0f5: fload 11
      // 0f7: fload 12
      // 0f9: fload 13
      // 0fb: fload 6
      // 0fd: fload 8
      // 0ff: fload 7
      // 101: fload 9
      // 103: invokevirtual rip/breeze/client/RenderUtil35.calculate_3 (FFFFFFFF)V
      // 106: goto 10d
      // 109: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: aload 5
      // 10f: getfield rip/breeze/client/Util129.fieldInt_f I
      // 112: ireturn
      // try (16 -> 21): 22 java/lang/IllegalStateException
      // try (18 -> 29): 29 java/lang/IllegalStateException
      // try (36 -> 42): 42 java/lang/IllegalStateException
      // try (106 -> 130): 131 java/lang/IllegalStateException
   }

   private int calculate_3(int param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/client/MathUtil10.map_q Ljava/util/Map;
      // 04: iload 1
      // 05: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d: checkcast rip/breeze/client/Util129
      // 10: astore 4
      // 12: aload 4
      // 14: ifnonnull 2a
      // 17: aload 0
      // 18: getfield rip/breeze/client/MathUtil10.map_q Ljava/util/Map;
      // 1b: bipush 63
      // 1d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 20: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 25: checkcast rip/breeze/client/Util129
      // 28: astore 4
      // 2a: aload 4
      // 2c: ifnonnull 55
      // 2f: aload 0
      // 30: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 33: ifeq 4b
      // 36: goto 3d
      // 39: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: bipush 8
      // 3f: aload 0
      // 40: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 43: imul
      // 44: goto 54
      // 47: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield rip/breeze/client/MathUtil10.dialogSetting Ljava/awt/FontMetrics;
      // 4f: bipush 63
      // 51: invokevirtual java/awt/FontMetrics.charWidth (C)I
      // 54: ireturn
      // 55: iload 1
      // 56: bipush 32
      // 58: if_icmpne 65
      // 5b: aload 4
      // 5d: getfield rip/breeze/client/Util129.fieldInt_f I
      // 60: ireturn
      // 61: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: aload 4
      // 67: getfield rip/breeze/client/Util129.fieldInt_b I
      // 6a: i2f
      // 6b: aload 0
      // 6c: getfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 6f: i2f
      // 70: fdiv
      // 71: fstore 5
      // 73: aload 4
      // 75: getfield rip/breeze/client/Util129.fieldInt_b I
      // 78: aload 4
      // 7a: getfield rip/breeze/client/Util129.fieldInt_d I
      // 7d: iadd
      // 7e: i2f
      // 7f: aload 0
      // 80: getfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 83: i2f
      // 84: fdiv
      // 85: fstore 6
      // 87: aload 4
      // 89: getfield rip/breeze/client/Util129.fieldInt_c I
      // 8c: i2f
      // 8d: aload 0
      // 8e: getfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 91: i2f
      // 92: fdiv
      // 93: fstore 7
      // 95: aload 4
      // 97: getfield rip/breeze/client/Util129.fieldInt_c I
      // 9a: aload 4
      // 9c: getfield rip/breeze/client/Util129.fieldInt_e I
      // 9f: iadd
      // a0: i2f
      // a1: aload 0
      // a2: getfield rip/breeze/client/MathUtil10.fieldInt_p I
      // a5: i2f
      // a6: fdiv
      // a7: fstore 8
      // a9: fload 2
      // aa: aload 4
      // ac: getfield rip/breeze/client/Util129.fieldInt_h I
      // af: i2f
      // b0: fadd
      // b1: fconst_1
      // b2: fadd
      // b3: fstore 9
      // b5: fload 3
      // b6: aload 4
      // b8: getfield rip/breeze/client/Util129.fieldInt_g I
      // bb: i2f
      // bc: fadd
      // bd: fconst_1
      // be: fadd
      // bf: fstore 10
      // c1: fload 9
      // c3: aload 4
      // c5: getfield rip/breeze/client/Util129.fieldInt_d I
      // c8: i2f
      // c9: fadd
      // ca: fstore 11
      // cc: fload 10
      // ce: aload 4
      // d0: getfield rip/breeze/client/Util129.fieldInt_e I
      // d3: i2f
      // d4: fadd
      // d5: fstore 12
      // d7: aload 0
      // d8: getfield rip/breeze/client/MathUtil10.dataBuilder49_A Lrip/breeze/client/RenderUtil35;
      // db: fload 9
      // dd: fload 10
      // df: fload 11
      // e1: fload 12
      // e3: fload 5
      // e5: fload 7
      // e7: fload 6
      // e9: fload 8
      // eb: invokevirtual rip/breeze/client/RenderUtil35.calculate_3 (FFFFFFFF)V
      // ee: aload 4
      // f0: getfield rip/breeze/client/Util129.fieldInt_f I
      // f3: ireturn
      // try (16 -> 21): 22 java/lang/IllegalStateException
      // try (18 -> 29): 29 java/lang/IllegalStateException
      // try (36 -> 42): 42 java/lang/IllegalStateException
   }

   private static Color clamp_4(Color var0, int var1) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), Math.max(0, Math.min(255, var1)));
   }

   private static Color getColor(Color var0) {
      long var1 = 101050157084481L;
      int var3 = var0.getRGB();
      int var4 = var3 >>> 24 & 0xFF;
      int var5 = (var3 & 4096) >> 2;
      return new Color(var5 >> 16 & 0xFF, var5 >> 8 & 0xFF, var5 & 0xFF, var4);
   }

   private Util42 getClientUtil100(String var1) {
      synchronized (this.linkedHashMap_H) {
         Util42 var3 = this.linkedHashMap_H.get(var1);
         if (var3 != null) {
            return var3;
         }
      }

      Util42 var8 = Util42.clamp(var1);
      synchronized (this.linkedHashMap_H) {
         this.linkedHashMap_H.put(var1, var8);
         return var8;
      }
   }

   public int getValue() {
      try {
         if (this.fieldBool_J) {
            return this.clamp_5();
         }
      } catch (IllegalStateException var1) {
         throw getThrowable(var1);
      }

      return this.fieldInt_t;
   }

   public int clamp_5() {
      try {
         if (this.fieldBool_J) {
            return Math.max(1, this.fieldInt_N);
         }
      } catch (IllegalStateException var1) {
         throw getThrowable(var1);
      }

      return this.dialogSetting.getHeight();
   }

   public float calculateFloat() {
      try {
         if (this.fieldBool_J) {
            return 0.0F;
         }
      } catch (IllegalStateException var1) {
         throw getThrowable(var1);
      }

      return -0.25F * this.dialogSetting.getAscent();
   }

   public float clamp_6() {
      try {
         if (this.fieldBool_J) {
            return Math.max(1, this.fieldInt_N);
         }
      } catch (IllegalStateException var1) {
         throw getThrowable(var1);
      }

      return this.dialogSetting.getAscent() + this.dialogSetting.getDescent();
   }

   private int clamp_7(int var1, int var2) {
      long var3 = 87636510829675L;

      try {
         if (this.fieldBool_J) {
            return 0;
         }
      } catch (IllegalStateException var17) {
         throw getThrowable(var17);
      }

      long var5 = (long)var1 << 32 | var2 & 4294967295L;
      Integer var7 = this.map_I.get(var5);

      try {
         if (var7 != null) {
            return var7;
         }
      } catch (IllegalStateException var16) {
         throw getThrowable(var16);
      }

      String var8 = new String(new int[]{var1, var2}, 0, 2);
      char[] var9 = var8.toCharArray();
      GlyphVector var10 = this.font_k.layoutGlyphVector(this.fontRenderContext_s, var9, 0, var9.length, 0);
      int var11 = Math.max(1, Math.round((float)var10.getGlyphPosition(1).getX()));
      Util129 var12 = this.map_q.get(var1);

      int var10000;
      label27: {
         try {
            if (var12 != null) {
               var10000 = var12.fieldInt_f;
               break label27;
            }
         } catch (IllegalStateException var15) {
            throw getThrowable(var15);
         }

         var10000 = 0;
      }

      int var13 = var10000;
      int var14 = var11 - var13;
      this.map_I.put(var5, var14);
      return var14;
   }

   public int clamp_8(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ifnull 012
      // 004: aload 1
      // 005: invokevirtual java/lang/String.isEmpty ()Z
      // 008: ifeq 018
      // 00b: goto 012
      // 00e: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 011: athrow
      // 012: bipush 0
      // 013: ireturn
      // 014: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: aload 0
      // 019: aload 1
      // 01a: invokespecial rip/breeze/client/MathUtil10.getClientUtil100 (Ljava/lang/String;)Lrip/breeze/client/Util42;
      // 01d: astore 2
      // 01e: bipush 0
      // 01f: istore 3
      // 020: aload 2
      // 021: getfield rip/breeze/client/Util42.fieldInt_g I
      // 024: istore 4
      // 026: aload 2
      // 027: getfield rip/breeze/client/Util42.arr_e [B
      // 02a: astore 5
      // 02c: aload 2
      // 02d: getfield rip/breeze/client/Util42.arr_f [I
      // 030: astore 6
      // 032: bipush -1
      // 033: istore 7
      // 035: aconst_null
      // 036: astore 8
      // 038: bipush 0
      // 039: istore 9
      // 03b: iload 9
      // 03d: iload 4
      // 03f: if_icmpge 0f7
      // 042: aload 5
      // 044: iload 9
      // 046: baload
      // 047: istore 10
      // 049: iload 10
      // 04b: ifne 0b6
      // 04e: aload 6
      // 050: iload 9
      // 052: iaload
      // 053: istore 11
      // 055: aload 0
      // 056: getfield rip/breeze/client/MathUtil10.map_q Ljava/util/Map;
      // 059: iload 11
      // 05b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 063: checkcast rip/breeze/client/Util129
      // 066: astore 12
      // 068: iload 7
      // 06a: bipush -1
      // 06b: if_icmpeq 079
      // 06e: iload 3
      // 06f: aload 0
      // 070: iload 7
      // 072: iload 11
      // 074: invokespecial rip/breeze/client/MathUtil10.clamp_7 (II)I
      // 077: iadd
      // 078: istore 3
      // 079: iload 3
      // 07a: aload 12
      // 07c: ifnull 08b
      // 07f: aload 12
      // 081: getfield rip/breeze/client/Util129.fieldInt_f I
      // 084: goto 0a9
      // 087: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: aload 0
      // 08c: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 08f: ifeq 0a0
      // 092: bipush 8
      // 094: aload 0
      // 095: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 098: imul
      // 099: goto 0a9
      // 09c: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: getfield rip/breeze/client/MathUtil10.dialogSetting Ljava/awt/FontMetrics;
      // 0a4: bipush 63
      // 0a6: invokevirtual java/awt/FontMetrics.charWidth (C)I
      // 0a9: iadd
      // 0aa: istore 3
      // 0ab: aload 12
      // 0ad: astore 8
      // 0af: iload 11
      // 0b1: istore 7
      // 0b3: goto 0f1
      // 0b6: iload 10
      // 0b8: bipush 2
      // 0b9: if_icmpne 0f1
      // 0bc: aload 0
      // 0bd: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 0c0: ifeq 0d8
      // 0c3: goto 0ca
      // 0c6: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: bipush 8
      // 0cc: aload 0
      // 0cd: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 0d0: imul
      // 0d1: goto 0e5
      // 0d4: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: bipush 1
      // 0d9: aload 0
      // 0da: getfield rip/breeze/client/MathUtil10.dialogSetting Ljava/awt/FontMetrics;
      // 0dd: bipush 32
      // 0df: invokevirtual java/awt/FontMetrics.charWidth (C)I
      // 0e2: invokestatic java/lang/Math.max (II)I
      // 0e5: istore 11
      // 0e7: iload 3
      // 0e8: iload 11
      // 0ea: bipush 4
      // 0eb: imul
      // 0ec: iadd
      // 0ed: istore 3
      // 0ee: bipush -1
      // 0ef: istore 7
      // 0f1: iinc 9 1
      // 0f4: goto 03b
      // 0f7: aload 0
      // 0f8: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 0fb: ifne 120
      // 0fe: aload 8
      // 100: ifnull 120
      // 103: goto 10a
      // 106: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: iload 3
      // 10b: aload 8
      // 10d: getfield rip/breeze/client/Util129.fieldInt_f I
      // 110: aload 8
      // 112: getfield rip/breeze/client/Util129.fieldInt_h I
      // 115: aload 8
      // 117: getfield rip/breeze/client/Util129.fieldInt_d I
      // 11a: iadd
      // 11b: bipush 2
      // 11c: isub
      // 11d: isub
      // 11e: isub
      // 11f: istore 3
      // 120: iload 3
      // 121: ireturn
      // try (0 -> 5): 6 java/lang/IllegalStateException
      // try (2 -> 10): 10 java/lang/IllegalStateException
      // try (63 -> 69): 69 java/lang/IllegalStateException
      // try (71 -> 79): 79 java/lang/IllegalStateException
      // try (92 -> 98): 99 java/lang/IllegalStateException
      // try (95 -> 106): 106 java/lang/IllegalStateException
      // try (125 -> 130): 131 java/lang/IllegalStateException
   }

   private static ResourceLocation getResourceLocation(FontRenderer var0) {
      long var1 = 9820774174833L;

      try {
         if (var0 == null) {
            short var8 = 1320;
            long var9 = 4125297040612869433L ^ var1;
            return new ResourceLocation("field_111273_g");
         }
      } catch (Throwable var6) {
         throw getThrowable(var6);
      }

      try {
         short var10001 = 2789;
         long var10002 = 6380131700617071349L ^ var1;
         Field var3 = FontRenderer.class.getDeclaredField("field_111273_g");
         var3.setAccessible(true);
         Object var4 = var3.get(var0);
         if (var4 instanceof ResourceLocation) {
            return (ResourceLocation)var4;
         }
      } catch (Throwable var5) {
      }

      short var7 = 31858;
      long var10003 = 5064809841657429109L ^ var1;
      return new ResourceLocation("field_111273_g");
   }

   private static BufferedImage getBufferedImage(Minecraft param0, ResourceLocation param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/MathUtil10.118581016125644L J
      // 003: ldc2_w 108746201938364
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: ifnull 017
      // 00c: aload 1
      // 00d: ifnonnull 01d
      // 010: goto 017
      // 013: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: aconst_null
      // 018: areturn
      // 019: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01c: athrow
      // 01d: aload 0
      // 01e: invokevirtual net/minecraft/client/Minecraft.getResourceManager ()Lnet/minecraft/client/resources/IResourceManager;
      // 021: aload 1
      // 022: invokeinterface net/minecraft/client/resources/IResourceManager.getResource (Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/resources/IResource; 2
      // 027: invokeinterface net/minecraft/client/resources/IResource.getInputStream ()Ljava/io/InputStream; 1
      // 02c: astore 4
      // 02e: aconst_null
      // 02f: astore 5
      // 031: aload 4
      // 033: invokestatic javax/imageio/ImageIO.read (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 036: astore 6
      // 038: aload 4
      // 03a: ifnull 062
      // 03d: aload 5
      // 03f: ifnull 05d
      // 042: goto 049
      // 045: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: aload 4
      // 04b: invokevirtual java/io/InputStream.close ()V
      // 04e: goto 062
      // 051: astore 7
      // 053: aload 5
      // 055: aload 7
      // 057: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 05a: goto 062
      // 05d: aload 4
      // 05f: invokevirtual java/io/InputStream.close ()V
      // 062: aload 6
      // 064: areturn
      // 065: astore 6
      // 067: aload 6
      // 069: astore 5
      // 06b: aload 6
      // 06d: athrow
      // 06e: astore 8
      // 070: aload 4
      // 072: ifnull 09a
      // 075: aload 5
      // 077: ifnull 095
      // 07a: goto 081
      // 07d: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080: athrow
      // 081: aload 4
      // 083: invokevirtual java/io/InputStream.close ()V
      // 086: goto 09a
      // 089: astore 9
      // 08b: aload 5
      // 08d: aload 9
      // 08f: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 092: goto 09a
      // 095: aload 4
      // 097: invokevirtual java/io/InputStream.close ()V
      // 09a: aload 8
      // 09c: athrow
      // 09d: astore 4
      // 09f: ldc_w net/minecraft/client/resources/DefaultResourcePack
      // 0a2: new java/lang/StringBuilder
      // 0a5: dup
      // 0a6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a9: sipush 20308
      // 0ac: ldc2_w 8379913636869523033
      // 0af: lload 2
      // 0b0: lxor
      // 0b1: invokedynamic c (IJ)Ljava/lang/String; bsm=rip/breeze/client/MathUtil10.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b9: aload 1
      // 0ba: invokevirtual net/minecraft/util/ResourceLocation.getResourcePath ()Ljava/lang/String;
      // 0bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c3: invokevirtual java/lang/Class.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 0c6: astore 4
      // 0c8: aconst_null
      // 0c9: astore 5
      // 0cb: aload 4
      // 0cd: ifnull 104
      // 0d0: aload 4
      // 0d2: invokestatic javax/imageio/ImageIO.read (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 0d5: astore 6
      // 0d7: aload 4
      // 0d9: ifnull 101
      // 0dc: aload 5
      // 0de: ifnull 0fc
      // 0e1: goto 0e8
      // 0e4: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: aload 4
      // 0ea: invokevirtual java/io/InputStream.close ()V
      // 0ed: goto 101
      // 0f0: astore 7
      // 0f2: aload 5
      // 0f4: aload 7
      // 0f6: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0f9: goto 101
      // 0fc: aload 4
      // 0fe: invokevirtual java/io/InputStream.close ()V
      // 101: aload 6
      // 103: areturn
      // 104: aload 4
      // 106: ifnull 169
      // 109: aload 5
      // 10b: ifnull 129
      // 10e: goto 115
      // 111: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 114: athrow
      // 115: aload 4
      // 117: invokevirtual java/io/InputStream.close ()V
      // 11a: goto 169
      // 11d: astore 6
      // 11f: aload 5
      // 121: aload 6
      // 123: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 126: goto 169
      // 129: aload 4
      // 12b: invokevirtual java/io/InputStream.close ()V
      // 12e: goto 169
      // 131: astore 6
      // 133: aload 6
      // 135: astore 5
      // 137: aload 6
      // 139: athrow
      // 13a: astore 10
      // 13c: aload 4
      // 13e: ifnull 166
      // 141: aload 5
      // 143: ifnull 161
      // 146: goto 14d
      // 149: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: aload 4
      // 14f: invokevirtual java/io/InputStream.close ()V
      // 152: goto 166
      // 155: astore 11
      // 157: aload 5
      // 159: aload 11
      // 15b: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 15e: goto 166
      // 161: aload 4
      // 163: invokevirtual java/io/InputStream.close ()V
      // 166: aload 10
      // 168: athrow
      // 169: goto 16e
      // 16c: astore 4
      // 16e: aconst_null
      // 16f: areturn
      // try (6 -> 13): 13 java/lang/Throwable
      // try (4 -> 8): 9 java/lang/Throwable
      // try (33 -> 35): 36 java/lang/Throwable
      // try (23 -> 26): 45 java/lang/Throwable
      // try (23 -> 26): 50 null
      // try (26 -> 30): 31 java/lang/Throwable
      // try (58 -> 60): 61 java/lang/Throwable
      // try (45 -> 51): 50 null
      // try (15 -> 43): 70 java/lang/Throwable
      // try (51 -> 55): 56 java/lang/Throwable
      // try (45 -> 70): 70 java/lang/Throwable
      // try (101 -> 103): 104 java/lang/Throwable
      // try (120 -> 122): 123 java/lang/Throwable
      // try (89 -> 94): 131 java/lang/Throwable
      // try (89 -> 94): 136 null
      // try (94 -> 98): 99 java/lang/Throwable
      // try (144 -> 146): 147 java/lang/Throwable
      // try (131 -> 137): 136 null
      // try (71 -> 111): 157 java/lang/Throwable
      // try (137 -> 141): 142 java/lang/Throwable
      // try (113 -> 117): 118 java/lang/Throwable
      // try (113 -> 156): 157 java/lang/Throwable
   }

   public void func_110549_a(IResourceManager var1) {
      try {
         if (this.fieldBool_J) {
            this.fieldBool_Q = true;
         }
      } catch (IllegalStateException var2) {
         throw getThrowable(var2);
      }
   }

   private void calculate_4() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield rip/breeze/client/MathUtil10.fieldBool_J Z
      // 004: ifne 00c
      // 007: return
      // 008: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00b: athrow
      // 00c: invokestatic net/minecraft/client/Minecraft.getMinecraft ()Lnet/minecraft/client/Minecraft;
      // 00f: astore 1
      // 010: aload 1
      // 011: ifnonnull 019
      // 014: return
      // 015: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield rip/breeze/client/MathUtil10.fontRenderer_O Lnet/minecraft/client/gui/FontRenderer;
      // 01d: ifnull 02b
      // 020: aload 0
      // 021: getfield rip/breeze/client/MathUtil10.fontRenderer_O Lnet/minecraft/client/gui/FontRenderer;
      // 024: goto 02f
      // 027: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: aload 1
      // 02c: getfield net/minecraft/client/Minecraft.fontRendererObj Lnet/minecraft/client/gui/FontRenderer;
      // 02f: astore 2
      // 030: aload 2
      // 031: invokestatic rip/breeze/client/MathUtil10.getResourceLocation (Lnet/minecraft/client/gui/FontRenderer;)Lnet/minecraft/util/ResourceLocation;
      // 034: astore 3
      // 035: aload 2
      // 036: ifnull 049
      // 039: aload 2
      // 03a: getfield net/minecraft/client/gui/FontRenderer.FONT_HEIGHT I
      // 03d: aload 0
      // 03e: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 041: imul
      // 042: goto 050
      // 045: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: bipush 8
      // 04b: aload 0
      // 04c: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 04f: imul
      // 050: istore 4
      // 052: aload 3
      // 053: ifnull 064
      // 056: aload 3
      // 057: invokevirtual net/minecraft/util/ResourceLocation.toString ()Ljava/lang/String;
      // 05a: invokevirtual java/lang/String.hashCode ()I
      // 05d: goto 065
      // 060: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: bipush 0
      // 065: istore 5
      // 067: aload 0
      // 068: getfield rip/breeze/client/MathUtil10.fieldBool_Q Z
      // 06b: istore 6
      // 06d: iload 6
      // 06f: ifne 097
      // 072: iload 5
      // 074: aload 0
      // 075: getfield rip/breeze/client/MathUtil10.fieldInt_M I
      // 078: if_icmpne 097
      // 07b: goto 082
      // 07e: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 081: athrow
      // 082: iload 4
      // 084: aload 0
      // 085: getfield rip/breeze/client/MathUtil10.fieldInt_N I
      // 088: if_icmpne 097
      // 08b: goto 092
      // 08e: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 091: athrow
      // 092: return
      // 093: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: aload 1
      // 098: aload 3
      // 099: invokestatic rip/breeze/client/MathUtil10.getBufferedImage (Lnet/minecraft/client/Minecraft;Lnet/minecraft/util/ResourceLocation;)Ljava/awt/image/BufferedImage;
      // 09c: astore 7
      // 09e: aload 7
      // 0a0: ifnonnull 0a8
      // 0a3: return
      // 0a4: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: bipush 0
      // 0aa: putfield rip/breeze/client/MathUtil10.fieldBool_Q Z
      // 0ad: aload 0
      // 0ae: aload 3
      // 0af: putfield rip/breeze/client/MathUtil10.resourceLocation_L Lnet/minecraft/util/ResourceLocation;
      // 0b2: aload 0
      // 0b3: iload 5
      // 0b5: putfield rip/breeze/client/MathUtil10.fieldInt_M I
      // 0b8: aload 0
      // 0b9: aload 2
      // 0ba: putfield rip/breeze/client/MathUtil10.fontRenderer_O Lnet/minecraft/client/gui/FontRenderer;
      // 0bd: aload 0
      // 0be: iload 4
      // 0c0: putfield rip/breeze/client/MathUtil10.fieldInt_N I
      // 0c3: aload 0
      // 0c4: aload 7
      // 0c6: invokespecial rip/breeze/client/MathUtil10.clamp_9 (Ljava/awt/image/BufferedImage;)V
      // 0c9: aload 0
      // 0ca: getfield rip/breeze/client/MathUtil10.dataBuilder48_w Lrip/breeze/client/RaytraceResult;
      // 0cd: ifnull 0de
      // 0d0: aload 0
      // 0d1: getfield rip/breeze/client/MathUtil10.dataBuilder48_w Lrip/breeze/client/RaytraceResult;
      // 0d4: invokevirtual rip/breeze/client/RaytraceResult.initialize ()V
      // 0d7: goto 0de
      // 0da: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: getfield rip/breeze/client/MathUtil10.dataBuilder48_x Lrip/breeze/client/RaytraceResult;
      // 0e2: ifnull 0f3
      // 0e5: aload 0
      // 0e6: getfield rip/breeze/client/MathUtil10.dataBuilder48_x Lrip/breeze/client/RaytraceResult;
      // 0e9: invokevirtual rip/breeze/client/RaytraceResult.initialize ()V
      // 0ec: goto 0f3
      // 0ef: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: aload 0
      // 0f5: getfield rip/breeze/client/MathUtil10.bufferedImage_u Ljava/awt/image/BufferedImage;
      // 0f8: invokestatic rip/breeze/client/RaytraceResult.getDataBuilder48 (Ljava/awt/image/BufferedImage;)Lrip/breeze/client/RaytraceResult;
      // 0fb: putfield rip/breeze/client/MathUtil10.dataBuilder48_w Lrip/breeze/client/RaytraceResult;
      // 0fe: aload 0
      // 0ff: aload 0
      // 100: getfield rip/breeze/client/MathUtil10.bufferedImage_v Ljava/awt/image/BufferedImage;
      // 103: invokestatic rip/breeze/client/RaytraceResult.getDataBuilder48 (Ljava/awt/image/BufferedImage;)Lrip/breeze/client/RaytraceResult;
      // 106: putfield rip/breeze/client/MathUtil10.dataBuilder48_x Lrip/breeze/client/RaytraceResult;
      // 109: aload 0
      // 10a: aload 0
      // 10b: invokevirtual rip/breeze/client/MathUtil10.clamp_5 ()I
      // 10e: putfield rip/breeze/client/MathUtil10.fieldInt_t I
      // 111: return
      // try (0 -> 4): 4 java/lang/IllegalStateException
      // try (8 -> 11): 11 java/lang/IllegalStateException
      // try (13 -> 19): 19 java/lang/IllegalStateException
      // try (27 -> 35): 35 java/lang/IllegalStateException
      // try (42 -> 48): 48 java/lang/IllegalStateException
      // try (55 -> 61): 62 java/lang/IllegalStateException
      // try (57 -> 68): 69 java/lang/IllegalStateException
      // try (64 -> 72): 72 java/lang/IllegalStateException
      // try (78 -> 81): 81 java/lang/IllegalStateException
      // try (83 -> 107): 108 java/lang/IllegalStateException
      // try (110 -> 116): 117 java/lang/IllegalStateException
   }

   private void clamp_9(BufferedImage var1) {
      long var2 = 103594679019986L;
      this.map_q.clear();
      this.fieldInt_P = Math.max(1, var1.getWidth() / 16);
      this.fieldInt_t = Math.max(1, this.fieldInt_N);
      this.fieldInt_o = getValue_3(Math.max(256, Math.min(1024, 512 * this.fieldInt_K)));
      this.fieldInt_p = this.fieldInt_o;
      int var4 = 0;

      while (true) {
         try {
            if (++var4 > 10) {
               throw new IllegalStateException("Atlas growth exceeded limit (bitmap). Current=" + this.fieldInt_o + "x" + this.fieldInt_p);
            }
         } catch (IllegalStateException var18) {
            throw getThrowable(var18);
         }

         this.bufferedImage_u = new BufferedImage(this.fieldInt_o, this.fieldInt_p, 2);
         this.bufferedImage_v = new BufferedImage(this.fieldInt_o, this.fieldInt_p, 2);
         Graphics2D var5 = this.bufferedImage_u.createGraphics();
         var5.setComposite(AlphaComposite.Src);
         var5.setColor(new Color(0, 0, 0, 0));
         var5.fillRect(0, 0, this.fieldInt_o, this.fieldInt_p);
         Graphics2D var6 = this.bufferedImage_v.createGraphics();
         var6.setComposite(AlphaComposite.Src);
         var6.setColor(new Color(0, 0, 0, 0));
         var6.fillRect(0, 0, this.fieldInt_o, this.fieldInt_p);
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         boolean var10 = false;

         for (int var11 = 32; var11 <= 255; var11++) {
            Util43 var12 = this.clamp_10(var11, var1, this.fontRenderer_O);

            try {
               if (var12 == null) {
                  continue;
               }
            } catch (IllegalStateException var17) {
               throw getThrowable(var17);
            }

            if (var7 + var12.fieldInt_a >= this.fieldInt_o) {
               var7 = 0;
               var8 += var9;
               var9 = 0;
            }

            if (var8 + var12.fieldInt_b >= this.fieldInt_p) {
               var10 = true;
               break;
            }

            var5.drawImage(var12.bufferedImage_f, var7, var8, null);
            BufferedImage var13 = clamp_15(var12.bufferedImage_f, 3, 1, 0);
            var6.drawImage(var13, var7, var8, null);
            this.map_q.put(var11, new Util129(var11, var7, var8, var12.fieldInt_a, var12.fieldInt_b, var12.fieldInt_c, var12.fieldInt_d, var12.fieldInt_e));
            var7 += var12.fieldInt_a + 1;
            var9 = Math.max(var9, var12.fieldInt_b + 1);
         }

         try {
            var5.dispose();
            var6.dispose();
            if (!var10) {
               return;
            }
         } catch (IllegalStateException var15) {
            throw getThrowable(var15);
         }

         try {
            if (this.fieldInt_o < 4096) {
               this.fieldInt_o = Math.min(4096, this.fieldInt_o << 1);
            }
         } catch (IllegalStateException var16) {
            throw getThrowable(var16);
         }

         try {
            if (this.fieldInt_p < 4096) {
               this.fieldInt_p = Math.min(4096, this.fieldInt_p << 1);
            }
         } catch (IllegalStateException var14) {
            throw getThrowable(var14);
         }
      }
   }

   private Util43 clamp_10(int param1, BufferedImage param2, FontRenderer param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: bipush 1
      // 001: aload 0
      // 002: getfield rip/breeze/client/MathUtil10.fieldInt_P I
      // 005: bipush 8
      // 007: idiv
      // 008: invokestatic java/lang/Math.max (II)I
      // 00b: istore 4
      // 00d: iload 1
      // 00e: bipush 32
      // 010: if_icmpne 05f
      // 013: bipush 1
      // 014: aload 3
      // 015: ifnull 02c
      // 018: goto 01f
      // 01b: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: aload 3
      // 020: bipush 32
      // 022: invokevirtual net/minecraft/client/gui/FontRenderer.getCharWidth (C)I
      // 025: goto 02d
      // 028: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: bipush 4
      // 02d: aload 0
      // 02e: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 031: imul
      // 032: invokestatic java/lang/Math.max (II)I
      // 035: istore 5
      // 037: bipush 1
      // 038: aload 0
      // 039: getfield rip/breeze/client/MathUtil10.fieldInt_N I
      // 03c: invokestatic java/lang/Math.max (II)I
      // 03f: istore 6
      // 041: new java/awt/image/BufferedImage
      // 044: dup
      // 045: bipush 1
      // 046: iload 6
      // 048: bipush 2
      // 049: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 04c: astore 7
      // 04e: new rip/breeze/client/Util43
      // 051: dup
      // 052: bipush 1
      // 053: iload 6
      // 055: iload 5
      // 057: bipush 0
      // 058: bipush 0
      // 059: aload 7
      // 05b: invokespecial rip/breeze/client/Util43.<init> (IIIIILjava/awt/image/BufferedImage;)V
      // 05e: areturn
      // 05f: iload 1
      // 060: iflt 071
      // 063: iload 1
      // 064: sipush 255
      // 067: if_icmple 077
      // 06a: goto 071
      // 06d: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: aconst_null
      // 072: areturn
      // 073: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: iload 1
      // 078: bipush 16
      // 07a: irem
      // 07b: aload 0
      // 07c: getfield rip/breeze/client/MathUtil10.fieldInt_P I
      // 07f: imul
      // 080: istore 5
      // 082: iload 1
      // 083: bipush 16
      // 085: idiv
      // 086: aload 0
      // 087: getfield rip/breeze/client/MathUtil10.fieldInt_P I
      // 08a: imul
      // 08b: istore 6
      // 08d: aload 3
      // 08e: ifnull 09e
      // 091: aload 3
      // 092: iload 1
      // 093: i2c
      // 094: invokevirtual net/minecraft/client/gui/FontRenderer.getCharWidth (C)I
      // 097: goto 0a0
      // 09a: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: bipush 8
      // 0a0: istore 7
      // 0a2: iload 7
      // 0a4: ifgt 0ab
      // 0a7: bipush 8
      // 0a9: istore 7
      // 0ab: iload 7
      // 0ad: bipush 8
      // 0af: if_icmple 0b6
      // 0b2: bipush 8
      // 0b4: istore 7
      // 0b6: iload 7
      // 0b8: iload 4
      // 0ba: imul
      // 0bb: istore 8
      // 0bd: aload 0
      // 0be: getfield rip/breeze/client/MathUtil10.fieldInt_P I
      // 0c1: istore 9
      // 0c3: bipush 1
      // 0c4: iload 7
      // 0c6: aload 0
      // 0c7: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 0ca: imul
      // 0cb: invokestatic java/lang/Math.max (II)I
      // 0ce: istore 10
      // 0d0: bipush 5
      // 0d1: istore 11
      // 0d3: iload 7
      // 0d5: aload 0
      // 0d6: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 0d9: imul
      // 0da: bipush 10
      // 0dc: iadd
      // 0dd: istore 12
      // 0df: bipush 8
      // 0e1: aload 0
      // 0e2: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 0e5: imul
      // 0e6: bipush 10
      // 0e8: iadd
      // 0e9: istore 13
      // 0eb: new java/awt/image/BufferedImage
      // 0ee: dup
      // 0ef: iload 12
      // 0f1: iload 13
      // 0f3: bipush 2
      // 0f4: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 0f7: astore 14
      // 0f9: aload 14
      // 0fb: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 0fe: astore 15
      // 100: aload 15
      // 102: getstatic java/awt/AlphaComposite.Src Ljava/awt/AlphaComposite;
      // 105: invokevirtual java/awt/Graphics2D.setComposite (Ljava/awt/Composite;)V
      // 108: aload 15
      // 10a: new java/awt/Color
      // 10d: dup
      // 10e: bipush 0
      // 10f: bipush 0
      // 110: bipush 0
      // 111: bipush 0
      // 112: invokespecial java/awt/Color.<init> (IIII)V
      // 115: invokevirtual java/awt/Graphics2D.setColor (Ljava/awt/Color;)V
      // 118: aload 15
      // 11a: bipush 0
      // 11b: bipush 0
      // 11c: iload 12
      // 11e: iload 13
      // 120: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 123: aload 15
      // 125: getstatic java/awt/RenderingHints.KEY_INTERPOLATION Ljava/awt/RenderingHints$Key;
      // 128: getstatic java/awt/RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR Ljava/lang/Object;
      // 12b: invokevirtual java/awt/Graphics2D.setRenderingHint (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
      // 12e: aload 15
      // 130: getstatic java/awt/RenderingHints.KEY_RENDERING Ljava/awt/RenderingHints$Key;
      // 133: getstatic java/awt/RenderingHints.VALUE_RENDER_SPEED Ljava/lang/Object;
      // 136: invokevirtual java/awt/Graphics2D.setRenderingHint (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
      // 139: aload 15
      // 13b: getstatic java/awt/RenderingHints.KEY_ANTIALIASING Ljava/awt/RenderingHints$Key;
      // 13e: getstatic java/awt/RenderingHints.VALUE_ANTIALIAS_OFF Ljava/lang/Object;
      // 141: invokevirtual java/awt/Graphics2D.setRenderingHint (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
      // 144: aload 15
      // 146: aload 2
      // 147: bipush 5
      // 148: bipush 5
      // 149: bipush 5
      // 14a: iload 7
      // 14c: aload 0
      // 14d: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 150: imul
      // 151: iadd
      // 152: bipush 5
      // 153: bipush 8
      // 155: aload 0
      // 156: getfield rip/breeze/client/MathUtil10.fieldInt_K I
      // 159: imul
      // 15a: iadd
      // 15b: iload 5
      // 15d: iload 6
      // 15f: iload 5
      // 161: iload 8
      // 163: iadd
      // 164: iload 6
      // 166: iload 9
      // 168: iadd
      // 169: aconst_null
      // 16a: invokevirtual java/awt/Graphics2D.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 16d: pop
      // 16e: aload 15
      // 170: invokevirtual java/awt/Graphics2D.dispose ()V
      // 173: aload 14
      // 175: invokestatic rip/breeze/client/MathUtil10.clamp_14 (Ljava/awt/image/BufferedImage;)V
      // 178: aload 14
      // 17a: invokestatic rip/breeze/client/MathUtil10.checkCondition (Ljava/awt/image/BufferedImage;)Z
      // 17d: ifeq 186
      // 180: aconst_null
      // 181: areturn
      // 182: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 185: athrow
      // 186: new rip/breeze/client/Util43
      // 189: dup
      // 18a: iload 12
      // 18c: iload 13
      // 18e: iload 10
      // 190: bipush -5
      // 192: bipush -5
      // 194: aload 14
      // 196: invokespecial rip/breeze/client/Util43.<init> (IIIIILjava/awt/image/BufferedImage;)V
      // 199: areturn
      // try (7 -> 13): 14 java/lang/IllegalStateException
      // try (10 -> 20): 20 java/lang/IllegalStateException
      // try (50 -> 55): 56 java/lang/IllegalStateException
      // try (52 -> 60): 60 java/lang/IllegalStateException
      // try (76 -> 83): 83 java/lang/IllegalStateException
      // try (136 -> 202): 202 java/lang/IllegalStateException
   }

   private void clamp_11(int[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/MathUtil10.118581016125644L J
      // 003: ldc2_w 129989256699864
      // 006: lxor
      // 007: lstore 2
      // 008: bipush 0
      // 009: istore 4
      // 00b: iinc 4 1
      // 00e: iload 4
      // 010: bipush 10
      // 012: if_icmple 04f
      // 015: new java/lang/IllegalStateException
      // 018: dup
      // 019: new java/lang/StringBuilder
      // 01c: dup
      // 01d: invokespecial java/lang/StringBuilder.<init> ()V
      // 020: sipush 29811
      // 023: ldc2_w 2000210573010049821
      // 026: lload 2
      // 027: lxor
      // 028: pop2
      // 029: pop
      // 02a: ldc_w "Atlas too small"
      // 02d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 030: aload 0
      // 031: getfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 034: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 037: ldc_w "x"
      // 03a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03d: aload 0
      // 03e: getfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 041: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 044: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 047: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 04a: athrow
      // 04b: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: aload 0
      // 050: getfield rip/breeze/client/MathUtil10.map_q Ljava/util/Map;
      // 053: invokeinterface java/util/Map.clear ()V 1
      // 058: aload 0
      // 059: bipush 0
      // 05a: putfield rip/breeze/client/MathUtil10.fieldInt_t I
      // 05d: aload 0
      // 05e: aconst_null
      // 05f: putfield rip/breeze/client/MathUtil10.bufferedImage_u Ljava/awt/image/BufferedImage;
      // 062: aload 0
      // 063: aconst_null
      // 064: putfield rip/breeze/client/MathUtil10.bufferedImage_v Ljava/awt/image/BufferedImage;
      // 067: aload 0
      // 068: aload 1
      // 069: invokespecial rip/breeze/client/MathUtil10.clamp_12 ([I)V
      // 06c: return
      // 06d: astore 5
      // 06f: aload 5
      // 071: invokevirtual java/lang/IllegalStateException.getMessage ()Ljava/lang/String;
      // 074: astore 6
      // 076: aload 6
      // 078: ifnull 097
      // 07b: aload 6
      // 07d: sipush 28999
      // 080: ldc2_w 782729504569531952
      // 083: lload 2
      // 084: lxor
      // 085: pop2
      // 086: pop
      // 087: ldc_w "Atlas too small"
      // 08a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 08d: ifne 09e
      // 090: goto 097
      // 093: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: aload 5
      // 099: athrow
      // 09a: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: aload 0
      // 09f: getfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 0a2: istore 7
      // 0a4: aload 0
      // 0a5: getfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 0a8: istore 8
      // 0aa: aload 0
      // 0ab: getfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 0ae: sipush 4096
      // 0b1: if_icmplt 0c5
      // 0b4: aload 0
      // 0b5: getfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 0b8: sipush 4096
      // 0bb: if_icmpge 140
      // 0be: goto 0c5
      // 0c1: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 0c9: aload 0
      // 0ca: getfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 0cd: if_icmpgt 0ff
      // 0d0: goto 0d7
      // 0d3: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: getfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 0db: sipush 4096
      // 0de: if_icmpge 0ff
      // 0e1: goto 0e8
      // 0e4: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: sipush 4096
      // 0ec: aload 0
      // 0ed: getfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 0f0: bipush 1
      // 0f1: ishl
      // 0f2: invokestatic java/lang/Math.min (II)I
      // 0f5: putfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 0f8: goto 140
      // 0fb: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: getfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 103: sipush 4096
      // 106: if_icmpge 120
      // 109: aload 0
      // 10a: sipush 4096
      // 10d: aload 0
      // 10e: getfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 111: bipush 1
      // 112: ishl
      // 113: invokestatic java/lang/Math.min (II)I
      // 116: putfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 119: goto 140
      // 11c: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: aload 0
      // 121: sipush 4096
      // 124: aload 0
      // 125: getfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 128: bipush 1
      // 129: ishl
      // 12a: invokestatic java/lang/Math.min (II)I
      // 12d: putfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 130: aload 0
      // 131: sipush 4096
      // 134: aload 0
      // 135: getfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 138: bipush 1
      // 139: ishl
      // 13a: invokestatic java/lang/Math.min (II)I
      // 13d: putfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 140: aload 0
      // 141: getfield rip/breeze/client/MathUtil10.fieldInt_o I
      // 144: iload 7
      // 146: if_icmpne 191
      // 149: aload 0
      // 14a: getfield rip/breeze/client/MathUtil10.fieldInt_p I
      // 14d: iload 8
      // 14f: if_icmpne 191
      // 152: goto 159
      // 155: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 158: athrow
      // 159: new java/lang/IllegalStateException
      // 15c: dup
      // 15d: new java/lang/StringBuilder
      // 160: dup
      // 161: invokespecial java/lang/StringBuilder.<init> ()V
      // 164: sipush 30581
      // 167: ldc2_w 1405855193308010517
      // 16a: lload 2
      // 16b: lxor
      // 16c: invokedynamic c (IJ)Ljava/lang/String; bsm=rip/breeze/client/MathUtil10.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: iload 7
      // 176: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 179: ldc_w "x"
      // 17c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17f: iload 8
      // 181: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 184: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 187: aload 5
      // 189: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 18c: athrow
      // 18d: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 190: athrow
      // 191: goto 00b
      // try (6 -> 34): 34 java/lang/IllegalStateException
      // try (36 -> 51): 52 java/lang/IllegalStateException
      // try (56 -> 68): 69 java/lang/IllegalStateException
      // try (58 -> 73): 73 java/lang/IllegalStateException
      // try (81 -> 89): 90 java/lang/IllegalStateException
      // try (85 -> 97): 98 java/lang/IllegalStateException
      // try (92 -> 104): 105 java/lang/IllegalStateException
      // try (100 -> 116): 116 java/lang/IllegalStateException
      // try (118 -> 131): 131 java/lang/IllegalStateException
      // try (149 -> 157): 158 java/lang/IllegalStateException
      // try (153 -> 181): 181 java/lang/IllegalStateException
   }

   private void clamp_12(int[] var1) {
      long var2 = 108500934226568L;
      this.bufferedImage_u = new BufferedImage(this.fieldInt_o, this.fieldInt_p, 2);
      this.bufferedImage_v = new BufferedImage(this.fieldInt_o, this.fieldInt_p, 2);
      Graphics2D var4 = this.bufferedImage_u.createGraphics();
      this.processAll_4(var4);
      var4.setFont(this.font_k);
      var4.setComposite(AlphaComposite.Src);
      Graphics2D var5 = this.bufferedImage_v.createGraphics();
      var5.setComposite(AlphaComposite.Src);
      var4.setColor(new Color(0, 0, 0, 0));
      var4.fillRect(0, 0, this.fieldInt_o, this.fieldInt_p);
      var5.setColor(new Color(0, 0, 0, 0));
      var5.fillRect(0, 0, this.fieldInt_o, this.fieldInt_p);
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      for (int var9 = 32; var9 <= 255; var9++) {
         Util43 var10 = this.clamp_13(var9);

         try {
            if (var10 == null) {
               continue;
            }
         } catch (IllegalStateException var18) {
            throw getThrowable(var18);
         }

         if (var6 + var10.fieldInt_a >= this.fieldInt_o) {
            var6 = 0;
            var7 += var8;
            var8 = 0;
         }

         try {
            if (var7 + var10.fieldInt_b >= this.fieldInt_p) {
               short var10002 = 9944;
               long var10003 = 2325401636205757480L ^ var2;
               throw new IllegalStateException("Atlas too small.");
            }
         } catch (IllegalStateException var19) {
            throw getThrowable(var19);
         }

         var4.drawImage(var10.bufferedImage_f, var6, var7, null);
         BufferedImage var11 = clamp_15(var10.bufferedImage_f, 3, 1, 0);
         var5.drawImage(var11, var6, var7, null);
         this.map_q.put(var9, new Util129(var9, var6, var7, var10.fieldInt_a, var10.fieldInt_b, var10.fieldInt_c, var10.fieldInt_d, var10.fieldInt_e));
         var6 += var10.fieldInt_a + 1;
         var8 = Math.max(var8, var10.fieldInt_b + 1);
         this.fieldInt_t = Math.max(this.fieldInt_t, var10.fieldInt_b);
      }

      if (var1 != null) {
         for (int var12 : var1) {
            try {
               if (this.map_q.containsKey(var12)) {
                  continue;
               }
            } catch (IllegalStateException var16) {
               throw getThrowable(var16);
            }

            Util43 var13 = this.clamp_13(var12);

            try {
               if (var13 == null) {
                  continue;
               }
            } catch (IllegalStateException var15) {
               throw getThrowable(var15);
            }

            if (var6 + var13.fieldInt_a >= this.fieldInt_o) {
               var6 = 0;
               var7 += var8;
               var8 = 0;
            }

            try {
               if (var7 + var13.fieldInt_b >= this.fieldInt_p) {
                  short var23 = 19838;
                  long var24 = 7486514383509352340L ^ var2;
                  throw new IllegalStateException("Atlas too small.");
               }
            } catch (IllegalStateException var17) {
               throw getThrowable(var17);
            }

            var4.drawImage(var13.bufferedImage_f, var6, var7, null);
            BufferedImage var14 = clamp_15(var13.bufferedImage_f, 3, 1, 0);
            var5.drawImage(var14, var6, var7, null);
            this.map_q.put(var12, new Util129(var12, var6, var7, var13.fieldInt_a, var13.fieldInt_b, var13.fieldInt_c, var13.fieldInt_d, var13.fieldInt_e));
            var6 += var13.fieldInt_a + 1;
            var8 = Math.max(var8, var13.fieldInt_b + 1);
            this.fieldInt_t = Math.max(this.fieldInt_t, var13.fieldInt_b);
         }
      }

      var4.dispose();
      var5.dispose();
   }

   private Util43 clamp_13(int var1) {
      if (var1 == 32) {
         int var16 = Math.max(1, this.dialogSetting.charWidth(' '));
         int var17 = Math.max(1, this.dialogSetting.getHeight());
         BufferedImage var18 = new BufferedImage(1, var17, 2);
         return new Util43(1, var17, var16, 0, 0, var18);
      }

      String var2 = new String(Character.toChars(var1));
      GlyphVector var3 = this.font_k.createGlyphVector(this.fontRenderContext_s, var2);
      float var4 = (float)var3.getGlyphPosition(var3.getNumGlyphs()).getX();
      int var5 = Math.max(1, Math.round(var4));
      Rectangle var6 = var3.getPixelBounds(this.fontRenderContext_s, 0.0F, 0.0F);

      label39: {
         try {
            if (var6.width <= 0 || var6.height <= 0) {
               break label39;
            }
         } catch (IllegalStateException var15) {
            throw getThrowable(var15);
         }

         byte var7 = 2;
         int var8 = var6.width + 4;
         int var9 = var6.height + 4;
         int var10 = var6.y - 2;
         int var11 = var6.x - 2;
         BufferedImage var12 = new BufferedImage(var8, var9, 2);
         Graphics2D var13 = var12.createGraphics();

         try {
            this.processAll_4(var13);
            var13.setFont(this.font_k);
            var13.setComposite(AlphaComposite.Src);
            var13.setColor(new Color(0, 0, 0, 0));
            var13.fillRect(0, 0, var8, var9);
            var13.setColor(Color.WHITE);
            var13.drawGlyphVector(var3, -var6.x + 2, -var6.y + 2);
            var13.dispose();
            clamp_14(var12);
            if (checkCondition(var12)) {
               return null;
            }
         } catch (IllegalStateException var14) {
            throw getThrowable(var14);
         }

         return new Util43(var8, var9, var5, var10, var11, var12);
      }

      int var19 = Math.max(1, this.dialogSetting.getHeight());
      BufferedImage var20 = new BufferedImage(1, var19, 2);
      return new Util43(1, var19, var5, 0, 0, var20);
   }

   private void processAll_4(Graphics2D var1) {
      try {
         var1.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         var1.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
         var1.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
         if (this.fieldBool_l) {
            var1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            var1.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
         }
      } catch (IllegalStateException var2) {
         throw getThrowable(var2);
      }
   }

   private static void clamp_14(BufferedImage var0) {
      long var1 = 13216979285414L;
      int var3 = var0.getWidth();
      int var4 = var0.getHeight();

      for (int var5 = 0; var5 < var4; var5++) {
         for (int var6 = 0; var6 < var3; var6++) {
            int var7 = var0.getRGB(var6, var5);
            int var8 = var7 >>> 24 & 0xFF;
            int var9 = var7 >>> 16 & 0xFF;
            int var10 = var7 >>> 8 & 0xFF;
            int var11 = var7 & 0xFF;
            int var12 = Math.max(var9, Math.max(var10, var11));
            int var13 = (var12 * var8 + 127) / 255;
            var0.setRGB(var6, var5, var13 << 24 | -1242811205);
         }
      }
   }

   private static boolean checkCondition(BufferedImage param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 04: istore 1
      // 05: aload 0
      // 06: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 09: istore 2
      // 0a: bipush 0
      // 0b: istore 3
      // 0c: iload 3
      // 0d: iload 2
      // 0e: if_icmpge 44
      // 11: bipush 0
      // 12: istore 4
      // 14: iload 4
      // 16: iload 1
      // 17: if_icmpge 3e
      // 1a: aload 0
      // 1b: iload 4
      // 1d: iload 3
      // 1e: invokevirtual java/awt/image/BufferedImage.getRGB (II)I
      // 21: bipush 24
      // 23: iushr
      // 24: sipush 255
      // 27: iand
      // 28: ifeq 38
      // 2b: goto 32
      // 2e: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: invokestatic rip/breeze/client/MathUtil10.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: iinc 4 1
      // 3b: goto 14
      // 3e: iinc 3 1
      // 41: goto 0c
      // 44: bipush 1
      // 45: ireturn
      // try (13 -> 25): 26 java/lang/IllegalStateException
      // try (16 -> 30): 30 java/lang/IllegalStateException
   }

   private static BufferedImage clamp_15(BufferedImage var0, int var1, int var2, int var3) {
      long var4 = 46871508704986L;

      try {
         if (var1 <= 0) {
            return var0;
         }
      } catch (IllegalStateException var22) {
         throw getThrowable(var22);
      }

      int var6 = var0.getWidth();
      int var7 = var0.getHeight();
      int[] var8 = new int[var6 * var7];
      int[] var9 = new int[var6 * var7];
      int var10 = 0;

      for (int var11 = 0; var11 < var7; var11++) {
         int var12 = 0;

         try {
            while (var12 < var6) {
               var8[var10++] = var0.getRGB(var12, var11) >>> 24 & 0xFF;
               var12++;
            }
         } catch (IllegalStateException var21) {
            throw getThrowable(var21);
         }
      }

      for (int var24 = 0; var24 < var3; var24++) {
         int[] var26 = new int[var6 * var7];

         for (int var13 = 0; var13 < var7; var13++) {
            for (int var14 = 0; var14 < var6; var14++) {
               int var15 = var8[var13 * var6 + var14];
               if (var14 > 0) {
                  var15 = Math.max(var15, var8[var13 * var6 + (var14 - 1)]);
               }

               if (var14 + 1 < var6) {
                  var15 = Math.max(var15, var8[var13 * var6 + var14 + 1]);
               }

               if (var13 > 0) {
                  var15 = Math.max(var15, var8[(var13 - 1) * var6 + var14]);
               }

               if (var13 + 1 < var7) {
                  var15 = Math.max(var15, var8[(var13 + 1) * var6 + var14]);
               }

               var26[var13 * var6 + var14] = var15;
            }
         }

         var8 = var26;
      }

      int var25 = var1;
      int var27 = var25 * 2 + 1;
      int var28 = Math.max(1, var2);

      for (int var29 = 0; var29 < var28; var29++) {
         for (int var31 = 0; var31 < var7; var31++) {
            int var16 = 0;
            int var17 = var31 * var6;

            for (int var18 = -var25; var18 <= var25; var18++) {
               int var19 = getValue_2(var18, 0, var6 - 1);
               var16 += var8[var17 + var19];
            }

            for (int var42 = 0; var42 < var6; var42++) {
               var9[var17 + var42] = var16 / var27;
               int var45 = var42 - var25;
               int var20 = var42 + var25 + 1;
               var16 -= var8[var17 + getValue_2(var45, 0, var6 - 1)];
               var16 += var8[var17 + getValue_2(var20, 0, var6 - 1)];
            }
         }

         for (int var32 = 0; var32 < var6; var32++) {
            int var35 = 0;

            for (int var38 = -var25; var38 <= var25; var38++) {
               int var43 = getValue_2(var38, 0, var7 - 1);
               var35 += var9[var43 * var6 + var32];
            }

            for (int var39 = 0; var39 < var7; var39++) {
               var8[var39 * var6 + var32] = var35 / var27;
               int var44 = var39 - var25;
               int var46 = var39 + var25 + 1;
               var35 -= var9[getValue_2(var44, 0, var7 - 1) * var6 + var32];
               var35 += var9[getValue_2(var46, 0, var7 - 1) * var6 + var32];
            }
         }
      }

      BufferedImage var30 = new BufferedImage(var6, var7, 2);
      var10 = 0;

      for (int var33 = 0; var33 < var7; var33++) {
         for (int var37 = 0; var37 < var6; var37++) {
            int var40 = var8[var10++];
            var40 = (int)(var40 * 0.7F);
            if (var40 > 255) {
               var40 = 255;
            }

            if (var40 < 0) {
               var40 = 0;
            }

            var30.setRGB(var37, var33, var40 << 24 | "]ޓ?ݭe");
         }
      }

      return var30;
   }

   private static int getValue_2(int var0, int var1, int var2) {
      try {
         if (var0 < var1) {
            return var1;
         }
      } catch (IllegalStateException var4) {
         throw getThrowable(var4);
      }

      try {
         if (var0 > var2) {
            return var2;
         }
      } catch (IllegalStateException var3) {
         throw getThrowable(var3);
      }

      return var0;
   }

   private static int getValue_3(int var0) {
      byte var1 = 1;

      while (var1 < var0) {
         var1 <<= 1;
      }

      return var1;
   }

   public static MathUtil10 getDataBuilder46_2(String var0, int var1, boolean var2) {
      return clamp_16(var0, var1, var2, 0, 0);
   }

   public static MathUtil10 clamp_16(String var0, int var1, boolean var2, int var3, int var4) {
      long var5 = 76700595108110L;

      try {
         short var10001 = 1478;
         long var30 = 131054597030767795L ^ var5;
         InputStream var7 = MathUtil10.class.getResourceAsStream(String.format("/assets/breeze/fonts/%s.ttf", var0));
         Throwable var8 = null;

         try {
            try {
               if (var7 == null) {
                  StringBuilder var31 = new StringBuilder();
                  short var32 = 29252;
                  long var33 = 3451120352690412341L ^ var5;
                  throw new RuntimeException(var31.append("/assets/breeze/fonts/%s.ttf").append(var0).toString());
               }
            } catch (Throwable var25) {
               throw getThrowable(var25);
            }

            Font var9 = Font.createFont(0, var7);
            var9 = var9.deriveFont(0, var1);
            int var10 = getValue_3(Math.max(256, Math.min(1024, var1 * 16)));
            return new MathUtil10(var9, var2, null, var10, var10, var3, var4);
         } catch (Throwable var26) {
            var8 = var26;
            throw var26;
         } finally {
            label88: {
               label87: {
                  try {
                     if (var7 == null) {
                        break label88;
                     }

                     if (var8 == null) {
                        break label87;
                     }
                  } catch (Throwable var24) {
                     throw getThrowable(var24);
                  }

                  try {
                     var7.close();
                  } catch (Throwable var23) {
                     var8.addSuppressed(var23);
                  }
                  break label88;
               }

               var7.close();
            }
         }
      } catch (FontFormatException | IOException var28) {
         StringBuilder var10002 = new StringBuilder();
         short var10003 = 4314;
         long var10004 = 981314618825275818L ^ var5;
         throw new RuntimeException(var10002.append("/assets/breeze/fonts/%s.ttf").append(var0).toString(), var28);
      }
   }

   static {
      long var0 = 90935493362920L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[20];
      int var5 = 0;
      String var6 = "S\u0088\u0083\u0085´\u0003¹}Ú1wê¸ù)¬\u0095ÿ4àúx\u0007b\u001bkz{ÃJ¯Ø\u0080\u0090]c¡\u0006\u009dÐ0Cmë¤½If\u001dD3¢\u0080È\u001d5¦\u001b!ð\u0000\u0002ëvÙ\u0016\rÝ³\u001e\n¼\u000e¦à´\u008aúË\u0097\u008f8z\u0005¸ær,\u0019PÏ=\u008eÐ\u0080\u0003Íÿ8\u0095?L\u0094^\u0017ßXn\u000fó\u0014´Û\u0003u[À\u0084÷ËGºá3\u0099ï\u00139½\u0097t\u009cÌÉøUz\u0010EÝãWü\u0095¶5f\u008bÛ\u001b\u0092\u0087pª@fú \u001cY\u000b\u00adb\u009bÂ\u008c!\u0099\u001ej(s\u007fb{P0\u009bVZH\u0019Dø·CDÍ\u0018³ñQò\t´uÕ\f Z\u0090§èe¢\u0089\u0017\u0081Z~\u0097(\u0002\u0081E\u0012-Å\u0019§ÑM73\u000böÄÙCþQ\bÇïà£ÆVîP&ä\u008eÖ?ß\u0080Ú\u0005\u009eÝë()\u0015I÷H\u0018ô\u000bP\u001c\u0087%Ý\r6Å:\tmd²ñ\u0096rçÌ¹Z\u0015MM\u0091\u008a\nÂ?¤Uü+(eÉ\u008c\u0016\u0011B\u007fÀ\r\u008a´D0Hø\u008fE\u0099G\u008a~Ø«Ô\u008a²Æ\u0012\u008e*\u00adÿSÐbÕ \u000eÔ\u0012`,Ô\u009bZY<ÃqÜ6ü=\u0013=û\u0007é\u0005åò¬\u0007ê\u0098¡\fÈh&¯s°WJ\u0086\u0088À»AÂBf×½lCÚD²¡\u009b¦SÕÙ³wª\u0093-\u008e6\u0014'Ú¡8`\u0098\u009b£êê\u008c\u007f>ÖÐ®\u0013z\u009a\u0015`\u001fÌK\u000e\u001bÊ\u0095\u0089Óy!@8\u008e\u0085é¡åëq\u008c\u0019ÉÀó½\u0092÷éñóå\\þèOíB*hè\u000b\u0084+\u0005\u0082)\u0089^r\u0091å6>\u0001<Íö»ô³SÉB\r>3îÔ@u\"ü\u00adßâcV\u0098q\\¨s\u0098 ê\r\u0015\u0083vÎÐ\u008aSX\u0081#\u008aä9õSc'\u000bÐ|\u0019\u009a\u001d!à;\u000fä·\u0091\u0096áÁ»4`h\u001b1\u0090\u0007W\u0016-»\rº E\u0013\u009c¶OØ¤¨Õÿ\u000eÛ©æ\u0000\u0016\u000e\u00adÊ\u0010x\u0018\u0010\bÎ©æýÅjØK(\u0097û¹ï³\u001bA\u00825-\u00003X\u000fêHcªKL1\u00865²&¦nXÊ¼Å¢þ\u0083~\u000fu\u001dn<0Å \u0015vBmj\u0007¸§\u0081GÈ\u0092c[\u000e×L\u0082¤\u001dx$ô¶w\u0013ÍèW=Þ~Ó9\r=±\fK\u0097xË+àëc(\u0017¶\u009a®p2A~Ic\u0088<\u009cÃ´\u00984|@û/\u001cïF\u0094KK!å\u0095ÆVPò¯\\ýüÄd(U\u0018Sêt\u0003\u00156X`c\u0010\u0001ÓÄ§4£ÿ¥_\u00adRMÇ-\u009a¹_V¶â~o×\u008dBû\u001d\u008b\u0010\u0090ã`Ë\u008fÀ\u001c\u0099G\u0080\b)\u009eå5£ \u009e\u0090\u001cø¥,\r\u008ah\u0093\u0013ðQª\u0099Ï\u0001\u0095]/Fu:Ï^QxB\rB\u001d6(Ô3·ìg¶\u0004©ñL'ÂøáòF\u00ad\u001aÖ\u008f\u0080\u0018ñ\u000f\nÅb¸«\u001aÒH²\u0097\u0089ªÏ|¿ê";
      int var7 = "S\u0088\u0083\u0085´\u0003¹}Ú1wê¸ù)¬\u0095ÿ4àúx\u0007b\u001bkz{ÃJ¯Ø\u0080\u0090]c¡\u0006\u009dÐ0Cmë¤½If\u001dD3¢\u0080È\u001d5¦\u001b!ð\u0000\u0002ëvÙ\u0016\rÝ³\u001e\n¼\u000e¦à´\u008aúË\u0097\u008f8z\u0005¸ær,\u0019PÏ=\u008eÐ\u0080\u0003Íÿ8\u0095?L\u0094^\u0017ßXn\u000fó\u0014´Û\u0003u[À\u0084÷ËGºá3\u0099ï\u00139½\u0097t\u009cÌÉøUz\u0010EÝãWü\u0095¶5f\u008bÛ\u001b\u0092\u0087pª@fú \u001cY\u000b\u00adb\u009bÂ\u008c!\u0099\u001ej(s\u007fb{P0\u009bVZH\u0019Dø·CDÍ\u0018³ñQò\t´uÕ\f Z\u0090§èe¢\u0089\u0017\u0081Z~\u0097(\u0002\u0081E\u0012-Å\u0019§ÑM73\u000böÄÙCþQ\bÇïà£ÆVîP&ä\u008eÖ?ß\u0080Ú\u0005\u009eÝë()\u0015I÷H\u0018ô\u000bP\u001c\u0087%Ý\r6Å:\tmd²ñ\u0096rçÌ¹Z\u0015MM\u0091\u008a\nÂ?¤Uü+(eÉ\u008c\u0016\u0011B\u007fÀ\r\u008a´D0Hø\u008fE\u0099G\u008a~Ø«Ô\u008a²Æ\u0012\u008e*\u00adÿSÐbÕ \u000eÔ\u0012`,Ô\u009bZY<ÃqÜ6ü=\u0013=û\u0007é\u0005åò¬\u0007ê\u0098¡\fÈh&¯s°WJ\u0086\u0088À»AÂBf×½lCÚD²¡\u009b¦SÕÙ³wª\u0093-\u008e6\u0014'Ú¡8`\u0098\u009b£êê\u008c\u007f>ÖÐ®\u0013z\u009a\u0015`\u001fÌK\u000e\u001bÊ\u0095\u0089Óy!@8\u008e\u0085é¡åëq\u008c\u0019ÉÀó½\u0092÷éñóå\\þèOíB*hè\u000b\u0084+\u0005\u0082)\u0089^r\u0091å6>\u0001<Íö»ô³SÉB\r>3îÔ@u\"ü\u00adßâcV\u0098q\\¨s\u0098 ê\r\u0015\u0083vÎÐ\u008aSX\u0081#\u008aä9õSc'\u000bÐ|\u0019\u009a\u001d!à;\u000fä·\u0091\u0096áÁ»4`h\u001b1\u0090\u0007W\u0016-»\rº E\u0013\u009c¶OØ¤¨Õÿ\u000eÛ©æ\u0000\u0016\u000e\u00adÊ\u0010x\u0018\u0010\bÎ©æýÅjØK(\u0097û¹ï³\u001bA\u00825-\u00003X\u000fêHcªKL1\u00865²&¦nXÊ¼Å¢þ\u0083~\u000fu\u001dn<0Å \u0015vBmj\u0007¸§\u0081GÈ\u0092c[\u000e×L\u0082¤\u001dx$ô¶w\u0013ÍèW=Þ~Ó9\r=±\fK\u0097xË+àëc(\u0017¶\u009a®p2A~Ic\u0088<\u009cÃ´\u00984|@û/\u001cïF\u0094KK!å\u0095ÆVPò¯\\ýüÄd(U\u0018Sêt\u0003\u00156X`c\u0010\u0001ÓÄ§4£ÿ¥_\u00adRMÇ-\u009a¹_V¶â~o×\u008dBû\u001d\u008b\u0010\u0090ã`Ë\u008fÀ\u001c\u0099G\u0080\b)\u009eå5£ \u009e\u0090\u001cø¥,\r\u008ah\u0093\u0013ðQª\u0099Ï\u0001\u0095]/Fu:Ï^QxB\rB\u001d6(Ô3·ìg¶\u0004©ñL'ÂøáòF\u00ad\u001aÖ\u008f\u0080\u0018ñ\u000f\nÅb¸«\u001aÒH²\u0097\u0089ªÏ|¿ê"
         .length();
      char var8 = '(';
      int var28 = -1;

      label64:
      while (true) {
         String var30 = var6.substring(++var28, var28 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var30.getBytes("ISO-8859-1"));
            String var43 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var43;
                  if ((var28 += var8) >= var7) {
                     CONST_S = var4;
                     CONST_T = new String[20];
                     CONST_X = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[15];
                     int var14 = 0;
                     String var15 = "ùÎ¿ä±\u001eÌãmèÏæDøÄ×\u0016y\u0084ÉKö \u0015\u0099«\f\u0014\u009a÷f§åÅ}µ¼\u009fÊË\u0004sÈËÞ\u0010X|Ð\u0090ï\u001a\u0088\u0099_x£[\u000eZ¦â_L\u0003«*ÍO\u0097½\u001cûÇåvË2\u000by[\u0084Î-.\u009co\u001eÒ\rNM=E\u0086Õ¡mæ\u0092ºk¥û";
                     int var16 = "ùÎ¿ä±\u001eÌãmèÏæDøÄ×\u0016y\u0084ÉKö \u0015\u0099«\f\u0014\u009a÷f§åÅ}µ¼\u009fÊË\u0004sÈËÞ\u0010X|Ð\u0090ï\u001a\u0088\u0099_x£[\u000eZ¦â_L\u0003«*ÍO\u0097½\u001cûÇåvË2\u000by[\u0084Î-.\u009co\u001eÒ\rNM=E\u0086Õ¡mæ\u0092ºk¥û"
                        .length();
                     byte var17 = 0;

                     label46:
                     while (true) {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        long[] var33 = var13;
                        var10001 = var14++;
                        long var47 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var52 = -1;

                        while (true) {
                           long var19 = var47;
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
                           long var55 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var52) {
                              case 0:
                                 var33[var10001] = var55;
                                 if (var17 >= var16) {
                                    CONST_V = var13;
                                    CONST_W = new Integer[15];
                                    CONST_A = ((String)null);
                                    CONST_C = ((String)null);
                                    CONST_E = ((String)null);
                                    CONST_J = ((String)null);
                                    CONST_G = ((String)null);
                                    CONST_I = ((String)null);
                                    CONST_H = ((String)null);
                                    CONST_B = ((String)null);
                                    CONST_F = ((String)null);
                                    Cipher var22;
                                    var10000 = var22 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var23 = 1; var23 < 8; var23++) {
                                       var10003[var23] = (byte)(var0 << var23 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long var24 = 905914037821256966L;
                                    byte[] var26 = var22.doFinal(
                                       new byte[]{
                                          (byte)(var24 >>> 56),
                                          (byte)(var24 >>> 48),
                                          (byte)(var24 >>> 40),
                                          (byte)(var24 >>> 32),
                                          (byte)(var24 >>> 24),
                                          (byte)(var24 >>> 16),
                                          (byte)(var24 >>> 8),
                                          (byte)var24
                                       }
                                    );
                                    long var50 = (var26[0] & 255L) << 56
                                       | (var26[1] & 255L) << 48
                                       | (var26[2] & 255L) << 40
                                       | (var26[3] & 255L) << 32
                                       | (var26[4] & 255L) << 24
                                       | (var26[5] & 255L) << 16
                                       | (var26[6] & 255L) << 8
                                       | var26[7] & 255L;
                                    byte var41 = -1;
                                    4294967295L = var50;
                                    return;
                                 }
                                 break;
                              default:
                                 var33[var10001] = var55;
                                 if (var17 < var16) {
                                    continue label46;
                                 }

                                 var15 = "&÷ÑòI×D\u001duxo¨¨Ù/Õ";
                                 var16 = "&÷ÑòI×D\u001duxo¨¨Ù/Õ".length();
                                 var17 = 0;
                           }

                           byte var40 = var17;
                           var17 += 8;
                           var18 = var15.substring(var40, var17).getBytes("ISO-8859-1");
                           var33 = var13;
                           var10001 = var14++;
                           var47 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var52 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var28);
                  break;
               default:
                  var4[var5++] = var43;
                  if ((var28 += var8) < var7) {
                     var8 = var6.charAt(var28);
                     continue label64;
                  }

                  var6 = "í·Ø\u0085½%;\u00ad÷ý\u0086¸1C_âzçßR{Ò?L\u001c\u0098bÝ\u0016CÌ (ÔY×Ý©¢\u0082\u0014º \u0017\u000f°\u0017\u001b\rvt?6IõæTt±Ó÷|K1\u0002>¡ùu,\u0080o(";
                  var7 = "í·Ø\u0085½%;\u00ad÷ý\u0086¸1C_âzçßR{Ò?L\u001c\u0098bÝ\u0016CÌ (ÔY×Ý©¢\u0082\u0014º \u0017\u000f°\u0017\u001b\rvt?6IõæTt±Ó÷|K1\u0002>¡ùu,\u0080o("
                     .length();
                  var8 = ' ';
                  var28 = -1;
            }

            var30 = var6.substring(++var28, var28 + var8);
            var10001 = 0;
         }
      }
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

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20595;
      if (CONST_T[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_U.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_U.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/fq", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_S[var3].getBytes("ISO-8859-1");
         CONST_T[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_T[var3];
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
         throw new RuntimeException("rip/breeze/client/fq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8295;
      if (CONST_W[var3] == null) {
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
         long var5 = CONST_V[var3];
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
         Object[] var9 = (Object[])CONST_X.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_X.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/fq", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_W[var3] = var15;
      }

      return CONST_W[var3];
   }

   private static int getValue_4(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
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
               MethodHandles.insertArguments("getValue_4".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/fq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
