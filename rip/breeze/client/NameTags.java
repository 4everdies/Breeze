package rip.breeze.client;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.KeepParameters;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(a = "NameTags", b = "Improves on the vanilla nametags by adding more info.", d = rip.breeze.ModuleCategory.VISUAL)
public class NameTags extends BreezeModule {
   private final GenericSetting<EnumType21> fontSetting;
   private final GenericSetting<Boolean> sizeSetting;
   private final GenericSetting<Double> healthSetting;
   private final GenericSetting<BlockingMode> pingSetting;
   private final GenericSetting<Boolean> backgroundSetting;
   private final GenericSetting<Boolean> backgroundColorSetting;
   private final GenericSetting<rip.breeze.BreezeColor> roundingSetting;
   private final GenericSetting<Double> armorSetting;
   private final GenericSetting<Boolean> durabilitySetting;
   private final GenericSetting<Boolean> enchantsSetting;
   private final GenericSetting<Boolean> dataBuilder54_x;
   private final GenericSetting<Boolean> dataBuilder54_y;
   private final Map<UUID, Float> map_z;
   private long fieldLong_A;
   private static final float CONST_B = 5.5555553F;
   private static final String[] CONST_D;
   private static final String[] CONST_E;
   private static final Map CONST_F = new HashMap(13);
   private static final long[] CONST_G;
   private static final Integer[] CONST_H;
   private static final Map CONST_I;

