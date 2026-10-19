package rip.breeze;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.state.IBlockState;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import rip.breeze.client.BreezeClient;

@ScriptObject(name = "BlockPos", description = "A block position.", group = "net/minecraft/util")
public class BlockPos extends Util132<net.minecraft.util.BlockPos> {
   public BlockPos(net.minecraft.util.BlockPos var1) {
      super(var1);
   }

   @JSConstructor
   public BlockPos(float var1, float var2, float var3) {
      super(new net.minecraft.util.BlockPos(var1, var2, var3));
   }

   @JSGetter(value = "posX", description = "Gets the X coordinate.")
   public int getValue() {
      return ((net.minecraft.util.BlockPos)this.i).getX();
   }

   @JSGetter(value = "posY", description = "Gets the Y coordinate.")
   public int getValue_2() {
      return ((net.minecraft.util.BlockPos)this.i).getY();
   }

   @JSGetter(value = "posZ", description = "Gets the Z coordinate.")
   public int getValue_3() {
      return ((net.minecraft.util.BlockPos)this.i).getZ();
   }

   @JSFunction(value = "up", description = "Gets the BlockPos one block up.")
   public BlockPos getBreezeUtil80() {
      return new BlockPos(((net.minecraft.util.BlockPos)this.i).up());
   }

   @JSFunction(value = "down", description = "Gets the BlockPos one block down.")
   public BlockPos getBreezeUtil80_2() {
      return new BlockPos(((net.minecraft.util.BlockPos)this.i).down());
   }

   @JSFunction(value = "north", description = "Gets the BlockPos one block north.")
   public BlockPos getBreezeUtil80_3() {
      return new BlockPos(((net.minecraft.util.BlockPos)this.i).north());
   }

   @JSFunction(value = "south", description = "Gets the BlockPos one block south.")
   public BlockPos getBreezeUtil80_4() {
      return new BlockPos(((net.minecraft.util.BlockPos)this.i).south());
   }

   @JSFunction(value = "east", description = "Gets the BlockPos one block east.")
   public BlockPos getBreezeUtil80_5() {
      return new BlockPos(((net.minecraft.util.BlockPos)this.i).east());
   }

   @JSFunction(value = "west", description = "Gets the BlockPos one block west.")
   public BlockPos getBreezeUtil80_6() {
      return new BlockPos(((net.minecraft.util.BlockPos)this.i).west());
   }

   @JSFunction(value = "isReplaceable", description = "Checks if the block at this position is replaceable.")
   public boolean isValid() {
      return this.getIBlockState().getBlock().isReplaceable(BreezeClient.CONST_A.theWorld, (net.minecraft.util.BlockPos)this.i);
   }

   @JSFunction(value = "isSolid", description = "Checks if the block at this position is solid.")
   public boolean isValid_2() {
      return this.getIBlockState().getBlock().isFullBlock();
   }

   @JSFunction(value = "isAir", description = "Checks if the block at this position is air.")
   public boolean isValid_3() {
      return this.getIBlockState().getBlock() instanceof BlockAir;
   }

   @JSFunction(value = "getBlockId", description = "Gets the block ID at this position.")
   public int getValue_4() {
      return Block.getIdFromBlock(this.getIBlockState().getBlock());
   }

   @JSFunction(value = "getHardness", description = "Gets the hardness of the block at this position.")
   public float getFloat() {
      return this.getIBlockState().getBlock().getBlockHardness(BreezeClient.CONST_A.theWorld, (net.minecraft.util.BlockPos)this.i);
   }

   private IBlockState getIBlockState() {
      return BreezeClient.CONST_A.theWorld.getBlockState((net.minecraft.util.BlockPos)this.i);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof BlockPos && ((net.minecraft.util.BlockPos)this.i).equals(((BlockPos)var1).i);
   }
}
