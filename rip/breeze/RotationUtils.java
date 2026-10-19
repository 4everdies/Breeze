package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import rip.breeze.client.BreezeClient;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(name = "Entity", description = "The base class for all entities.", group = "net/minecraft/entity")
public class RotationUtils extends StringBuilderUtil<Entity> {
   private static final String CONST_B;

   public RotationUtils(Entity var1) {
      super(var1);
   }

   @JSGetter("entityID")
   public int getValue() {
      return ((Entity)this.i).getEntityId();
   }

   @JSGetter(value = "posX", description = "The X position of the entity.")
   public double getDouble() {
      return ((Entity)this.i).posX;
   }

   @JSSetter("posX")
   public void initialize(double var1) {
      ((Entity)this.i).posX = var1;
   }

   @JSGetter(value = "posY", description = "The Y position of the entity.")
   public double getDouble_2() {
      return ((Entity)this.i).posY;
   }

   @JSSetter("posY")
   public void initialize_2(double var1) {
      ((Entity)this.i).posY = var1;
   }

   @JSGetter(value = "posZ", description = "The Z position of the entity.")
   public double getDouble_3() {
      return ((Entity)this.i).posZ;
   }

   @JSSetter("posZ")
   public void initialize_3(double var1) {
      ((Entity)this.i).posZ = var1;
   }

   @JSFunction(value = "getPosition", description = "Gets the position of the entity as vec3")
   public VecUtil1 getBreezeUtil81() {
      return (VecUtil1)VecUtil1.b(((Entity)this.i).getPositionVector());
   }

   @JSFunction(value = "getPositionEyes", description = "Gets the position of the eyes as vec3.")
   public VecUtil1 getBreezeUtil81_2() {
      return (VecUtil1)VecUtil1.b(((Entity)this.i).getPositionEyes(MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks));
   }

   @JSGetter(value = "prevPosX", description = "The previous X position of the entity.")
   public double getDouble_4() {
      return ((Entity)this.i).prevPosX;
   }

   @JSSetter("prevPosX")
   public void initialize_4(double var1) {
      ((Entity)this.i).prevPosX = var1;
   }

   @JSGetter(value = "prevPosY", description = "The previous Y position of the entity.")
   public double getDouble_5() {
      return ((Entity)this.i).prevPosY;
   }

   @JSSetter("prevPosY")
   public void initialize_5(double var1) {
      ((Entity)this.i).prevPosY = var1;
   }

   @JSGetter(value = "prevPosZ", description = "The previous Z position of the entity.")
   public double getDouble_6() {
      return ((Entity)this.i).prevPosZ;
   }

   @JSSetter("prevPosZ")
   public void initialize_6(double var1) {
      ((Entity)this.i).prevPosZ = var1;
   }

   @JSGetter(value = "rotationYaw", description = "The yaw rotation of the entity.")
   public float getFloat() {
      return ((Entity)this.i).rotationYaw;
   }

   @JSSetter("rotationYaw")
   public void initialize_7(float var1) {
      ((Entity)this.i).rotationYaw = var1;
   }

   @JSGetter(value = "rotationPitch", description = "The pitch rotation of the entity.")
   public float getFloat_2() {
      return ((Entity)this.i).rotationPitch;
   }

   @JSSetter("rotationPitch")
   public void initialize_8(float var1) {
      ((Entity)this.i).rotationPitch = var1;
   }

   @JSGetter(value = "prevRotationYaw", description = "The previous yaw rotation of the entity.")
   public float getFloat_3() {
      return ((Entity)this.i).prevRotationYaw;
   }

   @JSSetter("prevRotationYaw")
   public void initialize_9(float var1) {
      ((Entity)this.i).prevRotationYaw = var1;
   }

   @JSGetter(value = "prevRotationPitch", description = "The previous pitch rotation of the entity.")
   public float getFloat_4() {
      return ((Entity)this.i).prevRotationPitch;
   }

   @JSSetter("prevRotationPitch")
   public void initialize_10(float var1) {
      ((Entity)this.i).prevRotationPitch = var1;
   }

   @JSFunction(value = "setPosition", description = "Sets the position and updates its bounding box.")
   public void initialize_11(double var1, double var3, double var5) {
      ((Entity)this.i).setPosition(var1, var3, var5);
   }

   @JSGetter(value = "motionX", description = "The X motion (velocity) of the entity.")
   public double getDouble_7() {
      return ((Entity)this.i).motionX;
   }

   @JSSetter("motionX")
   public void initialize_12(double var1) {
      ((Entity)this.i).motionX = var1;
   }

   @JSGetter(value = "motionY", description = "The Y motion (velocity) of the entity.")
   public double getDouble_8() {
      return ((Entity)this.i).motionY;
   }