   public NameTags() {
      long var1 = 21043481255495L;
      super();
      short var10002 = 4842;
      long var10003 = 4736137214175512773L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Font");
      var10002 = 11822;
      var10003 = 9138146635460097031L ^ var1;
      this.fontSetting = var10001.getDataBuilder50_3(
            "Which font to draw the nametags with. HUD follows your HUD font style (which can itself be the ingame font)."
         )
         .getDataBuilder50_4(EnumType21.HUD)
         .getDataBuilder50_10(NameTags::lambda$new_Inner0)
         .getDataBuilder54();
      var10002 = 10154;
      var10003 = 2574947509551512967L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "If a enemies is assigned to a team draw their name in the corresponding team color.");
      var10002 = 30667;
      var10003 = 4120960200006692325L ^ var1;
      this.sizeSetting = var10001.getDataBuilder50_3("Size").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 32134;
      var10003 = 5315192890101688225L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "The size of the name tags.");
      var10002 = 26406;
      var10003 = 3245886265939197200L ^ var1;
      this.healthSetting = var10001.getDataBuilder50_3("Health")
         .getDataBuilder50_4(1.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.5, 2.0))
         .getDataBuilder54();
      var10002 = 3775;
      var10003 = 4196819233229870239L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "How to show health: a number, an animated bar, or both.");
      var10002 = 25704;
      var10003 = 4708568279509302879L ^ var1;
      this.pingSetting = var10001.getDataBuilder50_3("Ping").getDataBuilder50_4(BlockingMode.BOTH).getDataBuilder54();
      var10002 = 9494;
      var10003 = 5453588962683207486L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Show ping next to the name.");
      var10002 = 22672;
      var10003 = 9013558642325668534L ^ var1;
      this.backgroundSetting = var10001.getDataBuilder50_3("Background").getDataBuilder50_4(false).getDataBuilder54();
      var10002 = 870;
      var10003 = 5393217586145073477L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Background for the text part of the nametag.");
      var10002 = 15505;
      var10003 = 2884469812107978413L ^ var1;
      this.backgroundColorSetting = var10001.getDataBuilder50_3("BackgroundColor").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 956;
      var10003 = 3071563065039788428L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "The background color.");
      var10002 = 6797;
      var10003 = 6228618892712411327L ^ var1;
      this.roundingSetting = var10001.getDataBuilder50_3("Rounding")
         .getDataBuilder50_4(new rip.breeze.BreezeColor(0, 0, 0, 140))
         .getDataBuilder50_8()
         .getDataBuilder50_9(NameTags::lambda$new_Inner1)
         .getDataBuilder54();
      var10002 = 21087;
      var10003 = 7997273723912964222L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Armor");
      var10002 = 26458;
      var10003 = 4677020851052871022L ^ var1;
      this.armorSetting = var10001.getDataBuilder50_3("Shows the armor in the nametags.")
         .getDataBuilder50_4(3.0)
         .clamp(rip.breeze.RenderUtil27.getPredicate_4(0.0, 8.0))
         .getDataBuilder50_9(NameTags::lambda$new_Inner2)
         .getDataBuilder54();
      var10002 = 6784;
      var10003 = 1121628940078973090L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Shows the item a player is currently holding in the nametag.");
      var10002 = 29959;
      var10003 = 2027907494750613283L ^ var1;
      this.durabilitySetting = var10001.getDataBuilder50_3("Durability").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 26362;
      var10003 = 6549837498538294479L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Display durability of armor pieces and the held item.");
      var10002 = 957;
      var10003 = 7784236967964514700L ^ var1;
      this.enchantsSetting = var10001.getDataBuilder50_3("Enchants").getDataBuilder50_4(true).getDataBuilder54();
      var10002 = 10455;
      var10003 = 3988828775734981372L ^ var1;
      this.dataBuilder54_x = GenericSetting.<Boolean>getDataBuilder50(this, "Display the enchantments of the held item.")
         .getDataBuilder50_3("Display durability of armor pieces and the held item.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      this.dataBuilder54_y = GenericSetting.<Boolean>getDataBuilder50(this, "Enchants")
         .getDataBuilder50_3("Display the enchantments of the held item.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      this.map_z = new HashMap<>();
   }

   @EventListener
   public void updateRotation(Render2DEventEvent var1) {
      if (BreezeClient.CONST_A.theWorld != null && BreezeClient.CONST_A.thePlayer != null) {
         float var2 = var1.fieldFloat_g;
         Vec3 var3 = BreezeClient.CONST_A.getRenderViewEntity().getPositionEyes(var2);
         double var4 = Math.tan(Math.toRadians(MinecraftAccessor.getFloat_3(BreezeClient.CONST_A.entityRenderer, var2, true) / 2.0));
         long var6 = System.nanoTime();
         float var8 = this.fieldLong_A == 0L ? 0.0F : (float)(var6 - this.fieldLong_A) * 1.0E-9F;
         this.fieldLong_A = var6;
         float var9 = BlockUtil7.clamp(var8 * 6.0F, 0.0F, 1.0F);
         ArrayList var10 = new ArrayList();
         HashSet var11 = new HashSet();

         for (EntityPlayer var13 : new ArrayList(BreezeClient.CONST_A.theWorld.playerEntities)) {
            if (var13 != BreezeClient.CONST_A.thePlayer
               && (!var13.isInvisible() || AntiBot.isInvisible(var13))
               && AntiBot.isInvisible_2(var13)
               && RenderUtil31.getHitbox(var13)) {
               Vec3 var14 = BlockUtil7.getVec3(var13, var2).addVector(0.0, var13.height + (var13.isSneaking() ? 0.1 : 0.3), 0.0);
               double[] var15 = RenderUtil31.vecToArray(var14);
               if (var15 != null) {
                  UUID var16 = var13.getUniqueID();
                  float var17 = BlockUtil7.clamp((var13.getHealth() + var13.getAbsorptionAmount()) / Math.max(1.0F, var13.getMaxHealth()), 0.0F, 1.0F);
                  Float var18 = this.map_z.get(var16);
                  float var19 = var18 == null ? var17 : var18 + (var17 - var18) * var9;
                  this.map_z.put(var16, var19);
                  var11.add(var16);
                  var10.add(new PlayerUtil5(var13, (float)var15[0], (float)var15[1], var3.distanceTo(var14), var19));
               }
            }
         }

         this.map_z.keySet().retainAll(var11);
         if (!var10.isEmpty()) {
            var10.sort(NameTags::lambda$onRender2D_Inner3);
            BreezeContext.iRenderer_b.endFrame();

            try {
               GlStateManager.enableBlend();
               GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
               GlStateManager.enableAlpha();
               GlStateManager.disableDepth();
               GlStateManager.depthMask(false);
               RenderUtil25.initialize();

               for (PlayerUtil5 var24 : var10) {
                  this.clamp_2(var24, var4);
               }

               GlStateManager.disableDepth();
               RenderUtil25.processAll();
            } finally {
               BreezeContext.iRenderer_b.beginFrame();
            }
         }
      }
   }

   @KeepParameters
   public boolean isInvisible(EntityLivingBase var1) {
      if (!this.f()) {
         return false;
      } else if (!(var1 instanceof EntityPlayer)) {
         return false;
      } else if (var1 == BreezeClient.CONST_A.thePlayer) {
         return false;
      } else {
         return var1.isInvisible() && !AntiBot.isInvisible((EntityPlayer)var1) ? false : AntiBot.isInvisible_2((EntityPlayer)var1);
      }
   }

   private float clamp(double var1, double var3) {
      double var5 = 1.0 / (2.0 * var3);
      float var7 = Math.max(0.27F, (float)(var5 / Math.max(var1, 0.1) * 5.0));
      return var7 * this.healthSetting.getObject_m().floatValue() * 5.5555553F;
   }

   private void clamp_2(PlayerUtil5 var1, double var2) {
      EntityPlayer var4 = var1.entityPlayer_a;
      float var5 = this.clamp(var1.double_d, var2);
      Color var6 = BreezeClient.getAltManager().getColor(var4, this.sizeSetting.getObject_m());
      if (var6 == null) {
         var6 = Color.WHITE;
      }

      EnumType21 var7 = this.fontSetting.getObject_m();
      MathUtil2 var8 = RenderUtil25.clamp(var7, 9.0F * var5);
      String var9 = this.buildString(var4);
      float var10 = var8.calculateFloat_3();
      float var11 = var8.calculateFloat_4();
      float var12 = var8.calculateFloat(var9);
      boolean var13 = this.pingSetting.getObject_m() == BlockingMode.BAR || this.pingSetting.getObject_m() == BlockingMode.BOTH;
      float var14 = Math.max(1.0F, var10 * 0.45F);
      float var15 = Math.max(1.0F, var10 * 0.08F);
      float var16 = var12 + var14 * 2.0F;
      float var17 = var10 + var15 * 2.0F;
      float var18 = var1.fieldFloat_b - var16 * 0.5F;
      float var19 = var1.fieldFloat_c - var17;
      List var20 = this.getList(var4);
      float var21 = 16.0F * var5;
      float var22 = 2.0F * var5;
      MathUtil2 var23 = !var20.isEmpty() && this.dataBuilder54_y.getObject_m() ? RenderUtil25.clamp(var7, 6.0F * var5) : null;
      int var24 = 0;
      if (var23 != null) {
         for (ItemStack var26 : var20) {
            var24 = Math.max(var24, this.getValue(var26));
         }
      }

      float var35 = var23 != null && var24 > 0 ? var22 + var24 * var23.calculateFloat_2() : 0.0F;
      float var36 = var20.isEmpty() ? 0.0F : var21 + var35;
      float var27 = var19 - (var36 > 0.0F ? var36 + var22 : 0.0F);
      GlStateManager.disableDepth();
      if (this.backgroundColorSetting.getObject_m()) {
         RenderUtil28.render(var18, var19, var16, var17, (float)(this.armorSetting.getObject_m() * var5), this.roundingSetting.getObject_m());
      }

      Color var28 = new Color(var6.getRed(), var6.getGreen(), var6.getBlue());
      RenderUtil25.processNullable(var8, var1.fieldFloat_b - var12 * 0.5F, var19 + var15 - var11, var9, var28, !this.backgroundColorSetting.getObject_m());
      if (var13) {
         float var29 = Math.max(2.0F, var10 * 0.18F);
         float var30 = var16 * 0.66F;
         float var31 = var1.fieldFloat_b - var30 * 0.5F;
         float var32 = var19 + var17 - var29 * 0.5F;
         float var33 = var29 * 0.4F;
         RenderUtil28.render_1(var31, var32 + var29 / 2.0F, var30, var29 / 2.0F, 0.0F, 0.0F, var33, var33, this.roundingSetting.getObject_m());
         if (var1.fieldFloat_e > 0.0F) {
            float var34 = Math.max(var29, var30 * var1.fieldFloat_e);
            RenderUtil28.render(var31, var32, var34, var29, var33, getColor(var1.fieldFloat_e));
         }
      }

      if (var36 > 0.0F) {
         this.calculate(var20, var1.fieldFloat_b, var27, var5, var23);
      }
   }

   private String buildString(EntityPlayer var1) {
      long var2 = 114022743724116L;
      StringBuilder var4 = new StringBuilder(var1.func_70005_c_());
      if (this.pingSetting.getObject_m() == BlockingMode.TEXT || this.pingSetting.getObject_m() == BlockingMode.BOTH) {
         int var5 = Math.max(0, Math.round(var1.getHealth() + var1.getAbsorptionAmount()));
         var4.append(' ')
            .append(var5 >= 16 ? ChatFormatting.GREEN : (var5 >= 10 ? ChatFormatting.YELLOW : (var5 >= 6 ? ChatFormatting.GOLD : ChatFormatting.RED)))
            .append(var5);
      }

      if (this.backgroundSetting.getObject_m()) {
         NetworkPlayerInfo var7 = BreezeClient.CONST_A.getNetHandler().getPlayerInfo(var1.getUniqueID());
         if (var7 != null) {
            int var6 = var7.getResponseTime();
            var4.append(' ')
               .append(var6 <= 50 ? ChatFormatting.GREEN : (var6 <= 100 ? ChatFormatting.YELLOW : (var6 <= 200 ? ChatFormatting.GOLD : ChatFormatting.RED)))
               .append(var6)
               .append("ms");
         }
      }

      return var4.toString();
   }

   private static Color getColor(float var0) {
      if (var0 > 0.5F) {
         return new Color(80, 220, 90);
      } else {
         return var0 > 0.25F ? new Color(240, 200, 60) : new Color(230, 70, 60);
      }
   }

   private List<ItemStack> getList(EntityPlayer var1) {
      ArrayList var2 = new ArrayList();
      if (this.durabilitySetting.getObject_m()) {
         for (int var3 = 3; var3 >= 0; var3--) {
            ItemStack var4 = var1.getCurrentArmor(var3);
            if (var4 != null) {
               var2.add(var4);
            }
         }
      }

      if (this.enchantsSetting.getObject_m()) {
         ItemStack var5 = var1.getCurrentEquippedItem();
         if (var5 != null) {
            var2.add(var5);
         }
      }

      return var2;
   }

   private void calculate(List<ItemStack> var1, float var2, float var3, float var4, MathUtil2 var5) {
      int var6 = var1.size();
      float var7 = 16.0F * var4;
      float var8 = 2.0F * var4;
      float var9 = var6 * var7 + (var6 - 1) * var8;
      float var10 = var2 - var9 * 0.5F;

      for (ItemStack var12 : var1) {
         boolean var13 = this.dataBuilder54_x.getObject_m() || var12.stackSize > 1;
         RenderUtil28.calculate_12(var12, var10, var3, var7, var13);
         if (var5 != null) {
            this.calculate_2(var5, var12, var10 + var7 * 0.5F, var3 + var7 + var8);
         }

         var10 += var7 + var8;
      }
   }

   private void calculate_2(MathUtil2 var1, ItemStack var2, float var3, float var4) {
      Map var5 = EnchantmentHelper.getEnchantments(var2);
      if (var5 != null && !var5.isEmpty()) {
         float var6 = var1.calculateFloat_2();
         float var7 = var4;

         for (Entry var9 : var5.entrySet()) {
            Enchantment var10 = Enchantment.getEnchantmentById((Integer)var9.getKey());
            if (var10 != null) {
               String var11 = var10.getName();
               int var12 = var11 != null ? var11.lastIndexOf(46) : -1;
               if (var12 >= 0 && var12 < var11.length() - 1) {
                  var11 = var11.substring(var12 + 1);
               }

               Object var13;
               if (var11 != null && !var11.isEmpty()) {
                  if (var11.length() <= 3) {
                     var13 = var11.substring(0, 1).toUpperCase();
                  } else {
                     var13 = "" + Character.toUpperCase(var11.charAt(0)) + Character.toLowerCase(var11.charAt(1));
                  }
               } else {
                  var13 = "E";
               }

               String var14 = var13 + var9.getValue();
               float var15 = var1.calculateFloat(var14);
               RenderUtil25.processNullable(var1, var3 - var15 * 0.5F, var7, var14, new Color(this.getValue_2(var10)), true);
               var7 += var6;
            }
         }
      }
   }

   private int getValue(ItemStack var1) {
      Map var2 = EnchantmentHelper.getEnchantments(var1);
      return var2 == null ? 0 : var2.size();
   }

   private int getValue_2(Enchantment var1) {
      long var2 = 134027670287482L;
      int var4 = var1.effectId;
      switch (var4) {
         case 0:
         case 1:
         case 3:
         case 4:
            return -11162881;
         case 2:
         case 8:
            return 1678270303;
         case 5:
         case 6:
            return 1369273062;
         case 7:
            return -1232345702;
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         default:
            return -1;
         case 16:
         case 17:
         case 18:
            return 907465981;
         case 19:
            return -22016;
         case 20:
            return -30720;
         case 21:
            return -10496;
         case 32:
            return -240790782;
         case 33:
            return 2110898003;
         case 34:
            return 1589538426;
         case 35:
            return -10496;
         case 48:
            return 1700913738;
         case 49:
            return -22016;
         case 50:
            return -30720;
         case 51:
            return -1621553297;
         case 61:
         case 62:
            return 1530529961;
      }
   }

   private static int lambda$onRender2D_Inner3(PlayerUtil5 var0, PlayerUtil5 var1) {
      return Double.compare(var1.double_d, var0.double_d);
   }

   private static boolean lambda$new_Inner2(rip.breeze.DateUtil var0) {
      long var1 = 66156040575357L;
      return var0.getObject("Background", Boolean.class);
   }

   private static boolean lambda$new_Inner1(rip.breeze.DateUtil var0) {
      long var1 = 14510292858784L;
      return var0.getObject("Background", Boolean.class);
   }

   private static void lambda$new_Inner0(EnumType21 var0) {
      RenderUtil25.toggle();
   }

   static {
      long var0 = 107642263721570L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[26];
      int var5 = 0;
      String var6 = "àÃÙÆo\u0093Ë,Ìnÿs9b*ïH1\u009a\u0094<%/\u0015`÷{JaøSµ\u00904É~&O\t\u0018µð¤²\u001a\u00908Õ\u007f\tËE\u0093l<§ý.!\u009d<\u0015î½ [@\u0083?4¾Hý\u0087\u0018µT8\u0085æÍôS\u0089OÈ\u0082òs¤!ËréCÊª8pTYT+¢8Uh\u0012\u0004'U\u000f\u0096®Å W`ûÞ\u009b\u0003×Ð´s\u0087è\u000b?>¿~Ä@\u0080M\u009b\r|\u0002âñËa\u0095\rXÊ#\u0094\u0002RV\u0010ë\u009dÔÞ·\u0093À§\u000eU+ðQ\u009e\u0013;\u0010![U: É¼Á\u0011\\¦\u0084X9Y3\u0018¸¶\u000e\u008d©ô8\u0090âÚrf\u0081\u009b\u009d:\u009c£\u008c\n\u008d\n]\u0095\u0010Õúr\f\rÑ\u000eB\u0013£\u0015°LÙ,$ \u0010\u0083\u0083\u009fÎ¤bþéÅðtÕ]\u0087\u0093[Ô\u0095`S\u0007\u00admÒrnÉ\u0012ÕVÀP°½\u001c4%C\b\u0014\u009eºm\u0015\u0086ì\tj¨çvgçX6¯E²\u009e©¸üg©½ÃÒ\u0095#\u0019öîA²Á<\"\u001d|\u0084Z\u0019ÑV-\u0096\u0090Î\u0002ÓÆ)À\u008f\u0001ÎîØM\u009cS\u009f\\\u0091á2?Á\u001e¥¥\u0083 9\"@\u0099ëNHE\u0005\u0087w¡F\u008d\u0082Ã<\u0099~¬¼íeÍK\u0096\rô\u0093Ef\u0084\u00884\u009b\u008c\f½\u0004\u009cc\u0099±ÕdW\u0085\u001b\u0084\u009b\u000f\u008eËÕ\u0091¥^Í,ÃEéÄ\u0095\u0087\u0018ßñ¶=\u0006{\u0005ë9F=Ø\"òÈK\u0002pn9D\u0086æÿsÿ\u0017V® ²ÂTÚùç+ï\u009e\u0088ÌC½UÎ&Å½\u008d\u0002X\u001eW\u0016)¬ñìµ£¾ßé(WEÆê-ê¸\u000eCü°Ööï[t!Ú-ME\u0092\u0015<J&\\Ø\u000b\b\u0003Ë4\u0099ñr\u0003\bL\u0010d\u007f\u0096ÆÊSGD,ê\\\u001c¶,«q\u0010p1\u0081TÖa`c~ÄhÑ'ÜÚ«¨¯Ú«uPx\u009e\u009e\u0003¤P_\u0007ÃCåªJø\u009b$\u000b\u0086Î\u001fªPÌ\u0090\u0092?\u008f§9\u009a\u00165!yô\u008f°\u000bYùwH©`Ä\u00067s;Ð«ã\u0011\u001dêÁ\u001e\u0091è¢i\fö\u00adîÔ\u0003ë!3\rÐVY\u007f$\u008aç\u0086w\u0084ã\u008b9¸^»\u009aÓ9!»Û\u001e³Ï´\u0014ðÁ¹ï\u0090Ä¡ÏËs\u001e¤§\tMâÊá\u0016´\u0098\u0014Ê¼9¹ÜÆL§\u00854´O@ê¦\u009bÜ\u001e\u0082PÞ!¼5Õ]\u0095\u0010ú\u0086¢W{-í\u0080\u0000~í\u0084ÏîZX\u0004\u007f²ÝÕ\u001cê^\u0093(Å§Ã?ª\u0088\u009aö\u0012³#Ñ,1K\u0003ÉÁ\u0087\u0096`ãê{ÿ\u001c\u0006Ï\u0097x>\u009aúÙä\u009c-ðÇ\u001cc'Ê¾ã\u0015Hè[Üø({¬]Ø¦\u0086óð¿\u0089Íl9ÜÉ÷\u0007\u0015ÎkgÇ\u0003\u00146C \u0094üvïc©\u008d\u0012\u00197Ä´¹Å\u0085G\u0089B\ròd\u00943á-\u0006\b\u007fÊ·ø+`SôÝö4ààzv\u0007\u0013R¬d3½w\u0017m)Ð5jøÑO\u0089©µ\u008eì æûxEÈÍ\u000b\bLª\u0087$\u0006cIçG9%>D76\u009dÍä\u008cÆvÊ¨!e\"_\u0084\bé0?\u0012¥$<#¯¤Ãk¼\u0007^øî³\u0095\u0082\u0004k\u009aÒp«é e[{\\,\u00110\u0016\u0083_\u0092Í\\\u001cÉ³_ã\u001d\u001añh¬4Gd®0\u0000g\u0083g0Üáð®\u008a\u009d\u009b\u0096\u008bBtr-5P\u008fÜ/3KnSû6û°h\u0015\u0096+ ¥\u0088\u0007kÌ\u0080Qù1iäÊ¤Û\u00ad\u0083{Xã\rá\u0014J\u0002ásLtÄ\u009aÑ\"Ú9\t@£oªòxHÔ\u0018Ñ\u0097\u001b%¥óð=\u0000'\u00adXQÏÔéEq¡\u00ad?\fµÏ  ñ\u0019\u0096\u0093\u0016\u008au\u0007Ë\u0012\u0015\u008c_½\u0018|\u0086\u009e\u0084e1¬\u0081\u0018^NJ\u001fp\u000e¾\u009e¼\b\u008d«\u0018¢«\u001aN1ZP\u000fÍÝ²ï\u009dE\u009f³ÅÄÂ\u009d\u009e6\u008dk`\u0089\u0005\u0082\u0098Éj°¦º\u0018£Ë®\u0089±\u000bÎFÌ±>U9ó_5 À4Ã\u0090n\u001e\u0005\u0018¥\u0017¦¨B\u0095\b\u0089g\u00175\u000eö\u001bj\u0002o;]¹*\u0017Ræ «ü·\u0090i¥æ\u0018\u0019µ2E\u001c08§,¥p\u009e;ig\n\u0004Sâ®þY\u001fmw4Ê\u001e0,Ö.^C\u0092áM\u001b\u001c\u0087/ÈsC´\u001fs>=\u0005\u001dáíB3\u009d\u008búq½\u0001\u009a íj+^8PÁ\u0081:6òlèd\u0018ÈÞ\u001c##+WtðdSË\u009bF+\u0013\u0015ªÃñ\u0007Å´L";
      int var7 = "àÃÙÆo\u0093Ë,Ìnÿs9b*ïH1\u009a\u0094<%/\u0015`÷{JaøSµ\u00904É~&O\t\u0018µð¤²\u001a\u00908Õ\u007f\tËE\u0093l<§ý.!\u009d<\u0015î½ [@\u0083?4¾Hý\u0087\u0018µT8\u0085æÍôS\u0089OÈ\u0082òs¤!ËréCÊª8pTYT+¢8Uh\u0012\u0004'U\u000f\u0096®Å W`ûÞ\u009b\u0003×Ð´s\u0087è\u000b?>¿~Ä@\u0080M\u009b\r|\u0002âñËa\u0095\rXÊ#\u0094\u0002RV\u0010ë\u009dÔÞ·\u0093À§\u000eU+ðQ\u009e\u0013;\u0010![U: É¼Á\u0011\\¦\u0084X9Y3\u0018¸¶\u000e\u008d©ô8\u0090âÚrf\u0081\u009b\u009d:\u009c£\u008c\n\u008d\n]\u0095\u0010Õúr\f\rÑ\u000eB\u0013£\u0015°LÙ,$ \u0010\u0083\u0083\u009fÎ¤bþéÅðtÕ]\u0087\u0093[Ô\u0095`S\u0007\u00admÒrnÉ\u0012ÕVÀP°½\u001c4%C\b\u0014\u009eºm\u0015\u0086ì\tj¨çvgçX6¯E²\u009e©¸üg©½ÃÒ\u0095#\u0019öîA²Á<\"\u001d|\u0084Z\u0019ÑV-\u0096\u0090Î\u0002ÓÆ)À\u008f\u0001ÎîØM\u009cS\u009f\\\u0091á2?Á\u001e¥¥\u0083 9\"@\u0099ëNHE\u0005\u0087w¡F\u008d\u0082Ã<\u0099~¬¼íeÍK\u0096\rô\u0093Ef\u0084\u00884\u009b\u008c\f½\u0004\u009cc\u0099±ÕdW\u0085\u001b\u0084\u009b\u000f\u008eËÕ\u0091¥^Í,ÃEéÄ\u0095\u0087\u0018ßñ¶=\u0006{\u0005ë9F=Ø\"òÈK\u0002pn9D\u0086æÿsÿ\u0017V® ²ÂTÚùç+ï\u009e\u0088ÌC½UÎ&Å½\u008d\u0002X\u001eW\u0016)¬ñìµ£¾ßé(WEÆê-ê¸\u000eCü°Ööï[t!Ú-ME\u0092\u0015<J&\\Ø\u000b\b\u0003Ë4\u0099ñr\u0003\bL\u0010d\u007f\u0096ÆÊSGD,ê\\\u001c¶,«q\u0010p1\u0081TÖa`c~ÄhÑ'ÜÚ«¨¯Ú«uPx\u009e\u009e\u0003¤P_\u0007ÃCåªJø\u009b$\u000b\u0086Î\u001fªPÌ\u0090\u0092?\u008f§9\u009a\u00165!yô\u008f°\u000bYùwH©`Ä\u00067s;Ð«ã\u0011\u001dêÁ\u001e\u0091è¢i\fö\u00adîÔ\u0003ë!3\rÐVY\u007f$\u008aç\u0086w\u0084ã\u008b9¸^»\u009aÓ9!»Û\u001e³Ï´\u0014ðÁ¹ï\u0090Ä¡ÏËs\u001e¤§\tMâÊá\u0016´\u0098\u0014Ê¼9¹ÜÆL§\u00854´O@ê¦\u009bÜ\u001e\u0082PÞ!¼5Õ]\u0095\u0010ú\u0086¢W{-í\u0080\u0000~í\u0084ÏîZX\u0004\u007f²ÝÕ\u001cê^\u0093(Å§Ã?ª\u0088\u009aö\u0012³#Ñ,1K\u0003ÉÁ\u0087\u0096`ãê{ÿ\u001c\u0006Ï\u0097x>\u009aúÙä\u009c-ðÇ\u001cc'Ê¾ã\u0015Hè[Üø({¬]Ø¦\u0086óð¿\u0089Íl9ÜÉ÷\u0007\u0015ÎkgÇ\u0003\u00146C \u0094üvïc©\u008d\u0012\u00197Ä´¹Å\u0085G\u0089B\ròd\u00943á-\u0006\b\u007fÊ·ø+`SôÝö4ààzv\u0007\u0013R¬d3½w\u0017m)Ð5jøÑO\u0089©µ\u008eì æûxEÈÍ\u000b\bLª\u0087$\u0006cIçG9%>D76\u009dÍä\u008cÆvÊ¨!e\"_\u0084\bé0?\u0012¥$<#¯¤Ãk¼\u0007^øî³\u0095\u0082\u0004k\u009aÒp«é e[{\\,\u00110\u0016\u0083_\u0092Í\\\u001cÉ³_ã\u001d\u001añh¬4Gd®0\u0000g\u0083g0Üáð®\u008a\u009d\u009b\u0096\u008bBtr-5P\u008fÜ/3KnSû6û°h\u0015\u0096+ ¥\u0088\u0007kÌ\u0080Qù1iäÊ¤Û\u00ad\u0083{Xã\rá\u0014J\u0002ásLtÄ\u009aÑ\"Ú9\t@£oªòxHÔ\u0018Ñ\u0097\u001b%¥óð=\u0000'\u00adXQÏÔéEq¡\u00ad?\fµÏ  ñ\u0019\u0096\u0093\u0016\u008au\u0007Ë\u0012\u0015\u008c_½\u0018|\u0086\u009e\u0084e1¬\u0081\u0018^NJ\u001fp\u000e¾\u009e¼\b\u008d«\u0018¢«\u001aN1ZP\u000fÍÝ²ï\u009dE\u009f³ÅÄÂ\u009d\u009e6\u008dk`\u0089\u0005\u0082\u0098Éj°¦º\u0018£Ë®\u0089±\u000bÎFÌ±>U9ó_5 À4Ã\u0090n\u001e\u0005\u0018¥\u0017¦¨B\u0095\b\u0089g\u00175\u000eö\u001bj\u0002o;]¹*\u0017Ræ «ü·\u0090i¥æ\u0018\u0019µ2E\u001c08§,¥p\u009e;ig\n\u0004Sâ®þY\u001fmw4Ê\u001e0,Ö.^C\u0092áM\u001b\u001c\u0087/ÈsC´\u001fs>=\u0005\u001dáíB3\u009d\u008búq½\u0001\u009a íj+^8PÁ\u0081:6òlèd\u0018ÈÞ\u001c##+WtðdSË\u009bF+\u0013\u0015ªÃñ\u0007Å´L"
         .length();
      char var8 = '@';
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
                     CONST_D = var4;
                     CONST_E = new String[26];
                     CONST_I = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[11];
                     int var14 = 0;
                     String var15 = "\u009c\u009f-ôuï!\u000e:³[\u0090\u0010\u000eÈ\u00129ºS×gOò×âÊ\u0088Kw\u0007æÀe7âÕÐ\u0092FÉ·nÄ§%=\u001bJ6;ÔÌPÊC\u001f\u0096~\u008dFÈm\u0088êÄþ]\u000e\u001a\u0098®\u0010";
                     int var16 = "\u009c\u009f-ôuï!\u000e:³[\u0090\u0010\u000eÈ\u00129ºS×gOò×âÊ\u0088Kw\u0007æÀe7âÕÐ\u0092FÉ·nÄ§%=\u001bJ6;ÔÌPÊC\u001f\u0096~\u008dFÈm\u0088êÄþ]\u000e\u001a\u0098®\u0010"
                        .length();
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
                                    CONST_G = var13;
                                    CONST_H = new Integer[11];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "jâ\u008d\f¬æÉÌ¼\u0081(©H-éþ";
                                 var16 = "jâ\u008d\f¬æÉÌ¼\u0081(©H-éþ".length();
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

                  var6 = "3³z%âv\u0090\u0015\u0011r] \bñ`i°¼m?Û?9§\u0001²ª\u0014}\u000e\u000eÏUï|«98yU7d\u0016YZFáy\u0005ä¿\u0081ì²?Sºq\u009fg*?\u008b§êqv\u008f\u001a:\u007fî\u0010\u001f·X×\u0005\u007fJ\u0093\u000e%\n\nU\u008a®\u0018";
                  var7 = "3³z%âv\u0090\u0015\u0011r] \bñ`i°¼m?Û?9§\u0001²ª\u0014}\u000e\u000eÏUï|«98yU7d\u0016YZFáy\u0005ä¿\u0081ì²?Sºq\u009fg*?\u008b§êqv\u008f\u001a:\u007fî\u0010\u001f·X×\u0005\u007fJ\u0093\u000e%\n\nU\u008a®\u0018"
                     .length();
                  var8 = 'H';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1123;
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
            throw new RuntimeException("rip/breeze/client/d9", var10);
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
         CONST_E[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_E[var3];
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
         throw new RuntimeException("rip/breeze/client/d9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13583;
      if (CONST_H[var3] == null) {
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
         long var5 = CONST_G[var3];
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
         Object[] var9 = (Object[])CONST_I.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_I.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("rip/breeze/client/d9", var14);
         }

         int var15 = (var13[4] & 255) << 24 | (var13[5] & 255) << 16 | (var13[6] & 255) << 8 | var13[7] & 255;
         CONST_H[var3] = var15;
      }

      return CONST_H[var3];
   }

   private static int getValue_3(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = decrypt(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite_2(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getValue_3".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/d9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
