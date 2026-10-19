package rip.breeze.client;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import rip.breeze.StringDecryptor;

public class EntityUtil4 {
   private static boolean fieldBool_b;

   public static float getFloat(ItemStack var0) {
      return var0.getMaxDamage();
   }

   public static float calculateFloat(ItemStack var0) {
      return EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, var0) / 4.0F
         + EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, var0) / 10.0F;
   }

   public static float calculateFloat_2(ItemStack var0) {
      return EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, var0) / 5.0F;
   }

   public static float calculateFloat_3(ItemStack var0) {
      return EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, var0) / 5.0F;
   }

   public static float calculateFloat_4(ItemStack var0) {
      return EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, var0) / 5.0F;
   }

   public static float calculateFloat_5(ItemStack var0) {
      return EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, var0) / 5.0F
         + EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, var0) / 5.0F
         + EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, var0)
         + EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, var0) / 10.0F;
   }

   public static boolean isValid(ItemStack var0, ItemStack var1) {
      long var2 = 110094317458304L;
      return ((ItemArmor)var0.getItem()).damageReduceAmount * 0.08F + EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, var0) * 0.04F
         < ((ItemArmor)var1.getItem()).damageReduceAmount * 0.08F + EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, var1) * 0.04F;
   }

   public static boolean checkCondition(ItemStack var0, ItemStack var1) {
      long var2 = 39165262262932L;
      float var4 = ((ItemTool)var0.getItem()).getToolMaterial().getEfficiencyOnProperMaterial()
         + EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, var0);
      float var5 = ((ItemTool)var1.getItem()).getToolMaterial().getEfficiencyOnProperMaterial()
         + EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, var1);
      return var4 != var5 ? var4 < var5 : getFloat(var0) < getFloat(var1);
   }

   public static boolean isValid_2(ItemStack var0, ItemStack var1) {
      long var2 = 14705039237985L;
      return MinecraftAccessor.getFloat_5((ItemSword)var0.getItem()) + EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, var0) * 1.25
         < MinecraftAccessor.getFloat_5((ItemSword)var1.getItem()) + EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, var1) * 1.25;
   }

   public static boolean isValid_3(ItemStack var0, ItemStack var1) {
      long var2 = 96624005332186L;
      return calculateFloat_4(var0) < calculateFloat_4(var1);
   }

   public static boolean isValid_4(ItemStack var0, ItemStack var1) {
      long var2 = 89421853737766L;
      return calculateFloat_5(var0) < calculateFloat_5(var1);
   }

   public static Util56 getClientUtil127(ContainerChest var0) {
      long var1 = 138664743165729L;
      ItemStack var3 = null;
      boolean var10000 = BlockUtil7.checkCondition();
      int var4 = 9;
      boolean var5 = var10000;

      while (var4 < 45) {
         Slot var6 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var4);
         if (var6.getHasStack()) {
            ItemStack var7 = var6.getStack();
            if (var7.getItem() instanceof ItemSword && (var3 == null || isValid_2(var3, var7))) {
               var3 = var7;
            }
         }

         var4++;
         if (var5) {
            break;
         }
      }

      Util56 var8 = null;
      int var9 = 0;

      while (var9 < var0.getLowerChestInventory().func_70302_i_()) {
         ItemStack var10 = var0.getLowerChestInventory().getStackInSlot(var9);
         if (var10 != null
            && var10.getItem() instanceof ItemSword
            && (var8 == null || isValid_2(var8.itemStack_a, var10))
            && (var3 == null || isValid_2(var3, var10))) {
            var8 = new Util56(var10, var9);
         }

         var9++;
         if (var5) {
            break;
         }
      }

      return var8;
   }

   public static Util56 getClientUtil127_2(ContainerChest var0) {
      long var1 = 45216317015301L;
      boolean var10000 = BlockUtil7.checkCondition();
      ItemStack var3 = null;
      int var4 = 9;
      boolean var5 = var10000;

      while (var4 < 45) {
         Slot var6 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var4);
         if (var6.getHasStack()) {
            ItemStack var7 = var6.getStack();
            if (var7.getItem() instanceof ItemPickaxe && (var3 == null || checkCondition(var3, var7))) {
               var3 = var7;
            }
         }

         var4++;
         if (var5) {
            break;
         }
      }

      Util56 var8 = null;
      int var9 = 0;

      while (var9 < var0.getLowerChestInventory().func_70302_i_()) {
         ItemStack var10 = var0.getLowerChestInventory().getStackInSlot(var9);
         if (var10 != null
            && var10.getItem() instanceof ItemPickaxe
            && (var8 == null || checkCondition(var8.itemStack_a, var10))
            && (var3 == null || checkCondition(var3, var10))) {
            var8 = new Util56(var10, var9);
         }

         var9++;
         if (var5) {
            break;
         }
      }

      return var8;
   }

   public static Util56 getClientUtil127_3(ContainerChest var0) {
      long var1 = 91337908996580L;
      boolean var10000 = BlockUtil7.isValid();
      ItemStack var3 = null;
      boolean var4 = var10000;
      int var5 = 9;

      while (var5 < 45) {
         Slot var6 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var5);
         if (var6.getHasStack()) {
            ItemStack var7 = var6.getStack();
            if (var7.getItem() instanceof ItemAxe && (var3 == null || checkCondition(var3, var7))) {
               var3 = var7;
            }
         }

         var5++;
         if (!var4) {
            break;
         }
      }

      Util56 var8 = null;
      int var9 = 0;

      while (var9 < var0.getLowerChestInventory().func_70302_i_()) {
         ItemStack var10 = var0.getLowerChestInventory().getStackInSlot(var9);
         if (var10 != null
            && var10.getItem() instanceof ItemAxe
            && (var8 == null || checkCondition(var8.itemStack_a, var10))
            && (var3 == null || checkCondition(var3, var10))) {
            var8 = new Util56(var10, var9);
         }

         var9++;
         if (!var4) {
            break;
         }
      }

      return var8;
   }

   public static Util56 getClientUtil127_4(ContainerChest var0, EnumType5 var1) {
      long var2 = 72441866649273L;
      boolean var10000 = BlockUtil7.checkCondition();
      ItemStack var4 = null;
      boolean var5 = var10000;
      int var6 = 5;

      while (var6 < 9) {
         ItemStack var7 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var6).getStack();
         if (var7 != null) {
            EnumType5 var8 = getEnum4Val3(var7);
            if (var8 != null && var8 == var1 && (var4 == null || isValid(var7, var4))) {
               var4 = var7;
            }
         }

         var6++;
         if (var5) {
            break;
         }
      }

      var6 = 9;

      while (var6 < 45) {
         Slot var12 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var6);
         if (var12.getHasStack()) {
            ItemStack var14 = var12.getStack();
            EnumType5 var9 = getEnum4Val3(var14);
            if (var9 != null && var9 == var1 && (var4 == null || isValid(var14, var4))) {
               var4 = var14;
            }
         }

         var6++;
         if (var5) {
            break;
         }
      }

      Util56 var11 = null;
      int var13 = 0;

      while (var13 < var0.getLowerChestInventory().func_70302_i_()) {
         ItemStack var15 = var0.getLowerChestInventory().getStackInSlot(var13);
         if (var15 != null) {
            EnumType5 var16 = getEnum4Val3(var15);
            if (var16 != null && var16 == var1 && (var11 == null || isValid(var11.itemStack_a, var15)) && (var4 == null || isValid(var4, var15))) {
               var11 = new Util56(var15, var13);
            }
         }

         var13++;
         if (var5) {
            break;
         }
      }

      return var11;
   }

   public static EnumType5 getEnum4Val3(ItemStack var0) {
      return getEnum4Val3_2(var0.getItem());
   }

   public static EnumType5 getEnum4Val3_2(Item var0) {
      long var1 = 133917110700232L;
      if (var0.equals(Items.diamond_helmet)
         || var0.equals(Items.golden_helmet)
         || var0.equals(Items.iron_helmet)
         || var0.equals(Items.chainmail_helmet)
         || var0.equals(Items.leather_helmet)) {
         return EnumType5.Helmet;
      } else if (var0.equals(Items.diamond_chestplate)
         || var0.equals(Items.golden_chestplate)
         || var0.equals(Items.iron_chestplate)
         || var0.equals(Items.chainmail_chestplate)
         || var0.equals(Items.leather_chestplate)) {
         return EnumType5.Chestplate;
      } else if (var0.equals(Items.diamond_leggings)
         || var0.equals(Items.golden_leggings)
         || var0.equals(Items.iron_leggings)
         || var0.equals(Items.chainmail_leggings)
         || var0.equals(Items.leather_leggings)) {
         return EnumType5.Leggings;
      } else {
         return !var0.equals(Items.diamond_boots)
               && !var0.equals(Items.golden_boots)
               && !var0.equals(Items.iron_boots)
               && !var0.equals(Items.chainmail_boots)
               && !var0.equals(Items.leather_boots)
            ? null
            : EnumType5.Boots;
      }
   }

   public static ArrayList<Item> getArrayList() {
      return IntStream.range(9, 45)
         .mapToObj(EntityUtil4::lambda$inventoryItems_Inner0)
         .filter(Slot::func_75216_d)
         .map(Slot::func_75211_c)
         .<Item>map(ItemStack::func_77973_b)
         .collect(Collectors.toCollection(ArrayList::new));
   }

   private static Slot lambda$inventoryItems_Inner0(int var0) {
      return BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var0);
   }

   public static void toggle(boolean var0) {
      fieldBool_b = var0;
   }

   public static boolean isValid_5() {
      return fieldBool_b;
   }

   public static boolean checkCondition_2() {
      boolean var0 = isValid_5();
      return !var0;
   }

   static {
      if (!checkCondition_2()) {
         toggle(true);
      }
   }
}
