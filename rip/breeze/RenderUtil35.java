package rip.breeze;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public final class RenderUtil35 implements Scriptable {
   private Scriptable parentScope;
   private Scriptable prototype;
   private final Map<String, MathUtil11> map_c = new LinkedHashMap<>();
   private final Map<String, Util36> map_d = new LinkedHashMap<>();
   private final Map<String, Object> map_e = new LinkedHashMap<>();
   private Object[] arr_f;
   private boolean fieldBool_g = true;
   private static final String[] CONST_I;
   private static final String[] CONST_J;
   private static final Map CONST_K = new HashMap(13);

   public static RenderUtil35 getDataBuilder49(Context var0, Scriptable var1, String var2, Class<?>... var3) {
      RenderUtil35 var4 = new RenderUtil35(var1);

      for (Class var8 : var3) {
         var4.processAll(var0, var1, var8);
      }

      ScriptableObject.defineProperty(var1, var2, var4, 2);
      return var4;
   }

   private RenderUtil35(Scriptable var1) {
      this.parentScope = ScriptableObject.getTopLevelScope(var1);
      this.prototype = ScriptableObject.getObjectPrototype(var1);
   }

   private void processAll(Context param1, Scriptable param2, Class<?> param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: getstatic rip/breeze/RenderUtil35.29408587427486L J
      // 003: ldc2_w 3169661301480
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic java/lang/invoke/MethodHandles.lookup ()Ljava/lang/invoke/MethodHandles$Lookup;
      // 00c: astore 6
      // 00e: aload 3
      // 00f: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 012: astore 7
      // 014: aload 7
      // 016: arraylength
      // 017: istore 8
      // 019: bipush 0
      // 01a: istore 9
      // 01c: iload 9
      // 01e: iload 8
      // 020: if_icmpge 1b6
      // 023: aload 7
      // 025: iload 9
      // 027: aaload
      // 028: astore 10
      // 02a: aload 10
      // 02c: invokevirtual java/lang/reflect/Method.isSynthetic ()Z
      // 02f: ifeq 039
      // 032: goto 1b0
      // 035: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038: athrow
      // 039: aload 10
      // 03b: ldc org/mozilla/javascript/annotations/JSFunction
      // 03d: invokevirtual java/lang/reflect/Method.getAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 040: checkcast org/mozilla/javascript/annotations/JSFunction
      // 043: astore 11
      // 045: aload 11
      // 047: ifnull 0db
      // 04a: aload 3
      // 04b: aload 10
      // 04d: sipush 3447
      // 050: ldc2_w 4045725524122765684
      // 053: lload 4
      // 055: lxor
      // 056: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil35.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: invokestatic rip/breeze/RenderUtil35.update (Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/String;)V
      // 05e: aload 11
      // 060: invokeinterface org/mozilla/javascript/annotations/JSFunction.value ()Ljava/lang/String; 1
      // 065: invokevirtual java/lang/String.isEmpty ()Z
      // 068: ifeq 07e
      // 06b: goto 072
      // 06e: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: aload 10
      // 074: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 077: goto 085
      // 07a: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: aload 11
      // 080: invokeinterface org/mozilla/javascript/annotations/JSFunction.value ()Ljava/lang/String; 1
      // 085: astore 12
      // 087: aload 6
      // 089: aload 10
      // 08b: invokestatic rip/breeze/RenderUtil35.getMethodHandle (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
      // 08e: astore 13
      // 090: aload 0
      // 091: getfield rip/breeze/RenderUtil35.map_c Ljava/util/Map;
      // 094: aload 12
      // 096: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 09b: checkcast rip/breeze/MathUtil11
      // 09e: astore 14
      // 0a0: aload 14
      // 0a2: ifnonnull 0cc
      // 0a5: new rip/breeze/MathUtil11
      // 0a8: dup
      // 0a9: aload 12
      // 0ab: aload 2
      // 0ac: invokespecial rip/breeze/MathUtil11.<init> (Ljava/lang/String;Lorg/mozilla/javascript/Scriptable;)V
      // 0af: astore 14
      // 0b1: aload 0
      // 0b2: getfield rip/breeze/RenderUtil35.map_c Ljava/util/Map;
      // 0b5: aload 12
      // 0b7: aload 14
      // 0b9: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0be: pop
      // 0bf: aload 0
      // 0c0: aload 12
      // 0c2: aload 14
      // 0c4: bipush 2
      // 0c5: invokestatic org/mozilla/javascript/ScriptableObject.defineProperty (Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Ljava/lang/Object;I)V
      // 0c8: aload 0
      // 0c9: invokespecial rip/breeze/RenderUtil35.setBool_g ()V
      // 0cc: aload 14
      // 0ce: aload 13
      // 0d0: aload 10
      // 0d2: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 0d5: invokevirtual rip/breeze/MathUtil11.processAll (Ljava/lang/invoke/MethodHandle;[Ljava/lang/Class;)V
      // 0d8: goto 1b0
      // 0db: aload 10
      // 0dd: ldc org/mozilla/javascript/annotations/JSGetter
      // 0df: invokevirtual java/lang/reflect/Method.getAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 0e2: checkcast org/mozilla/javascript/annotations/JSGetter
      // 0e5: astore 12
      // 0e7: aload 12
      // 0e9: ifnull 137
      // 0ec: aload 3
      // 0ed: aload 10
      // 0ef: sipush 10786
      // 0f2: ldc2_w 3363519571830353445
      // 0f5: lload 4
      // 0f7: lxor
      // 0f8: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil35.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: invokestatic rip/breeze/RenderUtil35.update (Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/String;)V
      // 100: aload 10
      // 102: aload 12
      // 104: invokeinterface org/mozilla/javascript/annotations/JSGetter.value ()Ljava/lang/String; 1
      // 109: bipush 1
      // 10a: invokestatic rip/breeze/RenderUtil35.buildString (Ljava/lang/reflect/Method;Ljava/lang/String;Z)Ljava/lang/String;
      // 10d: astore 13
      // 10f: aload 0
      // 110: getfield rip/breeze/RenderUtil35.map_d Ljava/util/Map;
      // 113: aload 13
      // 115: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/Util36.<init> (Ljava/lang/String;)V, (Ljava/lang/String;)Lrip/breeze/Util36; ]
      // 11a: invokeinterface java/util/Map.computeIfAbsent (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object; 3
      // 11f: checkcast rip/breeze/Util36
      // 122: astore 14
      // 124: aload 14
      // 126: aload 6
      // 128: aload 10
      // 12a: invokestatic rip/breeze/RenderUtil35.getMethodHandle (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
      // 12d: putfield rip/breeze/Util36.methodHandle_b Ljava/lang/invoke/MethodHandle;
      // 130: aload 0
      // 131: invokespecial rip/breeze/RenderUtil35.setBool_g ()V
      // 134: goto 1b0
      // 137: aload 10
      // 139: ldc org/mozilla/javascript/annotations/JSSetter
      // 13b: invokevirtual java/lang/reflect/Method.getAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 13e: checkcast org/mozilla/javascript/annotations/JSSetter
      // 141: astore 13
      // 143: aload 13
      // 145: ifnull 1b0
      // 148: aload 3
      // 149: aload 10
      // 14b: sipush 16257
      // 14e: ldc2_w 7996008445188520841
      // 151: lload 4
      // 153: lxor
      // 154: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil35.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: invokestatic rip/breeze/RenderUtil35.update (Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/String;)V
      // 15c: aload 10
      // 15e: aload 13
      // 160: invokeinterface org/mozilla/javascript/annotations/JSSetter.value ()Ljava/lang/String; 1
      // 165: bipush 0
      // 166: invokestatic rip/breeze/RenderUtil35.buildString (Ljava/lang/reflect/Method;Ljava/lang/String;Z)Ljava/lang/String;
      // 169: astore 14
      // 16b: aload 0
      // 16c: getfield rip/breeze/RenderUtil35.map_d Ljava/util/Map;
      // 16f: aload 14
      // 171: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, rip/breeze/Util36.<init> (Ljava/lang/String;)V, (Ljava/lang/String;)Lrip/breeze/Util36; ]
      // 176: invokeinterface java/util/Map.computeIfAbsent (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object; 3
      // 17b: checkcast rip/breeze/Util36
      // 17e: astore 15
      // 180: aload 15
      // 182: aload 6
      // 184: aload 10
      // 186: invokestatic rip/breeze/RenderUtil35.getMethodHandle (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
      // 189: putfield rip/breeze/Util36.methodHandle_c Ljava/lang/invoke/MethodHandle;
      // 18c: aload 10
      // 18e: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 191: astore 16
      // 193: aload 15
      // 195: aload 16
      // 197: arraylength
      // 198: bipush 1
      // 199: if_icmpne 1a7
      // 19c: aload 16
      // 19e: bipush 0
      // 19f: aaload
      // 1a0: goto 1a9
      // 1a3: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a6: athrow
      // 1a7: ldc java/lang/Object
      // 1a9: putfield rip/breeze/Util36.class_d Ljava/lang/Class;
      // 1ac: aload 0
      // 1ad: invokespecial rip/breeze/RenderUtil35.setBool_g ()V
      // 1b0: iinc 9 1
      // 1b3: goto 01c
      // 1b6: return
      // try (21 -> 25): 25 java/lang/IllegalStateException
      // try (32 -> 46): 47 java/lang/IllegalStateException
      // try (34 -> 52): 52 java/lang/IllegalStateException
      // try (166 -> 175): 175 java/lang/IllegalStateException
   }

   private static void update(Class<?> var0, Method var1, String var2) {
      long var3 = 96837860470156L;

      try {
         if (!Modifier.isStatic(var1.getModifiers())) {
            throw new IllegalStateException(
               var2 + " must be static on" + var0.getName() + ":" + var1
            );
         }
      } catch (IllegalStateException var5) {
         throw getThrowable(var5);
      }
   }

   private static MethodHandle getMethodHandle(Lookup var0, Method var1) {
      try {
         var1.setAccessible(true);
         return var0.unreflect(var1);
      } catch (IllegalAccessException var3) {
         throw new RuntimeException(var3);
      }
   }

   private static String buildString(Method param0, String param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/RenderUtil35.29408587427486L J
      // 03: ldc2_w 27464271718397
      // 06: lxor
      // 07: lstore 3
      // 08: aload 1
      // 09: ifnull 20
      // 0c: aload 1
      // 0d: invokevirtual java/lang/String.isEmpty ()Z
      // 10: ifne 20
      // 13: goto 1a
      // 16: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 1
      // 1b: areturn
      // 1c: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 24: astore 5
      // 26: iload 2
      // 27: ifeq 3e
      // 2a: sipush 31096
      // 2d: ldc2_w 7080565877740546151
      // 30: lload 3
      // 31: lxor
      // 32: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil35.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: goto 4b
      // 3a: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: sipush 6872
      // 41: ldc2_w 3207573814985673673
      // 44: lload 3
      // 45: lxor
      // 46: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil35.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: astore 6
      // 4d: aload 5
      // 4f: aload 6
      // 51: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 54: ifeq a0
      // 57: aload 5
      // 59: invokevirtual java/lang/String.length ()I
      // 5c: bipush 3
      // 5d: if_icmple a0
      // 60: goto 67
      // 63: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: aload 5
      // 69: bipush 3
      // 6a: invokevirtual java/lang/String.charAt (I)C
      // 6d: invokestatic java/lang/Character.toLowerCase (C)C
      // 70: istore 7
      // 72: aload 5
      // 74: invokevirtual java/lang/String.length ()I
      // 77: bipush 4
      // 78: if_icmpne 87
      // 7b: iload 7
      // 7d: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
      // 80: goto 9f
      // 83: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: new java/lang/StringBuilder
      // 8a: dup
      // 8b: invokespecial java/lang/StringBuilder.<init> ()V
      // 8e: iload 7
      // 90: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 93: aload 5
      // 95: bipush 4
      // 96: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 99: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9f: areturn
      // a0: aload 5
      // a2: areturn
      // try (4 -> 9): 10 java/lang/IllegalStateException
      // try (6 -> 14): 14 java/lang/IllegalStateException
      // try (19 -> 27): 27 java/lang/IllegalStateException
      // try (35 -> 43): 44 java/lang/IllegalStateException
      // try (51 -> 58): 58 java/lang/IllegalStateException
   }

   private void setBool_g() {
      this.fieldBool_g = true;
   }

   @Override
   public String getClassName() {
      long var1 = 44494218457340L;
      return "StaticNamespace";
   }

   @Override
   public Scriptable getParentScope() {
      return this.parentScope;
   }

   @Override
   public void setParentScope(Scriptable var1) {
      this.parentScope = var1;
   }

   @Override
   public Scriptable getPrototype() {
      return this.prototype;
   }

   @Override
   public void setPrototype(Scriptable var1) {
      this.prototype = var1;
   }

   @Override
   public Object get(String var1, Scriptable var2) {
      MathUtil11 var3 = this.map_c.get(var1);

      try {
         if (var3 != null) {
            return var3;
         }
      } catch (Throwable var9) {
         throw getThrowable(var9);
      }

      Util36 var4 = this.map_d.get(var1);

      label50: {
         try {
            if (var4 != null && var4.methodHandle_b != null) {
               break label50;
            }
         } catch (Throwable var8) {
            throw getThrowable(var8);
         }

         try {
            if (this.map_e.containsKey(var1)) {
               return this.map_e.get(var1);
            }
         } catch (Throwable var7) {
            throw getThrowable(var7);
         }

         return Scriptable.NOT_FOUND;
      }

      try {
         Object var5 = var4.methodHandle_b.invokeWithArguments();
         return Util35.getObject(var5);
      } catch (Throwable var6) {
         throw Context.throwAsScriptRuntimeEx(var6);
      }
   }

   @Override
   public Object get(int var1, Scriptable var2) {
      return Scriptable.NOT_FOUND;
   }

   @Override
   public boolean has(String param1, Scriptable param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/RenderUtil35.map_c Ljava/util/Map;
      // 04: aload 1
      // 05: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0a: ifne 44
      // 0d: aload 0
      // 0e: getfield rip/breeze/RenderUtil35.map_d Ljava/util/Map;
      // 11: aload 1
      // 12: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 17: ifne 44
      // 1a: goto 21
      // 1d: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 0
      // 22: getfield rip/breeze/RenderUtil35.map_e Ljava/util/Map;
      // 25: aload 1
      // 26: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 2b: ifne 44
      // 2e: goto 35
      // 31: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: invokestatic org/mozilla/javascript/ScriptableObject.hasProperty (Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Z
      // 3a: ifeq 4c
      // 3d: goto 44
      // 40: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: bipush 1
      // 45: goto 4d
      // 48: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: bipush 0
      // 4d: ireturn
      // try (0 -> 10): 11 java/lang/IllegalStateException
      // try (5 -> 18): 19 java/lang/IllegalStateException
      // try (13 -> 25): 26 java/lang/IllegalStateException
      // try (21 -> 30): 30 java/lang/IllegalStateException
   }

   @Override
   public boolean has(int var1, Scriptable var2) {
      return false;
   }

   @Override
   public void put(String param1, Scriptable param2, Object param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/RenderUtil35.29408587427486L J
      // 03: ldc2_w 102655771909241
      // 06: lxor
      // 07: lstore 4
      // 09: aload 0
      // 0a: getfield rip/breeze/RenderUtil35.map_d Ljava/util/Map;
      // 0d: aload 1
      // 0e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 13: checkcast rip/breeze/Util36
      // 16: astore 6
      // 18: aload 6
      // 1a: ifnull 9b
      // 1d: aload 6
      // 1f: getfield rip/breeze/Util36.methodHandle_c Ljava/lang/invoke/MethodHandle;
      // 22: ifnonnull 64
      // 25: goto 2c
      // 28: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: new java/lang/StringBuilder
      // 2f: dup
      // 30: invokespecial java/lang/StringBuilder.<init> ()V
      // 33: sipush 24819
      // 36: ldc2_w 5814733354157656676
      // 39: lload 4
      // 3b: lxor
      // 3c: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil35.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 44: aload 1
      // 45: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 48: sipush 28081
      // 4b: ldc2_w 1204785255061243689
      // 4e: lload 4
      // 50: lxor
      // 51: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil35.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5c: invokestatic org/mozilla/javascript/Context.reportRuntimeError (Ljava/lang/String;)Lorg/mozilla/javascript/EvaluatorException;
      // 5f: athrow
      // 60: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: aload 3
      // 65: aload 6
      // 67: getfield rip/breeze/Util36.class_d Ljava/lang/Class;
      // 6a: ifnull 79
      // 6d: aload 6
      // 6f: getfield rip/breeze/Util36.class_d Ljava/lang/Class;
      // 72: goto 7b
      // 75: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: ldc java/lang/Object
      // 7b: invokestatic rip/breeze/RenderUtil35.getObject (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
      // 7e: astore 7
      // 80: aload 6
      // 82: getfield rip/breeze/Util36.methodHandle_c Ljava/lang/invoke/MethodHandle;
      // 85: bipush 1
      // 86: anewarray 4
      // 89: dup
      // 8a: bipush 0
      // 8b: aload 7
      // 8d: aastore
      // 8e: invokevirtual java/lang/invoke/MethodHandle.invokeWithArguments ([Ljava/lang/Object;)Ljava/lang/Object;
      // 91: pop
      // 92: return
      // 93: astore 7
      // 95: aload 7
      // 97: invokestatic org/mozilla/javascript/Context.throwAsScriptRuntimeEx (Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
      // 9a: athrow
      // 9b: aload 0
      // 9c: getfield rip/breeze/RenderUtil35.map_e Ljava/util/Map;
      // 9f: aload 1
      // a0: aload 3
      // a1: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // a6: pop
      // a7: aload 0
      // a8: invokespecial rip/breeze/RenderUtil35.setBool_g ()V
      // ab: return
      // try (40 -> 47): 47 java/lang/Throwable
      // try (12 -> 38): 38 java/lang/Throwable
      // try (10 -> 15): 16 java/lang/Throwable
      // try (40 -> 62): 63 java/lang/Throwable
   }

   @Override
   public void put(int var1, Scriptable var2, Object var3) {
   }

   @Override
   public void delete(String var1) {
      try {
         if (this.map_c.remove(var1) != null) {
            this.setBool_g();
         }
      } catch (IllegalStateException var5) {
         throw getThrowable(var5);
      }

      try {
         if (this.map_d.remove(var1) != null) {
            this.setBool_g();
         }
      } catch (IllegalStateException var3) {
         throw getThrowable(var3);
      }

      try {
         if (this.map_e.remove(var1) != null) {
            this.setBool_g();
         }
      } catch (IllegalStateException var4) {
         throw getThrowable(var4);
      }

      try {
         if (ScriptableObject.hasProperty(this, var1)) {
            ScriptableObject.deleteProperty(this, var1);
            this.setBool_g();
         }
      } catch (IllegalStateException var2) {
         throw getThrowable(var2);
      }
   }

   @Override
   public void delete(int var1) {
   }

   @Override
   public Object[] getIds() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rip/breeze/RenderUtil35.fieldBool_g Z
      // 04: ifne 1e
      // 07: aload 0
      // 08: getfield rip/breeze/RenderUtil35.arr_f [Ljava/lang/Object;
      // 0b: ifnull 1e
      // 0e: goto 15
      // 11: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 0
      // 16: getfield rip/breeze/RenderUtil35.arr_f [Ljava/lang/Object;
      // 19: areturn
      // 1a: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: new java/util/LinkedHashSet
      // 21: dup
      // 22: invokespecial java/util/LinkedHashSet.<init> ()V
      // 25: astore 1
      // 26: aload 1
      // 27: aload 0
      // 28: getfield rip/breeze/RenderUtil35.map_c Ljava/util/Map;
      // 2b: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 30: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 35: pop
      // 36: aload 1
      // 37: aload 0
      // 38: getfield rip/breeze/RenderUtil35.map_d Ljava/util/Map;
      // 3b: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 40: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 45: pop
      // 46: aload 1
      // 47: aload 0
      // 48: getfield rip/breeze/RenderUtil35.map_e Ljava/util/Map;
      // 4b: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 50: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 55: pop
      // 56: aload 0
      // 57: invokestatic org/mozilla/javascript/ScriptableObject.getPropertyIds (Lorg/mozilla/javascript/Scriptable;)[Ljava/lang/Object;
      // 5a: astore 2
      // 5b: aload 2
      // 5c: astore 3
      // 5d: aload 3
      // 5e: arraylength
      // 5f: istore 4
      // 61: bipush 0
      // 62: istore 5
      // 64: iload 5
      // 66: iload 4
      // 68: if_icmpge 83
      // 6b: aload 3
      // 6c: iload 5
      // 6e: aaload
      // 6f: astore 6
      // 71: aload 1
      // 72: aload 6
      // 74: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 77: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 7c: pop
      // 7d: iinc 5 1
      // 80: goto 64
      // 83: aload 0
      // 84: aload 1
      // 85: bipush 0
      // 86: anewarray 4
      // 89: invokeinterface java/util/Set.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 8e: putfield rip/breeze/RenderUtil35.arr_f [Ljava/lang/Object;
      // 91: aload 0
      // 92: bipush 0
      // 93: putfield rip/breeze/RenderUtil35.fieldBool_g Z
      // 96: aload 0
      // 97: getfield rip/breeze/RenderUtil35.arr_f [Ljava/lang/Object;
      // 9a: areturn
      // try (0 -> 6): 7 java/lang/IllegalStateException
      // try (3 -> 12): 12 java/lang/IllegalStateException
   }

   @Override
   public Object getDefaultValue(Class<?> param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: getstatic rip/breeze/RenderUtil35.29408587427486L J
      // 03: ldc2_w 93004540348174
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: ifnull 19
      // 0c: aload 1
      // 0d: ldc java/lang/String
      // 0f: if_acmpne 2b
      // 12: goto 19
      // 15: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: sipush 30282
      // 1c: ldc2_w 3955283921354573741
      // 1f: lload 2
      // 20: lxor
      // 21: invokedynamic d (IJ)Ljava/lang/String; bsm=rip/breeze/RenderUtil35.getCallSite (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: areturn
      // 27: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: areturn
      // try (4 -> 9): 10 java/lang/IllegalStateException
      // try (6 -> 18): 18 java/lang/IllegalStateException
   }

   @Override
   public boolean hasInstance(Scriptable var1) {
      return false;
   }

   private static Object getObject(Object param0, Class<?> param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ldc java/lang/Object
      // 03: if_acmpne 0c
      // 06: aload 0
      // 07: areturn
      // 08: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b: athrow
      // 0c: aload 1
      // 0d: ldc java/lang/String
      // 0f: if_acmpne 1b
      // 12: aload 0
      // 13: invokestatic org/mozilla/javascript/ScriptRuntime.toString (Ljava/lang/Object;)Ljava/lang/String;
      // 16: areturn
      // 17: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 1
      // 1c: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 1f: if_acmpeq 30
      // 22: aload 1
      // 23: ldc_w java/lang/Boolean
      // 26: if_acmpne 3c
      // 29: goto 30
      // 2c: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 0
      // 31: invokestatic org/mozilla/javascript/ScriptRuntime.toBoolean (Ljava/lang/Object;)Z
      // 34: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 37: areturn
      // 38: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 1
      // 3d: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 40: if_acmpeq 51
      // 43: aload 1
      // 44: ldc_w java/lang/Integer
      // 47: if_acmpne 5d
      // 4a: goto 51
      // 4d: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: aload 0
      // 52: invokestatic org/mozilla/javascript/ScriptRuntime.toInt32 (Ljava/lang/Object;)I
      // 55: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 58: areturn
      // 59: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 1
      // 5e: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 61: if_acmpeq 72
      // 64: aload 1
      // 65: ldc_w java/lang/Long
      // 68: if_acmpne 7f
      // 6b: goto 72
      // 6e: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 0
      // 73: invokestatic org/mozilla/javascript/ScriptRuntime.toNumber (Ljava/lang/Object;)D
      // 76: d2l
      // 77: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7a: areturn
      // 7b: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: aload 1
      // 80: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 83: if_acmpeq 94
      // 86: aload 1
      // 87: ldc_w java/lang/Double
      // 8a: if_acmpne a0
      // 8d: goto 94
      // 90: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: aload 0
      // 95: invokestatic org/mozilla/javascript/ScriptRuntime.toNumber (Ljava/lang/Object;)D
      // 98: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 9b: areturn
      // 9c: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9f: athrow
      // a0: aload 1
      // a1: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // a4: if_acmpeq b5
      // a7: aload 1
      // a8: ldc_w java/lang/Float
      // ab: if_acmpne c2
      // ae: goto b5
      // b1: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b4: athrow
      // b5: aload 0
      // b6: invokestatic org/mozilla/javascript/ScriptRuntime.toNumber (Ljava/lang/Object;)D
      // b9: d2f
      // ba: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // bd: areturn
      // be: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c1: athrow
      // c2: ldc org/mozilla/javascript/Scriptable
      // c4: aload 1
      // c5: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // c8: ifeq d1
      // cb: aload 0
      // cc: areturn
      // cd: invokestatic rip/breeze/RenderUtil35.getThrowable (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d0: athrow
      // d1: aload 0
      // d2: aload 1
      // d3: invokestatic org/mozilla/javascript/Context.jsToJava (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
      // d6: areturn
      // try (0 -> 5): 5 java/lang/IllegalStateException
      // try (7 -> 13): 13 java/lang/IllegalStateException
      // try (15 -> 21): 22 java/lang/IllegalStateException
      // try (18 -> 28): 28 java/lang/IllegalStateException
      // try (30 -> 36): 37 java/lang/IllegalStateException
      // try (33 -> 43): 43 java/lang/IllegalStateException
      // try (45 -> 51): 52 java/lang/IllegalStateException
      // try (48 -> 59): 59 java/lang/IllegalStateException
      // try (61 -> 67): 68 java/lang/IllegalStateException
      // try (64 -> 74): 74 java/lang/IllegalStateException
      // try (76 -> 82): 83 java/lang/IllegalStateException
      // try (79 -> 90): 90 java/lang/IllegalStateException
      // try (92 -> 98): 98 java/lang/IllegalStateException
   }

   static {
      long var0 = 94470561339964L;
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
      String var6 = "ò\u0018«8`\u0014×O.\u0012¾\u0001\u007f½\"µ0\u0019\u0084TÖ3\u0018ÍÂÈ(®Ï\u0094ã/è\u0003ñ\u0082E¦Mús\u0000ÚaD¶Ë¥&\u0095-×Ik±4\u00806JbÀ&1\u000eæ(\u0090~E.òBä¹¨©\\\u000b',Má\u008dA\u000f9«\u008dà\\¤\bd«\u0013\u001a×ZÐñ¨À\u0090p\u007f\u00ad 7ð\"ÌdcN\u008d\n·Ôç#MÔ\f\u0002zgÕ\u0081\u0083)$\u0011÷\u001c¾\u0083aú\u001e\u0010ül¹Ä§ã*\u008e?\u0080ë~\u0003\u008cÒq\u0018\u008cþÔ²;c\u009dÙ\fØÞÅ\u0007ô/\u0099½ë\u0018¾\u0013Ã\u009f^\u0018\u0088Ã\u0004j\\5¹Ï::\u008f½ð\u0089å¼¤Õ¬UPÎÂ© \u0091ù-SÕLfS#ï>Ü\u0095Ì\u0080y\n\u0011z|íô\u0088\u0003\tã×¹ýó9b =g\u0098ËH2\u000f¿\u0088®b\u0085ýD\u0005\u000fÊ¿\u001d\u0010ï¨õµ´\u00ad\u001d\u001fð¾þR";
      int var7 = "ò\u0018«8`\u0014×O.\u0012¾\u0001\u007f½\"µ0\u0019\u0084TÖ3\u0018ÍÂÈ(®Ï\u0094ã/è\u0003ñ\u0082E¦Mús\u0000ÚaD¶Ë¥&\u0095-×Ik±4\u00806JbÀ&1\u000eæ(\u0090~E.òBä¹¨©\\\u000b',Má\u008dA\u000f9«\u008dà\\¤\bd«\u0013\u001a×ZÐñ¨À\u0090p\u007f\u00ad 7ð\"ÌdcN\u008d\n·Ôç#MÔ\f\u0002zgÕ\u0081\u0083)$\u0011÷\u001c¾\u0083aú\u001e\u0010ül¹Ä§ã*\u008e?\u0080ë~\u0003\u008cÒq\u0018\u008cþÔ²;c\u009dÙ\fØÞÅ\u0007ô/\u0099½ë\u0018¾\u0013Ã\u009f^\u0018\u0088Ã\u0004j\\5¹Ï::\u008f½ð\u0089å¼¤Õ¬UPÎÂ© \u0091ù-SÕLfS#ï>Ü\u0095Ì\u0080y\n\u0011z|íô\u0088\u0003\tã×¹ýó9b =g\u0098ËH2\u000f¿\u0088®b\u0085ýD\u0005\u000fÊ¿\u001d\u0010ï¨õµ´\u00ad\u001d\u001fð¾þR"
         .length();
      char var8 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = buildString_2(var10).intern();
            switch (var10001) {
               case 0:
                  var4[var5++] = var19;
                  if ((var12 += var8) >= var7) {
                     CONST_I = var4;
                     CONST_J = new String[11];
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

                  var6 = "\r\u008fîÏyZ\u009c\\ÑP\u0087èß$\u001cl¥«\u0096m\u0006¾Ë<¾¢\u0083^Lø¸S\u0010$}\u0099¡\u001cË´\u00872n0Â½\u0084Ã\u0096";
                  var7 = "\r\u008fîÏyZ\u009c\\ÑP\u0087èß$\u001cl¥«\u0096m\u0006¾Ë<¾¢\u0083^Lø¸S\u0010$}\u0099¡\u001cË´\u00872n0Â½\u0084Ã\u0096".length();
                  var8 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var8);
            var10001 = 0;
         }
      }
   }

   private static Throwable getThrowable(Throwable var0) {
      return var0;
   }

   private static String buildString_2(byte[] var0) {
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

   private static String buildString_3(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6262;
      if (CONST_J[var3] == null) {
         Object[] var5;
         try {
            Long var4 = Thread.currentThread().getId();
            var5 = (Object[])CONST_K.get(var4);
            if (var5 == null) {
               var5 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               CONST_K.put(var4, var5);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rip/breeze/cp", var10);
         }

         byte[] var7 = new byte[8];
         var7[0] = (byte)(var1 >>> 56);

         for (int var8 = 1; var8 < 8; var8++) {
            var7[var8] = (byte)(var1 << var8 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var7);
         SecretKey var9 = ((SecretKeyFactory)var5[1]).generateSecret(var11);
         ((Cipher)var5[0]).init(2, var9, (IvParameterSpec)var5[2]);
         byte[] var6 = CONST_I[var3].getBytes("ISO-8859-1");
         CONST_J[var3] = buildString_2(((Cipher)var5[0]).doFinal(var6));
      }

      return CONST_J[var3];
   }

   private static Object getObject_2(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = buildString_3(var4, var5);
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
         throw new RuntimeException("rip/breeze/cp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
