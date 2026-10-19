package rip.breeze.client;

import java.awt.Color;
import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;
import rip.breeze.BreezeModule;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.RenderUtil18_x;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;
import rip.breeze.Util8;

@ModuleInfo(
   a = "TargetHUD",
   b = "Displays health and info about your current combat target.",
   d = {rip.breeze.ModuleCategory.HUD, rip.breeze.ModuleCategory.COMBAT},
   c = {"target", "hud", "combat", "enemy", "player", "health"}
)
public class TargetHUD extends BreezeModule implements rip.breeze.IBreezeInterface2 {
   private final GenericSetting<Boolean> followPlayerSetting;
   private final GenericSetting<Double> roundingSetting;
   private final GenericSetting<Boolean> glowBarSetting;
   private final rip.breeze.RotationUtil8 dataBuilder14_q;
   private EntityPlayer entityPlayer_r;
   private float fieldFloat_s;
   private float fieldFloat_t;
   private Util133 dataBuilder112_u;
   private NetworkPlayerInfo networkPlayerInfo_v;
   private long fieldLong_w;
   private static final long eka_1;
   private final AnimationTimer dataBuilder15_y;
   private double double_z;
   private double double_A;
   private double double_B;
   private float fieldFloat_C;
   private float fieldFloat_D;
   private long fieldLong_E;
   private float fieldFloat_F;
   private float fieldFloat_G;
   private float fieldFloat_H;
   private float fieldFloat_I;
   private int fieldInt_J;
   private boolean fieldBool_K;
   private static final int CONST_L;
   private static final int CONST_M;
   private static final int CONST_N;
   private static final String CONST_O;
   private static final float CONST_P = 14.0F;
   private static final float CONST_Q = 20.0F;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);
   private static final long[] CONST_V;
   private static final Long[] CONST_W;
   private static final Map CONST_X;

   public rip.breeze.RotationUtil8 getDataBuilder14() {
      return this.dataBuilder14_q;
   }

   public int clamp() {
      return Math.max(50, (int)this.fieldFloat_H);
   }

   public int clamp_2() {
      return Math.max(20, (int)this.fieldFloat_I);
   }

   public boolean checkCondition() {
      long var1 = 121531037945683L;
      return !this.followPlayerSetting.getObject_m();
   }

   private boolean checkCondition_2() {
      long var1 = 129012565940501L;
      return BreezeClient.getClickGUI() != null && BreezeClient.getClickGUI().isBool_f();
   }

   public TargetHUD() {
      long var1 = 63242467443106L;
      super(false, false);
      short var10002 = 1632;
      long var10003 = 3528919406499615651L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "FollowPlayer");
      var10002 = 29698;
      var10003 = 4456286313184698821L ^ var1;
      this.followPlayerSetting = var10001.getDataBuilder50_3("Automatically follow the player's position over the screen.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      var10002 = 23288;
      var10003 = 4165503596897341244L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Rounding");
      var10002 = 6009;
      var10003 = 6646950681264571067L ^ var1;
      this.roundingSetting = var10001.getDataBuilder50_3("Corner radius scale for the card and player head.")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 2.0))
         .getDataBuilder54();
      var10002 = 10418;
      var10003 = 6276589977639320946L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "GlowBar");
      var10002 = 29942;
      var10003 = 3312219737232810288L ^ var1;
      this.glowBarSetting = var10001.getDataBuilder50_3("Animated breathing glow on the health bar.").getDataBuilder50_4(true).getDataBuilder54();
      this.dataBuilder14_q = new rip.breeze.RotationUtil8(this);
      this.fieldFloat_s = -1.0F;
      this.fieldFloat_t = -1.0F;
      this.dataBuilder112_u = new Util133();
      this.fieldLong_w = "Notch";
      this.dataBuilder15_y = new AnimationTimer(300.0F, false, EnumType3.CUBIC_OUT);
      this.double_z = Double.NaN;
      this.double_A = Double.NaN;
      this.double_B = Double.NaN;
      this.fieldFloat_C = -1.0F;
      this.fieldFloat_D = -1.0F;
      this.fieldLong_E = 0L;
      this.fieldBool_K = false;
   }

   private ModuleManager getModuleManager() {
      return BreezeClient.getModuleManager();
   }

   private int calculate() {
      return 4 * this.getModuleManager().fieldInt_l;
   }

   private int calculate_2() {
      return 30 * this.getModuleManager().fieldInt_l;
   }

   private int clamp_3() {
      return Math.max(4, 4 * this.getModuleManager().fieldInt_l);
   }

   private int calculate_3() {
      return 8 * this.getModuleManager().fieldInt_l;
   }

   private float calculateFloat() {
      return (float)(3.0 * this.roundingSetting.getObject_m() * this.getModuleManager().fieldInt_l);
   }

   private int calculate_4() {
      return this.getModuleManager().fieldInt_k + this.calculate_3() + this.clamp_3();
   }

   private int clamp_4(String var1, String var2) {
      ModuleManager var3 = this.getModuleManager();
      int var4 = var3.dataBuilder46_j.clamp_8(RenderUtil18_x.ACCENT + var1 + RenderUtil18_x.RESET);
      int var5 = var3.dataBuilder46_j.clamp_8(var2);
      int var6 = 70 * var3.fieldInt_l + 5 * var3.fieldInt_l + var5;
      return Math.max(var4, var6);
   }

   private boolean isValid() {
      long var1 = 72092665243008L;
      return this.entityPlayer_r != null;
   }

   private boolean checkCondition_3() {
      long var1 = 88794902303779L;
      return this.entityPlayer_r != null
         && !this.entityPlayer_r.isDead
         && BreezeClient.CONST_A.theWorld != null
         && !this.dataBuilder112_u.isValid("Notch");
   }

   private boolean checkCondition_4() {
      long var1 = 12817767813486L;
      if (BreezeClient.getThemeManager().getEntity() != null && BreezeClient.getThemeManager().getEntity() instanceof EntityPlayer) {
         this.entityPlayer_r = (EntityPlayer)BreezeClient.getThemeManager().getEntity();
         this.dataBuilder112_u.getDataBuilder112();
      }

      if (this.entityPlayer_r == null) {
         return false;
      } else if (!RenderUtil31.getHitbox(this.entityPlayer_r)) {
         this.entityPlayer_r = null;
         return false;
      } else {
         return this.checkCondition_3();
      }
   }

   private static float calculateFloat_2(float var0, float var1, float var2, float var3) {
      return var1 + (var0 - var1) * (float)Math.pow(0.5, var3 / var2);
   }

   private boolean clamp_5() {
      long var1 = 60853488050627L;
      long var3 = var1 ^ 58923744581449L;
      long var5 = var1 ^ 12197074721665L;
      int[] var7 = ModuleList.values();
      if (this.checkCondition_2() && !this.followPlayerSetting.getObject_m()) {
         int var33 = this.calculate();
         int var34 = this.calculate_2();
         String var35 = String.valueOf(Math.round(14.0F));
         int var36 = this.clamp_4("Notch", var35);
         this.fieldFloat_H = var33 + var34 + var33 + var36 + var33;
         this.fieldFloat_I = Math.max(var34, this.calculate_4()) + var33 * 2;
         this.fieldFloat_F = this.dataBuilder14_q.clamp_2();
         this.fieldFloat_G = this.dataBuilder14_q.clamp_3();
         this.fieldInt_J = var36;
         this.fieldBool_K = true;
         return true;
      }

      boolean var8 = this.checkCondition_4();
      this.dataBuilder15_y.toggle(var3, var8);
      float var9 = (float)this.dataBuilder15_y.getDouble(var5);
      if (!var8 && var9 <= 0.001F) {
         this.entityPlayer_r = null;
         this.double_z = this.double_A = this.double_B = Double.NaN;
         this.fieldFloat_C = this.fieldFloat_D = -1.0F;
         this.fieldLong_E = 0L;
         this.fieldBool_K = false;
         return false;
      }

      if (!(var9 <= 0.001F) && this.isValid()) {
         label56: {
            if (this.followPlayerSetting.getObject_m()) {
               float var37;
               label52: {
                  long var12 = System.nanoTime();
                  var37 = this.fieldLong_E > 0L ? (float)(var12 - this.fieldLong_E) / 1.0E9F : 0.016666668F;
                  var37 = Math.min(var37, 0.1F);
                  this.fieldLong_E = var12;
                  float var15 = MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks;
                  double var16 = this.entityPlayer_r.lastTickPosX + (this.entityPlayer_r.posX - this.entityPlayer_r.lastTickPosX) * var15;
                  double var18 = this.entityPlayer_r.lastTickPosY
                     + (this.entityPlayer_r.posY - this.entityPlayer_r.lastTickPosY) * var15
                     + this.entityPlayer_r.height * 0.5;
                  double var20 = this.entityPlayer_r.lastTickPosZ + (this.entityPlayer_r.posZ - this.entityPlayer_r.lastTickPosZ) * var15;
                  if (Double.isNaN(this.double_z)) {
                     this.double_z = var16;
                     this.double_A = var18;
                     this.double_B = var20;
                     if (var7 != null) {
                        break label52;
                     }
                  }

                  double var22 = Math.pow(0.5, var37 / 0.06);
                  this.double_z = var16 + (this.double_z - var16) * var22;
                  this.double_A = var18 + (this.double_A - var18) * var22;
                  this.double_B = var20 + (this.double_B - var20) * var22;
               }

               double[] var24 = RenderUtil31.createVector(this.double_z, this.double_A, this.double_B);
               if (var24 == null) {
                  this.fieldBool_K = false;
                  return false;
               }

               label46: {
                  float var25 = (float)var24[0];
                  float var26 = (float)var24[1];
                  if (this.fieldFloat_C < 0.0F) {
                     this.fieldFloat_C = var25;
                     this.fieldFloat_D = var26;
                     if (var7 != null) {
                        break label46;
                     }
                  }

                  this.fieldFloat_C = calculateFloat_2(this.fieldFloat_C, var25, 0.012F, var37);
                  this.fieldFloat_D = calculateFloat_2(this.fieldFloat_D, var26, 0.012F, var37);
               }

               if (var7 != null) {
                  break label56;
               }
            }

            this.double_z = this.double_A = this.double_B = Double.NaN;
            this.fieldFloat_C = this.fieldFloat_D = -1.0F;
            this.fieldLong_E = 0L;
         }

         int var28;
         int var29;
         int var30;
         float var40;
         float var41;
         label39: {
            ModuleManager var10 = this.getModuleManager();
            int var11 = this.calculate();
            int var38 = this.calculate_2();
            String var39 = this.entityPlayer_r.func_70005_c_();
            String var27 = RenderUtil18_x.SECONDARY + String.valueOf(Math.round(this.entityPlayer_r.getHealth())) + RenderUtil18_x.RESET;
            var28 = this.clamp_4(var39, var27);
            var29 = var11 + var38 + var11 + var28 + var11;
            var30 = Math.max(var38, this.calculate_4()) + var11 * 2;
            if (this.followPlayerSetting.getObject_m()) {
               var40 = this.fieldFloat_C - var29 - 10 * var10.fieldInt_l;
               var41 = this.fieldFloat_D - var30 / 2.0F;
               var40 = Math.max(0.0F, Math.min(BreezeClient.CONST_A.displayWidth - var29, var40));
               var41 = Math.max(0.0F, Math.min(BreezeClient.CONST_A.displayHeight - var30, var41));
               if (var7 != null) {
                  break label39;
               }
            }

            var40 = this.dataBuilder14_q.clamp_2();
            var41 = this.dataBuilder14_q.clamp_3();
         }

         this.fieldFloat_F = var40;
         this.fieldFloat_G = var41;
         this.fieldFloat_H = var29;
         this.fieldFloat_I = var30;
         this.fieldInt_J = var28;
         this.fieldBool_K = true;
         return true;
      } else {
         this.fieldBool_K = false;
         return false;
      }
   }

   public void calculate_5(List<Util8> var1) {
      long var2 = 107156506628507L;
      long var4 = var2 ^ 102503777889241L;
      if (this.clamp_5()) {
         boolean var6 = this.checkCondition_2() && !this.followPlayerSetting.getObject_m();
         float var7 = var6 ? 1.0F : (float)this.dataBuilder15_y.getDouble(var4);
         float var8 = this.fieldFloat_F + this.fieldFloat_H / 2.0F;
         float var9 = this.fieldFloat_G + this.fieldFloat_I / 2.0F;
         float var10 = this.fieldFloat_H * var7;
         float var11 = this.fieldFloat_I * var7;
         var1.add(new Util8(var8 - var10 / 2.0F, var9 - var11 / 2.0F, var10, var11, this.calculateFloat() * var7));
      }
   }

   public void updateRotation() {
      long var1 = 75876372377658L;
      long var3 = var1 ^ 133371837500024L;
      int[] var5 = ModuleList.values();
      if (!BreezeClient.isValid()) {
         boolean var6 = this.checkCondition_2() && !this.followPlayerSetting.getObject_m();
         float var7 = var6 ? 1.0F : (float)this.dataBuilder15_y.getDouble(var3);
         if (this.fieldBool_K && !(var7 <= 0.001F)) {
            ModuleManager var8;
            int var9;
            int var10;
            int var11;
            int var12;
            float var13;
            float var14;
            float var15;
            int var16;
            int var17;
            String var18;
            float var19;
            float var21;
            label106: {
               var8 = this.getModuleManager();
               var9 = this.calculate();
               var10 = this.calculate_2();
               var11 = this.clamp_3();
               var12 = this.calculate_3();
               var13 = this.calculateFloat();
               var14 = this.fieldFloat_F;
               var15 = this.fieldFloat_G;
               var16 = (int)this.fieldFloat_I;
               var17 = this.fieldInt_J;
               var18 = var6 ? "Notch" : this.entityPlayer_r.func_70005_c_();
               var19 = var6 ? 14.0F : this.entityPlayer_r.getHealth();
               float var20 = var6 ? 20.0F : Math.max(1.0F, this.entityPlayer_r.getMaxHealth());
               if (var6) {
                  var21 = 0.7F;
                  if (var5 != null) {
                     break label106;
                  }
               }

               if (this.fieldFloat_t > 0.0F && var19 < this.fieldFloat_t) {
                  this.fieldLong_w = System.currentTimeMillis();
               }

               this.fieldFloat_t = var19;
               if (this.fieldFloat_s < 0.0F) {
                  this.fieldFloat_s = var19;
               }

               this.fieldFloat_s = this.fieldFloat_s + (var19 - this.fieldFloat_s) * 0.05F;
               var21 = Math.max(0.0F, Math.min(1.0F, this.fieldFloat_s / var20));
            }

            float var22 = 1.0F;
            if (!var6 && this.fieldLong_w >= 0L) {
               float var23 = Math.min(1.0F, (float)(System.currentTimeMillis() - this.fieldLong_w) / 450.0F);
               float var24 = 1.0F - var23;
               var22 = 1.0F + 0.32F * var24 * var24;
               if (var23 >= 1.0F) {
                  this.fieldLong_w = "Notch";
               }
            }

            int var25;
            label107: {
               float var49 = var14 + this.fieldFloat_H / 2.0F;
               float var50 = var15 + this.fieldFloat_I / 2.0F;
               var8.initialize_3();
               GL11.glTranslatef(var49, var50, 0.0F);
               GL11.glScalef(var7, var7, 1.0F);
               GL11.glTranslatef(-var49, -var50, 0.0F);
               var25 = var16 - var9 * 2;
               float var26 = (var25 - var10) / 2.0F;
               float var27 = var14 + var9;
               float var28 = var15 + var9 + var26;
               float var29 = var10 * var22;
               float var30 = var27 + var10 / 2.0F - var29 / 2.0F;
               float var31 = var28 + var10 / 2.0F - var29 / 2.0F;
               float var32 = Math.min(var13, var29 / 2.0F);
               if (var6) {
                  RenderUtil28.render(var30, var31, var29, var29, var32, new Color(80, 80, 80, 200));
                  if (var5 != null) {
                     break label107;
                  }
               }

               NetworkPlayerInfo var33 = BreezeClient.CONST_A.getNetHandler() != null
                  ? BreezeClient.CONST_A.getNetHandler().getPlayerInfo(this.entityPlayer_r.getUniqueID())
                  : null;
               if (var33 != null) {
                  this.networkPlayerInfo_v = var33;
               }

               NetworkPlayerInfo var34 = var33 != null ? var33 : this.networkPlayerInfo_v;
               if (var34 != null) {
                  RenderUtil28.initialize_4(var34, var30, var31, var29, var32);
               }
            }

            int var36;
            String var38;
            int var40;
            int var41;
            int var51;
            var51 = (int)var14 + var9 + var10 + var9;
            float var52 = (var25 - this.calculate_4()) / 2.0F;
            int var35 = (int)var15 + var9 + (int)var52;
            var36 = var35 + var8.fieldInt_k + var12;
            Serializable var37 = String.valueOf(Math.round(var19));
            var38 = RenderUtil18_x.SECONDARY + var37 + RenderUtil18_x.RESET;
            int var39 = var8.dataBuilder46_j.clamp_8(var38);
            var8.dataBuilder46_j
               .calculate(var51, var35, RenderUtil18_x.ACCENT + RenderUtil18_x.GLOW.toString() + var18 + RenderUtil18_x.RESET, Color.WHITE, false);
            var40 = 5 * var8.fieldInt_l;
            var41 = var17 - var40 - var39;
            float var42 = var13 * 0.5F;
            float var43 = var41 * var21;
            RenderUtil28.render(var51, var36, var41, var11, var42, new Color(0, 0, 0, 110));
            label80:
            if (var43 >= 1.0F) {
               float var44 = Math.min(var42, var43 / 2.0F);
               Color var45 = getColor(var21);
               if (this.glowBarSetting.getObject_m()) {
                  float var46 = 0.55F + 0.45F * (float)Math.sin(System.currentTimeMillis() / 600.0);
                  float var47 = 2.0F + 1.5F * var46;
                  Color var48 = new Color(var45.getRed(), var45.getGreen(), var45.getBlue(), (int)(100.0F + 110.0F * var46));
                  RenderUtil28.calculate_3(var51, var36, var43, var11, var44, var45, var47, var48);
                  if (var5 != null) {
                     break label80;
                  }
               }

               RenderUtil28.render(var51, var36, var43, var11, var44, var45);
            }

            int var53 = var51 + var41 + var40;
            int var54 = var36 + (var11 - var8.fieldInt_k) / 2;
            var8.dataBuilder46_j.calculate(var53, var54, var38, Color.WHITE, false);
            var8.initialize_4();
         }
      }
   }

   private static Color getColor(float var0) {
      long var1 = 115017434233184L;
      if (var0 >= 0.5F) {
         float var4 = (var0 - 0.5F) * 2.0F;
         return new Color((int)calculateFloat_3(255.0F, 50.0F, var4), (int)calculateFloat_3(200.0F, 220.0F, var4), (int)calculateFloat_3(0.0F, 70.0F, var4));
      } else {
         float var3 = var0 * 2.0F;
         return new Color(255, (int)calculateFloat_3(50.0F, 200.0F, var3), 0);
      }
   }

   private static float calculateFloat_3(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   static {
      long var0 = 70627964479794L;
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
      String var6 = "Öú¢9Ö|@ö\u0012aÊ&µ6¨À\u0010S)\u00902\u000fN\u008a\u001c_ìË=²K\u007fµ r\u0086\u0003ñ\u001aDá\u0084Ý\t\u0083&ì\u0099ÑòapG¯&»Ù\u0091úÚèQT0\r}`r\u001bÂ@t\n×ê\u008d\u0088\u0005=Ü;\u009a\u0010^\u0017jncÂ\u009a\u008e\u0003\u001f3\u0094\u0096r× \u0006\u0003Myß\"JtÏOzHE\u000f>{\u0089Æ97Pã\\½¬î\u0019\u0016¶\u0089\u00183\u0017§wº¡É\u0098±?Dn¼\u0015à±¶\u008bêÅh/Àüi5\u0001ù\u00ad\u0080\u0094îh\u0010\u0012\u0083÷dK¥ÊU\u0090\u0003sÐ\u0015X&\u0091 ¶ã§\u001c9{\u008bTd}zþó\u0007Þ\u0091|Évó\u0081\u0082 íP\u0010Yÿ\u0088â¦F`¦\u008atqG\u0015PMë\u008a£ \u0082GÑ\u00807vú.Æç²\r+µ¬(Ý\u000b¥\u0082\u0016ðº\u0016\u009dKÉ#\u0014\"Sê\u007f\t\rI)c)\u0096áñ%[\u001d\u0094Àp\u000f®\u0080\u001bÓ¤»¯Ò\"\u0084\u0080D\rÈÀ%°Å8ÀOkV\u0010¤6¾wkÆ+\u00adÞ°\u0096";
      int var7 = "Öú¢9Ö|@ö\u0012aÊ&µ6¨À\u0010S)\u00902\u000fN\u008a\u001c_ìË=²K\u007fµ r\u0086\u0003ñ\u001aDá\u0084Ý\t\u0083&ì\u0099ÑòapG¯&»Ù\u0091úÚèQT0\r}`r\u001bÂ@t\n×ê\u008d\u0088\u0005=Ü;\u009a\u0010^\u0017jncÂ\u009a\u008e\u0003\u001f3\u0094\u0096r× \u0006\u0003Myß\"JtÏOzHE\u000f>{\u0089Æ97Pã\\½¬î\u0019\u0016¶\u0089\u00183\u0017§wº¡É\u0098±?Dn¼\u0015à±¶\u008bêÅh/Àüi5\u0001ù\u00ad\u0080\u0094îh\u0010\u0012\u0083÷dK¥ÊU\u0090\u0003sÐ\u0015X&\u0091 ¶ã§\u001c9{\u008bTd}zþó\u0007Þ\u0091|Évó\u0081\u0082 íP\u0010Yÿ\u0088â¦F`¦\u008atqG\u0015PMë\u008a£ \u0082GÑ\u00807vú.Æç²\r+µ¬(Ý\u000b¥\u0082\u0016ðº\u0016\u009dKÉ#\u0014\"Sê\u007f\t\rI)c)\u0096áñ%[\u001d\u0094Àp\u000f®\u0080\u001bÓ¤»¯Ò\"\u0084\u0080D\rÈÀ%°Å8ÀOkV\u0010¤6¾wkÆ+\u00adÞ°\u0096"
         .length();
      char var8 = 16;
      int var34 = -1;

      label73:
      while (true) {
         String var36 = var6.substring(++var34, var34 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var36.getBytes("ISO-8859-1"));
            String var52 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var52;
                  if ((var34 += var8) >= var7) {
                     CONST_S = var4;
                     CONST_T = new String[9];
                     short var38 = 28869;
                     long var45 = 6807816271834074524L ^ var0;
                     CONST_O = "Notch";
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
                     String var15 = "5úþ¬W,5\u0097\u001d&À±\u0015·\u00102³C\u009eìáß7¹";
                     int var16 = "5úþ¬W,5\u0097\u001d&À±\u0015·\u00102³C\u009eìáß7¹".length();
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
                        byte var60 = -1;
                        var13[var10001] = var10004;
                     } while (var17 < var16);

                     CONST_L = (int)var13[0];
                     CONST_M = (int)var13[2];
                     CONST_N = (int)var13[1];
                     CONST_X = new HashMap(13);
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
                     String var26 = "\u008cï\u0087\nPôq\u0003ÇÙà\u009cÇ.òQ";
                     int var27 = "\u008cï\u0087\nPôq\u0003ÇÙà\u009cÇ.òQ".length();
                     byte var28 = 0;

                     label44:
                     while (true) {
                        int var48 = var28;
                        var28 += 8;
                        byte[] var29 = var26.substring(var48, var28).getBytes("ISO-8859-1");
                        long[] var41 = var24;
                        var48 = var25++;
                        long var57 = (var29[0] & 255L) << 56
                           | (var29[1] & 255L) << 48
                           | (var29[2] & 255L) << 40
                           | (var29[3] & 255L) << 32
                           | (var29[4] & 255L) << 24
                           | (var29[5] & 255L) << 16
                           | (var29[6] & 255L) << 8
                           | var29[7] & 255L;
                        byte var62 = -1;

                        while (true) {
                           long var30 = var57;
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
                           long var65 = (var32[0] & 255L) << 56
                              | (var32[1] & 255L) << 48
                              | (var32[2] & 255L) << 40
                              | (var32[3] & 255L) << 32
                              | (var32[4] & 255L) << 24
                              | (var32[5] & 255L) << 16
                              | (var32[6] & 255L) << 8
                              | var32[7] & 255L;
                           switch (var62) {
                              case 0:
                                 var41[var48] = var65;
                                 if (var28 >= var27) {
                                    CONST_V = var24;
                                    CONST_W = new Long[4];
                                    450L = ((String)null);
                                    return;
                                 }
                                 break;
                              default:
                                 var41[var48] = var65;
                                 if (var28 < var27) {
                                    continue label44;
                                 }

                                 var26 = "rÞÀ©%`QTS\u008bEÕ¦\u0002¼Ô";
                                 var27 = "rÞÀ©%`QTS\u008bEÕ¦\u0002¼Ô".length();
                                 var28 = 0;
                           }

                           byte var50 = var28;
                           var28 += 8;
                           var29 = var26.substring(var50, var28).getBytes("ISO-8859-1");
                           var41 = var24;
                           var48 = var25++;
                           var57 = (var29[0] & 255L) << 56
                              | (var29[1] & 255L) << 48
                              | (var29[2] & 255L) << 40
                              | (var29[3] & 255L) << 32
                              | (var29[4] & 255L) << 24
                              | (var29[5] & 255L) << 16
                              | (var29[6] & 255L) << 8
                              | var29[7] & 255L;
                           var62 = 0;
                        }
                     }
                  }

                  var8 = var6.charAt(var34);
                  break;
               default:
                  var4[var5++] = var52;
                  if ((var34 += var8) < var7) {
                     var8 = var6.charAt(var34);
                     continue label73;
                  }

                  var6 = "J\u0014[\u009càU\u00ad\u009eÎ\u0011\u0001më%ö³©\u0012\u0019\u0018\u00920\t:\u008faH\u0011àUß9Ràë¤ùDq\u009bÞ½Ì(?Ãe\u00ad<Ý\u000f\u0014®Là>Óº`\u0095X¦\u0004õ~\u008ey\u0093\f¿âÂ\u0010Ò]\u0005z/GGå\u001aX½¾\u0005gV\u00ad";
                  var7 = "J\u0014[\u009càU\u00ad\u009eÎ\u0011\u0001më%ö³©\u0012\u0019\u0018\u00920\t:\u008faH\u0011àUß9Ràë¤ùDq\u009bÞ½Ì(?Ãe\u00ad<Ý\u000f\u0014®Là>Óº`\u0095X¦\u0004õ~\u008ey\u0093\f¿âÂ\u0010Ò]\u0005z/GGå\u001aX½¾\u0005gV\u00ad"
                     .length();
                  var8 = 'H';
                  var34 = -1;
            }

            var36 = var6.substring(++var34, var34 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11230;
      if (CONST_T[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_U.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_U.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dC", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_S[var3].getBytes("ISO-8859-1");
         CONST_T[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_T[var3];
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
         throw new RuntimeException("rip/breeze/client/dC" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31921;
      if (CONST_W[var3] == null) {
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
         long var5 = CONST_V[var3];
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
         Object[] var9 = (Object[])CONST_X.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_X.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/dC", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_W[var3] = var14;
      }

      return CONST_W[var3];
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
         throw new RuntimeException("rip/breeze/client/dC" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
