package rip.breeze.inject;

final class BreezeClass2 extends BreezeClass3 {
   final int int_á;
   BreezeClass2 breezeClass2_à;

   BreezeClass2(int var1, int var2, String var3, String var4, String var5, long var6, int var8) {
      super(var1, var2, var3, var4, var5, var6);
      this.int_á = var8;
   }

   BreezeClass2(int var1, int var2, String var3, int var4) {
      super(var1, var2, null, null, var3, 0L);
      this.int_á = var4;
   }

   BreezeClass2(int var1, int var2, String var3, long var4, int var6) {
      super(var1, var2, null, null, var3, var4);
      this.int_á = var6;
   }

   BreezeClass2(int var1, int var2, String var3, String var4, int var5) {
      super(var1, var2, null, var3, var4, 0L);
      this.int_á = var5;
   }

   BreezeClass2(int var1, int var2, long var3, int var5) {
      super(var1, var2, null, null, null, var3);
      this.int_á = var5;
   }
}
