package rip.breeze.client;

final class Util130 {
   private int[] arr_b;
   private int fieldInt_c;

   Util130(int var1) {
      this.arr_b = new int[Math.max(8, var1)];
   }

   void calculate(int var1) {
      int[] var2 = this.arr_b;
      int var3 = this.fieldInt_c;
      if (var3 >= var2.length) {
         int[] var4 = new int[var2.length << 1];
         System.arraycopy(var2, 0, var4, 0, var2.length);
         this.arr_b = var4;
         var2 = var4;
      }

      var2[var3] = var1;
      this.fieldInt_c = var3 + 1;
   }

   int[] values() {
      int[] var1 = new int[this.fieldInt_c];
      System.arraycopy(this.arr_b, 0, var1, 0, this.fieldInt_c);
      return var1;
   }
}
