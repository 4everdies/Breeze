package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "Parkour", b = "Automatically jumps at the edge of a block.", d = rip.breeze.ModuleCategory.MOVEMENT)
public class Parkour extends BreezeModule {

   @EventListener
   public void updateRotation(PreTickEventEvent var1) {
      long var2 = 85023723091625L;
      if (!BreezeClient.isValid() && !BreezeContext.moduleBase_a.getModuleByClass(ScaffoldUtils.class).f()) {
         if (BreezeClient.CONST_A.thePlayer.onGround
            && !BreezeClient.CONST_A.thePlayer.isSneaking()
            && !MinecraftAccessor.isValid_3(BreezeClient.CONST_A.thePlayer)
            && MinecraftAccessor.getValue_7(BreezeClient.CONST_A.thePlayer) == 0
            && !BreezeClient.CONST_A.gameSettings.keyBindJump.isKeyDown()
            && !BreezeClient.CONST_A.thePlayer.movementInput.jump
            && !BreezeClient.CONST_A.thePlayer.isInLava()
            && !BreezeClient.CONST_A.thePlayer.isInWater()
            && BreezeClient.CONST_A.theWorld.getCollisionBoxes(BreezeClient.CONST_A.thePlayer.getEntityBoundingBox().addCoord(0.0, -1.0E-4, 0.0)).isEmpty()) {
            BreezeClient.CONST_A.thePlayer.jump();
            MinecraftAccessor.initialize_73(BreezeClient.CONST_A.thePlayer, 10);
         }
      }
   }
}
