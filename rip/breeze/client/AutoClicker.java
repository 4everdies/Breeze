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
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemSword;
import net.minecraft.util.BlockPos;
import org.lwjgl.input.Mouse;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.ConditionsSetting;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.MathUtil1;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "AutoClicker", b = "Automatically clicks for you.", d = rip.breeze.ModuleCategory.COMBAT, c = {"click", "autoclick", "autoclicker", "trigger"})
public class AutoClicker extends BreezeModule {
   private final GenericSetting<rip.breeze.RangeValue> cPSSetting;
   private final GenericSetting<Boolean> exhaustionSetting;
   private final ConditionsSetting conditionsSetting;
   private final GenericSetting<Boolean> inventoriesSetting;
   private final GenericSetting<Boolean> weaponOnlySetting;
   private final GenericSetting<Boolean> triggerSetting;
   private final GenericSetting<Boolean> breakBlocksSetting;
   private final Random random_u;
   private boolean fieldBool_v;
   private double double_w;
   private double double_x;
   private float fieldFloat_y;
   private long fieldLong_z;
   private long fieldLong_A;
   private long fieldLong_B;
   private long fieldLong_C;
   private float fieldFloat_D;
   private boolean fieldBool_E;
   boolean fieldBool_F;
   private static final String[] CONST_H;
   private static final String[] CONST_I;
   private static final Map CONST_J = new HashMap(13);
   private static final long[] CONST_K;
   private static final Long[] CONST_L;
   private static final Map CONST_M;

