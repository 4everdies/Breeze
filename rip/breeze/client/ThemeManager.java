package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C02PacketUseEntity.Action;
import rip.breeze.KeepParameters;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

public final class ThemeManager {
   private final int[] arr_a = new int[9];
   private final Util133 dataBuilder112_b = new Util133();
   private int fieldInt_c = 0;
   private int fieldInt_d = 0;
   private int fieldInt_e = -1;
   private Entity entity_f;
   private float fieldFloat_g = 10.0F;
   private static String[] arr_h;
   private static final long[] CONST_J;
   private static final Long[] CONST_K;
   private static final Map CONST_L = new HashMap(13);

   @KeepParameters
   public void getDistance() {
      long var1;
      label27: {
         var1 = 23942213615268L;
         boolean var3 = ConfigManager.checkCondition_3();
         if (BreezeClient.CONST_A.thePlayer.onGround) {
            this.fieldInt_d++;
            this.fieldInt_c = 0;
            if (var3) {
               break label27;
            }
         }

         this.fieldInt_d = 0;
         this.fieldInt_c++;
      }

      if (this.entity_f != null) {
         if (this.entity_f.isDead
            || !BreezeClient.CONST_A.theWorld.loadedEntityList.contains(this.entity_f)
            || this.dataBuilder112_b.isValid(1000L)
            || this.entity_f.getDistanceToEntity(BreezeClient.CONST_A.thePlayer) > this.fieldFloat_g) {
            this.entity_f = null;
         }
      }
   }

   @KeepParameters
   public void calculate(Packet<?> var1) {
      long var2 = 110820620658978L;
      boolean var4 = ConfigManager.checkCondition_3();
      if (var1 instanceof C02PacketUseEntity) {
         C02PacketUseEntity var5 = (C02PacketUseEntity)var1;
         if (((C02PacketUseEntity)var1).getAction() != Action.ATTACK) {
            return;
         }

         Entity var6 = var5.getEntityFromWorld(BreezeClient.CONST_A.theWorld);
         if (!(var6 instanceof EntityPlayer)) {
            return;
         }

         this.processAll(var6, 10.0F);
         if (var4) {
            return;
         }
      }

      if (var1 instanceof C08PacketPlayerBlockPlacement) {
         C08PacketPlayerBlockPlacement var8 = (C08PacketPlayerBlockPlacement)var1;
         if (var8.getPosition() == null) {
            return;
         }

         if (var8.getPosition().getY() < 0) {
            return;
         }

         ItemStack var9 = var8.getStack();
         if (var9 == null || !(var9.getItem() instanceof ItemBlock)) {
            return;
         }

         this.arr_a[BreezeClient.CONST_A.thePlayer.inventory.currentItem] = this.arr_a[BreezeClient.CONST_A.thePlayer.inventory.currentItem] + 2;
         int var7 = this.getValue_2();
         if (var7 > 0
            && BreezeClient.CONST_A.thePlayer.inventory.currentItem != var7
            && this.arr_a[var7] > this.arr_a[BreezeClient.CONST_A.thePlayer.inventory.currentItem] / 2) {
            this.arr_a[var7]--;
         }

         this.fieldInt_e = -1;
         this.fieldInt_e = this.getValue_2();
      }
   }

   @KeepParameters
   public void calculate_2() {
      long var1 = 138916714266103L;
      int var3 = 0;
      int[] var4 = this.arr_a;
      int var5 = var4.length;
      boolean var10000 = ConfigManager.isValid();
      int var6 = 0;
      boolean var7 = var10000;

      while (var6 < var5) {
         int var8 = var4[var6];
         var3 += var8;
         var6++;
         if (var7) {
            break;
         }
      }

      var3 /= this.arr_a.length;
      int var10 = 0;

      while (var10 < this.arr_a.length) {
         this.arr_a[var10] = this.arr_a[var10] - var3;
         if (this.arr_a[var10] < 0) {
            this.arr_a[var10] = 0;
         }

         var10++;
         if (var7) {
            break;
         }
      }

      this.entity_f = null;
   }

   public int getInt_c() {
      return this.fieldInt_c;
   }

   public int getInt_d() {
      return this.fieldInt_d;
   }

   public int getValue(int var1, List<Block> var2) {
      long var3 = 99313194986192L;
      boolean var5 = ConfigManager.isValid();
      if (var1 < 0) {
         var1 = 1;
      }

      if (var1 > this.arr_a.length) {
         var1 = this.arr_a.length;
      }

      if (var1 == 1 && this.fieldInt_e >= 0) {
         ItemStack var6 = BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(this.fieldInt_e);
         if (var6 != null && var6.getItem() instanceof ItemBlock) {
            Block var7 = ((ItemBlock)var6.getItem()).getBlock();
            if (var2 == null || !var2.contains(var7)) {
               return this.fieldInt_e;
            }
         }
      }

      int var16 = -1;
      int var17 = 0;

      while (var17 < this.arr_a.length) {
         ItemStack var8 = BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var17);
         if (var8 != null && (var8.getItem() instanceof ItemBlock || var5)) {
            Block var9 = ((ItemBlock)var8.getItem()).getBlock();
            if ((var2 == null || !var2.contains(var9) || var5) && (var16 < 0 || this.arr_a[var17] > this.arr_a[var16])) {
               var16 = var17;
            }
         }

         var17++;
         if (var5) {
            break;
         }
      }

