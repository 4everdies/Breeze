package rip.breeze;

class Util3 {
   int fieldInt_a;
   int fieldInt_b;

   Util3(int var1, int var2) {
      this.fieldInt_a = var1;
      this.fieldInt_b = var2;
   }

   int calculate() {
      return this.fieldInt_b - this.fieldInt_a;
   }
}
