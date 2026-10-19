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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S18PacketEntityTeleport;
import net.minecraft.network.play.server.S27PacketExplosion;
import rip.breeze.BreezeModule;
import rip.breeze.ConditionsSetting;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.LicenseState;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "Velocity",
   b = "Reduce the knockback you take from enemies and explosions.",
   d = {rip.breeze.ModuleCategory.MOVEMENT, rip.breeze.ModuleCategory.COMBAT},
   c = {"knockback", "antikb", "reduce", "noknockback", "antiknockback", "nokb"}
)
public class Velocity extends BreezeModule {
   private final GenericSetting<Double> chanceSetting;
   private final GenericSetting<Boolean> explosionsSetting;
   private final GenericSetting<Boolean> jumpSetting;
   private final ConditionsSetting horizontalSetting;
   private final GenericSetting<EnumType37> modeSetting;
   private final GenericSetting<rip.breeze.RangeValue> reduceSetting;
   private final GenericSetting<Integer> delaySetting;
   private final ConditionsSetting verticalSetting;
   private final GenericSetting<EnumType37> modeSetting_2;
   private final GenericSetting<rip.breeze.RangeValue> reduceSetting_2;
   private final ConditionsSetting conditionsSetting;
   private final GenericSetting<Boolean> sprintOnlySetting;
   private final GenericSetting<Boolean> runningSetting;
   private final GenericSetting<Boolean> onlyInCombatSetting;
   private final Random random_B;
   private double double_C;
   private double double_D;
   private int fieldInt_E;
   private static final String[] CONST_G;
   private static final String[] CONST_H;
   private static final Map CONST_I = new HashMap(13);

