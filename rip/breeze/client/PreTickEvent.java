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
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import rip.breeze.BlockPos;
import rip.breeze.BlockUtil1;
import rip.breeze.BlockUtil2;
import rip.breeze.BlockUtil3;
import rip.breeze.BlockUtil4;
import rip.breeze.BooleanSetting;
import rip.breeze.CancellableEvent;
import rip.breeze.ColorSetting;
import rip.breeze.CombatUtil1;
import rip.breeze.CombatUtil2;
import rip.breeze.ConfigUtil1_x;
import rip.breeze.DiggingAction;
import rip.breeze.DoubleSetting;
import rip.breeze.EntityAction;
import rip.breeze.EntityPlayer;
import rip.breeze.EntityPlayerClient;
import rip.breeze.EntityUtil1;
import rip.breeze.EntityUtil2;
import rip.breeze.EntityUtil3;
import rip.breeze.GuiChest;
import rip.breeze.GuiContainer;
import rip.breeze.GuiInventory;
import rip.breeze.GuiScreen;
import rip.breeze.ImageUtil4;
import rip.breeze.IntSetting;
import rip.breeze.InventoryPlayer;
import rip.breeze.InventoryUtils;
import rip.breeze.ItemStack;
import rip.breeze.LicenseState;
import rip.breeze.LivingEntity;
import rip.breeze.MathUtil5;
import rip.breeze.MathUtils;
import rip.breeze.MovementUtil1;
import rip.breeze.MovementUtil2;
import rip.breeze.MovementUtil3;
import rip.breeze.MovementUtil4;
import rip.breeze.MovementUtil5;
import rip.breeze.MovementUtil6;
import rip.breeze.Packet;
import rip.breeze.PacketUtil1;
import rip.breeze.PacketUtil10;
import rip.breeze.PacketUtil11;
import rip.breeze.PacketUtil12;
import rip.breeze.PacketUtil13;
import rip.breeze.PacketUtil2;
import rip.breeze.PacketUtil3;
import rip.breeze.PacketUtil4;
import rip.breeze.PacketUtil5;
import rip.breeze.PacketUtil6;
import rip.breeze.PacketUtil7;
import rip.breeze.PacketUtil8;
import rip.breeze.PacketUtil9;
import rip.breeze.PacketUtils;
import rip.breeze.PlayerUtil1;
import rip.breeze.RangeSetting;
import rip.breeze.RenderUtil2;
import rip.breeze.RenderUtil4_x;
import rip.breeze.RenderUtil6;
import rip.breeze.RotationUtil1;
import rip.breeze.RotationUtil2;
import rip.breeze.RotationUtil3;
import rip.breeze.RotationUtil4;
import rip.breeze.RotationUtil5;
import rip.breeze.RotationUtils;
import rip.breeze.RoundedRect;
import rip.breeze.SettingBuilder;
import rip.breeze.StringDecryptor;
import rip.breeze.SubGroup;
import rip.breeze.UseEntityAction;
import rip.breeze.Util18;
import rip.breeze.Util25;
import rip.breeze.Util26;
import rip.breeze.VecUtil1;
import rip.breeze.WorldUtil2;

public class PreTickEvent implements SettingBuilder {
   private final Map<String, Class<? extends CancellableEvent>> map_a;
   private static boolean fieldBool_b;
   private static final String[] CONST_D;
   private static final String[] CONST_E;
   private static final Map CONST_F = new HashMap(13);

