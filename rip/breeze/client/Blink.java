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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(
   a = "Blink",
   b = "Chockes packets while enabled and releases them all at once when you disable it.",
   d = {rip.breeze.ModuleCategory.MOVEMENT, rip.breeze.ModuleCategory.COMBAT, rip.breeze.ModuleCategory.MISC}
)
public class Blink extends BreezeModule implements IBreezeInterface3 {
   private final GenericSetting<EnumType20> directionSetting;
   private final GenericSetting<MotionMode3> releaseSetting;
   private final GenericSetting<CombatUtil[]> disableWhenSetting;
   private final GenericSetting<Integer> maximumTimeSetting;
   private final Util133 dataBuilder112_r;
   private long fieldLong_s;
   private boolean fieldBool_t;
   private long fieldLong_u;
   private long fieldLong_v;
   private long fieldLong_w;
   private double double_x;
   private static final String[] CONST_Z;
   private static final String[] CONST_A;
   private static final Map CONST_B = new HashMap(13);
   private static final long[] CONST_C;
   private static final Long[] CONST_D;
   private static final Map CONST_E;

   public Blink() {
      long var1 = 22175162541265L;
      super();
      short var10002 = 2221;
      long var10003 = 9072274548136930222L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Direction");
      var10002 = 10955;
      var10003 = 4758073762990344652L ^ var1;
      this.directionSetting = var10001.getDataBuilder50_3(
            "The direction to choke packets in:\n\tOutgoing: The 'traditional' blink mode, blocks outbound packets.\n\tIncoming: Blocks incoming packets, can be used to temporarily ignore anti-cheats flags or knockback.\n\tBoth: Block both incoming and outgoing packets."
         )
         .getDataBuilder50_4(EnumType20.OUTGOING)
         .getDataBuilder54();
      var10002 = 14153;
      var10003 = 9043082565123396678L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Release");
      var10002 = 28908;
      var10003 = 5429655755080897516L ^ var1;
      this.releaseSetting = var10001.getDataBuilder50_3(
            "The mode for releasing outbound packets:\n\tInstant: Instantly releases all the choked packets at once when disabling blink.\n\tSmooth: Releases the packets in short bursts, this might bypass more anti-cheats."
         )
         .getDataBuilder50_4(MotionMode3.INSTANT)
         .getDataBuilder54();
      var10002 = 20248;
      var10003 = 8765906276172770330L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "DisableWhen");
      var10002 = 11382;
      var10003 = 1129751614501212018L ^ var1;
      this.disableWhenSetting = var10001.getDataBuilder50_3(
            "Cases to disable blink for:\n\tDamaged: Disables blink when an enemy hits you.\n\tAttack: Disables blink when you attack another enemy, so your hit registers instantly.\n\tTimeout: Disables blink automatically after MaximumTime has passed."
         )
         .getDataBuilder50_4(new CombatUtil[]{CombatUtil.DAMAGED})
         .getDataBuilder54();
      var10002 = 11347;
      var10003 = 3226699540827361110L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "MaximumTime");
      var10002 = 11231;
      var10003 = 3982154942093576409L ^ var1;
      this.maximumTimeSetting = var10001.getDataBuilder50_3("The amount of time (in ms) to wait before automatically disabling blink.")
         .clamp(rip.breeze.RenderUtil27.getPredicate(0, 10000, 50))
         .getDataBuilder50_9(Blink::lambda$new_Inner0)
         .getDataBuilder50_4(4000)
         .getDataBuilder54();
      this.dataBuilder112_r = new Util133();
      this.fieldBool_t = false;
      this.fieldLong_u = 0L;
      this.fieldLong_v = 0L;
      this.fieldLong_w = 0L;
      this.double_x = 1.0;
   }

   public void clamp() {
      this.dataBuilder112_r.getDataBuilder112();
      this.fieldBool_t = false;
      BreezeClient.getConfigManager().update_1(this, 30);
   }

   @Override
   public void initialize() {
      this.fieldLong_s = this.dataBuilder112_r.getLong();
   }

   public EnumType27 getEnum_PROCESS(Packet<?> var1, boolean var2) {
      long var3 = 29844293304432L;
      if (!this.f() && BreezeClient.getConfigManager().getArrayList_3(this).isEmpty()) {
         return EnumType27.PROCESS;
      } else if (this.disableWhenSetting.checkCondition(CombatUtil.ATTACK) && var1 instanceof C02PacketUseEntity) {
         this.b(false);
         return EnumType27.DELAY;
      } else {
         return this.directionSetting.getObject_m().fieldBool_b ? EnumType27.DELAY : EnumType27.PROCESS;
      }
   }

   public EnumType27 getEnum_PROCESS_2(Packet<?> var1, boolean var2) {
      long var3 = 100277995698129L;
      if (!this.f() && BreezeClient.getConfigManager().getArrayList_2(this).isEmpty()) {
         return EnumType27.PROCESS;
      } else {
         return this.directionSetting.getObject_m().fieldBool_a ? EnumType27.DELAY : EnumType27.PROCESS;
      }
   }

   @EventListener
   public void processNullable(PreTickEventEvent var1) {
      long var2 = 107439623456251L;
      if (this.f()) {
         if (this.disableWhenSetting.checkCondition(CombatUtil.DAMAGED)
            && BreezeClient.CONST_A.thePlayer != null
            && BreezeClient.CONST_A.thePlayer.hurtTime > 0) {
            this.b(false);
         }
      }
   }

   public void processAll(ArrayList<DelayedPacket> var1) {
      long var2 = 131090423664411L;
      if (!this.f()) {
         this.clamp();
      } else {
         if (this.dataBuilder112_r.isValid(this.maximumTimeSetting.getObject_m().intValue()) && this.disableWhenSetting.checkCondition(CombatUtil.TIMEOUT)) {
            this.b(false);
            this.clamp();
         }
      }
   }

   private void clamp() {
      long var1 = 93706205443242L;
      String var10000 = ScaffoldUtils.getString_2();
      ConfigManager var3 = BreezeClient.getConfigManager();
      String var4 = var10000;
      if (this.releaseSetting.isValid(MotionMode3.INSTANT)) {
         var3.processAll(this);
         this.fieldBool_t = false;
      } else {
         for (DelayedPacket var6 : var3.getArrayList_2(this)) {
            var6.update(this);
            if (var4 == null) {
               break;
            }
         }

         if (!this.fieldBool_t) {
            long var7 = -7535396309736348626L;
            long var9 = 437243734773153337L;

            for (DelayedPacket var12 : var3.getArrayList_3(this)) {
               if (var12.fieldLong_h < var7) {
                  var7 = var12.fieldLong_h;
               }

               if (var12.fieldLong_h > var9) {
                  var9 = var12.fieldLong_h;
               }

               if (var4 == null) {
                  break;
               }
            }

            if (var7 == -6081183863984080267L) {
               this.fieldBool_t = false;
               return;
            }

            long var13 = Math.max(1L, var9 - var7);
            this.fieldLong_w = Math.max(1L, this.fieldLong_s / -2083071614839355250L);
            this.double_x = (double)this.fieldLong_w / var13;
            this.fieldLong_v = var7;
            this.fieldLong_u = System.currentTimeMillis();
            this.fieldBool_t = true;
         }

         if (this.fieldBool_t) {
            long var19 = Math.max(0L, System.currentTimeMillis() - this.fieldLong_u);

            for (DelayedPacket var16 : var3.getArrayList_3(this)) {
               long var20 = var16.fieldLong_h - this.fieldLong_v;
               long var17 = (long)Math.floor(var20 * this.double_x);
               if (var17 <= var19) {
                  var16.update(this);
               }

               if (var4 == null) {
                  break;
               }
            }

            if (var3.getArrayList_3(this).isEmpty() || var19 >= this.fieldLong_w + 4916171000844067140L) {
               this.fieldBool_t = false;
            }
         }
      }
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 67987204211986L;
      String var10000 = ScaffoldUtils.getString_2();
      CombatUtil[] var3 = var0.getObject("DisableWhen", CombatUtil[].class);
      String var4 = var10000;

      for (CombatUtil var8 : var3) {
         if (var8 == CombatUtil.TIMEOUT) {
            return true;
         }

         if (var4 == null) {
            break;
         }
      }

      return false;
   }

   static {
      long var0 = 8385823763971L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[9];
      int var5 = 0;
      String var6 = "©`º/\u009d\u001fX±^\u008a$WR\u0001ýÍð¨kÃ'\u009d\u0086\u0013ÁË|£þsÉûË®Ïô\u001eý\u0088î\u0011\u001du\u0000>\u0011ª't\u0087\u008dm3\u009a}\u009e^6\u00adÂ\u0096\u0019\u000bÏ\tÊ_°\u0099yF\u001a´Oøk\u009a(\u0098\u0005oi+n\u0093U\u0089\u00adòÊcuxòÙÍÄ\u001dg\"jã\u0082à\u000fdU\u008d ©%±J\u009f A\u0085K|¿ÿÎÚ`l\u001a);æ\u0002·Ïé¥`pÝ\u0085z¼äË\u0017¯á¾ËkA%\\·6&DØú\f\u0014Æ®\u0003\u0015À_£ýI´Éà\u0099:Ò¹\u000e\u0084\u0099äÀÃPl\u00add?¤\u009eY\u009f:\u009b\\Ó\t\u0095mâ\u001f¡Þ\\uûìÍ{\u009aLl-@f\bæÇ¨Úø¢×ªñ\u0012§SÒ¤ î÷àéKL\"=1Ì÷=BÄ\u0018\u008cü\u0019u\u009b|Ç°\u0083\u0012={Oº¬¤èT4aÇ`{V±\u009eF\u0000Ë¯ÆE,\u0094ª\u0085\u0006vâgYjQ\u0082hðç\u001blU$K\u007f!ZÝzQó§&\u0012Ï£\u001eJÎX\u0010@h~\u0098Ñä÷}2¼\u001e¹\u0011\u0090m$©ôÓ\u0011¢6tÝÎqÝÔ$\u008a4Ì«!Î·\u0012(\u0099\u0013\u0015º¸\u0004\u0001º\u0085Çæ\u0003\u0097ä\u0006K\u001c9K\u008e\u000e-dz\tÆñ\u009d\u001f»N~%\u0083\u0011þ\u0007¹\u00adså\u0080\u0080påúï\u0081\r\u001ce¼\u0082nÔÕ\u001aU?ÈJ{g\u009bw\u0094~dûÝAÍ75õî^ð`\u009a\u0092\u0094ý{_âÌ\u0089\u001cæ´úM\u000bÝùF3ªgöÆx\u0000û\u009cH\u008eÊUnz \u0013ê\u0083\nª àÈr\u0005OöE¼\u0012\\\u0095òñE¨ s\u0097bÞ°ÉÍ\u0007îçè%Ì;âÓ\u009aÆ¯üK\u008bÒË\u009a\"Ê\u0083ªxø0Ï\u0084\u001a\u0018yè\u009b¾bô8f0B\u0082òÔ\u0095\u0007§=¼¤>^\u009eòçŰòêãG©K3ì\u00165Ýv¡0Yr¥l2Ú\u0082I\t¨½©\u000bÅ\u00ad&ôjcí\u0080_{\"¹ô\u0096£<û¥Bój9|AÖ\u0085DAéµ\u008fú\u0015gø=»Þü$\u0095¸P!ñ©¤\u0012où\u0012\u0098°Òq-\u0095\u001f\u009a\u00adÚ\u0010$\u0083|Ës{ÃPöH\u001f\"¼²6ª2Â\u0090¢.ª\u0083,¹~ë\u0011±\u0004\u008e\u001d\u0013\u0092\u0013×]~\n,\u001d\u009a»\u0091Ö¤å\u009c¼VrÔô¦\u009fÓû\u001a\n/ÆÐN¹Q\u0004(ù\u001cr\u0083b?µ\u000f\u00adc¸ln PPiù±¤º $\u0012×\u0097\u0000`\u009cnÿ\bÙös\u0014¢\u0013¡E4\u001e\nìlÜµü_Ò±\u0002å\u0017À\nòËò¢ÞãWÄÒö\u009f\u0091=Æ\bÜ\u008aõ9{Rþ^\u0014ð\u0007¨\u008d]\u0015¡éi%¤\u009cÎÇ7e\u0002Õ\u000e§\u0006pHzÄ\u001e'R¥\r§´õ\u00adÄ'pzq\u0019Ç\u0013\u001b\u0082\u001f\u000evvxn\u0091^×E\u00816«\u008aIó(Æm\u0088Þ|ºð\u0088Â~\u009aç\u007f\u0090¬\u008fP\u0007\u007f\u0084µý&\u0083\u0087\fÑ¹\u001f\u0004§O8_\u0007\u0089»'·ãUôé\r»\u008dvU'\u001c7\u0005\u0013ÀP\u009d1MáÓ\u000b\u0011vØk\u008fk\u000b\u0089¯Ñ îÈFõd\b\u007f%±oá-áá¡,=îQ\u0005×ç\u0095§ø%$\u0083\u001fVp¥ ¥¡ÊÒ\u008bÝÁÈ\u008d\u0090HT¤::A__.Bæ°ÈmCr}¦\u001b¶Z[\u0018]ódþÚ«\u0007J_Ü&ù\u009c_¨ªQüìEÙ]\u0012\t";
      int var7 = "©`º/\u009d\u001fX±^\u008a$WR\u0001ýÍð¨kÃ'\u009d\u0086\u0013ÁË|£þsÉûË®Ïô\u001eý\u0088î\u0011\u001du\u0000>\u0011ª't\u0087\u008dm3\u009a}\u009e^6\u00adÂ\u0096\u0019\u000bÏ\tÊ_°\u0099yF\u001a´Oøk\u009a(\u0098\u0005oi+n\u0093U\u0089\u00adòÊcuxòÙÍÄ\u001dg\"jã\u0082à\u000fdU\u008d ©%±J\u009f A\u0085K|¿ÿÎÚ`l\u001a);æ\u0002·Ïé¥`pÝ\u0085z¼äË\u0017¯á¾ËkA%\\·6&DØú\f\u0014Æ®\u0003\u0015À_£ýI´Éà\u0099:Ò¹\u000e\u0084\u0099äÀÃPl\u00add?¤\u009eY\u009f:\u009b\\Ó\t\u0095mâ\u001f¡Þ\\uûìÍ{\u009aLl-@f\bæÇ¨Úø¢×ªñ\u0012§SÒ¤ î÷àéKL\"=1Ì÷=BÄ\u0018\u008cü\u0019u\u009b|Ç°\u0083\u0012={Oº¬¤èT4aÇ`{V±\u009eF\u0000Ë¯ÆE,\u0094ª\u0085\u0006vâgYjQ\u0082hðç\u001blU$K\u007f!ZÝzQó§&\u0012Ï£\u001eJÎX\u0010@h~\u0098Ñä÷}2¼\u001e¹\u0011\u0090m$©ôÓ\u0011¢6tÝÎqÝÔ$\u008a4Ì«!Î·\u0012(\u0099\u0013\u0015º¸\u0004\u0001º\u0085Çæ\u0003\u0097ä\u0006K\u001c9K\u008e\u000e-dz\tÆñ\u009d\u001f»N~%\u0083\u0011þ\u0007¹\u00adså\u0080\u0080påúï\u0081\r\u001ce¼\u0082nÔÕ\u001aU?ÈJ{g\u009bw\u0094~dûÝAÍ75õî^ð`\u009a\u0092\u0094ý{_âÌ\u0089\u001cæ´úM\u000bÝùF3ªgöÆx\u0000û\u009cH\u008eÊUnz \u0013ê\u0083\nª àÈr\u0005OöE¼\u0012\\\u0095òñE¨ s\u0097bÞ°ÉÍ\u0007îçè%Ì;âÓ\u009aÆ¯üK\u008bÒË\u009a\"Ê\u0083ªxø0Ï\u0084\u001a\u0018yè\u009b¾bô8f0B\u0082òÔ\u0095\u0007§=¼¤>^\u009eòçŰòêãG©K3ì\u00165Ýv¡0Yr¥l2Ú\u0082I\t¨½©\u000bÅ\u00ad&ôjcí\u0080_{\"¹ô\u0096£<û¥Bój9|AÖ\u0085DAéµ\u008fú\u0015gø=»Þü$\u0095¸P!ñ©¤\u0012où\u0012\u0098°Òq-\u0095\u001f\u009a\u00adÚ\u0010$\u0083|Ës{ÃPöH\u001f\"¼²6ª2Â\u0090¢.ª\u0083,¹~ë\u0011±\u0004\u008e\u001d\u0013\u0092\u0013×]~\n,\u001d\u009a»\u0091Ö¤å\u009c¼VrÔô¦\u009fÓû\u001a\n/ÆÐN¹Q\u0004(ù\u001cr\u0083b?µ\u000f\u00adc¸ln PPiù±¤º $\u0012×\u0097\u0000`\u009cnÿ\bÙös\u0014¢\u0013¡E4\u001e\nìlÜµü_Ò±\u0002å\u0017À\nòËò¢ÞãWÄÒö\u009f\u0091=Æ\bÜ\u008aõ9{Rþ^\u0014ð\u0007¨\u008d]\u0015¡éi%¤\u009cÎÇ7e\u0002Õ\u000e§\u0006pHzÄ\u001e'R¥\r§´õ\u00adÄ'pzq\u0019Ç\u0013\u001b\u0082\u001f\u000evvxn\u0091^×E\u00816«\u008aIó(Æm\u0088Þ|ºð\u0088Â~\u009aç\u007f\u0090¬\u008fP\u0007\u007f\u0084µý&\u0083\u0087\fÑ¹\u001f\u0004§O8_\u0007\u0089»'·ãUôé\r»\u008dvU'\u001c7\u0005\u0013ÀP\u009d1MáÓ\u000b\u0011vØk\u008fk\u000b\u0089¯Ñ îÈFõd\b\u007f%±oá-áá¡,=îQ\u0005×ç\u0095§ø%$\u0083\u001fVp¥ ¥¡ÊÒ\u008bÝÁÈ\u008d\u0090HT¤::A__.Bæ°ÈmCr}¦\u001b¶Z[\u0018]ódþÚ«\u0007J_Ü&ù\u009c_¨ªQüìEÙ]\u0012\t"
         .length();
      char var8 = 392;
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
                     CONST_Z = var4;
                     CONST_A = new String[9];
                     CONST_E = new HashMap(13);
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
                     String var15 = "µà§ÂúØå\rm\\Öé\u0089\u0084\u009dÀ\u000fÄ \u0088\u009b\u009dLH";
                     int var16 = "µà§ÂúØå\rm\\Öé\u0089\u0084\u009dÀ\u000fÄ \u0088\u009b\u009dLH".length();
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
                                    CONST_C = var13;
                                    CONST_D = new Long[5];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "Ó\u0002\u001d¿¥§À\u008a\f\u001eä\u0098\u0088\u008fnm";
                                 var16 = "Ó\u0002\u001d¿¥§À\u008a\f\u001eä\u0098\u0088\u008fnm".length();
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

                  var6 = "8ö³ÑÍ0ì¿îY\u0090\u000e½^êrFGà±\u0088®(uTãfn0u«ÜÔ±¡\u008càÝ\u0099s[µ\u008c\u008bOqµØ\u00047\u0082ïf\u0081ê,$0\u001a\u0014\u0094×u¬è\u001dÛ\u0092\n|\"\u0092%\u0015è®\u0013»Ô\u0098ÓZC±\u000f·\u009f\u0094ýãM\u000b\u0085î[Ú\u0092\"\u0004p9ûâ\u0098\näHv\u0012à\bÜÎHw*\u0085\u001c\u0012\u001bo×vJ/t\u008bá\r&\u0002u;\u001d\u008e<®Â-7#\u009eod4ØH\u0082Çè2\n\u0001g£\u0017=UyL\"õ½dPTz\u009fªË\u00131Q½À£³tP\u0090TC:P\u0094gî¼\u009c\u007fL0\u008c[\u0007à÷qþ0ú=#\u0096g8!\u0095O¸>¬wc\\\u001c=Ü%U\u0012ÖiÇ`Ïå¶úñ\u0097\u0011ì¨\u001aa\u0015Uª*V¾<î¡<Ý\u0002Û\b\u0081Aô*×4@\u0010@<\u0005\u009e#kÄÈlµ\u0012B\u0082Ög\u0094´\\Þi_Ò©kÓ\u0096#VÒ\u00182:ïì÷ô$¤(\"_Ù÷éõÛ·+û_!cëä\u001022F\u0014f\f[\u001fÄqS°W[G\u0099";
                  var7 = "8ö³ÑÍ0ì¿îY\u0090\u000e½^êrFGà±\u0088®(uTãfn0u«ÜÔ±¡\u008càÝ\u0099s[µ\u008c\u008bOqµØ\u00047\u0082ïf\u0081ê,$0\u001a\u0014\u0094×u¬è\u001dÛ\u0092\n|\"\u0092%\u0015è®\u0013»Ô\u0098ÓZC±\u000f·\u009f\u0094ýãM\u000b\u0085î[Ú\u0092\"\u0004p9ûâ\u0098\näHv\u0012à\bÜÎHw*\u0085\u001c\u0012\u001bo×vJ/t\u008bá\r&\u0002u;\u001d\u008e<®Â-7#\u009eod4ØH\u0082Çè2\n\u0001g£\u0017=UyL\"õ½dPTz\u009fªË\u00131Q½À£³tP\u0090TC:P\u0094gî¼\u009c\u007fL0\u008c[\u0007à÷qþ0ú=#\u0096g8!\u0095O¸>¬wc\\\u001c=Ü%U\u0012ÖiÇ`Ïå¶úñ\u0097\u0011ì¨\u001aa\u0015Uª*V¾<î¡<Ý\u0002Û\b\u0081Aô*×4@\u0010@<\u0005\u009e#kÄÈlµ\u0012B\u0082Ög\u0094´\\Þi_Ò©kÓ\u0096#VÒ\u00182:ïì÷ô$¤(\"_Ù÷éõÛ·+û_!cëä\u001022F\u0014f\f[\u001fÄqS°W[G\u0099"
                     .length();
                  var8 = 312;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18390;
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
            throw new RuntimeException("rip/breeze/client/dR", var10);
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
         throw new RuntimeException("rip/breeze/client/dR" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10259;
      if (CONST_D[var3] == null) {
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
         long var5 = CONST_C[var3];
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
         Object[] var9 = (Object[])CONST_E.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_E.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/dR", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_D[var3] = var14;
      }

      return CONST_D[var3];
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
         throw new RuntimeException("rip/breeze/client/dR" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