   public AutoClicker() {
      long var1 = 51721031439700L;
      super();
      short var10002 = 30442;
      long var10003 = 1192296430189440825L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "CPS");
      var10002 = 5506;
      var10003 = 1905643370652011614L ^ var1;
      this.cPSSetting = var10001.getDataBuilder50_3("How many times to click per second.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(10.0, 12.0))
         .clamp(rip.breeze.RangeValue.getPredicate_2(1.0, 20.0))
         .getDataBuilder54();
      var10002 = 24584;
      var10003 = 5074349251369105884L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Exhaustion");
      var10002 = 28764;
      var10003 = 1483602604609759629L ^ var1;
      this.exhaustionSetting = var10001.getDataBuilder50_3("Simulate exhaustion, makes it look more legit.").getDataBuilder50_4(false).getDataBuilder54();
      short var10004 = 28372;
      long var10005 = 5906623764175484682L ^ var1;
      this.conditionsSetting = new ConditionsSetting(this, "Conditions");
      var10002 = 14539;
      var10003 = 3667932205546643728L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.conditionsSetting, "Inventories");
      var10002 = 6320;
      var10003 = 7317168831639159146L ^ var1;
      this.inventoriesSetting = var10001.getDataBuilder50_3("Also enables auto clicker in inventories.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 12615;
      var10003 = 7015550998301386898L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.conditionsSetting, "WeaponOnly");
      var10002 = 11903;
      var10003 = 379453917844551599L ^ var1;
      this.weaponOnlySetting = var10001.getDataBuilder50_3("Only clicks when there is a weapon in your hand.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 9580;
      var10003 = 7498270319241673907L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.conditionsSetting, "Trigger");
      var10002 = 16609;
      var10003 = 7847471292866517305L ^ var1;
      this.triggerSetting = var10001.getDataBuilder50_3("Only clicks when your crosshair is over a player.").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 5826;
      var10003 = 4372459021789794075L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this.conditionsSetting, "BreakBlocks");
      var10002 = 29191;
      var10003 = 2991779003776986074L ^ var1;
      this.breakBlocksSetting = var10001.getDataBuilder50_3("Allows you to still break blocks with auto clicker enabled.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      this.random_u = new Random();
      this.fieldBool_v = false;
      this.double_w = 0.0;
      this.fieldLong_B = 0L;
      this.fieldLong_C = 0L;
      this.fieldFloat_D = 1.0F;
      this.fieldBool_E = false;
      this.fieldBool_F = false;
   }

   @Override
   protected void initialize() {
      this.double_w = 0.0;
      this.calculate();
   }

   private void calculate() {
      long var1 = 23882731224020L;
      this.fieldFloat_D = 1.0F;
      this.fieldBool_E = false;
      this.fieldLong_B = System.currentTimeMillis() + 2294534249282145350L + this.random_u.nextInt(3000);
      this.fieldLong_C = 0L;
   }

   public String buildString() {
      long var1 = 94639785842642L;
      return String.format("%.1f - %.1f", this.cPSSetting.getObject_m().double_d, this.cPSSetting.getObject_m().double_c);
   }

   @EventListener
   public void updateRotation(PreTickEventEvent var1) {
      long var2 = 104354564354392L;
      int[] var4 = AimAssist.getStateArray();
      if (!BreezeClient.isValid()) {
         if (BreezeContext.moduleBase_a.getModuleByClass(KillAura.class).checkCondition()) {
            this.double_w = 0.0;
         } else if (BreezeContext.moduleBase_a.getModuleByClass(AutoRod.class).f()
            && BreezeClient.CONST_A.thePlayer.getHeldItem() != null
            && BreezeClient.CONST_A.thePlayer.getHeldItem().getItem() instanceof ItemFishingRod) {
            this.double_w = 0.0;
         } else {
            if (System.currentTimeMillis() > this.fieldLong_C && this.fieldBool_E) {
               this.fieldFloat_D = MathUtil1.clamp(this.fieldFloat_D, 1.0F, 0.2F);
               if (this.fieldFloat_D >= 0.95) {
                  this.calculate();
               }
            }

            label39: {
               if (this.triggerSetting.getObject_m() && BreezeClient.CONST_A.currentScreen == null) {
                  this.updateRotation_2();
                  if (var4 != null) {
                     break label39;
                  }
               }

               this.calculate_2();
            }

            if (this.getHeldItem()) {
               this.checkAttackKey();
               if (var4 != null) {
                  return;
               }
            }

            this.fieldLong_B = System.currentTimeMillis() + 8493845964638965500L + this.random_u.nextInt(3000);
            this.fieldBool_F = false;
            this.double_w = 0.0;
         }
      }
   }

   private void updateRotation_2() {
      long var1 = 28544827766783L;
      int[] var10000 = AimAssist.getStateArray();
      float var3 = 40.0F;
      int[] var4 = var10000;

      for (EntityPlayer var6 : BreezeClient.CONST_A.theWorld.playerEntities) {
         if (var6 != BreezeClient.CONST_A.thePlayer && (!(var6.getDistanceToEntity(BreezeClient.CONST_A.thePlayer) > 6.0F) || var4 == null)) {
            float[] var7 = RotationUtil7.getAnglesTo(BlockUtil7.getVec3_2(var6.getEntityBoundingBox()), BreezeClient.CONST_A.thePlayer);
            float var8 = RotationUtil7.absValue(var7[0], BreezeClient.CONST_A.thePlayer.rotationYaw);
            var3 = Math.min(var3, var8);
            if (var4 == null) {
               break;
            }
         }
      }

      this.absValue(var3);
   }

   private void absValue(float var1) {
      long var2 = 98460614809910L;
      int[] var4 = AimAssist.getStateArray();
      if (Math.abs(this.fieldFloat_y - var1) > 5.0F || System.currentTimeMillis() > this.fieldLong_z || this.double_x == 0.0) {
         this.fieldFloat_y = var1;
         this.fieldLong_z = System.currentTimeMillis() + -8913594293500569852L + this.random_u.nextInt(300);
         if (var1 < 15.0F) {
            this.double_x = this.cPSSetting.getObject_m().calculateDouble_2();
            if (var4 != null) {
               return;
            }
         }

         if (var1 != 40.0F) {
            float var5 = (25.0F - (var1 - 15.0F)) / 25.0F;
            this.double_x = this.cPSSetting.getObject_m().calculateDouble_2() * var5;
            if (var4 != null) {
               return;
            }
         }

         this.fieldLong_B = System.currentTimeMillis() + 8493845964638965500L + this.random_u.nextInt(3000);
         this.double_x = 0.0;
      }
   }

   private void calculate_2() {
      long var1 = 45595154314539L;
      if (System.currentTimeMillis() > this.fieldLong_z) {
         this.double_x = this.cPSSetting.getObject_m().calculateDouble_2();
         this.fieldLong_z = System.currentTimeMillis() + 21762421372849557L + this.random_u.nextInt(300);
      }
   }

   private boolean getHeldItem() {
      long var1 = 67274073704358L;
      int[] var3 = AimAssist.getStateArray();
      if (!PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindAttack)) {
         return false;
      }

      if (BreezeClient.CONST_A.currentScreen != null) {
         return BreezeClient.CONST_A.currentScreen instanceof ClickGUI ? false : this.inventoriesSetting.getObject_m();
      }

      if (!this.weaponOnlySetting.getObject_m()) {
         return true;
      }

      if (BreezeClient.CONST_A.thePlayer.getHeldItem() != null) {
         if (BreezeClient.CONST_A.thePlayer.getHeldItem().getItem() instanceof ItemSword) {
            return true;
         } else {
            return BreezeClient.CONST_A.thePlayer.getHeldItem().getItem() instanceof ItemAxe
               ? true
               : Item.getIdFromItem(BreezeClient.CONST_A.thePlayer.getHeldItem().getItem()) == 280;
         }
      } else {
         int var4 = 0;

         while (var4 < 9) {
            if (BreezeClient.CONST_A.thePlayer.inventory.mainInventory[var4] != null) {
               return false;
            }

            var4++;
            if (var3 == null) {
               break;
            }
         }

         return true;
      }
   }

   private void checkAttackKey() {
      long var1 = 110307610446303L;
      int var3 = BreezeClient.CONST_A.gameSettings.keyBindAttack.getKeyCode();
      if (!this.isActive(var3)) {
         if (!this.fieldBool_F) {
            this.fieldBool_F = true;
         } else {
            if (this.exhaustionSetting.getObject_m()) {
               this.toggle();
            }

            this.clamp(var3);
         }
      }
   }

   private boolean isActive(int var1) {
      long var2 = 46438855148722L;
      if (BreezeClient.CONST_A.objectMouseOver != null && this.breakBlocksSetting.getObject_m()) {
         BlockPos var4 = BreezeClient.CONST_A.objectMouseOver.getBlockPos();
         if (var4 != null) {
            Block var5 = BreezeClient.CONST_A.theWorld.getBlockState(var4).getBlock();
            if (var5 != Blocks.air && !(var5 instanceof BlockLiquid)) {
               if (!this.fieldBool_v) {
                  KeyBinding.setKeyBindState(var1, true);
                  KeyBinding.onTick(var1);
               }

               this.fieldBool_v = true;
               this.fieldBool_F = false;
               return true;
            }
         }
      }

      if (this.fieldBool_v) {
         this.fieldBool_v = false;
         KeyBinding.setKeyBindState(var1, false);
         this.fieldBool_F = false;
         return true;
      } else {
         return false;
      }
   }

   private void toggle() {
      long var1 = 98900707307751L;
      if (System.currentTimeMillis() > this.fieldLong_B && !this.fieldBool_E) {
         this.fieldFloat_D = (float)(this.random_u.nextFloat() * 0.2);
         this.fieldLong_C = System.currentTimeMillis() + 200L + this.random_u.nextInt(500);
         this.fieldLong_B = System.currentTimeMillis() + 500L + this.random_u.nextInt(3000);
         this.fieldBool_E = true;
      }
   }

   private void clamp(int var1) {
      long var2 = 123208374336562L;
      int[] var10000 = AimAssist.getStateArray();
      this.double_w = this.double_w + this.double_x * this.fieldFloat_D / 20.0 * (this.random_u.nextGaussian() * 0.3F + 1.0);
      int[] var4 = var10000;
      if (this.double_w >= 1.0 && System.currentTimeMillis() < this.fieldLong_A) {
         KeyBinding.setKeyBindState(var1, false);
      }

      while (this.double_w >= 1.0) {
         this.double_w--;
         KeyBinding.setKeyBindState(var1, true);
         KeyBinding.onTick(var1);
         if (BreezeClient.CONST_A.currentScreen != null) {
            int var5 = Mouse.getEventX() * BreezeClient.CONST_A.currentScreen.width / BreezeClient.CONST_A.displayWidth;
            int var6 = BreezeClient.CONST_A.currentScreen.height
               - Mouse.getEventY() * BreezeClient.CONST_A.currentScreen.height / BreezeClient.CONST_A.displayHeight
               - 1;
            MinecraftAccessor.initialize_27(BreezeClient.CONST_A.currentScreen, var5, var6, 0);
         }

         if (this.double_w < 1.0) {
            int var7 = (int)(500.0 / this.double_x);
            var7 = Math.min(100, var7);
            var7 = (int)MathUtil1.clamp_3(var7 + var7 * this.random_u.nextGaussian() * 0.1, 30.0, 150.0);
            this.fieldLong_A = System.currentTimeMillis() + var7;
            if (var4 != null) {
               continue;
            }
         }

         KeyBinding.setKeyBindState(var1, false);
         if (var4 == null) {
            break;
         }
      }
   }

   @EventListener
   public void onGameLoop(RunGameLoopEventEvent var1) {
      long var2 = 57563551245890L;
      if (System.currentTimeMillis() > this.fieldLong_A && this.fieldLong_A != -1L) {
         this.fieldLong_A = -1L;
         KeyBinding.setKeyBindState(BreezeClient.CONST_A.gameSettings.keyBindAttack.getKeyCode(), false);
      }
   }

   static {
      long var0 = 10071755523497L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[14];
      int var5 = 0;
      String var6 = "a'\tz¿¸Û¬l\u0083¸®Ð\u0094\u001cÆqR`\u0005[\u007fÝ\u0099&ä\u009az´´~\u0088M3\r\u001e«Qh÷\u0001åÅÙÓë'U+ÜYÌÝ\u009eÛÐ][U$?lÇ\u009e\u009e©<\fñÑ=MZc)¡\"â÷³¿Ë¬Ã~ðiÇ\u0018yíÛjU<Ê>R`\u000fi\u009f\u0096\u0097ì\u001dWjÑñ|r\u0092PÉ88ýÂ©M5ÿ[0\u001fÄ\u0097y\u0098-ÉF5¬Ì\u0088.¼lZ\u000f r\u0088E\u0096JºÙ\u0016MØkµÆ:rÁ\fC*\u0005½\u0089{KÖT±Ì4\u0004\u0006è\\ã÷1ÈN\u0010K±cX\u008d\u0097¤½Ð\u0004\u001c/ \u0092\u0091P0i³\u0007xª\u000e\u0097J\u00103ÊØAaÁ^oS·¨\"Wä·\u0094\u0081j¦@\u001b\u0099)âm\u009e\tP$q\u008d8S®¸ôî(\u0090\u0080*ão\u0003Ô½¼ \u0080\u0005¼ßP§{Z\u0088&¬\u0082\u0004°ábÒu\u0011ôio\u0000p¡ÝZ¼e¨g\u001d^8!P` \u0004õqëN¥},·vÄPy\u0083á\u0096\u009e®Îùè\u0002:\u0000\u0082kâ\"\u0097\u001dKk\u0004I\u0086«\u009eÞôw\"q|{Í\u001c >!Ù\u009f w3)^?\u00ad\u009då&î\u0088.\u008a.\u001f\u001a§\nmÎ\rmÚ0t)\u001bV\u0018/üo\u0004\u0087)\u0015Û\u0001j4âH¹\u0018\u0098yÕ\u0093®³ù>\u009cÂ\u0088¿¢%ïÓ\u0001±Ýõ\u0013;ÉD\u0010Ð\u0019ù\u009dd\u00043O\u0081¿\u001ag¾4\u0091tXvE&8\u0086«¥3ÌO\u008eÎ\u001e\u0014\u0007\u0012\u0095¼ÔÔiÖh4î5Î=ÝV¶Ñíõh ókg\u0018,¸FL°ËÌ]\u0090\u009fð\r®\u0012z\u0082wÞ\u0010~üî\u0084¦ß¹u®\ræïµ3I\u0082Âc\u0084°?VÙ\b%a4\u0004\u0098Hþ¾\u0007ìÁo¾GVÂêcZ¾ôgQ6uÆðÔn\u009f\u0091\u0090\u009f\u00830ÓÍ\u0015&¬~}Ó\u0085ÇfFð\u009eJøu§qÞü¥Ö¯%\u0010³Ý\u009f\u0086\u0004¨°AV¬©\u0019êz\\c\u0017 @ÈÏ\u007f?Ì\u0012îf\u0013órlúë#Ú:\u0082íÈà§è\t.¿1´\u0096ù\u0006\u0010´IûIdÃí\u0093³Ã*\u001cÕá²Ú";
      int var7 = "a'\tz¿¸Û¬l\u0083¸®Ð\u0094\u001cÆqR`\u0005[\u007fÝ\u0099&ä\u009az´´~\u0088M3\r\u001e«Qh÷\u0001åÅÙÓë'U+ÜYÌÝ\u009eÛÐ][U$?lÇ\u009e\u009e©<\fñÑ=MZc)¡\"â÷³¿Ë¬Ã~ðiÇ\u0018yíÛjU<Ê>R`\u000fi\u009f\u0096\u0097ì\u001dWjÑñ|r\u0092PÉ88ýÂ©M5ÿ[0\u001fÄ\u0097y\u0098-ÉF5¬Ì\u0088.¼lZ\u000f r\u0088E\u0096JºÙ\u0016MØkµÆ:rÁ\fC*\u0005½\u0089{KÖT±Ì4\u0004\u0006è\\ã÷1ÈN\u0010K±cX\u008d\u0097¤½Ð\u0004\u001c/ \u0092\u0091P0i³\u0007xª\u000e\u0097J\u00103ÊØAaÁ^oS·¨\"Wä·\u0094\u0081j¦@\u001b\u0099)âm\u009e\tP$q\u008d8S®¸ôî(\u0090\u0080*ão\u0003Ô½¼ \u0080\u0005¼ßP§{Z\u0088&¬\u0082\u0004°ábÒu\u0011ôio\u0000p¡ÝZ¼e¨g\u001d^8!P` \u0004õqëN¥},·vÄPy\u0083á\u0096\u009e®Îùè\u0002:\u0000\u0082kâ\"\u0097\u001dKk\u0004I\u0086«\u009eÞôw\"q|{Í\u001c >!Ù\u009f w3)^?\u00ad\u009då&î\u0088.\u008a.\u001f\u001a§\nmÎ\rmÚ0t)\u001bV\u0018/üo\u0004\u0087)\u0015Û\u0001j4âH¹\u0018\u0098yÕ\u0093®³ù>\u009cÂ\u0088¿¢%ïÓ\u0001±Ýõ\u0013;ÉD\u0010Ð\u0019ù\u009dd\u00043O\u0081¿\u001ag¾4\u0091tXvE&8\u0086«¥3ÌO\u008eÎ\u001e\u0014\u0007\u0012\u0095¼ÔÔiÖh4î5Î=ÝV¶Ñíõh ókg\u0018,¸FL°ËÌ]\u0090\u009fð\r®\u0012z\u0082wÞ\u0010~üî\u0084¦ß¹u®\ræïµ3I\u0082Âc\u0084°?VÙ\b%a4\u0004\u0098Hþ¾\u0007ìÁo¾GVÂêcZ¾ôgQ6uÆðÔn\u009f\u0091\u0090\u009f\u00830ÓÍ\u0015&¬~}Ó\u0085ÇfFð\u009eJøu§qÞü¥Ö¯%\u0010³Ý\u009f\u0086\u0004¨°AV¬©\u0019êz\\c\u0017 @ÈÏ\u007f?Ì\u0012îf\u0013órlúë#Ú:\u0082íÈà§è\t.¿1´\u0096ù\u0006\u0010´IûIdÃí\u0093³Ã*\u001cÕá²Ú"
         .length();
      char var8 = 'X';
      int var23 = -1;

      label54:
      while (true) {
         String var25 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var36;
                  if ((var23 += var8) >= var7) {
                     CONST_H = var4;
                     CONST_I = new String[14];
                     CONST_M = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[8];
                     int var14 = 0;
                     String var15 = "EMí&þÊj\u0099\u0097\u0003|À\fY÷âÆ4¨\tò'\u009f½Pæc\u0003Á\u0082¶ÿÎ8þ)j;\u008dßüéu\u008fÁó(¤";
                     int var16 = "EMí&þÊj\u0099\u0097\u0003|À\fY÷âÆ4¨\tò'\u009f½Pæc\u0003Á\u0082¶ÿÎ8þ)j;\u008dßüéu\u008fÁó(¤".length();
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
                                    CONST_K = var13;
                                    CONST_L = new Long[8];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "±\u0002^Xä\tâOHý\u0002ÞµºY\u0011";
                                 var16 = "±\u0002^Xä\tâOHý\u0002ÞµºY\u0011".length();
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

                  var6 = "¢0<ÈáÍ\ntT6É\u0011´y\u009d½Æ\u0097$\u001d\u0006ß±ÃÓØ\u009cw¦SÖA\u0018\u000eÔ\u0004Mú\u008cò®ä¹\u009aØ\u0086UÑ®¥ê¯*¡?XÙ";
                  var7 = "¢0<ÈáÍ\ntT6É\u0011´y\u009d½Æ\u0097$\u001d\u0006ß±ÃÓØ\u009cw¦SÖA\u0018\u000eÔ\u0004Mú\u008cò®ä¹\u009aØ\u0086UÑ®¥ê¯*¡?XÙ".length();
                  var8 = ' ';
                  var23 = -1;
            }

            var25 = var6.substring(++var23, var23 + var8);
            var10001 = 0;
         }
      }
   }

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19596;
      if (CONST_I[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_J.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_J.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/di", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_H[var3].getBytes("ISO-8859-1");
         CONST_I[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_I[var3];
   }

   private static Object getObject(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_3(var4, var5);
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
         throw new RuntimeException("rip/breeze/client/di" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10685;
      if (CONST_L[var3] == null) {
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
         long var5 = CONST_K[var3];
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
         Object[] var9 = (Object[])CONST_M.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_M.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/di", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_L[var3] = var14;
      }

      return CONST_L[var3];
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
         throw new RuntimeException("rip/breeze/client/di" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
