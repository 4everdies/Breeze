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
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockWall;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(a = "BridgeAssist", b = "Sneaks for you when bridging to prevent falling off.", d = rip.breeze.ModuleCategory.MOVEMENT, c = "eagle")
public class BridgeAssist extends BreezeModule {
   private final GenericSetting<Boolean> inAirSetting;
   private final GenericSetting<rip.breeze.RangeValue> edgeOffsetSetting;
   private final GenericSetting<rip.breeze.RangeValue> unsneakDelaySetting;
   private final GenericSetting<Boolean> releaseSneakSetting;
   private static final float CONST_R = 55.0F;
   private static final int CONST_S;
   private static final int CONST_T;
   private static final long eka_1;
   private static final double CONST_V = 0.05;
   private static final double CONST_W = 2.0;
   private static final double CONST_X = 0.25;
   private static final double CONST_Y = 0.295;
   private final Util133 dataBuilder112_z;
   private final Util133 dataBuilder112_A;
   private boolean fieldBool_B;
   private boolean fieldBool_C;
   private double double_D;
   private long fieldLong_E;
   private static final String[] CONST_G;
   private static final String[] CONST_H;
   private static final Map CONST_I = new HashMap(13);
   private static final long[] CONST_J;
   private static final Long[] CONST_K;
   private static final Map CONST_L;

