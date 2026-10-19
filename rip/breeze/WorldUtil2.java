package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;

@ScriptObject(name = "AxisAlignedBB", description = "A bounding box in 3d space.", group = "net/minecraft/util")
public class WorldUtil2 extends Util132<AxisAlignedBB> {
   private static final String CONST_M;

   public WorldUtil2(AxisAlignedBB var1) {
      super(var1);
   }

   @JSConstructor
   public WorldUtil2(double var1, double var3, double var5, double var7, double var9, double var11) {
      super(new AxisAlignedBB(var1, var3, var5, var7, var9, var11));
   }

   @JSGetter("minX")
   public double getDouble() {
      return ((AxisAlignedBB)this.i).minX;
   }

   @JSGetter("minY")
   public double getDouble_2() {
      return ((AxisAlignedBB)this.i).minY;
   }

   @JSGetter("minZ")
   public double getDouble_3() {
      return ((AxisAlignedBB)this.i).minZ;
   }

   @JSGetter("maxX")
   public double getDouble_4() {
      return ((AxisAlignedBB)this.i).maxX;
   }

   @JSGetter("maxY")
   public double getDouble_5() {
      return ((AxisAlignedBB)this.i).maxY;
   }

   @JSGetter("maxZ")
   public double getDouble_6() {
      return ((AxisAlignedBB)this.i).maxZ;
   }

   @JSFunction(
      value = "intersectsWith",
      description = "Check if two bounding boxes intersect.",
      params = "The bounding box to check with.",
      returns = "True if the bounding boxes intersect."
   )
   public boolean isValid(WorldUtil2 var1) {
      return ((AxisAlignedBB)this.i).intersectsWith((AxisAlignedBB)var1.b());
   }

   @JSFunction(
      value = "rayTrace",
      description = "Ray traces this bounding box.",
      params = {"The starting position of the ray.", "The end position of the ray."},
      returns = "The result of the ray trace, or null if no intersection was found."
   )
   public RaytraceResult getDataBuilder48(VecUtil1 var1, VecUtil1 var2) {
      return (RaytraceResult)RaytraceResult.b(((AxisAlignedBB)this.i).calculateIntercept((Vec3)var1.b(), (Vec3)var2.b()));
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_M;
   }

   static {
      long var0 = 9135733207732L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u008cþ\u000e¾¬±½KN\u0017\u009f\u0090Ü{\u0000Ð".getBytes("ISO-8859-1"));
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
