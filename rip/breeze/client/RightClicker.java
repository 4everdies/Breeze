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
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemExpBottle;
import net.minecraft.item.ItemFireball;
import net.minecraft.item.ItemSnowball;
import rip.breeze.BreezeModule;
import rip.breeze.ConditionsSetting;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.LicenseState;
import rip.breeze.MathUtil1;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(a = "RightClicker", b = "Automatically right clicks for you.", d = rip.breeze.ModuleCategory.MISC)
public class RightClicker extends BreezeModule {
   private final GenericSetting<rip.breeze.RangeValue> cPSSetting;
   private final GenericSetting<Boolean> exhaustionSetting;
   private final ConditionsSetting conditionsSetting;
   private final GenericSetting<Boolean> emptyHandSetting;
   private final GenericSetting<Boolean> anyItemSetting;
   private final GenericSetting<Boolean> blocksSetting;
   private final GenericSetting<Boolean> initialDelaySetting;
   private final GenericSetting<Integer> dataBuilder54_u;
   private final Random random_v;
   private final Util133 dataBuilder112_w;
   private double double_x;
   private double double_y;
   private long fieldLong_z;
   private long fieldLong_A;
   private long fieldLong_B;
   private long fieldLong_C;
   private float fieldFloat_D;
   private boolean fieldBool_E;
   private static final String[] CONST_G;
   private static final String[] CONST_H;
   private static final Map CONST_I = new HashMap(13);
   private static final long[] CONST_J;
   private static final Long[] CONST_K;
   private static final Map CONST_L;

   public RightClicker() {
      long var1 = 112323269091069L;
      super(false, false);
      short var10002 = 537;
      long var10003 = 3403302907669510952L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "CPS");
      var10002 = 27749;
      var10003 = 4381319392316953945L ^ var1;
      this.cPSSetting = var10001.getDataBuilder50_3("How many times to click per second.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(10.0, 12.0))
         .clamp(rip.breeze.RangeValue.getPredicate_2(1.0, 20.0))
         .getDataBuilder54();
      var10002 = 22078;
      var10003 = 3684167859563179789L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Exhaustion");
      var10002 = 16605;
      var10003 = 1338077878839097839L ^ var1;
      this.exhaustionSetting = var10001.getDataBuilder50_3("Simulate exhaustion, makes it look more legit.").getDataBuilder50_4(false).getDataBuilder54();
      int var10000 = AntiBot.getValue_2();
      short var10005 = 12600;
      long var10006 = 5622441177446860807L ^ var1;
      this.conditionsSetting = new ConditionsSetting(this, "Conditions");
      short var16 = 10514;
      long var10004 = 665369114926207010L ^ var1;
      rip.breeze.BlockUtil10 var9 = GenericSetting.getDataBuilder50(this.conditionsSetting, "EmptyHand");
      short var17 = 3743;
      var10004 = 476548959787251621L ^ var1;
      this.emptyHandSetting = var9.getDataBuilder50_3("Enables right clicker when holding nothing.").getDataBuilder50_4(true).getDataBuilder54();
      short var18 = 12703;
      var10004 = 7190918380503615671L ^ var1;
      rip.breeze.BlockUtil10 var10 = GenericSetting.getDataBuilder50(this.conditionsSetting, "AnyItem");
      short var19 = 504;
      var10004 = 1518728869203704003L ^ var1;
      this.anyItemSetting = var10.getDataBuilder50_3("Enables right clicker when holding any item.").getDataBuilder50_4(false).getDataBuilder54();
      short var20 = 17205;
      var10004 = 4147473751592581635L ^ var1;
      rip.breeze.BlockUtil10 var11 = GenericSetting.getDataBuilder50(this.conditionsSetting, "Blocks");
      short var21 = 13723;
      var10004 = 827246655009574053L ^ var1;
      this.blocksSetting = var11.getDataBuilder50_3("Enables right clicker when holding blocks.")
         .getDataBuilder50_4(true)
         .getDataBuilder50_9(RightClicker::lambda$new_Inner0)
         .getDataBuilder54();
      short var22 = 10495;
      var10004 = 1700103763045503432L ^ var1;
      rip.breeze.BlockUtil10 var12 = GenericSetting.getDataBuilder50(this.conditionsSetting, "Enables right clicker when holding throwables.");
      short var23 = 22327;
      var10004 = 2091330658168090127L ^ var1;
      this.initialDelaySetting = var12.getDataBuilder50_3("InitialDelay")
         .getDataBuilder50_4(false)
         .getDataBuilder50_9(RightClicker::lambda$new_Inner1)
         .getDataBuilder54();
      this.dataBuilder54_u = GenericSetting.<Integer>getDataBuilder50(this, "InitialDelay")
         .getDataBuilder50_3("The amount of time you have to hold down the right mouse button before auto clicking starts.")
         .getDataBuilder50_4(0)
         .clamp(rip.breeze.RenderUtil27.getPredicate(0, 500, 10))
         .getDataBuilder54();
      this.random_v = new Random();
      this.dataBuilder112_w = new Util133();
      this.double_x = 0.0;
      this.fieldLong_B = 0L;
      int var3 = var10000;
      this.fieldLong_C = 0L;
      this.fieldFloat_D = 1.0F;
      this.fieldBool_E = false;
      if (!LicenseState.isValid_2()) {
         AntiBot.initialize(++var3);
      }
   }

