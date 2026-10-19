package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class MathUtil16 extends RenderUtil43<RangeValue> {
   private static final int CONST_N;
   private static final int CONST_O;
   private static final int CONST_P;
   private static final float CONST_Q = 10.0F;
   private static final int CONST_R;
   private final rip.breeze.client.AnimationTimer[] arr_s;
   private final double[] arr_t;
   private final boolean[] arr_u;
   private boolean[] arr_v;
   private final RangeValue dataBuilder39_w;
   private final Function<Double, String> function_x;
   private final StringDecryptHelper6[] arr_y;
   private float fieldFloat_z;
   private float fieldFloat_A;
   private float fieldFloat_B;
   private static final String[] CONST_H;
   private static final String[] CONST_I;
   private static final Map CONST_J = new HashMap(13);

   public MathUtil16(GenericSetting<RangeValue> param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MathUtil16.74123569042036L J
      // 003: ldc2_w 64892443834134
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial rip/breeze/RenderUtil43.<init> (Lrip/breeze/GenericSetting;)V
      // 00d: aload 0
      // 00e: bipush 2
      // 00f: anewarray 50
      // 012: putfield rip/breeze/MathUtil16.arr_s [Lrip/breeze/client/AnimationTimer;
      // 015: aload 0
      // 016: bipush 2
      // 017: newarray 7
      // 019: putfield rip/breeze/MathUtil16.arr_t [D
      // 01c: aload 0
      // 01d: bipush 2
      // 01e: newarray 4
      // 020: putfield rip/breeze/MathUtil16.arr_u [Z
      // 023: invokestatic rip/breeze/RenderUtil43.getString ()Ljava/lang/String;
      // 026: aload 0
      // 027: bipush 2
      // 028: newarray 4
      // 02a: putfield rip/breeze/MathUtil16.arr_v [Z
      // 02d: aload 0
      // 02e: bipush 2
      // 02f: anewarray 64
      // 032: putfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 035: astore 4
      // 037: aload 0
      // 038: fconst_0
      // 039: putfield rip/breeze/MathUtil16.fieldFloat_z F
      // 03c: aload 0
      // 03d: fconst_0
      // 03e: putfield rip/breeze/MathUtil16.fieldFloat_A F
      // 041: aload 0
      // 042: fconst_0
      // 043: putfield rip/breeze/MathUtil16.fieldFloat_B F
      // 046: aload 1
      // 047: getfield rip/breeze/GenericSetting.formatter Ljava/util/function/Function;
      // 04a: instanceof rip/breeze/FuncUtil3
      // 04d: ifeq 06a
      // 050: aload 0
      // 051: aload 1
      // 052: getfield rip/breeze/GenericSetting.formatter Ljava/util/function/Function;
      // 055: checkcast rip/breeze/FuncUtil3
      // 058: getfield rip/breeze/FuncUtil3.function_a Ljava/util/function/Function;
      // 05b: putfield rip/breeze/MathUtil16.function_x Ljava/util/function/Function;
      // 05e: aload 4
      // 060: ifnull 07a
      // 063: goto 06a
      // 066: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 069: athrow
      // 06a: aload 0
      // 06b: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;, (Ljava/lang/Double;)Ljava/lang/String; ]
      // 070: putfield rip/breeze/MathUtil16.function_x Ljava/util/function/Function;
      // 073: goto 07a
      // 076: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 079: athrow
      // 07a: aload 1
      // 07b: getfield rip/breeze/GenericSetting.predicate_h Ljava/util/function/Predicate;
      // 07e: instanceof rip/breeze/BreezePredicate3
      // 081: ifeq 095
      // 084: aload 1
      // 085: getfield rip/breeze/GenericSetting.predicate_h Ljava/util/function/Predicate;
      // 088: checkcast rip/breeze/BreezePredicate3
      // 08b: getfield rip/breeze/BreezePredicate3.dataBuilder39_a Lrip/breeze/RangeValue;
      // 08e: astore 5
      // 090: aload 4
      // 092: ifnull 09e
      // 095: aload 1
      // 096: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 099: checkcast rip/breeze/RangeValue
      // 09c: astore 5
      // 09e: aload 0
      // 09f: aload 5
      // 0a1: getfield rip/breeze/RangeValue.double_f D
      // 0a4: dconst_0
      // 0a5: dcmpl
      // 0a6: ifne 0b8
      // 0a9: aload 5
      // 0ab: ldc2_w 0.1
      // 0ae: invokevirtual rip/breeze/RangeValue.getDataBuilder39_3 (D)Lrip/breeze/RangeValue;
      // 0b1: goto 0ba
      // 0b4: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0b7: athrow
      // 0b8: aload 5
      // 0ba: putfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 0bd: aload 0
      // 0be: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 0c1: getfield rip/breeze/RangeValue.double_d D
      // 0c4: invokestatic java/lang/Math.abs (D)D
      // 0c7: aload 0
      // 0c8: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 0cb: getfield rip/breeze/RangeValue.double_c D
      // 0ce: invokestatic java/lang/Math.abs (D)D
      // 0d1: invokestatic java/lang/Math.max (DD)D
      // 0d4: d2i
      // 0d5: istore 6
      // 0d7: bipush 1
      // 0d8: bipush 1
      // 0d9: iload 6
      // 0db: invokestatic java/lang/Math.max (II)I
      // 0de: i2d
      // 0df: invokestatic java/lang/Math.log10 (D)D
      // 0e2: invokestatic java/lang/Math.floor (D)D
      // 0e5: d2i
      // 0e6: bipush 1
      // 0e7: iadd
      // 0e8: invokestatic java/lang/Math.max (II)I
      // 0eb: istore 7
      // 0ed: new java/lang/StringBuilder
      // 0f0: dup
      // 0f1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f4: astore 8
      // 0f6: bipush 0
      // 0f7: istore 9
      // 0f9: iload 9
      // 0fb: iload 7
      // 0fd: if_icmpge 110
      // 100: aload 8
      // 102: ldc "0"
      // 104: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 107: pop
      // 108: iinc 9 1
      // 10b: aload 4
      // 10d: ifnull 0f9
      // 110: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 113: aload 8
      // 115: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 118: getstatic rip/breeze/EnumType32.SOURCE_SANS Lrip/breeze/EnumType32;
      // 11b: ldc 22.0
      // 11d: invokeinterface rip/breeze/IRenderer.measureText (Ljava/lang/String;Lrip/breeze/EnumType32;F)F 4
      // 122: ldc 45.0
      // 124: fadd
      // 125: f2i
      // 126: istore 9
      // 128: aload 0
      // 129: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 12c: bipush 0
      // 12d: new rip/breeze/StringDecryptHelper6
      // 130: dup
      // 131: ldc ""
      // 133: new rip/breeze/LicenseState
      // 136: dup
      // 137: invokespecial rip/breeze/LicenseState.<init> ()V
      // 13a: aload 0
      // 13b: aload 1
      // 13c: invokedynamic accept (Lrip/breeze/MathUtil16;Lrip/breeze/GenericSetting;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, rip/breeze/MathUtil16.lambda$new_Inner0 (Lrip/breeze/GenericSetting;Ljava/lang/String;)V, (Ljava/lang/String;)V ]
      // 141: bipush 1
      // 142: bipush 1
      // 143: invokespecial rip/breeze/StringDecryptHelper6.<init> (Ljava/lang/String;Lrip/breeze/LicenseState;Ljava/util/function/Consumer;ZZ)V
      // 146: aastore
      // 147: aload 0
      // 148: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 14b: bipush 1
      // 14c: new rip/breeze/StringDecryptHelper6
      // 14f: dup
      // 150: ldc ""
      // 152: new rip/breeze/LicenseState
      // 155: dup
      // 156: invokespecial rip/breeze/LicenseState.<init> ()V
      // 159: aload 0
      // 15a: aload 1
      // 15b: invokedynamic accept (Lrip/breeze/MathUtil16;Lrip/breeze/GenericSetting;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, rip/breeze/MathUtil16.lambda$new_Inner1 (Lrip/breeze/GenericSetting;Ljava/lang/String;)V, (Ljava/lang/String;)V ]
      // 160: bipush 1
      // 161: bipush 1
      // 162: invokespecial rip/breeze/StringDecryptHelper6.<init> (Ljava/lang/String;Lrip/breeze/LicenseState;Ljava/util/function/Consumer;ZZ)V
      // 165: aastore
      // 166: bipush 0
      // 167: istore 10
      // 169: iload 10
      // 16b: bipush 2
      // 16c: if_icmpge 1a4
      // 16f: aload 0
      // 170: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 173: iload 10
      // 175: aaload
      // 176: iload 9
      // 178: i2f
      // 179: putfield rip/breeze/StringDecryptHelper6.c F
      // 17c: aload 0
      // 17d: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 180: iload 10
      // 182: aaload
      // 183: ldc 35.0
      // 185: putfield rip/breeze/StringDecryptHelper6.d F
      // 188: aload 0
      // 189: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 18c: iload 10
      // 18e: aaload
      // 18f: new rip/breeze/Util134
      // 192: dup
      // 193: fconst_0
      // 194: ldc 8.0
      // 196: invokespecial rip/breeze/Util134.<init> (FF)V
      // 199: invokevirtual rip/breeze/StringDecryptHelper6.processAll (Lrip/breeze/Util134;)V
      // 19c: iinc 10 1
      // 19f: aload 4
      // 1a1: ifnull 169
      // 1a4: aload 1
      // 1a5: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 1a8: checkcast rip/breeze/RangeValue
      // 1ab: astore 10
      // 1ad: aload 0
      // 1ae: getfield rip/breeze/MathUtil16.arr_t [D
      // 1b1: bipush 0
      // 1b2: aload 10
      // 1b4: getfield rip/breeze/RangeValue.double_d D
      // 1b7: aload 0
      // 1b8: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 1bb: getfield rip/breeze/RangeValue.double_d D
      // 1be: dsub
      // 1bf: aload 0
      // 1c0: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 1c3: getfield rip/breeze/RangeValue.double_e D
      // 1c6: ddiv
      // 1c7: dastore
      // 1c8: aload 0
      // 1c9: getfield rip/breeze/MathUtil16.arr_t [D
      // 1cc: bipush 1
      // 1cd: aload 10
      // 1cf: getfield rip/breeze/RangeValue.double_c D
      // 1d2: aload 0
      // 1d3: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 1d6: getfield rip/breeze/RangeValue.double_d D
      // 1d9: dsub
      // 1da: aload 0
      // 1db: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 1de: getfield rip/breeze/RangeValue.double_e D
      // 1e1: ddiv
      // 1e2: dastore
      // 1e3: bipush 0
      // 1e4: istore 11
      // 1e6: iload 11
      // 1e8: bipush 2
      // 1e9: if_icmpge 208
      // 1ec: aload 0
      // 1ed: getfield rip/breeze/MathUtil16.arr_s [Lrip/breeze/client/AnimationTimer;
      // 1f0: iload 11
      // 1f2: new rip/breeze/client/AnimationTimer
      // 1f5: dup
      // 1f6: ldc 200.0
      // 1f8: bipush 0
      // 1f9: getstatic rip/breeze/client/EnumType3.LINEAR Lrip/breeze/client/EnumType3;
      // 1fc: invokespecial rip/breeze/client/AnimationTimer.<init> (FZLrip/breeze/client/EnumType3;)V
      // 1ff: aastore
      // 200: iinc 11 1
      // 203: aload 4
      // 205: ifnull 1e6
      // 208: return
      // try (29 -> 50): 51 java/lang/NumberFormatException
      // try (42 -> 56): 57 java/lang/NumberFormatException
      // try (74 -> 84): 84 java/lang/NumberFormatException
   }

   public void clamp(float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MathUtil16.74123569042036L J
      // 003: ldc2_w 100855854624566
      // 006: lxor
      // 007: lstore 4
      // 009: lload 4
      // 00b: dup2
      // 00c: ldc2_w 46241641281725
      // 00f: lxor
      // 010: lstore 6
      // 012: pop2
      // 013: invokestatic rip/breeze/RenderUtil43.getString ()Ljava/lang/String;
      // 016: aload 0
      // 017: fload 1
      // 018: fload 2
      // 019: fload 3
      // 01a: invokespecial rip/breeze/RenderUtil43.calculate (FFF)V
      // 01d: aload 0
      // 01e: fload 1
      // 01f: fload 2
      // 020: fload 3
      // 021: invokespecial rip/breeze/MathUtil16.clamp (FFF)V
      // 024: astore 8
      // 026: bipush 0
      // 027: istore 9
      // 029: iload 9
      // 02b: bipush 2
      // 02c: if_icmpge 0ac
      // 02f: aload 0
      // 030: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 033: iload 9
      // 035: aaload
      // 036: invokevirtual rip/breeze/StringDecryptHelper6.isValid_2 ()Z
      // 039: ifne 092
      // 03c: iload 9
      // 03e: ifne 05c
      // 041: goto 048
      // 044: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 047: athrow
      // 048: aload 0
      // 049: invokevirtual rip/breeze/MathUtil16.k ()Lrip/breeze/GenericSetting;
      // 04c: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 04f: checkcast rip/breeze/RangeValue
      // 052: getfield rip/breeze/RangeValue.double_d D
      // 055: goto 069
      // 058: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 05b: athrow
      // 05c: aload 0
      // 05d: invokevirtual rip/breeze/MathUtil16.k ()Lrip/breeze/GenericSetting;
      // 060: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 063: checkcast rip/breeze/RangeValue
      // 066: getfield rip/breeze/RangeValue.double_c D
      // 069: dstore 10
      // 06b: aload 0
      // 06c: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 06f: iload 9
      // 071: aaload
      // 072: aload 0
      // 073: getfield rip/breeze/MathUtil16.function_x Ljava/util/function/Function;
      // 076: dload 10
      // 078: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 07b: invokeinterface java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 080: checkcast java/lang/String
      // 083: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 086: aload 0
      // 087: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 08a: iload 9
      // 08c: aaload
      // 08d: ldc ""
      // 08f: invokevirtual rip/breeze/StringDecryptHelper6.clamp_8 (Ljava/lang/String;)V
      // 092: iinc 9 1
      // 095: aload 8
      // 097: ifnull 029
      // 09a: invokestatic rip/breeze/LicenseState.isValid_2 ()Z
      // 09d: ifne 0a8
      // 0a0: bipush 0
      // 0a1: goto 0a9
      // 0a4: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0a7: athrow
      // 0a8: bipush 1
      // 0a9: invokestatic rip/breeze/LicenseState.toggle (Z)V
      // 0ac: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 0af: aload 0
      // 0b0: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 0b3: bipush 0
      // 0b4: aaload
      // 0b5: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 0b8: sipush 16645
      // 0bb: ldc2_w 5970784511836542017
      // 0be: lload 4
      // 0c0: lxor
      // 0c1: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 0c9: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 0cc: sipush 28936
      // 0cf: ldc2_w 8171181017140192327
      // 0d2: lload 4
      // 0d4: lxor
      // 0d5: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 0dd: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 0e0: sipush 28561
      // 0e3: ldc2_w 2547727401683581650
      // 0e6: lload 4
      // 0e8: lxor
      // 0e9: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 0f1: invokeinterface rip/breeze/IRenderer.fillRoundedRectTwoColor (Lrip/breeze/LicenseState;FFLjava/awt/Color;)V 5
      // 0f6: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 0f9: aload 0
      // 0fa: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 0fd: bipush 1
      // 0fe: aaload
      // 0ff: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 102: sipush 12267
      // 105: ldc2_w 3879166661486459559
      // 108: lload 4
      // 10a: lxor
      // 10b: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 113: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 116: sipush 31223
      // 119: ldc2_w 7412213288430988471
      // 11c: lload 4
      // 11e: lxor
      // 11f: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: invokevirtual rip/breeze/AuthSession.getFloat (Ljava/lang/String;)F
      // 127: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 12a: sipush 21983
      // 12d: ldc2_w 2531697500450832536
      // 130: lload 4
      // 132: lxor
      // 133: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 13b: invokeinterface rip/breeze/IRenderer.fillRoundedRectTwoColor (Lrip/breeze/LicenseState;FFLjava/awt/Color;)V 5
      // 140: aload 0
      // 141: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 144: bipush 0
      // 145: aaload
      // 146: fload 1
      // 147: fload 2
      // 148: fload 3
      // 149: invokevirtual rip/breeze/StringDecryptHelper6.update (FFF)V
      // 14c: aload 0
      // 14d: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 150: bipush 1
      // 151: aaload
      // 152: fload 1
      // 153: fload 2
      // 154: fload 3
      // 155: invokevirtual rip/breeze/StringDecryptHelper6.update (FFF)V
      // 158: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 15b: sipush 30769
      // 15e: ldc2_w 4995334870713625980
      // 161: lload 4
      // 163: lxor
      // 164: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: invokevirtual rip/breeze/AuthSession.isValid (Ljava/lang/String;)Z
      // 16c: ifeq 179
      // 16f: ldc_w 5.0
      // 172: goto 17c
      // 175: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 178: athrow
      // 179: ldc_w 2.5
      // 17c: fstore 9
      // 17e: aload 0
      // 17f: getfield rip/breeze/MathUtil16.fieldFloat_B F
      // 182: ldc_w 5.0
      // 185: fsub
      // 186: fstore 12
      // 188: aload 0
      // 189: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 18c: f2d
      // 18d: aload 0
      // 18e: getfield rip/breeze/MathUtil16.arr_t [D
      // 191: bipush 0
      // 192: daload
      // 193: dmul
      // 194: d2f
      // 195: fstore 13
      // 197: aload 0
      // 198: getfield rip/breeze/MathUtil16.fieldFloat_A F
      // 19b: f2d
      // 19c: aload 0
      // 19d: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 1a0: f2d
      // 1a1: aload 0
      // 1a2: getfield rip/breeze/MathUtil16.arr_t [D
      // 1a5: bipush 1
      // 1a6: daload
      // 1a7: dmul
      // 1a8: dadd
      // 1a9: d2f
      // 1aa: fstore 14
      // 1ac: aload 0
      // 1ad: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 1b0: f2d
      // 1b1: dconst_1
      // 1b2: aload 0
      // 1b3: getfield rip/breeze/MathUtil16.arr_t [D
      // 1b6: bipush 1
      // 1b7: daload
      // 1b8: dsub
      // 1b9: dmul
      // 1ba: d2f
      // 1bb: fstore 15
      // 1bd: aload 0
      // 1be: getfield rip/breeze/MathUtil16.fieldFloat_A F
      // 1c1: f2d
      // 1c2: aload 0
      // 1c3: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 1c6: f2d
      // 1c7: aload 0
      // 1c8: getfield rip/breeze/MathUtil16.arr_t [D
      // 1cb: bipush 0
      // 1cc: daload
      // 1cd: dmul
      // 1ce: dadd
      // 1cf: d2f
      // 1d0: fstore 16
      // 1d2: aload 0
      // 1d3: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 1d6: f2d
      // 1d7: aload 0
      // 1d8: getfield rip/breeze/MathUtil16.arr_t [D
      // 1db: bipush 1
      // 1dc: daload
      // 1dd: aload 0
      // 1de: getfield rip/breeze/MathUtil16.arr_t [D
      // 1e1: bipush 0
      // 1e2: daload
      // 1e3: dsub
      // 1e4: dmul
      // 1e5: d2f
      // 1e6: fstore 17
      // 1e8: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 1eb: aload 0
      // 1ec: getfield rip/breeze/MathUtil16.fieldFloat_A F
      // 1ef: fload 12
      // 1f1: fload 13
      // 1f3: ldc 10.0
      // 1f5: bipush 4
      // 1f6: newarray 6
      // 1f8: dup
      // 1f9: bipush 0
      // 1fa: fload 9
      // 1fc: fastore
      // 1fd: dup
      // 1fe: bipush 1
      // 1ff: fconst_0
      // 200: fastore
      // 201: dup
      // 202: bipush 2
      // 203: fconst_0
      // 204: fastore
      // 205: dup
      // 206: bipush 3
      // 207: fload 9
      // 209: fastore
      // 20a: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 20d: sipush 14136
      // 210: ldc2_w 3277019999515419248
      // 213: lload 4
      // 215: lxor
      // 216: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 21e: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 221: sipush 7325
      // 224: ldc2_w 6725584073160526296
      // 227: lload 4
      // 229: lxor
      // 22a: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 232: aload 0
      // 233: invokevirtual rip/breeze/MathUtil16.j ()Lrip/breeze/client/AnimationTimer;
      // 236: lload 6
      // 238: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 23b: d2f
      // 23c: invokestatic rip/breeze/RenderUtil1.clamp (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 23f: invokeinterface rip/breeze/IRenderer.fillGradientRectSimple (FFFF[FLjava/awt/Color;)V 7
      // 244: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 247: fload 14
      // 249: fload 12
      // 24b: fload 15
      // 24d: ldc 10.0
      // 24f: bipush 4
      // 250: newarray 6
      // 252: dup
      // 253: bipush 0
      // 254: fconst_0
      // 255: fastore
      // 256: dup
      // 257: bipush 1
      // 258: fload 9
      // 25a: fastore
      // 25b: dup
      // 25c: bipush 2
      // 25d: fload 9
      // 25f: fastore
      // 260: dup
      // 261: bipush 3
      // 262: fconst_0
      // 263: fastore
      // 264: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 267: sipush 30209
      // 26a: ldc2_w 1217127169012589384
      // 26d: lload 4
      // 26f: lxor
      // 270: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 275: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 278: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 27b: sipush 3180
      // 27e: ldc2_w 8052416341960923426
      // 281: lload 4
      // 283: lxor
      // 284: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 28c: aload 0
      // 28d: invokevirtual rip/breeze/MathUtil16.j ()Lrip/breeze/client/AnimationTimer;
      // 290: lload 6
      // 292: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 295: d2f
      // 296: invokestatic rip/breeze/RenderUtil1.clamp (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 299: invokeinterface rip/breeze/IRenderer.fillGradientRectSimple (FFFF[FLjava/awt/Color;)V 7
      // 29e: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 2a1: fload 16
      // 2a3: fload 12
      // 2a5: fload 17
      // 2a7: ldc 10.0
      // 2a9: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 2ac: sipush 12633
      // 2af: ldc2_w 7776882122472367123
      // 2b2: lload 4
      // 2b4: lxor
      // 2b5: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 2bd: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 2c0: sipush 2549
      // 2c3: ldc2_w 4276809315170950323
      // 2c6: lload 4
      // 2c8: lxor
      // 2c9: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ce: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 2d1: aload 0
      // 2d2: invokevirtual rip/breeze/MathUtil16.j ()Lrip/breeze/client/AnimationTimer;
      // 2d5: lload 6
      // 2d7: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 2da: d2f
      // 2db: invokestatic rip/breeze/RenderUtil1.clamp (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 2de: invokeinterface rip/breeze/IRenderer.drawRect (FFFFLjava/awt/Color;)V 6
      // 2e3: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 2e6: sipush 18510
      // 2e9: ldc2_w 3086091013475523852
      // 2ec: lload 4
      // 2ee: lxor
      // 2ef: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f4: invokevirtual rip/breeze/AuthSession.isValid (Ljava/lang/String;)Z
      // 2f7: ifeq 390
      // 2fa: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 2fd: aload 0
      // 2fe: getfield rip/breeze/MathUtil16.fieldFloat_A F
      // 301: f2d
      // 302: aload 0
      // 303: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 306: f2d
      // 307: aload 0
      // 308: getfield rip/breeze/MathUtil16.arr_t [D
      // 30b: bipush 0
      // 30c: daload
      // 30d: dmul
      // 30e: dadd
      // 30f: d2f
      // 310: aload 0
      // 311: getfield rip/breeze/MathUtil16.fieldFloat_B F
      // 314: ldc2_w 10.0
      // 317: dconst_1
      // 318: aload 0
      // 319: getfield rip/breeze/MathUtil16.arr_s [Lrip/breeze/client/AnimationTimer;
      // 31c: bipush 0
      // 31d: aaload
      // 31e: lload 6
      // 320: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 323: dmul
      // 324: dadd
      // 325: d2f
      // 326: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 329: sipush 25931
      // 32c: ldc2_w 6696314434349953034
      // 32f: lload 4
      // 331: lxor
      // 332: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 337: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 33a: invokeinterface rip/breeze/IRenderer.fillCircle (FFFLjava/awt/Color;)V 5
      // 33f: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 342: aload 0
      // 343: getfield rip/breeze/MathUtil16.fieldFloat_A F
      // 346: f2d
      // 347: aload 0
      // 348: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 34b: f2d
      // 34c: aload 0
      // 34d: getfield rip/breeze/MathUtil16.arr_t [D
      // 350: bipush 1
      // 351: daload
      // 352: dmul
      // 353: dadd
      // 354: d2f
      // 355: aload 0
      // 356: getfield rip/breeze/MathUtil16.fieldFloat_B F
      // 359: ldc2_w 10.0
      // 35c: dconst_1
      // 35d: aload 0
      // 35e: getfield rip/breeze/MathUtil16.arr_s [Lrip/breeze/client/AnimationTimer;
      // 361: bipush 1
      // 362: aaload
      // 363: lload 6
      // 365: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 368: dmul
      // 369: dadd
      // 36a: d2f
      // 36b: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 36e: sipush 976
      // 371: ldc2_w 122627634200417947
      // 374: lload 4
      // 376: lxor
      // 377: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37c: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 37f: invokeinterface rip/breeze/IRenderer.fillCircle (FFFLjava/awt/Color;)V 5
      // 384: aload 8
      // 386: ifnull 463
      // 389: goto 390
      // 38c: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 38f: athrow
      // 390: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 393: aload 0
      // 394: getfield rip/breeze/MathUtil16.fieldFloat_A F
      // 397: f2d
      // 398: aload 0
      // 399: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 39c: f2d
      // 39d: aload 0
      // 39e: getfield rip/breeze/MathUtil16.arr_t [D
      // 3a1: bipush 0
      // 3a2: daload
      // 3a3: dmul
      // 3a4: dadd
      // 3a5: ldc2_w 4.0
      // 3a8: dsub
      // 3a9: d2f
      // 3aa: aload 0
      // 3ab: getfield rip/breeze/MathUtil16.fieldFloat_B F
      // 3ae: ldc_w 12.5
      // 3b1: fsub
      // 3b2: f2d
      // 3b3: ldc2_w 1.5
      // 3b6: aload 0
      // 3b7: getfield rip/breeze/MathUtil16.arr_s [Lrip/breeze/client/AnimationTimer;
      // 3ba: bipush 0
      // 3bb: aaload
      // 3bc: lload 6
      // 3be: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 3c1: dmul
      // 3c2: dsub
      // 3c3: d2f
      // 3c4: ldc 8.0
      // 3c6: ldc2_w 23.0
      // 3c9: ldc2_w 3.0
      // 3cc: aload 0
      // 3cd: getfield rip/breeze/MathUtil16.arr_s [Lrip/breeze/client/AnimationTimer;
      // 3d0: bipush 0
      // 3d1: aaload
      // 3d2: lload 6
      // 3d4: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 3d7: dmul
      // 3d8: dadd
      // 3d9: d2f
      // 3da: ldc_w 3.0
      // 3dd: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 3e0: sipush 976
      // 3e3: ldc2_w 122627634200417947
      // 3e6: lload 4
      // 3e8: lxor
      // 3e9: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ee: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 3f1: invokeinterface rip/breeze/IRenderer.fillRoundedRectFull (FFFFFLjava/awt/Color;)V 7
      // 3f6: getstatic rip/breeze/BreezeContext.iRenderer_b Lrip/breeze/IRenderer;
      // 3f9: aload 0
      // 3fa: getfield rip/breeze/MathUtil16.fieldFloat_A F
      // 3fd: f2d
      // 3fe: aload 0
      // 3ff: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 402: f2d
      // 403: aload 0
      // 404: getfield rip/breeze/MathUtil16.arr_t [D
      // 407: bipush 1
      // 408: daload
      // 409: dmul
      // 40a: dadd
      // 40b: ldc2_w 4.0
      // 40e: dsub
      // 40f: d2f
      // 410: aload 0
      // 411: getfield rip/breeze/MathUtil16.fieldFloat_B F
      // 414: ldc_w 12.5
      // 417: fsub
      // 418: f2d
      // 419: ldc2_w 1.5
      // 41c: aload 0
      // 41d: getfield rip/breeze/MathUtil16.arr_s [Lrip/breeze/client/AnimationTimer;
      // 420: bipush 1
      // 421: aaload
      // 422: lload 6
      // 424: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 427: dmul
      // 428: dsub
      // 429: d2f
      // 42a: ldc 8.0
      // 42c: ldc2_w 23.0
      // 42f: ldc2_w 3.0
      // 432: aload 0
      // 433: getfield rip/breeze/MathUtil16.arr_s [Lrip/breeze/client/AnimationTimer;
      // 436: bipush 1
      // 437: aaload
      // 438: lload 6
      // 43a: invokevirtual rip/breeze/client/AnimationTimer.getDouble (J)D
      // 43d: dmul
      // 43e: dadd
      // 43f: d2f
      // 440: ldc_w 3.0
      // 443: getstatic rip/breeze/BreezeContext.authSession_c Lrip/breeze/AuthSession;
      // 446: sipush 976
      // 449: ldc2_w 122627634200417947
      // 44c: lload 4
      // 44e: lxor
      // 44f: invokedynamic t (IJ)Ljava/lang/String; bsm=rip/breeze/MathUtil16.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 454: invokevirtual rip/breeze/AuthSession.getColor (Ljava/lang/String;)Ljava/awt/Color;
      // 457: invokeinterface rip/breeze/IRenderer.fillRoundedRectFull (FFFFFLjava/awt/Color;)V 7
      // 45c: goto 463
      // 45f: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 462: athrow
      // 463: return
      // try (27 -> 35): 36 java/lang/NumberFormatException
      // try (33 -> 44): 44 java/lang/NumberFormatException
      // try (72 -> 76): 76 java/lang/NumberFormatException
      // try (80 -> 160): 160 java/lang/NumberFormatException
      // try (234 -> 429): 430 java/lang/NumberFormatException
      // try (357 -> 536): 537 java/lang/NumberFormatException
   }

   private void clamp(float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/MathUtil16.74123569042036L J
      // 003: ldc2_w 120924957068135
      // 006: lxor
      // 007: lstore 4
      // 009: lload 4
      // 00b: dup2
      // 00c: ldc2_w 38275648983076
      // 00f: lxor
      // 010: lstore 6
      // 012: pop2
      // 013: invokestatic rip/breeze/RenderUtil43.getString ()Ljava/lang/String;
      // 016: astore 8
      // 018: aload 0
      // 019: invokevirtual rip/breeze/MathUtil16.j ()Lrip/breeze/client/AnimationTimer;
      // 01c: aload 0
      // 01d: invokevirtual rip/breeze/MathUtil16.j ()Lrip/breeze/client/AnimationTimer;
      // 020: invokevirtual rip/breeze/client/AnimationTimer.isBool_e ()Z
      // 023: ifne 046
      // 026: aload 0
      // 027: getfield rip/breeze/MathUtil16.arr_u [Z
      // 02a: bipush 0
      // 02b: baload
      // 02c: ifne 046
      // 02f: goto 036
      // 032: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 035: athrow
      // 036: aload 0
      // 037: getfield rip/breeze/MathUtil16.arr_u [Z
      // 03a: bipush 1
      // 03b: baload
      // 03c: ifeq 04e
      // 03f: goto 046
      // 042: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 045: athrow
      // 046: bipush 1
      // 047: goto 04f
      // 04a: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 04d: athrow
      // 04e: bipush 0
      // 04f: lload 6
      // 051: dup2_x1
      // 052: pop2
      // 053: invokevirtual rip/breeze/client/AnimationTimer.toggle (JZ)V
      // 056: fload 1
      // 057: aload 0
      // 058: getfield rip/breeze/MathUtil16.fieldFloat_A F
      // 05b: fsub
      // 05c: aload 0
      // 05d: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 060: fconst_1
      // 061: invokestatic java/lang/Math.max (FF)F
      // 064: fdiv
      // 065: f2d
      // 066: aload 0
      // 067: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 06a: getfield rip/breeze/RangeValue.double_e D
      // 06d: dmul
      // 06e: aload 0
      // 06f: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 072: getfield rip/breeze/RangeValue.double_d D
      // 075: dadd
      // 076: dstore 9
      // 078: aload 0
      // 079: getfield rip/breeze/MathUtil16.arr_u [Z
      // 07c: bipush 0
      // 07d: baload
      // 07e: ifeq 094
      // 081: aload 0
      // 082: dload 9
      // 084: bipush 1
      // 085: invokespecial rip/breeze/MathUtil16.processAll_2 (DZ)V
      // 088: aload 8
      // 08a: ifnull 0b2
      // 08d: goto 094
      // 090: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 093: athrow
      // 094: aload 0
      // 095: getfield rip/breeze/MathUtil16.arr_u [Z
      // 098: bipush 1
      // 099: baload
      // 09a: ifeq 0b2
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: dload 9
      // 0a7: bipush 1
      // 0a8: invokespecial rip/breeze/MathUtil16.processAll_3 (DZ)V
      // 0ab: goto 0b2
      // 0ae: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield rip/breeze/MathUtil16.arr_t [D
      // 0b6: bipush 0
      // 0b7: aload 0
      // 0b8: getfield rip/breeze/MathUtil16.arr_t [D
      // 0bb: bipush 0
      // 0bc: daload
      // 0bd: aload 0
      // 0be: invokevirtual rip/breeze/MathUtil16.k ()Lrip/breeze/GenericSetting;
      // 0c1: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 0c4: checkcast rip/breeze/RangeValue
      // 0c7: getfield rip/breeze/RangeValue.double_d D
      // 0ca: aload 0
      // 0cb: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 0ce: getfield rip/breeze/RangeValue.double_d D
      // 0d1: dsub
      // 0d2: aload 0
      // 0d3: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 0d6: getfield rip/breeze/RangeValue.double_e D
      // 0d9: ddiv
      // 0da: dconst_0
      // 0db: dconst_1
      // 0dc: invokestatic rip/breeze/MathUtil1.clamp_3 (DDD)D
      // 0df: ldc2_w 15.0
      // 0e2: fload 3
      // 0e3: f2d
      // 0e4: invokestatic rip/breeze/MathUtil1.calculateDouble_2 (DDDD)D
      // 0e7: dastore
      // 0e8: aload 0
      // 0e9: getfield rip/breeze/MathUtil16.arr_t [D
      // 0ec: bipush 1
      // 0ed: aload 0
      // 0ee: getfield rip/breeze/MathUtil16.arr_t [D
      // 0f1: bipush 1
      // 0f2: daload
      // 0f3: aload 0
      // 0f4: invokevirtual rip/breeze/MathUtil16.k ()Lrip/breeze/GenericSetting;
      // 0f7: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 0fa: checkcast rip/breeze/RangeValue
      // 0fd: getfield rip/breeze/RangeValue.double_c D
      // 100: aload 0
      // 101: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 104: getfield rip/breeze/RangeValue.double_d D
      // 107: dsub
      // 108: aload 0
      // 109: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 10c: getfield rip/breeze/RangeValue.double_e D
      // 10f: ddiv
      // 110: dconst_0
      // 111: dconst_1
      // 112: invokestatic rip/breeze/MathUtil1.clamp_3 (DDD)D
      // 115: ldc2_w 15.0
      // 118: fload 3
      // 119: f2d
      // 11a: invokestatic rip/breeze/MathUtil1.calculateDouble_2 (DDDD)D
      // 11d: dastore
      // 11e: fload 1
      // 11f: aload 0
      // 120: getfield rip/breeze/MathUtil16.fieldFloat_A F
      // 123: fcmpl
      // 124: iflt 16a
      // 127: fload 1
      // 128: aload 0
      // 129: getfield rip/breeze/MathUtil16.fieldFloat_A F
      // 12c: aload 0
      // 12d: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 130: fadd
      // 131: fcmpg
      // 132: ifgt 16a
      // 135: goto 13c
      // 138: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 13b: athrow
      // 13c: fload 2
      // 13d: aload 0
      // 13e: getfield rip/breeze/MathUtil16.fieldFloat_B F
      // 141: ldc 10.0
      // 143: fsub
      // 144: fcmpl
      // 145: iflt 16a
      // 148: goto 14f
      // 14b: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 14e: athrow
      // 14f: fload 2
      // 150: aload 0
      // 151: getfield rip/breeze/MathUtil16.fieldFloat_B F
      // 154: ldc 10.0
      // 156: fadd
      // 157: fcmpg
      // 158: ifgt 16a
      // 15b: goto 162
      // 15e: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 161: athrow
      // 162: bipush 1
      // 163: goto 16b
      // 166: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 169: athrow
      // 16a: bipush 0
      // 16b: istore 11
      // 16d: iload 11
      // 16f: ifeq 23f
      // 172: aload 0
      // 173: getfield rip/breeze/MathUtil16.fieldFloat_A F
      // 176: f2d
      // 177: aload 0
      // 178: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 17b: f2d
      // 17c: aload 0
      // 17d: getfield rip/breeze/MathUtil16.arr_t [D
      // 180: bipush 0
      // 181: daload
      // 182: dmul
      // 183: dadd
      // 184: d2f
      // 185: fstore 12
      // 187: aload 0
      // 188: getfield rip/breeze/MathUtil16.fieldFloat_A F
      // 18b: f2d
      // 18c: aload 0
      // 18d: getfield rip/breeze/MathUtil16.fieldFloat_z F
      // 190: f2d
      // 191: aload 0
      // 192: getfield rip/breeze/MathUtil16.arr_t [D
      // 195: bipush 1
      // 196: daload
      // 197: dmul
      // 198: dadd
      // 199: d2f
      // 19a: fstore 13
      // 19c: fload 1
      // 19d: fload 12
      // 19f: fsub
      // 1a0: invokestatic java/lang/Math.abs (F)F
      // 1a3: fstore 14
      // 1a5: fload 1
      // 1a6: fload 13
      // 1a8: fsub
      // 1a9: invokestatic java/lang/Math.abs (F)F
      // 1ac: fstore 15
      // 1ae: aload 0
      // 1af: invokevirtual rip/breeze/MathUtil16.k ()Lrip/breeze/GenericSetting;
      // 1b2: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 1b5: checkcast rip/breeze/RangeValue
      // 1b8: getfield rip/breeze/RangeValue.double_d D
      // 1bb: aload 0
      // 1bc: getfield rip/breeze/MathUtil16.dataBuilder39_w Lrip/breeze/RangeValue;
      // 1bf: getfield rip/breeze/RangeValue.double_c D
      // 1c2: dcmpl
      // 1c3: ifne 1cc
      // 1c6: fload 14
      // 1c8: fconst_1
      // 1c9: fsub
      // 1ca: fstore 14
      // 1cc: fload 12
      // 1ce: fload 13
      // 1d0: fcmpl
      // 1d1: ifne 20b
      // 1d4: fload 1
      // 1d5: fload 12
      // 1d7: fcmpl
      // 1d8: ifle 1ea
      // 1db: goto 1e2
      // 1de: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1e1: athrow
      // 1e2: bipush 1
      // 1e3: goto 1eb
      // 1e6: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1e9: athrow
      // 1ea: bipush 0
      // 1eb: istore 16
      // 1ed: aload 0
      // 1ee: bipush 2
      // 1ef: newarray 4
      // 1f1: dup
      // 1f2: bipush 0
      // 1f3: iload 16
      // 1f5: ifne 200
      // 1f8: bipush 1
      // 1f9: goto 201
      // 1fc: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1ff: athrow
      // 200: bipush 0
      // 201: bastore
      // 202: dup
      // 203: bipush 1
      // 204: iload 16
      // 206: bastore
      // 207: putfield rip/breeze/MathUtil16.arr_v [Z
      // 20a: return
      // 20b: aload 0
      // 20c: bipush 2
      // 20d: newarray 4
      // 20f: dup
      // 210: bipush 0
      // 211: fload 14
      // 213: fload 15
      // 215: fcmpg
      // 216: ifgt 221
      // 219: bipush 1
      // 21a: goto 222
      // 21d: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 220: athrow
      // 221: bipush 0
      // 222: bastore
      // 223: dup
      // 224: bipush 1
      // 225: fload 15
      // 227: fload 14
      // 229: fcmpg
      // 22a: ifge 235
      // 22d: bipush 1
      // 22e: goto 236
      // 231: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 234: athrow
      // 235: bipush 0
      // 236: bastore
      // 237: putfield rip/breeze/MathUtil16.arr_v [Z
      // 23a: aload 8
      // 23c: ifnull 255
      // 23f: aload 0
      // 240: bipush 2
      // 241: newarray 4
      // 243: dup
      // 244: bipush 0
      // 245: bipush 0
      // 246: bastore
      // 247: dup
      // 248: bipush 1
      // 249: bipush 0
      // 24a: bastore
      // 24b: putfield rip/breeze/MathUtil16.arr_v [Z
      // 24e: goto 255
      // 251: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 254: athrow
      // 255: aload 0
      // 256: getfield rip/breeze/MathUtil16.arr_s [Lrip/breeze/client/AnimationTimer;
      // 259: bipush 0
      // 25a: aaload
      // 25b: aload 0
      // 25c: getfield rip/breeze/MathUtil16.arr_v [Z
      // 25f: bipush 0
      // 260: baload
      // 261: ifne 274
      // 264: aload 0
      // 265: getfield rip/breeze/MathUtil16.arr_u [Z
      // 268: bipush 0
      // 269: baload
      // 26a: ifeq 27c
      // 26d: goto 274
      // 270: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 273: athrow
      // 274: bipush 1
      // 275: goto 27d
      // 278: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 27b: athrow
      // 27c: bipush 0
      // 27d: lload 6
      // 27f: dup2_x1
      // 280: pop2
      // 281: invokevirtual rip/breeze/client/AnimationTimer.toggle (JZ)V
      // 284: aload 0
      // 285: getfield rip/breeze/MathUtil16.arr_s [Lrip/breeze/client/AnimationTimer;
      // 288: bipush 1
      // 289: aaload
      // 28a: aload 0
      // 28b: getfield rip/breeze/MathUtil16.arr_v [Z
      // 28e: bipush 1
      // 28f: baload
      // 290: ifne 2a3
      // 293: aload 0
      // 294: getfield rip/breeze/MathUtil16.arr_u [Z
      // 297: bipush 1
      // 298: baload
      // 299: ifeq 2ab
      // 29c: goto 2a3
      // 29f: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 2a2: athrow
      // 2a3: bipush 1
      // 2a4: goto 2ac
      // 2a7: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 2aa: athrow
      // 2ab: bipush 0
      // 2ac: lload 6
      // 2ae: dup2_x1
      // 2af: pop2
      // 2b0: invokevirtual rip/breeze/client/AnimationTimer.toggle (JZ)V
      // 2b3: return
      // try (12 -> 23): 24 java/lang/NumberFormatException
      // try (18 -> 31): 32 java/lang/NumberFormatException
      // try (26 -> 36): 36 java/lang/NumberFormatException
      // try (62 -> 73): 74 java/lang/NumberFormatException
      // try (67 -> 81): 82 java/lang/NumberFormatException
      // try (76 -> 88): 89 java/lang/NumberFormatException
      // try (91 -> 160): 161 java/lang/NumberFormatException
      // try (152 -> 170): 171 java/lang/NumberFormatException
      // try (163 -> 180): 181 java/lang/NumberFormatException
      // try (173 -> 185): 185 java/lang/NumberFormatException
      // try (243 -> 251): 252 java/lang/NumberFormatException
      // try (247 -> 256): 256 java/lang/NumberFormatException
      // try (260 -> 269): 269 java/lang/NumberFormatException
      // try (279 -> 290): 290 java/lang/NumberFormatException
      // try (293 -> 302): 302 java/lang/NumberFormatException
      // try (305 -> 321): 322 java/lang/NumberFormatException
      // try (324 -> 338): 339 java/lang/NumberFormatException
      // try (333 -> 343): 343 java/lang/NumberFormatException
      // try (346 -> 364): 365 java/lang/NumberFormatException
      // try (359 -> 369): 369 java/lang/NumberFormatException
   }

   public boolean checkCondition(float param1, float param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil16.74123569042036L J
      // 03: ldc2_w 39352222427359
      // 06: lxor
      // 07: lstore 4
      // 09: aload 0
      // 0a: getfield rip/breeze/MathUtil16.k Lrip/breeze/GenericSetting;
      // 0d: getfield rip/breeze/GenericSetting.fieldBool_k Z
      // 10: ifeq 1f
      // 13: aload 0
      // 14: fload 1
      // 15: fload 2
      // 16: iload 3
      // 17: invokespecial rip/breeze/RenderUtil43.a (FFI)Z
      // 1a: ireturn
      // 1b: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 23: bipush 0
      // 24: aaload
      // 25: fload 1
      // 26: fload 2
      // 27: iload 3
      // 28: bipush 0
      // 29: invokevirtual rip/breeze/StringDecryptHelper6.absValue (FFIZ)Z
      // 2c: ifeq 35
      // 2f: bipush 1
      // 30: ireturn
      // 31: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 34: athrow
      // 35: aload 0
      // 36: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 39: bipush 1
      // 3a: aaload
      // 3b: fload 1
      // 3c: fload 2
      // 3d: iload 3
      // 3e: bipush 0
      // 3f: invokevirtual rip/breeze/StringDecryptHelper6.absValue (FFIZ)Z
      // 42: ifeq 4b
      // 45: bipush 1
      // 46: ireturn
      // 47: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 4a: athrow
      // 4b: iload 3
      // 4c: ifne 82
      // 4f: aload 0
      // 50: getfield rip/breeze/MathUtil16.arr_v [Z
      // 53: bipush 0
      // 54: baload
      // 55: ifeq 6c
      // 58: goto 5f
      // 5b: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield rip/breeze/MathUtil16.arr_u [Z
      // 63: bipush 0
      // 64: bipush 1
      // 65: bastore
      // 66: bipush 1
      // 67: ireturn
      // 68: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield rip/breeze/MathUtil16.arr_v [Z
      // 70: bipush 1
      // 71: baload
      // 72: ifeq 82
      // 75: aload 0
      // 76: getfield rip/breeze/MathUtil16.arr_u [Z
      // 79: bipush 1
      // 7a: bipush 1
      // 7b: bastore
      // 7c: bipush 1
      // 7d: ireturn
      // 7e: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 81: athrow
      // 82: bipush 0
      // 83: ireturn
      // try (4 -> 14): 14 java/lang/NumberFormatException
      // try (16 -> 28): 28 java/lang/NumberFormatException
      // try (30 -> 42): 42 java/lang/NumberFormatException
      // try (44 -> 51): 52 java/lang/NumberFormatException
      // try (46 -> 61): 61 java/lang/NumberFormatException
      // try (63 -> 75): 75 java/lang/NumberFormatException
   }

   public void processAll(float var1, float var2, int var3) {
      long var4 = 19626231814097L;
      String var10000 = RenderUtil43.getString();
      int var6 = 0;
      String var7 = var10000;

      while (var6 < 2) {
         this.arr_y[var6].toggle(var1, var2, var3);
         var6++;
         if (var7 != null) {
            break;
         }
      }

      try {
         if (var3 == 0) {
            this.arr_u[0] = false;
            this.arr_u[1] = false;
         }
      } catch (NumberFormatException var8) {
         throw getNumberFormatException(var8);
      }
   }

   public boolean checkCondition_2(char param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil16.74123569042036L J
      // 03: ldc2_w 123191223796292
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 0c: bipush 0
      // 0d: aaload
      // 0e: iload 1
      // 0f: invokevirtual rip/breeze/StringDecryptHelper6.clamp_2 (C)Z
      // 12: ifne 29
      // 15: aload 0
      // 16: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 19: bipush 1
      // 1a: aaload
      // 1b: iload 1
      // 1c: invokevirtual rip/breeze/StringDecryptHelper6.clamp_2 (C)Z
      // 1f: ifeq 31
      // 22: goto 29
      // 25: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 28: athrow
      // 29: bipush 1
      // 2a: goto 32
      // 2d: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
      // try (4 -> 18): 19 java/lang/NumberFormatException
      // try (11 -> 23): 23 java/lang/NumberFormatException
   }

   public boolean checkCondition_3(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil16.74123569042036L J
      // 03: ldc2_w 116589216948315
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 0c: bipush 0
      // 0d: aaload
      // 0e: iload 1
      // 0f: invokevirtual rip/breeze/StringDecryptHelper6.clamp (I)Z
      // 12: ifne 29
      // 15: aload 0
      // 16: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 19: bipush 1
      // 1a: aaload
      // 1b: iload 1
      // 1c: invokevirtual rip/breeze/StringDecryptHelper6.clamp (I)Z
      // 1f: ifeq 31
      // 22: goto 29
      // 25: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 28: athrow
      // 29: bipush 1
      // 2a: goto 32
      // 2d: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
      // try (4 -> 18): 19 java/lang/NumberFormatException
      // try (11 -> 23): 23 java/lang/NumberFormatException
   }

   public void processAll() {
      super.h();
      this.arr_y[0].processAll_3();
      this.arr_y[1].processAll_3();
      this.arr_u[0] = false;
      this.arr_u[1] = false;
   }

   public void absValue() {
      long var1 = 62740630596709L;
      String var3 = RenderUtil43.getString();

      boolean var10000;
      label35: {
         try {
            if (this.c < 500.0F) {
               var10000 = true;
               break label35;
            }
         } catch (NumberFormatException var14) {
            throw getNumberFormatException(var14);
         }

         var10000 = false;
      }

      boolean var4 = var10000;
      int var5 = (int)((int)Math.max(Math.abs(this.dataBuilder39_w.double_d), Math.abs(this.dataBuilder39_w.double_c)) * (1.0 / this.dataBuilder39_w.double_f));
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

      label21: {
         float var15 = BreezeContext.iRenderer_b.measureText(var7.toString(), EnumType32.SOURCE_SANS, 22.0F);
         if (var4) {
            byte var9 = 35;
            int var10 = (int)(var15 + 30.0F);
            byte var11 = 8;
            int var12 = var10 * 2 + var11;
            int var13 = (int)(this.a + this.c - 10.0F - var12);
            this.arr_y[0].a(var13, (int)(this.b + 5.0F), var10, var9);
            this.arr_y[1].a(var13 + var10 + var11, (int)(this.b + 5.0F), var10, var9);
            this.fieldFloat_A = this.a + 10.0F;
            this.fieldFloat_z = Math.max(0.0F, this.c - 20.0F);
            this.fieldFloat_B = this.b + 8.0F + var9 + 8.0F + 5.0F;
            if (var3 == null) {
               break label21;
            }
         }

         byte var16 = 10;
         float var17 = (30.0F + var15) * 2.0F + var16 + 10.0F + 10.0F;
         this.fieldFloat_z = Math.max(0.0F, this.c - 200.0F - var17);
         this.arr_y[0].a((int)(this.a + this.fieldFloat_z + 200.0F + 10.0F), (int)(this.b + 5.0F), 30.0F + var15, 35.0F);
         this.arr_y[1].a(this.arr_y[0].a + 30.0F + var15 + var16, (int)(this.b + 5.0F), 30.0F + var15, 35.0F);
         this.fieldFloat_A = this.a + 200.0F;
         this.fieldFloat_B = this.b + 22.5F;
      }

      this.arr_y[0].g();
      this.arr_y[1].g();
      super.calculate_2();
   }

   public void clamp_2(float var1, float var2, float var3, float var4) {
      long var5 = 102388927128469L;

      boolean var10000;
      label31: {
         try {
            if (var3 < 400.0F) {
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

   private void processAll_2(double var1, boolean var3) {
      long var4 = 132080192463600L;
      RangeValue var6 = (RangeValue)this.k.getObject_m();
      RangeValue var7 = this.dataBuilder39_w.getDataBuilder39_2(var6.double_c);

      GenericSetting var10000;
      RangeValue var10001;
      double var10002;
      label17: {
         try {
            var10000 = this.k;
            var10001 = var6;
            if (var3) {
               var10002 = var7.calculateDouble(var1);
               break label17;
            }
         } catch (NumberFormatException var8) {
            throw getNumberFormatException(var8);
         }

         var10002 = var7.getDouble_3(var1);
      }

      var10000.processAll(var10001.getDataBuilder39(var10002));
   }

   private void processAll_3(double var1, boolean var3) {
      long var4 = 89397903590893L;
      RangeValue var6 = (RangeValue)this.k.getObject_m();
      RangeValue var7 = this.dataBuilder39_w.getDataBuilder39(var6.double_d);

      GenericSetting var10000;
      RangeValue var10001;
      double var10002;
      label17: {
         try {
            var10000 = this.k;
            var10001 = var6;
            if (var3) {
               var10002 = var7.calculateDouble(var1);
               break label17;
            }
         } catch (NumberFormatException var8) {
            throw getNumberFormatException(var8);
         }

         var10002 = var7.getDouble_3(var1);
      }

      var10000.processAll(var10001.getDataBuilder39_2(var10002));
   }

   public boolean isValid(float var1) {
      return true;
   }

   private void lambda$new_Inner1(GenericSetting param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil16.74123569042036L J
      // 03: ldc2_w 102023606580279
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic rip/breeze/RenderUtil43.getString ()Ljava/lang/String;
      // 0b: astore 5
      // 0d: aload 2
      // 0e: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 11: dstore 6
      // 13: getstatic rip/breeze/BreezeContext.iKeybindSettings_e Lrip/breeze/IKeybindSettings;
      // 16: invokeinterface rip/breeze/IKeybindSettings.getWidth ()Z 1
      // 1b: ifeq 3a
      // 1e: aload 1
      // 1f: aload 1
      // 20: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 23: checkcast rip/breeze/RangeValue
      // 26: dload 6
      // 28: invokevirtual rip/breeze/RangeValue.getDataBuilder39_2 (D)Lrip/breeze/RangeValue;
      // 2b: invokevirtual rip/breeze/GenericSetting.processNullable (Ljava/lang/Object;)V
      // 2e: aload 5
      // 30: ifnull 48
      // 33: goto 3a
      // 36: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 39: athrow
      // 3a: aload 0
      // 3b: dload 6
      // 3d: bipush 0
      // 3e: invokespecial rip/breeze/MathUtil16.processAll_3 (DZ)V
      // 41: goto 48
      // 44: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 47: athrow
      // 48: aload 0
      // 49: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 4c: bipush 1
      // 4d: aaload
      // 4e: aload 0
      // 4f: getfield rip/breeze/MathUtil16.function_x Ljava/util/function/Function;
      // 52: aload 1
      // 53: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 56: checkcast rip/breeze/RangeValue
      // 59: getfield rip/breeze/RangeValue.double_c D
      // 5c: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 5f: invokeinterface java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 64: checkcast java/lang/String
      // 67: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 6a: goto 6f
      // 6d: astore 8
      // 6f: return
      // try (12 -> 28): 29 java/lang/NumberFormatException
      // try (9 -> 21): 22 java/lang/NumberFormatException
      // try (6 -> 45): 46 java/lang/NumberFormatException
   }

   private void lambda$new_Inner0(GenericSetting param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/MathUtil16.74123569042036L J
      // 03: ldc2_w 139944687988873
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic rip/breeze/RenderUtil43.getString ()Ljava/lang/String;
      // 0b: astore 5
      // 0d: aload 2
      // 0e: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 11: dstore 6
      // 13: getstatic rip/breeze/BreezeContext.iKeybindSettings_e Lrip/breeze/IKeybindSettings;
      // 16: invokeinterface rip/breeze/IKeybindSettings.getWidth ()Z 1
      // 1b: ifeq 3a
      // 1e: aload 1
      // 1f: aload 1
      // 20: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 23: checkcast rip/breeze/RangeValue
      // 26: dload 6
      // 28: invokevirtual rip/breeze/RangeValue.getDataBuilder39 (D)Lrip/breeze/RangeValue;
      // 2b: invokevirtual rip/breeze/GenericSetting.processNullable (Ljava/lang/Object;)V
      // 2e: aload 5
      // 30: ifnull 48
      // 33: goto 3a
      // 36: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 39: athrow
      // 3a: aload 0
      // 3b: dload 6
      // 3d: bipush 0
      // 3e: invokespecial rip/breeze/MathUtil16.processAll_2 (DZ)V
      // 41: goto 48
      // 44: invokestatic rip/breeze/MathUtil16.getNumberFormatException (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 47: athrow
      // 48: aload 0
      // 49: getfield rip/breeze/MathUtil16.arr_y [Lrip/breeze/StringDecryptHelper6;
      // 4c: bipush 0
      // 4d: aaload
      // 4e: aload 0
      // 4f: getfield rip/breeze/MathUtil16.function_x Ljava/util/function/Function;
      // 52: aload 1
      // 53: invokevirtual rip/breeze/GenericSetting.getObject_m ()Ljava/lang/Object;
      // 56: checkcast rip/breeze/RangeValue
      // 59: getfield rip/breeze/RangeValue.double_d D
      // 5c: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 5f: invokeinterface java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 64: checkcast java/lang/String
      // 67: invokevirtual rip/breeze/StringDecryptHelper6.setString_k (Ljava/lang/String;)V
      // 6a: goto 6f
      // 6d: astore 8
      // 6f: return
      // try (12 -> 28): 29 java/lang/NumberFormatException
      // try (9 -> 21): 22 java/lang/NumberFormatException
      // try (6 -> 45): 46 java/lang/NumberFormatException
   }

   static {
      long var0 = 139536705484493L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[16];
      int var5 = 0;
      String var6 = "è\u0084\u007f\u0017\u009f?åmijü,ó°Êi\r¤pF;å\u0098\u0080\u0099M!ÚíG0\u0097O9²\u0089) mØ\u0083ÓÓ²°Ø²T\u0096n£Ø\u009b±l\u009e8='Þë\u0097õ`±óÄ²3vK\u0085Kã¿\u009bíC³£¡FÒa¸þ³¦èü¯ë£Ï\u001da\u0087`Ê\u009dÂ\u0095*O\u008fa\u0086é:\u001f]fí(\u0089\u0016´øV\u0093b\f\u0010ÏüvKô+\t\u00ad\u00139(\u0005ºïøW*¢#Æ\u001aêð\u009c7})\u0006\u0080}Ü0\u0017\u0095ì\u0005\u000föô×,ÿóJ)Ó\u00adÂ¤:\u0010*$\u0094«CL3Ä´\u0018\u0087.Ú\u00880\u009f(0\u0011\u0018\u0015\u0014Ä\u009ek$ÚÝ\u0089 ¢\u00005\u0002\nÁò©éò¼\u001fã9¡cëS\u0083\u0017\u009f\u0010\u00035v\u0085êPM|\u0004ç\u0018\u0003Ê\b2÷õÎ\u0087\u0018th`^\u0096á\u0090²\t_ N7\u0010ì(=-Ê\u0083\rûÆô\u0019k\u00825\u009aß\u000e\u0092Uy\u008aø'$úëp(\u0095\u0015\"\u009c£¡ÀáIëÝÝ¡L(£¦\u001fZ\u0018&\u0088Û½w\b!¡±\u0002\u0019Ù\u0092\u009cÃ\u0097wG\u0088_ò0cm\u001e\u001d\u009a\r\u0006Â-9\u001a\u0094¹(\bË¦\u0086Dþp\u0095zÁ(¾\u001dÉ&P½µ$ XtI3ï)\r;Ù\u001b\u008b\u008e\u008d\u0010\u0015\u009f7\u0016áU l0òýd/)º\u0013¬(¾T\u0010Ï\u009bïôDªö@:\u0006ûKáÂmIÊ6(\u008a?a+Tà\u0019ÉC·\u0092¯\u008fUÍ_l\u007fSLxPýÞÙ¹\\÷\u0081Ü±tÛæXÄÏ\u008aÌT8âû\u0010~á¸^%úÆóå\u001f«¬$\u000e©x+R¥6\u0095\u0014Ç\u0087·ù\u0016róÖ\u008e\u008bí*\u001aXI\u0090?Íºe\tñ\u001aÚ\u0017\u0002ªæ\u0011n\u0015(\u0091\fm?õ\u00175äÃ$\u009d\u0093¤E#ÚÕ\u000e!Í\u001b¡\u009dÁÎ{+\u008c\u008frV\u0099û.¦Ä\u0090ßöÔ \u0011y*Cy\u008b»(Z\u008c\u0094\"Æâ_g/4í\u0094ÄI@+Ü\u0098²\tô}õ\u0019";
      int var7 = "è\u0084\u007f\u0017\u009f?åmijü,ó°Êi\r¤pF;å\u0098\u0080\u0099M!ÚíG0\u0097O9²\u0089) mØ\u0083ÓÓ²°Ø²T\u0096n£Ø\u009b±l\u009e8='Þë\u0097õ`±óÄ²3vK\u0085Kã¿\u009bíC³£¡FÒa¸þ³¦èü¯ë£Ï\u001da\u0087`Ê\u009dÂ\u0095*O\u008fa\u0086é:\u001f]fí(\u0089\u0016´øV\u0093b\f\u0010ÏüvKô+\t\u00ad\u00139(\u0005ºïøW*¢#Æ\u001aêð\u009c7})\u0006\u0080}Ü0\u0017\u0095ì\u0005\u000föô×,ÿóJ)Ó\u00adÂ¤:\u0010*$\u0094«CL3Ä´\u0018\u0087.Ú\u00880\u009f(0\u0011\u0018\u0015\u0014Ä\u009ek$ÚÝ\u0089 ¢\u00005\u0002\nÁò©éò¼\u001fã9¡cëS\u0083\u0017\u009f\u0010\u00035v\u0085êPM|\u0004ç\u0018\u0003Ê\b2÷õÎ\u0087\u0018th`^\u0096á\u0090²\t_ N7\u0010ì(=-Ê\u0083\rûÆô\u0019k\u00825\u009aß\u000e\u0092Uy\u008aø'$úëp(\u0095\u0015\"\u009c£¡ÀáIëÝÝ¡L(£¦\u001fZ\u0018&\u0088Û½w\b!¡±\u0002\u0019Ù\u0092\u009cÃ\u0097wG\u0088_ò0cm\u001e\u001d\u009a\r\u0006Â-9\u001a\u0094¹(\bË¦\u0086Dþp\u0095zÁ(¾\u001dÉ&P½µ$ XtI3ï)\r;Ù\u001b\u008b\u008e\u008d\u0010\u0015\u009f7\u0016áU l0òýd/)º\u0013¬(¾T\u0010Ï\u009bïôDªö@:\u0006ûKáÂmIÊ6(\u008a?a+Tà\u0019ÉC·\u0092¯\u008fUÍ_l\u007fSLxPýÞÙ¹\\÷\u0081Ü±tÛæXÄÏ\u008aÌT8âû\u0010~á¸^%úÆóå\u001f«¬$\u000e©x+R¥6\u0095\u0014Ç\u0087·ù\u0016róÖ\u008e\u008bí*\u001aXI\u0090?Íºe\tñ\u001aÚ\u0017\u0002ªæ\u0011n\u0015(\u0091\fm?õ\u00175äÃ$\u009d\u0093¤E#ÚÕ\u000e!Í\u001b¡\u009dÁÎ{+\u008c\u008frV\u0099û.¦Ä\u0090ßöÔ \u0011y*Cy\u008b»(Z\u008c\u0094\"Æâ_g/4í\u0094ÄI@+Ü\u0098²\tô}õ\u0019"
         .length();
      char var8 = '8';
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
                     CONST_H = var4;
                     CONST_I = new String[16];
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
                     String var15 = "\u0007ÆD°\fík\u000f3ÀÛüW5Ã\u0002";
                     int var16 = "\u0007ÆD°\fík\u000f3ÀÛüW5Ã\u0002".length();
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
                                    CONST_O = (int)var13[2];
                                    CONST_N = (int)var13[1];
                                    CONST_R = (int)var13[0];
                                    CONST_P = (int)var13[3];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var17 < var16) {
                                    continue label36;
                                 }

                                 var15 = "\u001c\u001b\u0092p\u000fb\u0084F¸¸\u0097\u00040¼ü\u0082";
                                 var16 = "\u001c\u001b\u0092p\u000fb\u0084F¸¸\u0097\u00040¼ü\u0082".length();
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

                  var6 = "\u0082/=¸\nÝ>¦\u008cÏ\u0081\u000b\u0094\u0003lf\u000bTÆ÷\u0098·ª,`\u0086{jt\u00877ÍJ\u0084²\u0093\u0013¡ð`Âú\u0016\u0082\u0096\u001d:\u0094 #Ù\u0017\u0081î]4\tJ}oÕ\u001dW=\u0012ç\u0015\u009dÐDp\u0003¤p\u0019\u000bãÇ\u0003ÿ\u009a";
                  var7 = "\u0082/=¸\nÝ>¦\u008cÏ\u0081\u000b\u0094\u0003lf\u000bTÆ÷\u0098·ª,`\u0086{jt\u00877ÍJ\u0084²\u0093\u0013¡ð`Âú\u0016\u0082\u0096\u001d:\u0094 #Ù\u0017\u0081î]4\tJ}oÕ\u001dW=\u0012ç\u0015\u009dÐDp\u0003¤p\u0019\u000bãÇ\u0003ÿ\u009a"
                     .length();
                  var8 = '0';
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26636;
      if (CONST_I[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_J.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_J.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/dT", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_H[var3].getBytes("ISO-8859-1");
         CONST_I[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_I[var3];
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
         throw new RuntimeException("rip/breeze/dT" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
