package rip.breeze;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.inventory.Slot;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;

@ScriptObject(name = "Slot", description = "A slot in an inventory.", group = "net/minecraft/inventory")
public class BlockUtil3 extends StringBuilderUtil<Slot> {
   private static final String CONST_Q;

   public BlockUtil3(Slot var1) {
      super(var1);
   }

   @JSFunction(value = "getStack", returns = "The stack in this slot.")
   public ItemStack getBreezeUtil68() {
      return (ItemStack)ItemStack.c(((Slot)this.i).getStack());
   }

   @JSGetter(value = "slotNumber", description = "The index of this slot.")
   public int getValue() {
      return ((Slot)this.i).slotNumber;
   }

   @JSGetter(value = "xDisplayPosition", description = "The X position of this slot.")
   public int getValue_2() {
      return ((Slot)this.i).xDisplayPosition;
   }

   @JSGetter(value = "yDisplayPosition", description = "The Y position of this slot.")
   public int getValue_3() {
      return ((Slot)this.i).yDisplayPosition;
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return CONST_Q;
   }

   static {
      long var0 = 50793609514897L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u000eoX¸[\u00901Å".getBytes("ISO-8859-1"));
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
