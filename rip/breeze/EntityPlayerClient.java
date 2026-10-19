package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.entity.EntityPlayerSP;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(name = "EntityPlayerSP", description = "A player entity", superName = "EntityPlayer", group = "net/minecraft/client/entity")
public class EntityPlayerClient extends EntityPlayer {
   private static final String CONST_D;

   public EntityPlayerClient(EntityPlayerSP var1) {
      super(var1);
   }

   @JSGetter(value = "lastReportedPosX", description = "The last reported X position of the player.")
   @Override
   public double getDouble() {
      return MinecraftAccessor.getDouble_9((EntityPlayerSP)this.i);
   }

   @JSSetter("lastReportedPosX")
   @Override
   public void initialize(double var1) {
      MinecraftAccessor.initialize_7((EntityPlayerSP)this.i, var1);
   }

   @JSGetter(value = "lastReportedPosY", description = "The last reported Y position of the player.")
   @Override
   public double getDouble_2() {
      return MinecraftAccessor.getDouble_8((EntityPlayerSP)this.i);
   }

   @JSSetter("lastReportedPosY")
   @Override
   public void initialize_2(double var1) {
      MinecraftAccessor.initialize_3((EntityPlayerSP)this.i, var1);
   }

   @JSGetter(value = "lastReportedPosZ", description = "The last reported Z position of the player.")
   @Override
   public double getDouble_3() {
      return MinecraftAccessor.getDouble_7((EntityPlayerSP)this.i);
   }

   @JSSetter("lastReportedPosZ")
   @Override
   public void initialize_3(double var1) {
      MinecraftAccessor.initialize_38((EntityPlayerSP)this.i, var1);
   }

   @JSGetter(value = "lastReportedYaw", description = "The last reported yaw of the player.")
   @Override
   public float getFloat() {
      return MinecraftAccessor.getFloat_4((EntityPlayerSP)this.i);
   }

   @JSSetter("lastReportedYaw")
   public void initialize_4(float var1) {
      MinecraftAccessor.initialize_70((EntityPlayerSP)this.i, var1);
   }

   @JSGetter(value = "lastReportedPitch", description = "The last reported pitch of the player.")
   @Override
   public float getFloat_2() {
      return MinecraftAccessor.getFloat_8((EntityPlayerSP)this.i);
   }

   @JSSetter("lastReportedPitch")
   public void initialize_5(float var1) {
      MinecraftAccessor.initialize_9((EntityPlayerSP)this.i, var1);
   }

   @JSGetter(value = "serverSneakState", description = "The server-side sneak state of the player.")
   @Override
   public boolean isValid() {
      return MinecraftAccessor.isValid_4((EntityPlayerSP)this.i);
   }

   @JSSetter("serverSneakState")
   public void initialize_6(boolean var1) {
      MinecraftAccessor.initialize_26((EntityPlayerSP)this.i, var1);
   }

   @JSGetter(value = "serverSprintState", description = "The server-side sprint state of the player.")
   @Override
   public boolean isValid_2() {
      return MinecraftAccessor.isValid((EntityPlayerSP)this.i);
   }

   @JSSetter("serverSprintState")
   public void initialize_7(boolean var1) {
      MinecraftAccessor.initialize_69((EntityPlayerSP)this.i, var1);
   }

   @JSFunction(value = "swingItem", description = "Makes the player swing their arm clientside and also sends a C0APacketAnimation to the server.")
   public void updateRotation() {
      ((EntityPlayerSP)this.i).swingItem();
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_D;
   }

   static {
      long var0 = 72815753892263L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0017^óá7fÄXÛ>ÿ¶=\u008eM\u0098".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_D = var5;
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
