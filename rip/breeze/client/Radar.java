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
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.RenderUtil1;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "Radar", b = "Draws small indicators pointing to your enemies around your crosshair. ", d = rip.breeze.ModuleCategory.VISUAL)
public class Radar extends BreezeModule {
   private final GenericSetting<EnumType10> modeSetting;
   private final GenericSetting<Integer> rangeSetting;
   private final GenericSetting<rip.breeze.BreezeColor> colorSetting;
   private final GenericSetting<Boolean> teamColorsSetting;
   private final GenericSetting<Boolean> onlyOffScreenSetting;
   private final GenericSetting<Integer> tiltSetting;
   private final GenericSetting<Integer> radiusSetting;
   private final GenericSetting<Integer> sizeSetting;
   private static final String[] CONST_W;
   private static final String[] CONST_X;
   private static final Map CONST_Y = new HashMap(13);
   private static final long eka_1;

   public Radar() {
      long var1 = 90789555478615L;
      super();
      short var10002 = 25095;
      long var10003 = 4381531273386287968L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Mode");
      var10002 = 6969;
      var10003 = 9190686631003200083L ^ var1;
      this.modeSetting = var10001.getDataBuilder50_3("The type of radar to render.").getDataBuilder50_4(EnumType10.ARROW).getDataBuilder54();
      var10002 = 6074;
      var10003 = 6807651723806086879L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Range");
      var10002 = 12530;
      var10003 = 4148381585997246878L ^ var1;
      this.rangeSetting = var10001.getDataBuilder50_3("The maximum range players can be shown on the radar.")
         .getDataBuilder50_4(60)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(10, 100))
         .getDataBuilder54();
      var10002 = 30158;
      var10003 = 7021067981077804193L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Color");
      var10002 = 2296;
      var10003 = 8127237837240207766L ^ var1;
      this.colorSetting = var10001.getDataBuilder50_3("The color of the radar.")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(230, 34, 100))
         .getDataBuilder54();
      var10002 = 11270;
      var10003 = 5823465567651605856L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "TeamColors");
      var10002 = 7331;
      var10003 = 4791728416901078466L ^ var1;
      this.teamColorsSetting = var10001.getDataBuilder50_3("Draws the tracers for enemies assigned to a team in the corresponding team color.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      var10002 = 31773;
      var10003 = 7727807778440412533L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "OnlyOffScreen");
      var10002 = 1451;
      var10003 = 3611794159733769414L ^ var1;
      this.onlyOffScreenSetting = var10001.getDataBuilder50_3("Only show players that are off screen on the radar.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      var10002 = 23004;
      var10003 = 4397229567918463160L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Tilt");
      var10002 = 12260;
      var10003 = 171935609381858959L ^ var1;
      this.tiltSetting = var10001.getDataBuilder50_3("The amount of tilt on the radar, in degrees.")
         .getDataBuilder50_4(45)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(20, 90))
         .getDataBuilder54();
      var10002 = 24061;
      var10003 = 7452925819180702877L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Radius");
      var10002 = 25523;
      var10003 = 2244048488327340753L ^ var1;
      this.radiusSetting = var10001.getDataBuilder50_3("How big the radar should be.")
         .getDataBuilder50_4(45)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(10, 200))
         .getDataBuilder54();
      var10002 = 9648;
      var10003 = 8390740041124455641L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Size");
      var10002 = 22237;
      var10003 = 3089990946158598078L ^ var1;
      this.sizeSetting = var10001.getDataBuilder50_3("The size of each pointer on the radar.")
         .getDataBuilder50_4(10)
         .clamp(rip.breeze.RenderUtil27.getPredicate_2(5, 25))
         .getDataBuilder54();
   }

   @EventListener
   public void clamp(Render2DEventEvent var1) {
      long var2 = 119948627779811L;
      if (!(BreezeClient.CONST_A.getRenderViewEntity().rotationPitch < 0.0F) || this.tiltSetting.getObject_m() < 90) {
         float var4 = Math.max(0.0F, Math.min(90.0F - BreezeClient.CONST_A.getRenderManager().playerViewX, this.tiltSetting.getObject_m().intValue()));
         int var5 = BreezeClient.CONST_A.displayWidth / 2;
         int var6 = BreezeClient.CONST_A.displayHeight / 2;
         GL11.glPushMatrix();
         GL11.glPushAttrib((int)1410245381996937215L);
         GL11.glDisable(3553);
         GL11.glEnable(2848);
         GlStateManager.enableBlend();
         GlStateManager.enableAlpha();
         GL11.glBlendFunc(770, 771);
         BreezeClient.CONST_A.theWorld.playerEntities.stream().filter(this::lambda$onRender2D_Inner0).forEach(this::lambda$onRender2D_Inner1);
         GL11.glEnable(3553);
         GlStateManager.disableAlpha();
         GlStateManager.disableBlend();
         GL11.glDisable(2848);
         GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glPopAttrib();
         GL11.glPopMatrix();
      }
   }

   private float calcAngle(EntityLivingBase var1) {
      float var2 = MinecraftAccessor.getTimer(BreezeClient.CONST_A).renderPartialTicks;
      double var3 = var1.posX
         + (var1.posX - var1.lastTickPosX) * var2
         - (
            BreezeClient.CONST_A.getRenderViewEntity().posX
               + (BreezeClient.CONST_A.getRenderViewEntity().posX - BreezeClient.CONST_A.getRenderViewEntity().lastTickPosX) * var2
         );
      double var5 = var1.posZ
         + (var1.posZ - var1.lastTickPosZ) * var2
         - (
            BreezeClient.CONST_A.getRenderViewEntity().posZ
               + (BreezeClient.CONST_A.getRenderViewEntity().posZ - BreezeClient.CONST_A.getRenderViewEntity().lastTickPosZ) * var2
         );
      return (float)(-(Math.atan2(var3, var5) * (float) (180.0 / Math.PI)));
   }

   private void calculate(int var1, int var2, float var3, EntityPlayer var4) {
      float var5 = this.calcAngle(var4) - BreezeClient.CONST_A.getRenderManager().playerViewY;
      GL11.glTranslatef(var1, var2, 0.0F);
      GL11.glRotatef(var3, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var5, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(-var1, -var2, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.02F);
      this.calculate_2(var1, var2 - this.radiusSetting.getObject_m() * 2, this.sizeSetting.getObject_m() * 2, this.getDistance(var4));
      GL11.glTranslatef(var1, var2, 0.0F);
      GL11.glRotatef(-var5, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(-var3, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(-var1, -var2, 0.0F);
   }

   private void calculate_2(float var1, float var2, float var3, Color var4) {
      if (this.modeSetting.isValid(EnumType10.SIMPLE)) {
         GL11.glPushMatrix();
         GL11.glLineWidth(1.0F);
         GL11.glColor4f(var4.getRed() / 255.0F, var4.getGreen() / 255.0F, var4.getBlue() / 255.0F, var4.getAlpha() / 255.0F);
         GL11.glBegin(3);
         GL11.glVertex2d(var1, var2 + var3);
         GL11.glVertex2d(var1 + var3 / 2.0F, var2);
         GL11.glVertex2d(var1 + var3, var2 + var3);
         GL11.glEnd();
         GL11.glPopMatrix();
      } else {
         GL11.glPushMatrix();
         GL11.glColor4f(var4.getRed() / 255.0F, var4.getGreen() / 255.0F, var4.getBlue() / 255.0F, var4.getAlpha() / 255.0F);
         GL11.glBegin(6);
         GL11.glVertex2d(var1, var2);
         GL11.glVertex2d(var1 - var3 / 2.0F, var2 + var3);
         GL11.glVertex2d(var1, var2 + var3 / 1.5);
         GL11.glVertex2d(var1 + var3 / 2.0F, var2 + var3);
         GL11.glVertex2d(var1, var2);
         GL11.glEnd();
         GL11.glPopMatrix();
      }
   }

   private Color getDistance(EntityPlayer var1) {
      Color var2 = BreezeClient.getAltManager().getColor(var1, this.teamColorsSetting.getObject_m());
      if (var2 == null) {
         var2 = this.colorSetting.getObject_m();
      }

      return RenderUtil1.getColor_7(
         var2,
         (int)(
            255.0F
               - 255.0F
                  * Math.min(1.0F, Math.max(0.0F, BreezeClient.CONST_A.thePlayer.getDistanceToEntity(var1) - 10.0F) / (this.rangeSetting.getObject_m() - 10))
         )
      );
   }

   private void lambda$onRender2D_Inner1(int var1, int var2, float var3, EntityPlayer var4) {
      this.calculate(var1, var2, var3, var4);
   }

   private boolean lambda$onRender2D_Inner0(EntityPlayer var1) {
      return AntiBot.isInvisible_2(var1)
         && var1.getDistanceToEntity(BreezeClient.CONST_A.thePlayer) < this.rangeSetting.getObject_m().intValue()
         && (!this.onlyOffScreenSetting.getObject_m() || !RenderUtil31.getHitbox(var1));
   }

   static {
      long var0 = 53723007089260L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[16];
      int var5 = 0;
      String var6 = "J\u0088²Ãw«J8L\u000b&Y\u0091·à¯\u0010\u0086¾I¸f¤²Ë\u000bRlÌ#B¦r\u0010sH\u0002È0¼\u0011vÃÓ5üüu¦Ä ¬¨ÔÒ¦/÷Ó§eU¯ôv\u0096yéÝ\u0096\u0096§µZ\u0012\u0004A«è]_2ê\u00800\u0098ì\u000e¯âe\u0084Qß«\bÔ}Yx£$\u001cp\u0011´L·\u0015HN\u0018K:I(\u0003ao4Nôxlóh»h\u0013?b&\u0002)\bRù6Ãß\u0081E\u0018'tæç¬\u0018FÇ\u0019aw7ó]\u0097bqÝ>°¦âÂJ\u000f5÷\u008ei=c²ä\"¡è\u0003Ó.b\u001a ª\u001a\u0099xÌ`)§\u0003\u0081ZÈ\u001fày\u001bIw#_\u001e\\\u007f\u0084¶í.\u0010\u0088¿v\u00adÃÓkâÂÔL¤eÆ¢J8F\u0093m6>Ù\u0096-Ì\u0081J\u009eô\u0085Ö`Ë\u001ab»t \u0006e:\u000e¥Ê6\u0000Z\u001d×!»/\"\n±\u008e±3¤ÉS:Ëc\u0097²Þ\tVÞ\u008ed0/u\u0013yTÌZ<Dïµ\u0000ã÷ú\u0005g\u0017'9¬ûú\u0089\u008c\u0087åáF[üëBo}2£\u0010H<»ýmñ\u0083\u008a-§X\u00adn8Bq|^\u0090ù\r$\u0013\u0013\u0017ö\u000e/;J-\u000fÙ¡\b\n\u0097Rª&\u0098&\u001a\u007f\u0099vîÑUVÑ\u0099<ZsÎ\t\u0011ÇÐ\rrä\\Ì\u0018«\u0010å{U\u001aq\r\b ÌR©Ä¤º÷<C¶p\u009dÇBb~»Ð\u0001¼\u0096ÜÀ`\u000bµs\u009fÐ£-ÄL>z¯\u0012o\u0013\r\u0084C\u000b\u0096)K\f/´§~\u0084º;UíüÞ\u008añß\u0097Óws\u0004O\r¹yg\u0006È\u000b\u008eY/ªÇ\u0003ZêöàÂ\"ìXiuîÿ¼Tî\t\rN_|\u0098f8<ÈJ?°ZPMöbÌ$làC:\u0093\u0010\u0097æ\u0083¨kX\u008b61²¨R\u0091¼å\u0001(xàî&O\u0000\"Îî\u008aEvcó@vj.\u0094G\u000bR\u000e×\u008f»> \u0088=aÍ¢`)\u0096!û÷ó\u0010\u0094¢iÁ:³~~Á¸#?¿$\f> \u001f\u0012\u001bn-\u0083ç\u00122éóe5u0&y\u0094&\u0092q#Ru\u0018ë+\u001e\u0012¡gx";
      int var7 = "J\u0088²Ãw«J8L\u000b&Y\u0091·à¯\u0010\u0086¾I¸f¤²Ë\u000bRlÌ#B¦r\u0010sH\u0002È0¼\u0011vÃÓ5üüu¦Ä ¬¨ÔÒ¦/÷Ó§eU¯ôv\u0096yéÝ\u0096\u0096§µZ\u0012\u0004A«è]_2ê\u00800\u0098ì\u000e¯âe\u0084Qß«\bÔ}Yx£$\u001cp\u0011´L·\u0015HN\u0018K:I(\u0003ao4Nôxlóh»h\u0013?b&\u0002)\bRù6Ãß\u0081E\u0018'tæç¬\u0018FÇ\u0019aw7ó]\u0097bqÝ>°¦âÂJ\u000f5÷\u008ei=c²ä\"¡è\u0003Ó.b\u001a ª\u001a\u0099xÌ`)§\u0003\u0081ZÈ\u001fày\u001bIw#_\u001e\\\u007f\u0084¶í.\u0010\u0088¿v\u00adÃÓkâÂÔL¤eÆ¢J8F\u0093m6>Ù\u0096-Ì\u0081J\u009eô\u0085Ö`Ë\u001ab»t \u0006e:\u000e¥Ê6\u0000Z\u001d×!»/\"\n±\u008e±3¤ÉS:Ëc\u0097²Þ\tVÞ\u008ed0/u\u0013yTÌZ<Dïµ\u0000ã÷ú\u0005g\u0017'9¬ûú\u0089\u008c\u0087åáF[üëBo}2£\u0010H<»ýmñ\u0083\u008a-§X\u00adn8Bq|^\u0090ù\r$\u0013\u0013\u0017ö\u000e/;J-\u000fÙ¡\b\n\u0097Rª&\u0098&\u001a\u007f\u0099vîÑUVÑ\u0099<ZsÎ\t\u0011ÇÐ\rrä\\Ì\u0018«\u0010å{U\u001aq\r\b ÌR©Ä¤º÷<C¶p\u009dÇBb~»Ð\u0001¼\u0096ÜÀ`\u000bµs\u009fÐ£-ÄL>z¯\u0012o\u0013\r\u0084C\u000b\u0096)K\f/´§~\u0084º;UíüÞ\u008añß\u0097Óws\u0004O\r¹yg\u0006È\u000b\u008eY/ªÇ\u0003ZêöàÂ\"ìXiuîÿ¼Tî\t\rN_|\u0098f8<ÈJ?°ZPMöbÌ$làC:\u0093\u0010\u0097æ\u0083¨kX\u008b61²¨R\u0091¼å\u0001(xàî&O\u0000\"Îî\u008aEvcó@vj.\u0094G\u000bR\u000e×\u008f»> \u0088=aÍ¢`)\u0096!û÷ó\u0010\u0094¢iÁ:³~~Á¸#?¿$\f> \u001f\u0012\u001bn-\u0083ç\u00122éóe5u0&y\u0094&\u0092q#Ru\u0018ë+\u001e\u0012¡gx"
         .length();
      char var8 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var6.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var26;
                  if ((var17 += var8) >= var7) {
                     CONST_W = var4;
                     CONST_X = new String[16];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 6542292369295292110L;
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
                     long var30 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = -1;
                     1410245381996937215L = var30;
                     return;
                  }

                  var8 = var6.charAt(var17);
                  break;
               default:
                  var4[var5++] = var26;
                  if ((var17 += var8) < var7) {
                     var8 = var6.charAt(var17);
                     continue label37;
                  }

                  var6 = "\u0083\u0086%\u008b°ÓééâfSã/FÙ\u009a.AÒì!\u008b\u0090»j¼\u0019dÉ\u0015¤ßl\u0084\u0014\"\u0080vO\u0013D\u009cûÆ\u009d\tµâ:4b\\+®o\u0005@C\u008cýñry9\u0087¸Iç\u001bOwÅ©lC0¢ÌÕN8;ýìÝsÕÕál¡\u0083\u0084Äß\u0081\u009535¯~È[n\u009a\u0003I`{à\u0000ì õÅæâ©¼PÇ\u0010ögøA.\nÞ¶þF\u0092[SA±";
                  var7 = "\u0083\u0086%\u008b°ÓééâfSã/FÙ\u009a.AÒì!\u008b\u0090»j¼\u0019dÉ\u0015¤ßl\u0084\u0014\"\u0080vO\u0013D\u009cûÆ\u009d\tµâ:4b\\+®o\u0005@C\u008cýñry9\u0087¸Iç\u001bOwÅ©lC0¢ÌÕN8;ýìÝsÕÕál¡\u0083\u0084Äß\u0081\u009535¯~È[n\u009a\u0003I`{à\u0000ì õÅæâ©¼PÇ\u0010ögøA.\nÞ¶þF\u0092[SA±"
                     .length();
                  var8 = 'P';
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8498;
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
            throw new RuntimeException("rip/breeze/client/ea", var10);
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
         throw new RuntimeException("rip/breeze/client/ea" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
