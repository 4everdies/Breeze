package rip.breeze.client;

final class Util127 {
   private byte[] arr_b;
   private int fieldInt_c;

   Util127(int var1) {
      this.arr_b = new byte[Math.max(8, var1)];
   }

   void calculate(byte var1) {
      byte[] var2 = this.arr_b;
      int var3 = this.fieldInt_c;
      if (var3 >= var2.length) {
         byte[] var4 = new byte[var2.length << 1];
         System.arraycopy(var2, 0, var4, 0, var2.length);
         this.arr_b = var4;
         var2 = var4;
      }

      var2[var3] = var1;
      this.fieldInt_c = var3 + 1;
   }

   int getInt_c() {
      return this.fieldInt_c;
   }

   byte[] getBytes() {
      byte[] var1 = new byte[this.fieldInt_c];
      System.arraycopy(this.arr_b, 0, var1, 0, this.fieldInt_c);
      return var1;
   }
}
