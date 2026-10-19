package rip.breeze.client;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.ScorePlayerTeam;
import rip.breeze.BreezeContext;
import rip.breeze.CloudAuthService;
import rip.breeze.EventBus;
import rip.breeze.EventListener;
import rip.breeze.KeyBind;
import rip.breeze.StringDecryptor;

public class AltManager {
   private final Set<String> set_a;
   private static int[] arr_b;

   public AltManager() {
      long var1 = 47532544951625L;
      super();
      this.set_a = new HashSet<>();
      Set var10000 = this.set_a;
      CloudAuthService var10001 = BreezeContext.cloudAuthService_h;
      Object[] var10002 = MathUtil8.noArgs();
      Method var10004 = MathUtil8.getMethod_3(382487674982157165L, var1);
      Object[] var10003 = var10002;
      CloudAuthService var6 = var10001;
      Method var4 = var10004;

      try {
         var5 = (HashSet)var4.invoke(var6, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10000.addAll(var5);
      EventBus.processAll(this);
   }

   public PlayerUtil10 getEnum_FRIEND(EntityPlayer var1) {
      long var2 = 111223791321781L;
      if (this.set_a.contains(var1.func_70005_c_())) {
         return PlayerUtil10.FRIEND;
      }

      if (MinecraftAccessor.getNetworkPlayerInfo(BreezeClient.CONST_A.thePlayer) == null) {
         return PlayerUtil10.ENEMY;
      }

      switch (PlayerUtil6.CONST_A[BreezeClient.getKeybindSettings().getClientMode().ordinal()]) {
         case 1:
            if (var1.isOnSameTeam(BreezeClient.CONST_A.thePlayer)) {
               return PlayerUtil10.TEAM;
            }

            return PlayerUtil10.ENEMY;
         case 2:
            if (MinecraftAccessor.getNetworkPlayerInfo(BreezeClient.CONST_A.thePlayer).getPlayerTeam() == null
               || MinecraftAccessor.getNetworkPlayerInfo(BreezeClient.CONST_A.thePlayer).getPlayerTeam().getColorPrefix() == null
               || MinecraftAccessor.getNetworkPlayerInfo(BreezeClient.CONST_A.thePlayer).getPlayerTeam().getColorPrefix().length() != 10) {
               return PlayerUtil10.ENEMY;
            }
         case 3:
            if (!(var1 instanceof EntityOtherPlayerMP)) {
               return PlayerUtil10.ENEMY;
            } else {
               EntityOtherPlayerMP var4 = (EntityOtherPlayerMP)var1;
               if (MinecraftAccessor.getNetworkPlayerInfo(var4) == null) {
                  return PlayerUtil10.ENEMY;
               } else {
                  ScorePlayerTeam var5 = MinecraftAccessor.getNetworkPlayerInfo(var4).getPlayerTeam();
                  if (var5 != null && MinecraftAccessor.getNetworkPlayerInfo(BreezeClient.CONST_A.thePlayer).getPlayerTeam() != null) {
                     if (var5.getColorPrefix().isEmpty()) {
                        return PlayerUtil10.ENEMY;
                     }

                     if (MinecraftAccessor.getNetworkPlayerInfo(BreezeClient.CONST_A.thePlayer).getPlayerTeam().getColorPrefix().equals(var5.getColorPrefix())) {
                        return PlayerUtil10.TEAM;
                     }

                     return PlayerUtil10.ENEMY;
                  }

                  return PlayerUtil10.ENEMY;
               }
            }
         default:
            return PlayerUtil10.ENEMY;
      }
   }

   public Color getColor(EntityPlayer var1, boolean var2) {
      long var3 = 48232963787050L;
      if (!var2) {
         switch (PlayerUtil6.CONST_B[this.getEnum_FRIEND(var1).ordinal()]) {
            case 1:
               return null;
            case 2:
               return BreezeClient.getKeybindSettings().getDataBuilder9_2();
            case 3:
               return BreezeClient.getKeybindSettings().getDataBuilder9();
         }
      }

      if (this.set_a.contains(var1.func_70005_c_())) {
         return BreezeClient.getKeybindSettings().getDataBuilder9();
      }

      switch (PlayerUtil6.CONST_A[BreezeClient.getKeybindSettings().getClientMode().ordinal()]) {
         case 1:
         case 4:
            return null;
         case 2:
         case 3:
            if (!(var1 instanceof EntityOtherPlayerMP)) {
               return null;
            } else {
               EntityOtherPlayerMP var5 = (EntityOtherPlayerMP)var1;
               if (MinecraftAccessor.getNetworkPlayerInfo(var5) == null) {
                  return null;
               } else {
                  ScorePlayerTeam var6 = MinecraftAccessor.getNetworkPlayerInfo(var5).getPlayerTeam();
                  if (var6 != null
                     && MinecraftAccessor.getNetworkPlayerInfo(BreezeClient.CONST_A.thePlayer) != null
                     && MinecraftAccessor.getNetworkPlayerInfo(BreezeClient.CONST_A.thePlayer).getPlayerTeam() != null) {
                     String var7 = var6.getColorPrefix();
                     if (BreezeClient.getKeybindSettings().getClientMode() == rip.breeze.ClientMode.HYPIXEL && var7.length() != 10) {
                        return null;
                     }

                     return getColor_3(var7);
                  }

                  return null;
               }
            }
         default:
            return null;
      }
   }

   public Color getColor_2(EntityPlayer var1) {
      long var2 = 17640321273548L;
      if (!(var1 instanceof AbstractClientPlayer)) {
         return null;
      }

      switch (PlayerUtil6.CONST_A[BreezeClient.getKeybindSettings().getClientMode().ordinal()]) {
         case 1:
         case 4:
            return null;
         default:
            NetworkPlayerInfo var4 = MinecraftAccessor.getNetworkPlayerInfo((AbstractClientPlayer)var1);
            if (var4 != null && var4.getPlayerTeam() != null) {
               String var5 = var4.getPlayerTeam().getColorPrefix();
               if (var5 == null) {
                  return null;
               } else {
                  return BreezeClient.getKeybindSettings().getClientMode() == rip.breeze.ClientMode.HYPIXEL && var5.length() != 10 ? null : getColor_3(var5);
               }
            } else {
               return null;
            }
      }
   }

   private static Color getColor_3(String var0) {
      long var1 = 42194250322605L;
      boolean var3 = ConfigManager.checkCondition_3();
      if (var0 != null && !var0.isEmpty()) {
         for (String var7 : var0.split("§")) {
            if (!var7.isEmpty() || !var3) {
               ChatFormatting var8 = ChatFormatting.getByChar(var7.charAt(0));
               if (var8 != null || !var3) {
                  switch (PlayerUtil6.CONST_C[var8.ordinal()]) {
                     case 1:
                        return new Color(0, 0, 0);
                     case 2:
                        return new Color(0, 0, 170);
                     case 3:
                        return new Color(0, 170, 0);
                     case 4:
                        return new Color(0, 170, 170);
                     case 5:
                        return new Color(170, 0, 0);
                     case 6:
                        return new Color(170, 0, 170);
                     case 7:
                        return new Color(255, 170, 0);
                     case 8:
                        return new Color(170, 170, 170);
                     case 9:
                        return new Color(85, 85, 85);
                     case 10:
                        return new Color(85, 85, 255);
                     case 11:
                        return new Color(85, 255, 85);
                     case 12:
                        return new Color(85, 255, 255);
                     case 13:
                        return new Color(255, 85, 85);
                     case 14:
                        return new Color(255, 85, 255);
                     case 15:
                        return new Color(255, 255, 85);
                     case 16:
                        return new Color(255, 255, 255);
                  }
               }
            }

            if (!var3) {
               break;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @EventListener
   public void updateRotation(KeyPressedEvent var1) {
      long var2 = 12281125567288L;
      boolean var4 = ConfigManager.checkCondition_3();
      if (BreezeClient.CONST_A.thePlayer != null
         && BreezeClient.CONST_A.theWorld != null
         && BreezeClient.CONST_A.currentScreen == null
         && BreezeClient.getKeybindSettings().getKeyBind() != KeyBind.CONST_G
         && BreezeClient.getKeybindSettings().getKeyBind().int_aJ == var1.fieldInt_h) {
         if (BreezeClient.CONST_A.objectMouseOver != null && BreezeClient.CONST_A.objectMouseOver.entityHit != null) {
            if (BreezeClient.CONST_A.objectMouseOver.entityHit instanceof EntityPlayer) {
               EntityPlayer var5 = (EntityPlayer)BreezeClient.CONST_A.objectMouseOver.entityHit;
               if (this.set_a.contains(var5.func_70005_c_())) {
                  this.set_a.remove(var5.func_70005_c_());
                  if (var4) {
                     return;
                  }
               }

               this.set_a.add(var5.func_70005_c_());
            }
         }
      }
   }

   public static void initialize(int[] var0) {
      arr_b = var0;
   }

   public static int[] values() {
      return arr_b;
   }

   static {
      if (values() == null) {
         initialize(new int[1]);
      }
   }
}
