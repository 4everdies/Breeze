package rip.breeze.client;

import java.awt.Color;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import rip.breeze.KeepParameters;

public class RenderUtil31 {
   private static final ICamera CONST_A = new Frustum();
   private static final FloatBuffer CONST_B = BufferUtils.createFloatBuffer(16);
   private static final FloatBuffer CONST_C = BufferUtils.createFloatBuffer(16);
   private static final IntBuffer CONST_D = BufferUtils.createIntBuffer(16);
   private static final float[] CONST_E = new float[16];
   private static final float[] CONST_F = new float[16];
   private static final float[] CONST_G = new float[16];
   private static final int[] CONST_H = new int[4];
   private static boolean fieldBool_i = false;

   @KeepParameters
   public static void render() {
      GlStateManager.matrixMode(5889);
      GlStateManager.loadIdentity();
      GlStateManager.ortho(0.0, BreezeClient.CONST_A.displayWidth, BreezeClient.CONST_A.displayHeight, 0.0, 1000.0, 3000.0);
      GlStateManager.matrixMode(5888);
      GlStateManager.loadIdentity();
      GlStateManager.translate(0.0F, 0.0F, -2000.0F);
   }

   @KeepParameters
   public static void toggle() {
      CONST_A.setPosition(
         BreezeClient.CONST_A.getRenderViewEntity().posX, BreezeClient.CONST_A.getRenderViewEntity().posY, BreezeClient.CONST_A.getRenderViewEntity().posZ
      );
      ((Buffer)CONST_B).clear();
      ((Buffer)CONST_C).clear();
      ((Buffer)CONST_D).clear();
      GL11.glGetFloat(2982, CONST_B);
      GL11.glGetFloat(2983, CONST_C);
      GL11.glGetInteger(2978, CONST_D);
      CONST_B.get(CONST_E);
      CONST_C.get(CONST_F);
      CONST_H[0] = CONST_D.get(0);
      CONST_H[1] = CONST_D.get(1);
      CONST_H[2] = CONST_D.get(2);
      CONST_H[3] = CONST_D.get(3);

      for (int var0 = 0; var0 < 4; var0++) {
         for (int var1 = 0; var1 < 4; var1++) {
            CONST_G[var1 + var0 * 4] = CONST_F[var1 + 0] * CONST_E[0 + var0 * 4]
               + CONST_F[var1 + 4] * CONST_E[1 + var0 * 4]
               + CONST_F[var1 + 8] * CONST_E[2 + var0 * 4]
               + CONST_F[var1 + 12] * CONST_E[3 + var0 * 4];
         }
      }

      fieldBool_i = true;
   }

   public static void calculate(Color var0) {
      GL11.glColor4f(var0.getRed() / 255.0F, var0.getGreen() / 255.0F, var0.getBlue() / 255.0F, var0.getAlpha() / 255.0F);
   }

   public static boolean getHitbox(Entity var0) {
      return CONST_A.isBoundingBoxInFrustum(var0.getEntityBoundingBox());
   }

   public static boolean getHitbox_2(AxisAlignedBB var0) {
      return CONST_A.isBoundingBoxInFrustum(var0);
   }

   public static boolean getHitbox_3(BlockPos var0) {
      return CONST_A.isBoundingBoxInFrustum(new AxisAlignedBB(var0.getX(), var0.getY(), var0.getZ(), var0.getX() + 1, var0.getY() + 1, var0.getZ() + 1));
   }

   public static void getHitbox_4(AxisAlignedBB var0, Color var1, float var2, boolean var3) {
      double var4 = var0.minX - BreezeClient.CONST_A.getRenderManager().viewerPosX;
      double var6 = var0.minY - BreezeClient.CONST_A.getRenderManager().viewerPosY;
      double var8 = var0.minZ - BreezeClient.CONST_A.getRenderManager().viewerPosZ;
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.enableBlend();
      GL11.glEnable(2848);
      GL11.glLineWidth(var2);
      GlStateManager.disableTexture2D();
      if (!var3) {
         GlStateManager.disableDepth();
         GlStateManager.depthMask(false);
      }

      GlStateManager.color(var1.getRed() / 255.0F, var1.getGreen() / 255.0F, var1.getBlue() / 255.0F, var1.getAlpha() / 255.0F);
      AxisAlignedBB var10 = new AxisAlignedBB(var4, var6, var8, var4 - var0.minX + var0.maxX, var6 - var0.minY + var0.maxY, var8 - var0.minZ + var0.maxZ);
      RenderGlobal.drawSelectionBoundingBox(var10);
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.enableTexture2D();
      if (!var3) {
         GlStateManager.enableDepth();
         GlStateManager.depthMask(true);
      }

      GlStateManager.disableBlend();
   }

