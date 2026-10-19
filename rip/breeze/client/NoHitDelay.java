package rip.breeze.client;

import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.ModuleInfo;

@ModuleInfo(a = "NoHitDelay", b = "Removes the cooldown you get after missing a swing.", d = {rip.breeze.ModuleCategory.COMBAT, rip.breeze.ModuleCategory.MISC})
public class NoHitDelay extends BreezeModule {
   @EventListener(a = rip.breeze.Priority.HIGHEST)
   public void initialize(MouseClickedEventEvent var1) {
      MinecraftAccessor.initialize_43(BreezeClient.CONST_A, 0);
   }
}
