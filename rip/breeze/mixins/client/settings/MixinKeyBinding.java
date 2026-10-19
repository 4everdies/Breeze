package rip.breeze.mixins.client.settings;

import net.minecraft.client.settings.KeyBinding;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.annotations.CShadow;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.COverride;

@CTransformer(KeyBinding.class)
public class MixinKeyBinding {
   @CShadow
   private boolean field_74513_e;

   @COverride("func_151470_d()Z")
   public boolean func_151470_d() {
      Object var1 = (Object)MethodHandleStore.methodHandle_M.invoke((Object)((KeyBinding)this), (boolean)this.pressed);
      MethodHandleStore.isValid_23(var1);
      return MethodHandleStore.isValid_26(var1);
   }
}
