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

public final class MathUtil14 extends RenderUtil43<Double> {
   private static final int CONST_N;
   private static final int CONST_O;
   private static final int CONST_P;
   private static final float CONST_Q = 10.0F;
   private static final int CONST_R;
   private final rip.breeze.client.AnimationTimer dataBuilder15_s;
   private RangeValue dataBuilder39_t;
   private final StringDecryptHelper6 stringDecryptHelper6_u;
   private float fieldFloat_v;
   private float fieldFloat_w;
   private float fieldFloat_x;
   private float fieldFloat_y;
   private boolean fieldBool_z;
   private boolean fieldBool_A;
   private static final String[] CONST_C;
   private static final String[] CONST_H;
   private static final Map CONST_I = new HashMap(13);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public MathUtil14(GenericSetting<Double> var1) {
      label32: {
         long var2 = 77860926876576L;
         String var10000 = RenderUtil43.getString();
         super(var1);
         this.dataBuilder15_s = new rip.breeze.client.AnimationTimer(200.0F, false, EnumType3.LINEAR);
         this.fieldFloat_v = 0.0F;
         String var4 = var10000;
         this.fieldFloat_w = 0.0F;
         this.fieldFloat_x = 0.0F;
         this.fieldFloat_y = 0.0F;
         this.fieldBool_z = false;
         this.fieldBool_A = false;
         if (var1.predicate_h instanceof BreezePredicate) {
            RangeValue var5 = ((BreezePredicate)var1.predicate_h).dataBuilder39_a;

            RangeValue var10001;
            label28: {
               try {
                  var9 = this;
                  if (var5.double_f == 0.0) {
                     var10001 = var5.getDataBuilder39_3(0.1);
                     break label28;
                  }
               } catch (NumberFormatException var8) {
                  throw getNumberFormatException(var8);
               }

               var10001 = var5;
            }

            try {
               var9.dataBuilder39_t = var10001;
               if (var4 == null) {
                  break label32;
               }
            } catch (NumberFormatException var7) {
               throw getNumberFormatException(var7);
            }
         }

         try {
            this.dataBuilder39_t = new RangeValue(0.0, 1.0, 0.1);
         } catch (NumberFormatException var6) {
            throw getNumberFormatException(var6);
         }
      }

      this.stringDecryptHelper6_u = new StringDecryptHelper6(String.valueOf(this.k().getObject_m()), new LicenseState(), this::lambda$new_Inner0, true, true);
      this.stringDecryptHelper6_u.processAll(new Util134(0.0F, 8.0F));
      this.stringDecryptHelper6_u
         .clamp_9(Math.max(String.valueOf(this.dataBuilder39_t.double_d).length(), String.valueOf(this.dataBuilder39_t.double_c).length()) + 2);
      this.stringDecryptHelper6_u.update_1(var1.fieldBool_k);
   }

