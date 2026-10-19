package rip.breeze;

import net.minecraft.entity.EntityLivingBase;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;

@ScriptObject(name = "LivingEntity", description = "Living entity.", superName = "Entity", group = "net/minecraft/entity")
public class LivingEntity extends RotationUtils {
   public LivingEntity(EntityLivingBase var1) {
      super(var1);
   }

   @JSFunction(value = "getHealth", returns = "The current health of the entity.")
   public float getAngle() {
      return ((EntityLivingBase)this.i).getHealth();
   }

   @JSFunction(value = "heal", params = "The amount of health to heal.", description = "Heals the entity by the specified amount of health.")
   public void updateRotation(float var1) {
      ((EntityLivingBase)this.i).heal(var1);
   }

   @JSFunction(value = "getMaxHealth", returns = "The maximum health of the entity.")
   public float getAngle_2() {
      return ((EntityLivingBase)this.i).getMaxHealth();
   }

   @JSFunction(
      value = "setHealth",
      params = "The amount of health to set the entity to.",
      description = "Sets the health of the entity to the specified amount of health."
   )
   public void updateRotation_2(float var1) {
      ((EntityLivingBase)this.i).setHealth(var1);
   }

   @JSGetter(value = "hurtTime", description = "The hurt time in ticks.")
   @Override
   public int getValue() {
      return ((EntityLivingBase)this.i).hurtTime;
   }

   @JSSetter("hurtTime")
   public void initialize(int var1) {
      ((EntityLivingBase)this.i).hurtTime = var1;
   }

   @JSFunction(value = "getHeldItem", returns = "The item the entity is currently holding.")
   public ItemStack getHeldItem() {
      return StringBuilderUtil.getDataBuilder12(((EntityLivingBase)this.i).getHeldItem());
   }
}
