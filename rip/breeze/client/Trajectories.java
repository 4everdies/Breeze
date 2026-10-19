package rip.breeze.client;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "Trajectories", b = "Draws the predicted trajectories of your bow shots or pearls.", d = rip.breeze.ModuleCategory.VISUAL)
public class Trajectories extends BreezeModule {
   private final GenericSetting<Boolean> onlySelfSetting;
   private final GenericSetting<rip.breeze.BreezeColor> colorSetting;
   private static final String[] CONST_Q;
   private static final String[] CONST_R;
   private static final Map CONST_S = new HashMap(13);
   private static final long eka_1;

   public Trajectories() {
      long var1 = 76457243280317L;
      super();
      short var10002 = 4891;
      long var10003 = 5401807193660922684L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "OnlySelf");
      var10002 = 25832;
      var10003 = 1625634223007362252L ^ var1;
      this.onlySelfSetting = var10001.getDataBuilder50_3("Only renders trajectories for projectiles you're holding.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      var10002 = 19791;
      var10003 = 3224594711444637034L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Color");
      var10002 = 28700;
      var10003 = 9041567196231563322L ^ var1;
      this.colorSetting = var10001.getDataBuilder50_3("The color to render the trajectory lines.")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(40, 190, 40, 220))
         .getDataBuilder50_8()
         .getDataBuilder54();
   }

   @EventListener
   public void processAll(Render3DEventEvent var1) {
      if (!this.onlySelfSetting.getObject_m()) {
         BreezeClient.CONST_A.theWorld.playerEntities.stream().filter(AntiBot::isInvisible_2).forEach(this::lambda$onRender3D_Inner0);
         this.updateRotation(var1.fieldFloat_h, BreezeClient.CONST_A.thePlayer);
      } else {
         this.updateRotation(var1.fieldFloat_h, BreezeClient.CONST_A.thePlayer);
      }
   }

   private void updateRotation(float var1, EntityPlayer var2) {
      long var3 = 59459069921881L;
      ArrayList var5 = new ArrayList();
      ItemStack var6 = var2.getHeldItem();
      if (var6 != null) {
         Item var7 = var6.getItem();
         if (var7 != null && this.isValid(var7)) {
            double var8 = Math.toRadians(var2.prevRotationYaw + (var2.rotationYaw - var2.prevRotationYaw) * var1);
            double var10 = Math.toRadians(var2.prevRotationPitch + (var2.rotationPitch - var2.prevRotationPitch) * var1);
            double var12 = var2.lastTickPosX + (var2.posX - var2.lastTickPosX) * var1 - Math.cos(var8) * 0.16;
            double var14 = var2.lastTickPosY + (var2.posY - var2.lastTickPosY) * var1 + var2.getEyeHeight() - 0.1;
            double var16 = var2.lastTickPosZ + (var2.posZ - var2.lastTickPosZ) * var1 - Math.sin(var8) * 0.16;
            double var18 = var7 == Items.bow ? 1.0 : 0.4;
            double var20 = -Math.sin(var8) * Math.cos(var10) * var18;
            double var22 = -Math.sin(var10) * var18;
            double var24 = Math.cos(var8) * Math.cos(var10) * var18;
            double var26 = Math.sqrt(var20 * var20 + var22 * var22 + var24 * var24);
            var20 /= var26;
            var22 /= var26;
            var24 /= var26;
            if (var7 == Items.bow) {
               float var28 = ((int)8718480454908451136L - var2.getItemInUseCount()) / 20.0F;
               var28 = (var28 * var28 + var28 * 2.0F) / 3.0F;
               if (var28 > 1.0F || var28 <= 0.1F) {
                  var28 = 1.0F;
               }

               var28 *= 3.0F;
               var20 *= var28;
               var22 *= var28;
               var24 *= var28;
            } else {
               var20 *= 1.5;
               var22 *= 1.5;
               var24 *= 1.5;
            }

            double var29 = this.getDouble(var7);
            Vec3 var31 = BreezeClient.CONST_A.thePlayer.getPositionEyes(var1);

            for (int var32 = 0; var32 < 200; var32++) {
               Vec3 var33 = new Vec3(var12, var14, var16);
               var12 += var20;
               var14 += var22;
               var16 += var24;
               var20 *= 0.99004444;
               var22 *= 0.99004444;
               var24 *= 0.99004444;
               var22 -= var29;
               MovingObjectPosition var34 = BreezeClient.CONST_A.theWorld.rayTraceBlocks(var31, var33, false, true, false);

               for (Entity var36 : new ArrayList(BreezeClient.CONST_A.theWorld.loadedEntityList)) {
                  if (var36 != var2 && var36.canBeCollidedWith()) {
                     MovingObjectPosition var37 = var36.getEntityBoundingBox().calculateIntercept(var31, var33);
                     if (var37 != null) {
                        var34 = new MovingObjectPosition(var36, var37.hitVec);
                        break;
                     }
                  }
               }

               if (var34 != null) {
                  if (var34.entityHit != null && var34.entityHit != BreezeClient.CONST_A.thePlayer) {
                     RenderUtil31.calculate_2(BlockUtil7.getHitbox(var34.entityHit, var1), this.colorSetting.getObject_m(), false);
                  } else {
                     this.calculate(var34.hitVec, var34.sideHit, this.colorSetting.getObject_m());
                  }

                  var5.add(var34.hitVec);
                  break;
               }

               var5.add(var33);
               var31 = var33;
            }

            RenderUtil31.calculate_4(var5, this.colorSetting.getObject_m(), 2.0F);
         }
      }
   }

   private double getDouble(Item var1) {
      return var1 == Items.bow ? 0.05 : 0.03;
   }

   private boolean isValid(Item var1) {
      return var1 == Items.bow || var1 == Items.snowball || var1 == Items.egg || var1 == Items.ender_pearl;
   }

   public void calculate(Vec3 var1, net.minecraft.util.EnumFacing var2, Color var3) {
      double var4 = var1.xCoord;
      double var6 = var1.yCoord;
      double var8 = var1.zCoord;
      if (var2 != null) {
         double var10 = var2.getFrontOffsetX() == 0 ? 0.3 : 0.0;
         double var12 = var2.getFrontOffsetY() == 0 ? 0.3 : 0.0;
         double var14 = var2.getFrontOffsetZ() == 0 ? 0.3 : 0.0;
         RenderUtil31.calculate_2(new AxisAlignedBB(var4 - var10, var6 - var12, var8 - var14, var4 + var10, var6 + var12, var8 + var14), var3, false);
      }
   }

   private void lambda$onRender3D_Inner0(Render3DEventEvent var1, EntityPlayer var2) {
      this.updateRotation(var1.fieldFloat_h, var2);
   }

   static {
      long var0 = 114358504472873L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "Å\u0011Éÿ¾)rI\u0085\u0013C¬.\u009b\u009c\u001f)\u0019e\u0003\u000e@ìãç\u0086 ¾´òr\u0096<<I²S\u000fÙ*÷ñÓÐÕ«³\u0016Ju½ÿ\u0087p+û^\u0093x\u0003u\u0080ÞE\u0088#z\u0002\u0006-\u0013¶\u0012Ï\u0013\u001ch\u000fî\u0094'´\u0087¿£ã\u0098Pß;\u0095~L0Ý5´nq\u0013+\u0017¦p\u0010É+¾øø÷\u0084\u0093ú\u0090Ë0XÎ\u0091\u009d";
      int var7 = "Å\u0011Éÿ¾)rI\u0085\u0013C¬.\u009b\u009c\u001f)\u0019e\u0003\u000e@ìãç\u0086 ¾´òr\u0096<<I²S\u000fÙ*÷ñÓÐÕ«³\u0016Ju½ÿ\u0087p+û^\u0093x\u0003u\u0080ÞE\u0088#z\u0002\u0006-\u0013¶\u0012Ï\u0013\u001ch\u000fî\u0094'´\u0087¿£ã\u0098Pß;\u0095~L0Ý5´nq\u0013+\u0017¦p\u0010É+¾øø÷\u0084\u0093ú\u0090Ë0XÎ\u0091\u009d"
         .length();
      char var8 = 'h';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var26;
                  if ((var17 += var8) >= var7) {
                     CONST_Q = var4;
                     CONST_R = new String[4];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 2836732940926016270L;
                     byte[] var15 = var11.doFinal(
                        new byte[]{
                           (byte)(var13 >>> 56),
                           (byte)(var13 >>> 48),
                           (byte)(var13 >>> 40),
                           (byte)(var13 >>> 32),
                           (byte)(var13 >>> 24),
                           (byte)(var13 >>> 16),
                           (byte)(var13 >>> 8),
                           (byte)var13
                        }
                     );
                     long var30 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     8718480454908451136L = var30;
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var26;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "Ýñ\u0098d©G>\"\u0002Ñ7\u001e\u0087'à\u0097-¢QÝû¶\u0018\u0019\u001bÀ«¯ÿÂpSnòöÉì4\u009dI\u0011\u008aî?ãÓ-)Ãì¸\rp\u0012ºaïrN\u008b6\u001a®\u0000\u008bk=\u001fÝéÛ\u009bg$\u007fÒä\u0085\u000fò ²\u009f!\u0084ô\u0017!ýd¯^EÀ7\u0013}á@\u0084´ñÛ1\u0000a¥%\u0083kP\u009br";
                  var7 = "Ýñ\u0098d©G>\"\u0002Ñ7\u001e\u0087'à\u0097-¢QÝû¶\u0018\u0019\u001bÀ«¯ÿÂpSnòöÉì4\u009dI\u0011\u008aî?ãÓ-)Ãì¸\rp\u0012ºaïrN\u008b6\u001a®\u0000\u008bk=\u001fÝéÛ\u009bg$\u007fÒä\u0085\u000fò ²\u009f!\u0084ô\u0017!ýd¯^EÀ7\u0013}á@\u0084´ñÛ1\u0000a¥%\u0083kP\u009br"
                     .length();
                  var8 = 'P';
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2969;
      if (CONST_R[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_S.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_S.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/ed", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Q[var3].getBytes("ISO-8859-1");
         CONST_R[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_R[var3];
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
         throw new RuntimeException("rip/breeze/client/ed" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