      if (var1 != 1 && var16 >= 0) {
         var17 = var16;
         var1--;
         int var19 = 0;

         while (var19 < var1) {
            int var20 = this.arr_a[var17];
            int var10 = var17;
            var17 = -1;
            int var11 = 0;

            while (var11 < this.arr_a.length) {
               int var12 = this.arr_a[var11];
               if (var11 != var10 && (var12 <= var20 || var5)) {
                  ItemStack var13 = BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var11);
                  if (var13 != null && (var13.getItem() instanceof ItemBlock || var5)) {
                     Block var14 = ((ItemBlock)var13.getItem()).getBlock();
                     if ((var2 == null || !var2.contains(var14) || var5) && (var17 < 0 || var12 > this.arr_a[var17])) {
                        var17 = var11;
                     }
                  }
               }

               var11++;
               if (var5) {
                  break;
               }
            }

            if (var17 < 0 && !var5) {
               break;
            }

            var19++;
            if (var5) {
               break;
            }
         }

         return var17;
      } else {
         return var16;
      }
   }

   public int getValue_2() {
      return this.getValue(1, null);
   }

   public boolean getHeldItem(EntityPlayer var1) {
      long var2 = 78622413883200L;
      ItemStack var4 = var1.getHeldItem();
      return var4 == null ? false : var4.getItem() instanceof ItemSword || var4.getItem() instanceof ItemAxe || var4.getItem() == Items.stick;
   }

   public int getValue_3() {
      long var1 = 55279434351007L;
      boolean var10000 = ConfigManager.isValid();
      ItemStack var3 = BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(BreezeClient.CONST_A.thePlayer.inventory.currentItem);
      boolean var4 = var10000;
      if (var3 != null && var3.getItem() instanceof ItemBlock) {
         Block var5 = ((ItemBlock)var3.getItem()).getBlock();
         Material var6 = var5.getMaterial();
         if (var6.isSolid() && !var6.isReplaceable()) {
            return BreezeClient.CONST_A.thePlayer.inventory.currentItem;
         }
      }

      int var10 = 0;

      while (var10 < 9) {
         if (var10 != BreezeClient.CONST_A.thePlayer.inventory.currentItem || var4) {
            int var11 = this.getValue(var10, BlockUtil6.CONST_A);
            if (var11 < 0) {
               return var10 == 1 ? -1 : this.getValue_2();
            }

            ItemStack var7 = BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var11);
            if (var7 != null && (var7.getItem() instanceof ItemBlock || var4)) {
               Block var8 = ((ItemBlock)var7.getItem()).getBlock();
               Material var9 = var8.getMaterial();
               if (var9.isSolid() && !var9.isReplaceable()) {
                  return var11;
               }
            }
         }

         var10++;
         if (var4) {
            break;
         }
      }

      return BreezeClient.CONST_A.thePlayer.inventory.currentItem;
   }

   public Entity getEntity() {
      long var1 = 39609082419295L;
      if (this.dataBuilder112_b.isValid(1000L)) {
         this.entity_f = null;
      }

      return this.entity_f;
   }

   public void processAll(Entity var1, float var2) {
      this.dataBuilder112_b.getDataBuilder112();
      this.entity_f = var1;
      this.fieldFloat_g = var2;
   }

   public void processAll_1(Entity var1) {
      this.processAll(var1, Float.MAX_VALUE);
   }

   public static void initialize(String[] var0) {
      arr_h = var0;
   }

   public static String[] getThemeNames() {
      return arr_h;
   }

   static {
      initialize(null);
      long var0 = 19341115288473L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var4 = new long[2];
      int var5 = 0;
      String var6 = "ú&ÆÔëÎ\u0007Üy\u0092ÿ.D@\f-";
      int var7 = "ú&ÆÔëÎ\u0007Üy\u0092ÿ.D@\f-".length();
      byte var8 = 0;

      do {
         int var10001 = var8;
         var8 += 8;
         byte[] var9 = var6.substring(var10001, var8).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)(var10 >>> 56),
               (byte)(var10 >>> 48),
               (byte)(var10 >>> 40),
               (byte)(var10 >>> 32),
               (byte)(var10 >>> 24),
               (byte)(var10 >>> 16),
               (byte)(var10 >>> 8),
               (byte)var10
            }
         );
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var14 = -1;
         var4[var10001] = var10004;
      } while (var8 < var7);

      CONST_J = var4;
      CONST_K = new Long[2];
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22078;
      if (CONST_K[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = CONST_J[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])CONST_L.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_L.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/es", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_K[var3] = var14;
      }

      return CONST_K[var3];
   }

   private static long getLong(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = decrypt(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getLong".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/es" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
