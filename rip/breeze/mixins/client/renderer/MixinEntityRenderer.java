package rip.breeze.mixins.client.renderer;

import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CShadow;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTarget$Shift;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.Mapping;
import rip.breeze.classtransform.annotations.injection.CInject;
import rip.breeze.classtransform.annotations.injection.COverride;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(EntityRenderer.class)
public abstract class MixinEntityRenderer {
   @CShadow
   private Minecraft field_78531_r;
   @CShadow
   private Entity field_78528_u;
   @CShadow
   private float field_78490_B;
   @CShadow
   private float field_78491_C;

   @CShadow
   public abstract void func_78479_a(float var1, int var2);

   @CShadow
   public abstract void func_78478_c();

   @COverride("func_78473_a(F)V")
   public void func_78473_a(float var1) {
      Entity var2 = this.mc.getRenderViewEntity();
      if (var2 != null && this.mc.theWorld != null) {
         this.mc.mcProfiler.startSection("pick");
         Object var3 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bl);
         float var4 = MethodHandleStore.getFloat_6(var3);
         this.mc.pointedEntity = null;
         double var5 = Math.max(MethodHandleStore.getFloat_4(var3), MethodHandleStore.getFloat_6(var3));
         this.mc.objectMouseOver = var2.rayTrace(var5, var1);
         double var7 = var5;
         Vec3 var9 = var2.getPositionEyes(var1);
         boolean var10 = false;
         if (this.mc.playerController.extendedReach()) {
            var5 = 6.0;
            var7 = 6.0;
         } else {
            if (var7 > 3.0) {
               var10 = true;
            }

            var5 = var7;
         }

         if (this.mc.objectMouseOver != null) {
            var7 = this.mc.objectMouseOver.hitVec.distanceTo(var9);
         }

         Vec3 var11 = var2.getLook(var1);
         if (MethodHandleStore.isValid_27(MethodHandleStore.getObject())) {
            var11 = (Vec3)MethodHandleStore.getObject_10(MethodHandleStore.getObject());
         }

         Vec3 var12 = var9.addVector(var11.xCoord * var5, var11.yCoord * var5, var11.zCoord * var5);
         this.pointedEntity = null;
         Vec3 var13 = null;
         float var14 = 1.0F;
         ArrayList var15 = this.mc
            .theWorld
            .getEntitiesInAABBexcluding(
               var2,
               var2.getEntityBoundingBox().addCoord(var11.xCoord * var5, var11.yCoord * var5, var11.zCoord * var5).expand(var14, var14, var14),
               EntitySelectors.NOT_SPECTATING
            );
         ArrayList var16 = new ArrayList();

         for (Entity var18 : var15) {
            if (var18.canBeCollidedWith()) {
               var16.add(var18);
            }
         }

         var15 = var16;
         double var19 = var7;

         for (int var21 = 0; var21 < var15.size(); var21++) {
            Entity var22 = (Entity)var15.get(var21);
            float var23 = (float)(
               var22.getCollisionBorderSize()
                  + MethodHandleStore.getDouble_2(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bo))
            );
            AxisAlignedBB var24 = var22.getEntityBoundingBox().expand(var23, var23, var23);
            MovingObjectPosition var25 = var24.calculateIntercept(var9, var12);
            if (var24.isVecInside(var9)) {
               if (var19 >= 0.0) {
                  this.pointedEntity = var22;
                  var13 = var25 == null ? var9 : var25.hitVec;
                  var19 = 0.0;
               }
            } else if (var25 != null) {
               double var26 = var9.distanceTo(var25.hitVec);
               if (var26 < var19 || var19 == 0.0 || MethodHandleStore.isValid_10(var3) && this.pointedEntity == null) {
                  if (var22 == var2.ridingEntity) {
                     if (var19 == 0.0) {
                        this.pointedEntity = var22;
                        var13 = var25.hitVec;
                     }
                  } else {
                     this.pointedEntity = var22;
                     var13 = var25.hitVec;
                     var19 = var26;
                  }
               }
            }
         }

