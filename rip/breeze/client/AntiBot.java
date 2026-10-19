package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.S14PacketEntity;
import net.minecraft.network.play.server.S18PacketEntityTeleport;
import rip.breeze.BreezeContext;
import rip.breeze.BreezeModule;
import rip.breeze.EventListener;
import rip.breeze.GenericSetting;
import rip.breeze.ModuleInfo;
import rip.breeze.StringDecryptor;

@ModuleInfo(
   a = "AntiBot",
   b = "Filters out bots and prevents the client from rendering or attacking them.",
   d = rip.breeze.ModuleCategory.MISC,
   c = {"bot", "hypixel", "target"}
)
public class AntiBot extends BreezeModule {
   private static final ArrayList<EntityPlayer> CONST_N;
   private static final ConcurrentHashMap<EntityPlayer, Long> CONST_O;
   private static final ConcurrentHashMap<EntityPlayer, Long> CONST_P;
   public static AntiBot antiBot_q;
   public static ArrayList<EntityPlayer> arrayList_r;
   private final GenericSetting<Boolean> matrixSetting;
   static long fieldLong_t;
   private static int fieldInt_u;
   private static final String[] CONST_W;
   private static final String[] CONST_X;
   private static final Map CONST_Y = new HashMap(13);
   private static final long[] CONST_Z;
   private static final Long[] CONST_A;
   private static final Map CONST_B;

   public AntiBot() {
      long var1 = 45881107536650L;
      super();
      short var10002 = 2660;
      long var10003 = 9147014940380536736L ^ var1;
      rip.breeze.BlockUtil10 var10001 = GenericSetting.getDataBuilder50(this, "Matrix");
      var10002 = 17742;
      var10003 = 6210427573978058891L ^ var1;
      this.matrixSetting = var10001.getDataBuilder50_3("Removes bots from servers that use Matrix anti cheat.").getDataBuilder50_4(true).getDataBuilder54();
      antiBot_q = this;
      BreezeContext.breezeUtil26_l.initialize_2(this::updateRotation);
   }

