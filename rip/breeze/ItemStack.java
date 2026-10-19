package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;

@ScriptObject(name = "ItemStack", description = "Describes a minecraft item-stack.", group = "net/minecraft/item")
public class ItemStack extends StringBuilderUtil<net.minecraft.item.ItemStack> {
   private static final String CONST_Q;

   public ItemStack(net.minecraft.item.ItemStack var1) {
      super(var1);
   }

   @JSGetter(value = "stackSize", description = "The amount of items in the stack.")
   public int getValue() {
      return ((net.minecraft.item.ItemStack)this.i).stackSize;
   }

   @JSSetter("stackSize")
   public void initialize(int var1) {
      ((net.minecraft.item.ItemStack)this.i).stackSize = var1;
   }

   @JSGetter("maxStackSize")
   public int getValue_2() {
      return ((net.minecraft.item.ItemStack)this.i).getMaxStackSize();
   }

   @JSGetter("itemDamage")
   public int getValue_3() {
      return ((net.minecraft.item.ItemStack)this.i).getItemDamage();
   }

   @JSFunction(value = "getDisplayName", returns = "The name of the item.")
   public String getString() {
      return ((net.minecraft.item.ItemStack)this.i).getDisplayName();
   }

   @JSFunction(value = "getUnlocalizedName", returns = "The unlocalized name of the item.")
   public String getString_2() {
      return ((net.minecraft.item.ItemStack)this.i).getUnlocalizedName();
   }

   @JSFunction(value = "getItemId", returns = "The id of the item.", see = "https://www.digminecraft.com/lists/item_id_list_pc_1_8.php")
   public int getValue_4() {
      return Item.getIdFromItem(((net.minecraft.item.ItemStack)this.i).getItem());
   }

   @JSFunction(value = "isDamageable", returns = "Whether the item can be damaged.")
   public boolean getHeldItem() {
      return ((net.minecraft.item.ItemStack)this.i).isItemStackDamageable();
   }

   @JSFunction(value = "isStackable", returns = "Whether the item can be stacked.")
   public boolean isValid() {
      return ((net.minecraft.item.ItemStack)this.i).isStackable();
   }

   @JSFunction(value = "hasEnchantments", returns = "Whether the item has enchantments.")
   public boolean isValid_2() {
      return ((net.minecraft.item.ItemStack)this.i).isItemEnchanted();
   }

   @JSFunction(value = "isTool", returns = "Whether the item is a tool or weapon.")
   public boolean isValid_3() {
      return ((net.minecraft.item.ItemStack)this.i).getItem().isDamageable();
   }

   @JSFunction(value = "isBlock", returns = "Whether the item is a block.")
   public boolean isValid_4() {
      return ((net.minecraft.item.ItemStack)this.i).getItem() instanceof ItemBlock;
   }

   @JSFunction(value = "getRemainingDurability", returns = "The remaining durability of the item.")
   public int calculate() {
      return ((net.minecraft.item.ItemStack)this.i).getMaxDamage() - ((net.minecraft.item.ItemStack)this.i).getItemDamage();
   }

   @JSFunction(value = "isBroken", returns = "Whether the item is broken.")
   public boolean checkCondition() {
      return ((net.minecraft.item.ItemStack)this.i).isItemDamaged()
         && ((net.minecraft.item.ItemStack)this.i).getItemDamage() >= ((net.minecraft.item.ItemStack)this.i).getMaxDamage();
   }

   @JSFunction(value = "exists", returns = "Whether the item exists (not null/empty).")
   public boolean isValid_5() {
      return ((net.minecraft.item.ItemStack)this.i).getItem() != null;
   }

   @JSFunction(value = "isSword", returns = "Whether the item is a sword.")
   public boolean isValid_6() {
      return ((net.minecraft.item.ItemStack)this.i).getItem() instanceof ItemSword;
   }

   @JSFunction(value = "isAxe", returns = "Whether the item is an axe.")
   public boolean isValid_7() {
      return ((net.minecraft.item.ItemStack)this.i).getItem() instanceof ItemAxe;
   }

   @JSFunction(value = "isShovel", returns = "Whether the item is a shovel.")
   public boolean isValid_8() {
      return ((net.minecraft.item.ItemStack)this.i).getItem() instanceof ItemSpade;
   }

   @JSFunction(value = "isPickaxe", returns = "Whether the item is a pickaxe.")
   public boolean isValid_9() {
      return ((net.minecraft.item.ItemStack)this.i).getItem() instanceof ItemPickaxe;
   }

   @JSFunction(value = "isHoe", returns = "Whether the item is a hoe.")
   public boolean isValid_10() {
      return ((net.minecraft.item.ItemStack)this.i).getItem() instanceof ItemHoe;
   }

   @JSFunction(value = "setNBTData", description = "Sets the NBT data of the item.")
   public String buildString() {
      ((net.minecraft.item.ItemStack)this.i).setTagCompound(new NBTTagCompound());
      return ((net.minecraft.item.ItemStack)this.i).getTagCompound() == null ? "" : ((net.minecraft.item.ItemStack)this.i).getTagCompound().toString();
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_Q;
   }

   static {
      long var0 = 3901530060205L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ÐX×\u001e ç\u000bÍ\u0017Ã\u001a>à\u008a\u0089\u0013".getBytes("ISO-8859-1"));
      String var5 = buildString_2(var4).intern();
      byte var10001 = -1;
      CONST_Q = var5;
   }

   private static String buildString_2(byte[] var0) {
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
