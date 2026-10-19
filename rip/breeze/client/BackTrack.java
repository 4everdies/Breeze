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
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.network.play.server.S13PacketDestroyEntities;
import net.minecraft.network.play.server.S14PacketEntity;
import net.minecraft.network.play.server.S18PacketEntityTeleport;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import net.minecraft.network.play.server.S29PacketSoundEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import org.lwjgl.opengl.GL11;
import rip.breeze.BreezeModule;
import rip.breeze.ConditionsSetting;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.MathUtil1;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "BackTrack", b = "Spoofs having a bad internet connection to get more hits on your enemies.", d = rip.breeze.ModuleCategory.COMBAT)
public class BackTrack extends BreezeModule implements IBreezeInterface3 {
   private final GenericSetting<EnumType29> modeSetting;
   private final GenericSetting<rip.breeze.RangeValue> latencySetting;
   private final GenericSetting<Boolean> renderSetting;
   private final GenericSetting<rip.breeze.BreezeColor> colorSetting;
   private final ConditionsSetting rangeSetting;
   private final GenericSetting<Double> swordOnlySetting;
   private final GenericSetting<Boolean> dataBuilder54_t;
   private CopyOnWriteArrayList<NetworkException> copyOnWriteArrayList_u;
   private EntityOtherPlayerMP entityOtherPlayerMP_v;
   private VecUtil2 clientUtil107_w;
   private int fieldInt_x;
   private final Random random_y;
   private long fieldLong_z;
   private long fieldLong_A;
   private long fieldLong_B;
   private static int fieldInt_C;
   private static final String[] CONST_E;
   private static final String[] CONST_F;
   private static final Map CONST_G = new HashMap(13);
   private static final long eka_1;