   public PreTickEvent() {
      long var1 = 101073501617601L;
      super();
      this.map_a = new HashMap<>();
      short var10001 = 19695;
      long var10002 = 4938286844405324566L ^ var1;
      this.map_a.put("Render3DEvent", Render3DEventEvent.class);
      var10001 = 15672;
      var10002 = 4236780550848146131L ^ var1;
      this.map_a.put("PreTickEvent", PreTickEventEvent.class);
      var10001 = 5460;
      var10002 = 8805415540802765497L ^ var1;
      this.map_a.put("RunGameLoopEvent", RunGameLoopEventEvent.class);
      var10001 = 31842;
      var10002 = 1013735135693155222L ^ var1;
      this.map_a.put("CharTypedEvent", CharTypedEventEvent.class);
      var10001 = 12648;
      var10002 = 5900514835139454592L ^ var1;
      this.map_a.put("MouseClickedEvent", MouseClickedEventEvent.class);
      var10001 = 24055;
      var10002 = 2419769985293650452L ^ var1;
      this.map_a.put("KeyPressedEvent", KeyPressedEvent.class);
      var10001 = 22201;
      var10002 = 6552372595853885772L ^ var1;
      this.map_a.put("PacketSendEvent", PacketSendEventEvent.class);
      var10001 = 29971;
      var10002 = 794142532920779493L ^ var1;
      this.map_a.put("PacketReceiveEvent", PacketReceiveEventEvent.class);
      var10001 = 5223;
      var10002 = 3322190381761774495L ^ var1;
      this.map_a.put("RenderHandEvent", RenderHandEventEvent.class);
      var10001 = 4287;
      var10002 = 6855657849845368642L ^ var1;
      this.map_a.put("PreMotionEvent", PreMotionEventEvent.class);
      var10001 = 20047;
      var10002 = 6958212870033709502L ^ var1;
      this.map_a.put("MotionEvent", MotionEventEvent.class);
      var10001 = 1964;
      var10002 = 7068393875652825152L ^ var1;
      this.map_a.put("PostMotionEvent", PostMotionEventEvent.class);
      boolean var10000 = isValid();
      short var27 = 19864;
      long var10003 = 1308730006820854397L ^ var1;
      this.map_a.put("WorldChangedEvent", WorldChangedEventEvent.class);
      short var28 = 22644;
      var10003 = 5520387322577194891L ^ var1;
      this.map_a.put("RenderEntityEvent", RenderEntityEventEvent.class);
      short var29 = 13780;
      var10003 = 4190643722087457333L ^ var1;
      this.map_a.put("Render2DEvent", Render2DEventEvent.class);
      short var30 = 18871;
      var10003 = 1684361135104728645L ^ var1;
      this.map_a.put("AngleUpdateEvent", AngleUpdateEventEvent.class);
      short var31 = 30370;
      var10003 = 6561613035098055006L ^ var1;
      this.map_a.put("SpoofInputEvent", SpoofInputEventEvent.class);
      short var32 = 1114;
      var10003 = 7817883629136696250L ^ var1;
      this.map_a.put("PreAttackEvent", PreAttackEventEvent.class);
      short var33 = 7722;
      var10003 = 3704354937886984665L ^ var1;
      this.map_a.put("PostAttackEvent", PostAttackEventEvent.class);
      boolean var3 = var10000;
      var10001 = 18224;
      var10002 = 4975033230576390356L ^ var1;
      this.map_a.put("JumpEvent", JumpEventEvent.class);
      if (!LicenseState.isValid_2()) {
         toggle(!var3);
      }
   }

