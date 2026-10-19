package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.init.Items;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemFireball;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import net.minecraft.potion.PotionEffect;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.KeyBind;
import rip.breeze.LicenseState;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;
import rip.breeze.WorldUtil6;

@ModuleInfo(
   a = "InventoryManager",
   b = "Automatically sorts your inventory.",
   d = rip.breeze.ModuleCategory.MISC,
   c = {"inventory", "sort", "sortinventory", "items", "invmanager"}
)
public class InventoryManager extends BreezeModule {
   private final GenericSetting<Boolean> hotbarSetting;
   private final GenericSetting<rip.breeze.SkinLoader> inventorySlotsSetting;
   private final GenericSetting<Boolean> armorSetting;
   private final GenericSetting<Boolean> delaySetting;
   private final GenericSetting<rip.breeze.RangeValue> throwJunkSetting;
   private final GenericSetting<Boolean> toggleModeSetting;
   private final GenericSetting<EnumType4> bindSetting;
   private final GenericSetting<KeyBind> initialDelaySetting;
   private final GenericSetting<Integer> dataBuilder54_v;
   private final Util133 dataBuilder112_w;
   private float fieldFloat_x;
   private boolean fieldBool_y;
   private boolean fieldBool_z;
   private int fieldInt_A;
   private boolean fieldBool_B;
   private final WorldUtil6[] arr_C;
   private static final int CONST_D = 1;
   private static final int CONST_E;
   private static final int CONST_F;
   private static final String[] CONST_H;
   private static final String[] CONST_I;
   private static final Map CONST_J = new HashMap(13);

   public InventoryManager() {
      long var1 = 36004900919233L;
      super(false, false);
      int var10000 = AntiBot.getValue_2();
      short var10003 = 179;
      long var10004 = 8665490061115825289L ^ var1;
      rip.breeze.BlockUtil10 var10002 = GenericSetting.getDataBuilder50(this, "Hotbar");
      var10003 = 24949;
      var10004 = 101128926922276186L ^ var1;
      this.hotbarSetting = var10002.getDataBuilder50_3("Whether or not to move items to your hotbar.").getDataBuilder50_4(true).getDataBuilder54();
      var10003 = 11277;
      var10004 = 1224851721206706217L ^ var1;
      var10002 = GenericSetting.getDataBuilder50(this, "InventorySlots");
      var10003 = 1477;
      var10004 = 1880917420796287468L ^ var1;
      this.inventorySlotsSetting = var10002.getDataBuilder50_3("Where to put the items in your hotbar.")
         .getDataBuilder50_4(new rip.breeze.SkinLoader())
         .getDataBuilder50_9(InventoryManager::lambda$new_Inner0)
         .getDataBuilder54();
      var10003 = 22466;
      var10004 = 7237543507167005678L ^ var1;
      var10002 = GenericSetting.getDataBuilder50(this, "Packs hotbar items to the left, skipping any slot whose primary and backups have no available item.");
      var10003 = 29729;
      var10004 = 1435698073381890049L ^ var1;
      this.armorSetting = var10002.getDataBuilder50_3("Armor").getDataBuilder50_4(false).getDataBuilder50_9(InventoryManager::lambda$new_Inner1).getDataBuilder54();
      var10003 = 14947;
      var10004 = 5055864130644616776L ^ var1;
      var10002 = GenericSetting.getDataBuilder50(this, "Delay");
      var10003 = 6464;
      var10004 = 6743828115198838119L ^ var1;
      this.delaySetting = var10002.getDataBuilder50_3("The delay in between moving each item, in milliseconds.").getDataBuilder50_4(true).getDataBuilder54();
      int var3 = var10000;
      short var9 = 28596;
      long var23 = 217162957539275669L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "ThrowJunk");
      short var10 = 24037;
      long var24 = 6745238214881821126L ^ var1;
      this.throwJunkSetting = var10001.getDataBuilder50_3("Whether or not to throw out junk items.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(200.0))
         .clamp(rip.breeze.RangeValue.getPredicate(50.0, 750.0, 5.0))
         .getDataBuilder54();
      short var11 = 16900;
      long var25 = 5014513589894864444L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "ToggleMode");
      short var12 = 23859;
      long var26 = 6685276677121196298L ^ var1;
      this.toggleModeSetting = var10001.getDataBuilder50_3("When to start sorting the inventory.").getDataBuilder50_4(true).getDataBuilder54();
      short var13 = 5319;
      long var27 = 7407210954302753001L ^ var1;
      var10001 = GenericSetting.<EnumType4>getDataBuilder50(this, "Bind").getDataBuilder50_4(EnumType4.IMMEDIATE);
      short var14 = 3611;
      long var28 = 8439138404621455934L ^ var1;
      this.bindSetting = var10001.getDataBuilder50_3("The keybind to start sorting the inventory.").getDataBuilder54();
      short var15 = 8092;
      long var29 = 3311536148174963633L ^ var1;
      this.initialDelaySetting = GenericSetting.<KeyBind>getDataBuilder50(this, "InitialDelay")
         .getDataBuilder50_4(KeyBind.CONST_G)
         .getDataBuilder50_3("The keybind to start sorting the inventory.")
         .getDataBuilder50_9(InventoryManager::lambda$new_Inner2)
         .getDataBuilder54();
      this.dataBuilder54_v = GenericSetting.<Integer>getDataBuilder50(this, "InitialDelay")
         .getDataBuilder50_4(1000)
         .clamp(rip.breeze.RenderUtil27.getPredicate(0, 10000, 50))
         .getDataBuilder50_9(InventoryManager::lambda$new_Inner3)
         .getDataBuilder54();
      this.dataBuilder112_w = new Util133();
      this.fieldFloat_x = 100.0F;
      this.fieldBool_y = true;
      this.fieldBool_z = false;
      this.fieldInt_A = 0;
      this.fieldBool_B = false;
      this.arr_C = new WorldUtil6[9];
      if (var3 == 0) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   @EventListener
   public void getHeldItem(RunGameLoopEventEvent var1) {
      long var2 = 115053579631875L;
      int var4 = AntiBot.getValue_2();
      if (BreezeClient.CONST_A.thePlayer == null || BreezeClient.CONST_A.theWorld == null) {
         this.fieldBool_y = true;
         this.dataBuilder112_w.getDataBuilder112();
         this.fieldBool_z = true;
      } else if (!(BreezeClient.CONST_A.currentScreen instanceof GuiInventory)) {
         this.fieldBool_y = true;
         this.dataBuilder112_w.getDataBuilder112();
         this.fieldBool_z = true;
         this.fieldBool_B = false;
      } else {
         switch (WorldUtil3.CONST_A[this.bindSetting.getObject_m().ordinal()]) {
            case 1:
               this.fieldBool_B = true;
               if (var4 != 0) {
                  break;
               }
            case 2:
               if (this.fieldBool_B) {
                  break;
               }

               this.fieldBool_B = this.dataBuilder112_w.isValid(this.dataBuilder54_v.getObject_m().intValue());
               if (var4 != 0) {
                  break;
               }
            case 3:
               this.fieldBool_B = this.initialDelaySetting.getObject_m().checkCondition();
               if (var4 != 0) {
                  break;
               }
            case 4:
               if (!this.fieldBool_B) {
                  this.fieldBool_B = this.initialDelaySetting.getObject_m().checkCondition();
               }
         }

         if (this.fieldBool_B && this.dataBuilder112_w.isValid((int)this.fieldFloat_x) && !this.fieldBool_z) {
            this.clamp();
            if (BreezeClient.CONST_A.thePlayer.inventory.getItemStack() != null) {
               label192: {
                  int var13 = this.getValue_2(BreezeClient.CONST_A.thePlayer.inventory.getItemStack());
                  if (var13 == -1) {
                     BreezeClient.CONST_A.playerController.windowClick(0, -999, 0, 0, BreezeClient.CONST_A.thePlayer);
                     if (var4 != 0) {
                        break label192;
                     }
                  }

                  if (var13 == -2) {
                     return;
                  }

                  BreezeClient.CONST_A
                     .playerController
                     .windowClick(BreezeClient.CONST_A.thePlayer.inventoryContainer.windowId, var13, 0, 0, BreezeClient.CONST_A.thePlayer);
               }

               this.calculate();
            } else {
               if (this.delaySetting.getObject_m()) {
                  int var5 = 5;

                  while (var5 < 9) {
                     ItemStack var6 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var5).getStack();
                     if (var6 == null || var4 == 0) {
                        EnumType5 var7 = null;
                        switch (var5) {
                           case 5:
                              var7 = EnumType5.Helmet;
                              break;
                           case 6:
                              var7 = EnumType5.Chestplate;
                              break;
                           case 7:
                              var7 = EnumType5.Leggings;
                              break;
                           case 8:
                              var7 = EnumType5.Boots;
                        }

                        int var8 = this.calculate_4(var7);
                        if (var8 != -1) {
                           BreezeClient.CONST_A
                              .playerController
                              .windowClick(BreezeClient.CONST_A.thePlayer.inventoryContainer.windowId, var8, 0, 1, BreezeClient.CONST_A.thePlayer);
                           this.calculate();
                           return;
                        }
                     }

                     var5++;
                     if (var4 == 0) {
                        break;
                     }
                  }
               }

               if (this.hotbarSetting.getObject_m()) {
                  int var9 = 0;

                  while (var9 < 9) {
                     int var14 = this.calculate_2(var9, false);
                     if (var14 != -1 || var4 == 0) {
                        BreezeClient.CONST_A
                           .playerController
                           .windowClick(BreezeClient.CONST_A.thePlayer.inventoryContainer.windowId, var14, var9, 2, BreezeClient.CONST_A.thePlayer);
                        this.calculate();
                        return;
                     }

                     var9++;
                     if (var4 == 0) {
                        break;
                     }
                  }
               }

               if (this.delaySetting.getObject_m()) {
                  int var10 = 5;

                  while (var10 < 9) {
                     ItemStack var15 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var10).getStack();
                     if ((var15 != null || var4 == 0) && (!this.checkCondition_4(var15) || var4 == 0)) {
                        EnumType5 var17 = null;
                        switch (var10) {
                           case 5:
                              var17 = EnumType5.Helmet;
                              break;
                           case 6:
                              var17 = EnumType5.Chestplate;
                              break;
                           case 7:
                              var17 = EnumType5.Leggings;
                              break;
                           case 8:
                              var17 = EnumType5.Boots;
                        }

                        int var18 = this.calculate_4(var17);
                        if (var18 != -1) {
                           BreezeClient.CONST_A
                              .playerController
                              .windowClick(BreezeClient.CONST_A.thePlayer.inventoryContainer.windowId, var18, 0, 0, BreezeClient.CONST_A.thePlayer);
                           this.calculate();
                           return;
                        }
                     }

                     var10++;
                     if (var4 == 0) {
                        break;
                     }
                  }
               }

               if (this.hotbarSetting.getObject_m()) {
                  int var11 = 0;

                  while (var11 < 9) {
                     int var16 = this.calculate_2(var11, true);
                     if (var16 != -1 || var4 == 0) {
                        if (this.checkCondition_2(
                           BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var16).getStack(),
                           BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var11 + 36).getStack()
                        )) {
                           BreezeClient.CONST_A
                              .playerController
                              .windowClick(BreezeClient.CONST_A.thePlayer.inventoryContainer.windowId, var16, 0, 1, BreezeClient.CONST_A.thePlayer);
                           return;
                        }

                        BreezeClient.CONST_A
                           .playerController
                           .windowClick(BreezeClient.CONST_A.thePlayer.inventoryContainer.windowId, var16, var11, 2, BreezeClient.CONST_A.thePlayer);
                        this.calculate();
                        return;
                     }

                     var11++;
                     if (var4 == 0) {
                        break;
                     }
                  }
               }

