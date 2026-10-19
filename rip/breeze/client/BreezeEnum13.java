package rip.breeze.client;

enum BreezeEnum13 {
   ;
public double calculateDouble(double var1, long var3) {
      int var5 = (int)((var3 ^ 46652330692572L) >>> 56);
      long var6 = (var3 ^ 46652330692572L) << 8 >>> 8;
      return var1 < 0.5
         ? (1.0 - EnumType3.getDouble((byte)var5, 1.0 - 2.0 * var1, var6)) / 2.0
         : (1.0 + EnumType3.getDouble((byte)var5, 2.0 * var1 - 1.0, var6)) / 2.0;
   }
}
