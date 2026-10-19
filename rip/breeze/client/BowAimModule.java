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
import net.minecraft.item.ItemBow;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "BowAim", b = "Automatically aims your bow at enemies for you.", d = rip.breeze.ModuleCategory.COMBAT, c = {"aim", "bow", "auto", "bot"})
public class BowAimModule extends BreezeModule {
   private final GenericSetting<RotationUtil2_x> modeSetting;
   private final GenericSetting<PriorityMode2> prioritySetting;
   private final GenericSetting<Integer> rangeSetting;
   private final GenericSetting<Integer> fOVSetting;
   private final GenericSetting<Double> yawSpeedSetting;
   private final GenericSetting<Double> predictionSetting;
   private final GenericSetting<Integer> dataBuilder54_t;
   private long fieldLong_u;
   private static final String[] CONST_W;
   private static final String[] CONST_X;
   private static final Map CONST_Y = new HashMap(13);

   public BowAimModule() {
      long var1 = 17776100023778L;
      super();
      short var10002 = 7046;
      long var10003 = 7346893191614777433L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Mode");
      var10002 = 17522;
      var10003 = 1923999517664909228L ^ var1;
      this.modeSetting = var10001.getDataBuilder50_3("Which rotations to adjust (yaw is side-to-side and pitch up-to-down).")
         .getDataBuilder50_4(RotationUtil2_x.BOTH)
         .getDataBuilder54();
      var10002 = 11348;
      var10003 = 1514546359940808580L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Priority");
      var10002 = 19027;
      var10003 = 9123645508407204238L ^ var1;
      this.prioritySetting = var10001.getDataBuilder50_3("The targeting priority.").getDataBuilder50_4(PriorityMode2.DISTANCE).getDataBuilder54();
      var10002 = 13033;
      var10003 = 4049028523173273906L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Range");
      var10002 = 3849;
      var10003 = 3180209887483682014L ^ var1;
      this.rangeSetting = var10001.getDataBuilder50_3("Maximum distance to target players, in blocks.")
         .getDataBuilder50_4(50)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(1, 200))
         .getDataBuilder54();
      var10002 = 3042;
      var10003 = 743296982947321914L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "FOV");
      var10002 = 641;
      var10003 = 3698014802585243984L ^ var1;
      this.fOVSetting = var10001.getDataBuilder50_3("The field of view to search for targets in (from your crosshair), in degrees.")
         .getDataBuilder50_4(50)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 360))
         .getDataBuilder54();
      var10002 = 17591;
      var10003 = 3882927323279333220L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "YawSpeed");
      var10002 = 9918;
      var10003 = 7856691406617343335L ^ var1;
      this.yawSpeedSetting = var10001.getDataBuilder50_3("How quickly to rotate your yaw (side-to-side).")
         .getDataBuilder50_4(3.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(1.0, 10.0))
         .getDataBuilder50_9(this::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 27306;
      var10003 = 5154709236400994680L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "How quickly to rotate your pitch (up-to-down).");
      var10002 = 9241;
      var10003 = 5443183189428795343L ^ var1;
      this.predictionSetting = var10001.getDataBuilder50_3("Prediction")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(1.0, 10.0))
         .getDataBuilder50_9(this::lambda$new_Inner1)
         .getDataBuilder54();
      this.dataBuilder54_t = GenericSetting.<Integer>getDataBuilder50(this, "Prediction")
         .getDataBuilder50_3("How far ahead to predict movement, in milliseconds.")
         .getDataBuilder50_4(200)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 500))
         .getDataBuilder54();
      this.fieldLong_u = System.currentTimeMillis();
   }

   @EventListener
   public void updateRotation(Render3DEventEvent var1) {
      long var2 = 131098394141424L;
      long var4 = System.currentTimeMillis() - this.fieldLong_u;
      int[] var10000 = AimAssist.getStateArray();
      this.fieldLong_u = System.currentTimeMillis();
      int[] var6 = var10000;
      if (BreezeClient.CONST_A.thePlayer.getHeldItem() != null
         && BreezeClient.CONST_A.currentScreen == null
         && BreezeClient.CONST_A.thePlayer.getHeldItem().getItem() instanceof ItemBow
         && PacketUtil14.isValid(BreezeClient.CONST_A.gameSettings.keyBindUseItem)) {
         EntityPlayer var7 = this.getDistance_2();
         if (var7 != null) {
            BreezeClient.getThemeManager().processAll(var7, this.rangeSetting.getObject_m().intValue());
            float[] var8 = this.getDistance(new TargetUtil(var7));
            if (var8 != null) {
               double var9 = var4 * 0.01 * this.yawSpeedSetting.getObject_m();
               double var11 = var4 * 0.01 * this.predictionSetting.getObject_m();
               if (!this.modeSetting.isValid(RotationUtil2_x.PITCH)) {
                  float var13;
                  label37: {
                     var13 = BreezeClient.CONST_A.thePlayer.rotationYaw;
                     if (BreezeClient.CONST_A.thePlayer.rotationYaw < var8[0]) {
                        BreezeClient.CONST_A.thePlayer.rotationYaw = (float)Math.min(BreezeClient.CONST_A.thePlayer.rotationYaw + var9, var8[0]);
                        if (var6 != null) {
                           break label37;
                        }
                     }

                     if (BreezeClient.CONST_A.thePlayer.rotationYaw > var8[0]) {
                        BreezeClient.CONST_A.thePlayer.rotationYaw = (float)Math.max(BreezeClient.CONST_A.thePlayer.rotationYaw - var9, var8[0]);
                     }
                  }

                  BreezeClient.CONST_A.thePlayer.prevRotationYaw = BreezeClient.CONST_A.thePlayer.prevRotationYaw
                     + (BreezeClient.CONST_A.thePlayer.rotationYaw - var13);
               }

               if (!this.modeSetting.isValid(RotationUtil2_x.YAW)) {
                  float var14;
                  label30: {
                     var14 = BreezeClient.CONST_A.thePlayer.rotationPitch;
                     if (BreezeClient.CONST_A.thePlayer.rotationPitch > var8[1]) {
                        BreezeClient.CONST_A.thePlayer.rotationPitch = (float)Math.max(BreezeClient.CONST_A.thePlayer.rotationPitch - var11, var8[1]);
                        if (var6 != null) {
                           break label30;
                        }
                     }

                     BreezeClient.CONST_A.thePlayer.rotationPitch = (float)Math.min(BreezeClient.CONST_A.thePlayer.rotationPitch + var11, var8[1]);
                  }

                  BreezeClient.CONST_A.thePlayer.prevRotationPitch = BreezeClient.CONST_A.thePlayer.prevRotationPitch
                     + (BreezeClient.CONST_A.thePlayer.rotationPitch - var14);
               }
            }
         }
      }
   }

   public float[] getDistance(TargetUtil var1) {
      long var2 = 66019649526621L;
      float var4 = 1.0F;
      double var5 = Math.log(0.99);
      int[] var10000 = AimAssist.getStateArray();
      float var7 = 3.0F;
      float var8 = 0.01F;
      float var9 = this.dataBuilder54_t.getObject_m().intValue() / 50.0F;
      int[] var10 = var10000;

      while (var9 < var1.list_a.size()) {
         Vec3 var11 = var1.list_a.get(BlockUtil7.clamp_2(Math.round(var9), 0, var1.list_a.size() - 1));
         double var12 = BreezeClient.CONST_A.thePlayer.getDistance(var11.xCoord, BreezeClient.CONST_A.thePlayer.posY, var11.zCoord);
         double var14 = Math.pow(0.99, var4) - 1.0;
         float[] var16 = RotationUtil7.getAnglesTo(var11, BreezeClient.CONST_A.thePlayer);
         float var17 = var16[0];
         double var18 = BreezeClient.CONST_A.thePlayer.posY + BreezeClient.CONST_A.thePlayer.getEyeHeight() - 0.1F;
         float var20 = (float)Math.toDegrees(Math.asin((5.0 - (var11.yCoord - var18 + 5.0F * var4) * (var5 / var14)) / var7));
         if (Float.isInfinite(var20) || Float.isNaN(var20)) {
            var20 = var16[1];
         }

         double var21 = -Math.sin(Math.toRadians(var17)) * Math.cos(Math.toRadians(var20)) * var7;
         double var23 = Math.cos(Math.toRadians(var17)) * Math.cos(Math.toRadians(var20)) * var7;
         double var25 = -(Math.cos(Math.toDegrees(var17)) * 0.16F);
         double var27 = -(Math.sin(Math.toDegrees(var17)) * 0.16F);
         double var29 = var25 + var21 * (var14 / var5);
         double var31 = var27 + var23 * (var14 / var5);
         double var33 = Math.sqrt(var29 * var29 + var31 * var31);
         var4 += var8;
         if (var12 < var33) {
            if (!this.rayTrace(
               BlockUtil7.clamp_2(Math.round(var9), 0, var1.list_a.size()),
               new Vec3(
                  BreezeClient.CONST_A.thePlayer.posX + var25,
                  BreezeClient.CONST_A.thePlayer.posY + BreezeClient.CONST_A.thePlayer.getEyeHeight() - 0.1F,
                  BreezeClient.CONST_A.thePlayer.posZ + var27
               ),
               var21,
               var7 * -Math.sin(Math.toRadians(var20)),
               var23,
               var12
            )) {
               return null;
            }

            return new float[]{var17, var20};
         }

         var9 += var8;
         if (var10 == null) {
            break;
         }
      }

      return null;
   }

   private boolean rayTrace(int var1, Vec3 var2, double var3, double var5, double var7, double var9) {
      long var11 = 19973544631206L;
      int[] var10000 = AimAssist.getStateArray();
      Vec3 var13 = var2.addVector(var3, var5, var7);
      int[] var14 = var10000;
      Vec3 var15 = var2;
      int var16 = 0;

      while (var16 <= var1) {
         MovingObjectPosition var17 = BreezeClient.CONST_A.theWorld.rayTraceBlocks(var15, var13);
         if (var17 != null) {
            double var18 = var13.xCoord - var2.xCoord;
            double var20 = var13.zCoord - var2.zCoord;
            double var22 = Math.sqrt(var18 * var18 + var20 * var20);
            return var9 < var22;
         }

         var3 *= 0.99;
         var7 *= 0.99;
         double var24 = var5 * 0.99;
         var5 = var24 - 0.05;
         var15 = var13;
         var13 = var13.addVector(var3, var5, var7);
         var16++;
         if (var14 == null) {
            break;
         }
      }

      return true;
   }

   private EntityPlayer getDistance_2() {
      long var1 = 11180434248796L;
      int[] var10000 = AimAssist.getStateArray();
      EntityPlayer var3 = null;
      int[] var4 = var10000;
      double var5 = Double.MAX_VALUE;

      for (EntityPlayer var8 : BreezeClient.CONST_A.theWorld.playerEntities) {
         if (AntiBot.isInvisible_3(var8) || var4 == null) {
            double var9 = BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var8);
            float[] var11 = RotationUtil7.getAnglesTo(
               BlockUtil7.getVec3_2(var8.getEntityBoundingBox()).addVector(0.0, 0.3, 0.0), BreezeClient.CONST_A.thePlayer
            );
            float var12 = Math.abs(Math.abs(var11[0]) - Math.abs(BreezeClient.CONST_A.thePlayer.rotationYaw));
            if ((!(var12 > this.fOVSetting.getObject_m().intValue() / 2.0F) || var4 == null)
               && (!(var9 > this.rangeSetting.getObject_m().intValue()) || var4 == null)) {
               double var13 = this.prioritySetting.isValid(PriorityMode2.DISTANCE) ? var9 : var12;
               if (var13 < var5) {
                  var3 = var8;
                  var5 = var13;
               }

               if (var4 == null) {
                  break;
               }
            }
         }
      }

      return var3;
   }

   private boolean lambda$new_Inner1(rip.breeze.DateUtil var1) {
      long var2 = 35832325785202L;
      return !this.modeSetting.isValid(RotationUtil2_x.YAW);
   }

   private boolean lambda$new_Inner0(rip.breeze.DateUtil var1) {
      long var2 = 89849891593913L;
      return !this.modeSetting.isValid(RotationUtil2_x.PITCH);
   }

   static {
      long var0 = 23215363194976L;
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
      String var6 = "9\u000f´ÅiÓçW\u0088±Uo©B,æ ¹ñÀ@ò.=¯\u0085ó\u0007\u0088\u008eæwph\r\u0004;éÚ\u0082+\u0000ñ\u0014ÏÔ\u000f\u000ftP\u008f\u0084h»÷\u0006ôg ÷7C.ã¡\u0092ÎÖû¢²à?Ì¿Lªã»·\u007fTP\u0005\u0005\u0096Õ¼ÞÒÜG¿\u000f³\u0006ÎZ\u000b¸°õ\\§®\u0085\u0095~\r\u009bÄÞ[Q\u0083hàÃ{\u0091_\u008d\u0093jÐ²ZzÁ \u0010ÆP]å~\u0099-Frf\u008a\u0014W\u0090çÛ\u00104ÖU\u009eÿ\u001d\u009d\u0082ø¿ \u0011YÐ1\u0099p¸d_\u0080ð¨7ÞåÀüw¿\u0018\u008cFsh@úQ\u0087;\u001b\u0018ÆX=\u0092³ï\u009d{t7jº'> .\u009d\u001eÃó\u0083\u0093d\u0081ìrï°]üi\nQÃäã\fÍ1Æ?\"£'¨iè¤v\u007f\u0004í\u0091û³\u0007Î7\u009d\u0083æ\u0001¿\u009a\bÃÕ°éV§ä\rhÛ-4\u001b^9\u0019Fð£Á±7(Á\u009bÍi¶[&ä'®\b\u0098\u009cí¯hS«j4\u009eª2\u0090K¶\u001f\u001f\u008e\u0088\u0085È}û×ôOj©àXÝ÷ðö»\u00ad|Øbd;\u0094î Ñ9Säÿ9QZ\u000erÚq\u0002#Ö4\u0015ã¢Û \u0016|\u0099ì\u008d¾Ý*\u008b4ê\u0017øH\u0094»GÆÊ\u0017\u0083þIú\u0086Ë5#J\u0084\f\u0096{¼\u009a¡É¬½Î\u008e!¸6\u009dáu\u0013Õ\u0097ù@ê\u0018Ø¿Ý´5cAa}þvn\u009b)\u0004\u0099\u009eg\u0003bg§\u00917\u0018dLCh\u007f\u0000ð¤G\u009d÷%;\u0001ï\u0019õÏè\u0086ÄK#xxz1\u001b+È`iQ3dWWÇcÃËãÍ|\nÖZí\u008fIþØ\u0080¨qB³Û*>¿H\u0083\u001em\u0007\u001cñÿ;\u001a\u0014\u0090ÜòÊÙ!L«½ò\t\u0099}~\";ëa÷7\u009e\u0006ª\u0007\u00ad³¯3\u0010=dél\ný£\u0096®¢üdu\n°p\u0083c4ó¿ô]¤ÍËíÚ=ßö\u00adn\u0013\u0019 t\bE$\u000e\u0019´á\u0018\u007f\u0015\u0013´:\f>æ\u0005s\u0006u\u0087ß-[JkÆ\u0090\u0016\u0089õi";
      int var7 = "9\u000f´ÅiÓçW\u0088±Uo©B,æ ¹ñÀ@ò.=¯\u0085ó\u0007\u0088\u008eæwph\r\u0004;éÚ\u0082+\u0000ñ\u0014ÏÔ\u000f\u000ftP\u008f\u0084h»÷\u0006ôg ÷7C.ã¡\u0092ÎÖû¢²à?Ì¿Lªã»·\u007fTP\u0005\u0005\u0096Õ¼ÞÒÜG¿\u000f³\u0006ÎZ\u000b¸°õ\\§®\u0085\u0095~\r\u009bÄÞ[Q\u0083hàÃ{\u0091_\u008d\u0093jÐ²ZzÁ \u0010ÆP]å~\u0099-Frf\u008a\u0014W\u0090çÛ\u00104ÖU\u009eÿ\u001d\u009d\u0082ø¿ \u0011YÐ1\u0099p¸d_\u0080ð¨7ÞåÀüw¿\u0018\u008cFsh@úQ\u0087;\u001b\u0018ÆX=\u0092³ï\u009d{t7jº'> .\u009d\u001eÃó\u0083\u0093d\u0081ìrï°]üi\nQÃäã\fÍ1Æ?\"£'¨iè¤v\u007f\u0004í\u0091û³\u0007Î7\u009d\u0083æ\u0001¿\u009a\bÃÕ°éV§ä\rhÛ-4\u001b^9\u0019Fð£Á±7(Á\u009bÍi¶[&ä'®\b\u0098\u009cí¯hS«j4\u009eª2\u0090K¶\u001f\u001f\u008e\u0088\u0085È}û×ôOj©àXÝ÷ðö»\u00ad|Øbd;\u0094î Ñ9Säÿ9QZ\u000erÚq\u0002#Ö4\u0015ã¢Û \u0016|\u0099ì\u008d¾Ý*\u008b4ê\u0017øH\u0094»GÆÊ\u0017\u0083þIú\u0086Ë5#J\u0084\f\u0096{¼\u009a¡É¬½Î\u008e!¸6\u009dáu\u0013Õ\u0097ù@ê\u0018Ø¿Ý´5cAa}þvn\u009b)\u0004\u0099\u009eg\u0003bg§\u00917\u0018dLCh\u007f\u0000ð¤G\u009d÷%;\u0001ï\u0019õÏè\u0086ÄK#xxz1\u001b+È`iQ3dWWÇcÃËãÍ|\nÖZí\u008fIþØ\u0080¨qB³Û*>¿H\u0083\u001em\u0007\u001cñÿ;\u001a\u0014\u0090ÜòÊÙ!L«½ò\t\u0099}~\";ëa÷7\u009e\u0006ª\u0007\u00ad³¯3\u0010=dél\ný£\u0096®¢üdu\n°p\u0083c4ó¿ô]¤ÍËíÚ=ßö\u00adn\u0013\u0019 t\bE$\u000e\u0019´á\u0018\u007f\u0015\u0013´:\f>æ\u0005s\u0006u\u0087ß-[JkÆ\u0090\u0016\u0089õi"
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
                     CONST_W = var4;
                     CONST_X = new String[14];
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

                  var6 = "HäøpÉ\u009e³Ü¿\u0085_\u0096\u0000¸¯E!ó¢ò{A8J±j\u0016ý?É\u0093-[¶6º\u0003å\u007fOí\u009e3ÕÕ¯²\u009e6Ukgòc§ß\u001fß7ðæjhg¡\u0098$\n/\u0018~¤H\u0090v7ëF»V~êè\\°³\u0005vàs\u0010\u0004jÒØÏ¦\u0002Å.Ò¾È©\u0003ÈÈ2UÖé\u008b¤\u000eÂI*Æ\u008d¾·Ø\u008c³\u0086\u00ad?AnÇÔ\u0080j.1\u000f\u000e,\u008bm¯\u0095û1\u0005";
                  var7 = "HäøpÉ\u009e³Ü¿\u0085_\u0096\u0000¸¯E!ó¢ò{A8J±j\u0016ý?É\u0093-[¶6º\u0003å\u007fOí\u009e3ÕÕ¯²\u009e6Ukgòc§ß\u001fß7ðæjhg¡\u0098$\n/\u0018~¤H\u0090v7ëF»V~êè\\°³\u0005vàs\u0010\u0004jÒØÏ¦\u0002Å.Ò¾È©\u0003ÈÈ2UÖé\u008b¤\u000eÂI*Æ\u008d¾·Ø\u008c³\u0086\u00ad?AnÇÔ\u0080j.1\u000f\u000e,\u008bm¯\u0095û1\u0005"
                     .length();
                  var8 = 'H';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20025;
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
            throw new RuntimeException("rip/breeze/client/dl", var10);
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
         throw new RuntimeException("rip/breeze/client/dl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
