package rip.breeze.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.INetHandlerPlayClient;
import rip.breeze.EventBus;
import rip.breeze.KeepParameters;
import rip.breeze.StringDecryptor;

public class ConfigManager {
   private final List<Packet<?>> list_a = new CopyOnWriteArrayList<>();
   private final List<Packet<?>> list_b = new CopyOnWriteArrayList<>();
   private final LinkedBlockingQueue<DelayedPacket> linkedBlockingQueue_c = new LinkedBlockingQueue<>();
   private final LinkedBlockingQueue<DelayedPacket> linkedBlockingQueue_d = new LinkedBlockingQueue<>();
   private final LinkedBlockingQueue<DelayedPacket> linkedBlockingQueue_e = new LinkedBlockingQueue<>();
   private final LinkedBlockingQueue<PacketUtil> linkedBlockingQueue_f = new LinkedBlockingQueue<>();
   private final LinkedBlockingQueue<PacketUtil> linkedBlockingQueue_g = new LinkedBlockingQueue<>();
   private final List<IBreezeInterface3> list_h = new ArrayList<>();
   private final ConcurrentHashMap<IBreezeInterface3, Integer> concurrentHashMap_i = new ConcurrentHashMap<>();
   private final EntityUtil5 dataBuilder31_j = new EntityUtil5();
   private static final long eka_1;
   private volatile long fieldLong_l = 0L;
   private Object object_m;
   private static boolean fieldBool_n;
   private static final long[] CONST_P;
   private static final Long[] CONST_Q;
   private static final Map CONST_R = new HashMap(13);

   public EntityUtil5 getDataBuilder31_j() {
      return this.dataBuilder31_j;
   }

   private boolean checkCondition() {
      long var1 = 122807529893244L;
      long var3 = this.fieldLong_l;
      return var3 != 0L && BreezeClient.CONST_A.thePlayer != null && System.currentTimeMillis() - var3 >= -519011579343232076L;
   }

   private void update() {
      this.linkedBlockingQueue_f.clear();
      this.linkedBlockingQueue_g.clear();
      this.linkedBlockingQueue_c.clear();
      this.linkedBlockingQueue_d.clear();
      this.linkedBlockingQueue_e.clear();
      this.list_b.clear();
      this.list_a.clear();
   }

   public void update_1(IBreezeInterface3 var1, int var2) {
      this.concurrentHashMap_i.put(var1, var2);
      this.list_h.add(var1);
      this.list_h.sort(this::lambda$registerModule_Inner0);
   }

   public void update_2(IBreezeInterface3 var1) {
      this.processAll(var1);
      this.concurrentHashMap_i.remove(var1);
      this.list_h.remove(var1);
   }

   public void update_3(IBreezeInterface3 var1, int var2) {
      this.concurrentHashMap_i.put(var1, var2);
      this.list_h.sort(this::lambda$setPriority_Inner1);
   }

   public void update_4(Packet<?> var1, boolean var2) {
      long var3 = 105205315684488L;
      if (!var2) {
         this.list_a.add(var1);
      }

      BreezeClient.CONST_A.thePlayer.sendQueue.addToSendQueue(var1);
   }

   @KeepParameters
   public void processNullable(PacketSendEventEvent var1, NetworkManager var2) {
      long var3 = 86352950039898L;
      if (BreezeClient.CONST_A.getNetHandler() != null && BreezeClient.CONST_A.getNetHandler().getNetworkManager() == var2) {
         Packet var5 = var1.packet_h;
         if (BreezeClient.CONST_A.thePlayer != null && var2.getNetHandler() instanceof INetHandlerPlayClient && this.checkCondition()) {
            if (this.list_b.contains(var5)) {
               this.list_b.remove(var5);
               this.dataBuilder31_j.processAll(var5);
               if (this.list_a.contains(var5)) {
                  this.list_a.remove(var5);
               } else {
                  EventBus.checkCondition(var1);
               }
            } else {
               this.linkedBlockingQueue_g.offer(new PacketUtil(var5, var2, EnumType19.OUT));
               var1.a();
            }
         } else {
            if (this.list_b.contains(var5)) {
               this.list_b.remove(var5);
               if (this.list_a.contains(var5)) {
                  this.list_a.remove(var5);
                  return;
               }
            }

            EventBus.checkCondition(var1);
         }
      }
   }

