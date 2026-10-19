package rip.breeze.mixins.item;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;

@CTransformer(ItemStack.class)
public class MixinItemStack {
   @CInject(method = "func_77962_s()Z", target = @CTarget("HEAD"), cancellable = true)
   private void hasEffect(InjectionCallback var1) {
      if (Minecraft.getMinecraft().thePlayer != null
         && MethodHandleStore.isValid_2(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bp))) {
         var1.setReturnValue(false);
      }
   }

   @CInject(method = "func_77948_v()Z", target = @CTarget("HEAD"), cancellable = true)
   private void isItemEnchanted(InjectionCallback var1) {
      if (Minecraft.getMinecraft().thePlayer != null
         && MethodHandleStore.isValid_2(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bp))) {
         var1.setReturnValue(false);
      }
   }
}
