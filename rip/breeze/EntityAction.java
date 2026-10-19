package rip.breeze;

import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0BPacketEntityAction.Action;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "C0BPacketEntityAction",
   superName = "Packet",
   description = "A packet sent by the client to inform the server about entity actions such as sprinting or sneaking.",
   group = "net/minecraft/network/client"
)
public class EntityAction extends PacketUtil14<C0BPacketEntityAction> {
   @JSConstructor(
      description = "Creates a new C0BPacketEntityAction for the given entity and action",
      params = {"The entity performing the action", "The action being performed"}
   )
   public EntityAction(RotationUtils var1, @ForceParamType("EntityAction") String var2) {
      super(new C0BPacketEntityAction((Entity)var1.b(), Action.valueOf(var2)));
   }

   public EntityAction(C0BPacketEntityAction var1) {
      super(var1);
   }

   @JSFunction(value = "getAction", description = "Gets the action being performed", returns = "The action as a string", forceType = "EntityAction")
   @Override
   public String getString() {
      return ((C0BPacketEntityAction)this.i).getAction().name();
   }

   @JSFunction(value = "getAuxData", description = "Gets the auxiliary data associated with this action", returns = "The auxiliary data value")
   public int getValue() {
      return ((C0BPacketEntityAction)this.i).getAuxData();
   }

   @JSFunction(value = "setAction", description = "Sets the action to be performed", params = "The new action")
   public void initialize(@ForceParamType("EntityAction") String var1) {
      MinecraftAccessor.initialize_55((C0BPacketEntityAction)this.i, Action.valueOf(var1));
   }

   @JSFunction(value = "setAuxData", description = "Sets the auxiliary data associated with this action", params = "The new auxiliary data value")
   public void initialize_2(int var1) {
      MinecraftAccessor.initialize_71((C0BPacketEntityAction)this.i, var1);
   }
}
