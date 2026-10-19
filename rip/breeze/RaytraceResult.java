package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.util.MovingObjectPosition;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;

@ScriptObject(name = "RaytraceResult", description = "Represents the result of a raytrace.", group = "net/minecraft/util")
public class RaytraceResult extends Util132<MovingObjectPosition> {
   private static final String[] CONST_M;
   private static final String[] CONST_N;
   private static final Map CONST_Q = new HashMap(13);

   public RaytraceResult(MovingObjectPosition var1) {
      super(var1);
   }

   @JSGetter(value = "entityHit", description = "The entity the raytrace might have hit.", remarks = "May be null if the raytrace didn't hit an entity.")
   public RotationUtils getRotationUtils() {
      return ((MovingObjectPosition)this.i).entityHit == null ? null : (RotationUtils)RotationUtils.c(((MovingObjectPosition)this.i).entityHit);
   }

   @JSGetter(value = "blockPos", description = "The block position the raytrace might have hit.", remarks = "May be null if the raytrace didn't hit a block.")
   public BlockPos getBreezeUtil80() {
      return (BlockPos)BlockPos.b(((MovingObjectPosition)this.i).getBlockPos());
   }

   @JSGetter(
      value = "sideHit",
      description = "The side of the block the raytrace might have hit. Will be a EnumFacing.",
      remarks = "May be null if the raytrace didn't hit a block."
   )
   public String getString() {
      return ((MovingObjectPosition)this.i).sideHit == null ? null : ((MovingObjectPosition)this.i).sideHit.toString();
   }

   @JSGetter(value = "hitVec", description = "The hit vector of the raytrace, can be null.")
   public VecUtil1 getBreezeUtil81() {
      return (VecUtil1)VecUtil1.b(((MovingObjectPosition)this.i).hitVec);
   }

   @JSFunction(value = "getHitType", returns = "The type of hit that was made. One of: BLOCK, ENTITY, MISS.", forceType = "HitType")
   public String getString_2() {
      long var1 = 71560612117109L;
      switch (WorldUtil1.CONST_A[((MovingObjectPosition)this.i).typeOfHit.ordinal()]) {
         case 1:
            return "BLOCK";
         case 2:
            return "ENTITY";
         case 3:
            return "MISS";
         default:
            return "UNKNOWN";
      }
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return "RaytraceResult";
   }

   static {
      long var0 = 4897874449500L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[5];
      int var5 = 0;
      String var6 = "ÚC\u001föæp\u0098\u008c'\u0006\u008e~W<©\u0099\u0010ÓmvÉ\u001f\u0018ü&£\u0002\u0016§8b§t\u0010\u0011ÈíH¯òÃV\u0013_ïWvn\u008aÜ";
      int var7 = "ÚC\u001föæp\u0098\u008c'\u0006\u008e~W<©\u0099\u0010ÓmvÉ\u001f\u0018ü&£\u0002\u0016§8b§t\u0010\u0011ÈíH¯òÃV\u0013_ïWvn\u008aÜ".length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_M = var4;
                     CONST_N = new String[5];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\u0086¦y\u009f\f¬à\u0007&&$ºÒhµÄû\u0083fR£\u0005\u009cq\u0094©Á\u001b©(¿L\u0010S\u008d·½\u0083·²§ùb ?ë\u000f\u0001(";
                  var7 = "\u0086¦y\u009f\f¬à\u0007&&$ºÒhµÄû\u0083fR£\u0005\u009cq\u0094©Á\u001b©(¿L\u0010S\u008d·½\u0083·²§ùb ?ë\u000f\u0001(".length();
                  var8 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
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

   private static String buildString_2(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2975;
      if (CONST_N[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Q.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Q.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cb", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_M[var3].getBytes("ISO-8859-1");
         CONST_N[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_N[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_2(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getObject".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/cb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