   @JSSetter("motionY")
   public void initialize_13(double var1) {
      ((Entity)this.i).motionY = var1;
   }

   @JSGetter(value = "motionZ", description = "The Z motion (velocity) of the entity.")
   public double getDouble_9() {
      return ((Entity)this.i).motionZ;
   }

   @JSSetter("motionZ")
   public void initialize_14(double var1) {
      ((Entity)this.i).motionZ = var1;
   }

   @JSGetter(value = "dimension", description = "The dimension the entity is in: 0 for the Overworld, -1 for the Nether, and 1 for The End")
   public int getValue_2() {
      return ((Entity)this.i).dimension;
   }

   @JSSetter("dimension")
   public void initialize_15(int var1) {
      ((Entity)this.i).dimension = var1;
   }

   @JSGetter(value = "ticksAlive", description = "The amount of ticks the entity has existed.")
   public int getValue_3() {
      return ((Entity)this.i).ticksExisted;
   }

   @JSGetter("onGround")
   public boolean isValid() {
      return ((Entity)this.i).onGround;
   }

   @JSFunction(value = "setOnGround", description = "Sets the entities onGround state.")
   public void initialize_16(boolean var1) {
      ((Entity)this.i).onGround = var1;
   }

   @JSGetter("isDead")
   public boolean isValid_2() {
      return ((Entity)this.i).isDead;
   }

   @JSSetter("isDead")
   public void initialize_17(boolean var1) {
      ((Entity)this.i).isDead = var1;
   }

   @JSFunction(value = "isInWater", returns = "If the entity is in water.")
   public boolean isValid_3() {
      return ((Entity)this.i).isInWater();
   }

   @JSFunction(value = "isWet", returns = "If the entity is wet. LOL")
   public boolean isValid_4() {
      return ((Entity)this.i).isWet();
   }

   @JSFunction(value = "isBurning", returns = "If the entity is burning.")
   public boolean isValid_5() {
      return ((Entity)this.i).isBurning();
   }

   @JSFunction(value = "isRiding", returns = "If the entity is riding something.")
   public boolean isValid_6() {
      return ((Entity)this.i).isRiding();
   }

   @JSFunction(value = "isSneaking", returns = "If the entity is sneaking.")
   public boolean isValid_7() {
      return ((Entity)this.i).isSneaking();
   }

   @JSFunction(value = "setSneaking", description = "Sets the entities sneaking state.")
   public void initialize_18(boolean var1) {
      ((Entity)this.i).setSneaking(var1);
   }

   @JSFunction(value = "isSprinting", returns = "If the entity is sprinting.")
   public boolean isValid_8() {
      return ((Entity)this.i).isSprinting();
   }

   @JSFunction(value = "setSprinting", description = "Sets the entities sprinting state.")
   public void initialize_19(boolean var1) {
      ((Entity)this.i).setSprinting(var1);
   }

   @JSFunction(value = "isEating", returns = "If the entity is eating.")
   public boolean isValid_9() {
      return ((Entity)this.i).isEating();
   }

   @JSFunction(value = "getEntityBoundingBox", returns = "The bounding box of the entity.")
   public WorldUtil2 getHitbox() {
      return Util132.getDataBuilder11_2(((Entity)this.i).getEntityBoundingBox());
   }

   @JSFunction(value = "setEntityBoundingBox", description = "Sets the bounding box of the entity.")
   public void getHitbox_2(WorldUtil2 var1) {
      ((Entity)this.i).setEntityBoundingBox((AxisAlignedBB)var1.b());
   }

   @JSFunction(value = "getCollisionBox", description = "Gets the collision box of the entity.")
   public WorldUtil2 getHitbox_3() {
      return Util132.getDataBuilder11_2(((Entity)this.i).getCollisionBoundingBox());
   }

   @JSGetter(value = "width", description = "The width of the entity.")
   public float getFloat_5() {
      return ((Entity)this.i).width;
   }

   @JSSetter("width")
   public void initialize_20(float var1) {
      ((Entity)this.i).width = var1;
   }

   @JSGetter(value = "height", description = "The height of the entity.")
   public float getFloat_6() {
      return ((Entity)this.i).height;
   }

   @JSSetter("height")
   public void initialize_21(float var1) {
      ((Entity)this.i).height = var1;
   }

   @JSFunction(value = "getLookVec", returns = "A vector in the direction the entity is looking at. Very useful for raytracing.")
   public VecUtil1 getBreezeUtil81_3() {
      return (VecUtil1)VecUtil1.b(((Entity)this.i).getLookVec());
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_B;
   }

   static {
      long var0 = 20957343189251L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u009a\u0013pì¢ËÊ=".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_B = var5;
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
