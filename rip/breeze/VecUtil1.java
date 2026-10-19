package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.Vec3;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(name = "Vec3", description = "A point in 3d space.", group = "net/minecraft/util")
public class VecUtil1 extends Util132<Vec3> {
   private static final String CONST_M;

   public VecUtil1(Vec3 var1) {
      super(var1);
   }

   @JSConstructor(description = "Creates a new Vec3 instance with the given coordinates")
   public VecUtil1(double var1, double var3, double var5) {
      super(new Vec3(var1, var3, var5));
   }

   @JSFunction(value = "getX", description = "Gets the X coordinate", returns = "The X coordinate")
   public double getDouble() {
      return ((Vec3)this.i).xCoord;
   }

   @JSFunction(value = "getY", description = "Gets the Y coordinate", returns = "The Y coordinate")
   public double getDouble_2() {
      return ((Vec3)this.i).yCoord;
   }

   @JSFunction(value = "getZ", description = "Gets the Z coordinate", returns = "The Z coordinate")
   public double getDouble_3() {
      return ((Vec3)this.i).zCoord;
   }

   @JSFunction(value = "getLength", description = "Gets the length/magnitude of this vector", returns = "The vector length")
   public double getDouble_4() {
      return ((Vec3)this.i).lengthVector();
   }

   @JSFunction(
      value = "distanceTo",
      description = "Calculates the distance to another vector",
      params = "The vector to calculate distance to",
      returns = "The distance between the two vectors"
   )
   public double getDistance(VecUtil1 var1) {
      return ((Vec3)this.i).distanceTo((Vec3)var1.i);
   }

   @JSFunction(value = "add", description = "Adds another vector to this one", params = "The vector to add", returns = "A new vector representing the sum")
   public VecUtil1 getBreezeUtil81(VecUtil1 var1) {
      return new VecUtil1(((Vec3)this.i).add((Vec3)var1.i));
   }

   @JSFunction(
      value = "subtract",
      description = "Subtracts another vector from this one",
      params = "The vector to subtract",
      returns = "A new vector representing the difference"
   )
   public VecUtil1 getBreezeUtil81_2(VecUtil1 var1) {
      return new VecUtil1(((Vec3)this.i).subtract((Vec3)var1.i));
   }

   @JSFunction(value = "normalize", description = "Normalizes this vector to have a length of 1", returns = "A new normalized vector")
   public VecUtil1 getBreezeUtil81_3() {
      return new VecUtil1(((Vec3)this.i).normalize());
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_M;
   }

   static {
      long var0 = 61261339574001L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0007ºöôÄ/\u0086\u0004".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_M = var5;
   }

   private static String buildString(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