   public void clamp(float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MathUtil14.31920342840831L J
      // 003: ldc2_w 6426895435965
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
      // 027: invokevirtual rip/breeze/MathUtil14.j ()Lrip/breeze/client/AnimationTimer;
      // 02a: aload 0
      // 02b: fload 1
      // 02c: fload 2
      // 02d: invokevirtual rip/breeze/MathUtil14.a (FF)Z
      // 030: ifne 041
      // 033: aload 0
      // 034: getfield rip/breeze/MathUtil14.fieldBool_A Z
      // 037: ifeq 049
      // 03a: goto 041
      // 03d: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 040: athrow
      // 041: bipush 1
      // 042: goto 04a
      // 045: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 048: athrow
      // 049: bipush 0
      // 04a: lload 6
      // 04c: dup2_x1
      // 04d: pop2
      // 04e: invokevirtual rip/breeze/client/AnimationTimer.toggle (JZ)V
      // 051: aload 0
      // 052: getfield rip/breeze/MathUtil14.fieldBool_A Z
      // 055: ifeq 096
      // 058: fload 1
      // 059: aload 0
      // 05a: getfield rip/breeze/MathUtil14.fieldFloat_w F
      // 05d: fsub
      // 05e: aload 0
      // 05f: getfield rip/breeze/MathUtil14.fieldFloat_v F
      // 062: fconst_1
      // 063: invokestatic java/lang/Math.max (FF)F
      // 066: fdiv
      // 067: f2d
      // 068: dconst_0
      // 069: dconst_1
      // 06a: invokestatic rip/breeze/MathUtil1.clamp_3 (DDD)D
      // 06d: dstore 11
      // 06f: aload 0
      // 070: getfield rip/breeze/MathUtil14.dataBuilder39_t Lrip/breeze/RangeValue;
      // 073: getfield rip/breeze/RangeValue.double_d D
      // 076: dload 11
      // 078: aload 0
      // 079: getfield rip/breeze/MathUtil14.dataBuilder39_t Lrip/breeze/RangeValue;
      // 07c: getfield rip/breeze/RangeValue.double_e D
      // 07f: dmul
      // 080: dadd
      // 081: dstore 13
      // 083: aload 0
      // 084: invokevirtual rip/breeze/MathUtil14.k ()Lrip/breeze/GenericSetting;
      // 087: aload 0
      // 088: getfield rip/breeze/MathUtil14.dataBuilder39_t Lrip/breeze/RangeValue;
      // 08b: dload 13
      // 08d: invokevirtual rip/breeze/RangeValue.calculateDouble (D)D
      // 090: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 093: invokevirtual rip/breeze/GenericSetting.processAll (Ljava/lang/Object;)V
      // 096: aload 0
      // 097: getfield rip/breeze/MathUtil14.stringDecryptHelper6_u Lrip/breeze/StringDecryptHelper6;
      // 09a: invokevirtual rip/breeze/StringDecryptHelper6.isValid_2 ()Z
      // 09d: ifne 0c1
      // 0a0: aload 0
      // 0a1: getfield rip/breeze/MathUtil14.stringDecryptHelper6_u Lrip/breeze/StringDecryptHelper6;
      // 0a4: aload 0
      // 0a5: invokevirtual rip/breeze/MathUtil14.k ()Lrip/breeze/GenericSetting;
      // 0a8: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 0ab: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 0ae: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 0b1: aload 0
      // 0b2: getfield rip/breeze/MathUtil14.stringDecryptHelper6_u Lrip/breeze/StringDecryptHelper6;
      // 0b5: ldc ""
      // 0b7: invokevirtual rip/breeze/StringDecryptHelper6.clamp_8 (Ljava/lang/String;)V
      // 0ba: goto 0c1
      // 0bd: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0c0: athrow
      // 0c1: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 0c4: aload 0
      // 0c5: getfield rip/breeze/MathUtil14.stringDecryptHelper6_u Lrip/breeze/StringDecryptHelper6;
      // 0c8: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 0cb: sipush 2805
      // 0ce: ldc2_w 8767076676044085651
      // 0d1: lload 4
      // 0d3: lxor
      // 0d4: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil14.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 0dc: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 0df: sipush 25456
      // 0e2: ldc2_w 7302450192393908244
      // 0e5: lload 4
      // 0e7: lxor
      // 0e8: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil14.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 0f0: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 0f3: bipush 43
      // 0f5: ldc2_w 3366701993482703687
      // 0f8: lload 4
      // 0fa: lxor
      // 0fb: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil14.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 103: invokeinterface rip/breeze/IRenderer.fillRoundedRectTwoColor (Lrip/breeze/LicenseState;FFLjava/awt/Color;)V 5
      // 108: aload 0
      // 109: getfield rip/breeze/MathUtil14.stringDecryptHelper6_u Lrip/breeze/StringDecryptHelper6;
      // 10c: fload 1
      // 10d: fload 2
      // 10e: fload 3
      // 10f: invokevirtual rip/breeze/StringDecryptHelper6.update (FFF)V
      // 112: aload 0
      // 113: aload 0
      // 114: getfield rip/breeze/MathUtil14.fieldFloat_y F
      // 117: f2d
      // 118: aload 0
      // 119: invokevirtual rip/breeze/MathUtil14.k ()Lrip/breeze/GenericSetting;
      // 11c: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 11f: checkcast java/lang/Double
      // 122: invokevirtual java/lang/Double.doubleValue ()D
      // 125: aload 0
      // 126: getfield rip/breeze/MathUtil14.dataBuilder39_t Lrip/breeze/RangeValue;
      // 129: getfield rip/breeze/RangeValue.double_d D
      // 12c: dsub
      // 12d: aload 0
      // 12e: getfield rip/breeze/MathUtil14.dataBuilder39_t Lrip/breeze/RangeValue;
      // 131: getfield rip/breeze/RangeValue.double_e D
      // 134: ddiv
      // 135: dconst_0
      // 136: dconst_1
      // 137: invokestatic rip/breeze/MathUtil1.clamp_3 (DDD)D
      // 13a: d2f
      // 13b: f2d
      // 13c: ldc2_w 15.0
      // 13f: fload 3
      // 140: f2d
      // 141: invokestatic rip/breeze/MathUtil1.calculateDouble_2 (DDDD)D
      // 144: d2f
      // 145: putfield rip/breeze/MathUtil14.fieldFloat_y F
      // 148: aload 0
      // 149: getfield rip/breeze/MathUtil14.fieldFloat_v F
      // 14c: aload 0
      // 14d: getfield rip/breeze/MathUtil14.fieldFloat_y F
      // 150: fmul
      // 151: fstore 15
      // 153: fload 1
      // 154: aload 0
      // 155: getfield rip/breeze/MathUtil14.fieldFloat_w F
      // 158: fcmpl
      // 159: iflt 19f
      // 15c: fload 1
      // 15d: aload 0
      // 15e: getfield rip/breeze/MathUtil14.fieldFloat_w F
      // 161: aload 0
      // 162: getfield rip/breeze/MathUtil14.fieldFloat_v F
      // 165: fadd
      // 166: fcmpg
      // 167: ifgt 19f
      // 16a: goto 171
      // 16d: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 170: athrow
      // 171: fload 2
      // 172: aload 0
      // 173: getfield rip/breeze/MathUtil14.fieldFloat_x F
      // 176: ldc 10.0
      // 178: fsub
      // 179: fcmpl
      // 17a: iflt 19f
      // 17d: goto 184
      // 180: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 183: athrow
      // 184: fload 2
      // 185: aload 0
      // 186: getfield rip/breeze/MathUtil14.fieldFloat_x F
      // 189: ldc 10.0
      // 18b: fadd
      // 18c: fcmpg
      // 18d: ifgt 19f
      // 190: goto 197
      // 193: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 196: athrow
      // 197: bipush 1
      // 198: goto 1a0
      // 19b: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 19e: athrow
      // 19f: bipush 0
      // 1a0: istore 16
      // 1a2: aload 0
      // 1a3: iload 16
      // 1a5: ifeq 1c1
      // 1a8: aload 0
      // 1a9: getfield rip/breeze/MathUtil14.k Lrip/breeze/GenericSetting;
      // 1ac: getfield rip/breeze/GenericSetting.fieldBool_k Z
      // 1af: ifne 1c1
      // 1b2: goto 1b9
      // 1b5: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1b8: athrow
      // 1b9: bipush 1
      // 1ba: goto 1c2
      // 1bd: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1c0: athrow
      // 1c1: bipush 0
      // 1c2: putfield rip/breeze/MathUtil14.fieldBool_z Z
      // 1c5: aload 0
      // 1c6: getfield rip/breeze/MathUtil14.dataBuilder15_s Lrip/breeze/client/AnimationTimer;
      // 1c9: aload 0
      // 1ca: getfield rip/breeze/MathUtil14.fieldBool_z Z
      // 1cd: ifne 1de
      // 1d0: aload 0
      // 1d1: getfield rip/breeze/MathUtil14.fieldBool_A Z
      // 1d4: ifeq 1e6
      // 1d7: goto 1de
      // 1da: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1dd: athrow
      // 1de: bipush 1
      // 1df: goto 1e7
      // 1e2: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1e5: athrow
      // 1e6: bipush 0
      // 1e7: lload 6
      // 1e9: dup2_x1
      // 1ea: pop2
      // 1eb: invokevirtual rip/breeze/client/AnimationTimer.toggle (JZ)V
      // 1ee: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 1f1: sipush 24342
      // 1f4: ldc2_w 2104942609163783283
      // 1f7: lload 4
      // 1f9: lxor
      // 1fa: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil14.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: invokevirtual rip/breeze/AuthSession.isValid (Ljava/lang/String;)Z
      // 202: ifeq 20f
      // 205: ldc_w 5.0
      // 208: goto 212
      // 20b: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 20e: athrow
      // 20f: ldc_w 2.5
      // 212: fstore 17
      // 214: aload 0
      // 215: getfield rip/breeze/MathUtil14.fieldFloat_w F
      // 218: fstore 18
      // 21a: fconst_0
      // 21b: fload 15
      // 21d: invokestatic java/lang/Math.max (FF)F
      // 220: fstore 19
      // 222: aload 0
      // 223: getfield rip/breeze/MathUtil14.fieldFloat_w F
      // 226: fload 15
      // 228: fadd
      // 229: fstore 20
      // 22b: fconst_0
      // 22c: aload 0
      // 22d: getfield rip/breeze/MathUtil14.fieldFloat_v F
      // 230: fload 15
      // 232: fsub
      // 233: invokestatic java/lang/Math.max (FF)F
      // 236: fstore 21
      // 238: aload 0
      // 239: getfield rip/breeze/MathUtil14.fieldFloat_x F
      // 23c: ldc_w 5.0
      // 23f: fsub
      // 240: fstore 22
      // 242: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 245: fload 18
      // 247: fload 22
      // 249: fload 19
      // 24b: ldc 10.0
      // 24d: bipush 4
      // 24e: newarray 6
      // 250: dup
      // 251: bipush 0
      // 252: fload 17
      // 254: fastore
      // 255: dup
      // 256: bipush 1
      // 257: fconst_0
      // 258: fastore
      // 259: dup
      // 25a: bipush 2
      // 25b: fconst_0
      // 25c: fastore
      // 25d: dup
      // 25e: bipush 3
      // 25f: fload 17
      // 261: fastore
      // 262: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 265: sipush 10863
      // 268: ldc2_w 3733161856991328512
      // 26b: lload 4
      // 26d: lxor
      // 26e: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil14.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 273: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 276: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 279: sipush 22341
      // 27c: ldc2_w 7888762546170856491
      // 27f: lload 4
      // 281: lxor
      // 282: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil14.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 28a: aload 0
      // 28b: invokevirtual rip/breeze/MathUtil14.j ()Lrip/breeze/client/AnimationTimer;
      // 28e: lload 8
      // 290: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 293: d2f
      // 294: invokestatic rip/breeze/RenderUtil1.clamp (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 297: invokeinterface rip/breeze/IRenderer.fillGradientRectSimple (FFFF[FLjava/awt/Color;)V 7
      // 29c: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 29f: fload 20
      // 2a1: fload 22
      // 2a3: fload 21
      // 2a5: ldc 10.0
      // 2a7: bipush 4
      // 2a8: newarray 6
      // 2aa: dup
      // 2ab: bipush 0
      // 2ac: fconst_0
      // 2ad: fastore
      // 2ae: dup
      // 2af: bipush 1
      // 2b0: fload 17
      // 2b2: fastore
      // 2b3: dup
      // 2b4: bipush 2
      // 2b5: fload 17
      // 2b7: fastore
      // 2b8: dup
      // 2b9: bipush 3
      // 2ba: fconst_0
      // 2bb: fastore
      // 2bc: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 2bf: sipush 2206
      // 2c2: ldc2_w 1741911981921098740
      // 2c5: lload 4
      // 2c7: lxor
      // 2c8: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil14.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cd: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 2d0: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 2d3: sipush 11658
      // 2d6: ldc2_w 3301361724690333411
      // 2d9: lload 4
      // 2db: lxor
      // 2dc: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil14.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 2e4: aload 0
      // 2e5: invokevirtual rip/breeze/MathUtil14.j ()Lrip/breeze/client/AnimationTimer;
      // 2e8: lload 8
      // 2ea: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 2ed: d2f
      // 2ee: invokestatic rip/breeze/RenderUtil1.clamp (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 2f1: invokeinterface rip/breeze/IRenderer.fillGradientRectSimple (FFFF[FLjava/awt/Color;)V 7
      // 2f6: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 2f9: sipush 22138
      // 2fc: ldc2_w 8303726692014654737
      // 2ff: lload 4
      // 301: lxor
      // 302: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil14.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: invokevirtual rip/breeze/AuthSession.isValid (Ljava/lang/String;)Z
      // 30a: ifeq 350
      // 30d: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 310: aload 0
      // 311: getfield rip/breeze/MathUtil14.fieldFloat_w F
      // 314: fload 15
      // 316: fadd
      // 317: aload 0
      // 318: getfield rip/breeze/MathUtil14.fieldFloat_x F
      // 31b: ldc2_w 10.0
      // 31e: dconst_1
      // 31f: aload 0
      // 320: getfield rip/breeze/MathUtil14.dataBuilder15_s Lrip/breeze/client/AnimationTimer;
      // 323: lload 8
      // 325: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 328: dmul
      // 329: dadd
      // 32a: d2f
      // 32b: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 32e: sipush 1306
      // 331: ldc2_w 8489380903855380082
      // 334: lload 4
      // 336: lxor
      // 337: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil14.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33c: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 33f: invokeinterface rip/breeze/IRenderer.fillCircle (FFFLjava/awt/Color;)V 5
      // 344: aload 10
      // 346: ifnull 3ad
      // 349: goto 350
      // 34c: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 34f: athrow
      // 350: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 353: aload 0
      // 354: getfield rip/breeze/MathUtil14.fieldFloat_w F
      // 357: fload 15
      // 359: fadd
      // 35a: ldc_w 4.0
      // 35d: fsub
      // 35e: aload 0
      // 35f: getfield rip/breeze/MathUtil14.fieldFloat_x F
      // 362: ldc_w 12.5
      // 365: fsub
      // 366: f2d
      // 367: ldc2_w 1.5
      // 36a: aload 0
      // 36b: getfield rip/breeze/MathUtil14.dataBuilder15_s Lrip/breeze/client/AnimationTimer;
      // 36e: lload 8
      // 370: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 373: dmul
      // 374: dsub
      // 375: d2f
      // 376: ldc 8.0
      // 378: ldc2_w 23.0
      // 37b: ldc2_w 3.0
      // 37e: aload 0
      // 37f: getfield rip/breeze/MathUtil14.dataBuilder15_s Lrip/breeze/client/AnimationTimer;
      // 382: lload 8
      // 384: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 387: dmul
      // 388: dadd
      // 389: d2f
      // 38a: ldc_w 3.0
      // 38d: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 390: sipush 17400
      // 393: ldc2_w 9204755087468728469
      // 396: lload 4
      // 398: lxor
      // 399: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil14.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39e: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 3a1: invokeinterface rip/breeze/IRenderer.fillRoundedRectFull (FFFFFLjava/awt/Color;)V 7
      // 3a6: goto 3ad
      // 3a9: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 3ac: athrow
      // 3ad: return
      // try (21 -> 31): 32 java/lang/NumberFormatException
      // try (28 -> 36): 36 java/lang/NumberFormatException
      // try (78 -> 93): 94 java/lang/NumberFormatException
      // try (161 -> 174): 175 java/lang/NumberFormatException
      // try (166 -> 184): 185 java/lang/NumberFormatException
      // try (177 -> 194): 195 java/lang/NumberFormatException
      // try (187 -> 199): 199 java/lang/NumberFormatException
      // try (203 -> 210): 211 java/lang/NumberFormatException
      // try (206 -> 215): 215 java/lang/NumberFormatException
      // try (218 -> 227): 228 java/lang/NumberFormatException
      // try (224 -> 232): 232 java/lang/NumberFormatException
      // try (235 -> 249): 249 java/lang/NumberFormatException
      // try (277 -> 399): 400 java/lang/NumberFormatException
      // try (373 -> 441): 442 java/lang/NumberFormatException
   }

