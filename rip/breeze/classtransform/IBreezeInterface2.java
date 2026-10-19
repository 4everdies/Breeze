package rip.breeze.classtransform;

@FunctionalInterface
public interface IBreezeInterface2 {
   void invoke_1(Object[] var1);

   default rip.breeze.inject.é getÉ(Object[] var1) {
      return (rip.breeze.inject.é)var1[0];
   }
}
