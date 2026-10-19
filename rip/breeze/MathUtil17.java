package rip.breeze;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
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
import rip.breeze.client.EnumType3;

public final class MathUtil17 extends RenderUtil43<BreezeColor> {
   private final rip.breeze.client.AnimationTimer dataBuilder15_n;
   private final rip.breeze.client.AnimationTimer dataBuilder15_o;
   private final RenderUtil30 dataBuilder43_p;
   private final RenderUtil9 dataBuilder119_q;
   private final RenderUtil9 dataBuilder119_r;
   private StringDecryptHelper6 stringDecryptHelper6_s;
   private LicenseState licenseState_t;
   private boolean fieldBool_u;
   private static final String[] CONST_W;
   private static final String[] CONST_X;
   private static final Map CONST_Y = new HashMap(13);

   public MathUtil17(GenericSetting<BreezeColor> var1) {
      long var2 = 96169216256514L;
      super(var1);
      this.dataBuilder15_n = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.BACK_OUT);
      this.dataBuilder15_o = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.LINEAR);
      this.dataBuilder43_p = new RenderUtil30(this.k(), this.dataBuilder15_n);
      this.licenseState_t = new LicenseState(0.0F, 0.0F, 60.0F, 35.0F);
      this.fieldBool_u = true;
      this.stringDecryptHelper6_s = new StringDecryptHelper6(((BreezeColor)var1.getObject_m()).buildString(), new LicenseState(), this::lambda$new_Inner0, true);
      LicenseState var10003 = new LicenseState();
      short var10004 = 19655;
      long var10005 = 6498213388365432738L ^ var2;
      this.dataBuilder119_q = new RenderUtil9(var10003, "icons/paste.png", MathUtil17::lambda$new_Inner1);
      var10003 = new LicenseState();
      var10004 = 32080;
      var10005 = 2822587719525250610L ^ var2;
      this.dataBuilder119_r = new RenderUtil9(var10003, "icons/paste.png", this::lambda$new_Inner2);
      this.stringDecryptHelper6_s.processAll(new Util134(0.0F, 8.0F));
   }

   private void processAll(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil17.30622631388982L J
      // 03: ldc2_w 132688699501600
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic rip/breeze/RenderUtil30.getValue ()I
      // 0b: aload 1
      // 0c: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0f: astore 4
      // 11: istore 5
      // 13: aload 4
      // 15: ldc "#"
      // 17: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1a: ifeq 2a
      // 1d: aload 4
      // 1f: bipush 1
      // 20: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 23: astore 4
      // 25: iload 5
      // 27: ifeq 6a
      // 2a: aload 4
      // 2c: sipush 13763
      // 2f: ldc2_w 8742668443493441457
      // 32: lload 2
      // 33: lxor
      // 34: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil17.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 3c: ifne 62
      // 3f: goto 46
      // 42: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 45: athrow
      // 46: aload 4
      // 48: sipush 26702
      // 4b: ldc2_w 1625720761777373757
      // 4e: lload 2
      // 4f: lxor
      // 50: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil17.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 58: ifeq 6a
      // 5b: goto 62
      // 5e: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 61: athrow
      // 62: aload 4
      // 64: bipush 2
      // 65: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 68: astore 4
      // 6a: aload 4
      // 6c: invokevirtual java/lang/String.length ()I
      // 6f: bipush 6
      // 71: if_icmpeq 79
      // 74: return
      // 75: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 78: athrow
      // 79: aload 0
      // 7a: invokevirtual rip/breeze/MathUtil17.k ()Lrip/breeze/GenericSetting;
      // 7d: astore 6
      // 7f: aload 6
      // 81: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 84: checkcast rip/breeze/BreezeColor
      // 87: astore 7
      // 89: new java/awt/Color
      // 8c: dup
      // 8d: aload 4
      // 8f: bipush 16
      // 91: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 94: invokespecial java/awt/Color.<init> (I)V
      // 97: astore 8
      // 99: aload 6
      // 9b: new rip/breeze/BreezeColor
      // 9e: dup
      // 9f: aload 8
      // a1: invokevirtual java/awt/Color.getRed ()I
      // a4: aload 8
      // a6: invokevirtual java/awt/Color.getGreen ()I
      // a9: aload 8
      // ab: invokevirtual java/awt/Color.getBlue ()I
      // ae: aload 7
      // b0: invokevirtual rip/breeze/BreezeColor.getValue_5 ()I
      // b3: aload 7
      // b5: invokevirtual rip/breeze/BreezeColor.isBool_d ()Z
      // b8: invokespecial rip/breeze/BreezeColor.<init> (IIIIZ)V
      // bb: invokevirtual rip/breeze/GenericSetting.processAll (Ljava/lang/Object;)V
      // be: goto c3
      // c1: astore 6
      // c3: return
      // try (45 -> 50): 50 java/lang/NumberFormatException
      // try (19 -> 38): 39 java/lang/NumberFormatException
      // try (17 -> 27): 28 java/lang/NumberFormatException
      // try (52 -> 81): 82 java/lang/NumberFormatException
   }

   public void processAll_2(float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MathUtil17.30622631388982L J
      // 003: ldc2_w 3339529165428
      // 006: lxor
      // 007: lstore 4
      // 009: lload 4
      // 00b: dup2
      // 00c: ldc2_w 22603910165621
      // 00f: lxor
      // 010: lstore 6
      // 012: dup2
      // 013: ldc2_w 85972512685926
      // 016: lxor
      // 017: lstore 8
      // 019: dup2
      // 01a: ldc2_w 46241641281725
      // 01d: lxor
      // 01e: lstore 10
      // 020: pop2
      // 021: aload 0
      // 022: fload 1
      // 023: fload 2
      // 024: fload 3
      // 025: invokespecial rip/breeze/RenderUtil43.calculate (FFF)V
      // 028: invokestatic rip/breeze/RenderUtil30.getValue ()I
      // 02b: aload 0
      // 02c: getfield rip/breeze/MathUtil17.dataBuilder15_o Lrip/breeze/client/AnimationTimer;
      // 02f: aload 0
      // 030: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 033: fload 1
      // 034: fload 2
      // 035: invokevirtual rip/breeze/LicenseState.isValid (FF)Z
      // 038: lload 6
      // 03a: dup2_x1
      // 03b: pop2
      // 03c: invokevirtual rip/breeze/client/AnimationTimer.toggle (JZ)V
      // 03f: istore 12
      // 041: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 044: sipush 10388
      // 047: ldc2_w 7123625802844714165
      // 04a: lload 4
      // 04c: lxor
      // 04d: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil17.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 055: fstore 13
      // 057: aload 0
      // 058: invokevirtual rip/breeze/MathUtil17.k ()Lrip/breeze/GenericSetting;
      // 05b: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 05e: checkcast java/awt/Color
      // 061: astore 14
      // 063: aload 14
      // 065: aload 14
      // 067: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
      // 06a: aload 0
      // 06b: getfield rip/breeze/MathUtil17.dataBuilder15_o Lrip/breeze/client/AnimationTimer;
      // 06e: lload 10
      // 070: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 073: d2f
      // 074: invokestatic rip/breeze/RenderUtil1.clamp (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 077: astore 15
      // 079: aload 0
      // 07a: invokevirtual rip/breeze/MathUtil17.k ()Lrip/breeze/GenericSetting;
      // 07d: getfield rip/breeze/GenericSetting.fieldBool_j Z
      // 080: ifeq 0c8
      // 083: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 086: aload 0
      // 087: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 08a: getfield rip/breeze/LicenseState.fieldFloat_a F
      // 08d: aload 0
      // 08e: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 091: getfield rip/breeze/LicenseState.fieldFloat_b F
      // 094: aload 0
      // 095: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 098: getfield rip/breeze/LicenseState.fieldFloat_c F
      // 09b: aload 0
      // 09c: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 09f: getfield rip/breeze/LicenseState.fieldFloat_d F
      // 0a2: fload 13
      // 0a4: ldc_w 14.0
      // 0a7: invokeinterface rip/breeze/IRenderer.setupTransform (FFFFFF)V 7
      // 0ac: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 0af: aload 0
      // 0b0: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 0b3: fload 13
      // 0b5: aload 15
      // 0b7: invokeinterface rip/breeze/IRenderer.strokeRoundedRect (Lrip/breeze/LicenseState;FLjava/awt/Color;)V 4
      // 0bc: iload 12
      // 0be: ifeq 0e5
      // 0c1: goto 0c8
      // 0c4: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0c7: athrow
      // 0c8: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 0cb: aload 0
      // 0cc: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 0cf: fload 13
      // 0d1: aload 15
      // 0d3: sipush 255
      // 0d6: invokestatic rip/breeze/RenderUtil1.getColor_7 (Ljava/awt/Color;I)Ljava/awt/Color;
      // 0d9: invokeinterface rip/breeze/IRenderer.strokeRoundedRect (Lrip/breeze/LicenseState;FLjava/awt/Color;)V 4
      // 0de: goto 0e5
      // 0e1: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 0e9: getfield rip/breeze/LicenseState.fieldFloat_a F
      // 0ec: aload 0
      // 0ed: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 0f0: getfield rip/breeze/LicenseState.fieldFloat_b F
      // 0f3: aload 0
      // 0f4: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 0f7: getfield rip/breeze/LicenseState.fieldFloat_c F
      // 0fa: aload 0
      // 0fb: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 0fe: getfield rip/breeze/LicenseState.fieldFloat_d F
      // 101: fload 13
      // 103: getstatic rip/breeze/RenderUtil30.CONST_T Ljava/awt/Color;
      // 106: invokestatic rip/breeze/RenderUtil30.clamp (FFFFFLjava/awt/Color;)V
      // 109: aload 0
      // 10a: getfield rip/breeze/MathUtil17.stringDecryptHelper6_s Lrip/breeze/StringDecryptHelper6;
      // 10d: invokevirtual rip/breeze/StringDecryptHelper6.isValid_2 ()Z
      // 110: ifne 124
      // 113: aload 0
      // 114: getfield rip/breeze/MathUtil17.stringDecryptHelper6_s Lrip/breeze/StringDecryptHelper6;
      // 117: ldc_w ""
      // 11a: invokevirtual rip/breeze/StringDecryptHelper6.clamp_8 (Ljava/lang/String;)V
      // 11d: goto 124
      // 120: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 123: athrow
      // 124: aload 0
      // 125: getfield rip/breeze/MathUtil17.stringDecryptHelper6_s Lrip/breeze/StringDecryptHelper6;
      // 128: aload 0
      // 129: invokevirtual rip/breeze/MathUtil17.k ()Lrip/breeze/GenericSetting;
      // 12c: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 12f: checkcast rip/breeze/BreezeColor
      // 132: invokevirtual rip/breeze/BreezeColor.buildString ()Ljava/lang/String;
      // 135: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 138: aload 0
      // 139: getfield rip/breeze/MathUtil17.stringDecryptHelper6_s Lrip/breeze/StringDecryptHelper6;
      // 13c: fload 1
      // 13d: fload 2
      // 13e: fload 3
      // 13f: invokevirtual rip/breeze/StringDecryptHelper6.update (FFF)V
      // 142: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 145: aload 0
      // 146: getfield rip/breeze/MathUtil17.stringDecryptHelper6_s Lrip/breeze/StringDecryptHelper6;
      // 149: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 14c: sipush 12107
      // 14f: ldc2_w 5546451749367395176
      // 152: lload 4
      // 154: lxor
      // 155: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil17.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 15d: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 160: sipush 11323
      // 163: ldc2_w 3193881507608277023
      // 166: lload 4
      // 168: lxor
      // 169: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil17.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 171: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 174: sipush 2186
      // 177: ldc2_w 4457328271801947306
      // 17a: lload 4
      // 17c: lxor
      // 17d: invokedynamic p (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil17.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 185: invokeinterface rip/breeze/IRenderer.fillRoundedRectTwoColor (Lrip/breeze/LicenseState;FFLjava/awt/Color;)V 5
      // 18a: aload 0
      // 18b: getfield rip/breeze/MathUtil17.fieldBool_u Z
      // 18e: ifeq 1ac
      // 191: aload 0
      // 192: getfield rip/breeze/MathUtil17.dataBuilder119_q Lrip/breeze/RenderUtil9;
      // 195: fload 1
      // 196: fload 2
      // 197: fload 3
      // 198: invokevirtual rip/breeze/RenderUtil9.calculate (FFF)V
      // 19b: aload 0
      // 19c: getfield rip/breeze/MathUtil17.dataBuilder119_r Lrip/breeze/RenderUtil9;
      // 19f: fload 1
      // 1a0: fload 2
      // 1a1: fload 3
      // 1a2: invokevirtual rip/breeze/RenderUtil9.calculate (FFF)V
      // 1a5: goto 1ac
      // 1a8: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1ab: athrow
      // 1ac: aload 0
      // 1ad: getfield rip/breeze/MathUtil17.dataBuilder15_n Lrip/breeze/client/AnimationTimer;
      // 1b0: lload 8
      // 1b2: invokevirtual rip/breeze/client/AnimationTimer.calculateDouble (J)D
      // 1b5: dconst_0
      // 1b6: dcmpl
      // 1b7: ifne 1ea
      // 1ba: aload 0
      // 1bb: getfield rip/breeze/MathUtil17.dataBuilder15_n Lrip/breeze/client/AnimationTimer;
      // 1be: invokevirtual rip/breeze/client/AnimationTimer.isBool_e ()Z
      // 1c1: ifne 1ea
      // 1c4: goto 1cb
      // 1c7: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1ca: athrow
      // 1cb: aload 0
      // 1cc: getfield rip/breeze/MathUtil17.dataBuilder43_p Lrip/breeze/RenderUtil30;
      // 1cf: getfield rip/breeze/RenderUtil30.f Z
      // 1d2: ifeq 1ea
      // 1d5: goto 1dc
      // 1d8: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1db: athrow
      // 1dc: aload 0
      // 1dd: getfield rip/breeze/MathUtil17.dataBuilder43_p Lrip/breeze/RenderUtil30;
      // 1e0: invokevirtual rip/breeze/RenderUtil30.decrypt ()V
      // 1e3: goto 1ea
      // 1e6: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1e9: athrow
      // 1ea: return
      // try (59 -> 87): 88 java/lang/NumberFormatException
      // try (63 -> 98): 99 java/lang/NumberFormatException
      // try (101 -> 124): 125 java/lang/NumberFormatException
      // try (127 -> 181): 182 java/lang/NumberFormatException
      // try (184 -> 195): 196 java/lang/NumberFormatException
      // try (191 -> 202): 203 java/lang/NumberFormatException
      // try (198 -> 208): 209 java/lang/NumberFormatException
   }

   @Override
   public boolean checkCondition(float param1, float param2, int param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil17.30622631388982L J
      // 03: ldc2_w 103650428769539
      // 06: lxor
      // 07: lstore 5
      // 09: lload 5
      // 0b: dup2
      // 0c: ldc2_w 81104409656066
      // 0f: lxor
      // 10: lstore 7
      // 12: pop2
      // 13: aload 0
      // 14: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 17: fload 1
      // 18: fload 2
      // 19: invokevirtual rip/breeze/LicenseState.isValid (FF)Z
      // 1c: ifeq 6f
      // 1f: iload 4
      // 21: ifne 6f
      // 24: goto 2b
      // 27: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield rip/breeze/MathUtil17.dataBuilder15_n Lrip/breeze/client/AnimationTimer;
      // 2f: aload 0
      // 30: getfield rip/breeze/MathUtil17.dataBuilder15_n Lrip/breeze/client/AnimationTimer;
      // 33: invokevirtual rip/breeze/client/AnimationTimer.isBool_e ()Z
      // 36: ifne 48
      // 39: goto 40
      // 3c: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 49
      // 44: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 47: athrow
      // 48: bipush 0
      // 49: lload 7
      // 4b: dup2_x1
      // 4c: pop2
      // 4d: invokevirtual rip/breeze/client/AnimationTimer.toggle (JZ)V
      // 50: aload 0
      // 51: getfield rip/breeze/MathUtil17.dataBuilder15_n Lrip/breeze/client/AnimationTimer;
      // 54: invokevirtual rip/breeze/client/AnimationTimer.isBool_e ()Z
      // 57: ifeq 6f
      // 5a: bipush 1
      // 5b: istore 4
      // 5d: aload 0
      // 5e: getfield rip/breeze/MathUtil17.dataBuilder43_p Lrip/breeze/RenderUtil30;
      // 61: bipush 1
      // 62: putfield rip/breeze/RenderUtil30.f Z
      // 65: getstatic rip/breeze/BreezeContext.guiPanelSettings_f Lrip/breeze/GuiPanelSettings;
      // 68: aload 0
      // 69: getfield rip/breeze/MathUtil17.dataBuilder43_p Lrip/breeze/RenderUtil30;
      // 6c: invokevirtual rip/breeze/GuiPanelSettings.update (Lrip/breeze/UIPanel;)V
      // 6f: aload 0
      // 70: getfield rip/breeze/MathUtil17.fieldBool_u Z
      // 73: ifeq 8f
      // 76: aload 0
      // 77: getfield rip/breeze/MathUtil17.dataBuilder119_q Lrip/breeze/RenderUtil9;
      // 7a: fload 1
      // 7b: fload 2
      // 7c: iload 3
      // 7d: iload 4
      // 7f: invokevirtual rip/breeze/RenderUtil9.checkCondition (FFIZ)Z
      // 82: ifeq 8f
      // 85: goto 8c
      // 88: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 8b: athrow
      // 8c: bipush 1
      // 8d: istore 4
      // 8f: aload 0
      // 90: getfield rip/breeze/MathUtil17.fieldBool_u Z
      // 93: ifeq c0
      // 96: aload 0
      // 97: getfield rip/breeze/MathUtil17.k Lrip/breeze/GenericSetting;
      // 9a: getfield rip/breeze/GenericSetting.fieldBool_k Z
      // 9d: ifne c0
      // a0: goto a7
      // a3: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // a6: athrow
      // a7: aload 0
      // a8: getfield rip/breeze/MathUtil17.dataBuilder119_r Lrip/breeze/RenderUtil9;
      // ab: fload 1
      // ac: fload 2
      // ad: iload 3
      // ae: iload 4
      // b0: invokevirtual rip/breeze/RenderUtil9.checkCondition (FFIZ)Z
      // b3: ifeq c0
      // b6: goto bd
      // b9: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // bc: athrow
      // bd: bipush 1
      // be: istore 4
      // c0: aload 0
      // c1: getfield rip/breeze/MathUtil17.k Lrip/breeze/GenericSetting;
      // c4: getfield rip/breeze/GenericSetting.fieldBool_k Z
      // c7: ifne e3
      // ca: aload 0
      // cb: getfield rip/breeze/MathUtil17.stringDecryptHelper6_s Lrip/breeze/StringDecryptHelper6;
      // ce: fload 1
      // cf: fload 2
      // d0: iload 3
      // d1: iload 4
      // d3: invokevirtual rip/breeze/StringDecryptHelper6.absValue (FFIZ)Z
      // d6: ifeq e3
      // d9: goto e0
      // dc: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // df: athrow
      // e0: bipush 1
      // e1: istore 4
      // e3: aload 0
      // e4: fload 1
      // e5: fload 2
      // e6: iload 3
      // e7: iload 4
      // e9: invokespecial rip/breeze/RenderUtil43.a (FFIZ)Z
      // ec: ireturn
      // try (10 -> 18): 19 java/lang/NumberFormatException
      // try (16 -> 27): 28 java/lang/NumberFormatException
      // try (21 -> 32): 32 java/lang/NumberFormatException
      // try (53 -> 64): 65 java/lang/NumberFormatException
      // try (69 -> 76): 77 java/lang/NumberFormatException
      // try (72 -> 87): 88 java/lang/NumberFormatException
      // try (92 -> 104): 105 java/lang/NumberFormatException
   }

   public void initialize(float var1, float var2, int var3) {
      this.stringDecryptHelper6_s.toggle(var1, var2, var3);
   }

   public void initialize_2() {
      super.h();
      this.dataBuilder43_p.decrypt();
   }

   public boolean checkCondition_2(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil17.30622631388982L J
      // 03: ldc2_w 55775867966745
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 40944958585624
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: aload 0
      // 12: getfield rip/breeze/MathUtil17.dataBuilder15_n Lrip/breeze/client/AnimationTimer;
      // 15: invokevirtual rip/breeze/client/AnimationTimer.isBool_e ()Z
      // 18: ifeq 3e
      // 1b: iload 1
      // 1c: getstatic rip/breeze/BreezeContext.iKeyCodeProvider_g Lrip/breeze/IKeyCodeProvider;
      // 1f: invokeinterface rip/breeze/IKeyCodeProvider.getModifiedKeyCode ()I 1
      // 24: if_icmpne 3e
      // 27: goto 2e
      // 2a: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getfield rip/breeze/MathUtil17.dataBuilder15_n Lrip/breeze/client/AnimationTimer;
      // 32: lload 4
      // 34: bipush 0
      // 35: invokevirtual rip/breeze/client/AnimationTimer.toggle (JZ)V
      // 38: bipush 1
      // 39: ireturn
      // 3a: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield rip/breeze/MathUtil17.stringDecryptHelper6_s Lrip/breeze/StringDecryptHelper6;
      // 42: iload 1
      // 43: invokevirtual rip/breeze/StringDecryptHelper6.clamp (I)Z
      // 46: ifne 58
      // 49: aload 0
      // 4a: iload 1
      // 4b: invokespecial rip/breeze/RenderUtil43.a (I)Z
      // 4e: ifeq 60
      // 51: goto 58
      // 54: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 57: athrow
      // 58: bipush 1
      // 59: goto 61
      // 5c: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 5f: athrow
      // 60: bipush 0
      // 61: ireturn
      // try (10 -> 18): 19 java/lang/NumberFormatException
      // try (14 -> 28): 28 java/lang/NumberFormatException
      // try (30 -> 39): 40 java/lang/NumberFormatException
      // try (35 -> 44): 44 java/lang/NumberFormatException
   }

   public boolean checkCondition_3(char param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil17.30622631388982L J
      // 03: ldc2_w 44776899622662
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: getfield rip/breeze/MathUtil17.stringDecryptHelper6_s Lrip/breeze/StringDecryptHelper6;
      // 0c: iload 1
      // 0d: invokevirtual rip/breeze/StringDecryptHelper6.clamp_2 (C)Z
      // 10: ifne 22
      // 13: aload 0
      // 14: iload 1
      // 15: invokespecial rip/breeze/RenderUtil43.a (C)Z
      // 18: ifeq 2a
      // 1b: goto 22
      // 1e: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 21: athrow
      // 22: bipush 1
      // 23: goto 2b
      // 26: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 29: athrow
      // 2a: bipush 0
      // 2b: ireturn
      // try (4 -> 13): 14 java/lang/NumberFormatException
      // try (9 -> 18): 18 java/lang/NumberFormatException
   }

   public void toggle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MathUtil17.30622631388982L J
      // 003: ldc2_w 38302852778835
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: new rip/breeze/LicenseState
      // 00c: dup
      // 00d: aload 0
      // 00e: getfield rip/breeze/MathUtil17.a F
      // 011: aload 0
      // 012: getfield rip/breeze/MathUtil17.c F
      // 015: fadd
      // 016: ldc_w 70.0
      // 019: fsub
      // 01a: aload 0
      // 01b: getfield rip/breeze/MathUtil17.b F
      // 01e: ldc_w 5.0
      // 021: fadd
      // 022: ldc 60.0
      // 024: ldc 35.0
      // 026: invokespecial rip/breeze/LicenseState.<init> (FFFF)V
      // 029: putfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 02c: invokestatic rip/breeze/RenderUtil30.getValue_2 ()I
      // 02f: aload 0
      // 030: invokevirtual rip/breeze/MathUtil17.k ()Lrip/breeze/GenericSetting;
      // 033: getfield rip/breeze/GenericSetting.fieldBool_j Z
      // 036: invokestatic rip/breeze/RenderUtil30.calculateFloat (Z)F
      // 039: fstore 3
      // 03a: istore 4
      // 03c: getstatic rip/breeze/BreezeContext.settingGroup_d Lrip/breeze/SettingGroup;
      // 03f: invokeinterface rip/breeze/SettingGroup.getCount ()I 1
      // 044: istore 5
      // 046: aload 0
      // 047: getfield rip/breeze/MathUtil17.b F
      // 04a: ldc_w 50.0
      // 04d: fadd
      // 04e: fload 3
      // 04f: fadd
      // 050: ldc_w 10.0
      // 053: fadd
      // 054: iload 5
      // 056: i2f
      // 057: fcmpl
      // 058: ifle 063
      // 05b: bipush 1
      // 05c: goto 064
      // 05f: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 062: athrow
      // 063: bipush 0
      // 064: istore 6
      // 066: aload 0
      // 067: getfield rip/breeze/MathUtil17.dataBuilder43_p Lrip/breeze/RenderUtil30;
      // 06a: aload 0
      // 06b: getfield rip/breeze/MathUtil17.a F
      // 06e: aload 0
      // 06f: getfield rip/breeze/MathUtil17.c F
      // 072: fadd
      // 073: ldc_w 280.0
      // 076: fsub
      // 077: ldc_w 10.0
      // 07a: fsub
      // 07b: iload 6
      // 07d: ifeq 090
      // 080: iload 5
      // 082: i2f
      // 083: fload 3
      // 084: fsub
      // 085: ldc_w 20.0
      // 088: fsub
      // 089: goto 098
      // 08c: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 08f: athrow
      // 090: aload 0
      // 091: getfield rip/breeze/MathUtil17.b F
      // 094: ldc_w 50.0
      // 097: fadd
      // 098: ldc_w 280.0
      // 09b: fload 3
      // 09c: invokevirtual rip/breeze/RenderUtil30.a (FFFF)V
      // 09f: aload 0
      // 0a0: getfield rip/breeze/MathUtil17.dataBuilder43_p Lrip/breeze/RenderUtil30;
      // 0a3: aload 0
      // 0a4: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 0a7: putfield rip/breeze/RenderUtil30.licenseState_J Lrip/breeze/LicenseState;
      // 0aa: aload 0
      // 0ab: getfield rip/breeze/MathUtil17.stringDecryptHelper6_s Lrip/breeze/StringDecryptHelper6;
      // 0ae: aload 0
      // 0af: getfield rip/breeze/MathUtil17.licenseState_t Lrip/breeze/LicenseState;
      // 0b2: getfield rip/breeze/LicenseState.fieldFloat_a F
      // 0b5: ldc_w 120.0
      // 0b8: fsub
      // 0b9: aload 0
      // 0ba: getfield rip/breeze/MathUtil17.b F
      // 0bd: ldc_w 5.0
      // 0c0: fadd
      // 0c1: ldc_w 110.0
      // 0c4: ldc 35.0
      // 0c6: invokevirtual rip/breeze/StringDecryptHelper6.a (FFFF)V
      // 0c9: aload 0
      // 0ca: getfield rip/breeze/MathUtil17.dataBuilder119_r Lrip/breeze/RenderUtil9;
      // 0cd: aload 0
      // 0ce: getfield rip/breeze/MathUtil17.stringDecryptHelper6_s Lrip/breeze/StringDecryptHelper6;
      // 0d1: getfield rip/breeze/StringDecryptHelper6.a F
      // 0d4: ldc_w 45.0
      // 0d7: fsub
      // 0d8: aload 0
      // 0d9: getfield rip/breeze/MathUtil17.b F
      // 0dc: ldc_w 5.0
      // 0df: fadd
      // 0e0: ldc 35.0
      // 0e2: ldc 35.0
      // 0e4: invokevirtual rip/breeze/RenderUtil9.processNullable (FFFF)V
      // 0e7: aload 0
      // 0e8: getfield rip/breeze/MathUtil17.dataBuilder119_q Lrip/breeze/RenderUtil9;
      // 0eb: aload 0
      // 0ec: getfield rip/breeze/MathUtil17.dataBuilder119_r Lrip/breeze/RenderUtil9;
      // 0ef: getfield rip/breeze/RenderUtil9.a F
      // 0f2: ldc_w 45.0
      // 0f5: fsub
      // 0f6: aload 0
      // 0f7: getfield rip/breeze/MathUtil17.b F
      // 0fa: ldc_w 5.0
      // 0fd: fadd
      // 0fe: ldc 35.0
      // 100: ldc 35.0
      // 102: invokevirtual rip/breeze/RenderUtil9.processNullable (FFFF)V
      // 105: aload 0
      // 106: aload 0
      // 107: getfield rip/breeze/MathUtil17.c F
      // 10a: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 10d: aload 0
      // 10e: getfield rip/breeze/MathUtil17.k Lrip/breeze/GenericSetting;
      // 111: getfield rip/breeze/GenericSetting.string_b Ljava/lang/String;
      // 114: getstatic rip/breeze/EnumType32.SOURCE_SANS Lrip/breeze/EnumType32;
      // 117: ldc_w 22.0
      // 11a: invokeinterface rip/breeze/IRenderer.measureText (Ljava/lang/String;Lrip/breeze/EnumType32;F)F 4
      // 11f: fsub
      // 120: ldc_w 290.0
      // 123: fcmpl
      // 124: ifle 12f
      // 127: bipush 1
      // 128: goto 130
      // 12b: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 12e: athrow
      // 12f: bipush 0
      // 130: putfield rip/breeze/MathUtil17.fieldBool_u Z
      // 133: aload 0
      // 134: invokespecial rip/breeze/RenderUtil43.calculate_2 ()V
      // 137: iload 4
      // 139: ifne 155
      // 13c: invokestatic rip/breeze/LicenseState.checkCondition ()Z
      // 13f: ifne 151
      // 142: goto 149
      // 145: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 148: athrow
      // 149: bipush 0
      // 14a: goto 152
      // 14d: invokestatic rip/breeze/MathUtil17.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 150: athrow
      // 151: bipush 1
      // 152: invokestatic rip/breeze/LicenseState.toggle (Z)V
      // 155: return
      // try (32 -> 46): 46 java/lang/NumberFormatException
      // try (50 -> 70): 70 java/lang/NumberFormatException
      // try (76 -> 142): 142 java/lang/NumberFormatException
      // try (145 -> 152): 153 java/lang/NumberFormatException
      // try (150 -> 157): 157 java/lang/NumberFormatException
   }

   public void update(float var1, float var2, float var3, float var4) {
      super.calculate_3(var1, var2, var3, 45.0F);
   }

   public boolean isValid(float var1) {
      return true;
   }

   private void lambda$new_Inner2() {
      try {
         Clipboard var1 = Toolkit.getDefaultToolkit().getSystemClipboard();
         this.processAll((String)var1.getData(DataFlavor.stringFlavor));
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   private static void lambda$new_Inner1(GenericSetting var0) {
      try {
         Clipboard var1 = Toolkit.getDefaultToolkit().getSystemClipboard();
         var1.setContents(new StringSelection(((BreezeColor)var0.getObject_m()).buildString()), null);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   private void lambda$new_Inner0(GenericSetting var1, String var2) {
      this.processAll(var2);
      this.stringDecryptHelper6_s.setString_k(((BreezeColor)var1.getObject_m()).buildString());
   }

   static {
      long var0 = 82896445670635L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[8];
      int var5 = 0;
      String var6 = "xÏ\u0015\u0084\u009eL\u009dªý\u0098j\u008aÍ\u0004sxÐ§¢D~O\u0092´(ÒyÎ\u001c\u0091úîW!K\u009dZºs\u0090¶\u0093¢â«]Vzé\u008d\u008a\u001bP\u000fú\u0003ØcÞG\u0014\u0089Cò5\u0018¼çs\u0094tû8\u0091ÜÑ¤¹Ý@Ç`MãZÆ¦R\u0080n0.#\t\u0000\u00012\u0001\u00849¨yË\u0014XÊNo¯\u0093\u0087ó)\u009dr`Ù\u0002·û\u0014]\u0090\u0092åOÈ\u0089$³£\u001dÔõØ`öÞó0\u001c\u0006\u0095\u0094\u0097\u009fqp®HbÒB\u0019¤+\u000fìÒX½]\u0016\u0016:{³SÞa:\u0094³régçÑlöX\u0006\fe£/·\u008d ½øzÛulÇrï\u008f\u0002ÿUH\u0095ÛÐ_OèJö\u00ad\u007f\u0080\u000bé\u009f©õ\u0085\u008f";
      int var7 = "xÏ\u0015\u0084\u009eL\u009dªý\u0098j\u008aÍ\u0004sxÐ§¢D~O\u0092´(ÒyÎ\u001c\u0091úîW!K\u009dZºs\u0090¶\u0093¢â«]Vzé\u008d\u008a\u001bP\u000fú\u0003ØcÞG\u0014\u0089Cò5\u0018¼çs\u0094tû8\u0091ÜÑ¤¹Ý@Ç`MãZÆ¦R\u0080n0.#\t\u0000\u00012\u0001\u00849¨yË\u0014XÊNo¯\u0093\u0087ó)\u009dr`Ù\u0002·û\u0014]\u0090\u0092åOÈ\u0089$³£\u001dÔõØ`öÞó0\u001c\u0006\u0095\u0094\u0097\u009fqp®HbÒB\u0019¤+\u000fìÒX½]\u0016\u0016:{³SÞa:\u0094³régçÑlöX\u0006\fe£/·\u008d ½øzÛulÇrï\u008f\u0002ÿUH\u0095ÛÐ_OèJö\u00ad\u007f\u0080\u000bé\u009f©õ\u0085\u008f"
         .length();
      char var8 = 24;
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
                     CONST_W = var4;
                     CONST_X = new String[8];
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

                  var6 = "Ùþ¦\u001e³#\u0001Ö$£\"r\u008f4&Ú\u0010 ö°ï/<¡@oF\u0098\u0094½3®\u0004";
                  var7 = "Ùþ¦\u001e³#\u0001Ö$£\"r\u008f4&Ú\u0010 ö°ï/<¡@oF\u0098\u0094½3®\u0004".length();
                  var8 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException getNumberFormatException(NumberFormatException var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24930;
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
            throw new RuntimeException("rip/breeze/dV", var10);
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
         throw new RuntimeException("rip/breeze/dV" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
