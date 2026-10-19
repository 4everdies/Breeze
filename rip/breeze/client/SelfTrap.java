package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(a = "SelfTrap", b = "Automatically blocks you in with blocks.", d = rip.breeze.ModuleCategory.MISC, c = {"blockin", "bedwars", "defence"})
public class SelfTrap extends BreezeModule implements IBreezeInterface2 {
   private final GenericSetting<Boolean> disableWhenHitSetting;
   private final GenericSetting<Boolean> disableWhenDoneSetting;
   private final GenericSetting<Boolean> disableWhenMovedSetting;
   private final GenericSetting<Integer> rotationSpeedSetting;
   private final GenericSetting<Integer> delaySetting;
   private final Util133 dataBuilder112_s;
   private float[] arr_t;
   private BlockPos blockPos_u;
   private int fieldInt_v;
   private int fieldInt_w;
   private static final String[] CONST_Y;
   private static final String[] CONST_Z;
   private static final Map CONST_A = new HashMap(13);

   public SelfTrap() {
      long var1 = 20587793813319L;
      super();
      short var10002 = 4273;
      long var10003 = 333400044166720484L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "DisableWhenHit");
      var10002 = 285;
      var10003 = 9060835055003253324L ^ var1;
      this.disableWhenHitSetting = var10001.getDataBuilder50_3("Disables the SelfTrap module when you are hit.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 23140;
      var10003 = 2545958000875233599L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "DisableWhenDone");
      var10002 = 6225;
      var10003 = 8667636958464353030L ^ var1;
      this.disableWhenDoneSetting = var10001.getDataBuilder50_3("Disables the SelfTrap module when you are done.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 27402;
      var10003 = 1609222388754993240L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "DisableWhenMoved");
      var10002 = 29855;
      var10003 = 4051493918814293957L ^ var1;
      this.disableWhenMovedSetting = var10001.getDataBuilder50_3("Disables the SelfTrap module when you move.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 12189;
      var10003 = 4978563657922909385L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "RotationSpeed");
      var10002 = 30876;
      var10003 = 4736041236173145034L ^ var1;
      this.rotationSpeedSetting = var10001.getDataBuilder50_3("The speed at which you rotate.")
         .getDataBuilder50_4(40)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(10, 100))
         .getDataBuilder54();
      var10002 = 19346;
      var10003 = 7207803457617490114L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Delay");
      var10002 = 20765;
      var10003 = 3349993120094743118L ^ var1;
      this.delaySetting = var10001.getDataBuilder50_3("The delay in between placing blocks.")
         .getDataBuilder50_4(150)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 1000))
         .getDataBuilder54();
      this.dataBuilder112_s = new Util133();
      this.arr_t = null;
      this.blockPos_u = null;
      this.fieldInt_v = -1;
      this.fieldInt_w = -1;
   }

   public void update() {
      long var1 = 73912092874623L;
      if (BreezeClient.isValid()) {
         this.b(false);
      } else {
         this.blockPos_u = new BlockPos(BreezeClient.CONST_A.thePlayer.posX, BreezeClient.CONST_A.thePlayer.posY, BreezeClient.CONST_A.thePlayer.posZ);
         BreezeClient.getModuleRegistry().applyRotation(this);
      }
   }

   public void update_1() {
      BreezeClient.getModuleRegistry().initialize(this);
      this.update();
   }

   public int getValue() {
      return 45;
   }

   public void updateRotation(ModuleRegistry var1) {
      long var2 = 117735033473270L;
      if (!BreezeClient.isValid() && !(BreezeClient.CONST_A.thePlayer.getHealth() <= 0.0F)) {
         BlockPos var4 = new BlockPos(BreezeClient.CONST_A.thePlayer.posX, BreezeClient.CONST_A.thePlayer.posY, BreezeClient.CONST_A.thePlayer.posZ);
         if (!this.disableWhenMovedSetting.getObject_m() || var4.getX() == this.blockPos_u.getX() && var4.getZ() == this.blockPos_u.getZ()) {
            var1.isActive(false);
            var1.isActive_2(true);
            int var5 = BreezeClient.getThemeManager().getValue_3();
            if (var5 == -1) {
               this.update();
            } else if (BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var5) != null
               && BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var5).getItem() instanceof ItemBlock) {
               if (this.fieldInt_v == -1) {
                  this.fieldInt_v = BreezeClient.CONST_A.thePlayer.inventory.currentItem;
                  this.fieldInt_w = var5;
               }

               if (BreezeClient.CONST_A.thePlayer.inventory.currentItem != var5) {
                  BreezeClient.CONST_A.thePlayer.inventory.currentItem = var5;
               }

               ItemStack var6 = BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var5);
               ItemBlock var7 = (ItemBlock)BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var5).getItem();
               WorldUtil4 var8 = this.rayTrace(var7);
               if (var8 == null) {
                  this.update();
               } else {
                  this.arr_t = RotationUtil7.getAnglesTo(var8.vec3_b, BreezeClient.CONST_A.thePlayer);
                  var1.absValue(this.arr_t[0], this.arr_t[1], this.rotationSpeedSetting.getObject_m().intValue());
                  if (this.dataBuilder112_s.isValid(this.delaySetting.getObject_m().intValue())) {
                     if (BreezeClient.CONST_A.objectMouseOver != null
                        && BreezeClient.CONST_A.objectMouseOver.getBlockPos() != null
                        && BreezeClient.CONST_A.objectMouseOver.typeOfHit == MovingObjectType.BLOCK) {
                        if (BreezeClient.CONST_A.objectMouseOver.getBlockPos().equals(var8.blockPos_a)
                           && BreezeClient.CONST_A.objectMouseOver.sideHit == var8.enumFacing_c) {
                           if (BreezeClient.CONST_A
                              .playerController
                              .onPlayerRightClick(
                                 BreezeClient.CONST_A.thePlayer,
                                 BreezeClient.CONST_A.theWorld,
                                 BreezeClient.CONST_A.thePlayer.getHeldItem(),
                                 var8.blockPos_a,
                                 var8.enumFacing_c,
                                 BreezeClient.CONST_A.objectMouseOver.hitVec
                              )) {
                              this.dataBuilder112_s.getDataBuilder112();
                              BreezeClient.CONST_A.thePlayer.swingItem();
                              if (var6.stackSize == 0) {
                                 BreezeClient.CONST_A.thePlayer.inventory.setInventorySlotContents(var5, null);
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               this.update();
            }
         } else {
            this.b(false);
         }
      } else {
         this.b(false);
      }
   }

   @EventListener
   public void updateRotation_2(PacketReceiveEventEvent var1) {
      long var2 = 53323036204772L;
      if (this.disableWhenHitSetting.getObject_m() && var1.packet_h instanceof S12PacketEntityVelocity) {
         S12PacketEntityVelocity var4 = (S12PacketEntityVelocity)var1.packet_h;
         if (var4.getEntityID() == BreezeClient.CONST_A.thePlayer.getEntityId()) {
            this.b(false);
         }
      }
   }

   private void update() {
      long var1 = 83987786341414L;
      if (this.fieldInt_v != -1 && this.fieldInt_w == BreezeClient.CONST_A.thePlayer.inventory.currentItem) {
         BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_v;
      }

      this.fieldInt_v = -1;
      this.fieldInt_w = -1;
   }

   private WorldUtil4 rayTrace(ItemBlock var1) {
      long var2 = 109782310422000L;
      int var10000 = AntiBot.getValue();
      MovingObjectPosition var4 = BreezeClient.CONST_A
         .theWorld
         .rayTraceBlocks(
            BreezeClient.CONST_A.thePlayer.getPositionVector(),
            BreezeClient.CONST_A.thePlayer.getPositionVector().addVector(0.0, -10.0, 0.0),
            false,
            false,
            false
         );
      int var5 = var10000;
      if (var4 != null && var4.typeOfHit == MovingObjectType.BLOCK) {
         BlockPos var6 = new BlockPos(BreezeClient.CONST_A.thePlayer.posX, var4.hitVec.yCoord, BreezeClient.CONST_A.thePlayer.posZ);
         Vec3 var7 = new Vec3(
            BreezeClient.CONST_A.thePlayer.posX,
            BreezeClient.CONST_A.thePlayer.posY + BreezeClient.CONST_A.thePlayer.getEyeHeight(),
            BreezeClient.CONST_A.thePlayer.posZ
         );
         float var8 = 0.0F;
         WorldUtil4 var9 = null;
         BlockPos var10 = var6.up(2);
         boolean var11 = !BreezeClient.CONST_A.theWorld.getBlockState(var10).getBlock().getMaterial().isReplaceable();
         boolean var12 = false;
         boolean var13 = false;
         if (!var11) {
            WorldUtil4 var14 = null;

            for (net.minecraft.util.EnumFacing var18 : net.minecraft.util.EnumFacing.values()) {
               BlockPos var19 = var10.offset(var18.getOpposite());
               IBlockState var20 = BreezeClient.CONST_A.theWorld.getBlockState(var19);
               if (!var20.getBlock().isReplaceable(BreezeClient.CONST_A.theWorld, var19)) {
                  var12 = true;
                  Vec3 var21 = new Vec3(
                     var19.getX() + 0.5 + var18.getDirectionVec().getX() * 0.5,
                     var19.getY() + 0.5 + var18.getDirectionVec().getY() * 0.5,
                     var19.getZ() + 0.5 + var18.getDirectionVec().getZ() * 0.5
                  );
                  MovingObjectPosition var22 = BreezeClient.CONST_A.theWorld.rayTraceBlocks(var7, var21, false, false, false);
                  if ((var22 == null || var5 != 0)
                     && (
                        var1.canPlaceBlockOnSide(
                              BreezeClient.CONST_A.theWorld,
                              var19.offset(var18),
                              var18,
                              BreezeClient.CONST_A.thePlayer,
                              BreezeClient.CONST_A.thePlayer.getHeldItem()
                           )
                           || var5 != 0
                     )) {
                     var14 = new WorldUtil4(this, var19, var21, var18);
                     break;
                  }
               }
            }

            if (var14 != null) {
               return var14;
            }

            if (!var12) {
               for (net.minecraft.util.EnumFacing var43 : net.minecraft.util.EnumFacing.values()) {
                  BlockPos var45 = var6.up().offset(var43);
                  IBlockState var47 = BreezeClient.CONST_A.theWorld.getBlockState(var45);
                  if (!var47.getBlock().isReplaceable(BreezeClient.CONST_A.theWorld, var45)) {
                     var13 = true;
                     if (var5 == 0) {
                        break;
                     }
                  }

                  if (var5 != 0) {
                     break;
                  }
               }
            }

            if (var13 && BreezeClient.CONST_A.thePlayer.onGround) {
               BreezeClient.CONST_A.thePlayer.jump();
            }
         }

         boolean var36 = BreezeClient.CONST_A.thePlayer.onGround && var11;
         int var38 = var13 ? 2 : -1;

         label138:
         while (var38 < (!var12 && !var11 ? 3 : 2)) {
            net.minecraft.util.EnumFacing[] var40 = net.minecraft.util.EnumFacing.values();
            int var42 = var40.length;
            int var44 = 0;

            while (true) {
               if (var44 < var42) {
                  net.minecraft.util.EnumFacing var46 = var40[var44];
                  if (var46 != net.minecraft.util.EnumFacing.DOWN && (var46 != net.minecraft.util.EnumFacing.UP || var5 != 0)) {
                     BlockPos var48 = var6.offset(var46).up(var38);
                     IBlockState var49 = BreezeClient.CONST_A.theWorld.getBlockState(var48);
                     if (var49.getBlock().isReplaceable(BreezeClient.CONST_A.theWorld, var48) || var5 != 0) {
                        var36 = false;
                        WorldUtil4 var50 = null;
                        float var23 = 0.0F;

                        for (net.minecraft.util.EnumFacing var27 : net.minecraft.util.EnumFacing.values()) {
                           BlockPos var28 = var48.offset(var27.getOpposite());
                           IBlockState var29 = BreezeClient.CONST_A.theWorld.getBlockState(var28);
                           if (!var29.getBlock().isReplaceable(BreezeClient.CONST_A.theWorld, var28) || var5 != 0) {
                              Vec3 var30 = new Vec3(
                                 var28.getX() + 0.5 + var27.getDirectionVec().getX() * 0.5,
                                 var28.getY() + 0.5 + var27.getDirectionVec().getY() * 0.5,
                                 var28.getZ() + 0.5 + var27.getDirectionVec().getZ() * 0.5
                              );
                              MovingObjectPosition var31 = BreezeClient.CONST_A.theWorld.rayTraceBlocks(var7, var30, false, false, false);
                              if ((var31 == null || var5 != 0)
                                 && (
                                    var1.canPlaceBlockOnSide(
                                          BreezeClient.CONST_A.theWorld,
                                          var28,
                                          var27,
                                          BreezeClient.CONST_A.thePlayer,
                                          BreezeClient.CONST_A.thePlayer.getHeldItem()
                                       )
                                       || var5 != 0
                                 )) {
                                 float[] var32 = RotationUtil7.getAnglesTo(var30, BreezeClient.CONST_A.thePlayer);
                                 float var33 = var32[0] - BreezeClient.getModuleRegistry().getFloat_g();
                                 float var34 = var32[1] - BreezeClient.getModuleRegistry().getFloat();
                                 float var35 = (float)Math.sqrt(var33 * var33 + var34 * var34);
                                 if (var50 == null || var35 < var23) {
                                    var50 = new WorldUtil4(this, var28, var30, var27);
                                    var23 = var35;
                                 }
                              }
                           }

                           if (var5 != 0) {
                              break;
                           }
                        }

                        if (var50 != null && (var9 == null || var23 < var8)) {
                           var9 = var50;
                           var8 = var23;
                        }
                     }
                  }

                  var44++;
                  if (var5 == 0) {
                     continue;
                  }
               }

               var38++;
               if (var5 != 0) {
                  break label138;
               }
               break;
            }
         }

         if (var9 == null && var36 && this.disableWhenDoneSetting.getObject_m()) {
            this.b(false);
         }

         return var9;
      } else {
         return null;
      }
   }

   static {
      long var0 = 97327052989746L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[10];
      int var5 = 0;
      String var6 = "@X¢GsÃ\u0015³\u001dS7\u009fP\u0005>¾Áò\u0088ß¶\u0081úwk\u001d`Þ ßý8Ç\bê{3\u0094$²@\rxÓ0:\u0012Xer\u009b+¢#°\u0015\u001e\u0015\u0005\u008b,T\u001ee\u001cü\u0082\u008a\u0000úÞ¤\u008e?fÞÓ]g\u0088?Eñ~ã>(ß\u0098xV\u0006$ý\u007fS±\u0094\u008b+2j\u008cYX\u0010=Ø\u0089Ù1\u0089l¹Í\u001a~°\u0095À\u001a,P6ýØ\u009b²\u0099Xþ¥\u009b~\u009djCì\u009fP_³\u009c#÷Áÿ=\\ ¼\u0092\u001cL\u0002\u0006\u0093ºÁ\u0007öÏQ\u0081\u00adsB¾|Â\u0002=íôU£Öiw¡øÂb!\u008bf Ñ!*´\u0001¥¨\u0013g¦\u009cþ\u0019\u0092£ã8â\u000f/\u001f\u001e\u0082[/`Æ\bB:\u007f\u001eï;Ó\u0082Pâ,<cw\u0010K-½\u0000ªi\u0081ñ`4¢ÝK¯ ©çÝyÚýÑ¡0T§(;\u0095áP#\u001d\u001aG\u0096¬\u008e\t±)+Ïp\u00990°!|ì\u001d0½õ4\u008e\u0084²ñÔ)]\u0096øïÙc×Iý¹áD G:+¨2î\ba«=ßo\u0090þ^6âî{J\u0083â\nS~Êu×\u0097\u0005!\u00ad\u0098\u000e\u0001\u0015> ë$MÏ \u0089°\u0095%\u0093ìñ\u0092Ñ#\u0089\u0088zd´\u0088\u0083f*®¯F}îHCE N¸¯i ðD\u0085ü\u0099'ÝwÒý+z>bøw Qà\u009bfFõ*y\u00164";
      int var7 = "@X¢GsÃ\u0015³\u001dS7\u009fP\u0005>¾Áò\u0088ß¶\u0081úwk\u001d`Þ ßý8Ç\bê{3\u0094$²@\rxÓ0:\u0012Xer\u009b+¢#°\u0015\u001e\u0015\u0005\u008b,T\u001ee\u001cü\u0082\u008a\u0000úÞ¤\u008e?fÞÓ]g\u0088?Eñ~ã>(ß\u0098xV\u0006$ý\u007fS±\u0094\u008b+2j\u008cYX\u0010=Ø\u0089Ù1\u0089l¹Í\u001a~°\u0095À\u001a,P6ýØ\u009b²\u0099Xþ¥\u009b~\u009djCì\u009fP_³\u009c#÷Áÿ=\\ ¼\u0092\u001cL\u0002\u0006\u0093ºÁ\u0007öÏQ\u0081\u00adsB¾|Â\u0002=íôU£Öiw¡øÂb!\u008bf Ñ!*´\u0001¥¨\u0013g¦\u009cþ\u0019\u0092£ã8â\u000f/\u001f\u001e\u0082[/`Æ\bB:\u007f\u001eï;Ó\u0082Pâ,<cw\u0010K-½\u0000ªi\u0081ñ`4¢ÝK¯ ©çÝyÚýÑ¡0T§(;\u0095áP#\u001d\u001aG\u0096¬\u008e\t±)+Ïp\u00990°!|ì\u001d0½õ4\u008e\u0084²ñÔ)]\u0096øïÙc×Iý¹áD G:+¨2î\ba«=ßo\u0090þ^6âî{J\u0083â\nS~Êu×\u0097\u0005!\u00ad\u0098\u000e\u0001\u0015> ë$MÏ \u0089°\u0095%\u0093ìñ\u0092Ñ#\u0089\u0088zd´\u0088\u0083f*®¯F}îHCE N¸¯i ðD\u0085ü\u0099'ÝwÒý+z>bøw Qà\u009bfFõ*y\u00164"
         .length();
      char var8 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_Y = var4;
                     CONST_Z = new String[10];
                     return;
                  }

                  var8 = var6.charAt(var12);
                  break;
               default:
                  var4[var5++] = var19;
                  if ((var12 += var8) < var7) {
                     var8 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "£}Ì\r½Õ\u001a\u000e:n\u008f\u0001Nû\u0088>Ðbó/N \b¨\u0015å*3jiÐUZ\u008aM}\u0014\u0088Jód;\u0006\u0099ámÐTµ¶l.«ÔtüÀ.\"²ÈOjZvW+ù\u009eP½p½§%\u0004ÿÕ7\u0016 \u0091wä\u0015#©Fç\u008cx\u0017ÿ\u008e\u001a\\\r¢ð\u0097Ð0W3P\u009añÖ\u0093$jÖ\t";
                  var7 = "£}Ì\r½Õ\u001a\u000e:n\u008f\u0001Nû\u0088>Ðbó/N \b¨\u0015å*3jiÐUZ\u008aM}\u0014\u0088Jód;\u0006\u0099ámÐTµ¶l.«ÔtüÀ.\"²ÈOjZvW+ù\u009eP½p½§%\u0004ÿÕ7\u0016 \u0091wä\u0015#©Fç\u008cx\u0017ÿ\u008e\u001a\\\r¢ð\u0097Ð0W3P\u009añÖ\u0093$jÖ\t"
                     .length();
                  var8 = 'P';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13333;
      if (CONST_Z[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_A.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_A.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dQ", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Y[var3].getBytes("ISO-8859-1");
         CONST_Z[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Z[var3];
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
         throw new RuntimeException("rip/breeze/client/dQ" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
