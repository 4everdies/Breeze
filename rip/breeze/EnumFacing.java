package rip.breeze;

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
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldSettings.GameType;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.BreezeClient;
import rip.breeze.client.MinecraftAccessor;

@ScriptObject(name = "PlayerControllerMP", description = "Can be used for controlling the local player.", group = "net/minecraft/client")
public class EnumFacing extends StringBuilderUtil<PlayerControllerMP> {
   private static final String[] CONST_Q;
   private static final String[] CONST_R;
   private static final Map CONST_B = new HashMap(13);

   public EnumFacing(PlayerControllerMP var1) {
      super(var1);
   }

   @JSFunction(value = "isSpectator", returns = "If the player is a spectator.")
   public boolean isValid() {
      return ((PlayerControllerMP)this.i).isSpectator();
   }

   @JSFunction(value = "setGameType", description = "Set the game type:\n0 -> survival\n1 -> creative\n2 -> adventure\n3 -> spectator")
   public void initialize(int var1) {
      ((PlayerControllerMP)this.i).setGameType(GameType.getByID(var1));
   }

   @JSFunction(value = "flipPlayer", description = "Flip the player's yaw 180°.", params = "The player to flip.")
   public void initialize_2(EntityPlayer var1) {
      ((PlayerControllerMP)this.i).flipPlayer((net.minecraft.entity.player.EntityPlayer)var1.b());
   }

   @JSFunction(value = "shouldDrawHUD", returns = "True if the HUD should be drawn for the current game mode.")
   public boolean isValid_2() {
      return ((PlayerControllerMP)this.i).shouldDrawHUD();
   }

   @JSFunction(
      value = "clickBlock",
      description = "Start breaking a block.",
      params = {"The block position", "The face being hit (e.g. NORTH, SOUTH, UP, DOWN, EAST, WEST)"}
   )
   public boolean isValid_3(BlockPos var1, @ForceParamType("EnumFacing") String var2) {
      return ((PlayerControllerMP)this.i).clickBlock((net.minecraft.util.BlockPos)var1.b(), net.minecraft.util.EnumFacing.byName(var2));
   }

   @JSFunction(
      value = "destroyBlock",
      description = "Immediately destroy a block if allowed.",
      params = {"The position of the block.", "The direction you are interacting with."}
   )
   public boolean isValid_4(BlockPos var1, @ForceParamType("EnumFacing") String var2) {
      return ((PlayerControllerMP)this.i).onPlayerDestroyBlock((net.minecraft.util.BlockPos)var1.b(), net.minecraft.util.EnumFacing.byName(var2));
   }

   @JSFunction(
      value = "damageBlock",
      description = "Continue damaging a block (hold action).",
      params = {"The position of the block.", "The direction you are interacting with."},
      returns = "True if action handled and we actually continue breaking the block."
   )
   public boolean isValid_5(BlockPos var1, @ForceParamType("EnumFacing") String var2) {
      return ((PlayerControllerMP)this.i).onPlayerDamageBlock((net.minecraft.util.BlockPos)var1.b(), net.minecraft.util.EnumFacing.byName(var2));
   }

   @JSFunction(value = "resetBlockRemoving", description = "Abort current block breaking progress.")
   public void initialize_3() {
      ((PlayerControllerMP)this.i).resetBlockRemoving();
   }

   @JSFunction(
      value = "rightClickBlock",
      description = "Right-click a block with the currently held item.",
      params = {"The position of the block.", "The direction you are interacting with.", "The vector point you are hitting the block at."},
      returns = "True if action handled."
   )
   public boolean getHeldItem(BlockPos var1, @ForceParamType("EnumFacing") String var2, VecUtil1 var3) {
      return ((PlayerControllerMP)this.i)
         .onPlayerRightClick(
            BreezeClient.CONST_A.thePlayer,
            BreezeClient.CONST_A.theWorld,
            BreezeClient.CONST_A.thePlayer.getHeldItem(),
            (net.minecraft.util.BlockPos)var1.b(),
            net.minecraft.util.EnumFacing.byName(var2),
            (Vec3)var3.b()
         );
   }

   @JSFunction(value = "useItemInHand", description = "Use the currently held item (right-click in air).", returns = "True if the stack changed.")
   public boolean getHeldItem_2() {
      Minecraft var1 = Minecraft.getMinecraft();
      return ((PlayerControllerMP)this.i).sendUseItem(var1.thePlayer, var1.theWorld, var1.thePlayer.getHeldItem());
   }

   @JSFunction(value = "attackEntity", description = "Attack an entity with the current item.", params = "The target entity.")
   public void update(RotationUtils var1) {
      Minecraft var2 = Minecraft.getMinecraft();
      ((PlayerControllerMP)this.i).attackEntity(var2.thePlayer, (Entity)var1.b());
   }

   @JSFunction(
      value = "interactWithEntity",
      description = "Interact with an entity (right-click).",
      params = "The target entity.",
      returns = "True if handled."
   )
   public boolean createPacket(RotationUtils var1) {
      Minecraft var2 = Minecraft.getMinecraft();
      return ((PlayerControllerMP)this.i).interactWithEntitySendPacket(var2.thePlayer, (Entity)var1.b());
   }

