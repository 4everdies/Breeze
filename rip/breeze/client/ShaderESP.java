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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import rip.breeze.BreezeModule;
import rip.breeze.ConditionsSetting;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.KeepParameters;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "ShaderESP", b = "Renders a glow around enemies, like the CS2 ESP.", d = rip.breeze.ModuleCategory.VISUAL)
public class ShaderESP extends BreezeModule {
   private final GenericSetting<RenderMode3> shaderTypeSetting;
   private final ConditionsSetting playersSetting;
   private final GenericSetting<RenderUtil21> modeSetting;
   private final GenericSetting<Boolean> teamColorsSetting;
   private final GenericSetting<rip.breeze.BreezeColor> colorSetting;
   private final ConditionsSetting mobsSetting;
   private final GenericSetting<RenderUtil21> modeSetting_2;
   private final GenericSetting<rip.breeze.BreezeColor> colorSetting_2;
   private final ConditionsSetting animalsSetting;
   private final GenericSetting<RenderUtil21> modeSetting_3;
   private final GenericSetting<rip.breeze.BreezeColor> colorSetting_3;
   private final GuiRenderer guiRenderer_y;
   private final RenderUtil27 dataBuilder37_z;
   private Framebuffer framebuffer_A;
   private final FloatBuffer floatBuffer_B;
   private final FloatBuffer floatBuffer_C;
   private final List<Entity> list_D;
   private boolean fieldBool_E;
   private boolean fieldBool_F;
   private boolean fieldBool_G;
   private static final String[] CONST_I;
   private static final String[] CONST_J;
   private static final Map CONST_K = new HashMap(13);
   private static final long[] CONST_L;
   private static final Integer[] CONST_M;
   private static final Map CONST_N;

