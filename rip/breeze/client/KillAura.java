package rip.breeze.client;

import com.mojang.realmsclient.gui.ChatFormatting;
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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C02PacketUseEntity.Action;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import org.lwjgl.opengl.GL11;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.EventBus;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.KeepParameters;
import rip.breeze.LicenseState;
import rip.breeze.MathUtil1;
import rip.breeze.ModuleInfo;
import rip.breeze.RenderUtil18_x;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(
   a = "KillAura",
   b = "Automatically aim and clicks at your enemies.",
   d = rip.breeze.ModuleCategory.COMBAT,
   c = {"kill", "aura", "click", "aim", "force", "forcefield", "field"}
)
public class KillAura extends BreezeModule implements IBreezeInterface2, IBreezeInterface3 {
   private final GenericSetting<EnumType30> targetingSetting;
   private final GenericSetting<Double> swingRangeSetting;
   private final GenericSetting<Double> aimRangeSetting;
   private final GenericSetting<Integer> fOVSetting;
   private final GenericSetting<rip.breeze.RangeValue> cPSSetting;
   private final GenericSetting<Integer> rotationSpeedSetting;
   private final GenericSetting<Boolean> throughWallsSetting;
   private final GenericSetting<Double> wallRangeSetting;
   private final GenericSetting<SpeedMode3> holdRightClickSetting;
   private final GenericSetting<Boolean> weaponOnlySetting;
   private final GenericSetting<Boolean> legitWalkSetting;
   private final GenericSetting<Boolean> renderSetting;
   private final GenericSetting<EnumType11> colorSetting;
   private final GenericSetting<rip.breeze.BreezeColor> lockViewSetting;
   private final GenericSetting<RenderUtil19_x> dataBuilder54_B;
   private final Random random_C;
   public boolean fieldBool_D;
   private EntityLivingBase entityLivingBase_E;
   private float fieldFloat_F;
   private final Util133 dataBuilder112_G;
   private final Util133 dataBuilder112_H;
   private double double_I;
   private float fieldFloat_J;
   private ItemStack itemStack_K;
   private boolean fieldBool_L;
   private boolean fieldBool_M;
   private float[] arr_N;
   private float[] arr_O;
   boolean fieldBool_P;
   private static String string_Q;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);
   private static final long eka_1;

   public KillAura() {
      long var1 = 135064942893970L;
      super();
      short var10002 = 17027;
      long var10003 = 7549499464594458813L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Targeting");
      var10002 = 15225;
      var10003 = 3232371153616859466L ^ var1;
      this.targetingSetting = var10001.getDataBuilder50_3("How to choose targets.").getDataBuilder50_4(EnumType30.SINGLE).getDataBuilder54();
      var10002 = 28272;
      var10003 = 6702481830054372416L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "SwingRange");
      var10002 = 19639;
      var10003 = 8220245224040400536L ^ var1;
      this.swingRangeSetting = var10001.getDataBuilder50_3("How far away to start swinging at enemies, the reach module will still apply.")
         .getDataBuilder50_4(5.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(1.0, 10.0))
         .getDataBuilder54();
      var10002 = 32036;
      var10003 = 2840687928808519436L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "AimRange");
      var10002 = 1684;
      var10003 = 8950164371308924079L ^ var1;
      this.aimRangeSetting = var10001.getDataBuilder50_3("How far away to aim at enemies, must be higher than the swing range.")
         .getDataBuilder50_4(5.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(1.0, 10.0))
         .getDataBuilder54();
      var10002 = 13411;
      var10003 = 5336628417787690580L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "FOV");
      var10002 = 6047;
      var10003 = 4849381136539213216L ^ var1;
      this.fOVSetting = var10001.getDataBuilder50_3("The field of view to attack within.")
         .getDataBuilder50_4(90)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(10, 360))
         .getDataBuilder54();
      var10002 = 5226;
      var10003 = 601269019442667084L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "CPS");
      var10002 = 10626;
      var10003 = 231593702220981183L ^ var1;
      this.cPSSetting = var10001.getDataBuilder50_3("How fast to attack, upping this value may make it more more responsive.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(12.0, 16.0))
         .clamp(rip.breeze.RangeValue.getPredicate_2(1.0, 20.0))
         .getDataBuilder54();
      var10002 = 18830;
      var10003 = 5466540565853176754L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "RotationSpeed");
      var10002 = 31914;
      var10003 = 7204097116237641351L ^ var1;
      this.rotationSpeedSetting = var10001.getDataBuilder50_3("How fast to rotate, upping this value may make it more more responsive.")
         .getDataBuilder50_4(50)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(30, 180))
         .getDataBuilder54();
      var10002 = 15122;
      var10003 = 7138566390108942642L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "ThroughWalls");
      var10002 = 2683;
      var10003 = 8959552920766464074L ^ var1;
      this.throughWallsSetting = var10001.getDataBuilder50_3("Whether to attack through walls.").getDataBuilder50_4(false).getDataBuilder54();
      AimAssist.getStateArray();
      short var45 = 3052;
      long var10004 = 8391430881739620830L ^ var1;
      rip.breeze.BlockUtil10 var24 = GenericSetting.getDataBuilder50(this, "WallRange");
      short var46 = 3791;
      var10004 = 3178930342790218980L ^ var1;
      this.wallRangeSetting = var24.getDataBuilder50_3("The range to attack through walls.")
         .getDataBuilder50_4(2.5)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(1.0, 5.0))
         .getDataBuilder50_9(this::lambda$new_Inner0)
         .getDataBuilder54();
      short var47 = 31753;
      var10004 = 7567523414148494865L ^ var1;
      rip.breeze.BlockUtil10 var25 = GenericSetting.getDataBuilder50(this, "Automatically blocks when attacking.");
      short var48 = 14605;
      var10004 = 19360821201695523L ^ var1;
      this.holdRightClickSetting = var25.getDataBuilder50_3("HoldRightClick").getDataBuilder50_4(SpeedMode3.NONE).getDataBuilder54();
      short var49 = 19307;
      var10004 = 1973926479987638607L ^ var1;
      rip.breeze.BlockUtil10 var26 = GenericSetting.getDataBuilder50(this, "Only enables auto block when you are holding right click.");
      short var50 = 10160;
      var10004 = 2934533183789329811L ^ var1;
      this.weaponOnlySetting = var26.getDataBuilder50_3("WeaponOnly").getDataBuilder50_4(false).getDataBuilder50_9(this::lambda$new_Inner1).getDataBuilder54();
      short var51 = 2016;
      var10004 = 3848569803795025345L ^ var1;
      rip.breeze.BlockUtil10 var27 = GenericSetting.getDataBuilder50(this, "LegitWalk");
      short var52 = 14219;
      var10004 = 5521274087705804178L ^ var1;
      this.legitWalkSetting = var27.getDataBuilder50_3("Adjusts your movement to match the rotations that you are spoofing.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      short var53 = 13273;
      var10004 = 7070615879837678069L ^ var1;
      rip.breeze.BlockUtil10 var28 = GenericSetting.getDataBuilder50(this, "Render");
      short var54 = 22770;
      var10004 = 4300757000581419720L ^ var1;
      this.renderSetting = var28.getDataBuilder50_3("How to render the target.").getDataBuilder50_4(true).getDataBuilder54();
      short var55 = 10087;
      var10004 = 3276358816935472453L ^ var1;
      rip.breeze.BlockUtil10 var29 = GenericSetting.getDataBuilder50(this, "Color");
      short var56 = 13489;
      var10004 = 2544409419435441812L ^ var1;
      this.colorSetting = var29.getDataBuilder50_3("The color of the target rendering.").getDataBuilder50_4(EnumType11.AURA).getDataBuilder54();
      var10002 = 22403;
      var10003 = 3933077743191891382L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "LockView");
      var10002 = 31781;
      var10003 = 7013224480916026892L ^ var1;
      this.lockViewSetting = var10001.getDataBuilder50_3("Locks your view to the target.")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(54, 144, 162, 150))
         .getDataBuilder50_8()
         .getDataBuilder50_9(this::lambda$new_Inner2)
         .getDataBuilder54();
      this.dataBuilder54_B = GenericSetting.<RenderUtil19_x>getDataBuilder50(this, "LockView")
         .getDataBuilder50_3("Locks your view to the target.")
         .getDataBuilder50_4(RenderUtil19_x._OFF)
         .getDataBuilder54();
      this.random_C = new Random();
      this.fieldBool_D = false;
      this.fieldFloat_F = 0.0F;
      this.dataBuilder112_G = new Util133();
      this.dataBuilder112_H = new Util133();
      this.fieldBool_L = false;
      this.fieldBool_M = false;
      this.arr_N = new float[2];
      this.arr_O = new float[2];
      this.fieldBool_P = false;
      BreezeClient.getConfigManager().update_1(this, 15);
      this.aimRangeSetting.calculate(this::lambda$new_Inner3);
      this.swingRangeSetting.calculate(this::lambda$new_Inner4);
      if (LicenseState.checkCondition()) {
         AimAssist.initialize(new int[2]);
      }
   }

   @Override
   public String getString() {
      long var1 = 94639785842642L;
      switch (Util117.CONST_A[this.targetingSetting.getObject_m().ordinal()]) {
         case 1:
            return "Single";
         case 2:
            return "Multi";
         default:
            return null;
      }
   }

   public void onDisable() {
      long var1 = 23436370995847L;
      BreezeClient.getModuleRegistry().initialize(this);
      this.sendPacket_2();
      if (this.fieldBool_M) {
         this.fieldBool_L = false;
         BreezeClient.getConfigManager().processAll(this);
      }

      this.entityLivingBase_E = null;
   }

   public void toggle() {
      this.fieldBool_D = false;
      BreezeClient.getModuleRegistry().applyRotation(this);
   }

   public void updateRotation(ModuleRegistry var1) {
      long var2 = 117735033473270L;
      int[] var4 = AimAssist.getStateArray();
      if (BreezeClient.CONST_A.currentScreen != null && !(BreezeClient.CONST_A.currentScreen instanceof ClickGUI)) {
         this.toggle();
      } else {
         if (this.entityLivingBase_E != null && (this.entityLivingBase_E.isDead || this.entityLivingBase_E.getHealth() < 0.0F)) {
            BreezeContext.moduleBase_a
               .getModuleByClass(Notifications.class)
               .processAll(
                  "KillAura",
                  "You have killed"
                     + RenderUtil18_x.ACCENT
                     + ChatFormatting.stripFormatting(this.entityLivingBase_E.func_70005_c_())
               );
         }

         EntityLivingBase var5 = this.entityLivingBase_E;
         this.entityLivingBase_E = null;
         if (!this.legitWalkSetting.getObject_m()
            || BreezeClient.CONST_A.thePlayer.getHeldItem() != null && BreezeClient.CONST_A.thePlayer.getHeldItem().getItem() instanceof ItemSword) {
            double var6 = Double.MAX_VALUE;
            double var8 = BreezeContext.moduleBase_a.getModuleByClass(Reach.class).getDouble() + 0.1;
            boolean var10 = false;
            Vec3 var11 = BreezeClient.CONST_A.thePlayer.getPositionEyes(1.0F);

            for (Entity var13 : BreezeClient.CONST_A.theWorld.loadedEntityList) {
               if ((var13 instanceof EntityLivingBase || var4 == null)
                  && (var13 instanceof EntityPlayer || !var13.isInvisible() || var4 == null)
                  && (var13 != BreezeClient.CONST_A.thePlayer || var4 == null)
                  && (!(var13 instanceof IMob) || BreezeClient.getKeybindSettings().checkCondition() || var4 == null)
                  && (!(var13 instanceof EntityAnimal) || BreezeClient.getKeybindSettings().isValid_4() || var4 == null)
                  && (!(var13 instanceof EntityVillager) || BreezeClient.getKeybindSettings().isValid_4() || var4 == null)
                  && (!(var13 instanceof EntityPlayer) || AntiBot.isInvisible_3((EntityPlayer)var13) || var4 == null)) {
                  double var14 = BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var13);
                  if ((!(var14 > this.aimRangeSetting.getObject_m()) || var4 == null)
                     && (
                        !(
                              RotationUtil7.absValue(
                                    RotationUtil7.getAnglesTo(BlockUtil7.getVec3_2(var13.getEntityBoundingBox()), BreezeClient.CONST_A.thePlayer, false)[0],
                                    BreezeClient.CONST_A.thePlayer.rotationYaw
                                 )
                                 > this.fOVSetting.getObject_m().intValue() / 2.0F
                           )
                           || var4 == null
                     )) {
                     double var16;
                     label206: {
                        if (this.targetingSetting.getObject_m() == EnumType30.SINGLE) {
                           var16 = var14;
                           if (var4 != null) {
                              break label206;
                           }
                        }

                        var16 = Math.min(var13.hurtResistantTime, 5) + var14 / 100.0;
                        if (var10 && var14 > var8 && var4 != null) {
                           continue;
                        }
                     }

                     AxisAlignedBB var18 = var13.getEntityBoundingBox().offset(var13.posX - var13.prevPosX, 0.0, var13.posZ - var13.prevPosZ);
                     if (BlockUtil7.rayTrace(var11, var18) != null
                        || this.throughWallsSetting.getObject_m() && (!(var14 > this.wallRangeSetting.getObject_m()) || var4 == null)) {
                        if (var16 < var6) {
                           if (var14 < var8) {
                              var10 = true;
                           }

                           var6 = var16;
                           this.entityLivingBase_E = (EntityLivingBase)var13;
                        }

                        if (var4 == null) {
                           break;
                        }
                     }
                  }
               }
            }

            if (this.entityLivingBase_E != null && !this.entityLivingBase_E.isDead && !(this.entityLivingBase_E.getHealth() <= 0.0F)) {
               boolean var29 = false;
               if (var5 != this.entityLivingBase_E && var5 != null) {
                  var29 = true;
               }

               BreezeClient.getThemeManager().processAll(this.entityLivingBase_E, this.swingRangeSetting.getObject_m().floatValue());
               Vec3 var30 = new Vec3(
                  BreezeClient.CONST_A.thePlayer.posX + BreezeClient.CONST_A.thePlayer.motionX,
                  BreezeClient.CONST_A.thePlayer.posY + BreezeClient.CONST_A.thePlayer.getEyeHeight(),
                  BreezeClient.CONST_A.thePlayer.posZ + BreezeClient.CONST_A.thePlayer.motionZ
               );
               AxisAlignedBB var19 = this.entityLivingBase_E
                  .getEntityBoundingBox()
                  .offset(this.entityLivingBase_E.posX - this.entityLivingBase_E.prevPosX, 0.0, this.entityLivingBase_E.posZ - this.entityLivingBase_E.prevPosZ);
               Vec3 var20 = BlockUtil7.rayTrace(var11, var19);
               if (var20 == null) {
                  if (!this.throughWallsSetting.getObject_m()
                     || BreezeClient.CONST_A.thePlayer.getDistanceToEntity(this.entityLivingBase_E) > this.wallRangeSetting.getObject_m()) {
                     this.toggle();
                     return;
                  }

                  Vec3 var31 = BlockUtil7.getVec3_2(var19);
                  var20 = new Vec3(
                     var31.xCoord,
                     MathUtil1.clamp_3(
                        BreezeClient.CONST_A.thePlayer.getEyeHeight()
                           + BreezeClient.CONST_A.thePlayer.posY
                           + MinecraftAccessor.getVec3(BreezeClient.CONST_A.thePlayer, var1.getFloat(), 0.0F).yCoord,
                        var31.yCoord - 0.8F,
                        var31.yCoord + 0.8F
                     ),
                     var31.zCoord
                  );
               }

               float[] var32 = RotationUtil7.calcDistance(var20, var30, true);
               this.arr_O[0] = (float)(this.arr_O[0] + this.random_C.nextGaussian() * 2.0);
               this.arr_O[1] = (float)(this.arr_O[1] + this.random_C.nextGaussian() * 2.0);
               this.arr_O[0] = (float)MathUtil1.calculateDouble(this.arr_O[0], 0.0, 0.4);
               this.arr_O[1] = (float)MathUtil1.calculateDouble(this.arr_O[1], 0.0, 0.4);
               this.arr_N[0] = this.arr_N[0] + this.arr_O[0];
               this.arr_N[1] = this.arr_N[1] + this.arr_O[1];
               this.arr_N[0] = (float)MathUtil1.calculateDouble(this.arr_N[0], 0.0, 0.5);
               this.arr_N[1] = (float)MathUtil1.calculateDouble(this.arr_N[1], 0.0, 0.5);
               var32[0] += this.arr_N[0];
               var32[1] += this.arr_N[1];
               var1.isActive(false).isActive_2(this.renderSetting.getObject_m());
               Vec3 var21 = var11;
               Vec3 var22 = MinecraftAccessor.getVec3(BreezeClient.CONST_A.thePlayer, var1.getFloat(), var1.getFloat_g());
               MovingObjectPosition var23 = this.entityLivingBase_E
                  .getEntityBoundingBox()
                  .calculateIntercept(
                     var21,
                     var21.addVector(
                        var22.xCoord * this.swingRangeSetting.getObject_m(),
                        var22.yCoord * this.swingRangeSetting.getObject_m(),
                        var22.zCoord * this.swingRangeSetting.getObject_m()
                     )
                  );
               var1.isValid(var32, this.rotationSpeedSetting.getObject_m().intValue());
               if (this.entityLivingBase_E.getDistanceToEntity(BreezeClient.CONST_A.thePlayer) > this.swingRangeSetting.getObject_m()) {
                  this.sendPacket(false, null);
               } else {
                  if (BreezeClient.CONST_A.thePlayer.ticksExisted % (10 + this.random_C.nextInt(30)) == 0 || this.double_I == 0.0) {
                     this.double_I = this.cPSSetting.getObject_m().calculateDouble_2();
                  }

                  BreezeClient.CONST_A.entityRenderer.getMouseOver(1.0F);
                  this.fieldFloat_F = Math.max(this.fieldFloat_F, 0.0F);
                  this.fieldFloat_F = this.fieldFloat_F + (float)(this.double_I / 20.0);
                  if (this.getHeldItem()) {
                     if (!this.getDistance(var23)) {
                        return;
                     }
                  } else if (this.fieldBool_D) {
                     this.sendPacket_2();
                     return;
                  }

                  if (!BreezeClient.CONST_A.thePlayer.isUsingItem() && !this.fieldBool_P) {
                     Vec3 var24 = null;
                     if (var23 != null && this.throughWallsSetting.getObject_m()) {
                        if (var23.hitVec.distanceTo(BreezeClient.CONST_A.thePlayer.getPositionEyes(1.0F))
                           < BreezeContext.moduleBase_a.getModuleByClass(Reach.class).getAngle()) {
                           var24 = var23.hitVec;
                        }
                     } else if (BreezeClient.CONST_A.objectMouseOver != null
                        && BreezeClient.CONST_A.objectMouseOver.typeOfHit == MovingObjectType.ENTITY
                        && BreezeClient.CONST_A.objectMouseOver.entityHit == this.entityLivingBase_E) {
                        var24 = BreezeClient.CONST_A.objectMouseOver.hitVec;
                     }

                     boolean var25 = this.fieldFloat_F > 1.0F;
                     if (var25) {
                        this.fieldFloat_F--;
                        if (this.fieldFloat_F > 1.0F) {
                           this.fieldFloat_F = 1.0F;
                        }
                     }

                     if (var29) {
                        var25 = false;
                        this.fieldFloat_F = 0.0F;
                     }

                     PreAttackEventEvent var26 = new PreAttackEventEvent(var24 != null && var25, var25, var24);
                     EventBus.checkCondition(var26);
                     if (var26.fieldBool_h) {
                        BreezeClient.CONST_A.thePlayer.swingItem();
                     }

                     boolean var27 = false;
                     if (var26.fieldBool_g && var24 != null) {
                        BreezeClient.CONST_A.playerController.attackEntity(BreezeClient.CONST_A.thePlayer, this.entityLivingBase_E);
                        var27 = true;
                     }

                     PostAttackEventEvent var28 = new PostAttackEventEvent(var27, var26.fieldBool_h, var24);
                     EventBus.checkCondition(var28);
                     if (this.getHeldItem()) {
                        this.sendPacket(var27, var24);
                     }
                  } else {
                     this.fieldBool_P = BreezeClient.CONST_A.thePlayer.isUsingItem();
                  }
               }
            } else {
               this.entityLivingBase_E = null;
               this.toggle();
            }
         } else {
            this.toggle();
         }
      }
   }

   private boolean getDistance(MovingObjectPosition var1) {
      long var2 = 55430259513521L;
      int[] var4 = AimAssist.getStateArray();
      if (this.holdRightClickSetting.isValid(SpeedMode3.SLOTSWITCH)) {
         BreezeClient.getConfigManager().update_4(new C09PacketHeldItemChange(BreezeClient.CONST_A.thePlayer.inventory.currentItem % 4 + 5), false);
         BreezeClient.getConfigManager().update_4(new C09PacketHeldItemChange(BreezeClient.CONST_A.thePlayer.inventory.currentItem), false);
         BreezeClient.getConfigManager().update_4(new C08PacketPlayerBlockPlacement(BreezeClient.CONST_A.thePlayer.getCurrentEquippedItem()), false);
         this.fieldBool_D = true;
         this.itemStack_K = BreezeClient.CONST_A.thePlayer.getCurrentEquippedItem();
         return true;
      }

      if (this.holdRightClickSetting.isValid(SpeedMode3.INTERACT)) {
         boolean var5 = true;
         if (var1 == null || !this.throughWallsSetting.getObject_m()) {
            var1 = BreezeClient.CONST_A.objectMouseOver;
            if (var1 == null || var1.typeOfHit != MovingObjectType.ENTITY || var1.entityHit != this.entityLivingBase_E) {
               var5 = false;
            }
         }

         if (var1 == null
            || var1.hitVec.distanceTo(BreezeClient.CONST_A.thePlayer.getPositionEyes(1.0F))
               > BreezeContext.moduleBase_a.getModuleByClass(Reach.class).getAngle()) {
            var5 = false;
         }

         label38: {
            if (var5) {
               BreezeClient.getConfigManager()
                  .update_4(
                     new C02PacketUseEntity(
                        this.entityLivingBase_E,
                        new Vec3(
                           var1.hitVec.xCoord - this.entityLivingBase_E.posX,
                           var1.hitVec.yCoord - this.entityLivingBase_E.posY,
                           var1.hitVec.zCoord - this.entityLivingBase_E.posZ
                        )
                     ),
                     false
                  );
               BreezeClient.getConfigManager().update_4(new C02PacketUseEntity(this.entityLivingBase_E, Action.INTERACT), false);
               BreezeClient.getConfigManager().update_4(new C08PacketPlayerBlockPlacement(BreezeClient.CONST_A.thePlayer.getCurrentEquippedItem()), false);
               this.fieldBool_D = true;
               this.itemStack_K = BreezeClient.CONST_A.thePlayer.getCurrentEquippedItem();
               if (var4 != null) {
                  break label38;
               }
            }

            if (this.fieldBool_D) {
               this.sendPacket_2();
               return false;
            }
         }

         if (var4 != null) {
            return true;
         }
      }

      if ((this.holdRightClickSetting.isValid(SpeedMode3.BLINK) || this.holdRightClickSetting.isValid(SpeedMode3.SEMI)) && this.fieldBool_D) {
         BreezeClient.getConfigManager()
            .update_4(
               new C07PacketPlayerDigging(
                  net.minecraft.network.play.client.C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, net.minecraft.util.EnumFacing.DOWN
               ),
               false
            );
         this.fieldBool_D = false;
         return false;
      } else {
         return true;
      }
   }

   private void sendPacket(boolean var1, Vec3 var2) {
      long var3 = 124335226700272L;
      int[] var5 = AimAssist.getStateArray();
      if (this.holdRightClickSetting.isValid(SpeedMode3.LEGIT)) {
         if (this.entityLivingBase_E.hurtTime <= 4
               && (BreezeClient.CONST_A.thePlayer.hurtResistantTime >= 4 || BreezeClient.CONST_A.thePlayer.hurtResistantTime <= 0)
            || BreezeClient.CONST_A.thePlayer.isUsingItem()
            || this.fieldBool_P
            || !var1) {
            return;
         }

         MinecraftAccessor.initialize_22(BreezeClient.CONST_A);
         this.fieldBool_P = true;
         if (var5 != null) {
            return;
         }
      }

      if (this.holdRightClickSetting.isValid(SpeedMode3.BLINK) || this.holdRightClickSetting.isValid(SpeedMode3.SEMI)) {
         if (this.fieldBool_D) {
            return;
         }

         if (BreezeClient.CONST_A.objectMouseOver != null && BreezeClient.CONST_A.objectMouseOver.entityHit == this.entityLivingBase_E) {
            BreezeClient.getConfigManager()
               .update_4(
                  new C02PacketUseEntity(
                     this.entityLivingBase_E,
                     new Vec3(
                        BreezeClient.CONST_A.objectMouseOver.hitVec.xCoord - this.entityLivingBase_E.posX,
                        BreezeClient.CONST_A.objectMouseOver.hitVec.yCoord - this.entityLivingBase_E.posY,
                        BreezeClient.CONST_A.objectMouseOver.hitVec.zCoord - this.entityLivingBase_E.posZ
                     )
                  ),
                  false
               );
            BreezeClient.getConfigManager().update_4(new C02PacketUseEntity(this.entityLivingBase_E, Action.INTERACT), false);
            BreezeClient.getConfigManager().update_4(new C08PacketPlayerBlockPlacement(BreezeClient.CONST_A.thePlayer.getCurrentEquippedItem()), false);
            this.fieldBool_D = true;
            if (this.holdRightClickSetting.isValid(SpeedMode3.BLINK)) {
               this.fieldBool_L = true;
               this.fieldBool_M = true;
            }

            this.itemStack_K = BreezeClient.CONST_A.thePlayer.getCurrentEquippedItem();
            if (var5 != null) {
               return;
            }
         }

         if (this.fieldBool_L) {
            this.fieldBool_M = true;
         }
      }
   }

   @EventListener
   private void toggle_2(PostMotionEventEvent var1) {
      long var2 = 60742831108847L;
      if (this.holdRightClickSetting.isValid(SpeedMode3.BLINK) && this.fieldBool_M) {
         this.fieldBool_L = false;
         BreezeClient.getConfigManager().processAll(this);
         this.fieldBool_M = false;
         if (this.fieldBool_D) {
            this.fieldBool_L = true;
         }
      }
   }

   @EventListener
   public void calculate(MouseClickedEventEvent var1) {
      long var2 = 129630977384295L;
      if (var1.aimYawMode_h == AimYawMode.LEFT) {
         this.fieldFloat_F--;
      }
   }

   @EventListener
   public void updateRotation_2(Render3DEventEvent var1) {
      long var2 = 42038631754622L;
      int[] var4 = AimAssist.getStateArray();
      if (this.entityLivingBase_E != null && !this.entityLivingBase_E.isDead && !(this.entityLivingBase_E.getHealth() <= 0.0F)) {
         Vec3 var5 = BlockUtil7.getVec3(this.entityLivingBase_E, var1.fieldFloat_h).addVector(0.0, 0.8, 0.0);
         if (!this.dataBuilder54_B.isValid(RenderUtil19_x._OFF)) {
            float[] var6 = RotationUtil7.calcDistance(var5, BreezeClient.CONST_A.thePlayer.getPositionEyes(var1.fieldFloat_h), false);
            if (!this.dataBuilder54_B.isValid(RenderUtil19_x.PITCH)) {
               BreezeClient.CONST_A.thePlayer.prevRotationYaw = BreezeClient.CONST_A.thePlayer.prevRotationYaw
                  + (var6[0] - BreezeClient.CONST_A.thePlayer.rotationYaw);
               BreezeClient.CONST_A.thePlayer.rotationYaw = var6[0];
            }

            if (!this.dataBuilder54_B.isValid(RenderUtil19_x._YAW)) {
               BreezeClient.CONST_A.thePlayer.prevRotationPitch = BreezeClient.CONST_A.thePlayer.prevRotationPitch
                  + (var6[1] - BreezeClient.CONST_A.thePlayer.rotationPitch);
               BreezeClient.CONST_A.thePlayer.rotationPitch = var6[1];
            }
         }

         if (!this.colorSetting.isValid(EnumType11._OFF)) {
            double[] var16 = new double[]{
               MinecraftAccessor.getDouble_2(BreezeClient.CONST_A.getRenderManager()),
               MinecraftAccessor.getDouble_4(BreezeClient.CONST_A.getRenderManager()),
               MinecraftAccessor.getDouble_5(BreezeClient.CONST_A.getRenderManager())
            };
            float var7 = (float)Math.sin(this.fieldFloat_J / 25.0F) / 2.0F;
            float var8 = (float)Math.sin(this.fieldFloat_J / 25.0F + 0.34) / 2.0F;
            this.fieldFloat_J += 0.5F;
            GL11.glPushMatrix();
            GL11.glEnable(3042);
            GL11.glDisable(3553);
            GL11.glBlendFunc(770, 771);
            GL11.glShadeModel(7425);
            GL11.glDisable(2884);
            GL11.glBegin(8);
            RenderUtil31.calculate(this.lockViewSetting.getObject_m());
            byte var9 = 0;

            while (var9 <= 360) {
               double var10 = Math.cos(var9 * Math.PI / 180.0) * this.entityLivingBase_E.width + var5.xCoord - var16[0];
               double var12 = var5.yCoord + this.entityLivingBase_E.height / 2.0F - 0.4F - var16[1];
               double var14 = Math.sin(var9 * Math.PI / 180.0) * this.entityLivingBase_E.width + var5.zCoord - var16[2];
               GL11.glVertex3d(var10, var12 + var8 * this.entityLivingBase_E.height, var14);
               GL11.glVertex3d(var10, var12 + var7 * this.entityLivingBase_E.height, var14);
               var9 += 3;
               if (var4 == null) {
                  break;
               }
            }

            GL11.glEnd();
            GL11.glEnable(2884);
            RenderUtil31.calculate(Color.WHITE);
            GL11.glShadeModel(7424);
            GL11.glEnable(2929);
            GL11.glEnable(3553);
            GL11.glEnable(3042);
            GL11.glPopMatrix();
         }
      }
   }

   public int getValue() {
      return 0;
   }

   public void toggle() {
      this.sendPacket_2();
   }

   public EnumType27 getEnum_PROCESS(Packet<?> var1, boolean var2) {
      long var3 = 29844293304432L;
      return this.fieldBool_L ? EnumType27.DELAY : EnumType27.PROCESS;
   }

   public EnumType27 getEnum_PROCESS_2(Packet<?> var1, boolean var2) {
      return EnumType27.PROCESS;
   }

   public void noOp(ArrayList<DelayedPacket> var1) {
   }

   private void sendPacket_2() {
      long var1 = 66424104986953L;
      if (this.fieldBool_D && BreezeClient.CONST_A.thePlayer.getCurrentEquippedItem() == this.itemStack_K) {
         BreezeClient.getConfigManager()
            .update_4(
               new C07PacketPlayerDigging(
                  net.minecraft.network.play.client.C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, net.minecraft.util.EnumFacing.DOWN
               ),
               true
            );
      }

      this.fieldBool_D = false;
      if (this.fieldBool_L) {
         this.fieldBool_M = true;
      }
   }

   public boolean isBool_D() {
      return this.fieldBool_D;
   }

   private boolean getHeldItem() {
      long var1 = 9970091335985L;
      if (this.weaponOnlySetting.getObject_m() && !PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindUseItem)) {
         return false;
      } else if (this.weaponOnlySetting.getObject_m()
         && BreezeClient.CONST_A.thePlayer.isUsingItem()
         && BreezeClient.CONST_A.thePlayer.getHeldItem().getItem() instanceof ItemSword) {
         MinecraftAccessor.initialize_24(BreezeClient.CONST_A.gameSettings.keyBindUseItem, false);
         return false;
      } else {
         return BreezeClient.CONST_A.thePlayer != null
            && BreezeClient.CONST_A.thePlayer.getCurrentEquippedItem() != null
            && BreezeClient.CONST_A.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword
            && !BreezeClient.CONST_A.thePlayer.isUsingItem();
      }
   }

   public EntityLivingBase getEntityLivingBase_E() {
      return this.entityLivingBase_E;
   }

   public boolean checkCondition() {
      long var1 = 77164923050331L;
      return this.entityLivingBase_E != null && this.f();
   }

   @KeepParameters
   public boolean checkCondition_2() {
      long var1 = 18219989492255L;
      if (!this.holdRightClickSetting.isValid(SpeedMode3.NONE) && !this.holdRightClickSetting.isValid(SpeedMode3.LEGIT)) {
         if (!this.dataBuilder112_G.isValid(300L) || this.entityLivingBase_E != null && !this.entityLivingBase_E.isDead) {
            if (BreezeClient.CONST_A.thePlayer.isSwingInProgress && this.entityLivingBase_E != null && !this.entityLivingBase_E.isDead) {
               this.dataBuilder112_G.getDataBuilder112();
            }

            return BreezeClient.CONST_A.thePlayer.getCurrentEquippedItem() != null
               && BreezeClient.CONST_A.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void lambda$new_Inner4(Double var1) {
      long var2 = 121975178195296L;
      if (var1 > this.aimRangeSetting.getObject_m()) {
         this.aimRangeSetting.processAll(var1);
      }
   }

   private void lambda$new_Inner3(Double var1) {
      long var2 = 115425284658572L;
      if (var1 < this.swingRangeSetting.getObject_m()) {
         this.swingRangeSetting.processAll(var1);
      }
   }

   private boolean lambda$new_Inner2(rip.breeze.DateUtil var1) {
      long var2 = 21116178904247L;
      return !this.colorSetting.isValid(EnumType11._OFF);
   }

   private boolean lambda$new_Inner1(rip.breeze.DateUtil var1) {
      long var2 = 103862191375797L;
      return this.holdRightClickSetting.getObject_m() != SpeedMode3.NONE;
   }

   private boolean lambda$new_Inner0(rip.breeze.DateUtil var1) {
      return this.throughWallsSetting.getObject_m();
   }

   public static void initialize(String var0) {
      string_Q = var0;
   }

   public static String getString_2() {
      return string_Q;
   }

   static {
      initialize(null);
      long var0 = 19518480458246L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[34];
      int var5 = 0;
      String var6 = "H+ÿØ\u000e\r]å\u008d\u0096\u0086&»¥/Ê]YI\u0088\u0080\u008b6ZiÏÆ_LÔóµ:\u0085z\u00952(I\u0086\u0085Kx\u009b\u001cWµ\u00918\u0014þK/\u0003&Ì$\u009aÛoúÍ\u0015+I\u0018gä´\u0099£?oúG\u00adêéEhU°\u0014¯ö_ÙH\u0013]®'\u0013\u00adY\u0087þ&OêÛ2b]\u0096p´\u007f¼\u00ad¹þ`<º9®9\u0088\u000fì\u008eÁ\u000ff?ÉìJßfó\nØ\u0089\u0010>ÝÒ_k#µ+©\u000eÛ\u0015ª\u0087ê\u0088Y\b÷5Áu<\u008c¶;£óA9ÉP?\u0002àÊ&3ë£kð<\u0083OTÔ\u0017½éæ\u0015\u00879£e<û\u0016\u0097?Úº»¸\u0011\u0014\u0013°\n\u0017ÿ«\u0003t\u001füSªÕÇ¼p²©\u000f\r\u00adB\u008bx2UÎ\u009aHÈ\u009dOl*sõ5ï\u00ad;ú³#\u0018\u001dH¼\u0006í³v\u00ad§\u0003HÉ.¤Ø¼Óø\u0002¥¬´\u008e4k\u0011\u000fÎI\u0092\"\u0015f\u0085Îp#Ý¯uÄU\u0018\u0015ê\"Sø\u0000\u000bE®ó¯¢Á-ßi\u0014\u0010\u009eRã³\u001bE<Vv³\u0013|ãÃ\u0090f\u0081¢\u0088yg\u009f\u0080p¹\u0097\u009f\f¦Á[À4HZýñ.î\u0014\u0000$½ä\u001dUªj¦y7\n\u0086\u0015)\u000fùnjL\u0088¸µs ë,\u0006ó®ªÅLvÎÌc~Ìe·Âè\u0083ÅY?\u009c¯\u0016, p2Øø8çÃz+«\u001d[Åß$ø>csón1¯fzèu\rL?Åó`ñ\u001eý/ÝØ¾\u0013¬K9\u0018¢Ñm;Q£Ct\u0082Í\u0083xMÚÿ\u0092¤Ã(ÛÀ\u000e|ï@7l\u000f°Ïÿ\"wt\u00adw¥÷\u008acÇ\nÄ* VÓ\u0082\t\u009eîÄY(\u008dkð\fF(0ïJ\u0085-ößCÂy[\u0015Ld\u0097´%ÂËXmòî\u007f\u0096!Q§£ ñË]¿\u0017\u00895R\u0016L,\u0018u\fÈ\u0007%Áf;Þ@lXäÃ5\u001f\u009c\u008ch\u0086H\u0082Ñù\u0016¡\r\u0082ª4/Ó\u001d²{\u0089J\u008aÕê^k5\u001a\u0000\u009dÖ\u0084\u008cnÃåÌm\u0088ØE¿tý\u0015d®Çè\u001b©\f\u0000\u001d\u008bÔI\u000bCý \u0001\u0086«I\u001f ¬\u0086x\u007f\u0091Ñ\u0082¿\u007fâ\u0018\u009eB¨8Ã\u009a\u0011º55\u000e~Îð!´8.iñ=ê³ù(U-\u0014}}0>Ìµ>Æð\u0013\u007f'\u008bÄCí¹\u0015q\u0011øÊò\u0082r.*ûíÜV(\u008c3±c\n ý\u0013§\u0081ÝR6ÉÊ\u008fà\u0001Æå7òcmÐ-Öµu1Û\u0089¤ \u001bt%[\u0010\u009eéA+CrwT\u0081\u001f\u008eNWäÌ\u0083 G\u0017¾2ýg¥¡-\u009cîÌú\u0093\u008a\u0093\u0002\u000fI\u0019>7Öôp{±\u00ad\u0017^ºa\u0010Ë0!\u0093çX\u0010Ç$\u0087\u0082\u0002A\u0083¨K\u0010\u009dÓ=Ñ¹ÎäTÈá\u008a´º3S±@\u0011öX\t\u000f·\t\u001ac»f¸Ç>p»5OCêd\bÔéFñxÎ\u0090ãÕ_àU§nº\u0010,+\u0003§?Ï¾\u000f>`dÂT?dZ±£oE47kÙ%Z ¶ÖiÓ\u008b0ªÁ\u0093û\"\u0004\u00ad\u0007\u0005\u0018|[¨\u0090Ç\f\u0014\u008eÜGç\u000b\u0089Âêã@\u0095\u0016\u0006\u0085vØ\u009cJHçe]Ú\u0004\u0087|\u0095á§\u0002£\\;(\u009bù|\u009aÞý>\u008c\u0097¨Âç\u001c\u0014©|!e!Ëp}\fÄ.\u001eÙúß\u0086j9~éI±\u0015\\\u0000\u009a\u0010ãbÑk\u0006\u0085ÝP=Ï2µf/KAp¥\u0002^\u00876ÐÁãõè_ÃKüKøptÉßöë\u001ad\u0015á\b÷n·ìïÞ\u0012\u001añ¶]dÀÑý³#\u0099³\u001e`pÞ\u0019 Q\n\u0083¬i\u0099Ï\u0016k\u007f\u0088x \n:ÍÉ\u0080Gk\u001aòÚâaÏ\u009fiö/\u009b%1ûw;ßEY»\u0082Þ5\u0098u\u001e%Ùz¼çÇJ\u0090\u0010ç¬\u0085rÜ\u0018\u008f\u009e÷Ë-bö\fR1asBgÅ\u0002oÑ\u0012|\u008dn\u000b\u009bxVù©{²}þ\u0001\u0085bÀ]\u008e\u008fÊ\u008b«\u0088É\u0012N»\\¬\u008a¸²e¤ÖÊçúÚD\u0015^5]A\"ñ\u009e¼Ð\u001bT±T·Ís©\u0093Ö\u000e\u00adS\b\u009cr¾`\u009a#»\u0080Ô\u0096G\ffõD®k\u0087ªù TìyÑ¤]\u0097ë\u0013\u0003Å\u0089\u0082\u0086b%\u0092r\u009a\u007fU~*\u000e\u0099/çîý\u0098\u000e³å\"SJ\u00180e\"@@\u00172s\u0081lò\u008c$\u0093\u0080\u0087Â\u0011è7R\u0005G\u009bh¼O^\u001bMLåç©ì¤\u0006ÿ\u008a¢|°y\u0098Æ'á\u0086:©p\u0095y¤û\u0011U\u0003ÂÃ¡¢õ\tYæ\u008e\" \u000fÖü4\u001f°¦\u008f`\u0082Òì\u009c\u008e\u0091\f[Ó\tU\u001f\f*\u0013\u0015¡hÔ4c©µ \u0015-AÞYd²\u0018\fÌ\u008aÔ\u0005¹Ð\u0080·Aáëð\u001bðFuµÆÓ\u0006\u009d¼÷`Tw¹\u009aÇ¾6Y#Æ\u008d\u000eº\u0099ãqXÁ\u0096\u008c=K\u0092á#¼Tú\\\u001caX±±d©Qm\u0080vHæ@\u0012?É×bJ¶\u0004~8[õ\u001d¿£qQ\u008dv|ElP¦\u0003hûQfÀ\u000b\u0001\u0016\u008a\u0019Ì\u0093>\u0017wg¥\u0099ò\u0018 \u009a\u0080õb%\u0090\u0081\u0010Ò»Ó\u0092rÎÙè«@»\u009clR!?89Oß2\u0004`F\u000f\u0089¹Êäø§óYìæ\u0094GLMB²r\u0092¿YÊN £«\u0015ËÈÓFÐ\u0080Y\u0083ylêüs.<'\u0080Ó\u0096\u0019¿k Ä\u0093ÄJ?\u008eÃF¨U\u001aè\u0017ß\u008f\u0081\u001f\u0097Ì\u000eÙ¡fp¼S×¹OÛIÉ\u00181ü2HÙ\u0097´G÷\u0099ßõÌy \u0087¦?\nùÖ!#\u009b\u0010ÊÕÒ\u0018\u008dtªfdØ\u001e\u001a*ÍËs";
      int var7 = "H+ÿØ\u000e\r]å\u008d\u0096\u0086&»¥/Ê]YI\u0088\u0080\u008b6ZiÏÆ_LÔóµ:\u0085z\u00952(I\u0086\u0085Kx\u009b\u001cWµ\u00918\u0014þK/\u0003&Ì$\u009aÛoúÍ\u0015+I\u0018gä´\u0099£?oúG\u00adêéEhU°\u0014¯ö_ÙH\u0013]®'\u0013\u00adY\u0087þ&OêÛ2b]\u0096p´\u007f¼\u00ad¹þ`<º9®9\u0088\u000fì\u008eÁ\u000ff?ÉìJßfó\nØ\u0089\u0010>ÝÒ_k#µ+©\u000eÛ\u0015ª\u0087ê\u0088Y\b÷5Áu<\u008c¶;£óA9ÉP?\u0002àÊ&3ë£kð<\u0083OTÔ\u0017½éæ\u0015\u00879£e<û\u0016\u0097?Úº»¸\u0011\u0014\u0013°\n\u0017ÿ«\u0003t\u001füSªÕÇ¼p²©\u000f\r\u00adB\u008bx2UÎ\u009aHÈ\u009dOl*sõ5ï\u00ad;ú³#\u0018\u001dH¼\u0006í³v\u00ad§\u0003HÉ.¤Ø¼Óø\u0002¥¬´\u008e4k\u0011\u000fÎI\u0092\"\u0015f\u0085Îp#Ý¯uÄU\u0018\u0015ê\"Sø\u0000\u000bE®ó¯¢Á-ßi\u0014\u0010\u009eRã³\u001bE<Vv³\u0013|ãÃ\u0090f\u0081¢\u0088yg\u009f\u0080p¹\u0097\u009f\f¦Á[À4HZýñ.î\u0014\u0000$½ä\u001dUªj¦y7\n\u0086\u0015)\u000fùnjL\u0088¸µs ë,\u0006ó®ªÅLvÎÌc~Ìe·Âè\u0083ÅY?\u009c¯\u0016, p2Øø8çÃz+«\u001d[Åß$ø>csón1¯fzèu\rL?Åó`ñ\u001eý/ÝØ¾\u0013¬K9\u0018¢Ñm;Q£Ct\u0082Í\u0083xMÚÿ\u0092¤Ã(ÛÀ\u000e|ï@7l\u000f°Ïÿ\"wt\u00adw¥÷\u008acÇ\nÄ* VÓ\u0082\t\u009eîÄY(\u008dkð\fF(0ïJ\u0085-ößCÂy[\u0015Ld\u0097´%ÂËXmòî\u007f\u0096!Q§£ ñË]¿\u0017\u00895R\u0016L,\u0018u\fÈ\u0007%Áf;Þ@lXäÃ5\u001f\u009c\u008ch\u0086H\u0082Ñù\u0016¡\r\u0082ª4/Ó\u001d²{\u0089J\u008aÕê^k5\u001a\u0000\u009dÖ\u0084\u008cnÃåÌm\u0088ØE¿tý\u0015d®Çè\u001b©\f\u0000\u001d\u008bÔI\u000bCý \u0001\u0086«I\u001f ¬\u0086x\u007f\u0091Ñ\u0082¿\u007fâ\u0018\u009eB¨8Ã\u009a\u0011º55\u000e~Îð!´8.iñ=ê³ù(U-\u0014}}0>Ìµ>Æð\u0013\u007f'\u008bÄCí¹\u0015q\u0011øÊò\u0082r.*ûíÜV(\u008c3±c\n ý\u0013§\u0081ÝR6ÉÊ\u008fà\u0001Æå7òcmÐ-Öµu1Û\u0089¤ \u001bt%[\u0010\u009eéA+CrwT\u0081\u001f\u008eNWäÌ\u0083 G\u0017¾2ýg¥¡-\u009cîÌú\u0093\u008a\u0093\u0002\u000fI\u0019>7Öôp{±\u00ad\u0017^ºa\u0010Ë0!\u0093çX\u0010Ç$\u0087\u0082\u0002A\u0083¨K\u0010\u009dÓ=Ñ¹ÎäTÈá\u008a´º3S±@\u0011öX\t\u000f·\t\u001ac»f¸Ç>p»5OCêd\bÔéFñxÎ\u0090ãÕ_àU§nº\u0010,+\u0003§?Ï¾\u000f>`dÂT?dZ±£oE47kÙ%Z ¶ÖiÓ\u008b0ªÁ\u0093û\"\u0004\u00ad\u0007\u0005\u0018|[¨\u0090Ç\f\u0014\u008eÜGç\u000b\u0089Âêã@\u0095\u0016\u0006\u0085vØ\u009cJHçe]Ú\u0004\u0087|\u0095á§\u0002£\\;(\u009bù|\u009aÞý>\u008c\u0097¨Âç\u001c\u0014©|!e!Ëp}\fÄ.\u001eÙúß\u0086j9~éI±\u0015\\\u0000\u009a\u0010ãbÑk\u0006\u0085ÝP=Ï2µf/KAp¥\u0002^\u00876ÐÁãõè_ÃKüKøptÉßöë\u001ad\u0015á\b÷n·ìïÞ\u0012\u001añ¶]dÀÑý³#\u0099³\u001e`pÞ\u0019 Q\n\u0083¬i\u0099Ï\u0016k\u007f\u0088x \n:ÍÉ\u0080Gk\u001aòÚâaÏ\u009fiö/\u009b%1ûw;ßEY»\u0082Þ5\u0098u\u001e%Ùz¼çÇJ\u0090\u0010ç¬\u0085rÜ\u0018\u008f\u009e÷Ë-bö\fR1asBgÅ\u0002oÑ\u0012|\u008dn\u000b\u009bxVù©{²}þ\u0001\u0085bÀ]\u008e\u008fÊ\u008b«\u0088É\u0012N»\\¬\u008a¸²e¤ÖÊçúÚD\u0015^5]A\"ñ\u009e¼Ð\u001bT±T·Ís©\u0093Ö\u000e\u00adS\b\u009cr¾`\u009a#»\u0080Ô\u0096G\ffõD®k\u0087ªù TìyÑ¤]\u0097ë\u0013\u0003Å\u0089\u0082\u0086b%\u0092r\u009a\u007fU~*\u000e\u0099/çîý\u0098\u000e³å\"SJ\u00180e\"@@\u00172s\u0081lò\u008c$\u0093\u0080\u0087Â\u0011è7R\u0005G\u009bh¼O^\u001bMLåç©ì¤\u0006ÿ\u008a¢|°y\u0098Æ'á\u0086:©p\u0095y¤û\u0011U\u0003ÂÃ¡¢õ\tYæ\u008e\" \u000fÖü4\u001f°¦\u008f`\u0082Òì\u009c\u008e\u0091\f[Ó\tU\u001f\f*\u0013\u0015¡hÔ4c©µ \u0015-AÞYd²\u0018\fÌ\u008aÔ\u0005¹Ð\u0080·Aáëð\u001bðFuµÆÓ\u0006\u009d¼÷`Tw¹\u009aÇ¾6Y#Æ\u008d\u000eº\u0099ãqXÁ\u0096\u008c=K\u0092á#¼Tú\\\u001caX±±d©Qm\u0080vHæ@\u0012?É×bJ¶\u0004~8[õ\u001d¿£qQ\u008dv|ElP¦\u0003hûQfÀ\u000b\u0001\u0016\u008a\u0019Ì\u0093>\u0017wg¥\u0099ò\u0018 \u009a\u0080õb%\u0090\u0081\u0010Ò»Ó\u0092rÎÙè«@»\u009clR!?89Oß2\u0004`F\u000f\u0089¹Êäø§óYìæ\u0094GLMB²r\u0092¿YÊN £«\u0015ËÈÓFÐ\u0080Y\u0083ylêüs.<'\u0080Ó\u0096\u0019¿k Ä\u0093ÄJ?\u008eÃF¨U\u001aè\u0017ß\u008f\u0081\u001f\u0097Ì\u000eÙ¡fp¼S×¹OÛIÉ\u00181ü2HÙ\u0097´G÷\u0099ßõÌy \u0087¦?\nùÖ!#\u009b\u0010ÊÕÒ\u0018\u008dtªfdØ\u001e\u001a*ÍËs"
         .length();
      char var8 = '0';
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
                     CONST_S = var4;
                     CONST_T = new String[34];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 6427441203199181696L;
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
                     300L = var30;
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

                  var6 = "Ç\u0087\fôÛûû\u0017%¨\u0081F\b÷4\b%`P0ì\u0087¥n]í\u00adèÂ\u0090\u009c\u0081Ù)\"ù'%(\u0016dò\u0000fÐÍ#¸æ½njËkÝzÞT6\u0097#\u0089+ûm\nÂ2\u0089NàôR\u009725\u0013\b\u0092[+UU\u0086ä8\u001eg\u0018R©\u0003»D\u009e£Ï\u000eº\"Yù\u0097,\u0005\u001eÖ\u001fðm÷/*";
                  var7 = "Ç\u0087\fôÛûû\u0017%¨\u0081F\b÷4\b%`P0ì\u0087¥n]í\u00adèÂ\u0090\u009c\u0081Ù)\"ù'%(\u0016dò\u0000fÐÍ#¸æ½njËkÝzÞT6\u0097#\u0089+ûm\nÂ2\u0089NàôR\u009725\u0013\b\u0092[+UU\u0086ä8\u001eg\u0018R©\u0003»D\u009e£Ï\u000eº\"Yù\u0097,\u0005\u001eÖ\u001fðm÷/*"
                     .length();
                  var8 = 'X';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4523;
      if (CONST_T[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_U.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_U.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dn", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_S[var3].getBytes("ISO-8859-1");
         CONST_T[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_T[var3];
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
         throw new RuntimeException("rip/breeze/client/dn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
