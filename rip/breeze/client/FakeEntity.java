package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;
import net.minecraft.world.World;
import rip.breeze.StringDecryptor;

class FakeEntity extends EntityLivingBase {
   private MovementInput movementInput_a;
   final Freecam freecam_b;

   public FakeEntity(Freecam var1, World var2) {
      super(var2);
      this.freecam_b = var1;
      this.movementInput_a = new MovementInputFromOptions(BreezeClient.CONST_A.gameSettings);
   }

   public ItemStack func_70694_bm() {
      return null;
   }

   public ItemStack func_71124_b(int var1) {
      return null;
   }

   public ItemStack func_82169_q(int var1) {
      return null;
   }

   public void func_70062_b(int var1, ItemStack var2) {
   }

   public ItemStack[] func_70035_c() {
      return new ItemStack[0];
   }

   public void applyRotation(double var1, double var3, double var5, float var7, float var8) {
      this.lastTickPosX = this.prevPosX = this.posX = var1;
      this.lastTickPosY = this.prevPosY = this.posY = var3;
      this.lastTickPosZ = this.prevPosZ = this.posZ = var5;
      this.rotationYaw = var7;
      this.rotationPitch = var8;
      this.setPosition(this.posX, this.posY, this.posZ);
   }

   public void calculate(double var1) {
      float var5;
      float var7;
      float var8;
      long var3 = 20468808983914L;
      int var10000 = AntiBot.getValue();
      this.movementInput_a.updatePlayerMoveState();
      var5 = this.movementInput_a.moveForward;
      int var6 = var10000;
      var7 = this.movementInput_a.moveStrafe;
      this.prevPosX = this.posX;
      this.prevPosY = this.posY;
      this.prevPosZ = this.posZ;
      this.prevRotationPitch = this.rotationPitch;
      this.prevRotationYaw = this.rotationYaw;
      this.lastTickPosY = this.posY;
      this.lastTickPosX = this.posX;
      this.lastTickPosZ = this.posZ;
      var8 = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks;
      label43:
      if (var5 != 0.0F) {
         label41: {
            if (var7 > 0.0F) {
               var8 += var5 > 0.0F ? -45 : 45;
               if (var6 == 0) {
                  break label41;
               }
            }

            if (var7 < 0.0F) {
               var8 += var5 > 0.0F ? 45 : -45;
            }
         }

         var7 = 0.0F;
         if (var5 > 0.0F) {
            var5 = 1.0F;
            if (var6 == 0) {
               break label43;
            }
         }

         if (var5 < 0.0F) {
            var5 = -1.0F;
         }
      }

      double var9 = Math.sin(Math.toRadians(var8 + 90.0F));
      double var11 = Math.cos(Math.toRadians(var8 + 90.0F));
      double var13 = var5 * var1 * var11 + var7 * var1 * var9;
      double var15 = var5 * var1 * var9 - var7 * var1 * var11;
      double var17 = 0.0;
      if (this.movementInput_a.jump) {
         var17++;
      }

      if (this.movementInput_a.sneak) {
         var17--;
      }

      this.setPosition(this.posX + var13, this.posY + var17, this.posZ + var15);
   }

   public void calculate_2(float var1, float var2) {
      float var3 = this.rotationPitch;
      float var4 = this.rotationYaw;
      this.rotationYaw = (float)(this.rotationYaw + var1 * 0.15);
      this.rotationPitch = (float)(this.rotationPitch - var2 * 0.15);
      this.rotationPitch = MathHelper.clamp_float(this.rotationPitch, -90.0F, 90.0F);
      this.prevRotationPitch = this.prevRotationPitch + (this.rotationPitch - var3);
      this.prevRotationYaw = this.prevRotationYaw + (this.rotationYaw - var4);
   }
}
