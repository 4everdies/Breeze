package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import rip.breeze.BreezeModule;
import rip.breeze.ConditionsSetting;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.LicenseState;
import rip.breeze.MathUtil1;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "AimAssist",
   b = "Automatically aims at enemies for you.",
   d = rip.breeze.ModuleCategory.COMBAT,
   c = {"aim", "assist", "auto", "bot", "sword", "mouse"}
)
public class AimAssist extends BreezeModule {
   private static final Random CONST_N;
   private static final int CONST_O;
   private static final int CONST_P;
   private static final float CONST_Q = 6.6666665F;
   private static final float CONST_R = 60.0F;
   private static final float CONST_S = 0.5F;
   private final GenericSetting<Double> speedSetting;
   private final GenericSetting<Double> resistanceSetting;
   private final GenericSetting<AimPitchMode> aimPitchSetting;
   private final GenericSetting<AimYawMode2> aimYawSetting;
   private final GenericSetting<MotionMode> motionSetting;
   private final GenericSetting<Integer> fOVSetting;
   private final GenericSetting<Double> rangeSetting;
   private final GenericSetting<PriorityMode> prioritySetting;
   private final GenericSetting<Boolean> stickyLockSetting;
   private final GenericSetting<Integer> stickyFOVSetting;
   private final GenericSetting<Integer> predictionSetting;
   private final GenericSetting<Boolean> conditionsSetting;
   private final ConditionsSetting requireClickSetting;
   private final GenericSetting<Boolean> clickDelaySetting;
   private final GenericSetting<Integer> requireWeaponSetting;
   private final GenericSetting<Boolean> emptyHandSetting;
   private final GenericSetting<Boolean> whileMiningSetting;
   private final GenericSetting<Boolean> dataBuilder54_K;
   private final GenericSetting<Boolean> dataBuilder54_L;
   private final List<BlockUtil5> list_M;
   private EntityPlayer entityPlayer_N;
   private long fieldLong_O;
   private long fieldLong_P;
   private float fieldFloat_Q;
   private float fieldFloat_R;
   private long fieldLong_S;
   private ConcurrentHashMap<Long, Util125> concurrentHashMap_T;
   private ConcurrentHashMap<Long, Util125> concurrentHashMap_U;
   private float fieldFloat_V;
   private float fieldFloat_W;
   private float fieldFloat_X;
   private float fieldFloat_Y;
   private boolean fieldBool_Z;
   private final ConcurrentHashMap<Long, float[]> concurrentHashMap_aa;
   private final RenderUtil23 dataBuilder32_ab;
   private final RenderUtil23 dataBuilder32_ac;
   private final RenderUtil23 dataBuilder32_ad;
   private long long_ae;
   private boolean bool_af;
   private int int_ag;
   private int int_ah;
   private EntityPlayer entityPlayer_ai;
   private static int[] arr_aj;
   private static final String[] CONST_HB;
   private static final String[] CONST_IB;
   private static final Map CONST_JB = new HashMap(13);
   private static final long[] CONST_KB;
   private static final Long[] CONST_LB;
   private static final Map CONST_MB;

