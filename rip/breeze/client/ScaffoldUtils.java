package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.EnumFacing.Axis;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.LicenseState;
import rip.breeze.MathUtil1;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "Scaffold",
   b = "Automatically bridges for you.",
   c = {"telly", "godbridge", "bridge", "moonwalk", "bedwars"},
   d = rip.breeze.ModuleCategory.MOVEMENT
)
public final class ScaffoldUtils extends BreezeModule implements IBreezeInterface2 {
   private final GenericSetting<ClientMode2> modeSetting;
   private final GenericSetting<Integer> timingSetting;
   private final GenericSetting<Boolean> strictRotateSetting;
   private final GenericSetting<Boolean> rotationsSetting;
   private final GenericSetting<RotationUtil3_x> switchSetting;
   private final GenericSetting<EnumType33> swingSetting;
   private final GenericSetting<Double> autoF5Setting;
   private final GenericSetting<EnumType13> dataBuilder54_u;
   private final GenericSetting<Boolean> dataBuilder54_v;
   private final Random random_w;
   private ClassValueCache dataBuilder27_x;
   private int fieldInt_y;
   private float fieldFloat_z;
   private boolean fieldBool_A;
   private float[] arr_B;
   private BlockPos blockPos_C;
   private int fieldInt_D;
   private float fieldFloat_E;
   private net.minecraft.util.EnumFacing enumFacing_F;
   private int fieldInt_G;
   private int fieldInt_H;
   private int fieldInt_I;
   private boolean fieldBool_J;
   private int fieldInt_K;
   private boolean fieldBool_L;
   private boolean fieldBool_M;
   private Float fieldFloat_N;
   private int fieldInt_O;
   private int fieldInt_P;
   private boolean fieldBool_Q;
   private float fieldFloat_R;
   private boolean fieldBool_S;
   private boolean fieldBool_T;
   private int fieldInt_U;
   private static String string_V;
   private static final String[] CONST_X;
   private static final String[] CONST_Y;
   private static final Map CONST_Z = new HashMap(13);

