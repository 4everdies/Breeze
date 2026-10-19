package rip.breeze;

import net.minecraft.network.play.server.S27PacketExplosion;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "S27PacketExplosion",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that is sent when an explosion occurs"
)
public class MovementUtil1 extends PacketUtil14<S27PacketExplosion> {
   public MovementUtil1(S27PacketExplosion var1) {
      super(var1);
   }

   @JSFunction(value = "getX", description = "Gets the X coordinate of the explosion", returns = "The X coordinate")
   public double getDouble() {
      return ((S27PacketExplosion)this.b()).getX();
   }

   @JSFunction(value = "getY", description = "Gets the Y coordinate of the explosion", returns = "The Y coordinate")
   public double getDouble_2() {
      return ((S27PacketExplosion)this.b()).getY();
   }

   @JSFunction(value = "getZ", description = "Gets the Z coordinate of the explosion", returns = "The Z coordinate")
   public double getDouble_3() {
      return ((S27PacketExplosion)this.b()).getZ();
   }

   @JSFunction(value = "getMotionX", description = "Gets the X motion/knockback applied by the explosion", returns = "The X motion value")
   public double getDouble_4() {
      return ((S27PacketExplosion)this.b()).func_149149_c();
   }

   @JSFunction(value = "getMotionY", description = "Gets the Y motion/knockback applied by the explosion", returns = "The Y motion value")
   public double getDouble_5() {
      return ((S27PacketExplosion)this.b()).func_149144_d();
   }

   @JSFunction(value = "getMotionZ", description = "Gets the Z motion/knockback applied by the explosion", returns = "The Z motion value")
   public double getDouble_6() {
      return ((S27PacketExplosion)this.b()).func_149147_e();
   }

   @JSFunction(value = "getStrength", description = "Gets the strength/radius of the explosion", returns = "The explosion strength")
   public float getFloat() {
      return ((S27PacketExplosion)this.b()).getStrength();
   }

   @JSFunction(
      value = "getAffectedBlockPositions",
      description = "Gets an array of block positions affected by the explosion",
      returns = "Array of affected block positions"
   )
   public BlockPos[] values() {
      BlockPos[] var1 = new BlockPos[((S27PacketExplosion)this.b()).getAffectedBlockPositions().size()];

      for (int var2 = 0; var2 < ((S27PacketExplosion)this.b()).getAffectedBlockPositions().size(); var2++) {
         var1[var2] = new BlockPos((net.minecraft.util.BlockPos)((S27PacketExplosion)this.b()).getAffectedBlockPositions().get(var2));
      }

      return var1;
   }

   @JSFunction(value = "setMotionX", description = "Sets the X motion/knockback applied by the explosion", params = "The new X motion value")
   public void update(float var1) {
      MinecraftAccessor.initialize_12((S27PacketExplosion)this.b(), var1);
   }

   @JSFunction(value = "setMotionY", description = "Sets the Y motion/knockback applied by the explosion", params = "The new Y motion value")
   public void update_1(float var1) {
      MinecraftAccessor.initialize_41((S27PacketExplosion)this.b(), var1);
   }

   @JSFunction(value = "setMotionZ", description = "Sets the Z motion/knockback applied by the explosion", params = "The new Z motion value")
   public void update_2(float var1) {
      MinecraftAccessor.initialize_25((S27PacketExplosion)this.b(), var1);
   }
}