   public void processAll(Context var1, Scriptable var2) {
      long var3 = 40253434462060L;
      rip.breeze.Util135.processAll_2(var1, var2, RenderUtil4_x.class);
      rip.breeze.Util132.decrypt(var1, var2, RoundedRect.class);
      rip.breeze.Util132.decrypt(var1, var2, ConfigUtil1_x.class);
      rip.breeze.Util135.processAll_2(var1, var2, SubGroup.class);
      rip.breeze.Util135.processAll_2(var1, var2, rip.breeze.Setting.class);
      rip.breeze.Util135.processAll_2(var1, var2, BooleanSetting.class);
      rip.breeze.Util135.processAll_2(var1, var2, IntSetting.class);
      rip.breeze.Util135.processAll_2(var1, var2, DoubleSetting.class);
      boolean var10000 = checkCondition();
      rip.breeze.Util135.processAll_2(var1, var2, rip.breeze.ModeSetting.class);
      boolean var5 = var10000;
      rip.breeze.Util135.processAll_2(var1, var2, RangeSetting.class);
      rip.breeze.Util135.processAll_2(var1, var2, ColorSetting.class);
      rip.breeze.Util132.decrypt(var1, var2, RotationUtils.class);
      rip.breeze.Util132.decrypt(var1, var2, LivingEntity.class);
      rip.breeze.Util132.decrypt(var1, var2, EntityPlayer.class);
      rip.breeze.Util132.decrypt(var1, var2, EntityPlayerClient.class);
      rip.breeze.Util132.decrypt(var1, var2, InventoryPlayer.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.EnumFacing.class);
      rip.breeze.Util132.decrypt(var1, var2, GuiScreen.class);
      rip.breeze.Util132.decrypt(var1, var2, GuiContainer.class);
      rip.breeze.Util132.decrypt(var1, var2, GuiInventory.class);
      rip.breeze.Util132.decrypt(var1, var2, GuiChest.class);
      rip.breeze.Util132.decrypt(var1, var2, Util26.class);
      rip.breeze.Util132.decrypt(var1, var2, BlockUtil3.class);
      rip.breeze.Util132.decrypt(var1, var2, Util25.class);
      rip.breeze.Util132.decrypt(var1, var2, BlockUtil1.class);
      rip.breeze.Util132.decrypt(var1, var2, ItemStack.class);
      rip.breeze.Util132.decrypt(var1, var2, WorldUtil2.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.RaytraceResult.class);
      rip.breeze.Util132.decrypt(var1, var2, BlockPos.class);
      rip.breeze.Util132.decrypt(var1, var2, VecUtil1.class);
      rip.breeze.Util132.decrypt(var1, var2, CombatUtil2.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.PacketUtil14.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil11.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil12.class);
      rip.breeze.Util132.decrypt(var1, var2, UseEntityAction.class);
      rip.breeze.Util132.decrypt(var1, var2, RotationUtil5.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda10.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda11.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda12.class);
      rip.breeze.Util132.decrypt(var1, var2, DiggingAction.class);
      rip.breeze.Util132.decrypt(var1, var2, BlockUtil4.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil13.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda13.class);
      rip.breeze.Util132.decrypt(var1, var2, EntityAction.class);
      rip.breeze.Util132.decrypt(var1, var2, MovementUtil3.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil4.class);
      rip.breeze.Util132.decrypt(var1, var2, InventoryUtils.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil5.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda2.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda3.class);
      rip.breeze.Util132.decrypt(var1, var2, EntityUtil2.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil6.class);
      rip.breeze.Util132.decrypt(var1, var2, BlockUtil2.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil7.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda4.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil8.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil9.class);
      rip.breeze.Util132.decrypt(var1, var2, RotationUtil3.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda5.class);
      rip.breeze.Util132.decrypt(var1, var2, EntityUtil3.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil10.class);
      rip.breeze.Util132.decrypt(var1, var2, MovementUtil4.class);
      rip.breeze.Util132.decrypt(var1, var2, MovementUtil5.class);
      rip.breeze.Util132.decrypt(var1, var2, MovementUtil6.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda6.class);
      rip.breeze.Util132.decrypt(var1, var2, RotationUtil4.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda7.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda8.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda9.class);
      rip.breeze.Util132.decrypt(var1, var2, RotationUtil1.class);
      rip.breeze.Util132.decrypt(var1, var2, RotationUtil2.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil1.class);
      rip.breeze.Util132.decrypt(var1, var2, MovementUtil1.class);
      rip.breeze.Util132.decrypt(var1, var2, MovementUtil2.class);
      rip.breeze.Util132.decrypt(var1, var2, EntityUtil1.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil2.class);
      rip.breeze.Util132.decrypt(var1, var2, rip.breeze.Lambda.class);
      rip.breeze.Util132.decrypt(var1, var2, PacketUtil3.class);
      rip.breeze.Util132.decrypt(var1, var2, Packet.class);
      if (var5) {
         LicenseState.toggle(LicenseState.isValid_2());
      }
   }