   public BackTrack() {
      long var1 = 18436804827815L;
      super();
      short var10002 = 2373;
      long var10003 = 6028749740414174690L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Mode");
      var10002 = 19436;
      var10003 = 988046943757387586L ^ var1;
      this.modeSetting = var10001.getDataBuilder50_3(
            "The mode to use for backtracking. \n\tSimple: Allows you to attack enemies in their previous positions without any further checks. \n\tHitSync: Allows you to attack enemies in their previous positions and emulates lag. Uses server-side i-frame estimation to only flush attacks when the server will accept them. \n\tSemi: Simulates lag but only for inbound packets, bypasses well on most servers."
         )
         .getDataBuilder50_4(EnumType29.SIMPLE)
         .getDataBuilder54();
      var10002 = 11678;
      var10003 = 6291111608130380081L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Latency");
      var10002 = 24181;
      var10003 = 4835971613130511065L ^ var1;
      this.latencySetting = var10001.getDataBuilder50_3("The amount of time to keep old positions for in milliseconds.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(50.0, 10.0))
         .clamp(rip.breeze.RangeValue.getPredicate(0.0, 500.0, 5.0))
         .getDataBuilder54();
      var10002 = 23145;
      var10003 = 6847179511105214157L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Render");
      var10002 = 29025;
      var10003 = 5861972938143104450L ^ var1;
      this.renderSetting = var10001.getDataBuilder50_3("Renders the backtrack positions.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 3094;
      var10003 = 3085208337623187621L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Color");
      var10002 = 2145;
      var10003 = 2230611186128323795L ^ var1;
      this.colorSetting = var10001.getDataBuilder50_3("The color to render the backtrack positions with.")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(255, 125, 12, 180))
         .getDataBuilder50_8()
         .getDataBuilder50_9(BackTrack::lambda$new_Inner0)
         .getDataBuilder54();
      short var10004 = 15511;
      long var10005 = 2372964950045634623L ^ var1;
      this.rangeSetting = new ConditionsSetting(this, "Range");
      var10002 = 18011;
      var10003 = 6885881734771002105L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.rangeSetting, "The range to backtrack to.");
      var10002 = 2587;
      var10003 = 1055414018927560369L ^ var1;
      this.swordOnlySetting = var10001.getDataBuilder50_3("SwordOnly")
         .getDataBuilder50_4(10.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(3.0, 20.0))
         .getDataBuilder54();
      var10002 = 5315;
      var10003 = 829519825081669733L ^ var1;
      this.dataBuilder54_t = GenericSetting.<Boolean>getDataBuilder50(this.rangeSetting, "Only back track when holding a sword.")
         .getDataBuilder50_3("Only back track when holding a sword.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      this.copyOnWriteArrayList_u = new CopyOnWriteArrayList<>();
      this.random_y = new Random();
      BreezeClient.getConfigManager().update_1(this, 0);
   }

   @Override
   public String getString() {
      long var1 = 94639785842642L;
      switch (Util116.CONST_A[this.modeSetting.getObject_m().ordinal()]) {
         case 1:
            return "Simple";
         case 2:
            return "HitSync";
         case 3:
            return "Semi";
         default:
            return "Unknown";
      }
   }

   public void update() {
      this.entityOtherPlayerMP_v = null;
      this.clientUtil107_w = null;
      this.copyOnWriteArrayList_u.clear();
      this.fieldLong_A = 0L;
      this.fieldLong_B = 0L;
   }

   private int clamp() {
      long var1 = 89811189753530L;
      if (this.fieldLong_B == 0L) {
         return 0;
      }

      long var3 = System.currentTimeMillis() - this.fieldLong_B;
      int var5 = (int)(var3 / 50L);
      return Math.max(0, 20 - var5);
   }

   private boolean isValid() {
      long var1 = 85503834590052L;
      return this.clamp() <= 10;
   }

   private int calculate() {
      long var1 = 43513123534290L;
      int var3 = BreezeClient.getConfigManager().getDataBuilder31_j().getValue();
      return (var3 > 0 ? var3 : 100) / 2;
   }

   private void calculate_2() {
      long var1 = 129722417580665L;
      if (this.entityOtherPlayerMP_v != null && !this.copyOnWriteArrayList_u.isEmpty()) {
         NetworkException var3 = this.copyOnWriteArrayList_u.get(this.copyOnWriteArrayList_u.size() - 1);
         this.entityOtherPlayerMP_v
            .setPositionAndRotation2(var3.vec3_c.xCoord, var3.vec3_c.yCoord, var3.vec3_c.zCoord, var3.fieldFloat_d, var3.fieldFloat_e, 3, var3.fieldBool_g);
         this.entityOtherPlayerMP_v.onGround = var3.fieldBool_f;
      }

      this.entityOtherPlayerMP_v = null;
      this.clientUtil107_w = null;
      this.copyOnWriteArrayList_u.clear();
      this.fieldLong_A = 0L;
      this.fieldLong_B = 0L;
   }

   @EventListener
   public void updateRotation(PreTickEventEvent var1) {
      long var2 = 60125101118377L;
      if (!BreezeClient.isValid()
         && (
            !this.dataBuilder54_t.getObject_m()
               || BreezeClient.CONST_A.thePlayer.getHeldItem() != null && BreezeClient.CONST_A.thePlayer.getHeldItem().getItem() instanceof ItemSword
         )) {
         int var4 = (int)(this.latencySetting.getObject_m().double_c - this.latencySetting.getObject_m().double_d);
         this.fieldInt_x = (int)MathUtil1.clamp_3(
            this.fieldInt_x + var4 * this.random_y.nextGaussian() * 0.1F, this.latencySetting.getObject_m().double_d, this.latencySetting.getObject_m().double_c
         );
         EntityOtherPlayerMP var5 = BreezeClient.getThemeManager().getEntity() instanceof EntityOtherPlayerMP
            ? (EntityOtherPlayerMP)BreezeClient.getThemeManager().getEntity()
            : null;
         if (this.entityOtherPlayerMP_v != null
            && (
               this.entityOtherPlayerMP_v.isDead
                  || !AntiBot.isInvisible_3(this.entityOtherPlayerMP_v)
                  || BreezeClient.CONST_A.thePlayer.getDistanceToEntity(this.entityOtherPlayerMP_v) > this.swordOnlySetting.getObject_m()
                  || var5 != null && var5 != this.entityOtherPlayerMP_v
            )) {
            this.calculate_2();
         }

         if (this.entityOtherPlayerMP_v == null
            && var5 != null
            && !var5.isDead
            && AntiBot.isInvisible_3(var5)
            && BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var5) < this.swordOnlySetting.getObject_m()) {
            this.entityOtherPlayerMP_v = var5;
         }

         if (this.entityOtherPlayerMP_v != null) {
            if (this.clientUtil107_w == null) {
               this.clientUtil107_w = new VecUtil2(
                  this.entityOtherPlayerMP_v.getPositionVector(),
                  new Vec3(
                     MinecraftAccessor.getDouble_3(this.entityOtherPlayerMP_v),
                     MinecraftAccessor.getDouble(this.entityOtherPlayerMP_v),
                     MinecraftAccessor.getDouble_6(this.entityOtherPlayerMP_v)
                  ),
                  new Vec3(this.entityOtherPlayerMP_v.prevPosX, this.entityOtherPlayerMP_v.prevPosY, this.entityOtherPlayerMP_v.prevPosZ),
                  MinecraftAccessor.getValue_5(this.entityOtherPlayerMP_v)
               );
            }

            this.clientUtil107_w.calculate();
         }
      } else {
         this.entityOtherPlayerMP_v = null;
         this.clientUtil107_w = null;
         this.copyOnWriteArrayList_u.clear();
         this.fieldLong_A = 0L;
         this.fieldLong_B = 0L;
      }
   }