   public BridgeAssist() {
      long var1 = 37856020439668L;
      super();
      short var10002 = 769;
      long var10003 = 5672349495055836139L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "InAir");
      var10002 = 15067;
      var10003 = 6544677517650647606L ^ var1;
      this.inAirSetting = var10001.getDataBuilder50_3("Keeps sneaking while airborne, allowing you to bridge diagonally upwards.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      var10002 = 13059;
      var10003 = 1751350505549190120L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "EdgeOffset");
      var10002 = 28937;
      var10003 = 482969877666828775L ^ var1;
      this.edgeOffsetSetting = var10001.getDataBuilder50_3("How far past the block edge you can move before sneaking. Higher bridges faster but risks falling.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(0.05, 0.12))
         .clamp(rip.breeze.RangeValue.getPredicate(0.0, 0.2, 0.01))
         .getDataBuilder54();
      var10002 = 21618;
      var10003 = 2276531892833105050L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "UnsneakDelay");
      var10002 = 27422;
      var10003 = 8606233021352381426L ^ var1;
      this.unsneakDelaySetting = var10001.getDataBuilder50_3("How long to keep sneaking after reaching safety (in milliseconds).")
         .getDataBuilder50_4(new rip.breeze.RangeValue(0.0, 300.0))
         .clamp(rip.breeze.RangeValue.getPredicate_3(0, 500))
         .getDataBuilder54();
      var10002 = 25913;
      var10003 = 684766611324962262L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "ReleaseSneak");
      var10002 = 21690;
      var10003 = 4128637337928774747L ^ var1;
      this.releaseSneakSetting = var10001.getDataBuilder50_3("Allows BridgeAssist to release sneak even if you are physically holding the key.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      this.dataBuilder112_z = new Util133();
      this.dataBuilder112_A = new Util133();
   }

   public String buildString() {
      long var1 = 131264237245629L;
      return String.format(
         "%s - %s",
         (int)this.unsneakDelaySetting.getObject_m().double_d,
         (int)this.unsneakDelaySetting.getObject_m().double_c
      );
   }

   protected void toggle() {
      this.fieldBool_B = false;
      this.fieldBool_C = false;
      this.clamp_2();
   }

   protected void openScreen() {
      this.update();
   }

   @EventListener
   private void clamp(PreTickEventEvent var1) {
      long var2 = 69887726730785L;
      String var4 = ScaffoldUtils.getString_2();
      if (BreezeClient.isValid()) {
         this.fieldBool_B = false;
         this.fieldBool_C = false;
      } else if (BreezeClient.CONST_A.currentScreen != null) {
         this.fieldBool_B = false;
         MinecraftAccessor.initialize_24(BreezeClient.CONST_A.gameSettings.keyBindSneak, false);
      } else if (!BreezeContext.moduleBase_a.getModuleByClass(ScaffoldUtils.class).f()
         && !BreezeClient.CONST_A.thePlayer.capabilities.isFlying
         && !BreezeClient.CONST_A.gameSettings.keyBindForward.isKeyDown()) {
         boolean var5 = BreezeClient.CONST_A.thePlayer.onGround
            || BreezeClient.CONST_A.thePlayer.motionY < 0.0 && BreezeClient.CONST_A.thePlayer.motionY >= -0.08;
         if (!this.inAirSetting.getObject_m() && !var5) {
            this.update();
         } else if (!this.fieldBool_C && !this.checkCondition()) {
            this.update();
         } else {
            int var6 = var5 ? 2 : 3;
            if (this.fieldBool_B) {
               double var7 = Math.min(this.double_D + 0.05, 0.295);
               double[] var9 = this.calcDistance();
               boolean var10 = this.getHitbox(var7, var6, 0.0, 0.0)
                  && this.getHitbox(var7, var6, BreezeClient.CONST_A.thePlayer.motionX * 2.0, BreezeClient.CONST_A.thePlayer.motionZ * 2.0)
                  && this.getHitbox(var7, var6, var9[0] * 0.25, var9[1] * 0.25);
               if (!var10) {
                  this.dataBuilder112_A.getDataBuilder112();
               }

               label80: {
                  if (var10 && this.dataBuilder112_A.isValid(this.fieldLong_E)) {
                     this.processAll(false);
                     this.clamp_2();
                     if (var4 != null) {
                        break label80;
                     }
                  }

                  this.processAll(true);
               }

               if (var4 != null) {
                  return;
               }
            }

            boolean var11 = this.getHitbox(this.double_D, var6, 0.0, 0.0);
            boolean var12 = BreezeClient.CONST_A.gameSettings.keyBindBack.isKeyDown()
               || BreezeClient.CONST_A.gameSettings.keyBindLeft.isKeyDown()
               || BreezeClient.CONST_A.gameSettings.keyBindRight.isKeyDown();
            if (!var11 && (var12 || !this.dataBuilder112_z.isValid(-2392742198255602349L))) {
               this.fieldBool_C = true;
               this.dataBuilder112_A.getDataBuilder112();
               this.processAll(true);
               if (var4 != null) {
                  return;
               }
            }

            this.processAll(false);
            if (var11 && this.dataBuilder112_z.isValid(8767520871263645605L)) {
               this.fieldBool_C = false;
            }
         }
      } else {
         this.update();
      }
   }

   private boolean checkCondition() {
      long var1 = 55861580946187L;
      return BreezeClient.CONST_A.thePlayer.rotationPitch >= 55.0F && BreezeClient.CONST_A.objectMouseOver != null && this.getHeldItem();
   }

   private boolean getHeldItem() {
      long var1 = 133445154422101L;
      ItemStack var3 = BreezeClient.CONST_A.thePlayer.getHeldItem();
      if (var3 != null && var3.getItem() instanceof ItemBlock) {
         Block var4 = ((ItemBlock)var3.getItem()).getBlock();
         return var4.getMaterial().isSolid()
            && !(var4 instanceof BlockFalling)
            && !(var4 instanceof BlockFence)
            && !(var4 instanceof BlockWall)
            && !BlockUtil6.CONST_A.contains(var4);
      } else {
         return false;
      }
   }

   private boolean getHitbox(double var1, int var3, double var4, double var6) {
      long var8 = 67575996197829L;
      AxisAlignedBB var10 = BreezeClient.CONST_A.thePlayer.getEntityBoundingBox();
      double var11 = Math.min(var1, 0.295);
      double var13 = var10.minX + var11 + var4;
      String var10000 = ScaffoldUtils.getString_2();
      double var15 = var10.maxX - var11 + var4;
      double var17 = var10.minZ + var11 + var6;
      String var19 = var10000;
      double var20 = var10.maxZ - var11 + var6;
      int var22 = MathHelper.floor_double(var10.minY);
      int var23 = var10.minY - var22 > 1.0E-4 ? 0 : 1;
      int var24 = MathHelper.floor_double(var13);

      while (var24 <= MathHelper.floor_double(var15)) {
         int var25 = MathHelper.floor_double(var17);

         while (true) {
            if (var25 <= MathHelper.floor_double(var20)) {
               int var26 = var23;

               while (var26 <= var3) {
                  if (this.checkCondition_2(new BlockPos(var24, var22 - var26, var25))) {
                     return true;
                  }

                  var26++;
                  if (var19 == null) {
                     break;
                  }
               }

               var25++;
               if (var19 != null) {
                  continue;
               }
            }

            var24++;
            if (var19 == null) {
               return false;
            }
            break;
         }
      }

      return false;
   }

   private double[] calcDistance() {
      long var1 = 95704815497623L;
      float var3 = (BreezeClient.CONST_A.gameSettings.keyBindLeft.isKeyDown() ? 1.0F : 0.0F)
         - (BreezeClient.CONST_A.gameSettings.keyBindRight.isKeyDown() ? 1.0F : 0.0F);
      float var4 = BreezeClient.CONST_A.gameSettings.keyBindBack.isKeyDown() ? -1.0F : 0.0F;
      if (var3 == 0.0F && var4 == 0.0F) {
         return new double[]{0.0, 0.0};
      }

      double var5 = Math.toRadians(BreezeClient.CONST_A.thePlayer.rotationYaw);
      double var7 = Math.sin(var5);
      double var9 = Math.cos(var5);
      double var11 = var3 * var9 - var4 * var7;
      double var13 = var4 * var9 + var3 * var7;
      double var15 = Math.sqrt(var11 * var11 + var13 * var13);
      return new double[]{var11 / var15, var13 / var15};
   }

   private boolean checkCondition_2(BlockPos var1) {
      long var2 = 27060226299900L;
      Block var4 = BreezeClient.CONST_A.theWorld.getBlockState(var1).getBlock();
      return var4 != Blocks.air && !var4.isReplaceable(BreezeClient.CONST_A.theWorld, var1);
   }

   private void processAll(boolean var1) {
      long var2 = 64334483118062L;
      String var10000 = ScaffoldUtils.getString_2();
      this.fieldBool_B = var1;
      String var4 = var10000;
      if (var1) {
         this.dataBuilder112_z.getDataBuilder112();
         MinecraftAccessor.initialize_24(BreezeClient.CONST_A.gameSettings.keyBindSneak, true);
         if (var4 != null) {
            return;
         }
      }

      MinecraftAccessor.initialize_24(
         BreezeClient.CONST_A.gameSettings.keyBindSneak,
         !this.releaseSneakSetting.getObject_m() && PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindSneak)
      );
   }

   private void clamp_2() {
      this.double_D = Math.min(Math.max(0.3 - this.edgeOffsetSetting.getObject_m().calculateDouble_2(), 0.0), 0.295);
      this.fieldLong_E = (long)this.unsneakDelaySetting.getObject_m().calculateDouble_2();
   }

   private void update() {
      long var1 = 74264961841762L;
      this.fieldBool_B = false;
      this.fieldBool_C = false;
      if (!BreezeClient.isValid()) {
         MinecraftAccessor.initialize_24(BreezeClient.CONST_A.gameSettings.keyBindSneak, PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindSneak));
      }
   }

   public boolean checkCondition_3() {
      long var1 = 119447570011596L;
      return !this.dataBuilder112_z.isValid(7468472247475514770L) && this.f();
   }

   static {
      long var0 = 7849251381468L;
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
      String var6 = "3¤CàÒ\u008dæ\u0001\u008dÿéPÓW¼ô M\u0013\f½ï\u001fíWîQÄ¹í\u0003$yÄÁ¢)bçý\u001bÔ\tÓÆå\u0095ü_ Å\u001füÛãÓ\f³\u000fá\u0010O?x²0H\u0002\u008a(ø°\u009cäjI\u0097í\u0081µ£\u0000\u0010\u008d78\u000e¢`0µì«T¦Ðq3µxmþG\t¼Ü¹lÒpP¥â?ª6b\u000eeMn* GÊ~71ÞÔ¾sÐ±°\u008bÈÛ/#®4-ÀÇÈyÕy¢§\u008bb¥\u009aa\u009fÂ&Ú6·^ô\u0093¢\u00ad\u0093TOk¨\tÃ\u0082©\u0099Qâê\u0094ÝvF\u0099È)´\u007f\u0001F¡K4ôº^\u00806B&ïÉ(\u0004P¤\u008f{O\u001a{|²\u009f\u009c\u009c''\u0012hÐÝ®\u0099Öü)\u0095ðzj?ÈK\u008bÎ\u0003\u009b(W}\u009b\u0088òCâ?\u0090$WË%\u001f¦\u0013Å2Ì\u009bX`µë¨\u0091*ßÉ[\u008dâo\u001fE\u0083îéy\u0091s\\\u000e=sGØUi\u0000«ô\u0004±\u0013\u0018þüì\u0090*KÛ\u0099\u0087v\u0017´ë1\u009fÌÉAì\u009d\u001d\u0087if\u001ak>±½\u0018\u0012\u001f&\u009ezï·\u0004d\u0016àSÔ 5\u0081ú\u0089^ÏÀ\u0000\u009f¿";
      int var7 = "3¤CàÒ\u008dæ\u0001\u008dÿéPÓW¼ô M\u0013\f½ï\u001fíWîQÄ¹í\u0003$yÄÁ¢)bçý\u001bÔ\tÓÆå\u0095ü_ Å\u001füÛãÓ\f³\u000fá\u0010O?x²0H\u0002\u008a(ø°\u009cäjI\u0097í\u0081µ£\u0000\u0010\u008d78\u000e¢`0µì«T¦Ðq3µxmþG\t¼Ü¹lÒpP¥â?ª6b\u000eeMn* GÊ~71ÞÔ¾sÐ±°\u008bÈÛ/#®4-ÀÇÈyÕy¢§\u008bb¥\u009aa\u009fÂ&Ú6·^ô\u0093¢\u00ad\u0093TOk¨\tÃ\u0082©\u0099Qâê\u0094ÝvF\u0099È)´\u007f\u0001F¡K4ôº^\u00806B&ïÉ(\u0004P¤\u008f{O\u001a{|²\u009f\u009c\u009c''\u0012hÐÝ®\u0099Öü)\u0095ðzj?ÈK\u008bÎ\u0003\u009b(W}\u009b\u0088òCâ?\u0090$WË%\u001f¦\u0013Å2Ì\u009bX`µë¨\u0091*ßÉ[\u008dâo\u001fE\u0083îéy\u0091s\\\u000e=sGØUi\u0000«ô\u0004±\u0013\u0018þüì\u0090*KÛ\u0099\u0087v\u0017´ë1\u009fÌÉAì\u009d\u001d\u0087if\u001ak>±½\u0018\u0012\u001f&\u009ezï·\u0004d\u0016àSÔ 5\u0081ú\u0089^ÏÀ\u0000\u009f¿"
         .length();
      char var8 = 16;
      int var34 = -1;

      label73:
      while (true) {
         String var36 = var6.substring(++var34, var34 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var50;
                  if ((var34 += var8) >= var7) {
                     CONST_G = var4;
                     CONST_H = new String[9];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[2];
                     int var14 = 0;
                     String var15 = "\u0015[úýÞ©²Ô/\u0013U&. u¶";
                     int var16 = "\u0015[úýÞ©²Ô/\u0013U&. u¶".length();
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
                        byte var58 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_T = (int)var13[0];
                     CONST_S = (int)var13[1];
                     CONST_L = new HashMap(13);
                     Cipher var22;
                     var10000 = var22 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var23 = 1; var23 < 8; var23++) {
                        var10003[var23] = (byte)(var0 << var23 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var24 = new long[4];
                     int var25 = 0;
                     String var26 = "S\u008e¦Ðw\u0002\u00011é\u00116æ\u00891H+";
                     int var27 = "S\u008e¦Ðw\u0002\u00011é\u00116æ\u00891H+".length();
                     byte var28 = 0;

                     label44:
                     while (true) {
                        int var46 = var28;
                        var28 += 8;
                        byte[] var29 = var26.substring(var46, var28).getBytes("ISO-8859-1");
                        long[] var40 = var24;
                        var46 = var25++;
                        long var55 = (var29[0] & 255L) << 56
                           | (var29[1] & 255L) << 48
                           | (var29[2] & 255L) << 40
                           | (var29[3] & 255L) << 32
                           | (var29[4] & 255L) << 24
                           | (var29[5] & 255L) << 16
                           | (var29[6] & 255L) << 8
                           | var29[7] & 255L;
                        byte var60 = -1;

                        while (true) {
                           long var30 = var55;
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
                           long var63 = (var32[0] & 255L) << 56
                              | (var32[1] & 255L) << 48
                              | (var32[2] & 255L) << 40
                              | (var32[3] & 255L) << 32
                              | (var32[4] & 255L) << 24
                              | (var32[5] & 255L) << 16
                              | (var32[6] & 255L) << 8
                              | var32[7] & 255L;
                           switch (var60) {
                              case 0:
                                 var40[var46] = var63;
                                 if (var28 >= var27) {
                                    CONST_J = var24;
                                    CONST_K = new Long[4];
                                    600L = ((String)null);
                                    return;
                                 }
                                 break;
                              default:
                                 var40[var46] = var63;
                                 if (var28 < var27) {
                                    continue label44;
                                 }

                                 var26 = ")·\u0087Ëâ\u001bÐ\u009c0\u000f¤T]úäý";
                                 var27 = ")·\u0087Ëâ\u001bÐ\u009c0\u000f¤T]úäý".length();
                                 var28 = 0;
                           }

                           byte var48 = var28;
                           var28 += 8;
                           var29 = var26.substring(var48, var28).getBytes("ISO-8859-1");
                           var40 = var24;
                           var46 = var25++;
                           var55 = (var29[0] & 255L) << 56
                              | (var29[1] & 255L) << 48
                              | (var29[2] & 255L) << 40
                              | (var29[3] & 255L) << 32
                              | (var29[4] & 255L) << 24
                              | (var29[5] & 255L) << 16
                              | (var29[6] & 255L) << 8
                              | var29[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var34);
                  break;
               default:
                  var4[var5++] = var50;
                  if ((var34 += var8) < var7) {
                     var8 = var6.charAt(var34);
                     continue label73;
                  }

                  var6 = "\u001aÍ\u001dYsGì\u0082 6\u0010f,Ü%\u0089s0\n\u008a¦£\u0001\u0099DRB\u0016®R2\u0088w\u000b\u001câZj^Ýo\u0015\u0018!3«\u00040ÔØMø×Ón1rÄDo\t\u000fù\u001d´0À\u0094\u009f¡WU7#\u0083¤C_t\u0099ñcØ]à\u001eÿ3\u000b Hà\bv\u001fi\u0001+§ð¨k¬õ\u001b<\u009a]¥øè\u00adúâ&®º·wpT\u0001\r\u0090Õ\u0012üC\u0013Ç,¼|B¸/.ìü\u001e\u0004oG\u0010\u0082Ü\u0090b\u008f\u0015\u008b\u009b\u0088ûfÑ£\tô8\u0081\u001fXÒ~ææãL\u0085&\u0084[Á/âïÈ~\u0007m`_O¯\u0010ýSkÒ\u0013ÜÞ±ÃÅ\u009aÉ ?ÞS¦\u00894\u0003\u009eÓt\u0084½gè\u009bYÂ\u008cqó\u0094&»?RT\u009cõäJ\u0003sd\t>cVõ\u0002E&@¨¦î®*\u000f®À4T9\u000e´´\u001b\u000f\u001d@)Il[\u001efH»A7ùp\u000eíû%+b$\bÙÝ} ñ\u0099\u009d[³Ö";
                  var7 = "\u001aÍ\u001dYsGì\u0082 6\u0010f,Ü%\u0089s0\n\u008a¦£\u0001\u0099DRB\u0016®R2\u0088w\u000b\u001câZj^Ýo\u0015\u0018!3«\u00040ÔØMø×Ón1rÄDo\t\u000fù\u001d´0À\u0094\u009f¡WU7#\u0083¤C_t\u0099ñcØ]à\u001eÿ3\u000b Hà\bv\u001fi\u0001+§ð¨k¬õ\u001b<\u009a]¥øè\u00adúâ&®º·wpT\u0001\r\u0090Õ\u0012üC\u0013Ç,¼|B¸/.ìü\u001e\u0004oG\u0010\u0082Ü\u0090b\u008f\u0015\u008b\u009b\u0088ûfÑ£\tô8\u0081\u001fXÒ~ææãL\u0085&\u0084[Á/âïÈ~\u0007m`_O¯\u0010ýSkÒ\u0013ÜÞ±ÃÅ\u009aÉ ?ÞS¦\u00894\u0003\u009eÓt\u0084½gè\u009bYÂ\u008cqó\u0094&»?RT\u009cõäJ\u0003sd\t>cVõ\u0002E&@¨¦î®*\u000f®À4T9\u000e´´\u001b\u000f\u001d@)Il[\u001efH»A7ùp\u000eíû%+b$\bÙÝ} ñ\u0099\u009d[³Ö"
                     .length();
                  var8 = 152;
                  var34 = -1;
            }

            var36 = var6.substring(++var34, var34 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16882;
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
            throw new RuntimeException("rip/breeze/client/dS", var10);
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
         throw new RuntimeException("rip/breeze/client/dS" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23993;
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
            throw new RuntimeException("rip/breeze/client/dS", var16);
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
         throw new RuntimeException("rip/breeze/client/dS" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
