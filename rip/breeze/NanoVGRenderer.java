package rip.breeze;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.BufferUtils;
import org.lwjgl.nanovg.NSVGImage;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NVGPaint;
import org.lwjgl.nanovg.NanoSVG;
import org.lwjgl.nanovg.NanoVG;
import org.lwjgl.nanovg.NanoVGGL2;
import org.lwjgl.opengl.GL11;
import rip.breeze.client.BreezeClient;
import rip.breeze.client.MinecraftAccessor;

public final class NanoVGRenderer implements IRenderer {
   private static final Color CONST_A;
   private static final Color CONST_B;
   private int fieldInt_c;
   private int fieldInt_d;
   private int fieldInt_e;
   private int fieldInt_f;
   private int fieldInt_g;
   private int fieldInt_h;
   private int fieldInt_i;
   private int fieldInt_j;
   private int fieldInt_k;
   private int fieldInt_l;
   private int fieldInt_m;
   private int fieldInt_n;
   private float fieldFloat_o;
   private float fieldFloat_p;
   private float fieldFloat_q;
   private float fieldFloat_r;
   private boolean fieldBool_s;
   private boolean fieldBool_t;
   private boolean fieldBool_u;
   private boolean fieldBool_v;
   private boolean fieldBool_w;
   private boolean fieldBool_x;
   private boolean fieldBool_y;
   private boolean fieldBool_z;
   private boolean fieldBool_A;
   private boolean fieldBool_B;
   private boolean fieldBool_C;
   private boolean fieldBool_D;
   private boolean[] arr_E;
   private long fieldLong_F;
   private final NVGColor nVGColor_G;
   private final NVGColor nVGColor_H;
   private final NVGColor nVGColor_I;
   private final NVGPaint nVGPaint_J;
   private final float[] arr_K;
   private final Map<EnumType32, ByteBuffer> map_L;
   private final ConcurrentMap<String, Integer> concurrentMap_M;
   private final Map<String, Util23> map_N;
   private final ConcurrentMap<String, Util22> concurrentMap_O;
   private float float_;
   private static boolean fieldBool_Q;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);
   private static final long[] CONST_V;
   private static final Integer[] CONST_W;
   private static final Map CONST_X;

   public NanoVGRenderer() {
      long var1 = 64635365047301L;
      super();
      this.fieldInt_c = -1;
      this.arr_E = new boolean[4];
      this.nVGColor_G = NVGColor.create();
      this.nVGColor_H = NVGColor.create();
      this.nVGColor_I = NVGColor.create();
      LicenseState[] var10000 = KeybindSettings.decrypt();
      this.nVGPaint_J = NVGPaint.create();
      this.arr_K = new float[4];
      this.map_L = new HashMap<>();
      LicenseState[] var3 = var10000;
      this.concurrentMap_M = new ConcurrentHashMap<>();
      this.map_N = new HashMap<>();
      this.concurrentMap_O = new ConcurrentHashMap<>();
      this.float_ = 1.0F;
      this.fieldLong_F = NanoVGGL2.nvgCreate(1);

      for (EnumType32 var7 : EnumType32.values()) {
         try {
            StringBuilder var10 = new StringBuilder();
            short var10001 = 10587;
            long var10002 = 413652032620684391L ^ var1;
            StringBuilder var11 = var10.append("fonts/").append(var7.getString_a());
            var10001 = 24834;
            var10002 = 6116480717605317681L ^ var1;
            ByteBuffer var8 = rip.breeze.client.RenderUtil32.getByteBuffer_2(var11.append(".ttf").toString(), 1024);
            NanoVG.nvgCreateFontMem(this.fieldLong_F, var7.name(), var8, false);
            this.map_L.put(var7, var8);
         } catch (IOException var9) {
            throw new RuntimeException(var9);
         }

         if (var3 == null) {
            break;
         }
      }
   }

   private void processAll(String... var1) {
      long var2 = 15152978502495L;
      LicenseState[] var10000 = KeybindSettings.decrypt();
      String[] var4 = var1;
      LicenseState[] var5 = var10000;

      for (String var8 : var4) {
         try {
            this.concurrentMap_M
               .put(
                  var8,
                  NanoVG.nvgCreateImageMem(
                     this.fieldLong_F, 32, rip.breeze.client.RenderUtil32.getByteBuffer_2("textures/" + var8, 512)
                  )
               );
         } catch (IOException var10) {
            throw new RuntimeException(var10);
         }

         if (var5 == null) {
            break;
         }
      }
   }

   private void processAll_2(String var1, InputStream var2) {
      if (var1 == null) {
         var1 = "";
      }

      long var3 = 41521224442719L;

      try {
         ByteBuffer var5 = getByteBuffer(var2);
         this.concurrentMap_M.put("URL:" + var1, NanoVG.nvgCreateImageMem(this.fieldLong_F, 32, var5));
      } catch (IOException var6) {
         throw new RuntimeException(var6);
      }
   }

   private static ByteBuffer getByteBuffer(InputStream var0) throws IOException {
      long var1 = 17262326141111L;
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      LicenseState[] var10000 = KeybindSettings.decrypt();
      byte[] var4 = new byte[16384];
      LicenseState[] var5 = var10000;

      int var6;
      while ((var6 = var0.read(var4, 0, var4.length)) != -1) {
         var3.write(var4, 0, var6);
         if (var5 == null) {
            break;
         }
      }

      byte[] var7 = var3.toByteArray();
      ByteBuffer var8 = ByteBuffer.allocateDirect(var7.length).order(ByteOrder.nativeOrder());
      ((Buffer)var8.put(var7)).flip();
      return var8;
   }

   @Override
   public void executeOnRenderThread(Runnable var1) {
      this.calculate(1.0F, var1);
   }

   public void calculate(float var1, Runnable var2) {
      long var3 = 121122966878918L;
      NanoVG.nvgBeginFrame(this.fieldLong_F, BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight, 1.0F);
      this.float_ = 1.0F;
      if (var1 != 1.0F) {
         NanoVG.nvgResetTransform(this.fieldLong_F);
         float var5 = BreezeClient.CONST_A.displayWidth / 2.0F;
         float var6 = BreezeClient.CONST_A.displayHeight / 2.0F;
         NanoVG.nvgTranslate(this.fieldLong_F, var5, var6);
         NanoVG.nvgScale(this.fieldLong_F, var1, var1);
         NanoVG.nvgTranslate(this.fieldLong_F, -var5, -var6);
      }

      var2.run();
      GlStateManager.disableAlpha();
      NanoVG.nvgEndFrame(this.fieldLong_F);
   }

   private static void processAll_3(Object param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/NanoVGRenderer.34061446610582L J
      // 03: ldc2_w 137836428060695
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic rip/breeze/KeybindSettings.decrypt ()[Lrip/breeze/LicenseState;
      // 0b: astore 4
      // 0d: aload 0
      // 0e: iload 1
      // 0f: ifne 1a
      // 12: bipush 1
      // 13: goto 1b
      // 16: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: bipush 0
      // 1b: invokestatic rip/breeze/client/MinecraftAccessor.initialize_33 (Ljava/lang/Object;Z)V
      // 1e: iload 1
      // 1f: ifeq 32
      // 22: aload 0
      // 23: invokestatic rip/breeze/client/MinecraftAccessor.initialize_34 (Ljava/lang/Object;)V
      // 26: aload 4
      // 28: ifnonnull 3d
      // 2b: goto 32
      // 2e: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: invokestatic rip/breeze/client/MinecraftAccessor.initialize_2 (Ljava/lang/Object;)V
      // 36: goto 3d
      // 39: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: return
      // try (6 -> 11): 11 java/lang/RuntimeException
      // try (14 -> 21): 22 java/lang/RuntimeException
      // try (17 -> 26): 27 java/lang/RuntimeException
   }

   public void processAll_4() {
      long var1 = 87273706313787L;
      IntBuffer var3 = BufferUtils.createIntBuffer(16);
      GL11.glGetInteger(-284624242, var3);
      this.fieldInt_d = var3.get(0);
      ((Buffer)var3).clear();
      this.fieldBool_t = GL11.glIsEnabled(3042);
      GL11.glGetInteger(3041, var3);
      this.fieldInt_i = var3.get(0);
      ((Buffer)var3).clear();
      GL11.glGetInteger(3040, var3);
      this.fieldInt_j = var3.get(0);
      ((Buffer)var3).clear();
      LicenseState[] var10000 = KeybindSettings.decrypt();
      this.fieldBool_u = GL11.glIsEnabled(2929);
      GL11.glGetInteger(2930, var3);
      LicenseState[] var4 = var10000;

      boolean var10001;
      label59: {
         try {
            var12 = this;
            if (var3.get(0) != 0) {
               var10001 = 1;
               break label59;
            }
         } catch (RuntimeException var10) {
            throw getThrowable(var10);
         }

         var10001 = 0;
      }

      var12.fieldBool_v = (boolean)var10001;
      ((Buffer)var3).clear();
      this.fieldBool_w = GL11.glIsEnabled(3089);
      this.fieldBool_x = GL11.glIsEnabled(2884);
      ByteBuffer var5 = BufferUtils.createByteBuffer(16);
      GL11.glGetBoolean(3107, var5);
      int var6 = 0;

      while (var6 < 4) {
         boolean var10002;
         label48: {
            try {
               var13 = this.arr_E;
               var10001 = var6;
               if (var5.get(var6) != 0) {
                  var10002 = true;
                  break label48;
               }
            } catch (RuntimeException var9) {
               throw getThrowable(var9);
            }

            var10002 = false;
         }

         var13[var10001] = var10002;
         var6++;
         if (var4 == null) {
            break;
         }
      }

      GL11.glGetInteger(2968, var3);
      this.fieldInt_k = var3.get(0);
      long var15 = 2214326701101409380L ^ var1;
      ((Buffer)var3).clear();
      GL11.glGetInteger(2962, var3);
      this.fieldInt_l = var3.get(0);
      ((Buffer)var3).clear();
      GL11.glGetInteger(2963, var3);
      this.fieldInt_m = var3.get(0);
      ((Buffer)var3).clear();
      GL11.glGetInteger(((String)null), var3);
      this.fieldInt_h = var3.get(0);
      long var16 = 164972724307992213L ^ var1;
      ((Buffer)var3).clear();
      GL11.glGetInteger(((String)null), var3);
      this.fieldInt_f = var3.get(0);
      long var17 = 5056668262012046725L ^ var1;
      ((Buffer)var3).clear();
      GL11.glGetInteger(((String)null), var3);
      this.fieldInt_g = var3.get(0);
      ((Buffer)var3).clear();
      this.fieldBool_D = GL11.glIsEnabled(2912);
      GL11.glGetInteger(2917, var3);
      this.fieldInt_n = var3.get(0);
      ((Buffer)var3).clear();
      FloatBuffer var11 = BufferUtils.createFloatBuffer(16);

      try {
         GL11.glGetFloat(2914, var11);
         this.fieldFloat_o = var11.get(0);
         ((Buffer)var11).clear();
         GL11.glGetFloat(2915, var11);
         this.fieldFloat_p = var11.get(0);
         ((Buffer)var11).clear();
         GL11.glGetFloat(2916, var11);
         this.fieldFloat_q = var11.get(0);
         ((Buffer)var11).clear();
         this.fieldBool_y = MinecraftAccessor.isValid_6(MinecraftAccessor.getObject());
         this.fieldBool_z = MinecraftAccessor.isValid_6(((Object[])MinecraftAccessor.getObject_7())[0]);
         this.fieldBool_A = MinecraftAccessor.isValid_6(((Object[])MinecraftAccessor.getObject_7())[1]);
         this.fieldBool_B = MinecraftAccessor.isValid_6(MinecraftAccessor.getObject_4());
         this.fieldBool_C = MinecraftAccessor.isValid_6(MinecraftAccessor.getObject_10(MinecraftAccessor.getObject_15()));
         this.fieldBool_s = MinecraftAccessor.isValid_6(MinecraftAccessor.getObject_11(MinecraftAccessor.getObject_3()));
         this.fieldInt_e = MinecraftAccessor.getValue_8(MinecraftAccessor.getObject_3());
         this.fieldFloat_r = MinecraftAccessor.getFloat_6(MinecraftAccessor.getObject_3());
         if (this.fieldBool_s) {
            GlStateManager.disableAlpha();
         }
      } catch (RuntimeException var8) {
         throw getThrowable(var8);
      }

      try {
         if (!LicenseState.isValid_2()) {
            KeybindSettings.initialize(new LicenseState[2]);
         }
      } catch (RuntimeException var7) {
         throw getThrowable(var7);
      }
   }

   public void calculate_2() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/NanoVGRenderer.34061446610582L J
      // 003: ldc2_w 117726389183863
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: getfield rip/breeze/NanoVGRenderer.fieldInt_d I
      // 00c: invokestatic org/lwjgl/opengl/GL20.glUseProgram (I)V
      // 00f: invokestatic rip/breeze/KeybindSettings.decrypt ()[Lrip/breeze/LicenseState;
      // 012: sipush 15711
      // 015: ldc2_w 6413276083183431161
      // 018: lload 1
      // 019: lxor
      // 01a: invokedynamic g (IJ)I bsm=rip/breeze/NanoVGRenderer.getCallSite_2 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: aload 0
      // 020: getfield rip/breeze/NanoVGRenderer.fieldInt_f I
      // 023: invokestatic org/lwjgl/opengl/GL15.glBindBuffer (II)V
      // 026: astore 3
      // 027: aload 0
      // 028: getfield rip/breeze/NanoVGRenderer.fieldBool_w Z
      // 02b: ifeq 03f
      // 02e: sipush 3089
      // 031: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 034: aload 3
      // 035: ifnonnull 04c
      // 038: goto 03f
      // 03b: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: sipush 3089
      // 042: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 045: goto 04c
      // 048: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield rip/breeze/NanoVGRenderer.fieldInt_k I
      // 050: invokestatic org/lwjgl/opengl/GL11.glStencilMask (I)V
      // 053: sipush 7680
      // 056: sipush 7680
      // 059: sipush 7680
      // 05c: invokestatic org/lwjgl/opengl/GL11.glStencilOp (III)V
      // 05f: aload 0
      // 060: getfield rip/breeze/NanoVGRenderer.fieldInt_l I
      // 063: aload 0
      // 064: getfield rip/breeze/NanoVGRenderer.fieldInt_m I
      // 067: bipush -1
      // 068: invokestatic org/lwjgl/opengl/GL11.glStencilFunc (III)V
      // 06b: invokestatic rip/breeze/client/MinecraftAccessor.getObject_13 ()Ljava/lang/Object;
      // 06e: invokestatic rip/breeze/client/MinecraftAccessor.getObject_14 (Ljava/lang/Object;)Ljava/lang/Object;
      // 071: aload 0
      // 072: getfield rip/breeze/NanoVGRenderer.fieldBool_t Z
      // 075: invokestatic rip/breeze/NanoVGRenderer.processAll_3 (Ljava/lang/Object;Z)V
      // 078: invokestatic rip/breeze/client/MinecraftAccessor.getObject_13 ()Ljava/lang/Object;
      // 07b: aload 0
      // 07c: getfield rip/breeze/NanoVGRenderer.fieldInt_i I
      // 07f: bipush -1
      // 080: ixor
      // 081: invokestatic rip/breeze/client/MinecraftAccessor.initialize_29 (Ljava/lang/Object;I)V
      // 084: invokestatic rip/breeze/client/MinecraftAccessor.getObject_13 ()Ljava/lang/Object;
      // 087: aload 0
      // 088: getfield rip/breeze/NanoVGRenderer.fieldInt_j I
      // 08b: bipush -1
      // 08c: ixor
      // 08d: invokestatic rip/breeze/client/MinecraftAccessor.initialize_65 (Ljava/lang/Object;I)V
      // 090: aload 0
      // 091: getfield rip/breeze/NanoVGRenderer.fieldInt_i I
      // 094: aload 0
      // 095: getfield rip/breeze/NanoVGRenderer.fieldInt_j I
      // 098: invokestatic net/minecraft/client/renderer/GlStateManager.blendFunc (II)V
      // 09b: invokestatic rip/breeze/client/MinecraftAccessor.getObject_5 ()Ljava/lang/Object;
      // 09e: invokestatic rip/breeze/client/MinecraftAccessor.getObject_6 (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a1: aload 0
      // 0a2: getfield rip/breeze/NanoVGRenderer.fieldBool_u Z
      // 0a5: invokestatic rip/breeze/NanoVGRenderer.processAll_3 (Ljava/lang/Object;Z)V
      // 0a8: invokestatic rip/breeze/client/MinecraftAccessor.getObject_5 ()Ljava/lang/Object;
      // 0ab: aload 0
      // 0ac: getfield rip/breeze/NanoVGRenderer.fieldBool_v Z
      // 0af: ifne 0ba
      // 0b2: bipush 1
      // 0b3: goto 0bb
      // 0b6: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: bipush 0
      // 0bb: invokestatic rip/breeze/client/MinecraftAccessor.initialize_40 (Ljava/lang/Object;Z)V
      // 0be: aload 0
      // 0bf: getfield rip/breeze/NanoVGRenderer.fieldBool_v Z
      // 0c2: invokestatic net/minecraft/client/renderer/GlStateManager.depthMask (Z)V
      // 0c5: invokestatic rip/breeze/client/MinecraftAccessor.getObject_12 ()Ljava/lang/Object;
      // 0c8: invokestatic rip/breeze/client/MinecraftAccessor.getObject_8 (Ljava/lang/Object;)Ljava/lang/Object;
      // 0cb: aload 0
      // 0cc: getfield rip/breeze/NanoVGRenderer.fieldBool_x Z
      // 0cf: invokestatic rip/breeze/NanoVGRenderer.processAll_3 (Ljava/lang/Object;Z)V
      // 0d2: invokestatic rip/breeze/client/MinecraftAccessor.getObject_16 ()Ljava/lang/Object;
      // 0d5: aload 0
      // 0d6: getfield rip/breeze/NanoVGRenderer.arr_E [Z
      // 0d9: bipush 0
      // 0da: baload
      // 0db: ifne 0e6
      // 0de: bipush 1
      // 0df: goto 0e7
      // 0e2: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: bipush 0
      // 0e7: invokestatic rip/breeze/client/MinecraftAccessor.initialize_45 (Ljava/lang/Object;Z)V
      // 0ea: aload 0
      // 0eb: getfield rip/breeze/NanoVGRenderer.arr_E [Z
      // 0ee: bipush 0
      // 0ef: baload
      // 0f0: aload 0
      // 0f1: getfield rip/breeze/NanoVGRenderer.arr_E [Z
      // 0f4: bipush 1
      // 0f5: baload
      // 0f6: aload 0
      // 0f7: getfield rip/breeze/NanoVGRenderer.arr_E [Z
      // 0fa: bipush 2
      // 0fb: baload
      // 0fc: aload 0
      // 0fd: getfield rip/breeze/NanoVGRenderer.arr_E [Z
      // 100: bipush 3
      // 101: baload
      // 102: invokestatic net/minecraft/client/renderer/GlStateManager.colorMask (ZZZZ)V
      // 105: bipush -1
      // 106: invokestatic rip/breeze/client/MinecraftAccessor.initialize_48 (I)V
      // 109: aload 0
      // 10a: getfield rip/breeze/NanoVGRenderer.fieldInt_h I
      // 10d: invokestatic net/minecraft/client/renderer/GlStateManager.setActiveTexture (I)V
      // 110: invokestatic rip/breeze/client/MinecraftAccessor.getObject_17 ()Ljava/lang/Object;
      // 113: checkcast [Ljava/lang/Object;
      // 116: invokestatic rip/breeze/client/MinecraftAccessor.getValue_6 ()I
      // 119: aaload
      // 11a: aload 0
      // 11b: getfield rip/breeze/NanoVGRenderer.fieldInt_g I
      // 11e: bipush -1
      // 11f: ixor
      // 120: invokestatic rip/breeze/client/MinecraftAccessor.initialize_58 (Ljava/lang/Object;I)V
      // 123: aload 0
      // 124: getfield rip/breeze/NanoVGRenderer.fieldInt_g I
      // 127: invokestatic net/minecraft/client/renderer/GlStateManager.bindTexture (I)V
      // 12a: invokestatic net/minecraft/client/renderer/GlStateManager.resetColor ()V
      // 12d: invokestatic rip/breeze/client/MinecraftAccessor.getObject_2 ()Ljava/lang/Object;
      // 130: invokestatic rip/breeze/client/MinecraftAccessor.getObject_9 (Ljava/lang/Object;)Ljava/lang/Object;
      // 133: aload 0
      // 134: getfield rip/breeze/NanoVGRenderer.fieldBool_D Z
      // 137: invokestatic rip/breeze/NanoVGRenderer.processAll_3 (Ljava/lang/Object;Z)V
      // 13a: invokestatic rip/breeze/client/MinecraftAccessor.getObject_2 ()Ljava/lang/Object;
      // 13d: aload 0
      // 13e: getfield rip/breeze/NanoVGRenderer.fieldInt_n I
      // 141: bipush -1
      // 142: ixor
      // 143: invokestatic rip/breeze/client/MinecraftAccessor.initialize_63 (Ljava/lang/Object;I)V
      // 146: aload 0
      // 147: getfield rip/breeze/NanoVGRenderer.fieldInt_n I
      // 14a: invokestatic net/minecraft/client/renderer/GlStateManager.setFog (I)V
      // 14d: invokestatic rip/breeze/client/MinecraftAccessor.getObject_2 ()Ljava/lang/Object;
      // 150: aload 0
      // 151: getfield rip/breeze/NanoVGRenderer.fieldFloat_o F
      // 154: fconst_1
      // 155: fsub
      // 156: invokestatic rip/breeze/client/MinecraftAccessor.initialize_30 (Ljava/lang/Object;F)V
      // 159: aload 0
      // 15a: getfield rip/breeze/NanoVGRenderer.fieldFloat_o F
      // 15d: invokestatic net/minecraft/client/renderer/GlStateManager.setFogDensity (F)V
      // 160: invokestatic rip/breeze/client/MinecraftAccessor.getObject_2 ()Ljava/lang/Object;
      // 163: aload 0
      // 164: getfield rip/breeze/NanoVGRenderer.fieldFloat_p F
      // 167: fconst_1
      // 168: fsub
      // 169: invokestatic rip/breeze/client/MinecraftAccessor.initialize_28 (Ljava/lang/Object;F)V
      // 16c: aload 0
      // 16d: getfield rip/breeze/NanoVGRenderer.fieldFloat_p F
      // 170: invokestatic net/minecraft/client/renderer/GlStateManager.setFogStart (F)V
      // 173: invokestatic rip/breeze/client/MinecraftAccessor.getObject_2 ()Ljava/lang/Object;
      // 176: aload 0
      // 177: getfield rip/breeze/NanoVGRenderer.fieldFloat_q F
      // 17a: fconst_1
      // 17b: fsub
      // 17c: invokestatic rip/breeze/client/MinecraftAccessor.initialize_66 (Ljava/lang/Object;F)V
      // 17f: aload 0
      // 180: getfield rip/breeze/NanoVGRenderer.fieldFloat_q F
      // 183: invokestatic net/minecraft/client/renderer/GlStateManager.setFogEnd (F)V
      // 186: invokestatic rip/breeze/client/MinecraftAccessor.getObject ()Ljava/lang/Object;
      // 189: aload 0
      // 18a: getfield rip/breeze/NanoVGRenderer.fieldBool_y Z
      // 18d: invokestatic rip/breeze/NanoVGRenderer.processAll_3 (Ljava/lang/Object;Z)V
      // 190: invokestatic rip/breeze/client/MinecraftAccessor.getObject_7 ()Ljava/lang/Object;
      // 193: checkcast [Ljava/lang/Object;
      // 196: bipush 0
      // 197: aaload
      // 198: aload 0
      // 199: getfield rip/breeze/NanoVGRenderer.fieldBool_z Z
      // 19c: invokestatic rip/breeze/NanoVGRenderer.processAll_3 (Ljava/lang/Object;Z)V
      // 19f: invokestatic rip/breeze/client/MinecraftAccessor.getObject_7 ()Ljava/lang/Object;
      // 1a2: checkcast [Ljava/lang/Object;
      // 1a5: bipush 1
      // 1a6: aaload
      // 1a7: aload 0
      // 1a8: getfield rip/breeze/NanoVGRenderer.fieldBool_A Z
      // 1ab: invokestatic rip/breeze/NanoVGRenderer.processAll_3 (Ljava/lang/Object;Z)V
      // 1ae: invokestatic rip/breeze/client/MinecraftAccessor.getObject_4 ()Ljava/lang/Object;
      // 1b1: aload 0
      // 1b2: getfield rip/breeze/NanoVGRenderer.fieldBool_B Z
      // 1b5: invokestatic rip/breeze/NanoVGRenderer.processAll_3 (Ljava/lang/Object;Z)V
      // 1b8: invokestatic rip/breeze/client/MinecraftAccessor.getObject_15 ()Ljava/lang/Object;
      // 1bb: invokestatic rip/breeze/client/MinecraftAccessor.getObject_10 (Ljava/lang/Object;)Ljava/lang/Object;
      // 1be: aload 0
      // 1bf: getfield rip/breeze/NanoVGRenderer.fieldBool_C Z
      // 1c2: invokestatic rip/breeze/NanoVGRenderer.processAll_3 (Ljava/lang/Object;Z)V
      // 1c5: invokestatic rip/breeze/client/MinecraftAccessor.getObject_3 ()Ljava/lang/Object;
      // 1c8: invokestatic rip/breeze/client/MinecraftAccessor.getObject_11 (Ljava/lang/Object;)Ljava/lang/Object;
      // 1cb: aload 0
      // 1cc: getfield rip/breeze/NanoVGRenderer.fieldBool_s Z
      // 1cf: invokestatic rip/breeze/NanoVGRenderer.processAll_3 (Ljava/lang/Object;Z)V
      // 1d2: invokestatic rip/breeze/client/MinecraftAccessor.getObject_3 ()Ljava/lang/Object;
      // 1d5: aload 0
      // 1d6: getfield rip/breeze/NanoVGRenderer.fieldInt_e I
      // 1d9: bipush -1
      // 1da: ixor
      // 1db: invokestatic rip/breeze/client/MinecraftAccessor.initialize_18 (Ljava/lang/Object;I)V
      // 1de: invokestatic rip/breeze/client/MinecraftAccessor.getObject_3 ()Ljava/lang/Object;
      // 1e1: aload 0
      // 1e2: getfield rip/breeze/NanoVGRenderer.fieldFloat_r F
      // 1e5: fconst_1
      // 1e6: fsub
      // 1e7: invokestatic rip/breeze/client/MinecraftAccessor.initialize_19 (Ljava/lang/Object;F)V
      // 1ea: aload 0
      // 1eb: getfield rip/breeze/NanoVGRenderer.fieldInt_e I
      // 1ee: aload 0
      // 1ef: getfield rip/breeze/NanoVGRenderer.fieldFloat_r F
      // 1f2: invokestatic net/minecraft/client/renderer/GlStateManager.alphaFunc (IF)V
      // 1f5: return
      // try (17 -> 24): 25 java/lang/RuntimeException
      // try (20 -> 29): 30 java/lang/RuntimeException
      // try (32 -> 78): 78 java/lang/RuntimeException
      // try (81 -> 98): 98 java/lang/RuntimeException
   }

   @Override
   public void drawRect(float var1, float var2, float var3, float var4, Color var5) {
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRect(this.fieldLong_F, var1, var2, var3, var4);
      NanoVG.nvgFillColor(this.fieldLong_F, this.getNVGColor_4(var5));
      NanoVG.nvgFill(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   @Override
   public void fillRect(LicenseState var1, Color var2) {
      this.drawRect(var1.fieldFloat_a, var1.fieldFloat_b, var1.fieldFloat_c, var1.fieldFloat_d, var2);
   }

   @Override
   public void strokeRect(float var1, float var2, float var3, float var4, float var5, Color var6) {
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRect(this.fieldLong_F, var1, var2, var3, var4);
      NanoVG.nvgStrokeColor(this.fieldLong_F, this.getNVGColor_4(var6));
      NanoVG.nvgStrokeWidth(this.fieldLong_F, var5);
      NanoVG.nvgStroke(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   @Override
   public void fillRoundedRect(LicenseState var1, float var2, Color var3) {
      this.strokeRect(var1.fieldFloat_a, var1.fieldFloat_b, var1.fieldFloat_c, var1.fieldFloat_d, var2, var3);
   }

   @Override
   public void strokeRoundedRect(LicenseState var1, float var2, Color var3) {
      this.drawRect(var1.fieldFloat_a, var1.fieldFloat_b, var1.fieldFloat_c, var1.fieldFloat_d, var2, var3);
   }

   public void drawRect(float var1, float var2, float var3, float var4, float var5, Color var6) {
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRoundedRect(this.fieldLong_F, var1, var2, var3, var4, var5);
      NanoVG.nvgFillColor(this.fieldLong_F, this.getNVGColor_4(var6));
      NanoVG.nvgFill(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   public void calculate_3(float var1, float var2, float var3, float var4, float var5, Color var6, Color var7) {
      NVGPaint var8 = this.getNVGPaint_J();
      NanoVG.nvgLinearGradient(
         this.fieldLong_F, var1, var2, var1 + var3, var2 + var4, this.getNVGColor(this.nVGColor_G, var6), this.getNVGColor(this.nVGColor_H, var7), var8
      );
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRoundedRect(this.fieldLong_F, var1, var2, var3, var4, var5);
      NanoVG.nvgFillPaint(this.fieldLong_F, var8);
      NanoVG.nvgFill(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   public void calculate_4(float var1, float var2, float var3, float var4, float var5, float var6, float var7, Color var8) {
      NVGPaint var9 = this.getNVGPaint_J();
      NanoVG.nvgBoxGradient(
         this.fieldLong_F,
         var1,
         var2 + 2.0F,
         var3,
         var4,
         var5 * 2.0F,
         var6,
         this.getNVGColor(this.nVGColor_G, var8),
         this.getNVGColor_2(this.nVGColor_H, 0.0F, 0.0F, 0.0F, 0.0F),
         var9
      );
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRoundedRect(this.fieldLong_F, var1 - var7, var2 - var7, var3 + var7 * 2.0F, var4 + var7 * 2.0F, var5 + var7);
      NanoVG.nvgFillPaint(this.fieldLong_F, var9);
      NanoVG.nvgFill(this.fieldLong_F);
   }

   @Override
   public void fillGradientRect(LicenseState var1, float[] var2, Color var3) {
      this.calculate_5(var1.fieldFloat_a, var1.fieldFloat_b, var1.fieldFloat_c, var1.fieldFloat_d, var2, var3);
   }

   public void calculate_5(float param1, float param2, float param3, float param4, float[] param5, Color param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/NanoVGRenderer.34061446610582L J
      // 003: ldc2_w 80614429082062
      // 006: lxor
      // 007: lstore 7
      // 009: invokestatic rip/breeze/KeybindSettings.decrypt ()[Lrip/breeze/LicenseState;
      // 00c: aload 5
      // 00e: bipush 0
      // 00f: faload
      // 010: fstore 9
      // 012: astore 10
      // 014: aload 5
      // 016: bipush 1
      // 017: faload
      // 018: fstore 11
      // 01a: aload 5
      // 01c: bipush 2
      // 01d: faload
      // 01e: fstore 12
      // 020: aload 5
      // 022: bipush 3
      // 023: faload
      // 024: fstore 13
      // 026: aload 0
      // 027: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 02a: invokestatic org/lwjgl/nanovg/NanoVG.nvgBeginPath (J)V
      // 02d: aload 0
      // 02e: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 031: fload 1
      // 032: fload 9
      // 034: fadd
      // 035: fload 2
      // 036: invokestatic org/lwjgl/nanovg/NanoVG.nvgMoveTo (JFF)V
      // 039: aload 0
      // 03a: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 03d: fload 1
      // 03e: fload 3
      // 03f: fadd
      // 040: fload 11
      // 042: fsub
      // 043: fload 2
      // 044: invokestatic org/lwjgl/nanovg/NanoVG.nvgLineTo (JFF)V
      // 047: fload 11
      // 049: fconst_0
      // 04a: fcmpl
      // 04b: ifle 06e
      // 04e: aload 0
      // 04f: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 052: fload 1
      // 053: fload 3
      // 054: fadd
      // 055: fload 2
      // 056: fload 1
      // 057: fload 3
      // 058: fadd
      // 059: fload 2
      // 05a: fload 11
      // 05c: fadd
      // 05d: fload 11
      // 05f: invokestatic org/lwjgl/nanovg/NanoVG.nvgArcTo (JFFFFF)V
      // 062: aload 10
      // 064: ifnonnull 080
      // 067: goto 06e
      // 06a: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: aload 0
      // 06f: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 072: fload 1
      // 073: fload 3
      // 074: fadd
      // 075: fload 2
      // 076: invokestatic org/lwjgl/nanovg/NanoVG.nvgLineTo (JFF)V
      // 079: goto 080
      // 07c: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: aload 0
      // 081: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 084: fload 1
      // 085: fload 3
      // 086: fadd
      // 087: fload 2
      // 088: fload 4
      // 08a: fadd
      // 08b: fload 12
      // 08d: fsub
      // 08e: invokestatic org/lwjgl/nanovg/NanoVG.nvgLineTo (JFF)V
      // 091: fload 12
      // 093: fconst_0
      // 094: fcmpl
      // 095: ifle 0be
      // 098: aload 0
      // 099: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 09c: fload 1
      // 09d: fload 3
      // 09e: fadd
      // 09f: fload 2
      // 0a0: fload 4
      // 0a2: fadd
      // 0a3: fload 1
      // 0a4: fload 3
      // 0a5: fadd
      // 0a6: fload 12
      // 0a8: fsub
      // 0a9: fload 2
      // 0aa: fload 4
      // 0ac: fadd
      // 0ad: fload 12
      // 0af: invokestatic org/lwjgl/nanovg/NanoVG.nvgArcTo (JFFFFF)V
      // 0b2: aload 10
      // 0b4: ifnonnull 0d3
      // 0b7: goto 0be
      // 0ba: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 0c2: fload 1
      // 0c3: fload 3
      // 0c4: fadd
      // 0c5: fload 2
      // 0c6: fload 4
      // 0c8: fadd
      // 0c9: invokestatic org/lwjgl/nanovg/NanoVG.nvgLineTo (JFF)V
      // 0cc: goto 0d3
      // 0cf: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 0d7: fload 1
      // 0d8: fload 13
      // 0da: fadd
      // 0db: fload 2
      // 0dc: fload 4
      // 0de: fadd
      // 0df: invokestatic org/lwjgl/nanovg/NanoVG.nvgLineTo (JFF)V
      // 0e2: fload 13
      // 0e4: fconst_0
      // 0e5: fcmpl
      // 0e6: ifle 10b
      // 0e9: aload 0
      // 0ea: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 0ed: fload 1
      // 0ee: fload 2
      // 0ef: fload 4
      // 0f1: fadd
      // 0f2: fload 1
      // 0f3: fload 2
      // 0f4: fload 4
      // 0f6: fadd
      // 0f7: fload 13
      // 0f9: fsub
      // 0fa: fload 13
      // 0fc: invokestatic org/lwjgl/nanovg/NanoVG.nvgArcTo (JFFFFF)V
      // 0ff: aload 10
      // 101: ifnonnull 11e
      // 104: goto 10b
      // 107: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10a: athrow
      // 10b: aload 0
      // 10c: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 10f: fload 1
      // 110: fload 2
      // 111: fload 4
      // 113: fadd
      // 114: invokestatic org/lwjgl/nanovg/NanoVG.nvgLineTo (JFF)V
      // 117: goto 11e
      // 11a: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11d: athrow
      // 11e: aload 0
      // 11f: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 122: fload 1
      // 123: fload 2
      // 124: fload 9
      // 126: fadd
      // 127: invokestatic org/lwjgl/nanovg/NanoVG.nvgLineTo (JFF)V
      // 12a: fload 9
      // 12c: fconst_0
      // 12d: fcmpl
      // 12e: ifle 14d
      // 131: aload 0
      // 132: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 135: fload 1
      // 136: fload 2
      // 137: fload 1
      // 138: fload 9
      // 13a: fadd
      // 13b: fload 2
      // 13c: fload 9
      // 13e: invokestatic org/lwjgl/nanovg/NanoVG.nvgArcTo (JFFFFF)V
      // 141: aload 10
      // 143: ifnonnull 15d
      // 146: goto 14d
      // 149: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: aload 0
      // 14e: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 151: fload 1
      // 152: fload 2
      // 153: invokestatic org/lwjgl/nanovg/NanoVG.nvgLineTo (JFF)V
      // 156: goto 15d
      // 159: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15c: athrow
      // 15d: aload 0
      // 15e: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 161: invokestatic org/lwjgl/nanovg/NanoVG.nvgClosePath (J)V
      // 164: aload 0
      // 165: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 168: aload 0
      // 169: aload 6
      // 16b: invokespecial rip/breeze/NanoVGRenderer.getNVGColor_4 (Ljava/awt/Color;)Lorg/lwjgl/nanovg/NVGColor;
      // 16e: invokestatic org/lwjgl/nanovg/NanoVG.nvgFillColor (JLorg/lwjgl/nanovg/NVGColor;)V
      // 171: aload 0
      // 172: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 175: invokestatic org/lwjgl/nanovg/NanoVG.nvgFill (J)V
      // 178: return
      // try (22 -> 61): 62 java/lang/RuntimeException
      // try (45 -> 71): 72 java/lang/RuntimeException
      // try (74 -> 109): 110 java/lang/RuntimeException
      // try (89 -> 121): 122 java/lang/RuntimeException
      // try (124 -> 153): 154 java/lang/RuntimeException
      // try (137 -> 163): 164 java/lang/RuntimeException
      // try (166 -> 189): 190 java/lang/RuntimeException
      // try (177 -> 197): 198 java/lang/RuntimeException
   }

   @Override
   public void fillRoundedRectGradient(float var1, float var2, float var3, float var4, float var5, float var6, Color var7) {
      this.fillComplexGradient(var1, var2, var3, var4, new float[]{var5, var5, var5, var5}, var6, var7);
   }

   @Override
   public void fillGradientRoundedRect(LicenseState var1, float[] var2, float var3, Color var4) {
      this.fillComplexGradient(var1.fieldFloat_a, var1.fieldFloat_b, var1.fieldFloat_c, var1.fieldFloat_d, var2, var3, var4);
   }

   @Override
   public void fillRoundedRectTwoColor(LicenseState var1, float var2, float var3, Color var4) {
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRoundedRect(this.fieldLong_F, var1.fieldFloat_a, var1.fieldFloat_b, var1.fieldFloat_c, var1.fieldFloat_d, var2);
      NanoVG.nvgStrokeColor(this.fieldLong_F, this.getNVGColor_4(var4));
      NanoVG.nvgStrokeWidth(this.fieldLong_F, var3);
      NanoVG.nvgStroke(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   @Override
   public void fillComplexGradient(float var1, float var2, float var3, float var4, float[] var5, float var6, Color var7) {
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRoundedRectVarying(this.fieldLong_F, var1, var2, var3, var4, var5[0], var5[1], var5[2], var5[3]);
      NanoVG.nvgStrokeColor(this.fieldLong_F, this.getNVGColor_4(var7));
      NanoVG.nvgStrokeWidth(this.fieldLong_F, var6);
      NanoVG.nvgStroke(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   @Override
   public void fillRoundedRectColor(float var1, float var2, float var3, float var4, float var5, float var6, Color var7) {
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgMoveTo(this.fieldLong_F, var1, var2);
      NanoVG.nvgLineTo(this.fieldLong_F, var3, var4);
      NanoVG.nvgLineTo(this.fieldLong_F, var5, var6);
      NanoVG.nvgClosePath(this.fieldLong_F);
      NanoVG.nvgFillColor(this.fieldLong_F, this.getNVGColor_4(var7));
      NanoVG.nvgFill(this.fieldLong_F);
   }

   @Override
   public void fillCircle(float var1, float var2, float var3, Color var4) {
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgCircle(this.fieldLong_F, var1, var2, var3);
      NanoVG.nvgFillColor(this.fieldLong_F, this.getNVGColor_4(var4));
      NanoVG.nvgFill(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   @Override
   public void strokeCircle(float var1, float var2, float var3, float var4, Color var5) {
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgCircle(this.fieldLong_F, var1, var2, var3);
      NanoVG.nvgStrokeColor(this.fieldLong_F, this.getNVGColor_4(var5));
      NanoVG.nvgStrokeWidth(this.fieldLong_F, var4);
      NanoVG.nvgStroke(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   public void strokeGradientRect(float var1, float var2, float var3, Color var4, float var5, Color var6) {
      this.fillCircle(var1, var2, var3, var4);
      this.strokeCircle(var1, var2, var3, var5, var6);
   }

   public void clamp(float var1, float var2, float var3, boolean var4, Color var5, Color var6, float var7) {
      long var8 = 131242645142152L;
      this.strokeCircle(var1, var2, var3, var7, var5);
      if (var4) {
         float var10 = Math.max(1.0F, var3 - var7 - 1.0F);
         this.fillCircle(var1, var2, var10, var6);
      }
   }

   public void processNullable(String var1, float var2, float var3, float var4, float var5) {
      if (var1 == null) {
         var1 = "";
      }

      this.processAll_5(var1, var2, var3, var4, var5, Color.WHITE);
   }

   public void processAll_5(String var1, float var2, float var3, float var4, float var5, Color var6) {
      if (var1 == null) {
         var1 = "";
      }

      long var7 = 57388040980134L;

      try {
         if (!this.concurrentMap_M.containsKey(var1)) {
            this.processAll(var1);
         }
      } catch (RuntimeException var10) {
         throw getThrowable(var10);
      }

      NVGPaint var9 = NanoVG.nvgImagePattern(this.fieldLong_F, var2, var3, var4, var5, 0.0F, this.concurrentMap_M.get(var1), 1.0F, this.getNVGPaint_J());
      var9.innerColor(this.getNVGColor_4(var6));
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRect(this.fieldLong_F, var2, var3, var4, var5);
      NanoVG.nvgFillPaint(this.fieldLong_F, var9);
      NanoVG.nvgFill(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   public void processAll_6(String var1, float var2, float var3, float var4, float var5, float var6, boolean var7) {
      if (var1 == null) {
         var1 = "";
      }

      long var8 = 11212533019238L;

      try {
         if (!this.concurrentMap_M.containsKey(var1)) {
            this.processAll(var1);
         }
      } catch (RuntimeException var11) {
         throw getThrowable(var11);
      }

      NVGPaint var10 = NanoVG.nvgImagePattern(this.fieldLong_F, var2, var3, var4, var5, 0.0F, this.concurrentMap_M.get(var1), 1.0F, this.getNVGPaint_J());
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRoundedRect(this.fieldLong_F, var2, var3, var4, var5, var6);
      NanoVG.nvgFillPaint(this.fieldLong_F, var10);
      NanoVG.nvgFill(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   private int getValue(String var1, byte[] var2) {
      if (var1 == null) {
         var1 = "";
      }

      long var3 = 128126388311748L;
      ByteBuffer var5 = ByteBuffer.allocateDirect(var2.length).order(ByteOrder.nativeOrder());
      ((Buffer)var5.put(var2)).flip();
      int var6 = NanoVG.nvgCreateImageMem(this.fieldLong_F, 32, var5);
      this.concurrentMap_M.put("URL:" + var1, var6);
      return var6;
   }

   public boolean isValid(String var1, float var2, float var3, float var4, float var5, boolean var6, Color var7) {
      if (var1 == null) {
         var1 = "";
      }

      long var8 = 116987943081257L;
      Integer var10 = this.concurrentMap_M.get("URL:" + var1);
      if (var10 != null) {
         NVGPaint var15 = NanoVG.nvgImagePattern(this.fieldLong_F, var2, var3, var4, var5, 0.0F, var10, 1.0F, this.getNVGPaint_J());
         var15.innerColor(this.getNVGColor_4(var7));
         NanoVG.nvgBeginPath(this.fieldLong_F);
         NanoVG.nvgRect(this.fieldLong_F, var2, var3, var4, var5);
         NanoVG.nvgFillPaint(this.fieldLong_F, var15);
         NanoVG.nvgFill(this.fieldLong_F);
         NanoVG.nvgClosePath(this.fieldLong_F);
         return true;
      }

      Util22 var11 = this.getBreezeUtil24(var1);

      try {
         if (var11.enum_PENDING_a != EnumType26.READY || var11.arr_b == null) {
            return false;
         }
      } catch (RuntimeException var14) {
         throw getThrowable(var14);
      }

      int var12 = this.getValue(var1, var11.arr_b);
      var11.arr_b = null;
      NVGPaint var13 = NanoVG.nvgImagePattern(this.fieldLong_F, var2, var3, var4, var5, 0.0F, var12, 1.0F, this.getNVGPaint_J());
      var13.innerColor(this.getNVGColor_4(var7));
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRect(this.fieldLong_F, var2, var3, var4, var5);
      NanoVG.nvgFillPaint(this.fieldLong_F, var13);
      NanoVG.nvgFill(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
      return true;
   }

   public boolean isValid_2(String var1, float var2, float var3, float var4, float var5, float var6, boolean var7) {
      if (var1 == null) {
         var1 = "";
      }

      long var8 = 103630854585047L;
      Integer var10 = this.concurrentMap_M.get("URL:" + var1);
      if (var10 != null) {
         NVGPaint var15 = NanoVG.nvgImagePattern(this.fieldLong_F, var2, var3, var4, var5, 0.0F, var10, 1.0F, this.getNVGPaint_J());
         NanoVG.nvgBeginPath(this.fieldLong_F);
         NanoVG.nvgRoundedRect(this.fieldLong_F, var2, var3, var4, var5, var6);
         NanoVG.nvgFillPaint(this.fieldLong_F, var15);
         NanoVG.nvgFill(this.fieldLong_F);
         NanoVG.nvgClosePath(this.fieldLong_F);
         return true;
      }

      Util22 var11 = this.getBreezeUtil24(var1);

      try {
         if (var11.enum_PENDING_a != EnumType26.READY || var11.arr_b == null) {
            return false;
         }
      } catch (RuntimeException var14) {
         throw getThrowable(var14);
      }

      int var12 = this.getValue(var1, var11.arr_b);
      var11.arr_b = null;
      NVGPaint var13 = NanoVG.nvgImagePattern(this.fieldLong_F, var2, var3, var4, var5, 0.0F, var12, 1.0F, this.getNVGPaint_J());
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRoundedRect(this.fieldLong_F, var2, var3, var4, var5, var6);
      NanoVG.nvgFillPaint(this.fieldLong_F, var13);
      NanoVG.nvgFill(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
      return true;
   }

   public boolean isValid_3(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnonnull 07
      // 04: ldc ""
      // 06: astore 1
      // 07: getstatic rip/breeze/NanoVGRenderer.34061446610582L J
      // 0a: ldc2_w 81193794697935
      // 0d: lxor
      // 0e: lstore 2
      // 0f: aload 0
      // 10: getfield rip/breeze/NanoVGRenderer.concurrentMap_O Ljava/util/concurrent/ConcurrentMap;
      // 13: aload 1
      // 14: invokeinterface java/util/concurrent/ConcurrentMap.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 19: checkcast rip/breeze/Util22
      // 1c: astore 4
      // 1e: aload 4
      // 20: ifnull 3d
      // 23: aload 4
      // 25: getfield rip/breeze/Util22.enum_PENDING_a Lrip/breeze/EnumType26;
      // 28: getstatic rip/breeze/EnumType26.FAILED Lrip/breeze/EnumType26;
      // 2b: if_acmpne 3d
      // 2e: goto 35
      // 31: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3e
      // 39: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // try (14 -> 20): 21 java/lang/RuntimeException
      // try (16 -> 25): 25 java/lang/RuntimeException
   }

   public boolean isValid_4(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      long var2 = 73683852629088L;

      try {
         if (this.concurrentMap_O.putIfAbsent(var1, new Util22(EnumType26.PENDING)) == null) {
            return true;
         }
      } catch (RuntimeException var4) {
         throw getThrowable(var4);
      }

      return false;
   }

   public void processAll_7(String param1, byte[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnonnull 07
      // 04: ldc ""
      // 06: astore 1
      // 07: getstatic rip/breeze/NanoVGRenderer.34061446610582L J
      // 0a: ldc2_w 119087163782640
      // 0d: lxor
      // 0e: lstore 3
      // 0f: invokestatic rip/breeze/KeybindSettings.decrypt ()[Lrip/breeze/LicenseState;
      // 12: aload 0
      // 13: getfield rip/breeze/NanoVGRenderer.concurrentMap_O Ljava/util/concurrent/ConcurrentMap;
      // 16: aload 1
      // 17: invokeinterface java/util/concurrent/ConcurrentMap.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1c: checkcast rip/breeze/Util22
      // 1f: astore 5
      // 21: astore 6
      // 23: aload 5
      // 25: ifnonnull 2d
      // 28: return
      // 29: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 2
      // 2e: ifnull 4b
      // 31: aload 5
      // 33: aload 2
      // 34: putfield rip/breeze/Util22.arr_b [B
      // 37: aload 5
      // 39: getstatic rip/breeze/EnumType26.READY Lrip/breeze/EnumType26;
      // 3c: putfield rip/breeze/Util22.enum_PENDING_a Lrip/breeze/EnumType26;
      // 3f: aload 6
      // 41: ifnonnull 5a
      // 44: goto 4b
      // 47: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 5
      // 4d: getstatic rip/breeze/EnumType26.FAILED Lrip/breeze/EnumType26;
      // 50: putfield rip/breeze/Util22.enum_PENDING_a Lrip/breeze/EnumType26;
      // 53: goto 5a
      // 56: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: return
      // try (16 -> 19): 19 java/lang/RuntimeException
      // try (21 -> 31): 32 java/lang/RuntimeException
      // try (23 -> 37): 38 java/lang/RuntimeException
   }

   public void processAll_8(String var1, float var2, float var3, float var4, Color var5) {
      if (var1 == null) {
         var1 = "";
      }

      long var6 = 129877952977480L;
      Util23 var8 = this.clamp_5(var1, var4);
      NVGPaint var9 = NanoVG.nvgImagePattern(this.fieldLong_F, var2, var3, var8.fieldInt_b, var8.fieldInt_c, 0.0F, var8.fieldInt_a, 1.0F, this.getNVGPaint_J());

      NVGPaint var10000;
      NanoVGRenderer var10001;
      Color var10002;
      label19: {
         try {
            var10000 = var9;
            var10001 = this;
            if (var5 != null) {
               var10002 = var5;
               break label19;
            }
         } catch (RuntimeException var10) {
            throw getThrowable(var10);
         }

         var10002 = Color.WHITE;
      }

      var10000.innerColor(var10001.getNVGColor_4(var10002));
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRect(this.fieldLong_F, var2, var3, var8.fieldInt_b, var8.fieldInt_c);
      NanoVG.nvgFillPaint(this.fieldLong_F, var9);
      NanoVG.nvgFill(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   @Override
   public void renderWithBounds(LicenseState var1, Runnable var2) {
      this.executeOnRenderThread(var1.fieldFloat_a, var1.fieldFloat_b, var1.fieldFloat_c, var1.fieldFloat_d, var2);
   }

   public void executeOnRenderThread(float var1, float var2, float var3, float var4, Runnable var5) {
      this.initialize();
      NanoVG.nvgIntersectScissor(this.fieldLong_F, var1, var2, var3, var4);
      var5.run();
      this.initialize_2();
   }

   public void initialize() {
      NanoVG.nvgSave(this.fieldLong_F);
   }

   public void initialize_2() {
      NanoVG.nvgRestore(this.fieldLong_F);
   }

   @Override
   public void executeOnRenderThread(Runnable var1) {
      this.initialize();
      var1.run();
      this.initialize_2();
   }

   public void initialize_3(float var1, float var2) {
      NanoVG.nvgTranslate(this.fieldLong_F, var1, var2);
   }

   public void initialize_4(float var1) {
      NanoVG.nvgRotate(this.fieldLong_F, var1);
   }

   public void initialize_5(float var1) {
      NanoVG.nvgScale(this.fieldLong_F, var1, var1);
   }

   @Override
   public void rotate(float var1, float var2, float var3) {
      this.initialize_3(var2, var3);
      this.initialize_5(var1);
      this.initialize_3(-var2, -var3);
   }

   public void initialize_6(float var1) {
      this.float_ = var1;
      NanoVG.nvgGlobalAlpha(this.fieldLong_F, var1);
   }

   public float getFloat() {
      return this.float_;
   }

   public void processNullable_2(String var1, float var2, float var3, Color var4, EnumType32 var5, float var6) {
      if (var1 == null) {
         var1 = "";
      }

      this.calculate_6(var1, var2, var3, var4, var5, var6, false);
   }

   public void calculate_6(String var1, float var2, float var3, Color var4, EnumType32 var5, float var6, boolean var7) {
      if (var1 == null) {
         var1 = "";
      }

      long var8 = 15300383247860L;

      try {
         if (var7) {
            this.calculate_6(var1, var2 + 1.0F, var3 + 1.0F, new Color(0, 0, 0, 150), var5, var6, false);
         }
      } catch (RuntimeException var10) {
         throw getThrowable(var10);
      }

      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgFontFace(this.fieldLong_F, var5.name());
      NanoVG.nvgFontSize(this.fieldLong_F, var6);
      NanoVG.nvgTextAlign(this.fieldLong_F, 9);
      NanoVG.nvgFillColor(this.fieldLong_F, this.getNVGColor_4(var4));
      NanoVG.nvgFontBlur(this.fieldLong_F, 0.0F);
      NanoVG.nvgText(this.fieldLong_F, var2, var3, var1);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   public void processAll_9(String var1, float var2, float var3, Color var4, EnumType32 var5, float var6, float var7) {
      if (var1 == null) {
         var1 = "";
      }

      long var8 = 70169665066105L;

      try {
         NanoVG.nvgFontFace(this.fieldLong_F, var5.name());
         NanoVG.nvgFontSize(this.fieldLong_F, var6);
         NanoVG.nvgTextAlign(this.fieldLong_F, 9);
         NanoVG.nvgBeginPath(this.fieldLong_F);
         if (var7 > 0.0F) {
            NanoVG.nvgFillColor(this.fieldLong_F, this.getNVGColor_4(var4));
            NanoVG.nvgFontBlur(this.fieldLong_F, var7);
            NanoVG.nvgText(this.fieldLong_F, var2, var3, var1);
         }
      } catch (RuntimeException var10) {
         throw getThrowable(var10);
      }

      NanoVG.nvgFillColor(this.fieldLong_F, this.getNVGColor_4(var4));
      NanoVG.nvgFontBlur(this.fieldLong_F, 0.0F);
      NanoVG.nvgText(this.fieldLong_F, var2, var3, var1);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   public void clamp_2(String param1, float param2, float param3, Color param4, EnumType32 param5, float param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ifnonnull 007
      // 004: ldc ""
      // 006: astore 1
      // 007: getstatic rip/breeze/NanoVGRenderer.34061446610582L J
      // 00a: ldc2_w 20698859439417
      // 00d: lxor
      // 00e: lstore 7
      // 010: aload 0
      // 011: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 014: aload 5
      // 016: invokevirtual rip/breeze/EnumType32.name ()Ljava/lang/String;
      // 019: invokestatic org/lwjgl/nanovg/NanoVG.nvgFontFace (JLjava/lang/CharSequence;)V
      // 01c: aload 0
      // 01d: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 020: fload 6
      // 022: invokestatic org/lwjgl/nanovg/NanoVG.nvgFontSize (JF)V
      // 025: invokestatic rip/breeze/KeybindSettings.decrypt ()[Lrip/breeze/LicenseState;
      // 028: aload 0
      // 029: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 02c: bipush 9
      // 02e: invokestatic org/lwjgl/nanovg/NanoVG.nvgTextAlign (JI)V
      // 031: fload 6
      // 033: fconst_2
      // 034: fadd
      // 035: fstore 9
      // 037: astore 10
      // 039: bipush 4
      // 03a: newarray 6
      // 03c: astore 11
      // 03e: aload 0
      // 03f: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 042: fconst_0
      // 043: fconst_0
      // 044: ldc_w " "
      // 047: aload 11
      // 049: invokestatic org/lwjgl/nanovg/NanoVG.nvgTextBounds (JFFLjava/lang/CharSequence;[F)F
      // 04c: pop
      // 04d: aload 11
      // 04f: bipush 2
      // 050: faload
      // 051: aload 11
      // 053: bipush 0
      // 054: faload
      // 055: fsub
      // 056: fstore 12
      // 058: fconst_1
      // 059: fload 12
      // 05b: ldc_w 4.0
      // 05e: fmul
      // 05f: invokestatic java/lang/Math.max (FF)F
      // 062: fstore 13
      // 064: fload 2
      // 065: fstore 14
      // 067: fload 2
      // 068: fstore 15
      // 06a: bipush 2
      // 06b: newarray 6
      // 06d: dup
      // 06e: bipush 0
      // 06f: fload 2
      // 070: fastore
      // 071: dup
      // 072: bipush 1
      // 073: fload 3
      // 074: fastore
      // 075: astore 16
      // 077: new rip/breeze/RenderUtil2_x
      // 07a: dup
      // 07b: aload 0
      // 07c: invokespecial rip/breeze/RenderUtil2_x.<init> (Lrip/breeze/NanoVGRenderer;)V
      // 07f: astore 17
      // 081: aload 17
      // 083: aload 4
      // 085: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 088: aload 17
      // 08a: bipush 0
      // 08b: putfield rip/breeze/RenderUtil2_x.fieldBool_b Z
      // 08e: new java/lang/StringBuilder
      // 091: dup
      // 092: invokespecial java/lang/StringBuilder.<init> ()V
      // 095: astore 18
      // 097: aload 0
      // 098: aload 17
      // 09a: fload 6
      // 09c: aload 16
      // 09e: aload 5
      // 0a0: invokedynamic accept (Lrip/breeze/NanoVGRenderer;Lrip/breeze/RenderUtil2_x;F[FLrip/breeze/EnumType32;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, rip/breeze/NanoVGRenderer.lambda$formattedText_Inner0 (Lrip/breeze/RenderUtil2_x;F[FLrip/breeze/EnumType32;Ljava/lang/String;)V, (Ljava/lang/String;)V ]
      // 0a5: astore 19
      // 0a7: bipush 0
      // 0a8: istore 20
      // 0aa: aload 1
      // 0ab: ifnull 0b9
      // 0ae: aload 1
      // 0af: invokevirtual java/lang/String.length ()I
      // 0b2: goto 0ba
      // 0b5: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: bipush 0
      // 0ba: istore 21
      // 0bc: iload 20
      // 0be: iload 21
      // 0c0: if_icmpge 880
      // 0c3: aload 1
      // 0c4: iload 20
      // 0c6: invokevirtual java/lang/String.charAt (I)C
      // 0c9: istore 22
      // 0cb: iload 22
      // 0cd: bipush 10
      // 0cf: if_icmpne 0ff
      // 0d2: aload 19
      // 0d4: aload 18
      // 0d6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d9: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 0de: aload 18
      // 0e0: bipush 0
      // 0e1: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 0e4: aload 16
      // 0e6: bipush 0
      // 0e7: fload 14
      // 0e9: fastore
      // 0ea: fload 14
      // 0ec: fstore 15
      // 0ee: aload 16
      // 0f0: bipush 1
      // 0f1: dup2
      // 0f2: faload
      // 0f3: fload 9
      // 0f5: fadd
      // 0f6: fastore
      // 0f7: iinc 20 1
      // 0fa: aload 10
      // 0fc: ifnonnull 0bc
      // 0ff: iload 22
      // 101: bipush 9
      // 103: if_icmpne 143
      // 106: aload 19
      // 108: aload 18
      // 10a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10d: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 112: aload 18
      // 114: bipush 0
      // 115: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 118: aload 16
      // 11a: bipush 0
      // 11b: faload
      // 11c: fload 15
      // 11e: fsub
      // 11f: fstore 23
      // 121: fload 23
      // 123: fload 13
      // 125: fdiv
      // 126: f2d
      // 127: invokestatic java/lang/Math.floor (D)D
      // 12a: d2f
      // 12b: fconst_1
      // 12c: fadd
      // 12d: fload 13
      // 12f: fmul
      // 130: fstore 24
      // 132: aload 16
      // 134: bipush 0
      // 135: fload 15
      // 137: fload 24
      // 139: fadd
      // 13a: fastore
      // 13b: iinc 20 1
      // 13e: aload 10
      // 140: ifnonnull 0bc
      // 143: iload 22
      // 145: sipush 167
      // 148: if_icmpne 870
      // 14b: iload 20
      // 14d: bipush 1
      // 14e: iadd
      // 14f: iload 21
      // 151: if_icmpge 870
      // 154: goto 15b
      // 157: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15a: athrow
      // 15b: aload 19
      // 15d: aload 18
      // 15f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 162: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 167: aload 18
      // 169: bipush 0
      // 16a: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 16d: aload 1
      // 16e: iload 20
      // 170: bipush 1
      // 171: iadd
      // 172: invokevirtual java/lang/String.charAt (I)C
      // 175: invokestatic java/lang/Character.toLowerCase (C)C
      // 178: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
      // 17b: astore 23
      // 17d: aload 23
      // 17f: astore 24
      // 181: bipush -1
      // 182: istore 25
      // 184: aload 24
      // 186: invokevirtual java/lang/String.hashCode ()I
      // 189: tableswitch 866 48 114 283 309 335 361 387 413 439 466 493 520 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 866 547 574 601 628 655 682 709 736 763 790 817 866 866 866 866 866 866 844
      // 2a4: aload 24
      // 2a6: ldc_w "0"
      // 2a9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2ac: ifeq 4eb
      // 2af: goto 2b6
      // 2b2: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: bipush 0
      // 2b7: istore 25
      // 2b9: aload 10
      // 2bb: ifnonnull 4eb
      // 2be: aload 24
      // 2c0: ldc_w "1"
      // 2c3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2c6: ifeq 4eb
      // 2c9: goto 2d0
      // 2cc: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2cf: athrow
      // 2d0: bipush 1
      // 2d1: istore 25
      // 2d3: aload 10
      // 2d5: ifnonnull 4eb
      // 2d8: aload 24
      // 2da: ldc_w "2"
      // 2dd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2e0: ifeq 4eb
      // 2e3: goto 2ea
      // 2e6: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e9: athrow
      // 2ea: bipush 2
      // 2eb: istore 25
      // 2ed: aload 10
      // 2ef: ifnonnull 4eb
      // 2f2: aload 24
      // 2f4: ldc_w "3"
      // 2f7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2fa: ifeq 4eb
      // 2fd: goto 304
      // 300: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 303: athrow
      // 304: bipush 3
      // 305: istore 25
      // 307: aload 10
      // 309: ifnonnull 4eb
      // 30c: aload 24
      // 30e: ldc_w "4"
      // 311: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 314: ifeq 4eb
      // 317: goto 31e
      // 31a: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31d: athrow
      // 31e: bipush 4
      // 31f: istore 25
      // 321: aload 10
      // 323: ifnonnull 4eb
      // 326: aload 24
      // 328: ldc_w "5"
      // 32b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 32e: ifeq 4eb
      // 331: goto 338
      // 334: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 337: athrow
      // 338: bipush 5
      // 339: istore 25
      // 33b: aload 10
      // 33d: ifnonnull 4eb
      // 340: aload 24
      // 342: ldc_w "6"
      // 345: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 348: ifeq 4eb
      // 34b: goto 352
      // 34e: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 351: athrow
      // 352: bipush 6
      // 354: istore 25
      // 356: aload 10
      // 358: ifnonnull 4eb
      // 35b: aload 24
      // 35d: ldc_w "7"
      // 360: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 363: ifeq 4eb
      // 366: goto 36d
      // 369: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36c: athrow
      // 36d: bipush 7
      // 36f: istore 25
      // 371: aload 10
      // 373: ifnonnull 4eb
      // 376: aload 24
      // 378: ldc_w "8"
      // 37b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 37e: ifeq 4eb
      // 381: goto 388
      // 384: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 387: athrow
      // 388: bipush 8
      // 38a: istore 25
      // 38c: aload 10
      // 38e: ifnonnull 4eb
      // 391: aload 24
      // 393: ldc_w "9"
      // 396: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 399: ifeq 4eb
      // 39c: goto 3a3
      // 39f: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a2: athrow
      // 3a3: bipush 9
      // 3a5: istore 25
      // 3a7: aload 10
      // 3a9: ifnonnull 4eb
      // 3ac: aload 24
      // 3ae: ldc_w "a"
      // 3b1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3b4: ifeq 4eb
      // 3b7: goto 3be
      // 3ba: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3bd: athrow
      // 3be: bipush 10
      // 3c0: istore 25
      // 3c2: aload 10
      // 3c4: ifnonnull 4eb
      // 3c7: aload 24
      // 3c9: ldc_w "b"
      // 3cc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3cf: ifeq 4eb
      // 3d2: goto 3d9
      // 3d5: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d8: athrow
      // 3d9: bipush 11
      // 3db: istore 25
      // 3dd: aload 10
      // 3df: ifnonnull 4eb
      // 3e2: aload 24
      // 3e4: ldc_w "c"
      // 3e7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3ea: ifeq 4eb
      // 3ed: goto 3f4
      // 3f0: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f3: athrow
      // 3f4: bipush 12
      // 3f6: istore 25
      // 3f8: aload 10
      // 3fa: ifnonnull 4eb
      // 3fd: aload 24
      // 3ff: ldc_w "d"
      // 402: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 405: ifeq 4eb
      // 408: goto 40f
      // 40b: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40e: athrow
      // 40f: bipush 13
      // 411: istore 25
      // 413: aload 10
      // 415: ifnonnull 4eb
      // 418: aload 24
      // 41a: ldc_w "e"
      // 41d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 420: ifeq 4eb
      // 423: goto 42a
      // 426: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 429: athrow
      // 42a: bipush 14
      // 42c: istore 25
      // 42e: aload 10
      // 430: ifnonnull 4eb
      // 433: aload 24
      // 435: ldc_w "f"
      // 438: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 43b: ifeq 4eb
      // 43e: goto 445
      // 441: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 444: athrow
      // 445: bipush 15
      // 447: istore 25
      // 449: aload 10
      // 44b: ifnonnull 4eb
      // 44e: aload 24
      // 450: ldc_w "g"
      // 453: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 456: ifeq 4eb
      // 459: goto 460
      // 45c: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45f: athrow
      // 460: bipush 16
      // 462: istore 25
      // 464: aload 10
      // 466: ifnonnull 4eb
      // 469: aload 24
      // 46b: ldc_w "h"
      // 46e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 471: ifeq 4eb
      // 474: goto 47b
      // 477: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47a: athrow
      // 47b: bipush 17
      // 47d: istore 25
      // 47f: aload 10
      // 481: ifnonnull 4eb
      // 484: aload 24
      // 486: ldc_w "i"
      // 489: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 48c: ifeq 4eb
      // 48f: goto 496
      // 492: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 495: athrow
      // 496: bipush 18
      // 498: istore 25
      // 49a: aload 10
      // 49c: ifnonnull 4eb
      // 49f: aload 24
      // 4a1: ldc_w "j"
      // 4a4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4a7: ifeq 4eb
      // 4aa: goto 4b1
      // 4ad: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b0: athrow
      // 4b1: bipush 19
      // 4b3: istore 25
      // 4b5: aload 10
      // 4b7: ifnonnull 4eb
      // 4ba: aload 24
      // 4bc: ldc_w "k"
      // 4bf: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4c2: ifeq 4eb
      // 4c5: goto 4cc
      // 4c8: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4cb: athrow
      // 4cc: bipush 20
      // 4ce: istore 25
      // 4d0: aload 10
      // 4d2: ifnonnull 4eb
      // 4d5: aload 24
      // 4d7: ldc_w "r"
      // 4da: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4dd: ifeq 4eb
      // 4e0: goto 4e7
      // 4e3: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e6: athrow
      // 4e7: bipush 21
      // 4e9: istore 25
      // 4eb: iload 25
      // 4ed: tableswitch 870 0 21 103 130 159 188 219 248 279 310 343 373 404 435 467 498 530 562 595 613 671 729 787 845
      // 554: aload 17
      // 556: new java/awt/Color
      // 559: dup
      // 55a: bipush 0
      // 55b: bipush 0
      // 55c: bipush 0
      // 55d: invokespecial java/awt/Color.<init> (III)V
      // 560: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 563: aload 10
      // 565: ifnonnull 868
      // 568: goto 56f
      // 56b: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56e: athrow
      // 56f: aload 17
      // 571: new java/awt/Color
      // 574: dup
      // 575: bipush 0
      // 576: bipush 0
      // 577: sipush 170
      // 57a: invokespecial java/awt/Color.<init> (III)V
      // 57d: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 580: aload 10
      // 582: ifnonnull 868
      // 585: goto 58c
      // 588: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58b: athrow
      // 58c: aload 17
      // 58e: new java/awt/Color
      // 591: dup
      // 592: bipush 0
      // 593: sipush 170
      // 596: bipush 0
      // 597: invokespecial java/awt/Color.<init> (III)V
      // 59a: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 59d: aload 10
      // 59f: ifnonnull 868
      // 5a2: goto 5a9
      // 5a5: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a8: athrow
      // 5a9: aload 17
      // 5ab: new java/awt/Color
      // 5ae: dup
      // 5af: bipush 0
      // 5b0: sipush 170
      // 5b3: sipush 170
      // 5b6: invokespecial java/awt/Color.<init> (III)V
      // 5b9: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 5bc: aload 10
      // 5be: ifnonnull 868
      // 5c1: goto 5c8
      // 5c4: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c7: athrow
      // 5c8: aload 17
      // 5ca: new java/awt/Color
      // 5cd: dup
      // 5ce: sipush 170
      // 5d1: bipush 0
      // 5d2: bipush 0
      // 5d3: invokespecial java/awt/Color.<init> (III)V
      // 5d6: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 5d9: aload 10
      // 5db: ifnonnull 868
      // 5de: goto 5e5
      // 5e1: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e4: athrow
      // 5e5: aload 17
      // 5e7: new java/awt/Color
      // 5ea: dup
      // 5eb: sipush 170
      // 5ee: bipush 0
      // 5ef: sipush 170
      // 5f2: invokespecial java/awt/Color.<init> (III)V
      // 5f5: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 5f8: aload 10
      // 5fa: ifnonnull 868
      // 5fd: goto 604
      // 600: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 603: athrow
      // 604: aload 17
      // 606: new java/awt/Color
      // 609: dup
      // 60a: sipush 255
      // 60d: sipush 170
      // 610: bipush 0
      // 611: invokespecial java/awt/Color.<init> (III)V
      // 614: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 617: aload 10
      // 619: ifnonnull 868
      // 61c: goto 623
      // 61f: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 622: athrow
      // 623: aload 17
      // 625: new java/awt/Color
      // 628: dup
      // 629: sipush 170
      // 62c: sipush 170
      // 62f: sipush 170
      // 632: invokespecial java/awt/Color.<init> (III)V
      // 635: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 638: aload 10
      // 63a: ifnonnull 868
      // 63d: goto 644
      // 640: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 643: athrow
      // 644: aload 17
      // 646: new java/awt/Color
      // 649: dup
      // 64a: bipush 85
      // 64c: bipush 85
      // 64e: bipush 85
      // 650: invokespecial java/awt/Color.<init> (III)V
      // 653: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 656: aload 10
      // 658: ifnonnull 868
      // 65b: goto 662
      // 65e: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 661: athrow
      // 662: aload 17
      // 664: new java/awt/Color
      // 667: dup
      // 668: bipush 85
      // 66a: bipush 85
      // 66c: sipush 255
      // 66f: invokespecial java/awt/Color.<init> (III)V
      // 672: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 675: aload 10
      // 677: ifnonnull 868
      // 67a: goto 681
      // 67d: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 680: athrow
      // 681: aload 17
      // 683: new java/awt/Color
      // 686: dup
      // 687: bipush 85
      // 689: sipush 255
      // 68c: bipush 85
      // 68e: invokespecial java/awt/Color.<init> (III)V
      // 691: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 694: aload 10
      // 696: ifnonnull 868
      // 699: goto 6a0
      // 69c: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69f: athrow
      // 6a0: aload 17
      // 6a2: new java/awt/Color
      // 6a5: dup
      // 6a6: bipush 85
      // 6a8: sipush 255
      // 6ab: sipush 255
      // 6ae: invokespecial java/awt/Color.<init> (III)V
      // 6b1: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 6b4: aload 10
      // 6b6: ifnonnull 868
      // 6b9: goto 6c0
      // 6bc: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6bf: athrow
      // 6c0: aload 17
      // 6c2: new java/awt/Color
      // 6c5: dup
      // 6c6: sipush 255
      // 6c9: bipush 85
      // 6cb: bipush 85
      // 6cd: invokespecial java/awt/Color.<init> (III)V
      // 6d0: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 6d3: aload 10
      // 6d5: ifnonnull 868
      // 6d8: goto 6df
      // 6db: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6de: athrow
      // 6df: aload 17
      // 6e1: new java/awt/Color
      // 6e4: dup
      // 6e5: sipush 255
      // 6e8: bipush 85
      // 6ea: sipush 255
      // 6ed: invokespecial java/awt/Color.<init> (III)V
      // 6f0: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 6f3: aload 10
      // 6f5: ifnonnull 868
      // 6f8: goto 6ff
      // 6fb: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6fe: athrow
      // 6ff: aload 17
      // 701: new java/awt/Color
      // 704: dup
      // 705: sipush 255
      // 708: sipush 255
      // 70b: bipush 85
      // 70d: invokespecial java/awt/Color.<init> (III)V
      // 710: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 713: aload 10
      // 715: ifnonnull 868
      // 718: goto 71f
      // 71b: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71e: athrow
      // 71f: aload 17
      // 721: new java/awt/Color
      // 724: dup
      // 725: sipush 255
      // 728: sipush 255
      // 72b: sipush 255
      // 72e: invokespecial java/awt/Color.<init> (III)V
      // 731: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 734: aload 10
      // 736: ifnonnull 868
      // 739: goto 740
      // 73c: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 73f: athrow
      // 740: aload 17
      // 742: bipush 1
      // 743: putfield rip/breeze/RenderUtil2_x.fieldBool_b Z
      // 746: aload 10
      // 748: ifnonnull 868
      // 74b: goto 752
      // 74e: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 751: athrow
      // 752: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 755: sipush 26400
      // 758: ldc2_w 3481018717269650852
      // 75b: lload 7
      // 75d: lxor
      // 75e: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/NanoVGRenderer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 763: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 766: astore 26
      // 768: aload 26
      // 76a: ifnull 77b
      // 76d: aload 17
      // 76f: aload 26
      // 771: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 774: goto 77b
      // 777: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77a: athrow
      // 77b: goto 868
      // 77e: astore 26
      // 780: aload 17
      // 782: aload 4
      // 784: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 787: aload 10
      // 789: ifnonnull 868
      // 78c: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 78f: sipush 27489
      // 792: ldc2_w 2615587568878084607
      // 795: lload 7
      // 797: lxor
      // 798: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/NanoVGRenderer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79d: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 7a0: astore 26
      // 7a2: aload 26
      // 7a4: ifnull 7b5
      // 7a7: aload 17
      // 7a9: aload 26
      // 7ab: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 7ae: goto 7b5
      // 7b1: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b4: athrow
      // 7b5: goto 868
      // 7b8: astore 26
      // 7ba: aload 17
      // 7bc: aload 4
      // 7be: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 7c1: aload 10
      // 7c3: ifnonnull 868
      // 7c6: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 7c9: sipush 31722
      // 7cc: ldc2_w 3204669735963619704
      // 7cf: lload 7
      // 7d1: lxor
      // 7d2: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/NanoVGRenderer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d7: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 7da: astore 26
      // 7dc: aload 26
      // 7de: ifnull 7ef
      // 7e1: aload 17
      // 7e3: aload 26
      // 7e5: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 7e8: goto 7ef
      // 7eb: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7ee: athrow
      // 7ef: goto 868
      // 7f2: astore 26
      // 7f4: aload 17
      // 7f6: aload 4
      // 7f8: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 7fb: aload 10
      // 7fd: ifnonnull 868
      // 800: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 803: sipush 21644
      // 806: ldc2_w 1458102873135308304
      // 809: lload 7
      // 80b: lxor
      // 80c: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/NanoVGRenderer.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 811: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 814: astore 26
      // 816: aload 26
      // 818: ifnull 829
      // 81b: aload 17
      // 81d: aload 26
      // 81f: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 822: goto 829
      // 825: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 828: athrow
      // 829: goto 868
      // 82c: astore 26
      // 82e: aload 17
      // 830: aload 4
      // 832: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 835: aload 10
      // 837: ifnonnull 868
      // 83a: aload 17
      // 83c: aload 4
      // 83e: putfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 841: aload 17
      // 843: bipush 0
      // 844: putfield rip/breeze/RenderUtil2_x.fieldBool_b Z
      // 847: aload 10
      // 849: ifnonnull 868
      // 84c: goto 853
      // 84f: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 852: athrow
      // 853: aload 18
      // 855: sipush 167
      // 858: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 85b: aload 23
      // 85d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 860: pop
      // 861: goto 868
      // 864: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 867: athrow
      // 868: iinc 20 2
      // 86b: aload 10
      // 86d: ifnonnull 0bc
      // 870: aload 18
      // 872: iload 22
      // 874: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 877: pop
      // 878: iinc 20 1
      // 87b: aload 10
      // 87d: ifnonnull 0bc
      // 880: aload 19
      // 882: aload 18
      // 884: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 887: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 88c: return
      // try (668 -> 673): 674 java/lang/Throwable
      // try (639 -> 657): 658 java/lang/Throwable
      // try (626 -> 649): 650 java/lang/Throwable
      // try (613 -> 636): 637 java/lang/Throwable
      // try (600 -> 623): 624 java/lang/Throwable
      // try (587 -> 610): 611 java/lang/Throwable
      // try (574 -> 597): 598 java/lang/Throwable
      // try (561 -> 584): 585 java/lang/Throwable
      // try (548 -> 571): 572 java/lang/Throwable
      // try (535 -> 558): 559 java/lang/Throwable
      // try (522 -> 545): 546 java/lang/Throwable
      // try (509 -> 532): 533 java/lang/Throwable
      // try (496 -> 519): 520 java/lang/Throwable
      // try (483 -> 506): 507 java/lang/Throwable
      // try (470 -> 493): 494 java/lang/Throwable
      // try (457 -> 480): 481 java/lang/Throwable
      // try (444 -> 467): 468 java/lang/Throwable
      // try (442 -> 454): 455 java/lang/Throwable
      // try (431 -> 437): 438 java/lang/Throwable
      // try (420 -> 426): 427 java/lang/Throwable
      // try (409 -> 415): 416 java/lang/Throwable
      // try (398 -> 404): 405 java/lang/Throwable
      // try (387 -> 393): 394 java/lang/Throwable
      // try (376 -> 382): 383 java/lang/Throwable
      // try (365 -> 371): 372 java/lang/Throwable
      // try (354 -> 360): 361 java/lang/Throwable
      // try (343 -> 349): 350 java/lang/Throwable
      // try (332 -> 338): 339 java/lang/Throwable
      // try (321 -> 327): 328 java/lang/Throwable
      // try (310 -> 316): 317 java/lang/Throwable
      // try (299 -> 305): 306 java/lang/Throwable
      // try (288 -> 294): 295 java/lang/Throwable
      // try (277 -> 283): 284 java/lang/Throwable
      // try (266 -> 272): 273 java/lang/Throwable
      // try (255 -> 261): 262 java/lang/Throwable
      // try (244 -> 250): 251 java/lang/Throwable
      // try (233 -> 239): 240 java/lang/Throwable
      // try (222 -> 228): 229 java/lang/Throwable
      // try (211 -> 217): 218 java/lang/Throwable
      // try (199 -> 206): 207 java/lang/Throwable
      // try (169 -> 177): 178 java/lang/Throwable
      // try (91 -> 96): 96 java/lang/Throwable
      // try (660 -> 676): 677 java/lang/Throwable
      // try (691 -> 696): 697 java/lang/Throwable
      // try (683 -> 699): 700 java/lang/Throwable
      // try (714 -> 719): 720 java/lang/Throwable
      // try (706 -> 722): 723 java/lang/Throwable
      // try (737 -> 742): 743 java/lang/Throwable
      // try (729 -> 745): 746 java/lang/Throwable
      // try (747 -> 760): 761 java/lang/Throwable
      // try (752 -> 769): 770 java/lang/Throwable
   }

   public float clamp_3(String param1, EnumType32 param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ifnonnull 007
      // 004: ldc ""
      // 006: astore 1
      // 007: getstatic rip/breeze/NanoVGRenderer.34061446610582L J
      // 00a: ldc2_w 115108059769314
      // 00d: lxor
      // 00e: lstore 4
      // 010: invokestatic rip/breeze/KeybindSettings.decrypt ()[Lrip/breeze/LicenseState;
      // 013: astore 6
      // 015: aload 1
      // 016: ifnull 027
      // 019: aload 1
      // 01a: invokevirtual java/lang/String.isEmpty ()Z
      // 01d: ifeq 02d
      // 020: goto 027
      // 023: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 026: athrow
      // 027: fconst_0
      // 028: freturn
      // 029: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: aload 0
      // 02e: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 031: aload 2
      // 032: invokevirtual rip/breeze/EnumType32.name ()Ljava/lang/String;
      // 035: invokestatic org/lwjgl/nanovg/NanoVG.nvgFontFace (JLjava/lang/CharSequence;)V
      // 038: aload 0
      // 039: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 03c: fload 3
      // 03d: invokestatic org/lwjgl/nanovg/NanoVG.nvgFontSize (JF)V
      // 040: aload 0
      // 041: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 044: bipush 9
      // 046: invokestatic org/lwjgl/nanovg/NanoVG.nvgTextAlign (JI)V
      // 049: bipush 4
      // 04a: newarray 6
      // 04c: astore 7
      // 04e: aload 0
      // 04f: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 052: fconst_0
      // 053: fconst_0
      // 054: ldc_w " "
      // 057: aload 7
      // 059: invokestatic org/lwjgl/nanovg/NanoVG.nvgTextBounds (JFFLjava/lang/CharSequence;[F)F
      // 05c: pop
      // 05d: aload 7
      // 05f: bipush 2
      // 060: faload
      // 061: aload 7
      // 063: bipush 0
      // 064: faload
      // 065: fsub
      // 066: fstore 8
      // 068: fconst_1
      // 069: fload 8
      // 06b: ldc_w 4.0
      // 06e: fmul
      // 06f: invokestatic java/lang/Math.max (FF)F
      // 072: fstore 9
      // 074: fconst_0
      // 075: fstore 10
      // 077: fconst_0
      // 078: fstore 11
      // 07a: new java/lang/StringBuilder
      // 07d: dup
      // 07e: invokespecial java/lang/StringBuilder.<init> ()V
      // 081: astore 12
      // 083: bipush 0
      // 084: istore 13
      // 086: aload 1
      // 087: invokevirtual java/lang/String.length ()I
      // 08a: istore 14
      // 08c: iload 13
      // 08e: iload 14
      // 090: if_icmpge 2f1
      // 093: aload 1
      // 094: iload 13
      // 096: invokevirtual java/lang/String.charAt (I)C
      // 099: istore 15
      // 09b: iload 15
      // 09d: bipush 10
      // 09f: if_icmpne 0e9
      // 0a2: aload 12
      // 0a4: invokevirtual java/lang/StringBuilder.length ()I
      // 0a7: ifle 0d2
      // 0aa: goto 0b1
      // 0ad: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 0b5: fconst_0
      // 0b6: fconst_0
      // 0b7: aload 12
      // 0b9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0bc: aconst_null
      // 0bd: checkcast java/nio/FloatBuffer
      // 0c0: invokestatic org/lwjgl/nanovg/NanoVG.nvgTextBounds (JFFLjava/lang/CharSequence;Ljava/nio/FloatBuffer;)F
      // 0c3: fstore 16
      // 0c5: fload 11
      // 0c7: fload 16
      // 0c9: fadd
      // 0ca: fstore 11
      // 0cc: aload 12
      // 0ce: bipush 0
      // 0cf: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 0d2: fload 11
      // 0d4: fload 10
      // 0d6: fcmpl
      // 0d7: ifle 0de
      // 0da: fload 11
      // 0dc: fstore 10
      // 0de: fconst_0
      // 0df: fstore 11
      // 0e1: iinc 13 1
      // 0e4: aload 6
      // 0e6: ifnonnull 08c
      // 0e9: iload 15
      // 0eb: bipush 9
      // 0ed: if_icmpne 139
      // 0f0: aload 12
      // 0f2: invokevirtual java/lang/StringBuilder.length ()I
      // 0f5: ifle 120
      // 0f8: goto 0ff
      // 0fb: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 103: fconst_0
      // 104: fconst_0
      // 105: aload 12
      // 107: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10a: aconst_null
      // 10b: checkcast java/nio/FloatBuffer
      // 10e: invokestatic org/lwjgl/nanovg/NanoVG.nvgTextBounds (JFFLjava/lang/CharSequence;Ljava/nio/FloatBuffer;)F
      // 111: fstore 16
      // 113: fload 11
      // 115: fload 16
      // 117: fadd
      // 118: fstore 11
      // 11a: aload 12
      // 11c: bipush 0
      // 11d: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 120: fload 11
      // 122: fload 9
      // 124: fdiv
      // 125: f2d
      // 126: invokestatic java/lang/Math.floor (D)D
      // 129: d2f
      // 12a: fconst_1
      // 12b: fadd
      // 12c: fload 9
      // 12e: fmul
      // 12f: fstore 11
      // 131: iinc 13 1
      // 134: aload 6
      // 136: ifnonnull 08c
      // 139: iload 15
      // 13b: sipush 167
      // 13e: if_icmpne 2e1
      // 141: iload 13
      // 143: bipush 1
      // 144: iadd
      // 145: iload 14
      // 147: if_icmplt 169
      // 14a: goto 151
      // 14d: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 150: athrow
      // 151: aload 12
      // 153: sipush 167
      // 156: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 159: pop
      // 15a: iinc 13 1
      // 15d: aload 6
      // 15f: ifnonnull 08c
      // 162: goto 169
      // 165: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: aload 12
      // 16b: invokevirtual java/lang/StringBuilder.length ()I
      // 16e: ifle 192
      // 171: aload 0
      // 172: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 175: fconst_0
      // 176: fconst_0
      // 177: aload 12
      // 179: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17c: aconst_null
      // 17d: checkcast java/nio/FloatBuffer
      // 180: invokestatic org/lwjgl/nanovg/NanoVG.nvgTextBounds (JFFLjava/lang/CharSequence;Ljava/nio/FloatBuffer;)F
      // 183: fstore 16
      // 185: fload 11
      // 187: fload 16
      // 189: fadd
      // 18a: fstore 11
      // 18c: aload 12
      // 18e: bipush 0
      // 18f: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 192: aload 1
      // 193: iload 13
      // 195: bipush 1
      // 196: iadd
      // 197: invokevirtual java/lang/String.charAt (I)C
      // 19a: invokestatic java/lang/Character.toLowerCase (C)C
      // 19d: istore 16
      // 19f: iload 16
      // 1a1: tableswitch 298 48 114 283 283 283 283 283 283 283 283 283 283 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 298 283 283 283 283 283 283 283 283 283 283 283 298 298 298 298 298 298 283
      // 2bc: iinc 13 2
      // 2bf: aload 6
      // 2c1: ifnonnull 08c
      // 2c4: goto 2cb
      // 2c7: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ca: athrow
      // 2cb: aload 12
      // 2cd: sipush 167
      // 2d0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 2d3: iload 16
      // 2d5: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 2d8: pop
      // 2d9: iinc 13 2
      // 2dc: aload 6
      // 2de: ifnonnull 08c
      // 2e1: aload 12
      // 2e3: iload 15
      // 2e5: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 2e8: pop
      // 2e9: iinc 13 1
      // 2ec: aload 6
      // 2ee: ifnonnull 08c
      // 2f1: aload 12
      // 2f3: invokevirtual java/lang/StringBuilder.length ()I
      // 2f6: ifle 314
      // 2f9: aload 0
      // 2fa: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 2fd: fconst_0
      // 2fe: fconst_0
      // 2ff: aload 12
      // 301: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 304: aconst_null
      // 305: checkcast java/nio/FloatBuffer
      // 308: invokestatic org/lwjgl/nanovg/NanoVG.nvgTextBounds (JFFLjava/lang/CharSequence;Ljava/nio/FloatBuffer;)F
      // 30b: fstore 15
      // 30d: fload 11
      // 30f: fload 15
      // 311: fadd
      // 312: fstore 11
      // 314: fload 11
      // 316: fload 10
      // 318: fcmpl
      // 319: ifle 320
      // 31c: fload 11
      // 31e: fstore 10
      // 320: fload 10
      // 322: freturn
      // try (10 -> 15): 16 java/lang/RuntimeException
      // try (12 -> 20): 20 java/lang/RuntimeException
      // try (80 -> 86): 87 java/lang/RuntimeException
      // try (117 -> 123): 124 java/lang/RuntimeException
      // try (157 -> 165): 166 java/lang/RuntimeException
      // try (160 -> 175): 176 java/lang/RuntimeException
      // try (205 -> 210): 211 java/lang/RuntimeException
   }

   public float getFloat_2(String var1, EnumType32 var2, float var3) {
      if (var1 == null) {
         var1 = "";
      }

      AtomicReference var4 = new AtomicReference<>(0.0F);
      this.executeOnRenderThread(this::lambda$textWidth_Inner1);
      return (Float)var4.get();
   }

   public float calculateFloat(String var1, float var2) {
      if (var1 == null) {
         var1 = "";
      }

      int var3 = var1.split("\n").length;
      return var2 * 2.0F * var3;
   }

   @Override
   public void executeOnRenderThread(Runnable var1) {
      this.executeOnRenderThread(this::lambda$ignoreTransformation_Inner2);
   }

   public void calculate_7(float var1, float var2, float var3, float var4, float var5, float var6) {
      NanoVG.nvgSave(this.fieldLong_F);
      Color var7 = new Color(Color.HSBtoRGB(var6, 1.0F, 1.0F));
      NVGPaint var8 = this.getNVGPaint_J();
      NanoVG.nvgLinearGradient(
         this.fieldLong_F, var1, var2, var1 + var3, var2, this.getNVGColor_2(this.nVGColor_G, 1.0F, 1.0F, 1.0F, 1.0F), this.getNVGColor(this.nVGColor_H, var7), var8
      );
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRoundedRect(this.fieldLong_F, var1, var2, var3, var4, var5);
      NanoVG.nvgFillPaint(this.fieldLong_F, var8);
      NanoVG.nvgFill(this.fieldLong_F);
      NVGPaint var9 = this.getNVGPaint_J();
      NanoVG.nvgLinearGradient(
         this.fieldLong_F,
         var1,
         var2,
         var1,
         var2 + var4,
         this.getNVGColor_2(this.nVGColor_G, 0.0F, 0.0F, 0.0F, 0.0F),
         this.getNVGColor_2(this.nVGColor_H, 0.0F, 0.0F, 0.0F, 1.0F),
         var9
      );
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRoundedRect(this.fieldLong_F, var1, var2, var3, var4, var5);
      NanoVG.nvgFillPaint(this.fieldLong_F, var9);
      NanoVG.nvgFill(this.fieldLong_F);
      NanoVG.nvgRestore(this.fieldLong_F);
   }

   public void calculate_8(LicenseState param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/NanoVGRenderer.34061446610582L J
      // 003: ldc2_w 62418934476939
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic rip/breeze/KeybindSettings.decrypt ()[Lrip/breeze/LicenseState;
      // 00b: aload 0
      // 00c: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 00f: invokestatic org/lwjgl/nanovg/NanoVG.nvgSave (J)V
      // 012: astore 5
      // 014: aload 1
      // 015: getfield rip/breeze/LicenseState.fieldFloat_d F
      // 018: ldc_w 6.0
      // 01b: fdiv
      // 01c: fstore 6
      // 01e: bipush 7
      // 020: newarray 6
      // 022: dup
      // 023: bipush 0
      // 024: fconst_0
      // 025: fastore
      // 026: dup
      // 027: bipush 1
      // 028: ldc_w 0.16666667
      // 02b: fastore
      // 02c: dup
      // 02d: bipush 2
      // 02e: ldc_w 0.33333334
      // 031: fastore
      // 032: dup
      // 033: bipush 3
      // 034: ldc_w 0.5
      // 037: fastore
      // 038: dup
      // 039: bipush 4
      // 03a: ldc_w 0.6666667
      // 03d: fastore
      // 03e: dup
      // 03f: bipush 5
      // 040: ldc_w 0.8333333
      // 043: fastore
      // 044: dup
      // 045: bipush 6
      // 047: fconst_1
      // 048: fastore
      // 049: astore 7
      // 04b: aload 7
      // 04d: arraylength
      // 04e: bipush 2
      // 04f: isub
      // 050: istore 8
      // 052: bipush 0
      // 053: istore 9
      // 055: iload 9
      // 057: iload 8
      // 059: if_icmpgt 156
      // 05c: aload 0
      // 05d: invokespecial rip/breeze/NanoVGRenderer.getNVGPaint_J ()Lorg/lwjgl/nanovg/NVGPaint;
      // 060: astore 10
      // 062: aload 1
      // 063: getfield rip/breeze/LicenseState.fieldFloat_b F
      // 066: iload 9
      // 068: i2f
      // 069: fload 6
      // 06b: fmul
      // 06c: fadd
      // 06d: fstore 11
      // 06f: aload 0
      // 070: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 073: aload 1
      // 074: getfield rip/breeze/LicenseState.fieldFloat_a F
      // 077: fload 11
      // 079: aload 1
      // 07a: getfield rip/breeze/LicenseState.fieldFloat_a F
      // 07d: fload 11
      // 07f: fload 6
      // 081: fadd
      // 082: aload 0
      // 083: aload 0
      // 084: getfield rip/breeze/NanoVGRenderer.nVGColor_G Lorg/lwjgl/nanovg/NVGColor;
      // 087: aload 7
      // 089: iload 9
      // 08b: faload
      // 08c: fconst_1
      // 08d: ldc_w 0.5
      // 090: bipush -1
      // 091: invokespecial rip/breeze/NanoVGRenderer.getNVGColor_3 (Lorg/lwjgl/nanovg/NVGColor;FFFB)Lorg/lwjgl/nanovg/NVGColor;
      // 094: aload 0
      // 095: aload 0
      // 096: getfield rip/breeze/NanoVGRenderer.nVGColor_H Lorg/lwjgl/nanovg/NVGColor;
      // 099: aload 7
      // 09b: iload 9
      // 09d: bipush 1
      // 09e: iadd
      // 09f: faload
      // 0a0: fconst_1
      // 0a1: ldc_w 0.5
      // 0a4: bipush -1
      // 0a5: invokespecial rip/breeze/NanoVGRenderer.getNVGColor_3 (Lorg/lwjgl/nanovg/NVGColor;FFFB)Lorg/lwjgl/nanovg/NVGColor;
      // 0a8: aload 10
      // 0aa: invokestatic org/lwjgl/nanovg/NanoVG.nvgLinearGradient (JFFFFLorg/lwjgl/nanovg/NVGColor;Lorg/lwjgl/nanovg/NVGColor;Lorg/lwjgl/nanovg/NVGPaint;)Lorg/lwjgl/nanovg/NVGPaint;
      // 0ad: pop
      // 0ae: iload 9
      // 0b0: iload 8
      // 0b2: if_icmpne 0be
      // 0b5: fload 6
      // 0b7: goto 0c2
      // 0ba: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: fload 6
      // 0c0: fconst_1
      // 0c1: fadd
      // 0c2: fstore 12
      // 0c4: aload 0
      // 0c5: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 0c8: invokestatic org/lwjgl/nanovg/NanoVG.nvgBeginPath (J)V
      // 0cb: iload 9
      // 0cd: ifne 0f3
      // 0d0: aload 0
      // 0d1: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 0d4: aload 1
      // 0d5: getfield rip/breeze/LicenseState.fieldFloat_a F
      // 0d8: fload 11
      // 0da: aload 1
      // 0db: getfield rip/breeze/LicenseState.fieldFloat_c F
      // 0de: fload 12
      // 0e0: fload 2
      // 0e1: fload 2
      // 0e2: fconst_0
      // 0e3: fconst_0
      // 0e4: invokestatic org/lwjgl/nanovg/NanoVG.nvgRoundedRectVarying (JFFFFFFFF)V
      // 0e7: aload 5
      // 0e9: ifnonnull 13e
      // 0ec: goto 0f3
      // 0ef: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: iload 9
      // 0f5: iload 8
      // 0f7: if_icmpne 124
      // 0fa: goto 101
      // 0fd: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: aload 0
      // 102: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 105: aload 1
      // 106: getfield rip/breeze/LicenseState.fieldFloat_a F
      // 109: fload 11
      // 10b: aload 1
      // 10c: getfield rip/breeze/LicenseState.fieldFloat_c F
      // 10f: fload 12
      // 111: fconst_0
      // 112: fconst_0
      // 113: fload 2
      // 114: fload 2
      // 115: invokestatic org/lwjgl/nanovg/NanoVG.nvgRoundedRectVarying (JFFFFFFFF)V
      // 118: aload 5
      // 11a: ifnonnull 13e
      // 11d: goto 124
      // 120: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: aload 0
      // 125: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 128: aload 1
      // 129: getfield rip/breeze/LicenseState.fieldFloat_a F
      // 12c: fload 11
      // 12e: aload 1
      // 12f: getfield rip/breeze/LicenseState.fieldFloat_c F
      // 132: fload 12
      // 134: invokestatic org/lwjgl/nanovg/NanoVG.nvgRect (JFFFF)V
      // 137: goto 13e
      // 13a: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: aload 0
      // 13f: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 142: aload 10
      // 144: invokestatic org/lwjgl/nanovg/NanoVG.nvgFillPaint (JLorg/lwjgl/nanovg/NVGPaint;)V
      // 147: aload 0
      // 148: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 14b: invokestatic org/lwjgl/nanovg/NanoVG.nvgFill (J)V
      // 14e: iinc 9 1
      // 151: aload 5
      // 153: ifnonnull 055
      // 156: aload 0
      // 157: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 15a: invokestatic org/lwjgl/nanovg/NanoVG.nvgRestore (J)V
      // 15d: return
      // try (66 -> 106): 106 java/lang/RuntimeException
      // try (112 -> 132): 133 java/lang/RuntimeException
      // try (117 -> 138): 139 java/lang/RuntimeException
      // try (135 -> 156): 157 java/lang/RuntimeException
      // try (141 -> 168): 169 java/lang/RuntimeException
   }

   @Override
   public void setupTransform(float var1, float var2, float var3, float var4, float var5, float var6) {
      NVGPaint var7 = NanoVG.nvgImagePattern(this.fieldLong_F, var1, var2, var6, var6, 0.0F, this.getValue_2(), 1.0F, this.getNVGPaint_J());
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRoundedRect(this.fieldLong_F, var1, var2, var3, var4, var5);
      NanoVG.nvgFillPaint(this.fieldLong_F, var7);
      NanoVG.nvgFill(this.fieldLong_F);
   }

   public void calculate_9(LicenseState var1, float var2, Color var3) {
      NanoVG.nvgSave(this.fieldLong_F);
      this.setupTransform(var1.fieldFloat_a, var1.fieldFloat_b, var1.fieldFloat_c, var1.fieldFloat_d, var2, var1.fieldFloat_d);
      NVGPaint var4 = this.getNVGPaint_J();
      NanoVG.nvgLinearGradient(
         this.fieldLong_F,
         var1.fieldFloat_a,
         var1.fieldFloat_b,
         var1.fieldFloat_a + var1.fieldFloat_c,
         var1.fieldFloat_b,
         this.getNVGColor(this.nVGColor_G, RenderUtil1.getColor_7(var3, 0)),
         this.getNVGColor(this.nVGColor_H, RenderUtil1.getColor_7(var3, 255)),
         var4
      );
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgRoundedRect(this.fieldLong_F, var1.fieldFloat_a, var1.fieldFloat_b, var1.fieldFloat_c, var1.fieldFloat_d, var2);
      NanoVG.nvgFillPaint(this.fieldLong_F, var4);
      NanoVG.nvgFill(this.fieldLong_F);
      NanoVG.nvgRestore(this.fieldLong_F);
   }

   public void calculate_10(float var1, float var2, Color var3, float var4) {
      long var5 = 64859564971125L;

      try {
         this.initialize();
         this.initialize_3(var1 + 0.5F, var2);
         if (var4 != 1.0F) {
            this.initialize_5(var4);
         }
      } catch (RuntimeException var7) {
         throw getThrowable(var7);
      }

      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgMoveTo(this.fieldLong_F, -5.0F, -3.0F);
      NanoVG.nvgLineTo(this.fieldLong_F, 0.0F, -8.0F);
      NanoVG.nvgLineTo(this.fieldLong_F, 5.0F, -3.0F);
      NanoVG.nvgMoveTo(this.fieldLong_F, -5.0F, 3.0F);
      NanoVG.nvgLineTo(this.fieldLong_F, 0.0F, 8.0F);
      NanoVG.nvgLineTo(this.fieldLong_F, 5.0F, 3.0F);
      NanoVG.nvgStrokeWidth(this.fieldLong_F, 2.0F);
      NanoVG.nvgStrokeColor(this.fieldLong_F, this.getNVGColor_4(var3));
      NanoVG.nvgStroke(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
      this.initialize_2();
   }

   public void calculate_11(float var1, float var2, float var3, Color var4, float var5) {
      float var6 = (float)Math.toRadians(-90.0F * var5);
      float var7 = (float)Math.toRadians(90.0F * var5);
      this.drawRect(var1, var2, var3, var6, var7, 3.0F * (var3 / 22.0F), var4);
      float var8 = 1.0F - var5;
      float var9 = (float)Math.toRadians(90.0F + 90.0F * var8);
      float var10 = (float)Math.toRadians(180.0);
      this.drawRect(var1, var2, var3, var9, var10, 3.0F * (var3 / 22.0F), var4);
      float var11 = (float)Math.toRadians(-180.0);
      float var12 = (float)Math.toRadians(-90.0F - 90.0F * var8);
      this.drawRect(var1, var2, var3, var11, var12, 3.0F * (var3 / 22.0F), var4);
   }

   public void drawRect(float var1, float var2, float var3, float var4, float var5, float var6, Color var7) {
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgArc(this.fieldLong_F, var1, var2, var3, var4, var5, 2);
      NanoVG.nvgStrokeColor(this.fieldLong_F, this.getNVGColor_4(var7));
      NanoVG.nvgStrokeWidth(this.fieldLong_F, var6);
      NanoVG.nvgStroke(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   @Override
   public void drawAnimatedIcon(float var1, float var2, Color var3, float var4) {
      this.executeOnRenderThread(this::lambda$checkIconAnimation_Inner3);
   }

   public void calculate_12(float var1, float var2, Color var3, float var4) {
      float var5 = MathUtil1.getFloat((var4 - 0.0F) / 0.6F);
      float var6 = MathUtil1.getFloat((var4 - 0.15F) / 0.6F);
      float var7 = MathUtil1.getFloat((var4 - 0.3F) / 0.6F);
      float[] var8 = new float[]{-7.0F, -6.0F, -13.0F, 0.0F, -7.0F, 6.0F};
      float[] var9 = new float[]{-3.0F, 9.0F, 3.0F, -9.0F};
      float[] var10 = new float[]{7.0F, -6.0F, 13.0F, 0.0F, 7.0F, 6.0F};
      this.initialize_3(var1, var2);
      NanoVG.nvgBeginPath(this.fieldLong_F);
      calculate_13(this.fieldLong_F, var8, var5);
      calculate_13(this.fieldLong_F, var9, var6);
      calculate_13(this.fieldLong_F, var10, var7);
      NanoVG.nvgStrokeColor(this.fieldLong_F, this.getNVGColor_4(var3));
      NanoVG.nvgStrokeWidth(this.fieldLong_F, 2.5F);
      NanoVG.nvgStroke(this.fieldLong_F);
      this.initialize_3(-var1, -var2);
   }

   private static void calculate_13(long param0, float[] param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/NanoVGRenderer.34061446610582L J
      // 003: ldc2_w 27925281780910
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic rip/breeze/KeybindSettings.decrypt ()[Lrip/breeze/LicenseState;
      // 00c: fload 3
      // 00d: invokestatic rip/breeze/MathUtil1.getFloat (F)F
      // 010: fstore 3
      // 011: astore 6
      // 013: aload 2
      // 014: ifnull 031
      // 017: aload 2
      // 018: arraylength
      // 019: bipush 4
      // 01a: if_icmplt 031
      // 01d: goto 024
      // 020: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: fload 3
      // 025: fconst_0
      // 026: fcmpg
      // 027: ifgt 036
      // 02a: goto 031
      // 02d: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 030: athrow
      // 031: return
      // 032: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 035: athrow
      // 036: fload 3
      // 037: fconst_1
      // 038: fcmpl
      // 039: iflt 067
      // 03c: lload 0
      // 03d: aload 2
      // 03e: bipush 0
      // 03f: faload
      // 040: aload 2
      // 041: bipush 1
      // 042: faload
      // 043: invokestatic org/lwjgl/nanovg/NanoVG.nvgMoveTo (JFF)V
      // 046: bipush 2
      // 047: istore 7
      // 049: iload 7
      // 04b: aload 2
      // 04c: arraylength
      // 04d: if_icmpge 066
      // 050: lload 0
      // 051: aload 2
      // 052: iload 7
      // 054: faload
      // 055: aload 2
      // 056: iload 7
      // 058: bipush 1
      // 059: iadd
      // 05a: faload
      // 05b: invokestatic org/lwjgl/nanovg/NanoVG.nvgLineTo (JFF)V
      // 05e: iinc 7 2
      // 061: aload 6
      // 063: ifnonnull 049
      // 066: return
      // 067: fconst_0
      // 068: fstore 7
      // 06a: bipush 0
      // 06b: istore 8
      // 06d: iload 8
      // 06f: bipush 3
      // 070: iadd
      // 071: aload 2
      // 072: arraylength
      // 073: if_icmpge 09c
      // 076: fload 7
      // 078: aload 2
      // 079: iload 8
      // 07b: faload
      // 07c: aload 2
      // 07d: iload 8
      // 07f: bipush 1
      // 080: iadd
      // 081: faload
      // 082: aload 2
      // 083: iload 8
      // 085: bipush 2
      // 086: iadd
      // 087: faload
      // 088: aload 2
      // 089: iload 8
      // 08b: bipush 3
      // 08c: iadd
      // 08d: faload
      // 08e: invokestatic rip/breeze/MathUtil1.calcDistance (FFFF)F
      // 091: fadd
      // 092: fstore 7
      // 094: iinc 8 2
      // 097: aload 6
      // 099: ifnonnull 06d
      // 09c: fload 7
      // 09e: ldc_w 1.0E-6
      // 0a1: fcmpg
      // 0a2: ifgt 0aa
      // 0a5: return
      // 0a6: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: fload 7
      // 0ac: fload 3
      // 0ad: fmul
      // 0ae: fstore 8
      // 0b0: fconst_0
      // 0b1: fstore 9
      // 0b3: lload 0
      // 0b4: aload 2
      // 0b5: bipush 0
      // 0b6: faload
      // 0b7: aload 2
      // 0b8: bipush 1
      // 0b9: faload
      // 0ba: invokestatic org/lwjgl/nanovg/NanoVG.nvgMoveTo (JFF)V
      // 0bd: bipush 0
      // 0be: istore 10
      // 0c0: iload 10
      // 0c2: bipush 3
      // 0c3: iadd
      // 0c4: aload 2
      // 0c5: arraylength
      // 0c6: if_icmpge 164
      // 0c9: aload 2
      // 0ca: iload 10
      // 0cc: faload
      // 0cd: fstore 11
      // 0cf: aload 2
      // 0d0: iload 10
      // 0d2: bipush 1
      // 0d3: iadd
      // 0d4: faload
      // 0d5: fstore 12
      // 0d7: aload 2
      // 0d8: iload 10
      // 0da: bipush 2
      // 0db: iadd
      // 0dc: faload
      // 0dd: fstore 13
      // 0df: aload 2
      // 0e0: iload 10
      // 0e2: bipush 3
      // 0e3: iadd
      // 0e4: faload
      // 0e5: fstore 14
      // 0e7: fload 11
      // 0e9: fload 12
      // 0eb: fload 13
      // 0ed: fload 14
      // 0ef: invokestatic rip/breeze/MathUtil1.calcDistance (FFFF)F
      // 0f2: fstore 15
      // 0f4: fload 9
      // 0f6: fload 15
      // 0f8: fadd
      // 0f9: fload 8
      // 0fb: fcmpg
      // 0fc: ifgt 113
      // 0ff: lload 0
      // 100: fload 13
      // 102: fload 14
      // 104: invokestatic org/lwjgl/nanovg/NanoVG.nvgLineTo (JFF)V
      // 107: fload 9
      // 109: fload 15
      // 10b: fadd
      // 10c: fstore 9
      // 10e: aload 6
      // 110: ifnonnull 155
      // 113: fload 8
      // 115: fload 9
      // 117: fsub
      // 118: fstore 16
      // 11a: fload 15
      // 11c: ldc_w 1.0E-6
      // 11f: fcmpg
      // 120: ifgt 12b
      // 123: fconst_0
      // 124: goto 130
      // 127: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: fload 16
      // 12d: fload 15
      // 12f: fdiv
      // 130: fstore 17
      // 132: fload 11
      // 134: fload 13
      // 136: fload 17
      // 138: invokestatic rip/breeze/MathUtil1.calculateFloat (FFF)F
      // 13b: fstore 18
      // 13d: fload 12
      // 13f: fload 14
      // 141: fload 17
      // 143: invokestatic rip/breeze/MathUtil1.calculateFloat (FFF)F
      // 146: fstore 19
      // 148: lload 0
      // 149: fload 18
      // 14b: fload 19
      // 14d: invokestatic org/lwjgl/nanovg/NanoVG.nvgLineTo (JFF)V
      // 150: aload 6
      // 152: ifnonnull 164
      // 155: iinc 10 2
      // 158: aload 6
      // 15a: ifnonnull 0c0
      // 15d: goto 164
      // 160: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 163: athrow
      // 164: return
      // try (9 -> 15): 16 java/lang/RuntimeException
      // try (11 -> 22): 23 java/lang/RuntimeException
      // try (18 -> 26): 26 java/lang/RuntimeException
      // try (95 -> 100): 100 java/lang/RuntimeException
      // try (172 -> 178): 178 java/lang/RuntimeException
      // try (194 -> 203): 204 java/lang/RuntimeException
   }

   @Override
   public void drawGradientIcon(float var1, float var2, Color var3, Color var4, float var5) {
      this.executeOnRenderThread(this::lambda$configSelectedIcon_Inner4);
   }

   public void clamp_4(float var1, float var2, float var3, float var4, Color var5) {
      var3 = Math.max(1.0F, var3);
      var4 = Math.max(1.0F, Math.min(var4, var3 * 0.9F));
      double var6 = System.nanoTime() / 1000000.0;
      double var8 = 1200.0;
      double var10 = var6 % var8 / var8;
      float var12 = (float)(var10 * Math.PI * 2.0);
      float var13 = (float) (-Math.PI / 2) + var12;
      float var14 = (float)Math.toRadians(220.0 + 50.0 * (0.5 * (1.0 + Math.sin(var10 * Math.PI * 2.0))));
      float var15 = var13 + var14;
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgArc(this.fieldLong_F, var1, var2, var3 - var4 / 2.0F, 0.0F, (float) (Math.PI * 2), 2);
      NanoVG.nvgStrokeWidth(this.fieldLong_F, var4);
      NanoVG.nvgLineCap(this.fieldLong_F, 1);
      NanoVG.nvgStrokeColor(this.fieldLong_F, this.getNVGColor_4(RenderUtil1.getColor_7(var5, 60)));
      NanoVG.nvgStroke(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgArc(this.fieldLong_F, var1, var2, var3 - var4 / 2.0F, var13, var15, 2);
      NanoVG.nvgStrokeWidth(this.fieldLong_F, var4);
      NanoVG.nvgLineCap(this.fieldLong_F, 1);
      NanoVG.nvgStrokeColor(this.fieldLong_F, this.getNVGColor_4(RenderUtil1.getColor_7(var5, 200)));
      NanoVG.nvgStroke(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   public void processAll_10() {
      long var1 = 52288166490777L;
      LicenseState[] var10000 = KeybindSettings.decrypt();
      Iterator var3 = this.map_L.values().iterator();
      LicenseState[] var4 = var10000;

      while (var3.hasNext()) {
         ByteBuffer var5 = (ByteBuffer)var3.next();

         try {
            if (var5 != null) {
               ((Buffer)var5).clear();
            }
         } catch (RuntimeException var6) {
            throw getThrowable(var6);
         }

         if (var4 == null) {
            break;
         }
      }

      try {
         this.concurrentMap_M.values().forEach(this::lambda$shutdown_Inner5);
         this.map_N.values().forEach(this::lambda$shutdown_Inner6);
         if (this.fieldInt_c != -1) {
            NanoVG.nvgDeleteImage(this.fieldLong_F, this.fieldInt_c);
            this.fieldInt_c = -1;
         }
      } catch (RuntimeException var7) {
         throw getThrowable(var7);
      }

      NanoVGGL2.nvgDelete(this.fieldLong_F);
      this.concurrentMap_M.clear();
      this.map_N.clear();
      this.map_L.clear();
   }

   public long getLong_F() {
      return this.fieldLong_F;
   }

   private Util23 clamp_5(String var1, float var2) {
      if (var1 == null) {
         var1 = "";
      }

      long var3 = 94139270279374L;
      String var5 = "SVG:"
         + var1
         + "@"
         + String.format(Locale.ROOT, "%.4f", var2);
      Util23 var6 = this.map_N.get(var5);

      try {
         if (var6 != null) {
            return var6;
         }
      } catch (IOException var20) {
         throw getThrowable(var20);
      }

      try {
         ByteBuffer var7 = rip.breeze.client.RenderUtil32.getByteBuffer_2(
            "svgs/" + var1 + ".svg", 2048
         );
         byte[] var8 = new byte[var7.remaining()];
         var7.get(var8);
         String var9 = new String(var8, StandardCharsets.UTF_8);
         NSVGImage var10 = NanoSVG.nsvgParse(var9, "px", 96.0F);

         try {
            if (var10 == null) {
               throw new IOException("Failed to parse SVG" + var1);
            }
         } catch (IOException var18) {
            throw getThrowable(var18);
         }

         int var11 = Math.max(1, Math.round(var10.width() * var2));
         int var12 = Math.max(1, Math.round(var10.height() * var2));
         long var13 = NanoSVG.nsvgCreateRasterizer();
         ByteBuffer var15 = BufferUtils.createByteBuffer(var11 * var12 * 4);
         NanoSVG.nsvgRasterize(var13, var10, 0.0F, 0.0F, var2, var15, var11, var12, var11 * 4);
         NanoSVG.nsvgDeleteRasterizer(var13);
         NanoSVG.nsvgDelete(var10);
         int var16 = NanoVG.nvgCreateImageRGBA(this.fieldLong_F, var11, var12, 0, var15);
         Util23 var17 = new Util23(var16, var11, var12);
         this.map_N.put(var5, var17);
         return var17;
      } catch (IOException var19) {
         throw new RuntimeException("Could not load SVG" + var1, var19);
      }
   }

   private int getValue_2() {
      long var1 = 73879188596222L;
      if (this.fieldInt_c == -1) {
         ByteBuffer var3 = BufferUtils.createByteBuffer(16);
         applyColorToBuffer(var3, CONST_A);
         applyColorToBuffer(var3, CONST_B);
         applyColorToBuffer(var3, CONST_B);
         applyColorToBuffer(var3, CONST_A);
         ((Buffer)var3).flip();
         this.fieldInt_c = NanoVG.nvgCreateImageRGBA(this.fieldLong_F, 2, 2, 38, var3);
      }

      return this.fieldInt_c;
   }

   private static void applyColorToBuffer(ByteBuffer var0, Color var1) {
      var0.put((byte)var1.getRed()).put((byte)var1.getGreen()).put((byte)var1.getBlue()).put((byte)var1.getAlpha());
   }

   private NVGColor getNVGColor(NVGColor var1, Color var2) {
      return var1.method_005(var2.getRed() / 255.0F)
         .method_006(var2.getGreen() / 255.0F)
         .method_007(var2.getBlue() / 255.0F)
         .method_008(var2.getAlpha() / 255.0F);
   }

   private NVGColor getNVGColor_2(NVGColor var1, float var2, float var3, float var4, float var5) {
      return var1.method_005(var2).method_006(var3).method_007(var4).method_008(var5);
   }

   private NVGColor getNVGColor_3(NVGColor param1, float param2, float param3, float param4, byte param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/NanoVGRenderer.34061446610582L J
      // 03: ldc2_w 73512225059601
      // 06: lxor
      // 07: lstore 6
      // 09: invokestatic rip/breeze/KeybindSettings.decrypt ()[Lrip/breeze/LicenseState;
      // 0c: astore 8
      // 0e: fload 3
      // 0f: fconst_0
      // 10: fcmpl
      // 11: ifne 23
      // 14: fload 4
      // 16: dup
      // 17: fstore 9
      // 19: dup
      // 1a: fstore 10
      // 1c: fstore 11
      // 1e: aload 8
      // 20: ifnonnull 7a
      // 23: fload 4
      // 25: ldc_w 0.5
      // 28: fcmpg
      // 29: ifge 40
      // 2c: goto 33
      // 2f: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: fload 4
      // 35: fconst_1
      // 36: fload 3
      // 37: fadd
      // 38: fmul
      // 39: goto 49
      // 3c: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: fload 4
      // 42: fload 3
      // 43: fadd
      // 44: fload 4
      // 46: fload 3
      // 47: fmul
      // 48: fsub
      // 49: fstore 12
      // 4b: fconst_2
      // 4c: fload 4
      // 4e: fmul
      // 4f: fload 12
      // 51: fsub
      // 52: fstore 13
      // 54: fload 13
      // 56: fload 12
      // 58: fload 2
      // 59: ldc_w 0.33333334
      // 5c: fadd
      // 5d: invokestatic rip/breeze/RenderUtil1.calculateFloat (FFF)F
      // 60: fstore 11
      // 62: fload 13
      // 64: fload 12
      // 66: fload 2
      // 67: invokestatic rip/breeze/RenderUtil1.calculateFloat (FFF)F
      // 6a: fstore 10
      // 6c: fload 13
      // 6e: fload 12
      // 70: fload 2
      // 71: ldc_w 0.33333334
      // 74: fsub
      // 75: invokestatic rip/breeze/RenderUtil1.calculateFloat (FFF)F
      // 78: fstore 9
      // 7a: iload 5
      // 7c: sipush 255
      // 7f: iand
      // 80: i2f
      // 81: ldc_w 255.0
      // 84: fdiv
      // 85: fstore 12
      // 87: aload 0
      // 88: aload 1
      // 89: fload 11
      // 8b: fload 10
      // 8d: fload 9
      // 8f: fload 12
      // 91: invokespecial rip/breeze/NanoVGRenderer.getNVGColor_2 (Lorg/lwjgl/nanovg/NVGColor;FFFF)Lorg/lwjgl/nanovg/NVGColor;
      // 94: areturn
      // try (16 -> 22): 23 java/lang/RuntimeException
      // try (18 -> 31): 31 java/lang/RuntimeException
   }

   private NVGColor getNVGColor_4(Color var1) {
      return this.nVGColor_G
         .method_005(var1.getRed() / 255.0F)
         .method_006(var1.getGreen() / 255.0F)
         .method_007(var1.getBlue() / 255.0F)
         .method_008(var1.getAlpha() / 255.0F);
   }

   private NVGColor getNVGColor_5(float var1, float var2, float var3, float var4) {
      return this.nVGColor_G.method_005(var1).method_006(var2).method_007(var3).method_008(var4);
   }

   private NVGColor getNVGColor_6(float var1, float var2, float var3) {
      return this.getNVGColor_5(var1, var2, var3, 1.0F);
   }

   private NVGColor getNVGColor_7(float param1, float param2, float param3, byte param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/NanoVGRenderer.34061446610582L J
      // 03: ldc2_w 128072860747544
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic rip/breeze/KeybindSettings.decrypt ()[Lrip/breeze/LicenseState;
      // 0c: astore 7
      // 0e: fload 2
      // 0f: fconst_0
      // 10: fcmpl
      // 11: ifne 22
      // 14: fload 3
      // 15: dup
      // 16: fstore 8
      // 18: dup
      // 19: fstore 9
      // 1b: fstore 10
      // 1d: aload 7
      // 1f: ifnonnull 74
      // 22: fload 3
      // 23: ldc_w 0.5
      // 26: fcmpg
      // 27: ifge 3d
      // 2a: goto 31
      // 2d: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: fload 3
      // 32: fconst_1
      // 33: fload 2
      // 34: fadd
      // 35: fmul
      // 36: goto 44
      // 39: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: fload 3
      // 3e: fload 2
      // 3f: fadd
      // 40: fload 3
      // 41: fload 2
      // 42: fmul
      // 43: fsub
      // 44: fstore 11
      // 46: fconst_2
      // 47: fload 3
      // 48: fmul
      // 49: fload 11
      // 4b: fsub
      // 4c: fstore 12
      // 4e: fload 12
      // 50: fload 11
      // 52: fload 1
      // 53: ldc_w 0.33333334
      // 56: fadd
      // 57: invokestatic rip/breeze/RenderUtil1.calculateFloat (FFF)F
      // 5a: fstore 10
      // 5c: fload 12
      // 5e: fload 11
      // 60: fload 1
      // 61: invokestatic rip/breeze/RenderUtil1.calculateFloat (FFF)F
      // 64: fstore 9
      // 66: fload 12
      // 68: fload 11
      // 6a: fload 1
      // 6b: ldc_w 0.33333334
      // 6e: fsub
      // 6f: invokestatic rip/breeze/RenderUtil1.calculateFloat (FFF)F
      // 72: fstore 8
      // 74: iload 4
      // 76: sipush 255
      // 79: iand
      // 7a: i2f
      // 7b: ldc_w 255.0
      // 7e: fdiv
      // 7f: fstore 11
      // 81: aload 0
      // 82: fload 10
      // 84: fload 9
      // 86: fload 8
      // 88: fload 11
      // 8a: invokespecial rip/breeze/NanoVGRenderer.getNVGColor_5 (FFFF)Lorg/lwjgl/nanovg/NVGColor;
      // 8d: areturn
      // try (16 -> 22): 23 java/lang/RuntimeException
      // try (18 -> 31): 31 java/lang/RuntimeException
   }

   private NVGPaint getNVGPaint_J() {
      return this.nVGPaint_J;
   }

   private Util22 getBreezeUtil24(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      return this.concurrentMap_O.computeIfAbsent(var1, NanoVGRenderer::lambda$requestRemote_Inner8);
   }

   private static Util22 lambda$requestRemote_Inner8(String var0) {
      if (var0 == null) {
         var0 = "";
      }

      Util22 var1 = new Util22(EnumType26.PENDING);
      BreezeContext.breezeUtil26_l.initialize_2(NanoVGRenderer::lambda$null_Inner7);
      return var1;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void lambda$null_Inner7(String var0, Util22 var1) {
      if (var0 == null) {
         var0 = "";
      }

      long var2 = 61470435512116L;
      HttpURLConnection var4 = null;
      LicenseState[] var10000 = KeybindSettings.decrypt();
      ByteArrayOutputStream var5 = null;
      LicenseState[] var6 = var10000;
      InputStream var7 = null;
      boolean var33 = false /* VF: Semaphore variable */;

      label252: {
         label253: {
            try {
               var33 = true;
               URL var8 = new URL(var0);
               var4 = (HttpURLConnection)var8.openConnection();
               var4.setRequestProperty("User-Agent", "Mozilla/5.0");
               var4.setConnectTimeout(8000);
               var4.setReadTimeout(12000);
               var4.connect();
               int var9 = var4.getResponseCode();
               if (var9 != 200) {
                  var1.enum_PENDING_a = EnumType26.FAILED;
                  var1.string_c = "HTTP" + var9;
                  var33 = false;
                  break label252;
               }

               var7 = var4.getInputStream();
               var5 = new ByteArrayOutputStream(Math.max(32768, var4.getContentLength()));
               byte[] var10 = new byte[16384];

               int var11;
               while ((var11 = var7.read(var10)) != -1) {
                  var5.write(var10, 0, var11);
                  if (var6 == null) {
                     break;
                  }
               }

               var1.arr_b = var5.toByteArray();
               var1.enum_PENDING_a = EnumType26.READY;
               var33 = false;
               break label253;
            } catch (IOException var51) {
               var1.enum_PENDING_a = EnumType26.FAILED;
               var1.string_c = var51.getClass().getSimpleName() + ":" + var51.getMessage();
               var33 = false;
            } finally {
               if (var33) {
                  try {
                     try {
                        if (var7 != null) {
                           var7.close();
                        }
                     } catch (RuntimeException var36) {
                        throw getThrowable(var36);
                     }
                  } catch (IOException var37) {
                  }

                  try {
                     if (var4 != null) {
                        var4.disconnect();
                     }
                  } catch (IOException var47) {
                     throw getThrowable(var47);
                  }

                  try {
                     try {
                        if (var5 != null) {
                           var5.close();
                        }
                     } catch (RuntimeException var34) {
                        throw getThrowable(var34);
                     }
                  } catch (IOException var35) {
                  }
               }
            }

            try {
               if (var7 != null) {
                  var7.close();
               }
            } catch (IOException var43) {
            }

            try {
               if (var4 != null) {
                  var4.disconnect();
               }
            } catch (IOException var50) {
               throw getThrowable(var50);
            }

            try {
               try {
                  if (var5 != null) {
                     var5.close();
                  }

                  return;
               } catch (RuntimeException var41) {
                  throw getThrowable(var41);
               }
            } catch (IOException var42) {
               return;
            }
         }

         try {
            if (var7 != null) {
               var7.close();
            }
         } catch (IOException var46) {
         }

         try {
            if (var4 != null) {
               var4.disconnect();
            }
         } catch (IOException var49) {
            throw getThrowable(var49);
         }

         try {
            try {
               if (var5 != null) {
                  var5.close();
               }

               return;
            } catch (RuntimeException var44) {
               throw getThrowable(var44);
            }
         } catch (IOException var45) {
            return;
         }
      }

      try {
         if (var7 != null) {
            var7.close();
         }
      } catch (IOException var40) {
      }

      try {
         if (var4 != null) {
            var4.disconnect();
         }
      } catch (IOException var48) {
         throw getThrowable(var48);
      }

      try {
         try {
            if (var5 != null) {
               var5.close();
            }
         } catch (RuntimeException var38) {
            throw getThrowable(var38);
         }
      } catch (IOException var39) {
      }
   }

   private void lambda$shutdown_Inner6(Util23 var1) {
      NanoVG.nvgDeleteImage(this.fieldLong_F, var1.fieldInt_a);
   }

   private void lambda$shutdown_Inner5(Integer var1) {
      NanoVG.nvgDeleteImage(this.fieldLong_F, var1);
   }

   private void lambda$configSelectedIcon_Inner4(float var1, float var2, float var3, Color var4, Color var5) {
      this.initialize_3(var1, var2);
      this.initialize_5(var3);
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgStrokeColor(this.fieldLong_F, this.getNVGColor_4(var4));
      NanoVG.nvgCircle(this.fieldLong_F, 0.0F, 0.0F, 11.0F);
      NanoVG.nvgFillColor(this.fieldLong_F, this.getNVGColor_4(var4));
      NanoVG.nvgFill(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgStrokeColor(this.fieldLong_F, this.getNVGColor_4(var5));
      NanoVG.nvgStrokeWidth(this.fieldLong_F, 3.0F);
      NanoVG.nvgMoveTo(this.fieldLong_F, 6.5F, -4.5F);
      NanoVG.nvgLineTo(this.fieldLong_F, -1.5F, 5.5F);
      NanoVG.nvgMoveTo(this.fieldLong_F, -1.0F, 5.0F);
      NanoVG.nvgLineTo(this.fieldLong_F, -6.0F, 0.5F);
      NanoVG.nvgStroke(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   private void lambda$checkIconAnimation_Inner3(float var1, float var2, float var3, Color var4) {
      this.initialize_3(var1, var2);
      this.initialize_5(var3);
      NanoVG.nvgBeginPath(this.fieldLong_F);
      NanoVG.nvgStrokeColor(this.fieldLong_F, this.getNVGColor_4(var4));
      NanoVG.nvgStrokeWidth(this.fieldLong_F, 3.5F);
      NanoVG.nvgMoveTo(this.fieldLong_F, 13.0F, -8.0F);
      NanoVG.nvgLineTo(this.fieldLong_F, -3.0F, 12.0F);
      NanoVG.nvgMoveTo(this.fieldLong_F, -2.0F, 11.0F);
      NanoVG.nvgLineTo(this.fieldLong_F, -12.0F, 2.0F);
      NanoVG.nvgStroke(this.fieldLong_F);
      NanoVG.nvgClosePath(this.fieldLong_F);
   }

   private void lambda$ignoreTransformation_Inner2(Runnable var1) {
      NanoVG.nvgResetTransform(this.fieldLong_F);
      var1.run();
   }

   private void lambda$textWidth_Inner1(EnumType32 var1, float var2, String var3, AtomicReference var4) {
      NanoVG.nvgFontFace(this.fieldLong_F, var1.name());
      NanoVG.nvgFontSize(this.fieldLong_F, var2);
      NanoVG.nvgTextBounds(this.fieldLong_F, 0.0F, 0.0F, var3, this.arr_K);
      var4.set(this.arr_K[2]);
   }

   private void lambda$formattedText_Inner0(RenderUtil2_x param1, float param2, float[] param3, EnumType32 param4, String param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/NanoVGRenderer.34061446610582L J
      // 03: ldc2_w 83510081864292
      // 06: lxor
      // 07: lstore 6
      // 09: aload 5
      // 0b: ifnull 1d
      // 0e: aload 5
      // 10: invokevirtual java/lang/String.isEmpty ()Z
      // 13: ifeq 22
      // 16: goto 1d
      // 19: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: return
      // 1e: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 1
      // 23: getfield rip/breeze/RenderUtil2_x.fieldBool_b Z
      // 26: ifeq 39
      // 29: fconst_1
      // 2a: fload 2
      // 2b: ldc_w 0.25
      // 2e: fmul
      // 2f: invokestatic java/lang/Math.max (FF)F
      // 32: goto 3a
      // 35: invokestatic rip/breeze/NanoVGRenderer.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: fconst_0
      // 3a: fstore 8
      // 3c: aload 0
      // 3d: aload 5
      // 3f: aload 3
      // 40: bipush 0
      // 41: faload
      // 42: aload 3
      // 43: bipush 1
      // 44: faload
      // 45: aload 1
      // 46: getfield rip/breeze/RenderUtil2_x.color_a Ljava/awt/Color;
      // 49: aload 4
      // 4b: fload 2
      // 4c: fload 8
      // 4e: invokevirtual rip/breeze/NanoVGRenderer.processAll_9 (Ljava/lang/String;FFLjava/awt/Color;Lrip/breeze/EnumType32;FF)V
      // 51: aload 0
      // 52: getfield rip/breeze/NanoVGRenderer.fieldLong_F J
      // 55: aload 3
      // 56: bipush 0
      // 57: faload
      // 58: aload 3
      // 59: bipush 1
      // 5a: faload
      // 5b: aload 5
      // 5d: aconst_null
      // 5e: checkcast java/nio/FloatBuffer
      // 61: invokestatic org/lwjgl/nanovg/NanoVG.nvgTextBounds (JFFLjava/lang/CharSequence;Ljava/nio/FloatBuffer;)F
      // 64: fstore 9
      // 66: aload 3
      // 67: bipush 0
      // 68: dup2
      // 69: faload
      // 6a: fload 9
      // 6c: fadd
      // 6d: fastore
      // 6e: return
      // try (4 -> 9): 10 java/lang/RuntimeException
      // try (6 -> 13): 13 java/lang/RuntimeException
      // try (15 -> 24): 24 java/lang/RuntimeException
   }

   static {
      long var0 = 1109366582933L;
      toggle(false);
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
      String var6 = "ë\u0013>o\u0089\u008aÆ\u001f\u008c|øP\u001eÓ¬ê\u0010³#\tE¶É¤jð+>o¹Km= \u0090º\u0002:þx\u009b\u008ar \u0000SøÏ\u001bñ8ØàOd8{ÿË]H\u0013¾½¶r\u0010±êX\u0013îW-\u0084\u009c\f\u0095¡ê\u009c¶\u001c(\u000eCCx\u008côË\u0007NÅ\u0019`¯É\u008d´Í¬´µajóÕw'26èn>ñ\tjÃÚ1\u009bSß\u0010\u009dØ\u0081ì\rÞØí>_ñðÅ^\u008c\u0085\u0010sµÆ\u000fúC×é.¡Ä¯\u0080\u0019Mß\u0010[\u007f°X] Ñc*6×%f:[H(êF/½U\u009bõ¬\u0003\u0098\u0096|\u0013\u0010¿\u0087Àw¿Ìý´Ì±\u0088*Ë+\u009eí9»8©;Ö»î8Ä\u0018\u0002\u0003\u008c\u0001÷ÁÀÈådìG7í,\u000b\u0012vj\u0007ÿ¢nz(\fó/P\u0098ÙnoP(\u0016_Å\u0091qcì\u0099\u008apÒ¬â2\u0015}x)åÑHäSf+\r<ð¥½\u0010Í»?¤Ù³\u009e\u0093\u007fPÒÜ¡Ç¦)(%\u0003\u0089btØÆ\u000e÷Y\u000e\u0004eb}w\u0015\u0003\u0007ÊÈ¼Ôl`+Ø\u0086ø\u008cê+ÏÎq_\u0011¡äS(#©\u0007ªô&íÕÔhV\u0003M\u0013Òbºää\u0005õ32\u0016ÝdúY8¥\u0094pA\u0001M8RÒ h\u0010#H^\u0086¥#È\u0002Æ9²ü\u001a\u0018o´\u0010\nø\u008c\u0097$\u008bÕ\u0015¿ö~É~Â\u0090v\u0010,ù¶\u001cod]UçPm¢\u0087ÈS\b\u0010þ£[ÝË\u008a0ó\u0005 \u0089;Ùõ_!";
      int var7 = "ë\u0013>o\u0089\u008aÆ\u001f\u008c|øP\u001eÓ¬ê\u0010³#\tE¶É¤jð+>o¹Km= \u0090º\u0002:þx\u009b\u008ar \u0000SøÏ\u001bñ8ØàOd8{ÿË]H\u0013¾½¶r\u0010±êX\u0013îW-\u0084\u009c\f\u0095¡ê\u009c¶\u001c(\u000eCCx\u008côË\u0007NÅ\u0019`¯É\u008d´Í¬´µajóÕw'26èn>ñ\tjÃÚ1\u009bSß\u0010\u009dØ\u0081ì\rÞØí>_ñðÅ^\u008c\u0085\u0010sµÆ\u000fúC×é.¡Ä¯\u0080\u0019Mß\u0010[\u007f°X] Ñc*6×%f:[H(êF/½U\u009bõ¬\u0003\u0098\u0096|\u0013\u0010¿\u0087Àw¿Ìý´Ì±\u0088*Ë+\u009eí9»8©;Ö»î8Ä\u0018\u0002\u0003\u008c\u0001÷ÁÀÈådìG7í,\u000b\u0012vj\u0007ÿ¢nz(\fó/P\u0098ÙnoP(\u0016_Å\u0091qcì\u0099\u008apÒ¬â2\u0015}x)åÑHäSf+\r<ð¥½\u0010Í»?¤Ù³\u009e\u0093\u007fPÒÜ¡Ç¦)(%\u0003\u0089btØÆ\u000e÷Y\u000e\u0004eb}w\u0015\u0003\u0007ÊÈ¼Ôl`+Ø\u0086ø\u008cê+ÏÎq_\u0011¡äS(#©\u0007ªô&íÕÔhV\u0003M\u0013Òbºää\u0005õ32\u0016ÝdúY8¥\u0094pA\u0001M8RÒ h\u0010#H^\u0086¥#È\u0002Æ9²ü\u001a\u0018o´\u0010\nø\u008c\u0097$\u008bÕ\u0015¿ö~É~Â\u0090v\u0010,ù¶\u001cod]UçPm¢\u0087ÈS\b\u0010þ£[ÝË\u008a0ó\u0005 \u0089;Ùõ_!"
         .length();
      char var8 = 16;
      int var23 = -1;

      label54:
      while (true) {
         String var25 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var36;
                  if ((var23 += var8) >= var7) {
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
                     long[] var13 = new long[6];
                     int var14 = 0;
                     String var15 = "[\u0089$hä²û\u0081pÌ~ü\u00821\u0019è§\u0093\u0087\u0084ÌA-v\u0083RÝ\u001fÒJT\u0011";
                     int var16 = "[\u0089$hä²û\u0081pÌ~ü\u00821\u0019è§\u0093\u0087\u0084ÌA-v\u0083RÝ\u001fÒJT\u0011".length();
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
                                    CONST_V = var13;
                                    CONST_W = new Integer[6];
                                    CONST_A = new Color(198, 198, 198);
                                    CONST_B = new Color(148, 148, 148);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "ï5\u0007u\t¾8\u0089Äá\u0099\u000e\u0092pe\u009c";
                                 var16 = "ï5\u0007u\t¾8\u0089Äá\u0099\u000e\u0092pe\u009c".length();
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

                  var6 = "\u0099¡í¢ÿ[3¥\u001czÇ\u001b\u0018ÕÐìmD·øsØ\u008c/\u0018õN<Iþ\u0094;\u009e§¤\u008c\u00ad-7\u0002±\u009fc^\u0010qì\u009b8";
                  var7 = "\u0099¡í¢ÿ[3¥\u001czÇ\u001b\u0018ÕÐìmD·øsØ\u008c/\u0018õN<Iþ\u0094;\u009e§¤\u008c\u00ad-7\u0002±\u009fc^\u0010qì\u009b8".length();
                  var8 = 24;
                  var23 = -1;
            }

            var25 = var6.substring(++var23, var23 + var8);
            var10001 = 0;
         }
      }
   }

   public static void toggle(boolean var0) {
      fieldBool_Q = var0;
   }

   public static boolean isValid_5() {
      return fieldBool_Q;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid_5();

      try {
         return !var0;
      } catch (RuntimeException var1) {
         throw getThrowable(var1);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28985;
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
            throw new RuntimeException("rip/breeze/ai", var10);
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
         throw new RuntimeException("rip/breeze/ai" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19268;
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
            throw new RuntimeException("rip/breeze/ai", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_W[var3] = var15;
      }

      return CONST_W[var3];
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
         throw new RuntimeException("rip/breeze/ai" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