   public void sendPacket(Context var1, Scriptable var2, rip.breeze.ImageUtil15 var3) {
      long var4 = 94521461753413L;
      rip.breeze.RenderUtil35.getDataBuilder49(var1, var2, "mc", CombatUtil1.class);
      rip.breeze.RenderUtil35.getDataBuilder49(var1, var2, "breeze", PlayerUtil1.class);
      rip.breeze.RenderUtil35.getDataBuilder49(var1, var2, "time", Util18.class);
      rip.breeze.RenderUtil35.getDataBuilder49(var1, var2, "formatting", RenderUtil2.class);
      rip.breeze.RenderUtil35.getDataBuilder49(var1, var2, "math", MathUtils.class);
      rip.breeze.RenderUtil35.getDataBuilder49(var1, var2, "renderer", ImageUtil4.class);
      rip.breeze.RenderUtil35.getDataBuilder49(var1, var2, "hudRenderer", RenderUtil6.class);
      ScriptableObject.putProperty(var2, "spoofManager", new PacketUtils(var3, BreezeClient.getConfigManager()));
      ScriptableObject.putProperty(
         var2, "rotationManager", new rip.breeze.RotationUtil9(var3, BreezeClient.getModuleRegistry())
      );
      ScriptableObject.putProperty(var2, "hudManager", new MathUtil5(var3, BreezeClient.getModuleManager()));
   }

   public Class<? extends CancellableEvent> getClass(String var1) {
      return this.map_a.get(var1);
   }

   public static void toggle(boolean var0) {
      fieldBool_b = var0;
   }

   public static boolean isValid() {
      return fieldBool_b;
   }

   public static boolean checkCondition() {
      boolean var0 = isValid();
      return !var0;
   }

