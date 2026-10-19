package rip.breeze;

public interface IBreezeInterface2 extends IBreezeInterface {
   int getFirst();

   int getSecond();

   RotationUtil8 getData();

   default boolean isValid() {
      return true;
   }
}