   public boolean isActive(float param1, float param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil14.31920342840831L J
      // 03: ldc2_w 138161893117780
      // 06: lxor
      // 07: lstore 4
      // 09: aload 0
      // 0a: getfield rip/breeze/MathUtil14.stringDecryptHelper6_u Lrip/breeze/StringDecryptHelper6;
      // 0d: fload 1
      // 0e: fload 2
      // 0f: iload 3
      // 10: bipush 0
      // 11: invokevirtual rip/breeze/StringDecryptHelper6.absValue (FFIZ)Z
      // 14: ifeq 1d
      // 17: bipush 1
      // 18: ireturn
      // 19: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1c: athrow
      // 1d: iload 3
      // 1e: ifne 32
      // 21: aload 0
      // 22: getfield rip/breeze/MathUtil14.k Lrip/breeze/GenericSetting;
      // 25: getfield rip/breeze/GenericSetting.fieldBool_k Z
      // 28: ifeq 38
      // 2b: goto 32
      // 2e: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 37: athrow
      // 38: fload 1
      // 39: aload 0
      // 3a: getfield rip/breeze/MathUtil14.fieldFloat_w F
      // 3d: fcmpl
      // 3e: iflt 84
      // 41: fload 1
      // 42: aload 0
      // 43: getfield rip/breeze/MathUtil14.fieldFloat_w F
      // 46: aload 0
      // 47: getfield rip/breeze/MathUtil14.fieldFloat_v F
      // 4a: fadd
      // 4b: fcmpg
      // 4c: ifgt 84
      // 4f: goto 56
      // 52: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 55: athrow
      // 56: fload 2
      // 57: aload 0
      // 58: getfield rip/breeze/MathUtil14.fieldFloat_x F
      // 5b: ldc 10.0
      // 5d: fsub
      // 5e: fcmpl
      // 5f: iflt 84
      // 62: goto 69
      // 65: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 68: athrow
      // 69: fload 2
      // 6a: aload 0
      // 6b: getfield rip/breeze/MathUtil14.fieldFloat_x F
      // 6e: ldc 10.0
      // 70: fadd
      // 71: fcmpg
      // 72: ifgt 84
      // 75: goto 7c
      // 78: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 7b: athrow
      // 7c: bipush 1
      // 7d: goto 85
      // 80: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 83: athrow
      // 84: bipush 0
      // 85: istore 6
      // 87: iload 6
      // 89: ifne 92
      // 8c: bipush 0
      // 8d: ireturn
      // 8e: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 91: athrow
      // 92: aload 0
      // 93: bipush 1
      // 94: putfield rip/breeze/MathUtil14.fieldBool_A Z
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
      // 00: getstatic rip/breeze/MathUtil14.31920342840831L J
      // 03: ldc2_w 14094440686126
      // 06: lxor
      // 07: lstore 4
      // 09: aload 0
      // 0a: getfield rip/breeze/MathUtil14.stringDecryptHelper6_u Lrip/breeze/StringDecryptHelper6;
      // 0d: fload 1
      // 0e: fload 2
      // 0f: iload 3
      // 10: invokevirtual rip/breeze/StringDecryptHelper6.toggle (FFI)V
      // 13: aload 0
      // 14: getfield rip/breeze/MathUtil14.fieldBool_A Z
      // 17: ifeq 31
      // 1a: iload 3
      // 1b: ifne 31
      // 1e: goto 25
      // 21: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 24: athrow
      // 25: aload 0
      // 26: bipush 0
      // 27: putfield rip/breeze/MathUtil14.fieldBool_A Z
      // 2a: goto 31
      // 2d: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 30: athrow
      // 31: return
      // try (4 -> 15): 16 java/lang/NumberFormatException
      // try (13 -> 21): 22 java/lang/NumberFormatException
   }

