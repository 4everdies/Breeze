package rip.breeze;

import net.minecraft.network.play.server.S12PacketEntityVelocity;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "S12PacketEntityVelocity",
   superName = "Packet",
   group = "net/minecraft/network/server",
   description = "Represents a packet that updates an entity's velocity/motion"
)
public class MovementUtil6 extends PacketUtil14<S12PacketEntityVelocity> {
   public MovementUtil6(S12PacketEntityVelocity var1) {
      super(var1);
   }

   @JSFunction(value = "getEntityID", description = "Gets the ID of the entity whose velocity is being updated", returns = "The entity ID")
   public int getValue() {
      return ((S12PacketEntityVelocity)this.b()).getEntityID();
   }

   @JSFunction(value = "getMotionX", description = "Gets the X motion/velocity component", returns = "The X velocity value")
   public float calculateFloat() {
      return ((S12PacketEntityVelocity)this.b()).getMotionX() / 8000.0F;
   }

   @JSFunction(value = "getMotionY", description = "Gets the Y motion/velocity component", returns = "The Y velocity value")
   public float calculateFloat_2() {
      return ((S12PacketEntityVelocity)this.b()).getMotionY() / 8000.0F;
   }

   @JSFunction(value = "getMotionZ", description = "Gets the Z motion/velocity component", returns = "The Z velocity value")
   public float calculateFloat_3() {
      return ((S12PacketEntityVelocity)this.b()).getMotionZ() / 8000.0F;
   }

   @JSFunction(value = "setMotionX", description = "Sets the X motion/velocity component", params = "The new X velocity value")
   public void calculate(float var1) {
      MinecraftAccessor.initialize_11((S12PacketEntityVelocity)this.b(), (int)(var1 * 8000.0F));
   }

   @JSFunction(value = "setMotionY", description = "Sets the Y motion/velocity component", params = "The new Y velocity value")
   public void calculate_2(float var1) {
      MinecraftAccessor.initialize_44((S12PacketEntityVelocity)this.b(), (int)(var1 * 8000.0F));
   }

   @JSFunction(value = "setMotionZ", description = "Sets the Z motion/velocity component", params = "The new Z velocity value")
   public void calculate_3(float var1) {
      MinecraftAccessor.initialize_37((S12PacketEntityVelocity)this.b(), (int)(var1 * 8000.0F));
   }
}
