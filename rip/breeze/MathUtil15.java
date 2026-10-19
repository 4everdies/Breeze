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
import rip.breeze.client.EnumType3;

public final class MathUtil15 extends RenderUtil43<Integer> {
   private static final int CONST_N;
   private static final int CONST_O;
   private static final int CONST_P;
   private static final float CONST_Q = 10.0F;
   private static final int CONST_R;
   private final rip.breeze.client.AnimationTimer dataBuilder15_s = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.LINEAR);
   private final StringDecryptHelper6 stringDecryptHelper6_t;
   private RangeValue dataBuilder39_u;
   private boolean fieldBool_v = false;
   private float fieldFloat_w = 0.0F;
   private float fieldFloat_x = 0.0F;
   private float fieldFloat_y = 0.0F;
   private float fieldFloat_z = 0.0F;
   private boolean fieldBool_A = false;
   private static final String[] CONST_C;
   private static final String[] CONST_H;
   private static final Map CONST_I = new HashMap(13);

   public MathUtil15(GenericSetting<Integer> var1) {
      super(var1);
      this.dataBuilder39_u = ((BreezePredicate2)var1.predicate_h).dataBuilder39_a;
      this.stringDecryptHelper6_t = new StringDecryptHelper6(String.valueOf(this.k().getObject_m()), new LicenseState(), this::lambda$new_Inner0, true, true);
      this.stringDecryptHelper6_t.processAll(new Util134(0.0F, 8.0F));
      this.stringDecryptHelper6_t
         .clamp_9(Math.max(String.valueOf(this.dataBuilder39_u.double_d).length(), String.valueOf(this.dataBuilder39_u.double_c).length()));
      this.stringDecryptHelper6_t.update_1(var1.fieldBool_k);
   }

   public void clamp(float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MathUtil15.39235483302458L J
      // 003: ldc2_w 65418012690296
      // 006: lxor
      // 007: lstore 4
      // 009: lload 4
      // 00b: dup2
      // 00c: ldc2_w 22603910165621
      // 00f: lxor
      // 010: lstore 6
      // 012: dup2
      // 013: ldc2_w 46241641281725
      // 016: lxor
      // 017: lstore 8
      // 019: pop2
      // 01a: invokestatic rip/breeze/RenderUtil43.getString ()Ljava/lang/String;
      // 01d: aload 0
      // 01e: fload 1
      // 01f: fload 2
      // 020: fload 3
      // 021: invokespecial rip/breeze/RenderUtil43.calculate (FFF)V
      // 024: astore 10
      // 026: aload 0
      // 027: invokevirtual rip/breeze/MathUtil15.j ()Lrip/breeze/client/AnimationTimer;
      // 02a: aload 0
      // 02b: fload 1
      // 02c: fload 2
      // 02d: invokevirtual rip/breeze/MathUtil15.a (FF)Z
      // 030: ifne 041
      // 033: aload 0
      // 034: getfield rip/breeze/MathUtil15.fieldBool_A Z
      // 037: ifeq 049
      // 03a: goto 041
      // 03d: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 040: athrow
      // 041: bipush 1
      // 042: goto 04a
      // 045: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 048: athrow
      // 049: bipush 0
      // 04a: lload 6
      // 04c: dup2_x1
      // 04d: pop2
      // 04e: invokevirtual rip/breeze/client/AnimationTimer.toggle (JZ)V
      // 051: aload 0
      // 052: getfield rip/breeze/MathUtil15.fieldBool_A Z
      // 055: ifeq 09b
      // 058: fload 1
      // 059: aload 0
      // 05a: getfield rip/breeze/MathUtil15.fieldFloat_x F
      // 05d: fsub
      // 05e: aload 0
      // 05f: getfield rip/breeze/MathUtil15.fieldFloat_w F
      // 062: fconst_1
      // 063: invokestatic java/lang/Math.max (FF)F
      // 066: fdiv
      // 067: fconst_0
      // 068: fconst_1
      // 069: invokestatic rip/breeze/MathUtil1.clamp (FFF)F
      // 06c: fstore 11
      // 06e: aload 0
      // 06f: getfield rip/breeze/MathUtil15.dataBuilder39_u Lrip/breeze/RangeValue;
      // 072: getfield rip/breeze/RangeValue.double_d D
      // 075: fload 11
      // 077: f2d
      // 078: aload 0
      // 079: getfield rip/breeze/MathUtil15.dataBuilder39_u Lrip/breeze/RangeValue;
      // 07c: getfield rip/breeze/RangeValue.double_c D
      // 07f: aload 0
      // 080: getfield rip/breeze/MathUtil15.dataBuilder39_u Lrip/breeze/RangeValue;
      // 083: getfield rip/breeze/RangeValue.double_d D
      // 086: dsub
      // 087: dmul
      // 088: dadd
      // 089: invokestatic java/lang/Math.round (D)J
      // 08c: l2i
      // 08d: istore 12
      // 08f: aload 0
      // 090: invokevirtual rip/breeze/MathUtil15.k ()Lrip/breeze/GenericSetting;
      // 093: iload 12
      // 095: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 098: invokevirtual rip/breeze/GenericSetting.processAll (Ljava/lang/Object;)V
      // 09b: aload 0
      // 09c: getfield rip/breeze/MathUtil15.stringDecryptHelper6_t Lrip/breeze/StringDecryptHelper6;
      // 09f: invokevirtual rip/breeze/StringDecryptHelper6.isValid_2 ()Z
      // 0a2: ifne 0c6
      // 0a5: aload 0
      // 0a6: getfield rip/breeze/MathUtil15.stringDecryptHelper6_t Lrip/breeze/StringDecryptHelper6;
      // 0a9: aload 0
      // 0aa: invokevirtual rip/breeze/MathUtil15.k ()Lrip/breeze/GenericSetting;
      // 0ad: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 0b0: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 0b3: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 0b6: aload 0
      // 0b7: getfield rip/breeze/MathUtil15.stringDecryptHelper6_t Lrip/breeze/StringDecryptHelper6;
      // 0ba: ldc ""
      // 0bc: invokevirtual rip/breeze/StringDecryptHelper6.clamp_8 (Ljava/lang/String;)V
      // 0bf: goto 0c6
      // 0c2: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0c5: athrow
      // 0c6: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 0c9: aload 0
      // 0ca: getfield rip/breeze/MathUtil15.stringDecryptHelper6_t Lrip/breeze/StringDecryptHelper6;
      // 0cd: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 0d0: sipush 18351
      // 0d3: ldc2_w 8101174236889537922
      // 0d6: lload 4
      // 0d8: lxor
      // 0d9: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 0e1: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 0e4: sipush 31958
      // 0e7: ldc2_w 2790422852288079603
      // 0ea: lload 4
      // 0ec: lxor
      // 0ed: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 0f5: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 0f8: sipush 15023
      // 0fb: ldc2_w 71237716381474945
      // 0fe: lload 4
      // 100: lxor
      // 101: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 109: invokeinterface rip/breeze/IRenderer.fillRoundedRectTwoColor (Lrip/breeze/LicenseState;FFLjava/awt/Color;)V 5
      // 10e: aload 0
      // 10f: getfield rip/breeze/MathUtil15.stringDecryptHelper6_t Lrip/breeze/StringDecryptHelper6;
      // 112: fload 1
      // 113: fload 2
      // 114: fload 3
      // 115: invokevirtual rip/breeze/StringDecryptHelper6.update (FFF)V
      // 118: aload 0
      // 119: aload 0
      // 11a: getfield rip/breeze/MathUtil15.fieldFloat_z F
      // 11d: f2d
      // 11e: aload 0
      // 11f: invokevirtual rip/breeze/MathUtil15.k ()Lrip/breeze/GenericSetting;
      // 122: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 125: checkcast java/lang/Integer
      // 128: invokevirtual java/lang/Integer.intValue ()I
      // 12b: i2d
      // 12c: aload 0
      // 12d: getfield rip/breeze/MathUtil15.dataBuilder39_u Lrip/breeze/RangeValue;
      // 130: getfield rip/breeze/RangeValue.double_d D
      // 133: dsub
      // 134: d2f
      // 135: f2d
      // 136: aload 0
      // 137: getfield rip/breeze/MathUtil15.dataBuilder39_u Lrip/breeze/RangeValue;
      // 13a: getfield rip/breeze/RangeValue.double_c D
      // 13d: aload 0
      // 13e: getfield rip/breeze/MathUtil15.dataBuilder39_u Lrip/breeze/RangeValue;
      // 141: getfield rip/breeze/RangeValue.double_d D
      // 144: dsub
      // 145: ddiv
      // 146: dconst_0
      // 147: dconst_1
      // 148: invokestatic rip/breeze/MathUtil1.clamp_3 (DDD)D
      // 14b: ldc2_w 15.0
      // 14e: fload 3
      // 14f: f2d
      // 150: invokestatic rip/breeze/MathUtil1.calculateDouble_2 (DDDD)D
      // 153: d2f
      // 154: putfield rip/breeze/MathUtil15.fieldFloat_z F
      // 157: aload 0
      // 158: getfield rip/breeze/MathUtil15.fieldFloat_w F
      // 15b: aload 0
      // 15c: getfield rip/breeze/MathUtil15.fieldFloat_z F
      // 15f: fmul
      // 160: fstore 11
      // 162: fload 1
      // 163: aload 0
      // 164: getfield rip/breeze/MathUtil15.fieldFloat_x F
      // 167: fcmpl
      // 168: iflt 1ae
      // 16b: fload 1
      // 16c: aload 0
      // 16d: getfield rip/breeze/MathUtil15.fieldFloat_x F
      // 170: aload 0
      // 171: getfield rip/breeze/MathUtil15.fieldFloat_w F
      // 174: fadd
      // 175: fcmpg
      // 176: ifgt 1ae
      // 179: goto 180
      // 17c: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 17f: athrow
      // 180: fload 2
      // 181: aload 0
      // 182: getfield rip/breeze/MathUtil15.fieldFloat_y F
      // 185: ldc 10.0
      // 187: fsub
      // 188: fcmpl
      // 189: iflt 1ae
      // 18c: goto 193
      // 18f: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 192: athrow
      // 193: fload 2
      // 194: aload 0
      // 195: getfield rip/breeze/MathUtil15.fieldFloat_y F
      // 198: ldc 10.0
      // 19a: fadd
      // 19b: fcmpg
      // 19c: ifgt 1ae
      // 19f: goto 1a6
      // 1a2: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1a5: athrow
      // 1a6: bipush 1
      // 1a7: goto 1af
      // 1aa: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1ad: athrow
      // 1ae: bipush 0
      // 1af: istore 12
      // 1b1: aload 0
      // 1b2: iload 12
      // 1b4: ifeq 1d0
      // 1b7: aload 0
      // 1b8: getfield rip/breeze/MathUtil15.k Lrip/breeze/GenericSetting;
      // 1bb: getfield rip/breeze/GenericSetting.fieldBool_k Z
      // 1be: ifne 1d0
      // 1c1: goto 1c8
      // 1c4: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1c7: athrow
      // 1c8: bipush 1
      // 1c9: goto 1d1
      // 1cc: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1cf: athrow
      // 1d0: bipush 0
      // 1d1: putfield rip/breeze/MathUtil15.fieldBool_v Z
      // 1d4: aload 0
      // 1d5: getfield rip/breeze/MathUtil15.dataBuilder15_s Lrip/breeze/client/AnimationTimer;
      // 1d8: aload 0
      // 1d9: getfield rip/breeze/MathUtil15.fieldBool_v Z
      // 1dc: ifne 1ed
      // 1df: aload 0
      // 1e0: getfield rip/breeze/MathUtil15.fieldBool_A Z
      // 1e3: ifeq 1f5
      // 1e6: goto 1ed
      // 1e9: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1ec: athrow
      // 1ed: bipush 1
      // 1ee: goto 1f6
      // 1f1: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1f4: athrow
      // 1f5: bipush 0
      // 1f6: lload 6
      // 1f8: dup2_x1
      // 1f9: pop2
      // 1fa: invokevirtual rip/breeze/client/AnimationTimer.toggle (JZ)V
      // 1fd: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 200: sipush 17940
      // 203: ldc2_w 642336268809886771
      // 206: lload 4
      // 208: lxor
      // 209: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: invokevirtual rip/breeze/AuthSession.isValid (Ljava/lang/String;)Z
      // 211: ifeq 21e
      // 214: ldc_w 5.0
      // 217: goto 221
      // 21a: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 21d: athrow
      // 21e: ldc_w 2.5
      // 221: fstore 13
      // 223: aload 0
      // 224: getfield rip/breeze/MathUtil15.fieldFloat_x F
      // 227: fstore 14
      // 229: fconst_0
      // 22a: fload 11
      // 22c: invokestatic java/lang/Math.max (FF)F
      // 22f: fstore 15
      // 231: aload 0
      // 232: getfield rip/breeze/MathUtil15.fieldFloat_x F
      // 235: fload 11
      // 237: fadd
      // 238: fstore 16
      // 23a: fconst_0
      // 23b: aload 0
      // 23c: getfield rip/breeze/MathUtil15.fieldFloat_w F
      // 23f: fload 11
      // 241: fsub
      // 242: invokestatic java/lang/Math.max (FF)F
      // 245: fstore 17
      // 247: aload 0
      // 248: getfield rip/breeze/MathUtil15.fieldFloat_y F
      // 24b: ldc_w 5.0
      // 24e: fsub
      // 24f: fstore 18
      // 251: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 254: fload 14
      // 256: fload 18
      // 258: fload 15
      // 25a: ldc 10.0
      // 25c: bipush 4
      // 25d: newarray 6
      // 25f: dup
      // 260: bipush 0
      // 261: fload 13
      // 263: fastore
      // 264: dup
      // 265: bipush 1
      // 266: fconst_0
      // 267: fastore
      // 268: dup
      // 269: bipush 2
      // 26a: fconst_0
      // 26b: fastore
      // 26c: dup
      // 26d: bipush 3
      // 26e: fload 13
      // 270: fastore
      // 271: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 274: sipush 16771
      // 277: ldc2_w 4736475651878017964
      // 27a: lload 4
      // 27c: lxor
      // 27d: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 285: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 288: sipush 12139
      // 28b: ldc2_w 4379768399229629773
      // 28e: lload 4
      // 290: lxor
      // 291: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 299: aload 0
      // 29a: invokevirtual rip/breeze/MathUtil15.j ()Lrip/breeze/client/AnimationTimer;
      // 29d: lload 8
      // 29f: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 2a2: d2f
      // 2a3: invokestatic rip/breeze/RenderUtil1.clamp (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 2a6: invokeinterface rip/breeze/IRenderer.fillGradientRectSimple (FFFF[FLjava/awt/Color;)V 7
      // 2ab: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 2ae: fload 16
      // 2b0: fload 18
      // 2b2: fload 17
      // 2b4: ldc 10.0
      // 2b6: bipush 4
      // 2b7: newarray 6
      // 2b9: dup
      // 2ba: bipush 0
      // 2bb: fconst_0
      // 2bc: fastore
      // 2bd: dup
      // 2be: bipush 1
      // 2bf: fload 13
      // 2c1: fastore
      // 2c2: dup
      // 2c3: bipush 2
      // 2c4: fload 13
      // 2c6: fastore
      // 2c7: dup
      // 2c8: bipush 3
      // 2c9: fconst_0
      // 2ca: fastore
      // 2cb: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 2ce: sipush 24550
      // 2d1: ldc2_w 2809177370533709253
      // 2d4: lload 4
      // 2d6: lxor
      // 2d7: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dc: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 2df: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 2e2: sipush 25086
      // 2e5: ldc2_w 3895791721638198239
      // 2e8: lload 4
      // 2ea: lxor
      // 2eb: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 2f3: aload 0
      // 2f4: invokevirtual rip/breeze/MathUtil15.j ()Lrip/breeze/client/AnimationTimer;
      // 2f7: lload 8
      // 2f9: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 2fc: d2f
      // 2fd: invokestatic rip/breeze/RenderUtil1.clamp (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 300: invokeinterface rip/breeze/IRenderer.fillGradientRectSimple (FFFF[FLjava/awt/Color;)V 7
      // 305: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 308: sipush 14471
      // 30b: ldc2_w 5081114798299259555
      // 30e: lload 4
      // 310: lxor
      // 311: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: invokevirtual rip/breeze/AuthSession.isValid (Ljava/lang/String;)Z
      // 319: ifeq 35f
      // 31c: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 31f: aload 0
      // 320: getfield rip/breeze/MathUtil15.fieldFloat_x F
      // 323: fload 11
      // 325: fadd
      // 326: aload 0
      // 327: getfield rip/breeze/MathUtil15.fieldFloat_y F
      // 32a: ldc2_w 10.0
      // 32d: dconst_1
      // 32e: aload 0
      // 32f: getfield rip/breeze/MathUtil15.dataBuilder15_s Lrip/breeze/client/AnimationTimer;
      // 332: lload 8
      // 334: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 337: dmul
      // 338: dadd
      // 339: d2f
      // 33a: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 33d: sipush 25719
      // 340: ldc2_w 1390692249217957461
      // 343: lload 4
      // 345: lxor
      // 346: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34b: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 34e: invokeinterface rip/breeze/IRenderer.fillCircle (FFFLjava/awt/Color;)V 5
      // 353: aload 10
      // 355: ifnull 3bc
      // 358: goto 35f
      // 35b: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 35e: athrow
      // 35f: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 362: aload 0
      // 363: getfield rip/breeze/MathUtil15.fieldFloat_x F
      // 366: fload 11
      // 368: fadd
      // 369: ldc_w 4.0
      // 36c: fsub
      // 36d: aload 0
      // 36e: getfield rip/breeze/MathUtil15.fieldFloat_y F
      // 371: ldc_w 12.5
      // 374: fsub
      // 375: f2d
      // 376: ldc2_w 1.5
      // 379: aload 0
      // 37a: getfield rip/breeze/MathUtil15.dataBuilder15_s Lrip/breeze/client/AnimationTimer;
      // 37d: lload 8
      // 37f: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 382: dmul
      // 383: dsub
      // 384: d2f
      // 385: ldc 8.0
      // 387: ldc2_w 23.0
      // 38a: ldc2_w 3.0
      // 38d: aload 0
      // 38e: getfield rip/breeze/MathUtil15.dataBuilder15_s Lrip/breeze/client/AnimationTimer;
      // 391: lload 8
      // 393: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 396: dmul
      // 397: dadd
      // 398: d2f
      // 399: ldc_w 3.0
      // 39c: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 39f: sipush 9406
      // 3a2: ldc2_w 9157486403843112606
      // 3a5: lload 4
      // 3a7: lxor
      // 3a8: invokedynamic m (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil15.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ad: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 3b0: invokeinterface rip/breeze/IRenderer.fillRoundedRectFull (FFFFFLjava/awt/Color;)V 7
      // 3b5: goto 3bc
      // 3b8: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 3bb: athrow
      // 3bc: invokestatic rip/breeze/LicenseState.checkCondition ()Z
      // 3bf: ifeq 3cf
      // 3c2: ldc_w "R3Mkgc"
      // 3c5: invokestatic rip/breeze/RenderUtil43.initialize (Ljava/lang/String;)V
      // 3c8: goto 3cf
      // 3cb: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 3ce: athrow
      // 3cf: return
      // try (21 -> 31): 32 java/lang/NumberFormatException
      // try (28 -> 36): 36 java/lang/NumberFormatException
      // try (81 -> 96): 97 java/lang/NumberFormatException
      // try (169 -> 182): 183 java/lang/NumberFormatException
      // try (174 -> 192): 193 java/lang/NumberFormatException
      // try (185 -> 202): 203 java/lang/NumberFormatException
      // try (195 -> 207): 207 java/lang/NumberFormatException
      // try (211 -> 218): 219 java/lang/NumberFormatException
      // try (214 -> 223): 223 java/lang/NumberFormatException
      // try (226 -> 235): 236 java/lang/NumberFormatException
      // try (232 -> 240): 240 java/lang/NumberFormatException
      // try (243 -> 257): 257 java/lang/NumberFormatException
      // try (285 -> 407): 408 java/lang/NumberFormatException
      // try (381 -> 449): 450 java/lang/NumberFormatException
      // try (452 -> 456): 457 java/lang/NumberFormatException
   }

   public boolean isActive(float param1, float param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil15.39235483302458L J
      // 03: ldc2_w 73733368103057
      // 06: lxor
      // 07: lstore 4
      // 09: aload 0
      // 0a: getfield rip/breeze/MathUtil15.stringDecryptHelper6_t Lrip/breeze/StringDecryptHelper6;
      // 0d: fload 1
      // 0e: fload 2
      // 0f: iload 3
      // 10: bipush 0
      // 11: invokevirtual rip/breeze/StringDecryptHelper6.absValue (FFIZ)Z
      // 14: ifeq 1d
      // 17: bipush 1
      // 18: ireturn
      // 19: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1c: athrow
      // 1d: iload 3
      // 1e: ifne 32
      // 21: aload 0
      // 22: getfield rip/breeze/MathUtil15.k Lrip/breeze/GenericSetting;
      // 25: getfield rip/breeze/GenericSetting.fieldBool_k Z
      // 28: ifeq 38
      // 2b: goto 32
      // 2e: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 37: athrow
      // 38: fload 1
      // 39: aload 0
      // 3a: getfield rip/breeze/MathUtil15.fieldFloat_x F
      // 3d: fcmpl
      // 3e: iflt 84
      // 41: fload 1
      // 42: aload 0
      // 43: getfield rip/breeze/MathUtil15.fieldFloat_x F
      // 46: aload 0
      // 47: getfield rip/breeze/MathUtil15.fieldFloat_w F
      // 4a: fadd
      // 4b: fcmpg
      // 4c: ifgt 84
      // 4f: goto 56
      // 52: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 55: athrow
      // 56: fload 2
      // 57: aload 0
      // 58: getfield rip/breeze/MathUtil15.fieldFloat_y F
      // 5b: ldc 10.0
      // 5d: fsub
      // 5e: fcmpl
      // 5f: iflt 84
      // 62: goto 69
      // 65: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 68: athrow
      // 69: fload 2
      // 6a: aload 0
      // 6b: getfield rip/breeze/MathUtil15.fieldFloat_y F
      // 6e: ldc 10.0
      // 70: fadd
      // 71: fcmpg
      // 72: ifgt 84
      // 75: goto 7c
      // 78: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 7b: athrow
      // 7c: bipush 1
      // 7d: goto 85
      // 80: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 83: athrow
      // 84: bipush 0
      // 85: istore 6
      // 87: iload 6
      // 89: ifne 92
      // 8c: bipush 0
      // 8d: ireturn
      // 8e: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 91: athrow
      // 92: aload 0
      // 93: bipush 1
      // 94: putfield rip/breeze/MathUtil15.fieldBool_A Z
      // 97: bipush 1
      // 98: ireturn
      // try (4 -> 14): 14 java/lang/NumberFormatException
      // try (16 -> 22): 23 java/lang/NumberFormatException
      // try (18 -> 27): 27 java/lang/NumberFormatException
      // try (29 -> 42): 43 java/lang/NumberFormatException
      // try (34 -> 52): 53 java/lang/NumberFormatException
      // try (45 -> 62): 63 java/lang/NumberFormatException
      // try (55 -> 67): 67 java/lang/NumberFormatException
      // try (71 -> 75): 75 java/lang/NumberFormatException
   }

   public void toggle(float param1, float param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil15.39235483302458L J
      // 03: ldc2_w 55485333515755
      // 06: lxor
      // 07: lstore 4
      // 09: aload 0
      // 0a: getfield rip/breeze/MathUtil15.stringDecryptHelper6_t Lrip/breeze/StringDecryptHelper6;
      // 0d: fload 1
      // 0e: fload 2
      // 0f: iload 3
      // 10: invokevirtual rip/breeze/StringDecryptHelper6.toggle (FFI)V
      // 13: aload 0
      // 14: getfield rip/breeze/MathUtil15.fieldBool_A Z
      // 17: ifeq 31
      // 1a: iload 3
      // 1b: ifne 31
      // 1e: goto 25
      // 21: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 24: athrow
      // 25: aload 0
      // 26: bipush 0
      // 27: putfield rip/breeze/MathUtil15.fieldBool_A Z
      // 2a: goto 31
      // 2d: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 30: athrow
      // 31: return
      // try (4 -> 15): 16 java/lang/NumberFormatException
      // try (13 -> 21): 22 java/lang/NumberFormatException
   }

   @Override
   public void toggle_2() {
      super.h();
      this.stringDecryptHelper6_t.processAll_3();
      this.fieldBool_A = false;
   }

   public boolean isValid(char var1) {
      return this.stringDecryptHelper6_t.clamp_2(var1);
   }

   @Override
   public boolean isValid_2(int var1) {
      return this.stringDecryptHelper6_t.clamp(var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void absValue() {
      long var1 = 62740630596709L;
      String var3 = RenderUtil43.getString();

      boolean var10000;
      label43: {
         try {
            if (this.c < 500.0F) {
               var10000 = true;
               break label43;
            }
         } catch (NumberFormatException var12) {
            throw getNumberFormatException(var12);
         }

         var10000 = false;
      }

      boolean var4 = var10000;
      int var5 = (int)Math.max(Math.abs(this.dataBuilder39_u.double_d), Math.abs(this.dataBuilder39_u.double_c));
      int var6 = Math.max(1, (int)Math.floor(Math.log10(Math.max(1, var5))) + 1);
      StringBuilder var7 = new StringBuilder();
      int var8 = 0;

      while (var8 < var6) {
         var7.append("0");
         var8++;
         if (var3 != null) {
            break;
         }
      }

      label29: {
         float var13 = BreezeContext.iRenderer_b.measureText(var7.toString(), EnumType32.SOURCE_SANS, 22.0F);
         if (var4) {
            byte var9 = 35;

            try {
               this.stringDecryptHelper6_t.a((int)(this.a + this.c - 10.0F - var13 - 30.0F), (int)(this.b + 5.0F), (int)(var13 + 30.0F), 35.0F);
               this.fieldFloat_x = this.a + 10.0F;
               this.fieldFloat_w = Math.max(0.0F, this.c - 20.0F);
               this.fieldFloat_y = this.b + 8.0F + var9 + 8.0F + 5.0F;
               if (var3 == null) {
                  break label29;
               }
            } catch (NumberFormatException var11) {
               throw getNumberFormatException(var11);
            }
         }

         try {
            this.fieldFloat_w = Math.max(0.0F, this.c - 200.0F - 60.0F - var13);
            this.stringDecryptHelper6_t
               .a((int)(this.a + this.fieldFloat_w + 200.0F + 15.0F), (int)(this.b + 5.0F), (int)(this.c - this.fieldFloat_w - 200.0F - 25.0F), 35.0F);
            this.fieldFloat_x = this.a + 200.0F;
            this.fieldFloat_y = this.b + 22.5F;
         } catch (NumberFormatException var10) {
            throw getNumberFormatException(var10);
         }
      }

      super.calculate_2();
   }

   public void clamp_2(float var1, float var2, float var3, float var4) {
      long var5 = 102388927128469L;

      boolean var10000;
      label31: {
         try {
            if (var3 < 500.0F) {
               var10000 = true;
               break label31;
            }
         } catch (NumberFormatException var10) {
            throw getNumberFormatException(var10);
         }

         var10000 = false;
      }

      boolean var7 = var10000;

      label23: {
         try {
            if (var7) {
               var11 = Math.max(72.0F, 70.0F);
               break label23;
            }
         } catch (NumberFormatException var9) {
            throw getNumberFormatException(var9);
         }

         var11 = 45.0F;
      }

      float var8 = var11;
      super.calculate_3(var1, var2, var3, var8);
   }

   public boolean isValid_3(float var1) {
      return true;
   }

   private void lambda$new_Inner0(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil15.39235483302458L J
      // 03: ldc2_w 40575061526987
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic rip/breeze/RenderUtil43.getString ()Ljava/lang/String;
      // 0b: astore 4
      // 0d: getstatic rip/breeze/BreezeContext.iKeybindSettings_e Lrip/breeze/IKeybindSettings;
      // 10: invokeinterface rip/breeze/IKeybindSettings.getWidth ()Z 1
      // 15: ifeq 32
      // 18: aload 0
      // 19: invokevirtual rip/breeze/MathUtil15.k ()Lrip/breeze/GenericSetting;
      // 1c: aload 1
      // 1d: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 20: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 23: invokevirtual rip/breeze/GenericSetting.processNullable (Ljava/lang/Object;)V
      // 26: aload 4
      // 28: ifnull 5a
      // 2b: goto 32
      // 2e: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 31: athrow
      // 32: aload 0
      // 33: invokevirtual rip/breeze/MathUtil15.k ()Lrip/breeze/GenericSetting;
      // 36: aload 1
      // 37: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 3a: i2d
      // 3b: aload 0
      // 3c: getfield rip/breeze/MathUtil15.dataBuilder39_u Lrip/breeze/RangeValue;
      // 3f: getfield rip/breeze/RangeValue.double_d D
      // 42: aload 0
      // 43: getfield rip/breeze/MathUtil15.dataBuilder39_u Lrip/breeze/RangeValue;
      // 46: getfield rip/breeze/RangeValue.double_c D
      // 49: invokestatic rip/breeze/MathUtil1.clamp_3 (DDD)D
      // 4c: d2i
      // 4d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 50: invokevirtual rip/breeze/GenericSetting.processAll (Ljava/lang/Object;)V
      // 53: goto 5a
      // 56: invokestatic rip/breeze/MathUtil15.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 59: athrow
      // 5a: goto 5f
      // 5d: astore 5
      // 5f: return
      // try (9 -> 35): 36 java/lang/NumberFormatException
      // try (6 -> 17): 18 java/lang/NumberFormatException
      // try (6 -> 38): 39 java/lang/NumberFormatException
   }

   static {
      long var0 = 115768492478995L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[11];
      int var5 = 0;
      String var6 = "Ómè\u009f\u0092\u009erUN\u0013=l\u008d}`\u0093\u0091\u009cï\u0005É1©R\u0088o{ \u001eåMî\t¿\u0098\u009a\u0092m\u0083[(?\u0010\u0011ÓËÙÀkdP\fÁæ²³`sÓÇ~J\r·½\u0019ð44î\u008bØ\u008b\u0098\tÓ\u009e\u0087É¢Ì8nC§û¿q\t-\f!÷W®¿\u001e\u000eÜ\u0092\u000e³Y\u0007U°\u008eµ×Qh\u008cÛ\u008dw·n\u0000ïdÂMf\u0088\r\u0017g\u000e\u000e]\u0091\u008e*nK(Û1(\u0013c\u007fý&Z[ÆØ%l´©¹\u009fãô\u0095\u0089y\u0001Ê0~X\u0086c\u009e\u009981în\t¬C99Å_(÷â\"ê1\u009a\u00808Ý\u0016\f©\u0011x\nÔ½\u008e\u0087cþ\u0003/ñóµæl\u0013\u008bÃ£Qÿ5Q\u0017\u008bJ\u0001 ¿\u0080ÍQE\u009cB7Wr-±\"í\u0092\u009cÖ\u0082\u0095ÿ5F¯\u0094SeáEK\u0018ì\b8y?8¤±lõ½\":tÀÇ\u008a6Eü\u009c?Om4\u001cLF¦Ö\u008bn\u0097\u0092=°Â\u0011/éîö<eÈ¸¢i@NË9\u000b\u0081ô¤µK\u001b\u0018º\u0086\u0013\u001aL\u009fKsöîó\u001eÅ©É\f-\u0017\u0004My\u0015£\u0086\u0018ÐôâE\u000b½Ì÷æöæ¸\u0092Ý`O\u001aÍ\u001b\u000f¤å\u008f\u0087";
      int var7 = "Ómè\u009f\u0092\u009erUN\u0013=l\u008d}`\u0093\u0091\u009cï\u0005É1©R\u0088o{ \u001eåMî\t¿\u0098\u009a\u0092m\u0083[(?\u0010\u0011ÓËÙÀkdP\fÁæ²³`sÓÇ~J\r·½\u0019ð44î\u008bØ\u008b\u0098\tÓ\u009e\u0087É¢Ì8nC§û¿q\t-\f!÷W®¿\u001e\u000eÜ\u0092\u000e³Y\u0007U°\u008eµ×Qh\u008cÛ\u008dw·n\u0000ïdÂMf\u0088\r\u0017g\u000e\u000e]\u0091\u008e*nK(Û1(\u0013c\u007fý&Z[ÆØ%l´©¹\u009fãô\u0095\u0089y\u0001Ê0~X\u0086c\u009e\u009981în\t¬C99Å_(÷â\"ê1\u009a\u00808Ý\u0016\f©\u0011x\nÔ½\u008e\u0087cþ\u0003/ñóµæl\u0013\u008bÃ£Qÿ5Q\u0017\u008bJ\u0001 ¿\u0080ÍQE\u009cB7Wr-±\"í\u0092\u009cÖ\u0082\u0095ÿ5F¯\u0094SeáEK\u0018ì\b8y?8¤±lõ½\":tÀÇ\u008a6Eü\u009c?Om4\u001cLF¦Ö\u008bn\u0097\u0092=°Â\u0011/éîö<eÈ¸¢i@NË9\u000b\u0081ô¤µK\u001b\u0018º\u0086\u0013\u001aL\u009fKsöîó\u001eÅ©É\f-\u0017\u0004My\u0015£\u0086\u0018ÐôâE\u000b½Ì÷æöæ¸\u0092Ý`O\u001aÍ\u001b\u000f¤å\u008f\u0087"
         .length();
      char var8 = '(';
      int var23 = -1;

      label54:
      while (true) {
         String var25 = var6.substring(++var23, var23 + var8);
         int var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = buildString(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var36;
                  if ((var23 += var8) >= var7) {
                     CONST_C = var4;
                     CONST_H = new String[11];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var0 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var13 = new long[4];
                     int var14 = 0;
                     String var15 = "1w\u0014ê\u0084\u009dj\u001aY\u0084\u0012\u0099Ú¯d+";
                     int var16 = "1w\u0014ê\u0084\u009dj\u001aY\u0084\u0012\u0099Ú¯d+".length();
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
                                    CONST_N = (int)var13[2];
                                    CONST_R = (int)var13[0];
                                    CONST_P = (int)var13[1];
                                    CONST_O = (int)var13[3];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "ÿ°\u0089¬V|DÖ\u000bý¿sâ\u0012\\¹";
                                 var16 = "ÿ°\u0089¬V|DÖ\u000bý¿sâ\u0012\\¹".length();
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

                  var6 = "\u0090\u0014\u0089\u0019Z\u008f\u0098j\u008d#\u0006á\u0000å+ó\u001fù8¢\u0086_\u0011\u008bùb\rÀ\u0086P\u000ev(\u0014\u000bÈ]r\u000f]fh\u001cÖ©gÖy\u001d|@K+5é\u009dÓ¦\u008a]û,\u0000\u0017\få\u0003<¨ð¿\u008fÂ";
                  var7 = "\u0090\u0014\u0089\u0019Z\u008f\u0098j\u008d#\u0006á\u0000å+ó\u001fù8¢\u0086_\u0011\u008bùb\rÀ\u0086P\u000ev(\u0014\u000bÈ]r\u000f]fh\u001cÖ©gÖy\u001d|@K+5é\u009dÓ¦\u008a]û,\u0000\u0017\få\u0003<¨ð¿\u008fÂ"
                     .length();
                  var8 = ' ';
                  var23 = -1;
            }

            var25 = var6.substring(++var23, var23 + var8);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26469;
      if (CONST_H[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_I.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_I.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dR", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_C[var3].getBytes("ISO-8859-1");
         CONST_H[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_H[var3];
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
         throw new RuntimeException("rip/breeze/dR" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
