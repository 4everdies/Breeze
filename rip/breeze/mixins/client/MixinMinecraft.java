package rip.breeze.mixins.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CShadow;
import rip.breeze.classtransform.annotations.CTarget;
import rip.breeze.classtransform.annotations.CTarget$Shift;
import rip.breeze.classtransform.annotations.CTransformer;
import rip.breeze.classtransform.annotations.injection.CInject;
import rip.breeze.classtransform.annotations.injection.CRedirect;

@CTransformer(Minecraft.class)
public class MixinMinecraft {
   @CShadow
   public PlayerControllerMP field_71442_b;

   @CInject(
      method = "func_71407_l()V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/WorldClient;func_72939_s()V", shift = CTarget$Shift.BEFORE)
   )
   public void runTickPreUpdateEntities(InjectionCallback var1) {
      MethodHandleStore.initialize_8(MethodHandleStore.getObject_2());
      MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_aF.invoke());
      MethodHandleStore.initialize_17(MethodHandleStore.getObject());
   }

   @CRedirect(
      method = {"func_71407_l()V", "runInputTick()V"},
      target = @CTarget(value = "INVOKE", target = "Lorg/lwjgl/input/Keyboard;next()Z", optional = true)
   )
   public boolean overrideInput() {
      while (Keyboard.next()) {
         if (!Keyboard.getEventKeyState()) {
            return true;
         }

         if (Keyboard.getEventCharacter() != 0) {
            MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_bb.invoke((char)Keyboard.getEventCharacter()));
         }

         if (!MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_av.invoke((int)Keyboard.getEventKey(), (boolean)Keyboard.isRepeatEvent()))) {
            return true;
         }
      }

      return false;
   }

   @CRedirect(
      method = {"func_71407_l()V", "runInputTick()V"},
      target = @CTarget(value = "INVOKE", shift = CTarget$Shift.BEFORE, target = "Lorg/lwjgl/input/Mouse;next()Z", optional = true)
   )
   public boolean mouseEvent() {
      while (Mouse.next()) {
         int var1 = Mouse.getEventButton();
         if (var1 == -1) {
            return true;
         }

         if (!Mouse.getEventButtonState()) {
            return true;
         }

         if (!MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_aZ.invoke((int)((var1 + 2) * -1)))) {
            return true;
         }
      }

      return false;
   }

   @CInject(method = "func_71353_a(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V", target = @CTarget("HEAD"))
   public void loadWorld(WorldClient var1, String var2, InjectionCallback var3) {
      MethodHandleStore.initialize_21(MethodHandleStore.getObject_2());
      MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_d.invoke());
   }

   @CInject(method = "func_90020_K()I", target = @CTarget("HEAD"), cancellable = true)
   public void getLimitFramerate(InjectionCallback var1) {
      if (Minecraft.getMinecraft().currentScreen == MethodHandleStore.getObject_14() || MethodHandleStore.isValid_5(MethodHandleStore.getObject_14())) {
         var1.setReturnValue(90);
      }
   }

   @CInject(method = "func_147116_af()V", target = @CTarget("HEAD"), cancellable = true)
   public void clickMouse(InjectionCallback var1) {
      if (MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_u.invoke((Object)MethodHandleStore.getObject_18()))) {
         var1.cancel();
      }
   }

   @CInject(method = "func_147121_ag()V", target = @CTarget("HEAD"), cancellable = true)
   public void rightClickMouse(InjectionCallback var1) {
      if (MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_u.invoke((Object)MethodHandleStore.getObject_15()))) {
         var1.cancel();
      }
   }

   @CInject(method = "func_147115_a(Z)V", target = @CTarget("HEAD"), cancellable = true)
   public void sendClickBlockToController(boolean var1, InjectionCallback var2) {
      if (var1 && MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_u.invoke((Object)MethodHandleStore.getObject_9()))) {
         var2.cancel();
      }

      if (!var1 && MethodHandleStore.isValid_17(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bt))) {
         var2.cancel();
      }
   }

   @CInject(
      method = "func_71411_J()V",
      target = @CTarget(value = "INVOKE", target = "Ljava/lang/System;nanoTime()J", ordinal = 1, shift = CTarget$Shift.BEFORE),
      cancellable = true
   )
   public void runGameLoop(InjectionCallback var1) {
      MethodHandleStore.initialize_2(MethodHandleStore.getObject_19());
      MethodHandleStore.isValid_23((Object)MethodHandleStore.methodHandle_O.invoke());
      MethodHandleStore.initialize_12();
   }

   @CInject(
      method = "func_147121_ag()V",
      target = @CTarget(value = "INVOKE", target = "Lnet/minecraft/entity/player/InventoryPlayer;func_70448_g()Lnet/minecraft/item/ItemStack;")
   )
   public void rightClickMouseGCI(InjectionCallback var1) {
      if (!this.playerController.getIsHittingBlock()) {
         MethodHandleStore.initialize(
            (Minecraft)this, MethodHandleStore.getValue_3(MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bm))
         );
      }
   }
}