   @Override
   public void toggle_2() {
      super.h();
      this.stringDecryptHelper6_u.processAll_3();
      this.fieldBool_A = false;
   }

   public boolean isValid(char var1) {
      return this.stringDecryptHelper6_u.clamp_2(var1);
   }

   @Override
   public boolean isValid_2(int var1) {
      return this.stringDecryptHelper6_u.clamp(var1);
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
      int var5 = (int)((int)Math.max(Math.abs(this.dataBuilder39_t.double_d), Math.abs(this.dataBuilder39_t.double_c)) * (1.0 / this.dataBuilder39_t.double_f));
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
               this.stringDecryptHelper6_u.a((int)(this.a + this.c - 10.0F - var13 - 30.0F), (int)(this.b + 5.0F), (int)(var13 + 30.0F), var9);
               this.fieldFloat_w = this.a + 10.0F;
               this.fieldFloat_v = Math.max(0.0F, this.c - 20.0F);
               this.fieldFloat_x = this.b + 8.0F + var9 + 8.0F + 5.0F;
               if (var3 == null) {
                  break label29;
               }
            } catch (NumberFormatException var11) {
               throw getNumberFormatException(var11);
            }
         }

         try {
            this.fieldFloat_v = Math.max(0.0F, this.c - 200.0F - 60.0F - var13);
            this.stringDecryptHelper6_u
               .a((int)(this.a + this.fieldFloat_v + 200.0F + 15.0F), (int)(this.b + 5.0F), (int)(this.c - this.fieldFloat_v - 200.0F - 25.0F), 35.0F);
            this.fieldFloat_w = this.a + 200.0F;
            this.fieldFloat_x = this.b + 22.5F;
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

   private void lambda$new_Inner0(GenericSetting param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil14.31920342840831L J
      // 03: ldc2_w 5633288113311
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic rip/breeze/RenderUtil43.getString ()Ljava/lang/String;
      // 0b: astore 5
      // 0d: getstatic rip/breeze/BreezeContext.iKeybindSettings_e Lrip/breeze/IKeybindSettings;
      // 10: invokeinterface rip/breeze/IKeybindSettings.getWidth ()Z 1
      // 15: ifeq 2f
      // 18: aload 1
      // 19: aload 2
      // 1a: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 1d: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 20: invokevirtual rip/breeze/GenericSetting.processNullable (Ljava/lang/Object;)V
      // 23: aload 5
      // 25: ifnull 4b
      // 28: goto 2f
      // 2b: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 2e: athrow
      // 2f: aload 0
      // 30: invokevirtual rip/breeze/MathUtil14.k ()Lrip/breeze/GenericSetting;
      // 33: aload 0
      // 34: getfield rip/breeze/MathUtil14.dataBuilder39_t Lrip/breeze/RangeValue;
      // 37: aload 2
      // 38: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 3b: invokevirtual rip/breeze/RangeValue.getDouble_3 (D)D
      // 3e: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 41: invokevirtual rip/breeze/GenericSetting.processAll (Ljava/lang/Object;)V
      // 44: goto 4b
      // 47: invokestatic rip/breeze/MathUtil14.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 4a: athrow
      // 4b: goto 50
      // 4e: astore 6
      // 50: return
      // try (9 -> 28): 29 java/lang/NumberFormatException
      // try (6 -> 16): 17 java/lang/NumberFormatException
      // try (6 -> 31): 32 java/lang/NumberFormatException
   }

   static {
      long var0 = 42196439009186L;
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
      String var6 = "\u009d\u008fÙº7ª5\u0005\u00022sè\u0001àüê\u007f\u000f3oÐ}n!ü¼¸öÿá\u0018° ç¢í\u0088ªp(\u0094øQ\u0085úÊzZE¦\u008co\u0013êúßÎ\u0018yq¼YË)Y(ÂË\u0081/&\u0086\u00adù\rû\u0092jN4Æ~\u008dêËÖ{_\u0093\u009aÀªFþÂ¤ï\u0016K~0\u00114w\u0092\\ #\u008ayûV\u001f£R\u008cS\u0091óÿ«q\u008c\u0001\u0001rU×+\u0098N\u007f4Îõ\u0019\u001cK[ ò@DÝ¿\u0094ÛòVc7áûð±äõôVð²*¿+ûedªä#¼©8\u009eÇçMÿþ6\u0005)¿§ô^Â5Û5CÂ%1çé\u0089!òF\f455k\u008eí¦\\ªx\u0098\u0094UoK\u0006Zuz\u001fè¤\u008bùe® â(æ3¬¼Æ\u0003\u0015ö\b<¼Ð\u0093+<ê7Q]\u0087\u0093Ä\n\u0094¿\u009c|Ó\u000eoàîéÍrÚü\u0017®,(üeEÂ]¡\bí\u0094Q\u0004½\u0089é{<\u0093\u009dÉ÷\u000fg\u000bgè\u0096·`¡PgfCg¸\u0095^Qæ\u00150ö\u0004¼Ï÷Û©îwTóS\u0093F\u008d\u0015!2\tÂtý¯\u0018\u009b?.Ç'\u001eê\u0010è\u008dV\r\u000b\u0012\u000fûÇ´l\u0002Æ#nß";
      int var7 = "\u009d\u008fÙº7ª5\u0005\u00022sè\u0001àüê\u007f\u000f3oÐ}n!ü¼¸öÿá\u0018° ç¢í\u0088ªp(\u0094øQ\u0085úÊzZE¦\u008co\u0013êúßÎ\u0018yq¼YË)Y(ÂË\u0081/&\u0086\u00adù\rû\u0092jN4Æ~\u008dêËÖ{_\u0093\u009aÀªFþÂ¤ï\u0016K~0\u00114w\u0092\\ #\u008ayûV\u001f£R\u008cS\u0091óÿ«q\u008c\u0001\u0001rU×+\u0098N\u007f4Îõ\u0019\u001cK[ ò@DÝ¿\u0094ÛòVc7áûð±äõôVð²*¿+ûedªä#¼©8\u009eÇçMÿþ6\u0005)¿§ô^Â5Û5CÂ%1çé\u0089!òF\f455k\u008eí¦\\ªx\u0098\u0094UoK\u0006Zuz\u001fè¤\u008bùe® â(æ3¬¼Æ\u0003\u0015ö\b<¼Ð\u0093+<ê7Q]\u0087\u0093Ä\n\u0094¿\u009c|Ó\u000eoàîéÍrÚü\u0017®,(üeEÂ]¡\bí\u0094Q\u0004½\u0089é{<\u0093\u009dÉ÷\u000fg\u000bgè\u0096·`¡PgfCg¸\u0095^Qæ\u00150ö\u0004¼Ï÷Û©îwTóS\u0093F\u008d\u0015!2\tÂtý¯\u0018\u009b?.Ç'\u001eê\u0010è\u008dV\r\u000b\u0012\u000fûÇ´l\u0002Æ#nß"
         .length();
      char var8 = ' ';
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
                     String var15 = ")\u0097¨Ä\u008dDmÂU}ÁS\u0088ÁØ³";
                     int var16 = ")\u0097¨Ä\u008dDmÂU}ÁS\u0088ÁØ³".length();
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
                                    CONST_P = (int)var13[2];
                                    CONST_O = (int)var13[1];
                                    CONST_R = (int)var13[0];
                                    CONST_N = (int)var13[3];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "ÉèÝjìè\u008c\u0086\u00adG\u0094Â\u0080.\u0019\u0011";
                                 var16 = "ÉèÝjìè\u008c\u0086\u00adG\u0094Â\u0080.\u0019\u0011".length();
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

                  var6 = "õ=\u0083Í ª\u008cô\u0087úV[\u00992\u001f¨ìkàW¯Ô>Ä\u0005¶L¤4\u007f(µ,\u0014\u0096:ÌÚÞ\u0083(Y°1\u0094ä8P\u000b.I*ÒÑßæ\u000e\u00995\u0096z}\u00add: \u0087.`c\u000eÍ»<\ndÊ`O¥g";
                  var7 = "õ=\u0083Í ª\u008cô\u0087úV[\u00992\u001f¨ìkàW¯Ô>Ä\u0005¶L¤4\u007f(µ,\u0014\u0096:ÌÚÞ\u0083(Y°1\u0094ä8P\u000b.I*ÒÑßæ\u000e\u00995\u0096z}\u00add: \u0087.`c\u000eÍ»<\ndÊ`O¥g"
                     .length();
                  var8 = '(';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11822;
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
            throw new RuntimeException("rip/breeze/dP", var10);
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
         throw new RuntimeException("rip/breeze/dP" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
