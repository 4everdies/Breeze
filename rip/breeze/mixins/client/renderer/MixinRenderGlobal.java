package rip.breeze.mixins.client.renderer;

import java.util.EnumSet;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(RenderGlobal.class)
public class MixinRenderGlobal {
   @CInject(method = "func_174977_a(Lnet/minecraft/util/EnumWorldBlockLayer;DILnet/minecraft/entity/Entity;)I", target = @CTarget("HEAD"))
   public void preRenderBlockLayer(EnumWorldBlockLayer var1, double var2, int var4, Entity var5, InjectionCallback var6) {
      if (var1 == EnumWorldBlockLayer.TRANSLUCENT) {
         Object var7 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bu);
         if (var7 != null) {
            MethodHandleStore.initialize_11(var7);
         }
      }
   }

   @CInject(method = "func_174977_a(Lnet/minecraft/util/EnumWorldBlockLayer;DILnet/minecraft/entity/Entity;)I", target = @CTarget("RETURN"))
   public void postRenderBlockLayer(EnumWorldBlockLayer var1, double var2, int var4, Entity var5, InjectionCallback var6) {
      MethodHandleStore.initialize_5();
   }

   @CInject(method = "func_174978_c(Lnet/minecraft/util/BlockPos;)Ljava/util/Set;", target = @CTarget("HEAD"), cancellable = true)
   public void getVisibleFacings(BlockPos var1, InjectionCallback var2) {
      Object var3 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bu);
      if (var3 != null && MethodHandleStore.isValid_3(var3)) {
         var2.setReturnValue(EnumSet.allOf(EnumFacing.class));
      }
   }

   @CRedirect(
      method = "func_180446_a(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/renderer/culling/ICamera;F)V",
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/client/settings/GameSettings;field_74320_O:I")
   )
   public int getThirdPersonView(GameSettings var1) {
      return MethodHandleStore.getValue_2(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }

   @CRedirect(
      method = "func_174970_a(Lnet/minecraft/entity/Entity;DLnet/minecraft/client/renderer/culling/ICamera;IZ)V",
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/Entity;field_70177_z:F")
   )
   public float getYaw(Entity var1) {
      return MethodHandleStore.getFloat_18(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }

   @CRedirect(
      method = "func_174970_a(Lnet/minecraft/entity/Entity;DLnet/minecraft/client/renderer/culling/ICamera;IZ)V",
      target = @CTarget(value = "FIELD", target = "Lnet/minecraft/entity/Entity;field_70125_A:F")
   )
   public float getPitch(Entity var1) {
      return MethodHandleStore.getFloat_8(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bx));
   }
}