   @EventListener
   public void calculate_3(ScriptUpdateEvent var1) {
      long var2 = 76553610694454L;
      if (this.entityOtherPlayerMP_v != null && this.clientUtil107_w != null && this.renderSetting.getObject_m()) {
         GlStateManager.disableLighting();
         float var4 = (float)(
            this.clientUtil107_w.vec3_c.xCoord
               + (this.clientUtil107_w.vec3_b.xCoord - this.clientUtil107_w.vec3_c.xCoord)
                  * MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks
         );
         float var5 = (float)(
            this.clientUtil107_w.vec3_c.yCoord
               + (this.clientUtil107_w.vec3_b.yCoord - this.clientUtil107_w.vec3_c.yCoord)
                  * MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks
         );
         float var6 = (float)(
            this.clientUtil107_w.vec3_c.zCoord
               + (this.clientUtil107_w.vec3_b.zCoord - this.clientUtil107_w.vec3_c.zCoord)
                  * MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks
         );
         float var7 = this.entityOtherPlayerMP_v.width / 2.0F;
         float var8 = this.entityOtherPlayerMP_v.height;
         AxisAlignedBB var9 = new AxisAlignedBB(var4 - var7, var5 + 0.01, var6 - var7, var4 + var7, var5 + var8, var6 + var7);
         RenderUtil31.calculate_2(var9, this.colorSetting.getObject_m(), true);
         RenderUtil31.getHitbox_4(var9, this.colorSetting.getObject_m(), 1.0F, true);
         GL11.glColor3f(1.0F, 1.0F, 1.0F);
      }
   }

   public void updateRotation_2(ArrayList<DelayedPacket> var1) {
      long var2 = 131090423664411L;
      int[] var4 = AimAssist.getStateArray();
      if (!this.copyOnWriteArrayList_u.isEmpty() && this.entityOtherPlayerMP_v != null && this.f() && !BreezeClient.isValid()) {
         this.calculate_4(false, System.currentTimeMillis(), var1);
         double var5 = BreezeClient.CONST_A
            .thePlayer
            .getDistance(
               MinecraftAccessor.getDouble_3(this.entityOtherPlayerMP_v),
               MinecraftAccessor.getDouble(this.entityOtherPlayerMP_v),
               MinecraftAccessor.getDouble_6(this.entityOtherPlayerMP_v)
            );
         long var7 = 0L;
         if (this.modeSetting.isValid(EnumType29.HIT_SYNC)) {
            float var9 = this.entityOtherPlayerMP_v.getDistanceToEntity(BreezeClient.CONST_A.thePlayer);
            float var10 = (float)this.entityOtherPlayerMP_v
               .getDistance(
                  BreezeClient.CONST_A.thePlayer.posX + BreezeClient.CONST_A.thePlayer.motionX,
                  BreezeClient.CONST_A.thePlayer.posY,
                  BreezeClient.CONST_A.thePlayer.posZ + BreezeClient.CONST_A.thePlayer.motionZ
               );
            if (var10 > var9 && var5 < var9 && this.isValid()) {
               this.calculate_4(true, System.currentTimeMillis(), var1);
               if (!this.copyOnWriteArrayList_u.isEmpty()) {
                  NetworkException var19 = this.copyOnWriteArrayList_u.get(this.copyOnWriteArrayList_u.size() - 1);
                  this.entityOtherPlayerMP_v
                     .setPositionAndRotation2(var19.vec3_c.xCoord, var19.vec3_c.yCoord, var19.vec3_c.zCoord, var19.fieldFloat_d, var19.fieldFloat_e, 3, var19.fieldBool_g);
                  this.entityOtherPlayerMP_v.onGround = var19.fieldBool_f;
               }

               this.copyOnWriteArrayList_u.clear();
               return;
            }

            if (this.isValid()) {
               for (DelayedPacket var12 : var1) {
                  if (var12.packet_g instanceof C02PacketUseEntity) {
                     C02PacketUseEntity var13 = (C02PacketUseEntity)var12.packet_g;
                     if (var13.getEntityFromWorld(BreezeClient.CONST_A.theWorld) == this.entityOtherPlayerMP_v) {
                        var7 = var12.fieldLong_h;
                        if (var4 != null) {
                           break;
                        }
                     }
                  }

                  if (var4 == null) {
                     break;
                  }
               }
            }
         }

         NetworkException var14 = null;

         for (NetworkException var17 : this.copyOnWriteArrayList_u) {
            float var20 = (float)BreezeClient.CONST_A.thePlayer.getDistance(var17.vec3_c.xCoord, var17.vec3_c.yCoord, var17.vec3_c.zCoord);
            if (System.currentTimeMillis() > var17.fieldLong_a + this.fieldInt_x || var7 >= var17.fieldLong_a) {
               var14 = var17;
            }

            if (var20 < var5 || var20 < 2.8) {
               var5 = var20;
               var14 = var17;
            }

            if (var4 == null) {
               break;
            }
         }

         if (var14 != null) {
            ArrayList var16 = new ArrayList();
            var16.add(var14);

            for (NetworkException var21 : this.copyOnWriteArrayList_u) {
               if (var21.fieldLong_a < var14.fieldLong_a) {
                  var16.add(var21);
               }

               if (var4 == null) {
                  break;
               }
            }

            this.copyOnWriteArrayList_u.removeAll(var16);
            this.calculate_4(false, var14.fieldLong_a + this.fieldInt_x, var1);
            this.entityOtherPlayerMP_v
               .setPositionAndRotation2(var14.vec3_c.xCoord, var14.vec3_c.yCoord, var14.vec3_c.zCoord, var14.fieldFloat_d, var14.fieldFloat_e, 3, var14.fieldBool_g);
            this.entityOtherPlayerMP_v.onGround = var14.fieldBool_f;
         }
      } else {
         this.calculate_4(true, System.currentTimeMillis(), var1);
      }
   }