   @Override
   protected void initialize() {
      this.double_x = 0.0;
      this.calculate_2();
   }

   public String buildString() {
      long var1 = 94639785842642L;
      return String.format("%.1f - %.1f", this.cPSSetting.getObject_m().double_d, this.cPSSetting.getObject_m().double_c);
   }

   @EventListener
   public void calculate(PreTickEventEvent var1) {
      long var2 = 730801466970L;
      int var4 = AntiBot.getValue_2();
      if (!BreezeClient.isValid()) {
         if (System.currentTimeMillis() > this.fieldLong_C && this.fieldBool_E) {
            this.fieldFloat_D = MathUtil1.calculateFloat(this.fieldFloat_D, 1.0F, 0.2F);
            if (this.fieldFloat_D >= 0.95) {
               this.calculate_2();
            }
         }

         if (System.currentTimeMillis() > this.fieldLong_z) {
            this.double_y = this.cPSSetting.getObject_m().calculateDouble_2();
            this.fieldLong_z = System.currentTimeMillis() + -6489428617718614840L + this.random_v.nextInt(300);
         }

         if (this.getHeldItem()) {
            this.update();
            if (var4 != 0) {
               return;
            }
         }

         this.calculate_2();
      }
   }

   @EventListener
   public void openScreen(RunGameLoopEventEvent var1) {
      long var2 = 82380132869523L;
      if (System.currentTimeMillis() > this.fieldLong_A && this.fieldLong_A != -1L) {
         this.fieldLong_A = -1L;
         KeyBinding.setKeyBindState(BreezeClient.CONST_A.gameSettings.keyBindUseItem.getKeyCode(), false);
      }
   }

   private boolean getHeldItem() {
      long var1 = 67573586033204L;
      if (!PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindUseItem)) {
         this.dataBuilder112_w.getDataBuilder112();
         return false;
      }

      if (BreezeClient.CONST_A.currentScreen != null) {
         return false;
      }

      if (!this.dataBuilder112_w.isValid(this.dataBuilder54_u.getObject_m().intValue())) {
         return false;
      }

      if (this.anyItemSetting.getObject_m()) {
         return true;
      }

      if (BreezeClient.CONST_A.thePlayer.getHeldItem() == null) {
         return this.emptyHandSetting.getObject_m();
      }

      if (this.blocksSetting.getObject_m()) {
         Item var3 = BreezeClient.CONST_A.thePlayer.getHeldItem().getItem();
         if (var3 instanceof ItemBlock) {
            return true;
         }
      }

      if (this.initialDelaySetting.getObject_m()) {
         Item var4 = BreezeClient.CONST_A.thePlayer.getHeldItem().getItem();
         if (var4 instanceof ItemEgg
            || var4 instanceof ItemSnowball
            || var4 instanceof ItemEnderPearl
            || var4 instanceof ItemExpBottle
            || var4 instanceof ItemFireball) {
            return true;
         }
      }