   public Velocity() {
      long var1 = 132888239578589L;
      super();
      short var10002 = 14274;
      long var10003 = 325985836359917737L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Chance");
      var10002 = 4213;
      var10003 = 8949052124906424092L ^ var1;
      this.chanceSetting = var10001.getDataBuilder50_3("Chance that the velocity module will be activated.")
         .getDataBuilder50_4(100.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 100.0))
         .getDataBuilder54();
      var10002 = 1759;
      var10003 = 2046849181402665406L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Explosions");
      var10002 = 27861;
      var10003 = 3424984580315380641L ^ var1;
      this.explosionsSetting = var10001.getDataBuilder50_3("Also activate velocity on explosion knockback.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 16609;
      var10003 = 2173574398089680798L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Jump");
      var10002 = 26290;
      var10003 = 4158871676751737295L ^ var1;
      this.jumpSetting = var10001.getDataBuilder50_3("Jumps right when you take knockback, this abuses a vanilla mechanic to reduce your knockback.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      short var10004 = 17178;
      long var10005 = 4117757411153826920L ^ var1;
      this.horizontalSetting = new ConditionsSetting(this, "Horizontal");
      String var10000 = ScaffoldUtils.getString_2();
      short var30 = 26160;
      long var46 = 2337214804755509576L ^ var1;
      rip.breeze.BlockUtil10 var14 = GenericSetting.getDataBuilder50(this.horizontalSetting, "Mode");
      short var31 = 21149;
      long var47 = 5179743347358680565L ^ var1;
      this.modeSetting = var14.getDataBuilder50_3("How to handle horizontal velocity.").getDataBuilder50_4(EnumType37.ONLY_IN_AIR).getDataBuilder54();
      short var32 = 5857;
      long var48 = 2111464844669747589L ^ var1;
      rip.breeze.BlockUtil10 var15 = GenericSetting.getDataBuilder50(this.horizontalSetting, "Reduce");
      short var33 = 28611;
      long var49 = 1032072135871363248L ^ var1;
      this.reduceSetting = var15.getDataBuilder50_3("How much horizontal velocity to apply.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(0.0, 40.0, 0.5))
         .clamp(rip.breeze.RangeValue.getPredicate(0.0, 100.0, 0.5))
         .getDataBuilder54();
      short var34 = 14018;
      long var50 = 1260994354552709537L ^ var1;
      rip.breeze.BlockUtil10 var16 = GenericSetting.getDataBuilder50(this.horizontalSetting, "Delay");
      short var35 = 11043;
      long var51 = 2771049753237044294L ^ var1;
      this.delaySetting = var16.getDataBuilder50_3("Apply the velocity modules a set amount of ticks later.\nCan help bypassing anti-cheats.")
         .getDataBuilder50_4(0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 10))
         .getDataBuilder54();
      short var56 = 31883;
      long var10006 = 1468469061034830833L ^ var1;
      this.verticalSetting = new ConditionsSetting(this, "Vertical");
      short var36 = 1228;
      long var52 = 570467679388996524L ^ var1;
      rip.breeze.BlockUtil10 var17 = GenericSetting.getDataBuilder50(this.verticalSetting, "Mode");
      short var37 = 9236;
      long var53 = 546752820262548346L ^ var1;
      this.modeSetting_2 = var17.getDataBuilder50_3("How to handle vertical velocity.").getDataBuilder50_4(EnumType37._OFF).getDataBuilder54();
      short var38 = 4689;
      long var54 = 639317910608708906L ^ var1;
      rip.breeze.BlockUtil10 var18 = GenericSetting.getDataBuilder50(this.verticalSetting, "Reduce");
      short var39 = 32690;
      long var55 = 5529600707600050399L ^ var1;
      this.reduceSetting_2 = var18.getDataBuilder50_3("How much vertical velocity to apply.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(0.0, 30.0, 0.5))
         .clamp(rip.breeze.RangeValue.getPredicate(0.0, 100.0, 0.5))
         .getDataBuilder54();
      short var57 = 16383;
      var10006 = 3228072441091205267L ^ var1;
      this.conditionsSetting = new ConditionsSetting(this, "Conditions");
      String var3 = var10000;
      var10002 = 13620;
      var10003 = 39692552462344778L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.conditionsSetting, "SprintOnly");
      var10002 = 16664;
      var10003 = 2218265628544128612L ^ var1;
      this.sprintOnlySetting = var10001.getDataBuilder50_3("Only activate while you are sprinting.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 13851;
      var10003 = 527315161454125410L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.conditionsSetting, "Running");
      var10002 = 24849;
      var10003 = 1490022968155567742L ^ var1;
      this.runningSetting = var10001.getDataBuilder50_3(
            "Deactivate velocity when you are running from enemies.\nKeeping this off makes it easier to escape enemies that are hitting you from behind."
         )
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      var10002 = 24413;
      var10003 = 8740081881153587245L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.conditionsSetting, "OnlyInCombat");
      var10002 = 15026;
      var10003 = 2734334726780399044L ^ var1;
      this.onlyInCombatSetting = var10001.getDataBuilder50_3("Makes velocity only activate while you are in combat.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      this.random_B = new Random();
      this.fieldInt_E = -1;
      if (var3 == null) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   @Override
   public String getString() {
      long var1 = 94639785842642L;
      if (this.modeSetting.isValid(EnumType37._OFF) && this.modeSetting_2.isValid(EnumType37._OFF)) {
         return this.jumpSetting.getObject_m() ? "Jump" : "Off";
      } else if (this.modeSetting.isValid(EnumType37.ONLY_IN_AIR) && this.modeSetting_2.isValid(EnumType37.ONLY_IN_AIR)) {
         return "Air";
      } else {
         return !this.modeSetting.isValid(EnumType37._OFF) && this.modeSetting_2.isValid(EnumType37._OFF)
            ? "Horizontal"
            : "Custom";
      }
   }

   @EventListener
   public void updateRotation(PacketReceiveEventEvent var1) {
      long var2 = 118415524529088L;
      String var4 = ScaffoldUtils.getString_2();
      if (var1.packet_h instanceof S18PacketEntityTeleport) {
         this.fieldInt_E = -1;
      } else if (var1.packet_h instanceof S12PacketEntityVelocity || var1.packet_h instanceof S27PacketExplosion) {
         if (!BreezeClient.isValid()) {
            if (!(this.random_B.nextDouble() * 100.0 > this.chanceSetting.getObject_m())) {
               if (!this.sprintOnlySetting.getObject_m() || BreezeClient.CONST_A.thePlayer.isSprinting()) {
                  if (!BreezeClient.CONST_A.thePlayer.onGround || this.modeSetting_2.isValid(EnumType37.ALWAYS) || this.modeSetting.isValid(EnumType37.ALWAYS)) {
                     if (!this.onlyInCombatSetting.getObject_m() || this.getDistance_2()) {
                        double var5 = (!BreezeClient.CONST_A.thePlayer.onGround || this.modeSetting.isValid(EnumType37.ALWAYS))
                              && !this.modeSetting.isValid(EnumType37._OFF)
                           ? this.reduceSetting.getObject_m().calculateDouble_2() / 100.0
                           : 0.0;
                        double var7 = (!BreezeClient.CONST_A.thePlayer.onGround || this.modeSetting_2.isValid(EnumType37.ALWAYS))
                              && !this.modeSetting_2.isValid(EnumType37._OFF)
                           ? this.reduceSetting_2.getObject_m().calculateDouble_2() / 100.0
                           : 0.0;
                        if (var1.packet_h instanceof S12PacketEntityVelocity) {
                           S12PacketEntityVelocity var14 = (S12PacketEntityVelocity)var1.packet_h;
                           if (var14.getEntityID() == BreezeClient.CONST_A.thePlayer.getEntityId()) {
                              if (!this.getDistance() || this.runningSetting.getObject_m()) {
                                 if (this.jumpSetting.getObject_m() && BreezeClient.CONST_A.thePlayer.onGround && BreezeClient.CONST_A.thePlayer.isSprinting()) {
                                    BreezeClient.CONST_A.thePlayer.jump();
                                 }

                                 MinecraftAccessor.initialize_44(
                                    var14, (int)((1.0 - var7) * MinecraftAccessor.getValue_3(var14) + var7 * BreezeClient.CONST_A.thePlayer.motionY * 8000.0)
                                 );
                                 double var10 = MinecraftAccessor.getValue_9(var14) / 8000.0 - BreezeClient.CONST_A.thePlayer.motionX;
                                 double var12 = MinecraftAccessor.getValue_4(var14) / 8000.0 - BreezeClient.CONST_A.thePlayer.motionZ;
                                 if (this.delaySetting.getObject_m() == 0) {
                                    MinecraftAccessor.initialize_11(
                                       var14,
                                       (int)((1.0 - var5) * MinecraftAccessor.getValue_9(var14) + var5 * BreezeClient.CONST_A.thePlayer.motionX * 8000.0)
                                    );
                                    MinecraftAccessor.initialize_37(
                                       var14,
                                       (int)((1.0 - var5) * MinecraftAccessor.getValue_4(var14) + var5 * BreezeClient.CONST_A.thePlayer.motionZ * 8000.0)
                                    );
                                    if (var4 != null) {
                                       return;
                                    }
                                 }

                                 this.fieldInt_E = this.delaySetting.getObject_m();
                                 this.double_C = (float)var10 * (1.0 - var5);
                                 this.double_D = (float)var12 * (1.0 - var5);
                              }
                           }
                        } else if (this.explosionsSetting.getObject_m()) {
                           S27PacketExplosion var9 = (S27PacketExplosion)var1.packet_h;
                           MinecraftAccessor.initialize_12(var9, MinecraftAccessor.getFloat(var9) * (float)(1.0 - var7));
                           if (this.delaySetting.getObject_m() == 0) {
                              MinecraftAccessor.initialize_12(var9, MinecraftAccessor.getFloat(var9) * (float)(1.0 - var5));
                              MinecraftAccessor.initialize_41(var9, MinecraftAccessor.getFloat_7(var9) * (float)(1.0 - var5));
                              if (var4 != null) {
                                 return;
                              }
                           }

                           this.fieldInt_E = this.delaySetting.getObject_m();
                           this.double_C = BreezeClient.CONST_A.thePlayer.motionX - MinecraftAccessor.getFloat(var9) * var5;
                           this.double_D = BreezeClient.CONST_A.thePlayer.motionZ - MinecraftAccessor.getFloat_7(var9) * var5;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @EventListener
   public void setInt_E(WorldChangedEventEvent var1) {
      this.fieldInt_E = -1;
   }

   @EventListener
   public void calculate(PreTickEventEvent var1) {
      long var2 = 57537517000450L;
      if (BreezeClient.isValid()) {
         this.fieldInt_E = -1;
      } else if (BreezeClient.CONST_A.thePlayer.motionY < 0.0 && BreezeClient.CONST_A.thePlayer.onGround) {
         this.fieldInt_E = -1;
      } else if (this.fieldInt_E >= 0) {
         if (this.fieldInt_E == 0
            && !this.modeSetting.isValid(EnumType37._OFF)
            && (!BreezeClient.CONST_A.thePlayer.onGround || this.modeSetting.isValid(EnumType37.ALWAYS))) {
            BreezeClient.CONST_A.thePlayer.motionX = this.double_C;
            BreezeClient.CONST_A.thePlayer.motionZ = this.double_D;
         }

         this.fieldInt_E--;
      }
   }

   private boolean getDistance() {
      long var1 = 57168012995292L;
      String var3 = ScaffoldUtils.getString_2();
      if (BreezeClient.CONST_A.thePlayer.moveForward < 0.1) {
         return false;
      }

      boolean var4 = false;

      for (EntityPlayer var6 : BreezeClient.CONST_A.theWorld.playerEntities) {
         if (AntiBot.isInvisible_3(var6) || var3 == null) {
            float var7 = var6.getDistanceToEntity(BreezeClient.CONST_A.thePlayer);
            if (!(var7 > 5.0F) || var3 == null) {
               float var8 = RotationUtil7.getAnglesTo(BlockUtil7.getVec3_2(var6.getEntityBoundingBox()), BreezeClient.CONST_A.thePlayer, false)[0];
               float var9 = RotationUtil7.absValue(BreezeClient.CONST_A.thePlayer.rotationYaw, var8);
               if (var9 < 90.0F) {
                  return false;
               }

               if (var9 > 90.0F) {
                  var4 = true;
               }

               if (var3 == null) {
                  break;
               }
            }
         }
      }

      return var4;
   }

   private boolean getDistance_2() {
      long var1 = 126161731907785L;
      String var3 = ScaffoldUtils.getString_2();
      if (BreezeClient.getThemeManager().getEntity() != null) {
         return true;
      }

      for (EntityPlayer var5 : BreezeClient.CONST_A.theWorld.playerEntities) {
         if (AntiBot.isInvisible_3(var5) || var3 == null) {
            float var6 = var5.getDistanceToEntity(BreezeClient.CONST_A.thePlayer);
            if (!(var6 > 5.0F) || var3 == null) {
               return true;
            }
         }
      }

      return false;
   }

   static {
      long var0 = 96674383154876L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[30];
      int var5 = 0;
      String var6 = "\u001b[´\u0084äÐ\u001eáV\u00881DÝPç*\u0010@\u0097ì\u001aÐè Ç¨Î\u001aOÄ\u0096\u000e¼ !S\u0004$¢|\u0099g*Ìð\f\u0095ü\u00065\u0098Oî\u0004Ã\u0080l\u009a\u0083\u0083È¢Àþv\u001b\u0010@TÓ\u008e¨¸à8ÕU\n\u0099#N«ä@\u009d¤\u0084\\´,X4Z\u00160&øæ² {G^åè÷þÓ\u0088\u00ad7Ç¯nüÕCK×.\nvDEÏ\u0014\u0018\u009auuøÒñR-oi\u0088\u007fí³Ó×8\bJ\u0089Ý\u0090¢[¨þët\u0001ý%·`!\u008d\u0016bJ\u008f\u0010TL\u0092Í\u0080Ô\u0001½1×9\u0095Qpx\u0019òá \u0095\u0092T¶Ü\u0084)\u00ad^\n\tï\u0099½ÎN×}T¿\u000e6\u001f\"AèÔ\u0011*\u0003\u009a\u00ad¶³å\u009bàÁ\u0004¹\u0094á\"n\u0083m\u0098à\u007f\u0002îß~3\u008aÌ\u009e¤/\u0005+\u0097séQg÷Å\u0015\u0087gÂ\u0013\u009fÈ\u00111lbÖ\u0002?ø\u0084\r\u0018\u0005Z\u0092§|¶ié5\u0014D®jV2\u00153&B\u0011©\u0018å¡äJ«eH±)\n\u0089×E?ÃuA\u0094eÕ'§\u0088¹\u0010Í6xÀÄSÇVÑò\u00805!z*\u0094\u0018ÊWUÂ\u0085=w¬G_Ú\r¯½å\u0094Æ&ª½\u000b4C±\u0010ÿNÃ\u000f\rÙ\u009aWv,\u009c\u008a$Î×ì g\u00ad\u0005Í^\u0090ìçQ\u0014¾\"f?Ân[À´ýD4âGì\u0002}¥\u001d\u0012¶\u009c@5\u000f»\u0016¿k²_ê\u0081Q\u0098-6H¯\u001fNÄzDv$I¨5¬.\u0002¥O\u0000\u00949i8\u0015Kgu'\u0013\u000b4°Ç¶eÖ\u008fµ¨W\b®\u0087y\bç\u008c\u0014B\f=X®\u0005Î\u0082*Î\u0016ä{\u0097\u0094ÿyc\u000bzTê=É 'ô\u009eÉþ\nmû\u001cºåW·\u0098ú\u0016ÑðÔ\u0003è8i/§J\u0097g\\\u0017Ê-¡+ÒG\u0006N\u0080/eÈ5\u0086Jy Y\u0005\bR/²\u001fÜ\u0011\u0094?V\u0095~¹ó@îÅ\u008f\u0018ÈÄiÝ$y\u0001àú>G!Ë½*º\u008c`\u0018¬\tË\u001cÔPÙVÉF\u008a¡hW;\u00820\u0019A¢s4¦\u0096J~(\u00066êc\r_y/\u0007\u009fÎSÝEô%Ä\u000b\u0013BÓÎ\u0007d\bHVb @IqV\u001f¥\u001ea#[\u008a\u0095 \u008d\\\u007fÍ\u001dö\u001f\u0097e\u0017\u000f$ýÕ\u0011\n\u0083\u0010\"\u0088\"ñCe\u0005XÈ1\u00ad\u001dYý½\u0089@\u0082¼ß\u001eGèû§\\\u0000¡\u0083\u001f8´\u0019T'\u0017ü\u0090`i\b×Û?\"\u0003ß9ËK\u001d ©\u0010UÐª\u009c§;xËN\u00894t\u0087v»põÈÈã|¡'¢5ÓÄ`\u009eNw4ö\u0010\u0084ÆµIÝ\u0004\u008a\u001b\u001d¥²\u00102*²\n3:áÍR\u00ad«\u009cq\u0086ÏÍu¥y£\u0094ùçwº\u0002\u0082\u0099ñ\\¼\u0086`Çßä1,\u0011\u007fk\u0017\u0013h\u009cñ\u0091ª\u008cs;\u0006y«\u000es\u0088SR$r&Ö#Æ_®Üá=½û¨\u000f\u000f\u0080\u0012þ\u0010\u001a0Ö\u0010\u0003\u0018*ö'&u\u0083ÛÍE\u009b\u0010\u0095\u0002!íZíírß)ð?Q¨:@\u0018ùº2wÙÈºÍaÔ\u008dÐ\u0085É&ñåI¾âhV~5@!\u00adú\u0087\"u\u00ad%jÕ²\u0011i\u0082¿!0§ø6À\fÑð?úì[=ÞGsí\u008d*x!<\u009eeYY¥Õ\u009e\u0015âoc¯¿¬(¯.\f²µ£\u0091_Õ{\u007f8¼z\u0012\u0016¼\u0002¦ï\u008e)¼ÓoÌg·+ê\u009aj\u0080EÏ¸Î\u008fé2Kõ\u008f\u008aûõ\u0098p¸\u0086\u008aR\u008c\u0080x\u0011:HF\u0097\u0011T;®\u0001Ìþ=è,kN\u009f\u00904Ï3 \u0097Tã\u009c¡'¦+H>ß\u0094*B«\u0089\u001fu\u0081\u0080¾o¸#ç\u009dêßHM\u0007\u0086Í\u0081\u0083³6\u0081 ÜPÒk9øf\u008d\u0088ÆÃ¼§\u001c,*\u008dk+¨R\u001bwÀÜØ/4\u0097¯i¢w~ß\u0003\u0089\u0001ÁÇ\n¥á¾O\u0018 \u000bµøáûé\u0016xºí¼Âª\u0086r\u0098pm\u009a½<Í\u001al\u008e\u000bó\\\u009bXG-L\u001fÂ\rv%ëÃ8WëPùì\"þfrIOy\u0093ôÀ¯Ü3èî}yÏV\u0096\u0096Ç\u001f\u0084û8\fla\u009d\u0019w¬ÿ\u00016\u0018PCA£ö\u0090>~+7Ö¸óu^+6¸\u008câÚ§'+ÎÈì÷:\u008b\u0011M{ö¼w6\u008dßVµ\u008b\u0014/BÄªî\u0013rº\u0018çA\u0010ÊÄ\u0012\u00149\u000f\u008a®\rºügS\u008d´¡\u0018I\u0005\u0080!Ñ\u0005\u0001\u0087\u0001p\u009f8ð\u0001\u008c\u0017t9¯\u0006N$ÀD\u0010+ö/\" £Ì\tc·Øò\u0016Þ\u009bê\u0010°áÌÉ°mÈ§uhü¶@+m6";
      int var7 = "\u001b[´\u0084äÐ\u001eáV\u00881DÝPç*\u0010@\u0097ì\u001aÐè Ç¨Î\u001aOÄ\u0096\u000e¼ !S\u0004$¢|\u0099g*Ìð\f\u0095ü\u00065\u0098Oî\u0004Ã\u0080l\u009a\u0083\u0083È¢Àþv\u001b\u0010@TÓ\u008e¨¸à8ÕU\n\u0099#N«ä@\u009d¤\u0084\\´,X4Z\u00160&øæ² {G^åè÷þÓ\u0088\u00ad7Ç¯nüÕCK×.\nvDEÏ\u0014\u0018\u009auuøÒñR-oi\u0088\u007fí³Ó×8\bJ\u0089Ý\u0090¢[¨þët\u0001ý%·`!\u008d\u0016bJ\u008f\u0010TL\u0092Í\u0080Ô\u0001½1×9\u0095Qpx\u0019òá \u0095\u0092T¶Ü\u0084)\u00ad^\n\tï\u0099½ÎN×}T¿\u000e6\u001f\"AèÔ\u0011*\u0003\u009a\u00ad¶³å\u009bàÁ\u0004¹\u0094á\"n\u0083m\u0098à\u007f\u0002îß~3\u008aÌ\u009e¤/\u0005+\u0097séQg÷Å\u0015\u0087gÂ\u0013\u009fÈ\u00111lbÖ\u0002?ø\u0084\r\u0018\u0005Z\u0092§|¶ié5\u0014D®jV2\u00153&B\u0011©\u0018å¡äJ«eH±)\n\u0089×E?ÃuA\u0094eÕ'§\u0088¹\u0010Í6xÀÄSÇVÑò\u00805!z*\u0094\u0018ÊWUÂ\u0085=w¬G_Ú\r¯½å\u0094Æ&ª½\u000b4C±\u0010ÿNÃ\u000f\rÙ\u009aWv,\u009c\u008a$Î×ì g\u00ad\u0005Í^\u0090ìçQ\u0014¾\"f?Ân[À´ýD4âGì\u0002}¥\u001d\u0012¶\u009c@5\u000f»\u0016¿k²_ê\u0081Q\u0098-6H¯\u001fNÄzDv$I¨5¬.\u0002¥O\u0000\u00949i8\u0015Kgu'\u0013\u000b4°Ç¶eÖ\u008fµ¨W\b®\u0087y\bç\u008c\u0014B\f=X®\u0005Î\u0082*Î\u0016ä{\u0097\u0094ÿyc\u000bzTê=É 'ô\u009eÉþ\nmû\u001cºåW·\u0098ú\u0016ÑðÔ\u0003è8i/§J\u0097g\\\u0017Ê-¡+ÒG\u0006N\u0080/eÈ5\u0086Jy Y\u0005\bR/²\u001fÜ\u0011\u0094?V\u0095~¹ó@îÅ\u008f\u0018ÈÄiÝ$y\u0001àú>G!Ë½*º\u008c`\u0018¬\tË\u001cÔPÙVÉF\u008a¡hW;\u00820\u0019A¢s4¦\u0096J~(\u00066êc\r_y/\u0007\u009fÎSÝEô%Ä\u000b\u0013BÓÎ\u0007d\bHVb @IqV\u001f¥\u001ea#[\u008a\u0095 \u008d\\\u007fÍ\u001dö\u001f\u0097e\u0017\u000f$ýÕ\u0011\n\u0083\u0010\"\u0088\"ñCe\u0005XÈ1\u00ad\u001dYý½\u0089@\u0082¼ß\u001eGèû§\\\u0000¡\u0083\u001f8´\u0019T'\u0017ü\u0090`i\b×Û?\"\u0003ß9ËK\u001d ©\u0010UÐª\u009c§;xËN\u00894t\u0087v»põÈÈã|¡'¢5ÓÄ`\u009eNw4ö\u0010\u0084ÆµIÝ\u0004\u008a\u001b\u001d¥²\u00102*²\n3:áÍR\u00ad«\u009cq\u0086ÏÍu¥y£\u0094ùçwº\u0002\u0082\u0099ñ\\¼\u0086`Çßä1,\u0011\u007fk\u0017\u0013h\u009cñ\u0091ª\u008cs;\u0006y«\u000es\u0088SR$r&Ö#Æ_®Üá=½û¨\u000f\u000f\u0080\u0012þ\u0010\u001a0Ö\u0010\u0003\u0018*ö'&u\u0083ÛÍE\u009b\u0010\u0095\u0002!íZíírß)ð?Q¨:@\u0018ùº2wÙÈºÍaÔ\u008dÐ\u0085É&ñåI¾âhV~5@!\u00adú\u0087\"u\u00ad%jÕ²\u0011i\u0082¿!0§ø6À\fÑð?úì[=ÞGsí\u008d*x!<\u009eeYY¥Õ\u009e\u0015âoc¯¿¬(¯.\f²µ£\u0091_Õ{\u007f8¼z\u0012\u0016¼\u0002¦ï\u008e)¼ÓoÌg·+ê\u009aj\u0080EÏ¸Î\u008fé2Kõ\u008f\u008aûõ\u0098p¸\u0086\u008aR\u008c\u0080x\u0011:HF\u0097\u0011T;®\u0001Ìþ=è,kN\u009f\u00904Ï3 \u0097Tã\u009c¡'¦+H>ß\u0094*B«\u0089\u001fu\u0081\u0080¾o¸#ç\u009dêßHM\u0007\u0086Í\u0081\u0083³6\u0081 ÜPÒk9øf\u008d\u0088ÆÃ¼§\u001c,*\u008dk+¨R\u001bwÀÜØ/4\u0097¯i¢w~ß\u0003\u0089\u0001ÁÇ\n¥á¾O\u0018 \u000bµøáûé\u0016xºí¼Âª\u0086r\u0098pm\u009a½<Í\u001al\u008e\u000bó\\\u009bXG-L\u001fÂ\rv%ëÃ8WëPùì\"þfrIOy\u0093ôÀ¯Ü3èî}yÏV\u0096\u0096Ç\u001f\u0084û8\fla\u009d\u0019w¬ÿ\u00016\u0018PCA£ö\u0090>~+7Ö¸óu^+6¸\u008câÚ§'+ÎÈì÷:\u008b\u0011M{ö¼w6\u008dßVµ\u008b\u0014/BÄªî\u0013rº\u0018çA\u0010ÊÄ\u0012\u00149\u000f\u008a®\rºügS\u008d´¡\u0018I\u0005\u0080!Ñ\u0005\u0001\u0087\u0001p\u009f8ð\u0001\u008c\u0017t9¯\u0006N$ÀD\u0010+ö/\" £Ì\tc·Øò\u0016Þ\u009bê\u0010°áÌÉ°mÈ§uhü¶@+m6"
         .length();
      char var8 = 16;
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
                     CONST_G = var4;
                     CONST_H = new String[30];
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

                  var6 = "u|x¶¢PÒ\u009c®\u0001¬{YÒ\u0000²\u0088iþ\u0094Ñ\u0001¡\u000eñ»ò\u0096B½\u009c\u0094¥\u009d\u000fÄ\u0096h°v\u0007ãûJ\u001a\u0080¼Ê®\u0081*poëãÏ£\bfÊf{ d´¾Æí\u008cC^\u0082\u0090\u0005\u0016\u009d\u008eÞ6\u007f\u0096\rC\u0004bH±\b\u008b'+Y@T¢¡\u000e§h\u009eÆ>ÑÐór\u0002 ]\u008dÔæ\u000f\u0087\u00893\n\u0081W\u008eùÏ\u009c\u009eK=\u0087ç\u001b)_\u001c\u0081yá\u0013²\u0017\u0005\u001aéè\u0016±E ¶\u0097AÉ\r)À";
                  var7 = "u|x¶¢PÒ\u009c®\u0001¬{YÒ\u0000²\u0088iþ\u0094Ñ\u0001¡\u000eñ»ò\u0096B½\u009c\u0094¥\u009d\u000fÄ\u0096h°v\u0007ãûJ\u001a\u0080¼Ê®\u0081*poëãÏ£\bfÊf{ d´¾Æí\u008cC^\u0082\u0090\u0005\u0016\u009d\u008eÞ6\u007f\u0096\rC\u0004bH±\b\u008b'+Y@T¢¡\u000e§h\u009eÆ>ÑÐór\u0002 ]\u008dÔæ\u000f\u0087\u00893\n\u0081W\u008eùÏ\u009c\u009eK=\u0087ç\u001b)_\u001c\u0081yá\u0013²\u0017\u0005\u001aéè\u0016±E ¶\u0097AÉ\r)À"
                     .length();
                  var8 = 16;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2725;
      if (CONST_H[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_I.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_I.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/d0", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_G[var3].getBytes("ISO-8859-1");
         CONST_H[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_H[var3];
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
         throw new RuntimeException("rip/breeze/client/d0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