   @EventListener
   public void sendPacket(PacketSendEventEvent var1) {
      long var2 = 30311864678871L;
      if (var1.getPacket_h() instanceof C02PacketUseEntity) {
         C02PacketUseEntity var4 = var1.getPacket_h();
         if (var4.getEntityFromWorld(BreezeClient.CONST_A.theWorld) == this.entityOtherPlayerMP_v) {
            this.fieldLong_z = System.currentTimeMillis();
         }
      }
   }

   private synchronized void calculate_4(boolean var1, long var2, ArrayList<DelayedPacket> var4) {
      long var5 = 60650120960448L;
      int[] var7 = AimAssist.getStateArray();
      if (!var4.isEmpty()) {
         for (DelayedPacket var9 : var4) {
            if (!var1 && var2 < var9.fieldLong_h + this.fieldInt_x) {
               break;
            }

            var9.update(this);
            if (var7 == null) {
               break;
            }
         }
      }
   }

   public EnumType27 getEnum_PROCESS(Packet<?> var1, boolean var2) {
      long var3 = 29844293304432L;
      if (BreezeClient.isValid() || !this.f() || this.modeSetting.isValid(EnumType29.SIMPLE)) {
         BreezeClient.getConfigManager().processAll(this);
         return EnumType27.PROCESS;
      } else if (this.modeSetting.isValid(EnumType29.SEMI)) {
         return EnumType27.PROCESS;
      } else {
         return BreezeClient.getConfigManager().getArrayList(this).isEmpty() && this.copyOnWriteArrayList_u.isEmpty() ? EnumType27.PROCESS : EnumType27.DELAY;
      }
   }