   @KeepParameters
   public boolean checkCondition_2(Packet<?> var1, NetworkManager var2) {
      long var3 = 32182521760794L;
      if (BreezeClient.CONST_A.getNetHandler() == null || BreezeClient.CONST_A.getNetHandler().getNetworkManager() != var2) {
         return false;
      } else if (!(var2.getNetHandler() instanceof INetHandlerPlayClient)) {
         return false;
      } else if (!this.checkCondition()) {
         PacketReceiveEventEvent var5 = new PacketReceiveEventEvent(var1);
         return EventBus.checkCondition(var5);
      } else {
         this.dataBuilder31_j.calculate(var1);
         this.linkedBlockingQueue_f.offer(new PacketUtil(var1, var2, EnumType19.CONST_IN));
         return true;
      }
   }

   @KeepParameters
   public void processAll() {
      long var1 = 138801286879399L;
      this.dataBuilder31_j.processAll_2();
      boolean var10000 = isValid();
      NetHandlerPlayClient var3 = BreezeClient.CONST_A.getNetHandler();
      boolean var4 = var10000;
      if (var3 != this.object_m) {
         this.object_m = var3;
         this.update();
         this.fieldLong_l = var3 == null ? 0L : System.currentTimeMillis();
      }

      for (IBreezeInterface3 var6 : this.list_h) {
         var6.processPacketQueue(
            new ArrayList<>(this.linkedBlockingQueue_c)
               .stream()
               .filter(ConfigManager::lambda$onRunGameLoop_Inner2)
               .collect(ArrayList::new, ArrayList::add, ArrayList::addAll)
         );
         if (var4) {
            break;
         }
      }

      for (DelayedPacket var8 : new ArrayList<>(this.linkedBlockingQueue_c)) {
         if (!var8.networkManager_l.isChannelOpen()) {
            this.linkedBlockingQueue_c.remove(var8);
            this.linkedBlockingQueue_d.remove(var8);
            this.linkedBlockingQueue_e.remove(var8);
         }

         if (var4) {
            break;
         }
      }

      this.sendPacket_2();
      this.sendPacket(this.linkedBlockingQueue_f);
      this.sendPacket(this.linkedBlockingQueue_g);
      this.sendPacket_2();
   }

