package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C02PacketUseEntity.Action;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import rip.breeze.BreezeModule;
import rip.breeze.ConditionsSetting;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(
   a = "AutoBlock",
   b = "Tries to decrease incoming damage by automatically blocking incoming attacks when holding a sword.",
   d = rip.breeze.ModuleCategory.COMBAT,
   c = {"block", "autoblock", "autoblocker"}
)
public class AutoBlock extends BreezeModule implements IBreezeInterface3 {
   private final ConditionsSetting damageTypesSetting;
   private final GenericSetting<EnumType31> fightsSetting;
   private final GenericSetting<Integer> maxLagSetting;
   private final GenericSetting<Boolean> arrowsSetting;
   private final GenericSetting<Boolean> dataBuilder54_r;
   long fieldLong_s;
   int fieldInt_t;
   Util133 dataBuilder112_u;
   Util133 dataBuilder112_v;
   boolean fieldBool_w;
   boolean fieldBool_x;
   private long fieldLong_y;
   private static final String[] CONST_A;
   private static final String[] CONST_B;
   private static final Map CONST_C = new HashMap(13);
   private static final long[] CONST_D;
   private static final Long[] CONST_E;
   private static final Map CONST_F;

   public AutoBlock() {
      long var1 = 59388832791524L;
      super();
      short var10004 = 15082;
      long var10005 = 2496785353490419366L ^ var1;
      this.damageTypesSetting = new ConditionsSetting(this, "DamageTypes");
      short var10002 = 2959;
      long var10003 = 3667502076682534861L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this.damageTypesSetting, "Fights");
      var10002 = 7420;
      var10003 = 811362175776417973L ^ var1;
      this.fightsSetting = var10001.getDataBuilder50_3(
            "What mode to use for fights: \n\t Smart: Tries to predict when you are about to get hit and then blocks. This mode is totally undetectable. \n\t LagAbuse: Spoofs packets while you are blocking to make it look like you are blocking for longer without obstructing movement to much."
         )
         .getDataBuilder50_4(EnumType31.SMART)
         .getDataBuilder54();
      var10002 = 13734;
      var10003 = 3907009813411709416L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "MaxLag");
      var10002 = 14275;
      var10003 = 534809138802475916L ^ var1;
      this.maxLagSetting = var10001.getDataBuilder50_3("The amount of ms that packets can maximally be choked for.")
         .getDataBuilder50_4(100)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 1000))
         .getDataBuilder50_9(AutoBlock::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 19058;
      var10003 = 4510713057452310065L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.damageTypesSetting, "Also blocks explosions.");
      var10002 = 11461;
      var10003 = 5131891333875718287L ^ var1;
      this.arrowsSetting = var10001.getDataBuilder50_3("Arrows").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 8534;
      var10003 = 4710317425524331806L ^ var1;
      this.dataBuilder54_r = GenericSetting.<Boolean>getDataBuilder50(this.damageTypesSetting, "Also blocks arrows.")
         .getDataBuilder50_3("Also blocks arrows.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      this.fieldLong_s = 4833747969452823492L;
      this.fieldInt_t = -1;
      this.dataBuilder112_u = new Util133();
      this.dataBuilder112_v = new Util133();
      this.fieldBool_w = false;
      this.fieldBool_x = false;
      this.fieldLong_y = 0L;
      BreezeClient.getConfigManager().update_1(this, 2);
   }

   @EventListener
   public void calculate(PreTickEventEvent var1) {
      long var2 = 110372625702369L;
      if (this.fieldLong_s > 0L) {
         MinecraftAccessor.initialize_24(BreezeClient.CONST_A.gameSettings.keyBindUseItem, true);
      }

      if (!this.getHeldItem()) {
         this.update();
         this.fieldBool_w = false;
         this.fieldBool_x = false;
      } else if (this.isValid()) {
         this.update();
      } else {
         this.fieldInt_t++;
         if (this.fightsSetting.isValid(EnumType31._OFF) || !this.getDistance()) {
            if (!this.arrowsSetting.getObject_m() || !this.getDistance_2()) {
               if (!this.dataBuilder54_r.getObject_m() || !this.getDistance_3()) {
                  if (this.fieldLong_s > 0L && System.currentTimeMillis() > this.fieldLong_s) {
                     this.update();
                  }
               }
            }
         }
      }
   }

   @EventListener
   public void toggle(PacketSendEventEvent var1) {
      long var2 = 128114445241100L;
      if (var1.packet_h instanceof C02PacketUseEntity) {
         C02PacketUseEntity var4 = (C02PacketUseEntity)var1.packet_h;
         if (var4.getAction() == Action.ATTACK) {
            this.dataBuilder112_u.getDataBuilder112();
         }

         this.fieldBool_w = false;
      }

      if (var1.packet_h instanceof C07PacketPlayerDigging) {
         this.fieldBool_w = false;
      }
   }

   private boolean getDistance() {
      long var1 = 103483126347171L;
      int[] var3 = AimAssist.getStateArray();
      if (BreezeClient.CONST_A.thePlayer.isBlocking() && this.fieldInt_t >= 1 && this.fightsSetting.isValid(EnumType31.LAG_ABUSE)) {
         return false;
      }

      boolean var4 = false;
      Iterator var5 = BreezeClient.CONST_A.theWorld.playerEntities.iterator();

      while (true) {
         if (!var5.hasNext()) {
            if (!var4 && this.fightsSetting.isValid(EnumType31.LAG_ABUSE)) {
               this.fieldBool_x = false;
            }

            return false;
         }

         EntityPlayer var6 = (EntityPlayer)var5.next();
         float var7 = (float)(var6.posX - var6.prevPosX);
         float var8 = (float)(var6.posZ - var6.prevPosZ);
         Vec3 var9 = new Vec3(var6.posX + var7 * 4.0F, var6.posY, var6.posZ + var8 * 4.0F);
         float var10 = BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var6);
         if ((!(Math.min(BreezeClient.CONST_A.thePlayer.getDistance(var9.xCoord, var9.yCoord, var9.zCoord), var10) > 4.0) || var3 == null)
            && var6.isSwingInProgress
            && (AntiBot.isInvisible_3(var6) || var3 == null)) {
            var4 = true;
            if (this.fightsSetting.isValid(EnumType31.LAG_ABUSE) && !this.fieldBool_w) {
               this.calculate_2(5);
               return true;
            }

            if ((var6.swingProgressInt != 0 || var6.isBlocking() || var3 == null)
               && (!var6.isUsingItem() || var6.isBlocking() || var3 == null)
               && (!(var10 < 3.0F) || !this.dataBuilder112_u.isValid(-8647301139663462883L) || var3 == null)
               && (!(var10 < 3.0F) || this.dataBuilder112_v.isValid(-8026152016114228920L) || var3 == null)) {
               if (!(var10 > 2.0F)) {
                  break;
               }

               float[] var11 = RotationUtil7.getAnglesTo(
                  BreezeClient.CONST_A.thePlayer.getPositionEyes(MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks), var6, false
               );
               if (!(RotationUtil7.absValue(var11[0], var6.rotationYaw) > 35.0F) || var3 == null) {
                  break;
               }
            }
         }
      }

      this.dataBuilder112_v.getDataBuilder112();
      this.calculate_2(5);
      return true;
   }

   private boolean getDistance_2() {
      long var1 = 84542009902049L;
      int[] var10000 = AimAssist.getStateArray();
      Iterator var3 = BreezeClient.CONST_A.theWorld.loadedEntityList.iterator();
      int[] var4 = var10000;

      while (var3.hasNext()) {
         label47: {
            Entity var5 = (Entity)var3.next();
            if (var5 instanceof EntityFireball) {
               if (BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var5) > 6.0F && var4 != null) {
                  continue;
               }

               EntityFireball var6 = (EntityFireball)var5;
               Vec3 var7 = new Vec3(var6.posX, var6.posY, var6.posZ);
               Vec3 var8 = new Vec3(var6.motionX * 10.0, var6.motionY * 10.0, var6.motionZ * 10.0);
               MovingObjectPosition var9 = BreezeClient.CONST_A.theWorld.rayTraceBlocks(var7, var7.add(var8), false, false, false);
               if (var9 == null && var4 != null) {
                  continue;
               }

               if (var9.entityHit == BreezeClient.CONST_A.thePlayer) {
                  this.calculate_2(200);
                  return true;
               }

               if (var9.hitVec.distanceTo(BreezeClient.CONST_A.thePlayer.getPositionVector()) < 5.0) {
                  this.calculate_2(200);
                  return true;
               }

               if (var4 != null) {
                  break label47;
               }
            }

            if (var5 instanceof EntityTNTPrimed) {
               if (BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var5) > 6.0F && var4 != null) {
                  continue;
               }

               EntityTNTPrimed var10 = (EntityTNTPrimed)var5;
               if (var10.fuse < 10) {
                  this.calculate_2(200);
                  return true;
               }
            }
         }

         if (var4 == null) {
            break;
         }
      }

      return false;
   }

   private boolean getDistance_3() {
      long var1 = 22802049997745L;
      int[] var10000 = AimAssist.getStateArray();
      Iterator var3 = BreezeClient.CONST_A.theWorld.loadedEntityList.iterator();
      int[] var4 = var10000;

      while (var3.hasNext()) {
         Entity var5 = (Entity)var3.next();
         if (var5 instanceof EntityArrow || var4 == null) {
            EntityArrow var6 = (EntityArrow)var5;
            if ((var6.shootingEntity != BreezeClient.CONST_A.thePlayer || var4 == null)
               && (!var6.isDead || var4 == null)
               && (!MinecraftAccessor.isValid_2(var6) || var4 == null)
               && (!(var6.getDistanceToEntity(BreezeClient.CONST_A.thePlayer) > 6.0F) || var4 == null)) {
               Vec3 var7 = new Vec3(var6.posX, var6.posY, var6.posZ);
               Vec3 var8 = new Vec3(var6.motionX * 10.0, var6.motionY, var6.motionZ * 15.0);
               AxisAlignedBB var9 = BreezeClient.CONST_A.thePlayer.getEntityBoundingBox().expand(1.0, 2.0, 1.0);
               if (var9.isVecInside(var7)) {
                  this.calculate_2(200);
                  return true;
               }

               if (var9.calculateIntercept(var7, var7.add(var8)) != null) {
                  this.calculate_2(200);
                  return true;
               }

               if (var4 == null) {
                  break;
               }
            }
         }
      }

      return false;
   }

   private int clamp() {
      long var1 = 101899975367891L;
      if (this.fieldLong_y == 0L) {
         return 0;
      }

      long var3 = System.currentTimeMillis() - this.fieldLong_y;
      int var5 = (int)(var3 / 9166105464560371904L);
      return Math.max(0, 20 - var5);
   }

   private boolean isValid() {
      long var1 = 57190114463556L;
      return this.clamp() > 12;
   }

   private boolean getHeldItem() {
      long var1 = 89086729832670L;
      return BreezeClient.CONST_A.thePlayer.getHeldItem() != null && BreezeClient.CONST_A.thePlayer.getHeldItem().getItem() instanceof ItemSword;
   }

   private void calculate_2(int var1) {
      this.fieldLong_s = System.currentTimeMillis() + var1;
      MinecraftAccessor.initialize_24(BreezeClient.CONST_A.gameSettings.keyBindUseItem, true);
   }

   private void update() {
      long var1 = 11627648340408L;
      if (this.fieldLong_s > 0L) {
         this.fieldLong_s = 851655912243732567L;
         this.fieldInt_t = 0;
         MinecraftAccessor.initialize_24(
            BreezeClient.CONST_A.gameSettings.keyBindUseItem, PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindUseItem)
         );
      }
   }

   public EnumType27 getEnum_PROCESS(Packet<?> var1, boolean var2) {
      long var3 = 29844293304432L;
      if (!this.f() || !this.fightsSetting.isValid(EnumType31.LAG_ABUSE)) {
         return EnumType27.PROCESS;
      }

      if (var1 instanceof C07PacketPlayerDigging && this.fieldBool_w) {
         this.fieldBool_x = true;
         return EnumType27.DELAY;
      }

      if (var1 instanceof C08PacketPlayerBlockPlacement && this.getHeldItem()) {
         this.fieldBool_x = false;
         this.fieldBool_w = true;
         return EnumType27.DELAY;
      }

      if (var1 instanceof C02PacketUseEntity) {
         C02PacketUseEntity var5 = (C02PacketUseEntity)var1;
         if (var5.getAction() == Action.ATTACK) {
            this.fieldBool_x = false;
         }
      }

      return !BreezeClient.getConfigManager().getArrayList(this).isEmpty() ? EnumType27.DELAY : EnumType27.PROCESS;
   }

   public EnumType27 getEnum_PROCESS_2(Packet<?> var1, boolean var2) {
      long var3 = 100277995698129L;
      if (var1 instanceof S19PacketEntityStatus) {
         S19PacketEntityStatus var5 = (S19PacketEntityStatus)var1;
         Entity var6 = var5.getEntity(BreezeClient.CONST_A.theWorld);
         if (var6 == BreezeClient.CONST_A.thePlayer && var5.getOpCode() == 2) {
            this.fieldLong_y = System.currentTimeMillis() - BreezeClient.getConfigManager().getDataBuilder31_j().getValue();
         }
      }

      return EnumType27.PROCESS;
   }

   public void toggle_2(ArrayList<DelayedPacket> var1) {
      long var2 = 131090423664411L;
      if (var1.isEmpty()) {
         this.fieldBool_x = false;
      } else if (!this.f() || !this.fightsSetting.isValid(EnumType31.LAG_ABUSE) || !this.fieldBool_w) {
         BreezeClient.getConfigManager().processAll(this);
      } else if (!this.fieldBool_x) {
         BreezeClient.getConfigManager().processAll(this);
      } else {
         DelayedPacket var4 = (DelayedPacket)var1.get(0);
         if (var4.fieldLong_h + this.maxLagSetting.getObject_m().intValue() < System.currentTimeMillis()) {
            BreezeClient.getConfigManager().processAll(this);
            this.fieldBool_x = false;
            this.fieldBool_w = false;
         }
      }
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 61324418863879L;
      return var0.getObject("Fights", EnumType31.class) == EnumType31.LAG_ABUSE;
   }

   static {
      long var0 = 105192295588127L;
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
      String var6 = "x®ªÄËTtÝ\u009e \u0005ä^\u00043\u009b(@Õ\u0090O@\u0007¬f6£5Ú\u0015\u0090+¡BFDõ«¥«\f5ò\u0093>} \n\u009eÓ\u00962¢\u0013ùÛkƠê`òúéÌËÂt¢\u0010f\u0082°®Eh\u0001\u0080ûØØ*ü\u0099Q\u0002$\u0099Ä\u009a\u000e®\u0098Q¯ä\u0084\u000bL\u0086\u001d¢va\u0096ZÜ½ñ\u0012\u0081\u00adøi\u008d\u0089D*ö\u009b\u0093'\u0011BÁ\u0091zÑñ±ÕÏ³\u001c\u0085f\u0007Oùmí\u0013(ßR\u0087<]iÉÏ\u0088m\u0089¯\u0014Ú\u0000Áþ\u0095\u0005\u0099\u008c\u000b«ÚÅßt\u0082\u0096\u0010\u008a\u0017ti.\u0091\u009dÎ2õµhÔ\u0085õ+\u0005è7\u0006!\u008eQµWéZ!æL;=\u008bxÐâ¸ïî\u0017z¹)Ú\u0082\u000b0<~zKôî\u007f h[ÔíÇ;ÝßäÇÂ\u009fXYg6\u009b\u0013Ç\b\u000b\u0085ªwÝæè¹\u0088Ë¼e\u0082\u0088\u0017\u0013\u0087òN¼\u001e\u001bqoì}\u008cÈ\u001d\u008bâ\u001c\u0014\u0083\u0003\u0012\u0016\u009b}g\u0099:\u0006PÕC_Þâ\u0091é¸ÂÁ4Ýo©\u0017c*\u0097Ü!ÖÚ\u0088ÕÛ1\u008d²Ð@XSzA>éÉã\u0001d¥½\u008e[\tGôP{Ø-½:IP!\u009b\u00ad~P¾`8\u008bg~ý@¸ò\u0089\u0001¼\u0007«Ó\u0082n\"f¦O{xßKîË\u0084e<Ç\u001d/ôGý)Ø\u009d\u0097ò(\u0014Âåè>>û\n\u008d)Uj³'\u0005=¿µ£\u0007\u0089£N \u0006ÚØ\u0005\u0096^P\u0018AJ²ù*s¬\\ÂîÅ¢ä½\u0014Ã\u0012vøÌâáÉÐÓ÷ÜnbîÔÞ´å#£1QXGv|h\"Ztú\u0012\u0010\u0087RïÚü³\u000eÇÙ\u0087qõ\u009f!F\u0093hêÄT\u0007Í\u001c \u008fÓr°XÚ\u0080H¸\u00043w»÷X¤*q\n19ËZgB¬\u0087!6¬ \u0002×\u00919äÆs\u0001ÉÀ¿äWp\u009eÖÓB\u008cyç«éYeúgZ\u0089YÆÝ\u00912\u0092Ê\u0087\u0017l%\u0001\u009a\"·=]\u001eK\u0002ù\u0012¦\\.4ô¢\u0006Õ\u0080áÝ?QJß\u0010Á\u00071¯©\u001a¿C5ð\u009aìýÍ·@(MiÏlÙÙP»E¼ëuö×\u0097\u001c\u008e\u001cH\u0004Çö|\u001b¤9Î\u0095&k\u0091\u0006&\u0015¶K\u0085\u0019Ä`\u0018_\u009e\u0096A jÄÄ\u008a]½=ï§6\u008dlx/\u008aÅz9\u0082";
      int var7 = "x®ªÄËTtÝ\u009e \u0005ä^\u00043\u009b(@Õ\u0090O@\u0007¬f6£5Ú\u0015\u0090+¡BFDõ«¥«\f5ò\u0093>} \n\u009eÓ\u00962¢\u0013ùÛkƠê`òúéÌËÂt¢\u0010f\u0082°®Eh\u0001\u0080ûØØ*ü\u0099Q\u0002$\u0099Ä\u009a\u000e®\u0098Q¯ä\u0084\u000bL\u0086\u001d¢va\u0096ZÜ½ñ\u0012\u0081\u00adøi\u008d\u0089D*ö\u009b\u0093'\u0011BÁ\u0091zÑñ±ÕÏ³\u001c\u0085f\u0007Oùmí\u0013(ßR\u0087<]iÉÏ\u0088m\u0089¯\u0014Ú\u0000Áþ\u0095\u0005\u0099\u008c\u000b«ÚÅßt\u0082\u0096\u0010\u008a\u0017ti.\u0091\u009dÎ2õµhÔ\u0085õ+\u0005è7\u0006!\u008eQµWéZ!æL;=\u008bxÐâ¸ïî\u0017z¹)Ú\u0082\u000b0<~zKôî\u007f h[ÔíÇ;ÝßäÇÂ\u009fXYg6\u009b\u0013Ç\b\u000b\u0085ªwÝæè¹\u0088Ë¼e\u0082\u0088\u0017\u0013\u0087òN¼\u001e\u001bqoì}\u008cÈ\u001d\u008bâ\u001c\u0014\u0083\u0003\u0012\u0016\u009b}g\u0099:\u0006PÕC_Þâ\u0091é¸ÂÁ4Ýo©\u0017c*\u0097Ü!ÖÚ\u0088ÕÛ1\u008d²Ð@XSzA>éÉã\u0001d¥½\u008e[\tGôP{Ø-½:IP!\u009b\u00ad~P¾`8\u008bg~ý@¸ò\u0089\u0001¼\u0007«Ó\u0082n\"f¦O{xßKîË\u0084e<Ç\u001d/ôGý)Ø\u009d\u0097ò(\u0014Âåè>>û\n\u008d)Uj³'\u0005=¿µ£\u0007\u0089£N \u0006ÚØ\u0005\u0096^P\u0018AJ²ù*s¬\\ÂîÅ¢ä½\u0014Ã\u0012vøÌâáÉÐÓ÷ÜnbîÔÞ´å#£1QXGv|h\"Ztú\u0012\u0010\u0087RïÚü³\u000eÇÙ\u0087qõ\u009f!F\u0093hêÄT\u0007Í\u001c \u008fÓr°XÚ\u0080H¸\u00043w»÷X¤*q\n19ËZgB¬\u0087!6¬ \u0002×\u00919äÆs\u0001ÉÀ¿äWp\u009eÖÓB\u008cyç«éYeúgZ\u0089YÆÝ\u00912\u0092Ê\u0087\u0017l%\u0001\u009a\"·=]\u001eK\u0002ù\u0012¦\\.4ô¢\u0006Õ\u0080áÝ?QJß\u0010Á\u00071¯©\u001a¿C5ð\u009aìýÍ·@(MiÏlÙÙP»E¼ëuö×\u0097\u001c\u008e\u001cH\u0004Çö|\u001b¤9Î\u0095&k\u0091\u0006&\u0015¶K\u0085\u0019Ä`\u0018_\u009e\u0096A jÄÄ\u008a]½=ï§6\u008dlx/\u008aÅz9\u0082"
         .length();
      char var8 = 16;
      int var23 = -1;

      label54:
      while (true) {
         String var25 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var36;
                  if ((var23 += var8) >= var7) {
                     CONST_A = var4;
                     CONST_B = new String[10];
                     CONST_F = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[5];
                     int var14 = 0;
                     String var15 = "kµ\u008bµÀOe\u001b\u0092ý\u0099AA\u0090%°¢.>ú\u0097ÉÜ'";
                     int var16 = "kµ\u008bµÀOe\u001b\u0092ý\u0099AA\u0090%°¢.>ú\u0097ÉÜ'".length();
                     byte var17 = 0;

                     label36:
                     while (true) {
                        var10001 = var17;
                        var17 += 8;
                        byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
                        long[] var28 = var13;
                        var10001 = var14++;
                        long var40 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var19 = var40;
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
                           long var45 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var17 >= var16) {
                                    CONST_D = var13;
                                    CONST_E = new Long[5];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "ó\u001b\u001dºØ\u001cñ¸\u0084\n\u0006Ü\u0095ú\u0004\u009d";
                                 var16 = "ó\u001b\u001dºØ\u001cñ¸\u0084\n\u0006Ü\u0095ú\u0004\u009d".length();
                                 var17 = 0;
                           }

                           byte var34 = var17;
                           var17 += 8;
                           var18 = var15.substring(var34, var17).getBytes("ISO-8859-1");
                           var28 = var13;
                           var10001 = var14++;
                           var40 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var36;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label54;
                  }

                  var6 = "ú\u009c3¤\u0019vÒÁ\u009e\u0096\u0010\u008düÎ\u001e¡\u009e\u001eÒiR)á\f) ²Ç\u007f\f\\ü\u0010fí\u008aQÀÔ\u00907\t«fÖÍ\u001dÀO";
                  var7 = "ú\u009c3¤\u0019vÒÁ\u009e\u0096\u0010\u008düÎ\u001e¡\u009e\u001eÒiR)á\f) ²Ç\u007f\f\\ü\u0010fí\u008aQÀÔ\u00907\t«fÖÍ\u001dÀO".length();
                  var8 = ' ';
                  var23 = -1;
            }

            var25 = var6.substring(++var23, var23 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20399;
      if (CONST_B[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_C.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_C.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dh", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_A[var3].getBytes("ISO-8859-1");
         CONST_B[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_B[var3];
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
         throw new RuntimeException("rip/breeze/client/dh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26304;
      if (CONST_E[var3] == null) {
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
         long var5 = CONST_D[var3];
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
         Object[] var9 = (Object[])CONST_F.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_F.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/dh", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_E[var3] = var14;
      }

      return CONST_E[var3];
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
         throw new RuntimeException("rip/breeze/client/dh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