   static {
      toggle(true);
      long var0 = 26258645855470L;
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
      String var6 = "MfëÝOõJ¨Ì)qç¿\u0087¬<_\u0080ðª\u00ad\u0087¥Á\u0018\u0006\u0095fÔÄF¶Sõ\t\u0014©\u008cT\u0017\u0096N½Çß\u008cEÏã\u0018y\u0088¡)èLñÞ\u0090Ã\u008eíG>\u0089Xp\u0084ÝÅ\u0006*7\u0002\u0010ÓqÎ´ä{\u001f\u0096\u0014¾\u0007{$\u0096\f\u000f ýw8²Ò%\u0000\u001d\u000füRTJ÷{F\u000bÿ\u0016\u008d°X\f7\u0080÷i¾A¨2\u008a \u0088¿²lk~LA\u0085\u0082\f\u000eF\u0018Ò ¿\u0000k\u0002ÇÇ1ý:;~.Ý\u0098µ,(\u0097óª\\\u008cWi³r´`Xó-ôë7\u009bB\u0015C èç\u0002KNa\u0013nbVÀ\u0003\u0007?j¸e®\u0018V/Ìå\u0005\be¯\u0010\u001a),«\u00adD)0¾\u0091~X0~í\u0018¥Iª\u000f\u001dÿ¶ó*\u0006\u009bc\u009dö\u0089'«÷\u008dÿ\u000fûVY\u0018\u008foêè©°\u0010ýë\u0087ød\u001cÞö]\u008eËV]\\©c\t êeò®ºÉÐÂ\b0ev\r;\u009b±1øÔQ\u001cØþ\u0016ÿT[ÇºGÐ)(ÔÉ¬øbóæ'\u0011£Ì&\u0016\u0016D1\u008fÏP?ÿ#\u0000Îñ/[K_$O\u008d%é#a\u0097\u008a3 \u0018è\u0015bð\u0006µÊ7\u009a\r\u0010\u009f)[F£\u009c\u0003ìæ#ò¿\u0013 \u0092©Î?D_\u0006ððå5\u001e\u0082qÈ\t3ø#\u0012éo¬=ÒÎqûòÍ·\u0005 S´\b\" Ä¯¾l.ö&v,¿W\u0007 ?¤¶GðJ\u0096ÑÁ\nòY\u000e\u000b(\u009b+t\u0017]\u0080\u008eÔ :Ð\u0013\u0088ù¶aÁù¿bÄ%\u0092\u0014r`öÆ=ú\u0010;\u000bè\u0000\u0095\u001dù±\u0094\u0010,3á\\k¥\u0011AñË!\u001d\\X\u000f\u0018(½ñ\u007f=k\u001e\u0005ç¬ùÈ|BÓK\u009dylrºg\u009aÐT\u009e®\u0001kxýZÓ\u0088òn\u009b=ÞgÀ\u0018lá4\u0096v}oA\u009dRF³u-ãX])\bÜØ.2ø\u0010MÂ\f&¥\\(\u0099\"®\u008f\u009cw\u008a%¯(ÉÂì\u0002\u008b\u008f°ë\u009d\u001fg\u0006¼²HÀÜµd!NhÖ°\u0001N\u0014Jnødç\u001dW$ð\u008b\u001d\u0002·\u0018\u0086\u0013g\u009eý9\u0015h(+Z\u0006ÐË\u009d\u008c\u008a*\u00869OÂ£ä \nwÒ\u000b\u0097[¡íA©ºÉ\u009bC£Ì<vÉ\u0005\u009f\u0014½\u0097o\u0085ä\u0089Wr|Â\u0010jé\u0018;¹\u001e3ã¼\u0019ºXy,ª]\u0018Z\u0086[)qOðC\\TÜÇ\nû´Ý\u009dÑ7Ç\u001a4Ý\u001b Ä\u0010à¢H¸\u0084\u0095C\u0084D\u000b\\\u0083¹\u008d\u0007%°|x\u0084#8@ªh÷\u008dC¿¡ ®sGøq\u0085]yUÐäH(\u0019S8\u0007\u001d\u008fÓ\u0095h\u0099\u0096Á\"Õ\u0097¿q¹ú úñ(f\u0010\u0019T\u0011N\u0007\u0082xRÐ\u001fstÁ)Ã>\u001a´\u00073Ñ\u009e¶O\u0001\t\u009c";
      int var7 = "MfëÝOõJ¨Ì)qç¿\u0087¬<_\u0080ðª\u00ad\u0087¥Á\u0018\u0006\u0095fÔÄF¶Sõ\t\u0014©\u008cT\u0017\u0096N½Çß\u008cEÏã\u0018y\u0088¡)èLñÞ\u0090Ã\u008eíG>\u0089Xp\u0084ÝÅ\u0006*7\u0002\u0010ÓqÎ´ä{\u001f\u0096\u0014¾\u0007{$\u0096\f\u000f ýw8²Ò%\u0000\u001d\u000füRTJ÷{F\u000bÿ\u0016\u008d°X\f7\u0080÷i¾A¨2\u008a \u0088¿²lk~LA\u0085\u0082\f\u000eF\u0018Ò ¿\u0000k\u0002ÇÇ1ý:;~.Ý\u0098µ,(\u0097óª\\\u008cWi³r´`Xó-ôë7\u009bB\u0015C èç\u0002KNa\u0013nbVÀ\u0003\u0007?j¸e®\u0018V/Ìå\u0005\be¯\u0010\u001a),«\u00adD)0¾\u0091~X0~í\u0018¥Iª\u000f\u001dÿ¶ó*\u0006\u009bc\u009dö\u0089'«÷\u008dÿ\u000fûVY\u0018\u008foêè©°\u0010ýë\u0087ød\u001cÞö]\u008eËV]\\©c\t êeò®ºÉÐÂ\b0ev\r;\u009b±1øÔQ\u001cØþ\u0016ÿT[ÇºGÐ)(ÔÉ¬øbóæ'\u0011£Ì&\u0016\u0016D1\u008fÏP?ÿ#\u0000Îñ/[K_$O\u008d%é#a\u0097\u008a3 \u0018è\u0015bð\u0006µÊ7\u009a\r\u0010\u009f)[F£\u009c\u0003ìæ#ò¿\u0013 \u0092©Î?D_\u0006ððå5\u001e\u0082qÈ\t3ø#\u0012éo¬=ÒÎqûòÍ·\u0005 S´\b\" Ä¯¾l.ö&v,¿W\u0007 ?¤¶GðJ\u0096ÑÁ\nòY\u000e\u000b(\u009b+t\u0017]\u0080\u008eÔ :Ð\u0013\u0088ù¶aÁù¿bÄ%\u0092\u0014r`öÆ=ú\u0010;\u000bè\u0000\u0095\u001dù±\u0094\u0010,3á\\k¥\u0011AñË!\u001d\\X\u000f\u0018(½ñ\u007f=k\u001e\u0005ç¬ùÈ|BÓK\u009dylrºg\u009aÐT\u009e®\u0001kxýZÓ\u0088òn\u009b=ÞgÀ\u0018lá4\u0096v}oA\u009dRF³u-ãX])\bÜØ.2ø\u0010MÂ\f&¥\\(\u0099\"®\u008f\u009cw\u008a%¯(ÉÂì\u0002\u008b\u008f°ë\u009d\u001fg\u0006¼²HÀÜµd!NhÖ°\u0001N\u0014Jnødç\u001dW$ð\u008b\u001d\u0002·\u0018\u0086\u0013g\u009eý9\u0015h(+Z\u0006ÐË\u009d\u008c\u008a*\u00869OÂ£ä \nwÒ\u000b\u0097[¡íA©ºÉ\u009bC£Ì<vÉ\u0005\u009f\u0014½\u0097o\u0085ä\u0089Wr|Â\u0010jé\u0018;¹\u001e3ã¼\u0019ºXy,ª]\u0018Z\u0086[)qOðC\\TÜÇ\nû´Ý\u009dÑ7Ç\u001a4Ý\u001b Ä\u0010à¢H¸\u0084\u0095C\u0084D\u000b\\\u0083¹\u008d\u0007%°|x\u0084#8@ªh÷\u008dC¿¡ ®sGøq\u0085]yUÐäH(\u0019S8\u0007\u001d\u008fÓ\u0095h\u0099\u0096Á\"Õ\u0097¿q¹ú úñ(f\u0010\u0019T\u0011N\u0007\u0082xRÐ\u001fstÁ)Ã>\u001a´\u00073Ñ\u009e¶O\u0001\t\u009c"
         .length();
      char var8 = 24;
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
                     CONST_D = var4;
                     CONST_E = new String[30];
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

                  var6 = "*¶±ArZjbÙ\u001fnÀ°Ç*å\u0088?\u008d 9ëm:g\u0091\u001e%r\u0007Ü:\u001eÄó,á\u0091\u0091n À\u0095°\u008dz\u001f¶/0'\u0002Qk±cÚÓ-¦.mÊ.F5÷á}NäÓ§";
                  var7 = "*¶±ArZjbÙ\u001fnÀ°Ç*å\u0088?\u008d 9ëm:g\u0091\u001e%r\u0007Ü:\u001eÄó,á\u0091\u0091n À\u0095°\u008dz\u001f¶/0'\u0002Qk±cÚÓ-¦.mÊ.F5÷á}NäÓ§"
                     .length();
                  var8 = '(';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10808;
      if (CONST_E[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_F.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_F.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/eg", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_D[var3].getBytes("ISO-8859-1");
         CONST_E[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_E[var3];
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
         throw new RuntimeException("rip/breeze/client/eg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