   public ShaderESP() {
      long var1 = 107294716992417L;
      super();
      short var10002 = 11559;
      long var10003 = 8726570305149029139L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "ShaderType");
      var10002 = 24433;
      var10003 = 4175331218659162436L ^ var1;
      this.shaderTypeSetting = var10001.getDataBuilder50_3("The type of shader to use.").getDataBuilder50_4(RenderMode3.NEON).getDataBuilder54();
      short var10004 = 25679;
      long var10005 = 7856399990594077309L ^ var1;
      this.playersSetting = new ConditionsSetting(this, "Players");
      var10002 = 11919;
      var10003 = 6226274480733898937L ^ var1;
      this.modeSetting = GenericSetting.<RenderUtil21>getDataBuilder50(this.playersSetting, "Mode").getDataBuilder50_4(RenderUtil21.TEXTURE).getDataBuilder54();
      var10002 = 9807;
      var10003 = 3895713755789377660L ^ var1;
      this.teamColorsSetting = GenericSetting.<Boolean>getDataBuilder50(this.playersSetting, "TeamColors").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 12977;
      var10003 = 7000731321050616966L ^ var1;
      this.colorSetting = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this.playersSetting, "Color")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(10, 88, 204))
         .getDataBuilder54();
      var10004 = 1128;
      var10005 = 4299067091363586645L ^ var1;
      this.mobsSetting = new ConditionsSetting(this, "Mobs");
      var10002 = 1843;
      var10003 = 3557869182857961743L ^ var1;
      this.modeSetting_2 = GenericSetting.<RenderUtil21>getDataBuilder50(this.mobsSetting, "Mode").getDataBuilder50_4(RenderUtil21._OFF).getDataBuilder54();
      var10002 = 12173;
      var10003 = 2404168607036393916L ^ var1;
      this.colorSetting_2 = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this.mobsSetting, "Color")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(204, 143, 10))
         .getDataBuilder54();
      var10004 = 15444;
      var10005 = 1384329786177739364L ^ var1;
      this.animalsSetting = new ConditionsSetting(this, "Animals");
      var10002 = 1843;
      var10003 = 3557869182857961743L ^ var1;
      this.modeSetting_3 = GenericSetting.<RenderUtil21>getDataBuilder50(this.animalsSetting, "Mode").getDataBuilder50_4(RenderUtil21._OFF).getDataBuilder54();
      var10002 = 12173;
      var10003 = 2404168607036393916L ^ var1;
      this.colorSetting_3 = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this.animalsSetting, "Color")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(96, 179, 2))
         .getDataBuilder54();
      this.guiRenderer_y = new GuiRenderer();
      this.dataBuilder37_z = new RenderUtil27();
      this.floatBuffer_B = BufferUtils.createFloatBuffer(4);
      this.floatBuffer_C = BufferUtils.createFloatBuffer(16);
      this.list_D = new ArrayList<>();
      this.fieldBool_E = false;
      this.fieldBool_F = false;
      this.fieldBool_G = false;
   }

   @KeepParameters
   public boolean isBool_E() {
      return this.fieldBool_E;
   }

   @KeepParameters
   public boolean checkCondition() {
      return this.fieldBool_F && this.fieldBool_E;
   }

   @EventListener
   public void processAll(Render3DEventEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: putfield rip/breeze/client/ShaderESP.fieldBool_G Z
      // 005: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 008: getfield net/minecraft/client/Minecraft.theWorld Lnet/minecraft/client/multiplayer/WorldClient;
      // 00b: ifnull 01e
      // 00e: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 011: getfield net/minecraft/client/Minecraft.thePlayer Lnet/minecraft/client/entity/EntityPlayerSP;
      // 014: ifnonnull 023
      // 017: goto 01e
      // 01a: invokestatic rip/breeze/client/ShaderESP.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: return
      // 01f: invokestatic rip/breeze/client/ShaderESP.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: aload 0
      // 024: invokespecial rip/breeze/client/ShaderESP.isInvisible ()V
      // 027: aload 0
      // 028: getfield rip/breeze/client/ShaderESP.list_D Ljava/util/List;
      // 02b: invokeinterface java/util/List.isEmpty ()Z 1
      // 030: ifeq 038
      // 033: return
      // 034: invokestatic rip/breeze/client/ShaderESP.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: invokestatic rip/breeze/client/FontManager.values ()[I
      // 03b: astore 2
      // 03c: aload 0
      // 03d: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 040: invokevirtual java/nio/FloatBuffer.clear ()Ljava/nio/Buffer;
      // 043: pop
      // 044: sipush 3106
      // 047: aload 0
      // 048: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 04b: invokestatic org/lwjgl/opengl/GL11.glGetFloat (ILjava/nio/FloatBuffer;)V
      // 04e: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 051: invokevirtual net/minecraft/client/Minecraft.getRenderManager ()Lnet/minecraft/client/renderer/entity/RenderManager;
      // 054: astore 3
      // 055: aload 3
      // 056: invokevirtual net/minecraft/client/renderer/entity/RenderManager.isRenderShadow ()Z
      // 059: istore 4
      // 05b: aload 0
      // 05c: bipush 1
      // 05d: putfield rip/breeze/client/ShaderESP.fieldBool_E Z
      // 060: aload 0
      // 061: invokespecial rip/breeze/client/ShaderESP.processAll_2 ()V
      // 064: aload 0
      // 065: getfield rip/breeze/client/ShaderESP.framebuffer_A Lnet/minecraft/client/shader/Framebuffer;
      // 068: bipush 1
      // 069: invokevirtual net/minecraft/client/shader/Framebuffer.bindFramebuffer (Z)V
      // 06c: fconst_0
      // 06d: fconst_0
      // 06e: fconst_0
      // 06f: fconst_0
      // 070: invokestatic net/minecraft/client/renderer/GlStateManager.clearColor (FFFF)V
      // 073: sipush 16640
      // 076: invokestatic org/lwjgl/opengl/GL11.glClear (I)V
      // 079: invokestatic net/minecraft/client/renderer/GlStateManager.enableDepth ()V
      // 07c: bipush 1
      // 07d: invokestatic net/minecraft/client/renderer/GlStateManager.depthMask (Z)V
      // 080: invokestatic net/minecraft/client/renderer/GlStateManager.enableTexture2D ()V
      // 083: invokestatic net/minecraft/client/renderer/GlStateManager.enableAlpha ()V
      // 086: sipush 516
      // 089: ldc_w 0.1
      // 08c: invokestatic net/minecraft/client/renderer/GlStateManager.alphaFunc (IF)V
      // 08f: invokestatic net/minecraft/client/renderer/GlStateManager.enableBlend ()V
      // 092: sipush 770
      // 095: sipush 771
      // 098: bipush 1
      // 099: bipush 0
      // 09a: invokestatic net/minecraft/client/renderer/GlStateManager.tryBlendFuncSeparate (IIII)V
      // 09d: invokestatic net/minecraft/client/renderer/GlStateManager.disableFog ()V
      // 0a0: invokestatic net/minecraft/client/renderer/GlStateManager.disableCull ()V
      // 0a3: aload 3
      // 0a4: bipush 0
      // 0a5: invokevirtual net/minecraft/client/renderer/entity/RenderManager.setRenderShadow (Z)V
      // 0a8: aload 0
      // 0a9: invokespecial rip/breeze/client/ShaderESP.initialize ()V
      // 0ac: aload 0
      // 0ad: getfield rip/breeze/client/ShaderESP.list_D Ljava/util/List;
      // 0b0: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b5: astore 5
      // 0b7: aload 5
      // 0b9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0be: ifeq 165
      // 0c1: aload 5
      // 0c3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c8: checkcast net/minecraft/entity/Entity
      // 0cb: astore 6
      // 0cd: aload 6
      // 0cf: checkcast net/minecraft/entity/EntityLivingBase
      // 0d2: astore 7
      // 0d4: aload 0
      // 0d5: aload 6
      // 0d7: invokespecial rip/breeze/client/ShaderESP.getColor (Lnet/minecraft/entity/Entity;)Ljava/awt/Color;
      // 0da: astore 8
      // 0dc: aload 7
      // 0de: getfield net/minecraft/entity/EntityLivingBase.hurtTime I
      // 0e1: istore 9
      // 0e3: aload 7
      // 0e5: bipush -1
      // 0e6: putfield net/minecraft/entity/EntityLivingBase.hurtTime I
      // 0e9: aload 0
      // 0ea: aload 6
      // 0ec: invokespecial rip/breeze/client/ShaderESP.getEnum__OFF2 (Lnet/minecraft/entity/Entity;)Lrip/breeze/client/RenderUtil21;
      // 0ef: getstatic rip/breeze/client/RenderUtil21.TEXTURE Lrip/breeze/client/RenderUtil21;
      // 0f2: if_acmpne 10a
      // 0f5: fconst_1
      // 0f6: fconst_1
      // 0f7: fconst_1
      // 0f8: fconst_1
      // 0f9: invokestatic net/minecraft/client/renderer/GlStateManager.color (FFFF)V
      // 0fc: aload 3
      // 0fd: aload 6
      // 0ff: aload 1
      // 100: getfield rip/breeze/client/Render3DEventEvent.fieldFloat_h F
      // 103: invokevirtual net/minecraft/client/renderer/entity/RenderManager.renderEntitySimple (Lnet/minecraft/entity/Entity;F)Z
      // 106: pop
      // 107: goto 120
      // 10a: aload 0
      // 10b: bipush 1
      // 10c: putfield rip/breeze/client/ShaderESP.fieldBool_F Z
      // 10f: aload 0
      // 110: aload 8
      // 112: invokespecial rip/breeze/client/ShaderESP.calculate (Ljava/awt/Color;)V
      // 115: aload 3
      // 116: aload 6
      // 118: aload 1
      // 119: getfield rip/breeze/client/Render3DEventEvent.fieldFloat_h F
      // 11c: invokevirtual net/minecraft/client/renderer/entity/RenderManager.renderEntitySimple (Lnet/minecraft/entity/Entity;F)Z
      // 11f: pop
      // 120: aload 0
      // 121: invokespecial rip/breeze/client/ShaderESP.render ()V
      // 124: aload 7
      // 126: iload 9
      // 128: putfield net/minecraft/entity/EntityLivingBase.hurtTime I
      // 12b: aload 0
      // 12c: bipush 0
      // 12d: putfield rip/breeze/client/ShaderESP.fieldBool_F Z
      // 130: goto 162
      // 133: astore 10
      // 135: aload 10
      // 137: invokevirtual java/lang/Throwable.printStackTrace ()V
      // 13a: aload 0
      // 13b: invokespecial rip/breeze/client/ShaderESP.render ()V
      // 13e: aload 7
      // 140: iload 9
      // 142: putfield net/minecraft/entity/EntityLivingBase.hurtTime I
      // 145: aload 0
      // 146: bipush 0
      // 147: putfield rip/breeze/client/ShaderESP.fieldBool_F Z
      // 14a: goto 162
      // 14d: astore 11
      // 14f: aload 0
      // 150: invokespecial rip/breeze/client/ShaderESP.render ()V
      // 153: aload 7
      // 155: iload 9
      // 157: putfield net/minecraft/entity/EntityLivingBase.hurtTime I
      // 15a: aload 0
      // 15b: bipush 0
      // 15c: putfield rip/breeze/client/ShaderESP.fieldBool_F Z
      // 15f: aload 11
      // 161: athrow
      // 162: goto 0b7
      // 165: aload 0
      // 166: bipush 1
      // 167: putfield rip/breeze/client/ShaderESP.fieldBool_G Z
      // 16a: aload 0
      // 16b: bipush 0
      // 16c: putfield rip/breeze/client/ShaderESP.fieldBool_E Z
      // 16f: aload 0
      // 170: bipush 0
      // 171: putfield rip/breeze/client/ShaderESP.fieldBool_F Z
      // 174: aload 3
      // 175: iload 4
      // 177: invokevirtual net/minecraft/client/renderer/entity/RenderManager.setRenderShadow (Z)V
      // 17a: aload 0
      // 17b: getfield rip/breeze/client/ShaderESP.list_D Ljava/util/List;
      // 17e: invokeinterface java/util/List.clear ()V 1
      // 183: aload 2
      // 184: invokestatic rip/breeze/client/FontManager.render ([I)V
      // 187: aload 0
      // 188: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 18b: bipush 0
      // 18c: invokevirtual java/nio/FloatBuffer.get (I)F
      // 18f: aload 0
      // 190: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 193: bipush 1
      // 194: invokevirtual java/nio/FloatBuffer.get (I)F
      // 197: aload 0
      // 198: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 19b: bipush 2
      // 19c: invokevirtual java/nio/FloatBuffer.get (I)F
      // 19f: aload 0
      // 1a0: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 1a3: bipush 3
      // 1a4: invokevirtual java/nio/FloatBuffer.get (I)F
      // 1a7: invokestatic net/minecraft/client/renderer/GlStateManager.clearColor (FFFF)V
      // 1aa: aload 0
      // 1ab: invokespecial rip/breeze/client/ShaderESP.render_1 ()V
      // 1ae: goto 248
      // 1b1: astore 5
      // 1b3: aload 5
      // 1b5: invokevirtual java/lang/Throwable.printStackTrace ()V
      // 1b8: aload 0
      // 1b9: bipush 0
      // 1ba: putfield rip/breeze/client/ShaderESP.fieldBool_E Z
      // 1bd: aload 0
      // 1be: bipush 0
      // 1bf: putfield rip/breeze/client/ShaderESP.fieldBool_F Z
      // 1c2: aload 3
      // 1c3: iload 4
      // 1c5: invokevirtual net/minecraft/client/renderer/entity/RenderManager.setRenderShadow (Z)V
      // 1c8: aload 0
      // 1c9: getfield rip/breeze/client/ShaderESP.list_D Ljava/util/List;
      // 1cc: invokeinterface java/util/List.clear ()V 1
      // 1d1: aload 2
      // 1d2: invokestatic rip/breeze/client/FontManager.render ([I)V
      // 1d5: aload 0
      // 1d6: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 1d9: bipush 0
      // 1da: invokevirtual java/nio/FloatBuffer.get (I)F
      // 1dd: aload 0
      // 1de: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 1e1: bipush 1
      // 1e2: invokevirtual java/nio/FloatBuffer.get (I)F
      // 1e5: aload 0
      // 1e6: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 1e9: bipush 2
      // 1ea: invokevirtual java/nio/FloatBuffer.get (I)F
      // 1ed: aload 0
      // 1ee: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 1f1: bipush 3
      // 1f2: invokevirtual java/nio/FloatBuffer.get (I)F
      // 1f5: invokestatic net/minecraft/client/renderer/GlStateManager.clearColor (FFFF)V
      // 1f8: aload 0
      // 1f9: invokespecial rip/breeze/client/ShaderESP.render_1 ()V
      // 1fc: goto 248
      // 1ff: astore 12
      // 201: aload 0
      // 202: bipush 0
      // 203: putfield rip/breeze/client/ShaderESP.fieldBool_E Z
      // 206: aload 0
      // 207: bipush 0
      // 208: putfield rip/breeze/client/ShaderESP.fieldBool_F Z
      // 20b: aload 3
      // 20c: iload 4
      // 20e: invokevirtual net/minecraft/client/renderer/entity/RenderManager.setRenderShadow (Z)V
      // 211: aload 0
      // 212: getfield rip/breeze/client/ShaderESP.list_D Ljava/util/List;
      // 215: invokeinterface java/util/List.clear ()V 1
      // 21a: aload 2
      // 21b: invokestatic rip/breeze/client/FontManager.render ([I)V
      // 21e: aload 0
      // 21f: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 222: bipush 0
      // 223: invokevirtual java/nio/FloatBuffer.get (I)F
      // 226: aload 0
      // 227: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 22a: bipush 1
      // 22b: invokevirtual java/nio/FloatBuffer.get (I)F
      // 22e: aload 0
      // 22f: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 232: bipush 2
      // 233: invokevirtual java/nio/FloatBuffer.get (I)F
      // 236: aload 0
      // 237: getfield rip/breeze/client/ShaderESP.floatBuffer_C Ljava/nio/FloatBuffer;
      // 23a: bipush 3
      // 23b: invokevirtual java/nio/FloatBuffer.get (I)F
      // 23e: invokestatic net/minecraft/client/renderer/GlStateManager.clearColor (FFFF)V
      // 241: aload 0
      // 242: invokespecial rip/breeze/client/ShaderESP.render_1 ()V
      // 245: aload 12
      // 247: athrow
      // 248: return
      // try (15 -> 22): 22 java/lang/Throwable
      // try (6 -> 13): 13 java/lang/Throwable
      // try (0 -> 9): 10 java/lang/Throwable
      // try (101 -> 130): 139 java/lang/Throwable
      // try (101 -> 130): 151 null
      // try (139 -> 142): 151 null
      // try (151 -> 152): 151 null
      // try (43 -> 166): 200 java/lang/Throwable
      // try (43 -> 166): 237 null
      // try (200 -> 203): 237 null
      // try (237 -> 238): 237 null
   }

   @EventListener
   public void toggle(Render2DEventEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/client/ShaderESP.fieldBool_G Z
      // 04: ifeq 15
      // 07: aload 0
      // 08: getfield rip/breeze/client/ShaderESP.framebuffer_A Lnet/minecraft/client/shader/Framebuffer;
      // 0b: ifnonnull 1a
      // 0e: goto 15
      // 11: invokestatic rip/breeze/client/ShaderESP.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: return
      // 16: invokestatic rip/breeze/client/ShaderESP.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: getstatic net/minecraft/client/renderer/OpenGlHelper.defaultTexUnit I
      // 1d: invokestatic net/minecraft/client/renderer/GlStateManager.setActiveTexture (I)V
      // 20: invokestatic net/minecraft/client/renderer/GlStateManager.enableBlend ()V
      // 23: sipush 770
      // 26: sipush 771
      // 29: bipush 1
      // 2a: bipush 0
      // 2b: invokestatic net/minecraft/client/renderer/GlStateManager.tryBlendFuncSeparate (IIII)V
      // 2e: aload 0
      // 2f: getfield rip/breeze/client/ShaderESP.shaderTypeSetting Lrip/breeze/GenericSetting;
      // 32: getstatic rip/breeze/client/RenderMode3.NEON Lrip/breeze/client/RenderMode3;
      // 35: invokevirtual rip/breeze/GenericSetting.isValid (Ljava/lang/Object;)Z
      // 38: ifne 4f
      // 3b: aload 0
      // 3c: getfield rip/breeze/client/ShaderESP.shaderTypeSetting Lrip/breeze/GenericSetting;
      // 3f: getstatic rip/breeze/client/RenderMode3.OUTLINE Lrip/breeze/client/RenderMode3;
      // 42: invokevirtual rip/breeze/GenericSetting.isValid (Ljava/lang/Object;)Z
      // 45: ifeq 66
      // 48: goto 4f
      // 4b: invokestatic rip/breeze/client/ShaderESP.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield rip/breeze/client/ShaderESP.dataBuilder37_z Lrip/breeze/client/RenderUtil27;
      // 53: bipush 2
      // 54: sipush 255
      // 57: aload 0
      // 58: getfield rip/breeze/client/ShaderESP.framebuffer_A Lnet/minecraft/client/shader/Framebuffer;
      // 5b: aconst_null
      // 5c: invokevirtual rip/breeze/client/RenderUtil27.clamp (IILnet/minecraft/client/shader/Framebuffer;Ljava/awt/Color;)V
      // 5f: goto 66
      // 62: invokestatic rip/breeze/client/ShaderESP.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: aload 0
      // 67: getfield rip/breeze/client/ShaderESP.shaderTypeSetting Lrip/breeze/GenericSetting;
      // 6a: getstatic rip/breeze/client/RenderMode3.NEON Lrip/breeze/client/RenderMode3;
      // 6d: invokevirtual rip/breeze/GenericSetting.isValid (Ljava/lang/Object;)Z
      // 70: ifne 87
      // 73: aload 0
      // 74: getfield rip/breeze/client/ShaderESP.shaderTypeSetting Lrip/breeze/GenericSetting;
      // 77: getstatic rip/breeze/client/RenderMode3.GLOW Lrip/breeze/client/RenderMode3;
      // 7a: invokevirtual rip/breeze/GenericSetting.isValid (Ljava/lang/Object;)Z
      // 7d: ifeq 9f
      // 80: goto 87
      // 83: invokestatic rip/breeze/client/ShaderESP.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: aload 0
      // 88: getfield rip/breeze/client/ShaderESP.guiRenderer_y Lrip/breeze/client/GuiRenderer;
      // 8b: bipush 18
      // 8d: sipush 255
      // 90: aload 0
      // 91: getfield rip/breeze/client/ShaderESP.framebuffer_A Lnet/minecraft/client/shader/Framebuffer;
      // 94: aconst_null
      // 95: invokevirtual rip/breeze/client/GuiRenderer.calculate (IILnet/minecraft/client/shader/Framebuffer;Ljava/awt/Color;)V
      // 98: goto 9f
      // 9b: invokestatic rip/breeze/client/ShaderESP.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9e: athrow
      // 9f: aload 0
      // a0: bipush 0
      // a1: putfield rip/breeze/client/ShaderESP.fieldBool_G Z
      // a4: aload 0
      // a5: invokespecial rip/breeze/client/ShaderESP.render_1 ()V
      // a8: goto c8
      // ab: astore 2
      // ac: aload 2
      // ad: invokevirtual java/lang/Throwable.printStackTrace ()V
      // b0: aload 0
      // b1: bipush 0
      // b2: putfield rip/breeze/client/ShaderESP.fieldBool_G Z
      // b5: aload 0
      // b6: invokespecial rip/breeze/client/ShaderESP.render_1 ()V
      // b9: goto c8
      // bc: astore 3
      // bd: aload 0
      // be: bipush 0
      // bf: putfield rip/breeze/client/ShaderESP.fieldBool_G Z
      // c2: aload 0
      // c3: invokespecial rip/breeze/client/ShaderESP.render_1 ()V
      // c6: aload 3
      // c7: athrow
      // c8: return
      // try (49 -> 65): 66 java/lang/Throwable
      // try (44 -> 54): 55 java/lang/Throwable
      // try (25 -> 41): 42 java/lang/Throwable
      // try (12 -> 30): 31 java/lang/Throwable
      // try (3 -> 10): 10 java/lang/Throwable
      // try (0 -> 6): 7 java/lang/Throwable
      // try (12 -> 68): 74 java/lang/Throwable
      // try (12 -> 68): 83 null
      // try (74 -> 77): 83 null
   }

   private void isInvisible() {
      this.list_D.clear();

      for (Entity var2 : BreezeClient.CONST_A.theWorld.loadedEntityList) {
         if (var2 instanceof EntityLivingBase && var2 != BreezeClient.CONST_A.thePlayer) {
            RenderUtil21 var3 = this.getEnum__OFF2(var2);
            if (var3 != RenderUtil21._OFF
               && this.getColor(var2) != null
               && (!var2.isInvisible() || var3 != RenderUtil21.TEXTURE && (!(var2 instanceof EntityPlayer) || AntiBot.isInvisible((EntityPlayer)var2)))
               && RenderUtil31.getHitbox(var2)
               && (!(var2 instanceof EntityPlayer) || AntiBot.isInvisible_2((EntityPlayer)var2))) {
               this.list_D.add(var2);
            }
         }
      }
   }

   private void processAll_2() {
      if (this.framebuffer_A == null) {
         this.framebuffer_A = new Framebuffer(BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight, true);
         this.framebuffer_A.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
      } else if (this.framebuffer_A.framebufferWidth != BreezeClient.CONST_A.displayWidth
         || this.framebuffer_A.framebufferHeight != BreezeClient.CONST_A.displayHeight) {
         this.framebuffer_A.createBindFramebuffer(BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight);
      }
   }

   private RenderUtil21 getEnum__OFF2(Entity var1) {
      if (var1 instanceof EntityPlayer) {
         return this.modeSetting.getObject_m();
      } else if (var1 instanceof IMob) {
         return this.modeSetting_2.getObject_m();
      } else {
         return var1 instanceof EntityAnimal ? this.modeSetting_3.getObject_m() : RenderUtil21._OFF;
      }
   }

   private Color getColor(Entity var1) {
      if (var1 instanceof EntityPlayer) {
         Color var2 = BreezeClient.getAltManager().getColor((EntityPlayer)var1, this.teamColorsSetting.getObject_m());
         return var2 != null ? var2 : this.colorSetting.getObject_m();
      } else if (var1 instanceof IMob) {
         return this.colorSetting_2.getObject_m();
      } else {
         return var1 instanceof EntityAnimal ? this.colorSetting_3.getObject_m() : null;
      }
   }

   private void initialize() {
      GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
      GlStateManager.disableTexture2D();
      GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
      GlStateManager.disableLighting();
   }

   private void calculate(Color var1) {
      long var2 = 131410714919802L;
      GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
      GlStateManager.enableTexture2D();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glTexEnvi(8960, 8704, 34160);
      GL11.glTexEnvi(8960, -898320648, 7681);
      GL11.glTexEnvi(8960, 1692969573, -2083292314);
      ((Buffer)this.floatBuffer_B).clear();
      ((Buffer)this.floatBuffer_B.put(var1.getRed() / 255.0F).put(var1.getGreen() / 255.0F).put(var1.getBlue() / 255.0F).put(var1.getAlpha() / 255.0F)).flip();
      GL11.glTexEnv(8960, 8705, this.floatBuffer_B);
      GL11.glTexEnvi(8960, 157181803, 7681);
      GL11.glTexEnvi(8960, -1816019237, 5890);
   }

   private void render() {
      long var1 = 45343038267118L;
      GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
      GL11.glTexEnvi(8960, 8704, 8448);
      GL11.glTexEnvi(8960, 788459340, 8448);
      GL11.glTexEnvi(8960, -595714875, 5890);
      GL11.glTexEnvi(8960, "Ꚑ½", 8448);
      GL11.glTexEnvi(8960, -451307897, 5890);
   }

   private void render_1() {
      GL20.glUseProgram(0);
      GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
      GlStateManager.disableTexture2D();
      GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
      GlStateManager.enableTexture2D();
      GlStateManager.bindTexture(0);
      GL11.glTexEnvi(8960, 8704, 8448);
      GlStateManager.enableCull();
      GlStateManager.enableDepth();
      GlStateManager.depthMask(true);
      GlStateManager.enableAlpha();
      GlStateManager.alphaFunc(516, 0.1F);
      GlStateManager.disableLighting();
      GlStateManager.disableFog();
      GlStateManager.enableBlend();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
   }

   static {
      long var0 = 28505534533526L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[10];
      int var5 = 0;
      String var6 = "\u0083¥~\u0087ü¶oÉ×B\u0012.5\u00ad\u0097^Ðó§\u009d)\u0080EÑ8BOôvT\u0003È2Gdp°ns[ \u000b¢\u0084 \u00918Üné{F6\u0093\u0093\u00998\u0005X'Â¬\u009bM\u008d\u000eç\u0004\u0095\u001ax1ë´\u0019c¥k1\u0088Ò\u0010\"RÔ\u0017t\u001cr\u0001?\u009e\u000e4¡ã\fÊ\u0010ÜSß\\»×\u0007\u008cwaÍ|hZ´ì\u0010÷!ã'\u0019è\u00843&\u000b\u008d£®á\"Ç\u0010õ9amër\u0092úv\u0092elü}´¿\u0010\tË0\u0003Þ\u0093Ø-\u0089©¦øèF*Å »\u0000p°ÎòÜ\nÖ¹¼ÿ1óã²²vql\b+\u0097¯?ïØZÏ¶]t";
      int var7 = "\u0083¥~\u0087ü¶oÉ×B\u0012.5\u00ad\u0097^Ðó§\u009d)\u0080EÑ8BOôvT\u0003È2Gdp°ns[ \u000b¢\u0084 \u00918Üné{F6\u0093\u0093\u00998\u0005X'Â¬\u009bM\u008d\u000eç\u0004\u0095\u001ax1ë´\u0019c¥k1\u0088Ò\u0010\"RÔ\u0017t\u001cr\u0001?\u009e\u000e4¡ã\fÊ\u0010ÜSß\\»×\u0007\u008cwaÍ|hZ´ì\u0010÷!ã'\u0019è\u00843&\u000b\u008d£®á\"Ç\u0010õ9amër\u0092úv\u0092elü}´¿\u0010\tË0\u0003Þ\u0093Ø-\u0089©¦øèF*Å »\u0000p°ÎòÜ\nÖ¹¼ÿ1óã²²vql\b+\u0097¯?ïØZÏ¶]t"
         .length();
      char var8 = 24;
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
                     CONST_I = var4;
                     CONST_J = new String[10];
                     CONST_N = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[10];
                     int var14 = 0;
                     String var15 = "db@\u0006r½\u001exÛò\u008fºÀµÝêïá\rk\u0001-\u0017\u0017Ú\u0017\u000fþì+D±¾ìô§ØNöHüÕÍx\u0081\b«,\u0016.p\u0082â¨Ô@\u00adc\u0098iüÖ¸Ó";
                     int var16 = "db@\u0006r½\u001exÛò\u008fºÀµÝêïá\rk\u0001-\u0017\u0017Ú\u0017\u000fþì+D±¾ìô§ØNöHüÕÍx\u0081\b«,\u0016.p\u0082â¨Ô@\u00adc\u0098iüÖ¸Ó"
                        .length();
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
                                    CONST_L = var13;
                                    CONST_M = new Integer[10];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "Ë{»\u0014\u0019i\u0087\ré\u001eìµ\u009aÜ\u0011p";
                                 var16 = "Ë{»\u0014\u0019i\u0087\ré\u001eìµ\u009aÜ\u0011p".length();
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

                  var6 = "#s\"\"ýX,Ê~ìq»\u0099\u000fWß\u00109n³\\(éßÆ'Jeñæl\u0011ä";
                  var7 = "#s\"\"ýX,Ê~ìq»\u0099\u000fWß\u00109n³\\(éßÆ'Jeñæl\u0011ä".length();
                  var8 = 16;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32149;
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
            throw new RuntimeException("rip/breeze/client/ec", var10);
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
         CONST_J[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_J[var3];
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
         throw new RuntimeException("rip/breeze/client/ec" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16984;
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
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/ec", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_M[var3] = var15;
      }

      return CONST_M[var3];
   }

   private static int getValue(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
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
               MethodHandles.insertArguments("getValue".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/ec" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