   private void updateRotation() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/AntiBot.124457992986865L J
      // 003: ldc2_w 66973758021437
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic rip/breeze/client/AntiBot.getValue_2 ()I
      // 00b: istore 3
      // 00c: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 00f: getfield net/minecraft/client/Minecraft.thePlayer Lnet/minecraft/client/entity/EntityPlayerSP;
      // 012: ifnull 035
      // 015: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 018: getfield net/minecraft/client/Minecraft.theWorld Lnet/minecraft/client/multiplayer/WorldClient;
      // 01b: ifnull 035
      // 01e: goto 025
      // 021: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: getstatic rip/breeze/client/AntiBot.antiBot_q Lrip/breeze/client/AntiBot;
      // 028: invokevirtual rip/breeze/client/AntiBot.f ()Z
      // 02b: ifne 04f
      // 02e: goto 035
      // 031: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: getstatic rip/breeze/BreezeContext.breezeUtil26_l Lrip/breeze/ThreadUtil;
      // 038: aload 0
      // 039: invokedynamic run (Lrip/breeze/client/AntiBot;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, rip/breeze/client/AntiBot.updateRotation ()V, ()V ]
      // 03e: sipush 30623
      // 041: ldc2_w 3591546343052468428
      // 044: lload 1
      // 045: lxor
      // 046: invokedynamic b (IJ)J bsm=rip/breeze/client/AntiBot.getCallSite_2 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: invokevirtual rip/breeze/ThreadUtil.initialize (Ljava/lang/Runnable;J)V
      // 04e: return
      // 04f: new java/util/ArrayList
      // 052: dup
      // 053: invokestatic rip/breeze/client/SkinLoader.getArrayList ()Ljava/util/ArrayList;
      // 056: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 059: putstatic rip/breeze/client/AntiBot.arrayList_r Ljava/util/ArrayList;
      // 05c: new java/util/ArrayList
      // 05f: dup
      // 060: invokespecial java/util/ArrayList.<init> ()V
      // 063: astore 4
      // 065: new java/util/ArrayList
      // 068: dup
      // 069: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 06c: getfield net/minecraft/client/Minecraft.theWorld Lnet/minecraft/client/multiplayer/WorldClient;
      // 06f: getfield net/minecraft/client/multiplayer/WorldClient.playerEntities Ljava/util/List;
      // 072: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 075: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 078: astore 5
      // 07a: aload 5
      // 07c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 081: ifeq 196
      // 084: aload 5
      // 086: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08b: checkcast net/minecraft/entity/player/EntityPlayer
      // 08e: astore 6
      // 090: aload 6
      // 092: ifnull 07a
      // 095: aload 6
      // 097: getfield net/minecraft/entity/player/EntityPlayer.isDead Z
      // 09a: ifne 07a
      // 09d: aload 6
      // 09f: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 0a2: getfield net/minecraft/client/Minecraft.thePlayer Lnet/minecraft/client/entity/EntityPlayerSP;
      // 0a5: if_acmpne 0b3
      // 0a8: iload 3
      // 0a9: ifne 07a
      // 0ac: goto 0b3
      // 0af: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: getfield rip/breeze/client/AntiBot.matrixSetting Lrip/breeze/GenericSetting;
      // 0b7: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 0ba: checkcast java/lang/Boolean
      // 0bd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c0: ifeq 111
      // 0c3: aload 4
      // 0c5: aload 6
      // 0c7: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70005_c_ ()Ljava/lang/String;
      // 0ca: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 0cd: ifeq 111
      // 0d0: goto 0d7
      // 0d3: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: aload 6
      // 0d9: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70005_c_ ()Ljava/lang/String;
      // 0dc: invokevirtual java/lang/String.isEmpty ()Z
      // 0df: ifne 111
      // 0e2: goto 0e9
      // 0e5: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8: athrow
      // 0e9: getstatic rip/breeze/client/AntiBot.arrayList_r Ljava/util/ArrayList;
      // 0ec: aload 6
      // 0ee: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 0f1: ifeq 111
      // 0f4: goto 0fb
      // 0f7: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa: athrow
      // 0fb: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 0fe: getfield net/minecraft/client/Minecraft.theWorld Lnet/minecraft/client/multiplayer/WorldClient;
      // 101: aload 6
      // 103: invokevirtual net/minecraft/client/multiplayer/WorldClient.removeEntity (Lnet/minecraft/entity/Entity;)V
      // 106: iload 3
      // 107: ifne 07a
      // 10a: goto 111
      // 10d: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: aload 0
      // 112: getfield rip/breeze/client/AntiBot.matrixSetting Lrip/breeze/GenericSetting;
      // 115: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 118: checkcast java/lang/Boolean
      // 11b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11e: ifeq 133
      // 121: aload 4
      // 123: aload 6
      // 125: invokevirtual net/minecraft/entity/player/EntityPlayer.func_70005_c_ ()Ljava/lang/String;
      // 128: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 12b: pop
      // 12c: goto 133
      // 12f: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: aload 6
      // 135: invokevirtual net/minecraft/entity/player/EntityPlayer.isInvisible ()Z
      // 138: ifeq 192
      // 13b: aload 6
      // 13d: getfield net/minecraft/entity/player/EntityPlayer.ticksExisted I
      // 140: bipush 105
      // 142: if_icmple 192
      // 145: goto 14c
      // 148: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14b: athrow
      // 14c: getstatic rip/breeze/client/AntiBot.arrayList_r Ljava/util/ArrayList;
      // 14f: aload 6
      // 151: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 154: ifne 192
      // 157: goto 15e
      // 15a: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: aload 6
      // 160: invokevirtual net/minecraft/entity/player/EntityPlayer.isSpectator ()Z
      // 163: ifne 192
      // 166: goto 16d
      // 169: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16c: athrow
      // 16d: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 170: getfield net/minecraft/client/Minecraft.thePlayer Lnet/minecraft/client/entity/EntityPlayerSP;
      // 173: invokevirtual net/minecraft/client/entity/EntityPlayerSP.isSpectator ()Z
      // 176: ifne 192
      // 179: goto 180
      // 17c: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17f: athrow
      // 180: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 183: getfield net/minecraft/client/Minecraft.theWorld Lnet/minecraft/client/multiplayer/WorldClient;
      // 186: aload 6
      // 188: invokevirtual net/minecraft/client/multiplayer/WorldClient.removeEntity (Lnet/minecraft/entity/Entity;)V
      // 18b: goto 192
      // 18e: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 191: athrow
      // 192: iload 3
      // 193: ifne 07a
      // 196: new java/util/ArrayList
      // 199: dup
      // 19a: invokespecial java/util/ArrayList.<init> ()V
      // 19d: astore 5
      // 19f: new java/util/ArrayList
      // 1a2: dup
      // 1a3: getstatic rip/breeze/client/AntiBot.CONST_N Ljava/util/ArrayList;
      // 1a6: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 1a9: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 1ac: astore 6
      // 1ae: aload 6
      // 1b0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b5: ifeq 1ea
      // 1b8: aload 6
      // 1ba: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1bf: checkcast net/minecraft/entity/player/EntityPlayer
      // 1c2: astore 7
      // 1c4: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 1c7: getfield net/minecraft/client/Minecraft.theWorld Lnet/minecraft/client/multiplayer/WorldClient;
      // 1ca: getfield net/minecraft/client/multiplayer/WorldClient.playerEntities Ljava/util/List;
      // 1cd: aload 7
      // 1cf: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 1d4: ifne 1e6
      // 1d7: aload 5
      // 1d9: aload 7
      // 1db: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1de: pop
      // 1df: goto 1e6
      // 1e2: invokestatic rip/breeze/client/AntiBot.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e5: athrow
      // 1e6: iload 3
      // 1e7: ifne 1ae
      // 1ea: getstatic rip/breeze/client/AntiBot.CONST_N Ljava/util/ArrayList;
      // 1ed: aload 5
      // 1ef: invokevirtual java/util/ArrayList.removeAll (Ljava/util/Collection;)Z
      // 1f2: pop
      // 1f3: getstatic rip/breeze/BreezeContext.breezeUtil26_l Lrip/breeze/ThreadUtil;
      // 1f6: aload 0
      // 1f7: invokedynamic run (Lrip/breeze/client/AntiBot;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, rip/breeze/client/AntiBot.updateRotation ()V, ()V ]
      // 1fc: sipush 27178
      // 1ff: ldc2_w 6986957458073451899
      // 202: lload 1
      // 203: lxor
      // 204: invokedynamic b (IJ)J bsm=rip/breeze/client/AntiBot.getCallSite_2 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: invokevirtual rip/breeze/ThreadUtil.initialize (Ljava/lang/Runnable;J)V
      // 20c: goto 250
      // 20f: astore 4
      // 211: aload 4
      // 213: invokevirtual java/lang/Exception.printStackTrace ()V
      // 216: getstatic rip/breeze/BreezeContext.breezeUtil26_l Lrip/breeze/ThreadUtil;
      // 219: aload 0
      // 21a: invokedynamic run (Lrip/breeze/client/AntiBot;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, rip/breeze/client/AntiBot.updateRotation ()V, ()V ]
      // 21f: sipush 27178
      // 222: ldc2_w 6986957458073451899
      // 225: lload 1
      // 226: lxor
      // 227: invokedynamic b (IJ)J bsm=rip/breeze/client/AntiBot.getCallSite_2 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: invokevirtual rip/breeze/ThreadUtil.initialize (Ljava/lang/Runnable;J)V
      // 22f: goto 250
      // 232: astore 8
      // 234: getstatic rip/breeze/BreezeContext.breezeUtil26_l Lrip/breeze/ThreadUtil;
      // 237: aload 0
      // 238: invokedynamic run (Lrip/breeze/client/AntiBot;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, rip/breeze/client/AntiBot.updateRotation ()V, ()V ]
      // 23d: sipush 27178
      // 240: ldc2_w 6986957458073451899
      // 243: lload 1
      // 244: lxor
      // 245: invokedynamic b (IJ)J bsm=rip/breeze/client/AntiBot.getCallSite_2 (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: invokevirtual rip/breeze/ThreadUtil.initialize (Ljava/lang/Runnable;J)V
      // 24d: aload 8
      // 24f: athrow
      // 250: return
      // try (9 -> 18): 19 java/lang/Exception
      // try (6 -> 12): 13 java/lang/Exception
      // try (6 -> 21): 205 java/lang/Exception
      // try (176 -> 186): 187 java/lang/Exception
      // try (143 -> 154): 155 java/lang/Exception
      // try (137 -> 147): 148 java/lang/Exception
      // try (130 -> 140): 141 java/lang/Exception
      // try (123 -> 134): 135 java/lang/Exception
      // try (120 -> 127): 128 java/lang/Exception
      // try (106 -> 117): 118 java/lang/Exception
      // try (90 -> 103): 104 java/lang/Exception
      // try (83 -> 94): 95 java/lang/Exception
      // try (75 -> 87): 88 java/lang/Exception
      // try (69 -> 80): 81 java/lang/Exception
      // try (60 -> 66): 67 java/lang/Exception
      // try (31 -> 195): 205 java/lang/Exception
      // try (6 -> 21): 218 null
      // try (31 -> 195): 218 null
      // try (205 -> 208): 218 null
      // try (218 -> 219): 218 null
   }

   public static boolean isInvisible(EntityPlayer var0) {
      long var1 = 9352265380950L;
      if (!var0.isInvisible()) {
         return false;
      } else if (var0.isSpectator()) {
         return false;
      } else {
         return !antiBot_q.f() ? true : var0.ticksExisted > 105 && arrayList_r.contains(var0);
      }
   }

   public static boolean isInvisible_2(EntityPlayer var0) {
      long var1 = 116781788564996L;
      if (var0 != BreezeClient.CONST_A.getRenderViewEntity() && var0 != null && !var0.isDead) {
         if (var0.getHealth() < 0.01) {
            return false;
         }

         if (var0.func_70005_c_().length() < 3) {
            return false;
         }

         if (!antiBot_q.f()) {
            return true;
         }

         if (var0.isInvisible() || var0.ticksExisted > 105 || var0.prevPosX == var0.posX && var0.prevPosY == var0.posY && var0.prevPosZ == var0.posZ) {
            return CONST_N.contains(var0) || var0.ticksExisted > 105 && arrayList_r.contains(var0);
         }

         if (!CONST_N.contains(var0)) {
            CONST_N.add(var0);
         }

         return true;
      } else {
         return false;
      }
   }

   public static boolean isInvisible_3(EntityPlayer var0) {
      long var1 = 23516000016291L;
      if (System.currentTimeMillis() > fieldLong_t + 6101829867941507365L) {
         fieldLong_t = System.currentTimeMillis();
         long var3 = System.currentTimeMillis();
         CONST_O.keySet().removeIf(AntiBot::lambda$allowAttack_Inner0);
         CONST_P.keySet().removeIf(AntiBot::lambda$allowAttack_Inner1);
      }

      if (BreezeClient.CONST_A.thePlayer != var0 && var0 != null && !var0.isDead) {
         PlayerUtil10 var5 = BreezeClient.getAltManager().getEnum_FRIEND(var0);
         if (var5 == PlayerUtil10.TEAM) {
            return false;
         }

         if (var5 == PlayerUtil10.FRIEND && !BreezeClient.getKeybindSettings().isValid()) {
            return false;
         }

         if (!antiBot_q.f()) {
            return true;
         }

         if (!CONST_O.containsKey(var0) && CONST_P.containsKey(var0)) {
            return false;
         }

         if (var0.isInvisible() && !BreezeClient.getKeybindSettings().isValid_6()
            || var0.ticksExisted > 105
            || var0.prevPosX == var0.posX && var0.prevPosY == var0.posY && var0.prevPosZ == var0.posZ) {
            return CONST_N.contains(var0) || var0.ticksExisted > 105 && arrayList_r.contains(var0);
         }

         if (!CONST_N.contains(var0)) {
            CONST_N.add(var0);
         }

         return true;
      } else {
         return false;
      }
   }

   @EventListener
   public void sendPacket(PacketReceiveEventEvent var1) {
      long var2 = 110211272511872L;
      int var4 = getValue();
      if (var1.getPacket_h() instanceof S14PacketEntity) {
         if (BreezeClient.CONST_A.theWorld == null) {
            return;
         }

         Entity var5 = ((S14PacketEntity)var1.getPacket_h()).getEntity(BreezeClient.CONST_A.theWorld);
         if (var5 == null) {
            return;
         }

         if (var5 instanceof EntityPlayer) {
            CONST_O.put((EntityPlayer)((S14PacketEntity)var1.getPacket_h()).getEntity(BreezeClient.CONST_A.theWorld), System.currentTimeMillis());
         }

         if (var4 == 0) {
            return;
         }
      }

      if (var1.getPacket_h() instanceof S18PacketEntityTeleport && BreezeClient.CONST_A.theWorld != null) {
         Entity var6 = BreezeClient.CONST_A.theWorld.getEntityByID(((S18PacketEntityTeleport)var1.packet_h).getEntityId());
         if (var6 == null) {
            return;
         }

         if (var6 instanceof EntityPlayer) {
            CONST_P.put((EntityPlayer)var6, System.currentTimeMillis());
         }
      }
   }

   private static boolean lambda$allowAttack_Inner1(long var0, EntityPlayer var2) {
      long var3 = 138029870156432L;
      return CONST_P.get(var2) < var0 - -298312789681919826L;
   }

   private static boolean lambda$allowAttack_Inner0(long var0, EntityPlayer var2) {
      long var3 = 1996964077624L;
      return CONST_O.get(var2) < var0 - -3656165972287842203L;
   }

   static {
      long var0 = 88771105678849L;
      initialize(0);
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
      String var6 = " +Uõ&\u00898\u009a\u0006ßáÀ\u0084%Ä\u0011`n\u0083 -éµú;ç&\u001d\u0098f×:FÙºßB\u0089Õ\u0012\nÄ¶Ý\u008e÷|\u001fk\u008cFJ\u0090óþo ¤\u007f8ü.\u0012³¼=³\u0087¡\u008bÃ7Ã×ù,\u000e\u00ad\u0085G$Þ\u0011ÉSM!\u0099µÚ$'\u0093\u008aäL\u0010>×¡@ò¾sC¾à\u0010óbhZ_";
      int var7 = " +Uõ&\u00898\u009a\u0006ßáÀ\u0084%Ä\u0011`n\u0083 -éµú;ç&\u001d\u0098f×:FÙºßB\u0089Õ\u0012\nÄ¶Ý\u008e÷|\u001fk\u008cFJ\u0090óþo ¤\u007f8ü.\u0012³¼=³\u0087¡\u008bÃ7Ã×ù,\u000e\u00ad\u0085G$Þ\u0011ÉSM!\u0099µÚ$'\u0093\u008aäL\u0010>×¡@ò¾sC¾à\u0010óbhZ_"
         .length();
      char var8 = 16;
      int var9 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var9, var9 + var8).getBytes("ISO-8859-1"));
         String var30 = buildString(var10).intern();
         int var10001 = -1;
         var4[var5++] = var30;
         if ((var9 += var8) >= var7) {
            CONST_W = var4;
            CONST_X = new String[2];
            CONST_B = new HashMap(13);
            Cipher var11;
            var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var12 = 1; var12 < 8; var12++) {
               var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var13 = new long[5];
            int var14 = 0;
            String var15 = "ï\u00859\u0006)¢²Ñð\u0089ª¿Ùâ¸\u009b×~¢Ó£h|\u0091";
            int var16 = "ï\u00859\u0006)¢²Ñð\u0089ª¿Ùâ¸\u009b×~¢Ó£h|\u0091".length();
            byte var17 = 0;

            label32:
            while (true) {
               var10001 = var17;
               var17 += 8;
               byte[] var18 = var15.substring(var10001, var17).getBytes("ISO-8859-1");
               long[] var25 = var13;
               var10001 = var14++;
               long var33 = (var18[0] & 255L) << 56
                  | (var18[1] & 255L) << 48
                  | (var18[2] & 255L) << 40
                  | (var18[3] & 255L) << 32
                  | (var18[4] & 255L) << 24
                  | (var18[5] & 255L) << 16
                  | (var18[6] & 255L) << 8
                  | var18[7] & 255L;
               byte var36 = -1;

               while (true) {
                  long var19 = var33;
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
                  long var38 = (var21[0] & 255L) << 56
                     | (var21[1] & 255L) << 48
                     | (var21[2] & 255L) << 40
                     | (var21[3] & 255L) << 32
                     | (var21[4] & 255L) << 24
                     | (var21[5] & 255L) << 16
                     | (var21[6] & 255L) << 8
                     | var21[7] & 255L;
                  switch (var36) {
                     case 0:
                        var25[var10001] = var38;
                        if (var17 >= var16) {
                           CONST_Z = var13;
                           CONST_A = new Long[5];
                           CONST_N = new ArrayList<>();
                           CONST_O = new ConcurrentHashMap<>();
                           CONST_P = new ConcurrentHashMap<>();
                           arrayList_r = new ArrayList<>();
                           fieldLong_t = 0L;
                           return;
                        }
                        break;
                     default:
                        var25[var10001] = var38;
                        if (var17 < var16) {
                           continue label32;
                        }

                        var15 = "_\u0089U<)kQôE\u0082\u000bÁj½ö¼";
                        var16 = "_\u0089U<)kQôE\u0082\u000bÁj½ö¼".length();
                        var17 = 0;
                  }

                  byte var29 = var17;
                  var17 += 8;
                  var18 = var15.substring(var29, var17).getBytes("ISO-8859-1");
                  var25 = var13;
                  var10001 = var14++;
                  var33 = (var18[0] & 255L) << 56
                     | (var18[1] & 255L) << 48
                     | (var18[2] & 255L) << 40
                     | (var18[3] & 255L) << 32
                     | (var18[4] & 255L) << 24
                     | (var18[5] & 255L) << 16
                     | (var18[6] & 255L) << 8
                     | var18[7] & 255L;
                  var36 = 0;
               }
            }
         }

         var8 = var6.charAt(var9);
      }
   }

   public static void initialize(int var0) {
      fieldInt_u = var0;
   }

   public static int getValue() {
      return fieldInt_u;
   }

   public static int getValue_2() {
      int var0 = getValue();
      return var0 == 0 ? 55 : 0;
   }

   private static Exception getException(Exception var0) {
      return var0;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28223;
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
            throw new RuntimeException("rip/breeze/client/dF", var10);
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
         throw new RuntimeException("rip/breeze/client/dF" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26780;
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
            throw new RuntimeException("rip/breeze/client/dF", var16);
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
         throw new RuntimeException("rip/breeze/client/dF" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
