package rip.breeze.client;

public interface IBreezeInterface2 {
   void register(ModuleRegistry var1);

   int getCount();

   default void noOp() {
   }
}