      return false;
   }

   private void update() {
      long var1 = 93266104319134L;
      if (this.exhaustionSetting.getObject_m()) {
         this.toggle();
      }

      this.clamp();
   }

   private void toggle() {
      long var1 = 17728421658335L;
      if (System.currentTimeMillis() > this.fieldLong_B && !this.fieldBool_E) {
         this.fieldFloat_D = (float)(this.random_v.nextFloat() * 0.2);
         this.fieldLong_C = System.currentTimeMillis() + 285593145847912474L + this.random_v.nextInt(500);
         this.fieldLong_B = System.currentTimeMillis() + 4621646673700324940L + this.random_v.nextInt(3000);
         this.fieldBool_E = true;
      }
   }

   private void clamp() {
      long var1 = 101447994386899L;
      int var3 = BreezeClient.CONST_A.gameSettings.keyBindUseItem.getKeyCode();
      int var10000 = AntiBot.getValue_2();
      this.double_x = this.double_x + this.double_y * this.fieldFloat_D / 20.0 * (this.random_v.nextGaussian() * 0.3F + 1.0);
      int var4 = var10000;
      if (this.double_x >= 1.0 && System.currentTimeMillis() < this.fieldLong_A) {
         KeyBinding.setKeyBindState(var3, false);
      }

      while (this.double_x >= 1.0) {
         this.double_x--;
         KeyBinding.setKeyBindState(var3, true);
         KeyBinding.onTick(var3);
         if (this.double_x < 1.0) {
            int var5 = (int)(500.0 / this.double_y);
            var5 = Math.min(100, var5);
            var5 = (int)BlockUtil7.clamp_3(var5 + var5 * this.random_v.nextGaussian() * 0.1, 30.0, 150.0);
            this.fieldLong_A = System.currentTimeMillis() + var5;
            if (var4 != 0) {
               continue;
            }
         }

         KeyBinding.setKeyBindState(var3, false);
         if (var4 == 0) {
            break;
         }
      }
   }

   private void calculate_2() {
      long var1 = 138202263682175L;
      this.fieldFloat_D = 1.0F;
      this.fieldBool_E = false;
      this.fieldLong_B = System.currentTimeMillis() + -3683806800501148093L + this.random_v.nextInt(3000);
      this.fieldLong_C = 0L;
   }

   private static boolean lambda$new_Inner1(rip.breeze.DateUtil var0) {
      long var1 = 94338686899112L;
      return !var0.getObject("AnyItem", Boolean.class);
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 2832648348371L;
      return !var0.getObject("AnyItem", Boolean.class);
   }

   static {
      long var0 = 110747511866571L;
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
      String var6 = "\u0083\u000eñ'Ì\u00036\u0010Æx¼\f-\u009d\u009a£øè¶b\u0018*\u009a\\\u008eêK;{òU½d°ù\u0080.\u0002ÐÀIÇ3²Õ\u00066cÛ~\u001c*ø¡)Ë\u0093\"rßÛ\u0088GuÑ¬5²w¼S¨\u009fý_ÌÈF£q\u0018\u0099çf\u0092!â\u0088Í(cç\n\u0085pë\u0092¬¢Àm¡\u00adó`PÇØq\u0006.ÛCr\u0088>üNálúöT¦}\u001e»±\u008fYÞ\u008bïûåÖ\u0093F\u009d\u009dTkÏÀÿ\u000e_I88³\u0084?ñK.eN\u001cá\u0094¤\u009eû\u00990\u00935\u009dÓé«Âß\u008a\u0094\u000e\u0098`c\u0012Îu\u009fÂ\u007fH\u0012¸¨\u0000\u008aÇÏ\u0085LÒàÍ#y\r\u009aO?æÊÃo©\u0098\u001cû\u0084\u001aJX´\u0013\u0013Z\u0006\u009dÆS:Vñ\u001a¥1^(À^ÛuâÂÛt¿\u001b}À¤\u0099\u009fRM\u0086æõjô°[X\b@\u007f:uÞ\u0010@ìn\u0004¿\u0082I)(HÏö|\u0013\u0018}\u0095æ¡¨\u0014v\u0005¶¦\u0088\u009f\bÆ\tbêTN\u0085\\|Qy\u009f$À¤.q-[ð\u0097ÙgÃØxt2ûR@\u0018Û\u0096¥\u0094Ûö\u007fÅ´Ïôç\u0016ì\u0018ÔDÿGH\u009f\u0087\u0001ÍH\\\u0001*\u001f\u0089\u001db\u0093Ït\u001bçï\b\u00983ø\u0016\u009aEå¬ÏïËÁJj\u001c\tµæj@\u0092YÅCz_\u001cáN<ò\u0094\u0095_\u0095n\u0019\r¬+~sMFì<l{I_ªV\u0012W]dHà É\u001a\u0080\"×À¾í\u00973\u009dî\u0092\u0091þ$\u0080F\u009fý\u0087NªPjAµSÐÝ<Ê\u0018\t3è¾Ù\u001dýrmÒi\u0010\u0001ý\u0004rv\u0092ü}4sþµ\u0010ü\u007fË\u0002Êµ¥@Û®*\bþõm\u0010H\u009aDQÒp\u001eÎ¼[h\u0095\u0081]#-ç\f7VÒëG^Q>¸â\u0000-õJO\u0091*Õk\u0098Ø±Ò´T\\ä$Bèî\u0098\u009eÐ\u0013\u008ecrHayºwf|\u0013=Júc\u000e<\u0096eO \u0081ªrø½¸\u0086¬¦-\u008eÅÑA¥ØQ\u0099ðB«M[¸7\u0004 \u0012ø\u001fT \u0010\u0006\u0007rÕdxÃ¨!68\u000f§9ë\u007f\u0090±\u009aT\u0090\u0007²\u0082!M*Öó\u0013\u0017ÿ}FJ?o+6§Õ´JÑ7RáäÈB%.Å\u008b \u001fç\u0000Ý\u0086F\u0088\u0086²\u0012Ñðó4ã\u009dVÿé§ß¥\u008fûS<|ÂÏ\u0007{\u0096tÿûõ\u009c\u009aÎª\u0003Ñ\u009dR\u0007\u0082Ìdª×9ò\u00ad\u0087ÞÃôF\u0019Ó9ô\u0084°S-\rÛÑU\u001aúBÏÓ*\u0081å¨\u0018\u0093\u0012rÁüSQÏX\u0091¢Pýâº.\u009fJ\u0080¬¿\u001eñÂ\u0019»\u0010\u0018!ò9ÉÆø\u0007A\u0000ùB\u0097×°t";
      int var7 = "\u0083\u000eñ'Ì\u00036\u0010Æx¼\f-\u009d\u009a£øè¶b\u0018*\u009a\\\u008eêK;{òU½d°ù\u0080.\u0002ÐÀIÇ3²Õ\u00066cÛ~\u001c*ø¡)Ë\u0093\"rßÛ\u0088GuÑ¬5²w¼S¨\u009fý_ÌÈF£q\u0018\u0099çf\u0092!â\u0088Í(cç\n\u0085pë\u0092¬¢Àm¡\u00adó`PÇØq\u0006.ÛCr\u0088>üNálúöT¦}\u001e»±\u008fYÞ\u008bïûåÖ\u0093F\u009d\u009dTkÏÀÿ\u000e_I88³\u0084?ñK.eN\u001cá\u0094¤\u009eû\u00990\u00935\u009dÓé«Âß\u008a\u0094\u000e\u0098`c\u0012Îu\u009fÂ\u007fH\u0012¸¨\u0000\u008aÇÏ\u0085LÒàÍ#y\r\u009aO?æÊÃo©\u0098\u001cû\u0084\u001aJX´\u0013\u0013Z\u0006\u009dÆS:Vñ\u001a¥1^(À^ÛuâÂÛt¿\u001b}À¤\u0099\u009fRM\u0086æõjô°[X\b@\u007f:uÞ\u0010@ìn\u0004¿\u0082I)(HÏö|\u0013\u0018}\u0095æ¡¨\u0014v\u0005¶¦\u0088\u009f\bÆ\tbêTN\u0085\\|Qy\u009f$À¤.q-[ð\u0097ÙgÃØxt2ûR@\u0018Û\u0096¥\u0094Ûö\u007fÅ´Ïôç\u0016ì\u0018ÔDÿGH\u009f\u0087\u0001ÍH\\\u0001*\u001f\u0089\u001db\u0093Ït\u001bçï\b\u00983ø\u0016\u009aEå¬ÏïËÁJj\u001c\tµæj@\u0092YÅCz_\u001cáN<ò\u0094\u0095_\u0095n\u0019\r¬+~sMFì<l{I_ªV\u0012W]dHà É\u001a\u0080\"×À¾í\u00973\u009dî\u0092\u0091þ$\u0080F\u009fý\u0087NªPjAµSÐÝ<Ê\u0018\t3è¾Ù\u001dýrmÒi\u0010\u0001ý\u0004rv\u0092ü}4sþµ\u0010ü\u007fË\u0002Êµ¥@Û®*\bþõm\u0010H\u009aDQÒp\u001eÎ¼[h\u0095\u0081]#-ç\f7VÒëG^Q>¸â\u0000-õJO\u0091*Õk\u0098Ø±Ò´T\\ä$Bèî\u0098\u009eÐ\u0013\u008ecrHayºwf|\u0013=Júc\u000e<\u0096eO \u0081ªrø½¸\u0086¬¦-\u008eÅÑA¥ØQ\u0099ðB«M[¸7\u0004 \u0012ø\u001fT \u0010\u0006\u0007rÕdxÃ¨!68\u000f§9ë\u007f\u0090±\u009aT\u0090\u0007²\u0082!M*Öó\u0013\u0017ÿ}FJ?o+6§Õ´JÑ7RáäÈB%.Å\u008b \u001fç\u0000Ý\u0086F\u0088\u0086²\u0012Ñðó4ã\u009dVÿé§ß¥\u008fûS<|ÂÏ\u0007{\u0096tÿûõ\u009c\u009aÎª\u0003Ñ\u009dR\u0007\u0082Ìdª×9ò\u00ad\u0087ÞÃôF\u0019Ó9ô\u0084°S-\rÛÑU\u001aúBÏÓ*\u0081å¨\u0018\u0093\u0012rÁüSQÏX\u0091¢Pýâº.\u009fJ\u0080¬¿\u001eñÂ\u0019»\u0010\u0018!ò9ÉÆø\u0007A\u0000ùB\u0097×°t"
         .length();
      char var8 = 'P';
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
                     CONST_G = var4;
                     CONST_H = new String[17];
                     CONST_L = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[6];
                     int var14 = 0;
                     String var15 = "Éß\u0090çezýÆ\u0085\u0085\u0093{8õJOU!Vð\\\u0088S¬Ð\b\u000eÞc\r´ð";
                     int var16 = "Éß\u0090çezýÆ\u0085\u0085\u0093{8õJOU!Vð\\\u0088S¬Ð\b\u000eÞc\r´ð".length();
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
                                    CONST_J = var13;
                                    CONST_K = new Long[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "\u0090åPÉCO§p\u008a¡\u00adp\fw$\u0092";
                                 var16 = "\u0090åPÉCO§p\u008a¡\u00adp\fw$\u0092".length();
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

                  var6 = "\u0081ª®(ÚòçªhL¼(¶ps\u0011úù\u0000{ðñ\u0096\u000e\u0010¬¦|ýçµ\u0087áÏóºm\u0017¦Ý.";
                  var7 = "\u0081ª®(ÚòçªhL¼(¶ps\u0011úù\u0000{ðñ\u0096\u000e\u0010¬¦|ýçµ\u0087áÏóºm\u0017¦Ý.".length();
                  var8 = 24;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10181;
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
            throw new RuntimeException("rip/breeze/client/dP", var10);
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
         CONST_H[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_H[var3];
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
         throw new RuntimeException("rip/breeze/client/dP" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26056;
      if (CONST_K[var3] == null) {
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
         long var5 = CONST_J[var3];
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
         Object[] var9 = (Object[])CONST_L.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_L.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/dP", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_K[var3] = var14;
      }

      return CONST_K[var3];
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
         throw new RuntimeException("rip/breeze/client/dP" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
