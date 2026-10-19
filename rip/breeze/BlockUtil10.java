package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class BlockUtil10<T> {
   private final List<Consumer<T>> list_a;
   private final DateUtil dataBuilder51_b;
   String string_c;
   private String string_d;
   private T object_e;
   private Function<T, String> function_f;
   private Function<String, T> function_g;
   private Function<T, T> function_h;
   private Predicate<T> predicate_i;
   private Predicate<DateUtil> predicate_j;
   private Class<?> class_k;
   private boolean fieldBool_l;
   private boolean fieldBool_m;
   private static String string_n;
   private static final String[] CONST_P;
   private static final String[] CONST_Q;
   private static final Map CONST_R = new HashMap(13);

   BlockUtil10(DateUtil var1) {
      long var2 = 68912243153029L;
      super();
      this.list_a = new ArrayList<>();
      short var10001 = 286;
      long var10002 = 6907810387978939455L ^ var2;
      this.string_d = "No description provided.";
      this.function_f = String::valueOf;
      this.class_k = null;
      this.fieldBool_l = false;
      this.fieldBool_m = false;
      this.dataBuilder51_b = var1;
   }

   public GenericSetting<T> getDataBuilder54() {
      long var1 = 113906445065660L;
      String var3 = DateUtil.getString();

      try {
         if (this.string_c == null) {
            throw new IllegalStateException("A name is required.");
         }
      } catch (IllegalStateException var5) {
         throw getIllegalStateException(var5);
      }

      try {
         if (this.object_e == null) {
            throw new IllegalStateException("A value is required.");
         }
      } catch (IllegalStateException var6) {
         throw getIllegalStateException(var6);
      }

      try {
         GenericSetting var10000 = new GenericSetting<>(
            this.dataBuilder51_b,
            this.string_c,
            this.string_d,
            this.object_e,
            this.function_f,
            this.function_g,
            this.function_h,
            this.predicate_i,
            this.predicate_j,
            this.list_a.toArray(new Consumer[0]),
            this.class_k,
            this.fieldBool_l,
            this.fieldBool_m
         );
         if (!LicenseState.isValid_2()) {
            DateUtil.initialize_2("a42Z1");
         }

         return var10000;
      } catch (IllegalStateException var4) {
         throw getIllegalStateException(var4);
      }
   }

   public BlockUtil10<T> getDataBuilder50(String var1) {
      this.string_c = var1;
      return this;
   }

   public BlockUtil10<T> getDataBuilder50_2(T var1) {
      this.object_e = (T)var1;
      return this;
   }

   public BlockUtil10<T> getDataBuilder50_3(String var1) {
      this.string_d = var1;
      return this;
   }

   public BlockUtil10<T> getDataBuilder50_4(T param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/BlockUtil10.36863369787908L J
      // 003: ldc2_w 130946820464923
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic rip/breeze/DateUtil.getString ()Ljava/lang/String;
      // 00b: aload 0
      // 00c: aload 1
      // 00d: putfield rip/breeze/BlockUtil10.object_e Ljava/lang/Object;
      // 010: astore 4
      // 012: aload 1
      // 013: instanceof rip/breeze/KeyBind
      // 016: ifeq 02c
      // 019: aload 0
      // 01a: getstatic rip/breeze/KeyBind.CONST_A Ljava/util/function/Function;
      // 01d: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 020: aload 4
      // 022: ifnonnull 251
      // 025: goto 02c
      // 028: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 02b: athrow
      // 02c: aload 1
      // 02d: instanceof java/lang/Boolean
      // 030: ifeq 054
      // 033: goto 03a
      // 036: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 039: athrow
      // 03a: aload 0
      // 03b: getstatic rip/breeze/RenderUtil27.CONST_B Ljava/util/function/Function;
      // 03e: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 041: aload 0
      // 042: getstatic rip/breeze/RenderUtil27.CONST_A Ljava/util/function/Function;
      // 045: putfield rip/breeze/BlockUtil10.function_h Ljava/util/function/Function;
      // 048: aload 4
      // 04a: ifnonnull 251
      // 04d: goto 054
      // 050: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 053: athrow
      // 054: aload 1
      // 055: instanceof java/lang/Integer
      // 058: ifeq 075
      // 05b: goto 062
      // 05e: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 061: athrow
      // 062: aload 0
      // 063: getstatic rip/breeze/RenderUtil27.CONST_C Ljava/util/function/Function;
      // 066: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 069: aload 4
      // 06b: ifnonnull 251
      // 06e: goto 075
      // 071: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 074: athrow
      // 075: aload 1
      // 076: instanceof java/lang/Double
      // 079: ifeq 096
      // 07c: goto 083
      // 07f: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 082: athrow
      // 083: aload 0
      // 084: getstatic rip/breeze/RenderUtil27.CONST_D Ljava/util/function/Function;
      // 087: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 08a: aload 4
      // 08c: ifnonnull 251
      // 08f: goto 096
      // 092: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 095: athrow
      // 096: aload 1
      // 097: instanceof java/lang/String
      // 09a: ifeq 0b9
      // 09d: goto 0a4
      // 0a0: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/BlockUtil10.lambda$value_Inner0 (Ljava/lang/String;)Ljava/lang/Object;, (Ljava/lang/String;)Ljava/lang/Object; ]
      // 0aa: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 0ad: aload 4
      // 0af: ifnonnull 251
      // 0b2: goto 0b9
      // 0b5: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0b8: athrow
      // 0b9: aload 1
      // 0ba: instanceof java/lang/Enum
      // 0bd: ifeq 0f0
      // 0c0: goto 0c7
      // 0c3: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: getstatic rip/breeze/RenderUtil27.CONST_G Ljava/util/function/Function;
      // 0cb: putfield rip/breeze/BlockUtil10.function_f Ljava/util/function/Function;
      // 0ce: aload 0
      // 0cf: aload 1
      // 0d0: checkcast java/lang/Enum
      // 0d3: invokestatic rip/breeze/RenderUtil27.getFunction_5 (Ljava/lang/Enum;)Ljava/util/function/Function;
      // 0d6: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 0d9: aload 0
      // 0da: aload 1
      // 0db: checkcast java/lang/Enum
      // 0de: invokestatic rip/breeze/RenderUtil27.getFunction (Ljava/lang/Enum;)Ljava/util/function/Function;
      // 0e1: putfield rip/breeze/BlockUtil10.function_h Ljava/util/function/Function;
      // 0e4: aload 4
      // 0e6: ifnonnull 251
      // 0e9: goto 0f0
      // 0ec: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ef: athrow
      // 0f0: aload 1
      // 0f1: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0f4: invokevirtual java/lang/Class.isArray ()Z
      // 0f7: ifeq 160
      // 0fa: goto 101
      // 0fd: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 100: athrow
      // 101: ldc java/lang/Enum
      // 103: aload 1
      // 104: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 107: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 10a: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 10d: ifeq 160
      // 110: goto 117
      // 113: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 116: athrow
      // 117: aload 1
      // 118: checkcast [Ljava/lang/Enum;
      // 11b: checkcast [Ljava/lang/Enum;
      // 11e: astore 5
      // 120: aload 0
      // 121: getstatic rip/breeze/RenderUtil27.CONST_I Ljava/util/function/Function;
      // 124: putfield rip/breeze/BlockUtil10.function_f Ljava/util/function/Function;
      // 127: aload 5
      // 129: arraylength
      // 12a: ifle 147
      // 12d: aload 0
      // 12e: aload 5
      // 130: bipush 0
      // 131: aaload
      // 132: invokestatic rip/breeze/RenderUtil27.getFunction_3 (Ljava/lang/Enum;)Ljava/util/function/Function;
      // 135: checkcast java/util/function/Function
      // 138: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 13b: aload 4
      // 13d: ifnonnull 15b
      // 140: goto 147
      // 143: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 146: athrow
      // 147: aload 1
      // 148: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 14b: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 14e: astore 6
      // 150: aload 0
      // 151: aload 6
      // 153: invokedynamic apply (Ljava/lang/Class;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/BlockUtil10.lambda$value_Inner1 (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;, (Ljava/lang/String;)Ljava/lang/Object; ]
      // 158: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 15b: aload 4
      // 15d: ifnonnull 251
      // 160: aload 1
      // 161: instanceof java/awt/Color
      // 164: ifeq 188
      // 167: goto 16e
      // 16a: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 16d: athrow
      // 16e: aload 0
      // 16f: getstatic rip/breeze/BreezeColor.CONST_C Ljava/util/function/Function;
      // 172: putfield rip/breeze/BlockUtil10.function_f Ljava/util/function/Function;
      // 175: aload 0
      // 176: getstatic rip/breeze/BreezeColor.CONST_B Ljava/util/function/Function;
      // 179: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 17c: aload 4
      // 17e: ifnonnull 251
      // 181: goto 188
      // 184: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 187: athrow
      // 188: aload 1
      // 189: instanceof rip/breeze/RangeValue
      // 18c: ifeq 1a9
      // 18f: goto 196
      // 192: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 195: athrow
      // 196: aload 0
      // 197: getstatic rip/breeze/RangeValue.CONST_B Ljava/util/function/Function;
      // 19a: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 19d: aload 4
      // 19f: ifnonnull 251
      // 1a2: goto 1a9
      // 1a5: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1a8: athrow
      // 1a9: aload 1
      // 1aa: instanceof rip/breeze/SkinLoader
      // 1ad: ifeq 1d1
      // 1b0: goto 1b7
      // 1b3: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1b6: athrow
      // 1b7: aload 0
      // 1b8: getstatic rip/breeze/RenderUtil27.CONST_E Ljava/util/function/Function;
      // 1bb: putfield rip/breeze/BlockUtil10.function_f Ljava/util/function/Function;
      // 1be: aload 0
      // 1bf: getstatic rip/breeze/RenderUtil27.CONST_F Ljava/util/function/Function;
      // 1c2: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 1c5: aload 4
      // 1c7: ifnonnull 251
      // 1ca: goto 1d1
      // 1cd: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1d0: athrow
      // 1d1: aload 1
      // 1d2: instanceof rip/breeze/ConfigMap
      // 1d5: ifeq 1f9
      // 1d8: goto 1df
      // 1db: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1de: athrow
      // 1df: aload 0
      // 1e0: getstatic rip/breeze/ConfigMap.CONST_A Ljava/util/function/Function;
      // 1e3: putfield rip/breeze/BlockUtil10.function_f Ljava/util/function/Function;
      // 1e6: aload 0
      // 1e7: getstatic rip/breeze/ConfigMap.CONST_B Ljava/util/function/Function;
      // 1ea: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 1ed: aload 4
      // 1ef: ifnonnull 251
      // 1f2: goto 1f9
      // 1f5: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1f8: athrow
      // 1f9: aload 1
      // 1fa: instanceof rip/breeze/PlayerUtil7
      // 1fd: ifeq 221
      // 200: goto 207
      // 203: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 206: athrow
      // 207: aload 0
      // 208: getstatic rip/breeze/PlayerUtil7.CONST_F Ljava/util/function/Function;
      // 20b: putfield rip/breeze/BlockUtil10.function_g Ljava/util/function/Function;
      // 20e: aload 0
      // 20f: getstatic rip/breeze/PlayerUtil7.CONST_G Ljava/util/function/Function;
      // 212: putfield rip/breeze/BlockUtil10.function_f Ljava/util/function/Function;
      // 215: aload 4
      // 217: ifnonnull 251
      // 21a: goto 221
      // 21d: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 220: athrow
      // 221: new java/lang/IllegalArgumentException
      // 224: dup
      // 225: new java/lang/StringBuilder
      // 228: dup
      // 229: invokespecial java/lang/StringBuilder.<init> ()V
      // 22c: sipush 2156
      // 22f: ldc2_w 3570166044396168917
      // 232: lload 2
      // 233: lxor
      // 234: invokedynamic e (IJ)Ljava/lang/String; bsm=rip/breeze/BlockUtil10.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23c: aload 1
      // 23d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 240: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 243: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 246: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 249: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 24c: athrow
      // 24d: invokestatic rip/breeze/BlockUtil10.getIllegalStateException (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 250: athrow
      // 251: aload 0
      // 252: areturn
      // try (9 -> 17): 18 java/lang/IllegalStateException
      // try (12 -> 23): 24 java/lang/IllegalStateException
      // try (20 -> 34): 35 java/lang/IllegalStateException
      // try (26 -> 40): 41 java/lang/IllegalStateException
      // try (37 -> 48): 49 java/lang/IllegalStateException
      // try (43 -> 54): 55 java/lang/IllegalStateException
      // try (51 -> 62): 63 java/lang/IllegalStateException
      // try (57 -> 68): 69 java/lang/IllegalStateException
      // try (65 -> 76): 77 java/lang/IllegalStateException
      // try (71 -> 82): 83 java/lang/IllegalStateException
      // try (79 -> 100): 101 java/lang/IllegalStateException
      // try (85 -> 107): 108 java/lang/IllegalStateException
      // try (103 -> 116): 117 java/lang/IllegalStateException
      // try (123 -> 138): 139 java/lang/IllegalStateException
      // try (149 -> 154): 155 java/lang/IllegalStateException
      // try (151 -> 165): 166 java/lang/IllegalStateException
      // try (157 -> 171): 172 java/lang/IllegalStateException
      // try (168 -> 179): 180 java/lang/IllegalStateException
      // try (174 -> 185): 186 java/lang/IllegalStateException
      // try (182 -> 196): 197 java/lang/IllegalStateException
      // try (188 -> 202): 203 java/lang/IllegalStateException
      // try (199 -> 213): 214 java/lang/IllegalStateException
      // try (205 -> 219): 220 java/lang/IllegalStateException
      // try (216 -> 230): 231 java/lang/IllegalStateException
      // try (222 -> 251): 251 java/lang/IllegalStateException
   }

   public BlockUtil10<T> getDataBuilder50_5(Function<T, String> var1) {
      this.function_f = var1;
      return this;
   }

   public BlockUtil10<T> isActive() {
      this.fieldBool_l = true;
      return this;
   }

   public BlockUtil10<T> getDataBuilder50_6(Function<String, T> var1) {
      this.function_g = var1;
      return this;
   }

   public BlockUtil10<T> getDataBuilder50_7(Function<T, T> var1) {
      this.function_h = var1;
      return this;
   }

   public BlockUtil10<T> getDataBuilder50_8() {
      return this.isActive_2(true);
   }

   public BlockUtil10<T> isActive_2(boolean var1) {
      this.fieldBool_m = var1;
      return this;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public BlockUtil10<T> clamp(Predicate<T> var1) {
      long var2 = 82837453149555L;
      String var10000 = DateUtil.getString();
      this.predicate_i = var1;
      String var4 = var10000;
      if (var1 instanceof BreezePredicate) {
         double var5 = ((BreezePredicate)var1).dataBuilder39_a.double_f;

         try {
            if (var5 != 0.0) {
               this.function_f = (Function<T, String>)RenderUtil27.getFunction_4((int)Math.ceil(-Math.log10(var5)));
            }
         } catch (IllegalStateException var8) {
            throw getIllegalStateException(var8);
         }

         try {
            if (var4 != null) {
               return this;
            }
         } catch (IllegalStateException var10) {
            throw getIllegalStateException(var10);
         }
      }

      try {
         if (!(var1 instanceof BreezePredicate3)) {
            return this;
         }
      } catch (IllegalStateException var9) {
         throw getIllegalStateException(var9);
      }

      double var11 = ((BreezePredicate3)var1).dataBuilder39_a.double_f;

      try {
         if (var11 != 0.0) {
            this.function_f = (Function<T, String>)RangeValue.getFunction((int)Math.ceil(Math.max(0.0, -Math.log10(var11))));
         }
      } catch (IllegalStateException var7) {
         throw getIllegalStateException(var7);
      }

      return this;
   }

   public BlockUtil10<T> getDataBuilder50_9(Predicate<DateUtil> var1) {
      this.predicate_j = var1;
      return this;
   }

   public BlockUtil10<T> getDataBuilder50_10(Consumer<T> var1) {
      this.list_a.add(var1);
      return this;
   }

   public BlockUtil10<T> getDataBuilder50_11(Class<?> var1) {
      this.class_k = var1;
      return this;
   }

   private static Object lambda$value_Inner1(Class var0, String var1) {
      return Array.newInstance(var0, 0);
   }

   private static Object lambda$value_Inner0(String var0) {
      return var0;
   }

   public static void initialize(String var0) {
      string_n = var0;
   }

   public static String getString() {
      return string_n;
   }

   static {
      long var0 = 12734936005719L;
      initialize("KboWI");
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var4 = new String[4];
      int var5 = 0;
      String var6 = "\u009fKã^^¬h\fÃ|û\u001a\u001f.6\u0012K)ÆÆj5\u0099FqkE \u0019|\u001apÕò¹>:}\u009c10|\u008fÀhhô\u0093#\u0012=ZBòÅÆ8\u008e\u009c\u0014Ø\u008bÉ/³ä\u001cÂ \u0005\u001aê\u0007\u0011»æ\u0019}\u0081î\u001333½¦{YµG";
      int var7 = "\u009fKã^^¬h\fÃ|û\u001a\u001f.6\u0012K)ÆÆj5\u0099FqkE \u0019|\u001apÕò¹>:}\u009c10|\u008fÀhhô\u0093#\u0012=ZBòÅÆ8\u008e\u009c\u0014Ø\u008bÉ/³ä\u001cÂ \u0005\u001aê\u0007\u0011»æ\u0019}\u0081î\u001333½¦{YµG"
         .length();
      char var8 = '(';
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
                     CONST_P = var4;
                     CONST_Q = new String[4];
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

                  var6 = "\tDcñÉ\u0093ý\u0007RÚ\u001bÑÌ;#³Ý\u0010L?ÝçÈT\u008fGi5O(ry\u0086ØñzðÑ¾ë8ôBÒÎ(|öTê\u0094^Bu\u001c\f\u009ahf±ëGû\u009déi\u0013¾K\u009f±/¬ü~mzæ\u008e|SCÃ5=\u009c¡ xH¥F\frn}ô";
                  var7 = "\tDcñÉ\u0093ý\u0007RÚ\u001bÑÌ;#³Ý\u0010L?ÝçÈT\u008fGi5O(ry\u0086ØñzðÑ¾ë8ôBÒÎ(|öTê\u0094^Bu\u001c\f\u009ahf±ëGû\u009déi\u0013¾K\u009f±/¬ü~mzæ\u008e|SCÃ5=\u009c¡ xH¥F\frn}ô"
                     .length();
                  var8 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static IllegalStateException getIllegalStateException(IllegalStateException var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30119;
      if (CONST_Q[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_R.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_R.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cs", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_P[var3].getBytes("ISO-8859-1");
         CONST_Q[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_Q[var3];
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
         throw new RuntimeException("rip/breeze/cs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
