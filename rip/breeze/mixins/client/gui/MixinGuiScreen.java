package rip.breeze.mixins.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import rip.breeze.MethodHandleStore;
import rip.breeze.classtransform.InjectionCallback;
import rip.breeze.classtransform.annotations.CShadow;
import rip.breeze.classtransform.annotations.CTransformer;
import ru.paul.breeze.BreezeBoot;

@CTransformer(GuiScreen.class)
public class MixinGuiScreen {
   @CShadow
   public Minecraft field_146297_k;
   @CShadow
   private int field_146298_h;

   public void drawScreen(int var1, int var2, float var3) {
      if (BreezeBoot.hasWorld()) {
         if (MethodHandleStore.isValid_5(MethodHandleStore.getObject_14())) {
            MethodHandleStore.initialize_13(MethodHandleStore.getObject_14(), 0, 0, 0.0F);
         }
      }
   }

   public void keyTyped(InjectionCallback var1) {
      if (BreezeBoot.hasWorld()) {
         if (!MethodHandleStore.isValid_5(MethodHandleStore.getObject_14()) && this.mc.theWorld == null) {
            if (Keyboard.getEventKeyState()
               && Keyboard.getEventKey() == MethodHandleStore.getValue(MethodHandleStore.getObject_3(MethodHandleStore.getObject_12()))) {
               MethodHandleStore.initialize_9(MethodHandleStore.getObject_14(), true);
               var1.cancel();
            }
         } else if (MethodHandleStore.isValid_5(MethodHandleStore.getObject_14())) {
            var1.cancel();
            MethodHandleStore.initialize_19(MethodHandleStore.getObject_14());
         }
      }
   }

   public void handleMouseInput(InjectionCallback var1) {
      if (BreezeBoot.hasWorld()) {
         if (MethodHandleStore.isValid_5(MethodHandleStore.getObject_14())) {
            var1.cancel();
            int var2 = Mouse.getEventButton();
            if (Mouse.getEventButtonState()) {
               if (this.mc.gameSettings.touchscreen && this.touchValue++ > 0) {
                  return;
               }

               MethodHandleStore.initialize_10(MethodHandleStore.getObject_14(), 0, 0, var2);
            } else if (var2 != -1) {
               if (this.mc.gameSettings.touchscreen && --this.touchValue > 0) {
                  return;
               }

               MethodHandleStore.initialize_7(MethodHandleStore.getObject_14(), 0, 0, var2);
            }
         }
      }
   }

   public void drawDefaultBackground(InjectionCallback var1) {
      if (BreezeBoot.hasWorld()) {
         BreezeBoot.renderHudBg();
         Object var2 = MethodHandleStore.getObject_17(MethodHandleStore.getObject_5(), MethodHandleStore.class_bs);
         if (this.mc.theWorld != null && MethodHandleStore.isValid_13(var2) && MethodHandleStore.isValid(var2)) {
            var1.cancel();
         }
      }
   }
}
