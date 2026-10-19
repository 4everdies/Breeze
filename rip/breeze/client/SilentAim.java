package rip.breeze.client;

import java.awt.Color;
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
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.GL11;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "SilentAim",
   b = "Silently rotates toward nearby enemies when you click.",
   d = rip.breeze.ModuleCategory.COMBAT,
   c = {"silent", "aim", "aimbot", "rotation", "combat"}
)
public class SilentAim extends BreezeModule implements IBreezeInterface2 {
   private final GenericSetting<Boolean> weaponOnlySetting;
   private final GenericSetting<Boolean> legitWalkSetting;
   private final GenericSetting<Double> rangeSetting;
   private final GenericSetting<Double> fOVSetting;
   private final GenericSetting<Integer> stayTicksSetting;
   private final GenericSetting<Boolean> multiTargetingSetting;
   private final GenericSetting<Integer> switchDelaySetting;
   private final GenericSetting<Boolean> colorSetting;
   private final GenericSetting<rip.breeze.BreezeColor> dataBuilder54_v;
   private EnumType18 enum_IDLE_w;
   private EntityPlayer entityPlayer_x;
   private EntityPlayer entityPlayer_y;
   private boolean fieldBool_z;
   private boolean fieldBool_A;
   private int fieldInt_B;
   private int fieldInt_C;
   private Vec3 vec3_D;
   private static int[] arr_E;
   private static final String[] CONST_G;
   private static final String[] CONST_H;
   private static final Map CONST_I = new HashMap(13);
   private static final long eka_1;

