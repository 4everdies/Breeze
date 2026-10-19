package rip.breeze;

import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "C08PacketBlockPlacement",
   superName = "Packet",
   group = "net/minecraft/network/client",
   description = "Represents a packet sent when a player places a block"
)
public class BlockUtil4 extends PacketUtil14<C08PacketPlayerBlockPlacement> {
   public BlockUtil4(C08PacketPlayerBlockPlacement var1) {
      super(var1);
   }

   @JSConstructor(
      description = "Creates a new block placement packet",
      params = {
            "The position where the block is being placed", "The direction the block is being placed", "The ItemStack being placed", "The hit vector position"
      }
   )
   public BlockUtil4(BlockPos var1, int var2, ItemStack var3, VecUtil1 var4) {
      super(
         new C08PacketPlayerBlockPlacement(
            (net.minecraft.util.BlockPos)var1.b(),
            var2,
            (net.minecraft.item.ItemStack)var3.b(),
            (float)var4.getDouble(),
            (float)var4.getDouble_2(),
            (float)var4.getDouble_3()
         )
      );
   }

   @JSFunction(value = "getPosition", description = "Gets the position where the block is being placed", returns = "The BlockPos position")
   public BlockPos getBreezeUtil80() {
      return new BlockPos(((C08PacketPlayerBlockPlacement)this.i).getPosition());
   }

   @JSFunction(value = "getPlacedBlockDirection", description = "Gets the direction the block is being placed", returns = "The block direction as an integer")
   public int getValue() {
      return ((C08PacketPlayerBlockPlacement)this.i).getPlacedBlockDirection();
   }

   @JSFunction(value = "getStack", description = "Gets the ItemStack being placed", returns = "The ItemStack")
   public ItemStack getBreezeUtil68() {
      return new ItemStack(((C08PacketPlayerBlockPlacement)this.i).getStack());
   }

   @JSFunction(value = "getVec3", description = "Gets the hit vector position", returns = "The Vec3 position")
   public VecUtil1 getBreezeUtil81() {
      return new VecUtil1(
         ((C08PacketPlayerBlockPlacement)this.i).getPlacedBlockOffsetX(),
         ((C08PacketPlayerBlockPlacement)this.i).getPlacedBlockOffsetY(),
         ((C08PacketPlayerBlockPlacement)this.i).getPlacedBlockOffsetZ()
      );
   }

   @JSFunction(value = "setPosition", description = "Sets the position where the block is being placed", params = "The new BlockPos position")
   public void initialize(BlockPos var1) {
      MinecraftAccessor.initialize_36((C08PacketPlayerBlockPlacement)this.i, (net.minecraft.util.BlockPos)var1.b());
   }

   @JSFunction(value = "setPlacedBlockDirection", description = "Sets the direction the block is being placed", params = "The new block direction")
   public void initialize_2(int var1) {
      MinecraftAccessor.initialize_16((C08PacketPlayerBlockPlacement)this.i, var1);
   }

   @JSFunction(value = "setStack", description = "Sets the ItemStack being placed", params = "The new ItemStack")
   public void initialize_3(ItemStack var1) {
      MinecraftAccessor.initialize_59((C08PacketPlayerBlockPlacement)this.i, (net.minecraft.item.ItemStack)var1.b());
   }

   @JSFunction(value = "setVec3", description = "Sets the hit vector position", params = "The new Vec3 position")
   public void update(VecUtil1 var1) {
      MinecraftAccessor.initialize_49((C08PacketPlayerBlockPlacement)this.i, (float)var1.getDouble());
      MinecraftAccessor.initialize_17((C08PacketPlayerBlockPlacement)this.i, (float)var1.getDouble_2());
      MinecraftAccessor.initialize_15((C08PacketPlayerBlockPlacement)this.i, (float)var1.getDouble_3());
   }
}
