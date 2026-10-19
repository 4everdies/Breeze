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
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0BPacketEntityAction.Action;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(
   a = "SprintReset",
   b = "Resets your server sprint state to deal more knockback.",
   d = {rip.breeze.ModuleCategory.COMBAT, rip.breeze.ModuleCategory.MOVEMENT},
   c = {"sprint", "knockback", "w-tap", "s-tap", "wtap", "stap"}
)
public class SprintReset extends BreezeModule {
   private final GenericSetting<SpeedMode> modeSetting;
   private final GenericSetting<Integer> chanceSetting;
   private final GenericSetting<rip.breeze.RangeValue> rangeSetting;
   private final GenericSetting<rip.breeze.RangeValue> waitSetting;
   private final GenericSetting<rip.breeze.RangeValue> onGroundOnlySetting;
   private final GenericSetting<Boolean> dataBuilder54_s;
   private final Random random_t;
   private final Util133 dataBuilder112_u;
   private int fieldInt_v;
   private int fieldInt_w;
   private int fieldInt_x;
   private static final String[] CONST_Z;
   private static final String[] CONST_A;
   private static final Map CONST_B = new HashMap(13);

   public SprintReset() {
      long var1 = 10518927412731L;
      super();
      short var10002 = 6392;
      long var10003 = 1116312689209843017L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Mode");
      var10002 = 28239;
      var10003 = 6903921844591651826L ^ var1;
      this.modeSetting = var10001.getDataBuilder50_3(
            "The mode to use for sprinting resetting:\n\tWTap: Releases the forward key for a small time.\n\tSTap: Holds the forward key for a small time, has the same effect as WTap.\n\tSneak: Sneaks for a small time, same effect as WTap but keeps more forward momentum.\n\tNoStop: Doesnt actually stop moving and still resets your sprint state.\n\tPacket: Spoofs the packet that resets your sprint state."
         )
         .getDataBuilder50_4(SpeedMode.W_TAP)
         .getDataBuilder54();
      var10002 = 24735;
      var10003 = 8386971901504152876L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Chance");
      var10002 = 5212;
      var10003 = 7308633389528093158L ^ var1;
      this.chanceSetting = var10001.getDataBuilder50_3("The chance (out of 100%) that the module will be activated.")
         .getDataBuilder50_4(70)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 100))
         .getDataBuilder54();
      var10002 = 7832;
      var10003 = 3920597286349675303L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Range");
      var10002 = 23432;
      var10003 = 8076481079482703414L ^ var1;
      this.rangeSetting = var10001.getDataBuilder50_3("The distance from enemies to activate WTap within.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(0.0, 6.0, 0.1))
         .clamp(rip.breeze.RangeValue.getPredicate(0.0, 10.0, 0.1))
         .getDataBuilder54();
      var10002 = 30958;
      var10003 = 3002590406380420440L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Wait");
      var10002 = 6713;
      var10003 = 1491997175125581709L ^ var1;
      this.waitSetting = var10001.getDataBuilder50_3("For how long to wait with resetting your sprint after attacking an enemy.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(175.0, 250.0, 25.0))
         .clamp(rip.breeze.RangeValue.getPredicate(0.0, 500.0, 25.0))
         .getDataBuilder50_9(SprintReset::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 23692;
      var10003 = 5319479418978294075L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "For how much time to release the forward or hold the sneak key. (in milliseconds)");
      var10002 = 11756;
      var10003 = 2740771723804485712L ^ var1;
      this.onGroundOnlySetting = var10001.getDataBuilder50_3("OnGroundOnly")
         .getDataBuilder50_4(new rip.breeze.RangeValue(100.0, 200.0, 25.0))
         .clamp(rip.breeze.RangeValue.getPredicate(0.0, 500.0, 25.0))
         .getDataBuilder50_9(SprintReset::lambda$new_Inner1)
         .getDataBuilder54();
      this.dataBuilder54_s = GenericSetting.<Boolean>getDataBuilder50(this, "OnGroundOnly")
         .getDataBuilder50_3("Only WTap while on ground.")
         .getDataBuilder50_9(SprintReset::lambda$new_Inner2)
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      this.random_t = new Random();
      this.dataBuilder112_u = new Util133();
      this.fieldInt_x = -1;
   }

   @Override
   public String getString() {
      return rip.breeze.RenderUtil27.CONST_G.apply(this.modeSetting.getObject_m());
   }

   @EventListener(a = rip.breeze.Priority.LOW)
   public void sendPacket(PacketReceiveEventEvent var1) {
      long var2 = 120748045211797L;
      if (!BreezeClient.isValid() && BreezeClient.CONST_A.thePlayer.isSprinting()) {
         if (var1.packet_h instanceof S19PacketEntityStatus) {
            if (this.dataBuilder112_u.isValid(this.fieldInt_v + this.fieldInt_w)) {
               if (this.chanceSetting.getObject_m() != 0 && !(this.random_t.nextFloat() * 100.0F > this.chanceSetting.getObject_m().intValue())) {
                  S19PacketEntityStatus var4 = (S19PacketEntityStatus)var1.packet_h;
                  Entity var5 = var4.getEntity(BreezeClient.CONST_A.theWorld);
                  if (var4.getOpCode() == 2 && var5 instanceof EntityPlayer && var5 != BreezeClient.CONST_A.thePlayer) {
                     if (this.rangeSetting.getObject_m().isValid(BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var5))) {
                        if (AntiBot.isInvisible_3((EntityPlayer)var5)) {
                           if (BreezeClient.getThemeManager().getEntity() == var5) {
                              if (this.modeSetting.isValid(SpeedMode.PACKET)) {
                                 if (MinecraftAccessor.isValid(BreezeClient.CONST_A.thePlayer)) {
                                    BreezeClient.getConfigManager()
                                       .update_4(new C0BPacketEntityAction(BreezeClient.CONST_A.thePlayer, Action.STOP_SPRINTING), true);
                                 }

                                 MinecraftAccessor.initialize_69(BreezeClient.CONST_A.thePlayer, false);
                              } else {
                                 this.fieldInt_v = (int)this.waitSetting.getObject_m().calculateDouble_2();
                                 this.fieldInt_w = (int)this.onGroundOnlySetting.getObject_m().calculateDouble_2();
                                 this.fieldInt_x = BreezeClient.CONST_A.thePlayer.ticksExisted;
                                 this.dataBuilder112_u.getDataBuilder112();
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @EventListener
   public void updateRotation(PreTickEventEvent var1) {
      long var2 = 114913045636083L;
      if (!BreezeClient.isValid()) {
         if ((BreezeClient.CONST_A.thePlayer.onGround || !this.dataBuilder54_s.getObject_m())
            && this.modeSetting.isValid(SpeedMode.NO_STOP)
            && this.fieldInt_x + 1 == BreezeClient.CONST_A.thePlayer.ticksExisted) {
            BreezeClient.CONST_A.thePlayer.setSprinting(false);
         }

         if (!BreezeClient.CONST_A.thePlayer.onGround && !this.dataBuilder112_u.isValid(this.fieldInt_v) && !this.dataBuilder54_s.getObject_m()) {
            this.fieldInt_v = 0;
            this.fieldInt_w = 0;
            this.fieldInt_x = -1;
         }
      }
   }

   @EventListener
   public void toggle(SpoofInputEventEvent var1) {
      long var2 = 125277410053804L;
      if (this.modeSetting.isValid(SpeedMode.NO_STOP)
         && this.fieldInt_x + 1 == BreezeClient.CONST_A.thePlayer.ticksExisted
         && var1.keyBinding_g == BreezeClient.CONST_A.gameSettings.keyBindSprint) {
         var1.fieldBool_h = false;
      }

      if (!this.dataBuilder112_u.isValid(this.fieldInt_w + this.fieldInt_v) || this.fieldInt_x == BreezeClient.CONST_A.thePlayer.ticksExisted) {
         if (this.dataBuilder112_u.isValid(this.fieldInt_v) || this.fieldInt_v == 0 || this.fieldInt_x == BreezeClient.CONST_A.thePlayer.ticksExisted) {
            switch (Util47.CONST_A[this.modeSetting.getObject_m().ordinal()]) {
               case 1:
                  if (var1.keyBinding_g == BreezeClient.CONST_A.gameSettings.keyBindBack) {
                     var1.fieldBool_h = true;
                  }

                  return;
               case 2:
                  if (var1.keyBinding_g == BreezeClient.CONST_A.gameSettings.keyBindForward) {
                     var1.fieldBool_h = false;
                  }

                  return;
               case 3:
                  if (var1.keyBinding_g == BreezeClient.CONST_A.gameSettings.keyBindSneak) {
                     var1.fieldBool_h = true;
                  }
            }
         }
      }
   }

   @EventListener
   public void initialize(WorldChangedEventEvent var1) {
      this.fieldInt_v = 0;
      this.fieldInt_w = 0;
   }

   private static boolean lambda$new_Inner2(rip.breeze.DateUtil var0) {
      long var1 = 87355664680017L;
      return var0.getObject("Mode", SpeedMode.class) != SpeedMode.PACKET;
   }

   private static boolean lambda$new_Inner1(rip.breeze.DateUtil var0) {
      long var1 = 73336694821946L;
      SpeedMode var3 = var0.getObject("Mode", SpeedMode.class);
      return var3 != SpeedMode.NO_STOP && var3 != SpeedMode.PACKET;
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 116842128914366L;
      SpeedMode var3 = var0.getObject("Mode", SpeedMode.class);
      return var3 != SpeedMode.NO_STOP && var3 != SpeedMode.PACKET;
   }

   static {
      long var0 = 29064750570734L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[13];
      int var5 = 0;
      String var6 = "öF\u008d\u0098\u0090àû4ý0Æ¦xÓ\u009a \u0010OöÀºqÓ\u008aªÞV9ûú¬\bbxo\u0090\u000eÑ\u000béJNÌ\u009aàWìßïGÒ\u0003±\u0005Ûß\u0015¤\u0010W\u001câDÄ\u009fáj2µ-\u00adê\u0084lT\u0084î¶÷n\u008e\u0016\u0002\u0091\u00814\u0013\u0089\u0094Ë¹RÜZ\u008bðÂ6\u0082À\u001a\u001d¶ëÙ¹H&\b9\u0010Û\u0080î3Y§j÷ÝÑ¯Ý5¯\u001c\tïaÃÌvU\u00979·\\ë+\u0001\u001cQÐÈ\u0017U\u00adØY\u0090¹¹Î\u00138«M§æ\u009d.(«8jãâÓó¤Î·2º\u0010\u001dM\u0087\\\u0086ùÌ\u0099ð¯ô>;êO§\u0091þâ& ÆÙ\u0092\u0084Ï©~\u000b`æ\u0086Z\u000eL` \b\u009d¢£FyÝ\u0010Z\u001bu\u0018\\\u0015å\"i\u0090¹ªÆV:p¦\u0005ÙeÖ¯4¥\u0010)Ã\u000fÈZmú\u008cÕ\u009b\u001bÂ4\u0090î¨\u0010+²yú7í\u0099\u0015ÿ\u0003Hë\u009a\u0012¦X\u0010\u0093¤\u0006\"8Pé$Ïµ\u007f\u009a\u0000pÆYX[ÇM\u0093Q«Ü\u009fÜã·Ì\u001a\u0007Q;0#O\"Oß\u0005ø|u9®qûô\u008eãF§÷dè_º8ÌïõHJ·ï\u009fóÚàZB3¨\u0088uÙg\u008c\u008c\u0001Ú\f\u0018õ-!Ä¹dH%*õ+ã\u0016_2äÀ\u0088;4} \u0010«ôÿìHÀ\u0000,´m9»\u009fºa\u0088\u0090³þßÔ\u0098>Ã¸r9Ö\u008dI\u0088Vtï±àÅ«\u009a\u008b¶E\u0080\u001a\u0018<M\u0006\u000b\u0091µìôÓ\u0002î\u001fxþt{®jð\u0083¢_äþrÓÀ»ômÀ'\u000e\u000b¼ä\u0084\u008c\u008fÿ5 ËßÜTþfÐIðN®\u00adÿk Ý\u0081J\u0013ü~¥È&m26\u0015¿>m3CR¿ý2¼\fó¨Õdï\u0089|ýÝb\u009cµ\f\u0092g\u001b\u0084*È&(y4\u0087!Ûº;ò\u0007$é^\n\t";
      int var7 = "öF\u008d\u0098\u0090àû4ý0Æ¦xÓ\u009a \u0010OöÀºqÓ\u008aªÞV9ûú¬\bbxo\u0090\u000eÑ\u000béJNÌ\u009aàWìßïGÒ\u0003±\u0005Ûß\u0015¤\u0010W\u001câDÄ\u009fáj2µ-\u00adê\u0084lT\u0084î¶÷n\u008e\u0016\u0002\u0091\u00814\u0013\u0089\u0094Ë¹RÜZ\u008bðÂ6\u0082À\u001a\u001d¶ëÙ¹H&\b9\u0010Û\u0080î3Y§j÷ÝÑ¯Ý5¯\u001c\tïaÃÌvU\u00979·\\ë+\u0001\u001cQÐÈ\u0017U\u00adØY\u0090¹¹Î\u00138«M§æ\u009d.(«8jãâÓó¤Î·2º\u0010\u001dM\u0087\\\u0086ùÌ\u0099ð¯ô>;êO§\u0091þâ& ÆÙ\u0092\u0084Ï©~\u000b`æ\u0086Z\u000eL` \b\u009d¢£FyÝ\u0010Z\u001bu\u0018\\\u0015å\"i\u0090¹ªÆV:p¦\u0005ÙeÖ¯4¥\u0010)Ã\u000fÈZmú\u008cÕ\u009b\u001bÂ4\u0090î¨\u0010+²yú7í\u0099\u0015ÿ\u0003Hë\u009a\u0012¦X\u0010\u0093¤\u0006\"8Pé$Ïµ\u007f\u009a\u0000pÆYX[ÇM\u0093Q«Ü\u009fÜã·Ì\u001a\u0007Q;0#O\"Oß\u0005ø|u9®qûô\u008eãF§÷dè_º8ÌïõHJ·ï\u009fóÚàZB3¨\u0088uÙg\u008c\u008c\u0001Ú\f\u0018õ-!Ä¹dH%*õ+ã\u0016_2äÀ\u0088;4} \u0010«ôÿìHÀ\u0000,´m9»\u009fºa\u0088\u0090³þßÔ\u0098>Ã¸r9Ö\u008dI\u0088Vtï±àÅ«\u009a\u008b¶E\u0080\u001a\u0018<M\u0006\u000b\u0091µìôÓ\u0002î\u001fxþt{®jð\u0083¢_äþrÓÀ»ômÀ'\u000e\u000b¼ä\u0084\u008c\u008fÿ5 ËßÜTþfÐIðN®\u00adÿk Ý\u0081J\u0013ü~¥È&m26\u0015¿>m3CR¿ý2¼\fó¨Õdï\u0089|ýÝb\u009cµ\f\u0092g\u001b\u0084*È&(y4\u0087!Ûº;ò\u0007$é^\n\t"
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
                     CONST_Z = var4;
                     CONST_A = new String[13];
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

                  var6 = "õÆ\u0000*ºµÿÝ\u008c·\u001cÊÕ\u001ar\u0081\u009fVé\u0080Vô,\u0096-²\u0017sÂý\u0096~süNÙö2ç~\u000bä¬÷¤\u008cæû\u0013c\r\u00ad1\"^é¯G\u0015Kle|\u0095às()Bß\u001d\u0019û¯\u0083A®å\u0082á\u0001Àj\u001aW\t\u0096 \"eÄO\u009b\u001aTBo\u009f÷\u0082¾\u000e×ÊpÇ3ØÚßÌµ\u008f\u0091\u0089\u0081L¹Ë\u001d½x~êÄü\u0081G\f¨\u0002vòÉ}8\u0081-+\u009a(Uç\u008b\u009cÞ\u0010e)e°ÖC\u001b¬\u0085\r«Ë\u0099Û¸G÷£nª|s\u009b#<]Ñ¨Ç§\u008fàé\u0015\u0002ø°b1ùÓ³Åõ²çlm\u0083z8s«tq\u008aÛeÞ\u0096ëÖ\u0097\r¡Ú ;cLÄÀ;O\u009ayÖxQÜdÖ2&Ö\u0007â\u00808K«\u008aoÛ°ØPxÀRéþg\t\u0015?Q\u0091Ù\u0093c\u0087\u0088mÏ\u0089[bR´'peÞ\u009fIÊ/i8\u0091\u0097\u0006Ý\u0095âá:ÞÓÎC\u00991l\u008e`²Êoz\u0089\u007fÎ\u009aôóøàf}À«ì/?ÏSÒóæ>rÒ\u001e\u008d\u0099\bã^Ú4°Z\u0005*Õ\u0091îÝLc\u0004 \u001fæÒ\u0082.xÇÑ\u008f\u0088ÍEáüàÌÝ\u0097jø\u0017Ý2\u0097\u0099à\u0000²,íÛ\u0002ôb±\u000fÐ\u009d\bv¡ú\n{¡UÓ\bvC\u009eõR\u0088ØÐçk\u001e[¿+pp¿{úþi\u0001m)Lüze\u0001îçû¯½tS\u0086\u000be6%Õ\\ÍÛÐ§Ùö\u001awg\u001a.\u0085W»Û¯%ÏENç9²#´X\u0098\u000ew4\u0093gUi\u0007Ó\u001f\u008bÈ\u0089\u0098¿ëÅyöCÀÊåE%U\u0094\u0097ÝÔ)Ì\u001a:Ö÷²µÁ^\u0088¼ ÕâlþW\\Øbºã¯\u0010µ\u0081öt\u0015³\u008a©Å°Zwû51·\u0088GâÈ¨\u001aó ]§ç\u0002]ót´\u0014ÒA\u009b§\u0080ÜÒ\u0006ò_\u00918åéuÜ°Æi\u001c\u008c`\u0093TnäèZæÆS\u009e\u0092Ê\u000bRÄ:öO\u0086å8z÷\u0098\u009a\u0002\t\u00ad±¯ofÖ>$¡àZeEâU'P9P·§\u00132'\u0000É[t²p¢èMÆÎYx©é\u0085\u008d\u0003Î\u008a\u007f÷ô\u0004\bÆ\u0091\u008d\u001d]\u0093Csxèn\u008ezxà\u0081{\u0091Eì";
                  var7 = "õÆ\u0000*ºµÿÝ\u008c·\u001cÊÕ\u001ar\u0081\u009fVé\u0080Vô,\u0096-²\u0017sÂý\u0096~süNÙö2ç~\u000bä¬÷¤\u008cæû\u0013c\r\u00ad1\"^é¯G\u0015Kle|\u0095às()Bß\u001d\u0019û¯\u0083A®å\u0082á\u0001Àj\u001aW\t\u0096 \"eÄO\u009b\u001aTBo\u009f÷\u0082¾\u000e×ÊpÇ3ØÚßÌµ\u008f\u0091\u0089\u0081L¹Ë\u001d½x~êÄü\u0081G\f¨\u0002vòÉ}8\u0081-+\u009a(Uç\u008b\u009cÞ\u0010e)e°ÖC\u001b¬\u0085\r«Ë\u0099Û¸G÷£nª|s\u009b#<]Ñ¨Ç§\u008fàé\u0015\u0002ø°b1ùÓ³Åõ²çlm\u0083z8s«tq\u008aÛeÞ\u0096ëÖ\u0097\r¡Ú ;cLÄÀ;O\u009ayÖxQÜdÖ2&Ö\u0007â\u00808K«\u008aoÛ°ØPxÀRéþg\t\u0015?Q\u0091Ù\u0093c\u0087\u0088mÏ\u0089[bR´'peÞ\u009fIÊ/i8\u0091\u0097\u0006Ý\u0095âá:ÞÓÎC\u00991l\u008e`²Êoz\u0089\u007fÎ\u009aôóøàf}À«ì/?ÏSÒóæ>rÒ\u001e\u008d\u0099\bã^Ú4°Z\u0005*Õ\u0091îÝLc\u0004 \u001fæÒ\u0082.xÇÑ\u008f\u0088ÍEáüàÌÝ\u0097jø\u0017Ý2\u0097\u0099à\u0000²,íÛ\u0002ôb±\u000fÐ\u009d\bv¡ú\n{¡UÓ\bvC\u009eõR\u0088ØÐçk\u001e[¿+pp¿{úþi\u0001m)Lüze\u0001îçû¯½tS\u0086\u000be6%Õ\\ÍÛÐ§Ùö\u001awg\u001a.\u0085W»Û¯%ÏENç9²#´X\u0098\u000ew4\u0093gUi\u0007Ó\u001f\u008bÈ\u0089\u0098¿ëÅyöCÀÊåE%U\u0094\u0097ÝÔ)Ì\u001a:Ö÷²µÁ^\u0088¼ ÕâlþW\\Øbºã¯\u0010µ\u0081öt\u0015³\u008a©Å°Zwû51·\u0088GâÈ¨\u001aó ]§ç\u0002]ót´\u0014ÒA\u009b§\u0080ÜÒ\u0006ò_\u00918åéuÜ°Æi\u001c\u008c`\u0093TnäèZæÆS\u009e\u0092Ê\u000bRÄ:öO\u0086å8z÷\u0098\u009a\u0002\t\u00ad±¯ofÖ>$¡àZeEâU'P9P·§\u00132'\u0000É[t²p¢èMÆÎYx©é\u0085\u008d\u0003Î\u008a\u007f÷ô\u0004\bÆ\u0091\u008d\u001d]\u0093Csxèn\u008ezxà\u0081{\u0091Eì"
                     .length();
                  var8 = 568;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2125;
      if (CONST_A[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_B.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_B.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/d1", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Z[var3].getBytes("ISO-8859-1");
         CONST_A[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_A[var3];
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
         throw new RuntimeException("rip/breeze/client/d1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