         if (this.pointedEntity != null && var10 && var9.distanceTo(var13) > var4) {
            this.pointedEntity = null;
            this.mc.objectMouseOver = new MovingObjectPosition(MovingObjectType.MISS, var13, (EnumFacing)null, new BlockPos(var13));
         }

         if (this.pointedEntity != null && (var19 < var7 || MethodHandleStore.isValid_10(var3) || this.mc.objectMouseOver == null)) {
            this.mc.objectMouseOver = new MovingObjectPosition(this.pointedEntity, var13);
            if (this.pointedEntity instanceof EntityLivingBase || this.pointedEntity instanceof EntityItemFrame) {
               this.mc.pointedEntity = this.pointedEntity;
            }
         }

         this.mc.mcProfiler.endSection();
      }
   }

   @CRedirect(
      method = "func_181560_a(FJ)V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityPlayerSP;func_70082_c(FF)V", optional = true),
      mapping = {Mapping.FORGE, Mapping.FORGE_MOD, Mapping.VANILLA, Mapping.LOCAL}
   )
   public void setAngles(EntityPlayerSP var1, float var2, float var3) {
      Object var4 = (Object)MethodHandleStore.methodHandle_B.invoke((float)var2, (float)var3);
      if (!MethodHandleStore.isValid_23(var4)) {
         Minecraft.getMinecraft().getRenderViewEntity().setAngles(MethodHandleStore.getFloat_10(var4), MethodHandleStore.getFloat_17(var4));
      }
   }

   @CInject(method = "func_78476_b(FI)V", target = @CTarget("HEAD"), cancellable = true)
   public void renderHand(float var1, int var2, InjectionCallback var3) {
      if (MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_W.invoke())) {
         var3.cancel();
      }
   }

   @CRedirect(method = "func_78472_g(F)V", target = @CTarget(value = "FIELD", target = "Lnet/minecraft/client/settings/GameSettings;field_74333_Y:F"))
   public float getSaturation(GameSettings var1) {
      return MethodHandleStore.getFloat_9(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bk), var1.gammaSetting);
   }

   @CRedirect(
      method = {"func_78467_g(F)V", "orientCamera(FZ)V"},
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/client/settings/GameSettings;field_74320_O:I", optional = true)
   )
   public int getThirdPersonView(GameSettings var1) {
      return MethodHandleStore.getValue_2(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }

   @CRedirect(
      method = {"func_78467_g(F)V", "orientCamera(FZ)V"},
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/Entity;field_70125_A:F", optional = true)
   )
   public float getPitch(Entity var1) {
      return MethodHandleStore.getFloat_8(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }

   @CRedirect(
      method = {"func_78467_g(F)V", "orientCamera(FZ)V"},
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/Entity;field_70177_z:F", optional = true)
   )
   public float getYaw(Entity var1) {
      return MethodHandleStore.getFloat_18(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }

   @CRedirect(
      method = {"func_78467_g(F)V", "orientCamera(FZ)V"},
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/Entity;field_70127_C:F", optional = true)
   )
   public float getPrevPitch(Entity var1) {
      return MethodHandleStore.getFloat_15(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }

   @CRedirect(
      method = {"func_78467_g(F)V", "orientCamera(FZ)V"},
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/Entity;field_70126_B:F", optional = true)
   )
   public float getPrevYaw(Entity var1) {
      return MethodHandleStore.getFloat_16(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }

   @CRedirect(
      method = {"func_78467_g(F)V", "orientCamera(FZ)V"},
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;func_179109_b(FFF)V", ordinal = 2, optional = true),
      mapping = {Mapping.FORGE, Mapping.FORGE_MOD, Mapping.VANILLA, Mapping.LOCAL}
   )
   public void translate(float var1, float var2, float var3) {
      if (MethodHandleStore.isValid_12(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx))) {
         if (MethodHandleStore.isValid_30(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx))) {
            var3 = -(this.thirdPersonDistanceTemp + (this.thirdPersonDistance - this.thirdPersonDistanceTemp) * MethodHandleStore.getFloat_5());
         }

         GlStateManager.translate(
            var1, var2, var3 * MethodHandleStore.getDouble_3(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx))
         );
      } else {
         GlStateManager.translate(var1, var2, var3);
      }
   }

   @CInject(method = "func_78471_a(FJ)V", target = @CTarget("RETURN"))
   public void renderWorld(float var1, long var2, InjectionCallback var4) {
      this.setupCameraTransform(var1, 0);
      MethodHandleStore.initialize_16();
      MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_aQ.invoke((float)var1));
   }

   @CInject(method = "func_181560_a(FJ)V", target = @CTarget(value = "GETFIELD", target = "Lnet/minecraft/client/settings/GameSettings;field_74319_N:Z"))
   public void render2D() {
      if (this.mc.theWorld != null) {
         MethodHandleStore.initialize_4();
         MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_Y.invoke((float)MethodHandleStore.getFloat_5()));
         MethodHandleStore.initialize_4();
      }
   }

   @CInject(
      method = "func_181560_a(FJ)V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiIngame;func_175180_a(F)V", shift = CTarget$Shift.AFTER, optional = true),
      mapping = Mapping.FORGE
   )
   public void drawHUDForge() {
      MethodHandleStore.initialize_15(MethodHandleStore.getObject_8());
      this.setupOverlayRendering();
   }

   @CInject(
      method = "Lnet/minecraft/client/gui/GuiIngame;handler$******$drawHud(FJLorg/spongepowered/asm.mixin/injection/callback/CallbackInfo;)V",
      target = @CTarget(value = "TAIL", optional = true),
      mapping = Mapping.FORGE
   )
   public void drawHUDPatcher() {
      MethodHandleStore.initialize_15(MethodHandleStore.getObject_8());
      this.setupOverlayRendering();
   }

   @CInject(
      method = "func_175068_a(IFJ)V",
      target = @CTarget(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/RenderGlobal;func_180446_a(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/renderer/culling/ICamera;F)V",
         shift = CTarget$Shift.AFTER
      )
   )
   public void renderWorldPass(int var1, float var2, long var3, InjectionCallback var5) {
      MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_bf.invoke());
   }

   @CRedirect(
      method = "func_175068_a(IFJ)V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityPlayerSP;func_175149_v()Z"),
      mapping = {Mapping.FORGE, Mapping.FORGE_MOD, Mapping.VANILLA, Mapping.LOCAL}
   )
   public boolean isSpectator(EntityPlayerSP var1) {
      return var1.isSpectator() || MethodHandleStore.isValid_4(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bj));
   }

   @CInject(method = "func_78482_e(F)V", target = @CTarget("HEAD"), cancellable = true)
   public void hurtCameraEffect(float var1, InjectionCallback var2) {
      Object var3 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bs);
      if (MethodHandleStore.isValid_13(var3) && MethodHandleStore.isValid_9(var3)) {
         var2.cancel();
      }
   }

   @CInject(method = "func_78474_d(F)V", target = @CTarget("HEAD"), cancellable = true)
   public void renderRainSnow(float var1, InjectionCallback var2) {
      Object var3 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bs);
      if (MethodHandleStore.isValid_13(var3) && MethodHandleStore.isValid_31(var3)) {
         var2.cancel();
      }
   }

   @CInject(method = "func_175070_n()Z", target = @CTarget("HEAD"), cancellable = true)
   public void isDrawBlockOutline(InjectionCallback var1) {
      Object var2 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bs);
      if (MethodHandleStore.isValid_13(var2) && MethodHandleStore.isValid_28(var2)) {
         var1.setReturnValue(false);
      }
   }
}