   public static void calculate_2(AxisAlignedBB var0, Color var1, boolean var2) {
      int var3 = var1.getRed();
      int var4 = var1.getGreen();
      int var5 = var1.getBlue();
      int var6 = var1.getAlpha();
      double var7 = var0.minX - BreezeClient.CONST_A.getRenderManager().viewerPosX;
      double var9 = var0.minY - BreezeClient.CONST_A.getRenderManager().viewerPosY;
      double var11 = var0.minZ - BreezeClient.CONST_A.getRenderManager().viewerPosZ;
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.enableBlend();
      GL11.glLineWidth(2.0F);
      GlStateManager.disableTexture2D();
      if (!var2) {
         GlStateManager.disableDepth();
         GlStateManager.depthMask(false);
      }

      GlStateManager.color(0.00390625F * var3, 0.00390625F * var4, 0.00390625F * var5, 0.00390625F * var6);
      GL11.glBegin(7);
      AxisAlignedBB var13 = new AxisAlignedBB(var7, var9, var11, var7 - var0.minX + var0.maxX, var9 - var0.minY + var0.maxY, var11 - var0.minZ + var0.maxZ);
      GL11.glVertex3d(var13.minX, var13.minY, var13.minZ);
      GL11.glVertex3d(var13.maxX, var13.minY, var13.minZ);
      GL11.glVertex3d(var13.maxX, var13.minY, var13.maxZ);
      GL11.glVertex3d(var13.minX, var13.minY, var13.maxZ);
      GL11.glVertex3d(var13.minX, var13.maxY, var13.minZ);
      GL11.glVertex3d(var13.minX, var13.maxY, var13.maxZ);
      GL11.glVertex3d(var13.maxX, var13.maxY, var13.maxZ);
      GL11.glVertex3d(var13.maxX, var13.maxY, var13.minZ);
      GL11.glVertex3d(var13.minX, var13.minY, var13.minZ);
      GL11.glVertex3d(var13.minX, var13.maxY, var13.minZ);
      GL11.glVertex3d(var13.maxX, var13.maxY, var13.minZ);
      GL11.glVertex3d(var13.maxX, var13.minY, var13.minZ);
      GL11.glVertex3d(var13.maxX, var13.minY, var13.minZ);
      GL11.glVertex3d(var13.maxX, var13.maxY, var13.minZ);
      GL11.glVertex3d(var13.maxX, var13.maxY, var13.maxZ);
      GL11.glVertex3d(var13.maxX, var13.minY, var13.maxZ);
      GL11.glVertex3d(var13.minX, var13.minY, var13.maxZ);
      GL11.glVertex3d(var13.maxX, var13.minY, var13.maxZ);
      GL11.glVertex3d(var13.maxX, var13.maxY, var13.maxZ);
      GL11.glVertex3d(var13.minX, var13.maxY, var13.maxZ);
      GL11.glVertex3d(var13.minX, var13.minY, var13.minZ);
      GL11.glVertex3d(var13.minX, var13.minY, var13.maxZ);
      GL11.glVertex3d(var13.minX, var13.maxY, var13.maxZ);
      GL11.glVertex3d(var13.minX, var13.maxY, var13.minZ);
      GL11.glEnd();
      GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.enableTexture2D();
      if (!var2) {
         GlStateManager.enableDepth();
         GlStateManager.depthMask(true);
      }

      GlStateManager.disableBlend();
   }

   public static void render_1(float var0, float var1, float var2, float var3, Color var4) {
      calculate(var4);
      GL11.glBegin(7);
      GL11.glVertex2f(var0, var1);
      GL11.glVertex2f(var0, var3);
      GL11.glVertex2f(var2, var3);
      GL11.glVertex2f(var2, var1);
      GL11.glEnd();
   }