   public EnumType27 absValue(Packet<?> var1, boolean var2) {
      long var3 = 100277995698129L;
      int[] var5 = AimAssist.getStateArray();
      boolean var6 = BreezeClient.getConfigManager().getArrayList(this).isEmpty() && this.copyOnWriteArrayList_u.isEmpty();
      if (BreezeClient.isValid() || !this.f()) {
         BreezeClient.getConfigManager().processAll(this);
         return EnumType27.PROCESS;
      }

      if (var1 instanceof S02PacketChat || var1 instanceof S29PacketSoundEffect) {
         return EnumType27.PROCESS;
      }

      if (var1 instanceof S19PacketEntityStatus) {
         S19PacketEntityStatus var23 = (S19PacketEntityStatus)var1;
         Entity var26 = var23.getEntity(BreezeClient.CONST_A.theWorld);
         if (var26 != null && var26 == this.entityOtherPlayerMP_v && var23.getOpCode() == 2) {
            this.fieldLong_A = System.currentTimeMillis();
            this.fieldLong_B = this.fieldLong_z + this.calculate();
         }

         return EnumType27.PROCESS;
      } else {
         if (var1 instanceof S13PacketDestroyEntities) {
            S13PacketDestroyEntities var7 = (S13PacketDestroyEntities)var1;

            for (int var11 : var7.getEntityIDs()) {
               if (this.entityOtherPlayerMP_v != null && this.entityOtherPlayerMP_v.getEntityId() == var11) {
                  this.calculate_2();
                  if (var5 != null) {
                     break;
                  }
               }

               if (var5 == null) {
                  break;
               }
            }
         }

         if (this.entityOtherPlayerMP_v == null) {
            return !var6 && !this.modeSetting.isValid(EnumType29.SIMPLE) ? EnumType27.DELAY : EnumType27.PROCESS;
         }

         if (var2) {
            return EnumType27.PROCESS;
         }

         if (var1 instanceof S14PacketEntity) {
            S14PacketEntity var22 = (S14PacketEntity)var1;
            Entity var25 = var22.getEntity(BreezeClient.CONST_A.theWorld);
            if (var25 != null && var25 == this.entityOtherPlayerMP_v) {
               int var28 = var22.func_149062_c() + var25.serverPosX;
               int var30 = var22.func_149061_d() + var25.serverPosY;
               int var32 = var22.func_149064_e() + var25.serverPosZ;
               double var33 = var28 / 32.0;
               double var34 = var30 / 32.0;
               double var35 = var32 / 32.0;
               float var36 = var25.rotationYaw;
               float var37 = var25.rotationPitch;
               if (var22.func_149060_h()) {
                  var36 = var22.func_149066_f() * 360 / 256.0F;
                  var37 = var22.func_149063_g() * 360 / 256.0F;
               }

               boolean var20 = var22.getOnGround();
               return this.calculateAngles(var25, (float)var33, (float)var34, (float)var35, var28, var30, var32, var36, var37, var20, false, var6)
                  ? EnumType27.CANCEL
                  : EnumType27.PROCESS;
            } else {
               return !var6 && !this.modeSetting.isValid(EnumType29.SIMPLE) ? EnumType27.DELAY : EnumType27.PROCESS;
            }
         } else if (var1 instanceof S18PacketEntityTeleport) {
            S18PacketEntityTeleport var21 = (S18PacketEntityTeleport)var1;
            Entity var24 = BreezeClient.CONST_A.theWorld.getEntityByID(var21.getEntityId());
            if (var24 != null && var24 == this.entityOtherPlayerMP_v) {
               int var27 = var21.getX();
               int var29 = var21.getY();
               int var31 = var21.getZ();
               double var12 = var27 / 32.0;
               double var14 = var29 / 32.0;
               double var16 = var31 / 32.0;
               float var18 = var21.getYaw() * 360 / 256.0F;
               float var19 = var21.getPitch() * 360 / 256.0F;
               if (!(Math.abs(var24.serverPosX / 32.0F - var12) >= 0.03125)
                  && !(Math.abs(var24.serverPosY / 32.0F - var14) >= 0.015625)
                  && !(Math.abs(var24.serverPosZ / 32.0F - var16) >= 0.03125)) {
                  var12 = var24.serverPosX / 32.0F;
                  var14 = var24.serverPosY / 32.0F;
                  var16 = var24.serverPosZ / 32.0F;
               }

               return this.calculateAngles(var24, (float)var12, (float)var14, (float)var16, var27, var29, var31, var18, var19, var24.onGround, true, var6)
                  ? EnumType27.CANCEL
                  : EnumType27.PROCESS;
            } else {
               return !var6 && !this.modeSetting.isValid(EnumType29.SIMPLE) ? EnumType27.DELAY : EnumType27.PROCESS;
            }
         } else {
            return !var6 && !this.modeSetting.isValid(EnumType29.SIMPLE) ? EnumType27.DELAY : EnumType27.PROCESS;
         }
      }
   }

