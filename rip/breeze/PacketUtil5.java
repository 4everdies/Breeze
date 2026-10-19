package rip.breeze;

import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(
   name = "C0FPacketConfirmTransaction",
   superName = "Packet",
   description = "A packet sent by the client to confirm a transaction.",
   group = "net/minecraft/network/client"
)
public class PacketUtil5 extends PacketUtil14<C0FPacketConfirmTransaction> {
   public PacketUtil5(C0FPacketConfirmTransaction var1) {
      super(var1);
   }

   @JSConstructor(
      description = "Creates a new C0FPacketConfirmTransaction packet",
      params = {"The window ID", "The action number to confirm", "Whether the transaction was accepted"}
   )
   public PacketUtil5(int var1, int var2, boolean var3) {
      super(new C0FPacketConfirmTransaction(var1, (short)var2, var3));
   }

   @JSFunction(value = "getWindowId", description = "Gets the window ID associated with this transaction", returns = "The window ID")
   public int getValue() {
      return ((C0FPacketConfirmTransaction)this.i).getWindowId();
   }

   @JSFunction(value = "getUid", description = "Gets the unique ID of this transaction", returns = "The transaction ID")
   public int getValue_2() {
      return ((C0FPacketConfirmTransaction)this.i).getUid();
   }

   @JSFunction(value = "isAccepted", description = "Checks if the transaction was accepted", returns = "True if accepted, false otherwise")
   public boolean isValid() {
      return MinecraftAccessor.isValid_8((C0FPacketConfirmTransaction)this.i);
   }

   @JSFunction(value = "setWindowId", description = "Sets the window ID for this transaction", params = "The new window ID")
   public void initialize(int var1) {
      MinecraftAccessor.initialize_53((C0FPacketConfirmTransaction)this.i, var1);
   }

   @JSFunction(value = "setUid", description = "Sets the unique ID for this transaction", params = "The new transaction ID")
   public void update(int var1) {
      MinecraftAccessor.initialize_64((C0FPacketConfirmTransaction)this.i, (short)MathUtil1.clamp_2(var1, -32768, 32767));
   }

   @JSFunction(value = "setAccepted", description = "Sets whether this transaction is accepted", params = "True to accept, false to reject")
   public void initialize_2(boolean var1) {
      MinecraftAccessor.initialize_50((C0FPacketConfirmTransaction)this.i, var1);
   }
}