   public static void calculate_3(float var0, float var1, float var2, float var3, Color var4, float var5) {
      calculate(var4);
      GL11.glBegin(7);
      GL11.glVertex2f(var0 - var5, var1);
      GL11.glVertex2f(var0 - var5, var3);
      GL11.glVertex2f(var0, var3);
      GL11.glVertex2f(var0, var1);
      GL11.glVertex2f(var2, var1);
      GL11.glVertex2f(var2, var3);
      GL11.glVertex2f(var2 + var5, var3);
      GL11.glVertex2f(var2 + var5, var1);
      GL11.glVertex2f(var0 - var5, var1 - var5);
      GL11.glVertex2f(var0 - var5, var1);
      GL11.glVertex2f(var2 + var5, var1);
      GL11.glVertex2f(var2 + var5, var1 - var5);
      GL11.glVertex2f(var0 - var5, var3);
      GL11.glVertex2f(var0 - var5, var3 + var5);
      GL11.glVertex2f(var2 + var5, var3 + var5);
      GL11.glVertex2f(var2 + var5, var3);
      GL11.glEnd();
   }

   public static void calculate_4(List<Vec3> var0, Color var1, float var2) {
      double var3 = MinecraftAccessor.getDouble_2(BreezeClient.CONST_A.getRenderManager());
      double var5 = MinecraftAccessor.getDouble_4(BreezeClient.CONST_A.getRenderManager());
      double var7 = MinecraftAccessor.getDouble_5(BreezeClient.CONST_A.getRenderManager());
      GL11.glPushMatrix();
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glLineWidth(var2);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
      GL11.glBegin(1);
      GL11.glColor4f(0.00390625F * var1.getRed(), 0.00390625F * var1.getGreen(), 0.00390625F * var1.getBlue(), 0.00390625F * var1.getAlpha());
      Vec3 var9 = null;

      for (Vec3 var11 : var0) {
         if (var9 == null) {
            var9 = var11;
         } else {
            double var12 = var11.xCoord - var3;
            double var14 = var11.yCoord - var5;
            double var16 = var11.zCoord - var7;
            GL11.glVertex3d(var12, var14, var16);
            double var18 = var9.xCoord - var3;
            double var20 = var9.yCoord - var5;
            double var22 = var9.zCoord - var7;
            GL11.glVertex3d(var18, var20, var22);
            var9 = var11;
         }
      }

      GL11.glEnd();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2848);
      GL11.glHint(3154, 4352);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static double[] vecToArray(Vec3 var0) {
      return createVector(var0.xCoord, var0.yCoord, var0.zCoord);
   }

   public static double[] createVector(double var0, double var2, double var4) {
      if (!fieldBool_i) {
         return null;
      } else {
         var0 -= BreezeClient.CONST_A.getRenderManager().viewerPosX;
         var2 -= BreezeClient.CONST_A.getRenderManager().viewerPosY;
         var4 -= BreezeClient.CONST_A.getRenderManager().viewerPosZ;
         float var6 = (float)(CONST_G[0] * var0 + CONST_G[4] * var2 + CONST_G[8] * var4 + CONST_G[12]);
         float var7 = (float)(CONST_G[1] * var0 + CONST_G[5] * var2 + CONST_G[9] * var4 + CONST_G[13]);
         float var8 = (float)(CONST_G[2] * var0 + CONST_G[6] * var2 + CONST_G[10] * var4 + CONST_G[14]);
         float var9 = (float)(CONST_G[3] * var0 + CONST_G[7] * var2 + CONST_G[11] * var4 + CONST_G[15]);
         if (var9 <= 0.0F) {
            return null;
         } else {
            float var10 = var6 / var9;
            float var11 = var7 / var9;
            float var12 = var8 / var9;
            if (!(var12 < -1.0F) && !(var12 > 1.0F)) {
               float var13 = (var10 * 0.5F + 0.5F) * CONST_H[2];
               float var14 = (var11 * 0.5F + 0.5F) * CONST_H[3];
               var14 = CONST_H[3] - var14;
               return new double[]{var13, var14, var12};
            } else {
               return null;
            }
         }
      }
   }
}