   private boolean calculateAngles(
      Entity var1, float var2, float var3, float var4, int var5, int var6, int var7, float var8, float var9, boolean var10, boolean var11, boolean var12
   ) {
      long var13 = 51387502996201L;
      if (var12) {
         double var15 = BreezeClient.CONST_A.thePlayer.getDistance(var5 / 32.0, var6 / 32.0, var7 / 32.0);
         if (var15 < 3.0
            || var15
               < BreezeClient.CONST_A
                  .thePlayer
                  .getDistance(
                     MinecraftAccessor.getDouble_3(this.entityOtherPlayerMP_v),
                     MinecraftAccessor.getDouble(this.entityOtherPlayerMP_v),
                     MinecraftAccessor.getDouble_6(this.entityOtherPlayerMP_v)
                  )) {
            this.clientUtil107_w.update(var2, var3, var4, false);
            return false;
         }
      }

      this.copyOnWriteArrayList_u.add(new NetworkException(new Vec3i(var5, var6, var7), System.currentTimeMillis(), var8, var9, var10, var11));
      this.clientUtil107_w.update(var2, var3, var4, true);
      var1.serverPosX = var5;
      var1.serverPosY = var6;
      var1.serverPosZ = var7;
      return true;
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 69895537488643L;
      return var0.getObject("render", Boolean.class);
   }

   public static void initialize(int var0) {
      fieldInt_C = var0;
   }

   public static int getValue() {
      return fieldInt_C;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 111 : 0;
   }

