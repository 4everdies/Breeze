package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;
import rip.breeze.Util133;

@ModuleInfo(
   a = "ChestStealer",
   d = rip.breeze.ModuleCategory.MISC,
   b = "Steals items from chests.",
   c = {"chest", "steal", "stealer", "stealing", "stealers", "jew", "autojew", "inventory"}
)
public class ChestStealer extends BreezeModule {
   private final GenericSetting<rip.breeze.RangeValue> delaySetting;
   private final GenericSetting<Boolean> nameCheckSetting;
   private final GenericSetting<Boolean> ignoreJunkSetting;
   private final GenericSetting<Boolean> closeChestSetting;
   private final GenericSetting<MotionMode2> patternSetting;
   private final Util133 dataBuilder112_s;
   private int fieldInt_t;
   private int fieldInt_u;
   boolean fieldBool_v;
   private int fieldInt_w;
   private static final String[] CONST_Y;
   private static final String[] CONST_Z;
   private static final Map CONST_A = new HashMap(13);

   public ChestStealer() {
      long var1 = 96521127285897L;
      super();
      short var10002 = 1414;
      long var10003 = 2060935141068097949L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Delay");
      var10002 = 136;
      var10003 = 6087212067034909849L ^ var1;
      this.delaySetting = var10001.getDataBuilder50_3("The delay in between moving each item, in milliseconds.")
         .getDataBuilder50_4(new rip.breeze.RangeValue(200.0))
         .clamp(rip.breeze.RangeValue.getPredicate(50.0, 750.0, 5.0))
         .getDataBuilder54();
      var10002 = 19195;
      var10003 = 7932749703582516964L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "NameCheck");
      var10002 = 8409;
      var10003 = 7304848144926141636L ^ var1;
      this.nameCheckSetting = var10001.getDataBuilder50_3("Checks for common names of chests, makes sure you are not stealing from server item menus.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      var10002 = 1113;
      var10003 = 279094064337209415L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "IgnoreJunk");
      var10002 = 5210;
      var10003 = 8871945186649593929L ^ var1;
      this.ignoreJunkSetting = var10001.getDataBuilder50_3("Uses smart checks to leave behind items you probably will not need.")
         .getDataBuilder50_4(true)
         .getDataBuilder54();
      var10002 = 24582;
      var10003 = 6592410639982865424L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "CloseChest");
      var10002 = 25014;
      var10003 = 5769984403957788070L ^ var1;
      this.closeChestSetting = var10001.getDataBuilder50_3("Automatically closes the chest after stealing the items.")
         .getDataBuilder50_4(false)
         .getDataBuilder54();
      var10002 = 21936;
      var10003 = 2481499119181732268L ^ var1;
      var10001 = GenericSetting.getDataBuilder50(this, "Pattern");
      var10002 = 22000;
      var10003 = 2054784507940936162L ^ var1;
      this.patternSetting = var10001.getDataBuilder50_3(
            "In what order to take out the items from a chest: \n\tSimple: Takes items out row by row, can sometimes be detected by anti-cheat. \n\tRandom: Takes the items out in a random order, pretty undetectable. \n\tHuman: Takes into account multiple factors to make a human like pattern."
         )
         .getDataBuilder50_4(MotionMode2.RANDOM)
         .getDataBuilder54();
      this.dataBuilder112_s = new Util133();
      this.fieldBool_v = false;
      this.fieldInt_w = -1;
   }

   @EventListener
   public void updateRotation(RunGameLoopEventEvent var1) {
      long var2 = 39646256431798L;
      int var4 = AntiBot.getValue_2();
      if (!BreezeClient.isValid() && BreezeClient.CONST_A.thePlayer.openContainer instanceof ContainerChest) {
         if (!this.fieldBool_v) {
            ContainerChest var5 = (ContainerChest)BreezeClient.CONST_A.thePlayer.openContainer;
            IInventory var6 = var5.getLowerChestInventory();
            String[] var7 = var6.func_70005_c_().split("§");
            StringBuilder var8 = new StringBuilder();
            int var9 = 0;

            while (var9 < var7.length) {
               label86: {
                  if (var9 != 0) {
                     var8.append(var7[var9].substring(1));
                     if (var4 != 0) {
                        break label86;
                     }
                  }

                  var8.append(var7[var9]);
               }

               var9++;
               if (var4 == 0) {
                  break;
               }
            }

            if (this.nameCheckSetting.getObject_m()
               && !var8.toString().equals(MinecraftAccessor.getStringTranslate().translateKey("container.chestDouble"))
               && !var8.toString().equals(MinecraftAccessor.getStringTranslate().translateKey("container.chest"))) {
               this.fieldInt_t = (int)this.delaySetting.getObject_m().calculateDouble_2();
               this.dataBuilder112_s.getDataBuilder112();
            } else if (this.dataBuilder112_s.isValid(this.fieldInt_t)) {
               List var18 = Arrays.asList(
                  EntityUtil4.getClientUtil127(var5),
                  EntityUtil4.getClientUtil127_2(var5),
                  EntityUtil4.getClientUtil127_3(var5),
                  EntityUtil4.getClientUtil127_4(var5, EnumType5.Helmet),
                  EntityUtil4.getClientUtil127_4(var5, EnumType5.Chestplate),
                  EntityUtil4.getClientUtil127_4(var5, EnumType5.Leggings),
                  EntityUtil4.getClientUtil127_4(var5, EnumType5.Boots)
               );
               ArrayList var10 = EntityUtil4.getArrayList();
               boolean var11 = var10.contains(Items.lava_bucket);
               boolean var12 = var10.contains(Items.water_bucket);
               boolean var13 = var10.contains(Items.fishing_rod);
               ArrayList var14 = new ArrayList();
               IntStream.range(0, var6.func_70302_i_()).forEach(this::lambda$runGameTick_Inner0);
               boolean var15 = var18.stream().noneMatch(Objects::nonNull);
               if ((this.isValid() || var15 && var14.isEmpty()) && this.closeChestSetting.getObject_m() && this.dataBuilder112_s.isValid(this.fieldInt_t)) {
                  BreezeClient.CONST_A.thePlayer.closeScreen();
                  this.fieldInt_t = (int)this.delaySetting.getObject_m().calculateDouble_2();
                  this.dataBuilder112_s.getDataBuilder112();
               } else {
                  if (!var15) {
                     for (Util56 var17 : var18) {
                        if (var17 != null) {
                           if (this.dataBuilder112_s.isValid(this.fieldInt_t)) {
                              BreezeClient.CONST_A.playerController.windowClick(var5.windowId, var17.fieldInt_b, 0, 1, BreezeClient.CONST_A.thePlayer);
                              this.fieldInt_w = var17.fieldInt_b;
                              this.fieldInt_u++;
                              this.fieldInt_t = (int)this.delaySetting.getObject_m().calculateDouble_2();
                              this.dataBuilder112_s.getDataBuilder112();
                           }

                           return;
                        }

                        if (var4 == 0) {
                           break;
                        }
                     }
                  }

                  if (!var14.isEmpty() && this.dataBuilder112_s.isValid(this.fieldInt_t)) {
                     int var19 = this.patternSetting.getObject_m() == MotionMode2.HUMAN ? this.randomValue(var14, var6) : (Integer)var14.get(0);
                     BreezeClient.CONST_A.playerController.windowClick(var5.windowId, var19, 0, 1, BreezeClient.CONST_A.thePlayer);
                     this.fieldInt_w = var19;
                     this.fieldInt_u++;
                     this.fieldInt_t = (int)this.delaySetting.getObject_m().calculateDouble_2();
                     this.dataBuilder112_s.getDataBuilder112();
                  }
               }
            }
         }
      } else {
         if (this.fieldInt_u != 0) {
            BreezeContext.moduleBase_a
               .getModuleByClass(Notifications.class)
               .processAll(
                  "ChestStealer",
                  "Successfully stole" + this.fieldInt_u + " items"
               );
            this.fieldInt_u = 0;
         }

         this.fieldInt_w = -1;
         this.dataBuilder112_s.getDataBuilder112();
         this.fieldInt_t = (int)this.delaySetting.getObject_m().calculateDouble_2();
      }
   }

   private int randomValue(List<Integer> var1, IInventory var2) {
      long var3 = 75676479470472L;
      int var10000 = AntiBot.getValue();
      float var5 = -Float.MAX_VALUE;
      int var6 = var10000;
      int var7 = (Integer)var1.get(0);

      for (int var9 : var1) {
         ItemStack var10 = var2.getStackInSlot(var9);
         float var11 = this.clamp(var10);
         float var12 = this.fieldInt_w < 0 ? 0.0F : 1.0F / (1.0F + this.calcDistance(var9, this.fieldInt_w));
         float var13 = var11 * 0.65F + var12 * 0.35F + (float)(Math.random() * 0.15);
         if (var13 > var5) {
            var5 = var13;
            var7 = var9;
         }

         if (var6 != 0) {
            break;
         }
      }

      return var7;
   }

   private float clamp(ItemStack var1) {
      long var2 = 79903619902914L;
      int var4 = AntiBot.getValue();
      if (var1 == null) {
         return 0.0F;
      }

      Item var5 = var1.getItem();
      float var6 = 0.0F;
      if (!EnchantmentHelper.getEnchantments(var1).isEmpty()) {
         var6 += 0.5F;
         if (var4 == 0) {
            return Math.min(var6, 1.5F);
         }
      }

      if (var5 == Items.bow) {
         var6 += 0.35F;
         if (var4 == 0) {
            return Math.min(var6, 1.5F);
         }
      }

      if (var5 instanceof ItemSword || var5 instanceof ItemPickaxe || var5 instanceof ItemAxe || var5 instanceof ItemArmor) {
         label58: {
            String var7 = var5.getUnlocalizedName();
            if (var7.contains("diamond")) {
               var6 += 0.7F;
               if (var4 == 0) {
                  break label58;
               }
            }

            if (var7.contains("gold")) {
               var6 += 0.5F;
               if (var4 == 0) {
                  break label58;
               }
            }

            if (var7.contains("iron")) {
               var6 += 0.4F;
               if (var4 == 0) {
                  break label58;
               }
            }

            var6 += 0.2F;
         }

         if (var4 == 0) {
            return Math.min(var6, 1.5F);
         }
      }

      var6 += 0.15F;
      return Math.min(var6, 1.5F);
   }

   private float calcDistance(int var1, int var2) {
      int var3 = var1 / 9 - var2 / 9;
      int var4 = var1 % 9 - var2 % 9;
      return (float)Math.sqrt(var3 * var3 + var4 * var4);
   }

   private boolean checkCondition(Item var1) {
      long var2 = 49803105582849L;
      return !this.ignoreJunkSetting.getObject_m()
         || !(var1 instanceof ItemSword) && !(var1 instanceof ItemAxe) && !(var1 instanceof ItemPickaxe) && !(var1 instanceof ItemArmor);
   }

   private boolean isValid() {
      return IntStream.range(9, 45).noneMatch(ChestStealer::lambda$full_Inner1);
   }

   @EventListener
   public void toggle(PacketSendEventEvent var1) {
      long var2 = 131555882828120L;
      if (var1.packet_h instanceof C0FPacketConfirmTransaction || var1.packet_h instanceof C00PacketKeepAlive) {
         this.fieldBool_v = false;
      }

      if (var1.packet_h instanceof C0EPacketClickWindow) {
         this.fieldBool_v = true;
      }

      if (var1.packet_h instanceof C03PacketPlayer) {
         this.fieldBool_v = true;
      }
   }

   private static boolean lambda$full_Inner1(int var0) {
      long var1 = 25588196677306L;
      return BreezeClient.CONST_A.thePlayer.inventoryContainer.getSlot(var0).getStack() == null;
   }

   private void lambda$runGameTick_Inner0(IInventory var1, boolean var2, boolean var3, boolean var4, ArrayList var5, int var6) {
      long var7 = 76666083266905L;
      ItemStack var9 = var1.getStackInSlot(var6);
      if (var9 != null
         && this.checkCondition(var9.getItem())
         && (!var2 || !var9.getItem().equals(Items.lava_bucket))
         && (!var3 || !var9.getItem().equals(Items.water_bucket))
         && (!var4 || !var9.getItem().equals(Items.fishing_rod))) {
         var5.add(var6);
      }
   }

   static {
      long var0 = 20984339826079L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[18];
      int var5 = 0;
      String var6 = "X´6Ð\u0013ï»\u00941$µê\u008fñg2\nÃJJ&KX\u0090²Ó\u0019ûSk(ÕÁV\u001cø'\u0082\u0005ó;\"ÐõFÁuVd'ö\u0085\u001cÌN-\u0087\u0018Øx\u001aÝÏê\"ù\u008aÓtM`²\"ó°\u0082X\u0098\u0088|\u0002\u0006û\u000eÌ>ÏnÖÖÑ÷]²ë\u0017U\u001ey\u0019\tôÙKB'µ$3Ye\u0001sÏbÙ\u0015õRÉM\u009c½ð\u00ad½ÐvÖ¶\t:î0\u009bbÀ_Ê«òÖ!d¤*8¹,êÉ®\u0013u\u001cõÿÛ\u0088 `ü\u0085\u0004¢ÄÞë\u0019Ò\u0089Åå\u000fñzÿ§Ú;\u0088ÕÊT§ð?2\u009dÆ4íÑv'ª *Ó\u009f¹\u0087\u00836Û3ä\u000eôªMÕür\u009aÍE\u009d¿O6·¥\u0090*«\u0002Ö*\u0087Bö\u000eEbÞ\u001fHQÍ\u009e1d)\u008e¢«ð^\u009bUOå#Y-^w>»\u001a§\u001d* 1ý\u008c\u0004²äßd\u0098µL\u0089S\u0099\u0015\u0002áÖQÐ0¥s\\\u0005Pú]lx\u0088\u0001%\u000fêM`{\u008e\u0001Æq±\u009cÝ ªÂ\tØ\u0001\u0003c6¡ò\u001bsüÑPòF\u0095w\u0090H\u008b0Ï£·Ãõ+\u0082\u008dæá\u0017i]C²cù_l\u008b£:~CÆ\u0090î\u0095mO\u001f\u0085üC\u0016<ØkÏ«\"c«$JgÀ0\u0011`M)\n·O\u009bPæ^Æª´\u0084\u0011\u0018\u0013\u0012õ\u000fRçªº©ñ\u009fîÆ&¡\u001d$Êÿ\u008aØ¦\rP5p(BÇß¢wæQ\u0089§°°¤|hºJÏ¶É¤e>\u001cäa\u001e\u009dy£~\u008c\u0012ñzñ\u009f0¿ñ\u0095,o\"=?-@²êâ\\\u001aÝë\u0018¶Ä\u0081\b\u0097·k4\n\"ÕÒBfØSþm]\u0019Kà\u0098ÔØJÅx:\u008a)6kïî¬RÃd²§ÜAS\u0083'2U\u008fMù\u008duc\u0084ÿ``Ëû\u0017¦gMÇ\u001c°õù4\u009bdm#*\u001c\u0082ã\u0010\u0006\u0002ò\u008aädk=Ø\u0092{Õ\u000f§\u0084æcz\u0015\u008d×¾8\u001e¾\u008b±\u0016\u0083\u009c¥ÞÄ:1eÁ\u001dyÞ`\"4\u0098YæÐ!üï\u000flè\u001a\u0015\u0004áÁ:¨\u000e\u0090\u0093Çù¾Ä\u0012ØX\u0093óãe`w»\u0013\u009d\u007fC=\u0004Ýp,?@\u0083ôÜPUj.ºJ\u001e\u008dS\r¶úeN¬í\u0096nÈ¼:_=\u0082<ÞÎc:\u00921M8s¤\u00143öDê~º\u008a\u0006ñ\u0087õ \u008a0\u0015\u0089)\u0085àO\u001bûâW\u001b³\u008a\u0000\rUÉ8\u009fKâì+\u001f\u0082&ÐIy½ Î°ìL\u008e\u000b}Ä\u001c0¿áÓÔ\u0092\u0099\n\u000fµS0\u0083ûTF\u0094Ð6\u001eS\u0085 \u0010ë4Ðï00\u0084á\u009aûL§3§XU0\u0088 cà¥¿Ø{ì´À47\u001e%Ïk\u0017¢\u009bÈÇ³\u0014þ \u000bâ¡ïñ¼7pk\u0095\u008bè\u0006'%í}Úú¼\u0092\u008d\u0010SfØÚk\u009fe\u0018\u0003k¥¢\u008bÚ,\u0097(Âì\u008b¬HÕ\u0015ký\u0005æYÐÒ\u0015\u0007\u00127Ñº[2W\u0081Ç\u0014¬\u0018\rü\u00812cóaqâ|¼\u0087\u0010½¡¥\u0085d.\u008e\u0015\u0010`<ó\u001f:r¢\u0010*ï¬\u0092½Ðr_\u0016\bCû/³¿`\u0018iÍ_Þ\u0018Uª\\1-\u0000é«ïnÿÈ\u0013O¦¨~b= \u008bc¬\u0080kÅo!yVÆC_×\u000eM\u001eöç\u0091Ô½úºàÁT\u0081¡eÜÉ FÖÁ\u0083k¬¦F\u008d\u008f+\u0013¹\u0081t\u008aÁÓ·&=èÀä\u0083\u0013\u0010PS\u0091ÐR\u0010«\u0014\u008d\rÚð\u0088\u0006\u0084\u0096N»\rfçZ\u0090iý¦Á\r&þ§\u0003Á\u0006k\u0090²t\u0013\u0091¼Ù]\"; 2\u0002ï¿M©jG³\u0006ãH7vH¢¡~´ÿQÎúÿÎa1-Ã\u008e\u0017¬>û$y'ExõJ3\u0088+LûôE\u0082\u001a-Ch\u0098_\u0003\u0082òp\u0093\u0099§óP½y\u0017\u001fÙ\u0010l\u0011^Û\u0007ûMp(Uý?\u0095@w\u0092\u0019\u001a5\nL\u0081å\u000b\u0090ÿÂù×ÒF\u0004j\u0091\u0006%ºQP\u0015\u009cª\u0000_\u0006]hdö«°";
      int var7 = "X´6Ð\u0013ï»\u00941$µê\u008fñg2\nÃJJ&KX\u0090²Ó\u0019ûSk(ÕÁV\u001cø'\u0082\u0005ó;\"ÐõFÁuVd'ö\u0085\u001cÌN-\u0087\u0018Øx\u001aÝÏê\"ù\u008aÓtM`²\"ó°\u0082X\u0098\u0088|\u0002\u0006û\u000eÌ>ÏnÖÖÑ÷]²ë\u0017U\u001ey\u0019\tôÙKB'µ$3Ye\u0001sÏbÙ\u0015õRÉM\u009c½ð\u00ad½ÐvÖ¶\t:î0\u009bbÀ_Ê«òÖ!d¤*8¹,êÉ®\u0013u\u001cõÿÛ\u0088 `ü\u0085\u0004¢ÄÞë\u0019Ò\u0089Åå\u000fñzÿ§Ú;\u0088ÕÊT§ð?2\u009dÆ4íÑv'ª *Ó\u009f¹\u0087\u00836Û3ä\u000eôªMÕür\u009aÍE\u009d¿O6·¥\u0090*«\u0002Ö*\u0087Bö\u000eEbÞ\u001fHQÍ\u009e1d)\u008e¢«ð^\u009bUOå#Y-^w>»\u001a§\u001d* 1ý\u008c\u0004²äßd\u0098µL\u0089S\u0099\u0015\u0002áÖQÐ0¥s\\\u0005Pú]lx\u0088\u0001%\u000fêM`{\u008e\u0001Æq±\u009cÝ ªÂ\tØ\u0001\u0003c6¡ò\u001bsüÑPòF\u0095w\u0090H\u008b0Ï£·Ãõ+\u0082\u008dæá\u0017i]C²cù_l\u008b£:~CÆ\u0090î\u0095mO\u001f\u0085üC\u0016<ØkÏ«\"c«$JgÀ0\u0011`M)\n·O\u009bPæ^Æª´\u0084\u0011\u0018\u0013\u0012õ\u000fRçªº©ñ\u009fîÆ&¡\u001d$Êÿ\u008aØ¦\rP5p(BÇß¢wæQ\u0089§°°¤|hºJÏ¶É¤e>\u001cäa\u001e\u009dy£~\u008c\u0012ñzñ\u009f0¿ñ\u0095,o\"=?-@²êâ\\\u001aÝë\u0018¶Ä\u0081\b\u0097·k4\n\"ÕÒBfØSþm]\u0019Kà\u0098ÔØJÅx:\u008a)6kïî¬RÃd²§ÜAS\u0083'2U\u008fMù\u008duc\u0084ÿ``Ëû\u0017¦gMÇ\u001c°õù4\u009bdm#*\u001c\u0082ã\u0010\u0006\u0002ò\u008aädk=Ø\u0092{Õ\u000f§\u0084æcz\u0015\u008d×¾8\u001e¾\u008b±\u0016\u0083\u009c¥ÞÄ:1eÁ\u001dyÞ`\"4\u0098YæÐ!üï\u000flè\u001a\u0015\u0004áÁ:¨\u000e\u0090\u0093Çù¾Ä\u0012ØX\u0093óãe`w»\u0013\u009d\u007fC=\u0004Ýp,?@\u0083ôÜPUj.ºJ\u001e\u008dS\r¶úeN¬í\u0096nÈ¼:_=\u0082<ÞÎc:\u00921M8s¤\u00143öDê~º\u008a\u0006ñ\u0087õ \u008a0\u0015\u0089)\u0085àO\u001bûâW\u001b³\u008a\u0000\rUÉ8\u009fKâì+\u001f\u0082&ÐIy½ Î°ìL\u008e\u000b}Ä\u001c0¿áÓÔ\u0092\u0099\n\u000fµS0\u0083ûTF\u0094Ð6\u001eS\u0085 \u0010ë4Ðï00\u0084á\u009aûL§3§XU0\u0088 cà¥¿Ø{ì´À47\u001e%Ïk\u0017¢\u009bÈÇ³\u0014þ \u000bâ¡ïñ¼7pk\u0095\u008bè\u0006'%í}Úú¼\u0092\u008d\u0010SfØÚk\u009fe\u0018\u0003k¥¢\u008bÚ,\u0097(Âì\u008b¬HÕ\u0015ký\u0005æYÐÒ\u0015\u0007\u00127Ñº[2W\u0081Ç\u0014¬\u0018\rü\u00812cóaqâ|¼\u0087\u0010½¡¥\u0085d.\u008e\u0015\u0010`<ó\u001f:r¢\u0010*ï¬\u0092½Ðr_\u0016\bCû/³¿`\u0018iÍ_Þ\u0018Uª\\1-\u0000é«ïnÿÈ\u0013O¦¨~b= \u008bc¬\u0080kÅo!yVÆC_×\u000eM\u001eöç\u0091Ô½úºàÁT\u0081¡eÜÉ FÖÁ\u0083k¬¦F\u008d\u008f+\u0013¹\u0081t\u008aÁÓ·&=èÀä\u0083\u0013\u0010PS\u0091ÐR\u0010«\u0014\u008d\rÚð\u0088\u0006\u0084\u0096N»\rfçZ\u0090iý¦Á\r&þ§\u0003Á\u0006k\u0090²t\u0013\u0091¼Ù]\"; 2\u0002ï¿M©jG³\u0006ãH7vH¢¡~´ÿQÎúÿÎa1-Ã\u008e\u0017¬>û$y'ExõJ3\u0088+LûôE\u0082\u001a-Ch\u0098_\u0003\u0082òp\u0093\u0099§óP½y\u0017\u001fÙ\u0010l\u0011^Û\u0007ûMp(Uý?\u0095@w\u0092\u0019\u001a5\nL\u0081å\u000b\u0090ÿÂù×ÒF\u0004j\u0091\u0006%ºQP\u0015\u009cª\u0000_\u0006]hdö«°"
         .length();
      char var8 = 424;
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
                     CONST_Y = var4;
                     CONST_Z = new String[18];
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

                  var6 = "À'\u0089Vj\u0018ç\u0015\u009a\u000f. \u001fëñê >Í6äDÚAAÉø6ÓH\u00025¦lÅx\u0001\u009f\u0093Uªe\u0018¡\bÔ8Èm";
                  var7 = "À'\u0089Vj\u0018ç\u0015\u009a\u000f. \u001fëñê >Í6äDÚAAÉø6ÓH\u00025¦lÅx\u0001\u009f\u0093Uªe\u0018¡\bÔ8Èm".length();
                  var8 = 16;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6299;
      if (CONST_Z[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_A.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_A.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/client/dK", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Y[var3].getBytes("ISO-8859-1");
         CONST_Z[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Z[var3];
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
         throw new RuntimeException("rip/breeze/client/dK" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
