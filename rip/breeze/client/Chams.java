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
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.RenderUtil1;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "Chams", b = "Draws entities through walls.", d = rip.breeze.ModuleCategory.VISUAL)
public class Chams extends BreezeModule {
   private final GenericSetting<Boolean> teamColorsSetting;
   private final GenericSetting<rip.breeze.BreezeColor> hiddenColorSetting;
   private final GenericSetting<Boolean> visibleSetting;
   private final GenericSetting<rip.breeze.BreezeColor> visibleColorSetting;
   private static final String[] CONST_S;
   private static final String[] CONST_T;
   private static final Map CONST_U = new HashMap(13);
   private static final long eka_1;

   public Chams() {
      long var1 = 112637254374577L;
      super();
      short var10002 = 21107;
      long var10003 = 3573571083360920229L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "TeamColors");
      var10002 = 23082;
      var10003 = 8810344376963328758L ^ var1;
      this.teamColorsSetting = var10001.getDataBuilder50_3("Use the player their team color if found.").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 26364;
      var10003 = 5822092779003106856L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "HiddenColor");
      var10002 = 25777;
      var10003 = 1343647431009555554L ^ var1;
      this.hiddenColorSetting = var10001.getDataBuilder50_3("The color of the player when they are hidden")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(41, 84, 119, 147))
         .getDataBuilder50_8()
         .getDataBuilder54();
      var10002 = 10781;
      var10003 = 4422366302860221133L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Visible");
      var10002 = 30693;
      var10003 = 3125633956156720946L ^ var1;
      this.visibleSetting = var10001.getDataBuilder50_3("Whether or not to render the player when they are visible")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      var10002 = 13949;
      var10003 = 5523022792226965160L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "VisibleColor");
      var10002 = 13523;
      var10003 = 1100907221084079105L ^ var1;
      this.visibleColorSetting = var10001.getDataBuilder50_3("The color of the player when they are visible")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(183, 46, 46, 131))
         .getDataBuilder50_8()
         .getDataBuilder50_9(Chams::lambda$new_Inner0)
         .getDataBuilder54();
   }

   @EventListener
   public void processNullable(PreTickEventEvent var1) {
      if (BreezeClient.CONST_A.theWorld != null && BreezeClient.CONST_A.thePlayer != null) {
         BreezeClient.CONST_A.theWorld.playerEntities.sort(Chams::lambda$onTick_Inner1);
      }
   }

   @EventListener
   public void processNullable_2(RenderEntityEventEvent var1) {
      long var2 = 22878214740248L;
      if (!BreezeContext.moduleBase_a.getModuleByClass(ShaderESP.class).isBool_E()) {
         boolean var4 = false;
         boolean var5 = false;
         if (this.checkCondition(var1.entity_i)) {
            GlStateManager.pushMatrix();
            GlStateManager.pushAttrib();
            GL11.glPushAttrib((int)3409683208110866431L);
            GlStateManager.enableBlend();
            GL11.glEnable(3042);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            if (var5) {
               GlStateManager.disableLighting();
            }

            if (!var4) {
               if (var1.modelBase_h instanceof ModelPlayer) {
                  ModelPlayer var12 = (ModelPlayer)var1.modelBase_h;
                  var6 = var12.bipedLeftArmwear.showModel;
                  var7 = var12.bipedRightArmwear.showModel;
                  var8 = var12.bipedLeftLegwear.showModel;
                  var9 = var12.bipedRightLegwear.showModel;
                  var10 = var12.bipedBodyWear.showModel;
                  var11 = var12.bipedHeadwear.showModel;
                  var12.bipedLeftArmwear.showModel = false;
                  var12.bipedRightArmwear.showModel = false;
                  var12.bipedLeftLegwear.showModel = false;
                  var12.bipedRightLegwear.showModel = false;
                  var12.bipedBodyWear.showModel = false;
                  var12.bipedHeadwear.showModel = false;
               }

               GlStateManager.disableTexture2D();
            }

            GL11.glPolygonMode(1032, 6914);
            GlStateManager.depthMask(false);
            GL11.glDepthFunc(518);
            Color var15 = BreezeClient.getAltManager().getColor((EntityPlayer)var1.entity_i, this.teamColorsSetting.getObject_m());
            Color var13 = this.hiddenColorSetting.getObject_m();
            if (var15 != null) {
               var13 = RenderUtil1.getColor_7(var15, var13.getAlpha());
            }

            RenderUtil31.calculate(var13);
            GL11.glLineWidth(2.0F);
            var1.processAll();
            if (this.visibleSetting.getObject_m()) {
               GlStateManager.depthMask(true);
               var1.a();
               GL11.glDepthFunc(515);
               var13 = this.visibleColorSetting.getObject_m();
               if (var15 != null) {
                  var13 = RenderUtil1.getColor_7(var15, var13.getAlpha());
               }

               RenderUtil31.calculate(var13);
               var1.processAll();
            }

            GL11.glDepthFunc(513);
            if (!var4) {
               GlStateManager.enableTexture2D();
               if (var1.modelBase_h instanceof ModelPlayer) {
                  ModelPlayer var14 = (ModelPlayer)var1.modelBase_h;
                  var14.bipedLeftArmwear.showModel = var6;
                  var14.bipedRightArmwear.showModel = var7;
                  var14.bipedLeftLegwear.showModel = var8;
                  var14.bipedRightLegwear.showModel = var9;
                  var14.bipedBodyWear.showModel = var10;
                  var14.bipedHeadwear.showModel = var11;
               }
            }

            if (var5) {
               GlStateManager.enableLighting();
            }

            RenderUtil31.calculate(Color.WHITE);
            GlStateManager.depthMask(true);
            GlStateManager.disableBlend();
            GL11.glPopAttrib();
            GlStateManager.popAttrib();
            GlStateManager.popMatrix();
         }
      }
   }

   private boolean checkCondition(Entity var1) {
      return BreezeClient.CONST_A.theWorld != null && BreezeClient.CONST_A.thePlayer != null
         ? var1 instanceof EntityPlayer && var1 != BreezeClient.CONST_A.thePlayer
         : false;
   }

   private static int lambda$onTick_Inner1(EntityPlayer var0, EntityPlayer var1) {
      if (var0 == BreezeClient.CONST_A.thePlayer) {
         return -1;
      } else {
         return var1 == BreezeClient.CONST_A.thePlayer
            ? 1
            : Double.compare(BreezeClient.CONST_A.thePlayer.getDistanceSqToEntity(var0), BreezeClient.CONST_A.thePlayer.getDistanceSqToEntity(var1));
      }
   }

   private static boolean lambda$new_Inner0(rip.breeze.DateUtil var0) {
      long var1 = 47438731982352L;
      return var0.getObject("Visible", Boolean.class);
   }

   static {
      long var0 = 95489773616323L;
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
      String var6 = "þ\u0018\u0094ºKøf\u0006Ï2\u001f\u0010\u008aó\u009atü\u0018ãÇÉÅÑ \u0018_FÀÅ\u001d¿\u001f¾E\u009e\u000f·²¸K)\u0091\u0087pÃõÛwÓ ºÞ,Öv0è\u001f\u008a©AËÛ\rg\u0019#©¦Õè\u0080d¯³\u001eTÅ\fK\b±`«Ò\u0012\u0081±\u0005l\n.üõ)ç'á\u0087u ¹oöF\u0092%?l\r.Þ\\Â Ï-Îb\u0006piÞQÓèÕC\u0006\u0084¢Ô>\u0090Õï\u0081.Q²û\u001d\u009cÄ8\u008bµsòÌ{è\u001fÎ\u001eqQûòµíÕ!÷Ìôß\u008e¿\u0091ZD\u0088?Û¨¡ì \u0010ï$G\u0010!\u0004\u008dn\u0082åø@@)\u0099\u0001\u0010iã\u001f\u0091\u0089\u0092\"f¨é\u008da\u008cåáïHì\u0098Í\u009b3z\u008dGetÓf3jæóÀ\nçÇq1\u000e\u0005 ®ôÉð\u0094´\u0000X\u0081\u0005\u0013¦vÇ©ó×\u0090ðF\u0087¬üÚâhxe¨Ùqº7\bå]3§ÿó\u0085-mgÅ<Ä";
      int var7 = "þ\u0018\u0094ºKøf\u0006Ï2\u001f\u0010\u008aó\u009atü\u0018ãÇÉÅÑ \u0018_FÀÅ\u001d¿\u001f¾E\u009e\u000f·²¸K)\u0091\u0087pÃõÛwÓ ºÞ,Öv0è\u001f\u008a©AËÛ\rg\u0019#©¦Õè\u0080d¯³\u001eTÅ\fK\b±`«Ò\u0012\u0081±\u0005l\n.üõ)ç'á\u0087u ¹oöF\u0092%?l\r.Þ\\Â Ï-Îb\u0006piÞQÓèÕC\u0006\u0084¢Ô>\u0090Õï\u0081.Q²û\u001d\u009cÄ8\u008bµsòÌ{è\u001fÎ\u001eqQûòµíÕ!÷Ìôß\u008e¿\u0091ZD\u0088?Û¨¡ì \u0010ï$G\u0010!\u0004\u008dn\u0082åø@@)\u0099\u0001\u0010iã\u001f\u0091\u0089\u0092\"f¨é\u008da\u008cåáïHì\u0098Í\u009b3z\u008dGetÓf3jæóÀ\nçÇq1\u000e\u0005 ®ôÉð\u0094´\u0000X\u0081\u0005\u0013¦vÇ©ó×\u0090ðF\u0087¬üÚâhxe¨Ùqº7\bå]3§ÿó\u0085-mgÅ<Ä"
         .length();
      char var8 = 24;
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
                     CONST_S = var4;
                     CONST_T = new String[9];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = -7144674152532114145L;
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
                     3409683208110866431L = var30;
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

                  var6 = "ºr#´2\u0091\u0090à>Jî\u001cì¡\u00ad\u0086\u00984-q ÑÞ\u0095ÍìÕ\u0017ué`d\u008bÓ\u0098\u001daËt|¬XÄ\u0087\u0017s\u0089èOb¡Òí\u0002g\u000bï\u0001\u008d>\u0085ô\u000bã\u0090Ý¸¦n\u009biHrÜ\u007f\u009f]Æ¹\u008fPÎ}\u0003\u0089æºÄ\u0084\u009döy°\u0086ò3~Òm\u0099H\u0015&óí+vwn\u0011}\u001c\rÞâ&Ó¿bXöZÅ*\u001dC+\u007fb\u001aR\u009b#@Û¬\u00972\u0005,ÖÖ¸[\u008bøüâ\t\u00ade8\u0092\u0016Ò¿\fR\u0017Í\u0088";
                  var7 = "ºr#´2\u0091\u0090à>Jî\u001cì¡\u00ad\u0086\u00984-q ÑÞ\u0095ÍìÕ\u0017ué`d\u008bÓ\u0098\u001daËt|¬XÄ\u0087\u0017s\u0089èOb¡Òí\u0002g\u000bï\u0001\u008d>\u0085ô\u000bã\u0090Ý¸¦n\u009biHrÜ\u007f\u009f]Æ¹\u008fPÎ}\u0003\u0089æºÄ\u0084\u009döy°\u0086ò3~Òm\u0099H\u0015&óí+vwn\u0011}\u001c\rÞâ&Ó¿bXöZÅ*\u001dC+\u007fb\u001aR\u009b#@Û¬\u00972\u0005,ÖÖ¸[\u008bøüâ\t\u00ade8\u0092\u0016Ò¿\fR\u0017Í\u0088"
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9317;
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
            throw new RuntimeException("rip/breeze/client/d4", var10);
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
         throw new RuntimeException("rip/breeze/client/d4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