   private void sendPacket(LinkedBlockingQueue<PacketUtil> param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/client/ConfigManager.77470407216650L J
      // 003: ldc2_w 16477892064439
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic rip/breeze/client/ConfigManager.checkCondition_3 ()Z
      // 00b: istore 4
      // 00d: aload 1
      // 00e: invokevirtual java/util/concurrent/LinkedBlockingQueue.poll ()Ljava/lang/Object;
      // 011: checkcast rip/breeze/client/PacketUtil
      // 014: dup
      // 015: astore 5
      // 017: ifnull 274
      // 01a: aload 5
      // 01c: getfield rip/breeze/client/PacketUtil.networkManager_b Lnet/minecraft/network/NetworkManager;
      // 01f: invokevirtual net/minecraft/network/NetworkManager.isChannelOpen ()Z
      // 022: ifne 033
      // 025: goto 02c
      // 028: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: goto 00d
      // 02f: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: aload 5
      // 035: getfield rip/breeze/client/PacketUtil.enum_IN_c Lrip/breeze/client/EnumType19;
      // 038: getstatic rip/breeze/client/EnumType19.OUT Lrip/breeze/client/EnumType19;
      // 03b: if_acmpne 14c
      // 03e: new java/util/HashSet
      // 041: dup
      // 042: invokespecial java/util/HashSet.<init> ()V
      // 045: astore 6
      // 047: bipush 0
      // 048: istore 7
      // 04a: aload 0
      // 04b: getfield rip/breeze/client/ConfigManager.list_h Ljava/util/List;
      // 04e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 053: astore 8
      // 055: aload 8
      // 057: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 05c: ifeq 0d0
      // 05f: aload 8
      // 061: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 066: checkcast rip/breeze/client/IBreezeInterface3
      // 069: astore 9
      // 06b: getstatic rip/breeze/client/Util123.CONST_A [I
      // 06e: aload 9
      // 070: aload 5
      // 072: getfield rip/breeze/client/PacketUtil.packet_a Lnet/minecraft/network/Packet;
      // 075: aload 6
      // 077: invokevirtual java/util/HashSet.isEmpty ()Z
      // 07a: ifne 085
      // 07d: bipush 1
      // 07e: goto 086
      // 081: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: bipush 0
      // 086: invokeinterface rip/breeze/client/IBreezeInterface3.onPacketSend (Lnet/minecraft/network/Packet;Z)Lrip/breeze/client/EnumType27; 3
      // 08b: invokevirtual rip/breeze/client/EnumType27.ordinal ()I
      // 08e: iaload
      // 08f: lookupswitch 53 2 1 25 2 45
      // 0a8: aload 6
      // 0aa: aload 9
      // 0ac: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0af: pop
      // 0b0: iload 4
      // 0b2: ifne 0c4
      // 0b5: goto 0bc
      // 0b8: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: bipush 1
      // 0bd: istore 7
      // 0bf: iload 4
      // 0c1: ifne 0d0
      // 0c4: iload 4
      // 0c6: ifne 055
      // 0c9: goto 0d0
      // 0cc: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: iload 7
      // 0d2: ifeq 0dc
      // 0d5: goto 00d
      // 0d8: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: aload 6
      // 0de: invokevirtual java/util/HashSet.isEmpty ()Z
      // 0e1: ifeq 0f5
      // 0e4: aload 0
      // 0e5: getfield rip/breeze/client/ConfigManager.linkedBlockingQueue_d Ljava/util/concurrent/LinkedBlockingQueue;
      // 0e8: invokevirtual java/util/concurrent/LinkedBlockingQueue.isEmpty ()Z
      // 0eb: ifne 127
      // 0ee: goto 0f5
      // 0f1: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: new rip/breeze/client/DelayedPacket
      // 0f8: dup
      // 0f9: aload 5
      // 0fb: getfield rip/breeze/client/PacketUtil.packet_a Lnet/minecraft/network/Packet;
      // 0fe: invokestatic java/lang/System.currentTimeMillis ()J
      // 101: getstatic rip/breeze/client/EnumType19.OUT Lrip/breeze/client/EnumType19;
      // 104: aload 6
      // 106: aload 5
      // 108: getfield rip/breeze/client/PacketUtil.networkManager_b Lnet/minecraft/network/NetworkManager;
      // 10b: invokespecial rip/breeze/client/DelayedPacket.<init> (Lnet/minecraft/network/Packet;JLrip/breeze/client/EnumType19;Ljava/util/HashSet;Lnet/minecraft/network/NetworkManager;)V
      // 10e: astore 8
      // 110: aload 0
      // 111: getfield rip/breeze/client/ConfigManager.linkedBlockingQueue_c Ljava/util/concurrent/LinkedBlockingQueue;
      // 114: aload 8
      // 116: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // 119: pop
      // 11a: aload 0
      // 11b: getfield rip/breeze/client/ConfigManager.linkedBlockingQueue_d Ljava/util/concurrent/LinkedBlockingQueue;
      // 11e: aload 8
      // 120: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // 123: pop
      // 124: goto 147
      // 127: aload 0
      // 128: getfield rip/breeze/client/ConfigManager.list_b Ljava/util/List;
      // 12b: aload 5
      // 12d: getfield rip/breeze/client/PacketUtil.packet_a Lnet/minecraft/network/Packet;
      // 130: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 135: pop
      // 136: getstatic rip/breeze/client/BreezeClient.CONST_A Lnet/minecraft/client/Minecraft;
      // 139: getfield net/minecraft/client/Minecraft.thePlayer Lnet/minecraft/client/entity/EntityPlayerSP;
      // 13c: getfield net/minecraft/client/entity/EntityPlayerSP.sendQueue Lnet/minecraft/client/network/NetHandlerPlayClient;
      // 13f: aload 5
      // 141: getfield rip/breeze/client/PacketUtil.packet_a Lnet/minecraft/network/Packet;
      // 144: invokevirtual net/minecraft/client/network/NetHandlerPlayClient.addToSendQueue (Lnet/minecraft/network/Packet;)V
      // 147: iload 4
      // 149: ifne 00d
      // 14c: new java/util/HashSet
      // 14f: dup
      // 150: invokespecial java/util/HashSet.<init> ()V
      // 153: astore 6
      // 155: bipush 0
      // 156: istore 7
      // 158: aload 0
      // 159: getfield rip/breeze/client/ConfigManager.list_h Ljava/util/List;
      // 15c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 161: astore 8
      // 163: aload 8
      // 165: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 16a: ifeq 1e0
      // 16d: aload 8
      // 16f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 174: checkcast rip/breeze/client/IBreezeInterface3
      // 177: astore 9
      // 179: getstatic rip/breeze/client/Util123.CONST_A [I
      // 17c: aload 9
      // 17e: aload 5
      // 180: getfield rip/breeze/client/PacketUtil.packet_a Lnet/minecraft/network/Packet;
      // 183: aload 6
      // 185: invokevirtual java/util/HashSet.isEmpty ()Z
      // 188: ifne 193
      // 18b: bipush 1
      // 18c: goto 194
      // 18f: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 192: athrow
      // 193: bipush 0
      // 194: invokeinterface rip/breeze/client/IBreezeInterface3.onPacketReceive (Lnet/minecraft/network/Packet;Z)Lrip/breeze/client/EnumType27; 3
      // 199: invokevirtual rip/breeze/client/EnumType27.ordinal ()I
      // 19c: iaload
      // 19d: lookupswitch 55 2 1 27 2 47
      // 1b8: aload 6
      // 1ba: aload 9
      // 1bc: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 1bf: pop
      // 1c0: iload 4
      // 1c2: ifne 1d4
      // 1c5: goto 1cc
      // 1c8: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cb: athrow
      // 1cc: bipush 1
      // 1cd: istore 7
      // 1cf: iload 4
      // 1d1: ifne 1e0
      // 1d4: iload 4
      // 1d6: ifne 163
      // 1d9: goto 1e0
      // 1dc: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1df: athrow
      // 1e0: iload 7
      // 1e2: ifeq 1ec
      // 1e5: goto 00d
      // 1e8: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1eb: athrow
      // 1ec: aload 6
      // 1ee: invokevirtual java/util/HashSet.isEmpty ()Z
      // 1f1: ifeq 205
      // 1f4: aload 0
      // 1f5: getfield rip/breeze/client/ConfigManager.linkedBlockingQueue_e Ljava/util/concurrent/LinkedBlockingQueue;
      // 1f8: invokevirtual java/util/concurrent/LinkedBlockingQueue.isEmpty ()Z
      // 1fb: ifne 237
      // 1fe: goto 205
      // 201: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 204: athrow
      // 205: new rip/breeze/client/DelayedPacket
      // 208: dup
      // 209: aload 5
      // 20b: getfield rip/breeze/client/PacketUtil.packet_a Lnet/minecraft/network/Packet;
      // 20e: invokestatic java/lang/System.currentTimeMillis ()J
      // 211: getstatic rip/breeze/client/EnumType19.CONST_IN Lrip/breeze/client/EnumType19;
      // 214: aload 6
      // 216: aload 5
      // 218: getfield rip/breeze/client/PacketUtil.networkManager_b Lnet/minecraft/network/NetworkManager;
      // 21b: invokespecial rip/breeze/client/DelayedPacket.<init> (Lnet/minecraft/network/Packet;JLrip/breeze/client/EnumType19;Ljava/util/HashSet;Lnet/minecraft/network/NetworkManager;)V
      // 21e: astore 8
      // 220: aload 0
      // 221: getfield rip/breeze/client/ConfigManager.linkedBlockingQueue_c Ljava/util/concurrent/LinkedBlockingQueue;
      // 224: aload 8
      // 226: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // 229: pop
      // 22a: aload 0
      // 22b: getfield rip/breeze/client/ConfigManager.linkedBlockingQueue_e Ljava/util/concurrent/LinkedBlockingQueue;
      // 22e: aload 8
      // 230: invokevirtual java/util/concurrent/LinkedBlockingQueue.add (Ljava/lang/Object;)Z
      // 233: pop
      // 234: goto 26f
      // 237: aload 5
      // 239: getfield rip/breeze/client/PacketUtil.packet_a Lnet/minecraft/network/Packet;
      // 23c: astore 8
      // 23e: new rip/breeze/client/PacketReceiveEventEvent
      // 241: dup
      // 242: aload 8
      // 244: invokespecial rip/breeze/client/PacketReceiveEventEvent.<init> (Lnet/minecraft/network/Packet;)V
      // 247: astore 9
      // 249: aload 9
      // 24b: invokestatic rip/breeze/EventBus.checkCondition (Lrip/breeze/CancellableEvent;)Z
      // 24e: ifne 26a
      // 251: aload 5
      // 253: getfield rip/breeze/client/PacketUtil.packet_a Lnet/minecraft/network/Packet;
      // 256: aload 5
      // 258: getfield rip/breeze/client/PacketUtil.networkManager_b Lnet/minecraft/network/NetworkManager;
      // 25b: invokevirtual net/minecraft/network/NetworkManager.getNetHandler ()Lnet/minecraft/network/INetHandler;
      // 25e: invokeinterface net/minecraft/network/Packet.processPacket (Lnet/minecraft/network/INetHandler;)V 2
      // 263: goto 26a
      // 266: invokestatic rip/breeze/client/ConfigManager.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 269: athrow
      // 26a: goto 26f
      // 26d: astore 8
      // 26f: iload 4
      // 271: ifne 00d
      // 274: return
      // try (224 -> 233): 234 java/lang/Exception
      // try (184 -> 191): 192 java/lang/Exception
      // try (179 -> 182): 182 java/lang/Exception
      // try (172 -> 176): 177 java/lang/Exception
      // try (157 -> 167): 168 java/lang/Exception
      // try (145 -> 154): 154 java/lang/Exception
      // try (82 -> 89): 90 java/lang/Exception
      // try (77 -> 80): 80 java/lang/Exception
      // try (70 -> 74): 75 java/lang/Exception
      // try (55 -> 65): 66 java/lang/Exception
      // try (43 -> 52): 52 java/lang/Exception
      // try (12 -> 20): 20 java/lang/Exception
      // try (11 -> 16): 17 java/lang/Exception
      // try (216 -> 236): 237 java/lang/Exception
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private void sendPacket_2() {
      long var1 = 39141346639285L;
      boolean var3 = isValid();

      while (!this.linkedBlockingQueue_c.isEmpty()) {
         DelayedPacket var4;
         label76: {
            try {
               var4 = this.linkedBlockingQueue_c.peek();
               if (var4 != null) {
                  break label76;
               }
            } catch (Exception var14) {
               var14.printStackTrace();
               if (var3) {
                  break;
               }
               continue;
            }

            if (!var3) {
               break;
            }
         }

         label71: {
            try {
               if (var4.networkManager_l.isChannelOpen()) {
                  break label71;
               }

               this.linkedBlockingQueue_c.remove(var4);
               this.linkedBlockingQueue_d.remove(var4);
               this.linkedBlockingQueue_e.remove(var4);
            } catch (Exception var13) {
               var13.printStackTrace();
               if (var3) {
                  break;
               }
               continue;
            }

            if (!var3) {
               continue;
            }
         }

         try {
            label64: {
               label84: {
                  try {
                     if (!DelayedPacket.isValid_4(var4)) {
                        break label64;
                     }

                     if (var4.enum_IN_i != EnumType19.CONST_IN) {
                        break label84;
                     }
                  } catch (Exception var11) {
                     throw getException(var11);
                  }

                  this.linkedBlockingQueue_e.remove(this.linkedBlockingQueue_c.poll());
                  Packet var5 = var4.packet_g;
                  PacketReceiveEventEvent var6 = new PacketReceiveEventEvent(var5);

                  try {
                     if (!EventBus.checkCondition(var6)) {
                        var4.packet_g.processPacket(var4.networkManager_l.getNetHandler());
                     }
                  } catch (Exception var7) {
                     throw getException(var7);
                  }

                  try {
                     if (!var3) {
                        continue;
                     }
                  } catch (Exception var10) {
                     throw getException(var10);
                  }
               }

               try {
                  this.linkedBlockingQueue_d.remove(this.linkedBlockingQueue_c.poll());
                  this.list_b.add(var4.packet_g);
                  BreezeClient.CONST_A.thePlayer.sendQueue.addToSendQueue(var4.packet_g);
                  if (!var3) {
                     continue;
                  }
               } catch (Exception var9) {
                  throw getException(var9);
               }
            }
         } catch (Exception var12) {
            var12.printStackTrace();
            if (var3) {
               break;
            }
            continue;
         }

         try {
            if (var3) {
               continue;
            }
            break;
         } catch (Exception var8) {
            throw getException(var8);
         }
      }
   }

   public void processAll(IBreezeInterface3 var1) {
      long var2 = 7283476835932L;
      boolean var10000 = checkCondition_3();
      Iterator var4 = this.linkedBlockingQueue_c.iterator();
      boolean var5 = var10000;

      while (var4.hasNext()) {
         DelayedPacket var6 = (DelayedPacket)var4.next();
         var6.hashSet_j.remove(var1);
         if (!var5) {
            break;
         }
      }
   }

   public ArrayList<DelayedPacket> getArrayList(IBreezeInterface3 var1) {
      long var2 = 42032476763135L;
      ArrayList var4 = new ArrayList();
      boolean var10000 = isValid();
      Iterator var5 = this.linkedBlockingQueue_c.iterator();
      boolean var6 = var10000;

      while (var5.hasNext()) {
         DelayedPacket var7 = (DelayedPacket)var5.next();
         if (var7.isValid_2(var1)) {
            var4.add(var7);
         }

         if (var6) {
            break;
         }
      }

      return var4;
   }

   public ArrayList<DelayedPacket> getArrayList_2(IBreezeInterface3 var1) {
      long var2 = 89521101157549L;
      boolean var10000 = checkCondition_3();
      ArrayList var4 = new ArrayList();
      boolean var5 = var10000;

      for (DelayedPacket var7 : this.linkedBlockingQueue_e) {
         if (var7.isValid_2(var1)) {
            var4.add(var7);
         }

         if (!var5) {
            break;
         }
      }

      return var4;
   }

   public ArrayList<DelayedPacket> getArrayList_3(IBreezeInterface3 var1) {
      long var2 = 27932112614563L;
      ArrayList var4 = new ArrayList();
      boolean var10000 = checkCondition_3();
      Iterator var5 = this.linkedBlockingQueue_d.iterator();
      boolean var6 = var10000;

      while (var5.hasNext()) {
         DelayedPacket var7 = (DelayedPacket)var5.next();
         if (var7.isValid_2(var1)) {
            var4.add(var7);
         }

         if (!var6) {
            break;
         }
      }

      return var4;
   }

   private static boolean lambda$onRunGameLoop_Inner2(IBreezeInterface3 var0, DelayedPacket var1) {
      return var1.isValid_2(var0);
   }

   private int lambda$setPriority_Inner1(IBreezeInterface3 var1, IBreezeInterface3 var2) {
      return this.concurrentHashMap_i.get(var2) - this.concurrentHashMap_i.get(var1);
   }

   private int lambda$registerModule_Inner0(IBreezeInterface3 var1, IBreezeInterface3 var2) {
      return this.concurrentHashMap_i.get(var2) - this.concurrentHashMap_i.get(var1);
   }

   public static void toggle(boolean var0) {
      fieldBool_n = var0;
   }

   public static boolean isValid() {
      return fieldBool_n;
   }

   public static boolean checkCondition_3() {
      boolean var0 = isValid();
      return !var0;
   }

   static {
      toggle(false);
      long var0 = 134927709619950L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var4 = new long[2];
      int var5 = 0;
      String var6 = "I\u009fu9\u0082µù^Ê\u0087\u0018\u0089Þ»qg";
      int var7 = "I\u009fu9\u0082µù^Ê\u0087\u0018\u0089Þ»qg".length();
      byte var8 = 0;

      do {
         int var10001 = var8;
         var8 += 8;
         byte[] var9 = var6.substring(var10001, var8).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)(var10 >>> 56),
               (byte)(var10 >>> 48),
               (byte)(var10 >>> 40),
               (byte)(var10 >>> 32),
               (byte)(var10 >>> 24),
               (byte)(var10 >>> 16),
               (byte)(var10 >>> 8),
               (byte)var10
            }
         );
         long var10004 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var14 = -1;
         var4[var10001] = var10004;
      } while (var8 < var7);

      CONST_P = var4;
      CONST_Q = new Long[2];
   }

   private static Exception getException(Exception var0) {
      return var0;
   }

   private static long decrypt(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14261;
      if (CONST_Q[var3] == null) {
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
         long var5 = CONST_P[var3];
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
         Object[] var9 = (Object[])CONST_R.get(var8);

         byte[] var13;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_R.put(var8, var9);
            }

            DESKeySpec var10 = new DESKeySpec(var4);
            SecretKey var11 = ((SecretKeyFactory)var9[1]).generateSecret(var10);
            Cipher var12 = (Cipher)var9[0];
            var12.init(2, var11, (IvParameterSpec)var9[2]);
            var13 = var12.doFinal(var7);
         } catch (Exception var16) {
            throw new RuntimeException("rip/breeze/client/eo", var16);
         }

         long var14 = (var13[0] & 255L) << 56
            | (var13[1] & 255L) << 48
            | (var13[2] & 255L) << 40
            | (var13[3] & 255L) << 32
            | (var13[4] & 255L) << 24
            | (var13[5] & 255L) << 16
            | (var13[6] & 255L) << 8
            | var13[7] & 255L;
         CONST_Q[var3] = var14;
      }

      return CONST_Q[var3];
   }

   private static long getLong(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = decrypt(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite getCallSite(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("getLong".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rip/breeze/client/eo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