   public AimAssist() {
      long var1 = 63451133944740L;
      super();
      short var10002 = 30979;
      long var10003 = 1163099331066904598L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Speed");
      var10002 = 8003;
      var10003 = 4507136426526025305L ^ var1;
      this.speedSetting = var10001.getDataBuilder50_3("How quickly to rotate when aiming.")
         .getDataBuilder50_4(2.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(1.0, 10.0))
         .getDataBuilder54();
      var10002 = 1110;
      var10003 = 4097357315688643931L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Resistance");
      var10002 = 30911;
      var10003 = 295616300561613245L ^ var1;
      this.resistanceSetting = var10001.getDataBuilder50_3(
            "How strongly the aim assist pulls your crosshair. Lower values let you style your fight more easily."
         )
         .getDataBuilder50_4(0.6)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.1, 1.0))
         .getDataBuilder54();
      var10002 = 15367;
      var10003 = 7781924875442685187L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "AimPitch");
      var10002 = 24037;
      var10003 = 1487603019563263199L ^ var1;
      this.aimPitchSetting = var10001.getDataBuilder50_3("Where to aim at the player in the vertical direction.")
         .getDataBuilder50_4(AimPitchMode.HEAD)
         .getDataBuilder54();
      var10002 = 13126;
      var10003 = 1525232532818954879L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "AimYaw");
      var10002 = 576;
      var10003 = 3669408681155246919L ^ var1;
      this.aimYawSetting = var10001.getDataBuilder50_3("Where to aim at the player in the horizontal direction.")
         .getDataBuilder50_4(AimYawMode2.CENTER)
         .getDataBuilder54();
      int[] var10000 = getStateArray();
      short var54 = 27598;
      long var10004 = 1723376923986219714L ^ var1;
      rip.breeze.BlockUtil10 var24 = GenericSetting.getDataBuilder50(this, "Motion");
      short var55 = 5503;
      var10004 = 4806510042769828977L ^ var1;
      this.motionSetting = var24.getDataBuilder50_3(
            "The motion type to use when aiming: \n\t Smooth: Smoothly moves your mouse to the target. \n\t Human: Adds random jittering and dynamic speed changes to prevent getting detected by admin or more powerful anti-cheats."
         )
         .getDataBuilder50_4(MotionMode.SMOOTH)
         .getDataBuilder54();
      short var56 = 13210;
      var10004 = 6191867629742328461L ^ var1;
      rip.breeze.BlockUtil10 var25 = GenericSetting.getDataBuilder50(this, "FOV");
      short var57 = 26046;
      var10004 = 3225694460538707105L ^ var1;
      this.fOVSetting = var25.getDataBuilder50_3("The field of view the aim assist will target.")
         .getDataBuilder50_4(50)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 360))
         .getDataBuilder54();
      int[] var3 = var10000;
      var10002 = 10750;
      var10003 = 89886479822360800L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Range");
      var10002 = 3307;
      var10003 = 4324772308252341747L ^ var1;
      this.rangeSetting = var10001.getDataBuilder50_3("How far away the aim assist will target, in blocks.")
         .getDataBuilder50_4(3.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 8.0))
         .getDataBuilder54();
      var10002 = 32008;
      var10003 = 6096744549819761691L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Priority");
      var10002 = 19755;
      var10003 = 1830991805194564653L ^ var1;
      this.prioritySetting = var10001.getDataBuilder50_3("The targeting priority (distance for closest to you, FOV for closest to your crosshair).")
         .getDataBuilder50_4(PriorityMode.DISTANCE)
         .getDataBuilder54();
      var10002 = 28232;
      var10003 = 5938281746870851394L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "StickyLock");
      var10002 = 373;
      var10003 = 2214246655664240743L ^ var1;
      this.stickyLockSetting = var10001.getDataBuilder50_3("Once locked onto a target, keeps tracking them even if they briefly leave the acquisition FOV.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      var10002 = 6425;
      var10003 = 4853797147101437988L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "StickyFOV");
      var10002 = 784;
      var10003 = 4750350096366483984L ^ var1;
      this.stickyFOVSetting = var10001.getDataBuilder50_3("Maximum angle from crosshair to keep tracking a sticky-locked target.")
         .getDataBuilder50_4(100)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 360))
         .getDataBuilder50_9(AimAssist::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 15953;
      var10003 = 3803876884615858008L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "How quickly to respond to position changes, in milliseconds.");
      var10002 = 20668;
      var10003 = 4403188124838521219L ^ var1;
      this.predictionSetting = var10001.getDataBuilder50_3("Prediction")
         .getDataBuilder50_4(100)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 300))
         .getDataBuilder54();
      var10002 = 13715;
      var10003 = 5709720193224117400L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Kalman filter prediction: leads aim forward to compensate for response time.");
      var10002 = 11514;
      var10003 = 4330689686524499394L ^ var1;
      this.conditionsSetting = var10001.getDataBuilder50_3("Conditions").getDataBuilder50_4(true).getDataBuilder54();
      short var82 = 28781;
      long var10005 = 5522007259026049398L ^ var1;
      this.requireClickSetting = new ConditionsSetting(this, "RequireClick");
      var10002 = 11601;
      var10003 = 8722558746718475329L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.requireClickSetting, "Only aims if you are clicking.");
      var10002 = 20714;
      var10003 = 9143739974712486396L ^ var1;
      this.clickDelaySetting = var10001.getDataBuilder50_3("ClickDelay").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 26740;
      var10003 = 6035051088680800636L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.requireClickSetting, "For how much time to keep aiming after you stopped clicking.");
      var10002 = 5249;
      var10003 = 422018945315483037L ^ var1;
      this.requireWeaponSetting = var10001.getDataBuilder50_3("RequireWeapon")
         .getDataBuilder50_4(200)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 1000))
         .getDataBuilder50_9(AimAssist::lambda$new_Inner1)
         .getDataBuilder54();
      var10002 = 18350;
      var10003 = 4616166948941299373L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.requireClickSetting, "EmptyHand");
      var10002 = 21261;
      var10003 = 4641037387845167641L ^ var1;
      this.emptyHandSetting = var10001.getDataBuilder50_3("Makes an empty hand also count as a weapon.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 31700;
      var10003 = 5065036643951952616L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.requireClickSetting, "WhileMining");
      var10002 = 20833;
      var10003 = 5172816058382739546L ^ var1;
      this.whileMiningSetting = var10001.getDataBuilder50_3("Doesn't stop aiming when you are mining a block.")
         .getDataBuilder50_4(true)
         .getDataBuilder50_9(AimAssist::lambda$new_Inner2)
         .getDataBuilder54();
      var10002 = 7663;
      var10003 = 6888981655493256426L ^ var1;
      this.dataBuilder54_K = GenericSetting.<Boolean>getDataBuilder50(this.requireClickSetting, "Aims through walls.")
         .getDataBuilder50_3("Doesn't stop aiming when you are mining a block.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      this.dataBuilder54_L = GenericSetting.<Boolean>getDataBuilder50(this.requireClickSetting, "Walls")
         .getDataBuilder50_3("Aims through walls.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      this.list_M = new ArrayList<>();
      this.fieldFloat_Q = 1.0F;
      this.fieldFloat_R = 1.0F;
      this.fieldLong_S = 0L;
      this.concurrentHashMap_T = new ConcurrentHashMap<>();
      this.concurrentHashMap_U = new ConcurrentHashMap<>();
      this.fieldFloat_V = 0.0F;
      this.fieldFloat_W = 0.0F;
      this.fieldFloat_X = 0.0F;
      this.fieldFloat_Y = 0.0F;
      this.fieldBool_Z = false;
      this.concurrentHashMap_aa = new ConcurrentHashMap<>();
      this.dataBuilder32_ab = new RenderUtil23(0.5F, 1.0E-4F);
      this.dataBuilder32_ac = new RenderUtil23(0.5F, 1.0E-4F);
      this.dataBuilder32_ad = new RenderUtil23(0.5F, 1.0E-4F);
      this.long_ae = 0L;
      this.bool_af = false;
      this.int_ag = 0;
      this.int_ah = -1;
      this.entityPlayer_ai = null;
      if (var3 == null) {
         LicenseState.toggle(LicenseState.checkCondition());
      }
   }

   public void toggle() {
      long var1 = 73912092874623L;
      this.fieldLong_O = System.currentTimeMillis();
      this.fieldLong_P = 1944339072375521687L;
      this.resetAimState();
      this.fieldBool_Z = false;
   }

   @EventListener(a = rip.breeze.Priority.LOW)
   public void clamp(AngleUpdateEventEvent var1) {
      long var2 = 25484937808617L;
      int[] var4 = getStateArray();
      if (!BreezeClient.isValid()) {
         this.concurrentHashMap_T.entrySet().removeIf(AimAssist::lambda$onAngleUpdate_Inner3);
         this.concurrentHashMap_U.entrySet().removeIf(AimAssist::lambda$onAngleUpdate_Inner4);
         if (!var1.g) {
            long var5 = System.currentTimeMillis() - this.fieldLong_O;
            this.fieldLong_O = System.currentTimeMillis();
            if (this.motionSetting.isValid(MotionMode.HUMAN)) {
               if (System.currentTimeMillis() > this.fieldLong_S) {
                  this.fieldFloat_R = (float)(1.0 + CONST_N.nextGaussian() * 0.5);
                  this.fieldFloat_R = (float)Math.max(0.1, this.fieldFloat_R);
                  if (this.fieldFloat_R > 1.3) {
                     this.fieldFloat_R = (float)(1.3 + (this.fieldFloat_R - 1.3) * 0.5);
                  }

                  this.fieldLong_S = System.currentTimeMillis() + 9211636530843648104L + CONST_N.nextInt(200);
               }

               this.fieldFloat_Q = MathUtil1.calculateFloat(this.fieldFloat_Q, this.fieldFloat_R, 0.006F * (float)var5);
            }

            if (BreezeClient.CONST_A.currentScreen == null && this.getHeldItem() && this.checkCondition() && this.checkCondition_2()) {
               EntityPlayer var7 = null;
               double var8 = Double.MAX_VALUE;
               if (this.stickyLockSetting.getObject_m() && this.entityPlayer_N != null && this.fieldBool_Z) {
                  EntityPlayer var10 = this.entityPlayer_N;
                  boolean var11 = AntiBot.isInvisible_3(var10)
                     && !var10.isDead
                     && BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var10) < this.rangeSetting.getObject_m()
                     && (
                        this.dataBuilder54_L.getObject_m()
                           || BreezeClient.CONST_A
                                 .theWorld
                                 .rayTraceBlocks(
                                    BreezeClient.CONST_A.thePlayer.getPositionEyes(MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks),
                                    BlockUtil7.getVec3_2(var10.getEntityBoundingBox()),
                                    false,
                                    false,
                                    false
                                 )
                              == null
                     );
                  if (var11) {
                     float[] var12 = RotationUtil7.getAnglesTo(BlockUtil7.getVec3_2(var10.getEntityBoundingBox()), BreezeClient.CONST_A.thePlayer);
                     float var13 = (float)Math.sqrt(
                        Math.pow(RotationUtil7.absValue(BreezeClient.CONST_A.thePlayer.rotationYaw, var12[0]), 2.0)
                           + Math.pow(Math.abs(var12[1] - BreezeClient.CONST_A.thePlayer.rotationPitch), 2.0)
                     );
                     if (var13 <= this.stickyFOVSetting.getObject_m().intValue() / 2.0F) {
                        var7 = var10;
                     }
                  }

                  if (var7 == null) {
                     this.fieldBool_Z = false;
                  }
               }

               if (var7 == null) {
                  for (EntityPlayer var62 : BreezeClient.CONST_A.theWorld.playerEntities) {
                     if ((AntiBot.isInvisible_3(var62) || var4 == null)
                        && (
                           this.dataBuilder54_L.getObject_m()
                              || BreezeClient.CONST_A
                                    .theWorld
                                    .rayTraceBlocks(
                                       BreezeClient.CONST_A.thePlayer.getPositionEyes(MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks),
                                       BlockUtil7.getVec3_2(var62.getEntityBoundingBox()),
                                       false,
                                       false,
                                       false
                                    )
                                 == null
                              || var4 == null
                        )) {
                        double var14 = BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var62);
                        if (var14 < this.rangeSetting.getObject_m()) {
                           float[] var16 = RotationUtil7.getAnglesTo(BlockUtil7.getVec3_2(var62.getEntityBoundingBox()), BreezeClient.CONST_A.thePlayer);
                           float var17 = RotationUtil7.absValue(BreezeClient.CONST_A.thePlayer.rotationYaw, var16[0]);
                           float var18 = Math.abs(var16[1] - Math.abs(BreezeClient.CONST_A.thePlayer.rotationPitch));
                           var17 = (float)Math.sqrt(var17 * var17 + var18 * var18);
                           if (var17 > this.fOVSetting.getObject_m().intValue() / 2.0F && var4 != null) {
                              continue;
                           }

                           double var19 = this.prioritySetting.isValid(PriorityMode.DISTANCE) ? var14 : var17;
                           if (var19 < var8 || var62 == BreezeClient.getThemeManager().getEntity()) {
                              var7 = var62;
                              var8 = var19;
                              if (var62 == BreezeClient.getThemeManager().getEntity() && var4 != null) {
                                 break;
                              }
                           }

                           if (var19 < var8) {
                              var7 = var62;
                              var8 = var19;
                           }
                        }

                        if (var4 == null) {
                           break;
                        }
                     }
                  }
               }

               if (var7 == null) {
                  this.entityPlayer_N = null;
                  this.fieldBool_Z = false;
                  this.list_M.clear();
                  this.resetAimState();
                  this.recordAimAngles(var1, false, false);
               } else {
                  if (this.stickyLockSetting.getObject_m()) {
                     this.fieldBool_Z = true;
                  }

                  BreezeClient.getThemeManager().processAll(var7, this.rangeSetting.getObject_m().floatValue() + 1.0F);
                  if (this.entityPlayer_N != var7) {
                     this.entityPlayer_N = var7;
                     this.list_M.clear();
                     this.resetAimState();
                  }

                  label548: {
                     this.list_M.add(0, new BlockUtil5(var7));
                     long var21 = System.currentTimeMillis();
                     if (!this.bool_af || this.entityPlayer_ai != var7) {
                        Vec3 var63 = BlockUtil7.getVec3_2(var7.getEntityBoundingBox());
                        this.dataBuilder32_ab.update((float)var63.xCoord);
                        this.dataBuilder32_ac.update((float)var63.yCoord);
                        this.dataBuilder32_ad.update((float)var63.zCoord);
                        this.bool_af = true;
                        this.int_ag = 0;
                        this.int_ah = var7.ticksExisted;
                        this.entityPlayer_ai = var7;
                        if (var4 != null) {
                           break label548;
                        }
                     }

                     if (var7.ticksExisted != this.int_ah) {
                        Vec3 var64 = BlockUtil7.getVec3_2(var7.getEntityBoundingBox());
                        float var66 = Math.max(0.001F, (float)(var21 - this.long_ae) / 1000.0F);
                        float var68 = this.dataBuilder32_ab.fieldFloat_b;
                        float var71 = this.dataBuilder32_ad.fieldFloat_b;
                        this.dataBuilder32_ab.calculate((float)var64.xCoord, var66);
                        this.dataBuilder32_ac.calculate((float)var64.yCoord, var66);
                        this.dataBuilder32_ad.calculate((float)var64.zCoord, var66);
                        float var73 = (float)(var7.posX - BreezeClient.CONST_A.thePlayer.posX);
                        float var23 = (float)(var7.posZ - BreezeClient.CONST_A.thePlayer.posZ);
                        float var24 = (float)Math.sqrt(var73 * var73 + var23 * var23);
                        if (var24 > 0.0F) {
                           var73 /= var24;
                           var23 /= var24;
                           float var25 = this.dataBuilder32_ab.fieldFloat_b - var68;
                           float var26 = this.dataBuilder32_ad.fieldFloat_b - var71;
                           float var27 = var25 * var73 + var26 * var23;
                           if (var27 > 3.0F) {
                              this.dataBuilder32_ab.fieldFloat_b *= 0.2F;
                              this.dataBuilder32_ad.fieldFloat_b *= 0.2F;
                           }
                        }

                        this.int_ag++;
                        this.int_ah = var7.ticksExisted;
                        this.long_ae = var21;
                     }
                  }

                  AxisAlignedBB var65 = this.getDistance(var7);
                  if (var65 == null) {
                     this.recordAimAngles(var1, false, false);
                  } else {
                     Vec3 var67 = BlockUtil7.getVec3_2(var65);
                     Vec3 var69 = BreezeClient.CONST_A.thePlayer.getPositionEyes(MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks);
                     float[] var72 = RotationUtil7.calcDistance(var67, var69, false);
                     float[] var75 = RotationUtil7.calcDistance(
                        BlockUtil7.getVec3_2(BlockUtil7.getHitbox(var7, MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks)), var69, false
                     );
                     float var77 = var72[0];
                     float var78 = var72[0];
                     float var79 = var72[1];
                     float var80 = var72[1];
                     float[] var81 = RotationUtil7.calcDistance(new Vec3(var65.minX, var65.minY, var65.minZ), var69, false);
                     if (var81[0] < var77) {
                        var77 = var81[0];
                     }

                     if (var81[0] > var78) {
                        var78 = var81[0];
                     }

                     if (var81[1] < var79) {
                        var79 = var81[1];
                     }

                     if (var81[1] > var80) {
                        var80 = var81[1];
                     }

                     var81 = RotationUtil7.calcDistance(new Vec3(var65.minX, var65.minY, var65.maxZ), var69, false);
                     if (var81[0] < var77) {
                        var77 = var81[0];
                     }

                     if (var81[0] > var78) {
                        var78 = var81[0];
                     }

                     if (var81[1] < var79) {
                        var79 = var81[1];
                     }

                     if (var81[1] > var80) {
                        var80 = var81[1];
                     }

                     var81 = RotationUtil7.calcDistance(new Vec3(var65.maxX, var65.minY, var65.minZ), var69, false);
                     if (var81[0] < var77) {
                        var77 = var81[0];
                     }

                     if (var81[0] > var78) {
                        var78 = var81[0];
                     }

                     if (var81[1] < var79) {
                        var79 = var81[1];
                     }

                     if (var81[1] > var80) {
                        var80 = var81[1];
                     }

                     var81 = RotationUtil7.calcDistance(new Vec3(var65.maxX, var65.minY, var65.maxZ), var69, false);
                     if (var81[0] < var77) {
                        var77 = var81[0];
                     }

                     if (var81[0] > var78) {
                        var78 = var81[0];
                     }

                     if (var81[1] < var79) {
                        var79 = var81[1];
                     }

                     if (var81[1] > var80) {
                        var80 = var81[1];
                     }

                     var81 = RotationUtil7.calcDistance(new Vec3(var65.minX, var65.maxY, var65.minZ), var69, false);
                     if (var81[0] < var77) {
                        var77 = var81[0];
                     }

                     if (var81[0] > var78) {
                        var78 = var81[0];
                     }

                     if (var81[1] < var79) {
                        var79 = var81[1];
                     }

                     if (var81[1] > var80) {
                        var80 = var81[1];
                     }

                     var81 = RotationUtil7.calcDistance(new Vec3(var65.minX, var65.maxY, var65.maxZ), var69, false);
                     if (var81[0] < var77) {
                        var77 = var81[0];
                     }

                     if (var81[0] > var78) {
                        var78 = var81[0];
                     }

                     if (var81[1] < var79) {
                        var79 = var81[1];
                     }

                     if (var81[1] > var80) {
                        var80 = var81[1];
                     }

                     var81 = RotationUtil7.calcDistance(new Vec3(var65.maxX, var65.maxY, var65.minZ), var69, false);
                     if (var81[0] < var77) {
                        var77 = var81[0];
                     }

                     if (var81[0] > var78) {
                        var78 = var81[0];
                     }

                     if (var81[1] < var79) {
                        var79 = var81[1];
                     }

                     if (var81[1] > var80) {
                        var80 = var81[1];
                     }

                     var81 = RotationUtil7.calcDistance(new Vec3(var65.maxX, var65.maxY, var65.maxZ), var69, false);
                     if (var81[0] < var77) {
                        var77 = var81[0];
                     }

                     if (var81[0] > var78) {
                        var78 = var81[0];
                     }

                     if (var81[1] < var79) {
                        var79 = var81[1];
                     }

                     if (var81[1] > var80) {
                        var80 = var81[1];
                     }

                     float var28;
                     float var30;
                     boolean var31;
                     label524: {
                        var89 = var78 - var77;
                        var28 = var80 - var79;
                        float var29 = 0.3F * var89;
                        var30 = var72[0];
                        var31 = BreezeClient.CONST_A.thePlayer.rotationYaw < var77 + var29 || BreezeClient.CONST_A.thePlayer.rotationYaw > var78 - var29;
                        boolean var32 = var75[0] > BreezeClient.CONST_A.thePlayer.rotationYaw;
                        if (this.aimYawSetting.isValid(AimYawMode2.MULTI_POINT)) {
                           if (var32 && var72[0] < BreezeClient.CONST_A.thePlayer.rotationYaw) {
                              var31 = false;
                              if (var4 != null) {
                                 break label524;
                              }
                           }

                           if (var32 || !(var72[0] > BreezeClient.CONST_A.thePlayer.rotationYaw)) {
                              break label524;
                           }

                           var31 = false;
                           if (var4 != null) {
                              break label524;
                           }
                        }

                        var31 = Math.abs(BreezeClient.CONST_A.thePlayer.rotationYaw - var30) > var89 * 0.04;
                     }

                     boolean var33 = var31
                        && this.motionSetting.isValid(MotionMode.HUMAN)
                        && BreezeClient.CONST_A.thePlayer.rotationPitch == BreezeClient.CONST_A.thePlayer.prevRotationPitch;
                     float var34 = var72[1];
                     switch (Util49.CONST_A[this.aimPitchSetting.getObject_m().ordinal()]) {
                        case 1:
                           var34 = RotationUtil7.calcDistance(
                              var67.addVector(0.0, this.motionSetting.isValid(MotionMode.HUMAN) ? 0.1 + 0.05 * this.fieldFloat_Q : 0.15, 0.0), var69, false
                           )[1];
                           if (!(Math.abs(BreezeClient.CONST_A.thePlayer.rotationPitch - var34) > var28 * 0.1)) {
                              break;
                           }

                           var33 = true;
                           if (var4 != null) {
                              break;
                           }
                        case 2:
                           var34 = RotationUtil7.calcDistance(
                              var67.addVector(0.0, this.motionSetting.isValid(MotionMode.HUMAN) ? 0.35 + 0.05 * this.fieldFloat_Q : 0.4, 0.0), var69, false
                           )[1];
                           if (!(Math.abs(BreezeClient.CONST_A.thePlayer.rotationPitch - var34) > var28 * 0.04)) {
                              break;
                           }

                           var33 = true;
                           if (var4 != null) {
                              break;
                           }
                        case 3:
                           var34 = RotationUtil7.calcDistance(
                              var67.addVector(0.0, this.motionSetting.isValid(MotionMode.HUMAN) ? 0.55 + 0.05 * this.fieldFloat_Q : 0.6, 0.0), var69, false
                           )[1];
                           if (!(Math.abs(BreezeClient.CONST_A.thePlayer.rotationPitch - var34) > var28 * 0.06)) {
                              break;
                           }

                           var33 = true;
                           if (var4 != null) {
                              break;
                           }
                        case 4:
                           var34 = MathUtil1.clamp((this.fieldFloat_Q - 1.0F) * 10.0F, var79 + 10.0F, var80 - 10.0F);
                           if (!(BreezeClient.CONST_A.thePlayer.rotationPitch > var80 - 7.0F)
                              && !(BreezeClient.CONST_A.thePlayer.rotationPitch < var79 + 7.0F)
                              && !(Math.abs(BreezeClient.CONST_A.thePlayer.rotationPitch - var34) > 7.0F)) {
                              break;
                           }

                           var33 = true;
                           if (var4 != null) {
                              break;
                           }
                        case 5:
                           var34 = BreezeClient.CONST_A.thePlayer.rotationPitch + (this.fieldFloat_Q - 1.0F) * 3.0F;
                     }

                     if (this.aimYawSetting.isValid(AimYawMode2.MULTI_POINT) && var31) {
                        var30 = (float)(var72[0] + var89 * 0.2 * (this.fieldFloat_Q - 1.0F));
                     }

                     if (var33
                        && !var31
                        && this.motionSetting.isValid(MotionMode.HUMAN)
                        && BreezeClient.CONST_A.thePlayer.rotationYaw == BreezeClient.CONST_A.thePlayer.prevRotationYaw) {
                        var31 = true;
                     }

                     float var35;
                     float var36;
                     float var37;
                     label529: {
                        var35 = RotationUtil7.absValue(BreezeClient.CONST_A.thePlayer.rotationYaw, var72[0]);
                        var36 = Math.abs(BreezeClient.CONST_A.thePlayer.rotationPitch - var34);
                        var37 = 0.0F;
                        if (var31 && var33) {
                           var37 = (float)Math.sqrt(var35 * var35 + var36 * var36);
                           if (var4 != null) {
                              break label529;
                           }
                        }

                        if (var31) {
                           var37 = var35;
                           if (var4 != null) {
                              break label529;
                           }
                        }

                        if (var33) {
                           var37 = var36;
                        }
                     }

                     long var38 = System.currentTimeMillis();
                     this.concurrentHashMap_aa.put(var38, new float[]{var1.getFloat_h(), var1.getFloat_i()});
                     this.concurrentHashMap_aa.entrySet().removeIf(AimAssist::lambda$onAngleUpdate_Inner5);
                     float var40 = 0.0F;
                     float var41 = 0.0F;

                     for (float[] var43 : this.concurrentHashMap_aa.values()) {
                        var40 += var43[0];
                        var41 += var43[1];
                        if (var4 == null) {
                           break;
                        }
                     }

                     int var90 = this.concurrentHashMap_aa.size();
                     if (var90 > 0) {
                        var40 /= var90;
                        var41 /= var90;
                     }

                     float var91 = MathUtil1.clamp((float)var5 / 60.0F, 0.0F, 1.0F);
                     float var44 = MathUtil1.clamp((float)var5 / 21.0F, 0.0F, 1.0F);
                     this.fieldFloat_X = absValue(this.fieldFloat_X, var40, var91, var44);
                     this.fieldFloat_Y = absValue(this.fieldFloat_Y, var41, var91, var44);
                     float var45 = BreezeClient.CONST_A.thePlayer.rotationYaw < var30 ? 1.0F : -1.0F;
                     float var46 = BreezeClient.CONST_A.thePlayer.rotationPitch < var34 ? 1.0F : -1.0F;
                     float var47 = this.resistanceSetting.getObject_m().floatValue();
                     boolean var48 = var31 && this.fieldFloat_X * var45 < 0.0F;
                     boolean var49 = var33 && this.fieldFloat_Y * var46 < 0.0F;
                     float var50 = 0.0F;
                     if (var48) {
                        var50 = Math.max(var50, Math.min(1.0F, Math.abs(this.fieldFloat_X) / 5.0F));
                     }

                     if (var49) {
                        var50 = Math.max(var50, Math.min(1.0F, Math.abs(this.fieldFloat_Y) / 5.0F));
                     }

                     double var51 = var5 * (0.01 + 0.03 * (Math.min(var37, 60.0F) / 60.0F)) * Math.pow(this.speedSetting.getObject_m(), 1.2);
                     var51 *= 1.0 - var50 * var47 * 0.6;
                     if (this.motionSetting.isValid(MotionMode.HUMAN)) {
                        var51 += var51 * CONST_N.nextGaussian() * 0.2;
                        var51 *= this.fieldFloat_Q;
                        if (var51 < 0.0) {
                           return;
                        }
                     }

                     double var53 = var37 * BlockUtil7.clamp((float)var5 / 60.0F, 0.0F, 0.5F);
                     var51 = Math.min(var51, var53);
                     float var55 = BreezeClient.CONST_A.gameSettings.mouseSensitivity * 0.6F + 0.2F;
                     float var56 = var55 * var55 * var55 * 8.0F;
                     if (var31) {
                        float var57 = (float)var51;
                        if (var33) {
                           var57 *= var35 / var37;
                        }

                        float var58;
                        label317: {
                           var57 = Math.min(var57, var35);
                           var58 = 0.0F;
                           if (BreezeClient.CONST_A.thePlayer.rotationYaw < var30) {
                              var58 = var57 * 6.6666665F;
                              if (var4 != null) {
                                 break label317;
                              }
                           }

                           if (BreezeClient.CONST_A.thePlayer.rotationYaw > var30) {
                              var58 = -var57 * 6.6666665F;
                           }
                        }

                        if (var58 != 0.0F && this.fieldFloat_X * var58 < 0.0F) {
                           float var59 = -this.fieldFloat_X * var47 * (1.0F - var50);
                           var59 = BlockUtil7.clamp(var59, -Math.abs(this.fieldFloat_X), Math.abs(this.fieldFloat_X));
                           var58 += var59;
                        }

                        float var100 = this.calculateFloat(this.concurrentHashMap_U, var1.getFloat_h() + var58, false) + this.fieldFloat_W;
                        float var60 = Math.round(var100 / var56) * var56;
                        this.fieldFloat_W = var100 - var60;
                        var1.setFloat_h(var60);
                     }

                     if (var33) {
                        float var96 = (float)var51;
                        if (var31) {
                           var96 *= var36 / var37;
                        }

                        float var98;
                        label309: {
                           var96 = Math.min(var96, var36);
                           var98 = 0.0F;
                           if (BreezeClient.CONST_A.thePlayer.rotationPitch < var34) {
                              var98 = var96 * 6.6666665F;
                              if (var4 != null) {
                                 break label309;
                              }
                           }

                           if (BreezeClient.CONST_A.thePlayer.rotationPitch > var34) {
                              var98 = -var96 * 6.6666665F;
                           }
                        }

                        if (var98 != 0.0F && this.fieldFloat_Y * var98 > 0.0F) {
                           float var101 = this.fieldFloat_Y * var47 * (1.0F - var50);
                           var101 = BlockUtil7.clamp(var101, -Math.abs(this.fieldFloat_Y), Math.abs(this.fieldFloat_Y));
                           var98 += var101;
                        }

                        float var103 = this.calculateFloat(this.concurrentHashMap_T, var1.getFloat_i() - var98, false) + this.fieldFloat_V;
                        float var104 = Math.round(var103 / var56) * var56;
                        this.fieldFloat_V = var103 - var104;
                        var1.setFloat_i(var104);
                     }

                     this.recordAimAngles(var1, var33, var31);
                  }
               }
            } else {
               this.recordAimAngles(var1, false, false);
            }
         }
      }
   }

   @EventListener
   public void onMouseClicked(MouseClickedEventEvent var1) {
      long var2 = 115822971939674L;
      if (this.clickDelaySetting.getObject_m() && !BreezeClient.isValid() && this.getHeldItem()) {
         if (var1.aimYawMode_h == AimYawMode.LEFT || var1.aimYawMode_h == AimYawMode.HOLD_LEFT) {
            this.fieldLong_P = System.currentTimeMillis();
         }
      }
   }

   private void resetAimState() {
      this.bool_af = false;
      this.int_ag = 0;
      this.int_ah = -1;
      this.concurrentHashMap_aa.clear();
      this.fieldFloat_X = 0.0F;
      this.fieldFloat_Y = 0.0F;
   }

   private AxisAlignedBB getDistance(EntityPlayer var1) {
      long var2 = 135239441401924L;
      if (this.conditionsSetting.getObject_m() && this.bool_af && this.int_ag >= 3) {
         float var4 = BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var1);
         float var5 = BlockUtil7.clamp(var4 / 2.0F, 0.0F, 1.0F);
         float var6 = Math.max(50, this.predictionSetting.getObject_m()) / 1000.0F * var5;
         float var7 = this.dataBuilder32_ab.calculateFloat(var6);
         float var8 = this.dataBuilder32_ac.calculateFloat(var6);
         float var9 = this.dataBuilder32_ad.calculateFloat(var6);
         AxisAlignedBB var10 = BlockUtil7.getHitbox(var1, MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks);
         Vec3 var11 = BlockUtil7.getVec3_2(var10);
         double var12 = BlockUtil7.clamp_3(var7 - var11.xCoord, -1.5, 1.5);
         double var14 = BlockUtil7.clamp_3(var8 - var11.yCoord, -1.5, 1.5);
         double var16 = BlockUtil7.clamp_3(var9 - var11.zCoord, -1.5, 1.5);
         return var10.offset(var12, var14, var16);
      } else {
         return this.getAxisAlignedBB();
      }
   }

   private static float absValue(float var0, float var1, float var2, float var3) {
      long var4 = 81667633787414L;
      float var6 = Math.abs(var1) >= Math.abs(var0) ? var2 : var3;
      return var0 + (var1 - var0) * var6;
   }

   private float calculateFloat(ConcurrentHashMap<Long, Util125> var1, float var2, boolean var3) {
      long var4 = 33734020997596L;
      int[] var6 = getStateArray();
      if (var1.isEmpty()) {
         return var2;
      }

      float var7 = 0.0F;
      float var8 = 0.0F;
      ArrayList var9 = new ArrayList(var1.keySet());
      int var10 = var9.size() - 1;

      while (var10 >= 0) {
         long var11 = (Long)var9.get(var10);
         if (var3 && !((Util125)var1.get(var11)).fieldBool_b && var6 != null) {
            break;
         }

         float var13 = (float)(3367291617966055982L - (System.currentTimeMillis() - var11)) / 60.0F;
         var8 += ((Util125)var1.get(var11)).fieldFloat_a * var13;
         var7 += var13;
         var10--;
         if (var6 == null) {
            break;
         }
      }

      if (var7 == 0.0F) {
         return var2;
      }

      float var14 = var8 / var7;
      return (var2 + var14) / 2.0F;
   }

   private void recordAimAngles(AngleUpdateEventEvent var1, boolean var2, boolean var3) {
      long var4 = 92719133599990L;
      if (!var2) {
         var1.setFloat_i(this.calculateFloat(this.concurrentHashMap_T, var1.getFloat_i(), true));
      }

      if (!var3) {
         var1.setFloat_h(this.calculateFloat(this.concurrentHashMap_U, var1.getFloat_h(), true));
      }

      this.concurrentHashMap_T.put(System.currentTimeMillis(), new Util125(var1.getFloat_i(), var2));
      this.concurrentHashMap_U.put(System.currentTimeMillis(), new Util125(var1.getFloat_h(), var3));
   }

   private boolean getHeldItem() {
      long var1 = 104909206140897L;
      if (!this.emptyHandSetting.getObject_m()) {
         return true;
      }

      if (BreezeClient.CONST_A.thePlayer.getHeldItem() == null) {
         return this.whileMiningSetting.getObject_m();
      }

      Item var3 = BreezeClient.CONST_A.thePlayer.getHeldItem().getItem();
      return var3 instanceof ItemSword || var3 instanceof ItemAxe || Item.getIdFromItem(var3) == 280;
   }

   private boolean checkCondition() {
      long var1 = 9037430200014L;
      if (!this.clickDelaySetting.getObject_m()) {
         return true;
      } else if (PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindAttack)) {
         this.fieldLong_P = System.currentTimeMillis();
         return true;
      } else {
         return System.currentTimeMillis() - this.fieldLong_P < this.requireWeaponSetting.getObject_m().intValue();
      }
   }

   private boolean checkCondition_2() {
      long var1 = 72687295016886L;
      return !this.dataBuilder54_K.getObject_m() ? true : BreezeClient.CONST_A.objectMouseOver.typeOfHit != MovingObjectType.BLOCK;
   }

   private AxisAlignedBB getAxisAlignedBB() {
      long var1 = 17221597421248L;
      int[] var10000 = getStateArray();
      int var3 = this.list_M.size();
      int var4 = 0;
      int[] var5 = var10000;

      while (var4 < var3) {
         BlockUtil5 var6 = this.list_M.get(var4);
         if (System.currentTimeMillis() - var6.fieldLong_b >= this.predictionSetting.getObject_m().intValue()) {
            while (this.list_M.size() > var4 + 1) {
               this.list_M.remove(var4 + 1);
               if (var5 == null) {
                  break;
               }
            }

            return var6.axisAlignedBB_a;
         }

         var4++;
         if (var5 == null) {
            break;
         }
      }

      return null;
   }

   private static boolean lambda$onAngleUpdate_Inner5(long var0, Entry var2) {
      long var3 = 106257990591473L;
      return var0 - var2.getKey() > 50L;
   }

   private static boolean lambda$onAngleUpdate_Inner4(Entry var0) {
      long var1 = 42520552287829L;
      return System.currentTimeMillis() - var0.getKey() > -5434733113120053919L;
   }

   private static boolean lambda$onAngleUpdate_Inner3(Entry var0) {
      long var1 = 121425020424527L;
      return System.currentTimeMillis() - var0.getKey() > 3367291617966055982L;
   }

   private static boolean lambda$new_Inner2(rip.breeze.DateUtil var0) {
      long var1 = 15265768710479L;
      return var0.getObject("RequireWeapon", Boolean.class);
   }

   private static boolean lambda$new_Inner1(rip.breeze.DateUtil var0) {
      long var1 = 75232265583576L;
      return var0.getObject("RequireClick", Boolean.class);
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 96866817023601L;
      return var0.getObject("StickyLock", Boolean.class);
   }

   static {
      int[] var10000 = new int[5];
      long var0 = 126390817613749L;
      initialize(var10000);
      Cipher var2;
      Cipher var36 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var36.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[40];
      int var5 = 0;
      String var6 = "ûC\u0000\u001fù^±\u000f\u0096µÃ\u000e·FØ½5\u001býÝK\u001dç\u0081j®\u0080F4C\u008aX_Tkm´®Ít4\u0007\u0091\u0017\rSyü\u0017³_ßªç´\u0096¯\u0019bÖ#ý:\u0099\u0001£\u0096©\u009eW¥Ï\u0010×L\u0002¤\u000e\u0013hL[èea\u0000h\u0005è\u0018KÏ\u0010\u009c0&f\t*\u008eàz[ÄÈ\u0006]ÚBÜ÷\u0091GlhDîVW]±i¬\u0089ZÝ\u001e÷(X\u0013ÝCÖ\u0005EØ\u008chê#çFP\u008fy\u0080~A6\u00962\b\u000bÆ?uüz\u0099LQY`àä\u0092µ¨4ÇúðïK\u0004nCnoHfU\u0096\u009b°\u0087¨¼\u0088_\u009cí\u0017ú,\u0084´v}b§þIÎ\u001f\u0004\fÈð¡X¢ZôOû£\u0090 \u0082\u0019æ,H\u0099Û½\u0018\u0085pÅ;\u0093{ËK\u001c\u0083Ò×w\u0017\u0091ù.\u009efÿè\u0012~8<\u001cI]-\u009dä'\u0014§ä8ø\u0093°Õ»T¼\u0000m\u008a´\u000bÝÓ¬\b%v\u0099L%\\ÀpsÙ°>x°«Uf\u008dv\u0010\u0016\u0000à®»×ºÆ`¿¸ú¿m/üËÍ2ß±\u0000ñ¾±®p9*\u0014¹×c\u0007Mb\u000f/\u00adn\u009eÓ\u0013\u0081Ï9~ú9Ds\u0099ÁÕqñ2Î\u0016H\u008f\u0080\t¶\n\u0007TßT-@ê;)#%\u00120í+ñÚpO×]bq\"ÆÌ \u0094ÛÒíËw$\u0017õLK.ÏXãT\u007f ¹M=ÜèÂ\u0095\u0000y²O7\u0017vDÖ\u009e¦×ñwðN2t´\n\u0097iÆ\u007fBRN\u0089å¾D`\u009a~|\u00adGª\u0094\u009f3#\u0093¦`Ã\u0007z½¢6Ò!\u000e\u00963`\u00adö\u001c\u008a¸\u0098VÙ¦×µÉ\u0092#\u00adÑ\tHê\\\u0010~î\u0013'[É[\u008f\u008bbì~IRB\u009d0\u001cÞØ\u0013\u001a²\tEµØ0ê\u0000ù\u0010\u009c´ß\u0019&¢ý§~(Ùöð=e\u009a]d\n~²\u0080Ãj~É\u0092 8\u009aN÷\u00ad\u0010\u0092\u0084Ó\u0090U×\u0018ÌOóS\u0085¹ÙÆ\u00068\u0018*Pvbàz÷K4»$hùñ\u0092©ú[óßl\b\u001cQ×ûJ\u0084±J \"&\u0014X¦sÈ\u0095Ï®1_\u0081?zþ\u0016O0Y\u0000ô\\T 2,çµÔ\u0094ól\u00adµñÕÃpµþX\u0001\tA¹Ú´+Z¸¦)]H\u0017z\u0098V\\F\u0006W\u00881AÝ}\u0089¾\u000fiD;»}ax÷?¯\u008c7ù<º8\u0019÷O\u009e¼\u0015ª\u00adu \u009a¬xÑí\u0090\u0011(:àé!öÛtÿ&mU>yûÂ\u008dÔ\u0011þÜÞh J«_èÔþ×Ï[)a«G\f)a|]õænj\u000bV¬\u0013Û\u001feLâ\u009cK\u008b1s\u0089â0\u0006Jùl\u0092=f¬à\u0012÷\u001cÌá\u0003°ÝBC%ë\u0010té\u0096\u000eØ\u0004³Î\u0013\t ê¦\u0010³{àüI\u007f\u0081(\u0087LW\u0015\u0089\u0003\u000eÞß\u0011À\u0095\u00adR\u0015%>Ö\u0019\u0004 ï#R\u0004\rMAÏ\u000b3øàìÉ.ÉL\u0099\u001f ³ ÚhiâZËÍ\u0087º·ö¾\u0010Ï¹\u0086\ná=\u009892\\r{K¨Ëén \u001a~Q\u0016Ó2æô\u0015XÊ\u009c¹\u0095<Õ\u001e\u001aØòm¡ë\u009a?êþ?ñ0á Ő*óó)è\u000e@ÎE5Á<\u0090X\u0082d<GcºM\u0086gC\u0004\u007f2\u009c\u001c\u0081oûá¿ \u0081\u001e\u000bÜíA\u0010v«\u0005!ð\u0092ÍNy\u000fävñIC¢ý\u009fYwÛ9 Z¼3\u0085¤ÿ&GZq¼ÓÁ\u0002'ê§qûGZ\u0085\u0004 Þ\u001f^ÉÅ\u0014\u0011Ç\u0082Û\u001b\u0099~ó2È\u009c`e\u0090\u0003\u0001\u0088ów\f¸9Vì\u0010?)\u00ad~´\u007f\\¡x\u009dæ\u000b*§^\u009b±\u001bR\nBÌ¨Ù\rLî/\t\rÓj1ìA\u001eKðÿ³iÑ* \u0099,\u0095R¯ù»Ï's\u0096#*X3j\u0001\u0093¢×þ\u0097þÑU\u008dñ\u0083½g!'\u0096\u009d¸¦ÜïÀ\u0016qÐ\u008a¤¦Q<`S´\u0081ë¸\"ºï\u0004õ\u009f²á?³ø\u0007.°\u0087ø+Nöé\u008f÷É\u0010\u0011©D\u009eWÅç=\r½¢ÂÆÃ\u0017;5\u001d\u009cq\u00844«v0/Ý3IÀ\u008ax³\u001f\u009f\u009e¥ÅzD_ü|\u001e\tå×\u0097\u0014éI\u008d\f\u0092iæ¾¶>Ø\u0013H\u0080ùp¡~\u008c\u009b§æG)Í®óÆëÅ\u0001\u009f½\u009a¶Ö\u0000RAs¡/ Ô²7\u0018îñ7)\n¸Z1xøåÏÔø#\u0000t(ñ%Ë\u0098)X\u0010\"Ù\u0087 \u0015Í\u000b9ùKnÙëîÑ7\u0018\u008aø£x,½\u008bæO9\"\u001dpð«~a\u009e\u000b\u0094Â0\u0094Â Ç¤¡waÖG\u0093Í\u0011J¤óùÖXSL\u0016Cù\u0085\u0006Á\nÔ£÷\u0014\u0094\u009c=\u0018àØ03\u0084à\u001cÇXB4òÅÂû©<\u0095Ü?\u0014\u0016c\b\u0018U\u000b¦ñ0£\u008e\u0098A\\;\u0011\u0088Ís\u001f\u008a üÇ©¥\nb`^\u0087p\u009cm\r±³\u001c\u0082*üým\u001cÛè\u0014£\u0089\u0010µmªO$\u007fÔ\u009eç\u0095ðË\u000f$ôlyOÁ\u0097Y·´éj.\u009dk\u009dá»4&¥O¢\u0092çï\u0017l~\u0099b\u0001½é\u0004£%ç*\u001cÅ®\u0080\u008dÕí]öfäÇA/ðy§SÞðöDó\u0090\u0081(¤Jq\\¹\u0087\u001cJ\u0004\u0082\u0003,ZÍzÓ\u000e\"\u000e3ìê.\u0013ýå\u0003(\u0097ÿ(§\u00834Hwþ*Õj\u001aü¹\u008eÖ\u0005þ\u008a[Fê\u0019.b@ð@a<\u0082å\u0096e}\u0017ó\u0082H\u0001ì_±{\u001d÷\u0092±ð\u0000ùÃ2RÏYU\u009eø\u0003M:(\u0004lw\u0092¿÷§À\u0003\u001c¨\fh:\u0083\u008d\u0081º¾G\u0005n\u0082\u000b\\©jØà\u009e\u008fÇ\u0094ÈN§aÀxªJ¢ù\u0005^\u0001f¹0\u0017 \u009d&ã;öVÁ\u0095m±È1Ç»®\u0014\u00ad,5\u009a§Ä\\QuÑýC\u00998(à ó,ó\u0004;\u0090í\u0088Q\u0089\u0088\u0093v}ûÑqî¡\u000eïÕ-à\u0097ògç\u0092|°ö \u0093Ë½é+?û\u009a\n\u009dôR\u008d\u0090S<=q\u0017|¿\u0013*\u008b\r*%=9µD¡ îw\fÚ\u008e:;âZÝñSÍSÑÛ?_ÒãörM ÁÞÅKºøvO\u008dñÆa\u0001ò¹Z$NÎÈ±,\u0018Zá\u0017Ý½M\u0088õj\b\u009d\r\u0088Á\fé]bJ\u001e·?}\b}ÂìüÄ\u000e\f\u0091ãæ\u0098gÇ¸Õ¼¹¨\u0003\r¾LéË\tô,ÜwÏ4\u0001\u0003Æ\u0096¯\u0017\u0081\u0016´öþ·UGöòH\u0006Óé\u0093\t\u0013\u000eK\"â.£\u009c\u00856Þ%\u0007eÜ½²ñ\u0093\u00163\u00ad(Øx\u0089Zh\u000fàÉ$\u0003\u008b\u001cÒ\u0010Ð(¾¦§îï:pdÎ\u0003W[¬«x\u0011{R«¨Æ\u0097O»>6ë´\u0084õ,,ø¤Ô\u001bo\u009bu@DÜÂXDÛ\u008dÈº\u00888\u000f\u001fU\u0083¤\u008aV\u0014\u0099\u008f\u0001ìÌ\u0012²sñÙw;{o\u0019\u008aZÿ©\u000f\u0091\u0087\u001cók\u000f\u0003ì\u0015¸×\u008cö¼\u0015ÇÞl%e[\u0084Ù\u0096ÒG\u0019\u0082~¢\u0003@»ÿÚU,4 í[ë²í\u009f\u0016ÿà{«Ïù¶\u009e»\u0092h\u0098º\u001aó9bd'b\u009arjD\u0083\u008fh»â8âi\u0089¬/!\u0097RÕ¿¬e«c¬[\u001e\u008d4Þ© \u0004\u001c½\u00006\u000e!Lï)\u0088J²Ü|ê\u000e\u0010<\u0012Pæº3=U\u008e» \u001c6+\u008b\u007f\u0090aÀ\u001c\u0011À\u0018øðò+\u0098å\u008e»/\u000bmÇ \u0085Ôäº6j¨\u000b{\u0018I<:$ò.ø®1Ð¦\u000fÝì#\u001auíµ°ö\rNå ¿\u0011\u0091\u0006\u0018w²Ø¬\u0091r\u000f\u00912æ¾kÇ\u001cK1¯þ\u0002\\=°È\u0093\u008eD\u00ad \u0011Q¾]H´\"±)ÌH2S\u0001üÅ7'A \u0090ErØ\b\u0006F\u008eØçÝ.Pji\u000bNð©ü¯pÜèªé·º·\u0001+ñÙ:I\u0017¬\u007f®ÖCg\u0005t\u0094XX\u0001\u0019ÞG\u0097Êñ\u00079G9xä\u009fÍúHñ\u0014BLBº}ä+ÜG¼\u0005Õ¶\u009co®\u0086(\u0093,G£®CQ\nOXk\u009a\u0098íªÁq\u0019%é\u008b\u009a£\u000eþ\u0002ÝÔ1NW\u0099ñ«Q\u0098¤äÒíÂÈM?¸!?$Ï\u0094ò\u009fÂÝ\u0012\r=Ö\u0004Ú\u009e \f¨ßj\u0098F#È&Í|\u000b¨\u001aÎì\u00920ðK,mé\n!;l`\u009c¡Jug\u0013=j";
      int var7 = "ûC\u0000\u001fù^±\u000f\u0096µÃ\u000e·FØ½5\u001býÝK\u001dç\u0081j®\u0080F4C\u008aX_Tkm´®Ít4\u0007\u0091\u0017\rSyü\u0017³_ßªç´\u0096¯\u0019bÖ#ý:\u0099\u0001£\u0096©\u009eW¥Ï\u0010×L\u0002¤\u000e\u0013hL[èea\u0000h\u0005è\u0018KÏ\u0010\u009c0&f\t*\u008eàz[ÄÈ\u0006]ÚBÜ÷\u0091GlhDîVW]±i¬\u0089ZÝ\u001e÷(X\u0013ÝCÖ\u0005EØ\u008chê#çFP\u008fy\u0080~A6\u00962\b\u000bÆ?uüz\u0099LQY`àä\u0092µ¨4ÇúðïK\u0004nCnoHfU\u0096\u009b°\u0087¨¼\u0088_\u009cí\u0017ú,\u0084´v}b§þIÎ\u001f\u0004\fÈð¡X¢ZôOû£\u0090 \u0082\u0019æ,H\u0099Û½\u0018\u0085pÅ;\u0093{ËK\u001c\u0083Ò×w\u0017\u0091ù.\u009efÿè\u0012~8<\u001cI]-\u009dä'\u0014§ä8ø\u0093°Õ»T¼\u0000m\u008a´\u000bÝÓ¬\b%v\u0099L%\\ÀpsÙ°>x°«Uf\u008dv\u0010\u0016\u0000à®»×ºÆ`¿¸ú¿m/üËÍ2ß±\u0000ñ¾±®p9*\u0014¹×c\u0007Mb\u000f/\u00adn\u009eÓ\u0013\u0081Ï9~ú9Ds\u0099ÁÕqñ2Î\u0016H\u008f\u0080\t¶\n\u0007TßT-@ê;)#%\u00120í+ñÚpO×]bq\"ÆÌ \u0094ÛÒíËw$\u0017õLK.ÏXãT\u007f ¹M=ÜèÂ\u0095\u0000y²O7\u0017vDÖ\u009e¦×ñwðN2t´\n\u0097iÆ\u007fBRN\u0089å¾D`\u009a~|\u00adGª\u0094\u009f3#\u0093¦`Ã\u0007z½¢6Ò!\u000e\u00963`\u00adö\u001c\u008a¸\u0098VÙ¦×µÉ\u0092#\u00adÑ\tHê\\\u0010~î\u0013'[É[\u008f\u008bbì~IRB\u009d0\u001cÞØ\u0013\u001a²\tEµØ0ê\u0000ù\u0010\u009c´ß\u0019&¢ý§~(Ùöð=e\u009a]d\n~²\u0080Ãj~É\u0092 8\u009aN÷\u00ad\u0010\u0092\u0084Ó\u0090U×\u0018ÌOóS\u0085¹ÙÆ\u00068\u0018*Pvbàz÷K4»$hùñ\u0092©ú[óßl\b\u001cQ×ûJ\u0084±J \"&\u0014X¦sÈ\u0095Ï®1_\u0081?zþ\u0016O0Y\u0000ô\\T 2,çµÔ\u0094ól\u00adµñÕÃpµþX\u0001\tA¹Ú´+Z¸¦)]H\u0017z\u0098V\\F\u0006W\u00881AÝ}\u0089¾\u000fiD;»}ax÷?¯\u008c7ù<º8\u0019÷O\u009e¼\u0015ª\u00adu \u009a¬xÑí\u0090\u0011(:àé!öÛtÿ&mU>yûÂ\u008dÔ\u0011þÜÞh J«_èÔþ×Ï[)a«G\f)a|]õænj\u000bV¬\u0013Û\u001feLâ\u009cK\u008b1s\u0089â0\u0006Jùl\u0092=f¬à\u0012÷\u001cÌá\u0003°ÝBC%ë\u0010té\u0096\u000eØ\u0004³Î\u0013\t ê¦\u0010³{àüI\u007f\u0081(\u0087LW\u0015\u0089\u0003\u000eÞß\u0011À\u0095\u00adR\u0015%>Ö\u0019\u0004 ï#R\u0004\rMAÏ\u000b3øàìÉ.ÉL\u0099\u001f ³ ÚhiâZËÍ\u0087º·ö¾\u0010Ï¹\u0086\ná=\u009892\\r{K¨Ëén \u001a~Q\u0016Ó2æô\u0015XÊ\u009c¹\u0095<Õ\u001e\u001aØòm¡ë\u009a?êþ?ñ0á Ő*óó)è\u000e@ÎE5Á<\u0090X\u0082d<GcºM\u0086gC\u0004\u007f2\u009c\u001c\u0081oûá¿ \u0081\u001e\u000bÜíA\u0010v«\u0005!ð\u0092ÍNy\u000fävñIC¢ý\u009fYwÛ9 Z¼3\u0085¤ÿ&GZq¼ÓÁ\u0002'ê§qûGZ\u0085\u0004 Þ\u001f^ÉÅ\u0014\u0011Ç\u0082Û\u001b\u0099~ó2È\u009c`e\u0090\u0003\u0001\u0088ów\f¸9Vì\u0010?)\u00ad~´\u007f\\¡x\u009dæ\u000b*§^\u009b±\u001bR\nBÌ¨Ù\rLî/\t\rÓj1ìA\u001eKðÿ³iÑ* \u0099,\u0095R¯ù»Ï's\u0096#*X3j\u0001\u0093¢×þ\u0097þÑU\u008dñ\u0083½g!'\u0096\u009d¸¦ÜïÀ\u0016qÐ\u008a¤¦Q<`S´\u0081ë¸\"ºï\u0004õ\u009f²á?³ø\u0007.°\u0087ø+Nöé\u008f÷É\u0010\u0011©D\u009eWÅç=\r½¢ÂÆÃ\u0017;5\u001d\u009cq\u00844«v0/Ý3IÀ\u008ax³\u001f\u009f\u009e¥ÅzD_ü|\u001e\tå×\u0097\u0014éI\u008d\f\u0092iæ¾¶>Ø\u0013H\u0080ùp¡~\u008c\u009b§æG)Í®óÆëÅ\u0001\u009f½\u009a¶Ö\u0000RAs¡/ Ô²7\u0018îñ7)\n¸Z1xøåÏÔø#\u0000t(ñ%Ë\u0098)X\u0010\"Ù\u0087 \u0015Í\u000b9ùKnÙëîÑ7\u0018\u008aø£x,½\u008bæO9\"\u001dpð«~a\u009e\u000b\u0094Â0\u0094Â Ç¤¡waÖG\u0093Í\u0011J¤óùÖXSL\u0016Cù\u0085\u0006Á\nÔ£÷\u0014\u0094\u009c=\u0018àØ03\u0084à\u001cÇXB4òÅÂû©<\u0095Ü?\u0014\u0016c\b\u0018U\u000b¦ñ0£\u008e\u0098A\\;\u0011\u0088Ís\u001f\u008a üÇ©¥\nb`^\u0087p\u009cm\r±³\u001c\u0082*üým\u001cÛè\u0014£\u0089\u0010µmªO$\u007fÔ\u009eç\u0095ðË\u000f$ôlyOÁ\u0097Y·´éj.\u009dk\u009dá»4&¥O¢\u0092çï\u0017l~\u0099b\u0001½é\u0004£%ç*\u001cÅ®\u0080\u008dÕí]öfäÇA/ðy§SÞðöDó\u0090\u0081(¤Jq\\¹\u0087\u001cJ\u0004\u0082\u0003,ZÍzÓ\u000e\"\u000e3ìê.\u0013ýå\u0003(\u0097ÿ(§\u00834Hwþ*Õj\u001aü¹\u008eÖ\u0005þ\u008a[Fê\u0019.b@ð@a<\u0082å\u0096e}\u0017ó\u0082H\u0001ì_±{\u001d÷\u0092±ð\u0000ùÃ2RÏYU\u009eø\u0003M:(\u0004lw\u0092¿÷§À\u0003\u001c¨\fh:\u0083\u008d\u0081º¾G\u0005n\u0082\u000b\\©jØà\u009e\u008fÇ\u0094ÈN§aÀxªJ¢ù\u0005^\u0001f¹0\u0017 \u009d&ã;öVÁ\u0095m±È1Ç»®\u0014\u00ad,5\u009a§Ä\\QuÑýC\u00998(à ó,ó\u0004;\u0090í\u0088Q\u0089\u0088\u0093v}ûÑqî¡\u000eïÕ-à\u0097ògç\u0092|°ö \u0093Ë½é+?û\u009a\n\u009dôR\u008d\u0090S<=q\u0017|¿\u0013*\u008b\r*%=9µD¡ îw\fÚ\u008e:;âZÝñSÍSÑÛ?_ÒãörM ÁÞÅKºøvO\u008dñÆa\u0001ò¹Z$NÎÈ±,\u0018Zá\u0017Ý½M\u0088õj\b\u009d\r\u0088Á\fé]bJ\u001e·?}\b}ÂìüÄ\u000e\f\u0091ãæ\u0098gÇ¸Õ¼¹¨\u0003\r¾LéË\tô,ÜwÏ4\u0001\u0003Æ\u0096¯\u0017\u0081\u0016´öþ·UGöòH\u0006Óé\u0093\t\u0013\u000eK\"â.£\u009c\u00856Þ%\u0007eÜ½²ñ\u0093\u00163\u00ad(Øx\u0089Zh\u000fàÉ$\u0003\u008b\u001cÒ\u0010Ð(¾¦§îï:pdÎ\u0003W[¬«x\u0011{R«¨Æ\u0097O»>6ë´\u0084õ,,ø¤Ô\u001bo\u009bu@DÜÂXDÛ\u008dÈº\u00888\u000f\u001fU\u0083¤\u008aV\u0014\u0099\u008f\u0001ìÌ\u0012²sñÙw;{o\u0019\u008aZÿ©\u000f\u0091\u0087\u001cók\u000f\u0003ì\u0015¸×\u008cö¼\u0015ÇÞl%e[\u0084Ù\u0096ÒG\u0019\u0082~¢\u0003@»ÿÚU,4 í[ë²í\u009f\u0016ÿà{«Ïù¶\u009e»\u0092h\u0098º\u001aó9bd'b\u009arjD\u0083\u008fh»â8âi\u0089¬/!\u0097RÕ¿¬e«c¬[\u001e\u008d4Þ© \u0004\u001c½\u00006\u000e!Lï)\u0088J²Ü|ê\u000e\u0010<\u0012Pæº3=U\u008e» \u001c6+\u008b\u007f\u0090aÀ\u001c\u0011À\u0018øðò+\u0098å\u008e»/\u000bmÇ \u0085Ôäº6j¨\u000b{\u0018I<:$ò.ø®1Ð¦\u000fÝì#\u001auíµ°ö\rNå ¿\u0011\u0091\u0006\u0018w²Ø¬\u0091r\u000f\u00912æ¾kÇ\u001cK1¯þ\u0002\\=°È\u0093\u008eD\u00ad \u0011Q¾]H´\"±)ÌH2S\u0001üÅ7'A \u0090ErØ\b\u0006F\u008eØçÝ.Pji\u000bNð©ü¯pÜèªé·º·\u0001+ñÙ:I\u0017¬\u007f®ÖCg\u0005t\u0094XX\u0001\u0019ÞG\u0097Êñ\u00079G9xä\u009fÍúHñ\u0014BLBº}ä+ÜG¼\u0005Õ¶\u009co®\u0086(\u0093,G£®CQ\nOXk\u009a\u0098íªÁq\u0019%é\u008b\u009a£\u000eþ\u0002ÝÔ1NW\u0099ñ«Q\u0098¤äÒíÂÈM?¸!?$Ï\u0094ò\u009fÂÝ\u0012\r=Ö\u0004Ú\u009e \f¨ßj\u0098F#È&Í|\u000b¨\u001aÎì\u00920ðK,mé\n!;l`\u009c¡Jug\u0013=j"
         .length();
      char var8 = 'H';
      int var34 = -1;

      label73:
      while (true) {
         String var37 = var6.substring(++var34, var34 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var37.getBytes("ISO-8859-1"));
            String var51 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var51;
                  if ((var34 += var8) >= var7) {
                     CONST_HB = var4;
                     CONST_IB = new String[40];
                     Cipher var11;
                     Cipher var39 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var39.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[2];
                     int var14 = 0;
                     String var15 = "\u0091\f_\u0016\u0082\u0019\u0016ï³)Yµzå¶2";
                     int var16 = "\u0091\f_\u0016\u0082\u0019\u0016ï³)Yµzå¶2".length();
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
                        byte var59 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_P = (int)var13[1];
                     CONST_O = (int)var13[0];
                     CONST_MB = new HashMap(13);
                     Cipher var22;
                     Cipher var40 = var22 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var23 = 1; var23 < 8; var23++) {
                        var10003[var23] = (byte)(var0 << var23 * 8 >>> 56);
                     }

                     var40.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var24 = new long[5];
                     int var25 = 0;
                     String var26 = "gÜ\u0084ÀÁ°²BÍuä9Áóü\u0096G\u009dKßWUk«";
                     int var27 = "gÜ\u0084ÀÁ°²BÍuä9Áóü\u0096G\u009dKßWUk«".length();
                     byte var28 = 0;

                     label44:
                     while (true) {
                        int var47 = var28;
                        var28 += 8;
                        byte[] var29 = var26.substring(var47, var28).getBytes("ISO-8859-1");
                        long[] var41 = var24;
                        var47 = var25++;
                        long var56 = (var29[0] & 255L) << 56
                           | (var29[1] & 255L) << 48
                           | (var29[2] & 255L) << 40
                           | (var29[3] & 255L) << 32
                           | (var29[4] & 255L) << 24
                           | (var29[5] & 255L) << 16
                           | (var29[6] & 255L) << 8
                           | var29[7] & 255L;
                        byte var61 = -1;

                        while (true) {
                           long var30 = var56;
                           byte[] var32 = var22.doFinal(
                              new byte[]{
                                 (byte)(var30 >>> 56),
                                 (byte)(var30 >>> 48),
                                 (byte)(var30 >>> 40),
                                 (byte)(var30 >>> 32),
                                 (byte)(var30 >>> 24),
                                 (byte)(var30 >>> 16),
                                 (byte)(var30 >>> 8),
                                 (byte)var30
                              }
                           );
                           long var64 = (var32[0] & 255L) << 56
                              | (var32[1] & 255L) << 48
                              | (var32[2] & 255L) << 40
                              | (var32[3] & 255L) << 32
                              | (var32[4] & 255L) << 24
                              | (var32[5] & 255L) << 16
                              | (var32[6] & 255L) << 8
                              | var32[7] & 255L;
                           switch (var61) {
                              case 0:
                                 var41[var47] = var64;
                                 if (var28 >= var27) {
                                    CONST_KB = var24;
                                    CONST_LB = new Long[5];
                                    CONST_N = new Random();
                                    return;
                                 }
                                 break;
                              default:
                                 var41[var47] = var64;
                                 if (var28 < var27) {
                                    continue label44;
                                 }

                                 var26 = "ó2\nIÇ\u009eÉ®\u0002q6à\u0099\u0001rÐ";
                                 var27 = "ó2\nIÇ\u009eÉ®\u0002q6à\u0099\u0001rÐ".length();
                                 var28 = 0;
                           }

                           byte var49 = var28;
                           var28 += 8;
                           var29 = var26.substring(var49, var28).getBytes("ISO-8859-1");
                           var41 = var24;
                           var47 = var25++;
                           var56 = (var29[0] & 255L) << 56
                              | (var29[1] & 255L) << 48
                              | (var29[2] & 255L) << 40
                              | (var29[3] & 255L) << 32
                              | (var29[4] & 255L) << 24
                              | (var29[5] & 255L) << 16
                              | (var29[6] & 255L) << 8
                              | var29[7] & 255L;
                           var61 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var34);
                  break;
               default:
                  var4[var5++] = var51;
                  if ((var34 += var8) < var7) {
                     var8 = var6.charAt(var34);
                     continue label73;
                  }

                  var6 = "do\u0000/ýõ¡´\u0084ë>XÔ\u0017Õ3\u0080á¶\täÜeà5[³÷\u0012\r\u0011\\\u0011ØªDÙ\u008e$t\u0004@ãyxÎ@T²r$ó\t\u009a{W\u00ad¡Tw\u0087+àè\u008bWìaë\u0093\u007f«ë2ýA\u0003\u0093\u008fA\u0082iÏ\u0010\u0088XHýn«HuPOb]\u0015É\u0095bDO¹\u0091`^½ªïÔhn\u0018LÚEÿs%\u001f\u001b&DÎ>,\u0083É,sÙêÉ rü¥\u000eì÷>\u0081××\u0003";
                  var7 = "do\u0000/ýõ¡´\u0084ë>XÔ\u0017Õ3\u0080á¶\täÜeà5[³÷\u0012\r\u0011\\\u0011ØªDÙ\u008e$t\u0004@ãyxÎ@T²r$ó\t\u009a{W\u00ad¡Tw\u0087+àè\u008bWìaë\u0093\u007f«ë2ýA\u0003\u0093\u008fA\u0082iÏ\u0010\u0088XHýn«HuPOb]\u0015É\u0095bDO¹\u0091`^½ªïÔhn\u0018LÚEÿs%\u001f\u001b&DÎ>,\u0083É,sÙêÉ rü¥\u000eì÷>\u0081××\u0003"
                     .length();
                  var8 = 16;
                  var34 = -1;
            }

            var37 = var6.substring(++var34, var34 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(int[] var0) {
      arr_aj = var0;
   }

   public static int[] getStateArray() {
      return arr_aj;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6843;
      if (CONST_IB[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_JB.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_JB.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/df", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_HB[var3].getBytes("ISO-8859-1");
         CONST_IB[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_IB[var3];
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
         throw new RuntimeException("rip/breeze/client/df" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25277;
      if (CONST_LB[var3] == null) {
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
         long var5 = CONST_KB[var3];
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
         Object[] var9 = (Object[])CONST_MB.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_MB.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/df", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_LB[var3] = var14;
      }

      return CONST_LB[var3];
   }

   private static long getLong(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = decrypt(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getLong".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/df" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
