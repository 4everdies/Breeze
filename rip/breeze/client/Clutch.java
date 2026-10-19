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
import net.minecraft.item.ItemSword;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(a = "Clutch", b = "Automatically block clutches for you to prevent falling off.", d = rip.breeze.ModuleCategory.MOVEMENT)
public class Clutch extends BreezeModule implements IBreezeInterface2 {
   private final GenericSetting<Double> rotationSpeedSetting;
   private final GenericSetting<Boolean> legitWalkSetting;
   private final GenericSetting<Boolean> placeBehindSetting;
   private final Util133 dataBuilder112_q;
   private RangeValue dataBuilder39_r;
   private BlockPos blockPos_s;
   private BlockPos blockPos_t;
   private int fieldInt_u;
   private static final String[] CONST_W;
   private static final String[] CONST_X;
   private static final Map CONST_Y = new HashMap(13);
   private static final long[] CONST_Z;
   private static final Long[] CONST_A;
   private static final Map CONST_B;

   public Clutch() {
      long var1 = 17238244894036L;
      super();
      short var10002 = 9664;
      long var10003 = 1499561579257786785L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "RotationSpeed");
      var10002 = 25877;
      var10003 = 4715960611080515954L ^ var1;
      this.rotationSpeedSetting = var10001.getDataBuilder50_3("How fast to rotate towards your target rotation.")
         .getDataBuilder50_4(6.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_3(2.0, 10.0, 0.1))
         .getDataBuilder54();
      var10002 = 4975;
      var10003 = 2509747683124070155L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "LegitWalk");
      var10002 = 27904;
      var10003 = 2836326773719873893L ^ var1;
      this.legitWalkSetting = var10001.getDataBuilder50_3("Fixes movement to your server side rotation, needed for most anti-cheats.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      var10002 = 23860;
      var10003 = 2019930051745483090L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "PlaceBehind");
      var10002 = 5161;
      var10003 = 8213124630812246089L ^ var1;
      this.placeBehindSetting = var10001.getDataBuilder50_3("Allows clutch to place blocks out of your field of view.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      this.dataBuilder112_q = new Util133();
   }

   public void update() {
      BreezeClient.getModuleRegistry().applyRotation(this);
   }

   public void update_1() {
      BreezeClient.getModuleRegistry().initialize(this);
   }

   public int getValue() {
      return 25;
   }

   public void updateRotation(ModuleRegistry var1) {
      long var2 = 117735033473270L;
      String var4 = ScaffoldUtils.getString_2();
      if (!BreezeContext.moduleBase_a.getModuleByClass(BridgeAssist.class).checkCondition_3()) {
         if (!BreezeClient.CONST_A.thePlayer.capabilities.isFlying
            && !BreezeClient.CONST_A.thePlayer.isInWater()
            && !BreezeClient.CONST_A.thePlayer.isInLava()
            && !(BreezeClient.CONST_A.thePlayer.motionY < -2.0)
            && !BreezeClient.CONST_A.thePlayer.onGround
            && !BreezeContext.moduleBase_a.getModuleByClass(BridgeAssist.class).checkCondition_3()) {
            RangeValue[] var5 = BlockUtil10.getHitbox(BreezeClient.CONST_A.thePlayer, 20, 0.5);
            boolean var6 = false;
            int var7 = 1;

            while (var7 < var5.length) {
               RangeValue var8 = var5[var7];
               if (var6) {
                  if (this.blockPos_s == null) {
                     this.fieldInt_u = BreezeClient.CONST_A.thePlayer.inventory.currentItem;
                     if (var4 != null) {
                        return;
                     }
                  }

                  if (this.dataBuilder112_q.isValid(-4079645163431731141L)) {
                     BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_u;
                     this.blockPos_s = null;
                  }

                  return;
               }

               var6 = var8.isBool_f();
               var7++;
               if (var4 == null) {
                  break;
               }
            }

            if (!this.absValue(var5)) {
               if (this.blockPos_s == null) {
                  this.fieldInt_u = BreezeClient.CONST_A.thePlayer.inventory.currentItem;
                  if (var4 != null) {
                     return;
                  }
               }

               if (this.dataBuilder112_q.isValid(984658864499918376L)) {
                  BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_u;
                  this.blockPos_s = null;
               }
            } else {
               label104: {
                  var7 = BreezeClient.getThemeManager().getValue_2();
                  if (var7 != -1 && BreezeClient.CONST_A.thePlayer.inventory.currentItem != var7) {
                     BreezeClient.CONST_A.thePlayer.inventory.currentItem = var7;
                     this.dataBuilder112_q.getDataBuilder112();
                     if (var4 != null) {
                        break label104;
                     }
                  }

                  if (var7 == -1 && this.dataBuilder112_q.isValid(984658864499918376L)) {
                     BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_u;
                     this.blockPos_s = null;
                     return;
                  }
               }

               int var20 = this.blockPos_t.getX() - this.blockPos_s.getX();
               int var9 = this.blockPos_t.getZ() - this.blockPos_s.getZ();
               Vec3i var10 = new Vec3i(
                  Math.abs(var20) >= Math.abs(var9) ? -Math.signum(var20) : 0.0F, 0.0, Math.abs(var9) > Math.abs(var20) ? -Math.signum(var9) : 0.0F
               );
               net.minecraft.util.EnumFacing var11 = null;

               for (net.minecraft.util.EnumFacing var15 : net.minecraft.util.EnumFacing.values()) {
                  if (var15.getDirectionVec().equals(var10)) {
                     var11 = var15;
                     break;
                  }
               }

               Vec3 var21 = new Vec3(0.5 * var10.getX(), 0.5 * var10.getY(), 0.5 * var10.getZ());
               Vec3 var22 = new Vec3(this.blockPos_t).addVector(0.5, 0.5, 0.5).add(var21);
               float[] var23 = RotationUtil7.calcDistance(var22, BreezeClient.CONST_A.thePlayer.getPositionEyes(1.0F), true);
               if (var23[0] - var1.getFloat_g() < 45.0F) {
                  var23 = RotationUtil7.getAnglesTo(var22, BreezeClient.CONST_A.thePlayer);
               }

               var1.isActive_2(this.legitWalkSetting.getObject_m()).isActive(false).isValid(var23, this.calculateFloat());
               if (BreezeClient.CONST_A.thePlayer.inventory.getCurrentItem() == null
                  || !(BreezeClient.CONST_A.thePlayer.inventory.getCurrentItem().getItem() instanceof ItemSword)) {
                  Vec3 var24 = BreezeClient.CONST_A.thePlayer.getPositionEyes(1.0F);
                  Vec3 var16 = MinecraftAccessor.getVec3(BreezeClient.CONST_A.thePlayer, var1.getFloat(), var1.getFloat_g());
                  Vec3 var17 = var24.addVector(var16.xCoord * 4.5, var16.yCoord * 4.5, var16.zCoord * 4.5);
                  MovingObjectPosition var18 = BreezeClient.CONST_A.theWorld.rayTraceBlocks(var24, var17);
                  if (var18 != null
                     && var18.getBlockPos().equals(this.blockPos_t)
                     && var18.sideHit.equals(var11)
                     && BreezeClient.CONST_A
                        .playerController
                        .onPlayerRightClick(
                           BreezeClient.CONST_A.thePlayer,
                           BreezeClient.CONST_A.theWorld,
                           BreezeClient.CONST_A.thePlayer.getHeldItem(),
                           this.blockPos_t,
                           var11,
                           var22
                        )) {
                     BreezeClient.CONST_A.thePlayer.swingItem();
                  }
               }
            }
         } else {
            if (this.blockPos_s == null) {
               this.fieldInt_u = BreezeClient.CONST_A.thePlayer.inventory.currentItem;
               if (var4 != null) {
                  return;
               }
            }

            if (this.dataBuilder112_q.isValid(7810573163062483596L)) {
               BreezeClient.CONST_A.thePlayer.inventory.currentItem = this.fieldInt_u;
               this.blockPos_s = null;
            }
         }
      }
   }

   private boolean absValue(RangeValue[] var1) {
      long var2 = 134034019960795L;
      BlockPos var4 = null;
      BlockPos var5 = null;
      RangeValue var6 = null;
      double var7 = 0.0;
      String var10000 = ScaffoldUtils.getString_2();
      boolean var9 = false;
      String var10 = var10000;
      if (!(Math.abs(BreezeClient.CONST_A.thePlayer.motionX) < 0.1) || !(Math.abs(BreezeClient.CONST_A.thePlayer.motionZ) < 0.1)) {
         float var11 = (float)Math.atan2(BreezeClient.CONST_A.thePlayer.motionX, BreezeClient.CONST_A.thePlayer.motionZ) * -57.2958F;
         var9 = Math.abs(var11 - RotationUtil7.calculateFloat(BreezeClient.CONST_A.thePlayer.rotationYaw)) < 45.0F;
      }

      int var24 = 0;

      label73:
      while (var24 < var1.length) {
         RangeValue var12 = var1[var24];
         if (var12.getDouble_b() < -2.0 && var10 != null) {
            break;
         }

         BlockPos var13 = new BlockPos(var12.calculateDouble(), var12.getDouble() - 1.25, var12.calculateDouble_2());
         int var14 = -3;

         while (true) {
            if (var14 <= 3) {
               int var15 = -3;

               while (var15 <= 3) {
                  BlockPos var16 = var13.add(var14, 0, var15);
                  if (this.checkCondition(var16)) {
                     double var17 = var13.distanceSq(var16);
                     double var19 = Math.abs(
                        Math.abs(
                              RotationUtil7.calcDistance(
                                 new Vec3(var16.getX() + 0.5, var16.getY() + 0.5, var16.getZ() + 0.5),
                                 BreezeClient.CONST_A.thePlayer.getPositionEyes(1.0F),
                                 false
                              )[0]
                           )
                           - Math.abs(BreezeClient.CONST_A.thePlayer.rotationYaw)
                     );
                     label62:
                     if (RenderUtil31.getHitbox_3(var16) && (!(var19 > 100.0) || var10 == null)) {
                        double var21 = var17 * Math.sqrt(Math.abs(var12.getDouble_b()));
                        if (var4 == null) {
                           var4 = var16;
                           var5 = var13;
                           var7 = var21;
                           var6 = var12;
                           if (var10 != null) {
                              break label62;
                           }
                        }

                        if (var21 < var7) {
                           var4 = var16;
                           var5 = var13;
                           var7 = var21;
                           var6 = var12;
                        }
                     }
                  }

                  var15++;
                  if (var10 == null) {
                     break;
                  }
               }

               var14++;
               if (var10 != null) {
                  continue;
               }
            }

            var24++;
            if (var10 == null) {
               break label73;
            }
            break;
         }
      }

      if (var4 != null) {
         if (var5.equals(var4)) {
            return false;
         }

         this.blockPos_s = var5;
         this.blockPos_t = var4;
         this.dataBuilder39_r = var6;
         return true;
      } else {
         return false;
      }
   }

   private boolean checkCondition(BlockPos var1) {
      long var2 = 61446105344183L;
      return !BreezeClient.CONST_A.theWorld.getBlockState(var1).getBlock().getMaterial().isReplaceable();
   }

   private float calculateFloat() {
      return (float)(Math.pow(this.rotationSpeedSetting.getObject_m() / 10.0, 1.5) * 180.0);
   }

   static {
      long var0 = 124102529349811L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[6];
      int var5 = 0;
      String var6 = "Ã\u001f\u009e{Ò¡Í!â\u0099@ô¿ÙlÂ\u0080\u00adF\u0091Á\rI¼\fXÀGºÈ¥!Í\\ÎM*2\u0002§\u008a\u0084\u009fÀâ4£\bMÖ\u000f\u0091ï]oÖÌ\u00136¢Sbÿ\u0083m@÷aQp Y\u008eÉ¥\u00025÷f\u009bñvëcë?þüý¾IR]â\u0010\u008dý\u0016}\u000f\u0006¥\u0081Âp¶Ù&æàUwu«\u0016\u009eß\\Ì¶\u0082)æªJoî\u0017 #©ÈF³¬3\u0007<\rlÑ\u0013å\u0018¼¤©x\u0018#\u008fß{¹!ª3\u0010\u0085²*X\u0005\u0097\u009b\u0086³T\u007fbÏ?B.]4w\u0080&²Õò\u0011\u0098â?lÒ\u00adÛ[T0ò\u009eÑÚ¸\u0014P\u0091òê\u000e=\u0091Û¶À»\"\u0007¢û±ù³!ÑÑ5Cz»\u0084 kñCÕ@¡\u0013\u0002ô7ºV\u0015Jèýmr\u001ai\u0085ï\u008bt +ÿ{Íh×,\u0005?ÊÏ\u0017ÀGÒLì¤©\b\u000b@:ö:¬ó\u0010ZW\u009c\u0085";
      int var7 = "Ã\u001f\u009e{Ò¡Í!â\u0099@ô¿ÙlÂ\u0080\u00adF\u0091Á\rI¼\fXÀGºÈ¥!Í\\ÎM*2\u0002§\u008a\u0084\u009fÀâ4£\bMÖ\u000f\u0091ï]oÖÌ\u00136¢Sbÿ\u0083m@÷aQp Y\u008eÉ¥\u00025÷f\u009bñvëcë?þüý¾IR]â\u0010\u008dý\u0016}\u000f\u0006¥\u0081Âp¶Ù&æàUwu«\u0016\u009eß\\Ì¶\u0082)æªJoî\u0017 #©ÈF³¬3\u0007<\rlÑ\u0013å\u0018¼¤©x\u0018#\u008fß{¹!ª3\u0010\u0085²*X\u0005\u0097\u009b\u0086³T\u007fbÏ?B.]4w\u0080&²Õò\u0011\u0098â?lÒ\u00adÛ[T0ò\u009eÑÚ¸\u0014P\u0091òê\u000e=\u0091Û¶À»\"\u0007¢û±ù³!ÑÑ5Cz»\u0084 kñCÕ@¡\u0013\u0002ô7ºV\u0015Jèýmr\u001ai\u0085ï\u008bt +ÿ{Íh×,\u0005?ÊÏ\u0017ÀGÒLì¤©\b\u000b@:ö:¬ó\u0010ZW\u009c\u0085"
         .length();
      char var8 = 128;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var33;
                  if ((var23 += var8) >= var7) {
                     CONST_W = var4;
                     CONST_X = new String[6];
                     CONST_B = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[3];
                     int var14 = 0;
                     String var15 = "\u0099Eå~y«!Àêb¿\u0014ù\u0080]´\u000fCHaÒ\u0012£2";
                     int var16 = "\u0099Eå~y«!Àêb¿\u0014ù\u0080]´\u000fCHaÒ\u0012£2".length();
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
                        byte var38 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_Z = var13;
                     CONST_A = new Long[3];
                     return;
                  }

                  var8 = var6.charAt(var23);
                  break;
               default:
                  var4[var5++] = var33;
                  if ((var23 += var8) < var7) {
                     var8 = var6.charAt(var23);
                     continue label45;
                  }

                  var6 = "ö\u0087\u0094\u0097¬¢\u000fz½óhò4\u007f\u0013#\u007fd º\u00142ü'\u0093@\u009bÓ¹Nô¹`\u00ad\u0016M\u008a»N5?¿Û1\u0085çö¾\u0015¼Xp·f³8\u008aÙ|`N¯Ñ\u008bÿ\u0013\u000fX¿\f\u009c(pI\\4@=æ\u008do_6\u0096ïCËâU/nÍYfÖ\u001fãmX«BØ$£îG\u008e¯¹n4{\u001ca\u007f>¨ÿÜ:jB\u0092\u009e%;ÃÝh";
                  var7 = "ö\u0087\u0094\u0097¬¢\u000fz½óhò4\u007f\u0013#\u007fd º\u00142ü'\u0093@\u009bÓ¹Nô¹`\u00ad\u0016M\u008a»N5?¿Û1\u0085çö¾\u0015¼Xp·f³8\u008aÙ|`N¯Ñ\u008bÿ\u0013\u000fX¿\f\u009c(pI\\4@=æ\u008do_6\u0096ïCËâU/nÍYfÖ\u001fãmX«BØ$£îG\u008e¯¹n4{\u001ca\u007f>¨ÿÜ:jB\u0092\u009e%;ÃÝh"
                     .length();
                  var8 = ' ';
                  var23 = -1;
            }

            var24 = var6.substring(++var23, var23 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28977;
      if (CONST_X[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Y.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Y.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dT", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_W[var3].getBytes("ISO-8859-1");
         CONST_X[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_X[var3];
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
         throw new RuntimeException("rip/breeze/client/dT" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3505;
      if (CONST_A[var3] == null) {
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
         long var5 = CONST_Z[var3];
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
         Object[] var9 = (Object[])CONST_B.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_B.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/dT", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_A[var3] = var14;
      }

      return CONST_A[var3];
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
         throw new RuntimeException("rip/breeze/client/dT" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
