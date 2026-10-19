package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.annotations.JSFunction;
import rip.breeze.client.ConfigManager;
import rip.breeze.client.EnumType27;

@ScriptNamespace(
   name = "spoofManager",
   description = "Spoofing manager.",
   example = "const delay = new IntSetting(script, \"Delay\", \"The amount of ms to delay each packet for\", 500, 0, 5000);\n\nspoofManager.onPacketSend(packet => {\n    return \"DELAY\";\n});\n\nspoofManager.onUpdate((packets) => {\n    for (let packet of packets) {\n        if (packet.hasAged(delay.getValue())) {\n            spoofManager.release(packet);\n        }\n    }\n});"
)
public class PacketUtils extends HttpUtil4 implements rip.breeze.client.IBreezeInterface3 {
   private final ImageUtil15 dataBuilder17_g;
   private final ConfigManager configManager_h;
   private boolean fieldBool_i;
   private int fieldInt_j;
   private Function function_k;
   private Function function_l;
   private Function function_m;
   private static final String[] CONST_O;
   private static final String[] CONST_P;
   private static final Map CONST_Q = new HashMap(13);
   private static final long eka_1;

   public PacketUtils(ImageUtil15 var1, ConfigManager var2) {
      long var3 = 84695464307067L;
      super();
      this.fieldBool_i = false;
      this.fieldInt_j = (int)118310844172861445L;
      this.dataBuilder17_g = var1;
      this.configManager_h = var2;
      var1.initialize(this::initialize);
   }

   private void initialize() {
      if (this.fieldBool_i) {
         this.configManager_h.update_2(this);
      }
   }

   @JSFunction(
      value = "sendPacket",
      description = "Sends a packet to the server.",
      params = {"The packet to send.", "Whether the packet is an event."},
      remarks = "Sending server packets to the server is in most cases a very good way to get yourself banned!"
   )
   public void initialize_2(PacketUtil14<?> var1, boolean var2) {
      this.configManager_h.update_4((net.minecraft.network.Packet<?>)var1.b(), var2);
   }

   @JSFunction("setPriority")
   public void processAll(int var1) {
      long var2 = 35500689442493L;
      if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() != this.dataBuilder17_g) {
         Context.reportError("Cannot set priority outside of the script initialization phase.");
      }

