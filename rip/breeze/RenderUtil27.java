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
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import rip.breeze.client.BreezeIterable;

public final class RenderUtil27 {
   public static final Function<Boolean, Boolean> CONST_A;
   public static final Function<String, Boolean> CONST_B;
   public static final Function<String, Integer> CONST_C;
   public static final Function<String, Double> CONST_D;
   public static final Function<SkinLoader, String> CONST_E;
   public static final Function<String, SkinLoader> CONST_F;
   public static final Function<Enum<?>, String> CONST_G;
   public static final Function<Object, String> CONST_H;
   public static final Function<Enum<?>[], String> CONST_I;
   private static String string_j;
   private static final String[] CONST_L;
   private static final String[] CONST_M;
   private static final Map CONST_N = new HashMap(13);

   public static <R extends Enum<R>> Function<R, R> getFunction(Enum<R> var0) {
      Enum[] var1 = (Enum[])var0.getDeclaringClass().getEnumConstants();
      return RenderUtil27::lambda$toggleEnum_Inner1;
   }

   public static Function<String, String> getFunction_2(StringOption var0) {
      String[] var1 = var0.getArr_b();
      return RenderUtil27::lambda$toggleEnumHolder_Inner2;
   }

   public static Predicate<Integer> getPredicate(int var0, int var1, int var2) {
      return new BreezePredicate2(var0, var1, var2, null);
   }

   public static Predicate<Integer> getPredicate_2(int var0, int var1) {
      return new BreezePredicate2(var0, var1, null);
   }

   public static Predicate<Double> getPredicate_3(double var0, double var2, double var4) {
      return new BreezePredicate(var0, var2, var4, null);
   }

   public static Predicate<Double> getPredicate_4(double var0, double var2) {
      return new BreezePredicate(var0, var2, null);
   }

   public static <R extends Enum<R>> Function<String, R[]> getFunction_3(Enum<R> var0) {
      Function var1 = getFunction_5(var0);
      Class var2 = var0.getDeclaringClass();
      return (Function<String, R[]>)(RenderUtil27::lambda$ENUM_ARRAY_PARSER_Inner8);
   }

   public static Function<Double, String> getFunction_4(int var0) {
      long var1 = 26351598921862L;

      try {
         if (var0 < 0) {
            throw new IllegalArgumentException("Decimal places cannot be negative:" + var0);
         }
      } catch (IllegalArgumentException var3) {
         throw getException(var3);
      }

      return RenderUtil27::lambda$doubleFormatter_Inner9;
   }

   public static <R extends Enum<R>> Function<String, R> getFunction_5(Enum<R> var0) {
      Enum[] var1 = (Enum[])var0.getDeclaringClass().getEnumConstants();
      return RenderUtil27::lambda$parseEnum_Inner10;
   }

   public static Function<String, StringOption> getFunction_6(StringOption var0) {
      return RenderUtil27::lambda$parseEnumHolder_Inner11;
   }

   private static StringOption lambda$parseEnumHolder_Inner11(StringOption param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/RenderUtil27.46914850601116L J
      // 03: ldc2_w 1345913768370
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: sipush 25479
      // 0c: ldc2_w 4196229107133153043
      // 0f: lload 2
      // 10: lxor
      // 11: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil27.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16: ldc ""
      // 18: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 1b: astore 1
      // 1c: aload 0
      // 1d: invokevirtual rip/breeze/StringOption.getArr_b ()[Ljava/lang/String;
      // 20: astore 4
      // 22: invokestatic rip/breeze/DateUtil.getString ()Ljava/lang/String;
      // 25: aload 4
      // 27: arraylength
      // 28: istore 5
      // 2a: bipush 0
      // 2b: istore 6
      // 2d: astore 7
      // 2f: iload 6
      // 31: iload 5
      // 33: if_icmpge 75
      // 36: aload 4
      // 38: iload 6
      // 3a: aaload
      // 3b: astore 8
      // 3d: aload 8
      // 3f: aload 1
      // 40: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 43: ifne 61
      // 46: getstatic rip/breeze/RenderUtil27.CONST_H Ljava/util/function/Function;
      // 49: aload 8
      // 4b: invokeinterface java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 50: checkcast java/lang/String
      // 53: aload 1
      // 54: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 57: ifeq 6d
      // 5a: goto 61
      // 5d: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 0
      // 62: aload 8
      // 64: invokevirtual rip/breeze/StringOption.setString_a (Ljava/lang/String;)V
      // 67: aload 0
      // 68: areturn
      // 69: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: iinc 6 1
      // 70: aload 7
      // 72: ifnonnull 2f
      // 75: aload 0
      // 76: areturn
      // try (30 -> 41): 42 java/lang/IllegalArgumentException
      // try (34 -> 49): 49 java/lang/IllegalArgumentException
   }