   public ScaffoldUtils() {
      long var1 = 37044682053106L;
      getString_2();
      super();
      short var10002 = 419;
      long var10003 = 2977640464986574976L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Mode");
      var10002 = 18499;
      var10003 = 3420420956529711460L ^ var1;
      this.modeSetting = var10001.getDataBuilder50_3("The intended anticheat/server.").getDataBuilder50_4(ClientMode2.NINJA).getDataBuilder54();
      var10002 = 6879;
      var10003 = 8921256975177419766L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Timing");
      var10002 = 28563;
      var10003 = 8669697069821558454L ^ var1;
      this.timingSetting = var10001.getDataBuilder50_3("The sneak delay to use for ninja bridging (in ticks).\nLower vales make the scaffold faster.")
         .getDataBuilder50_4(2)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 10))
         .getDataBuilder50_9(ScaffoldUtils::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 29897;
      var10003 = 1221964003699484130L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Keep y level unless space bar pressed.");
      var10002 = 31928;
      var10003 = 2458936755808988559L ^ var1;
      this.strictRotateSetting = var10001.getDataBuilder50_3("StrictRotate")
         .getDataBuilder50_4(false)
         .getDataBuilder50_9(ScaffoldUtils::lambda$new_Inner1)
         .getDataBuilder54();
      var10002 = 4978;
      var10003 = 5365381027316859476L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Rotations");
      var10002 = 27113;
      var10003 = 6248262999878531273L ^ var1;
      this.rotationsSetting = var10001.getDataBuilder50_3("How to rotate.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 23051;
      var10003 = 299909190297537317L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Switch");
      var10002 = 19118;
      var10003 = 4494057633897798554L ^ var1;
      this.switchSetting = var10001.getDataBuilder50_3("The mode to use for selecting the item in your hotbar.")
         .getDataBuilder50_4(RotationUtil3_x.REVERSE)
         .getDataBuilder50_9(ScaffoldUtils::lambda$new_Inner2)
         .getDataBuilder54();
      var10002 = 23489;
      var10003 = 8146580037258988265L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "How fast to rotate towards your target rotation.");
      var10002 = 28012;
      var10003 = 4662679302034619457L ^ var1;
      this.swingSetting = var10001.getDataBuilder50_3("Swing").getDataBuilder50_4(EnumType33.SWITCHBACK).getDataBuilder54();
      var10002 = 17760;
      var10003 = 8044365309901132879L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "How to swing your item.");
      var10002 = 7717;
      var10003 = 5822085589073170177L ^ var1;
      this.autoF5Setting = var10001.getDataBuilder50_3("AutoF5")
         .getDataBuilder50_4(6.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_3(2.0, 10.0, 0.1))
         .getDataBuilder54();
      var10002 = 32084;
      var10003 = 8249266366721256566L ^ var1;
      this.dataBuilder54_u = GenericSetting.<EnumType13>getDataBuilder50(this, "Automatically switch to third person while scaffolding.")
         .getDataBuilder50_3("How to swing your item.")
         .getDataBuilder50_4(EnumType13.DEFAULT)
         .getDataBuilder54();
      this.dataBuilder54_v = GenericSetting.<Boolean>getDataBuilder50(this, "AutoF5")
         .getDataBuilder50_3("Automatically switch to third person while scaffolding.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      this.random_w = new Random();
      this.fieldInt_y = -1;
      this.fieldFloat_z = (float)(0.995 + 0.005 * this.random_w.nextFloat());
      this.fieldFloat_E = 0.0F;
      this.enumFacing_F = net.minecraft.util.EnumFacing.NORTH;
      this.fieldInt_G = -1;
      this.fieldInt_H = -1;
      this.fieldInt_K = -1;
      this.fieldBool_L = false;
      this.fieldBool_M = false;
      this.fieldFloat_N = null;
      this.fieldInt_O = -1;
      this.fieldInt_P = -1;
      this.fieldBool_Q = false;
      this.fieldFloat_R = 1.0F;
      this.fieldBool_S = false;
      this.fieldBool_T = true;
      this.fieldInt_U = -1;
      if (!LicenseState.isValid_2()) {
         initialize("dVKaxc");
      }
   }

   protected void toggle_2() {
      long var1 = 73912092874623L;
      BreezeClient.getModuleRegistry().applyRotation(this);
      this.fieldInt_y = -1;
      this.arr_B = null;
      this.fieldBool_J = false;
      this.fieldBool_L = true;
      this.fieldBool_M = true;
      this.fieldBool_Q = true;
      this.fieldInt_U = -1;
      this.fieldInt_D = BreezeClient.CONST_A.gameSettings.thirdPersonView;
      if (BreezeClient.CONST_A.thePlayer != null) {
         if (!BreezeClient.CONST_A.thePlayer.onGround) {
            this.fieldBool_L = false;
         }

         this.fieldInt_I = (int)BreezeClient.CONST_A.thePlayer.posY;
      }
   }

   protected void sendPacket() {
      long var1 = 23436370995847L;
      BreezeClient.getModuleRegistry().initialize(this);
      this.sendPacket_2();
      this.dataBuilder27_x = null;
      this.arr_B = null;
      if (this.dataBuilder54_v.getObject_m()) {
         BreezeClient.CONST_A.gameSettings.thirdPersonView = this.fieldInt_D;
      }
   }

   @Override
   public String getString() {
      return rip.breeze.RenderUtil27.CONST_G.apply(this.modeSetting.getObject_m());
   }

   @EventListener
   public void sendPacket(PreTickEventEvent var1) {
      long var2 = 122518455332322L;
      String var4 = getString_2();
      if (this.dataBuilder54_v.getObject_m()) {
         BreezeClient.CONST_A.gameSettings.thirdPersonView = 1;
      }

      if (this.fieldInt_y != -1) {
         this.fieldInt_y++;
      }

      if (this.fieldInt_K != -1) {
         this.fieldInt_K++;
      }

      if (BreezeClient.CONST_A.thePlayer != null) {
         this.fieldFloat_z = (float)(0.995 + 0.005 * this.random_w.nextFloat());
         if (!this.fieldBool_A) {
            this.sendPacket_2();
         } else {
            this.updateRotation_2();
            int var5 = BreezeClient.getThemeManager().getValue_3();
            if (var5 != -1
               && BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var5) != null
               && BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var5).stackSize != 0
               && BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(var5).getItem() instanceof ItemBlock) {
               this.update_2();
               ItemStack var6 = BreezeClient.CONST_A.thePlayer.inventory.mainInventory[var5];
               BlockPos var7 = new BlockPos(BreezeClient.CONST_A.thePlayer.posX, BreezeClient.CONST_A.thePlayer.posY, BreezeClient.CONST_A.thePlayer.posZ)
                  .down();
               if (!this.isValid_6(var7)) {
                  this.blockPos_C = var7;
               }

               if (this.fieldBool_M || !this.modeSetting.isValid(ClientMode2.TELLY) && !this.modeSetting.isValid(ClientMode2.WATCHDOG)) {
                  if (!this.isValid_6(var7)) {
                     if (this.isValid()) {
                        this.sendPacket_2();
                     }
                  } else if (var7.getY() >= 0 && var7.getY() <= 255) {
                     this.dataBuilder27_x = this.rayTrace(var7);
                     if (this.dataBuilder27_x == null && this.getHitbox()) {
                        this.dataBuilder27_x = this.getDataBuilder27(var7);
                     }

                     if (this.dataBuilder27_x == null) {
                        if (this.isValid()) {
                           this.sendPacket_2();
                        }
                     } else {
                        this.sendPacket_3(var5);
                        if (this.isValid_3(var6)) {
                           this.blockPos_C = ClassValueCache.getBlockPos_a(this.dataBuilder27_x).offset(ClassValueCache.getEnumFacing_b(this.dataBuilder27_x));
                           if (var6.stackSize == 0) {
                              BreezeClient.CONST_A.thePlayer.inventory.mainInventory[var5] = null;
                           }

                           this.fieldInt_y = 0;
                           switch (RotationUtil6.CONST_A[this.dataBuilder54_u.getObject_m().ordinal()]) {
                              case 1:
                                 BreezeClient.CONST_A.thePlayer.swingItem();
                                 if (var4 != null) {
                                    break;
                                 }
                              case 2:
                                 BreezeClient.getConfigManager().update_4(new C0APacketAnimation(), true);
                           }
                        }
                     }
                  }
               } else {
                  this.sendPacket_3(var5);
               }
            } else {
               this.sendPacket_2();
            }
         }
      }
   }

   @EventListener
   public void update(PacketSendEventEvent var1) {
      long var2 = 49752693850006L;
      if (this.swingSetting.isValid(EnumType33.SILENT)) {
         if (this.fieldInt_G != -1) {
            if (var1.packet_h instanceof C09PacketHeldItemChange) {
               var1.a();
            }

            if (var1.packet_h instanceof C08PacketPlayerBlockPlacement) {
               MinecraftAccessor.initialize_59(var1.packet_h, BreezeClient.CONST_A.thePlayer.inventory.getStackInSlot(this.fieldInt_G));
            }
         }
      }
   }

   @EventListener
   public void sendPacket(MouseClickedEventEvent var1) {
      long var2 = 135631484075574L;
      if (this.isValid_2()) {
         var1.a();
      }
   }

   @EventListener
   public void updateRotation(PreMotionEventEvent var1) {
      long var2 = 116778518557272L;
      String var4 = getString_2();
      if (!BreezeClient.isValid()) {
         switch (RotationUtil6.CONST_B[this.modeSetting.getObject_m().ordinal()]) {
            case 1:
            case 2:
               this.fieldBool_T = false;
               if (BreezeClient.getThemeManager().getInt_d() >= 0 && BreezeClient.CONST_A.thePlayer.onGround) {
                  this.fieldBool_L = true;
                  this.fieldBool_M = false;
                  this.fieldInt_I = (int)BreezeClient.CONST_A.thePlayer.posY;
                  this.fieldBool_J = PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindJump);
                  if (this.fieldInt_P != -1 && this.fieldInt_P <= 1 && (BreezeClient.CONST_A.thePlayer.isSprinting() && this.fieldBool_Q || this.fieldInt_P == 0)) {
                     this.fieldBool_T = true;
                     BreezeClient.CONST_A.thePlayer.jump();
                     this.fieldBool_T = false;
                     this.fieldBool_L = false;
                     this.fieldBool_S = false;
                     if (var4 != null) {
                        break;
                     }
                  }

                  if (!PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindJump) || !this.fieldBool_Q && this.checkCondition_2() && !this.isValid()) {
                     return;
                  }

                  this.fieldBool_T = true;
                  BreezeClient.CONST_A.thePlayer.jump();
                  this.fieldBool_T = false;
                  this.fieldBool_S = false;
                  this.fieldBool_L = false;
                  if (var4 != null) {
                     break;
                  }
               }

               if (!this.modeSetting.isValid(ClientMode2.WATCHDOG)) {
                  this.fieldBool_J = this.fieldBool_J || PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindJump);
               }

               if (BreezeClient.getThemeManager().getInt_c() == 1) {
                  this.fieldBool_L = false;
               }

               if (this.fieldInt_O < 2 && this.fieldInt_O != -1) {
                  this.fieldBool_M = false;
                  this.fieldBool_L = true;
               }

               return;
            default:
               this.fieldBool_T = true;
         }

         if (this.getEnum6Val() == RotationUtil1_x.STRAFE_ROTATION) {
            if (this.isValid_7()) {
               return;
            }

            if (!this.checkCondition_2() || this.fieldFloat_E == 0.0F) {
               return;
            }

            var1.double_ = (float)Math.sqrt(2.0);
         }
      }
   }

   @EventListener
   public void toggle(SpoofInputEventEvent var1) {
      long var2 = 57327261576261L;
      String var4 = getString_2();
      boolean var5 = var1.keyBinding_g == BreezeClient.CONST_A.gameSettings.keyBindForward
         || var1.keyBinding_g == BreezeClient.CONST_A.gameSettings.keyBindBack
         || var1.keyBinding_g == BreezeClient.CONST_A.gameSettings.keyBindLeft
         || var1.keyBinding_g == BreezeClient.CONST_A.gameSettings.keyBindRight;
      switch (RotationUtil6.CONST_B[this.modeSetting.getObject_m().ordinal()]) {
         case 1:
            if (var1.keyBinding_g == BreezeClient.CONST_A.gameSettings.keyBindJump) {
               var1.fieldBool_h = false;
            }

            if (var5 && !BreezeClient.CONST_A.thePlayer.onGround && this.fieldBool_M && this.fieldBool_J) {
               var1.fieldBool_h = false;
            }

            if (var5 && !BreezeClient.CONST_A.thePlayer.onGround && this.absValue_3() && BreezeClient.CONST_A.thePlayer.motionY > 0.0 && this.fieldBool_J) {
               var1.fieldBool_h = false;
            }

            return;
         case 2:
            if (var1.keyBinding_g == BreezeClient.CONST_A.gameSettings.keyBindJump) {
               var1.fieldBool_h = false;
            }

            if (!var5 || BreezeClient.CONST_A.thePlayer.onGround || !(BreezeClient.CONST_A.thePlayer.motionY < 0.0) || !this.absValue_3() && this.fieldInt_O != -1) {
               break;
            }

            var1.fieldBool_h = false;
            if (var4 != null) {
               break;
            }
         case 3:
         case 4:
            if (var1.keyBinding_g == BreezeClient.CONST_A.gameSettings.keyBindSneak && this.fieldInt_K != -1) {
               var1.fieldBool_h = true;
            }
      }
   }

   private boolean isValid() {
      long var1 = 139855398710093L;
      return this.fieldInt_y > 10 || this.fieldInt_y == -1;
   }

   private void updateRotation_2() {
      long var1 = 55368118531370L;
      String var10000 = getString_2();
      boolean var3 = this.absValue_3();
      String var4 = var10000;
      switch (RotationUtil6.CONST_B[this.modeSetting.getObject_m().ordinal()]) {
         case 5:
            BreezeClient.CONST_A.thePlayer.setSprinting(false);
            MinecraftAccessor.initialize_24(BreezeClient.CONST_A.gameSettings.keyBindSprint, false);
            if (var4 != null) {
               break;
            }
         case 3:
            MinecraftAccessor.initialize_24(BreezeClient.CONST_A.gameSettings.keyBindSprint, false);
            BreezeClient.CONST_A.thePlayer.setSprinting(false);
            if (this.absValue()) {
               BreezeClient.CONST_A.thePlayer.movementInput.moveStrafe = this.absValue_2();
               this.fieldInt_K = -1;
               if (var4 != null) {
                  break;
               }
            }

            this.fieldFloat_R = 0.0F;
         case 4:
            BreezeClient.CONST_A.thePlayer.setSprinting(false);
            MinecraftAccessor.initialize_24(BreezeClient.CONST_A.gameSettings.keyBindSprint, false);
            BlockPos var5 = new BlockPos(BreezeClient.CONST_A.thePlayer.posX, BreezeClient.CONST_A.thePlayer.posY, BreezeClient.CONST_A.thePlayer.posZ).down();
            if (this.isValid_6(var5) && BreezeClient.CONST_A.thePlayer.onGround) {
               this.fieldInt_K = 0;
            }

            if (BreezeClient.getThemeManager().getInt_c() == 1) {
               this.fieldInt_K = 0;
            }

            int var8;
            label72: {
               boolean var6 = false;
               if (var3) {
                  var8 = (int)(
                     2.0F + this.random_w.nextFloat() * 0.5F * this.timingSetting.getObject_m().intValue() + 0.5F * this.timingSetting.getObject_m().intValue()
                  );
                  if (var4 != null) {
                     break label72;
                  }
               }

               var8 = (int)(
                  1.0F + this.random_w.nextFloat() + 0.5F * this.timingSetting.getObject_m().intValue() + 0.5F * this.timingSetting.getObject_m().intValue()
               );
            }

            if (this.fieldInt_K < var8) {
               break;
            }

            this.fieldInt_K = -1;
            if (var4 != null) {
               break;
            }
         case 1:
         case 2:
            MinecraftAccessor.initialize_24(BreezeClient.CONST_A.gameSettings.keyBindSprint, true);
            this.fieldInt_O = -1;
            this.fieldInt_P = -1;
            RangeValue[] var7 = BlockUtil10.getHitPoints(BreezeClient.CONST_A.thePlayer, 6);
            if (!BreezeClient.CONST_A.thePlayer.onGround) {
               int var9 = 0;

               while (var9 < var7.length) {
                  if (var7[var9].isBool_d() && var9 + 1 < var7.length && var7[var9 + 1].isBool_d()) {
                     this.fieldInt_O = var9;
                     if (var4 != null) {
                        break;
                     }
                  }

                  var9++;
                  if (var4 == null) {
                     break;
                  }
               }

               if (var4 != null) {
                  return;
               }
            }

            int var10 = 0;

            while (var10 < var7.length) {
               if (!var7[var10].isBool_d()) {
                  this.fieldInt_P = var10;
                  if (var4 != null) {
                     break;
                  }
               }

               var10++;
               if (var4 == null) {
                  break;
               }
            }
      }
   }

   private boolean isValid_2() {
      long var1 = 82985377175463L;
      return this.fieldInt_G != -1 || this.fieldInt_H != -1;
   }

   private void sendPacket_2() {
      long var1 = 74787875594989L;
      String var3 = getString_2();
      switch (RotationUtil6.CONST_C[this.swingSetting.getObject_m().ordinal()]) {
         case 1:
            if (this.fieldInt_G != -1 && BreezeClient.CONST_A.thePlayer.inventory.currentItem != this.fieldInt_G) {
               BreezeClient.getConfigManager().update_4(new C09PacketHeldItemChange(BreezeClient.CONST_A.thePlayer.inventory.currentItem), false);
            }

            this.fieldInt_G = -1;
            if (var3 != null) {
               break;
            }
         case 2:
            if (this.fieldInt_H != -1) {
               BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_H;
               this.fieldInt_H = -1;
               MinecraftAccessor.initialize_68(BreezeClient.CONST_A.playerController);
            }
      }
   }

   private void sendPacket_3(int var1) {
      long var2 = 118271930481876L;
      String var10000 = getString_2();
      int var4 = BreezeClient.CONST_A.thePlayer.inventory.currentItem;
      String var5 = var10000;
      switch (RotationUtil6.CONST_C[this.swingSetting.getObject_m().ordinal()]) {
         case 1:
            if (this.fieldInt_G == -1) {
               this.fieldInt_G = var4;
            }

            if (this.fieldInt_G == var1) {
               break;
            }

            this.fieldInt_G = var1;
            BreezeClient.getConfigManager().update_4(new C09PacketHeldItemChange(var1), false);
            if (var5 != null) {
               break;
            }
         case 2:
         case 3:
            if (this.fieldInt_H == -1) {
               this.fieldInt_H = var4;
            }

            if (var1 != BreezeClient.CONST_A.thePlayer.inventory.currentItem) {
               BreezeClient.CONST_A.thePlayer.inventory.currentItem = var1;
               MinecraftAccessor.initialize_68(BreezeClient.CONST_A.playerController);
            }
      }
   }

   private void update_2() {
      long var1 = 21233198299085L;
      if (this.modeSetting.getObject_m().allowTower) {
         ;
      }
   }

   private boolean isValid_3(ItemStack var1) {
      long var2 = 75737124045816L;
      if (this.dataBuilder27_x == null) {
         return false;
      }

      switch (RotationUtil6.CONST_B[this.modeSetting.getObject_m().ordinal()]) {
         default:
            return this.isValid_4(var1);
      }
   }

   private boolean isValid_4(ItemStack var1) {
      return BreezeClient.CONST_A
         .playerController
         .onPlayerRightClick(
            BreezeClient.CONST_A.thePlayer,
            BreezeClient.CONST_A.theWorld,
            var1,
            ClassValueCache.getBlockPos_a(this.dataBuilder27_x),
            ClassValueCache.getEnumFacing_b(this.dataBuilder27_x),
            ClassValueCache.getVec3_c(this.dataBuilder27_x)
         );
   }

   private ClassValueCache rayTrace(BlockPos var1) {
      long var2 = 86745409340482L;
      Vec3 var4 = BreezeClient.CONST_A.thePlayer.getPositionEyes(this.fieldFloat_z);
      float var5 = BreezeClient.getModuleRegistry().getFloat_g();
      float var6 = BreezeClient.getModuleRegistry().getFloat();
      Vec3 var7 = MinecraftAccessor.getVec3(BreezeClient.CONST_A.thePlayer, var6, var5);
      float var8 = this.getFloat();
      Vec3 var9 = var4.addVector(var7.xCoord * var8, var7.yCoord * var8, var7.zCoord * var8);
      MovingObjectPosition var10 = BreezeClient.CONST_A.theWorld.rayTraceBlocks(var4, var9, false, false, false);
      if (var10 != null && var10.typeOfHit == MovingObjectType.BLOCK) {
         BlockPos var11 = var10.getBlockPos();
         net.minecraft.util.EnumFacing var12 = var10.sideHit;
         Vec3 var13 = var10.hitVec;
         if (this.getDistance(var11, var12, var13, var1, var4)) {
            return new ClassValueCache(var11, var12, var13, null);
         }
      }

      if (!this.getHitbox() && this.random_w.nextBoolean()) {
         return null;
      }

      Vec3 var21 = BreezeClient.CONST_A.thePlayer.getPositionVector();
      float var22 = (float)(0.5 + MathUtil1.clamp_3(this.random_w.nextGaussian() * 0.1 + 0.1, -0.3, 0.45));
      Vec3 var23 = new Vec3(var21.xCoord, var1.getY() + var22, var21.zCoord);
      Vec3 var14 = new Vec3(var7.xCoord, 0.0, var7.zCoord).normalize();
      var10 = BreezeClient.CONST_A
         .theWorld
         .rayTraceBlocks(var23, var21.addVector(var14.xCoord * var8, var14.yCoord * var8, var14.zCoord * var8), false, false, false);
      if (var10 != null && var10.typeOfHit == MovingObjectType.BLOCK) {
         BlockPos var15 = var10.getBlockPos();
         net.minecraft.util.EnumFacing var16 = var10.sideHit;
         Vec3 var17 = var10.hitVec;
         if (this.getDistance(var15, var16, var17, var1, var4)) {
            float var28 = RotationUtil7.calcDistance(var17, var4, true)[1];
            this.arr_B = new float[]{var5, var28};
            return new ClassValueCache(var15, var16, var17, null);
         }
      }

      if (this.blockPos_C == null) {
         return null;
      }

      var23 = new Vec3(BreezeClient.CONST_A.thePlayer.posX, this.blockPos_C.getY() + var22, BreezeClient.CONST_A.thePlayer.posZ);
      Vec3 var25 = new Vec3(this.blockPos_C.getX() + 0.5, this.blockPos_C.getY() + 0.5, this.blockPos_C.getZ() + 0.5);
      if (new AxisAlignedBB(var23.xCoord, var23.yCoord, var23.zCoord, var25.xCoord, var25.yCoord, var25.zCoord).isVecInside(var23)) {
         return null;
      }

      var10 = BreezeClient.CONST_A.theWorld.rayTraceBlocks(var23, var25, false, false, false);
      if (var10 != null && var10.typeOfHit == MovingObjectType.BLOCK) {
         BlockPos var26 = var10.getBlockPos();
         net.minecraft.util.EnumFacing var27 = var10.sideHit;
         Vec3 var18 = var10.hitVec;
         if (this.getDistance(var26, var27, var18, var1, var4)) {
            return new ClassValueCache(var26, var27, var18, true, null);
         }
      }

      return null;
   }

   private boolean getDistance(BlockPos var1, net.minecraft.util.EnumFacing var2, Vec3 var3, BlockPos var4, Vec3 var5) {
      long var6 = 37047057272626L;
      int var8 = var1.getY() + var2.getFrontOffsetY();
      switch (RotationUtil6.CONST_B[this.modeSetting.getObject_m().ordinal()]) {
         case 1:
         case 2:
            if (var8 > var4.getY()) {
               return false;
            }
            break;
         default:
            if (var8 != var4.getY()) {
               return false;
            }
      }

      if (this.checkCondition() && !this.fieldBool_J && var8 != this.fieldInt_I - 1) {
         return false;
      }

      if (this.isValid_6(var1)) {
         return false;
      }

      if (var3.distanceTo(var5) > this.getFloat()) {
         return false;
      }

      if (this.rotationsSetting.getObject_m()) {
         float[] var9 = RotationUtil7.calcDistance(var3, var5, true);
         if (BreezeClient.getModuleRegistry().calculateFloat_2(var9) > this.calculateFloat()) {
            return false;
         }
      }

      MovingObjectPosition var10 = BreezeClient.CONST_A.theWorld.rayTraceBlocks(var5, var3, false, false, false);
      return var10 == null;
   }

   private boolean isValid_5(ClassValueCache var1, BlockPos var2, Vec3 var3) {
      return this.getDistance(ClassValueCache.getBlockPos_a(var1), ClassValueCache.getEnumFacing_b(var1), ClassValueCache.getVec3_c(var1), var2, var3);
   }

   private ClassValueCache getDataBuilder27(BlockPos var1) {
      long var2 = 5722100136136L;
      String var10000 = getString_2();
      Vec3 var4 = BreezeClient.CONST_A.thePlayer.getPositionEyes(this.fieldFloat_z);
      String var5 = var10000;

      for (net.minecraft.util.EnumFacing var9 : net.minecraft.util.EnumFacing.values()) {
         BlockPos var10 = var1.offset(var9);
         if (!this.isValid_6(var10) || var5 == null) {
            ClassValueCache var11 = new ClassValueCache(var10, var9.getOpposite(), this.random_w, null);
            if (this.isValid_5(var11, var1, var4)) {
               return var11;
            }
         }

         if (var5 == null) {
            break;
         }
      }

      for (net.minecraft.util.EnumFacing var20 : net.minecraft.util.EnumFacing.values()) {
         BlockPos var21 = var1.offset(var20);
         if (this.isValid_6(var21) || var5 == null) {
            for (net.minecraft.util.EnumFacing var14 : net.minecraft.util.EnumFacing.values()) {
               BlockPos var15 = var21.offset(var14);
               if (!this.isValid_6(var15) || var5 == null) {
                  ClassValueCache var16 = new ClassValueCache(var15, var14.getOpposite(), this.random_w, null);
                  if (this.isValid_5(var16, var1, var4)) {
                     return var16;
                  }
               }

               if (var5 == null) {
                  break;
               }
            }
         }

         if (var5 == null) {
            break;
         }
      }

      return null;
   }

   private boolean isValid_6(BlockPos var1) {
      return BreezeClient.CONST_A.theWorld.getBlockState(var1).getBlock().getMaterial().isReplaceable();
   }

   private boolean getHitbox() {
      long var1 = 67163354434266L;
      if (!BreezeClient.CONST_A.thePlayer.onGround) {
         return true;
      }

      AxisAlignedBB var3 = BreezeClient.CONST_A.thePlayer.getEntityBoundingBox();
      var3 = var3.offset(BreezeClient.CONST_A.thePlayer.motionX, BreezeClient.CONST_A.thePlayer.motionY, BreezeClient.CONST_A.thePlayer.motionZ);
      return BreezeClient.CONST_A.theWorld.getCollidingBoundingBoxes(BreezeClient.CONST_A.thePlayer, var3).isEmpty();
   }

   private float calculateFloat() {
      return (float)(Math.pow(this.autoF5Setting.getObject_m() / 10.0, 1.5) * 180.0);
   }

   public void updateRotation_3(ModuleRegistry var1) {
      float var5;
      label271: {
         String var4;
         label248: {
            float var6;
            label272: {
               long var2 = 117735033473270L;
               String var10000 = getString_2();
               this.fieldBool_A = true;
               var1.isActive(false).isActive_2(this.isValid_7());
               this.fieldInt_U++;
               var4 = var10000;
               var5 = this.calculateFloat();
               switch (RotationUtil6.CONST_D[this.getEnum6Val().ordinal()]) {
                  case 1:
                     if (this.fieldBool_L) {
                        this.fieldFloat_N = null;
                        var6 = var1.getFloat_g() + RotationUtil7.calculateFloat(BreezeClient.CONST_A.thePlayer.rotationYaw - var1.getFloat_g());
                        if (!this.checkCondition_2()) {
                           break label272;
                        }

                        float var7 = MathUtil1.clamp(this.arr_B == null ? 30.0F + this.random_w.nextFloat() : this.arr_B[1], -90.0F, 90.0F);
                        this.arr_B = new float[]{var6, var7};
                        boolean var8 = (this.getHitbox() || this.modeSetting.isValid(ClientMode2.WATCHDOG) && BreezeClient.getThemeManager().getInt_d() > 1)
                           && BreezeClient.CONST_A.thePlayer.onGround;
                        var1.isActive(var8);
                        if (var8) {
                           this.fieldInt_U = 0;
                        }

                        if (var4 == null) {
                           break label272;
                        }

                        if (var4 != null) {
                           break label271;
                        }
                     }

                     label220:
                     if (this.fieldInt_y != 0) {
                        if (!this.checkCondition_2()) {
                           this.arr_B = new float[]{BreezeClient.CONST_A.thePlayer.rotationYaw, 90.0F};
                           if (var4 != null) {
                              break label220;
                           }
                        }

                        if (BreezeClient.getThemeManager().getInt_c() == 1) {
                           this.arr_B = null;
                           this.dataBuilder27_x = null;
                        }
                     }

                     var1.isActive(this.fieldInt_y == 0);
                     if (!this.fieldBool_S
                        && this.modeSetting.isValid(ClientMode2.WATCHDOG)
                        && (this.fieldInt_U > 3 || this.fieldInt_U == -1)
                        && BreezeClient.getThemeManager().getInt_c() > 2) {
                        var1.isActive(true);
                        this.fieldBool_S = false;
                     }

                     if (this.dataBuilder27_x != null && ClassValueCache.isBool_d(this.dataBuilder27_x)) {
                        Vec3 var9 = BreezeClient.CONST_A.thePlayer.getPositionEyes(this.fieldFloat_z);
                        Vec3 var13 = ClassValueCache.getVec3_c(this.dataBuilder27_x);
                        this.arr_B = RotationUtil7.calcDistance(var13, var9, true);
                     }

                     if (this.arr_B != null) {
                        break label271;
                     }

                     if (this.fieldFloat_N == null) {
                        this.fieldFloat_N = this.calcAngle();
                     }

                     this.arr_B = new float[]{this.fieldFloat_N, (float)MathUtil1.clamp_3(70.0 + this.random_w.nextGaussian() * 2.0, -90.0, 90.0)};
                     if (var4 != null) {
                        break label271;
                     }
                  case 2:
                     if (this.isValid()) {
                        return;
                     }

                     if (this.fieldInt_y > 3) {
                        this.arr_B = null;
                        if (var4 != null) {
                           break label271;
                        }
                     }

                     if (this.arr_B == null && this.fieldInt_y != 0) {
                        return;
                     }

                     if (this.fieldInt_y == 0) {
                        var1.isActive(true);
                     }

                     if (this.dataBuilder27_x == null) {
                        break label271;
                     }

                     this.arr_B = RotationUtil7.calcDistance(
                        ClassValueCache.getVec3_c(this.dataBuilder27_x), BreezeClient.CONST_A.thePlayer.getPositionEyes(this.fieldFloat_z), true
                     );
                     if (var4 != null) {
                        break label271;
                     }
                  case 3:
                     break;
                  case 4:
                  case 5:
                  case 6:
                     break label248;
                  default:
                     break label271;
               }

               var6 = this.absValue_4();
               if (this.absValue()) {
                  var6 = var1.getFloat_g() + RotationUtil7.calculateFloat(BreezeClient.CONST_A.thePlayer.rotationYaw - 180.0F - var1.getFloat_g());
               }

               if (!this.checkCondition_2() && BreezeClient.CONST_A.thePlayer.onGround && this.isValid()) {
                  this.arr_B = null;
                  if (var4 != null) {
                     break label271;
                  }
               }

               var1.isActive(this.fieldInt_y == 0);
               if (this.checkCondition_2() && this.fieldInt_y > 2 || this.fieldInt_y == -1) {
                  this.arr_B = null;
               }

               if (this.dataBuilder27_x != null && ClassValueCache.isBool_d(this.dataBuilder27_x)) {
                  Vec3 var14 = BreezeClient.CONST_A.thePlayer.getPositionEyes(this.fieldFloat_z);
                  Vec3 var17 = ClassValueCache.getVec3_c(this.dataBuilder27_x);
                  this.arr_B = RotationUtil7.calcDistance(var17, var14, true);
               }

               if (this.arr_B != null) {
                  break label271;
               }

               this.arr_B = new float[]{var6, (float)MathUtil1.clamp_3(86.0 + this.random_w.nextGaussian() * 0.4, -90.0, 90.0)};
               if (var4 != null) {
                  break label271;
               }
               break label248;
            }

            if (!BreezeClient.CONST_A.thePlayer.onGround) {
               this.arr_B = new float[]{var6, 90.0F};
               if (var4 != null) {
                  break label271;
               }
            }

            this.arr_B = null;
            break label271;
         }

         float var11 = this.getEnum6Val() == RotationUtil1_x.REVERSE_ROTATION ? this.calcAngle() : this.absValue_4();
         if (!this.checkCondition_2() && BreezeClient.CONST_A.thePlayer.onGround && this.isValid()) {
            this.arr_B = null;
            if (var4 != null) {
               break label271;
            }
         }

         var1.isActive(this.fieldInt_y == 0);
         if (this.checkCondition_2() && this.fieldInt_y > 2 || this.fieldInt_y == -1) {
            this.arr_B = null;
         }

         if (this.dataBuilder27_x != null && ClassValueCache.isBool_d(this.dataBuilder27_x)) {
            Vec3 var15 = BreezeClient.CONST_A.thePlayer.getPositionEyes(this.fieldFloat_z);
            Vec3 var18 = ClassValueCache.getVec3_c(this.dataBuilder27_x);
            this.arr_B = RotationUtil7.calcDistance(var18, var15, true);
         }

         if (this.arr_B == null) {
            this.arr_B = new float[]{var11, (float)MathUtil1.clamp_3(86.0 + this.random_w.nextGaussian() * 0.4, -90.0, 90.0)};
         }
      }

      if (this.arr_B == null) {
         this.fieldBool_M = true;
      } else {
         boolean var12 = var1.isValid(this.arr_B, var5);
         switch (RotationUtil6.CONST_B[this.modeSetting.getObject_m().ordinal()]) {
            case 1:
            case 2:
               byte var16 = 2;
               if (!this.fieldBool_L && BreezeClient.getThemeManager().getInt_c() > var16 && (var12 || Math.abs(var1.getFloat_g() - this.arr_B[0]) < var5 + 5.0F)) {
                  this.fieldBool_M = true;
               }

               this.fieldBool_Q = var12 && this.fieldBool_L;
         }
      }
   }

   @EventListener
   public void update_3(JumpEventEvent var1) {
      long var2 = 58341345032208L;
      if (!this.fieldBool_T) {
         var1.a();
      }
   }

   public void toggle_2() {
      System.out.println();
      this.fieldBool_A = false;
   }

   private RotationUtil1_x getEnum6Val() {
      long var1 = 120044564605033L;
      return this.modeSetting.getObject_m().customRotation != null
         ? this.modeSetting.getObject_m().customRotation
         : this.switchSetting.getObject_m().getEnum6Val();
   }

   private boolean isValid_7() {
      long var1 = 45967669838371L;
      switch (RotationUtil6.CONST_B[this.modeSetting.getObject_m().ordinal()]) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            return true;
         default:
            return false;
      }
   }

   private boolean checkCondition() {
      long var1 = 84092319701599L;
      return this.modeSetting.isValid(ClientMode2.TELLY) && this.strictRotateSetting.getObject_m() || this.modeSetting.isValid(ClientMode2.WATCHDOG);
   }

   private float getFloat() {
      long var1 = 94886672830034L;
      switch (RotationUtil6.CONST_B[this.modeSetting.getObject_m().ordinal()]) {
         case 1:
            return 5.0F;
         default:
            return 4.5F;
      }
   }

   private boolean checkCondition_2() {
      long var1 = 65848969282451L;
      boolean var3 = BreezeClient.CONST_A.thePlayer.motionX != 0.0
         || BreezeClient.CONST_A.thePlayer.motionY != 0.0
         || BreezeClient.CONST_A.thePlayer.motionZ != 0.0;
      if (!var3) {
         return false;
      } else {
         return MinecraftAccessor.isValid_9(BreezeClient.CONST_A.gameSettings.keyBindForward)
               != MinecraftAccessor.isValid_9(BreezeClient.CONST_A.gameSettings.keyBindBack)
            ? true
            : MinecraftAccessor.isValid_9(BreezeClient.CONST_A.gameSettings.keyBindRight)
               != MinecraftAccessor.isValid_9(BreezeClient.CONST_A.gameSettings.keyBindLeft);
      }
   }

   private boolean absValue() {
      long var1 = 44959677135938L;
      float var3 = Math.abs(BreezeClient.CONST_A.thePlayer.rotationYaw % 90.0F);
      var3 = Math.min(var3, 90.0F - var3);
      return PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindForward)
         && PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindLeft) == PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindRight)
         && BreezeClient.CONST_A.thePlayer.onGround
         && !MinecraftAccessor.isValid_9(BreezeClient.CONST_A.gameSettings.keyBindJump)
         && !MinecraftAccessor.isValid_9(BreezeClient.CONST_A.gameSettings.keyBindSneak)
         && var3 < 10.0F
         && this.checkCondition_2()
         && !BreezeClient.CONST_A.thePlayer.isSprinting()
         && !this.isValid();
   }

   private float absValue_2() {
      long var1 = 105424099287341L;
      String var10000 = getString_2();
      float var3 = BreezeClient.CONST_A.thePlayer.rotationYaw;
      String var4 = var10000;
      net.minecraft.util.EnumFacing var5 = net.minecraft.util.EnumFacing.fromAngle(var3);
      double var6 = Math.abs(BreezeClient.CONST_A.thePlayer.posX) % 1.0;
      double var8 = Math.abs(BreezeClient.CONST_A.thePlayer.posZ) % 1.0;
      if (BreezeClient.CONST_A.thePlayer.posX < 0.0) {
         var6 = 1.0 - var6;
      }

      if (BreezeClient.CONST_A.thePlayer.posZ < 0.0) {
         var8 = 1.0 - var8;
      }

      float var10 = var5.getAxisDirection().getOffset();
      float var11 = 0.15F + (float)(0.3 * this.random_w.nextFloat());
      if (var5.getAxis() == Axis.X) {
         if (var8 < var11 || var8 > 1.0F - var11) {
            this.fieldFloat_R = 0.0F;
         }

         if (this.fieldFloat_R != 0.0F || !(this.random_w.nextFloat() > 0.2)) {
            return this.fieldFloat_R;
         }

         this.fieldFloat_R = var8 > 0.5 ? var10 : -var10;
         if (var4 != null) {
            return this.fieldFloat_R;
         }
      }

      if (var6 < var11 || var6 > 1.0F - var11) {
         this.fieldFloat_R = 0.0F;
      }

      if (this.fieldFloat_R == 0.0F && this.random_w.nextFloat() > 0.2) {
         this.fieldFloat_R = var6 > 0.5 ? -var10 : var10;
      }

      return this.fieldFloat_R;
   }

   private boolean absValue_3() {
      long var1 = 98414569953977L;
      float var3 = this.calcAngle();
      float var4 = Math.abs(var3 % 90.0F);
      var4 = Math.min(var4, 90.0F - var4);
      return var4 > 10.0F;
   }

   private float calcAngle() {
      long var1 = 25557374195542L;
      String var3 = getString_2();
      if (this.isValid_7()) {
         float var4 = BreezeClient.CONST_A.thePlayer.rotationYaw + 180.0F;
         int var5 = 0;
         float var6 = 0.0F;
         if (PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindForward)) {
            var5++;
         }

         if (PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindRight)) {
            var5++;
            var6 += 90.0F;
            if (var3 != null) {
               return var5 != 0 && var4 != 0.0F ? var4 + var6 / var5 : var4 + 180.0F;
            }
         }

         if (PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindLeft)) {
            var5++;
            var6 -= 90.0F;
            if (var3 != null) {
               return var5 != 0 && var4 != 0.0F ? var4 + var6 / var5 : var4 + 180.0F;
            }
         }

         if (PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindBack)) {
            var5++;
            var6 += 180.0F;
         }

         return var5 != 0 && var4 != 0.0F ? var4 + var6 / var5 : var4 + 180.0F;
      } else {
         return (float)(Math.toDegrees(Math.atan2(-BreezeClient.CONST_A.thePlayer.motionX, BreezeClient.CONST_A.thePlayer.motionZ)) - 180.0);
      }
   }

   private float absValue_4() {
      long var1 = 20300532421360L;
      String var10000 = getString_2();
      float var3 = this.calcAngle();
      String var4 = var10000;
      if (this.absValue_3()) {
         this.fieldFloat_E = 0.0F;
         return var3;
      }

      float var10;
      float var11;
      label44: {
         net.minecraft.util.EnumFacing var5 = net.minecraft.util.EnumFacing.fromAngle(var3);
         double var6 = Math.abs(BreezeClient.CONST_A.thePlayer.posX % 1.0);
         double var8 = Math.abs(BreezeClient.CONST_A.thePlayer.posZ % 1.0);
         var10 = var5.getAxisDirection().getOffset() * 45;
         var11 = this.enumFacing_F.equals(var5) ? this.fieldFloat_E : 0.0F;
         if (var5.getAxis() == Axis.X) {
            var11 = var8 > 0.5 ? -var10 : (var8 < 0.5 ? var10 : var11);
            if (!(BreezeClient.CONST_A.thePlayer.posZ < 0.0)) {
               break label44;
            }

            var11 = -var11;
            if (var4 != null) {
               break label44;
            }
         }

         var11 = var6 > 0.5 ? var10 : (var6 < 0.5 ? -var10 : var11);
         if (BreezeClient.CONST_A.thePlayer.posX < 0.0) {
            var11 = -var11;
         }
      }

      this.fieldFloat_E = var10;
      return var3 + var11;
   }

   public int getValue() {
      return 30;
   }

   public boolean checkCondition_3() {
      long var1 = 64064194423L;
      return this.f() && !this.modeSetting.isValid(ClientMode2.VANILLA);
   }

   private static boolean lambda$new_Inner2(rip.breeze.DateUtil var0) {
      long var1 = 120217147726104L;
      return var0.getObject("Mode", ClientMode2.class).customRotation == null;
   }

   private static boolean lambda$new_Inner1(rip.breeze.DateUtil var0) {
      long var1 = 75078320979385L;
      return var0.getObject("Mode", ClientMode2.class) == ClientMode2.TELLY;
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 32146396011924L;
      return var0.getObject("Mode", ClientMode2.class) == ClientMode2.NINJA
         || var0.getObject("Mode", ClientMode2.class) == ClientMode2.BREEZILY;
   }

   public static void initialize(String var0) {
      string_V = var0;
   }

   public static String getString_2() {
      return string_V;
   }

   static {
      initialize("hCRqec");
      long var0 = 103151285497968L;
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
      String var6 = "T\u0002\u0098\u0019}ðmr×úÑ\\7è\u0011R£\u001a\u00ad\u0084äÍ\u008f\u009b\u0099úKÎëüN\u00814ë¸\u0094\u0089Õ&0. S\u0099N,m%2çê²\u0082o¾¦4æT+Æ6¸©\u0098ä\u0005à:.ämo$ý09\u009c\u009cÀ7\u0006X\u0003ÉË)À\u001bÚ³¤KI\u0011Ýï)À¼\u0005Kâ \u0018L°ô¾tÆ^hm\u009aIQ³1ÃwCßX\u0080{`\u0001\u0013\u001f]\u001a\u0086´\u0084d\u0001\u0096'Ù^>U\u0082Bþ\u0082É\u00adõR4Ø\u001fC.W0\u0011\u0019X\u0084H4\u009bi®ta¨\u001fzí\n\u001eø9^\u0011Ý8\u0007J¿á\u001eñâ\u000fKñ¡\u008c\rwQáÒa\u008eà\nì\u009c\u0087ßBÓÀ}ÆXW÷~\u0090ÚÎ\u009a¤¦\u0092ÒvWß¶\u0082\u0093iûìS\u0081o¹\u009fÏ\u001cNê\u0017Jb¸JG\u009a[8d<TÌ·¤\u008d´\u0098\u0097\u0010ã&êTZwV\u000bp\u009aíÐµk×[@L¼Ykf\t\u0080ÔY\u0013l\t\u009a\u0095NQWÅB0=ü0½,Û\u0097¦\u0018âZÀ=é\n\u0013ã#=\u0005\u0081Â+\u0018·àµ\u001d \u007fn\u0083B`ÈìÛø\u000e\u009cíà\u008fW´\u000e\u0088\u0080[¥)\u008bj\u0007\"¯D\u001dqO\u0097ð\u0094|¡ÍR\u0002·Òá\u0092\u0013¸\u0001×ð\r\u0080w mõ\u0091.ÙTÕÄÅ°\u0088;ñIê«Êu× \u008b±tÐ\u0084.\r8s3{Û\u007f\u001f\u001aºl¹\u0088\u0013Í¶}±v.å{\u008cpvv*Ú\u0080e\u0083\u0094\u001dýÓ\u0097ÎJÁ\u0093o;ó¬º{ª¿W\u0092ã\u0080q\u0098ÜPi\u0082ÐñÝ1¼3\u001a+ë\tlÐ¿dÁ#¬õáxõ\u00134¶\u008e`££ÄüåÚ\tì\u008f\tæ`ã\u0085À±¹yÀåÒô\u001b±ºhl5â2;#\u0086Ù\u008c%@aD=\u0091ok7ë\u0000\u0088£\u0099Z\u0013U\u0010\u0000¿Kbx(\u0089\u009eÿ\"G\u009fîò\u0083\u0005\u0010\u0005G\u000e\u0019T0éQ3¦\u000eYÒ±¨\u0005XTñ\u0016w¶ÝmÔÌ\u0015\u0091Svu¯Ó³\u0084\u0016<\u0017\u009dÞÿZpxH\u009fM%ñ\u00ad¥;Q\u009d/k¤Ã\u001aìaÞ\u0089:\u001ei\u0016[Gù\u0087Q\u0089*a\u0018^óP_Úí\u0082I\u009b\u0018\u0095\u008e\u0005}w!\u0015·\u0019,ápfÕ4æ\\O3 \u001f7Æ,Ù¥\u009br\u0096Ð¯+³µeÄ\u0017ìüÛ°«\u0092é\u0092^c¤Ö\u0091õÎ ÝóiOÈGI\u001fø\u0001\f¦M´¹ql²\u008b¬\u001cgÞk¢\tÙ\u0085Òä\u00804 h÷\u009bUÝø?\\(K8Å\u0082ºQÄâ\u0001Ü`>ûñ8Ë\u0002\u0092-\u0002\nÑ\u0011\u0010ê½z\u0091\\p>L\u0012j±×¨|È%\u0010ý\u009e\u0084ÖîÒ³çÂsç\u0017\u0080?\u0019'\u0010N|\tò\u0081\u008cå)\u0081I¯\u001aZ\u008e\u0003¬\u0010\u009f·¾\u009b2ÕÈâw¦\u0097CzzPE\u0010W g¯Û\u0092\u000b\u009eh\u001fûg´\u001aùà";
      int var7 = "T\u0002\u0098\u0019}ðmr×úÑ\\7è\u0011R£\u001a\u00ad\u0084äÍ\u008f\u009b\u0099úKÎëüN\u00814ë¸\u0094\u0089Õ&0. S\u0099N,m%2çê²\u0082o¾¦4æT+Æ6¸©\u0098ä\u0005à:.ämo$ý09\u009c\u009cÀ7\u0006X\u0003ÉË)À\u001bÚ³¤KI\u0011Ýï)À¼\u0005Kâ \u0018L°ô¾tÆ^hm\u009aIQ³1ÃwCßX\u0080{`\u0001\u0013\u001f]\u001a\u0086´\u0084d\u0001\u0096'Ù^>U\u0082Bþ\u0082É\u00adõR4Ø\u001fC.W0\u0011\u0019X\u0084H4\u009bi®ta¨\u001fzí\n\u001eø9^\u0011Ý8\u0007J¿á\u001eñâ\u000fKñ¡\u008c\rwQáÒa\u008eà\nì\u009c\u0087ßBÓÀ}ÆXW÷~\u0090ÚÎ\u009a¤¦\u0092ÒvWß¶\u0082\u0093iûìS\u0081o¹\u009fÏ\u001cNê\u0017Jb¸JG\u009a[8d<TÌ·¤\u008d´\u0098\u0097\u0010ã&êTZwV\u000bp\u009aíÐµk×[@L¼Ykf\t\u0080ÔY\u0013l\t\u009a\u0095NQWÅB0=ü0½,Û\u0097¦\u0018âZÀ=é\n\u0013ã#=\u0005\u0081Â+\u0018·àµ\u001d \u007fn\u0083B`ÈìÛø\u000e\u009cíà\u008fW´\u000e\u0088\u0080[¥)\u008bj\u0007\"¯D\u001dqO\u0097ð\u0094|¡ÍR\u0002·Òá\u0092\u0013¸\u0001×ð\r\u0080w mõ\u0091.ÙTÕÄÅ°\u0088;ñIê«Êu× \u008b±tÐ\u0084.\r8s3{Û\u007f\u001f\u001aºl¹\u0088\u0013Í¶}±v.å{\u008cpvv*Ú\u0080e\u0083\u0094\u001dýÓ\u0097ÎJÁ\u0093o;ó¬º{ª¿W\u0092ã\u0080q\u0098ÜPi\u0082ÐñÝ1¼3\u001a+ë\tlÐ¿dÁ#¬õáxõ\u00134¶\u008e`££ÄüåÚ\tì\u008f\tæ`ã\u0085À±¹yÀåÒô\u001b±ºhl5â2;#\u0086Ù\u008c%@aD=\u0091ok7ë\u0000\u0088£\u0099Z\u0013U\u0010\u0000¿Kbx(\u0089\u009eÿ\"G\u009fîò\u0083\u0005\u0010\u0005G\u000e\u0019T0éQ3¦\u000eYÒ±¨\u0005XTñ\u0016w¶ÝmÔÌ\u0015\u0091Svu¯Ó³\u0084\u0016<\u0017\u009dÞÿZpxH\u009fM%ñ\u00ad¥;Q\u009d/k¤Ã\u001aìaÞ\u0089:\u001ei\u0016[Gù\u0087Q\u0089*a\u0018^óP_Úí\u0082I\u009b\u0018\u0095\u008e\u0005}w!\u0015·\u0019,ápfÕ4æ\\O3 \u001f7Æ,Ù¥\u009br\u0096Ð¯+³µeÄ\u0017ìüÛ°«\u0092é\u0092^c¤Ö\u0091õÎ ÝóiOÈGI\u001fø\u0001\f¦M´¹ql²\u008b¬\u001cgÞk¢\tÙ\u0085Òä\u00804 h÷\u009bUÝø?\\(K8Å\u0082ºQÄâ\u0001Ü`>ûñ8Ë\u0002\u0092-\u0002\nÑ\u0011\u0010ê½z\u0091\\p>L\u0012j±×¨|È%\u0010ý\u009e\u0084ÖîÒ³çÂsç\u0017\u0080?\u0019'\u0010N|\tò\u0081\u008cå)\u0081I¯\u001aZ\u008e\u0003¬\u0010\u009f·¾\u009b2ÕÈâw¦\u0097CzzPE\u0010W g¯Û\u0092\u000b\u009eh\u001fûg´\u001aùà"
         .length();
      char var8 = 160;
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
                     CONST_X = var4;
                     CONST_Y = new String[19];
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

                  var6 = "\u008eÅ_ÐÈÏ\u000f@ù\u000f½\u0088y\u0085MüÄ\u000e.\r\u007f²µ\u0098H\u0016¿GµÍy\u008b8bÇ¢DmHÍ¿®É¸}\u0098ß®U\u008c\u001b\u0014Ù¤#¸]\u0085¯©\u0085)[\u0010Î.t\u008dÂ\u001eÙJÊWÞA÷(\u0013Å\u0005\u00196=\u0016Õ@|ÍÄ\u0010x\u009eÖ~{\u0086";
                  var7 = "\u008eÅ_ÐÈÏ\u000f@ù\u000f½\u0088y\u0085MüÄ\u000e.\r\u007f²µ\u0098H\u0016¿GµÍy\u008b8bÇ¢DmHÍ¿®É¸}\u0098ß®U\u008c\u001b\u0014Ù¤#¸]\u0085¯©\u0085)[\u0010Î.t\u008dÂ\u001eÙJÊWÞA÷(\u0013Å\u0005\u00196=\u0016Õ@|ÍÄ\u0010x\u009eÖ~{\u0086"
                     .length();
                  var8 = 24;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17623;
      if (CONST_Y[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Z.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Z.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dY", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_X[var3].getBytes("ISO-8859-1");
         CONST_Y[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Y[var3];
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
         throw new RuntimeException("rip/breeze/client/dY" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
