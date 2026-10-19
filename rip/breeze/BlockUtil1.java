package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import org.mozilla.javascript.annotations.JSFunction;

@ScriptObject(name = "World", group = "net/minecraft/client")
public class BlockUtil1 extends StringBuilderUtil<WorldClient> {
   private static final String CONST_Q;

   public BlockUtil1(WorldClient var1) {
      super(var1);
   }

   @JSFunction(value = "getPlayers", description = "Gets all players in the world.")
   public EntityPlayer[] getNearestPlayer() {
      EntityPlayer[] var1 = new EntityPlayer[((WorldClient)this.i).playerEntities.size()];
      int[] var2 = new int[]{0};
      ((WorldClient)this.i).playerEntities.forEach(BlockUtil1::lambda$getPlayers_Inner0);
      return var1;
   }

   @JSFunction(value = "getEntities", description = "Gets all entities in the world.")
   public RotationUtils[] values() {
      RotationUtils[] var1 = new RotationUtils[((WorldClient)this.i).loadedEntityList.size()];
      int[] var2 = new int[]{0};
      ((WorldClient)this.i).loadedEntityList.forEach(BlockUtil1::lambda$getEntities_Inner1);
      return var1;
   }

   @JSFunction(
      value = "rayTraceBlocks",
      description = "Ray traces through the world from one point to another.",
      params = {"The starting position of the ray.", "The ending position of the ray."},
      returns = "The result of the ray trace, or null if no intersection was found."
   )
   public RaytraceResult rayTrace(VecUtil1 var1, VecUtil1 var2) {
      return (RaytraceResult)RaytraceResult.b(((WorldClient)this.i).rayTraceBlocks((Vec3)var1.b(), (Vec3)var2.b()));
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_Q;
   }

   private static void lambda$getEntities_Inner1(RotationUtils[] var0, int[] var1, Entity var2) {
      var0[var1[0]++] = (RotationUtils)RotationUtils.c(var2);
   }

   private static void lambda$getPlayers_Inner0(EntityPlayer[] var0, int[] var1, net.minecraft.entity.player.EntityPlayer var2) {
      var0[var1[0]++] = (EntityPlayer)RotationUtils.c(var2);
   }

   static {
      long var0 = 21501670916187L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("§Æô oïËá".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_Q = var5;
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