   private static Enum lambda$parseEnum_Inner10(Enum[] param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/RenderUtil27.46914850601116L J
      // 03: ldc2_w 92124026083660
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic rip/breeze/DateUtil.getString ()Ljava/lang/String;
      // 0b: aload 1
      // 0c: sipush 31016
      // 0f: ldc2_w 1608595901488608576
      // 12: lload 2
      // 13: lxor
      // 14: invokedynamic l (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil27.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: ldc ""
      // 1b: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 1e: astore 1
      // 1f: aload 0
      // 20: astore 4
      // 22: aload 4
      // 24: arraylength
      // 25: istore 5
      // 27: bipush 0
      // 28: istore 6
      // 2a: astore 7
      // 2c: iload 6
      // 2e: iload 5
      // 30: if_icmpge 70
      // 33: aload 4
      // 35: iload 6
      // 37: aaload
      // 38: astore 8
      // 3a: aload 8
      // 3c: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 3f: aload 1
      // 40: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 43: ifne 61
      // 46: getstatic rip/breeze/RenderUtil27.CONST_G Ljava/util/function/Function;
      // 49: aload 8
      // 4b: invokeinterface java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 50: checkcast java/lang/String
      // 53: aload 1
      // 54: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 57: ifeq 68
      // 5a: goto 61
      // 5d: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 8
      // 63: areturn
      // 64: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: iinc 6 1
      // 6b: aload 7
      // 6d: ifnonnull 2c
      // 70: aload 0
      // 71: aload 1
      // 72: invokestatic java/lang/Integer.decode (Ljava/lang/String;)Ljava/lang/Integer;
      // 75: invokevirtual java/lang/Integer.intValue ()I
      // 78: aaload
      // 79: areturn
      // try (29 -> 41): 42 java/lang/IllegalArgumentException
      // try (34 -> 46): 46 java/lang/IllegalArgumentException
   }

   private static String lambda$doubleFormatter_Inner9(int var0, Double var1) {
      long var2 = 94983426376663L;
      Locale var10000 = Locale.ROOT;
      StringBuilder var10001 = new StringBuilder();
      short var10002 = 8400;
      long var10003 = 2487243777364577982L ^ var2;
      return String.format(var10000, var10001.append("%.").append(var0).append("f").toString(), var1);
   }

