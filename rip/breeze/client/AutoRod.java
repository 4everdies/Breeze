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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(
   a = "AutoRod",
   b = "Automatically attacks enemies using your rod.",
   d = {rip.breeze.ModuleCategory.COMBAT, rip.breeze.ModuleCategory.MISC},
   c = {"auto", "bot", "rod", "fishing", "hotkey"}
)
public class AutoRod extends BreezeModule implements IBreezeInterface2 {
   private final GenericSetting<EnumType35> modeSetting;
   private final GenericSetting<SpeedMode2> rotationModeSetting;
   private final GenericSetting<rip.breeze.RangeValue> rodTimeSetting;
   private final GenericSetting<Integer> coolDownSetting;
   private final GenericSetting<rip.breeze.RangeValue> fOVSetting;
   private final GenericSetting<Integer> dataBuilder54_s;
   private int fieldInt_t;
   private Util133 dataBuilder112_u;
   private Util133 dataBuilder112_v;
   private int fieldInt_w;
   private boolean fieldBool_x;
   private boolean fieldBool_y;
   private boolean fieldBool_z;
   private static boolean fieldBool_A;
   private static final String[] CONST_C;
   private static final String[] CONST_D;
   private static final Map CONST_E = new HashMap(13);

   public AutoRod() {
      long var1 = 83510501448173L;
      super();
      short var10002 = 20142;
      long var10003 = 4828321656378460023L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Mode");
      var10002 = 3610;
      var10003 = 4777967815084918729L ^ var1;
      this.modeSetting = var10001.getDataBuilder50_3("Automatic or toggle modes.").getDataBuilder50_4(EnumType35.AUTO).getDataBuilder54();
      var10002 = 30482;
      var10003 = 5834466776359714499L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "RotationMode");
      var10002 = 15400;
      var10003 = 6159421507144218099L ^ var1;
      this.rotationModeSetting = var10001.getDataBuilder50_3(
            "The rotation mode of AutoRod:\n\tLegit: Spoofs both your rotation and movement to bypass almost any anti-cheat.\n\tSilent: Spoofs just your rotation, for most servers this is fine.\n\tNone: Does not rotate at all and just throws the rod to wherever you are looking already."
         )
         .getDataBuilder50_4(SpeedMode2.NONE)
         .getDataBuilder54();
      var10002 = 25420;
      var10003 = 3547381090191452818L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "RodTime");
      var10002 = 22154;
      var10003 = 5240532178091482973L ^ var1;
      this.rodTimeSetting = var10001.getDataBuilder50_3("The delay between switching hotbar slots.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(300.0, 600.0))
         .clamp(rip.breeze.RangeValue.getPredicate_3(0, 1000))
         .getDataBuilder54();
      var10002 = 7518;
      var10003 = 4856113874449224836L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "CoolDown");
      var10002 = 506;
      var10003 = 4434953649458104354L ^ var1;
      this.coolDownSetting = var10001.getDataBuilder50_3("The delay between swings.")
         .getDataBuilder50_4(500)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 1000))
         .getDataBuilder50_9(AutoRod::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 29232;
      var10003 = 3472580331797789669L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "How far away a player has to be to target them.");
      var10002 = 29561;
      var10003 = 8859471803053554349L ^ var1;
      this.fOVSetting = var10001.getDataBuilder50_3("FOV")
         .getDataBuilder50_4(new rip.breeze.RangeValue(3.8, 8.0))
         .clamp(rip.breeze.RangeValue.getPredicate_2(0.0, 16.0))
         .getDataBuilder50_9(AutoRod::lambda$new_Inner1)
         .getDataBuilder54();
      this.dataBuilder54_s = GenericSetting.<Integer>getDataBuilder50(this, "FOV")
         .getDataBuilder50_3("The maximum angle to target a player.")
         .getDataBuilder50_4(80)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 360))
         .getDataBuilder50_9(AutoRod::lambda$new_Inner2)
         .getDataBuilder54();
      this.fieldInt_t = -1;
      this.dataBuilder112_u = new Util133();
      this.dataBuilder112_v = new Util133();
      this.fieldInt_w = 0;
      this.fieldBool_x = false;
      this.fieldBool_y = false;
      this.fieldBool_z = false;
   }

   public void update() {
      BreezeClient.getModuleRegistry().applyRotation(this);
   }

   public void update_1() {
      BreezeClient.getModuleRegistry().initialize(this);
   }

   public int getValue() {
      return 5;
   }

   @Override
   public String getString() {
      long var1 = 94639785842642L;
      switch (Util115.CONST_A[this.modeSetting.getObject_m().ordinal()]) {
         case 1:
            return "Toggle";
         case 2:
            return "Auto";
         default:
            return "";
      }
   }

   public void updateRotation(ModuleRegistry var1) {
      long var2 = 117735033473270L;
      int[] var4 = AimAssist.getStateArray();
      if (this.fieldBool_z) {
         boolean var9 = BreezeClient.CONST_A.thePlayer.fishEntity != null
            && (
               BreezeClient.CONST_A.thePlayer.fishEntity.onGround
                  || BreezeClient.CONST_A.thePlayer.fishEntity.isInWater()
                  || BreezeClient.CONST_A.thePlayer.fishEntity.caughtEntity != null
            );
         if (var9 || this.dataBuilder112_v.isValid(this.fieldInt_w)) {
            this.update();
            if (this.modeSetting.getObject_m() == EnumType35.TOGGLE) {
               this.b(false);
               if (var4 != null) {
                  return;
               }
            }

            this.dataBuilder112_u.getDataBuilder112();
         }
      } else if (BreezeClient.CONST_A.currentScreen != null) {
         if (this.modeSetting.isValid(EnumType35.TOGGLE)) {
            this.b(false);
         }

         this.update();
      } else {
         EntityPlayer var5 = this.getDistance_2();
         if (var5 == null) {
            if (this.modeSetting.isValid(EnumType35.TOGGLE)) {
               this.b(false);
            }

            this.update();
         } else {
            if (this.modeSetting.isValid(EnumType35.AUTO)) {
               float[] var6 = RotationUtil7.getAnglesTo(BlockUtil7.getVec3_2(BreezeClient.CONST_A.thePlayer.getEntityBoundingBox()), var5, false);
               var6[0] = RotationUtil7.calculateFloat(var6[0]);
               float var7 = RotationUtil7.calculateFloat(var5.rotationYaw);
               if (Math.abs(var6[0] - var7) > 60.0F) {
                  this.update();
                  return;
               }
            }

            int var10 = this.getValue_2();
            if (var10 == -1) {
               if (this.modeSetting.isValid(EnumType35.TOGGLE)) {
                  this.b(false);
               }

               this.update();
            } else if (this.modeSetting.getObject_m() != EnumType35.AUTO || this.dataBuilder112_u.isValid(this.coolDownSetting.getObject_m().intValue())) {
               if (!BreezeClient.CONST_A.thePlayer.isUsingItem()) {
                  float[] var11 = this.getDistance(var5);
                  if (this.modeSetting.isValid(EnumType35.AUTO)
                     && RotationUtil7.absValue(BreezeClient.CONST_A.thePlayer.rotationYaw, var11[0]) > this.dataBuilder54_s.getObject_m().intValue() / 2.0F) {
                     this.update();
                  } else {
                     boolean var8;
                     label105: {
                        var8 = false;
                        if (!this.rotationModeSetting.isValid(SpeedMode2.NONE)) {
                           var1.isActive_2(this.rotationModeSetting.isValid(SpeedMode2.LEGIT));
                           var1.isActive(false);
                           if (!this.dataBuilder112_v.isValid(this.fieldInt_w)) {
                              break label105;
                           }

                           var8 = var1.absValue(var11[0], var11[1], 30.0F);
                           if (var4 != null) {
                              break label105;
                           }
                        }

                        if (this.dataBuilder112_v.isValid(this.fieldInt_w)) {
                           var8 = true;
                        }
                     }

                     if (!var8) {
                        this.fieldBool_y = false;
                     }

                     if (BreezeClient.CONST_A.thePlayer.inventory.currentItem != var10) {
                        this.fieldInt_t = BreezeClient.CONST_A.thePlayer.inventory.currentItem;
                        BreezeClient.CONST_A.thePlayer.inventory.currentItem = var10;
                     } else {
                        if (!BreezeClient.CONST_A.thePlayer.isUsingItem() && this.dataBuilder112_v.isValid(this.fieldInt_w) && this.fieldBool_y) {
                           this.fieldInt_w = (int)this.rodTimeSetting.getObject_m().calculateDouble_2();
                           this.dataBuilder112_v.getDataBuilder112();
                           this.fieldBool_x = true;
                           MinecraftAccessor.initialize_22(BreezeClient.CONST_A);
                           this.fieldBool_x = false;
                           this.fieldBool_z = true;
                        }

                        if (var8) {
                           this.fieldBool_y = true;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private float[] getDistance(EntityPlayer var1) {
      float var2 = var1.getDistanceToEntity(BreezeClient.CONST_A.thePlayer);
      int var3 = (int)(3.0 + Math.sqrt(var2));
      AxisAlignedBB var4 = BlockUtil10.getAxisAlignedBB(var1, var3);
      Vec3 var5 = BlockUtil7.getVec3_2(var4);
      return RotationUtil7.getAnglesTo(
         new Vec3(
            var5.xCoord,
            var5.yCoord + 0.1F + 0.1F * BreezeClient.CONST_A.thePlayer.getDistance(var5.xCoord, BreezeClient.CONST_A.thePlayer.posY, var5.zCoord),
            var5.zCoord
         ),
         BreezeClient.CONST_A.thePlayer
      );
   }

   private void update() {
      long var1 = 120283019443240L;
      this.fieldBool_z = false;
      if (this.fieldInt_t != -1) {
         BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_t;
         this.fieldInt_t = -1;
      }
   }

   private EntityPlayer getDistance_2() {
      long var1 = 127755364667437L;
      int[] var3 = AimAssist.getStateArray();
      if (BreezeClient.CONST_A.theWorld.playerEntities.isEmpty()) {
         return null;
      }

      if (BreezeClient.getThemeManager().getEntity() != null && BreezeClient.getThemeManager().getEntity() instanceof EntityPlayer) {
         float var4 = BreezeClient.getThemeManager().getEntity().getDistanceToEntity(BreezeClient.CONST_A.thePlayer);
         if (this.fOVSetting.getObject_m().isValid(var4) || this.modeSetting.isValid(EnumType35.TOGGLE) && var4 < 20.0F) {
            return (EntityPlayer)BreezeClient.getThemeManager().getEntity();
         }
      }

      EntityPlayer var10 = null;
      double var5 = this.fOVSetting.getObject_m().double_c;

      for (EntityPlayer var8 : BreezeClient.CONST_A.theWorld.playerEntities) {
         if ((AntiBot.isInvisible_3(var8) || var3 == null) && var8 != BreezeClient.CONST_A.thePlayer && (!var8.isInvisible() || var3 == null)) {
            float var9 = var8.getDistanceToEntity(BreezeClient.CONST_A.thePlayer);
            if (var8.getDistanceToEntity(BreezeClient.CONST_A.thePlayer) < var5
               && (this.fOVSetting.getObject_m().isValid(var9) || this.modeSetting.isValid(EnumType35.TOGGLE) && var9 < 20.0F)) {
               var5 = var9;
               var10 = var8;
            }

            if (var3 == null) {
               break;
            }
         }
      }

      return var10;
   }

   private int getValue_2() {
      long var1 = 31472429340602L;
      int[] var10000 = AimAssist.getStateArray();
      int var3 = 0;
      int[] var4 = var10000;

      while (var3 < 9) {
         if (BreezeClient.CONST_A.thePlayer.inventory.mainInventory[var3] != null
            && BreezeClient.CONST_A.thePlayer.inventory.mainInventory[var3].getItem() instanceof ItemFishingRod) {
            return var3;
         }

         var3++;
         if (var4 == null) {
            break;
         }
      }

      return -1;
   }

   private static boolean lambda$new_Inner2(rip.breeze.DateUtil var0) {
      long var1 = 115509337308966L;
      return var0.getObject("Mode", EnumType35.class) == EnumType35.AUTO;
   }

   private static boolean lambda$new_Inner1(rip.breeze.DateUtil var0) {
      long var1 = 32038792304562L;
      return var0.getObject("Mode", EnumType35.class) == EnumType35.AUTO;
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 19127746778151L;
      return var0.getObject("Mode", EnumType35.class) == EnumType35.AUTO;
   }

   public static void toggle(boolean var0) {
      fieldBool_A = var0;
   }

   public static boolean isValid() {
      return fieldBool_A;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid();
      return !var0;
   }

   static {
      long var0 = 107595645803781L;
      toggle(false);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[15];
      int var5 = 0;
      String var6 = "ëõ6<¼oÂ¡S¤z>àné¨¬z\u00895t\t[Rê\u0095Ëz\u001fÃäx\u001bô;uÄ«DI)á»üÀxê«\u0010uoÒÁÃJàÔ«Ê`÷·ä\u0018\u0099 \u008eA$\u0004\u0089y\u0005/V\u0000;\u009fª\u00923\u0013ÅCàémõ\u000e\u0092SÄI\u0081¹@;É\u0010úG\u0086¢\u0004\u0080¥ Åf\u0003\bêè\u0019;H!ñ#É\u0082ªòÏ\u0099ªZ#Ãé\u009d!Í]ìk\u0015WZä\u000f\u001eQ\u0093Ò\u0015}#0\u0082Ð»r\u0094L¥!ìé8âúá\u0084Õî»lu¤\u009b¨D¹7\u001dm\u008fÖ+\u008dqé¨3X4·\u0010\u0016]Þ¨qj\u0014\u000b\u001fÐ\u0096\t\u0085\u001b6\u0092\u0010¤\u0089\u001d_\u0005¡·\u008cyäqæÊ\u000b\u001bÁPKu}\u0088ä\u0012\u009a\u0007c\u0013\u009e§º\u00889\u00adgHB³\u000e8ìR×L\u008a*:×\u0001X\u009f8no3ºØ%g$Oº¹\u001eKÒ¥m\u009f\n\u0085\t7Ûyµ %¸\u0006Ìvi7\u0097z\u001fDÛ@y\n\u009d$<\u001e\r\u0014Ƙ:Úb¢èl*~\u0085\u008fÄ(\u0082I\u0014r\\7\u0019aøÜZ\u0004Þ3\u008d§L3\u000f \u009fÿ|bµ÷\u0094Ü§Õv\u0087\u0098ËCß9ü×døQÑñêõ\u0093þ¾+\n(\u0012æÏÕ1ã\u0091\"b\u001e\u0097\u00ad\u008b»b\u009b¦²+HB\"1ì¥\u0099q\n*Ã ªÿ\u001fi\u0017ÆW·5iâÚë\u0005\tA\u00882U\u008aÞw|r_#3Ä<-j\u008aÈ\u0095:\u00059'UD\u0095?%:\u0094h¯-6ú»\u000ej\u0083\u001a\u001b\u009c!Äéi.\u0081âR\u009e_¹o\"R\u0085\u009f#ÁËyë\f\u0019å\u0082À\n\u0018,Ü{Ï'\u0083d\u0097\u0087\u001f_X\u009fªÉ)\u0082\\cÛR\u009f]·c\f\u00909nY\u001c×\u001a\u0002\u0017\u001c¥\u008c\u0013V!N\u0084x£{©\u0004ç\u0094\u0014L\u0002§tú\u0096~J!m\u0000\u0090T\u0004¸\u008dj\u0019\r¢U_\u0019Î\u0099\u0097\u0092\u0099p´\u0007\u0097ß\u0088y\u009dí\u009cvÊ\u009cR}04ÍrÓÊ\u0010d8\u0016\u0014\u0001\u009a>u$\u0016¹\u0097Ë7Q\u001e\u0094bá;ó¹3`G\u009a\u0002\u0096¥T@Ë\u0088!\u009fí\u0094®nF4\"êY!×H\u000b\u0081\u009dÝÍz óû\u009dÅ¸\u008c\u0007R4qnÎ.Lõ\u0088+5ÿµ\u0088É\u0003\"8\u0019\u0089\u008c\u0084ß»Ðö\u0015\u0017Uà\u0082\u00005ó{ü\u008apªR \u009a\u001f~\u0096*lãlýqa3v:O\u00113\t?hV¦\u008dçÛ \u0006u\u008e©Õn²\u001eÇ÷g?¸¶Ôk)|?ÑE\u0094v4\u008eX\u008b=ÖT6´\u0010G]DÚ\u001bc¶\u008fHrøçÀ\u001a®ò88\u008c÷Ù\"¥e¬\u008c&óË\u0000¼ðZOóP\u009f´\u0002\u0099öæf!\u0011 RéõÜ UsõúÐ\u0005ë\u0007üÎi\u0007s$ÐÛÆ@rM\u0012æ\u0010\u007f¿<BëÜ[ýA\b\u008cÈúí^]";
      int var7 = "ëõ6<¼oÂ¡S¤z>àné¨¬z\u00895t\t[Rê\u0095Ëz\u001fÃäx\u001bô;uÄ«DI)á»üÀxê«\u0010uoÒÁÃJàÔ«Ê`÷·ä\u0018\u0099 \u008eA$\u0004\u0089y\u0005/V\u0000;\u009fª\u00923\u0013ÅCàémõ\u000e\u0092SÄI\u0081¹@;É\u0010úG\u0086¢\u0004\u0080¥ Åf\u0003\bêè\u0019;H!ñ#É\u0082ªòÏ\u0099ªZ#Ãé\u009d!Í]ìk\u0015WZä\u000f\u001eQ\u0093Ò\u0015}#0\u0082Ð»r\u0094L¥!ìé8âúá\u0084Õî»lu¤\u009b¨D¹7\u001dm\u008fÖ+\u008dqé¨3X4·\u0010\u0016]Þ¨qj\u0014\u000b\u001fÐ\u0096\t\u0085\u001b6\u0092\u0010¤\u0089\u001d_\u0005¡·\u008cyäqæÊ\u000b\u001bÁPKu}\u0088ä\u0012\u009a\u0007c\u0013\u009e§º\u00889\u00adgHB³\u000e8ìR×L\u008a*:×\u0001X\u009f8no3ºØ%g$Oº¹\u001eKÒ¥m\u009f\n\u0085\t7Ûyµ %¸\u0006Ìvi7\u0097z\u001fDÛ@y\n\u009d$<\u001e\r\u0014Ƙ:Úb¢èl*~\u0085\u008fÄ(\u0082I\u0014r\\7\u0019aøÜZ\u0004Þ3\u008d§L3\u000f \u009fÿ|bµ÷\u0094Ü§Õv\u0087\u0098ËCß9ü×døQÑñêõ\u0093þ¾+\n(\u0012æÏÕ1ã\u0091\"b\u001e\u0097\u00ad\u008b»b\u009b¦²+HB\"1ì¥\u0099q\n*Ã ªÿ\u001fi\u0017ÆW·5iâÚë\u0005\tA\u00882U\u008aÞw|r_#3Ä<-j\u008aÈ\u0095:\u00059'UD\u0095?%:\u0094h¯-6ú»\u000ej\u0083\u001a\u001b\u009c!Äéi.\u0081âR\u009e_¹o\"R\u0085\u009f#ÁËyë\f\u0019å\u0082À\n\u0018,Ü{Ï'\u0083d\u0097\u0087\u001f_X\u009fªÉ)\u0082\\cÛR\u009f]·c\f\u00909nY\u001c×\u001a\u0002\u0017\u001c¥\u008c\u0013V!N\u0084x£{©\u0004ç\u0094\u0014L\u0002§tú\u0096~J!m\u0000\u0090T\u0004¸\u008dj\u0019\r¢U_\u0019Î\u0099\u0097\u0092\u0099p´\u0007\u0097ß\u0088y\u009dí\u009cvÊ\u009cR}04ÍrÓÊ\u0010d8\u0016\u0014\u0001\u009a>u$\u0016¹\u0097Ë7Q\u001e\u0094bá;ó¹3`G\u009a\u0002\u0096¥T@Ë\u0088!\u009fí\u0094®nF4\"êY!×H\u000b\u0081\u009dÝÍz óû\u009dÅ¸\u008c\u0007R4qnÎ.Lõ\u0088+5ÿµ\u0088É\u0003\"8\u0019\u0089\u008c\u0084ß»Ðö\u0015\u0017Uà\u0082\u00005ó{ü\u008apªR \u009a\u001f~\u0096*lãlýqa3v:O\u00113\t?hV¦\u008dçÛ \u0006u\u008e©Õn²\u001eÇ÷g?¸¶Ôk)|?ÑE\u0094v4\u008eX\u008b=ÖT6´\u0010G]DÚ\u001bc¶\u008fHrøçÀ\u001a®ò88\u008c÷Ù\"¥e¬\u008c&óË\u0000¼ðZOóP\u009f´\u0002\u0099öæf!\u0011 RéõÜ UsõúÐ\u0005ë\u0007üÎi\u0007s$ÐÛÆ@rM\u0012æ\u0010\u007f¿<BëÜ[ýA\b\u008cÈúí^]"
         .length();
      char var8 = '0';
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
                     CONST_C = var4;
                     CONST_D = new String[15];
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

                  var6 = "OF¡Gè\u009d\u0012|¤!&i\u0011%q\u0011@ÊJ¬Ù\fßÿ\u0084\u0005õ®è6_TÁ(0T½Ë¼çw'Ô§Ûè Ó¬_1¼õï\u008fé¡ú]º³\f©\t¥(\u000e/\u0094\u0000\u0004Á\u000bsÞ¾\u009f®\fk\u0081";
                  var7 = "OF¡Gè\u009d\u0012|¤!&i\u0011%q\u0011@ÊJ¬Ù\fßÿ\u0084\u0005õ®è6_TÁ(0T½Ë¼çw'Ô§Ûè Ó¬_1¼õï\u008fé¡ú]º³\f©\t¥(\u000e/\u0094\u0000\u0004Á\u000bsÞ¾\u009f®\fk\u0081"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20542;
      if (CONST_D[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_E.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dj", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C[var3].getBytes("ISO-8859-1");
         CONST_D[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_D[var3];
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
         throw new RuntimeException("rip/breeze/client/dj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