   public SilentAim() {
      long var1 = 24210709102394L;
      super();
      short var10002 = 16991;
      long var10003 = 1671866238759687220L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "WeaponOnly");
      var10002 = 27793;
      var10003 = 5822757065029253858L ^ var1;
      this.weaponOnlySetting = var10001.getDataBuilder50_3("Only activate while holding a weapon.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 13869;
      var10003 = 8031742064647839835L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "LegitWalk");
      var10002 = 7173;
      var10003 = 3724988883079465583L ^ var1;
      this.legitWalkSetting = var10001.getDataBuilder50_3("Apply movement correction to bypass more servers.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 11822;
      var10003 = 2982171570147604564L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Range");
      var10002 = 8141;
      var10003 = 1900243558663129520L ^ var1;
      this.rangeSetting = var10001.getDataBuilder50_3("Maximum distance to silently aim at a target.")
         .getDataBuilder50_4(3.5)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(1.0, 6.0))
         .getDataBuilder54();
      var10002 = 15251;
      var10003 = 3732273083547626982L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "FOV");
      var10002 = 29158;
      var10003 = 3494947103869495182L ^ var1;
      this.fOVSetting = var10001.getDataBuilder50_3("Only aim at targets within this field of view.")
         .getDataBuilder50_4(90.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(10.0, 360.0))
         .getDataBuilder54();
      var10002 = 22832;
      var10003 = 2129638677467451214L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "StayTicks");
      var10002 = 19898;
      var10003 = 3655235525441838018L ^ var1;
      this.stayTicksSetting = var10001.getDataBuilder50_3("How many ticks to hold the silent rotation after attacking an enemy.")
         .getDataBuilder50_4(2)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 10))
         .getDataBuilder54();
      var10002 = 21058;
      var10003 = 7333810896172663851L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "MultiTargeting");
      var10002 = 24628;
      var10003 = 5974482026148853325L ^ var1;
      this.multiTargetingSetting = var10001.getDataBuilder50_3("Switches between targets while silent aiming, even more blatant.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      var10002 = 27714;
      var10003 = 3144476858153466418L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "SwitchDelay");
      var10002 = 28708;
      var10003 = 391689361582351967L ^ var1;
      this.switchDelaySetting = var10001.getDataBuilder50_3("The delay in between switching targets.")
         .getDataBuilder50_4(4)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(0, 10))
         .getDataBuilder50_9(SilentAim::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 13581;
      var10003 = 8898600310952174449L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Draw a line to the enemy you are currently silent aiming.");
      var10002 = 139;
      var10003 = 8828832400753530623L ^ var1;
      this.colorSetting = var10001.getDataBuilder50_3("Color").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 13323;
      var10003 = 8898626079278539380L ^ var1;
      this.dataBuilder54_v = GenericSetting.<rip.breeze.BreezeColor>getDataBuilder50(this, "The color for the line to the enemy.")
         .getDataBuilder50_3("The color for the line to the enemy.")
         .getDataBuilder50_9(SilentAim::lambda$new_Inner1)
         .getDataBuilder50_4(new rip.breeze.BreezeColor((int)-3524780050944580879L))
         .getDataBuilder54();
      this.enum_IDLE_w = EnumType18.IDLE;
      this.entityPlayer_x = null;
      this.entityPlayer_y = null;
      this.fieldBool_z = false;
      this.fieldBool_A = false;
      this.fieldInt_B = 0;
      this.fieldInt_C = 0;
      this.vec3_D = null;
   }

   public void toggle() {
      BreezeClient.getModuleRegistry().applyRotation(this);
   }

   public void update() {
      BreezeClient.getModuleRegistry().initialize(this);
      this.enum_IDLE_w = EnumType18.IDLE;
      this.entityPlayer_x = null;
      this.entityPlayer_y = null;
      this.vec3_D = null;
      this.fieldInt_C = 0;
   }

   @EventListener(a = rip.breeze.Priority.HIGH)
   public void processAll(MouseClickedEventEvent var1) {
      long var2 = 23742223858263L;
      if (!BreezeClient.isValid() && !var1.g && var1.aimYawMode_h == AimYawMode.LEFT && this.fieldBool_z) {
         if (this.weaponOnlySetting.getObject_m() && !BreezeClient.getThemeManager().getHeldItem(BreezeClient.CONST_A.thePlayer)) {
            this.enum_IDLE_w = EnumType18.IDLE;
         } else {
            PlayerUtil3 var4 = this.getDistance();
            if (var4 != null) {
               boolean var5 = this.multiTargetingSetting.getObject_m() && this.entityPlayer_y != null && this.entityPlayer_y != var4.entityPlayer_a;
               this.entityPlayer_y = var4.entityPlayer_a;
               this.entityPlayer_x = var4.entityPlayer_a;
               this.vec3_D = var4.vec3_d;
               if (var5) {
                  if (this.fieldInt_C <= 0) {
                     this.fieldInt_C = this.switchDelaySetting.getObject_m();
                  }

                  var1.a();
                  this.enum_IDLE_w = EnumType18.FIRST_TICK;
                  BreezeClient.getModuleRegistry().isActive(true);
                  BreezeClient.getModuleRegistry().isActive_2(this.legitWalkSetting.getObject_m());
                  BreezeClient.getModuleRegistry().isValid(var4.arr_b, 0.0F);
                  BreezeClient.CONST_A.entityRenderer.getMouseOver(1.0F);
               } else if (this.fieldInt_C > 0) {
                  var1.a();
               } else {
                  this.fieldInt_B = this.stayTicksSetting.getObject_m();
                  if (BreezeClient.CONST_A.objectMouseOver.entityHit != this.entityPlayer_x) {
                     this.enum_IDLE_w = EnumType18.FIRST_TICK;
                     BreezeClient.getModuleRegistry().isActive(true);
                     BreezeClient.getModuleRegistry().isActive_2(this.legitWalkSetting.getObject_m());
                     BreezeClient.getModuleRegistry().isValid(var4.arr_b, 0.0F);
                     BreezeClient.CONST_A.entityRenderer.getMouseOver(1.0F);
                  }
               }
            }
         }
      }
   }

   public void updateRotation(ModuleRegistry var1) {
      long var2 = 117735033473270L;
      int[] var10000 = AimAssist.getStateArray();
      this.fieldBool_z = true;
      int[] var4 = var10000;
      switch (Util45.CONST_A[this.enum_IDLE_w.ordinal()]) {
         case 1:
            if (this.fieldInt_C <= 0) {
               break;
            }

            this.fieldInt_C--;
            if (var4 != null) {
               break;
            }
         case 2:
            var1.setBool_n();
            this.fieldInt_B = this.stayTicksSetting.getObject_m();
            if (this.fieldInt_B <= 0) {
               this.enum_IDLE_w = EnumType18.IDLE;
               if (var4 != null) {
                  break;
               }
            }

            this.enum_IDLE_w = EnumType18.HOLDING;
            if (var4 != null) {
               break;
            }
         case 3:
            if (this.entityPlayer_x == null
               || this.entityPlayer_x.isDead
               || this.entityPlayer_x.getHealth() <= 0.0F
               || BreezeClient.CONST_A.thePlayer.getDistanceToEntity(this.entityPlayer_x) > this.rangeSetting.getObject_m() + 1.0) {
               this.entityPlayer_x = null;
               this.vec3_D = null;
               this.enum_IDLE_w = EnumType18.IDLE;
               return;
            }

            PlayerUtil3 var5 = this.getHitbox(this.entityPlayer_x, BreezeClient.CONST_A.thePlayer.getPositionEyes(1.0F));
            this.vec3_D = var5.vec3_d;
            var1.isActive(true);
            var1.isActive_2(this.legitWalkSetting.getObject_m());
            var1.isValid(var5.arr_b, 0.0F);
            if (this.fieldInt_C > 0) {
               this.fieldInt_C--;
            }

            this.fieldInt_B--;
            if (this.fieldInt_B <= 0) {
               this.enum_IDLE_w = EnumType18.IDLE;
            }
      }
   }

   public int getValue() {
      return 10;
   }

   public void toggle() {
      long var1 = 58882723691566L;
      if (this.fieldBool_A) {
         this.fieldBool_z = true;
         this.fieldBool_A = false;
      } else {
         this.entityPlayer_x = null;
         this.entityPlayer_y = null;
         this.vec3_D = null;
         this.fieldInt_C = 0;
         this.enum_IDLE_w = EnumType18.IDLE;
         this.fieldBool_z = false;
      }
   }

   @EventListener
   public void calculate(Render2DEventEvent var1) {
      long var2 = 88229348285280L;
      int[] var4 = AimAssist.getStateArray();
      if (this.colorSetting.getObject_m()
         && this.enum_IDLE_w != EnumType18.IDLE
         && this.vec3_D != null
         && this.entityPlayer_x != null
         && !this.entityPlayer_x.isDead) {
         float var5 = var1.getFloat_g();
         double var6 = (this.entityPlayer_x.posX - this.entityPlayer_x.lastTickPosX) * (var5 - 1.0);
         double var8 = (this.entityPlayer_x.posY - this.entityPlayer_x.lastTickPosY) * (var5 - 1.0);
         double var10 = (this.entityPlayer_x.posZ - this.entityPlayer_x.lastTickPosZ) * (var5 - 1.0);
         double[] var12 = RenderUtil31.createVector(this.vec3_D.xCoord + var6, this.vec3_D.yCoord + var8, this.vec3_D.zCoord + var10);
         if (var12 != null) {
            float var13 = (float)var12[0];
            float var14 = (float)var12[1];
            float var15 = BreezeClient.CONST_A.displayWidth / 2.0F;
            float var16 = BreezeClient.CONST_A.displayHeight / 2.0F;
            Color var17 = this.dataBuilder54_v.getObject_m();
            float var18 = var17.getRed() / 255.0F;
            float var19 = var17.getGreen() / 255.0F;
            float var20 = var17.getBlue() / 255.0F;
            float var21 = var17.getAlpha() / 255.0F;
            GL11.glPushMatrix();
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glDisable(3553);
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            GL11.glEnable(2848);
            GL11.glHint(3154, 4354);
            GL11.glColor4f(var18, var19, var20, var21);
            GL11.glLineWidth(2.5F);
            GL11.glBegin(1);
            GL11.glVertex2f(var15, var16);
            GL11.glVertex2f(var13, var14);
            GL11.glEnd();
            float var22 = 6.0F;
            GL11.glBegin(6);
            GL11.glVertex2f(var13, var14);
            int var23 = 0;

            while (var23 <= 20) {
               double var24 = (-Math.PI * 2) * var23 / 20.0;
               GL11.glVertex2f(var13 + (float)Math.cos(var24) * var22, var14 + (float)Math.sin(var24) * var22);
               var23++;
               if (var4 == null) {
                  break;
               }
            }

            GL11.glEnd();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDepthMask(true);
            GL11.glEnable(2929);
            GL11.glDisable(2848);
            GL11.glHint(3154, 4352);
            GL11.glEnable(3553);
            GL11.glPopMatrix();
         }
      }
   }

   public void setBool_z() {
      this.fieldBool_z = true;
   }

   private PlayerUtil3 getHitbox(EntityPlayer var1, Vec3 var2) {
      long var3 = 22831039442691L;
      AxisAlignedBB var5 = var1.getEntityBoundingBox().expand(0.1, 0.1, 0.1);
      double var6 = var5.maxY - var5.minY;
      double var8 = (var5.minX + var5.maxX) * 0.5;
      double var10 = (var5.minZ + var5.maxZ) * 0.5;
      Vec3 var12 = new Vec3(var8, var5.minY + var6 * 0.5, var10);
      float[] var13 = RotationUtil7.getAnglesTo(var12, BreezeClient.CONST_A.thePlayer, true);
      Vec3 var14 = BlockUtil7.rayTrace(var2, var5);
      return var14 != null
         ? new PlayerUtil3(var1, RotationUtil7.getAnglesTo(var14, BreezeClient.CONST_A.thePlayer, true), true, var14)
         : new PlayerUtil3(var1, var13, false, var12);
   }

   private PlayerUtil3 getDistance() {
      long var1 = 72835242881171L;
      PlayerUtil3 var3 = null;
      int[] var10000 = AimAssist.getStateArray();
      double var4 = Double.MAX_VALUE;
      Vec3 var6 = BreezeClient.CONST_A.thePlayer.getPositionEyes(1.0F);
      boolean var7 = this.multiTargetingSetting.getObject_m();
      int[] var8 = var10000;

      for (Entity var10 : BreezeClient.CONST_A.theWorld.loadedEntityList) {
         if (var10 instanceof EntityPlayer && var10 != BreezeClient.CONST_A.thePlayer) {
            EntityPlayer var11 = (EntityPlayer)var10;
            if (AntiBot.isInvisible_3(var11)) {
               double var12 = BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var11);
               if (!(var12 > this.rangeSetting.getObject_m())) {
                  float var14 = RotationUtil7.absValue(
                     RotationUtil7.getAnglesTo(BlockUtil7.getVec3_2(var11.getEntityBoundingBox()), BreezeClient.CONST_A.thePlayer, false)[0],
                     BreezeClient.CONST_A.thePlayer.rotationYaw
                  );
                  if (!(var14 > this.fOVSetting.getObject_m() / 2.0)) {
                     PlayerUtil3 var15 = this.getHitbox(var11, var6);
                     if (var15.fieldBool_c) {
                        double var16 = var7 ? var11.hurtResistantTime * 20.0 + var14 : var12;
                        if (var16 < var4) {
                           var4 = var16;
                           var3 = var15;
                        }

                        if (var8 == null) {
                           break;
                        }
                     }
                  }
               }
            }
         }
      }

      return var3;
   }

   private static boolean lambda$new_Inner1(rip.breeze.DateUtil var0) {
      long var1 = 50208564329207L;
      return var0.getObject("Render", Boolean.class);
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 126863970118035L;
      return var0.getObject("MultiTargeting", Boolean.class);
   }

   public static void initialize(int[] var0) {
      arr_E = var0;
   }

   public static int[] values() {
      return arr_E;
   }

   static {
      int[] var10000 = new int[5];
      long var0 = 2456294481546L;
      initialize(var10000);
      Cipher var2;
      Cipher var18 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[20];
      int var5 = 0;
      String var6 = "·mmUüz2\u008fO¥\u0081Î\u0091_Inner7\u001a\"\u0018¥\u0099Eº\u0017Ai#(\u0007iT+¥On\u00011\u0093\u008f«c¯\u0082\u009f°´\u0011¼ð*<Å\t\n\u0013ú\u001eù\u001cÆ9AQRàÔ\u001b2Û/ªR\u0019´þ©\u001c\u007f9¯\u001b%i\u0080\u0080z)ð6\u001c0hÛa\u009bFéPp\u0099\\zr\u0095ü\u001e¯ù<\u0099\u0098´XhÆ9\u0005£\u0016þ4ÒyR&\u008c\u0017d\u00ad\u0088&\u008fS¹Dy»<h¤\u001d>\u007fÓÛ»h\u0006\u0093\u0088\u0018/¢mZ~\u0089µs\u008d\u0099ÓOùår\u008eÄë[(æ\u0017V³\u0019¥<ëàQu#!<m¹\u00062M\u0096ÿ\u008c\u009eñ\u0080s\u0091xUN\u0081\bj÷\u0086»²\u0015ÏâB\u0080ÍÎX\u0015\u0084@g Õ%\u007fY§\u009dÅ1\u0012Û5à\u0000?\u0087ßF¹c\u00835ìi\u001fB\u000f\u0088\u008aS\u000bÍïc\u001eêL\u0094ðXPëaóD\u0012\u0096\u0015`\u001c?1V¤\u0085°@Í#¸\u009cAb\u0010·\u007f<\u0017à´ª«\u0099º\u008eä2Å7\u001eP/\u0012\u009dê7§,Tó\u0004@8££M\u0080\u0012QÌ\u008a\u0001%D\u0088\u008bÝC\\\u008b\u009b\"ÉzÝ\u0093\u0014\u0082\rïÚ\u0093\u001f-\u008bÏ\u001b\u0005r¥\u0093r6ü\nãaU\f\u000e\u0004¾J?\u0080¹¨hmÆÕÂ¥\u008cF\u0087\u0017¶$#æ\u0010F:tÿH%Q>öò\u00153@DÌ\u001e\u0010nÍÙDÑÊÏ'ò¨\u009c±ð}kz 5í\u008e[j\u0083 Dñ«õY\u000b&àW¸(Ì'Ô²KàÐ±hÀJ\u0017&§\u0010+ml¥è\u008c0\u00127è¢%\u0087P£Õ â\u0016\u001c¹ÿ3`ô\u000b\u0089\u0089G¯â®;#ð\u0004\u0092³eq9º\u008ef\u001b¡\u008aÚ\n@_\u0017\u009a]\u0015©J'\u0012íE«M¬>\u0007\u0004ÁR2ý\u0015\u0001b¤¡ð.â\"\u00adFÞ[Ç8\u0007\u00815w\u0005\u0099\u0005=ÚÕ\u0000½\u008fß\u0085âHÍÔG®\u0092\u001cf`c2Ü@i³Ýâ\u0098\u000f`2ý6\u0019eöG[î(a¿\u008a§[\u009c-\u0006)\u001e!û\u0092\u007fUçòÁ3áç`ÈÔÊ\u001f\bO\u0093åä5ªë\u009er ´eÜ[\u0099\u0015Í%¬·\u0010)CÀ÷¤tÚmf²\u0098C\u0002-R±hùF\u0011-Olb,\u0083qª\u0080ì\u0007»2\"U\u0017\u0095-Â»\u009c[\u001a\u008bå&ñÐo\u007fø×\u0010dÎ\\óº§Ìd\u009f\u007fu\u0094IyÏá|\u0007\u0083ªY\u0087\u0088]zËØ\u0091ÖÌp\u0099Ö\\$¶È\u008b«DJþn\u0091\u00108°Õ\u009824\u0084áHñzý§\u0006lyo\u0090ò\u00906ö¶ \fvÊS\u000f\u0011ºöµ\u001cg\u0000\u001b,|ª\u0090ß5Û\u009eSÎF\u0093\u0089¯RÜfðS\u0018!\"Ñ!\u0002/%wN;y\u0081\u0014Éé\u0018K[Õ·xâ\u0088á DRd)LÑ&\u0091f\u008b¢`ó\u001b¢\u0088\u001fDè\f\u008b¹\náÉ=ô\u001eII\u0019QHÕ\u0003\u001dY'ÞTþ(ZV8\u0019\u008d¼«ÁÁò\u0094Y\u0010\u009fÉ\u000fÛ±Áf\u0098¨.iÌí\u0088?âØª\u0080\"Z©Ù>¼[ùâ{Ô§T§3Ø\u008aÈû\u0010b/T\u0087\u0080Ìlhë`\u0015";
      int var7 = "·mmUüz2\u008fO¥\u0081Î\u0091_Inner7\u001a\"\u0018¥\u0099Eº\u0017Ai#(\u0007iT+¥On\u00011\u0093\u008f«c¯\u0082\u009f°´\u0011¼ð*<Å\t\n\u0013ú\u001eù\u001cÆ9AQRàÔ\u001b2Û/ªR\u0019´þ©\u001c\u007f9¯\u001b%i\u0080\u0080z)ð6\u001c0hÛa\u009bFéPp\u0099\\zr\u0095ü\u001e¯ù<\u0099\u0098´XhÆ9\u0005£\u0016þ4ÒyR&\u008c\u0017d\u00ad\u0088&\u008fS¹Dy»<h¤\u001d>\u007fÓÛ»h\u0006\u0093\u0088\u0018/¢mZ~\u0089µs\u008d\u0099ÓOùår\u008eÄë[(æ\u0017V³\u0019¥<ëàQu#!<m¹\u00062M\u0096ÿ\u008c\u009eñ\u0080s\u0091xUN\u0081\bj÷\u0086»²\u0015ÏâB\u0080ÍÎX\u0015\u0084@g Õ%\u007fY§\u009dÅ1\u0012Û5à\u0000?\u0087ßF¹c\u00835ìi\u001fB\u000f\u0088\u008aS\u000bÍïc\u001eêL\u0094ðXPëaóD\u0012\u0096\u0015`\u001c?1V¤\u0085°@Í#¸\u009cAb\u0010·\u007f<\u0017à´ª«\u0099º\u008eä2Å7\u001eP/\u0012\u009dê7§,Tó\u0004@8££M\u0080\u0012QÌ\u008a\u0001%D\u0088\u008bÝC\\\u008b\u009b\"ÉzÝ\u0093\u0014\u0082\rïÚ\u0093\u001f-\u008bÏ\u001b\u0005r¥\u0093r6ü\nãaU\f\u000e\u0004¾J?\u0080¹¨hmÆÕÂ¥\u008cF\u0087\u0017¶$#æ\u0010F:tÿH%Q>öò\u00153@DÌ\u001e\u0010nÍÙDÑÊÏ'ò¨\u009c±ð}kz 5í\u008e[j\u0083 Dñ«õY\u000b&àW¸(Ì'Ô²KàÐ±hÀJ\u0017&§\u0010+ml¥è\u008c0\u00127è¢%\u0087P£Õ â\u0016\u001c¹ÿ3`ô\u000b\u0089\u0089G¯â®;#ð\u0004\u0092³eq9º\u008ef\u001b¡\u008aÚ\n@_\u0017\u009a]\u0015©J'\u0012íE«M¬>\u0007\u0004ÁR2ý\u0015\u0001b¤¡ð.â\"\u00adFÞ[Ç8\u0007\u00815w\u0005\u0099\u0005=ÚÕ\u0000½\u008fß\u0085âHÍÔG®\u0092\u001cf`c2Ü@i³Ýâ\u0098\u000f`2ý6\u0019eöG[î(a¿\u008a§[\u009c-\u0006)\u001e!û\u0092\u007fUçòÁ3áç`ÈÔÊ\u001f\bO\u0093åä5ªë\u009er ´eÜ[\u0099\u0015Í%¬·\u0010)CÀ÷¤tÚmf²\u0098C\u0002-R±hùF\u0011-Olb,\u0083qª\u0080ì\u0007»2\"U\u0017\u0095-Â»\u009c[\u001a\u008bå&ñÐo\u007fø×\u0010dÎ\\óº§Ìd\u009f\u007fu\u0094IyÏá|\u0007\u0083ªY\u0087\u0088]zËØ\u0091ÖÌp\u0099Ö\\$¶È\u008b«DJþn\u0091\u00108°Õ\u009824\u0084áHñzý§\u0006lyo\u0090ò\u00906ö¶ \fvÊS\u000f\u0011ºöµ\u001cg\u0000\u001b,|ª\u0090ß5Û\u009eSÎF\u0093\u0089¯RÜfðS\u0018!\"Ñ!\u0002/%wN;y\u0081\u0014Éé\u0018K[Õ·xâ\u0088á DRd)LÑ&\u0091f\u008b¢`ó\u001b¢\u0088\u001fDè\f\u008b¹\náÉ=ô\u001eII\u0019QHÕ\u0003\u001dY'ÞTþ(ZV8\u0019\u008d¼«ÁÁò\u0094Y\u0010\u009fÉ\u000fÛ±Áf\u0098¨.iÌí\u0088?âØª\u0080\"Z©Ù>¼[ùâ{Ô§T§3Ø\u008aÈû\u0010b/T\u0087\u0080Ìlhë`\u0015"
         .length();
      char var8 = 'p';
      int var17 = -1;

      label37:
      while (true) {
         String var19 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var19.getBytes("ISO-8859-1"));
            String var27 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var27;
                  if ((var17 += var8) >= var7) {
                     CONST_G = var4;
                     CONST_H = new String[20];
                     Cipher var11;
                     Cipher var21 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var21.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 1304722430614658000L;
                     byte[] var15 = var11.doFinal(
                        new byte[]{
                           (byte)(var13 >>> 56),
                           (byte)(var13 >>> 48),
                           (byte)(var13 >>> 40),
                           (byte)(var13 >>> 32),
                           (byte)(var13 >>> 24),
                           (byte)(var13 >>> 16),
                           (byte)(var13 >>> 8),
                           (byte)var13
                        }
                     );
                     long var31 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     -3524780050944580879L = var31;
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var27;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "p7§Ô³|êH6\u0016ykå\u0012Þa{Û\u001fç÷ \u007fCX\u009e\u0090c]\u0095a^(\u009d3*bx\u0089U_\u008e\u001aàæ'\u009euMIX\u001aQ1þA¶©Û\u0091]\u000e\u0081ù9\u00989í\u009aºÑí\u001dì©\u001d$#vR\u009cà\u001b\u008d/÷g¹6%¨n5 'Ò[\u00adó9üÍÜ\t¢n\u0099U*¦\u0089û.";
                  var7 = "p7§Ô³|êH6\u0016ykå\u0012Þa{Û\u001fç÷ \u007fCX\u009e\u0090c]\u0095a^(\u009d3*bx\u0089U_\u008e\u001aàæ'\u009euMIX\u001aQ1þA¶©Û\u0091]\u000e\u0081ù9\u00989í\u009aºÑí\u001dì©\u001d$#vR\u009cà\u001b\u008d/÷g¹6%¨n5 'Ò[\u00adó9üÍÜ\t¢n\u0099U*¦\u0089û."
                     .length();
                  var8 = 24;
                  var17 = -1;
            }

            var19 = var6.substring(++var17, var17 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10563;
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
            throw new RuntimeException("rip/breeze/client/du", var10);
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
         throw new RuntimeException("rip/breeze/client/du" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
