package rip.breeze;

import net.minecraft.network.play.client.C0EPacketClickWindow;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "C0EPacketClickWindow",
   superName = "Packet",
   description = "Sent when clicking in a window/inventory slot",
   group = "net/minecraft/network/client"
)
public class InventoryUtils extends PacketUtil14<C0EPacketClickWindow> {
   public InventoryUtils(C0EPacketClickWindow var1) {
      super(var1);
   }

   @JSConstructor(
      description = "Creates a new click window packet",
      params = {
            "The ID of the window being clicked",
            "The ID of the slot being clicked",
            "The button used (0=left, 1=right)",
            "The click mode (0=normal click, 1=shift click, 2=key drop, 3=middle click, 4=drop w/ctrl key, 5=paint w/drag, 6=double click)",
            "The ItemStack in the clicked slot",
            "The transaction ID"
      }
   )
   public InventoryUtils(int var1, int var2, int var3, int var4, ItemStack var5, int var6) {
      super(new C0EPacketClickWindow(var1, var2, var3, var4, (net.minecraft.item.ItemStack)var5.b(), (short)var6));
   }

   @JSFunction(value = "getWindowId", description = "Gets the ID of the window being clicked", returns = "Window ID")
   public int getValue() {
      return ((C0EPacketClickWindow)this.i).getWindowId();
   }

   @JSFunction(value = "getSlotId", description = "Gets the ID of the clicked slot", returns = "Slot ID")
   public int getValue_2() {
      return ((C0EPacketClickWindow)this.i).getSlotId();
   }

   @JSFunction(value = "getButton", description = "Gets the mouse button used (0=left, 1=right)", returns = "Button used")
   public int getValue_3() {
      return ((C0EPacketClickWindow)this.i).getUsedButton();
   }

   @JSFunction(value = "getMode", description = "Gets the click mode (0=click, 1=shift-click, etc)", returns = "Click mode")
   public int getValue_4() {
      return ((C0EPacketClickWindow)this.i).getMode();
   }

   @JSFunction(value = "getItemStack", description = "Gets the ItemStack in the clicked slot", returns = "ItemStack in slot")
   public ItemStack getBreezeUtil68() {
      return new ItemStack(((C0EPacketClickWindow)this.i).getClickedItem());
   }

   @JSFunction(value = "setWindowId", description = "Sets the window ID", params = "The new window ID")
   public void initialize(int var1) {
      MinecraftAccessor.initialize_56((C0EPacketClickWindow)this.i, var1);
   }

   @JSFunction(value = "setSlotId", description = "Sets the slot ID", params = "The new slot ID")
   public void initialize_2(int var1) {
      MinecraftAccessor.initialize_67((C0EPacketClickWindow)this.i, var1);
   }

   @JSFunction(value = "setButton", description = "Sets the button used", params = "The new button (0=left, 1=right)")
   public void initialize_3(int var1) {
      MinecraftAccessor.initialize_32((C0EPacketClickWindow)this.i, var1);
   }

   @JSFunction(value = "setMode", description = "Sets the click mode", params = "The new mode (0=click, 1=shift-click, etc)")
   public void initialize_4(int var1) {
      MinecraftAccessor.initialize_21((C0EPacketClickWindow)this.i, var1);
   }

   @JSFunction(value = "setItemStack", description = "Sets the ItemStack", params = "The new ItemStack for this slot")
   public void initialize_5(ItemStack var1) {
      MinecraftAccessor.initialize_23((C0EPacketClickWindow)this.i, (net.minecraft.item.ItemStack)var1.b());
   }
}
