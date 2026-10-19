package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;

@ScriptObject(name = "InventoryPlayer", description = "The player's inventory.", group = "net/minecraft/client/entity")
public class InventoryPlayer extends StringBuilderUtil<net.minecraft.entity.player.InventoryPlayer> {
   private static final String CONST_Q;

   public InventoryPlayer(net.minecraft.entity.player.InventoryPlayer var1) {
      super(var1);
   }

   @JSGetter(value = "hotBarSize", description = "The number of slots in the hotbar (always 9).")
   public int getValue() {
      return 9;
   }

   @JSGetter(value = "currentItem", description = "The currently selected hotbar slot index (0-8).")
   public int getValue_2() {
      return ((net.minecraft.entity.player.InventoryPlayer)this.i).currentItem;
   }

   @JSSetter("currentItem")
   public void initialize(int var1) {
      ((net.minecraft.entity.player.InventoryPlayer)this.i).currentItem = var1;
   }

   @JSFunction(value = "getCurrentSlot", returns = "The currently selected hotbar slot index (0-8).")
   public int getValue_3() {
      return ((net.minecraft.entity.player.InventoryPlayer)this.i).currentItem;
   }

   @JSFunction(value = "getStackInSlot", returns = "The ItemStack in the given slot, or null if empty.")
   public ItemStack getBreezeUtil68(int var1) {
      net.minecraft.item.ItemStack var2 = ((net.minecraft.entity.player.InventoryPlayer)this.i).getStackInSlot(var1);
      return var2 == null ? null : (ItemStack)ItemStack.c(var2);
   }

   @JSFunction(value = "getSizeInventory", returns = "The total number of inventory slots (main + armor = 40).")
   public int getValue_4() {
      return ((net.minecraft.entity.player.InventoryPlayer)this.i).func_70302_i_();
   }

   @JSFunction(value = "getTotalArmorValue", returns = "The total armor value (defense points) of the player's equipped armor.")
   public int getValue_5() {
      return ((net.minecraft.entity.player.InventoryPlayer)this.i).getTotalArmorValue();
   }

   @JSFunction(value = "dropAllItems", description = "Drops all items from the player's inventory.")
   public void initialize_2() {
      ((net.minecraft.entity.player.InventoryPlayer)this.i).dropAllItems();
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_Q;
   }

   static {
      long var0 = 102548578350235L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("iË\u008cí«K\u0096f@Óî\u0092\u008c¨?Ä".getBytes("ISO-8859-1"));
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
