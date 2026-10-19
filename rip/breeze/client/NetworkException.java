package rip.breeze.client;

import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;

public class NetworkException {
   long fieldLong_a;
   Vec3i vec3i_b;
   Vec3 vec3_c;
   float fieldFloat_d;
   float fieldFloat_e;
   boolean fieldBool_f;
   boolean fieldBool_g;

   public NetworkException(Vec3i var1, long var2, float var4, float var5, boolean var6, boolean var7) {
      this.fieldLong_a = var2;
      this.vec3i_b = var1;
      this.vec3_c = new Vec3(var1.getX() / 32.0, var1.getY() / 32.0, var1.getZ() / 32.0);
      this.fieldFloat_d = var4;
      this.fieldFloat_e = var5;
      this.fieldBool_f = var6;
      this.fieldBool_g = var7;
   }
}
