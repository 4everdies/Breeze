package rip.breeze.client;

import net.minecraft.util.Vec3;

final class MathUtil7 {
   Vec3 vec3_a;
   int fieldInt_b;
   Vec3 vec3_c;
   float fieldFloat_d;
   int fieldInt_e = -1;

   MathUtil7(Vec3 var1, int var2) {
      this.initialize(var1, var2);
   }

   void initialize(Vec3 var1, int var2) {
      this.vec3_a = var1;
      this.fieldInt_b = var2;
   }

   void update(Vec3 var1, float var2, int var3) {
      this.vec3_c = var1;
      this.fieldFloat_d = var2;
      this.fieldInt_e = var3;
   }

   boolean isValid() {
      return this.fieldInt_e >= 0;
   }

   void initialize_2() {
      this.fieldInt_e = -1;
      this.vec3_c = null;
   }
}