   private static Enum[] lambda$ENUM_ARRAY_PARSER_Inner8(Class var0, Function var1, String var2) {
      long var3 = 14699850505417L;
      long var5 = var3 ^ 84186087525707L;
      long var10001 = var3 ^ 34017936221070L;
      int var7 = (int)((var3 ^ 34017936221070L) >>> 48);
      int var8 = (int)((var3 ^ 34017936221070L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var3 ^ 61759461424230L;
      String var12 = DateUtil.getString();

      try {
         BreezeIterable var13 = new rip.breeze.client.Util139().getDataBuilder2(var2, var5).getBreezeIterable(var10);
         Enum[] var14 = (Enum[])Array.newInstance(var0, var13.getValue());
         int var15 = 0;

         while (var15 < var13.getValue()) {
            var14[var15] = (Enum)var1.apply(var13.getDataBuilder2(var15).buildString((char)var7, var8, (short)var9));
            var15++;
            if (var12 == null) {
               break;
            }
         }

         return var14;
      } catch (Exception var16) {
         return (Enum[])Array.newInstance(var0, 0);
      }
   }

   private static String lambda$static_Inner7(Enum[] var0) {
      long var1 = 129210350831874L;
      long var3 = var1 ^ 70463248726705L;
      String var10000 = DateUtil.getString();
      BreezeIterable var5 = new BreezeIterable();
      Enum[] var6 = var0;
      String var7 = var10000;

      for (Enum var10 : var6) {
         var5.processAll_2(CONST_G.apply(var10), var3);
         if (var7 == null) {
            break;
         }
      }

      return var5.toString();
   }

   private static String lambda$static_Inner6(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/RenderUtil27.46914850601116L J
      // 03: ldc2_w 60458064067560
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/DateUtil.getString ()Ljava/lang/String;
      // 0b: astore 3
      // 0c: aload 0
      // 0d: instanceof java/lang/String
      // 10: ifeq 1e
      // 13: aload 0
      // 14: checkcast java/lang/String
      // 17: goto 25
      // 1a: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: checkcast rip/breeze/StringOption
      // 22: invokevirtual rip/breeze/StringOption.getString_a ()Ljava/lang/String;
      // 25: astore 4
      // 27: aload 4
      // 29: invokevirtual java/lang/String.length ()I
      // 2c: bipush 3
      // 2d: if_icmpgt 37
      // 30: aload 4
      // 32: areturn
      // 33: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: new java/lang/StringBuilder
      // 3a: dup
      // 3b: invokespecial java/lang/StringBuilder.<init> ()V
      // 3e: astore 5
      // 40: bipush 1
      // 41: istore 6
      // 43: bipush 0
      // 44: istore 7
      // 46: iload 7
      // 48: aload 4
      // 4a: invokevirtual java/lang/String.length ()I
      // 4d: if_icmpge a3
      // 50: aload 4
      // 52: iload 7
      // 54: invokevirtual java/lang/String.charAt (I)C
      // 57: istore 8
      // 59: iload 8
      // 5b: invokestatic java/lang/Character.isLowerCase (C)Z
      // 5e: ifeq 68
      // 61: aload 4
      // 63: areturn
      // 64: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: iload 8
      // 6a: bipush 95
      // 6c: if_icmpne 76
      // 6f: bipush 1
      // 70: istore 6
      // 72: aload 3
      // 73: ifnonnull 9c
      // 76: aload 5
      // 78: iload 6
      // 7a: ifeq 90
      // 7d: goto 84
      // 80: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: iload 8
      // 86: invokestatic java/lang/Character.toUpperCase (C)C
      // 89: goto 95
      // 8c: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8f: athrow
      // 90: iload 8
      // 92: invokestatic java/lang/Character.toLowerCase (C)C
      // 95: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 98: pop
      // 99: bipush 0
      // 9a: istore 6
      // 9c: iinc 7 1
      // 9f: aload 3
      // a0: ifnonnull 46
      // a3: aload 5
      // a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a8: areturn
      // try (6 -> 12): 12 java/lang/IllegalArgumentException
      // try (18 -> 24): 24 java/lang/IllegalArgumentException
      // try (42 -> 47): 47 java/lang/IllegalArgumentException
      // try (54 -> 59): 60 java/lang/IllegalArgumentException
      // try (56 -> 65): 65 java/lang/IllegalArgumentException
   }

   private static String lambda$static_Inner5(Enum param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/RenderUtil27.46914850601116L J
      // 03: ldc2_w 28212451665499
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic rip/breeze/DateUtil.getString ()Ljava/lang/String;
      // 0b: astore 3
      // 0c: aload 0
      // 0d: instanceof rip/breeze/IStringProvider
      // 10: ifeq 21
      // 13: aload 0
      // 14: checkcast rip/breeze/IStringProvider
      // 17: invokeinterface rip/breeze/IStringProvider.getString ()Ljava/lang/String; 1
      // 1c: areturn
      // 1d: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 25: astore 4
      // 27: aload 4
      // 29: invokevirtual java/lang/String.length ()I
      // 2c: bipush 3
      // 2d: if_icmpgt 3f
      // 30: aload 4
      // 32: ldc_w "_"
      // 35: ldc ""
      // 37: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 3a: areturn
      // 3b: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: new java/lang/StringBuilder
      // 42: dup
      // 43: invokespecial java/lang/StringBuilder.<init> ()V
      // 46: astore 5
      // 48: bipush 1
      // 49: istore 6
      // 4b: bipush 0
      // 4c: istore 7
      // 4e: iload 7
      // 50: aload 4
      // 52: invokevirtual java/lang/String.length ()I
      // 55: if_icmpge ab
      // 58: aload 4
      // 5a: iload 7
      // 5c: invokevirtual java/lang/String.charAt (I)C
      // 5f: istore 8
      // 61: iload 8
      // 63: invokestatic java/lang/Character.isLowerCase (C)Z
      // 66: ifeq 70
      // 69: aload 4
      // 6b: areturn
      // 6c: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: iload 8
      // 72: bipush 95
      // 74: if_icmpne 7e
      // 77: bipush 1
      // 78: istore 6
      // 7a: aload 3
      // 7b: ifnonnull a4
      // 7e: aload 5
      // 80: iload 6
      // 82: ifeq 98
      // 85: goto 8c
      // 88: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8b: athrow
      // 8c: iload 8
      // 8e: invokestatic java/lang/Character.toUpperCase (C)C
      // 91: goto 9d
      // 94: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: iload 8
      // 9a: invokestatic java/lang/Character.toLowerCase (C)C
      // 9d: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // a0: pop
      // a1: bipush 0
      // a2: istore 6
      // a4: iinc 7 1
      // a7: aload 3
      // a8: ifnonnull 4e
      // ab: aload 5
      // ad: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b0: areturn
      // try (6 -> 13): 13 java/lang/IllegalArgumentException
      // try (18 -> 27): 27 java/lang/IllegalArgumentException
      // try (45 -> 50): 50 java/lang/IllegalArgumentException
      // try (57 -> 62): 63 java/lang/IllegalArgumentException
      // try (59 -> 68): 68 java/lang/IllegalArgumentException
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static SkinLoader lambda$static_Inner4(String var0) {
      long var1 = 10847558549707L;
      long var3 = var1 ^ 79242924020041L;
      long var10001 = var1 ^ 29082775519116L;
      int var5 = (int)((var1 ^ 29082775519116L) >>> 48);
      int var6 = (int)((var1 ^ 29082775519116L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var1 ^ 66693481341028L;
      String var10 = DateUtil.getString();

      BreezeIterable var11;
      SkinLoader var12;
      try {
         var11 = new rip.breeze.client.Util139().getDataBuilder2(var0, var3).getBreezeIterable(var8);
         var12 = new SkinLoader();
         if (var11.getValue() != 9) {
            return var12;
         }
      } catch (Exception var22) {
         return new SkinLoader();
      }

      try {
         int var13 = 0;

         while (var13 < var11.getValue()) {
            ArrayList var15;
            label51: {
               rip.breeze.client.PlayerUtil8 var14 = var11.getDataBuilder2(var13);
               var15 = new ArrayList();
               if (var14.isValid()) {
                  for (rip.breeze.client.PlayerUtil8 var17 : var14.getBreezeIterable(var8)) {
                     var15.add(WorldUtil6.getEnum16Val(var17.buildString((char)var5, var6, (short)var7)));
                     if (var10 == null) {
                        break;
                     }
                  }

                  try {
                     if (var10 != null) {
                        break label51;
                     }
                  } catch (Exception var20) {
                     throw getException(var20);
                  }
               }

               try {
                  var15.add(WorldUtil6.getEnum16Val(var14.buildString((char)var5, var6, (short)var7)));
               } catch (Exception var19) {
                  throw getException(var19);
               }
            }

            try {
               if (var15.isEmpty()) {
                  var15.add(WorldUtil6.EMPTY);
               }
            } catch (Exception var18) {
               throw getException(var18);
            }

            var12.arr_b[var13] = var15;
            var13++;
            if (var10 == null) {
               break;
            }
         }

         return var12;
      } catch (Exception var21) {
         return new SkinLoader();
      }
   }

   private static String lambda$static_Inner3(SkinLoader param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/RenderUtil27.46914850601116L J
      // 03: ldc2_w 54631428581133
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 51225137327138
      // 0d: lxor
      // 0e: lstore 3
      // 0f: dup2
      // 10: ldc2_w 140096973362510
      // 13: lxor
      // 14: lstore 5
      // 16: pop2
      // 17: invokestatic rip/breeze/DateUtil.getString ()Ljava/lang/String;
      // 1a: new rip/breeze/client/BreezeIterable
      // 1d: dup
      // 1e: invokespecial rip/breeze/client/BreezeIterable.<init> ()V
      // 21: astore 7
      // 23: aload 0
      // 24: getfield rip/breeze/SkinLoader.arr_b [Ljava/util/List;
      // 27: astore 8
      // 29: aload 8
      // 2b: arraylength
      // 2c: istore 9
      // 2e: astore 10
      // 30: bipush 0
      // 31: istore 11
      // 33: iload 11
      // 35: iload 9
      // 37: if_icmpge cc
      // 3a: aload 8
      // 3c: iload 11
      // 3e: aaload
      // 3f: astore 12
      // 41: aload 12
      // 43: invokeinterface java/util/List.size ()I 1
      // 48: bipush 1
      // 49: if_icmpgt 83
      // 4c: aload 7
      // 4e: aload 12
      // 50: invokeinterface java/util/List.isEmpty ()Z 1
      // 55: ifeq 6c
      // 58: goto 5f
      // 5b: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: getstatic rip/breeze/WorldUtil6.EMPTY Lrip/breeze/WorldUtil6;
      // 62: getfield rip/breeze/WorldUtil6.name Ljava/lang/String;
      // 65: goto 7a
      // 68: invokestatic rip/breeze/RenderUtil27.getException (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: aload 12
      // 6e: bipush 0
      // 6f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 74: checkcast rip/breeze/WorldUtil6
      // 77: getfield rip/breeze/WorldUtil6.name Ljava/lang/String;
      // 7a: lload 3
      // 7b: invokevirtual rip/breeze/client/BreezeIterable.processAll_2 (Ljava/lang/String;J)V
      // 7e: aload 10
      // 80: ifnonnull c4
      // 83: new rip/breeze/client/BreezeIterable
      // 86: dup
      // 87: invokespecial rip/breeze/client/BreezeIterable.<init> ()V
      // 8a: astore 13
      // 8c: aload 12
      // 8e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 93: astore 14
      // 95: aload 14
      // 97: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 9c: ifeq bb
      // 9f: aload 14
      // a1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a6: checkcast rip/breeze/WorldUtil6
      // a9: astore 15
      // ab: aload 13
      // ad: aload 15
      // af: getfield rip/breeze/WorldUtil6.name Ljava/lang/String;
      // b2: lload 3
      // b3: invokevirtual rip/breeze/client/BreezeIterable.processAll_2 (Ljava/lang/String;J)V
      // b6: aload 10
      // b8: ifnonnull 95
      // bb: aload 7
      // bd: lload 5
      // bf: aload 13
      // c1: invokevirtual rip/breeze/client/BreezeIterable.processNullable (JLrip/breeze/client/PlayerUtil8;)V
      // c4: iinc 11 1
      // c7: aload 10
      // c9: ifnonnull 33
      // cc: aload 7
      // ce: invokevirtual rip/breeze/client/BreezeIterable.toString ()Ljava/lang/String;
      // d1: areturn
      // try (35 -> 43): 44 java/lang/IllegalArgumentException
      // try (39 -> 49): 49 java/lang/IllegalArgumentException
   }

   private static String lambda$toggleEnumHolder_Inner2(String[] var0, StringOption var1, String var2) {
      return var0[(var1.getValue() + 1) % var0.length];
   }

   private static Enum lambda$toggleEnum_Inner1(Enum[] var0, Enum var1) {
      return (R)var0[(var1.ordinal() + 1) % var0.length];
   }

   private static Boolean lambda$static_Inner0(Boolean var0) {
      long var1 = 2625865614062L;

      try {
         if (!var0) {
            return true;
         }
      } catch (IllegalArgumentException var3) {
         throw getException(var3);
      }

      return false;
   }

   static {
      initialize("bqJGx");
      long var0 = 9570021676266L;
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
      String var6 = "\u000e¢\u007fet\"M\u008bÚÚS\u000f=\u0018\u0012\u001a\u0010Î,LQ Æ×bÄ³Ç\u0087ef\u008a(";
      int var7 = "\u000e¢\u007fet\"M\u008bÚÚS\u000f=\u0018\u0012\u001a\u0010Î,LQ Æ×bÄ³Ç\u0087ef\u008a(".length();
      char var8 = 16;
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
                     CONST_L = var4;
                     CONST_M = new String[4];
                     CONST_A = RenderUtil27::lambda$static_Inner0;
                     CONST_B = Boolean::parseBoolean;
                     CONST_C = Integer::decode;
                     CONST_D = Double::parseDouble;
                     CONST_E = RenderUtil27::lambda$static_Inner3;
                     CONST_F = RenderUtil27::lambda$static_Inner4;
                     CONST_G = RenderUtil27::lambda$static_Inner5;
                     CONST_H = RenderUtil27::lambda$static_Inner6;
                     CONST_I = RenderUtil27::lambda$static_Inner7;
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

                  var6 = "µ&îÒÿ\"¸¿®»\u0018Ë¡mjÒ#\u0092\u001f\u009f\u0083Â±0\u0086\u008a\t\u00163Õß\u0094NK\u0097o¡\u0088óyÝ*\u008d×{;Ç|2)¥ä\u0083¹Ö3\u008c:A\u009b\u0013ß·Ä\u0010EÝþ\u0002F\u0094Ùæ\u0080»\u008cìJ¾ÕU";
                  var7 = "µ&îÒÿ\"¸¿®»\u0018Ë¡mjÒ#\u0092\u001f\u009f\u0083Â±0\u0086\u008a\t\u00163Õß\u0094NK\u0097o¡\u0088óyÝ*\u008d×{;Ç|2)¥ä\u0083¹Ö3\u008c:A\u009b\u0013ß·Ä\u0010EÝþ\u0002F\u0094Ùæ\u0080»\u008cìJ¾ÕU"
                     .length();
                  var8 = '@';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   public static void initialize(String var0) {
      string_j = var0;
   }

   public static String getString() {
      return string_j;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28089;
      if (CONST_M[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_N.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_N.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cA", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_L[var3].getBytes("ISO-8859-1");
         CONST_M[var3] = buildString(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_M[var3];
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
         throw new RuntimeException("rip/breeze/cA" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
