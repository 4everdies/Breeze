package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;

@ScriptObject(name = "EntityPlayer", description = "A player entity.", superName = "LivingEntity", group = "net/minecraft/client/entity")
public class EntityPlayer extends LivingEntity {
   private static final String CONST_C;

   public EntityPlayer(net.minecraft.entity.player.EntityPlayer var1) {
      super(var1);
   }

   @JSGetter(value = "inventory", description = "The player inventory.")
   public InventoryPlayer getBreezeUtil59() {
      return (InventoryPlayer)InventoryPlayer.c(((net.minecraft.entity.player.EntityPlayer)this.i).inventory);
   }

   @JSGetter(
      value = "chasingPosX",
      description = "The position that the server last reported for this player. Updated every 3 ticks, with the player smoothly moving towards this position over those ticks."
   )
   @Override
   public double getDouble() {
      return ((net.minecraft.entity.player.EntityPlayer)this.i).chasingPosX;
   }

   @JSSetter("chasingPosX")
   @Override
   public void initialize(double var1) {
      ((net.minecraft.entity.player.EntityPlayer)this.i).chasingPosX = var1;
   }

   @JSGetter(
      value = "chasingPosY",
      description = "The position that the server last reported for this player. Updated every 3 ticks, with the player smoothly moving towards this position over those ticks."
   )
   @Override
   public double getDouble_2() {
      return ((net.minecraft.entity.player.EntityPlayer)this.i).chasingPosY;
   }

   @JSSetter("chasingPosY")
   @Override
   public void initialize_2(double var1) {
      ((net.minecraft.entity.player.EntityPlayer)this.i).chasingPosY = var1;
   }

   @JSGetter(
      value = "chasingPosZ",
      description = "The position that the server last reported for this player. Updated every 3 ticks, with the player smoothly moving towards this position over those ticks."
   )
   @Override
   public double getDouble_3() {
      return ((net.minecraft.entity.player.EntityPlayer)this.i).chasingPosZ;
   }

   @JSSetter("chasingPosZ")
   @Override
   public void initialize_3(double var1) {
      ((net.minecraft.entity.player.EntityPlayer)this.i).chasingPosZ = var1;
   }

   @JSGetter(value = "prevChasingPosX", description = "The previous position that the server last reported for this player.")
   @Override
   public double getDouble_4() {
      return ((net.minecraft.entity.player.EntityPlayer)this.i).prevChasingPosX;
   }

   @JSSetter("prevChasingPosX")
   @Override
   public void initialize_4(double var1) {
      ((net.minecraft.entity.player.EntityPlayer)this.i).prevChasingPosX = var1;
   }

   @JSGetter(value = "prevChasingPosY", description = "The previous position that the server last reported for this player.")
   @Override
   public double getDouble_5() {
      return ((net.minecraft.entity.player.EntityPlayer)this.i).prevChasingPosY;
   }

   @JSSetter("prevChasingPosY")
   @Override
   public void initialize_5(double var1) {
      ((net.minecraft.entity.player.EntityPlayer)this.i).prevChasingPosY = var1;
   }

   @JSGetter(value = "prevChasingPosZ", description = "The previous position that the server last reported for this player.")
   @Override
   public double getDouble_6() {
      return ((net.minecraft.entity.player.EntityPlayer)this.i).prevChasingPosZ;
   }

   @JSSetter("prevChasingPosZ")
   @Override
   public void initialize_6(double var1) {
      ((net.minecraft.entity.player.EntityPlayer)this.i).prevChasingPosZ = var1;
   }

   @JSFunction(value = "getName", returns = "The name of the player.")
   public String getString() {
      return ((net.minecraft.entity.player.EntityPlayer)this.i).getGameProfile().getName();
   }

   @JSFunction(value = "getUUID", returns = "The players UUID as string")
   public String getString_2() {
      return ((net.minecraft.entity.player.EntityPlayer)this.i).getGameProfile().getId().toString();
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_C;
   }

   static {
      long var0 = 14576446000411L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("7Y< \u009bXP¯ÚíÄ¡\u0099\u0080Ï#".getBytes("ISO-8859-1"));
      String var5 = buildString(var4).intern();
      byte var10001 = -1;
      CONST_C = var5;
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