   @JSFunction(value = "stopUsingItem", description = "Release right-click usage (bows, food, etc.).")
   public void initialize_4() {
      Minecraft var1 = Minecraft.getMinecraft();
      ((PlayerControllerMP)this.i).onStoppedUsingItem(var1.thePlayer);
   }

   @JSFunction(value = "syncHotbar", description = "Sync the selected hotbar slot to the server.")
   public void initialize_5() {
      MinecraftAccessor.initialize_68((PlayerControllerMP)this.i);
   }

   @JSFunction(value = "getBlockReachDistance", returns = "Reach distance in blocks.")
   public double getDistance() {
      return ((PlayerControllerMP)this.i).getBlockReachDistance();
   }

   @JSFunction(value = "gameIsSurvivalOrAdventure", returns = "True if in Survival or Adventure.")
   public boolean isValid_6() {
      return ((PlayerControllerMP)this.i).gameIsSurvivalOrAdventure();
   }

   @JSFunction(value = "isNotCreative", returns = "True if not in Creative.")
   public boolean isValid_7() {
      return ((PlayerControllerMP)this.i).isNotCreative();
   }

   @JSFunction(value = "isInCreativeMode", returns = "True if in Creative.")
   public boolean isValid_8() {
      return ((PlayerControllerMP)this.i).isInCreativeMode();
   }

   @JSFunction(value = "extendedReach", returns = "True if extended reach is enabled (Creative).")
   public boolean isValid_9() {
      return ((PlayerControllerMP)this.i).extendedReach();
   }

   @JSFunction(value = "isRidingHorse", returns = "True if the local player is riding a horse.")
   public boolean isValid_10() {
      return ((PlayerControllerMP)this.i).isRidingHorse();
   }

   @JSFunction(value = "isSpectatorMode", returns = "True if in Spectator mode.")
   public boolean isValid_11() {
      return ((PlayerControllerMP)this.i).isSpectatorMode();
   }

   @JSFunction(value = "getCurrentGameType", returns = "Current game type ID (0=Survival,1=Creative,2=Adventure,3=Spectator).")
   public int getValue() {
      return ((PlayerControllerMP)this.i).getCurrentGameType().getID();
   }

   @JSFunction(value = "isHittingBlock", returns = "True if currently breaking a block.")
   public boolean isValid_12() {
      return ((PlayerControllerMP)this.i).getIsHittingBlock();
   }

   @JSFunction(value = "updateController", description = "Process incoming packets and keep controller in sync.")
   public void initialize_6() {
      ((PlayerControllerMP)this.i).updateController();
   }

   @JSFunction(
      value = "windowClick",
      description = "Perform an inventory click (client-side send + local container logic).\n\nParameters:\n- windowId: The container window ID (0 = player inventory, other IDs for open GUIs).\n- slot: Slot index to click. Use -999 to click outside (cursor drop).\n- button: Mouse button / index depending on mode.\n- mode: Integer 0..6:\n   0=PICKUP, 1=QUICK_MOVE, 2=SWAP, 3=CLONE, 4=THROW, 5=QUICK_CRAFT, 6=PICKUP_ALL\n\nReturns: The ItemStack on the cursor after the click (or null if empty).",
      params = {"windowId", "slot", "button", "mode"},
      returns = "ItemStack | null"
   )
   public Object getObject(int var1, int var2, int var3, int var4) {
      long var5 = 118300364872016L;
      if (var4 >= 0 && var4 <= 6) {
         return StringBuilderUtil.getDataBuilder12(((PlayerControllerMP)this.i).windowClick(var1, var2, var3, var4, BreezeClient.CONST_A.thePlayer));
      } else {
         throw Context.reportRuntimeError("mode must be an int in range 0..6");
      }
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return "PlayerControllerMP";
   }

   static {
      long var0 = 31901916788836L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[2];
      int var5 = 0;
      String var6 = "ÀJQÑõÆîÂÁ\"êf\u0081$\u001búù\u0012\f0=±\u0014Ó¬Óõ¯È\u0011 5·%3\u0092>\u001dö«\u0016ú¨\u0099\u001aÎ¸8\u0088ß]\u0094¿´#æÙ&~7*W©È(0\u0097^&éQ6ºÉs¡ÎÐ\u0002IZ]WñH¹\u008ctóðkø¾ýXySJý>ïØßçí";
      int var7 = "ÀJQÑõÆîÂÁ\"êf\u0081$\u001búù\u0012\f0=±\u0014Ó¬Óõ¯È\u0011 5·%3\u0092>\u001dö«\u0016ú¨\u0099\u001aÎ¸8\u0088ß]\u0094¿´#æÙ&~7*W©È(0\u0097^&éQ6ºÉs¡ÎÐ\u0002IZ]WñH¹\u008ctóðkø¾ýXySJý>ïØßçí"
         .length();
      char var8 = '@';
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var13 = buildString(var10).intern();
         byte var10001 = -1;
         var4[var5++] = var13;
         if ((var9 += var8) >= var7) {
            CONST_Q = var4;
            CONST_R = new String[2];
            return;
         }

         var8 = var6.charAt(var9);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16612;
      if (CONST_R[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_B.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_B.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/a9", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_Q[var3].getBytes("ISO-8859-1");
         CONST_R[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_R[var3];
   }

   private static Object getObject_2(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
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
               MethodHandles.insertArguments("getObject_2".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/a9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
