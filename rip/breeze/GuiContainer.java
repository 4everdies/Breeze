package rip.breeze;

import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(name = "GuiContainer", superName = "GuiScreen", description = "The base GuiContainer class.", group = "net/minecraft/client/gui")
public class GuiContainer extends GuiScreen {
   public GuiContainer(net.minecraft.client.gui.inventory.GuiContainer var1) {
      super(var1);
   }

   @JSGetter(value = "container", description = "The inventory container, contains the slot data.")
   public Util26 getBreezeUtil66() {
      return StringBuilderUtil.getDataBuilder12(((net.minecraft.client.gui.inventory.GuiContainer)this.i).inventorySlots);
   }

   @JSFunction(value = "draggedStack", description = "The ItemStack that is being dragged.")
   public ItemStack getBreezeUtil68() {
      return StringBuilderUtil.getDataBuilder12(MinecraftAccessor.getItemStack((net.minecraft.client.gui.inventory.GuiContainer)this.i));
   }

   @JSFunction(value = "getSlotAtPosition", description = "Returns the slot at the given position.")
   public BlockUtil3 getBreezeUtil67(int var1, int var2) {
      return StringBuilderUtil.getDataBuilder12(MinecraftAccessor.getSlot((net.minecraft.client.gui.inventory.GuiContainer)this.i, var1, var2));
   }
}
