package rip.breeze.client;

import java.util.function.Predicate;
import net.minecraft.entity.player.EntityPlayer;

// $VF: synthetic class
final class ed$$Lambda_Inner227 implements Predicate {
   private ed$$Lambda_Inner227() {
   }

   @Override
   public boolean test(Object var1) {
      return AntiBot.isInvisible_2((EntityPlayer)var1);
   }
}
