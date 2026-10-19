package rip.breeze;

import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C07PacketPlayerDigging.Action;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "C07PacketPlayerDigging",
   superName = "Packet",
   group = "net/minecraft/network/client",
   description = "Packet sent when breaking blocks or dropping items",
   example = "const packet = new C07PacketPlayerDigging('START_DESTROY_BLOCK', blockPos, 'UP');"
)
public class DiggingAction extends PacketUtil14<C07PacketPlayerDigging> {
   public DiggingAction(C07PacketPlayerDigging var1) {
      super(var1);
   }

   @JSConstructor(
      description = "Create a new C07PacketPlayerDigging packet",
      params = {
            "The dig action (START_DESTROY_BLOCK, ABORT_DESTROY_BLOCK, STOP_DESTROY_BLOCK, DROP_ALL_ITEMS, DROP_ITEM, RELEASE_USE_ITEM)",
            "The block position",
            "The block face (DOWN, UP, NORTH, SOUTH, WEST, EAST)"
      }
   )
   public DiggingAction(@ForceParamType("DiggingAction") String var1, BlockPos var2, @ForceParamType("EnumFacing") String var3) {
      super(new C07PacketPlayerDigging(Action.valueOf(var1), (net.minecraft.util.BlockPos)var2.b(), net.minecraft.util.EnumFacing.valueOf(var3)));
   }

   @JSFunction(value = "getAction", description = "Get the dig action", returns = "The dig action name", forceType = "DiggingAction")
   @Override
   public String getString() {
      return ((C07PacketPlayerDigging)this.i).getStatus().name();
   }

   @JSFunction(value = "getPosition", description = "Get the block position", returns = "The block position")
   public BlockPos getBreezeUtil80() {
      return new BlockPos(((C07PacketPlayerDigging)this.i).getPosition());
   }

   @JSFunction(value = "getFace", description = "Get the block face", returns = "The block face name", forceType = "EnumFacing")
   public String getString_2() {
      return ((C07PacketPlayerDigging)this.i).getFacing().name();
   }

   @JSFunction(value = "setAction", description = "Set the dig action", params = "The dig action name")
   public void initialize(@ForceParamType("DiggingAction") String var1) {
      MinecraftAccessor.initialize_46((C07PacketPlayerDigging)this.i, Action.valueOf(var1));
   }

   @JSFunction(value = "setPosition", description = "Set the block position", params = "The new block position")
   public void initialize_2(BlockPos var1) {
      MinecraftAccessor.initialize_4((C07PacketPlayerDigging)this.i, (net.minecraft.util.BlockPos)var1.b());
   }

   @JSFunction(value = "setFace", description = "Set the block face", params = "The block face name")
   public void initialize_3(@ForceParamType("EnumFacing") String var1) {
      MinecraftAccessor.initialize((C07PacketPlayerDigging)this.i, net.minecraft.util.EnumFacing.valueOf(var1));
   }
}
