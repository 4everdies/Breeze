package rip.breeze;

import net.minecraft.network.play.server.S04PacketEntityEquipment;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(
   name = "S04PacketEntityEquipment",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent when an entity's equipment changes"
)
public class PacketUtil7 extends PacketUtil14<S04PacketEntityEquipment> {
   public PacketUtil7(S04PacketEntityEquipment var1) {
      super(var1);
   }

   @JSFunction(value = "getItemStack", description = "Gets the ItemStack that was equipped", returns = "The equipped item")
   public ItemStack getHeldItem() {
      return new ItemStack(((S04PacketEntityEquipment)this.b()).getItemStack());
   }

   @JSFunction(value = "getEntityID", description = "Gets the ID of the entity whose equipment changed", returns = "The entity ID")
   public int getValue() {
      return ((S04PacketEntityEquipment)this.b()).getEntityID();
   }

   @JSFunction(
      value = "getEquipmentSlot",
      description = "Gets the equipment slot that was changed (0: main hand, 1-4: armor slots)",
      returns = "The equipment slot number"
   )
   public int getValue_2() {
      return ((S04PacketEntityEquipment)this.b()).getEquipmentSlot();
   }
}