      this.fieldInt_j = var1;
      if (this.fieldBool_i) {
         this.configManager_h.update_3(this, var1);
      }
   }

   @JSFunction(
      value = "onPacketSend",
      description = "Register the callback for outbound packets. \n\nYou should return a valid SpoofAction which can be:\n- PROCESS: Does nothing lets the packet continue just like normal.\n- CANCEL: Cancels the packet entirely.\n- DELAY: Starts delaying the packet until you decide to release it.",
      example = "spoofManager.onPacketSend(packet => {\n    if (packet instanceof C0BPacketEntityAction && packet.getAction() === \"START_SNEAKING\") {\n        return \"CANCEL\"; // Cancel sneaking packets\n    }\n    return \"PROCESS\";\n});"
   )
   public void onPacketSend(@ForceParamType("(packet: Packet) => SpoofAction") Function var1) {
      long var2 = 52483192177972L;
      if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() != this.dataBuilder17_g) {
         Context.reportError("Cannot bind onPacketSend outside of the script initialization phase.");
      }

      this.toggle();
      this.function_k = var1;
   }

   @JSFunction(
      value = "onPacketReceive",
      description = "Register the callback for inbound packets. \n\nYou should return a valid SpoofAction which can be:\n- PROCESS: Does nothing lets the packet continue just like normal.\n- CANCEL: Cancels the packet entirely.\n- DELAY: Starts delaying the packet until you decide to release it.",
      example = "spoofManager.onPacketReceive(packet => {\n    if (packet instanceof S08PacketPlayerPosLook) {\n        return \"DELAY\"; // Delay the packet for now until we release it.\n    }\n    return \"PROCESS\";\n});"
   )
   public void onPacketReceive(@ForceParamType("(packet: Packet) => SpoofAction") Function var1) {
      long var2 = 79951524377091L;
      if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() != this.dataBuilder17_g) {
         Context.reportError("Cannot bind onPacketSend outside of the script initialization phase.");
      }

      this.toggle();
      this.function_l = var1;
   }

   @JSFunction(
      value = "onUpdate",
      description = "Register the callback for updates. This is called whenever a packet is delayed.\n\nYou can use this to release packets after a certain amount of time.",
      example = "spoofManager.onUpdate(packets => {\n    for (let packet of packets) {\n        if (packet.hasAged(1000)) { // Release after 1 second\n            spoofManager.release(packet);\n        }\n    }\n});"
   )
   public void onUpdate(@ForceParamType("(packets: DelayedPacket[]) => void") Function var1) {
      long var2 = 5484877796189L;
      if (BreezeContext.dataBuilder15_j.getDataBuilder17_f() != this.dataBuilder17_g) {
         Context.reportError("Cannot bind onUpdate outside of the script initialization phase.");
      }

      this.toggle();
      this.function_m = var1;
   }

   @JSFunction(value = "release", description = "Releases the packet.")
   public void update(rip.breeze.client.DelayedPacket var1) {
      var1.update(this);
   }

   @JSFunction(value = "flushAll", description = "Releases all delayed packets.")
   public void initialize_3() {
      this.configManager_h.processAll(this);
   }

   @JSFunction(value = "flushIncoming", description = "Releases all delayed inbound packets.")
   public void initialize_4() {
      this.configManager_h.getArrayList_2(this).forEach(this::update);
   }

   @JSFunction(value = "flushOutgoing", description = "Releases all delayed outbound packets.")
   public void initialize_5() {
      this.configManager_h.getArrayList_3(this).forEach(this::update);
   }

   public EnumType27 getEnum_PROCESS(net.minecraft.network.Packet<?> param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/PacketUtils.99086806082953L J
      // 003: ldc2_w 71721044452857
      // 006: lxor
      // 007: lstore 3
      // 008: aload 0
      // 009: getfield rip/breeze/PacketUtils.function_k Lorg/mozilla/javascript/Function;
      // 00c: ifnull 020
      // 00f: aload 0
      // 010: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 013: invokevirtual rip/breeze/ImageUtil15.isValid ()Z
      // 016: ifne 028
      // 019: goto 020
      // 01c: invokestatic rip/breeze/PacketUtils.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01f: athrow
      // 020: getstatic rip/breeze/client/EnumType27.PROCESS Lrip/breeze/client/EnumType27;
      // 023: areturn
      // 024: invokestatic rip/breeze/PacketUtils.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: aconst_null
      // 029: astore 5
      // 02b: aload 0
      // 02c: getfield rip/breeze/PacketUtils.function_k Lorg/mozilla/javascript/Function;
      // 02f: aload 0
      // 030: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 033: getfield rip/breeze/ImageUtil15.context_x Lorg/mozilla/javascript/Context;
      // 036: aload 0
      // 037: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 03a: getfield rip/breeze/ImageUtil15.scriptable_y Lorg/mozilla/javascript/Scriptable;
      // 03d: aconst_null
      // 03e: bipush 1
      // 03f: anewarray 247
      // 042: dup
      // 043: bipush 0
      // 044: aload 1
      // 045: aload 0
      // 046: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 049: getfield rip/breeze/ImageUtil15.context_x Lorg/mozilla/javascript/Context;
      // 04c: aload 0
      // 04d: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 050: getfield rip/breeze/ImageUtil15.scriptable_y Lorg/mozilla/javascript/Scriptable;
      // 053: invokestatic rip/breeze/Util132.getDataBuilder11 (Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lrip/breeze/Util132;
      // 056: aastore
      // 057: invokeinterface org/mozilla/javascript/Function.call (Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object; 5
      // 05c: astore 5
      // 05e: goto 070
      // 061: astore 6
      // 063: aload 0
      // 064: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 067: aload 6
      // 069: invokevirtual rip/breeze/ImageUtil15.processAll_9 (Ljava/lang/Exception;)V
      // 06c: getstatic rip/breeze/client/EnumType27.PROCESS Lrip/breeze/client/EnumType27;
      // 06f: areturn
      // 070: aload 5
      // 072: instanceof java/lang/String
      // 075: ifne 094
      // 078: aload 0
      // 079: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 07c: sipush 15453
      // 07f: ldc2_w 8560486820025064555
      // 082: lload 3
      // 083: lxor
      // 084: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/PacketUtils.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: invokevirtual rip/breeze/ImageUtil15.processAll_6 (Ljava/lang/String;)V
      // 08c: getstatic rip/breeze/client/EnumType27.PROCESS Lrip/breeze/client/EnumType27;
      // 08f: areturn
      // 090: invokestatic rip/breeze/PacketUtils.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: aload 5
      // 096: checkcast java/lang/String
      // 099: astore 6
      // 09b: bipush -1
      // 09c: istore 7
      // 09e: aload 6
      // 0a0: invokevirtual java/lang/String.hashCode ()I
      // 0a3: lookupswitch 117 3 64930147 93 408463951 33 1980572282 66
      // 0c4: aload 6
      // 0c6: bipush 109
      // 0c8: ldc2_w 2892500224919887961
      // 0cb: lload 3
      // 0cc: lxor
      // 0cd: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/PacketUtils.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d5: ifeq 118
      // 0d8: goto 0df
      // 0db: invokestatic rip/breeze/PacketUtils.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: bipush 0
      // 0e0: istore 7
      // 0e2: goto 118
      // 0e5: aload 6
      // 0e7: sipush 1562
      // 0ea: ldc2_w 5674876220409734697
      // 0ed: lload 3
      // 0ee: lxor
      // 0ef: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/PacketUtils.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f7: ifeq 118
      // 0fa: bipush 1
      // 0fb: istore 7
      // 0fd: goto 118
      // 100: aload 6
      // 102: sipush 7872
      // 105: ldc2_w 2879055674993901297
      // 108: lload 3
      // 109: lxor
      // 10a: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/PacketUtils.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 112: ifeq 118
      // 115: bipush 2
      // 116: istore 7
      // 118: iload 7
      // 11a: tableswitch 42 0 2 26 34 38
      // 134: getstatic rip/breeze/client/EnumType27.PROCESS Lrip/breeze/client/EnumType27;
      // 137: areturn
      // 138: invokestatic rip/breeze/PacketUtils.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b: athrow
      // 13c: getstatic rip/breeze/client/EnumType27.CANCEL Lrip/breeze/client/EnumType27;
      // 13f: areturn
      // 140: getstatic rip/breeze/client/EnumType27.DELAY Lrip/breeze/client/EnumType27;
      // 143: areturn
      // 144: aload 0
      // 145: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 148: sipush 31175
      // 14b: ldc2_w 5865519085303339512
      // 14e: lload 3
      // 14f: lxor
      // 150: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/PacketUtils.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: getstatic java/awt/Color.red Ljava/awt/Color;
      // 158: invokevirtual rip/breeze/ImageUtil15.processAll_8 (Ljava/lang/String;Ljava/awt/Color;)V
      // 15b: getstatic rip/breeze/client/EnumType27.PROCESS Lrip/breeze/client/EnumType27;
      // 15e: areturn
      // try (7 -> 16): 16 java/lang/Exception
      // try (4 -> 11): 12 java/lang/Exception
      // try (20 -> 44): 45 java/lang/Exception
      // try (52 -> 65): 65 java/lang/Exception
      // try (72 -> 83): 84 java/lang/Exception
      // try (110 -> 114): 114 java/lang/Exception
   }

   public EnumType27 getEnum_PROCESS_2(net.minecraft.network.Packet<?> param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/PacketUtils.99086806082953L J
      // 003: ldc2_w 1295933968984
      // 006: lxor
      // 007: lstore 3
      // 008: aload 0
      // 009: getfield rip/breeze/PacketUtils.function_l Lorg/mozilla/javascript/Function;
      // 00c: ifnull 020
      // 00f: aload 0
      // 010: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 013: invokevirtual rip/breeze/ImageUtil15.isValid ()Z
      // 016: ifne 028
      // 019: goto 020
      // 01c: invokestatic rip/breeze/PacketUtils.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01f: athrow
      // 020: getstatic rip/breeze/client/EnumType27.PROCESS Lrip/breeze/client/EnumType27;
      // 023: areturn
      // 024: invokestatic rip/breeze/PacketUtils.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: aconst_null
      // 029: astore 5
      // 02b: aload 0
      // 02c: getfield rip/breeze/PacketUtils.function_l Lorg/mozilla/javascript/Function;
      // 02f: aload 0
      // 030: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 033: getfield rip/breeze/ImageUtil15.context_x Lorg/mozilla/javascript/Context;
      // 036: aload 0
      // 037: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 03a: getfield rip/breeze/ImageUtil15.scriptable_y Lorg/mozilla/javascript/Scriptable;
      // 03d: aconst_null
      // 03e: bipush 1
      // 03f: anewarray 247
      // 042: dup
      // 043: bipush 0
      // 044: aload 1
      // 045: aload 0
      // 046: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 049: getfield rip/breeze/ImageUtil15.context_x Lorg/mozilla/javascript/Context;
      // 04c: aload 0
      // 04d: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 050: getfield rip/breeze/ImageUtil15.scriptable_y Lorg/mozilla/javascript/Scriptable;
      // 053: invokestatic rip/breeze/Util132.getDataBuilder11 (Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lrip/breeze/Util132;
      // 056: aastore
      // 057: invokeinterface org/mozilla/javascript/Function.call (Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object; 5
      // 05c: astore 5
      // 05e: goto 070
      // 061: astore 6
      // 063: aload 0
      // 064: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 067: aload 6
      // 069: invokevirtual rip/breeze/ImageUtil15.processAll_9 (Ljava/lang/Exception;)V
      // 06c: getstatic rip/breeze/client/EnumType27.PROCESS Lrip/breeze/client/EnumType27;
      // 06f: areturn
      // 070: aload 5
      // 072: instanceof java/lang/String
      // 075: ifne 094
      // 078: aload 0
      // 079: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 07c: sipush 31489
      // 07f: ldc2_w 8377817960387554461
      // 082: lload 3
      // 083: lxor
      // 084: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/PacketUtils.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: invokevirtual rip/breeze/ImageUtil15.processAll_6 (Ljava/lang/String;)V
      // 08c: getstatic rip/breeze/client/EnumType27.PROCESS Lrip/breeze/client/EnumType27;
      // 08f: areturn
      // 090: invokestatic rip/breeze/PacketUtils.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: aload 5
      // 096: checkcast java/lang/String
      // 099: astore 6
      // 09b: bipush -1
      // 09c: istore 7
      // 09e: aload 6
      // 0a0: invokevirtual java/lang/String.hashCode ()I
      // 0a3: lookupswitch 118 3 64930147 94 408463951 33 1980572282 67
      // 0c4: aload 6
      // 0c6: sipush 1036
      // 0c9: ldc2_w 401720991614227345
      // 0cc: lload 3
      // 0cd: lxor
      // 0ce: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/PacketUtils.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d6: ifeq 119
      // 0d9: goto 0e0
      // 0dc: invokestatic rip/breeze/PacketUtils.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: bipush 0
      // 0e1: istore 7
      // 0e3: goto 119
      // 0e6: aload 6
      // 0e8: sipush 30523
      // 0eb: ldc2_w 4330130723712770208
      // 0ee: lload 3
      // 0ef: lxor
      // 0f0: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/PacketUtils.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f8: ifeq 119
      // 0fb: bipush 1
      // 0fc: istore 7
      // 0fe: goto 119
      // 101: aload 6
      // 103: sipush 19981
      // 106: ldc2_w 545379555049609628
      // 109: lload 3
      // 10a: lxor
      // 10b: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/PacketUtils.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 113: ifeq 119
      // 116: bipush 2
      // 117: istore 7
      // 119: iload 7
      // 11b: tableswitch 41 0 2 25 33 37
      // 134: getstatic rip/breeze/client/EnumType27.PROCESS Lrip/breeze/client/EnumType27;
      // 137: areturn
      // 138: invokestatic rip/breeze/PacketUtils.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b: athrow
      // 13c: getstatic rip/breeze/client/EnumType27.CANCEL Lrip/breeze/client/EnumType27;
      // 13f: areturn
      // 140: getstatic rip/breeze/client/EnumType27.DELAY Lrip/breeze/client/EnumType27;
      // 143: areturn
      // 144: aload 0
      // 145: getfield rip/breeze/PacketUtils.dataBuilder17_g Lrip/breeze/ImageUtil15;
      // 148: sipush 21919
      // 14b: ldc2_w 4606584673167016454
      // 14e: lload 3
      // 14f: lxor
      // 150: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/PacketUtils.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: getstatic java/awt/Color.red Ljava/awt/Color;
      // 158: invokevirtual rip/breeze/ImageUtil15.processAll_8 (Ljava/lang/String;Ljava/awt/Color;)V
      // 15b: getstatic rip/breeze/client/EnumType27.PROCESS Lrip/breeze/client/EnumType27;
      // 15e: areturn
      // try (7 -> 16): 16 java/lang/Exception
      // try (4 -> 11): 12 java/lang/Exception
      // try (20 -> 44): 45 java/lang/Exception
      // try (52 -> 65): 65 java/lang/Exception
      // try (72 -> 83): 84 java/lang/Exception
      // try (110 -> 114): 114 java/lang/Exception
   }

   public void processNullable(ArrayList<rip.breeze.client.DelayedPacket> var1) {
      if (this.function_m != null && this.dataBuilder17_g.isValid()) {
         this.function_m.call(this.dataBuilder17_g.context_x, this.dataBuilder17_g.scriptable_y, null, new Object[]{var1});
      } else {
         this.configManager_h.processAll(this);
      }
   }

   private void toggle() {
      if (!this.fieldBool_i) {
         this.configManager_h.update_1(this, this.fieldInt_j);
         this.fieldBool_i = true;
      }
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return "SpoofManager";
   }

   static {
      long var0 = 27287219123334L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[15];
      int var5 = 0;
      String var6 = "@\u001d+bÔç\u001eÞ@èÔé\u0007\u008dü7MÖ\u009f\u008b]u2\u0010\u0099K'ç\u00886ûQX-\u0019\u007fêL\u0005\u0014\u0080nïÖeK@Ï\u007f\u0007X\"z?Ùi|%Ð¯\u0085¿ÉÀ\u0018[\u0086,o÷\u001fm\u0012Ø¬\u001bkxÂÞMÄ\u001eü\u0084J\u007fi·\u0010÷IdOnÔ}\u000f\u000bx\u0082±\tyÈûpI+lñ§T4åÕÈI\u0086Ó\u0013æ\u0086\\ð5\u0019ní\u009f\u008dRêö\u0085°ª,Ë\u0003¤jÞ\u0097aL×\u0091íÖ\u0004ãÆÔjPUbÌ`;\u000e³Æ76{r\"x\u0089ù³Ë\u009c\u0014c½9ãßÌ_&ôfXù\u00182%Þ±¢\u0010ó¿\\û\u009fM\u008dJðTºó\u0013Ú\u008a\u008fW¾ZoÕ½ä×h\u008cß:k\u0018\u008bã\u001cÙ\u0011Ç\t~ø³\u0012Ä4~\u009eÕ<G°\\:\u0089\u001cQD\u0088\u009d\u001eD\u0012GøvÅA\u008f¶\u0082dÁ!¹\u0096ä2·úÐó@<YFÙÒ \u0093\u0014·`@v\u007fÏ1ÞxU¸ \u0019¢$}6ß'@K üÀ,¢¤b@ÓúWØÛç¤\u0011\u0089ÔúÀ\u0010\u001764\tu2\u000e4øneº.\u0088\t\u0012\u0010\u0012\u0017¸~ùC\u0012áß\u008coiLÜº½\u0018zZznhóýÙÍ«ï[=?\u0096\u0017'âÍp,ûÅIpÿ\t\u0083eTY$L1gçG)\u0096\u0014\\\u001aëÙ[¼Å\u009d¦§²\u0097®3ä$\u0005X)_\u009cH§ÁX-c\u0091,\u0085´áq\u0014\u0099më4\u0015ZçöZùl1e\u0083X\u008aÖAJì>Ü\u0092ü\u000eÇ¿Ý3\u0096B_S\u008b×\u0093óa\u0083\u009b½UÍ\u008d¤\u0088\u0083-\u009bË\u0085_}Ãëfgø÷\f;\u00863x\u0003Wy½ÌÉ;ó\u001e}»\u008c3\u0091\u0000í\u0084\u007f\u0088L\u008b®¥\u0080\u0017\u0093o\u0084Ê\u0098\u008a\f8ç\u009f\u0081¿\"4¸B\u0014èüÿ]M\u0082î#\u001dE\u0081:\u0004O\u0080\"ÿ1|,¿?PY\u00ad\u0007 íñ¢\u0013x¨R\u0097\u008f\u0010<Ç\u0097\u0011r/í©^\u0083`®Õ8\u0080ÆeI\u008a7yûÖÇçÖeßD\u00ad1ÉÃ\u008dQí¶[Ó+\u0006\u00100\u001alóõ\u0081ÿV\u008fû¿F#\u00873ÅHA3e+\u0011?©\u008cW÷ª¹YlX§=Ñ^wL=äÃË×À!\u0086(?O¥ùñI\u0014ò\u0085\u001b\u001b¬ñ\u001a«\u000e\u0081\u0083\u0019* AQíX¶\u0010ßaù.¡\bªÜé\u00adlÝ\u007f÷\u0013\u0010\u009e; (oN:xy\u0093<ÛeU)\u0087";
      int var7 = "@\u001d+bÔç\u001eÞ@èÔé\u0007\u008dü7MÖ\u009f\u008b]u2\u0010\u0099K'ç\u00886ûQX-\u0019\u007fêL\u0005\u0014\u0080nïÖeK@Ï\u007f\u0007X\"z?Ùi|%Ð¯\u0085¿ÉÀ\u0018[\u0086,o÷\u001fm\u0012Ø¬\u001bkxÂÞMÄ\u001eü\u0084J\u007fi·\u0010÷IdOnÔ}\u000f\u000bx\u0082±\tyÈûpI+lñ§T4åÕÈI\u0086Ó\u0013æ\u0086\\ð5\u0019ní\u009f\u008dRêö\u0085°ª,Ë\u0003¤jÞ\u0097aL×\u0091íÖ\u0004ãÆÔjPUbÌ`;\u000e³Æ76{r\"x\u0089ù³Ë\u009c\u0014c½9ãßÌ_&ôfXù\u00182%Þ±¢\u0010ó¿\\û\u009fM\u008dJðTºó\u0013Ú\u008a\u008fW¾ZoÕ½ä×h\u008cß:k\u0018\u008bã\u001cÙ\u0011Ç\t~ø³\u0012Ä4~\u009eÕ<G°\\:\u0089\u001cQD\u0088\u009d\u001eD\u0012GøvÅA\u008f¶\u0082dÁ!¹\u0096ä2·úÐó@<YFÙÒ \u0093\u0014·`@v\u007fÏ1ÞxU¸ \u0019¢$}6ß'@K üÀ,¢¤b@ÓúWØÛç¤\u0011\u0089ÔúÀ\u0010\u001764\tu2\u000e4øneº.\u0088\t\u0012\u0010\u0012\u0017¸~ùC\u0012áß\u008coiLÜº½\u0018zZznhóýÙÍ«ï[=?\u0096\u0017'âÍp,ûÅIpÿ\t\u0083eTY$L1gçG)\u0096\u0014\\\u001aëÙ[¼Å\u009d¦§²\u0097®3ä$\u0005X)_\u009cH§ÁX-c\u0091,\u0085´áq\u0014\u0099më4\u0015ZçöZùl1e\u0083X\u008aÖAJì>Ü\u0092ü\u000eÇ¿Ý3\u0096B_S\u008b×\u0093óa\u0083\u009b½UÍ\u008d¤\u0088\u0083-\u009bË\u0085_}Ãëfgø÷\f;\u00863x\u0003Wy½ÌÉ;ó\u001e}»\u008c3\u0091\u0000í\u0084\u007f\u0088L\u008b®¥\u0080\u0017\u0093o\u0084Ê\u0098\u008a\f8ç\u009f\u0081¿\"4¸B\u0014èüÿ]M\u0082î#\u001dE\u0081:\u0004O\u0080\"ÿ1|,¿?PY\u00ad\u0007 íñ¢\u0013x¨R\u0097\u008f\u0010<Ç\u0097\u0011r/í©^\u0083`®Õ8\u0080ÆeI\u008a7yûÖÇçÖeßD\u00ad1ÉÃ\u008dQí¶[Ó+\u0006\u00100\u001alóõ\u0081ÿV\u008fû¿F#\u00873ÅHA3e+\u0011?©\u008cW÷ª¹YlX§=Ñ^wL=äÃË×À!\u0086(?O¥ùñI\u0014ò\u0085\u001b\u001b¬ñ\u001a«\u000e\u0081\u0083\u0019* AQíX¶\u0010ßaù.¡\bªÜé\u00adlÝ\u007f÷\u0013\u0010\u009e; (oN:xy\u0093<ÛeU)\u0087"
         .length();
      char var8 = '@';
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
                     CONST_O = var4;
                     CONST_P = new String[15];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 199696490567676110L;
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
                     118310844172861445L = var30;
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

                  var6 = "AÃ\u009bêO\\\u008c\u0099Um\u008fc\u001d|ÇöL×WÔ)\u0000\u0089\búµÊ®³¬\u0017\u001dÉº\u0019m¾õðåEbv3CðSÃÒ\u0010ú@e5\u0007UËzZ¨7YQ0$¤Ò\u008büî\u0014Ö\u001eÐ\u0087\u0094?\u008d\u0082¸\u0094úÎ\u0012p\u008d\u009fÏïípg\u008a8¾Ð\u0090¤\"PZß@àÕÜÉÁ$Ûæ\b_û\u009eåòÂ[¶UêÎµõ9ÿ-aïLwÙî\u00052ëq?¦×Òe©\u0016®Ë\u0088Ä\"x\u001d°f¬ÊcËI¦&$:¦,\u0017¯ Ê»\u008d©\u008ea\u008cz%ä\u008eÕeï\u0001s¹Ôa¨1çrúÔjA\"kgÁ\u009d\u001f\u00147fB\u0088\u0011øÛW£üÿAö·%Þ\u0087YÒ,fé\u0003þµ\u009cH\u0000\t+î\u0012 \t÷I'äH";
                  var7 = "AÃ\u009bêO\\\u008c\u0099Um\u008fc\u001d|ÇöL×WÔ)\u0000\u0089\búµÊ®³¬\u0017\u001dÉº\u0019m¾õðåEbv3CðSÃÒ\u0010ú@e5\u0007UËzZ¨7YQ0$¤Ò\u008büî\u0014Ö\u001eÐ\u0087\u0094?\u008d\u0082¸\u0094úÎ\u0012p\u008d\u009fÏïípg\u008a8¾Ð\u0090¤\"PZß@àÕÜÉÁ$Ûæ\b_û\u009eåòÂ[¶UêÎµõ9ÿ-aïLwÙî\u00052ëq?¦×Òe©\u0016®Ë\u0088Ä\"x\u001d°f¬ÊcËI¦&$:¦,\u0017¯ Ê»\u008d©\u008ea\u008cz%ä\u008eÕeï\u0001s¹Ôa¨1çrúÔjA\"kgÁ\u009d\u001f\u00147fB\u0088\u0011øÛW£üÿAö·%Þ\u0087YÒ,fé\u0003þµ\u009cH\u0000\t+î\u0012 \t÷I'äH"
                     .length();
                  var8 = '`';
                  var17 = -1;
            }

            var18 = var6.substring(++var17, var17 + var8);
            var10001 = 0;
         }
      }
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8262;
      if (CONST_P[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_Q.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_Q.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/aR", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_O[var3].getBytes("ISO-8859-1");
         CONST_P[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_P[var3];
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
         throw new RuntimeException("rip/breeze/aR" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