   static {
      initialize(95);
      long var0 = 113876261361152L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[18];
      int var5 = 0;
      String var6 = "[FD\u00902±\u0004\u0080[Ñn<883C@}õn\u0096\f4ãx\u0001³]\u001döñ}K2T5ÿ\u0017y:¿æD\u0002ú0òÎT®ÞÔü{¶\u0085\u0000ú³8·5¤CÂG\u008dìZ\u001fÞ\u0081.@ù\u0083\u0087³?\u001di\u0010\u0015×Cd\u0016o»ä\u009d·òTÅ4zÎ\u0010Æ\u00843¢\u0015\u0011¨P¥æÆ§\u0002ÓÊç DÛÛ?¾\u008frrü<wÍ\u0092ÍïAÃCà>C¶,àø\u001e{>¶º\u0096¢\u0010\u008d\u001aS\u0004ÆÝIÆ>Cj%X\u0003Ïþ\u0010?\u0085ó<´´PÍ3\u0012\u008fBÈ¯Õ%\u0010\u008aàr\u000fÿìFZ¤\u008c\u0004\u008aWU«æ8v¯t¡þOn\u0089í,f\\â\u0095§\u0085Ô1Ü\u0017?«9\"ÑâÞÆ\u008e(ðÇrÙál@WNlÓæ¹\u0096¸ï6)0¹f\rÛo?\"@\u0094+«X\u0012þ²\u000e\u0000ÝÖ\u0090è\u0083E$\u00adîu\u001fN\u0099J\u0016~-h:ïØ\u0002Ë§\fÉ\u0013\b\u0016P]ý}³\u001aeZYO¡æ`=\u0019w\u0013BX\u0083:mTõ.\u0015 \u0083aõ§gè\u008a¬\u008e«ï±¬\u00ad÷:-õGT¨åu\u008bQe\u008c¸3#\u0012Û\u0010Ìo£\u0093 /â\u0012v\u008aàßõ·\b1ɐHU\u0097>åÝ\u0084Äþ\u0089f=?\"ï0ÅªwäÆÊ\u0096£\u0096MTf\u00972¡ÚQ_\u001bBÞ\t¦{¾\u0089\u008aD\u001bV\u0084Ñ=:\u0084Á\u0094ïñÂ\u0011\u0000Ø£g·áXJ\u0085l\u0083G braK2Î3\u0098\u0087!\u0098\u0004\u0002æI¨K0®+}º{<\u009fMõ\u009c\\;1fºù¯O8Üá\u0016\u0000\u000eÙºþ'-\u001f\u008eã\r\u0098M>þöÓ\u0082ÖQ9Û\u0088\u0007\u0098§\u0013|\u0083*\u0089q\u0091ð¨\u008b\u00045|Þ'\u001dT×]\u0098ãÒ×\u0093â\u0086¸]ãÈ\u001b\u0012Õ\u0002mpcªSL»\u001b/\u0096w\u001f\u0082>\u0087ä\u0091¡Nú\u0000Ø`j¾\u001fQÏÛÅû[Oµ¤Ð\u009d\u0086O\u001c\u0000/¼òä\u0089Ãlj\u008a\t\u0002ç@S!\u0015\u0016ê\u0000Ë·Jy\u008dÕ¦\"§3\u0013p¾\u0017¡4Pòóm¡\u0091\u0016\u001c e\u001dðtAS\u0081_\"ýIV~õ\u0010\u009c8\u008eåÉ\u008csB§\r\u0082]6C\u0087F\u000eAîéã\u008b9\u008co\u0098Z\u0098q~=\u0085|\u007fÞGÐ£ñµ4Hu\u008f\u00195êí(D/ìeÎä8ä·\u00adç¯QÖhIÒA©ð\u0007P\u008d\u008bý×Ô¼Øñ\u009c8\u0097I\n\u0005à\u000f^BÒxÍÝø?ë8\u0091ê²ÃÎP:\u0004ûr¯í6@\u009f\u001b\u0082ÀN\u009fñòÇ\u009dLà£\f°p-âº?t\\\u0012@ûv>A¢K§\u0097\u0085DÄä\u001fÏ¾xµ\u0002Àåÿf\u000e\u0016¬Ë\u009c\u001c\u009aVªÜ\u001fz,c\u008f\u0088íú¥?²é\u0011\u0080Æ\u0081^ÔyvUýÉ\u0084T\u0090&\u001a¾E¸¬sø±\u009cwÐt\u008f±p<µ¹l\u009eã¤ä²\u0097'öæÔ58\u0098k\u0019UYúÞË·\u0095i§\u0018»X\u0005c*£Í0\u000b\u0015\u0011Dz\u001c>kkWÿ÷7\u000fXH\"!\u001cAÀh\u0005dò¥R\u007få»\u008dè()(ëWc\u0085mØ\u0093\u0092ºen\u0083¤Z\u000e\u0099eû\u001eÀ\u00adß\u008e-øxlËH\u0011ðY,r¨ü¿Ø#c:\u0010\u0005Ý-\u000eÉh¼}Óü\u0006;åuk'`\u0013M\tÿ¶È3ÛþÍ<ã¯I;°·²6&ø\u0083£téþa\u009b{!;ãe\u0001\u008a?]S*\u0093\u009dØ}Âû[º\u008e\u0018ÑT ]¿+y\u0080\u008dµ\u009c\u009c\u000eoµÛ£\u0099\u008føÉD'p\u0084Ù§\u0087BÞ\u009f_.Î\u008bÜ¬²\u00855ÀJ\u008b\u0099ª\u0010'\u0010é\u0019Ý\u008a\u008cwcZH\u00adÑ\u0092l9ÝK";
      int var7 = "[FD\u00902±\u0004\u0080[Ñn<883C@}õn\u0096\f4ãx\u0001³]\u001döñ}K2T5ÿ\u0017y:¿æD\u0002ú0òÎT®ÞÔü{¶\u0085\u0000ú³8·5¤CÂG\u008dìZ\u001fÞ\u0081.@ù\u0083\u0087³?\u001di\u0010\u0015×Cd\u0016o»ä\u009d·òTÅ4zÎ\u0010Æ\u00843¢\u0015\u0011¨P¥æÆ§\u0002ÓÊç DÛÛ?¾\u008frrü<wÍ\u0092ÍïAÃCà>C¶,àø\u001e{>¶º\u0096¢\u0010\u008d\u001aS\u0004ÆÝIÆ>Cj%X\u0003Ïþ\u0010?\u0085ó<´´PÍ3\u0012\u008fBÈ¯Õ%\u0010\u008aàr\u000fÿìFZ¤\u008c\u0004\u008aWU«æ8v¯t¡þOn\u0089í,f\\â\u0095§\u0085Ô1Ü\u0017?«9\"ÑâÞÆ\u008e(ðÇrÙál@WNlÓæ¹\u0096¸ï6)0¹f\rÛo?\"@\u0094+«X\u0012þ²\u000e\u0000ÝÖ\u0090è\u0083E$\u00adîu\u001fN\u0099J\u0016~-h:ïØ\u0002Ë§\fÉ\u0013\b\u0016P]ý}³\u001aeZYO¡æ`=\u0019w\u0013BX\u0083:mTõ.\u0015 \u0083aõ§gè\u008a¬\u008e«ï±¬\u00ad÷:-õGT¨åu\u008bQe\u008c¸3#\u0012Û\u0010Ìo£\u0093 /â\u0012v\u008aàßõ·\b1ɐHU\u0097>åÝ\u0084Äþ\u0089f=?\"ï0ÅªwäÆÊ\u0096£\u0096MTf\u00972¡ÚQ_\u001bBÞ\t¦{¾\u0089\u008aD\u001bV\u0084Ñ=:\u0084Á\u0094ïñÂ\u0011\u0000Ø£g·áXJ\u0085l\u0083G braK2Î3\u0098\u0087!\u0098\u0004\u0002æI¨K0®+}º{<\u009fMõ\u009c\\;1fºù¯O8Üá\u0016\u0000\u000eÙºþ'-\u001f\u008eã\r\u0098M>þöÓ\u0082ÖQ9Û\u0088\u0007\u0098§\u0013|\u0083*\u0089q\u0091ð¨\u008b\u00045|Þ'\u001dT×]\u0098ãÒ×\u0093â\u0086¸]ãÈ\u001b\u0012Õ\u0002mpcªSL»\u001b/\u0096w\u001f\u0082>\u0087ä\u0091¡Nú\u0000Ø`j¾\u001fQÏÛÅû[Oµ¤Ð\u009d\u0086O\u001c\u0000/¼òä\u0089Ãlj\u008a\t\u0002ç@S!\u0015\u0016ê\u0000Ë·Jy\u008dÕ¦\"§3\u0013p¾\u0017¡4Pòóm¡\u0091\u0016\u001c e\u001dðtAS\u0081_\"ýIV~õ\u0010\u009c8\u008eåÉ\u008csB§\r\u0082]6C\u0087F\u000eAîéã\u008b9\u008co\u0098Z\u0098q~=\u0085|\u007fÞGÐ£ñµ4Hu\u008f\u00195êí(D/ìeÎä8ä·\u00adç¯QÖhIÒA©ð\u0007P\u008d\u008bý×Ô¼Øñ\u009c8\u0097I\n\u0005à\u000f^BÒxÍÝø?ë8\u0091ê²ÃÎP:\u0004ûr¯í6@\u009f\u001b\u0082ÀN\u009fñòÇ\u009dLà£\f°p-âº?t\\\u0012@ûv>A¢K§\u0097\u0085DÄä\u001fÏ¾xµ\u0002Àåÿf\u000e\u0016¬Ë\u009c\u001c\u009aVªÜ\u001fz,c\u008f\u0088íú¥?²é\u0011\u0080Æ\u0081^ÔyvUýÉ\u0084T\u0090&\u001a¾E¸¬sø±\u009cwÐt\u008f±p<µ¹l\u009eã¤ä²\u0097'öæÔ58\u0098k\u0019UYúÞË·\u0095i§\u0018»X\u0005c*£Í0\u000b\u0015\u0011Dz\u001c>kkWÿ÷7\u000fXH\"!\u001cAÀh\u0005dò¥R\u007få»\u008dè()(ëWc\u0085mØ\u0093\u0092ºen\u0083¤Z\u000e\u0099eû\u001eÀ\u00adß\u008e-øxlËH\u0011ðY,r¨ü¿Ø#c:\u0010\u0005Ý-\u000eÉh¼}Óü\u0006;åuk'`\u0013M\tÿ¶È3ÛþÍ<ã¯I;°·²6&ø\u0083£téþa\u009b{!;ãe\u0001\u008a?]S*\u0093\u009dØ}Âû[º\u008e\u0018ÑT ]¿+y\u0080\u008dµ\u009c\u009c\u000eoµÛ£\u0099\u008føÉD'p\u0084Ù§\u0087BÞ\u009f_.Î\u008bÜ¬²\u00855ÀJ\u008b\u0099ª\u0010'\u0010é\u0019Ý\u008a\u008cwcZH\u00adÑ\u0092l9ÝK"
         .length();
      char var8 = 16;
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
                     CONST_E = var4;
                     CONST_F = new String[18];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = -8121608835381241968L;
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
                     50L = var30;
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

                  var6 = "\u00adÖÔ*¼Ï*\u0018FÒÞ¦ÚL\u0010ì36ì\u008ati\u0081\u009ax\u0084u×.ãk¤¸ÕDâ\u007f¤\u0000\u009e¢]Y\u0096ÏTwb~¶õZ\u0012KLq¿\u0094o¬ã\tû\u0010\u008c×\u0084]Üñ-]Ö .¸)F\u0093\n\u009d\u0091óËÅ'=q\u0010Xô~\u0003W^sÅµsH\u001cã/°C";
                  var7 = "\u00adÖÔ*¼Ï*\u0018FÒÞ¦ÚL\u0010ì36ì\u008ati\u0081\u009ax\u0084u×.ãk¤¸ÕDâ\u007f¤\u0000\u009e¢]Y\u0096ÏTwb~¶õZ\u0012KLq¿\u0094o¬ã\tû\u0010\u008c×\u0084]Üñ-]Ö .¸)F\u0093\n\u009d\u0091óËÅ'=q\u0010Xô~\u0003W^sÅµsH\u001cã/°C"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22021;
      if (CONST_F[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_G.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_G.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dk", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_E[var3].getBytes("ISO-8859-1");
         CONST_F[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_F[var3];
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
         throw new RuntimeException("rip/breeze/client/dk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
