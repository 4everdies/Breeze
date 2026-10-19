package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.util.BlockPos;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "KnockbackManipulator",
   b = "Flicks your rotation to manipulate the knockback direction.",
   d = rip.breeze.ModuleCategory.COMBAT,
   c = {"knockback", "offset", "auto"}
)
public class KnockbackManipulator extends BreezeModule implements IBreezeInterface2, IBreezeInterface3 {
   private final GenericSetting<Boolean> weaponOnlySetting;
   private final GenericSetting<Double> chanceSetting;
   private final GenericSetting<rip.breeze.RangeValue> yawOffsetSetting;
   private final GenericSetting<Boolean> blinkSetting;
   private final GenericSetting<Boolean> smartModeSetting;
   private final GenericSetting<Boolean> silentSwapSetting;
   private final GenericSetting<Boolean> sprintOnlySetting;
   private final GenericSetting<Boolean> dataBuilder54_u;
   private final Random random_v;
   boolean fieldBool_w;
   boolean fieldBool_x;
   private boolean fieldBool_y;
   private boolean fieldBool_z;
   private float fieldFloat_A;
   private int fieldInt_B;
   private static final String[] CONST_D;
   private static final String[] CONST_E;
   private static final Map CONST_F = new HashMap(13);

   public KnockbackManipulator() {
      long var1 = 101714980125642L;
      super();
      short var10002 = 29805;
      long var10003 = 5996679103786190337L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "WeaponOnly");
      var10002 = 8965;
      var10003 = 446554528552767845L ^ var1;
      this.weaponOnlySetting = var10001.getDataBuilder50_3("Only allow knockback manipulation while holding a weapon.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      var10002 = 11313;
      var10003 = 6671233604976270937L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Chance");
      var10002 = 11598;
      var10003 = 524104045007396645L ^ var1;
      this.chanceSetting = var10001.getDataBuilder50_3("The chance (out of 100%) that knockback manipulation will occur.")
         .getDataBuilder50_4(80.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 100.0))
         .getDataBuilder54();
      var10002 = 13716;
      var10003 = 8034850009966856185L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "YawOffset");
      var10002 = 20388;
      var10003 = 8515149652763000279L ^ var1;
      this.yawOffsetSetting = var10001.getDataBuilder50_3("By how much to offset the yaw.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(70.0, 90.0))
         .clamp(rip.breeze.RangeValue.getPredicate_3(0, 180))
         .getDataBuilder54();
      var10002 = 25611;
      var10003 = 5964544843775743599L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Blink");
      var10002 = 1667;
      var10003 = 6024117309548295394L ^ var1;
      this.blinkSetting = var10001.getDataBuilder50_3("Uses spoofing to hide the flick. This makes it harder for other people to notice you cheat.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      var10002 = 26837;
      var10003 = 4493345098636335804L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "SmartMode");
      var10002 = 20270;
      var10003 = 2418624443071806788L ^ var1;
      this.smartModeSetting = var10001.getDataBuilder50_3(
            "Only manipulate kb when we have a chance to throw someone in the void, for example when playing sumo or on a bridge."
         )
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      var10002 = 5437;
      var10003 = 4371897513804916563L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "SilentSwap");
      var10002 = 6961;
      var10003 = 6463443403058178388L ^ var1;
      this.silentSwapSetting = var10001.getDataBuilder50_3("Auto silent swap to a weapon that deals more knockback if available. Only works with smart mode.")
         .getDataBuilder50_4(true)
         .getDataBuilder50_9(KnockbackManipulator::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 27306;
      var10003 = 2622923138501220553L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(
         this,
         "Knockback manipulation spoofs a lot of rotation. Doing the manipulation while a target is invincible anyway can cause pointless rotations. HitSelect waits for the target to be vulnerable before attacking."
      );
      var10002 = 32099;
      var10003 = 7897449812335890181L ^ var1;
      this.sprintOnlySetting = var10001.getDataBuilder50_3("SprintOnly").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 32036;
      var10003 = 51623611250085699L ^ var1;
      this.dataBuilder54_u = GenericSetting.<Boolean>getDataBuilder50(this, "Only apply knockback manipulation when sprinting (recommended).")
         .getDataBuilder50_3("Only apply knockback manipulation when sprinting (recommended).")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      this.random_v = new Random();
      this.fieldBool_w = false;
      this.fieldBool_x = false;
      this.fieldBool_y = false;
      this.fieldBool_z = false;
      this.fieldFloat_A = 0.0F;
      this.fieldInt_B = -1;
      BreezeClient.getConfigManager().update_1(this, 18);
   }

   public void update() {
      BreezeClient.getModuleRegistry().applyRotation(this);
   }

   public void update_1() {
      BreezeClient.getModuleRegistry().initialize(this);
   }

   @EventListener
   public void toggle(PreAttackEventEvent var1) {
      long var2 = 29609193860195L;
      if (!this.fieldBool_y && this.fieldBool_z && !BreezeClient.isValid() && var1.fieldBool_g) {
         if (this.fieldBool_w || !BreezeClient.getConfigManager().getArrayList(this).isEmpty()) {
            var1.fieldBool_g = false;
            var1.fieldBool_h = false;
         } else if (this.checkCondition()) {
            var1.fieldBool_h = false;
            var1.fieldBool_g = false;
            if (!this.sprintOnlySetting.getObject_m() || BreezeClient.CONST_A.objectMouseOver.entityHit.hurtResistantTime <= 8) {
               this.processAll();
               this.fieldBool_x = true;
            }
         }
      }
   }

   @EventListener
   public void toggle_2(MouseClickedEventEvent var1) {
      long var2 = 100863593603970L;
      if (!this.fieldBool_y && this.fieldBool_z && !BreezeClient.isValid() && !var1.g) {
         if (this.fieldBool_w || !BreezeClient.getConfigManager().getArrayList(this).isEmpty()) {
            var1.a();
         } else if (var1.aimYawMode_h == AimYawMode.LEFT) {
            if (this.checkCondition()) {
               if (MinecraftAccessor.getValue(BreezeClient.CONST_A) <= 0) {
                  if (this.checkCondition_2()) {
                     var1.a();
                     if (!this.sprintOnlySetting.getObject_m() || BreezeClient.CONST_A.objectMouseOver.entityHit.hurtResistantTime <= 8) {
                        this.processAll();
                        this.fieldBool_x = true;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean checkCondition() {
      long var1 = 132466174092296L;
      if (this.dataBuilder54_u.getObject_m() && !BreezeClient.CONST_A.thePlayer.isSprinting()) {
         return false;
      } else if (this.weaponOnlySetting.getObject_m() && !BreezeClient.getThemeManager().getHeldItem(BreezeClient.CONST_A.thePlayer)) {
         return false;
      } else {
         return !this.randomValue() ? false : this.absValue();
      }
   }

   public void calculate(ModuleRegistry var1) {
      long var2 = 117735033473270L;
      int[] var10000 = AimAssist.getStateArray();
      this.fieldBool_z = true;
      int[] var4 = var10000;
      BreezeContext.moduleBase_a.getModuleByClass(SilentAim.class).setBool_z();
      if (this.fieldBool_w) {
         var1.isActive(true);
         var1.isActive_2(true);
         var1.absValue(BreezeClient.CONST_A.thePlayer.rotationYaw, BreezeClient.CONST_A.thePlayer.rotationPitch, 0.0F);
         BreezeClient.CONST_A.entityRenderer.getMouseOver(1.0F);
         this.fieldBool_y = true;
         MinecraftAccessor.initialize_72(BreezeClient.CONST_A);
         this.fieldBool_y = false;
         this.fieldBool_w = false;
         if (var4 != null) {
            return;
         }
      }

      if (this.fieldBool_x) {
         var1.isActive(true);
         var1.isActive_2(true);
         var1.absValue(BreezeClient.CONST_A.thePlayer.rotationYaw + this.getFloat(), BreezeClient.CONST_A.thePlayer.rotationPitch, 0.0F);
         this.fieldBool_w = true;
         this.fieldBool_x = false;
         if (var4 != null) {
            return;
         }
      }

      if (this.fieldInt_B != -1 && !PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindAttack)) {
         BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_B;
         MinecraftAccessor.initialize_68(BreezeClient.CONST_A.playerController);
         this.fieldInt_B = -1;
      }
   }

   private void processAll() {
      long var1 = 11272839322632L;
      int[] var3 = AimAssist.getStateArray();
      if (this.silentSwapSetting.getObject_m() && this.smartModeSetting.getObject_m()) {
         int var4 = -1;
         float var5 = 0.0F;
         int var6 = 0;

         while (var6 < 9) {
            if (BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var6) != null) {
               int var7 = EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var6));
               if (var7 > var5 || BreezeClient.CONST_A.thePlayer.inventory.currentItem == var6) {
                  var5 = var7;
                  var4 = var6;
               }
            }

            var6++;
            if (var3 == null) {
               break;
            }
         }

         if (var4 != -1 || var4 == BreezeClient.CONST_A.thePlayer.inventory.currentItem) {
            this.fieldInt_B = BreezeClient.CONST_A.thePlayer.inventory.currentItem;
            BreezeClient.CONST_A.thePlayer.inventory.currentItem = var4;
            MinecraftAccessor.initialize_68(BreezeClient.CONST_A.playerController);
         }
      }
   }

   public int getValue() {
      return 15;
   }

   public void update() {
      this.fieldBool_z = false;
      this.fieldBool_x = false;
      this.fieldBool_w = false;
      this.fieldFloat_A = 0.0F;
      this.fieldInt_B = -1;
   }

   private boolean absValue() {
      long var1 = 132828743749974L;
      int[] var3 = AimAssist.getStateArray();
      if (!this.smartModeSetting.getObject_m()) {
         return true;
      }

      EntityPlayer var4 = (EntityPlayer)BreezeClient.CONST_A.objectMouseOver.entityHit;
      if (var4 == null) {
         return false;
      }

      double var5 = var4.posX;
      double var7 = var4.posZ;
      int var9 = (int)Math.floor(var4.posY);
      float var10 = BreezeClient.CONST_A.thePlayer.rotationYaw;
      if (this.getHitbox_2(new BlockPos((int)Math.floor(var5), var9, (int)Math.floor(var7)))) {
         float var45 = 0.0F;
         double var46 = Double.MAX_VALUE;
         boolean var47 = false;
         int var49 = 0;

         label79:
         while (var49 < 18) {
            float var51 = var49 * 20.0F;
            double var52 = Math.toRadians(var51);
            double var53 = -Math.sin(var52);
            double var54 = Math.cos(var52);
            double var23 = 0.5;

            while (true) {
               label75:
               if (var23 <= 4.0) {
                  double var55 = var5 + var53 * var23;
                  double var27 = var7 + var54 * var23;
                  int var29 = (int)Math.floor(var55);
                  int var30 = (int)Math.floor(var27);
                  if (this.getHitbox(var29, var9, var30) && var23 < var46) {
                     var46 = var23;
                     var47 = true;
                     var45 = RotationUtil7.calculateFloat(var51 - var10);
                     if (var3 != null) {
                        break label75;
                     }
                  }

                  var23 += 0.3;
                  if (var3 != null) {
                     continue;
                  }
               }

               var49++;
               if (var3 == null) {
                  break label79;
               }
               break;
            }
         }

         if (!var47) {
            this.fieldFloat_A = 0.0F;
            return false;
         } else {
            float var50 = var45 > 0.0F ? -1.0F : 1.0F;
            this.fieldFloat_A = var50 * (float)this.yawOffsetSetting.getObject_m().calculateDouble_2();
            return true;
         }
      } else {
         float var11 = 0.0F;
         double var12 = Double.MAX_VALUE;
         boolean var14 = false;
         int var15 = 0;

         while (var15 < 18) {
            float var16 = var15 * 20.0F;
            double var17 = Math.toRadians(var16);
            double var19 = -Math.sin(var17);
            double var21 = Math.cos(var17);
            float var31 = RotationUtil7.calculateFloat(var16 - var10);
            float var32 = Math.abs(var31);
            if (!(var32 < 30.0F) && !(var32 > 150.0F)) {
               double var25 = Double.MAX_VALUE;
               boolean var33 = false;
               double var34 = 0.5;

               while (var34 <= 4.0) {
                  double var36 = var5 + var19 * var34;
                  double var38 = var7 + var21 * var34;
                  int var40 = (int)Math.floor(var36);
                  int var41 = (int)Math.floor(var38);
                  int var42 = 0;

                  while (var42 <= 1) {
                     BlockPos var43 = new BlockPos(var40, var9 + var42, var41);
                     IBlockState var44 = BreezeClient.CONST_A.theWorld.getBlockState(var43);
                     if (var44.getBlock().getCollisionBoundingBox(BreezeClient.CONST_A.theWorld, var43, var44) != null) {
                        var33 = true;
                        if (var3 != null) {
                           break;
                        }
                     }

                     var42++;
                     if (var3 == null) {
                        break;
                     }
                  }

                  if (var33) {
                     break;
                  }

                  if (this.getHitbox_2(new BlockPos(var40, var9, var41))) {
                     var25 = var34;
                     if (var3 != null) {
                        break;
                     }
                  }

                  var34 += 0.5;
                  if (var3 == null) {
                     break;
                  }
               }

               if (!var33 && !(var25 > 4.0) && (!var14 || var25 < var12)) {
                  var11 = var31;
                  var12 = var25;
                  var14 = true;
               }
            }

            var15++;
            if (var3 == null) {
               break;
            }
         }

         if (!var14) {
            return false;
         }

         float var48 = var11 > 0.0F ? 1.0F : -1.0F;
         this.fieldFloat_A = var48 * (float)this.yawOffsetSetting.getObject_m().calculateDouble_2();
         return true;
      }
   }

   private float getFloat() {
      long var1 = 16375704260144L;
      return !this.smartModeSetting.getObject_m()
         ? (float)(
            this.random_v.nextBoolean() ? this.yawOffsetSetting.getObject_m().calculateDouble_2() : -this.yawOffsetSetting.getObject_m().calculateDouble_2()
         )
         : this.fieldFloat_A;
   }

   private boolean getHitbox(int var1, int var2, int var3) {
      long var4 = 30854673876661L;
      int[] var10000 = AimAssist.getStateArray();
      int var6 = -2;
      int[] var7 = var10000;

      while (var6 <= 3) {
         BlockPos var8 = new BlockPos(var1, var2 + var6, var3);
         if (var8.getY() >= 0) {
            IBlockState var9 = BreezeClient.CONST_A.theWorld.getBlockState(var8);
            if (var9.getBlock().getCollisionBoundingBox(BreezeClient.CONST_A.theWorld, var8, var9) != null) {
               return true;
            }
         }

         var6++;
         if (var7 == null) {
            break;
         }
      }

      return false;
   }

   private boolean getHitbox_2(BlockPos var1) {
      long var2 = 26241082053968L;
      int[] var10000 = AimAssist.getStateArray();
      int var4 = 0;
      int[] var5 = var10000;

      while (var4 < 10) {
         BlockPos var6 = var1.add(0, -var4, 0);
         if (var6.getY() < 1) {
            return true;
         }

         IBlockState var7 = BreezeClient.CONST_A.theWorld.getBlockState(var6);
         if (var7.getBlock().getCollisionBoundingBox(BreezeClient.CONST_A.theWorld, var6, var7) != null) {
            return false;
         }

         var4++;
         if (var5 == null) {
            break;
         }
      }

      return true;
   }

   private boolean randomValue() {
      long var1 = 74124123492429L;
      return this.chanceSetting.getObject_m() / 100.0 >= Math.random();
   }

   private boolean checkCondition_2() {
      long var1 = 8004835203089L;
      if (BreezeClient.CONST_A.objectMouseOver == null) {
         return false;
      } else if (BreezeClient.CONST_A.objectMouseOver.entityHit == null) {
         return false;
      } else if (BreezeClient.CONST_A.objectMouseOver.entityHit == BreezeClient.CONST_A.thePlayer) {
         return false;
      } else {
         return !(BreezeClient.CONST_A.objectMouseOver.entityHit instanceof EntityPlayer)
            ? false
            : AntiBot.isInvisible_3((EntityPlayer)BreezeClient.CONST_A.objectMouseOver.entityHit);
      }
   }

   public EnumType27 getEnum_PROCESS(Packet<?> var1, boolean var2) {
      long var3 = 29844293304432L;
      int[] var5 = AimAssist.getStateArray();
      if (BreezeClient.getConfigManager().getArrayList(this).isEmpty()) {
         if (BreezeClient.isValid() || !this.f() || !this.blinkSetting.getObject_m()) {
            return EnumType27.PROCESS;
         } else {
            return this.fieldBool_w ? EnumType27.DELAY : EnumType27.PROCESS;
         }
      } else {
         if (!(var1 instanceof C03PacketPlayer)) {
            return EnumType27.DELAY;
         }

         int var6 = 0;

         for (DelayedPacket var8 : BreezeClient.getConfigManager().getArrayList(this)) {
            if (var8.packet_g instanceof C03PacketPlayer) {
               var6++;
            }

            if (var5 == null) {
               break;
            }
         }

         if (var6 <= 1) {
            return EnumType27.DELAY;
         }

         BreezeClient.getConfigManager().processAll(this);
         return EnumType27.PROCESS;
      }
   }

   public EnumType27 getEnum_PROCESS_2(Packet<?> var1, boolean var2) {
      return EnumType27.PROCESS;
   }

   public void update_1(ArrayList<DelayedPacket> var1) {
      long var2 = 131090423664411L;
      if (var1.isEmpty() || !this.f()) {
         BreezeClient.getConfigManager().processAll(this);
      }
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 131812629449137L;
      return var0.getObject("SmartMode", Boolean.class);
   }

   static {
      long var0 = 129386743053706L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[17];
      int var5 = 0;
      String var6 = "\u0010\r@\u0011\u0016*årtÓPÙ\u0004%®É¥®vbê3»b s#\u009fz¡(\u0091êÑà\f\u0005¾\fVô¢^%\u000b^ú\u001f\u0010ÿÎHÒÇ\u000b§x\u0098iþ\"ä:z\u007fí\u0012\u0094¸\u0002+ó5¨ö\u009c\u000eªª¾\u001e¢\u001bU\u001fÂ\u0084\fzN²úð\u0081¿$³\u0016&\u0017 \u0089\u0019\u008a:åv¨\u0086Ä´ôä×*có\u001c¥)«ã\u008b\u0018¾_ÉaT\u0090Ò\r)½\u0006÷î\u009b\u001b»½ÀH\u0089H\u001b\u001d\u0089@}´öY¯Ä|Þø\u009a%EQ\u009dz\u009eÊëpplVn=ûx\u0089*d$G\\ê\u001f\u008f¦Lú¨tÿ8É¤ø\u0006N w\u0096p`ý_-E\u0000Ê\u001c²ú`\u0001;\\\f\u0017%\u0003Où\u001a'\u0086\u009a÷|\u0012ø\u0093\u0083?ª´\u0019Ò\u008eÊØq dÐØ7c+$z§J\u0018\u0002r@aM\u000bß¯ºh1\u0094J¦©\u0080\u0097\u001bBªçXÚ\u0007{\u0090\u0018á&Ì\u0081%\u0087\nïÌ\u0085¢\u001c>Ä\u001b®m×\r¹NìÜ\u0098²¢¸i\u0012 õâ\u0093T3(5ªC\u0090H,{\u0017¹Ê\r\u0092¼§9\u008f^÷xqûTHò\u008aÀĸìÏâ\u0004Är×\ftxõYFD$ØÁ¾YJZìö&X;v\u00adE\u0098\u0018a\u000e\u0016\u000b\u000bPw6\u0089ËÏU#P\u0097\u0019¨Ý²XÊïwwüÖï\u0005,Yg±`\u0010\u001cê7¦«¦q\u001d»½;=±»\u0082Iø\u0090\u008f+NÚmÐ´ú×Ìë\u001d/ø\u0094\u0003^\u0003«\u0002·\fXÐÐ\u009b\u001dgøMæ\u001d,cc\u001cÌ\u0010\u008e\u0006ÀËÑ\u0080M\u001f\u000b/\\\u0095Ýg9ÜÑeç!Ãÿ\u008bi\u008d×ìÇ\u0084ñËM\r+\u0097£Âø\u0012éÇà\u008dÜç\u0086>\u008criüÃùÕSÍÁÍL7bN@\u000fä\r\u008dØy\u001fP\u008dV\u009bH\u000eK'w3\u001d/\u0081s$Ù\u0007\u008aO`óoñêÔãÝ\u009bØ|\u009bïCßæ0\u0018Þð£\u001böV\u007f^\"\u0089\u0019ýTuD2þ\u001d2QÆà¤\u007fü±Ì_WX\nöS«\u008c\u001a\u0085\u008cêê\u008f¢¬çY}î®â};hI6\u0000\u009c*q³(Õf·\u008a|ü´iºo0þt«\u0013e\r\u001d\u009eÁ¯*ùL y¿å-æµOÆñ¹\u007f\u0097A\u008cºGMp\u009eCÛ£A\bB\u001bOZ\u0016½âX\u0001\u008cÔmI\u001cÔÞ´N<¬\u0082\"Go\u0085oÇ»A,¿T\u0005\u001f\f:¸S\u0019ÓDd;²ÊõZ÷Gò)\u0002è\u0019kE¥2Ä\u0080ÂíìÆúdMÌÇ\u00ad}ÛW£[:¦sAÄÏ!b\u007f1)ô\u0099\u001eú³,\u0083ÏBp\u0095qD}\u0014¡\u0000\u0012ÚÂ.\u001b\fÜ1\u0000Ø?\u008c°Îü²×0}á\u009fZâ\u0085w<³c¬Ìq&¢\u0010 ¦,ã\u0085¨©u§\u001e²3|&¾§p\u007f\r\u0019\u009av¶¢Ò4b+n\u0019§SÞ\u0006O=ú{\u001c\u0087^¼\u009duÂ\u0001:\u0093Æ\u008c\u0098ç\na\u001fø¨.ï\u0099&Z\u0082\u0014FCÀðäë\u001dò\u0014Ç:Ák\\sê@\u000ba\u0093f\nÍE^.Ýj^\u0006\\±éoã&E\u0085æÆ°è¨6ø¤\u009cÜMÍ¸Ý8\u0090ç\nS\u0001µäÍ]\u0093ìe¸\u0015:ã\u0015æjÌ¾öµÀö\u0082¨òµ\u001cN$`)J\"\u000eMØú\u0010êüW\u00912·F!Fyäð`99\t\u0086\u0089\u0017ûn\u0000ñòÓ\rJ\u0006.+S¿Vá\u008f¯dü\f¸Ô9ú\u009fSR?\u0085³æB¦dT\u0002\u0093éÏ\u0006[É\u0086ÖnÊ\u008cò#öa*÷oÚx\b0\u009d\u009c02Ðï\u0014w>R\u0095\u0095Ù²c\u0088\u0093\u009e@P\u001bÕ\u0093\tØ\u0082±ê¼¾âk\u008a\u001eÌ\u0083%-'wxºAS\u00adyO!¹{§ÓöÍ\u0081èÞFÇ\u009e6ÅcÅ1\u009d\u001eDe\u009fh4}Åø«{\u009a\u0086\u0018H\u0014\u0089\u0003x\u00898 /í}?4íû#\u0002Aæþ`é\u0082~\u0010²ò\u0005¨º\u00adãq\u0001\u007fyñ<o\u001bØhõ*ò\fü/\u000et\u0085íØý\u00adü`Õ-MYL©]«h\u0088\u000fj>\t^\u0083Ü\u0016\tp\u0090Võå*\u008b¥ÿ\u000ba¿[ûë\u0083*Û¡y]\f\u0082v~\u008a\u0085$É1ï²ïYÎòB´·\u009eq\u001a\u009e\u0082ÈVì*\u008e¹eDM÷7½*¶Ì¨\u0095\u0006aõ\u0088.\u0017Y\u0004À Ù\u0099\u001c\u0095¶\u0080\u0080e\u0010þNdYyÈöû\u009e\u0095NÇ\u0084Ò¥ô\u009c\u0082W\u000eÙ*\u0012 â\f\u009c#'\u0080ÈfÜ\u001b\u00915n·0ùª½å\u0088\fÊm\u008eWÎp\u0081ëR\bÖ";
      int var7 = "\u0010\r@\u0011\u0016*årtÓPÙ\u0004%®É¥®vbê3»b s#\u009fz¡(\u0091êÑà\f\u0005¾\fVô¢^%\u000b^ú\u001f\u0010ÿÎHÒÇ\u000b§x\u0098iþ\"ä:z\u007fí\u0012\u0094¸\u0002+ó5¨ö\u009c\u000eªª¾\u001e¢\u001bU\u001fÂ\u0084\fzN²úð\u0081¿$³\u0016&\u0017 \u0089\u0019\u008a:åv¨\u0086Ä´ôä×*có\u001c¥)«ã\u008b\u0018¾_ÉaT\u0090Ò\r)½\u0006÷î\u009b\u001b»½ÀH\u0089H\u001b\u001d\u0089@}´öY¯Ä|Þø\u009a%EQ\u009dz\u009eÊëpplVn=ûx\u0089*d$G\\ê\u001f\u008f¦Lú¨tÿ8É¤ø\u0006N w\u0096p`ý_-E\u0000Ê\u001c²ú`\u0001;\\\f\u0017%\u0003Où\u001a'\u0086\u009a÷|\u0012ø\u0093\u0083?ª´\u0019Ò\u008eÊØq dÐØ7c+$z§J\u0018\u0002r@aM\u000bß¯ºh1\u0094J¦©\u0080\u0097\u001bBªçXÚ\u0007{\u0090\u0018á&Ì\u0081%\u0087\nïÌ\u0085¢\u001c>Ä\u001b®m×\r¹NìÜ\u0098²¢¸i\u0012 õâ\u0093T3(5ªC\u0090H,{\u0017¹Ê\r\u0092¼§9\u008f^÷xqûTHò\u008aÀĸìÏâ\u0004Är×\ftxõYFD$ØÁ¾YJZìö&X;v\u00adE\u0098\u0018a\u000e\u0016\u000b\u000bPw6\u0089ËÏU#P\u0097\u0019¨Ý²XÊïwwüÖï\u0005,Yg±`\u0010\u001cê7¦«¦q\u001d»½;=±»\u0082Iø\u0090\u008f+NÚmÐ´ú×Ìë\u001d/ø\u0094\u0003^\u0003«\u0002·\fXÐÐ\u009b\u001dgøMæ\u001d,cc\u001cÌ\u0010\u008e\u0006ÀËÑ\u0080M\u001f\u000b/\\\u0095Ýg9ÜÑeç!Ãÿ\u008bi\u008d×ìÇ\u0084ñËM\r+\u0097£Âø\u0012éÇà\u008dÜç\u0086>\u008criüÃùÕSÍÁÍL7bN@\u000fä\r\u008dØy\u001fP\u008dV\u009bH\u000eK'w3\u001d/\u0081s$Ù\u0007\u008aO`óoñêÔãÝ\u009bØ|\u009bïCßæ0\u0018Þð£\u001böV\u007f^\"\u0089\u0019ýTuD2þ\u001d2QÆà¤\u007fü±Ì_WX\nöS«\u008c\u001a\u0085\u008cêê\u008f¢¬çY}î®â};hI6\u0000\u009c*q³(Õf·\u008a|ü´iºo0þt«\u0013e\r\u001d\u009eÁ¯*ùL y¿å-æµOÆñ¹\u007f\u0097A\u008cºGMp\u009eCÛ£A\bB\u001bOZ\u0016½âX\u0001\u008cÔmI\u001cÔÞ´N<¬\u0082\"Go\u0085oÇ»A,¿T\u0005\u001f\f:¸S\u0019ÓDd;²ÊõZ÷Gò)\u0002è\u0019kE¥2Ä\u0080ÂíìÆúdMÌÇ\u00ad}ÛW£[:¦sAÄÏ!b\u007f1)ô\u0099\u001eú³,\u0083ÏBp\u0095qD}\u0014¡\u0000\u0012ÚÂ.\u001b\fÜ1\u0000Ø?\u008c°Îü²×0}á\u009fZâ\u0085w<³c¬Ìq&¢\u0010 ¦,ã\u0085¨©u§\u001e²3|&¾§p\u007f\r\u0019\u009av¶¢Ò4b+n\u0019§SÞ\u0006O=ú{\u001c\u0087^¼\u009duÂ\u0001:\u0093Æ\u008c\u0098ç\na\u001fø¨.ï\u0099&Z\u0082\u0014FCÀðäë\u001dò\u0014Ç:Ák\\sê@\u000ba\u0093f\nÍE^.Ýj^\u0006\\±éoã&E\u0085æÆ°è¨6ø¤\u009cÜMÍ¸Ý8\u0090ç\nS\u0001µäÍ]\u0093ìe¸\u0015:ã\u0015æjÌ¾öµÀö\u0082¨òµ\u001cN$`)J\"\u000eMØú\u0010êüW\u00912·F!Fyäð`99\t\u0086\u0089\u0017ûn\u0000ñòÓ\rJ\u0006.+S¿Vá\u008f¯dü\f¸Ô9ú\u009fSR?\u0085³æB¦dT\u0002\u0093éÏ\u0006[É\u0086ÖnÊ\u008cò#öa*÷oÚx\b0\u009d\u009c02Ðï\u0014w>R\u0095\u0095Ù²c\u0088\u0093\u009e@P\u001bÕ\u0093\tØ\u0082±ê¼¾âk\u008a\u001eÌ\u0083%-'wxºAS\u00adyO!¹{§ÓöÍ\u0081èÞFÇ\u009e6ÅcÅ1\u009d\u001eDe\u009fh4}Åø«{\u009a\u0086\u0018H\u0014\u0089\u0003x\u00898 /í}?4íû#\u0002Aæþ`é\u0082~\u0010²ò\u0005¨º\u00adãq\u0001\u007fyñ<o\u001bØhõ*ò\fü/\u000et\u0085íØý\u00adü`Õ-MYL©]«h\u0088\u000fj>\t^\u0083Ü\u0016\tp\u0090Võå*\u008b¥ÿ\u000ba¿[ûë\u0083*Û¡y]\f\u0082v~\u008a\u0085$É1ï²ïYÎòB´·\u009eq\u001a\u009e\u0082ÈVì*\u008e¹eDM÷7½*¶Ì¨\u0095\u0006aõ\u0088.\u0017Y\u0004À Ù\u0099\u001c\u0095¶\u0080\u0080e\u0010þNdYyÈöû\u009e\u0095NÇ\u0084Ò¥ô\u009c\u0082W\u000eÙ*\u0012 â\f\u009c#'\u0080ÈfÜ\u001b\u00915n·0ùª½å\u0088\fÊm\u008eWÎp\u0081ëR\bÖ"
         .length();
      char var8 = 24;
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
                     CONST_D = var4;
                     CONST_E = new String[17];
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

                  var6 = "ü§ù\u0094/nêÏ³ÜC¿\t\u008cÄÓV\u008dÔ=ó\u0013eT\u0098^BÏ\u009aÛê 0L\rs\u0080[ë¼a\u0094V¸ó,5üßm\u001c\r\u008bÉá8KnØAìã3\u009f\u001a\u001f¨\u009cÊîÑ\u0011µ\u0017\rÞ¡*\u0098\u0088ý";
                  var7 = "ü§ù\u0094/nêÏ³ÜC¿\t\u008cÄÓV\u008dÔ=ó\u0013eT\u0098^BÏ\u009aÛê 0L\rs\u0080[ë¼a\u0094V¸ó,5üßm\u001c\r\u008bÉá8KnØAìã3\u009f\u001a\u001f¨\u009cÊîÑ\u0011µ\u0017\rÞ¡*\u0098\u0088ý"
                     .length();
                  var8 = ' ';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18857;
      if (CONST_E[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_F.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_F.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dq", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_D[var3].getBytes("ISO-8859-1");
         CONST_E[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_E[var3];
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
         throw new RuntimeException("rip/breeze/client/dq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
