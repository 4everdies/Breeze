package rip.breeze;

import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C02PacketUseEntity.Action;
import net.minecraft.util.Vec3;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.BreezeClient;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "C02PacketUseEntity",
   superName = "Packet",
   group = "net/minecraft/network/client",
   description = "A packet sent by the client to interact with entities."
)
public class UseEntityAction extends PacketUtil14<C02PacketUseEntity> {
   @JSConstructor(
      description = "Creates a new C02PacketUseEntity packet",
      params = {"The entity to interact with", "The action to perform (INTERACT, ATTACK or INTERACT_AT)", "The hit vector for the interaction."}
   )
   public UseEntityAction(RotationUtils var1, @ForceParamType("UseEntityAction") String var2, VecUtil1 var3) {
      super(var3 == null ? new C02PacketUseEntity((Entity)var1.b(), Action.valueOf(var2)) : new C02PacketUseEntity((Entity)var1.b(), (Vec3)var3.b()));
   }

   public UseEntityAction(C02PacketUseEntity var1) {
      super(var1);
   }

   @JSFunction(
      value = "getAction",
      description = "Gets the action performed on the entity",
      returns = "The action as a string (INTERACT, ATTACK or INTERACT_AT)",
      forceType = "UseEntityAction"
   )
   @Override
   public String getString() {
      return ((C02PacketUseEntity)this.i).getAction().name();
   }

   @JSFunction(
      value = "getHitVec",
      description = "Gets the hit vector for INTERACT_AT actions",
      returns = "The hit vector or null if the action is not INTERACT_AT"
   )
   public VecUtil1 getBreezeUtil81() {
      return new VecUtil1(((C02PacketUseEntity)this.i).getHitVec());
   }

   @JSFunction(value = "getEntity", description = "Gets the entity this packet is interacting with", returns = "The target entity")
   public RotationUtils getRotationUtils() {
      return StringBuilderUtil.getDataBuilder12(((C02PacketUseEntity)this.i).getEntityFromWorld(BreezeClient.CONST_A.theWorld));
   }

   @JSFunction(value = "setEntity", description = "Sets the entity this packet is interacting with", params = "The new target entity")
   public void initialize(RotationUtils var1) {
      MinecraftAccessor.initialize_13((C02PacketUseEntity)this.i, ((Entity)var1.b()).getEntityId());
   }

   @JSFunction(value = "setAction", description = "Sets the action to perform on the entity", params = "The new action (INTERACT, ATTACK or INTERACT_AT)")
   public void initialize_2(String var1) {
      MinecraftAccessor.initialize_76((C02PacketUseEntity)this.i, Action.valueOf(var1));
   }

   @JSFunction(value = "setHitVec", description = "Sets the hit vector for INTERACT_AT actions", params = "The new hit vector")
   public void initialize_3(VecUtil1 var1) {
      MinecraftAccessor.initialize_74((C02PacketUseEntity)this.i, (Vec3)var1.b());
   }
}