               if (this.toggleModeSetting.getObject_m()) {
                  int var12 = this.getValue();
                  if (var12 != -1) {
                     BreezeClient.CONST_A
                        .playerController
                        .windowClick(BreezeClient.CONST_A.thePlayer.inventoryContainer.windowId, var12, 1, 4, BreezeClient.CONST_A.thePlayer);
                     this.calculate();
                  } else {
                     this.fieldBool_y = true;
                     if (this.fieldInt_A > 3) {
                        this.fieldInt_A = 0;
                        if (var4 != 0) {
                           return;
                        }
                     }

                     this.fieldInt_A = 0;
                  }
               }
            }
         }
      }
   }

   @EventListener
   public void toggle(PacketSendEventEvent var1) {
      long var2 = 122281229653765L;
      if (var1.packet_h instanceof C0FPacketConfirmTransaction || var1.packet_h instanceof C00PacketKeepAlive) {
         this.fieldBool_z = false;
      }

      if (var1.packet_h instanceof C03PacketPlayer) {
         this.fieldBool_z = true;
      }

      if (var1.packet_h instanceof C0EPacketClickWindow) {
         this.fieldBool_z = true;
      }
   }

   private void calculate() {
      this.fieldInt_A++;
      this.fieldBool_y = false;
      this.fieldFloat_x = (float)this.throwJunkSetting.getObject_m().calculateDouble_2();
      this.dataBuilder112_w.getDataBuilder112();
   }

   private int getValue() {
      long var1 = 58616265090766L;
      int var10000 = AntiBot.getValue();
      int var3 = 9;
      int var4 = var10000;

      while (var3 < 45) {
         ItemStack var5 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var3).getStack();
         if (var5 != null || var4 != 0) {
            if (var5.getItem() instanceof ItemArmor) {
               if (!this.checkCondition_4(var5)) {
                  return var3;
               }
            } else if (var5.getItem() instanceof ItemSword) {
               if (!this.checkCondition_5(var5)) {
                  return var3;
               }
            } else if (var5.getItem() instanceof ItemPickaxe) {
               if (!this.checkCondition_6(var5)) {
                  return var3;
               }
            } else if (var5.getItem() instanceof ItemAxe) {
               if (!this.checkCondition_7(var5)) {
                  return var3;
               }
            } else if (var5.getItem() instanceof ItemBow) {
               if (!this.checkCondition_8(var5)) {
                  return var3;
               }
            } else if (var5.getItem() instanceof ItemFishingRod && !this.checkCondition_9(var5)) {
               return var3;
            }
         }

         var3++;
         if (var4 != 0) {
            break;
         }
      }

      return -1;
   }

   private int calculate_2(int var1, boolean var2) {
      long var3 = 66216649231984L;
      WorldUtil6 var5 = this.arr_C[var1];
      if (var5 == WorldUtil6.EMPTY) {
         return -1;
      }

      ItemStack var6 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var1 + 36).getStack();
      switch (WorldUtil3.CONST_B[var5.ordinal()]) {
         case 1:
            if (var6 != null && var6.getItem() instanceof ItemSword && !var2) {
               return -1;
            }

            return this.getValue_3(var6);
         case 2:
            if (var6 != null && var6.getItem() instanceof ItemPickaxe && !var2) {
               return -1;
            }

            return this.getValue_4(var6);
         case 3:
            if (var6 != null && var6.getItem() instanceof ItemAxe && !var2) {
               return -1;
            }

            return this.getValue_5(var6);
         case 4:
            if (var6 != null && var6.getItem() instanceof ItemFishingRod && !var2) {
               return -1;
            }

            return this.getValue_7(var6);
         case 5:
            if (var6 != null && var6.getItem() instanceof ItemBow && !var2) {
               return -1;
            }

            return this.getValue_6(var6);
         case 6:
            if (var6 != null && var6.getItem() instanceof ItemShears && !var2) {
               return -1;
            }

            return this.calculate_9(var6);
         case 7:
            if (var6 != null && var6.getItem() instanceof ItemBlock && !var2) {
               return -1;
            }

            return this.calculate_5(var6);
         case 8:
            if (var6 != null && var6.getItem() instanceof ItemFood && !var2) {
               return -1;
            }

            return this.getValue_9(var6);
         case 9:
            if (var6 != null && var6.getItem() == Items.golden_apple && !var2) {
               return -1;
            }

            return this.calculate_6(var6);
         case 10:
            return var6 != null && (var6.getItem() instanceof ItemSnowball || var6.getItem() instanceof ItemEgg) && !var2 ? -1 : this.getValue_8(var6);
         case 11:
            if (var6 != null && var6.getItem() == Items.ender_pearl && !var2) {
               return -1;
            }

            return this.calculate_8(var6);
         case 12:
            if (var6 != null && var6.getItem() == Items.fire_charge && !var2) {
               return -1;
            }

            return this.calculate_7(var6);
         case 13:
            if (var6 != null && this.getEffects(var6, 1) && !var2) {
               return -1;
            }

            return this.calculate_10(var6, 1, WorldUtil6.POTION_SPEED);
         case 14:
            if (var6 != null && this.getEffects(var6, 6) && !var2) {
               return -1;
            }

            return this.calculate_10(var6, 6, WorldUtil6.POTION_HEAL);
         case 15:
            if (var6 != null && this.getEffects(var6, 5) && !var2) {
               return -1;
            }

            return this.calculate_10(var6, 5, WorldUtil6.POTION_STRENGTH);
         default:
            return -1;
      }
   }

   private int getValue_2(ItemStack var1) {
      long var2 = 129821626220692L;
      int var10000 = AntiBot.getValue();
      Item var4 = var1.getItem();
      int var5 = var10000;
      if (var4 instanceof ItemArmor && this.delaySetting.getObject_m()) {
         if (!this.checkCondition_4(var1)) {
            return this.fieldBool_y ? -2 : this.getValue_10(var1);
         }

         switch (WorldUtil3.CONST_C[EntityUtil4.getEnum4Val3(var1).ordinal()]) {
            case 1:
               return 5;
            case 2:
               return 6;
            case 3:
               return 7;
            case 4:
               return 8;
         }

         if (var5 == 0) {
            return this.fieldBool_y ? -2 : this.getValue_10(var1);
         }
      }

      if (!this.hotbarSetting.getObject_m()) {
         return -2;
      }

      if (var4 instanceof ItemBlock && !BlockUtil6.CONST_A.contains(((ItemBlock)var4).getBlock())) {
         return this.calculate_3(var1);
      }

      if (var4 instanceof ItemSword) {
         int var16 = this.calculate_13(WorldUtil6.SWORD);
         if (var16 == -1) {
            return this.fieldBool_y ? -2 : this.getValue_10(var1);
         } else if (this.checkCondition_5(var1)) {
            return var16;
         } else if (this.toggleModeSetting.getObject_m()) {
            return -1;
         } else {
            return this.fieldBool_y ? -2 : this.calculate_12();
         }
      } else if (var4 instanceof ItemPickaxe) {
         int var15 = this.calculate_13(WorldUtil6.PICKAXE);
         if (var15 == -1) {
            return this.fieldBool_y ? -2 : this.calculate_12();
         } else if (this.checkCondition_6(var1)) {
            return var15;
         } else if (this.toggleModeSetting.getObject_m()) {
            return -1;
         } else {
            return this.fieldBool_y ? -2 : this.calculate_12();
         }
      } else if (var4 instanceof ItemAxe) {
         int var14 = this.calculate_13(WorldUtil6.AXE);
         if (var14 == -1) {
            return this.fieldBool_y ? -2 : this.calculate_12();
         } else if (this.checkCondition_7(var1)) {
            return var14;
         } else if (this.toggleModeSetting.getObject_m()) {
            return -1;
         } else {
            return this.fieldBool_y ? -2 : this.calculate_12();
         }
      } else if (var4 instanceof ItemBow) {
         int var13 = this.calculate_13(WorldUtil6.BOW);
         if (var13 == -1) {
            return this.fieldBool_y ? -2 : this.calculate_12();
         } else if (this.checkCondition_8(var1)) {
            return var13;
         } else if (this.toggleModeSetting.getObject_m()) {
            return -1;
         } else {
            return this.fieldBool_y ? -2 : this.calculate_12();
         }
      } else if (var4 instanceof ItemFishingRod) {
         int var12 = this.calculate_13(WorldUtil6.ROD);
         if (var12 == -1) {
            return this.fieldBool_y ? -2 : this.calculate_12();
         } else if (this.checkCondition_9(var1)) {
            return var12;
         } else if (this.toggleModeSetting.getObject_m()) {
            return -1;
         } else {
            return this.fieldBool_y ? -2 : this.calculate_12();
         }
      } else if (var4 instanceof ItemShears) {
         int var11 = this.calculate_13(WorldUtil6.SHEARS);
         if (var11 == -1) {
            return this.fieldBool_y ? -2 : this.calculate_12();
         } else if (this.checkCondition_10(var1)) {
            return var11;
         } else if (this.toggleModeSetting.getObject_m()) {
            return -1;
         } else {
            return this.fieldBool_y ? -2 : this.calculate_12();
         }
      } else if (var4 instanceof ItemEnderPearl) {
         int var10 = this.calculate_13(WorldUtil6.PEARL);
         if (var10 == -1) {
            return this.fieldBool_y ? -2 : this.getValue_10(var1);
         } else if (this.isValid()) {
            return var10;
         } else {
            return this.fieldBool_y ? -2 : this.getValue_10(var1);
         }
      } else if (var4 instanceof ItemFireball) {
         int var9 = this.calculate_13(WorldUtil6.FIREBALL);
         if (var9 == -1) {
            return this.fieldBool_y ? -2 : this.getValue_10(var1);
         } else if (this.isValid_2()) {
            return var9;
         } else {
            return this.fieldBool_y ? -2 : this.getValue_10(var1);
         }
      } else {
         if (this.getEffects(var1, 1)) {
            return this.calculate_11(var1, WorldUtil6.POTION_SPEED, 1);
         }

         if (this.getEffects(var1, 6)) {
            return this.calculate_11(var1, WorldUtil6.POTION_HEAL, 6);
         }

         if (this.getEffects(var1, 5)) {
            return this.calculate_11(var1, WorldUtil6.POTION_STRENGTH, 5);
         }

         if (var4 == Items.golden_apple) {
            int var8 = this.calculate_13(WorldUtil6.GAPPLE);
            if (var8 == -1) {
               return this.fieldBool_y ? -2 : this.getValue_10(var1);
            } else if (this.isValid_3()) {
               return var8;
            } else {
               return this.fieldBool_y ? -2 : this.getValue_10(var1);
            }
         } else if (var4 instanceof ItemFood) {
            int var7 = this.calculate_13(WorldUtil6.FOOD);
            if (var7 == -1) {
               return this.fieldBool_y ? -2 : this.getValue_10(var1);
            } else if (this.checkCondition_11(var1)) {
               return var7;
            } else {
               return this.fieldBool_y ? -2 : this.getValue_10(var1);
            }
         } else if (var4 instanceof ItemSnowball || var4 instanceof ItemEgg) {
            int var6 = this.calculate_13(WorldUtil6.THROWABLE);
            if (var6 == -1) {
               if (this.toggleModeSetting.getObject_m()) {
                  return -1;
               } else {
                  return this.fieldBool_y ? -2 : this.getValue_10(var1);
               }
            } else if (this.checkCondition_12(var1)) {
               return var6;
            } else if (this.toggleModeSetting.getObject_m()) {
               return -1;
            } else {
               return this.fieldBool_y ? -2 : this.calculate_12();
            }
         } else {
            return this.fieldBool_y ? -2 : this.getValue_10(var1);
         }
      }
   }

   private int calculate_3(ItemStack var1) {
      long var2 = 114011556169243L;
      int var10000 = AntiBot.getValue();
      int var4 = 0;
      int var5 = var10000;

      while (var4 < 9) {
         ItemStack var6 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var4 + 36).getStack();
         if (this.arr_C[var4] == WorldUtil6.BLOCKS || var5 != 0) {
            if (var6 == null) {
               if (this.checkCondition_3(var1)) {
                  return var4 + 36;
               }
            } else if (var6.stackSize != 64 || var5 != 0) {
               if (this.checkCondition_2(var1, var6)) {
                  return var4 + 36;
               }

               if (this.checkCondition(var6, var1)) {
                  return var4 + 36;
               }
            }
         }

         var4++;
         if (var5 != 0) {
            break;
         }
      }

      return this.fieldBool_y ? -2 : this.getValue_10(var1);
   }

   private boolean checkCondition(ItemStack var1, ItemStack var2) {
      long var3 = 95093296629096L;
      int var5 = AntiBot.getValue();
      if (var1.stackSize == 64) {
         return false;
      }

      if (var2.stackSize == 64) {
         return true;
      }

      int var6 = var1.stackSize;
      int var7 = var2.stackSize;

      for (Slot var9 : this.getArrayList()) {
         ItemStack var10 = var9.getStack();
         if (var10 != null
            && var10 != var1
            && (var10 != var2 || var5 != 0)
            && var10.getItem() instanceof ItemBlock
            && (!BlockUtil6.CONST_A.contains(((ItemBlock)var10.getItem()).getBlock()) || var5 != 0)
            && (var9.slotNumber <= 35 || this.arr_C[var9.slotNumber - 36] != WorldUtil6.BLOCKS || var5 != 0)) {
            if (this.checkCondition_2(var1, var10)) {
               var6 += var10.stackSize;
            }

            if (this.checkCondition_2(var2, var10)) {
               var7 += var10.stackSize;
            }

            if (var5 != 0) {
               break;
            }
         }
      }

      return var7 > var6;
   }

   private boolean checkCondition_2(ItemStack var1, ItemStack var2) {
      long var3 = 39496152095823L;
      if (var1 == null || var2 == null) {
         return false;
      }

      if (var1.isStackable() && var2.isStackable()) {
         if (var1.getItem() != var2.getItem()) {
            return false;
         } else if (var1.getItemDamage() != var2.getItemDamage()) {
            return false;
         } else {
            return var1.hasTagCompound() != var2.hasTagCompound() ? false : !var1.hasTagCompound() || var1.getTagCompound().equals(var2.getTagCompound());
         }
      } else {
         return false;
      }
   }

   private boolean checkCondition_3(ItemStack var1) {
      long var2 = 18858630757158L;
      int var4 = AntiBot.getValue_2();
      if (var1.stackSize == 64) {
         return true;
      }

      for (Slot var6 : this.getArrayList()) {
         ItemStack var7 = var6.getStack();
         if (var7 != null
            && (var7 != var1 || var4 == 0)
            && var7.getItem() instanceof ItemBlock
            && (!BlockUtil6.CONST_A.contains(((ItemBlock)var7.getItem()).getBlock()) || var4 == 0)
            && (var6.slotNumber <= 35 || this.arr_C[var6.slotNumber - 36] != WorldUtil6.BLOCKS || var4 == 0)) {
            if (var1.stackSize < var7.stackSize) {
               return false;
            }

            if (var4 == 0) {
               break;
            }
         }
      }

      return true;
   }

   private boolean checkCondition_4(ItemStack var1) {
      long var2 = 68492574952811L;
      int var10000 = AntiBot.getValue();
      Iterator var4 = this.getArrayList().iterator();
      int var5 = var10000;

      while (var4.hasNext()) {
         Slot var6 = (Slot)var4.next();
         if (var6.getStack() != var1 || var5 != 0) {
            if (var6.getStack().getItem() instanceof ItemArmor) {
               if (EntityUtil4.getEnum4Val3(var1) != EntityUtil4.getEnum4Val3(var6.getStack()) && var5 == 0) {
                  continue;
               }

               if (EntityUtil4.isValid(var1, var6.getStack())) {
                  return false;
               }
            }

            if (var5 != 0) {
               break;
            }
         }
      }

      ItemStack var7 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(EntityUtil4.getEnum4Val3_2(var1.getItem()).ordinal() + 5).getStack();
      return var7 == null || var7 == var1 ? true : EntityUtil4.isValid(var7, var1);
   }

   private boolean checkCondition_5(ItemStack var1) {
      long var2 = 123968130975049L;
      int var10000 = AntiBot.getValue();
      Iterator var4 = this.getArrayList().iterator();
      int var5 = var10000;

      while (var4.hasNext()) {
         Slot var6 = (Slot)var4.next();
         if (var6.getStack() != var1 || var5 != 0) {
            if (var6.getStack().getItem() instanceof ItemSword && !EntityUtil4.isValid_2(var6.getStack(), var1)) {
               return false;
            }

            if (var5 != 0) {
               break;
            }
         }
      }

      return true;
   }

   private boolean checkCondition_6(ItemStack var1) {
      long var2 = 16301469842122L;
      int var10000 = AntiBot.getValue();
      Iterator var4 = this.getArrayList().iterator();
      int var5 = var10000;

      while (var4.hasNext()) {
         Slot var6 = (Slot)var4.next();
         if (var6.getStack() != var1 || var5 != 0) {
            if (var6.getStack().getItem() instanceof ItemPickaxe && !EntityUtil4.checkCondition(var6.getStack(), var1)) {
               return false;
            }

            if (var5 != 0) {
               break;
            }
         }
      }

      return true;
   }

   private boolean checkCondition_7(ItemStack var1) {
      long var2 = 42389815882643L;
      int var10000 = AntiBot.getValue();
      Iterator var4 = this.getArrayList().iterator();
      int var5 = var10000;

      while (var4.hasNext()) {
         Slot var6 = (Slot)var4.next();
         if (var6.getStack() != var1 || var5 != 0) {
            if (var6.getStack().getItem() instanceof ItemAxe && !EntityUtil4.checkCondition(var6.getStack(), var1)) {
               return false;
            }

            if (var5 != 0) {
               break;
            }
         }
      }

      return true;
   }

   private boolean checkCondition_8(ItemStack var1) {
      long var2 = 130494386379932L;
      int var10000 = AntiBot.getValue();
      Iterator var4 = this.getArrayList().iterator();
      int var5 = var10000;

      while (var4.hasNext()) {
         Slot var6 = (Slot)var4.next();
         if (var6.getStack() != var1 || var5 != 0) {
            if (var6.getStack().getItem() instanceof ItemBow && !EntityUtil4.isValid_4(var6.getStack(), var1)) {
               return false;
            }

            if (var5 != 0) {
               break;
            }
         }
      }

      return true;
   }

   private boolean checkCondition_9(ItemStack var1) {
      long var2 = 48712932193252L;
      int var10000 = AntiBot.getValue_2();
      Iterator var4 = this.getArrayList().iterator();
      int var5 = var10000;

      while (var4.hasNext()) {
         Slot var6 = (Slot)var4.next();
         if (var6.getStack() != var1 || var5 == 0) {
            if (var6.getStack().getItem() instanceof ItemFishingRod && !EntityUtil4.isValid_3(var6.getStack(), var1)) {
               return false;
            }

            if (var5 == 0) {
               break;
            }
         }
      }

      return true;
   }

   private boolean checkCondition_10(ItemStack var1) {
      long var2 = 118248944985970L;
      int var10000 = AntiBot.getValue();
      Iterator var4 = this.getArrayList().iterator();
      int var5 = var10000;

      while (var4.hasNext()) {
         Slot var6 = (Slot)var4.next();
         if (var6.getStack() != var1 || var5 != 0) {
            if (var6.getStack().getItem() instanceof ItemShears
               && var6.getStack().getMaxDamage() - var6.getStack().getItemDamage() > var1.getMaxDamage() - var1.getItemDamage()) {
               return false;
            }

            if (var5 != 0) {
               break;
            }
         }
      }

      return true;
   }

   private boolean checkCondition_11(ItemStack var1) {
      long var2 = 118566527723278L;
      int var10000 = AntiBot.getValue();
      ItemFood var4 = (ItemFood)var1.getItem();
      int var5 = var10000;

      for (Slot var7 : this.getArrayList()) {
         if (var7.getStack() != var1 || var5 != 0) {
            if (var7.getStack().getItem() instanceof ItemFood) {
               ItemFood var8 = (ItemFood)var7.getStack().getItem();
               if (var8.getHealAmount(var7.getStack()) > var4.getHealAmount(var1)) {
                  return false;
               }
            }

            if (var5 != 0) {
               break;
            }
         }
      }

      return true;
   }

   private int calculate_4(EnumType5 var1) {
      long var2 = 21511872574830L;
      int var10000 = AntiBot.getValue();
      ItemStack var4 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var1.ordinal() + 5).getStack();
      int var5 = var10000;
      int var6 = -1;

      for (Slot var8 : this.getArrayList()) {
         if (var8.getStack() != var4 || var5 != 0) {
            if (var8.getStack().getItem() instanceof ItemArmor) {
               if (EntityUtil4.getEnum4Val3(var8.getStack()) != var1 && var5 == 0) {
                  continue;
               }

               if (var4 == null || EntityUtil4.isValid(var4, var8.getStack())) {
                  var4 = var8.getStack();
                  var6 = var8.slotNumber;
               }
            }

            if (var5 != 0) {
               break;
            }
         }
      }

      return var6;
   }

   private int getValue_3(ItemStack var1) {
      long var2 = 73551345381286L;
      int var4 = -1;
      int var10000 = AntiBot.getValue_2();
      Iterator var5 = this.getArrayList().iterator();
      int var6 = var10000;

      while (var5.hasNext()) {
         Slot var7 = (Slot)var5.next();
         if (var7.getStack() != var1 || var6 == 0) {
            if (var7.getStack().getItem() instanceof ItemSword
               && (var1 == null || !(var1.getItem() instanceof ItemSword) || EntityUtil4.isValid_2(var1, var7.getStack()))) {
               var1 = var7.getStack();
               var4 = var7.slotNumber;
            }

            if (var6 == 0) {
               break;
            }
         }
      }

      return var4;
   }

   private int getValue_4(ItemStack var1) {
      long var2 = 30879946224438L;
      int var10000 = AntiBot.getValue();
      int var4 = -1;
      int var5 = var10000;

      for (Slot var7 : this.getArrayList()) {
         if (var7.getStack() != var1 || var5 != 0) {
            if (var7.getStack().getItem() instanceof ItemPickaxe
               && (var1 == null || !(var1.getItem() instanceof ItemPickaxe) || EntityUtil4.checkCondition(var1, var7.getStack()))) {
               var1 = var7.getStack();
               var4 = var7.slotNumber;
            }

            if (var5 != 0) {
               break;
            }
         }
      }

      return var4;
   }

   private int getValue_5(ItemStack var1) {
      long var2 = 116618988836422L;
      int var10000 = AntiBot.getValue_2();
      int var4 = -1;
      int var5 = var10000;

      for (Slot var7 : this.getArrayList()) {
         if (var7.getStack() != var1 || var5 == 0) {
            if (var7.getStack().getItem() instanceof ItemAxe
               && (var1 == null || !(var1.getItem() instanceof ItemAxe) || EntityUtil4.checkCondition(var1, var7.getStack()))) {
               var1 = var7.getStack();
               var4 = var7.slotNumber;
            }

            if (var5 == 0) {
               break;
            }
         }
      }

      return var4;
   }

   private int getValue_6(ItemStack var1) {
      long var2 = 127207692678786L;
      int var4 = -1;
      int var10000 = AntiBot.getValue_2();
      Iterator var5 = this.getArrayList().iterator();
      int var6 = var10000;

      while (var5.hasNext()) {
         Slot var7 = (Slot)var5.next();
         if (var7.getStack() != var1 || var6 == 0) {
            if (var7.getStack().getItem() instanceof ItemBow
               && (var1 == null || !(var1.getItem() instanceof ItemBow) || EntityUtil4.isValid_4(var1, var7.getStack()))) {
               var1 = var7.getStack();
               var4 = var7.slotNumber;
            }

            if (var6 == 0) {
               break;
            }
         }
      }

      return var4;
   }

   private int getValue_7(ItemStack var1) {
      long var2 = 116434231053814L;
      int var4 = -1;
      int var10000 = AntiBot.getValue();
      Iterator var5 = this.getArrayList().iterator();
      int var6 = var10000;

      while (var5.hasNext()) {
         Slot var7 = (Slot)var5.next();
         if (var7.getStack() != var1 || var6 != 0) {
            if (var7.getStack().getItem() instanceof ItemFishingRod
               && (var1 == null || !(var1.getItem() instanceof ItemFishingRod) || EntityUtil4.isValid_3(var1, var7.getStack()))) {
               var1 = var7.getStack();
               var4 = var7.slotNumber;
            }

            if (var6 != 0) {
               break;
            }
         }
      }

      return var4;
   }

   private int calculate_5(ItemStack var1) {
      long var2 = 109523924215700L;
      int var4 = AntiBot.getValue();
      boolean var5 = var1 != null && var1.getItem() instanceof ItemBlock && !BlockUtil6.CONST_A.contains(((ItemBlock)var1.getItem()).getBlock());
      if (var5 && var1.stackSize == 64) {
         return -1;
      }

      ConcurrentHashMap var6 = new ConcurrentHashMap();

      for (Slot var8 : this.getArrayList()) {
         if (var8.slotNumber <= 35 || this.arr_C[var8.slotNumber - 36] != WorldUtil6.BLOCKS || var4 != 0) {
            if (var8.getStack() != null
               && var8.getStack().getItem() instanceof ItemBlock
               && !BlockUtil6.CONST_A.contains(((ItemBlock)var8.getStack().getItem()).getBlock())) {
               Slot var9 = null;

               for (Slot var11 : var6.keySet()) {
                  if (this.checkCondition_2(var8.getStack(), var11.getStack())) {
                     var9 = var11;
                     break;
                  }
               }

               label149:
               if (var9 != null) {
                  int var20 = (Integer)var6.get(var9);
                  boolean var24 = var5 && var1.stackSize + var9.getStack().stackSize == 64;
                  if ((var8.getStack().stackSize > var9.getStack().stackSize || var5 && var1.stackSize + var8.getStack().stackSize == 64) && !var24) {
                     var6.remove(var9);
                     var6.put(var8, var20 + var8.getStack().stackSize);
                     if (var4 == 0) {
                        break label149;
                     }
                  }

                  var6.put(var9, var20 + var8.getStack().stackSize);
               } else {
                  var6.put(var8, var8.getStack().stackSize);
               }
            }

            if (var4 != 0) {
               break;
            }
         }
      }

      int var12 = 0;

      while (var12 < 9) {
         ItemStack var15 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var12 + 36).getStack();
         if (var15 != var1
            && (var15 != null || var4 != 0)
            && this.arr_C[var12] == WorldUtil6.BLOCKS
            && var15.getItem() instanceof ItemBlock
            && !BlockUtil6.CONST_A.contains(((ItemBlock)var15.getItem()).getBlock())) {
            Slot var18 = null;

            for (Slot var25 : var6.keySet()) {
               if (this.checkCondition_2(var15, var25.getStack())) {
                  var18 = var25;
                  break;
               }
            }

            if (var18 != null) {
               int var22 = (Integer)var6.get(var18);
               var6.put(var18, var22 - (64 - var15.stackSize));
            }
         }

         var12++;
         if (var4 != 0) {
            break;
         }
      }

      if (var6.isEmpty()) {
         return -1;
      }

      if (var5) {
         for (Slot var16 : var6.keySet()) {
            if (this.checkCondition_2(var1, var16.getStack())) {
               if ((Integer)var6.get(var16) + var1.stackSize >= 64) {
                  return var16.slotNumber;
               }

               var6.put(var16, (Integer)var6.get(var16) + var1.stackSize);
            }

            if (var4 != 0) {
               break;
            }
         }
      }

      var12 = 0;
      int var17 = -1;

      for (Slot var23 : var6.keySet()) {
         if ((Integer)var6.get(var23) > var12 && (!var5 || (Integer)var6.get(var23) > var1.stackSize)) {
            var12 = (Integer)var6.get(var23);
            var17 = var23.slotNumber;
         }

         if (var4 != 0) {
            break;
         }
      }

      return var17;
   }

   private int getValue_8(ItemStack var1) {
      long var2 = 95466961917880L;
      int var4 = AntiBot.getValue();
      boolean var5 = var1 != null && (var1.getItem() instanceof ItemSnowball || var1.getItem() instanceof ItemEgg);
      if (var5 && var1.stackSize == var1.getMaxStackSize()) {
         return -1;
      }

      int var6 = -1;
      int var7 = 0;

      for (Slot var9 : this.getArrayList()) {
         if (var9.getStack() != var1 || var4 != 0) {
            ItemStack var10 = var9.getStack();
            if ((var10.getItem() instanceof ItemEgg || var10.getItem() instanceof ItemSnowball || var4 != 0)
               && (!var5 || var10.getItem() == var1.getItem() || var10.stackSize > var1.stackSize || var4 != 0)) {
               if (var10.stackSize > var7) {
                  var6 = var9.slotNumber;
                  var7 = var10.stackSize;
               }

               if (var4 != 0) {
                  break;
               }
            }
         }
      }

      return var6;
   }

   private int getValue_9(ItemStack var1) {
      long var2 = 3175913226402L;
      int var4 = AntiBot.getValue();
      boolean var5 = this.calculate_13(WorldUtil6.GAPPLE) != -1;
      boolean var6 = false;
      int var7 = -1;
      ItemFood var8 = null;
      if (var1 != null && var1.getItem() instanceof ItemFood && (!(var1.getItem() instanceof ItemAppleGold) || !var5)) {
         var8 = (ItemFood)var1.getItem();
         var6 = true;
      }

      for (Slot var10 : this.getArrayList()) {
         if (var10.getStack() != var1 || var4 != 0) {
            label49:
            if (var10.getStack().getItem() instanceof ItemFood && (!(var10.getStack().getItem() instanceof ItemAppleGold) || !var5)) {
               ItemStack var11 = var10.getStack();
               ItemFood var12 = (ItemFood)var11.getItem();
               if (var6 && this.checkCondition_2(var1, var11)) {
                  var7 = var10.slotNumber;
                  if (var4 == 0) {
                     break label49;
                  }
               }

               if (var1 == null || var8 == null || var12.getHealAmount(var11) > var8.getHealAmount(var1)) {
                  var1 = var10.getStack();
                  var7 = var10.slotNumber;
               }
            }

            if (var4 != 0) {
               break;
            }
         }
      }

      return var7;
   }

   private int calculate_6(ItemStack var1) {
      long var2 = 953096078558L;
      int var10000 = AntiBot.getValue();
      int var4 = -1;
      int var5 = var10000;
      int var6 = 0;
      boolean var7 = var1 != null && var1.getItem() == Items.golden_apple;
      if (var7 && var1.stackSize == var1.getMaxStackSize()) {
         return -1;
      }

      for (Slot var9 : this.getArrayList()) {
         if (var9.getStack() != var1 || var5 != 0) {
            if (var9.getStack().getItem() == Items.golden_apple) {
               if (var7 && var9.getStack().stackSize + var1.stackSize == 64) {
                  return var9.slotNumber;
               }

               if (var9.getStack().stackSize > var6) {
                  var4 = var9.slotNumber;
                  var6 = var9.getStack().stackSize;
               }
            }

            if (var5 != 0) {
               break;
            }
         }
      }

      return var4;
   }

   private int calculate_7(ItemStack var1) {
      long var2 = 17517231480309L;
      int var4 = -1;
      int var10000 = AntiBot.getValue_2();
      int var5 = 0;
      int var6 = var10000;
      boolean var7 = var1 != null && var1.getItem() == Items.fire_charge;
      if (var7 && var1.stackSize == var1.getMaxStackSize()) {
         return -1;
      }

      for (Slot var9 : this.getArrayList()) {
         if (var9.getStack() != var1 || var6 == 0) {
            if (var9.getStack().getItem() == Items.fire_charge) {
               if (var7 && var9.getStack().stackSize + var1.stackSize == var9.getStack().getMaxStackSize()) {
                  return var9.slotNumber;
               }

               if (var9.getStack().stackSize > var5) {
                  var4 = var9.slotNumber;
                  var5 = var9.getStack().stackSize;
               }
            }

            if (var6 == 0) {
               break;
            }
         }
      }

      return var4;
   }

   private int calculate_8(ItemStack var1) {
      long var2 = 88708323178533L;
      int var10000 = AntiBot.getValue_2();
      int var4 = -1;
      int var5 = var10000;
      int var6 = 0;
      boolean var7 = var1 != null && var1.getItem() == Items.ender_pearl;
      if (var7 && var1.stackSize >= var1.getMaxStackSize()) {
         return -1;
      }

      for (Slot var9 : this.getArrayList()) {
         if (var9.getStack() != var1) {
            ItemStack var10 = var9.getStack();
            if (var10.getItem() == Items.ender_pearl) {
               if (var7 && this.checkCondition_2(var1, var10) && var10.stackSize + var1.stackSize == var10.getMaxStackSize()) {
                  return var9.slotNumber;
               }

               if (this.checkCondition_2(var1, var10) && var10.stackSize > var6) {
                  var4 = var9.slotNumber;
                  var6 = var10.stackSize;
               }

               if (var5 == 0) {
                  break;
               }
            }
         }
      }

      return var4;
   }

   private int calculate_9(ItemStack var1) {
      long var2 = 128600867097414L;
      int var10000 = AntiBot.getValue();
      int var4 = -1;
      int var5 = var10000;
      int var6 = 0;
      boolean var7 = var1 != null && var1.getItem() instanceof ItemShears;
      if (var7) {
         var6 = var1.getMaxDamage() - var1.getItemDamage();
      }

      for (Slot var9 : this.getArrayList()) {
         if (var9.getStack() != var1 || var5 != 0) {
            if (var9.getStack().getItem() instanceof ItemShears) {
               int var10 = var9.getStack().getMaxDamage() - var9.getStack().getItemDamage();
               if (var10 > var6) {
                  var4 = var9.slotNumber;
                  var6 = var10;
               }
            }

            if (var5 != 0) {
               break;
            }
         }
      }

      return var4;
   }

   private boolean getEffects(ItemStack var1, int var2) {
      long var3 = 48991449501632L;
      int var5 = AntiBot.getValue();
      if (var1 != null && var1.getItem() == Items.potionitem) {
         List var6 = ((ItemPotion)var1.getItem()).getEffects(var1);
         if (var6 == null) {
            return false;
         }

         for (PotionEffect var8 : var6) {
            if (var8.getPotionID() == var2) {
               return true;
            }

            if (var5 != 0) {
               break;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private int calculate_10(ItemStack var1, int var2, WorldUtil6 var3) {
      long var4 = 38072503270753L;
      int var6 = -1;
      int var7 = 0;
      int var10000 = AntiBot.getValue_2();
      boolean var8 = this.getEffects(var1, var2);
      int var9 = var10000;
      if (var8 && var1.stackSize == var1.getMaxStackSize()) {
         return -1;
      }

      for (Slot var11 : this.getArrayList()) {
         if ((var11.getStack() != var1 || var9 == 0)
            && (var11.slotNumber < 36 || var11.slotNumber > 44 || this.arr_C[var11.slotNumber - 36] != var3 || var9 == 0)) {
            ItemStack var12 = var11.getStack();
            if (this.getEffects(var12, var2) || var9 == 0) {
               if (var8 && this.checkCondition_2(var1, var12) && var12.stackSize + var1.stackSize == var12.getMaxStackSize()) {
                  return var11.slotNumber;
               }

               if (var12.stackSize > var7) {
                  var6 = var11.slotNumber;
                  var7 = var12.stackSize;
               }

               if (var9 == 0) {
                  break;
               }
            }
         }
      }

      return var6;
   }

   private int calculate_11(ItemStack var1, WorldUtil6 var2, int var3) {
      long var4 = 127620763988467L;
      int var10000 = AntiBot.getValue();
      int var6 = -1;
      int var7 = 0;
      int var8 = var10000;

      while (var7 < 9) {
         if (this.arr_C[var7] == var2) {
            ItemStack var9 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var7 + 36).getStack();
            if (var9 == null || !this.getEffects(var9, var3) || var9.stackSize < var9.getMaxStackSize()) {
               var6 = var7 + 36;
               if (var8 == 0) {
                  break;
               }
            }
         }

         var7++;
         if (var8 != 0) {
            break;
         }
      }

      if (var6 != -1) {
         return var6;
      } else {
         return this.fieldBool_y ? -2 : this.getValue_10(var1);
      }
   }

   private boolean checkCondition_12(ItemStack var1) {
      long var2 = 49369697154201L;
      int var4 = this.calculate_13(WorldUtil6.THROWABLE);
      if (var4 == -1) {
         return false;
      } else {
         ItemStack var5 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var4).getStack();
         if (var5 == null) {
            return true;
         } else if (!(var5.getItem() instanceof ItemSnowball) && !(var5.getItem() instanceof ItemEgg)) {
            return true;
         } else {
            return var5.getItem() == var1.getItem() ? var5.stackSize < var5.getMaxStackSize() : var1.stackSize > var5.stackSize;
         }
      }
   }

   private boolean isValid() {
      long var1 = 59478655584251L;
      int var3 = this.calculate_13(WorldUtil6.PEARL);
      if (var3 == -1) {
         return false;
      } else {
         ItemStack var4 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var3).getStack();
         if (var4 == null) {
            return true;
         } else {
            return var4.getItem() != Items.ender_pearl ? true : var4.stackSize < 16;
         }
      }
   }

   private boolean isValid_2() {
      long var1 = 19458646693648L;
      int var3 = this.calculate_13(WorldUtil6.FIREBALL);
      if (var3 == -1) {
         return false;
      } else {
         ItemStack var4 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var3).getStack();
         if (var4 == null) {
            return true;
         } else {
            return var4.getItem() != Items.fire_charge ? true : var4.stackSize < var4.getMaxStackSize();
         }
      }
   }

   private boolean isValid_3() {
      long var1 = 19873063764556L;
      int var3 = this.calculate_13(WorldUtil6.GAPPLE);
      if (var3 == -1) {
         return false;
      } else {
         ItemStack var4 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var3).getStack();
         if (var4 == null) {
            return true;
         } else {
            return var4.getItem() != Items.golden_apple ? true : var4.stackSize < var4.getMaxStackSize();
         }
      }
   }

   private int calculate_12() {
      long var1 = 99629277576584L;
      int var10000 = AntiBot.getValue();
      int var3 = 9;
      int var4 = var10000;

      while (var3 < 36) {
         if (BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var3).getStack() == null) {
            return var3;
         }

         var3++;
         if (var4 != 0) {
            break;
         }
      }

      for (int var5 = 36; var5 < 44; var5++) {
         if (BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var5).getStack() == null
            && (!this.hotbarSetting.getObject_m() || this.arr_C[var5 - 36] == WorldUtil6.EMPTY || var4 != 0)) {
            return var5;
         }
         break;
      }

      return -1;
   }

   private int getValue_10(ItemStack var1) {
      long var2 = 27863841124323L;
      int var4 = AntiBot.getValue();
      if (var1 == null) {
         return this.calculate_12();
      }

      int var5 = 9;

      while (var5 < 44) {
         ItemStack var6 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var5).getStack();
         if ((var6 != null || var4 != 0) && (var6.stackSize != var6.getMaxStackSize() || var4 != 0) && this.checkCondition_2(var1, var6)) {
            return var5;
         }

         var5++;
         if (var4 != 0) {
            break;
         }
      }

      return this.calculate_12();
   }

   public ArrayList<Slot> getArrayList() {
      long var1 = 50883993379617L;
      int var10000 = AntiBot.getValue_2();
      ArrayList var3 = new ArrayList();
      int var4 = var10000;
      int var5 = 44;

      while (var5 >= 5) {
         Slot var6 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var5);
         if (var6.getHasStack()) {
            var3.add(var6);
         }

         var5--;
         if (var4 == 0) {
            break;
         }
      }

      return var3;
   }

   private int calculate_13(WorldUtil6 var1) {
      long var2 = 39142703932471L;
      int var10000 = AntiBot.getValue();
      int var4 = 0;
      int var5 = var10000;

      while (var4 < 9) {
         if (this.arr_C[var4] == var1) {
            return var4 + 36;
         }

         var4++;
         if (var5 != 0) {
            break;
         }
      }

      return -1;
   }

   private void clamp() {
      long var1 = 65963166417205L;
      int var10000 = AntiBot.getValue();
      List[] var3 = this.inventorySlotsSetting.getObject_m().arr_b;
      int var4 = var10000;
      if (this.armorSetting.getObject_m()) {
         int[] var13 = new int[WorldUtil6.values().length];
         boolean[] var14 = new boolean[var13.length];
         int var15 = 0;
         int var16 = 0;

         label74:
         while (var16 < 9) {
            Iterator var17 = var3[var16].iterator();

            while (true) {
               label70:
               if (var17.hasNext()) {
                  WorldUtil6 var10 = (WorldUtil6)var17.next();
                  if (var10 == WorldUtil6.EMPTY && var4 == 0) {
                     continue;
                  }

                  boolean var11;
                  label100: {
                     if (var10.exclusive) {
                        var11 = this.getHeldItem_2(var10);
                        if (var4 == 0) {
                           break label100;
                        }
                     }

                     int var12 = var10.ordinal();
                     if (!var14[var12]) {
                        var13[var12] = this.getHeldItem_3(var10);
                        var14[var12] = true;
                     }

                     var11 = var13[var12] > 0;
                     if (var11) {
                        var13[var12] = Math.max(0, var13[var12] - this.getHeldItem_4(var10));
                     }
                  }

                  if (var11) {
                     this.arr_C[var15++] = var10;
                     if (var4 == 0) {
                        break label70;
                     }
                  }

                  if (var4 == 0) {
                     continue;
                  }
               }

               var16++;
               if (var4 != 0) {
                  break label74;
               }
               break;
            }
         }

         while (var15 < 9) {
            this.arr_C[var15++] = WorldUtil6.EMPTY;
            if (var4 != 0) {
               break;
            }
         }
      } else {
         int var5 = 0;

         while (var5 < 9) {
            List var6 = var3[var5];
            WorldUtil6 var7 = var6.isEmpty() ? WorldUtil6.EMPTY : (WorldUtil6)var6.get(0);
            Iterator var8 = var6.iterator();

            while (true) {
               label89:
               if (var8.hasNext()) {
                  WorldUtil6 var9 = (WorldUtil6)var8.next();
                  if (this.getHeldItem_2(var9)) {
                     var7 = var9;
                     if (var4 == 0) {
                        break label89;
                     }
                  }

                  if (var4 == 0) {
                     continue;
                  }
               }

               this.arr_C[var5] = var7;
               var5++;
               if (var4 != 0) {
                  return;
               }
               break;
            }
         }
      }
   }

   private boolean getHeldItem_2(WorldUtil6 var1) {
      long var2 = 26384832630565L;
      int var4 = AntiBot.getValue_2();
      if (var1 == WorldUtil6.EMPTY) {
         return true;
      }

      if (this.checkCondition_13(BreezeClient.CONST_A.thePlayer.inventory.getItemStack(), var1)) {
         return true;
      }

      int var5 = 5;

      while (var5 < 45) {
         if (this.checkCondition_13(BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var5).getStack(), var1)) {
            return true;
         }

         var5++;
         if (var4 == 0) {
            break;
         }
      }

      return false;
   }

   private int getHeldItem_3(WorldUtil6 var1) {
      long var2 = 35810888790397L;
      int var10000 = AntiBot.getValue_2();
      int var4 = 0;
      int var5 = var10000;
      ItemStack var6 = BreezeClient.CONST_A.thePlayer.inventory.getItemStack();
      if (this.checkCondition_13(var6, var1)) {
         var4 += var6.stackSize;
      }

      int var7 = 5;

      while (var7 < 45) {
         ItemStack var8 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var7).getStack();
         if (this.checkCondition_13(var8, var1)) {
            var4 += var8.stackSize;
         }

         var7++;
         if (var5 == 0) {
            break;
         }
      }

      return var4;
   }

   private int getHeldItem_4(WorldUtil6 var1) {
      long var2 = 60132059080293L;
      int var10000 = AntiBot.getValue();
      ItemStack var4 = BreezeClient.CONST_A.thePlayer.inventory.getItemStack();
      int var5 = var10000;
      if (this.checkCondition_13(var4, var1)) {
         return Math.max(1, var4.getMaxStackSize());
      }

      int var6 = 5;

      while (var6 < 45) {
         ItemStack var7 = BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var6).getStack();
         if (this.checkCondition_13(var7, var1)) {
            return Math.max(1, var7.getMaxStackSize());
         }

         var6++;
         if (var5 != 0) {
            break;
         }
      }

      return 64;
   }

   private boolean checkCondition_13(ItemStack var1, WorldUtil6 var2) {
      long var3 = 117795582941946L;
      if (var1 == null) {
         return false;
      }

      Item var5 = var1.getItem();
      switch (WorldUtil3.CONST_B[var2.ordinal()]) {
         case 1:
            return var5 instanceof ItemSword;
         case 2:
            return var5 instanceof ItemPickaxe;
         case 3:
            return var5 instanceof ItemAxe;
         case 4:
            return var5 instanceof ItemFishingRod;
         case 5:
            return var5 instanceof ItemBow;
         case 6:
            return var5 instanceof ItemShears;
         case 7:
            return var5 instanceof ItemBlock && !BlockUtil6.CONST_A.contains(((ItemBlock)var5).getBlock());
         case 8:
            return var5 instanceof ItemFood;
         case 9:
            return var5 == Items.golden_apple;
         case 10:
            return var5 instanceof ItemSnowball || var5 instanceof ItemEgg;
         case 11:
            return var5 == Items.ender_pearl;
         case 12:
            return var5 == Items.fire_charge;
         case 13:
            return this.getEffects(var1, 1);
         case 14:
            return this.getEffects(var1, 6);
         case 15:
            return this.getEffects(var1, 5);
         default:
            return false;
      }
   }

   private static boolean lambda$new_Inner3(rip.breeze.DateUtil var0) {
      long var1 = 101078154033724L;
      return var0.getObject("ToggleMode", EnumType4.class) == EnumType4.AFTER_DELAY;
   }

   private static boolean lambda$new_Inner2(rip.breeze.DateUtil var0) {
      long var1 = 83806232848553L;
      return var0.getObject("ToggleMode", EnumType4.class) == EnumType4.HOLD
         || var0.getObject("ToggleMode", EnumType4.class) == EnumType4.TOGGLE;
   }

   private static boolean lambda$new_Inner1(rip.breeze.DateUtil var0) {
      long var1 = 60185583985486L;
      return var0.getObject("Hotbar", Boolean.class);
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 109631754688846L;
      return var0.getObject("Hotbar", Boolean.class);
   }

   static {
      long var0 = 92501035623713L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[19];
      int var5 = 0;
      String var6 = "Z.>Zû(#°\u0086ZÐ\u007fÁ\u0082\u0083\n@U¦]eîiÓ\u008cwÍøbüp\u0016»)9XÆ¦<0\u0003Ö\u000fæ³Ô~GÀ\u0088/à±Ñ\u00adlD;xÃ\b;Á³\u001ar\u0097L&\u001bjÝ\u0004Å\u0091E¶\u0092ó4IP\u001b\u0092qÝ\n-\u0094.\u008f<²WÌÔ\u0006LÕétÃßFHÆ3X£ü\u0005HÐ=;\u009eÑ\u001f\u008e§V\u0016Q°mãë\u0096{¤t.\u0080\u000bg¹´ÍTl=¸ÓVl'{ÿÌÝï\u0011Ìårý\u0002¥ÊxL\u008f\u0010¦kª\u009f\u0093_,D¡/`eU·Jï\u0018<Ó\u0085Pq\u009bÛT²:ï\u0013V?à&»\u0002\u007f\u008fçI«÷\u0010\u0010»\u00916u\u0085¯IQº\u008da\u0002¹I: ±\u0096(Úâö\u0012\u0092\r/âÓD\u0012\u0016§O\u001cAWz\u001ec?-Å\u0081eÞL¤ÉP©Ë\u0091r5ÛDO\u008a\u0099\u0017\u0085³\u009e}\u000bÑ\u0096X\u0011ñ\u0090È\u0095ì,ü\u0001Î|\u009b_>sæÞ\u0014~ÁrÛ6\u0090Ïpäµð´ù\u009cðuÓ¡\u0082\u0082-=>×Á\u001b$\u00adÜ¤\u0001\u001aÜÿï\u0083\n³7Ñ\u0019ï\u0086 iÙ©1ºç.Ö\u001fÔ4L²A¾ñÕØ\u009dÛÒJü\u0002T[ë±2Iõ\u0012ù\u001fôl¥^®¶\u0084\u000e&\u001d÷Ý\u000f\u0099ÇÒÂ\u0016çªåG¥¿kÐÆ5\u009f6îB\n'@\u0017®\u0018ÒB\u0092^\u0010\b¼¹\u0087S°\u009c\u008c\u00ad£D\u0007\u00126æJ\u00adÅ£õù!òÆC\u0097ãxusdÄ%ÃI3ò_\u0081ª´÷{\u008dîO\u0084ed\u009b|í\t\u0095\u008a\u0098°\u00844ë-BÑ0Î\u0014(c*|j\u000beÖ\u001bÆ\u008dC\tyN1à\u0010t? \u000eÅ\u000e\u0016þØÍÁ\u0000\u0098Ç\tH\u0018\u0019º¡q-á\u0083AÛMG2Ìß£\u0012Pw\u0005è¢ÙãjX§¾Óï*òe\r½\u0018\nä \u008fY÷cffã½÷\u001b0î \u007fNZ©Öv74áhÞµÄtwèÞ¬\u001a\u0080\u009f=vscÝ=ÚPXüu\u009a\fÂVï l\u0088V\u0007\u0080ykÌé\u001f\u009b[H®\u0088]|¨§\u008a\u0017¿\r\u0085 H7OD¤\u0082°õ\u0019|½F\faöÜ\u0084\u0010¸Á\u008f©ã¸\u0090Ô{êyéHU@,\u0015â³Z°Íí}\u0086\u009fás¼ù<è+\u008aM\u008dÌ_HB®ý\u0081\u008awo~\tg\u0016wh\u0091Û¨µ\u0088\u0003UÔyÝ\u0000´\u0089î\u0081Û9RÖ\u0095ïuâÿcmß >\u008eEJ\bGþ\u009c\u0002<\u008eÉË¢\u0001ð¹ÄÐÚ\u0007{t\u009dÙ\u0012\u008f²\u00ad\u0085\u007f\u00120vH\u0089oÚà\u0017½2¼>®+ª\u001c\u00938\u008dâÑ\u0015È'\u0093\u0085Ðº\u0004ý?Moï8S¯&.Úª\nI£ïG¸\u0081U\u0018\u0082\u0000»0\u009d4ÞDÊy\u009a.@e-M\u0096n%\u0092xiD\u0097";
      int var7 = "Z.>Zû(#°\u0086ZÐ\u007fÁ\u0082\u0083\n@U¦]eîiÓ\u008cwÍøbüp\u0016»)9XÆ¦<0\u0003Ö\u000fæ³Ô~GÀ\u0088/à±Ñ\u00adlD;xÃ\b;Á³\u001ar\u0097L&\u001bjÝ\u0004Å\u0091E¶\u0092ó4IP\u001b\u0092qÝ\n-\u0094.\u008f<²WÌÔ\u0006LÕétÃßFHÆ3X£ü\u0005HÐ=;\u009eÑ\u001f\u008e§V\u0016Q°mãë\u0096{¤t.\u0080\u000bg¹´ÍTl=¸ÓVl'{ÿÌÝï\u0011Ìårý\u0002¥ÊxL\u008f\u0010¦kª\u009f\u0093_,D¡/`eU·Jï\u0018<Ó\u0085Pq\u009bÛT²:ï\u0013V?à&»\u0002\u007f\u008fçI«÷\u0010\u0010»\u00916u\u0085¯IQº\u008da\u0002¹I: ±\u0096(Úâö\u0012\u0092\r/âÓD\u0012\u0016§O\u001cAWz\u001ec?-Å\u0081eÞL¤ÉP©Ë\u0091r5ÛDO\u008a\u0099\u0017\u0085³\u009e}\u000bÑ\u0096X\u0011ñ\u0090È\u0095ì,ü\u0001Î|\u009b_>sæÞ\u0014~ÁrÛ6\u0090Ïpäµð´ù\u009cðuÓ¡\u0082\u0082-=>×Á\u001b$\u00adÜ¤\u0001\u001aÜÿï\u0083\n³7Ñ\u0019ï\u0086 iÙ©1ºç.Ö\u001fÔ4L²A¾ñÕØ\u009dÛÒJü\u0002T[ë±2Iõ\u0012ù\u001fôl¥^®¶\u0084\u000e&\u001d÷Ý\u000f\u0099ÇÒÂ\u0016çªåG¥¿kÐÆ5\u009f6îB\n'@\u0017®\u0018ÒB\u0092^\u0010\b¼¹\u0087S°\u009c\u008c\u00ad£D\u0007\u00126æJ\u00adÅ£õù!òÆC\u0097ãxusdÄ%ÃI3ò_\u0081ª´÷{\u008dîO\u0084ed\u009b|í\t\u0095\u008a\u0098°\u00844ë-BÑ0Î\u0014(c*|j\u000beÖ\u001bÆ\u008dC\tyN1à\u0010t? \u000eÅ\u000e\u0016þØÍÁ\u0000\u0098Ç\tH\u0018\u0019º¡q-á\u0083AÛMG2Ìß£\u0012Pw\u0005è¢ÙãjX§¾Óï*òe\r½\u0018\nä \u008fY÷cffã½÷\u001b0î \u007fNZ©Öv74áhÞµÄtwèÞ¬\u001a\u0080\u009f=vscÝ=ÚPXüu\u009a\fÂVï l\u0088V\u0007\u0080ykÌé\u001f\u009b[H®\u0088]|¨§\u008a\u0017¿\r\u0085 H7OD¤\u0082°õ\u0019|½F\faöÜ\u0084\u0010¸Á\u008f©ã¸\u0090Ô{êyéHU@,\u0015â³Z°Íí}\u0086\u009fás¼ù<è+\u008aM\u008dÌ_HB®ý\u0081\u008awo~\tg\u0016wh\u0091Û¨µ\u0088\u0003UÔyÝ\u0000´\u0089î\u0081Û9RÖ\u0095ïuâÿcmß >\u008eEJ\bGþ\u009c\u0002<\u008eÉË¢\u0001ð¹ÄÐÚ\u0007{t\u009dÙ\u0012\u008f²\u00ad\u0085\u007f\u00120vH\u0089oÚà\u0017½2¼>®+ª\u001c\u00938\u008dâÑ\u0015È'\u0093\u0085Ðº\u0004ý?Moï8S¯&.Úª\nI£ïG¸\u0081U\u0018\u0082\u0000»0\u009d4ÞDÊy\u009a.@e-M\u0096n%\u0092xiD\u0097"
         .length();
      char var8 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var33;
                  if ((var23 += var8) >= var7) {
                     CONST_H = var4;
                     CONST_I = new String[19];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[2];
                     int var14 = 0;
                     String var15 = "nëÿÜ\u008cþ)\u0007Á\u0094\u0007`Â\u0082\u0003d";
                     int var16 = "nëÿÜ\u008cþ)\u0007Á\u0094\u0007`Â\u0082\u0003d".length();
                     byte var17 = 0;

                     do {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        var10001 = var14++;
                        long var19 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte[] var21 = var11.doFinal(
                           new byte[]{
                              (byte)(var19 >>> 56),
                              (byte)(var19 >>> 48),
                              (byte)(var19 >>> 40),
                              (byte)(var19 >>> 32),
                              (byte)(var19 >>> 24),
                              (byte)(var19 >>> 16),
                              (byte)(var19 >>> 8),
                              (byte)var19
                           }
                        );
                        long var10004 = (var21[0] & 255L) << 56
                           | (var21[1] & 255L) << 48
                           | (var21[2] & 255L) << 40
                           | (var21[3] & 255L) << 32
                           | (var21[4] & 255L) << 24
                           | (var21[5] & 255L) << 16
                           | (var21[6] & 255L) << 8
                           | var21[7] & 255L;
                        byte var38 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_E = (int)var13[1];
                     CONST_F = (int)var13[0];
                     return;
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var33;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label45;
                  }

                  var6 = "Þ²\u0089g\u0087§Þeïª\u0099Pã|ÜÍÝi¬\u0019\u00ado°é\u001bZ»ºq\u0098\u0018zu\u0018¸\u0084I¸\u0093º\r\u001d\u0017·¯ØÑQÿòjÙ'ãÛ\u0010C(\u000bu\u0080¨Â#\u0010ÍÁ\rgm|¢Ì:°\u0014±\u0092d<,";
                  var7 = "Þ²\u0089g\u0087§Þeïª\u0099Pã|ÜÍÝi¬\u0019\u00ado°é\u001bZ»ºq\u0098\u0018zu\u0018¸\u0084I¸\u0093º\r\u001d\u0017·¯ØÑQÿòjÙ'ãÛ\u0010C(\u000bu\u0080¨Â#\u0010ÍÁ\rgm|¢Ì:°\u0014±\u0092d<,"
                     .length();
                  var8 = '@';
                  var23 = -1;
            }

            var24 = var6.substring(++var23, var23 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19433;
      if (CONST_I[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_J.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_J.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dO", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_H[var3].getBytes("ISO-8859-1");
         CONST_I[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_I[var3];
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
         throw new RuntimeException("rip/breeze/client/dO" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
